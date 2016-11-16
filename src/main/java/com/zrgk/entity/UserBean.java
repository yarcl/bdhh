package com.zrgk.entity;

public class UserBean {
	private int userId;
	private String loginName;
	private String telephone;
	private String addressPro;
	private String addressCity;
	private String addressCom;
	private String addressDetail;
	private String postCode;
	private String reciveName;
	private String phone;
	private int userState;
	private int money;
	private RoleBean role;
	private String password;
	public UserBean(int userId, String loginName, String telephone, String addressPro, String addressCity,
			String addressCom, String addressDetail, String postCode, String reciveName, String phone, int userState,
			int money, RoleBean role, String password) {
		super();
		this.userId = userId;
		this.loginName = loginName;
		this.telephone = telephone;
		this.addressPro = addressPro;
		this.addressCity = addressCity;
		this.addressCom = addressCom;
		this.addressDetail = addressDetail;
		this.postCode = postCode;
		this.reciveName = reciveName;
		this.phone = phone;
		this.userState = userState;
		this.money = money;
		this.role = role;
		this.password = password;
	}
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddressPro() {
		return addressPro;
	}
	public void setAddressPro(String addressPro) {
		this.addressPro = addressPro;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	public String getAddressCom() {
		return addressCom;
	}
	public void setAddressCom(String addressCom) {
		this.addressCom = addressCom;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getReciveName() {
		return reciveName;
	}
	public void setReciveName(String reciveName) {
		this.reciveName = reciveName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getUserState() {
		return userState;
	}
	public void setUserState(int userState) {
		this.userState = userState;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public RoleBean getRole() {
		return role;
	}
	public void setRole(RoleBean role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
