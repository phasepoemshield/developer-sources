package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Hands",
   O000000000 = "Свечение и настройка предметов в руках",
   O0000000000 = Category.Visuals
)
public final class Hands extends Module {
   public final GroupSetting O000000000O = new GroupSetting("Руки", new BooleanSetting("Правая", true), new BooleanSetting("Левая", true));
   public final ModeSetting O000000000O0 = new ModeSetting("Эффект", "Свечение + контур", "Свечение + контур", "Свечение", "Контур");
   public final NumberSetting O000000000O00 = new NumberSetting("Радиус", 8.0F, 2.0F, 24.0F, 1.0F, false).O00000000(this::O0000000000O0O);
   public final NumberSetting O000000000O000 = new NumberSetting("Сила свечения", 1.8F, 0.25F, 5.0F, 0.05F, false).O00000000(this::O0000000000O0O);
   public final NumberSetting O000000000O00O = new NumberSetting("Толщина контура", 1.5F, 0.5F, 6.0F, 0.5F, false).O00000000(this::O0000000000O00);
   public final NumberSetting O000000000O0O = new NumberSetting("Прозрачность", 0.9F, 0.05F, 1.0F, 0.01F, true);
   public final ModeSetting O000000000O0O0 = new ModeSetting("Источник цвета", "Предмет", "Предмет", "Тема", "Свой");
   public final ModeSetting O000000000O0OO = new ModeSetting("Отображение цвета", "Градиент", "Градиент", "Статичный");
   public final ColorSetting O000000000OO = new ColorSetting("Основной цвет", 55.0F, 0.72F, 1.0F).O000000000(() -> !this.O000000000O0O0.O000000000("Свой"));
   public final ColorSetting O000000000OO0 = new ColorSetting("Второй цвет", 76.0F, 0.78F, 1.0F)
      .O000000000(() -> !this.O000000000O0O0.O000000000("Свой") || this.O000000000O0OO.O000000000("Статичный"));
   private O0000O0O000O0O O000000000OO00;
   private static final Hand[] O000000000OO0O = Hand.values();
   private final float[] O000000000OOO = new float[3];
   private final float[] O000000000OOO0 = new float[3];

   public Hands() {
      this.O00000000(
         new Setting[]{
            this.O000000000O,
            this.O000000000O0,
            this.O000000000O00,
            this.O000000000O000,
            this.O000000000O00O,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO,
            this.O000000000OO0
         }
      );
   }

   @Override
   public void O000000000() {
      this.O0000000000OOO();
      super.O000000000();
   }

   public boolean O00000000(Hand hand) {
      if (this.O0000000000000 && hand != null && O0000000000.player != null && !this.O0000000000OO0() && this.O0000000000OO()) {
         Arm var2 = hand == Hand.MAIN_HAND ? O0000000000.player.getMainArm() : O00000000(O0000000000.player.getMainArm());
         return this.O000000000O.O000000000(var2 == Arm.RIGHT ? "Правая" : "Левая");
      } else {
         return false;
      }
   }

   @EventHandler(
      O00000000 = 0
   )
   public void O00000000(O0000000O00O o0000000O00O) {
      if (!O0000O00OO00O.O00000000() && o0000000O00O != null && o0000000O00O.O00000000000() != null) {
         o0000000O00O.O00000000000().O0000000000();
         this.O00000000(o0000000O00O.O0000000000000(), o0000000O00O.O000000000000O());
         o0000000O00O.O00000000000().O0000000000();
      }
   }

   public void O0000000000O0() {
      if (O0000O00OO00O.O00000000() && O0000000000.getWindow() != null) {
         this.O00000000(O0000000000.getWindow().getFramebufferWidth(), O0000000000.getWindow().getFramebufferHeight());
      }
   }

   private void O00000000(int i, int j) {
      if (this.O0000000000000
         && O0000000000.world != null
         && O0000000000.player != null
         && i > 0
         && j > 0
         && O0000000000.getWindow() != null
         && !O0000000000.getWindow().hasZeroWidthOrHeight()) {
         O0000O00OO0000 var3 = O0000O00OO0000.O00000000();
         if (this.O0000000000OO0()) {
            var3.O00000000(false, false, i, j);
         } else if (!this.O0000000000OO()) {
            var3.O00000000(false, false, i, j);
         } else {
            boolean var4 = false;

            for (Hand var8 : O000000000OO0O) {
               if (this.O00000000(var8) && var3.O000000000(var8)) {
                  int var9 = var3.O0000000000(var8);
                  if (var9 > 0) {
                     if (this.O000000000OO00 == null) {
                        this.O000000000OO00 = new O0000O0O000O0O();
                     }

                     if (!var4) {
                        this.O00000000(this.O000000000OOO, this.O000000000OOO0);
                        var4 = true;
                     }

                     int var10 = var3.O000000000000(var8);
                     this.O000000000OO00
                        .O00000000(
                           var9,
                           var3.O00000000000(var8),
                           var10 > 0 ? var10 : var9,
                           i,
                           j,
                           new O0000O0O000O0O.W390(
                              this.O000000000O00.O0000000000() * 2.0F,
                              this.O000000000O00O.O0000000000(),
                              this.O0000000000O0O() ? 0.0F : this.O000000000O000.O0000000000() * 2.0F,
                              this.O0000000000O00() ? 0.0F : 1.35F,
                              this.O000000000O0O.O0000000000(),
                              0,
                              this.O000000000O0OO.O000000000("Статичный") ? 1 : 0,
                              this.O000000000O0O0.O000000000("Предмет") ? 1 : 0,
                              this.O000000000OOO[0],
                              this.O000000000OOO[1],
                              this.O000000000OOO[2],
                              this.O000000000OOO0[0],
                              this.O000000000OOO0[1],
                              this.O000000000OOO0[2]
                           )
                        );
                  }
               }
            }
         }
      }
   }

   private void O00000000(float[] fs, float[] gs) {
      if (this.O000000000O0O0.O000000000("Свой")) {
         O00000000(this.O000000000OO.O0000000000().getRGB(), fs);
         O00000000(this.O000000000OO0.O0000000000().getRGB(), gs);
      } else {
         Theme var3 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
         ColorScheme var4 = ColorScheme.O00000000(var3, O00000OOOO00O0.O00000000000());
         O00000000(var4.O000000000O0(), fs);
         O00000000(var4.O000000000O00(), gs);
      }
   }

   private boolean O0000000000O00() {
      return this.O000000000O0.O000000000("Свечение");
   }

   private boolean O0000000000O0O() {
      return this.O000000000O0.O000000000("Контур");
   }

   private boolean O0000000000OO() {
      return O0000000000.options != null && O0000000000.options.getPerspective() != null && O0000000000.options.getPerspective().isFirstPerson();
   }

   private boolean O0000000000OO0() {
      return O0000000000.options != null && O0000000000.options.hudHidden;
   }

   private void O0000000000OOO() {
      Runnable var1 = () -> {
         O0000O00OO0000.O00000000().O000000000();
         O0000O0O000O0O var1x = this.O000000000OO00;
         this.O000000000OO00 = null;
         if (var1x != null) {
            var1x.close();
         }
      };
      if (RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L) {
         var1.run();
      } else if (O0000000000 != null) {
         O0000000000.execute(var1);
      }
   }

   private static Arm O00000000(Arm arm) {
      return arm == Arm.RIGHT ? Arm.LEFT : Arm.RIGHT;
   }

   private static void O00000000(int i, float[] fs) {
      fs[0] = (i >> 16 & 0xFF) / 255.0F;
      fs[1] = (i >> 8 & 0xFF) / 255.0F;
      fs[2] = (i & 0xFF) / 255.0F;
   }
}
