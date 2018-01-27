package com.htnsoft.customlistview;

/**
 * Created by TRUNG VAN on 1/27/2018.
 */

public class TraiCay {
    private String Ten;
    private String MoTa;
    private Integer Hinh;

    public TraiCay(String ten, String moTa, Integer hinh) {
        Ten = ten;
        MoTa = moTa;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public Integer getHinh() {
        return Hinh;
    }

    public void setHinh(Integer hinh) {
        Hinh = hinh;
    }
}
