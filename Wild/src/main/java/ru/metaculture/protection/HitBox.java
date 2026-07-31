package ru.metaculture.protection;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "HitBox",
   O000000000 = "Увеличивает хитбокс таргета",
   O0000000000 = Category.Combat,
   O00000000000 = {O0000000OO0OOO.RISKY}
)
public class HitBox extends Module {
   public static ModeSetting O000000000O = new ModeSetting("Режим", "Обычный", "Легит", "Обычный");
   public static NumberSetting O000000000O0 = new NumberSetting("Размер", 0.2F, 0.0F, 5.0F, 0.1F, false);
   public static BooleanSetting O000000000O00 = new BooleanSetting("Игнор друзей", true);
   public static ModeSetting O000000000O000 = new ModeSetting("Режим снапа", "Fast", "Fast", "Smooth", "Random")
      .O00000000(() -> !O000000000O.O000000000("Легит"));
   public static LivingEntity O000000000O00O = null;
   public static int O000000000O0O = 0;

   public HitBox() {
      this.O00000000(new Setting[]{O000000000O, O000000000O0, O000000000O00, O000000000O000});
   }

   public static void O00000000(LivingEntity livingEntity) {
      O000000000O00O = livingEntity;
      O000000000O0O = 0;
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (!O000000000O.O000000000("Легит")) {
            O000000000O00O = null;
         } else {
            if (O000000000O00O != null) {
               if (!O000000000O00O.isAlive() || O0000000000.player.distanceTo(O000000000O00O) > 3.0F) {
                  O000000000O00O = null;
                  return;
               }

               O000000O0OO0OO.O00000000(O000000000O00O, true, O000000000O000.O0000000000());
               O000000000O0O++;
               if (O000000000O0O >= 2 && O000000O00OOOO.O00000000(O000000000O00O, 3.0, false)) {
                  O0000000000.interactionManager.attackEntity(O0000000000.player, O000000000O00O);
                  O0000000000.player.swingHand(Hand.MAIN_HAND);
                  O000000000O00O = null;
                  O000000000O0O = 0;
               } else if (O000000000O0O >= 6) {
                  O000000000O00O = null;
                  O000000000O0O = 0;
               }
            }
         }
      }
   }

   public LivingEntity O0000000000O0() {
      LivingEntity var1 = null;
      double var2 = Double.MAX_VALUE;
      Vec3d var4 = O0000000000.player.getEyePos();
      Vec3d var5 = O0000000000.player.getRotationVec(1.0F).normalize();

      for (Entity var7 : O0000000000.world.getEntities()) {
         if (var7 instanceof LivingEntity var8
            && var8 != O0000000000.player
            && var8.isAlive()
            && (!(O000000000O00.O0000000000() && var8 instanceof PlayerEntity var9) || !FriendCommand.O00000000(var9.getName().getString()))
            && !(O0000000000.player.distanceTo(var8) > 3.0F)) {
            Vec3d var17 = var8.getPos().add(0.0, var8.getHeight() / 2.0, 0.0);
            Vec3d var10 = var17.subtract(var4).normalize();
            double var11 = MathHelper.clamp(var5.dotProduct(var10), -1.0, 1.0);
            double var13 = Math.toDegrees(Math.acos(var11));
            double var15 = O000000000O0.O0000000000() * 30.0;
            if (var13 <= var15 && var13 < var2) {
               var2 = var13;
               var1 = var8;
            }
         }
      }

      return var1;
   }
}
