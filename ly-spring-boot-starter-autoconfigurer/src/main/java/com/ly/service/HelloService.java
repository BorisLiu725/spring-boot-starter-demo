package com.ly.service;

import com.ly.properties.HelloProperties;

public class HelloService {

    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String name){
        return helloProperties.getPrefix() + "-hahah" + name + "-"
                + helloProperties.getSuffix();
    }

}
