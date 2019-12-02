package com.hwua.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hwua.pojo.Syslog;
import com.hwua.service.impl.SyslogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SyslogController {
    @Autowired
    private SyslogServiceImpl syslogService;
    //查找所有的记录
    @RequestMapping("/findallSyslog/{PageNum}/{PageSize}")
    public ModelAndView findallSyslog(@PathVariable("PageNum") int PageNum,@PathVariable("PageSize") int PageSize) throws Exception {
        PageHelper.startPage(PageNum,PageSize);
        ModelAndView view = new ModelAndView("pages/syslog-list");
        List<Syslog> syslogs = syslogService.queryall();
        PageInfo<Syslog> pageInfo = new PageInfo(syslogs);
        view.addObject("sysLogs",pageInfo);
        return view;
    }
}
