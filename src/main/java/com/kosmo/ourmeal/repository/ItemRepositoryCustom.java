package com.kosmo.ourmeal.repository;

import com.kosmo.ourmeal.dto.ItemSearchDto;
import com.kosmo.ourmeal.dto.MainItemDto;
import com.kosmo.ourmeal.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}


