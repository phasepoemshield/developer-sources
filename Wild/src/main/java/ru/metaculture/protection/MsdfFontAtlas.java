package ru.metaculture.protection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.lwjgl.opengl.GL11;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;

final class MsdfFontAtlas {
   private final String O00000000;
   private final String O000000000;
   private final Map<Integer, MsdfFontAtlas.W407> O0000000000;
   private final Map<Long, Float> O00000000000;
   private volatile int O000000000000;
   private final int O0000000000000;
   private final int O000000000000O;
   private final float O00000000000O;
   private final float O00000000000O0;
   private final float O00000000000OO;
   private final float O0000000000O;
   private final float O0000000000O0;

   private MsdfFontAtlas(
      String string,
      String string2,
      int i,
      int j,
      int k,
      float f,
      float g,
      float h,
      float l,
      float m,
      Map<Integer, MsdfFontAtlas.W407> map,
      Map<Long, Float> map2
   ) {
      this.O00000000 = string;
      this.O000000000 = string2;
      this.O000000000000 = i;
      this.O0000000000000 = j;
      this.O000000000000O = k;
      this.O00000000000O = f;
      this.O00000000000O0 = g;
      this.O00000000000OO = h;
      this.O0000000000O = l;
      this.O0000000000O0 = m;
      this.O0000000000 = map;
      this.O00000000000 = map2;
   }

   static MsdfFontAtlas O00000000(RenderEngine o0000O00O0OOO, String string, String string2) {
      Objects.requireNonNull(o0000O00O0OOO, "backend");
      Objects.requireNonNull(string, "jsonResourcePath");
      Objects.requireNonNull(string2, "textureResourcePath");
      String var3 = O0000O00OO.O00000000(string);
      JsonObject var4 = JsonParser.parseString(var3).getAsJsonObject();
      JsonObject var5 = var4.getAsJsonObject("atlas");
      if (var5 == null) {
         throw new IllegalStateException("Missing 'atlas' section in MSDF font: " + string);
      } else {
         int var6 = var5.get("width").getAsInt();
         int var7 = var5.get("height").getAsInt();
         if (var6 > 0 && var7 > 0) {
            float var8 = var5.has("distanceRange") ? var5.get("distanceRange").getAsFloat() : 6.0F;
            JsonObject var9 = var4.getAsJsonObject("metrics");
            if (var9 == null) {
               throw new IllegalStateException("Missing 'metrics' section in MSDF font: " + string);
            } else {
               float var10 = var9.has("emSize") ? var9.get("emSize").getAsFloat() : 1.0F;
               float var11 = var9.has("lineHeight") ? var9.get("lineHeight").getAsFloat() : var10;
               float var12 = var9.has("ascender") ? var9.get("ascender").getAsFloat() : var11;
               float var13 = var9.has("descender") ? var9.get("descender").getAsFloat() : 0.0F;
               float var14 = Math.abs(var13);
               HashMap var15 = new HashMap();
               JsonArray var16 = var4.getAsJsonArray("glyphs");
               if (var16 != null) {
                  for (JsonElement var18 : var16) {
                     JsonObject var19 = var18.getAsJsonObject();
                     int var20 = var19.get("unicode").getAsInt();
                     float var21 = var19.has("advance") ? var19.get("advance").getAsFloat() : 0.0F;
                     JsonObject var22 = var19.has("planeBounds") ? var19.getAsJsonObject("planeBounds") : null;
                     JsonObject var23 = var19.has("atlasBounds") ? var19.getAsJsonObject("atlasBounds") : null;
                     MsdfFontAtlas.W407 var24;
                     if (var22 != null && var23 != null) {
                        float var25 = var22.get("left").getAsFloat();
                        float var26 = var22.get("bottom").getAsFloat();
                        float var27 = var22.get("right").getAsFloat();
                        float var28 = var22.get("top").getAsFloat();
                        float var29 = var23.get("left").getAsFloat();
                        float var30 = var23.get("bottom").getAsFloat();
                        float var31 = var23.get("right").getAsFloat();
                        float var32 = var23.get("top").getAsFloat();
                        var24 = new MsdfFontAtlas.W407(var21, var25, var26, var27, var28, var29, var30, var31, var32, var6, var7);
                     } else {
                        var24 = new MsdfFontAtlas.W407(var21);
                     }

                     var15.put(var20, var24);
                  }
               }

               HashMap var33 = new HashMap();
               JsonArray var34 = var4.getAsJsonArray("kerning");
               if (var34 != null) {
                  for (JsonElement var37 : var34) {
                     JsonObject var38 = var37.getAsJsonObject();
                     int var39 = var38.get("unicode1").getAsInt();
                     int var40 = var38.get("unicode2").getAsInt();
                     float var41 = var38.has("advance") ? var38.get("advance").getAsFloat() : 0.0F;
                     var33.put(O000000000(var39, var40), var41);
                  }
               }

               MsdfFontAtlas.W408 var36 = O00000000(o0000O00O0OOO, string2);
               return new MsdfFontAtlas(string, string2, var36.textureId, var36.width, var36.height, var8, var10, var11, var12, var14, var15, var33);
            }
         } else {
            throw new IllegalStateException("Invalid MSDF atlas dimensions in font: " + string);
         }
      }
   }

   void O00000000(RenderEngine o0000O00O0OOO) {
      Objects.requireNonNull(o0000O00O0OOO, "backend");
      int var2 = this.O000000000000;

      try {
         MsdfFontAtlas.W408 var3 = O00000000(o0000O00O0OOO, this.O000000000);
         if (var3.width != this.O0000000000000 || var3.height != this.O000000000000O) {
            if (var3.textureId > 0) {
               GL11.glDeleteTextures(var3.textureId);
            }

            return;
         }

         this.O000000000000 = var3.textureId;
      } catch (Throwable var5) {
         return;
      }

      if (var2 > 0 && var2 != this.O000000000000) {
         try {
            GL11.glDeleteTextures(var2);
         } catch (Throwable var4) {
         }
      }
   }

   private static MsdfFontAtlas.W408 O00000000(RenderEngine o0000O00O0OOO, String string) {
      ByteBuffer var2 = O0000O00OO.O000000000(string);
      MemoryStack var3 = MemoryStack.stackPush();

      MsdfFontAtlas.W408 var11;
      try {
         IntBuffer var4 = var3.mallocInt(1);
         IntBuffer var5 = var3.mallocInt(1);
         IntBuffer var6 = var3.mallocInt(1);
         ByteBuffer var7 = STBImage.stbi_load_from_memory(var2, var4, var5, var6, 4);
         if (var7 == null) {
            throw new IllegalStateException("Failed to load MSDF atlas '" + string + "': " + STBImage.stbi_failure_reason());
         }

         try {
            int var8 = var4.get(0);
            int var9 = var5.get(0);
            int var10 = o0000O00O0OOO.O00000000(var8, var9, var7);
            var11 = new MsdfFontAtlas.W408(var10, var8, var9);
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

   int O00000000() {
      return this.O000000000000;
   }

   boolean O000000000() {
      int var1 = this.O000000000000;
      return var1 > 0 && GL11.glIsTexture(var1);
   }

   int O0000000000() {
      return this.O0000000000000;
   }

   int O00000000000() {
      return this.O000000000000O;
   }

   float O000000000000() {
      return this.O00000000000O;
   }

   float O0000000000000() {
      return this.O00000000000O0;
   }

   float O000000000000O() {
      return this.O00000000000OO;
   }

   float O00000000000O() {
      return this.O0000000000O;
   }

   float O00000000000O0() {
      return this.O0000000000O0;
   }

   MsdfFontAtlas.W407 O00000000(int i) {
      return this.O0000000000.get(i);
   }

   float O00000000(int i, int j) {
      return this.O00000000000.getOrDefault(O000000000(i, j), 0.0F);
   }

   private static long O000000000(int i, int j) {
      return (long)i << 32 | j & 4294967295L;
   }

   static float O00000000(float f) {
      return O00000000(f, 0.0F, 1.0F);
   }

   static float O00000000(float f, float g, float h) {
      return !Float.isFinite(f) ? g : Math.max(g, Math.min(h, f));
   }

   static final class W407 {
      final float O00000000;
      final boolean O000000000;
      final float O0000000000;
      final float O00000000000;
      final float O000000000000;
      final float O0000000000000;
      final float O000000000000O;
      final float O00000000000O;
      final float O00000000000O0;
      final float O00000000000OO;

      W407(float f) {
         this.O00000000 = f;
         this.O000000000 = false;
         this.O0000000000 = 0.0F;
         this.O00000000000 = 0.0F;
         this.O000000000000 = 0.0F;
         this.O0000000000000 = 0.0F;
         this.O000000000000O = 0.0F;
         this.O00000000000O = 0.0F;
         this.O00000000000O0 = 0.0F;
         this.O00000000000OO = 0.0F;
      }

      W407(float f, float g, float h, float i, float j, float k, float l, float m, float n, int o, int p) {
         this.O00000000 = f;
         this.O000000000 = true;
         this.O0000000000 = g;
         this.O00000000000 = h;
         this.O000000000000 = i;
         this.O0000000000000 = j;
         float var12 = 1.0F / Math.max(1.0F, (float)o);
         float var13 = 1.0F / Math.max(1.0F, (float)p);
         float var14 = var12 * 0.5F;
         float var15 = var13 * 0.5F;
         float var16 = MsdfFontAtlas.O00000000(Math.min(k, m) * var12);
         float var17 = MsdfFontAtlas.O00000000(Math.max(k, m) * var12);
         float var18 = MsdfFontAtlas.O00000000(Math.min(l, n) * var13);
         float var19 = MsdfFontAtlas.O00000000(Math.max(l, n) * var13);
         if (var17 - var16 > var12) {
            var16 += var14;
            var17 -= var14;
         }

         if (var19 - var18 > var13) {
            var18 += var15;
            var19 -= var15;
         }

         this.O000000000000O = MsdfFontAtlas.O00000000(var16, 0.0F, 1.0F);
         this.O00000000000O0 = MsdfFontAtlas.O00000000(var17, 0.0F, 1.0F);
         float var20 = MsdfFontAtlas.O00000000(var18, 0.0F, 1.0F);
         float var21 = MsdfFontAtlas.O00000000(var19, 0.0F, 1.0F);
         this.O00000000000O = 1.0F - var20;
         this.O00000000000OO = 1.0F - var21;
      }
   }

   record W408(int textureId, int width, int height) {
   }
}
