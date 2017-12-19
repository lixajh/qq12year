package com.xmjd.qq12year.web;
import com.xmjd.qq12year.core.Result;
import com.xmjd.qq12year.core.ResultGenerator;
import com.xmjd.qq12year.model.TblTvShow;
import com.xmjd.qq12year.service.TblTvShowService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/12/19.
*/
@RestController
@RequestMapping("/tbl/tv/show")
public class TblTvShowController {
    @Resource
    private TblTvShowService tblTvShowService;

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
