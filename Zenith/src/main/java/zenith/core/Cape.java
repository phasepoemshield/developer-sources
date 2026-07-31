package zenith;

@ModuleInfo(
   name = "Cape",
   category = Category.RENDER,
   description = "module.cape.desc"
)
public final class Cape extends Module {
   public static final Cape l1l1IlllllI111l1II1IIIl1 = new Cape();
   public ModeSetting IlIl1II11l1III1IlIIl1l1II = new ModeSetting(
      "module.swingAnimation.animationMode",
      "module.cape.animationMode.desc",
      "module.swingAnimation.first",
      "module.swingAnimation.second",
      "module.swingAnimation.third"
   );
   private final NumberSetting III1II1lIIIIl1 = new NumberSetting(
      "module.cape.windStrength", 1.0F, 0.0F, 3.0F, 0.1F, "module.cape.windStrength.desc", "x"
   );
   private final NumberSetting I1lIllIIlIl1I1I = new NumberSetting("module.cape.gravity", 1.0F, 0.0F, 2.0F, 0.1F, "module.cape.gravity.desc", "x");
   private final NumberSetting lllll1l = new NumberSetting("module.cape.stiffness", 0.5F, 0.1F, 2.0F, 0.1F, "module.cape.stiffness.desc", "x");
   private final NumberSetting lIl11l1lllI1ll1l = new NumberSetting(
      "module.cape.sensitivity", 1.5F, 0.5F, 3.0F, 0.1F, "module.cape.sensitivity.desc", "x"
   );

   @Override
   public boolean llI1lll1lIllII11I1111Illl() {
      return true;
   }

   public float Il11lI1lI1IIIII11I1() {
      return this.III1II1lIIIIl1.lll1lI1llll1IIllIIIII1lll();
   }

   public float Ill1IIlI1lIlIIIl111l() {
      return this.I1lIllIIlIl1I1I.lll1lI1llll1IIllIIIII1lll();
   }

   public float I11I1III1I1I11111lllII111l() {
      return this.lllll1l.lll1lI1llll1IIllIIIII1lll();
   }

   public float II1Il1l1II1I111lIll1lI1l11I() {
      return this.lIl11l1lllI1ll1l.lll1lI1llll1IIllIIIII1lll();
   }
}
