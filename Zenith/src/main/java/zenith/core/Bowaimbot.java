package zenith;

import java.util.List;
import java.util.Optional;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.RaycastContext.LootTables60;

@ModuleInfo(
   name = "BowAimBot",
   description = "",
   category = Category.COMBAT
)
public final class Bowaimbot extends Module {
   public static final Bowaimbot Il1I11lIll1I1lI11lIlII1ll = new Bowaimbot();
   private static final int IIll1I11II1I11I1Il1 = 1;
   private static final int lIlll11I1I1I = 90;
   private static final int IlIIllll1ll11IIlIl1lI1111II1 = 50;
   private int IIIlII1I1I = 0;
   private boolean lllI1I1I1llIIlll;
   private final BooleanSetting l11l1I1ll1I11l1ll1l11lI1l1l = new BooleanSetting("module.bowAimBot.autoShoot", true);
   private final NumberSetting IIl1l11l1lI11l11IIl1l11II = new NumberSetting(
      "module.bowAimBot.predictSetting", 3.0F, 0.0F, 6.0F, 1.0F, "module.bowAimBot.predictSetting.desc", "t"
   );

   @EventTarget
   public void Event(EventImpl_30 ll1iil11ii) {
      if (this.lllI1I1I1llIIlll) {
         this.lllI1I1I1llIIlll = false;
         this.I1Il1I11IlI11();
      }

      if (l11I1I1ll1Illll1I1l1111l1II.player.isUsingItem() && l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem().getItem() == Items.BOW) {
         this.I1Il1I11IlI11();
         floatHolder_6 il1ll111liili1ll11liil = this.ll1Il11ll1l11l1lIl();
         if (il1ll111liili1ll11liil == null) {
            this.IIIlII1I1I = 0;
            return;
         }

         floatHolder_6 il1ll111liili1ll11liil1 = llI1lIIIlII111I11l1lIIl11.StringHolder_8(
            llI1lIIIlII111I11l1lIIl11.lIIIl1IllIlIIll1II(), il1ll111liili1ll11liil
         );
         ZenithClient.getInstance()
            .ZenithInternal057()
            .StringHolder_8(
               new SupplierHolder(il1ll111liili1ll11liil1, () -> il1ll111liili1ll11liil1, llI1lIIIlII111I11l1lIIl11.IlIll11I1lll1II1llI1I1II()), 20, this
            );
      }
   }

   private void I1Il1I11IlI11() {
      l11I1I1ll1Illll1I1l1111l1II.options
         .useKey
         .setPressed(ZenithInternal066.StringHolder_8(KeyBindingHelper.getBoundKeyOf(l11I1I1ll1Illll1I1l1111l1II.options.useKey)));
   }

   private floatHolder_6 ll1Il11ll1l11l1lIl() {
      floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6(
         l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), l11I1I1ll1Illll1I1l1111l1II.player.getPitch()
      );

      try {
         ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem();
         PlayerEntityHolder lll111ll1i1l11l1 = PlayerEntityHolder.FileHolder_2(1);
         net.minecraft.util.math.Vec3d Vec3d = this.ZenithInternal095(lll111ll1i1l11l1);
         LivingEntity LivingEntity = this.EventTarget(lll111ll1i1l11l1);
         if (LivingEntity == null) {
            return null;
         } else {
            net.minecraft.util.math.Box Box = this.ZenithInternal028(LivingEntity);
            floatHolder_6 il1ll111liili1ll11liil1 = floatHolder_6.EventImpl_21(this.StringHolder_8(Box), Vec3d);
            return this.l11l1I1ll1I11l1ll1l11lI1l1l.Spider() && this.StringHolder_8(ItemStack, lll111ll1i1l11l1, Box)
               ? null
               : this.StringHolder_8(ItemStack, lll111ll1i1l11l1, il1ll111liili1ll11liil1, Box);
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
      return this.EventTarget(PlayerEntityHolder.FileHolder_2(1));
   }

   private LivingEntity EventTarget(PlayerEntityHolder lll111ll1i1l11l1) {
      List list = this.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.player.getActiveItem(), ZenithInternal131.ll1II1l1lII11IlII1(), lll111ll1i1l11l1);
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
      return Predictions.l1l1IIIIl1IIllIIIlI
         .StringHolder_8(ItemStack, il1ll111liili1ll11liil, this.ZenithInternal095(lll111ll1i1l11l1), lll111ll1i1l11l1.lI1lllIl1IIIl1l1IlIlIl, 1);
   }

   private net.minecraft.util.math.Vec3d ZenithInternal095(PlayerEntityHolder lll111ll1i1l11l1) {
      return lll111ll1i1l11l1.l1l111I11I1I
         .add(0.0, (double)l11I1I1ll1Illll1I1l1111l1II.player.getEyeHeight(l11I1I1ll1Illll1I1l1111l1II.player.getPose()), 0.0);
   }

   private int llIllI1I1Il1IlIl1I1I1I1lIlI() {
      return 1 + (int)this.IIl1l11l1lI11l11IIl1l11II.lll1lI1llll1IIllIIIII1lll();
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
      ArrowEntity ArrowEntity = new ArrowEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack, ItemStack);
      net.minecraft.util.math.Vec3d Vec3dx = this.ZenithInternal095(lll111ll1i1l11l1);
      net.minecraft.util.math.Vec3d Vec3dx = lll111ll1i1l11l1.lI1lllIl1IIIl1l1IlIlIl;
      double d0 = this.Il1IIl111IIll1III();
      if (this.EventBus(il1ll111liili1ll11liil, Vec3dx, Vec3dx, Box, ArrowEntity, d0)) {
         return il1ll111liili1ll11liil;
      } else {
         int i = Math.round(il1ll111liili1ll11liil.AutoBrewing());
         int j = Math.round(il1ll111liili1ll11liil.Basefinder());
         Integer integer = this.StringHolder_8(i, j, Vec3dx, Vec3dx, Box, ArrowEntity, d0);
         if (integer == null) {
            return null;
         } else {
            floatHolder_6 il1ll111liili1ll11liil1 = new floatHolder_6((float)i, (float)integer.intValue());
            return this.EventBus(il1ll111liili1ll11liil1, Vec3dx, Vec3dx, Box, ArrowEntity, d0)
               ? il1ll111liili1ll11liil1
               : this.EventBus(i, integer, Vec3dx, Vec3dx, Box, ArrowEntity, d0);
         }
      }
   }

   private boolean StringHolder_8(ItemStack ItemStack, PlayerEntityHolder lll111ll1i1l11l1, net.minecraft.util.math.Box Box) {
      if (l11I1I1ll1Illll1I1l1111l1II.interactionManager == null) {
         return false;
      } else {
         ArrowEntity ArrowEntity = new ArrowEntity(l11I1I1ll1Illll1I1l1111l1II.world, l11I1I1ll1Illll1I1l1111l1II.player, ItemStack, ItemStack);
         net.minecraft.util.math.Vec3d Vec3dx = this.ZenithInternal095(lll111ll1i1l11l1);
         net.minecraft.util.math.Vec3d Vec3dx = lll111ll1i1l11l1.lI1lllIl1IIIl1l1IlIlIl;
         double d0 = this.Il1IIl111IIll1III();
         if (!this.StringHolder_8(ZenithInternal131.ll1II1l1lII11IlII1(), Vec3dx, Vec3dx, Box, ArrowEntity, d0)) {
            return false;
         } else {
            l11I1I1ll1Illll1I1l1111l1II.options.useKey.setPressed(false);
            this.lllI1I1I1llIIlll = true;
            return true;
         }
      }
   }

   private boolean StringHolder_8(
      floatHolder_6 il1ll111liili1ll11liil,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Box Box,
      ArrowEntity ArrowEntity,
      double d1
   ) {
      double d0 = l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(Box.getCenter());
      return this.IIIlII1I1I++ > (d0 < 100.0 ? (d0 < 16.0 ? 2 : 5) : 7);
   }

   private Integer StringHolder_8(
      int i, int j, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box, ArrowEntity ArrowEntity, double d0
   ) {
      for (int k = 0; k <= 90; k++) {
         int l = j + k;
         if (this.EventTarget(i, l, Vec3dx, Vec3d, Box, ArrowEntity, d0)) {
            return l;
         }

         if (k != 0) {
            int i1 = j - k;
            if (this.EventTarget(i, i1, Vec3dx, Vec3d, Box, ArrowEntity, d0)) {
               return i1;
            }
         }
      }

      return null;
   }

   private floatHolder_6 EventBus(
      int i, int j, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box, ArrowEntity ArrowEntity, double d0
   ) {
      for (int k = 1; k <= 50; k++) {
         floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6((float)(i + k), (float)j);
         if (this.EventBus(il1ll111liili1ll11liil, Vec3dx, Vec3d, Box, ArrowEntity, d0)) {
            return il1ll111liili1ll11liil.hasTimeElapsed(3.0F, 0.0F);
         }

         floatHolder_6 il1ll111liili1ll11liil1 = new floatHolder_6((float)(i - k), (float)j);
         if (this.EventBus(il1ll111liili1ll11liil1, Vec3dx, Vec3d, Box, ArrowEntity, d0)) {
            return il1ll111liili1ll11liil1.hasTimeElapsed(-3.0F, 0.0F);
         }
      }

      return null;
   }

   private boolean EventTarget(
      int i, int j, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box, ArrowEntity ArrowEntity, double d0
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
               net.minecraft.util.math.Vec3d Vec3dxxxxxxx = Predictions.l1l1IIIIl1IIllIIIlI.StringHolder_8(ArrowEntity, Vec3dxxxxxx, Vec3dxxxxx);
               BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(Vec3dxxxxxx, Vec3dxxxx, LootTables60.COLLIDER, ArrowEntity);
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

               if (d3 < 1.0) {
                  return false;
               }

               if (Vec3dxxxx.y < -128.0) {
                  return false;
               }

               Vec3dxxxxx = Vec3dxxxxxxx;
            }

            return false;
         }
      }
   }

   private boolean EventBus(
      floatHolder_6 il1ll111liili1ll11liil,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Box Box,
      ArrowEntity ArrowEntity,
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
            net.minecraft.util.math.Vec3d Vec3dxxxxx = Predictions.l1l1IIIIl1IIllIIIlI.StringHolder_8(ArrowEntity, Vec3dxxxx, Vec3dxxx);
            BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(Vec3dxxxx, Vec3dxx, LootTables60.COLLIDER, ArrowEntity);
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

   private double Il1IIl111IIll1III() {
      float f = (float)l11I1I1ll1Illll1I1l1111l1II.player.getItemUseTime() + l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter().getTickDelta(false) + 1.0F;
      return (double)(3.0F * MathHelper.clamp(f / 20.0F, 0.0F, 1.0F));
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
