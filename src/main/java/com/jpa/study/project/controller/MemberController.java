package com.jpa.study.project.controller;

import com.jpa.study.project.dto.MemberListDTO;
import com.jpa.study.project.dto.SearchDTO;
import com.jpa.study.project.respository.MemberRepository;
import com.jpa.study.project.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yongyeonkim on 2017. 2. 5..
 */
@Controller
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 회원 가입 / 수정
     * @param memberVO
     * @return
     */
    @RequestMapping(value = "/memberJoin", method = RequestMethod.POST)
    @ResponseBody
    public Map memberJoin(@ModelAttribute("memberVO") MemberVO memberVO) {
        System.out.println(memberVO);
        memberRepository.save(memberVO);
        Map returnMap = new HashMap();
        returnMap.put("code", true);
        return returnMap;
    }

    /**
     * 회원 삭제
     * @param id
     * @return
     */
    @RequestMapping(value = "/memberDelete", method = RequestMethod.POST)
    @ResponseBody
    public Map memberDelete(Long id) {
        memberRepository.delete(id);
        Map returnMap = new HashMap();
        returnMap.put("code", true);
        return returnMap;
    }

    /**
     * 회원 목록
     * @return
     */
    @RequestMapping(value = "/memberList")
    @ResponseBody
    public Map memberList(@ModelAttribute("searchDTO")SearchDTO searchDTO) {
        Map rMap = new HashMap();

        List list = new ArrayList<MemberListDTO>();

        memberRepository.findAll().stream().map((member) -> {
           MemberListDTO memberListDTO = new MemberListDTO();
            memberListDTO.setUserName(member.getUserName());
            list.add(memberListDTO);
            return member.getId();
        });

        rMap.put("mList", list);
        return rMap;
    }

    /**
     * 회원 상세
     * @param id
     * @return
     */
    @RequestMapping(value = "/memberOne")
    @ResponseBody
    public Map memberOne(Long id) {
        Map rMap = new HashMap();
        rMap.put("mOne", memberRepository.findOne(id));
        return rMap;
    }

    /**
     * 회원 상제
     * @param id
     * @return
     */
    @RequestMapping(value = "/memberPathOne/{id}")
    @ResponseBody
    public Map memberPathOne(@PathVariable Long id) {
        Map rMap = new HashMap();
        rMap.put("mOne", memberRepository.findOne(id));
        return rMap;
    }



}
