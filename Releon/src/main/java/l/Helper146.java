package l;

import java.util.ArrayList;
import java.util.List;

public class Helper146 {
   public static final Helper146 INSTANCE = new Helper146();
   final List<Long> records = new ArrayList<>();
   int fps = 5;

   public Helper146() {
   }

   public void method1221() {
      long var1 = System.currentTimeMillis();
      this.records.add(var1);
      this.records.removeIf(var0 -> var0 + 1000L < System.currentTimeMillis());
      this.fps = Math.max(this.records.size(), 4);
   }

   public int method1222() {
      return this.fps;
   }
}
