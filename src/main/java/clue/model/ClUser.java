package clue.model;

import java.io.Serializable;

/**
 * cl_user
 * @author 
 */
public class ClUser implements Serializable {
    /**
     * 用户id
     */
    private Long uid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 第三方ID
     */
    private String thirdOpenid;

    /**
     * 第三方登录KEY
     */
    private String thirdSessionkey;

    /**
     * 第三方扩展信息
     */
    private String thirdExtInfo;

    /**
     * 创建时间
     */
    private Long createtime;

    /**
     * 最后修改时间
     */
    private Long lasttime;

    /**
     * 注册坐标经
     */
    private Double clLo;

    /**
     * 注册坐标纬
     */
    private Double clLa;

    /**
     * 状态：1 启用 -1禁用
     */
    private Byte status;

    private static final long serialVersionUID = 1L;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getThirdOpenid() {
        return thirdOpenid;
    }

    public void setThirdOpenid(String thirdOpenid) {
        this.thirdOpenid = thirdOpenid;
    }

    public String getThirdSessionkey() {
        return thirdSessionkey;
    }

    public void setThirdSessionkey(String thirdSessionkey) {
        this.thirdSessionkey = thirdSessionkey;
    }

    public String getThirdExtInfo() {
        return thirdExtInfo;
    }

    public void setThirdExtInfo(String thirdExtInfo) {
        this.thirdExtInfo = thirdExtInfo;
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

    public Double getClLo() {
        return clLo;
    }

    public void setClLo(Double clLo) {
        this.clLo = clLo;
    }

    public Double getClLa() {
        return clLa;
    }

    public void setClLa(Double clLa) {
        this.clLa = clLa;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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
        ClUser other = (ClUser) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getThirdOpenid() == null ? other.getThirdOpenid() == null : this.getThirdOpenid().equals(other.getThirdOpenid()))
            && (this.getThirdSessionkey() == null ? other.getThirdSessionkey() == null : this.getThirdSessionkey().equals(other.getThirdSessionkey()))
            && (this.getThirdExtInfo() == null ? other.getThirdExtInfo() == null : this.getThirdExtInfo().equals(other.getThirdExtInfo()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getLasttime() == null ? other.getLasttime() == null : this.getLasttime().equals(other.getLasttime()))
            && (this.getClLo() == null ? other.getClLo() == null : this.getClLo().equals(other.getClLo()))
            && (this.getClLa() == null ? other.getClLa() == null : this.getClLa().equals(other.getClLa()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getThirdOpenid() == null) ? 0 : getThirdOpenid().hashCode());
        result = prime * result + ((getThirdSessionkey() == null) ? 0 : getThirdSessionkey().hashCode());
        result = prime * result + ((getThirdExtInfo() == null) ? 0 : getThirdExtInfo().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLasttime() == null) ? 0 : getLasttime().hashCode());
        result = prime * result + ((getClLo() == null) ? 0 : getClLo().hashCode());
        result = prime * result + ((getClLa() == null) ? 0 : getClLa().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", username=").append(username);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", thirdOpenid=").append(thirdOpenid);
        sb.append(", thirdSessionkey=").append(thirdSessionkey);
        sb.append(", thirdExtInfo=").append(thirdExtInfo);
        sb.append(", createtime=").append(createtime);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", clLo=").append(clLo);
        sb.append(", clLa=").append(clLa);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}