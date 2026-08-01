package ru.metaculture.protection;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "FriendManager",
   O0000000000 = Category.Misc,
   O000000000 = "Менеджер по управлению в друзьях"
)
public class FriendManager extends Module {
   public static KeybindSetting O000000000O = new KeybindSetting("Бинд друзей", -1);
   public static BooleanSetting O000000000O0 = new BooleanSetting("Не бить друзей", true);
   public static BooleanSetting O000000000O00 = new BooleanSetting("Убирать хитбокс друга", true);
   private final O0000O00O000 O000000000O000 = new O0000O00O000();

   public FriendManager() {
      this.O00000000(new Setting[]{O000000000O, O000000000O0, O000000000O00});
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (o0000000O0O0.O00000000000() == O000000000O.O0000000000() && o0000000O0O0.O0000000000000() == 1 && this.O000000000O000.O00000000000(200L)) {
         if (AttackAura.O00000000OO0 != null) {
            return;
         }

         HitResult var2 = O0000000000.crosshairTarget;
         if (var2 == null || var2.getType() != Type.ENTITY) {
            return;
         }

         if (!(((EntityHitResult)var2).getEntity() instanceof PlayerEntity var4)) {
            return;
         }

         String var5 = var4.getName().getString();
         String var6 = WildClient.O00000000.O000000000OO();
         if (!FriendCommand.O00000000(var5)) {
            WildClient.O00000000.O000000000O0O0().O00000000(var6 + "friend add " + var5);
            O0000O0O00OOO.O00000000("add", 0.5F);
         } else {
            WildClient.O00000000.O000000000O0O0().O00000000(var6 + "friend remove " + var5);
            O0000O0O00OOO.O00000000("remove", 0.5F);
         }

         this.O000000000O000.O00000000();
      }
   }
}
