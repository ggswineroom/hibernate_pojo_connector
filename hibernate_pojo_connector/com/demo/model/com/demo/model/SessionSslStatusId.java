package com.demo.model;
// Generated Mar 3, 2021, 12:02:21 PM by Hibernate Tools 5.4.27.Final

/**
 * SessionSslStatusId generated by hbm2java
 */
public class SessionSslStatusId implements java.io.Serializable {

	private long threadId;
	private String sslVersion;
	private String sslCipher;
	private String sslSessionsReused;

	public SessionSslStatusId() {
	}

	public SessionSslStatusId(long threadId) {
		this.threadId = threadId;
	}

	public SessionSslStatusId(long threadId, String sslVersion, String sslCipher, String sslSessionsReused) {
		this.threadId = threadId;
		this.sslVersion = sslVersion;
		this.sslCipher = sslCipher;
		this.sslSessionsReused = sslSessionsReused;
	}

	public long getThreadId() {
		return this.threadId;
	}

	public void setThreadId(long threadId) {
		this.threadId = threadId;
	}

	public String getSslVersion() {
		return this.sslVersion;
	}

	public void setSslVersion(String sslVersion) {
		this.sslVersion = sslVersion;
	}

	public String getSslCipher() {
		return this.sslCipher;
	}

	public void setSslCipher(String sslCipher) {
		this.sslCipher = sslCipher;
	}

	public String getSslSessionsReused() {
		return this.sslSessionsReused;
	}

	public void setSslSessionsReused(String sslSessionsReused) {
		this.sslSessionsReused = sslSessionsReused;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SessionSslStatusId))
			return false;
		SessionSslStatusId castOther = (SessionSslStatusId) other;

		return (this.getThreadId() == castOther.getThreadId())
				&& ((this.getSslVersion() == castOther.getSslVersion()) || (this.getSslVersion() != null
						&& castOther.getSslVersion() != null && this.getSslVersion().equals(castOther.getSslVersion())))
				&& ((this.getSslCipher() == castOther.getSslCipher()) || (this.getSslCipher() != null
						&& castOther.getSslCipher() != null && this.getSslCipher().equals(castOther.getSslCipher())))
				&& ((this.getSslSessionsReused() == castOther.getSslSessionsReused())
						|| (this.getSslSessionsReused() != null && castOther.getSslSessionsReused() != null
								&& this.getSslSessionsReused().equals(castOther.getSslSessionsReused())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getThreadId();
		result = 37 * result + (getSslVersion() == null ? 0 : this.getSslVersion().hashCode());
		result = 37 * result + (getSslCipher() == null ? 0 : this.getSslCipher().hashCode());
		result = 37 * result + (getSslSessionsReused() == null ? 0 : this.getSslSessionsReused().hashCode());
		return result;
	}

}
