package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.OrderDetail;

public interface ProductionService {
	public Goods findGoodsById(int gdID);/*��ѯ��Ʒ��Ϣ*/
	public List<OrderDetail> score(int gdID);/*��ѯ����*/
}
