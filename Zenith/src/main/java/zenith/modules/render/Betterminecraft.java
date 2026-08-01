// Module: BetterMinecraft
// Category: render
// Original class: Betterminecraft
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

@ModuleInfo(
   name = "BetterMinecraft",
   description = "",
   category = Category.RENDER
)
public final class Betterminecraft extends Module {
   public static final Betterminecraft Il1I11IllIlIll = new Betterminecraft();
   public static final long Illl1IllllIllIllII = 130L;
   public static final long I1I11I1l1lI1llIl1III = 110L;
   public static final float IllIIIIlll1l1lI1 = 0.86F;
   private final MultiBooleanSetting lIl11l1I11I1I = new MultiBooleanSetting("Анимировать");
   private final MultiBooleanSetting$II1Il11l111II11IIl lIlIll1II1I = new MultiBooleanSetting$II1Il11l111II11IIl(this.lIl11l1I11I1I, "Хранилища", true);
   private final MultiBooleanSetting$II1Il11l111II11IIl IIlIlI1IIlIll111ll1l = new MultiBooleanSetting$II1Il11l111II11IIl(this.lIl11l1I11I1I, "Инвентарь", true);

   private Betterminecraft() {
   }

   public boolean ll1lIllIIIl1I1() {
      return this.Spider() && this.lIlIll1II1I.Spider();
   }

   public boolean l1ll1III1IlI11I11llI() {
      return this.Spider() && this.IIlIlI1IIlIll111ll1l.Spider();
   }

   public float ConnectThread(long i) {
      float f = this.permessagedeflate((float)(System.currentTimeMillis() - i) / 130.0F);
      return 0.86F + 0.13999999F * this.StringHolder(f);
   }

   public float StringHolder_8(long i, float f) {
      float f1 = this.permessagedeflate((float)(System.currentTimeMillis() - i) / 110.0F);
      return f * (1.0F - this.StringHolder(f1));
   }

   public boolean CallableImpl(long i) {
      return System.currentTimeMillis() - i >= 110L;
   }

   private float permessagedeflate(float f) {
      return Math.clamp(f, 0.0F, 1.0F);
   }

   private float StringHolder(float f) {
      return f < 0.5F ? 2.0F * f * f : 1.0F - (float)Math.pow((double)(-2.0F * f + 2.0F), 2.0) / 2.0F;
   }
}
