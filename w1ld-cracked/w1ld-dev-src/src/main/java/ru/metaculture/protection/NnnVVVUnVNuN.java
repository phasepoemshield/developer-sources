package ru.metaculture.protection;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.class_156;
import net.minecraft.class_310;
import net.minecraft.class_437;
import org.json.JSONObject;
import org.lwjgl.glfw.GLFW;

public final class NnnVVVUnVNuN implements AutoCloseable {
   private static final SimpleDateFormat UuUVuuUu = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ROOT);
   private static final String[] C00OOC00oO = new String[]{"Save As", "Export .wifd", "Import", "Open Folder", "Cleanup Legacy", "Reset"};
   private static final String[] uUnuvNvvNU = new String[]{"All", "Мои", "Пресеты"};
   private static final int vVvUvVVuuNvV = 0;
   private static final int uNNnnnuuuN = 1;
   private final nvvuUNnNvN nuUnNvnuUu = new nvvuUNnNvN();
   private final oo0OOO00o0O VVuuUN = new oo0OOO00o0O(this.nuUnNvnuUu);
   private final VVvvUnnUnV vNUvnnVnUvu = new VVvvUnnUnV(this.VVuuUN);
   private final nunnVVUnv uVUuuVnNVU = new nunnVVUnv(this.nuUnNvnuUu);
   private final uUNuVnvNVNUn vuuuNvNuv = new uUNuVnvNVNUn(this.nuUnNvnuUu, this.VVuuUN);
   private final ooOCCooc nvUVNnuu = new ooOCCooc();
   private nuVVnvn UuuNnUvUuv = O0oCc0Ccc.UuUVuuUu(this.nuUnNvnuUu);
   private float nUUVuvU = 520.0F;
   private float UnUNVVVNuv = 260.0F;
   private float vNVuvnUUnuUn = 0.92F;
   private float UvnvNVnnnnNU = 0.92F;
   private final UUNnvUVnnnnN uVUVnuvnuVuv = new UUNnvUVnnnnN(0.92F);
   private boolean NVNnnvnuunNv;
   private float uVunuUNVVUUV;
   private float UNnVVNvvnVvU;
   private float uNnUnnuNUnNu;
   private float NnUuNNU;
   private float nNvNUVU;
   private float UnUNuUU;
   private long uUVuVvuNUvnu;
   private String UvUvUNuvNU;
   private float c0oOOCcCoC0;
   private float VVnVNnunVvu;
   private String unNNVVNnvvV;
   private final Set<String> NuunnvnN = new LinkedHashSet<>();
   private final Set<String> NVUunUNUN = new LinkedHashSet<>();
   private final Map<String, NnnVVVUnVNuN.NVnVnNnN> UUVNuUNUvUnV = new HashMap<>();
   private float vuvnUnVnUNnV;
   private float nnuUVNUuvvVU;
   private boolean nVVUuvuNnUN;
   private float nNnVnUNVV;
   private float nuunNvv;
   private float uUVVvVVNvvn;
   private float vvUVNVvvNUv;
   private String UuNnnVnuNNV;
   private String uUVvnUuNvvN;
   private float UUuUnNVNuuv;
   private float NVuNUuVnVUN;
   private float NVuunNnvvvVu;
   private float vNnNuuvVn;
   private long VUuuVUnun;
   private String vVVuuVVv = "ready";
   private long VuunNUUUvu;
   private VnuVUNUv NNUUNUuVNNVn = VnuVUNUv.HUD;
   private boolean VvVvnNUnvuvV;
   private boolean ccOO0COcoco0;
   private boolean NUVvUUVuVNVv;
   private VnuVUNUv nNuVunNUVu;
   private boolean UNvvunVVn;
   private String UnvuVuVnNuvu = "Host Rectangle";
   private NnnVVVUnVNuN.nvnNNunvv UvNNVUVNVuvV = NnnVVVUnVNuN.nvnNNunvv.AUTO;
   private int NnunUUnU;
   private final Map<Integer, NNnUUVVnuUV> nvuVvuNnNUnv = new HashMap<>();
   private boolean NnVnNVN;
   private final uNuuunuNvuN vnvvNvUnVv = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uNNnVuNunvU.UuUVuuUu(2.7F, 0.86F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F);
   private final uNuuunuNvuN OCOocoOoOO = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uNNnVuNunvU.UuUVuuUu(2.4F, 0.78F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F);
   private final uNuuunuNvuN o0Ooc0COOoc = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uNNnVuNunvU.UuUVuuUu(2.6F, 0.84F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F);
   private final uNuuunuNvuN nvvnUnUn = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uNNnVuNunvU.UuUVuuUu(3.0F, 0.88F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F);
   private final uNuuunuNvuN UnUUVuVunvVu = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uNNnVuNunvU.UuUVuuUu(2.6F, 0.82F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F);
   private boolean nnvuvUNuUnN;
   private float UVnuVUUVnnU;
   private boolean VunnVNvNV;
   private float NvUVUvVVnUu;
   private int unnUnUNVnN;
   private String NnuUnUNnu = "";
   private boolean UnnnvvU;
   private long VUUnuVvVu;
   private final Set<String> VvVuvUvvNNVv = new LinkedHashSet<>();
   private long UnnNNvuvvUU;
   private String VNNnnVUuvv;
   private int vUvUvUNNuNvn = -1;
   private int uuVuUuuVVNvN = -1;
   private long VvuUUUNNNv;
   private final vNVunvUNNnUN uuuVnuvnnNnU = new vNVunvUNNnUN();
   private String nNunUnVN = nVNvNVnvnVvn.UuUVuuUu();
   private boolean VnVuuvVvnNv;
   private long vuvvuVuVv;
   private final Map<String, UVvNVvUUuUnN> uunNUuunVU = new HashMap<>();
   private final Map<String, UVvNVvUUuUnN> NvnuuuvnVV = new HashMap<>();
   private final Map<String, UVvNVvUUuUnN> NnUVNnuvUv = new HashMap<>();
   private String UuuuNNunN;
   private String NNVNuUvVn;
   private String vuNnuUnu;
   private String uuvvuNvuUNVV;
   private String uVvunVUNuUvu;
   private final Map<String, UUNnvUVnnnnN> NVNnnvVnvV = new HashMap<>();
   private final Map<String, UUNnvUVnnnnN> vUNuuvvnVnv = new HashMap<>();
   private final Map<String, uNuuunuNvuN> unnnNUNnVu = new HashMap<>();
   private final Map<String, Boolean> NvnnUUuVvNU = new LinkedHashMap<>(16, 0.75F, true);
   private final Map<String, uNuuunuNvuN> vVvuUVnV = new HashMap<>();
   private final Map<String, UUNnvUVnnnnN> nvuUVvuuN = new HashMap<>();
   private final UUNnvUVnnnnN CC0COO = new UUNnvUVnnnnN(0.0F);
   private float uNnNUNvuVnu;
   private float VnnnvUunNvuu;
   private float VuuUVVu;
   private float nUNnuUNnV;
   private float VuNVnvNNuNnn;
   private float uvVuuuvvVU;
   private boolean NNnvvunuVNUn;
   private boolean nVuuUnnUUVU;
   private float nUununvNvvn;
   private float NuvunVvnnN;
   private boolean vuvnnvuNVvu;
   private float NVvnvnn;
   private float vUvVUNnN;
   private nUvnuVnNUU NUuVnnuUnvu;
   private int vnuNNVvVVuN;
   private int Oco0Oococc;

   public NnnVVVUnVNuN() {
      unNvUUUUNVn.UuUVuuUu().UuUVuuUu(this.nuUnNvnuUu);
      this.uNNnnnuuuN(this.NNUUNUuVNNVn);
      this.UuuNnUvUuv.UuUVuuUu().UuUVuuUu(this.nNunUnVN, lllilIiI11l.VVuuUN());
      this.uUVvnUuNvvN();
      this.nNunUnVN = this.UuuNnUvUuv.UuUVuuUu().C00OOC00oO();
      this.uuVuUuuVVNvN = this.UuuNnUvUuv.uNNnnnuuuN();
      this.vNUvnnVnUvu.UuUVuuUu(this.NNUUNUuVNNVn);
      lllilIiI11l.UuUVuuUu().UuUVuuUu(this.nuUnNvnuUu);
      WVWvvVvwWWw.UuUVuuUu(this.nuUnNvnuUu, this.VVuuUN);
   }

   public nvvuUNnNvN UuUVuuUu() {
      return this.nuUnNvnuUu;
   }

   public nuVVnvn C00OOC00oO() {
      return this.UuuNnUvUuv;
   }

   public VnuVUNUv uUnuvNvvNU() {
      return this.NNUUNUuVNNVn;
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1) {
      if (var1 != null) {
         if (var1.VnuUuUVUnnNn()) {
            return true;
         }

         if (var1.UuUVuuUu(vnvnUnVnuunn.UnUNuUU()) > 0.035F) {
            return true;
         }
      }

      return false;
   }

   public boolean vVvUvVVuuNvV() {
      return this.nvUVNnuu.C00OOC00oO() || this.uVUuuVnNVU.UuUVuuUu() || this.UNvvunVVn;
   }

   public boolean C00OOC00oO(vNvvVnNuUVvv var1) {
      return var1 != null && (var1.VnuUuUVUnnNn() || var1.UuUVuuUu(vnvnUnVnuunn.UnUNuUU()) > 0.0015F);
   }

   public void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, int var4, int var5) {
      if (var1 != null && var2 != null && var3 != null && var4 > 0 && var5 > 0) {
         float var6 = var2.UuUVuuUu(vnvnUnVnuunn.UnUNuUU());
         if (!(var6 <= 0.0015F)) {
            this.VVuuUN(var2.unnUnUNVnN(), var2.NnuUnUNnu());
            this.nNvNUVU();
            this.vNVuvnUUnuUn = this.uVUVnuvnuVuv.UuUVuuUu(this.UvnvNVnnnnNU, Cc0cOoOcC0o.VVuuUN());
            this.NnUuNNU();
            NUunUunuNV var7 = var3.nuUnNvnuUu();
            this.NUuVnnuUnvu = var3.uNNnnnuuuN();
            this.vnuNNVvVVuN = var4;
            this.Oco0Oococc = var5;
            boolean var8 = var2.VnuUuUVUnnNn();
            float var9 = VVuuUN(var6);
            float var10 = this.UuUVuuUu(var6);
            float var11 = this.UuUVuuUu(var6, var8);
            float var12 = this.UuUVuuUu(var6, var8, var5);
            float var13 = var2.C00OOC00oO(vnvnUnVnuunn.UnUNuUU());
            float var14 = (float)(System.currentTimeMillis() % 12000L) / 12000.0F;
            this.vnvvNvUnVv.uUnuvNvvNU(this.VvVvnNUnvuvV ? 1.0F : 0.0F);
            this.OCOocoOoOO.uUnuvNvvNU(this.ccOO0COcoco0 ? 1.0F : 0.0F);
            this.o0Ooc0COOoc.uUnuvNvvNU(this.NUVvUUVuVNVv ? 1.0F : 0.0F);
            this.nvvnUnUn.uUnuvNvvNU(this.UNvvunVVn ? 1.0F : 0.0F);
            this.UnUUVuVunvVu.uUnuvNvvNU(this.VunnVNvNV ? 1.0F : 0.0F);
            var1.uUnuvNvvNU();
            this.UuUVuuUu(var1, var2, var3, var7, var4, var5, var9, var14, var6, var8);
            this.UuUVuuUu(var1, var3.uNNnnnuuuN(), var7, var4, var5, var6, var8, var13, var14);
            var1.uNNnnnuuuN(var10);
            var1.UuUVuuUu(0.0F, var12);
            var1.UuUVuuUu(var11, var4 * 0.5F, var5 * 0.5F);

            try {
               this.C00OOC00oO(var1, var2, var7, var4, var5, var14);
               this.UuUVuuUu(var1, var7, var4, var5, var9);
               this.UuUVuuUu(var1, var2, var3);
               this.UuUVuuUu(var1, var2, var7, var4, var5, var9);
               this.UuUVuuUu(var1, var3, var7);
               this.VVuuUN(var1, var2, var3, var4, var5);
               this.UuUVuuUu(var1, var2, var3, var4);
               this.UuUVuuUu(var1, var2, var3, var4, var5, var9);
               this.vNUvnnVnUvu(var1, var2, var3, var4, var5);
               this.uUnuvNvvNU(var1, var2, var3, var4, var5);
               this.vVvUvVVuuNvV(var1, var2, var3, var4, var5);
               this.uNNnnnuuuN(var1, var2, var3, var4, var5);
               this.nuUnNvnuUu(var1, var2, var3, var4, var5);
               this.C00OOC00oO(var1, var2, var3, var4, var5);
               this.uVUuuVnNVU.UuUVuuUu(var1, var3, var2, var4, var5);
               this.UuUVuuUu(var1, var3, var4, var5);
               this.nvUVNnuu.UuUVuuUu(var1, var3.uNNnnnuuuN(), var7, var2.unnUnUNVnN(), var2.NnuUnUNnu(), var4, var5);
            } finally {
               var1.vNUvnnVnUvu();
               var1.vNUvnnVnUvu();
               var1.vuuuNvNuv();
            }

            this.C00OOC00oO(var1, var3.uNNnnnuuuN(), var7, var4, var5, var6, var8, var13, var14);
            this.UuNnnVnuNNV();
            boolean var15 = var8 && var10 > 0.72F;
            if (var15 && System.currentTimeMillis() - this.UnnNNvuvvUU > 130L) {
               this.UUuUnNVNuuv();
               this.vNUvnnVnUvu.UuUVuuUu(this.NNUUNUuVNNVn);
               this.vNUvnnVnUvu.UuUVuuUu(this.UuuNnUvUuv);
               this.UnnNNvuvvUU = System.currentTimeMillis();
            }

            boolean var16 = this.UvUvUNuvNU == null && this.UuNnnVnuNNV == null && !this.nVVUuvuNnUN && !this.NVNnnvnuunNv;
            if (var15 && var16 && this.UuuNnUvUuv.uNNnnnuuuN() != this.vUvUvUNNuNvn && System.currentTimeMillis() - this.VvuUUUNNNv > 1800L) {
               this.vUvUvUNNuNvn = this.UuuNnUvUuv.uNNnnnuuuN();
               this.VvuUUUNNNv = System.currentTimeMillis();
               this.UUuUnNVNuuv();
               VUvUNNUvvNVN var17 = lllilIiI11l.UuUVuuUu().UuUVuuUu(this.NNUUNUuVNNVn, this.UuuNnUvUuv, this.VNNnnVUuvv);
               if (var17 != null) {
                  this.VNNnnVUuvv = var17.UuUVuuUu();
                  this.UuUVuuUu(var17.C00OOC00oO(), this.UuuNnUvUuv);
               }
            }
         }
      }
   }

   private void uNNnnnuuuN() {
      this.vUvUvUNNuNvn = this.UuuNnUvUuv.uNNnnnuuuN();
      this.VvuUUUNNNv = System.currentTimeMillis();
   }

   private String nuUnNvnuUu() {
      return uNNnnnuuuN(this.nNunUnVN);
   }

   private String VVuuUN() {
      String var1 = this.vNUvnnVnUvu.C00OOC00oO();
      if (var1 != null && !var1.isBlank()) {
         return "failed";
      } else {
         return this.UuuNnUvUuv.uNNnnnuuuN() != this.uuVuUuuVVNvN ? "dirty" : "saved";
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, NUunUunuNV var4, int var5, int var6, float var7, float var8, float var9, boolean var10
   ) {
      float var11 = this.C00OOC00oO(var9, var10);
      if (cCOo0cOcO.UuUVuuUu()) {
         var1.UuUVuuUu(26.0F + 22.0F * var11);
         var1.UuUVuuUu(
            0.0F, 0.0F, (float)var5, (float)var6, 0.0F, this.UuUVuuUu(var4) ? 0.42F + 0.2F * var7 + 0.22F * var11 : 0.66F + 0.16F * var7 + 0.16F * var11
         );
      }

      var1.UuUVuuUu(0.0F, 0.0F, (float)var5, (float)var6, this.UuUVuuUu(var3, var7));
   }

   private float UuUVuuUu(float var1) {
      float var2 = VVuuUN(C00OOC00oO(var1, 0.0F, 1.0F));
      return var2 * VVuuUN(C00OOC00oO((var1 - 0.006F) / 0.64F, 0.0F, 1.0F));
   }

   private float UuUVuuUu(float var1, boolean var2) {
      float var3 = VVuuUN(C00OOC00oO(var1, 0.0F, 1.0F));
      float var4 = (float)Math.sin(Math.PI * C00OOC00oO(var2 ? var1 : 1.0F - var1, 0.0F, 1.0F));
      return var2 ? 0.952F + 0.048F * var3 + 0.01F * var4 * (1.0F - var3) : 0.97F + 0.03F * var3 - 0.01F * var4;
   }

   private float UuUVuuUu(float var1, boolean var2, int var3) {
      float var4 = VVuuUN(C00OOC00oO(var1, 0.0F, 1.0F));
      float var5 = Math.max(18.0F, var3 * 0.032F);
      return var2 ? var5 * (1.0F - var4) : -var5 * (1.0F - var4);
   }

   private float C00OOC00oO(float var1, boolean var2) {
      float var3 = VVuuUN(C00OOC00oO(var1, 0.0F, 1.0F));
      return var2 ? 1.0F - var3 : (1.0F - var3) * 0.96F;
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, int var4, int var5, float var6, boolean var7, float var8, float var9) {
      float var10 = C00OOC00oO(var7 ? var6 : 1.0F - var6, 0.0F, 1.0F);
      float var11 = (float)Math.sin(Math.PI * var10);
      float var12 = this.C00OOC00oO(var6, var7);
      float var13 = C00OOC00oO(var11 * 0.52F + Math.abs(var8) * 0.35F + var12 * 0.18F, 0.0F, 1.0F);
      if (!var7) {
         float var24 = VVuuUN(1.0F - C00OOC00oO(var6, 0.0F, 1.0F));
         float var25 = C00OOC00oO(var24 * 0.42F + Math.abs(var8) * 0.1F, 0.0F, 1.0F);
         int var26 = this.UuUVuuUu(var3)
            ? NUunUunuNV.UuUVuuUu(244, 247, 255, Math.round(54.0F * var25))
            : NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(86.0F * var25));
         int var27 = NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), Math.round(14.0F * var13 * (1.0F - var24 * 0.35F)));
         var1.UuUVuuUu(0.0F, 0.0F, (float)var4, (float)var5, 0.0F, var26);
         var1.UuUVuuUu(0.0F, 0.0F, (float)var4, (float)var5, 0.0F, var27);
         float var29 = Math.max(var2.UuUVuuUu(7.0F), var5 * 0.01F);
         int var31 = this.UuUVuuUu(var3) ? NUunUunuNV.UuUVuuUu(18, 24, 40, Math.round(8.0F * var25)) : NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(18.0F * var25));
         var1.UuUVuuUu(0.0F, 0.0F, (float)var4, var29, 0.0F, var31);
         var1.UuUVuuUu(0.0F, var5 - var29, (float)var4, var29, 0.0F, var31);
      } else {
         int var14 = NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), Math.round((this.UuUVuuUu(var3) ? 34 : 46) * var13));
         int var15 = NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), Math.round((this.UuUVuuUu(var3) ? 22 : 38) * var13));
         var1.UuUVuuUu(0.0F, 0.0F, (float)var4, (float)var5, var14);
         float var16 = VVuuUN(C00OOC00oO(var7 ? var6 * 1.14F : var6, 0.0F, 1.0F));
         float var17 = (1.0F - var16) * var5 * 0.28F;
         if (var17 > 0.6F) {
            int var18 = this.UuUVuuUu(var3)
               ? NUunUunuNV.UuUVuuUu(244, 248, 255, Math.round(118.0F * (1.0F - var16)))
               : NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(150.0F * (1.0F - var16)));
            var1.UuUVuuUu(0.0F, 0.0F, (float)var4, var17, 0.0F, var18);
            var1.UuUVuuUu(0.0F, var5 - var17, (float)var4, var17, 0.0F, var18);
            var1.UuUVuuUu(
               0.0F,
               var17 - var2.UuUVuuUu(1.0F),
               (float)var4,
               var2.UuUVuuUu(1.0F),
               0.0F,
               NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), Math.round(120.0F * (1.0F - var16)))
            );
            var1.UuUVuuUu(
               0.0F, var5 - var17, (float)var4, var2.UuUVuuUu(1.0F), 0.0F, NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), Math.round(120.0F * (1.0F - var16)))
            );
         }

         float var28 = var7 ? var10 : 1.0F - var10;

         for (int var19 = 0; var19 < 5; var19++) {
            float var20 = C00OOC00oO(var28 * 1.18F + var19 * 0.17F + var9 * 0.045F);
            float var21 = -var4 * 0.28F + var20 * var4 * 1.58F;
            float var22 = var2.UuUVuuUu(42 + var19 * 9) * (0.72F + var13);
            float var23 = var13 * (0.62F - var19 * 0.075F);
            var1.UuUVuuUu(var21, var5 * (0.42F + var19 * 0.035F));
            var1.C00OOC00oO(-18.0F);
            var1.UuUVuuUu(
               -var22 * 0.5F,
               (float)(-var5),
               var22,
               var5 * 2.1F,
               var22 * 0.5F,
               NUunUunuNV.UuUVuuUu(var19 % 2 == 0 ? var3.uVunuUNVVUUV() : var3.UNnVVNvvnVvU(), Math.round(52.0F * var23))
            );
            var1.UuUVuuUu(
               -var22 * 0.08F, (float)(-var5), var22 * 0.16F, var5 * 2.1F, var22 * 0.08F, NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), Math.round(18.0F * var23))
            );
            var1.VVuuUN();
            var1.vNUvnnVnUvu();
         }

         float var30 = C00OOC00oO(0.18F + var12 * 0.62F + var13 * 0.22F, 0.0F, 1.0F);
         int var32 = this.UuUVuuUu(var3) ? NUunUunuNV.UuUVuuUu(18, 24, 40, Math.round(24.0F * var30)) : NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(78.0F * var30));
         float var33 = Math.max(var2.UuUVuuUu(42.0F), var4 * 0.035F);
         float var34 = Math.max(var2.UuUVuuUu(36.0F), var5 * 0.045F);
         var1.UuUVuuUu(0.0F, 0.0F, (float)var4, var34, 0.0F, var32);
         var1.UuUVuuUu(0.0F, var5 - var34, (float)var4, var34, 0.0F, var32);
         var1.UuUVuuUu(0.0F, 0.0F, var33, (float)var5, 0.0F, var32);
         var1.UuUVuuUu(var4 - var33, 0.0F, var33, (float)var5, 0.0F, var32);
         var1.UuUVuuUu(0.0F, 0.0F, (float)var4, (float)var5, var15);
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, int var4, int var5, float var6, boolean var7, float var8, float var9) {
      if (var7) {
         float var10 = C00OOC00oO(var7 ? var6 : 1.0F - var6, 0.0F, 1.0F);
         float var11 = (float)Math.sin(Math.PI * var10);
         var11 = C00OOC00oO(var11 * 0.34F + Math.abs(var8) * 0.22F, 0.0F, 1.0F);
         if (!(var11 <= 0.015F)) {
            float var12 = var5 * C00OOC00oO(var10 * 0.85F + var9 * 0.18F);
            var1.UuUVuuUu(
               0.0F,
               var12 - var2.UuUVuuUu(1.2F),
               (float)var4,
               var2.UuUVuuUu(2.4F),
               var2.UuUVuuUu(1.2F),
               NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), Math.round((this.UuUVuuUu(var3) ? 34 : 48) * var11))
            );
            var1.UuUVuuUu(
               0.0F,
               var12 + var2.UuUVuuUu(3.5F),
               (float)var4,
               var2.UuUVuuUu(1.0F),
               var2.UuUVuuUu(0.5F),
               NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), Math.round(78.0F * var11))
            );
            float var13 = var4 * (0.18F + 0.16F * var11);
            float var14 = var4 * C00OOC00oO(var10 * 1.25F + 0.18F);
            var1.UuUVuuUu(var14, var5 * 0.5F);
            var1.C00OOC00oO(12.0F);
            var1.UuUVuuUu(
               -var13 * 0.5F,
               -var5 * 0.62F,
               var13,
               var5 * 1.24F,
               var13 * 0.18F,
               var2.UuUVuuUu(34.0F) * var11,
               var2.UuUVuuUu(4.0F),
               NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), Math.round(58.0F * var11))
            );
            var1.UuUVuuUu(-var13 * 0.5F, -var5 * 0.62F, var13, var5 * 1.24F, var13 * 0.18F, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), Math.round(18.0F * var11)));
            var1.VVuuUN();
            var1.vNUvnnVnUvu();
         }
      }
   }

   private int UuUVuuUu(nUVuuNUVnV var1, float var2) {
      NUunUunuNV var3 = var1.nuUnNvnuUu();
      return this.UuUVuuUu(var3)
         ? NUunUunuNV.UuUVuuUu(
            NUunUunuNV.UuUVuuUu(246, 248, 252, Math.round(214.0F * var2)), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), Math.round(56.0F * var2)), 0.08F
         )
         : NUunUunuNV.UuUVuuUu(2, 4, 8, Math.round(240.0F * var2));
   }

   private int UuUVuuUu(NUunUunuNV var1, int var2) {
      return this.UuUVuuUu(var1)
         ? NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, Math.min(255, var2 + 8)), NUunUunuNV.UuUVuuUu(var1.uVunuUNVVUUV(), var2), 0.038F)
         : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(8, 10, 16, var2), NUunUunuNV.UuUVuuUu(var1.uVunuUNVVUUV(), var2), 0.026F);
   }

   private int C00OOC00oO(NUunUunuNV var1, int var2) {
      return this.UuUVuuUu(var1)
         ? NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(248, 250, 254, Math.min(255, var2 + 6)), NUunUunuNV.UuUVuuUu(var1.UNnVVNvvnVvU(), var2), 0.034F)
         : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(6, 8, 13, var2), NUunUunuNV.UuUVuuUu(var1.UNnVVNvvnVvU(), var2), 0.022F);
   }

   private int uUnuvNvvNU(NUunUunuNV var1, int var2) {
      return this.UuUVuuUu(var1) ? NUunUunuNV.UuUVuuUu(20, 27, 42, Math.round(var2 * 0.36F)) : NUunUunuNV.UuUVuuUu(0, 0, 0, var2);
   }

   private boolean UuUVuuUu(NUunUunuNV var1) {
      return switch (this.UvNNVUVNVuvV) {
         case AUTO -> var1 != null && var1.uNnUnnuNUnNu();
         case DARK -> false;
         case LIGHT -> true;
      };
   }

   private List<NnnVVVUnVNuN.VvunVVUvUNnv> vNUvnnVnUvu() {
      ArrayList var1 = new ArrayList();
      if (this.unnUnUNVnN != 2) {
         for (VUvUNNUvvNVN var3 : lllilIiI11l.UuUVuuUu().C00OOC00oO()) {
            var1.add(new NnnVVVUnVNuN.VvunVVUvUNnv(var3, -1));
         }
      }

      if (this.unnUnUNVnN != 1) {
         for (int var4 = 0; var4 < nuvUVvnNUN.UuUVuuUu.size(); var4++) {
            var1.add(new NnnVVVUnVNuN.VvunVVUvUNnv(null, var4));
         }
      }

      return var1;
   }

   private void UuUVuuUu(nUvnuVnNUU var1, vnvNNVNU var2, float var3, float var4) {
      float var5 = this.vVvUvVVuuNvV(var1);
      vnvNNVNU var6 = this.uUnuvNvvNU(var2, var1);
      if (var6.contains(var3, var4)) {
         List var7 = this.vNUvnnVnUvu();
         int var8 = (int)Math.floor((var4 - var6.y() + this.NvUVUvVVnUu) / var5);
         if (var8 >= 0 && var8 < var7.size()) {
            NnnVVVUnVNuN.VvunVVUvUNnv var9 = (NnnVVVUnVNuN.VvunVVUvUNnv)var7.get(var8);
            float var10 = var6.y() + var8 * var5 - this.NvUVUvVVnUu;
            if (var9.presetIndex() >= 0) {
               if (this.uUnuvNvvNU(var2, var1, var10).contains(var3, var4)) {
                  this.NnunUUnU = var9.presetIndex();
                  this.C00OOC00oO(false);
               } else if (this.vVvUvVVuuNvV(var2, var1, var10).contains(var3, var4)) {
                  this.NnunUUnU = var9.presetIndex();
                  this.C00OOC00oO(true);
               } else {
                  this.NnunUUnU = var9.presetIndex();
                  this.vNVuvnUUnuUn(nuvUVvnNUN.UuUVuuUu.get(var9.presetIndex()).UuUVuuUu);
               }
            } else {
               VUvUNNUvvNVN var11 = var9.slot();
               VnuVUNUv var12 = VnuVUNUv.UuUVuuUu(var11.uUnuvNvvNU());
               boolean var13 = var11.UuUVuuUu().equals(lllilIiI11l.UuUVuuUu().C00OOC00oO(var12));
               if (this.C00OOC00oO(var2, var1, var10).contains(var3, var4)) {
                  if (var13) {
                     uNNnUu.UuUVuuUu().UuUVuuUu(var12);
                     uVvVnUU.UuUVuuUu().uUnuvNvvNU(var12);
                     lllilIiI11l.UuUVuuUu().UuUVuuUu(var12, null);
                  }

                  uNNnUu.UuUVuuUu().UuUVuuUu(var11.C00OOC00oO());
                  uVvVnUU.UuUVuuUu().uUnuvNvvNU(var11.C00OOC00oO());
                  lllilIiI11l.UuUVuuUu().C00OOC00oO(var11.UuUVuuUu());
                  if (var11.UuUVuuUu().equals(this.VNNnnVUuvv)) {
                     this.VNNnnVUuvv = null;
                  }

                  this.vNVuvnUUnuUn("slot deleted");
               } else if (this.UuUVuuUu(var2, var1, var10).contains(var3, var4)) {
                  this.UuUVuuUu(var11);
               } else {
                  nuVVnvn var14 = lllilIiI11l.UuUVuuUu().UuUVuuUu(var11.UuUVuuUu(), this.nuUnNvnuUu);
                  if (var14 != null) {
                     this.UUVNuUNUvUnV();
                     this.UuuNnUvUuv = var14;
                     this.uUVvnUuNvvN();
                     this.NNUUNUuVNNVn = var12 == VnuVUNUv.PREVIEW_ONLY ? VnuVUNUv.HUD : var12;
                     this.uNNnnnuuuN(this.NNUUNUuVNNVn);
                     this.vNUvnnVnUvu.UuUVuuUu(this.NNUUNUuVNNVn);
                     this.nNunUnVN = this.UuuNnUvUuv.UuUVuuUu().C00OOC00oO().isBlank() ? var11.C00OOC00oO() : this.UuuNnUvUuv.UuUVuuUu().C00OOC00oO();
                     this.VNNnnVUuvv = var11.UuUVuuUu();
                     this.uVUuuVnNVU();
                     this.vNUvnnVnUvu.UuUVuuUu(this.UuuNnUvUuv);
                     this.UuUVuuUu(var11.C00OOC00oO(), this.UuuNnUvUuv);
                     this.uuVuUuuVVNvN = this.UuuNnUvUuv.uNNnnnuuuN();
                     this.uNNnnnuuuN();
                     this.vNVuvnUUnuUn("loaded " + var11.C00OOC00oO());
                  }
               }
            }
         }
      }
   }

   private boolean UuUVuuUu(nUvnuVnNUU var1, int var2, int var3, float var4, float var5, int var6) {
      vnvNNVNU var7 = this.uUnuvNvvNU(var1, var2, var3);
      if (!this.VunnVNvNV) {
         return false;
      } else if (var6 != 0) {
         return var7.contains(var4, var5);
      } else if (!var7.contains(var4, var5)) {
         this.VunnVNvNV = false;
         return true;
      } else {
         vnvNNVNU var8 = this.vVvUvVVuuNvV(var7, var1);
         if (var8.contains(var4, var5)) {
            this.VunnVNvNV = false;
            return true;
         } else {
            for (int var9 = 0; var9 < uUnuvNvvNU.length; var9++) {
               if (this.C00OOC00oO(var7, var1, var9).contains(var4, var5)) {
                  this.unnUnUNVnN = var9;
                  this.NvUVUvVVnUu = 0.0F;
                  return true;
               }
            }

            this.UuUVuuUu(var1, var7, var4, var5);
            return true;
         }
      }
   }

   private boolean UuUVuuUu(nUvnuVnNUU var1, int var2, int var3, float var4, float var5, double var6) {
      if (!this.VunnVNvNV) {
         return false;
      } else {
         vnvNNVNU var8 = this.uUnuvNvvNU(var1, var2, var3);
         if (!var8.contains(var4, var5)) {
            return false;
         } else {
            vnvNNVNU var9 = this.uUnuvNvvNU(var8, var1);
            float var10 = this.vNUvnnVnUvu().size() * this.vVvUvVVuuNvV(var1);
            this.NvUVUvVVnUu = C00OOC00oO(this.NvUVUvVVnUu - (float)var6 * var1.UuUVuuUu(46.0F), 0.0F, Math.max(0.0F, var10 - var9.h()));
            return true;
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, vnvNNVNU var3, int var4) {
      float var5 = var3.x() + var3.w() * 0.5F;
      float var6 = var3.y() + var3.h() * 0.5F;
      float var7 = var2.UuUVuuUu(9.0F);
      float var8 = var2.UuUVuuUu(9.0F);
      var1.UuUVuuUu(var5 - var7 * 0.5F, var6 - var8 * 0.32F, var7, var8 * 0.82F, var2.UuUVuuUu(1.6F), var4, 0.8F);
      var1.UuUVuuUu(var5 - var7 * 0.62F, var6 - var8 * 0.56F, var7 * 1.24F, var2.UuUVuuUu(1.3F), var2.UuUVuuUu(0.8F), var4);
      var1.UuUVuuUu(var5 - var7 * 0.22F, var6 - var8 * 0.78F, var7 * 0.44F, var2.UuUVuuUu(1.4F), var2.UuUVuuUu(0.8F), var4);
      var1.UuUVuuUu(var5 - var7 * 0.18F, var6 - var8 * 0.12F, var2.UuUVuuUu(1.0F), var8 * 0.45F, var2.UuUVuuUu(0.5F), NUunUunuNV.UuUVuuUu(var4, 170));
      var1.UuUVuuUu(var5 + var7 * 0.18F, var6 - var8 * 0.12F, var2.UuUVuuUu(1.0F), var8 * 0.45F, var2.UuUVuuUu(0.5F), NUunUunuNV.UuUVuuUu(var4, 170));
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, float var3, float var4, int var5, boolean var6) {
      if (var6) {
         var1.C00OOC00oO(var3, var4, var2.UuUVuuUu(4.2F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var5, 90));
         var1.C00OOC00oO(var3, var4, var2.UuUVuuUu(2.2F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var5, 240));
      } else {
         var1.UuUVuuUu(
            var3 - var2.UuUVuuUu(2.4F),
            var4 - var2.UuUVuuUu(2.4F),
            var2.UuUVuuUu(4.8F),
            var2.UuUVuuUu(4.8F),
            var2.UuUVuuUu(1.4F),
            NUunUunuNV.UuUVuuUu(var5, 116)
         );
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, float var5, float var6, float var7) {
      if (!(var5 <= var4.h() + 1.0F)) {
         float var8 = var4.x() + var4.w() - var2.UuUVuuUu(4.0F);
         float var9 = var4.y() + var2.UuUVuuUu(3.0F);
         float var10 = var4.h() - var2.UuUVuuUu(6.0F);
         float var11 = Math.max(var2.UuUVuuUu(36.0F), var10 * var4.h() / var5);
         float var12 = Math.max(1.0F, var5 - var4.h());
         float var13 = var9 + (var10 - var11) * (this.NvUVUvVVnUu / var12);
         float var14 = uVNuNVvuvNNU.UuUVuuUu(
            7102L,
            var8 - var2.UuUVuuUu(3.0F),
            var9,
            var2.UuUVuuUu(9.0F),
            var10,
            var13,
            var11,
            var2.UuUVuuUu(6.0F),
            var6,
            var7,
            var2x -> this.NvUVUvVVnUu = C00OOC00oO(var2x, 0.0F, 1.0F) * var12
         );
         float var15 = var2.UuUVuuUu(2.0F) + var2.UuUVuuUu(2.0F) * var14;
         var1.UuUVuuUu(var8, var9, var2.UuUVuuUu(2.0F), var10, var2.UuUVuuUu(1.0F), var3.uVUuuVnNVU());
         var1.UuUVuuUu(
            var8 + var2.UuUVuuUu(2.0F) - var15,
            var13,
            var15,
            var11,
            var2.UuUVuuUu(1.5F),
            NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), (int)(150.0F + 80.0F * var14))
         );
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void C00OOC00oO(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, int var4, int var5) {
      float var6 = this.UnUUVuVunvVu.UuUVuuUu();
      if (this.VunnVNvNV || !(var6 <= 0.01F)) {
         this.UvnvNVnnnnNU();
         nUvnuVnNUU var7 = var3.uNNnnnuuuN();
         NUunUunuNV var8 = var3.nuUnNvnuUu();
         vnvNNVNU var9 = this.uUnuvNvvNU(var7, var4, var5);
         var9 = new vnvNNVNU(var9.x(), var9.y() - var7.UuUVuuUu(10.0F) * (1.0F - var6), var9.w(), var9.h());
         float var10 = var7.UuUVuuUu(12.0F);
         var1.uNNnnnuuuN(var6);
         boolean var24 = false /* VF: Semaphore variable */;

         label203: {
            try {
               var24 = true;
               var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, var7.UuUVuuUu(22.0F), var7.UuUVuuUu(2.0F), this.uUnuvNvvNU(var8, 148));
               var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, this.C00OOC00oO(var8, 232));
               var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 108), 0.8F);
               var1.UuUVuuUu(
                  var9.x() + var7.UuUVuuUu(1.0F),
                  var9.y() + var7.UuUVuuUu(1.0F),
                  var9.w() - var7.UuUVuuUu(2.0F),
                  var7.UuUVuuUu(1.0F),
                  var7.UuUVuuUu(1.0F),
                  NUunUunuNV.UuUVuuUu(var8.NVNnnvnuunNv(), this.UuUVuuUu(var8) ? 58 : 18)
               );
               nunvNNUnvU.UuUVuuUu(
                  var1,
                  var7,
                  vNvnnVvvVUu.vVvUvVVuuNvV,
                  var9.x() + var7.UuUVuuUu(12.0F),
                  var9.y() + var7.UuUVuuUu(12.0F),
                  12.0F,
                  "Library",
                  this.C00OOC00oO(var8)
               );
               nunvNNUnvU.UuUVuuUu(
                  var1,
                  var7,
                  vNvnnVvvVUu.UuUVuuUu,
                  var9.x() + var7.UuUVuuUu(12.0F),
                  var9.y() + var7.UuUVuuUu(27.0F),
                  8.0F,
                  "your shaders and presets / preview, bind, apply",
                  NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 196)
               );
               vnvNNVNU var11 = this.vVvUvVVuuNvV(var9, var7);
               boolean var12 = var11.contains(var2.unnUnUNVnN(), var2.NnuUnUNnu());
               var1.UuUVuuUu(
                  var11.x(),
                  var11.y(),
                  var11.w(),
                  var11.h(),
                  var7.UuUVuuUu(7.0F),
                  NUunUunuNV.UuUVuuUu(var8.uVUuuVnNVU(), NUunUunuNV.UuUVuuUu(220, 80, 96, 112), var12 ? 1.0F : 0.0F)
               );
               var1.UuUVuuUu(
                  var11.x(),
                  var11.y(),
                  var11.w(),
                  var11.h(),
                  var7.UuUVuuUu(7.0F),
                  NUunUunuNV.UuUVuuUu(var12 ? -37756 : var8.nvUVNnuu(), var12 ? 210 : 64),
                  0.65F
               );
               this.UuUVuuUu(var1, var7, var8, var11.x() + var11.w() * 0.5F, var11.y() + var11.h() * 0.5F, 4, var12 ? 1.0F : 0.35F);

               for (int var13 = 0; var13 < uUnuvNvvNU.length; var13++) {
                  this.UuUVuuUu(
                     var1, var7, var8, this.C00OOC00oO(var9, var7, var13), uUnuvNvvNU[var13], this.unnUnUNVnN == var13, var2.unnUnUNVnN(), var2.NnuUnUNnu()
                  );
               }

               List var30 = this.vNUvnnVnUvu();
               vnvNNVNU var14 = this.uUnuvNvvNU(var9, var7);
               if (var30.isEmpty()) {
                  var1.UuUVuuUu(
                     var14.x(), var14.y(), var14.w(), var14.h(), var7.UuUVuuUu(9.0F), NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var8) ? 38 : 8)
                  );
                  var1.UuUVuuUu(var14.x(), var14.y(), var14.w(), var14.h(), var7.UuUVuuUu(9.0F), var8.nvUVNnuu(), 0.65F);
                  nunvNNUnvU.UuUVuuUu(
                     var1,
                     var7,
                     vNvnnVvvVUu.vVvUvVVuuNvV,
                     var14.x() + var7.UuUVuuUu(12.0F),
                     var14.y() + var7.UuUVuuUu(18.0F),
                     10.0F,
                     "No saved shaders",
                     this.C00OOC00oO(var8)
                  );
                  nunvNNUnvU.UuUVuuUu(
                     var1,
                     var7,
                     vNvnnVvvVUu.UuUVuuUu,
                     var14.x() + var7.UuUVuuUu(12.0F),
                     var14.y() + var7.UuUVuuUu(34.0F),
                     8.0F,
                     "Ctrl+S or File / Save As stores the current graph here.",
                     this.uUnuvNvvNU(var8)
                  );
                  var24 = false;
                  break label203;
               }

               float var15 = this.vVvUvVVuuNvV(var7);
               float var16 = var30.size() * var15;
               this.NvUVUvVVnUu = C00OOC00oO(this.NvUVUvVVnUu, 0.0F, Math.max(0.0F, var16 - var14.h()));
               var1.uUnuvNvvNU();
               var1.UuUVuuUu(var14.x(), var14.y(), var14.w(), var14.h(), var7.UuUVuuUu(9.0F), var7.UuUVuuUu(9.0F), var7.UuUVuuUu(9.0F), var7.UuUVuuUu(9.0F));

               try {
                  for (int var17 = 0; var17 < var30.size(); var17++) {
                     float var18 = var14.y() + var17 * var15 - this.NvUVUvVVnUu;
                     if (!(var18 > var14.y() + var14.h()) && !(var18 + var15 < var14.y())) {
                        NnnVVVUnVNuN.VvunVVUvUNnv var19 = (NnnVVVUnVNuN.VvunVVUvUNnv)var30.get(var17);
                        if (var19.presetIndex() >= 0) {
                           this.UuUVuuUu(var1, var2, var3, var7, var8, var9, var14, var19.presetIndex(), var18, var15, var4, var5, var6);
                        } else {
                           this.UuUVuuUu(var1, var2, var3, var7, var8, var9, var14, var19.slot(), var18, var15, var6);
                        }
                     }
                  }
               } finally {
                  var1.uUnuvNvvNU();
                  var1.nuUnNvnuUu();
               }

               this.UuUVuuUu(var1, var7, var8, var14, var16, var2.unnUnUNVnN(), var2.NnuUnUNnu());
               var24 = false;
            } finally {
               if (var24) {
                  var1.vuuuNvNuv();
               }
            }

            var1.vuuuNvNuv();
            return;
         }

         var1.vuuuNvNuv();
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      vNvvVnNuUVvv var2,
      nUVuuNUVnV var3,
      nUvnuVnNUU var4,
      NUunUunuNV var5,
      vnvNNVNU var6,
      vnvNNVNU var7,
      VUvUNNUvvNVN var8,
      float var9,
      float var10,
      float var11
   ) {
      lllilIiI11l var12 = lllilIiI11l.UuUVuuUu();
      boolean var13 = var2.unnUnUNVnN() >= var7.x()
         && var2.unnUnUNVnN() <= var7.x() + var7.w()
         && var2.NnuUnUNnu() >= var9
         && var2.NnuUnUNnu() <= var9 + var10 - var4.UuUVuuUu(6.0F);
      boolean var14 = var8.UuUVuuUu().equals(this.VNNnnVUuvv);
      VnuVUNUv var15 = VnuVUNUv.UuUVuuUu(var8.uUnuvNvvNU());
      boolean var16 = var8.UuUVuuUu().equals(var12.C00OOC00oO(var15));
      vnvNNVNU var17 = new vnvNNVNU(var7.x(), var9, var7.w() - var4.UuUVuuUu(4.0F), var10 - var4.UuUVuuUu(6.0F));
      float var18 = Math.max(var13 ? 0.75F : 0.0F, var14 ? 0.58F : 0.0F);
      var1.UuUVuuUu(
         var17.x(),
         var17.y(),
         var17.w(),
         var17.h(),
         var4.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var5) ? 46 : 10), NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), 72), var18)
      );
      var1.UuUVuuUu(
         var17.x(),
         var17.y(),
         var17.w(),
         var17.h(),
         var4.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(
            var5.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var16 ? var5.UNnVVNvvnVvU() : var5.uVunuUNVVUUV(), 126), Math.max(var18, var16 ? 0.38F : 0.0F)
         ),
         0.65F
      );
      vnvNNVNU var19 = this.uNNnnnuuuN(var17, var4);
      this.UuUVuuUu(var1, var2, var3, var8, var19, var11);
      this.UuUVuuUu(var1, var4, var17.x() + var4.UuUVuuUu(12.0F), var17.y() + var17.h() * 0.5F, var16 ? var5.UNnVVNvvnVvU() : var5.uVunuUNVVUUV(), var14);
      float var20 = var19.x() + var19.w() + var4.UuUVuuUu(10.0F);
      vnvNNVNU var21 = this.UuUVuuUu(var6, var4, var9);
      vnvNNVNU var22 = this.C00OOC00oO(var6, var4, var9);
      float var23 = Math.max(var4.UuUVuuUu(72.0F), var21.x() - var20 - var4.UuUVuuUu(10.0F));
      nunvNNUnvU.UuUVuuUu(
         var1,
         var4,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var20,
         var17.y() + var4.UuUVuuUu(8.0F),
         10.0F,
         nunvNNUnvU.UuUVuuUu(var4, vNvnnVvvVUu.vVvUvVVuuNvV, var8.C00OOC00oO(), 10.0F, var23),
         this.C00OOC00oO(var5)
      );
      String var24 = (var15 == null ? "Unknown" : var15.C00OOC00oO()) + (var16 ? " / bound" : "") + " / " + this.UuUVuuUu(var8.nvUVNnuu());
      nunvNNUnvU.UuUVuuUu(
         var1,
         var4,
         vNvnnVvvVUu.UuUVuuUu,
         var20,
         var17.y() + var4.UuUVuuUu(25.0F),
         8.0F,
         nunvNNUnvU.UuUVuuUu(var4, vNvnnVvvVUu.UuUVuuUu, var24, 8.0F, var23),
         NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), 200)
      );
      String var25 = var8.VVuuUN() + " / " + uNNnUu.UuUVuuUu().vNUvnnVnUvu(var8.C00OOC00oO()).size() + " uniforms";
      nunvNNUnvU.UuUVuuUu(
         var1,
         var4,
         vNvnnVvvVUu.UuUVuuUu,
         var20,
         var17.y() + var4.UuUVuuUu(40.0F),
         8.0F,
         nunvNNUnvU.UuUVuuUu(var4, vNvnnVvvVUu.UuUVuuUu, var25, 8.0F, var23),
         NUunUunuNV.UuUVuuUu(var5.UNnVVNvvnVvU(), 176)
      );
      boolean var26 = var21.contains(var2.unnUnUNVnN(), var2.NnuUnUNnu());
      this.UuUVuuUu(var1, var4, var5, var21, var16 ? "Off" : "Bind", var26, var16);
      boolean var27 = var22.contains(var2.unnUnUNVnN(), var2.NnuUnUNnu());
      var1.UuUVuuUu(
         var22.x(),
         var22.y(),
         var22.w(),
         var22.h(),
         var4.UuUVuuUu(7.0F),
         NUunUunuNV.UuUVuuUu(var5.uVUuuVnNVU(), NUunUunuNV.UuUVuuUu(230, 82, 96, 128), var27 ? 1.0F : 0.0F)
      );
      var1.UuUVuuUu(
         var22.x(), var22.y(), var22.w(), var22.h(), var4.UuUVuuUu(7.0F), NUunUunuNV.UuUVuuUu(var27 ? -37756 : var5.nvUVNnuu(), var27 ? 220 : 70), 0.65F
      );
      this.UuUVuuUu(var1, var4, var22, var27 ? NUunUunuNV.UuUVuuUu(255, 214, 220, 242) : NUunUunuNV.UuUVuuUu(var5.NVNnnvnuunNv(), 148));
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      vNvvVnNuUVvv var2,
      nUVuuNUVnV var3,
      nUvnuVnNUU var4,
      NUunUunuNV var5,
      vnvNNVNU var6,
      vnvNNVNU var7,
      int var8,
      float var9,
      float var10,
      int var11,
      int var12,
      float var13
   ) {
      nuvUVvnNUN.NVnVnNnN var14 = nuvUVvnNUN.UuUVuuUu.get(var8);
      boolean var15 = var2.unnUnUNVnN() >= var7.x()
         && var2.unnUnUNVnN() <= var7.x() + var7.w()
         && var2.NnuUnUNnu() >= var9
         && var2.NnuUnUNnu() <= var9 + var10 - var4.UuUVuuUu(6.0F);
      boolean var16 = var8 == this.NnunUUnU;
      vnvNNVNU var17 = new vnvNNVNU(var7.x(), var9, var7.w() - var4.UuUVuuUu(4.0F), var10 - var4.UuUVuuUu(6.0F));
      float var18 = Math.max(var15 ? 0.62F : 0.0F, var16 ? 0.5F : 0.0F);
      var1.UuUVuuUu(
         var17.x(),
         var17.y(),
         var17.w(),
         var17.h(),
         var4.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var5) ? 46 : 10), NUunUunuNV.UuUVuuUu(var5.UNnVVNvvnVvU(), 66), var18)
      );
      var1.UuUVuuUu(
         var17.x(),
         var17.y(),
         var17.w(),
         var17.h(),
         var4.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(
            var5.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var16 ? var5.uVunuUNVVUUV() : var5.UNnVVNvvnVvU(), var16 ? 148 : 112), Math.max(var18, var16 ? 0.6F : 0.0F)
         ),
         var16 ? 0.85F : 0.65F
      );
      if (var16) {
         var1.UuUVuuUu(
            var17.x(),
            var17.y() + var4.UuUVuuUu(9.0F),
            var4.UuUVuuUu(2.4F),
            var17.h() - var4.UuUVuuUu(18.0F),
            var4.UuUVuuUu(1.2F),
            NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), 230)
         );
      }

      vnvNNVNU var19 = this.uNNnnnuuuN(var17, var4);
      uNvUNnnVVVnU.UuUVuuUu(
         var1,
         var3,
         this.nvuVvuNnNUnv.get(var8),
         "__preset_thumb_" + var8,
         var19.x(),
         var19.y(),
         var19.w(),
         var19.h(),
         var11,
         var12,
         var2.unnUnUNVnN(),
         var2.NnuUnUNnu(),
         var13
      );
      var1.UuUVuuUu(var19.x(), var19.y(), var19.w(), var19.h(), var4.UuUVuuUu(6.0F), NUunUunuNV.UuUVuuUu(var5.UNnVVNvvnVvU(), Math.round(84.0F * var13)), 0.55F);
      this.UuUVuuUu(var1, var4, var17.x() + var4.UuUVuuUu(12.0F), var17.y() + var17.h() * 0.5F, var5.UNnVVNvvnVvU(), var16);
      float var20 = var19.x() + var19.w() + var4.UuUVuuUu(10.0F);
      vnvNNVNU var21 = this.uUnuvNvvNU(var6, var4, var9);
      float var22 = Math.max(var4.UuUVuuUu(72.0F), var21.x() - var20 - var4.UuUVuuUu(10.0F));
      nunvNNUnvU.UuUVuuUu(
         var1,
         var4,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var20,
         var17.y() + var4.UuUVuuUu(8.0F),
         10.0F,
         nunvNNUnvU.UuUVuuUu(var4, vNvnnVvvVUu.vVvUvVVuuNvV, var14.UuUVuuUu, 10.0F, var22),
         this.C00OOC00oO(var5)
      );
      String var23 = var14.uUnuvNvvNU.C00OOC00oO();
      float var24 = nunvNNUnvU.UuUVuuUu(var4, vNvnnVvvVUu.UuUVuuUu, var23, 7.0F) + var4.UuUVuuUu(12.0F);
      float var25 = var17.y() + var4.UuUVuuUu(23.0F);
      var1.UuUVuuUu(var20, var25, var24, var4.UuUVuuUu(13.0F), var4.UuUVuuUu(6.5F), NUunUunuNV.UuUVuuUu(var5.UNnVVNvvnVvU(), 44));
      nunvNNUnvU.UuUVuuUu(
         var1, var4, vNvnnVvvVUu.UuUVuuUu, var20 + var4.UuUVuuUu(6.0F), var25, var4.UuUVuuUu(13.0F), 7.0F, var23, NUunUunuNV.UuUVuuUu(var5.UNnVVNvvnVvU(), 235)
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var4,
         vNvnnVvvVUu.UuUVuuUu,
         var20 + var24 + var4.UuUVuuUu(8.0F),
         var25 + var4.UuUVuuUu(3.0F),
         7.5F,
         nunvNNUnvU.UuUVuuUu(var4, vNvnnVvvVUu.UuUVuuUu, "preset / " + var14.vVvUvVVuuNvV, 7.5F, Math.max(1.0F, var22 - var24 - var4.UuUVuuUu(8.0F))),
         NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), 186)
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var4,
         vNvnnVvvVUu.UuUVuuUu,
         var20,
         var17.y() + var4.UuUVuuUu(40.0F),
         8.0F,
         nunvNNUnvU.UuUVuuUu(var4, vNvnnVvvVUu.UuUVuuUu, var14.C00OOC00oO, 8.0F, var22),
         this.uUnuvNvvNU(var5)
      );
      this.UuUVuuUu(var1, var4, var5, var21, "Use", var2.unnUnUNVnN(), var2.NnuUnUNnu(), true);
      this.UuUVuuUu(var1, var4, var5, this.vVvUvVVuuNvV(var6, var4, var9), "Merge", var2.unnUnUNVnN(), var2.NnuUnUNnu(), false);
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, VUvUNNUvvNVN var4, vnvNNVNU var5, float var6) {
      nUvnuVnNUU var7 = var3.uNNnnnuuuN();
      NUunUunuNV var8 = var3.nuUnNvnuUu();
      float var9 = var7.UuUVuuUu(6.0F);
      var1.UuUVuuUu(var5.x(), var5.y(), var5.w(), var5.h(), var9, NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var8) ? 48 : 10));
      boolean var10 = false;
      String var11 = var4 == null ? "" : var4.C00OOC00oO();
      if (!var11.isBlank() && uNNnUu.UuUVuuUu().uNNnnnuuuN(var11)) {
         nuVVnvn var12 = uNNnUu.UuUVuuUu().uUnuvNvvNU(var11);
         VnuVUNUv var13 = VnuVUNUv.UuUVuuUu(var4.uUnuvNvvNU());
         if (var13 == VnuVUNUv.PREVIEW_ONLY) {
            var13 = this.NNUUNUuVNNVn;
         }

         if (var12 != null) {
            uNvUNnnVVVnU.UuUVuuUu(
               var1,
               var3,
               var11,
               var13,
               var12,
               var5.x(),
               var5.y(),
               var5.w(),
               var5.h(),
               this.VVnVNnunVvu(),
               this.unNNVVNnvvV(),
               var2.unnUnUNVnN(),
               var2.NnuUnUNnu(),
               var6
            );
            var10 = true;
         }
      }

      if (!var10) {
         var1.C00OOC00oO(
            var5.x(),
            var5.y(),
            var5.w(),
            var5.h(),
            var9,
            NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), Math.round(70.0F * var6)),
            NUunUunuNV.UuUVuuUu(var8.UNnVVNvvnVvU(), Math.round(42.0F * var6))
         );
      }

      var1.UuUVuuUu(var5.x(), var5.y(), var5.w(), var5.h(), var9, NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), Math.round(84.0F * var6)), 0.55F);
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, String var5, boolean var6, boolean var7) {
      float var8 = Math.max(var7 ? 0.62F : 0.0F, var6 ? 1.0F : 0.0F);
      var1.UuUVuuUu(
         var4.x(),
         var4.y(),
         var4.w(),
         var4.h(),
         var2.UuUVuuUu(7.0F),
         NUunUunuNV.UuUVuuUu(var3.uVUuuVnNVU(), NUunUunuNV.UuUVuuUu(var7 ? var3.UNnVVNvvnVvU() : var3.uVunuUNVVUUV(), 84), var8)
      );
      var1.UuUVuuUu(
         var4.x(),
         var4.y(),
         var4.w(),
         var4.h(),
         var2.UuUVuuUu(7.0F),
         NUunUunuNV.UuUVuuUu(var3.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var7 ? var3.UNnVVNvvnVvU() : var3.uVunuUNVVUUV(), 152), var8),
         0.62F
      );
      float var9 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var5, 9.0F);
      float var10 = var4.x() + (var4.w() - var9 - var2.UuUVuuUu(10.0F)) * 0.5F;
      int var11 = NUunUunuNV.UuUVuuUu(var7 ? var3.UNnVVNvvnVvU() : var3.uVunuUNVVUUV(), Math.round(160.0F + 80.0F * var8));
      float var12 = var4.y() + var4.h() * 0.5F;
      if (var7) {
         var1.C00OOC00oO(var10 + var2.UuUVuuUu(3.0F), var12, var2.UuUVuuUu(3.0F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var11, 88));
         var1.C00OOC00oO(var10 + var2.UuUVuuUu(3.0F), var12, var2.UuUVuuUu(1.6F), 0.0F, 1.0F, var11);
      } else {
         var1.UuUVuuUu(var10 + var2.UuUVuuUu(3.0F), var12, var2.UuUVuuUu(2.6F), 0.0F, 1.0F, 0.9F, var11);
      }

      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var10 + var2.UuUVuuUu(10.0F),
         var4.y(),
         var4.h(),
         9.0F,
         var5,
         NUunUunuNV.UuUVuuUu(var3.uVUVnuvnuVuv(), var3.NVNnnvnuunNv(), 0.52F + var8 * 0.48F)
      );
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, nUVuuNUVnV var2, float var3, float var4, int var5, int var6, int var7) {
      if (var1 != null && var2 != null && this.UuUVuuUu(var1)) {
         this.UUuUnNVNuuv = var3;
         this.NVuNUuVnVUN = var4;
         nUvnuVnNUU var8 = var2.uNNnnnuuuN();
         if (this.nvUVNnuu.C00OOC00oO()) {
            boolean var17 = this.nvUVNnuu.UuUVuuUu(var3, var4, var5, var8, var6, var7);
            this.UuNnnVnuNNV();
            return var17;
         } else {
            if (this.uVUuuVnNVU.UuUVuuUu()) {
               vnvNNVNU var9 = this.uVUuuVnNVU.UuUVuuUu(var8, var6, var7);
               if (var9.contains(var3, var4)) {
                  if (var5 == 0) {
                     uuUnNVuuVUu var18 = this.uVUuuVnNVU.UuUVuuUu(var8, var6, var7, var3, var4);
                     if (var18 != null) {
                        this.UuUVuuUu(var18);
                        return true;
                     }

                     String var20 = this.uVUuuVnNVU.C00OOC00oO(var8, var6, var7, var3, var4);
                     if (var20 != null) {
                        this.uVUuuVnNVU.UuUVuuUu(var20);
                        return true;
                     }
                  }

                  return true;
               }

               if (var5 == 0 || var5 == 1) {
                  this.uVUuuVnNVU.uNNnnnuuuN();
                  return true;
               }
            }

            if (this.UNvvunVVn) {
               return this.uUnuvNvvNU(var8, var6, var7, var3, var4, var5);
            } else {
               if (this.vuNnuUnu != null && !this.UuUVuuUu(var8, var6, var7).contains(var3, var4)) {
                  this.UNnVVNvvnVvU();
               }

               if (this.UnnnvvU && (this.nnvuvUNuUnN || !this.UuUVuuUu(var8, var7).contains(var3, var4))) {
                  this.UnnnvvU = false;
               }

               if (var5 == 0 && this.UuUVuuUu(var1, var8, var6, var3, var4)) {
                  return true;
               } else if (this.VunnVNvNV && this.UuUVuuUu(var8, var6, var7, var3, var4, var5)) {
                  return true;
               } else if (this.VvVvnNUnvuvV && this.UuUVuuUu(var8, var6, var3, var4, var5)) {
                  return true;
               } else if (this.ccOO0COcoco0 && this.C00OOC00oO(var8, var6, var7, var3, var4, var5)) {
                  return true;
               } else if (this.NUVvUUVuVNVv && this.C00OOC00oO(var8, var6, var3, var4, var5)) {
                  return true;
               } else if (this.vVvUvVVuuNvV(var8, var6, var7, var3, var4, var5)) {
                  return true;
               } else {
                  vnvNNVNU var16 = this.C00OOC00oO(var8, var7);
                  vnvNNVNU var10 = this.uUnuvNvvNU(var8, var7);
                  if (var5 == 0 && var10.contains(var3, var4)) {
                     this.nnvuvUNuUnN = !this.nnvuvUNuUnN;
                     return true;
                  } else if (this.nnvuvUNuUnN || var5 != 0 || !var16.contains(var3, var4)) {
                     vnvNNVNU var11 = this.C00OOC00oO(var8, var6, var7);
                     if (var5 == 0 && var11.contains(var3, var4)) {
                        if (var4 <= var11.y() + var8.UuUVuuUu(34.0F)) {
                           this.vuvnnvuNVvu = true;
                           this.NVvnvnn = var3 - var11.x();
                           this.vUvVUNnN = var4 - var11.y();
                        }

                        return true;
                     } else {
                        if (var5 == 0) {
                           VUnvuNuVUUn var12 = this.uNNnnnuuuN(var3, var4);
                           if (var12 != null) {
                              this.vuuuNvNuv(var12.UuUVuuUu());
                              this.UuUVuuUu(var12.UuUVuuUu());
                              return true;
                           }
                        }

                        if (var5 != 2 && (var5 != 0 || !this.c0oOOCcCoC0())) {
                           NnnVVVUnVNuN.VUnuUnnuNvVu var21 = this.nuUnNvnuUu(var3, var4);
                           if (var5 == 0 && var21 != null) {
                              if (var21.direction == unnunUNUUnu.OUTPUT) {
                                 this.UuNnnVnuNNV = var21.nodeId;
                                 this.uUVvnUuNvvN = var21.pinId;
                                 this.UuUVuuUu(var21.nodeId);
                              } else {
                                 this.UUVNuUNUvUnV();
                                 if (this.UuuNnUvUuv.UuUVuuUu(var21.nodeId, var21.pinId)) {
                                    this.CC0COO.UuUVuuUu(1.0F);
                                 }

                                 this.UuUVuuUu(var21.nodeId);
                              }

                              return true;
                           } else {
                              VUnvuNuVUUn var13 = this.vVvUvVVuuNvV(var3, var4);
                              if (var5 == 0 && var13 != null) {
                                 if (class_437.method_25442()) {
                                    this.NuunnvnN.add(var13.UuUVuuUu());
                                    this.unNNVVNnvvV = var13.UuUVuuUu();
                                 } else if (!this.uUnuvNvvNU(var13.UuUVuuUu())) {
                                    this.UuUVuuUu(var13.UuUVuuUu());
                                 } else {
                                    this.unNNVVNnvvV = var13.UuUVuuUu();
                                 }

                                 if (VVuuUN(var13.C00OOC00oO()) && this.uUnuvNvvNU(var13).contains(var3, var4)) {
                                    this.UUVNuUNUvUnV();
                                    this.NVNnnvnuunNv();
                                    UVvNVvUUuUnN var24 = this.UuUVuuUu(var13);
                                    var24.UuUVuuUu(var13.UuUVuuUu("value", "int_value".equals(var13.C00OOC00oO()) ? 1.0F : 0.5F));
                                    if (var24.UuUVuuUu(var3, var4, var5, this.uUnuvNvvNU(var13))) {
                                       this.UuuuNNunN = var13.UuUVuuUu();
                                    }

                                    return true;
                                 } else if (this.uNNnnnuuuN(var13) && this.vVvUvVVuuNvV(var13).contains(var3, var4)) {
                                    this.UUVNuUNUvUnV();
                                    this.NVNnnvnuunNv();
                                    this.uVunuUNVVUUV();
                                    UVvNVvUUuUnN var14 = this.C00OOC00oO(var13);
                                    var14.UuUVuuUu(var13.UuUVuuUu("name", this.nuUnNvnuUu(var13)));
                                    if (var14.UuUVuuUu(var3, var4, var5, this.vVvUvVVuuNvV(var13))) {
                                       this.NNVNuUvVn = var13.UuUVuuUu();
                                    }

                                    return true;
                                 } else {
                                    this.NVNnnvnuunNv();
                                    this.uVunuUNVVUUV();
                                    this.UUVNuUNUvUnV();
                                    this.UvUvUNuvNU = var13.UuUVuuUu();
                                    this.c0oOOCcCoC0 = this.uNNnnnuuuN(var3) - var13.uUnuvNvvNU();
                                    this.VVnVNnunVvu = this.nuUnNvnuUu(var4) - var13.vVvUvVVuuNvV();
                                    this.UuUVuuUu(var3, var4);
                                    return true;
                                 }
                              } else {
                                 if (this.UuuuNNunN != null) {
                                    this.NVNnnvnuunNv();
                                 }

                                 if (this.NNVNuUvVn != null) {
                                    this.uVunuUNVVUUV();
                                 }

                                 if (var5 == 1) {
                                    this.uVUuuVnNVU.UuUVuuUu(var3, var4, null);
                                    return true;
                                 } else if (var5 == 0) {
                                    this.nVVUuvuNnUN = true;
                                    this.NVUunUNUN.clear();
                                    if (class_437.method_25442()) {
                                       this.NVUunUNUN.addAll(this.NuunnvnN);
                                    }

                                    this.nNnVnUNVV = var3;
                                    this.nuunNvv = var4;
                                    this.uUVVvVVNvvn = var3;
                                    this.vvUVNVvvNUv = var4;
                                    if (!class_437.method_25442()) {
                                       this.uVUuuVnNVU();
                                    }

                                    return true;
                                 } else {
                                    return true;
                                 }
                              }
                           }
                        } else {
                           this.C00OOC00oO(var3, var4);
                           return true;
                        }
                     }
                  } else if (this.UuUVuuUu(var8, var7).contains(var3, var4)) {
                     this.UnnnvvU = true;
                     this.VUUnuVvVu = System.currentTimeMillis();
                     return true;
                  } else {
                     this.UnnnvvU = false;
                     NnnVVVUnVNuN.nvUnvV var19 = this.UuUVuuUu(var8, var7, var3, var4);
                     if (var19 != null) {
                        if (var19.row().type() == 0) {
                           if (!this.VvVuvUvvNNVv.remove(var19.row().category())) {
                              this.VvVuvUvvNNVv.add(var19.row().category());
                           }

                           return true;
                        }

                        uuUnNVuuVUu var22 = var19.row().def();
                        if (var19.star()) {
                           vnvnuNuUVn.UuUVuuUu().C00OOC00oO(var22.UuUVuuUu());
                           return true;
                        }

                        float var23 = this.uNNnnnuuuN(var6 * 0.5F);
                        float var25 = this.nuUnNvnuUu(var7 * 0.5F);
                        this.UUVNuUNUvUnV();
                        VUnvuNuVUUn var15 = this.UuuNnUvUuv
                           .UuUVuuUu(var22.UuUVuuUu(), var23 - var22.vVvUvVVuuNvV() * 0.5F, var25 - this.C00OOC00oO(var22) * 0.5F, this.nuUnNvnuUu);
                        this.UuUVuuUu(var15.UuUVuuUu());
                        this.NVNnnvVnvV.put(var15.UuUVuuUu(), new UUNnvUVnnnnN(0.0F));
                        vnvnuNuUVn.UuUVuuUu().uUnuvNvvNU(var22.UuUVuuUu());
                        this.vNVuvnUUnuUn(var22.C00OOC00oO());
                     }

                     return true;
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   private void UuUVuuUu(uuUnNVuuVUu var1) {
      float var2 = this.uVUuuVnNVU.uUnuvNvvNU();
      float var3 = this.uVUuuVnNVU.vVvUvVVuuNvV();
      float var4 = this.uNNnnnuuuN(var2);
      float var5 = this.nuUnNvnuUu(var3);
      this.UUVNuUNUvUnV();
      VUnvuNuVUUn var6 = this.UuuNnUvUuv.UuUVuuUu(var1.UuUVuuUu(), var4 - var1.vVvUvVVuuNvV() * 0.5F, var5 - this.C00OOC00oO(var1) * 0.5F, this.nuUnNvnuUu);
      this.UuUVuuUu(var6.UuUVuuUu());
      this.NVNnnvVnvV.put(var6.UuUVuuUu(), new UUNnvUVnnnnN(0.0F));
      if (var1.vNUvnnVnUvu()) {
         this.NvnnUUuVvNU.put(var6.UuUVuuUu(), true);
         this.UuuNnUvUuv(var6.UuUVuuUu()).uUnuvNvvNU(1.0F);
         this.nvUVNnuu(var6.UuUVuuUu());
      }

      if (this.uVUuuVnNVU.C00OOC00oO() != null && this.uuvvuNvuUNVV != null && this.uVvunVUNuUvu != null) {
         String var7 = null;

         for (NUuvnUuVU var9 : var1.uNNnnnuuuN()) {
            if (var9.type() == this.uVUuuVnNVU.C00OOC00oO()) {
               var7 = var9.id();
               break;
            }
         }

         if (var7 != null) {
            this.UuuNnUvUuv.UuUVuuUu(this.uuvvuNvuUNVV, this.uVvunVUNuUvu, var6.UuUVuuUu(), var7, this.nuUnNvnuUu);
            this.CC0COO.UuUVuuUu(1.0F);
         }
      }

      this.uuvvuNvuUNVV = null;
      this.uVvunVUNuUvu = null;
      this.uVUuuVnNVU.uNNnnnuuuN();
      vnvnuNuUVn.UuUVuuUu().uUnuvNvvNU(var1.UuUVuuUu());
      this.vNVuvnUUnuUn(var1.C00OOC00oO());
   }

   private void UuUVuuUu(String var1) {
      this.NuunnvnN.clear();
      if (var1 != null) {
         this.NuunnvnN.add(var1);
      }

      this.unNNVVNnvvV = var1;
   }

   private void uVUuuVnNVU() {
      this.NuunnvnN.clear();
      this.unNNVVNnvvV = null;
      this.vuNnuUnu = null;
   }

   private void vuuuNvNuv() {
      for (uNuuunuNvuN var2 : this.vVvuUVnV.values()) {
         if (var2 != null) {
            var2.uUnuvNvvNU(0.0F);
         }
      }

      this.NvnnUUuVvNU.clear();
      this.vVvuUVnV.clear();
   }

   private void C00OOC00oO(String var1) {
      if (var1 != null) {
         this.NnUVNnuvUv.keySet().removeIf(var1x -> var1x.startsWith(var1 + ":"));
      }
   }

   private boolean uUnuvNvvNU(String var1) {
      return var1 != null && this.NuunnvnN.contains(var1);
   }

   private void nvUVNnuu() {
      if (this.NuunnvnN.isEmpty()) {
         this.unNNVVNnvvV = null;
      } else {
         if (this.unNNVVNnvvV == null || !this.NuunnvnN.contains(this.unNNVVNnvvV)) {
            this.unNNVVNnvvV = this.NuunnvnN.iterator().next();
         }
      }
   }

   private void UuUVuuUu(float var1, float var2) {
      this.UUVNuUNUvUnV.clear();
      if (!this.NuunnvnN.isEmpty() && this.NuunnvnN.contains(this.UvUvUNuvNU)) {
         for (String var4 : this.NuunnvnN) {
            VUnvuNuVUUn var5 = this.UuuNnUvUuv.uUnuvNvvNU(var4);
            if (var5 != null) {
               this.UUVNuUNUvUnV.put(var4, new NnnVVVUnVNuN.NVnVnNnN(var5.uUnuvNvvNU(), var5.vVvUvVVuuNvV()));
            }
         }
      } else {
         VUnvuNuVUUn var3 = this.UuuNnUvUuv.uUnuvNvvNU(this.UvUvUNuvNU);
         if (var3 != null) {
            this.UUVNuUNUvUnV.put(var3.UuUVuuUu(), new NnnVVVUnVNuN.NVnVnNnN(var3.uUnuvNvvNU(), var3.vVvUvVVuuNvV()));
         }
      }

      this.vuvnUnVnUNnV = this.uNNnnnuuuN(var1);
      this.nnuUVNUuvvVU = this.nuUnNvnuUu(var2);
   }

   private void UuUVuuUu(boolean var1) {
      float var2 = Math.min(this.nNnVnUNVV, this.uUVVvVVNvvn);
      float var3 = Math.min(this.nuunNvv, this.vvUVNVvvNUv);
      float var4 = Math.max(this.nNnVnUNVV, this.uUVVvVVNvvn);
      float var5 = Math.max(this.nuunNvv, this.vvUVNVvvNUv);
      this.NuunnvnN.clear();
      if (var1) {
         this.NuunnvnN.addAll(this.NVUunUNUN);
      }

      for (VUnvuNuVUUn var7 : this.UuuNnUvUuv.uUnuvNvvNU()) {
         uuUnNVuuVUu var8 = this.nuUnNvnuUu.UuUVuuUu(var7.C00OOC00oO());
         if (var8 != null) {
            float var9 = this.uUnuvNvvNU(var7.uUnuvNvvNU());
            float var10 = this.vVvUvVVuuNvV(var7.vVvUvVVuuNvV());
            float var11 = var8.vVvUvVVuuNvV() * this.vNVuvnUUnuUn;
            float var12 = this.UuUVuuUu(var8, var7) * this.vNVuvnUUnuUn;
            if (UuUVuuUu(var2, var3, var4 - var2, var5 - var3, var9, var10, var11, var12)) {
               this.NuunnvnN.add(var7.UuUVuuUu());
            }
         }
      }

      this.nvUVNnuu();
   }

   private void UuuNnUvUuv() {
      if (!this.NuunnvnN.isEmpty()) {
         this.UUVNuUNUvUnV();
         ArrayList var1 = new ArrayList<>(this.NuunnvnN);
         HashMap var2 = new HashMap();
         this.NuunnvnN.clear();

         for (String var4 : var1) {
            VUnvuNuVUUn var5 = this.UuuNnUvUuv.uUnuvNvvNU(var4);
            if (var5 != null) {
               VUnvuNuVUUn var6 = this.UuuNnUvUuv.UuUVuuUu(var5.C00OOC00oO(), var5.uUnuvNvvNU() + 42.0F, var5.vVvUvVVuuNvV() + 42.0F, this.nuUnNvnuUu);
               var6.nuUnNvnuUu().putAll(var5.nuUnNvnuUu());
               var6.VVuuUN().putAll(var5.VVuuUN());
               var2.put(var4, var6.UuUVuuUu());
               this.NuunnvnN.add(var6.UuUVuuUu());
               this.NVNnnvVnvV.put(var6.UuUVuuUu(), new UUNnvUVnnnnN(0.0F));
            }
         }

         for (nNuNNVuNUu var8 : new ArrayList<>(this.UuuNnUvUuv.vVvUvVVuuNvV())) {
            String var9 = (String)var2.get(var8.UuUVuuUu());
            String var10 = (String)var2.get(var8.uUnuvNvvNU());
            if (var9 != null && var10 != null) {
               this.UuuNnUvUuv.UuUVuuUu(var9, var8.C00OOC00oO(), var10, var8.vVvUvVVuuNvV(), this.nuUnNvnuUu);
            }
         }

         this.nvUVNnuu();
         this.CC0COO.UuUVuuUu(1.0F);
         this.vNVuvnUUnuUn("duplicated " + this.NuunnvnN.size());
      }
   }

   private void nUUVuvU() {
      this.nNunUnVN = uNNnnnuuuN(this.nNunUnVN);
      lllilIiI11l var1 = lllilIiI11l.UuUVuuUu();
      VUvUNNUvvNVN var2 = this.VNNnnVUuvv == null ? null : var1.UuUVuuUu(this.VNNnnVUuvv);
      String var3 = var2 == null ? "" : var2.C00OOC00oO();
      this.UUuUnNVNuuv();
      this.UuuNnUvUuv.UuUVuuUu().UuUVuuUu(this.nNunUnVN, lllilIiI11l.VVuuUN());
      this.UuuNnUvUuv.UuUVuuUu().UuUVuuUu(this.nNunUnVN);
      this.UuuNnUvUuv.UuUVuuUu().C00OOC00oO(this.UuuNnUvUuv.UuUVuuUu().uUnuvNvvNU().isBlank() ? lllilIiI11l.VVuuUN() : this.UuuNnUvUuv.UuUVuuUu().uUnuvNvvNU());
      this.UuuNnUvUuv.UuUVuuUu().uNNnnnuuuN("local");
      this.UuuNnUvUuv.UuUVuuUu().C00OOC00oO(System.currentTimeMillis());
      this.uNNnnnuuuN(this.NNUUNUuVNNVn);
      this.vNUvnnVnUvu.UuUVuuUu(this.NNUUNUuVNNVn);
      boolean var4 = this.vNUvnnVnUvu.UuUVuuUu(this.nNunUnVN, this.UuuNnUvUuv);
      if (var4) {
         VUvUNNUvvNVN var5 = var1.UuUVuuUu(this.NNUUNUuVNNVn, this.UuuNnUvUuv, this.nNunUnVN, this.VNNnnVUuvv);
         if (var5 != null) {
            this.VNNnnVUuvv = var5.UuUVuuUu();
            this.UuUVuuUu(var5.C00OOC00oO(), this.UuuNnUvUuv);
         }

         if (!var3.isBlank() && !uNNnUu.vuuuNvNuv(var3).equals(uNNnUu.vuuuNvNuv(this.nNunUnVN))) {
            uNNnUu.UuUVuuUu().UuUVuuUu(var3);
            uVvVnUU.UuUVuuUu().uUnuvNvvNU(var3);
         }

         this.uuVuUuuVVNvN = this.UuuNnUvUuv.uNNnnnuuuN();
         this.vNVuvnUUnuUn("saved " + this.nNunUnVN);
      } else {
         this.vNVuvnUUnuUn(this.vNUvnnVnUvu.C00OOC00oO().isBlank() ? "compile failed" : this.vNUvnnVnUvu.C00OOC00oO());
      }
   }

   private void UnUNVVVNuv() {
      this.nNunUnVN = this.vVvUvVVuuNvV(uNNnnnuuuN(this.nNunUnVN));
      this.VNNnnVUuvv = null;
      this.nUUVuvU();
   }

   private String vVvUvVVuuNvV(String var1) {
      String var2 = var1 != null && !var1.isBlank() ? var1 : nVNvNVnvnVvn.UuUVuuUu();

      for (int var3 = 1; var3 < 128; var3++) {
         String var4 = var3 == 1 ? var2 + " Copy" : var2 + " Copy " + var3;
         boolean var5 = false;

         for (VUvUNNUvvNVN var7 : lllilIiI11l.UuUVuuUu().UuUVuuUu(this.NNUUNUuVNNVn)) {
            if (var7.C00OOC00oO().equalsIgnoreCase(var4)) {
               var5 = true;
               break;
            }
         }

         if (!var5 && !uNNnUu.UuUVuuUu().uNNnnnuuuN(var4)) {
            return var4;
         }
      }

      return var2 + " Copy " + System.currentTimeMillis() % 10000L;
   }

   private void vNVuvnUUnuUn() {
      int var1 = lllilIiI11l.UuUVuuUu().UuUVuuUu(WVWvvVvwWWw.UuUVuuUu());
      this.vNVuvnUUnuUn(var1 == 0 ? "no legacy slots" : "cleanup " + var1 + " legacy");
   }

   private static boolean UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      return var0 < var4 + var6 && var0 + var2 > var4 && var1 < var5 + var7 && var1 + var3 > var5;
   }

   private static String uNNnnnuuuN(String var0) {
      String var1 = uNNnUu.vuuuNvNuv(var0);
      return var1.isBlank() ? nVNvNVnvnVvn.UuUVuuUu() : var1;
   }

   private static boolean UuUVuuUu(char var0) {
      return Character.isLetterOrDigit(var0) || var0 == ' ' || var0 == '_' || var0 == '-' || var0 == '.';
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, float var2, float var3) {
      if (var1 != null && this.UuUVuuUu(var1)) {
         this.UUuUnNVNuuv = var2;
         this.NVuNUuVnVUN = var3;
         if (this.vuvnnvuNVvu) {
            this.nUununvNvvn = var2 - this.NVvnvnn;
            this.NuvunVvnnN = var3 - this.vUvVUNnN;
            return true;
         } else if (this.NVNnnvnuunNv) {
            float var14 = this.nUUVuvU;
            float var16 = this.UnUNVVVNuv;
            this.nUUVuvU = this.uNnUnnuNUnNu + var2 - this.uVunuUNVVUUV;
            this.UnUNVVVNuv = this.NnUuNNU + var3 - this.UNnVVNvvnVvU;
            this.uUnuvNvvNU(var14, var16);
            return true;
         } else {
            if (this.UuuuNNunN != null) {
               UVvNVvUUuUnN var4 = this.uunNUuunVU.get(this.UuuuNNunN);
               if (var4 != null && var4.UuUVuuUu(var2, var3, class_437.method_25442())) {
                  VUnvuNuVUUn var15 = this.UuuNnUvUuv.uUnuvNvvNU(this.UuuuNNunN);
                  if (var15 != null) {
                     var15.C00OOC00oO("value", UuUVuuUu(var15, var4.uUnuvNvvNU()));
                     this.UuuNnUvUuv.nuUnNvnuUu();
                  }

                  return true;
               }
            }

            if (this.NNVNuUvVn != null) {
               UVvNVvUUuUnN var11 = this.NvnuuuvnVV.get(this.NNVNuUvVn);
               if (var11 != null && var11.UuUVuuUu(var2, var3, class_437.method_25442())) {
                  return true;
               }
            }

            if (this.vuNnuUnu != null) {
               UVvNVvUUuUnN var12 = this.NnUVNnuvUv.get(this.vuNnuUnu);
               if (var12 != null && var12.UuUVuuUu(var2, var3, class_437.method_25442())) {
                  this.vNUvnnVnUvu(this.vuNnuUnu);
                  return true;
               }
            }

            if (this.nVVUuvuNnUN) {
               this.uUVVvVVNvvn = var2;
               this.vvUVNVvvNUv = var3;
               this.UuUVuuUu(class_437.method_25442());
               return true;
            } else if (this.UvUvUNuvNU == null) {
               return this.UuNnnVnuNNV != null;
            } else {
               VUnvuNuVUUn var13 = this.UuuNnUvUuv.uUnuvNvvNU(this.UvUvUNuvNU);
               if (var13 != null) {
                  if (this.UUVNuUNUvUnV.size() > 1 || this.UUVNuUNUvUnV.size() == 1 && this.UUVNuUNUvUnV.containsKey(var13.UuUVuuUu())) {
                     float var5 = this.uNNnnnuuuN(var2) - this.vuvnUnVnUNnV;
                     float var6 = this.nuUnNvnuUu(var3) - this.nnuUVNUuvvVU;

                     for (Entry var8 : this.UUVNuUNUvUnV.entrySet()) {
                        VUnvuNuVUUn var9 = this.UuuNnUvUuv.uUnuvNvvNU((String)var8.getKey());
                        if (var9 != null) {
                           NnnVVVUnVNuN.NVnVnNnN var10 = (NnnVVVUnVNuN.NVnVnNnN)var8.getValue();
                           var9.UuUVuuUu(var10.x + var5, var10.y + var6);
                        }
                     }
                  } else {
                     var13.UuUVuuUu(this.uNNnnnuuuN(var2) - this.c0oOOCcCoC0, this.nuUnNvnuUu(var3) - this.VVnVNnunVvu);
                  }

                  this.UuuNnUvUuv.nuUnNvnuUu();
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   public boolean C00OOC00oO(vNvvVnNuUVvv var1, float var2, float var3) {
      if (var1 != null && this.UuUVuuUu(var1)) {
         if (this.UuNnnVnuNNV != null) {
            NnnVVVUnVNuN.VUnuUnnuNvVu var4 = this.nuUnNvnuUu(var2, var3);
            if (var4 != null && var4.direction == unnunUNUUnu.INPUT) {
               this.UUVNuUNUvUnV();
               boolean var11 = this.UuuNnUvUuv.UuUVuuUu(this.UuNnnVnuNNV, this.uUVvnUuNvvN, var4.nodeId, var4.pinId, this.nuUnNvnuUu);
               if (var11) {
                  this.CC0COO.UuUVuuUu(1.0F);
               }

               this.vNVuvnUUnuUn(var11 ? "linked" : "cycle / type guard");
            } else if (var4 == null && this.vVvUvVVuuNvV(var2, var3) == null) {
               VUnvuNuVUUn var5 = this.UuuNnUvUuv.uUnuvNvvNU(this.UuNnnVnuNNV);
               if (var5 != null) {
                  uuUnNVuuVUu var6 = this.nuUnNvnuUu.UuUVuuUu(var5.C00OOC00oO());
                  NUuvnUuVU var7 = var6 == null ? null : var6.C00OOC00oO(this.uUVvnUuNvvN);
                  if (var7 != null) {
                     this.uuvvuNvuUNVV = this.UuNnnVnuNNV;
                     this.uVvunVUNuUvu = this.uUVvnUuNvvN;
                     this.uVUuuVnNVU.UuUVuuUu(var2, var3, var7.type());
                  }
               }
            }
         }

         if (this.nVVUuvuNnUN) {
            this.uUVVvVVNvvn = var2;
            this.vvUVNVvvNUv = var3;
            this.UuUVuuUu(class_437.method_25442());
         }

         if (this.UuuuNNunN != null) {
            UVvNVvUUuUnN var8 = this.uunNUuunVU.get(this.UuuuNNunN);
            if (var8 != null) {
               if (var8.vVvUvVVuuNvV(var2, var3)) {
                  VUnvuNuVUUn var12 = this.UuuNnUvUuv.uUnuvNvvNU(this.UuuuNNunN);
                  if (var12 != null) {
                     var12.C00OOC00oO("value", UuUVuuUu(var12, var8.uUnuvNvvNU()));
                     this.UuuNnUvUuv.nuUnNvnuUu();
                  }
               }

               if (!var8.vNUvnnVnUvu()) {
                  this.UuuuNNunN = null;
               }
            }
         }

         if (this.NNVNuUvVn != null) {
            UVvNVvUUuUnN var9 = this.NvnuuuvnVV.get(this.NNVNuUvVn);
            if (var9 != null) {
               if (var9.vVvUvVVuuNvV(var2, var3)) {
                  VUnvuNuVUUn var13 = this.UuuNnUvUuv.uUnuvNvvNU(this.NNVNuUvVn);
                  if (var13 != null) {
                     var13.C00OOC00oO("name", var9.vVvUvVVuuNvV());
                     this.UuuNnUvUuv.nuUnNvnuUu();
                  }
               }

               if (!var9.vNUvnnVnUvu()) {
                  this.NNVNuUvVn = null;
               }
            }
         }

         if (this.vuNnuUnu != null) {
            UVvNVvUUuUnN var10 = this.NnUVNnuvUv.get(this.vuNnuUnu);
            if (var10 != null) {
               if (var10.vVvUvVVuuNvV(var2, var3)) {
                  this.vNUvnnVnUvu(this.vuNnuUnu);
               }

               if (!var10.vNUvnnVnUvu()) {
                  this.vNUvnnVnUvu(this.vuNnuUnu);
                  this.vuNnuUnu = null;
               }
            }
         }

         this.NVNnnvnuunNv = false;
         this.vuvnnvuNVvu = false;
         this.UvUvUNuvNU = null;
         this.UUVNuUNUvUnV.clear();
         this.nVVUuvuNnUN = false;
         this.NVUunUNUN.clear();
         this.UuNnnVnuNNV = null;
         this.uUVvnUuNvvN = null;
         this.NNnvvunuVNUn = false;
         return true;
      } else {
         return false;
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, float var2, float var3, double var4) {
      if (var1 == null || !this.UuUVuuUu(var1)) {
         return false;
      } else if (this.nvUVNnuu.C00OOC00oO()) {
         return this.nvUVNnuu
            .UuUVuuUu(
               var4,
               this.NuunnvnN(),
               this.vnuNNVvVVuN <= 0 ? this.VVnVNnunVvu() : this.vnuNNVvVVuN,
               this.Oco0Oococc <= 0 ? this.unNNVVNnvvV() : this.Oco0Oococc
            );
      } else if (this.uVUuuVnNVU.UuUVuuUu()) {
         this.uVUuuVnNVU.UuUVuuUu(var4);
         return true;
      } else {
         nUvnuVnNUU var6 = this.NuunnvnN();
         int var7 = this.vnuNNVvVVuN <= 0 ? this.VVnVNnunVvu() : this.vnuNNVvVVuN;
         int var8 = this.Oco0Oococc <= 0 ? this.unNNVVNnvvV() : this.Oco0Oococc;
         if (this.UuUVuuUu(var6, var7, var8, var2, var3, var4)) {
            return true;
         } else if (!this.nnvuvUNuUnN && this.C00OOC00oO(var6, this.Oco0Oococc <= 0 ? this.unNNVVNnvvV() : this.Oco0Oococc).contains(var2, var3)) {
            this.UVnuVUUVnnU = Math.max(0.0F, this.UVnuVUUVnnU - (float)var4 * var6.UuUVuuUu(28.0F));
            return true;
         } else {
            float var9 = (var2 - this.nUUVuvU) / Math.max(0.001F, this.UvnvNVnnnnNU);
            float var10 = (var3 - this.UnUNVVVNuv) / Math.max(0.001F, this.UvnvNVnnnnNU);
            float var11 = (float)Math.exp(var4 * 0.105);
            this.UvnvNVnnnnNU = C00OOC00oO(this.UvnvNVnnnnNU * var11, 0.34F, 2.45F);
            this.nUUVuvU = var2 - var9 * this.UvnvNVnnnnNU;
            this.UnUNVVVNuv = var3 - var10 * this.UvnvNVnnnnNU;
            this.nNvNUVU = 0.0F;
            this.UnUNuUU = 0.0F;
            return true;
         }
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, char var2) {
      if (var1 == null || !this.UuUVuuUu(var1)) {
         return false;
      } else if (this.nvUVNnuu.C00OOC00oO()) {
         return this.nvUVNnuu.UuUVuuUu(var2);
      } else if (this.VnVuuvVvnNv) {
         if (UuUVuuUu(var2) && this.nNunUnVN.length() < 48) {
            this.nNunUnVN = this.nNunUnVN + var2;
            this.vuvvuVuVv = System.currentTimeMillis();
         }

         return true;
      } else if (this.uVUuuVnNVU.UuUVuuUu() && var2 != ' ') {
         this.uVUuuVnNVU.UuUVuuUu(var2);
         return true;
      } else if (this.UnnnvvU) {
         if (UuUVuuUu(var2) && this.NnuUnUNnu.length() < 40) {
            this.NnuUnUNnu = this.NnuUnUNnu + var2;
            this.VUUnuVvVu = System.currentTimeMillis();
            this.UVnuVUUVnnU = 0.0F;
         }

         return true;
      } else {
         if (this.UuuuNNunN != null) {
            UVvNVvUUuUnN var3 = this.uunNUuunVU.get(this.UuuuNNunN);
            if (var3 != null && var3.UuUVuuUu(var2)) {
               return true;
            }
         }

         if (this.NNVNuUvVn != null) {
            UVvNVvUUuUnN var4 = this.NvnuuuvnVV.get(this.NNVNuUvVn);
            if (var4 != null && var4.UuUVuuUu(var2)) {
               return true;
            }
         }

         if (this.vuNnuUnu != null) {
            UVvNVvUUuUnN var5 = this.NnUVNnuvUv.get(this.vuNnuUnu);
            if (var5 != null && var5.UuUVuuUu(var2)) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, int var2) {
      if (var1 == null || !this.UuUVuuUu(var1)) {
         return false;
      } else if (this.nvUVNnuu.C00OOC00oO()) {
         boolean var11 = this.nvUVNnuu.UuUVuuUu(var2);
         this.UuNnnVnuNNV();
         return var11;
      } else if (this.VnVuuvVvnNv) {
         if (var2 == 256) {
            this.VnVuuvVvnNv = false;
            this.nNunUnVN = uNNnnnuuuN(this.nNunUnVN);
            return true;
         } else if (var2 == 257 || var2 == 335 || var2 == 258) {
            this.VnVuuvVvnNv = false;
            this.nNunUnVN = uNNnnnuuuN(this.nNunUnVN);
            return true;
         } else if (var2 == 259) {
            if (!this.nNunUnVN.isEmpty()) {
               this.nNunUnVN = this.nNunUnVN.substring(0, this.nNunUnVN.length() - 1);
               this.vuvvuVuVv = System.currentTimeMillis();
            }

            return true;
         } else {
            return true;
         }
      } else if (this.uVUuuVnNVU.UuUVuuUu()) {
         if (var2 == 256) {
            this.uVUuuVnNVU.uNNnnnuuuN();
            this.uuvvuNvuUNVV = null;
            this.uVvunVUNuUvu = null;
            return true;
         } else if (var2 == 257 || var2 == 335) {
            uuUnNVuuVUu var10 = this.uVUuuVnNVU.vNUvnnVnUvu();
            if (var10 != null) {
               this.UuUVuuUu(var10);
            } else {
               this.uVUuuVnNVU.uNNnnnuuuN();
            }

            return true;
         } else if (var2 == 259) {
            this.uVUuuVnNVU.nuUnNvnuUu();
            return true;
         } else if (var2 == 264) {
            this.uVUuuVnNVU.UuUVuuUu(1);
            return true;
         } else if (var2 == 265) {
            this.uVUuuVnNVU.UuUVuuUu(-1);
            return true;
         } else {
            return true;
         }
      } else {
         if (this.UuuuNNunN != null) {
            UVvNVvUUuUnN var3 = this.uunNUuunVU.get(this.UuuuNNunN);
            if (var3 != null && var3.UuUVuuUu(var2)) {
               if (!var3.uNNnnnuuuN()) {
                  VUnvuNuVUUn var13 = this.UuuNnUvUuv.uUnuvNvvNU(this.UuuuNNunN);
                  if (var13 != null) {
                     var13.C00OOC00oO("value", UuUVuuUu(var13, var3.uUnuvNvvNU()));
                     this.UuuNnUvUuv.nuUnNvnuUu();
                  }

                  this.UuuuNNunN = null;
               }

               return true;
            }
         }

         if (this.NNVNuUvVn != null) {
            UVvNVvUUuUnN var7 = this.NvnuuuvnVV.get(this.NNVNuUvVn);
            if (var7 != null && var7.UuUVuuUu(var2)) {
               if (!var7.uNNnnnuuuN()) {
                  VUnvuNuVUUn var12 = this.UuuNnUvUuv.uUnuvNvvNU(this.NNVNuUvVn);
                  if (var12 != null) {
                     var12.C00OOC00oO("name", var7.vVvUvVVuuNvV());
                     this.UuuNnUvUuv.nuUnNvnuUu();
                  }

                  this.NNVNuUvVn = null;
               }

               return true;
            }
         }

         if (this.vuNnuUnu != null) {
            UVvNVvUUuUnN var8 = this.NnUVNnuvUv.get(this.vuNnuUnu);
            if (var8 != null && var8.UuUVuuUu(var2)) {
               if (!var8.uNNnnnuuuN()) {
                  this.vNUvnnVnUvu(this.vuNnuUnu);
                  this.vuNnuUnu = null;
               }

               return true;
            }
         }

         if (this.UnnnvvU) {
            if (var2 == 256) {
               this.NnuUnUNnu = "";
               this.UnnnvvU = false;
               this.UVnuVUUVnnU = 0.0F;
               return true;
            } else if (var2 == 257 || var2 == 335) {
               this.UnnnvvU = false;
               return true;
            } else if (var2 == 259) {
               if (!this.NnuUnUNnu.isEmpty()) {
                  this.NnuUnUNnu = this.NnuUnUNnu.substring(0, this.NnuUnUNnu.length() - 1);
                  this.VUUnuVvVu = System.currentTimeMillis();
                  this.UVnuVUUVnnU = 0.0F;
               }

               return true;
            } else {
               return true;
            }
         } else if (var2 == 32) {
            return true;
         } else if (var2 == 68 && class_437.method_25442()) {
            this.UuuNnUvUuv();
            return true;
         } else if (var2 == 256) {
            if (!this.VvVvnNUnvuvV && !this.ccOO0COcoco0 && !this.NUVvUUVuVNVv && !this.UNvvunVVn && !this.VunnVNvNV) {
               var1.uUVuVvuNUvnu(false);
            } else {
               this.NVUunUNUN();
            }

            return true;
         } else if (var2 != 261 && var2 != 259) {
            if (var2 == 76) {
               this.nnvuvUNuUnN = !this.nnvuvUNuUnN;
               return true;
            } else {
               if (class_437.method_25441()) {
                  if (var2 == 90) {
                     if (class_437.method_25442()) {
                        this.nVVUuvuNnUN();
                     } else {
                        this.nnuUVNUuvvVU();
                     }

                     return true;
                  }

                  if (var2 == 89) {
                     this.nVVUuvuNnUN();
                     return true;
                  }

                  if (var2 == 83) {
                     this.nUUVuvU();
                     return true;
                  }

                  if (var2 == 80) {
                     this.uVUuuVnNVU.UuUVuuUu(this.UUuUnNVNuuv, this.NVuNUuVnVUN, null);
                     this.vNVuvnUUnuUn("command");
                     return true;
                  }

                  if (var2 == 67) {
                     this.uUVVvVVNvvn();
                     return true;
                  }

                  if (var2 == 86) {
                     this.vvUVNVvvNUv();
                     return true;
                  }

                  if (var2 == 82) {
                     this.nNnVnUNVV();
                     return true;
                  }

                  if (var2 == 48) {
                     this.nUUVuvU = 520.0F;
                     this.UnUNVVVNuv = 260.0F;
                     this.UvnvNVnnnnNU = 0.92F;
                     this.uVUVnuvnuVuv.UuUVuuUu(this.UvnvNVnnnnNU);
                     this.vNVuvnUUnuUn("view");
                     return true;
                  }
               }

               return true;
            }
         } else {
            if (!this.NuunnvnN.isEmpty()) {
               this.UUVNuUNUvUnV();
               ArrayList var9 = new ArrayList<>(this.NuunnvnN);
               boolean var4 = false;

               for (String var6 : var9) {
                  if (this.UuuNnUvUuv.C00OOC00oO(var6)) {
                     var4 = true;
                     this.uunNUuunVU.remove(var6);
                     this.NvnuuuvnVV.remove(var6);
                     this.C00OOC00oO(var6);
                     this.NvnnUUuVvNU.remove(var6);
                     this.vVvuUVnV.remove(var6);
                     if (var6.equals(this.UuuuNNunN)) {
                        this.UuuuNNunN = null;
                     }

                     if (var6.equals(this.NNVNuUvVn)) {
                        this.NNVNuUvVn = null;
                     }

                     if (this.vuNnuUnu != null && this.vuNnuUnu.startsWith(var6 + ":")) {
                        this.vuNnuUnu = null;
                     }
                  }
               }

               this.uVUuuVnNVU();
               if (var4) {
                  this.CC0COO.UuUVuuUu(1.0F);
               }

               this.vNVuvnUUnuUn("deleted");
            }

            return true;
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, int var4) {
      nUvnuVnNUU var5 = var3.uNNnnnuuuN();
      NUunUunuNV var6 = var3.nuUnNvnuUu();
      float var7 = var5.UuUVuuUu(34.0F);
      float var8 = var5.UuUVuuUu(28.0F);
      float var9 = var4 - var5.UuUVuuUu(68.0F);
      float var10 = var5.UuUVuuUu(60.0F);
      float var11 = var5.UuUVuuUu(14.0F);
      var1.UuUVuuUu(var7, var8, var9, var10, var11, var5.UuUVuuUu(22.0F), var5.UuUVuuUu(2.0F), this.uUnuvNvvNU(var6, 132));
      var1.UuUVuuUu(var7, var8, var9, var10, var11, 0.34F);
      var1.UuUVuuUu(var7, var8, var9, var10, var11, this.UuUVuuUu(var6, 226));
      var1.UuUVuuUu(var7, var8, var9, var10, var11, NUunUunuNV.UuUVuuUu(var6.uVunuUNVVUUV(), 52), 0.7F);
      var1.UuUVuuUu(
         var7 + var5.UuUVuuUu(1.0F),
         var8 + var5.UuUVuuUu(1.0F),
         var9 - var5.UuUVuuUu(2.0F),
         var5.UuUVuuUu(1.0F),
         var11,
         NUunUunuNV.UuUVuuUu(var6.NVNnnvnuunNv(), 18)
      );
      var1.C00OOC00oO(var7 + var5.UuUVuuUu(20.0F), var8 + var10 * 0.5F, var5.UuUVuuUu(4.0F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var6.uVunuUNVVUUV(), 235));
      nunvNNUnvU.UuUVuuUu(
         var1,
         var5,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var7 + var5.UuUVuuUu(32.0F),
         var8 + var5.UuUVuuUu(5.0F),
         var5.UuUVuuUu(24.0F),
         13.0F,
         "Foundry",
         this.C00OOC00oO(var6)
      );
      String var12 = this.vNUvnnVnUvu.uUnuvNvvNU().isBlank() ? "cold" : this.vNUvnnVnUvu.uUnuvNvvNU();
      String var13 = this.vNUvnnVnUvu.C00OOC00oO();
      String var14 = !var13.isBlank() ? var13 : this.vVVuuVVv;
      int var15 = !var13.isBlank() ? NUunUunuNV.UuUVuuUu(255, 132, 132, 230) : NUunUunuNV.UuUVuuUu(var6.uVunuUNVVUUV(), 210);
      String var16 = this.UuuNnUvUuv.UuUVuuUu().uUnuvNvvNU().isBlank()
         ? "#" + var12 + " / " + this.UuuNnUvUuv.uUnuvNvvNU().size() + " nodes / " + this.UuuNnUvUuv.vVvUvVVuuNvV().size() + " links / " + var14
         : "#"
            + var12
            + " / "
            + this.UuuNnUvUuv.UuUVuuUu().uUnuvNvvNU()
            + " / "
            + this.UuuNnUvUuv.uUnuvNvvNU().size()
            + " nodes / "
            + this.UuuNnUvUuv.vVvUvVVuuNvV().size()
            + " links / "
            + var14;
      nunvNNUnvU.UuUVuuUu(
         var1,
         var5,
         vNvnnVvvVUu.UuUVuuUu,
         var7 + var5.UuUVuuUu(32.0F),
         var8 + var5.UuUVuuUu(29.0F),
         var5.UuUVuuUu(18.0F),
         8.0F,
         nunvNNUnvU.UuUVuuUu(var5, vNvnnVvvVUu.UuUVuuUu, var16, 8.0F, var5.UuUVuuUu(160.0F)),
         var15
      );
      this.UuUVuuUu(var1, var5, var6, this.UuUVuuUu(var5), "File", this.VvVvnNUnvuvV, var2.unnUnUNVnN(), var2.NnuUnUNnu(), 6);
      this.UuUVuuUu(var1, var5, var6, this.C00OOC00oO(var5), var2);
      this.UuUVuuUu(var1, var5, var6, this.uUnuvNvvNU(var5), this.NNUUNUuVNNVn.C00OOC00oO(), this.ccOO0COcoco0, var2.unnUnUNVnN(), var2.NnuUnUNnu(), 1);
      this.UuUVuuUu(var1, var5, var6, this.nuUnNvnuUu(var5, var4), "Library", this.VunnVNvNV, var2.unnUnUNVnN(), var2.NnuUnUNnu(), 7);
      this.UuUVuuUu(var1, var5, var6, this.uNNnnnuuuN(var5, var4), this.UvNNVUVNVuvV.UuUVuuUu(), this.NUVvUUVuVNVv, var2.unnUnUNVnN(), var2.NnuUnUNnu(), 3);
      this.UuUVuuUu(var1, var5, var6, this.vVvUvVVuuNvV(var5, var4), "Close", false, var2.unnUnUNVnN(), var2.NnuUnUNnu(), 4);
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, String var5, boolean var6, float var7, float var8, int var9) {
      float var10 = var4.contains(var7, var8) ? 1.0F : 0.0F;
      float var11 = Math.max(var6 ? 0.82F : 0.0F, var10);
      int var12 = NUunUunuNV.UuUVuuUu(
         NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var3) ? 70 : 11),
         NUunUunuNV.UuUVuuUu(var9 == 2 ? var3.UNnVVNvvnVvU() : var3.uVunuUNVVUUV(), 86),
         var11
      );
      var1.UuUVuuUu(var4.x(), var4.y(), var4.w(), var4.h(), var2.UuUVuuUu(8.0F), var12);
      var1.UuUVuuUu(
         var4.x(),
         var4.y(),
         var4.w(),
         var4.h(),
         var2.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(var3.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 128), var11),
         0.7F
      );
      this.UuUVuuUu(var1, var2, var3, var4.x() + var2.UuUVuuUu(14.0F), var4.y() + var4.h() * 0.5F, var9, var11);
      float var13 = var4.x() + var2.UuUVuuUu(28.0F);
      float var14 = var4.w() - var2.UuUVuuUu(36.0F);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var13,
         var4.y(),
         var4.h(),
         9.0F,
         nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var5, 9.0F, var14),
         NUunUunuNV.UuUVuuUu(this.uUnuvNvvNU(var3), this.C00OOC00oO(var3), 0.55F + var11 * 0.45F)
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, int var6, float var7) {
      int var8 = NUunUunuNV.UuUVuuUu(var6 == 2 ? var3.UNnVVNvvnVvU() : var3.uVunuUNVVUUV(), Math.round(150.0F + 90.0F * var7));
      float var9 = var2.UuUVuuUu(5.6F);
      if (var6 == 0) {
         var1.UuUVuuUu(var4 - var9, var5 - var9 * 0.65F, var9 * 2.0F, var9 * 1.3F, var2.UuUVuuUu(2.0F), var8);
         var1.UuUVuuUu(var4 - var9 * 0.7F, var5 - var9, var9 * 0.9F, var2.UuUVuuUu(2.0F), var2.UuUVuuUu(1.0F), var8);
      } else if (var6 == 1) {
         var1.C00OOC00oO(var4, var5, var9 * 0.9F, 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var8, 82));
         var1.C00OOC00oO(var4, var5, var9 * 0.38F, 0.0F, 1.0F, var8);
      } else if (var6 == 2) {
         var1.UuUVuuUu(var4 - var9, var5 - var9, var9 * 0.72F, var9 * 0.72F, var2.UuUVuuUu(1.5F), var8);
         var1.UuUVuuUu(var4 + var9 * 0.18F, var5 - var9, var9 * 0.72F, var9 * 0.72F, var2.UuUVuuUu(1.5F), NUunUunuNV.UuUVuuUu(var8, 170));
         var1.UuUVuuUu(var4 - var9 * 0.42F, var5 + var9 * 0.18F, var9 * 0.72F, var9 * 0.72F, var2.UuUVuuUu(1.5F), NUunUunuNV.UuUVuuUu(var8, 210));
      } else if (var6 == 3) {
         var1.C00OOC00oO(var4, var5, var9 * 0.88F, 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var8, 74));
         var1.UuUVuuUu(var4 - var9, var5 - var2.UuUVuuUu(0.8F), var9 * 2.0F, var2.UuUVuuUu(1.6F), var2.UuUVuuUu(1.0F), var8);
         var1.UuUVuuUu(var4 - var2.UuUVuuUu(0.8F), var5 - var9, var2.UuUVuuUu(1.6F), var9 * 2.0F, var2.UuUVuuUu(1.0F), var8);
      } else if (var6 == 5) {
         var1.UuUVuuUu(var4 - var9 * 1.05F, var5 - var9 * 0.78F, var9 * 1.62F, var2.UuUVuuUu(1.5F), var2.UuUVuuUu(1.0F), var8);
         var1.UuUVuuUu(var4 - var9 * 0.62F, var5 - var2.UuUVuuUu(0.75F), var9 * 1.78F, var2.UuUVuuUu(1.5F), var2.UuUVuuUu(1.0F), NUunUunuNV.UuUVuuUu(var8, 194));
         var1.UuUVuuUu(var4 - var9 * 1.05F, var5 + var9 * 0.78F, var9 * 1.62F, var2.UuUVuuUu(1.5F), var2.UuUVuuUu(1.0F), NUunUunuNV.UuUVuuUu(var8, 155));
         var1.C00OOC00oO(var4 + var9 * 1.05F, var5 - var9 * 0.78F, var2.UuUVuuUu(1.9F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var8, 210));
         var1.C00OOC00oO(var4 - var9 * 1.0F, var5, var2.UuUVuuUu(1.9F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var8, 170));
         var1.C00OOC00oO(var4 + var9 * 0.92F, var5 + var9 * 0.78F, var2.UuUVuuUu(1.9F), 0.0F, 1.0F, var8);
      } else if (var6 == 6) {
         var1.UuUVuuUu(var4 - var9, var5 - var9 * 0.82F, var9 * 0.92F, var2.UuUVuuUu(2.2F), var2.UuUVuuUu(1.0F), var8);
         var1.UuUVuuUu(var4 - var9, var5 - var9 * 0.42F, var9 * 2.0F, var9 * 1.28F, var2.UuUVuuUu(1.6F), NUunUunuNV.UuUVuuUu(var8, 210));
         var1.UuUVuuUu(
            var4 - var9 * 0.74F, var5 - var9 * 0.12F, var9 * 1.48F, var2.UuUVuuUu(1.1F), var2.UuUVuuUu(0.5F), NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), 96)
         );
      } else if (var6 == 7) {
         var1.UuUVuuUu(var4 - var9, var5 - var9, var9 * 0.82F, var9 * 0.82F, var2.UuUVuuUu(1.4F), var8);
         var1.UuUVuuUu(var4 + var9 * 0.18F, var5 - var9, var9 * 0.82F, var9 * 0.82F, var2.UuUVuuUu(1.4F), NUunUunuNV.UuUVuuUu(var8, 176));
         var1.UuUVuuUu(var4 - var9, var5 + var9 * 0.18F, var9 * 2.0F, var2.UuUVuuUu(1.5F), var2.UuUVuuUu(0.8F), NUunUunuNV.UuUVuuUu(var8, 214));
         var1.UuUVuuUu(var4 - var9, var5 + var9 * 0.66F, var9 * 1.44F, var2.UuUVuuUu(1.5F), var2.UuUVuuUu(0.8F), NUunUunuNV.UuUVuuUu(var8, 150));
      } else {
         var1.UuUVuuUu(var4, var5);
         var1.C00OOC00oO(45.0F);
         var1.UuUVuuUu(-var9, -var2.UuUVuuUu(0.8F), var9 * 2.0F, var2.UuUVuuUu(1.6F), var2.UuUVuuUu(1.0F), var8);
         var1.VVuuUN();
         var1.C00OOC00oO(-45.0F);
         var1.UuUVuuUu(-var9, -var2.UuUVuuUu(0.8F), var9 * 2.0F, var2.UuUVuuUu(1.6F), var2.UuUVuuUu(1.0F), var8);
         var1.VVuuUN();
         var1.vNUvnnVnUvu();
      }
   }

   private void UuUVuuUu(String var1, nuVVnvn var2) {
      if (var1 != null && !var1.isBlank() && var2 != null) {
         if (var2 == this.UuuNnUvUuv) {
            this.UUuUnNVNuuv();
         }

         NNnUUVVnuUV var3 = this.VVuuUN.UuUVuuUu(var2);
         uNNnUu.UuUVuuUu().UuUVuuUu(var1, var2, var3, this.UuUVuuUu(var2));
      }
   }

   private void UuUVuuUu(VUvUNNUvvNVN var1) {
      if (var1 != null) {
         VnuVUNUv var2 = VnuVUNUv.UuUVuuUu(var1.uUnuvNvvNU());
         if (var2 == VnuVUNUv.PREVIEW_ONLY) {
            this.vNVuvnUUnuUn("preview-only slot");
         } else {
            lllilIiI11l var3 = lllilIiI11l.UuUVuuUu();
            if (var1.UuUVuuUu().equals(var3.C00OOC00oO(var2))) {
               this.UuUVuuUu(var2);
            } else {
               nuVVnvn var4 = var3.UuUVuuUu(var1.UuUVuuUu(), this.nuUnNvnuUu);
               if (var4 == null) {
                  this.vNVuvnUUnuUn("slot load failed");
               } else {
                  var4.UuUVuuUu(var2.UuUVuuUu());
                  NNnUUVVnuUV var5 = this.VVuuUN.UuUVuuUu(var4);
                  uNNnUu.UuUVuuUu().UuUVuuUu(var1.C00OOC00oO(), var4, var5, this.C00OOC00oO(var1));
                  uNNnUu.UuUVuuUu().UuUVuuUu(var2, var4, var5);
                  uVvVnUU.UuUVuuUu().UuUVuuUu(var2, var5);
                  var3.UuUVuuUu(var2, var1.UuUVuuUu());
                  ili11Iii1Ii.UuUVuuUu(var2, var1.C00OOC00oO());
                  this.vNVuvnUUnuUn("bound " + var2.C00OOC00oO());
               }
            }
         }
      }
   }

   private uNNnUu.nvnNNunvv UuUVuuUu(nuVVnvn var1) {
      if (var1 != null && var1.UuUVuuUu() != null) {
         String var2 = var1.UuUVuuUu().nuUnNvnuUu();
         if ("preset".equalsIgnoreCase(var2)) {
            return uNNnUu.nvnNNunvv.PRESET;
         } else {
            return !"imported".equalsIgnoreCase(var2) && !"shared".equalsIgnoreCase(var2) ? uNNnUu.nvnNNunvv.USER : uNNnUu.nvnNNunvv.IMPORTED;
         }
      } else {
         return uNNnUu.nvnNNunvv.USER;
      }
   }

   private uNNnUu.nvnNNunvv C00OOC00oO(VUvUNNUvvNVN var1) {
      if (var1 == null) {
         return uNNnUu.nvnNNunvv.USER;
      } else {
         String var2 = var1.vNUvnnVnUvu();
         if ("preset".equalsIgnoreCase(var2)) {
            return uNNnUu.nvnNNunvv.PRESET;
         } else {
            return !"imported".equalsIgnoreCase(var2) && !"shared".equalsIgnoreCase(var2) ? uNNnUu.nvnNNunvv.USER : uNNnUu.nvnNNunvv.IMPORTED;
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, vNvvVnNuUVvv var5) {
      float var6 = !var4.contains(var5.unnUnUNVnN(), var5.NnuUnUNnu()) && !this.VnVuuvVvnNv ? 0.0F : 1.0F;
      int var7 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var3) ? 76 : 14), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 64), var6);
      var1.UuUVuuUu(var4.x(), var4.y(), var4.w(), var4.h(), var2.UuUVuuUu(7.0F), var7);
      var1.UuUVuuUu(
         var4.x(),
         var4.y(),
         var4.w(),
         var4.h(),
         var2.UuUVuuUu(7.0F),
         NUunUunuNV.UuUVuuUu(var3.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 134), var6),
         this.VnVuuvVvnNv ? 1.0F : 0.7F
      );
      String var8 = this.nNunUnVN != null && !this.nNunUnVN.isBlank() ? this.nNunUnVN : "Shader name";
      int var9 = this.nNunUnVN != null && !this.nNunUnVN.isBlank() ? this.C00OOC00oO(var3) : this.uUnuvNvvNU(var3);
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(
         var4.x() + var2.UuUVuuUu(8.0F),
         var4.y(),
         var4.w() - var2.UuUVuuUu(16.0F),
         var4.h(),
         var2.UuUVuuUu(6.0F),
         var2.UuUVuuUu(6.0F),
         var2.UuUVuuUu(6.0F),
         var2.UuUVuuUu(6.0F)
      );
      boolean var14 = false /* VF: Semaphore variable */;

      try {
         var14 = true;
         nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var4.x() + var2.UuUVuuUu(10.0F), var4.y(), var4.h(), 10.0F, var8, var9);
         if (this.VnVuuvVvnNv) {
            if ((System.currentTimeMillis() - this.vuvvuVuVv) / 500L % 2L == 0L) {
               float var10 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var8, 10.0F);
               float var11 = Math.min(var4.x() + var4.w() - var2.UuUVuuUu(12.0F), var4.x() + var2.UuUVuuUu(10.0F) + var10 + var2.UuUVuuUu(2.0F));
               var1.UuUVuuUu(var11, var4.y() + var2.UuUVuuUu(6.0F), 1.0F, var4.h() - var2.UuUVuuUu(12.0F), 0.0F, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 240));
               var14 = false;
            } else {
               var14 = false;
            }
         } else {
            var14 = false;
         }
      } finally {
         if (var14) {
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }
      }

      var1.uUnuvNvvNU();
      var1.nuUnNvnuUu();
   }

   private void UuUVuuUu(VnuVUNUv var1) {
      if (var1 != null) {
         uNNnUu.UuUVuuUu().UuUVuuUu(var1);
         uVvVnUU.UuUVuuUu().uUnuvNvvNU(var1);
         lllilIiI11l.UuUVuuUu().UuUVuuUu(var1, null);
         ili11Iii1Ii.UuUVuuUu(var1);
         this.vNVuvnUUnuUn(var1.C00OOC00oO() + " unbound");
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void uUnuvNvvNU(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, int var4, int var5) {
      float var6 = this.vnvvNvUnVv.UuUVuuUu();
      if (this.VvVvnNUnvuvV || !(var6 <= 0.01F)) {
         nUvnuVnNUU var7 = var3.uNNnnnuuuN();
         NUunUunuNV var8 = var3.nuUnNvnuUu();
         vnvNNVNU var9 = this.uNNnnnuuuN(var7);
         var9 = new vnvNNVNU(var9.x(), var9.y() - var7.UuUVuuUu(9.0F) * (1.0F - var6), var9.w(), var9.h());
         float var10 = var7.UuUVuuUu(14.0F);
         var1.uNNnnnuuuN(var6);
         boolean var18 = false /* VF: Semaphore variable */;

         try {
            var18 = true;
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, var7.UuUVuuUu(24.0F), var7.UuUVuuUu(2.0F), this.uUnuvNvvNU(var8, 142));
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, this.UuUVuuUu(var8, 236));
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 82), 0.8F);
            nunvNNUnvU.UuUVuuUu(
               var1, var7, vNvnnVvvVUu.vVvUvVVuuNvV, var9.x() + var7.UuUVuuUu(12.0F), var9.y() + var7.UuUVuuUu(12.0F), 12.0F, "File", this.C00OOC00oO(var8)
            );
            nunvNNUnvU.UuUVuuUu(
               var1,
               var7,
               vNvnnVvvVUu.UuUVuuUu,
               var9.x() + var7.UuUVuuUu(12.0F),
               var9.y() + var7.UuUVuuUu(28.0F),
               8.0F,
               "autosave on / Ctrl+S saves the named slot",
               NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 190)
            );
            float var11 = var9.y() + var7.UuUVuuUu(48.0F);
            VUvUNNUvvNVN var12 = this.VNNnnVUuvv == null ? null : lllilIiI11l.UuUVuuUu().UuUVuuUu(this.VNNnnVUuvv);
            this.UuUVuuUu(var1, var7, var8, var9.x() + var7.UuUVuuUu(12.0F), var11, "File", var12 == null ? "unsaved" : var12.C00OOC00oO());
            this.UuUVuuUu(var1, var7, var8, var9.x() + var7.UuUVuuUu(12.0F), var11 + var7.UuUVuuUu(19.0F), "State", this.VVuuUN());
            this.UuUVuuUu(var1, var7, var8, var9.x() + var7.UuUVuuUu(12.0F), var11 + var7.UuUVuuUu(38.0F), "Target", this.NNUUNUuVNNVn.C00OOC00oO());
            this.UuUVuuUu(
               var1,
               var7,
               var8,
               var9.x() + var7.UuUVuuUu(12.0F),
               var11 + var7.UuUVuuUu(57.0F),
               "Uniforms",
               String.valueOf(this.VVuuUN.UuUVuuUu(this.UuuNnUvUuv).exposedUniforms().size())
            );
            this.UuUVuuUu(var1, var7, var8, var9.x() + var7.UuUVuuUu(12.0F), var11 + var7.UuUVuuUu(76.0F), "Source", this.UuuNnUvUuv.UuUVuuUu().nuUnNvnuUu());
            VUvUNNUvvNVN var13 = lllilIiI11l.UuUVuuUu().uUnuvNvvNU(this.NNUUNUuVNNVn);
            this.UuUVuuUu(var1, var7, var8, var9.x() + var7.UuUVuuUu(12.0F), var11 + var7.UuUVuuUu(95.0F), "Bound", var13 == null ? "-" : var13.C00OOC00oO());

            for (int var14 = 0; var14 < C00OOC00oO.length; var14++) {
               vnvNNVNU var15 = this.uUnuvNvvNU(var9, var7, var14);
               this.UuUVuuUu(var1, var7, var8, var15, C00OOC00oO[var14], var2.unnUnUNVnN(), var2.NnuUnUNnu(), var14 == 0 || var14 == 1);
            }

            var18 = false;
         } finally {
            if (var18) {
               var1.vuuuNvNuv();
            }
         }

         var1.vuuuNvNuv();
      }
   }

   private void vVvUvVVuuNvV(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, int var4, int var5) {
      float var6 = this.OCOocoOoOO.UuUVuuUu();
      if (this.ccOO0COcoco0 || !(var6 <= 0.01F)) {
         nUvnuVnNUU var7 = var3.uNNnnnuuuN();
         NUunUunuNV var8 = var3.nuUnNvnuUu();
         vnvNNVNU var9 = this.vVvUvVVuuNvV(var7, var4, var5);
         var9 = new vnvNNVNU(var9.x(), var9.y() - var7.UuUVuuUu(10.0F) * (1.0F - var6), var9.w(), var9.h());
         float var10 = var7.UuUVuuUu(14.0F);
         var1.uNNnnnuuuN(var6);

         try {
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, var7.UuUVuuUu(24.0F), var7.UuUVuuUu(2.0F), this.uUnuvNvvNU(var8, 148));
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, this.UuUVuuUu(var8, 238));
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 90), 0.8F);
            nunvNNUnvU.UuUVuuUu(
               var1,
               var7,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var9.x() + var7.UuUVuuUu(16.0F),
               var9.y() + var7.UuUVuuUu(14.0F),
               12.0F,
               "Target Studio",
               this.C00OOC00oO(var8)
            );
            nunvNNUnvU.UuUVuuUu(
               var1,
               var7,
               vNvnnVvvVUu.UuUVuuUu,
               var9.x() + var7.UuUVuuUu(16.0F),
               var9.y() + var7.UuUVuuUu(31.0F),
               8.0F,
               "pick where this shader runs — click a target to edit it",
               NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 190)
            );
            VnuVUNUv[] var11 = VnuVUNUv.UnUNVVVNuv();

            for (int var12 = 0; var12 < var11.length; var12++) {
               this.UuUVuuUu(var1, var7, var8, this.vVvUvVVuuNvV(var9, var7, var12), var11[var12], var2.unnUnUNVnN(), var2.NnuUnUNnu());
            }

            float var20 = var9.y() + var9.h() - var7.UuUVuuUu(76.0F);
            nunvNNUnvU.UuUVuuUu(
               var1,
               var7,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var9.x() + var7.UuUVuuUu(16.0F),
               var20,
               9.0F,
               "Shape Source",
               NUunUunuNV.UuUVuuUu(var8.UNnVVNvvnVvU(), 220)
            );
            String[] var13 = new String[]{"Host Rectangle", "Inset Shape", "Full Quad"};

            for (int var14 = 0; var14 < var13.length; var14++) {
               vnvNNVNU var15 = this.uNNnnnuuuN(var9, var7, var14);
               this.UuUVuuUu(var1, var7, var8, var15, var13[var14], this.UnvuVuVnNuvu.equals(var13[var14]), var2.unnUnUNVnN(), var2.NnuUnUNnu());
            }
         } finally {
            var1.vuuuNvNuv();
         }
      }
   }

   private void UvnvNVnnnnNU() {
      if (!this.NnVnNVN) {
         this.NnVnNVN = true;

         for (int var1 = 0; var1 < nuvUVvnNUN.UuUVuuUu.size(); var1++) {
            try {
               nuVVnvn var2 = nuvUVvnNUN.UuUVuuUu(nuvUVvnNUN.UuUVuuUu.get(var1), this.nuUnNvnuUu);
               this.nvuVvuNnNUnv.put(var1, this.VVuuUN.UuUVuuUu(var2));
            } catch (Throwable var3) {
            }
         }
      }
   }

   private void uNNnnnuuuN(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, int var4, int var5) {
      float var6 = this.o0Ooc0COOoc.UuUVuuUu();
      if (this.NUVvUUVuVNVv || !(var6 <= 0.01F)) {
         nUvnuVnNUU var7 = var3.uNNnnnuuuN();
         NUunUunuNV var8 = var3.nuUnNvnuUu();
         vnvNNVNU var9 = this.VVuuUN(var7, var4);
         var9 = new vnvNNVNU(var9.x() + var7.UuUVuuUu(10.0F) * (1.0F - var6), var9.y(), var9.w(), var9.h());
         float var10 = var7.UuUVuuUu(14.0F);
         var1.uNNnnnuuuN(var6);

         try {
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, var7.UuUVuuUu(22.0F), var7.UuUVuuUu(2.0F), this.uUnuvNvvNU(var8, 136));
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, this.UuUVuuUu(var8, 236));
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 84), 0.8F);
            nunvNNUnvU.UuUVuuUu(
               var1, var7, vNvnnVvvVUu.vVvUvVVuuNvV, var9.x() + var7.UuUVuuUu(16.0F), var9.y() + var7.UuUVuuUu(14.0F), 12.0F, "Settings", this.C00OOC00oO(var8)
            );
            nunvNNUnvU.UuUVuuUu(
               var1,
               var7,
               vNvnnVvvVUu.UuUVuuUu,
               var9.x() + var7.UuUVuuUu(16.0F),
               var9.y() + var7.UuUVuuUu(32.0F),
               8.0F,
               "core editor behavior",
               NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 184)
            );
            nunvNNUnvU.UuUVuuUu(
               var1,
               var7,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var9.x() + var7.UuUVuuUu(16.0F),
               var9.y() + var7.UuUVuuUu(64.0F),
               9.0F,
               "Foundry Theme",
               NUunUunuNV.UuUVuuUu(var8.UNnVVNvvnVvU(), 220)
            );
            NnnVVVUnVNuN.nvnNNunvv[] var11 = NnnVVVUnVNuN.nvnNNunvv.values();

            for (int var12 = 0; var12 < var11.length; var12++) {
               this.UuUVuuUu(
                  var1,
                  var7,
                  var8,
                  this.nuUnNvnuUu(var9, var7, var12),
                  var11[var12].UuUVuuUu(),
                  this.UvNNVUVNVuvV == var11[var12],
                  var2.unnUnUNVnN(),
                  var2.NnuUnUNnu()
               );
            }

            nunvNNUnvU.UuUVuuUu(
               var1,
               var7,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var9.x() + var7.UuUVuuUu(16.0F),
               var9.y() + var7.UuUVuuUu(118.0F),
               9.0F,
               "Shader Properties",
               NUunUunuNV.UuUVuuUu(var8.UNnVVNvvnVvU(), 220)
            );
            this.UuUVuuUu(
               var1, var7, var8, var9.x() + var7.UuUVuuUu(16.0F), var9.y() + var7.UuUVuuUu(140.0F), "Complexity", this.UuuNnUvUuv.UuUVuuUu().uNNnnnuuuN()
            );
            this.UuUVuuUu(
               var1,
               var7,
               var8,
               var9.x() + var7.UuUVuuUu(16.0F),
               var9.y() + var7.UuUVuuUu(162.0F),
               "Uniforms",
               String.valueOf(this.VVuuUN.UuUVuuUu(this.UuuNnUvUuv).exposedUniforms().size())
            );
            this.UuUVuuUu(var1, var7, var8, var9.x() + var7.UuUVuuUu(16.0F), var9.y() + var7.UuUVuuUu(184.0F), "Shape", this.UnvuVuVnNuvu);
         } finally {
            var1.vuuuNvNuv();
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void nuUnNvnuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, int var4, int var5) {
      float var6 = this.nvvnUnUn.UuUVuuUu();
      if ((this.UNvvunVVn || !(var6 <= 0.01F)) && this.nNuVunNUVu != null) {
         nUvnuVnNUU var7 = var3.uNNnnnuuuN();
         NUunUunuNV var8 = var3.nuUnNvnuUu();
         vnvNNVNU var9 = this.uNNnnnuuuN(var7, var4, var5);
         float var10 = var7.UuUVuuUu(14.0F);
         var1.uNNnnnuuuN(var6);
         boolean var13 = false /* VF: Semaphore variable */;

         try {
            var13 = true;
            var1.UuUVuuUu(0.0F, 0.0F, (float)var4, (float)var5, 0.0F, NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round((this.UuUVuuUu(var8) ? 42 : 82) * var6)));
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, var7.UuUVuuUu(26.0F), var7.UuUVuuUu(2.0F), this.uUnuvNvvNU(var8, 172));
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, this.UuUVuuUu(var8, 248));
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var10, NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 128), 0.9F);
            nunvNNUnvU.UuUVuuUu(
               var1,
               var7,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var9.x() + var7.UuUVuuUu(18.0F),
               var9.y() + var7.UuUVuuUu(16.0F),
               12.0F,
               "Switch Target",
               this.C00OOC00oO(var8)
            );
            nunvNNUnvU.UuUVuuUu(
               var1,
               var7,
               vNvnnVvvVUu.UuUVuuUu,
               var9.x() + var7.UuUVuuUu(18.0F),
               var9.y() + var7.UuUVuuUu(38.0F),
               9.0F,
               "Current graph has unsaved changes. Save before switching to " + this.nNuVunNUVu.C00OOC00oO() + ".",
               this.uUnuvNvvNU(var8)
            );
            this.UuUVuuUu(var1, var7, var8, this.nuUnNvnuUu(var9, var7), "Save & Switch", var2.unnUnUNVnN(), var2.NnuUnUNnu(), true);
            this.UuUVuuUu(var1, var7, var8, this.VVuuUN(var9, var7), "Switch", var2.unnUnUNVnN(), var2.NnuUnUNnu(), false);
            this.UuUVuuUu(var1, var7, var8, this.vNUvnnVnUvu(var9, var7), "Cancel", var2.unnUnUNVnN(), var2.NnuUnUNnu(), false);
            var13 = false;
         } finally {
            if (var13) {
               var1.vuuuNvNuv();
            }
         }

         var1.vuuuNvNuv();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, VnuVUNUv var5, float var6, float var7) {
      boolean var8 = var4.contains(var6, var7);
      boolean var9 = var5 == this.NNUUNUuVNNVn;
      VUvUNNUvvNVN var10 = lllilIiI11l.UuUVuuUu().uUnuvNvvNU(var5);
      boolean var11 = uNNnUu.UuUVuuUu().uNNnnnuuuN(var5);
      float var12 = Math.max(var9 ? 0.82F : 0.0F, var8 ? 0.7F : 0.0F);
      var1.UuUVuuUu(
         var4.x(),
         var4.y(),
         var4.w(),
         var4.h(),
         var2.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var3) ? 52 : 8), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 74), var12)
      );
      var1.UuUVuuUu(
         var4.x(),
         var4.y(),
         var4.w(),
         var4.h(),
         var2.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(var3.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var9 ? var3.uVunuUNVVUUV() : var3.UNnVVNvvnVvU(), var9 ? 150 : 96), var12),
         var9 ? 0.9F : 0.6F
      );
      int var13 = var9 ? var3.uVunuUNVVUUV() : NUunUunuNV.UuUVuuUu(120, 230, 150, 255);
      var1.C00OOC00oO(var4.x() + var2.UuUVuuUu(15.0F), var4.y() + var2.UuUVuuUu(15.0F), var2.UuUVuuUu(3.1F), 0.0F, 1.0F, var13);
      if (var9) {
         var1.UuUVuuUu(
            var4.x() + var2.UuUVuuUu(15.0F),
            var4.y() + var2.UuUVuuUu(15.0F),
            var2.UuUVuuUu(5.4F),
            0.0F,
            1.0F,
            0.9F,
            NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 150)
         );
      }

      nunvNNUnvU.UuUVuuUu(
         var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var4.x() + var2.UuUVuuUu(26.0F), var4.y() + var2.UuUVuuUu(8.0F), 10.0F, var5.C00OOC00oO(), this.C00OOC00oO(var3)
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.UuUVuuUu,
         var4.x() + var2.UuUVuuUu(26.0F),
         var4.y() + var2.UuUVuuUu(24.0F),
         7.5F,
         nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, this.C00OOC00oO(var5), 7.5F, var4.w() - var2.UuUVuuUu(96.0F)),
         this.uUnuvNvvNU(var3)
      );
      if (var11) {
         String var14 = var10 == null ? "runtime" : var10.C00OOC00oO();
         vnvNNVNU var15 = this.UuUVuuUu(var4, var2);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var2,
            vNvnnVvvVUu.UuUVuuUu,
            var4.x() + var4.w() - var2.UuUVuuUu(88.0F),
            var4.y() + var2.UuUVuuUu(25.0F),
            7.0F,
            nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, "◆ " + var14, 7.0F, var2.UuUVuuUu(44.0F)),
            NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 210)
         );
         boolean var16 = var15.contains(var6, var7);
         var1.UuUVuuUu(
            var15.x(),
            var15.y(),
            var15.w(),
            var15.h(),
            var2.UuUVuuUu(5.0F),
            NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), 24), NUunUunuNV.UuUVuuUu(220, 80, 92, 126), var16 ? 1.0F : 0.0F)
         );
         var1.UuUVuuUu(
            var15.x(), var15.y(), var15.w(), var15.h(), var2.UuUVuuUu(5.0F), NUunUunuNV.UuUVuuUu(var16 ? -33652 : var3.NVNnnvnuunNv(), var16 ? 220 : 72), 0.58F
         );
         float var17 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, "Off", 8.0F);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var2,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var15.x() + (var15.w() - var17) * 0.5F,
            var15.y(),
            var15.h(),
            8.0F,
            "Off",
            var16 ? var3.NVNnnvnuunNv() : var3.uVUVnuvnuVuv()
         );
      }
   }

   private vnvNNVNU UuUVuuUu(vnvNNVNU var1, nUvnuVnNUU var2) {
      return new vnvNNVNU(var1.x() + var1.w() - var2.UuUVuuUu(44.0F), var1.y() + var1.h() - var2.UuUVuuUu(20.0F), var2.UuUVuuUu(36.0F), var2.UuUVuuUu(15.0F));
   }

   private String C00OOC00oO(VnuVUNUv var1) {
      return switch (var1) {
         case HUD -> "Drives HUD element plates";
         case BACKGROUND -> "Drives the ClickGUI background";
         case ESP -> "Drives the TargetESP entity fill";
         default -> var1.uUnuvNvvNU();
      };
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, String var6, String var7) {
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var4, var5, 8.0F, var6, var3.uVUVnuvnuVuv());
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var4 + var2.UuUVuuUu(82.0F),
         var5 - var2.UuUVuuUu(1.0F),
         9.0F,
         var7 != null && !var7.isBlank() ? var7 : "-",
         this.C00OOC00oO(var3)
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, String var5, float var6, float var7, boolean var8) {
      float var9 = var4.contains(var6, var7) ? 1.0F : 0.0F;
      int var10 = NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var3) ? 72 : 12);
      int var11 = NUunUunuNV.UuUVuuUu(var8 ? var3.uVunuUNVVUUV() : var3.UNnVVNvvnVvU(), 88);
      var1.UuUVuuUu(var4.x(), var4.y(), var4.w(), var4.h(), var2.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(var10, var11, var9));
      var1.UuUVuuUu(
         var4.x(),
         var4.y(),
         var4.w(),
         var4.h(),
         var2.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(var3.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var8 ? var3.uVunuUNVVUUV() : var3.UNnVVNvvnVvU(), 122), var9),
         0.7F
      );
      int var12 = this.nuUnNvnuUu(var5);
      if (var12 >= 0 && var4.w() > var2.UuUVuuUu(78.0F)) {
         this.UuUVuuUu(var1, var2, var3, var4.x() + var2.UuUVuuUu(14.0F), var4.y() + var4.h() * 0.5F, var12, var8, var9);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var2,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var4.x() + var2.UuUVuuUu(28.0F),
            var4.y(),
            var4.h(),
            9.0F,
            nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var5, 9.0F, var4.w() - var2.UuUVuuUu(36.0F)),
            this.C00OOC00oO(var3)
         );
      } else {
         float var13 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var5, 9.0F);
         nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var4.x() + (var4.w() - var13) * 0.5F, var4.y(), var4.h(), 9.0F, var5, this.C00OOC00oO(var3));
      }
   }

   private int nuUnNvnuUu(String var1) {
      if (var1 == null) {
         return -1;
      } else if (var1.startsWith("Save")) {
         return 0;
      } else if (var1.startsWith("Slots")) {
         return 1;
      } else if (var1.startsWith("Export")) {
         return 2;
      } else if (var1.startsWith("Import")) {
         return 3;
      } else if (var1.startsWith("Open")) {
         return 4;
      } else if (var1.startsWith("Reset")) {
         return 5;
      } else if (var1.startsWith("Use")) {
         return 6;
      } else if (var1.startsWith("Merge")) {
         return 7;
      } else if (var1.startsWith("Cleanup")) {
         return 8;
      } else if (var1.startsWith("Switch")) {
         return 9;
      } else {
         return var1.startsWith("Cancel") ? 10 : -1;
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, int var6, boolean var7, float var8) {
      int var9 = NUunUunuNV.UuUVuuUu(var7 ? var3.uVunuUNVVUUV() : var3.UNnVVNvvnVvU(), Math.round(150.0F + 90.0F * var8));
      float var10 = var2.UuUVuuUu(5.2F);
      if (var6 == 0) {
         var1.UuUVuuUu(var4 - var10, var5 - var10, var10 * 2.0F, var10 * 2.0F, var2.UuUVuuUu(1.8F), var9);
         var1.UuUVuuUu(
            var4 - var10 * 0.58F, var5 + var10 * 0.1F, var10 * 1.16F, var10 * 0.52F, var2.UuUVuuUu(1.0F), NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), 115)
         );
      } else if (var6 == 1) {
         var1.UuUVuuUu(var4 - var10, var5 - var10, var10 * 0.78F, var10 * 0.78F, var2.UuUVuuUu(1.6F), var9);
         var1.UuUVuuUu(var4 + var10 * 0.22F, var5 - var10, var10 * 0.78F, var10 * 0.78F, var2.UuUVuuUu(1.6F), NUunUunuNV.UuUVuuUu(var9, 160));
         var1.UuUVuuUu(var4 - var10, var5 + var10 * 0.22F, var10 * 0.78F, var10 * 0.78F, var2.UuUVuuUu(1.6F), NUunUunuNV.UuUVuuUu(var9, 200));
      } else if (var6 == 2 || var6 == 3) {
         float var11 = var6 == 2 ? -1.0F : 1.0F;
         var1.UuUVuuUu(var4 - var2.UuUVuuUu(0.8F), var5 - var10 * 0.65F, var2.UuUVuuUu(1.6F), var10 * 1.3F, var2.UuUVuuUu(1.0F), var9);
         var1.UuUVuuUu(var4 - var10 * 0.72F, var5 + var11 * var10 * 0.55F, var10 * 1.44F, var2.UuUVuuUu(1.5F), var2.UuUVuuUu(1.0F), var9);
         var1.UuUVuuUu(var4 - var10, var5 - var11 * var10 * 0.95F, var10 * 2.0F, var2.UuUVuuUu(1.5F), var2.UuUVuuUu(1.0F), NUunUunuNV.UuUVuuUu(var9, 140));
      } else if (var6 == 4) {
         this.UuUVuuUu(var1, var2, var3, var4, var5, 0, var8);
      } else if (var6 == 5) {
         var1.C00OOC00oO(var4, var5, var10, 0.0F, 0.82F, NUunUunuNV.UuUVuuUu(var9, 90));
         var1.UuUVuuUu(var4 + var10 * 0.2F, var5 - var10 * 0.9F, var10 * 0.78F, var2.UuUVuuUu(1.4F), var2.UuUVuuUu(1.0F), var9);
      } else if (var6 == 8) {
         var1.UuUVuuUu(var4 - var10 * 0.5F, var5 - var10 * 0.32F, var10, var10 * 0.92F, var2.UuUVuuUu(1.4F), var9, 0.8F);
         var1.UuUVuuUu(var4 - var10 * 0.68F, var5 - var10 * 0.56F, var10 * 1.36F, var2.UuUVuuUu(1.3F), var2.UuUVuuUu(0.8F), var9);
         var1.UuUVuuUu(var4 - var10 * 0.22F, var5 - var10 * 0.82F, var10 * 0.44F, var2.UuUVuuUu(1.3F), var2.UuUVuuUu(0.8F), var9);
         var1.UuUVuuUu(var4 - var2.UuUVuuUu(0.6F), var5 - var10 * 0.1F, var2.UuUVuuUu(1.2F), var10 * 0.5F, var2.UuUVuuUu(0.5F), NUunUunuNV.UuUVuuUu(var9, 170));
      } else if (var6 == 9) {
         var1.C00OOC00oO(var4, var5, var10 * 0.9F, 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var9, 82));
         var1.C00OOC00oO(var4, var5, var10 * 0.38F, 0.0F, 1.0F, var9);
      } else if (var6 == 10) {
         var1.UuUVuuUu(var4, var5);
         var1.C00OOC00oO(45.0F);
         var1.UuUVuuUu(-var10 * 0.8F, -var2.UuUVuuUu(0.8F), var10 * 1.6F, var2.UuUVuuUu(1.6F), var2.UuUVuuUu(1.0F), var9);
         var1.VVuuUN();
         var1.C00OOC00oO(-45.0F);
         var1.UuUVuuUu(-var10 * 0.8F, -var2.UuUVuuUu(0.8F), var10 * 1.6F, var2.UuUVuuUu(1.6F), var2.UuUVuuUu(1.0F), var9);
         var1.VVuuUN();
         var1.vNUvnnVnUvu();
      } else {
         var1.C00OOC00oO(var4, var5, var10, 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var9, var6 == 6 ? 165 : 92));
         var1.C00OOC00oO(var4, var5, var10 * 0.38F, 0.0F, 1.0F, var9);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, String var5, boolean var6, float var7, float var8) {
      float var9 = var4.contains(var7, var8) ? 1.0F : 0.0F;
      float var10 = Math.max(var6 ? 0.84F : 0.0F, var9);
      var1.UuUVuuUu(
         var4.x(),
         var4.y(),
         var4.w(),
         var4.h(),
         var2.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var3) ? 64 : 10), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 92), var10)
      );
      var1.UuUVuuUu(
         var4.x(),
         var4.y(),
         var4.w(),
         var4.h(),
         var2.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(var6 ? var3.uVunuUNVVUUV() : var3.NVNnnvnuunNv(), var6 ? 150 : 42),
         0.65F
      );
      float var11 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var5, 8.0F);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.UuUVuuUu,
         var4.x() + (var4.w() - var11) * 0.5F,
         var4.y(),
         var4.h(),
         8.0F,
         var5,
         var6 ? this.C00OOC00oO(var3) : this.uUnuvNvvNU(var3)
      );
   }

   private void VVuuUN(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, int var4, int var5) {
      nUvnuVnNUU var6 = var3.uNNnnnuuuN();
      NUunUunuNV var7 = var3.nuUnNvnuUu();
      vnvNNVNU var8 = this.uUnuvNvvNU(var6, var5);
      boolean var9 = var8.contains(var2.unnUnUNVnN(), var2.NnuUnUNnu());
      var1.UuUVuuUu(
         var8.x(),
         var8.y(),
         var8.w(),
         var8.h(),
         var6.UuUVuuUu(7.0F),
         NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, 8), NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 64), var9 ? 1.0F : 0.0F)
      );
      var1.UuUVuuUu(var8.x(), var8.y(), var8.w(), var8.h(), var6.UuUVuuUu(7.0F), NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 96), 0.7F);
      String var10 = this.nnvuvUNuUnN ? ">" : "<";
      float var11 = nunvNNUnvU.UuUVuuUu(var6, vNvnnVvvVUu.vVvUvVVuuNvV, var10, 10.0F);
      nunvNNUnvU.UuUVuuUu(var1, var6, vNvnnVvvVUu.vVvUvVVuuNvV, var8.x() + (var8.w() - var11) * 0.5F, var8.y(), var8.h(), 10.0F, var10, var7.NVNnnvnuunNv());
      if (!this.nnvuvUNuUnN) {
         vnvNNVNU var12 = this.C00OOC00oO(var6, var5);
         float var13 = var6.UuUVuuUu(14.0F);
         var1.UuUVuuUu(var12.x(), var12.y(), var12.w(), var12.h(), var13, var6.UuUVuuUu(18.0F), var6.UuUVuuUu(2.0F), this.uUnuvNvvNU(var7, 118));
         var1.UuUVuuUu(var12.x(), var12.y(), var12.w(), var12.h(), var13, this.C00OOC00oO(var7, 220));
         var1.UuUVuuUu(var12.x(), var12.y(), var12.w(), var12.h(), var13, var7.nvUVNnuu(), 0.7F);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var6,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var12.x() + var6.UuUVuuUu(15.0F),
            var12.y() + var6.UuUVuuUu(14.0F),
            12.0F,
            "Node Library",
            var7.NVNnnvnuunNv()
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var6,
            vNvnnVvvVUu.UuUVuuUu,
            var12.x() + var6.UuUVuuUu(15.0F),
            var12.y() + var6.UuUVuuUu(28.0F),
            8.0F,
            "click to spawn / RMB opens search",
            NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 156)
         );
         this.UuUVuuUu(var1, var6, var7, this.UuUVuuUu(var6, var5));
         List var14 = this.uVUVnuvnuVuv();
         float var15 = var12.y() + var6.UuUVuuUu(74.0F);
         float var16 = var12.y() + var12.h() - var6.UuUVuuUu(14.0F);
         float var17 = Math.max(1.0F, var16 - var15);
         float var18 = this.UuUVuuUu(var6, var14);
         this.UVnuVUUVnnU = C00OOC00oO(this.UVnuVUUVnnU, 0.0F, Math.max(0.0F, var18 - var17));
         vnvnuNuUVn var19 = vnvnuNuUVn.UuUVuuUu();
         var1.uUnuvNvvNU();
         var1.UuUVuuUu(
            var12.x() + var6.UuUVuuUu(8.0F),
            var15,
            var12.w() - var6.UuUVuuUu(16.0F),
            var17,
            var6.UuUVuuUu(8.0F),
            var6.UuUVuuUu(8.0F),
            var6.UuUVuuUu(8.0F),
            var6.UuUVuuUu(8.0F)
         );

         try {
            float var20 = var15 - this.UVnuVUUVnnU;

            for (NnnVVVUnVNuN.uunvUUVnuNn var22 : var14) {
               if (var22.type() == 0) {
                  float var37 = var6.UuUVuuUu(20.0F);
                  if (var20 + var37 >= var15 && var20 <= var16) {
                     boolean var39 = var2.unnUnUNVnN() >= var12.x() + var6.UuUVuuUu(8.0F)
                        && var2.unnUnUNVnN() < var12.x() + var12.w() - var6.UuUVuuUu(8.0F)
                        && var2.NnuUnUNnu() >= var20
                        && var2.NnuUnUNnu() < var20 + var37;
                     boolean var41 = this.VvVuvUvvNNVv.contains(var22.category());
                     if (var39) {
                        var1.UuUVuuUu(
                           var12.x() + var6.UuUVuuUu(8.0F),
                           var20,
                           var12.w() - var6.UuUVuuUu(16.0F),
                           var37,
                           var6.UuUVuuUu(6.0F),
                           NUunUunuNV.UuUVuuUu(var7.UNnVVNvvnVvU(), 26)
                        );
                     }

                     nunvNNUnvU.UuUVuuUu(
                        var1,
                        var6,
                        vNvnnVvvVUu.vVvUvVVuuNvV,
                        var12.x() + var6.UuUVuuUu(14.0F),
                        var20,
                        var37,
                        8.0F,
                        (var41 ? "▸ " : "▾ ") + var22.category().toUpperCase(Locale.ROOT),
                        NUunUunuNV.UuUVuuUu(var7.UNnVVNvvnVvU(), var39 ? 245 : 210)
                     );
                     String var43 = String.valueOf(var22.count());
                     float var45 = nunvNNUnvU.UuUVuuUu(var6, vNvnnVvvVUu.UuUVuuUu, var43, 8.0F);
                     nunvNNUnvU.UuUVuuUu(
                        var1,
                        var6,
                        vNvnnVvvVUu.UuUVuuUu,
                        var12.x() + var12.w() - var6.UuUVuuUu(18.0F) - var45,
                        var20,
                        var37,
                        8.0F,
                        var43,
                        NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), var39 ? 210 : 140)
                     );
                  }

                  var20 += var6.UuUVuuUu(22.0F);
               } else {
                  uuUnNVuuVUu var23 = var22.def();
                  float var24 = var6.UuUVuuUu(24.0F);
                  if (var20 + var24 >= var15 && var20 <= var16) {
                     boolean var25 = var2.unnUnUNVnN() >= var12.x() + var6.UuUVuuUu(8.0F)
                        && var2.unnUnUNVnN() < var12.x() + var12.w() - var6.UuUVuuUu(8.0F)
                        && var2.NnuUnUNnu() >= var20
                        && var2.NnuUnUNnu() < var20 + var24;
                     float var26 = var25 ? 1.0F : 0.0F;
                     boolean var27 = var19.UuUVuuUu(var23.UuUVuuUu());
                     var1.UuUVuuUu(
                        var12.x() + var6.UuUVuuUu(8.0F),
                        var20,
                        var12.w() - var6.UuUVuuUu(16.0F),
                        var24,
                        var6.UuUVuuUu(7.0F),
                        NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, 4), NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 54), var26)
                     );
                     var1.C00OOC00oO(
                        var12.x() + var6.UuUVuuUu(19.0F),
                        var20 + var24 * 0.5F,
                        var6.UuUVuuUu(2.6F),
                        0.0F,
                        1.0F,
                        this.UuUVuuUu(var23.nuUnNvnuUu().isEmpty() ? null : var23.nuUnNvnuUu().get(0), var7)
                     );
                     nunvNNUnvU.UuUVuuUu(
                        var1,
                        var6,
                        vNvnnVvvVUu.UuUVuuUu,
                        var12.x() + var6.UuUVuuUu(31.0F),
                        var20,
                        var24,
                        9.0F,
                        nunvNNUnvU.UuUVuuUu(var6, vNvnnVvvVUu.UuUVuuUu, var23.C00OOC00oO(), 9.0F, var12.w() - var6.UuUVuuUu(112.0F)),
                        var25 ? var7.NVNnnvnuunNv() : var7.uVUVnuvnuVuv()
                     );
                     String var28 = var23.nuUnNvnuUu().isEmpty() ? "out" : var23.nuUnNvnuUu().get(0).type().UuUVuuUu();
                     nunvNNUnvU.UuUVuuUu(
                        var1,
                        var6,
                        vNvnnVvvVUu.UuUVuuUu,
                        var12.x() + var12.w() - var6.UuUVuuUu(72.0F),
                        var20,
                        var24,
                        8.0F,
                        var28,
                        NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), var25 ? 230 : 150)
                     );
                     if (var27 || var25) {
                        vnvNNVNU var29 = this.UuUVuuUu(var12, var6, var20, var24);
                        boolean var30 = var29.contains(var2.unnUnUNVnN(), var2.NnuUnUNnu());
                        this.UuUVuuUu(
                           var1, var6, var7, var29.x() + var29.w() * 0.5F, var29.y() + var29.h() * 0.5F, var27, var30 ? 1.0F : (var27 ? 0.8F : 0.35F)
                        );
                     }
                  }

                  var20 += var6.UuUVuuUu(26.0F);
               }
            }

            if (var14.isEmpty()) {
               nunvNNUnvU.UuUVuuUu(
                  var1,
                  var6,
                  vNvnnVvvVUu.UuUVuuUu,
                  var12.x() + var6.UuUVuuUu(16.0F),
                  var15 + var6.UuUVuuUu(10.0F),
                  9.0F,
                  "no matching nodes",
                  var7.uVUVnuvnuVuv()
               );
            }
         } finally {
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }

         if (var18 > var17 + 1.0F) {
            float var34 = var12.x() + var12.w() - var6.UuUVuuUu(8.0F);
            float var35 = var15 + var6.UuUVuuUu(2.0F);
            float var36 = var17 - var6.UuUVuuUu(4.0F);
            float var38 = Math.max(var6.UuUVuuUu(34.0F), var36 * var17 / var18);
            float var40 = Math.max(1.0F, var18 - var17);
            float var42 = var35 + (var36 - var38) * (this.UVnuVUUVnnU / var40);
            float var44 = uVNuNVvuvNNU.UuUVuuUu(
               7101L,
               var34 - var6.UuUVuuUu(3.0F),
               var35,
               var6.UuUVuuUu(8.0F),
               var36,
               var42,
               var38,
               var6.UuUVuuUu(6.0F),
               var2.unnUnUNVnN(),
               var2.NnuUnUNnu(),
               var2x -> this.UVnuVUUVnnU = C00OOC00oO(var2x, 0.0F, 1.0F) * var40
            );
            float var46 = var6.UuUVuuUu(2.0F) + var6.UuUVuuUu(2.0F) * var44;
            var1.UuUVuuUu(var34, var35, var6.UuUVuuUu(2.0F), var36, var6.UuUVuuUu(1.0F), var7.uVUuuVnNVU());
            var1.UuUVuuUu(
               var34 + var6.UuUVuuUu(2.0F) - var46,
               var42,
               var46,
               var38,
               var6.UuUVuuUu(1.5F),
               NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), (int)(142.0F + 90.0F * var44))
            );
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4) {
      float var5 = this.UnnnvvU ? 1.0F : 0.0F;
      float var6 = var2.UuUVuuUu(7.0F);
      var1.UuUVuuUu(var4.x(), var4.y(), var4.w(), var4.h(), var6, NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var3) ? 78 : 12));
      var1.UuUVuuUu(
         var4.x(),
         var4.y(),
         var4.w(),
         var4.h(),
         var6,
         NUunUunuNV.UuUVuuUu(var3.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 176), Math.max(var5, this.NnuUnUNnu.isEmpty() ? 0.0F : 0.5F)),
         this.UnnnvvU ? 1.0F : 0.65F
      );
      float var7 = var4.x() + var2.UuUVuuUu(11.0F);
      float var8 = var4.y() + var4.h() * 0.5F - var2.UuUVuuUu(1.0F);
      var1.UuUVuuUu(var7, var8, var2.UuUVuuUu(3.2F), 0.0F, 1.0F, 1.2F, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 220));
      var1.UuUVuuUu(var7 + var2.UuUVuuUu(2.4F), var8 + var2.UuUVuuUu(2.4F), var2.UuUVuuUu(3.8F), 1.2F, 0.6F, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 220));
      float var9 = var4.x() + var2.UuUVuuUu(21.0F);
      String var10 = this.NnuUnUNnu.isEmpty() ? "Search nodes…" : this.NnuUnUNnu;
      int var11 = this.NnuUnUNnu.isEmpty() ? this.uUnuvNvvNU(var3) : this.C00OOC00oO(var3);
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(var4.x() + var2.UuUVuuUu(4.0F), var4.y(), var4.w() - var2.UuUVuuUu(8.0F), var4.h(), var6, var6, var6, var6);

      try {
         nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var9, var4.y(), var4.h(), 9.0F, var10, var11);
         if (this.UnnnvvU && (System.currentTimeMillis() - this.VUUnuVvVu) / 500L % 2L == 0L) {
            float var12 = var9
               + (this.NnuUnUNnu.isEmpty() ? 0.0F : nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, this.NnuUnUNnu, 9.0F) + var2.UuUVuuUu(1.5F));
            var1.UuUVuuUu(
               Math.min(var12, var4.x() + var4.w() - var2.UuUVuuUu(8.0F)),
               var4.y() + var2.UuUVuuUu(4.5F),
               1.0F,
               var4.h() - var2.UuUVuuUu(9.0F),
               0.0F,
               NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 240)
            );
         }
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, boolean var6, float var7) {
      int var8 = NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), Math.round(120.0F + 130.0F * var7));
      float var9 = var2.UuUVuuUu(2.9F);
      if (var6) {
         var1.UuUVuuUu(var4 - var9, var5 - var9, var9 * 2.0F, var9 * 2.0F, var2.UuUVuuUu(1.0F), var8);
         var1.UuUVuuUu(var4, var5);
         var1.C00OOC00oO(45.0F);
         var1.UuUVuuUu(-var9, -var9, var9 * 2.0F, var9 * 2.0F, var2.UuUVuuUu(1.0F), NUunUunuNV.UuUVuuUu(var8, 210));
         var1.VVuuUN();
         var1.vNUvnnVnUvu();
         var1.C00OOC00oO(var4, var5, var2.UuUVuuUu(1.4F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), 200));
      } else {
         var1.UuUVuuUu(var4 - var9, var5 - var9, var9 * 2.0F, var9 * 2.0F, var2.UuUVuuUu(1.0F), var8, 0.7F);
         var1.UuUVuuUu(var4, var5);
         var1.C00OOC00oO(45.0F);
         var1.UuUVuuUu(-var9, -var9, var9 * 2.0F, var9 * 2.0F, var2.UuUVuuUu(1.0F), NUunUunuNV.UuUVuuUu(var8, 150), 0.7F);
         var1.VVuuUN();
         var1.vNUvnnVnUvu();
      }
   }

   private vnvNNVNU UuUVuuUu(nUvnuVnNUU var1, int var2) {
      vnvNNVNU var3 = this.C00OOC00oO(var1, var2);
      return new vnvNNVNU(var3.x() + var1.UuUVuuUu(10.0F), var3.y() + var1.UuUVuuUu(42.0F), var3.w() - var1.UuUVuuUu(20.0F), var1.UuUVuuUu(22.0F));
   }

   private vnvNNVNU UuUVuuUu(vnvNNVNU var1, nUvnuVnNUU var2, float var3, float var4) {
      return new vnvNNVNU(var1.x() + var1.w() - var2.UuUVuuUu(30.0F), var3 + (var4 - var2.UuUVuuUu(16.0F)) * 0.5F, var2.UuUVuuUu(16.0F), var2.UuUVuuUu(16.0F));
   }

   private List<NnnVVVUnVNuN.uunvUUVnuNn> uVUVnuvnuVuv() {
      ArrayList var1 = new ArrayList();
      String var2 = this.NnuUnUNnu == null ? "" : this.NnuUnUNnu.toLowerCase(Locale.ROOT).trim();
      if (var2.isEmpty()) {
         vnvnuNuUVn var10 = vnvnuNuUVn.UuUVuuUu();
         ArrayList var12 = new ArrayList();

         for (String var16 : var10.C00OOC00oO()) {
            uuUnNVuuVUu var7 = this.nuUnNvnuUu.UuUVuuUu(var16);
            if (var7 != null) {
               var12.add(var7);
            }
         }

         this.UuUVuuUu(var1, "Избранное", var12);
         ArrayList var15 = new ArrayList();

         for (String var19 : var10.uUnuvNvvNU()) {
            uuUnNVuuVUu var8 = this.nuUnNvnuUu.UuUVuuUu(var19);
            if (var8 != null) {
               var15.add(var8);
            }
         }

         this.UuUVuuUu(var1, "Недавние", var15);
         String var18 = null;
         ArrayList var20 = new ArrayList();

         for (uuUnNVuuVUu var9 : this.uUVuVvuNUvnu()) {
            if (!var9.uUnuvNvvNU().equals(var18)) {
               if (var18 != null) {
                  this.UuUVuuUu(var1, var18, var20);
               }

               var18 = var9.uUnuvNvvNU();
               var20 = new ArrayList();
            }

            var20.add(var9);
         }

         if (var18 != null) {
            this.UuUVuuUu(var1, var18, var20);
         }

         return var1;
      } else {
         ArrayList var3 = new ArrayList();

         for (uuUnNVuuVUu var5 : this.nuUnNvnuUu.UuUVuuUu()) {
            VNUUuvNvNVu.NVnVnNnN var6 = VNUUuvNvNVu.UuUVuuUu(var5, var2);
            if (var6 != null) {
               var3.add(var6);
            }
         }

         var3.sort(Comparator.<VNUUuvNvNVu.NVnVnNnN>comparingInt(var0 -> -var0.score()).thenComparing(var0 -> var0.def().C00OOC00oO()));

         for (VNUUuvNvNVu.NVnVnNnN var13 : var3) {
            var1.add(new NnnVVVUnVNuN.uunvUUVnuNn(1, var13.def().uUnuvNvvNU(), var13.def(), 0));
         }

         return var1;
      }
   }

   private void UuUVuuUu(List<NnnVVVUnVNuN.uunvUUVnuNn> var1, String var2, List<uuUnNVuuVUu> var3) {
      if (!var3.isEmpty()) {
         var1.add(new NnnVVVUnVNuN.uunvUUVnuNn(0, var2, null, var3.size()));
         if (!this.VvVuvUvvNNVv.contains(var2)) {
            for (uuUnNVuuVUu var5 : var3) {
               var1.add(new NnnVVVUnVNuN.uunvUUVnuNn(1, var2, var5, 0));
            }
         }
      }
   }

   private float UuUVuuUu(nUvnuVnNUU var1, List<NnnVVVUnVNuN.uunvUUVnuNn> var2) {
      float var3 = 0.0F;

      for (NnnVVVUnVNuN.uunvUUVnuNn var5 : var2) {
         var3 += var5.type() == 0 ? var1.UuUVuuUu(22.0F) : var1.UuUVuuUu(26.0F);
      }

      return var3;
   }

   private NnnVVVUnVNuN.nvUnvV UuUVuuUu(nUvnuVnNUU var1, int var2, float var3, float var4) {
      vnvNNVNU var5 = this.C00OOC00oO(var1, var2);
      float var6 = var5.y() + var1.UuUVuuUu(74.0F);
      float var7 = var5.y() + var5.h() - var1.UuUVuuUu(14.0F);
      if (!(var4 < var6) && !(var4 > var7) && !(var3 < var5.x() + var1.UuUVuuUu(8.0F)) && !(var3 >= var5.x() + var5.w() - var1.UuUVuuUu(8.0F))) {
         float var8 = var6 - this.UVnuVUUVnnU;

         for (NnnVVVUnVNuN.uunvUUVnuNn var10 : this.uVUVnuvnuVuv()) {
            if (var10.type() == 0) {
               if (var4 >= var8 && var4 < var8 + var1.UuUVuuUu(20.0F)) {
                  return new NnnVVVUnVNuN.nvUnvV(var10, false);
               }

               var8 += var1.UuUVuuUu(22.0F);
            } else {
               float var11 = var1.UuUVuuUu(24.0F);
               if (var4 >= var8 && var4 < var8 + var11) {
                  boolean var12 = this.UuUVuuUu(var5, var1, var8, var11).contains(var3, var4);
                  return new NnnVVVUnVNuN.nvUnvV(var10, var12);
               }

               var8 += var1.UuUVuuUu(26.0F);
               if (var8 > var7 + var1.UuUVuuUu(26.0F)) {
                  break;
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, int var4, int var5, float var6) {
      nUvnuVnNUU var7 = var3.uNNnnnuuuN();
      NUunUunuNV var8 = var3.nuUnNvnuUu();
      vnvNNVNU var9 = this.C00OOC00oO(var7, var4, var5);
      float var10 = var9.w();
      float var11 = var9.h();
      float var12 = var9.x();
      float var13 = var9.y();
      float var14 = var7.UuUVuuUu(15.0F);
      var1.UuUVuuUu(var12, var13, var10, var11, var14, var7.UuUVuuUu(22.0F), var7.UuUVuuUu(2.0F), this.uUnuvNvvNU(var8, 138));
      var1.UuUVuuUu(var12, var13, var10, var11, var14, this.C00OOC00oO(var8, 210));
      var1.UuUVuuUu(var12, var13, var10, var11, var14, NUunUunuNV.UuUVuuUu(var8.UNnVVNvvnVvU(), 56), 0.8F);
      float var15 = var7.UuUVuuUu(12.0F);
      float var16 = var11 - var7.UuUVuuUu(50.0F);
      float var17 = var10 - var15 * 2.0F;
      float var18 = var12 + var15;
      float var19 = var13 + var7.UuUVuuUu(38.0F);
      uNvUNnnVVVnU.UuUVuuUu(
         var1, var3, this.NNUUNUuVNNVn, this.vNUvnnVnUvu, this.UuuNnUvUuv, var18, var19, var17, var16, var4, var5, var2.unnUnUNVnN(), var2.NnuUnUNnu(), var6
      );
      String var20 = this.vNUvnnVnUvu.C00OOC00oO();
      float var21 = var7.UuUVuuUu(9.0F);
      if (!var20.isBlank()) {
         var1.UuUVuuUu(var18, var19, var17, var16, var21, NUunUunuNV.UuUVuuUu(8, 4, 6, Math.round(150.0F * var6)));
         var1.UuUVuuUu(var18, var19, var17, var16, var21, NUunUunuNV.UuUVuuUu(255, 110, 124, Math.round(142.0F * var6)), 0.7F);
         String var22 = "compile failed";
         float var23 = nunvNNUnvU.UuUVuuUu(var7, vNvnnVvvVUu.vVvUvVVuuNvV, var22, 10.0F);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var7,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var18 + (var17 - var23) * 0.5F,
            var19 + var16 * 0.5F - var7.UuUVuuUu(17.0F),
            var7.UuUVuuUu(14.0F),
            10.0F,
            var22,
            NUunUunuNV.UuUVuuUu(255, 132, 132, 240)
         );
         String var24 = nunvNNUnvU.UuUVuuUu(var7, vNvnnVvvVUu.UuUVuuUu, var20, 8.0F, var17 - var7.UuUVuuUu(24.0F));
         float var25 = nunvNNUnvU.UuUVuuUu(var7, vNvnnVvvVUu.UuUVuuUu, var24, 8.0F);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var7,
            vNvnnVvvVUu.UuUVuuUu,
            var18 + (var17 - var25) * 0.5F,
            var19 + var16 * 0.5F + var7.UuUVuuUu(1.0F),
            var7.UuUVuuUu(12.0F),
            8.0F,
            var24,
            NUunUunuNV.UuUVuuUu(255, 182, 188, 218)
         );
      } else if (this.vNUvnnVnUvu.uUnuvNvvNU().isBlank()) {
         var1.C00OOC00oO(
            var18,
            var19,
            var17,
            var16,
            var21,
            NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), Math.round(52.0F * var6)),
            NUunUunuNV.UuUVuuUu(var8.UNnVVNvvnVvU(), Math.round(30.0F * var6))
         );
         var1.UuUVuuUu(var18, var19, var17, var16, var21, NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), Math.round(74.0F * var6)), 0.6F);
         String var26 = "connect Master Output to see the result";
         float var27 = nunvNNUnvU.UuUVuuUu(var7, vNvnnVvvVUu.UuUVuuUu, var26, 9.0F);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var7,
            vNvnnVvvVUu.UuUVuuUu,
            var18 + (var17 - var27) * 0.5F,
            var19 + var16 * 0.5F - var7.UuUVuuUu(7.0F),
            var7.UuUVuuUu(14.0F),
            9.0F,
            var26,
            this.uUnuvNvvNU(var8)
         );
      }

      nunvNNUnvU.UuUVuuUu(var1, var7, vNvnnVvvVUu.vVvUvVVuuNvV, var12 + var15, var13 + var7.UuUVuuUu(12.0F), 11.0F, "Master Preview", var8.NVNnnvnuunNv());
      nunvNNUnvU.UuUVuuUu(
         var1,
         var7,
         vNvnnVvvVUu.UuUVuuUu,
         var12 + var15 + var7.UuUVuuUu(108.0F),
         var13 + var7.UuUVuuUu(14.0F),
         9.0F,
         this.NNUUNUuVNNVn.C00OOC00oO(),
         NUunUunuNV.UuUVuuUu(var8.UNnVVNvvnVvU(), 220)
      );
   }

   private void vNUvnnVnUvu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, int var4, int var5) {
      nUvnuVnNUU var6 = var3.uNNnnnuuuN();
      NUunUunuNV var7 = var3.nuUnNvnuUu();
      vnvNNVNU var8 = this.UuUVuuUu(var6, var4, var5);
      float var9 = var6.UuUVuuUu(14.0F);
      var1.UuUVuuUu(var8.x(), var8.y(), var8.w(), var8.h(), var9, var6.UuUVuuUu(20.0F), var6.UuUVuuUu(2.0F), this.uUnuvNvvNU(var7, 132));
      var1.UuUVuuUu(var8.x(), var8.y(), var8.w(), var8.h(), var9, this.UuUVuuUu(var7, 214));
      var1.UuUVuuUu(var8.x(), var8.y(), var8.w(), var8.h(), var9, NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 58), 0.7F);
      VUnvuNuVUUn var10 = this.UvUvUNuvNU();
      if (var10 == null) {
         nunvNNUnvU.UuUVuuUu(
            var1,
            var6,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var8.x() + var6.UuUVuuUu(14.0F),
            var8.y() + var6.UuUVuuUu(14.0F),
            12.0F,
            "Shader Settings",
            var7.NVNnnvnuunNv()
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var6,
            vNvnnVvvVUu.UuUVuuUu,
            var8.x() + var6.UuUVuuUu(14.0F),
            var8.y() + var6.UuUVuuUu(32.0F),
            8.0F,
            this.NNUUNUuVNNVn.C00OOC00oO() + " / " + this.UnvuVuVnNuvu,
            NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 190)
         );
         this.C00OOC00oO(var1, var6, var7, var8);
      } else {
         uuUnNVuuVUu var11 = this.nuUnNvnuUu.UuUVuuUu(var10.C00OOC00oO());
         if (var11 != null) {
            nunvNNUnvU.UuUVuuUu(
               var1,
               var6,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var8.x() + var6.UuUVuuUu(14.0F),
               var8.y() + var6.UuUVuuUu(14.0F),
               12.0F,
               var11.C00OOC00oO(),
               var7.NVNnnvnuunNv()
            );
            nunvNNUnvU.UuUVuuUu(
               var1,
               var6,
               vNvnnVvvVUu.UuUVuuUu,
               var8.x() + var6.UuUVuuUu(14.0F),
               var8.y() + var6.UuUVuuUu(30.0F),
               8.0F,
               var11.uUnuvNvvNU() + " / " + var10.C00OOC00oO(),
               NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 190)
            );
            this.UuUVuuUu(var1, var6, var7, var8, var11, var10);
            float var12 = var8.y() + var6.UuUVuuUu(74.0F);
            if (var11.vNUvnnVnUvu()) {
               vnvNNVNU var13 = this.C00OOC00oO(var8, var6);
               boolean var14 = Boolean.TRUE.equals(this.NvnnUUuVvNU.get(var10.UuUVuuUu()));
               boolean var15 = var13.contains(var2.unnUnUNVnN(), var2.NnuUnUNnu());
               var1.UuUVuuUu(
                  var13.x(),
                  var13.y(),
                  var13.w(),
                  var13.h(),
                  var6.UuUVuuUu(7.0F),
                  NUunUunuNV.UuUVuuUu(
                     var7.uVUuuVnNVU(), NUunUunuNV.UuUVuuUu(var14 ? var7.UNnVVNvvnVvU() : var7.uVunuUNVVUUV(), 76), !var15 && !var14 ? 0.0F : 1.0F
                  )
               );
               var1.UuUVuuUu(var13.x(), var13.y(), var13.w(), var13.h(), var6.UuUVuuUu(7.0F), NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), var14 ? 150 : 84), 0.65F);
               String var16 = var14 ? "Preview ON" : "Preview OFF";
               float var17 = nunvNNUnvU.UuUVuuUu(var6, vNvnnVvvVUu.UuUVuuUu, var16, 9.0F);
               nunvNNUnvU.UuUVuuUu(
                  var1, var6, vNvnnVvvVUu.UuUVuuUu, var13.x() + (var13.w() - var17) * 0.5F, var13.y(), var13.h(), 9.0F, var16, var7.NVNnnvnuunNv()
               );
            }

            if ("float_value".equals(var10.C00OOC00oO())) {
               this.UuUVuuUu(var1, var6, var7, var10, "value", "Value", -12.0F, 12.0F, 0.01F, 0.5F, var8, 0, var2);
            } else if ("int_value".equals(var10.C00OOC00oO())) {
               this.UuUVuuUu(var1, var6, var7, var10, "value", "Value", -64.0F, 64.0F, 1.0F, 1.0F, var8, 0, var2);
            } else if ("exposed_float".equals(var10.C00OOC00oO())) {
               this.UuUVuuUu(var1, var6, var7, var10, "name", "Name", var8, 0, var2);
               float var19 = var10.UuUVuuUu("min", 0.0F);
               float var20 = var10.UuUVuuUu("max", 1.0F);
               if (var20 <= var19) {
                  var20 = var19 + 0.001F;
               }

               this.UuUVuuUu(var1, var6, var7, var10, "value", "Default", var19, var20, var10.UuUVuuUu("step", 0.01F), 0.5F, var8, 1, var2);
               this.UuUVuuUu(var1, var6, var7, var10, "min", "Min", -128.0F, 128.0F, 0.01F, 0.0F, var8, 2, var2);
               this.UuUVuuUu(var1, var6, var7, var10, "max", "Max", -128.0F, 128.0F, 0.01F, 1.0F, var8, 3, var2);
               this.UuUVuuUu(var1, var6, var7, var10, "step", "Step", 1.0E-4F, 16.0F, 0.001F, 0.01F, var8, 4, var2);
            } else if ("exposed_color".equals(var10.C00OOC00oO())) {
               this.UuUVuuUu(var1, var6, var7, var10, "name", "Name", var8, 0, var2);
               this.UuUVuuUu(var1, var6, var7, var10, "r", "Red", 0.0F, 1.0F, 0.01F, 1.0F, var8, 1, var2);
               this.UuUVuuUu(var1, var6, var7, var10, "g", "Green", 0.0F, 1.0F, 0.01F, 1.0F, var8, 2, var2);
               this.UuUVuuUu(var1, var6, var7, var10, "b", "Blue", 0.0F, 1.0F, 0.01F, 1.0F, var8, 3, var2);
               this.UuUVuuUu(var1, var6, var7, var10, "a", "Alpha", 0.0F, 1.0F, 0.01F, 1.0F, var8, 4, var2);
               vnvNNVNU var18 = new vnvNNVNU(var8.x() + var8.w() - var6.UuUVuuUu(82.0F), var12, var6.UuUVuuUu(68.0F), var6.UuUVuuUu(18.0F));
               var1.UuUVuuUu(
                  var18.x(),
                  var18.y(),
                  var18.w(),
                  var18.h(),
                  var6.UuUVuuUu(6.0F),
                  NUunUunuNV.UuUVuuUu(
                     Math.round(var10.UuUVuuUu("r", 1.0F) * 255.0F),
                     Math.round(var10.UuUVuuUu("g", 1.0F) * 255.0F),
                     Math.round(var10.UuUVuuUu("b", 1.0F) * 255.0F),
                     Math.round(var10.UuUVuuUu("a", 1.0F) * 255.0F)
                  )
               );
               var1.UuUVuuUu(var18.x(), var18.y(), var18.w(), var18.h(), var6.UuUVuuUu(6.0F), var7.nvUVNnuu(), 0.6F);
            } else {
               this.UuUVuuUu(var1, var6, var7, var8, var11, var10, var12);
            }
         }
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4) {
      float var5 = var4.y() + var2.UuUVuuUu(58.0F);
      this.UuUVuuUu(
         var1,
         var2,
         var3,
         var4.x() + var2.UuUVuuUu(14.0F),
         var5,
         "Name",
         this.nNunUnVN != null && !this.nNunUnVN.isBlank() ? this.nNunUnVN : this.UuuNnUvUuv.UuUVuuUu().C00OOC00oO()
      );
      this.UuUVuuUu(
         var1, var2, var3, var4.x() + var2.UuUVuuUu(14.0F), var5 + var2.UuUVuuUu(22.0F), "Nodes", String.valueOf(this.UuuNnUvUuv.uUnuvNvvNU().size())
      );
      this.UuUVuuUu(
         var1, var2, var3, var4.x() + var2.UuUVuuUu(14.0F), var5 + var2.UuUVuuUu(44.0F), "Links", String.valueOf(this.UuuNnUvUuv.vVvUvVVuuNvV().size())
      );
      this.UuUVuuUu(
         var1,
         var2,
         var3,
         var4.x() + var2.UuUVuuUu(14.0F),
         var5 + var2.UuUVuuUu(66.0F),
         "Uniforms",
         String.valueOf(this.VVuuUN.UuUVuuUu(this.UuuNnUvUuv).exposedUniforms().size())
      );
      this.UuUVuuUu(
         var1,
         var2,
         var3,
         var4.x() + var2.UuUVuuUu(14.0F),
         var5 + var2.UuUVuuUu(88.0F),
         "Author",
         this.UuuNnUvUuv.UuUVuuUu().uUnuvNvvNU().isBlank() ? lllilIiI11l.VVuuUN() : this.UuuNnUvUuv.UuUVuuUu().uUnuvNvvNU()
      );
      String var6 = this.UuuNnUvUuv.uNNnnnuuuN() == this.uuVuUuuVVNvN ? "saved" : "dirty";
      vnvNNVNU var7 = new vnvNNVNU(
         var4.x() + var2.UuUVuuUu(14.0F), var4.y() + var4.h() - var2.UuUVuuUu(42.0F), var4.w() - var2.UuUVuuUu(28.0F), var2.UuUVuuUu(28.0F)
      );
      var1.UuUVuuUu(
         var7.x(),
         var7.y(),
         var7.w(),
         var7.h(),
         var2.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(
            NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var3) ? 50 : 9),
            NUunUunuNV.UuUVuuUu(this.UuuNnUvUuv.uNNnnnuuuN() == this.uuVuUuuVVNvN ? var3.UNnVVNvvnVvU() : var3.uVunuUNVVUUV(), 72),
            0.86F
         )
      );
      var1.UuUVuuUu(
         var7.x(),
         var7.y(),
         var7.w(),
         var7.h(),
         var2.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(this.UuuNnUvUuv.uNNnnnuuuN() == this.uuVuUuuVVNvN ? var3.UNnVVNvvnVvU() : var3.uVunuUNVVUUV(), 120),
         0.65F
      );
      nunvNNUnvU.UuUVuuUu(
         var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var7.x() + var2.UuUVuuUu(12.0F), var7.y(), var7.h(), 9.0F, "compile state: " + var6, this.C00OOC00oO(var3)
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, uuUnNVuuVUu var5, VUnvuNuVUUn var6) {
      float var7 = var4.y() + var2.UuUVuuUu(48.0F);
      String[] var8 = new String[]{var5.uNNnnnuuuN().size() + " in", var5.nuUnNvnuUu().size() + " out", this.uNNnnnuuuN(var6) ? "uniform" : var5.uUnuvNvvNU()};
      float var9 = var4.x() + var2.UuUVuuUu(14.0F);

      for (int var10 = 0; var10 < var8.length; var10++) {
         float var11 = var10 == 2 ? var4.w() - var2.UuUVuuUu(28.0F) - (var9 - var4.x() - var2.UuUVuuUu(14.0F)) : var2.UuUVuuUu(58.0F);
         vnvNNVNU var12 = new vnvNNVNU(var9, var7, var11, var2.UuUVuuUu(18.0F));
         var1.UuUVuuUu(var12.x(), var12.y(), var12.w(), var12.h(), var2.UuUVuuUu(6.0F), NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var3) ? 42 : 8));
         var1.UuUVuuUu(
            var12.x(),
            var12.y(),
            var12.w(),
            var12.h(),
            var2.UuUVuuUu(6.0F),
            NUunUunuNV.UuUVuuUu(var10 == 2 ? var3.UNnVVNvvnVvU() : var3.uVunuUNVVUUV(), 72),
            0.55F
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var2,
            vNvnnVvvVUu.UuUVuuUu,
            var12.x() + var2.UuUVuuUu(8.0F),
            var12.y(),
            var12.h(),
            8.0F,
            nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var8[var10], 8.0F, var12.w() - var2.UuUVuuUu(16.0F)),
            this.uUnuvNvvNU(var3)
         );
         var9 += var11 + var2.UuUVuuUu(6.0F);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, uuUnNVuuVUu var5, VUnvuNuVUUn var6, float var7) {
      float var8 = var4.w() - var2.UuUVuuUu(28.0F);
      float var9 = var4.y() + var4.h() - var2.UuUVuuUu(16.0F) - var7;
      if ("output_color".equals(var6.C00OOC00oO())) {
         this.C00OOC00oO(var1, var2, var3, new vnvNNVNU(var4.x() + var2.UuUVuuUu(14.0F), var7, var8, var9), var5, var6);
      } else {
         boolean var10 = !var5.uNNnnnuuuN().isEmpty();
         boolean var11 = !var5.nuUnNvnuUu().isEmpty();
         if (var10 || var11) {
            if (var10 != var11) {
               vnvNNVNU var16 = new vnvNNVNU(var4.x() + var2.UuUVuuUu(14.0F), var7, var8, var9);
               if (var10) {
                  this.UuUVuuUu(var1, var2, var3, var16, "Inputs", var5.uNNnnnuuuN(), var6, true);
               } else {
                  this.UuUVuuUu(var1, var2, var3, var16, "Outputs", var5.nuUnNvnuUu(), var6, false);
               }
            } else {
               float var12 = var2.UuUVuuUu(10.0F);
               float var13 = (var8 - var12) * 0.5F;
               vnvNNVNU var14 = new vnvNNVNU(var4.x() + var2.UuUVuuUu(14.0F), var7, var13, var9);
               vnvNNVNU var15 = new vnvNNVNU(var14.x() + var14.w() + var12, var7, var13, var14.h());
               this.UuUVuuUu(var1, var2, var3, var14, "Inputs", var5.uNNnnnuuuN(), var6, true);
               this.UuUVuuUu(var1, var2, var3, var15, "Outputs", var5.nuUnNvnuUu(), var6, false);
            }
         }
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, uuUnNVuuVUu var5, VUnvuNuVUUn var6) {
      var1.UuUVuuUu(var4.x(), var4.y(), var4.w(), var4.h(), var2.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var3) ? 34 : 6));
      var1.UuUVuuUu(var4.x(), var4.y(), var4.w(), var4.h(), var2.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 92), 0.55F);
      var1.UuUVuuUu(
         var4.x(),
         var4.y() + var2.UuUVuuUu(8.0F),
         var2.UuUVuuUu(2.2F),
         var4.h() - var2.UuUVuuUu(16.0F),
         var2.UuUVuuUu(1.1F),
         NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 190)
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var4.x() + var2.UuUVuuUu(12.0F),
         var4.y() + var2.UuUVuuUu(8.0F),
         9.0F,
         "Result",
         NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 224)
      );
      String var7 = this.vNUvnnVnUvu.uUnuvNvvNU().isBlank() ? "cold" : "#" + this.vNUvnnVnUvu.uUnuvNvvNU();
      float var8 = var4.x() + var2.UuUVuuUu(12.0F);
      float var9 = var4.y() + var2.UuUVuuUu(26.0F);
      this.UuUVuuUu(var1, var2, var3, var8, var9, "Hash", var7);
      this.UuUVuuUu(var1, var2, var3, var8, var9 + var2.UuUVuuUu(18.0F), "State", this.VVuuUN());
      this.UuUVuuUu(var1, var2, var3, var8, var9 + var2.UuUVuuUu(36.0F), "Target", this.NNUUNUuVNNVn.C00OOC00oO());
      this.UuUVuuUu(
         var1, var2, var3, var8, var9 + var2.UuUVuuUu(54.0F), "Uniforms", String.valueOf(this.VVuuUN.UuUVuuUu(this.UuuNnUvUuv).exposedUniforms().size())
      );
      float var10 = var9 + var2.UuUVuuUu(76.0F);

      for (NUuvnUuVU var12 : var5.uNNnnnuuuN()) {
         if (var10 > var4.y() + var4.h() - var2.UuUVuuUu(14.0F)) {
            break;
         }

         boolean var13 = this.UuuNnUvUuv.C00OOC00oO(var6.UuUVuuUu(), var12.id()) != null;
         int var14 = this.UuUVuuUu(var12, var3);
         var1.C00OOC00oO(
            var8 + var2.UuUVuuUu(3.0F), var10 + var2.UuUVuuUu(4.4F), var2.UuUVuuUu(2.6F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var14, var13 ? 245 : 130)
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var2,
            vNvnnVvvVUu.UuUVuuUu,
            var8 + var2.UuUVuuUu(12.0F),
            var10,
            8.0F,
            nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var12.label() + (var13 ? " / linked" : " / not connected"), 8.0F, var4.w() - var2.UuUVuuUu(60.0F)),
            var13 ? this.C00OOC00oO(var3) : this.uUnuvNvvNU(var3)
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var2,
            vNvnnVvvVUu.UuUVuuUu,
            var4.x() + var4.w() - var2.UuUVuuUu(38.0F),
            var10,
            7.0F,
            var12.type().UuUVuuUu(),
            NUunUunuNV.UuUVuuUu(var14, var13 ? 220 : 150)
         );
         var10 += var2.UuUVuuUu(17.0F);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, String var5, List<NUuvnUuVU> var6, VUnvuNuVUUn var7, boolean var8) {
      var1.UuUVuuUu(var4.x(), var4.y(), var4.w(), var4.h(), var2.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(255, 255, 255, this.UuUVuuUu(var3) ? 34 : 6));
      var1.UuUVuuUu(var4.x(), var4.y(), var4.w(), var4.h(), var2.UuUVuuUu(8.0F), var3.nvUVNnuu(), 0.55F);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var4.x() + var2.UuUVuuUu(10.0F),
         var4.y() + var2.UuUVuuUu(8.0F),
         9.0F,
         var5,
         NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 220)
      );
      float var9 = var4.y() + var2.UuUVuuUu(28.0F);

      for (NUuvnUuVU var11 : var6) {
         if (var9 > var4.y() + var4.h() - var2.UuUVuuUu(18.0F)) {
            break;
         }

         int var12 = this.UuUVuuUu(var11, var3);
         boolean var13 = var8
            ? this.UuuNnUvUuv.C00OOC00oO(var7.UuUVuuUu(), var11.id()) != null
            : this.UuuNnUvUuv.vVvUvVVuuNvV().stream().anyMatch(var2x -> var2x.UuUVuuUu().equals(var7.UuUVuuUu()) && var2x.C00OOC00oO().equals(var11.id()));
         var1.C00OOC00oO(
            var4.x() + var2.UuUVuuUu(12.0F), var9 + var2.UuUVuuUu(6.0F), var2.UuUVuuUu(2.6F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var12, var13 ? 245 : 130)
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var2,
            vNvnnVvvVUu.UuUVuuUu,
            var4.x() + var2.UuUVuuUu(22.0F),
            var9,
            8.0F,
            nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var11.label(), 8.0F, var4.w() - var2.UuUVuuUu(62.0F)),
            var13 ? this.C00OOC00oO(var3) : this.uUnuvNvvNU(var3)
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var2,
            vNvnnVvvVUu.UuUVuuUu,
            var4.x() + var4.w() - var2.UuUVuuUu(38.0F),
            var9,
            7.0F,
            var11.type().UuUVuuUu(),
            NUunUunuNV.UuUVuuUu(var12, var13 ? 220 : 150)
         );
         var9 += var2.UuUVuuUu(17.0F);
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, VUnvuNuVUUn var4, String var5, String var6, vnvNNVNU var7, int var8, vNvvVnNuUVvv var9
   ) {
      vnvNNVNU var10 = this.UuUVuuUu(var7, var2, var8);
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var7.x() + var2.UuUVuuUu(14.0F), var10.y(), var10.h(), 9.0F, var6, var3.uVUVnuvnuVuv());
      String var11 = this.C00OOC00oO(var4, var5);
      UVvNVvUUuUnN var12 = this.nUUVuvU(var11);
      if (!var12.vNUvnnVnUvu()) {
         var12.UuUVuuUu(var4.UuUVuuUu(var5, this.nuUnNvnuUu(var4)));
      }

      var12.UuUVuuUu(var1, var2, var3, var10, var9.unnUnUNVnN(), var9.NnuUnUNnu());
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      nUvnuVnNUU var2,
      NUunUunuNV var3,
      VUnvuNuVUUn var4,
      String var5,
      String var6,
      float var7,
      float var8,
      float var9,
      float var10,
      vnvNNVNU var11,
      int var12,
      vNvvVnNuUVvv var13
   ) {
      vnvNNVNU var14 = this.UuUVuuUu(var11, var2, var12);
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var11.x() + var2.UuUVuuUu(14.0F), var14.y(), var14.h(), 9.0F, var6, var3.uVUVnuvnuVuv());
      String var15 = this.C00OOC00oO(var4, var5);
      UVvNVvUUuUnN var16 = this.UuUVuuUu(var15, var7, var8, var9);
      if (!var16.vNUvnnVnUvu()) {
         var16.UuUVuuUu(var4.UuUVuuUu(var5, var10));
      }

      var16.UuUVuuUu(var1, var2, var3, var14, var13.unnUnUNVnN(), var13.NnuUnUNnu());
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3) {
      ArrayList var4 = new ArrayList<>(this.UuuNnUvUuv.uUnuvNvvNU());
      var4.sort(Comparator.comparing(var1x -> this.uUnuvNvvNU(var1x.UuUVuuUu())));

      for (VUnvuNuVUUn var6 : var4) {
         this.UuUVuuUu(var1, var2, var3, var6);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, VUnvuNuVUUn var4) {
      uuUnNVuuVUu var5 = this.nuUnNvnuUu.UuUVuuUu(var4.C00OOC00oO());
      if (var5 != null) {
         nUvnuVnNUU var6 = var3.uNNnnnuuuN();
         NUunUunuNV var7 = var3.nuUnNvnuUu();
         float var8 = this.uUnuvNvvNU(var4.uUnuvNvvNU());
         float var9 = this.vVvUvVVuuNvV(var4.vVvUvVVuuNvV());
         float var10 = var5.vVvUvVVuuNvV() * this.vNVuvnUUnuUn;
         uNuuunuNvuN var11 = this.UuuNnUvUuv(var4.UuUVuuUu());
         var11.uUnuvNvvNU(Boolean.TRUE.equals(this.NvnnUUuVvNU.get(var4.UuUVuuUu())) ? 1.0F : 0.0F);
         float var12 = var11.UuUVuuUu();
         float var13 = this.C00OOC00oO(var5);
         float var14 = this.UuUVuuUu(var5, var4) * this.vNVuvnUUnuUn;
         float var15 = Math.max(var6.UuUVuuUu(6.0F), 10.0F * this.vNVuvnUUnuUn);
         boolean var16 = this.uUnuvNvvNU(var4.UuUVuuUu());
         boolean var17 = var2.unnUnUNVnN() >= var8 && var2.unnUnUNVnN() < var8 + var10 && var2.NnuUnUNnu() >= var9 && var2.NnuUnUNnu() < var9 + var14;
         UUNnvUVnnnnN var18 = this.vUNuuvvnVnv.computeIfAbsent(var4.UuUVuuUu(), var0 -> new UUNnvUVnnnnN(0.0F));
         float var19 = var18.UuUVuuUu(var17 ? 1.0F : 0.0F, Cc0cOoOcC0o.nvUVNnuu());
         uNuuunuNvuN var20 = this.unnnNUNnVu.computeIfAbsent(var4.UuUVuuUu(), var1x -> this.uNnUnnuNUnNu());
         var20.uUnuvNvvNU(var16 ? 1.0F : (var17 ? 0.38F : 0.0F));
         float var21 = VVuuUN(var20.UuUVuuUu());
         UUNnvUVnnnnN var22 = this.NVNnnvVnvV.computeIfAbsent(var4.UuUVuuUu(), var0 -> new UUNnvUVnnnnN(1.0F));
         float var23 = var22.UuUVuuUu(1.0F, Cc0cOoOcC0o.uVUuuVnNVU());
         float var24 = Math.max(var21, var19 * 0.45F);
         float var25 = Math.min(1.0F, (Math.abs(this.NVuunNnvvvVu) + Math.abs(this.vNnNuuvVn)) * 0.0012F);
         float var26 = Math.max(0.001F, var23) * (1.0F + var24 * 0.016F + var25 * (var17 ? 0.006F : 0.0F));
         var1.UuUVuuUu(var26, var8 + var10 * 0.5F, var9 + var14 * 0.5F);

         try {
            boolean var27 = VvvVVnvv.UuUVuuUu()
               .UuUVuuUu(
                  var1,
                  var8,
                  var9,
                  var10,
                  var14,
                  var15,
                  var19,
                  var21,
                  var25,
                  var7,
                  this.UUuUnNVNuuv,
                  this.NVuNUuVnVUN,
                  this.vnuNNVvVVuN,
                  this.Oco0Oococc,
                  this.UuUVuuUu(var7)
               );
            if (!var27) {
               if (var19 > 0.001F) {
                  var1.UuUVuuUu(
                     var8,
                     var9,
                     var10,
                     var14,
                     var15,
                     var6.UuUVuuUu(12.0F) * var19,
                     var6.UuUVuuUu(1.1F),
                     NUunUunuNV.UuUVuuUu(var7.UNnVVNvvnVvU(), Math.round(34.0F * var19))
                  );
               }

               if (var21 > 0.001F) {
                  float var28 = 0.86F + 0.14F * (float)Math.sin((float)(System.currentTimeMillis() % 2200L) / 2200.0F * Math.PI * 2.0);
                  this.UuUVuuUu(var1, var8, var9, var10, var14, var15, var7.uVunuUNVVUUV(), var21 * var28 * 0.62F, var6);
               }

               var1.UuUVuuUu(
                  var8,
                  var9 + var6.UuUVuuUu(2.0F),
                  var10,
                  var14,
                  var15,
                  var6.UuUVuuUu(11.0F),
                  var6.UuUVuuUu(1.0F),
                  this.uUnuvNvvNU(var7, Math.round(82.0F + 24.0F * var21))
               );
               var1.UuUVuuUu(var8, var9, var10, var14, var15, 0.24F + 0.08F * var21);
               var1.UuUVuuUu(var8, var9, var10, var14, var15, this.UuUVuuUu(var7, Math.round(194.0F + 20.0F * var21)));
               if (var17) {
                  var1.UuUVuuUu(
                     var8 + 1.2F * this.vNVuvnUUnuUn,
                     var9 + 1.2F * this.vNVuvnUUnuUn,
                     var10 - 2.4F * this.vNVuvnUUnuUn,
                     var14 - 2.4F * this.vNVuvnUUnuUn,
                     Math.max(0.0F, var15 - 1.2F * this.vNVuvnUUnuUn),
                     NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), Math.round(10.0F * var19))
                  );
               }

               var1.UuUVuuUu(
                  var8,
                  var9,
                  var10,
                  var14,
                  var15,
                  NUunUunuNV.UuUVuuUu(var7.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 118), Math.max(var19 * 0.48F, var21 * 0.72F)),
                  0.55F
               );
            }

            int var43 = this.C00OOC00oO(var7);
            int var29 = this.uUnuvNvvNU(var7);
            nunvNNUnvU.UuUVuuUu(
               var1,
               var6,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var8 + 14.0F * this.vNVuvnUUnuUn,
               var9 + 12.0F * this.vNVuvnUUnuUn,
               11.0F * this.vNVuvnUUnuUn / Math.max(0.001F, var6.C00OOC00oO()),
               var5.C00OOC00oO(),
               var43
            );
            nunvNNUnvU.UuUVuuUu(
               var1,
               var6,
               vNvnnVvvVUu.UuUVuuUu,
               var8 + 14.0F * this.vNVuvnUUnuUn,
               var9 + 28.0F * this.vNVuvnUUnuUn,
               8.5F * this.vNVuvnUUnuUn / Math.max(0.001F, var6.C00OOC00oO()),
               var5.uUnuvNvvNU(),
               var29
            );
            if (var5.vNUvnnVnUvu()) {
               String var30 = "Preview";
               float var31 = 7.5F * this.vNVuvnUUnuUn / Math.max(0.001F, var6.C00OOC00oO());
               float var32 = nunvNNUnvU.UuUVuuUu(var6, vNvnnVvvVUu.UuUVuuUu, var30, var31);
               vnvNNVNU var33 = this.UuUVuuUu(var5, var8, var9, var10);
               int var34 = NUunUunuNV.UuUVuuUu(
                  NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), this.UuUVuuUu(var7) ? 32 : 44), NUunUunuNV.UuUVuuUu(var7.UNnVVNvvnVvU(), 116), var12
               );
               var1.UuUVuuUu(var33.x(), var33.y(), var33.w(), var33.h(), var33.h() * 0.5F, var34);
               var1.UuUVuuUu(
                  var33.x(),
                  var33.y(),
                  var33.w(),
                  var33.h(),
                  var33.h() * 0.5F,
                  NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), Math.round(70.0F + 92.0F * var12)),
                  0.55F
               );
               nunvNNUnvU.UuUVuuUu(var1, var6, vNvnnVvvVUu.UuUVuuUu, var33.x() + (var33.w() - var32) * 0.5F, var33.y(), var33.h(), var31, var30, var43);
            }

            var1.uUnuvNvvNU();
            var1.UuUVuuUu(
               var8 + 1.2F,
               var9 + 1.2F,
               var10 - 2.4F,
               var14 - 2.4F,
               Math.max(0.0F, var15 - 1.2F),
               Math.max(0.0F, var15 - 1.2F),
               Math.max(0.0F, var15 - 1.2F),
               Math.max(0.0F, var15 - 1.2F)
            );

            try {
               this.UuUVuuUu(var1, var3, var4, var8, var9, var10);
               this.UuUVuuUu(var1, var3, var4, var5, var8, var9, var10, var13, var12);
            } finally {
               var1.uUnuvNvvNU();
               var1.nuUnNvnuUu();
            }

            this.UuUVuuUu(var1, var3, var4, var5, var8, var9);
         } finally {
            var1.uVUuuVnNVU();
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUVuuNUVnV var2, VUnvuNuVUUn var3, float var4, float var5, float var6) {
      nUvnuVnNUU var7 = var2.uNNnnnuuuN();
      NUunUunuNV var8 = var2.nuUnNvnuUu();
      if (this.uNNnnnuuuN(var3)) {
         vnvNNVNU var11 = this.vVvUvVVuuNvV(var3);
         UVvNVvUUuUnN var12 = this.C00OOC00oO(var3);
         if (!var12.vNUvnnVnUvu()) {
            var12.UuUVuuUu(var3.UuUVuuUu("name", this.nuUnNvnuUu(var3)));
         }

         var12.UuUVuuUu(var1, var7, var8, var11, this.UUuUnNVNuuv, this.NVuNUuVnVUN);
      } else if (VVuuUN(var3.C00OOC00oO())) {
         vnvNNVNU var9 = this.uUnuvNvvNU(var3);
         UVvNVvUUuUnN var10 = this.UuUVuuUu(var3);
         if (!var10.vNUvnnVnUvu()) {
            var10.UuUVuuUu(var3.UuUVuuUu("value", "int_value".equals(var3.C00OOC00oO()) ? 1.0F : 0.5F));
         }

         var10.UuUVuuUu(var1, var7, var8, var9, this.UUuUnNVNuuv, this.NVuNUuVnVUN);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUVuuNUVnV var2, VUnvuNuVUUn var3, uuUnNVuuVUu var4, float var5, float var6, float var7, float var8, float var9) {
      if (var3 != null && var4 != null && var4.vNUvnnVnUvu() && !(var9 <= 0.01F)) {
         nUvnuVnNUU var10 = var2.uNNnnnuuuN();
         NUunUunuNV var11 = var2.nuUnNvnuUu();
         float var12 = var5 + 6.0F * this.vNVuvnUUnuUn;
         float var13 = var6 + (var8 + 4.0F) * this.vNVuvnUUnuUn;
         float var14 = Math.max(1.0F, var7 - 12.0F * this.vNVuvnUUnuUn);
         float var15 = Math.max(1.0F, 120.0F * this.vNVuvnUUnuUn * var9);
         float var16 = Math.max(var10.UuUVuuUu(5.0F), 8.0F * this.vNVuvnUUnuUn);
         var1.UuUVuuUu(var12, var13, var14, var15, var16, NUunUunuNV.UuUVuuUu(5, 7, 12, Math.round(156.0F * var9)));
         var1.UuUVuuUu(var12, var13, var14, var15, var16, NUunUunuNV.UuUVuuUu(var11.uVunuUNVVUUV(), Math.round(62.0F * var9)), 0.65F);
         if (!(this.vNVuvnUUnuUn < 0.6F) && !(var15 < 14.0F)) {
            var1.uUnuvNvvNU();
            var1.UuUVuuUu(var12, var13, var14, var15, var16, var16, var16, var16);

            try {
               this.vuuuNvNuv
                  .UuUVuuUu(
                     this.UuuNnUvUuv, var3.UuUVuuUu(), this.vNUvnnVnUvu, var1, var12, var13, var14, var15, this.VVnVNnunVvu(), this.unNNVVNnvvV(), var11, var9
                  );
            } finally {
               var1.uUnuvNvvNU();
               var1.nuUnNvnuUu();
            }
         }
      }
   }

   private UVvNVvUUuUnN UuUVuuUu(VUnvuNuVUUn var1) {
      return this.uunNUuunVU
         .computeIfAbsent(
            var1.UuUVuuUu(), var1x -> "int_value".equals(var1.C00OOC00oO()) ? UVvNVvUUuUnN.UuUVuuUu(-64.0F, 64.0F) : UVvNVvUUuUnN.UuUVuuUu(-12.0F, 12.0F)
         );
   }

   private static boolean VVuuUN(String var0) {
      return "float_value".equals(var0) || "int_value".equals(var0);
   }

   private static float UuUVuuUu(VUnvuNuVUUn var0, float var1) {
      return "int_value".equals(var0.C00OOC00oO()) ? Math.round(var1) : var1;
   }

   private UVvNVvUUuUnN C00OOC00oO(VUnvuNuVUUn var1) {
      return this.NvnuuuvnVV.computeIfAbsent(var1.UuUVuuUu(), var0 -> UVvNVvUUuUnN.UuUVuuUu());
   }

   private void NVNnnvnuunNv() {
      if (this.UuuuNNunN != null) {
         UVvNVvUUuUnN var1 = this.uunNUuunVU.get(this.UuuuNNunN);
         if (var1 != null) {
            if (var1.uNNnnnuuuN()) {
               var1.uVUuuVnNVU();
            }

            VUnvuNuVUUn var2 = this.UuuNnUvUuv.uUnuvNvvNU(this.UuuuNNunN);
            if (var2 != null) {
               var2.C00OOC00oO("value", UuUVuuUu(var2, var1.uUnuvNvvNU()));
               this.UuuNnUvUuv.nuUnNvnuUu();
            }
         }

         this.UuuuNNunN = null;
      }
   }

   private void uVunuUNVVUUV() {
      if (this.NNVNuUvVn != null) {
         UVvNVvUUuUnN var1 = this.NvnuuuvnVV.get(this.NNVNuUvVn);
         if (var1 != null) {
            if (var1.uNNnnnuuuN()) {
               var1.uVUuuVnNVU();
            }

            VUnvuNuVUUn var2 = this.UuuNnUvUuv.uUnuvNvvNU(this.NNVNuUvVn);
            if (var2 != null) {
               var2.C00OOC00oO("name", var1.vVvUvVVuuNvV());
               this.UuuNnUvUuv.nuUnNvnuUu();
            }
         }

         this.NNVNuUvVn = null;
      }
   }

   private void UNnVVNvvnVvU() {
      if (this.vuNnuUnu != null) {
         UVvNVvUUuUnN var1 = this.NnUVNnuvUv.get(this.vuNnuUnu);
         if (var1 != null) {
            if (var1.uNNnnnuuuN()) {
               var1.uVUuuVnNVU();
            }

            this.vNUvnnVnUvu(this.vuNnuUnu);
         }

         this.vuNnuUnu = null;
      }
   }

   private void vNUvnnVnUvu(String var1) {
      if (var1 != null) {
         int var2 = var1.indexOf(58);
         if (var2 > 0 && var2 < var1.length() - 1) {
            VUnvuNuVUUn var3 = this.UuuNnUvUuv.uUnuvNvvNU(var1.substring(0, var2));
            UVvNVvUUuUnN var4 = this.NnUVNnuvUv.get(var1);
            if (var3 != null && var4 != null) {
               String var5 = var1.substring(var2 + 1);
               if ("name".equals(var5)) {
                  var3.C00OOC00oO("name", var4.vVvUvVVuuNvV());
               } else {
                  var3.C00OOC00oO(var5, var4.uUnuvNvvNU());
                  this.UuUVuuUu(var3, var5);
               }

               this.UuuNnUvUuv.nuUnNvnuUu();
            }
         }
      }
   }

   private void UuUVuuUu(VUnvuNuVUUn var1, String var2) {
      if (var1 != null) {
         if ("step".equals(var2)) {
            var1.C00OOC00oO("step", Math.max(1.0E-4F, var1.UuUVuuUu("step", 0.01F)));
         } else {
            float var3 = var1.UuUVuuUu("min", 0.0F);
            float var4 = var1.UuUVuuUu("max", 1.0F);
            if (var4 <= var3) {
               if ("min".equals(var2)) {
                  var1.C00OOC00oO("max", var3 + 0.001F);
               } else {
                  var1.C00OOC00oO("min", var4 - 0.001F);
               }
            }
         }
      }
   }

   private boolean UuUVuuUu(vNvvVnNuUVvv var1, nUvnuVnNUU var2, int var3, float var4, float var5) {
      vnvNNVNU var6 = this.C00OOC00oO(var2);
      if (!var6.contains(var4, var5)) {
         this.VnVuuvVvnNv = false;
      }

      if (this.vVvUvVVuuNvV(var2, var3).contains(var4, var5)) {
         var1.uUVuVvuNUvnu(false);
         this.NVUunUNUN();
         return true;
      } else if (var6.contains(var4, var5)) {
         this.VnVuuvVvnNv = true;
         this.vuvvuVuVv = System.currentTimeMillis();
         return true;
      } else if (this.UuUVuuUu(var2).contains(var4, var5)) {
         this.VvVvnNUnvuvV = !this.VvVvnNUnvuvV;
         this.ccOO0COcoco0 = false;
         this.VunnVNvNV = false;
         this.NUVvUUVuVNVv = false;
         return true;
      } else if (this.uUnuvNvvNU(var2).contains(var4, var5)) {
         this.ccOO0COcoco0 = !this.ccOO0COcoco0;
         this.VvVvnNUnvuvV = false;
         this.VunnVNvNV = false;
         this.NUVvUUVuVNVv = false;
         return true;
      } else if (this.nuUnNvnuUu(var2, var3).contains(var4, var5)) {
         this.VunnVNvNV = !this.VunnVNvNV;
         this.VvVvnNUnvuvV = false;
         this.ccOO0COcoco0 = false;
         this.NUVvUUVuVNVv = false;
         this.NvUVUvVVnUu = 0.0F;
         return true;
      } else if (this.uNNnnnuuuN(var2, var3).contains(var4, var5)) {
         this.NUVvUUVuVNVv = !this.NUVvUUVuVNVv;
         this.VvVvnNUnvuvV = false;
         this.ccOO0COcoco0 = false;
         this.VunnVNvNV = false;
         return true;
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu(nUvnuVnNUU var1, int var2, float var3, float var4, int var5) {
      vnvNNVNU var6 = this.uNNnnnuuuN(var1);
      if (var5 != 0) {
         return var6.contains(var3, var4);
      } else if (!var6.contains(var3, var4)) {
         this.VvVvnNUnvuvV = false;
         return true;
      } else {
         for (int var7 = 0; var7 < C00OOC00oO.length; var7++) {
            if (this.uUnuvNvvNU(var6, var1, var7).contains(var3, var4)) {
               if (var7 == 0) {
                  this.UnUNVVVNuv();
               } else if (var7 == 1) {
                  this.uUVVvVVNvvn();
               } else if (var7 == 2) {
                  this.vvUVNVvvNUv();
               } else if (var7 == 3) {
                  this.nuunNvv();
               } else if (var7 == 4) {
                  this.vNVuvnUUnuUn();
               } else if (var7 == 5) {
                  this.nNnVnUNVV();
               }

               return true;
            }
         }

         return true;
      }
   }

   private boolean C00OOC00oO(nUvnuVnNUU var1, int var2, int var3, float var4, float var5, int var6) {
      vnvNNVNU var7 = this.vVvUvVVuuNvV(var1, var2, var3);
      if (var6 != 0) {
         return var7.contains(var4, var5);
      } else if (!var7.contains(var4, var5)) {
         this.ccOO0COcoco0 = false;
         return true;
      } else {
         VnuVUNUv[] var8 = VnuVUNUv.UnUNVVVNuv();

         for (int var9 = 0; var9 < var8.length; var9++) {
            vnvNNVNU var10 = this.vVvUvVVuuNvV(var7, var1, var9);
            if (var10.contains(var4, var5)) {
               if (uNNnUu.UuUVuuUu().uNNnnnuuuN(var8[var9]) && this.UuUVuuUu(var10, var1).contains(var4, var5)) {
                  this.UuUVuuUu(var8[var9]);
                  return true;
               }

               this.uUnuvNvvNU(var8[var9]);
               return true;
            }
         }

         String[] var11 = new String[]{"Host Rectangle", "Inset Shape", "Full Quad"};

         for (int var12 = 0; var12 < var11.length; var12++) {
            if (this.uNNnnnuuuN(var7, var1, var12).contains(var4, var5)) {
               this.UUVNuUNUvUnV();
               this.UnvuVuVnNuvu = var11[var12];
               this.UUuUnNVNuuv();
               this.UuuNnUvUuv.nuUnNvnuUu();
               this.vNUvnnVnUvu.UuUVuuUu(this.NNUUNUuVNNVn);
               this.vNUvnnVnUvu.UuUVuuUu(this.UuuNnUvUuv);
               this.vNVuvnUUnuUn(this.UnvuVuVnNuvu);
               return true;
            }
         }

         return true;
      }
   }

   private boolean C00OOC00oO(nUvnuVnNUU var1, int var2, float var3, float var4, int var5) {
      vnvNNVNU var6 = this.VVuuUN(var1, var2);
      if (var5 != 0) {
         return var6.contains(var3, var4);
      } else if (!var6.contains(var3, var4)) {
         this.NUVvUUVuVNVv = false;
         return true;
      } else {
         NnnVVVUnVNuN.nvnNNunvv[] var7 = NnnVVVUnVNuN.nvnNNunvv.values();

         for (int var8 = 0; var8 < var7.length; var8++) {
            if (this.nuUnNvnuUu(var6, var1, var8).contains(var3, var4)) {
               this.UvNNVUVNVuvV = var7[var8];
               this.vNVuvnUUnuUn("theme " + this.UvNNVUVNVuvV.UuUVuuUu());
               return true;
            }
         }

         return true;
      }
   }

   private boolean uUnuvNvvNU(nUvnuVnNUU var1, int var2, int var3, float var4, float var5, int var6) {
      if (var6 != 0) {
         return true;
      } else {
         vnvNNVNU var7 = this.uNNnnnuuuN(var1, var2, var3);
         if (this.nuUnNvnuUu(var7, var1).contains(var4, var5)) {
            this.nUUVuvU();
            this.vVvUvVVuuNvV(this.nNuVunNUVu);
            this.UNvvunVVn = false;
            this.nNuVunNUVu = null;
            return true;
         } else if (this.VVuuUN(var7, var1).contains(var4, var5)) {
            this.vVvUvVVuuNvV(this.nNuVunNUVu);
            this.UNvvunVVn = false;
            this.nNuVunNUVu = null;
            return true;
         } else if (!this.vNUvnnVnUvu(var7, var1).contains(var4, var5) && var7.contains(var4, var5)) {
            return true;
         } else {
            this.UNvvunVVn = false;
            this.nNuVunNUVu = null;
            return true;
         }
      }
   }

   private boolean vVvUvVVuuNvV(nUvnuVnNUU var1, int var2, int var3, float var4, float var5, int var6) {
      vnvNNVNU var7 = this.UuUVuuUu(var1, var2, var3);
      if (!var7.contains(var4, var5)) {
         return false;
      } else {
         VUnvuNuVUUn var8 = this.UvUvUNuvNU();
         if (var8 == null) {
            this.UNnVVNvvnVvU();
            return true;
         } else {
            uuUnNVuuVUu var9 = this.nuUnNvnuUu.UuUVuuUu(var8.C00OOC00oO());
            if (var9 == null) {
               this.UNnVVNvvnVvU();
               return true;
            } else if (var6 == 0 && var9.vNUvnnVnUvu() && this.C00OOC00oO(var7, var1).contains(var4, var5)) {
               this.vuuuNvNuv(var8.UuUVuuUu());
               return true;
            } else if (var6 != 0) {
               return true;
            } else if ("float_value".equals(var8.C00OOC00oO())) {
               return this.UuUVuuUu(var8, "value", -12.0F, 12.0F, 0.01F, 0.5F, var7, var1, 0, var4, var5, var6);
            } else if ("int_value".equals(var8.C00OOC00oO())) {
               return this.UuUVuuUu(var8, "value", -64.0F, 64.0F, 1.0F, 1.0F, var7, var1, 0, var4, var5, var6);
            } else {
               if ("exposed_float".equals(var8.C00OOC00oO())) {
                  if (this.UuUVuuUu(var8, "name", var7, var1, 0, var4, var5, var6)) {
                     return true;
                  }

                  float var10 = var8.UuUVuuUu("min", 0.0F);
                  float var11 = var8.UuUVuuUu("max", 1.0F);
                  if (var11 <= var10) {
                     var11 = var10 + 0.001F;
                  }

                  if (this.UuUVuuUu(var8, "value", var10, var11, var8.UuUVuuUu("step", 0.01F), 0.5F, var7, var1, 1, var4, var5, var6)) {
                     return true;
                  }

                  if (this.UuUVuuUu(var8, "min", -128.0F, 128.0F, 0.01F, 0.0F, var7, var1, 2, var4, var5, var6)) {
                     return true;
                  }

                  if (this.UuUVuuUu(var8, "max", -128.0F, 128.0F, 0.01F, 1.0F, var7, var1, 3, var4, var5, var6)) {
                     return true;
                  }

                  if (this.UuUVuuUu(var8, "step", 1.0E-4F, 16.0F, 0.001F, 0.01F, var7, var1, 4, var4, var5, var6)) {
                     return true;
                  }
               }

               if ("exposed_color".equals(var8.C00OOC00oO())) {
                  if (this.UuUVuuUu(var8, "name", var7, var1, 0, var4, var5, var6)) {
                     return true;
                  }

                  if (this.UuUVuuUu(var8, "r", 0.0F, 1.0F, 0.01F, 1.0F, var7, var1, 1, var4, var5, var6)) {
                     return true;
                  }

                  if (this.UuUVuuUu(var8, "g", 0.0F, 1.0F, 0.01F, 1.0F, var7, var1, 2, var4, var5, var6)) {
                     return true;
                  }

                  if (this.UuUVuuUu(var8, "b", 0.0F, 1.0F, 0.01F, 1.0F, var7, var1, 3, var4, var5, var6)) {
                     return true;
                  }

                  if (this.UuUVuuUu(var8, "a", 0.0F, 1.0F, 0.01F, 1.0F, var7, var1, 4, var4, var5, var6)) {
                     return true;
                  }
               }

               this.UNnVVNvvnVvU();
               return true;
            }
         }
      }
   }

   private boolean UuUVuuUu(VUnvuNuVUUn var1, String var2, vnvNNVNU var3, nUvnuVnNUU var4, int var5, float var6, float var7, int var8) {
      vnvNNVNU var9 = this.UuUVuuUu(var3, var4, var5);
      if (!var9.contains(var6, var7)) {
         return false;
      } else {
         this.UUVNuUNUvUnV();
         this.UNnVVNvvnVvU();
         String var10 = this.C00OOC00oO(var1, var2);
         UVvNVvUUuUnN var11 = this.nUUVuvU(var10);
         var11.UuUVuuUu(var1.UuUVuuUu(var2, this.nuUnNvnuUu(var1)));
         if (var11.UuUVuuUu(var6, var7, var8, var9)) {
            this.vuNnuUnu = var10;
         }

         return true;
      }
   }

   private boolean UuUVuuUu(
      VUnvuNuVUUn var1,
      String var2,
      float var3,
      float var4,
      float var5,
      float var6,
      vnvNNVNU var7,
      nUvnuVnNUU var8,
      int var9,
      float var10,
      float var11,
      int var12
   ) {
      vnvNNVNU var13 = this.UuUVuuUu(var7, var8, var9);
      if (!var13.contains(var10, var11)) {
         return false;
      } else {
         this.UUVNuUNUvUnV();
         this.UNnVVNvvnVvU();
         String var14 = this.C00OOC00oO(var1, var2);
         UVvNVvUUuUnN var15 = this.UuUVuuUu(var14, var3, var4, var5);
         var15.UuUVuuUu(var1.UuUVuuUu(var2, var6));
         if (var15.UuUVuuUu(var10, var11, var12, var13)) {
            this.vuNnuUnu = var14;
         }

         return true;
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUVuuNUVnV var2, VUnvuNuVUUn var3, uuUnNVuuVUu var4, float var5, float var6) {
      nUvnuVnNUU var7 = var2.uNNnnnuuuN();
      NUunUunuNV var8 = var2.nuUnNvnuUu();
      OOcO0O0Oc0Oo var9 = OOcO0O0Oc0Oo.UuUVuuUu();
      boolean var10 = var9.UuUVuuUu(var1, this.vnuNNVvVVuN, this.Oco0Oococc);
      int var11 = this.UuUVuuUu(var8) ? NUunUunuNV.UuUVuuUu(255, 255, 255, 245) : NUunUunuNV.UuUVuuUu(8, 10, 16, 240);

      for (int var12 = 0; var12 < var4.uNNnnnuuuN().size(); var12++) {
         NUuvnUuVU var13 = var4.uNNnnnuuuN().get(var12);
         float var15 = var6 + this.UuUVuuUu(var12) * this.vNVuvnUUnuUn;
         float var16 = this.UuUVuuUu(var3.UuUVuuUu(), var13.id(), unnunUNUUnu.INPUT, var5, var15);
         float[] var17 = this.UuUVuuUu(var5, var15, var16);
         float var14 = var17[0];
         var15 = var17[1];
         int var18 = this.UuUVuuUu(var13, var8);
         if (var10) {
            float var19 = Math.max(3.4F, 4.6F * this.vNVuvnUUnuUn) + 3.4F * var16;
            float var20 = Math.max(1.8F, 2.1F * this.vNVuvnUUnuUn);
            var9.UuUVuuUu(var1, var14, var15, var19, var20, var18, var11, var16, C00OOC00oO(var3.UuUVuuUu().hashCode() * 0.0031F + var12 * 0.173F));
         } else {
            if (var16 > 0.001F) {
               var1.UuUVuuUu(
                  var14 - 5.0F * this.vNVuvnUUnuUn,
                  var15 - 5.0F * this.vNVuvnUUnuUn,
                  10.0F * this.vNVuvnUUnuUn,
                  10.0F * this.vNVuvnUUnuUn,
                  5.0F * this.vNVuvnUUnuUn,
                  var7.UuUVuuUu(14.0F) * var16,
                  var7.UuUVuuUu(2.0F),
                  NUunUunuNV.UuUVuuUu(var18, Math.round(132.0F * var16))
               );
            }

            var1.C00OOC00oO(var14, var15, Math.max(3.4F, 4.6F * this.vNVuvnUUnuUn) + 3.4F * var16, 0.0F, 1.0F, var18);
            var1.C00OOC00oO(var14, var15, Math.max(1.8F, 2.1F * this.vNVuvnUUnuUn), 0.0F, 1.0F, var11);
         }

         nunvNNUnvU.UuUVuuUu(
            var1,
            var7,
            vNvnnVvvVUu.UuUVuuUu,
            var14 + 10.0F * this.vNVuvnUUnuUn,
            var15 - 6.3F * this.vNVuvnUUnuUn,
            8.5F * this.vNVuvnUUnuUn / Math.max(0.001F, var7.C00OOC00oO()),
            var13.label(),
            this.uUnuvNvvNU(var8)
         );
      }

      for (int var21 = 0; var21 < var4.nuUnNvnuUu().size(); var21++) {
         NUuvnUuVU var22 = var4.nuUnNvnuUu().get(var21);
         float var23 = var5 + var4.vVvUvVVuuNvV() * this.vNVuvnUUnuUn;
         float var26 = var6 + this.UuUVuuUu(var21) * this.vNVuvnUUnuUn;
         float var28 = this.UuUVuuUu(var3.UuUVuuUu(), var22.id(), unnunUNUUnu.OUTPUT, var23, var26);
         float[] var29 = this.UuUVuuUu(var23, var26, var28);
         var23 = var29[0];
         var26 = var29[1];
         int var30 = this.UuUVuuUu(var22, var8);
         if (var10) {
            float var31 = Math.max(3.4F, 4.6F * this.vNVuvnUUnuUn) + 3.4F * var28;
            float var33 = Math.max(1.8F, 2.1F * this.vNVuvnUUnuUn);
            var9.UuUVuuUu(var1, var23, var26, var31, var33, var30, var11, var28, C00OOC00oO(var3.UuUVuuUu().hashCode() * 0.0047F + var21 * 0.191F + 0.41F));
         } else {
            if (var28 > 0.001F) {
               var1.UuUVuuUu(
                  var23 - 5.0F * this.vNVuvnUUnuUn,
                  var26 - 5.0F * this.vNVuvnUUnuUn,
                  10.0F * this.vNVuvnUUnuUn,
                  10.0F * this.vNVuvnUUnuUn,
                  5.0F * this.vNVuvnUUnuUn,
                  var7.UuUVuuUu(14.0F) * var28,
                  var7.UuUVuuUu(2.0F),
                  NUunUunuNV.UuUVuuUu(var30, Math.round(132.0F * var28))
               );
            }

            var1.C00OOC00oO(var23, var26, Math.max(3.4F, 4.6F * this.vNVuvnUUnuUn) + 3.4F * var28, 0.0F, 1.0F, var30);
            var1.C00OOC00oO(var23, var26, Math.max(1.8F, 2.1F * this.vNVuvnUUnuUn), 0.0F, 1.0F, var11);
         }

         float var32 = nunvNNUnvU.UuUVuuUu(var7, vNvnnVvvVUu.UuUVuuUu, var22.label(), 8.5F * this.vNVuvnUUnuUn / Math.max(0.001F, var7.C00OOC00oO()));
         nunvNNUnvU.UuUVuuUu(
            var1,
            var7,
            vNvnnVvvVUu.UuUVuuUu,
            var23 - 10.0F * this.vNVuvnUUnuUn - var32,
            var26 - 6.3F * this.vNVuvnUUnuUn,
            8.5F * this.vNVuvnUUnuUn / Math.max(0.001F, var7.C00OOC00oO()),
            var22.label(),
            this.uUnuvNvvNU(var8)
         );
      }

      if (var10) {
         var9.C00OOC00oO();
      }
   }

   private float UuUVuuUu(String var1, String var2, unnunUNUUnu var3, float var4, float var5) {
      float var6 = (float)Math.hypot(this.UUuUnNVNuuv - var4, this.NVuNUuVnVUN - var5);
      float var7 = var6 <= Math.max(18.0F, 22.0F * this.vNVuvnUUnuUn) ? 1.0F : 0.0F;
      String var8 = var1 + "." + var2 + "." + var3.name();
      return this.nvuUVvuuN.computeIfAbsent(var8, var0 -> new UUNnvUVnnnnN(0.0F)).UuUVuuUu(var7, Cc0cOoOcC0o.vuuuNvNuv());
   }

   private float[] UuUVuuUu(float var1, float var2, float var3) {
      float var4 = this.UUuUnNVNuuv - var1;
      float var5 = this.NVuNUuVnVUN - var2;
      float var6 = (float)Math.hypot(var4, var5);
      if (!(var6 <= 0.001F) && !(var3 <= 0.001F)) {
         float var7 = Math.min(5.5F * this.vNVuvnUUnuUn, var6 * 0.22F) * var3;
         return new float[]{var1 + var4 / var6 * var7, var2 + var5 / var6 * var7};
      } else {
         return new float[]{var1, var2};
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, NUunUunuNV var2, int var3, int var4, float var5) {
      HashMap var6 = new HashMap();
      Map var7 = this.UnUNuUU();
      float var8 = this.CC0COO.UuUVuuUu(0.0F, Cc0cOoOcC0o.uVUuuVnNVU());
      ocoCO0oO var9 = ocoCO0oO.UuUVuuUu();
      if (var9.UuUVuuUu(var1, var3, var4, var5)) {
         for (nNuNNVuNUu var11 : this.UuuNnUvUuv.vVvUvVVuuNvV()) {
            NnnVVVUnVNuN.VUUnVnVNNU var12 = this.UuUVuuUu(var11.UuUVuuUu(), var11.C00OOC00oO(), unnunUNUUnu.OUTPUT);
            NnnVVVUnVNuN.VUUnVnVNNU var13 = this.UuUVuuUu(var11.uUnuvNvvNU(), var11.vVvUvVVuuNvV(), unnunUNUUnu.INPUT);
            if (var12 != null && var13 != null) {
               NUuvnUuVU var14 = this.C00OOC00oO(var11.UuUVuuUu(), var11.C00OOC00oO(), unnunUNUUnu.OUTPUT);
               NUuvnUuVU var15 = this.C00OOC00oO(var11.uUnuvNvvNU(), var11.vVvUvVVuuNvV(), unnunUNUUnu.INPUT);
               NnnVVVUnVNuN.nUNvUnnVN var16 = this.UuUVuuUu(var11.UuUVuuUu(), var11.C00OOC00oO(), var14, var15, var2);
               int var17 = this.UuUVuuUu(var11.UuUVuuUu(), var6);
               Integer var18 = (Integer)var7.get(UuUVuuUu(var11));
               float var19 = var18 == null ? -1.0F : C00OOC00oO(var18.intValue() * 0.105F + C00OOC00oO(var11) * 0.019F);
               this.UuUVuuUu(
                  var9,
                  var12.x,
                  var12.y,
                  var13.x,
                  var13.y,
                  var16.a(),
                  var16.b(),
                  false,
                  var19,
                  var8,
                  var17,
                  this.uVUuuVnNVU(var11.UuUVuuUu()),
                  this.uVUuuVnNVU(var11.uUnuvNvvNU())
               );
            }
         }

         var9.C00OOC00oO();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, NUunUunuNV var3, int var4, int var5, float var6) {
      if (this.UuNnnVnuNNV != null && this.uUVvnUuNvvN != null) {
         NnnVVVUnVNuN.VUUnVnVNNU var7 = this.UuUVuuUu(this.UuNnnVnuNNV, this.uUVvnUuNvvN, unnunUNUUnu.OUTPUT);
         if (var7 == null) {
            this.NNnvvunuVNUn = false;
         } else {
            float var8 = var2.unnUnUNVnN();
            float var9 = var2.NnuUnUNnu();
            if (!this.NNnvvunuVNUn) {
               this.VuNVnvNNuNnn = var8;
               this.uvVuuuvvVU = var9;
               this.NNnvvunuVNUn = true;
            } else {
               float var10 = Math.max(0.001F, Math.min(0.05F, UUNnvUVnnnnN.UuUVuuUu()));
               float var11 = 1.0F - (float)Math.exp(-24.0F * var10);
               this.VuNVnvNNuNnn = this.VuNVnvNNuNnn + (var8 - this.VuNVnvNNuNnn) * var11;
               this.uvVuuuvvVU = this.uvVuuuvvVU + (var9 - this.uvVuuuvvVU) * var11;
            }

            NUuvnUuVU var15 = this.C00OOC00oO(this.UuNnnVnuNNV, this.uUVvnUuNvvN, unnunUNUUnu.OUTPUT);
            NnnVVVUnVNuN.nUNvUnnVN var16 = this.UuUVuuUu(this.UuNnnVnuNNV, this.uUVvnUuNvvN, var15, var3, 0);
            int var12 = var16.a();
            int var13 = NUunUunuNV.UuUVuuUu(var16.b(), 190);
            ocoCO0oO var14 = ocoCO0oO.UuUVuuUu();
            if (var14.UuUVuuUu(var1, var4, var5, var6)) {
               this.UuUVuuUu(
                  var14, var7.x, var7.y, this.VuNVnvNNuNnn, this.uvVuuuvvVU, var12, var13, true, -1.0F, 1.0F, 0, this.uVUuuVnNVU(this.UuNnnVnuNNV), 1.0F
               );
               var14.C00OOC00oO();
            }
         }
      } else {
         this.NNnvvunuVNUn = false;
      }
   }

   private void UuUVuuUu(
      ocoCO0oO var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7,
      boolean var8,
      float var9,
      float var10,
      int var11,
      float var12,
      float var13
   ) {
      float var14 = Math.abs(var4 - var2);
      float var15 = C00OOC00oO((Math.abs(this.uNnNUNvuVnu) + Math.abs(this.VnnnvUunNvuu)) * 0.012F, 0.0F, 1.0F);
      float var16 = Math.max(78.0F * this.vNVuvnUUnuUn, var14 * (0.44F + 0.14F * var10 + var15 * 0.075F + Math.min(0.08F, var11 * 0.008F)));
      float var17 = var8 ? C00OOC00oO((Math.abs(this.NVuunNnvvvVu) + Math.abs(this.vNnNuuvVn)) * 6.0E-4F, 0.0F, 1.0F) : 0.0F;
      float var18 = 1.2F + var10 * 0.2F + (var8 ? 0.34F : 0.0F) + var17 * 0.12F + var15 * 0.08F;
      boolean var19 = var8 || var9 >= 0.0F;
      float var20 = var9 >= 0.0F ? 0.118F + var10 * 0.036F + var15 * 0.02F + Math.min(0.028F, var11 * 0.002F) : 0.0F;
      float var21 = this.uNnNUNvuVnu * C00OOC00oO(var12, 0.0F, 1.0F);
      float var22 = this.VnnnvUunNvuu * C00OOC00oO(var12, 0.0F, 1.0F);
      float var23 = this.uNnNUNvuVnu * C00OOC00oO(var13, 0.0F, 1.0F);
      float var24 = this.VnnnvUunNvuu * C00OOC00oO(var13, 0.0F, 1.0F);
      var1.UuUVuuUu(var2, var3, var4, var5, var16, var6, var7, var18, var19, var20, var9, var21, var22, var23, var24);
   }

   private float uVUuuVnNVU(String var1) {
      if (var1 == null || this.UvUvUNuvNU == null) {
         return 0.0F;
      } else if (var1.equals(this.UvUvUNuvNU)) {
         return 1.0F;
      } else {
         return this.UUVNuUNUvUnV.containsKey(var1) ? 0.92F : 0.0F;
      }
   }

   private uNuuunuNvuN uNnUnnuNUnNu() {
      return new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uNNnVuNunvU.UuUVuuUu(2.4F, 0.72F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F);
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, int var7, float var8, nUvnuVnNUU var9) {
      float var10 = C00OOC00oO(var8, 0.0F, 1.0F);
      var1.UuUVuuUu(var2, var3, var4, var5, var6, var9.UuUVuuUu(15.0F) * var10, var9.UuUVuuUu(2.2F), NUunUunuNV.UuUVuuUu(var7, Math.round(96.0F * var10)));
      var1.UuUVuuUu(var2, var3, var4, var5, var6, var9.UuUVuuUu(30.0F) * var10, var9.UuUVuuUu(6.0F), NUunUunuNV.UuUVuuUu(var7, Math.round(36.0F * var10)));
   }

   private void C00OOC00oO(float var1, float var2) {
      this.NVNnnvnuunNv = true;
      this.uVunuUNVVUUV = var1;
      this.UNnVVNvvnVvU = var2;
      this.uNnUnnuNUnNu = this.nUUVuvU;
      this.NnUuNNU = this.UnUNVVVNuv;
      this.nNvNUVU = 0.0F;
      this.UnUNuUU = 0.0F;
      this.uUVuVvuNUvnu = System.nanoTime();
   }

   private void uUnuvNvvNU(float var1, float var2) {
      long var3 = System.nanoTime();
      float var5 = Math.max(0.001F, Math.min(0.05F, (float)(var3 - this.uUVuVvuNUvnu) / 1.0E9F));
      this.nNvNUVU = (this.nUUVuvU - var1) / var5;
      this.UnUNuUU = (this.UnUNVVVNuv - var2) / var5;
      this.uUVuVvuNUvnu = var3;
   }

   private void NnUuNNU() {
      if (!this.NVNnnvnuunNv && !this.vuvnnvuNVvu) {
         float var1 = UUNnvUVnnnnN.UuUVuuUu();
         if (Math.abs(this.nNvNUVU) < 0.01F && Math.abs(this.UnUNuUU) < 0.01F) {
            this.nNvNUVU = 0.0F;
            this.UnUNuUU = 0.0F;
         } else {
            this.nUUVuvU = this.nUUVuvU + this.nNvNUVU * var1;
            this.UnUNVVVNuv = this.UnUNVVVNuv + this.UnUNuUU * var1;
            float var2 = (float)Math.exp(-8.8F * var1);
            this.nNvNUVU *= var2;
            this.UnUNuUU *= var2;
         }
      }
   }

   private void nNvNUVU() {
      float var1 = Math.max(0.001F, Math.min(0.05F, UUNnvUVnnnnN.UuUVuuUu()));
      boolean var2 = this.UvUvUNuvNU != null;
      float var3 = var2 ? C00OOC00oO(this.NVuunNnvvvVu * 0.018F, -42.0F, 42.0F) : 0.0F;
      float var4 = var2 ? C00OOC00oO(this.vNnNuuvVn * 0.018F, -42.0F, 42.0F) : 0.0F;
      float var5 = (var3 - this.uNnNUNvuVnu) * 82.0F - this.VuuUVVu * 15.5F;
      float var6 = (var4 - this.VnnnvUunNvuu) * 82.0F - this.nUNnuUNnV * 15.5F;
      this.VuuUVVu += var5 * var1;
      this.nUNnuUNnV += var6 * var1;
      this.uNnNUNvuVnu = this.uNnNUNvuVnu + this.VuuUVVu * var1;
      this.VnnnvUunNvuu = this.VnnnvUunNvuu + this.nUNnuUNnV * var1;
      if (!var2
         && Math.abs(this.uNnNUNvuVnu) < 0.01F
         && Math.abs(this.VnnnvUunNvuu) < 0.01F
         && Math.abs(this.VuuUVVu) < 0.01F
         && Math.abs(this.nUNnuUNnV) < 0.01F) {
         this.uNnNUNvuVnu = 0.0F;
         this.VnnnvUunNvuu = 0.0F;
         this.VuuUVVu = 0.0F;
         this.nUNnuUNnV = 0.0F;
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, vNvvVnNuUVvv var2, NUunUunuNV var3, int var4, int var5, float var6) {
      nVvNunNuNuN.UuUVuuUu()
         .UuUVuuUu(
            var1, var4, var5, this.nUUVuvU, this.UnUNVVVNuv, this.vNVuvnUUnuUn, var2.unnUnUNVnN(), var2.NnuUnUNnu(), 0.95F, var6, var3, this.UuUVuuUu(var3)
         );
   }

   private void UuUVuuUu(UnVNvNnU var1, nUVuuNUVnV var2, NUunUunuNV var3) {
      if (this.nVVUuvuNnUN) {
         nUvnuVnNUU var4 = var2.uNNnnnuuuN();
         float var5 = Math.min(this.nNnVnUNVV, this.uUVVvVVNvvn);
         float var6 = Math.min(this.nuunNvv, this.vvUVNVvvNUv);
         float var7 = Math.abs(this.uUVVvVVNvvn - this.nNnVnUNVV);
         float var8 = Math.abs(this.vvUVNVvvNUv - this.nuunNvv);
         if (!(var7 < 1.0F) && !(var8 < 1.0F)) {
            float var9 = var4.UuUVuuUu(6.0F);
            var1.UuUVuuUu(var5, var6, var7, var8, var9, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 24));
            var1.UuUVuuUu(var5, var6, var7, var8, var9, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 150), 0.9F);
            var1.UuUVuuUu(var5, var6, var7, var8, var9, var4.UuUVuuUu(14.0F), var4.UuUVuuUu(1.0F), NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 34));
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUVuuNUVnV var2, int var3, int var4) {
      nUvnuVnNUU var5 = var2.uNNnnnuuuN();
      NUunUunuNV var6 = var2.nuUnNvnuUu();
      String var7 = "RMB -> Node Browser | Space+LMB / MMB pan | LMB drag select | Shift+D duplicate | Wheel zoom | Ctrl+C/V share | Del erase | Ctrl+Z/Y undo | Ctrl+S save";
      float var8 = nunvNNUnvU.UuUVuuUu(var5, vNvnnVvvVUu.UuUVuuUu, var7, 9.0F);
      float var9 = (var3 - var8) * 0.5F;
      float var10 = var4 - var5.UuUVuuUu(20.0F);
      var1.UuUVuuUu(
         var9 - var5.UuUVuuUu(10.0F),
         var10 - var5.UuUVuuUu(2.0F),
         var8 + var5.UuUVuuUu(20.0F),
         var5.UuUVuuUu(18.0F),
         var5.UuUVuuUu(8.0F),
         this.C00OOC00oO(var6, 188)
      );
      var1.UuUVuuUu(
         var9 - var5.UuUVuuUu(10.0F),
         var10 - var5.UuUVuuUu(2.0F),
         var8 + var5.UuUVuuUu(20.0F),
         var5.UuUVuuUu(18.0F),
         var5.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(var6.uVunuUNVVUUV(), 56),
         0.6F
      );
      nunvNNUnvU.UuUVuuUu(
         var1, var5, vNvnnVvvVUu.UuUVuuUu, var9, var10 - var5.UuUVuuUu(2.0F), var5.UuUVuuUu(18.0F), 9.0F, var7, NUunUunuNV.UuUVuuUu(var6.NVNnnvnuunNv(), 200)
      );
   }

   private int UuUVuuUu(String var1, Map<String, Integer> var2) {
      Integer var3 = (Integer)var2.get(var1);
      if (var3 != null) {
         return var3;
      } else {
         var2.put(var1, 0);
         int var4 = 0;

         for (nNuNNVuNUu var6 : this.UuuNnUvUuv.vVvUvVVuuNvV()) {
            if (var6.uUnuvNvvNU().equals(var1)) {
               var4 = Math.max(var4, this.UuUVuuUu(var6.UuUVuuUu(), var2) + 1);
            }
         }

         var2.put(var1, var4);
         return var4;
      }
   }

   private Map<String, Integer> UnUNuUU() {
      HashMap var1 = new HashMap();
      LinkedHashSet var2 = new LinkedHashSet();

      for (VUnvuNuVUUn var4 : this.UuuNnUvUuv.uUnuvNvvNU()) {
         if ("output_color".equals(var4.C00OOC00oO())) {
            var2.add(var4.UuUVuuUu());
         }
      }

      LinkedHashSet var10 = new LinkedHashSet(var2);

      for (int var11 = 0; !var2.isEmpty() && var11 < 256; var11++) {
         LinkedHashSet var5 = new LinkedHashSet();

         for (String var7 : var2) {
            for (nNuNNVuNUu var9 : this.UuuNnUvUuv.vVvUvVVuuNvV()) {
               if (var9.uUnuvNvvNU().equals(var7)) {
                  var1.putIfAbsent(UuUVuuUu(var9), var11);
                  if (var10.add(var9.UuUVuuUu())) {
                     var5.add(var9.UuUVuuUu());
                  }
               }
            }
         }

         var2 = var5;
      }

      return var1;
   }

   private static String UuUVuuUu(nNuNNVuNUu var0) {
      return var0.uNNnnnuuuN() + ">" + var0.nuUnNvnuUu();
   }

   private static float C00OOC00oO(nNuNNVuNUu var0) {
      int var1 = 17;
      var1 = var1 * 31 + var0.UuUVuuUu().hashCode();
      var1 = var1 * 31 + var0.C00OOC00oO().hashCode();
      var1 = var1 * 31 + var0.uUnuvNvvNU().hashCode();
      var1 = var1 * 31 + var0.vVvUvVVuuNvV().hashCode();
      return (var1 & 1023) / 1023.0F;
   }

   private static float C00OOC00oO(float var0) {
      return var0 - (float)Math.floor(var0);
   }

   private List<uuUnNVuuVUu> uUVuVvuNUvnu() {
      ArrayList var1 = new ArrayList<>(this.nuUnNvnuUu.UuUVuuUu());
      var1.sort(Comparator.comparing(uuUnNVuuVUu::uUnuvNvvNU).thenComparing(uuUnNVuuVUu::C00OOC00oO));
      return var1;
   }

   private VUnvuNuVUUn vVvUvVVuuNvV(float var1, float var2) {
      ArrayList var3 = new ArrayList<>(this.UuuNnUvUuv.uUnuvNvvNU());

      for (int var4 = var3.size() - 1; var4 >= 0; var4--) {
         VUnvuNuVUUn var5 = (VUnvuNuVUUn)var3.get(var4);
         uuUnNVuuVUu var6 = this.nuUnNvnuUu.UuUVuuUu(var5.C00OOC00oO());
         if (var6 != null) {
            float var7 = this.uUnuvNvvNU(var5.uUnuvNvvNU());
            float var8 = this.vVvUvVVuuNvV(var5.vVvUvVVuuNvV());
            float var9 = var6.vVvUvVVuuNvV() * this.vNVuvnUUnuUn;
            float var10 = this.UuUVuuUu(var6, var5) * this.vNVuvnUUnuUn;
            if (var1 >= var7 && var1 < var7 + var9 && var2 >= var8 && var2 < var8 + var10) {
               return var5;
            }
         }
      }

      return null;
   }

   private VUnvuNuVUUn uNNnnnuuuN(float var1, float var2) {
      ArrayList var3 = new ArrayList<>(this.UuuNnUvUuv.uUnuvNvvNU());

      for (int var4 = var3.size() - 1; var4 >= 0; var4--) {
         VUnvuNuVUUn var5 = (VUnvuNuVUUn)var3.get(var4);
         uuUnNVuuVUu var6 = this.nuUnNvnuUu.UuUVuuUu(var5.C00OOC00oO());
         if (var6 != null && var6.vNUvnnVnUvu()) {
            float var7 = this.uUnuvNvvNU(var5.uUnuvNvvNU());
            float var8 = this.vVvUvVVuuNvV(var5.vVvUvVVuuNvV());
            float var9 = var6.vVvUvVVuuNvV() * this.vNVuvnUUnuUn;
            if (this.UuUVuuUu(var6, var7, var8, var9).contains(var1, var2)) {
               return var5;
            }
         }
      }

      return null;
   }

   private void vuuuNvNuv(String var1) {
      if (var1 != null) {
         boolean var2 = !Boolean.TRUE.equals(this.NvnnUUuVvNU.get(var1));
         this.NvnnUUuVvNU.put(var1, var2);
         this.UuuNnUvUuv(var1).uUnuvNvvNU(var2 ? 1.0F : 0.0F);
         if (var2) {
            this.nvUVNnuu(var1);
         }
      }
   }

   private void nvUVNnuu(String var1) {
      int var2 = 0;

      for (Boolean var4 : this.NvnnUUuVvNU.values()) {
         if (Boolean.TRUE.equals(var4)) {
            var2++;
         }
      }

      Iterator var5 = this.NvnnUUuVvNU.entrySet().iterator();

      while (var2 > 10 && var5.hasNext()) {
         Entry var6 = (Entry)var5.next();
         if (!((String)var6.getKey()).equals(var1) && Boolean.TRUE.equals(var6.getValue())) {
            var6.setValue(false);
            this.UuuNnUvUuv((String)var6.getKey()).uUnuvNvvNU(0.0F);
            var2--;
         }
      }
   }

   private NnnVVVUnVNuN.VUnuUnnuNvVu nuUnNvnuUu(float var1, float var2) {
      for (VUnvuNuVUUn var4 : this.UuuNnUvUuv.uUnuvNvvNU()) {
         uuUnNVuuVUu var5 = this.nuUnNvnuUu.UuUVuuUu(var4.C00OOC00oO());
         if (var5 != null) {
            for (int var6 = 0; var6 < var5.uNNnnnuuuN().size(); var6++) {
               NUuvnUuVU var7 = var5.uNNnnnuuuN().get(var6);
               float var8 = this.uUnuvNvvNU(var4.uUnuvNvvNU());
               float var9 = this.vVvUvVVuuNvV(var4.vVvUvVVuuNvV() + this.UuUVuuUu(var6));
               if (Math.hypot(var1 - var8, var2 - var9) <= Math.max(12.0F, 13.0F * this.vNVuvnUUnuUn)) {
                  return new NnnVVVUnVNuN.VUnuUnnuNvVu(var4.UuUVuuUu(), var7.id(), unnunUNUUnu.INPUT);
               }
            }

            for (int var10 = 0; var10 < var5.nuUnNvnuUu().size(); var10++) {
               NUuvnUuVU var11 = var5.nuUnNvnuUu().get(var10);
               float var12 = this.uUnuvNvvNU(var4.uUnuvNvvNU() + var5.vVvUvVVuuNvV());
               float var13 = this.vVvUvVVuuNvV(var4.vVvUvVVuuNvV() + this.UuUVuuUu(var10));
               if (Math.hypot(var1 - var12, var2 - var13) <= Math.max(12.0F, 13.0F * this.vNVuvnUUnuUn)) {
                  return new NnnVVVUnVNuN.VUnuUnnuNvVu(var4.UuUVuuUu(), var11.id(), unnunUNUUnu.OUTPUT);
               }
            }
         }
      }

      return null;
   }

   private NnnVVVUnVNuN.VUUnVnVNNU UuUVuuUu(String var1, String var2, unnunUNUUnu var3) {
      VUnvuNuVUUn var4 = this.UuuNnUvUuv.uUnuvNvvNU(var1);
      if (var4 == null) {
         return null;
      } else {
         uuUnNVuuVUu var5 = this.nuUnNvnuUu.UuUVuuUu(var4.C00OOC00oO());
         if (var5 == null) {
            return null;
         } else {
            List var6 = var3 == unnunUNUUnu.INPUT ? var5.uNNnnnuuuN() : var5.nuUnNvnuUu();

            for (int var7 = 0; var7 < var6.size(); var7++) {
               if (((NUuvnUuVU)var6.get(var7)).id().equals(var2)) {
                  float var8 = var3 == unnunUNUUnu.INPUT ? var4.uUnuvNvvNU() : var4.uUnuvNvvNU() + var5.vVvUvVVuuNvV();
                  return new NnnVVVUnVNuN.VUUnVnVNNU(this.uUnuvNvvNU(var8), this.vVvUvVVuuNvV(var4.vVvUvVVuuNvV() + this.UuUVuuUu(var7)));
               }
            }

            return null;
         }
      }
   }

   private int UuUVuuUu(String var1, String var2, unnunUNUUnu var3, NUunUunuNV var4) {
      return this.UuUVuuUu(this.C00OOC00oO(var1, var2, var3), var4);
   }

   private NUuvnUuVU C00OOC00oO(String var1, String var2, unnunUNUUnu var3) {
      VUnvuNuVUUn var4 = this.UuuNnUvUuv.uUnuvNvvNU(var1);
      if (var4 == null) {
         return null;
      } else {
         uuUnNVuuVUu var5 = this.nuUnNvnuUu.UuUVuuUu(var4.C00OOC00oO());
         if (var5 == null) {
            return null;
         } else {
            for (NUuvnUuVU var8 : var3 == unnunUNUUnu.INPUT ? var5.uNNnnnuuuN() : var5.nuUnNvnuUu()) {
               if (var8.id().equals(var2)) {
                  return var8;
               }
            }

            return null;
         }
      }
   }

   private NnnVVVUnVNuN.nUNvUnnVN UuUVuuUu(String var1, String var2, NUuvnUuVU var3, NUuvnUuVU var4, NUunUunuNV var5) {
      NnnVVVUnVNuN.nUNvUnnVN var6 = this.UuUVuuUu(var1, var2, var3, var5, 0);
      if (var4 != null && var3 != null && var3.type() != var4.type()) {
         int var7 = NUunUunuNV.UuUVuuUu(this.UuUVuuUu(this.UuUVuuUu(var4, var5), var5), 246);
         return new NnnVVVUnVNuN.nUNvUnnVN(var6.b(), var7);
      } else {
         return var6;
      }
   }

   private NnnVVVUnVNuN.nUNvUnnVN UuUVuuUu(String var1, String var2, NUuvnUuVU var3, NUunUunuNV var4, int var5) {
      int var6 = NUunUunuNV.UuUVuuUu(this.UuUVuuUu(this.UuUVuuUu(var3, var4), var4), 246);
      if (var3 != null && var3.type() == nnNVVnNnnV.VEC4 && var5 <= 10) {
         VUnvuNuVUUn var7 = this.UuuNnUvUuv.uUnuvNvvNU(var1);
         if (var7 == null) {
            return new NnnVVVUnVNuN.nUNvUnnVN(var6, var6);
         } else {
            String var8 = var7.C00OOC00oO();
            if ("theme_top".equals(var8)) {
               int var11 = NUunUunuNV.UuUVuuUu(this.UuUVuuUu(var4.uVunuUNVVUUV(), var4), 246);
               return new NnnVVVUnVNuN.nUNvUnnVN(var11, var11);
            } else if ("theme_bottom".equals(var8)) {
               int var10 = NUunUunuNV.UuUVuuUu(this.UuUVuuUu(var4.UNnVVNvvnVvU(), var4), 246);
               return new NnnVVVUnVNuN.nUNvUnnVN(var10, var10);
            } else if ("theme_panel".equals(var8)) {
               int var9 = NUunUunuNV.UuUVuuUu(this.UuUVuuUu(var4.nuUnNvnuUu(), var4), 246);
               return new NnnVVVUnVNuN.nUNvUnnVN(var9, var9);
            } else if ("color_ramp".equals(var8) || "color_pulse".equals(var8) || "vec4_mix".equals(var8)) {
               return this.UuUVuuUu(var1, "a", "b", var4, var5 + 1, var6);
            } else if ("color_gradient_map".equals(var8)) {
               return this.UuUVuuUu(var1, "a", "c", var4, var5 + 1, var6);
            } else if ("alpha_blend".equals(var8)
               || "blend_screen".equals(var8)
               || "blend_overlay".equals(var8)
               || "blend_multiply".equals(var8)
               || "blend_add".equals(var8)) {
               return this.UuUVuuUu(var1, "base", "layer", var4, var5 + 1, var6);
            } else if ("glass_surface".equals(var8)) {
               return this.UuUVuuUu(var1, "tint", var4, var5 + 1, var6);
            } else {
               return !"sdf_fill".equals(var8)
                     && !"rim_light".equals(var8)
                     && !"hover_glow".equals(var8)
                     && !"exposure_lift".equals(var8)
                     && !"color_multiply_scalar".equals(var8)
                     && !"color_desaturate".equals(var8)
                     && !"color_invert".equals(var8)
                     && !"color_screen_split".equals(var8)
                     && !"chromatic_aberration".equals(var8)
                     && !"posterize".equals(var8)
                     && !"bloom_lift".equals(var8)
                  ? new NnnVVVUnVNuN.nUNvUnnVN(var6, var6)
                  : this.UuUVuuUu(var1, "color", var4, var5 + 1, var6);
            }
         }
      } else {
         return new NnnVVVUnVNuN.nUNvUnnVN(var6, var6);
      }
   }

   private NnnVVVUnVNuN.nUNvUnnVN UuUVuuUu(String var1, String var2, String var3, NUunUunuNV var4, int var5, int var6) {
      NnnVVVUnVNuN.nUNvUnnVN var7 = this.UuUVuuUu(var1, var2, var4, var5, var6);
      NnnVVVUnVNuN.nUNvUnnVN var8 = this.UuUVuuUu(var1, var3, var4, var5, var6);
      return new NnnVVVUnVNuN.nUNvUnnVN(var7.a(), var8.b());
   }

   private NnnVVVUnVNuN.nUNvUnnVN UuUVuuUu(String var1, String var2, NUunUunuNV var3, int var4, int var5) {
      nNuNNVuNUu var6 = this.UuuNnUvUuv.C00OOC00oO(var1, var2);
      if (var6 != null) {
         NUuvnUuVU var9 = this.C00OOC00oO(var6.UuUVuuUu(), var6.C00OOC00oO(), unnunUNUUnu.OUTPUT);
         return this.UuUVuuUu(var6.UuUVuuUu(), var6.C00OOC00oO(), var9, var3, var4);
      } else {
         NUuvnUuVU var7 = this.C00OOC00oO(var1, var2, unnunUNUUnu.INPUT);
         int var8 = this.UuUVuuUu(var7, var3, var5);
         return new NnnVVVUnVNuN.nUNvUnnVN(var8, var8);
      }
   }

   private int UuUVuuUu(NUuvnUuVU var1, NUunUunuNV var2, int var3) {
      if (var1 != null && var1.type() == nnNVVnNnnV.VEC4) {
         String var4 = var1.defaultExpression();
         if (var4 == null) {
            return var3;
         } else if (var4.contains("u_AccentTop")) {
            return NUunUunuNV.UuUVuuUu(this.UuUVuuUu(var2.uVunuUNVVUUV(), var2), 246);
         } else if (var4.contains("u_AccentBottom")) {
            return NUunUunuNV.UuUVuuUu(this.UuUVuuUu(var2.UNnVVNvvnVvU(), var2), 246);
         } else if (var4.contains("u_ThemeColors")) {
            return NUunUunuNV.UuUVuuUu(this.UuUVuuUu(var2.nuUnNvnuUu(), var2), 246);
         } else {
            return var4.contains("vec4(1.0") ? NUunUunuNV.UuUVuuUu(this.UuUVuuUu(var2.NVNnnvnuunNv(), var2), 246) : var3;
         }
      } else {
         return var3;
      }
   }

   private int UuUVuuUu(int var1, NUunUunuNV var2) {
      int var3 = NUunUunuNV.UuUVuuUu(var1, 255);
      float var4 = this.UuUVuuUu(var2) ? 0.02F : 0.16F;
      return NUunUunuNV.UuUVuuUu(var3, var2.NVNnnvnuunNv(), var4);
   }

   private int UuUVuuUu(NUuvnUuVU var1, NUunUunuNV var2) {
      if (var1 == null) {
         return NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), 220);
      } else {
         return switch (var1.type()) {
            case FLOAT -> NUunUunuNV.UuUVuuUu(250, 211, 126, 240);
            case VEC2 -> NUunUunuNV.UuUVuuUu(119, 210, 255, 240);
            case VEC3 -> NUunUunuNV.UuUVuuUu(var2.uVunuUNVVUUV(), 240);
            case VEC4 -> NUunUunuNV.UuUVuuUu(var2.UNnVVNvvnVvU(), 240);
            case INT -> NUunUunuNV.UuUVuuUu(155, 255, 61, 240);
         };
      }
   }

   private int C00OOC00oO(NUunUunuNV var1) {
      return this.UuUVuuUu(var1) ? NUunUunuNV.UuUVuuUu(10, 10, 10, 255) : var1.NVNnnvnuunNv();
   }

   private int uUnuvNvvNU(NUunUunuNV var1) {
      return this.UuUVuuUu(var1) ? NUunUunuNV.UuUVuuUu(10, 10, 10, 210) : var1.uVUVnuvnuVuv();
   }

   private float C00OOC00oO(uuUnNVuuVUu var1) {
      int var2 = Math.max(var1.uNNnnnuuuN().size(), var1.nuUnNvnuUu().size());
      float var3 = Math.max(96.0F, 60.0F + var2 * 26.0F);
      return !"float_value".equals(var1.UuUVuuUu())
            && !"int_value".equals(var1.UuUVuuUu())
            && !"exposed_float".equals(var1.UuUVuuUu())
            && !"exposed_color".equals(var1.UuUVuuUu())
         ? var3
         : var3 + 24.0F;
   }

   private float UuUVuuUu(uuUnNVuuVUu var1, VUnvuNuVUUn var2) {
      float var3 = this.C00OOC00oO(var1);
      if (var2 != null && var1.vNUvnnVnUvu()) {
         uNuuunuNvuN var4 = this.UuuNnUvUuv(var2.UuUVuuUu());
         return var3 + var4.UuUVuuUu() * 128.0F;
      } else {
         return var3;
      }
   }

   private uNuuunuNvuN UuuNnUvUuv(String var1) {
      return this.vVvuUVnV
         .computeIfAbsent(var1, var0 -> new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uNNnVuNunvU.UuUVuuUu(2.6F, 0.78F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F));
   }

   private vnvNNVNU UuUVuuUu(uuUnNVuuVUu var1, float var2, float var3, float var4) {
      float var5 = Math.max(52.0F * this.vNVuvnUUnuUn, 0.0F);
      float var6 = Math.max(16.0F * this.vNVuvnUUnuUn, 0.0F);
      return new vnvNNVNU(var2 + var4 - var5 - 10.0F * this.vNVuvnUUnuUn, var3 + 12.0F * this.vNVuvnUUnuUn, var5, var6);
   }

   private float UuUVuuUu(int var1) {
      return 64.0F + var1 * 26.0F;
   }

   private float uUnuvNvvNU(float var1) {
      return this.nUUVuvU + var1 * this.vNVuvnUUnuUn;
   }

   private float vVvUvVVuuNvV(float var1) {
      return this.UnUNVVVNuv + var1 * this.vNVuvnUUnuUn;
   }

   private float uNNnnnuuuN(float var1) {
      return (var1 - this.nUUVuvU) / Math.max(0.001F, this.vNVuvnUUnuUn);
   }

   private float nuUnNvnuUu(float var1) {
      return (var1 - this.UnUNVVVNuv) / Math.max(0.001F, this.vNVuvnUUnuUn);
   }

   private vnvNNVNU C00OOC00oO(nUvnuVnNUU var1, int var2) {
      return new vnvNNVNU(var1.UuUVuuUu(42.0F), var1.UuUVuuUu(106.0F), var1.UuUVuuUu(232.0F), var2 - var1.UuUVuuUu(148.0F));
   }

   private vnvNNVNU uUnuvNvvNU(nUvnuVnNUU var1, int var2) {
      return this.nnvuvUNuUnN
         ? new vnvNNVNU(var1.UuUVuuUu(42.0F), var1.UuUVuuUu(106.0F), var1.UuUVuuUu(28.0F), var1.UuUVuuUu(28.0F))
         : new vnvNNVNU(var1.UuUVuuUu(42.0F) + var1.UuUVuuUu(232.0F) - var1.UuUVuuUu(34.0F), var1.UuUVuuUu(106.0F), var1.UuUVuuUu(28.0F), var1.UuUVuuUu(28.0F));
   }

   private vnvNNVNU UuUVuuUu(nUvnuVnNUU var1, int var2, int var3) {
      float var4 = Math.min(var1.UuUVuuUu(342.0F), Math.max(var1.UuUVuuUu(286.0F), var2 * 0.25F));
      float var5 = Math.min(var1.UuUVuuUu(292.0F), Math.max(var1.UuUVuuUu(220.0F), var3 * 0.3F));
      return new vnvNNVNU(var2 - var4 - var1.UuUVuuUu(42.0F), var1.UuUVuuUu(104.0F), var4, var5);
   }

   private vnvNNVNU UuUVuuUu(vnvNNVNU var1, nUvnuVnNUU var2, int var3) {
      float var4 = var2.UuUVuuUu(27.0F);
      float var5 = var1.y() + var2.UuUVuuUu(74.0F) + var3 * var4;
      float var6 = var1.x() + var2.UuUVuuUu(90.0F);
      return new vnvNNVNU(var6, var5, var1.w() - var2.UuUVuuUu(104.0F), var2.UuUVuuUu(20.0F));
   }

   private vnvNNVNU C00OOC00oO(vnvNNVNU var1, nUvnuVnNUU var2) {
      return new vnvNNVNU(var1.x() + var1.w() - var2.UuUVuuUu(108.0F), var1.y() + var2.UuUVuuUu(14.0F), var2.UuUVuuUu(92.0F), var2.UuUVuuUu(22.0F));
   }

   private VUnvuNuVUUn UvUvUNuvNU() {
      this.nvUVNnuu();
      return this.unNNVVNnvvV == null ? null : this.UuuNnUvUuv.uUnuvNvvNU(this.unNNVVNnvvV);
   }

   private String C00OOC00oO(VUnvuNuVUUn var1, String var2) {
      return var1.UuUVuuUu() + ":" + var2;
   }

   private UVvNVvUUuUnN UuUVuuUu(String var1, float var2, float var3, float var4) {
      UVvNVvUUuUnN var5 = this.NnUVNnuvUv.computeIfAbsent(var1, var2x -> UVvNVvUUuUnN.UuUVuuUu(var2, var3));
      var5.C00OOC00oO(var2, var3);
      float var6 = Math.max(2.0E-4F, Math.min(1.0F, Math.abs(var4) * 1.8F));
      var5.uUnuvNvvNU(var6, var6 * 0.1F);
      return var5;
   }

   private UVvNVvUUuUnN nUUVuvU(String var1) {
      return this.NnUVNnuvUv.computeIfAbsent(var1, var0 -> UVvNVvUUuUnN.UuUVuuUu());
   }

   private vnvNNVNU uUnuvNvvNU(VUnvuNuVUUn var1) {
      uuUnNVuuVUu var2 = this.nuUnNvnuUu.UuUVuuUu(var1.C00OOC00oO());
      if (var2 == null) {
         return new vnvNNVNU(0.0F, 0.0F, 0.0F, 0.0F);
      } else {
         float var3 = this.uUnuvNvvNU(var1.uUnuvNvvNU()) + 14.0F * this.vNVuvnUUnuUn;
         float var4 = this.vVvUvVVuuNvV(var1.vVvUvVVuuNvV()) + 78.0F * this.vNVuvnUUnuUn;
         float var5 = Math.max(1.0F, (var2.vVvUvVVuuNvV() - 28.0F) * this.vNVuvnUUnuUn);
         float var6 = Math.max(1.0F, 18.0F * this.vNVuvnUUnuUn);
         return new vnvNNVNU(var3, var4, var5, var6);
      }
   }

   private vnvNNVNU vVvUvVVuuNvV(VUnvuNuVUUn var1) {
      uuUnNVuuVUu var2 = this.nuUnNvnuUu.UuUVuuUu(var1.C00OOC00oO());
      if (var2 == null) {
         return new vnvNNVNU(0.0F, 0.0F, 0.0F, 0.0F);
      } else {
         float var3 = this.uUnuvNvvNU(var1.uUnuvNvvNU()) + 14.0F * this.vNVuvnUUnuUn;
         float var4 = this.vVvUvVVuuNvV(var1.vVvUvVVuuNvV()) + 78.0F * this.vNVuvnUUnuUn;
         float var5 = Math.max(1.0F, (var2.vVvUvVVuuNvV() - 28.0F) * this.vNVuvnUUnuUn);
         float var6 = Math.max(1.0F, 18.0F * this.vNVuvnUUnuUn);
         return new vnvNNVNU(var3, var4, var5, var6);
      }
   }

   private vnvNNVNU C00OOC00oO(nUvnuVnNUU var1, int var2, int var3) {
      float var4 = Math.min(var1.UuUVuuUu(340.0F), var2 * 0.31F);
      float var5 = Math.min(var1.UuUVuuUu(232.0F), var3 * 0.3F);
      if (!this.nVuuUnnUUVU) {
         this.nUununvNvvn = var2 - var4 - var1.UuUVuuUu(42.0F);
         this.NuvunVvnnN = var3 - var5 - var1.UuUVuuUu(42.0F);
         this.nVuuUnnUUVU = true;
      }

      this.nUununvNvvn = C00OOC00oO(this.nUununvNvvn, var1.UuUVuuUu(24.0F), Math.max(var1.UuUVuuUu(24.0F), var2 - var4 - var1.UuUVuuUu(24.0F)));
      this.NuvunVvnnN = C00OOC00oO(this.NuvunVvnnN, var1.UuUVuuUu(94.0F), Math.max(var1.UuUVuuUu(94.0F), var3 - var5 - var1.UuUVuuUu(24.0F)));
      return new vnvNNVNU(this.nUununvNvvn, this.NuvunVvnnN, var4, var5);
   }

   private boolean uNNnnnuuuN(VUnvuNuVUUn var1) {
      return var1 != null && ("exposed_float".equals(var1.C00OOC00oO()) || "exposed_color".equals(var1.C00OOC00oO()));
   }

   private String nuUnNvnuUu(VUnvuNuVUUn var1) {
      return var1 != null && "exposed_color".equals(var1.C00OOC00oO()) ? "Color" : "Radius";
   }

   private boolean c0oOOCcCoC0() {
      class_310 var1 = class_310.method_1551();
      return var1 != null && var1.method_22683() != null ? GLFW.glfwGetKey(var1.method_22683().method_4490(), 32) == 1 : false;
   }

   private int VVnVNnunVvu() {
      class_310 var1 = class_310.method_1551();
      return var1 != null && var1.method_22683() != null ? Math.max(1, var1.method_22683().method_4489()) : 1;
   }

   private int unNNVVNnvvV() {
      class_310 var1 = class_310.method_1551();
      return var1 != null && var1.method_22683() != null ? Math.max(1, var1.method_22683().method_4506()) : 1;
   }

   private nUvnuVnNUU NuunnvnN() {
      return this.NUuVnnuUnvu != null ? this.NUuVnnuUnvu : nUvnuVnNUU.UuUVuuUu(this.VVnVNnunVvu(), this.unNNVVNnvvV(), VvuVNnN.UuUVuuUu());
   }

   private vnvNNVNU vVvUvVVuuNvV(nUvnuVnNUU var1, int var2) {
      float var3 = var1.UuUVuuUu(28.0F);
      return new vnvNNVNU(var2 - this.nuUnNvnuUu(var1) - var1.UuUVuuUu(74.0F), var1.UuUVuuUu(46.0F), var1.UuUVuuUu(74.0F), var3);
   }

   private vnvNNVNU uNNnnnuuuN(nUvnuVnNUU var1, int var2) {
      float var3 = var1.UuUVuuUu(28.0F);
      return new vnvNNVNU(this.vVvUvVVuuNvV(var1, var2).x() - var1.UuUVuuUu(10.0F) - var1.UuUVuuUu(96.0F), var1.UuUVuuUu(46.0F), var1.UuUVuuUu(96.0F), var3);
   }

   private vnvNNVNU UuUVuuUu(nUvnuVnNUU var1) {
      return new vnvNNVNU(var1.UuUVuuUu(34.0F) + var1.UuUVuuUu(200.0F), var1.UuUVuuUu(46.0F), var1.UuUVuuUu(84.0F), var1.UuUVuuUu(28.0F));
   }

   private vnvNNVNU C00OOC00oO(nUvnuVnNUU var1) {
      vnvNNVNU var2 = this.UuUVuuUu(var1);
      return new vnvNNVNU(var2.x() + var2.w() + var1.UuUVuuUu(10.0F), var1.UuUVuuUu(46.0F), var1.UuUVuuUu(220.0F), var1.UuUVuuUu(28.0F));
   }

   private vnvNNVNU uUnuvNvvNU(nUvnuVnNUU var1) {
      vnvNNVNU var2 = this.C00OOC00oO(var1);
      return new vnvNNVNU(var2.x() + var2.w() + var1.UuUVuuUu(10.0F), var1.UuUVuuUu(46.0F), var1.UuUVuuUu(136.0F), var1.UuUVuuUu(28.0F));
   }

   private vnvNNVNU nuUnNvnuUu(nUvnuVnNUU var1, int var2) {
      vnvNNVNU var3 = this.uNNnnnuuuN(var1, var2);
      return new vnvNNVNU(var3.x() - var1.UuUVuuUu(10.0F) - var1.UuUVuuUu(110.0F), var1.UuUVuuUu(46.0F), var1.UuUVuuUu(110.0F), var1.UuUVuuUu(28.0F));
   }

   private vnvNNVNU uUnuvNvvNU(nUvnuVnNUU var1, int var2, int var3) {
      vnvNNVNU var4 = this.nuUnNvnuUu(var1, var2);
      float var5 = Math.min(var1.UuUVuuUu(520.0F), Math.max(var1.UuUVuuUu(420.0F), var2 * 0.3F));
      float var6 = C00OOC00oO(var4.x() + var4.w() - var5, var1.UuUVuuUu(42.0F), var2 - var5 - var1.UuUVuuUu(42.0F));
      float var7 = var4.y() + var4.h() + var1.UuUVuuUu(10.0F);
      float var8 = Math.min(var1.UuUVuuUu(520.0F), Math.max(var1.UuUVuuUu(220.0F), var3 - var7 - var1.UuUVuuUu(34.0F)));
      return new vnvNNVNU(var6, var7, var5, var8);
   }

   private vnvNNVNU uUnuvNvvNU(vnvNNVNU var1, nUvnuVnNUU var2) {
      return new vnvNNVNU(var1.x() + var2.UuUVuuUu(10.0F), var1.y() + var2.UuUVuuUu(74.0F), var1.w() - var2.UuUVuuUu(20.0F), var1.h() - var2.UuUVuuUu(84.0F));
   }

   private vnvNNVNU C00OOC00oO(vnvNNVNU var1, nUvnuVnNUU var2, int var3) {
      float var4 = var2.UuUVuuUu(8.0F);
      float var5 = (var1.w() - var2.UuUVuuUu(20.0F) - var4 * 2.0F) / 3.0F;
      return new vnvNNVNU(var1.x() + var2.UuUVuuUu(10.0F) + var3 * (var5 + var4), var1.y() + var2.UuUVuuUu(42.0F), var5, var2.UuUVuuUu(24.0F));
   }

   private float vVvUvVVuuNvV(nUvnuVnNUU var1) {
      return var1.UuUVuuUu(68.0F);
   }

   private vnvNNVNU vVvUvVVuuNvV(vnvNNVNU var1, nUvnuVnNUU var2) {
      float var3 = var2.UuUVuuUu(24.0F);
      return new vnvNNVNU(var1.x() + var1.w() - var3 - var2.UuUVuuUu(10.0F), var1.y() + var2.UuUVuuUu(10.0F), var3, var3);
   }

   private vnvNNVNU uNNnnnuuuN(vnvNNVNU var1, nUvnuVnNUU var2) {
      float var3 = var1.h() - var2.UuUVuuUu(14.0F);
      float var4 = var2.UuUVuuUu(78.0F);
      return new vnvNNVNU(var1.x() + var2.UuUVuuUu(26.0F), var1.y() + var2.UuUVuuUu(7.0F), var4, var3);
   }

   private vnvNNVNU UuUVuuUu(vnvNNVNU var1, nUvnuVnNUU var2, float var3) {
      float var4 = var2.UuUVuuUu(48.0F);
      float var5 = var2.UuUVuuUu(24.0F);
      vnvNNVNU var6 = this.C00OOC00oO(var1, var2, var3);
      return new vnvNNVNU(var6.x() - var2.UuUVuuUu(8.0F) - var4, var3 + var2.UuUVuuUu(14.0F), var4, var5);
   }

   private vnvNNVNU C00OOC00oO(vnvNNVNU var1, nUvnuVnNUU var2, float var3) {
      float var4 = var2.UuUVuuUu(24.0F);
      return new vnvNNVNU(var1.x() + var1.w() - var4 - var2.UuUVuuUu(18.0F), var3 + var2.UuUVuuUu(14.0F), var4, var4);
   }

   private vnvNNVNU uUnuvNvvNU(vnvNNVNU var1, nUvnuVnNUU var2, float var3) {
      vnvNNVNU var4 = this.vVvUvVVuuNvV(var1, var2, var3);
      float var5 = var2.UuUVuuUu(52.0F);
      return new vnvNNVNU(var4.x() - var2.UuUVuuUu(8.0F) - var5, var3 + var2.UuUVuuUu(19.0F), var5, var2.UuUVuuUu(24.0F));
   }

   private vnvNNVNU vVvUvVVuuNvV(vnvNNVNU var1, nUvnuVnNUU var2, float var3) {
      float var4 = var2.UuUVuuUu(58.0F);
      return new vnvNNVNU(var1.x() + var1.w() - var4 - var2.UuUVuuUu(18.0F), var3 + var2.UuUVuuUu(19.0F), var4, var2.UuUVuuUu(24.0F));
   }

   private vnvNNVNU uNNnnnuuuN(nUvnuVnNUU var1) {
      vnvNNVNU var2 = this.UuUVuuUu(var1);
      float var3 = var1.UuUVuuUu(320.0F);
      return new vnvNNVNU(var2.x(), var2.y() + var2.h() + var1.UuUVuuUu(10.0F), var3, var1.UuUVuuUu(300.0F));
   }

   private vnvNNVNU uUnuvNvvNU(vnvNNVNU var1, nUvnuVnNUU var2, int var3) {
      float var4 = var2.UuUVuuUu(7.0F);
      float var5 = (var1.w() - var2.UuUVuuUu(24.0F) - var4) * 0.5F;
      float var6 = var2.UuUVuuUu(28.0F);
      int var7 = var3 & 1;
      int var8 = var3 >> 1;
      return new vnvNNVNU(var1.x() + var2.UuUVuuUu(12.0F) + var7 * (var5 + var4), var1.y() + var2.UuUVuuUu(164.0F) + var8 * (var6 + var4), var5, var6);
   }

   private vnvNNVNU vVvUvVVuuNvV(nUvnuVnNUU var1, int var2, int var3) {
      vnvNNVNU var4 = this.uUnuvNvvNU(var1);
      float var5 = Math.min(var1.UuUVuuUu(520.0F), var2 - var1.UuUVuuUu(84.0F));
      float var6 = Math.min(var1.UuUVuuUu(252.0F), var3 - var4.y() - var4.h() - var1.UuUVuuUu(34.0F));
      float var7 = C00OOC00oO(var4.x() + var4.w() - var5, var1.UuUVuuUu(42.0F), var2 - var5 - var1.UuUVuuUu(42.0F));
      return new vnvNNVNU(var7, var4.y() + var4.h() + var1.UuUVuuUu(10.0F), var5, var6);
   }

   private vnvNNVNU vVvUvVVuuNvV(vnvNNVNU var1, nUvnuVnNUU var2, int var3) {
      float var4 = var2.UuUVuuUu(8.0F);
      float var5 = (var1.w() - var2.UuUVuuUu(24.0F) - var4) * 0.5F;
      float var6 = var2.UuUVuuUu(42.0F);
      int var7 = var3 & 1;
      int var8 = var3 >> 1;
      return new vnvNNVNU(var1.x() + var2.UuUVuuUu(12.0F) + var7 * (var5 + var4), var1.y() + var2.UuUVuuUu(52.0F) + var8 * (var6 + var4), var5, var6);
   }

   private vnvNNVNU uNNnnnuuuN(vnvNNVNU var1, nUvnuVnNUU var2, int var3) {
      float var4 = var2.UuUVuuUu(7.0F);
      float var5 = (var1.w() - var2.UuUVuuUu(24.0F) - var4 * 2.0F) / 3.0F;
      return new vnvNNVNU(var1.x() + var2.UuUVuuUu(12.0F) + var3 * (var5 + var4), var1.y() + var1.h() - var2.UuUVuuUu(40.0F), var5, var2.UuUVuuUu(26.0F));
   }

   private vnvNNVNU VVuuUN(nUvnuVnNUU var1, int var2) {
      vnvNNVNU var3 = this.uNNnnnuuuN(var1, var2);
      return new vnvNNVNU(var3.x() - var1.UuUVuuUu(150.0F), var3.y() + var3.h() + var1.UuUVuuUu(10.0F), var1.UuUVuuUu(300.0F), var1.UuUVuuUu(236.0F));
   }

   private vnvNNVNU nuUnNvnuUu(vnvNNVNU var1, nUvnuVnNUU var2, int var3) {
      float var4 = var2.UuUVuuUu(8.0F);
      float var5 = (var1.w() - var2.UuUVuuUu(32.0F) - var4 * 2.0F) / 3.0F;
      return new vnvNNVNU(var1.x() + var2.UuUVuuUu(16.0F) + var3 * (var5 + var4), var1.y() + var2.UuUVuuUu(84.0F), var5, var2.UuUVuuUu(26.0F));
   }

   private vnvNNVNU uNNnnnuuuN(nUvnuVnNUU var1, int var2, int var3) {
      float var4 = var1.UuUVuuUu(430.0F);
      float var5 = var1.UuUVuuUu(148.0F);
      return new vnvNNVNU((var2 - var4) * 0.5F, (var3 - var5) * 0.5F, var4, var5);
   }

   private vnvNNVNU nuUnNvnuUu(vnvNNVNU var1, nUvnuVnNUU var2) {
      return new vnvNNVNU(var1.x() + var2.UuUVuuUu(18.0F), var1.y() + var1.h() - var2.UuUVuuUu(44.0F), var2.UuUVuuUu(132.0F), var2.UuUVuuUu(30.0F));
   }

   private vnvNNVNU VVuuUN(vnvNNVNU var1, nUvnuVnNUU var2) {
      return new vnvNNVNU(var1.x() + var2.UuUVuuUu(160.0F), var1.y() + var1.h() - var2.UuUVuuUu(44.0F), var2.UuUVuuUu(112.0F), var2.UuUVuuUu(30.0F));
   }

   private vnvNNVNU vNUvnnVnUvu(vnvNNVNU var1, nUvnuVnNUU var2) {
      return new vnvNNVNU(var1.x() + var1.w() - var2.UuUVuuUu(118.0F), var1.y() + var1.h() - var2.UuUVuuUu(44.0F), var2.UuUVuuUu(100.0F), var2.UuUVuuUu(30.0F));
   }

   private float nuUnNvnuUu(nUvnuVnNUU var1) {
      return var1.UuUVuuUu(64.0F);
   }

   private void NVUunUNUN() {
      this.VvVvnNUnvuvV = false;
      this.ccOO0COcoco0 = false;
      this.NUVvUUVuVNVv = false;
      this.UNvvunVVn = false;
      this.VunnVNvNV = false;
      this.VnVuuvVvnNv = false;
   }

   private void UUVNuUNUvUnV() {
      try {
         this.uuuVnuvnnNnU.UuUVuuUu(this.vuvnUnVnUNnV());
      } catch (Throwable var2) {
      }
   }

   private String vuvnUnVnUNnV() {
      JSONObject var1 = VnnVNVNVUnnn.C00OOC00oO(this.UuuNnUvUuv);
      JSONObject var2 = var1.optJSONObject("metadata");
      if (var2 != null) {
         var2.put("updatedAt", 0L);
         var2.put("source", "");
      }

      return var1.toString();
   }

   private void UnUNVVVNuv(String var1) {
      this.UuuNnUvUuv = VnnVNVNVUnnn.UuUVuuUu(new JSONObject(var1), this.nuUnNvnuUu);
      this.uUVvnUuNvvN();
      VnuVUNUv var2 = VnuVUNUv.UuUVuuUu(this.UuuNnUvUuv.C00OOC00oO());
      if (var2 != null && var2 != VnuVUNUv.PREVIEW_ONLY) {
         this.NNUUNUuVNNVn = var2;
      }

      this.uNNnnnuuuN(this.NNUUNUuVNNVn);
      this.vNUvnnVnUvu.UuUVuuUu(this.NNUUNUuVNNVn);
      this.vNUvnnVnUvu.UuUVuuUu(this.UuuNnUvUuv);
      this.uVUuuVnNVU();
      this.uunNUuunVU.keySet().removeIf(var1x -> this.UuuNnUvUuv.uUnuvNvvNU(var1x) == null);
      this.NvnuuuvnVV.keySet().removeIf(var1x -> this.UuuNnUvUuv.uUnuvNvvNU(var1x) == null);
      this.NnUVNnuvUv.keySet().removeIf(var1x -> {
         int var2x = var1x.indexOf(58);
         String var3 = var2x > 0 ? var1x.substring(0, var2x) : var1x;
         return this.UuuNnUvUuv.uUnuvNvvNU(var3) == null;
      });
      this.NvnnUUuVvNU.keySet().removeIf(var1x -> this.UuuNnUvUuv.uUnuvNvvNU(var1x) == null);
      this.vVvuUVnV.keySet().removeIf(var1x -> this.UuuNnUvUuv.uUnuvNvvNU(var1x) == null);
      this.UuuuNNunN = null;
      this.NNVNuUvVn = null;
      this.vuNnuUnu = null;
      this.UvUvUNuvNU = null;
      this.UuNnnVnuNNV = null;
      this.uUVvnUuNvvN = null;
      if (!this.UuuNnUvUuv.UuUVuuUu().C00OOC00oO().isBlank()) {
         this.nNunUnVN = this.UuuNnUvUuv.UuUVuuUu().C00OOC00oO();
      }
   }

   private void nnuUVNUuvvVU() {
      try {
         String var1 = this.uuuVnuvnnNnU.C00OOC00oO(this.vuvnUnVnUNnV());
         if (var1 == null) {
            this.vNVuvnUUnuUn("nothing to undo");
            return;
         }

         this.UnUNVVVNuv(var1);
         this.vNVuvnUUnuUn("undo");
      } catch (Throwable var2) {
         this.vNVuvnUUnuUn("undo failed");
      }
   }

   private void nVVUuvuNnUN() {
      try {
         String var1 = this.uuuVnuvnnNnU.uUnuvNvvNU(this.vuvnUnVnUNnV());
         if (var1 == null) {
            this.vNVuvnUUnuUn("nothing to redo");
            return;
         }

         this.UnUNVVVNuv(var1);
         this.vNVuvnUUnuUn("redo");
      } catch (Throwable var2) {
         this.vNVuvnUUnuUn("redo failed");
      }
   }

   private void nNnVnUNVV() {
      this.UUVNuUNUvUnV();
      this.UuuNnUvUuv = O0oCc0Ccc.UuUVuuUu(this.nuUnNvnuUu);
      this.nNunUnVN = nVNvNVnvnVvn.UuUVuuUu();
      this.UuuNnUvUuv.UuUVuuUu().UuUVuuUu(this.nNunUnVN, lllilIiI11l.VVuuUN());
      this.UuuNnUvUuv.UuUVuuUu().UuUVuuUu(this.nNunUnVN);
      this.UuuNnUvUuv.UuUVuuUu().nuUnNvnuUu("Host Rectangle");
      this.uUVvnUuNvvN();
      this.uNNnnnuuuN(this.NNUUNUuVNNVn);
      this.uVUuuVnNVU();
      this.vuuuNvNuv();
      this.VNNnnVUuvv = null;
      this.vNUvnnVnUvu.close();
      this.uuVuUuuVVNvN = this.UuuNnUvUuv.uNNnnnuuuN();
      this.uNNnnnuuuN();
      this.vNVuvnUUnuUn("reset");
   }

   private void uUnuvNvvNU(VnuVUNUv var1) {
      if (var1 != null && var1 != this.NNUUNUuVNNVn) {
         if (this.UuuNnUvUuv != null && this.UuuNnUvUuv.uNNnnnuuuN() != this.uuVuUuuVVNvN && !this.UuuNnUvUuv.uUnuvNvvNU().isEmpty()) {
            this.nNuVunNUVu = var1;
            this.UNvvunVVn = true;
         } else {
            this.vVvUvVVuuNvV(var1);
         }
      }
   }

   private void vVvUvVVuuNvV(VnuVUNUv var1) {
      if (var1 != null) {
         this.UUVNuUNUvUnV();
         this.NNUUNUuVNNVn = var1;
         this.uNNnnnuuuN(var1);
         this.UUuUnNVNuuv();
         this.vNUvnnVnUvu.UuUVuuUu(var1);
         this.vNUvnnVnUvu.UuUVuuUu(this.UuuNnUvUuv);
         this.vNVuvnUUnuUn(var1.C00OOC00oO());
      }
   }

   private void C00OOC00oO(boolean var1) {
      if (!nuvUVvnNUN.UuUVuuUu.isEmpty()) {
         int var2 = Math.max(0, Math.min(nuvUVvnNUN.UuUVuuUu.size() - 1, this.NnunUUnU));
         this.UUVNuUNUvUnV();
         nuvUVvnNUN.NVnVnNnN var3 = nuvUVvnNUN.UuUVuuUu.get(var2);
         nuVVnvn var4 = nuvUVvnNUN.UuUVuuUu(var3, this.nuUnNvnuUu);
         if (var4 != null) {
            if (var1) {
               this.C00OOC00oO(var4);
               this.vNVuvnUUnuUn("merged " + var3.UuUVuuUu);
            } else {
               this.UuuNnUvUuv = var4;
               this.uUVvnUuNvvN();
               VnuVUNUv var5 = VnuVUNUv.UuUVuuUu(this.UuuNnUvUuv.C00OOC00oO());
               if (var5 != VnuVUNUv.PREVIEW_ONLY) {
                  this.NNUUNUuVNNVn = var5;
               }

               this.nNunUnVN = this.UuuNnUvUuv.UuUVuuUu().C00OOC00oO().isBlank() ? var3.UuUVuuUu : this.UuuNnUvUuv.UuUVuuUu().C00OOC00oO();
               this.UuuNnUvUuv.UuUVuuUu().UuUVuuUu(this.nNunUnVN, lllilIiI11l.VVuuUN());
               this.VNNnnVUuvv = null;
               this.uVUuuVnNVU();
               this.vuuuNvNuv();
               this.vNUvnnVnUvu.close();
               this.vNUvnnVnUvu.UuUVuuUu(this.NNUUNUuVNNVn);
               this.vNUvnnVnUvu.UuUVuuUu(this.UuuNnUvUuv);
               this.UvnvNVnnnnNU = 0.78F;
               this.uVUVnuvnuVuv.UuUVuuUu(0.78F);
               this.nUUVuvU = 720.0F;
               this.UnUNVVVNuv = 360.0F;
               this.uuVuUuuVVNvN = -1;
               this.uNNnnnuuuN();
               this.vNVuvnUUnuUn("template: " + var3.UuUVuuUu);
            }
         }
      }
   }

   private void C00OOC00oO(nuVVnvn var1) {
      if (var1 != null) {
         HashMap var2 = new HashMap();
         float var3 = this.NuunnvnN().UuUVuuUu(80.0F);
         float var4 = this.NuunnvnN().UuUVuuUu(80.0F);

         for (VUnvuNuVUUn var6 : var1.uUnuvNvvNU()) {
            VUnvuNuVUUn var7 = this.UuuNnUvUuv.UuUVuuUu(var6.C00OOC00oO(), var6.uUnuvNvvNU() + var3, var6.vVvUvVVuuNvV() + var4, this.nuUnNvnuUu);
            var7.nuUnNvnuUu().putAll(var6.nuUnNvnuUu());
            var7.VVuuUN().putAll(var6.VVuuUN());
            var2.put(var6.UuUVuuUu(), var7.UuUVuuUu());
         }

         for (nNuNNVuNUu var10 : var1.vVvUvVVuuNvV()) {
            String var11 = (String)var2.get(var10.UuUVuuUu());
            String var8 = (String)var2.get(var10.uUnuvNvvNU());
            if (var11 != null && var8 != null) {
               this.UuuNnUvUuv.UuUVuuUu(var11, var10.C00OOC00oO(), var8, var10.vVvUvVVuuNvV(), this.nuUnNvnuUu);
            }
         }

         this.UuuNnUvUuv.nuUnNvnuUu();
      }
   }

   private void nuunNvv() {
      try {
         File var1 = lllilIiI11l.UuUVuuUu().uUnuvNvvNU();
         if (!var1.exists()) {
            var1.mkdirs();
         }

         class_156.method_668().method_672(var1);
         this.vNVuvnUUnuUn("opened folder");
      } catch (Throwable var2) {
         this.vNVuvnUUnuUn("open folder failed");
      }
   }

   private String UuUVuuUu(long var1) {
      return var1 <= 0L ? "-" : UuUVuuUu.format(new Date(var1));
   }

   private void uUVVvVVNvvn() {
      try {
         this.uNNnnnuuuN(this.NNUUNUuVNNVn);
         this.UUuUnNVNuuv();
         File var1 = lllilIiI11l.UuUVuuUu().C00OOC00oO(this.NNUUNUuVNNVn, this.UuuNnUvUuv, this.nuUnNvnuUu());
         if (var1 != null) {
            this.vNVuvnUUnuUn("exported -> " + var1.getName());
         } else {
            this.vNVuvnUUnuUn("export failed");
         }
      } catch (Throwable var2) {
         this.vNVuvnUUnuUn("export failed");
      }
   }

   private void vvUVNVvvNUv() {
      try {
         List var1 = lllilIiI11l.UuUVuuUu().uNNnnnuuuN();
         this.nvUVNnuu.UuUVuuUu(var1);
         this.vNVuvnUUnuUn(var1.isEmpty() ? "no shader files" : "import");
      } catch (Throwable var2) {
         this.vNVuvnUUnuUn("import failed");
      }
   }

   private void UuNnnVnuNNV() {
      File var1 = this.nvUVNnuu.uUnuvNvvNU();
      if (var1 != null) {
         try {
            nuVVnvn var2 = lllilIiI11l.UuUVuuUu().UuUVuuUu(var1, this.nuUnNvnuUu);
            if (var2 == null) {
               this.vNVuvnUUnuUn("import failed");
               return;
            }

            this.UUVNuUNUvUnV();
            this.UuuNnUvUuv = var2;
            this.uUVvnUuNvvN();
            VnuVUNUv var3 = VnuVUNUv.UuUVuuUu(this.UuuNnUvUuv.C00OOC00oO());
            this.NNUUNUuVNNVn = var3 == VnuVUNUv.PREVIEW_ONLY ? this.NNUUNUuVNNVn : var3;
            this.uNNnnnuuuN(this.NNUUNUuVNNVn);
            this.vNUvnnVnUvu.UuUVuuUu(this.NNUUNUuVNNVn);
            this.nNunUnVN = this.UuuNnUvUuv.UuUVuuUu().C00OOC00oO().isBlank()
               ? uNNnnnuuuN(var1.getName().replace(".wifd", "").replace(".json", ""))
               : this.UuuNnUvUuv.UuUVuuUu().C00OOC00oO();
            this.uVUuuVnNVU();
            this.vuuuNvNuv();
            this.VNNnnVUuvv = null;
            this.vNUvnnVnUvu.close();
            this.uuVuUuuVVNvN = -1;
            this.uNNnnnuuuN();
            this.vNVuvnUUnuUn("imported " + var1.getName());
         } catch (Throwable var4) {
            this.vNVuvnUUnuUn("import failed");
         }
      }
   }

   private void uNNnnnuuuN(VnuVUNUv var1) {
      if (this.UuuNnUvUuv != null && var1 != null) {
         this.UuuNnUvUuv.UuUVuuUu(var1.UuUVuuUu());
      }
   }

   private void uUVvnUuNvvN() {
      this.UnvuVuVnNuvu = this.UuuNnUvUuv != null && this.UuuNnUvUuv.UuUVuuUu() != null ? this.UuuNnUvUuv.UuUVuuUu().VVuuUN() : "Host Rectangle";
   }

   private void UUuUnNVNuuv() {
      if (this.UuuNnUvUuv != null && this.UuuNnUvUuv.UuUVuuUu() != null) {
         this.UuuNnUvUuv.UuUVuuUu().nuUnNvnuUu(this.UnvuVuVnNuvu);
      }
   }

   private void vNVuvnUUnuUn(String var1) {
      this.vVVuuVVv = var1 != null && !var1.isBlank() ? var1 : "ready";
      this.VuunNUUUvu = System.currentTimeMillis() + 1500L;
   }

   private void VVuuUN(float var1, float var2) {
      long var3 = System.nanoTime();
      if (this.VUuuVUnun != 0L) {
         float var5 = Math.max(0.001F, Math.min(0.05F, (float)(var3 - this.VUuuVUnun) / 1.0E9F));
         this.NVuunNnvvvVu = (var1 - this.UUuUnNVNuuv) / var5;
         this.vNnNuuvVn = (var2 - this.NVuNUuVnVUN) / var5;
      }

      this.VUuuVUnun = var3;
      this.UUuUnNVNuuv = var1;
      this.NVuNUuVnVUN = var2;
      if (System.currentTimeMillis() > this.VuunNUUUvu && this.vNUvnnVnUvu.C00OOC00oO().isBlank()) {
         this.vVVuuVVv = "ready";
      }
   }

   private static float VVuuUN(float var0) {
      float var1 = C00OOC00oO(var0, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   @Override
   public void close() {
      this.vNUvnnVnUvu.close();
      this.vuuuNvNuv.close();
   }

   record NVnVnNnN(float x, float y) {
   }

   record VUUnVnVNNU(float x, float y) {
   }

   record VUnuUnnuNvVu(String nodeId, String pinId, unnunUNUUnu direction) {
   }

   record VvunVVUvUNnv(VUvUNNUvvNVN slot, int presetIndex) {
   }

   record nUNvUnnVN(int a, int b) {
   }

   record nvUnvV(NnnVVVUnVNuN.uunvUUVnuNn row, boolean star) {
   }

   static enum nvnNNunvv {
      AUTO("Auto"),
      DARK("Dark"),
      LIGHT("Light");

      private final String UuUVuuUu;

      private nvnNNunvv(String var3) {
         this.UuUVuuUu = var3;
      }

      String UuUVuuUu() {
         return this.UuUVuuUu;
      }
   }

   record uunvUUVnuNn(int type, String category, uuUnNVuuVUu def, int count) {
   }
}
