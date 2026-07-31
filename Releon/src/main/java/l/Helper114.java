package l;

import java.util.List;

public class Helper114 extends Exception1 implements Helper94 {
   public final String command;

   public Helper114(String var1) {
      super(String.format("Команда не найдена: %s", var1));
      this.command = var1;
   }

   @Override
   public void method647(Helper230 var1, List<Helper204> var2) {
      this.method906(this.getMessage());
   }
}
