package com.ccsu.community.model;

public class LikeUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column like_user.id
     *
     * @mbg.generated Mon Apr 13 01:12:05 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column like_user.user_id
     *
     * @mbg.generated Mon Apr 13 01:12:05 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column like_user.comment_id
     *
     * @mbg.generated Mon Apr 13 01:12:05 CST 2020
     */
    private Long commentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column like_user.id
     *
     * @return the value of like_user.id
     *
     * @mbg.generated Mon Apr 13 01:12:05 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column like_user.id
     *
     * @param id the value for like_user.id
     *
     * @mbg.generated Mon Apr 13 01:12:05 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column like_user.user_id
     *
     * @return the value of like_user.user_id
     *
     * @mbg.generated Mon Apr 13 01:12:05 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column like_user.user_id
     *
     * @param userId the value for like_user.user_id
     *
     * @mbg.generated Mon Apr 13 01:12:05 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column like_user.comment_id
     *
     * @return the value of like_user.comment_id
     *
     * @mbg.generated Mon Apr 13 01:12:05 CST 2020
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column like_user.comment_id
     *
     * @param commentId the value for like_user.comment_id
     *
     * @mbg.generated Mon Apr 13 01:12:05 CST 2020
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
}