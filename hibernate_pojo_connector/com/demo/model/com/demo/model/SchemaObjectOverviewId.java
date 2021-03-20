package com.demo.model;
// Generated Mar 3, 2021, 12:02:21 PM by Hibernate Tools 5.4.27.Final

/**
 * SchemaObjectOverviewId generated by hbm2java
 */
public class SchemaObjectOverviewId implements java.io.Serializable {

	private String db;
	private String objectType;
	private long count;

	public SchemaObjectOverviewId() {
	}

	public SchemaObjectOverviewId(long count) {
		this.count = count;
	}

	public SchemaObjectOverviewId(String db, String objectType, long count) {
		this.db = db;
		this.objectType = objectType;
		this.count = count;
	}

	public String getDb() {
		return this.db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public long getCount() {
		return this.count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SchemaObjectOverviewId))
			return false;
		SchemaObjectOverviewId castOther = (SchemaObjectOverviewId) other;

		return ((this.getDb() == castOther.getDb())
				|| (this.getDb() != null && castOther.getDb() != null && this.getDb().equals(castOther.getDb())))
				&& ((this.getObjectType() == castOther.getObjectType()) || (this.getObjectType() != null
						&& castOther.getObjectType() != null && this.getObjectType().equals(castOther.getObjectType())))
				&& (this.getCount() == castOther.getCount());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDb() == null ? 0 : this.getDb().hashCode());
		result = 37 * result + (getObjectType() == null ? 0 : this.getObjectType().hashCode());
		result = 37 * result + (int) this.getCount();
		return result;
	}

}
