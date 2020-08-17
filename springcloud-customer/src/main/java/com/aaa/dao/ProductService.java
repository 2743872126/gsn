package com.aaa.dao;

import com.aaa.dao.impl.ProductServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// 客户端服务：向服务器端发送器请求，调用接口
@FeignClient(value = "cloud-zull",fallback = ProductServiceImpl.class)
public interface ProductService {
    // 映射请求路径：请求服务端的接口路径
    @RequestMapping("/pta/user/getUser")
    String a();

    @RequestMapping("/ptb/user/select")
    String select();
}
