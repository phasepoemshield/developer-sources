package ru.metaculture.protection;

import java.util.HashSet;
import java.util.Set;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.PlayerInput;

public class O0000O00O00O implements MinecraftAccessor {
   private static final O0000O00O00O O000000000 = new O0000O00O00O();
   public final Set<String> O00000000 = new HashSet<>();

   private O0000O00O00O() {
   }

   public static O0000O00O00O O00000000() {
      return O000000000;
   }

   public void O00000000(String string) {
      if (a_.player != null && a_.player.isAlive() && a_.world != null) {
         AttackAura.O00000000OO00 = true;
         this.O00000000.add(string);
         this.O00000000(false);
         if (a_.player.isSprinting()) {
            a_.player.setSprinting(false);
         }

         if (a_.player.input != null) {
            a_.player.input.playerInput = PlayerInput.DEFAULT;
         }
      }
   }

   public void O000000000(String string) {
      if (a_.player != null && a_.player.isAlive() && a_.world != null) {
         this.O00000000.remove(string);
         if (this.O00000000.isEmpty() && a_.currentScreen == null) {
            this.O00000000(true);
            AttackAura.O00000000OO00 = false;
         }
      }
   }

   private void O00000000(boolean bl) {
      if (a_.options != null && a_.getWindow() != null) {
         KeyBinding[] var2 = new KeyBinding[]{
            a_.options.forwardKey, a_.options.backKey, a_.options.leftKey, a_.options.rightKey, a_.options.jumpKey, a_.options.sprintKey
         };
         long var3 = a_.getWindow().getHandle();

         for (KeyBinding var8 : var2) {
            boolean var9 = bl && InputUtil.isKeyPressed(var3, var8.getDefaultKey().getCode());
            var8.setPressed(var9);
         }
      }
   }
}
