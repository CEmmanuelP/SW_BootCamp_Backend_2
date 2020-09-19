//package com.eugene.springboot.controller;
//
//import com.eugene.springboot.DAO.requestInfoDAO;
//import com.eugene.springboot.VO.requestInfoVO;
//
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//
//@RestController
//@MapperScan(basePackages = "com.eugene.springboot.DAO")
//public class requestController {
//
//    @Autowired
//    private requestInfoDAO infoDAO;
//
//    @RequestMapping("/info")
//    public List<requestInfoVO> info() throws Exception{
//        final requestInfoVO vo = new requestInfoVO(1, "L", "AAA", "2009181620");
//        final List<requestInfoVO> infoList = infoDAO.selectInfo(vo);
//        return infoList;
//    }
//}
