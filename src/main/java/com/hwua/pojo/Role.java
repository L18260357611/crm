package com.hwua.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Role {
  private String id;
  private String roleName;
  private String roleDesc;
  //对应的权限
  private List<Permission> permission;

}
