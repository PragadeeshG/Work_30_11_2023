package com.test1;

public class sessionHandlers {
	private String primaryId;
	private String sessionId;
	private String handlerName;
	private String loginSuccessHandler;
	private String loginFailureHandler;
	private Integer sessionInvalidationStrategy;
	private String customAuthenticator;
	private Integer authManager;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public sessionHandlers() {

	}

	public sessionHandlers(String primaryId, String sessionId, String handlerName, String loginSuccessHandler,
			String loginFailureHandler, Integer sessionInvalidationStrategy, String customAuthenticator,
			Integer authManager, String creationDate, String modifiedDate, String entityState) {
		super();
		this.primaryId = primaryId;
		this.sessionId = sessionId;
		this.handlerName = handlerName;
		this.loginSuccessHandler = loginSuccessHandler;
		this.loginFailureHandler = loginFailureHandler;
		this.sessionInvalidationStrategy = sessionInvalidationStrategy;
		this.customAuthenticator = customAuthenticator;
		this.authManager = authManager;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getPrimaryId() {
		return primaryId;
	}

	public void setPrimaryId(String primaryId) {
		this.primaryId = primaryId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getHandlerName() {
		return handlerName;
	}

	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	public String getLoginSuccessHandler() {
		return loginSuccessHandler;
	}

	public void setLoginSuccessHandler(String loginSuccessHandler) {
		this.loginSuccessHandler = loginSuccessHandler;
	}

	public String getLoginFailureHandler() {
		return loginFailureHandler;
	}

	public void setLoginFailureHandler(String loginFailureHandler) {
		this.loginFailureHandler = loginFailureHandler;
	}

	public Integer getSessionInvalidationStrategy() {
		return sessionInvalidationStrategy;
	}

	public void setSessionInvalidationStrategy(Integer sessionInvalidationStrategy) {
		this.sessionInvalidationStrategy = sessionInvalidationStrategy;
	}

	public String getCustomAuthenticator() {
		return customAuthenticator;
	}

	public void setCustomAuthenticator(String customAuthenticator) {
		this.customAuthenticator = customAuthenticator;
	}

	public Integer getAuthManager() {
		return authManager;
	}

	public void setAuthManager(Integer authManager) {
		this.authManager = authManager;
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
