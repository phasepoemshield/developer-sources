package zenith;

import net.minecraft.client.option.Perspective;

@ModuleInfo(
   name = "Crosshair",
   category = Category.RENDER,
   description = "Кастомный прицел"
)
public final class Crosshair extends Module {
   public static final Crosshair lII1Il111I1 = new Crosshair();
   private final NumberSetting l1llIlII1llI1l1llllll1llII1l1 = new NumberSetting(
      "module.crosshair.thickness", 1.0F, 0.5F, 3.0F, 0.1F, "module.crosshair.thickness.desc", "px"
   );
   private final NumberSetting l11llllI11l1lI1lIl1 = new NumberSetting(
      "module.crosshair.length", 3.0F, 1.0F, 8.0F, 0.5F, "module.crosshair.length.desc", "px"
   );
   private final NumberSetting lI1ll1lll11ll11I1IlI1I1Il111l = new NumberSetting(
      "module.crosshair.gap", 2.0F, 0.0F, 5.0F, 0.5F, "module.crosshair.gap.desc", "px"
   );
   private final BooleanSetting lllIlI1I11lI1II1111III1l = new BooleanSetting(
      "module.crosshair.dynamicGap", "module.crosshair.dynamicGap.desc", false
   );
   private final BooleanSetting IlIll11lI1I = new BooleanSetting(
      "module.crosshair.useEntityColor", "module.crosshair.useEntityColor.desc", false
   );
   private final ByteBufferHolder I1llllII1I = new ByteBufferHolder(255, 0, 0, 255);

   private Crosshair() {
   }

   @EventTarget(
      ZenithInternal095 = 0
   )
   public void EventTarget(EventImpl_37 llllii1liii1i1ll1liiil) {
      try {
         if (l11I1I1ll1Illll1I1l1111l1II.player == null || l11I1I1ll1Illll1I1l1111l1II.world == null) {
            return;
         }

         if (l11I1I1ll1Illll1I1l1111l1II.options.getPerspective() != Perspective.FIRST_PERSON) {
            return;
         }

         floatHolder_4 iiii1ilili1l1l1lilli1liliii = llllii1liii1i1ll1liiil.Predictions();
         float f = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() / 2.0F;
         float f1 = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() / 2.0F;
         float f2 = this.lI1ll1lll11ll11I1IlI1I1Il111l.lll1lI1llll1IIllIIIII1lll();
         if (this.lllIlI1I11lI1II1111III1l.Spider()) {
            float f3 = 1.0F - l11I1I1ll1Illll1I1l1111l1II.player.getAttackCooldownProgress(0.0F);
            f2 += 8.0F * f3;
         }

         float f5 = this.l1llIlII1llI1l1llllll1llII1l1.lll1lI1llll1IIllIIIII1lll();
         float f4 = this.l11llllI11l1lI1lIl1.lll1lI1llll1IIllIIIII1lll();
         ByteBufferHolder il1iliilli1l1iill = this.IlIll11lI1I.Spider()
               && l11I1I1ll1Illll1I1l1111l1II.crosshairTarget != null
               && l11I1I1ll1Illll1I1l1111l1II.crosshairTarget.getType() == net.minecraft.util.hit.HitResult.class_240.ENTITY
            ? this.I1llllII1I
            : new ByteBufferHolder(255, 255, 255, 255);
         this.StringHolder_8(iiii1ilili1l1l1lilli1liliii, f - f5 / 2.0F, f1 - f2 - f4, f5, f4, il1iliilli1l1iill);
         this.StringHolder_8(iiii1ilili1l1l1lilli1liliii, f - f5 / 2.0F, f1 + f2, f5, f4, il1iliilli1l1iill);
         this.StringHolder_8(iiii1ilili1l1l1lilli1liliii, f - f2 - f4, f1 - f5 / 2.0F, f4, f5, il1iliilli1l1iill);
         this.StringHolder_8(iiii1ilili1l1l1lilli1liliii, f + f2, f1 - f5 / 2.0F, f4, f5, il1iliilli1l1iill);
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   private void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill) {
      lliii11l1lllil.StringHolder_8(f, f1, f2, f3, il1iliilli1l1iill);
   }
}
