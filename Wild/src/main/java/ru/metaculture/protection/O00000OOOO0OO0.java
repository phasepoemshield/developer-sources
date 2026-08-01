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

public final class O00000OOOO0OO0 {
   public static final String O00000000 = "WildTheme::";

   private O00000OOOO0OO0() {
   }

   public static String O00000000(O00000OOO0OO00 o00000OOO0OO00) {
      String var1 = O000000000(o00000OOO0OO00).toString();
      byte[] var2 = O00000000(var1.getBytes(StandardCharsets.UTF_8));
      String var3 = Base64.getUrlEncoder().withoutPadding().encodeToString(var2);
      return "WildTheme::" + O00000000(var1) + "::" + var3;
   }

   public static O00000OOO0OO00 O00000000(String string, O00000OOO0OOO o00000OOO0OOO) {
      if (string != null && string.startsWith("WildTheme::")) {
         String var2 = string.substring("WildTheme::".length());
         int var3 = var2.indexOf("::");
         String var4 = var3 >= 0 ? var2.substring(var3 + 2) : var2;
         byte[] var5 = Base64.getUrlDecoder().decode(var4);
         String var6 = new String(O000000000(var5), StandardCharsets.UTF_8);
         return O00000000(new JSONObject(var6), o00000OOO0OOO);
      } else {
         throw new IllegalArgumentException("Invalid WildTheme payload");
      }
   }

   public static JSONObject O000000000(O00000OOO0OO00 o00000OOO0OO00) {
      JSONObject var1 = new JSONObject();
      var1.put("version", 3);
      var1.put("target", o00000OOO0OO00.O000000000());
      var1.put("metadata", O00000000(o00000OOO0OO00.O00000000()));
      JSONArray var2 = new JSONArray();

      for (O00000OOO0OO0O var4 : o00000OOO0OO00.O0000000000()) {
         JSONObject var5 = new JSONObject();
         var5.put("id", var4.O00000000());
         var5.put("kind", var4.O000000000());
         var5.put("x", var4.O0000000000());
         var5.put("y", var4.O00000000000());
         JSONObject var6 = new JSONObject();

         for (Entry var8 : var4.O0000000000000().entrySet()) {
            var6.put((String)var8.getKey(), var8.getValue());
         }

         var5.put("values", var6);
         JSONObject var14 = new JSONObject();

         for (Entry var9 : var4.O000000000000O().entrySet()) {
            var14.put((String)var9.getKey(), var9.getValue());
         }

         var5.put("textValues", var14);
         var2.put(var5);
      }

      JSONArray var10 = new JSONArray();

      for (O00000OOO0OO0 var12 : o00000OOO0OO00.O00000000000()) {
         JSONObject var13 = new JSONObject();
         var13.put("fromNode", var12.O00000000());
         var13.put("fromPin", var12.O000000000());
         var13.put("toNode", var12.O0000000000());
         var13.put("toPin", var12.O00000000000());
         var10.put(var13);
      }

      var1.put("nodes", var2);
      var1.put("connections", var10);
      return var1;
   }

   public static O00000OOO0OO00 O00000000(JSONObject jSONObject, O00000OOO0OOO o00000OOO0OOO) {
      O00000OOO0OO00 var2 = new O00000OOO0OO00();
      String var3 = jSONObject.optString("target", "");
      if (!var3.isBlank()) {
         var2.O00000000(var3);
      }

      var2.O00000000(O00000000(jSONObject.optJSONObject("metadata"), jSONObject));
      JSONArray var4 = jSONObject.optJSONArray("nodes");
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.length(); var5++) {
            JSONObject var6 = var4.getJSONObject(var5);
            O00000OOO0OO0O var7 = new O00000OOO0OO0O(
               var6.getString("id"), var6.getString("kind"), (float)var6.optDouble("x", 0.0), (float)var6.optDouble("y", 0.0)
            );
            JSONObject var8 = var6.optJSONObject("values");
            if (var8 != null) {
               for (String var10 : var8.keySet()) {
                  var7.O000000000(var10, (float)var8.optDouble(var10, 0.0));
               }
            }

            JSONObject var15 = var6.optJSONObject("textValues");
            if (var15 != null) {
               for (String var11 : var15.keySet()) {
                  var7.O000000000(var11, var15.optString(var11, ""));
               }
            }

            var2.O00000000(var7, o00000OOO0OOO);
         }
      }

      JSONArray var12 = jSONObject.optJSONArray("connections");
      if (var12 != null) {
         for (int var13 = 0; var13 < var12.length(); var13++) {
            JSONObject var14 = var12.getJSONObject(var13);
            var2.O00000000(var14.getString("fromNode"), var14.getString("fromPin"), var14.getString("toNode"), var14.getString("toPin"), o00000OOO0OOO);
         }
      }

      return var2;
   }

   public static JSONObject O00000000(O00000OOO0O000 o00000OOO0O000) {
      O00000OOO0O000 var1 = o00000OOO0O000 == null ? new O00000OOO0O000() : o00000OOO0O000;
      JSONObject var2 = new JSONObject();
      var2.put("name", var1.O000000000());
      var2.put("author", var1.O0000000000());
      var2.put("description", var1.O00000000000());
      var2.put("complexity", var1.O000000000000());
      var2.put("source", var1.O0000000000000());
      var2.put("shapeSource", var1.O000000000000O());
      var2.put("createdAt", var1.O00000000000O0());
      var2.put("updatedAt", var1.O00000000000OO());
      var2.put("favorite", var1.O0000000000O());
      var2.put("previewThumbnail", var1.O00000000000O());
      return var2;
   }

   public static O00000OOO0O000 O00000000(JSONObject jSONObject, JSONObject jSONObject2) {
      O00000OOO0O000 var2 = new O00000OOO0O000();
      JSONObject var3 = jSONObject == null ? new JSONObject() : jSONObject;
      JSONObject var4 = jSONObject2 == null ? new JSONObject() : jSONObject2;
      var2.O00000000(var3.optString("name", var4.optString("displayName", "")));
      var2.O000000000(var3.optString("author", var4.optString("author", "")));
      var2.O0000000000(var3.optString("description", var4.optString("description", "")));
      var2.O00000000000(var3.optString("complexity", var4.optString("complexity", "Custom")));
      var2.O000000000000(var3.optString("source", var4.optString("source", "local")));
      var2.O0000000000000(var3.optString("shapeSource", var4.optString("shapeSource", "Host Rectangle")));
      var2.O00000000(var3.optLong("createdAt", var4.optLong("createdAt", 0L)));
      var2.O000000000(var3.optLong("updatedAt", var4.optLong("updatedAt", 0L)));
      var2.O00000000(var3.optBoolean("favorite", var4.optBoolean("favorite", false)));
      var2.O000000000000O(var3.optString("previewThumbnail", var4.optString("previewThumbnail", "")));
      return var2;
   }

   private static byte[] O00000000(byte[] bs) {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();

         try (GZIPOutputStream var2 = new GZIPOutputStream(var1)) {
            var2.write(bs);
         }

         return var1.toByteArray();
      } catch (Exception var7) {
         throw new IllegalStateException("GZIP export failed", var7);
      }
   }

   private static byte[] O000000000(byte[] bs) {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();

         try (GZIPInputStream var2 = new GZIPInputStream(new ByteArrayInputStream(bs))) {
            var2.transferTo(var1);
         }

         return var1.toByteArray();
      } catch (Exception var7) {
         throw new IllegalArgumentException("GZIP import failed", var7);
      }
   }

   private static String O00000000(String string) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");
         byte[] var2 = var1.digest(string.getBytes(StandardCharsets.UTF_8));
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
