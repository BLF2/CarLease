package car;

public class CarInfo {
	private int carId;
	private String carPlate;//牌照
	private String carModel;//型号
	private String carLeaseDate;//租借日期
	private String carReaturnDate;//归还日期
	public CarInfo(){}
	public CarInfo(int carId,String carPlate,String carModel,String carLeaseDate,String carReturnDate){
		this.carId = carId;
		this.carPlate = carPlate;
		this.carModel = carModel;
		this.carLeaseDate = carLeaseDate;
		this.carReaturnDate = carReturnDate;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarPlate() {
		return carPlate;
	}
	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarLeaseDate() {
		return carLeaseDate;
	}
	public void setCarLeaseDate(String carLeaseDate) {
		this.carLeaseDate = carLeaseDate;
	}
	public String getCarReaturnDate() {
		return carReaturnDate;
	}
	public void setCarReaturnDate(String carReaturnDate) {
		this.carReaturnDate = carReaturnDate;
	}
}
