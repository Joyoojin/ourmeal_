package com.kosmo.ourmeal.dto;

import com.kosmo.ourmeal.entity.ItemImg;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter @Setter
public class ItemImgDto {

    private static ModelMapper modelMapper = new ModelMapper();
    private Long id;
    private String imgName;
    private String oriImgName;
    private String imgUrl;
    private String repImgYn; //대표이미지여부

    public static ItemImgDto of(ItemImg itemImg) {
        return modelMapper.map(itemImg,ItemImgDto.class);
    }

}