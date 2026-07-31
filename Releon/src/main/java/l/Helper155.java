package l;

import java.util.function.BooleanSupplier;

public final class Helper155 implements Comparable<Helper155> {
   private int ticks;
   private Helper152 action;
   private BooleanSupplier condition;
   private int priority;

   public Helper155(int var1, Helper152 var2, BooleanSupplier var3, int var4) {
      this.ticks = var1;
      this.action = var2;
      this.condition = var3;
      this.priority = var4;
   }

   public int compareTo(Helper155 var1) {
      return Integer.compare(var1.method1289(), this.method1289());
   }

   public void method1285() {
      this.ticks--;
   }

   public int method1286() {
      return this.ticks;
   }

   public Helper152 method1287() {
      return this.action;
   }

   public BooleanSupplier method1288() {
      return this.condition;
   }

   public int method1289() {
      return this.priority;
   }

   public Helper155 method1290(int var1) {
      this.ticks = var1;
      return this;
   }

   public Helper155 method1291(Helper152 var1) {
      this.action = var1;
      return this;
   }

   public Helper155 method1292(BooleanSupplier var1) {
      this.condition = var1;
      return this;
   }

   public Helper155 method1293(int var1) {
      this.priority = var1;
      return this;
   }
}
