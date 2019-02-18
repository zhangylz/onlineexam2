package com.ylzh.onlineexam.entity;

import java.io.Serializable;
import java.util.Date;

public class BizArticleLook implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_article_look.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_article_look.article_id
     *
     * @mbggenerated
     */
    private Integer articleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_article_look.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_article_look.user_ip
     *
     * @mbggenerated
     */
    private String userIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_article_look.look_time
     *
     * @mbggenerated
     */
    private Date lookTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_article_look.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column biz_article_look.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table biz_article_look
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_article_look.id
     *
     * @return the value of biz_article_look.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_article_look.id
     *
     * @param id the value for biz_article_look.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_article_look.article_id
     *
     * @return the value of biz_article_look.article_id
     *
     * @mbggenerated
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_article_look.article_id
     *
     * @param articleId the value for biz_article_look.article_id
     *
     * @mbggenerated
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_article_look.user_id
     *
     * @return the value of biz_article_look.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_article_look.user_id
     *
     * @param userId the value for biz_article_look.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_article_look.user_ip
     *
     * @return the value of biz_article_look.user_ip
     *
     * @mbggenerated
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_article_look.user_ip
     *
     * @param userIp the value for biz_article_look.user_ip
     *
     * @mbggenerated
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_article_look.look_time
     *
     * @return the value of biz_article_look.look_time
     *
     * @mbggenerated
     */
    public Date getLookTime() {
        return lookTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_article_look.look_time
     *
     * @param lookTime the value for biz_article_look.look_time
     *
     * @mbggenerated
     */
    public void setLookTime(Date lookTime) {
        this.lookTime = lookTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_article_look.create_time
     *
     * @return the value of biz_article_look.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_article_look.create_time
     *
     * @param createTime the value for biz_article_look.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column biz_article_look.update_time
     *
     * @return the value of biz_article_look.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column biz_article_look.update_time
     *
     * @param updateTime the value for biz_article_look.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biz_article_look
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", articleId=").append(articleId);
        sb.append(", userId=").append(userId);
        sb.append(", userIp=").append(userIp);
        sb.append(", lookTime=").append(lookTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}