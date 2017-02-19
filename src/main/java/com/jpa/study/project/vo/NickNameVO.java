package com.jpa.study.project.vo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by kimyongyeon on 2017-02-14.
 */
@Entity
@Data
public class NickNameVO {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;
}
