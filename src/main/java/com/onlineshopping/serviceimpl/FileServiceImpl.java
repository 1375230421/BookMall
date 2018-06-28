package com.onlineshopping.serviceimpl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.onlineshopping.config.Config;
import com.onlineshopping.service.FileService;
import com.onlineshopping.util.FileUtil;

@Service
public class FileServiceImpl implements FileService {
	

	@Override
	public Boolean updateFile(List<MultipartFile> files) {
		if(!files.isEmpty() && files.size() > 0) {
//			String dirPath = this.getClass().getClassLoader().getResource("").getPath()+"../../"+Config.updateImg;
			String dirPath ="E:\\Program\\BookMall\\src\\main\\webapp\\public\\two\\img";
			FileUtil.fileUpload(files, dirPath);
			return true;
		}
		return false;
	}

}
