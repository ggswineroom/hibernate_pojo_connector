package com.demo.model;
// Generated Mar 3, 2021, 12:02:21 PM by Hibernate Tools 5.4.27.Final


import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * X.memoryByThreadByCurrentBytesId generated by hbm2java
 */
public class X.memoryByThreadByCurrentBytesId  implements java.io.Serializable {


     private long threadId;
     private String user;
     private BigInteger currentCountUsed;
     private BigInteger currentAllocated;
     private BigDecimal currentAvgAlloc;
     private Long currentMaxAlloc;
     private BigInteger totalAllocated;

    public X.memoryByThreadByCurrentBytesId() {
    }

	
    public X.memoryByThreadByCurrentBytesId(long threadId, BigDecimal currentAvgAlloc) {
        this.threadId = threadId;
        this.currentAvgAlloc = currentAvgAlloc;
    }
    public X.memoryByThreadByCurrentBytesId(long threadId, String user, BigInteger currentCountUsed, BigInteger currentAllocated, BigDecimal currentAvgAlloc, Long currentMaxAlloc, BigInteger totalAllocated) {
       this.threadId = threadId;
       this.user = user;
       this.currentCountUsed = currentCountUsed;
       this.currentAllocated = currentAllocated;
       this.currentAvgAlloc = currentAvgAlloc;
       this.currentMaxAlloc = currentMaxAlloc;
       this.totalAllocated = totalAllocated;
    }
   
    public long getThreadId() {
        return this.threadId;
    }
    
    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }
    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    public BigInteger getCurrentCountUsed() {
        return this.currentCountUsed;
    }
    
    public void setCurrentCountUsed(BigInteger currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }
    public BigInteger getCurrentAllocated() {
        return this.currentAllocated;
    }
    
    public void setCurrentAllocated(BigInteger currentAllocated) {
        this.currentAllocated = currentAllocated;
    }
    public BigDecimal getCurrentAvgAlloc() {
        return this.currentAvgAlloc;
    }
    
    public void setCurrentAvgAlloc(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }
    public Long getCurrentMaxAlloc() {
        return this.currentMaxAlloc;
    }
    
    public void setCurrentMaxAlloc(Long currentMaxAlloc) {
        this.currentMaxAlloc = currentMaxAlloc;
    }
    public BigInteger getTotalAllocated() {
        return this.totalAllocated;
    }
    
    public void setTotalAllocated(BigInteger totalAllocated) {
        this.totalAllocated = totalAllocated;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.memoryByThreadByCurrentBytesId) ) return false;
		 X.memoryByThreadByCurrentBytesId castOther = ( X.memoryByThreadByCurrentBytesId ) other; 
         
		 return (this.getThreadId()==castOther.getThreadId())
 && ( (this.getUser()==castOther.getUser()) || ( this.getUser()!=null && castOther.getUser()!=null && this.getUser().equals(castOther.getUser()) ) )
 && ( (this.getCurrentCountUsed()==castOther.getCurrentCountUsed()) || ( this.getCurrentCountUsed()!=null && castOther.getCurrentCountUsed()!=null && this.getCurrentCountUsed().equals(castOther.getCurrentCountUsed()) ) )
 && ( (this.getCurrentAllocated()==castOther.getCurrentAllocated()) || ( this.getCurrentAllocated()!=null && castOther.getCurrentAllocated()!=null && this.getCurrentAllocated().equals(castOther.getCurrentAllocated()) ) )
 && ( (this.getCurrentAvgAlloc()==castOther.getCurrentAvgAlloc()) || ( this.getCurrentAvgAlloc()!=null && castOther.getCurrentAvgAlloc()!=null && this.getCurrentAvgAlloc().equals(castOther.getCurrentAvgAlloc()) ) )
 && ( (this.getCurrentMaxAlloc()==castOther.getCurrentMaxAlloc()) || ( this.getCurrentMaxAlloc()!=null && castOther.getCurrentMaxAlloc()!=null && this.getCurrentMaxAlloc().equals(castOther.getCurrentMaxAlloc()) ) )
 && ( (this.getTotalAllocated()==castOther.getTotalAllocated()) || ( this.getTotalAllocated()!=null && castOther.getTotalAllocated()!=null && this.getTotalAllocated().equals(castOther.getTotalAllocated()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getThreadId();
         result = 37 * result + ( getUser() == null ? 0 : this.getUser().hashCode() );
         result = 37 * result + ( getCurrentCountUsed() == null ? 0 : this.getCurrentCountUsed().hashCode() );
         result = 37 * result + ( getCurrentAllocated() == null ? 0 : this.getCurrentAllocated().hashCode() );
         result = 37 * result + ( getCurrentAvgAlloc() == null ? 0 : this.getCurrentAvgAlloc().hashCode() );
         result = 37 * result + ( getCurrentMaxAlloc() == null ? 0 : this.getCurrentMaxAlloc().hashCode() );
         result = 37 * result + ( getTotalAllocated() == null ? 0 : this.getTotalAllocated().hashCode() );
         return result;
   }   


}

