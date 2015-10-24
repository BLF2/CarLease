package dbOp;

import login.*;
import java.sql.*;
import car.*;

public class DbUpdate {
	private Statement state;
	public DbUpdate() throws SQLException{
		state = DbDriver.createStatement();
	}
	public int DbUpdateLoginInfo(LoginInfo li) throws SQLException{
		String sql = "update LoginInfo set LoginName='"+li.getLoginName()+"',LoginPswd='"+li.getLoginPswd()+"'+LoginNum="+li.getLoginNum()+" where LoginId="+li.getLoginId()+";";
		return state.executeUpdate(sql);
	}
	public int DbUpdateCarInfo(CarInfo ci)throws SQLException{
		String sql = "update CarInfo set CarPlate='"+ci.getCarPlate()+"',CarModel='"+ci.getCarModel()+"',CarLeaseDate='"+"'"
	+ci.getCarLeaseDate()+"',CarReturnDate='"+ci.getCarReaturnDate()+"' where CarId="+ci.getCarId()+";";
		return state.executeUpdate(sql);
	}
}
