package com.baeldung.springBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConstructorInjectionShopController{

    private ShopService shopService;

    @Autowired
    public ConstructorInjectionShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @RequestMapping("/constructor")
    @ResponseBody
    public String getShopName(){
        return shopService.getShopName();
    }
}