package dbOp;

import java.sql.*;
import login.*;

public class DbDelete {
	private Statement state;
	public DbDelete() throws SQLException{
		state = DbDriver.createStatement();
	}
	public int DbDeleteCarInfoById(int carId) throws SQLException{
		String sql = "delete from CarInfo where CarId="+carId+";";
		return state.executeUpdate(sql);
	}
	public int DbDeleteLoginInfoById(int loginId) throws SQLException{
		String sql = "delete from LoginInfo where LoginId="+loginId+";";
		return state.executeUpdate(sql);
	}
	public int DbDeleteLoginCarByLoginId(int loginId)throws SQLException{
		String sql = "delete from LoginCar where LoginId="+loginId+";";
		return state.executeUpdate(sql);
	}
	public int DbDeleteLoginCarByCarId(int carId)throws SQLException{
		String sql = "delete from LoginCar where CarId="+carId+";";
		return state.executeUpdate(sql);
	}
	public int DbDeleteLoginCar(LoginCar lc)throws SQLException{
		String sql = "delete from LoginCar where loginId="+lc.getLoginId()+",carId="+lc.getCarId()+";";
		return state.executeUpdate(sql);
	}
}
