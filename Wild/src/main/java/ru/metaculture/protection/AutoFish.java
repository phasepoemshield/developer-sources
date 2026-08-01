package ru.metaculture.protection;

import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoFish",
   O000000000 = "Ловит за вас карасей",
   O0000000000 = Category.Player
)
public class AutoFish extends Module {
   public static O0000O00O0000 O000000000O = new O0000O00O0000();
   public static boolean O000000000O0 = false;
   public static boolean O000000000O00 = false;

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         if (O000000000O.O0000000000(600.0) && O000000000O0) {
            O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            O000000000O0 = false;
            O000000000O00 = true;
            O000000000O.O00000000();
         }

         if (O000000000O.O0000000000(300.0) && O000000000O00) {
            O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            O000000000O00 = false;
            O000000000O.O00000000();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO.O00000000000() instanceof PlaySoundS2CPacket var2) {
         if (var2.getSound().value() == SoundEvents.ENTITY_FISHING_BOBBER_SPLASH) {
            FishingBobberEntity var12 = O0000000000.player.fishHook;
            if (var12 != null) {
               double var4 = var2.getX() - var12.getX();
               double var6 = var2.getY() - var12.getY();
               double var8 = var2.getZ() - var12.getZ();
               double var10 = Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
               if (var10 <= 0.5) {
                  O000000000O0 = true;
                  O000000000O.O00000000();
               }
            }
         }
      }
   }
}
