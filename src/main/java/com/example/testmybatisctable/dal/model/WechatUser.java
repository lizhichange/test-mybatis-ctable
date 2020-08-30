package com.example.testmybatisctable.dal.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "wechat_user")
public class WechatUser {
    @IsKey
    @IsAutoIncrement
    @Column
    private Long id;

    @Column(name = "app_id", type = MySqlTypeConstant.VARCHAR, length = 11)

    private String appid;
    @Column(name = "open_id", type = MySqlTypeConstant.VARCHAR, length = 11)

    private String openId;
    @Column(name = "app_open_id", type = MySqlTypeConstant.VARCHAR, length = 11)

    private String appOpenId;
    @Column(name = "open_id_type", type = MySqlTypeConstant.VARCHAR, length = 11)

    private String openidType;
    @Column(name = "user_id", type = MySqlTypeConstant.VARCHAR, length = 11)

    private String userId;
    @Column(name = "unionid", type = MySqlTypeConstant.VARCHAR, length = 11)

    private String unionid;
    @Column(name = "subscribe", type = MySqlTypeConstant.VARCHAR, length = 11)

    private String subscribe;
    @Column(name = "subscribe_time", type = MySqlTypeConstant.DATETIME)
    private Date subscribeTime;

    @Column(name = "gmt_create", type = MySqlTypeConstant.DATETIME)
    private Date gmtCreate;

    @Column(name = "gmt_modified", type = MySqlTypeConstant.DATETIME)
    private Date gmtModified;

    @Column(name = "disable", type = MySqlTypeConstant.INT, length = 20)
    private Integer disable;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getAppOpenId() {
        return appOpenId;
    }

    public void setAppOpenId(String appOpenId) {
        this.appOpenId = appOpenId == null ? null : appOpenId.trim();
    }

    public String getOpenidType() {
        return openidType;
    }

    public void setOpenidType(String openidType) {
        this.openidType = openidType == null ? null : openidType.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe == null ? null : subscribe.trim();
    }

    public Date getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getDisable() {
        return disable;
    }

    public void setDisable(Integer disable) {
        this.disable = disable;
    }
}