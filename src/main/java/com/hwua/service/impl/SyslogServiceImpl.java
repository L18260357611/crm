package com.hwua.service.impl;

import com.hwua.mapper.SyslogMapper;
import com.hwua.pojo.Syslog;
import com.hwua.service.SyslogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SyslogServiceImpl implements SyslogService {
    @Autowired
    private SyslogMapper mapper;
    @Override
    public List<Syslog> queryall() throws Exception {
        return mapper.queryall();
    }

    @Override
    public int addSyslog(Syslog syslog) throws Exception {
        return mapper.addSyslog(syslog);
    }
}
