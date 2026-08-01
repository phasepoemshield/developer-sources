package l;

public class Helper305 {
   private float value;
   private float prevValue;
   private float animationSpeed;
   private float fromValue;
   private float toValue;
   private float animationValue;

   public Helper305() {
   }

   public void method3030(boolean var1) {
      this.prevValue = this.value;
      this.value = Helper147.method1225(this.value + (var1 ? this.animationSpeed : -this.animationSpeed), this.fromValue, this.toValue);
   }

   public void method3031(float var1, float var2, float var3, Helper191 var4, float var5) {
      this.animationSpeed = var3;
      this.fromValue = var1;
      this.toValue = var2;
      this.animationValue = var4.ease(Helper147.method1245(this.prevValue, this.value, var5));
   }

   public void method3032(float var1) {
      this.value = var1;
   }

   public void method3033(float var1) {
      this.prevValue = var1;
   }

   public float method3034() {
      return this.value;
   }

   public float method3035() {
      return this.prevValue;
   }

   public float method3036() {
      return this.animationValue;
   }

   public void method3037(float var1) {
      this.animationValue = var1;
   }
}
