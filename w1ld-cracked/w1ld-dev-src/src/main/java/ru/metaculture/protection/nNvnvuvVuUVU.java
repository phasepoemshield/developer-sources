package ru.metaculture.protection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2FloatMap;
import it.unimi.dsi.fastutil.longs.Long2FloatOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Objects;
import org.lwjgl.opengl.GL11;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;

final class nNvnvuvVuUVU {
   private final String UuUVuuUu;
   private final String C00OOC00oO;
   private final Int2ObjectMap<nNvnvuvVuUVU.NVnVnNnN> uUnuvNvvNU;
   private final Long2FloatMap vVvUvVVuuNvV;
   private volatile int uNNnnnuuuN;
   private final int nuUnNvnuUu;
   private final int VVuuUN;
   private final float vNUvnnVnUvu;
   private final float uVUuuVnNVU;
   private final float vuuuNvNuv;
   private final float nvUVNnuu;
   private final float UuuNnUvUuv;
   private float nUUVuvU;

   private nNvnvuvVuUVU(
      String var1,
      String var2,
      int var3,
      int var4,
      int var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      Int2ObjectMap<nNvnvuvVuUVU.NVnVnNnN> var11,
      Long2FloatMap var12
   ) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uNNnnnuuuN = var3;
      this.nuUnNvnuUu = var4;
      this.VVuuUN = var5;
      this.vNUvnnVnUvu = var6;
      this.uVUuuVnNVU = var7;
      this.vuuuNvNuv = var8;
      this.nvUVNnuu = var9;
      this.UuuNnUvUuv = var10;
      this.uUnuvNvvNU = var11;
      this.vVvUvVVuuNvV = var12;
   }

   static nNvnvuvVuUVU UuUVuuUu(vnuUvuuNVNUU var0, String var1, String var2) {
      Objects.requireNonNull(var0, "backend");
      Objects.requireNonNull(var1, "jsonResourcePath");
      Objects.requireNonNull(var2, "textureResourcePath");
      String var3 = UvnUNnnVnu.UuUVuuUu(var1);
      JsonObject var4 = JsonParser.parseString(var3).getAsJsonObject();
      JsonObject var5 = var4.getAsJsonObject("atlas");
      if (var5 == null) {
         throw new IllegalStateException("Missing 'atlas' section in MSDF font: " + var1);
      } else {
         int var6 = var5.get("width").getAsInt();
         int var7 = var5.get("height").getAsInt();
         if (var6 > 0 && var7 > 0) {
            float var8 = var5.has("distanceRange") ? var5.get("distanceRange").getAsFloat() : 6.0F;
            JsonObject var9 = var4.getAsJsonObject("metrics");
            if (var9 == null) {
               throw new IllegalStateException("Missing 'metrics' section in MSDF font: " + var1);
            } else {
               float var10 = var9.has("emSize") ? var9.get("emSize").getAsFloat() : 1.0F;
               float var11 = var9.has("lineHeight") ? var9.get("lineHeight").getAsFloat() : var10;
               float var12 = var9.has("ascender") ? var9.get("ascender").getAsFloat() : var11;
               float var13 = var9.has("descender") ? var9.get("descender").getAsFloat() : 0.0F;
               float var14 = Math.abs(var13);
               Int2ObjectOpenHashMap var15 = new Int2ObjectOpenHashMap();
               JsonArray var16 = var4.getAsJsonArray("glyphs");
               if (var16 != null) {
                  for (JsonElement var18 : var16) {
                     JsonObject var19 = var18.getAsJsonObject();
                     int var20 = var19.get("unicode").getAsInt();
                     float var21 = var19.has("advance") ? var19.get("advance").getAsFloat() : 0.0F;
                     JsonObject var22 = var19.has("planeBounds") ? var19.getAsJsonObject("planeBounds") : null;
                     JsonObject var23 = var19.has("atlasBounds") ? var19.getAsJsonObject("atlasBounds") : null;
                     nNvnvuvVuUVU.NVnVnNnN var24;
                     if (var22 != null && var23 != null) {
                        float var25 = var22.get("left").getAsFloat();
                        float var26 = var22.get("bottom").getAsFloat();
                        float var27 = var22.get("right").getAsFloat();
                        float var28 = var22.get("top").getAsFloat();
                        float var29 = var23.get("left").getAsFloat();
                        float var30 = var23.get("bottom").getAsFloat();
                        float var31 = var23.get("right").getAsFloat();
                        float var32 = var23.get("top").getAsFloat();
                        var24 = new nNvnvuvVuUVU.NVnVnNnN(var21, var25, var26, var27, var28, var29, var30, var31, var32, var6, var7);
                     } else {
                        var24 = new nNvnvuvVuUVU.NVnVnNnN(var21);
                     }

                     var15.put(var20, var24);
                  }
               }

               Long2FloatOpenHashMap var33 = new Long2FloatOpenHashMap();
               var33.defaultReturnValue(0.0F);
               JsonArray var34 = var4.getAsJsonArray("kerning");
               if (var34 != null) {
                  for (JsonElement var37 : var34) {
                     JsonObject var38 = var37.getAsJsonObject();
                     int var39 = var38.get("unicode1").getAsInt();
                     int var40 = var38.get("unicode2").getAsInt();
                     float var41 = var38.has("advance") ? var38.get("advance").getAsFloat() : 0.0F;
                     var33.put(C00OOC00oO(var39, var40), var41);
                  }
               }

               nNvnvuvVuUVU.nvnNNunvv var36 = UuUVuuUu(var0, var2);
               return new nNvnvuvVuUVU(var1, var2, var36.textureId, var36.width, var36.height, var8, var10, var11, var12, var14, var15, var33);
            }
         } else {
            throw new IllegalStateException("Invalid MSDF atlas dimensions in font: " + var1);
         }
      }
   }

   void UuUVuuUu(vnuUvuuNVNUU var1) {
      Objects.requireNonNull(var1, "backend");
      int var2 = this.uNNnnnuuuN;

      try {
         nNvnvuvVuUVU.nvnNNunvv var3 = UuUVuuUu(var1, this.C00OOC00oO);
         if (var3.width != this.nuUnNvnuUu || var3.height != this.VVuuUN) {
            if (var3.textureId > 0) {
               GL11.glDeleteTextures(var3.textureId);
            }

            return;
         }

         this.uNNnnnuuuN = var3.textureId;
      } catch (Throwable var5) {
         return;
      }

      if (var2 > 0 && var2 != this.uNNnnnuuuN) {
         try {
            GL11.glDeleteTextures(var2);
         } catch (Throwable var4) {
         }
      }
   }

   private static nNvnvuvVuUVU.nvnNNunvv UuUVuuUu(vnuUvuuNVNUU var0, String var1) {
      ByteBuffer var2 = UvnUNnnVnu.C00OOC00oO(var1);
      MemoryStack var3 = MemoryStack.stackPush();

      nNvnvuvVuUVU.nvnNNunvv var11;
      try {
         IntBuffer var4 = var3.mallocInt(1);
         IntBuffer var5 = var3.mallocInt(1);
         IntBuffer var6 = var3.mallocInt(1);
         ByteBuffer var7 = STBImage.stbi_load_from_memory(var2, var4, var5, var6, 4);
         if (var7 == null) {
            throw new IllegalStateException("Failed to load MSDF atlas '" + var1 + "': " + STBImage.stbi_failure_reason());
         }

         try {
            int var8 = var4.get(0);
            int var9 = var5.get(0);
            int var10 = var0.UuUVuuUu(var8, var9, var7);
            var11 = new nNvnvuvVuUVU.nvnNNunvv(var10, var8, var9);
         } finally {
            STBImage.stbi_image_free(var7);
         }
      } catch (Throwable var18) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var16) {
               var18.addSuppressed(var16);
            }
         }

         throw var18;
      }

      if (var3 != null) {
         var3.close();
      }

      return var11;
   }

   int UuUVuuUu() {
      return this.uNNnnnuuuN;
   }

   boolean C00OOC00oO() {
      int var1 = this.uNNnnnuuuN;
      return var1 > 0 && GL11.glIsTexture(var1);
   }

   int uUnuvNvvNU() {
      return this.nuUnNvnuUu;
   }

   int vVvUvVVuuNvV() {
      return this.VVuuUN;
   }

   float uNNnnnuuuN() {
      return this.vNUvnnVnUvu;
   }

   float nuUnNvnuUu() {
      return this.uVUuuVnNVU;
   }

   float VVuuUN() {
      return this.vuuuNvNuv;
   }

   float vNUvnnVnUvu() {
      return this.nvUVNnuu;
   }

   float uVUuuVnNVU() {
      return this.UuuNnUvUuv;
   }

   nNvnvuvVuUVU.NVnVnNnN UuUVuuUu(int var1) {
      return (nNvnvuvVuUVU.NVnVnNnN)this.uUnuvNvvNU.get(var1);
   }

   float vuuuNvNuv() {
      float var1 = this.nUUVuvU;
      if (var1 > 0.0F) {
         return var1;
      } else {
         float var2 = 0.0F;
         ObjectIterator var3 = this.uUnuvNvvNU.values().iterator();

         while (var3.hasNext()) {
            nNvnvuvVuUVU.NVnVnNnN var4 = (nNvnvuvVuUVU.NVnVnNnN)var3.next();
            if (var4.C00OOC00oO) {
               float var5 = var4.uNNnnnuuuN - var4.uUnuvNvvNU;
               float var6 = Math.abs(var4.uVUuuVnNVU - var4.VVuuUN);
               if (var5 > 1.0E-5F && var6 > 1.0E-6F) {
                  var2 = var6 * this.nuUnNvnuUu / var5;
                  break;
               }
            }
         }

         this.nUUVuvU = var2 > 0.0F ? var2 : 1.0F;
         return this.nUUVuvU;
      }
   }

   float nvUVNnuu() {
      return this.vNUvnnVnUvu * 0.5F / this.vuuuNvNuv();
   }

   float UuUVuuUu(int var1, int var2) {
      return this.vVvUvVVuuNvV.get(C00OOC00oO(var1, var2));
   }

   private static long C00OOC00oO(int var0, int var1) {
      return (long)var0 << 32 | var1 & 4294967295L;
   }

   static float UuUVuuUu(float var0) {
      return UuUVuuUu(var0, 0.0F, 1.0F);
   }

   static float UuUVuuUu(float var0, float var1, float var2) {
      return !Float.isFinite(var0) ? var1 : Math.max(var1, Math.min(var2, var0));
   }

   static final class NVnVnNnN {
      final float UuUVuuUu;
      final boolean C00OOC00oO;
      final float uUnuvNvvNU;
      final float vVvUvVVuuNvV;
      final float uNNnnnuuuN;
      final float nuUnNvnuUu;
      final float VVuuUN;
      final float vNUvnnVnUvu;
      final float uVUuuVnNVU;
      final float vuuuNvNuv;

      NVnVnNnN(float var1) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = false;
         this.uUnuvNvvNU = 0.0F;
         this.vVvUvVVuuNvV = 0.0F;
         this.uNNnnnuuuN = 0.0F;
         this.nuUnNvnuUu = 0.0F;
         this.VVuuUN = 0.0F;
         this.vNUvnnVnUvu = 0.0F;
         this.uVUuuVnNVU = 0.0F;
         this.vuuuNvNuv = 0.0F;
      }

      NVnVnNnN(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = true;
         this.uUnuvNvvNU = var2;
         this.vVvUvVVuuNvV = var3;
         this.uNNnnnuuuN = var4;
         this.nuUnNvnuUu = var5;
         float var12 = 1.0F / Math.max(1.0F, (float)var10);
         float var13 = 1.0F / Math.max(1.0F, (float)var11);
         float var14 = nNvnvuvVuUVU.UuUVuuUu(Math.min(var6, var8) * var12);
         float var15 = nNvnvuvVuUVU.UuUVuuUu(Math.max(var6, var8) * var12);
         float var16 = nNvnvuvVuUVU.UuUVuuUu(Math.min(var7, var9) * var13);
         float var17 = nNvnvuvVuUVU.UuUVuuUu(Math.max(var7, var9) * var13);
         this.VVuuUN = nNvnvuvVuUVU.UuUVuuUu(var14, 0.0F, 1.0F);
         this.uVUuuVnNVU = nNvnvuvVuUVU.UuUVuuUu(var15, 0.0F, 1.0F);
         float var18 = nNvnvuvVuUVU.UuUVuuUu(var16, 0.0F, 1.0F);
         float var19 = nNvnvuvVuUVU.UuUVuuUu(var17, 0.0F, 1.0F);
         this.vNUvnnVnUvu = 1.0F - var18;
         this.vuuuNvNuv = 1.0F - var19;
      }
   }

   record nvnNNunvv(int textureId, int width, int height) {
   }
}
