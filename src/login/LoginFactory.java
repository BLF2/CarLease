package login;

import java.sql.SQLException;

import dbOp.*;

public class LoginFactory {
	private int loginId;
	private String loginName;
	private String loginPswd;
	private int loginNum;//身份识别，1 管理员  2 普通用户
	public LoginFactory(){}
	public int getLoginId() {
		return loginId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		boolean flag = true;
		for(int i = 0;i < loginName.length();i++){
			if(!(Character.isAlphabetic(loginName.charAt(i))|| Character.isDigit(loginName.charAt(i))|| loginName.charAt(i) == '_')){
				flag = false;
				break;
			}
		}
		if(flag)
			this.loginName = loginName;
	}
	public String getLoginPswd() {
		return loginPswd;
	}
	public void setLoginPswd(String loginPswd) {
		boolean flag = true;
		for(int i = 0;i < loginPswd.length();i++){
			if(!(Character.isAlphabetic(loginPswd.charAt(i))|| Character.isDigit(loginPswd.charAt(i))|| loginPswd.charAt(i) == '_')){
				flag = false;
				break;
			}
		}
		if(flag)
			this.loginPswd = loginPswd;
	}
	public int getLoginNum() {
		return loginNum;
	}
	public void setLoginNum(int loginNum) {
		if(loginNum == 1 || loginNum == 2)
			this.loginNum = loginNum;
	}
	public LoginInfo getLoginInfo() throws SQLException{
		LoginInfo li = new LoginInfo(loginId,loginName,loginPswd,loginNum);
		li.setLoginId(new DbRead().DbReadLoginInfoByName(loginName).getLoginId());
		return li;
	}
}
