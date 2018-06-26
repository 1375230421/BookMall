package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.po.Goods;

public interface HomeMapper {
	public List<Goods> commodityInformation(int li);		//全部信息的查询
	public int getGoodsNum();	//查询返回多少页
	public List<Goods> findGoodsByTId(int tID,int li);//根据类别查询
}
