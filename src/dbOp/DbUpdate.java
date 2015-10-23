package dbOp;

import login.*;
import java.sql.*;

public class DbUpdate {
	private Statement state;
	public DbUpdate() throws SQLException{
		state = DbDriver.createStatement();
	}
	public int DbUpdateLoginInfo(LoginInfo li) throws SQLException{
		String sql = "update LoginInfo set LoginName='"+li.getLoginName()+"',LoginPswd='"+li.getLoginPswd()+"'+LoginNum="+li.getLoginNum()+" where LoginId="+li.getLoginId()+";";
		return state.executeUpdate(sql);
	}
}
