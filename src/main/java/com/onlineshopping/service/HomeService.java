package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.UserNum;

public interface HomeService {
	public List<Goods> commodityInformation(int li);					//��ҳ��ѯ��Ʒ
	public List<UserNum> getGoodsNum();
}
