class Radio extends Seihin {
	 private int radioSerialNumber;
	 public void numberring() {
	 radioSerialNumber = Counter.getRadioNumber();
	 }
	 public void print() {
	 System.out.println("���̃��W�I�Ɋւ�����:");
	 System.out.println(" �����ԍ�:" + radioSerialNumber);
	 }
	}