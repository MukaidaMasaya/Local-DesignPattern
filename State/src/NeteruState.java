class NeteruState {
private static NeteruState s = new NeteruState();
 private NeteruState() {}

 public static HumanState getInstance() {
 return s;
 }
 public void punch(Human human) {
 human.changeState(KizetsuState.getInstance());
 }
 public void touch(Human human) { 
 human.changestate(OkiteruState.getInstance());
 }

}
