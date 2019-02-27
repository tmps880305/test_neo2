package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tblhitrecords {
    @Id
    private Integer id;
    private String srcId;
    private String queryImage;
    private Date createTime;
    private Integer memberId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSrcId() {
        return srcId;
    }

    public void setSrcId(String srcId) {
        this.srcId = srcId;
    }

    public String getQueryImage() {
        return queryImage;
    }

    public void setQueryImage(String queryImage) {
        this.queryImage = queryImage;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }


    @Override
    public String toString() {
        return "Tblhitrecords{" +
                "id=" + id +
                ", srcId='" + srcId + '\'' +
                ", queryImage='" + queryImage + '\'' +
                ", createTime=" + createTime +
                ", memberId=" + memberId +
                '}';
    }

}
