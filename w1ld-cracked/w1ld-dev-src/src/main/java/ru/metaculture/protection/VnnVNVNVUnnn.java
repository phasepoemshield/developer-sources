package ru.metaculture.protection;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final class VnnVNVNVUnnn {
   public static final String UuUVuuUu = "WildTheme::";

   private VnnVNVNVUnnn() {
   }

   public static String UuUVuuUu(nuVVnvn var0) {
      String var1 = C00OOC00oO(var0).toString();
      byte[] var2 = UuUVuuUu(var1.getBytes(StandardCharsets.UTF_8));
      String var3 = Base64.getUrlEncoder().withoutPadding().encodeToString(var2);
      return "WildTheme::" + UuUVuuUu(var1) + "::" + var3;
   }

   public static nuVVnvn UuUVuuUu(String var0, nvvuUNnNvN var1) {
      if (var0 != null && var0.startsWith("WildTheme::")) {
         String var2 = var0.substring("WildTheme::".length());
         int var3 = var2.indexOf("::");
         String var4 = var3 >= 0 ? var2.substring(var3 + 2) : var2;
         byte[] var5 = Base64.getUrlDecoder().decode(var4);
         String var6 = new String(C00OOC00oO(var5), StandardCharsets.UTF_8);
         return UuUVuuUu(new JSONObject(var6), var1);
      } else {
         throw new IllegalArgumentException("Invalid WildTheme payload");
      }
   }

   public static JSONObject C00OOC00oO(nuVVnvn var0) {
      JSONObject var1 = new JSONObject();
      var1.put("version", 3);
      var1.put("target", var0.C00OOC00oO());
      var1.put("metadata", UuUVuuUu(var0.UuUVuuUu()));
      JSONArray var2 = new JSONArray();

      for (VUnvuNuVUUn var4 : var0.uUnuvNvvNU()) {
         JSONObject var5 = new JSONObject();
         var5.put("id", var4.UuUVuuUu());
         var5.put("kind", var4.C00OOC00oO());
         var5.put("x", var4.uUnuvNvvNU());
         var5.put("y", var4.vVvUvVVuuNvV());
         JSONObject var6 = new JSONObject();

         for (Entry var8 : var4.nuUnNvnuUu().entrySet()) {
            var6.put((String)var8.getKey(), var8.getValue());
         }

         var5.put("values", var6);
         JSONObject var14 = new JSONObject();

         for (Entry var9 : var4.VVuuUN().entrySet()) {
            var14.put((String)var9.getKey(), var9.getValue());
         }

         var5.put("textValues", var14);
         var2.put(var5);
      }

      JSONArray var10 = new JSONArray();

      for (nNuNNVuNUu var12 : var0.vVvUvVVuuNvV()) {
         JSONObject var13 = new JSONObject();
         var13.put("fromNode", var12.UuUVuuUu());
         var13.put("fromPin", var12.C00OOC00oO());
         var13.put("toNode", var12.uUnuvNvvNU());
         var13.put("toPin", var12.vVvUvVVuuNvV());
         var10.put(var13);
      }

      var1.put("nodes", var2);
      var1.put("connections", var10);
      return var1;
   }

   public static nuVVnvn UuUVuuUu(JSONObject var0, nvvuUNnNvN var1) {
      nuVVnvn var2 = new nuVVnvn();
      String var3 = var0.optString("target", "");
      if (!var3.isBlank()) {
         var2.UuUVuuUu(var3);
      }

      var2.UuUVuuUu(UuUVuuUu(var0.optJSONObject("metadata"), var0));
      JSONArray var4 = var0.optJSONArray("nodes");
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.length(); var5++) {
            JSONObject var6 = var4.getJSONObject(var5);
            VUnvuNuVUUn var7 = new VUnvuNuVUUn(var6.getString("id"), var6.getString("kind"), (float)var6.optDouble("x", 0.0), (float)var6.optDouble("y", 0.0));
            JSONObject var8 = var6.optJSONObject("values");
            if (var8 != null) {
               for (String var10 : var8.keySet()) {
                  var7.C00OOC00oO(var10, (float)var8.optDouble(var10, 0.0));
               }
            }

            JSONObject var15 = var6.optJSONObject("textValues");
            if (var15 != null) {
               for (String var11 : var15.keySet()) {
                  var7.C00OOC00oO(var11, var15.optString(var11, ""));
               }
            }

            var2.UuUVuuUu(var7, var1);
         }
      }

      JSONArray var12 = var0.optJSONArray("connections");
      if (var12 != null) {
         for (int var13 = 0; var13 < var12.length(); var13++) {
            JSONObject var14 = var12.getJSONObject(var13);
            var2.UuUVuuUu(var14.getString("fromNode"), var14.getString("fromPin"), var14.getString("toNode"), var14.getString("toPin"), var1);
         }
      }

      return var2;
   }

   public static JSONObject UuUVuuUu(UVVNvnVNvN var0) {
      UVVNvnVNvN var1 = var0 == null ? new UVVNvnVNvN() : var0;
      JSONObject var2 = new JSONObject();
      var2.put("name", var1.C00OOC00oO());
      var2.put("author", var1.uUnuvNvvNU());
      var2.put("description", var1.vVvUvVVuuNvV());
      var2.put("complexity", var1.uNNnnnuuuN());
      var2.put("source", var1.nuUnNvnuUu());
      var2.put("shapeSource", var1.VVuuUN());
      var2.put("createdAt", var1.uVUuuVnNVU());
      var2.put("updatedAt", var1.vuuuNvNuv());
      var2.put("favorite", var1.nvUVNnuu());
      var2.put("previewThumbnail", var1.vNUvnnVnUvu());
      return var2;
   }

   public static UVVNvnVNvN UuUVuuUu(JSONObject var0, JSONObject var1) {
      UVVNvnVNvN var2 = new UVVNvnVNvN();
      JSONObject var3 = var0 == null ? new JSONObject() : var0;
      JSONObject var4 = var1 == null ? new JSONObject() : var1;
      var2.UuUVuuUu(var3.optString("name", var4.optString("displayName", "")));
      var2.C00OOC00oO(var3.optString("author", var4.optString("author", "")));
      var2.uUnuvNvvNU(var3.optString("description", var4.optString("description", "")));
      var2.vVvUvVVuuNvV(var3.optString("complexity", var4.optString("complexity", "Custom")));
      var2.uNNnnnuuuN(var3.optString("source", var4.optString("source", "local")));
      var2.nuUnNvnuUu(var3.optString("shapeSource", var4.optString("shapeSource", "Host Rectangle")));
      var2.UuUVuuUu(var3.optLong("createdAt", var4.optLong("createdAt", 0L)));
      var2.C00OOC00oO(var3.optLong("updatedAt", var4.optLong("updatedAt", 0L)));
      var2.UuUVuuUu(var3.optBoolean("favorite", var4.optBoolean("favorite", false)));
      var2.VVuuUN(var3.optString("previewThumbnail", var4.optString("previewThumbnail", "")));
      return var2;
   }

   private static byte[] UuUVuuUu(byte[] var0) {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();

         try (GZIPOutputStream var2 = new GZIPOutputStream(var1)) {
            var2.write(var0);
         }

         return var1.toByteArray();
      } catch (Exception var7) {
         throw new IllegalStateException("GZIP export failed", var7);
      }
   }

   private static byte[] C00OOC00oO(byte[] var0) {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();

         try (GZIPInputStream var2 = new GZIPInputStream(new ByteArrayInputStream(var0))) {
            var2.transferTo(var1);
         }

         return var1.toByteArray();
      } catch (Exception var7) {
         throw new IllegalArgumentException("GZIP import failed", var7);
      }
   }

   private static String UuUVuuUu(String var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");
         byte[] var2 = var1.digest(var0.getBytes(StandardCharsets.UTF_8));
         StringBuilder var3 = new StringBuilder(16);

         for (int var4 = 0; var4 < 8; var4++) {
            var3.append(String.format("%02x", var2[var4] & 255));
         }

         return var3.toString();
      } catch (Exception var5) {
         return "0000000000000000";
      }
   }
}
