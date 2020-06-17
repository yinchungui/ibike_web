package com.yc.projects.yc74ibike.bean;

import java.io.Serializable;

public class Bike implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long bid;
    private int status;
    private String qrcode;
    private Double latitude;
    private Double longitude;

    /**
     * 0未启用
     */
    public static final int UNACTIVE=0;

    /**
     * 1启用但未解锁
     */
    public static final int LOCK=1;
    /**
     * 2开锁使用中
     */
    public static final int USING=2;
    /**
     * 3报修
     */
    public static final int INTROUBLE=3;

    public Long getBid() {
        return bid;
    }

    public int getStatus() {
        return status;
    }

    public String getQrcode() {
        return qrcode;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
