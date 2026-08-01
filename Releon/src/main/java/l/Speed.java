package l;

import antidaunleak.api.annotation.Native;
import fat.releon.mixins.client.IRenderTickCounterDynamic;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.Mode;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Speed extends Helper242 {
   private final Setting5 mode = new Setting5("Mode", "Select speed mode")
      .method2381("Normal", "SpookyTime", "FunTime Snow", "Collision", "HolyWorld")
      .method2383("Collision");
   private final Setting2 speed = new Setting2("Speed", "Base movement speed")
      .method2078(1.0F, 5.0F)
      .method2086(1.5F)
      .method2081(() -> this.mode.method2385("Normal"));
   private final Setting2 boxSize = new Setting2("Hitbox Expand", "Expand range for collision boost")
      .method2078(0.2F, 0.4F)
      .method2086(0.3F)
      .method2081(() -> this.mode.method2385("Collision"));
   private final Setting2 motionMultiplier = new Setting2("Motion Multiplier", "Boost per collision")
      .method2078(0.02F, 0.04F)
      .method2086(0.03F)
      .method2081(() -> this.mode.method2385("Collision"));
   private final Setting2 timerGroundBoost = new Setting2("Timer Ground", "Tick timer speed on ground")
      .method2078(1.0F, 3.0F)
      .method2086(1.35F)
      .method2081(() -> this.mode.method2385("Timer"));
   private final Setting2 timerAirBoost = new Setting2("Timer Air", "Tick timer speed in air")
      .method2078(1.0F, 2.5F)
      .method2086(1.15F)
      .method2081(() -> this.mode.method2385("Timer"));
   private boolean spookyLying = false;
   private int ticks;
   private int groundTicks;

   public Speed() {
      super("Speed", "Speed", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.mode, this.speed, this.boxSize, this.motionMultiplier, this.timerGroundBoost, this.timerAirBoost});
   }

   public static Speed method2390() {
      return Helper222.method1979(Speed.class);
   }

   public boolean method2391() {
      return this.isState() && this.mode.method2385("SpookyTime");
   }

   @Override
   public void deactivate() {
      this.spookyLying = false;
      this.ticks = 0;
      this.groundTicks = 0;
      this.method2399(1.0F);
      super.deactivate();
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (this.isState() && mc.player != null && mc.world != null) {
         if (this.mode.method2385("Normal")) {
            Helper165.method1365(this.speed.method2082() / 3.0F);
         }

         if (this.mode.method2385("Timer")) {
            if (!Helper165.method1351()) {
               this.method2399(1.0F);
               return;
            }

            if (mc.player.isOnGround()) {
               mc.player.jump();
               this.method2399(this.timerGroundBoost.method2082());
            } else {
               this.method2399(this.timerAirBoost.method2082());
            }
         } else if (this.mode.method2385("Expensive Timer")) {
            if (!Helper165.method1351()) {
               this.method2399(1.0F);
               return;
            }

            if (mc.player.isOnGround()) {
               this.method2399(1.0F);
               mc.player.jump();
               return;
            }

            float var2 = mc.player.fallDistance;
            if (var2 <= 0.1F) {
               this.method2399(1.4F);
            } else if (var2 < 1.3F) {
               this.method2399(0.8F);
            } else {
               this.method2399(1.0F);
            }
         } else {
            this.method2399(1.0F);
         }
      }
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   public void method2392(Helper387 var1) {
      if (this.isState() && mc.player != null && mc.world != null) {
         if (this.mode.method2385("FunTime Snow")) {
            boolean var2 = this.method2395();
            if (mc.player.isOnGround() && var2 && (mc.player.input.movementForward != 0.0F || mc.player.input.movementSideways != 0.0F)) {
               Vec3d var3 = mc.player.getVelocity();
               double var4 = 0.07F;
               double var6 = 0.12F;
               float var8 = mc.player.getYaw();
               double var9 = mc.player.input.movementForward;
               double var11 = mc.player.input.movementSideways;
               var9 *= 0.98;
               var11 *= 0.98;
               double var13 = -Math.sin(Math.toRadians(var8)) * var9 + Math.cos(Math.toRadians(var8)) * var11;
               double var15 = Math.cos(Math.toRadians(var8)) * var9 + Math.sin(Math.toRadians(var8)) * var11;
               double var17 = Math.sqrt(var13 * var13 + var15 * var15);
               if (var17 > 1.0) {
                  var13 /= var17;
                  var15 /= var17;
               }

               var3 = var3.add(var13 * var4 * 0.065, 0.0, var15 * var4 * 0.065);
               if (mc.options.jumpKey.isPressed()) {
                  float var19 = Helper351.INSTANCE.method3483().method3334();
                  float var20 = var19 >= 0.0F ? MathHelper.clamp(var19 / 45.0F, 1.0F, 2.5F) : 0.9F;
                  var3 = var3.add(0.0, var6 * var20 * 0.08, 0.0);
               } else if (mc.options.sneakKey.isPressed()) {
                  var3 = var3.add(0.0, -var6 * 0.12, 0.0);
               }

               mc.player.setVelocity(var3);
            }
         }

         if (this.mode.method2385("SpookyTime") && mc.player.isSwimming()) {
            mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(mc.player, Mode.PRESS_SHIFT_KEY));
            mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(mc.player, Mode.RELEASE_SHIFT_KEY));
            float var21 = 1.05F;
            Vec3d var25 = mc.player.getVelocity();
            mc.player.setVelocity(var25.x * var21, var25.y, var25.z * var21);
         }

         if (this.mode.method2385("Collision") && var1.method3901() && Helper165.method1351() && mc.player.jumping) {
            int var22 = 0;

            for (Entity var30 : mc.world.getEntities()) {
               if (var30 != mc.player
                  && !(var30 instanceof ArmorStandEntity)
                  && (var30 instanceof LivingEntity || var30 instanceof BoatEntity)
                  && mc.player.getBoundingBox().expand(this.boxSize.method2082()).intersects(var30.getBoundingBox())) {
                  var22++;
               }
            }

            if (var22 > 0) {
               double[] var27 = Helper165.method1359(this.motionMultiplier.method2082());
               mc.player.addVelocity(var27[0], 0.0, var27[1]);
            }
         }

         if (this.mode.method2385("HolyWorld") && var1.method3901() && Helper165.method1351() && mc.player.jumping) {
            int var23 = 0;

            for (Entity var31 : mc.world.getEntities()) {
               if (var31 != mc.player
                  && !(var31 instanceof ArmorStandEntity)
                  && (var31 instanceof LivingEntity || var31 instanceof BoatEntity)
                  && mc.player.getBoundingBox().expand(0.2F).intersects(var31.getBoundingBox())) {
                  var23++;
               }
            }

            if (var23 > 0) {
               double[] var29 = Helper165.method1359(0.03F);
               mc.player.addVelocity(var29[0], 0.0, var29[1]);
            }
         }
      }
   }

   @Helper104
   public void method2393(Event12 var1) {
      if (this.isState() && mc.player != null && mc.world != null && this.mode.method2385("ReallyWorld")) {
         this.method2399(1.7F);
         if (this.ticks > 3) {
            double var2 = 0.03;
            if (this.ticks % 2 == 0) {
               mc.player.addVelocityInternal(new Vec3d(0.0, 0.03, 0.0));
               var2 = mc.player.isOnGround() ? 0.085 : 0.03;
            }

            double var4 = this.method2398();
            double var6 = 0.0;
            double var8 = 0.0;
            if (var4 != -1.0) {
               double var10 = Math.toRadians(var4);
               var6 = -Math.sin(var10);
               var8 = Math.cos(var10);
            }

            mc.player.addVelocityInternal(new Vec3d(var6 * var2, 0.0, var8 * var2));
         }

         this.ticks++;
      }
   }

   @Helper104
   public void onInput(Helper379 var1) {
      if (this.isState() && mc.player != null && mc.world != null && this.mode.method2385("ReallyWorld")) {
         if (mc.player.verticalCollision) {
            this.groundTicks++;
         } else {
            this.groundTicks = 0;
         }

         if (this.groundTicks >= 1) {
            mc.player.jump();
         }
      }
   }

   @Helper104
   public void method2394(Helper373 var1) {
      if (this.isState() && mc.player != null && mc.world != null && this.mode.method2385("ReallyWorld")) {
         if (this.ticks % 2 == 0) {
            this.method2399(0.3F);
            Helper38.method525(new ClientCommandC2SPacket(mc.player, Mode.START_FALL_FLYING));
         }
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (this.isState() && mc.player != null && mc.world != null && this.mode.method2385("ReallyWorld")) {
         if (var1.method3896() == Helper385.RECEIVE && var1.method3895() instanceof PlayerPositionLookS2CPacket) {
            if (this.ticks % 2 == 1) {
               this.ticks++;
            }

            this.method2399(1.0F);
         }
      }
   }

   private boolean method2395() {
      BlockPos var1 = mc.player.getBlockPos();
      return this.method2396(var1) || this.method2396(var1.down()) || this.method2396(var1.up());
   }

   private boolean method2396(BlockPos var1) {
      Block var2 = mc.world.getBlockState(var1).getBlock();
      return var2 == Blocks.SNOW;
   }

   private boolean method2397() {
      return false;
   }

   private double method2398() {
      float var1 = mc.player.input.movementForward;
      float var2 = mc.player.input.movementSideways;
      if (var1 == 0.0F && var2 == 0.0F) {
         return -1.0;
      } else {
         float var3 = mc.player.getYaw();
         if (var1 < 0.0F) {
            var3 += 180.0F;
         }

         float var4 = 1.0F;
         if (var1 < 0.0F) {
            var4 = -0.5F;
         } else if (var1 > 0.0F) {
            var4 = 0.5F;
         }

         if (var2 > 0.0F) {
            var3 -= 90.0F * var4;
         }

         if (var2 < 0.0F) {
            var3 += 90.0F * var4;
         }

         return var3;
      }
   }

   private void method2399(float var1) {
      if (mc != null) {
         RenderTickCounter var2 = mc.getRenderTickCounter();
         if (var2 != null) {
            float var3 = 50.0F / MathHelper.clamp(var1, 0.1F, 10.0F);
            Class var4 = var2.getClass();

            try {
               if (var2 instanceof IRenderTickCounterDynamic var15) {
                  var15.setTickTime(var3);
                  return;
               }
            } catch (Throwable var13) {
            }

            for (Class var5 = var4; var5 != null; var5 = var5.getSuperclass()) {
               for (Method var9 : var5.getDeclaredMethods()) {
                  if (!Modifier.isStatic(var9.getModifiers()) && var9.getParameterCount() == 1) {
                     Class var10 = var9.getParameterTypes()[0];
                     if (var10 == float.class || var10 == Float.class || var10 == double.class || var10 == Double.class) {
                        String var11 = var9.getName().toLowerCase();
                        if (var11.contains("tick") || var11.contains("time") || var11.contains("ms")) {
                           try {
                              var9.setAccessible(true);
                              if (var10 != float.class && var10 != Float.class) {
                                 var9.invoke(var2, (double)var3);
                              } else {
                                 var9.invoke(var2, var3);
                              }

                              return;
                           } catch (Throwable var14) {
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
