package ru.metaculture.protection;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.wild.module.api.Module;
import ru.metaculture.profile.Profile;

public final class O0000O000O0 implements O0000O000O000 {
   private static final O0000O000O0O00 O00000000 = O0000O000O0O00.O00000000();
   private static final O0000O000O0O00 O000000000 = O0000O000O0O00.O00000000000O();
   private static final O0000O000O0O00 O0000000000 = O0000O000O0O00.O0000000000OO();
   private static final SimpleDateFormat O00000000000 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
   private static final SimpleDateFormat O000000000000 = new SimpleDateFormat("dd.MM.yyyy");
   private static final String[] O0000000000000 = new String[]{"FunTime", "SpookyTime", "HolyWorld"};
   private static final Map<String, String> O000000000000O = Map.ofEntries(
      Map.entry("protection", "Защита"),
      Map.entry("fire_protection", "Огнеупорность"),
      Map.entry("feather_falling", "Невесомость"),
      Map.entry("blast_protection", "Взрывоустойчивость"),
      Map.entry("projectile_protection", "Защита от снарядов"),
      Map.entry("respiration", "Подводное дыхание"),
      Map.entry("aqua_affinity", "Подводник"),
      Map.entry("thorns", "Шипы"),
      Map.entry("depth_strider", "Подводная ходьба"),
      Map.entry("frost_walker", "Ледоход"),
      Map.entry("binding_curse", "Проклятие несъемности"),
      Map.entry("soul_speed", "Скорость души"),
      Map.entry("swift_sneak", "Проворство"),
      Map.entry("unbreaking", "Прочность"),
      Map.entry("mending", "Починка"),
      Map.entry("vanishing_curse", "Проклятие утраты"),
      Map.entry("efficiency", "Эффективность"),
      Map.entry("fortune", "Удача"),
      Map.entry("sharpness", "Острота"),
      Map.entry("smite", "Небесная кара"),
      Map.entry("bane_of_arthropods", "Бич членистоногих"),
      Map.entry("fire_aspect", "Заговор огня"),
      Map.entry("sweeping_edge", "Разящий клинок"),
      Map.entry("looting", "Добыча"),
      Map.entry("piercing", "Пронзатель"),
      Map.entry("multishot", "Тройной выстрел"),
      Map.entry("quick_charge", "Быстрая перезарядка"),
      Map.entry("luck_of_the_sea", "Морская удача")
   );
   private static final List<String> O00000000000O = List.of(
      "Шлем Крушителя",
      "Нагрудник Крушителя",
      "Поножи Крушителя",
      "Ботинки Крушителя",
      "Меч Крушителя",
      "Кирка Крушителя",
      "Лук Крушителя",
      "Арбалет Крушителя",
      "Трезубец Крушителя",
      "Булава Крушителя",
      "Элитры Крушителя",
      "Удочка Крушителя",
      "Сфера Хаоса",
      "Сфера Титана",
      "Сфера Ареса",
      "Сфера Бестии",
      "Сфера Гидры",
      "Сфера Икара",
      "Сфера Эрида",
      "Сфера Сатира",
      "Талисман Демона",
      "Талисман Карателя",
      "Талисман Мрака",
      "Талисман Ярости",
      "Талисман Тирана",
      "Талисман Крушителя",
      "Талисман Раздора",
      "Зелье Ассасина",
      "Зелье Гнева",
      "Хлопушка",
      "Святая Вода",
      "Зелье Палладина",
      "Зелье Радиации",
      "Снотворное",
      "Пласт",
      "Опыт 15",
      "Опыт 30",
      "Опыт 45",
      "Вайт",
      "Блек",
      "Блок дамагер",
      "Прогрузчик чанков",
      "Маяк",
      "Проклятая Душа",
      "Драконий Скин",
      "Огненный Смерч",
      "Снежок Заморозка",
      "Божья Аура",
      "Серебро",
      "Божье Касание",
      "Мощный Удар",
      "Мега Бульдозер",
      "Нерушимые Элитры"
   );
   private static List<O0000O000O0.W335> O00000000000O0;
   private final List<O0000O000O0.W336> O00000000000OO = new ArrayList<>();
   private String O0000000000O = "";
   private boolean O0000000000O0 = false;
   private final Map<String, TextSetting> O0000000000O00 = new HashMap<>();
   private String O0000000000O0O = null;
   private final O0000O00OOO0 O0000000000OO = new O0000O00OOO0();
   private final O0000O00OOO0 O0000000000OO0 = new O0000O00OOO0();
   private final O0000O00OOO0 O0000000000OOO = new O0000O00OOO0();
   private final O0000O00OOO0 O000000000O = new O0000O00OOO0();
   private float O000000000O0;
   private float O000000000O00;
   private float O000000000O000;
   private float O000000000O00O;
   private float O000000000O0O;
   private float O000000000O0O0;
   private float O000000000O0OO;
   private float O000000000OO;
   private final O0000O0O000 O000000000OO0 = new O0000O0O000(O0000O0O0000.EASE_IN_OUT_QUAD, 460L);
   private O0000O0O000 O000000000OO00 = new O0000O0O000(O0000O0O0000.EASE_OUT_CUBIC, 600L);
   private int O000000000OO0O = -1;
   private final TextSetting O000000000OOO = new TextSetting("Catalog Search", "");
   private final Map<String, TextSetting> O000000000OOO0 = new LinkedHashMap<>();
   private String O000000000OOOO = null;
   private String O00000000O = null;
   private boolean O00000000O0 = false;
   private float O00000000O00 = 0.0F;
   private float O00000000O000 = 1.0F;
   private O0000O000O0.W341 O00000000O0000 = O0000O000O0.W341.hidden();
   private O0000O000O0.W341 O00000000O000O = O0000O000O0.W341.hidden();
   private O0000O000O0.W341 O00000000O00O = O0000O000O0.W341.hidden();
   private O0000O000O0.W341 O00000000O00O0 = O0000O000O0.W341.hidden();
   private boolean O00000000O00OO;
   private boolean O00000000O0O;
   private boolean O00000000O0O0;
   private boolean O00000000O0O00;
   private float O00000000O0O0O;
   private int O00000000O0OO = 0;

   @Override
   public boolean O00000000(Module module) {
      return module instanceof AutoBuy;
   }

   @Override
   public boolean O00000000(Module module, O0000O000O0O0 o0000O000O0O0) {
      return o0000O000O0O0.O00000000O0O().contains(module) || o0000O000O0O0.O00000000(O0000O000O00O0.O00000000(module)) > 0.01F;
   }

   @Override
   public void O00000000(O0000O000O0O0 o0000O000O0O0) {
      this.O00000000000();
      this.O0000000000O0 = false;
   }

   @Override
   public void O000000000(O0000O000O0O0 o0000O000O0O0) {
      this.O00000000000();
   }

   @Override
   public float O00000000(Module module, O0000O00000 o0000O00000, O0000O000O0O0 o0000O000O0O0) {
      return o0000O00000.O00000000(386.0F);
   }

   @Override
   public void O00000000(Module module, O0000O000O0O0 o0000O000O0O0, O0000O000O0O00 o0000O000O0O00, O0000O000O0O00 o0000O000O0O002) {
      if (module instanceof AutoBuy var5) {
         boolean var6 = !o0000O000O0O0.O00000000OOOOO();
         boolean var7 = var6 && (o0000O000O0O0.O00000000O0O().contains(module) || o0000O000O0O0.O00000000OO0());
         long var8 = o0000O000O0O0.O00000000OO0() ? o0000O000O0O0.O0000000O0O0OO() : o0000O000O0O0.O0000000000(module);
         long var10 = System.currentTimeMillis();
         o0000O000O0O0.O000000000(O0000O000O00O0.O0000000000OOO(), var7 ? 1.0F : 0.0F, var7 ? o0000O000O0O00 : O0000000000);
         List var12 = this.O000000000(var5, this.O000000000OOO.O000000000000);
         int var13 = Math.min(var12.size(), 80);

         for (int var14 = 0; var14 < var13; var14++) {
            O0000O000O0.W335 var15;
            float var10000;
            label115: {
               label114: {
                  var15 = (O0000O000O0.W335)var12.get(var14);
                  if (var7 && this.O00000000O0OO == 0) {
                     if (var8 <= 0L) {
                        break label114;
                     }

                     if (var10 - var8 >= 12L * var14) {
                        break label114;
                     }
                  }

                  var10000 = 0.0F;
                  break label115;
               }

               var10000 = 1.0F;
            }

            float var16 = var10000;
            o0000O000O0O0.O000000000(O0000O000O00O0.O00000000(var15.key()), var16, var16 > 0.0F ? o0000O000O0O00 : O0000000000);
         }

         List var18 = this.O000000000();

         for (int var19 = 0; var19 < var18.size(); var19++) {
            String var21 = (String)var18.get(var19);
            float var17 = !var7 || this.O00000000O0OO != 0 || var8 > 0L && var10 - var8 < 24L * var19 + 70L ? 0.0F : 1.0F;
            o0000O000O0O0.O000000000(O0000O000O00O0.O000000000(var21), var17, var17 > 0.0F ? o0000O000O0O00 : O0000000000);
         }

         for (int var20 = 0; var20 < this.O00000000000OO.size(); var20++) {
            O0000O000O0.W336 var22 = this.O00000000000OO.get(var20);
            float var23 = !var7 || this.O00000000O0OO != 2 || var8 > 0L && var10 - var8 < 24L * var20 + 70L ? 0.0F : 1.0F;
            o0000O000O0O0.O000000000("cfg_entry:" + var22.name(), var23, var23 > 0.0F ? o0000O000O0O00 : O0000000000);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void O00000000(
      RenderManager o0000O00OO0O0, DrawContext drawContext, O0000O000O0O0 o0000O000O0O0, O0000O00000000 o0000O00000000, O0000O000O0OOO o0000O000O0OOO
   ) {
      if (o0000O00000000.O00000000() instanceof AutoBuy var6) {
         if (this.O00000000O0OO == 2 && !this.O0000000000O0) {
            this.O00000000(var6);
            this.O0000000000O0 = true;
         }

         O0000O00000 var14 = o0000O000O0OOO.O000000000000();
         O0000O000O0.W338 var8 = this.O00000000(o0000O00000000, var14);
         if (!(var8.width() <= 1.0F) && !(var8.height() <= 1.0F)) {
            float var9 = var14.O00000000(4.0F);
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(
               var8.x() - var9,
               var8.y() - var9,
               var8.width() + var9 * 2.0F,
               var8.height() + var9 * 2.0F,
               var14.O00000000(10.0F),
               var14.O00000000(10.0F),
               var14.O00000000(10.0F),
               var14.O00000000(10.0F)
            );
            boolean var12 = false /* VF: Semaphore variable */;

            try {
               var12 = true;
               this.O00000000(o0000O00OO0O0, o0000O000O0O0, var6, var8, o0000O000O0OOO);
               if (this.O00000000O0OO == 1) {
                  this.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, var6, var8, o0000O000O0OOO);
                  var12 = false;
               } else if (this.O00000000O0OO == 2) {
                  this.O000000000(o0000O00OO0O0, o0000O000O0O0, var6, var8, o0000O000O0OOO);
                  var12 = false;
               } else {
                  this.O000000000(o0000O00OO0O0, drawContext, o0000O000O0O0, var6, var8, o0000O000O0OOO);
                  this.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, var8, o0000O000O0OOO);
                  var12 = false;
               }
            } finally {
               if (var12) {
                  o0000O00OO0O0.O0000000000();
                  o0000O00OO0O0.O0000000000000();
               }
            }

            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
            this.O000000000000(o0000O000O0O0);
         }
      }
   }

   @Override
   public void O00000000(List<O00000OOOOOO> list, O0000O000O0O0 o0000O000O0O0, O0000O00000000 o0000O00000000, O0000O00000 o0000O00000) {
      if (o0000O00000000.O00000000() instanceof AutoBuy var5) {
         if (this.O00000000O0OO == 2 && !this.O0000000000O0) {
            this.O00000000(var5);
            this.O0000000000O0 = true;
         }

         O0000O000O0.W338 var7 = this.O00000000(o0000O00000000, o0000O00000);
         if (!(var7.height() <= o0000O00000.O00000000(40.0F))) {
            this.O00000000(list, var5, var7, o0000O00000);
            if (this.O00000000O0OO == 1) {
               this.O0000000000(list, var7, o0000O00000);
            } else if (this.O00000000O0OO == 2) {
               this.O0000000000(list, var5, var7, o0000O00000);
            } else {
               this.O000000000(list, var5, var7, o0000O00000);
               this.O00000000(list, o0000O000O0O0, var7, o0000O00000);
            }

            list.add(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(var7.x())
                  .O000000000(var7.y())
                  .O0000000000(var7.width())
                  .O00000000000(var7.height())
                  .O00000000(o0000O000O0O0x -> {
                     o0000O000O0O0x.O00000000000O(false);
                     if (!this.O00000000(o0000O000O0O0x.O0000000OOO000()) && this.O00000000000(o0000O000O0O0x) == null) {
                        o0000O000O0O0x.O00000000((NumberSetting)null);
                     }
                  })
                  .O00000000()
            );
         }
      }
   }

   @Override
   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, O0000O0000000 o0000O0000000, O0000O00000 o0000O00000, float f, float g, double d) {
      for (O0000O00000000 var9 : o0000O0000000.O000000000()) {
         if (var9.O00000000() instanceof AutoBuy var10 && (o0000O000O0O0.O00000000O0O().contains(var9.O00000000()) || o0000O000O0O0.O00000000OO0())) {
            O0000O000O0.W338 var12 = this.O00000000(var9, o0000O00000);
            if (this.O00000000O0OO == 1) {
               if (O0000O00000OO.O00000000(f, g, var12.x(), var12.panelY(), var12.width(), var12.panelH())) {
                  this.O00000000(this.O0000000000OOO, this.O00000000000(var12, o0000O00000), d);
                  return true;
               }

               return false;
            }

            if (this.O00000000O0OO == 2) {
               if (O0000O00000OO.O00000000(f, g, var12.x(), var12.panelY(), var12.width(), var12.panelH())) {
                  this.O00000000(this.O000000000O, this.O000000000000(var12, o0000O00000), d);
                  return true;
               }

               return false;
            }

            if (O0000O00000OO.O00000000(f, g, var12.leftX(), var12.panelY(), var12.leftW(), var12.panelH())) {
               this.O00000000(this.O0000000000OO, this.O00000000(var10, var12, o0000O00000), d);
               return true;
            }

            if (O0000O00000OO.O00000000(f, g, var12.rightX(), var12.panelY(), var12.rightW(), var12.panelH())) {
               this.O00000000(this.O0000000000OO0, this.O0000000000(var12, o0000O00000), d);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, float f, float g) {
      if (this.O00000000O != null) {
         this.O00000000(this.O00000000O, f, o0000O000O0O0);
         return true;
      } else if (this.O00000000O0OO == 1) {
         if (this.O00000000O0O0 && this.O00000000O00O.visible()) {
            this.O000000000("history", g, this.O00000000O00O);
            return true;
         } else {
            return false;
         }
      } else if (this.O00000000O0OO == 2) {
         if (this.O00000000O0O00 && this.O00000000O00O0.visible()) {
            this.O000000000("cloud", g, this.O00000000O00O0);
            return true;
         } else {
            return false;
         }
      } else if (this.O00000000O00OO && this.O00000000O0000.visible()) {
         this.O000000000("catalog", g, this.O00000000O0000);
         return true;
      } else if (this.O00000000O0O && this.O00000000O000O.visible()) {
         this.O000000000("rules", g, this.O00000000O000O);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean O0000000000(O0000O000O0O0 o0000O000O0O0) {
      boolean var2 = this.O00000000O00OO || this.O00000000O0O || this.O00000000O0O0 || this.O00000000O0O00 || this.O00000000O != null;
      this.O00000000O00OO = false;
      this.O00000000O0O = false;
      this.O00000000O0O0 = false;
      this.O00000000O0O00 = false;
      this.O00000000O = null;
      return var2;
   }

   @Override
   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, int i) {
      if (o0000O000O0O0.O0000000OOO000() == this.O000000000OOO) {
         if (i == 256 || i == 257) {
            o0000O000O0O0.O00000000((NumberSetting)null);
            return true;
         } else if (i == 259 && !this.O000000000OOO.O000000000000.isEmpty()) {
            this.O000000000OOO.O000000000000 = this.O000000000OOO.O000000000000.substring(0, this.O000000000OOO.O000000000000.length() - 1);
            this.O0000000000();
            return true;
         } else if (i == 261 && !this.O000000000OOO.O000000000000.isEmpty()) {
            this.O000000000OOO.O000000000000 = "";
            this.O0000000000();
            return true;
         } else {
            return true;
         }
      } else {
         String var3 = this.O00000000000(o0000O000O0O0);
         if (var3 != null) {
            TextSetting var6 = this.O0000000000O00.get(var3);
            if (i == 256 || i == 257) {
               o0000O000O0O0.O00000000((NumberSetting)null);
               return true;
            } else if (i == 259 && !var6.O000000000000.isEmpty()) {
               var6.O000000000000 = var6.O000000000000.substring(0, var6.O000000000000.length() - 1);
               return true;
            } else {
               return true;
            }
         } else {
            String var4 = this.O0000000000000(o0000O000O0O0);
            if (var4 == null) {
               return false;
            } else {
               TextSetting var5 = this.O000000000OOO0.get(var4);
               if (i == 256 || i == 257) {
                  o0000O000O0O0.O00000000((NumberSetting)null);
                  o0000O000O0O0.O00000000O000O();
                  return true;
               } else if (i == 259 && !var5.O000000000000.isEmpty()) {
                  var5.O000000000000 = var5.O000000000000.substring(0, var5.O000000000000.length() - 1);
                  this.O00000000(var4, var5.O000000000000, o0000O000O0O0);
                  return true;
               } else if (i == 261) {
                  var5.O000000000000 = "";
                  this.O00000000(var4, var5.O000000000000, o0000O000O0O0);
                  return true;
               } else {
                  return true;
               }
            }
         }
      }
   }

   @Override
   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, char c) {
      if (o0000O000O0O0.O0000000OOO000() == this.O000000000OOO) {
         if (!Character.isISOControl(c) && this.O000000000OOO.O000000000000.length() < 64) {
            this.O000000000OOO.O000000000000 = this.O000000000OOO.O000000000000 + c;
            this.O0000000000();
         }

         return true;
      } else {
         String var3 = this.O00000000000(o0000O000O0O0);
         if (var3 != null) {
            TextSetting var6 = this.O0000000000O00.get(var3);
            if (!Character.isISOControl(c) && var6.O000000000000.length() < 25 && String.valueOf(c).matches("[a-zA-Z0-9_\\- ]")) {
               var6.O000000000000 = var6.O000000000000 + c;
            }

            return true;
         } else {
            String var4 = this.O0000000000000(o0000O000O0O0);
            if (var4 == null) {
               return false;
            } else {
               if (Character.isDigit(c)) {
                  TextSetting var5 = this.O000000000OOO0.get(var4);
                  if (var5.O000000000000.length() < 12) {
                     var5.O000000000000 = var5.O000000000000 + c;
                     this.O00000000(var4, var5.O000000000000, o0000O000O0O0);
                  }
               }

               return true;
            }
         }
      }
   }

   private void O00000000(AutoBuy o000000OO00O0O) {
      this.O00000000000OO.clear();
      File var2 = o000000OO00O0O.O000000000O0();
      if (var2.exists()) {
         File[] var3 = var2.listFiles((file, string) -> string.endsWith(".json"));
         if (var3 != null) {
            String var4 = "Игрок";

            try {
               String var5 = Profile.getUsername();
               if (var5 != null) {
                  var4 = var5;
               }
            } catch (Throwable var10) {
               if (MinecraftClient.getInstance().getSession() != null) {
                  var4 = MinecraftClient.getInstance().getSession().getUsername();
               }
            }

            for (File var8 : var3) {
               String var9 = var8.getName().replace(".json", "");
               this.O00000000000OO.add(new O0000O000O0.W336(var9, var4, var8.lastModified()));
            }

            this.O00000000000OO.sort((o000000000, o0000000002) -> Long.compare(o0000000002.timestamp, o000000000.timestamp));
         }
      }
   }

   private String O00000000000(O0000O000O0O0 o0000O000O0O0) {
      TextSetting var2 = o0000O000O0O0.O0000000OOO000();
      if (var2 == null) {
         return null;
      } else {
         for (Entry var4 : this.O0000000000O00.entrySet()) {
            if (var4.getValue() == var2) {
               return (String)var4.getKey();
            }
         }

         return null;
      }
   }

   private O0000O000O0.W335 O00000000(AutoBuy o000000OO00O0O, String string) {
      if (string == null) {
         return this.O00000000("");
      } else {
         String var3 = string.replace(' ', ' ').trim();
         var3 = var3.replaceAll("^\\[.*?\\]\\s*", "").trim();
         if (var3.matches("(?i).*\\s+[xхXХ]?\\d+[xхXХ]?$")) {
            int var4 = var3.lastIndexOf(32);
            if (var4 != -1) {
               var3 = var3.substring(0, var4).trim();
            }
         }

         if (var3.matches("(?i)^[xхXХ]?\\d+[xхXХ]?\\s+.*")) {
            int var8 = var3.indexOf(32);
            if (var8 != -1) {
               var3 = var3.substring(var8 + 1).trim();
            }
         }

         String var9 = var3.toLowerCase(Locale.ROOT);

         for (String var6 : O00000000000O) {
            if (var9.contains(var6.toLowerCase(Locale.ROOT))) {
               return new O0000O000O0.W335(var6, var6, ItemStack.EMPTY, true);
            }
         }

         for (O0000O000O0.W335 var11 : this.O000000000(o000000OO00O0O)) {
            if (var9.contains(var11.label().toLowerCase(Locale.ROOT)) || var9.contains(var11.key().toLowerCase(Locale.ROOT))) {
               return var11;
            }
         }

         return this.O00000000(var3);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, AutoBuy o000000OO00O0O, O0000O000O0.W338 o00000000000, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var6 = o0000O000O0OOO.O000000000000();
      ColorScheme var7 = o0000O000O0OOO.O0000000000000();
      O0000O000O0.W342 var8 = this.O00000000(o00000000000, var6);
      float var9 = var8.stripH();
      float var10 = var8.modeX();
      float var11 = var8.modeY();
      float var12 = var8.toggleW();
      float var13 = var8.toggleX();
      float var14 = var8.gap();
      float var15 = var8.tabBtnSize();
      float var16 = var8.chipW();
      float var17 = var10;

      for (String var21 : O0000000000000) {
         boolean var22 = o000000OO00O0O.O000000000O00O.O000000000(var21);
         String var23 = O0000O00000OO.O00000000(var6, FontRegistry.O00000000000, var21, 10.0F, var16 - var6.O00000000(10.0F));
         float var24 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var23, 10.0F);
         String var25 = O0000O000O00O0.O0000000000000("mode:" + var21);
         float var26 = o0000O000O0O0.O00000000(
            var25, O0000O00000OO.O00000000(o0000O000O0O0, var17, var11, var16, var9) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO()
         );
         o0000O00OO0O0.O00000000(O0000O00000OO.O00000000(var26, o0000O000O0O0.O000000000(var25), 0.016F, 0.006F), var17 + var16 * 0.5F, var11 + var9 * 0.5F);

         try {
            o0000O00OO0O0.O00000000(
               var17, var11, var16, var9, var6.O00000000(8.0F), ColorScheme.O00000000(var7.O00000000000O(), var7.O00000000000OO(), var26 * 0.7F)
            );
            o0000O00OO0O0.O00000000(
               var17,
               var11,
               var16,
               var9,
               var6.O00000000(8.0F),
               ColorScheme.O00000000(var7.O00000000000OO(), ColorScheme.O00000000(var7.O000000000O0(), 90), var22 ? 0.72F : var26),
               0.5F
            );
            if (var22) {
               o0000O00OO0O0.O00000000(
                  var17 + var6.O00000000(4.0F),
                  var11 + var6.O00000000(4.0F),
                  var16 - var6.O00000000(8.0F),
                  var9 - var6.O00000000(8.0F),
                  var6.O00000000(4.0F),
                  ColorScheme.O00000000(var7.O000000000O00(), 48),
                  ColorScheme.O00000000(var7.O000000000O0(), 44)
               );
            }

            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var6,
               FontRegistry.O00000000000,
               var17 + (var16 - var24) * 0.5F,
               var11,
               var9,
               10.0F,
               var23,
               var22 ? var7.O000000000O0() : ColorScheme.O00000000(var7.O0000000000OO0(), var7.O0000000000OOO(), var26)
            );
         } finally {
            o0000O00OO0O0.O00000000000O0();
         }

         var17 += var16 + var14;
      }

      this.O00000000(o0000O00OO0O0, o0000O000O0O0, "catalog_tab", this.O00000000O0OO == 0, var17, var11, var15, "W", o0000O000O0OOO);
      var17 += var15 + var14;
      this.O00000000(o0000O00OO0O0, o0000O000O0O0, "history_tab", this.O00000000O0OO == 1, var17, var11, var15, "E", o0000O000O0OOO);
      var17 += var15 + var14;
      this.O00000000(o0000O00OO0O0, o0000O000O0O0, "cloud_tab", this.O00000000O0OO == 2, var17, var11, var15, "Y", o0000O000O0OOO);
      if (var8.showReparse()) {
         this.O00000000(o0000O00OO0O0, o0000O000O0O0, o000000OO00O0O, var8, o0000O000O0OOO);
      }

      float var33 = var12 * 0.5F;
      float var34 = o0000O000O0O0.O00000000(
         O0000O000O00O0.O0000000000000("toggle:inactive"),
         O0000O00000OO.O00000000(o0000O000O0O0, var13, var11, var33, var9) ? 1.0F : 0.0F,
         O0000O000O0O00.O00000000000OO()
      );
      float var35 = o0000O000O0O0.O00000000(
         O0000O000O00O0.O0000000000000("toggle:active"),
         O0000O00000OO.O00000000(o0000O000O0O0, var13 + var33, var11, var33, var9) ? 1.0F : 0.0F,
         O0000O000O0O00.O00000000000OO()
      );
      float var36 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000(o000000OO00O0O));
      float var37 = var6.O00000000(2.0F);
      float var38 = var33 - var37 * 2.0F;
      float var39 = var9 - var37 * 2.0F;
      float var40 = var13 + var37 + var33 * var36;
      float var41 = var11 + var37;
      int var27 = ColorScheme.O00000000(ColorScheme.O00000000(var7.O000000000(), 30), ColorScheme.O00000000(var7.O00000000(), 24), var36);
      int var28 = ColorScheme.O00000000(ColorScheme.O00000000(var7.O000000000(), 16), ColorScheme.O00000000(var7.O000000000O0(), 24), var36);
      o0000O00OO0O0.O00000000(
         var13, var11, var12, var9, var6.O00000000(8.0F), ColorScheme.O00000000(var7.O00000000000O(), var7.O00000000000O0(), Math.max(var34, var35) * 0.45F)
      );
      o0000O00OO0O0.O00000000(
         var13 + var6.O00000000(1.0F),
         var11 + var6.O00000000(1.0F),
         var12 - var6.O00000000(2.0F),
         var9 - var6.O00000000(2.0F),
         var6.O00000000(7.0F),
         ColorScheme.O00000000(0, 0, 0, 18)
      );
      o0000O00OO0O0.O00000000(var40, var41, var38, var39, var6.O00000000(6.0F), var27, var28);
      o0000O00OO0O0.O00000000(
         var13, var11, var12, var9, var6.O00000000(8.0F), ColorScheme.O00000000(var7.O00000000000OO(), var7.O0000000000O0(), Math.max(var35, var34)), 0.5F
      );
      o0000O00OO0O0.O00000000(
         var40,
         var41,
         var38,
         var39,
         var6.O00000000(6.0F),
         ColorScheme.O00000000(ColorScheme.O00000000(var7.O000000000(), 72), ColorScheme.O00000000(var7.O00000000(), 68), var36),
         0.5F
      );
      this.O00000000(
         o0000O00OO0O0,
         var6,
         FontRegistry.O00000000,
         var13,
         var11,
         var33,
         var9,
         11.0F,
         "Пауза",
         ColorScheme.O00000000(ColorScheme.O00000000(var7.O000000000(), 145), var7.O0000000000OO0(), var36 * 0.82F)
      );
      this.O00000000(
         o0000O00OO0O0,
         var6,
         FontRegistry.O00000000,
         var13 + var33,
         var11,
         var33,
         var9,
         11.0F,
         "Активен",
         ColorScheme.O00000000(var7.O0000000000OO0(), ColorScheme.O00000000(var7.O00000000(), 145), var36)
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, AutoBuy o000000OO00O0O, O0000O000O0.W342 o00000000000O, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var6 = o0000O000O0OOO.O000000000000();
      ColorScheme var7 = o0000O000O0OOO.O0000000000000();
      boolean var8 = o000000OO00O0O.O000000000O0OO.O0000000000();
      float var9 = o00000000000O.reparseX();
      float var10 = o00000000000O.modeY();
      float var11 = o00000000000O.stripH();
      float var12 = o00000000000O.reparseToggleW();
      float var13 = o00000000000O.reparseSliderX();
      float var14 = o00000000000O.reparseSliderW();
      float var15 = o0000O000O0O0.O00000000(
         O0000O000O00O0.O0000000000000("reparse:toggle"),
         O0000O00000OO.O00000000(o0000O000O0O0, var9, var10, var12, var11) ? 1.0F : 0.0F,
         O0000O000O0O00.O00000000000OO()
      );
      float var16 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000000("reparse:active"), var8 ? 1.0F : 0.0F, O00000000);
      int var17 = ColorScheme.O00000000(var7.O00000000000O0(), ColorScheme.O00000000(24, 140, 72, 72), var16);
      int var18 = ColorScheme.O00000000(var7.O00000000000OO(), ColorScheme.O00000000(var7.O00000000(), 95), var16);
      o0000O00OO0O0.O00000000(var9, var10, var12, var11, var6.O00000000(8.0F), ColorScheme.O00000000(var17, var7.O0000000000O0(), var15 * 0.45F));
      o0000O00OO0O0.O00000000(var9, var10, var12, var11, var6.O00000000(8.0F), ColorScheme.O00000000(var18, var7.O0000000000O0(), var15), 0.5F);
      this.O00000000(
         o0000O00OO0O0,
         var6,
         FontRegistry.O00000000000,
         var9,
         var10,
         var12,
         var11,
         10.0F,
         "ReParse",
         var8 ? ColorScheme.O00000000(var7.O00000000(), 180) : var7.O0000000000OOO()
      );
      float var19 = o0000O000O0O0.O00000000(
         O0000O000O00O0.O0000000000000("reparse:slider"),
         O0000O00000OO.O00000000(o0000O000O0O0, var13, var10, var14, var11) ? 1.0F : 0.0F,
         O0000O000O0O00.O00000000000OO()
      );
      float var20 = o000000OO00O0O.O000000000OO.O0000000000();
      float var21 = this.O00000000(var20, o000000OO00O0O.O000000000OO.O000000000000, o000000OO00O0O.O000000000OO.O0000000000000);
      float var22 = var13 + var6.O00000000(8.0F);
      float var23 = var10 + var6.O00000000(21.0F);
      float var24 = Math.max(var6.O00000000(28.0F), var14 - var6.O00000000(16.0F));
      float var25 = var6.O00000000(4.0F);
      o0000O00OO0O0.O00000000(
         var13, var10, var14, var11, var6.O00000000(8.0F), ColorScheme.O00000000(var7.O00000000000O(), var7.O00000000000OO(), var19 * 0.7F)
      );
      o0000O00OO0O0.O00000000(var13, var10, var14, var11, var6.O00000000(8.0F), ColorScheme.O00000000(var7.O00000000000OO(), var7.O0000000000O0(), var19), 0.5F);
      o0000O00OO0O0.O00000000(var22, var23, var24, var25, var6.O00000000(3.0F), var7.O0000000000O0());
      o0000O00OO0O0.O00000000(
         var22,
         var23,
         var24 * var21,
         var25,
         var6.O00000000(3.0F),
         ColorScheme.O00000000(var7.O000000000O00(), 110),
         ColorScheme.O00000000(var7.O000000000O0(), 130)
      );
      float var26 = var22 + var24 * var21;
      o0000O00OO0O0.O00000000(
         var26 - var6.O00000000(2.5F),
         var23 - var6.O00000000(2.0F),
         var6.O00000000(5.0F),
         var6.O00000000(8.0F),
         var6.O00000000(3.0F),
         var8 ? var7.O000000000O0() : var7.O0000000000OOO()
      );
      String var27 = Math.round(var20) + " мин";
      float var28 = O0000O00000OO.O00000000(FontRegistry.O00000000, var27, 9.0F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var6,
         FontRegistry.O00000000,
         var13 + (var14 - var28) * 0.5F,
         var10 + var6.O00000000(5.0F),
         var6.O00000000(10.0F),
         9.0F,
         var27,
         var8 ? var7.O000000000O0() : var7.O0000000000OO0()
      );
   }

   private O0000O000O0.W342 O00000000(O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      float var3 = o0000O00000.O00000000(34.0F);
      float var4 = o00000000000.x();
      float var5 = o00000000000.y();
      float var6 = o0000O00000.O00000000(150.0F);
      float var7 = o00000000000.x() + o00000000000.width() - var6;
      float var8 = o0000O00000.O00000000(8.0F);
      float var10 = var3 * 3.0F + var8 * 2.0F;
      float var11 = Math.max(0.0F, var7 - var4 - var8);
      float var12 = o0000O00000.O00000000(72.0F) * O0000000000000.length + var8 * (O0000000000000.length - 1.0F);
      float var13 = o0000O00000.O00000000(158.0F);
      float var14 = o0000O00000.O00000000(224.0F);
      boolean var15 = var11 >= var12 + var10 + var8 * 2.0F + var13;
      float var16 = var15 ? Math.min(var14, Math.max(var13, var11 - var12 - var10 - var8 * 2.0F)) : 0.0F;
      float var17 = Math.max(var12, var11 - var10 - (var15 ? var16 + var8 * 2.0F : var8));
      float var18 = 0.0F;

      for (String var22 : O0000000000000) {
         var18 = Math.max(var18, O0000O00000OO.O00000000(FontRegistry.O00000000000, var22, 10.0F));
      }

      float var27 = this.O000000000(
         var18 + o0000O00000.O00000000(24.0F), o0000O00000.O00000000(72.0F), (var17 - var8 * (O0000000000000.length - 1.0F)) / O0000000000000.length
      );
      float var28 = var7 - var8;
      float var29 = var4 + (var27 + var8) * O0000000000000.length + var10;
      if (var29 > var28) {
         var27 = Math.max(o0000O00000.O00000000(24.0F), (var28 - var4 - var10 - var8 * O0000000000000.length) / O0000000000000.length);
      }

      float var30 = var4 + var27 * O0000000000000.length + var8 * O0000000000000.length;
      float var23 = var30 + var10 + var8;
      if (var15) {
         var23 = Math.max(var23, var7 - var8 - var16);
         if (var23 + var16 > var7 - var8) {
            var16 = Math.max(0.0F, var7 - var8 - var23);
            if (var16 < var13 * 0.6F) {
               var15 = false;
               var16 = 0.0F;
            }
         }
      }

      float var24 = var15 ? Math.min(o0000O00000.O00000000(92.0F), Math.max(o0000O00000.O00000000(74.0F), var16 * 0.42F)) : 0.0F;
      float var25 = var23 + var24 + var8;
      float var26 = var15 ? Math.max(o0000O00000.O00000000(64.0F), var16 - var24 - var8) : 0.0F;
      return new O0000O000O0.W342(var3, var4, var5, var7, var6, var8, var3, var27, var15, var23, var16, var24, var25, var26);
   }

   private float O00000000(float f, float g, float h) {
      return this.O000000000((f - g) / Math.max(0.001F, h - g), 0.0F, 1.0F);
   }

   private void O00000000(AutoBuy o000000OO00O0O, float f, float g, float h) {
      float var5 = this.O000000000((f - g) / Math.max(1.0F, h), 0.0F, 1.0F);
      float var6 = o000000OO00O0O.O000000000OO.O000000000000;
      float var7 = o000000OO00O0O.O000000000OO.O0000000000000;
      float var8 = Math.max(1.0F, o000000OO00O0O.O000000000OO.O000000000000O);
      float var9 = var6 + (var7 - var6) * var5;
      float var10 = var6 + (float)O0000O00OO0OO0.O0000000000((double)((var9 - var6) / var8), 0) * var8;
      o000000OO00O0O.O000000000OO.O00000000(var10);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      String string,
      boolean bl,
      float f,
      float g,
      float h,
      String string2,
      O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var10 = o0000O000O0OOO.O000000000000();
      ColorScheme var11 = o0000O000O0OOO.O0000000000000();
      String var12 = O0000O000O00O0.O0000000000000("tab:" + string);
      float var13 = o0000O000O0O0.O00000000(var12, O0000O00000OO.O00000000(o0000O000O0O0, f, g, h, h) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO());
      o0000O00OO0O0.O00000000(O0000O00000OO.O00000000(var13, o0000O000O0O0.O000000000(var12)), f + h * 0.5F, g + h * 0.5F);

      try {
         o0000O00OO0O0.O00000000(f, g, h, h, var10.O00000000(8.0F), ColorScheme.O00000000(var11.O00000000000O(), var11.O00000000000OO(), var13 * 0.7F));
         o0000O00OO0O0.O00000000(
            f,
            g,
            h,
            h,
            var10.O00000000(8.0F),
            ColorScheme.O00000000(var11.O00000000000OO(), ColorScheme.O00000000(var11.O000000000O0(), 90), bl ? 0.72F : var13),
            2.0F
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var10,
            FontRegistry.O00000000000O,
            f + h * 0.5F - O0000O00000OO.O00000000(FontRegistry.O00000000000O, string2, 12.0F) * 0.5F,
            g,
            h,
            12.0F,
            string2,
            bl ? var11.O000000000O0() : ColorScheme.O00000000(var11.O0000000000OO0(), var11.O0000000000OOO(), var13)
         );
      } finally {
         o0000O00OO0O0.O00000000000O0();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      String string,
      float f,
      float g,
      float h,
      String string2,
      boolean bl,
      boolean bl2,
      O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var11 = o0000O000O0OOO.O000000000000();
      ColorScheme var12 = o0000O000O0OOO.O0000000000000();
      String var13 = O0000O000O00O0.O0000000000000("iconBtn:" + string);
      float var14 = o0000O000O0O0.O00000000(var13, O0000O00000OO.O00000000(o0000O000O0O0, f, g, h, h) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO());
      o0000O00OO0O0.O00000000(O0000O00000OO.O00000000(var14, o0000O000O0O0.O000000000(var13)), f + h * 0.5F, g + h * 0.5F);
      boolean var26 = false /* VF: Semaphore variable */;

      try {
         var26 = true;
         int var15 = bl2 ? ColorScheme.O00000000(var12.O000000000O0(), 30) : (bl ? ColorScheme.O00000000(var12.O000000000(), 40) : var12.O00000000000OO());
         int var16 = bl2
            ? ColorScheme.O00000000(var12.O000000000O0(), 90)
            : (bl ? ColorScheme.O00000000(var12.O000000000(), 120) : ColorScheme.O00000000(var12.O000000000O(), 20));
         int var17 = bl ? ColorScheme.O00000000(var12.O000000000(), 70) : var12.O0000000000O0();
         int var18 = bl ? ColorScheme.O00000000(var12.O000000000(), 160) : ColorScheme.O00000000(var12.O000000000O0(), 90);
         int var19 = ColorScheme.O00000000(var15, var17, var14);
         int var20 = ColorScheme.O00000000(var16, var18, var14);
         o0000O00OO0O0.O00000000(f, g, h, h, var11.O00000000(6.0F), var19);
         o0000O00OO0O0.O00000000(f, g, h, h, var11.O00000000(6.0F), var20, 0.5F);
         int var21 = bl2 ? var12.O000000000O0() : var12.O0000000000OOO();
         int var22 = bl ? var12.O000000000() : var12.O000000000O();
         int var23 = ColorScheme.O00000000(var21, var22, var14);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var11,
            FontRegistry.O00000000000O,
            f + h * 0.5F - O0000O00000OO.O00000000(FontRegistry.O00000000000O, string2, 11.0F) * 0.5F,
            g,
            h,
            11.0F,
            string2,
            var23
         );
         var26 = false;
      } finally {
         if (var26) {
            o0000O00OO0O0.O00000000000O0();
         }
      }

      o0000O00OO0O0.O00000000000O0();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O000000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, AutoBuy o000000OO00O0O, O0000O000O0.W338 o00000000000, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var6 = o0000O000O0OOO.O000000000000();
      ColorScheme var7 = o0000O000O0OOO.O0000000000000();
      float var8 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000OOO());
      float var9 = this.O000000000000(o00000000000, var6);
      float var10 = this.O00000000(this.O000000000O, var9);
      this.O000000000O00O = var10 - this.O000000000OO;
      this.O000000000OO = var10;
      float var11 = var6.O00000000(62.0F);
      this.O00000000O00O0 = this.O00000000(
         o00000000000.x() + o00000000000.width() - var6.O00000000(10.0F),
         o00000000000.panelY() + var11,
         o00000000000.scrollbarW(),
         o00000000000.panelH() - var11 - var6.O00000000(10.0F),
         var9,
         var10,
         var6
      );
      o0000O00OO0O0.O00000000(o00000000000.x(), o00000000000.panelY(), o00000000000.width(), o00000000000.panelH(), var6.O00000000(8.0F), var7.O00000000000O());
      o0000O00OO0O0.O00000000(
         o00000000000.x(), o00000000000.panelY(), o00000000000.width(), o00000000000.panelH(), var6.O00000000(8.0F), var7.O00000000000OO(), 0.5F
      );
      this.O00000000(o0000O00OO0O0, o00000000000.x(), o00000000000.panelY(), o00000000000.width(), o00000000000.panelH(), var6, var7, 900);
      float var12 = o00000000000.x() + var6.O00000000(16.0F);
      float var13 = o00000000000.panelY() + var6.O00000000(14.0F);
      o0000O00OO0O0.O000000000000(var8);

      try {
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var6,
            FontRegistry.O00000000000,
            var12,
            var13,
            var6.O00000000(16.0F),
            13.0F,
            "Конфигурации покупаемых предметов",
            var7.O0000000000OOO()
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var6,
            FontRegistry.O00000000,
            var12,
            var13 + var6.O00000000(20.0F),
            var6.O00000000(12.0F),
            10.0F,
            "Загрузите готовый конфиг, чтобы не настраивать каждый предмет вручную.",
            var7.O0000000000OO0()
         );
         float var14 = var6.O00000000(28.0F);
         float var15 = var6.O00000000(8.0F);
         float var16 = o00000000000.x() + o00000000000.width() - var6.O00000000(16.0F) - var14;
         this.O00000000(o0000O00OO0O0, o0000O000O0O0, "cloud_btn_Y", var16, var13, var14, "Y", false, false, o0000O000O0OOO);
         var16 -= var14 + var15;
         this.O00000000(o0000O00OO0O0, o0000O000O0O0, "cloud_btn_R", var16, var13, var14, "R", false, false, o0000O000O0OOO);
         var16 -= var14 + var15;
         this.O00000000(o0000O00OO0O0, o0000O000O0O0, "cloud_btn_T", var16, var13, var14, "T", false, false, o0000O000O0OOO);
      } finally {
         o0000O00OO0O0.O00000000000OO();
      }

      float var70 = o00000000000.x() + var6.O00000000(16.0F);
      float var71 = o00000000000.panelY() + var11;
      float var74 = o00000000000.width() - var6.O00000000(25.0F) - o00000000000.scrollbarW() - var6.O00000000(0.0F);
      float var17 = o00000000000.panelH() - var11 - var6.O00000000(10.0F);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(var70, var71, var74, var17, var6.O00000000(6.0F), var6.O00000000(6.0F), var6.O00000000(6.0F), var6.O00000000(6.0F));
      boolean var52 = false /* VF: Semaphore variable */;

      label346: {
         try {
            var52 = true;
            if (this.O00000000000OO.isEmpty()) {
               o0000O00OO0O0.O000000000000(var8);

               try {
                  float var75 = var71 + var17 * 0.5F - var6.O00000000(6.0F);
                  String var76 = "Конфигурации не найдены";
                  float var77 = O0000O00000OO.O00000000(FontRegistry.O00000000, var76, 12.0F);
                  O0000O00000OO.O00000000(
                     o0000O00OO0O0,
                     var6,
                     FontRegistry.O00000000,
                     var70 + (var74 - var77) * 0.5F,
                     var75 - var6.O00000000(10.0F),
                     var6.O00000000(12.0F),
                     12.0F,
                     var76,
                     var7.O0000000000OO0()
                  );
               } finally {
                  o0000O00OO0O0.O00000000000OO();
               }

               var52 = false;
            } else {
               float var18 = var6.O00000000(58.0F);
               float var19 = var6.O00000000(8.0F);
               float var20 = var74 - var6.O00000000(24.0F);

               for (int var21 = 0; var21 < this.O00000000000OO.size(); var21++) {
                  O0000O000O0.W336 var22 = this.O00000000000OO.get(var21);
                  float var23 = var71 + var10 + var21 * (var18 + var19);
                  float var24 = o0000O000O0O0.O00000000("cfg_entry:" + var22.name);
                  float var25 = Math.min(var24, var8);
                  if (!(var25 <= 0.01F)) {
                     float var26 = (1.0F - var24) * var6.O00000000(12.0F);
                     float var27 = var23 + var26;
                     if (!(var27 > var71 + var17) && !(var27 + var18 < var71)) {
                        TextSetting var28 = this.O0000000000O00.computeIfAbsent(var22.name, string -> new TextSetting("Name", string));
                        boolean var29 = o0000O000O0O0.O0000000OOO000() == var28;
                        if (!var29 && this.O0000000000O0O != null && this.O0000000000O0O.equals(var22.name)) {
                           String var30 = var28.O000000000000.trim();
                           if (!var30.isEmpty() && !var30.equals(var22.name)) {
                              o000000OO00O0O.O00000000(var22.name, var30);
                              if (this.O0000000000O.equals(var22.name)) {
                                 this.O0000000000O = var30;
                              }

                              this.O0000000000O00.remove(var22.name);
                              this.O00000000(o000000OO00O0O);
                              this.O0000000000O0O = null;
                              var52 = false;
                              break label346;
                           }

                           this.O0000000000O0O = null;
                        }

                        if (var29) {
                           this.O0000000000O0O = var22.name;
                        }

                        boolean var78 = this.O0000000000O.equals(var22.name);
                        float var31 = o0000O000O0O0.O00000000("cfg_active:" + var22.name, var78 ? 1.0F : 0.0F, O00000000);
                        float var32 = o0000O000O0O0.O00000000(
                           "cfg_hover:" + var22.name,
                           O0000O00000OO.O00000000(o0000O000O0O0, var70, var27, var20, var18) ? 1.0F : 0.0F,
                           O0000O000O0O00.O00000000000OO()
                        );
                        o0000O00OO0O0.O000000000000(var25);
                        o0000O00OO0O0.O00000000(
                           O0000O00000OO.O00000000(var32, Math.abs(o0000O000O0O0.O000000000("cfg_hover:" + var22.name)), 0.01F, 5.0E-4F),
                           var70 + var20 * 0.5F,
                           var27 + var18 * 0.5F
                        );
                        boolean var57 = false /* VF: Semaphore variable */;

                        try {
                           var57 = true;
                           int var33 = ColorScheme.O00000000(var7.O00000000000O0(), var7.O0000000000O(), var32);
                           int var34 = ColorScheme.O00000000(var33, ColorScheme.O00000000(var7.O000000000O0(), 30), var31 * 0.35F);
                           o0000O00OO0O0.O00000000(var70, var27, var20, var18, var6.O00000000(8.0F), var34);
                           float var35 = var70 + var6.O00000000(16.0F);
                           float var36 = var27 + var6.O00000000(12.0F);
                           int var37 = ColorScheme.O00000000(var7.O000000000O(), var7.O000000000O0(), var31);
                           if (var29) {
                              String var38 = var28.O000000000000;
                              if (System.currentTimeMillis() % 1000L > 500L) {
                                 var38 = var38 + "|";
                              }

                              O0000O00000OO.O00000000(
                                 o0000O00OO0O0, var6, FontRegistry.O00000000000, var35, var36, var6.O00000000(14.0F), 13.0F, var38, var7.O000000000O()
                              );
                           } else {
                              O0000O00000OO.O00000000(
                                 o0000O00OO0O0, var6, FontRegistry.O00000000000, var35, var36, var6.O00000000(14.0F), 13.0F, var22.name, var37
                              );
                           }

                           float var79 = var36 + var6.O00000000(22.0F);
                           O0000O00000OO.O00000000(
                              o0000O00OO0O0,
                              var6,
                              FontRegistry.O00000000000O,
                              var35,
                              var79 - var6.O00000000(0.5F),
                              var6.O00000000(12.0F),
                              8.0F,
                              "r",
                              var7.O0000000000OO0()
                           );
                           float var39 = var35 + var6.O00000000(14.0F);
                           float var40 = O0000O00000OO.O00000000(FontRegistry.O00000000, var22.author, 10.0F);
                           O0000O00000OO.O00000000(
                              o0000O00OO0O0, var6, FontRegistry.O00000000, var39, var79, var6.O00000000(12.0F), 10.0F, var22.author, var7.O0000000000OOO()
                           );
                           var39 += var40 + var6.O00000000(6.0F);
                           O0000O00000OO.O00000000(
                              o0000O00OO0O0, var6, FontRegistry.O00000000000O, var39, var79 + 0.5F, var6.O00000000(12.0F), 6.0F, "k", var7.O0000000000OO0()
                           );
                           var39 += var6.O00000000(12.0F);
                           O0000O00000OO.O00000000(
                              o0000O00OO0O0,
                              var6,
                              FontRegistry.O00000000000O,
                              var39,
                              var79 - var6.O00000000(0.5F),
                              var6.O00000000(12.0F),
                              10.0F,
                              "Q",
                              var7.O0000000000OO0()
                           );
                           var39 += var6.O00000000(14.0F);
                           String var41 = O000000000000.format(new Date(var22.timestamp));
                           O0000O00000OO.O00000000(
                              o0000O00OO0O0, var6, FontRegistry.O00000000, var39, var79, var6.O00000000(12.0F), 10.0F, var41, var7.O0000000000OOO()
                           );
                           float var42 = var6.O00000000(26.0F);
                           float var43 = var6.O00000000(8.0F);
                           float var44 = var70 + var20 + var6.O00000000(8.0F);
                           O0000O00000OO.O00000000(
                              o0000O00OO0O0, var6, FontRegistry.O00000000000O, var44, var27 + (var18 - var42) * 0.5F, var42, 12.0F, "O", var7.O0000000000OOO()
                           );
                           float var45 = var70 + var20 - var6.O00000000(12.0F) - var42;
                           this.O00000000(
                              o0000O00OO0O0,
                              o0000O000O0O0,
                              "cfg_I_" + var22.name,
                              var45,
                              var27 + (var18 - var42) * 0.5F,
                              var42,
                              "I",
                              true,
                              false,
                              o0000O000O0OOO
                           );
                           var45 -= var42 + var43;
                           this.O00000000(
                              o0000O00OO0O0,
                              o0000O000O0O0,
                              "cfg_U_" + var22.name,
                              var45,
                              var27 + (var18 - var42) * 0.5F,
                              var42,
                              "U",
                              false,
                              var78,
                              o0000O000O0OOO
                           );
                           var57 = false;
                        } finally {
                           if (var57) {
                              o0000O00OO0O0.O00000000000O0();
                              o0000O00OO0O0.O00000000000OO();
                           }
                        }

                        o0000O00OO0O0.O00000000000O0();
                        o0000O00OO0O0.O00000000000OO();
                     }
                  }
               }

               var52 = false;
            }
         } finally {
            if (var52) {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }
         }

         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
         O0000O00000OO.O00000000(o0000O00OO0O0, var6, var7, var70, var71, var74, var17, var6.O00000000(6.0F), this.O000000000O00O);
         this.O00000000(o0000O00OO0O0, this.O00000000O00O0, this.O00000000O0O00, this.O000000000O00O, var6, var7);
         return;
      }

      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O0000000000000();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      AutoBuy o000000OO00O0O,
      O0000O000O0.W338 o00000000000,
      O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var7 = o0000O000O0OOO.O000000000000();
      ColorScheme var8 = o0000O000O0OOO.O0000000000000();
      float var9 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000OOO());
      float var10 = this.O00000000000(o00000000000, var7);
      float var11 = this.O00000000(this.O0000000000OOO, var10);
      this.O000000000O000 = var11 - this.O000000000O0OO;
      this.O000000000O0OO = var11;
      int var12 = AutoBuy.O00000000O0O0O.size();
      if (this.O000000000OO0O >= 0 && var12 > this.O000000000OO0O) {
         this.O000000000OO00 = new O0000O0O000(O0000O0O0000.EASE_OUT_CUBIC, 600L);
         this.O000000000OO00.O00000000(1.0);
      }

      this.O000000000OO0O = var12;
      this.O000000000OO00.O00000000(1.0);
      this.O000000000OO0.O00000000(1.0);
      float var13 = this.O000000000((float)this.O000000000OO0.O00000000000O0(), 0.0F, 1.0F);
      float var14 = this.O000000000(1.0F - (float)this.O000000000OO00.O00000000000O0(), 0.0F, 1.0F);
      float var15 = var7.O00000000(42.0F);
      this.O00000000O00O = this.O00000000(
         o00000000000.x() + o00000000000.width() - var7.O00000000(10.0F),
         o00000000000.panelY() + var15,
         o00000000000.scrollbarW(),
         o00000000000.panelH() - var15 - var7.O00000000(10.0F),
         var10,
         var11,
         var7
      );
      o0000O00OO0O0.O00000000(o00000000000.x(), o00000000000.panelY(), o00000000000.width(), o00000000000.panelH(), var7.O00000000(8.0F), var8.O00000000000O());
      o0000O00OO0O0.O00000000(
         o00000000000.x(), o00000000000.panelY(), o00000000000.width(), o00000000000.panelH(), var7.O00000000(8.0F), var8.O00000000000OO(), 0.5F
      );
      this.O00000000(o0000O00OO0O0, o00000000000.x(), o00000000000.panelY(), o00000000000.width(), o00000000000.panelH(), var7, var8, 600);
      float var16 = o00000000000.x() + var7.O00000000(16.0F);
      float var17 = o00000000000.panelY() + var7.O00000000(14.0F);
      o0000O00OO0O0.O000000000000(var9);

      try {
         O0000O00000OO.O00000000(
            o0000O00OO0O0, var7, FontRegistry.O00000000000, var16, var17, var7.O00000000(16.0F), 14.0F, "История покупок", var8.O0000000000OOO()
         );
         float var18 = O0000O00000OO.O00000000(FontRegistry.O00000000000, "История покупок", 14.0F);
         this.O00000000(o0000O00OO0O0, var7, var8, var16 + var18 + var7.O00000000(12.0F), var17, var13, var14, var12);
         float var19 = var7.O00000000(75.0F);
         float var20 = var7.O00000000(20.0F);
         float var21 = o00000000000.x() + o00000000000.width() - var7.O00000000(16.0F) - var19;
         String var22 = "history_clear_all";
         float var23 = o0000O000O0O0.O00000000(
            var22, O0000O00000OO.O00000000(o0000O000O0O0, var21, var17, var19, var20) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO()
         );
         o0000O00OO0O0.O00000000(O0000O00000OO.O00000000(var23, o0000O000O0O0.O000000000(var22)), var21 + var19 * 0.5F, var17 + var20 * 0.5F);
         o0000O00OO0O0.O00000000(
            var21,
            var17,
            var19,
            var20,
            var7.O00000000(6.0F),
            ColorScheme.O00000000(ColorScheme.O00000000(var8.O000000000(), 20), ColorScheme.O00000000(var8.O000000000(), 40), var23)
         );
         o0000O00OO0O0.O00000000(
            var21,
            var17,
            var19,
            var20,
            var7.O00000000(6.0F),
            ColorScheme.O00000000(ColorScheme.O00000000(var8.O000000000(), 60), ColorScheme.O00000000(var8.O000000000(), 120), var23),
            0.5F
         );
         float var24 = O0000O00000OO.O00000000(FontRegistry.O00000000000O, "I", 10.0F);
         float var25 = O0000O00000OO.O00000000(FontRegistry.O00000000, "Очистить", 10.0F);
         float var26 = var7.O00000000(4.0F);
         float var27 = var21 + (var19 - (var24 + var26 + var25)) / 2.0F;
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var7,
            FontRegistry.O00000000000O,
            var27,
            var17,
            var20,
            10.0F,
            "I",
            ColorScheme.O00000000(var8.O0000000000OOO(), var8.O000000000(), var23)
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var7,
            FontRegistry.O00000000,
            var27 + var24 + var26,
            var17,
            var20,
            10.0F,
            "Очистить",
            ColorScheme.O00000000(var8.O0000000000OOO(), var8.O000000000O(), var23)
         );
         o0000O00OO0O0.O00000000000O0();
      } finally {
         o0000O00OO0O0.O00000000000OO();
      }

      float var70 = o00000000000.x() + var7.O00000000(16.0F);
      float var71 = o00000000000.panelY() + var15;
      float var72 = o00000000000.width() - var7.O00000000(20.0F) - o00000000000.scrollbarW();
      float var73 = o00000000000.panelH() - var15 - var7.O00000000(10.0F);
      float var74 = this.O0000000000OOO.O00000000000O();
      float var75 = var72 - var7.O00000000(36.0F);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(var70, var71, var72, var73, var7.O00000000(6.0F), var7.O00000000(6.0F), var7.O00000000(6.0F), var7.O00000000(6.0F));
      boolean var52 = false /* VF: Semaphore variable */;

      try {
         var52 = true;
         if (AutoBuy.O00000000O0O0O.isEmpty()) {
            o0000O00OO0O0.O000000000000(var9);
            boolean var61 = false /* VF: Semaphore variable */;

            try {
               var61 = true;
               String var76 = "История покупок пуста";
               float var78 = O0000O00000OO.O00000000(FontRegistry.O00000000, var76, 12.0F);
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  var7,
                  FontRegistry.O00000000,
                  var70 + (var72 - var78) * 0.5F,
                  var71 + var73 * 0.5F - var7.O00000000(6.0F),
                  var7.O00000000(12.0F),
                  12.0F,
                  var76,
                  var8.O0000000000OO0()
               );
               var61 = false;
            } finally {
               if (var61) {
                  o0000O00OO0O0.O00000000000OO();
               }
            }

            o0000O00OO0O0.O00000000000OO();
            var52 = false;
         } else {
            float var77 = var7.O00000000(42.0F);
            float var79 = var7.O00000000(6.0F);

            for (int var80 = 0; var80 < AutoBuy.O00000000O0O0O.size(); var80++) {
               AutoBuy.W62 var81 = AutoBuy.O00000000O0O0O.get(var80);
               float var28 = var71 + var74 + var80 * (var77 + var79);
               if (!(var28 > var71 + var73) && !(var28 + var77 < var71)) {
                  o0000O00OO0O0.O000000000000(var9);

                  try {
                     o0000O00OO0O0.O00000000(var70, var28, var75, var77, var7.O00000000(8.0F), var8.O00000000000O0());
                     o0000O00OO0O0.O00000000(var70, var28, var75, var77, var7.O00000000(8.0F), var8.O0000000000O(), 0.5F);
                     float var29 = var7.O00000000(28.0F);
                     float var30 = var70 + var7.O00000000(8.0F);
                     float var31 = var28 + (var77 - var29) * 0.5F;
                     O0000O000O0.W335 var32 = this.O00000000(o000000OO00O0O, var81.O000000000);
                     this.O00000000(
                        o0000O00OO0O0,
                        drawContext,
                        var32,
                        var30 + var7.O00000000(6.0F),
                        var31 + var7.O00000000(6.0F),
                        var7.O00000000(16.0F),
                        var9,
                        var70,
                        var71,
                        var72,
                        var73
                     );
                     float var33 = var30 + var29 + var7.O00000000(6.0F);
                     String var35 = "Куплено ";
                     String var36 = (var81.O0000000000 > 1 ? "x" + var81.O0000000000 + " " : "") + var81.O000000000;
                     String var37 = " за ";
                     String var38 = this.O00000000(var81.O00000000000);
                     float var39 = O0000O00000OO.O00000000(FontRegistry.O00000000, var35, 10.0F);
                     float var40 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var36, 10.0F);
                     float var41 = O0000O00000OO.O00000000(FontRegistry.O00000000, var37, 10.0F);
                     O0000O00000OO.O00000000(o0000O00OO0O0, var7, FontRegistry.O00000000, var33, var28, var77, 10.0F, var35, var8.O0000000000OOO());
                     O0000O00000OO.O00000000(
                        o0000O00OO0O0, var7, FontRegistry.O00000000000, var33 + var39, var28 - 1.0F, var77, 10.0F, var36, var8.O000000000O()
                     );
                     O0000O00000OO.O00000000(
                        o0000O00OO0O0, var7, FontRegistry.O00000000, var33 + var39 + var40, var28, var77, 10.0F, var37, var8.O0000000000OOO()
                     );
                     O0000O00000OO.O00000000(
                        o0000O00OO0O0,
                        var7,
                        FontRegistry.O00000000000,
                        var33 + var39 + var40 + var41,
                        var28 - 1.0F,
                        var77,
                        10.0F,
                        var38,
                        ColorScheme.O00000000(var8.O00000000(), 200)
                     );
                     String var42 = O00000000000.format(new Date(var81.O000000000000));
                     float var43 = O0000O00000OO.O00000000(FontRegistry.O00000000, var42, 9.0F);
                     O0000O00000OO.O00000000(
                        o0000O00OO0O0,
                        var7,
                        FontRegistry.O00000000,
                        var70 + var75 - var43 - var7.O00000000(10.0F),
                        var28,
                        var77,
                        9.0F,
                        var42,
                        var8.O0000000000OO0()
                     );
                     O0000O00000OO.O00000000(
                        o0000O00OO0O0,
                        var7,
                        FontRegistry.O00000000000O,
                        var70 + var75 - var43 - var7.O00000000(24.0F),
                        var28 - 1.0F,
                        var77,
                        10.0F,
                        "Q",
                        var8.O0000000000OO0()
                     );
                     float var44 = var7.O00000000(26.0F);
                     float var45 = var70 + var75 + var7.O00000000(6.0F);
                     this.O00000000(
                        o0000O00OO0O0,
                        o0000O000O0O0,
                        "hist_del_" + var81.O000000000000 + "_" + var80,
                        var45,
                        var28 + (var77 - var44) * 0.5F,
                        var44,
                        "I",
                        true,
                        false,
                        o0000O000O0OOO
                     );
                  } finally {
                     o0000O00OO0O0.O00000000000OO();
                  }
               }
            }

            var52 = false;
         }
      } finally {
         if (var52) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }

      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O0000000000000();
      O0000O00000OO.O00000000(o0000O00OO0O0, var7, var8, var70, var71, var72, var73, var7.O00000000(6.0F), this.O000000000O000);
      this.O00000000(o0000O00OO0O0, this.O00000000O00O, this.O00000000O0O0, this.O000000000O000, var7, var8);
   }

   private void O000000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      AutoBuy o000000OO00O0O,
      O0000O000O0.W338 o00000000000,
      O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var7 = o0000O000O0OOO.O000000000000();
      ColorScheme var8 = o0000O000O0OOO.O0000000000000();
      float var9 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000OOO());
      List var10 = this.O000000000(o000000OO00O0O, this.O000000000OOO.O000000000000);
      float var11 = this.O00000000(o000000OO00O0O, o00000000000, var7);
      float var12 = this.O00000000(this.O0000000000OO, var11);
      this.O000000000O0 = var12 - this.O000000000O0O;
      this.O000000000O0O = var12;
      this.O00000000O0000 = this.O00000000(
         o00000000000.catalogScrollbarX(), o00000000000.catalogViewportY(), o00000000000.scrollbarW(), o00000000000.catalogViewportH(), var11, var12, var7
      );
      o0000O00OO0O0.O00000000(
         o00000000000.leftX(), o00000000000.panelY(), o00000000000.leftW(), o00000000000.panelH(), var7.O00000000(8.0F), var8.O00000000000O()
      );
      o0000O00OO0O0.O00000000(
         o00000000000.leftX(), o00000000000.panelY(), o00000000000.leftW(), o00000000000.panelH(), var7.O00000000(8.0F), var8.O00000000000OO(), 0.5F
      );
      this.O00000000(o0000O00OO0O0, o00000000000.leftX(), o00000000000.panelY(), o00000000000.leftW(), o00000000000.panelH(), var7, var8, 0);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var7,
         FontRegistry.O00000000000,
         o00000000000.leftX() + var7.O00000000(12.0F),
         o00000000000.panelY() + var7.O00000000(11.0F),
         var7.O00000000(14.0F),
         12.0F,
         "Каталог предметов",
         var8.O0000000000OOO()
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var7,
         FontRegistry.O00000000,
         o00000000000.leftX() + var7.O00000000(12.0F),
         o00000000000.panelY() + var7.O00000000(28.0F),
         var7.O00000000(12.0F),
         10.0F,
         "ЛКМ по предмету — настроить цену",
         var8.O0000000000OO0()
      );
      this.O00000000(o0000O00OO0O0, o0000O000O0O0, o00000000000, var7, var8);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(
         o00000000000.catalogViewportX(),
         o00000000000.catalogViewportY(),
         o00000000000.catalogViewportW(),
         o00000000000.catalogViewportH(),
         var7.O00000000(6.0F),
         var7.O00000000(6.0F),
         var7.O00000000(6.0F),
         var7.O00000000(6.0F)
      );

      try {
         this.O00000000(o0000O00OO0O0, drawContext, o0000O000O0O0, var10, o00000000000, var7, var8, var12, var9);
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      List<O0000O000O0.W335> list,
      O0000O000O0.W338 o00000000000,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float f,
      float g
   ) {
      int var10 = this.O0000000000000(o00000000000, o0000O00000);
      float var11 = this.O00000000(o0000O00000);
      float var12 = this.O000000000(o0000O00000);
      float var13 = this.O0000000000(o0000O00000);
      int var14 = Math.max(1, (list.size() + var10 - 1) / var10);
      int var15 = Math.max(0, (int)Math.floor(-f / (var12 + var13)) - 1);
      int var16 = Math.min(var14, (int)Math.ceil((o00000000000.catalogViewportH() - f) / (var12 + var13)) + 1);

      for (int var17 = var15; var17 < var16; var17++) {
         for (int var18 = 0; var18 < var10; var18++) {
            int var19 = var17 * var10 + var18;
            if (var19 >= list.size()) {
               break;
            }

            O0000O000O0.W335 var20 = (O0000O000O0.W335)list.get(var19);
            float var21 = o00000000000.catalogViewportX() + var18 * (var11 + var13);
            float var22 = o00000000000.catalogViewportY() + f + var17 * (var12 + var13);
            if (!(var22 > o00000000000.catalogViewportY() + o00000000000.catalogViewportH()) && !(var22 + var12 < o00000000000.catalogViewportY())) {
               float var23 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000(var20.key()));
               if (var19 >= 80) {
                  var23 = g;
               }

               if (!(var23 <= 0.01F)) {
                  float var24 = (1.0F - var23) * o0000O00000.O00000000(9.0F);
                  o0000O00OO0O0.O000000000000(var23);

                  try {
                     this.O00000000(
                        o0000O00OO0O0,
                        drawContext,
                        o0000O000O0O0,
                        var20,
                        var21,
                        var22 + var24,
                        var11,
                        var12,
                        o0000O00000,
                        o0000O000O0OO,
                        Math.min(var23, g),
                        o00000000000.catalogViewportX(),
                        o00000000000.catalogViewportY(),
                        o00000000000.catalogViewportW(),
                        o00000000000.catalogViewportH()
                     );
                  } finally {
                     o0000O00OO0O0.O00000000000OO();
                  }
               }
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      O0000O000O0.W335 o00000000,
      float f,
      float g,
      float h,
      float i,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float j,
      float k,
      float l,
      float m,
      float n
   ) {
      boolean var16 = AutoBuy.O00000000O000O.containsKey(o00000000.key());
      boolean var17 = o00000000.key().equals(this.O000000000OOOO);
      int var18 = AutoBuy.O00000000000O0(o00000000.key());
      int var19 = AutoBuy.O00000000000OO(o00000000.key());
      float var20 = o0000O000O0O0.O00000000(
         O0000O000O00O0.O0000000000(o00000000.key()), O0000O00000OO.O00000000(o0000O000O0O0, f, g, h, i) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO()
      );
      float var21 = o0000O000O0O0.O00000000("ab_settings_tile:" + o00000000.key(), var17 ? 1.0F : 0.0F, O000000000);
      O0000O000O00O var22 = o0000O000O0O0.O00000000O0O0().get(O0000O000O00O0.O0000000000(o00000000.key()));
      float var23 = var22 == null ? 0.0F : Math.abs(var22.O0000000000());
      float var24 = O0000O00000OO.O00000000(var20, var23, 0.04F, 0.014F);
      float var25 = o0000O00000.O00000000(34.0F);
      float var26 = f + (h - var25) * 0.5F;
      float var27 = g + o0000O00000.O00000000(1.0F);
      float var28 = var26 + var25 * 0.5F;
      float var29 = var27 + var25 * 0.5F;
      if (var20 > 0.01F) {
         o0000O00OO0O0.O00000000(
            var26,
            var27,
            var25,
            var25,
            o0000O00000.O00000000(8.0F),
            o0000O00000.O00000000(16.0F) * var20,
            o0000O00000.O00000000(2.0F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(18.0F * var20))
         );
      }

      o0000O00OO0O0.O00000000(var24, var28, var29);
      boolean var36 = false /* VF: Semaphore variable */;

      try {
         var36 = true;
         if (!var16 && !var17) {
            o0000O00OO0O0.O00000000(
               var26,
               var27,
               var25,
               var25,
               o0000O00000.O00000000(8.0F),
               ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), o0000O000O0OO.O00000000000OO(), var20)
            );
         } else {
            o0000O00OO0O0.O000000000(
               var26,
               var27,
               var25,
               var25,
               o0000O00000.O00000000(8.0F),
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(46.0F + 28.0F * var21)),
               ColorScheme.O00000000(o0000O000O0OO.O00000000000O0(), 255)
            );
         }

         o0000O00OO0O0.O00000000(
            var26,
            var27,
            var25,
            var25,
            o0000O00000.O00000000(8.0F),
            ColorScheme.O00000000(
               o0000O000O0OO.O00000000000OO(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 108), Math.max(Math.max(var20, var21), var16 ? 0.55F : 0.0F)
            ),
            0.5F
         );
         ItemStack var30 = o00000000.custom() ? O00000OO000.O00000000(o00000000.key()) : o00000000.stack();
         if (var30 != null && !var30.isEmpty()) {
            this.O00000000(
               o0000O00OO0O0,
               drawContext,
               o00000000,
               var26 + o0000O00000.O00000000(7.0F),
               var27 + o0000O00000.O00000000(7.0F),
               o0000O00000.O00000000(20.0F),
               j,
               k,
               l,
               m,
               n
            );
            var36 = false;
         } else {
            this.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, var26, var27, var25, var25, 12.0F, "?", o0000O000O0OO.O0000000000OO());
            var36 = false;
         }
      } finally {
         if (var36) {
            o0000O00OO0O0.O00000000000O0();
         }
      }

      o0000O00OO0O0.O00000000000O0();
      if (this.O0000000000000(o00000000.key()) && (var18 > 0 || var19 < 100)) {
         String var38 = var18 + "-" + var19 + "%";
         float var31 = o0000O00000.O00000000(13.0F);
         float var32 = Math.max(o0000O00000.O00000000(24.0F), O0000O00000OO.O00000000(FontRegistry.O00000000, var38, 7.5F) + o0000O00000.O00000000(8.0F));
         float var33 = Math.min(var26 + var25 - var32 + o0000O00000.O00000000(4.0F), f + h - var32);
         float var34 = Math.max(g, var27 - o0000O00000.O00000000(5.0F));
         o0000O00OO0O0.O00000000(var33, var34, var32, var31, o0000O00000.O00000000(5.0F), ColorScheme.O00000000(o0000O000O0OO.O000000000000O(), 238));
         o0000O00OO0O0.O00000000(var33, var34, var32, var31, o0000O00000.O00000000(5.0F), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 116), 0.5F);
         this.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            var33,
            var34,
            var32,
            var31,
            7.5F,
            var38,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 205)
         );
      }

      String var39 = O0000O00000OO.O00000000(FontRegistry.O00000000, o00000000.label(), 9.0F, h - o0000O00000.O00000000(6.0F));
      String var40 = O0000O00000OO.O00000000(
         FontRegistry.O00000000,
         var16 ? this.O00000000(AutoBuy.O00000000O000O.getOrDefault(o00000000.key(), 0L)) : "не задано",
         8.5F,
         h - o0000O00000.O00000000(6.0F)
      );
      float var41 = O0000O00000OO.O00000000(FontRegistry.O00000000, var39, 9.0F);
      float var42 = O0000O00000OO.O00000000(FontRegistry.O00000000, var40, 8.5F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f + (h - var41) * 0.5F,
         g + o0000O00000.O00000000(42.0F),
         o0000O00000.O00000000(11.0F),
         9.0F,
         var39,
         ColorScheme.O00000000(o0000O000O0OO.O0000000000OO0(), o0000O000O0OO.O0000000000OOO(), var20)
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f + (h - var42) * 0.5F,
         g + o0000O00000.O00000000(57.0F),
         o0000O00000.O00000000(11.0F),
         8.5F,
         var40,
         var16 ? ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), o0000O000O0OO.O000000000O0(), 0.65F) : o0000O000O0OO.O0000000000OO0()
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO
   ) {
      float var6 = this.O000000000000O(o00000000000, o0000O00000);
      float var7 = this.O00000000000O(o00000000000, o0000O00000);
      float var8 = this.O00000000000O0(o00000000000, o0000O00000);
      float var9 = this.O00000000000(o0000O00000);
      float var10 = o0000O000O0O0.O00000000(
         O0000O000O00O0.O000000000000O("catalog:search"), o0000O000O0O0.O0000000OOO000() == this.O000000000OOO ? 1.0F : 0.0F, O000000000
      );
      float var11 = this.O000000000OOO.O000000000000 != null && !this.O000000000OOO.O000000000000.isBlank() ? 1.0F : 0.0F;
      o0000O00OO0O0.O00000000(
         var6, var7, var8, var9, o0000O00000.O00000000(8.0F), ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), o0000O000O0OO.O00000000000OO(), var10)
      );
      o0000O00OO0O0.O00000000(
         var6,
         var7,
         var8,
         var9,
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(o0000O000O0OO.O00000000000OO(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 105), Math.max(var10, var11 * 0.35F)),
         Math.max(0.75F, o0000O00000.O00000000(0.55F))
      );
      if (var10 > 0.01F) {
         o0000O00OO0O0.O00000000(
            var6,
            var7,
            var8,
            var9,
            o0000O00000.O00000000(8.0F),
            o0000O00000.O00000000(10.0F) * var10,
            o0000O00000.O00000000(1.8F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(14.0F * var10))
         );
      }

      String var12 = this.O000000000OOO.O000000000000 == null ? "" : this.O000000000OOO.O000000000000;
      String var13 = var12.isEmpty() ? "Поиск предметов" : var12;
      if (o0000O000O0O0.O0000000OOO000() == this.O000000000OOO && System.currentTimeMillis() % 1000L > 500L) {
         var13 = var13 + "|";
      }

      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var6 + o0000O00000.O00000000(12.0F),
         var7,
         var9,
         10.5F,
         O0000O00000OO.O00000000(FontRegistry.O00000000, var13, 10.5F, var8 - o0000O00000.O00000000(44.0F)),
         var12.isEmpty() ? o0000O000O0OO.O0000000000OO0() : o0000O000O0OO.O0000000000OOO()
      );
      if (!var12.isEmpty()) {
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O000000000000,
            var6 + var8 - o0000O00000.O00000000(25.0F),
            var7,
            var9,
            10.0F,
            "l",
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 170)
         );
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0, DrawContext drawContext, O0000O000O0O0 o0000O000O0O0, O0000O000O0.W338 o00000000000, O0000O000O0OOO o0000O000O0OOO
   ) {
      O0000O00000 var6 = o0000O000O0OOO.O000000000000();
      ColorScheme var7 = o0000O000O0OOO.O0000000000000();
      float var8 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000OOO());
      List var9 = this.O000000000();
      float var10 = this.O00000000(o00000000000, var6, o0000O000O0O0);
      float var11 = this.O00000000(this.O0000000000OO0, var10);
      this.O000000000O00 = var11 - this.O000000000O0O0;
      this.O000000000O0O0 = var11;
      this.O00000000O000O = this.O00000000(
         o00000000000.rulesScrollbarX(), o00000000000.rulesViewportY(), o00000000000.scrollbarW(), o00000000000.rulesViewportH(), var10, var11, var6
      );
      o0000O00OO0O0.O00000000(
         o00000000000.rightX(), o00000000000.panelY(), o00000000000.rightW(), o00000000000.panelH(), var6.O00000000(8.0F), var7.O00000000000O0()
      );
      o0000O00OO0O0.O00000000(
         o00000000000.rightX(), o00000000000.panelY(), o00000000000.rightW(), o00000000000.panelH(), var6.O00000000(8.0F), var7.O0000000000O00(), 0.75F
      );
      this.O00000000(o0000O00OO0O0, o00000000000.rightX(), o00000000000.panelY(), o00000000000.rightW(), o00000000000.panelH(), var6, var7, 1200);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var6,
         FontRegistry.O00000000000,
         o00000000000.rightX() + var6.O00000000(12.0F),
         o00000000000.panelY() + var6.O00000000(11.0F),
         var6.O00000000(14.0F),
         12.0F,
         "Настроенные предметы",
         var7.O000000000O()
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var6,
         FontRegistry.O00000000,
         o00000000000.rightX() + var6.O00000000(12.0F),
         o00000000000.panelY() + var6.O00000000(28.0F),
         var6.O00000000(12.0F),
         10.0F,
         "Цена, статус, настройки и удаление",
         var7.O0000000000OOO()
      );
      this.O000000000(o0000O00OO0O0, o0000O000O0O0, o00000000000, var6, var7);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(
         o00000000000.rulesViewportX(),
         o00000000000.rulesViewportY(),
         o00000000000.rulesViewportW(),
         o00000000000.rulesViewportH(),
         var6.O00000000(6.0F),
         var6.O00000000(6.0F),
         var6.O00000000(6.0F),
         var6.O00000000(6.0F)
      );
      boolean var31 = false /* VF: Semaphore variable */;

      try {
         var31 = true;
         if (var9.isEmpty()) {
            this.O00000000(o0000O00OO0O0, o00000000000, var6, var7);
            var31 = false;
         } else {
            float var12 = var6.O00000000(6.0F);
            float var13 = o00000000000.rulesViewportX() + var12;
            float var14 = o00000000000.rulesViewportW() - var12 * 2.0F;
            float var15 = o00000000000.rulesViewportY() + var11;

            for (int var16 = 0; var16 < var9.size(); var16++) {
               String var17 = (String)var9.get(var16);
               float var18 = this.O00000000(o0000O000O0O0, var17);
               float var19 = this.O00000000(var17, var6, var18);
               if (!(var15 > o00000000000.rulesViewportY() + o00000000000.rulesViewportH()) && !(var15 + var19 < o00000000000.rulesViewportY())) {
                  float var20 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000(var17));
                  if (var20 <= 0.01F) {
                     var15 += var19 + this.O0000000000000(var6);
                  } else {
                     float var21 = (1.0F - var20) * var6.O00000000(12.0F);
                     o0000O00OO0O0.O000000000000(var20);

                     try {
                        this.O00000000(
                           o0000O00OO0O0,
                           drawContext,
                           o0000O000O0O0,
                           var17,
                           var13,
                           var15 + var21,
                           var14,
                           this.O000000000000(var6),
                           var6,
                           var7,
                           Math.min(var20, var8),
                           o00000000000.rulesViewportX(),
                           o00000000000.rulesViewportY(),
                           o00000000000.rulesViewportW(),
                           o00000000000.rulesViewportH()
                        );
                        if (var18 > 0.01F && this.O0000000000000(var17)) {
                           float var22 = this.O00000000(var17, var6);
                           float var23 = var15 + this.O000000000000(var6) + var6.O00000000(6.0F) * var18 + var21;
                           float var24 = Math.max(var6.O00000000(1.0F), var22 * var18);
                           o0000O00OO0O0.O0000000000();
                           o0000O00OO0O0.O00000000(
                              var13, var23, var14, var24, var6.O00000000(12.0F), var6.O00000000(12.0F), var6.O00000000(12.0F), var6.O00000000(12.0F)
                           );
                           o0000O00OO0O0.O000000000000(var18);
                           boolean var38 = false /* VF: Semaphore variable */;

                           try {
                              var38 = true;
                              this.O000000000(
                                 o0000O00OO0O0,
                                 drawContext,
                                 o0000O000O0O0,
                                 var17,
                                 var13,
                                 var23 - var6.O00000000(7.0F) * (1.0F - var18),
                                 var14,
                                 var22,
                                 var6,
                                 var7,
                                 Math.min(var20, var8) * var18,
                                 o00000000000.rulesViewportX(),
                                 o00000000000.rulesViewportY(),
                                 o00000000000.rulesViewportW(),
                                 o00000000000.rulesViewportH()
                              );
                              var38 = false;
                           } finally {
                              if (var38) {
                                 o0000O00OO0O0.O00000000000OO();
                                 o0000O00OO0O0.O0000000000();
                                 o0000O00OO0O0.O0000000000000();
                              }
                           }

                           o0000O00OO0O0.O00000000000OO();
                           o0000O00OO0O0.O0000000000();
                           o0000O00OO0O0.O0000000000000();
                        }
                     } finally {
                        o0000O00OO0O0.O00000000000OO();
                     }

                     var15 += var19 + this.O0000000000000(var6);
                  }
               } else {
                  var15 += var19 + this.O0000000000000(var6);
               }
            }

            var31 = false;
         }
      } finally {
         if (var31) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }

      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O0000000000000();
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO) {
      String var5 = "Нет настроенных предметов";
      String var6 = "Выберите предмет из каталога";
      float var7 = o00000000000.rulesViewportY() + o00000000000.rulesViewportH() * 0.5F - o0000O00000.O00000000(14.0F);
      float var8 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var5, 12.0F);
      float var9 = O0000O00000OO.O00000000(FontRegistry.O00000000, var6, 10.0F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         o00000000000.rulesViewportX() + (o00000000000.rulesViewportW() - var8) * 0.5F,
         var7,
         o0000O00000.O00000000(14.0F),
         12.0F,
         var5,
         o0000O000O0OO.O0000000000OOO()
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         o00000000000.rulesViewportX() + (o00000000000.rulesViewportW() - var9) * 0.5F,
         var7 + o0000O00000.O00000000(16.0F),
         o0000O00000.O00000000(12.0F),
         10.0F,
         var6,
         o0000O000O0OO.O0000000000OO0()
      );
   }

   private O0000O000O0.W340 O000000000(O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      float var3 = o0000O00000.O00000000(24.0F);
      float var4 = o00000000000.panelY() + o0000O00000.O00000000(12.0F);
      float var5 = o0000O00000.O00000000(38.0F);
      float var6 = o0000O00000.O00000000(38.0F);
      float var7 = o0000O00000.O00000000(122.0F);
      float var8 = o0000O00000.O00000000(6.0F);
      float var9 = o00000000000.rightX() + o00000000000.rightW() - var5 - o0000O00000.O00000000(12.0F);
      float var10 = var9 - var8 - var6;
      float var11 = var10 - var8 - var7;
      boolean var12 = var11 >= o00000000000.rightX() + o0000O00000.O00000000(206.0F);
      return new O0000O000O0.W340(var12, var11, var4, var7, var3, var10, var6, var9, var5);
   }

   private void O000000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO
   ) {
      AutoBuy var6 = AutoBuy.O000000000O;
      if (var6 != null) {
         O0000O000O0.W340 var7 = this.O000000000(o00000000000, o0000O00000);
         if (var7.visible()) {
            boolean var8 = var6.O000000000OOO0.O0000000000();
            boolean var9 = var6.O00000000O.O0000000000();
            O000000OOO0OOO var10 = var6.O000000000O000();
            boolean var11 = var8 && var10.O0000000000O() > 0;
            boolean var12 = var8 && var6.O000000000O00();
            String var13;
            int var14;
            if (!var8) {
               var13 = "Детект: выкл";
               var14 = o0000O000O0OO.O0000000000OO0();
            } else if (!var11) {
               var13 = "Аук: нет данных";
               var14 = o0000O000O0OO.O0000000000OOO();
            } else if (var12) {
               var13 = "Замедлен ~" + var10.O000000000000O() + "мс";
               var14 = o0000O000O0OO.O000000000();
            } else {
               var13 = "Аук ~" + var10.O000000000000O() + "мс";
               var14 = o0000O000O0OO.O00000000();
            }

            float var15 = o0000O000O0O0.O00000000(
               O0000O000O00O0.O0000000000000("lag:chip"),
               O0000O00000OO.O00000000(o0000O000O0O0, var7.chipX(), var7.chipY(), var7.chipW(), var7.chipH()) ? 1.0F : 0.0F,
               O0000O000O0O00.O00000000000OO()
            );
            o0000O00OO0O0.O00000000(
               var7.chipX(),
               var7.chipY(),
               var7.chipW(),
               var7.chipH(),
               o0000O00000.O00000000(8.0F),
               ColorScheme.O00000000(o0000O000O0OO.O00000000000O0(), o0000O000O0OO.O0000000000O0(), var15 * 0.6F)
            );
            o0000O00OO0O0.O00000000(
               var7.chipX(),
               var7.chipY(),
               var7.chipW(),
               var7.chipH(),
               o0000O00000.O00000000(8.0F),
               ColorScheme.O00000000(o0000O000O0OO.O00000000000OO(), ColorScheme.O00000000(var14, 110), var8 ? 0.65F : var15),
               0.5F
            );
            float var16 = o0000O00000.O00000000(6.0F);
            float var17 = var7.chipX() + o0000O00000.O00000000(9.0F);
            float var18 = var7.chipY() + (var7.chipH() - var16) * 0.5F;
            o0000O00OO0O0.O00000000(var17, var18, var16, var16, var16 * 0.5F, var8 ? ColorScheme.O00000000(var14, 200) : o0000O000O0OO.O0000000000OO0());
            String var19 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, var13, 9.0F, var7.chipW() - o0000O00000.O00000000(26.0F));
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000000,
               var17 + var16 + o0000O00000.O00000000(6.0F),
               var7.chipY(),
               var7.chipH(),
               9.0F,
               var19,
               var8 ? ColorScheme.O00000000(var14, 190) : o0000O000O0OO.O0000000000OOO()
            );
            boolean var20 = var6.O000000000OOOO.O0000000000();
            float var21 = o0000O000O0O0.O00000000(
               O0000O000O00O0.O0000000000000("lag:fix"),
               O0000O00000OO.O00000000(o0000O000O0O0, var7.fixX(), var7.chipY(), var7.fixW(), var7.chipH()) ? 1.0F : 0.0F,
               O0000O000O0O00.O00000000000OO()
            );
            float var22 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000000("lag:fixOn"), var20 ? 1.0F : 0.0F, O00000000);
            int var23 = ColorScheme.O00000000(o0000O000O0OO.O00000000000O0(), ColorScheme.O00000000(24, 140, 72, 72), var22);
            int var24 = ColorScheme.O00000000(o0000O000O0OO.O00000000000OO(), ColorScheme.O00000000(o0000O000O0OO.O00000000(), 95), var22);
            o0000O00OO0O0.O00000000(
               var7.fixX(),
               var7.chipY(),
               var7.fixW(),
               var7.chipH(),
               o0000O00000.O00000000(8.0F),
               ColorScheme.O00000000(var23, o0000O000O0OO.O0000000000O0(), var21 * 0.5F)
            );
            o0000O00OO0O0.O00000000(
               var7.fixX(),
               var7.chipY(),
               var7.fixW(),
               var7.chipH(),
               o0000O00000.O00000000(8.0F),
               ColorScheme.O00000000(var24, o0000O000O0OO.O0000000000O0(), var21),
               0.5F
            );
            this.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000000,
               var7.fixX(),
               var7.chipY(),
               var7.fixW(),
               var7.chipH(),
               9.0F,
               "фикс",
               var20 ? ColorScheme.O00000000(o0000O000O0OO.O00000000(), 180) : o0000O000O0OO.O0000000000OOO()
            );
            float var25 = o0000O000O0O0.O00000000(
               O0000O000O00O0.O0000000000000("lag:stat"),
               O0000O00000OO.O00000000(o0000O000O0O0, var7.statX(), var7.chipY(), var7.statW(), var7.chipH()) ? 1.0F : 0.0F,
               O0000O000O0O00.O00000000000OO()
            );
            float var26 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000000("lag:statOn"), var9 ? 1.0F : 0.0F, O00000000);
            int var27 = ColorScheme.O00000000(o0000O000O0OO.O00000000000O0(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 52), var26);
            int var28 = ColorScheme.O00000000(o0000O000O0OO.O00000000000OO(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 110), var26);
            o0000O00OO0O0.O00000000(
               var7.statX(),
               var7.chipY(),
               var7.statW(),
               var7.chipH(),
               o0000O00000.O00000000(8.0F),
               ColorScheme.O00000000(var27, o0000O000O0OO.O0000000000O0(), var25 * 0.5F)
            );
            o0000O00OO0O0.O00000000(
               var7.statX(),
               var7.chipY(),
               var7.statW(),
               var7.chipH(),
               o0000O00000.O00000000(8.0F),
               ColorScheme.O00000000(var28, o0000O000O0OO.O0000000000O0(), var25),
               0.5F
            );
            this.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000000,
               var7.statX(),
               var7.chipY(),
               var7.statW(),
               var7.chipH(),
               9.0F,
               "стат",
               var9 ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O0000000000OOO()
            );
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      String string,
      float f,
      float g,
      float h,
      float i,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float j,
      float k,
      float l,
      float m,
      float n
   ) {
      String var16 = O0000O000O00O0.O00000000000(string);
      float var17 = o0000O000O0O0.O00000000(var16, O0000O00000OO.O00000000(o0000O000O0O0, f, g, h, i) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO());
      boolean var18 = !AutoBuy.O00000000O0O0.contains(string);
      boolean var19 = this.O0000000000000(string);
      o0000O00OO0O0.O00000000(
         f, g, h, i, o0000O00000.O00000000(12.0F), ColorScheme.O00000000(o0000O000O0OO.O000000000000O(), o0000O000O0OO.O0000000000O0(), 0.32F + var17 * 0.16F)
      );
      o0000O00OO0O0.O00000000(
         f,
         g,
         h,
         i,
         o0000O00000.O00000000(12.0F),
         ColorScheme.O00000000(o0000O000O0OO.O0000000000O00(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 118), Math.max(var17, 0.22F)),
         2.0F
      );
      O0000O000O0.W335 var20 = this.O00000000(string);
      float var21 = o0000O00000.O00000000(29.0F);
      float var22 = f + o0000O00000.O00000000(11.0F);
      float var23 = g + (i - var21) * 0.5F;
      o0000O00OO0O0.O00000000(var22, var23, var21, var21, o0000O00000.O00000000(8.0F), o0000O000O0OO.O00000000000O());
      o0000O00OO0O0.O00000000(var22, var23, var21, var21, o0000O00000.O00000000(8.0F), o0000O000O0OO.O0000000000O00(), 0.75F);
      this.O00000000(
         o0000O00OO0O0,
         drawContext,
         var20,
         var22 + o0000O00000.O00000000(6.5F),
         var23 + o0000O00000.O00000000(6.5F),
         o0000O00000.O00000000(16.0F),
         j,
         k,
         l,
         m,
         n
      );
      float var24 = f + h - o0000O00000.O00000000(237.0F) - o0000O00000.O00000000(8.0F);
      float var25 = Math.max(o0000O00000.O00000000(72.0F), var24 - (f + o0000O00000.O00000000(50.0F)));
      this.O00000000(
         o0000O00OO0O0,
         o0000O000O0O0,
         var20.label(),
         string,
         f + o0000O00000.O00000000(50.0F),
         g + o0000O00000.O00000000(12.0F),
         var25,
         Math.max(o0000O00000.O00000000(72.0F), h - o0000O00000.O00000000(120.0F)),
         o0000O00000,
         o0000O000O0OO,
         var18
      );
      String var26 = O0000O00000OO.O00000000(FontRegistry.O00000000, var18 ? "Статус: активен" : "Статус: пауза", 10.0F, var25);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f + o0000O00000.O00000000(50.0F),
         g + o0000O00000.O00000000(32.0F),
         o0000O00000.O00000000(12.0F),
         10.0F,
         var26,
         var18 ? ColorScheme.O00000000(o0000O000O0OO.O00000000(), 176) : o0000O000O0OO.O0000000000OOO()
      );
      float var27 = g + (i - o0000O00000.O00000000(29.0F)) * 0.5F;
      this.O00000000(
         o0000O00OO0O0,
         o0000O000O0O0,
         string,
         f + h - o0000O00000.O00000000(237.0F),
         var27,
         o0000O00000.O00000000(95.0F),
         o0000O00000.O00000000(29.0F),
         o0000O00000,
         o0000O000O0OO
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O000O0O0,
         string,
         f + h - o0000O00000.O00000000(134.0F),
         var27,
         o0000O00000.O00000000(58.0F),
         o0000O00000.O00000000(29.0F),
         o0000O00000,
         o0000O000O0OO,
         var18
      );
      this.O000000000(
         o0000O00OO0O0,
         o0000O000O0O0,
         string,
         f + h - o0000O00000.O00000000(68.0F),
         var27,
         o0000O00000.O00000000(29.0F),
         o0000O00000.O00000000(29.0F),
         o0000O00000,
         o0000O000O0OO
      );
      if (var19) {
         this.O00000000(
            o0000O00OO0O0, o0000O000O0O0, string, f + h - o0000O00000.O00000000(34.0F), var27, o0000O00000.O00000000(29.0F), o0000O00000, o0000O000O0OO
         );
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      String string,
      String string2,
      float f,
      float g,
      float h,
      float i,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      boolean bl
   ) {
      String var12 = string == null ? "" : string;
      float var13 = o0000O00000.O00000000(14.0F);
      float var14 = Math.max(o0000O00000.O00000000(48.0F), h);
      float var15 = Math.max(var14, i);
      float var16 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var12, 12.0F);
      boolean var17 = var16 > var14 + o0000O00000.O00000000(1.0F);
      boolean var18 = var17
         && O0000O00000OO.O00000000(
            o0000O000O0O0,
            f - o0000O00000.O00000000(4.0F),
            g - o0000O00000.O00000000(4.0F),
            var14 + o0000O00000.O00000000(12.0F),
            var13 + o0000O00000.O00000000(8.0F)
         );
      float var19 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000000("rule:name:" + string2), var18 ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO());
      int var20 = bl ? o0000O000O0OO.O000000000O() : o0000O000O0OO.O0000000000OOO();
      String var21 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var12, 12.0F, var14);
      if (var19 < 0.985F) {
         o0000O00OO0O0.O000000000000(1.0F - var19);
         boolean var37 = false /* VF: Semaphore variable */;

         try {
            var37 = true;
            O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, f, g, var13, 12.0F, var21, var20);
            var37 = false;
         } finally {
            if (var37) {
               o0000O00OO0O0.O00000000000OO();
            }
         }

         o0000O00OO0O0.O00000000000OO();
      }

      if (!(var19 <= 0.01F)) {
         float var22 = o0000O00000.O00000000(8.0F);
         float var23 = o0000O00000.O00000000(22.0F);
         float var24 = Math.min(var16, var15);
         float var25 = this.O000000000(var14 + (var24 - var14) * var19, var14, var24);
         float var26 = f - var22;
         float var27 = g - o0000O00000.O00000000(4.0F);
         float var28 = var25 + var22 * 2.0F;
         int var29 = ColorScheme.O00000000(
            ColorScheme.O00000000(o0000O000O0OO.O000000000000O(), 230), ColorScheme.O00000000(o0000O000O0OO.O0000000000O0(), 235), 0.35F
         );
         int var30 = ColorScheme.O00000000(o0000O000O0OO.O0000000000O00(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 132), var19);
         int var31 = bl ? ColorScheme.O00000000(o0000O000O0OO.O0000000000OOO(), o0000O000O0OO.O000000000O(), var19) : o0000O000O0OO.O0000000000OOO();
         o0000O00OO0O0.O000000000000(var19);

         try {
            o0000O00OO0O0.O00000000(
               var26,
               var27,
               var28,
               var23,
               o0000O00000.O00000000(7.0F),
               o0000O00000.O00000000(12.0F) * var19,
               o0000O00000.O00000000(1.6F),
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(16.0F * var19))
            );
            o0000O00OO0O0.O00000000(var26, var27, var28, var23, o0000O00000.O00000000(7.0F), var29);
            o0000O00OO0O0.O00000000(var26, var27, var28, var23, o0000O00000.O00000000(7.0F), var30, 0.75F);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var26,
               var27,
               var28,
               var23,
               o0000O00000.O00000000(7.0F),
               () -> O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  o0000O00000,
                  FontRegistry.O00000000000,
                  f,
                  g,
                  var13,
                  12.0F,
                  O0000O00000OO.O00000000(FontRegistry.O00000000000, var12, 12.0F, var28 - var22 * 2.0F),
                  var31
               )
            );
         } finally {
            o0000O00OO0O0.O00000000000OO();
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      String string,
      float f,
      float g,
      float h,
      float i,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO
   ) {
      TextSetting var10 = this.O000000000000O(string);
      if (o0000O000O0O0.O0000000OOO000() != var10) {
         var10.O000000000000 = this.O00000000000O(string);
      }

      float var11 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000000O(string), o0000O000O0O0.O0000000OOO000() == var10 ? 1.0F : 0.0F, O000000000);
      o0000O00OO0O0.O00000000(
         f, g, h, i, o0000O00000.O00000000(8.0F), ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), o0000O000O0OO.O00000000000OO(), var11)
      );
      o0000O00OO0O0.O00000000(
         f,
         g,
         h,
         i,
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(o0000O000O0OO.O00000000000OO(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 95), var11),
         0.5F
      );
      String var12 = var10.O000000000000.isEmpty() ? "Макс. цена" : this.O00000000(this.O00000000000O0(var10.O000000000000));
      if (o0000O000O0O0.O0000000OOO000() == var10 && System.currentTimeMillis() % 1000L > 500L) {
         var12 = var12 + "|";
      }

      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f + o0000O00000.O00000000(8.0F),
         g,
         i,
         10.0F,
         O0000O00000OO.O00000000(FontRegistry.O00000000, var12, 10.0F, h - o0000O00000.O00000000(16.0F)),
         var10.O000000000000.isEmpty() ? o0000O000O0OO.O0000000000OO0() : o0000O000O0OO.O0000000000OOO()
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      String string,
      float f,
      float g,
      float h,
      float i,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      boolean bl
   ) {
      String var11 = O0000O000O00O0.O0000000000000(string);
      float var12 = o0000O000O0O0.O00000000(var11, O0000O00000OO.O00000000(o0000O000O0O0, f, g, h, i) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO());
      float var13 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000(this.O000000000000O(string)), bl ? 1.0F : 0.0F, O00000000);
      o0000O00OO0O0.O00000000(O0000O00000OO.O00000000(var12, o0000O000O0O0.O000000000(var11), 0.02F, 0.006F), f + h * 0.5F, g + i * 0.5F);

      try {
         o0000O00OO0O0.O00000000(
            f, g, h, i, o0000O00000.O00000000(8.0F), ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), o0000O000O0OO.O00000000000OO(), var12)
         );
         if (bl) {
            o0000O00OO0O0.O00000000(
               f + o0000O00000.O00000000(4.0F),
               g + o0000O00000.O00000000(4.0F),
               h - o0000O00000.O00000000(8.0F),
               i - o0000O00000.O00000000(8.0F),
               o0000O00000.O00000000(6.0F),
               ColorScheme.O00000000(o0000O000O0OO.O00000000(), 20),
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 24)
            );
         }

         float var14 = o0000O00000.O00000000(9.0F);
         float var15 = f + o0000O00000.O00000000(7.0F) + (h - o0000O00000.O00000000(23.0F)) * var13;
         o0000O00OO0O0.O00000000(
            var15,
            g + (i - var14) * 0.5F,
            var14,
            var14,
            var14 * 0.5F,
            bl ? ColorScheme.O00000000(o0000O000O0OO.O00000000(), 180) : o0000O000O0OO.O0000000000OO0()
         );
         String var16 = bl ? "Вкл" : "Выкл";
         float var17 = O0000O00000OO.O00000000(FontRegistry.O00000000, var16, 9.0F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            f + (h - var17) * 0.5F,
            g,
            i,
            9.0F,
            var16,
            bl ? ColorScheme.O00000000(o0000O000O0OO.O00000000(), 122) : o0000O000O0OO.O0000000000OO0()
         );
      } finally {
         o0000O00OO0O0.O00000000000O0();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O000000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      String string,
      float f,
      float g,
      float h,
      float i,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO
   ) {
      String var10 = O0000O000O00O0.O000000000000(string);
      float var11 = o0000O000O0O0.O00000000(var10, O0000O00000OO.O00000000(o0000O000O0O0, f, g, h, i) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO());
      int var12 = ColorScheme.O00000000(o0000O000O0OO.O000000000(), Math.round(22.0F + 46.0F * var11));
      o0000O00OO0O0.O00000000(O0000O00000OO.O00000000(var11, o0000O000O0O0.O000000000(var10), 0.03F, 0.008F), f + h * 0.5F, g + i * 0.5F);
      boolean var18 = false /* VF: Semaphore variable */;

      try {
         var18 = true;
         o0000O00OO0O0.O00000000(f, g, h, i, o0000O00000.O00000000(8.0F), ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), var12, var11));
         o0000O00OO0O0.O00000000(
            f,
            g,
            h,
            i,
            o0000O00000.O00000000(8.0F),
            ColorScheme.O00000000(o0000O000O0OO.O00000000000OO(), ColorScheme.O00000000(o0000O000O0OO.O000000000(), 120), var11),
            0.5F
         );
         int var13 = ColorScheme.O00000000(o0000O000O0OO.O0000000000OO0(), o0000O000O0OO.O000000000(), var11);
         float var14 = f + h * 0.5F;
         float var15 = g + i * 0.5F;
         o0000O00OO0O0.O00000000(
            var14 - o0000O00000.O00000000(4.4F),
            var15 - o0000O00000.O00000000(3.2F),
            o0000O00000.O00000000(8.8F),
            o0000O00000.O00000000(1.3F),
            o0000O00000.O00000000(1.0F),
            var13
         );
         o0000O00OO0O0.O00000000(
            var14 - o0000O00000.O00000000(3.4F),
            var15 - o0000O00000.O00000000(1.2F),
            o0000O00000.O00000000(6.8F),
            o0000O00000.O00000000(6.7F),
            o0000O00000.O00000000(1.5F),
            ColorScheme.O00000000(var13, 160)
         );
         o0000O00OO0O0.O00000000(
            var14 - o0000O00000.O00000000(1.8F),
            var15 - o0000O00000.O00000000(5.1F),
            o0000O00000.O00000000(3.6F),
            o0000O00000.O00000000(1.4F),
            o0000O00000.O00000000(1.0F),
            var13
         );
         var18 = false;
      } finally {
         if (var18) {
            o0000O00OO0O0.O00000000000O0();
         }
      }

      o0000O00OO0O0.O00000000000O0();
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, String string, float f, float g, float h, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO
   ) {
      boolean var9 = string.equals(this.O000000000OOOO);
      String var10 = O0000O000O00O0.O0000000000000("settings:" + string);
      float var11 = o0000O000O0O0.O00000000(var10, O0000O00000OO.O00000000(o0000O000O0O0, f, g, h, h) ? 1.0F : 0.0F, O0000O000O0O00.O00000000000OO());
      float var12 = o0000O000O0O0.O00000000("ab_settings_on:" + string, var9 ? 1.0F : 0.0F, O000000000);
      o0000O00OO0O0.O00000000(O0000O00000OO.O00000000(var11, o0000O000O0O0.O000000000(var10), 0.03F, 0.008F), f + h * 0.5F, g + h * 0.5F);

      try {
         o0000O00OO0O0.O00000000(
            f,
            g,
            h,
            h,
            o0000O00000.O00000000(8.0F),
            ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 34), Math.max(var11 * 0.6F, var12))
         );
         o0000O00OO0O0.O00000000(
            f,
            g,
            h,
            h,
            o0000O00000.O00000000(8.0F),
            ColorScheme.O00000000(o0000O000O0OO.O00000000000OO(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 118), Math.max(var11, var12)),
            0.5F
         );
         int var13 = ColorScheme.O00000000(o0000O000O0OO.O0000000000OO0(), o0000O000O0OO.O000000000O0(), Math.max(var11, var12));
         float var14 = o0000O00000.O00000000(2.4F);
         float var15 = o0000O00000.O00000000(4.2F);
         float var16 = f + h * 0.5F - var15 * 0.5F - var14;
         float var17 = g + h * 0.5F - var15 - var14 * 0.5F;

         for (int var18 = 0; var18 < 3; var18++) {
            for (int var19 = 0; var19 < 2; var19++) {
               o0000O00OO0O0.O00000000(var16 + var19 * var15, var17 + var18 * var15, var14, var14, var14 * 0.5F, var13);
            }
         }
      } finally {
         o0000O00OO0O0.O00000000000O0();
      }
   }

   private void O000000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      O0000O000O0O0 o0000O000O0O0,
      String string,
      float f,
      float g,
      float h,
      float i,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float j,
      float k,
      float l,
      float m,
      float n
   ) {
      float var16 = o0000O000O0O0.O00000000(
         O0000O000O00O0.O0000000000000("settingsPanel:" + string),
         O0000O00000OO.O00000000(o0000O000O0O0, f, g, h, i) ? 1.0F : 0.0F,
         O0000O000O0O00.O00000000000OO()
      );
      o0000O00OO0O0.O00000000(
         f, g, h, i, o0000O00000.O00000000(12.0F), ColorScheme.O00000000(o0000O000O0OO.O000000000000O(), o0000O000O0OO.O0000000000O0(), 0.26F + var16 * 0.08F)
      );
      o0000O00OO0O0.O00000000(
         f,
         g,
         h,
         i,
         o0000O00000.O00000000(12.0F),
         ColorScheme.O00000000(o0000O000O0OO.O0000000000O00(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 108), 0.46F + var16 * 0.25F),
         1.0F
      );
      O0000O000O0.W335 var17 = this.O00000000(string);
      float var18 = o0000O00000.O00000000(34.0F);
      float var19 = f + o0000O00000.O00000000(13.0F);
      float var20 = g + o0000O00000.O00000000(12.0F);
      o0000O00OO0O0.O00000000(var19, var20, var18, var18, o0000O00000.O00000000(9.0F), o0000O000O0OO.O00000000000O());
      o0000O00OO0O0.O00000000(var19, var20, var18, var18, o0000O00000.O00000000(9.0F), o0000O000O0OO.O0000000000O00(), 0.75F);
      this.O00000000(
         o0000O00OO0O0,
         drawContext,
         var17,
         var19 + o0000O00000.O00000000(7.0F),
         var20 + o0000O00000.O00000000(7.0F),
         o0000O00000.O00000000(20.0F),
         j,
         k,
         l,
         m,
         n
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var19 + var18 + o0000O00000.O00000000(10.0F),
         g + o0000O00000.O00000000(12.0F),
         o0000O00000.O00000000(15.0F),
         12.5F,
         "Настройки предмета",
         o0000O000O0OO.O000000000O()
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var19 + var18 + o0000O00000.O00000000(10.0F),
         g + o0000O00000.O00000000(31.0F),
         o0000O00000.O00000000(12.0F),
         10.0F,
         O0000O00000OO.O00000000(FontRegistry.O00000000, var17.label(), 10.0F, h - var18 - o0000O00000.O00000000(86.0F)),
         o0000O000O0OO.O0000000000OOO()
      );
      String var21 = AutoBuy.O00000000000O0(string) + "-" + AutoBuy.O00000000000OO(string) + "%";
      float var22 = Math.max(o0000O00000.O00000000(48.0F), O0000O00000OO.O00000000(FontRegistry.O00000000000, var21, 10.0F) + o0000O00000.O00000000(14.0F));
      o0000O00OO0O0.O00000000(
         f + h - o0000O00000.O00000000(13.0F) - var22,
         g + o0000O00000.O00000000(14.0F),
         var22,
         o0000O00000.O00000000(22.0F),
         o0000O00000.O00000000(7.0F),
         o0000O000O0OO.O00000000000O0()
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         f + h - o0000O00000.O00000000(13.0F) - var22,
         g + o0000O00000.O00000000(14.0F),
         var22,
         o0000O00000.O00000000(22.0F),
         10.0F,
         var21,
         o0000O000O0OO.O000000000O0()
      );
      this.O0000000000(
         o0000O00OO0O0,
         o0000O000O0O0,
         string,
         f + o0000O00000.O00000000(16.0F),
         g + o0000O00000.O00000000(58.0F),
         h - o0000O00000.O00000000(32.0F),
         o0000O00000.O00000000(36.0F),
         o0000O00000,
         o0000O000O0OO
      );
      O0000O000O0.W339 var23 = this.O000000000(string);
      if (!var23.enchantments().isEmpty()) {
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            f + o0000O00000.O00000000(16.0F),
            g + o0000O00000.O00000000(108.0F),
            o0000O00000.O00000000(12.0F),
            9.5F,
            "Зачарования",
            o0000O000O0OO.O0000000000OOO()
         );
         this.O00000000(
            o0000O00OO0O0,
            o0000O000O0O0,
            string,
            var23.enchantments(),
            f + o0000O00000.O00000000(16.0F),
            g + o0000O00000.O00000000(128.0F),
            h - o0000O00000.O00000000(32.0F),
            o0000O00000,
            o0000O000O0OO
         );
      }
   }

   private void O0000000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      String string,
      float f,
      float g,
      float h,
      float i,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO
   ) {
      int var10 = AutoBuy.O00000000000O0(string);
      int var11 = AutoBuy.O00000000000OO(string);
      float var13 = g + o0000O00000.O00000000(22.0F);
      float var15 = o0000O00000.O00000000(5.0F);
      float var16 = f + h * var10 / 100.0F;
      float var17 = f + h * var11 / 100.0F;
      float var18 = o0000O000O0O0.O00000000(
         O0000O000O00O0.O0000000000000("durSlider:" + string),
         O0000O00000OO.O00000000(o0000O000O0O0, f, g, h, i) ? 1.0F : 0.0F,
         O0000O000O0O00.O00000000000OO()
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0, o0000O00000, FontRegistry.O00000000, f, g, o0000O00000.O00000000(12.0F), 10.0F, "Диапазон прочности", o0000O000O0OO.O0000000000OOO()
      );
      o0000O00OO0O0.O00000000(f, var13, h, var15, o0000O00000.O00000000(3.0F), o0000O000O0OO.O0000000000O0());
      o0000O00OO0O0.O00000000(
         var16,
         var13,
         Math.max(o0000O00000.O00000000(3.0F), var17 - var16),
         var15,
         o0000O00000.O00000000(3.0F),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 118),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 150)
      );
      this.O00000000(o0000O00OO0O0, var16, var13 + var15 * 0.5F, var10 == 0 ? o0000O000O0OO.O0000000000OOO() : o0000O000O0OO.O000000000O0(), var18, o0000O00000);
      this.O00000000(
         o0000O00OO0O0, var17, var13 + var15 * 0.5F, var11 == 100 ? o0000O000O0OO.O0000000000OOO() : o0000O000O0OO.O000000000O0(), var18, o0000O00000
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f,
         g + o0000O00000.O00000000(30.0F),
         o0000O00000.O00000000(10.0F),
         8.5F,
         "Мин " + var10 + "%",
         o0000O000O0OO.O0000000000OO0()
      );
      String var19 = "Макс " + var11 + "%";
      float var20 = O0000O00000OO.O00000000(FontRegistry.O00000000, var19, 8.5F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f + h - var20,
         g + o0000O00000.O00000000(30.0F),
         o0000O00000.O00000000(10.0F),
         8.5F,
         var19,
         o0000O000O0OO.O0000000000OO0()
      );
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, int i, float h, O0000O00000 o0000O00000) {
      float var7 = o0000O00000.O00000000(10.0F + h * 1.5F);
      o0000O00OO0O0.O00000000(f - var7 * 0.5F, g - var7 * 0.5F, var7, var7, var7 * 0.5F, ColorScheme.O00000000(i, 230));
      o0000O00OO0O0.O00000000(f - var7 * 0.5F, g - var7 * 0.5F, var7, var7, var7 * 0.5F, ColorScheme.O00000000(255, 255, 255, 44), 0.5F);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      String string,
      String string2,
      String string3,
      boolean bl,
      boolean bl2,
      float f,
      float g,
      float h,
      float i,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO
   ) {
      float var14 = o0000O000O0O0.O00000000(
         O0000O000O00O0.O0000000000000("check:" + string + ":" + string2),
         bl2 && O0000O00000OO.O00000000(o0000O000O0O0, f, g, h, i) ? 1.0F : 0.0F,
         O0000O000O0O00.O00000000000OO()
      );
      int var15 = bl2 ? ColorScheme.O00000000(o0000O000O0OO.O0000000000OOO(), o0000O000O0OO.O000000000O(), var14) : o0000O000O0OO.O0000000000OO0();
      float var16 = o0000O00000.O00000000(13.0F);
      o0000O00OO0O0.O00000000(
         f,
         g + (i - var16) * 0.5F,
         var16,
         var16,
         o0000O00000.O00000000(4.0F),
         ColorScheme.O00000000(o0000O000O0OO.O00000000000O(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 38), bl && bl2 ? 1.0F : var14 * 0.35F)
      );
      o0000O00OO0O0.O00000000(
         f,
         g + (i - var16) * 0.5F,
         var16,
         var16,
         o0000O00000.O00000000(4.0F),
         ColorScheme.O00000000(o0000O000O0OO.O00000000000OO(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 110), bl && bl2 ? 0.9F : var14),
         0.5F
      );
      if (bl && bl2) {
         o0000O00OO0O0.O00000000(
            f + o0000O00000.O00000000(3.2F),
            g + (i - var16) * 0.5F + o0000O00000.O00000000(6.2F),
            o0000O00000.O00000000(2.8F),
            o0000O00000.O00000000(1.4F),
            o0000O00000.O00000000(1.0F),
            o0000O000O0OO.O000000000O0()
         );
         o0000O00OO0O0.O00000000(
            f + o0000O00000.O00000000(5.4F),
            g + (i - var16) * 0.5F + o0000O00000.O00000000(4.2F),
            o0000O00000.O00000000(5.4F),
            o0000O00000.O00000000(1.4F),
            o0000O00000.O00000000(1.0F),
            o0000O000O0OO.O000000000O0()
         );
      }

      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         f + var16 + o0000O00000.O00000000(7.0F),
         g,
         i,
         9.5F,
         O0000O00000OO.O00000000(FontRegistry.O00000000, string3, 9.5F, h - var16 - o0000O00000.O00000000(10.0F)),
         var15
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      String string,
      List<O0000O000O0.W337> list,
      float f,
      float g,
      float h,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO
   ) {
      if (list.isEmpty()) {
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            f,
            g,
            o0000O00000.O00000000(14.0F),
            9.5F,
            "Нет заданных зачарований",
            o0000O000O0OO.O0000000000OO0()
         );
      } else {
         float var10 = o0000O00000.O00000000(8.0F);
         float var11 = o0000O00000.O00000000(22.0F);
         float var12 = (h - var10) * 0.5F;

         for (int var13 = 0; var13 < list.size(); var13++) {
            O0000O000O0.W337 var14 = (O0000O000O0.W337)list.get(var13);
            float var15 = f + var13 % 2 * (var12 + var10);
            float var16 = g + var13 / 2 * (var11 + o0000O00000.O00000000(4.0F));
            boolean var17 = AutoBuy.O000000000(string, var14.key());
            this.O00000000(
               o0000O00OO0O0, o0000O000O0O0, string, var14.key(), var14.label(), var17, true, var15, var16, var12, var11, o0000O00000, o0000O000O0OO
            );
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, FontObject o0000O0O00O00O, float f, float g, float h, float i, float j, String string, int k
   ) {
      float var11 = O0000O00000OO.O00000000(o0000O0O00O00O, string, j);
      O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, o0000O0O00O00O, f + (h - var11) * 0.5F, g, i, j, string, k);
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, float h, float i, int j) {
      if (!(h <= 0.01F)) {
         int var9 = o0000O000O0OO.O00000000();
         float var10 = (1.0F - h) * o0000O00000.O00000000(6.0F);
         o0000O00OO0O0.O000000000000(h);

         try {
            float var11 = f + var10;
            float var12 = g + o0000O00000.O00000000(8.0F);
            float var13 = o0000O00000.O00000000(5.0F) + o0000O00000.O00000000(2.2F) * i;
            if (i > 0.01F) {
               o0000O00OO0O0.O00000000(
                  var11 - var13 * 0.5F,
                  var12 - var13 * 0.5F,
                  var13,
                  var13,
                  var13 * 0.5F,
                  o0000O00000.O00000000(9.0F) * i,
                  o0000O00000.O00000000(1.5F),
                  ColorScheme.O00000000(var9, Math.round(130.0F * i))
               );
            }

            o0000O00OO0O0.O00000000(
               var11 - var13 * 0.5F, var12 - var13 * 0.5F, var13, var13, var13 * 0.5F, ColorScheme.O00000000(var9, Math.round(150.0F + 105.0F * i))
            );
            String var14 = j <= 0 ? "Live · мониторинг" : "Live · покупок: " + j;
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               o0000O00000,
               FontRegistry.O00000000,
               var11 + o0000O00000.O00000000(9.0F),
               g,
               o0000O00000.O00000000(16.0F),
               9.5F,
               var14,
               ColorScheme.O00000000(var9, Math.round(150.0F + 80.0F * i))
            );
         } finally {
            o0000O00OO0O0.O00000000000OO();
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, int j) {
      float var9 = (float)((System.currentTimeMillis() + j) % 7200L) / 7200.0F;
      float var10 = var9 < 0.5F ? var9 * 2.0F : 2.0F - var9 * 2.0F;
      float var11 = Math.max(o0000O00000.O00000000(44.0F), h * 0.24F);
      float var12 = f + o0000O00000.O00000000(8.0F) + (h - o0000O00000.O00000000(16.0F) - var11) * var10;
      int var13 = ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 30);
      o0000O00OO0O0.O00000000(
         f + o0000O00000.O00000000(1.0F),
         g + o0000O00000.O00000000(1.0F),
         h - o0000O00000.O00000000(2.0F),
         o0000O00000.O00000000(1.0F),
         o0000O00000.O00000000(1.0F),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 10),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 12)
      );
      o0000O00OO0O0.O00000000(
         var12,
         g + o0000O00000.O00000000(1.0F),
         var11 * 0.5F,
         o0000O00000.O00000000(1.4F),
         o0000O00000.O00000000(1.0F),
         ColorScheme.O00000000(255, 255, 255, 0),
         var13
      );
      o0000O00OO0O0.O00000000(
         var12 + var11 * 0.5F,
         g + o0000O00000.O00000000(1.0F),
         var11 * 0.5F,
         o0000O00000.O00000000(1.4F),
         o0000O00000.O00000000(1.0F),
         var13,
         ColorScheme.O00000000(255, 255, 255, 0)
      );
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0.W341 o000000000000O, boolean bl, float f, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO) {
      if (o000000000000O.visible()) {
         O0000O00000OO.O000000000(
            o0000O00OO0O0,
            o0000O00000,
            o0000O000O0OO,
            o000000000000O.x(),
            o000000000000O.y(),
            o000000000000O.w(),
            o000000000000O.h(),
            o000000000000O.thumbY(),
            o000000000000O.thumbH(),
            f,
            bl ? 1.0F : 0.0F
         );
      }
   }

   private void O00000000(List<O00000OOOOOO> list, AutoBuy o000000OO00O0O, O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      O0000O000O0.W342 var5 = this.O00000000(o00000000000, o0000O00000);
      float var6 = var5.stripH();
      float var7 = var5.modeX();
      float var8 = var5.toggleW();
      float var9 = var5.toggleX();
      float var10 = var5.gap();
      float var11 = var5.tabBtnSize();
      float var12 = var5.chipW();
      float var13 = var7;

      for (String var17 : O0000000000000) {
         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(var13)
               .O000000000(o00000000000.y())
               .O0000000000(var12)
               .O00000000000(var6)
               .O00000000(o0000O000O0O0 -> {
                  o000000OO00O0O.O000000000O00O.O000000000000 = var17;
                  o000000OO00O0O.O000000000O00O.O00000000000O = o000000OO00O0O.O000000000O00O.O00000000000.indexOf(var17);
                  this.O000000000(this.O0000000000OO, 0.0F);
                  o0000O000O0O0.O00000000000O(false);
                  o0000O000O0O0.O00000000O000O();
               })
               .O00000000()
         );
         var13 += var12 + var10;
      }

      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(var13)
            .O000000000(o00000000000.y())
            .O0000000000(var11)
            .O00000000000(var11)
            .O00000000(o0000O000O0O0 -> {
               this.O00000000O0OO = 0;
               o0000O000O0O0.O00000000O000O();
            })
            .O00000000()
      );
      var13 += var11 + var10;
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(var13)
            .O000000000(o00000000000.y())
            .O0000000000(var11)
            .O00000000000(var11)
            .O00000000(o0000O000O0O0 -> {
               this.O00000000O0OO = 1;
               this.O000000000OO0.O00000000000(0.0);
               this.O000000000OO0.O000000000();
               o0000O000O0O0.O00000000O000O();
            })
            .O00000000()
      );
      var13 += var11 + var10;
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(var13)
            .O000000000(o00000000000.y())
            .O0000000000(var11)
            .O00000000000(var11)
            .O00000000(o0000O000O0O0 -> {
               this.O00000000O0OO = 2;
               o0000O000O0O0.O00000000O000O();
            })
            .O00000000()
      );
      if (var5.showReparse()) {
         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(var5.reparseX())
               .O000000000(o00000000000.y())
               .O0000000000(var5.reparseToggleW())
               .O00000000000(var6)
               .O00000000(o0000O000O0O0 -> {
                  o000000OO00O0O.O000000000O0OO.O000000000(!o000000OO00O0O.O000000000O0OO.O0000000000());
                  o0000O000O0O0.O00000000000O(false);
                  o0000O000O0O0.O00000000O000O();
               })
               .O00000000()
         );
         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(var5.reparseSliderX())
               .O000000000(o00000000000.y())
               .O0000000000(var5.reparseSliderW())
               .O00000000000(var6)
               .O00000000(o0000O000O0O0 -> {
                  float var5x = var5.reparseSliderX() + o0000O00000.O00000000(8.0F);
                  float var6x = Math.max(o0000O00000.O00000000(28.0F), var5.reparseSliderW() - o0000O00000.O00000000(16.0F));
                  this.O00000000(o000000OO00O0O, o0000O000O0O0.O0000000O(), var5x, var6x);
                  o0000O000O0O0.O00000000(o000000OO00O0O.O000000000OO);
                  o0000O000O0O0.O00000000O0(var5x);
                  o0000O000O0O0.O00000000O00(var6x);
                  o0000O000O0O0.O00000000000O(false);
                  o0000O000O0O0.O00000000O000O();
               })
               .O00000000()
         );
      }

      float var21 = var8 * 0.5F;
      list.add(
         O00000OOOOOO.O00000000().O00000000(0).O00000000(var9).O000000000(o00000000000.y()).O0000000000(var21).O00000000000(var6).O00000000(o0000O000O0O0 -> {
            if (o000000OO00O0O.O0000000000000) {
               o000000OO00O0O.a_();
            }

            o0000O000O0O0.O00000000000O(false);
            o0000O000O0O0.O00000000O000O();
         }).O00000000()
      );
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(var9 + var21)
            .O000000000(o00000000000.y())
            .O0000000000(var21)
            .O00000000000(var6)
            .O00000000(o0000O000O0O0 -> {
               if (!o000000OO00O0O.O0000000000000) {
                  o000000OO00O0O.a_();
               }

               o0000O000O0O0.O00000000000O(false);
               o0000O000O0O0.O00000000O000O();
            })
            .O00000000()
      );
   }

   private void O000000000(List<O00000OOOOOO> list, AutoBuy o000000OO00O0O, O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      this.O00000000(list, o00000000000, o0000O00000);
      List var5 = this.O000000000(o000000OO00O0O, this.O000000000OOO.O000000000000);
      O0000O000O0.W341 var6 = this.O00000000(
         o00000000000.catalogScrollbarX(),
         o00000000000.catalogViewportY(),
         o00000000000.scrollbarW(),
         o00000000000.catalogViewportH(),
         this.O00000000(o000000OO00O0O, o00000000000, o0000O00000),
         this.O0000000000OO.O00000000000O(),
         o0000O00000
      );
      float var7 = this.O0000000000OO.O00000000000O();
      int var8 = this.O0000000000000(o00000000000, o0000O00000);
      float var9 = this.O00000000(o0000O00000);
      float var10 = this.O000000000(o0000O00000);
      float var11 = this.O0000000000(o0000O00000);
      int var12 = Math.max(1, (var5.size() + var8 - 1) / var8);
      int var13 = Math.max(0, (int)Math.floor(-var7 / (var10 + var11)) - 1);
      int var14 = Math.min(var12, (int)Math.ceil((o00000000000.catalogViewportH() - var7) / (var10 + var11)) + 1);

      for (int var15 = var13; var15 < var14; var15++) {
         for (int var16 = 0; var16 < var8; var16++) {
            int var17 = var15 * var8 + var16;
            if (var17 >= var5.size()) {
               break;
            }

            O0000O000O0.W335 var18 = (O0000O000O0.W335)var5.get(var17);
            float var19 = o00000000000.catalogViewportX() + var16 * (var9 + var11);
            float var20 = o00000000000.catalogViewportY() + var7 + var15 * (var10 + var11);
            if (!(var20 > o00000000000.catalogViewportY() + o00000000000.catalogViewportH()) && !(var20 + var10 < o00000000000.catalogViewportY())) {
               list.add(
                  O00000OOOOOO.O00000000().O00000000(0).O00000000(var19).O000000000(var20).O0000000000(var9).O00000000000(var10).O00000000(o0000O000O0O0 -> {
                     AutoBuy.O00000000O000O.putIfAbsent(var18.key(), 0L);
                     AutoBuy.O00000000O0O0.remove(var18.key());
                     o0000O000O0O0.O00000000000O(false);
                     o0000O000O0O0.O00000000(this.O000000000000O(var18.key()));
                     o0000O000O0O0.O00000000O000O();
                  }).O00000000()
               );
               list.add(
                  O00000OOOOOO.O00000000()
                     .O00000000(1)
                     .O00000000(var19)
                     .O000000000(var20)
                     .O0000000000(var9)
                     .O00000000000(var10)
                     .O000000000000(o00000000000.catalogViewportX())
                     .O0000000000000(o00000000000.catalogViewportY())
                     .O000000000000O(o00000000000.catalogViewportW())
                     .O00000000000O(o00000000000.catalogViewportH())
                     .O00000000(o0000O000O0O0 -> this.O00000000(var18.key(), o0000O000O0O0))
                     .O00000000()
               );
            }
         }
      }

      this.O00000000(list, "catalog", var6, o0000O00000);
   }

   private void O00000000(List<O00000OOOOOO> list, O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      float var4 = this.O000000000000O(o00000000000, o0000O00000);
      float var5 = this.O00000000000O(o00000000000, o0000O00000);
      float var6 = this.O00000000000O0(o00000000000, o0000O00000);
      float var7 = this.O00000000000(o0000O00000);
      if (this.O000000000OOO.O000000000000 != null && !this.O000000000OOO.O000000000000.isEmpty()) {
         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(var4 + var6 - o0000O00000.O00000000(34.0F))
               .O000000000(var5)
               .O0000000000(o0000O00000.O00000000(34.0F))
               .O00000000000(var7)
               .O00000000(o0000O000O0O0 -> {
                  this.O000000000OOO.O000000000000 = "";
                  o0000O000O0O0.O00000000((NumberSetting)null);
                  this.O0000000000();
               })
               .O00000000()
         );
      }

      list.add(O00000OOOOOO.O00000000().O00000000(0).O00000000(var4).O000000000(var5).O0000000000(var6).O00000000000(var7).O00000000(o0000O000O0O0 -> {
         o0000O000O0O0.O00000000000O(false);
         o0000O000O0O0.O00000000(this.O000000000OOO);
      }).O00000000());
   }

   private void O00000000(List<O00000OOOOOO> list, O0000O000O0O0 o0000O000O0O0, O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      this.O000000000(list, o00000000000, o0000O00000);
      List var5 = this.O000000000();
      O0000O000O0.W341 var6 = this.O00000000(
         o00000000000.rulesScrollbarX(),
         o00000000000.rulesViewportY(),
         o00000000000.scrollbarW(),
         o00000000000.rulesViewportH(),
         this.O0000000000(o00000000000, o0000O00000),
         this.O0000000000OO0.O00000000000O(),
         o0000O00000
      );
      float var7 = this.O0000000000OO0.O00000000000O();
      float var8 = this.O000000000000(o0000O00000);
      float var9 = this.O0000000000000(o0000O00000);
      float var10 = o0000O00000.O00000000(6.0F);
      float var11 = o00000000000.rulesViewportX() + var10;
      float var12 = o00000000000.rulesViewportW() - var10 * 2.0F;
      float var13 = o00000000000.rulesViewportY() + var7;

      for (int var14 = 0; var14 < var5.size(); var14++) {
         String var15 = (String)var5.get(var14);
         float var16 = this.O000000000(o0000O000O0O0, var15);
         float var17 = this.O00000000(var15, o0000O00000, var16);
         if (!(var13 > o00000000000.rulesViewportY() + o00000000000.rulesViewportH()) && !(var13 + var17 < o00000000000.rulesViewportY())) {
            float var18 = var13 + (var8 - o0000O00000.O00000000(29.0F)) * 0.5F;
            boolean var19 = this.O0000000000000(var15);
            float var20 = var11 + var12 - o0000O00000.O00000000(237.0F);
            float var21 = var11 + var12 - o0000O00000.O00000000(134.0F);
            float var22 = var11 + var12 - o0000O00000.O00000000(68.0F);
            float var23 = var11 + var12 - o0000O00000.O00000000(34.0F);
            list.add(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(var22)
                  .O000000000(var18)
                  .O0000000000(o0000O00000.O00000000(29.0F))
                  .O00000000000(o0000O00000.O00000000(29.0F))
                  .O00000000(o0000O000O0O0x -> this.O00000000(var15, o0000O000O0O0x))
                  .O00000000()
            );
            if (var19) {
               list.add(
                  O00000OOOOOO.O00000000()
                     .O00000000(0)
                     .O00000000(var23)
                     .O000000000(var18)
                     .O0000000000(o0000O00000.O00000000(29.0F))
                     .O00000000000(o0000O00000.O00000000(29.0F))
                     .O00000000(o0000O000O0O0x -> {
                        this.O000000000OOOO = var15.equals(this.O000000000OOOO) ? null : var15;
                        o0000O000O0O0x.O00000000000O(false);
                        if (!var15.equals(this.O0000000000000(o0000O000O0O0x))) {
                           o0000O000O0O0x.O00000000((NumberSetting)null);
                        }
                     })
                     .O00000000()
               );
            }

            list.add(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(var21)
                  .O000000000(var18)
                  .O0000000000(o0000O00000.O00000000(58.0F))
                  .O00000000000(o0000O00000.O00000000(29.0F))
                  .O00000000(o0000O000O0O0x -> {
                     if (AutoBuy.O00000000O0O0.contains(var15)) {
                        AutoBuy.O00000000O0O0.remove(var15);
                     } else {
                        AutoBuy.O00000000O0O0.add(var15);
                     }

                     o0000O000O0O0x.O00000000000O(false);
                     o0000O000O0O0x.O00000000O000O();
                  })
                  .O00000000()
            );
            list.add(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(var20)
                  .O000000000(var18)
                  .O0000000000(o0000O00000.O00000000(95.0F))
                  .O00000000000(o0000O00000.O00000000(29.0F))
                  .O00000000(o0000O000O0O0x -> {
                     o0000O000O0O0x.O00000000000O(false);
                     o0000O000O0O0x.O00000000(this.O000000000000O(var15));
                  })
                  .O00000000()
            );
            if (var15.equals(this.O000000000OOOO) && this.O0000000000000(var15) && var16 > 0.95F) {
               this.O00000000(
                  list, var15, var11, var13 + var8 + o0000O00000.O00000000(6.0F) * var16, var12, this.O00000000(var15, o0000O00000) * var16, o0000O00000
               );
            }

            var13 += var17 + var9;
         } else {
            var13 += var17 + var9;
         }
      }

      this.O00000000(list, "rules", var6, o0000O00000);
   }

   private void O00000000(List<O00000OOOOOO> list, String string, float f, float g, float h, float i, O0000O00000 o0000O00000) {
      float var8 = f + o0000O00000.O00000000(16.0F);
      float var9 = g + o0000O00000.O00000000(58.0F);
      float var10 = h - o0000O00000.O00000000(32.0F);
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(var8 - o0000O00000.O00000000(6.0F))
            .O000000000(var9 + o0000O00000.O00000000(12.0F))
            .O0000000000(var10 + o0000O00000.O00000000(12.0F))
            .O00000000000(o0000O00000.O00000000(24.0F))
            .O00000000(o0000O000O0O0 -> {
               this.O00000000(string, o0000O000O0O0.O0000000O(), var8, var10);
               this.O00000000(string, o0000O000O0O0.O0000000O(), o0000O000O0O0);
            })
            .O00000000()
      );
      O0000O000O0.W339 var11 = this.O000000000(string);
      float var12 = g + o0000O00000.O00000000(128.0F);
      float var13 = (h - o0000O00000.O00000000(40.0F)) * 0.5F;
      float var14 = o0000O00000.O00000000(8.0F);
      float var15 = o0000O00000.O00000000(22.0F);

      for (int var16 = 0; var16 < var11.enchantments().size(); var16++) {
         O0000O000O0.W337 var17 = var11.enchantments().get(var16);
         this.O00000000(
            list,
            string,
            var17.key(),
            f + o0000O00000.O00000000(16.0F) + var16 % 2 * (var13 + var14),
            var12 + var16 / 2 * (var15 + o0000O00000.O00000000(4.0F)),
            var13,
            var15
         );
      }
   }

   private void O000000000(List<O00000OOOOOO> list, O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      AutoBuy var4 = AutoBuy.O000000000O;
      if (var4 != null) {
         O0000O000O0.W340 var5 = this.O000000000(o00000000000, o0000O00000);
         if (var5.visible()) {
            list.add(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(var5.chipX())
                  .O000000000(var5.chipY())
                  .O0000000000(var5.chipW())
                  .O00000000000(var5.chipH())
                  .O00000000(o0000O000O0O0 -> {
                     var4.O000000000OOO0.O000000000(!var4.O000000000OOO0.O0000000000());
                     o0000O000O0O0.O00000000000O(false);
                     o0000O000O0O0.O00000000O000O();
                  })
                  .O00000000()
            );
            list.add(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(var5.fixX())
                  .O000000000(var5.chipY())
                  .O0000000000(var5.fixW())
                  .O00000000000(var5.chipH())
                  .O00000000(o0000O000O0O0 -> {
                     var4.O000000000OOOO.O000000000(!var4.O000000000OOOO.O0000000000());
                     o0000O000O0O0.O00000000000O(false);
                     o0000O000O0O0.O00000000O000O();
                  })
                  .O00000000()
            );
            list.add(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(var5.statX())
                  .O000000000(var5.chipY())
                  .O0000000000(var5.statW())
                  .O00000000000(var5.chipH())
                  .O00000000(o0000O000O0O0 -> {
                     var4.O00000000O.O000000000(!var4.O00000000O.O0000000000());
                     o0000O000O0O0.O00000000000O(false);
                     o0000O000O0O0.O00000000O000O();
                  })
                  .O00000000()
            );
         }
      }
   }

   private void O00000000(List<O00000OOOOOO> list, String string, String string2, float f, float g, float h, float i) {
      list.add(O00000OOOOOO.O00000000().O00000000(0).O00000000(f).O000000000(g).O0000000000(h).O00000000000(i).O00000000(o0000O000O0O0 -> {
         AutoBuy.O00000000(string, string2, !AutoBuy.O000000000(string, string2));
         o0000O000O0O0.O00000000000O(false);
         o0000O000O0O0.O00000000O000O();
      }).O00000000());
   }

   private void O00000000(String string, float f, float g, float h) {
      int var5 = AutoBuy.O00000000000O0(string);
      int var6 = AutoBuy.O00000000000OO(string);
      float var7 = g + h * var5 / 100.0F;
      float var8 = g + h * var6 / 100.0F;
      this.O00000000O = string;
      this.O00000000O0 = Math.abs(f - var8) < Math.abs(f - var7);
      this.O00000000O00 = g;
      this.O00000000O000 = Math.max(1.0F, h);
   }

   private void O00000000(String string, float f, O0000O000O0O0 o0000O000O0O0) {
      int var4 = (int)O0000O00OO0OO0.O0000000000((double)(this.O000000000((f - this.O00000000O00) / this.O00000000O000, 0.0F, 1.0F) * 100.0F), 0);
      int var5 = AutoBuy.O00000000000O0(string);
      int var6 = AutoBuy.O00000000000OO(string);
      if (this.O00000000O0) {
         var6 = Math.max(var5, var4);
      } else {
         var5 = Math.min(var6, var4);
      }

      AutoBuy.O00000000(string, var5, var6);
      o0000O000O0O0.O00000000000O(false);
      o0000O000O0O0.O00000000O000O();
   }

   private void O0000000000(List<O00000OOOOOO> list, O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      float var4 = this.O00000000000(o00000000000, o0000O00000);
      float var5 = o0000O00000.O00000000(42.0F);
      O0000O000O0.W341 var6 = this.O00000000(
         o00000000000.x() + o00000000000.width() - o0000O00000.O00000000(10.0F),
         o00000000000.panelY() + var5,
         o00000000000.scrollbarW(),
         o00000000000.panelH() - var5 - o0000O00000.O00000000(10.0F),
         var4,
         this.O0000000000OOO.O00000000000O(),
         o0000O00000
      );
      this.O00000000(list, "history", var6, o0000O00000);
      float var7 = o00000000000.panelY() + o0000O00000.O00000000(14.0F);
      float var8 = o0000O00000.O00000000(64.0F);
      float var9 = o0000O00000.O00000000(20.0F);
      float var10 = o00000000000.x() + o00000000000.width() - o0000O00000.O00000000(16.0F) - var8;
      list.add(O00000OOOOOO.O00000000().O00000000(0).O00000000(var10).O000000000(var7).O0000000000(var8).O00000000000(var9).O00000000(o0000O000O0O0 -> {
         AutoBuy.O00000000O0O0O.clear();
         o0000O000O0O0.O00000000O000O();
      }).O00000000());
      float var11 = o0000O00000.O00000000(42.0F);
      float var12 = o0000O00000.O00000000(6.0F);
      float var13 = o00000000000.x() + o0000O00000.O00000000(16.0F);
      float var14 = o00000000000.panelY() + var5;
      float var15 = o00000000000.width() - o0000O00000.O00000000(20.0F) - o00000000000.scrollbarW();
      float var16 = o00000000000.panelH() - var5 - o0000O00000.O00000000(10.0F);
      float var17 = this.O0000000000OOO.O00000000000O();
      float var18 = var15 - o0000O00000.O00000000(36.0F);

      for (int var19 = 0; var19 < AutoBuy.O00000000O0O0O.size(); var19++) {
         float var20 = var14 + var17 + var19 * (var11 + var12);
         if (!(var20 > var14 + var16) && !(var20 + var11 < var14)) {
            float var21 = o0000O00000.O00000000(26.0F);
            float var22 = var13 + var18 + o0000O00000.O00000000(6.0F);
            int var23 = var19;
            list.add(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(var22)
                  .O000000000(var20 + (var11 - var21) * 0.5F)
                  .O0000000000(var21)
                  .O00000000000(var21)
                  .O00000000(o0000O000O0O0 -> {
                     if (var23 < AutoBuy.O00000000O0O0O.size()) {
                        AutoBuy.O00000000O0O0O.remove(var23);
                        o0000O000O0O0.O00000000O000O();
                     }
                  })
                  .O00000000()
            );
         }
      }
   }

   private void O0000000000(List<O00000OOOOOO> list, AutoBuy o000000OO00O0O, O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      float var5 = this.O000000000000(o00000000000, o0000O00000);
      float var6 = o0000O00000.O00000000(62.0F);
      O0000O000O0.W341 var7 = this.O00000000(
         o00000000000.x() + o00000000000.width() - o0000O00000.O00000000(10.0F),
         o00000000000.panelY() + var6,
         o00000000000.scrollbarW(),
         o00000000000.panelH() - var6 - o0000O00000.O00000000(10.0F),
         var5,
         this.O000000000O.O00000000000O(),
         o0000O00000
      );
      this.O00000000(list, "cloud", var7, o0000O00000);
      float var8 = o00000000000.panelY() + o0000O00000.O00000000(14.0F);
      float var9 = o0000O00000.O00000000(28.0F);
      float var10 = o0000O00000.O00000000(8.0F);
      float var11 = o00000000000.x() + o00000000000.width() - o0000O00000.O00000000(16.0F) - var9;
      list.add(O00000OOOOOO.O00000000().O00000000(0).O00000000(var11).O000000000(var8).O0000000000(var9).O00000000000(var9).O00000000(o0000O000O0O0 -> {
         try {
            File var2 = o000000OO00O0O.O000000000O0();
            String var3 = System.getProperty("os.name").toLowerCase();
            if (var3.contains("win")) {
               Runtime.getRuntime().exec(new String[]{"explorer", var2.getAbsolutePath()});
            } else if (var3.contains("mac")) {
               Runtime.getRuntime().exec(new String[]{"open", var2.getAbsolutePath()});
            } else {
               Runtime.getRuntime().exec(new String[]{"xdg-open", var2.getAbsolutePath()});
            }
         } catch (Exception var4) {
         }
      }).O00000000());
      var11 -= var9 + var10;
      list.add(
         O00000OOOOOO.O00000000()
            .O00000000(0)
            .O00000000(var11)
            .O000000000(var8)
            .O0000000000(var9)
            .O00000000000(var9)
            .O00000000(o0000O000O0O0 -> this.O00000000(o000000OO00O0O))
            .O00000000()
      );
      var11 -= var9 + var10;
      list.add(O00000OOOOOO.O00000000().O00000000(0).O00000000(var11).O000000000(var8).O0000000000(var9).O00000000000(var9).O00000000(o0000O000O0O0 -> {
         String var3 = "Default";
         String var4 = var3;
         int var5x = 1;

         for (File var6x = o000000OO00O0O.O000000000O0(); new File(var6x, var4 + ".json").exists(); var5x++) {
            var4 = var3 + var5x;
         }

         o000000OO00O0O.O000000000000(var4);
         this.O0000000000O = var4;
         this.O00000000(o000000OO00O0O);
      }).O00000000());
      float var12 = o0000O00000.O00000000(58.0F);
      float var13 = o0000O00000.O00000000(8.0F);
      float var14 = o00000000000.x() + o0000O00000.O00000000(16.0F);
      float var15 = o00000000000.panelY() + var6;
      float var16 = o00000000000.width() - o0000O00000.O00000000(25.0F) - o00000000000.scrollbarW();
      float var17 = o00000000000.panelH() - var6 - o0000O00000.O00000000(10.0F);
      float var18 = this.O000000000O.O00000000000O();
      float var19 = var16 - o0000O00000.O00000000(24.0F);

      for (int var20 = 0; var20 < this.O00000000000OO.size(); var20++) {
         O0000O000O0.W336 var21 = this.O00000000000OO.get(var20);
         float var22 = var15 + var18 + var20 * (var12 + var13);
         if (!(var22 > var15 + var17) && !(var22 + var12 < var15)) {
            float var23 = o0000O00000.O00000000(26.0F);
            float var24 = o0000O00000.O00000000(8.0F);
            float var25 = var14 + var19 - o0000O00000.O00000000(12.0F) - var23;
            list.add(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(var25)
                  .O000000000(var22 + (var12 - var23) * 0.5F)
                  .O0000000000(var23)
                  .O00000000000(var23)
                  .O00000000(o0000O000O0O0 -> {
                     o000000OO00O0O.O000000000000O(var21.name);
                     if (this.O0000000000O.equals(var21.name)) {
                        this.O0000000000O = "";
                     }

                     this.O00000000(o000000OO00O0O);
                  })
                  .O00000000()
            );
            var25 -= var23 + var24;
            list.add(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(var25)
                  .O000000000(var22 + (var12 - var23) * 0.5F)
                  .O0000000000(var23)
                  .O00000000000(var23)
                  .O00000000(o0000O000O0O0 -> {
                     o000000OO00O0O.O0000000000000(var21.name);
                     this.O0000000000O = var21.name;
                  })
                  .O00000000()
            );
            float var26 = var22 + o0000O00000.O00000000(12.0F);
            float var27 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var21.name, 13.0F);
            list.add(
               O00000OOOOOO.O00000000()
                  .O00000000(0)
                  .O00000000(var14 + o0000O00000.O00000000(12.0F))
                  .O000000000(var26 - o0000O00000.O00000000(4.0F))
                  .O0000000000(var27 + o0000O00000.O00000000(24.0F))
                  .O00000000000(o0000O00000.O00000000(18.0F))
                  .O00000000(
                     o0000O000O0O0 -> o0000O000O0O0.O00000000(this.O0000000000O00.computeIfAbsent(var21.name, string -> new TextSetting("Name", string)))
                  )
                  .O00000000()
            );
         }
      }
   }

   private void O00000000(List<O00000OOOOOO> list, String string, O0000O000O0.W341 o000000000000O, O0000O00000 o0000O00000) {
      if (o000000000000O.visible()) {
         float var5 = o0000O00000.O00000000(5.0F);
         list.add(
            O00000OOOOOO.O00000000()
               .O00000000(0)
               .O00000000(o000000000000O.x() - var5)
               .O000000000(o000000000000O.y())
               .O0000000000(o000000000000O.w() + var5 * 2.0F)
               .O00000000000(o000000000000O.h())
               .O00000000(o0000O000O0O0 -> {
                  this.O00000000(string, o0000O000O0O0.O0000000O0(), o000000000000O);
                  o0000O000O0O0.O00000000000O(false);
                  if (!this.O00000000(o0000O000O0O0.O0000000OOO000()) && this.O00000000000(o0000O000O0O0) == null) {
                     o0000O000O0O0.O00000000((NumberSetting)null);
                  }
               })
               .O00000000()
         );
      }
   }

   private O0000O000O0.W341 O00000000(float f, float g, float h, float i, float j, float k, O0000O00000 o0000O00000) {
      if (!(j <= 0.5F) && !(i <= o0000O00000.O00000000(8.0F))) {
         float var8 = Math.max(o0000O00000.O00000000(34.0F), i * (i / (i + j)));
         var8 = Math.min(i, var8);
         float var9 = Math.max(0.0F, i - var8);
         float var10 = j <= 0.001F ? 0.0F : this.O000000000(-k / j, 0.0F, 1.0F);
         float var11 = g + var9 * var10;
         return new O0000O000O0.W341(f, g, h, i, j, var11, var8, true);
      } else {
         return O0000O000O0.W341.hidden(f, g, h, i);
      }
   }

   private void O00000000(String string, float f, O0000O000O0.W341 o000000000000O) {
      if (o000000000000O.visible()) {
         this.O00000000O00OO = "catalog".equals(string);
         this.O00000000O0O = "rules".equals(string);
         this.O00000000O0O0 = "history".equals(string);
         this.O00000000O0O00 = "cloud".equals(string);
         if (f >= o000000000000O.thumbY() && f <= o000000000000O.thumbY() + o000000000000O.thumbH()) {
            this.O00000000O0O0O = f - o000000000000O.thumbY();
         } else {
            this.O00000000O0O0O = o000000000000O.thumbH() * 0.5F;
         }

         this.O000000000(string, f, o000000000000O);
      }
   }

   private void O000000000(String string, float f, O0000O000O0.W341 o000000000000O) {
      if (o000000000000O.visible()) {
         float var4 = o000000000000O.travel();
         float var5 = this.O000000000(f - this.O00000000O0O0O, o000000000000O.y(), o000000000000O.y() + var4);
         float var6 = var4 <= 0.001F ? 0.0F : (var5 - o000000000000O.y()) / var4;
         float var7 = -o000000000000O.maxScroll() * var6;
         if ("catalog".equals(string)) {
            this.O000000000(this.O0000000000OO, var7);
         } else if ("rules".equals(string)) {
            this.O000000000(this.O0000000000OO0, var7);
         } else if ("history".equals(string)) {
            this.O000000000(this.O0000000000OOO, var7);
         } else if ("cloud".equals(string)) {
            this.O000000000(this.O000000000O, var7);
         }
      }
   }

   private O0000O000O0.W338 O00000000(O0000O00000000 o0000O00000000, O0000O00000 o0000O00000) {
      float var3 = o0000O00000000.O000000000() + o0000O00000.O00000000(16.0F);
      float var4 = o0000O00000.O00000000(5.0F);
      float var5 = o0000O00000000.O0000000000() + o0000O00000.O0000000000OO0() + o0000O00000.O00000000(10.0F) + var4;
      float var6 = o0000O00000000.O00000000000() - o0000O00000.O00000000(32.0F);
      float var7 = Math.max(0.0F, o0000O00000000.O0000000000000() - o0000O00000.O00000000(20.0F) - var4);
      float var8 = o0000O00000.O00000000(34.0F);
      float var9 = o0000O00000.O00000000(8.0F);
      float var10 = var5 + var8 + var9;
      float var11 = Math.max(o0000O00000.O00000000(80.0F), var7 - var8 - var9);
      float var12 = o0000O00000.O00000000(10.0F);
      float var13 = Math.min(o0000O00000.O00000000(300.0F), var6 * 0.44F);
      float var14 = Math.min(o0000O00000.O00000000(180.0F), var6 * 0.46F);
      float var15 = Math.min(o0000O00000.O00000000(220.0F), var6 * 0.46F);
      float var16 = Math.max(o0000O00000.O00000000(120.0F), var6 - var15 - var12);
      var13 = Math.max(var14, Math.min(var13, var16));
      if (var13 + var12 + o0000O00000.O00000000(120.0F) > var6) {
         var13 = Math.max(o0000O00000.O00000000(120.0F), var6 - o0000O00000.O00000000(120.0F) - var12);
      }

      float var17 = Math.max(o0000O00000.O00000000(120.0F), var6 - var13 - var12);
      float var18 = var3 + var13 + var12;
      float var19 = o0000O00000.O00000000(10.0F);
      float var20 = o0000O00000.O00000000(82.0F);
      float var21 = o0000O00000.O00000000(48.0F);
      float var22 = Math.max(o0000O00000.O00000000(5.5F), 4.0F);
      float var23 = var3 + var19;
      float var24 = var10 + var20;
      float var25 = Math.max(o0000O00000.O00000000(60.0F), var13 - var19 * 2.0F - var22 - o0000O00000.O00000000(5.0F));
      float var26 = Math.max(o0000O00000.O00000000(30.0F), var11 - var20 - o0000O00000.O00000000(12.0F));
      float var27 = var18 + var19;
      float var28 = var10 + var21;
      float var29 = Math.max(o0000O00000.O00000000(120.0F), var17 - var19 * 2.0F - var22 - o0000O00000.O00000000(5.0F));
      float var30 = Math.max(o0000O00000.O00000000(30.0F), var11 - var21 - o0000O00000.O00000000(12.0F));
      return new O0000O000O0.W338(
         var3,
         var5,
         var6,
         var7,
         var3,
         var18,
         var13,
         var17,
         var10,
         var11,
         var23,
         var24,
         var25,
         var26,
         var23 + var25 + o0000O00000.O00000000(5.0F),
         var27,
         var28,
         var29,
         var30,
         var27 + var29 + o0000O00000.O00000000(5.0F),
         var22
      );
   }

   private List<O0000O000O0.W335> O000000000(AutoBuy o000000OO00O0O) {
      return this.O000000000(o000000OO00O0O, "");
   }

   private List<O0000O000O0.W335> O000000000(AutoBuy o000000OO00O0O, String string) {
      ArrayList var3 = new ArrayList();
      if (o000000OO00O0O != null && o000000OO00O0O.O000000000O00O.O000000000("HolyWorld")) {
         for (O000000OOOO000.W120 var10 : O000000OOOO000.O00000000()) {
            var3.add(new O0000O000O0.W335(var10.key(), var10.label(), new ItemStack(var10.item()), true));
         }
      } else {
         for (String var5 : O00000000000O) {
            var3.add(new O0000O000O0.W335(var5, var5, this.O0000000000(var5), true));
         }
      }

      var3.addAll(O00000000());
      String var9 = string == null ? "" : string.trim().toLowerCase(Locale.ROOT);
      if (var9.isEmpty()) {
         return var3;
      } else {
         ArrayList var11 = new ArrayList();

         for (O0000O000O0.W335 var7 : (List<O0000O000O0.W335>)var3) {
            if (var7.label().toLowerCase(Locale.ROOT).contains(var9) || var7.key().toLowerCase(Locale.ROOT).contains(var9)) {
               var11.add(var7);
            }
         }

         return var11;
      }
   }

   private static List<O0000O000O0.W335> O00000000() {
      if (O00000000000O0 != null) {
         return O00000000000O0;
      } else {
         ArrayList var0 = new ArrayList();

         for (Item var2 : Registries.ITEM) {
            if (var2 != Items.AIR) {
               Identifier var3 = Registries.ITEM.getId(var2);
               if (var3 != null && "minecraft".equals(var3.getNamespace())) {
                  ItemStack var4 = var2.getDefaultStack();
                  var0.add(new O0000O000O0.W335(var3.toString(), var4.getName().getString(), var4, false));
               }
            }
         }

         var0.sort(Comparator.comparing(O0000O000O0.W335::label, String.CASE_INSENSITIVE_ORDER));
         O00000000000O0 = List.copyOf(var0);
         return O00000000000O0;
      }
   }

   private O0000O000O0.W335 O00000000(String string) {
      if (O000000OOOO000.O00000000(string)) {
         O000000OOOO000.W120 var5 = O000000OOOO000.O0000000000(string);
         if (var5 != null) {
            ItemStack var6 = O000000OOOO000.O0000000000000(var5.key());
            if (var6.isEmpty()) {
               var6 = new ItemStack(var5.item());
            }

            return new O0000O000O0.W335(var5.key(), var5.label(), var6, true);
         } else {
            return new O0000O000O0.W335(string == null ? "" : string, string == null ? "" : string, ItemStack.EMPTY, true);
         }
      } else if (O00000000000O.contains(string)) {
         return new O0000O000O0.W335(string, string, this.O0000000000(string), true);
      } else {
         if (string != null && string.startsWith("minecraft:")) {
            Identifier var2 = Identifier.tryParse(string);
            if (var2 != null) {
               Item var3 = (Item)Registries.ITEM.get(var2);
               if (var3 != Items.AIR) {
                  ItemStack var4 = var3.getDefaultStack();
                  return new O0000O000O0.W335(string, var4.getName().getString(), var4, false);
               }
            }
         }

         return new O0000O000O0.W335(string == null ? "" : string, string == null ? "" : string, ItemStack.EMPTY, true);
      }
   }

   private O0000O000O0.W339 O000000000(String string) {
      O000000OOOO000.W120 var2 = O000000OOOO000.O0000000000(string);
      if (var2 != null) {
         ArrayList var7 = new ArrayList();

         for (String var5 : var2.enchantments()) {
            String var6 = O000000OOOO000.O000000000000(var5);
            if (!var6.isBlank()) {
               var7.add(new O0000O000O0.W337(var6, this.O000000000000(var5)));
            }
         }

         return new O0000O000O0.W339(var7);
      } else {
         ItemStack var3 = this.O00000000000(string);
         return !var3.isEmpty() ? new O0000O000O0.W339(this.O00000000(var3)) : new O0000O000O0.W339(List.of());
      }
   }

   private ItemStack O0000000000(String string) {
      ItemStack var2 = this.O00000000000(string);
      if (!var2.isEmpty()) {
         return var2;
      } else {
         ItemStack var3 = O00000OO000.O00000000(string);
         return var3 == null ? ItemStack.EMPTY : var3;
      }
   }

   private ItemStack O00000000000(String string) {
      if (string == null) {
         return ItemStack.EMPTY;
      } else {
         return switch (string) {
            case "Шлем Крушителя" -> O000000OOOO.O00000000();
            case "Нагрудник Крушителя" -> O000000OOOO.O000000000();
            case "Поножи Крушителя" -> O000000OOOO.O0000000000();
            case "Ботинки Крушителя" -> O000000OOOO.O00000000000();
            case "Меч Крушителя" -> O000000OOOO.O000000000000();
            case "Кирка Крушителя" -> O000000OOOO.O0000000000000();
            case "Арбалет Крушителя" -> O000000OOOO.O000000000000O();
            case "Трезубец Крушителя" -> O000000OOOO.O00000000000O();
            case "Булава Крушителя" -> O000000OOOO.O00000000000O0();
            default -> ItemStack.EMPTY;
         };
      }
   }

   private List<O0000O000O0.W337> O00000000(ItemStack itemStack) {
      ItemEnchantmentsComponent var2 = (ItemEnchantmentsComponent)itemStack.get(DataComponentTypes.ENCHANTMENTS);
      if (var2 != null && !var2.isEmpty()) {
         ArrayList var3 = new ArrayList();

         for (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var5 : var2.getEnchantmentEntries()) {
            String var6 = this.O00000000((RegistryEntry<Enchantment>)var5.getKey());
            if (!var6.isBlank()) {
               String var7 = var6 + ":" + var5.getIntValue();
               String var8 = O000000OOOO000.O000000000000(var7);
               if (!var8.isBlank()) {
                  var3.add(new O0000O000O0.W337(var8, this.O000000000000(var7)));
               }
            }
         }

         return var3;
      } else {
         return List.of();
      }
   }

   private String O00000000(RegistryEntry<Enchantment> registryEntry) {
      return registryEntry.getKey().map(registryKey -> registryKey.getValue().toString()).orElse("");
   }

   private String O000000000000(String string) {
      if (string != null && !string.isBlank()) {
         String[] var2 = string.split(":");
         String var3 = var2.length >= 2 ? var2[1] : string.replace("minecraft:", "");
         String var4 = O000000000000O.getOrDefault(var3, var3.replace('_', ' '));
         return var2.length >= 3 ? var4 + " " + var2[2] : var4;
      } else {
         return "";
      }
   }

   private boolean O0000000000000(String string) {
      O000000OOOO000.W120 var2 = O000000OOOO000.O0000000000(string);
      if (var2 != null) {
         return AutoBuy.O00000000(var2.item());
      } else {
         O0000O000O0.W335 var3 = this.O00000000(string);
         return var3 != null && !var3.stack().isEmpty() && AutoBuy.O00000000(var3.stack().getItem());
      }
   }

   private List<String> O000000000() {
      return new ArrayList<>(AutoBuy.O00000000O000O.keySet());
   }

   private TextSetting O000000000000O(String string) {
      return this.O000000000OOO0.computeIfAbsent(string, stringx -> new TextSetting("Макс. цена", this.O00000000000O(stringx)));
   }

   private String O00000000000O(String string) {
      long var2 = AutoBuy.O00000000O000O.getOrDefault(string, 0L);
      return var2 <= 0L ? "" : Long.toString(var2);
   }

   private void O000000000000(O0000O000O0O0 o0000O000O0O0) {
      this.O000000000OOO0
         .entrySet()
         .removeIf(entry -> !AutoBuy.O00000000O000O.containsKey(entry.getKey()) && o0000O000O0O0.O0000000OOO000() != entry.getValue());
   }

   private boolean O00000000(TextSetting o000000O0000) {
      return o000000O0000 != null && this.O000000000OOO0.containsValue(o000000O0000);
   }

   private String O0000000000000(O0000O000O0O0 o0000O000O0O0) {
      TextSetting var2 = o0000O000O0O0.O0000000OOO000();
      if (var2 == null) {
         return null;
      } else {
         for (Entry var4 : this.O000000000OOO0.entrySet()) {
            if (var4.getValue() == var2) {
               return (String)var4.getKey();
            }
         }

         return null;
      }
   }

   private void O00000000(String string, String string2, O0000O000O0O0 o0000O000O0O0) {
      AutoBuy.O00000000O000O.put(string, this.O00000000000O0(string2));
      o0000O000O0O0.O00000000O000O();
   }

   private long O00000000000O0(String string) {
      if (string != null && !string.isBlank()) {
         try {
            return Long.parseLong(string);
         } catch (NumberFormatException var3) {
            return 0L;
         }
      } else {
         return 0L;
      }
   }

   private void O00000000(String string, O0000O000O0O0 o0000O000O0O0) {
      TextSetting var3 = this.O000000000OOO0.remove(string);
      if (o0000O000O0O0.O0000000OOO000() == var3) {
         o0000O000O0O0.O00000000((NumberSetting)null);
      }

      if (string != null && string.equals(this.O000000000OOOO)) {
         this.O000000000OOOO = null;
      }

      AutoBuy.O00000000O000O.remove(string);
      AutoBuy.O00000000O00O.remove(string);
      AutoBuy.O00000000O00O0.remove(string);
      AutoBuy.O00000000O00OO.remove(string);
      AutoBuy.O00000000O0O0.remove(string);
      AutoBuy.O00000000O0O.remove(string);
      o0000O000O0O0.O00000000000O(false);
      o0000O000O0O0.O00000000O000O();
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, DrawContext drawContext, O0000O000O0.W335 o00000000, float f, float g, float h, float i, float j, float k, float l, float m
   ) {
      if (o00000000 != null && !(i < 0.05F)) {
         if (!(f + h <= j) && !(g + h <= k) && !(f >= j + l) && !(g >= k + m)) {
            ItemStack var12 = o00000000.custom() ? O00000OO000.O00000000(o00000000.key()) : o00000000.stack();
            if (var12 != null && !var12.isEmpty()) {
               float var13 = h / 16.0F;
               float var14 = i < 0.95F ? i : Math.min(1.0F, 0.5F + 0.5F * i);
               if (var14 >= 0.999F) {
                  ItemRenderUtil.O00000000(o0000O00OO0O0, var12, f, g, var13, 0, false, 0);
               } else {
                  float var15 = f + h * 0.5F;
                  float var16 = g + h * 0.5F;
                  o0000O00OO0O0.O00000000(var14, var15, var16);

                  try {
                     ItemRenderUtil.O00000000(o0000O00OO0O0, var12, f, g, var13, 0, false, 0);
                  } finally {
                     o0000O00OO0O0.O00000000000O0();
                  }
               }
            }
         }
      }
   }

   private float O00000000(AutoBuy o000000OO00O0O, O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      int var4 = this.O0000000000000(o00000000000, o0000O00000);
      int var5 = Math.max(1, (this.O000000000(o000000OO00O0O, this.O000000000OOO.O000000000000).size() + var4 - 1) / var4);
      float var6 = var5 * this.O000000000(o0000O00000) + Math.max(0, var5 - 1) * this.O0000000000(o0000O00000);
      return Math.max(0.0F, var6 - o00000000000.catalogViewportH());
   }

   private float O0000000000(O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      return this.O00000000(o00000000000, o0000O00000, null);
   }

   private float O00000000(O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000, O0000O000O0O0 o0000O000O0O0) {
      List var4 = this.O000000000();
      float var5 = 0.0F;

      for (int var6 = 0; var6 < var4.size(); var6++) {
         var5 += this.O00000000(
            (String)var4.get(var6),
            o0000O00000,
            o0000O000O0O0 == null ? this.O00000000000OO((String)var4.get(var6)) : this.O000000000(o0000O000O0O0, (String)var4.get(var6))
         );
         if (var6 < var4.size() - 1) {
            var5 += this.O0000000000000(o0000O00000);
         }
      }

      return Math.max(0.0F, var5 - o00000000000.rulesViewportH());
   }

   private float O00000000000(O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      float var3 = o0000O00000.O00000000(42.0F);
      float var4 = o0000O00000.O00000000(6.0F);
      float var5 = o0000O00000.O00000000(42.0F);
      float var6 = o00000000000.panelH() - var5 - o0000O00000.O00000000(10.0F);
      float var7 = AutoBuy.O00000000O0O0O.size() * var3 + Math.max(0, AutoBuy.O00000000O0O0O.size() - 1) * var4;
      return Math.max(0.0F, var7 - var6);
   }

   private float O000000000000(O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      float var3 = o0000O00000.O00000000(58.0F);
      float var4 = o0000O00000.O00000000(8.0F);
      float var5 = o00000000000.panelH() - o0000O00000.O00000000(72.0F);
      float var6 = this.O00000000000OO.size() * var3 + Math.max(0, this.O00000000000OO.size() - 1) * var4;
      return Math.max(0.0F, var6 - var5);
   }

   private int O0000000000000(O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      float var3 = this.O00000000(o0000O00000);
      float var4 = this.O0000000000(o0000O00000);
      return Math.max(1, (int)((o00000000000.catalogViewportW() + var4) / (var3 + var4)));
   }

   private float O00000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(72.0F);
   }

   private float O000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(76.0F);
   }

   private float O0000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(8.0F);
   }

   private float O000000000000O(O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      return o00000000000.leftX() + o0000O00000.O00000000(10.0F);
   }

   private float O00000000000O(O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      return o00000000000.panelY() + o0000O00000.O00000000(45.0F);
   }

   private float O00000000000O0(O0000O000O0.W338 o00000000000, O0000O00000 o0000O00000) {
      return Math.max(o0000O00000.O00000000(80.0F), o00000000000.leftW() - o0000O00000.O00000000(20.0F));
   }

   private float O00000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(27.0F);
   }

   private void O0000000000() {
      this.O000000000(this.O0000000000OO, 0.0F);
   }

   private void O00000000000() {
      this.O000000000(this.O0000000000OO, 0.0F);
      this.O000000000(this.O0000000000OO0, 0.0F);
      this.O000000000(this.O0000000000OOO, 0.0F);
      this.O000000000(this.O000000000O, 0.0F);
      this.O00000000O0000 = O0000O000O0.W341.hidden();
      this.O00000000O000O = O0000O000O0.W341.hidden();
      this.O00000000O00O = O0000O000O0.W341.hidden();
      this.O00000000O00O0 = O0000O000O0.W341.hidden();
      this.O00000000O00OO = false;
      this.O00000000O0O = false;
      this.O00000000O0O0 = false;
      this.O00000000O0O00 = false;
      this.O00000000O0O0O = 0.0F;
      this.O000000000OOO0.clear();
      this.O000000000OOOO = null;
      this.O00000000O = null;
      this.O0000000000O00.clear();
      this.O0000000000O0O = null;
      this.O000000000OO0O = -1;
      this.O000000000OO0.O00000000000(0.0);
      this.O000000000OO0.O000000000();
   }

   private float O000000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(62.2F);
   }

   private float O00000000(String string, O0000O00000 o0000O00000, float f) {
      return this.O000000000000(o0000O00000) + (o0000O00000.O00000000(6.0F) + this.O00000000(string, o0000O00000)) * this.O000000000(f, 0.0F, 1.0F);
   }

   private float O00000000(String string, O0000O00000 o0000O00000) {
      int var3 = this.O000000000(string).enchantments().size();
      if (var3 == 0) {
         return o0000O00000.O00000000(112.0F);
      } else {
         int var4 = (var3 + 1) / 2;
         return o0000O00000.O00000000(128.0F + var4 * 22.0F + Math.max(0, var4 - 1) * 4.0F + 14.0F);
      }
   }

   private float O00000000000OO(String string) {
      return string != null && string.equals(this.O000000000OOOO) && this.O0000000000000(string) ? 1.0F : 0.0F;
   }

   private float O00000000(O0000O000O0O0 o0000O000O0O0, String string) {
      return o0000O000O0O0.O000000000(this.O0000000000O(string), this.O00000000000OO(string), O00000000);
   }

   private float O000000000(O0000O000O0O0 o0000O000O0O0, String string) {
      return o0000O000O0O0.O00000000(this.O0000000000O(string));
   }

   private String O0000000000O(String string) {
      return "ab:armor-settings:open:" + string;
   }

   private float O0000000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(8.0F);
   }

   private String O00000000(long l) {
      return "$" + String.format(Locale.ROOT, "%,d", Math.max(0L, l)).replace(',', ' ');
   }

   private float O000000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private float O00000000(O0000O00OOO0 o0000O00OOO0, float f) {
      o0000O00OOO0.O0000000000(-f);
      o0000O00OOO0.O00000000(this.O000000000(o0000O00OOO0.O000000000000O(), -f, 0.0F));
      o0000O00OOO0.O0000000000();
      return o0000O00OOO0.O00000000000O();
   }

   private void O00000000(O0000O00OOO0 o0000O00OOO0, float f, double d) {
      o0000O00OOO0.O0000000000(-f);
      o0000O00OOO0.O00000000(d);
      o0000O00OOO0.O00000000(this.O000000000(o0000O00OOO0.O000000000000O(), -f, 0.0F));
   }

   private void O000000000(O0000O00OOO0 o0000O00OOO0, float f) {
      o0000O00OOO0.O00000000(f);
      o0000O00OOO0.O000000000(f);
   }

   record W335(String key, String label, ItemStack stack, boolean custom) {
   }

   record W336(String name, String author, long timestamp) {
   }

   record W337(String key, String label) {
   }

   record W338(
      float x,
      float y,
      float width,
      float height,
      float leftX,
      float rightX,
      float leftW,
      float rightW,
      float panelY,
      float panelH,
      float catalogViewportX,
      float catalogViewportY,
      float catalogViewportW,
      float catalogViewportH,
      float catalogScrollbarX,
      float rulesViewportX,
      float rulesViewportY,
      float rulesViewportW,
      float rulesViewportH,
      float rulesScrollbarX,
      float scrollbarW
   ) {
   }

   record W339(List<O0000O000O0.W337> enchantments) {
   }

   record W340(boolean visible, float chipX, float chipY, float chipW, float chipH, float fixX, float fixW, float statX, float statW) {
   }

   record W341(float x, float y, float w, float h, float maxScroll, float thumbY, float thumbH, boolean visible) {
      static O0000O000O0.W341 hidden() {
         return hidden(0.0F, 0.0F, 0.0F, 0.0F);
      }

      static O0000O000O0.W341 hidden(float f, float g, float h, float i) {
         return new O0000O000O0.W341(f, g, h, i, 0.0F, g, 0.0F, false);
      }

      float travel() {
         return Math.max(0.0F, this.h - this.thumbH);
      }
   }

   record W342(
      float stripH,
      float modeX,
      float modeY,
      float toggleX,
      float toggleW,
      float gap,
      float tabBtnSize,
      float chipW,
      boolean showReparse,
      float reparseX,
      float reparseW,
      float reparseToggleW,
      float reparseSliderX,
      float reparseSliderW
   ) {
   }
}
