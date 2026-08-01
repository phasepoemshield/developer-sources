package l;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Fly extends Helper242 {
   private final Setting5 mode = new Setting5("Режим", "Выберите режим полета").method2381("Normal", "Dragon Fly").method2383("Normal");
   private final Setting2 speedXZ = new Setting2("Скорость XZ", "Горизонтальная скорость").method2086(1.5F).method2078(1.0F, 10.0F);
   private final Setting2 speedY = new Setting2("Скорость Y", "Вертикальная скорость").method2086(1.5F).method2078(0.0F, 10.0F);
   private final Helper339 stopWatch = new Helper339();

   public static Fly method4440() {
      return Helper222.method1979(Fly.class);
   }

   public Fly() {
      super("Fly", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.mode, this.speedXZ, this.speedY});
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (this.state && mc.player != null && mc.world != null) {
         if (this.mode.method2385("Normal")) {
            double var2 = this.method4441();
            this.method4445(this.speedXZ.method2082());
            Vec3d var4 = mc.player.getVelocity();
            mc.player.setVelocity(var4.x, var2, var4.z);
         } else if (this.mode.method2385("Dragon Fly")) {
            if (mc.player.getAbilities().flying) {
               boolean var9 = mc.player.age % 4 == 0;
               float var3 = var9 ? this.speedXZ.method2082() : this.speedXZ.method2082() * 0.82F;
               this.method4445(var3);
               double var11 = Math.min((double)this.speedY.method2082(), 0.12);
               double var6;
               if (mc.options.jumpKey.isPressed()) {
                  var6 = var9 ? var11 : var11 * 0.62;
               } else if (mc.options.sneakKey.isPressed()) {
                  var6 = var9 ? -var11 : -var11 * 0.62;
               } else {
                  var6 = var9 ? -0.035 : -0.015;
               }

               Vec3d var8 = mc.player.getVelocity();
               mc.player.setVelocity(var8.x, var6, var8.z);
            }
         } else if (this.mode.method2385("FunTime")) {
            if (!mc.player.horizontalCollision) {
               return;
            }

            if (this.stopWatch.method3356(200.0)) {
               int var10 = this.method4444();
               if (var10 == -1) {
                  Notifications.method1666().method1668("Громоотводы не найдены", 5000L);
                  this.deactivate();
                  return;
               }

               mc.player.setOnGround(true);
               mc.player.verticalCollision = true;
               mc.player.collidedSoftly = true;
               mc.player.jump();
               this.method4443(var10);
               mc.player.fallDistance = 0.0F;
               this.stopWatch.method3358();
            }
         }
      }
   }

   private double method4441() {
      if (mc.options.sneakKey.isPressed()) {
         return -this.speedY.method2082();
      } else {
         return mc.options.jumpKey.isPressed() ? this.speedY.method2082() : 0.0;
      }
   }

   private void method4442(BlockPos var1) {
      if (mc.world.getBlockState(var1).isAir()) {
         Vec3d var2 = new Vec3d(var1.getX() + 0.5, var1.getY() + 0.5, var1.getZ() + 0.5);
         BlockHitResult var3 = new BlockHitResult(var2, Direction.UP, var1.down(), false);
         mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var3);
         mc.player.swingHand(Hand.MAIN_HAND);
      }
   }

   private void method4443(int var1) {
      int var2 = mc.player.getInventory().selectedSlot;
      mc.player.getInventory().selectedSlot = var1;
      BlockPos var3 = mc.player.getBlockPos();

      for (int var4 = 1; var4 <= 2; var4++) {
         BlockPos var5 = var3.up(var4);
         if (mc.world.getBlockState(var5).isAir()) {
            this.method4442(var5);
         }
      }

      mc.player.getInventory().selectedSlot = var2;
   }

   private int method4444() {
      return Helper66.method716(
         var0 -> {
            Item var1 = mc.player.getInventory().getStack(var0).getItem();
            return var1 == Items.OAK_FENCE
               || var1 == Items.BIRCH_FENCE
               || var1 == Items.SPRUCE_FENCE
               || var1 == Items.JUNGLE_FENCE
               || var1 == Items.ACACIA_FENCE
               || var1 == Items.DARK_OAK_FENCE
               || var1 == Items.CRIMSON_FENCE
               || var1 == Items.WARPED_FENCE
               || var1 == Items.LIGHTNING_ROD
               || var1 == Items.NETHER_BRICK_FENCE;
         }
      );
   }

   private void method4445(float var1) {
      float var2 = mc.player.getYaw();
      float var3 = mc.player.forwardSpeed;
      float var4 = mc.player.sidewaysSpeed;
      float var5 = var1 / 3.0F;
      double var6 = 0.0;
      double var8 = 0.0;
      if (var3 != 0.0F || var4 != 0.0F) {
         float var10 = var2 * (float) (Math.PI / 180.0);
         var6 = -MathHelper.sin(var10) * var5 * var3 + MathHelper.cos(var10) * var5 * var4;
         var8 = MathHelper.cos(var10) * var5 * var3 + MathHelper.sin(var10) * var5 * var4;
      }

      mc.player.setVelocity(var6, mc.player.getVelocity().y, var8);
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.stopWatch.method3358();
   }

   public Setting5 method4446() {
      return this.mode;
   }

   public Setting2 method4447() {
      return this.speedXZ;
   }

   public Setting2 method4448() {
      return this.speedY;
   }

   public Helper339 method4449() {
      return this.stopWatch;
   }
}
