//教材学習の挙動確認メモ//
public class ContinueTest {
  public static void main(String[] args) {
    int total = 0;
    for (int i = 0; i < 5; i++) {
      if(i % 2 == 0) {
        continue;
      }
      total += i;
    }
    System.out.println(total);
  }
}
