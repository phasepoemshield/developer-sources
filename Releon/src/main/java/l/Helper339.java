package l;

public class Helper339 {
   private long lastMS;

   public Helper339() {
      this.method3358();
   }

   public long method3354() {
      return this.lastMS;
   }

   public long method3355() {
      return this.lastMS;
   }

   public boolean method3356(double var1) {
      return System.currentTimeMillis() - var1 >= this.lastMS;
   }

   public boolean method3357(double var1) {
      boolean var3 = this.method3356(var1);
      if (var3) {
         this.method3358();
      }

      return var3;
   }

   public void method3358() {
      this.lastMS = System.currentTimeMillis();
   }

   public long method3359() {
      return System.currentTimeMillis() - this.lastMS;
   }

   public Helper339 method3360(long var1) {
      this.lastMS = System.currentTimeMillis() - var1;
      return this;
   }

   public boolean method3361(long var1) {
      return System.currentTimeMillis() - this.lastMS > var1;
   }

   public void method3362(long var1) {
      this.lastMS = System.currentTimeMillis() + var1;
   }

   public void method3363(long var1) {
      this.lastMS = var1;
   }

   public long method3364() {
      return System.currentTimeMillis() - this.lastMS;
   }

   public boolean isRunning() {
      return System.currentTimeMillis() - this.lastMS <= 0L;
   }

   public boolean method3365() {
      return this.lastMS < System.currentTimeMillis();
   }

   public boolean method3366(long var1) {
      return System.currentTimeMillis() - this.lastMS > var1;
   }

   public boolean method3367(int var1) {
      return this.method3366(var1);
   }

   public boolean method3368(long var1) {
      return this.method3361(var1);
   }

   public String method3369() {
      return Long.toString(this.method3364());
   }
}
