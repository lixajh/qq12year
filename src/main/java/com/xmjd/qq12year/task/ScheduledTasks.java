package com.xmjd.qq12year.task;

import com.xmjd.qq12year.service.TblTvShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lix
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018-05-0416:59
 */
@Component
public class ScheduledTasks {
    @Autowired
    private TblTvShowService tblTvShowService;
//0 0-5 0,6,12,18,23 * * ?
    @Scheduled(cron = "0 0-5 0,6,12,18,23 * * *")
    public void reportCurrentTime() {
        tblTvShowService.enableRecordBeforeToday();
    }

}
