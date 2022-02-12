package com.kosmo.ourmeal.dto;

import com.kosmo.ourmeal.constant.PCategory;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDto {

    private Long id;

    private String itemNm;

    private Integer price;

    private String itemDetail;

    private String sellStatCd;

    private LocalDateTime regTime;

    private LocalDateTime updateTime;

    private PCategory pCategory;      // 상품 분류        (+).추가!

}