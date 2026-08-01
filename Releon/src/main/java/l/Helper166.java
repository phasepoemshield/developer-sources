package l;

public class Helper166 {
   public long lastMS = System.currentTimeMillis();
   private long time;

   public Helper166() {
      this.method1371();
      this.method1372();
   }

   public static Helper166 method1370() {
      return new Helper166();
   }

   public void method1371() {
      this.lastMS = System.currentTimeMillis();
   }

   public void method1372() {
      this.time = System.nanoTime();
   }

   public boolean method1373(long var1) {
      return System.currentTimeMillis() - this.lastMS > var1;
   }

   public void method1374(long var1) {
      this.lastMS = System.currentTimeMillis() + var1;
   }

   public void method1375(long var1) {
      this.lastMS = var1;
   }

   public long method1376() {
      return this.method1377(System.nanoTime() - this.time);
   }

   public long method1377(long var1) {
      return var1 / 1000000L;
   }

   public long method1378() {
      return System.currentTimeMillis() - this.lastMS;
   }

   public boolean method1379(long var1) {
      return this.method1377(System.nanoTime() - this.time) >= var1;
   }

   public boolean isRunning() {
      return System.currentTimeMillis() - this.lastMS <= 0L;
   }

   public boolean method1380() {
      return this.lastMS < System.currentTimeMillis();
   }

   public long method1381() {
      return this.lastMS;
   }
}
