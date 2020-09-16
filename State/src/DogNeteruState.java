class NateruState extends DogState {
 private static NeteruState s = new FutsuuState();
 private NateruState() {}
 public static DogState getInstance() {
 return s;
 }
 public void tabeta(Dog moto) {
 moto.changeState(NeteruState.getInstance());
 }
 public void Jikan(Dog moto) {
	 moto.chengeState(FutsuuState.getInstance());
 }
 }
 public String toString() {
 return "•’Êó‘Ô";
 }
}