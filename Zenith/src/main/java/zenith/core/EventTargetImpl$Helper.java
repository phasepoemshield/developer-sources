package zenith;

public class EventTargetImpl$Helper implements ZenithInternal013$EventTarget {
   private final int IIIlIllllI1IlIll;
   private int lI1111l1lIll1lll11I1ll1l;

   public EventTargetImpl$Helper(int i) {
      this.IIIlIllllI1IlIll = i - 1;
   }

   @Override
   public boolean ZenithInternal128(int i, int j) {
      return i >= j && this.lI1111l1lIll1lll11I1ll1l < this.IIIlIllllI1IlIll;
   }

   @Override
   public void I1llIl1IlIlII() {
      this.lI1111l1lIll1lll11I1ll1l++;
   }

   @Override
   public boolean floatHolder_8() {
      return this.lI1111l1lIll1lll11I1ll1l >= this.IIIlIllllI1IlIll;
   }
}
