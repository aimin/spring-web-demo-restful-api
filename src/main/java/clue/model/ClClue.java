package clue.model;

import java.io.Serializable;
import java.util.Date;

/**
 * cl_clue
 * @author 
 */
public class ClClue implements Serializable {
    /**
     * 线索id 
     */
    private Long clId;

    /**
     * 线索类型：1.出售二手车 2.求购二手车
     */
    private Integer clType;

    /**
     * 线索状态：-1.删除 1.新建 2.成功推送 3.采纳 4.实现增值 5.无平台采纳 
     */
    private Integer clStatus;

    private Date createtime;

    private Date lasttime;

    /**
     * 线索联系电话
     */
    private String clLinkMob;

    /**
     * 线索联系人
     */
    private String clLinkMan;

    /**
     * 线索描述
     */
    private String clDesc;

    private static final long serialVersionUID = 1L;

    public Long getClId() {
        return clId;
    }

    public void setClId(Long clId) {
        this.clId = clId;
    }

    public Integer getClType() {
        return clType;
    }

    public void setClType(Integer clType) {
        this.clType = clType;
    }

    public Integer getClStatus() {
        return clStatus;
    }

    public void setClStatus(Integer clStatus) {
        this.clStatus = clStatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public String getClLinkMob() {
        return clLinkMob;
    }

    public void setClLinkMob(String clLinkMob) {
        this.clLinkMob = clLinkMob;
    }

    public String getClLinkMan() {
        return clLinkMan;
    }

    public void setClLinkMan(String clLinkMan) {
        this.clLinkMan = clLinkMan;
    }

    public String getClDesc() {
        return clDesc;
    }

    public void setClDesc(String clDesc) {
        this.clDesc = clDesc;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ClClue other = (ClClue) that;
        return (this.getClId() == null ? other.getClId() == null : this.getClId().equals(other.getClId()))
            && (this.getClType() == null ? other.getClType() == null : this.getClType().equals(other.getClType()))
            && (this.getClStatus() == null ? other.getClStatus() == null : this.getClStatus().equals(other.getClStatus()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()))
            && (this.getClLinkMob() == null ? other.getClLinkMob() == null : this.getClLinkMob().equals(other.getClLinkMob()))
            && (this.getClLinkMan() == null ? other.getClLinkMan() == null : this.getClLinkMan().equals(other.getClLinkMan()))
            && (this.getClDesc() == null ? other.getClDesc() == null : this.getClDesc().equals(other.getClDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClId() == null) ? 0 : getClId().hashCode());
        result = prime * result + ((getClType() == null) ? 0 : getClType().hashCode());
        result = prime * result + ((getClStatus() == null) ? 0 : getClStatus().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        result = prime * result + ((getClLinkMob() == null) ? 0 : getClLinkMob().hashCode());
        result = prime * result + ((getClLinkMan() == null) ? 0 : getClLinkMan().hashCode());
        result = prime * result + ((getClDesc() == null) ? 0 : getClDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clId=").append(clId);
        sb.append(", clType=").append(clType);
        sb.append(", clStatus=").append(clStatus);
        sb.append(", createtime=").append(createtime);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", clLinkMob=").append(clLinkMob);
        sb.append(", clLinkMan=").append(clLinkMan);
        sb.append(", clDesc=").append(clDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}