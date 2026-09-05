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
import net.minecraft.class_10185;
import net.minecraft.class_1320;
import net.minecraft.class_1322;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_2561;
import net.minecraft.class_2649;
import net.minecraft.class_2653;
import net.minecraft.class_2960;
import net.minecraft.class_304;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3944;
import net.minecraft.class_437;
import net.minecraft.class_476;
import net.minecraft.class_5134;
import net.minecraft.class_640;
import net.minecraft.class_6880;
import net.minecraft.class_7439;
import net.minecraft.class_7923;
import net.minecraft.class_9285;
import net.minecraft.class_9288;
import net.minecraft.class_9290;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import net.minecraft.class_9285.class_9287;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoBuy",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматическая покупка предметов с аукциона"
)
public class AutoBuy extends Module {
   private static final Pattern NUVvUUVuVNVv = Pattern.compile(
      "(\\d+)\\s*[/\\\\]\\s*\\d+|(?i)(?:страниц\\w*|стр\\.?|page)\\s*[:#]?\\s*(\\d+)|(?i)(\\d+)\\s*(?:из|of)\\s*\\d+"
   );
   private static final Pattern nNuVunNUVu = Pattern.compile("Подождите\\s+(\\d+)\\s*сек", 66);
   private static final Pattern UNvvunVVn = Pattern.compile("подождите\\s+(\\d+)\\s*сек\\S*\\s+для\\s+использования\\s+этой\\s+команды", 66);
   private static final long UnvuVuVnNuvu = 9000L;
   private static final long UvNNVUVNVuvV = 2000L;
   private static final long NnunUUnU = 250L;
   private static final long nvuVvuNnNUnv = 2500L;
   private static final long NnVnNVN = 4500L;
   private static final long vnvvNvUnVv = 12000L;
   private static final long OCOocoOoOO = 500L;
   private static final long o0Ooc0COOoc = 15000L;
   private static final long nvvnUnUn = 20000L;
   private static final long UnUUVuVunvVu = 240000L;
   private static final long nnvuvUNuUnN = 4000L;
   private static final long UVnuVUUVnnU = 8000L;
   private static final int VunnVNvNV = 3;
   private static final long NvUVUvVVnUu = 2000L;
   private static final long unnUnUNVnN = 4500L;
   private static final long NnuUnUNnu = 600L;
   private static final long UnnnvvU = 1400L;
   private static final long VUUnuVvVu = 750L;
   private static final long VvVuvUvvNNVv = 15000L;
   private static final long UnnNNvuvvUU = 2000L;
   private static final int VNNnnVUuvv = 50;
   private static final int vUvUvUNNuNvn = 48;
   private static final String uuVuUuuVVNvN = "__wild_funtime_shulker__";
   private static final int VvuUUUNNNv = 0;
   private static final int uuuVnuvnnNnU = 1;
   private static final int nNunUnVN = 2;
   private static final int VnVuuvVvnNv = 3;
   private static final int vuvvuVuVv = 4;
   private static final long uunNUuunVU = 1200L;
   private static final long NvnuuuvnVV = 4500L;
   private static final long NnUVNnuvUv = 90L;
   private static final float UuuuNNunN = (float) (Math.PI * 2);
   private static final long NNVNuUvVn = 75L;
   private static final double vuNnuUnu = 1.0;
   private static final double uuvvuNvuUNVV = 4.0;
   private static final int uVvunVUNuUvu = 3;
   private static final Pattern NVNnnvVnvV = Pattern.compile(
      "Вы\\s+купили\\s+(?:[-–—]\\s*)?(?:\\[([^\\]]+)]|(.+?))\\s*(?:[-–—]?\\s*[xхXХ](\\d+))?\\s+у\\s+(.+?)\\s+за\\s+([\\d\\s.,]+)\\s*[¤$]?", 66
   );
   private static final Set<String> vUNuuvvnVnv = Set.of(
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
   private static final Set<String> unnnNUNnVu = Set.of("Явная Пыль", "Дезориентация", "Трапка", "Отмычка к Сферам");
   public static AutoBuy NVNnnvnuunNv;
   public static boolean uVunuUNVVUUV = false;
   public static boolean UNnVVNvvnVvU = false;
   public static boolean uNnUnnuNUnNu = false;
   public final UvNnUnuNUUU NnUuNNU = new UvNnUnuNUUU("Режим сервера", "FunTime", "FunTime", "SpookyTime", "HolyWorld");
   public final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Auto Parse", false);
   public final nNUuNvVn UnUNuUU = new nNUuNvVn("Парс Скидка %", 20.0F, 1.0F, 100.0F, 1.0F, true).UuUVuuUu(() -> !this.nNvNUVU.uUnuvNvvNU());
   public final vvNnnUNnVvn uUVuVvuNUvnu = new vvNnnUNnVvn("Auto ReParse", false);
   public final nNUuNvVn UvUvUNuvNU = new nNUuNvVn("ReParse каждые (мин)", 30.0F, 5.0F, 240.0F, 5.0F, false).UuUVuuUu(() -> !this.uUVuVvuNUvnu.uUnuvNvvNU());
   public final vvNnnUNnVvn c0oOOCcCoC0 = new vvNnnUNnVvn("Свап анархии (5-10 мин)", false).UuUVuuUu(() -> !this.NnUuNNU.C00OOC00oO("FunTime"));
   public final nNUuNvVn VVnVNnunVvu = new nNUuNvVn("Кд обновления (мс)", 100.0F, 100.0F, 5000.0F, 50.0F, false);
   public final nNUuNvVn unNNVVNnvvV = new nNUuNvVn("Кд покупки (мс)", 100.0F, 100.0F, 5000.0F, 50.0F, false);
   public final nNUuNvVn NuunnvnN = new nNUuNvVn("Кд подтверждения (мс)", 50.0F, 0.0F, 1000.0F, 10.0F, false);
   public final vvNnnUNnVvn NVUunUNUN = new vvNnnUNnVvn("Детект замедления аука", true);
   public final vvNnnUNnVvn UUVNuUNUvUnV = new vvNnnUNnVvn("Авто-фикс замедления", true).UuUVuuUu(() -> !this.NVUunUNUN.uUnuvNvvNU());
   public final vvNnnUNnVvn vuvnUnVnUNnV = new vvNnnUNnVvn("Лаг статистика в чат", true).UuUVuuUu(() -> !this.NVUunUNUN.uUnuvNvvNU());
   public final uVNuNUVvn nnuUVNUuvvVU = new uVNuNUVvn("Бинд меню", -1);
   public final nNUuNvVn nVVUuvuNnUN = new nNUuNvVn("Защита от подмены лота (мс)", 90.0F, 0.0F, 500.0F, 10.0F, false);
   public final vvNnnUNnVvn nNnVnUNVV = new vvNnnUNnVvn("Скупка шулкеров", false);
   public final nNUuNvVn nuunNvv = new nNUuNvVn("Shulker Profit %", 18.0F, 0.0F, 200.0F, 1.0F, true).UuUVuuUu(() -> !this.nNnVnUNVV.uUnuvNvvNU());
   public final nNUuNvVn uUVVvVVNvvn = new nNUuNvVn("Shulker Profit $", 50000.0F, 0.0F, 1.0E9F, 10000.0F, false).UuUVuuUu(() -> !this.nNnVnUNVV.uUnuvNvvNU());
   public final nNUuNvVn vvUVNVvvNUv = new nNUuNvVn("Shulker Value $", 100000.0F, 0.0F, 1.0E9F, 10000.0F, false).UuUVuuUu(() -> !this.nNnVnUNVV.uUnuvNvvNU());
   public static final Map<String, Long> UuNnnVnuNNV = new LinkedHashMap<>();
   public static final Map<String, Integer> uUVvnUuNvvN = new LinkedHashMap<>();
   public static final Map<String, Integer> UUuUnNVNuuv = new LinkedHashMap<>();
   public static final Map<String, Set<String>> NVuNUuVnVUN = new LinkedHashMap<>();
   public static final List<String> NVuunNnvvvVu = new ArrayList<>();
   public static final Set<String> vNnNuuvVn = new HashSet<>();
   public static final Map<String, String> VUuuVUnun = new LinkedHashMap<>();
   public static final List<AutoBuy.VUnuUnnuNvVu> vVVuuVVv = new ArrayList<>();
   private final VuNvNNvVV NvnnUUuVvNU = new VuNvNNvVV();
   private final VuNvNNvVV vVvuUVnV = new VuNvNNvVV();
   private final VuNvNNvVV nvuUVvuuN = new VuNvNNvVV();
   private final VuNvNNvVV CC0COO = new VuNvNNvVV();
   private final VuNvNNvVV uNnNUNvuVnu = new VuNvNNvVV();
   private final VuNvNNvVV VnnnvUunNvuu = new VuNvNNvVV();
   private final VuNvNNvVV VuuUVVu = new VuNvNNvVV();
   private final VuNvNNvVV nUNnuUNnV = new VuNvNNvVV();
   private final VuNvNNvVV VuNVnvNNuNnn = new VuNvNNvVV();
   private final VuNvNNvVV uvVuuuvvVU = new VuNvNNvVV();
   private final VuNvNNvVV NNnvvunuVNUn = new VuNvNNvVV();
   private boolean nVuuUnnUUVU = false;
   public static long VuunNUUUvu = 0L;
   public static long NNUUNUuVNNVn = 0L;
   public static long VvVvnNUnvuvV = 0L;
   public static long ccOO0COcoco0 = 0L;
   private int nUununvNvvn = -1;
   private boolean NuvunVvnnN = false;
   private int vuvnnvuNVvu = 0;
   private boolean NVvnvnn = false;
   private String vUvVUNnN = "";
   private String NUuVnnuUnvu = "";
   private boolean vnuNNVvVVuN = false;
   private final List<String> Oco0Oococc = new ArrayList<>();
   private int uNUnUuUnvnnU = 0;
   private boolean OoccOc0CO = false;
   private boolean UvuVvvVuUuuu = false;
   private String NUUVUvvuNNVU = "";
   private String VUNvNUuNVnn = "";
   private int UNNunNuUNVuU = 0;
   private long NuUuUvUUvU = 0L;
   private long VUVvNvvVUN = 0L;
   private long UvvNuvUNNNUv = 0L;
   private long NunUUVVVuu = 0L;
   private boolean uNUnuUUvvuU = false;
   private boolean vvVVVvVNVVVN = false;
   private boolean uUuuVvVunVVu = false;
   private boolean NuUvUNN = false;
   private int vunuUUVVUv = -1;
   private long uuuNUnuvvNNv = 0L;
   private long unUVnu = 0L;
   private long NvNUuuuvUvu = 200L;
   private long nNVVUnuVVVuV = 50L;
   private long vnVuunuNN = 0L;
   private long UvUNuNvvNVNv = 0L;
   private long vNnNNNuVVnUv = 0L;
   private long UVUnUvUNU = 0L;
   private int UvUnnnn = 0;
   private boolean occOCoc0OcO = false;
   private boolean VnvunuuvUNu = false;
   private boolean nuVuunUn = false;
   private float NvNvVNUv = 0.0F;
   private float vNUUvuuVU = 0.0F;
   private float unNuVNVUnV = 0.0F;
   private float UvNNNUvNnUUV = 1.0F;
   private float vVuNvnVUvvv = 0.0F;
   private float OCCc0co0OOC = 0.0F;
   private float unUvvVVVVUu = 0.0F;
   private float nnUunUnNUN = 0.0F;
   private float UNuUVVuUuU = 1.0F;
   private float NunnVUUuvUV = 0.12F;
   private long nVUNnUuU = 0L;
   private float VNvuVnvnun = 0.0F;
   private boolean unVVnuunNU = false;
   private long vVnuVVvVNuNu = 0L;
   private double uNVvVvUuuuU = 0.0;
   private double nvnUvvnUUN = 0.0;
   private int uuuvuUUNVVUN = -1;
   private String VnUvVu = "";
   private long NvUVuUNUUNvv = 0L;
   private int NnvVNVnn = -1;
   private String O0ooccOc0 = "";
   private int nvuVnuvUVvVu = 0;
   private long coOocCcoOc0 = 0L;
   private String uvNnUuvvNU = "";
   private long UuUUvvVunV = 0L;
   private long VuNNvnVVUUn = 0L;
   private int UnVvNNuNu = 50;
   private int vuNunNnvnunv = 0;
   private boolean UVVNUnVnNV = false;
   private long vnUUvvnUVUu = 0L;
   private long vNVvnNNnVV = 0L;
   private long UvnnnuuNvUvv = 0L;
   private int uVUUnuunuv = 0;
   private final Map<class_1792, List<AutoBuy.nvnNNunvv>> vvNvvuUUUVvv = new HashMap<>();
   private final List<AutoBuy.nvnNNunvv> nvvVNNnnUvVN = new ArrayList<>();
   private int uUuvNUN = Integer.MIN_VALUE;
   private final nUNuNuUUuUVU VnuUuUVUnnNn = new nUNuNuUUuUVU();
   private boolean vnvUUNNVvU = false;
   private long nVVunnNVNvN = 0L;
   private long NNNVNvNuVvuN = 0L;
   private boolean UUuNVVnNnu = false;
   private long UvUvNUvnv = 0L;
   private int UVnUNuNvu = 0;
   private long VNUnNnvu = 0L;

   public AutoBuy() {
      NVNnnvnuunNv = this;
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu,
            this.unNNVVNnvvV,
            this.NuunnvnN,
            this.nVVUuvuNnUN,
            this.NVUunUNUN,
            this.UUVNuUNUvUnV,
            this.vuvnUnVnUNnV,
            this.nNnVnUNVV,
            this.nuunNvv,
            this.uUVVvVVNvvn,
            this.vvUVNVvvNUv,
            this.nnuUVNUuvvVU
         }
      );
   }

   private long UvUvUNuvNU() {
      String var1 = this.NnUuNNU.uUnuvNvvNU();
      if (var1.equals("FunTime")) {
         return 225L;
      } else {
         return !var1.equals("SpookyTime") && !var1.equals("HolyWorld") ? (long)this.VVnVNnunVvu.uUnuvNvvNU() : this.NvNUuuuvUvu;
      }
   }

   private long c0oOOCcCoC0() {
      String var1 = this.NnUuNNU.uUnuvNvvNU();
      if (var1.equals("FunTime")) {
         return 10L;
      } else {
         return !var1.equals("SpookyTime") && !var1.equals("HolyWorld") ? (long)this.unNNVVNnvvV.uUnuvNvvNU() : this.nNVVUnuVVVuV;
      }
   }

   private void VVnVNnunVvu() {
      this.NvNUuuuvUvu = ThreadLocalRandom.current().nextLong(200L, 401L);
      this.nNVVUnuVVVuV = ThreadLocalRandom.current().nextLong(30L, 81L);
   }

   public static long UuUVuuUu(String var0) {
      for (AutoBuy.VUnuUnnuNvVu var2 : vVVuuVVv) {
         if (var2.C00OOC00oO.toLowerCase(Locale.ROOT).contains(var0.toLowerCase(Locale.ROOT))) {
            int var3 = Math.max(1, var2.uUnuvNvvNU);
            return Math.max(1L, (var2.vVvUvVVuuNvV + var3 - 1L) / var3);
         }
      }

      return 0L;
   }

   public static boolean C00OOC00oO(String var0) {
      String var1 = UuuNnUvUuv(var0);
      if (var1.isEmpty()) {
         return false;
      } else {
         VUuuVUnun.put(nvUVNnuu(var1), var1);
         return true;
      }
   }

   public static boolean uUnuvNvvNU(String var0) {
      String var1 = nvUVNnuu(var0);
      return !var1.isEmpty() && VUuuVUnun.remove(var1) != null;
   }

   public static boolean vVvUvVVuuNvV(String var0) {
      String var1 = nvUVNnuu(var0);
      return !var1.isEmpty() && VUuuVUnun.containsKey(var1);
   }

   public static void UuuNnUvUuv() {
      VUuuVUnun.clear();
   }

   public static List<String> nUUVuvU() {
      return new ArrayList<>(VUuuVUnun.values());
   }

   private static String nvUVNnuu(String var0) {
      return UuuNnUvUuv(var0).toLowerCase(Locale.ROOT);
   }

   private static String UuuNnUvUuv(String var0) {
      if (var0 == null) {
         return "";
      } else {
         String var1 = var0.replaceAll("§.", "").replace(' ', ' ').trim();
         if (var1.startsWith("+")) {
            var1 = var1.substring(1).trim();
         }

         return var1;
      }
   }

   public static AutoBuy.VUnuUnnuNvVu UnUNVVVNuv() {
      return vVVuuVVv.isEmpty() ? null : vVVuuVVv.get(0);
   }

   public static int vNVuvnUUnuUn() {
      int var0 = 0;
      long var1 = VuunNUUUvu;

      for (AutoBuy.VUnuUnnuNvVu var4 : vVVuuVVv) {
         if (var4.uNNnnnuuuN >= var1) {
            var0++;
         }
      }

      return var0;
   }

   public static int UvnvNVnnnnNU() {
      int var0 = 0;
      long var1 = VuunNUUUvu;

      for (AutoBuy.VUnuUnnuNvVu var4 : vVVuuVVv) {
         if (var4.uNNnnnuuuN >= var1) {
            var0 += Math.max(1, var4.uUnuvNvvNU);
         }
      }

      return var0;
   }

   public static long uVUVnuvnuVuv() {
      long var0 = 0L;
      long var2 = VuunNUUUvu;

      for (AutoBuy.VUnuUnnuNvVu var5 : vVVuuVVv) {
         if (var5.uNNnnnuuuN >= var2) {
            var0 += Math.max(0L, var5.vVvUvVVuuNvV);
         }
      }

      return var0;
   }

   public static long NVNnnvnuunNv() {
      return NNUUNUuVNNVn > 0L && VvVvnNUnvuvV > 0L ? VvVvnNUnvuvV - NNUUNUuVNNVn : 0L;
   }

   public File uVunuUNVVUUV() {
      File var1 = new File(ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "configs/autobuy");
      if (!var1.exists()) {
         var1.mkdirs();
      }

      return var1;
   }

   public void uNNnnnuuuN(String var1) {
      try {
         File var2 = this.uVunuUNVVUUV();
         File var3 = new File(var2, var1 + ".json");
         JsonObject var4 = this.b_();

         try (FileWriter var5 = new FileWriter(var3)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(var4, var5);
         }
      } catch (Exception var10) {
         var10.printStackTrace();
      }
   }

   public void nuUnNvnuUu(String var1) {
      try {
         File var2 = new File(this.uVunuUNVVUUV(), var1 + ".json");
         if (!var2.exists()) {
            return;
         }

         try (FileReader var3 = new FileReader(var2)) {
            JsonObject var4 = JsonParser.parseReader(var3).getAsJsonObject();
            this.UuUVuuUu(var4);
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }
   }

   public void VVuuUN(String var1) {
      try {
         File var2 = new File(this.uVunuUNVVUUV(), var1 + ".json");
         if (var2.exists()) {
            var2.delete();
         }
      } catch (Exception var3) {
      }
   }

   public void UuUVuuUu(String var1, String var2) {
      if (!var1.equals(var2)) {
         try {
            File var3 = this.uVunuUNVVUUV();
            File var4 = new File(var3, var1 + ".json");
            File var5 = new File(var3, var2 + ".json");
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

      for (Entry var5 : UuNnnVnuNNV.entrySet()) {
         var3.addProperty((String)var5.getKey(), (Number)var5.getValue());
      }

      JsonObject var14 = new JsonObject();
      LinkedHashSet var15 = new LinkedHashSet();
      var15.addAll(uUVvnUuNvvN.keySet());
      var15.addAll(UUuUnNVNuuv.keySet());

      for (String var7 : var15) {
         int var8 = uVUuuVnNVU(var7);
         int var9 = vuuuNvNuv(var7);
         if (var8 > 0 || var9 < 100) {
            JsonObject var10 = new JsonObject();
            var10.addProperty("min", var8);
            var10.addProperty("max", var9);
            var14.add(var7, var10);
         }
      }

      JsonObject var16 = new JsonObject();

      for (Entry var19 : NVuNUuVnVUN.entrySet()) {
         if (var19.getValue() != null && !((Set)var19.getValue()).isEmpty()) {
            JsonArray var22 = new JsonArray();

            for (String var11 : (Set)var19.getValue()) {
               var22.add(var11);
            }

            var16.add((String)var19.getKey(), var22);
         }
      }

      JsonArray var18 = new JsonArray();

      for (String var23 : NVuunNnvvvVu) {
         var18.add(var23);
      }

      JsonArray var21 = new JsonArray();

      for (String var27 : vNnNuuvVn) {
         var21.add(var27);
      }

      JsonArray var25 = new JsonArray();

      for (String var30 : VUuuVUnun.values()) {
         var25.add(var30);
      }

      JsonArray var29 = new JsonArray();

      for (AutoBuy.VUnuUnnuNvVu var12 : vVVuuVVv) {
         JsonObject var13 = new JsonObject();
         var13.addProperty("original", var12.UuUVuuUu);
         var13.addProperty("clean", var12.C00OOC00oO);
         var13.addProperty("qty", var12.uUnuvNvvNU);
         var13.addProperty("price", var12.vVvUvVVuuNvV);
         var13.addProperty("time", var12.uNNnnnuuuN);
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
   public void UuUVuuUu(JsonObject var1) {
      super.UuUVuuUu(var1);
      if (!this.NnUuNNU.vVvUvVVuuNvV.contains(this.NnUuNNU.uNNnnnuuuN)) {
         this.NnUuNNU.vNUvnnVnUvu = 0;
         this.NnUuNNU.uNNnnnuuuN = this.NnUuNNU.vVvUvVVuuNvV.get(0);
      } else {
         this.NnUuNNU.vNUvnnVnUvu = this.NnUuNNU.vVvUvVVuuNvV.indexOf(this.NnUuNNU.uNNnnnuuuN);
      }

      if (var1 != null && var1.has("AutoBuyData") && var1.get("AutoBuyData").isJsonObject()) {
         JsonObject var2 = var1.getAsJsonObject("AutoBuyData");
         UuNnnVnuNNV.clear();
         uUVvnUuNvvN.clear();
         UUuUnNVNuuv.clear();
         NVuNUuVnVUN.clear();
         NVuunNnvvvVu.clear();
         vNnNuuvVn.clear();
         VUuuVUnun.clear();
         vVVuuVVv.clear();
         if (var2.has("Prices") && var2.get("Prices").isJsonObject()) {
            JsonObject var3 = var2.getAsJsonObject("Prices");

            for (String var5 : var3.keySet()) {
               try {
                  UuNnnVnuNNV.put(var5, var3.get(var5).getAsLong());
               } catch (Exception var12) {
               }
            }
         }

         if (var2.has("DurabilityRanges") && var2.get("DurabilityRanges").isJsonObject()) {
            JsonObject var14 = var2.getAsJsonObject("DurabilityRanges");

            for (String var28 : var14.keySet()) {
               try {
                  JsonObject var6 = var14.getAsJsonObject(var28);
                  UuUVuuUu(var28, var6.has("min") ? var6.get("min").getAsInt() : 0, var6.has("max") ? var6.get("max").getAsInt() : 100);
               } catch (Exception var11) {
               }
            }
         }

         if (var2.has("DurabilityThresholds") && var2.get("DurabilityThresholds").isJsonObject()) {
            JsonObject var15 = var2.getAsJsonObject("DurabilityThresholds");

            for (String var29 : var15.keySet()) {
               try {
                  UuUVuuUu(var29, var15.get(var29).getAsInt());
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
                        var7.add(vNnnVNUVU.uNNnnnuuuN(var9.getAsString()));
                     }
                  }

                  if (!var7.isEmpty()) {
                     NVuNUuVnVUN.put(var30, var7);
                  }
               } catch (Exception var13) {
               }
            }
         }

         if (var2.has("ParseItems") && var2.get("ParseItems").isJsonArray()) {
            for (JsonElement var24 : var2.getAsJsonArray("ParseItems")) {
               if (var24.isJsonPrimitive()) {
                  NVuunNnvvvVu.add(var24.getAsString());
               }
            }
         }

         if (var2.has("InactiveItems") && var2.get("InactiveItems").isJsonArray()) {
            for (JsonElement var25 : var2.getAsJsonArray("InactiveItems")) {
               if (var25.isJsonPrimitive()) {
                  vNnNuuvVn.add(var25.getAsString());
               }
            }
         }

         if (var2.has("IgnoredSellers") && var2.get("IgnoredSellers").isJsonArray()) {
            for (JsonElement var26 : var2.getAsJsonArray("IgnoredSellers")) {
               if (var26.isJsonPrimitive()) {
                  C00OOC00oO(var26.getAsString());
               }
            }
         }

         if (var2.has("History") && var2.get("History").isJsonArray()) {
            for (JsonElement var27 : var2.getAsJsonArray("History")) {
               if (var27.isJsonObject()) {
                  JsonObject var31 = var27.getAsJsonObject();
                  vVVuuVVv.add(
                     new AutoBuy.VUnuUnnuNvVu(
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

         this.VUUnuVvVu();
      }
   }

   @Override
   public void c_() {
      super.c_();
      UuNnnVnuNNV.clear();
      uUVvnUuNvvN.clear();
      UUuUnNVNuuv.clear();
      NVuNUuVnVUN.clear();
      NVuunNnvvvVu.clear();
      vNnNuuvVn.clear();
      VUuuVUnun.clear();
      vVVuuVVv.clear();
      this.VUUnuVvVu();
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.VVnVNnunVvu();
      this.vVVuuVVv();
      this.VuunNUUUvu();
      this.UvNNVUVNVuvV();
      this.NNUUNUuVNNVn();
      VuunNUUUvu = System.currentTimeMillis();
      this.nVuuUnnUUVU = false;
      NNUUNUuVNNVn = 0L;
      VvVvnNUnvuvV = 0L;
      ccOO0COcoco0 = 0L;
      if (this.NnUuNNU.C00OOC00oO("FunTime")) {
         try {
            vnvuUUVun var1 = new vnvuUUVun();
            var1.UuUVuuUu();
            String var2 = var1.nuUnNvnuUu();
            if (!var2.isEmpty() && !var2.equals("0")) {
               NNUUNUuVNNVn = Long.parseLong(var2);
               VvVvnNUnvuvV = NNUUNUuVNNVn;
               this.nVuuUnnUUVU = true;
            }
         } catch (Exception var3) {
         }
      }

      this.CC0COO.UuUVuuUu();
      this.VuNVnvNNuNnn.UuUVuuUu();
      this.uvVuuuvvVU.UuUVuuUu();
      this.NNnvvunuVNUn.UuUVuuUu();
      this.NuvunVvnnN = false;
      this.vuvnnvuNVvu = 0;
      this.NUuVnnuUnvu = "";
      this.NuUuUvUUvU = 0L;
      this.VUVvNvvVUN = 0L;
      this.uNUnuUUvvuU = false;
      this.vvVVVvVNVVVN = false;
      this.NuUvUNN = false;
      this.vunuUUVVUv = -1;
      this.uuuNUnuvvNNv = 0L;
      this.unUVnu = 0L;
      this.NVvnvnn = false;
      this.vnuNNVvVVuN = false;
      this.uNUnUuUnvnnU = 0;
      this.UvuVvvVuUuuu = false;
      this.NUUVUvvuNNVU = "";
      this.UvvNuvUNNNUv = 0L;
      this.NunUUVVVuu = 0L;
      this.uUuuVvVunVVu = false;
      this.UnUUVuVunvVu();
      this.uUVvnUuNvvN();
      this.nnvuvUNuUnN();
      this.VUUnuVvVu();
      this.VnuUuUVUnnNn.UuUVuuUu();
      this.vnvUUNNVvU = false;
      this.nVVunnNVNvN = 0L;
      this.NNNVNvNuVvuN = 0L;
      this.vuvnUnVnUNnV();
      NVUUNNv.UuUVuuUu();
      this.OoccOc0CO = this.nNvNUVU.uUnuvNvvNU();
   }

   private void unNNVVNnvvV() {
      if (!this.NVUunUNUN.uUnuvNvvNU()) {
         this.VnuUuUVUnnNn.uUnuvNvvNU();
         this.vnvUUNNVvU = false;
      } else {
         this.VnuUuUVUnnNn.vVvUvVVuuNvV();
         long var1 = System.currentTimeMillis();
         boolean var3 = this.VnuUuUVUnnNn.uNNnnnuuuN();
         if (var3 && !this.vnvUUNNVvU) {
            this.vnvUUNNVvU = true;
            this.NNNVNvNuVvuN = var1;
            if (ClientUtil.NVNnnvnuunNv.uUnuvNvvNU()) {
               uvNnnnUuVu.UuUVuuUu(
                  "[AutoBuy] Сервер замедлил аукцион: отклик ~"
                     + this.VnuUuUVUnnNn.VVuuUN()
                     + "мс, норма ~"
                     + this.VnuUuUVUnnNn.vNUvnnVnUvu()
                     + "мс, пинг "
                     + this.nnuUVNUuvvVU()
               );
            }

            if (this.NuunnvnN()) {
               this.NVUunUNUN();
            }
         } else if (!var3 && this.vnvUUNNVvU) {
            this.vnvUUNNVvU = false;
         }

         if (this.vuvnUnVnUNnV.uUnuvNvvNU() && this.VnuUuUVUnnNn.nvUVNnuu() > 0 && var1 - this.nVVunnNVNvN >= 2000L) {
            this.nVVunnNVNvN = var1;
            vVnvuVVUunuv.UuUVuuUu("§7[AutoBuy] " + this.VnuUuUVUnnNn.uVUuuVnNVU());
         }
      }
   }

   private boolean NuunnvnN() {
      return this.UUVNuUNUvUnV.uUnuvNvvNU()
         && (this.NnUuNNU.C00OOC00oO("FunTime") || this.NnUuNNU.C00OOC00oO("HolyWorld"))
         && !uVunuUNVVUUV
         && !UNnVVNvvnVvU
         && !this.NVvnvnn
         && !this.nNvNUVU.uUnuvNvvNU()
         && !this.vnuNNVvVVuN
         && !this.UVnuVUUVnnU()
         && !this.UUuNVVnNnu;
   }

   private void NVUunUNUN() {
      long var1 = System.currentTimeMillis();
      this.UVnUNuNvu = var1 - this.VNUnNnvu <= 240000L ? Math.min(2, this.UVnUNuNvu + 1) : 0;
      this.VNUnNnvu = var1;
      this.VnuUuUVUnnNn.C00OOC00oO();
      this.vnvUUNNVvU = false;
      if (this.NnUuNNU.C00OOC00oO("FunTime") && this.UVnUNuNvu >= 1) {
         if (this.UVnUNuNvu >= 2) {
            this.VunnVNvNV();
         } else {
            this.VvVuvUvvNNVv();
         }
      } else {
         this.UUuNVVnNnu = true;
         this.UvUvNUvnv = var1 + ThreadLocalRandom.current().nextLong(4000L, 8001L);
         this.NuvunVvnnN = false;
         this.uNUnuUUvvuU = false;
         this.NUuVnnuUnvu = "";
         this.UnUUVuVunvVu();
         if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1755 != null) {
            uUnuvNvvNU.field_1724.method_3137();
         }
      }
   }

   private boolean UUVNuUNUvUnV() {
      if (!this.UUuNVVnNnu) {
         return false;
      } else {
         if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1755 != null) {
            uUnuvNvvNU.field_1724.method_3137();
         }

         if (System.currentTimeMillis() < this.UvUvNUvnv) {
            return true;
         } else {
            this.UUuNVVnNnu = false;
            this.UvUvNUvnv = 0L;
            this.UuUVuuUu(0L, false);
            return true;
         }
      }
   }

   private void vuvnUnVnUNnV() {
      this.UUuNVVnNnu = false;
      this.UvUvNUvnv = 0L;
      this.UVnUNuNvu = 0;
      this.VNUnNnvu = 0L;
   }

   private String nnuUVNUuvvVU() {
      int var1 = this.nVVUuvuNnUN();
      return var1 < 0 ? "?" : var1 + "мс";
   }

   private int nVVUuvuNnUN() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.method_1562() != null) {
         class_640 var1 = uUnuvNvvNU.method_1562().method_2871(uUnuvNvvNU.field_1724.method_5667());
         return var1 == null ? -1 : var1.method_2959();
      } else {
         return -1;
      }
   }

   public boolean UNnVVNvvnVvU() {
      return this.NVUunUNUN.uUnuvNvvNU() && this.VnuUuUVUnnNn.uNNnnnuuuN();
   }

   public nUNuNuUUuUVU uNnUnnuNUnNu() {
      return this.VnuUuUVUnnNn;
   }

   private void nNnVnUNVV() {
      if (this.NnUuNNU.C00OOC00oO("FunTime")) {
         try {
            long var1 = System.currentTimeMillis();
            if (var1 - this.unUVnu < 1000L) {
               return;
            }

            this.unUVnu = var1;
            vnvuUUVun var3 = new vnvuUUVun();
            var3.UuUVuuUu();
            String var4 = var3.nuUnNvnuUu();
            if (var4.isEmpty() || var4.equals("0")) {
               return;
            }

            VvVvnNUnvuvV = Long.parseLong(var4);
            if (ccOO0COcoco0 == 0L && NNUUNUuVNNVn > 0L && uVUVnuvnuVuv() > 0L && VvVvnNUnvuvV >= NNUUNUuVNNVn) {
               ccOO0COcoco0 = System.currentTimeMillis();
            }
         } catch (Exception var5) {
         }
      }
   }

   private void nuunNvv() {
      if (this.NnUuNNU.C00OOC00oO("FunTime")) {
         if (!this.nVuuUnnUUVU) {
            try {
               vnvuUUVun var1 = new vnvuUUVun();
               var1.UuUVuuUu();
               String var2 = var1.nuUnNvnuUu();
               if (!var2.isEmpty() && !var2.equals("0")) {
                  NNUUNUuVNNVn = Long.parseLong(var2);
                  VvVvnNUnvuvV = NNUUNUuVNNVn;
                  this.nVuuUnnUUVU = true;
               }
            } catch (Exception var3) {
            }
         } else {
            this.nNnVnUNVV();
         }
      }
   }

   @Override
   public void C00OOC00oO() {
      boolean var1 = this.nNvNUVU.uUnuvNvvNU();
      if (!var1) {
         this.NNVNuUvVn();
      }

      this.NuvunVvnnN = false;
      this.vuvnnvuNVvu = 0;
      this.NVvnvnn = false;
      this.vUvVUNnN = "";
      this.NUuVnnuUnvu = "";
      this.NuUuUvUUvU = 0L;
      this.VUVvNvvVUN = 0L;
      this.uNUnuUUvvuU = false;
      this.vvVVVvVNVVVN = false;
      this.NuUvUNN = false;
      this.vunuUUVVUv = -1;
      this.uuuNUnuvvNNv = 0L;
      this.UnUUVuVunvVu();
      this.uUVvnUuNvvN();
      this.nnvuvUNuUnN();
      this.VnuUuUVUnnNn.uUnuvNvvNU();
      this.vnvUUNNVvU = false;
      this.vuvnUnVnUNnV();
      this.nVuuUnnUUVU = false;
      NVUUNNv.UuUVuuUu();
      this.vVVuuVVv();
      this.VuunNUUUvu();
      this.UvNNVUVNVuvV();
      nNuuUUuvVU var2 = nNuuUUuvVU.vVvUvVVuuNvV();
      if (var2 != null) {
         var2.UuUVuuUu(false);
      }

      super.C00OOC00oO();
      if (var1) {
         this.uuvvuNvuUNVV();
      }
   }

   private void uUVVvVVNvvn() {
      nNuuUUuvVU var1 = nNuuUUuvVU.vVvUvVVuuNvV();
      if (var1 != null) {
         var1.UuUVuuUu(this.nuUnNvnuUu && this.c0oOOCcCoC0.uUnuvNvvNU() && this.NnUuNNU.C00OOC00oO("FunTime"));
      }
   }

   public static void NnUuNNU() {
      AutoBuy var0 = NVNnnvnuunNv;
      if (var0 != null) {
         var0.NNVNuUvVn();
         var0.NuvunVvnnN = false;
         var0.vuvnnvuNVvu = 0;
         var0.NVvnvnn = false;
         var0.vUvVUNnN = "";
         var0.NUuVnnuUnvu = "";
         var0.NuUuUvUUvU = 0L;
         var0.VUVvNvvVUN = 0L;
         var0.uNUnuUUvvuU = false;
         var0.vvVVVvVNVVVN = false;
         var0.NuUvUNN = false;
         var0.vunuUUVVUv = -1;
         var0.uuuNUnuvvNNv = 0L;
         var0.vnuNNVvVVuN = false;
         var0.uNUnUuUnvnnU = 0;
         var0.UvuVvvVuUuuu = false;
         var0.NUUVUvvuNNVU = "";
         var0.UvvNuvUNNNUv = 0L;
         var0.NunUUVVVuu = 0L;
         var0.uUuuVvVunVVu = false;
         var0.vVVuuVVv();
         var0.VuunNUUUvu();
         var0.UvNNVUVNVuvV();
         var0.vuvnUnVnUNnV();
      }

      uVunuUNVVUUV = false;
      UNnVVNvvnVvU = false;
      uNnUnnuNUnNu = false;
      NVUUNNv.UuUVuuUu();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (this.nuUnNvnuUu) {
         if (var1.nuUnNvnuUu() == 1 && var1.vVvUvVVuuNvV() == this.nnuUVNUuvvVU.uUnuvNvvNU() && uUnuvNvvNU.field_1755 == null) {
            uUnuvNvvNU.method_1507(new o00Co0coo0o());
            var1.C00OOC00oO();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         this.uUVVvVVNvvn();
         if (!this.nuUnNvnuUu) {
            this.vuNnuUnu();
            this.nNuVunNUVu();
         } else {
            this.nNuVunNUVu();
            NVUUNNv.C00OOC00oO();
            this.unNNVVNnvvV();
            this.vvUVNVvvNUv();
            if (!this.NVuNUuVnVUN()) {
               if (!this.uUVuVvuNUvnu.uUnuvNvvNU() && !this.UvuVvvVuUuuu) {
                  this.VuNVnvNNuNnn.UuUVuuUu();
               }

               this.uunNUuunVU();
               if (this.NVvnvnn) {
                  if (this.nUNnuUNnV.uNNnnnuuuN(1500L)) {
                     uUnuvNvvNU.field_1724.field_3944.method_45730("an" + this.vUvVUNnN);
                     this.NVvnvnn = false;
                     this.UvUvUNuvNU(this.vUvVUNnN);
                  }
               } else if (!this.NnUuNNU.C00OOC00oO("FunTime") && !this.NnUuNNU.C00OOC00oO("HolyWorld")
                  || this.nNvNUVU.uUnuvNvvNU()
                  || !this.NuvunVvnnN
                  || !this.uuVuUuuVVNvN()) {
                  if (!uVunuUNVVUUV && !UNnVVNvvnVvU) {
                     if (!this.NnUuNNU.C00OOC00oO("FunTime") || this.nNvNUVU.uUnuvNvvNU() || !this.NvnuuuvnVV()) {
                        this.nuunNvv();
                        boolean var2 = this.nNvNUVU.uUnuvNvvNU();
                        if (var2 && !this.OoccOc0CO) {
                           var2 = this.uNNnnnuuuN(false);
                        } else if (!var2 && this.OoccOc0CO) {
                           this.vnvvNvUnVv();
                        }

                        this.OoccOc0CO = var2;
                        if (var2 && !this.Oco0Oococc.isEmpty()) {
                           this.nNvNUVU();
                           this.nNuVunNUVu();
                        } else if (!this.UUVNuUNUvUnV()) {
                           if (this.UVnuVUUVnnU()) {
                              this.NvUVUvVVnUu();
                           } else {
                              if (this.NnUuNNU.C00OOC00oO("FunTime") && !this.nNvNUVU.uUnuvNvvNU()) {
                                 if (this.OCOocoOoOO()) {
                                    return;
                                 }

                                 if (this.CC0COO.uNNnnnuuuN(80000L)) {
                                    this.VvVuvUvvNNVv();
                                    return;
                                 }

                                 if (this.NuvunVvnnN && this.uuVuUuuVVNvN()) {
                                    return;
                                 }

                                 if (this.uuuVnuvnnNnU()) {
                                    return;
                                 }
                              }

                              if (uUnuvNvvNU.field_1755 instanceof class_476 var4) {
                                 class_1707 var5 = (class_1707)var4.method_17577();
                                 if (this.uUnuvNvvNU(var4)) {
                                    if (this.nvuUVvuuN.uNNnnnuuuN((long)this.NuunnvnN.uUnuvNvvNU())) {
                                       int var10 = this.vVvUvVVuuNvV(var5);
                                       if (var10 != -1 && this.nuUnNvnuUu(var4)) {
                                          uUnuvNvvNU.field_1761.method_2906(var5.field_7763, var10, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
                                       } else {
                                          this.VVuuUN(var5);
                                       }

                                       this.nvuUVvuuN.UuUVuuUu();
                                    }

                                    return;
                                 }

                                 if (this.vVvUvVVuuNvV(var4) && !this.vnuNNVvVVuN) {
                                    if (this.NnUuNNU.C00OOC00oO("HolyWorld")) {
                                       this.C00OOC00oO(var4);
                                       return;
                                    }

                                    boolean var6 = false;

                                    for (int var7 = 0; var7 < 45; var7++) {
                                       class_1735 var8 = var5.method_7611(var7);
                                       if (this.C00OOC00oO(var8)) {
                                          String var9 = this.vVvUvVVuuNvV(var8);
                                          if (var9 != null) {
                                             var6 = true;
                                             if (this.UuUVuuUu(var7, var9, var8) && this.vVvuUVnV.uNNnnnuuuN(this.c0oOOCcCoC0())) {
                                                if (!this.NnUuNNU.C00OOC00oO("FunTime") && !this.NnUuNNU.C00OOC00oO("SpookyTime")) {
                                                   this.uVUVnuvnuVuv(var9);
                                                   uUnuvNvvNU.field_1761.method_2906(var5.field_7763, var7, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
                                                } else {
                                                   this.VuNNvnVVUUn = System.currentTimeMillis();
                                                   uUnuvNvvNU.field_1761.method_2906(var5.field_7763, var7, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
                                                }

                                                this.uUVvnUuNvvN();
                                                this.vVvuUVnV.UuUVuuUu();
                                                this.nvuUVvuuN.UuUVuuUu();
                                                this.VVnVNnunVvu();
                                                return;
                                             }
                                             break;
                                          }
                                       }
                                    }

                                    if (!var6) {
                                       this.uUVvnUuNvvN();
                                    }

                                    if (!var6 && this.NvnnUUuVvNU.uNNnnnuuuN(this.UvUvUNuvNU()) && this.UuUVuuUu(var5)) {
                                       this.NvnnUUuVvNU.UuUVuuUu();
                                       this.VVnVNnunVvu();
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
         this.UvNNVUVNVuvV();
      }
   }

   private void vvUVNVvvNUv() {
      if (this.VuNNvnVVUUn != 0L) {
         if (!this.NnUuNNU.C00OOC00oO("FunTime") && !this.NnUuNNU.C00OOC00oO("SpookyTime")) {
            this.VuNNvnVVUUn = 0L;
         } else if (System.currentTimeMillis() - this.VuNNvnVVUUn >= 2000L) {
            this.VuNNvnVVUUn = 0L;
            if (!this.NuvunVvnnN && !uVunuUNVVUUV && !UNnVVNvvnVvU && !this.NVvnvnn && !this.nNvNUVU.uUnuvNvvNU() && !this.vnuNNVvVVuN) {
               this.UuUVuuUu(0L, true);
            }
         }
      }
   }

   private int UuNnnVnuNNV() {
      if (uUnuvNvvNU.field_1755 == null) {
         return -1;
      } else {
         String var1 = this.UvnvNVnnnnNU(uUnuvNvvNU.field_1755.method_25440().getString());
         if (var1.isEmpty()) {
            return -1;
         } else {
            Matcher var2 = NUVvUUVuVNVv.matcher(var1);
            if (!var2.find()) {
               return -1;
            } else {
               String var3 = var2.group(1);
               if (var3 == null) {
                  var3 = var2.group(2);
               }

               if (var3 == null) {
                  var3 = var2.group(3);
               }

               if (var3 == null) {
                  return -1;
               } else {
                  try {
                     int var4 = Integer.parseInt(var3);
                     return var4 < 1 ? -1 : var4;
                  } catch (NumberFormatException var5) {
                     return -1;
                  }
               }
            }
         }
      }
   }

   private boolean UuUVuuUu(class_1703 var1) {
      int var2 = var1.field_7763;
      if (this.NnUuNNU.C00OOC00oO("FunTime")) {
         int var3 = this.UuNnnVnuNNV();
         int var4;
         if (var3 > 1) {
            var4 = 48;
         } else if (var3 == 1) {
            var4 = 50;
         } else {
            var4 = this.UnVvNNuNu;
            this.UnVvNNuNu = var4 == 50 ? 48 : 50;
         }

         if (var4 >= 0 && var4 < var1.field_7761.size()) {
            this.VnuUuUVUnnNn.UuUVuuUu(var2);
            uUnuvNvvNU.field_1761.method_2906(var2, var4, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
            return true;
         } else {
            return false;
         }
      } else if (var1.field_7761.size() > 49) {
         this.VnuUuUVUnnNn.UuUVuuUu(var2);
         uUnuvNvvNU.field_1761.method_2906(var2, 49, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
         return true;
      } else {
         return false;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(UUvNUNvUVnu var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         if (this.nuUnNvnuUu && this.NnUuNNU.C00OOC00oO("HolyWorld") && this.UvUnnnn != 0) {
            this.uUnuvNvvNU(var1);
         } else {
            if (this.VvVvnNUnvuvV()) {
               this.C00OOC00oO(var1);
            }
         }
      }
   }

   private void C00OOC00oO(class_476 var1) {
      class_1703 var2 = var1.method_17577();
      boolean var3 = false;
      int var4 = Math.min(45, var2.field_7761.size());

      for (int var5 = 0; var5 < var4; var5++) {
         class_1735 var6 = var2.method_7611(var5);
         if (this.C00OOC00oO(var6)) {
            String var7 = this.vVvUvVVuuNvV(var6);
            if (var7 != null) {
               var3 = true;
               if (this.UuUVuuUu(var5, var7) && this.vVvuUVnV.uNNnnnuuuN(this.c0oOOCcCoC0())) {
                  this.vNnNuuvVn();
                  this.uVUVnuvnuVuv(var7);
                  uUnuvNvvNU.field_1761.method_2906(var2.field_7763, var5, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
                  this.UUuUnNVNuuv();
                  this.vVvuUVnV.UuUVuuUu();
                  this.nvuUVvuuN.UuUVuuUu();
                  this.VVnVNnunVvu();
                  return;
               }
               break;
            }
         }
      }

      if (!var3 && this.NvnnUUuVvNU.uNNnnnuuuN(this.UvUvUNuvNU())) {
         int var8 = this.C00OOC00oO(var2);
         if (var8 != -1) {
            this.VnuUuUVUnnNn.UuUVuuUu(var2.field_7763);
            uUnuvNvvNU.field_1761.method_2906(var2.field_7763, var8, 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
            this.UUuUnNVNuuv();
            this.NvnnUUuVvNU.UuUVuuUu();
            this.VVnVNnunVvu();
         }
      } else if (!var3) {
         this.UUuUnNVNuuv();
      }
   }

   private boolean UuUVuuUu(int var1, String var2, class_1735 var3) {
      long var4 = (long)this.nVVUuvuNnUN.uUnuvNvvNU();
      if (var4 <= 0L) {
         this.uUVvnUuNvvN();
         return true;
      } else {
         int var6 = var3 == null ? 0 : this.vVvUvVVuuNvV(var3.method_7677());
         long var7 = System.currentTimeMillis();
         if (this.NnvVNVnn == var1 && this.nvuVnuvUVvVu == var6 && Objects.equals(this.O0ooccOc0, var2)) {
            return var7 - this.coOocCcoOc0 >= var4;
         } else {
            this.NnvVNVnn = var1;
            this.O0ooccOc0 = var2;
            this.nvuVnuvUVvVu = var6;
            this.coOocCcoOc0 = var7;
            return false;
         }
      }
   }

   private void uUVvnUuNvvN() {
      this.NnvVNVnn = -1;
      this.O0ooccOc0 = "";
      this.nvuVnuvUVvVu = 0;
      this.coOocCcoOc0 = 0L;
   }

   private boolean UuUVuuUu(int var1, String var2) {
      long var3 = System.currentTimeMillis();
      if (this.uuuvuUUNVVUN == var1 && Objects.equals(this.VnUvVu, var2)) {
         return var3 - this.NvUVuUNUUNvv >= 90L;
      } else {
         this.uuuvuUUNVVUN = var1;
         this.VnUvVu = var2;
         this.NvUVuUNUUNvv = var3;
         return false;
      }
   }

   private void UUuUnNVNuuv() {
      this.uuuvuUUNVVUN = -1;
      this.VnUvVu = "";
      this.NvUVuUNUUNvv = 0L;
   }

   private int C00OOC00oO(class_1703 var1) {
      int var2 = this.uNNnnnuuuN(var1);
      if (var2 <= 0) {
         var2 = Math.min(54, var1.field_7761.size());
      }

      for (int var3 = Math.min(45, var2); var3 < var2; var3++) {
         if (this.C00OOC00oO(var1.method_7611(var3).method_7677())) {
            return var3;
         }
      }

      for (int var4 = 0; var4 < var2; var4++) {
         if (this.C00OOC00oO(var1.method_7611(var4).method_7677())) {
            return var4;
         }
      }

      return -1;
   }

   private boolean C00OOC00oO(class_1799 var1) {
      return var1 != null && !var1.method_7960() && var1.method_31574(class_1802.field_8687)
         ? this.NVNnnvnuunNv(this.vuuuNvNuv(var1)).contains("обновитьаукцион")
         : false;
   }

   private boolean NVuNUuVnVUN() {
      if (!this.NnUuNNU.C00OOC00oO("HolyWorld")) {
         this.vVVuuVVv();
         return false;
      } else {
         long var1 = System.currentTimeMillis();
         if (this.UvUnnnn != 0 && var1 >= this.vNnNNNuVVnUv) {
            this.VUuuVUnun();
            return true;
         } else if (this.UvUnnnn == 3 && this.VnvunuuvUNu) {
            return true;
         } else {
            if (this.UuUVuuUu(var1)) {
               this.NVuunNnvvvVu();
               this.NNUUNUuVNNVn();
            }

            return false;
         }
      }
   }

   private boolean UuUVuuUu(long var1) {
      if (this.UvUnnnn != 0) {
         return false;
      } else if (var1 < this.vnVuunuNN) {
         return false;
      } else if (!uVunuUNVVUUV && !UNnVVNvvnVvU && !this.NVvnvnn && !this.nNvNUVU.uUnuvNvvNU() && !this.vnuNNVvVVuN && !this.NuvunVvnnN) {
         return uUnuvNvvNU.field_1755 instanceof class_476 var3 ? this.vVvUvVVuuNvV(var3) : false;
      } else {
         return false;
      }
   }

   private void NVuunNnvvvVu() {
      double var1 = ThreadLocalRandom.current().nextDouble();
      if (var1 < 0.42) {
         this.UuUVuuUu(4, ThreadLocalRandom.current().nextLong(650L, 2200L));
      } else if (var1 < 0.7) {
         this.UuUVuuUu(1, ThreadLocalRandom.current().nextLong(1000L, 2800L));
      } else {
         this.UuUVuuUu(2, ThreadLocalRandom.current().nextLong(1200L, 3000L));
      }
   }

   private void vNnNuuvVn() {
      if (this.UvUnnnn == 0 && uUnuvNvvNU.field_1724 != null) {
         this.UuUVuuUu(2, ThreadLocalRandom.current().nextLong(900L, 1501L));
      }
   }

   private void uUnuvNvvNU(boolean var1) {
      boolean var2 = !var1 || NVUUNNv.uUnuvNvvNU();
      this.VnvunuuvUNu = var2;
      this.nuVuunUn = var1;
      if (uUnuvNvvNU.field_1724 != null) {
         this.UuUVuuUu(3, ThreadLocalRandom.current().nextLong(900L, 1601L));
      } else if (var2) {
         NVUUNNv.uUnuvNvvNU(var1);
         return;
      }

      if (!var2) {
         NVUUNNv.uUnuvNvvNU(true);
      }
   }

   private void UuUVuuUu(int var1, long var2) {
      this.UvUnnnn = var1;
      this.UvUNuNvvNVNv = System.currentTimeMillis();
      this.vNnNNNuVVnUv = this.UvUNuNvvNVNv + var2;
      this.UVUnUvUNU = 0L;
      this.NvNvVNUv = uUnuvNvvNU.field_1724.method_36454();
      this.vNUUvuuVU = uUnuvNvvNU.field_1724.method_36455();
      this.unNuVNVUnV = (float)ThreadLocalRandom.current().nextDouble(0.0, Math.PI * 2);
      this.UvNNNUvNnUUV = ThreadLocalRandom.current().nextBoolean() ? 1.0F : -1.0F;
      this.UNuUVVuUuU = 1.0F;
      this.NunnVUUuvUV = (float)ThreadLocalRandom.current().nextDouble(0.06, 0.32);
      if (var1 == 4) {
         int var4 = ThreadLocalRandom.current().nextInt(1, 4);
         this.vVuNvnVUvvv = 360.0F * var4 + (float)ThreadLocalRandom.current().nextDouble(-90.0, 90.0);
         this.OCCc0co0OOC = (float)ThreadLocalRandom.current().nextDouble(8.0, 45.0);
         this.unUvvVVVVUu = 0.0F;
         this.nnUunUnNUN = (float)ThreadLocalRandom.current().nextDouble(-15.0, 15.0);
         this.UNuUVVuUuU = (float)ThreadLocalRandom.current().nextDouble(1.0, 4.0);
      } else if (var1 == 1) {
         this.vVuNvnVUvvv = (float)ThreadLocalRandom.current().nextDouble(18.0, 55.0);
         this.OCCc0co0OOC = (float)ThreadLocalRandom.current().nextDouble(5.0, 18.0);
         this.unUvvVVVVUu = this.UvNNNUvNnUUV * (float)ThreadLocalRandom.current().nextDouble(8.0, 40.0);
         this.nnUunUnNUN = (float)ThreadLocalRandom.current().nextDouble(-6.0, 6.0);
      } else if (var1 == 2) {
         this.vVuNvnVUvvv = (float)ThreadLocalRandom.current().nextDouble(8.0, 32.0);
         this.OCCc0co0OOC = (float)ThreadLocalRandom.current().nextDouble(3.0, 13.0);
         this.unUvvVVVVUu = this.UvNNNUvNnUUV * (float)ThreadLocalRandom.current().nextDouble(4.0, 20.0);
         this.nnUunUnNUN = (float)ThreadLocalRandom.current().nextDouble(-5.0, 5.0);
      } else {
         this.vVuNvnVUvvv = (float)ThreadLocalRandom.current().nextDouble(12.0, 40.0);
         this.OCCc0co0OOC = (float)ThreadLocalRandom.current().nextDouble(-8.0, 8.0);
         this.unUvvVVVVUu = this.UvNNNUvNnUUV * (float)ThreadLocalRandom.current().nextDouble(10.0, 30.0);
         this.nnUunUnNUN = (float)ThreadLocalRandom.current().nextDouble(-6.0, 6.0);
      }
   }

   private void VUuuVUnun() {
      boolean var1 = this.occOCoc0OcO;
      boolean var2 = this.VnvunuuvUNu;
      boolean var3 = this.nuVuunUn;
      this.vVVuuVVv();
      if (var2) {
         NVUUNNv.uUnuvNvvNU(var3);
      } else {
         if (var1 && uUnuvNvvNU.field_1724 != null) {
            uUnuvNvvNU.field_1724.field_3944.method_45730("ah");
         }
      }
   }

   private void vVVuuVVv() {
      this.UvUnnnn = 0;
      this.UvUNuNvvNVNv = 0L;
      this.vNnNNNuVVnUv = 0L;
      this.UVUnUvUNU = 0L;
      this.occOCoc0OcO = false;
      this.VnvunuuvUNu = false;
      this.nuVuunUn = false;
      this.unUvvVVVVUu = 0.0F;
      this.nnUunUnNUN = 0.0F;
      this.UUuUnNVNuuv();
   }

   private void VuunNUUUvu() {
      this.nVUNnUuU = 0L;
      this.VNvuVnvnun = 0.0F;
   }

   private void NNUUNUuVNNVn() {
      this.vnVuunuNN = System.currentTimeMillis() + ThreadLocalRandom.current().nextLong(1200L, 4501L);
   }

   private boolean VvVvnNUnvuvV() {
      if (!this.NnUuNNU.C00OOC00oO("FunTime") || uUnuvNvvNU.field_1687 == null || uUnuvNvvNU.field_1724 == null) {
         this.VuunNUUUvu();
         return false;
      } else if (!this.nuUnNvnuUu && !this.nNvNUVU.uUnuvNvvNU() && !this.vnuNNVvVVuN && !this.UvuVvvVuUuuu) {
         this.VuunNUUUvu();
         return false;
      } else {
         return true;
      }
   }

   private void C00OOC00oO(UUvNUNvUVnu var1) {
      float var2 = this.NUVvUUVuVNVv();
      this.VNvuVnvnun += 0.185F * var2;
      if (this.VNvuVnvnun > (float) (Math.PI * 2)) {
         this.VNvuVnvnun = this.VNvuVnvnun - (float) (Math.PI * 2) * (float)Math.floor(this.VNvuVnvnun / (float) (Math.PI * 2));
      }

      float var3 = this.VNvuVnvnun;
      float var4 = (float)Math.sin(var3) * 0.82F + (float)Math.sin(var3 * 2.25F + 0.75F) * 0.16F + (float)Math.cos(var3 * 2.35F) * 0.06F;
      float var5 = (float)Math.cos(var3 * 1.18F + 0.45F) * 0.28F + (float)Math.sin(var3 * 2.05F) * 0.07F;
      var1.UuUVuuUu(var1.uUnuvNvvNU() + var4);
      var1.C00OOC00oO(class_3532.method_15363(var1.vVvUvVVuuNvV() + var5, -89.0F, 89.0F));
   }

   private void uUnuvNvvNU(UUvNUNvUVnu var1) {
      long var2 = System.currentTimeMillis();
      float var4 = Math.max(1.0F, (float)(this.vNnNNNuVVnUv - this.UvUNuNvvNVNv));
      float var5 = class_3532.method_15363((float)(var2 - this.UvUNuNvvNVNv) / var4, 0.0F, 1.0F);
      float var6 = var5 * var5 * (3.0F - 2.0F * var5);
      if (this.UvUnnnn == 4) {
         float var11 = this.NvNvVNUv + this.UvNNNUvNnUUV * this.vVuNvnVUvvv * var6;
         float var13 = this.vNUUvuuVU
            + (float)Math.sin(this.unNuVNVUnV + var6 * (float) (Math.PI * 2) * this.UNuUVVuUuU) * this.OCCc0co0OOC
            + this.nnUunUnNUN * var6;
         this.C00OOC00oO(var11, var13, var1);
      } else {
         float var7 = this.NvNvVNUv;
         float var8 = this.vNUUvuuVU;
         if (this.UvUnnnn == 1) {
            float var9 = this.unNuVNVUnV + this.UvNNNUvNnUUV * var6 * (float) (Math.PI * 11.0 / 5.0);
            var7 += (float)Math.sin(var9) * this.vVuNvnVUvvv + this.UvNNNUvNnUUV * var6 * 4.0F;
            var8 += (float)Math.cos(var9 * 0.85F) * this.OCCc0co0OOC;
         } else if (this.UvUnnnn == 2) {
            float var14 = this.unNuVNVUnV + var6 * 5.3407073F;
            var7 += (float)Math.sin(var14) * this.vVuNvnVUvvv;
            var8 += (float)Math.sin(var14 * 0.55F) * this.OCCc0co0OOC;
         } else if (this.UvUnnnn == 3) {
            var7 += this.UvNNNUvNnUUV * this.vVuNvnVUvvv * var6 + (float)Math.sin(this.unNuVNVUnV + var6 * Math.PI) * 1.8F;
            var8 += this.OCCc0co0OOC * var6;
         }

         var7 += this.unUvvVVVVUu * var6;
         var8 += this.nnUunUnNUN * var6;
         this.UuUVuuUu(var7, var8, var1);
      }
   }

   private void UuUVuuUu(float var1, float var2, UUvNUNvUVnu var3) {
      float var4 = uUnuvNvvNU.field_1724.method_36454();
      float var5 = uUnuvNvvNU.field_1724.method_36455();
      float var6 = this.ccOO0COcoco0();
      float var7 = this.NunnVUUuvUV;
      float var8 = 1.0F - (float)Math.pow(1.0F - var7, var6);
      float var9 = var4 + class_3532.method_15393(var1 - var4) * var8;
      float var10 = var5 + (class_3532.method_15363(var2, -89.0F, 89.0F) - var5) * var8;
      uUnuvNvvNU.field_1724.method_36456(var9);
      uUnuvNvvNU.field_1724.method_36457(var10);
      uUnuvNvvNU.field_1724.field_6241 = var9;
      var3.UuUVuuUu(var9);
      var3.C00OOC00oO(var10);
   }

   private void C00OOC00oO(float var1, float var2, UUvNUNvUVnu var3) {
      float var4 = class_3532.method_15363(var2, -89.0F, 89.0F);
      uUnuvNvvNU.field_1724.method_36456(var1);
      uUnuvNvvNU.field_1724.method_36457(var4);
      uUnuvNvvNU.field_1724.field_6241 = var1;
      var3.UuUVuuUu(var1);
      var3.C00OOC00oO(var4);
   }

   private float ccOO0COcoco0() {
      long var1 = System.nanoTime();
      if (this.UVUnUvUNU == 0L) {
         this.UVUnUvUNU = var1;
         return 1.0F;
      } else {
         float var3 = (float)(var1 - this.UVUnUvUNU) / 1.6666667E7F;
         this.UVUnUvUNU = var1;
         return class_3532.method_15363(var3, 0.25F, 4.0F);
      }
   }

   private float NUVvUUVuVNVv() {
      long var1 = System.nanoTime();
      if (this.nVUNnUuU == 0L) {
         this.nVUNnUuU = var1;
         this.VNvuVnvnun = (float)ThreadLocalRandom.current().nextDouble(0.0, (float) (Math.PI * 2));
         return 1.0F;
      } else {
         float var3 = (float)(var1 - this.nVUNnUuU) / 1.6666667E7F;
         this.nVUNnUuU = var1;
         return class_3532.method_15363(var3, 0.25F, 4.0F);
      }
   }

   private void nNuVunNUVu() {
      if (this.UNvvunVVn()) {
         this.NnunUUnU();
      } else if (!this.UnvuVuVnNuvu()) {
         this.UvNNVUVNVuvV();
      } else {
         if (!this.unVVnuunNU) {
            this.unVVnuunNU = true;
            this.vVnuVVvVNuNu = System.currentTimeMillis();
            this.uNVvVvUuuuU = uUnuvNvvNU.field_1724.method_23317();
            this.nvnUvvnUUN = uUnuvNvvNU.field_1724.method_23321();
         }

         long var1 = Math.max(0L, System.currentTimeMillis() - this.vVnuVVvVNuNu);
         boolean var3 = (var1 / 75L & 1L) == 0L;
         Boolean var4 = this.vVvUvVVuuNvV(var3);
         if (var4 == null) {
            this.NnunUUnU();
         } else {
            this.UuUVuuUu(var4, !var4);
         }
      }
   }

   private boolean UNvvunVVn() {
      return this.NnUuNNU.C00OOC00oO("FunTime")
         && uUnuvNvvNU.field_1687 != null
         && uUnuvNvvNU.field_1724 != null
         && uUnuvNvvNU.field_1755 != null
         && (this.nNvNUVU.uUnuvNvvNU() || this.vnuNNVvVVuN || this.UvuVvvVuUuuu);
   }

   private boolean UnvuVuVnNuvu() {
      return this.NnUuNNU.C00OOC00oO("FunTime")
         && uUnuvNvvNU.field_1687 != null
         && uUnuvNvvNU.field_1724 != null
         && uUnuvNvvNU.field_1755 == null
         && (this.nNvNUVU.uUnuvNvvNU() || this.vnuNNVvVVuN || this.UvuVvvVuUuuu || this.UVnuVUUVnnU() || this.UUuNVVnNnu && this.nuUnNvnuUu)
         && !uVunuUNVVUUV
         && !UNnVVNvvnVvU
         && !this.NVvnvnn;
   }

   private void UuUVuuUu(boolean var1, boolean var2) {
      if (uUnuvNvvNU.field_1690 != null && uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1690.field_1894.method_23481(false);
         uUnuvNvvNU.field_1690.field_1881.method_23481(false);
         uUnuvNvvNU.field_1690.field_1913.method_23481(var1);
         uUnuvNvvNU.field_1690.field_1849.method_23481(var2);
         this.UuUVuuUu(false, false, var1, var2);
      }
   }

   private Boolean vVvUvVVuuNvV(boolean var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return var1;
      } else {
         double var2 = uUnuvNvvNU.field_1724.method_23317() - this.uNVvVvUuuuU;
         double var4 = uUnuvNvvNU.field_1724.method_23321() - this.nvnUvvnUUN;
         double var6 = var2 * var2 + var4 * var4;
         if (var6 <= 1.0) {
            return var1;
         } else {
            double var8 = Math.toRadians(uUnuvNvvNU.field_1724.method_36454());
            double var10 = Math.cos(var8);
            double var12 = Math.sin(var8);
            double var14 = -var2;
            double var16 = -var4;
            double var18 = var10 * var14 + var12 * var16;
            if (Math.abs(var18) > 0.0025) {
               return var18 > 0.0;
            } else {
               return var6 >= 4.0 ? null : var1;
            }
         }
      }
   }

   private void UvNNVUVNVuvV() {
      if (this.unVVnuunNU) {
         this.unVVnuunNU = false;
         this.vVnuVVvVNuNu = 0L;
         this.uNVvVvUuuuU = 0.0;
         this.nvnUvvnUUN = 0.0;
         if (uUnuvNvvNU.field_1690 != null) {
            this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1894);
            this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1881);
            this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1913);
            this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1849);
            this.UuUVuuUu(
               uUnuvNvvNU.field_1690.field_1894.method_1434(),
               uUnuvNvvNU.field_1690.field_1881.method_1434(),
               uUnuvNvvNU.field_1690.field_1913.method_1434(),
               uUnuvNvvNU.field_1690.field_1849.method_1434()
            );
         }
      }
   }

   private void NnunUUnU() {
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1894.method_23481(false);
         uUnuvNvvNU.field_1690.field_1881.method_23481(false);
         uUnuvNvvNU.field_1690.field_1913.method_23481(false);
         uUnuvNvvNU.field_1690.field_1849.method_23481(false);
         this.UuUVuuUu(false, false, false, false);
      }
   }

   private void UuUVuuUu(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.field_3913 != null && uUnuvNvvNU.field_1724.field_3913.field_54155 != null) {
         class_10185 var5 = uUnuvNvvNU.field_1724.field_3913.field_54155;
         uUnuvNvvNU.field_1724.field_3913.field_54155 = new class_10185(var1, var2, var3, var4, var5.comp_3163(), var5.comp_3164(), var5.comp_3165());
      }
   }

   private void UuUVuuUu(class_304 var1) {
      if (var1 != null) {
         var1.method_23481(this.C00OOC00oO(var1));
      }
   }

   private boolean C00OOC00oO(class_304 var1) {
      return uUnuvNvvNU.method_22683() != null
         && var1 != null
         && class_3675.method_15987(uUnuvNvvNU.method_22683().method_4490(), var1.method_1429().method_1444());
   }

   public void nNvNUVU() {
      if (!this.nNvNUVU.uUnuvNvvNU()) {
         this.NNVNuUvVn();
      } else if (!this.Oco0Oococc.isEmpty()) {
         if (this.uNUnUuUnvnnU >= this.Oco0Oococc.size()) {
            this.NnVnNVN();
         } else {
            if (!this.vnuNNVvVVuN) {
               if (!this.nvvnUnUn()) {
                  return;
               }

               if (this.VnnnvUunNvuu.uNNnnnuuuN(1000L) && uUnuvNvvNU.field_1724 != null) {
                  String var1 = this.Oco0Oococc.get(this.uNUnUuUnvnnU);
                  this.nUUVuvU(var1);
                  String var2 = this.vNVuvnUUnuUn(var1);
                  uUnuvNvvNU.field_1724.field_3944.method_45730("ah search " + var2);
                  this.vnuNNVvVVuN = true;
                  this.VuuUVVu.UuUVuuUu();
               }
            } else {
               if (!this.VuuUVVu.uNNnnnuuuN(600L)) {
                  return;
               }

               class_437 var10 = uUnuvNvvNU.field_1755;
               if (!(var10 instanceof class_476) && this.VuuUVVu.uNNnnnuuuN(2500L)) {
                  String var12 = this.Oco0Oococc.get(this.uNUnUuUnvnnU);
                  boolean var13 = this.UuUVuuUu(var12, this.UnUNVVVNuv(var12), "не открылся результат поиска");
                  if (var13) {
                     this.uNUnUuUnvnnU++;
                  }

                  if (!var13) {
                     vVnvuVVUunuv.UuUVuuUu("§e[AutoParse] Ожидание кулдауна, повторный поиск: " + this.UnUNVVVNuv(var12));
                  }

                  this.vnuNNVvVVuN = false;
                  this.VnnnvUunNvuu.UuUVuuUu();
                  if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1755 != null) {
                     uUnuvNvvNU.field_1724.method_3137();
                  }

                  return;
               }

               if (var10 instanceof class_476 var11) {
                  String var3 = this.Oco0Oococc.get(this.uNUnUuUnvnnU);
                  if (this.vVvUvVVuuNvV(var11) || this.UuUVuuUu(var11, var3)) {
                     String var4 = this.UnUNVVVNuv(var3);
                     int var5 = (int)this.UnUNuUU.uUnuvNvvNU();
                     AutoBuy.nvUnvV var6 = this.C00OOC00oO(var11, var3);
                     boolean var7 = false;
                     if (var6 != null) {
                        long var8 = this.UuUVuuUu(var6.unitPrice(), var5);
                        UuNnnVnuNNV.put(var3, var8);
                        this.nvuVvuNnNUnv();
                        var7 = true;
                        vVnvuVVUunuv.UuUVuuUu(
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
                        var7 = this.UuUVuuUu(var3, var4, "не найден на странице");
                        if (!var7) {
                           vVnvuVVUunuv.UuUVuuUu("§c[AutoParse] §f" + var4 + " не найден на странице.");
                        }
                     }

                     this.vnuNNVvVVuN = false;
                     if (var7) {
                        this.uNUnUuUnvnnU++;
                     }

                     this.VnnnvUunNvuu.UuUVuuUu();
                     if (uUnuvNvvNU.field_1724 != null) {
                        uUnuvNvvNU.field_1724.method_3137();
                     }
                  }
               }
            }
         }
      }
   }

   private void nUUVuvU(String var1) {
      if (!Objects.equals(this.VUNvNUuNVnn, var1)) {
         this.VUNvNUuNVnn = var1 == null ? "" : var1;
         this.UNNunNuUNVuU = 0;
      }
   }

   private boolean UuUVuuUu(String var1, String var2, String var3) {
      this.nUUVuvU(var1);
      if (this.UNNunNuUNVuU >= 3) {
         vVnvuVVUunuv.UuUVuuUu("§c[AutoParse] §f" + var2 + " пропущен: " + var3 + " после 3 повторных поисков.");
         this.nvuVvuNnNUnv();
         return true;
      } else {
         this.UNNunNuUNVuU++;
         vVnvuVVUunuv.UuUVuuUu("§e[AutoParse] §f" + var2 + ": " + var3 + ", повторный поиск " + this.UNNunNuUNVuU + "/3.");
         return false;
      }
   }

   private void nvuVvuNnNUnv() {
      this.VUNvNUuNVnn = "";
      this.UNNunNuUNVuU = 0;
   }

   private boolean uNNnnnuuuN(boolean var1) {
      String var2 = this.NnUuNNU.uUnuvNvvNU();
      LinkedHashSet var3 = new LinkedHashSet();

      for (String var5 : NVuunNnvvvVu) {
         if (this.uUnuvNvvNU(var5, var2)) {
            var3.add(var5);
         }
      }

      for (String var7 : UuNnnVnuNNV.keySet()) {
         if (this.uUnuvNvvNU(var7, var2)) {
            var3.add(var7);
         }
      }

      this.Oco0Oococc.clear();
      this.Oco0Oococc.addAll(var3);
      this.uNUnUuUnvnnU = 0;
      this.vnuNNVvVVuN = false;
      this.NUUVUvvuNNVU = "";
      this.UvvNuvUNNNUv = 0L;
      this.NunUUVVVuu = 0L;
      this.uUuuVvVunVVu = false;
      this.nvuVvuNnNUnv();
      this.VuuUVVu.UuUVuuUu();
      if (this.Oco0Oococc.isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("§c[AutoBuy] Список предметов для парсинга пуст!");
         this.nNvNUVU.C00OOC00oO(false);
         this.UvuVvvVuUuuu = false;
         return false;
      } else {
         this.UvuVvvVuUuuu = var1;
         this.nNvNUVU.C00OOC00oO(true);
         this.OoccOc0CO = true;
         this.VnnnvUunNvuu.UuUVuuUu();
         vVnvuVVUunuv.UuUVuuUu((var1 ? "§e[AutoBuy] Авто-репарс: " : "§a[AutoBuy] ") + "Начинаем парсинг " + this.Oco0Oococc.size() + " предметов...");
         return true;
      }
   }

   private void NnVnNVN() {
      this.nNvNUVU.C00OOC00oO(false);
      this.OoccOc0CO = false;
      this.vnuNNVvVVuN = false;
      this.NUUVUvvuNNVU = "";
      this.UvvNuvUNNNUv = 0L;
      this.NunUUVVVuu = 0L;
      this.nvuVvuNnNUnv();
      this.UvNNVUVNVuvV();
      this.uVvunVUNuUvu();
      if (this.UvuVvvVuUuuu) {
         this.UvuVvvVuUuuu = false;
         this.VuNVnvNNuNnn.UuUVuuUu();
         vVnvuVVUunuv.UuUVuuUu("§a[AutoBuy] Авто-репарс завершён. Меняем анархию и возвращаем покупки.");
         this.nuUnNvnuUu(true);
      } else {
         vVnvuVVUunuv.UuUVuuUu("§a[AutoBuy] Авто-парс успешно завершён! Цены обновлены.");
      }
   }

   private void vnvvNvUnVv() {
      this.vnuNNVvVVuN = false;
      this.UvuVvvVuUuuu = false;
      this.NUUVUvvuNNVU = "";
      this.UvvNuvUNNNUv = 0L;
      this.NunUUVVVuu = 0L;
      this.nvuVvuNnNUnv();
      this.VnnnvUunNvuu.UuUVuuUu();
      this.VuuUVVu.UuUVuuUu();
      this.VuNVnvNNuNnn.UuUVuuUu();
      this.UvNNVUVNVuvV();
   }

   private boolean OCOocoOoOO() {
      if (!this.uUVuVvuNUvnu.uUnuvNvvNU() || !this.NnUuNNU.C00OOC00oO("FunTime")) {
         return false;
      } else if (!this.nNvNUVU.uUnuvNvvNU() && !this.UvuVvvVuUuuu && !this.NuvunVvnnN && !this.NVvnvnn) {
         if (uUnuvNvvNU.field_1755 instanceof class_476 var1 && this.uUnuvNvvNU(var1)) {
            return false;
         } else if (UuNnnVnuNNV.isEmpty()) {
            this.VuNVnvNNuNnn.UuUVuuUu();
            return false;
         } else if (!this.VuNVnvNNuNnn.uNNnnnuuuN(this.o0Ooc0COOoc())) {
            return false;
         } else if (!this.uNNnnnuuuN(true)) {
            this.VuNVnvNNuNnn.UuUVuuUu();
            return false;
         } else {
            int var3 = this.nuUnNvnuUu(false);
            if (var3 == -1) {
               this.NNVNuUvVn();
               this.VuNVnvNNuNnn.UuUVuuUu();
               return false;
            } else {
               this.NUUVUvvuNNVU = String.valueOf(var3);
               this.UvvNuvUNNNUv = System.currentTimeMillis();
               this.NunUUVVVuu = System.currentTimeMillis() + 2500L;
               this.uUuuVvVunVVu = false;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private long o0Ooc0COOoc() {
      return Math.max(1L, (long)this.UvUvUNuvNU.uUnuvNvvNU()) * 60000L;
   }

   private boolean nvvnUnUn() {
      long var1 = System.currentTimeMillis();
      if (!this.NUUVUvvuNNVU.isEmpty()) {
         long var3 = var1 - this.UvvNuvUNNNUv;
         String var5 = this.UuuuNNunN();
         boolean var6 = this.NUUVUvvuNNVU.equals(var5) && var3 >= 2500L;
         if (!var6 && !this.uUuuVvVunVVu && var3 >= 4500L && uUnuvNvvNU.field_1724 != null) {
            uUnuvNvvNU.field_1724.field_3944.method_45730("an" + this.NUUVUvvuNNVU);
            this.uUuuVvVunVVu = true;
            this.UvvNuvUNNNUv = var1;
            return false;
         }

         var3 = var1 - this.UvvNuvUNNNUv;
         boolean var7 = var3 >= 12000L;
         if (!var6 && !var7) {
            return false;
         }

         this.NUUVUvvuNNVU = "";
         this.uUuuVvVunVVu = false;
      }

      return var1 >= this.NunUUVVVuu;
   }

   private long UuUVuuUu(long var1, int var3) {
      double var4 = var3 / 100.0;
      long var6 = (long)(var1 * var4);
      return Math.max(1L, var1 - var6);
   }

   private String UnUNVVVNuv(String var1) {
      if (vNnnVNUVU.C00OOC00oO(var1)) {
         return vNnnVNUVU.vVvUvVVuuNvV(var1);
      } else {
         if (var1 != null && var1.startsWith("minecraft:")) {
            class_2960 var2 = class_2960.method_12829(var1);
            if (var2 != null) {
               class_1792 var3 = (class_1792)class_7923.field_41178.method_63535(var2);
               if (var3 != class_1802.field_8162) {
                  return var3.method_7854().method_7964().getString();
               }
            }
         }

         return var1;
      }
   }

   private String vNVuvnUUnuUn(String var1) {
      if (var1 == null) {
         return "";
      } else {
         return switch (var1) {
            case "Опыт 15" -> "Опыт с уровнем 15";
            case "Опыт 30" -> "Опыт с уровнем 30";
            case "Опыт 45" -> "Опыт с уровнем 45";
            case "Опыт 50" -> "Опыт с уровнем 50";
            default -> this.UnUNVVVNuv(var1);
         };
      }
   }

   private boolean uUnuvNvvNU(class_476 var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = this.UvnvNVnnnnNU(var1.method_25440().getString());
         if (var2.contains("подтверждение покупки")) {
            return this.vVvUvVVuuNvV(var1.method_17577()) != -1;
         } else {
            return !this.unnUnUNVnN() ? false : this.uUnuvNvvNU(var1.method_17577());
         }
      }
   }

   private boolean uUnuvNvvNU(class_1703 var1) {
      return var1.field_7761.size() < 27 ? false : this.vVvUvVVuuNvV(var1) != -1;
   }

   private int vVvUvVVuuNvV(class_1703 var1) {
      int var2 = this.uNNnnnuuuN(var1);

      for (int var3 = var2 - 1; var3 >= 0; var3--) {
         class_1799 var4 = var1.method_7611(var3).method_7677();
         String var5 = this.UvnvNVnnnnNU(var4.method_7964().getString());
         if (var5.contains("купить")) {
            return var3;
         }

         if (var4.method_7909() == class_1802.field_8581
            || var4.method_7909() == class_1802.field_8656
            || var4.method_7909() == class_1802.field_8120
            || var4.method_7909() == class_1802.field_8839) {
            return var3;
         }
      }

      return -1;
   }

   private int uNNnnnuuuN(class_1703 var1) {
      return Math.max(0, Math.min(54, var1.field_7761.size() - 36));
   }

   private String UvnvNVnnnnNU(String var1) {
      return var1 == null ? "" : var1.replaceAll("§.", "").toLowerCase(Locale.ROOT).trim();
   }

   private boolean vVvUvVVuuNvV(class_476 var1) {
      return this.NnUuNNU.C00OOC00oO("HolyWorld") ? this.uNNnnnuuuN(var1) : AhHelper.UuUVuuUu(var1);
   }

   public boolean UuUVuuUu(class_476 var1) {
      return this.vVvUvVVuuNvV(var1);
   }

   private boolean uNNnnnuuuN(class_476 var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = this.UvnvNVnnnnNU(var1.method_25440().getString());
         return !var2.contains("аукцион") && !var2.contains("auction") ? this.C00OOC00oO(var1.method_17577()) != -1 : true;
      }
   }

   private boolean UuUVuuUu(class_476 var1, String var2) {
      if (var1 != null && var2 != null) {
         if (((class_1707)var1.method_17577()).field_7761.size() < 54) {
            return false;
         } else {
            String var3 = this.UvnvNVnnnnNU(var1.method_25440().getString());
            String var4 = this.UvnvNVnnnnNU(this.UnUNVVVNuv(var2));
            String var5 = this.UvnvNVnnnnNU(this.vNVuvnUUnuUn(var2));
            if (!var3.contains(var4) && !var3.contains(var5)) {
               return false;
            } else {
               boolean var6 = false;
               int var7 = Math.min(54, ((class_1707)var1.method_17577()).field_7761.size());

               for (int var8 = 45; var8 < var7; var8++) {
                  class_1799 var9 = ((class_1707)var1.method_17577()).method_7611(var8).method_7677();
                  if (var9.method_7909() == class_1802.field_8107
                     || var9.method_7909() == class_1802.field_8407
                     || var9.method_7909() == class_1802.field_8236
                     || var9.method_7909() == class_1802.field_8581) {
                     var6 = true;
                     break;
                  }
               }

               if (!var6) {
                  return false;
               } else {
                  for (int var10 = 0; var10 < Math.min(45, ((class_1707)var1.method_17577()).field_7761.size()); var10++) {
                     class_1735 var11 = ((class_1707)var1.method_17577()).method_7611(var10);
                     if (this.C00OOC00oO(var11) && this.C00OOC00oO(var11, this.NnUuNNU.uUnuvNvvNU()) > 0L) {
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

   private AutoBuy.nvUnvV C00OOC00oO(class_476 var1, String var2) {
      long var3 = Long.MAX_VALUE;
      long var5 = Long.MAX_VALUE;
      int var7 = 1;
      boolean var8 = false;
      String var9 = this.NnUuNNU.uUnuvNvvNU();

      for (int var10 = 0; var10 < Math.min(45, ((class_1707)var1.method_17577()).field_7761.size()); var10++) {
         class_1735 var11 = ((class_1707)var1.method_17577()).method_7611(var10);
         if (this.C00OOC00oO(var11) && this.UuUVuuUu(var2, var11.method_7677(), var9)) {
            long var12 = this.C00OOC00oO(var11, var9);
            if (var12 > 0L) {
               int var14 = this.UuUVuuUu(var11);
               long var15 = this.C00OOC00oO(var12, var14);
               if (var15 < var3 || var15 == var3 && var12 < var5) {
                  var3 = var15;
                  var5 = var12;
                  var7 = var14;
                  var8 = true;
               }
            }
         }
      }

      return var8 ? new AutoBuy.nvUnvV(var3, var5, var7) : null;
   }

   private int UuUVuuUu(class_1735 var1) {
      return var1 != null && var1.method_7681() ? Math.max(1, var1.method_7677().method_7947()) : 1;
   }

   private long C00OOC00oO(long var1, int var3) {
      int var4 = Math.max(1, var3);
      return Math.max(1L, (var1 + var4 - 1L) / var4);
   }

   private boolean C00OOC00oO(class_1735 var1) {
      if (var1 != null && var1.method_7681()) {
         class_1799 var2 = var1.method_7677();
         return !this.uUnuvNvvNU(var2);
      } else {
         return false;
      }
   }

   private boolean uUnuvNvvNU(class_1799 var1) {
      if (var1 != null && !var1.method_7960() && var1.method_7909() != class_1802.field_8162) {
         class_1792 var2 = var1.method_7909();
         return var2 == class_1802.field_8656
            || var2 == class_1802.field_8157
            || var2 == class_1802.field_8581
            || var2 == class_1802.field_8879
            || var2 == class_1802.field_8871
            || var2 == class_1802.field_8736
            || var2 == class_1802.field_8761
            || var2 == class_1802.field_8703
            || var2 == class_1802.field_8107
            || var2 == class_1802.field_8236
            || var2 == class_1802.field_8407
            || var2 == class_1802.field_8077
            || var2 == class_1802.field_8106
            || var2 == class_1802.field_8466
            || var2 == class_1802.field_8239
            || var2 == class_1802.field_8251;
      } else {
         return true;
      }
   }

   private boolean uUnuvNvvNU(class_1735 var1) {
      if (var1 != null && var1.method_7681() && !this.uUnuvNvvNU(var1.method_7677())) {
         long var2 = UNuvuNVuUnVu.C00OOC00oO(var1);
         if (var2 <= 0L) {
            return false;
         } else {
            String var4 = UNuvuNVuUnVu.UuUVuuUu(var1);
            if (var4 == null || var4.isBlank()) {
               return false;
            } else {
               return uUnuvNvvNU.field_1724 != null && var4.equalsIgnoreCase(uUnuvNvvNU.field_1724.method_5477().getString()) ? false : !vVvUvVVuuNvV(var4);
            }
         }
      } else {
         return false;
      }
   }

   private boolean nuUnNvnuUu(class_1703 var1) {
      int var2 = this.uNNnnnuuuN(var1);
      int var3 = this.vVvUvVVuuNvV(var1);

      for (int var4 = 0; var4 < var2; var4++) {
         if (var4 != var3) {
            class_1735 var5 = var1.method_7611(var4);
            if (this.C00OOC00oO(var5) && this.uUnuvNvvNU(var5)) {
               AutoBuy.VUUnVnVNNU var6 = this.UuUVuuUu(var5, (long)UNuvuNVuUnVu.C00OOC00oO(var5));
               if (var6 != null
                  && var6.buyable()
                  && (this.uVUUnuunuv == 0 || var6.fingerprint() == this.uVUUnuunuv)
                  && (this.vNVvnNNnVV <= 0L || var6.lotPrice() <= this.vNVvnNNnVV)
                  && (this.UvnnnuuNvUvv <= 0L || var6.estimatedValue() >= this.UvnnnuuNvUvv)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private AutoBuy.VUUnVnVNNU UuUVuuUu(class_1735 var1, long var2) {
      if (!this.nNnVnUNVV.uUnuvNvvNU()) {
         return null;
      } else if (var1 != null && var1.method_7681() && var2 > 0L) {
         class_1799 var4 = var1.method_7677();
         if (!this.uUnuvNvvNU(var4.method_7909())) {
            return null;
         } else {
            class_9288 var5 = (class_9288)var4.method_58694(class_9334.field_49622);
            if (var5 == null) {
               return null;
            } else {
               long var6 = this.UuUVuuUu(var5, 0);
               if (var6 <= 0L) {
                  return null;
               } else {
                  long var8 = var6 - var2;
                  long var10 = Math.max(0L, (long)this.uUVVvVVNvvn.uUnuvNvvNU());
                  long var12 = Math.max(0L, (long)this.vvUVNVvvNUv.uUnuvNvvNU());
                  long var14 = (long)Math.ceil(var2 * (Math.max(0.0F, this.nuunNvv.uUnuvNvvNU()) / 100.0));
                  boolean var16 = var6 >= var12 && var8 >= var10 && var8 >= var14;
                  return new AutoBuy.VUUnVnVNNU(var2, var6, var8, this.vVvUvVVuuNvV(var4), var16);
               }
            }
         }
      } else {
         return null;
      }
   }

   private long UuUVuuUu(class_9288 var1, int var2) {
      if (var1 != null && var2 <= 2) {
         long var3 = 0L;
         boolean var5 = false;

         for (class_1799 var7 : var1.method_59715()) {
            if (var7 != null && !var7.method_7960()) {
               var5 = true;
               long var8 = this.UuUVuuUu(var7, var2);
               if (var8 > 0L) {
                  var3 = this.UuUVuuUu(var3, var8);
               }
            }
         }

         return var5 ? var3 : 0L;
      } else {
         return 0L;
      }
   }

   private long UuUVuuUu(class_1799 var1, int var2) {
      long var3 = 0L;

      for (Entry var6 : UuNnnVnuNNV.entrySet()) {
         String var7 = (String)var6.getKey();
         Long var8 = (Long)var6.getValue();
         if (var7 != null
            && var8 != null
            && var8 > 0L
            && !vNnNuuvVn.contains(var7)
            && this.uUnuvNvvNU(var7, "FunTime")
            && this.UuUVuuUu(var7, var1, "FunTime")
            && this.UuUVuuUu(var7, var1)) {
            var3 = Math.max(var3, this.uUnuvNvvNU(var8, Math.max(1, var1.method_7947())));
         }
      }

      if (this.uUnuvNvvNU(var1.method_7909()) && var2 < 2) {
         class_9288 var9 = (class_9288)var1.method_58694(class_9334.field_49622);
         if (var9 != null) {
            var3 = Math.max(var3, this.UuUVuuUu(var9, var2 + 1));
         }
      }

      return var3;
   }

   private boolean uUnuvNvvNU(class_1792 var1) {
      return var1 == class_1802.field_8545
         || var1 == class_1802.field_8722
         || var1 == class_1802.field_8380
         || var1 == class_1802.field_8050
         || var1 == class_1802.field_8829
         || var1 == class_1802.field_8271
         || var1 == class_1802.field_8548
         || var1 == class_1802.field_8520
         || var1 == class_1802.field_8627
         || var1 == class_1802.field_8451
         || var1 == class_1802.field_8213
         || var1 == class_1802.field_8816
         || var1 == class_1802.field_8350
         || var1 == class_1802.field_8584
         || var1 == class_1802.field_8461
         || var1 == class_1802.field_8676
         || var1 == class_1802.field_8268;
   }

   private int vVvUvVVuuNvV(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         class_2960 var2 = class_7923.field_41178.method_10221(var1.method_7909());
         return Objects.hash(var2, var1.method_7947(), var1.method_7964().getString(), var1.method_57353().hashCode());
      } else {
         return 0;
      }
   }

   private long UuUVuuUu(long var1, long var3) {
      try {
         return Math.addExact(var1, var3);
      } catch (ArithmeticException var6) {
         return Long.MAX_VALUE;
      }
   }

   private long uUnuvNvvNU(long var1, int var3) {
      try {
         return Math.multiplyExact(var1, Math.max(1, var3));
      } catch (ArithmeticException var5) {
         return Long.MAX_VALUE;
      }
   }

   private void uVUVnuvnuVuv(String var1) {
      this.uvNnUuvvNU = var1 == null ? "" : var1;
      this.UuUUvvVunV = System.currentTimeMillis();
      if (!"__wild_funtime_shulker__".equals(this.uvNnUuvvNU)) {
         this.vNVvnNNnVV = 0L;
         this.UvnnnuuNvUvv = 0L;
         this.uVUUnuunuv = 0;
      }
   }

   private void UnUUVuVunvVu() {
      this.uvNnUuvvNU = "";
      this.UuUUvvVunV = 0L;
      this.vNVvnNNnVV = 0L;
      this.UvnnnuuNvUvv = 0L;
      this.uVUUnuunuv = 0;
   }

   private void nnvuvUNuUnN() {
      this.VuNNvnVVUUn = 0L;
      this.vuNunNnvnunv = 0;
      this.UVVNUnVnNV = false;
      this.vnUUvvnUVUu = 0L;
   }

   private boolean UVnuVUUVnnU() {
      return this.UVVNUnVnNV && this.NnUuNNU.C00OOC00oO("FunTime");
   }

   private void VunnVNvNV() {
      this.UVVNUnVnNV = true;
      this.vnUUvvnUVUu = System.currentTimeMillis() + ThreadLocalRandom.current().nextLong(15000L, 20001L);
      this.NuvunVvnnN = false;
      this.NUuVnnuUnvu = "";
      this.UnUUVuVunvVu();
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1755 != null) {
         uUnuvNvvNU.field_1724.method_3137();
      }
   }

   private void NvUVUvVVnUu() {
      if (System.currentTimeMillis() >= this.vnUUvvnUVUu) {
         this.UVVNUnVnNV = false;
         this.vnUUvvnUVUu = 0L;
         this.VvVuvUvvNNVv();
      }
   }

   private boolean unnUnUNVnN() {
      if (this.uvNnUuvvNU.isEmpty()) {
         return false;
      } else if (System.currentTimeMillis() - this.UuUUvvVunV > 15000L) {
         this.UnUUVuVunvVu();
         return false;
      } else {
         return true;
      }
   }

   private boolean nuUnNvnuUu(class_476 var1) {
      if (var1 != null && this.unnUnUNVnN()) {
         String var2 = this.uvNnUuvvNU;
         String var3 = this.NnUuNNU.uUnuvNvvNU();
         if (!"__wild_funtime_shulker__".equals(var2)) {
            Long var4 = UuNnnVnuNNV.get(var2);
            if (var4 == null || var4 <= 0L || vNnNuuvVn.contains(var2)) {
               return false;
            } else {
               return !this.uUnuvNvvNU(var2, var3) ? false : this.UuUVuuUu(var1.method_17577(), var2, var4, var3);
            }
         } else {
            return var3.equals("FunTime") && this.nuUnNvnuUu(var1.method_17577());
         }
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu(class_1703 var1, String var2, long var3, String var5) {
      int var6 = this.uNNnnnuuuN(var1);
      int var7 = this.vVvUvVVuuNvV(var1);

      for (int var8 = 0; var8 < var6; var8++) {
         if (var8 != var7) {
            class_1735 var9 = var1.method_7611(var8);
            if (this.C00OOC00oO(var9) && (!var5.equals("FunTime") || this.uUnuvNvvNU(var9))) {
               class_1799 var10 = var9.method_7677();
               if (this.UuUVuuUu(var2, var10, var5) && this.UuUVuuUu(var2, var10)) {
                  long var11 = this.C00OOC00oO(var9, var5);
                  if (var11 <= 0L || this.C00OOC00oO(var11, this.UuUVuuUu(var9)) <= var3) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   private void VVuuUN(class_1703 var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_3137();
      }

      this.UnUUVuVunvVu();
   }

   public static int vNUvnnVnUvu(String var0) {
      return uVUuuVnNVU(var0);
   }

   public static int uVUuuVnNVU(String var0) {
      return var0 == null ? 0 : Math.max(0, Math.min(100, uUVvnUuNvvN.getOrDefault(var0, 0)));
   }

   public static int vuuuNvNuv(String var0) {
      return var0 == null ? 100 : Math.max(0, Math.min(100, UUuUnNVNuuv.getOrDefault(var0, 100)));
   }

   public static void UuUVuuUu(String var0, int var1) {
      UuUVuuUu(var0, var1, vuuuNvNuv(var0));
   }

   public static void UuUVuuUu(String var0, int var1, int var2) {
      if (var0 != null && !var0.isBlank()) {
         int var3 = Math.max(0, Math.min(100, var1));
         int var4 = Math.max(0, Math.min(100, var2));
         if (var3 > var4) {
            int var5 = var3;
            var3 = var4;
            var4 = var5;
         }

         if (var3 <= 0) {
            uUVvnUuNvvN.remove(var0);
         } else {
            uUVvnUuNvvN.put(var0, var3);
         }

         if (var4 >= 100) {
            UUuUnNVNuuv.remove(var0);
         } else {
            UUuUnNVNuuv.put(var0, var4);
         }
      }
   }

   public static boolean C00OOC00oO(String var0, String var1) {
      Set var2 = NVuNUuVnVUN.get(var0);
      return var2 == null || !var2.contains(vNnnVNUVU.uNNnnnuuuN(var1));
   }

   public static void UuUVuuUu(String var0, String var1, boolean var2) {
      if (var0 != null && !var0.isBlank()) {
         String var3 = vNnnVNUVU.uNNnnnuuuN(var1);
         if (!var3.isBlank()) {
            if (var2) {
               Set var4 = NVuNUuVnVUN.get(var0);
               if (var4 != null) {
                  var4.remove(var3);
                  if (var4.isEmpty()) {
                     NVuNUuVnVUN.remove(var0);
                  }
               }
            } else {
               NVuNUuVnVUN.computeIfAbsent(var0, var0x -> new LinkedHashSet<>()).add(var3);
            }
         }
      }
   }

   public static Set<String> UuUVuuUu(String var0, List<String> var1) {
      LinkedHashSet var2 = new LinkedHashSet();
      if (var1 == null) {
         return var2;
      } else {
         for (String var4 : var1) {
            String var5 = vNnnVNUVU.uNNnnnuuuN(var4);
            if (!var5.isBlank() && C00OOC00oO(var0, var5)) {
               var2.add(var5);
            }
         }

         return var2;
      }
   }

   public static int UuUVuuUu(class_1799 var0) {
      if (var0 != null && !var0.method_7960() && var0.method_7963()) {
         int var1 = var0.method_7936();
         if (var1 <= 0) {
            return 100;
         } else {
            int var2 = Math.max(0, var1 - var0.method_7919());
            return Math.max(0, Math.min(100, (int)(var2 * 100L / var1)));
         }
      } else {
         return 100;
      }
   }

   private boolean UuUVuuUu(String var1, class_1799 var2) {
      if (var2 != null && UuUVuuUu(var2.method_7909())) {
         int var3 = uVUuuVnNVU(var1);
         int var4 = vuuuNvNuv(var1);
         int var5 = UuUVuuUu(var2);
         return var5 >= var3 && var5 <= var4;
      } else {
         return true;
      }
   }

   public static boolean UuUVuuUu(class_1792 var0) {
      return var0 == null ? false : C00OOC00oO(var0) || new class_1799(var0).method_7963();
   }

   public static boolean C00OOC00oO(class_1792 var0) {
      return var0 == class_1802.field_22027
         || var0 == class_1802.field_8805
         || var0 == class_1802.field_8743
         || var0 == class_1802.field_8283
         || var0 == class_1802.field_8862
         || var0 == class_1802.field_8267
         || var0 == class_1802.field_8090
         || var0 == class_1802.field_22028
         || var0 == class_1802.field_8058
         || var0 == class_1802.field_8523
         || var0 == class_1802.field_8873
         || var0 == class_1802.field_8678
         || var0 == class_1802.field_8577
         || var0 == class_1802.field_22029
         || var0 == class_1802.field_8348
         || var0 == class_1802.field_8396
         || var0 == class_1802.field_8218
         || var0 == class_1802.field_8416
         || var0 == class_1802.field_8570
         || var0 == class_1802.field_22030
         || var0 == class_1802.field_8285
         || var0 == class_1802.field_8660
         || var0 == class_1802.field_8313
         || var0 == class_1802.field_8753
         || var0 == class_1802.field_8370;
   }

   private String vVvUvVVuuNvV(class_1735 var1) {
      String var2 = this.NnUuNNU.uUnuvNvvNU();
      if (var1 != null && var1.method_7681()) {
         if (var2.equals("HolyWorld")) {
            return this.uNNnnnuuuN(var1);
         } else {
            class_1799 var3 = var1.method_7677();
            long var4 = this.C00OOC00oO(var1, var2);
            String var6 = this.UuUVuuUu(var1, var2);
            if (var4 <= 0L) {
               return null;
            } else if (var2.equals("FunTime") && !this.uUnuvNvvNU(var1)) {
               return null;
            } else if (uUnuvNvvNU.field_1724 != null && var6 != null && var6.equalsIgnoreCase(uUnuvNvvNU.field_1724.method_5477().getString())) {
               return null;
            } else if (vVvUvVVuuNvV(var6)) {
               return null;
            } else {
               if (var2.equals("FunTime")) {
                  AutoBuy.VUUnVnVNNU var7 = this.UuUVuuUu(var1, var4);
                  if (var7 != null && var7.buyable()) {
                     this.vNVvnNNnVV = var7.lotPrice();
                     this.UvnnnuuNvUvv = var7.estimatedValue();
                     this.uVUUnuunuv = var7.fingerprint();
                     return "__wild_funtime_shulker__";
                  }
               }

               long var13 = this.C00OOC00oO(var4, this.UuUVuuUu(var1));

               for (Entry var10 : UuNnnVnuNNV.entrySet()) {
                  String var11 = (String)var10.getKey();
                  Long var12 = (Long)var10.getValue();
                  if (!vNnNuuvVn.contains(var11)
                     && var12 != null
                     && this.uUnuvNvvNU(var11, var2)
                     && this.UuUVuuUu(var11, var3, var2)
                     && var13 <= var12
                     && this.UuUVuuUu(var11, var3)) {
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

   private boolean uUnuvNvvNU(String var1, String var2) {
      if (var1 == null || var2 == null) {
         return false;
      } else if (var1.startsWith("minecraft:")) {
         return true;
      } else if (vNnnVNUVU.UuUVuuUu(var1)) {
         return var2.equals("HolyWorld");
      } else if (var2.equals("FunTime")) {
         return vUNuuvvnVnv.contains(var1);
      } else if (var2.equals("SpookyTime")) {
         return vUNuuvvnVnv.contains(var1) || unnnNUNnVu.contains(var1);
      } else {
         return var2.equals("HolyWorld") ? vNnnVNUVU.C00OOC00oO(var1) : false;
      }
   }

   private String uNNnnnuuuN(class_1735 var1) {
      class_1799 var2 = var1.method_7677();
      if (this.C00OOC00oO(var2)) {
         return null;
      } else if (!var2.method_31574(class_1802.field_8077) && !var2.method_31574(class_1802.field_8106) && !var2.method_31574(class_1802.field_8466)) {
         AutoBuy.VvunVVUvUNnv var3 = this.VVuuUN(var1);
         if (var3.price() > 0L && var3.seller() != null) {
            if (uUnuvNvvNU.field_1724 != null && var3.seller().equalsIgnoreCase(uUnuvNvvNU.field_1724.method_5477().getString())) {
               return null;
            } else if (vVvUvVVuuNvV(var3.seller())) {
               return null;
            } else {
               long var4 = this.C00OOC00oO(var3.price(), this.UuUVuuUu(var1));
               this.NnuUnUNnu();
               AutoBuy.uunvUUVnuNn var6 = new AutoBuy.uunvUUVnuNn(var2);
               String var7 = this.UuUVuuUu(var2, var4, this.vvNvvuUUUVvv.get(var2.method_7909()), var6);
               return var7 != null ? var7 : this.UuUVuuUu(var2, var4, this.nvvVNNnnUvVN, var6);
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void NnuUnUNnu() {
      int var1 = this.UnnnvvU();
      if (var1 != this.uUuvNUN) {
         this.uUuvNUN = var1;
         this.vvNvvuUUUVvv.clear();
         this.nvvVNNnnUvVN.clear();

         for (Entry var3 : UuNnnVnuNNV.entrySet()) {
            String var4 = (String)var3.getKey();
            Long var5 = (Long)var3.getValue();
            if (var4 != null && !vNnNuuvVn.contains(var4) && var5 != null) {
               vNnnVNUVU.nvUnvV var6 = vNnnVNUVU.uUnuvNvvNU(var4);
               class_1792 var7 = this.UuUVuuUu(var4, var6);
               AutoBuy.nvnNNunvv var8 = new AutoBuy.nvnNNunvv(var4, var5, var6, var7, this.uVunuUNVVUUV(var4));
               if (var7 != null && var7 != class_1802.field_8162) {
                  this.vvNvvuUUUVvv.computeIfAbsent(var7, var0 -> new ArrayList<>()).add(var8);
               } else {
                  this.nvvVNNnnUvVN.add(var8);
               }
            }
         }
      }
   }

   private int UnnnvvU() {
      int var1 = 1;

      for (Entry var3 : UuNnnVnuNNV.entrySet()) {
         var1 = 31 * var1 + Objects.hashCode(var3.getKey());
         var1 = 31 * var1 + Objects.hashCode(var3.getValue());
      }

      for (String var6 : vNnNuuvVn) {
         var1 += Objects.hashCode(var6);
      }

      return var1;
   }

   private void VUUnuVvVu() {
      this.uUuvNUN = Integer.MIN_VALUE;
   }

   private class_1792 UuUVuuUu(String var1, vNnnVNUVU.nvUnvV var2) {
      if (var2 != null) {
         return var2.item();
      } else if (var1 != null && var1.startsWith("minecraft:")) {
         class_2960 var3 = class_2960.method_12829(var1);
         if (var3 == null) {
            return null;
         } else {
            class_1792 var4 = (class_1792)class_7923.field_41178.method_63535(var3);
            return var4 == class_1802.field_8162 ? null : var4;
         }
      } else {
         return null;
      }
   }

   private String UuUVuuUu(class_1799 var1, long var2, List<AutoBuy.nvnNNunvv> var4, AutoBuy.uunvUUVnuNn var5) {
      if (var4 != null && !var4.isEmpty()) {
         for (AutoBuy.nvnNNunvv var7 : var4) {
            if (var2 <= var7.maxPrice()) {
               vNnnVNUVU.nvUnvV var8 = var7.holyWorldEntry();
               if (var8 != null) {
                  if (var1.method_31574(var8.item())
                     && this.UuUVuuUu(var7.itemName(), var8, var1, var5.UuUVuuUu(), var5.C00OOC00oO())
                     && this.UuUVuuUu(var7.itemName(), var1)) {
                     return var7.itemName();
                  }
               } else if (this.UuUVuuUu(var7, var1, var5) && this.UuUVuuUu(var7.itemName(), var1)) {
                  return var7.itemName();
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private boolean UuUVuuUu(AutoBuy.nvnNNunvv var1, class_1799 var2, AutoBuy.uunvUUVnuNn var3) {
      class_1792 var4 = var1.item();
      if (var4 != null && var4 != class_1802.field_8162 && !var2.method_31574(var4)) {
         return false;
      } else {
         class_2960 var5 = var3.uNNnnnuuuN();
         String var6 = var1.itemName();
         if (var5 == null || !var6.equalsIgnoreCase(var5.toString()) && !var6.equalsIgnoreCase(var5.method_12832())) {
            String var7 = var3.uUnuvNvvNU();
            return var7.equalsIgnoreCase(var6) || var3.vVvUvVVuuNvV().equals(var1.normalizedName());
         } else {
            return true;
         }
      }
   }

   private boolean UuUVuuUu(String var1, vNnnVNUVU.nvUnvV var2, class_1799 var3, String var4, String var5) {
      Set var6 = C00OOC00oO(var2.item()) ? UuUVuuUu(var1, var2.enchantments()) : null;
      return vNnnVNUVU.UuUVuuUu(var2, var3, var4, var5, var6);
   }

   private boolean nuUnNvnuUu(class_1735 var1) {
      if (var1 != null && var1.method_7681()) {
         class_1799 var2 = var1.method_7677();
         if (this.C00OOC00oO(var2)) {
            return false;
         } else if (!var2.method_31574(class_1802.field_8077) && !var2.method_31574(class_1802.field_8106) && !var2.method_31574(class_1802.field_8466)) {
            AutoBuy.VvunVVUvUNnv var3 = this.VVuuUN(var1);
            return var3.price() > 0L && var3.seller() != null;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu(String var1, class_1799 var2, String var3) {
      if (var1 == null || var2 == null || var2.method_7960()) {
         return false;
      } else if (var3.equals("HolyWorld") && vNnnVNUVU.C00OOC00oO(var1)) {
         vNnnVNUVU.nvUnvV var4 = vNnnVNUVU.uUnuvNvvNU(var1);
         if (var4 != null && var2.method_31574(var4.item())) {
            String var7 = vNnnVNUVU.uNNnnnuuuN(var2);
            String var6 = vNnnVNUVU.nuUnNvnuUu(var2);
            return this.UuUVuuUu(var1, var4, var2, var7, var6);
         } else {
            return false;
         }
      } else if (!var3.equals("FunTime") && !var3.equals("SpookyTime") && !var3.equals("HolyWorld")) {
         return this.uUnuvNvvNU(var1, var2);
      } else {
         return switch (var1) {
            case "Сфера Хаоса" -> this.UuUVuuUu(
               var2,
               class_1802.field_8575,
               this.UuUVuuUu(class_5134.field_23721, 2.5),
               this.UuUVuuUu(class_5134.field_23719, 0.07),
               this.UuUVuuUu(class_5134.field_23723, 0.13),
               this.UuUVuuUu(class_5134.field_23724, 1.5),
               this.UuUVuuUu(class_5134.field_23716, -4.0),
               this.UuUVuuUu(class_5134.field_49078, 0.09)
            );
            case "Сфера Титана" -> this.UuUVuuUu(
               var2,
               class_1802.field_8575,
               this.UuUVuuUu(class_5134.field_23724, 2.5),
               this.UuUVuuUu(class_5134.field_23725, 2.5),
               this.UuUVuuUu(class_5134.field_23719, -0.15)
            );
            case "Сфера Ареса" -> this.UuUVuuUu(
               var2,
               class_1802.field_8575,
               this.UuUVuuUu(class_5134.field_23721, 6.0),
               this.UuUVuuUu(class_5134.field_23724, -2.0),
               this.UuUVuuUu(class_5134.field_23716, -2.0)
            );
            case "Сфера Бестии" -> this.UuUVuuUu(
               var2,
               class_1802.field_8575,
               this.UuUVuuUu(class_5134.field_23724, 1.0),
               this.UuUVuuUu(class_5134.field_23716, 4.0),
               this.UuUVuuUu(class_5134.field_23719, 0.1),
               this.UuUVuuUu(class_5134.field_23723, 0.1)
            );
            case "Сфера Гидры" -> this.UuUVuuUu(
               var2,
               class_1802.field_8575,
               this.UuUVuuUu(class_5134.field_23724, 2.0),
               this.UuUVuuUu(class_5134.field_23716, 4.0),
               this.UuUVuuUu(class_5134.field_51576, 0.5),
               this.UuUVuuUu(class_5134.field_51583, 0.5)
            );
            case "Сфера Икара" -> this.UuUVuuUu(
               var2, class_1802.field_8575, this.UuUVuuUu(class_5134.field_23721, 2.0), this.UuUVuuUu(class_5134.field_23716, 2.0)
            );
            case "Сфера Эрида" -> this.UuUVuuUu(
               var2,
               class_1802.field_8575,
               this.UuUVuuUu(class_5134.field_23726, 1.0),
               this.UuUVuuUu(class_5134.field_23716, 2.0),
               this.UuUVuuUu(class_5134.field_47758, 1.0)
            );
            case "Сфера Сатира" -> this.UuUVuuUu(
               var2,
               class_1802.field_8575,
               this.UuUVuuUu(class_5134.field_23721, 2.0),
               this.UuUVuuUu(class_5134.field_23728, -0.1),
               this.UuUVuuUu(class_5134.field_23723, 0.15)
            );
            case "Вещи Крушителя", "Набор Крушителя", "Броня Крушителя", "Броня Крушителя с шипами", "Броня Крушителя шип", "Броня Крушителя без шипов", "Броня Крушителя без шип", "Шлем Крушителя", "Нагрудник Крушителя", "Поножи Крушителя", "Ботинки Крушителя", "Меч Крушителя", "Кирка Крушителя", "Лук Крушителя", "Арбалет Крушителя", "Трезубец Крушителя", "Булава Крушителя", "Элитры Крушителя", "Удочка Крушителя" -> (
                  var3.equals("FunTime") || var3.equals("SpookyTime")
               )
               && this.C00OOC00oO(var1, var2);
            case "Талисман Демона" -> this.UuUVuuUu(
               var2, class_1802.field_8288, this.UuUVuuUu(class_5134.field_23721, 2.5), this.UuUVuuUu(class_5134.field_23723, 0.1)
            );
            case "Талисман Карателя" -> this.UuUVuuUu(
               var2,
               class_1802.field_8288,
               this.UuUVuuUu(class_5134.field_23721, 7.0),
               this.UuUVuuUu(class_5134.field_23716, -4.0),
               this.UuUVuuUu(class_5134.field_23719, 0.1)
            );
            case "Талисман Мрака" -> this.UuUVuuUu(
               var2, class_1802.field_8288, this.UuUVuuUu(class_5134.field_23724, 1.5), this.UuUVuuUu(class_5134.field_23716, 1.5)
            );
            case "Талисман Ярости" -> this.UuUVuuUu(
               var2, class_1802.field_8288, this.UuUVuuUu(class_5134.field_23721, 5.0), this.UuUVuuUu(class_5134.field_23716, -4.0)
            );
            case "Талисман Тирана" -> this.UuUVuuUu(
               var2,
               class_1802.field_8288,
               this.UuUVuuUu(class_5134.field_23721, 2.0),
               this.UuUVuuUu(class_5134.field_23724, 2.0),
               this.UuUVuuUu(class_5134.field_23716, -4.0)
            );
            case "Талисман Крушителя" -> this.UuUVuuUu(
               var2,
               class_1802.field_8288,
               this.UuUVuuUu(class_5134.field_23716, 4.0),
               this.UuUVuuUu(class_5134.field_23721, 3.0),
               this.UuUVuuUu(class_5134.field_23725, 2.0),
               this.UuUVuuUu(class_5134.field_23724, 2.0)
            );
            case "Талисман Раздора" -> this.UuUVuuUu(
               var2,
               class_1802.field_8288,
               this.UuUVuuUu(class_5134.field_23721, 4.0),
               this.UuUVuuUu(class_5134.field_23716, 2.0),
               this.UuUVuuUu(class_5134.field_23719, 0.1),
               this.UuUVuuUu(class_5134.field_23723, 0.1),
               this.UuUVuuUu(class_5134.field_23724, -3.0)
            );
            case "Зелье Ассасина" -> vnVVvun.uVunuUNVVUUV(var2);
            case "Зелье Гнева" -> this.UuUVuuUu(var2, class_1802.field_8436, this.UuUVuuUu(class_5134.field_23721, 5.0)) && vnVVvun.UNnVVNvvnVvU(var2);
            case "Талисман Сара", "Талисман Сары" -> this.UuUVuuUu(var2, class_1802.field_8288, this.UuUVuuUu(class_5134.field_23716, 2.0));
            case "Хлопушка" -> vnVVvun.uNnUnnuNUnNu(var2);
            case "Святая Вода" -> vnVVvun.NnUuNNU(var2);
            case "Зелье Палладина" -> vnVVvun.nNvNUVU(var2);
            case "Зелье Радиации" -> vnVVvun.UnUNuUU(var2);
            case "Снотворное" -> vnVVvun.uUVuVvuNUvnu(var2);
            case "Пласт" -> vnVVvun.NuunnvnN(var2);
            case "Вайт" -> vnVVvun.nVVUuvuNnUN(var2);
            case "Блек" -> vnVVvun.nNnVnUNVV(var2);
            case "Блок дамагер" -> vnVVvun.uUVvnUuNvvN(var2);
            case "Прогрузчик чанков" -> vnVVvun.UUuUnNVNuuv(var2);
            case "Маяк" -> vnVVvun.NVuNUuVnVUN(var2);
            case "Проклятая Душа" -> vnVVvun.NVuunNnvvvVu(var2);
            case "Драконий Скин" -> vnVVvun.vNnNuuvVn(var2);
            case "Огненный Смерч" -> vnVVvun.VUuuVUnun(var2);
            case "Снежок Заморозка" -> vnVVvun.vVVuuVVv(var2);
            case "Божья Аура" -> vnVVvun.VuunNUUUvu(var2);
            case "Серебро" -> vnVVvun.NNUUNUuVNNVn(var2);
            case "Божье Касание", "Божье касание" -> vnVVvun.VvVvnNUnvuvV(var2);
            case "Мощный Удар" -> vnVVvun.ccOO0COcoco0(var2);
            case "Мега Бульдозер" -> vnVVvun.NUVvUUVuVNVv(var2);
            case "Нерушимые Элитры" -> vnVVvun.nNuVunNUVu(var2);
            case "Опыт 15" -> vnVVvun.NVUunUNUN(var2);
            case "Опыт 30" -> vnVVvun.UUVNuUNUvUnV(var2);
            case "Опыт 45" -> vnVVvun.nnuUVNUuvvVU(var2);
            case "Опыт 50" -> vnVVvun.vuvnUnVnUNnV(var2);
            default -> this.uUnuvNvvNU(var1, var2);
         };
      }
   }

   private boolean C00OOC00oO(String var1, class_1799 var2) {
      if (var1 != null && var2 != null && !var2.method_7960()) {
         return switch (var1) {
            case "Вещи Крушителя", "Набор Крушителя" -> this.uNNnnnuuuN(var2);
            case "Броня Крушителя", "Броня Крушителя с шипами", "Броня Крушителя шип", "Броня Крушителя без шипов", "Броня Крушителя без шип" -> this.nuUnNvnuUu(
               var2
            );
            case "Шлем Крушителя" -> this.UuUVuuUu(var1, NnNVvVVn.UuUVuuUu(), var2);
            case "Нагрудник Крушителя" -> this.UuUVuuUu(var1, NnNVvVVn.C00OOC00oO(), var2);
            case "Поножи Крушителя" -> this.UuUVuuUu(var1, NnNVvVVn.uUnuvNvvNU(), var2);
            case "Ботинки Крушителя" -> this.UuUVuuUu(var1, NnNVvVVn.vVvUvVVuuNvV(), var2);
            case "Меч Крушителя" -> this.UuUVuuUu(var1, NnNVvVVn.uNNnnnuuuN(), var2);
            case "Кирка Крушителя" -> this.UuUVuuUu(var1, NnNVvVVn.nuUnNvnuUu(), var2);
            case "Арбалет Крушителя" -> this.UuUVuuUu(var1, NnNVvVVn.VVuuUN(), var2);
            case "Трезубец Крушителя" -> this.UuUVuuUu(var1, NnNVvVVn.vNUvnnVnUvu(), var2);
            case "Булава Крушителя" -> this.UuUVuuUu(var1, NnNVvVVn.uVUuuVnNVU(), var2);
            case "Лук Крушителя" -> this.UuUVuuUu(var2, class_1802.field_8102);
            case "Элитры Крушителя" -> this.UuUVuuUu(var2, class_1802.field_8833);
            case "Удочка Крушителя" -> this.UuUVuuUu(var2, class_1802.field_8378);
            default -> false;
         };
      } else {
         return false;
      }
   }

   private boolean uNNnnnuuuN(class_1799 var1) {
      return this.nuUnNvnuUu(var1)
         || this.UuUVuuUu("Вещи Крушителя", NnNVvVVn.uNNnnnuuuN(), var1)
         || this.UuUVuuUu("Вещи Крушителя", NnNVvVVn.nuUnNvnuUu(), var1)
         || this.UuUVuuUu("Вещи Крушителя", NnNVvVVn.VVuuUN(), var1)
         || this.UuUVuuUu("Вещи Крушителя", NnNVvVVn.vNUvnnVnUvu(), var1)
         || this.UuUVuuUu("Вещи Крушителя", NnNVvVVn.uVUuuVnNVU(), var1);
   }

   private boolean nuUnNvnuUu(class_1799 var1) {
      return this.UuUVuuUu("Броня Крушителя", NnNVvVVn.UuUVuuUu(), var1)
         || this.UuUVuuUu("Броня Крушителя", NnNVvVVn.C00OOC00oO(), var1)
         || this.UuUVuuUu("Броня Крушителя", NnNVvVVn.uUnuvNvvNU(), var1)
         || this.UuUVuuUu("Броня Крушителя", NnNVvVVn.vVvUvVVuuNvV(), var1);
   }

   private boolean UuUVuuUu(String var1, class_1799 var2, class_1799 var3) {
      if (var2 == null || var2.method_7960() || var3 == null || var3.method_7960()) {
         return false;
      } else if (!var3.method_31574(var2.method_7909())) {
         return false;
      } else {
         String var4 = this.NVNnnvnuunNv(var2.method_7964().getString());
         if (!var4.isEmpty() && !this.NVNnnvnuunNv(this.uVUuuVnNVU(var3)).contains(var4)) {
            return false;
         } else {
            class_9304 var5 = (class_9304)var2.method_58694(class_9334.field_49633);
            if (var5 != null && !var5.method_57543() && !this.UuUVuuUu(var1, var3, var5)) {
               return false;
            } else {
               class_9290 var6 = (class_9290)var2.method_58694(class_9334.field_49632);
               if (var6 != null) {
                  String var7 = this.NVNnnvnuunNv(this.uVUuuVnNVU(var3));

                  for (class_2561 var9 : var6.comp_2400()) {
                     String var10 = this.NVNnnvnuunNv(var9.getString());
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

   private boolean UuUVuuUu(String var1, class_1799 var2, class_9304 var3) {
      class_9304 var4 = (class_9304)var2.method_58694(class_9334.field_49633);

      for (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var6 : var3.method_57539()) {
         String var7 = this.UuUVuuUu((class_6880<class_1887>)var6.getKey());
         if (var7.isBlank() || C00OOC00oO(var1, var7)) {
            if (var4 == null || var4.method_57543()) {
               return false;
            }

            if (this.UuUVuuUu(var4, (class_6880<class_1887>)var6.getKey()) < var6.getIntValue()) {
               return false;
            }
         }
      }

      return true;
   }

   private String UuUVuuUu(class_6880<class_1887> var1) {
      return var1.method_40230().map(var0 -> vNnnVNUVU.uNNnnnuuuN(var0.method_29177().toString())).orElse("");
   }

   private int UuUVuuUu(class_9304 var1, class_6880<class_1887> var2) {
      for (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry var4 : var1.method_57539()) {
         if (((class_6880)var4.getKey()).equals(var2)) {
            return var4.getIntValue();
         }
      }

      return 0;
   }

   private boolean VVuuUN(class_1799 var1) {
      return this.UuUVuuUu(var1, class_1802.field_8102) || this.UuUVuuUu(var1, class_1802.field_8833) || this.UuUVuuUu(var1, class_1802.field_8378);
   }

   private boolean UuUVuuUu(class_1799 var1, class_1792 var2) {
      return var1 != null && !var1.method_7960() && var1.method_31574(var2) ? this.UuUVuuUu(var1, "крушител") && this.vNUvnnVnUvu(var1) : false;
   }

   private boolean UuUVuuUu(class_1799 var1, String var2) {
      return this.NVNnnvnuunNv(this.uVUuuVnNVU(var1)).contains(this.NVNnnvnuunNv(var2));
   }

   private boolean vNUvnnVnUvu(class_1799 var1) {
      return var1.method_7942()
         || var1.method_7958()
         || var1.method_57826(class_9334.field_49631)
         || var1.method_57826(class_9334.field_49632)
         || var1.method_57826(class_9334.field_49628);
   }

   private String uVUuuVnNVU(class_1799 var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(var1.method_7964().getString()).append(' ');
      class_9290 var3 = (class_9290)var1.method_58694(class_9334.field_49632);
      if (var3 != null) {
         for (class_2561 var5 : var3.comp_2400()) {
            var2.append(var5.getString()).append(' ');
         }
      }

      var2.append(var1.method_57353());
      return var2.toString();
   }

   private String vuuuNvNuv(class_1799 var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append(var1.method_7964().getString()).append(' ');
      class_9290 var3 = (class_9290)var1.method_58694(class_9334.field_49632);
      if (var3 != null) {
         for (class_2561 var5 : var3.comp_2400()) {
            var2.append(var5.getString()).append(' ');
         }
      }

      return var2.toString();
   }

   private String NVNnnvnuunNv(String var1) {
      return var1 == null ? "" : var1.replaceAll("(?i)§[0-9A-FK-OR]", "").toLowerCase(Locale.ROOT).replaceAll("[^\\p{L}\\p{N}]+", "");
   }

   private boolean UuUVuuUu(class_1799 var1, class_1792 var2, AutoBuy.NVnVnNnN... var3) {
      if (var1 != null && !var1.method_7960() && var1.method_31574(var2)) {
         class_9285 var4 = (class_9285)var1.method_58694(class_9334.field_49636);
         if (var4 == null) {
            return var3.length == 0;
         } else {
            HashMap var5 = new HashMap();
            int var6 = 0;

            for (class_9287 var8 : var4.comp_2393()) {
               class_1322 var9 = var8.comp_2396();
               var6++;
               var5.put(var8.comp_2395(), var9.comp_2449());
            }

            if (var6 == var3.length && var5.size() == var3.length) {
               for (AutoBuy.NVnVnNnN var10 : var3) {
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

   private AutoBuy.NVnVnNnN UuUVuuUu(class_6880<class_1320> var1, double var2) {
      return new AutoBuy.NVnVnNnN(var1, var2);
   }

   private boolean uUnuvNvvNU(String var1, class_1799 var2) {
      if (var1 != null && var2 != null && !var2.method_7960()) {
         if (var1.startsWith("minecraft:") || !var1.contains(":") && class_2960.method_12829("minecraft:" + var1) != null) {
            class_2960 var7 = class_2960.method_12829(var1.contains(":") ? var1 : "minecraft:" + var1);
            if (var7 != null) {
               class_1792 var4 = (class_1792)class_7923.field_41178.method_63535(var7);
               if (var4 != class_1802.field_8162 && var2.method_31574(var4)) {
                  String var5 = var4.method_7854().method_7964().getString();
                  String var6 = var2.method_7964().getString();
                  return var6.equalsIgnoreCase(var5) || this.uVunuUNVVUUV(var6).equals(this.uVunuUNVVUUV(var5));
               }
            }

            return false;
         } else {
            String var3 = var2.method_7964().getString();
            return var3.equalsIgnoreCase(var1) || this.uVunuUNVVUUV(var3).equals(this.uVunuUNVVUUV(var1));
         }
      } else {
         return false;
      }
   }

   String uVunuUNVVUUV(String var1) {
      return var1 == null ? "" : var1.toLowerCase(Locale.ROOT).replaceAll("[^\\p{L}\\p{N}]+", "");
   }

   private AutoBuy.VvunVVUvUNnv VVuuUN(class_1735 var1) {
      if (var1 != null && var1.method_7681()) {
         class_9290 var2 = (class_9290)var1.method_7677().method_58694(class_9334.field_49632);
         if (var2 == null) {
            return new AutoBuy.VvunVVUvUNnv(0L, null);
         } else {
            long var3 = 0L;
            String var5 = null;

            for (class_2561 var7 : var2.comp_2400()) {
               String var8 = this.uNnUnnuNUnNu(var7.getString());
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
                  var3 = this.UNnVVNvvnVvU(var8);
               }
            }

            return new AutoBuy.VvunVVUvUNnv(var3, var5);
         }
      } else {
         return new AutoBuy.VvunVVUvUNnv(0L, null);
      }
   }

   private String vNUvnnVnUvu(class_1735 var1) {
      if (var1 != null && var1.method_7681()) {
         class_9290 var2 = (class_9290)var1.method_7677().method_58694(class_9334.field_49632);
         if (var2 == null) {
            return null;
         } else {
            for (class_2561 var4 : var2.comp_2400()) {
               String var5 = this.uNnUnnuNUnNu(var4.getString());
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

   private long uVUuuVnNVU(class_1735 var1) {
      if (var1 != null && var1.method_7681()) {
         class_9290 var2 = (class_9290)var1.method_7677().method_58694(class_9334.field_49632);
         if (var2 == null) {
            return 0L;
         } else {
            for (class_2561 var4 : var2.comp_2400()) {
               String var5 = this.uNnUnnuNUnNu(var4.getString());
               String var6 = var5.toLowerCase(Locale.ROOT);
               if (var5.contains("$") || var5.contains("¤") || var6.contains("цена") || var6.contains("стоимость")) {
                  long var7 = this.UNnVVNvvnVvU(var5);
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

   private long UNnVVNvvnVvU(String var1) {
      if (var1 == null) {
         return 0L;
      } else {
         String var2 = var1.replace(' ', ' ').toLowerCase(Locale.ROOT).trim();
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

   private String uNnUnnuNUnNu(String var1) {
      return var1 == null ? "" : var1.replaceAll("§.", "").replace(' ', ' ').trim();
   }

   private String UuUVuuUu(class_1735 var1, String var2) {
      return switch (var2) {
         case "FunTime" -> UNuvuNVuUnVu.UuUVuuUu(var1);
         case "SpookyTime" -> NunUnvNuvNUU.UuUVuuUu(var1);
         case "HolyWorld" -> this.vNUvnnVnUvu(var1);
         default -> null;
      };
   }

   private long C00OOC00oO(class_1735 var1, String var2) {
      return switch (var2) {
         case "FunTime" -> UNuvuNVuUnVu.C00OOC00oO(var1);
         case "SpookyTime" -> NunUnvNuvNUU.C00OOC00oO(var1);
         case "HolyWorld" -> this.uVUuuVnNVU(var1);
         default -> 0L;
      };
   }

   private void NnUuNNU(String var1) {
      if (var1.contains("Вы успешно купили")) {
         this.nNvNUVU(var1);
      } else {
         this.UnUNuUU(var1);
      }
   }

   private void nNvNUVU(String var1) {
      String var2 = "Вы успешно купили ";
      String var3 = " за ";
      int var4 = var1.indexOf(var2);
      int var5 = var1.indexOf(var3);
      if (var4 != -1 && var5 != -1) {
         String var6 = var1.substring(var4 + var2.length(), var5).replace(' ', ' ').trim();
         String var7 = var1.substring(var5 + var3.length()).replaceAll("[^\\d]", "").trim();
         if (!var7.isEmpty()) {
            this.UuUVuuUu(var6, Long.parseLong(var7));
         }
      }
   }

   private void UnUNuUU(String var1) {
      Matcher var2 = NVNnnvVnvV.matcher(this.uNnUnnuNUnNu(var1));
      if (var2.find()) {
         String var3 = var2.group(1) != null ? var2.group(1) : var2.group(2);
         if (var3 != null && !var3.isBlank()) {
            String var4 = var2.group(3);
            String var5 = var2.group(5);
            String var6 = var5 == null ? "" : var5.replaceAll("[^\\d]", "");
            if (!var6.isEmpty()) {
               long var7 = Long.parseLong(var6);
               String var9 = this.uUVuVvuNUvnu(var3);
               if (var4 != null && !var4.isBlank()) {
                  var9 = var9 + " x" + var4.replaceAll("[^\\d]", "");
               }

               this.UuUVuuUu(var9, var7);
            }
         }
      }
   }

   private String uUVuVvuNUvnu(String var1) {
      String var2 = this.uNnUnnuNUnNu(var1).replace(' ', ' ').replaceAll("^[\\s\\-–—:]+", "").replaceAll("[\\s\\-–—:]+$", "").trim();
      var2 = vNnnVNUVU.VVuuUN(var2);
      vNnnVNUVU.nvUnvV var3 = vNnnVNUVU.uUnuvNvvNU(var2);
      return var3 == null ? var2 : var3.label();
   }

   private void UuUVuuUu(String var1, long var2) {
      int var4 = 1;
      String var5 = var1;
      if (var1.matches("(?i)^[xхXХ]?\\d+[xхXХ]?\\s+.*")) {
         String[] var6 = var1.split("\\s+", 2);
         String var7 = var6[0].replaceAll("[^\\d]", "");
         if (!var7.isEmpty()) {
            var4 = Integer.parseInt(var7);
         }

         var5 = var6[1].trim();
      } else if (var1.matches("(?i).*\\s+[xхXХ]?\\d+[xхXХ]?$")) {
         int var8 = var1.lastIndexOf(32);
         String var9 = var1.substring(var8 + 1).replaceAll("[^\\d]", "");
         if (!var9.isEmpty()) {
            var4 = Integer.parseInt(var9);
         }

         var5 = var1.substring(0, var8).trim();
      }

      vVVuuVVv.add(0, new AutoBuy.VUnuUnnuNvVu(var1, var5, var4, var2, System.currentTimeMillis()));
      if (vVVuuVVv.size() > 200) {
         vVVuuVVv.remove(vVVuuVVv.size() - 1);
      }

      if (ClientUtil.NVNnnvnuunNv.uUnuvNvvNU()) {
         uvNnnnUuVu.UuUVuuUu("[AutoBuy] Успешно куплено: " + var1 + " за " + var2);
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      boolean var2 = this.nNvNUVU.uUnuvNvvNU() || this.vnuNNVvVVuN || this.UvuVvvVuUuuu;
      if (this.nuUnNvnuUu || var2) {
         if (this.nuUnNvnuUu && !var1.uUnuvNvvNU()) {
            if (var1.vVvUvVVuuNvV() instanceof class_2649 var3) {
               this.VnuUuUVUnnNn.C00OOC00oO(var3.comp_3837());
            } else if (var1.vVvUvVVuuNvV() instanceof class_2653 var4) {
               this.VnuUuUVUnnNn.uUnuvNvvNU(var4.method_11452());
            } else if (var1.vVvUvVVuuNvV() instanceof class_3944 var5) {
               this.VnuUuUVUnnNn.vVvUvVVuuNvV(var5.method_17592());
            }
         }

         if (var1.vVvUvVVuuNvV() instanceof class_7439 var11) {
            String var13 = var11.comp_763().getString();
            if (var2 && this.nNnVnUNVV(var13)) {
               return;
            }

            if (!this.nuUnNvnuUu) {
               return;
            }

            if (var13.contains("Вы успешно купили") || var13.contains("Вы купили")) {
               long var14 = this.VuNNvnVVUUn;
               boolean var7 = this.unnUnUNVnN()
                  || (this.NnUuNNU.C00OOC00oO("FunTime") || this.NnUuNNU.C00OOC00oO("SpookyTime"))
                     && var14 != 0L
                     && System.currentTimeMillis() - var14 <= 15000L;
               this.VuNNvnVVUUn = 0L;
               this.VnuUuUVUnnNn.uUnuvNvvNU();
               this.UnUUVuVunvVu();
               if (!var7) {
                  return;
               }

               boolean var8 = AutoSell.NVNnnvnuunNv != null && AutoSell.NVNnnvnuunNv.nuUnNvnuUu && AutoSell.NVNnnvnuunNv.UuuNnUvUuv();
               if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1755 != null) {
                  uUnuvNvvNU.field_1724.method_3137();
               }

               try {
                  this.NnUuNNU(var13);
               } catch (Exception var10) {
               }

               if (this.NnUuNNU.C00OOC00oO("HolyWorld")) {
                  this.uUnuvNvvNU(var8);
               } else {
                  NVUUNNv.uUnuvNvvNU(var8);
               }
            } else if (var13.contains("Не удалось выставить") && var13.contains("освободите хранилище")) {
               NVUUNNv.nvUVNnuu();
               if (!this.VnVuuvVvnNv()) {
                  AutoSell.vNVuvnUUnuUn();
                  vVnvuVVUunuv.UuUVuuUu("§c[AutoBuy] Хранилище заполнено. Продажа приостановлена.");
                  NVUUNNv.vVvUvVVuuNvV(true);
               }
            } else if (this.vuvnUnVnUNnV(var13)) {
               NVUUNNv.UuuNnUvUuv();
               vVnvuVVUunuv.UuUVuuUu("§a[AutoBuy] Товар продан! Хранилище освободилось.");
               if (!this.VnVuuvVvnNv()) {
                  NVUUNNv.vVvUvVVuuNvV(true);
               }
            } else if (this.NnUuNNU.C00OOC00oO("FunTime") && !uVunuUNVVUUV && !UNnVVNvvnVvU && this.c0oOOCcCoC0(var13)) {
               this.NuunnvnN(var13);
            } else if ((this.NnUuNNU.C00OOC00oO("HolyWorld") || this.NnUuNNU.C00OOC00oO("FunTime"))
               && !uVunuUNVVUUV
               && !UNnVVNvvnVvU
               && this.VVnVNnunVvu(var13)) {
               this.unNNVVNnvvV(var13);
            } else if (this.nnuUVNUuvvVU(var13)) {
               this.UnUUVuVunvVu();
               this.VuNNvnVVUUn = 0L;
               if (uUnuvNvvNU.field_1724 != null) {
                  if (uUnuvNvvNU.field_1755 != null) {
                     uUnuvNvvNU.field_1724.method_3137();
                  }

                  this.UuUVuuUu(500L, true);
               }
            } else if (var13.contains("Предмет уже продан") || var13.contains("уже купили") || var13.contains("Недостаточно")) {
               this.UnUUVuVunvVu();
               this.VuNNvnVVUUn = 0L;
               vVnvuVVUunuv.UuUVuuUu("§c[AutoBuy] §fНе удалось купить! (Предмет продан или ошибка)");
               this.UuUVuuUu(500L, true);
            } else if (var13.contains("Такого предмета Не существует")) {
               if (this.vnuNNVvVVuN) {
                  this.vnuNNVvVVuN = false;
                  this.uNUnUuUnvnnU++;
                  this.VnnnvUunNvuu.UuUVuuUu();
                  vVnvuVVUunuv.UuUVuuUu("§e[AutoParse] §fПредмет не существует на сервере, скип.");
               }
            } else if (var13.contains("выставлен на продажу за")) {
               NVUUNNv.vuuuNvNuv();
               if (AutoSell.NVNnnvnuunNv == null || !AutoSell.NVNnnvnuunNv.nuUnNvnuUu) {
                  NVUUNNv.UuUVuuUu(true);
               }
            } else if (this.NnUuNNU.C00OOC00oO("FunTime") && var13.contains("Вы уже подключены к этому серверу")) {
               this.VvVuvUvvNNVv();
            } else if (this.NnUuNNU.C00OOC00oO("FunTime") && this.nVVUuvuNnUN(var13)) {
               this.VvVuvUvvNNVv();
            } else if (this.NnUuNNU.C00OOC00oO("FunTime")
               && (var13.contains("Недопустимо нажимать в режиме AFK") || var13.contains("Данная команда недоступна в режиме AFK"))) {
               this.vuvvuVuVv();
            }
         }
      }
   }

   private int VvVuvUvvNNVv() {
      return this.nuUnNvnuUu(true);
   }

   private int nuUnNvnuUu(boolean var1) {
      if (uUnuvNvvNU.field_1724 != null && this.NnUuNNU.C00OOC00oO("FunTime")) {
         int var2 = this.NnUVNnuvUv();
         int var3 = var2 != -1 ? var2 : this.nUununvNvvn;

         int var4;
         do {
            var4 = ThreadLocalRandom.current().nextInt(901, 904);
         } while (var4 == var3);

         this.nUununvNvvn = var4;
         this.VnuUuUVUnnNn.uUnuvNvvNU();
         if (uUnuvNvvNU.field_1755 != null) {
            uUnuvNvvNU.field_1724.method_3137();
         }

         uUnuvNvvNU.field_1724.field_3944.method_45730("an" + var4);
         this.CC0COO.UuUVuuUu();
         if (var1) {
            this.vuNunNnvnunv++;
            if (this.vuNunNnvnunv > 3) {
               this.vuNunNnvnunv = 0;
               this.VunnVNvNV();
            } else {
               this.UvUvUNuvNU(String.valueOf(var4));
            }
         }

         return var4;
      } else {
         return -1;
      }
   }

   private long UnnNNvuvvUU() {
      if (this.vuvnnvuNVvu == 0) {
         return ThreadLocalRandom.current().nextLong(9000L, 12000L);
      } else {
         return this.vuvnnvuNVvu < 5 ? ThreadLocalRandom.current().nextLong(1200L, 2200L) : ThreadLocalRandom.current().nextLong(3000L, 4500L);
      }
   }

   private long VNNnnVUuvv() {
      return ThreadLocalRandom.current().nextLong(2000L, 4501L);
   }

   private long vUvUvUNNuNvn() {
      return ThreadLocalRandom.current().nextLong(600L, 1401L);
   }

   private void UvUvUNuvNU(String var1) {
      this.UnUUVuVunvVu();
      this.VnuUuUVUnnNn.uUnuvNvvNU();
      this.NUuVnnuUnvu = var1 == null ? "" : var1;
      this.NuvunVvnnN = true;
      this.vuvnnvuNVvu = 0;
      this.NuUuUvUUvU = System.currentTimeMillis();
      this.VUVvNvvVUN = System.currentTimeMillis() + this.VNNnnVUuvv();
      this.uNUnuUUvvuU = false;
      this.vvVVVvVNVVVN = false;
      this.vunuUUVVUv = -1;
      this.uuuNUnuvvNNv = 0L;
      this.UVVNUnVnNV = false;
      this.vnUUvvnUVUu = 0L;
      this.uNnNUNvuVnu.UuUVuuUu();
   }

   void UnUNuUU() {
      this.UuUVuuUu(0L, false);
   }

   private void C00OOC00oO(long var1) {
      this.UuUVuuUu(var1, false);
   }

   private void UuUVuuUu(long var1, boolean var3) {
      if (uUnuvNvvNU.field_1724 != null) {
         this.UnUUVuVunvVu();
         this.VnuUuUVUnnNn.uUnuvNvvNU();
         this.vunuUUVVUv = this.nNunUnVN();
         if (var3 && uUnuvNvvNU.field_1755 != null) {
            uUnuvNvvNU.field_1724.method_3137();
         }

         this.NuvunVvnnN = true;
         this.vuvnnvuNVvu = 0;
         this.NUuVnnuUnvu = "";
         this.NuUuUvUUvU = System.currentTimeMillis();
         this.VUVvNvvVUN = System.currentTimeMillis() + Math.max(0L, var1);
         this.uNUnuUUvvuU = var3;
         this.vvVVVvVNVVVN = false;
         this.uuuNUnuvvNNv = this.VUVvNvvVUN + this.vUvUvUNNuNvn();
         this.UVVNUnVnNV = false;
         this.vnUUvvnUVUu = 0L;
         this.uNnNUNvuVnu.UuUVuuUu();
      }
   }

   private boolean uuVuUuuVVNvN() {
      if (!this.uNUnuUUvvuU && uUnuvNvvNU.field_1755 instanceof class_476 var1 && this.VVuuUN(var1)) {
         this.NuvunVvnnN = false;
         this.vuvnnvuNVvu = 0;
         this.NUuVnnuUnvu = "";
         this.NuUuUvUUvU = 0L;
         this.VUVvNvvVUN = 0L;
         this.vvVVVvVNVVVN = false;
         this.vunuUUVVUv = -1;
         this.uuuNUnuvvNNv = 0L;
         this.NNnvvunuVNUn.UuUVuuUu();
         return false;
      } else if (!this.VvuUUUNNNv()) {
         return true;
      } else if (System.currentTimeMillis() < this.VUVvNvvVUN) {
         return true;
      } else {
         if (this.vuvnnvuNVvu == 0 || this.uNnNUNvuVnu.uNNnnnuuuN(this.UnnNNvuvvUU())) {
            if (this.uNUnuUUvvuU && uUnuvNvvNU.field_1755 != null) {
               uUnuvNvvNU.field_1724.method_3137();
            }

            uUnuvNvvNU.field_1724.field_3944.method_45730("ah");
            this.vuvnnvuNVvu++;
            this.uNUnuUUvvuU = false;
            this.uuuNUnuvvNNv = System.currentTimeMillis() + this.vUvUvUNNuNvn();
            this.uNnNUNvuVnu.UuUVuuUu();
         }

         return true;
      }
   }

   private boolean VvuUUUNNNv() {
      if (this.NUuVnnuUnvu.isEmpty()) {
         return true;
      } else {
         String var1 = this.UuuuNNunN();
         long var2 = System.currentTimeMillis() - this.NuUuUvUUvU;
         boolean var4 = this.NUuVnnuUnvu.equals(var1) && var2 >= 2500L;
         if (!var4 && !this.vvVVVvVNVVVN && var2 >= 4500L && uUnuvNvvNU.field_1724 != null) {
            uUnuvNvvNU.field_1724.field_3944.method_45730("an" + this.NUuVnnuUnvu);
            this.vvVVVvVNVVVN = true;
            this.NuUuUvUUvU = System.currentTimeMillis();
            return false;
         } else {
            var2 = System.currentTimeMillis() - this.NuUuUvUUvU;
            if (!var4 && var2 < 12000L) {
               return false;
            } else {
               this.NUuVnnuUnvu = "";
               this.vvVVVvVNVVVN = false;
               return true;
            }
         }
      }
   }

   private boolean uuuVnuvnnNnU() {
      if (uUnuvNvvNU.field_1724 != null && !uVunuUNVVUUV && !UNnVVNvvnVvU && !this.NVvnvnn && !this.nNvNUVU.uUnuvNvvNU() && !this.vnuNNVvVVuN) {
         class_437 var1 = uUnuvNvvNU.field_1755;
         if (!(var1 instanceof o00Co0coo0o) && !(var1 instanceof nuUnNNVUUnU)) {
            if (var1 instanceof class_476 var2) {
               if (this.uUnuvNvvNU(var2)) {
                  this.NNnvvunuVNUn.UuUVuuUu();
                  return false;
               }

               if (this.vVvUvVVuuNvV(var2)) {
                  this.NNnvvunuVNUn.UuUVuuUu();
                  return false;
               }
            }

            if (!this.NNnvvunuVNUn.uNNnnnuuuN(750L)) {
               return false;
            } else {
               this.UuUVuuUu(0L, true);
               this.NNnvvunuVNUn.UuUVuuUu();
               return true;
            }
         } else {
            this.NNnvvunuVNUn.UuUVuuUu();
            return false;
         }
      } else {
         this.NNnvvunuVNUn.UuUVuuUu();
         return false;
      }
   }

   private boolean VVuuUN(class_476 var1) {
      if (!this.vVvUvVVuuNvV(var1)) {
         return false;
      } else if (System.currentTimeMillis() < this.uuuNUnuvvNNv) {
         return false;
      } else {
         int var2 = ((class_1707)var1.method_17577()).field_7763;
         return this.vunuUUVVUv == -1 || var2 != this.vunuUUVVUv;
      }
   }

   private int nNunUnVN() {
      return uUnuvNvvNU.field_1755 instanceof class_476 var1 && this.vVvUvVVuuNvV(var1) ? ((class_1707)var1.method_17577()).field_7763 : -1;
   }

   private boolean c0oOOCcCoC0(String var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = var1.replaceAll("§.", "").toLowerCase(Locale.ROOT);
         return var2.contains("после входа на режим") && var2.contains("аукцион") && nNuVunNUVu.matcher(var1).find();
      }
   }

   private boolean VVnVNnunVvu(String var1) {
      return var1 == null ? false : UNvvunVVn.matcher(this.uNnUnnuNUnNu(var1).toLowerCase(Locale.ROOT)).find();
   }

   private void unNNVVNnvvV(String var1) {
      long var2 = this.UUVNuUNUvUnV(var1);
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1755 != null) {
         uUnuvNvvNU.field_1724.method_3137();
      }

      this.UuUVuuUu(var2, true);
   }

   private void NuunnvnN(String var1) {
      long var2 = this.NVUunUNUN(var1);
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1755 != null) {
         uUnuvNvvNU.field_1724.method_3137();
      }

      if (this.nNvNUVU.uUnuvNvvNU()) {
         this.vnuNNVvVVuN = false;
         this.NunUUVVVuu = System.currentTimeMillis() + var2;
         this.VnnnvUunNvuu.UuUVuuUu();
         this.VuuUVVu.UuUVuuUu();
      } else {
         this.C00OOC00oO(var2);
      }
   }

   private long NVUunUNUN(String var1) {
      Matcher var2 = nNuVunNUVu.matcher(var1 == null ? "" : var1);
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

   private long UUVNuUNUvUnV(String var1) {
      Matcher var2 = UNvvunVVn.matcher(this.uNnUnnuNUnNu(var1).toLowerCase(Locale.ROOT));
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

   private boolean VnVuuvVvnNv() {
      return AutoSell.NVNnnvnuunNv != null
         && AutoSell.NVNnnvnuunNv.nuUnNvnuUu
         && AutoSell.NVNnnvnuunNv.UuuNnUvUuv()
         && AutoSell.NVNnnvnuunNv.nUUVuvU();
   }

   private boolean vuvnUnVnUNnV(String var1) {
      if (var1 == null) {
         return false;
      } else if (var1.contains("У Вас купили") && var1.contains("на /ah")) {
         return true;
      } else {
         String var2 = this.uNnUnnuNUnNu(var1).toLowerCase(Locale.ROOT);
         return var2.contains("купил у вас") && var2.contains(" за ") && (var2.contains("¤") || var2.contains("$"));
      }
   }

   private void vuvvuVuVv() {
      if (uUnuvNvvNU.field_1724 != null && this.NnUuNNU.C00OOC00oO("FunTime")) {
         String var1 = this.UuuuNNunN();
         if ("N/A".equals(var1) && !this.vUvVUNnN.isEmpty()) {
            var1 = this.vUvVUNnN;
         }

         if ("N/A".equals(var1) && this.nUununvNvvn != -1) {
            var1 = String.valueOf(this.nUununvNvvn);
         }

         if (!"N/A".equals(var1)) {
            this.vUvVUNnN = var1;
            uUnuvNvvNU.field_1724.field_3944.method_45730("hub");
            this.NVvnvnn = true;
            this.nUNnuUNnV.UuUVuuUu();
            vVnvuVVUunuv.UuUVuuUu("§e[AutoBuy] §fAFK заблокировал команду. Переподключаемся через /hub -> /an" + this.vUvVUNnN + "...");
         }
      }
   }

   private void uunNUuunVU() {
      if (this.NnUuNNU.C00OOC00oO("FunTime")) {
         int var1 = this.NnUVNnuvUv();
         if (var1 != -1) {
            this.nUununvNvvn = var1;
            this.NuUvUNN = false;
            this.uvVuuuvvVU.UuUVuuUu();
         }
      }
   }

   private boolean NvnuuuvnVV() {
      if (uUnuvNvvNU.field_1724 != null && !this.NuvunVvnnN && !this.NVvnvnn && this.nUununvNvvn != -1 && !this.NuUvUNN) {
         if (this.NnUVNnuvUv() != -1) {
            return false;
         } else if (!this.uvVuuuvvVU.uNNnnnuuuN(2500L)) {
            return false;
         } else {
            uUnuvNvvNU.field_1724.field_3944.method_45730("an" + this.nUununvNvvn);
            this.NuUvUNN = true;
            this.UvUvUNuvNU(String.valueOf(this.nUununvNvvn));
            vVnvuVVUunuv.UuUVuuUu("§e[AutoBuy] §fПохоже, нас выкинуло в хаб. Повторно заходим на " + this.nUununvNvvn + "...");
            return true;
         }
      } else {
         return false;
      }
   }

   private int NnUVNnuvUv() {
      String var1 = this.UuuuNNunN();
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

   private String UuuuNNunN() {
      try {
         vnvuUUVun.UuUVuuUu.UuUVuuUu();
         String var1 = vnvuUUVun.UuUVuuUu.uUnuvNvvNU();
         return var1 != null && !var1.isEmpty() ? var1 : "N/A";
      } catch (Exception var2) {
         return "N/A";
      }
   }

   private boolean nnuUVNUuvvVU(String var1) {
      if (var1 == null) {
         return false;
      } else if (var1.contains("Этот товар уже Купили!")) {
         return true;
      } else if (!this.NnUuNNU.C00OOC00oO("FunTime")) {
         return false;
      } else {
         String var2 = var1.toLowerCase(Locale.ROOT);
         return var2.contains("ошибка! этот товар уже купили") || var2.contains("ошибка") && var2.contains("товар уже купили");
      }
   }

   private boolean nVVUuvuNnUN(String var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = var1.replaceAll("§.", "").toLowerCase(Locale.ROOT);
         return var2.contains("были кикнуты при подключении") && var2.contains("сервер заполнен");
      }
   }

   public void uUVuVvuNUvnu() {
      if (this.nNvNUVU.uUnuvNvvNU()) {
         this.NNVNuUvVn();
      } else {
         if (this.uNNnnnuuuN(false) && !this.nuUnNvnuUu) {
            this.uuvvuNvuUNVV();
         }
      }
   }

   private void NNVNuUvVn() {
      this.nNvNUVU.C00OOC00oO(false);
      this.vnuNNVvVVuN = false;
      this.uNUnUuUnvnnU = 0;
      this.OoccOc0CO = false;
      this.UvuVvvVuUuuu = false;
      this.NUUVUvvuNNVU = "";
      this.UvvNuvUNNNUv = 0L;
      this.NunUUVVVuu = 0L;
      this.VnnnvUunNvuu.UuUVuuUu();
      this.VuuUVVu.UuUVuuUu();
      this.UvNNVUVNVuvV();
      this.uVvunVUNuUvu();
   }

   private void vuNnuUnu() {
      if (!this.nNvNUVU.uUnuvNvvNU()) {
         this.uVvunVUNuUvu();
      } else if (!this.OoccOc0CO && !this.uNNnnnuuuN(false)) {
         this.uVvunVUNuUvu();
      } else {
         if (!this.Oco0Oococc.isEmpty()) {
            this.nNvNUVU();
         }
      }
   }

   private boolean nNnVnUNVV(String var1) {
      if (var1 == null) {
         return false;
      } else if (this.NnUuNNU.C00OOC00oO("FunTime") && this.c0oOOCcCoC0(var1)) {
         this.NuunnvnN(var1);
         return true;
      } else if (var1.contains("Такого предмета Не существует") && this.vnuNNVvVVuN) {
         this.vnuNNVvVVuN = false;
         this.uNUnUuUnvnnU++;
         this.VnnnvUunNvuu.UuUVuuUu();
         vVnvuVVUunuv.UuUVuuUu("§e[AutoParse] §fПредмет не существует на сервере, скип.");
         return true;
      } else {
         return false;
      }
   }

   private void uuvvuNvuUNVV() {
      if (!this.nuUnNvnuUu) {
         NUvnVVNvvu.UuUVuuUu(this);
      }
   }

   private void uVvunVUNuUvu() {
      if (!this.nuUnNvnuUu) {
         NUvnVVNvvu.C00OOC00oO(this);
      }
   }

   record NVnVnNnN(class_6880<class_1320> attribute, double value) {
   }

   record VUUnVnVNNU(long lotPrice, long estimatedValue, long profit, int fingerprint, boolean buyable) {
   }

   public static class VUnuUnnuNvVu {
      public String UuUVuuUu;
      public String C00OOC00oO;
      public int uUnuvNvvNU;
      public long vVvUvVVuuNvV;
      public long uNNnnnuuuN;

      public VUnuUnnuNvVu(String var1, String var2, int var3, long var4, long var6) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var6;
      }
   }

   record VvunVVUvUNnv(long price, String seller) {
   }

   record nvUnvV(long unitPrice, long lotPrice, int count) {
   }

   record nvnNNunvv(String itemName, long maxPrice, vNnnVNUVU.nvUnvV holyWorldEntry, class_1792 item, String normalizedName) {
   }

   final class uunvUUVnuNn {
      private final class_1799 C00OOC00oO;
      private String uUnuvNvvNU;
      private String vVvUvVVuuNvV;
      private String uNNnnnuuuN;
      private String nuUnNvnuUu;
      private class_2960 VVuuUN;

      uunvUUVnuNn(class_1799 var2) {
         this.C00OOC00oO = var2;
      }

      String UuUVuuUu() {
         if (this.uUnuvNvvNU == null) {
            this.uUnuvNvvNU = vNnnVNUVU.uNNnnnuuuN(this.C00OOC00oO);
         }

         return this.uUnuvNvvNU;
      }

      String C00OOC00oO() {
         if (this.vVvUvVVuuNvV == null) {
            this.vVvUvVVuuNvV = vNnnVNUVU.nuUnNvnuUu(this.C00OOC00oO);
         }

         return this.vVvUvVVuuNvV;
      }

      String uUnuvNvvNU() {
         if (this.uNNnnnuuuN == null) {
            this.uNNnnnuuuN = this.C00OOC00oO.method_7964().getString();
         }

         return this.uNNnnnuuuN;
      }

      String vVvUvVVuuNvV() {
         if (this.nuUnNvnuUu == null) {
            this.nuUnNvnuUu = AutoBuy.this.uVunuUNVVUUV(this.uUnuvNvvNU());
         }

         return this.nuUnNvnuUu;
      }

      class_2960 uNNnnnuuuN() {
         if (this.VVuuUN == null) {
            this.VVuuUN = class_7923.field_41178.method_10221(this.C00OOC00oO.method_7909());
         }

         return this.VVuuUN;
      }
   }
}
