package zenith;

import java.util.List;

@ModuleInfo(
   name = "WorldTweaks",
   description = "",
   category = Category.RENDER
)
public final class Worldtweaks extends Module {
   public final MultiBooleanSetting Ill1ll111IllIlI11ll1 = MultiBooleanSetting.StringHolder_8(
      "module.worldTweaks.modeSetting",
      "module.worldTweaks.modeSetting.desc",
      List.of("module.worldTweaks.lighting", "module.worldTweaks.fog", "module.worldTweaks.time", "module.worldTweaks.saturation")
   );
   public final NumberSetting lI1l1IlllIl = new NumberSetting(
      "module.worldTweaks.brightSetting",
      1.0F,
      0.0F,
      1.0F,
      0.1F,
      "module.worldTweaks.brightSetting.desc",
      "%",
      () -> this.Ill1ll111IllIlI11ll1.ConstructorHolder(0),
      null
   );
   private final ColorSetting III11I1I1l1IIlll1IIIlII = new ColorSetting(
      "module.worldTweaks.colorFog",
      "module.worldTweaks.colorFog.desc",
      ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1().l1IllIl1l1llIlI11I11Il1l1l1lI1()
   );
   public final NumberSetting ll1lllIllIlllI1lI1I1I1Ill1l1 = new NumberSetting(
      "module.worldTweaks.distanceSetting",
      80.0F,
      10.0F,
      255.0F,
      5.0F,
      "module.worldTweaks.distanceSetting.desc",
      "b",
      () -> this.Ill1ll111IllIlI11ll1.ConstructorHolder(1),
      null
   );
   public final NumberSetting lIlI11l11Il111IlIIll11 = new NumberSetting(
      "module.worldTweaks.timeSetting",
      12.0F,
      0.0F,
      24.0F,
      1.0F,
      "module.worldTweaks.timeSetting.desc",
      "h",
      () -> this.Ill1ll111IllIlI11ll1.ConstructorHolder(2),
      null
   );
   public final NumberSetting l11l1IllI111IIIII = new NumberSetting(
      "module.worldTweaks.contrastSetting",
      1.0F,
      0.0F,
      3.0F,
      0.1F,
      "module.worldTweaks.contrastSetting.desc",
      "x",
      () -> this.Ill1ll111IllIlI11ll1.ConstructorHolder(3),
      null
   );
   public final BooleanSetting llllll111I1ll1II1II1IIlIl = new BooleanSetting(
      "module.worldTweaks.noneRaning", "module.worldTweaks.noneRaning.desc", true
   );
   public static final Worldtweaks l1I1II1l111l1llI11l1I1llII = new Worldtweaks();
   private boolean IlIl1llIlI1I1I1I1;

   private Worldtweaks() {
   }

   public void ZenithInternal056(boolean flag) {
      this.IlIl1llIlI1I1I1I1 = flag;
   }

   public float I11IIIII111IlI1lI1I1IIlll11() {
      return this.IlIl1llIlI1I1I1I1 && this.Spider() && this.Ill1ll111IllIlI11ll1.ConstructorHolder(3)
         ? this.l11l1IllI111IIIII.lll1lI1llll1IIllIIIII1lll()
         : 1.0F;
   }

   @EventTarget
   public void StringHolder_8(floatHolder_2 i1lliiill1il1l1lilii1liil) {
      if (this.Ill1ll111IllIlI11ll1.ConstructorHolder(1)) {
         i1lliiill1il1l1lilii1liil.ConnectThread(this.ll1lllIllIlllI1lI1I1I1Ill1l1.lll1lI1llll1IIllIIIII1lll());
         i1lliiill1il1l1lilii1liil.ZenithException_2(this.III11I1I1l1IIlll1IIIlII.II11II1lIlIl1IIIlII1I1());
         i1lliiill1il1l1lilii1liil.EventBus(true);
      }
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
   }

   @EventTarget
   public void ByteBufferHolder_2(PacketHolder ii1l11il1i1i) {
   }
}
