package zenith;

public class EventImpl_35 implements Event {
   private float llII1lIlI1l11lIIlI11IllIlIII;
   private float l1lllII11IIIlll1I1IIII1I11;

   public float AutoBrewing() {
      return this.llII1lIlI1l11lIIlI11IllIlIII;
   }

   public float Basefinder() {
      return this.l1lllII11IIIlll1I1IIII1I11;
   }

   public void byteHolder_2(float f) {
      this.llII1lIlI1l11lIIlI11IllIlIII = f;
   }

   public void byteHolder(float f) {
      this.l1lllII11IIIlll1I1IIII1I11 = f;
   }

   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof EventImpl_35 lll1iill1il1liiiiilli11i1l1l1)) {
         return false;
      } else if (!lll1iill1il1liiiiilli11i1l1l1.EventTarget(this)) {
         return false;
      } else {
         return Float.compare(this.AutoBrewing(), lll1iill1il1liiiiilli11i1l1l1.AutoBrewing()) != 0
            ? false
            : Float.compare(this.Basefinder(), lll1iill1il1liiiiilli11i1l1l1.Basefinder()) == 0;
      }
   }

   protected boolean EventTarget(Object object) {
      return object instanceof EventImpl_35;
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      int i = 1;
      i = i * 59 + Float.floatToIntBits(this.AutoBrewing());
      return i * 59 + Float.floatToIntBits(this.Basefinder());
   }

   @Override
   public String toString() {
      return "EventDirection(yaw=" + this.AutoBrewing() + ", pitch=" + this.Basefinder() + ")";
   }

   public EventImpl_35(float f, float f1) {
      this.llII1lIlI1l11lIIlI11IllIlIII = f;
      this.l1lllII11IIIlll1I1IIII1I11 = f1;
   }
}
