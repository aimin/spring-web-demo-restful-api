package clue.model;

import java.io.Serializable;

/**
 * cl_trade_org
 * @author 
 */
public class ClTradeOrg implements Serializable {
    /**
     * 机构id
     */
    private Integer oid;

    /**
     * 机构名称
     */
    private String oname;

    /**
     * 机构联系人
     */
    private String linkman;

    /**
     * 机构联系电话
     */
    private String linktel;

    /**
     * 机构状态：1正常，-1无效
     */
    private Byte status;

    /**
     * 推送前的md5排重接口
     */
    private String chkDupUrl;

    /**
     * 数据推送地址
     */
    private String pushUrl;

    private Long createtime;

    private Long lasttime;

    /**
     * 推送数据签名密钥
     */
    private String pushSecret;

    private static final long serialVersionUID = 1L;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinktel() {
        return linktel;
    }

    public void setLinktel(String linktel) {
        this.linktel = linktel;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getChkDupUrl() {
        return chkDupUrl;
    }

    public void setChkDupUrl(String chkDupUrl) {
        this.chkDupUrl = chkDupUrl;
    }

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Long getLasttime() {
        return lasttime;
    }

    public void setLasttime(Long lasttime) {
        this.lasttime = lasttime;
    }

    public String getPushSecret() {
        return pushSecret;
    }

    public void setPushSecret(String pushSecret) {
        this.pushSecret = pushSecret;
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
        ClTradeOrg other = (ClTradeOrg) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
            && (this.getOname() == null ? other.getOname() == null : this.getOname().equals(other.getOname()))
            && (this.getLinkman() == null ? other.getLinkman() == null : this.getLinkman().equals(other.getLinkman()))
            && (this.getLinktel() == null ? other.getLinktel() == null : this.getLinktel().equals(other.getLinktel()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getChkDupUrl() == null ? other.getChkDupUrl() == null : this.getChkDupUrl().equals(other.getChkDupUrl()))
            && (this.getPushUrl() == null ? other.getPushUrl() == null : this.getPushUrl().equals(other.getPushUrl()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()))
            && (this.getPushSecret() == null ? other.getPushSecret() == null : this.getPushSecret().equals(other.getPushSecret()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getOname() == null) ? 0 : getOname().hashCode());
        result = prime * result + ((getLinkman() == null) ? 0 : getLinkman().hashCode());
        result = prime * result + ((getLinktel() == null) ? 0 : getLinktel().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getChkDupUrl() == null) ? 0 : getChkDupUrl().hashCode());
        result = prime * result + ((getPushUrl() == null) ? 0 : getPushUrl().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        result = prime * result + ((getPushSecret() == null) ? 0 : getPushSecret().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", oname=").append(oname);
        sb.append(", linkman=").append(linkman);
        sb.append(", linktel=").append(linktel);
        sb.append(", status=").append(status);
        sb.append(", chkDupUrl=").append(chkDupUrl);
        sb.append(", pushUrl=").append(pushUrl);
        sb.append(", createtime=").append(createtime);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", pushSecret=").append(pushSecret);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}