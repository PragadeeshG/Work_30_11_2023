package com.test1;

public class jedisSession {
	private Integer clusterId;
	private String clusterIps;
	private Integer nodeCount;
	private String redisKey;
	private String envKey;
	private String hashKey;
	private String topicName;
	private Integer maxIdle;
	private Boolean redisApplicable;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public jedisSession() {

	}

	public jedisSession(Integer clusterId, String clusterIps, Integer nodeCount, String redisKey, String envKey,
			String hashKey, String topicName, Integer maxIdle, Boolean redisApplicable, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.clusterId = clusterId;
		this.clusterIps = clusterIps;
		this.nodeCount = nodeCount;
		this.redisKey = redisKey;
		this.envKey = envKey;
		this.hashKey = hashKey;
		this.topicName = topicName;
		this.maxIdle = maxIdle;
		this.redisApplicable = redisApplicable;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getClusterId() {
		return clusterId;
	}

	public void setClusterId(Integer clusterId) {
		this.clusterId = clusterId;
	}

	public String getClusterIps() {
		return clusterIps;
	}

	public void setClusterIps(String clusterIps) {
		this.clusterIps = clusterIps;
	}

	public Integer getNodeCount() {
		return nodeCount;
	}

	public void setNodeCount(Integer nodeCount) {
		this.nodeCount = nodeCount;
	}

	public String getRedisKey() {
		return redisKey;
	}

	public void setRedisKey(String redisKey) {
		this.redisKey = redisKey;
	}

	public String getEnvKey() {
		return envKey;
	}

	public void setEnvKey(String envKey) {
		this.envKey = envKey;
	}

	public String getHashKey() {
		return hashKey;
	}

	public void setHashKey(String hashKey) {
		this.hashKey = hashKey;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public Integer getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(Integer maxIdle) {
		this.maxIdle = maxIdle;
	}

	public Boolean getRedisApplicable() {
		return redisApplicable;
	}

	public void setRedisApplicable(Boolean redisApplicable) {
		this.redisApplicable = redisApplicable;
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
