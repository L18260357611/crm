package com.hwua.mapper;

import com.hwua.pojo.Syslog;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface SyslogMapper {
    //查看所有日志
    public List<Syslog> queryall()throws Exception;

    //添加日志
    public  int addSyslog(Syslog syslog)throws Exception;
}
