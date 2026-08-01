package l;

public class Helper158 implements Helper154 {
   private final int loopCount;
   private int currentLoop;

   public Helper158(int var1) {
      this.loopCount = var1 - 1;
   }

   @Override
   public boolean method1281(int var1, int var2) {
      return var1 >= var2 && this.currentLoop < this.loopCount;
   }

   @Override
   public void method1282() {
      this.currentLoop++;
   }

   @Override
   public boolean method1283() {
      return this.currentLoop >= this.loopCount;
   }
}
