package com.example.javaproject2.week4.d4;

public class Address {
    private String fullAddr;    // 전체 주소 데이터
    private String sido;        // 시도 데이터
    private String sigungu;     // 시, 군, 구 데이터

    public Address (String fullAddr, String sido, String sigungu) {
        this.fullAddr = fullAddr;
        this.sido = sido;
        this.sigungu = sigungu;
    }

    public String getFullAddr(){
        return fullAddr;
    }

    public String getSido(){
        return sido;
    }

    public String getSigungu(){
        return sigungu;
    }
}
