package entities;
// Generated Mar 22, 2014 4:52:46 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AdminsActions generated by hbm2java
 */
@Entity
@Table(name="ADMINS_ACTIONS"
    ,schema="PARKING"
)
public class AdminsActions  implements java.io.Serializable {


     private AdminsActionsId id;
     private Employees employeesByEmployeeId;
     private Employees employeesByAdminId;
     private char actionType;

    public AdminsActions() {
    }

    public AdminsActions(AdminsActionsId id, Employees employeesByEmployeeId, Employees employeesByAdminId, char actionType) {
       this.id = id;
       this.employeesByEmployeeId = employeesByEmployeeId;
       this.employeesByAdminId = employeesByAdminId;
       this.actionType = actionType;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="adminId", column=@Column(name="ADMIN_ID", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="employeeId", column=@Column(name="EMPLOYEE_ID", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="actionDate", column=@Column(name="ACTION_DATE", nullable=false, length=7) ) } )
    public AdminsActionsId getId() {
        return this.id;
    }
    
    public void setId(AdminsActionsId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EMPLOYEE_ID", nullable=false, insertable=false, updatable=false)
    public Employees getEmployeesByEmployeeId() {
        return this.employeesByEmployeeId;
    }
    
    public void setEmployeesByEmployeeId(Employees employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ADMIN_ID", nullable=false, insertable=false, updatable=false)
    public Employees getEmployeesByAdminId() {
        return this.employeesByAdminId;
    }
    
    public void setEmployeesByAdminId(Employees employeesByAdminId) {
        this.employeesByAdminId = employeesByAdminId;
    }
    
    @Column(name="ACTION_TYPE", nullable=false, length=1)
    public char getActionType() {
        return this.actionType;
    }
    
    public void setActionType(char actionType) {
        this.actionType = actionType;
    }




}


