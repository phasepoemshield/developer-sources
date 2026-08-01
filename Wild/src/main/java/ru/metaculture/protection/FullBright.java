package ru.metaculture.protection;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.LightType;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "FullBright",
   O000000000 = "ПРОЗРЕВШИЙ",
   O0000000000 = Category.Visuals
)
public class FullBright extends Module {
   private static final String O000000000OO0 = "Гамма";
   private static final String O000000000OO00 = "Эффект";
   private static final String O000000000OO0O = "Динамический";
   private static final String O000000000OOO = "Адаптивный";
   private static final String O000000000OOO0 = "Факел";
   public ModeSetting O000000000O = new ModeSetting("Тип", "Гамма", "Гамма", "Эффект", "Динамический", "Адаптивный", "Факел");
   public NumberSetting O000000000O0 = new NumberSetting("Порог", 0.53F, 0.5F, 0.6F, 0.01F, true).O00000000(() -> !this.O0000000000O0O());
   public NumberSetting O000000000O00 = new NumberSetting("Кривая", 1.4F, 0.5F, 3.0F, 0.1F, false).O00000000(() -> !this.O0000000000O0O());
   public NumberSetting O000000000O000 = new NumberSetting("Радиус", 10.0F, 5.0F, 20.0F, 1.0F, false).O00000000(() -> !this.O0000000000OO());
   public static volatile boolean O000000000O00O = false;
   public static volatile float O000000000O0O = 10.0F;
   public static volatile double O000000000O0O0 = 0.0;
   public static volatile double O000000000O0OO = 0.0;
   public static volatile double O000000000OO = 0.0;
   private int O000000000OOOO = Integer.MIN_VALUE;
   private int O00000000O = Integer.MIN_VALUE;
   private int O00000000O0 = Integer.MIN_VALUE;
   private boolean O00000000O00 = false;
   private int O00000000O000;
   private int O00000000O0000;
   private int O00000000O000O;
   private int O00000000O00O;
   private int O00000000O00O0;
   private int O00000000O00OO;

   public FullBright() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000});
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O000000000OOOO = Integer.MIN_VALUE;
      this.O00000000O = Integer.MIN_VALUE;
      this.O00000000O0 = Integer.MIN_VALUE;
      if (O0000000000.worldRenderer != null && this.O000000000O00O()) {
         O0000000000.worldRenderer.reload();
      }
   }

   @Override
   public void O000000000() {
      super.O000000000();
      this.O000000000O00();
      if (O0000000000.worldRenderer != null && this.O000000000O00O()) {
         O0000000000.worldRenderer.reload();
      }

      if (O0000000000.player != null) {
         O0000000000.player.removeStatusEffect(StatusEffects.NIGHT_VISION);
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      if (O0000000000.player != null) {
         if (this.O000000000O000()) {
            O0000000000.player.removeStatusEffect(StatusEffects.NIGHT_VISION);
         }

         if (this.O000000000O.O000000000("Эффект")) {
            O0000000000.player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 300, 0, false, false));
         }

         this.O000000000O0();
      }
   }

   private void O000000000O0() {
      if (this.O0000000000OO() && O0000000000.world != null && O0000000000.worldRenderer != null) {
         O000000000O0O = this.O000000000O000.O0000000000();
         O000000000O0O0 = O0000000000.player.getX();
         O000000000O0OO = O0000000000.player.getEyeY();
         O000000000OO = O0000000000.player.getZ();
         O000000000O00O = true;
         int var1 = MathHelper.floor(O000000000O0O0);
         int var2 = MathHelper.floor(O0000000000.player.getY());
         int var3 = MathHelper.floor(O000000000OO);
         if (var1 != this.O000000000OOOO || var2 != this.O00000000O || var3 != this.O00000000O0) {
            if (this.O00000000O00) {
               O0000000000.worldRenderer
                  .scheduleBlockRenders(
                     this.O00000000O000, this.O00000000O0000, this.O00000000O000O, this.O00000000O00O, this.O00000000O00O0, this.O00000000O00OO
                  );
            }

            int var4 = MathHelper.ceil(this.O000000000O000.O0000000000()) + 1;
            this.O00000000O000 = var1 - var4;
            this.O00000000O0000 = var2 - var4;
            this.O00000000O000O = var3 - var4;
            this.O00000000O00O = var1 + var4;
            this.O00000000O00O0 = var2 + var4;
            this.O00000000O00OO = var3 + var4;
            this.O00000000O00 = true;
            O0000000000.worldRenderer
               .scheduleBlockRenders(this.O00000000O000, this.O00000000O0000, this.O00000000O000O, this.O00000000O00O, this.O00000000O00O0, this.O00000000O00OO);
            this.O000000000OOOO = var1;
            this.O00000000O = var2;
            this.O00000000O0 = var3;
         }
      } else {
         this.O000000000O00();
      }
   }

   private void O000000000O00() {
      if (O000000000O00O || this.O00000000O00) {
         O000000000O00O = false;
         if (this.O00000000O00 && O0000000000.worldRenderer != null) {
            O0000000000.worldRenderer
               .scheduleBlockRenders(this.O00000000O000, this.O00000000O0000, this.O00000000O000O, this.O00000000O00O, this.O00000000O00O0, this.O00000000O00OO);
         }

         this.O00000000O00 = false;
         this.O000000000OOOO = Integer.MIN_VALUE;
         this.O00000000O = Integer.MIN_VALUE;
         this.O00000000O0 = Integer.MIN_VALUE;
      }
   }

   public static int O00000000(int i, int j, int k) {
      return O00000000(i + 0.5, j + 0.5, k + 0.5);
   }

   public static int O00000000(double d, double e, double f) {
      if (!O000000000O00O) {
         return 0;
      } else {
         float var6 = O000000000O0O;
         if (var6 <= 0.0F) {
            return 0;
         } else {
            double var7 = d - O000000000O0O0;
            double var9 = e - O000000000O0OO;
            double var11 = f - O000000000OO;
            double var13 = Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
            if (var13 >= var6) {
               return 0;
            } else {
               int var15 = Math.round(15.0F * (float)(1.0 - var13 / var6));
               return var15 < 1 ? 0 : Math.min(var15, 15);
            }
         }
      }
   }

   public boolean O0000000000O0() {
      return this.O000000000O.O000000000("Гамма");
   }

   public boolean O0000000000O00() {
      return this.O000000000O.O000000000("Динамический");
   }

   public boolean O0000000000O0O() {
      return this.O000000000O.O000000000("Адаптивный");
   }

   public boolean O0000000000OO() {
      return this.O000000000O.O000000000("Факел");
   }

   public float O0000000000OO0() {
      return O00000000(this.O000000000O0.O0000000000(), 0.0F, 1.0F);
   }

   public float O0000000000OOO() {
      return O00000000(this.O000000000O00.O0000000000(), 0.5F, 3.0F);
   }

   public float O000000000O() {
      if (O0000000000.player != null && O0000000000.world != null) {
         BlockPos var1 = O0000000000.player.getBlockPos();
         float var2 = O0000000000.world.getLightLevel(LightType.BLOCK, var1) / 15.0F;
         float var3 = O0000000000.world.getLightLevel(LightType.SKY, var1) / 15.0F;
         float var4 = O00000000(O0000000000.world.getTimeOfDay() % 24000L);
         float var5 = Math.max(var2, var3 * (1.0F - var4 * 0.7F));
         float var6 = O00000000(Math.max(1.0F - var5, var4 * 0.65F), 0.0F, 1.0F);
         float var7 = (float)Math.sin(System.currentTimeMillis() * 0.0018) * 0.035F;
         return 2.0F + O00000000(var6 + var7, 0.0F, 1.0F) * 198.0F;
      } else {
         return 80.0F;
      }
   }

   private boolean O000000000O000() {
      return this.O000000000O.O000000000("Гамма") || this.O000000000O.O000000000("Динамический") || this.O000000000O.O000000000("Адаптивный");
   }

   private boolean O000000000O00O() {
      return this.O000000000O.O000000000("Гамма") || this.O000000000O.O000000000("Динамический");
   }

   private static float O00000000(long l) {
      if (l < 12000L) {
         return 0.0F;
      } else if (l < 14000L) {
         return (float)(l - 12000L) / 2000.0F;
      } else {
         return l < 22000L ? 1.0F : 1.0F - (float)(l - 22000L) / 2000.0F;
      }
   }

   private static float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }
}
