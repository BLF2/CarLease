package car;

import java.sql.SQLException;

import dbOp.*;

public class CarFactory {
	private int carId;
	private String carPlate;//牌照
	private String carModel;//型号
	private String carLeaseDate;//租借日期
	private String carReaturnDate;//归还日期
	public CarFactory(){}
	public int getCarId() {
		return carId;
	}

	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		if(carPlate.length() < 8)
			this.carPlate = carPlate;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		if(carModel.length() < 8)
		this.carModel = carModel;
	}

	public String getCarLeaseDate() {
		return carLeaseDate;
	}
	public void setCarLeaseDate(String carLeaseDate) {
		if(carLeaseDate.length() == 8)
			this.carLeaseDate = carLeaseDate;
	}
	public String getCarReaturnDate() {
		return carReaturnDate;
	}
	public void setCarReaturnDate(String carReaturnDate) {
		if(carReaturnDate.length() == 8)
			this.carReaturnDate = carReaturnDate;
	}
	public CarInfo getCarInfo() throws SQLException{
		CarInfo ci = new CarInfo(this.carId,this.carPlate,this.carModel,this.carLeaseDate,this.carReaturnDate);
		if(new DbInsert().DbInsertCarInfo(ci) > 0){
			ci.setCarId(new DbRead().DbReadCarInfoByPlate(carPlate).getCarId());
			return ci;
		}
		return null;
	}
}
