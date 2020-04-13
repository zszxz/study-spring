package com.zszxz.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author lsc
 * <p> 毛毯</p>
 */
public class Blanket {

    // 颜色
    private String color;
    // 长度
    private String length;

    // 构造器注入
    private Cotton cotton;
    @Autowired
    public Blanket(Cotton cotton){
        this.cotton = cotton;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Cotton getCotton() {
        return cotton;
    }

    public void setCotton(Cotton cotton) {
        this.cotton = cotton;
    }
}
