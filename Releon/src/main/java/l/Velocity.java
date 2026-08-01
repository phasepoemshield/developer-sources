package l;

import java.lang.reflect.Field;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.network.packet.s2c.common.CommonPingS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class Velocity extends Helper242 {
   private final Setting5 mode = new Setting5("Режим", "Выберите режим уменьшения отдачи")
      .method2381("NewGrim", "OldGrim", "Matrix", "Normal")
      .method2383("NewGrim");
   private final Random random = new Random();
   private final Entity entity;
   private boolean flag;
   private int grimTicks;
   private int ccCooldown;
   private final float grimTicks1 = -1.0F;

   public static Velocity method3779() {
      return Helper222.method1979(Velocity.class);
   }

   public Velocity() {
      this(null);
   }

   public Velocity(Entity var1) {
      super("Velocity", Helper269.COMBAT);
      this.entity = var1;
      this.setup(new Helper264[]{this.mode});
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (this.state) {
         if (var1.method3896() == Helper385.RECEIVE) {
            if (mc.player != null && !mc.player.isTouchingWater() && !mc.player.isSubmergedInWater() && !mc.player.isInLava()) {
               if (this.ccCooldown > 0) {
                  this.ccCooldown--;
               } else {
                  if (var1.method3895() instanceof EntityVelocityUpdateS2CPacket var2 && var2.getEntityId() == mc.player.getId()) {
                     String var8 = this.mode.method2386();
                     switch (var8) {
                        case "Matrix":
                           if (!this.flag) {
                              var1.method1613(true);
                              this.flag = true;
                           } else {
                              this.flag = false;
                              this.method3780(var2, (int)(var2.getVelocityX() * -0.1));
                              this.method3781(var2, (int)(var2.getVelocityZ() * -0.1));
                           }
                           break;
                        case "Normal":
                           var1.method1613(true);
                           break;
                        case "OldGrim":
                           if (var1.method3895() instanceof EntityVelocityUpdateS2CPacket var5) {
                              var1.method1613(false);
                              this.grimTicks = this.random.nextInt();
                              this.method3780(var5, 0);
                              mc.player.setVelocity(0.0, 0.0, 0.0);
                           }
                        case "NewGrim":
                           var1.method1613(true);
                           this.flag = false;
                           var1.method582();
                           this.flag = true;
                     }
                  }

                  if (this.mode.method2385("OldGrim") && var1.method3895() instanceof CommonPingS2CPacket && this.grimTicks > 1) {
                     var1.method1613(true);
                     float var7 = -1.0F;
                  }

                  if (var1.method3895() instanceof PlayerPositionLookS2CPacket && this.mode.method2385("NewGrim")) {
                     this.ccCooldown = 5;
                  }
               }
            }
         }
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (this.state && mc.player != null && !mc.player.isTouchingWater() && !mc.player.isSubmergedInWater()) {
         if (this.mode.method2385("Matrix") && mc.player.hurtTime > 0 && !mc.player.isOnGround()) {
            double var2 = mc.player.getYaw() * (float) (Math.PI / 180.0);
            double var4 = Math.sqrt(mc.player.getVelocity().x * mc.player.getVelocity().x + mc.player.getVelocity().z * mc.player.getVelocity().z);
            mc.player.setVelocity(-Math.sin(var2) * var4, mc.player.getVelocity().y, Math.cos(var2) * var4);
            mc.player.setSprinting(mc.player.age % 2 != 0);
         }

         if (this.mode.method2385("NewGrim") && this.flag) {
            if (this.ccCooldown <= 0) {
               mc.player
                  .networkHandler
                  .sendPacket(
                     new Full(mc.player.getX(), mc.player.getY(), mc.player.getZ(), mc.player.getYaw(), mc.player.getPitch(), mc.player.isOnGround(), false)
                  );
               mc.player
                  .networkHandler
                  .sendPacket(new PlayerActionC2SPacket(Action.STOP_DESTROY_BLOCK, BlockPos.ofFloored(mc.player.getPos()), Direction.DOWN));
               mc.player.addVelocity(0.01F, 0.01, 0.01F);
            }

            this.flag = false;
         }

         if (this.grimTicks > 0) {
            this.grimTicks--;
         }
      }
   }

   @Override
   public void activate() {
      super.activate();
      this.grimTicks = 0;
      this.flag = false;
      this.ccCooldown = 0;
   }

   private void method3780(EntityVelocityUpdateS2CPacket var1, int var2) {
      try {
         Field var3 = EntityVelocityUpdateS2CPacket.class.getDeclaredField("velocityX");
         var3.setAccessible(true);
         var3.setInt(var1, var2);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   private void method3781(EntityVelocityUpdateS2CPacket var1, int var2) {
      try {
         Field var3 = EntityVelocityUpdateS2CPacket.class.getDeclaredField("velocityZ");
         var3.setAccessible(true);
         var3.setInt(var1, var2);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public void method3782(boolean var1) {
      this.flag = var1;
   }

   public void method3783(int var1) {
      this.grimTicks = var1;
   }

   public void method3784(int var1) {
      this.ccCooldown = var1;
   }

   public Setting5 method3785() {
      return this.mode;
   }

   public Random method3786() {
      return this.random;
   }

   public Entity method3787() {
      return this.entity;
   }

   public boolean method3788() {
      return this.flag;
   }

   public int method3789() {
      return this.grimTicks;
   }

   public int method3790() {
      return this.ccCooldown;
   }

   public float method3791() {
      return -1.0F;
   }
}
