package l;

public class Helper467 implements Helper457 {
   protected final Helper333 counter = new Helper333();
   protected int ms;
   protected double value;
   protected Helper450 direction = Helper450.FORWARDS;

   public Helper467() {
   }

   public void method4993() {
      this.counter.method3309();
   }

   public boolean method4994() {
      return this.counter.method3311(this.ms);
   }

   public boolean method4995(Helper450 var1) {
      return this.direction == var1 && this.method4994();
   }

   public Helper450 method4996() {
      return this.direction;
   }

   public void method4997(Helper450 var1) {
      if (this.direction != var1) {
         this.direction = var1;
         this.method4999();
      }
   }

   public boolean method4998(Helper450 var1) {
      return this.direction == var1;
   }

   private void method4999() {
      this.counter.method3313(System.currentTimeMillis() - (this.ms - Math.min((long)this.ms, this.counter.method3314())));
   }

   public Double method5000() {
      double var1 = (1.0 - this.method411(this.counter.method3314())) * this.value;
      return this.direction == Helper450.FORWARDS ? this.method5001() : (this.method4994() ? 0.0 : var1);
   }

   protected double method5001() {
      return this.method4994() ? this.value : this.method411(this.counter.method3314()) * this.value;
   }

   public void method5002() {
   }

   public Helper467 method5003(int var1) {
      this.ms = var1;
      return this;
   }

   public Helper467 method5004(double var1) {
      this.value = var1;
      return this;
   }
}
