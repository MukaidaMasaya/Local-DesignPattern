class Radio extends Seihin {
	 private int radioSerialNumber;
	 public void numberring() {
	 radioSerialNumber = Counter.getRadioNumber();
	 }
	 public void print() {
	 System.out.println("‚±‚Ìƒ‰ƒWƒI‚ÉŠÖ‚·‚éî•ñ:");
	 System.out.println(" »‘¢”Ô†:" + radioSerialNumber);
	 }
	}