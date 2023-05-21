package Dto;

public class Student {
        private String ten;
        private int tuoi;

        public Student(String ten, int tuoi) {
            setTen(ten);
            setTuoi(tuoi);
        }

        private void setTen(String ten) {
            if (ten == null || ten.isEmpty()) {
                this.ten = "trường";
            } else {
                this.ten = ten;
            }
        }

        public String getTen() {
            return ten;
        }

        private void setTuoi(int tuoi) {

            if (tuoi > 18) {
                this.tuoi =18;
            } else {
                this.tuoi = -1;
            }
        }

        public String getTuoi() {
            if (this.tuoi != -1) {
                // Tuổi hợp lệ
                return String.valueOf(tuoi);
            } else {
                return "Tuổi không hợp lệ";
            }
        }
    }
