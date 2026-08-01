package l;

import java.util.function.Supplier;

public class Setting2 extends Helper264 {
   private float value;
   private float min;
   private float max;
   private boolean integer;

   public Setting2(String var1, String var2) {
      super(var1, var2);
   }

   public Setting2 method2078(float var1, float var2) {
      this.min = var1;
      this.max = var2;
      return this;
   }

   public Setting2 method2079(int var1, int var2) {
      this.min = var1;
      this.max = var2;
      this.integer = true;
      return this;
   }

   public int method2080() {
      return (int)this.value;
   }

   public Setting2 method2081(Supplier<Boolean> var1) {
      this.method2704(var1);
      return this;
   }

   public float method2082() {
      return this.value;
   }

   public float method2083() {
      return this.min;
   }

   public float method2084() {
      return this.max;
   }

   public boolean method2085() {
      return this.integer;
   }

   public Setting2 method2086(float var1) {
      this.value = var1;
      return this;
   }

   public Setting2 method2087(float var1) {
      this.min = var1;
      return this;
   }

   public Setting2 method2088(float var1) {
      this.max = var1;
      return this;
   }

   public Setting2 method2089(boolean var1) {
      this.integer = var1;
      return this;
   }
}
