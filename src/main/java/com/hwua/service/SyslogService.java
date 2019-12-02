package com.hwua.service;

import com.hwua.pojo.Syslog;

import java.util.List;

public interface SyslogService {
    //查看所有日志
    public List<Syslog> queryall()throws Exception;
    //添加日志
    public  int addSyslog(Syslog syslog)throws Exception;
}
