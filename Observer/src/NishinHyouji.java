class NishinHyouji implements Observer {
 public void update(Subject s) {
 print(((Suuchi)s).getValue());
 }
 private void print(int n) {
 System.out.println( n + "‚ğ 2 i”‚Å•\¦‚µ‚Ü‚·");
 System.out.println(Integer.toBinaryString(n));
 }
}