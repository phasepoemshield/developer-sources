package zenith;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.util.hit.BlockHitResult;

public final class IsBindingHandler {
   private final Autocraft IIIllI11Il1l1l1;
   private StringHolder_2 lIllIll1IIlIl1lllIIl1IlIll11ll = StringHolder_2.l111lll1lIlIIIIll1Il1IlIl1();
   private boolean II111lllllI1llllI11Ill1lIl;

   public IsBindingHandler(Autocraft Autocraft) {
      this.IIIllI11Il1l1l1 = Autocraft;
   }

   public boolean isBinding() {
      return !this.lIllIll1IIlIl1lllIIl1IlIll11ll.l1IllIIlIIl11l1I1IlI1IIl11Il1l();
   }

   public String I11lllll1() {
      return this.lIllIll1IIlIl1lllIIl1IlIll11ll.l1IllIIlIIl11l1I1IlI1IIl11Il1l() ? "" : this.lIllIll1IIlIl1lllIIl1IlIll11ll.EventTarget(this.IIIllI11Il1l1l1);
   }

   public void lIllll1IlllI1ll1ll() {
      this.lIllIll1IIlIl1lllIIl1IlIll11ll = StringHolder_2.l111lll1lIlIIIIll1Il1IlIl1();
   }

   public void reset() {
      this.lIllIll1IIlIl1lllIIl1IlIll11ll = StringHolder_2.l111lll1lIlIIIIll1Il1IlIl1();
      this.ConstructorHolder(true);
   }

   public void EventImpl_23(String s) {
      StringHolder_14 ill111l1iiill1ll1illi = this.IIIllI11Il1l1l1.lI1l1I1IIII();
      if (ill111l1iiill1ll1illi != null && s != null && !s.isBlank()) {
         this.lIllIll1IIlIl1lllIIl1IlIll11ll = new StringHolder_2(
            ZenithInternal006$Helper.l111IIIl11lll1IlII111IlI11l,
            ill111l1iiill1ll1illi.I1llI111I1IlIIlIlIII1lI1(),
            ill111l1iiill1ll1illi.GetSocketHandler(),
            s
         );
         this.l1IlIl1lllllllI1l1();
         Autocraft.l11I1I1ll1Illll1I1l1111l1II.setScreen(null);
      }
   }

   public void IIlIIl1I111lIl11l() {
      StringHolder_14 ill111l1iiill1ll1illi = this.IIIllI11Il1l1l1.lI1l1I1IIII();
      if (ill111l1iiill1ll1illi != null) {
         this.lIllIll1IIlIl1lllIIl1IlIll11ll = new StringHolder_2(
            ZenithInternal006$Helper.I1lI1I1IIIl111I1ll1IlI1I11Il,
            ill111l1iiill1ll1illi.I1llI111I1IlIIlIlIII1lI1(),
            ill111l1iiill1ll1illi.GetSocketHandler(),
            ""
         );
         this.l1IlIl1lllllllI1l1();
         Autocraft.l11I1I1ll1Illll1I1l1111l1II.setScreen(null);
      }
   }

   public void I1l1I1I11Il1IllIl1() {
      StringHolder_14 ill111l1iiill1ll1illi = this.IIIllI11Il1l1l1.lI1l1I1IIII();
      if (ill111l1iiill1ll1illi != null) {
         this.lIllIll1IIlIl1lllIIl1IlIll11ll = new StringHolder_2(
            ZenithInternal006$Helper.IlIlIl1I1II1l11Il,
            ill111l1iiill1ll1illi.I1llI111I1IlIIlIlIII1lI1(),
            ill111l1iiill1ll1illi.GetSocketHandler(),
            ""
         );
         this.l1IlIl1lllllllI1l1();
         Autocraft.l11I1I1ll1Illll1I1l1111l1II.setScreen(null);
      }
   }

   public boolean EventTarget(EventImpl_38 lllll1l1iliiiiiiililii11) {
      if (this.lIllIll1IIlIl1lllIIl1IlIll11ll.l1IllIIlIIl11l1I1IlI1IIl11Il1l()) {
         return false;
      } else if (Autocraft.l11I1I1ll1Illll1I1l1111l1II.player != null && Autocraft.l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (lllll1l1iliiiiiiililii11.Elytrafly() != 1 || lllll1l1iliiiiiiililii11.Elytratarget() != 1) {
            return true;
         } else if (Autocraft.l11I1I1ll1Illll1I1l1111l1II.currentScreen != null) {
            return true;
         } else {
            if (Autocraft.l11I1I1ll1Illll1I1l1111l1II.crosshairTarget instanceof BlockHitResult BlockHitResult
               && Autocraft.l11I1I1ll1Illll1I1l1111l1II.crosshairTarget.getType() == net.minecraft.util.hit.HitResult.class_240.BLOCK) {
               StringHolder_14 ill111l1iiill1ll1illi = this.IIIllI11Il1l1l1
                  .ZenithInternal064(
                     this.lIllIll1IIlIl1lllIIl1IlIll11ll.lll1lll1l1I1llII11lll(), this.lIllIll1IIlIl1lllIIl1IlIll11ll.IlI1lIl1lIlII1lIlI1I1l1Ill()
                  );
               if (ill111l1iiill1ll1illi == null) {
                  this.lIllIll1IIlIl1lllIIl1IlIll11ll = StringHolder_2.l111lll1lIlIIIIll1Il1IlIl1();
                  this.Ill1ll1I11l1lllIIl();
                  return true;
               }

               BlockPos BlockPos = BlockHitResult.getBlockPos();
               if (this.lIllIll1IIlIl1lllIIl1IlIll11ll.lI11lllIl1l1Il1IlI111lll1lI() == ZenithInternal006$Helper.IlIlIl1I1II1l11Il
                  && Autocraft.l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos).getBlock() != Blocks.CRAFTING_TABLE) {
                  this.IIIllI11Il1l1l1.PacketHolder("Этот блок не является верстаком");
                  return true;
               }

               if ((
                     this.lIllIll1IIlIl1lllIIl1IlIll11ll.lI11lllIl1l1Il1IlI111lll1lI()
                           == ZenithInternal006$Helper.l111IIIl11lll1IlII111IlI11l
                        || this.lIllIll1IIlIl1lllIIl1IlIll11ll.lI11lllIl1l1Il1IlI111lll1lI()
                           == ZenithInternal006$Helper.I1lI1I1IIIl111I1ll1IlI1I11Il
                  )
                  && !this.Event(BlockPos)) {
                  this.IIIllI11Il1l1l1.PacketHolder("Этот тип сундуков пока не поддерживается");
                  return true;
               }

               longHolder_2 iii11l1l1il111lii1i1iil = longHolder_2.CallableImpl(BlockPos);
               if (this.lIllIll1IIlIl1lllIIl1IlIll11ll.lI11lllIl1l1Il1IlI111lll1lI() == ZenithInternal006$Helper.l111IIIl11lll1IlII111IlI11l
                  && !this.lIllIll1IIlIl1lllIIl1IlIll11ll.lI1l1lIl1I1111l1llIl1().isBlank()) {
                  ill111l1iiill1ll1illi.lllII1l1I1ll11IlII1lIlll1l1l()
                     .put(this.lIllIll1IIlIl1lllIIl1IlIll11ll.lI1l1lIl1I1111l1llIl1(), iii11l1l1il111lii1i1iil);
                  this.IIIllI11Il1l1l1.l1llII1IIlIlIIlI1();
                  this.IIIllI11Il1l1l1
                     .TextHolder_2(
                        "Сундук-источник сохранен для "
                           + ill111l1iiill1ll1illi.StringHolder_8(this.lIllIll1IIlIl1lllIIl1IlIll11ll.lI1l1lIl1I1111l1llIl1(), this.IIIllI11Il1l1l1)
                     );
               } else if (this.lIllIll1IIlIl1lllIIl1IlIll11ll.lI11lllIl1l1Il1IlI111lll1lI()
                  == ZenithInternal006$Helper.I1lI1I1IIIl111I1ll1IlI1I11Il) {
                  ill111l1iiill1ll1illi.StringHolder_8(iii11l1l1il111lii1i1iil);
                  this.IIIllI11Il1l1l1.TextHolder_2("Сундук-склад сохранен для " + ill111l1iiill1ll1illi.getDisplayName());
               } else if (this.lIllIll1IIlIl1lllIIl1IlIll11ll.lI11lllIl1l1Il1IlI111lll1lI() == ZenithInternal006$Helper.IlIlIl1I1II1l11Il) {
                  ill111l1iiill1ll1illi.EventBus(iii11l1l1il111lii1i1iil);
                  this.IIIllI11Il1l1l1.TextHolder_2("Верстак сохранен для " + ill111l1iiill1ll1illi.getDisplayName());
               }

               this.lIllIll1IIlIl1lllIIl1IlIll11ll = StringHolder_2.l111lll1lIlIIIIll1Il1IlIl1();
               this.Ill1ll1I11l1lllIIl();
               ZenithClient.getInstance().ZenithInternal115().save();
               return true;
            }

            this.IIIllI11Il1l1l1.PacketHolder("Наведитесь на блок для привязки Автокрафта");
            return true;
         }
      } else {
         return true;
      }
   }

   public void l1IlIl1lllllllI1l1() {
      if (!this.II111lllllI1llllI11Ill1lIl && !this.IIIllI11Il1l1l1.Spider()) {
         EventBus.StringHolder_8(this.IIIllI11Il1l1l1);
         this.II111lllllI1llllI11Ill1lIl = true;
      }
   }

   public void Ill1ll1I11l1lllIIl() {
      this.ConstructorHolder(false);
   }

   public void ConstructorHolder(boolean flag) {
      if (this.II111lllllI1llllI11Ill1lIl) {
         if (!flag && this.IIIllI11Il1l1l1.Spider()) {
            this.II111lllllI1llllI11Ill1lIl = false;
         } else {
            EventBus.EventBus(this.IIIllI11Il1l1l1);
            this.II111lllllI1llllI11Ill1lIl = false;
         }
      }
   }

   private boolean Event(BlockPos BlockPos) {
      BlockEntity BlockEntity = Autocraft.l11I1I1ll1Illll1I1l1111l1II.world.getBlockEntity(BlockPos);
      return BlockEntity instanceof ChestBlockEntity || BlockEntity instanceof BarrelBlockEntity || BlockEntity instanceof ShulkerBoxBlockEntity;
   }
}
