package com.eugene.springboot.VO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class requestInfoVO {

    private Integer requestID;
    private String requestCode;
    private String userID;
    private String createDate;

}
