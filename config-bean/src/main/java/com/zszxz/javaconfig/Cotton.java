package com.zszxz.javaconfig;

import org.springframework.stereotype.Component;

/**
 * @Author lsc
 * <p>棉被 </p>
 */
public class Cotton {

    // 质量
    private String quality;

    public void product(){
        System.out.println("cotton生产与中国");
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
