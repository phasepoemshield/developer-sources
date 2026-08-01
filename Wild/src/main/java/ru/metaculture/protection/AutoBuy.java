package ru.metaculture.protection;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.InventoryS2CPacket;
import net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.MathHelper;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoBuy",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматическая покупка предметов с аукциона"
)
public class AutoBuy extends Module {
   private static final Pattern O00000000OO0 = Pattern.compile("Подождите\\s+(\\d+)\\s*сек", 66);
   private static final Pattern O00000000OO00 = Pattern.compile("подождите\\s+(\\d+)\\s*сек\\S*\\s+для\\s+использования\\s+этой\\s+команды", 66);
   private static final long O00000000OO000 = 9000L;
   private static final long O00000000OO00O = 2000L;
   private static final long O00000000OO0O = 250L;
   private static final long O00000000OO0O0 = 2500L;
   private static final long O00000000OO0OO = 4500L;
   private static final long O00000000OOO = 12000L;
   private static final long O00000000OOO0 = 500L;
   private static final long O00000000OOO00 = 15000L;
   private static final long O00000000OOO0O = 20000L;
   private static final long O00000000OOOO = 240000L;
   private static final long O00000000OOOO0 = 4000L;
   private static final long O00000000OOOOO = 8000L;
   private static final int O0000000O = 3;
   private static final long O0000000O0 = 2000L;
   private static final long O0000000O00 = 4500L;
   private static final long O0000000O000 = 600L;
   private static final long O0000000O0000 = 1400L;
   private static final long O0000000O00000 = 750L;
   private static final long O0000000O0000O = 15000L;
   private static final String O0000000O000O = "__wild_funtime_shulker__";
   private static final int O0000000O000O0 = 0;
   private static final int O0000000O000OO = 1;
   private static final int O0000000O00O = 2;
   private static final int O0000000O00O0 = 3;
   private static final int O0000000O00O00 = 4;
   private static final long O0000000O00O0O = 1200L;
   private static final long O0000000O00OO = 4500L;
   private static final long O0000000O00OO0 = 90L;
   private static final float O0000000O00OOO = (float) (Math.PI * 2);
   private static final long O0000000O0O = 75L;
   private static final double O0000000O0O0 = 1.0;
   private static final double O0000000O0O00 = 4.0;
   private static final int O0000000O0O000 = 3;
   private static final Pattern O0000000O0O00O = Pattern.compile(
      "Вы\\s+купили\\s+(?:[-–—]\\s*)?(?:\\[([^\\]]+)]|(.+?))\\s*(?:[-–—]?\\s*[xхXХ](\\d+))?\\s+у\\s+(.+?)\\s+за\\s+([\\d\\s.,]+)\\s*[¤$]?", 66
   );
   private static final Set<String> O0000000O0O0O = Set.of(
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
      "Талисман Сара",
      "Талисман Сары",
      "Вещи Крушителя",
      "Набор Крушителя",
      "Броня Крушителя",
      "Броня Крушителя с шипами",
      "Броня Крушителя шип",
      "Броня Крушителя без шипов",
      "Броня Крушителя без шип",
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
      "Опыт 50",
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
      "Божье касание",
      "Мощный Удар",
      "Мега Бульдозер",
      "Нерушимые Элитры"
   );
   private static final Set<String> O0000000O0O0O0 = Set.of("Явная Пыль", "Дезориентация", "Трапка", "Отмычка к Сферам");
   public static AutoBuy O000000000O;
   public static boolean O000000000O0 = false;
   public static boolean O000000000O00 = false;
   public static boolean O000000000O000 = false;
   public final ModeSetting O000000000O00O = new ModeSetting("Режим сервера", "FunTime", "FunTime", "SpookyTime", "HolyWorld");
   public final BooleanSetting O000000000O0O = new BooleanSetting("Auto Parse", false);
   public final NumberSetting O000000000O0O0 = new NumberSetting("Парс Скидка %", 20.0F, 1.0F, 100.0F, 1.0F, true)
      .O00000000(() -> !this.O000000000O0O.O0000000000());
   public final BooleanSetting O000000000O0OO = new BooleanSetting("Auto ReParse", false);
   public final NumberSetting O000000000OO = new NumberSetting("ReParse каждые (мин)", 30.0F, 5.0F, 240.0F, 5.0F, false)
      .O00000000(() -> !this.O000000000O0OO.O0000000000());
   public final BooleanSetting O000000000OO0 = new BooleanSetting("Свап анархии (5-10 мин)", false).O00000000(() -> !this.O000000000O00O.O000000000("FunTime"));
   public final NumberSetting O000000000OO00 = new NumberSetting("Кд обновления (мс)", 100.0F, 100.0F, 5000.0F, 50.0F, false);
   public final NumberSetting O000000000OO0O = new NumberSetting("Кд покупки (мс)", 100.0F, 100.0F, 5000.0F, 50.0F, false);
   public final NumberSetting O000000000OOO = new NumberSetting("Кд подтверждения (мс)", 50.0F, 0.0F, 1000.0F, 10.0F, false);
   public final BooleanSetting O000000000OOO0 = new BooleanSetting("Детект замедления аука", true);
   public final BooleanSetting O000000000OOOO = new BooleanSetting("Авто-фикс замедления", true).O00000000(() -> !this.O000000000OOO0.O0000000000());
   public final BooleanSetting O00000000O = new BooleanSetting("Лаг статистика в чат", true).O00000000(() -> !this.O000000000OOO0.O0000000000());
   public final KeybindSetting O00000000O0 = new KeybindSetting("Бинд меню", -1);
   public final NumberSetting O00000000O00 = new NumberSetting("Shulker Profit %", 18.0F, 0.0F, 200.0F, 1.0F, true);
   public final NumberSetting O00000000O000 = new NumberSetting("Shulker Profit $", 50000.0F, 0.0F, 1.0E9F, 10000.0F, false);
   public final NumberSetting O00000000O0000 = new NumberSetting("Shulker Value $", 100000.0F, 0.0F, 1.0E9F, 10000.0F, false);
   public static final Map<String, Long> O00000000O000O = new LinkedHashMap<>();
   public static final Map<String, Integer> O00000000O00O = new LinkedHashMap<>();
   public static final Map<String, Integer> O00000000O00O0 = new LinkedHashMap<>();
   public static final Map<String, Set<String>> O00000000O00OO = new LinkedHashMap<>();
   public static final List<String> O00000000O0O = new ArrayList<>();
   public static final Set<String> O00000000O0O0 = new HashSet<>();
   public static final Map<String, String> O00000000O0O00 = new LinkedHashMap<>();
   public static final List<AutoBuy.W62> O00000000O0O0O = new ArrayList<>();
   private final O0000O00O0000 O0000000O0O0OO = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0OO = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0OO0 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0OO00 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0OO0O = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0OOO = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0OOO0 = new O0000O00O0000();
   private final O0000O00O0000 O0000000O0OOOO = new O0000O00O0000();
   private final O0000O00O0000 O0000000OO = new O0000O00O0000();
   private final O0000O00O0000 O0000000OO0 = new O0000O00O0000();
   private final O0000O00O0000 O0000000OO00 = new O0000O00O0000();
   private boolean O0000000OO000 = false;
   public static long O00000000O0OO = 0L;
   public static long O00000000O0OO0 = 0L;
   public static long O00000000O0OOO = 0L;
   public static long O00000000OO = 0L;
   private int O0000000OO0000 = -1;
   private boolean O0000000OO000O = false;
   private int O0000000OO00O = 0;
   private boolean O0000000OO00O0 = false;
   private String O0000000OO00OO = "";
   private String O0000000OO0O = "";
   private boolean O0000000OO0O0 = false;
   private final List<String> O0000000OO0O00 = new ArrayList<>();
   private int O0000000OO0O0O = 0;
   private boolean O0000000OO0OO = false;
   private boolean O0000000OO0OO0 = false;
   private String O0000000OO0OOO = "";
   private String O0000000OOO = "";
   private int O0000000OOO0 = 0;
   private long O0000000OOO00 = 0L;
   private long O0000000OOO000 = 0L;
   private long O0000000OOO00O = 0L;
   private long O0000000OOO0O = 0L;
   private boolean O0000000OOO0O0 = false;
   private boolean O0000000OOO0OO = false;
   private boolean O0000000OOOO = false;
   private boolean O0000000OOOO0 = false;
   private int O0000000OOOO00 = -1;
   private long O0000000OOOO0O = 0L;
   private long O0000000OOOOO = 0L;
   private long O0000000OOOOO0 = 200L;
   private long O0000000OOOOOO = 50L;
   private long O000000O0 = 0L;
   private long O000000O00 = 0L;
   private long O000000O000 = 0L;
   private long O000000O0000 = 0L;
   private int O000000O00000 = 0;
   private boolean O000000O000000 = false;
   private boolean O000000O00000O = false;
   private boolean O000000O0000O = false;
   private float O000000O0000O0 = 0.0F;
   private float O000000O0000OO = 0.0F;
   private float O000000O000O = 0.0F;
   private float O000000O000O0 = 1.0F;
   private float O000000O000O00 = 0.0F;
   private float O000000O000O0O = 0.0F;
   private float O000000O000OO = 0.0F;
   private float O000000O000OO0 = 0.0F;
   private float O000000O000OOO = 1.0F;
   private float O000000O00O = 0.12F;
   private long O000000O00O0 = 0L;
   private float O000000O00O00 = 0.0F;
   private boolean O000000O00O000 = false;
   private long O000000O00O00O = 0L;
   private double O000000O00O0O = 0.0;
   private double O000000O00O0O0 = 0.0;
   private int O000000O00O0OO = -1;
   private String O000000O00OO = "";
   private long O000000O00OO0 = 0L;
   private String O000000O00OO00 = "";
   private long O000000O00OO0O = 0L;
   private long O000000O00OOO = 0L;
   private int O000000O00OOO0 = 0;
   private boolean O000000O00OOOO = false;
   private long O000000O0O = 0L;
   private long O000000O0O0 = 0L;
   private long O000000O0O00 = 0L;
   private int O000000O0O000 = 0;
   private final Map<Item, List<AutoBuy.W58>> O000000O0O0000 = new HashMap<>();
   private final List<AutoBuy.W58> O000000O0O000O = new ArrayList<>();
   private int O000000O0O00O = Integer.MIN_VALUE;
   private final O000000OOO0OOO O000000O0O00O0 = new O000000OOO0OOO();
   private boolean O000000O0O00OO = false;
   private long O000000O0O0O = 0L;
   private long O000000O0O0O0 = 0L;
   private boolean O000000O0O0O00 = false;
   private long O000000O0O0O0O = 0L;
   private int O000000O0O0OO = 0;
   private long O000000O0O0OO0 = 0L;

   public AutoBuy() {
      O000000000O = this;
      this.O00000000(
         new Setting[]{
            this.O000000000O00O,
            this.O000000000O0O,
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
            this.O00000000O00,
            this.O00000000O000,
            this.O00000000O0000,
            this.O00000000O0
         }
      );
   }

   private long O000000000OO() {
      String var1 = this.O000000000O00O.O0000000000();
      if (var1.equals("FunTime")) {
         return ThreadLocalRandom.current().nextLong(100L, 201L);
      } else {
         return !var1.equals("SpookyTime") && !var1.equals("HolyWorld") ? (long)this.O000000000OO00.O0000000000() : this.O0000000OOOOO0;
      }
   }

   private long O000000000OO0() {
      String var1 = this.O000000000O00O.O0000000000();
      if (var1.equals("FunTime")) {
         return 10L;
      } else {
         return !var1.equals("SpookyTime") && !var1.equals("HolyWorld") ? (long)this.O000000000OO0O.O0000000000() : this.O0000000OOOOOO;
      }
   }

   private void O000000000OO00() {
      this.O0000000OOOOO0 = ThreadLocalRandom.current().nextLong(200L, 401L);
      this.O0000000OOOOOO = ThreadLocalRandom.current().nextLong(30L, 81L);
   }

   public static long O00000000(String string) {
      for (AutoBuy.W62 var2 : O00000000O0O0O) {
         if (var2.O000000000.toLowerCase(Locale.ROOT).contains(string.toLowerCase(Locale.ROOT))) {
            int var3 = Math.max(1, var2.O0000000000);
            return Math.max(1L, (var2.O00000000000 + var3 - 1L) / var3);
         }
      }

      return 0L;
   }

   public static boolean O000000000(String string) {
      String var1 = O0000000000O0(string);
      if (var1.isEmpty()) {
         return false;
      } else {
         O00000000O0O00.put(O0000000000O(var1), var1);
         return true;
      }
   }

   public static boolean O0000000000(String string) {
      String var1 = O0000000000O(string);
      return !var1.isEmpty() && O00000000O0O00.remove(var1) != null;
   }

   public static boolean O00000000000(String string) {
      String var1 = O0000000000O(string);
      return !var1.isEmpty() && O00000000O0O00.containsKey(var1);
   }

   public static void O0000000000O0() {
      O00000000O0O00.clear();
   }

   public static List<String> O0000000000O00() {
      return new ArrayList<>(O00000000O0O00.values());
   }

   private static String O0000000000O(String string) {
      return O0000000000O0(string).toLowerCase(Locale.ROOT);
   }

   private static String O0000000000O0(String string) {
      if (string == null) {
         return "";
      } else {
         String var1 = string.replaceAll("§.", "").replace(' ', ' ').trim();
         if (var1.startsWith("+")) {
            var1 = var1.substring(1).trim();
         }

         return var1;
      }
   }

   public static AutoBuy.W62 O0000000000O0O() {
      return O00000000O0O0O.isEmpty() ? null : O00000000O0O0O.get(0);
   }

   public static int O0000000000OO() {
      int var0 = 0;
      long var1 = O00000000O0OO;

      for (AutoBuy.W62 var4 : O00000000O0O0O) {
         if (var4.O000000000000 >= var1) {
            var0++;
         }
      }

      return var0;
   }

   public static int O0000000000OO0() {
      int var0 = 0;
      long var1 = O00000000O0OO;

      for (AutoBuy.W62 var4 : O00000000O0O0O) {
         if (var4.O000000000000 >= var1) {
            var0 += Math.max(1, var4.O0000000000);
         }
      }

      return var0;
   }

   public static long O0000000000OOO() {
      long var0 = 0L;
      long var2 = O00000000O0OO;

      for (AutoBuy.W62 var5 : O00000000O0O0O) {
         if (var5.O000000000000 >= var2) {
            var0 += Math.max(0L, var5.O00000000000);
         }
      }

      return var0;
   }

   public static long O000000000O() {
      return O00000000O0OO0 > 0L && O00000000O0OOO > 0L ? O00000000O0OOO - O00000000O0OO0 : 0L;
   }

   public File O000000000O0() {
      File var1 = new File(WildClient.O00000000.O0000000000000, "configs/autobuy");
      if (!var1.exists()) {
         var1.mkdirs();
      }

      return var1;
   }

   public void O000000000000(String string) {
      try {
         File var2 = this.O000000000O0();
         File var3 = new File(var2, string + ".json");
         JsonObject var4 = this.b_();

         try (FileWriter var5 = new FileWriter(var3)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(var4, var5);
         }
      } catch (Exception var10) {
         var10.printStackTrace();
      }
   }

   public void O0000000000000(String string) {
      try {
         File var2 = new File(this.O000000000O0(), string + ".json");
         if (!var2.exists()) {
            return;
         }

         try (FileReader var3 = new FileReader(var2)) {
            JsonObject var4 = JsonParser.parseReader(var3).getAsJsonObject();
            this.O00000000(var4);
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   public void O000000000000O(String string) {
      try {
         File var2 = new File(this.O000000000O0(), string + ".json");
         if (var2.exists()) {
            var2.delete();
         }
      } catch (Exception var3) {
      }
   }

   public void O00000000(String string, String string2) {
      if (!string.equals(string2)) {
         try {
            File var3 = this.O000000000O0();
            File var4 = new File(var3, string + ".json");
            File var5 = new File(var3, string2 + ".json");
            if (var4.exists() && !var5.exists()) {
               var4.renameTo(var5);
            }
         } catch (Exception var6) {
         }
      }
   }

   @Override
   public JsonObject b_() {
      JsonObject var1 = super.b_();
      JsonObject var2 = new JsonObject();
      JsonObject var3 = new JsonObject();

      for (Entry var5 : O00000000O000O.entrySet()) {
         var3.addProperty((String)var5.getKey(), (Number)var5.getValue());
      }

      JsonObject var14 = new JsonObject();
      LinkedHashSet var15 = new LinkedHashSet();
      var15.addAll(O00000000O00O.keySet());
      var15.addAll(O00000000O00O0.keySet());

      for (String var7 : (Set<String>)var15) {
         int var8 = O00000000000O0(var7);
         int var9 = O00000000000OO(var7);
         if (var8 > 0 || var9 < 100) {
            JsonObject var10 = new JsonObject();
            var10.addProperty("min", var8);
            var10.addProperty("max", var9);
            var14.add(var7, var10);
         }
      }

      JsonObject var16 = new JsonObject();

      for (Entry var19 : O00000000O00OO.entrySet()) {
         if (var19.getValue() != null && !((Set)var19.getValue()).isEmpty()) {
            JsonArray var22 = new JsonArray();

            for (String var11 : (Set<String>)var19.getValue()) {
               var22.add(var11);
            }

            var16.add((String)var19.getKey(), var22);
         }
      }

      JsonArray var18 = new JsonArray();

      for (String var23 : O00000000O0O) {
         var18.add(var23);
      }

      JsonArray var21 = new JsonArray();

      for (String var27 : O00000000O0O0) {
         var21.add(var27);
      }

      JsonArray var25 = new JsonArray();

      for (String var30 : O00000000O0O00.values()) {
         var25.add(var30);
      }

      JsonArray var29 = new JsonArray();

      for (AutoBuy.W62 var12 : O00000000O0O0O) {
         JsonObject var13 = new JsonObject();
         var13.addProperty("original", var12.O00000000);
         var13.addProperty("clean", var12.O000000000);
         var13.addProperty("qty", var12.O0000000000);
         var13.addProperty("price", var12.O00000000000);
         var13.addProperty("time", var12.O000000000000);
         var29.add(var13);
      }

      var2.add("Prices", var3);
      var2.add("DurabilityRanges", var14);
      var2.add("DisabledEnchantments", var16);
      var2.add("ParseItems", var18);
      var2.add("InactiveItems", var21);
      var2.add("IgnoredSellers", var25);
      var2.add("History", var29);
      var1.add("AutoBuyData", var2);
      return var1;
   }

   @Override
   public void O00000000(JsonObject jsonObject) {
      super.O00000000(jsonObject);
      if (!this.O000000000O00O.O00000000000.contains(this.O000000000O00O.O000000000000)) {
         this.O000000000O00O.O00000000000O = 0;
         this.O000000000O00O.O000000000000 = this.O000000000O00O.O00000000000.get(0);
      } else {
         this.O000000000O00O.O00000000000O = this.O000000000O00O.O00000000000.indexOf(this.O000000000O00O.O000000000000);
      }

      if (jsonObject != null && jsonObject.has("AutoBuyData") && jsonObject.get("AutoBuyData").isJsonObject()) {
         JsonObject var2 = jsonObject.getAsJsonObject("AutoBuyData");
         O00000000O000O.clear();
         O00000000O00O.clear();
         O00000000O00O0.clear();
         O00000000O00OO.clear();
         O00000000O0O.clear();
         O00000000O0O0.clear();
         O00000000O0O00.clear();
         O00000000O0O0O.clear();
         if (var2.has("Prices") && var2.get("Prices").isJsonObject()) {
            JsonObject var3 = var2.getAsJsonObject("Prices");

            for (String var5 : var3.keySet()) {
               try {
                  O00000000O000O.put(var5, var3.get(var5).getAsLong());
               } catch (Exception var12) {
               }
            }
         }

         if (var2.has("DurabilityRanges") && var2.get("DurabilityRanges").isJsonObject()) {
            JsonObject var14 = var2.getAsJsonObject("DurabilityRanges");

            for (String var28 : var14.keySet()) {
               try {
                  JsonObject var6 = var14.getAsJsonObject(var28);
                  O00000000(var28, var6.has("min") ? var6.get("min").getAsInt() : 0, var6.has("max") ? var6.get("max").getAsInt() : 100);
               } catch (Exception var11) {
               }
            }
         }

         if (var2.has("DurabilityThresholds") && var2.get("DurabilityThresholds").isJsonObject()) {
            JsonObject var15 = var2.getAsJsonObject("DurabilityThresholds");

            for (String var29 : var15.keySet()) {
               try {
                  O00000000(var29, var15.get(var29).getAsInt());
               } catch (Exception var10) {
               }
            }
         }

         if (var2.has("DisabledEnchantments") && var2.get("DisabledEnchantments").isJsonObject()) {
            JsonObject var16 = var2.getAsJsonObject("DisabledEnchantments");

            for (String var30 : var16.keySet()) {
               try {
                  JsonArray var32 = var16.getAsJsonArray(var30);
                  LinkedHashSet var7 = new LinkedHashSet();

                  for (JsonElement var9 : var32) {
                     if (var9.isJsonPrimitive()) {
                        var7.add(O000000OOOO000.O000000000000(var9.getAsString()));
                     }
                  }

                  if (!var7.isEmpty()) {
                     O00000000O00OO.put(var30, var7);
                  }
               } catch (Exception var13) {
               }
            }
         }

         if (var2.has("ParseItems") && var2.get("ParseItems").isJsonArray()) {
            for (JsonElement var24 : var2.getAsJsonArray("ParseItems")) {
               if (var24.isJsonPrimitive()) {
                  O00000000O0O.add(var24.getAsString());
               }
            }
         }

         if (var2.has("InactiveItems") && var2.get("InactiveItems").isJsonArray()) {
            for (JsonElement var25 : var2.getAsJsonArray("InactiveItems")) {
               if (var25.isJsonPrimitive()) {
                  O00000000O0O0.add(var25.getAsString());
               }
            }
         }

         if (var2.has("IgnoredSellers") && var2.get("IgnoredSellers").isJsonArray()) {
            for (JsonElement var26 : var2.getAsJsonArray("IgnoredSellers")) {
               if (var26.isJsonPrimitive()) {
                  O000000000(var26.getAsString());
               }
            }
         }

         if (var2.has("History") && var2.get("History").isJsonArray()) {
            for (JsonElement var27 : var2.getAsJsonArray("History")) {
               if (var27.isJsonObject()) {
                  JsonObject var31 = var27.getAsJsonObject();
                  O00000000O0O0O.add(
                     new AutoBuy.W62(
                        var31.get("original").getAsString(),
                        var31.get("clean").getAsString(),
                        var31.get("qty").getAsInt(),
                        var31.get("price").getAsLong(),
                        var31.get("time").getAsLong()
                     )
                  );
               }
            }
         }

         this.O0000000O00000();
      }
   }

   @Override
   public void c_() {
      super.c_();
      O00000000O000O.clear();
      O00000000O00O.clear();
      O00000000O00O0.clear();
      O00000000O00OO.clear();
      O00000000O0O.clear();
      O00000000O0O0.clear();
      O00000000O0O00.clear();
      O00000000O0O0O.clear();
      this.O0000000O00000();
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O000000000OO00();
      this.O00000000O0O00();
      this.O00000000O0O0O();
      this.O00000000OO00O();
      this.O00000000O0OO();
      O00000000O0OO = System.currentTimeMillis();
      this.O0000000OO000 = false;
      O00000000O0OO0 = 0L;
      O00000000O0OOO = 0L;
      O00000000OO = 0L;
      if (this.O000000000O00O.O000000000("FunTime")) {
         try {
            O0000O000OOOO var1 = new O0000O000OOOO();
            var1.O00000000();
            String var2 = var1.O0000000000000();
            if (!var2.isEmpty() && !var2.equals("0")) {
               O00000000O0OO0 = Long.parseLong(var2);
               O00000000O0OOO = O00000000O0OO0;
               this.O0000000OO000 = true;
            }
         } catch (Exception var3) {
         }
      }

      this.O0000000O0OO00.O00000000();
      this.O0000000OO.O00000000();
      this.O0000000OO0.O00000000();
      this.O0000000OO00.O00000000();
      this.O0000000OO000O = false;
      this.O0000000OO00O = 0;
      this.O0000000OO0O = "";
      this.O0000000OOO00 = 0L;
      this.O0000000OOO000 = 0L;
      this.O0000000OOO0O0 = false;
      this.O0000000OOO0OO = false;
      this.O0000000OOOO0 = false;
      this.O0000000OOOO00 = -1;
      this.O0000000OOOO0O = 0L;
      this.O0000000OOOOO = 0L;
      this.O0000000OO00O0 = false;
      this.O0000000OO0O0 = false;
      this.O0000000OO0O0O = 0;
      this.O0000000OO0OO0 = false;
      this.O0000000OO0OOO = "";
      this.O0000000OOO00O = 0L;
      this.O0000000OOO0O = 0L;
      this.O0000000OOOO = false;
      this.O00000000OOOO();
      this.O00000000OOOO0();
      this.O0000000O00000();
      this.O000000O0O00O0.O00000000();
      this.O000000O0O00OO = false;
      this.O000000O0O0O = 0L;
      this.O000000O0O0O0 = 0L;
      this.O00000000O();
      O000000OO000OO.O00000000();
      this.O0000000OO0OO = this.O000000000O0O.O0000000000();
   }

   private void O000000000OO0O() {
      if (!this.O000000000OOO0.O0000000000()) {
         this.O000000O0O00O0.O0000000000();
         this.O000000O0O00OO = false;
      } else {
         this.O000000O0O00O0.O00000000000();
         long var1 = System.currentTimeMillis();
         boolean var3 = this.O000000O0O00O0.O000000000000();
         if (var3 && !this.O000000O0O00OO) {
            this.O000000O0O00OO = true;
            this.O000000O0O0O0 = var1;
            if (ClientUtil.O000000000O.O0000000000()) {
               ru.metaculture.protection.O0000000OO0O00.O00000000(
                  "[AutoBuy] Сервер замедлил аукцион: отклик ~"
                     + this.O000000O0O00O0.O000000000000O()
                     + "мс, норма ~"
                     + this.O000000O0O00O0.O00000000000O()
                     + "мс, пинг "
                     + this.O00000000O0()
               );
            }

            if (this.O000000000OOO()) {
               this.O000000000OOO0();
            }
         } else if (!var3 && this.O000000O0O00OO) {
            this.O000000O0O00OO = false;
         }

         if (this.O00000000O.O0000000000() && this.O000000O0O00O0.O0000000000O() > 0 && var1 - this.O000000O0O0O >= 2000L) {
            this.O000000O0O0O = var1;
            ChatUtil.O00000000("§7[AutoBuy] " + this.O000000O0O00O0.O00000000000O0());
         }
      }
   }

   private boolean O000000000OOO() {
      return this.O000000000OOOO.O0000000000()
         && (this.O000000000O00O.O000000000("FunTime") || this.O000000000O00O.O000000000("HolyWorld"))
         && !O000000000O0
         && !O000000000O00
         && !this.O0000000OO00O0
         && !this.O000000000O0O.O0000000000()
         && !this.O0000000OO0O0
         && !this.O00000000OOOOO()
         && !this.O000000O0O0O00;
   }

   private void O000000000OOO0() {
      long var1 = System.currentTimeMillis();
      this.O000000O0O0OO = var1 - this.O000000O0O0OO0 <= 240000L ? Math.min(2, this.O000000O0O0OO + 1) : 0;
      this.O000000O0O0OO0 = var1;
      this.O000000O0O00O0.O000000000();
      this.O000000O0O00OO = false;
      if (this.O000000000O00O.O000000000("FunTime") && this.O000000O0O0OO >= 1) {
         if (this.O000000O0O0OO >= 2) {
            this.O0000000O();
         } else {
            this.O0000000O0000O();
         }
      } else {
         this.O000000O0O0O00 = true;
         this.O000000O0O0O0O = var1 + ThreadLocalRandom.current().nextLong(4000L, 8001L);
         this.O0000000OO000O = false;
         this.O0000000OOO0O0 = false;
         this.O0000000OO0O = "";
         this.O00000000OOOO();
         if (O0000000000.player != null && O0000000000.currentScreen != null) {
            O0000000000.player.closeScreen();
         }
      }
   }

   private boolean O000000000OOOO() {
      if (!this.O000000O0O0O00) {
         return false;
      } else {
         if (O0000000000.player != null && O0000000000.currentScreen != null) {
            O0000000000.player.closeScreen();
         }

         if (System.currentTimeMillis() < this.O000000O0O0O0O) {
            return true;
         } else {
            this.O000000O0O0O00 = false;
            this.O000000O0O0O0O = 0L;
            this.O00000000(0L, false);
            return true;
         }
      }
   }

   private void O00000000O() {
      this.O000000O0O0O00 = false;
      this.O000000O0O0O0O = 0L;
      this.O000000O0O0OO = 0;
      this.O000000O0O0OO0 = 0L;
   }

   private String O00000000O0() {
      int var1 = this.O00000000O00();
      return var1 < 0 ? "?" : var1 + "мс";
   }

   private int O00000000O00() {
      if (O0000000000.player != null && O0000000000.getNetworkHandler() != null) {
         PlayerListEntry var1 = O0000000000.getNetworkHandler().getPlayerListEntry(O0000000000.player.getUuid());
         return var1 == null ? -1 : var1.getLatency();
      } else {
         return -1;
      }
   }

   public boolean O000000000O00() {
      return this.O000000000OOO0.O0000000000() && this.O000000O0O00O0.O000000000000();
   }

   public O000000OOO0OOO O000000000O000() {
      return this.O000000O0O00O0;
   }

   private void O00000000O000() {
      if (this.O000000000O00O.O000000000("FunTime")) {
         try {
            long var1 = System.currentTimeMillis();
            if (var1 - this.O0000000OOOOO < 1000L) {
               return;
            }

            this.O0000000OOOOO = var1;
            O0000O000OOOO var3 = new O0000O000OOOO();
            var3.O00000000();
            String var4 = var3.O0000000000000();
            if (var4.isEmpty() || var4.equals("0")) {
               return;
            }

            O00000000O0OOO = Long.parseLong(var4);
            if (O00000000OO == 0L && O00000000O0OO0 > 0L && O0000000000OOO() > 0L && O00000000O0OOO >= O00000000O0OO0) {
               O00000000OO = System.currentTimeMillis();
            }
         } catch (Exception var5) {
         }
      }
   }

   private void O00000000O0000() {
      if (this.O000000000O00O.O000000000("FunTime")) {
         if (!this.O0000000OO000) {
            try {
               O0000O000OOOO var1 = new O0000O000OOOO();
               var1.O00000000();
               String var2 = var1.O0000000000000();
               if (!var2.isEmpty() && !var2.equals("0")) {
                  O00000000O0OO0 = Long.parseLong(var2);
                  O00000000O0OOO = O00000000O0OO0;
                  this.O0000000OO000 = true;
               }
            } catch (Exception var3) {
            }
         } else {
            this.O00000000O000();
         }
      }
   }

   @Override
   public void O000000000() {
      boolean var1 = this.O000000000O0O.O0000000000();
      if (!var1) {
         this.O0000000O0O000();
      }

      this.O0000000OO000O = false;
      this.O0000000OO00O = 0;
      this.O0000000OO00O0 = false;
      this.O0000000OO00OO = "";
      this.O0000000OO0O = "";
      this.O0000000OOO00 = 0L;
      this.O0000000OOO000 = 0L;
      this.O0000000OOO0O0 = false;
      this.O0000000OOO0OO = false;
      this.O0000000OOOO0 = false;
      this.O0000000OOOO00 = -1;
      this.O0000000OOOO0O = 0L;
      this.O00000000OOOO();
      this.O00000000OOOO0();
      this.O000000O0O00O0.O0000000000();
      this.O000000O0O00OO = false;
      this.O00000000O();
      this.O0000000OO000 = false;
      O000000OO000OO.O00000000();
      this.O00000000O0O00();
      this.O00000000O0O0O();
      this.O00000000OO00O();
      ReconnectCommand var2 = ReconnectCommand.O00000000000();
      if (var2 != null) {
         var2.O00000000(false);
      }

      super.O000000000();
      if (var1) {
         this.O0000000O0O0O();
      }
   }

   private void O00000000O000O() {
      ReconnectCommand var1 = ReconnectCommand.O00000000000();
      if (var1 != null) {
         var1.O00000000(this.O0000000000000 && this.O000000000OO0.O0000000000() && this.O000000000O00O.O000000000("FunTime"));
      }
   }

   public static void O000000000O00O() {
      AutoBuy var0 = O000000000O;
      if (var0 != null) {
         var0.O0000000O0O000();
         var0.O0000000OO000O = false;
         var0.O0000000OO00O = 0;
         var0.O0000000OO00O0 = false;
         var0.O0000000OO00OO = "";
         var0.O0000000OO0O = "";
         var0.O0000000OOO00 = 0L;
         var0.O0000000OOO000 = 0L;
         var0.O0000000OOO0O0 = false;
         var0.O0000000OOO0OO = false;
         var0.O0000000OOOO0 = false;
         var0.O0000000OOOO00 = -1;
         var0.O0000000OOOO0O = 0L;
         var0.O0000000OO0O0 = false;
         var0.O0000000OO0O0O = 0;
         var0.O0000000OO0OO0 = false;
         var0.O0000000OO0OOO = "";
         var0.O0000000OOO00O = 0L;
         var0.O0000000OOO0O = 0L;
         var0.O0000000OOOO = false;
         var0.O00000000O0O00();
         var0.O00000000O0O0O();
         var0.O00000000OO00O();
         var0.O00000000O();
      }

      O000000000O0 = false;
      O000000000O00 = false;
      O000000000O000 = false;
      O000000OO000OO.O00000000();
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (this.O0000000000000) {
         if (o0000000O0O0.O0000000000000() == 1 && o0000000O0O0.O00000000000() == this.O00000000O0.O0000000000() && O0000000000.currentScreen == null) {
            O0000000000.setScreen(new AutoBuyScreen());
            o0000000O0O0.O000000000();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         this.O00000000O000O();
         if (!this.O0000000000000) {
            this.O0000000O0O00O();
            this.O00000000OO0();
         } else {
            this.O00000000OO0();
            O000000OO000OO.O000000000();
            this.O000000000OO0O();
            if (!this.O00000000O00O0()) {
               if (!this.O000000000O0OO.O0000000000() && !this.O0000000OO0OO0) {
                  this.O0000000OO.O00000000();
               }

               this.O0000000O00OOO();
               if (this.O0000000OO00O0) {
                  if (this.O0000000O0OOOO.O000000000000(1500L)) {
                     O0000000000.player.networkHandler.sendChatCommand("an" + this.O0000000OO00OO);
                     this.O0000000OO00O0 = false;
                     this.O000000000OO(this.O0000000OO00OO);
                  }
               } else if (!this.O000000000O00O.O000000000("FunTime") && !this.O000000000O00O.O000000000("HolyWorld")
                  || this.O000000000O0O.O0000000000()
                  || !this.O0000000OO000O
                  || !this.O0000000O00O()) {
                  if (!O000000000O0 && !O000000000O00) {
                     if (!this.O000000000O00O.O000000000("FunTime") || this.O000000000O0O.O0000000000() || !this.O0000000O0O()) {
                        this.O00000000O0000();
                        boolean var2 = this.O000000000O0O.O0000000000();
                        if (var2 && !this.O0000000OO0OO) {
                           var2 = this.O000000000000(false);
                        } else if (!var2 && this.O0000000OO0OO) {
                           this.O00000000OOO();
                        }

                        this.O0000000OO0OO = var2;
                        if (var2 && !this.O0000000OO0O00.isEmpty()) {
                           this.O000000000O0O();
                           this.O00000000OO0();
                        } else if (!this.O000000000OOOO()) {
                           if (this.O00000000OOOOO()) {
                              this.O0000000O0();
                           } else {
                              if (this.O000000000O00O.O000000000("FunTime") && !this.O000000000O0O.O0000000000()) {
                                 if (this.O00000000OOO0()) {
                                    return;
                                 }

                                 if (this.O0000000O0OO00.O000000000000(80000L)) {
                                    this.O0000000O0000O();
                                    return;
                                 }

                                 if (this.O0000000OO000O && this.O0000000O00O()) {
                                    return;
                                 }

                                 if (this.O0000000O00O00()) {
                                    return;
                                 }
                              }

                              if (O0000000000.currentScreen instanceof GenericContainerScreen var4) {
                                 GenericContainerScreenHandler var5 = (GenericContainerScreenHandler)var4.getScreenHandler();
                                 if (this.O0000000000(var4)) {
                                    if (this.O0000000O0OO0.O000000000000((long)this.O000000000OOO.O0000000000())) {
                                       int var10 = this.O0000000000(var5);
                                       if (var10 != -1 && this.O0000000000000(var4)) {
                                          O0000000000.interactionManager.clickSlot(var5.syncId, var10, 0, SlotActionType.PICKUP, O0000000000.player);
                                       } else {
                                          this.O0000000000000(var5);
                                       }

                                       this.O0000000O0OO0.O00000000();
                                    }

                                    return;
                                 }

                                 if (this.O00000000000(var4) && !this.O0000000OO0O0) {
                                    if (this.O000000000O00O.O000000000("HolyWorld")) {
                                       this.O000000000(var4);
                                       return;
                                    }

                                    boolean var6 = false;

                                    for (int var7 = 0; var7 < 45; var7++) {
                                       Slot var8 = var5.getSlot(var7);
                                       if (this.O000000000(var8)) {
                                          String var9 = this.O00000000000(var8);
                                          if (var9 != null) {
                                             var6 = true;
                                             if (this.O0000000O0OO.O000000000000(this.O000000000OO0())) {
                                                if (!this.O000000000O00O.O000000000("FunTime") && !this.O000000000O00O.O000000000("SpookyTime")) {
                                                   this.O0000000000OOO(var9);
                                                   O0000000000.interactionManager.clickSlot(var5.syncId, var7, 0, SlotActionType.PICKUP, O0000000000.player);
                                                } else {
                                                   this.O000000O00OOO = System.currentTimeMillis();
                                                   O0000000000.interactionManager
                                                      .clickSlot(var5.syncId, var7, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
                                                }

                                                this.O0000000O0OO.O00000000();
                                                this.O0000000O0OO0.O00000000();
                                                this.O000000000OO00();
                                                return;
                                             }
                                             break;
                                          }
                                       }
                                    }

                                    if (!var6 && this.O0000000O0O0OO.O000000000000(this.O000000000OO()) && var5.slots.size() > 49) {
                                       this.O000000O0O00O0.O00000000(var5.syncId);
                                       O0000000000.interactionManager.clickSlot(var5.syncId, 49, 0, SlotActionType.PICKUP, O0000000000.player);
                                       this.O0000000O0O0OO.O00000000();
                                       this.O000000000OO00();
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         this.O00000000OO00O();
      }
   }

   @EventHandler
   public void O00000000(O0000000O0OOOO o0000000O0OOOO) {
      if (O0000000000.player != null) {
         if (this.O0000000000000 && this.O000000000O00O.O000000000("HolyWorld") && this.O000000O00000 != 0) {
            this.O0000000000(o0000000O0OOOO);
         } else {
            if (this.O00000000O0OO0()) {
               this.O000000000(o0000000O0OOOO);
            }
         }
      }
   }

   private void O000000000(GenericContainerScreen genericContainerScreen) {
      ScreenHandler var2 = genericContainerScreen.getScreenHandler();
      boolean var3 = false;
      int var4 = Math.min(45, var2.slots.size());

      for (int var5 = 0; var5 < var4; var5++) {
         Slot var6 = var2.getSlot(var5);
         if (this.O000000000(var6)) {
            String var7 = this.O00000000000(var6);
            if (var7 != null) {
               var3 = true;
               if (this.O00000000(var5, var7) && this.O0000000O0OO.O000000000000(this.O000000000OO0())) {
                  this.O00000000O0O();
                  this.O0000000000OOO(var7);
                  O0000000000.interactionManager.clickSlot(var2.syncId, var5, 0, SlotActionType.PICKUP, O0000000000.player);
                  this.O00000000O00O();
                  this.O0000000O0OO.O00000000();
                  this.O0000000O0OO0.O00000000();
                  this.O000000000OO00();
                  return;
               }
               break;
            }
         }
      }

      if (!var3 && this.O0000000O0O0OO.O000000000000(this.O000000000OO())) {
         int var8 = this.O00000000(var2);
         if (var8 != -1) {
            this.O000000O0O00O0.O00000000(var2.syncId);
            O0000000000.interactionManager.clickSlot(var2.syncId, var8, 0, SlotActionType.PICKUP, O0000000000.player);
            this.O00000000O00O();
            this.O0000000O0O0OO.O00000000();
            this.O000000000OO00();
         }
      } else if (!var3) {
         this.O00000000O00O();
      }
   }

   private boolean O00000000(int i, String string) {
      long var3 = System.currentTimeMillis();
      if (this.O000000O00O0OO == i && Objects.equals(this.O000000O00OO, string)) {
         return var3 - this.O000000O00OO0 >= 90L;
      } else {
         this.O000000O00O0OO = i;
         this.O000000O00OO = string;
         this.O000000O00OO0 = var3;
         return false;
      }
   }

   private void O00000000O00O() {
      this.O000000O00O0OO = -1;
      this.O000000O00OO = "";
      this.O000000O00OO0 = 0L;
   }

   private int O00000000(ScreenHandler screenHandler) {
      int var2 = this.O00000000000(screenHandler);
      if (var2 <= 0) {
         var2 = Math.min(54, screenHandler.slots.size());
      }

      for (int var3 = Math.min(45, var2); var3 < var2; var3++) {
         if (this.O000000000(screenHandler.getSlot(var3).getStack())) {
            return var3;
         }
      }

      for (int var4 = 0; var4 < var2; var4++) {
         if (this.O000000000(screenHandler.getSlot(var4).getStack())) {
            return var4;
         }
      }

      return -1;
   }

   private boolean O000000000(ItemStack itemStack) {
      return itemStack != null && !itemStack.isEmpty() && itemStack.isOf(Items.EMERALD)
         ? this.O000000000O(this.O00000000000OO(itemStack)).contains("обновитьаукцион")
         : false;
   }

   private boolean O00000000O00O0() {
      if (!this.O000000000O00O.O000000000("HolyWorld")) {
         this.O00000000O0O00();
         return false;
      } else {
         long var1 = System.currentTimeMillis();
         if (this.O000000O00000 != 0 && var1 >= this.O000000O000) {
            this.O00000000O0O0();
            return true;
         } else if (this.O000000O00000 == 3 && this.O000000O00000O) {
            return true;
         } else {
            if (this.O00000000(var1)) {
               this.O00000000O00OO();
               this.O00000000O0OO();
            }

            return false;
         }
      }
   }

   private boolean O00000000(long l) {
      if (this.O000000O00000 != 0) {
         return false;
      } else if (l < this.O000000O0) {
         return false;
      } else if (!O000000000O0 && !O000000000O00 && !this.O0000000OO00O0 && !this.O000000000O0O.O0000000000() && !this.O0000000OO0O0 && !this.O0000000OO000O) {
         return O0000000000.currentScreen instanceof GenericContainerScreen var3 ? this.O00000000000(var3) : false;
      } else {
         return false;
      }
   }

   private void O00000000O00OO() {
      double var1 = ThreadLocalRandom.current().nextDouble();
      if (var1 < 0.42) {
         this.O00000000(4, ThreadLocalRandom.current().nextLong(650L, 2200L));
      } else if (var1 < 0.7) {
         this.O00000000(1, ThreadLocalRandom.current().nextLong(1000L, 2800L));
      } else {
         this.O00000000(2, ThreadLocalRandom.current().nextLong(1200L, 3000L));
      }
   }

   private void O00000000O0O() {
      if (this.O000000O00000 == 0 && O0000000000.player != null) {
         this.O00000000(2, ThreadLocalRandom.current().nextLong(900L, 1501L));
      }
   }

   private void O0000000000(boolean bl) {
      boolean var2 = !bl || O000000OO000OO.O0000000000();
      this.O000000O00000O = var2;
      this.O000000O0000O = bl;
      if (O0000000000.player != null) {
         this.O00000000(3, ThreadLocalRandom.current().nextLong(900L, 1601L));
      } else if (var2) {
         O000000OO000OO.O0000000000(bl);
         return;
      }

      if (!var2) {
         O000000OO000OO.O0000000000(true);
      }
   }

   private void O00000000(int i, long l) {
      this.O000000O00000 = i;
      this.O000000O00 = System.currentTimeMillis();
      this.O000000O000 = this.O000000O00 + l;
      this.O000000O0000 = 0L;
      this.O000000O0000O0 = O0000000000.player.getYaw();
      this.O000000O0000OO = O0000000000.player.getPitch();
      this.O000000O000O = (float)ThreadLocalRandom.current().nextDouble(0.0, Math.PI * 2);
      this.O000000O000O0 = ThreadLocalRandom.current().nextBoolean() ? 1.0F : -1.0F;
      this.O000000O000OOO = 1.0F;
      this.O000000O00O = (float)ThreadLocalRandom.current().nextDouble(0.06, 0.32);
      if (i == 4) {
         int var4 = ThreadLocalRandom.current().nextInt(1, 4);
         this.O000000O000O00 = 360.0F * var4 + (float)ThreadLocalRandom.current().nextDouble(-90.0, 90.0);
         this.O000000O000O0O = (float)ThreadLocalRandom.current().nextDouble(8.0, 45.0);
         this.O000000O000OO = 0.0F;
         this.O000000O000OO0 = (float)ThreadLocalRandom.current().nextDouble(-15.0, 15.0);
         this.O000000O000OOO = (float)ThreadLocalRandom.current().nextDouble(1.0, 4.0);
      } else if (i == 1) {
         this.O000000O000O00 = (float)ThreadLocalRandom.current().nextDouble(18.0, 55.0);
         this.O000000O000O0O = (float)ThreadLocalRandom.current().nextDouble(5.0, 18.0);
         this.O000000O000OO = this.O000000O000O0 * (float)ThreadLocalRandom.current().nextDouble(8.0, 40.0);
         this.O000000O000OO0 = (float)ThreadLocalRandom.current().nextDouble(-6.0, 6.0);
      } else if (i == 2) {
         this.O000000O000O00 = (float)ThreadLocalRandom.current().nextDouble(8.0, 32.0);
         this.O000000O000O0O = (float)ThreadLocalRandom.current().nextDouble(3.0, 13.0);
         this.O000000O000OO = this.O000000O000O0 * (float)ThreadLocalRandom.current().nextDouble(4.0, 20.0);
         this.O000000O000OO0 = (float)ThreadLocalRandom.current().nextDouble(-5.0, 5.0);
      } else {
         this.O000000O000O00 = (float)ThreadLocalRandom.current().nextDouble(12.0, 40.0);
         this.O000000O000O0O = (float)ThreadLocalRandom.current().nextDouble(-8.0, 8.0);
         this.O000000O000OO = this.O000000O000O0 * (float)ThreadLocalRandom.current().nextDouble(10.0, 30.0);
         this.O000000O000OO0 = (float)ThreadLocalRandom.current().nextDouble(-6.0, 6.0);
      }
   }

   private void O00000000O0O0() {
      boolean var1 = this.O000000O000000;
      boolean var2 = this.O000000O00000O;
      boolean var3 = this.O000000O0000O;
      this.O00000000O0O00();
      if (var2) {
         O000000OO000OO.O0000000000(var3);
      } else {
         if (var1 && O0000000000.player != null) {
            O0000000000.player.networkHandler.sendChatCommand("ah");
         }
      }
   }

   private void O00000000O0O00() {
      this.O000000O00000 = 0;
      this.O000000O00 = 0L;
      this.O000000O000 = 0L;
      this.O000000O0000 = 0L;
      this.O000000O000000 = false;
      this.O000000O00000O = false;
      this.O000000O0000O = false;
      this.O000000O000OO = 0.0F;
      this.O000000O000OO0 = 0.0F;
      this.O00000000O00O();
   }

   private void O00000000O0O0O() {
      this.O000000O00O0 = 0L;
      this.O000000O00O00 = 0.0F;
   }

   private void O00000000O0OO() {
      this.O000000O0 = System.currentTimeMillis() + ThreadLocalRandom.current().nextLong(1200L, 4501L);
   }

   private boolean O00000000O0OO0() {
      if (!this.O000000000O00O.O000000000("FunTime") || O0000000000.world == null || O0000000000.player == null) {
         this.O00000000O0O0O();
         return false;
      } else if (!this.O0000000000000 && !this.O000000000O0O.O0000000000() && !this.O0000000OO0O0 && !this.O0000000OO0OO0) {
         this.O00000000O0O0O();
         return false;
      } else {
         return true;
      }
   }

   private void O000000000(O0000000O0OOOO o0000000O0OOOO) {
      float var2 = this.O00000000OO();
      this.O000000O00O00 += 0.185F * var2;
      if (this.O000000O00O00 > (float) (Math.PI * 2)) {
         this.O000000O00O00 = this.O000000O00O00 - (float) (Math.PI * 2) * (float)Math.floor(this.O000000O00O00 / (float) (Math.PI * 2));
      }

      float var3 = this.O000000O00O00;
      float var4 = (float)Math.sin(var3) * 0.82F + (float)Math.sin(var3 * 2.25F + 0.75F) * 0.16F + (float)Math.cos(var3 * 2.35F) * 0.06F;
      float var5 = (float)Math.cos(var3 * 1.18F + 0.45F) * 0.28F + (float)Math.sin(var3 * 2.05F) * 0.07F;
      o0000000O0OOOO.O00000000(o0000000O0OOOO.O0000000000() + var4);
      o0000000O0OOOO.O000000000(MathHelper.clamp(o0000000O0OOOO.O00000000000() + var5, -89.0F, 89.0F));
   }

   private void O0000000000(O0000000O0OOOO o0000000O0OOOO) {
      long var2 = System.currentTimeMillis();
      float var4 = Math.max(1.0F, (float)(this.O000000O000 - this.O000000O00));
      float var5 = MathHelper.clamp((float)(var2 - this.O000000O00) / var4, 0.0F, 1.0F);
      float var6 = var5 * var5 * (3.0F - 2.0F * var5);
      if (this.O000000O00000 == 4) {
         float var11 = this.O000000O0000O0 + this.O000000O000O0 * this.O000000O000O00 * var6;
         float var13 = this.O000000O0000OO
            + (float)Math.sin(this.O000000O000O + var6 * (float) (Math.PI * 2) * this.O000000O000OOO) * this.O000000O000O0O
            + this.O000000O000OO0 * var6;
         this.O000000000(var11, var13, o0000000O0OOOO);
      } else {
         float var7 = this.O000000O0000O0;
         float var8 = this.O000000O0000OO;
         if (this.O000000O00000 == 1) {
            float var9 = this.O000000O000O + this.O000000O000O0 * var6 * (float) (Math.PI * 11.0 / 5.0);
            var7 += (float)Math.sin(var9) * this.O000000O000O00 + this.O000000O000O0 * var6 * 4.0F;
            var8 += (float)Math.cos(var9 * 0.85F) * this.O000000O000O0O;
         } else if (this.O000000O00000 == 2) {
            float var14 = this.O000000O000O + var6 * 5.3407073F;
            var7 += (float)Math.sin(var14) * this.O000000O000O00;
            var8 += (float)Math.sin(var14 * 0.55F) * this.O000000O000O0O;
         } else if (this.O000000O00000 == 3) {
            var7 += this.O000000O000O0 * this.O000000O000O00 * var6 + (float)Math.sin(this.O000000O000O + var6 * Math.PI) * 1.8F;
            var8 += this.O000000O000O0O * var6;
         }

         var7 += this.O000000O000OO * var6;
         var8 += this.O000000O000OO0 * var6;
         this.O00000000(var7, var8, o0000000O0OOOO);
      }
   }

   private void O00000000(float f, float g, O0000000O0OOOO o0000000O0OOOO) {
      float var4 = O0000000000.player.getYaw();
      float var5 = O0000000000.player.getPitch();
      float var6 = this.O00000000O0OOO();
      float var7 = this.O000000O00O;
      float var8 = 1.0F - (float)Math.pow(1.0F - var7, var6);
      float var9 = var4 + MathHelper.wrapDegrees(f - var4) * var8;
      float var10 = var5 + (MathHelper.clamp(g, -89.0F, 89.0F) - var5) * var8;
      O0000000000.player.setYaw(var9);
      O0000000000.player.setPitch(var10);
      O0000000000.player.headYaw = var9;
      o0000000O0OOOO.O00000000(var9);
      o0000000O0OOOO.O000000000(var10);
   }

   private void O000000000(float f, float g, O0000000O0OOOO o0000000O0OOOO) {
      float var4 = MathHelper.clamp(g, -89.0F, 89.0F);
      O0000000000.player.setYaw(f);
      O0000000000.player.setPitch(var4);
      O0000000000.player.headYaw = f;
      o0000000O0OOOO.O00000000(f);
      o0000000O0OOOO.O000000000(var4);
   }

   private float O00000000O0OOO() {
      long var1 = System.nanoTime();
      if (this.O000000O0000 == 0L) {
         this.O000000O0000 = var1;
         return 1.0F;
      } else {
         float var3 = (float)(var1 - this.O000000O0000) / 1.6666667E7F;
         this.O000000O0000 = var1;
         return MathHelper.clamp(var3, 0.25F, 4.0F);
      }
   }

   private float O00000000OO() {
      long var1 = System.nanoTime();
      if (this.O000000O00O0 == 0L) {
         this.O000000O00O0 = var1;
         this.O000000O00O00 = (float)ThreadLocalRandom.current().nextDouble(0.0, (float) (Math.PI * 2));
         return 1.0F;
      } else {
         float var3 = (float)(var1 - this.O000000O00O0) / 1.6666667E7F;
         this.O000000O00O0 = var1;
         return MathHelper.clamp(var3, 0.25F, 4.0F);
      }
   }

   private void O00000000OO0() {
      if (this.O00000000OO00()) {
         this.O00000000OO0O();
      } else if (!this.O00000000OO000()) {
         this.O00000000OO00O();
      } else {
         if (!this.O000000O00O000) {
            this.O000000O00O000 = true;
            this.O000000O00O00O = System.currentTimeMillis();
            this.O000000O00O0O = O0000000000.player.getX();
            this.O000000O00O0O0 = O0000000000.player.getZ();
         }

         long var1 = Math.max(0L, System.currentTimeMillis() - this.O000000O00O00O);
         boolean var3 = (var1 / 75L & 1L) == 0L;
         Boolean var4 = this.O00000000000(var3);
         if (var4 == null) {
            this.O00000000OO0O();
         } else {
            this.O00000000(var4, !var4);
         }
      }
   }

   private boolean O00000000OO00() {
      return this.O000000000O00O.O000000000("FunTime")
         && O0000000000.world != null
         && O0000000000.player != null
         && O0000000000.currentScreen != null
         && (this.O000000000O0O.O0000000000() || this.O0000000OO0O0 || this.O0000000OO0OO0);
   }

   private boolean O00000000OO000() {
      return this.O000000000O00O.O000000000("FunTime")
         && O0000000000.world != null
         && O0000000000.player != null
         && O0000000000.currentScreen == null
         && (
            this.O000000000O0O.O0000000000()
               || this.O0000000OO0O0
               || this.O0000000OO0OO0
               || this.O00000000OOOOO()
               || this.O000000O0O0O00 && this.O0000000000000
         )
         && !O000000000O0
         && !O000000000O00
         && !this.O0000000OO00O0;
   }

   private void O00000000(boolean bl, boolean bl2) {
      if (O0000000000.options != null && O0000000000.player != null) {
         O0000000000.options.forwardKey.setPressed(false);
         O0000000000.options.backKey.setPressed(false);
         O0000000000.options.leftKey.setPressed(bl);
         O0000000000.options.rightKey.setPressed(bl2);
         this.O00000000(false, false, bl, bl2);
      }
   }

   private Boolean O00000000000(boolean bl) {
      if (O0000000000.player == null) {
         return bl;
      } else {
         double var2 = O0000000000.player.getX() - this.O000000O00O0O;
         double var4 = O0000000000.player.getZ() - this.O000000O00O0O0;
         double var6 = var2 * var2 + var4 * var4;
         if (var6 <= 1.0) {
            return bl;
         } else {
            double var8 = Math.toRadians(O0000000000.player.getYaw());
            double var10 = Math.cos(var8);
            double var12 = Math.sin(var8);
            double var14 = -var2;
            double var16 = -var4;
            double var18 = var10 * var14 + var12 * var16;
            if (Math.abs(var18) > 0.0025) {
               return var18 > 0.0;
            } else {
               return var6 >= 4.0 ? null : bl;
            }
         }
      }
   }

   private void O00000000OO00O() {
      if (this.O000000O00O000) {
         this.O000000O00O000 = false;
         this.O000000O00O00O = 0L;
         this.O000000O00O0O = 0.0;
         this.O000000O00O0O0 = 0.0;
         if (O0000000000.options != null) {
            this.O00000000(O0000000000.options.forwardKey);
            this.O00000000(O0000000000.options.backKey);
            this.O00000000(O0000000000.options.leftKey);
            this.O00000000(O0000000000.options.rightKey);
            this.O00000000(
               O0000000000.options.forwardKey.isPressed(),
               O0000000000.options.backKey.isPressed(),
               O0000000000.options.leftKey.isPressed(),
               O0000000000.options.rightKey.isPressed()
            );
         }
      }
   }

   private void O00000000OO0O() {
      if (O0000000000.options != null) {
         O0000000000.options.forwardKey.setPressed(false);
         O0000000000.options.backKey.setPressed(false);
         O0000000000.options.leftKey.setPressed(false);
         O0000000000.options.rightKey.setPressed(false);
         this.O00000000(false, false, false, false);
      }
   }

   private void O00000000(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
      if (O0000000000.player != null && O0000000000.player.input != null && O0000000000.player.input.playerInput != null) {
         PlayerInput var5 = O0000000000.player.input.playerInput;
         O0000000000.player.input.playerInput = new PlayerInput(bl, bl2, bl3, bl4, var5.jump(), var5.sneak(), var5.sprint());
      }
   }

   private void O00000000(KeyBinding keyBinding) {
      if (keyBinding != null) {
         keyBinding.setPressed(this.O000000000(keyBinding));
      }
   }

   private boolean O000000000(KeyBinding keyBinding) {
      return O0000000000.getWindow() != null
         && keyBinding != null
         && InputUtil.isKeyPressed(O0000000000.getWindow().getHandle(), keyBinding.getDefaultKey().getCode());
   }

   public void O000000000O0O() {
      if (!this.O000000000O0O.O0000000000()) {
         this.O0000000O0O000();
      } else if (!this.O0000000OO0O00.isEmpty()) {
         if (this.O0000000OO0O0O >= this.O0000000OO0O00.size()) {
            this.O00000000OO0OO();
         } else {
            if (!this.O0000000OO0O0) {
               if (!this.O00000000OOO0O()) {
                  return;
               }

               if (this.O0000000O0OOO.O000000000000(1000L) && O0000000000.player != null) {
                  String var1 = this.O0000000OO0O00.get(this.O0000000OO0O0O);
                  this.O0000000000O00(var1);
                  String var2 = this.O0000000000OO(var1);
                  O0000000000.player.networkHandler.sendChatCommand("ah search " + var2);
                  this.O0000000OO0O0 = true;
                  this.O0000000O0OOO0.O00000000();
               }
            } else {
               if (!this.O0000000O0OOO0.O000000000000(600L)) {
                  return;
               }

               Screen var10 = O0000000000.currentScreen;
               if (!(var10 instanceof GenericContainerScreen) && this.O0000000O0OOO0.O000000000000(2500L)) {
                  String var12 = this.O0000000OO0O00.get(this.O0000000OO0O0O);
                  boolean var13 = this.O00000000(var12, this.O0000000000O0O(var12), "не открылся результат поиска");
                  if (var13) {
                     this.O0000000OO0O0O++;
                  }

                  if (!var13) {
                     ChatUtil.O00000000("§e[AutoParse] Ожидание кулдауна, повторный поиск: " + this.O0000000000O0O(var12));
                  }

                  this.O0000000OO0O0 = false;
                  this.O0000000O0OOO.O00000000();
                  if (O0000000000.player != null && O0000000000.currentScreen != null) {
                     O0000000000.player.closeScreen();
                  }

                  return;
               }

               if (var10 instanceof GenericContainerScreen var11) {
                  String var3 = this.O0000000OO0O00.get(this.O0000000OO0O0O);
                  if (this.O00000000000(var11) || this.O00000000(var11, var3)) {
                     String var4 = this.O0000000000O0O(var3);
                     int var5 = (int)this.O000000000O0O0.O0000000000();
                     AutoBuy.W61 var6 = this.O000000000(var11, var3);
                     boolean var7 = false;
                     if (var6 != null) {
                        long var8 = this.O00000000(var6.unitPrice(), var5);
                        O00000000O000O.put(var3, var8);
                        this.O00000000OO0O0();
                        var7 = true;
                        ChatUtil.O00000000(
                           "§d[AutoParse] §f"
                              + var4
                              + ": мин. за 1 шт. §e"
                              + var6.unitPrice()
                              + "$ §7(лот "
                              + var6.lotPrice()
                              + "$ x"
                              + var6.count()
                              + ") §f(-"
                              + var5
                              + "%) -> ставим §a"
                              + var8
                              + "$"
                        );
                     } else {
                        var7 = this.O00000000(var3, var4, "не найден на странице");
                        if (!var7) {
                           ChatUtil.O00000000("§c[AutoParse] §f" + var4 + " не найден на странице.");
                        }
                     }

                     this.O0000000OO0O0 = false;
                     if (var7) {
                        this.O0000000OO0O0O++;
                     }

                     this.O0000000O0OOO.O00000000();
                     if (O0000000000.player != null) {
                        O0000000000.player.closeScreen();
                     }
                  }
               }
            }
         }
      }
   }

   private void O0000000000O00(String string) {
      if (!Objects.equals(this.O0000000OOO, string)) {
         this.O0000000OOO = string == null ? "" : string;
         this.O0000000OOO0 = 0;
      }
   }

   private boolean O00000000(String string, String string2, String string3) {
      this.O0000000000O00(string);
      if (this.O0000000OOO0 >= 3) {
         ChatUtil.O00000000("§c[AutoParse] §f" + string2 + " пропущен: " + string3 + " после 3 повторных поисков.");
         this.O00000000OO0O0();
         return true;
      } else {
         this.O0000000OOO0++;
         ChatUtil.O00000000("§e[AutoParse] §f" + string2 + ": " + string3 + ", повторный поиск " + this.O0000000OOO0 + "/3.");
         return false;
      }
   }

   private void O00000000OO0O0() {
      this.O0000000OOO = "";
      this.O0000000OOO0 = 0;
   }

   private boolean O000000000000(boolean bl) {
      String var2 = this.O000000000O00O.O0000000000();
      LinkedHashSet var3 = new LinkedHashSet();

      for (String var5 : O00000000O0O) {
         if (this.O0000000000(var5, var2)) {
            var3.add(var5);
         }
      }

      for (String var7 : O00000000O000O.keySet()) {
         if (this.O0000000000(var7, var2)) {
            var3.add(var7);
         }
      }

      this.O0000000OO0O00.clear();
      this.O0000000OO0O00.addAll(var3);
      this.O0000000OO0O0O = 0;
      this.O0000000OO0O0 = false;
      this.O0000000OO0OOO = "";
      this.O0000000OOO00O = 0L;
      this.O0000000OOO0O = 0L;
      this.O0000000OOOO = false;
      this.O00000000OO0O0();
      this.O0000000O0OOO0.O00000000();
      if (this.O0000000OO0O00.isEmpty()) {
         ChatUtil.O00000000("§c[AutoBuy] Список предметов для парсинга пуст!");
         this.O000000000O0O.O000000000(false);
         this.O0000000OO0OO0 = false;
         return false;
      } else {
         this.O0000000OO0OO0 = bl;
         this.O000000000O0O.O000000000(true);
         this.O0000000OO0OO = true;
         this.O0000000O0OOO.O00000000();
         ChatUtil.O00000000((bl ? "§e[AutoBuy] Авто-репарс: " : "§a[AutoBuy] ") + "Начинаем парсинг " + this.O0000000OO0O00.size() + " предметов...");
         return true;
      }
   }

   private void O00000000OO0OO() {
      this.O000000000O0O.O000000000(false);
      this.O0000000OO0OO = false;
      this.O0000000OO0O0 = false;
      this.O0000000OO0OOO = "";
      this.O0000000OOO00O = 0L;
      this.O0000000OOO0O = 0L;
      this.O00000000OO0O0();
      this.O00000000OO00O();
      this.O0000000O0O0O0();
      if (this.O0000000OO0OO0) {
         this.O0000000OO0OO0 = false;
         this.O0000000OO.O00000000();
         ChatUtil.O00000000("§a[AutoBuy] Авто-репарс завершён. Меняем анархию и возвращаем покупки.");
         this.O0000000000000(true);
      } else {
         ChatUtil.O00000000("§a[AutoBuy] Авто-парс успешно завершён! Цены обновлены.");
      }
   }

   private void O00000000OOO() {
      this.O0000000OO0O0 = false;
      this.O0000000OO0OO0 = false;
      this.O0000000OO0OOO = "";
      this.O0000000OOO00O = 0L;
      this.O0000000OOO0O = 0L;
      this.O00000000OO0O0();
      this.O0000000O0OOO.O00000000();
      this.O0000000O0OOO0.O00000000();
      this.O0000000OO.O00000000();
      this.O00000000OO00O();
   }

   private boolean O00000000OOO0() {
      if (!this.O000000000O0OO.O0000000000() || !this.O000000000O00O.O000000000("FunTime")) {
         return false;
      } else if (!this.O000000000O0O.O0000000000() && !this.O0000000OO0OO0 && !this.O0000000OO000O && !this.O0000000OO00O0) {
         if (O0000000000.currentScreen instanceof GenericContainerScreen var1 && this.O0000000000(var1)) {
            return false;
         } else if (O00000000O000O.isEmpty()) {
            this.O0000000OO.O00000000();
            return false;
         } else if (!this.O0000000OO.O000000000000(this.O00000000OOO00())) {
            return false;
         } else if (!this.O000000000000(true)) {
            this.O0000000OO.O00000000();
            return false;
         } else {
            int var3 = this.O0000000000000(false);
            if (var3 == -1) {
               this.O0000000O0O000();
               this.O0000000OO.O00000000();
               return false;
            } else {
               this.O0000000OO0OOO = String.valueOf(var3);
               this.O0000000OOO00O = System.currentTimeMillis();
               this.O0000000OOO0O = System.currentTimeMillis() + 2500L;
               this.O0000000OOOO = false;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private long O00000000OOO00() {
      return Math.max(1L, (long)this.O000000000OO.O0000000000()) * 60000L;
   }

   private boolean O00000000OOO0O() {
      long var1 = System.currentTimeMillis();
      if (!this.O0000000OO0OOO.isEmpty()) {
         long var3 = var1 - this.O0000000OOO00O;
         String var5 = this.O0000000O0O00();
         boolean var6 = this.O0000000OO0OOO.equals(var5) && var3 >= 2500L;
         if (!var6 && !this.O0000000OOOO && var3 >= 4500L && O0000000000.player != null) {
            O0000000000.player.networkHandler.sendChatCommand("an" + this.O0000000OO0OOO);
            this.O0000000OOOO = true;
            this.O0000000OOO00O = var1;
            return false;
         }

         var3 = var1 - this.O0000000OOO00O;
         boolean var7 = var3 >= 12000L;
         if (!var6 && !var7) {
            return false;
         }

         this.O0000000OO0OOO = "";
         this.O0000000OOOO = false;
      }

      return var1 >= this.O0000000OOO0O;
   }

   private long O00000000(long l, int i) {
      double var4 = i / 100.0;
      long var6 = (long)(l * var4);
      return Math.max(1L, l - var6);
   }

   private String O0000000000O0O(String string) {
      if (O000000OOOO000.O000000000(string)) {
         return O000000OOOO000.O00000000000(string);
      } else {
         if (string != null && string.startsWith("minecraft:")) {
            Identifier var2 = Identifier.tryParse(string);
            if (var2 != null) {
               Item var3 = (Item)Registries.ITEM.get(var2);
               if (var3 != Items.AIR) {
                  return var3.getDefaultStack().getName().getString();
               }
            }
         }

         return string;
      }
   }

   private String O0000000000OO(String string) {
      if (string == null) {
         return "";
      } else {
         return switch (string) {
            case "Опыт 15" -> "Опыт с уровнем 15";
            case "Опыт 30" -> "Опыт с уровнем 30";
            case "Опыт 45" -> "Опыт с уровнем 45";
            case "Опыт 50" -> "Опыт с уровнем 50";
            default -> this.O0000000000O0O(string);
         };
      }
   }

   private boolean O0000000000(GenericContainerScreen genericContainerScreen) {
      if (genericContainerScreen == null) {
         return false;
      } else {
         String var2 = this.O0000000000OO0(genericContainerScreen.getTitle().getString());
         if (var2.contains("подтверждение покупки")) {
            return this.O0000000000(genericContainerScreen.getScreenHandler()) != -1;
         } else {
            return !this.O0000000O00() ? false : this.O000000000(genericContainerScreen.getScreenHandler());
         }
      }
   }

   private boolean O000000000(ScreenHandler screenHandler) {
      return screenHandler.slots.size() < 27 ? false : this.O0000000000(screenHandler) != -1;
   }

   private int O0000000000(ScreenHandler screenHandler) {
      int var2 = this.O00000000000(screenHandler);

      for (int var3 = var2 - 1; var3 >= 0; var3--) {
         ItemStack var4 = screenHandler.getSlot(var3).getStack();
         String var5 = this.O0000000000OO0(var4.getName().getString());
         if (var5.contains("купить")) {
            return var3;
         }

         if (var4.getItem() == Items.LIME_STAINED_GLASS_PANE
            || var4.getItem() == Items.GREEN_STAINED_GLASS_PANE
            || var4.getItem() == Items.GREEN_CONCRETE
            || var4.getItem() == Items.LIME_CONCRETE) {
            return var3;
         }
      }

      return -1;
   }

   private int O00000000000(ScreenHandler screenHandler) {
      return Math.max(0, Math.min(54, screenHandler.slots.size() - 36));
   }

   private String O0000000000OO0(String string) {
      return string == null ? "" : string.replaceAll("§.", "").toLowerCase(Locale.ROOT).trim();
   }

   private boolean O00000000000(GenericContainerScreen genericContainerScreen) {
      return this.O000000000O00O.O000000000("HolyWorld") ? this.O000000000000(genericContainerScreen) : AhHelper.O00000000(genericContainerScreen);
   }

   public boolean O00000000(GenericContainerScreen genericContainerScreen) {
      return this.O00000000000(genericContainerScreen);
   }

   private boolean O000000000000(GenericContainerScreen genericContainerScreen) {
      if (genericContainerScreen == null) {
         return false;
      } else {
         String var2 = this.O0000000000OO0(genericContainerScreen.getTitle().getString());
         return !var2.contains("аукцион") && !var2.contains("auction") ? this.O00000000(genericContainerScreen.getScreenHandler()) != -1 : true;
      }
   }

   private boolean O00000000(GenericContainerScreen genericContainerScreen, String string) {
      if (genericContainerScreen != null && string != null) {
         if (((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots.size() < 54) {
            return false;
         } else {
            String var3 = this.O0000000000OO0(genericContainerScreen.getTitle().getString());
            String var4 = this.O0000000000OO0(this.O0000000000O0O(string));
            String var5 = this.O0000000000OO0(this.O0000000000OO(string));
            if (!var3.contains(var4) && !var3.contains(var5)) {
               return false;
            } else {
               boolean var6 = false;
               int var7 = Math.min(54, ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots.size());

               for (int var8 = 45; var8 < var7; var8++) {
                  ItemStack var9 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var8).getStack();
                  if (var9.getItem() == Items.ARROW
                     || var9.getItem() == Items.PAPER
                     || var9.getItem() == Items.SPECTRAL_ARROW
                     || var9.getItem() == Items.LIME_STAINED_GLASS_PANE) {
                     var6 = true;
                     break;
                  }
               }

               if (!var6) {
                  return false;
               } else {
                  for (int var10 = 0; var10 < Math.min(45, ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots.size()); var10++) {
                     Slot var11 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var10);
                     if (this.O000000000(var11) && this.O000000000(var11, this.O000000000O00O.O0000000000()) > 0L) {
                        return false;
                     }
                  }

                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   private AutoBuy.W61 O000000000(GenericContainerScreen genericContainerScreen, String string) {
      long var3 = Long.MAX_VALUE;
      long var5 = Long.MAX_VALUE;
      int var7 = 1;
      boolean var8 = false;
      String var9 = this.O000000000O00O.O0000000000();

      for (int var10 = 0; var10 < Math.min(45, ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots.size()); var10++) {
         Slot var11 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var10);
         if (this.O000000000(var11) && this.O00000000(string, var11.getStack(), var9)) {
            long var12 = this.O000000000(var11, var9);
            if (var12 > 0L) {
               int var14 = this.O00000000(var11);
               long var15 = this.O000000000(var12, var14);
               if (var15 < var3 || var15 == var3 && var12 < var5) {
                  var3 = var15;
                  var5 = var12;
                  var7 = var14;
                  var8 = true;
               }
            }
         }
      }

      return var8 ? new AutoBuy.W61(var3, var5, var7) : null;
   }

   private int O00000000(Slot slot) {
      return slot != null && slot.hasStack() ? Math.max(1, slot.getStack().getCount()) : 1;
   }

   private long O000000000(long l, int i) {
      int var4 = Math.max(1, i);
      return Math.max(1L, (l + var4 - 1L) / var4);
   }

   private boolean O000000000(Slot slot) {
      if (slot != null && slot.hasStack()) {
         ItemStack var2 = slot.getStack();
         return !this.O0000000000(var2);
      } else {
         return false;
      }
   }

   private boolean O0000000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty() && itemStack.getItem() != Items.AIR) {
         Item var2 = itemStack.getItem();
         return var2 == Items.GREEN_STAINED_GLASS_PANE
            || var2 == Items.BLACK_STAINED_GLASS_PANE
            || var2 == Items.LIME_STAINED_GLASS_PANE
            || var2 == Items.RED_STAINED_GLASS_PANE
            || var2 == Items.GRAY_STAINED_GLASS_PANE
            || var2 == Items.WHITE_STAINED_GLASS_PANE
            || var2 == Items.ORANGE_STAINED_GLASS_PANE
            || var2 == Items.YELLOW_STAINED_GLASS_PANE
            || var2 == Items.ARROW
            || var2 == Items.SPECTRAL_ARROW
            || var2 == Items.PAPER
            || var2 == Items.BARRIER
            || var2 == Items.CHEST
            || var2 == Items.ENDER_CHEST
            || var2 == Items.HOPPER
            || var2 == Items.COMPASS;
      } else {
         return true;
      }
   }

   private boolean O0000000000(Slot slot) {
      if (slot != null && slot.hasStack() && !this.O0000000000(slot.getStack())) {
         long var2 = O000000OOOO0O.O000000000(slot);
         if (var2 <= 0L) {
            return false;
         } else {
            String var4 = O000000OOOO0O.O00000000(slot);
            if (var4 == null || var4.isBlank()) {
               return false;
            } else {
               return O0000000000.player != null && var4.equalsIgnoreCase(O0000000000.player.getName().getString()) ? false : !O00000000000(var4);
            }
         }
      } else {
         return false;
      }
   }

   private boolean O000000000000(ScreenHandler screenHandler) {
      int var2 = this.O00000000000(screenHandler);
      int var3 = this.O0000000000(screenHandler);

      for (int var4 = 0; var4 < var2; var4++) {
         if (var4 != var3) {
            Slot var5 = screenHandler.getSlot(var4);
            if (this.O000000000(var5) && this.O0000000000(var5)) {
               AutoBuy.W63 var6 = this.O00000000(var5, (long)O000000OOOO0O.O000000000(var5));
               if (var6 != null
                  && var6.buyable()
                  && (this.O000000O0O000 == 0 || var6.fingerprint() == this.O000000O0O000)
                  && (this.O000000O0O0 <= 0L || var6.lotPrice() <= this.O000000O0O0)
                  && (this.O000000O0O00 <= 0L || var6.estimatedValue() >= this.O000000O0O00)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private AutoBuy.W63 O00000000(Slot slot, long l) {
      if (slot != null && slot.hasStack() && l > 0L) {
         ItemStack var4 = slot.getStack();
         if (!this.O0000000000(var4.getItem())) {
            return null;
         } else {
            ContainerComponent var5 = (ContainerComponent)var4.get(DataComponentTypes.CONTAINER);
            if (var5 == null) {
               return null;
            } else {
               long var6 = this.O00000000(var5, 0);
               if (var6 <= 0L) {
                  return null;
               } else {
                  long var8 = var6 - l;
                  long var10 = Math.max(0L, (long)this.O00000000O000.O0000000000());
                  long var12 = Math.max(0L, (long)this.O00000000O0000.O0000000000());
                  long var14 = (long)Math.ceil(l * (Math.max(0.0F, this.O00000000O00.O0000000000()) / 100.0));
                  boolean var16 = var6 >= var12 && var8 >= var10 && var8 >= var14;
                  return new AutoBuy.W63(l, var6, var8, this.O00000000000(var4), var16);
               }
            }
         }
      } else {
         return null;
      }
   }

   private long O00000000(ContainerComponent containerComponent, int i) {
      if (containerComponent != null && i <= 2) {
         long var3 = 0L;
         boolean var5 = false;

         for (ItemStack var7 : containerComponent.iterateNonEmptyCopy()) {
            if (var7 != null && !var7.isEmpty()) {
               var5 = true;
               long var8 = this.O00000000(var7, i);
               if (var8 > 0L) {
                  var3 = this.O00000000(var3, var8);
               }
            }
         }

         return var5 ? var3 : 0L;
      } else {
         return 0L;
      }
   }

   private long O00000000(ItemStack itemStack, int i) {
      long var3 = 0L;

      for (Entry var6 : O00000000O000O.entrySet()) {
         String var7 = (String)var6.getKey();
         Long var8 = (Long)var6.getValue();
         if (var7 != null
            && var8 != null
            && var8 > 0L
            && !O00000000O0O0.contains(var7)
            && this.O0000000000(var7, "FunTime")
            && this.O00000000(var7, itemStack, "FunTime")
            && this.O00000000(var7, itemStack)) {
            var3 = Math.max(var3, this.O0000000000(var8, Math.max(1, itemStack.getCount())));
         }
      }

      if (this.O0000000000(itemStack.getItem()) && i < 2) {
         ContainerComponent var9 = (ContainerComponent)itemStack.get(DataComponentTypes.CONTAINER);
         if (var9 != null) {
            var3 = Math.max(var3, this.O00000000(var9, i + 1));
         }
      }

      return var3;
   }

   private boolean O0000000000(Item item) {
      return item == Items.SHULKER_BOX
         || item == Items.WHITE_SHULKER_BOX
         || item == Items.ORANGE_SHULKER_BOX
         || item == Items.MAGENTA_SHULKER_BOX
         || item == Items.LIGHT_BLUE_SHULKER_BOX
         || item == Items.YELLOW_SHULKER_BOX
         || item == Items.LIME_SHULKER_BOX
         || item == Items.PINK_SHULKER_BOX
         || item == Items.GRAY_SHULKER_BOX
         || item == Items.LIGHT_GRAY_SHULKER_BOX
         || item == Items.CYAN_SHULKER_BOX
         || item == Items.PURPLE_SHULKER_BOX
         || item == Items.BLUE_SHULKER_BOX
         || item == Items.BROWN_SHULKER_BOX
         || item == Items.GREEN_SHULKER_BOX
         || item == Items.RED_SHULKER_BOX
         || item == Items.BLACK_SHULKER_BOX;
   }

   private int O00000000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty()) {
         Identifier var2 = Registries.ITEM.getId(itemStack.getItem());
         return Objects.hash(var2, itemStack.getCount(), itemStack.getName().getString(), itemStack.getComponents().hashCode());
      } else {
         return 0;
      }
   }

   private long O00000000(long l, long m) {
      try {
         return Math.addExact(l, m);
      } catch (ArithmeticException var6) {
         return Long.MAX_VALUE;
      }
   }

   private long O0000000000(long l, int i) {
      try {
         return Math.multiplyExact(l, Math.max(1, i));
      } catch (ArithmeticException var5) {
         return Long.MAX_VALUE;
      }
   }

   private void O0000000000OOO(String string) {
      this.O000000O00OO00 = string == null ? "" : string;
      this.O000000O00OO0O = System.currentTimeMillis();
      if (!"__wild_funtime_shulker__".equals(this.O000000O00OO00)) {
         this.O000000O0O0 = 0L;
         this.O000000O0O00 = 0L;
         this.O000000O0O000 = 0;
      }
   }

   private void O00000000OOOO() {
      this.O000000O00OO00 = "";
      this.O000000O00OO0O = 0L;
      this.O000000O0O0 = 0L;
      this.O000000O0O00 = 0L;
      this.O000000O0O000 = 0;
   }

   private void O00000000OOOO0() {
      this.O000000O00OOO = 0L;
      this.O000000O00OOO0 = 0;
      this.O000000O00OOOO = false;
      this.O000000O0O = 0L;
   }

   private boolean O00000000OOOOO() {
      return this.O000000O00OOOO && this.O000000000O00O.O000000000("FunTime");
   }

   private void O0000000O() {
      this.O000000O00OOOO = true;
      this.O000000O0O = System.currentTimeMillis() + ThreadLocalRandom.current().nextLong(15000L, 20001L);
      this.O0000000OO000O = false;
      this.O0000000OO0O = "";
      this.O00000000OOOO();
      if (O0000000000.player != null && O0000000000.currentScreen != null) {
         O0000000000.player.closeScreen();
      }
   }

   private void O0000000O0() {
      if (System.currentTimeMillis() >= this.O000000O0O) {
         this.O000000O00OOOO = false;
         this.O000000O0O = 0L;
         this.O0000000O0000O();
      }
   }

   private boolean O0000000O00() {
      if (this.O000000O00OO00.isEmpty()) {
         return false;
      } else if (System.currentTimeMillis() - this.O000000O00OO0O > 15000L) {
         this.O00000000OOOO();
         return false;
      } else {
         return true;
      }
   }

   private boolean O0000000000000(GenericContainerScreen genericContainerScreen) {
      if (genericContainerScreen != null && this.O0000000O00()) {
         String var2 = this.O000000O00OO00;
         String var3 = this.O000000000O00O.O0000000000();
         if (!"__wild_funtime_shulker__".equals(var2)) {
            Long var4 = O00000000O000O.get(var2);
            if (var4 == null || var4 <= 0L || O00000000O0O0.contains(var2)) {
               return false;
            } else {
               return !this.O0000000000(var2, var3) ? false : this.O00000000(genericContainerScreen.getScreenHandler(), var2, var4, var3);
            }
         } else {
            return var3.equals("FunTime") && this.O000000000000(genericContainerScreen.getScreenHandler());
         }
      } else {
         return false;
      }
   }

   private boolean O00000000(ScreenHandler screenHandler, String string, long l, String string2) {
      int var6 = this.O00000000000(screenHandler);
      int var7 = this.O0000000000(screenHandler);

      for (int var8 = 0; var8 < var6; var8++) {
         if (var8 != var7) {
            Slot var9 = screenHandler.getSlot(var8);
            if (this.O000000000(var9) && (!string2.equals("FunTime") || this.O0000000000(var9))) {
               ItemStack var10 = var9.getStack();
               if (this.O00000000(string, var10, string2) && this.O00000000(string, var10)) {
                  long var11 = this.O000000000(var9, string2);
                  if (var11 <= 0L || this.O000000000(var11, this.O00000000(var9)) <= l) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   private void O0000000000000(ScreenHandler screenHandler) {
      if (O0000000000.player != null) {
         O0000000000.player.closeScreen();
      }

      this.O00000000OOOO();
   }

   public static int O00000000000O(String string) {
      return O00000000000O0(string);
   }

   public static int O00000000000O0(String string) {
      return string == null ? 0 : Math.max(0, Math.min(100, O00000000O00O.getOrDefault(string, 0)));
   }

   public static int O00000000000OO(String string) {
      return string == null ? 100 : Math.max(0, Math.min(100, O00000000O00O0.getOrDefault(string, 100)));
   }

   public static void O00000000(String string, int i) {
      O00000000(string, i, O00000000000OO(string));
   }

   public static void O00000000(String string, int i, int j) {
      if (string != null && !string.isBlank()) {
         int var3 = Math.max(0, Math.min(100, i));
         int var4 = Math.max(0, Math.min(100, j));
         if (var3 > var4) {
            int var5 = var3;
            var3 = var4;
            var4 = var5;
         }

         if (var3 <= 0) {
            O00000000O00O.remove(string);
         } else {
            O00000000O00O.put(string, var3);
         }

         if (var4 >= 100) {
            O00000000O00O0.remove(string);
         } else {
            O00000000O00O0.put(string, var4);
         }
      }
   }

   public static boolean O000000000(String string, String string2) {
      Set var2 = O00000000O00OO.get(string);
      return var2 == null || !var2.contains(O000000OOOO000.O000000000000(string2));
   }

   public static void O00000000(String string, String string2, boolean bl) {
      if (string != null && !string.isBlank()) {
         String var3 = O000000OOOO000.O000000000000(string2);
         if (!var3.isBlank()) {
            if (bl) {
               Set var4 = O00000000O00OO.get(string);
               if (var4 != null) {
                  var4.remove(var3);
                  if (var4.isEmpty()) {
                     O00000000O00OO.remove(string);
                  }
               }
            } else {
               O00000000O00OO.computeIfAbsent(string, stringx -> new LinkedHashSet<>()).add(var3);
            }
         }
      }
   }

   public static Set<String> O00000000(String string, List<String> list) {
      LinkedHashSet var2 = new LinkedHashSet();
      if (list == null) {
         return var2;
      } else {
         for (String var4 : list) {
            String var5 = O000000OOOO000.O000000000000(var4);
            if (!var5.isBlank() && O000000000(string, var5)) {
               var2.add(var5);
            }
         }

         return var2;
      }
   }

   public static int O00000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty() && itemStack.isDamageable()) {
         int var1 = itemStack.getMaxDamage();
         if (var1 <= 0) {
            return 100;
         } else {
            int var2 = Math.max(0, var1 - itemStack.getDamage());
            return Math.max(0, Math.min(100, (int)(var2 * 100L / var1)));
         }
      } else {
         return 100;
      }
   }

   private boolean O00000000(String string, ItemStack itemStack) {
      if (itemStack != null && O00000000(itemStack.getItem())) {
         int var3 = O00000000000O0(string);
         int var4 = O00000000000OO(string);
         int var5 = O00000000(itemStack);
         return var5 >= var3 && var5 <= var4;
      } else {
         return true;
      }
   }

   public static boolean O00000000(Item item) {
      return item == null ? false : O000000000(item) || new ItemStack(item).isDamageable();
   }

   public static boolean O000000000(Item item) {
      return item == Items.NETHERITE_HELMET
         || item == Items.DIAMOND_HELMET
         || item == Items.IRON_HELMET
         || item == Items.CHAINMAIL_HELMET
         || item == Items.GOLDEN_HELMET
         || item == Items.LEATHER_HELMET
         || item == Items.TURTLE_HELMET
         || item == Items.NETHERITE_CHESTPLATE
         || item == Items.DIAMOND_CHESTPLATE
         || item == Items.IRON_CHESTPLATE
         || item == Items.CHAINMAIL_CHESTPLATE
         || item == Items.GOLDEN_CHESTPLATE
         || item == Items.LEATHER_CHESTPLATE
         || item == Items.NETHERITE_LEGGINGS
         || item == Items.DIAMOND_LEGGINGS
         || item == Items.IRON_LEGGINGS
         || item == Items.CHAINMAIL_LEGGINGS
         || item == Items.GOLDEN_LEGGINGS
         || item == Items.LEATHER_LEGGINGS
         || item == Items.NETHERITE_BOOTS
         || item == Items.DIAMOND_BOOTS
         || item == Items.IRON_BOOTS
         || item == Items.CHAINMAIL_BOOTS
         || item == Items.GOLDEN_BOOTS
         || item == Items.LEATHER_BOOTS;
   }

   private String O00000000000(Slot slot) {
      String var2 = this.O000000000O00O.O0000000000();
      if (slot != null && slot.hasStack()) {
         if (var2.equals("HolyWorld")) {
            return this.O000000000000(slot);
         } else {
            ItemStack var3 = slot.getStack();
            long var4 = this.O000000000(slot, var2);
            String var6 = this.O00000000(slot, var2);
            if (var4 <= 0L) {
               return null;
            } else if (var2.equals("FunTime") && !this.O0000000000(slot)) {
               return null;
            } else if (O0000000000.player != null && var6 != null && var6.equalsIgnoreCase(O0000000000.player.getName().getString())) {
               return null;
            } else if (O00000000000(var6)) {
               return null;
            } else {
               if (var2.equals("FunTime")) {
                  AutoBuy.W63 var7 = this.O00000000(slot, var4);
                  if (var7 != null && var7.buyable()) {
                     this.O000000O0O0 = var7.lotPrice();
                     this.O000000O0O00 = var7.estimatedValue();
                     this.O000000O0O000 = var7.fingerprint();
                     return "__wild_funtime_shulker__";
                  }
               }

               long var13 = this.O000000000(var4, this.O00000000(slot));

               for (Entry var10 : O00000000O000O.entrySet()) {
                  String var11 = (String)var10.getKey();
                  Long var12 = (Long)var10.getValue();
                  if (!O00000000O0O0.contains(var11)
                     && var12 != null
                     && this.O0000000000(var11, var2)
                     && this.O00000000(var11, var3, var2)
                     && var13 <= var12
                     && this.O00000000(var11, var3)) {
                     return var11;
                  }
               }

               return null;
            }
         }
      } else {
         return null;
      }
   }

   private boolean O0000000000(String string, String string2) {
      if (string == null || string2 == null) {
         return false;
      } else if (string.startsWith("minecraft:")) {
         return true;
      } else if (O000000OOOO000.O00000000(string)) {
         return string2.equals("HolyWorld");
      } else if (string2.equals("FunTime")) {
         return O0000000O0O0O.contains(string);
      } else if (string2.equals("SpookyTime")) {
         return O0000000O0O0O.contains(string) || O0000000O0O0O0.contains(string);
      } else {
         return string2.equals("HolyWorld") ? O000000OOOO000.O000000000(string) : false;
      }
   }

   private String O000000000000(Slot slot) {
      ItemStack var2 = slot.getStack();
      if (this.O000000000(var2)) {
         return null;
      } else if (!var2.isOf(Items.BARRIER) && !var2.isOf(Items.CHEST) && !var2.isOf(Items.ENDER_CHEST)) {
         AutoBuy.W59 var3 = this.O000000000000O(slot);
         if (var3.price() > 0L && var3.seller() != null) {
            if (O0000000000.player != null && var3.seller().equalsIgnoreCase(O0000000000.player.getName().getString())) {
               return null;
            } else if (O00000000000(var3.seller())) {
               return null;
            } else {
               long var4 = this.O000000000(var3.price(), this.O00000000(slot));
               this.O0000000O000();
               AutoBuy.W60 var6 = new AutoBuy.W60(var2);
               String var7 = this.O00000000(var2, var4, this.O000000O0O0000.get(var2.getItem()), var6);
               return var7 != null ? var7 : this.O00000000(var2, var4, this.O000000O0O000O, var6);
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void O0000000O000() {
      int var1 = this.O0000000O0000();
      if (var1 != this.O000000O0O00O) {
         this.O000000O0O00O = var1;
         this.O000000O0O0000.clear();
         this.O000000O0O000O.clear();

         for (Entry var3 : O00000000O000O.entrySet()) {
            String var4 = (String)var3.getKey();
            Long var5 = (Long)var3.getValue();
            if (var4 != null && !O00000000O0O0.contains(var4) && var5 != null) {
               O000000OOOO000.W120 var6 = O000000OOOO000.O0000000000(var4);
               Item var7 = this.O00000000(var4, var6);
               AutoBuy.W58 var8 = new AutoBuy.W58(var4, var5, var6, var7, this.O000000000O0(var4));
               if (var7 != null && var7 != Items.AIR) {
                  this.O000000O0O0000.computeIfAbsent(var7, item -> new ArrayList<>()).add(var8);
               } else {
                  this.O000000O0O000O.add(var8);
               }
            }
         }
      }
   }

   private int O0000000O0000() {
      int var1 = 1;

      for (Entry var3 : O00000000O000O.entrySet()) {
         var1 = 31 * var1 + Objects.hashCode(var3.getKey());
         var1 = 31 * var1 + Objects.hashCode(var3.getValue());
      }

      for (String var6 : O00000000O0O0) {
         var1 += Objects.hashCode(var6);
      }

      return var1;
   }

   private void O0000000O00000() {
      this.O000000O0O00O = Integer.MIN_VALUE;
   }

   private Item O00000000(String string, O000000OOOO000.W120 o000000000000) {
      if (o000000000000 != null) {
         return o000000000000.item();
      } else if (string != null && string.startsWith("minecraft:")) {
         Identifier var3 = Identifier.tryParse(string);
         if (var3 == null) {
            return null;
         } else {
            Item var4 = (Item)Registries.ITEM.get(var3);
            return var4 == Items.AIR ? null : var4;
         }
      } else {
         return null;
      }
   }

   private String O00000000(ItemStack itemStack, long l, List<AutoBuy.W58> list, AutoBuy.W60 o00000000000) {
      if (list != null && !list.isEmpty()) {
         for (AutoBuy.W58 var7 : list) {
            if (l <= var7.maxPrice()) {
               O000000OOOO000.W120 var8 = var7.holyWorldEntry();
               if (var8 != null) {
                  if (itemStack.isOf(var8.item())
                     && this.O00000000(var7.itemName(), var8, itemStack, o00000000000.O00000000(), o00000000000.O000000000())
                     && this.O00000000(var7.itemName(), itemStack)) {
                     return var7.itemName();
                  }
               } else if (this.O00000000(var7, itemStack, o00000000000) && this.O00000000(var7.itemName(), itemStack)) {
                  return var7.itemName();
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private boolean O00000000(AutoBuy.W58 o000000000, ItemStack itemStack, AutoBuy.W60 o00000000000) {
      Item var4 = o000000000.item();
      if (var4 != null && var4 != Items.AIR && !itemStack.isOf(var4)) {
         return false;
      } else {
         Identifier var5 = o00000000000.O000000000000();
         String var6 = o000000000.itemName();
         if (var5 == null || !var6.equalsIgnoreCase(var5.toString()) && !var6.equalsIgnoreCase(var5.getPath())) {
            String var7 = o00000000000.O0000000000();
            return var7.equalsIgnoreCase(var6) || o00000000000.O00000000000().equals(o000000000.normalizedName());
         } else {
            return true;
         }
      }
   }

   private boolean O00000000(String string, O000000OOOO000.W120 o000000000000, ItemStack itemStack, String string2, String string3) {
      Set var6 = O000000000(o000000000000.item()) ? O00000000(string, o000000000000.enchantments()) : null;
      return O000000OOOO000.O00000000(o000000000000, itemStack, string2, string3, var6);
   }

   private boolean O0000000000000(Slot slot) {
      if (slot != null && slot.hasStack()) {
         ItemStack var2 = slot.getStack();
         if (this.O000000000(var2)) {
            return false;
         } else if (!var2.isOf(Items.BARRIER) && !var2.isOf(Items.CHEST) && !var2.isOf(Items.ENDER_CHEST)) {
            AutoBuy.W59 var3 = this.O000000000000O(slot);
            return var3.price() > 0L && var3.seller() != null;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean O00000000(String string, ItemStack itemStack, String string2) {
      if (string == null || itemStack == null || itemStack.isEmpty()) {
         return false;
      } else if (string2.equals("HolyWorld") && O000000OOOO000.O000000000(string)) {
         O000000OOOO000.W120 var4 = O000000OOOO000.O0000000000(string);
         if (var4 != null && itemStack.isOf(var4.item())) {
            String var7 = O000000OOOO000.O000000000000(itemStack);
            String var6 = O000000OOOO000.O0000000000000(itemStack);
            return this.O00000000(string, var4, itemStack, var7, var6);
         } else {
            return false;
         }
      } else if (!string2.equals("FunTime") && !string2.equals("SpookyTime") && !string2.equals("HolyWorld")) {
         return this.O0000000000(string, itemStack);
      } else {
         return switch (string) {
            case "Сфера Хаоса" -> this.O00000000(
               itemStack,
               Items.PLAYER_HEAD,
               this.O00000000(EntityAttributes.ATTACK_DAMAGE, 2.5),
               this.O00000000(EntityAttributes.MOVEMENT_SPEED, 0.07),
               this.O00000000(EntityAttributes.ATTACK_SPEED, 0.13),
               this.O00000000(EntityAttributes.ARMOR, 1.5),
               this.O00000000(EntityAttributes.MAX_HEALTH, -4.0),
               this.O00000000(EntityAttributes.GRAVITY, 0.09)
            );
            case "Сфера Титана" -> this.O00000000(
               itemStack,
               Items.PLAYER_HEAD,
               this.O00000000(EntityAttributes.ARMOR, 2.5),
               this.O00000000(EntityAttributes.ARMOR_TOUGHNESS, 2.5),
               this.O00000000(EntityAttributes.MOVEMENT_SPEED, -0.15)
            );
            case "Сфера Ареса" -> this.O00000000(
               itemStack,
               Items.PLAYER_HEAD,
               this.O00000000(EntityAttributes.ATTACK_DAMAGE, 6.0),
               this.O00000000(EntityAttributes.ARMOR, -2.0),
               this.O00000000(EntityAttributes.MAX_HEALTH, -2.0)
            );
            case "Сфера Бестии" -> this.O00000000(
               itemStack,
               Items.PLAYER_HEAD,
               this.O00000000(EntityAttributes.ARMOR, 1.0),
               this.O00000000(EntityAttributes.MAX_HEALTH, 4.0),
               this.O00000000(EntityAttributes.MOVEMENT_SPEED, 0.1),
               this.O00000000(EntityAttributes.ATTACK_SPEED, 0.1)
            );
            case "Сфера Гидры" -> this.O00000000(
               itemStack,
               Items.PLAYER_HEAD,
               this.O00000000(EntityAttributes.ARMOR, 2.0),
               this.O00000000(EntityAttributes.MAX_HEALTH, 4.0),
               this.O00000000(EntityAttributes.SUBMERGED_MINING_SPEED, 0.5),
               this.O00000000(EntityAttributes.OXYGEN_BONUS, 0.5)
            );
            case "Сфера Икара" -> this.O00000000(
               itemStack, Items.PLAYER_HEAD, this.O00000000(EntityAttributes.ATTACK_DAMAGE, 2.0), this.O00000000(EntityAttributes.MAX_HEALTH, 2.0)
            );
            case "Сфера Эрида" -> this.O00000000(
               itemStack,
               Items.PLAYER_HEAD,
               this.O00000000(EntityAttributes.LUCK, 1.0),
               this.O00000000(EntityAttributes.MAX_HEALTH, 2.0),
               this.O00000000(EntityAttributes.BLOCK_INTERACTION_RANGE, 1.0)
            );
            case "Сфера Сатира" -> this.O00000000(
               itemStack,
               Items.PLAYER_HEAD,
               this.O00000000(EntityAttributes.ATTACK_DAMAGE, 2.0),
               this.O00000000(EntityAttributes.JUMP_STRENGTH, -0.1),
               this.O00000000(EntityAttributes.ATTACK_SPEED, 0.15)
            );
            case "Вещи Крушителя", "Набор Крушителя", "Броня Крушителя", "Броня Крушителя с шипами", "Броня Крушителя шип", "Броня Крушителя без шипов", "Броня Крушителя без шип", "Шлем Крушителя", "Нагрудник Крушителя", "Поножи Крушителя", "Ботинки Крушителя", "Меч Крушителя", "Кирка Крушителя", "Лук Крушителя", "Арбалет Крушителя", "Трезубец Крушителя", "Булава Крушителя", "Элитры Крушителя", "Удочка Крушителя" -> (
                  string2.equals("FunTime") || string2.equals("SpookyTime")
               )
               && this.O000000000(string, itemStack);
            case "Талисман Демона" -> this.O00000000(
               itemStack, Items.TOTEM_OF_UNDYING, this.O00000000(EntityAttributes.ATTACK_DAMAGE, 2.5), this.O00000000(EntityAttributes.ATTACK_SPEED, 0.1)
            );
            case "Талисман Карателя" -> this.O00000000(
               itemStack,
               Items.TOTEM_OF_UNDYING,
               this.O00000000(EntityAttributes.ATTACK_DAMAGE, 7.0),
               this.O00000000(EntityAttributes.MAX_HEALTH, -4.0),
               this.O00000000(EntityAttributes.MOVEMENT_SPEED, 0.1)
            );
            case "Талисман Мрака" -> this.O00000000(
               itemStack, Items.TOTEM_OF_UNDYING, this.O00000000(EntityAttributes.ARMOR, 1.5), this.O00000000(EntityAttributes.MAX_HEALTH, 1.5)
            );
            case "Талисман Ярости" -> this.O00000000(
               itemStack, Items.TOTEM_OF_UNDYING, this.O00000000(EntityAttributes.ATTACK_DAMAGE, 5.0), this.O00000000(EntityAttributes.MAX_HEALTH, -4.0)
            );
            case "Талисман Тирана" -> this.O00000000(
               itemStack,
               Items.TOTEM_OF_UNDYING,
               this.O00000000(EntityAttributes.ATTACK_DAMAGE, 2.0),
               this.O00000000(EntityAttributes.ARMOR, 2.0),
               this.O00000000(EntityAttributes.MAX_HEALTH, -4.0)
            );
            case "Талисман Крушителя" -> this.O00000000(
               itemStack,
               Items.TOTEM_OF_UNDYING,
               this.O00000000(EntityAttributes.MAX_HEALTH, 4.0),
               this.O00000000(EntityAttributes.ATTACK_DAMAGE, 3.0),
               this.O00000000(EntityAttributes.ARMOR_TOUGHNESS, 2.0),
               this.O00000000(EntityAttributes.ARMOR, 2.0)
            );
            case "Талисман Раздора" -> this.O00000000(
               itemStack,
               Items.TOTEM_OF_UNDYING,
               this.O00000000(EntityAttributes.ATTACK_DAMAGE, 4.0),
               this.O00000000(EntityAttributes.MAX_HEALTH, 2.0),
               this.O00000000(EntityAttributes.MOVEMENT_SPEED, 0.1),
               this.O00000000(EntityAttributes.ATTACK_SPEED, 0.1),
               this.O00000000(EntityAttributes.ARMOR, -3.0)
            );
            case "Зелье Ассасина" -> O000000OOOO00.O000000000O0(itemStack);
            case "Зелье Гнева" -> this.O00000000(itemStack, Items.SPLASH_POTION, this.O00000000(EntityAttributes.ATTACK_DAMAGE, 5.0))
               && O000000OOOO00.O000000000O00(itemStack);
            case "Талисман Сара", "Талисман Сары" -> this.O00000000(itemStack, Items.TOTEM_OF_UNDYING, this.O00000000(EntityAttributes.MAX_HEALTH, 2.0));
            case "Хлопушка" -> O000000OOOO00.O000000000O000(itemStack);
            case "Святая Вода" -> O000000OOOO00.O000000000O00O(itemStack);
            case "Зелье Палладина" -> O000000OOOO00.O000000000O0O(itemStack);
            case "Зелье Радиации" -> O000000OOOO00.O000000000O0O0(itemStack);
            case "Снотворное" -> O000000OOOO00.O000000000O0OO(itemStack);
            case "Пласт" -> O000000OOOO00.O000000000OOO(itemStack);
            case "Вайт" -> O000000OOOO00.O00000000O00(itemStack);
            case "Блек" -> O000000OOOO00.O00000000O000(itemStack);
            case "Блок дамагер" -> O000000OOOO00.O00000000O00OO(itemStack);
            case "Прогрузчик чанков" -> O000000OOOO00.O00000000O0O(itemStack);
            case "Маяк" -> O000000OOOO00.O00000000O0O0(itemStack);
            case "Проклятая Душа" -> O000000OOOO00.O00000000O0O00(itemStack);
            case "Драконий Скин" -> O000000OOOO00.O00000000O0O0O(itemStack);
            case "Огненный Смерч" -> O000000OOOO00.O00000000O0OO(itemStack);
            case "Снежок Заморозка" -> O000000OOOO00.O00000000O0OO0(itemStack);
            case "Божья Аура" -> O000000OOOO00.O00000000O0OOO(itemStack);
            case "Серебро" -> O000000OOOO00.O00000000OO(itemStack);
            case "Божье Касание", "Божье касание" -> O000000OOOO00.O00000000OO0(itemStack);
            case "Мощный Удар" -> O000000OOOO00.O00000000OO00(itemStack);
            case "Мега Бульдозер" -> O000000OOOO00.O00000000OO000(itemStack);
            case "Нерушимые Элитры" -> O000000OOOO00.O00000000OO00O(itemStack);
            case "Опыт 15" -> O000000OOOO00.O000000000OOO0(itemStack);
            case "Опыт 30" -> O000000OOOO00.O000000000OOOO(itemStack);
            case "Опыт 45" -> O000000OOOO00.O00000000O0(itemStack);
            case "Опыт 50" -> O000000OOOO00.O00000000O(itemStack);
            default -> this.O0000000000(string, itemStack);
         };
      }
   }

   private boolean O000000000(String string, ItemStack itemStack) {
      if (string != null && itemStack != null && !itemStack.isEmpty()) {
         return switch (string) {
            case "Вещи Крушителя", "Набор Крушителя" -> this.O000000000000(itemStack);
            case "Броня Крушителя", "Броня Крушителя с шипами", "Броня Крушителя шип", "Броня Крушителя без шипов", "Броня Крушителя без шип" -> this.O0000000000000(
               itemStack
            );
            case "Шлем Крушителя" -> this.O00000000(string, O000000OOOO.O00000000(), itemStack);
            case "Нагрудник Крушителя" -> this.O00000000(string, O000000OOOO.O000000000(), itemStack);
            case "Поножи Крушителя" -> this.O00000000(string, O000000OOOO.O0000000000(), itemStack);
            case "Ботинки Крушителя" -> this.O00000000(string, O000000OOOO.O00000000000(), itemStack);
            case "Меч Крушителя" -> this.O00000000(string, O000000OOOO.O000000000000(), itemStack);
            case "Кирка Крушителя" -> this.O00000000(string, O000000OOOO.O0000000000000(), itemStack);
            case "Арбалет Крушителя" -> this.O00000000(string, O000000OOOO.O000000000000O(), itemStack);
            case "Трезубец Крушителя" -> this.O00000000(string, O000000OOOO.O00000000000O(), itemStack);
            case "Булава Крушителя" -> this.O00000000(string, O000000OOOO.O00000000000O0(), itemStack);
            case "Лук Крушителя" -> this.O00000000(itemStack, Items.BOW);
            case "Элитры Крушителя" -> this.O00000000(itemStack, Items.ELYTRA);
            case "Удочка Крушителя" -> this.O00000000(itemStack, Items.FISHING_ROD);
            default -> false;
         };
      } else {
         return false;
      }
   }

   private boolean O000000000000(ItemStack itemStack) {
      return this.O0000000000000(itemStack)
         || this.O00000000("Вещи Крушителя", O000000OOOO.O000000000000(), itemStack)
         || this.O00000000("Вещи Крушителя", O000000OOOO.O0000000000000(), itemStack)
         || this.O00000000("Вещи Крушителя", O000000OOOO.O000000000000O(), itemStack)
         || this.O00000000("Вещи Крушителя", O000000OOOO.O00000000000O(), itemStack)
         || this.O00000000("Вещи Крушителя", O000000OOOO.O00000000000O0(), itemStack);
   }

   private boolean O0000000000000(ItemStack itemStack) {
      return this.O00000000("Броня Крушителя", O000000OOOO.O00000000(), itemStack)
         || this.O00000000("Броня Крушителя", O000000OOOO.O000000000(), itemStack)
         || this.O00000000("Броня Крушителя", O000000OOOO.O0000000000(), itemStack)
         || this.O00000000("Броня Крушителя", O000000OOOO.O00000000000(), itemStack);
   }

   private boolean O00000000(String string, ItemStack itemStack, ItemStack itemStack2) {
      if (itemStack == null || itemStack.isEmpty() || itemStack2 == null || itemStack2.isEmpty()) {
         return false;
      } else if (!itemStack2.isOf(itemStack.getItem())) {
         return false;
      } else {
         String var4 = this.O000000000O(itemStack.getName().getString());
         if (!var4.isEmpty() && !this.O000000000O(this.O00000000000O0(itemStack2)).contains(var4)) {
            return false;
         } else {
            ItemEnchantmentsComponent var5 = (ItemEnchantmentsComponent)itemStack.get(DataComponentTypes.ENCHANTMENTS);
            if (var5 != null && !var5.isEmpty() && !this.O00000000(string, itemStack2, var5)) {
               return false;
            } else {
               LoreComponent var6 = (LoreComponent)itemStack.get(DataComponentTypes.LORE);
               if (var6 != null) {
                  String var7 = this.O000000000O(this.O00000000000O0(itemStack2));

                  for (Text var9 : var6.lines()) {
                     String var10 = this.O000000000O(var9.getString());
                     if (!var10.isEmpty() && !var7.contains(var10)) {
                        return false;
                     }
                  }
               }

               return true;
            }
         }
      }
   }

   private boolean O00000000(String string, ItemStack itemStack, ItemEnchantmentsComponent itemEnchantmentsComponent) {
      ItemEnchantmentsComponent var4 = (ItemEnchantmentsComponent)itemStack.get(DataComponentTypes.ENCHANTMENTS);

      for (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var6 : itemEnchantmentsComponent.getEnchantmentEntries()) {
         String var7 = this.O00000000((RegistryEntry<Enchantment>)var6.getKey());
         if (var7.isBlank() || O000000000(string, var7)) {
            if (var4 == null || var4.isEmpty()) {
               return false;
            }

            if (this.O00000000(var4, (RegistryEntry<Enchantment>)var6.getKey()) < var6.getIntValue()) {
               return false;
            }
         }
      }

      return true;
   }

   private String O00000000(RegistryEntry<Enchantment> registryEntry) {
      return registryEntry.getKey().map(registryKey -> O000000OOOO000.O000000000000(registryKey.getValue().toString())).orElse("");
   }

   private int O00000000(ItemEnchantmentsComponent itemEnchantmentsComponent, RegistryEntry<Enchantment> registryEntry) {
      for (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var4 : itemEnchantmentsComponent.getEnchantmentEntries()) {
         if (((RegistryEntry)var4.getKey()).equals(registryEntry)) {
            return var4.getIntValue();
         }
      }

      return 0;
   }

   private boolean O000000000000O(ItemStack itemStack) {
      return this.O00000000(itemStack, Items.BOW) || this.O00000000(itemStack, Items.ELYTRA) || this.O00000000(itemStack, Items.FISHING_ROD);
   }

   private boolean O00000000(ItemStack itemStack, Item item) {
      return itemStack != null && !itemStack.isEmpty() && itemStack.isOf(item) ? this.O00000000(itemStack, "крушител") && this.O00000000000O(itemStack) : false;
   }

   private boolean O00000000(ItemStack itemStack, String string) {
      return this.O000000000O(this.O00000000000O0(itemStack)).contains(this.O000000000O(string));
   }

   private boolean O00000000000O(ItemStack itemStack) {
      return itemStack.hasEnchantments()
         || itemStack.hasGlint()
         || itemStack.contains(DataComponentTypes.CUSTOM_NAME)
         || itemStack.contains(DataComponentTypes.LORE)
         || itemStack.contains(DataComponentTypes.CUSTOM_DATA);
   }

   private String O00000000000O0(ItemStack itemStack) {
      StringBuilder var2 = new StringBuilder();
      var2.append(itemStack.getName().getString()).append(' ');
      LoreComponent var3 = (LoreComponent)itemStack.get(DataComponentTypes.LORE);
      if (var3 != null) {
         for (Text var5 : var3.lines()) {
            var2.append(var5.getString()).append(' ');
         }
      }

      var2.append(itemStack.getComponents());
      return var2.toString();
   }

   private String O00000000000OO(ItemStack itemStack) {
      StringBuilder var2 = new StringBuilder();
      var2.append(itemStack.getName().getString()).append(' ');
      LoreComponent var3 = (LoreComponent)itemStack.get(DataComponentTypes.LORE);
      if (var3 != null) {
         for (Text var5 : var3.lines()) {
            var2.append(var5.getString()).append(' ');
         }
      }

      return var2.toString();
   }

   private String O000000000O(String string) {
      return string == null ? "" : string.replaceAll("(?i)§[0-9A-FK-OR]", "").toLowerCase(Locale.ROOT).replaceAll("[^\\p{L}\\p{N}]+", "");
   }

   private boolean O00000000(ItemStack itemStack, Item item, AutoBuy.W57... o00000000s) {
      if (itemStack != null && !itemStack.isEmpty() && itemStack.isOf(item)) {
         AttributeModifiersComponent var4 = (AttributeModifiersComponent)itemStack.get(DataComponentTypes.ATTRIBUTE_MODIFIERS);
         if (var4 == null) {
            return o00000000s.length == 0;
         } else {
            HashMap var5 = new HashMap();
            int var6 = 0;

            for (net.minecraft.component.type.AttributeModifiersComponent.Entry var8 : var4.modifiers()) {
               EntityAttributeModifier var9 = var8.modifier();
               var6++;
               var5.put(var8.attribute(), var9.value());
            }

            if (var6 == o00000000s.length && var5.size() == o00000000s.length) {
               for (AutoBuy.W57 var10 : o00000000s) {
                  Double var11 = (Double)var5.get(var10.attribute());
                  if (var11 == null || Math.abs(var11 - var10.value()) > 1.0E-4) {
                     return false;
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private AutoBuy.W57 O00000000(RegistryEntry<EntityAttribute> registryEntry, double d) {
      return new AutoBuy.W57(registryEntry, d);
   }

   private boolean O0000000000(String string, ItemStack itemStack) {
      if (string != null && itemStack != null && !itemStack.isEmpty()) {
         if (string.startsWith("minecraft:") || !string.contains(":") && Identifier.tryParse("minecraft:" + string) != null) {
            Identifier var7 = Identifier.tryParse(string.contains(":") ? string : "minecraft:" + string);
            if (var7 != null) {
               Item var4 = (Item)Registries.ITEM.get(var7);
               if (var4 != Items.AIR && itemStack.isOf(var4)) {
                  String var5 = var4.getDefaultStack().getName().getString();
                  String var6 = itemStack.getName().getString();
                  return var6.equalsIgnoreCase(var5) || this.O000000000O0(var6).equals(this.O000000000O0(var5));
               }
            }

            return false;
         } else {
            String var3 = itemStack.getName().getString();
            return var3.equalsIgnoreCase(string) || this.O000000000O0(var3).equals(this.O000000000O0(string));
         }
      } else {
         return false;
      }
   }

   String O000000000O0(String string) {
      return string == null ? "" : string.toLowerCase(Locale.ROOT).replaceAll("[^\\p{L}\\p{N}]+", "");
   }

   private AutoBuy.W59 O000000000000O(Slot slot) {
      if (slot != null && slot.hasStack()) {
         LoreComponent var2 = (LoreComponent)slot.getStack().get(DataComponentTypes.LORE);
         if (var2 == null) {
            return new AutoBuy.W59(0L, null);
         } else {
            long var3 = 0L;
            String var5 = null;

            for (Text var7 : var2.lines()) {
               String var8 = this.O000000000O000(var7.getString());
               String var9 = var8.toLowerCase(Locale.ROOT);
               if (var5 == null) {
                  int var10 = var9.indexOf("продавец:");
                  if (var10 != -1) {
                     var5 = var8.substring(var10 + "продавец:".length()).trim();
                  } else {
                     var10 = var9.indexOf("seller:");
                     if (var10 != -1) {
                        var5 = var8.substring(var10 + "seller:".length()).trim();
                     }
                  }
               }

               if (var3 <= 0L && (var8.contains("$") || var8.contains("¤") || var9.contains("цена") || var9.contains("стоимость"))) {
                  var3 = this.O000000000O00(var8);
               }
            }

            return new AutoBuy.W59(var3, var5);
         }
      } else {
         return new AutoBuy.W59(0L, null);
      }
   }

   private String O00000000000O(Slot slot) {
      if (slot != null && slot.hasStack()) {
         LoreComponent var2 = (LoreComponent)slot.getStack().get(DataComponentTypes.LORE);
         if (var2 == null) {
            return null;
         } else {
            for (Text var4 : var2.lines()) {
               String var5 = this.O000000000O000(var4.getString());
               String var6 = var5.toLowerCase(Locale.ROOT);
               int var7 = var6.indexOf("продавец:");
               if (var7 != -1) {
                  return var5.substring(var7 + "продавец:".length()).trim();
               }

               var7 = var6.indexOf("seller:");
               if (var7 != -1) {
                  return var5.substring(var7 + "seller:".length()).trim();
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   private long O00000000000O0(Slot slot) {
      if (slot != null && slot.hasStack()) {
         LoreComponent var2 = (LoreComponent)slot.getStack().get(DataComponentTypes.LORE);
         if (var2 == null) {
            return 0L;
         } else {
            for (Text var4 : var2.lines()) {
               String var5 = this.O000000000O000(var4.getString());
               String var6 = var5.toLowerCase(Locale.ROOT);
               if (var5.contains("$") || var5.contains("¤") || var6.contains("цена") || var6.contains("стоимость")) {
                  long var7 = this.O000000000O00(var5);
                  if (var7 > 0L) {
                     return var7;
                  }
               }
            }

            return 0L;
         }
      } else {
         return 0L;
      }
   }

   private long O000000000O00(String string) {
      if (string == null) {
         return 0L;
      } else {
         String var2 = string.replace(' ', ' ').toLowerCase(Locale.ROOT).trim();
         long var3 = 1L;
         if (var2.contains("млн") || var2.endsWith("m") || var2.endsWith("м")) {
            var3 = 1000000L;
         } else if (var2.contains("тыс") || var2.endsWith("k") || var2.endsWith("к")) {
            var3 = 1000L;
         }

         String var5 = var2.replaceAll("[^0-9]", "");
         if (var5.isEmpty()) {
            return 0L;
         } else {
            try {
               return Math.multiplyExact(Long.parseLong(var5), var3);
            } catch (NumberFormatException | ArithmeticException var7) {
               return 0L;
            }
         }
      }
   }

   private String O000000000O000(String string) {
      return string == null ? "" : string.replaceAll("§.", "").replace(' ', ' ').trim();
   }

   private String O00000000(Slot slot, String string) {
      return switch (string) {
         case "FunTime" -> O000000OOOO0O.O00000000(slot);
         case "SpookyTime" -> O000000OOOO0OO.O00000000(slot);
         case "HolyWorld" -> this.O00000000000O(slot);
         default -> null;
      };
   }

   private long O000000000(Slot slot, String string) {
      return switch (string) {
         case "FunTime" -> O000000OOOO0O.O000000000(slot);
         case "SpookyTime" -> O000000OOOO0OO.O000000000(slot);
         case "HolyWorld" -> this.O00000000000O0(slot);
         default -> 0L;
      };
   }

   private void O000000000O00O(String string) {
      if (string.contains("Вы успешно купили")) {
         this.O000000000O0O(string);
      } else {
         this.O000000000O0O0(string);
      }
   }

   private void O000000000O0O(String string) {
      String var2 = "Вы успешно купили ";
      String var3 = " за ";
      int var4 = string.indexOf(var2);
      int var5 = string.indexOf(var3);
      if (var4 != -1 && var5 != -1) {
         String var6 = string.substring(var4 + var2.length(), var5).replace(' ', ' ').trim();
         String var7 = string.substring(var5 + var3.length()).replaceAll("[^\\d]", "").trim();
         if (!var7.isEmpty()) {
            this.O00000000(var6, Long.parseLong(var7));
         }
      }
   }

   private void O000000000O0O0(String string) {
      Matcher var2 = O0000000O0O00O.matcher(this.O000000000O000(string));
      if (var2.find()) {
         String var3 = var2.group(1) != null ? var2.group(1) : var2.group(2);
         if (var3 != null && !var3.isBlank()) {
            String var4 = var2.group(3);
            String var5 = var2.group(5);
            String var6 = var5 == null ? "" : var5.replaceAll("[^\\d]", "");
            if (!var6.isEmpty()) {
               long var7 = Long.parseLong(var6);
               String var9 = this.O000000000O0OO(var3);
               if (var4 != null && !var4.isBlank()) {
                  var9 = var9 + " x" + var4.replaceAll("[^\\d]", "");
               }

               this.O00000000(var9, var7);
            }
         }
      }
   }

   private String O000000000O0OO(String string) {
      String var2 = this.O000000000O000(string).replace(' ', ' ').replaceAll("^[\\s\\-–—:]+", "").replaceAll("[\\s\\-–—:]+$", "").trim();
      var2 = O000000OOOO000.O000000000000O(var2);
      O000000OOOO000.W120 var3 = O000000OOOO000.O0000000000(var2);
      return var3 == null ? var2 : var3.label();
   }

   private void O00000000(String string, long l) {
      int var4 = 1;
      String var5 = string;
      if (string.matches("(?i)^[xхXХ]?\\d+[xхXХ]?\\s+.*")) {
         String[] var6 = string.split("\\s+", 2);
         String var7 = var6[0].replaceAll("[^\\d]", "");
         if (!var7.isEmpty()) {
            var4 = Integer.parseInt(var7);
         }

         var5 = var6[1].trim();
      } else if (string.matches("(?i).*\\s+[xхXХ]?\\d+[xхXХ]?$")) {
         int var8 = string.lastIndexOf(32);
         String var9 = string.substring(var8 + 1).replaceAll("[^\\d]", "");
         if (!var9.isEmpty()) {
            var4 = Integer.parseInt(var9);
         }

         var5 = string.substring(0, var8).trim();
      }

      O00000000O0O0O.add(0, new AutoBuy.W62(string, var5, var4, l, System.currentTimeMillis()));
      if (O00000000O0O0O.size() > 200) {
         O00000000O0O0O.remove(O00000000O0O0O.size() - 1);
      }

      if (ClientUtil.O000000000O.O0000000000()) {
         ru.metaculture.protection.O0000000OO0O00.O00000000("[AutoBuy] Успешно куплено: " + string + " за " + l);
      }
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      boolean var2 = this.O000000000O0O.O0000000000() || this.O0000000OO0O0 || this.O0000000OO0OO0;
      if (this.O0000000000000 || var2) {
         if (this.O0000000000000 && !o0000000O000OO.O0000000000()) {
            if (o0000000O000OO.O00000000000() instanceof InventoryS2CPacket var3) {
               this.O000000O0O00O0.O000000000(var3.syncId());
            } else if (o0000000O000OO.O00000000000() instanceof ScreenHandlerSlotUpdateS2CPacket var4) {
               this.O000000O0O00O0.O0000000000(var4.getSyncId());
            } else if (o0000000O000OO.O00000000000() instanceof OpenScreenS2CPacket var5) {
               this.O000000O0O00O0.O00000000000(var5.getSyncId());
            }
         }

         if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var11) {
            String var13 = var11.content().getString();
            if (var2 && this.O00000000O000(var13)) {
               return;
            }

            if (!this.O0000000000000) {
               return;
            }

            if (var13.contains("Вы успешно купили") || var13.contains("Вы купили")) {
               long var14 = this.O000000O00OOO;
               boolean var7 = this.O0000000O00()
                  || (this.O000000000O00O.O000000000("FunTime") || this.O000000000O00O.O000000000("SpookyTime"))
                     && var14 != 0L
                     && System.currentTimeMillis() - var14 <= 15000L;
               this.O000000O00OOO = 0L;
               this.O000000O0O00O0.O0000000000();
               this.O00000000OOOO();
               if (!var7) {
                  return;
               }

               boolean var8 = AutoSell.O000000000O != null && AutoSell.O000000000O.O0000000000000 && AutoSell.O000000000O.O0000000000O0();
               if (O0000000000.player != null && O0000000000.currentScreen != null) {
                  O0000000000.player.closeScreen();
               }

               try {
                  this.O000000000O00O(var13);
               } catch (Exception var10) {
               }

               if (this.O000000000O00O.O000000000("HolyWorld")) {
                  this.O0000000000(var8);
               } else {
                  O000000OO000OO.O0000000000(var8);
               }
            } else if (var13.contains("Не удалось выставить") && var13.contains("освободите хранилище")) {
               O000000OO000OO.O0000000000O();
               if (!this.O0000000O00OO()) {
                  AutoSell.O0000000000OO();
                  ChatUtil.O00000000("§c[AutoBuy] Хранилище заполнено. Продажа приостановлена.");
                  O000000OO000OO.O00000000000(true);
               }
            } else if (this.O00000000O(var13)) {
               O000000OO000OO.O0000000000O0();
               ChatUtil.O00000000("§a[AutoBuy] Товар продан! Хранилище освободилось.");
               if (!this.O0000000O00OO()) {
                  O000000OO000OO.O00000000000(true);
               }
            } else if (this.O000000000O00O.O000000000("FunTime") && !O000000000O0 && !O000000000O00 && this.O000000000OO0(var13)) {
               this.O000000000OOO(var13);
            } else if ((this.O000000000O00O.O000000000("HolyWorld") || this.O000000000O00O.O000000000("FunTime"))
               && !O000000000O0
               && !O000000000O00
               && this.O000000000OO00(var13)) {
               this.O000000000OO0O(var13);
            } else if (this.O00000000O0(var13)) {
               this.O00000000OOOO();
               if (O0000000000.player != null) {
                  if (O0000000000.currentScreen != null) {
                     O0000000000.player.closeScreen();
                  }

                  this.O00000000(500L, true);
               }
            } else if (var13.contains("Предмет уже продан") || var13.contains("уже купили") || var13.contains("Недостаточно")) {
               this.O00000000OOOO();
               ChatUtil.O00000000("§c[AutoBuy] §fНе удалось купить! (Предмет продан или ошибка)");
               this.O00000000(500L, true);
            } else if (var13.contains("Такого предмета Не существует")) {
               if (this.O0000000OO0O0) {
                  this.O0000000OO0O0 = false;
                  this.O0000000OO0O0O++;
                  this.O0000000O0OOO.O00000000();
                  ChatUtil.O00000000("§e[AutoParse] §fПредмет не существует на сервере, скип.");
               }
            } else if (var13.contains("выставлен на продажу за")) {
               O000000OO000OO.O00000000000OO();
               if (AutoSell.O000000000O == null || !AutoSell.O000000000O.O0000000000000) {
                  O000000OO000OO.O00000000(true);
               }
            } else if (this.O000000000O00O.O000000000("FunTime") && var13.contains("Вы уже подключены к этому серверу")) {
               this.O0000000O0000O();
            } else if (this.O000000000O00O.O000000000("FunTime") && this.O00000000O00(var13)) {
               this.O0000000O0000O();
            } else if (this.O000000000O00O.O000000000("FunTime")
               && (var13.contains("Недопустимо нажимать в режиме AFK") || var13.contains("Данная команда недоступна в режиме AFK"))) {
               this.O0000000O00OO0();
            }
         }
      }
   }

   private int O0000000O0000O() {
      return this.O0000000000000(true);
   }

   private int O0000000000000(boolean bl) {
      if (O0000000000.player != null && this.O000000000O00O.O000000000("FunTime")) {
         int var2 = this.O0000000O0O0();
         int var3 = var2 != -1 ? var2 : this.O0000000OO0000;

         int var4;
         do {
            var4 = ThreadLocalRandom.current().nextInt(901, 904);
         } while (var4 == var3);

         this.O0000000OO0000 = var4;
         this.O000000O0O00O0.O0000000000();
         if (O0000000000.currentScreen != null) {
            O0000000000.player.closeScreen();
         }

         O0000000000.player.networkHandler.sendChatCommand("an" + var4);
         this.O0000000O0OO00.O00000000();
         if (bl) {
            this.O000000O00OOO0++;
            if (this.O000000O00OOO0 > 3) {
               this.O000000O00OOO0 = 0;
               this.O0000000O();
            } else {
               this.O000000000OO(String.valueOf(var4));
            }
         }

         return var4;
      } else {
         return -1;
      }
   }

   private long O0000000O000O() {
      if (this.O0000000OO00O == 0) {
         return ThreadLocalRandom.current().nextLong(9000L, 12000L);
      } else {
         return this.O0000000OO00O < 5 ? ThreadLocalRandom.current().nextLong(1200L, 2200L) : ThreadLocalRandom.current().nextLong(3000L, 4500L);
      }
   }

   private long O0000000O000O0() {
      return ThreadLocalRandom.current().nextLong(2000L, 4501L);
   }

   private long O0000000O000OO() {
      return ThreadLocalRandom.current().nextLong(600L, 1401L);
   }

   private void O000000000OO(String string) {
      this.O00000000OOOO();
      this.O000000O0O00O0.O0000000000();
      this.O0000000OO0O = string == null ? "" : string;
      this.O0000000OO000O = true;
      this.O0000000OO00O = 0;
      this.O0000000OOO00 = System.currentTimeMillis();
      this.O0000000OOO000 = System.currentTimeMillis() + this.O0000000O000O0();
      this.O0000000OOO0O0 = false;
      this.O0000000OOO0OO = false;
      this.O0000000OOOO00 = -1;
      this.O0000000OOOO0O = 0L;
      this.O000000O00OOOO = false;
      this.O000000O0O = 0L;
      this.O0000000O0OO0O.O00000000();
   }

   void O000000000O0O0() {
      this.O00000000(0L, false);
   }

   private void O000000000(long l) {
      this.O00000000(l, false);
   }

   private void O00000000(long l, boolean bl) {
      if (O0000000000.player != null) {
         this.O00000000OOOO();
         this.O000000O0O00O0.O0000000000();
         this.O0000000OOOO00 = this.O0000000O00O0O();
         if (bl && O0000000000.currentScreen != null) {
            O0000000000.player.closeScreen();
         }

         this.O0000000OO000O = true;
         this.O0000000OO00O = 0;
         this.O0000000OO0O = "";
         this.O0000000OOO00 = System.currentTimeMillis();
         this.O0000000OOO000 = System.currentTimeMillis() + Math.max(0L, l);
         this.O0000000OOO0O0 = bl;
         this.O0000000OOO0OO = false;
         this.O0000000OOOO0O = this.O0000000OOO000 + this.O0000000O000OO();
         this.O000000O00OOOO = false;
         this.O000000O0O = 0L;
         this.O0000000O0OO0O.O00000000();
      }
   }

   private boolean O0000000O00O() {
      if (!this.O0000000OOO0O0 && O0000000000.currentScreen instanceof GenericContainerScreen var1 && this.O000000000000O(var1)) {
         this.O0000000OO000O = false;
         this.O0000000OO00O = 0;
         this.O0000000OO0O = "";
         this.O0000000OOO00 = 0L;
         this.O0000000OOO000 = 0L;
         this.O0000000OOO0OO = false;
         this.O0000000OOOO00 = -1;
         this.O0000000OOOO0O = 0L;
         this.O0000000OO00.O00000000();
         return false;
      } else if (!this.O0000000O00O0()) {
         return true;
      } else if (System.currentTimeMillis() < this.O0000000OOO000) {
         return true;
      } else {
         if (this.O0000000OO00O == 0 || this.O0000000O0OO0O.O000000000000(this.O0000000O000O())) {
            if (this.O0000000OOO0O0 && O0000000000.currentScreen != null) {
               O0000000000.player.closeScreen();
            }

            O0000000000.player.networkHandler.sendChatCommand("ah");
            this.O0000000OO00O++;
            this.O0000000OOO0O0 = false;
            this.O0000000OOOO0O = System.currentTimeMillis() + this.O0000000O000OO();
            this.O0000000O0OO0O.O00000000();
         }

         return true;
      }
   }

   private boolean O0000000O00O0() {
      if (this.O0000000OO0O.isEmpty()) {
         return true;
      } else {
         String var1 = this.O0000000O0O00();
         long var2 = System.currentTimeMillis() - this.O0000000OOO00;
         boolean var4 = this.O0000000OO0O.equals(var1) && var2 >= 2500L;
         if (!var4 && !this.O0000000OOO0OO && var2 >= 4500L && O0000000000.player != null) {
            O0000000000.player.networkHandler.sendChatCommand("an" + this.O0000000OO0O);
            this.O0000000OOO0OO = true;
            this.O0000000OOO00 = System.currentTimeMillis();
            return false;
         } else {
            var2 = System.currentTimeMillis() - this.O0000000OOO00;
            if (!var4 && var2 < 12000L) {
               return false;
            } else {
               this.O0000000OO0O = "";
               this.O0000000OOO0OO = false;
               return true;
            }
         }
      }
   }

   private boolean O0000000O00O00() {
      if (O0000000000.player != null && !O000000000O0 && !O000000000O00 && !this.O0000000OO00O0 && !this.O000000000O0O.O0000000000() && !this.O0000000OO0O0) {
         Screen var1 = O0000000000.currentScreen;
         if (!(var1 instanceof AutoBuyScreen) && !(var1 instanceof ModernClickGuiScreen)) {
            if (var1 instanceof GenericContainerScreen var2) {
               if (this.O0000000000(var2)) {
                  this.O0000000OO00.O00000000();
                  return false;
               }

               if (this.O00000000000(var2)) {
                  this.O0000000OO00.O00000000();
                  return false;
               }
            }

            if (!this.O0000000OO00.O000000000000(750L)) {
               return false;
            } else {
               this.O00000000(0L, true);
               this.O0000000OO00.O00000000();
               return true;
            }
         } else {
            this.O0000000OO00.O00000000();
            return false;
         }
      } else {
         this.O0000000OO00.O00000000();
         return false;
      }
   }

   private boolean O000000000000O(GenericContainerScreen genericContainerScreen) {
      if (!this.O00000000000(genericContainerScreen)) {
         return false;
      } else if (System.currentTimeMillis() < this.O0000000OOOO0O) {
         return false;
      } else {
         int var2 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).syncId;
         return this.O0000000OOOO00 == -1 || var2 != this.O0000000OOOO00;
      }
   }

   private int O0000000O00O0O() {
      return O0000000000.currentScreen instanceof GenericContainerScreen var1 && this.O00000000000(var1)
         ? ((GenericContainerScreenHandler)var1.getScreenHandler()).syncId
         : -1;
   }

   private boolean O000000000OO0(String string) {
      if (string == null) {
         return false;
      } else {
         String var2 = string.replaceAll("§.", "").toLowerCase(Locale.ROOT);
         return var2.contains("после входа на режим") && var2.contains("аукцион") && O00000000OO0.matcher(string).find();
      }
   }

   private boolean O000000000OO00(String string) {
      return string == null ? false : O00000000OO00.matcher(this.O000000000O000(string).toLowerCase(Locale.ROOT)).find();
   }

   private void O000000000OO0O(String string) {
      long var2 = this.O000000000OOOO(string);
      if (O0000000000.player != null && O0000000000.currentScreen != null) {
         O0000000000.player.closeScreen();
      }

      this.O00000000(var2, true);
   }

   private void O000000000OOO(String string) {
      long var2 = this.O000000000OOO0(string);
      if (O0000000000.player != null && O0000000000.currentScreen != null) {
         O0000000000.player.closeScreen();
      }

      if (this.O000000000O0O.O0000000000()) {
         this.O0000000OO0O0 = false;
         this.O0000000OOO0O = System.currentTimeMillis() + var2;
         this.O0000000O0OOO.O00000000();
         this.O0000000O0OOO0.O00000000();
      } else {
         this.O000000000(var2);
      }
   }

   private long O000000000OOO0(String string) {
      Matcher var2 = O00000000OO0.matcher(string == null ? "" : string);
      if (!var2.find()) {
         return 9000L;
      } else {
         try {
            int var3 = Integer.parseInt(var2.group(1));
            return Math.max(9000L, var3 * 1000L + 2000L);
         } catch (NumberFormatException var4) {
            return 9000L;
         }
      }
   }

   private long O000000000OOOO(String string) {
      Matcher var2 = O00000000OO00.matcher(this.O000000000O000(string).toLowerCase(Locale.ROOT));
      if (!var2.find()) {
         return 1250L;
      } else {
         try {
            int var3 = Integer.parseInt(var2.group(1));
            return Math.max(250L, var3 * 1000L + 250L);
         } catch (NumberFormatException var4) {
            return 1250L;
         }
      }
   }

   private boolean O0000000O00OO() {
      return AutoSell.O000000000O != null
         && AutoSell.O000000000O.O0000000000000
         && AutoSell.O000000000O.O0000000000O0()
         && AutoSell.O000000000O.O0000000000O00();
   }

   private boolean O00000000O(String string) {
      if (string == null) {
         return false;
      } else if (string.contains("У Вас купили") && string.contains("на /ah")) {
         return true;
      } else {
         String var2 = this.O000000000O000(string).toLowerCase(Locale.ROOT);
         return var2.contains("купил у вас") && var2.contains(" за ") && (var2.contains("¤") || var2.contains("$"));
      }
   }

   private void O0000000O00OO0() {
      if (O0000000000.player != null && this.O000000000O00O.O000000000("FunTime")) {
         String var1 = this.O0000000O0O00();
         if ("N/A".equals(var1) && !this.O0000000OO00OO.isEmpty()) {
            var1 = this.O0000000OO00OO;
         }

         if ("N/A".equals(var1) && this.O0000000OO0000 != -1) {
            var1 = String.valueOf(this.O0000000OO0000);
         }

         if (!"N/A".equals(var1)) {
            this.O0000000OO00OO = var1;
            O0000000000.player.networkHandler.sendChatCommand("hub");
            this.O0000000OO00O0 = true;
            this.O0000000O0OOOO.O00000000();
            ChatUtil.O00000000("§e[AutoBuy] §fAFK заблокировал команду. Переподключаемся через /hub -> /an" + this.O0000000OO00OO + "...");
         }
      }
   }

   private void O0000000O00OOO() {
      if (this.O000000000O00O.O000000000("FunTime")) {
         int var1 = this.O0000000O0O0();
         if (var1 != -1) {
            this.O0000000OO0000 = var1;
            this.O0000000OOOO0 = false;
            this.O0000000OO0.O00000000();
         }
      }
   }

   private boolean O0000000O0O() {
      if (O0000000000.player != null && !this.O0000000OO000O && !this.O0000000OO00O0 && this.O0000000OO0000 != -1 && !this.O0000000OOOO0) {
         if (this.O0000000O0O0() != -1) {
            return false;
         } else if (!this.O0000000OO0.O000000000000(2500L)) {
            return false;
         } else {
            O0000000000.player.networkHandler.sendChatCommand("an" + this.O0000000OO0000);
            this.O0000000OOOO0 = true;
            this.O000000000OO(String.valueOf(this.O0000000OO0000));
            ChatUtil.O00000000("§e[AutoBuy] §fПохоже, нас выкинуло в хаб. Повторно заходим на " + this.O0000000OO0000 + "...");
            return true;
         }
      } else {
         return false;
      }
   }

   private int O0000000O0O0() {
      String var1 = this.O0000000O0O00();
      if ("N/A".equals(var1)) {
         return -1;
      } else {
         try {
            return Integer.parseInt(var1);
         } catch (NumberFormatException var3) {
            return -1;
         }
      }
   }

   private String O0000000O0O00() {
      try {
         O0000O000OOOO.O00000000.O00000000();
         String var1 = O0000O000OOOO.O00000000.O0000000000();
         return var1 != null && !var1.isEmpty() ? var1 : "N/A";
      } catch (Exception var2) {
         return "N/A";
      }
   }

   private boolean O00000000O0(String string) {
      if (string == null) {
         return false;
      } else if (string.contains("Этот товар уже Купили!")) {
         return true;
      } else if (!this.O000000000O00O.O000000000("FunTime")) {
         return false;
      } else {
         String var2 = string.toLowerCase(Locale.ROOT);
         return var2.contains("ошибка! этот товар уже купили") || var2.contains("ошибка") && var2.contains("товар уже купили");
      }
   }

   private boolean O00000000O00(String string) {
      if (string == null) {
         return false;
      } else {
         String var2 = string.replaceAll("§.", "").toLowerCase(Locale.ROOT);
         return var2.contains("были кикнуты при подключении") && var2.contains("сервер заполнен");
      }
   }

   public void O000000000O0OO() {
      if (this.O000000000O0O.O0000000000()) {
         this.O0000000O0O000();
      } else {
         if (this.O000000000000(false) && !this.O0000000000000) {
            this.O0000000O0O0O();
         }
      }
   }

   private void O0000000O0O000() {
      this.O000000000O0O.O000000000(false);
      this.O0000000OO0O0 = false;
      this.O0000000OO0O0O = 0;
      this.O0000000OO0OO = false;
      this.O0000000OO0OO0 = false;
      this.O0000000OO0OOO = "";
      this.O0000000OOO00O = 0L;
      this.O0000000OOO0O = 0L;
      this.O0000000O0OOO.O00000000();
      this.O0000000O0OOO0.O00000000();
      this.O00000000OO00O();
      this.O0000000O0O0O0();
   }

   private void O0000000O0O00O() {
      if (!this.O000000000O0O.O0000000000()) {
         this.O0000000O0O0O0();
      } else if (!this.O0000000OO0OO && !this.O000000000000(false)) {
         this.O0000000O0O0O0();
      } else {
         if (!this.O0000000OO0O00.isEmpty()) {
            this.O000000000O0O();
         }
      }
   }

   private boolean O00000000O000(String string) {
      if (string == null) {
         return false;
      } else if (this.O000000000O00O.O000000000("FunTime") && this.O000000000OO0(string)) {
         this.O000000000OOO(string);
         return true;
      } else if (string.contains("Такого предмета Не существует") && this.O0000000OO0O0) {
         this.O0000000OO0O0 = false;
         this.O0000000OO0O0O++;
         this.O0000000O0OOO.O00000000();
         ChatUtil.O00000000("§e[AutoParse] §fПредмет не существует на сервере, скип.");
         return true;
      } else {
         return false;
      }
   }

   private void O0000000O0O0O() {
      if (!this.O0000000000000) {
         EventManager.O00000000(this);
      }
   }

   private void O0000000O0O0O0() {
      if (!this.O0000000000000) {
         EventManager.O000000000(this);
      }
   }

   record W57(RegistryEntry<EntityAttribute> attribute, double value) {
   }

   record W58(String itemName, long maxPrice, O000000OOOO000.W120 holyWorldEntry, Item item, String normalizedName) {
   }

   record W59(long price, String seller) {
   }

   final class W60 {
      private final ItemStack O000000000;
      private String O0000000000;
      private String O00000000000;
      private String O000000000000;
      private String O0000000000000;
      private Identifier O000000000000O;

      W60(ItemStack itemStack) {
         this.O000000000 = itemStack;
      }

      String O00000000() {
         if (this.O0000000000 == null) {
            this.O0000000000 = O000000OOOO000.O000000000000(this.O000000000);
         }

         return this.O0000000000;
      }

      String O000000000() {
         if (this.O00000000000 == null) {
            this.O00000000000 = O000000OOOO000.O0000000000000(this.O000000000);
         }

         return this.O00000000000;
      }

      String O0000000000() {
         if (this.O000000000000 == null) {
            this.O000000000000 = this.O000000000.getName().getString();
         }

         return this.O000000000000;
      }

      String O00000000000() {
         if (this.O0000000000000 == null) {
            this.O0000000000000 = AutoBuy.this.O000000000O0(this.O0000000000());
         }

         return this.O0000000000000;
      }

      Identifier O000000000000() {
         if (this.O000000000000O == null) {
            this.O000000000000O = Registries.ITEM.getId(this.O000000000.getItem());
         }

         return this.O000000000000O;
      }
   }

   record W61(long unitPrice, long lotPrice, int count) {
   }

   public static class W62 {
      public String O00000000;
      public String O000000000;
      public int O0000000000;
      public long O00000000000;
      public long O000000000000;

      public W62(String string, String string2, int i, long l, long m) {
         this.O00000000 = string;
         this.O000000000 = string2;
         this.O0000000000 = i;
         this.O00000000000 = l;
         this.O000000000000 = m;
      }
   }

   record W63(long lotPrice, long estimatedValue, long profit, int fingerprint, boolean buyable) {
   }
}
