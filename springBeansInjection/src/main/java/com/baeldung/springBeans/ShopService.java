package com.baeldung.springBeans;

import org.springframework.stereotype.Service;

@Service
public class ShopService {

    public String getShopName() {
        return "CoolShopName";
    }
}
