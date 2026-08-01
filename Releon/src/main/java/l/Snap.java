package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class Snap extends Helper353 {
   public Snap() {
      super("Snap");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Aura var5 = Aura.getInstance();
      MinecraftClient var6 = MinecraftClient.getInstance();
      if (var5 != null && var6.player != null) {
         Helper331 var7 = Releon.method71().method33().method3250();
         if (var4 != null && var2 != null && var7 != null && var5.getConfig() != null && var7.method3283(var5.getConfig(), 1)) {
            return this.method3571(var1, var2, var5.getSnapSpeed().method2082() * 1.5F);
         } else {
            Helper336 var8 = new Helper336(var6.player.getYaw(), var6.player.getPitch());
            float var9 = var7 != null && !var7.method3288().method3356(var5.getSnapHold().method2082()) ? 0.0F : var5.getSnapSpeed().method2082() / 1.5F;
            return this.method3571(var1, var8, var9);
         }
      } else {
         return var1;
      }
   }

   @Override
   public Vec3d method3149() {
      return Vec3d.ZERO;
   }

   private Helper336 method3571(Helper336 var1, Helper336 var2, float var3) {
      if (var2 != null && !(var3 <= 0.0F)) {
         Helper336 var4 = Helper349.method3470(var1, var2);
         float var5 = var4.method3333();
         float var6 = var4.method3334();
         float var7 = (float)Math.hypot(Math.abs(var5), Math.abs(var6));
         if (var7 < 1.0E-4F) {
            var7 = 1.0E-4F;
         }

         float var8 = Math.abs(var5 / var7) * var3;
         float var9 = Math.abs(var6 / var7) * var3;
         return new Helper336(var1.method3333() + Math.min(Math.max(var5, -var8), var8), var1.method3334() + Math.min(Math.max(var6, -var9), var9));
      } else {
         return var1;
      }
   }
}
