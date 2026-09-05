package ru.metaculture.protection;

import com.google.gson.JsonObject;
import java.util.UUID;

public final class vuVNUUvUuuun {
   public static final int UuUVuuUu = 1;
   static final String C00OOC00oO = "welcome";
   static final String uUnuvNvvNU = "party_state";
   static final String vVvUvVVuuNvV = "party_closed";
   static final String uNNnnnuuuN = "screens_state";
   static final String nuUnNvnuUu = "time_echo";
   static final String VVuuUN = "error";

   private vuVNUUvUuuun() {
   }

   static String UuUVuuUu(unuUNUU var0) {
      JsonObject var1 = uUnuvNvvNU("hello");
      var1.addProperty("v", 1);
      var1.addProperty("username", var0.username());
      var1.addProperty("uuid", var0.uuid().toString());
      if (var0.avatarUrl() != null) {
         var1.addProperty("avatar", var0.avatarUrl());
      }

      return var1.toString();
   }

   static String UuUVuuUu(String var0) {
      return UuUVuuUu("party_create", var0);
   }

   static String C00OOC00oO(String var0) {
      return UuUVuuUu("party_join", var0);
   }

   static String UuUVuuUu() {
      return uUnuvNvvNU("party_leave").toString();
   }

   static String UuUVuuUu(UUID var0) {
      JsonObject var1 = uUnuvNvvNU("party_transfer");
      var1.addProperty("target", var0.toString());
      return var1.toString();
   }

   static String UuUVuuUu(double var0, double var2, double var4, float var6, float var7, float var8) {
      return UuUVuuUu(uUnuvNvvNU("screen_create"), var0, var2, var4, var6, var7, var8);
   }

   static String UuUVuuUu(UUID var0, double var1, double var3, double var5, float var7, float var8, float var9) {
      JsonObject var10 = uUnuvNvvNU("screen_move");
      var10.addProperty("id", var0.toString());
      return UuUVuuUu(var10, var1, var3, var5, var7, var8, var9);
   }

   static String C00OOC00oO(UUID var0) {
      JsonObject var1 = uUnuvNvvNU("screen_remove");
      var1.addProperty("id", var0.toString());
      return var1.toString();
   }

   static String UuUVuuUu(UUID var0, String var1, boolean var2, long var3, float var5) {
      JsonObject var6 = uUnuvNvvNU("screen_playback");
      var6.addProperty("id", var0.toString());
      var6.addProperty("source", var1);
      var6.addProperty("playing", var2);
      var6.addProperty("position_ms", var3);
      var6.addProperty("volume", var5);
      return var6.toString();
   }

   static String UuUVuuUu(long var0) {
      JsonObject var2 = uUnuvNvvNU("time_sync");
      var2.addProperty("c", var0);
      return var2.toString();
   }

   private static String UuUVuuUu(JsonObject var0, double var1, double var3, double var5, float var7, float var8, float var9) {
      var0.addProperty("x", var1);
      var0.addProperty("y", var3);
      var0.addProperty("z", var5);
      var0.addProperty("yaw", var7);
      var0.addProperty("width", var8);
      var0.addProperty("height", var9);
      return var0.toString();
   }

   private static String UuUVuuUu(String var0, String var1) {
      JsonObject var2 = uUnuvNvvNU(var0);
      var2.addProperty("code", var1);
      return var2.toString();
   }

   private static JsonObject uUnuvNvvNU(String var0) {
      JsonObject var1 = new JsonObject();
      var1.addProperty("type", var0);
      return var1;
   }
}
