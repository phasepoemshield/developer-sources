package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import org.json.JSONArray;
import org.json.JSONObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class unNvUUUUNVn {
   private static final unNvUUUUNVn UuUVuuUu = new unNvUUUUNVn();
   static final float[] C00OOC00oO = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
   private static final int uUnuvNvvNU = 48;
   private static final long vVvUvVVuuNvV = 33L;
   private static final int uNNnnnuuuN = 6;
   private static final int nuUnNvnuUu = 7;
   private final Map<String, unNvUUUUNVn.uunvUUVnuNn> VVuuUN = new LinkedHashMap<>();
   private final Map<String, float[]> vNUvnnVnUvu = new HashMap<>();
   private final Map<String, Integer> uVUuuVnNVU = new HashMap<>();
   private final Map<String, unNvUUUUNVn.nvnNNunvv> vuuuNvNuv = new LinkedHashMap<>(16, 0.75F, true);
   private final unNvUUUUNVn.NVnVnNnN nvUVNnuu = new unNvUUUUNVn.NVnVnNnN();
   private final unNvUUUUNVn.VvunVVUvUNnv UuuNnUvUuv = new unNvUUUUNVn.VvunVVUvUNnv();
   private boolean nUUVuvU;

   private unNvUUUUNVn() {
   }

   public static unNvUUUUNVn UuUVuuUu() {
      return UuUVuuUu;
   }

   public synchronized void UuUVuuUu(nvvuUNnNvN var1) {
      if (var1 != null) {
         if (!this.nUUVuvU) {
            this.vNUvnnVnUvu();
            oo0OOO00o0O.UuUVuuUu(this::C00OOC00oO);
            this.nUUVuvU = true;
         }

         for (unNvUUUUNVn.uunvUUVnuNn var3 : this.VVuuUN.values()) {
            if (var1.UuUVuuUu(var3.id()) == null) {
               var1.UuUVuuUu(var3.toNodeDefinition());
            }
         }

         C00OOC00oO(var1);
      }
   }

   public synchronized void UuUVuuUu(unNvUUUUNVn.uunvUUVnuNn var1) {
      if (var1 != null) {
         this.VVuuUN.put(var1.id(), var1);
      }
   }

   public synchronized unNvUUUUNVn.uunvUUVnuNn UuUVuuUu(String var1) {
      return this.VVuuUN.get(var1);
   }

   public synchronized Collection<unNvUUUUNVn.uunvUUVnuNn> C00OOC00oO() {
      return Collections.unmodifiableCollection(new ArrayList<>(this.VVuuUN.values()));
   }

   public synchronized List<unNvUUUUNVn.uunvUUVnuNn> UuUVuuUu(VnuVUNUv var1) {
      VnuVUNUv var2 = var1 == null ? VnuVUNUv.PREVIEW_ONLY : var1.vVvUvVVuuNvV();
      ArrayList var3 = new ArrayList();

      for (unNvUUUUNVn.uunvUUVnuNn var5 : this.VVuuUN.values()) {
         if (var5.target().vVvUvVVuuNvV() == var2) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public unNvUUUUNVn.NVnVnNnN uUnuvNvvNU() {
      return this.nvUVNnuu;
   }

   public unNvUUUUNVn.VvunVVUvUNnv vVvUvVVuuNvV() {
      return this.UuuNnUvUuv;
   }

   public synchronized String C00OOC00oO(VnuVUNUv var1) {
      if (var1 != null && var1 != VnuVUNUv.PREVIEW_ONLY) {
         StringBuilder var2 = new StringBuilder();

         for (unNvUUUUNVn.uunvUUVnuNn var4 : this.VVuuUN.values()) {
            if (var4.target().vVvUvVVuuNvV() == var1 && !var4.glslPreamble().isBlank()) {
               var2.append(var4.glslPreamble());
               if (!var4.glslPreamble().endsWith("\n")) {
                  var2.append('\n');
               }
            }
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   public boolean UuUVuuUu(uuUnNVuuVUu var1, String var2, uuUnNVuuVUu var3, String var4) {
      return this.C00OOC00oO(var1, var2, var3, var4) == null;
   }

   public String C00OOC00oO(uuUnNVuuVUu var1, String var2, uuUnNVuuVUu var3, String var4) {
      if (var1 != null && var3 != null) {
         NUuvnUuVU var5 = var1.C00OOC00oO(var2);
         if (var5 == null) {
            return var1.UuUVuuUu() + " has no output slot '" + var2 + "'";
         } else {
            NUuvnUuVU var6 = var3.UuUVuuUu(var4);
            if (var6 == null) {
               return var3.UuUVuuUu() + " has no input slot '" + var4 + "'";
            } else {
               unNvUUUUNVn.VUnuUnnuNvVu var7 = unNvUUUUNVn.VUnuUnnuNvVu.UuUVuuUu(var5.type());
               unNvUUUUNVn.VUnuUnnuNvVu var8 = unNvUUUUNVn.VUnuUnnuNvVu.UuUVuuUu(var6.type());
               return var5.type() != var6.type() ? "type mismatch: " + var7.UuUVuuUu() + " -> " + var8.UuUVuuUu() : null;
            }
         }
      } else {
         return "unknown node definition";
      }
   }

   public JSONObject UuUVuuUu(uuUnNVuuVUu var1) {
      JSONObject var2 = new JSONObject();
      if (var1 == null) {
         return var2;
      } else {
         var2.put("id", var1.UuUVuuUu());
         JSONArray var3 = new JSONArray();

         for (NUuvnUuVU var5 : var1.uNNnnnuuuN()) {
            var3.put(UuUVuuUu(var5));
         }

         JSONArray var7 = new JSONArray();

         for (NUuvnUuVU var6 : var1.nuUnNvnuUu()) {
            var7.put(UuUVuuUu(var6));
         }

         var2.put("inputs", var3);
         var2.put("outputs", var7);
         return var2;
      }
   }

   public JSONArray UuUVuuUu(nuVVnvn var1, nvvuUNnNvN var2) {
      JSONArray var3 = new JSONArray();
      if (var1 != null && var2 != null) {
         for (nNuNNVuNUu var5 : var1.vVvUvVVuuNvV()) {
            VUnvuNuVUUn var6 = var1.uUnuvNvvNU(var5.UuUVuuUu());
            VUnvuNuVUUn var7 = var1.uUnuvNvvNU(var5.uUnuvNvvNU());
            if (var6 != null && var7 != null) {
               uuUnNVuuVUu var8 = var2.UuUVuuUu(var6.C00OOC00oO());
               uuUnNVuuVUu var9 = var2.UuUVuuUu(var7.C00OOC00oO());
               if (this.UuUVuuUu(var8, var5.C00OOC00oO(), var9, var5.vVvUvVVuuNvV())) {
                  JSONObject var10 = new JSONObject();
                  var10.put("from", var5.UuUVuuUu());
                  var10.put("fromSlot", var5.C00OOC00oO());
                  var10.put("to", var5.uUnuvNvvNU());
                  var10.put("toSlot", var5.vVvUvVVuuNvV());
                  var10.put("type", var8.C00OOC00oO(var5.C00OOC00oO()).type().UuUVuuUu());
                  var3.put(var10);
               }
            }
         }

         return var3;
      } else {
         return var3;
      }
   }

   public int UuUVuuUu(nuVVnvn var1, JSONArray var2, nvvuUNnNvN var3) {
      if (var1 != null && var2 != null && var3 != null) {
         int var4 = 0;

         for (int var5 = 0; var5 < var2.length(); var5++) {
            JSONObject var6 = var2.optJSONObject(var5);
            if (var6 != null) {
               String var7 = var6.optString("from", "");
               String var8 = var6.optString("fromSlot", "");
               String var9 = var6.optString("to", "");
               String var10 = var6.optString("toSlot", "");
               VUnvuNuVUUn var11 = var1.uUnuvNvvNU(var7);
               VUnvuNuVUUn var12 = var1.uUnuvNvvNU(var9);
               if (var11 != null && var12 != null) {
                  uuUnNVuuVUu var13 = var3.UuUVuuUu(var11.C00OOC00oO());
                  uuUnNVuuVUu var14 = var3.UuUVuuUu(var12.C00OOC00oO());
                  if (this.UuUVuuUu(var13, var8, var14, var10)) {
                     String var15 = var6.optString("type", "");
                     if ((var15.isBlank() || var15.equals(var13.C00OOC00oO(var8).type().UuUVuuUu())) && var1.UuUVuuUu(var7, var8, var9, var10, var3)) {
                        var4++;
                     }
                  }
               }
            }
         }

         return var4;
      } else {
         return 0;
      }
   }

   public synchronized void UuUVuuUu(String var1, float var2, float var3, float var4, float var5) {
      if (var1 != null && !var1.isBlank()) {
         this.vNUvnnVnUvu.put(var1, new float[]{var2, var3, var4, var5});
      }
   }

   public synchronized void UuUVuuUu(String var1, int var2) {
      if (var1 != null && !var1.isBlank()) {
         if (var2 <= 0) {
            this.uVUuuVnNVU.remove(var1);
         } else {
            this.uVUuuVnNVU.put(var1, var2);
         }
      }
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4) {
      this.UuUVuuUu("uRadii", Math.max(0.0F, var1), Math.max(0.0F, var2), Math.max(0.0F, var3), Math.max(0.0F, var4));
   }

   public synchronized void UuUVuuUu(vVvUNNUVVnNn var1, VnuVUNUv var2) {
      if (var1 != null) {
         VnuVUNUv var3 = var2 == null ? VnuVUNUv.PREVIEW_ONLY : var2.vVvUvVVuuNvV();

         for (unNvUUUUNVn.uunvUUVnuNn var5 : this.VVuuUN.values()) {
            if (var5.target().vVvUvVVuuNvV() == var3) {
               for (unNvUUUUNVn.VUUnVnVNNU var7 : var5.uniforms()) {
                  int var8 = var1.UuUVuuUu(var7.name());
                  if (var8 >= 0) {
                     float[] var9 = this.vNUvnnVnUvu.getOrDefault(var7.name(), var7.defaults());
                     switch (var7.kind()) {
                        case SAMPLER2D:
                           GL13.glActiveTexture(33984 + var7.textureUnit());
                           GL11.glBindTexture(3553, this.uUnuvNvvNU(var7.name()));
                           GL20.glUniform1i(var8, var7.textureUnit());
                           break;
                        case VEC4:
                           GL20.glUniform4f(var8, var9[0], var9[1], var9[2], var9[3]);
                           break;
                        case VEC2:
                           GL20.glUniform2f(var8, var9[0], var9[1]);
                           break;
                        case FLOAT:
                           GL20.glUniform1f(var8, var9[0]);
                           break;
                        case INT:
                           GL20.glUniform1i(var8, Math.round(var9[0]));
                     }
                  }
               }
            }
         }

         GL13.glActiveTexture(33984);
      }
   }

   private int uUnuvNvvNU(String var1) {
      Integer var2 = this.uVUuuVnNVU.get(var1);
      if (var2 != null && var2 > 0) {
         return var2;
      } else if ("uMask".equals(var1)) {
         int var4 = this.nvUVNnuu.vVvUvVVuuNvV();
         return var4 > 0 ? var4 : uVvVnUU.UuUVuuUu().uNNnnnuuuN();
      } else if ("uDepth".equals(var1)) {
         int var3 = this.nvUVNnuu.uNNnnnuuuN();
         return var3 > 0 ? var3 : uVvVnUU.UuUVuuUu().uNNnnnuuuN();
      } else {
         return uVvVnUU.UuUVuuUu().uNNnnnuuuN();
      }
   }

   public boolean UuUVuuUu(
      String var1,
      NNnUUVVnuUV var2,
      Map<String, float[]> var3,
      float var4,
      float var5,
      float var6,
      float var7,
      int var8,
      int var9,
      float var10,
      float var11,
      NUunUunuNV var12,
      float var13
   ) {
      int var14 = this.nvUVNnuu.vVvUvVVuuNvV();
      return var14 <= 0
         ? false
         : this.UuUVuuUu(var1, var2, var3, VnuVUNUv.ESP, var14, var4, var5, var6, var7, var4, var5, var6, var7, 0.0F, var8, var9, var10, var11, var12, var13);
   }

   public boolean UuUVuuUu(
      String var1,
      NNnUUVVnuUV var2,
      Map<String, float[]> var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      int var12,
      int var13,
      float var14,
      float var15,
      NUunUunuNV var16,
      float var17
   ) {
      this.UuUVuuUu(var8, var9, var10, var11);
      float var18 = Math.max(Math.max(var8, var9), Math.max(var10, var11));
      return this.UuUVuuUu(
         var1,
         var2,
         var3,
         VnuVUNUv.HUD,
         uVvVnUU.UuUVuuUu().uNNnnnuuuN(),
         var4,
         var5,
         var6,
         var7,
         var4,
         var5,
         var6,
         var7,
         var18,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17
      );
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean UuUVuuUu(
      String var1,
      NNnUUVVnuUV var2,
      Map<String, float[]> var3,
      VnuVUNUv var4,
      int var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      int var15,
      int var16,
      float var17,
      float var18,
      NUunUunuNV var19,
      float var20
   ) {
      if (var2 != null && var2.ok() && var15 > 0 && var16 > 0 && !(var8 <= 0.0F) && !(var9 <= 0.0F) && !(var20 <= 0.001F)) {
         vVvUNNUVVnNn var21 = uVvVnUU.UuUVuuUu().UuUVuuUu(var1, var2);
         nnUnNnuvvN var22 = uVvVnUU.UuUVuuUu().C00OOC00oO();
         if (var21 != null && var22 != null) {
            VvuuVNVUn.NVnVnNnN var23 = VvuuVNVUn.UuUVuuUu();
            boolean var31 = false /* VF: Semaphore variable */;

            boolean var28;
            try {
               var31 = true;
               GL11.glViewport(0, 0, var15, var16);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL11.glDepthMask(false);
               GlStateManager._enableBlend();
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
               GL11.glDisable(36281);
               var21.UuUVuuUu();
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, var5 > 0 ? var5 : uVvVnUU.UuUVuuUu().uNNnnnuuuN());
               UuUVuuUu(var21, "u_DiffuseMap", 0);
               UuUVuuUu(var21, "uViewport", var15, var16);
               UuUVuuUu(var21, "uRect", var6, var7, var8, var9);
               UuUVuuUu(var21, "u_ElementRect", var10, var11, var12, var13);
               UuUVuuUu(var21, "u_ElementRadius", Math.max(0.0F, var14));
               UuUVuuUu(var21, "u_GlobalUV", var10 / Math.max(1.0F, (float)var15), var11 / Math.max(1.0F, (float)var16));
               UuUVuuUu(var21, "u_Resolution", Math.max(1.0F, (float)var15), Math.max(1.0F, (float)var16));
               UuUVuuUu(var21, "u_Time", uVvVnUU.UuUVuuUu().uUnuvNvvNU());
               UuUVuuUu(var21, "u_Mouse", var17 - var10, var18 - var11);
               int var24 = var19 == null ? -1 : var19.uVunuUNVVUUV();
               int var25 = var19 == null ? -16777216 : var19.UNnVVNvvnVvU();
               int var26 = var19 == null ? -15724520 : var19.nuUnNvnuUu();
               int var27 = var19 == null ? -14671832 : var19.VVuuUN();
               UuUVuuUu(var21, "u_AccentTop", UuUVuuUu(var24, 16), UuUVuuUu(var24, 8), UuUVuuUu(var24, 0));
               UuUVuuUu(var21, "u_AccentBottom", UuUVuuUu(var25, 16), UuUVuuUu(var25, 8), UuUVuuUu(var25, 0));
               UuUVuuUu(var21, "u_ThemeColors[0]", UuUVuuUu(var26, 16), UuUVuuUu(var26, 8), UuUVuuUu(var26, 0), UuUVuuUu(var26, 24));
               UuUVuuUu(var21, "u_ThemeColors[1]", UuUVuuUu(var27, 16), UuUVuuUu(var27, 8), UuUVuuUu(var27, 0), UuUVuuUu(var27, 24));
               UuUVuuUu(var21, "u_ThemeColors[2]", UuUVuuUu(var24, 16), UuUVuuUu(var24, 8), UuUVuuUu(var24, 0), var20);
               UuUVuuUu(var21, "u_ThemeColors[3]", UuUVuuUu(var25, 16), UuUVuuUu(var25, 8), UuUVuuUu(var25, 0), var20);
               UuUVuuUu(var21, "u_Alpha", var20);
               UuUVuuUu(var21, var2, var3);
               this.UuUVuuUu(var21, var4);
               var22.UuUVuuUu();
               var28 = true;
               var31 = false;
            } finally {
               if (var31) {
                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, 0);
                  VvuuVNVUn.uUnuvNvvNU(var23);
               }
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            VvuuVNVUn.uUnuvNvvNU(var23);
            return var28;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public synchronized int UuUVuuUu(
      oo0OOO00o0O var1, nvvuUNnNvN var2, nuVVnvn var3, String var4, float var5, float var6, NUunUunuNV var7, float var8, float var9
   ) {
      if (var1 != null && var2 != null && var3 != null && var4 != null && !(var5 <= 2.0F) && !(var6 <= 2.0F)) {
         VUnvuNuVUUn var10 = var3.uUnuvNvvNU(var4);
         uuUnNVuuVUu var11 = var10 == null ? null : var2.UuUVuuUu(var10.C00OOC00oO());
         NUuvnUuVU var12 = C00OOC00oO(var11);
         if (var12 == null) {
            return 0;
         } else {
            unNvUUUUNVn.nvnNNunvv var13 = this.vuuuNvNuv.computeIfAbsent(var4, var0 -> new unNvUUUUNVn.nvnNNunvv());
            int var14 = var3.uNNnnnuuuN();
            if (var13.C00OOC00oO == null || var13.uNNnnnuuuN != var14 || !var12.id().equals(var13.uUnuvNvvNU)) {
               nuVVnvn var15 = var3.uNNnnnuuuN(var4);
               var15.UuUVuuUu(VnuVUNUv.PREVIEW_ONLY.UuUVuuUu());
               var13.C00OOC00oO = var1.UuUVuuUu(var15, var4, var12.id(), var12.type());
               var13.uNNnnnuuuN = var14;
               var13.uUnuvNvvNU = var12.id();
               var13.vNUvnnVnUvu = 0L;
               String var16 = var13.C00OOC00oO == null ? "" : "__template_preview_" + var13.C00OOC00oO.hash();
               if (!var13.vVvUvVVuuNvV.isEmpty() && !var13.vVvUvVVuuNvV.equals(var16)) {
                  uVvVnUU.UuUVuuUu().uUnuvNvvNU(var13.vVvUvVVuuNvV);
               }

               var13.vVvUvVVuuNvV = var16;
            }

            if (var13.C00OOC00oO != null && var13.C00OOC00oO.ok()) {
               long var24;
               var24 = System.currentTimeMillis();
               int var17 = Math.max(32, Math.min(512, (int)Math.ceil(var5)));
               int var18 = Math.max(32, Math.min(384, (int)Math.ceil(var6)));
               label112:
               if (var24 - var13.vNUvnnVnUvu >= 33L || var13.nuUnNvnuUu != var17 || var13.VVuuUN != var18) {
                  VvuuVNVUn.NVnVnNnN var19 = VvuuVNVUn.UuUVuuUu();

                  byte var20;
                  try {
                     var13.UuUVuuUu.UuUVuuUu(var17, var18);
                     if (var13.UuUVuuUu.nuUnNvnuUu()) {
                        var13.UuUVuuUu.UuUVuuUu();
                        GL11.glDisable(3089);
                        GlStateManager._enableBlend();
                        GL11.glEnable(3042);
                        GL11.glClearColor(0.008F, 0.01F, 0.015F, 0.0F);
                        GL11.glClear(16384);
                        uVNnuvnVvvu.UuUVuuUu(var13.vVvUvVVuuNvV, var13.C00OOC00oO, 0.0F, 0.0F, var17, var18, var17, var18, var8, var9, var7, 1.0F);
                        var13.vNUvnnVnUvu = var24;
                        var13.nuUnNvnuUu = var17;
                        var13.VVuuUN = var18;
                        break label112;
                     }

                     var20 = 0;
                  } finally {
                     VvuuVNVUn.uUnuvNvvNU(var19);
                  }

                  return var20;
               }

               var13.uVUuuVnNVU = var24;
               this.VVuuUN();
               return var13.UuUVuuUu.uUnuvNvvNU();
            } else {
               return 0;
            }
         }
      } else {
         return 0;
      }
   }

   public synchronized void C00OOC00oO(String var1) {
      unNvUUUUNVn.nvnNNunvv var2 = this.vuuuNvNuv.remove(var1);
      if (var2 != null) {
         UuUVuuUu(var2);
      }
   }

   public synchronized void uNNnnnuuuN() {
      for (unNvUUUUNVn.nvnNNunvv var2 : this.vuuuNvNuv.values()) {
         UuUVuuUu(var2);
      }

      this.vuuuNvNuv.clear();
   }

   public synchronized void nuUnNvnuUu() {
      this.uNNnnnuuuN();
      this.nvUVNnuu.close();
      this.UuuNnUvUuv.close();
   }

   private void VVuuUN() {
      while (this.vuuuNvNuv.size() > 48) {
         Entry var1 = this.vuuuNvNuv.entrySet().iterator().next();
         UuUVuuUu((unNvUUUUNVn.nvnNNunvv)var1.getValue());
         this.vuuuNvNuv.remove(var1.getKey());
      }
   }

   private static void UuUVuuUu(unNvUUUUNVn.nvnNNunvv var0) {
      var0.UuUVuuUu.close();
      if (!var0.vVvUvVVuuNvV.isEmpty()) {
         uVvVnUU.UuUVuuUu().uUnuvNvvNU(var0.vVvUvVVuuNvV);
         var0.vVvUvVVuuNvV = "";
      }
   }

   private static NUuvnUuVU C00OOC00oO(uuUnNVuuVUu var0) {
      if (var0 != null && !var0.nuUnNvnuUu().isEmpty()) {
         for (NUuvnUuVU var2 : var0.nuUnNvnuUu()) {
            if ("color".equals(var2.id()) || "mask".equals(var2.id()) || "value".equals(var2.id())) {
               return var2;
            }
         }

         return var0.nuUnNvnuUu().get(0);
      } else {
         return null;
      }
   }

   private static JSONObject UuUVuuUu(NUuvnUuVU var0) {
      JSONObject var1 = new JSONObject();
      var1.put("id", var0.id());
      var1.put("label", var0.label());
      var1.put("type", var0.type().UuUVuuUu());
      var1.put("direction", var0.direction().name().toLowerCase(Locale.ROOT));
      return var1;
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, NNnUUVVnuUV var1, Map<String, float[]> var2) {
      if (var1 != null && !var1.exposedUniforms().isEmpty()) {
         for (ccCoCoOCocoo var4 : var1.exposedUniforms()) {
            float[] var5 = var2 == null ? null : (float[])var2.get(var4.uniformName());
            if (var5 == null) {
               var5 = var4.defaults();
            }

            if (var4.kind() == ccCoCoOCocoo.NVnVnNnN.FLOAT) {
               UuUVuuUu(var0, var4.uniformName(), var5[0]);
            } else {
               UuUVuuUu(var0, var4.uniformName(), var5[0], var5[1], var5[2], var5[3]);
            }
         }
      }
   }

   private void vNUvnnVnUvu() {
      this.UuUVuuUu(
         new unNvUUUUNVn.uunvUUVnuNn(
            "template_esp_dual_pass",
            "ESP Dual-Pass Source",
            "isolated entity mask and scene depth samplers",
            "Template",
            VnuVUNUv.ESP,
            216.0F,
            List.of(),
            List.of(
               unNvUUUUNVn.nvUnvV.output("mask", "mask", unNvUUUUNVn.VUnuUnnuNvVu.FLOAT),
               unNvUUUUNVn.nvUnvV.output("depth", "depth", unNvUUUUNVn.VUnuUnnuNvVu.FLOAT),
               unNvUUUUNVn.nvUnvV.output("uv", "uv", unNvUUUUNVn.VUnuUnnuNvVu.VEC2)
            ),
            "uniform sampler2D uMask;\nuniform sampler2D uDepth;\n\nfloat wild_template_mask(vec2 uv) {\n    return step(0.001, texture(uMask, uv).a);\n}\n\nfloat wild_template_depth(vec2 uv) {\n    float d = texture(uDepth, uv).r;\n    float ndc = d * 2.0 - 1.0;\n    float near = 0.05;\n    float far = 1024.0;\n    return clamp((2.0 * near) / (far + near - ndc * (far - near)), 0.0, 1.0);\n}\n",
            List.of(unNvUUUUNVn.VUUnVnVNNU.sampler("uMask", 6), unNvUUUUNVn.VUUnVnVNNU.sampler("uDepth", 7)),
            (var0, var1, var2) -> {
               boolean var3 = var0.UuUVuuUu() == VnuVUNUv.ESP;

               return switch (var2) {
                  case "mask" -> var3 ? "wild_template_mask(wild_diffuse_uv())" : "step(0.001, texture(u_DiffuseMap, wild_diffuse_uv()).a)";
                  case "depth" -> var3 ? "wild_template_depth(wild_diffuse_uv())" : "clamp(1.0 - texture(u_DiffuseMap, wild_diffuse_uv()).a, 0.0, 1.0)";
                  default -> "wild_diffuse_uv()";
               };
            }
         )
      );
      this.UuUVuuUu(
         new unNvUUUUNVn.uunvUUVnuNn(
            "template_hud_roundrect",
            "SDF RoundRect Plate",
            "per-corner rounded plate driven by uRect and uRadii",
            "Template",
            VnuVUNUv.HUD,
            224.0F,
            List.of(
               unNvUUUUNVn.nvUnvV.input("color", "color", unNvUUUUNVn.VUnuUnnuNvVu.VEC4, "u_ThemeColors[0]"),
               unNvUUUUNVn.nvUnvV.input("softness", "soft", unNvUUUUNVn.VUnuUnnuNvVu.FLOAT, "1.0")
            ),
            List.of(
               unNvUUUUNVn.nvUnvV.output("color", "color", unNvUUUUNVn.VUnuUnnuNvVu.VEC4),
               unNvUUUUNVn.nvUnvV.output("mask", "distance", unNvUUUUNVn.VUnuUnnuNvVu.FLOAT)
            ),
            "uniform vec4 uRadii;\n\nfloat wild_template_corner_pick(vec2 p, vec4 radii) {\n    float top = mix(radii.x, radii.y, step(0.0, p.x));\n    float bottom = mix(radii.w, radii.z, step(0.0, p.x));\n    return mix(top, bottom, step(0.0, p.y));\n}\n\nfloat wild_template_roundrect_distance() {\n    vec2 screenPx = vec2(gl_FragCoord.x, u_Resolution.y - gl_FragCoord.y);\n    vec2 p = screenPx - u_ElementRect.xy - u_ElementRect.zw * 0.5;\n    vec2 halfSize = max(u_ElementRect.zw * 0.5, vec2(0.5));\n    float radiiSum = uRadii.x + uRadii.y + uRadii.z + uRadii.w;\n    vec4 radii = mix(vec4(u_ElementRadius), uRadii, step(0.001, radiiSum));\n    float r = clamp(wild_template_corner_pick(p, radii), 0.0, min(halfSize.x, halfSize.y));\n    vec2 q = abs(p) - halfSize + vec2(r);\n    return length(max(q, vec2(0.0))) - r + min(max(q.x, q.y), 0.0);\n}\n\nfloat wild_template_roundrect_alpha(float d, float softness) {\n    float aa = max(fwidth(d), max(softness, 0.0001));\n    return 1.0 - smoothstep(0.0, aa, d);\n}\n",
            List.of(unNvUUUUNVn.VUUnVnVNNU.vec4("uRadii", 0.0F, 0.0F, 0.0F, 0.0F)),
            (var0, var1, var2) -> {
               if (var0.C00OOC00oO()) {
                  return "mask".equals(var2)
                     ? "wild_template_roundrect_distance()"
                     : "vec4(("
                        + var0.UuUVuuUu(var1, "color")
                        + ").rgb, ("
                        + var0.UuUVuuUu(var1, "color")
                        + ").a * wild_template_roundrect_alpha(wild_template_roundrect_distance(), "
                        + var0.UuUVuuUu(var1, "softness")
                        + "))";
               } else {
                  String var3 = "wild_sdf_round_box(uv, vec2(0.0), vec2(0.42, 0.30), 0.08, 0.0)";
                  return "mask".equals(var2)
                     ? var3
                     : "vec4((" + var0.UuUVuuUu(var1, "color") + ").rgb, (" + var0.UuUVuuUu(var1, "color") + ").a * wild_sdf_alpha(" + var3 + "))";
               }
            }
         )
      );
   }

   private static void C00OOC00oO(nvvuUNnNvN var0) {
      if (var0.UuUVuuUu("int_value") == null) {
         var0.UuUVuuUu(
            new uuUnNVuuVUu(
               "int_value",
               "Integer",
               "Constants",
               154.0F,
               List.of(),
               List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.INT)),
               (var0x, var1, var2) -> String.valueOf(Math.round(var1.UuUVuuUu("value", 1.0F)))
            )
         );
      }

      if (var0.UuUVuuUu("int_to_float") == null) {
         var0.UuUVuuUu(
            new uuUnNVuuVUu(
               "int_to_float",
               "Int → Float",
               "Math",
               174.0F,
               List.of(NUuvnUuVU.input("i", "i", nnNVVnNnnV.INT, "0")),
               List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.FLOAT)),
               (var0x, var1, var2) -> "float(" + var0x.UuUVuuUu(var1, "i") + ")"
            )
         );
      }

      if (var0.UuUVuuUu("float_to_int") == null) {
         var0.UuUVuuUu(
            new uuUnNVuuVUu(
               "float_to_int",
               "Float → Int",
               "Math",
               174.0F,
               List.of(NUuvnUuVU.input("x", "x", nnNVVnNnnV.FLOAT, "0.0")),
               List.of(NUuvnUuVU.output("value", "value", nnNVVnNnnV.INT)),
               (var0x, var1, var2) -> "int(floor((" + var0x.UuUVuuUu(var1, "x") + ") + 0.5))"
            )
         );
      }
   }

   static float UuUVuuUu(int var0, int var1) {
      return (var0 >>> var1 & 0xFF) / 255.0F;
   }

   static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, float var2) {
      int var3 = var0.UuUVuuUu(var1);
      if (var3 >= 0) {
         GL20.glUniform1f(var3, var2);
      }
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, int var2) {
      int var3 = var0.UuUVuuUu(var1);
      if (var3 >= 0) {
         GL20.glUniform1i(var3, var2);
      }
   }

   static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, float var2, float var3) {
      int var4 = var0.UuUVuuUu(var1);
      if (var4 >= 0) {
         GL20.glUniform2f(var4, var2, var3);
      }
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, float var2, float var3, float var4) {
      int var5 = var0.UuUVuuUu(var1);
      if (var5 >= 0) {
         GL20.glUniform3f(var5, var2, var3, var4);
      }
   }

   static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, float var2, float var3, float var4, float var5) {
      int var6 = var0.UuUVuuUu(var1);
      if (var6 >= 0) {
         GL20.glUniform4f(var6, var2, var3, var4, var5);
      }
   }

   public static final class NVnVnNnN implements AutoCloseable {
      private static final String UuUVuuUu = "foundry_template_esp";
      private final UNVUNunnvnNU C00OOC00oO = new UNVUNunnvnNU();
      private VvuuVNVUn.NVnVnNnN uUnuvNvvNU;
      private boolean vVvUvVVuuNvV;

      public void UuUVuuUu(Predicate<class_1297> var1) {
         nuVUnVnVvV.UuUVuuUu().UuUVuuUu("foundry_template_esp", true, var1);
         this.vVvUvVVuuNvV = true;
      }

      public void UuUVuuUu() {
         nuVUnVnVvV.UuUVuuUu().UuUVuuUu("foundry_template_esp");
         this.vVvUvVVuuNvV = false;
      }

      public boolean C00OOC00oO() {
         return this.vVvUvVVuuNvV;
      }

      public boolean uUnuvNvvNU() {
         return nuVUnVnVvV.UuUVuuUu().uUnuvNvvNU();
      }

      public int vVvUvVVuuNvV() {
         nuVUnVnVvV var1 = nuVUnVnVvV.UuUVuuUu();
         return var1.uUnuvNvvNU() && var1.vVvUvVVuuNvV() > 0 ? var1.vVvUvVVuuNvV() : this.C00OOC00oO.C00OOC00oO;
      }

      public int uNNnnnuuuN() {
         nuVUnVnVvV var1 = nuVUnVnVvV.UuUVuuUu();
         return var1.uUnuvNvvNU() && var1.uNNnnnuuuN() > 0 ? var1.uNNnnnuuuN() : this.C00OOC00oO.uUnuvNvvNU;
      }

      public int nuUnNvnuUu() {
         nuVUnVnVvV var1 = nuVUnVnVvV.UuUVuuUu();
         return var1.uUnuvNvvNU() && var1.UvnvNVnnnnNU() > 0 ? var1.UvnvNVnnnnNU() : this.C00OOC00oO.vVvUvVVuuNvV;
      }

      public int VVuuUN() {
         nuVUnVnVvV var1 = nuVUnVnVvV.UuUVuuUu();
         return var1.uUnuvNvvNU() && var1.uVUVnuvnuVuv() > 0 ? var1.uVUVnuvnuVuv() : this.C00OOC00oO.uNNnnnuuuN;
      }

      public boolean UuUVuuUu(int var1, int var2) {
         if (var1 > 0 && var2 > 0 && this.uUnuvNvvNU == null) {
            try {
               this.C00OOC00oO.UuUVuuUu(var1, var2);
            } catch (IllegalStateException var4) {
               return false;
            }

            this.uUnuvNvvNU = VvuuVNVUn.UuUVuuUu();
            GL30.glBindFramebuffer(36008, VvuuVNVUn.UuUVuuUu(this.uUnuvNvvNU.UuUVuuUu));
            GL30.glBindFramebuffer(36009, this.C00OOC00oO.UuUVuuUu);
            GL30.glBlitFramebuffer(0, 0, var1, var2, 0, 0, var1, var2, 256, 9728);
            GL30.glBindFramebuffer(36160, this.C00OOC00oO.UuUVuuUu);
            GL11.glViewport(0, 0, var1, var2);
            GL11.glDisable(3089);
            GL30.glClearBufferfv(6144, 0, unNvUUUUNVn.C00OOC00oO);
            GL11.glEnable(2929);
            GL11.glDepthMask(false);
            return true;
         } else {
            return false;
         }
      }

      public void vNUvnnVnUvu() {
         if (this.uUnuvNvvNU != null) {
            VvuuVNVUn.uUnuvNvvNU(this.uUnuvNvvNU);
            this.uUnuvNvvNU = null;
         }
      }

      @Override
      public void close() {
         if (this.vVvUvVVuuNvV) {
            this.UuUVuuUu();
         }

         this.vNUvnnVnUvu();
         this.C00OOC00oO.UuUVuuUu();
      }
   }

   public record VUUnVnVNNU(String name, unNvUUUUNVn.VUUnVnVNNU.NVnVnNnN kind, int textureUnit, float[] defaults) {
      public VUUnVnVNNU(String name, unNvUUUUNVn.VUUnVnVNNU.NVnVnNnN kind, int textureUnit, float[] defaults) {
         if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("uniform name required");
         } else if (kind == null) {
            throw new IllegalArgumentException("uniform kind required for " + name);
         } else {
            defaults = defaults == null ? new float[4] : Arrays.copyOf(defaults, 4);
            this.name = name;
            this.kind = kind;
            this.textureUnit = textureUnit;
            this.defaults = defaults;
         }
      }

      public static unNvUUUUNVn.VUUnVnVNNU sampler(String var0, int var1) {
         return new unNvUUUUNVn.VUUnVnVNNU(var0, unNvUUUUNVn.VUUnVnVNNU.NVnVnNnN.SAMPLER2D, var1, null);
      }

      public static unNvUUUUNVn.VUUnVnVNNU vec4(String var0, float var1, float var2, float var3, float var4) {
         return new unNvUUUUNVn.VUUnVnVNNU(var0, unNvUUUUNVn.VUUnVnVNNU.NVnVnNnN.VEC4, -1, new float[]{var1, var2, var3, var4});
      }

      public static unNvUUUUNVn.VUUnVnVNNU vec2(String var0, float var1, float var2) {
         return new unNvUUUUNVn.VUUnVnVNNU(var0, unNvUUUUNVn.VUUnVnVNNU.NVnVnNnN.VEC2, -1, new float[]{var1, var2, 0.0F, 0.0F});
      }

      public static unNvUUUUNVn.VUUnVnVNNU scalar(String var0, float var1) {
         return new unNvUUUUNVn.VUUnVnVNNU(var0, unNvUUUUNVn.VUUnVnVNNU.NVnVnNnN.FLOAT, -1, new float[]{var1, 0.0F, 0.0F, 0.0F});
      }

      public static unNvUUUUNVn.VUUnVnVNNU integer(String var0, int var1) {
         return new unNvUUUUNVn.VUUnVnVNNU(var0, unNvUUUUNVn.VUUnVnVNNU.NVnVnNnN.INT, -1, new float[]{var1, 0.0F, 0.0F, 0.0F});
      }

      public static enum NVnVnNnN {
         SAMPLER2D,
         VEC4,
         VEC2,
         FLOAT,
         INT;
      }
   }

   public static enum VUnuUnnuNvVu {
      VEC4("vec4", 4, NUunUunuNV.UuUVuuUu(255, 61, 158, 255)),
      VEC2("vec2", 2, NUunUunuNV.UuUVuuUu(177, 140, 255, 255)),
      FLOAT("float", 1, NUunUunuNV.UuUVuuUu(53, 228, 255, 255)),
      INT("int", 1, NUunUunuNV.UuUVuuUu(155, 255, 61, 255));

      private final String UuUVuuUu;
      private final int C00OOC00oO;
      private final int uUnuvNvvNU;

      private VUnuUnnuNvVu(String var3, int var4, int var5) {
         this.UuUVuuUu = var3;
         this.C00OOC00oO = var4;
         this.uUnuvNvvNU = var5;
      }

      public String UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public int C00OOC00oO() {
         return this.C00OOC00oO;
      }

      public int uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      public boolean UuUVuuUu(unNvUUUUNVn.VUnuUnnuNvVu var1) {
         return this == var1;
      }

      public nnNVVnNnnV vVvUvVVuuNvV() {
         return switch (this) {
            case VEC4 -> nnNVVnNnnV.VEC4;
            case VEC2 -> nnNVVnNnnV.VEC2;
            case FLOAT -> nnNVVnNnnV.FLOAT;
            case INT -> nnNVVnNnnV.INT;
         };
      }

      public static unNvUUUUNVn.VUnuUnnuNvVu UuUVuuUu(nnNVVnNnnV var0) {
         if (var0 == null) {
            return FLOAT;
         } else {
            return switch (var0) {
               case VEC4 -> VEC4;
               case VEC3 -> VEC4;
               case VEC2 -> VEC2;
               case FLOAT -> FLOAT;
               case INT -> INT;
            };
         }
      }

      public static int C00OOC00oO(nnNVVnNnnV var0) {
         if (var0 == null) {
            return FLOAT.uUnuvNvvNU;
         } else {
            return switch (var0) {
               case VEC4 -> VEC4.uUnuvNvvNU;
               case VEC3 -> NUunUunuNV.UuUVuuUu(250, 176, 96, 255);
               case VEC2 -> VEC2.uUnuvNvvNU;
               case FLOAT -> FLOAT.uUnuvNvvNU;
               case INT -> INT.uUnuvNvvNU;
            };
         }
      }
   }

   public static final class VvunVVUvUNnv implements AutoCloseable {
      private vVvUNNUVVnNn UuUVuuUu;
      private boolean C00OOC00oO;

      public boolean UuUVuuUu(
         float var1,
         float var2,
         float var3,
         float var4,
         float var5,
         float var6,
         float var7,
         float var8,
         int var9,
         int var10,
         float var11,
         float var12,
         int var13,
         int var14,
         float var15
      ) {
         if (!this.C00OOC00oO && !(var3 <= 0.0F) && !(var4 <= 0.0F) && var13 > 0 && var14 > 0 && !(var15 <= 0.001F)) {
            vVvUNNUVVnNn var16 = this.UuUVuuUu();
            nnUnNnuvvN var17 = uVvVnUU.UuUVuuUu().C00OOC00oO();
            if (var16 != null && var17 != null) {
               VvuuVNVUn.NVnVnNnN var18 = VvuuVNVUn.UuUVuuUu();

               boolean var19;
               try {
                  GL11.glViewport(0, 0, var13, var14);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDepthMask(false);
                  GlStateManager._enableBlend();
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  var16.UuUVuuUu();
                  unNvUUUUNVn.UuUVuuUu(var16, "uViewport", var13, var14);
                  unNvUUUUNVn.UuUVuuUu(var16, "uRect", var1, var2, var3, var4);
                  unNvUUUUNVn.UuUVuuUu(var16, "uRadii", Math.max(0.0F, var5), Math.max(0.0F, var6), Math.max(0.0F, var7), Math.max(0.0F, var8));
                  unNvUUUUNVn.UuUVuuUu(
                     var16,
                     "uTint",
                     unNvUUUUNVn.UuUVuuUu(var9, 16),
                     unNvUUUUNVn.UuUVuuUu(var9, 8),
                     unNvUUUUNVn.UuUVuuUu(var9, 0),
                     unNvUUUUNVn.UuUVuuUu(var9, 24)
                  );
                  unNvUUUUNVn.UuUVuuUu(
                     var16,
                     "uStrokeTint",
                     unNvUUUUNVn.UuUVuuUu(var10, 16),
                     unNvUUUUNVn.UuUVuuUu(var10, 8),
                     unNvUUUUNVn.UuUVuuUu(var10, 0),
                     unNvUUUUNVn.UuUVuuUu(var10, 24)
                  );
                  unNvUUUUNVn.UuUVuuUu(var16, "uStrokeWidth", Math.max(0.0F, var11));
                  unNvUUUUNVn.UuUVuuUu(var16, "uSoftness", Math.max(0.0F, var12));
                  unNvUUUUNVn.UuUVuuUu(var16, "uAlpha", var15);
                  var17.UuUVuuUu();
                  var19 = true;
               } finally {
                  VvuuVNVUn.uUnuvNvvNU(var18);
               }

               return var19;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }

      private vVvUNNUVVnNn UuUVuuUu() {
         if (this.UuUVuuUu != null) {
            return this.UuUVuuUu;
         } else {
            try {
               this.UuUVuuUu = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/foundry/roundrect.vert", "assets/wild/shaders/foundry/roundrect.frag");
               return this.UuUVuuUu;
            } catch (Throwable var2) {
               this.C00OOC00oO = true;
               return null;
            }
         }
      }

      @Override
      public void close() {
         if (this.UuUVuuUu != null) {
            this.UuUVuuUu.C00OOC00oO();
            this.UuUVuuUu = null;
         }

         this.C00OOC00oO = false;
      }
   }

   public record nvUnvV(String id, String label, unNvUUUUNVn.VUnuUnnuNvVu type, unnunUNUUnu direction, String defaultExpression) {
      public nvUnvV(String id, String label, unNvUUUUNVn.VUnuUnnuNvVu type, unnunUNUUnu direction, String defaultExpression) {
         if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("slot id required");
         } else if (type != null && direction != null) {
            label = label != null && !label.isBlank() ? label : id;
            defaultExpression = defaultExpression == null ? "" : defaultExpression;
            this.id = id;
            this.label = label;
            this.type = type;
            this.direction = direction;
            this.defaultExpression = defaultExpression;
         } else {
            throw new IllegalArgumentException("slot type and direction required for " + id);
         }
      }

      public static unNvUUUUNVn.nvUnvV input(String var0, String var1, unNvUUUUNVn.VUnuUnnuNvVu var2, String var3) {
         return new unNvUUUUNVn.nvUnvV(var0, var1, var2, unnunUNUUnu.INPUT, var3);
      }

      public static unNvUUUUNVn.nvUnvV output(String var0, String var1, unNvUUUUNVn.VUnuUnnuNvVu var2) {
         return new unNvUUUUNVn.nvUnvV(var0, var1, var2, unnunUNUUnu.OUTPUT, "");
      }

      public NUuvnUuVU toPinTemplate() {
         return new NUuvnUuVU(this.id, this.label, this.type.vVvUvVVuuNvV(), this.direction, this.defaultExpression);
      }
   }

   static final class nvnNNunvv {
      final VvNNUnNNVn UuUVuuUu = new VvNNUnNNVn();
      NNnUUVVnuUV C00OOC00oO;
      String uUnuvNvvNU = "";
      String vVvUvVVuuNvV = "";
      int uNNnnnuuuN = Integer.MIN_VALUE;
      int nuUnNvnuUu;
      int VVuuUN;
      long vNUvnnVnUvu;
      long uVUuuVnNVU;
   }

   public record uunvUUVnuNn(
      String id,
      String title,
      String description,
      String category,
      VnuVUNUv target,
      float nodeWidth,
      List<unNvUUUUNVn.nvUnvV> inputs,
      List<unNvUUUUNVn.nvUnvV> outputs,
      String glslPreamble,
      List<unNvUUUUNVn.VUUnVnVNNU> uniforms,
      VnNnvvVUN emitter
   ) {
      public uunvUUVnuNn(
         String id,
         String title,
         String description,
         String category,
         VnuVUNUv target,
         float nodeWidth,
         List<unNvUUUUNVn.nvUnvV> inputs,
         List<unNvUUUUNVn.nvUnvV> outputs,
         String glslPreamble,
         List<unNvUUUUNVn.VUUnVnVNNU> uniforms,
         VnNnvvVUN emitter
      ) {
         if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("template id required");
         } else if (target != null && emitter != null) {
            title = title != null && !title.isBlank() ? title : id;
            description = description == null ? "" : description;
            category = category != null && !category.isBlank() ? category : "Template";
            inputs = inputs == null ? List.of() : List.copyOf(inputs);
            outputs = outputs == null ? List.of() : List.copyOf(outputs);
            glslPreamble = glslPreamble == null ? "" : glslPreamble;
            uniforms = uniforms == null ? List.of() : List.copyOf(uniforms);
            this.id = id;
            this.title = title;
            this.description = description;
            this.category = category;
            this.target = target;
            this.nodeWidth = nodeWidth;
            this.inputs = inputs;
            this.outputs = outputs;
            this.glslPreamble = glslPreamble;
            this.uniforms = uniforms;
            this.emitter = emitter;
         } else {
            throw new IllegalArgumentException("template target and emitter required for " + id);
         }
      }

      public uuUnNVuuVUu toNodeDefinition() {
         ArrayList var1 = new ArrayList(this.inputs.size());

         for (unNvUUUUNVn.nvUnvV var3 : this.inputs) {
            var1.add(var3.toPinTemplate());
         }

         ArrayList var5 = new ArrayList(this.outputs.size());

         for (unNvUUUUNVn.nvUnvV var4 : this.outputs) {
            var5.add(var4.toPinTemplate());
         }

         return new uuUnNVuuVUu(this.id, this.title, this.category, this.nodeWidth, var1, var5, this.emitter);
      }
   }
}
