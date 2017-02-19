package com.jpa.study.project.vo;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by yongyeonkim on 2017. 2. 5..
 */
@Entity
@Data
@AttributeOverrides({ // 컬럼 재정의
        @AttributeOverride(name="regDate", column = @Column(name="memberRegDate")),
        @AttributeOverride(name="upDate", column = @Column(name="memberUpDate"))
})
public class MemberVO extends DateVO{
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String userId; // 아이디

    @Column
    private String userPassWd; // 비밀번호

    @Column
    private String userName; // 이름

    @Column
    private String userPhone; // 폰

    @Column
    private boolean sex; // 성별

    @Column
    private String addr; // 주소

    @Column
    private Long nickId; // 닉네임 아이디

    @Column
    private Long commonId; // 공통 코드 테이블 아이디


}
