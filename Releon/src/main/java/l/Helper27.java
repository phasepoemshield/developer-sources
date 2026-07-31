package l;

public abstract class Helper27 {
   public Helper333 timerUtil = new Helper333();
   protected int duration;
   protected double endPoint;
   protected Helper449 direction;

   public Helper27(int var1, double var2) {
      this.duration = var1;
      this.endPoint = var2;
      this.direction = Helper449.FORWARDS;
   }

   public Helper27(int var1, double var2, Helper449 var4) {
      this.duration = var1;
      this.endPoint = var2;
      this.direction = var4;
   }

   public boolean method461(Helper449 var1) {
      return this.method466() && this.direction.equals(var1);
   }

   public double method462() {
      return 1.0 - (double)this.timerUtil.method3314() / this.duration * this.endPoint;
   }

   public double method463() {
      return this.endPoint;
   }

   public void method464(double var1) {
      this.endPoint = var1;
   }

   public void method465() {
      this.timerUtil.method3309();
   }

   public boolean method466() {
      return this.timerUtil.method3315(this.duration);
   }

   public void method467() {
      this.method469(this.direction.method4813());
   }

   public Helper449 method468() {
      return this.direction;
   }

   public void method469(Helper449 var1) {
      if (this.direction != var1) {
         this.direction = var1;
         this.timerUtil.method3313(System.currentTimeMillis() - (this.duration - Math.min((long)this.duration, this.timerUtil.method3314())));
      }
   }

   public void method470(int var1) {
      this.duration = var1;
   }

   protected boolean method471() {
      return false;
   }

   public double method472() {
      if (this.direction == Helper449.FORWARDS) {
         return this.method466() ? this.endPoint : this.method473((double)this.timerUtil.method3314() / this.duration) * this.endPoint;
      } else if (this.method466()) {
         return 0.0;
      } else if (this.method471()) {
         double var1 = Math.min((long)this.duration, Math.max(0L, this.duration - this.timerUtil.method3314()));
         return this.method473(var1 / this.duration) * this.endPoint;
      } else {
         return (1.0 - this.method473((double)this.timerUtil.method3314() / this.duration)) * this.endPoint;
      }
   }

   protected abstract double method473(double var1);
}
