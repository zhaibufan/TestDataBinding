package com.study.zhai.test;

/**
 * @author zhaixiaofan
 * @date 2020-06-07 09:55
 */
public class VpItemBean {

    private String desc;

    private int imgResId;

    private int testColorResId;

    private int isVisible;

    public int getTestColorResId() {
        return testColorResId;
    }

    public void setTestColorResId(int testColorResId) {
        this.testColorResId = testColorResId;
    }

    public int isVisible() {
        return isVisible;
    }

    public void setVisible(int visible) {
        isVisible = visible;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImgResId() {
        return imgResId;
    }

    public void setImgResId(int imgResId) {
        this.imgResId = imgResId;
    }
}
