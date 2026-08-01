package l;

public class Helper333 {
   private long lastMS = System.currentTimeMillis();

   public Helper333() {
      this.method3309();
   }

   public static Helper333 method3308() {
      return new Helper333();
   }

   public void method3309() {
      this.lastMS = System.currentTimeMillis();
   }

   public void method3310() {
      this.method3309();
   }

   public boolean method3311(long var1) {
      return System.currentTimeMillis() - this.lastMS > var1;
   }

   public void method3312(long var1) {
      this.lastMS = System.currentTimeMillis() + var1;
   }

   public void method3313(long var1) {
      this.lastMS = var1;
   }

   public long method3314() {
      return System.currentTimeMillis() - this.lastMS;
   }

   public boolean isRunning() {
      return System.currentTimeMillis() - this.lastMS <= 0L;
   }

   public boolean method3315(long var1) {
      return System.currentTimeMillis() - this.lastMS > var1;
   }

   public boolean method3316() {
      return this.lastMS < System.currentTimeMillis();
   }

   public boolean method3317(int var1) {
      return this.method3315(var1);
   }

   public boolean method3318(long var1) {
      return this.method3311(var1);
   }

   public String method3319() {
      return Long.toString(this.method3314());
   }

   public long method3320() {
      return this.lastMS;
   }
}
