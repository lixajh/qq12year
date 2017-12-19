package com.xmjd.qq12year.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tbl_tv_show")
public class TblTvShow {
    @Id
    @Column(name = "pk_global_id")
    private String pkGlobalId;

    @Column(name = "m_date")
    private Date mDate;

    private String audio;

    /**
     * 0:没有 1:有
     */
    @Column(name = "have_show")
    private Integer haveShow;

    /**
     * @return pk_global_id
     */
    public String getPkGlobalId() {
        return pkGlobalId;
    }

    /**
     * @param pkGlobalId
     */
    public void setPkGlobalId(String pkGlobalId) {
        this.pkGlobalId = pkGlobalId;
    }

    /**
     * @return m_date
     */
    public Date getmDate() {
        return mDate;
    }

    /**
     * @param mDate
     */
    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    /**
     * @return audio
     */
    public String getAudio() {
        return audio;
    }

    /**
     * @param audio
     */
    public void setAudio(String audio) {
        this.audio = audio;
    }

    /**
     * 获取0:没有 1:有
     *
     * @return have_show - 0:没有 1:有
     */
    public Integer getHaveShow() {
        return haveShow;
    }

    /**
     * 设置0:没有 1:有
     *
     * @param haveShow 0:没有 1:有
     */
    public void setHaveShow(Integer haveShow) {
        this.haveShow = haveShow;
    }
}