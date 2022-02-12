package com.kosmo.ourmeal.dto;

import com.kosmo.ourmeal.constant.ItemSellStatus;
import com.kosmo.ourmeal.constant.PCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSearchDto {


    private String searchDateType;

    private ItemSellStatus searchSellStatus;

    private String searchBy;

    private String searchQuery = "";

    private PCategory searchPCategory; /**  카테고리 별 검색 추가 */

}

