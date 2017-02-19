package com.jpa.study.project.vo;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by yongyeonkim on 2017. 2. 5..
 */
// 테이블과 매핑하지 않고 자식 클래스에 엔티티의 매핑 정보를 상속하기 위해 사용한다.
// 엔티티가 아니므로 em.find()나 jPQL에서 사용할 수 없다.
// 이 클래스를 직접 생성해서 사용할 일은 거의 없으므로 추상 클래스로 만드는것을 권장한다.
@MappedSuperclass // 속성만 부모 클래스에서 넣기 위함.
@Data
public abstract class DateVO {
    private Date regDate; // 등록일자
    private Date upDate; // 수정일자
    private Date DelDate; // 삭제일자
    private String writer; // 등록자
    private String updater; // 수정자
}
