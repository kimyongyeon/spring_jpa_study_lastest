package com.jpa.study.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by yongyeonkim on 2017. 2. 19..
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberListDTO {
    private Long number;
    private String userId;
    private String userPass;
    private String userName;
    private String userPhone;
    private String userAddr;

}
