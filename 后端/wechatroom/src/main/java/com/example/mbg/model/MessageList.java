package com.example.mbg.model;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
@TableName("/message_list")
public class MessageList implements Serializable {

    private Integer messageListId;
    private String messageHeadline;
    private String messageContent;
    private Date messageSt;
    private String messagePattern;
    private String messageIcon;

    private static final long serialVersionUID = 1L;

    public Integer getMessageListId() {
        return messageListId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_list.message_list_id
     *
     * @param messageListId the value for message_list.message_list_id
     *
     * @mbggenerated Tue Mar 22 15:50:19 CST 2022
     */
    public void setMessageListId(Integer messageListId) {
        this.messageListId = messageListId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_list.message_headline
     *
     * @return the value of message_list.message_headline
     *
     * @mbggenerated Tue Mar 22 15:50:19 CST 2022
     */
    public String getMessageHeadline() {
        return messageHeadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_list.message_headline
     *
     * @param messageHeadline the value for message_list.message_headline
     *
     * @mbggenerated Tue Mar 22 15:50:19 CST 2022
     */
    public void setMessageHeadline(String messageHeadline) {
        this.messageHeadline = messageHeadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_list.message_content
     *
     * @return the value of message_list.message_content
     *
     * @mbggenerated Tue Mar 22 15:50:19 CST 2022
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_list.message_content
     *
     * @param messageContent the value for message_list.message_content
     *
     * @mbggenerated Tue Mar 22 15:50:19 CST 2022
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_list.message_st
     *
     * @return the value of message_list.message_st
     *
     * @mbggenerated Tue Mar 22 15:50:19 CST 2022
     */
    public Date getMessageSt() {
        return messageSt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_list.message_st
     *
     * @param messageSt the value for message_list.message_st
     *
     * @mbggenerated Tue Mar 22 15:50:19 CST 2022
     */
    public void setMessageSt(Date messageSt) {
        this.messageSt = messageSt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_list.message_pattern
     *
     * @return the value of message_list.message_pattern
     *
     * @mbggenerated Tue Mar 22 15:50:19 CST 2022
     */
    public String getMessagePattern() {
        return messagePattern;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_list.message_pattern
     *
     * @param messagePattern the value for message_list.message_pattern
     *
     * @mbggenerated Tue Mar 22 15:50:19 CST 2022
     */
    public void setMessagePattern(String messagePattern) {
        this.messagePattern = messagePattern;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_list.message_icon
     *
     * @return the value of message_list.message_icon
     *
     * @mbggenerated Tue Mar 22 15:50:19 CST 2022
     */
    public String getMessageIcon() {
        return messageIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_list.message_icon
     *
     * @param messageIcon the value for message_list.message_icon
     *
     * @mbggenerated Tue Mar 22 15:50:19 CST 2022
     */
    public void setMessageIcon(String messageIcon) {
        this.messageIcon = messageIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_list
     *
     * @mbggenerated Tue Mar 22 15:50:19 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageListId=").append(messageListId);
        sb.append(", messageHeadline=").append(messageHeadline);
        sb.append(", messageContent=").append(messageContent);
        sb.append(", messageSt=").append(messageSt);
        sb.append(", messagePattern=").append(messagePattern);
        sb.append(", messageIcon=").append(messageIcon);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}