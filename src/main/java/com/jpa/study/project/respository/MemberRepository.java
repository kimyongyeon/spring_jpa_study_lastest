package com.jpa.study.project.respository;

import com.jpa.study.project.vo.MemberVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by yongyeonkim on 2017. 2. 5..
 */
@Repository
public interface MemberRepository extends JpaRepository<MemberVO, Long>{

     MemberVO findByUserId(@Param("userId") String userId);

}
