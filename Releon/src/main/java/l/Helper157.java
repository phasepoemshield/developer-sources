package l;

import java.util.function.BooleanSupplier;

public final class Helper157 implements Comparable<Helper157> {
   private int delay;
   private Helper152 action;
   private BooleanSupplier condition;
   private int priority;

   public Helper157(int var1, Helper152 var2, BooleanSupplier var3, int var4) {
      this.delay = var1;
      this.action = var2;
      this.condition = var3;
      this.priority = var4;
   }

   public int compareTo(Helper157 var1) {
      return Integer.compare(var1.method1298(), this.method1298());
   }

   public int method1295() {
      return this.delay;
   }

   public Helper152 method1296() {
      return this.action;
   }

   public BooleanSupplier method1297() {
      return this.condition;
   }

   public int method1298() {
      return this.priority;
   }

   public Helper157 method1299(int var1) {
      this.delay = var1;
      return this;
   }

   public Helper157 method1300(Helper152 var1) {
      this.action = var1;
      return this;
   }

   public Helper157 method1301(BooleanSupplier var1) {
      this.condition = var1;
      return this;
   }

   public Helper157 method1302(int var1) {
      this.priority = var1;
      return this;
   }
}
