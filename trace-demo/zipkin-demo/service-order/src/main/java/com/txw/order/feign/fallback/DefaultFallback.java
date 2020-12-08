package com.txw.order.feign.fallback;

import com.txw.order.feign.FeignStorageService;

public class DefaultFallback implements FeignStorageService {

    @Override
    public String storage() {
        System.out.println("当前访问人数过多，请稍后再试！");
        return "当前访问人数过多，请稍后再试！";
    }

}
