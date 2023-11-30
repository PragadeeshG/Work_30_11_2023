package com.test1;

public class Session {
	private Integer appId;
	private String appName;
	private boolean springSession;
	private String sessionModel;
	private long sessionTimeOut;
	private String sessionValidation;
	private String cors;
	private String csrf;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public Session() {

	}

	public Session(Integer appId, String appName, boolean springSession, String sessionModel, long sessionTimeOut,
			String sessionValidation, String cors, String csrf, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.appId = appId;
		this.appName = appName;
		this.springSession = springSession;
		this.sessionModel = sessionModel;
		this.sessionTimeOut = sessionTimeOut;
		this.sessionValidation = sessionValidation;
		this.cors = cors;
		this.csrf = csrf;
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

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public boolean isSpringSession() {
		return springSession;
	}

	public void setSpringSession(boolean springSession) {
		this.springSession = springSession;
	}

	public String getSessionModel() {
		return sessionModel;
	}

	public void setSessionModel(String sessionModel) {
		this.sessionModel = sessionModel;
	}

	public long getSessionTimeOut() {
		return sessionTimeOut;
	}

	public void setSessionTimeOut(long sessionTimeOut) {
		this.sessionTimeOut = sessionTimeOut;
	}

	public String getSessionValidation() {
		return sessionValidation;
	}

	public void setSessionValidation(String sessionValidation) {
		this.sessionValidation = sessionValidation;
	}

	public String getCors() {
		return cors;
	}

	public void setCors(String cors) {
		this.cors = cors;
	}

	public String getCsrf() {
		return csrf;
	}

	public void setCsrf(String csrf) {
		this.csrf = csrf;
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
