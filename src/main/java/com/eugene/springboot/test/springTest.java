package com.eugene.springboot.test;

import java.util.ArrayList;
import java.util.List;

import com.eugene.springboot.VO.requestInfoVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/rest")
public class springTest {

    @RequestMapping("/test")
    public String hello() throws Exception{

        return "Hello";
    }



}
