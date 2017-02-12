package com.jpa.study.project.controller;

import com.jpa.study.project.respository.MemberRepository;
import com.jpa.study.project.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yongyeonkim on 2017. 2. 5..
 */
@Controller
public class LoginController {

    @Autowired
    MemberRepository memberRepository;

    private static final String LOGIN_URL  = "redirect:/login.html";
    private static final String BASE_URL  = "redirect:/";

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    private boolean isLogin(MemberVO memberVO2, MemberVO memberVO) {
        return (memberVO2.getUserId().equals(memberVO.getUserId()) && memberVO2.getUserPassWd().equals(memberVO.getUserPassWd())) ? true : false;
    }

    @RequestMapping(value = "/loginProc", method = RequestMethod.POST)
    public String loginProc(@ModelAttribute("memberVO") MemberVO memberVO) {

        System.out.println(memberVO);

        // member create
//        memberCreate();

        MemberVO memberVO2 = memberRepository.findByUserId(memberVO.getUserId());
        if(memberVO2 == null ) {
            return LOGIN_URL;
        } else {
            if(isLogin(memberVO2, memberVO)) {
                return BASE_URL;
            } else{
                return LOGIN_URL;
            }
        }

//        if(memberVO.getUserid().equals("user@me.com") && memberVO.getUserpasswd().equals("1234")) {
//            // redirect : index
//            return "redirect:/";
//        }
//        return "redirect:/login";
    }

//    private void memberCreate() {
//        // test data
//        MemberVO memberVO1 = new MemberVO();
//        memberVO1.setUserId("user01@me.com");
//        memberVO1.setUserPassWd("1234");
//        memberRepository.save(memberVO1);
//
//    }

}
