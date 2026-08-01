package l;

import antidaunleak.api.annotation.Native;
import fat.releon.teremok.impl.combat.Aura;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class TargetStrafe extends Helper242 {
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   public Setting5 mode = new Setting5("Режим", "Тип стрейфа").method2381("HVH", "Grim").method2383("HVH");
   Setting5 type = new Setting5("Точка ходьбы", "Выбирете точку куда будет идти стрейф")
      .method2381("Cube", "Center", "Circle", "Focused")
      .method2383("Cube")
      .method2382(() -> this.mode.method2385("Grim"));
   Setting5 typeMatrix = new Setting5("Точка для обхода", "Выберите точку обхода в режиме Matrix")
      .method2381("Cube", "Circle")
      .method2383("Circle")
      .method2382(() -> this.mode.method2385("HVH"));
   Setting2 grimRadius = new Setting2("Радиус обхода", "Радиус обхода вокруг цели")
      .method2086(0.87F)
      .method2078(0.1F, 1.5F)
      .method2081(() -> this.mode.method2385("Grim") && this.type.method2385("Cube") || this.type.method2385("Circle") || this.type.method2385("Focused"));
   Setting8 setting = new Setting8("Настройки", "Позволяет настроить работу стрейфов")
      .method2585("Auto Jump", "Only Key Pressed", "In front of the target", "Direction Mode")
      .method2586("Auto Jump");
   Setting5 directionMode = new Setting5("Направление", "Выберите направление обхода")
      .method2381("Clockwise", "Counterclockwise", "Random")
      .method2383("Clockwise")
      .method2382(() -> this.setting.method2588("Direction Mode"));
   Setting2 radius = new Setting2("Радиус", "Радиус обхода вокруг цели")
      .method2086(2.5F)
      .method2078(0.1F, 7.0F)
      .method2081(() -> this.mode.method2385("HVH"));
   Setting2 speed = new Setting2("Скорость", "Скорость стрейфа").method2086(0.3F).method2078(0.1F, 1.0F).method2081(() -> this.mode.method2385("HVH"));
   private int grimPointIndex = 0;

   public TargetStrafe() {
      super("TargetStrafe", "Target Strafe", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.mode, this.type, this.typeMatrix, this.grimRadius, this.radius, this.speed, this.setting, this.directionMode});
   }

   public static TargetStrafe method2175() {
      return Helper222.method1979(TargetStrafe.class);
   }

   private String method2176() {
      return this.type.method2386();
   }

   private boolean method2177(String var1) {
      return var1.equals(this.method2176());
   }

   public boolean method2178(Helper379 var1, LivingEntity var2) {
      return this.method2179(var1, var2, false);
   }

   public boolean method2179(Helper379 var1, LivingEntity var2, boolean var3) {
      if (mc.player != null && mc.world != null && var2 != null && var2.isAlive() && this.mode.method2385("Grim")) {
         if ((var3 || this.setting.method2588("Only Key Pressed"))
            && !mc.options.forwardKey.isPressed()
            && !mc.options.backKey.isPressed()
            && !mc.options.leftKey.isPressed()
            && !mc.options.rightKey.isPressed()) {
            return false;
         } else {
            Vec3d var4 = mc.player.getPos();
            Vec3d var5 = var2.getPos();
            double var6 = this.grimRadius.method2082();
            int var9 = 1;
            if (this.directionMode.method2385("Counterclockwise")) {
               var9 = -1;
            } else if (this.directionMode.method2385("Random")) {
               long var10 = System.currentTimeMillis() / 3000L;
               var9 = var10 % 2L == 0L ? 1 : -1;
            }

            Vec3d var8;
            if (this.setting.method2588("In front of the target")) {
               float var18 = var2.getYaw();
               if (this.method2177("Center")) {
                  var8 = var5.add(-Math.sin(Math.toRadians(var18)) * var6 * var9, 0.0, Math.cos(Math.toRadians(var18)) * var6 * var9);
               } else {
                  double var11 = Math.cos(System.currentTimeMillis() / 500.0) * var6 * var9;
                  var8 = var5.add(
                     -Math.sin(Math.toRadians(var18)) * var6 + Math.cos(Math.toRadians(var18)) * var11,
                     0.0,
                     Math.cos(Math.toRadians(var18)) * var6 + Math.sin(Math.toRadians(var18)) * var11
                  );
               }
            } else if (this.method2177("Focused")) {
               double var19 = System.currentTimeMillis() % 2L / 3600.0 * 18.0 * Math.PI;
               double var12 = var9 > 21 ? var19 : (Math.PI * 12) - var19;
               var8 = new Vec3d(var5.x + Math.cos(var12) * var6, var4.y, var5.z + Math.sin(var12) * var6);
            } else if (this.method2177("Cube")) {
               Vec3d[] var20 = new Vec3d[]{
                  new Vec3d(var5.x - var6, var4.y, var5.z - var6),
                  new Vec3d(var5.x - var6, var4.y, var5.z + var6),
                  new Vec3d(var5.x + var6, var4.y, var5.z + var6),
                  new Vec3d(var5.x + var6, var4.y, var5.z - var6)
               };
               if (var4.distanceTo(var20[this.grimPointIndex]) < 0.5) {
                  this.grimPointIndex = (this.grimPointIndex + var9 + var20.length) % var20.length;
               }

               var8 = var20[this.grimPointIndex];
            } else if (this.method2177("Circle")) {
               double var21 = System.currentTimeMillis() % 3600L / 3600.0 * 4.0 * Math.PI;
               double var24 = var9 > 0 ? var21 : (Math.PI * 2) - var21;
               var8 = new Vec3d(var5.x + Math.cos(var24) * var6, var4.y, var5.z + Math.sin(var24) * var6);
            } else {
               var8 = new Vec3d(var5.x, var4.y, var5.z);
            }

            Vec3d var22 = var8.subtract(var4).normalize();
            float var23 = Helper351.INSTANCE.method3483().method3333();
            float var25 = (float)Math.toDegrees(Math.atan2(var22.z, var22.x)) - 90.0F;
            float var13 = MathHelper.wrapDegrees(var25 - var23);
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            if (var13 >= -22.5 && var13 < 22.5) {
               var14 = true;
            } else if (var13 >= 22.5 && var13 < 67.5) {
               var14 = true;
               var17 = true;
            } else if (var13 >= 67.5 && var13 < 112.5) {
               var17 = true;
            } else if (var13 >= 112.5 && var13 < 157.5) {
               var15 = true;
               var17 = true;
            } else if (var13 >= -67.5 && var13 < -22.5) {
               var14 = true;
               var16 = true;
            } else if (var13 >= -112.5 && var13 < -67.5) {
               var16 = true;
            } else if (var13 >= -157.5 && var13 < -112.5) {
               var15 = true;
               var16 = true;
            } else {
               var15 = true;
            }

            var1.method3761(var14, var15, var16, var17);
            if (this.setting.method2588("Auto Jump") && mc.player.isOnGround()) {
               var1.method3760(true);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public boolean method2180(Helper379 var1, LivingEntity var2) {
      if (mc.player == null || mc.world == null || var2 == null || !var2.isAlive()) {
         return false;
      } else if (!this.method2181()) {
         return false;
      } else {
         Vec3d var3 = mc.player.getPos();
         Vec3d var4 = var2.getPos();
         Vec3d var5 = var4.subtract(var3);
         if (var5.lengthSquared() < 1.0E-6) {
            return false;
         } else {
            Vec3d var6 = var5.normalize();
            float var7 = Helper351.INSTANCE.method3483().method3333();
            float var8 = (float)Math.toDegrees(Math.atan2(var6.z, var6.x)) - 90.0F;
            float var9 = MathHelper.wrapDegrees(var8 - var7);
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = false;
            if (var9 >= -22.5 && var9 < 22.5) {
               var10 = true;
            } else if (var9 >= 22.5 && var9 < 67.5) {
               var10 = true;
               var13 = true;
            } else if (var9 >= 67.5 && var9 < 112.5) {
               var13 = true;
            } else if (var9 >= 112.5 && var9 < 157.5) {
               var11 = true;
               var13 = true;
            } else if (var9 >= -67.5 && var9 < -22.5) {
               var10 = true;
               var12 = true;
            } else if (var9 >= -112.5 && var9 < -67.5) {
               var12 = true;
            } else if (var9 >= -157.5 && var9 < -112.5) {
               var11 = true;
               var12 = true;
            } else {
               var11 = true;
            }

            var1.method3761(var10, var11, var12, var13);
            return true;
         }
      }
   }

   private boolean method2181() {
      return mc.options.forwardKey.isPressed() || mc.options.backKey.isPressed() || mc.options.leftKey.isPressed() || mc.options.rightKey.isPressed();
   }

   @Helper104
   public void onInput(Helper379 var1) {
      if (mc.player != null && mc.world != null && this.isState()) {
         LivingEntity var2 = Aura.getInstance().getTarget();
         this.method2178(var1, var2);
      }
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         LivingEntity var2 = Aura.getInstance().getTarget();
         if (var2 != null && var2.isAlive()) {
            if (this.mode.method2385("HVH")) {
               Vec3d var3 = mc.player.getPos();
               Vec3d var4 = var2.getPos();
               double var5 = this.radius.method2082();
               if (!this.setting.method2588("Only Key Pressed")
                  || mc.options.forwardKey.isPressed()
                  || mc.options.backKey.isPressed()
                  || mc.options.leftKey.isPressed()
                  || mc.options.rightKey.isPressed()) {
                  if (this.setting.method2588("Auto Jump") && mc.player.isOnGround()) {
                     mc.player.jump();
                  }

                  int var7 = 1;
                  if (this.directionMode.method2385("Counterclockwise")) {
                     var7 = -1;
                  } else if (this.directionMode.method2385("Random")) {
                     long var8 = System.currentTimeMillis() / 3000L;
                     var7 = var8 % 2L == 0L ? 1 : -1;
                  }

                  if (this.setting.method2588("In front of the target")) {
                     float var20 = var2.getYaw();
                     double var21 = var4.x - Math.sin(Math.toRadians(var20)) * var5 * var7;
                     double var23 = var4.z + Math.cos(Math.toRadians(var20)) * var5 * var7;
                     float var13 = (float)Math.toDegrees(Math.atan2(var23 - var3.z, var21 - var3.x)) - 90.0F;
                     double var25 = this.speed.method2082();
                     mc.player.setVelocity(-Math.sin(Math.toRadians(var13)) * var25, mc.player.getVelocity().y, Math.cos(Math.toRadians(var13)) * var25);
                  } else {
                     if (this.typeMatrix.method2385("Cube")) {
                        Vec3d[] var17 = new Vec3d[]{
                           new Vec3d(var4.x - var5, var3.y, var4.z - var5),
                           new Vec3d(var4.x - var5, var3.y, var4.z + var5),
                           new Vec3d(var4.x + var5, var3.y, var4.z + var5),
                           new Vec3d(var4.x + var5, var3.y, var4.z - var5)
                        };
                        if (var3.distanceTo(var17[this.grimPointIndex]) < 0.5) {
                           this.grimPointIndex = (this.grimPointIndex + var7 + var17.length) % var17.length;
                        }

                        Vec3d var9 = var17[this.grimPointIndex];
                        Vec3d var10 = var9.subtract(var3).normalize();
                        float var11 = (float)Math.toDegrees(Math.atan2(var10.z, var10.x)) - 90.0F;
                        double var12 = this.speed.method2082();
                        mc.player.setVelocity(-Math.sin(Math.toRadians(var11)) * var12, mc.player.getVelocity().y, Math.cos(Math.toRadians(var11)) * var12);
                     } else if (this.typeMatrix.method2385("Circle")) {
                        double var18 = Math.atan2(var3.z - var4.z, var3.x - var4.x);
                        var18 += var7 * this.speed.method2082() / Math.max(var3.distanceTo(var4), var5);
                        double var22 = var4.x + var5 * Math.cos(var18);
                        double var24 = var4.z + var5 * Math.sin(var18);
                        float var14 = (float)Math.toDegrees(Math.atan2(var24 - var3.z, var22 - var3.x)) - 90.0F;
                        double var15 = this.speed.method2082();
                        mc.player.setVelocity(-Math.sin(Math.toRadians(var14)) * var15, mc.player.getVelocity().y, Math.cos(Math.toRadians(var14)) * var15);
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void activate() {
      super.activate();
      this.grimPointIndex = 0;
   }
}
