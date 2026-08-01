package zenith;

import zenith.hud.*;

public abstract class floatHolder$Event implements IReturn {
   private float ZenithInternal063;
   private float StringHolder_7;

   public floatHolder$Event(float f, float f1) {
      this.ZenithInternal063 = f;
      this.StringHolder_7 = f1;
   }

   public floatHolder$Event() {
      this(-1.0F, 0.0F);
   }

   public void EventImpl_21(float f) {
      this.ZenithInternal063 = f;
   }

   public void EventImpl_13(float f) {
      this.StringHolder_7 = f;
   }

   public float ItemBinds() {
      return this.ZenithInternal063;
   }

   public float Keybinds() {
      return this.StringHolder_7;
   }
}
