package l;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class AimBot extends Helper242 {
   private static final Helper334 SNAP_ROTATION = new Helper334(new Snap(), true, true);
   private static final int SAFE_BOW_RELEASE_TICKS = 15;
   private static final int SAFE_TRIDENT_RELEASE_TICKS = 10;
   private final Setting2 searchDistance = new Setting2("Дистанция", "").method2086(16.0F).method2078(5.0F, 64.0F);
   private final Setting8 targetType = new Setting8("Таргет", "").method2585("Players", "Mobs", "Animals").method2586("Players", "Mobs", "Animals");
   private LivingEntity currentTarget;
   private boolean pendingRelease;
   private boolean releaseAfterRotation;

   public AimBot() {
      super("AimBot", "AimBot", Helper269.COMBAT);
      this.setup(new Helper264[]{this.searchDistance, this.targetType});
   }

   @Override
   public void deactivate() {
      this.currentTarget = null;
      this.pendingRelease = false;
      this.releaseAfterRotation = false;
   }

   public LivingEntity method3715(World var1, Iterable<Entity> var2) {
      List<Entity> var3 = StreamSupport.stream(var2.spliterator(), false).collect(Collectors.toList());
      List<LivingEntity> var4 = var3.stream().filter(LivingEntity.class::isInstance).map(LivingEntity.class::cast).filter(this::method3716).collect(Collectors.toList());
      LivingEntity var5 = null;
      double var6 = Double.MAX_VALUE;
      Vec3d var8 = mc.player.getPos();

      for (LivingEntity var10 : var4) {
         double var11 = var10.getPos().distanceTo(var8);
         if (var11 < var6 && var11 <= this.searchDistance.method2082()) {
            var6 = var11;
            var5 = var10;
         }
      }

      this.currentTarget = var5;
      return this.currentTarget;
   }

   private boolean method3716(LivingEntity var1) {
      if (var1 == null || var1 == mc.player || !var1.isAlive()) {
         return false;
      } else if (!this.targetType.method2588("Players") && var1 instanceof PlayerEntity) {
         return false;
      } else if (!this.targetType.method2588("Mobs") && var1 instanceof MobEntity) {
         return false;
      } else {
         return !this.targetType.method2588("Animals") && var1 instanceof AnimalEntity ? false : !(var1 instanceof ArmorStandEntity);
      }
   }

   public Vec3d method3717(LivingEntity var1, Vec3d var2, float var3, float var4) {
      Vec3d var5 = var1.getPos().add(0.0, var1.getHeight() * 0.5, 0.0);
      Vec3d var6 = var1.getVelocity();
      Vec3d var7 = var5.subtract(var2);
      double var8 = var3 * var3 - var6.lengthSquared();
      double var10 = -2.0 * var7.dotProduct(var6);
      double var12 = -var7.lengthSquared();
      double var16 = var10 * var10 - 4.0 * var8 * var12;
      double var14;
      if (var16 > 0.0 && Math.abs(var8) > 1.0E-6) {
         double var18 = (-var10 + Math.sqrt(var16)) / (2.0 * var8);
         double var20 = (-var10 - Math.sqrt(var16)) / (2.0 * var8);
         var14 = Math.max(var18, var20);
      } else {
         var14 = var7.length() / var3;
      }

      Vec3d var22 = var5.add(var6.multiply(var14));
      return var22.add(0.0, 0.5 * var4 * var14 * var14, 0.0);
   }

   @Helper104
   public void onRotationUpdate(Event28 var1) {
      if (mc.player != null && mc.world != null) {
         if (var1.method4225() != 0) {
            if (var1.method4225() == 2 && this.releaseAfterRotation) {
               this.releaseAfterRotation = false;
               this.pendingRelease = false;
               mc.interactionManager.stopUsingItem(mc.player);
            }
         } else {
            ItemStack var2;
            boolean var4;
            label34: {
               var2 = mc.player.getMainHandStack();
               if (var2.getItem() instanceof CrossbowItem) {
                  CrossbowItem var10000 = (CrossbowItem)var2.getItem();
                  if (CrossbowItem.isCharged(var2)) {
                     var4 = true;
                     break label34;
                  }
               }

               var4 = false;
            }

            boolean var3 = var4;
            if (this.pendingRelease) {
               this.method3720(var2);
               this.releaseAfterRotation = true;
            } else if (var3 && mc.options.useKey.isPressed()) {
               this.method3720(var2);
            } else {
               this.currentTarget = null;
            }
         }
      }
   }

   @Helper104
   public void method3718(Helper429 var1) {
      if (mc.player != null && mc.world != null) {
         ItemStack var2 = mc.player.getMainHandStack();
         boolean var3 = var2.getItem() instanceof BowItem;
         boolean var4 = var2.getItem() instanceof TridentItem;
         boolean var5 = mc.player.isUsingItem() && mc.player.getActiveItem() == var2;
         if (var5 && (var3 || var4)) {
            if (var1.method4391() == 2 && !this.pendingRelease) {
               if (!var3 || mc.player.getItemUseTime() >= 15) {
                  if (!var4 || mc.player.getItemUseTime() >= 10) {
                     if (this.method3719() != null) {
                        Helper187.INSTANCE.method1615(true);
                        this.pendingRelease = true;
                        this.releaseAfterRotation = false;
                     }
                  }
               }
            }
         }
      }
   }

   private LivingEntity method3719() {
      if (this.currentTarget != null && !this.currentTarget.isAlive()) {
         this.currentTarget = null;
      }

      if (this.currentTarget == null) {
         this.currentTarget = this.method3715(mc.world, mc.world.getEntities());
         if (this.currentTarget == mc.player) {
            this.currentTarget = null;
         }
      }

      if (this.currentTarget != null && Helper309.method3075(this.currentTarget)) {
         this.currentTarget = null;
      }

      return this.currentTarget;
   }

   private void method3720(ItemStack var1) {
      LivingEntity var2 = this.method3719();
      if (var2 != null) {
         Vec3d var3 = mc.player.getPos().add(0.0, mc.player.getEyeHeight(mc.player.getPose()), 0.0).add(mc.player.getVelocity());
         float var4 = this.method3721(var1);
         float var5 = this.method3722(var1);
         Vec3d var6 = this.method3717(var2, var3, var4, var5);
         double var7 = var6.x - var3.x;
         double var9 = var6.y - var3.y;
         double var11 = var6.z - var3.z;
         double var13 = Math.sqrt(var7 * var7 + var11 * var11);
         float var15 = (float)Math.toDegrees(Math.atan2(var11, var7)) - 90.0F;
         float var16 = (float)(-Math.toDegrees(Math.atan2(var9, var13)));
         Helper351.INSTANCE.method3502(new Helper336(var15, var16), SNAP_ROTATION, Helper153.HIGH_IMPORTANCE_3, this);
      }
   }

   private float method3721(ItemStack var1) {
      if (var1.getItem() instanceof BowItem) {
         float var2 = MathHelper.clamp(mc.player.getItemUseTime() / 20.0F, 0.0F, 1.0F);
         var2 = (var2 * var2 + var2 * 2.0F) / 3.0F;
         return 3.0F * Math.min(var2, 1.0F);
      } else if (var1.getItem() instanceof TridentItem) {
         return 2.5F;
      } else {
         return var1.getItem() instanceof CrossbowItem ? 3.0F : 2.0F;
      }
   }

   private float method3722(ItemStack var1) {
      return !(var1.getItem() instanceof BowItem) && !(var1.getItem() instanceof TridentItem) && !(var1.getItem() instanceof CrossbowItem) ? 0.02F : 0.05F;
   }
}
