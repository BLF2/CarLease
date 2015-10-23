package dbOp;

import car.*;
import login.*;
import java.sql.*;
import java.util.*;

public class DbRead {
	private Statement state;
	public DbRead() throws SQLException{
		state = DbDriver.createStatement();
	}
	public CarInfo DbReadCarInfoByPlate(String carPlate) throws SQLException{
		String str = "select * from CarInfo where CarPlate ='"+carPlate+"';";
		ResultSet rs = state.executeQuery(str);
		if(rs.next()){
			return  new CarInfo(Integer.parseInt(rs.getString("CarId")),rs.getString("CarPlate"),rs.getString("CarModel"),rs.getString("CarLeaseDate"),rs.getString("CarReturnDate"));
		}
		return null;
	}
	public LoginInfo DbReadLoginInfoByName(String LoginName) throws SQLException{
		String str = "select * from LoginInfo where LoginName='"+LoginName+"';";
		ResultSet rs = state.executeQuery(str);
		if(rs.next()){
			return new LoginInfo(Integer.parseInt(rs.getString("LoginId")),rs.getString("LoginName"),rs.getString("LoginPswd"),Integer.parseInt(rs.getString("LoginNum")));
		}
		return null;
	}
	public LinkedList<LoginInfo> DbReadLoginInfoAll() throws SQLException{
		LinkedList<LoginInfo>list = new LinkedList<LoginInfo>();
		ResultSet rs = state.executeQuery("select * from LoginInfo;");
		while(rs.next()){
			list.add(new LoginInfo(Integer.parseInt(rs.getString("LoginId")),rs.getString("LoginName"),rs.getString("LoginPswd"),Integer.parseInt(rs.getString("LoginNum"))));
		}
		return list;
	}
	public LinkedList<CarInfo> DbReadCarInfoAll() throws SQLException{
		LinkedList<CarInfo>list = new LinkedList<CarInfo>();
		ResultSet rs = state.executeQuery("select * from CarLoginInfo;");
		while(rs.next()){
			CarInfo ci = new CarInfo();
			ci.setCarId(Integer.parseInt(rs.getString("CarId")));
			ci.setCarPlate(rs.getString("CarPlate"));
			ci.setCarModel(rs.getString("CarModel"));
			ci.setCarLeaseDate(rs.getString("CarLeaseDate"));
			ci.setCarReaturnDate(rs.getString("carReaturnDate"));
			list.add(ci);
		}
		return list;
	}
}
