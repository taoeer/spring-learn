package top.taoeer.domain;

import java.util.Date;

public class LoginLog {
    private int loginLogId;
    private int userId;
    private String ip;
    private Date loginDate;

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getIp() {

        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getUserId() {

        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLoginLogId() {

        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }
}
