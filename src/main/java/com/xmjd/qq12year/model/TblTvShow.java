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
}