package l;

import fat.releon.teremok.impl.combat.Aura;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Strafe extends Helper242 {
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   public Setting5 mode = new Setting5("Режим", "Выберите тип стрейфов").method2381("HVH", "Grim").method2383("HVH");
   Setting2 speed = new Setting2("Скорость", "Выберите скорость для стрейфа")
      .method2086(0.42F)
      .method2078(0.0F, 1.0F)
      .method2081(() -> this.mode.method2385("HVH"));
   private float lastYaw;
   private float lastPitch;
   private final Helper336 rot = new Helper336(0.0F, 0.0F);

   public Strafe() {
      super("Strafe", "Strafe", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.mode, this.speed});
   }

   public static Strafe method2413() {
      return Helper222.method1979(Strafe.class);
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (this.mode.method2385("Grim")) {
         if (mc.player == null) {
            return;
         }

         boolean var2 = Helper165.method1351();
         Vec3d var3 = mc.player.getVelocity();
         if (var2) {
            float var4 = Helper165.method1358(mc.player.getYaw());
            Helper336 var5 = new Helper336(var4, mc.player.getPitch());
            if (Aura.getInstance().getTarget() == null) {
               Helper351.INSTANCE.method3502(var5, Helper334.DEFAULT, Helper153.LOW_PRIORITY, this);
            }

            double var6 = 0.01;
            double var8 = Math.cos(Math.toRadians(var4)) * var6;
            var3 = new Vec3d(var3.x, var3.y, var8);
         }

         if (mc.options.jumpKey.isPressed()) {
            float var10 = Helper351.INSTANCE.method3483().method3334();
            float var11 = var10 >= 0.0F ? MathHelper.clamp(var10 / 45.0F, 1.0F, 2.5F) : 0.9F;
            var3 = var3.add(0.0, 0.01 * var11 * 0.08, 0.0);
         } else if (mc.options.sneakKey.isPressed()) {
            var3 = var3.add(0.0, 0.0012, 0.0);
         }

         mc.player.setVelocity(var3);
      }
   }

   @Override
   public void activate() {
      super.activate();
      this.lastYaw = mc.player != null ? mc.player.getYaw() : 0.0F;
      this.lastPitch = mc.player != null ? mc.player.getPitch() : 0.0F;
   }
}
