package ru.metaculture.protection;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.option.Perspective;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "FreeLock",
   O0000000000 = Category.Misc,
   O000000000 = "Вид от третьего лица"
)
public class FreeLock extends Module {
   private final ModeSetting O000000000O = new ModeSetting("Режим", "По удержанию", "По удержанию", "По бинду");
   private final KeybindSetting O000000000O0 = new KeybindSetting("Бинд", -1, true);
   private Perspective O000000000O00;

   public FreeLock() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0});
   }

   public boolean O0000000000O0() {
      return this.O000000000O00 != null;
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (!O0000O00O0000O.O00000000()) {
         if (this.O00000000(O0000000000.currentScreen)) {
            this.O0000000000O0O();
         } else if (o0000000O0O0.O00000000000() == this.O000000000O0.O0000000000()) {
            boolean var2 = KeybindSetting.O000000000(this.O000000000O0.O0000000000());
            if (this.O000000000O.O000000000("По удержанию")) {
               if (var2 && this.O000000000O00 == null) {
                  this.O0000000000O00();
               } else if (!var2 && this.O000000000O00 != null) {
                  this.O0000000000O0O();
               }
            } else if (this.O000000000O.O000000000("По бинду") && var2) {
               if (this.O000000000O00 != null) {
                  this.O0000000000O0O();
               } else {
                  this.O0000000000O00();
               }
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (this.O00000000(O0000000000.currentScreen)) {
         this.O0000000000O0O();
      }
   }

   @Override
   public void O00000000() {
      super.O00000000();
   }

   @Override
   public void O000000000() {
      super.O000000000();
      this.O0000000000O0O();
   }

   private void O0000000000O00() {
      if (!O0000O00O0000O.O00000000() && !this.O00000000(O0000000000.currentScreen)) {
         AttackAura var1 = WildClient.O00000000.O000000000.O00000000(AttackAura.class);
         if (var1 != null && var1.O0000000000000) {
            ChatUtil.O00000000("Отключите ауру для использования фрилука");
         } else if (O0000000000.options != null) {
            this.O000000000O00 = O0000000000.options.getPerspective();
            O0000000000.options.setPerspective(Perspective.THIRD_PERSON_BACK);
            O000000O0O00O.O0000000000 = O0000000000.gameRenderer.getCamera().getYaw();
            O000000O0O00O.O00000000000 = O0000000000.gameRenderer.getCamera().getPitch();
            O000000O0O00O.O000000000 = true;
            O000000O0O00O.O00000000 = true;
         }
      }
   }

   private void O0000000000O0O() {
      if (this.O000000000O00 != null) {
         if (O0000000000.options != null) {
            O0000000000.options.setPerspective(this.O000000000O00);
         }

         this.O000000000O00 = null;
         O000000O0O00O.O000000000 = false;
         O000000O0O00O.O00000000 = false;
      }
   }

   private boolean O00000000(Screen screen) {
      return screen != null;
   }
}
