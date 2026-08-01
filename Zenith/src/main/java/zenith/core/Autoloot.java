package zenith;

import java.util.function.Predicate;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.util.ActionResult.IronGolemFlowerFeatureRenderer0;

@ModuleInfo(
   name = "AutoLoot",
   category = Category.PLAYER,
   description = ""
)
public final class Autoloot extends Module {
   private final BooleanSetting I11llIIllIIIl11l1I = new BooleanSetting(
      "module.autoLoot.ignoreWalls", "module.autoLoot.ignoreWalls.desc", false
   );
   private final BooleanSetting l1I1I1II1Il1II1lllll1lI1II1l1 = new BooleanSetting(
      "module.autoLoot.ignoreEntity", "module.autoLoot.ignoreEntity.desc", false
   );
   public static final Autoloot I1IllII1IIl = new Autoloot();
   private MerchantEntity I1111llIIIl1I11lII;

   private Autoloot() {
   }

   @EventTarget
   public void byteHolder_2(EventImpl_30 ll1iil11ii) {
      ZenithInternal066.l1IlIIllIIl1I1IlII1ll1III1I11()
         .filter(MerchantEntity.class::isInstance)
         .map(MerchantEntity.class::cast)
         .filter(MerchantEntity -> MerchantEntity.hasStackEquipped(EquipmentSlot.MAINHAND) || MerchantEntity.hasStackEquipped(EquipmentSlot.OFFHAND))
         .findFirst()
         .ifPresent(MerchantEntity -> {
            double d0 = MerchantEntity.getX() - l11I1I1ll1Illll1I1l1111l1II.player.getX();
            double d1 = MerchantEntity.getY() - l11I1I1ll1Illll1I1l1111l1II.player.getY();
            double d2 = MerchantEntity.getZ() - l11I1I1ll1Illll1I1l1111l1II.player.getZ();
            double d3 = Math.sqrt(d0 * d0 + d2 * d2);
            double d4 = MathHelper.wrapDegrees(-(MathHelper.atan2(d1, d3) * 180.0 / (float) Math.PI));
            double d5 = MathHelper.wrapDegrees(MathHelper.atan2(d2, d0) * 180.0 / (float) Math.PI - 90.0);
            floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6((float)d5, (float)d4);
            II1ll1II1l11lI.StringHolder_8(new SupplierHolder(il1ll111liili1ll11liil, () -> {
               this.I1111llIIIl1I11lII = MerchantEntity;
               return llI1lIIIlII111I11l1lIIl11.StringHolder_8(llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil);
            }, llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()), 3, this);
         });
   }

   @EventTarget
   public void EventTarget(EventImpl_20 l11il1i1iil1lll111l1111llliil) {
      if (this.I1111llIIIl1I11lII != null) {
         if (!this.I11llIIllIIIl11l1I.Spider() && !this.l1I1I1II1Il1II1lllll1lI1II1l1.Spider()) {
            if (l11I1I1ll1Illll1I1l1111l1II.crosshairTarget instanceof EntityHitResult EntityHitResult && EntityHitResult.getEntity() == this.I1111llIIIl1I11lII) {
               l11I1I1ll1Illll1I1l1111l1II.interactionManager
                  .interactEntityAtLocation(l11I1I1ll1Illll1I1l1111l1II.player, EntityHitResult.getEntity(), EntityHitResult, Hand.OFF_HAND);
            }

            this.I1111llIIIl1I11lII = null;
         } else {
            EntityHitResult EntityHitResultx = ZenithInternal088.StringHolder_8(
               3.0,
               II1l111II1Il11II111llllIl1.ZenithInternal057().ll1ll1l11l1lllIIIIl1(),
               (Predicate<Entity>)(Entity -> !this.l1I1I1II1Il1II1lllll1lI1II1l1.Spider() || this.I1111llIIIl1I11lII == Entity)
            );
            if (!this.I11llIIllIIIl11l1I.Spider()
               && !ZenithInternal088.StringHolder_8(
                  II1l111II1Il11II111llllIl1.ZenithInternal057().ll1ll1l11l1lllIIIIl1(),
                  l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F),
                  this.I1111llIIIl1I11lII.getBoundingBox(),
                  3.0,
                  true
               )) {
               this.I1111llIIIl1I11lII = null;
            } else {
               if (EntityHitResultx.getEntity() == this.I1111llIIIl1I11lII) {
                  ActionResult ActionResult = l11I1I1ll1Illll1I1l1111l1II.interactionManager
                     .interactEntityAtLocation(l11I1I1ll1Illll1I1l1111l1II.player, EntityHitResultx.getEntity(), EntityHitResultx, Hand.OFF_HAND);
                  if (ActionResult instanceof IronGolemFlowerFeatureRenderer0) {
                     l11I1I1ll1Illll1I1l1111l1II.player.swingHand(Hand.OFF_HAND);
                  }
               }

               this.I1111llIIIl1I11lII = null;
            }
         }
      }
   }
}
