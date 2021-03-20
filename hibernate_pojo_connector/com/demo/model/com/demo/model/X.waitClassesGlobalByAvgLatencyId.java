package com.demo.model;
// Generated Mar 3, 2021, 12:02:21 PM by Hibernate Tools 5.4.27.Final


import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * X.waitClassesGlobalByAvgLatencyId generated by hbm2java
 */
public class X.waitClassesGlobalByAvgLatencyId  implements java.io.Serializable {


     private String eventClass;
     private BigInteger total;
     private BigInteger totalLatency;
     private Long minLatency;
     private BigDecimal avgLatency;
     private Long maxLatency;

    public X.waitClassesGlobalByAvgLatencyId() {
    }

	
    public X.waitClassesGlobalByAvgLatencyId(BigDecimal avgLatency) {
        this.avgLatency = avgLatency;
    }
    public X.waitClassesGlobalByAvgLatencyId(String eventClass, BigInteger total, BigInteger totalLatency, Long minLatency, BigDecimal avgLatency, Long maxLatency) {
       this.eventClass = eventClass;
       this.total = total;
       this.totalLatency = totalLatency;
       this.minLatency = minLatency;
       this.avgLatency = avgLatency;
       this.maxLatency = maxLatency;
    }
   
    public String getEventClass() {
        return this.eventClass;
    }
    
    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }
    public BigInteger getTotal() {
        return this.total;
    }
    
    public void setTotal(BigInteger total) {
        this.total = total;
    }
    public BigInteger getTotalLatency() {
        return this.totalLatency;
    }
    
    public void setTotalLatency(BigInteger totalLatency) {
        this.totalLatency = totalLatency;
    }
    public Long getMinLatency() {
        return this.minLatency;
    }
    
    public void setMinLatency(Long minLatency) {
        this.minLatency = minLatency;
    }
    public BigDecimal getAvgLatency() {
        return this.avgLatency;
    }
    
    public void setAvgLatency(BigDecimal avgLatency) {
        this.avgLatency = avgLatency;
    }
    public Long getMaxLatency() {
        return this.maxLatency;
    }
    
    public void setMaxLatency(Long maxLatency) {
        this.maxLatency = maxLatency;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof X.waitClassesGlobalByAvgLatencyId) ) return false;
		 X.waitClassesGlobalByAvgLatencyId castOther = ( X.waitClassesGlobalByAvgLatencyId ) other; 
         
		 return ( (this.getEventClass()==castOther.getEventClass()) || ( this.getEventClass()!=null && castOther.getEventClass()!=null && this.getEventClass().equals(castOther.getEventClass()) ) )
 && ( (this.getTotal()==castOther.getTotal()) || ( this.getTotal()!=null && castOther.getTotal()!=null && this.getTotal().equals(castOther.getTotal()) ) )
 && ( (this.getTotalLatency()==castOther.getTotalLatency()) || ( this.getTotalLatency()!=null && castOther.getTotalLatency()!=null && this.getTotalLatency().equals(castOther.getTotalLatency()) ) )
 && ( (this.getMinLatency()==castOther.getMinLatency()) || ( this.getMinLatency()!=null && castOther.getMinLatency()!=null && this.getMinLatency().equals(castOther.getMinLatency()) ) )
 && ( (this.getAvgLatency()==castOther.getAvgLatency()) || ( this.getAvgLatency()!=null && castOther.getAvgLatency()!=null && this.getAvgLatency().equals(castOther.getAvgLatency()) ) )
 && ( (this.getMaxLatency()==castOther.getMaxLatency()) || ( this.getMaxLatency()!=null && castOther.getMaxLatency()!=null && this.getMaxLatency().equals(castOther.getMaxLatency()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEventClass() == null ? 0 : this.getEventClass().hashCode() );
         result = 37 * result + ( getTotal() == null ? 0 : this.getTotal().hashCode() );
         result = 37 * result + ( getTotalLatency() == null ? 0 : this.getTotalLatency().hashCode() );
         result = 37 * result + ( getMinLatency() == null ? 0 : this.getMinLatency().hashCode() );
         result = 37 * result + ( getAvgLatency() == null ? 0 : this.getAvgLatency().hashCode() );
         result = 37 * result + ( getMaxLatency() == null ? 0 : this.getMaxLatency().hashCode() );
         return result;
   }   


}


