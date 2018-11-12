package com.laoxu.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 所在包：com.laoxu.test.controller
 * 文件名：
 * 项目：freemarkerTest
 * 功能描述：
 * 修改人：xdc
 * 修改时间：2018-11-09 15:13
 */

@Controller
@RequestMapping("/index")
public class FreeMarkerTest {

    //能转换jsp 和 html(ftl 两个只能设置一个)  跳转的地址其实就是 yml 文件里面设置，或者加载的Bean
    //page 其实就是页面的的名字
    @GetMapping("/{page}")
    public ModelAndView indexs (@PathVariable("page") String page,Map map) {
        ModelAndView mv =new ModelAndView(page);
        map.put("name", "Joe");
        map.put("sex", 1);    //sex:性别，1：男；0：女；
        // 模拟数据
        List<Map<String, Object>> friends = new ArrayList<Map<String, Object>>();
        Map<String, Object> friend = new HashMap<String, Object>();
        friend.put("name", "xbq");
        friend.put("age", 22);
        friends.add(friend);
        friend = new HashMap<String, Object>();
        friend.put("name", "July");
        friend.put("age", 18);
        friends.add(friend);
        map.put("friends", friends);
        return mv;
    }

}
