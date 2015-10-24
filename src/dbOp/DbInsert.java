package dbOp;

import car.*;
import login.*;
import java.sql.*;
import java.util.*;

public class DbInsert {
	private Statement state;
	public DbInsert() throws SQLException{
		state = DbDriver.createStatement();
	}
	public int DbInsertLoginInfo(LoginInfo li) throws SQLException{
		String sql = "insert into LoginInfo values(default,'"+li.getLoginName()+"','"+li.getLoginPswd()+"',"+li.getLoginNum()+");";
		return  state.executeUpdate(sql);	
	}
	public int DbInsertCarInfo(CarInfo ci) throws SQLException{
		String sql="insert into CarInfo values(default,'"+ci.getCarPlate()+"','"+ci.getCarModel()+"','"+ci.getCarLeaseDate()+"','"+ci.getCarReaturnDate()+"');";
		return state.executeUpdate(sql);
	}
	public int DbInsertLoginCar(LoginCar lc)throws SQLException{
		String sql = "insert into CarInfo values("+lc.getLoginId()+","+lc.getCarId()+");";
		return state.executeUpdate(sql);
	}
	public void DbInsertLoginCar(List <LoginCar> list)throws SQLException{
		Iterator<LoginCar>iter = list.iterator();
		LoginCar lc = new LoginCar();
		while(iter.hasNext()){
			lc = iter.next();
			String sql = "insert into CarInfo values("+lc.getLoginId()+","+lc.getCarId()+");";
			state.executeUpdate(sql);
		}
	}
}
