package com.jpa.study.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by kimyongyeon on 2017-02-14.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchDTO {
    private String title; // 제목
    private String searchOpt; // select 검색 조건
    private boolean isNum; // 순번
    private boolean isPhone; // 전화번호
    private boolean isAddr; // 주소
}
