package com.koreait.apart;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.koreait.apart.dto.ItemDTO;

@Mapper
public interface HomeMapper {
	public List<LocationCdVO> selLocationCdList();
	public List<ApartInfoVO> selApartmentInfoList(SearchVO param);
	public int insApartmentInfo(ItemDTO p);
}
