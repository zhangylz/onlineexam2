package com.ylzh.onlineexam.mapper;
import com.ylzh.onlineexam.util.MapperUtil;
import com.ylzh.onlineexam.entity.Question;
import com.ylzh.onlineexam.vo.QuestionConditionVO;

import java.util.List;

public interface QuestionMapper extends MapperUtil<Question> {

    /**
     * 分页查询，关联查询问题类型
     * @param vo
     * @return
     */
    List<Question> findByCondition(QuestionConditionVO vo);

    /**
     * 根据id查询题目
     * @param id
     * @return
     */
    Question selectById(Integer id);

    /**
     * 批量删除问题
     * @param ids
     * @return
     */
    int deleteBatch(Integer[] ids);

}