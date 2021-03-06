package entities;
// Generated Mar 22, 2014 4:52:46 PM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Map generated by hbm2java
 */
@Entity
@Table(name="MAP"
    ,schema="PARKING"
)
public class Map  implements java.io.Serializable {


     private BigDecimal mapId;
     private String mapUrl;
     private String ratio;
     private BigDecimal width;
     private BigDecimal height;
     private String unit;
     private Set garages = new HashSet(0);

    public Map() {
    }

	
    public Map(BigDecimal mapId, String mapUrl, String ratio, BigDecimal width, BigDecimal height, String unit) {
        this.mapId = mapId;
        this.mapUrl = mapUrl;
        this.ratio = ratio;
        this.width = width;
        this.height = height;
        this.unit = unit;
    }
    public Map(BigDecimal mapId, String mapUrl, String ratio, BigDecimal width, BigDecimal height, String unit, Set garages) {
       this.mapId = mapId;
       this.mapUrl = mapUrl;
       this.ratio = ratio;
       this.width = width;
       this.height = height;
       this.unit = unit;
       this.garages = garages;
    }
   
     @Id 
    
    @Column(name="MAP_ID", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getMapId() {
        return this.mapId;
    }
    
    public void setMapId(BigDecimal mapId) {
        this.mapId = mapId;
    }
    
    @Column(name="MAP_URL", nullable=false, length=200)
    public String getMapUrl() {
        return this.mapUrl;
    }
    
    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }
    
    @Column(name="RATIO", nullable=false, length=20)
    public String getRatio() {
        return this.ratio;
    }
    
    public void setRatio(String ratio) {
        this.ratio = ratio;
    }
    
    @Column(name="WIDTH", nullable=false, precision=22, scale=0)
    public BigDecimal getWidth() {
        return this.width;
    }
    
    public void setWidth(BigDecimal width) {
        this.width = width;
    }
    
    @Column(name="HEIGHT", nullable=false, precision=22, scale=0)
    public BigDecimal getHeight() {
        return this.height;
    }
    
    public void setHeight(BigDecimal height) {
        this.height = height;
    }
    
    @Column(name="UNIT", nullable=false, length=20)
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="map")
    public Set getGarages() {
        return this.garages;
    }
    
    public void setGarages(Set garages) {
        this.garages = garages;
    }




}


