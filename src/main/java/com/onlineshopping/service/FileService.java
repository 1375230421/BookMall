package com.onlineshopping.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	public Boolean updateFile(List<MultipartFile> files);
}
