package com.jpa.study.project.vo;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by kimyongyeon on 2017-02-14.
 */
@Entity
@Data
public class NickNameVO extends DateVO{
    @Id
    @GeneratedValue
    @Column(name = "nick_id") // 아직 사용 안함.
    private Long id;

    @ManyToOne
    @JoinColumn(name="member_id")
    private MemberVO memberVO;

    @Column
    private String name;
}
