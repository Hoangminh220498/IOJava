package basic.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameStudent;
		String idStudent;
		String cmndStudent;
		String nameClassStu;
		String nameSchoolStu;
		float diemTrungBinh;
		
		/*Thong tin cong dan*/
		
		String namePerson;
		String adressPerson;
		String numberPhonePerson;
		float heSoLuongPerson;
		
		/* Thong tin xe*/
		
		String nameCar;
		String hangCar;
		int giaCar;
		String colorCar;
		
		/* Thong tin sinh vien thu nhat*/
		nameStudent = "Nguyen A";
		idStudent  = "2060123";
		cmndStudent = " 197371293";
		nameClassStu = "20CDTH41";
		nameSchoolStu = "HueIC";
		diemTrungBinh = 9.6f;
		
		/*Thong tin Person thu nhat */
		namePerson = " Nguyen K";
		adressPerson = " Kiet 10 Hai Ba trung";
		numberPhonePerson = " 0869732014";
		heSoLuongPerson = 3.2f;
		
		//Thong tin xe thu nhat
		nameCar = "Xe Mercedes Pro";
		hangCar = "Mercedes";
		giaCar = 2000000;
		colorCar = "Red";
		
		//In ra thong tin sinh vien thu nhat 
		System.out.println("Thong tin SV thu nhat:");
		System.out.printf("Ho va ten: %s, ID = %s, So CMND = %s, Lop: %s, Truong: %s, Diem trung binh: %f\n "
							,nameStudent,idStudent,cmndStudent,nameClassStu,nameSchoolStu,diemTrungBinh);
		
		//In ra thong tin Person thu nhat 	
		System.out.println("Thong tin Person thu nhat");
		System.out.printf("Ten: %s, Dia chi: %s, So dien thoai: %s, He so luong: %f\n"
							,namePerson,adressPerson,numberPhonePerson,heSoLuongPerson);
		
		// In ra thong tin Xe thu nhat
		
		System.out.println("Thong tin xe thu nhat:");
		System.out.printf("Ten xe: %s, Hang: %s, gia: %d, Mau: %s", nameCar,hangCar,giaCar,colorCar);
		
		System.out.println("\n-------------------------------------");
		
		/* Thong tin sinh vien thu hai*/
		nameStudent = "Tran V";
		idStudent  = "2060000";
		cmndStudent = " 162021535";
		nameClassStu = "20CDTH41";
		nameSchoolStu = "HueIC";
		diemTrungBinh = 8.0f;
		
		/*Thong tin Person thu hai */
		namePerson = " Tran B";
		adressPerson = " Kiet 6 tran Phu";
		numberPhonePerson = " 0869732019";
		heSoLuongPerson = 3.2f;
		
		//Thong tin xe thu hai */
		nameCar = "Xe Mercedes Limited";
		hangCar = "Mercedes";
		giaCar = 10000000;
		colorCar = "red";
		
		//In ra thong tin sinh vien thu hai
		System.out.println("Thong tin SV thu hai:");
		System.out.printf("Ho va ten: %s, ID = %s, So CMND = %s, Lop: %s, Truong: %s, Diem trung binh: %f\n "
							,nameStudent,idStudent,cmndStudent,nameClassStu,nameSchoolStu,diemTrungBinh);
		
		//In ra thong tin Person thu hai 	
		System.out.println("Thong tin Person thu hai");
		System.out.printf("Ten: %s, Dia chi: %s, So dien thoai: %s, He so luong: %f\n"
							,namePerson,adressPerson,numberPhonePerson,heSoLuongPerson);
		
		// In ra thong tin Xe thu hai
		
		System.out.println("Thong tin xe thu hai:");
		System.out.printf("Ten xe: %s, Hang: %s, gia: %d, Mau: %s", nameCar,hangCar,giaCar,colorCar);
		
		

	}

}
