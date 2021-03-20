package com.demo.model;
// Generated Mar 3, 2021, 12:02:21 PM by Hibernate Tools 5.4.27.Final


import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * X.userSummaryId generated by hbm2java
 */
public class X.userSummaryId  implements java.io.Serializable {


     private String user;
     private BigInteger statements;
     private BigInteger statementLatency;
     private BigDecimal statementAvgLatency;
     private BigInteger tableScans;
     private BigInteger fileIos;
     private BigInteger fileIoLatency;
     private BigInteger currentConnections;
     private BigInteger totalConnections;
     private long uniqueHosts;
     private BigInteger currentMemory;
     private BigInteger totalMemoryAllocated;

    public X.userSummaryId() {
    }

	
    public X.userSummaryId(BigDecimal statementAvgLatency, long uniqueHosts) {
        this.statementAvgLatency = statementAvgLatency;
        this.uniqueHosts = uniqueHosts;
    }
    public X.userSummaryId(String user, BigInteger statements, BigInteger statementLatency, BigDecimal statementAvgLatency, BigInteger tableScans, BigInteger fileIos, BigInteger fileIoLatency, BigInteger currentConnections, BigInteger totalConnections, long uniqueHosts, BigInteger currentMemory, BigInteger totalMemoryAllocated) {
       this.user = user;
       this.statements = statements;
       this.statementLatency = statementLatency;
       this.statementAvgLatency = statementAvgLatency;
       this.tableScans = tableScans;
       this.fileIos = fileIos;
       this.fileIoLatency = fileIoLatency;
       this.currentConnections = currentConnections;
       this.totalConnections = totalConnections;
       this.uniqueHosts = uniqueHosts;
       this.currentMemory = currentMemory;
       this.totalMemoryAllocated = totalMemoryAllocated;
    }
   
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    public BigInteger getStatements() {
        return this.statements;
    }
    
    public void setStatements(BigInteger statements) {
        this.statements = statements;
    }
    public BigInteger getStatementLatency() {
        return this.statementLatency;
    }
    
    public void setStatementLatency(BigInteger statementLatency) {
        this.statementLatency = statementLatency;
    }
    public BigDecimal getStatementAvgLatency() {
        return this.statementAvgLatency;
    }
    
    public void setStatementAvgLatency(BigDecimal statementAvgLatency) {
        this.statementAvgLatency = statementAvgLatency;
    }
    public BigInteger getTableScans() {
        return this.tableScans;
    }
    
    public void setTableScans(BigInteger tableScans) {
        this.tableScans = tableScans;
    }
    public BigInteger getFileIos() {
        return this.fileIos;
    }
    
    public void setFileIos(BigInteger fileIos) {
        this.fileIos = fileIos;
    }
    public BigInteger getFileIoLatency() {
        return this.fileIoLatency;
    }
    
    public void setFileIoLatency(BigInteger fileIoLatency) {
        this.fileIoLatency = fileIoLatency;
    }
    public BigInteger getCurrentConnections() {
        return this.currentConnections;
    }
    
    public void setCurrentConnections(BigInteger currentConnections) {
        this.currentConnections = currentConnections;
    }
    public BigInteger getTotalConnections() {
        return this.totalConnections;
    }
    
    public void setTotalConnections(BigInteger totalConnections) {
        this.totalConnections = totalConnections;
    }
    public long getUniqueHosts() {
        return this.uniqueHosts;
    }
    
    public void setUniqueHosts(long uniqueHosts) {
        this.uniqueHosts = uniqueHosts;
    }
    public BigInteger getCurrentMemory() {
        return this.currentMemory;
    }
    
    public void setCurrentMemory(BigInteger currentMemory) {
        this.currentMemory = currentMemory;
    }
    public BigInteger getTotalMemoryAllocated() {
        return this.totalMemoryAllocated;
    }
    
    public void setTotalMemoryAllocated(BigInteger totalMemoryAllocated) {
        this.totalMemoryAllocated = totalMemoryAllocated;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.userSummaryId) ) return false;
		 X.userSummaryId castOther = ( X.userSummaryId ) other; 
         
		 return ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getStatements()==castOther.getStatements()) || ( this.getStatements()!=null && castOther.getStatements()!=null && this.getStatements().equals(castOther.getStatements()) ) )
 && ( (this.getStatementLatency()==castOther.getStatementLatency()) || ( this.getStatementLatency()!=null && castOther.getStatementLatency()!=null && this.getStatementLatency().equals(castOther.getStatementLatency()) ) )
 && ( (this.getStatementAvgLatency()==castOther.getStatementAvgLatency()) || ( this.getStatementAvgLatency()!=null && castOther.getStatementAvgLatency()!=null && this.getStatementAvgLatency().equals(castOther.getStatementAvgLatency()) ) )
 && ( (this.getTableScans()==castOther.getTableScans()) || ( this.getTableScans()!=null && castOther.getTableScans()!=null && this.getTableScans().equals(castOther.getTableScans()) ) )
 && ( (this.getFileIos()==castOther.getFileIos()) || ( this.getFileIos()!=null && castOther.getFileIos()!=null && this.getFileIos().equals(castOther.getFileIos()) ) )
 && ( (this.getFileIoLatency()==castOther.getFileIoLatency()) || ( this.getFileIoLatency()!=null && castOther.getFileIoLatency()!=null && this.getFileIoLatency().equals(castOther.getFileIoLatency()) ) )
 && ( (this.getCurrentConnections()==castOther.getCurrentConnections()) || ( this.getCurrentConnections()!=null && castOther.getCurrentConnections()!=null && this.getCurrentConnections().equals(castOther.getCurrentConnections()) ) )
 && ( (this.getTotalConnections()==castOther.getTotalConnections()) || ( this.getTotalConnections()!=null && castOther.getTotalConnections()!=null && this.getTotalConnections().equals(castOther.getTotalConnections()) ) )
 && (this.getUniqueHosts()==castOther.getUniqueHosts())
 && ( (this.getCurrentMemory()==castOther.getCurrentMemory()) || ( this.getCurrentMemory()!=null && castOther.getCurrentMemory()!=null && this.getCurrentMemory().equals(castOther.getCurrentMemory()) ) )
 && ( (this.getTotalMemoryAllocated()==castOther.getTotalMemoryAllocated()) || ( this.getTotalMemoryAllocated()!=null && castOther.getTotalMemoryAllocated()!=null && this.getTotalMemoryAllocated().equals(castOther.getTotalMemoryAllocated()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getStatements() == null ? 0 : this.getStatements().hashCode() );
         result = 37 * result + ( getStatementLatency() == null ? 0 : this.getStatementLatency().hashCode() );
         result = 37 * result + ( getStatementAvgLatency() == null ? 0 : this.getStatementAvgLatency().hashCode() );
         result = 37 * result + ( getTableScans() == null ? 0 : this.getTableScans().hashCode() );
         result = 37 * result + ( getFileIos() == null ? 0 : this.getFileIos().hashCode() );
         result = 37 * result + ( getFileIoLatency() == null ? 0 : this.getFileIoLatency().hashCode() );
         result = 37 * result + ( getCurrentConnections() == null ? 0 : this.getCurrentConnections().hashCode() );
         result = 37 * result + ( getTotalConnections() == null ? 0 : this.getTotalConnections().hashCode() );
         result = 37 * result + (int) this.getUniqueHosts();
         result = 37 * result + ( getCurrentMemory() == null ? 0 : this.getCurrentMemory().hashCode() );
         result = 37 * result + ( getTotalMemoryAllocated() == null ? 0 : this.getTotalMemoryAllocated().hashCode() );
         return result;
   }   


}


