package com.ccsu.community.model;

public class Verify {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column verify.id
     *
     * @mbg.generated Sat Apr 25 10:16:12 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column verify.account_id
     *
     * @mbg.generated Sat Apr 25 10:16:12 CST 2020
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column verify.verify_code
     *
     * @mbg.generated Sat Apr 25 10:16:12 CST 2020
     */
    private Integer verifyCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column verify.id
     *
     * @return the value of verify.id
     *
     * @mbg.generated Sat Apr 25 10:16:12 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column verify.id
     *
     * @param id the value for verify.id
     *
     * @mbg.generated Sat Apr 25 10:16:12 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column verify.account_id
     *
     * @return the value of verify.account_id
     *
     * @mbg.generated Sat Apr 25 10:16:12 CST 2020
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column verify.account_id
     *
     * @param accountId the value for verify.account_id
     *
     * @mbg.generated Sat Apr 25 10:16:12 CST 2020
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column verify.verify_code
     *
     * @return the value of verify.verify_code
     *
     * @mbg.generated Sat Apr 25 10:16:12 CST 2020
     */
    public Integer getVerifyCode() {
        return verifyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column verify.verify_code
     *
     * @param verifyCode the value for verify.verify_code
     *
     * @mbg.generated Sat Apr 25 10:16:12 CST 2020
     */
    public void setVerifyCode(Integer verifyCode) {
        this.verifyCode = verifyCode;
    }
}