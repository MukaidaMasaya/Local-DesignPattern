class Suuchi extends Subject {
 int suuchiState;
 int atai;
 public int getState() {
 return suuchiState;
 }
 public void putValue(int atai) {
 if (atai > this.atai) {
 this.atai = atai;
 this.tsuuchi();
 }
 else { // �{���������� 3 �s�͕s�v�ƂȂ�s�ł��B
 System.out.println("�m�F�p���b�Z�[�W:�X�V���Ă܂���");
 }
 }
 public int getValue() {
 return atai;
 }
}