package ru.metaculture.protection;

import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.option.Perspective;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Animations",
   O0000000000 = Category.Visuals,
   O000000000 = "Анимки на все действия, таб, открытие инва итд"
)
public class Animations extends Module {
   private static final long O000000000OOO = 240L;
   private static final long O000000000OOO0 = 220L;
   private static final long O000000000OOOO = 300L;
   private static final long O00000000O = 240L;
   private static final long O00000000O0 = 90L;
   private static final long O00000000O00 = 120L;
   private static final long O00000000O000 = 260L;
   public final GroupSetting O000000000O = new GroupSetting(
      "Анимировать",
      new BooleanSetting("Чат", false),
      new BooleanSetting("Таб", false),
      new BooleanSetting("Инвентарь", false),
      new BooleanSetting("Сундуки", false),
      new BooleanSetting("Кнопки", false),
      new BooleanSetting("F5", false)
   );
   public final ModeSetting O000000000O0 = new ModeSetting(
      "Режим анимации",
      "Ease Out Back",
      "Linear",
      "Ease Out Quad",
      "Ease Out Cubic",
      "Ease Out Quart",
      "Ease Out Expo",
      "Ease Out Back",
      "Ease Out Elastic",
      "Ease Out Bounce",
      "Shrink Easing"
   );
   public final NumberSetting O000000000O00 = new NumberSetting("Скорость чата", 1.0F, 0.1F, 3.0F, 0.1F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Чат"));
   public final NumberSetting O000000000O000 = new NumberSetting("Скорость таба", 1.0F, 0.1F, 3.0F, 0.1F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Таб"));
   public final NumberSetting O000000000O00O = new NumberSetting("Скорость инвентаря", 1.0F, 0.1F, 3.0F, 0.1F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Инвентарь"));
   public final NumberSetting O000000000O0O = new NumberSetting("Скорость сундуков", 1.0F, 0.1F, 3.0F, 0.1F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Сундуки"));
   public final NumberSetting O000000000O0O0 = new NumberSetting("Скорость кнопок", 1.0F, 0.1F, 3.0F, 0.1F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Кнопки"));
   public final NumberSetting O000000000O0OO = new NumberSetting("Скорость F5", 1.0F, 0.1F, 3.0F, 0.1F, false)
      .O00000000(() -> !this.O000000000O.O000000000("F5"));
   public O0000O0O000 O000000000OO;
   public O0000O0O000 O000000000OO0;
   public O0000O0O000 O000000000OO00;
   public static float O000000000OO0O = 1.0F;
   private Perspective O00000000O0000 = Perspective.FIRST_PERSON;
   private Perspective O00000000O000O = Perspective.FIRST_PERSON;
   private Perspective O00000000O00O = Perspective.FIRST_PERSON;
   private long O00000000O00O0;
   private boolean O00000000O00OO;
   private boolean O00000000O0O;
   private long O00000000O0O0;
   private boolean O00000000O0O00;
   private long O00000000O0O0O;
   private Screen O00000000O0OO;
   private boolean O00000000O0OO0;

   public Animations() {
      this.O00000000(
         new Setting[]{
            this.O000000000O,
            this.O000000000O0,
            this.O000000000O00,
            this.O000000000O000,
            this.O000000000O00O,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO
         }
      );
   }

   public O0000O0O0000 O0000000000O0() {
      String var1 = this.O000000000O0.O0000000000();

      for (O0000O0O0000 var5 : O0000O0O0000.values()) {
         if (var5.toString().equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return O0000O0O0000.EASE_OUT_BACK;
   }

   public O0000O0O0000 O0000000000O00() {
      return this.O0000000000O0O();
   }

   public O0000O0O0000 O0000000000O0O() {
      O0000O0O0000 var1 = this.O0000000000O0();

      return switch (var1) {
         case EASE_OUT_BACK, EASE_OUT_ELASTIC, SHRINK_EASING -> O0000O0O0000.EASE_OUT_QUAD;
         default -> var1;
      };
   }

   public float O0000000000OO() {
      return O00000000(this.O000000000O0O0);
   }

   public void O0000000000OO0() {
      if (this.O00000000O0O && this.O000000000OO0 != null && !this.O000000000OO0.O00000000000OO()) {
         this.O00000000O0O = false;
         this.O00000000O0O0 = 0L;
         float var1 = (float)this.O000000000OO0.O00000000000O0();
         long var2 = this.O00000000O0000();
         long var4 = Math.max(O00000000(80L, this.O000000000O00), Math.round(var2 * (1.0 - var1)));
         this.O000000000OO0.O00000000(this.O0000000000O0());
         this.O000000000OO0.O00000000(var4);
         this.O000000000OO0.O00000000(1.0);
      } else {
         this.O00000000O0O = false;
         this.O00000000O0O0 = 0L;
         if (this.O000000000OO0 == null) {
            this.O000000000OO0 = new O0000O0O000(this.O0000000000O0(), this.O00000000O0000());
         }

         this.O000000000OO0.O00000000(this.O0000000000O0());
         this.O000000000OO0.O00000000(this.O00000000O0000());
         this.O000000000OO0.O00000000(1.0);
      }
   }

   public void O0000000000OOO() {
      if (this.O000000000OO0 == null) {
         this.O000000000OO0 = new O0000O0O000(this.O0000000000O00(), this.O00000000O000O());
         this.O000000000OO0.O00000000000(1.0);
         this.O000000000OO0.O000000000(1.0);
         this.O000000000OO0.O0000000000(1.0);
         this.O000000000OO0.O00000000(true);
      }

      if (!this.O00000000O0O) {
         this.O00000000O0O = true;
         this.O00000000O0O0 = System.currentTimeMillis();
         float var1 = (float)this.O000000000OO0.O00000000000O0();
         long var2 = this.O00000000O000O();
         long var4 = Math.max(O00000000(80L, this.O000000000O00), (long)Math.round((float)var2 * var1));
         this.O000000000OO0.O00000000(this.O0000000000O00());
         this.O000000000OO0.O00000000(var4);
      }

      this.O000000000OO0.O00000000(0.0);
   }

   public boolean O000000000O() {
      return this.O00000000O0O;
   }

   public boolean O000000000O0() {
      if (!this.O00000000O0O) {
         return false;
      } else if (this.O000000000OO0 == null) {
         return true;
      } else {
         long var1 = System.currentTimeMillis() - this.O00000000O0O0;
         return var1 >= this.O000000000OO0.O00000000000() + 20L ? true : this.O000000000OO0.O00000000000OO() && this.O000000000OO0.O00000000000O0() <= 0.001;
      }
   }

   public float O000000000O00() {
      return this.O000000000OO0 == null ? 0.0F : (float)this.O000000000OO0.O00000000000O0();
   }

   public void O000000000O000() {
      this.O000000000OO0 = null;
      this.O00000000O0O = false;
      this.O00000000O0O0 = 0L;
   }

   public boolean O00000000(Screen screen) {
      if (screen != null && this.O0000000000000) {
         boolean var2 = screen instanceof InventoryScreen;
         return var2 && this.O000000000O.O000000000("Инвентарь") ? true : !var2 && this.O000000000O.O000000000("Сундуки");
      } else {
         return false;
      }
   }

   public float O000000000(Screen screen) {
      if (!this.O00000000(screen)) {
         return 1.0F;
      } else {
         boolean var2 = this.O00000000O0O00 && (this.O00000000O0OO == null || this.O00000000O0OO == screen);
         long var3 = this.O00000000(screen, var2);
         if (this.O000000000OO == null) {
            this.O000000000OO = new O0000O0O000(var2 ? this.O0000000000O0O() : this.O0000000000O0(), var3);
            if (var2) {
               this.O000000000OO.O00000000000(1.0);
               this.O000000000OO.O000000000(1.0);
               this.O000000000OO.O0000000000(1.0);
               this.O000000000OO.O00000000(true);
            }
         }

         this.O000000000OO.O00000000(var2 ? this.O0000000000O0O() : this.O0000000000O0());
         this.O000000000OO.O00000000(var3);
         this.O000000000OO.O00000000(var2 ? 0.0 : 1.0);
         return O0000000000((float)this.O000000000OO.O00000000000O0());
      }
   }

   public void O0000000000(Screen screen) {
      if (screen != null && !this.O00000000O0OO0 && this.O00000000(screen)) {
         if (this.O000000000OO == null) {
            this.O000000000OO = new O0000O0O000(this.O0000000000O0O(), this.O00000000000(screen));
            this.O000000000OO.O00000000000(1.0);
            this.O000000000OO.O000000000(1.0);
            this.O000000000OO.O0000000000(1.0);
            this.O000000000OO.O00000000(true);
         }

         if (!this.O00000000O0O00 || this.O00000000O0OO != screen) {
            this.O00000000O0O00 = true;
            this.O00000000O0O0O = System.currentTimeMillis();
            this.O00000000O0OO = screen;
            this.O000000000OO.O00000000(this.O0000000000O0O());
            this.O000000000OO.O00000000(this.O00000000000(screen));
         }

         this.O000000000OO.O00000000(0.0);
      }
   }

   public boolean O000000000O00O() {
      return this.O00000000O0O00;
   }

   public boolean O000000000O0O() {
      return this.O00000000O0OO0;
   }

   public void O000000000O0O0() {
      this.O000000000OO = null;
      this.O00000000O0O00 = false;
      this.O00000000O0O0O = 0L;
      this.O00000000O0OO = null;
      this.O00000000O0OO0 = false;
   }

   public boolean O0000000000(boolean bl) {
      if (!this.O0000000000000 || !this.O000000000O.O000000000("Таб")) {
         return bl;
      } else {
         return bl ? true : this.O000000000OO00 != null && (!this.O000000000OO00.O00000000000OO() || this.O000000000OO00.O00000000000O0() > 0.001);
      }
   }

   public float O00000000000(boolean bl) {
      long var2 = this.O000000000000(bl);
      if (this.O000000000OO00 == null) {
         this.O000000000OO00 = new O0000O0O000(bl ? this.O0000000000O0() : this.O0000000000O0O(), var2);
         if (!bl) {
            this.O000000000OO00.O00000000000(1.0);
            this.O000000000OO00.O000000000(1.0);
            this.O000000000OO00.O0000000000(1.0);
            this.O000000000OO00.O00000000(true);
         }
      }

      this.O000000000OO00.O00000000(bl ? this.O0000000000O0() : this.O0000000000O0O());
      this.O000000000OO00.O00000000(var2);
      this.O000000000OO00.O00000000(bl ? 1.0 : 0.0);
      float var4 = O0000000000((float)this.O000000000OO00.O00000000000O0());
      if (!bl && this.O000000000OO00.O00000000000OO() && var4 <= 0.001F) {
         this.O000000000OO00 = null;
      }

      return var4;
   }

   public float O000000000O0OO() {
      if (this.O0000000000000 && this.O000000000O.O000000000("F5") && this.O00000000O00OO) {
         long var1 = System.currentTimeMillis() - this.O00000000O00O0;
         O000000000OO0O = O0000000000((float)var1 / (float)this.O00000000O00O());
         if (O000000000OO0O >= 1.0F) {
            O000000000OO0O = 1.0F;
            this.O00000000O00OO = false;
         }

         return O000000000OO0O;
      } else {
         O000000000OO0O = 1.0F;
         this.O00000000O00OO = false;
         return O000000000OO0O;
      }
   }

   public float O000000000OO() {
      float var1 = this.O000000000O0OO();
      return 1.0F - (float)Math.pow(1.0F - var1, 3.0);
   }

   public boolean O000000000OO0() {
      return this.O00000000O00OO && this.O00000000O000O == Perspective.FIRST_PERSON && this.O00000000O00O == Perspective.THIRD_PERSON_BACK;
   }

   public boolean O000000000OO00() {
      return this.O00000000O00OO && this.O00000000O000O != Perspective.FIRST_PERSON && this.O00000000O00O == Perspective.FIRST_PERSON;
   }

   public boolean O000000000OO0O() {
      return this.O00000000O00OO
         && (
            this.O00000000O000O == Perspective.THIRD_PERSON_BACK && this.O00000000O00O == Perspective.THIRD_PERSON_FRONT
               || this.O00000000O000O == Perspective.THIRD_PERSON_FRONT && this.O00000000O00O == Perspective.THIRD_PERSON_BACK
         );
   }

   public boolean O000000000OOO() {
      return this.O000000000OO0O() && this.O00000000O000O == Perspective.THIRD_PERSON_BACK && this.O00000000O00O == Perspective.THIRD_PERSON_FRONT;
   }

   public boolean O000000000OOO0() {
      return this.O000000000OO0O() && this.O00000000O000O == Perspective.THIRD_PERSON_FRONT && this.O00000000O00O == Perspective.THIRD_PERSON_BACK;
   }

   public float O000000000OOOO() {
      float var1 = this.O000000000OO();
      if (this.O00000000O000O == Perspective.THIRD_PERSON_BACK && this.O00000000O00O == Perspective.THIRD_PERSON_FRONT) {
         return 180.0F * var1;
      } else if (this.O00000000O000O == Perspective.THIRD_PERSON_FRONT && this.O00000000O00O == Perspective.THIRD_PERSON_BACK) {
         return 180.0F * (1.0F - var1);
      } else {
         return this.O00000000O00O == Perspective.THIRD_PERSON_FRONT ? 180.0F : 0.0F;
      }
   }

   public float O00000000(float f) {
      float var2 = this.O000000000OO();
      if (this.O00000000O000O == Perspective.THIRD_PERSON_BACK && this.O00000000O00O == Perspective.THIRD_PERSON_FRONT) {
         return O00000000(f, -f, var2);
      } else if (this.O00000000O000O == Perspective.THIRD_PERSON_FRONT && this.O00000000O00O == Perspective.THIRD_PERSON_BACK) {
         return O00000000(f, -f, 1.0F - var2);
      } else {
         return this.O00000000O00O == Perspective.THIRD_PERSON_FRONT ? -f : f;
      }
   }

   public float O00000000O() {
      if (!this.O000000000OO00()) {
         return 0.0F;
      } else {
         return this.O00000000O000O == Perspective.THIRD_PERSON_FRONT ? 180.0F * (1.0F - this.O000000000OO()) : 0.0F;
      }
   }

   public float O000000000(float f) {
      if (!this.O000000000OO00()) {
         return f;
      } else {
         return this.O00000000O000O == Perspective.THIRD_PERSON_FRONT ? O00000000(-f, f, this.O000000000OO()) : f;
      }
   }

   public float O00000000O0() {
      return this.O000000000OO00() ? 1.0F - this.O000000000OO() : 0.0F;
   }

   private boolean O00000000O00() {
      if (!this.O00000000O0O00) {
         return false;
      } else if (this.O000000000OO == null) {
         return true;
      } else {
         long var1 = System.currentTimeMillis() - this.O00000000O0O0O;
         return var1 >= this.O000000000OO.O00000000000() + 40L ? true : this.O000000000OO.O00000000000OO() && this.O000000000OO.O00000000000O0() <= 0.001;
      }
   }

   private void O00000000O000() {
      Screen var1 = this.O00000000O0OO;
      this.O00000000O0OO0 = true;

      try {
         if (var1 != null && O0000000000.currentScreen == var1) {
            var1.close();
         } else if (O0000000000.currentScreen != null && this.O00000000(O0000000000.currentScreen)) {
            O0000000000.setScreen(null);
         }
      } finally {
         this.O000000000O0O0();
      }
   }

   private static float O0000000000(float f) {
      return Math.max(0.0F, Math.min(1.0F, f));
   }

   private long O00000000O0000() {
      return O00000000(240L, this.O000000000O00);
   }

   private long O00000000O000O() {
      return O00000000(220L, this.O000000000O00);
   }

   private long O000000000000(boolean bl) {
      return O00000000(bl ? 300L : 240L, this.O000000000O000);
   }

   private long O00000000(Screen screen, boolean bl) {
      return O00000000(bl ? 120L : 90L, this.O000000000000(screen));
   }

   private long O00000000000(Screen screen) {
      return O00000000(120L, this.O000000000000(screen));
   }

   private long O00000000O00O() {
      return O00000000(260L, this.O000000000O0OO);
   }

   private NumberSetting O000000000000(Screen screen) {
      return screen instanceof InventoryScreen ? this.O000000000O00O : this.O000000000O0O;
   }

   private static long O00000000(long l, NumberSetting o000000O000) {
      return Math.max(1L, (long)Math.round((float)l / O00000000(o000000O000)));
   }

   private static float O00000000(NumberSetting o000000O000) {
      if (o000000O000 == null) {
         return 1.0F;
      } else {
         float var1 = o000000O000.O0000000000();
         return Float.isFinite(var1) && !(var1 <= 0.0F) ? var1 : 1.0F;
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (!O0000O00O0000O.O00000000()) {
         if (!O0000000000.options.playerListKey.isPressed() && this.O000000000OO00 != null) {
            this.O00000000000(false);
         }

         Perspective var2 = O0000000000.options.getPerspective();
         if (var2 != this.O00000000O0000) {
            this.O00000000O000O = this.O00000000O0000;
            this.O00000000O00O = var2;
            this.O00000000O0000 = var2;
            if (this.O0000000000000 && this.O000000000O.O000000000("F5")) {
               O000000000OO0O = 0.0F;
               this.O00000000O00O0 = System.currentTimeMillis();
               this.O00000000O00OO = true;
            } else {
               O000000000OO0O = 1.0F;
               this.O00000000O00OO = false;
            }
         }

         this.O000000000O0OO();
         if (this.O00000000O0O && O0000000000.currentScreen instanceof ChatScreen && this.O000000000O0()) {
            O0000000000.setScreen(null);
            this.O000000000O000();
         }

         if (this.O00000000O0O00 && this.O00000000O00()) {
            this.O00000000O000();
         }
      }
   }

   private static float O00000000(float f, float g, float h) {
      return f + (g - f) * O0000000000(h);
   }
}
