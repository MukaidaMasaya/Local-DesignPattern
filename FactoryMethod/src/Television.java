class Television extends Seihin {
 private int tvSerialNumber;
 private String date;
 public void numberring() {
 tvSerialNumber = Counter.getTvNumber();
 }
 public void setDate(String date) {
 this.date = date;
 }
 public void print() {
 System.out.println("���̃e���r�Ɋւ�����:");
 System.out.println(" �����ԍ�:" + tvSerialNumber);
 System.out.println(" �����N����:" + date);
 }
}