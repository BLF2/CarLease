package login;

public class LoginCar {
	private int loginId;
	private int carId;
	public LoginCar(){}
	public LoginCar(int loginId,int carId){
		this.loginId = loginId;
		this.carId = carId;
	}
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
}
