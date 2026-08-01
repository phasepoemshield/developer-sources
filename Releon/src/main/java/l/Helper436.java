package l;

import fat.releon.Releon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Helper436 {
   private final List<Helper404> listeners = new ArrayList<>();

   public Helper436() {
   }

   public void method4539() {
      this.method4540(new Helper439());
   }

   public void method4540(Helper404... var1) {
      this.listeners.addAll(List.of(var1));
      Arrays.stream(var1).forEach(var0 -> Releon.method71().method15().method1016(var0));
   }

   public List<Helper404> method4541() {
      return this.listeners;
   }
}
