package com.xmjd.qq12year.web;

import com.xmjd.qq12year.service.TblTvShowService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* Created by CodeGenerator on 2017/12/11.
*/
@RestController
@RequestMapping("/demo")
public class TblTvShowController {
    @Resource
    private TblTvShowService tblTvShowService;

    @RequestMapping("getList")
    @ResponseBody
    public Map<String,List<String>> getList(HttpServletRequest request){
        List<String> list = tblTvShowService.getList();
        Map<String,List<String>> returnMap = new HashMap<>();
        returnMap.put("date", list);
        return returnMap;
//		return "{\"date\":[\"2017-12-09\",\"2017-12-08\"]}";
    }


    @RequestMapping("getDateRecord")
    @ResponseBody
    public Map<String,Object> getDateRecord(HttpServletRequest request,String date){
        Map<String,Object> returnMap = tblTvShowService.getRecord(date);

        return returnMap;
//		return "{\"date\":[\"2017-12-09\",\"2017-12-08\"]}";
    }
}
