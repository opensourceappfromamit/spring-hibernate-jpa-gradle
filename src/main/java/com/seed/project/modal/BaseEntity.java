package com.seed.project.modal;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(nullable = true )
    private Date              ts_created;

    @Column(nullable = true )
    private Date              ts_updated;

    @Column(name = "is_active", columnDefinition = "tinyint(1) default 0", nullable = false)
    private Integer             isActive         = 0;

	public Date getCreatedAt() {
        return ts_created;
    }

    public void setCreatedAt(Date ts_created) {
        this.ts_created = ts_created;
    }

    public Date getUpdatedAt() {
        return ts_updated;
    }

    public void setUpdatedAt(Date ts_updated) {
        this.ts_updated = ts_updated;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @PrePersist
    public void setDefaultFields() {
        Date date = getCurrentDate();
        ts_created = date;
        ts_updated = date;
    }

    @PreUpdate
    public void setUpdatedDate() {
    	ts_updated = getCurrentDate();
    }

   public boolean isActive() {
        return isActive == 0 ? false : true;
   }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BaseEntity");
        sb.append(", isActive=").append(isActive);
        sb.append(" }\n");
        return sb.toString();
    }

    private Date getCurrentDate() {
        return Calendar.getInstance().getTime();
    }
}
