package com.zl.apollo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wangzhongling@kkworld.com
 * @date 2021/12/27
 */
@RestController
public class HelloController {


    private static Logger logger = LoggerFactory.getLogger( HelloController.class );

    @Value( "${server.port}" )
    String port;

    @GetMapping("hi")
    public String hi(String name) {

        logger.debug( "debug log..." );
        logger.info( "info log..." );
        logger.warn( "warn log..." );

        return "hi " + name + " ,i am from port:" + port;
    }
}
