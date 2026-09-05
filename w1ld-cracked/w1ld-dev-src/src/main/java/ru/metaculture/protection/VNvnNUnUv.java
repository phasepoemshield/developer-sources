package ru.metaculture.protection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.class_310;
import net.minecraft.class_320;

public final class VNvnNUnUv {
   private static final VNvnNUnUv UuUVuuUu = new VNvnNUnUv();
   private final uVNuNnuUNNuV C00OOC00oO = new uVNuNnuUNNuV();
   private final nnnvUNUvVUVU uUnuvNvvNU = new nnnvUNUvVUVU();
   private final c0O00CcoCc0c vVvUvVVuuNvV = new c0O00CcoCc0c();
   private final NnNUnv uNNnnnuuuN = new NnNUnv();
   private UUID nuUnNvnuUu;

   private VNvnNUnUv() {
   }

   public static VNvnNUnUv UuUVuuUu() {
      return UuUVuuUu;
   }

   public nnnvUNUvVUVU C00OOC00oO() {
      return this.uUnuvNvvNU;
   }

   public c0O00CcoCc0c uUnuvNvvNU() {
      return this.vVvUvVVuuNvV;
   }

   public NnNUnv vVvUvVVuuNvV() {
      return this.uNNnnnuuuN;
   }

   public uVvUnNnVN uNNnnnuuuN() {
      return this.C00OOC00oO.uUnuvNvvNU();
   }

   public boolean nuUnNvnuUu() {
      return this.C00OOC00oO.vVvUvVVuuNvV();
   }

   public String VVuuUN() {
      return this.C00OOC00oO.uNNnnnuuuN();
   }

   public UUID vNUvnnVnUvu() {
      return this.nuUnNvnuUu;
   }

   public void uVUuuVnNVU() {
      this.UuUVuuUu(UNvUnNVUUuv.UuUVuuUu());
   }

   public void UuUVuuUu(UNvUnNVUUuv var1) {
      this.vNVuvnUUnuUn();
      this.C00OOC00oO.UuUVuuUu(var1, this.UvnvNVnnnnNU());
   }

   public void vuuuNvNuv() {
      this.C00OOC00oO.UuUVuuUu();
      this.vNVuvnUUnuUn();
   }

   public boolean UuUVuuUu(String var1) {
      return this.C00OOC00oO.UuUVuuUu(vuVNUUvUuuun.UuUVuuUu(var1));
   }

   public boolean C00OOC00oO(String var1) {
      return this.C00OOC00oO.UuUVuuUu(vuVNUUvUuuun.C00OOC00oO(var1));
   }

   public boolean nvUVNnuu() {
      return this.C00OOC00oO.UuUVuuUu(vuVNUUvUuuun.UuUVuuUu());
   }

   public boolean UuUVuuUu(UUID var1) {
      return this.C00OOC00oO.UuUVuuUu(vuVNUUvUuuun.UuUVuuUu(var1));
   }

   public boolean UuUVuuUu(double var1, double var3, double var5, float var7, float var8, float var9) {
      return this.C00OOC00oO.UuUVuuUu(vuVNUUvUuuun.UuUVuuUu(var1, var3, var5, var7, var8, var9));
   }

   public boolean UuUVuuUu(UUID var1, double var2, double var4, double var6, float var8, float var9, float var10) {
      return this.C00OOC00oO.UuUVuuUu(vuVNUUvUuuun.UuUVuuUu(var1, var2, var4, var6, var8, var9, var10));
   }

   public boolean C00OOC00oO(UUID var1) {
      return this.C00OOC00oO.UuUVuuUu(vuVNUUvUuuun.C00OOC00oO(var1));
   }

   public boolean UuUVuuUu(UUID var1, String var2, boolean var3, long var4, float var6) {
      return this.C00OOC00oO.UuUVuuUu(vuVNUUvUuuun.UuUVuuUu(var1, var2, var3, var4, var6));
   }

   public void UuuNnUvUuv() {
      this.UnUNVVVNuv();

      for (int var1 = 0; var1 < 64; var1++) {
         String var2 = this.C00OOC00oO.C00OOC00oO();
         if (var2 == null) {
            return;
         }

         this.uUnuvNvvNU(var2);
      }
   }

   private void UnUNVVVNuv() {
      if (this.C00OOC00oO.vVvUvVVuuNvV()) {
         long var1 = System.currentTimeMillis();
         if (this.uNNnnnuuuN.UuUVuuUu(var1)) {
            if (this.C00OOC00oO.UuUVuuUu(vuVNUUvUuuun.UuUVuuUu(var1))) {
               this.uNNnnnuuuN.C00OOC00oO(var1);
            }
         }
      }
   }

   private void uUnuvNvvNU(String var1) {
      JsonObject var2 = uNNnnnuuuN(var1);
      if (var2 != null) {
         String var3 = C00OOC00oO(var2, "type");
         switch (var3) {
            case "welcome":
               this.UuUVuuUu(var2);
               break;
            case "party_state":
               this.C00OOC00oO(var2);
               break;
            case "party_closed":
               this.uUnuvNvvNU(var2);
               break;
            case "screens_state":
               this.vVvUvVVuuNvV(var2);
               break;
            case "time_echo":
               this.uNNnnnuuuN(var2);
               break;
            case "error":
               this.nuUnNvnuUu(var2);
         }
      }
   }

   private void UuUVuuUu(JsonObject var1) {
      this.nuUnNvnuUu = nuUnNvnuUu(var1, "uuid");
      vVnvuVVUunuv.UuUVuuUu("Подключено к серверу Wild");
   }

   private void C00OOC00oO(JsonObject var1) {
      ArrayList var2 = new ArrayList();

      for (JsonElement var4 : UuUVuuUu(var1, "members")) {
         if (var4.isJsonObject()) {
            JsonObject var5 = var4.getAsJsonObject();
            UUID var6 = nuUnNvnuUu(var5, "uuid");
            if (var6 != null) {
               var2.add(new nnnvUNUvVUVU.NVnVnNnN(var6, C00OOC00oO(var5, "username")));
            }
         }
      }

      this.uUnuvNvvNU.UuUVuuUu(nuUnNvnuUu(var1, "party_id"), nuUnNvnuUu(var1, "leader"), C00OOC00oO(var1, "code"), var2);
   }

   private void uUnuvNvvNU(JsonObject var1) {
      this.uUnuvNvvNU.nuUnNvnuUu();
      this.vVvUvVVuuNvV.uUnuvNvvNU();
      vVnvuVVUunuv.UuUVuuUu(C00OOC00oO(var1, "reason").equals("kicked") ? "Вас исключили из комнаты" : "Вы вышли из комнаты");
   }

   private void vVvUvVVuuNvV(JsonObject var1) {
      ArrayList var2 = new ArrayList();

      for (JsonElement var4 : UuUVuuUu(var1, "screens")) {
         if (var4.isJsonObject()) {
            JsonObject var5 = var4.getAsJsonObject();
            UUID var6 = nuUnNvnuUu(var5, "id");
            if (var6 != null) {
               var2.add(
                  new c0O00CcoCc0c.NVnVnNnN(
                     var6,
                     nuUnNvnuUu(var5, "owner"),
                     C00OOC00oO(var5, "source"),
                     uUnuvNvvNU(var5, "x"),
                     uUnuvNvvNU(var5, "y"),
                     uUnuvNvvNU(var5, "z"),
                     (float)uUnuvNvvNU(var5, "yaw"),
                     (float)uUnuvNvvNU(var5, "width"),
                     (float)uUnuvNvvNU(var5, "height"),
                     uNNnnnuuuN(var5, "playing"),
                     vVvUvVVuuNvV(var5, "position_ms"),
                     vVvUvVVuuNvV(var5, "stamp_ms"),
                     (float)uUnuvNvvNU(var5, "volume")
                  )
               );
            }
         }
      }

      this.vVvUvVVuuNvV.UuUVuuUu(var2);
   }

   private void uNNnnnuuuN(JsonObject var1) {
      this.uNNnnnuuuN.UuUVuuUu(vVvUvVVuuNvV(var1, "c"), vVvUvVVuuNvV(var1, "s"), System.currentTimeMillis());
   }

   private void nuUnNvnuUu(JsonObject var1) {
      vVnvuVVUunuv.UuUVuuUu(vVvUvVVuuNvV(C00OOC00oO(var1, "code")));
   }

   private static String vVvUvVVuuNvV(String var0) {
      return switch (var0) {
         case "code_taken" -> "Такой код уже занят";
         case "unknown_code" -> "Комната с таким кодом не найдена";
         case "already_in_party" -> "Вы уже в комнате";
         case "not_in_party" -> "Вы не состоите в комнате";
         case "not_leader" -> "Это может сделать только владелец комнаты";
         case "unknown_member" -> "Такого участника нет в комнате";
         case "rate_limited" -> "Слишком много попыток, подождите";
         case "invalid_code" -> "Неверный формат кода";
         case "screen_limit" -> "В комнате уже максимум экранов";
         case "unknown_screen" -> "Такого экрана в комнате нет";
         case "not_screen_owner" -> "Экраном управляет его владелец или владелец комнаты";
         case "invalid_screen" -> "Экран нельзя разместить здесь";
         case "cannot_transfer_to_self" -> "Вы и так управляете комнатой";
         default -> "Ошибка сервера";
      };
   }

   public String nUUVuvU() {
      class_310 var1 = class_310.method_1551();
      class_320 var2 = var1 == null ? null : var1.method_1548();
      return var2 == null ? "" : var2.method_1676();
   }

   private void vNVuvnUUnuUn() {
      this.nuUnNvnuUu = null;
      this.uUnuvNvvNU.nuUnNvnuUu();
      this.vVvUvVVuuNvV.uUnuvNvvNU();
      this.uNNnnnuuuN.vVvUvVVuuNvV();
   }

   private unuUNUU UvnvNVnnnnNU() {
      class_310 var1 = class_310.method_1551();
      class_320 var2 = var1 == null ? null : var1.method_1548();
      UUID var3 = var2 == null ? null : var2.method_44717();
      String var4 = this.nUUVuvU();
      if (var3 == null) {
         var3 = UUID.nameUUIDFromBytes(("WildOffline:" + var4).getBytes());
      }

      return unuUNUU.of(var3, var4, null);
   }

   private static JsonObject uNNnnnuuuN(String var0) {
      try {
         JsonElement var1 = JsonParser.parseString(var0);
         return var1.isJsonObject() ? var1.getAsJsonObject() : null;
      } catch (RuntimeException var2) {
         return null;
      }
   }

   private static JsonArray UuUVuuUu(JsonObject var0, String var1) {
      JsonElement var2 = var0.get(var1);
      return var2 != null && var2.isJsonArray() ? var2.getAsJsonArray() : new JsonArray();
   }

   private static String C00OOC00oO(JsonObject var0, String var1) {
      JsonElement var2 = var0.get(var1);
      return var2 != null && var2.isJsonPrimitive() ? var2.getAsString() : "";
   }

   private static double uUnuvNvvNU(JsonObject var0, String var1) {
      JsonElement var2 = var0.get(var1);

      try {
         return var2 != null && var2.isJsonPrimitive() ? var2.getAsDouble() : 0.0;
      } catch (NumberFormatException var4) {
         return 0.0;
      }
   }

   private static long vVvUvVVuuNvV(JsonObject var0, String var1) {
      JsonElement var2 = var0.get(var1);

      try {
         return var2 != null && var2.isJsonPrimitive() ? var2.getAsLong() : 0L;
      } catch (NumberFormatException var4) {
         return 0L;
      }
   }

   private static boolean uNNnnnuuuN(JsonObject var0, String var1) {
      JsonElement var2 = var0.get(var1);
      return var2 != null && var2.isJsonPrimitive() && var2.getAsBoolean();
   }

   private static UUID nuUnNvnuUu(JsonObject var0, String var1) {
      String var2 = C00OOC00oO(var0, var1);
      if (var2.isEmpty()) {
         return null;
      } else {
         try {
            return UUID.fromString(var2);
         } catch (IllegalArgumentException var4) {
            return null;
         }
      }
   }
}
