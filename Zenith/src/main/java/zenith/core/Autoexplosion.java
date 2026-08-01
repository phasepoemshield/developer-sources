package zenith;

import net.minecraft.util.Hand;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;

@ModuleInfo(
   name = "AutoExplosion",
   description = "",
   category = Category.COMBAT
)
public final class Autoexplosion extends Module {
   public static final Autoexplosion lIll1l1II1I1Il11111lII = new Autoexplosion();
   private int IllIIlIl11llIIlIIl1 = 0;
   private BlockPos lII111IlII1I11llIl1 = null;
   private BlockPos lII111I1lIlIIIl = null;
   int I11ll1llII11Il11I1I = 0;
   private Slot l1IIl1IIl1lIlll = null;

   @EventTarget
   public void StringHolder_8(EventImpl_11 iililil11ii1i) {
      if (iililil11ii1i.StringHolder_16().getBlock() == Blocks.OBSIDIAN) {
         this.IllIIlIl11llIIlIIl1 = 5;
         Slot Slot = ListHolder_5.EventImpl_13(Items.END_CRYSTAL);
         if (Slot == null) {
            return;
         }

         this.lII111I1lIlIIIl = iililil11ii1i.StringHolder_2();
      }
   }

   @EventTarget
   public void EventTarget(EventImpl_30 ll1iil11ii) {
      if (this.lII111I1lIlIIIl != null) {
         floatHolder_6 il1ll111liili1ll11liil = II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1()
            .StringHolder_8(
               ZenithClient.getInstance()
                  .ZenithInternal057()
                  .ll1ll1l11l1lllIIIIl1()
                  .longHolder_6(ZenithInternal131.longHolder_6(this.lII111I1lIlIIIl.toCenterPos().add(0.0, 0.5, 0.0)))
            );
         II1ll1II1l11lI.StringHolder_8(
            new SupplierHolder(il1ll111liili1ll11liil, () -> il1ll111liili1ll11liil, llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()), 4, this, 1
         );
      }

      if (this.lII111IlII1I11llIl1 != null) {
         if (this.I11ll1llII11Il11I1I > 0) {
            floatHolder_6 il1ll111liili1ll11liil1 = II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1()
               .StringHolder_8(
                  ZenithClient.getInstance()
                     .ZenithInternal057()
                     .ll1ll1l11l1lllIIIIl1()
                     .longHolder_6(ZenithInternal131.longHolder_6(this.lII111IlII1I11llIl1.toCenterPos().add(0.0, 1.2F, 0.0)))
               );
            II1ll1II1l11lI.StringHolder_8(
               new SupplierHolder(il1ll111liili1ll11liil1, () -> il1ll111liili1ll11liil1, llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()), 4, this, 1
            );
            this.I11ll1llII11Il11I1I--;
         }
      }
   }

   @EventTarget
   public void EventBus(EventImpl_14 ill1i111i1l1) {
      if (ill1i111i1l1.Autobuy() instanceof EndCrystalEntity EndCrystalEntity && EndCrystalEntity.getBlockPos().equals(this.lII111IlII1I11llIl1)) {
         this.I11ll1llII11Il11I1I = 4;
      }
   }

   @EventTarget
   public void EventBus(ZenithInternal055 il1ii11111lil1l1llllllli11i) {
      if (!il1ii11111lil1l1llllllli11i.Event()
         && this.lII111IlII1I11llIl1 != null
         && this.I11ll1llII11Il11I1I > 0
         && l11I1I1ll1Illll1I1l1111l1II.crosshairTarget instanceof EntityHitResult EntityHitResult
         && EntityHitResult.getEntity() instanceof EndCrystalEntity) {
         ZenithInternal071.EventTarget(EntityHitResult.getEntity());
         this.lII111IlII1I11llIl1 = null;
         il1ii11111lil1l1llllllli11i.EventBus(true);
      }

      if (this.IllIIlIl11llIIlIIl1 > 0) {
         this.IllIIlIl11llIIlIIl1--;
      }

      if (this.IllIIlIl11llIIlIIl1 <= 0) {
         this.lII111I1lIlIIIl = null;
         if (this.l1IIl1IIl1lIlll != null && ListHolder_8.Event(Autoexplosion.class)) {
            Slot Slot = this.l1IIl1IIl1lIlll;
            ListHolder_8.StringHolder_8(Autoexplosion.class, () -> ListHolder_5.StringHolder_8(Slot, Hand.MAIN_HAND, true));
            this.l1IIl1IIl1lIlll = null;
         }
      } else if (this.lII111I1lIlIIIl != null) {
         Slot Slotx = ListHolder_5.EventImpl_13(Items.END_CRYSTAL);
         if (Slotx != null) {
            if (!il1ii11111lil1l1llllllli11i.Event()
               && l11I1I1ll1Illll1I1l1111l1II.crosshairTarget instanceof BlockHitResult BlockHitResult
               && l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockHitResult.getBlockPos()).getBlock() == Blocks.OBSIDIAN) {
               if (l11I1I1ll1Illll1I1l1111l1II.player.getMainHandStack().getItem() == Items.END_CRYSTAL) {
                  ZenithInternal066.StringHolder_8(BlockHitResult, Hand.MAIN_HAND);
                  il1ii11111lil1l1llllllli11i.EventBus(true);
                  this.lII111IlII1I11llIl1 = BlockHitResult.getBlockPos().up();
                  this.lII111I1lIlIIIl = null;
                  this.IllIIlIl11llIIlIIl1 = -4;
               } else if (ListHolder_8.ZenithInternal028(Autoexplosion.class)) {
                  ListHolder_8.StringHolder_8(
                     Autoexplosion.class, () -> ListHolder_5.StringHolder_8(Slotx, Hand.MAIN_HAND, true)
                  );
                  if (this.l1IIl1IIl1lIlll == null) {
                     this.l1IIl1IIl1lIlll = Slotx;
                  }
               }
            }
         }
      }
   }
}
