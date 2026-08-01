package zenith;

public class floatHolder_4 extends DrawContextImpl {
   private final int III1IIIIllI11llII1;
   private final int IlI1IllIllI1Il11l11I1Il11Il1;
   private final float I1llIllI1lll;

   protected floatHolder_4(net.minecraft.client.gui.DrawContext DrawContext, int i, int j, float f) {
      super(DrawContext);
      this.III1IIIIllI11llII1 = i;
      this.IlI1IllIllI1Il11l11I1Il11Il1 = j;
      this.I1llIllI1lll = f;
   }

   public static floatHolder_4 StringHolder_8(net.minecraft.client.gui.DrawContext DrawContext, int i, int j, float f) {
      return new floatHolder_4(DrawContext, i, j, f);
   }

   public int l111IIlIl1l1() {
      return this.III1IIIIllI11llII1;
   }

   public int Ill1lI1III1() {
      return this.IlI1IllIllI1Il11l11I1Il11Il1;
   }

   public float llII1I1I1lI1IllIllI() {
      return this.I1llIllI1lll;
   }
}
