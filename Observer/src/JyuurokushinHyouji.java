class JyuurokushinHyouji implements Observer {
 public void update(Subject s) {
 print(((Suuchi)s).getValue());
 }
 private void print(int n) {
 System.out.println(n + "�� 16 �i���ŕ\�����܂�");
 System.out.println(Integer.toHexString(n));
 }
}