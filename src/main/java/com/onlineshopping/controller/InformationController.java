package com.onlineshopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.onlineshopping.config.Config;
import com.onlineshopping.po.Goods;
import com.onlineshopping.po.OrderDetail;
import com.onlineshopping.po.User;
import com.onlineshopping.service.FileService;
import com.onlineshopping.service.ProductionService;
import com.onlineshopping.service.UserService;

@Controller
public class InformationController {
	@Autowired
	ProductionService productionService;
	@Autowired
	FileService fileService;
	@Autowired
	UserService userService;
	@RequestMapping(value="information")
	public String information(HttpServletRequest request){
		return "information";
	}
	
	@RequestMapping(value="updateInfo")
	public String addInfo(HttpServletRequest request,String uSex,String nian,String yue,String ri,@RequestParam("uImage")List<MultipartFile> uploadfile){
		System.out.println(uSex);
		String uName=(String) request.getSession().getAttribute("uName");
		String uBirth=nian+"-"+yue+"-"+ri;
		String uImage =Config.updateImg+uploadfile.get(0).getOriginalFilename();
		User user=new User();
		user.setuName(uName);
		user.setuSex(uSex);
		user.setuBirth(uBirth);
		user.setuImage(uImage);
		System.out.println(user.toString());
		
		if(user!=null&&!uploadfile.isEmpty() && uploadfile.size() > 0) {
			fileService.updateFile(uploadfile);
			userService.updateInfo(user);
		}
		return "information";
	}
	
}
