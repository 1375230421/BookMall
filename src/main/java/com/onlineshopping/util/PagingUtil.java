package com.onlineshopping.util;

import java.util.ArrayList;
import java.util.List;

import com.onlineshopping.po.UserNum;

/* ��ҳ�Ĺ����࣬����һ�����ٸ�����ÿҳ�ֶ��ٸ�*/
public class PagingUtil {
	public List<UserNum> getNum(int num,int limit){
		num=(num+limit)/limit;
		List<UserNum> listNum = new ArrayList<UserNum>();
		for (int i = 1; i <= num; i++) {
			 UserNum userNum=new UserNum();
			 userNum.setNum(i);
			 listNum.add(userNum);
		}
		return listNum;	
	}
	
}
