package com.demo.model;
// Generated Mar 3, 2021, 12:02:21 PM by Hibernate Tools 5.4.27.Final

/**
 * VersionId generated by hbm2java
 */
public class VersionId implements java.io.Serializable {

	private String sysVersion;
	private String mysqlVersion;

	public VersionId() {
	}

	public VersionId(String sysVersion, String mysqlVersion) {
		this.sysVersion = sysVersion;
		this.mysqlVersion = mysqlVersion;
	}

	public String getSysVersion() {
		return this.sysVersion;
	}

	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getMysqlVersion() {
		return this.mysqlVersion;
	}

	public void setMysqlVersion(String mysqlVersion) {
		this.mysqlVersion = mysqlVersion;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VersionId))
			return false;
		VersionId castOther = (VersionId) other;

		return ((this.getSysVersion() == castOther.getSysVersion()) || (this.getSysVersion() != null
				&& castOther.getSysVersion() != null && this.getSysVersion().equals(castOther.getSysVersion())))
				&& ((this.getMysqlVersion() == castOther.getMysqlVersion())
						|| (this.getMysqlVersion() != null && castOther.getMysqlVersion() != null
								&& this.getMysqlVersion().equals(castOther.getMysqlVersion())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSysVersion() == null ? 0 : this.getSysVersion().hashCode());
		result = 37 * result + (getMysqlVersion() == null ? 0 : this.getMysqlVersion().hashCode());
		return result;
	}

}
