package car;

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
	public CarInfo getCarInfo(){
		//数据库持久化
		//carInfo ci = new carInfo(this.get);
		return null;
	}
}
