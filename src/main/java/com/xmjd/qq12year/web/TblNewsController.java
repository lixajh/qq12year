package com.xmjd.qq12year.web;
import com.xmjd.qq12year.core.Result;
import com.xmjd.qq12year.core.ResultGenerator;
import com.xmjd.qq12year.model.TblNews;
import com.xmjd.qq12year.service.TblNewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/12/17.
*/
@RestController
@RequestMapping("/tbl/news")
public class TblNewsController {
    @Resource
    private TblNewsService tblNewsService;

    @PostMapping("/add")
    public Result add(TblNews tblNews) {
        tblNewsService.save(tblNews);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tblNewsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TblNews tblNews) {
        tblNewsService.update(tblNews);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        TblNews tblNews = tblNewsService.findById(id);
        return ResultGenerator.genSuccessResult(tblNews);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TblNews> list = tblNewsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
