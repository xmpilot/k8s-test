package com.labcloud.k8stest;

import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 苏建锋
 * @Date 2018/12/7 15:32
 **/
@RestController
public class K8sTestController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello !!! k8s !!!";
    }
}
