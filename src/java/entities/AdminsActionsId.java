package entities;
// Generated Mar 22, 2014 4:52:46 PM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;

/**
 * AdminsActionsId generated by hbm2java
 */
@Embeddable
public class AdminsActionsId  implements java.io.Serializable {


     private BigDecimal adminId;
     private BigDecimal employeeId;
     private Date actionDate;

    public AdminsActionsId() {
    }

    public AdminsActionsId(BigDecimal adminId, BigDecimal employeeId, Date actionDate) {
       this.adminId = adminId;
       this.employeeId = employeeId;
       this.actionDate = actionDate;
    }
   

    @Column(name="ADMIN_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getAdminId() {
        return this.adminId;
    }
    
    public void setAdminId(BigDecimal adminId) {
        this.adminId = adminId;
    }

    @Column(name="EMPLOYEE_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(BigDecimal employeeId) {
        this.employeeId = employeeId;
    }

    @Column(name="ACTION_DATE", nullable=false, length=7)
     @Temporal(javax.persistence.TemporalType.DATE)
    public Date getActionDate() {
        return this.actionDate;
    }
    
    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AdminsActionsId) ) return false;
		 AdminsActionsId castOther = ( AdminsActionsId ) other; 
         
		 return ( (this.getAdminId()==castOther.getAdminId()) || ( this.getAdminId()!=null && castOther.getAdminId()!=null && this.getAdminId().equals(castOther.getAdminId()) ) )
 && ( (this.getEmployeeId()==castOther.getEmployeeId()) || ( this.getEmployeeId()!=null && castOther.getEmployeeId()!=null && this.getEmployeeId().equals(castOther.getEmployeeId()) ) )
 && ( (this.getActionDate()==castOther.getActionDate()) || ( this.getActionDate()!=null && castOther.getActionDate()!=null && this.getActionDate().equals(castOther.getActionDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getAdminId() == null ? 0 : this.getAdminId().hashCode() );
         result = 37 * result + ( getEmployeeId() == null ? 0 : this.getEmployeeId().hashCode() );
         result = 37 * result + ( getActionDate() == null ? 0 : this.getActionDate().hashCode() );
         return result;
   }   


}


