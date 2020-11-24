package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	private String name, email;
	private String birthDate;
	public Client(String name, String email, String birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	public Client() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String toString() {
		return "Client: "
				+ name
				+ " ("
				+ birthDate
				+ ") - "
				+ email;
	}
}
