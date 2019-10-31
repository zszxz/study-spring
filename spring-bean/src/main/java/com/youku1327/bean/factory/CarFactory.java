package com.youku1327.bean.factory;

import com.youku1327.bean.entity.Car;

/**
 * @Author lsc
 * @Description <p> </p>
 * @Date 2019/10/31 15:00
 */
public class CarFactory {

    private static Car car = new Car();

    private CarFactory(){

    }

    public Car createCarInstance(){
        return car;
    }
}
