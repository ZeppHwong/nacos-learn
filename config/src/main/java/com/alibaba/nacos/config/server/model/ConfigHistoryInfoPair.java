/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.config.server.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * ConfigHistoryInfoPair.
 *
 * @author dirtybit
 */
public class ConfigHistoryInfoPair implements Serializable {

    private static final long serialVersionUID = -7827521105376245603L;

    @JsonSerialize(using = ToStringSerializer.class)
    private long id;

    private long lastId = -1;

    private String dataId;

    private String group;

    private String tenant;

    private String appName;

    private String md5;

    private String content;

    private String updatedMd5;

    private String updatedContent;

    private String srcIp;

    private String srcUser;

    /**
     * Operation type, include inserting, updating and deleting.
     */
    private String opType;

    private String publishType;

    private String grayName;

    private String extInfo;

    private Timestamp createdTime;

    private Timestamp lastModifiedTime;

    private String encryptedDataKey;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLastId() {
        return lastId;
    }

    public void setLastId(long lastId) {
        this.lastId = lastId;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUpdatedMd5() {
        return updatedMd5;
    }

    public void setUpdatedMd5(String updatedMd5) {
        this.updatedMd5 = updatedMd5;
    }

    public String getUpdatedContent() {
        return updatedContent;
    }

    public void setUpdatedContent(String updatedContent) {
        this.updatedContent = updatedContent;
    }

    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    public String getSrcUser() {
        return srcUser;
    }

    public void setSrcUser(String srcUser) {
        this.srcUser = srcUser;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public String getPublishType() {
        return publishType;
    }

    public void setPublishType(String publishType) {
        this.publishType = publishType;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public Timestamp getCreatedTime() {
        return new Timestamp(createdTime.getTime());
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = new Timestamp(createdTime.getTime());
    }

    public Timestamp getLastModifiedTime() {
        return new Timestamp(lastModifiedTime.getTime());
    }

    public void setLastModifiedTime(Timestamp lastModifiedTime) {
        this.lastModifiedTime = new Timestamp(lastModifiedTime.getTime());
    }

    public String getGrayName() {
        return grayName;
    }

    public void setGrayName(String grayName) {
        this.grayName = grayName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getEncryptedDataKey() {
        return encryptedDataKey;
    }

    public void setEncryptedDataKey(String encryptedDataKey) {
        this.encryptedDataKey = encryptedDataKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigHistoryInfoPair that = (ConfigHistoryInfoPair) o;
        return id == that.id && lastId == that.lastId && Objects.equals(dataId, that.dataId) && Objects.equals(group,
                that.group) && Objects.equals(tenant, that.tenant) && Objects.equals(appName, that.appName)
                && Objects.equals(md5, that.md5) && Objects.equals(content, that.content) && Objects.equals(updatedMd5,
                that.updatedMd5) && Objects.equals(updatedContent, that.updatedContent) && Objects.equals(srcIp,
                that.srcIp) && Objects.equals(srcUser, that.srcUser) && Objects.equals(opType, that.opType)
                && Objects.equals(createdTime, that.createdTime) && Objects.equals(lastModifiedTime,
                that.lastModifiedTime) && Objects.equals(encryptedDataKey, that.encryptedDataKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastId, dataId, group, tenant, appName, md5, content, updatedMd5, updatedContent, srcIp,
                srcUser, opType, createdTime, lastModifiedTime, encryptedDataKey);
    }

}