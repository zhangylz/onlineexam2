package com.ylzh.onlineexam.entity;

import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.question_type
     *
     * @mbggenerated
     */
    private Integer questionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.option_a
     *
     * @mbggenerated
     */
    private String optionA;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.option_b
     *
     * @mbggenerated
     */
    private String optionB;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.option_c
     *
     * @mbggenerated
     */
    private String optionC;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.option_d
     *
     * @mbggenerated
     */
    private String optionD;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.option_e
     *
     * @mbggenerated
     */
    private String optionE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.option_f
     *
     * @mbggenerated
     */
    private String optionF;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.score
     *
     * @mbggenerated
     */
    private Integer score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.difficulty
     *
     * @mbggenerated
     */
    private Integer difficulty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.subject_id
     *
     * @mbggenerated
     */
    private Integer subjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.exam_id
     *
     * @mbggenerated
     */
    private Integer examId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.answer
     *
     * @mbggenerated
     */
    private String answer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.parse
     *
     * @mbggenerated
     */
    private String parse;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table question
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.id
     *
     * @return the value of question.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.id
     *
     * @param id the value for question.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.title
     *
     * @return the value of question.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.title
     *
     * @param title the value for question.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.question_type
     *
     * @return the value of question.question_type
     *
     * @mbggenerated
     */
    public Integer getQuestionType() {
        return questionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.question_type
     *
     * @param questionType the value for question.question_type
     *
     * @mbggenerated
     */
    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.option_a
     *
     * @return the value of question.option_a
     *
     * @mbggenerated
     */
    public String getOptionA() {
        return optionA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.option_a
     *
     * @param optionA the value for question.option_a
     *
     * @mbggenerated
     */
    public void setOptionA(String optionA) {
        this.optionA = optionA == null ? null : optionA.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.option_b
     *
     * @return the value of question.option_b
     *
     * @mbggenerated
     */
    public String getOptionB() {
        return optionB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.option_b
     *
     * @param optionB the value for question.option_b
     *
     * @mbggenerated
     */
    public void setOptionB(String optionB) {
        this.optionB = optionB == null ? null : optionB.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.option_c
     *
     * @return the value of question.option_c
     *
     * @mbggenerated
     */
    public String getOptionC() {
        return optionC;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.option_c
     *
     * @param optionC the value for question.option_c
     *
     * @mbggenerated
     */
    public void setOptionC(String optionC) {
        this.optionC = optionC == null ? null : optionC.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.option_d
     *
     * @return the value of question.option_d
     *
     * @mbggenerated
     */
    public String getOptionD() {
        return optionD;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.option_d
     *
     * @param optionD the value for question.option_d
     *
     * @mbggenerated
     */
    public void setOptionD(String optionD) {
        this.optionD = optionD == null ? null : optionD.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.option_e
     *
     * @return the value of question.option_e
     *
     * @mbggenerated
     */
    public String getOptionE() {
        return optionE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.option_e
     *
     * @param optionE the value for question.option_e
     *
     * @mbggenerated
     */
    public void setOptionE(String optionE) {
        this.optionE = optionE == null ? null : optionE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.option_f
     *
     * @return the value of question.option_f
     *
     * @mbggenerated
     */
    public String getOptionF() {
        return optionF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.option_f
     *
     * @param optionF the value for question.option_f
     *
     * @mbggenerated
     */
    public void setOptionF(String optionF) {
        this.optionF = optionF == null ? null : optionF.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.score
     *
     * @return the value of question.score
     *
     * @mbggenerated
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.score
     *
     * @param score the value for question.score
     *
     * @mbggenerated
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.difficulty
     *
     * @return the value of question.difficulty
     *
     * @mbggenerated
     */
    public Integer getDifficulty() {
        return difficulty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.difficulty
     *
     * @param difficulty the value for question.difficulty
     *
     * @mbggenerated
     */
    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.subject_id
     *
     * @return the value of question.subject_id
     *
     * @mbggenerated
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.subject_id
     *
     * @param subjectId the value for question.subject_id
     *
     * @mbggenerated
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.exam_id
     *
     * @return the value of question.exam_id
     *
     * @mbggenerated
     */
    public Integer getExamId() {
        return examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.exam_id
     *
     * @param examId the value for question.exam_id
     *
     * @mbggenerated
     */
    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.create_time
     *
     * @return the value of question.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.create_time
     *
     * @param createTime the value for question.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.update_time
     *
     * @return the value of question.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.update_time
     *
     * @param updateTime the value for question.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.status
     *
     * @return the value of question.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.status
     *
     * @param status the value for question.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.content
     *
     * @return the value of question.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.content
     *
     * @param content the value for question.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.answer
     *
     * @return the value of question.answer
     *
     * @mbggenerated
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.answer
     *
     * @param answer the value for question.answer
     *
     * @mbggenerated
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.parse
     *
     * @return the value of question.parse
     *
     * @mbggenerated
     */
    public String getParse() {
        return parse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.parse
     *
     * @param parse the value for question.parse
     *
     * @mbggenerated
     */
    public void setParse(String parse) {
        this.parse = parse == null ? null : parse.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
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
        sb.append(", title=").append(title);
        sb.append(", questionType=").append(questionType);
        sb.append(", optionA=").append(optionA);
        sb.append(", optionB=").append(optionB);
        sb.append(", optionC=").append(optionC);
        sb.append(", optionD=").append(optionD);
        sb.append(", optionE=").append(optionE);
        sb.append(", optionF=").append(optionF);
        sb.append(", score=").append(score);
        sb.append(", difficulty=").append(difficulty);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", examId=").append(examId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", status=").append(status);
        sb.append(", content=").append(content);
        sb.append(", answer=").append(answer);
        sb.append(", parse=").append(parse);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}