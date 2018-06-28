package com.onlineshopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.UserNum;
import com.onlineshopping.service.HomeService;
import com.onlineshopping.service.UserService;

@Controller
//ï¿½ï¿½Ò³
public class HomeController {
	@Autowired
	HomeService homeService;
	//ï¿½ï¿½Ê¾ï¿½ï¿½Æ·ï¿½ï¿½Ï¢
	   @RequestMapping(value ="commodityInformation")
	   public String displayCommodity(HttpServletRequest request,Integer li){
		   List<UserNum> listNum=homeService.getGoodsNum();			/*ï¿½ï¿½Ñ¯ï¿½Ð¶ï¿½ï¿½ï¿½Ò³*/
		   request.setAttribute("listNum",listNum);					/*listnumÒ»ï¿½ï¿½ï¿½Ð¶ï¿½ï¿½ï¿½Ò³ï¿½ï¿½Îªï¿½ï¿½ï¿½ï¿½Îª2Ò³ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½jspÒ³ï¿½ï¿½*/			
		   if(li==null&&li==0){
			   li=1;
		   }
		   request.setAttribute("li", li);							/*liÎªï¿½ï¿½ï¿½ï¿½Ò³ï¿½ï¿½ï¿½ï¿½ï¿½Ò»ï¿½Î½ï¿½ï¿½ï¿½Îªï¿½ï¿½*/
		   List<Goods> list=homeService.commodityInformation(li);	/*ï¿½ï¿½Ò³ï¿½ï¿½Ñ¯*/
		   System.out.println(list);
		   request.setAttribute("list", list);						/*listÎªï¿½ï¿½Æ·ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½Ç°ï¿½ï¿½*/
		   return "home";   
	   }
	   //¸ù¾ÝÊé¼®Àà±ðÏÔÊ¾
	   @RequestMapping(value="homeType")
	   public String homeType(HttpServletRequest request,Integer tID,Integer li){
		   System.out.println("11111111111111111111111111");
		   List<UserNum> listNum=homeService.getGoodsNum();			/*²éÑ¯ÓÐ¶àÉÙÒ³*/
		   System.out.println(listNum+"22222222222222");
		   request.setAttribute("listNum",listNum);					/*listnumÒ»¹²ÓÐ¶àÉÙÒ³£¬ÎªÏÖÔÚÎª2Ò³£¬´«¸øjspÒ³Ãæ*/			
		   if(li==null){
			   li=1;
		   }
		   System.out.println(li+"     111111111111111111111111");
		   System.out.println(li+"     tid");
		   request.setAttribute("li", li);							/*liÎª¶àÉÙÒ³Èç¹ûµÚÒ»´Î½øÈëÎª¿Õ*/
		   List<Goods> list=homeService.findGoodsByTId(tID, li);/*·ÖÒ³²éÑ¯*/
		   System.out.println(list);
		   request.setAttribute("list", list);
		   return "home";
	   }
}
