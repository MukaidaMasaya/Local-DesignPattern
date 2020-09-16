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
 System.out.println("‚±‚ÌƒeƒŒƒr‚ÉŠÖ‚·‚éî•ñ:");
 System.out.println(" »‘¢”Ô†:" + tvSerialNumber);
 System.out.println(" »‘¢”NŒ“ú:" + date);
 }
}