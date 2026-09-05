package ru.metaculture.protection;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;

public final class NVunNNNNuN extends class_437 {
   private static volatile boolean UuUVuuUu;
   private static final String C00OOC00oO = "panel";
   private static final String uUnuvNvvNU = "header";
   private static final String vVvUvVVuuNvV = "modules";
   private static final String uNNnnnuuuN = "binds";
   private static final String nuUnNvnuUu = "content";
   private static final String VVuuUN = "title";
   private static final String vNUvnnVnUvu = "icon";
   private static final String uVUuuVnNVU = "slots";
   private static final String vuuuNvNuv = "panelRadius";
   private static final String nvUVNnuu = "headerRadius";
   private static final String UuuNnUvUuv = "contentRadius";
   private static final String nUUVuvU = "modulesRadius";
   private static final String UnUNVVVNuv = "bindsRadius";
   private static final String vNVuvnUUnuUn = "rowRadius";
   private static final String UvnvNVnnnnNU = "slotRadius";
   private static final String uVUVnuvnuVuv = "padding";
   private static final String NVNnnvnuunNv = "gap";
   private static final String uVunuUNVVUUV = "headerHeight";
   private static final String UNnVVNvvnVvU = "rowHeight";
   private static final String uNnUnnuNUnNu = "titleSize";
   private static final String NnUuNNU = "iconSize";
   private static final String nNvNUVU = "bindWidth";
   private static final String UnUNuUU = "accentWidth";
   private static final String uUVuVvuNUvnu = "reset";
   private static final String UvUvUNuvNU = "centerX";
   private static final String c0oOOCcCoC0 = "centerY";
   private static final String VVnVNnunVvu = "presetSoft";
   private static final String unNNVVNnvvV = "presetCompact";
   private static final String NuunnvnN = "presetSharp";
   private static final String NVUunUNUN = "CORNERS";
   private static final String UUVNuUNUvUnV = "SPACING";
   private static final String vuvnUnVnUNnV = "SIZE";
   private static final String nnuUVNUuvvVU = "TYPOGRAPHY";
   private static final String nVVUuvuNnUN = "ACTIONS";
   private static final String nNnVnUNVV = "PRESETS";
   private static final String nuunNvv = "drag surface  ·  resize corner";
   private static final String[] uUVVvVVNvvn = new String[]{"panel", "header", "modules", "binds", "content", "title", "icon"};
   private static final String[] vvUVNVvvNUv = new String[]{"panel", "header", "content", "slots", "title", "icon"};
   private static final String[] UuNnnVnuNNV = new String[]{"panel", "content", "slots"};
   private static final String[] uUVvnUuNvvN = new String[]{"panel", "content", "modules"};
   private static final String[] UUuUnNVNuuv = new String[]{"panel", "content", "modules", "slots"};
   private static final String[] NVuNUuVnVUN = new String[]{"panel", "content", "modules", "binds"};
   private static final String[] NVuunNnvvvVu = new String[]{"panel", "header", "modules", "content", "title", "icon"};
   private static final String[] vNnNuuvVn = new String[]{"panel", "header", "modules", "binds", "content", "title", "icon", "slots"};
   private static final String[] VUuuVUnun = new String[]{"reset", "centerX", "centerY", "presetSoft", "presetCompact", "presetSharp"};
   private static final NVunNNNNuN.uunvUUVnuNn[] vVVuuVVv = new NVunNNNNuN.uunvUUVnuNn[]{
      new NVunNNNNuN.uunvUUVnuNn("panelRadius", "Panel radius", "CORNERS", 0.0F, 32.0F),
      new NVunNNNNuN.uunvUUVnuNn("headerRadius", "Header radius", "CORNERS", 0.0F, 28.0F),
      new NVunNNNNuN.uunvUUVnuNn("contentRadius", "Content radius", "CORNERS", 0.0F, 24.0F),
      new NVunNNNNuN.uunvUUVnuNn("modulesRadius", "Modules radius", "CORNERS", 0.0F, 24.0F),
      new NVunNNNNuN.uunvUUVnuNn("bindsRadius", "Binds radius", "CORNERS", 0.0F, 24.0F),
      new NVunNNNNuN.uunvUUVnuNn("rowRadius", "Row radius", "CORNERS", 0.0F, 22.0F),
      new NVunNNNNuN.uunvUUVnuNn("slotRadius", "Slot radius", "CORNERS", 0.0F, 14.0F),
      new NVunNNNNuN.uunvUUVnuNn("padding", "Padding", "SPACING", 2.0F, 18.0F),
      new NVunNNNNuN.uunvUUVnuNn("gap", "Gap", "SPACING", 0.0F, 18.0F),
      new NVunNNNNuN.uunvUUVnuNn("headerHeight", "Header height", "SIZE", 0.0F, 48.0F),
      new NVunNNNNuN.uunvUUVnuNn("rowHeight", "Row height", "SIZE", 14.0F, 42.0F),
      new NVunNNNNuN.uunvUUVnuNn("titleSize", "Title size", "TYPOGRAPHY", 14.0F, 38.0F),
      new NVunNNNNuN.uunvUUVnuNn("iconSize", "Icon size", "TYPOGRAPHY", 12.0F, 38.0F),
      new NVunNNNNuN.uunvUUVnuNn("bindWidth", "Bind column", "TYPOGRAPHY", -24.0F, 90.0F),
      new NVunNNNNuN.uunvUUVnuNn("accentWidth", "Accent width", "TYPOGRAPHY", 0.0F, 7.0F)
   };
   private static final NVunNNNNuN.VvunVVUvUNnv[] VuunNUUUvu = new NVunNNNNuN.VvunVVUvUNnv[]{
      new NVunNNNNuN.VvunVVUvUNnv("HUD_HotKeys", "KeyBinds", "HotKeys", vNvnnVvvVUu.vNUvnnVnUvu, "q", NVunNNNNuN.nvnNNunvv.KEYBINDS, true),
      new NVunNNNNuN.VvunVVUvUNnv("HUD_Inventory", "Inventory", "Inventory", vNvnnVvvVUu.uNNnnnuuuN, "h", NVunNNNNuN.nvnNNunvv.INVENTORY, true),
      new NVunNNNNuN.VvunVVUvUNnv("HUD_Potions", "Potions", "Potions", vNvnnVvvVUu.uNNnnnuuuN, "t", NVunNNNNuN.nvnNNunvv.POTIONS, true),
      new NVunNNNNuN.VvunVVUvUNnv("HUD_CoolDowns", "Cooldowns", "Cool Downs", vNvnnVvvVUu.uNNnnnuuuN, "g", NVunNNNNuN.nvnNNunvv.COOLDOWNS, true),
      new NVunNNNNuN.VvunVVUvUNnv("HUD_Info", "Information", "PlayerInfo", vNvnnVvvVUu.uNNnnnuuuN, "e", NVunNNNNuN.nvnNNunvv.INFO, true),
      new NVunNNNNuN.VvunVVUvUNnv("HUD_WaterMark", "Watermark", "Watermark", vNvnnVvvVUu.vNUvnnVnUvu, "w", NVunNNNNuN.nvnNNunvv.WATERMARK, true),
      new NVunNNNNuN.VvunVVUvUNnv("HUD_ArrayList", "ArrayList", "ArrayList", vNvnnVvvVUu.vNUvnnVnUvu, "n", NVunNNNNuN.nvnNNunvv.ARRAYLIST, false),
      new NVunNNNNuN.VvunVVUvUNnv("HUD_TargetHUD", "TargetHUD", "TargetHud", vNvnnVvvVUu.vNUvnnVnUvu, "r", NVunNNNNuN.nvnNNunvv.TARGET, false),
      new NVunNNNNuN.VvunVVUvUNnv("hud_armor", "Armor", "Armor", vNvnnVvvVUu.uNNnnnuuuN, "h", NVunNNNNuN.nvnNNunvv.SLOTS, false),
      new NVunNNNNuN.VvunVVUvUNnv("HUD_HotBar", "HotBar", "HotBar", vNvnnVvvVUu.uNNnnnuuuN, "h", NVunNNNNuN.nvnNNunvv.HOTBAR, false),
      new NVunNNNNuN.VvunVVUvUNnv("HUD_Notifications", "Notifications", "Notifications", vNvnnVvvVUu.vNUvnnVnUvu, "l", NVunNNNNuN.nvnNNunvv.NOTIFICATION, false),
      new NVunNNNNuN.VvunVVUvUNnv("HUD_MusicPlayer", "Media", "MediaPlayer", vNvnnVvvVUu.vNUvnnVnUvu, "m", NVunNNNNuN.nvnNNunvv.MEDIA, false),
      new NVunNNNNuN.VvunVVUvUNnv("HUD_ServerHelper", "Server", "Server Helper", vNvnnVvvVUu.uNNnnnuuuN, "e", NVunNNNNuN.nvnNNunvv.SERVER, false)
   };
   private static final String[] NNUUNUuVNNVn = new String[]{"HitAura", "AutoTotem", "Speed", "InventoryMove"};
   private static final String[] VvVvnNUnvuvV = new String[]{"R", "F", "V", "G"};
   private static final String[] ccOO0COcoco0 = new String[]{"Strength III", "Fire Resistance", "Poison II"};
   private static final String[] NUVvUUVuVNVv = new String[]{"1:58", "6:40", "0:12"};
   private static final String[] nNuVunNUVu = new String[]{"Ender Pearl", "Golden Apple", "Chorus Fruit"};
   private static final String[] UNvvunVVn = new String[]{"8.4s", "2.1s", "0.7s"};
   private static final String[] UnvuVuVnNuvu = new String[]{"BPS", "TPS", "XYZ", "PING"};
   private static final String[] UvNNVUVNVuvV = new String[]{"7.42", "20.0", "120 64 -80", "42 ms"};
   private static final String[] NnunUUnU = new String[]{"Module toggled", "Config saved", "Friend joined"};
   private static final String[] nvuVvuNnNUnv = new String[]{"now", "1s", "4s"};
   private static final String[] NnVnNVN = new String[]{"wild", "fr1zy", "144 fps", "12:40"};
   private static final String[] vnvvNvUnVv = new String[]{"w", "r", "u", "y"};
   private static final String[] OCOocoOoOO = new String[]{"HitAura", "AutoTotem", "ElytraFly", "NoSlow"};
   private static final String[] o0Ooc0COOoc = new String[]{"Midnight Drive", "2:18 / 3:42", "Volume"};
   private static final String[] nvvnUnUn = new String[]{"PLAYING", "", "72%"};
   private static final String[] UnUUVuVunvVu = new String[]{"FunTime", "Anarchy-01", "Online"};
   private static final String[] nnvuvUNuUnN = new String[]{"EU", "42 ms", "128"};
   private static final String[] UVnuVUUVnnU = new String[]{"", "", "", ""};
   private static final String[] VunnVNvNV = new String[]{
      "Keys", "Inventory", "Potions", "Cooldowns", "Info", "Watermark", "ArrayList", "Target", "Armor", "HotBar", "Alerts", "Media", "Server"
   };
   private static final String NvUVUvVVnUu = "preview.resize";
   private final NVunNNNNuN.NVnVnNnN[] unnUnUNVnN = new NVunNNNNuN.NVnVnNnN[VuunNUUUvu.length];
   private final Map<String, NVunNNNNuN.NVnVnNnN> NnuUnUNnu = new HashMap<>();
   private final Map<String, NVunNNNNuN.NVnVnNnN> UnnnvvU = new HashMap<>();
   private final Map<String, NVunNNNNuN.NVnVnNnN> VUUnuVvVu = new HashMap<>();
   private final Map<String, VVnnnnN> VvVuvUvvNNVv = new HashMap<>();
   private final Map<String, VVnnnnN> UnnNNvuvvUU = new HashMap<>();
   private final Map<String, VVnnnnN> VNNnnVUuvv = new HashMap<>();
   private final Map<String, String> vUvUvUNNuNvn = new HashMap<>();
   private final nNuUNVu.nvUnvV[] uuVuUuuVVNvN = new nNuUNVu.nvUnvV[8];
   private final VVnnnnN VvuUUUNNNv = new VVnnnnN();
   private final VVnnnnN uuuVnuvnnNnU = new VVnnnnN();
   private final VVnnnnN nNunUnVN = new VVnnnnN();
   private final VVnnnnN VnVuuvVvnNv = new VVnnnnN();
   private final VVnnnnN vuvvuVuVv = new VVnnnnN();
   private final VVnnnnN uunNUuunVU = new VVnnnnN();
   private final VVnnnnN NvnuuuvnVV = new VVnnnnN();
   private final VVnnnnN NnUVNnuvUv = new VVnnnnN();
   private String UuuuNNunN;
   private float NNVNuUvVn;
   private float vuNnuUnu;
   private float uuvvuNvuUNVV;
   private float uVvunVUNuUvu;
   private float NVNnnvVnvV = 1.0F;
   private float vUNuuvvnVnv = 1.0F;
   private float unnnNUNnVu;
   private float NvnnUUuVvNU;
   private final float[] vVvuUVnV = new float[VuunNUUUvu.length];
   private final float[] nvuUVvuuN = new float[VuunNUUUvu.length];
   private boolean CC0COO;
   private boolean uNnNUNvuVnu;
   private boolean VnnnvUunNvuu;
   private boolean VuuUVVu;
   private float nUNnuUNnV;
   private float VuNVnvNNuNnn;
   private float uvVuuuvvVU;
   private float NNnvvunuVNUn;
   private float nVuuUnnUUVU;
   private float nUununvNvvn;
   private float NuvunVvnnN;
   private float vuvnnvuNVvu;
   private float NVvnvnn;
   private float vUvVUNnN;
   private float NUuVnnuUnvu;
   private float vnuNNVvVVuN;
   private boolean Oco0Oococc;
   private boolean uNUnUuUnvnnU;
   private NVunNNNNuN.NVnVnNnN OoccOc0CO = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN UvuVvvVuUuuu = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN NUUVUvvuNNVU = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN VUNvNUuNVnn = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN UNNunNuUNVuU = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN NuUuUvUUvU = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN VUVvNvvVUN = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN UvvNuvUNNNUv = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN NunUUVVVuu = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN uNUnuUUvvuU = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN vvVVVvVNVVVN = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN uUuuVvVunVVu = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN NuUvUNN = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN vunuUUVVUv = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private String uuuNUnuvvNNv = "panel";
   private String unUVnu;
   private String NvNUuuuvUvu;
   private int nNVVUnuVVVuV;
   private String vnVuunuNN = "";
   private String UvUNuNvvNVNv = "";
   private String vNnNNNuVVnUv = "";
   private float UVUnUvUNU = 1.0F;
   private float UvUnnnn;
   private float occOCoc0OcO;
   private NVunNNNNuN.NVnVnNnN VnvunuuvUNu = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN nuVuunUn = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private NVunNNNNuN.NVnVnNnN NvNvVNUv = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
   private static final OO0OCoOC vNUUvuuVU = OO0OCoOC.UuUVuuUu();
   private NvVNvUvunNNu unNuVNVUnV;
   private NUunUunuNV UvNNNUvNnUUV;

   public NVunNNNNuN() {
      super(class_2561.method_43470("HUD Constructor"));
      UuUVuuUu();
      this.VvuUUUNNNv.nuUnNvnuUu(0.0);

      for (int var1 = 0; var1 < this.unnUnUNVnN.length; var1++) {
         this.unnUnUNVnN[var1] = NVunNNNNuN.NVnVnNnN.C00OOC00oO();
      }

      for (int var5 = 0; var5 < this.uuVuUuuVVNvN.length; var5++) {
         this.uuVuUuuVVNvN[var5] = new nNuUNVu.nvUnvV();
      }

      for (NVunNNNNuN.uunvUUVnuNn var4 : vVVuuVVv) {
         this.NnuUnUNnu.put(var4.id, NVunNNNNuN.NVnVnNnN.C00OOC00oO());
      }

      for (String var10 : vNnNuuvVn) {
         this.UnnnvvU.put(var10, NVunNNNNuN.NVnVnNnN.C00OOC00oO());
      }

      this.VUUnuVvVu.put("close", NVunNNNNuN.NVnVnNnN.C00OOC00oO());
      this.VUUnuVvVu.put("reset", NVunNNNNuN.NVnVnNnN.C00OOC00oO());
      this.VUUnuVvVu.put("centerX", NVunNNNNuN.NVnVnNnN.C00OOC00oO());
      this.VUUnuVvVu.put("centerY", NVunNNNNuN.NVnVnNnN.C00OOC00oO());
      this.VUUnuVvVu.put("presetSoft", NVunNNNNuN.NVnVnNnN.C00OOC00oO());
      this.VUUnuVvVu.put("presetCompact", NVunNNNNuN.NVnVnNnN.C00OOC00oO());
      this.VUUnuVvVu.put("presetSharp", NVunNNNNuN.NVnVnNnN.C00OOC00oO());
      this.vNVuvnUUnuUn();
      this.UvnvNVnnnnNU();
      this.uVUVnuvnuVuv();
   }

   public boolean method_25421() {
      return false;
   }

   public void method_25394(class_332 var1, int var2, int var3, float var4) {
      this.vNUvnnVnUvu(this.UuUVuuUu((double)var2), this.C00OOC00oO((double)var3));
      super.method_25394(var1, var2, var3, var4);
   }

   public void method_25420(class_332 var1, int var2, int var3, float var4) {
   }

   public void method_52752(class_332 var1) {
   }

   public void UuUVuuUu(UnVNvNnU var1, class_332 var2, int var3, int var4) {
      if (!UNNVvNNvVNu.UuUVuuUu()) {
         if (this.field_22787 != null) {
            this.field_22787.method_1507(null);
         }
      } else if (var1 != null && var3 > 0 && var4 > 0) {
         this.NVNnnvnuunNv();
         this.VvuUUUNNNv.UuUVuuUu();
         this.VvuUUUNNNv.UuUVuuUu(1.0, 0.42F, VvVUUNUu.UnUNVVVNuv, false);
         this.uuuVnuvnnNnU.UuUVuuUu();
         this.uuuVnuvnnNnU.UuUVuuUu(this.unUVnu == null && !this.CC0COO && !this.uNnNUNvuVnu ? 0.0 : 1.0, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
         float var5 = UuUVuuUu(this.VvuUUUNNNv.uNNnnnuuuN(), 0.0F, 1.0F);
         NUunUunuNV var6 = this.uUnuvNvvNU();
         this.UuUVuuUu(var3, var4);
         this.UuUVuuUu(var1, var3, var4, var5, var6);
         var1.uNNnnnuuuN(var5);
         float var7 = 0.945F + 0.055F * var5;
         var1.uUnuvNvvNU(var7, var7, var3 * 0.5F, var4 * 0.5F);
         var1.UuUVuuUu(0.0F, (1.0F - var5) * this.UuUVuuUu(24.0F));

         try {
            this.UuUVuuUu(var1, var6);
            this.C00OOC00oO(var1, var6);
            this.uUnuvNvvNU(var1, var6);
            this.vVvUvVVuuNvV(var1, var6);
         } finally {
            var1.vNUvnnVnUvu();
            var1.uVUuuVnNVU();
            var1.vuuuNvNuv();
         }
      }
   }

   public boolean method_25402(double var1, double var3, int var5) {
      this.vNUvnnVnUvu(this.UuUVuuUu(var1), this.C00OOC00oO(var3));
      if (var5 != 0) {
         return true;
      } else {
         NVunNNNNuN.NVnVnNnN var6 = this.VUUnuVvVu.get("close");
         if (var6 != null && var6.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu)) {
            this.method_25419();
            return true;
         } else {
            if (this.nuVuunUn.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu)) {
               for (int var7 = 0; var7 < this.unnUnUNVnN.length; var7++) {
                  if (this.unnUnUNVnN[var7].UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu)) {
                     this.nNVVUnuVVVuV = var7;
                     this.uuuNUnuvvNNv = this.C00OOC00oO(VuunNUUUvu[var7].kind);
                     this.unnnNUNnVu = 0.0F;
                     this.vVvuUVnV[var7] = 0.0F;
                     this.nvuUVvuuN[var7] = 0.0F;
                     this.UvnvNVnnnnNU();
                     this.uVUVnuvnuVuv();
                     return true;
                  }
               }
            }

            String var12 = this.nuUnNvnuUu(this.NNVNuUvVn, this.vuNnuUnu);
            if (var12 != null) {
               this.UuUVuuUu(var12);
               return true;
            } else {
               String var8 = this.VVuuUN(this.NNVNuUvVn, this.vuNnuUnu);
               if (var8 != null) {
                  this.uuuNUnuvvNNv = var8;
                  this.uVUVnuvnuVuv();
                  return true;
               } else {
                  String var9 = this.uNNnnnuuuN(this.NNVNuUvVn, this.vuNnuUnu);
                  if (var9 != null) {
                     this.NvNUuuuvUvu = var9;
                     this.C00OOC00oO(this.NNVNuUvVn);
                     return true;
                  } else if (this.NuUvUNN.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu)) {
                     this.uNnNUNvuVnu = true;
                     this.uuuNUnuvvNNv = "panel";
                     this.nUNnuUNnV = this.NNVNuUvVn;
                     this.VuNVnvNNuNnn = this.vuNnuUnu;
                     this.uvVuuuvvVU = Math.max(1.0F, this.VUNvNUuNVnn.uUnuvNvvNU);
                     this.NNnvvunuVNUn = Math.max(1.0F, this.VUNvNUuNVnn.vVvUvVVuuNvV);
                     this.nVuuUnnUUVU = this.uvVuuuvvVU / Math.max(0.001F, this.NVNnnvVnvV);
                     this.nUununvNvvn = this.NNnvvunuVNUn / Math.max(0.001F, this.vUNuuvvnVnv);
                     this.NuvunVvnnN = nNuUNVu.UuUVuuUu().UuUVuuUu(this.UuuNnUvUuv(), this.nVuuUnnUUVU, this.nUununvNvvn);
                     this.vuvnnvuNVvu = Math.max(0.001F, this.NVNnnvVnvV);
                     this.NVvnvnn = this.vVvuUVnV[this.nNVVUnuVVVuV];
                     this.vUvVUNnN = this.nvuUVvuuN[this.nNVVUnuVVVuV];
                     nNuUNVu.VUnuUnnuNvVu var13 = nNuUNVu.UuUVuuUu().uNNnnnuuuN().get(this.UuuNnUvUuv());
                     this.NUuVnnuUnvu = var13 == null ? 0.5F : var13.nx();
                     this.vnuNNVvVVuN = var13 == null ? 0.5F : var13.ny();
                     this.uuvvuNvuUNVV = this.NNVNuUvVn;
                     this.uVvunVUNuUvu = this.vuNnuUnu;
                     return true;
                  } else {
                     String var10 = this.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu);
                     if (var10 == null) {
                        return true;
                     } else {
                        boolean var11 = var10.equals(this.uuuNUnuvvNNv) && this.uUnuvNvvNU(var10);
                        this.uuuNUnuvvNNv = var10;
                        this.uVUVnuvnuVuv();
                        if (var11) {
                           this.unUVnu = var10;
                        } else {
                           this.CC0COO = true;
                        }

                        this.uuvvuNvuUNVV = this.NNVNuUvVn;
                        this.uVvunVUNuUvu = this.vuNnuUnu;
                        return true;
                     }
                  }
               }
            }
         }
      }
   }

   public boolean method_25406(double var1, double var3, int var5) {
      this.vNUvnnVnUvu(this.UuUVuuUu(var1), this.C00OOC00oO(var3));
      this.unUVnu = null;
      this.CC0COO = false;
      this.uNnNUNvuVnu = false;
      this.VnnnvUunNvuu = false;
      this.VuuUVVu = false;
      this.NvNUuuuvUvu = null;
      this.nUUVuvU();
      return true;
   }

   public boolean method_25403(double var1, double var3, int var5, double var6, double var8) {
      this.vNUvnnVnUvu(this.UuUVuuUu(var1), this.C00OOC00oO(var3));
      unUuuVVuNnNN.NVnVnNnN var10 = this.uVUuuVnNVU();
      if (this.NvNUuuuvUvu != null) {
         this.C00OOC00oO(this.NNVNuUvVn);
         return true;
      } else if (this.uNnNUNvuVnu) {
         this.uUnuvNvvNU(this.NNVNuUvVn, this.vuNnuUnu);
         return true;
      } else if (this.CC0COO) {
         this.C00OOC00oO(this.NNVNuUvVn - this.uuvvuNvuUNVV, this.vuNnuUnu - this.uVvunVUNuUvu);
         this.uuvvuNvuUNVV = this.NNVNuUvVn;
         this.uVvunVUNuUvu = this.vuNnuUnu;
         return true;
      } else if (this.unUVnu != null) {
         float var11 = (this.NNVNuUvVn - this.uuvvuNvuUNVV) / Math.max(0.001F, this.NVNnnvVnvV);
         float var12 = (this.vuNnuUnu - this.uVvunVUNuUvu) / Math.max(0.001F, this.vUNuuvvnVnv);
         if ("title".equals(this.unUVnu)) {
            var10.UvnvNVnnnnNU.UuUVuuUu += var11;
            var10.UvnvNVnnnnNU.C00OOC00oO += var12;
         } else if ("icon".equals(this.unUVnu)) {
            var10.uVUVnuvnuVuv.UuUVuuUu += var11;
         } else if ("modules".equals(this.unUVnu)) {
            var10.NVNnnvnuunNv.UuUVuuUu += var11;
            var10.NVNnnvnuunNv.C00OOC00oO += var12;
         } else if ("binds".equals(this.unUVnu)) {
            var10.uVunuUNVVUUV.UuUVuuUu += var11;
            var10.uVunuUNVVUUV.C00OOC00oO += var12;
         }

         var10.C00OOC00oO();
         this.Oco0Oococc = true;
         this.uVUVnuvnuVuv();
         this.uuvvuNvuUNVV = this.NNVNuUvVn;
         this.uVvunVUNuUvu = this.vuNnuUnu;
         return true;
      } else {
         return true;
      }
   }

   public boolean method_25401(double var1, double var3, double var5, double var7) {
      this.vNUvnnVnUvu(this.UuUVuuUu(var1), this.C00OOC00oO(var3));
      if (this.VnvunuuvUNu.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu) && this.occOCoc0OcO > 0.0F) {
         this.UvUnnnn = UuUVuuUu(this.UvUnnnn - (float)var7 * this.UuUVuuUu(28.0F), 0.0F, this.occOCoc0OcO);
         return true;
      } else if (this.uNUnuUUvvuU.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu) && this.NvnnUUuVvNU > 0.0F) {
         this.unnnNUNnVu = UuUVuuUu(this.unnnNUNnVu - (float)var7 * this.UuUVuuUu(28.0F), 0.0F, this.NvnnUUuVvNU);
         return true;
      } else {
         return true;
      }
   }

   public boolean method_25404(int var1, int var2, int var3) {
      if (var1 == 256) {
         this.method_25419();
         return true;
      } else if (var1 == 82) {
         this.nuUnNvnuUu();
         return true;
      } else if (var1 == 67) {
         this.UuUVuuUu(true, false);
         this.nUUVuvU();
         return true;
      } else {
         return super.method_25404(var1, var2, var3);
      }
   }

   public void method_25419() {
      this.nUUVuvU();
      super.method_25419();
   }

   public void method_25432() {
      this.nUUVuvU();
      super.method_25432();
   }

   private static void UuUVuuUu() {
      if (!UuUVuuUu) {
         UuUVuuUu = true;
         NUvnVVNvvu.UuUVuuUu(new Object() {
            @vuVvUNNvVNV(
               UuUVuuUu = 4
            )
            public void UuUVuuUu(O0C0OC0OCcCO var1) {
               if (var1.uUnuvNvvNU() != null && var1.uUnuvNvvNU().field_1755 instanceof NVunNNNNuN var2) {
                  var2.UuUVuuUu(var1.vVvUvVVuuNvV(), var1.vNUvnnVnUvu(), var1.nuUnNvnuUu(), var1.VVuuUN());
                  if (var1.vVvUvVVuuNvV() != null) {
                     var1.vVvUvVVuuNvV().uUnuvNvvNU();
                  }
               }
            }
         });
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, int var2, int var3, float var4, NUunUunuNV var5) {
      int var6 = var5.uNnUnnuNUnNu() ? UuUVuuUu(12, 14, 20, Math.round(48.0F * var4)) : UuUVuuUu(0, 0, 0, Math.round(96.0F * var4));
      var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, 0.0F, var6);
      var1.UuUVuuUu(
         0.0F,
         0.0F,
         (float)var2,
         (float)var3,
         NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), Math.round(14.0F * var4)),
         UuUVuuUu(0, 0, 0, Math.round(26.0F * var4)),
         UuUVuuUu(0, 0, 0, Math.round(44.0F * var4)),
         NUunUunuNV.UuUVuuUu(var5.UNnVVNvvnVvU(), Math.round(16.0F * var4))
      );
      float var7 = this.uuuVnuvnnNnU.uNNnnnuuuN() * var4;
      if (var7 > 0.01F) {
         int var8 = this.C00OOC00oO();
         nNuUNVu.UuUVuuUu().UuUVuuUu(var2, var3, this.uuVuUuuVVNvN, var8, this.unUVnu, this.NNVNuUvVn, this.vuNnuUnu, var7);
      }
   }

   private int C00OOC00oO() {
      int var1 = 0;
      var1 = this.UuUVuuUu(var1, "panel", this.VUNvNUuNVnn, "panel".equals(this.uuuNUnuvvNNv) ? 0.78F : 0.24F);
      var1 = this.UuUVuuUu(var1, "header", this.UNNunNuUNVuU, "header".equals(this.uuuNUnuvvNNv) ? 0.72F : 0.22F);
      var1 = this.UuUVuuUu(var1, "modules", this.VUVvNvvVUN, "modules".equals(this.uuuNUnuvvNNv) ? 0.92F : 0.34F);
      var1 = this.UuUVuuUu(var1, "binds", this.UvvNuvUNNNUv, "binds".equals(this.uuuNUnuvvNNv) ? 0.92F : 0.34F);
      var1 = this.UuUVuuUu(var1, "title", this.UvuVvvVuUuuu, "title".equals(this.uuuNUnuvvNNv) ? 0.62F : 0.18F);
      var1 = this.UuUVuuUu(var1, "icon", this.NUUVUvvuNNVU, "icon".equals(this.uuuNUnuvvNNv) ? 0.72F : 0.2F);
      return this.UuUVuuUu(var1, "slots", this.NunUUVVVuu, "slots".equals(this.uuuNUnuvvNNv) ? 0.84F : 0.24F);
   }

   private int UuUVuuUu(int var1, String var2, NVunNNNNuN.NVnVnNnN var3, float var4) {
      if (var1 < this.uuVuUuuVVNvN.length && var3 != null && !(var3.uUnuvNvvNU <= 1.0F) && !(var3.vVvUvVVuuNvV <= 1.0F)) {
         float var5 = (float)Math.sqrt(var3.uUnuvNvvNU * var3.uUnuvNvvNU + var3.vVvUvVVuuNvV * var3.vVvUvVVuuNvV) * 0.52F;
         this.uuVuUuuVVNvN[var1]
            .UuUVuuUu(
               var2,
               var3.UuUVuuUu + var3.uUnuvNvvNU * 0.5F,
               var3.C00OOC00oO + var3.vVvUvVVuuNvV * 0.5F,
               Math.max(24.0F, var5),
               var4,
               var3.uUnuvNvvNU,
               var3.vVvUvVVuuNvV
            );
         return var1 + 1;
      } else {
         return var1;
      }
   }

   private void UuUVuuUu(int var1, int var2) {
      this.UVUnUvUNU = UuUVuuUu(var2 / 760.0F, 0.82F, 3.0F);
      float var3 = Math.max(this.UuUVuuUu(28.0F), var1 * 0.05F);
      float var4 = Math.max(this.UuUVuuUu(24.0F), var2 * 0.06F);
      float var5 = Math.max(this.UuUVuuUu(320.0F), var1 - var3 * 2.0F);
      float var6 = Math.max(this.UuUVuuUu(240.0F), var2 - var4 * 2.0F);
      float var7 = UuUVuuUu(var1 * 0.76F, Math.min(this.UuUVuuUu(560.0F), var5), var5);
      float var8 = UuUVuuUu(var2 * 0.78F, Math.min(this.UuUVuuUu(380.0F), var6), var6);
      float var9 = var7 / Math.max(1.0F, var8);
      if (var9 > 2.05F) {
         var7 = var8 * 2.05F;
      } else if (var9 < 1.34F) {
         var8 = var7 / 1.34F;
      }

      float var10 = (var1 - var7) * 0.5F;
      float var11 = (var2 - var8) * 0.5F;
      this.OoccOc0CO.UuUVuuUu(Math.round(var10), Math.round(var11), Math.round(var7), Math.round(var8));
      var10 = this.OoccOc0CO.UuUVuuUu;
      var11 = this.OoccOc0CO.C00OOC00oO;
      var7 = this.OoccOc0CO.uUnuvNvvNU;
      var8 = this.OoccOc0CO.vVvUvVVuuNvV;
      float var12 = this.UuUVuuUu(14.0F);
      float var13 = var11 + this.UuUVuuUu(52.0F);
      float var14 = var11 + var8 - var12;
      float var15 = Math.max(this.UuUVuuUu(120.0F), var14 - var13);
      float var16 = this.UuUVuuUu(12.0F);
      float var17 = var10 + var12;
      float var18 = var7 - var12 * 2.0F;
      float var19 = this.UuUVuuUu(150.0F);
      float var20 = this.UuUVuuUu(300.0F);
      float var21 = UuUVuuUu(var18 * 0.22F, Math.min(var19, var18 * 0.3F), var20);
      float var22 = UuUVuuUu(var18 * 0.26F, Math.min(var19, var18 * 0.3F), var20);
      float var23 = var18 - var21 - var22 - var16 * 2.0F;
      float var24 = var18 * 0.34F;
      if (var23 < var24 && var21 + var22 > 0.0F) {
         float var25 = var24 - var23;
         float var26 = var21 + var22;
         var21 -= var25 * (var21 / var26);
         var22 -= var25 * (var22 / var26);
         var23 = var18 - var21 - var22 - var16 * 2.0F;
      }

      this.VnvunuuvUNu.UuUVuuUu(Math.round(var17), Math.round(var13), Math.round(var21), Math.round(var15));
      this.NvNvVNUv.UuUVuuUu(Math.round(var17 + var21 + var16), Math.round(var13), Math.round(Math.max(this.UuUVuuUu(80.0F), var23)), Math.round(var15));
      this.uNUnuUUvvuU.UuUVuuUu(Math.round(var17 + var21 + var16 + this.NvNvVNUv.uUnuvNvvNU + var16), Math.round(var13), Math.round(var22), Math.round(var15));
   }

   private void UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2) {
      float var3 = this.OoccOc0CO.UuUVuuUu;
      float var4 = this.OoccOc0CO.C00OOC00oO;
      float var5 = this.OoccOc0CO.uUnuvNvvNU;
      float var6 = this.OoccOc0CO.vVvUvVVuuNvV;
      float var7 = this.UuUVuuUu(18.0F);
      var1.UuUVuuUu(var3, var4, var5, var6, var7, this.UuUVuuUu(30.0F), this.UuUVuuUu(8.0F), UuUVuuUu(0, 0, 0, var2.uNnUnnuNUnNu() ? 34 : 150));
      var1.UuUVuuUu(var3, var4, var5, var6, var7, this.UuUVuuUu(6.0F), this.UuUVuuUu(5.0F), UuUVuuUu(var2, var2.uNnUnnuNUnNu() ? 14 : 24));
      var1.UuUVuuUu(30.0F);
      var1.UuUVuuUu(var3, var4, var5, var6, var7, var2.uNnUnnuNUnNu() ? 0.96F : 0.92F);
      var1.UuUVuuUu(var3, var4, var5, var6, var7, var2.nuUnNvnuUu());
      var1.UuUVuuUu(var3, var4, var5, var6, var7, var2.nUUVuvU(), Math.max(1.0F, this.UuUVuuUu(1.0F)));
      var1.UuUVuuUu(
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var3 + this.UuUVuuUu(24.0F),
         vuuuNvNuv(var4 + this.UuUVuuUu(30.0F), this.UuUVuuUu(21.0F)),
         this.UuUVuuUu(21.0F),
         "HUD Constructor",
         var2.NVNnnvnuunNv()
      );
      float var8 = Math.round(this.UuUVuuUu(30.0F));
      NVunNNNNuN.NVnVnNnN var9 = this.VUUnuVvVu.get("close");
      var9.UuUVuuUu(Math.round(var3 + var5 - var8 - this.UuUVuuUu(16.0F)), Math.round(var4 + this.UuUVuuUu(30.0F) - var8 * 0.5F), var8, var8);
      float var10 = this.C00OOC00oO("close", var9.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu) ? 1.0F : 0.0F);
      float var11 = var9.UuUVuuUu + var9.uUnuvNvvNU * 0.5F;
      float var12 = var9.C00OOC00oO + var9.vVvUvVVuuNvV * 0.5F;
      var1.UuUVuuUu(
         var9.UuUVuuUu,
         var9.C00OOC00oO,
         var9.uUnuvNvvNU,
         var9.vVvUvVVuuNvV,
         this.UuUVuuUu(9.0F),
         NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), var2.uNnUnnuNUnNu() ? 14 : 10), NUunUunuNV.UuUVuuUu(var2.C00OOC00oO(), 46), var10)
      );
      var1.UuUVuuUu(
         var9.UuUVuuUu,
         var9.C00OOC00oO,
         var9.uUnuvNvvNU,
         var9.vVvUvVVuuNvV,
         this.UuUVuuUu(9.0F),
         NUunUunuNV.UuUVuuUu(var2.nUUVuvU(), NUunUunuNV.UuUVuuUu(var2.C00OOC00oO(), 90), var10),
         1.0F
      );
      this.UuUVuuUu(
         var1, var11, var12, this.UuUVuuUu(5.0F), Math.max(1.5F, this.UuUVuuUu(2.0F)), NUunUunuNV.UuUVuuUu(UuUVuuUu(var2), var2.C00OOC00oO(), var10 * 0.85F)
      );
   }

   private float UuUVuuUu(float var1) {
      return var1 * this.UVUnUvUNU;
   }

   private NUunUunuNV uUnuvNvvNU() {
      NvVNvUvunNNu var1 = null;

      try {
         if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null) {
            var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO();
         }
      } catch (Throwable var3) {
      }

      if (var1 == null) {
         var1 = NvVNvUvunNNu.WILD;
      }

      if (var1 != this.unNuVNVUnV || this.UvNNNUvNnUUV == null) {
         this.unNuVNVUnV = var1;
         this.UvNNNUvNnUUV = NUunUunuNV.UuUVuuUu(var1, vNUUvuuVU.uUnuvNvvNU(var1));
      }

      return this.UvNNNUvNnUUV;
   }

   private void UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6) {
      float var7 = Math.round(var3);
      float var8 = Math.round(var4);
      float var9 = Math.round(var5);
      float var10 = Math.round(var6);
      float var11 = this.UuUVuuUu(14.0F);
      int var12 = NUunUunuNV.UuUVuuUu(
         NUunUunuNV.UuUVuuUu(var2.VVuuUN(), UuUVuuUu(0, 0, 0, 255), var2.uNnUnnuNUnNu() ? 0.02F : 0.05F), var2.uNnUnnuNUnNu() ? 182 : 186
      );
      var1.UuUVuuUu(var7, var8, var9, var10, var11, this.UuUVuuUu(16.0F), this.UuUVuuUu(2.0F), UuUVuuUu(0, 0, 0, var2.uNnUnnuNUnNu() ? 22 : 82));
      var1.UuUVuuUu(26.0F);
      var1.UuUVuuUu(var7, var8, var9, var10, var11, var2.uNnUnnuNUnNu() ? 0.74F : 0.86F);
      var1.UuUVuuUu(var7, var8, var9, var10, var11, var12);
      var1.UuUVuuUu(var7, var8, var9, var10, var11, var2.UuuNnUvUuv(), Math.max(1.0F, this.UuUVuuUu(1.0F)));
   }

   private void UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2, float var3, float var4, float var5) {
      var1.UuUVuuUu((float)Math.round(var3), (float)Math.round(var4), (float)Math.round(var5), Math.max(1.0F, this.UuUVuuUu(1.0F)), 0.0F, var2.UuuNnUvUuv());
   }

   private void UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (!(var7 <= 0.0F) && !(var5 <= 0.0F)) {
         float var9 = UuUVuuUu(0.1F + 0.9F * var8, 0.0F, 1.0F);
         float var10 = Math.max(this.UuUVuuUu(30.0F), var5 * (var5 / (var5 + var7)));
         float var11 = var4 + (var5 - var10) * (var6 / Math.max(1.0F, var7));
         float var12 = Math.max(1.0F, (float)Math.round(this.UuUVuuUu(2.5F)));
         float var13 = var12 * 0.5F;
         var1.UuUVuuUu(
            (float)Math.round(var3),
            (float)Math.round(var4),
            var12,
            (float)Math.round(var5),
            var13,
            NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), Math.round((var2.uNnUnnuNUnNu() ? 16.0F : 10.0F) * var9))
         );
         var1.UuUVuuUu(
            (float)Math.round(var3),
            (float)Math.round(var11),
            var12,
            (float)Math.round(var10),
            var13,
            NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), Math.round((var2.uNnUnnuNUnNu() ? 120.0F : 110.0F) * var9))
         );
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2, boolean var3, boolean var4, float var5, float var6) {
      String var7 = var4 ? (var3 ? "LIVE" : "OFF") : "PREVIEW";
      int var8 = var4 ? (var3 ? var2.UuUVuuUu() : NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), var2.uNnUnnuNUnNu() ? 120 : 110)) : var2.uUnuvNvvNU();
      boolean var9 = var4 && var3;
      float var10 = var9 ? uVUuuVnNVU(1900.0F, 0.0F) : 0.0F;
      float var11 = this.UuUVuuUu(12.0F);
      float var12 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var7, var11);
      float var13 = Math.max(1.0F, (float)Math.round(this.UuUVuuUu(6.0F)));
      float var14 = Math.round(var5 - var12);
      float var15 = Math.round(var14 - this.UuUVuuUu(8.0F) - var13);
      float var16 = Math.round(var6 - var13 * 0.5F);
      if (var9 && var10 > 0.0F) {
         var1.UuUVuuUu(
            var15, var16, var13, var13, var13 * 0.5F, this.UuUVuuUu(5.0F), this.UuUVuuUu(0.5F), NUunUunuNV.UuUVuuUu(var8, Math.round(35.0F + var10 * 120.0F))
         );
      }

      var1.UuUVuuUu(var15, var16, var13, var13, var13 * 0.5F, NUunUunuNV.UuUVuuUu(var8, var9 ? Math.round(170.0F + var10 * 85.0F) : 220));
      var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var14, Math.round(vuuuNvNuv(var6, var11)), var11, var7, NUunUunuNV.UuUVuuUu(var8, var9 ? 235 : 210));
   }

   private String[] UuUVuuUu(NVunNNNNuN.nvnNNunvv var1) {
      return switch (var1) {
         case INVENTORY -> vvUVNVvvNUv;
         default -> uUVVvVVNvvn;
         case INFO, MEDIA, SERVER -> NVuunNnvvvVu;
         case WATERMARK -> NVuNUuVnVUN;
         case ARRAYLIST -> uUVvnUuNvvN;
         case TARGET -> UUuUnNVNuuv;
         case SLOTS, HOTBAR -> UuNnnVnuNNV;
      };
   }

   private String C00OOC00oO(NVunNNNNuN.nvnNNunvv var1) {
      String[] var2 = this.UuUVuuUu(var1);

      for (String var6 : var2) {
         if ("panel".equals(var6)) {
            return var6;
         }
      }

      return var2[0];
   }

   private static boolean UuUVuuUu(String[] var0, String var1) {
      for (String var5 : var0) {
         if (var5.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   private boolean UuUVuuUu(NVunNNNNuN.VvunVVUvUNnv var1, String var2) {
      NVunNNNNuN.nvnNNunvv var3 = var1.kind;
      if (var3 == NVunNNNNuN.nvnNNunvv.KEYBINDS) {
         if ("contentRadius".equals(var2) || "rowRadius".equals(var2)) {
            return false;
         }

         if ("slotRadius".equals(var2)) {
            return false;
         }
      }
      return switch (var2) {
         case "panelRadius", "padding", "gap" -> true;
         case "slotRadius" -> var3 == NVunNNNNuN.nvnNNunvv.INVENTORY
            || var3 == NVunNNNNuN.nvnNNunvv.HOTBAR
            || var3 == NVunNNNNuN.nvnNNunvv.SLOTS
            || var3 == NVunNNNNuN.nvnNNunvv.TARGET;
         case "rowRadius" -> var3 == NVunNNNNuN.nvnNNunvv.ARRAYLIST || var3 == NVunNNNNuN.nvnNNunvv.TARGET || var3 == NVunNNNNuN.nvnNNunvv.NOTIFICATION;
         case "contentRadius" -> var3 != NVunNNNNuN.nvnNNunvv.KEYBINDS && var3 != NVunNNNNuN.nvnNNunvv.WATERMARK;
         case "modulesRadius" -> var3 != NVunNNNNuN.nvnNNunvv.HOTBAR && var3 != NVunNNNNuN.nvnNNunvv.SLOTS;
         case "bindsRadius" -> var3 == NVunNNNNuN.nvnNNunvv.KEYBINDS
            || var3 == NVunNNNNuN.nvnNNunvv.POTIONS
            || var3 == NVunNNNNuN.nvnNNunvv.COOLDOWNS
            || var3 == NVunNNNNuN.nvnNNunvv.TARGET
            || var3 == NVunNNNNuN.nvnNNunvv.WATERMARK;
         case "bindWidth" -> var3 == NVunNNNNuN.nvnNNunvv.KEYBINDS
            || var3 == NVunNNNNuN.nvnNNunvv.POTIONS
            || var3 == NVunNNNNuN.nvnNNunvv.COOLDOWNS
            || var3 == NVunNNNNuN.nvnNNunvv.TARGET;
         case "accentWidth" -> var3 == NVunNNNNuN.nvnNNunvv.KEYBINDS
            || var3 == NVunNNNNuN.nvnNNunvv.POTIONS
            || var3 == NVunNNNNuN.nvnNNunvv.COOLDOWNS
            || var3 == NVunNNNNuN.nvnNNunvv.INFO;
         case "headerRadius", "headerHeight" -> var3 != NVunNNNNuN.nvnNNunvv.HOTBAR
            && var3 != NVunNNNNuN.nvnNNunvv.SLOTS
            && var3 != NVunNNNNuN.nvnNNunvv.WATERMARK
            && var3 != NVunNNNNuN.nvnNNunvv.ARRAYLIST;
         case "rowHeight" -> var3 != NVunNNNNuN.nvnNNunvv.HOTBAR && var3 != NVunNNNNuN.nvnNNunvv.SLOTS && var3 != NVunNNNNuN.nvnNNunvv.INVENTORY;
         case "titleSize", "iconSize" -> var3 != NVunNNNNuN.nvnNNunvv.ARRAYLIST && var3 != NVunNNNNuN.nvnNNunvv.HOTBAR && var3 != NVunNNNNuN.nvnNNunvv.SLOTS;
         default -> true;
      };
   }

   private void C00OOC00oO(UnVNvNnU var1, NUunUunuNV var2) {
      float var3 = this.VnvunuuvUNu.UuUVuuUu;
      float var4 = this.VnvunuuvUNu.C00OOC00oO;
      float var5 = this.VnvunuuvUNu.uUnuvNvvNU;
      float var6 = this.VnvunuuvUNu.vVvUvVVuuNvV;
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6);
      float var7 = Math.round(this.UuUVuuUu(42.0F));
      var1.UuUVuuUu(
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var3 + this.UuUVuuUu(16.0F),
         vuuuNvNuv(var4 + this.UuUVuuUu(21.0F), this.UuUVuuUu(16.0F)),
         this.UuUVuuUu(16.0F),
         "Elements",
         UuUVuuUu(var2)
      );
      String var8 = Integer.toString(VuunNUUUvu.length);
      var1.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu,
         var3 + var5 - this.UuUVuuUu(16.0F) - vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var8, this.UuUVuuUu(13.0F)),
         vuuuNvNuv(var4 + this.UuUVuuUu(21.0F), this.UuUVuuUu(13.0F)),
         this.UuUVuuUu(13.0F),
         var8,
         C00OOC00oO(var2)
      );
      this.UuUVuuUu(var1, var2, var3 + this.UuUVuuUu(14.0F), var4 + var7, var5 - this.UuUVuuUu(28.0F));
      float var9 = Math.round(var4 + var7 + this.UuUVuuUu(8.0F));
      float var10 = Math.round(Math.max(this.UuUVuuUu(40.0F), var4 + var6 - var9 - this.UuUVuuUu(8.0F)));
      this.nuVuunUn.UuUVuuUu(Math.round(var3 + this.UuUVuuUu(4.0F)), var9, Math.round(var5 - this.UuUVuuUu(8.0F)), var10);
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(
         this.nuVuunUn.UuUVuuUu,
         this.nuVuunUn.C00OOC00oO,
         this.nuVuunUn.uUnuvNvvNU,
         this.nuVuunUn.vVvUvVVuuNvV,
         this.UuUVuuUu(8.0F),
         this.UuUVuuUu(8.0F),
         this.UuUVuuUu(8.0F),
         this.UuUVuuUu(8.0F)
      );

      try {
         float var11 = Math.round(this.UuUVuuUu(38.0F));
         float var12 = Math.round(this.UuUVuuUu(4.0F));
         float var13 = Math.round(var3 + this.UuUVuuUu(10.0F));
         float var14 = Math.round(var5 - this.UuUVuuUu(20.0F));
         float var15 = Math.round(this.UuUVuuUu(26.0F));
         float var16 = var9 - this.UvUnnnn;

         for (int var17 = 0; var17 < VuunNUUUvu.length; var17++) {
            NVunNNNNuN.VvunVVUvUNnv var18 = VuunNUUUvu[var17];
            NVunNNNNuN.NVnVnNnN var19 = this.unnUnUNVnN[var17];
            float var20 = Math.round(var16);
            var19.UuUVuuUu(var13, var20, var14, var11);
            boolean var21 = var17 == this.nNVVUnuVVVuV;
            boolean var22 = this.UuUVuuUu(var18);
            boolean var23 = var20 + var11 >= var9 && var20 <= var9 + var10;
            if (var23) {
               float var24 = this.C00OOC00oO(var18.id, !var19.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu) && !var21 ? 0.0F : 1.0F);
               if (var21) {
                  var1.UuUVuuUu(var13, var20, var14, var11, this.UuUVuuUu(10.0F), UuUVuuUu(var2, var2.uNnUnnuNUnNu() ? 30 : 24));
                  var1.UuUVuuUu(var13, var20, var14, var11, this.UuUVuuUu(10.0F), UuUVuuUu(var2, var2.uNnUnnuNUnNu() ? 66 : 50), 1.0F);
                  float var25 = var11 - this.UuUVuuUu(16.0F);
                  float var26 = var20 + (var11 - var25) * 0.5F;
                  var1.UuUVuuUu(
                     (float)Math.round(var13 + this.UuUVuuUu(4.0F)),
                     (float)Math.round(var26),
                     (float)Math.round(this.UuUVuuUu(3.0F)),
                     (float)Math.round(var25),
                     this.UuUVuuUu(1.5F),
                     var2.uVunuUNVVUUV()
                  );
               } else if (var24 > 0.01F) {
                  var1.UuUVuuUu(
                     var13,
                     var20,
                     var14,
                     var11,
                     this.UuUVuuUu(10.0F),
                     NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), Math.round(var24 * (var2.uNnUnnuNUnNu() ? 13 : 10)))
                  );
               }

               boolean var42 = !var22;
               if (var42) {
                  var1.uNNnnnuuuN(var2.uNnUnnuNUnNu() ? 0.5F : 0.4F);
               }

               int var43 = var21 ? var2.vVvUvVVuuNvV() : NUunUunuNV.UuUVuuUu(C00OOC00oO(var2), var2.NVNnnvnuunNv(), var24 * 0.5F);
               int var27 = var21 ? var2.NVNnnvnuunNv() : NUunUunuNV.UuUVuuUu(UuUVuuUu(var2), var2.NVNnnvnuunNv(), var24 * 0.4F);
               float var28 = Math.round(var13 + this.UuUVuuUu(11.0F));
               float var29 = Math.round(var20 + (var11 - var15) * 0.5F);
               var1.UuUVuuUu(
                  var28,
                  var29,
                  var15,
                  var15,
                  this.UuUVuuUu(8.0F),
                  var21 ? UuUVuuUu(var2, 40) : NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), var2.uNnUnnuNUnNu() ? 14 : 12)
               );
               var1.uUnuvNvvNU();
               var1.UuUVuuUu(var28, var29, var15, var15, this.UuUVuuUu(8.0F), this.UuUVuuUu(8.0F), this.UuUVuuUu(8.0F), this.UuUVuuUu(8.0F));

               try {
                  this.UuUVuuUu(var1, var18.iconFont, var18.icon, var28, var29, var15, this.UuUVuuUu(18.0F), var43);
               } finally {
                  var1.uUnuvNvvNU();
                  var1.nuUnNvnuUu();
               }

               float var30 = this.UuUVuuUu(16.0F);
               float var31 = Math.round(var28 + var15 + this.UuUVuuUu(12.0F));
               float var32 = var13 + var14 - this.UuUVuuUu(14.0F) - var31;
               String var33 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var18.label, var30) <= var32 ? var18.label : VunnVNvNV[var17];
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var31, Math.round(vuuuNvNuv(var20 + var11 * 0.5F, var30)), var30, var33, var27);
               if (var42) {
                  var1.vuuuNvNuv();
               }
            }

            var16 += var11 + var12;
         }

         float var41 = VuunNUUUvu.length * var11 + Math.max(0, VuunNUUUvu.length - 1) * var12;
         this.occOCoc0OcO = Math.max(0.0F, var41 - var10);
         this.UvUnnnn = UuUVuuUu(this.UvUnnnn, 0.0F, this.occOCoc0OcO);
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }

      this.NvnuuuvnVV.UuUVuuUu();
      this.NvnuuuvnVV.UuUVuuUu(this.VnvunuuvUNu.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu) ? 1.0 : 0.0, 0.22F, VvVUUNUu.UnUNVVVNuv, false);
      this.UuUVuuUu(var1, var2, var3 + var5 - this.UuUVuuUu(7.0F), var9, var10, this.UvUnnnn, this.occOCoc0OcO, this.NvnuuuvnVV.uNNnnnuuuN());
   }

   private void uUnuvNvvNU(UnVNvNnU var1, NUunUunuNV var2) {
      float var3 = this.NvNvVNUv.UuUVuuUu;
      float var4 = this.NvNvVNUv.C00OOC00oO;
      float var5 = this.NvNvVNUv.uUnuvNvvNU;
      float var6 = this.NvNvVNUv.vVvUvVVuuNvV;
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6);
      float var7 = Math.round(this.UuUVuuUu(42.0F));
      NVunNNNNuN.VvunVVUvUNnv var8 = this.nvUVNnuu();
      var1.UuUVuuUu(
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var3 + this.UuUVuuUu(16.0F),
         vuuuNvNuv(var4 + this.UuUVuuUu(21.0F), this.UuUVuuUu(16.0F)),
         this.UuUVuuUu(16.0F),
         var8.label,
         var2.NVNnnvnuunNv()
      );
      this.UuUVuuUu(var1, var2, this.UuUVuuUu(var8), var8.layoutBacked, var3 + var5 - this.UuUVuuUu(16.0F), var4 + this.UuUVuuUu(21.0F));
      this.UuUVuuUu(var1, var2, var3 + this.UuUVuuUu(14.0F), var4 + var7, var5 - this.UuUVuuUu(28.0F));
      float var9 = this.UuUVuuUu(14.0F);
      float var10 = var3 + var9;
      float var11 = var4 + var7 + this.UuUVuuUu(8.0F);
      float var12 = Math.max(this.UuUVuuUu(60.0F), var5 - var9 * 2.0F);
      float var13 = Math.max(this.UuUVuuUu(60.0F), var4 + var6 - var11 - var9);
      this.uUuuVvVunVVu.UuUVuuUu(Math.round(var10), Math.round(var11), Math.round(var12), Math.round(var13));
      var1.UuUVuuUu(
         this.uUuuVvVunVVu.UuUVuuUu,
         this.uUuuVvVunVVu.C00OOC00oO,
         this.uUuuVvVunVVu.uUnuvNvvNU,
         this.uUuuVvVunVVu.vVvUvVVuuNvV,
         this.UuUVuuUu(10.0F),
         this.UuUVuuUu(10.0F),
         this.UuUVuuUu(1.0F),
         UuUVuuUu(0, 0, 0, var2.uNnUnnuNUnNu() ? 30 : 105)
      );
      var1.UuUVuuUu(
         this.uUuuVvVunVVu.UuUVuuUu,
         this.uUuuVvVunVVu.C00OOC00oO,
         this.uUuuVvVunVVu.uUnuvNvvNU,
         this.uUuuVvVunVVu.vVvUvVVuuNvV,
         this.UuUVuuUu(10.0F),
         var2.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(var2.VVuuUN(), 170) : UuUVuuUu(2, 6, 12, 126)
      );
      var1.UuUVuuUu(
         this.uUuuVvVunVVu.UuUVuuUu,
         this.uUuuVvVunVVu.C00OOC00oO,
         this.uUuuVvVunVVu.uUnuvNvvNU,
         this.uUuuVvVunVVu.vVvUvVVuuNvV,
         this.UuUVuuUu(10.0F),
         var2.nUUVuvU(),
         Math.max(1.0F, this.UuUVuuUu(1.0F))
      );
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(
         this.uUuuVvVunVVu.UuUVuuUu,
         this.uUuuVvVunVVu.C00OOC00oO,
         this.uUuuVvVunVVu.uUnuvNvvNU,
         this.uUuuVvVunVVu.vVvUvVVuuNvV,
         this.UuUVuuUu(10.0F),
         this.UuUVuuUu(10.0F),
         this.UuUVuuUu(10.0F),
         this.UuUVuuUu(10.0F)
      );

      try {
         this.UuUVuuUu(var1, this.uUuuVvVunVVu.UuUVuuUu, this.uUuuVvVunVVu.C00OOC00oO, this.uUuuVvVunVVu.uUnuvNvvNU, this.uUuuVvVunVVu.vVvUvVVuuNvV, var2);
         this.vVvUvVVuuNvV();
         this.UuUVuuUu(var1, this.uUuuVvVunVVu.UuUVuuUu, this.uUuuVvVunVVu.C00OOC00oO, this.uUuuVvVunVVu.uUnuvNvvNU, this.uUuuVvVunVVu.vVvUvVVuuNvV);
         this.uNNnnnuuuN(var1, var2);
         this.nuUnNvnuUu(var1, var2);
         var1.UuUVuuUu(
            vNvnnVvvVUu.UuUVuuUu,
            this.uUuuVvVunVVu.UuUVuuUu + this.UuUVuuUu(14.0F),
            this.uUuuVvVunVVu.C00OOC00oO + this.uUuuVvVunVVu.vVvUvVVuuNvV - this.UuUVuuUu(14.0F),
            this.UuUVuuUu(12.0F),
            "drag surface  ·  resize corner",
            C00OOC00oO(var2)
         );
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5) {
      switch (this.nvUVNnuu().kind) {
         case INVENTORY:
            this.C00OOC00oO(var1, var2, var3, var4, var5);
            break;
         case POTIONS:
            this.UuUVuuUu(var1, var2, var3, var4, var5, "Potions", this.nvUVNnuu().iconFont, this.nvUVNnuu().icon, ccOO0COcoco0, NUVvUUVuVNVv, 24.0F, true);
            break;
         case COOLDOWNS:
            this.UuUVuuUu(var1, var2, var3, var4, var5, "Cooldowns", this.nvUVNnuu().iconFont, this.nvUVNnuu().icon, nNuVunNUVu, UNvvunVVn, 24.0F, true);
            break;
         case INFO:
            this.UuUVuuUu(
               var1, var2, var3, var4, var5, this.nvUVNnuu().label, this.nvUVNnuu().iconFont, this.nvUVNnuu().icon, UnvuVuVnNuvu, UvNNVUVNVuvV, 24.0F, true
            );
            break;
         case WATERMARK:
            this.vVvUvVVuuNvV(var1, var2, var3, var4, var5);
            break;
         case ARRAYLIST:
            this.uNNnnnuuuN(var1, var2, var3, var4, var5);
            break;
         case TARGET:
            this.nuUnNvnuUu(var1, var2, var3, var4, var5);
            break;
         case SLOTS:
         case HOTBAR:
            this.uUnuvNvvNU(var1, var2, var3, var4, var5);
            break;
         case NOTIFICATION:
            this.UuUVuuUu(var1, var2, var3, var4, var5, "Notifications", this.nvUVNnuu().iconFont, this.nvUVNnuu().icon, NnunUUnU, nvuVvuNnNUnv, 22.0F, true);
            break;
         case MEDIA:
            this.UuUVuuUu(var1, var2, var3, var4, var5, "Now Playing", this.nvUVNnuu().iconFont, this.nvUVNnuu().icon, o0Ooc0COOoc, nvvnUnUn, 22.0F, true);
            break;
         case SERVER:
            this.UuUVuuUu(var1, var2, var3, var4, var5, "Server Helper", this.nvUVNnuu().iconFont, this.nvUVNnuu().icon, UnUUVuVunvVu, nnvuvUNuUnN, 22.0F, true);
            break;
         default:
            this.UuUVuuUu(var1, var2, var3, var4, var5, "Binds", vNvnnVvvVUu.vNUvnnVnUvu, "q", NNUUNUuVNNVn, VvVvnNUnvuvV, 22.0F, true);
      }
   }

   private void vVvUvVVuuNvV() {
      this.UvuVvvVuUuuu.UuUVuuUu();
      this.NUUVUvvuNNVU.UuUVuuUu();
      this.VUNvNUuNVnn.UuUVuuUu();
      this.UNNunNuUNVuU.UuUVuuUu();
      this.NuUuUvUUvU.UuUVuuUu();
      this.VUVvNvvVUN.UuUVuuUu();
      this.UvvNuvUNNNUv.UuUVuuUu();
      this.NunUUVVVuu.UuUVuuUu();
      this.NuUvUNN.UuUVuuUu();
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, NUunUunuNV var6) {
      int var7 = UuUVuuUu(var6, var6.uNnUnnuNUnNu() ? 18 : 14);
      float var8 = Math.max(this.UuUVuuUu(20.0F), (float)Math.round(this.UuUVuuUu(26.0F)));
      float var9 = Math.max(1.0F, (float)Math.round(this.UuUVuuUu(1.5F)));

      for (float var10 = Math.round(var2 + var8 * 0.5F); var10 < var2 + var4; var10 += var8) {
         for (float var11 = Math.round(var3 + var8 * 0.5F); var11 < var3 + var5; var11 += var8) {
            var1.UuUVuuUu((float)Math.round(var10), (float)Math.round(var11), var9, var9, var9 * 0.5F, var7);
         }
      }

      int var12 = UuUVuuUu(var6, var6.uNnUnnuNUnNu() ? 30 : 22);
      var1.UuUVuuUu((float)Math.round(var2 + var4 * 0.5F), (float)Math.round(var3), 1.0F, (float)Math.round(var5), 0.0F, var12);
      var1.UuUVuuUu((float)Math.round(var2), (float)Math.round(var3 + var5 * 0.5F), (float)Math.round(var4), 1.0F, 0.0F, var12);
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      float var2,
      float var3,
      float var4,
      float var5,
      String var6,
      nUVnuvUu var7,
      String var8,
      String[] var9,
      String[] var10,
      float var11,
      boolean var12
   ) {
      unUuuVVuNnNN.NVnVnNnN var13 = this.uVUuuVnNVU();
      var13.C00OOC00oO();
      nnvNuuNvvuu var14 = this.vuuuNvNuv();
      boolean var15 = this.nvUVNnuu().kind != NVunNNNNuN.nvnNNunvv.ARRAYLIST;
      float var16 = this.UuUVuuUu(var6, var7, var8, var9, var10, var11, var12, var13);
      float var17 = var13.vNUvnnVnUvu + (var15 ? Math.max(0.0F, var13.vuuuNvNuv) + var13.uVUuuVnNVU : 0.0F) + var9.length * var13.nvUVNnuu + var13.vNUvnnVnUvu;
      NVunNNNNuN.NVnVnNnN var18 = this.UuUVuuUu(var2, var3, var4, var5, var16, var17);
      float var19 = var18.UuUVuuUu;
      float var20 = var18.C00OOC00oO;
      float var21 = var18.uUnuvNvvNU;
      float var22 = var18.vVvUvVVuuNvV;
      float var23 = this.NVNnnvVnvV;
      float var24 = this.vUNuuvvnVnv;
      float var25 = Math.min(var23, var24);
      float var26 = var13.vNUvnnVnUvu * var23;
      float var27 = var13.vNUvnnVnUvu * var24;
      float var28 = var15 ? var13.vuuuNvNuv * var24 : 0.0F;
      float var29 = var13.uVUuuVnNVU * var23;
      float var30 = var15 ? var13.uVUuuVnNVU * var24 : 0.0F;
      float var31 = var13.nvUVNnuu * var24;
      float var32 = var20 + var27 + var28 + var30;
      float var33 = var9.length * var31;
      float var34 = 0.0F;

      for (String var38 : var10) {
         var34 = Math.max(var34, vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var38, var11));
      }

      float var49 = var12 ? Math.max(26.0F, var34 + 20.0F + var13.UnUNVVVNuv) * var23 : 0.0F;
      float var50 = var21 - var26 * 2.0F;
      float var51 = var12 ? Math.max(30.0F, var50 - var29 - var49) : var50;
      float var52 = var19 + var26 + this.UuUVuuUu(var13.NVNnnvnuunNv.UuUVuuUu, "modules.x") * var23;
      float var39 = var32 + this.UuUVuuUu(var13.NVNnnvnuunNv.C00OOC00oO, "modules.y") * var24;
      float var40 = var19 + var26 + var51 + var29 + this.UuUVuuUu(var13.uVunuUNVVUUV.UuUVuuUu, "binds.x") * var23;
      float var41 = var32 + this.UuUVuuUu(var13.uVunuUNVVUUV.C00OOC00oO, "binds.y") * var24;
      this.UuUVuuUu(var1, var14, var19, var20, var21, var22, var13.UuUVuuUu * var25, 0.95F);
      this.VUNvNUuNVnn.UuUVuuUu(var19, var20, var21, var22);
      if (var15) {
         this.UNNunNuUNVuU.UuUVuuUu(var19 + var26, var20 + var27, var50, var28);
         this.UuUVuuUu(
            var1,
            var14,
            this.UNNunNuUNVuU.UuUVuuUu,
            this.UNNunNuUNVuU.C00OOC00oO,
            this.UNNunNuUNVuU.uUnuvNvvNU,
            this.UNNunNuUNVuU.vVvUvVVuuNvV,
            var13.C00OOC00oO * var25,
            false,
            0.95F
         );
      } else {
         this.UNNunNuUNVuU.UuUVuuUu();
      }

      this.VUVvNvvVUN.UuUVuuUu(var52, var39, var51, var33);
      this.UuUVuuUu(
         var1,
         var14,
         this.VUVvNvvVUN.UuUVuuUu,
         this.VUVvNvvVUN.C00OOC00oO,
         this.VUVvNvvVUN.uUnuvNvvNU,
         this.VUVvNvvVUN.vVvUvVVuuNvV,
         var13.vVvUvVVuuNvV * var25,
         true,
         0.95F
      );
      if (var12) {
         this.UvvNuvUNNNUv.UuUVuuUu(var40, var41, var49, var33);
         this.UuUVuuUu(
            var1,
            var14,
            this.UvvNuvUNNNUv.UuUVuuUu,
            this.UvvNuvUNNNUv.C00OOC00oO,
            this.UvvNuvUNNNUv.uUnuvNvvNU,
            this.UvvNuvUNNNUv.vVvUvVVuuNvV,
            var13.uNNnnnuuuN * var25,
            true,
            0.95F
         );
         UuUVuuUu(this.NuUuUvUUvU, this.VUVvNvvVUN, this.UvvNuvUNNNUv);
      } else {
         this.UvvNuvUNNNUv.UuUVuuUu();
         this.NuUuUvUUvU.UuUVuuUu(this.VUVvNvvVUN);
      }

      if (var15) {
         this.UuUVuuUu(var1, var14, var13, var19, var20, var21, var23, var24, var6, vNvnnVvvVUu.vVvUvVVuuNvV, var7, var8);
      } else {
         this.UvuVvvVuUuuu.UuUVuuUu();
         this.NUUVUvvuNNVU.UuUVuuUu();
      }

      for (int var42 = 0; var42 < var9.length; var42++) {
         float var43 = var39 + var42 * var31;
         float var44 = var41 + var42 * var31;
         boolean var45 = this.nvUVNnuu().kind == NVunNNNNuN.nvnNNunvv.POTIONS && var42 == 2;
         int var46 = var45 ? this.uUnuvNvvNU().C00OOC00oO() : var14.vNUvnnVnUvu(0.9F);
         int var47 = var45 ? NUunUunuNV.UuUVuuUu(this.uUnuvNvvNU().C00OOC00oO(), 235) : var14.uNNnnnuuuN(0.9F);
         if (var13.vNVuvnUUnuUn > 0.05F) {
            var1.UuUVuuUu(
               (float)Math.round(var52 + 10.0F * var23),
               (float)Math.round(var43 + (var31 - 8.0F * var24) * 0.5F),
               Math.max(1.0F, (float)Math.round(var13.vNVuvnUUnuUn * var23)),
               Math.max(1.0F, (float)Math.round(8.0F * var24)),
               Math.max(0.8F, var13.vNVuvnUUnuUn * 0.5F) * var23,
               var46
            );
         }

         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var52 + 20.0F * var23, var43 + var31 * 0.5F + 4.0F * var24, var11 * var25, var9[var42], var47);
         if (var12) {
            float var48 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var10[var42], var11 * var25);
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var40 + (var49 - var48) * 0.5F, var44 + var31 * 0.5F + 4.0F * var24, var11 * var25, var10[var42], var46);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void C00OOC00oO(UnVNvNnU var1, float var2, float var3, float var4, float var5) {
      unUuuVVuNnNN.NVnVnNnN var6 = this.uVUuuVnNVU();
      var6.C00OOC00oO();
      nnvNuuNvvuu var7 = this.vuuuNvNuv();
      float var8 = 22.0F;
      float var9 = 9.0F * var8 + var6.vNUvnnVnUvu * 2.0F;
      float var10 = 3.0F * var8 + var6.vNUvnnVnUvu * 2.0F;
      float var11 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, "Inventory", var6.UuuNnUvUuv);
      float var12 = Math.max(var9 + var6.vNUvnnVnUvu * 2.0F, var11 + 22.0F + var6.vNUvnnVnUvu * 2.0F + var6.nUUVuvU + 14.0F);
      float var13 = var6.vNUvnnVnUvu + var6.vuuuNvNuv + var6.uVUuuVnNVU + var10 + var6.vNUvnnVnUvu;
      NVunNNNNuN.NVnVnNnN var14 = this.UuUVuuUu(var2, var3, var4, var5, var12, var13);
      float var15 = var14.UuUVuuUu;
      float var16 = var14.C00OOC00oO;
      float var17 = var14.uUnuvNvvNU;
      float var18 = var14.vVvUvVVuuNvV;
      float var19 = this.NVNnnvVnvV;
      float var20 = this.vUNuuvvnVnv;
      float var21 = Math.min(var19, var20);
      float var22 = var6.vNUvnnVnUvu * var19;
      float var23 = var6.vNUvnnVnUvu * var20;
      float var24 = var6.vuuuNvNuv * var20;
      float var25 = var16 + var23 + var24 + var6.uVUuuVnNVU * var20;
      float var26 = var17 - var22 * 2.0F;
      float var27 = var15 + var22 + this.UuUVuuUu(var6.NVNnnvnuunNv.UuUVuuUu, "modules.x") * var19;
      float var28 = var25 + this.UuUVuuUu(var6.NVNnnvnuunNv.C00OOC00oO, "modules.y") * var20;
      float var29 = var10 * var20;
      this.UuUVuuUu(var1, var7, var15, var16, var17, var18, var6.UuUVuuUu * var21, 0.95F);
      this.VUNvNUuNVnn.UuUVuuUu(var15, var16, var17, var18);
      this.UNNunNuUNVuU.UuUVuuUu(var15 + var22, var16 + var23, var26, var24);
      this.UuUVuuUu(
         var1,
         var7,
         this.UNNunNuUNVuU.UuUVuuUu,
         this.UNNunNuUNVuU.C00OOC00oO,
         this.UNNunNuUNVuU.uUnuvNvvNU,
         this.UNNunNuUNVuU.vVvUvVVuuNvV,
         var6.C00OOC00oO * var21,
         false,
         0.95F
      );
      this.VUVvNvvVUN.UuUVuuUu(var27, var28, var26, var29);
      this.NuUuUvUUvU.UuUVuuUu(this.VUVvNvvVUN);
      this.UuUVuuUu(
         var1,
         var7,
         this.VUVvNvvVUN.UuUVuuUu,
         this.VUVvNvvVUN.C00OOC00oO,
         this.VUVvNvvVUN.uUnuvNvvNU,
         this.VUVvNvvVUN.vVvUvVVuuNvV,
         var6.uUnuvNvvNU * var21,
         true,
         0.95F
      );
      this.UuUVuuUu(var1, var7, var6, var15, var16, var17, var19, var20, "Inventory", vNvnnVvvVUu.vVvUvVVuuNvV, vNvnnVvvVUu.uNNnnnuuuN, "h");
      float var30 = var8 * var21;
      float var31 = var27 + (var26 - 9.0F * var30) * 0.5F;
      float var32 = var28 + (var29 - 3.0F * var30) * 0.5F;
      int var33 = var7.vuuuNvNuv() ? UuUVuuUu(0, 0, 0, 58) : var7.uUnuvNvvNU(0.72F);

      for (int var34 = 0; var34 < 3; var34++) {
         for (int var35 = 0; var35 < 9; var35++) {
            float var36 = var31 + var35 * var30;
            float var37 = var32 + var34 * var30;
            var1.UuUVuuUu(
               (float)Math.round(var36 + 1.0F),
               (float)Math.round(var37 + 1.0F),
               Math.max(1.0F, (float)Math.round(var30 - 2.0F)),
               Math.max(1.0F, (float)Math.round(var30 - 2.0F)),
               var6.VVuuUN * var21,
               var33
            );
         }
      }

      this.NunUUVVVuu.UuUVuuUu(Math.round(var31), Math.round(var32), Math.round(9.0F * var30), Math.round(3.0F * var30));
      if (this.field_22787 != null && this.field_22787.field_1724 != null) {
         var1.uUnuvNvvNU();
         var1.UuUVuuUu(
            this.NunUUVVVuu.UuUVuuUu,
            this.NunUUVVVuu.C00OOC00oO,
            this.NunUUVVVuu.uUnuvNvvNU,
            this.NunUUVVVuu.vVvUvVVuuNvV,
            var6.uUnuvNvvNU * var21,
            var6.uUnuvNvvNU * var21,
            var6.uUnuvNvvNU * var21,
            var6.uUnuvNvvNU * var21
         );
         boolean var44 = false /* VF: Semaphore variable */;

         try {
            var44 = true;
            int var46 = 9;
            float var47 = NuNvVUuUUnun.uUnuvNvvNU(Math.max(0.25F, (var30 - this.UuUVuuUu(4.0F)) / 16.0F));
            float var48 = 16.0F * var47;

            for (int var49 = 0; var49 < 3; var49++) {
               for (int var38 = 0; var38 < 9; var38++) {
                  class_1799 var39 = this.field_22787.field_1724.method_31548().method_5438(var46);
                  if (var39 != null && !var39.method_7960()) {
                     float var40 = var31 + var38 * var30 + (var30 - var48) * 0.5F;
                     float var41 = var32 + var49 * var30 + (var30 - var48) * 0.5F;
                     NuNvVUuUUnun.UuUVuuUu(var1, var39, NuNvVUuUUnun.UuUVuuUu(var40), NuNvVUuUUnun.UuUVuuUu(var41), var47, var46, true, var46);
                  }

                  var46++;
               }
            }

            var44 = false;
         } finally {
            if (var44) {
               var1.uUnuvNvvNU();
               var1.nuUnNvnuUu();
            }
         }

         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }
   }

   private void uUnuvNvvNU(UnVNvNnU var1, float var2, float var3, float var4, float var5) {
      unUuuVVuNnNN.NVnVnNnN var6 = this.uVUuuVnNVU();
      var6.C00OOC00oO();
      nnvNuuNvvuu var7 = this.vuuuNvNuv();
      int var8 = this.nvUVNnuu().kind == NVunNNNNuN.nvnNNunvv.HOTBAR ? 9 : 4;
      float var9 = this.nvUVNnuu().kind == NVunNNNNuN.nvnNNunvv.HOTBAR ? 24.0F : 28.0F;
      float var10 = var8 * var9 + var6.vNUvnnVnUvu * 2.0F;
      float var11 = var9 + var6.vNUvnnVnUvu * 2.0F;
      NVunNNNNuN.NVnVnNnN var12 = this.UuUVuuUu(var2, var3, var4, var5, var10, var11);
      float var13 = var12.UuUVuuUu;
      float var14 = var12.C00OOC00oO;
      float var15 = var12.uUnuvNvvNU;
      float var16 = var12.vVvUvVVuuNvV;
      float var17 = Math.min(this.NVNnnvVnvV, this.vUNuuvvnVnv);
      this.UuUVuuUu(var1, var7, var13, var14, var15, var16, var6.UuUVuuUu * var17, 0.95F);
      this.VUNvNUuNVnn.UuUVuuUu(var13, var14, var15, var16);
      this.VUVvNvvVUN
         .UuUVuuUu(
            var13 + var6.vNUvnnVnUvu * this.NVNnnvVnvV,
            var14 + var6.vNUvnnVnUvu * this.vUNuuvvnVnv,
            var15 - var6.vNUvnnVnUvu * 2.0F * this.NVNnnvVnvV,
            var16 - var6.vNUvnnVnUvu * 2.0F * this.vUNuuvvnVnv
         );
      this.NuUuUvUUvU.UuUVuuUu(this.VUVvNvvVUN);
      float var18 = var9 * var17;
      float var19 = var13 + (var15 - var8 * var18) * 0.5F;
      float var20 = var14 + (var16 - var18) * 0.5F;

      for (int var21 = 0; var21 < var8; var21++) {
         float var22 = var19 + var21 * var18;
         int var23 = var21 == 0 ? var7.vNUvnnVnUvu(0.28F) : var7.uUnuvNvvNU(0.76F);
         var1.UuUVuuUu(
            (float)Math.round(var22 + 1.0F),
            (float)Math.round(var20 + 1.0F),
            Math.max(1.0F, (float)Math.round(var18 - 2.0F)),
            Math.max(1.0F, (float)Math.round(var18 - 2.0F)),
            var6.VVuuUN * var17,
            var23
         );
      }

      this.NunUUVVVuu.UuUVuuUu(Math.round(var19), Math.round(var20), Math.round(var8 * var18), Math.round(var18));
      if (this.field_22787 != null && this.field_22787.field_1724 != null) {
         var1.uUnuvNvvNU();
         var1.UuUVuuUu(
            this.NunUUVVVuu.UuUVuuUu,
            this.NunUUVVVuu.C00OOC00oO,
            this.NunUUVVVuu.uUnuvNvvNU,
            this.NunUUVVVuu.vVvUvVVuuNvV,
            var6.UuUVuuUu * var17,
            var6.UuUVuuUu * var17,
            var6.UuUVuuUu * var17,
            var6.UuUVuuUu * var17
         );

         try {
            float var30 = NuNvVUuUUnun.uUnuvNvvNU(Math.max(0.25F, (var18 - this.UuUVuuUu(5.0F)) / 16.0F));
            float var31 = 16.0F * var30;

            for (int var32 = 0; var32 < var8; var32++) {
               class_1799 var24 = this.UuUVuuUu(var32);
               if (var24 != null && !var24.method_7960()) {
                  float var25 = var19 + var32 * var18 + (var18 - var31) * 0.5F;
                  float var26 = var20 + (var18 - var31) * 0.5F;
                  NuNvVUuUUnun.UuUVuuUu(var1, var24, NuNvVUuUUnun.UuUVuuUu(var25), NuNvVUuUUnun.UuUVuuUu(var26), var30, var32, true, var32);
               }
            }
         } finally {
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }
      }
   }

   private class_1799 UuUVuuUu(int var1) {
      if (this.field_22787 == null || this.field_22787.field_1724 == null) {
         return class_1799.field_8037;
      } else if (this.nvUVNnuu().kind == NVunNNNNuN.nvnNNunvv.HOTBAR) {
         return this.field_22787.field_1724.method_31548().method_5438(var1);
      } else {
         return switch (var1) {
            case 0 -> this.field_22787.field_1724.method_6118(class_1304.field_6169);
            case 1 -> this.field_22787.field_1724.method_6118(class_1304.field_6174);
            case 2 -> this.field_22787.field_1724.method_6118(class_1304.field_6172);
            case 3 -> this.field_22787.field_1724.method_6118(class_1304.field_6166);
            default -> class_1799.field_8037;
         };
      }
   }

   private void vVvUvVVuuNvV(UnVNvNnU var1, float var2, float var3, float var4, float var5) {
      unUuuVVuNnNN.NVnVnNnN var6 = this.uVUuuVnNVU();
      var6.C00OOC00oO();
      nnvNuuNvvuu var7 = this.vuuuNvNuv();
      float var8 = var6.UuuNnUvUuv;
      float var9 = var6.nvUVNnuu;
      float var10 = var6.vNUvnnVnUvu * 2.0F + var9;

      for (String var14 : NnVnNVN) {
         var10 += var6.uVUuuVnNVU + vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var14, var8) + 36.0F;
      }

      float var28 = var9 + var6.vNUvnnVnUvu * 2.0F;
      NVunNNNNuN.NVnVnNnN var29 = this.UuUVuuUu(var2, var3, var4, var5, var10, var28);
      float var30 = var29.UuUVuuUu;
      float var31 = var29.C00OOC00oO;
      float var15 = var29.uUnuvNvvNU;
      float var16 = var29.vVvUvVVuuNvV;
      float var17 = this.NVNnnvVnvV;
      float var18 = this.vUNuuvvnVnv;
      float var19 = Math.min(var17, var18);
      this.UuUVuuUu(var1, var7, var30, var31, var15, var16, var6.UuUVuuUu * var19, 0.95F);
      this.VUNvNUuNVnn.UuUVuuUu(var30, var31, var15, var16);
      float var20 = var30 + var6.vNUvnnVnUvu * var17;
      float var21 = var31 + var6.vNUvnnVnUvu * var18;
      float var22 = var9 * var18;
      float var23 = var9 * var17;
      var1.UuUVuuUu(
         (float)Math.round(var20),
         (float)Math.round(var21),
         Math.max(1.0F, (float)Math.round(var23)),
         Math.max(1.0F, (float)Math.round(var22)),
         var6.vVvUvVVuuNvV * var19,
         var7.C00OOC00oO(0.95F)
      );
      float var24 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vNUvnnVnUvu, "w", var6.nUUVuvU * var19);
      var1.UuUVuuUu(
         vNvnnVvvVUu.vNUvnnVnUvu, var20 + (var23 - var24) * 0.5F, var21 + var22 * 0.5F + 5.5F * var18, var6.nUUVuvU * var19, "w", var7.vNUvnnVnUvu(0.95F)
      );
      this.VUVvNvvVUN.UuUVuuUu(var20, var21, var23, var22);
      var20 += var23;

      for (int var25 = 0; var25 < NnVnNVN.length; var25++) {
         var20 += var6.uVUuuVnNVU * var17;
         float var26 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, NnVnNVN[var25], var8 * var19);
         float var27 = var26 + 36.0F * var17;
         var1.UuUVuuUu(
            (float)Math.round(var20),
            (float)Math.round(var21),
            Math.max(1.0F, (float)Math.round(var27)),
            Math.max(1.0F, (float)Math.round(var22)),
            var6.uNNnnnuuuN * var19,
            var7.C00OOC00oO(0.88F)
         );
         var1.UuUVuuUu(
            vNvnnVvvVUu.vNUvnnVnUvu, var20 + 9.0F * var17, var21 + var22 * 0.5F + 5.0F * var18, 22.0F * var19, vnvvNvUnVv[var25], var7.vNUvnnVnUvu(0.9F)
         );
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var20 + 25.0F * var17, var21 + var22 * 0.5F + 4.5F * var18, var8 * var19, NnVnNVN[var25], var7.uNNnnnuuuN(0.92F));
         var20 += var27;
      }

      this.NuUuUvUUvU.UuUVuuUu(var30 + var6.vNUvnnVnUvu * var17, var21, var15 - var6.vNUvnnVnUvu * 2.0F * var17, var22);
      this.UvvNuvUNNNUv.UuUVuuUu(this.NuUuUvUUvU);
   }

   private void uNNnnnuuuN(UnVNvNnU var1, float var2, float var3, float var4, float var5) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, "ArrayList", vNvnnVvvVUu.vNUvnnVnUvu, "n", OCOocoOoOO, UVnuVUUVnnU, 24.0F, false);
      this.UNNunNuUNVuU.UuUVuuUu();
      this.UvuVvvVuUuuu.UuUVuuUu();
      this.NUUVUvvuNNVU.UuUVuuUu();
   }

   private void nuUnNvnuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5) {
      unUuuVVuNnNN.NVnVnNnN var6 = this.uVUuuVnNVU();
      var6.C00OOC00oO();
      nnvNuuNvvuu var7 = this.vuuuNvNuv();
      float var8 = 190.0F + var6.UnUNVVVNuv;
      float var9 = 72.0F + var6.vNUvnnVnUvu * 2.0F;
      NVunNNNNuN.NVnVnNnN var10 = this.UuUVuuUu(var2, var3, var4, var5, var8, var9);
      float var11 = var10.UuUVuuUu;
      float var12 = var10.C00OOC00oO;
      float var13 = var10.uUnuvNvvNU;
      float var14 = var10.vVvUvVVuuNvV;
      float var15 = this.NVNnnvVnvV;
      float var16 = this.vUNuuvvnVnv;
      float var17 = Math.min(var15, var16);
      this.UuUVuuUu(var1, var7, var11, var12, var13, var14, var6.UuUVuuUu * var17, 0.95F);
      this.VUNvNUuNVnn.UuUVuuUu(var11, var12, var13, var14);
      float var18 = 46.0F * var17;
      float var19 = var11 + var6.vNUvnnVnUvu * var15;
      float var20 = var12 + (var14 - var18) * 0.5F;
      var1.UuUVuuUu(
         (float)Math.round(var19),
         (float)Math.round(var20),
         Math.max(1.0F, (float)Math.round(var18)),
         Math.max(1.0F, (float)Math.round(var18)),
         var6.VVuuUN * var17 + 7.0F * var17,
         var7.C00OOC00oO(0.95F)
      );
      var1.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var19 + var18 * 0.32F, var20 + var18 * 0.63F, 28.0F * var17, "r", var7.vNUvnnVnUvu(0.9F));
      float var21 = var19 + var18 + var6.uVUuuVnNVU * var15 + 8.0F * var15 + this.UuUVuuUu(var6.NVNnnvnuunNv.UuUVuuUu, "modules.x") * var15;
      float var22 = var12 + var6.vNUvnnVnUvu * var16 + 8.0F * var16 + this.UuUVuuUu(var6.NVNnnvnuunNv.C00OOC00oO, "modules.y") * var16;
      var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var21, var22 + 12.0F * var16, 24.0F * var17, "Enemy", var7.uNNnnnuuuN(0.95F));
      float var23 = var22 + 28.0F * var16;
      float var24 = var13 - (var21 - var11) - var6.vNUvnnVnUvu * var15;
      var1.UuUVuuUu(
         (float)Math.round(var21),
         (float)Math.round(var23),
         Math.max(1.0F, (float)Math.round(var24)),
         Math.max(1.0F, (float)Math.round(8.0F * var16)),
         var6.nuUnNvnuUu * var17,
         var7.uUnuvNvvNU(0.88F)
      );
      var1.UuUVuuUu(
         (float)Math.round(var21),
         (float)Math.round(var23),
         Math.max(1.0F, (float)Math.round(var24 * 0.68F)),
         Math.max(1.0F, (float)Math.round(8.0F * var16)),
         var6.nuUnNvnuUu * var17,
         var7.vNUvnnVnUvu(0.9F)
      );
      this.VUVvNvvVUN.UuUVuuUu(var21, var22, var13 - (var21 - var11) - var6.vNUvnnVnUvu * var15, 44.0F * var16);
      this.NunUUVVVuu.UuUVuuUu(var19, var20, var18, var18);
      UuUVuuUu(this.NuUuUvUUvU, this.VUVvNvvVUN, this.NunUUVVVuu);
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      nnvNuuNvvuu var2,
      unUuuVVuNnNN.NVnVnNnN var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      String var9,
      nUVnuvUu var10,
      nUVnuvUu var11,
      String var12
   ) {
      float var13 = Math.min(var7, var8);
      int var14 = var2.uNNnnnuuuN(0.95F);
      int var15 = var2.vNUvnnVnUvu(0.95F);
      float var16 = var4 + this.UuUVuuUu(var3.UvnvNVnnnnNU.UuUVuuUu, "title.x") * var7;
      float var17 = var5 + this.UuUVuuUu(var3.UvnvNVnnnnNU.C00OOC00oO, "title.y") * var8;
      float var18 = var3.UuuNnUvUuv * var13;
      var1.UuUVuuUu(var10, var16, var17, var18, var9, var14);
      float var19 = vVVUUuunVVV.C00OOC00oO(var10, var9, var18);
      this.UvuVvvVuUuuu.UuUVuuUu(var16 - 4.0F, var17 - var18 * 0.8F, var19 + 8.0F, var18);
      float var20 = var3.nUUVuvU * var13;
      float var21 = (var3.uVUVnuvnuVuv.uUnuvNvvNU ? var4 + var6 : var4) + this.UuUVuuUu(var3.uVUVnuvnuVuv.UuUVuuUu, "icon.x") * var7;
      float var22 = var5 + this.UuUVuuUu(var3.uVUVnuvnuVuv.C00OOC00oO, "icon.y") * var8;
      float var23 = vVVUUuunVVV.C00OOC00oO(var11, var12, var20);
      var1.UuUVuuUu(var11, var21, var22, var20, var12, var15);
      this.NUUVUvvuNNVU.UuUVuuUu(var21 - 6.0F, var22 - var20 * 0.85F, var23 + 12.0F, var20 + 4.0F);
   }

   private void UuUVuuUu(UnVNvNnU var1, nnvNuuNvvuu var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      var2.UuUVuuUu(var1, Math.round(var3), Math.round(var4), Math.round(var5), Math.round(var6), var7, var8);
   }

   private void UuUVuuUu(UnVNvNnU var1, nnvNuuNvvuu var2, float var3, float var4, float var5, float var6, float var7, boolean var8, float var9) {
      if (!(var5 <= 0.0F) && !(var6 <= 0.0F)) {
         var3 = Math.round(var3);
         var4 = Math.round(var4);
         var5 = Math.round(var5);
         var6 = Math.round(var6);
         if (!var8 || var2.vNUvnnVnUvu()) {
            if (var2.nvUVNnuu()) {
               if (var8) {
                  var2.C00OOC00oO(var1, var3, var4, var5, var6, var7, var9);
               } else if (!var2.UuUVuuUu(var3, var4, var5, var6, var7, false, var9, 1)) {
                  var1.UuUVuuUu(var3, var4, var5, var6, var7, var2.C00OOC00oO(var9));
               }
            } else {
               var1.UuUVuuUu(var3, var4, var5, var6, var7, var8 ? var2.uUnuvNvvNU(var9) : var2.C00OOC00oO(var9));
            }
         }
      }
   }

   private NVunNNNNuN.NVnVnNnN UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = nNuUNVu.UuUVuuUu().UuUVuuUu(this.UuuNnUvUuv(), var5, var6);
      float var8 = this.UuUVuuUu(var3, var4, var5, var6, var7);
      this.NVNnnvVnvV = var8;
      this.vUNuuvvnVnv = var8;
      float var9 = Math.round(var5 * this.NVNnnvVnvV);
      float var10 = Math.round(var6 * this.vUNuuvvnVnv);
      float var11 = this.vVvuUVnV[this.nNVVUnuVVVuV];
      float var12 = this.nvuUVvuuN[this.nNVVUnuVVVuV];
      float var13 = var1 + (var3 - var9) * 0.5F + var11;
      float var14 = var2 + (var4 - var10) * 0.5F + var12;
      float var15 = this.UuUVuuUu(10.0F);
      var13 = UuUVuuUu(var13, var1 + var15, Math.max(var1 + var15, var1 + var3 - var15 - var9));
      var14 = UuUVuuUu(var14, var2 + var15, Math.max(var2 + var15, var2 + var4 - var15 - var10));
      return this.vunuUUVVUv.UuUVuuUu(Math.round(var13), Math.round(var14), var9, var10);
   }

   private float UuUVuuUu(float var1, float var2, float var3, float var4, float var5) {
      float var6 = Math.max(this.UuUVuuUu(60.0F), var1 - this.UuUVuuUu(72.0F));
      float var7 = Math.max(this.UuUVuuUu(60.0F), var2 - this.UuUVuuUu(72.0F));
      float var8 = Math.min(var6 / Math.max(1.0F, var3), var7 / Math.max(1.0F, var4));
      var8 = UuUVuuUu(var8 * 0.76F, 0.55F, 1.7F);
      float var9 = Math.max(0.35F, (var1 - this.UuUVuuUu(22.0F)) / Math.max(1.0F, var3));
      float var10 = Math.max(0.35F, (var2 - this.UuUVuuUu(22.0F)) / Math.max(1.0F, var4));
      return UuUVuuUu(var8 * var5, 0.35F, Math.min(var9, var10));
   }

   private float UuUVuuUu(String var1, nUVnuvUu var2, String var3, String[] var4, String[] var5, float var6, boolean var7, unUuuVVuNnNN.NVnVnNnN var8) {
      float var9 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var1, var8.UuuNnUvUuv);
      float var10 = 0.0F;
      float var11 = 0.0F;

      for (int var12 = 0; var12 < var4.length; var12++) {
         var10 = Math.max(var10, vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var4[var12], var6));
         if (var12 < var5.length) {
            var11 = Math.max(var11, vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var5[var12], var6));
         }
      }

      float var14 = var10 + 24.0F;
      if (var7) {
         var14 += var8.uVUuuVnNVU + var11 + 20.0F + var8.UnUNVVVNuv;
      }

      float var13 = var9 + var8.nUUVuvU + 36.0F;
      return Math.max(var14 + var8.vNUvnnVnUvu * 2.0F, var13 + var8.vNUvnnVnUvu * 2.0F);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void vVvUvVVuuNvV(UnVNvNnU var1, NUunUunuNV var2) {
      unUuuVVuNnNN.NVnVnNnN var3 = this.uVUuuVnNVU();
      this.uNNnnnuuuN();
      float var4 = this.uNUnuUUvvuU.UuUVuuUu;
      float var5 = this.uNUnuUUvvuU.C00OOC00oO;
      float var6 = this.uNUnuUUvvuU.uUnuvNvvNU;
      float var7 = this.uNUnuUUvvuU.vVvUvVVuuNvV;
      NVunNNNNuN.VvunVVUvUNnv var8 = this.nvUVNnuu();
      String[] var9 = this.UuUVuuUu(var8.kind);
      if (!UuUVuuUu(var9, this.uuuNUnuvvNNv)) {
         this.uuuNUnuvvNNv = var9[0];
      }

      this.UuUVuuUu(var1, var2, var4, var5, var6, var7);
      float var10 = Math.round(this.UuUVuuUu(50.0F));
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var4 + this.UuUVuuUu(16.0F), var5 + this.UuUVuuUu(20.0F), this.UuUVuuUu(13.0F), var8.label, C00OOC00oO(var2));
      var1.UuUVuuUu(
         vNvnnVvvVUu.vVvUvVVuuNvV, var4 + this.UuUVuuUu(16.0F), var5 + this.UuUVuuUu(39.0F), this.UuUVuuUu(16.0F), this.UnUNVVVNuv(), var2.NVNnnvnuunNv()
      );
      this.UuUVuuUu(var1, var2, var4 + this.UuUVuuUu(14.0F), var5 + var10, var6 - this.UuUVuuUu(28.0F));
      float var11 = var5 + var10 + this.UuUVuuUu(1.0F);
      float var12 = Math.max(this.UuUVuuUu(40.0F), var5 + var7 - var11 - this.UuUVuuUu(8.0F));
      this.vvVVVvVNVVVN.UuUVuuUu(var4 + this.UuUVuuUu(4.0F), var11, var6 - this.UuUVuuUu(8.0F), var12);
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(
         this.vvVVVvVNVVVN.UuUVuuUu,
         this.vvVVVvVNVVVN.C00OOC00oO,
         this.vvVVVvVNVVVN.uUnuvNvvNU,
         this.vvVVVvVNVVVN.vVvUvVVuuNvV,
         this.UuUVuuUu(8.0F),
         this.UuUVuuUu(8.0F),
         this.UuUVuuUu(8.0F),
         this.UuUVuuUu(8.0F)
      );
      boolean var23 = false /* VF: Semaphore variable */;

      try {
         var23 = true;
         float var13 = var4 + this.UuUVuuUu(16.0F);
         float var14 = var6 - this.UuUVuuUu(32.0F);
         float var15 = var11 + this.UuUVuuUu(12.0F) - this.unnnNUNnVu;
         if (!var8.layoutBacked) {
            var15 = this.C00OOC00oO(var1, var2, var13, var15, var14);
         }

         var15 = this.UuUVuuUu(var1, var2, var13, var15, var14, var9);
         var15 += this.UuUVuuUu(15.0F);
         var15 = this.UuUVuuUu(var1, var2, var13, var15, var14, "ACTIONS");
         var15 = this.uUnuvNvvNU(var1, var2, var13, var15, var14);
         var15 += this.UuUVuuUu(15.0F);
         var15 = this.UuUVuuUu(var1, var2, var13, var15, var14, "PRESETS");
         var15 = this.UuUVuuUu(var1, var2, var13, var15, var14, var3);
         String var16 = null;

         for (NVunNNNNuN.uunvUUVnuNn var20 : vVVuuVVv) {
            if (this.UuUVuuUu(var8, var20.id)) {
               if (!var20.section.equals(var16)) {
                  var15 += this.UuUVuuUu(15.0F);
                  var15 = this.UuUVuuUu(var1, var2, var13, var15, var14, var20.section);
                  var16 = var20.section;
               }

               var15 = this.UuUVuuUu(var1, var2, var13, var15, var14, var20, this.UuUVuuUu(var3, var20.id));
            }
         }

         var15 += this.UuUVuuUu(6.0F);
         var15 = this.UuUVuuUu(var1, var2, var13, var15);
         var15 += this.UuUVuuUu(14.0F);
         float var36 = this.vvVVVvVNVVVN.C00OOC00oO + this.vvVVVvVNVVVN.vVvUvVVuuNvV;
         this.NvnnUUuVvNU = Math.max(0.0F, var15 + this.unnnNUNnVu - var36);
         this.unnnNUNnVu = UuUVuuUu(this.unnnNUNnVu, 0.0F, this.NvnnUUuVvNU);
         var23 = false;
      } finally {
         if (var23) {
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }
      }

      var1.uUnuvNvvNU();
      var1.nuUnNvnuUu();
      this.NnUVNnuvUv.UuUVuuUu();
      this.NnUVNnuvUv.UuUVuuUu(this.uNUnuUUvvuU.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu) ? 1.0 : 0.0, 0.22F, VvVUUNUu.UnUNVVVNuv, false);
      this.UuUVuuUu(
         var1,
         var2,
         var4 + var6 - this.UuUVuuUu(7.0F),
         this.vvVVVvVNVVVN.C00OOC00oO,
         this.vvVVVvVNVVVN.vVvUvVVuuNvV,
         this.unnnNUNnVu,
         this.NvnnUUuVvNU,
         this.NnUVNnuvUv.uNNnnnuuuN()
      );
   }

   private void uNNnnnuuuN() {
      for (NVunNNNNuN.uunvUUVnuNn var4 : vVVuuVVv) {
         this.NnuUnUNnu.get(var4.id).UuUVuuUu();
      }

      for (String var11 : vNnNuuvVn) {
         this.UnnnvvU.get(var11).UuUVuuUu();
      }

      for (String var12 : VUuuVUnun) {
         this.VUUnuVvVu.get(var12).UuUVuuUu();
      }
   }

   private float UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2, float var3, float var4, float var5, String var6) {
      var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var3, var4 + this.UuUVuuUu(10.0F), this.UuUVuuUu(12.0F), var6, C00OOC00oO(var2));
      float var7 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var6, this.UuUVuuUu(12.0F));
      float var8 = var3 + var7 + this.UuUVuuUu(10.0F);
      this.UuUVuuUu(var1, var2, var8, var4 + this.UuUVuuUu(6.0F), Math.max(0.0F, var3 + var5 - var8));
      return var4 + this.UuUVuuUu(24.0F);
   }

   private float C00OOC00oO(UnVNvNnU var1, NUunUunuNV var2, float var3, float var4, float var5) {
      float var6 = this.UuUVuuUu(46.0F);
      int var7 = var2.uUnuvNvvNU();
      var1.UuUVuuUu(
         (float)Math.round(var3),
         (float)Math.round(var4),
         (float)Math.round(var5),
         (float)Math.round(var6),
         this.UuUVuuUu(10.0F),
         NUunUunuNV.UuUVuuUu(var7, var2.uNnUnnuNUnNu() ? 26 : 20)
      );
      var1.UuUVuuUu(
         (float)Math.round(var3),
         (float)Math.round(var4),
         (float)Math.round(var5),
         (float)Math.round(var6),
         this.UuUVuuUu(10.0F),
         NUunUunuNV.UuUVuuUu(var7, 72),
         1.0F
      );
      float var8 = Math.round(this.UuUVuuUu(6.0F));
      var1.UuUVuuUu((float)Math.round(var3 + this.UuUVuuUu(14.0F)), (float)Math.round(var4 + var6 * 0.5F - var8 * 0.5F), var8, var8, var8 * 0.5F, var7);
      float var9 = var3 + this.UuUVuuUu(14.0F) + var8 + this.UuUVuuUu(10.0F);
      var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var9, var4 + this.UuUVuuUu(19.0F), this.UuUVuuUu(12.5F), "Style preview", NUunUunuNV.UuUVuuUu(var7, 240));
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var9, var4 + this.UuUVuuUu(34.0F), this.UuUVuuUu(12.0F), "Position & scale stay live", UuUVuuUu(var2));
      return var4 + var6 + this.UuUVuuUu(12.0F);
   }

   private float UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2, float var3, float var4, float var5, String[] var6) {
      int var7 = var6.length;
      int var8 = var7 <= 4 ? 1 : 2;
      int var9 = (int)Math.ceil((float)var7 / var8);
      float var10 = this.UuUVuuUu(7.0F);
      float var11 = this.UuUVuuUu(7.0F);
      float var12 = this.UuUVuuUu(33.0F);
      float var13 = this.UuUVuuUu(15.0F);
      float var14 = this.UuUVuuUu(9.0F);
      float var15 = (var5 - var10 * (var9 - 1)) / var9;
      NVunNNNNuN.NVnVnNnN var16 = null;

      for (int var17 = 0; var17 < var7; var17++) {
         String var18 = var6[var17];
         int var19 = var17 % var9;
         int var20 = var17 / var9;
         float var21 = var3 + var19 * (var15 + var10);
         float var22 = var4 + var20 * (var12 + var11);
         NVunNNNNuN.NVnVnNnN var23 = this.UnnnvvU.get(var18);
         var23.UuUVuuUu(Math.round(var21), Math.round(var22), Math.round(var15), Math.round(var12));
         if (var18.equals(this.uuuNUnuvvNNv)) {
            var16 = var23;
         }
      }

      if (var16 != null) {
         this.nNunUnVN.UuUVuuUu();
         this.VnVuuvVvnNv.UuUVuuUu();
         this.vuvvuVuVv.UuUVuuUu();
         this.uunNUuunVU.UuUVuuUu();
         boolean var25 = !this.uuuNUnuvvNNv.equals(this.UuuuNNunN);
         if (!(this.vuvvuVuVv.uNNnnnuuuN() <= 0.0F) && var25) {
            this.nNunUnVN.UuUVuuUu(var16.UuUVuuUu, 0.22F, VvVUUNUu.nvUVNnuu, false);
            this.VnVuuvVvnNv.UuUVuuUu(var16.C00OOC00oO, 0.22F, VvVUUNUu.nvUVNnuu, false);
            this.vuvvuVuVv.UuUVuuUu(var16.uUnuvNvvNU, 0.22F, VvVUUNUu.nvUVNnuu, false);
            this.uunNUuunVU.UuUVuuUu(var16.vVvUvVVuuNvV, 0.22F, VvVUUNUu.nvUVNnuu, false);
            if (Math.abs(this.nNunUnVN.uNNnnnuuuN() - var16.UuUVuuUu) < 0.6F && Math.abs(this.VnVuuvVvnNv.uNNnnnuuuN() - var16.C00OOC00oO) < 0.6F) {
               this.UuuuNNunN = this.uuuNUnuvvNNv;
            }
         } else {
            this.nNunUnVN.nuUnNvnuUu(var16.UuUVuuUu);
            this.VnVuuvVvnNv.nuUnNvnuUu(var16.C00OOC00oO);
            this.vuvvuVuVv.nuUnNvnuUu(var16.uUnuvNvvNU);
            this.uunNUuunVU.nuUnNvnuUu(var16.vVvUvVVuuNvV);
            this.UuuuNNunN = this.uuuNUnuvvNNv;
         }

         float var27 = Math.round(this.nNunUnVN.uNNnnnuuuN());
         float var29 = Math.round(this.VnVuuvVvnNv.uNNnnnuuuN());
         float var31 = Math.round(this.vuvvuVuVv.uNNnnnuuuN());
         float var33 = Math.round(this.uunNUuunVU.uNNnnnuuuN());
         var1.UuUVuuUu(var27, var29, var31, var33, var14, this.UuUVuuUu(7.0F), this.UuUVuuUu(0.5F), UuUVuuUu(var2, var2.uNnUnnuNUnNu() ? 34 : 46));
         var1.UuUVuuUu(var27, var29, var31, var33, var14, UuUVuuUu(var2, var2.uNnUnnuNUnNu() ? 42 : 36));
         var1.UuUVuuUu(var27, var29, var31, var33, var14, UuUVuuUu(var2, var2.uNnUnnuNUnNu() ? 98 : 76), 1.0F);
      }

      for (String var32 : var6) {
         NVunNNNNuN.NVnVnNnN var34 = this.UnnnvvU.get(var32);
         boolean var35 = var32.equals(this.uuuNUnuvvNNv);
         float var36 = this.C00OOC00oO(var32, !var34.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu) && !var35 ? 0.0F : 1.0F);
         if (!var35) {
            var1.UuUVuuUu(
               var34.UuUVuuUu,
               var34.C00OOC00oO,
               var34.uUnuvNvvNU,
               var34.vVvUvVVuuNvV,
               var14,
               NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), Math.round((var2.uNnUnnuNUnNu() ? 12.0F : 9.0F) + var36 * (var2.uNnUnnuNUnNu() ? 14.0F : 11.0F)))
            );
            var1.UuUVuuUu(var34.UuUVuuUu, var34.C00OOC00oO, var34.uUnuvNvvNU, var34.vVvUvVVuuNvV, var14, var2.UuuNnUvUuv(), 1.0F);
         }

         int var24 = var35 ? var2.NVNnnvnuunNv() : NUunUunuNV.UuUVuuUu(UuUVuuUu(var2), var2.NVNnnvnuunNv(), var36 * 0.4F);
         this.UuUVuuUu(
            var1, vNvnnVvvVUu.UuUVuuUu, this.vVvUvVVuuNvV(var32), var34.UuUVuuUu, var34.C00OOC00oO, var34.uUnuvNvvNU, var34.vVvUvVVuuNvV, var13, var24
         );
      }

      return var4 + var8 * var12 + (var8 - 1) * var11;
   }

   private float uUnuvNvvNU(UnVNvNnU var1, NUunUunuNV var2, float var3, float var4, float var5) {
      float var6 = this.UuUVuuUu(8.0F);
      float var7 = (var5 - var6 * 2.0F) / 3.0F;
      float var8 = this.UuUVuuUu(34.0F);
      this.UuUVuuUu(var1, var2, "centerX", var3, var4, var7, var8, "Center X", false, false);
      this.UuUVuuUu(var1, var2, "centerY", var3 + var7 + var6, var4, var7, var8, "Center Y", false, false);
      this.UuUVuuUu(var1, var2, "reset", var3 + (var7 + var6) * 2.0F, var4, var7, var8, "Reset", false, false);
      return var4 + var8;
   }

   private float UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2, float var3, float var4, float var5, unUuuVVuNnNN.NVnVnNnN var6) {
      float var7 = this.UuUVuuUu(8.0F);
      float var8 = (var5 - var7 * 2.0F) / 3.0F;
      float var9 = this.UuUVuuUu(34.0F);
      int var10 = this.UuUVuuUu(var6);
      this.UuUVuuUu(var1, var2, "presetSoft", var3, var4, var8, var9, "Soft", true, var10 == 0);
      this.UuUVuuUu(var1, var2, "presetCompact", var3 + var8 + var7, var4, var8, var9, "Compact", true, var10 == 1);
      this.UuUVuuUu(var1, var2, "presetSharp", var3 + (var8 + var7) * 2.0F, var4, var8, var9, "Sharp", true, var10 == 2);
      return var4 + var9;
   }

   private int UuUVuuUu(unUuuVVuNnNN.NVnVnNnN var1) {
      if (this.UuUVuuUu(var1, 17.0F, 8.0F)) {
         return 0;
      } else if (this.UuUVuuUu(var1, 10.0F, 5.0F)) {
         return 1;
      } else {
         return this.UuUVuuUu(var1, 4.0F, 7.0F) ? 2 : -1;
      }
   }

   private boolean UuUVuuUu(unUuuVVuNnNN.NVnVnNnN var1, float var2, float var3) {
      return Math.abs(var1.UuUVuuUu - var2) < 1.2F && Math.abs(var1.vNUvnnVnUvu - var3) < 1.2F;
   }

   private void UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2, String var3, float var4, float var5, float var6, float var7, String var8, boolean var9, boolean var10) {
      NVunNNNNuN.NVnVnNnN var11 = this.VUUnuVvVu.get(var3);
      var11.UuUVuuUu(Math.round(var4), Math.round(var5), Math.round(var6), Math.round(var7));
      float var12 = this.C00OOC00oO(var3, var11.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu) ? 1.0F : 0.0F);
      float var13 = this.UuUVuuUu(11.0F);
      int var14;
      int var15;
      int var16;
      if (var10) {
         var14 = UuUVuuUu(var2, var2.uNnUnnuNUnNu() ? 44 : 38);
         var15 = UuUVuuUu(var2, var2.uNnUnnuNUnNu() ? 108 : 84);
         var16 = var2.NVNnnvnuunNv();
      } else {
         int var17 = var9 ? UuUVuuUu(var2, var2.uNnUnnuNUnNu() ? 22 : 18) : NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), var2.uNnUnnuNUnNu() ? 16 : 12);
         var14 = NUunUunuNV.UuUVuuUu(var17, UuUVuuUu(var2, var2.uNnUnnuNUnNu() ? 42 : 36), var12);
         var15 = NUunUunuNV.UuUVuuUu(var2.UuuNnUvUuv(), UuUVuuUu(var2, 92), var12);
         var16 = NUunUunuNV.UuUVuuUu(UuUVuuUu(var2), var2.NVNnnvnuunNv(), 0.2F + var12 * 0.6F);
      }

      var1.UuUVuuUu(var11.UuUVuuUu, var11.C00OOC00oO, var11.uUnuvNvvNU, var11.vVvUvVVuuNvV, var13, var14);
      var1.UuUVuuUu(var11.UuUVuuUu, var11.C00OOC00oO, var11.uUnuvNvvNU, var11.vVvUvVVuuNvV, var13, var15, 1.0F);
      this.UuUVuuUu(var1, vNvnnVvvVUu.vVvUvVVuuNvV, var8, var11.UuUVuuUu, var11.C00OOC00oO, var11.uUnuvNvvNU, var11.vVvUvVVuuNvV, this.UuUVuuUu(15.0F), var16);
   }

   private float UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2, float var3, float var4, float var5, NVunNNNNuN.uunvUUVnuNn var6, float var7) {
      float var8 = UuUVuuUu((var7 - var6.min) / Math.max(0.001F, var6.max - var6.min), 0.0F, 1.0F);
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var3, var4 + this.UuUVuuUu(11.0F), this.UuUVuuUu(13.5F), var6.label, UuUVuuUu(var2));
      String var9 = this.vUvUvUNNuNvn.get(var6.id);
      if (var9 == null) {
         var9 = "";
      }

      float var10 = this.UuUVuuUu(13.5F);
      float var11 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var9, var10);
      var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var3 + var5 - var11, var4 + this.UuUVuuUu(11.0F), var10, var9, var2.vVvUvVVuuNvV());
      float var12 = Math.round(var4 + this.UuUVuuUu(24.0F));
      float var13 = Math.max(2.0F, (float)Math.round(this.UuUVuuUu(4.0F)));
      float var14 = Math.round(var3);
      float var15 = Math.round(var5);
      float var16 = var13 * 0.5F;
      float var17 = UuUVuuUu(this.UuUVuuUu(var8, var6.id), 0.0F, 1.0F);
      float var18 = Math.max(0.0F, var15 * var17);
      NVunNNNNuN.NVnVnNnN var19 = this.NnuUnUNnu.get(var6.id);
      var19.UuUVuuUu(var14, Math.round(var12 - this.UuUVuuUu(11.0F)), var15, Math.round(this.UuUVuuUu(26.0F)));
      boolean var20 = var6.id.equals(this.NvNUuuuvUvu);
      float var21 = this.C00OOC00oO(var6.id + ".thumb", !var19.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu) && !var20 ? 0.0F : 1.0F);
      var1.UuUVuuUu(var14, var12, var15, var13, var16, var2.nUUVuvU());
      if (var18 > 1.0F) {
         var1.UuUVuuUu(var14, var12, var18, var13, var16, this.UuUVuuUu(4.0F), this.UuUVuuUu(0.5F), UuUVuuUu(var2, Math.round(36.0F + var21 * 70.0F)));
         var1.UuUVuuUu(var14, var12, var18, var13, var16, var2.uVunuUNVVUUV(), C00OOC00oO(var2, 205));
      }

      float var22 = var14 + var18;
      float var23 = var12 + var13 * 0.5F;
      float var24 = this.UuUVuuUu(7.0F) + var21 * this.UuUVuuUu(1.0F);
      int var25 = Math.round((var20 ? 150.0F : 68.0F) + var21 * 95.0F);
      var1.UuUVuuUu(var22 - var24, var23 - var24, var24 * 2.0F, var24 * 2.0F, var24, this.UuUVuuUu(6.0F), this.UuUVuuUu(0.5F), UuUVuuUu(var2, var25));
      var1.C00OOC00oO(var22, var23, var24, 0.0F, 1.0F, UuUVuuUu(var2, 240));
      var1.C00OOC00oO(var22, var23, var24 - this.UuUVuuUu(1.6F), 0.0F, 1.0F, var2.NVNnnvnuunNv());
      return var4 + this.UuUVuuUu(40.0F);
   }

   private float UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2, float var3, float var4) {
      unUuuVVuNnNN.VvunVVUvUNnv var5 = this.vNUvnnVnUvu();
      if (var5 == null) {
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var3, var4 + this.UuUVuuUu(13.0F), this.UuUVuuUu(13.0F), "Drag title, modules, binds or icon", C00OOC00oO(var2));
         return var4 + this.UuUVuuUu(22.0F);
      } else if ("icon".equals(this.uuuNUnuvvNNv)) {
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var3, var4 + this.UuUVuuUu(13.0F), this.UuUVuuUu(13.0F), this.vNnNNNuVVnUv, UuUVuuUu(var2));
         return var4 + this.UuUVuuUu(22.0F);
      } else {
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var3, var4 + this.UuUVuuUu(13.0F), this.UuUVuuUu(13.0F), this.vnVuunuNN, UuUVuuUu(var2));
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var3 + this.UuUVuuUu(102.0F), var4 + this.UuUVuuUu(13.0F), this.UuUVuuUu(13.0F), this.UvUNuNvvNVNv, UuUVuuUu(var2));
         return var4 + this.UuUVuuUu(22.0F);
      }
   }

   private void uNNnnnuuuN(UnVNvNnU var1, NUunUunuNV var2) {
      this.UuUVuuUu(var1, var2, this.VUNvNUuNVnn, "panel");
      this.UuUVuuUu(var1, var2, this.UNNunNuUNVuU, "header");
      this.UuUVuuUu(var1, var2, this.NuUuUvUUvU, "content");
      this.UuUVuuUu(var1, var2, this.VUVvNvvVUN, "modules");
      this.UuUVuuUu(var1, var2, this.UvvNuvUNNNUv, "binds");
      this.UuUVuuUu(var1, var2, this.NunUUVVVuu, "slots");
      this.UuUVuuUu(var1, var2, this.UvuVvvVuUuuu, "title");
      this.UuUVuuUu(var1, var2, this.NUUVUvvuNNVU, "icon");
   }

   private void nuUnNvnuUu(UnVNvNnU var1, NUunUunuNV var2) {
      if (!(this.VUNvNUuNVnn.uUnuvNvvNU <= 0.0F) && !(this.VUNvNUuNVnn.vVvUvVVuuNvV <= 0.0F)) {
         if (this.CC0COO && (this.VnnnvUunNvuu || this.VuuUVVu)) {
            int var3 = UuUVuuUu(var2, 170);
            if (this.VnnnvUunNvuu) {
               var1.UuUVuuUu(
                  (float)Math.round(this.uUuuVvVunVVu.UuUVuuUu + this.uUuuVvVunVVu.uUnuvNvvNU * 0.5F),
                  (float)Math.round(this.uUuuVvVunVVu.C00OOC00oO),
                  Math.max(1.0F, this.UuUVuuUu(1.0F)),
                  (float)Math.round(this.uUuuVvVunVVu.vVvUvVVuuNvV),
                  0.0F,
                  var3
               );
            }

            if (this.VuuUVVu) {
               var1.UuUVuuUu(
                  (float)Math.round(this.uUuuVvVunVVu.UuUVuuUu),
                  (float)Math.round(this.uUuuVvVunVVu.C00OOC00oO + this.uUuuVvVunVVu.vVvUvVVuuNvV * 0.5F),
                  (float)Math.round(this.uUuuVvVunVVu.uUnuvNvvNU),
                  Math.max(1.0F, this.UuUVuuUu(1.0F)),
                  0.0F,
                  var3
               );
            }
         }

         float var13 = !this.CC0COO && !this.uNnNUNvuVnu ? 0.0F : 1.0F;
         float var4 = Math.min(this.UuUVuuUu(10.0F), Math.min(this.VUNvNUuNVnn.uUnuvNvvNU, this.VUNvNUuNVnn.vVvUvVVuuNvV) * 0.25F);
         int var5 = NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), Math.round(110.0F + var13 * 100.0F));
         if (var13 > 0.0F) {
            var1.UuUVuuUu(
               this.VUNvNUuNVnn.UuUVuuUu,
               this.VUNvNUuNVnn.C00OOC00oO,
               this.VUNvNUuNVnn.uUnuvNvvNU,
               this.VUNvNUuNVnn.vVvUvVVuuNvV,
               var4,
               this.UuUVuuUu(9.0F),
               this.UuUVuuUu(1.0F),
               NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), 42)
            );
         }

         var1.UuUVuuUu(
            (float)Math.round(this.VUNvNUuNVnn.UuUVuuUu),
            (float)Math.round(this.VUNvNUuNVnn.C00OOC00oO),
            (float)Math.round(this.VUNvNUuNVnn.uUnuvNvvNU),
            (float)Math.round(this.VUNvNUuNVnn.vVvUvVVuuNvV),
            var4,
            var5,
            Math.max(1.0F, this.UuUVuuUu(1.25F))
         );
         float var6 = this.UuUVuuUu(17.0F);
         float var7 = Math.round(this.VUNvNUuNVnn.UuUVuuUu + this.VUNvNUuNVnn.uUnuvNvvNU - var6 * 0.72F);
         float var8 = Math.round(this.VUNvNUuNVnn.C00OOC00oO + this.VUNvNUuNVnn.vVvUvVVuuNvV - var6 * 0.72F);
         this.NuUvUNN.UuUVuuUu(var7 - this.UuUVuuUu(3.0F), var8 - this.UuUVuuUu(3.0F), var6 + this.UuUVuuUu(6.0F), var6 + this.UuUVuuUu(6.0F));
         float var9 = this.C00OOC00oO("preview.resize", !this.NuUvUNN.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu) && !this.uNnNUNvuVnu ? 0.0F : 1.0F);
         float var10 = Math.max(1.0F, (float)Math.round(var6));
         var1.UuUVuuUu(
            var7,
            var8,
            var10,
            var10,
            this.UuUVuuUu(5.0F),
            NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var2.nuUnNvnuUu(), 228), NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), 92), var9)
         );
         var1.UuUVuuUu(
            var7,
            var8,
            var10,
            var10,
            this.UuUVuuUu(5.0F),
            NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), Math.round(105.0F + var9 * 100.0F)),
            Math.max(1.0F, this.UuUVuuUu(1.0F))
         );
         float var11 = Math.max(1.0F, this.UuUVuuUu(1.0F));
         int var12 = NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), Math.round(130.0F + var9 * 100.0F));
         var1.UuUVuuUu(
            (float)Math.round(var7 + this.UuUVuuUu(5.0F)),
            (float)Math.round(var8 + this.UuUVuuUu(11.0F)),
            Math.max(1.0F, (float)Math.round(this.UuUVuuUu(7.0F))),
            Math.max(1.0F, (float)Math.round(var11)),
            var11 * 0.5F,
            var12
         );
         var1.UuUVuuUu(
            (float)Math.round(var7 + this.UuUVuuUu(8.0F)),
            (float)Math.round(var8 + this.UuUVuuUu(8.0F)),
            Math.max(1.0F, (float)Math.round(this.UuUVuuUu(4.0F))),
            Math.max(1.0F, (float)Math.round(var11)),
            var11 * 0.5F,
            var12
         );
         var1.UuUVuuUu(
            (float)Math.round(var7 + this.UuUVuuUu(11.0F)),
            (float)Math.round(var8 + this.UuUVuuUu(5.0F)),
            Math.max(1.0F, (float)Math.round(var11)),
            Math.max(1.0F, (float)Math.round(var11)),
            var11 * 0.5F,
            var12
         );
      } else {
         this.NuUvUNN.UuUVuuUu();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2, NVunNNNNuN.NVnVnNnN var3, String var4) {
      if (var3 != null && !(var3.uUnuvNvvNU <= 0.0F) && !(var3.vVvUvVVuuNvV <= 0.0F)) {
         boolean var5 = var4.equals(this.uuuNUnuvvNNv);
         boolean var6 = var3.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu);
         float var7 = this.uUnuvNvvNU(var4, !var5 && !var6 ? 0.0F : 1.0F);
         int var8 = var5 ? NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), 210) : NUunUunuNV.UuUVuuUu(var2.NVNnnvnuunNv(), Math.round(30.0F + var7 * 72.0F));
         var1.UuUVuuUu(
            (float)Math.round(var3.UuUVuuUu),
            (float)Math.round(var3.C00OOC00oO),
            Math.max(1.0F, (float)Math.round(var3.uUnuvNvvNU)),
            Math.max(1.0F, (float)Math.round(var3.vVvUvVVuuNvV)),
            this.UuUVuuUu(4.0F),
            var8,
            var5 ? Math.max(1.5F, this.UuUVuuUu(1.5F)) : Math.max(1.0F, this.UuUVuuUu(1.0F))
         );
      }
   }

   private String UuUVuuUu(float var1, float var2) {
      if (this.UvuVvvVuUuuu.UuUVuuUu(var1, var2)) {
         return "title";
      } else if (this.NUUVUvvuNNVU.UuUVuuUu(var1, var2)) {
         return "icon";
      } else if (this.NunUUVVVuu.UuUVuuUu(var1, var2)) {
         return "slots";
      } else if (this.VUVvNvvVUN.UuUVuuUu(var1, var2)) {
         return "modules";
      } else if (this.UvvNuvUNNNUv.UuUVuuUu(var1, var2)) {
         return "binds";
      } else if (this.UNNunNuUNVuU.UuUVuuUu(var1, var2)) {
         return "header";
      } else if (this.NuUuUvUUvU.UuUVuuUu(var1, var2)) {
         return "content";
      } else {
         return this.VUNvNUuNVnn.UuUVuuUu(var1, var2) ? "panel" : null;
      }
   }

   private void C00OOC00oO(float var1, float var2) {
      if (!(this.uUuuVvVunVVu.uUnuvNvvNU <= 0.0F)
         && !(this.uUuuVvVunVVu.vVvUvVVuuNvV <= 0.0F)
         && !(this.VUNvNUuNVnn.uUnuvNvvNU <= 0.0F)
         && !(this.VUNvNUuNVnn.vVvUvVVuuNvV <= 0.0F)) {
         float var3 = this.UuUVuuUu(10.0F);
         float var4 = this.uUuuVvVunVVu.UuUVuuUu + var3;
         float var5 = this.uUuuVvVunVVu.C00OOC00oO + var3;
         float var6 = this.uUuuVvVunVVu.UuUVuuUu + this.uUuuVvVunVVu.uUnuvNvvNU - this.VUNvNUuNVnn.uUnuvNvvNU - var3;
         float var7 = this.uUuuVvVunVVu.C00OOC00oO + this.uUuuVvVunVVu.vVvUvVVuuNvV - this.VUNvNUuNVnn.vVvUvVVuuNvV - var3;
         float var8 = UuUVuuUu(this.VUNvNUuNVnn.UuUVuuUu + var1, var4, Math.max(var4, var6));
         float var9 = UuUVuuUu(this.VUNvNUuNVnn.C00OOC00oO + var2, var5, Math.max(var5, var7));
         float var10 = this.UuUVuuUu(7.0F);
         float var11 = this.uUuuVvVunVVu.UuUVuuUu + (this.uUuuVvVunVVu.uUnuvNvvNU - this.VUNvNUuNVnn.uUnuvNvvNU) * 0.5F;
         float var12 = this.uUuuVvVunVVu.C00OOC00oO + (this.uUuuVvVunVVu.vVvUvVVuuNvV - this.VUNvNUuNVnn.vVvUvVVuuNvV) * 0.5F;
         this.VnnnvUunNvuu = Math.abs(var8 - var11) < var10;
         this.VuuUVVu = Math.abs(var9 - var12) < var10;
         if (this.VnnnvUunNvuu) {
            var8 = UuUVuuUu(var11, var4, Math.max(var4, var6));
         } else if (Math.abs(var8 - var4) < var10) {
            var8 = var4;
         } else if (Math.abs(var8 - var6) < var10) {
            var8 = Math.max(var4, var6);
         }

         if (this.VuuUVVu) {
            var9 = UuUVuuUu(var12, var5, Math.max(var5, var7));
         } else if (Math.abs(var9 - var5) < var10) {
            var9 = var5;
         } else if (Math.abs(var9 - var7) < var10) {
            var9 = Math.max(var5, var7);
         }

         this.vVvuUVnV[this.nNVVUnuVVVuV] = this.vVvuUVnV[this.nNVVUnuVVVuV] + (var8 - this.VUNvNUuNVnn.UuUVuuUu);
         this.nvuUVvuuN[this.nNVVUnuVVVuV] = this.nvuUVvuuN[this.nNVVUnuVVVuV] + (var9 - this.VUNvNUuNVnn.C00OOC00oO);
         this.vVvUvVVuuNvV(var8, var9);
      }
   }

   private void uUnuvNvvNU(float var1, float var2) {
      float var3 = var1 - this.nUNnuUNnV;
      float var4 = var2 - this.VuNVnvNNuNnn;
      float var5 = Math.max(1.0F, this.uvVuuuvvVU * this.uvVuuuvvVU + this.NNnvvunuVNUn * this.NNnvvunuVNUn);
      float var6 = 1.0F + (var3 * this.uvVuuuvvVU + var4 * this.NNnvvunuVNUn) / var5;
      nNuUNVu.VUnuUnnuNvVu var7 = nNuUNVu.UuUVuuUu()
         .UuUVuuUu(this.UuuNnUvUuv(), this.NuvunVvnnN * var6, this.NUuVnnuUnvu, this.vnuNNVvVVuN, this.nVuuUnnUUVU, this.nUununvNvvn);
      if (var7 != null) {
         float var8 = this.UuUVuuUu(this.uUuuVvVunVVu.uUnuvNvvNU, this.uUuuVvVunVVu.vVvUvVVuuNvV, this.nVuuUnnUUVU, this.nUununvNvvn, var7.scaleX());
         float var9 = var8 / this.vuvnnvuNVvu;
         float var10 = this.uvVuuuvvVU * var9;
         float var11 = this.NNnvvunuVNUn * var9;
         this.vVvuUVnV[this.nNVVUnuVVVuV] = this.NVvnvnn + (var10 - this.uvVuuuvvVU) * 0.5F;
         this.nvuUVvuuN[this.nNVVUnuVVVuV] = this.vUvVUNnN + (var11 - this.NNnvvunuVNUn) * 0.5F;
         this.uNUnUuUnvnnU = true;
      }
   }

   private void vVvUvVVuuNvV(float var1, float var2) {
      float var3 = this.UuUVuuUu(10.0F);
      float var4 = this.uUuuVvVunVVu.UuUVuuUu + var3;
      float var5 = this.uUuuVvVunVVu.C00OOC00oO + var3;
      float var6 = Math.max(1.0F, this.uUuuVvVunVVu.uUnuvNvvNU - var3 * 2.0F - this.VUNvNUuNVnn.uUnuvNvvNU);
      float var7 = Math.max(1.0F, this.uUuuVvVunVVu.vVvUvVVuuNvV - var3 * 2.0F - this.VUNvNUuNVnn.vVvUvVVuuNvV);
      float var8 = this.VUNvNUuNVnn.uUnuvNvvNU / Math.max(0.001F, this.NVNnnvVnvV);
      float var9 = this.VUNvNUuNVnn.vVvUvVVuuNvV / Math.max(0.001F, this.vUNuuvvnVnv);
      nNuUNVu.UuUVuuUu().uUnuvNvvNU(this.UuuNnUvUuv(), UuUVuuUu((var1 - var4) / var6, 0.0F, 1.0F), UuUVuuUu((var2 - var5) / var7, 0.0F, 1.0F), var8, var9);
      this.uNUnUuUnvnnU = true;
   }

   private String uNNnnnuuuN(float var1, float var2) {
      if (!this.vvVVVvVNVVVN.UuUVuuUu(var1, var2)) {
         return null;
      } else {
         for (Entry var4 : this.NnuUnUNnu.entrySet()) {
            if (((NVunNNNNuN.NVnVnNnN)var4.getValue()).UuUVuuUu(var1, var2)) {
               return (String)var4.getKey();
            }
         }

         return null;
      }
   }

   private String nuUnNvnuUu(float var1, float var2) {
      if (!this.vvVVVvVNVVVN.UuUVuuUu(var1, var2)) {
         return null;
      } else {
         for (Entry var4 : this.VUUnuVvVu.entrySet()) {
            if (!"close".equals(var4.getKey()) && ((NVunNNNNuN.NVnVnNnN)var4.getValue()).UuUVuuUu(var1, var2)) {
               return (String)var4.getKey();
            }
         }

         return null;
      }
   }

   private String VVuuUN(float var1, float var2) {
      if (!this.vvVVVvVNVVVN.UuUVuuUu(var1, var2)) {
         return null;
      } else {
         for (Entry var4 : this.UnnnvvU.entrySet()) {
            if (((NVunNNNNuN.NVnVnNnN)var4.getValue()).UuUVuuUu(var1, var2)) {
               return (String)var4.getKey();
            }
         }

         return null;
      }
   }

   private void C00OOC00oO(float var1) {
      unUuuVVuNnNN.NVnVnNnN var2 = this.uVUuuVnNVU();
      NVunNNNNuN.uunvUUVnuNn var3 = this.C00OOC00oO(this.NvNUuuuvUvu);
      NVunNNNNuN.NVnVnNnN var4 = this.NnuUnUNnu.get(this.NvNUuuuvUvu);
      if (var3 != null && var4 != null) {
         this.UuUVuuUu(var2, var3.id, this.UuUVuuUu(var4, var1, var3.min, var3.max));
         var2.C00OOC00oO();
         this.vUvUvUNNuNvn.put(var3.id, uUnuvNvvNU(this.UuUVuuUu(var2, var3.id)));
         this.Oco0Oococc = true;
      }
   }

   private void UuUVuuUu(String var1) {
      if ("reset".equals(var1)) {
         this.nuUnNvnuUu();
      } else if ("centerX".equals(var1)) {
         this.UuUVuuUu(true, false);
      } else if ("centerY".equals(var1)) {
         this.UuUVuuUu(false, true);
      } else {
         unUuuVVuNnNN.NVnVnNnN var2 = this.uVUuuVnNVU();
         if ("presetSoft".equals(var1)) {
            this.C00OOC00oO(var2);
         } else if ("presetCompact".equals(var1)) {
            this.uUnuvNvvNU(var2);
         } else if ("presetSharp".equals(var1)) {
            this.vVvUvVVuuNvV(var2);
         }

         var2.C00OOC00oO();
         this.UvnvNVnnnnNU();
         this.Oco0Oococc = true;
      }
   }

   private void UuUVuuUu(boolean var1, boolean var2) {
      if (this.vNUvnnVnUvu() == null && !"content".equals(this.uuuNUnuvvNNv)) {
         this.C00OOC00oO(var1, var2);
      } else {
         NVunNNNNuN.NVnVnNnN var3 = this.VVuuUN();
         if (var3 != null && !(var3.uUnuvNvvNU <= 0.0F) && !(this.VUNvNUuNVnn.uUnuvNvvNU <= 0.0F)) {
            unUuuVVuNnNN.NVnVnNnN var4 = this.uVUuuVnNVU();
            float var5 = var1
               ? (this.VUNvNUuNVnn.UuUVuuUu + this.VUNvNUuNVnn.uUnuvNvvNU * 0.5F - (var3.UuUVuuUu + var3.uUnuvNvvNU * 0.5F))
                  / Math.max(0.001F, this.NVNnnvVnvV)
               : 0.0F;
            float var6 = var2
               ? (this.VUNvNUuNVnn.C00OOC00oO + this.VUNvNUuNVnn.vVvUvVVuuNvV * 0.5F - (var3.C00OOC00oO + var3.vVvUvVVuuNvV * 0.5F))
                  / Math.max(0.001F, this.vUNuuvvnVnv)
               : 0.0F;
            if ("title".equals(this.uuuNUnuvvNNv)) {
               var4.UvnvNVnnnnNU.UuUVuuUu += var5;
               var4.UvnvNVnnnnNU.C00OOC00oO += var6;
            } else if ("icon".equals(this.uuuNUnuvvNNv)) {
               var4.uVUVnuvnuVuv.UuUVuuUu += var5;
            } else if ("modules".equals(this.uuuNUnuvvNNv)) {
               var4.NVNnnvnuunNv.UuUVuuUu += var5;
               var4.NVNnnvnuunNv.C00OOC00oO += var6;
            } else if ("binds".equals(this.uuuNUnuvvNNv)) {
               var4.uVunuUNVVUUV.UuUVuuUu += var5;
               var4.uVunuUNVVUUV.C00OOC00oO += var6;
            } else if ("content".equals(this.uuuNUnuvvNNv)) {
               var4.NVNnnvnuunNv.UuUVuuUu += var5;
               var4.uVunuUNVVUUV.UuUVuuUu += var5;
               var4.NVNnnvnuunNv.C00OOC00oO += var6;
               var4.uVunuUNVVUUV.C00OOC00oO += var6;
            }

            var4.C00OOC00oO();
            this.uVUVnuvnuVuv();
            this.Oco0Oococc = true;
         }
      }
   }

   private void C00OOC00oO(boolean var1, boolean var2) {
      if (!(this.VUNvNUuNVnn.uUnuvNvvNU <= 0.0F)
         && !(this.VUNvNUuNVnn.vVvUvVVuuNvV <= 0.0F)
         && !(this.uUuuVvVunVVu.uUnuvNvvNU <= 0.0F)
         && !(this.uUuuVvVunVVu.vVvUvVVuuNvV <= 0.0F)) {
         float var3 = var1 ? this.uUuuVvVunVVu.UuUVuuUu + (this.uUuuVvVunVVu.uUnuvNvvNU - this.VUNvNUuNVnn.uUnuvNvvNU) * 0.5F : this.VUNvNUuNVnn.UuUVuuUu;
         float var4 = var2
            ? this.uUuuVvVunVVu.C00OOC00oO + (this.uUuuVvVunVVu.vVvUvVVuuNvV - this.VUNvNUuNVnn.vVvUvVVuuNvV) * 0.5F
            : this.VUNvNUuNVnn.C00OOC00oO;
         this.vVvuUVnV[this.nNVVUnuVVVuV] = this.vVvuUVnV[this.nNVVUnuVVVuV] + (var3 - this.VUNvNUuNVnn.UuUVuuUu);
         this.nvuUVvuuN[this.nNVVUnuVVVuV] = this.nvuUVvuuN[this.nNVVUnuVVVuV] + (var4 - this.VUNvNUuNVnn.C00OOC00oO);
         this.vVvUvVVuuNvV(var3, var4);
      }
   }

   private void nuUnNvnuUu() {
      unUuuVVuNnNN.C00OOC00oO(this.UuuNnUvUuv());
      this.uuuNUnuvvNNv = this.C00OOC00oO(this.nvUVNnuu().kind);
      this.unnnNUNnVu = 0.0F;
      this.vVvuUVnV[this.nNVVUnuVVVuV] = 0.0F;
      this.nvuUVvuuN[this.nNVVUnuVVVuV] = 0.0F;
      this.Oco0Oococc = false;
      this.uNUnUuUnvnnU = false;
      this.UvnvNVnnnnNU();
      this.uVUVnuvnuVuv();
   }

   private NVunNNNNuN.NVnVnNnN VVuuUN() {
      String var1 = this.uuuNUnuvvNNv;

      return switch (var1) {
         case "header" -> this.UNNunNuUNVuU;
         case "modules" -> this.VUVvNvvVUN;
         case "binds" -> this.UvvNuvUNNNUv;
         case "content" -> this.NuUuUvUUvU;
         case "title" -> this.UvuVvvVuUuuu;
         case "icon" -> this.NUUVUvvuNNVU;
         case "slots" -> this.NunUUVVVuu;
         default -> this.VUNvNUuNVnn;
      };
   }

   private unUuuVVuNnNN.VvunVVUvUNnv vNUvnnVnUvu() {
      unUuuVVuNnNN.NVnVnNnN var1 = this.uVUuuVnNVU();
      String var2 = this.uuuNUnuvvNNv;

      return switch (var2) {
         case "title" -> var1.UvnvNVnnnnNU;
         case "icon" -> var1.uVUVnuvnuVuv;
         case "modules" -> var1.NVNnnvnuunNv;
         case "binds" -> var1.uVunuUNVVUUV;
         default -> null;
      };
   }

   private void C00OOC00oO(unUuuVVuNnNN.NVnVnNnN var1) {
      var1.UuUVuuUu = 17.0F;
      var1.C00OOC00oO = 13.0F;
      var1.uUnuvNvvNU = 10.0F;
      var1.vVvUvVVuuNvV = 10.0F;
      var1.uNNnnnuuuN = 10.0F;
      var1.nuUnNvnuUu = 8.0F;
      var1.VVuuUN = 6.0F;
      var1.vNUvnnVnUvu = 8.0F;
      var1.uVUuuVnNVU = 6.0F;
      var1.vuuuNvNuv = Math.max(30.0F, var1.vuuuNvNuv);
      var1.nvUVNnuu = Math.max(22.0F, var1.nvUVNnuu);
      var1.UnUNVVVNuv = 10.0F;
      var1.vNVuvnUUnuUn = 2.4F;
   }

   private void uUnuvNvvNU(unUuuVVuNnNN.NVnVnNnN var1) {
      var1.UuUVuuUu = 10.0F;
      var1.C00OOC00oO = 8.0F;
      var1.uUnuvNvvNU = 5.0F;
      var1.vVvUvVVuuNvV = 5.0F;
      var1.uNNnnnuuuN = 5.0F;
      var1.nuUnNvnuUu = 4.0F;
      var1.VVuuUN = 3.0F;
      var1.vNUvnnVnUvu = 5.0F;
      var1.uVUuuVnNVU = 3.0F;
      var1.vuuuNvNuv = Math.min(28.0F, Math.max(22.0F, var1.vuuuNvNuv));
      var1.nvUVNnuu = 18.0F;
      var1.UnUNVVVNuv = -6.0F;
      var1.vNVuvnUUnuUn = 1.4F;
   }

   private void vVvUvVVuuNvV(unUuuVVuNnNN.NVnVnNnN var1) {
      var1.UuUVuuUu = 4.0F;
      var1.C00OOC00oO = 3.0F;
      var1.uUnuvNvvNU = 2.0F;
      var1.vVvUvVVuuNvV = 2.0F;
      var1.uNNnnnuuuN = 2.0F;
      var1.nuUnNvnuUu = 1.0F;
      var1.VVuuUN = 1.0F;
      var1.vNUvnnVnUvu = 7.0F;
      var1.uVUuuVnNVU = 5.0F;
      var1.vuuuNvNuv = 32.0F;
      var1.nvUVNnuu = 22.0F;
      var1.UnUNVVVNuv = 0.0F;
      var1.vNVuvnUUnuUn = 2.0F;
   }

   private NVunNNNNuN.uunvUUVnuNn C00OOC00oO(String var1) {
      for (NVunNNNNuN.uunvUUVnuNn var5 : vVVuuVVv) {
         if (var5.id.equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   private float UuUVuuUu(unUuuVVuNnNN.NVnVnNnN var1, String var2) {
      return switch (var2) {
         case "panelRadius" -> var1.UuUVuuUu;
         case "headerRadius" -> var1.C00OOC00oO;
         case "contentRadius" -> var1.uUnuvNvvNU;
         case "modulesRadius" -> var1.vVvUvVVuuNvV;
         case "bindsRadius" -> var1.uNNnnnuuuN;
         case "rowRadius" -> var1.nuUnNvnuUu;
         case "slotRadius" -> var1.VVuuUN;
         case "padding" -> var1.vNUvnnVnUvu;
         case "gap" -> var1.uVUuuVnNVU;
         case "headerHeight" -> var1.vuuuNvNuv;
         case "rowHeight" -> var1.nvUVNnuu;
         case "titleSize" -> var1.UuuNnUvUuv;
         case "iconSize" -> var1.nUUVuvU;
         case "bindWidth" -> var1.UnUNVVVNuv;
         case "accentWidth" -> var1.vNVuvnUUnuUn;
         default -> 0.0F;
      };
   }

   private void UuUVuuUu(unUuuVVuNnNN.NVnVnNnN var1, String var2, float var3) {
      switch (var2) {
         case "panelRadius":
            var1.UuUVuuUu = var3;
            break;
         case "headerRadius":
            var1.C00OOC00oO = var3;
            break;
         case "contentRadius":
            var1.uUnuvNvvNU = var3;
            break;
         case "modulesRadius":
            var1.vVvUvVVuuNvV = var3;
            break;
         case "bindsRadius":
            var1.uNNnnnuuuN = var3;
            break;
         case "rowRadius":
            var1.nuUnNvnuUu = var3;
            break;
         case "slotRadius":
            var1.VVuuUN = var3;
            break;
         case "padding":
            var1.vNUvnnVnUvu = var3;
            break;
         case "gap":
            var1.uVUuuVnNVU = var3;
            break;
         case "headerHeight":
            var1.vuuuNvNuv = var3;
            break;
         case "rowHeight":
            var1.nvUVNnuu = var3;
            break;
         case "titleSize":
            var1.UuuNnUvUuv = var3;
            break;
         case "iconSize":
            var1.nUUVuvU = var3;
            break;
         case "bindWidth":
            var1.UnUNVVVNuv = var3;
            break;
         case "accentWidth":
            var1.vNVuvnUUnuUn = var3;
      }
   }

   private float UuUVuuUu(NVunNNNNuN.NVnVnNnN var1, float var2, float var3, float var4) {
      float var5 = var1.uUnuvNvvNU <= 0.0F ? 0.0F : UuUVuuUu((var2 - var1.UuUVuuUu) / var1.uUnuvNvvNU, 0.0F, 1.0F);
      return var3 + (var4 - var3) * var5;
   }

   private unUuuVVuNnNN.NVnVnNnN uVUuuVnNVU() {
      return unUuuVVuNnNN.UuUVuuUu(this.UuuNnUvUuv());
   }

   private nnvNuuNvvuu vuuuNvNuv() {
      String var1 = this.UuuNnUvUuv();

      return (nnvNuuNvvuu)(switch (var1) {
         case "HUD_Inventory" -> NunNvVnnnNV.C00OOC00oO();
         case "HUD_Potions" -> NVuuUNN.C00OOC00oO();
         case "HUD_CoolDowns" -> vnVNuNUUvVNu.C00OOC00oO();
         case "HUD_Info" -> VUVVnvUunV.C00OOC00oO();
         case "HUD_WaterMark" -> unnvNvvnuVUn.C00OOC00oO();
         case "HUD_ArrayList" -> cOC0cc0cO00o.C00OOC00oO();
         case "HUD_TargetHUD" -> O0oo00cC00o.C00OOC00oO();
         case "hud_armor" -> uuNuUnUVUUn.C00OOC00oO();
         case "HUD_HotBar" -> UVNVVUnUnUU.C00OOC00oO();
         case "HUD_Notifications" -> nuVVunNUnVnv.C00OOC00oO();
         case "HUD_MusicPlayer" -> VVVVUN.C00OOC00oO();
         case "HUD_ServerHelper" -> o0cOOccooCc0.C00OOC00oO();
         default -> uuuVvnuun.C00OOC00oO();
      });
   }

   private NVunNNNNuN.VvunVVUvUNnv nvUVNnuu() {
      return VuunNUUUvu[Math.max(0, Math.min(VuunNUUUvu.length - 1, this.nNVVUnuVVVuV))];
   }

   private boolean UuUVuuUu(NVunNNNNuN.VvunVVUvUNnv var1) {
      if (var1 == null) {
         return false;
      } else {
         try {
            return Hud.NVNnnvnuunNv.C00OOC00oO(var1.settingName);
         } catch (Throwable var3) {
            return false;
         }
      }
   }

   private String UuuNnUvUuv() {
      return this.nvUVNnuu().id;
   }

   private boolean uUnuvNvvNU(String var1) {
      return "title".equals(var1) || "icon".equals(var1) || "modules".equals(var1) || "binds".equals(var1);
   }

   private void nUUVuvU() {
      if (this.Oco0Oococc) {
         this.Oco0Oococc = false;
         unUuuVVuNnNN.uNNnnnuuuN();
      }

      if (this.uNUnUuUnvnnU) {
         this.uNUnUuUnvnnU = false;
         if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
            ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
         }
      }
   }

   private String UnUNVVVNuv() {
      String var1 = this.uuuNUnuvvNNv;

      return switch (var1) {
         case "panel" -> "Panel";
         case "header" -> "Header";
         case "modules" -> "Modules block";
         case "binds" -> "Binds block";
         case "content" -> "Content group";
         case "icon" -> "Icon";
         case "slots" -> "Slots";
         default -> "Title";
      };
   }

   private String vVvUvVVuuNvV(String var1) {
      return switch (var1) {
         case "panel" -> "Panel";
         case "header" -> "Header";
         case "modules" -> "Modules";
         case "binds" -> "Binds";
         case "content" -> "Content";
         case "icon" -> "Icon";
         case "slots" -> "Slots";
         default -> "Title";
      };
   }

   private void vNVuvnUUnuUn() {
      unUuuVVuNnNN.NVnVnNnN var1 = this.uVUuuVnNVU();
      this.UuUVuuUu("title.x", var1.UvnvNVnnnnNU.UuUVuuUu);
      this.UuUVuuUu("title.y", var1.UvnvNVnnnnNU.C00OOC00oO);
      this.UuUVuuUu("icon.x", var1.uVUVnuvnuVuv.UuUVuuUu);
      this.UuUVuuUu("icon.y", var1.uVUVnuvnuVuv.C00OOC00oO);
      this.UuUVuuUu("modules.x", var1.NVNnnvnuunNv.UuUVuuUu);
      this.UuUVuuUu("modules.y", var1.NVNnnvnuunNv.C00OOC00oO);
      this.UuUVuuUu("binds.x", var1.uVunuUNVVUUV.UuUVuuUu);
      this.UuUVuuUu("binds.y", var1.uVunuUNVVUUV.C00OOC00oO);

      for (NVunNNNNuN.uunvUUVnuNn var5 : vVVuuVVv) {
         float var6 = UuUVuuUu((this.UuUVuuUu(var1, var5.id) - var5.min) / Math.max(0.001F, var5.max - var5.min), 0.0F, 1.0F);
         this.UuUVuuUu(var5.id, var6);
         this.uNNnnnuuuN(var5.id + ".thumb");
      }

      for (NVunNNNNuN.VvunVVUvUNnv var15 : VuunNUUUvu) {
         this.uNNnnnuuuN(var15.id);
      }

      for (String var16 : vNnNuuvVn) {
         this.uNNnnnuuuN(var16);
         VVnnnnN var17 = new VVnnnnN();
         var17.nuUnNvnuUu(0.0);
         this.VNNnnVUuvv.put(var16, var17);
      }

      for (String var12 : this.VUUnuVvVu.keySet()) {
         this.uNNnnnuuuN(var12);
      }

      this.uNNnnnuuuN("preview.resize");
   }

   private void UuUVuuUu(String var1, float var2) {
      VVnnnnN var3 = new VVnnnnN();
      var3.nuUnNvnuUu(var2);
      this.VvVuvUvvNNVv.put(var1, var3);
   }

   private void uNNnnnuuuN(String var1) {
      if (!this.UnnNNvuvvUU.containsKey(var1)) {
         VVnnnnN var2 = new VVnnnnN();
         var2.nuUnNvnuUu(0.0);
         this.UnnNNvuvvUU.put(var1, var2);
      }
   }

   private void UvnvNVnnnnNU() {
      unUuuVVuNnNN.NVnVnNnN var1 = this.uVUuuVnNVU();

      for (NVunNNNNuN.uunvUUVnuNn var5 : vVVuuVVv) {
         this.vUvUvUNNuNvn.put(var5.id, uUnuvNvvNU(this.UuUVuuUu(var1, var5.id)));
      }
   }

   private void uVUVnuvnuVuv() {
      unUuuVVuNnNN.VvunVVUvUNnv var1 = this.vNUvnnVnUvu();
      if (var1 == null) {
         this.vnVuunuNN = "";
         this.UvUNuNvvNVNv = "";
         this.vNnNNNuVVnUv = "";
      } else {
         this.vnVuunuNN = String.format(Locale.ROOT, "X %.1f", var1.UuUVuuUu);
         this.UvUNuNvvNVNv = String.format(Locale.ROOT, "Y %.1f", var1.C00OOC00oO);
         this.vNnNNNuVVnUv = String.format(Locale.ROOT, "X %.1f    Y locked", var1.UuUVuuUu);
      }
   }

   private float UuUVuuUu(float var1, String var2) {
      VVnnnnN var3 = this.VvVuvUvvNNVv.get(var2);
      if (var3 == null) {
         return var1;
      } else {
         var3.UuUVuuUu();
         var3.UuUVuuUu(var1, this.unUVnu == null ? 0.18F : 0.1F, VvVUUNUu.UnUNVVVNuv, false);
         return var3.uNNnnnuuuN();
      }
   }

   private float C00OOC00oO(String var1, float var2) {
      VVnnnnN var3 = this.UnnNNvuvvUU.get(var1);
      if (var3 == null) {
         return var2;
      } else {
         var3.UuUVuuUu();
         var3.UuUVuuUu(var2, 0.14F, VvVUUNUu.UnUNVVVNuv, false);
         return var3.uNNnnnuuuN();
      }
   }

   private float uUnuvNvvNU(String var1, float var2) {
      VVnnnnN var3 = this.VNNnnVUuvv.get(var1);
      if (var3 == null) {
         return var2;
      } else {
         var3.UuUVuuUu();
         var3.UuUVuuUu(var2, 0.14F, VvVUUNUu.UnUNVVVNuv, false);
         return var3.uNNnnnuuuN();
      }
   }

   private boolean UuUVuuUu(NVunNNNNuN.NVnVnNnN var1) {
      return var1 != null && var1.UuUVuuUu(this.NNVNuUvVn, this.vuNnuUnu);
   }

   private void vNUvnnVnUvu(float var1, float var2) {
      this.NNVNuUvVn = var1;
      this.vuNnuUnu = var2;
   }

   private void NVNnnvnuunNv() {
      if (this.field_22787 != null && this.field_22787.method_22683() != null && this.field_22787.field_1729 != null) {
         double var1 = this.field_22787.method_22683().method_4489();
         double var3 = this.field_22787.method_22683().method_4506();
         if (!(var1 <= 0.0) && !(var3 <= 0.0)) {
            double var5 = this.field_22787.field_1729.method_1603();
            double var7 = this.field_22787.field_1729.method_1604();
            if (var5 >= 0.0 && var7 >= 0.0 && var5 <= var1 + 2.0 && var7 <= var3 + 2.0) {
               this.vNUvnnVnUvu((float)var5, (float)var7);
            }
         }
      }
   }

   private float UuUVuuUu(double var1) {
      if (this.field_22787 != null && this.field_22787.method_22683() != null) {
         int var3 = this.field_22787.method_22683().method_4489();
         int var4 = this.field_22787.method_22683().method_4486();
         return var3 > 0 && var4 > 0 ? (float)(var1 * var3 / Math.max(1.0, (double)var4)) : (float)var1;
      } else {
         return (float)var1;
      }
   }

   private float C00OOC00oO(double var1) {
      if (this.field_22787 != null && this.field_22787.method_22683() != null) {
         int var3 = this.field_22787.method_22683().method_4506();
         int var4 = this.field_22787.method_22683().method_4502();
         return var3 > 0 && var4 > 0 ? (float)(var1 * var3 / Math.max(1.0, (double)var4)) : (float)var1;
      } else {
         return (float)var1;
      }
   }

   private static void UuUVuuUu(NVunNNNNuN.NVnVnNnN var0, NVunNNNNuN.NVnVnNnN var1, NVunNNNNuN.NVnVnNnN var2) {
      if (var0 != null) {
         if (var1 == null || var1.uUnuvNvvNU <= 0.0F || var1.vVvUvVVuuNvV <= 0.0F) {
            var0.UuUVuuUu(var2);
         } else if (var2 != null && !(var2.uUnuvNvvNU <= 0.0F) && !(var2.vVvUvVVuuNvV <= 0.0F)) {
            float var3 = Math.min(var1.UuUVuuUu, var2.UuUVuuUu);
            float var4 = Math.min(var1.C00OOC00oO, var2.C00OOC00oO);
            float var5 = Math.max(var1.UuUVuuUu + var1.uUnuvNvvNU, var2.UuUVuuUu + var2.uUnuvNvvNU);
            float var6 = Math.max(var1.C00OOC00oO + var1.vVvUvVVuuNvV, var2.C00OOC00oO + var2.vVvUvVVuuNvV);
            var0.UuUVuuUu(var3, var4, var5 - var3, var6 - var4);
         } else {
            var0.UuUVuuUu(var1);
         }
      }
   }

   private static String uUnuvNvvNU(float var0) {
      return String.format(Locale.ROOT, "%.1f", var0);
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return !Float.isFinite(var0) ? var1 : Math.max(var1, Math.min(var2, var0));
   }

   private static int UuUVuuUu(int var0, int var1, int var2, int var3) {
      return UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(var0, var1, var2, Math.max(0, Math.min(255, var3)));
   }

   private static int UuUVuuUu(NUunUunuNV var0, int var1) {
      return NUunUunuNV.UuUVuuUu(var0.uVunuUNVVUUV(), Math.max(0, Math.min(255, var1)));
   }

   private static int C00OOC00oO(NUunUunuNV var0, int var1) {
      return NUunUunuNV.UuUVuuUu(var0.UNnVVNvvnVvU(), Math.max(0, Math.min(255, var1)));
   }

   private static int UuUVuuUu(NUunUunuNV var0) {
      return NUunUunuNV.UuUVuuUu(var0.NVNnnvnuunNv(), var0.uNnUnnuNUnNu() ? 150 : 168);
   }

   private static int C00OOC00oO(NUunUunuNV var0) {
      return NUunUunuNV.UuUVuuUu(var0.NVNnnvnuunNv(), var0.uNnUnnuNUnNu() ? 128 : 98);
   }

   private static float uVUuuVnNVU(float var0, float var1) {
      double var2 = (float)(System.currentTimeMillis() % (long)Math.max(1.0F, var0)) / Math.max(1.0F, var0);
      return (float)(0.5 + 0.5 * Math.sin((var2 + var1) * Math.PI * 2.0));
   }

   private static float vuuuNvNuv(float var0, float var1) {
      return var0 + var1 * 0.3F;
   }

   private void UuUVuuUu(UnVNvNnU var1, nUVnuvUu var2, String var3, float var4, float var5, float var6, float var7, int var8) {
      float var9 = vVVUUuunVVV.C00OOC00oO(var2, var3, var7);
      var1.UuUVuuUu(var2, Math.round(var4 + (var6 - var9) * 0.5F), Math.round(vuuuNvNuv(var5 + var6 * 0.5F, var7)), var7, var3, var8);
   }

   private void UuUVuuUu(UnVNvNnU var1, nUVnuvUu var2, String var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      float var10 = vVVUUuunVVV.C00OOC00oO(var2, var3, var8);
      var1.UuUVuuUu(var2, Math.round(var4 + (var6 - var10) * 0.5F), Math.round(vuuuNvNuv(var5 + var7 * 0.5F, var8)), var8, var3, var9);
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, int var6) {
      var1.UuUVuuUu(var2, var3);
      var1.C00OOC00oO(45.0F);
      var1.UuUVuuUu(-var4, -var5 * 0.5F, var4 * 2.0F, var5, var5 * 0.5F, var6);
      var1.VVuuUN();
      var1.C00OOC00oO(-45.0F);
      var1.UuUVuuUu(-var4, -var5 * 0.5F, var4 * 2.0F, var5, var5 * 0.5F, var6);
      var1.VVuuUN();
      var1.vNUvnnVnUvu();
   }

   static final class NVnVnNnN {
      float UuUVuuUu;
      float C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;

      NVnVnNnN() {
         this(0.0F, 0.0F, 0.0F, 0.0F);
      }

      NVnVnNnN(float var1, float var2, float var3, float var4) {
         this.UuUVuuUu(var1, var2, var3, var4);
      }

      NVunNNNNuN.NVnVnNnN UuUVuuUu(float var1, float var2, float var3, float var4) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         return this;
      }

      NVunNNNNuN.NVnVnNnN UuUVuuUu(NVunNNNNuN.NVnVnNnN var1) {
         return var1 == null ? this.UuUVuuUu() : this.UuUVuuUu(var1.UuUVuuUu, var1.C00OOC00oO, var1.uUnuvNvvNU, var1.vVvUvVVuuNvV);
      }

      NVunNNNNuN.NVnVnNnN UuUVuuUu() {
         return this.UuUVuuUu(0.0F, 0.0F, 0.0F, 0.0F);
      }

      static NVunNNNNuN.NVnVnNnN C00OOC00oO() {
         return new NVunNNNNuN.NVnVnNnN();
      }

      boolean UuUVuuUu(float var1, float var2) {
         return var1 >= this.UuUVuuUu && var2 >= this.C00OOC00oO && var1 <= this.UuUVuuUu + this.uUnuvNvvNU && var2 <= this.C00OOC00oO + this.vVvUvVVuuNvV;
      }
   }

   record VvunVVUvUNnv(String id, String label, String settingName, nUVnuvUu iconFont, String icon, NVunNNNNuN.nvnNNunvv kind, boolean layoutBacked) {
   }

   static enum nvnNNunvv {
      KEYBINDS,
      INVENTORY,
      POTIONS,
      COOLDOWNS,
      INFO,
      WATERMARK,
      ARRAYLIST,
      TARGET,
      SLOTS,
      HOTBAR,
      NOTIFICATION,
      MEDIA,
      SERVER;
   }

   record uunvUUVnuNn(String id, String label, String section, float min, float max) {
   }
}
