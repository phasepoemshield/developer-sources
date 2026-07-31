package zenith;

import net.minecraft.util.math.BlockPos;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.util.hit.BlockHitResult;

@ModuleInfo(
   name = "WallBypass",
   description = "",
   category = Category.MOVEMENT
)
public final class Wallbypass extends Module {
   public static final Wallbypass l1Il11ll111I1IIl1Il1lll1l = new Wallbypass();
   private static final double lIl11ll11IlI1lIlIIlllIlIll1lI = 3.0;
   private static final int l1IlI11ll1l11II11 = 70;
   private static final int[] IIl11Ill = new int[]{15, 5, 1};
   private final NumberSetting II1ll1IlllIIIlI1lII1lI1l = new NumberSetting(
      "module.wallBypass.attackDistance", 3.0F, 3.0F, 6.0F, 0.1F, "module.wallBypass.attackDistance.desc", "b"
   );
   private floatHolder_6 I11l1IIIllIIll;
   private boolean lllIllllI;
   private boolean Il1llIl1lI1;
   private int I11l11111;

   private Wallbypass() {
   }

   @Override
   public void onEnable() {
      this.I11l1IIIllIIll = this.ll11llll111Il1IIII();
      this.lllIllllI = this.I11l1IIIllIIll != null;
      this.Il1llIl1lI1 = false;
      this.I11l11111 = 1;
      if (!this.lllIllllI) {
         this.StringHolder_32(false);
      } else {
         super.l11l1lII();
      }
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.I11l1IIIllIIll = null;
      this.lllIllllI = false;
      this.Il1llIl1lI1 = false;
      this.I11l11111 = 0;
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void StringHolder_8(Vec3dHolder_2 ll1lii1ii1l11ii11lil111lili11) {
      if (this.I11l11111 <= 0) {
         ll1lii1ii1l11ii11lil111lili11.StringHolder_8(net.minecraft.util.math.Vec3d.ZERO);
      }
   }

   @EventTarget
   public void Event(EventImpl_30 ll1iil11ii) {
      if (!this.lllIllllI || this.I11l1IIIllIIll == null || l11I1I1ll1Illll1I1l1111l1II.player == null || l11I1I1ll1Illll1I1l1111l1II.world == null) {
         this.StringHolder_32(false);
      } else if (!this.Il1llIl1lI1) {
         floatHolder_6 il1ll111liili1ll11liil = this.I11l1IIIllIIll;
         II1ll1II1l11lI.StringHolder_8(
            new SupplierHolder(il1ll111liili1ll11liil, () -> il1ll111liili1ll11liil, llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()), 70, this, 1
         );
         this.Il1llIl1lI1 = true;
      }
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.Swinganimation() instanceof PlayerMoveC2SPacket) {
         if (this.I11l11111 > 0) {
            if (this.Il1llIl1lI1) {
               this.I11l11111--;
            }

            return;
         }

         ii1l11il1i1i.EventBus(true);
      }
   }

   public boolean lI1lIl1l11ll111Il11Il() {
      return this.Spider() && this.lllIllllI && this.I11l1IIIllIIll != null && this.I11l11111 <= 0;
   }

   public float I111lIlIl1111I1IIIIII11I() {
      return this.II1ll1IlllIIIlI1lII1lI1l.lll1lI1llll1IIllIIIII1lll();
   }

   private floatHolder_6 ll11llll111Il1IIII() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         floatHolder_6 il1ll111liili1ll11liil = II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1();
         float f = il1ll111liili1ll11liil.AutoBrewing();
         floatHolder_6[] ail1ll111liili1ll11liil = new floatHolder_6[]{
            new floatHolder_6(f, -90.0F),
            new floatHolder_6(f, 90.0F),
            new floatHolder_6(f, 0.0F),
            new floatHolder_6(l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), -90.0F),
            new floatHolder_6(l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), 90.0F),
            new floatHolder_6(l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), 0.0F)
         };

         for (floatHolder_6 il1ll111liili1ll11liil1 : ail1ll111liili1ll11liil) {
            if (this.ZenithInternal064(il1ll111liili1ll11liil1)) {
               return il1ll111liili1ll11liil1;
            }
         }

         for (int i : IIl11Ill) {
            floatHolder_6 il1ll111liili1ll11liil2 = this.EventTarget(f, i);
            if (il1ll111liili1ll11liil2 != null) {
               return il1ll111liili1ll11liil2;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private floatHolder_6 EventTarget(float f, int i) {
      int j = -90;

      while (j <= 90) {
         for (int k = 0; k < 360; k += i) {
            floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6(f + (float)k, (float)j);
            if (this.ZenithInternal064(il1ll111liili1ll11liil)) {
               return il1ll111liili1ll11liil;
            }

            if (k != 0) {
               floatHolder_6 il1ll111liili1ll11liil1 = new floatHolder_6(f - (float)k, (float)j);
               if (this.ZenithInternal064(il1ll111liili1ll11liil1)) {
                  return il1ll111liili1ll11liil1;
               }
            }
         }

         j += i;
      }

      return null;
   }

   private boolean ZenithInternal064(floatHolder_6 il1ll111liili1ll11liil) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(
            l11I1I1ll1Illll1I1l1111l1II.player.getCameraPosVec(1.0F), il1ll111liili1ll11liil, 3.0, BlockHitResult -> true
         );
         return BlockHitResult != null
            && BlockHitResult.getType() == net.minecraft.util.hit.HitResult.class_240.MISS
            && ZenithInternal066.ZenithInternal072(BlockPos.ofFloored(BlockHitResult.getPos()));
      } else {
         return false;
      }
   }
}
