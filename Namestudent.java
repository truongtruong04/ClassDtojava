package Dto;

public class Namestudent {
        public static void main(String[] args) {
            Student sinhVien1 = new Student("", 23);
            Student sinhVien2 = new Student("Peter", 17);


            System.out.println("Sinh viên 1 có tên: " + sinhVien1.getTen() + ", tuổi: " + sinhVien1.getTuoi());
            System.out.println("Sinh viên 2 có tên: " + sinhVien2.getTen() + ", tuổi: " + sinhVien2.getTuoi());
        }
    }

