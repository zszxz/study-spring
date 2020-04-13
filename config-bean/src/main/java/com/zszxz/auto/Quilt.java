package com.zszxz.auto;

import org.springframework.stereotype.Component;

/**
 * @Author lsc
 * <p>棉被 </p>
 */
@Component
public class Quilt {

    // 质量
    private String quality;

    public void product(){
        System.out.println("生产与中国");
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
