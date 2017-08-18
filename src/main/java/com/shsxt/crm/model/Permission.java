package com.shsxt.crm.model;

import com.shsxt.crm.base.BaseModel;

/**
 * Created by fjj on 2017/8/17.
 */
public class Permission extends BaseModel {
   /*
    id
    role_id
    module_id
    acl_value
    create_date
    update_date
    is_valid*/

   private Integer roleId;
   private Integer moduleId;
   private String aclValue;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getAclValue() {
        return aclValue;
    }

    public void setAclValue(String aclValue) {
        this.aclValue = aclValue;
    }
}
