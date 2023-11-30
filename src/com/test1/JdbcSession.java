package com.test1;

public class JdbcSession {
	private Integer tableId;
	private String tableName;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPwd;
	private Integer schemaCount;
	private String schemaName;
	private Integer deleteWhileLogOut;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public JdbcSession() {

	}

	public JdbcSession(Integer tableId, String tableName, String jdbcURL, String jdbcUser, String jdbcPwd,
			Integer schemaCount, String schemaName, Integer deleteWhileLogOut, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.tableId = tableId;
		this.tableName = tableName;
		this.jdbcURL = jdbcURL;
		this.jdbcUser = jdbcUser;
		this.jdbcPwd = jdbcPwd;
		this.schemaCount = schemaCount;
		this.schemaName = schemaName;
		this.deleteWhileLogOut = deleteWhileLogOut;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getTableId() {
		return tableId;
	}

	public void setTableId(Integer tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getJdbcURL() {
		return jdbcURL;
	}

	public void setJdbcURL(String jdbcURL) {
		this.jdbcURL = jdbcURL;
	}

	public String getJdbcUser() {
		return jdbcUser;
	}

	public void setJdbcUser(String jdbcUser) {
		this.jdbcUser = jdbcUser;
	}

	public String getJdbcPwd() {
		return jdbcPwd;
	}

	public void setJdbcPwd(String jdbcPwd) {
		this.jdbcPwd = jdbcPwd;
	}

	public Integer getSchemaCount() {
		return schemaCount;
	}

	public void setSchemaCount(Integer schemaCount) {
		this.schemaCount = schemaCount;
	}

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public Integer getDeleteWhileLogOut() {
		return deleteWhileLogOut;
	}

	public void setDeleteWhileLogOut(Integer deleteWhileLogOut) {
		this.deleteWhileLogOut = deleteWhileLogOut;
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
