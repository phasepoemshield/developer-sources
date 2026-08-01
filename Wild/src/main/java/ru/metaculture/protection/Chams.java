package ru.metaculture.protection;

import java.awt.Color;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Chams",
   O000000000 = "Красивая шейдерная заливка моделей сущностей за стенами.",
   O0000000000 = Category.Visuals
)
public final class Chams extends Module {
   public static final String O000000000O = "Crystal";
   public static final String O000000000O0 = "Void";
   public static final String O000000000O00 = "Phantom";
   public static final String O000000000O000 = "Гибрид";
   public static final String O000000000O00O = "По сцене";
   public static final String O000000000O0O = "Сквозь стены";
   public final GroupSetting O000000000O0O0 = new GroupSetting(
      "Цели", new BooleanSetting("Игроки", true), new BooleanSetting("Мобы", true), new BooleanSetting("Себя", false), new BooleanSetting("Невидимые", true)
   );
   public final ModeSetting O000000000O0OO = new ModeSetting("Режим", "Crystal", "Crystal", "Void", "Phantom");
   public final ModeSetting O000000000OO = new ModeSetting("Глубина", "Гибрид", "Гибрид", "По сцене", "Сквозь стены");
   public final BooleanSetting O000000000OO0 = new BooleanSetting("Скрывать броню и предметы", true);
   public final BooleanSetting O000000000OO00 = new BooleanSetting("Скрывать ванильную тень", true);
   public final NumberSetting O000000000OO0O = new NumberSetting("Дистанция", 96.0F, 8.0F, 256.0F, 1.0F, false);
   public final ColorSetting O000000000OOO = new ColorSetting("Верхний акцент", 58.0F, 0.72F, 1.0F, 1.0F);
   public final ColorSetting O000000000OOO0 = new ColorSetting("Нижний акцент", 76.0F, 0.82F, 1.0F, 1.0F);
   public final NumberSetting O000000000OOOO = new NumberSetting("Интенсивность", 1.35F, 0.35F, 3.0F, 0.05F, false);
   public final NumberSetting O00000000O = new NumberSetting("Прозрачность", 1.0F, 0.25F, 1.0F, 0.01F, true);
   public final NumberSetting O00000000O0 = new NumberSetting("Преломление", 0.72F, 0.35F, 1.15F, 0.01F, false);
   private final Map<Integer, Chams.W134> O00000000O00 = new ConcurrentHashMap<>();

   public Chams() {
      PrismaticChamsRenderer.O00000000();
      this.O000000000O0OO.O0000000000000 = "Screen-space шейдер чамсов: Crystal, Void или Phantom";
      this.O000000000OO.O0000000000000 = "Гибрид рисует скрытый проход через стены и основной проход по depth buffer";
      this.O000000000OO0.O00000000000 = "Отключает броню, предметы в руках и остальные feature layers у подсвеченной сущности";
      this.O000000000OO00.O00000000000 = "Убирает стандартную круглую тень Minecraft под подсвеченной сущностью";
      this.O00000000(
         new Setting[]{
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO,
            this.O000000000OO0,
            this.O000000000OO00,
            this.O000000000OO0O,
            this.O000000000OOO,
            this.O000000000OOO0,
            this.O000000000OOOO,
            this.O00000000O,
            this.O00000000O0
         }
      );
   }

   public boolean O00000000(LivingEntityRenderState livingEntityRenderState) {
      return this.O00000000000(livingEntityRenderState) > 0.001F;
   }

   public boolean O000000000(LivingEntityRenderState livingEntityRenderState) {
      return this.O000000000OO0.O0000000000() && this.O00000000000(livingEntityRenderState) > 0.001F;
   }

   public boolean O0000000000(LivingEntityRenderState livingEntityRenderState) {
      return this.O000000000OO00.O0000000000() && this.O00000000000(livingEntityRenderState) > 0.001F;
   }

   public float O00000000000(LivingEntityRenderState livingEntityRenderState) {
      if (livingEntityRenderState == null) {
         return 0.0F;
      } else {
         int var2 = O0000000000000(livingEntityRenderState);
         boolean var3 = this.O000000000000(livingEntityRenderState);
         Chams.W134 var4 = this.O00000000O00.get(var2);
         if (var4 == null && !var3) {
            return 0.0F;
         } else {
            if (var4 == null) {
               var4 = new Chams.W134();
               this.O00000000O00.put(var2, var4);
            }

            long var5 = System.nanoTime();
            float var7 = var4.O0000000000 == 0L ? 0.0F : Math.min((float)(var5 - var4.O0000000000) / 1.0E9F, 0.05F);
            var4.O0000000000 = var5;
            float var8 = var3 ? 1.0F : 0.0F;
            float var9 = var8 - var4.O00000000;
            var4.O000000000 += var9 * 42.0F * var7;
            var4.O000000000 = var4.O000000000 * (float)Math.exp(-13.0F * var7);
            var4.O00000000 = var4.O00000000 + var4.O000000000 * var7;
            if (var4.O00000000 < 0.0F) {
               var4.O00000000 = 0.0F;
               var4.O000000000 = 0.0F;
            } else if (var4.O00000000 > 1.12F) {
               var4.O00000000 = 1.12F;
               var4.O000000000 *= -0.22F;
            }

            if (!var3 && var4.O00000000 <= 0.001F) {
               this.O00000000O00.remove(var2);
               return 0.0F;
            } else {
               return var4.O00000000;
            }
         }
      }
   }

   public boolean O0000000000O0() {
      Iterator var1 = this.O00000000O00.entrySet().iterator();

      while (var1.hasNext()) {
         Chams.W134 var2 = (Chams.W134)((Entry)var1.next()).getValue();
         if (!(var2.O00000000 <= 0.001F) || !(var2.O000000000 <= 0.001F)) {
            return true;
         }

         var1.remove();
      }

      return false;
   }

   public int O0000000000O00() {
      if (this.O000000000O0OO.O000000000("Void")) {
         return 1;
      } else {
         return this.O000000000O0OO.O000000000("Phantom") ? 2 : 0;
      }
   }

   public boolean O0000000000O0O() {
      return this.O000000000OO.O000000000("Гибрид");
   }

   public boolean O0000000000OO() {
      return this.O000000000OO.O000000000("По сцене");
   }

   private boolean O000000000000(LivingEntityRenderState livingEntityRenderState) {
      if (!this.O0000000000000) {
         return false;
      } else if (livingEntityRenderState == null || O0000000000 == null || O0000000000.world == null) {
         return false;
      } else if (livingEntityRenderState.invisible && !this.O000000000O0O0.O000000000("Невидимые")) {
         return false;
      } else {
         float var2 = Math.max(1.0F, this.O000000000OO0O.O0000000000());
         if (livingEntityRenderState.squaredDistanceToCamera > var2 * var2) {
            return false;
         } else if (livingEntityRenderState instanceof PlayerEntityRenderState var3) {
            return O0000000000.player != null && var3.name != null && var3.name.equals(O0000000000.player.getName().getString())
               ? this.O000000000O0O0.O000000000("Себя")
               : this.O000000000O0O0.O000000000("Игроки");
         } else {
            return this.O000000000O0O0.O000000000("Мобы");
         }
      }
   }

   public float[] O0000000000OO0() {
      return O00000000(this.O000000000OOO.O0000000000());
   }

   public float[] O0000000000OOO() {
      return O00000000(this.O000000000OOO0.O0000000000());
   }

   public static Chams O000000000O() {
      Chams var0 = O000000000O0();
      return var0 == null || !var0.O0000000000000 && !var0.O0000000000O0() ? null : var0;
   }

   public static Chams O000000000O0() {
      return WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null ? WildClient.O00000000.O000000000.O00000000(Chams.class) : null;
   }

   private static int O0000000000000(LivingEntityRenderState livingEntityRenderState) {
      int var1 = ((O0000O00OO000O)livingEntityRenderState).wild$getEntityId();
      if (var1 != Integer.MIN_VALUE) {
         return var1;
      } else {
         int var2 = livingEntityRenderState.entityType == null ? 0 : livingEntityRenderState.entityType.hashCode();
         int var3 = Math.round((float)livingEntityRenderState.x * 8.0F);
         int var4 = Math.round((float)livingEntityRenderState.y * 8.0F);
         int var5 = Math.round((float)livingEntityRenderState.z * 8.0F);
         int var6 = var2 * 31 + var3;
         var6 = var6 * 31 + var4;
         return var6 * 31 + var5;
      }
   }

   private static float[] O00000000(Color color) {
      return new float[]{color.getRed() / 255.0F, color.getGreen() / 255.0F, color.getBlue() / 255.0F, color.getAlpha() / 255.0F};
   }

   static final class W134 {
      float O00000000;
      float O000000000;
      long O0000000000;
   }
}
