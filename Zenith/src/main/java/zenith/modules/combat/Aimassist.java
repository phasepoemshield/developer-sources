// Module: AimAssist
// Category: combat
// Original class: Aimassist
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.combat;

import java.util.List;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

@ModuleInfo(
   name = "AimAssist",
   description = "",
   category = Category.COMBAT
)
public class Aimassist extends Module {
   public static final Aimassist lI1l1I1l1l1Il = new Aimassist();
   private static final float l11lIllllIIll111III11IIl = 0.15F;
   private final NumberSetting IIllIIll11II1llI1II1l1lIlI1 = new NumberSetting("module.aimAssist.distance", 4.0F, 0.5F, 6.0F, 0.1F);
   private final ModeSetting IIIl1IIIIIlIl = new ModeSetting("module.aimAssist.mode", "module.aimAssist.mode.desc");
   private final ModeOption II1I1IlI1I1I1 = new ModeOption(
         this.IIIl1IIIIIlIl, "module.aimAssist.mode.multiply"
      )
      .I1lII1lllll11IIlIIl1l11lII();
   private final ModeOption IIllllIIlll = new ModeOption(
      this.IIIl1IIIIIlIl, "module.aimAssist.mode.neuro"
   );
   private final BooleanSetting l11II1l111lII1lI1I11l1III = new BooleanSetting("module.aimAssist.changeX", true);
   private final NumberSetting l1111IIIllI1l1 = new NumberSetting(
      "module.aimAssist.accelerationX", 1.75F, 0.1F, 5.0F, 0.05F, () -> this.II1I1IlI1I1I1.isSelected() && this.l11II1l111lII1lI1I11l1III.Spider()
   );
   private final NumberSetting IllIl1IIllIIIIl1I1I1l1I111 = new NumberSetting(
      "module.aimAssist.decelerationX", 0.4F, 0.1F, 5.0F, 0.05F, () -> this.II1I1IlI1I1I1.isSelected() && this.l11II1l111lII1lI1I11l1III.Spider()
   );
   private final BooleanSetting IlIlIII1IIl111l = new BooleanSetting("module.aimAssist.changeY", false);
   private final NumberSetting I1I1l1111IIIIlIII = new NumberSetting(
      "module.aimAssist.accelerationY", 1.25F, 0.1F, 5.0F, 0.05F, () -> this.II1I1IlI1I1I1.isSelected() && this.IlIlIII1IIl111l.Spider()
   );
   private final NumberSetting l1ll1llI1ll1Il11l111ll111l1111 = new NumberSetting(
      "module.aimAssist.decelerationY", 0.75F, 0.1F, 5.0F, 0.05F, () -> this.II1I1IlI1I1I1.isSelected() && this.IlIlIII1IIl111l.Spider()
   );
   private final NumberSetting l11l1ll111 = new NumberSetting(
      "module.aimAssist.diffRangeX", 20.0F, 0.0F, 100.0F, 5.0F, this.l11II1l111lII1lI1I11l1III::Spider
   );
   private final NumberSetting lIl1llI11IlII1Il = new NumberSetting(
      "module.aimAssist.diffRangeY", 20.0F, 0.0F, 100.0F, 5.0F, this.IlIlIII1IIl111l::Spider
   );
   private final ContainerSetting lllIl11IIIlIIlI1 = new ContainerSetting(
      "module.aimAssist.targetSettingWindow",
      "module.aura.targetWindow.desc",
      () -> true,
      MultiBooleanSetting.StringHolder_8(
         "module.aura.targetTypeSetting",
         "module.aura.targetTypeSetting.desc",
         List.of("module.aura.targetPlayers", "module.aura.noarmor", "module.aura.targetHostile", "module.aura.targetPeaceful")
      ),
      MultiBooleanSetting.StringHolder_8(
         "module.aura.targetSortSetting",
         "module.aura.targetSortSetting.desc",
         List.of("module.aura.targetFov", "module.aura.targetArmor", "module.aura.targetHp", "module.aura.targetDistance")
      ),
      new BooleanSetting("module.aura.safeTarget", "module.aura.safeTarget.desc", false)
   );
   private final ModeSetting lI1lI1II1l = new ModeSetting("module.aura.correction", "module.aura.correction.desc");
   private final ModeOption III1III1l = new ModeOption(
         this.lI1lI1II1l, "module.aura.correctionFocus"
      )
      .I1lII1lllll11IIlIIl1l11lII();
   private final ModeOption III1IIII111l = new ModeOption(
      this.lI1lI1II1l, "module.aura.correctionNone"
   );
   private LivingEntity llIl11llIII1IIlI1;

   private Aimassist() {
   }

   public LivingEntity lI1IIllII11I() {
      return !this.Spider() ? null : this.llIl11llIII1IIlI1;
   }

   @EventTarget
   public void StringHolder_8(ZenithInternal090 l1l11ii1iiillilll) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         this.llIl11llIII1IIlI1 = this.lI11l11111lI1lII();
         if (this.llIl11llIII1IIlI1 != null) {
            floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6(
               l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), l11I1I1ll1Illll1I1l1111l1II.player.getPitch()
            );
            floatHolder_6 il1ll111liili1ll11liil1 = ZenithInternal131.ZenithInternal070(
               this.llIl11llIII1IIlI1.getBoundingBox().getCenter().subtract(l11I1I1ll1Illll1I1l1111l1II.player.getEyePos())
            );
            float f = MathHelper.wrapDegrees(il1ll111liili1ll11liil1.AutoBrewing() - il1ll111liili1ll11liil.AutoBrewing());
            float f1 = MathHelper.wrapDegrees(il1ll111liili1ll11liil1.Basefinder() - il1ll111liili1ll11liil.Basefinder());
            if (this.IIllllIIlll.isSelected()) {
               this.StringHolder_8(l1l11ii1iiillilll, il1ll111liili1ll11liil, il1ll111liili1ll11liil1, f, f1);
            } else {
               if (this.l11II1l111lII1lI1I11l1III.Spider() && Math.abs(f) > this.l11l1ll111.lll1lI1llll1IIllIIIII1lll()) {
                  l1l11ii1iiillilll.EventTarget(
                     this.StringHolder_8(
                        l1l11ii1iiillilll.Castlefly(),
                        f,
                        this.l1111IIIllI1l1.lll1lI1llll1IIllIIIII1lll(),
                        Math.abs(f) < 40.0F ? this.IllIl1IIllIIIIl1I1I1l1I111.lll1lI1llll1IIllIIIII1lll() : 1.0F
                     )
                  );
               }

               if (this.IlIlIII1IIl111l.Spider() && Math.abs(f1) > this.lIl1llI11IlII1Il.lll1lI1llll1IIllIIIII1lll()) {
                  l1l11ii1iiillilll.ZenithInternal095(
                     this.StringHolder_8(
                        l1l11ii1iiillilll.GrimGlide(),
                        f1,
                        this.I1I1l1111IIIIlIII.lll1lI1llll1IIllIIIII1lll(),
                        this.l1ll1llI1ll1Il11l111ll111l1111.lll1lI1llll1IIllIIIII1lll()
                     )
                  );
               }
            }
         }
      } else {
         this.llIl11llIII1IIlI1 = null;
      }
   }

   private LivingEntity lI11l11111lI1lII() {
      return LivingEntityHolder.StringHolder_8(
         l11I1I1ll1Illll1I1l1111l1II.world.getEntities(),
         this.IIllIIll11II1llI1II1l1lIlI1.lll1lI1llll1IIllIIIII1lll(),
         true,
         ((MultiBooleanSetting)this.lllIl11IIIlIIlI1.getSettings().get(0)).lIIll1ll11111I1llII111IllI1ll(),
         ((MultiBooleanSetting)this.lllIl11IIIlIIlI1.getSettings().get(1)).lIIll1ll11111I1llII111IllI1ll(),
         ((BooleanSetting)this.lllIl11IIIlIIlI1.getSettings().get(2)).Spider()
      );
   }

   private void StringHolder_8(
      ZenithInternal090 l1l11ii1iiillilll, floatHolder_6 il1ll111liili1ll11liil, floatHolder_6 il1ll111liili1ll11liil1, float f, float f1
   ) {
      floatHolder_6 il1ll111liili1ll11liil2 = llI1lIIIlII111I11l1lIIl11.I1lllI1I1IIl1l1()
         .StringHolder_8((ZenithInternal124)llI1lIIIlII111I11l1lIIl11.Il1Il1llIIl1lIlII11l11ll(), il1ll111liili1ll11liil1, this.llIl11llIII1IIlI1);
      floatHolder_9 li11l1lilili1l = il1ll111liili1ll11liil.longHolder_6(il1ll111liili1ll11liil2);
      if (!this.ZenithInternal061(li11l1lilili1l.IlI1ll1l11IlllI111lIlIll111llI())
         && !this.ZenithInternal061(li11l1lilili1l.I1II1IlI1I1ll1l1I11I1ll1())) {
         if (li11l1lilili1l.IlI1ll1l11IlllI111lIlIll111llI() != 0.0F || li11l1lilili1l.I1II1IlI1I1ll1l1I11I1ll1() != 0.0F) {
            if (this.l11II1l111lII1lI1I11l1III.Spider() && Math.abs(f) > this.l11l1ll111.lll1lI1llll1IIllIIIII1lll()) {
               l1l11ii1iiillilll.EventTarget(this.ZenithInternal045(li11l1lilili1l.IlI1ll1l11IlllI111lIlIll111llI()));
            }

            if (this.IlIlIII1IIl111l.Spider() && Math.abs(f1) > this.lIl1llI11IlII1Il.lll1lI1llll1IIllIIIII1lll()) {
               l1l11ii1iiillilll.ZenithInternal095(this.ZenithInternal045(li11l1lilili1l.I1II1IlI1I1ll1l1I11I1ll1()));
            }
         }
      }
   }

   private double ZenithInternal045(float f) {
      return (double)(f / 0.15F);
   }

   private double StringHolder_8(double d0, float f, float f1, float f2) {
      boolean flag = Math.signum(d0) == (double)Math.signum(f);
      float f3 = flag ? f1 : f2;
      return d0 * (double)f3;
   }

   private boolean ZenithInternal061(float f) {
      return Float.isNaN(f) || Float.isInfinite(f);
   }

   @EventTarget
   private void EventBus(PlayerInputHolder ili11i1il11) {
      if (!this.III1IIII111l.isSelected() && this.llIl11llIII1IIlI1 != null) {
         floatHolder_6 il1ll111liili1ll11liil = ZenithInternal131.ZenithInternal070(
            this.llIl11llIII1IIlI1.getBoundingBox().getCenter().subtract(l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox().getCenter())
         );
         ZenithInternal047.StringHolder_8(
            ili11i1il11, II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1().AutoBrewing(), il1ll111liili1ll11liil.AutoBrewing()
         );
      }
   }
}
