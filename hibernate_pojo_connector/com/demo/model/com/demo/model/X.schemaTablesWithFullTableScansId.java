package com.demo.model;
// Generated Mar 3, 2021, 12:02:21 PM by Hibernate Tools 5.4.27.Final



/**
 * X.schemaTablesWithFullTableScansId generated by hbm2java
 */
public class X.schemaTablesWithFullTableScansId  implements java.io.Serializable {


     private String objectSchema;
     private String objectName;
     private long rowsFullScanned;
     private long latency;

    public X.schemaTablesWithFullTableScansId() {
    }

	
    public X.schemaTablesWithFullTableScansId(long rowsFullScanned, long latency) {
        this.rowsFullScanned = rowsFullScanned;
        this.latency = latency;
    }
    public X.schemaTablesWithFullTableScansId(String objectSchema, String objectName, long rowsFullScanned, long latency) {
       this.objectSchema = objectSchema;
       this.objectName = objectName;
       this.rowsFullScanned = rowsFullScanned;
       this.latency = latency;
    }
   
    public String getObjectSchema() {
        return this.objectSchema;
    }
    
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }
    public String getObjectName() {
        return this.objectName;
    }
    
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
    public long getRowsFullScanned() {
        return this.rowsFullScanned;
    }
    
    public void setRowsFullScanned(long rowsFullScanned) {
        this.rowsFullScanned = rowsFullScanned;
    }
    public long getLatency() {
        return this.latency;
    }
    
    public void setLatency(long latency) {
        this.latency = latency;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.schemaTablesWithFullTableScansId) ) return false;
		 X.schemaTablesWithFullTableScansId castOther = ( X.schemaTablesWithFullTableScansId ) other; 
         
		 return ( (this.getObjectSchema()==castOther.getObjectSchema()) || ( this.getObjectSchema()!=null && castOther.getObjectSchema()!=null && this.getObjectSchema().equals(castOther.getObjectSchema()) ) )
 && ( (this.getObjectName()==castOther.getObjectName()) || ( this.getObjectName()!=null && castOther.getObjectName()!=null && this.getObjectName().equals(castOther.getObjectName()) ) )
 && (this.getRowsFullScanned()==castOther.getRowsFullScanned())
 && (this.getLatency()==castOther.getLatency());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getObjectSchema() == null ? 0 : this.getObjectSchema().hashCode() );
         result = 37 * result + ( getObjectName() == null ? 0 : this.getObjectName().hashCode() );
         result = 37 * result + (int) this.getRowsFullScanned();
         result = 37 * result + (int) this.getLatency();
         return result;
   }   


}


