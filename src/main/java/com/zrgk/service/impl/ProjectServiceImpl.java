package com.zrgk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zrgk.dao.ProjectDao;
import com.zrgk.entity.ProjectBean;
import com.zrgk.service.ProjectService;

public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectDao pd;
	
	public ProjectDao getPd() {
		return pd;
	}

	public void setPd(ProjectDao pd) {
		this.pd = pd;
	}

	public int regProject(ProjectBean pb){
		return pd.regProject(pb);
	}
}
