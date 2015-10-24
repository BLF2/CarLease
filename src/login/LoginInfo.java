package login;

public class LoginInfo {
	private int loginId;
	private String loginName;
	private String loginPswd;
	private int loginNum;//身份识别，1 管理员  2 普通用户
	public LoginInfo(){}
	public LoginInfo(int loginId,String loginName,String loginPswd,int loginNum ){
		this.loginId = loginId;
		this.loginName = loginName;
		this.loginPswd = loginPswd;
		this.loginNum = loginNum;
	}
	public void setLoginId(int loginId){
		this.loginId = loginId;
	}
	public int getLoginId() {
		return loginId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPswd() {
		return loginPswd;
	}
	public void setLoginPswd(String loginPswd) {
		this.loginPswd = loginPswd;
	}
	public int getLoginNum() {
		return loginNum;
	}
	public void setLoginNum(int loginNum) {
		this.loginNum = loginNum;
	}
	
}
