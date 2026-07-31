package l;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Helper426 {
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   private static float lastSwingProgress = 0.0F;
   private static final String PATTERN_NAME = "default";

   public Helper426() {
   }

   public static void method4378() {
      Helper383.method3878("default");
      lastSwingProgress = 0.0F;
      System.out.println("[NeuroRecorder] Запись начата (паттерн: default)");
   }

   public static void method4379() {
      Helper383.method3879();
      System.out.println("[NeuroRecorder] Запись остановлена");
   }

   public static boolean method4380() {
      return Helper383.method3884();
   }

   public static void method4381() {
      if (Helper383.method3884() && Helper3.fakePlayer != null && !Helper3.fakePlayer.isRemoved()) {
         float var0 = mc.player.handSwingProgress;
         if (var0 > 0.05F && lastSwingProgress <= 0.05F && mc.crosshairTarget != null && mc.crosshairTarget.getType() == Type.ENTITY) {
            EntityHitResult var1 = (EntityHitResult)mc.crosshairTarget;
            if (var1.getEntity() == Helper3.fakePlayer) {
               Vec3d var2 = mc.player.getEyePos();
               Vec3d var3 = Helper3.fakePlayer.getBoundingBox().getCenter();
               Vec3d var4 = var3.subtract(var2);
               float var5 = Helper349.method3469(var4).method3333();
               float var6 = Helper349.method3469(var4).method3334();
               float var7 = mc.player.getYaw();
               float var8 = mc.player.getPitch();
               float var9 = MathHelper.wrapDegrees(var7 - var5);
               float var10 = var8 - var6;
               Helper383.method3880(var9, var10);
               System.out.println("[NeuroRecorder] Записан успешный хит: yaw=" + var9 + ", pitch=" + var10);
            }
         }

         lastSwingProgress = var0;
      }
   }
}
