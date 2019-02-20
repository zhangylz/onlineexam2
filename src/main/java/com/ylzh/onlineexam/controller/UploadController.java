package com.ylzh.onlineexam.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ylzh.onlineexam.enmus.SysConfigKey;
import com.ylzh.onlineexam.exception.UploadFileNotFoundException;
import com.ylzh.onlineexam.service.SysConfigService;
import com.ylzh.onlineexam.util.CoreConst;
import com.ylzh.onlineexam.util.MD5;
import com.ylzh.onlineexam.util.QiNiuYunUtil;
import com.ylzh.onlineexam.util.ResultUtil;
import com.ylzh.onlineexam.vo.CloudStorageConfigVO;
import com.ylzh.onlineexam.vo.UploadResponse;
import com.ylzh.onlineexam.vo.base.ResponseVO;
import com.google.gson.Gson;

@Controller
@RequestMapping("/upload")
public class UploadController{
    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

    @Autowired
    private SysConfigService sysConfigService;
    @ResponseBody
    @PostMapping(value = "/upload")
    public UploadResponse upload(@RequestParam(value = "file", required = false) MultipartFile file) throws Exception{
        if (file == null || file.isEmpty()) {
            throw new UploadFileNotFoundException(UploadResponse.Error.FILENOTFOUND);
        }
        try {
            String originalFilename = file.getOriginalFilename();
            String suffix = originalFilename.substring(originalFilename.lastIndexOf(".")).toLowerCase();
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
            /*String dir = fmt.format(new Date());*/
            String value = sysConfigService.selectAll().get(SysConfigKey.CLOUD_STORAGE_CONFIG.getValue());
            Gson gson = new Gson();
            CloudStorageConfigVO cloudStorageConfig = gson.fromJson(value,CloudStorageConfigVO.class);
            String dir =cloudStorageConfig.getQiniuPrefix();
            String md5 = MD5.getMessageDigest(file.getBytes());
            String filePath = String.format("%1$s/%2$s%3$s", dir, md5, suffix);
            ResponseVO responseVo = QiNiuYunUtil.writeFile(cloudStorageConfig,filePath,file.getBytes());
            /*String fileName = String.format("%1$s%2$s", md5, suffix);*/
            String qiniuDomain = cloudStorageConfig.getQiniuDomain();
            String url = String.format("%1$s/%2$s", qiniuDomain, filePath);
            if(responseVo.getStatus().equals(CoreConst.SUCCESS_CODE)){
              /*  File sysFile = new File();
                sysFile.setName(originalFilename);
                sysFile.setSize(file.getSize()+"");
                sysFile.setType(suffix);
                sysFile.setUrl(url);
                sysFile.setRelUrl(filePath);
                sysFile.setCreateTime(new Date());
                fileService.insertFile(sysFile);*/
                return  new UploadResponse(url,originalFilename, suffix, url, CoreConst.SUCCESS_CODE);
            }else{
                return  new UploadResponse(originalFilename,  CoreConst.FAIL_CODE,responseVo.getMsg());
            }
        } catch (Exception e) {
            logger.error(String.format("UploadController.upload%s", e));
            throw e;
        }
    }
    @ResponseBody
    @PostMapping("/upload2QiniuForMd")
    public Object upload2QiniuForMd(@RequestParam("file") MultipartFile file) throws IOException {
        if (file == null || file.isEmpty()) {
            throw new UploadFileNotFoundException(UploadResponse.Error.FILENOTFOUND);
        }
        try {
            String originalFilename = file.getOriginalFilename();
            String suffix = originalFilename.substring(originalFilename.lastIndexOf(".")).toLowerCase();
            String value = sysConfigService.selectAll().get(SysConfigKey.CLOUD_STORAGE_CONFIG.getValue());
            Gson gson = new Gson();
            CloudStorageConfigVO cloudStorageConfig = gson.fromJson(value,CloudStorageConfigVO.class);
            String dir =cloudStorageConfig.getQiniuPrefix();
            String md5 = MD5.getMessageDigest(file.getBytes());
            String filePath = String.format("%1$s/%2$s%3$s", dir, md5, suffix);
            ResponseVO responseVo = QiNiuYunUtil.writeFile(cloudStorageConfig,filePath,file.getBytes());
            String qiniuDomain = cloudStorageConfig.getQiniuDomain();
            String url = String.format("%1$s/%2$s", qiniuDomain, filePath);
            if(responseVo.getStatus().equals(CoreConst.SUCCESS_CODE)){
                Map<String, Object> resultMap = new HashMap<>(3);
                resultMap.put("success", 1);
                resultMap.put("message", "上传成功");
                resultMap.put("filename", url);
                return resultMap;
            }else{
                return  new UploadResponse(originalFilename,  CoreConst.FAIL_CODE, responseVo.getMsg());
            }
        } catch (Exception e) {
            logger.error(String.format("UploadController.upload%s", e));
            throw e;
        }
    }

    @GetMapping(value = "/config")
    public String config(Model model){
        String value = sysConfigService.selectAll().get(SysConfigKey.CLOUD_STORAGE_CONFIG.getValue());
        Gson gson = new Gson();
        CloudStorageConfigVO cloudStorageConfig = gson.fromJson(value,CloudStorageConfigVO.class);
        model.addAttribute("cloudStorageConfig",cloudStorageConfig);
        return "upload/config";
    }

    @ResponseBody
    @PostMapping(value = "/saveConfig")
    public ResponseVO saveConfig(CloudStorageConfigVO cloudStorageConfig){
        Gson gson = new Gson();
        String value = gson.toJson(cloudStorageConfig);
        int a = sysConfigService.updateByKey(SysConfigKey.CLOUD_STORAGE_CONFIG.getValue(),value);
        if (a > 0) {
            return ResultUtil.success("云存储配置保存成功！");
        } else {
            return ResultUtil.error("云存储配置保存失败！");
        }

    }

}
