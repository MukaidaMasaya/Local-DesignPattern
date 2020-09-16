class JyuurokushinHyouji implements Observer {
 public void update(Subject s) {
 print(((Suuchi)s).getValue());
 }
 private void print(int n) {
 System.out.println(n + "‚ğ 16 i”‚Å•\¦‚µ‚Ü‚·");
 System.out.println(Integer.toHexString(n));
 }
}