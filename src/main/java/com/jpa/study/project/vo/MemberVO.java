package com.jpa.study.project.vo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by yongyeonkim on 2017. 2. 5..
 */
@Entity
@Data
public class MemberVO {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String userId;

    @Column
    private String userPassWd;

    @Column
    private String userName;

    @Column
    private String userPhone;

}
