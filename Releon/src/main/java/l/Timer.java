package l;

import fat.releon.mixins.client.IRenderTickCounterDynamic;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.util.InputUtil;
import net.minecraft.network.packet.s2c.common.CommonPingS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.glfw.GLFW;

public class Timer extends Helper242 {
   private final Setting5 mode = new Setting5("Mode", "Режим таймера").method2381("Normal", "Matrix", "Shift", "Grim").method2383("Normal");
   private final Setting3 old = new Setting3("Old", "Старый расход (Matrix)").method2201(false).method2199(() -> this.mode.method2385("Matrix"));
   public final Setting2 speed = new Setting2("Speed", "Скорость таймера")
      .method2086(2.0F)
      .method2078(0.1F, 10.0F)
      .method2081(() -> !this.mode.method2385("Shift"));
   private final Setting2 shiftTicks = new Setting2("ShiftTicks", "Сила шифта")
      .method2086(10.0F)
      .method2079(1, 40)
      .method2081(() -> this.mode.method2385("Shift"));
   private final Setting9 boostKey = new Setting9("BoostKey", "Кнопка буста").method2705(() -> this.mode.method2385("Grim"));
   private final Setting5 onFlag = new Setting5("OnFlag", "Действие на флаг").method2381("Reset", "Disable", "None").method2383("Reset");
   public static float energy;
   public static float yaw;
   public static float pitch;
   private static double prevPosX;
   private static double prevPosY;
   private static double prevPosZ;
   private long cancelTime;
   private long lastFlagTime;
   private boolean shiftApplied;
   private Method tickTimeSetterMethod;
   private Field tickTimeField;
   private boolean timerAccessorResolved;
   private boolean warnedAboutTimerAccess;

   public Timer() {
      super("Timer", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.mode, this.old, this.speed, this.shiftTicks, this.boostKey, this.onFlag});
   }

   @Override
   public void activate() {
      this.method2597(1.0F);
      if (!this.mode.method2385("Matrix")) {
         energy = 0.0F;
      }

      if (this.mode.method2385("Grim")) {
         this.cancelTime = System.currentTimeMillis();
      }

      this.shiftApplied = false;
   }

   @Override
   public void deactivate() {
      this.method2597(1.0F);
      this.shiftApplied = false;
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         String var2 = this.mode.method2386();
         switch (var2) {
            case "Normal":
               this.method2597(5.0F);
               break;
            case "Matrix":
               if (!this.method2595()) {
                  this.method2597(1.0F);
               } else {
                  this.method2597(Math.max(this.speed.method2082(), 1.0F));
                  if (energy > 0.0F) {
                     energy = MathHelper.clamp(energy - (0.1F * this.speed.method2082() - 0.1F), 0.0F, 1.0F);
                  } else {
                     Helper238.method2186("Заряд таймера кончился! Отключаю...");
                     this.setState(false);
                  }
               }
               break;
            case "Grim":
               boolean var4 = energy > 0.0F && this.method2596(this.boostKey) && System.currentTimeMillis() - this.lastFlagTime > 2000L;
               if (!var4) {
                  this.method2597(1.0F);
               } else {
                  this.method2597(Math.max(this.speed.method2082(), 1.0F));
                  energy = MathHelper.clamp(energy - (0.0025F * this.speed.method2082() - 0.0025F), 0.0F, 1.0F);
               }
               break;
            case "Shift":
               if (!this.shiftApplied) {
                  if (energy < 0.9F) {
                     Helper238.method2186("Перед повторным использованием необходимо постоять на месте!");
                     this.setState(false);
                  } else {
                     this.method2597(MathHelper.clamp(this.shiftTicks.method2082(), 1.0F, 10.0F));
                     energy = 0.0F;
                     this.shiftApplied = true;
                  }
               } else {
                  this.setState(false);
               }
               break;
            default:
               this.method2597(1.0F);
         }

         this.method2593();
      } else {
         this.method2597(1.0F);
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (this.state && var1.method3896() == Helper385.RECEIVE && mc.player != null) {
         if (this.mode.method2385("Grim") && var1.method3895() instanceof CommonPingS2CPacket && System.currentTimeMillis() - this.lastFlagTime > 2000L) {
            if (System.currentTimeMillis() - this.cancelTime > 25000L) {
               this.cancelTime = System.currentTimeMillis();
               energy = 0.0F;
               return;
            }

            if (!this.method2595()) {
               energy = MathHelper.clamp(energy + 0.005F, 0.0F, 1.0F);
            }

            var1.method582();
         }

         if (var1.method3895() instanceof PlayerPositionLookS2CPacket) {
            this.lastFlagTime = System.currentTimeMillis();
            String var2 = this.onFlag.method2386();
            switch (var2) {
               case "Reset":
                  this.method2597(1.0F);
                  energy = 0.0F;
                  break;
               case "Disable":
                  energy = 0.0F;
                  Helper238.method2186("Отключён, так как тебя флагнуло!");
                  this.setState(false);
            }
         }

         if (var1.method3895() instanceof EntityVelocityUpdateS2CPacket var4 && var4.getEntityId() == mc.player.getId() && this.mode.method2385("Grim")) {
            this.method2597(1.0F);
            energy = 0.0F;
         }
      }
   }

   public void method2593() {
      if (this.mode.method2385("Matrix")) {
         float var1 = this.old.method2200() ? 0.005F : 0.0F;
         energy = MathHelper.clamp(this.method2594() ? energy + 0.025F : energy - var1, 0.0F, 1.0F);
      }

      prevPosX = mc.player.getX();
      prevPosY = mc.player.getY();
      prevPosZ = mc.player.getZ();
      yaw = mc.player.getYaw();
      pitch = mc.player.getPitch();
   }

   private boolean method2594() {
      return prevPosX == mc.player.getX()
         && prevPosY == mc.player.getY()
         && prevPosZ == mc.player.getZ()
         && yaw == mc.player.getYaw()
         && pitch == mc.player.getPitch();
   }

   private boolean method2595() {
      return Helper165.method1351();
   }

   private boolean method2596(Setting9 var1) {
      if (var1 != null && var1.getKey() != -1) {
         long var2 = mc.getWindow().getHandle();
         int var4 = var1.getKey();
         return var4 >= 0 && var4 <= 7 ? GLFW.glfwGetMouseButton(var2, var4) == 1 : InputUtil.isKeyPressed(var2, var4);
      } else {
         return false;
      }
   }

   private void method2597(float var1) {
      if (mc != null) {
         RenderTickCounter var2 = mc.getRenderTickCounter();
         if (var2 != null) {
            if (!this.timerAccessorResolved) {
               this.method2598(var2);
               this.timerAccessorResolved = true;
            }

            float var3 = 50.0F / MathHelper.clamp(var1, 0.1F, 10.0F);

            try {
               if (var2 instanceof IRenderTickCounterDynamic var6) {
                  var6.setTickTime(var3);
                  return;
               }

               if (this.tickTimeSetterMethod != null) {
                  Class var4 = this.tickTimeSetterMethod.getParameterTypes()[0];
                  if (var4 == float.class || var4 == Float.class) {
                     this.tickTimeSetterMethod.invoke(var2, var3);
                  } else if (var4 == double.class || var4 == Double.class) {
                     this.tickTimeSetterMethod.invoke(var2, (double)var3);
                  }

                  return;
               }

               if (this.tickTimeField != null) {
                  if (this.tickTimeField.getType() == float.class || this.tickTimeField.getType() == Float.class) {
                     this.tickTimeField.setFloat(var2, var3);
                  } else if (this.tickTimeField.getType() == double.class || this.tickTimeField.getType() == Double.class) {
                     this.tickTimeField.setDouble(var2, var3);
                  }

                  return;
               }
            } catch (Throwable var5) {
               this.tickTimeSetterMethod = null;
            }

            if (!this.warnedAboutTimerAccess) {
               this.warnedAboutTimerAccess = true;
               Helper238.method2186("Timer: не удалось получить доступ к RenderTickCounter.");
            }
         }
      }
   }

   private void method2598(Object var1) {
      Class var2 = var1.getClass();

      for (Class var3 = var2; var3 != null; var3 = var3.getSuperclass()) {
         for (Method var7 : var3.getDeclaredMethods()) {
            if (!Modifier.isStatic(var7.getModifiers()) && var7.getParameterCount() == 1) {
               Class var8 = var7.getParameterTypes()[0];
               if (var8 == float.class || var8 == Float.class || var8 == double.class || var8 == Double.class) {
                  String var9 = var7.getName().toLowerCase();
                  if ((var9.contains("tick") || var9.contains("time") || var9.contains("ms")) && !var9.equals("setticktime")) {
                     try {
                        var7.setAccessible(true);
                        this.tickTimeSetterMethod = var7;
                        return;
                     } catch (Throwable var13) {
                     }
                  }
               }
            }
         }
      }

      Field var14 = null;
      float var15 = Float.MAX_VALUE;

      for (Class var16 = var2; var16 != null; var16 = var16.getSuperclass()) {
         for (Field var20 : var16.getDeclaredFields()) {
            if (!Modifier.isStatic(var20.getModifiers())
               && !Modifier.isFinal(var20.getModifiers())
               && (var20.getType() == float.class || var20.getType() == Float.class || var20.getType() == double.class || var20.getType() == Double.class)) {
               try {
                  var20.setAccessible(true);
                  float var10 = var20.getType() != double.class && var20.getType() != Double.class ? var20.getFloat(var1) : (float)var20.getDouble(var1);
                  if (!(var10 <= 1.0F) && !(var10 >= 1000.0F)) {
                     float var11 = Math.abs(var10 - 50.0F);
                     if (var11 < var15) {
                        var15 = var11;
                        var14 = var20;
                     }
                  }
               } catch (Throwable var12) {
               }
            }
         }
      }

      this.tickTimeField = var14;
   }
}
