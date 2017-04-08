package com.zrgk.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zrgk.entity.ProjectBean;
import com.zrgk.service.ProjectService;

@Controller
@RequestMapping(value="/")
public class RegProjectController {

	@Autowired
	private ProjectService projectService;
	
	public ProjectService getProjectService() {
		return projectService;
	}
	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}
	@RequestMapping(value="/RegisterProject.do")
	public String registerProject(@RequestParam MultipartFile[] myfiles, HttpServletRequest request) throws IOException{
		
		ProjectBean pb = this.packProject(request);
		int t = 0;
		for(MultipartFile myfile : myfiles){
			
			if(myfile.isEmpty()){
				System.out.println("文件未上传");
			}else{
				System.out.println("文件长度: " + myfile.getSize());
				System.out.println("文件类型: " + myfile.getContentType());
				System.out.println("文件名称: " + myfile.getName());
				System.out.println("文件原名: " + myfile.getOriginalFilename());
				System.out.println("========================================");
				pb.getMyfile()[t] = myfile.getName();
				String realPath = request.getSession().getServletContext().getRealPath("/WEB-INF/upload");
				File uploadDir = new File(realPath);
				if(!uploadDir.exists()){
					uploadDir.mkdirs();
				}
				FileUtils.copyInputStreamToFile(myfile.getInputStream(), new File(realPath, myfile.getOriginalFilename()));
			}
			t++;
		}
		int i = projectService.regProject(pb);
		if(i!=0){
			return "redirect:/houtai/main.html";
		}
		return null;
	}
	private ProjectBean packProject(HttpServletRequest request) {
		String projectName = request.getParameter("projectName");
		String projectDesc = request.getParameter("projectDesc");		//项目描述
		String projectType = request.getParameter("projectType");		//项目类型 1，代表演出， 2代表赛事
		String projectMoney = request.getParameter("projectMoney");		//项目呼唤金额
		String projectStart = request.getParameter("projectStart");		//项目筹集起始时间
		String projectEnd = request.getParameter("projectEnd");		//项目筹集结束时间
		String projectContent = request.getParameter("projectContent");	//项目上下文对象
		String addCompany = request.getParameter("addCompany");		//项目发起公司
		String addPhone = request.getParameter("addPhone");		//经办人联系电话
		String addBank = request.getParameter("addBank");			//银行
		String addAccount = request.getParameter("addAccount");		//银行对公账号
		return new ProjectBean(0,projectName,projectDesc,Integer.parseInt(projectType),Integer.parseInt(projectMoney),
				new Date(), new Date(),new String[7], projectContent,addCompany,addPhone,Integer.parseInt(addBank),addAccount,1);
	}			//projectStart       projectEnd

}
