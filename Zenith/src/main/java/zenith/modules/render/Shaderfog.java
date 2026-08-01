// Module: ShaderFog
// Category: render
// Original class: Shaderfog
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

@ModuleInfo(
   name = "ShaderFog",
   category = Category.RENDER,
   description = "module.shaderFog.desc"
)
public final class Shaderfog extends Module {
   public static final Shaderfog II11l1IIIll1lIIllI111l1II = new Shaderfog();
   private static final int lIll1111l1l1llll111llIIll = 0;
   private static final int ll1l1II1Illl = 1;
   private static final int IIIl1IIll = 2;
   private static final int l1l11IIll1I111 = 3;
   private static final int llIllllIlI1l1lllI1II1Illl = 4;
   private final ModeSetting IIIlIIIll1IlI1lI1ll1 = new ModeSetting(
      "module.shaderFog.shaderMode",
      "module.shaderFog.shaderMode.desc",
      "module.shaderFog.gradient",
      "module.shaderFog.galaxy",
      "module.shaderFog.aqua",
      "module.shaderFog.purple",
      "module.shaderFog.overcast"
   );
   private final ModeSetting IlllIII1l1II11II1ll1I1IIlI1I = new ModeSetting(
      "module.shaderFog.colorMode",
      "module.shaderFog.colorMode.desc",
      () -> this.IIIlIIIll1IlI1lI1ll1.ClearHeadersHandler(0),
      "module.shaderFog.sync",
      "module.shaderFog.custom"
   );
   private final NumberSetting IIIIl1l1lI1IlI1l1III1Il = new NumberSetting(
      "module.shaderFog.syncAlpha",
      132.0F,
      0.0F,
      255.0F,
      1.0F,
      "module.shaderFog.syncAlpha.desc",
      "a",
      () -> this.IIIlIIIll1IlI1lI1ll1.ClearHeadersHandler(0) && this.IlllIII1l1II11II1ll1I1IIlI1I.ClearHeadersHandler(0),
      null
   );
   private final ColorSetting I1111lI1l1lI11lIllIl1l1I11I = new ColorSetting(
      "module.shaderFog.firstColor",
      new ByteBufferHolder(86, 162, 255, 128),
      () -> this.IIIlIIIll1IlI1lI1ll1.ClearHeadersHandler(0) && this.IlllIII1l1II11II1ll1I1IIlI1I.ClearHeadersHandler(1)
   );
   private final ColorSetting II1l1II1111Il1Il = new ColorSetting(
      "module.shaderFog.secondColor",
      new ByteBufferHolder(190, 112, 255, 118),
      () -> this.IIIlIIIll1IlI1lI1ll1.ClearHeadersHandler(0) && this.IlllIII1l1II11II1ll1I1IIlI1I.ClearHeadersHandler(1)
   );
   private final ColorSetting lIII1Ill1III11IIll1IllI1ll1lII = new ColorSetting(
      "module.shaderFog.purpleColor", new ByteBufferHolder(185, 56, 195), () -> this.IIIlIIIll1IlI1lI1ll1.ClearHeadersHandler(3)
   );
   private final NumberSetting llIIl111I11llI1II11l11l1II1ll = new NumberSetting(
      "module.shaderFog.intensity", 0.05F, 0.0F, 1.5F, 0.05F, "module.shaderFog.intensity.desc", "x"
   );
   private final NumberSetting IIIlI1ll1Illl1ll1I1I1I = new NumberSetting(
      "module.shaderFog.timeSpeed", 0.1F, 0.0F, 5.0F, 0.05F, "module.shaderFog.timeSpeed.desc", "x", this::lII11IlIl1l1I1IIl11II1llI, null
   );

   private Shaderfog() {
   }

   public boolean l1I1lIIIl1l1IlIIII11() {
      return this.Spider()
         && l11I1I1ll1Illll1I1l1111l1II.world != null
         && l11I1I1ll1Illll1I1l1111l1II.player != null
         && l11I1I1ll1Illll1I1l1111l1II.getFramebuffer() != null;
   }

   public float l1111111llII1lI() {
      return this.llIIl111I11llI1II11l11l1II1ll.lll1lI1llll1IIllIIIII1lll();
   }

   public float l11I1Il11I11l1I1() {
      return this.IIIlI1ll1Illl1ll1I1I1I.lll1lI1llll1IIllIIIII1lll();
   }

   public int ll1IlI1() {
      return this.IIIlIIIll1IlI1lI1ll1.getIndex();
   }

   public int I1l11IIl11IllIl11I11II11l1II1l() {
      return this.IlllIII1l1II11II1ll1I1IIlI1I.ClearHeadersHandler(0)
         ? ZenithClient.getInstance()
            .floatHolder_3()
            .getCurrentStyle()
            .getPrimaryColor()
            .l1IllIl1l1llIlI11I11Il1l1l1lI1()
            .ZenithInternal039(this.IIIIl1l1lI1IlI1l1III1Il.lll1lI1llll1IIllIIIII1lll() / 255.0F)
            .lllIlll1Ill111l111Il11II11lII()
         : this.I1111lI1l1lI11lIllIl1l1I11I.II11II1lIlIl1IIIlII1I1();
   }

   public int Il1I1IIIllIll1() {
      return this.IlllIII1l1II11II1ll1I1IIlI1I.ClearHeadersHandler(0)
         ? ZenithClient.getInstance()
            .floatHolder_3()
            .getCurrentStyle()
            .getSecondaryPrimaryColor()
            .l1IllIl1l1llIlI11I11Il1l1l1lI1()
            .ZenithInternal039(this.IIIIl1l1lI1IlI1l1III1Il.lll1lI1llll1IIllIIIII1lll() / 255.0F)
            .lllIlll1Ill111l111Il11II11lII()
         : this.II1l1II1111Il1Il.II11II1lIlIl1IIIlII1I1();
   }

   public int IlllllIIl1lIIl1lI() {
      return this.lIII1Ill1III11IIll1IllI1ll1lII.II11II1lIlIl1IIIlII1I1();
   }

   private boolean lII11IlIl1l1I1IIl11II1llI() {
      return this.IIIlIIIll1IlI1lI1ll1.ClearHeadersHandler(1)
         || this.IIIlIIIll1IlI1lI1ll1.ClearHeadersHandler(2)
         || this.IIIlIIIll1IlI1lI1ll1.ClearHeadersHandler(3)
         || this.IIIlIIIll1IlI1lI1ll1.ClearHeadersHandler(4);
   }
}
