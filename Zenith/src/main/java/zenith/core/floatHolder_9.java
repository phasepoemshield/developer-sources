package zenith;

public class floatHolder_9 {
   private final float ll1l1II1II1Il;
   private final float lI1IlI1I111;

   public floatHolder_9(float f, float f1) {
      this.ll1l1II1II1Il = f;
      this.lI1IlI1I111 = f1;
   }

   public float III1IIII111l() {
      return (float)Math.sqrt((double)(this.ll1l1II1II1Il * this.ll1l1II1II1Il + this.lI1IlI1I111 * this.lI1IlI1I111));
   }

   public float IlI1ll1l11IlllI111lIlIll111llI() {
      return this.ll1l1II1II1Il;
   }

   public float I1II1IlI1I1ll1l1I11I1ll1() {
      return this.lI1IlI1I111;
   }

   public net.minecraft.util.math.Vec2f lllII1l1IlI1l() {
      return new net.minecraft.util.math.Vec2f(this.ll1l1II1II1Il, this.lI1IlI1I111);
   }

   public boolean ZenithException(float f) {
      return this.ZenithInternal042(f, f);
   }

   public boolean ZenithInternal042(float f, float f1) {
      return Math.abs(this.ll1l1II1II1Il) <= f && Math.abs(this.lI1IlI1I111) <= f1;
   }
}
