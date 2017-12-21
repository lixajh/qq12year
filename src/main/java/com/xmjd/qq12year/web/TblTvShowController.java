package com.xmjd.qq12year.web;
import com.xmjd.qq12year.core.Result;
import com.xmjd.qq12year.core.ResultGenerator;
import com.xmjd.qq12year.model.TblTvShow;
import com.xmjd.qq12year.service.TblTvShowService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* Created by CodeGenerator on 2017/12/19.
*/
@RestController
@RequestMapping("/demo")
public class TblTvShowController {
    @Resource
    private TblTvShowService tblTvShowService;

    @RequestMapping("getToday")
    @ResponseBody
    public Result getToday(HttpServletRequest request){
        TblTvShow record = tblTvShowService.getToday();


        return  ResultGenerator.genSuccessResult(record);
    }

     @RequestMapping("getList")
     @ResponseBody
     public Map<String,List<String>> getList(HttpServletRequest request){
        List<String> list = tblTvShowService.getList();
        Map<String,List<String>> returnMap = new HashMap<>();
        returnMap.put("date", list);
        return returnMap;
      }
 
         
             @RequestMapping("getDateRecord")
     @ResponseBody
     public Map<String,Object> getDateRecord(HttpServletRequest request,String date){
                Map<String,Object> returnMap = tblTvShowService.getRecord(date);
        
                        return returnMap;
        //		return "{\"date\":[\"2017-12-09\",\"2017-12-08\"]}";
                    }
    @PostMapping("/add")
    public Result add(TblTvShow tblTvShow) {
        tblTvShowService.save(tblTvShow);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        tblTvShowService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TblTvShow tblTvShow) {
        tblTvShowService.update(tblTvShow);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/detail")
    public Result detail(@RequestParam String id) {
        TblTvShow tblTvShow = tblTvShowService.findById(id);
        return ResultGenerator.genSuccessResult(tblTvShow);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TblTvShow> list = tblTvShowService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
