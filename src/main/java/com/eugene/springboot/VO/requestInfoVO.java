package com.eugene.springboot.VO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class requestInfoVO {

    private Integer requestID;
    private String requestCode;
    private String userID;
    private String createDate;

}
