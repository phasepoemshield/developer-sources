// Module: TargetPearl
// Category: combat
// Original class: Targetpearl
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.combat;

import java.util.Comparator;
import java.util.Objects;
import java.util.stream.IntStream;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Items;
import net.minecraft.client.network.AbstractClientPlayerEntity;

@ModuleInfo(
   name = "TargetPearl",
   description = "Target Pearl",
   category = Category.COMBAT
)
public final class Targetpearl extends Module {
   public static final Targetpearl ll1l1IIlIl1Il1 = new Targetpearl();
   private final longHolder Il1IllII1I1I1l11l1ll1l1I111 = new longHolder();
   private final ModeSetting llIl1II1I111IlIIlIl = new ModeSetting(
      "module.targetPearl.modeSetting", "module.targetPearl.modeSetting.desc", "module.targetPearl.modeBind", "module.targetPearl.modeAlways"
   );
   private final ModeSetting IlIl1lll1Il11I1Illll1IIl = new ModeSetting(
      "module.targetPearl.targetSetting", "module.targetPearl.targetSetting.desc", "module.targetPearl.targetTarget", "module.targetPearl.targetAll"
   );
   private final BindSetting I11IIll1l1I1I1Il1I1 = new BindSetting(
      "module.targetPearl.throwSetting", "module.targetPearl.throwSetting.desc", () -> this.llIl1II1I111IlIIlIl.ClearHeadersHandler(0)
   );
   private final NumberSetting ll1lI1l111I1ll1I1I = new NumberSetting(
      "module.targetPearl.distanceSetting", 6.0F, 3.0F, 15.0F, 1.0F, "module.targetPearl.distanceSetting.desc", "b"
   );
   private floatHolder_6 ll11II111111I1I1IlIIl11111lI1 = null;
   private net.minecraft.util.hit.HitResult I1IllIIl1l111Ill1ll1l1IIl11 = null;
   int IIIlII1I1I = 0;

   private Targetpearl() {
   }

   @EventTarget
   public void EventTarget(EventImpl_14 ill1i111i1l1) {
      if (ill1i111i1l1.Autobuy() instanceof EnderPearlEntity EnderPearlEntity) {
         l11I1I1ll1Illll1I1l1111l1II.world
            .getPlayers()
            .stream()
            .filter(AbstractClientPlayerEntity -> AbstractClientPlayerEntity.distanceTo(EnderPearlEntity) <= 3.0F)
            .min(Comparator.comparingDouble(AbstractClientPlayerEntity -> (double)AbstractClientPlayerEntity.distanceTo(EnderPearlEntity)))
            .ifPresent(EnderPearlEntity::setOwner);
      }
   }

   @EventTarget
   public void EventImpl_24(EventImpl_30 ll1iil11ii) {
      LivingEntity LivingEntity = Aura.ll1II1l1lII11IlII1.I1IIl11I11l();
      Slot Slot = ListHolder_5.EventImpl_13(Items.ENDER_PEARL);
      if (Slot != null && this.Il1IllII1I1I1l11l1ll1l1I111.HostnameVerifierImpl(1000L)) {
         if (!this.llIl1II1I111IlIIlIl.ClearHeadersHandler(0) || ZenithInternal066.StringHolder_8(this.I11IIll1l1I1I1Il1I1)) {
            if (!ZenithInternal066.l1IlIIllIIl1I1IlII1ll1III1I11()
               .filter(EnderPearlEntity.class::isInstance)
               .map(EnderPearlEntity.class::cast)
               .anyMatch(EnderPearlEntity -> Objects.equals(EnderPearlEntity.getOwner(), l11I1I1ll1Illll1I1l1111l1II.player))) {
               Predictions li111l1l1i1l1 = Predictions.l1l1IIIIl1IIllIIIlI;
               ZenithInternal066.l1IlIIllIIl1I1IlII1ll1III1I11()
                  .filter(EnderPearlEntity.class::isInstance)
                  .map(EnderPearlEntity.class::cast)
                  .sorted(
                     Comparator.comparingDouble(
                        EnderPearlEntity -> (double)ZenithClient.getInstance()
                              .ZenithInternal057()
                              .ll1ll1l11l1lllIIIIl1()
                              .longHolder_6(ZenithInternal131.longHolder_6(li111l1l1i1l1.StringHolder_8(EnderPearlEntity).getPos()))
                              .III1IIII111l()
                     )
                  )
                  .filter(
                     EnderPearlEntity -> !ZenithClient.getInstance().StringHolder_26().EventBus(EnderPearlEntity.getOwner())
                           && (
                              this.IlIl1lll1Il11I1Illll1IIl.ClearHeadersHandler(1)
                                 || LivingEntity != null && LivingEntity.equals(EnderPearlEntity.getOwner())
                           )
                  )
                  .findFirst()
                  .ifPresent(
                     EnderPearlEntity -> {
                        net.minecraft.util.hit.HitResult HitResult = li111l1l1i1l1.StringHolder_8(EnderPearlEntity);
                        this.I1IllIIl1l111Ill1ll1l1IIl11 = HitResult;
                        if (HitResult != null
                           && !(
                              doubleHolder_3.byteHolder_2(l11I1I1ll1Illll1I1l1111l1II.player.getPos(), HitResult.getPos())
                                 < (double)this.ll1lI1l111I1ll1I1I.lll1lI1llll1IIllIIIII1lll()
                           )) {
                           float f = ZenithInternal131.longHolder_6(HitResult.getPos()).AutoBrewing();
                           IntStream.range(-89, 89)
                              .mapToObj(i -> new floatHolder_6(f, (float)i))
                              .filter(
                                 il1ll111liili1ll11liil -> {
                                    net.minecraft.util.hit.HitResult HitResultx = li111l1l1i1l1.StringHolder_8(
                                       il1ll111liili1ll11liil.lllIl11IIIlIIlI1(),
                                       new EnderPearlEntity(EntityType.ENDER_PEARL, l11I1I1ll1Illll1I1l1111l1II.world),
                                       1.5
                                    );
                                    return HitResultx == null ? false : doubleHolder_3.byteHolder_2(HitResultx.getPos(), HitResult.getPos()) <= 3.0;
                                 }
                              )
                              .max(Comparator.comparingDouble(floatHolder_6::Basefinder))
                              .ifPresent(il1ll111liili1ll11liil -> {
                                 this.ll11II111111I1I1IlIIl11111lI1 = il1ll111liili1ll11liil;
                                 this.IIIlII1I1I = 0;
                                 ListHolder_5.byteHolder_2(Items.ENDER_PEARL);
                                 EnderPearlEntity.setOwner(null);
                                 this.Il1IllII1I1I1l11l1ll1l1I111.reset();
                              });
                        }
                     }
                  );
            }
         }
      }
   }

   @EventTarget(
      ZenithInternal095 = 0
   )
   public void EventBus(ZenithInternal111 lii11l11i1lil11ii11ii1il1lll) {
      if (this.I1IllIIl1l111Ill1ll1l1IIl11 != null) {
         Predictions li111l1l1i1l1 = Predictions.l1l1IIIIl1IIllIIIlI;
         float f = ZenithInternal131.longHolder_6(this.I1IllIIl1l111Ill1ll1l1IIl11.getPos()).AutoBrewing();
         IntStream.range(-89, 89)
            .mapToObj(i -> new floatHolder_6(f, (float)i))
            .filter(
               il1ll111liili1ll11liil -> {
                  net.minecraft.util.hit.HitResult HitResult = li111l1l1i1l1.StringHolder_8(
                     il1ll111liili1ll11liil.lllIl11IIIlIIlI1(), new EnderPearlEntity(EntityType.ENDER_PEARL, l11I1I1ll1Illll1I1l1111l1II.world), 1.5
                  );
                  return HitResult != null && HitResult.getType() != net.minecraft.util.hit.HitResult.class_240.ENTITY
                     ? doubleHolder_3.byteHolder_2(HitResult.getPos(), this.I1IllIIl1l111Ill1ll1l1IIl11.getPos()) <= 3.0
                     : false;
               }
            )
            .max(Comparator.comparingDouble(floatHolder_6::Basefinder))
            .ifPresent(il1ll111liili1ll11liil -> {
               this.ll11II111111I1I1IlIIl11111lI1 = il1ll111liili1ll11liil;
               this.Il1IllII1I1I1l11l1ll1l1I111.reset();
            });
         if (this.ll11II111111I1I1IlIIl11111lI1 != null) {
            if (ZenithClient.getInstance()
               .ZenithInternal057()
               .ll1ll1l11l1lllIIIIl1()
               .longHolder_6(this.ll11II111111I1I1IlIIl11111lI1)
               .ZenithException(10.0F)) {
               if (this.IIIlII1I1I >= 1) {
                  this.I1IllIIl1l111Ill1ll1l1IIl11 = null;
                  return;
               }

               this.IIIlII1I1I++;
            }

            ZenithClient.getInstance()
               .ZenithInternal057()
               .StringHolder_8(
                  new SupplierHolder(
                     this.ll11II111111I1I1IlIIl11111lI1,
                     () -> llI1lIIIlII111I11l1lIIl11.StringHolder_8(
                           Aura.ll1II1l1lII11IlII1.III1l1I1I1IlI(), this.ll11II111111I1I1IlIIl11111lI1
                        ),
                     Aura.ll1II1l1lII11IlII1.III1l1I1I1IlI()
                  ),
                  20,
                  this,
                  2
               );
            lii11l11i1lil11ii11ii1il1lll.ZenithInternal069();
         }
      }
   }

   @EventTarget
   public void EventBus(EventImpl_20 l11il1i1iil1lll111l1111llliil) {
   }
}
