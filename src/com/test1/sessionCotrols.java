package com.test1;

public class sessionCotrols {
	private Integer appId;
	private String requestMatchersToPermit;
	private String requestMatchersToAuthenticate;
	private Boolean formLogin;
	private String loginProcessingURL;
	private Boolean loginURLPermit;
	private String header;
	private Integer logOutURL;
	private String invalidateSessionOnTimeout;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public sessionCotrols() {

	}

	public sessionCotrols(Integer appId, String requestMatchersToPermit, String requestMatchersToAuthenticate,
			Boolean formLogin, String loginProcessingURL, Boolean loginURLPermit, String header, Integer logOutURL,
			String invalidateSessionOnTimeout, String creationDate, String modifiedDate, String entityState) {
		super();
		this.appId = appId;
		this.requestMatchersToPermit = requestMatchersToPermit;
		this.requestMatchersToAuthenticate = requestMatchersToAuthenticate;
		this.formLogin = formLogin;
		this.loginProcessingURL = loginProcessingURL;
		this.loginURLPermit = loginURLPermit;
		this.header = header;
		this.logOutURL = logOutURL;
		this.invalidateSessionOnTimeout = invalidateSessionOnTimeout;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getRequestMatchersToPermit() {
		return requestMatchersToPermit;
	}

	public void setRequestMatchersToPermit(String requestMatchersToPermit) {
		this.requestMatchersToPermit = requestMatchersToPermit;
	}

	public String getRequestMatchersToAuthenticate() {
		return requestMatchersToAuthenticate;
	}

	public void setRequestMatchersToAuthenticate(String requestMatchersToAuthenticate) {
		this.requestMatchersToAuthenticate = requestMatchersToAuthenticate;
	}

	public Boolean getFormLogin() {
		return formLogin;
	}

	public void setFormLogin(Boolean formLogin) {
		this.formLogin = formLogin;
	}

	public String getLoginProcessingURL() {
		return loginProcessingURL;
	}

	public void setLoginProcessingURL(String loginProcessingURL) {
		this.loginProcessingURL = loginProcessingURL;
	}

	public Boolean getLoginURLPermit() {
		return loginURLPermit;
	}

	public void setLoginURLPermit(Boolean loginURLPermit) {
		this.loginURLPermit = loginURLPermit;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Integer getLogOutURL() {
		return logOutURL;
	}

	public void setLogOutURL(Integer logOutURL) {
		this.logOutURL = logOutURL;
	}

	public String getInvalidateSessionOnTimeout() {
		return invalidateSessionOnTimeout;
	}

	public void setInvalidateSessionOnTimeout(String invalidateSessionOnTimeout) {
		this.invalidateSessionOnTimeout = invalidateSessionOnTimeout;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
