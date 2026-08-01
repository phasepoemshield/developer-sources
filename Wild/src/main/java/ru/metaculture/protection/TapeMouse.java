package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.util.hit.HitResult.Type;
import org.lwjgl.glfw.GLFW;
import org.wild.mixin.acceser.MinecraftClientAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "TapeMouse",
   O000000000 = "Кто ваще это юзает ?-?",
   O0000000000 = Category.Misc
)
public class TapeMouse extends Module {
   private final ModeSetting O000000000O = new ModeSetting("Кнопка", "ЛКМ", "ЛКМ", "ПКМ", "Обе");
   private final ModeSetting O000000000O0 = new ModeSetting("Режим ударов", "По кулдауну", "По кулдауну", "По задержке", "CPS");
   private final NumberSetting O000000000O00 = new NumberSetting("Задержка", 1000.0F, 100.0F, 5000.0F, 100.0F, false)
      .O00000000(() -> !this.O000000000O0.O000000000("По задержке"));
   private final NumberSetting O000000000O000 = new NumberSetting("CPS минимум", 8.0F, 1.0F, 20.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000O0.O000000000("CPS"));
   private final NumberSetting O000000000O00O = new NumberSetting("CPS максимум", 12.0F, 1.0F, 20.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000O0.O000000000("CPS"));
   private final BooleanSetting O000000000O0O = new BooleanSetting("Проверка на энтити", false);
   private final BooleanSetting O000000000O0O0 = new BooleanSetting("Только при зажатии", false);
   private final O0000O00O0 O000000000O0OO = new O0000O00O0();
   private final O0000O00O0 O000000000OO = new O0000O00O0();
   private long O000000000OO0;
   private long O000000000OO00;

   public TapeMouse() {
      this.O00000000(
         new Setting[]{
            this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000, this.O000000000O00O, this.O000000000O0O, this.O000000000O0O0
         }
      );
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O0000000000O0O();
   }

   @Override
   public void a_() {
      super.a_();
      this.O0000000000O0O();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.interactionManager != null && O0000000000.currentScreen == null) {
         if (this.O000000000O.O000000000("ЛКМ") || this.O000000000O.O000000000("Обе")) {
            this.O0000000000(true);
         }

         if (this.O000000000O.O000000000("ПКМ") || this.O000000000O.O000000000("Обе")) {
            this.O0000000000(false);
         }
      }
   }

   private void O0000000000(boolean bl) {
      if (!bl || !this.O000000000O0O.O0000000000() || this.O0000000000O0()) {
         if (!this.O000000000O0O0.O0000000000() || this.O00000000(bl ? 0 : 1)) {
            O0000O00O0 var2 = bl ? this.O000000000O0OO : this.O000000000OO;
            if (this.O000000000O0.O000000000("По кулдауну")) {
               if (this.O00000000000(bl)) {
                  this.O000000000000(bl);
               }
            } else if (this.O000000000O0.O000000000("По задержке")) {
               if (var2.O00000000((double)this.O000000000O00.O0000000000())) {
                  this.O000000000000(bl);
                  var2.O00000000();
               }
            } else {
               long var3 = bl ? this.O000000000OO0 : this.O000000000OO00;
               if (var2.O00000000((double)var3)) {
                  this.O000000000000(bl);
                  var2.O00000000();
                  long var5 = this.O0000000000O00();
                  if (bl) {
                     this.O000000000OO0 = var5;
                  } else {
                     this.O000000000OO00 = var5;
                  }
               }
            }
         }
      }
   }

   private boolean O00000000000(boolean bl) {
      return bl ? O0000000000.player.getAttackCooldownProgress(0.0F) >= 1.0F : ((MinecraftClientAccessor)O0000000000).getItemUseCooldown() <= 0;
   }

   private void O000000000000(boolean bl) {
      MinecraftClientAccessor var2 = (MinecraftClientAccessor)O0000000000;
      if (bl) {
         var2.invokeDoAttack();
      } else {
         var2.invokeDoItemUse();
         if (this.O000000000O0.O000000000("По кулдауну")) {
            var2.setItemUseCooldown(4);
         }
      }
   }

   private boolean O0000000000O0() {
      return O0000000000.crosshairTarget != null && O0000000000.crosshairTarget.getType() == Type.ENTITY;
   }

   private boolean O00000000(int i) {
      return O0000000000.getWindow() == null ? false : GLFW.glfwGetMouseButton(O0000000000.getWindow().getHandle(), i) == 1;
   }

   private long O0000000000O00() {
      float var1 = Math.min(this.O000000000O000.O0000000000(), this.O000000000O00O.O0000000000());
      float var2 = Math.max(this.O000000000O000.O0000000000(), this.O000000000O00O.O0000000000());
      double var3 = var1 >= var2 ? var1 : var1 + ThreadLocalRandom.current().nextDouble() * (var2 - var1);
      if (var3 < 0.1) {
         var3 = 0.1;
      }

      return (long)(1000.0 / var3);
   }

   private void O0000000000O0O() {
      this.O000000000O0OO.O00000000();
      this.O000000000OO.O00000000();
      this.O000000000OO0 = this.O0000000000O00();
      this.O000000000OO00 = this.O0000000000O00();
   }
}
