package com.baeldung.springBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SetterInjectionShopController{

    private ShopService shopService;

    // Setter-based injection
    @Autowired(required = false)
    public void setShopService(ShopService service) {
        this.shopService = service;
    }

    @RequestMapping("/setter")
    @ResponseBody
    public String getShopName(){
        return shopService.getShopName();
    }
}