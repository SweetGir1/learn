package com.cw.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdjustSalary {
    Integer id;
    Integer eid;
    Date adDate;
    Integer beforeSalary;
    Integer afterSalary;
    String reason;
    String remark;

//    public AdjustSalary(Integer id, Integer eid, Date adDate, Integer beforeSalary, Integer afterSalary, String reason, String remark) {
//        this.id = id;
//        this.eid = eid;
//        this.adDate = adDate;
//        this.beforeSalary = beforeSalary;
//        this.afterSalary = afterSalary;
//        this.reason = reason;
//        this.remark = remark;
//    }
//
//    public AdjustSalary() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getEid() {
//        return eid;
//    }
//
//    public void setEid(Integer eid) {
//        this.eid = eid;
//    }
//
//    public Date getAdDate() {
//        return adDate;
//    }
//
//    public void setAdDate(Date adDate) {
//        this.adDate = adDate;
//    }
//
//    public Integer getBeforeSalary() {
//        return beforeSalary;
//    }
//
//    public void setBeforeSalary(Integer beforeSalary) {
//        this.beforeSalary = beforeSalary;
//    }
//
//    public Integer getAfterSalary() {
//        return afterSalary;
//    }
//
//    public void setAfterSalary(Integer afterSalary) {
//        this.afterSalary = afterSalary;
//    }
//
//    public String getReason() {
//        return reason;
//    }
//
//    public void setReason(String reason) {
//        this.reason = reason;
//    }
//
//    public String getRemark() {
//        return remark;
//    }
//
//    public void setRemark(String remark) {
//        this.remark = remark;
//    }
}
