package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import net.minecraft.class_1041;
import net.minecraft.class_1044;
import net.minecraft.class_10868;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_320;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_641;
import net.minecraft.class_642;
import net.minecraft.class_320.class_321;
import org.lwjgl.opengl.GL11;

public final class NuvVVvUU extends class_437 implements uNVUuVuNNUvn {
   private static final OO0OCoOC UuUVuuUu = OO0OCoOC.UuUVuuUu();
   private static final int C00OOC00oO = 14;
   private static final long uUnuvNvvNU = 350L;
   private static final float vVvUvVVuuNvV = 28.0F;
   private static final float uNNnnnuuuN = 34.0F;
   private static final float nuUnNvnuUu = 10.0F;
   private static final float VVuuUN = 8.5F;
   private static final float vNUvnnVnUvu = 44.0F;
   private static final float uVUuuVnNVU = 21.0F;
   private static final float vuuuNvNuv = 0.108F;
   private static final float nvUVNnuu = 27.0F;
   private static final float UuuNnUvUuv = 30.0F;
   private static final float nUUVuvU = 9.0F;
   private static final float UnUNVVVNuv = 352.0F;
   private static final float vNVuvnUUnuUn = 0.295F;
   private static final float UvnvNVnnnnNU = 64.0F;
   private static final float uVUVnuvnuVuv = 8.0F;
   private static final float NVNnnvnuunNv = 14.0F;
   private static final float uVunuUNVVUUV = 40.0F;
   private static final float UNnVVNvvnVvU = 12.0F;
   private static final float uNnUnnuNUnNu = 27.0F;
   private static final float NnUuNNU = 17.0F;
   private static final float nNvNUVU = 5.0F;
   private static final float UnUNuUU = 28.0F;
   private static final float uUVuVvuNUvnu = 6.0F;
   private static final float UvUvUNuvNU = 0.62F;
   private static final float c0oOOCcCoC0 = 0.4922F;
   private static final String[] VVnVNnunVvu = new String[]{"y", "M", "v"};
   private static final float[] unNNVVNnvvV = new float[]{1.0F, 1.09F, 0.91F};
   private static final int NuunnvnN = 3;
   private static final float NVUunUNUN = 96.0F;
   private static final int UUVNuUNUvUnV = 7;
   private static final float vuvnUnVnUNnV = 3.5F;
   private static final float nnuUVNUuvvVU = 46.0F;
   private static final float nVVUuvuNnUN = 8.0F;
   private static final float nNnVnUNVV = 8.0F;
   private static final float nuunNvv = 20.0F;
   private static final float uUVVvVVNvvn = 22.0F;
   private static final float vvUVNVvvNUv = 23.0F;
   private static final float UuNnnVnuNNV = 24.0F;
   private static final float uUVvnUuNvvN = 104.0F;
   private static final float UUuUnNVNuuv = 18.0F;
   private static final float NVuNUuVnVUN = 62.0F;
   private static final float NVuunNnvvvVu = 15.0F;
   private static final float vNnNuuvVn = 15.0F;
   private static final float VUuuVUnun = 22.0F;
   private static final float vVVuuVVv = 3.0F;
   private static final float VuunNUUUvu = 12.0F;
   private static final float NNUUNUuVNNVn = 46.0F;
   private static final float VvVvnNUnvuvV = 10.0F;
   private static final float ccOO0COcoco0 = 244.0F;
   private static final float NUVvUUVuVNVv = 50.0F;
   private static final float nNuVunNUVu = 76.0F;
   private static final float UNvvunVVn = 158.0F;
   private static final float UnvuVuVnNuvu = 184.0F;
   private static final float UvNNVUVNVuvV = 198.0F;
   private static final float NnunUUnU = 184.0F;
   private static final long nvuVvuNnNUnv = 2600000000L;
   private static final long NnVnNVN = 2600000000L;
   private static final long vnvvNvUnVv = 360000000L;
   private static final float OCOocoOoOO = 0.85F;
   private static final ScheduledExecutorService o0Ooc0COOoc = Executors.newSingleThreadScheduledExecutor(var0 -> {
      Thread var1 = new Thread(var0, "Wild-AltVaultSave");
      var1.setDaemon(true);
      return var1;
   });
   private static final ExecutorService nvvnUnUn = Executors.newSingleThreadExecutor(var0 -> {
      Thread var1 = new Thread(var0, "Wild-AltSkinLookup");
      var1.setDaemon(true);
      return var1;
   });
   private static final Map<String, class_2960> UnUUVuVunvVu = new ConcurrentHashMap<>();
   private static final Set<String> nnvuvUNuUnN = ConcurrentHashMap.newKeySet();
   private static volatile GameProfileRepository UVnuVUUVnnU;
   private static final String[] VunnVNvNV = new String[]{
      "x",
      "z",
      "q",
      "v",
      "mx",
      "im",
      "by",
      "not",
      "its",
      "real",
      "just",
      "i",
      "fx",
      "rx",
      "nx",
      "neo",
      "raw",
      "low",
      "old",
      "the",
      "mr",
      "lil",
      "big",
      "dr",
      "sir",
      "yo",
      "ez",
      "op",
      "gg",
      "yt",
      "tv",
      "wild",
      "pro",
      "uwu",
      "ya",
      "el",
      "an",
      "su",
      "ko"
   };
   private static final String[] NvUVUvVVnUu = new String[]{
      "alex",
      "dani",
      "nik",
      "max",
      "roma",
      "kir",
      "drew",
      "mark",
      "luka",
      "tim",
      "ivan",
      "mira",
      "sasha",
      "art",
      "lev",
      "egor",
      "mike",
      "tony",
      "vlad",
      "step",
      "andrew",
      "niko",
      "den",
      "semy",
      "yar",
      "kost",
      "ilya",
      "gleb",
      "dima",
      "serg",
      "matvey",
      "rad",
      "kira",
      "mila",
      "sonya",
      "kai",
      "leo",
      "rian",
      "noah",
      "mason",
      "kevin",
      "rem",
      "zen",
      "nova",
      "pixel",
      "byte",
      "void",
      "ray",
      "fox",
      "wolf",
      "moon",
      "storm",
      "rain",
      "ash",
      "raven",
      "cole",
      "liam",
      "owen",
      "eric",
      "aron",
      "milo",
      "tomas",
      "nolan",
      "ron",
      "lars",
      "vega",
      "skye",
      "jack",
      "finn",
      "theo",
      "hugo",
      "bruno",
      "diego",
      "enzo",
      "jude",
      "reed",
      "cruz",
      "jax",
      "zane",
      "ace",
      "dash",
      "blake",
      "cody",
      "trey",
      "jett",
      "knox",
      "beck",
      "reid",
      "colt",
      "gage",
      "wade",
      "zeke",
      "onyx",
      "jinx",
      "flux",
      "ghost",
      "frost",
      "blaze",
      "drake",
      "hawk",
      "lynx",
      "puma",
      "arlo",
      "remy",
      "yuki",
      "aki",
      "ren",
      "sora",
      "haru",
      "kaze",
      "mei",
      "rio",
      "neon",
      "echo",
      "dusk",
      "sage",
      "wren"
   };
   private static final String[] unnUnUNVnN = new String[]{
      "",
      "",
      "",
      "x",
      "yy",
      "on",
      "er",
      "ix",
      "is",
      "way",
      "pro",
      "mc",
      "dev",
      "boy",
      "top",
      "live",
      "sky",
      "craft",
      "mine",
      "play",
      "hd",
      "fps",
      "low",
      "new",
      "old",
      "go",
      "run",
      "win",
      "bit",
      "core",
      "qq",
      "zz",
      "xd",
      "yt",
      "gg",
      "ez",
      "op",
      "wow",
      "god",
      "main",
      "gang",
      "ster",
      "izz",
      "us",
      "io",
      "ly",
      "ne"
   };
   private static final String[] NnuUnUNnu = new String[]{
      "ka",
      "ki",
      "ko",
      "mi",
      "mo",
      "ra",
      "ri",
      "ro",
      "sa",
      "si",
      "so",
      "ta",
      "ti",
      "to",
      "ne",
      "ni",
      "no",
      "la",
      "li",
      "lo",
      "ve",
      "vi",
      "vo",
      "za",
      "ze",
      "zu",
      "da",
      "de",
      "du",
      "ny",
      "re",
      "xo",
      "ku",
      "ke",
      "fa",
      "fi",
      "fo",
      "ga",
      "go",
      "ha",
      "hi",
      "ho",
      "ba",
      "bo",
      "pa",
      "po",
      "wu",
      "yo",
      "ju",
      "ce",
      "dra",
      "vex",
      "zar",
      "kra",
      "nyx",
      "rox"
   };
   private final class_437 UnnnvvU;
   private final OoCO0O0oc0c VUUnuVvVu = new OoCO0O0oc0c();
   private final VvVVnnNNNuV.VUuUUNnnuvuv VvVuvUvvNNVv = new VvVVnnNNNuV.VUuUUNnnuvuv(20, 14);
   private final VvuuVNVUn.NVnVnNnN UnnNNvuvvUU = new VvuuVNVUn.NVnVnNnN();
   private final List<NuvVVvUU.NVnVnNnN> VNNnnVUuvv = new ArrayList<>();
   private final Set<String> vUvUvUNNuNvn = new HashSet<>();
   private final Map<String, String> uuVuUuuVVNvN = new HashMap<>();
   private final NuvVVvUU.uunvUUVnuNn VvuUUUNNNv = new NuvVVvUU.uunvUUVnuNn("Login", NuvVVvUU.VvunVVUvUNnv.USE, NuvVVvUU.nvUnvV.PRIMARY);
   private final NuvVVvUU.uunvUUVnuNn uuuVnuvnnNnU = new NuvVVvUU.uunvUUVnuNn("Add", NuvVVvUU.VvunVVUvUNnv.ADD_CRACKED, NuvVVvUU.nvUnvV.SECONDARY);
   private final NuvVVvUU.uunvUUVnuNn nNunUnVN = new NuvVVvUU.uunvUUVnuNn("Random", NuvVVvUU.VvunVVUvUNnv.RANDOM, NuvVVvUU.nvUnvV.SECONDARY);
   private final NuvVVvUU.uunvUUVnuNn VnVuuvVvnNv = new NuvVVvUU.uunvUUVnuNn("Edit", NuvVVvUU.VvunVVUvUNnv.EDIT, NuvVVvUU.nvUnvV.SECONDARY);
   private final NuvVVvUU.uunvUUVnuNn vuvvuVuVv = new NuvVVvUU.uunvUUVnuNn("Delete", NuvVVvUU.VvunVVUvUNnv.DELETE, NuvVVvUU.nvUnvV.DESTRUCTIVE);
   private final NuvVVvUU.uunvUUVnuNn uunNUuunVU = new NuvVVvUU.uunvUUVnuNn("Create identity", NuvVVvUU.VvunVVUvUNnv.CREATE_FIRST, NuvVVvUU.nvUnvV.PRIMARY);
   private final List<NuvVVvUU.uunvUUVnuNn> NvnuuuvnVV = List.of(this.VvuUUUNNNv, this.uuuVnuvnnNnU, this.nNunUnVN, this.VnVuuvVvnNv, this.vuvvuVuVv);
   private final NuvVVvUU.VUUnVnVNNU NnUVNnuvUv = new NuvVVvUU.VUUnVnVNNU("Username", false);
   private final NuvVVvUU.VUnuUnnuNvVu UuuuNNunN = new NuvVVvUU.VUnuUnnuNvVu();
   private final NuvVVvUU.vUvuUvvVvvnN[] NNVNuUvVn = new NuvVVvUU.vUvuUvvVvvnN[14];
   private final vVnuUUVvvnV vuNnuUnu = new vVnuUUVvvnV(Cc0cOoOcC0o.uNNnnnuuuN());
   private final vVnuUUVvvnV uuvvuNvuUNVV = new vVnuUUVvvnV(Cc0cOoOcC0o.uNNnnnuuuN());
   private final nUuuVnUnNvn uVvunVUNuUvu = new nUuuVnUnNvn(vuVvuunNvVv.UnUNuUU);
   private final nUuuVnUnNvn NVNnnvVnvV = new nUuuVnUnNvn(vuVvuunNvVv.UvUvUNuvNU);
   private final nUuuVnUnNvn vUNuuvvnVnv = new nUuuVnUnNvn(vuVvuunNvVv.nNvNUVU);
   private float unnnNUNnVu;
   private float NvnnUUuVvNU;
   private float vVvuUVnV;
   private float nvuUVvuuN;
   private float CC0COO;
   private float uNnNUNvuVnu;
   private float VnnnvUunNvuu;
   private float VuuUVVu;
   private float nUNnuUNnV;
   private float VuNVnvNNuNnn;
   private float uvVuuuvvVU;
   private float NNnvvunuVNUn;
   private float nVuuUnnUUVU;
   private float nUununvNvvn;
   private float NuvunVvnnN;
   private long vuvnnvuNVvu;
   private long NVvnvnn;
   private long vUvVUNnN;
   private long NUuVnnuUnvu;
   private long vnuNNVvVVuN;
   private long Oco0Oococc;
   private float uNUnUuUnvnnU;
   private float OoccOc0CO;
   private float UvuVvvVuUuuu;
   private float NUUVUvvuNNVU;
   private float VUNvNUuNVnn;
   private float UNNunNuUNVuU;
   private float NuUuUvUUvU;
   private float VUVvNvvVUN;
   private float UvvNuvUNNNUv;
   private float NunUUVVVuu;
   private float uNUnuUUvvuU;
   private boolean vvVVVvVNVVVN;
   private boolean uUuuVvVunVVu;
   private boolean NuUvUNN;
   private int vunuUUVVUv;
   private int uuuNUnuvvNNv;
   private int unUVnu = -6357021;
   private int NvNUuuuvUvu = -11341636;
   private NvVNvUvunNNu nNVVUnuVVVuV = NvVNvUvunNNu.AURORA;
   private boolean vnVuunuNN;
   private int UvUNuNvvNVNv = -1;
   private int vNnNNNuVVnUv = 5;
   private String UVUnUvUNU = "";
   private String UvUnnnn = null;
   private String occOCoc0OcO = null;
   private float VnvunuuvUNu;
   private float nuVuunUn;
   private float NvNvVNUv;
   private boolean vNUUvuuVU;
   private float unNuVNVUnV;
   private float UvNNNUvNnUUV;
   private float vVuNvnVUvvv;
   private float OCCc0co0OOC;
   private float unUvvVVVVUu;
   private float nnUunUnNUN;
   private float UNuUVVuUuU;
   private float NunnVUUuvUV;
   private boolean nVUNnUuU;
   private int VNvuVnvnun = -1;
   private int unVVnuunNU = -1;
   private float vVnuVVvVNuNu;
   private float uNVvVvUuuuU;
   private float nvnUvvnUUN;
   private volatile ScheduledFuture<?> uuuvuUUNVVUN;

   public NuvVVvUU(class_437 var1) {
      super(class_2561.method_43470("Alt Manager"));
      this.UnnnvvU = var1;

      for (int var2 = 0; var2 < this.NNVNuUvVn.length; var2++) {
         this.NNVNuUvVn[var2] = new NuvVVvUU.vUvuUvvVvvnN();
      }
   }

   public static void UuUVuuUu(class_310 var0) {
      NuvVVvUU.nUVVnVNu.UuUVuuUu(var0);
   }

   protected void method_25426() {
      super.method_25426();
      boolean var1 = this.vuvnnvuNVvu != 0L;
      this.vuvnnvuNVvu = System.nanoTime();
      this.NVvnvnn = this.vuvnnvuNVvu;
      this.vUvVUNnN = this.vuvnnvuNVvu;
      this.uNUnUuUnvnnU = 0.0F;
      this.vvVVVvVNVVVN = false;
      this.uUuuVvVunVVu = false;
      this.NuUvUNN = false;
      this.vunuUUVVUv = 0;
      this.uuuNUnuvvNNv = 0;
      this.VnvunuuvUNu = 0.0F;
      this.nuVuunUn = 0.0F;
      this.NvNvVNUv = 0.0F;
      this.VNvuVnvnun = -1;
      this.unVVnuunNU = -1;
      this.occOCoc0OcO = null;
      this.Oco0Oococc = 0L;
      this.uVvunVUNuUvu.UuUVuuUu(0.0F);
      this.NVNnnvVnvV.UuUVuuUu(0.0F);
      this.vUNuuvvnVnv.UuUVuuUu(0.0F);
      this.vuNnuUnu.UuUVuuUu(0.0F);
      this.uuvvuNvuUNVV.UuUVuuUu(0.0F);
      this.NnUVNnuvUv.vVvUvVVuuNvV();
      this.UuuuNNunN.UuUVuuUu();

      for (NuvVVvUU.uunvUUVnuNn var3 : this.NvnuuuvnVV) {
         var3.UuUVuuUu();
      }

      this.uunNUuunVU.UuUVuuUu();
      this.UuUVuuUu(var1);
      this.vuuuNvNuv();
   }

   public void method_25410(class_310 var1, int var2, int var3) {
      int var4 = this.UvUNuNvvNVNv;
      float var5 = this.VnvunuuvUNu;
      String var6 = this.UVUnUvUNU;
      long var7 = this.vnuNNVvVVuN;
      super.method_25410(var1, var2, var3);
      this.UvUNuNvvNVNv = var4;
      this.VnvunuuvUNu = var5;
      this.nuVuunUn = var5;
      this.UVUnUvUNU = var6;
      this.vnuNNVvVVuN = var7;
   }

   public void method_25394(class_332 var1, int var2, int var3, float var4) {
      this.UuUVuuUu(var2, var3, var4, false);
   }

   @Override
   public void UuUVuuUu(int var1, int var2, float var3) {
      this.UuUVuuUu(var1, var2, var3, true);
   }

   private void UuUVuuUu(int var1, int var2, float var3, boolean var4) {
      class_1041 var5 = this.field_22787 == null ? null : this.field_22787.method_22683();
      if (var5 != null && !var5.method_65966() && var5.method_4489() > 0 && var5.method_4506() > 0) {
         int var6 = var5.method_4489();
         int var7 = var5.method_4506();
         long var8 = System.nanoTime();
         float var10 = Math.max(0.001F, Math.min(0.05F, (float)(var8 - this.NVvnvnn) / 1.0E9F));
         this.NVvnvnn = var8;
         this.uNUnUuUnvnnU = (float)(var8 - this.vuvnnvuNVvu) / 1.0E9F;
         if (this.UuUVuuUu(var5, var6, var7, var1, var2, var8)) {
            var10 = 0.001F;
         }

         this.VVnVNnunVvu();
         this.UuUVuuUu(var5, var1, var2, var10, var8);
         this.C00OOC00oO(var6, var7, var10);
         this.unNNVVNnvvV();
         this.C00OOC00oO(var8);
         float var11 = (this.OoccOc0CO / Math.max(1.0F, (float)var6) - 0.5F) * 2.0F;
         float var12 = (this.UvuVvvVuUuuu / Math.max(1.0F, (float)var7) - 0.5F) * 2.0F;
         float var13 = this.vuNnuUnu.UuUVuuUu(var11, var10);
         float var14 = this.uuvvuNvuUNVV.UuUVuuUu(var12, var10);
         this.UuUVuuUu(var6, var7, var13, var14, var10, var8);
         this.c0oOOCcCoC0();
         int var15 = GL11.glGetInteger(36006);
         this.UuUVuuUu(var6, var7, var15, var13, var14, var8);
         if (var4) {
            VvuuVNVUn.C00OOC00oO(this.UnnNNvuvvUU);

            try {
               this.VUUnuVvVu.UuUVuuUu(this.VvVuvUvvNNVv);
            } finally {
               VvuuVNVUn.uUnuvNvvNU(this.UnnNNvuvvUU);
            }

            this.UuUVuuUu(this.VvVuvUvvNNVv);
         }
      }
   }

   public void method_25420(class_332 var1, int var2, int var3, float var4) {
   }

   public void method_52752(class_332 var1) {
   }

   public boolean method_25421() {
      return false;
   }

   public boolean method_25422() {
      return false;
   }

   public void method_25419() {
      this.UuUVuuUu(NuvVVvUU.VvunVVUvUNnv.BACK);
   }

   public void method_25432() {
      if (ru.metaculture.protection.NVnVnNnN.NuunnvnN()) {
         this.UuUVuuUu(0L);
      } else {
         this.uNNnnnuuuN();
      }

      NuvVVvUU.nUVVnVNu.UuUVuuUu();
      this.VUUnuVvVu.close();
      super.method_25432();
   }

   public boolean method_25402(double var1, double var3, int var5) {
      if (var5 == 0 && this.field_22787 != null && this.field_22787.method_22683() != null) {
         float var6 = this.UuUVuuUu(this.field_22787.method_22683(), var1);
         float var7 = this.C00OOC00oO(this.field_22787.method_22683(), var3);
         long var8 = System.nanoTime();
         if (this.nVUNnUuU) {
            float var10 = 10.0F;
            if (var6 >= this.UvNNNUvNnUUV - var10
               && var6 <= this.UvNNNUvNnUUV + this.OCCc0co0OOC + var10
               && var7 >= this.vVuNvnVUvvv
               && var7 <= this.vVuNvnVUvvv + this.unUvvVVVVUu) {
               this.vNUUvuuVU = true;
               this.NvNvVNUv = 0.85F;
               if (var7 >= this.nnUunUnNUN && var7 <= this.nnUunUnNUN + this.UNuUVVuUuU) {
                  this.unNuVNVUnV = var7 - this.nnUunUnNUN;
               } else {
                  this.unNuVNVUnV = this.UNuUVVuUuU * 0.5F;
               }

               this.UuUVuuUu(var7);
               return true;
            }
         }

         if (this.UuuuNNunN.UuUVuuUu(var6, var7)) {
            this.UuuuNNunN.nvUVNnuu = 1.0F;
            this.UuUVuuUu(NuvVVvUU.VvunVVUvUNnv.BACK);
            return true;
         } else {
            for (int var13 = 0; var13 < this.VNNnnVUuvv.size(); var13++) {
               NuvVVvUU.NVnVnNnN var11 = this.VNNnnVUuvv.get(var13);
               if (!var11.NUVvUUVuVNVv && !var11.ccOO0COcoco0 && var11.nNuVunNUVu) {
                  int var12 = this.UuUVuuUu(var11, var6, var7);
                  if (var12 >= 0) {
                     this.NnUVNnuvUv.nNvNUVU = false;
                     var11.nUUVuvU[var12] = 1.0F;
                     this.UuUVuuUu(var13, null);
                     this.UuUVuuUu(var11, var12);
                     return true;
                  }

                  if (var11.UuUVuuUu(var6, var7)) {
                     this.NnUVNnuvUv.nNvNUVU = false;
                     this.uVUVnuvnuVuv();
                     if (this.UvUNuNvvNVNv == var13 && var8 - this.NUuVnnuUnvu < 360000000L) {
                        var11.NuunnvnN = 1.0F;
                        var11.NVUunUNUN = 1.0F;
                        this.UuUVuuUu(NuvVVvUU.VvunVVUvUNnv.USE);
                     } else {
                        this.UuUVuuUu(var13, "Selected " + var11.C00OOC00oO);
                        var11.NVUunUNUN = Math.max(var11.NVUunUNUN, 0.42F);
                        this.uUnuvNvvNU();
                     }

                     this.NUuVnnuUnvu = var8;
                     if (!var11.vVvUvVVuuNvV && this.nVVUuvuNnUN() > 1) {
                        this.unVVnuunNU = var13;
                        this.vVnuVVvVNuNu = var7 - var11.uNnUnnuNUnNu;
                        this.nvnUvvnUUN = var7;
                        this.uNVvVvUuuuU = var7;
                     }

                     return true;
                  }
               }
            }

            if (this.NnUVNnuvUv.UuUVuuUu(var6, var7)) {
               this.NnUVNnuvUv.nNvNUVU = true;
               this.NnUVNnuvUv.UnUNuUU = false;
               this.NnUVNnuvUv.NnUuNNU = this.NnUVNnuvUv.uNnUnnuNUnNu.length();
               this.NnUVNnuvUv.nvUVNnuu = 1.0F;
               this.uVUVnuvnuVuv();
               return true;
            } else if (this.vUNuuvvnVnv.UuUVuuUu() > 0.5F && this.uunNUuunVU.UuUVuuUu(var6, var7)) {
               this.uunNUuunVU.nvUVNnuu = 1.0F;
               this.uunNUuunVU.UuuNnUvUuv = 1.0F;
               this.UuUVuuUu(NuvVVvUU.VvunVVUvUNnv.CREATE_FIRST);
               return true;
            } else {
               for (NuvVVvUU.uunvUUVnuNn var15 : this.NvnuuuvnVV) {
                  if (var15.uNnUnnuNUnNu && var15.UuUVuuUu(var6, var7)) {
                     this.NnUVNnuvUv.nNvNUVU = false;
                     var15.nvUVNnuu = 1.0F;
                     var15.UuuNnUvUuv = 1.0F;
                     this.UuUVuuUu(var15.uVunuUNVVUUV);
                     return true;
                  }
               }

               this.NnUVNnuvUv.nNvNUVU = false;
               this.uVUVnuvnuVuv();
               return true;
            }
         }
      } else {
         return super.method_25402(var1, var3, var5);
      }
   }

   public boolean method_25401(double var1, double var3, double var5, double var7) {
      if (this.nVVUuvuNnUN() <= this.vNnNNNuVVnUv) {
         return true;
      } else {
         this.VnvunuuvUNu -= (float)var7;
         int var9 = Math.max(0, this.nVVUuvuNnUN() - Math.max(1, this.vNnNNNuVVnUv));
         this.VnvunuuvUNu = uUnuvNvvNU(this.VnvunuuvUNu, 0.0F, var9);
         this.NvNvVNUv = 0.85F;
         return true;
      }
   }

   public boolean method_25403(double var1, double var3, int var5, double var6, double var8) {
      if (this.field_22787 != null && this.field_22787.method_22683() != null) {
         float var10 = this.C00OOC00oO(this.field_22787.method_22683(), var3);
         if (this.vNUUvuuVU && this.nVUNnUuU) {
            this.UuUVuuUu(var10);
            this.NvNvVNUv = 0.85F;
            return true;
         } else if (this.VNvuVnvnun >= 0) {
            this.uNVvVvUuuuU = var10;
            return true;
         } else if (this.unVVnuunNU >= 0) {
            this.uNVvVvUuuuU = var10;
            if (Math.abs(var10 - this.nvnUvvnUUN) > 3.5F * C00OOC00oO(this.vunuUUVVUv, this.uuuNUnuvvNNv)) {
               if (this.unVVnuunNU < this.VNNnnVUuvv.size()) {
                  this.VNvuVnvnun = this.unVVnuunNU;
                  this.VNNnnVUuvv.get(this.VNvuVnvnun).vvUVNVvvNUv = 1.0F;
               }

               this.unVVnuunNU = -1;
            }

            return true;
         } else {
            return super.method_25403(var1, var3, var5, var6, var8);
         }
      } else {
         return super.method_25403(var1, var3, var5, var6, var8);
      }
   }

   public boolean method_25406(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.unVVnuunNU = -1;
         if (this.vNUUvuuVU) {
            this.vNUUvuuVU = false;
            return true;
         }

         if (this.VNvuVnvnun >= 0) {
            this.C00OOC00oO();
            return true;
         }
      }

      return super.method_25406(var1, var3, var5);
   }

   private void UuUVuuUu(float var1) {
      float var2 = this.unUvvVVVVUu - this.UNuUVVuUuU;
      if (!(var2 <= 0.001F)) {
         float var3 = uUnuvNvvNU(var1 - this.unNuVNVUnV, this.vVuNvnVUvvv, this.vVuNvnVUvvv + var2);
         float var4 = (var3 - this.vVuNvnVUvvv) / var2;
         int var5 = Math.max(0, this.nVVUuvuNnUN() - Math.max(1, this.vNnNNNuVVnUv));
         this.VnvunuuvUNu = var4 * var5;
      }
   }

   private void C00OOC00oO() {
      int var1 = this.VNvuVnvnun;
      this.VNvuVnvnun = -1;
      if (var1 >= 0 && var1 < this.VNNnnVUuvv.size()) {
         NuvVVvUU.NVnVnNnN var2 = this.VNNnnVUuvv.get(var1);
         var2.vvUVNVvvNUv = 0.0F;
         int var3 = this.UuUVuuUu(var2);
         if (var3 != var1) {
            this.VNNnnVUuvv.remove(var1);
            this.VNNnnVUuvv.add(UuUVuuUu(var3, 0, this.VNNnnVUuvv.size()), var2);
            this.UvUNuNvvNVNv = this.C00OOC00oO(var2.UuUVuuUu);
            this.uUnuvNvvNU("Reordered " + var2.C00OOC00oO);
            this.VVuuUN();
         }
      }
   }

   private int UuUVuuUu(float var1, float var2, float var3) {
      float var4 = uUnuvNvvNU(this.uNVvVvUuuuU - this.vVnuVVvVNuNu, this.NvnnUUuVvNU, this.NvnnUUuVvNU + var3 - var1);
      return Math.round((var4 - this.NvnnUUuVvNU) / Math.max(var1 + var2, 1.0F) + this.nuVuunUn);
   }

   private int UuUVuuUu(NuvVVvUU.NVnVnNnN var1) {
      float var2 = Math.max(var1.uUVuVvuNUvnu, 1.0F);
      int var3 = this.UuUVuuUu(var2, var1.c0oOOCcCoC0, this.nvuUVvuuN);
      int var4 = 0;

      for (int var5 = 0; var5 < this.VNNnnVUuvv.size(); var5++) {
         NuvVVvUU.NVnVnNnN var6 = this.VNNnnVUuvv.get(var5);
         if (var6 != var1 && !var6.NUVvUUVuVNVv && !var6.ccOO0COcoco0) {
            if (var4 == var3) {
               return var5;
            }

            var4++;
         }
      }

      return this.VNNnnVUuvv.size() - 1;
   }

   public boolean method_25400(char var1, int var2) {
      if (!this.NnUVNnuvUv.nNvNUVU) {
         return super.method_25400(var1, var2);
      } else {
         if (var1 >= 'A' && var1 <= 'Z' || var1 >= 'a' && var1 <= 'z' || var1 >= '0' && var1 <= '9' || var1 == '_') {
            this.NnUVNnuvUv.UuUVuuUu(var1);
         }

         return true;
      }
   }

   public boolean method_25404(int var1, int var2, int var3) {
      if (var1 == 256) {
         if (this.occOCoc0OcO != null) {
            this.uVUVnuvnuVuv();
            this.uUnuvNvvNU("Delete cancelled");
            return true;
         } else if (this.NVNnnvnuunNv()) {
            this.NnUuNNU();
            return true;
         } else if (this.NnUVNnuvUv.nNvNUVU) {
            this.NnUVNnuvUv.nNvNUVU = false;
            this.NnUVNnuvUv.UnUNuUU = false;
            return true;
         } else {
            this.UuUVuuUu(NuvVVvUU.VvunVVUvUNnv.BACK);
            return true;
         }
      } else {
         if (this.NnUVNnuvUv.nNvNUVU) {
            boolean var4 = (var3 & 2) != 0 || (var3 & 8) != 0;
            if (var4) {
               if (var1 == 67) {
                  if (this.field_22787 != null && this.field_22787.field_1774 != null && !this.NnUVNnuvUv.uNnUnnuNUnNu.isEmpty()) {
                     this.field_22787.field_1774.method_1455(this.NnUVNnuvUv.uNnUnnuNUnNu);
                  }

                  return true;
               }

               if (var1 == 86) {
                  if (this.field_22787 != null && this.field_22787.field_1774 != null) {
                     String var5 = this.field_22787.field_1774.method_1460();
                     if (var5 != null) {
                        this.NnUVNnuvUv.UuUVuuUu(var5.replaceAll("[^A-Za-z0-9_]", ""));
                     }
                  }

                  return true;
               }

               if (var1 == 65) {
                  this.NnUVNnuvUv.UnUNuUU = true;
                  return true;
               }
            }

            if (var1 == 259) {
               this.NnUVNnuvUv.C00OOC00oO();
               return true;
            }

            if (var1 == 261) {
               this.NnUVNnuvUv.uUnuvNvvNU();
               return true;
            }

            if (var1 == 263) {
               this.NnUVNnuvUv.UnUNuUU = false;
               this.NnUVNnuvUv.NnUuNNU = UuUVuuUu(this.NnUVNnuvUv.NnUuNNU - 1, 0, this.NnUVNnuvUv.uNnUnnuNUnNu.length());
               return true;
            }

            if (var1 == 262) {
               this.NnUVNnuvUv.UnUNuUU = false;
               this.NnUVNnuvUv.NnUuNNU = UuUVuuUu(this.NnUVNnuvUv.NnUuNNU + 1, 0, this.NnUVNnuvUv.uNnUnnuNUnNu.length());
               return true;
            }

            if (var1 == 257 || var1 == 335) {
               this.UuUVuuUu(NuvVVvUU.VvunVVUvUNnv.ADD_CRACKED);
               return true;
            }
         }

         boolean var6 = (var3 & 2) != 0 || (var3 & 8) != 0;
         if (var6 && var1 == 67) {
            this.UnUNuUU();
            return true;
         } else if (var6 && var1 == 83) {
            this.uUVuVvuNUvnu();
            return true;
         } else if (var6 && var1 == 71) {
            this.UuUVuuUu(5);
            return true;
         } else if (var1 == 257 || var1 == 335) {
            this.UuUVuuUu(NuvVVvUU.VvunVVUvUNnv.USE);
            return true;
         } else if (var1 == 261) {
            this.UuUVuuUu(NuvVVvUU.VvunVVUvUNnv.DELETE);
            return true;
         } else if (var1 == 264) {
            this.C00OOC00oO(1);
            return true;
         } else if (var1 == 265) {
            this.C00OOC00oO(-1);
            return true;
         } else {
            return super.method_25404(var1, var2, var3);
         }
      }
   }

   private void UuUVuuUu(boolean var1) {
      this.VNNnnVUuvv.clear();
      this.uuVuUuuVVNvN.clear();
      File var2 = this.uVUuuVnNVU();
      boolean var3 = var2.exists() && !vNnUUnNVvvV.uUnuvNvvNU(var2);

      for (vNnUUnNVvvV.NVnVnNnN var5 : vNnUUnNVvvV.UuUVuuUu(var2)) {
         this.uuVuUuuVVNvN.put(var5.id(), var5.password());
         this.VNNnnVUuvv
            .add(
               new NuvVVvUU.NVnVnNnN(
                  var5.name(), NuvVVvUU.nvnNNunvv.UuUVuuUu(var5.type()), false, this.uNUnUuUnvnnU, var5.id(), var5.createdAt(), var5.lastUsedAt()
               )
            );
      }

      class_310 var7 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
      if (var7 != null && var7.method_1548() != null) {
         uUNNNVNVvNV.UuUVuuUu(var7);
         uUNNNVNVvNV.C00OOC00oO(var7)
            .filter(var1x -> !var1x.method_1676().equalsIgnoreCase(var7.method_1548().method_1676()))
            .ifPresent(var1x -> this.UuUVuuUu(var1x, true));
         this.UuUVuuUu(var7.method_1548(), true);
      }

      for (int var8 = 0; var8 < this.VNNnnVUuvv.size(); var8++) {
         NuvVVvUU.NVnVnNnN var6 = this.VNNnnVUuvv.get(var8);
         var6.uVunuUNVVUUV = var1 ? -1.0F : this.uNUnUuUnvnnU + 0.14F + var8 * 0.055F;
         var6.vNUvnnVnUvu.UuUVuuUu(var1 ? 1.0F : 0.0F);
         var6.nuunNvv = var1 ? 1.0F : 0.0F;
      }

      if (var3) {
         this.vVvUvVVuuNvV();
      }
   }

   private void uUnuvNvvNU() {
      this.UuUVuuUu(350L);
   }

   private void vVvUvVVuuNvV() {
      this.UuUVuuUu(0L);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void uNNnnnuuuN() {
      ScheduledFuture var1 = this.uuuvuUUNVVUN;
      if (var1 != null) {
         var1.cancel(false);
         this.uuuvuUUNVVUN = null;
      }

      boolean var6 = false /* VF: Semaphore variable */;

      label44: {
         try {
            var6 = true;
            this.uuuvuUUNVVUN = o0Ooc0COOoc.schedule(this::nuUnNvnuUu, 0L, TimeUnit.MILLISECONDS);
            this.uuuvuUUNVVUN.get(10L, TimeUnit.SECONDS);
            var6 = false;
            break label44;
         } catch (Throwable var7) {
            var6 = false;
         } finally {
            if (var6) {
               this.uuuvuUUNVVUN = null;
            }
         }

         this.uuuvuUUNVVUN = null;
         return;
      }

      this.uuuvuUUNVVUN = null;
   }

   private void UuUVuuUu(long var1) {
      ScheduledFuture var3 = this.uuuvuUUNVVUN;
      if (var3 != null) {
         var3.cancel(false);
      }

      this.uuuvuUUNVVUN = o0Ooc0COOoc.schedule(this::nuUnNvnuUu, var1, TimeUnit.MILLISECONDS);
   }

   private void nuUnNvnuUu() {
      File var1 = this.uVUuuVnNVU();
      ArrayList var2;
      String var3;
      synchronized (this.VNNnnVUuvv) {
         var2 = new ArrayList();

         for (NuvVVvUU.NVnVnNnN var6 : this.VNNnnVUuvv) {
            if (!var6.NUVvUUVuVNVv && !var6.ccOO0COcoco0 && !var6.vVvUvVVuuNvV) {
               var2.add(
                  new vNnUUnNVvvV.NVnVnNnN(
                     var6.UuUVuuUu,
                     var6.C00OOC00oO,
                     var6.uUnuvNvvNU.name(),
                     this.uuVuUuuVVNvN.getOrDefault(var6.UuUVuuUu, ""),
                     var6.UnUNVVVNuv,
                     var6.vNVuvnUUnuUn
                  )
               );
            }
         }

         var3 = this.vNUvnnVnUvu();
      }

      vNnUUnNVvvV.UuUVuuUu(var1, var2, var3);
   }

   private void VVuuUN() {
      this.vVvUvVVuuNvV();
   }

   private String vNUvnnVnUvu() {
      NuvVVvUU.NVnVnNnN var1 = this.UvUvUNuvNU();
      return var1 != null && !var1.vVvUvVVuuNvV ? var1.UuUVuuUu : vNnUUnNVvvV.C00OOC00oO(this.uVUuuVnNVU());
   }

   private File uVUuuVnNVU() {
      File var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu
         : ru.metaculture.protection.NVnVnNnN.C00OOC00oO();
      return new File(var1, "accounts.json");
   }

   private void vuuuNvNuv() {
      class_310 var1 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
      String var2 = var1 != null && var1.method_1548() != null ? var1.method_1548().method_1676() : "";
      String var3 = vNnUUnNVvvV.C00OOC00oO(this.uVUuuVnNVU());
      int var4 = this.C00OOC00oO(var3);
      if (var4 >= 0) {
         this.UuUVuuUu(var4, null);
      } else {
         int var5 = this.UuUVuuUu(var2);
         if (var5 >= 0) {
            this.UuUVuuUu(var5, null);
         } else if (!this.VNNnnVUuvv.isEmpty()) {
            this.UuUVuuUu(0, null);
         } else {
            this.UvUNuNvvNVNv = -1;
         }
      }
   }

   private int UuUVuuUu(String var1) {
      if (var1 != null && !var1.isBlank()) {
         class_310 var2 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
         boolean var3 = var2 != null && var2.method_1548() != null && var2.method_1548().method_35718() != class_321.field_1990;
         NuvVVvUU.nvnNNunvv var4 = var3 ? NuvVVvUU.nvnNNunvv.PREMIUM : NuvVVvUU.nvnNNunvv.CRACKED;

         for (int var5 = 0; var5 < this.VNNnnVUuvv.size(); var5++) {
            NuvVVvUU.NVnVnNnN var6 = this.VNNnnVUuvv.get(var5);
            if (!var6.NUVvUUVuVNVv && !var6.ccOO0COcoco0 && var6.uUnuvNvvNU == var4 && var6.C00OOC00oO.equals(var1)) {
               return var5;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private int C00OOC00oO(String var1) {
      if (var1 != null && !var1.isBlank()) {
         for (int var2 = 0; var2 < this.VNNnnVUuvv.size(); var2++) {
            NuvVVvUU.NVnVnNnN var3 = this.VNNnnVUuvv.get(var2);
            if (!var3.NUVvUUVuVNVv && !var3.ccOO0COcoco0 && var1.equals(var3.UuUVuuUu)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private int UuUVuuUu(String var1, NuvVVvUU.nvnNNunvv var2) {
      if (var1 != null && !var1.isBlank()) {
         for (int var3 = 0; var3 < this.VNNnnVUuvv.size(); var3++) {
            NuvVVvUU.NVnVnNnN var4 = this.VNNnnVUuvv.get(var3);
            if (!var4.NUVvUUVuVNVv && !var4.ccOO0COcoco0 && var4.uUnuvNvvNU == var2 && var4.C00OOC00oO.equals(var1)) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private void UuUVuuUu(int var1, String var2) {
      if (var1 >= 0 && var1 < this.VNNnnVUuvv.size()) {
         if (this.UvUNuNvvNVNv != var1) {
            NuvVVvUU.NVnVnNnN var3 = this.VNNnnVUuvv.get(var1);
            var3.UuNnnVnuNNV = 0.0F;
            var3.NnunUUnU = true;
            this.uVUVnuvnuVuv();
         }

         this.UvUNuNvvNVNv = var1;
         if (var2 != null) {
            this.uUnuvNvvNU(var2);
         }

         this.nnuUVNUuvvVU();
      } else {
         this.UvUNuNvvNVNv = -1;
      }
   }

   private void uUnuvNvvNU(String var1) {
      this.UVUnUvUNU = var1 == null ? "" : var1;
      this.vnuNNVvVVuN = this.UVUnUvUNU.isEmpty() ? 0L : System.nanoTime() + 2600000000L;
   }

   private void nvUVNnuu() {
      if (this.NVNnnvnuunNv()) {
         this.nNvNUVU();
      } else {
         String var1 = uVUuuVnNVU(this.NnUVNnuvUv.uNnUnnuNUnNu);
         if (var1.isBlank()) {
            this.uUnuvNvvNU("Enter a username first");
            this.NnUVNnuvUv.UuuNnUvUuv = 1.0F;
            this.NnUVNnuvUv.nNvNUVU = true;
         } else {
            int var2 = this.UuUVuuUu(var1, NuvVVvUU.nvnNNunvv.CRACKED);
            if (var2 >= 0) {
               this.UuUVuuUu(var2, "Identity already exists");
               NuvVVvUU.NVnVnNnN var6 = this.VNNnnVUuvv.get(var2);
               var6.NVUunUNUN = 1.0F;
               this.uUnuvNvvNU();
            } else {
               long var3 = System.currentTimeMillis();
               NuvVVvUU.NVnVnNnN var5 = new NuvVVvUU.NVnVnNnN(
                  var1, NuvVVvUU.nvnNNunvv.CRACKED, false, this.uNUnUuUnvnnU, C00OOC00oO(var1, NuvVVvUU.nvnNNunvv.CRACKED), var3, 0L
               );
               var5.NVUunUNUN = 1.0F;
               this.VNNnnVUuvv.add(var5);
               this.vUvUvUNNuNvn.add(var1.toLowerCase(Locale.ROOT));
               this.UuUVuuUu(this.VNNnnVUuvv.size() - 1, "Added " + var1);
               this.NnUVNnuvUv.uUnuvNvvNU();
               this.VVuuUN();
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      Set var1 = this.nUUVuvU();

      for (int var2 = 0; var2 < 256; var2++) {
         String var3 = UnUNVVVNuv();
         if (!var3.isBlank() && !var1.contains(var3.toLowerCase(Locale.ROOT))) {
            this.vVvUvVVuuNvV(var3);
            return;
         }
      }

      String var4 = UuUVuuUu(var1);
      if (!var4.isBlank()) {
         this.vVvUvVVuuNvV(var4);
      } else {
         this.uUnuvNvvNU("Generated identity collision");
         this.NnUVNnuvUv.UuuNnUvUuv = 1.0F;
      }
   }

   private Set<String> nUUVuvU() {
      HashSet var1 = new HashSet<>(this.vUvUvUNNuNvn);

      for (NuvVVvUU.NVnVnNnN var3 : this.VNNnnVUuvv) {
         if (!var3.NUVvUUVuVNVv && !var3.ccOO0COcoco0) {
            var1.add(var3.C00OOC00oO.toLowerCase(Locale.ROOT));
         }
      }

      String var4 = uVUuuVnNVU(this.NnUVNnuvUv.uNnUnnuNUnNu);
      if (!var4.isBlank()) {
         var1.add(var4.toLowerCase(Locale.ROOT));
      }

      return var1;
   }

   private void vVvUvVVuuNvV(String var1) {
      this.vUvUvUNNuNvn.add(var1.toLowerCase(Locale.ROOT));
      this.NnUVNnuvUv.uUnuvNvvNU();
      this.NnUVNnuvUv.UuUVuuUu(var1);
      this.NnUVNnuvUv.nNvNUVU = true;
      this.NnUVNnuvUv.UnUNuUU = true;
      this.NnUVNnuvUv.UuuNnUvUuv = 1.0F;
      this.uUnuvNvvNU("Rolled " + var1);
   }

   private static String UnUNVVVNuv() {
      ThreadLocalRandom var0 = ThreadLocalRandom.current();

      for (int var1 = 0; var1 < 28; var1++) {
         String var2 = NvUVUvVVnUu[var0.nextInt(NvUVUvVVnUu.length)];
         String var3 = NvUVUvVVnUu[var0.nextInt(NvUVUvVVnUu.length)];
         String var4 = VunnVNvNV[var0.nextInt(VunnVNvNV.length)];
         String var5 = unnUnUNVnN[var0.nextInt(unnUnUNVnN.length)];
         String var6 = UuUVuuUu(var0, var0.nextInt(2, 5));
         String var7 = var2.substring(0, Math.min(var2.length(), var0.nextInt(2, Math.min(4, var2.length()) + 1)));
         String var8 = var3.substring(0, Math.min(var3.length(), var0.nextInt(2, Math.min(4, var3.length()) + 1)));
         String var9 = var0.nextInt(100) < 18 ? "_" : "";
         String var10 = C00OOC00oO(var0);
         String var11 = var0.nextInt(100) < 40 ? var10 : "";
         String var12 = var0.nextInt(100) < 45 ? var5 : "";

         String var13 = switch (var0.nextInt(20)) {
            case 0 -> vNUvnnVnUvu(var2) + vNUvnnVnUvu(var3);
            case 1 -> var4 + vNUvnnVnUvu(var2);
            case 2 -> vNUvnnVnUvu(var2) + var5;
            case 3 -> var2 + var9 + var10;
            case 4 -> vNUvnnVnUvu(var7) + vNUvnnVnUvu(var3);
            case 5 -> var2 + vNUvnnVnUvu(var8);
            case 6 -> vNUvnnVnUvu(var6) + (var0.nextInt(100) < 28 ? var5 : "");
            case 7 -> var6 + var9 + var10;
            case 8 -> vNUvnnVnUvu(var2) + vNUvnnVnUvu(var8) + var11;
            case 9 -> var4 + var9 + var6;
            case 10 -> var7 + vNUvnnVnUvu(UuUVuuUu(var0, var0.nextInt(1, 3))) + var5;
            case 11 -> uNNnnnuuuN(var2) + var12;
            case 12 -> vNUvnnVnUvu(var2) + "_" + vNUvnnVnUvu(var3);
            case 13 -> nuUnNvnuUu(var2) + vNUvnnVnUvu(var3);
            case 14 -> "xX" + vNUvnnVnUvu(var2) + "Xx";
            case 15 -> VVuuUN(var2) + var11;
            case 16 -> vNUvnnVnUvu(var4) + vNUvnnVnUvu(var2) + var5;
            case 17 -> vNUvnnVnUvu(var2) + uNNnnnuuuN(var8);
            case 18 -> vNUvnnVnUvu(var2) + UuUVuuUu(var0);
            default -> vNUvnnVnUvu(var2) + var12 + (var0.nextInt(100) < 36 ? var10 : "");
         };
         var13 = uVUuuVnNVU(var13);
         if (var13.length() >= 3 && var13.length() <= 16) {
            return var13;
         }
      }

      return UuUVuuUu(Set.of());
   }

   private static String uNNnnnuuuN(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         StringBuilder var1 = new StringBuilder(var0.length());

         for (int var2 = 0; var2 < var0.length(); var2++) {
            char var3 = Character.toLowerCase(var0.charAt(var2));

            var1.append(switch (var3) {
               case 'a' -> '4';
               default -> var0.charAt(var2);
               case 'e' -> '3';
               case 'i' -> '1';
               case 'o' -> '0';
               case 's' -> '5';
               case 't' -> '7';
            });
         }

         return var1.toString();
      } else {
         return "";
      }
   }

   private static String nuUnNvnuUu(String var0) {
      if (var0 != null && var0.length() >= 4) {
         StringBuilder var1 = new StringBuilder(var0.length());

         for (int var2 = 0; var2 < var0.length(); var2++) {
            char var3 = var0.charAt(var2);
            boolean var4 = "aeiouAEIOU".indexOf(var3) >= 0;
            if (!var4 || var2 == 0) {
               var1.append(var3);
            }
         }

         return var1.length() < 2 ? var0 : var1.toString();
      } else {
         return var0 == null ? "" : var0;
      }
   }

   private static String VVuuUN(String var0) {
      return var0 != null && !var0.isEmpty() ? var0 + var0.charAt(var0.length() - 1) : "";
   }

   private static String UuUVuuUu(ThreadLocalRandom var0) {
      int var1 = var0.nextInt(100);
      return var1 < 10 ? "0" + var1 : String.valueOf(var1);
   }

   private static String UuUVuuUu(ThreadLocalRandom var0, int var1) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < var1; var3++) {
         var2.append(NnuUnUNnu[var0.nextInt(NnuUnUNnu.length)]);
      }

      return var2.toString();
   }

   private static String C00OOC00oO(ThreadLocalRandom var0) {
      return switch (var0.nextInt(4)) {
         case 0 -> String.valueOf(var0.nextInt(7, 99));
         case 1 -> String.valueOf(var0.nextInt(100, 999));
         case 2 -> String.valueOf(var0.nextInt(1000, 9999));
         default -> String.valueOf(var0.nextInt(10, 9999));
      };
   }

   private static String UuUVuuUu(Set<String> var0) {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();

      for (int var2 = 0; var2 < 64; var2++) {
         String var3 = Long.toUnsignedString(var1.nextLong(), 36);
         if (var3.length() > 8) {
            var3 = var3.substring(0, 8);
         }

         String var4 = uVUuuVnNVU("Wild" + var3);
         if (!var4.isBlank() && !var0.contains(var4.toLowerCase(Locale.ROOT))) {
            return var4;
         }
      }

      return "";
   }

   private static String vNUvnnVnUvu(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         return var0.length() == 1 ? var0.toUpperCase(Locale.ROOT) : var0.substring(0, 1).toUpperCase(Locale.ROOT) + var0.substring(1);
      } else {
         return "";
      }
   }

   private void vNVuvnUUnuUn() {
      NuvVVvUU.NVnVnNnN var1 = this.UvUvUNuvNU();
      class_310 var2 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
      if (var1 != null && var2 != null) {
         this.C00OOC00oO(var1);
      } else {
         this.uUnuvNvvNU("Select an identity first");
      }
   }

   private void C00OOC00oO(NuvVVvUU.NVnVnNnN var1) {
      class_310 var2 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
      if (var1 != null && var2 != null) {
         uUNNNVNVvNV.UuUVuuUu(var2);
         boolean var3 = false;
         if (var1.uUnuvNvvNU == NuvVVvUU.nvnNNunvv.PREMIUM) {
            var3 = uUNNNVNVvNV.UuUVuuUu(var2, var1.C00OOC00oO);
         }

         if (!var3) {
            uUNNNVNVvNV.C00OOC00oO(var2, var1.C00OOC00oO);
         }

         var1.vNVuvnUUnuUn = System.currentTimeMillis();
         var1.NVUunUNUN = 1.0F;
         var1.UuNnnVnuNNV = 0.0F;
         var1.NnunUUnU = true;
         NUNUnUuNNuuN.UuUVuuUu(var1.C00OOC00oO, "");
         this.uUnuvNvvNU("Signed in as " + var1.C00OOC00oO);
         this.VVuuUN();
      }
   }

   private void UvnvNVnnnnNU() {
      NuvVVvUU.NVnVnNnN var1 = this.UvUvUNuvNU();
      if (var1 == null) {
         this.uUnuvNvvNU("Select an identity first");
      } else {
         this.uUnuvNvvNU(var1);
      }
   }

   private void uUnuvNvvNU(NuvVVvUU.NVnVnNnN var1) {
      if (var1 != null) {
         if (var1.UuUVuuUu.equals(this.occOCoc0OcO)) {
            this.vVvUvVVuuNvV(var1);
         } else {
            this.occOCoc0OcO = var1.UuUVuuUu;
            this.Oco0Oococc = System.nanoTime() + 2600000000L;
            this.uUnuvNvvNU("Delete " + var1.C00OOC00oO + "? Click again");
         }
      }
   }

   private void uVUVnuvnuVuv() {
      this.occOCoc0OcO = null;
      this.Oco0Oococc = 0L;
   }

   private void C00OOC00oO(long var1) {
      if (this.occOCoc0OcO != null) {
         if (var1 >= this.Oco0Oococc || this.C00OOC00oO(this.occOCoc0OcO) < 0) {
            this.uVUVnuvnuVuv();
         }
      }
   }

   private float uUnuvNvvNU(long var1) {
      return this.occOCoc0OcO != null && this.Oco0Oococc > 0L ? uUnuvNvvNU((float)(this.Oco0Oococc - var1) / 2.6E9F, 0.0F, 1.0F) : 0.0F;
   }

   private void vVvUvVVuuNvV(NuvVVvUU.NVnVnNnN var1) {
      int var2 = this.C00OOC00oO(var1.UuUVuuUu);
      if (var2 < 0) {
         this.uVUVnuvnuVuv();
      } else {
         var1.ccOO0COcoco0 = true;
         var1.uUVVvVVNvvn = this.uNUnUuUnvnnU;
         var1.NVUunUNUN = 1.0F;
         this.uVUVnuvnuVuv();
         this.uUnuvNvvNU("Removed " + var1.C00OOC00oO);
         this.UvUNuNvvNVNv = this.VNNnnVUuvv.size() <= 1 ? -1 : (var2 >= this.VNNnnVUuvv.size() - 1 ? var2 - 1 : var2 + 1);
         this.nnuUVNUuvvVU();
         this.VVuuUN();
      }
   }

   private boolean NVNnnvnuunNv() {
      return this.UvUnnnn != null && this.C00OOC00oO(this.UvUnnnn) >= 0;
   }

   private boolean uVunuUNVVUUV() {
      if (this.NVNnnvnuunNv()) {
         return true;
      } else {
         NuvVVvUU.NVnVnNnN var1 = this.UvUvUNuvNU();
         return var1 != null && !var1.vVvUvVVuuNvV;
      }
   }

   private void UNnVVNvvnVvU() {
      if (this.NVNnnvnuunNv()) {
         this.NnUuNNU();
      } else {
         this.uNnUnnuNUnNu();
      }
   }

   private void uNnUnnuNUnNu() {
      NuvVVvUU.NVnVnNnN var1 = this.UvUvUNuvNU();
      this.uNNnnnuuuN(var1);
   }

   private void uNNnnnuuuN(NuvVVvUU.NVnVnNnN var1) {
      if (var1 != null && !var1.vVvUvVVuuNvV) {
         this.UvUnnnn = var1.UuUVuuUu;
         this.NnUVNnuvUv.uUnuvNvvNU();
         this.NnUVNnuvUv.UuUVuuUu(var1.C00OOC00oO);
         this.NnUVNnuvUv.nNvNUVU = true;
         this.NnUVNnuvUv.UnUNuUU = true;
         this.NnUVNnuvUv.UuuNnUvUuv = 1.0F;
         this.uUnuvNvvNU("Renaming " + var1.C00OOC00oO);
      } else {
         this.uUnuvNvvNU("Pick a saved identity to rename");
         this.NnUVNnuvUv.UuuNnUvUuv = 1.0F;
      }
   }

   private void NnUuNNU() {
      this.UvUnnnn = null;
      this.NnUVNnuvUv.uUnuvNvvNU();
      this.NnUVNnuvUv.nNvNUVU = false;
      this.NnUVNnuvUv.UnUNuUU = false;
      this.uUnuvNvvNU("Rename cancelled");
   }

   private void nNvNUVU() {
      String var1 = uVUuuVnNVU(this.NnUVNnuvUv.uNnUnnuNUnNu);
      if (var1.isBlank()) {
         this.uUnuvNvvNU("Enter a username first");
         this.NnUVNnuvUv.UuuNnUvUuv = 1.0F;
      } else {
         int var2 = this.C00OOC00oO(this.UvUnnnn);
         if (var2 < 0) {
            this.UvUnnnn = null;
            this.uUnuvNvvNU("Identity not found");
         } else {
            NuvVVvUU.NVnVnNnN var3 = this.VNNnnVUuvv.get(var2);
            int var4 = this.UuUVuuUu(var1, var3.uUnuvNvvNU);
            if (var4 >= 0 && var4 != var2) {
               this.uUnuvNvvNU("Identity already exists");
               this.NnUVNnuvUv.UuuNnUvUuv = 1.0F;
            } else if (var3.C00OOC00oO.equals(var1)) {
               this.UvUnnnn = null;
               this.NnUVNnuvUv.uUnuvNvvNU();
               this.NnUVNnuvUv.nNvNUVU = false;
               this.uUnuvNvvNU("Renamed identity");
            } else {
               String var5 = C00OOC00oO(var1, var3.uUnuvNvvNU);
               String var6 = this.uuVuUuuVVNvN.getOrDefault(var3.UuUVuuUu, "");
               NuvVVvUU.NVnVnNnN var7 = new NuvVVvUU.NVnVnNnN(var1, var3.uUnuvNvvNU, false, -1.0F, var5, var3.UnUNVVVNuv, var3.vNVuvnUUnuUn);
               var7.nuunNvv = 1.0F;
               var7.vNUvnnVnUvu.UuUVuuUu(1.0F);
               var7.NVUunUNUN = 1.0F;
               var7.VVuuUN.UuUVuuUu(var3.VVuuUN.UuUVuuUu());
               this.VNNnnVUuvv.set(var2, var7);
               this.uuVuUuuVVNvN.remove(var3.UuUVuuUu);
               this.uuVuUuuVVNvN.put(var5, var6);
               this.vUvUvUNNuNvn.add(var1.toLowerCase(Locale.ROOT));
               this.UvUNuNvvNVNv = var2;
               this.UvUnnnn = null;
               this.NnUVNnuvUv.uUnuvNvvNU();
               this.NnUVNnuvUv.nNvNUVU = false;
               this.uUnuvNvvNU("Renamed to " + var1);
               this.VVuuUN();
            }
         }
      }
   }

   private void UnUNuUU() {
      NuvVVvUU.NVnVnNnN var1 = this.UvUvUNuvNU();
      if (var1 != null && this.field_22787 != null && this.field_22787.field_1774 != null) {
         this.field_22787.field_1774.method_1455(var1.C00OOC00oO);
         this.uUnuvNvvNU("Copied " + var1.C00OOC00oO);
      } else {
         this.uUnuvNvvNU("Select an identity first");
      }
   }

   private void uUVuVvuNUvnu() {
      if (this.VNNnnVUuvv.size() >= 2) {
         NuvVVvUU.NVnVnNnN var1 = this.UvUvUNuvNU();
         String var2 = var1 == null ? null : var1.UuUVuuUu;
         this.VNNnnVUuvv.sort((var0, var1x) -> Long.compare(var1x.vNVuvnUUnuUn, var0.vNVuvnUUnuUn));
         if (var2 != null) {
            int var3 = this.C00OOC00oO(var2);
            if (var3 >= 0) {
               this.UvUNuNvvNVNv = var3;
            }
         }

         this.uUnuvNvvNU("Sorted by last used");
         this.nnuUVNUuvvVU();
         this.uUnuvNvvNU();
      }
   }

   private void UuUVuuUu(int var1) {
      int var2 = 0;
      long var3 = System.currentTimeMillis();

      for (int var5 = 0; var5 < var1; var5++) {
         Set var6 = this.nUUVuvU();
         String var7 = UnUNVVVNuv();
         if (var7.isBlank() || var6.contains(var7.toLowerCase(Locale.ROOT))) {
            var7 = UuUVuuUu(var6);
         }

         if (!var7.isBlank()) {
            NuvVVvUU.NVnVnNnN var8 = new NuvVVvUU.NVnVnNnN(
               var7, NuvVVvUU.nvnNNunvv.CRACKED, false, this.uNUnUuUnvnnU, C00OOC00oO(var7, NuvVVvUU.nvnNNunvv.CRACKED), var3, 0L
            );
            var8.NVUunUNUN = 1.0F;
            this.VNNnnVUuvv.add(var8);
            this.vUvUvUNNuNvn.add(var7.toLowerCase(Locale.ROOT));
            var2++;
         }
      }

      if (var2 > 0) {
         this.UuUVuuUu(this.VNNnnVUuvv.size() - 1, "Added " + var2 + " identities");
         this.VVuuUN();
      } else {
         this.uUnuvNvvNU("Generation collision");
         this.NnUVNnuvUv.UuuNnUvUuv = 1.0F;
      }
   }

   private NuvVVvUU.NVnVnNnN UvUvUNuvNU() {
      if (this.UvUNuNvvNVNv >= 0 && this.UvUNuNvvNVNv < this.VNNnnVUuvv.size()) {
         NuvVVvUU.NVnVnNnN var1 = this.VNNnnVUuvv.get(this.UvUNuNvvNVNv);
         return !var1.NUVvUUVuVNVv && !var1.ccOO0COcoco0 ? var1 : null;
      } else {
         return null;
      }
   }

   private void c0oOOCcCoC0() {
      boolean var1 = false;

      for (int var2 = this.VNNnnVUuvv.size() - 1; var2 >= 0; var2--) {
         NuvVVvUU.NVnVnNnN var3 = this.VNNnnVUuvv.get(var2);
         if (var3.ccOO0COcoco0 && this.uNUnUuUnvnnU - var3.uUVVvVVNvvn > 0.46F) {
            this.VNNnnVUuvv.remove(var2);
            var1 = true;
            if (this.UvUNuNvvNVNv >= var2) {
               this.UvUNuNvvNVNv--;
            }
         }
      }

      if (var1) {
         this.UvUNuNvvNVNv = this.VNNnnVUuvv.isEmpty() ? -1 : UuUVuuUu(this.UvUNuNvvNVNv, 0, this.VNNnnVUuvv.size() - 1);
         this.nnuUVNUuvvVU();
      }
   }

   private void UuUVuuUu(NuvVVvUU.NVnVnNnN var1, int var2) {
      switch (var2) {
         case 0:
            this.C00OOC00oO(var1);
            break;
         case 1:
            this.uNNnnnuuuN(var1);
            break;
         default:
            this.uUnuvNvvNU(var1);
      }
   }

   private void UuUVuuUu(NuvVVvUU.VvunVVUvUNnv var1) {
      class_310 var2 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
      switch (var1) {
         case USE:
            this.vNVuvnUUnuUn();
            break;
         case ADD_CRACKED:
            this.nvUVNnuu();
            break;
         case RANDOM:
            this.UuuNnUvUuv();
            break;
         case EDIT:
            this.UNnVVNvvnVvU();
            break;
         case DELETE:
            this.UvnvNVnnnnNU();
            break;
         case BACK:
            if (var2 != null) {
               var2.execute(() -> var2.method_1507(this.UnnnvvU));
            }
            break;
         case CREATE_FIRST:
            this.UuuNnUvUuv();
            this.nvUVNnuu();
      }
   }

   private void VVnVNnunVvu() {
      NvVNvUvunNNu var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
         : NvVNvUvunNNu.AURORA;
      this.nNVVUnuVVVuV = var1;
      this.vnVuunuNN = UuUVuuUu.uUnuvNvvNU(var1);
      this.unUVnu = UuUVuuUu.vVvUvVVuuNvV(var1);
      this.NvNUuuuvUvu = UuUVuuUu.uNNnnnuuuN(var1);
   }

   private void UuUVuuUu(class_1041 var1, int var2, int var3, float var4, long var5) {
      float var7 = this.UuUVuuUu(var1, (double)var2);
      float var8 = this.C00OOC00oO(var1, (double)var3);
      if (!this.vvVVVvVNVVVN) {
         this.OoccOc0CO = var7;
         this.UvuVvvVuUuuu = var8;
         this.NUUVUvvuNNVU = 0.0F;
         this.VUNvNUuNVnn = 0.0F;
         this.vvVVVvVNVVVN = true;
      } else {
         float var9 = var7 - this.OoccOc0CO;
         float var10 = var8 - this.UvuVvvVuUuuu;
         float var11 = uUnuvNvvNU(var9, var10);
         if (var11 > 0.2F) {
            this.NUUVUvvuNNVU = uUnuvNvvNU(var9 / Math.max(1.0F, (float)var1.method_4489()) / var4, -3.0F, 3.0F);
            this.VUNvNUuNVnn = uUnuvNvvNU(var10 / Math.max(1.0F, (float)var1.method_4506()) / var4, -3.0F, 3.0F);
         } else {
            float var12 = (float)Math.pow(8.0E-4F, var4);
            this.NUUVUvvuNNVU *= var12;
            this.VUNvNUuNVnn *= var12;
         }

         this.OoccOc0CO = var7;
         this.UvuVvvVuUuuu = var8;
         if (var11 > 1.5F) {
            this.vUvVUNnN = var5;
         }
      }
   }

   private void C00OOC00oO(int var1, int var2, float var3) {
      if (!this.uUuuVvVunVVu) {
         this.UNNunNuUNVuU = this.OoccOc0CO;
         this.NuUuUvUUvU = this.UvuVvvVuUuuu;
         this.VUVvNvvVUN = 0.0F;
         this.UvvNuvUNNNUv = 0.0F;
         this.uUuuVvVunVVu = true;
      } else {
         float var4 = this.UNNunNuUNVuU;
         float var5 = this.NuUuUvUUvU;
         float var6 = uUnuvNvvNU(this.OoccOc0CO - this.UNNunNuUNVuU, this.UvuVvvVuUuuu - this.NuUuUvUUvU);
         float var7 = (1.0F - (float)Math.pow(1.8E-5F, var3)) * (0.58F + uUnuvNvvNU(var6 / 780.0F, 0.0F, 0.28F));
         this.UNNunNuUNVuU = this.UNNunNuUNVuU + (this.OoccOc0CO - this.UNNunNuUNVuU) * uUnuvNvvNU(var7, 0.028F, 0.16F);
         this.NuUuUvUUvU = this.NuUuUvUUvU + (this.UvuVvvVuUuuu - this.NuUuUvUUvU) * uUnuvNvvNU(var7, 0.028F, 0.16F);
         float var8 = uUnuvNvvNU((this.UNNunNuUNVuU - var4) / Math.max(1.0F, (float)var1) / var3, -1.25F, 1.25F);
         float var9 = uUnuvNvvNU((this.NuUuUvUUvU - var5) / Math.max(1.0F, (float)var2) / var3, -1.25F, 1.25F);
         float var10 = 1.0F - (float)Math.pow(0.0045F, var3);
         this.VUVvNvvVUN = this.VUVvNvvVUN + (var8 - this.VUVvNvvVUN) * var10;
         this.UvvNuvUNNNUv = this.UvvNuvUNNNUv + (var9 - this.UvvNuvUNNNUv) * var10;
      }
   }

   private void unNNVVNnvvV() {
      if (!this.NuUvUNN) {
         this.NunUUVVVuu = this.UNNunNuUNVuU;
         this.uNUnuUUvvuU = this.NuUuUvUUvU;
         this.NuUvUNN = true;
         this.C00OOC00oO(this.UNNunNuUNVuU, this.NuUuUvUUvU, 0.18F);
      } else {
         float var1 = uUnuvNvvNU(this.UNNunNuUNVuU - this.NunUUVVVuu, this.NuUuUvUUvU - this.uNUnuUUvvuU);
         if (var1 > 10.5F) {
            this.C00OOC00oO(this.UNNunNuUNVuU, this.NuUuUvUUvU, uUnuvNvvNU(var1 / 280.0F, 0.06F, 0.3F));
            this.NunUUVVVuu = this.UNNunNuUNVuU;
            this.uNUnuUUvvuU = this.NuUuUvUUvU;
         }
      }
   }

   private boolean UuUVuuUu(class_1041 var1, int var2, int var3, int var4, int var5, long var6) {
      if (this.vunuUUVVUv == var2 && this.uuuNUnuvvNNv == var3) {
         return false;
      } else {
         this.vunuUUVVUv = var2;
         this.uuuNUnuvvNNv = var3;
         float var8 = uUnuvNvvNU(this.UuUVuuUu(var1, (double)var4), 0.0F, var2);
         float var9 = uUnuvNvvNU(this.C00OOC00oO(var1, (double)var5), 0.0F, var3);
         this.OoccOc0CO = this.UNNunNuUNVuU = this.NunUUVVVuu = var8;
         this.UvuVvvVuUuuu = this.NuUuUvUUvU = this.uNUnuUUvvuU = var9;
         this.NUUVUvvuNNVU = this.VUNvNUuNVnn = 0.0F;
         this.VUVvNvvVUN = this.UvvNuvUNNNUv = 0.0F;
         this.vvVVVvVNVVVN = true;
         this.uUuuVvVunVVu = true;
         this.NuUvUNN = true;
         this.vUvVUNnN = var6;
         this.vNUUvuuVU = false;
         this.VNvuVnvnun = -1;
         this.unVVnuunNU = -1;
         this.vuNnuUnu.UuUVuuUu(0.0F);
         this.uuvvuNvuUNVV.UuUVuuUu(0.0F);
         this.nuVuunUn = this.VnvunuuvUNu;

         for (NuvVVvUU.NVnVnNnN var11 : this.VNNnnVUuvv) {
            var11.UvNNVUVNVuvV = false;
         }

         this.NuunnvnN();
         this.C00OOC00oO(var8, var9, 0.12F);
         this.nnuUVNUuvvVU();
         return true;
      }
   }

   private void NuunnvnN() {
      for (NuvVVvUU.vUvuUvvVvvnN var4 : this.NNVNuUvVn) {
         var4.UuUVuuUu = 0.0F;
         var4.C00OOC00oO = 0.0F;
         var4.uUnuvNvvNU = -100.0F;
         var4.vVvUvVVuuNvV = 0.0F;
      }
   }

   private void C00OOC00oO(float var1, float var2, float var3) {
      int var4 = 0;
      float var5 = -1.0F;

      for (int var6 = 0; var6 < this.NNVNuUvVn.length; var6++) {
         float var7 = this.uNUnUuUnvnnU - this.NNVNuUvVn[var6].uUnuvNvvNU;
         if (this.NNVNuUvVn[var6].vVvUvVVuuNvV <= 0.0F) {
            var4 = var6;
            break;
         }

         if (var7 > var5) {
            var5 = var7;
            var4 = var6;
         }
      }

      this.NNVNuUvVn[var4].UuUVuuUu = var1;
      this.NNVNuUvVn[var4].C00OOC00oO = var2;
      this.NNVNuUvVn[var4].uUnuvNvvNU = this.uNUnUuUnvnnU;
      this.NNVNuUvVn[var4].vVvUvVVuuNvV = var3;
   }

   private void UuUVuuUu(int var1, int var2, float var3, float var4, float var5, long var6) {
      float var8 = C00OOC00oO(var1, var2);
      float var9 = 28.0F * var8;
      float var10 = var3 * 1.15F * var8;
      float var11 = var4 * 0.7F * var8;
      this.VnnnvUunNvuu = var2 * 0.108F + var4 * 0.45F * var8;
      this.VuuUVVu = this.VnnnvUunNvuu + 27.0F * var8;
      this.UuuuNNunN.nuUnNvnuUu = 34.0F * var8;
      this.UuuuNNunN.VVuuUN = 34.0F * var8;
      this.UuuuNNunN.vNUvnnVnUvu = this.UuuuNNunN.nuUnNvnuUu * 0.5F;
      this.UuuuNNunN.C00OOC00oO = var9;
      this.UuuuNNunN.uUnuvNvvNU = var9;
      this.nUununvNvvn = this.UuuuNNunN.C00OOC00oO + this.UuuuNNunN.nuUnNvnuUu * 0.5F;
      this.NuvunVvnnN = this.UuuuNNunN.uUnuvNvvNU + this.UuuuNNunN.VVuuUN * 0.5F;
      this.UuuuNNunN.NVNnnvnuunNv = VVuuUN(uUnuvNvvNU((this.uNUnUuUnvnnU - 0.05F) / 0.66F, 0.0F, 1.0F));
      boolean var12 = this.UuuuNNunN.UuUVuuUu(this.OoccOc0CO, this.UvuVvvVuUuuu);
      this.UuuuNNunN.uVUuuVnNVU = this.UuuuNNunN.uVUuuVnNVU + ((var12 ? 1.0F : 0.0F) - this.UuuuNNunN.uVUuuVnNVU) * (1.0F - (float)Math.pow(1.0E-4F, var5));
      this.UuuuNNunN.nvUVNnuu = this.UuuuNNunN.nvUVNnuu + (0.0F - this.UuuuNNunN.nvUVNnuu) * (1.0F - (float)Math.pow(1.8E-5F, var5));
      int var13 = this.nVVUuvuNnUN();
      boolean var14 = var13 == 0;
      this.vUNuuvvnVnv.UuUVuuUu(var14 ? 1.0F : 0.0F, var5);
      float var15 = uUnuvNvvNU(352.0F * var8, 240.0F * var8, var1 - var9 * 4.0F);
      float var16 = 64.0F * var8;
      float var17 = 8.0F * var8;
      float var18 = 46.0F * var8;
      float var19 = var18 * 0.295F;
      float var20 = var18 * 2.0F + 8.0F * var8;
      float var21 = this.VuuUVVu + 30.0F * var8;
      float var22 = var2 - var9;
      float var23 = var22 - var21 - var20 - 22.0F * var8;
      int var24 = Math.max(1, (int)Math.floor((var23 + var17) / (var16 + var17)));
      var24 = Math.min(var24, 7);
      this.vNnNNNuVVnUv = var14 ? 1 : Math.max(1, Math.min(var24, var13));
      float var25 = var14 ? 244.0F * var8 : this.vNnNNNuVVnUv * var16 + Math.max(0, this.vNnNNNuVVnUv - 1) * var17;
      int var26 = Math.max(0, var13 - Math.max(1, this.vNnNNNuVVnUv));
      this.VnvunuuvUNu = uUnuvNvvNU(this.VnvunuuvUNu, 0.0F, var26);
      float var27 = 1.0F - (float)Math.exp(-22.0F * var5);
      this.nuVuunUn = this.nuVuunUn + (this.VnvunuuvUNu - this.nuVuunUn) * var27;
      if (Float.isNaN(this.nuVuunUn)) {
         this.nuVuunUn = this.VnvunuuvUNu;
      }

      this.NvNvVNUv = Math.max(0.0F, this.NvNvVNUv - var5);
      float var28 = var25 + 22.0F * var8 + var20;
      this.CC0COO = uUnuvNvvNU((var2 - var28) * 0.465F, var21, Math.max(var21, var22 - var28)) + var11;
      this.uNnNUNvuVnu = this.CC0COO + var28;
      float var29 = var1 * 0.5F + var10;
      this.unnnNUNnVu = var29 - var15 * 0.5F;
      this.NvnnUUuVvNU = this.CC0COO;
      this.vVvuUVnV = var15;
      this.nvuUVvuuN = var25;
      this.nVUNnUuU = var26 > 0;
      float var30 = !this.vNUUvuuVU && !(this.NvNvVNUv > 0.0F) ? (this.NVUunUNUN() ? 0.62F : 0.0F) : 1.0F;
      float var31 = this.NVNnnvVnvV.UuUVuuUu(this.nVUNnUuU ? var30 : 0.0F, var5);
      if (this.nVUNnUuU) {
         this.OCCc0co0OOC = Math.max(2.5F, 3.0F * var8);
         this.UvNNNUvNnUUV = this.unnnNUNnVu + var15 + 12.0F * var8;
         this.vVuNvnVUvvv = this.NvnnUUuVvNU;
         this.unUvvVVVVUu = var25;
         float var32 = uUnuvNvvNU((float)this.vNnNNNuVVnUv / var13, 0.1F, 1.0F);
         this.UNuUVVuUuU = Math.max(28.0F * var8, this.unUvvVVVVUu * var32);
         float var33 = this.unUvvVVVVUu - this.UNuUVVuUuU;
         float var34 = var26 == 0 ? 0.0F : this.nuVuunUn / var26;
         this.nnUunUnNUN = this.vVuNvnVUvvv + var33 * var34;
      }

      this.NunnVUUuvUV = var31;
      String var53 = this.UUVNuUNUvUnV();
      int var54 = 0;
      int var55 = this.VNvuVnvnun >= 0 ? this.uUnuvNvvNU(this.VNvuVnvnun) : -1;

      for (int var35 = 0; var35 < this.VNNnnVUuvv.size(); var35++) {
         NuvVVvUU.NVnVnNnN var36 = this.VNNnnVUuvv.get(var35);
         if (var36.NUVvUUVuVNVv) {
            var36.nNuVunNUVu = false;
            var36.nuunNvv = 0.0F;
         } else {
            int var37 = var54;
            if (!var36.ccOO0COcoco0) {
               var54++;
            }

            float var38 = var37;
            if (this.VNvuVnvnun >= 0 && var35 != this.VNvuVnvnun) {
               int var39 = this.UuUVuuUu(var16, var17, var25);
               int var40 = var37 > var55 ? var37 - 1 : var37;
               var38 = var40 + (var40 >= var39 ? 1 : 0);
            }

            float var60 = var38 - this.nuVuunUn;
            var36.nNuVunNUVu = var60 > -1.02F && var60 < this.vNnNNNuVVnUv + 0.02F;
            float var62 = this.NvnnUUuVvNU + var60 * (var16 + var17);
            if (!var36.UvNNVUVNVuvV) {
               var36.VVuuUN.UuUVuuUu(var62);
               var36.UvNNVUVNVuvV = true;
            }

            boolean var41 = var35 == this.VNvuVnvnun;
            float var42 = var41
               ? uUnuvNvvNU(this.uNVvVvUuuuU - this.vVnuVVvVNuNu, this.NvnnUUuVvNU, this.NvnnUUuVvNU + var25 - var16)
               : var36.VVuuUN.UuUVuuUu(var62, var5);
            if (var41) {
               var36.VVuuUN.UuUVuuUu(var42);
               var36.nNuVunNUVu = true;
            }

            var36.UNnVVNvvnVvU = this.unnnNUNnVu;
            var36.uNnUnnuNUnNu = var42;
            var36.UnUNuUU = var15;
            var36.uUVuVvuNUvnu = var16;
            var36.c0oOOCcCoC0 = var17;
            var36.UvUvUNuvNU = var16 * 0.295F;
            var36.nNnVnUNVV = 46.0F * var8;
            var36.NNUUNUuVNNVn = var35 == this.UvUNuNvvNVNv;
            var36.VvVvnNUnvuvV = this.UuUVuuUu(var36, var53);
            var36.UNvvunVVn = var36.UuUVuuUu.equals(this.occOCoc0OcO);
            var36.UnvuVuVnNuvu = var41;
            this.UuUVuuUu(var36, var8);
            if (!var36.nNuVunNUVu && !var36.ccOO0COcoco0) {
               var36.VVnVNnunVvu = 0.0F;
               var36.unNNVVNnvvV = var36.NNUUNUuVNNVn ? 0.42F : 0.0F;
               var36.NuunnvnN = 0.0F;
               var36.nVVUuvuNnUN = 0.0F;
               var36.NnUuNNU = var36.UNnVVNvvnVvU;
               var36.nNvNUVU = var36.uNnUnnuNUnNu;
               var36.UUVNuUNUvUnV = 1.0F;

               for (int var43 = 0; var43 < 3; var43++) {
                  var36.UuuNnUvUuv[var43] = 0.0F;
               }
            } else {
               this.UuUVuuUu(var36, var5, var8, var6);
            }

            float var66 = (Math.min(var36.uNnUnnuNUnNu + var16, this.NvnnUUuVvNU + var25) - Math.max(var36.uNnUnnuNUnNu, this.NvnnUUuVvNU))
               / Math.max(var16, 1.0F);
            float var44 = var41 ? 1.0F : VVuuUN(uUnuvNvvNU((var66 - 0.34F) / 0.58F, 0.0F, 1.0F));
            var36.UUuUnNVNuuv = var44;
            float var45 = var36.uVunuUNVVUUV < 0.0F ? 1.0F : uUnuvNvvNU((this.uNUnUuUnvnnU - var36.uVunuUNVVUUV) / 0.1F, 0.0F, 1.0F);
            float var46 = var36.vNUvnnVnUvu.UuUVuuUu(var45, var5);
            float var47 = var36.ccOO0COcoco0 ? VVuuUN(uUnuvNvvNU(1.0F - (this.uNUnUuUnvnnU - var36.uUVVvVVNvvn) / 0.42F, 0.0F, 1.0F)) : 1.0F;
            var36.nuunNvv = !var36.nNuVunNUVu && !var36.ccOO0COcoco0 ? 0.0F : uUnuvNvvNU(var46, 0.0F, 1.15F) * var44 * var47;
            if (var36.NnunUUnU) {
               var36.UuNnnVnuNNV += var5 / 0.52F;
               if (var36.UuNnnVnuNNV >= 1.0F) {
                  var36.UuNnnVnuNNV = 1.0F;
                  var36.NnunUUnU = false;
               }
            }
         }
      }

      this.nUNnuUNnV = this.NvnnUUuVvNU + var25 + 22.0F * var8;
      this.VuNVnvNNuNnn = this.nUNnuUNnV + var18 + 8.0F * var8;
      this.uuuVnuvnnNnU.UuUVuuUu = this.NVNnnvnuunNv() ? "Save" : "Add";
      this.VnVuuvVvnNv.UuUVuuUu = this.NVNnnvnuunNv() ? "Cancel" : "Edit";
      this.vuvvuVuVv.UuUVuuUu = this.occOCoc0OcO != null ? "Confirm" : "Delete";
      float var56 = UuUVuuUu(23.0F, var8);
      float var57 = UuUVuuUu(24.0F, var8);
      float var58 = 18.0F * var8;
      float var59 = 8.0F * var8;
      float var61 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "Delete", var56).UuUVuuUu + var58 * 2.0F;
      float var63 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, "Confirm", var56).UuUVuuUu + var58 * 2.0F;
      float var64 = Math.max(62.0F * var8, Math.max(var61, var63));
      float var65 = 20.0F * var8;
      float var67 = var15 - var65 - var64;
      float var69 = (var67 - var59 * 2.0F) / 3.0F;
      if (var69 < 62.0F * var8) {
         var67 = var15 - var59 - var64;
         var69 = (var67 - var59 * 2.0F) / 3.0F;
      }

      var69 = Math.max(var69, 22.0F * var8);
      float var71 = Math.max(104.0F * var8, UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, "Login", var57).UuUVuuUu + var58 * 2.4F);
      var71 = Math.min(var71, var15 * 0.42F);
      float var73 = var15 - var59 - var71;
      this.UuUVuuUu(
         this.NnUVNnuvUv,
         this.unnnNUNnVu,
         this.nUNnuUNnV,
         var73,
         var18,
         var19,
         var5,
         var8,
         1.0F,
         VVuuUN(uUnuvNvvNU((this.uNUnUuUnvnnU - 0.24F) / 0.74F, 0.0F, 1.0F))
      );
      this.NnUVNnuvUv.uUVuVvuNUvnu = this.NnUVNnuvUv.uUVuVvuNUvnu
         + ((this.NnUVNnuvUv.nNvNUVU ? 1.0F : 0.0F) - this.NnUVNnuvUv.uUVuVvuNUvnu) * (1.0F - (float)Math.pow(1.0E-4F, var5));
      this.NnUVNnuvUv.VVnVNnunVvu = this.NnUVNnuvUv
         .UNnVVNvvnVvU
         .UuUVuuUu(!this.NnUVNnuvUv.nNvNUVU && this.NnUVNnuvUv.uNnUnnuNUnNu.isBlank() ? 0.0F : 1.0F, var5);
      this.VvuUUUNNNv.uNnUnnuNUnNu = this.C00OOC00oO(NuvVVvUU.VvunVVUvUNnv.USE);
      this.UuUVuuUu(
         this.VvuUUUNNNv,
         this.unnnNUNnVu + var73 + var59,
         this.nUNnuUNnV,
         var71,
         var18,
         var19,
         var5,
         var8,
         this.VvuUUUNNNv.uNnUnnuNUnNu ? 1.0F : 0.3F,
         VVuuUN(uUnuvNvvNU((this.uNUnUuUnvnnU - 0.3F) / 0.74F, 0.0F, 1.0F))
      );
      float var74 = this.uVvunVUNuUvu.UuUVuuUu(this.occOCoc0OcO != null ? 1.0F : 0.0F, var5);
      float var48 = Math.min(var64, var61 + (var63 - var61) * var74);
      NuvVVvUU.uunvUUVnuNn[] var49 = new NuvVVvUU.uunvUUVnuNn[]{this.uuuVnuvnnNnU, this.nNunUnVN, this.VnVuuvVvnNv};

      for (int var50 = 0; var50 < var49.length; var50++) {
         NuvVVvUU.uunvUUVnuNn var51 = var49[var50];
         var51.uNnUnnuNUnNu = this.C00OOC00oO(var51.uVunuUNVVUUV);
         this.UuUVuuUu(
            var51,
            this.unnnNUNnVu + var50 * (var69 + var59),
            this.VuNVnvNNuNnn,
            var69,
            var18,
            var19,
            var5,
            var8,
            var51.uNnUnnuNUnNu ? 1.0F : 0.3F,
            VVuuUN(uUnuvNvvNU((this.uNUnUuUnvnnU - 0.36F - var50 * 0.042F) / 0.74F, 0.0F, 1.0F))
         );
      }

      this.vuvvuVuVv.uNnUnnuNUnNu = this.C00OOC00oO(NuvVVvUU.VvunVVUvUNnv.DELETE);
      this.UuUVuuUu(
         this.vuvvuVuVv,
         this.unnnNUNnVu + var15 - var48,
         this.VuNVnvNNuNnn,
         var48,
         var18,
         var19,
         var5,
         var8,
         this.vuvvuVuVv.uNnUnnuNUnNu ? 1.0F : 0.3F,
         VVuuUN(uUnuvNvvNU((this.uNUnUuUnvnnU - 0.48F) / 0.74F, 0.0F, 1.0F))
      );
      this.vuvvuVuVv.NnUuNNU = var74;
      this.nVuuUnnUUVU = 50.0F * var8;
      this.uvVuuuvvVU = this.unnnNUNnVu + var15 * 0.5F;
      this.NNnvvunuVNUn = this.NvnnUUuVvNU + 76.0F * var8;
      float var75 = 184.0F * var8;
      this.UuUVuuUu(
         this.uunNUuunVU,
         this.unnnNUNnVu + var15 * 0.5F - var75 * 0.5F,
         this.NvnnUUuVvNU + 198.0F * var8,
         var75,
         var18,
         var19,
         var5,
         var8,
         1.0F,
         this.vUNuuvvnVnv.UuUVuuUu()
      );
   }

   private void UuUVuuUu(NuvVVvUU.NVnVnNnN var1, float var2) {
      float var3 = 14.0F * var2;
      var1.uUVvnUuNvvN = var2;
      var1.NVuunNnvvvVu = nuUnNvnuUu(Math.min(var1.uUVuVvuNUvnu * 0.7F, 40.0F * var2));
      var1.NVuNUuVnVUN = var1.UNnVVNvvnVvU + var3;
      var1.vNnNuuvVn = var1.NVuNUuVnVUN + var1.NVuunNnvvvVu + 12.0F * var2;
      var1.VuunNUUUvu = 96.0F * var2;
      var1.vVVuuVVv = var1.UNnVVNvvnVvU + var1.UnUNuUU - var3 - var1.VuunNUUUvu;
      var1.VUuuVUnun = Math.max(36.0F * var2, var1.vVVuuVVv - var1.vNnNuuvVn - 8.0F * var2);
   }

   private int UuUVuuUu(NuvVVvUU.NVnVnNnN var1, float var2, float var3) {
      if (!(var1.VVnVNnunVvu <= 0.04F) && !var1.ccOO0COcoco0) {
         float var4 = 28.0F * var1.uUVvnUuNvvN;
         float var5 = 6.0F * var1.uUVvnUuNvvN;
         float var6 = var1.uNnUnnuNUnNu + var1.uUVuVvuNUvnu * 0.5F - var4 * 0.5F;
         if (!(var3 < var6) && !(var3 > var6 + var4)) {
            for (int var7 = 0; var7 < 3; var7++) {
               float var8 = var1.vVVuuVVv + var7 * (var4 + var5);
               if (var2 >= var8 && var2 <= var8 + var4) {
                  return var7;
               }
            }

            return -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   private void UuUVuuUu(NuvVVvUU.nUNvUnnVN var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      var1.C00OOC00oO = var2;
      var1.uUnuvNvvNU = var3;
      var1.nuUnNvnuUu = var4;
      var1.VVuuUN = var5;
      var1.vNUvnnVnUvu = var6;
      var1.uVUVnuvnuVuv = 46.0F * var8;
      var1.NVNnnvnuunNv = var10;
      this.UuUVuuUu(var1, var7, var8, var9);
   }

   private void UuUVuuUu(NuvVVvUU.nUNvUnnVN var1, float var2, float var3, float var4) {
      float var5 = UuUVuuUu(this.OoccOc0CO, this.UvuVvvVuUuuu, var1.C00OOC00oO, var1.uUnuvNvvNU, var1.nuUnNvnuUu, var1.VVuuUN, var1.vNUvnnVnUvu);
      float var6 = 1.0F - VVuuUN(uUnuvNvvNU(Math.max(0.0F, var5) / Math.max(1.0F, 40.0F * var3), 0.0F, 1.0F));
      boolean var7 = var5 <= 0.0F;
      var1.uVUuuVnNVU = var1.uVUuuVnNVU + ((var7 ? 1.0F : 0.0F) * var4 - var1.uVUuuVnNVU) * (1.0F - (float)Math.pow(1.0E-4F, var2));
      var1.vuuuNvNuv = var1.vuuuNvNuv + (var6 * var4 - var1.vuuuNvNuv) * (1.0F - (float)Math.pow(1.5E-4F, var2));
      var1.nvUVNnuu = var1.nvUVNnuu + (0.0F - var1.nvUVNnuu) * (1.0F - (float)Math.pow(1.8E-5F, var2));
      var1.UuuNnUvUuv = var1.UuuNnUvUuv + (0.0F - var1.UuuNnUvUuv) * (1.0F - (float)Math.pow(6.0E-6F, var2));
      float var8 = uUnuvNvvNU((this.UNNunNuUNVuU - var1.C00OOC00oO) / Math.max(1.0F, var1.nuUnNvnuUu), 0.0F, 1.0F);
      float var9 = uUnuvNvvNU((this.NuUuUvUUvU - var1.uUnuvNvvNU) / Math.max(1.0F, var1.VVuuUN), 0.0F, 1.0F);
      float var10 = 1.0F - (float)Math.pow(1.8E-4F, var2);
      var1.UnUNVVVNuv = var1.UnUNVVVNuv + (var8 - var1.UnUNVVVNuv) * var10;
      var1.vNVuvnUUnuUn = var1.vNVuvnUUnuUn + (var9 - var1.vNVuvnUUnuUn) * var10;
      var1.nUUVuvU = 1.0F;
      var1.vVvUvVVuuNvV = var1.C00OOC00oO + (var1.UnUNVVVNuv - 0.5F) * 4.5F * var3 * var1.vuuuNvNuv;
      var1.uNNnnnuuuN = var1.uUnuvNvvNU
         + (var1.vNVuvnUUnuUn - 0.5F) * 3.0F * var3 * var1.vuuuNvNuv
         - var1.uVUuuVnNVU * 1.4F * var3
         + var1.nvUVNnuu * 1.8F * var3;
      var1.UvnvNVnnnnNU = uUnuvNvvNU(uUnuvNvvNU(this.VUVvNvvVUN, this.UvvNuvUNNNUv) * 0.42F * var1.vuuuNvNuv, 0.0F, 1.0F);
   }

   private void UuUVuuUu(NuvVVvUU.NVnVnNnN var1, float var2, float var3, long var4) {
      float var6 = UuUVuuUu(this.OoccOc0CO, this.UvuVvvVuUuuu, var1.UNnVVNvvnVvU, var1.uNnUnnuNUnNu, var1.UnUNuUU, var1.uUVuVvuNUvnu, var1.UvUvUNuvNU);
      float var7 = 1.0F - VVuuUN(uUnuvNvvNU(Math.max(0.0F, var6) / Math.max(1.0F, 44.0F * var3), 0.0F, 1.0F));
      boolean var8 = var6 <= 0.0F && !var1.ccOO0COcoco0 && var1.nNuVunNUVu || var1.UnvuVuVnNuvu;
      float var9 = var1.NNUUNUuVNNVn ? 0.28F : 0.0F;
      var1.VVnVNnunVvu = var1.VVnVNnunVvu + ((var8 ? 1.0F : 0.0F) - var1.VVnVNnunVvu) * (1.0F - (float)Math.pow(1.0E-4F, var2));
      var1.unNNVVNnvvV = var1.unNNVVNnvvV + ((var1.nNuVunNUVu ? Math.max(var7, var9) : 0.0F) - var1.unNNVVNnvvV) * (1.0F - (float)Math.pow(1.5E-4F, var2));
      var1.NuunnvnN = var1.NuunnvnN + (0.0F - var1.NuunnvnN) * (1.0F - (float)Math.pow(1.8E-5F, var2));
      var1.NVUunUNUN = var1.NVUunUNUN + (0.0F - var1.NVUunUNUN) * (1.0F - (float)Math.pow(6.0E-6F, var2));
      var1.vvUVNVvvNUv = var1.vvUVNVvvNUv + ((var1.UnvuVuVnNuvu ? 1.0F : 0.0F) - var1.vvUVNVvvNUv) * (1.0F - (float)Math.pow(4.0E-5F, var2));
      var1.uUVvnUuNvvN = var3;
      int var10 = this.UuUVuuUu(var1, this.OoccOc0CO, this.UvuVvvVuUuuu);

      for (int var11 = 0; var11 < 3; var11++) {
         float var12 = var10 == var11 ? 1.0F : 0.0F;
         var1.UuuNnUvUuv[var11] = var1.UuuNnUvUuv[var11] + (var12 - var1.UuuNnUvUuv[var11]) * (1.0F - (float)Math.pow(4.0E-5F, var2));
         var1.nUUVuvU[var11] = var1.nUUVuvU[var11] + (0.0F - var1.nUUVuvU[var11]) * (1.0F - (float)Math.pow(1.8E-5F, var2));
      }

      this.UuUVuuUu(var1, var4);
      this.C00OOC00oO(var1, var4);
      float var15 = uUnuvNvvNU((this.UNNunNuUNVuU - var1.UNnVVNvvnVvU) / Math.max(1.0F, var1.UnUNuUU), 0.0F, 1.0F);
      float var16 = uUnuvNvvNU((this.NuUuUvUUvU - var1.uNnUnnuNUnNu) / Math.max(1.0F, var1.uUVuVvuNUvnu), 0.0F, 1.0F);
      float var13 = 1.0F - (float)Math.pow(1.8E-4F, var2);
      var1.vuvnUnVnUNnV = var1.vuvnUnVnUNnV + (var15 - var1.vuvnUnVnUNnV) * var13;
      var1.nnuUVNUuvvVU = var1.nnuUVNUuvvVU + (var16 - var1.nnuUVNUuvvVU) * var13;
      var1.UUVNuUNUvUnV = 1.0F;
      float var14 = (1.0F - uUnuvNvvNU(var1.vNUvnnVnUvu.UuUVuuUu(), 0.0F, 1.0F)) * 22.0F * var3;
      var1.NnUuNNU = var1.UNnVVNvvnVvU + (var1.vuvnUnVnUNnV - 0.5F) * 5.0F * var3 * var1.unNNVVNnvvV;
      var1.nNvNUVU = var1.uNnUnnuNUnNu
         + (var1.nnuUVNUuvvVU - 0.5F) * 3.5F * var3 * var1.unNNVVNnvvV
         - var1.VVnVNnunVvu * 1.6F * var3
         - var1.vvUVNVvvNUv * 5.0F * var3
         + var1.NuunnvnN * 2.0F * var3
         + var14;
      var1.nVVUuvuNnUN = uUnuvNvvNU(uUnuvNvvNU(this.VUVvNvvVUN, this.UvvNuvUNNNUv) * 0.42F * var1.unNNVVNnvvV, 0.0F, 1.0F);
   }

   private boolean NVUunUNUN() {
      float var1 = 12.0F * C00OOC00oO(this.vunuUUVVUv, this.uuuNUnuvvNNv) + this.OCCc0co0OOC + 10.0F;
      return this.OoccOc0CO >= this.unnnNUNnVu - var1
         && this.OoccOc0CO <= this.unnnNUNnVu + this.vVvuUVnV + var1
         && this.UvuVvvVuUuuu >= this.NvnnUUuVvNU
         && this.UvuVvvVuUuuu <= this.NvnnUUuVvNU + this.nvuUVvuuN;
   }

   private void UuUVuuUu(int var1, int var2, int var3, float var4, float var5, long var6) {
      float var8 = Math.max(0.0F, (float)(var6 - this.vUvVUNnN) / 1.0E9F);
      float var9 = uUnuvNvvNU(uUnuvNvvNU(this.VUVvNvvVUN, this.UvvNuvUNNNUv), 0.0F, 3.0F);
      float var10 = Math.max((float)Math.exp(-var8 * 1.25F), uUnuvNvvNU(var9 * 0.22F, 0.0F, 1.0F));
      float var11 = VVuuUN(uUnuvNvvNU(this.uNUnUuUnvnnU / 0.86F, 0.0F, 1.0F));
      float var12 = C00OOC00oO(var1, var2);
      int var13 = 0;

      for (NuvVVvUU.NVnVnNnN var15 : this.VNNnnVUuvv) {
         if (!var15.NUVvUUVuVNVv && var15.nNuVunNUVu && !(var15.nuunNvv <= 0.001F)) {
            VvVVnnNNNuV.nvnNNunvv var16 = this.VvVuvUvvNNVv.UuUVuuUu(var13++);
            float var17 = Math.max(var15.unNNVVNnvvV, var15.UnvuVuVnNuvu ? 0.85F : 0.0F);
            var16.UuUVuuUu(
               var15.C00OOC00oO,
               var15.NnUuNNU,
               var15.nNvNUVU,
               var15.UnUNuUU,
               var15.uUVuVvuNUvnu,
               var15.UvUvUNuvNU,
               var15.VVnVNnunVvu,
               var17,
               var15.NuunnvnN,
               uUnuvNvvNU(var15.nuunNvv, 0.0F, 1.0F),
               var15.NVUunUNUN,
               var15.nNnVnUNVV,
               var15.UUVNuUNUvUnV,
               var15.vuvnUnVnUNnV,
               var15.nnuUVNUuvvVU,
               var15.nVVUuvuNnUN
            );
            var16.C00OOC00oO(this.nuUnNvnuUu(var15));
            if (var15.NnunUUnU) {
               var16.UuUVuuUu(VVuuUN(var15.UuNnnVnuNNV));
            }
         }
      }

      this.UuUVuuUu(
         var13++,
         this.NnUVNnuvUv,
         this.NnUVNnuvUv.NVNnnvnuunNv,
         Math.max(this.NnUVNnuvUv.vuuuNvNuv, this.NnUVNnuvUv.uUVuVvuNUvnu * 0.72F),
         this.NnUVNnuvUv.uUVuVvuNUvnu * 0.72F
      );
      this.UuUVuuUu(
         var13++,
         this.VvuUUUNNNv,
         this.VvuUUUNNNv.uNnUnnuNUnNu ? this.VvuUUUNNNv.NVNnnvnuunNv : this.VvuUUUNNNv.NVNnnvnuunNv * 0.55F,
         this.VvuUUUNNNv.vuuuNvNuv,
         this.VvuUUUNNNv.uNnUnnuNUnNu ? 0.8F : 0.0F
      );

      for (NuvVVvUU.uunvUUVnuNn var22 : List.of(this.uuuVnuvnnNnU, this.nNunUnVN, this.VnVuuvVvnNv, this.vuvvuVuVv)) {
         float var24 = var22 == this.vuvvuVuVv ? this.vuvvuVuVv.NnUuNNU : 0.0F;
         this.UuUVuuUu(var13++, var22, var22.uNnUnnuNUnNu ? var22.NVNnnvnuunNv : var22.NVNnnvnuunNv * 0.55F, var22.vuuuNvNuv, var24 * 0.86F);
      }

      if (this.uunNUuunVU.NVNnnvnuunNv > 0.002F) {
         this.UuUVuuUu(var13++, this.uunNUuunVU, this.uunNUuunVU.NVNnnvnuunNv, this.uunNUuunVU.vuuuNvNuv, 0.8F);
      }

      this.VvVuvUvvNNVv.uVUuuVnNVU(var13);
      this.VvVuvUvvNNVv.uNNnnnuuuN(0);
      float var21 = this.vUNuuvvnVnv.UuUVuuUu();
      if (var21 > 0.004F) {
         this.VvVuvUvvNNVv.uNNnnnuuuN().UuUVuuUu(this.uvVuuuvvVU, this.NNnvvunuVNUn, this.nVuuUnnUUVU, this.nVuuUnnUUVU * 2.1F, var21, var21, 3.17F);
         this.VvVuvUvvNNVv.uNNnnnuuuN().UuUVuuUu(this.UNNunNuUNVuU, this.NuUuUvUUvU);
      } else {
         this.VvVuvUvvNNVv.uNNnnnuuuN().UuUVuuUu(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      }

      for (int var23 = 0; var23 < 14; var23++) {
         NuvVVvUU.vUvuUvvVvvnN var25 = this.NNVNuUvVn[var23];
         float var26 = Math.max(0.0F, this.uNUnUuUnvnnU - var25.uUnuvNvvNU);
         this.VvVuvUvvNNVv
            .vuuuNvNuv(var23)
            .UuUVuuUu(
               var25.UuUVuuUu / Math.max(1.0F, (float)var1), var25.C00OOC00oO / Math.max(1.0F, (float)var2), var26, var26 > 3.1F ? 0.0F : var25.vVvUvVVuuNvV
            );
      }

      this.VvVuvUvvNNVv.vNUvnnVnUvu().UuUVuuUu(0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      this.VvVuvUvvNNVv.UuUVuuUu(var1, var2, var3, this.uNUnUuUnvnnU * 0.46F, this.uNUnUuUnvnnU * 0.46F);
      this.VvVuvUvvNNVv.UuUVuuUu(this.UNNunNuUNVuU, this.NuUuUvUUvU, this.VUVvNvvVUN * 0.42F, this.UvvNuvUNNNUv * 0.42F, var9 * 0.42F, 0.0F);
      this.VvVuvUvvNNVv.UuUVuuUu(this.unUVnu, this.NvNUuuuvUvu);
      this.VvVuvUvvNNVv.C00OOC00oO(-var4 * 6.5E-4F, -var5 * 5.0E-4F, var4 * 0.75F * var12, var5 * 0.62F * var12, var4 * 1.2F * var12, var5 * 1.0F * var12);
      this.VvVuvUvvNNVv.uUnuvNvvNU(var10 * 0.55F, var10 > 0.1F ? 0.82F : 0.72F, 0.0F, 0.0F, 0.58F + var11 * 0.18F, 0.0F);
      this.VvVuvUvvNNVv
         .UuUVuuUu(
            this.nNVVUnuVVVuV == NvVNvUvunNNu.SAKURA_BREEZE,
            this.nNVVUnuVVVuV == NvVNvUvunNNu.VERNAL_SOLSTICE,
            this.nNVVUnuVVVuV == NvVNvUvunNNu.MIDNIGHT_AZURE,
            this.vnVuunuNN
         );
   }

   private void UuUVuuUu(int var1, NuvVVvUU.nUNvUnnVN var2, float var3, float var4, float var5) {
      VvVVnnNNNuV.nvnNNunvv var6 = this.VvVuvUvvNNVv.UuUVuuUu(var1);
      var6.UuUVuuUu(
         var2.UuUVuuUu,
         var2.vVvUvVVuuNvV,
         var2.uNNnnnuuuN,
         var2.nuUnNvnuUu,
         var2.VVuuUN,
         var2.vNUvnnVnUvu,
         var2.uVUuuVnNVU,
         var4,
         var2.nvUVNnuu,
         var3,
         var2.UuuNnUvUuv,
         var2.uVUVnuvnuVuv,
         var2.nUUVuvU,
         var2.UnUNVVVNuv,
         var2.vNVuvnUUnuUn,
         var2.UvnvNVnnnnNU
      );
      var6.C00OOC00oO(uUnuvNvvNU(var5, 0.0F, 1.0F) * uUnuvNvvNU(var3, 0.0F, 1.0F));
   }

   private float nuUnNvnuUu(NuvVVvUU.NVnVnNnN var1) {
      float var2 = var1.VvVvnNUnvuvV ? 0.92F : (var1.NNUUNUuVNNVn ? 0.4F : 0.0F);
      return uUnuvNvvNU(var2 * uUnuvNvvNU(var1.nuunNvv, 0.0F, 1.0F) * var1.UUuUnNVNuuv, 0.0F, 1.0F);
   }

   private void UuUVuuUu(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      try {
         ru.metaculture.protection.NVnVnNnN.uVUuuVnNVU();
         UnVNvNnU var2 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu();
         if (var2 == null) {
            return;
         }

         VvuuVNVUn.NVnVnNnN var3 = VvuuVNVUn.UuUVuuUu();
         boolean var4 = false;

         try {
            var2.UuUVuuUu(var1.vuuuNvNuv(), var1.nvUVNnuu());
            var4 = true;
            float var5 = C00OOC00oO(var1.vuuuNvNuv(), var1.nvUVNnuu());
            long var6 = System.nanoTime();
            float var8 = VVuuUN(uUnuvNvvNU(this.uNUnUuUnvnnU / 0.82F, 0.0F, 1.0F));
            this.UuUVuuUu(var2, var1, var5, var8, var6);
            this.UuUVuuUu(var2, var5);

            for (NuvVVvUU.NVnVnNnN var10 : this.VNNnnVUuvv) {
               if (!var10.NUVvUUVuVNVv && var10.nNuVunNUVu && !(var10.nuunNvv <= 0.002F)) {
                  this.UuUVuuUu(var2, var10, var5);
               }
            }

            var2.uUnuvNvvNU();
            var2.UuUVuuUu(
               this.unnnNUNnVu - 46.0F * var5,
               this.NvnnUUuVvNU - 10.0F * var5,
               this.vVvuUVnV + 92.0F * var5,
               this.nvuUVvuuN + 20.0F * var5,
               0.0F,
               0.0F,
               0.0F,
               0.0F
            );
            NuvVVvUU.NVnVnNnN var21 = null;

            for (int var22 = 0; var22 < this.VNNnnVUuvv.size(); var22++) {
               NuvVVvUU.NVnVnNnN var11 = this.VNNnnVUuvv.get(var22);
               if (!var11.NUVvUUVuVNVv && var11.nNuVunNUVu && !(var11.nuunNvv <= 0.002F)) {
                  if (var11.UnvuVuVnNuvu) {
                     var21 = var11;
                  } else {
                     this.UuUVuuUu(var2, var11, var5, var6);
                  }
               }
            }

            if (var21 != null) {
               this.UuUVuuUu(var2, var21, var5, var6);
            }

            var2.uUnuvNvvNU();
            var2.nuUnNvnuUu();
            this.C00OOC00oO(var2, var8);
            this.uUnuvNvvNU(var2, var5);
            this.UuUVuuUu(var2, this.NnUVNnuvUv, var5);
            this.UuUVuuUu(var2, this.VvuUUUNNNv, var5);
            this.C00OOC00oO(var2, this.uuuVnuvnnNnU, var5);
            this.C00OOC00oO(var2, this.nNunUnVN, var5);
            this.C00OOC00oO(var2, this.VnVuuvVvnNv, var5);
            this.UuUVuuUu(var2, this.vuvvuVuVv, var5, var6);
         } finally {
            if (var4) {
               try {
                  var2.C00OOC00oO();
               } catch (Throwable var18) {
               }
            }

            VvuuVNVUn.uUnuvNvvNU(var3);
         }
      } catch (Throwable var20) {
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, VvVVnnNNNuV.VUuUUNnnuvuv var2, float var3, float var4, long var5) {
      float var7 = var2.vuuuNvNuv() * 0.5F + var2.vuvnUnVnUNnV() * 0.1F;
      var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var7, uNNnnnuuuN(this.VnnnvUunNvuu), 44.0F * var3, "Alt Manager", this.C00OOC00oO(0.95F * var4), "c");
      boolean var8 = this.vnuNNVvVVuN > var5 && !this.UVUnUvUNU.isEmpty();
      float var9 = var8 ? uUnuvNvvNU((float)(this.vnuNNVvVVuN - var5) / 3.2E8F, 0.0F, 1.0F) : 0.0F;
      float var10 = (1.0F - var9) * var4;
      float var11 = uNNnnnuuuN(this.VuuUVVu);
      float var12 = UuUVuuUu(21.0F, var3);
      if (var10 > 0.004F) {
         String var13 = "Active identity";
         String var14 = this.vuvnUnVnUNnV();
         String var15 = "  ·  ";
         nUVnuvUu var16 = vNvnnVvvVUu.UuUVuuUu;
         nUVnuvUu var17 = vNvnnVvvVUu.vVvUvVVuuNvV;
         float var18 = UnVNvNnU.UuUVuuUu(var16, var13, var12).UuUVuuUu;
         float var19 = UnVNvNnU.UuUVuuUu(var16, var15, var12).UuUVuuUu;
         float var20 = UnVNvNnU.UuUVuuUu(var17, var14, var12).UuUVuuUu;
         float var21 = var7 - (var18 + var19 + var20) * 0.5F;
         var1.UuUVuuUu(var16, uNNnnnuuuN(var21), var11, var12, var13, this.uUnuvNvvNU(0.54F * var10));
         var21 += var18;
         var1.UuUVuuUu(var16, uNNnnnuuuN(var21), var11, var12, var15, this.uUnuvNvvNU(0.3F * var10));
         var21 += var19;
         var1.UuUVuuUu(var17, uNNnnnuuuN(var21), var11, var12, var14, UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.42F, 0.92F * var10));
      }

      if (var9 > 0.004F) {
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var7, var11, var12, this.UVUnUvUNU, this.C00OOC00oO(0.74F * var9 * var4), "c");
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, NuvVVvUU.NVnVnNnN var2, float var3) {
      float var4 = uUnuvNvvNU(var2.nuunNvv, 0.0F, 1.0F) * VVuuUN(uUnuvNvvNU((var2.UUuUnNVNuuv - 0.9F) / 0.1F, 0.0F, 1.0F));
      if (!(var4 <= 0.02F)) {
         float var5 = var2.VvVvnNUnvuvV ? 1.0F : (var2.NNUUNUuVNNVn ? 0.3F : 0.0F);
         if (var2.UNvvunVVn) {
            var5 = 1.0F;
         }

         if (!(var5 <= 0.01F)) {
            float var6 = 13.0F * var3;
            float var7 = 1.5F * var3;
            int var8 = var2.UNvvunVVn ? this.vVvUvVVuuNvV(0.24F * var5 * var4) : UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.5F, 0.15F * var5 * var4);
            var1.UuUVuuUu(var2.NnUuNNU, var2.nNvNUVU, var2.UnUNuUU, var2.uUVuVvuNUvnu, var2.UvUvUNuvNU, var6, var7, var8);
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, NuvVVvUU.NVnVnNnN var2, float var3, long var4) {
      float var6 = uUnuvNvvNU(var2.nuunNvv, 0.0F, 1.0F);
      if (!(var6 <= 0.004F)) {
         float var7 = var2.NnUuNNU - var2.UNnVVNvvnVvU;
         float var8 = var2.nNvNUVU - var2.uNnUnnuNUnNu;
         float var9 = var2.uNnUnnuNUnNu + var2.uUVuVvuNUvnu * 0.5F + var8;
         float var10 = uNNnnnuuuN(var2.NVuunNnvvvVu);
         float var11 = uNNnnnuuuN(var2.NVuNUuVnVUN + var7);
         float var12 = uNNnnnuuuN(var9 - var2.NVuunNnvvvVu * 0.5F);
         this.C00OOC00oO(var1, var2, var11, var12, var10, var6, var3);
         float var13 = UuUVuuUu(27.0F, var3);
         float var14 = UuUVuuUu(17.0F, var3);
         float var15 = UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var13);
         float var16 = UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var14);
         float var17 = 5.0F * var3;
         float var18 = var9 - (var15 + var17 + var16 + var14 * 0.105F) * 0.5F;
         float var19 = uNNnnnuuuN(var2.vNnNuuvVn + var7);
         int var20 = var2.VvVvnNUnvuvV
            ? UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.34F, (0.95F + var2.unNNVVNnvvV * 0.05F) * var6)
            : this.C00OOC00oO((var2.NNUUNUuVNNVn ? 0.94F : 0.74F + var2.unNNVVNnvvV * 0.12F) * var6);
         String var21 = UuUVuuUu(var2.C00OOC00oO, var2.VUuuVUnun, var13, vNvnnVvvVUu.vVvUvVVuuNvV);
         var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var19, uNNnnnuuuN(var18 + var15), var13, var21, var20);
         String var22 = var2.uVUuuVnNVU;
         if (var22 != null && !var22.isEmpty()) {
            int var23 = var2.VvVvnNUnvuvV
               ? UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.5F, 0.62F * var6)
               : this.uUnuvNvvNU((var2.NNUUNUuVNNVn ? 0.58F : 0.46F) * var6);
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var19, uNNnnnuuuN(var18 + var15 + var17 + var16), var14, var22, var23);
         }

         float var27 = VVuuUN(uUnuvNvvNU(var2.VVnVNnunVvu * 1.12F, 0.0F, 1.0F));
         if (var27 > 0.01F) {
            float var24 = var9 - 28.0F * var3 * 0.5F;
            this.UuUVuuUu(var1, var2, var2.vVVuuVVv + var7, var24, var3, var6 * var27, var27);
         }

         if (var2.VvVvnNUnvuvV || var2.NNUUNUuVNNVn || var2.UNvvunVVn) {
            float var28 = var2.UNvvunVVn ? 1.0F : (var2.VvVvnNUnvuvV ? 0.46F : 0.16F);
            int var25 = var2.UNvvunVVn
               ? this.vVvUvVVuuNvV(0.72F * var6)
               : (
                  var2.VvVvnNUnvuvV
                     ? UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.42F, var28 * var6)
                     : (this.vnVuunuNN ? UuUVuuUu(0.0F, 0.0F, 0.0F, var28 * var6) : UuUVuuUu(1.0F, 1.0F, 1.0F, var28 * var6))
               );
            var1.UuUVuuUu(var2.NnUuNNU, var2.nNvNUVU, var2.UnUNuUU, var2.uUVuVvuNUvnu, var2.UvUvUNuvNU, var25, Math.max(1.25F * var3, 1.0F));
         }

         if (var2.UNvvunVVn) {
            float var29 = this.uUnuvNvvNU(var4);
            float var30 = var2.UvUvUNuvNU;
            float var26 = Math.max(0.0F, var2.UnUNuUU - var30 * 2.0F);
            var1.UuUVuuUu(
               var2.NnUuNNU + var30, var2.nNvNUVU + var2.uUVuVvuNUvnu - 3.2F * var3, var26 * var29, 2.0F * var3, var3, this.vVvUvVVuuNvV(0.85F * var6)
            );
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, NuvVVvUU.NVnVnNnN var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = 28.0F * var5;
      float var9 = 6.0F * var5;

      for (int var10 = 0; var10 < 3; var10++) {
         float var11 = var2.UuuNnUvUuv[var10];
         float var12 = var2.nUUVuvU[var10];
         float var13 = uUnuvNvvNU(var6 * (0.55F + 0.45F * var7), 0.0F, 1.0F);
         boolean var14 = var10 == 2;
         float var15 = (1.0F - var7) * 8.0F * var5;
         float var16 = var3 + var10 * (var8 + var9) + var15;
         float var17 = var4 - var11 * 1.4F * var5 + var12 * 1.2F * var5;
         if (var11 > 0.02F) {
            int var18 = var14 ? this.vVvUvVVuuNvV(0.26F * var11 * var13) : UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.5F, 0.26F * var11 * var13);
            this.UuUVuuUu(var1, var16 + var8 * 0.5F, var17 + var8 * 0.5F, var8 * 0.46F, var5, var18);
         }

         int var19 = var14
            ? this.vVvUvVVuuNvV((0.5F + var11 * 0.44F) * var13)
            : (this.vnVuunuNN ? UuUVuuUu(0.14F, 0.14F, 0.17F, (0.66F + var11 * 0.3F) * var13) : UuUVuuUu(1.0F, 1.0F, 1.0F, (0.7F + var11 * 0.28F) * var13));
         if (!var14 && var11 > 0.02F) {
            var19 = UuUVuuUu(var19, UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.4F, 1.0F), var11 * 0.6F, (0.7F + var11 * 0.28F) * var13);
         }

         this.UuUVuuUu(var1, VVnVNnunVvu[var10], var16 + var8 * 0.5F, var17 + var8 * 0.5F, var8 * 0.62F * unNNVVNnvvV[var10], var19);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, String var2, float var3, float var4, float var5, int var6) {
      var1.UuUVuuUu(vNvnnVvvVUu.uUnuvNvvNU, uNNnnnuuuN(var3), uNNnnnuuuN(var4 + var5 * 0.4922F), var5 * 2.0F, var2, var6, "c");
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, int var6) {
      float var7 = Math.max(1.5F * var5, 1.0F);
      var1.UuUVuuUu(var2 - var7, var3 - var7, var7 * 2.0F, var7 * 2.0F, var7, var4 * 0.26F, var4 * 0.45F, var6);
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2) {
      float var3 = uUnuvNvvNU(this.UuuuNNunN.NVNnnvnuunNv, 0.0F, 1.0F);
      if (!(var3 <= 0.004F)) {
         float var4 = uUnuvNvvNU(this.UuuuNNunN.uVUuuVnNVU, 0.0F, 1.0F);
         float var5 = uUnuvNvvNU(this.UuuuNNunN.nvUVNnuu, 0.0F, 1.0F);
         float var6 = 5.0F * var2;
         float var7 = 8.5F * var2;
         float var8 = this.nUununvNvvn - var4 * 1.6F * var2 + var5 * 0.8F * var2;
         float var9 = this.NuvunVvnnN;
         if (var4 > 0.02F) {
            this.UuUVuuUu(var1, var8, var9, this.UuuuNNunN.nuUnNvnuUu * 0.52F, var2, UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.5F, 0.24F * var4 * var3));
         }

         int var10 = this.vnVuunuNN ? UuUVuuUu(0.12F, 0.12F, 0.15F, (0.56F + var4 * 0.38F) * var3) : UuUVuuUu(1.0F, 1.0F, 1.0F, (0.6F + var4 * 0.36F) * var3);
         if (var4 > 0.02F) {
            var10 = UuUVuuUu(var10, UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.4F, 1.0F), var4 * 0.62F, (0.6F + var4 * 0.36F) * var3);
         }

         float var11 = Math.max(2.0F * var2, 1.4F);
         this.UuUVuuUu(var1, var8 + var6, var9 - var7, var8 - var6, var9, var11, var10);
         this.UuUVuuUu(var1, var8 - var6, var9, var8 + var6, var9 + var7, var11, var10);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void C00OOC00oO(UnVNvNnU var1, NuvVVvUU.NVnVnNnN var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = var5 * 0.295F;
      boolean var9 = nuuvUNvn.C00OOC00oO();
      VvuuVNVUn.NVnVnNnN var10 = null;
      if (var9) {
         var1.uUnuvNvvNU();
         var10 = VvuuVNVUn.UuUVuuUu();
         int var11 = this.field_22787.method_22683().method_4506();
         int var12 = Math.max(0, (int)Math.floor(var3));
         int var13 = Math.max(0, (int)Math.floor(var11 - var4 - var5));
         int var14 = Math.max(1, (int)Math.ceil(var3 + var5) - var12);
         int var15 = Math.max(1, (int)Math.ceil(var5));
         GL11.glEnable(3089);
         GL11.glScissor(var12, var13, var14, var15);
      }

      boolean var18 = false /* VF: Semaphore variable */;

      try {
         var18 = true;
         var1.UuUVuuUu(var3, var4, var5, var5, var8, this.vnVuunuNN ? UuUVuuUu(1.0F, 1.0F, 1.0F, 0.3F * var6) : UuUVuuUu(0.06F, 0.07F, 0.09F, 0.42F * var6));
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6);
         if (!var9) {
            var1.UuUVuuUu(
               var3,
               var4,
               var5,
               var5,
               var8,
               UuUVuuUu(1.0F, 1.0F, 1.0F, 0.055F * var6),
               UuUVuuUu(1.0F, 1.0F, 1.0F, 0.018F * var6),
               UuUVuuUu(0.0F, 0.0F, 0.0F, 0.06F * var6),
               UuUVuuUu(0.0F, 0.0F, 0.0F, 0.03F * var6)
            );
         }

         int var20 = var2.VvVvnNUnvuvV
            ? UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.42F, 0.66F * var6)
            : (
               var2.NNUUNUuVNNVn
                  ? (this.vnVuunuNN ? UuUVuuUu(0.0F, 0.0F, 0.0F, 0.22F * var6) : UuUVuuUu(1.0F, 1.0F, 1.0F, 0.26F * var6))
                  : (this.vnVuunuNN ? UuUVuuUu(0.0F, 0.0F, 0.0F, 0.12F * var6) : UuUVuuUu(1.0F, 1.0F, 1.0F, 0.13F * var6))
            );
         var1.UuUVuuUu(var3, var4, var5, var5, var8, var20, Math.max(1.2F * var7, 1.0F));
         var18 = false;
      } finally {
         if (var18) {
            if (var10 != null) {
               var1.uUnuvNvvNU();
               VvuuVNVUn.uUnuvNvvNU(var10);
            }
         }
      }

      if (var10 != null) {
         var1.uUnuvNvvNU();
         VvuuVNVUn.uUnuvNvvNU(var10);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, NuvVVvUU.NVnVnNnN var2, float var3, float var4, float var5, float var6) {
      float var7 = var5 * 0.295F;

      try {
         class_310 var8 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
         class_2960 var9 = this.UuUVuuUu(var8, var2);
         class_1044 var10 = var8.method_1531().method_4619(var9);
         if (var10 != null && var10.method_68004() instanceof class_10868 var11 && var11.method_68427() > 0) {
            int var14 = var11.method_68427();
            if (var2.uVUVnuvnuVuv != var14) {
               var10.method_4527(false, false);
               GL11.glBindTexture(3553, var14);
               GL11.glTexParameteri(3553, 10241, 9728);
               GL11.glTexParameteri(3553, 10240, 9728);
               var2.uVUVnuvnuVuv = var14;
            }

            var1.uNNnnnuuuN(var6);
            var1.UuUVuuUu(var14, var3, var4, var5, var5, 0.125F, 0.125F, 0.25F, 0.25F, var7);
            var1.UuUVuuUu(var14, var3, var4, var5, var5, 0.625F, 0.125F, 0.75F, 0.25F, var7);
            var1.vuuuNvNuv();
            return;
         }
      } catch (Throwable var13) {
      }

      var1.UuUVuuUu(var3, var4, var5, var5, var7, this.vnVuunuNN ? UuUVuuUu(1.0F, 1.0F, 1.0F, 0.42F * var6) : UuUVuuUu(0.07F, 0.08F, 0.1F, 0.62F * var6));
   }

   private void C00OOC00oO(UnVNvNnU var1, float var2) {
      float var3 = this.NunnVUUuvUV * var2;
      if (this.nVUNnUuU && !(var3 <= 0.01F)) {
         var1.UuUVuuUu(
            this.UvNNNUvNnUUV,
            this.vVuNvnVUvvv,
            this.OCCc0co0OOC,
            this.unUvvVVVVUu,
            this.OCCc0co0OOC * 0.5F,
            this.vnVuunuNN ? UuUVuuUu(0.0F, 0.0F, 0.0F, 0.05F * var3) : UuUVuuUu(1.0F, 1.0F, 1.0F, 0.055F * var3)
         );
         int var4 = UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.5F, (this.vNUUvuuVU ? 0.8F : 0.48F) * var3);
         var1.UuUVuuUu(this.UvNNNUvNnUUV, this.nnUunUnNUN, this.OCCc0co0OOC, this.UNuUVVuUuU, this.OCCc0co0OOC * 0.5F, var4);
      }
   }

   private void uUnuvNvvNU(UnVNvNnU var1, float var2) {
      float var3 = this.vUNuuvvnVnv.UuUVuuUu();
      if (!(var3 <= 0.01F)) {
         float var4 = this.unnnNUNnVu + this.vVvuUVnV * 0.5F;
         var1.UuUVuuUu(
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var4,
            uNNnnnuuuN(this.NvnnUUuVvNU + 158.0F * var2),
            UuUVuuUu(30.0F, var2),
            "No identities yet",
            this.C00OOC00oO(0.84F * var3),
            "c"
         );
         var1.UuUVuuUu(
            vNvnnVvvVUu.UuUVuuUu,
            var4,
            uNNnnnuuuN(this.NvnnUUuVvNU + 184.0F * var2),
            UuUVuuUu(17.0F, var2),
            "Roll a name or type one below",
            this.uUnuvNvvNU(0.54F * var3),
            "c"
         );
         this.UuUVuuUu(var1, this.uunNUuunVU, var2);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, NuvVVvUU.VUUnVnVNNU var2, float var3) {
      float var4 = uUnuvNvvNU(var2.NVNnnvnuunNv, 0.0F, 1.0F);
      if (!(var4 <= 0.004F)) {
         nUVnuvUu var5 = vNvnnVvvVUu.UuUVuuUu;
         String var6 = var2.uVunuUNVVUUV ? "*".repeat(var2.uNnUnnuNUnNu.length()) : var2.uNnUnnuNUnNu;
         float var7 = 15.0F * var3;
         float var8 = var2.vVvUvVVuuNvV + var7;
         float var9 = Math.max(8.0F * var3, var2.nuUnNvnuUu - var7 * 2.0F);
         float var10 = UuUVuuUu(22.0F, var3);
         float var11 = UuUVuuUu(15.0F, var3);
         float var12 = uUnuvNvvNU(var2.uUVuVvuNUvnu, 0.0F, 1.0F);
         float var13 = VVuuUN(uUnuvNvvNU(var2.VVnVNnunVvu, 0.0F, 1.0F));
         if (var12 > 0.02F) {
            var1.UuUVuuUu(
               var2.vVvUvVVuuNvV,
               var2.uNNnnnuuuN,
               var2.nuUnNvnuUu,
               var2.VVuuUN,
               var2.vNUvnnVnUvu,
               15.0F * var3,
               1.0F * var3,
               UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.5F, (this.vnVuunuNN ? 0.09F : 0.17F) * var12 * var4)
            );
         }

         float var14 = UuUVuuUu(var5, var11);
         float var15 = UuUVuuUu(var5, var10);
         float var16 = Math.max(var2.VVuuUN * 0.09F, var11 * 0.3F);
         float var17 = var2.uNNnnnuuuN + (var2.VVuuUN - (var14 + var16 + var15 + var10 * 0.105F)) * 0.5F;
         float var18 = var17 + var14;
         float var19 = var17 + var14 + var16 + var15;
         float var20 = UuUVuuUu(var5, var10, var2.uNNnnnuuuN, var2.VVuuUN);
         float var21 = var20 + (var18 - var20) * var13;
         float var22 = var10 + (var11 - var10) * var13;
         float var23 = VVuuUN(uUnuvNvvNU((var2.VVnVNnunVvu - 0.42F) / 0.58F, 0.0F, 1.0F)) * var4;
         var1.UuUVuuUu(var8 - 5.0F * var3, var2.uNNnnnuuuN, var9 + 5.0F * var3, var2.VVuuUN, 0.0F, 0.0F, 0.0F, 0.0F);
         int var24 = this.vnVuunuNN ? UuUVuuUu(0.3F, 0.31F, 0.34F, 1.0F) : UuUVuuUu(0.78F, 0.84F, 0.89F, 1.0F);
         int var25 = UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.42F, 1.0F);
         float var26 = var4 * (0.44F + 0.14F * var13 + 0.24F * var12);
         var1.UuUVuuUu(
            var5,
            uNNnnnuuuN(var8),
            uNNnnnuuuN(var21),
            var22,
            this.NVNnnvnuunNv() ? "New name" : var2.UuUVuuUu,
            UuUVuuUu(var24, var25, var13 * (0.34F + 0.66F * var12), var26)
         );
         if (var2.nNvNUVU) {
            String var27 = var6.substring(0, UuUVuuUu(var2.NnUuNNU, 0, var6.length()));
            float var28 = UnVNvNnU.UuUVuuUu(var5, var27, var10).UuUVuuUu;
            if (var2.UnUNuUU) {
               var28 = UnVNvNnU.UuUVuuUu(var5, var6, var10).UuUVuuUu;
            }

            float var29 = var2.c0oOOCcCoC0;
            float var30 = var9 - 9.0F * var3;
            if (var28 - var29 > var30) {
               var29 = var28 - var30;
            }

            if (var28 - var29 < 0.0F) {
               var29 = var28;
            }

            var2.c0oOOCcCoC0 = var2.c0oOOCcCoC0 + (Math.max(0.0F, var29) - var2.c0oOOCcCoC0) * 0.3F;
            var2.UvUvUNuvNU = var2.UvUvUNuvNU + (var28 - var2.UvUvUNuvNU) * 0.3F;
         } else if (var6.isBlank()) {
            var2.c0oOOCcCoC0 = 0.0F;
            var2.UvUvUNuvNU = 0.0F;
         }

         if (var23 > 0.004F && !var6.isBlank()) {
            float var32 = var8 - var2.c0oOOCcCoC0;
            float var35 = var19 - var10 * 0.375F;
            float var36 = var10 * 0.505F;
            if (var2.UnUNuUU) {
               float var37 = UnVNvNnU.UuUVuuUu(var5, var6, var10).UuUVuuUu;
               var1.UuUVuuUu(
                  uNNnnnuuuN(var32 - 3.0F * var3),
                  uNNnnnuuuN(var35),
                  var37 + 6.0F * var3,
                  var36,
                  var36 * 0.3F,
                  UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.5F, 0.28F * var23)
               );
            }

            var1.UuUVuuUu(var5, uNNnnnuuuN(var32), uNNnnnuuuN(var19), var10, var6, this.C00OOC00oO((0.82F + var12 * 0.14F) * var23));
            if (var2.nNvNUVU && !var2.UnUNuUU) {
               float var38 = 0.54F + 0.46F * (float)Math.sin(this.uNUnUuUnvnnU * 5.4F);
               var1.UuUVuuUu(
                  uNNnnnuuuN(var8 + var2.UvUvUNuvNU - var2.c0oOOCcCoC0 + 1.5F * var3),
                  uNNnnnuuuN(var35),
                  Math.max(1.4F * var3, 1.0F),
                  var36,
                  Math.max(0.7F * var3, 0.5F),
                  UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, var38, (0.46F + var38 * 0.4F) * var4)
               );
            }
         } else if (var2.nNvNUVU) {
            float var31 = 0.54F + 0.46F * (float)Math.sin(this.uNUnUuUnvnnU * 5.4F);
            float var34 = var19 - var10 * 0.375F;
            var1.UuUVuuUu(
               uNNnnnuuuN(var8 + 1.5F * var3),
               uNNnnnuuuN(var34),
               Math.max(1.4F * var3, 1.0F),
               var10 * 0.505F,
               Math.max(0.7F * var3, 0.5F),
               UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, var31, (0.46F + var31 * 0.4F) * var4 * var13)
            );
         }

         var1.nuUnNvnuUu();
         float var33 = (0.07F + var12 * 0.36F) * var4;
         var1.UuUVuuUu(
            var2.vVvUvVVuuNvV,
            var2.uNNnnnuuuN,
            var2.nuUnNvnuUu,
            var2.VVuuUN,
            var2.vNUvnnVnUvu,
            UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.5F, var33),
            Math.max(1.2F * var3, 1.0F)
         );
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, NuvVVvUU.uunvUUVnuNn var2, float var3) {
      float var4 = uUnuvNvvNU(var2.NVNnnvnuunNv, 0.0F, 1.0F) * (var2.uNnUnnuNUnNu ? 1.0F : 0.42F);
      if (!(var4 <= 0.004F)) {
         float var5 = var2.uNnUnnuNUnNu ? 0.15F + var2.uVUuuVnNVU * 0.13F : 0.05F;
         var1.UuUVuuUu(
            var2.vVvUvVVuuNvV, var2.uNNnnnuuuN, var2.nuUnNvnuUu, var2.VVuuUN, var2.vNUvnnVnUvu, UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.5F, var5 * var4)
         );
         var1.UuUVuuUu(
            var2.vVvUvVVuuNvV,
            var2.uNNnnnuuuN,
            var2.nuUnNvnuUu,
            var2.VVuuUN,
            var2.vNUvnnVnUvu,
            UuUVuuUu(this.NvNUuuuvUvu, this.unUVnu, 0.42F, (0.36F + var2.uVUuuVnNVU * 0.26F) * var4),
            Math.max(1.2F * var3, 1.0F)
         );
         float var6 = UuUVuuUu(24.0F, var3);
         String var7 = UuUVuuUu(var2.UuUVuuUu, var2.nuUnNvnuUu - 18.0F * var3, var6, vNvnnVvvVUu.vVvUvVVuuNvV);
         UuUVuuUu(
            var1,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var2.vVvUvVVuuNvV,
            var2.uNNnnnuuuN,
            var2.nuUnNvnuUu,
            var2.VVuuUN,
            var6,
            var7,
            this.C00OOC00oO((0.94F + var2.uVUuuVnNVU * 0.06F) * var4)
         );
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, NuvVVvUU.uunvUUVnuNn var2, float var3) {
      float var4 = uUnuvNvvNU(var2.NVNnnvnuunNv, 0.0F, 1.0F) * (var2.uNnUnnuNUnNu ? 1.0F : 0.34F);
      if (!(var4 <= 0.004F)) {
         float var5 = UuUVuuUu(23.0F, var3);
         String var6 = UuUVuuUu(var2.UuUVuuUu, var2.nuUnNvnuUu - 18.0F * var3, var5, vNvnnVvvVUu.UuUVuuUu);
         UuUVuuUu(
            var1,
            vNvnnVvvVUu.UuUVuuUu,
            var2.vVvUvVVuuNvV,
            var2.uNNnnnuuuN,
            var2.nuUnNvnuUu,
            var2.VVuuUN,
            var5,
            var6,
            this.C00OOC00oO((0.74F + var2.uVUuuVnNVU * 0.22F) * var4)
         );
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, NuvVVvUU.uunvUUVnuNn var2, float var3, long var4) {
      float var6 = uUnuvNvvNU(var2.NVNnnvnuunNv, 0.0F, 1.0F) * (var2.uNnUnnuNUnNu ? 1.0F : 0.3F);
      if (!(var6 <= 0.004F)) {
         float var7 = uUnuvNvvNU(var2.NnUuNNU, 0.0F, 1.0F);
         if (var7 > 0.01F) {
            var1.UuUVuuUu(
               var2.vVvUvVVuuNvV,
               var2.uNNnnnuuuN,
               var2.nuUnNvnuUu,
               var2.VVuuUN,
               var2.vNUvnnVnUvu,
               12.0F * var3,
               1.0F * var3,
               this.vVvUvVVuuNvV(0.2F * var7 * var6)
            );
            var1.UuUVuuUu(
               var2.vVvUvVVuuNvV,
               var2.uNNnnnuuuN,
               var2.nuUnNvnuUu,
               var2.VVuuUN,
               var2.vNUvnnVnUvu,
               this.vVvUvVVuuNvV((0.11F + var2.uVUuuVnNVU * 0.06F) * var7 * var6)
            );
            var1.UuUVuuUu(
               var2.vVvUvVVuuNvV,
               var2.uNNnnnuuuN,
               var2.nuUnNvnuUu,
               var2.VVuuUN,
               var2.vNUvnnVnUvu,
               this.vVvUvVVuuNvV((0.4F + var2.uVUuuVnNVU * 0.24F) * var7 * var6),
               Math.max(1.2F * var3, 1.0F)
            );
            float var8 = this.uUnuvNvvNU(var4);
            float var9 = var2.vNUvnnVnUvu;
            float var10 = Math.max(0.0F, var2.nuUnNvnuUu - var9 * 2.0F);
            var1.UuUVuuUu(
               var2.vVvUvVVuuNvV + var9, var2.uNNnnnuuuN + var2.VVuuUN - 3.2F * var3, var10 * var8, 2.0F * var3, var3, this.vVvUvVVuuNvV(0.74F * var7 * var6)
            );
         }

         float var13 = UuUVuuUu(23.0F, var3);
         String var14 = UuUVuuUu(var2.UuUVuuUu, var2.nuUnNvnuUu - 18.0F * var3, var13, vNvnnVvvVUu.UuUVuuUu);
         int var15 = this.vnVuunuNN ? UuUVuuUu(0.32F, 0.32F, 0.35F, 1.0F) : UuUVuuUu(1.0F, 1.0F, 1.0F, 1.0F);
         int var11 = this.vVvUvVVuuNvV(1.0F);
         float var12 = ((0.46F + var2.uVUuuVnNVU * 0.26F) * (1.0F - var7) + (0.9F + var2.uVUuuVnNVU * 0.1F) * var7) * var6;
         UuUVuuUu(
            var1,
            var7 > 0.5F ? vNvnnVvvVUu.vVvUvVVuuNvV : vNvnnVvvVUu.UuUVuuUu,
            var2.vVvUvVVuuNvV,
            var2.uNNnnnuuuN,
            var2.nuUnNvnuUu,
            var2.VVuuUN,
            var13,
            var14,
            UuUVuuUu(var15, var11, var7, var12)
         );
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      float var8 = var4 - var2;
      float var9 = var5 - var3;
      float var10 = (float)Math.sqrt(var8 * var8 + var9 * var9);
      if (!(var10 < 0.05F)) {
         float var11 = (float)Math.toDegrees(Math.atan2(var9, var8));
         var1.UuUVuuUu((var2 + var4) * 0.5F, (var3 + var5) * 0.5F);
         var1.C00OOC00oO(var11);
         var1.UuUVuuUu(-(var10 + var6) * 0.5F, -var6 * 0.5F, var10 + var6, var6, var6 * 0.5F, var7);
         var1.VVuuUN();
         var1.vNUvnnVnUvu();
      }
   }

   private void UuUVuuUu(NuvVVvUU.NVnVnNnN var1, long var2) {
      if (var2 - var1.NnVnNVN >= 1000000000L || !var1.nvuVvuNnNUnv) {
         var1.nvuVvuNnNUnv = true;
         var1.NnVnNVN = var2;

         try {
            var1.vnvvNvUnVv = NuvVVvUU.nUVVnVNu.UuUVuuUu(var1.UuUVuuUu, var1.C00OOC00oO);
         } catch (Throwable var5) {
            var1.vnvvNvUnVv = null;
         }
      }
   }

   private int C00OOC00oO(float var1) {
      return this.vnVuunuNN ? UuUVuuUu(0.1F, 0.1F, 0.1F, var1) : UuUVuuUu(1.0F, 1.0F, 1.0F, var1);
   }

   private int uUnuvNvvNU(float var1) {
      return this.vnVuunuNN ? UuUVuuUu(0.3F, 0.31F, 0.34F, var1) : UuUVuuUu(0.8F, 0.86F, 0.9F, var1);
   }

   private int vVvUvVVuuNvV(float var1) {
      return this.vnVuunuNN ? UuUVuuUu(0.78F, 0.19F, 0.17F, var1) : UuUVuuUu(1.0F, 0.44F, 0.4F, var1);
   }

   private static void UuUVuuUu(UnVNvNnU var0, nUVnuvUu var1, float var2, float var3, float var4, float var5, float var6, String var7, int var8) {
      String var9 = var7 == null ? "" : var7;
      float var10 = UnVNvNnU.UuUVuuUu(var1, var9, var6).UuUVuuUu;
      float var11 = uNNnnnuuuN(var2 + (var4 - var10) * 0.5F);
      float var12 = uNNnnnuuuN(UuUVuuUu(var1, var6, var3, var5));
      var0.UuUVuuUu(var1, var11, var12, var6, var9, var8);
   }

   private boolean C00OOC00oO(NuvVVvUU.VvunVVUvUNnv var1) {
      return switch (var1) {
         case USE -> this.UvUvUNuvNU() != null;
         case ADD_CRACKED -> !uVUuuVnNVU(this.NnUVNnuvUv.uNnUnnuNUnNu).isBlank();
         case RANDOM, BACK, CREATE_FIRST -> true;
         case EDIT -> this.uVunuUNVVUUV();
         case DELETE -> this.UvUvUNuvNU() != null;
      };
   }

   private class_2960 UuUVuuUu(class_310 var1, NuvVVvUU.NVnVnNnN var2) {
      class_2960 var3 = UnUUVuVunvVu.get(var2.nuUnNvnuUu);
      if (var3 != null) {
         return var3;
      } else {
         this.C00OOC00oO(var1, var2);
         if (!var2.NVNnnvnuunNv) {
            var2.UvnvNVnnnnNU = var1.method_1582().method_52862(var2.uNNnnnuuuN).comp_1626();
            var2.NVNnnvnuunNv = true;
         }

         return var2.UvnvNVnnnnNU;
      }
   }

   private void C00OOC00oO(class_310 var1, NuvVVvUU.NVnVnNnN var2) {
      if (var1 != null && var2.C00OOC00oO.length() >= 3 && nnvuvUNuUnN.add(var2.nuUnNvnuUu)) {
         GameProfile var3 = var1.method_53462();
         if (var3 != null && var2.C00OOC00oO.equalsIgnoreCase(var3.getName()) && !var3.getProperties().isEmpty()) {
            UuUVuuUu(var1, var2.nuUnNvnuUu, var3);
         } else {
            String var4 = var2.C00OOC00oO;
            String var5 = var2.nuUnNvnuUu;
            nvvnUnUn.execute(() -> {
               try {
                  GameProfile var3x = (GameProfile)C00OOC00oO(var1).findProfileByName(var4).orElse(null);
                  if (var3x == null || var3x.getId() == null) {
                     return;
                  }

                  ProfileResult var4x = var1.method_1495().fetchProfile(var3x.getId(), false);
                  GameProfile var5x = var4x != null && var4x.profile() != null ? var4x.profile() : var3x;
                  var1.execute(() -> UuUVuuUu(var1, var5, var5x));
               } catch (Throwable var6) {
                  nnvuvUNuUnN.remove(var5);
               }
            });
         }
      }
   }

   private static void UuUVuuUu(class_310 var0, String var1, GameProfile var2) {
      try {
         var0.method_1582().method_52863(var2).thenAccept(var1x -> var1x.ifPresent(var1xx -> UnUUVuVunvVu.put(var1, var1xx.comp_1626())));
      } catch (Throwable var4) {
      }
   }

   private static GameProfileRepository C00OOC00oO(class_310 var0) {
      GameProfileRepository var1 = UVnuVUUVnnU;
      if (var1 == null) {
         synchronized (nnvuvUNuUnN) {
            var1 = UVnuVUUVnnU;
            if (var1 == null) {
               var1 = new YggdrasilAuthenticationService(var0.method_1487()).createProfileRepository();
               UVnuVUUVnnU = var1;
            }
         }
      }

      return var1;
   }

   private boolean UuUVuuUu(NuvVVvUU.NVnVnNnN var1, String var2) {
      if (var2.isBlank()) {
         return false;
      } else {
         class_310 var3 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
         boolean var4 = var3 != null && var3.method_1548() != null && var3.method_1548().method_35718() != class_321.field_1990;
         return var1.C00OOC00oO.equals(var2) && var1.uUnuvNvvNU == (var4 ? NuvVVvUU.nvnNNunvv.PREMIUM : NuvVVvUU.nvnNNunvv.CRACKED);
      }
   }

   private String UUVNuUNUvUnV() {
      class_310 var1 = this.field_22787 == null ? class_310.method_1551() : this.field_22787;
      return var1 != null && var1.method_1548() != null ? var1.method_1548().method_1676() : "";
   }

   private String vuvnUnVnUNnV() {
      String var1 = this.UUVNuUNUvUnV();
      return var1.isBlank() ? "no session" : var1;
   }

   private void C00OOC00oO(int var1) {
      if (this.nVVUuvuNnUN() == 0) {
         this.UvUNuNvvNVNv = -1;
         this.uUnuvNvvNU("No identities");
      } else {
         int var2 = this.UvUNuNvvNVNv < 0 ? (var1 >= 0 ? -1 : this.VNNnnVUuvv.size()) : this.UvUNuNvvNVNv;

         for (int var3 = 0; var3 < this.VNNnnVUuvv.size(); var3++) {
            var2 = UuUVuuUu(var2 + var1, 0, this.VNNnnVUuvv.size() - 1);
            NuvVVvUU.NVnVnNnN var4 = this.VNNnnVUuvv.get(var2);
            if (!var4.NUVvUUVuVNVv && !var4.ccOO0COcoco0) {
               this.UuUVuuUu(var2, "Selected " + var4.C00OOC00oO);
               var4.NVUunUNUN = Math.max(var4.NVUunUNUN, 0.24F);
               this.uUnuvNvvNU();
               return;
            }

            if (var1 > 0 && var2 == this.VNNnnVUuvv.size() - 1 || var1 < 0 && var2 == 0) {
               return;
            }
         }
      }
   }

   private void nnuUVNUuvvVU() {
      if (this.UvUNuNvvNVNv >= 0 && this.UvUNuNvvNVNv < this.VNNnnVUuvv.size()) {
         NuvVVvUU.NVnVnNnN var1 = this.VNNnnVUuvv.get(this.UvUNuNvvNVNv);
         if (!var1.NUVvUUVuVNVv && !var1.ccOO0COcoco0) {
            int var2 = this.uUnuvNvvNU(this.UvUNuNvvNVNv);
            int var3 = (int)Math.floor(this.VnvunuuvUNu);
            int var4 = var3 + this.vNnNNNuVVnUv - 1;
            if (var2 < var3 || var2 > var4) {
               if (var2 < this.VnvunuuvUNu) {
                  this.VnvunuuvUNu = var2;
               }

               if (var2 > this.VnvunuuvUNu + this.vNnNNNuVVnUv - 1.0F) {
                  this.VnvunuuvUNu = var2 - this.vNnNNNuVVnUv + 1;
               }

               int var5 = Math.max(0, this.nVVUuvuNnUN() - Math.max(1, this.vNnNNNuVVnUv));
               this.VnvunuuvUNu = uUnuvNvvNU(this.VnvunuuvUNu, 0.0F, var5);
               this.NvNvVNUv = 0.85F;
            }
         }
      }
   }

   private int nVVUuvuNnUN() {
      int var1 = 0;

      for (NuvVVvUU.NVnVnNnN var3 : this.VNNnnVUuvv) {
         if (!var3.ccOO0COcoco0 && !var3.NUVvUUVuVNVv) {
            var1++;
         }
      }

      return var1;
   }

   private int uUnuvNvvNU(int var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         if (!this.VNNnnVUuvv.get(var3).ccOO0COcoco0) {
            var2++;
         }
      }

      return var2;
   }

   private float UuUVuuUu(class_1041 var1, double var2) {
      return (float)(var2 * var1.method_4489() / Math.max(1.0, (double)var1.method_4486()));
   }

   private float C00OOC00oO(class_1041 var1, double var2) {
      return (float)(var2 * var1.method_4506() / Math.max(1.0, (double)var1.method_4502()));
   }

   static String uVUuuVnNVU(String var0) {
      if (var0 == null) {
         return "";
      } else {
         String var1 = var0.trim();
         int var2 = var1.indexOf(64);
         if (var2 > 0) {
            var1 = var1.substring(0, var2);
         }

         var1 = var1.replaceAll("[^A-Za-z0-9_]", "");
         if (var1.length() > 16) {
            var1 = var1.substring(0, 16);
         }

         return var1;
      }
   }

   private void UuUVuuUu(class_320 var1, boolean var2) {
      if (var1 != null) {
         String var3 = uVUuuVnNVU(var1.method_1676());
         if (!var3.isBlank()) {
            NuvVVvUU.nvnNNunvv var4 = var1.method_35718() == class_321.field_1990 ? NuvVVvUU.nvnNNunvv.CRACKED : NuvVVvUU.nvnNNunvv.PREMIUM;
            if (this.UuUVuuUu(var3, var4) < 0) {
               long var5 = System.currentTimeMillis();
               this.VNNnnVUuvv.add(0, new NuvVVvUU.NVnVnNnN(var3, var4, var2, this.uNUnUuUnvnnU, C00OOC00oO(var3, var4), var5, var5));
            }
         }
      }
   }

   static String C00OOC00oO(String var0, NuvVVvUU.nvnNNunvv var1) {
      return UUID.nameUUIDFromBytes(("wild-alt-vault:" + var1.name() + ":" + var0).getBytes(StandardCharsets.UTF_8)).toString();
   }

   private static float UuUVuuUu(float var0, float var1) {
      return Math.max(var0 * var1, 18.0F);
   }

   private static float UuUVuuUu(nUVnuvUu var0, float var1) {
      try {
         float var2 = vNvnnVvvVUu.UuUVuuUu(var0, 72, var1 * 0.5F);
         if (var2 > 0.05F) {
            return var2 * 2.0F;
         }
      } catch (Throwable var3) {
      }

      return var1 * 0.36F;
   }

   private void C00OOC00oO(NuvVVvUU.NVnVnNnN var1, long var2) {
      NuvVVvUU.VUVvVuvuN var4 = var1.vnvvNvUnVv;
      int var5 = var1.VvVvnNUnvuvV ? 0 : (var4 != null ? 1 : (var1.vNVuvnUUnuUn > 0L ? 2 : 3));

      long var6 = switch (var5) {
         case 1 -> var4.totalMs() / 60000L;
         case 2 -> (System.currentTimeMillis() - var1.vNVuvnUUnuUn) / 60000L;
         default -> 0L;
      };
      if (var1.nvUVNnuu != var5 || var1.vuuuNvNuv != var6) {
         var1.nvUVNnuu = var5;
         var1.vuuuNvNuv = var6;

         var1.uVUuuVnNVU = switch (var5) {
            case 0 -> "Current session";
            case 1 -> "Played " + uNNnnnuuuN(var4.totalMs());
            case 2 -> "Last used " + vVvUvVVuuNvV(System.currentTimeMillis() - var1.vNVuvnUUnuUn);
            default -> "Never signed in";
         };
      }
   }

   private static String vVvUvVVuuNvV(long var0) {
      long var2 = Math.max(0L, var0 / 60000L);
      if (var2 < 2L) {
         return "just now";
      } else if (var2 < 60L) {
         return var2 + "m ago";
      } else {
         long var4 = var2 / 60L;
         if (var4 < 24L) {
            return var4 + "h ago";
         } else {
            long var6 = var4 / 24L;
            if (var6 < 7L) {
               return var6 + "d ago";
            } else {
               long var8 = var6 / 7L;
               return var8 < 9L ? var8 + "w ago" : Math.max(1L, var6 / 30L) + "mo ago";
            }
         }
      }
   }

   private static float UuUVuuUu(nUVnuvUu var0, float var1, float var2, float var3) {
      try {
         return var2 + var3 * 0.5F + vNvnnVvvVUu.UuUVuuUu(var0, 72, var1 * 0.5F);
      } catch (Throwable var5) {
         return var2 + var3 * 0.5F + var1 * 0.18F;
      }
   }

   private static float uNNnnnuuuN(float var0) {
      return Math.round(var0);
   }

   private static float nuUnNvnuUu(float var0) {
      return Math.max(16.0F, Math.round(var0 / 8.0F) * 8.0F);
   }

   private static String vuuuNvNuv(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         StringBuilder var1 = new StringBuilder(var0.length());

         for (int var2 = 0; var2 < var0.length(); var2++) {
            char var3 = var0.charAt(var2);
            if (var3 == 167) {
               var2++;
            } else if (var3 == '&' && var2 + 1 < var0.length() && UuUVuuUu(var0.charAt(var2 + 1))) {
               var2++;
            } else if (!Character.isISOControl(var3)) {
               var1.append(var3);
            }
         }

         return var1.toString().trim();
      } else {
         return "";
      }
   }

   private static boolean UuUVuuUu(char var0) {
      return var0 >= '0' && var0 <= '9'
         || var0 >= 'a' && var0 <= 'f'
         || var0 >= 'A' && var0 <= 'F'
         || var0 >= 'k' && var0 <= 'o'
         || var0 >= 'K' && var0 <= 'O'
         || var0 == 'r'
         || var0 == 'R';
   }

   private static String UuUVuuUu(String var0, float var1, float var2, nUVnuvUu var3) {
      if (var0 == null) {
         return "";
      } else if (var1 <= 0.0F) {
         return "";
      } else if (UnVNvNnU.UuUVuuUu(var3, var0, var2).UuUVuuUu <= var1) {
         return var0;
      } else {
         String var4 = "...";
         if (UnVNvNnU.UuUVuuUu(var3, var4, var2).UuUVuuUu > var1) {
            return "";
         } else {
            int var5 = 1;
            int var6 = var0.length();
            int var7 = 1;

            while (var5 <= var6) {
               int var8 = var5 + var6 >>> 1;
               if (UnVNvNnU.UuUVuuUu(var3, var0.substring(0, var8) + var4, var2).UuUVuuUu <= var1) {
                  var7 = var8;
                  var5 = var8 + 1;
               } else {
                  var6 = var8 - 1;
               }
            }

            return var0.substring(0, var7) + var4;
         }
      }
   }

   private static String uNNnnnuuuN(long var0) {
      long var2 = Math.max(0L, var0 / 1000L);
      long var4 = var2 / 3600L;
      long var6 = var2 % 3600L / 60L;
      long var8 = var2 % 60L;
      if (var4 > 0L) {
         return var6 > 0L ? var4 + "h " + var6 + "m" : var4 + "h";
      } else if (var6 <= 0L) {
         return Math.max(1L, var8) + "s";
      } else {
         return var8 > 0L && var6 < 10L ? var6 + "m " + var8 + "s" : var6 + "m";
      }
   }

   private static float C00OOC00oO(float var0, float var1) {
      float var2 = uUnuvNvvNU(Menu.c0oOOCcCoC0.uUnuvNvvNU() / 0.86F, 0.72F, 1.46F);
      return uUnuvNvvNU(Math.min(var0 / 1920.0F, var1 / 1080.0F) * 1.1F * var2, 0.68F, 2.2F);
   }

   static float UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var2 + var4 * 0.5F;
      float var8 = var3 + var5 * 0.5F;
      float var9 = var4 * 0.5F - var6;
      float var10 = var5 * 0.5F - var6;
      float var11 = Math.abs(var0 - var7) - var9;
      float var12 = Math.abs(var1 - var8) - var10;
      float var13 = Math.max(var11, 0.0F);
      float var14 = Math.max(var12, 0.0F);
      return (float)Math.sqrt(var13 * var13 + var14 * var14) + Math.min(Math.max(var11, var12), 0.0F) - var6;
   }

   private static float uUnuvNvvNU(float var0, float var1) {
      return (float)Math.sqrt(var0 * var0 + var1 * var1);
   }

   private static float VVuuUN(float var0) {
      float var1 = uUnuvNvvNU(var0, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   private static float uUnuvNvvNU(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   static int UuUVuuUu(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static int UuUVuuUu(float var0, float var1, float var2, float var3) {
      int var4 = Math.round(uUnuvNvvNU(var0, 0.0F, 1.0F) * 255.0F);
      int var5 = Math.round(uUnuvNvvNU(var1, 0.0F, 1.0F) * 255.0F);
      int var6 = Math.round(uUnuvNvvNU(var2, 0.0F, 1.0F) * 255.0F);
      int var7 = Math.round(uUnuvNvvNU(var3, 0.0F, 1.0F) * 255.0F);
      return var7 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   private static int UuUVuuUu(int var0, int var1, float var2, float var3) {
      float var4 = uUnuvNvvNU(var2, 0.0F, 1.0F);
      int var5 = VnVnuUn.vVvUvVVuuNvV(var0, var1, var4);
      int var6 = Math.round(uUnuvNvvNU(var3, 0.0F, 1.0F) * 255.0F);
      return var6 << 24 | var5;
   }

   static final class NVnVnNnN {
      final String UuUVuuUu;
      final String C00OOC00oO;
      final NuvVVvUU.nvnNNunvv uUnuvNvvNU;
      final boolean vVvUvVVuuNvV;
      final GameProfile uNNnnnuuuN;
      final String nuUnNvnuUu;
      final nUuuVnUnNvn VVuuUN = new nUuuVnUnNvn(vuVvuunNvVv.uUVuVvuNUvnu);
      final nUuuVnUnNvn vNUvnnVnUvu = new nUuuVnUnNvn(vuVvuunNvVv.vuuuNvNuv);
      String uVUuuVnNVU = "";
      long vuuuNvNuv = Long.MIN_VALUE;
      int nvUVNnuu = -1;
      final float[] UuuNnUvUuv = new float[3];
      final float[] nUUVuvU = new float[3];
      final long UnUNVVVNuv;
      long vNVuvnUUnuUn;
      class_2960 UvnvNVnnnnNU;
      int uVUVnuvnuVuv;
      boolean NVNnnvnuunNv;
      float uVunuUNVVUUV;
      float UNnVVNvvnVvU;
      float uNnUnnuNUnNu;
      float NnUuNNU;
      float nNvNUVU;
      float UnUNuUU;
      float uUVuVvuNUvnu;
      float UvUvUNuvNU;
      float c0oOOCcCoC0;
      float VVnVNnunVvu;
      float unNNVVNnvvV;
      float NuunnvnN;
      float NVUunUNUN;
      float UUVNuUNUvUnV = 1.0F;
      float vuvnUnVnUNnV = 0.5F;
      float nnuUVNUuvvVU = 0.5F;
      float nVVUuvuNnUN;
      float nNnVnUNVV;
      float nuunNvv;
      float uUVVvVVNvvn;
      float vvUVNVvvNUv;
      float UuNnnVnuNNV = 1.0F;
      float uUVvnUuNvvN = 1.0F;
      float UUuUnNVNuuv = 1.0F;
      float NVuNUuVnVUN;
      float NVuunNnvvvVu;
      float vNnNuuvVn;
      float VUuuVUnun;
      float vVVuuVVv;
      float VuunNUUUvu;
      boolean NNUUNUuVNNVn;
      boolean VvVvnNUnvuvV;
      boolean ccOO0COcoco0;
      boolean NUVvUUVuVNVv;
      boolean nNuVunNUVu = true;
      boolean UNvvunVVn;
      boolean UnvuVuVnNuvu;
      boolean UvNNVUVNVuvV;
      boolean NnunUUnU;
      boolean nvuVvuNnNUnv;
      long NnVnNVN;
      NuvVVvUU.VUVvVuvuN vnvvNvUnVv;

      NVnVnNnN(String var1, NuvVVvUU.nvnNNunvv var2, boolean var3, float var4, String var5, long var6, long var8) {
         this.UuUVuuUu = var5;
         this.C00OOC00oO = var1;
         this.uUnuvNvvNU = var2;
         this.vVvUvVVuuNvV = var3;
         this.UnUNVVVNuv = var6;
         this.vNVuvnUUnuUn = var8;
         this.uVunuUNVVUUV = var4;
         this.uNNnnnuuuN = new GameProfile(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var1).getBytes(StandardCharsets.UTF_8)), var1);
         this.nuUnNvnuUu = var1.toLowerCase(Locale.ROOT);
         this.vNUvnnVnUvu.UuUVuuUu(0.0F);
      }

      boolean UuUVuuUu(float var1, float var2) {
         return NuvVVvUU.UuUVuuUu(var1, var2, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.UnUNuUU, this.uUVuVvuNUvnu, this.UvUvUNuvNU) <= 0.0F;
      }
   }

   static final class VUUnVnVNNU extends NuvVVvUU.nUNvUnnVN {
      final boolean uVunuUNVVUUV;
      final nUuuVnUnNvn UNnVVNvvnVvU = new nUuuVnUnNvn(vuVvuunNvVv.uUVuVvuNUvnu);
      String uNnUnnuNUnNu = "";
      int NnUuNNU;
      boolean nNvNUVU;
      boolean UnUNuUU;
      float uUVuVvuNUvnu;
      float UvUvUNuvNU;
      float c0oOOCcCoC0;
      float VVnVNnunVvu;

      VUUnVnVNNU(String var1, boolean var2) {
         super(var1);
         this.uVunuUNVVUUV = var2;
      }

      void UuUVuuUu(String var1) {
         if (this.UnUNuUU) {
            this.uNnUnnuNUnNu = "";
            this.NnUuNNU = 0;
            this.UnUNuUU = false;
         }

         String var2 = var1.replaceAll("[^A-Za-z0-9_]", "");
         if (!var2.isEmpty()) {
            int var3 = 16 - this.uNnUnnuNUnNu.length();
            if (var3 > 0) {
               if (var2.length() > var3) {
                  var2 = var2.substring(0, var3);
               }

               this.uNnUnnuNUnNu = this.uNnUnnuNUnNu.substring(0, this.NnUuNNU) + var2 + this.uNnUnnuNUnNu.substring(this.NnUuNNU);
               this.NnUuNNU = this.NnUuNNU + var2.length();
            }
         }
      }

      void UuUVuuUu(char var1) {
         this.UuUVuuUu(String.valueOf(var1));
      }

      void C00OOC00oO() {
         if (this.UnUNuUU) {
            this.uUnuvNvvNU();
         } else if (this.NnUuNNU > 0 && !this.uNnUnnuNUnNu.isEmpty()) {
            this.uNnUnnuNUnNu = this.uNnUnnuNUnNu.substring(0, this.NnUuNNU - 1) + this.uNnUnnuNUnNu.substring(this.NnUuNNU);
            this.NnUuNNU--;
         }
      }

      void uUnuvNvvNU() {
         this.uNnUnnuNUnNu = "";
         this.NnUuNNU = 0;
         this.UvUvUNuvNU = this.c0oOOCcCoC0 = 0.0F;
         this.UnUNuUU = false;
      }

      void vVvUvVVuuNvV() {
         this.UuUVuuUu();
         this.nNvNUVU = false;
         this.UnUNuUU = false;
         this.uUVuVvuNUvnu = this.c0oOOCcCoC0 = 0.0F;
         this.NnUuNNU = NuvVVvUU.UuUVuuUu(this.NnUuNNU, 0, this.uNnUnnuNUnNu.length());
         this.VVnVNnunVvu = this.uNnUnnuNUnNu.isBlank() ? 0.0F : 1.0F;
         this.UNnVVNvvnVvU.UuUVuuUu(this.VVnVNnunVvu);
      }
   }

   record VUVvVuvuN(String displayName, String address, byte[] favicon, long totalMs, long lastActiveAt) {
   }

   static final class VUnuUnnuNvVu extends NuvVVvUU.nUNvUnnVN {
      VUnuUnnuNvVu() {
         super("Back");
      }
   }

   static enum VvunVVUvUNnv {
      USE,
      ADD_CRACKED,
      RANDOM,
      EDIT,
      DELETE,
      BACK,
      CREATE_FIRST;
   }

   static class nUNvUnnVN {
      protected String UuUVuuUu;
      protected float C00OOC00oO;
      protected float uUnuvNvvNU;
      protected float vVvUvVVuuNvV;
      protected float uNNnnnuuuN;
      protected float nuUnNvnuUu;
      protected float VVuuUN;
      protected float vNUvnnVnUvu;
      protected float uVUuuVnNVU;
      protected float vuuuNvNuv;
      protected float nvUVNnuu;
      protected float UuuNnUvUuv;
      protected float nUUVuvU = 1.0F;
      protected float UnUNVVVNuv = 0.5F;
      protected float vNVuvnUUnuUn = 0.5F;
      protected float UvnvNVnnnnNU;
      protected float uVUVnuvnuVuv;
      protected float NVNnnvnuunNv;

      protected nUNvUnnVN(String var1) {
         this.UuUVuuUu = var1;
      }

      protected boolean UuUVuuUu(float var1, float var2) {
         return NuvVVvUU.UuUVuuUu(var1, var2, this.C00OOC00oO, this.uUnuvNvvNU, this.nuUnNvnuUu, this.VVuuUN, this.vNUvnnVnUvu) <= 0.0F;
      }

      protected void UuUVuuUu() {
         this.uVUuuVnNVU = this.vuuuNvNuv = this.nvUVNnuu = this.UuuNnUvUuv = this.UvnvNVnnnnNU = this.NVNnnvnuunNv = 0.0F;
         this.nUUVuvU = 1.0F;
         this.UnUNVVVNuv = this.vNVuvnUUnuUn = 0.5F;
      }
   }

   static final class nUVVnVNu {
      private static final Gson UuUVuuUu = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
      private static final long C00OOC00oO = 10000L;
      private static final long uUnuvNvvNU = 60000L;
      private static final Map<String, NuvVVvUU.nUVVnVNu.NVnVnNnN> vVvUvVVuuNvV = new HashMap<>();
      private static final Map<String, byte[]> uNNnnnuuuN = new HashMap<>();
      private static boolean nuUnNvnuUu;
      private static boolean VVuuUN;
      private static boolean vNUvnnVnUvu;
      private static String uVUuuVnNVU = "";
      private static String vuuuNvNuv = "";
      private static long nvUVNnuu;
      private static long UuuNnUvUuv;

      private nUVVnVNu() {
      }

      static synchronized void UuUVuuUu(class_310 var0) {
         C00OOC00oO();
         long var1 = System.currentTimeMillis();
         NuvVVvUU.nUVVnVNu.nvnNNunvv var3 = C00OOC00oO(var0);
         String var4 = uUnuvNvvNU(var0);
         if (var3 != null && !var4.isBlank()) {
            NuvVVvUU.nvnNNunvv var5 = vVvUvVVuuNvV(var0);
            String var6 = NuvVVvUU.C00OOC00oO(var4, var5);
            if (var6.equals(uVUuuVnNVU) && var3.key().equals(vuuuNvNuv)) {
               long var7 = Math.min(60000L, Math.max(0L, var1 - nvUVNnuu));
               nvUVNnuu = var1;
               if (var7 > 0L) {
                  UuUVuuUu(var6, var4, var3, var7, var1);
               }

               UuUVuuUu(var1, false);
            } else {
               UuUVuuUu(var1);
               uVUuuVnNVU = var6;
               vuuuNvNuv = var3.key();
               nvUVNnuu = var1;
               UuUVuuUu(var6, var4, var3, 0L, var1);
               UuUVuuUu(var1, false);
            }
         } else {
            UuUVuuUu(var1);
            UuUVuuUu(var1, true);
         }
      }

      static synchronized void UuUVuuUu() {
         C00OOC00oO();
         long var0 = System.currentTimeMillis();
         UuUVuuUu(var0);
         UuUVuuUu(var0, true);
      }

      static synchronized NuvVVvUU.VUVvVuvuN UuUVuuUu(String var0, String var1) {
         C00OOC00oO();
         NuvVVvUU.nUVVnVNu.VvunVVUvUNnv var2 = null;
         ArrayList var3 = new ArrayList(3);
         if (var0 != null && !var0.isBlank()) {
            var3.add(var0);
         }

         String var4 = NuvVVvUU.uVUuuVnNVU(var1);
         if (!var4.isBlank()) {
            var3.add(NuvVVvUU.C00OOC00oO(var4, NuvVVvUU.nvnNNunvv.CRACKED));
            var3.add(NuvVVvUU.C00OOC00oO(var4, NuvVVvUU.nvnNNunvv.PREMIUM));
         }

         HashSet var5 = new HashSet();

         for (String var7 : var3) {
            if (var7 != null && !var7.isBlank() && var5.add(var7)) {
               NuvVVvUU.nUVVnVNu.NVnVnNnN var8 = vVvUvVVuuNvV.get(var7);
               if (var8 != null) {
                  for (NuvVVvUU.nUVVnVNu.VvunVVUvUNnv var10 : var8.uUnuvNvvNU.values()) {
                     if (var10.uNNnnnuuuN > 0L
                        && (var2 == null || var10.uNNnnnuuuN > var2.uNNnnnuuuN || var10.uNNnnnuuuN == var2.uNNnnnuuuN && var10.nuUnNvnuUu > var2.nuUnNvnuUu)) {
                        var2 = var10;
                     }
                  }
               }
            }
         }

         if (var2 == null) {
            return null;
         } else {
            byte[] var11 = var2.vVvUvVVuuNvV == null ? null : Arrays.copyOf(var2.vVvUvVVuuNvV, var2.vVvUvVVuuNvV.length);
            if ((var11 == null || var11.length == 0) && !var2.uUnuvNvvNU.isBlank()) {
               var11 = UuUVuuUu(var2.uUnuvNvvNU);
               if (var11 != null && var11.length > 0) {
                  var2.vVvUvVVuuNvV = Arrays.copyOf(var11, var11.length);
                  vNUvnnVnUvu = true;
               }
            }

            return new NuvVVvUU.VUVvVuvuN(var2.UuUVuuUu(), var2.uUnuvNvvNU, var11, var2.uNNnnnuuuN, var2.nuUnNvnuUu);
         }
      }

      private static void UuUVuuUu(long var0) {
         if (!uVUuuVnNVU.isBlank() && !vuuuNvNuv.isBlank() && nvUVNnuu > 0L) {
            NuvVVvUU.nUVVnVNu.NVnVnNnN var2 = vVvUvVVuuNvV.get(uVUuuVnNVU);
            NuvVVvUU.nUVVnVNu.VvunVVUvUNnv var3 = var2 == null ? null : var2.uUnuvNvvNU.get(vuuuNvNuv);
            if (var3 != null) {
               long var4 = Math.min(60000L, Math.max(0L, var0 - nvUVNnuu));
               if (var4 > 0L) {
                  var3.uNNnnnuuuN += var4;
                  var3.nuUnNvnuUu = var0;
                  vNUvnnVnUvu = true;
               }
            }
         }

         uVUuuVnNVU = "";
         vuuuNvNuv = "";
         nvUVNnuu = 0L;
      }

      private static void UuUVuuUu(String var0, String var1, NuvVVvUU.nUVVnVNu.nvnNNunvv var2, long var3, long var5) {
         NuvVVvUU.nUVVnVNu.NVnVnNnN var7 = vVvUvVVuuNvV.computeIfAbsent(var0, var2x -> new NuvVVvUU.nUVVnVNu.NVnVnNnN(var0, var1));
         var7.C00OOC00oO = var1;
         NuvVVvUU.nUVVnVNu.VvunVVUvUNnv var8 = var7.uUnuvNvvNU
            .computeIfAbsent(var2.key(), var1x -> new NuvVVvUU.nUVVnVNu.VvunVVUvUNnv(var2.key(), var2.name(), var2.address()));
         var8.C00OOC00oO = var2.name();
         var8.uUnuvNvvNU = var2.address();
         if (var2.favicon() != null && var2.favicon().length > 0) {
            var8.vVvUvVVuuNvV = Arrays.copyOf(var2.favicon(), var2.favicon().length);
         }

         var8.uNNnnnuuuN = var8.uNNnnnuuuN + Math.max(0L, var3);
         var8.nuUnNvnuUu = var5;
         vNUvnnVnUvu = true;
      }

      private static NuvVVvUU.nUVVnVNu.nvnNNunvv C00OOC00oO(class_310 var0) {
         if (var0 != null && var0.field_1724 != null && var0.field_1687 != null && var0.method_1562() != null) {
            try {
               if (var0.method_47392()) {
                  return new NuvVVvUU.nUVVnVNu.nvnNNunvv("local:localhost", "Local Server", "localhost", null);
               }
            } catch (Throwable var8) {
            }

            class_642 var1 = null;

            try {
               var1 = var0.method_1558();
            } catch (Throwable var7) {
            }

            if (var1 == null) {
               try {
                  var1 = var0.method_1562().method_45734();
               } catch (Throwable var6) {
               }
            }

            if (var1 != null) {
               String var2 = uUnuvNvvNU(var1.field_3761);
               if (!var2.isBlank()) {
                  String var10 = nuUnNvnuUu(var1.field_3752).trim();
                  if (var10.isBlank()) {
                     var10 = uNNnnnuuuN(var2);
                  }

                  byte[] var4 = var1.method_49306();
                  return new NuvVVvUU.nUVVnVNu.nvnNNunvv("server:" + C00OOC00oO(var2), var10, var2, var4 == null ? null : Arrays.copyOf(var4, var4.length));
               }
            }

            try {
               SocketAddress var9 = var0.method_1562().method_48296().method_10755();
               String var3 = var9 == null ? "" : uUnuvNvvNU(var9.toString());
               if (!var3.isBlank()) {
                  return new NuvVVvUU.nUVVnVNu.nvnNNunvv("server:" + C00OOC00oO(var3), uNNnnnuuuN(var3), var3, null);
               }
            } catch (Throwable var5) {
            }

            return null;
         } else {
            return null;
         }
      }

      private static String uUnuvNvvNU(class_310 var0) {
         try {
            return var0 != null && var0.method_1548() != null ? NuvVVvUU.uVUuuVnNVU(var0.method_1548().method_1676()) : "";
         } catch (Throwable var2) {
            return "";
         }
      }

      private static NuvVVvUU.nvnNNunvv vVvUvVVuuNvV(class_310 var0) {
         try {
            if (var0 != null && var0.method_1548() != null && var0.method_1548().method_35718() != class_321.field_1990) {
               return NuvVVvUU.nvnNNunvv.PREMIUM;
            }
         } catch (Throwable var2) {
         }

         return NuvVVvUU.nvnNNunvv.CRACKED;
      }

      private static void C00OOC00oO() {
         if (!nuUnNvnuUu) {
            nuUnNvnuUu = true;
            File var0 = uUnuvNvvNU();
            if (var0 != null && var0.exists() && var0.isFile()) {
               try {
                  JsonElement var1 = JsonParser.parseString(Files.readString(var0.toPath(), StandardCharsets.UTF_8));
                  if (var1 == null || !var1.isJsonObject()) {
                     return;
                  }

                  JsonObject var2 = var1.getAsJsonObject();
                  JsonElement var3 = var2.get("accounts");
                  if (var3 == null || !var3.isJsonArray()) {
                     return;
                  }

                  for (JsonElement var5 : var3.getAsJsonArray()) {
                     if (var5.isJsonObject()) {
                        JsonObject var6 = var5.getAsJsonObject();
                        String var7 = UuUVuuUu(var6, "id", "");
                        String var8 = NuvVVvUU.uVUuuVnNVU(UuUVuuUu(var6, "name", ""));
                        if (!var7.isBlank()) {
                           NuvVVvUU.nUVVnVNu.NVnVnNnN var9 = new NuvVVvUU.nUVVnVNu.NVnVnNnN(var7, var8);
                           JsonElement var10 = var6.get("servers");
                           if (var10 != null && var10.isJsonArray()) {
                              for (JsonElement var12 : var10.getAsJsonArray()) {
                                 if (var12.isJsonObject()) {
                                    JsonObject var13 = var12.getAsJsonObject();
                                    String var14 = C00OOC00oO(UuUVuuUu(var13, "key", ""));
                                    String var15 = uUnuvNvvNU(UuUVuuUu(var13, "address", ""));
                                    String var16 = nuUnNvnuUu(UuUVuuUu(var13, "name", "")).trim();
                                    byte[] var17 = vVvUvVVuuNvV(UuUVuuUu(var13, "favicon", ""));
                                    long var18 = Math.max(0L, UuUVuuUu(var13, "totalMs", 0L));
                                    long var20 = Math.max(0L, UuUVuuUu(var13, "lastActiveAt", 0L));
                                    if (!var14.isBlank() && var18 > 0L) {
                                       NuvVVvUU.nUVVnVNu.VvunVVUvUNnv var22 = new NuvVVvUU.nUVVnVNu.VvunVVUvUNnv(var14, var16, var15);
                                       var22.vVvUvVVuuNvV = var17;
                                       var22.uNNnnnuuuN = var18;
                                       var22.nuUnNvnuUu = var20;
                                       var9.uUnuvNvvNU.put(var14, var22);
                                    }
                                 }
                              }
                           }

                           if (!var9.uUnuvNvvNU.isEmpty()) {
                              vVvUvVVuuNvV.put(var7, var9);
                           }
                        }
                     }
                  }
               } catch (Throwable var23) {
               }
            }
         }
      }

      private static void UuUVuuUu(long var0, boolean var2) {
         if (vNUvnnVnUvu && (var2 || var0 - UuuNnUvUuv >= 10000L)) {
            File var3 = uUnuvNvvNU();
            if (var3 != null) {
               try {
                  File var4 = var3.getParentFile();
                  if (var4 != null) {
                     var4.mkdirs();
                  }

                  JsonObject var5 = new JsonObject();
                  var5.addProperty("version", 1);
                  var5.addProperty("updatedAt", var0);
                  JsonArray var6 = new JsonArray();

                  for (NuvVVvUU.nUVVnVNu.NVnVnNnN var8 : vVvUvVVuuNvV.values()) {
                     if (!var8.UuUVuuUu.isBlank() && !var8.uUnuvNvvNU.isEmpty()) {
                        JsonObject var9 = new JsonObject();
                        var9.addProperty("id", var8.UuUVuuUu);
                        var9.addProperty("name", var8.C00OOC00oO);
                        JsonArray var10 = new JsonArray();

                        for (NuvVVvUU.nUVVnVNu.VvunVVUvUNnv var12 : var8.uUnuvNvvNU.values()) {
                           if (var12.uNNnnnuuuN > 0L) {
                              JsonObject var13 = new JsonObject();
                              var13.addProperty("key", var12.UuUVuuUu);
                              var13.addProperty("name", var12.C00OOC00oO);
                              var13.addProperty("address", var12.uUnuvNvvNU);
                              if (var12.vVvUvVVuuNvV != null && var12.vVvUvVVuuNvV.length > 0) {
                                 var13.addProperty("favicon", Base64.getEncoder().encodeToString(var12.vVvUvVVuuNvV));
                              }

                              var13.addProperty("totalMs", var12.uNNnnnuuuN);
                              var13.addProperty("lastActiveAt", var12.nuUnNvnuUu);
                              var10.add(var13);
                           }
                        }

                        if (var10.size() > 0) {
                           var9.add("servers", var10);
                           var6.add(var9);
                        }
                     }
                  }

                  var5.add("accounts", var6);
                  Files.writeString(var3.toPath(), UuUVuuUu.toJson(var5), StandardCharsets.UTF_8);
                  vNUvnnVnUvu = false;
                  UuuNnUvUuv = var0;
               } catch (Throwable var14) {
               }
            }
         }
      }

      private static File uUnuvNvvNU() {
         try {
            File var0 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null
               ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu
               : new File(class_310.method_1551().field_1697, "Wild");
            return new File(var0, "account_server_stats.json");
         } catch (Throwable var1) {
            return null;
         }
      }

      private static byte[] UuUVuuUu(String var0) {
         vVvUvVVuuNvV();
         byte[] var1 = uNNnnnuuuN.get(C00OOC00oO(var0));
         return var1 == null ? null : Arrays.copyOf(var1, var1.length);
      }

      private static void vVvUvVVuuNvV() {
         if (!VVuuUN) {
            VVuuUN = true;

            try {
               class_310 var0 = class_310.method_1551();
               class_641 var1 = new class_641(var0);
               var1.method_2981();
               int var2 = var1.method_2984();

               for (int var3 = 0; var3 < var2; var3++) {
                  class_642 var4 = var1.method_2982(var3);
                  if (var4 != null && var4.field_3761 != null && !var4.field_3761.isBlank()) {
                     byte[] var5 = var4.method_49306();
                     if (var5 != null && var5.length != 0) {
                        uNNnnnuuuN.put(C00OOC00oO(var4.field_3761), Arrays.copyOf(var5, var5.length));
                     }
                  }
               }
            } catch (Throwable var6) {
            }
         }
      }

      private static String C00OOC00oO(String var0) {
         return uUnuvNvvNU(var0).toLowerCase(Locale.ROOT);
      }

      private static String uUnuvNvvNU(String var0) {
         String var1 = nuUnNvnuUu(var0).trim();
         if (var1.startsWith("/")) {
            var1 = var1.substring(1);
         }

         int var2 = var1.indexOf("<unresolved>");
         if (var2 >= 0) {
            var1 = var1.substring(0, var2) + var1.substring(var2 + "<unresolved>".length());
         }

         return var1.trim();
      }

      private static byte[] vVvUvVVuuNvV(String var0) {
         String var1 = nuUnNvnuUu(var0).trim();
         if (var1.isBlank()) {
            return null;
         } else {
            try {
               return Base64.getDecoder().decode(var1);
            } catch (Throwable var3) {
               return null;
            }
         }
      }

      static String uNNnnnuuuN(String var0) {
         String var1 = uUnuvNvvNU(var0);
         int var2 = var1.indexOf(47);
         if (var2 >= 0 && var2 + 1 < var1.length()) {
            var1 = var1.substring(var2 + 1);
         }

         return var1.isBlank() ? "Server" : var1;
      }

      private static String UuUVuuUu(JsonObject var0, String var1, String var2) {
         try {
            JsonElement var3 = var0.get(var1);
            return var3 != null && !var3.isJsonNull() ? var3.getAsString() : var2;
         } catch (Throwable var4) {
            return var2;
         }
      }

      private static long UuUVuuUu(JsonObject var0, String var1, long var2) {
         try {
            JsonElement var4 = var0.get(var1);
            return var4 != null && !var4.isJsonNull() ? var4.getAsLong() : var2;
         } catch (Throwable var5) {
            return var2;
         }
      }

      static String nuUnNvnuUu(String var0) {
         return var0 == null ? "" : var0;
      }

      static final class NVnVnNnN {
         final String UuUVuuUu;
         String C00OOC00oO;
         final Map<String, NuvVVvUU.nUVVnVNu.VvunVVUvUNnv> uUnuvNvvNU = new HashMap<>();

         NVnVnNnN(String var1, String var2) {
            this.UuUVuuUu = var1;
            this.C00OOC00oO = var2;
         }
      }

      static final class VvunVVUvUNnv {
         final String UuUVuuUu;
         String C00OOC00oO;
         String uUnuvNvvNU;
         byte[] vVvUvVVuuNvV;
         long uNNnnnuuuN;
         long nuUnNvnuUu;

         VvunVVUvUNnv(String var1, String var2, String var3) {
            this.UuUVuuUu = var1;
            this.C00OOC00oO = var2;
            this.uUnuvNvvNU = var3;
         }

         String UuUVuuUu() {
            String var1 = NuvVVvUU.nUVVnVNu.nuUnNvnuUu(this.C00OOC00oO).trim();
            return var1.isBlank() ? NuvVVvUU.nUVVnVNu.uNNnnnuuuN(this.uUnuvNvvNU) : var1;
         }
      }

      record nvnNNunvv(String key, String name, String address, byte[] favicon) {
      }
   }

   static enum nvUnvV {
      PRIMARY,
      SECONDARY,
      DESTRUCTIVE;
   }

   static enum nvnNNunvv {
      PREMIUM,
      CRACKED;

      static NuvVVvUU.nvnNNunvv UuUVuuUu(String var0) {
         if (var0 == null) {
            return CRACKED;
         } else {
            try {
               return valueOf(var0.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException var2) {
               return CRACKED;
            }
         }
      }
   }

   static final class uunvUUVnuNn extends NuvVVvUU.nUNvUnnVN {
      final NuvVVvUU.VvunVVUvUNnv uVunuUNVVUUV;
      private final NuvVVvUU.nvUnvV UNnVVNvvnVvU;
      boolean uNnUnnuNUnNu = true;
      float NnUuNNU;

      uunvUUVnuNn(String var1, NuvVVvUU.VvunVVUvUNnv var2, NuvVVvUU.nvUnvV var3) {
         super(var1);
         this.uVunuUNVVUUV = var2;
         this.UNnVVNvvnVvU = var3;
      }

      @Override
      protected void UuUVuuUu() {
         super.UuUVuuUu();
         this.NnUuNNU = 0.0F;
      }
   }

   static final class vUvuUvvVvvnN {
      float UuUVuuUu;
      float C00OOC00oO;
      float uUnuvNvvNU = -100.0F;
      float vVvUvVVuuNvV;
   }
}
