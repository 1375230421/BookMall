package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.po.Goods;

public interface HomeMapper {
	public List<Goods> commodityInformation(int li);		//ȫ����Ϣ�Ĳ�ѯ
	public int getGoodsNum();	//��ѯ���ض���ҳ
}
