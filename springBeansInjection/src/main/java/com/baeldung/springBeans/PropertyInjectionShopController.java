package com.baeldung.springBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PropertyInjectionShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping("/property")
    @ResponseBody
    public String getShopName(){
        return shopService.getShopName();
    }
}