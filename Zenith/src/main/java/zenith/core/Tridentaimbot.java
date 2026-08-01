package zenith;

import java.util.List;
import java.util.Optional;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.RaycastContext.LootTables60;

@ModuleInfo(
   name = "TridentAimbot",
   description = "",
   category = Category.COMBAT
)
public final class Tridentaimbot extends Module {
   public static final Tridentaimbot I1IlIIl1lll1IlIlI = new Tridentaimbot();
   private static final int IlIIlll1 = 1;
   private static final double l1IIlIlI1111llIl1III11l1ll11 = 2.5;
   private static final int lII1lll1Il1I11l = 90;
   private static final int l1l1I1lII111II11I1I = 50;
   private final NumberSetting l1ll1ll1IIIIlIII1ll111lI1 = new NumberSetting(
      "module.elytraTarget.predictSetting", 3.0F, 0.0F, 6.0F, 1.0F, "module.itemUseController.predictSetting.desc", "t"
   );

   @EventTarget
   public void Event(EventImpl_30 ll1iil11ii) {
      if (l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem() && l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem().getItem() == Items.TRIDENT) {
         floatHolder_6 il1ll111liili1ll11liil = this.ll1Il11ll1l11l1lIl();
         if (il1ll111liili1ll11liil == null) {
            return;
         }

         floatHolder_6 il1ll111liili1ll11liil1 = llI1lIIIlII111I11l1lIIl11.StringHolder_8(
            llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil
         );
         ZenithClient.getInstance()
            .ZenithInternal057()
            .StringHolder_8(
               new SupplierHolder(il1ll111liili1ll11liil1, () -> il1ll111liili1ll11liil1, llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II()), 20, this
            );
      }
   }

   private floatHolder_6 ll1Il11ll1l11l1lIl() {
      floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6(
         l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), l11I1I1ll1Illll1I1l1111l1II.player.getPitch()
      );

      try {
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem();
         PlayerEntityHolder lll111ll1i1l11l1 = PlayerEntityHolder.FileHolder_2(1);
         net.minecraft.util.math.Vec3d Vec3d = this.ZenithInternal095(lll111ll1i1l11l1);
         LivingEntity LivingEntity = this.StringHolder_8(lll111ll1i1l11l1, ItemStack);
         if (LivingEntity == null) {
            return null;
         } else {
            net.minecraft.util.math.Box Box = this.ZenithInternal028(LivingEntity);
            floatHolder_6 il1ll111liili1ll11liil1 = floatHolder_6.EventImpl_21(this.StringHolder_8(Box), Vec3d);
            return this.StringHolder_8(ItemStack, lll111ll1i1l11l1, il1ll111liili1ll11liil1, Box);
         }
      } catch (Exception exception) {
         exception.printStackTrace();
         return il1ll111liili1ll11liil;
      }
   }

   public net.minecraft.util.math.Vec3d EventImpl_24(LivingEntity LivingEntity) {
      return this.StringHolder_8(this.ZenithInternal028(LivingEntity));
   }

   public LivingEntity lI1IIllII11I() {
      return l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem()
            && l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem().getItem() == Items.TRIDENT
         ? this.StringHolder_8(PlayerEntityHolder.FileHolder_2(1), l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem())
         : null;
   }

   private LivingEntity StringHolder_8(PlayerEntityHolder lll111ll1i1l11l1, ItemStack ItemStack) {
      List list = this.StringHolder_8(ItemStack, ZenithInternal131.ll1II1l1lII11IlII1(), lll111ll1i1l11l1);
      if (list != null && !list.isEmpty()) {
         net.minecraft.util.hit.HitResult HitResult = (net.minecraft.util.hit.HitResult)list.getFirst();
         if (HitResult == null) {
            return null;
         } else {
            if (HitResult instanceof EntityHitResult EntityHitResult
               && EntityHitResult.getEntity() instanceof LivingEntity LivingEntity
               && !ZenithClient.getInstance().StringHolder_26().EventBus(LivingEntity)) {
               return LivingEntity;
            }

            PlayerEntity PlayerEntity = null;
            double d1 = Double.MAX_VALUE;

            for (PlayerEntity PlayerEntityx : l11I1I1ll1Illll1I1l1111l1II.world.getPlayers()) {
               if (l11I1I1ll1Illll1I1l1111l1II.player != PlayerEntityx
                  && !ZenithClient.getInstance().StringHolder_26().EventBus(PlayerEntityx)) {
                  double d0 = this.EventImpl_24(PlayerEntityx).squaredDistanceTo(HitResult.getPos());
                  if (d0 < d1) {
                     d1 = d0;
                     PlayerEntity = PlayerEntityx;
                  }
               }
            }

            return PlayerEntity;
         }
      } else {
         return null;
      }
   }

   public net.minecraft.util.math.Vec3d StringHolder_8(net.minecraft.util.math.Box Box) {
      return new net.minecraft.util.math.Vec3d(
         MathHelper.lerp(0.5, Box.minX, Box.maxX),
         MathHelper.lerp(0.8, Box.minY, Box.maxY),
         MathHelper.lerp(0.5, Box.minZ, Box.maxZ)
      );
   }

   private List<net.minecraft.util.hit.HitResult> StringHolder_8(
      ItemStack ItemStack, floatHolder_6 il1ll111liili1ll11liil, PlayerEntityHolder lll111ll1i1l11l1
   ) {
      net.minecraft.util.hit.HitResult HitResult = Predictions.l1l1IIIIl1IIllIIIlI
         .StringHolder_8(
            this.ZenithInternal095(lll111ll1i1l11l1),
            lll111ll1i1l11l1.lI1lllIl1IIIl1l1IlIlIl,
            il1ll111liili1ll11liil.lllIl11IIIlIIlI1(),
            new TridentEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack),
            this.llllI1l11IlI11II11l11lI1l()
         );
      return HitResult == null ? List.of() : List.of(HitResult);
   }

   private net.minecraft.util.math.Vec3d ZenithInternal095(PlayerEntityHolder lll111ll1i1l11l1) {
      return lll111ll1i1l11l1.l1l111I11I1I
         .add(0.0, (double)l11I1I1ll1Illll1I1l1111l1II.player.getEyeHeight(l11I1I1ll1Illll1I1l1111l1II.player.getPose()), 0.0);
   }

   private int llIllI1I1Il1IlIl1I1I1I1lIlI() {
      return 1 + (int)this.l1ll1ll1IIIIlIII1ll111lI1.lll1lI1llll1IIllIIIII1lll();
   }

   private net.minecraft.util.math.Box ZenithInternal028(LivingEntity LivingEntity) {
      if (LivingEntity instanceof PlayerEntity PlayerEntity) {
         return PlayerEntityHolder.ZenithInternal095(PlayerEntity, this.llIllI1I1Il1IlIl1I1I1I1lIlI()).IlIIll1l1lllll1I;
      } else {
         net.minecraft.util.math.Vec3d Vec3d = LivingEntity.getPos().subtract(LivingEntity.prevX, LivingEntity.prevY, LivingEntity.prevZ);
         return LivingEntity.getBoundingBox().offset(Vec3d.multiply(1.0));
      }
   }

   private floatHolder_6 StringHolder_8(
      ItemStack ItemStack, PlayerEntityHolder lll111ll1i1l11l1, floatHolder_6 il1ll111liili1ll11liil, net.minecraft.util.math.Box Box
   ) {
      TridentEntity TridentEntity = new TridentEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack);
      net.minecraft.util.math.Vec3d Vec3dx = this.ZenithInternal095(lll111ll1i1l11l1);
      net.minecraft.util.math.Vec3d Vec3dx = lll111ll1i1l11l1.lI1lllIl1IIIl1l1IlIlIl;
      double d0 = this.llllI1l11IlI11II11l11lI1l();
      if (this.StringHolder_8(il1ll111liili1ll11liil, Vec3dx, Vec3dx, Box, TridentEntity, d0)) {
         return il1ll111liili1ll11liil;
      } else {
         int i = Math.round(il1ll111liili1ll11liil.AutoBrewing());
         int j = Math.round(il1ll111liili1ll11liil.Basefinder());
         Integer integer = this.StringHolder_8(i, j, Vec3dx, Vec3dx, Box, TridentEntity, d0);
         if (integer == null) {
            return null;
         } else {
            floatHolder_6 il1ll111liili1ll11liil1 = new floatHolder_6((float)i, (float)integer.intValue());
            return this.StringHolder_8(il1ll111liili1ll11liil1, Vec3dx, Vec3dx, Box, TridentEntity, d0)
               ? il1ll111liili1ll11liil1
               : this.EventBus(i, integer, Vec3dx, Vec3dx, Box, TridentEntity, d0);
         }
      }
   }

   private Integer StringHolder_8(
      int i, int j, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box, TridentEntity TridentEntity, double d0
   ) {
      for (int k = 0; k <= 90; k++) {
         int l = j + k;
         if (this.EventTarget(i, l, Vec3dx, Vec3d, Box, TridentEntity, d0)) {
            return l;
         }

         if (k != 0) {
            int i1 = j - k;
            if (this.EventTarget(i, i1, Vec3dx, Vec3d, Box, TridentEntity, d0)) {
               return i1;
            }
         }
      }

      return null;
   }

   private floatHolder_6 EventBus(
      int i, int j, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box, TridentEntity TridentEntity, double d0
   ) {
      for (int k = 1; k <= 50; k++) {
         floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6((float)(i + k), (float)j);
         if (this.StringHolder_8(il1ll111liili1ll11liil, Vec3dx, Vec3d, Box, TridentEntity, d0)) {
            return il1ll111liili1ll11liil.hasTimeElapsed(3.0F, 0.0F);
         }

         floatHolder_6 il1ll111liili1ll11liil1 = new floatHolder_6((float)(i - k), (float)j);
         if (this.StringHolder_8(il1ll111liili1ll11liil1, Vec3dx, Vec3d, Box, TridentEntity, d0)) {
            return il1ll111liili1ll11liil1.hasTimeElapsed(-3.0F, 0.0F);
         }
      }

      return null;
   }

   private boolean EventTarget(
      int i, int j, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box, TridentEntity TridentEntity, double d0
   ) {
      floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6((float)i, (float)j);
      net.minecraft.util.math.Vec3d Vec3dx = il1ll111liili1ll11liil.lllIl11IIIlIIlI1();
      double d1 = Vec3dx.length();
      if (d1 <= 1.0E-6) {
         return false;
      } else {
         net.minecraft.util.math.Vec3d Vec3dxx = this.StringHolder_8(Box);
         net.minecraft.util.math.Vec3d Vec3dxxx = new net.minecraft.util.math.Vec3d(
            Vec3dxx.x - Vec3dxxx.x, 0.0, Vec3dxx.z - Vec3dxxx.z
         );
         double d2 = Vec3dxxx.horizontalLength();
         if (d2 <= 1.0E-6) {
            return true;
         } else {
            Vec3dxxx = Vec3dxxx.normalize();
            net.minecraft.util.math.Vec3d Vec3dxxxx = Vec3dxxx;
            net.minecraft.util.math.Vec3d Vec3dxxxxx = Vec3dx.multiply(d0 / d1).add(Vec3dxxxxxxxx);

            for (int k = 0; k < 300; k++) {
               net.minecraft.util.math.Vec3d Vec3dxxxxxx = Vec3dxxxx;
               Vec3dxxxx = Vec3dxxxx.add(Vec3dxxxxx);
               net.minecraft.util.math.Vec3d Vec3dxxxxxxx = Predictions.l1l1IIIIl1IIllIIIlI.StringHolder_8(TridentEntity, Vec3dxxxxxx, Vec3dxxxxx);
               BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(Vec3dxxxxxx, Vec3dxxxx, LootTables60.COLLIDER, TridentEntity);
               double d3 = this.StringHolder_8(Vec3dxxxxxx, Vec3dxxxx, BlockHitResult);
               double d4 = this.EventBus(Vec3dxxxxxx, Vec3dxxx, Vec3dxxx);
               double d5 = this.EventBus(Vec3dxxxx, Vec3dxxx, Vec3dxxx);
               if (d5 >= d2) {
                  double d6 = d5 - d4;
                  double d7 = d6 <= 1.0E-6 ? 0.0 : MathHelper.clamp((d2 - d4) / d6, 0.0, 1.0);
                  if (!(d7 <= d3)) {
                     return false;
                  }

                  double d8 = MathHelper.lerp(d7, Vec3dxxxxxx.y, Vec3dxxxx.y);
                  return d8 >= Box.minY && d8 <= Box.maxY;
               }

               if (d3 < 1.0 || Vec3dxxxx.y < -128.0) {
                  return false;
               }

               Vec3dxxxxx = Vec3dxxxxxxx;
            }

            return false;
         }
      }
   }

   private boolean StringHolder_8(
      floatHolder_6 il1ll111liili1ll11liil,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Box Box,
      TridentEntity TridentEntity,
      double d0
   ) {
      net.minecraft.util.math.Vec3d Vec3dx = il1ll111liili1ll11liil.lllIl11IIIlIIlI1();
      double d1 = Vec3dx.length();
      if (d1 <= 1.0E-6) {
         return false;
      } else {
         net.minecraft.util.math.Vec3d Vec3dxx = Vec3dxxxxxx;
         net.minecraft.util.math.Vec3d Vec3dxxx = Vec3dx.multiply(d0 / d1).add(Vec3dxxxxx);

         for (int i = 0; i < 300; i++) {
            net.minecraft.util.math.Vec3d Vec3dxxxx = Vec3dxx;
            Vec3dxx = Vec3dxx.add(Vec3dxxx);
            net.minecraft.util.math.Vec3d Vec3dxxxxx = Predictions.l1l1IIIIl1IIllIIIlI.StringHolder_8(TridentEntity, Vec3dxxxx, Vec3dxxx);
            BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(Vec3dxxxx, Vec3dxx, LootTables60.COLLIDER, TridentEntity);
            double d2 = BlockHitResult.getType() == net.minecraft.util.hit.HitResult.class_240.MISS
               ? Double.POSITIVE_INFINITY
               : Vec3dxxxx.squaredDistanceTo(BlockHitResult.getPos());
            Optional optional = Box.raycast(Vec3dxxxx, Vec3dxx);
            if (optional.isPresent() && Vec3dxxxx.squaredDistanceTo((net.minecraft.util.math.Vec3d)optional.get()) <= d2) {
               return true;
            }

            if (BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.MISS || Vec3dxx.y < -128.0) {
               return false;
            }

            Vec3dxxx = Vec3dxxxxx;
         }

         return false;
      }
   }

   private double llllI1l11IlI11II11l11lI1l() {
      return 2.5;
   }

   private double EventBus(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d) {
      net.minecraft.util.math.Vec3d Vec3dx = Vec3dxxx.subtract(Vec3dxx);
      return Vec3dx.x * Vec3dx.x + Vec3dx.z * Vec3dx.z;
   }

   private double StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, BlockHitResult BlockHitResult) {
      if (BlockHitResult.getType() == net.minecraft.util.hit.HitResult.class_240.MISS) {
         return Double.POSITIVE_INFINITY;
      } else {
         double d0 = Vec3dx.distanceTo(Vec3d);
         return d0 <= 1.0E-6 ? 0.0 : Vec3dx.distanceTo(BlockHitResult.getPos()) / d0;
      }
   }
}
