package com.zrgk.entity;

import java.util.Date;

public class ProjectBean {

	private int projectId;			//项目Id
	private String projectName;		//项目名称
	private String projectDesc;		//项目描述
	private int projectType;		//项目类型 1，代表演出， 2代表赛事
	private int projectMoney;		//项目呼唤金额
	private Date projectStart;		//项目筹集起始时间
	private Date projectEnd;		//项目筹集结束时间
	private String[] myfiles = new String[7];		//项目图片,企业营业执照副本扫描件,法人身份证反面扫描件,经办人身份证反面扫描件,组织机构代码证扫描件,税务登记副本扫描件,银行结算账户开户许可证扫描件
	private String projectContent;	//项目上下文对象
	private String addCompany;		//项目发起公司
	private String addPhone;		//经办人联系电话
	private int addBank;			//银行
	private String addAccount;		//银行对公账号
	private int projectState;		//项目状态
	public ProjectBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjectBean(int projectId, String projectName, String projectDesc, int projectType, int projectMoney,
			Date projectStart, Date projectEnd, String[] myfiles, String projectContent, String addCompany,
			String addPhone, int addBank, String addAccount, int projectState) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDesc = projectDesc;
		this.projectType = projectType;
		this.projectMoney = projectMoney;
		this.projectStart = projectStart;
		this.projectEnd = projectEnd;
		this.myfiles = myfiles;
		this.projectContent = projectContent;
		this.addCompany = addCompany;
		this.addPhone = addPhone;
		this.addBank = addBank;
		this.addAccount = addAccount;
		this.projectState = projectState;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public int getProjectType() {
		return projectType;
	}
	public void setProjectType(int projectType) {
		this.projectType = projectType;
	}
	public int getProjectMoney() {
		return projectMoney;
	}
	public void setProjectMoney(int projectMoney) {
		this.projectMoney = projectMoney;
	}
	public Date getProjectStart() {
		return projectStart;
	}
	public void setProjectStart(Date projectStart) {
		this.projectStart = projectStart;
	}
	public Date getProjectEnd() {
		return projectEnd;
	}
	public void setProjectEnd(Date projectEnd) {
		this.projectEnd = projectEnd;
	}
	public String getMyfiles() {
		return myfiles.toString();
	}
	public String[] getMyfile() {
		return myfiles;
	}
	public void setMyfiles(String[] myfiles) {
		this.myfiles = myfiles;
	}
	public String getProjectContent() {
		return projectContent;
	}
	public void setProjectContent(String projectContent) {
		this.projectContent = projectContent;
	}
	public String getAddCompany() {
		return addCompany;
	}
	public void setAddCompany(String addCompany) {
		this.addCompany = addCompany;
	}
	public String getAddPhone() {
		return addPhone;
	}
	public void setAddPhone(String addPhone) {
		this.addPhone = addPhone;
	}
	public int getAddBank() {
		return addBank;
	}
	public void setAddBank(int addBank) {
		this.addBank = addBank;
	}
	public String getAddAccount() {
		return addAccount;
	}
	public void setAddAccount(String addAccount) {
		this.addAccount = addAccount;
	}
	public int getProjectState() {
		return projectState;
	}
	public void setProjectState(int projectState) {
		this.projectState = projectState;
	}
	
}
