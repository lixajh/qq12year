package com.xmjd.qq12year.web;
import com.xmjd.qq12year.core.Result;
import com.xmjd.qq12year.core.ResultGenerator;
import com.xmjd.qq12year.model.TblNews;
import com.xmjd.qq12year.model.TblTvShow;
import com.xmjd.qq12year.service.TblNewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xmjd.qq12year.utils.PkUtils;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
* Created by CodeGenerator on 2017/12/19.
*/
@RestController
@RequestMapping("/news")
public class TblNewsController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   //true:允许输入空值，false:不能为空值
    }
    @Resource
    private TblNewsService tblNewsService;

    @PostMapping("/add")
    public Result add(TblNews tblNews) {
        tblNewsService.save(tblNews);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String id) {
        tblNewsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TblNews tblNews) {
        tblNewsService.update(tblNews);
        return ResultGenerator.genSuccessResult();
    }

    @RequestMapping("/detail")
    public Result detail(Date date) {
        TblNews tvShow = tblNewsService.findByDate( date);
        return ResultGenerator.genSuccessResult(tvShow);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TblNews> list = tblNewsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/edit")
    public Result edit(TblNews tblNews) {
        TblNews tvShow = tblNewsService.findByDate(tblNews.getmDate());
        if(tvShow != null){
            tblNews.setPkGlobalId(tvShow.getPkGlobalId());
            tblNewsService.update(tblNews);
        }else{
            tblNews.setPkGlobalId(PkUtils.getPk());
            tblNewsService.save(tblNews);
        }

        return ResultGenerator.genSuccessResult();
    }


}
