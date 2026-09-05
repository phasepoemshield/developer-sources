package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.List;
import java.util.regex.Pattern;
import net.minecraft.class_310;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class UuuNvUuUnu extends UNUuvUN {
   private static final Pattern vVvUvVVuuNvV = Pattern.compile("^[A-Z0-9]{16}$");
   private static final Gson uNNnnnuuuN = new GsonBuilder().setPrettyPrinting().create();
   private static final File nuUnNvnuUu;
   public static volatile String UuUVuuUu = "";
   public static volatile String C00OOC00oO = "";
   public static volatile boolean uUnuvNvvNU;
   private static volatile boolean VVuuUN;

   public UuuNvUuUnu() {
      super("party", "Группа по коду (коды на 16 символов, лидер создаёт)", ".party <create|connect <код>|leave|list|kick <ник>>");
      this.UuUVuuUu("create", () -> List.of("создаёт группу, выдаёт код"));
      this.UuUVuuUu("connect", () -> List.of("КОД_16_СИМВОЛОВ"));
      this.UuUVuuUu("leave", () -> List.of("выйти (лидер удаляет всю группу)"));
      this.UuUVuuUu("list", () -> List.of("список участников"));
      this.UuUVuuUu("kick", () -> COcocc0c0Oc.nuUnNvnuUu() != null ? COcocc0c0Oc.nuUnNvnuUu() : List.of());
      vuuuNvNuv();
      COcocc0c0Oc.uUnuvNvvNU = UuuNvUuUnu::UuUVuuUu;
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length == 0) {
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: §f" + this.uUnuvNvvNU());
      } else {
         String var2 = var1[0].toLowerCase();
         switch (var2) {
            case "create":
               this.nuUnNvnuUu();
               break;
            case "connect":
            case "join":
               this.uUnuvNvvNU(var1);
               break;
            case "leave":
               this.VVuuUN();
               break;
            case "list":
               this.vNUvnnVnUvu();
               break;
            case "kick":
               this.vVvUvVVuuNvV(var1);
               break;
            default:
               vVnvuVVUunuv.UuUVuuUu("§cНеизвестная подкоманда: §f" + var1[0]);
         }
      }
   }

   @Compile
   private void nuUnNvnuUu() {
      COcocc0c0Oc var1 = COcocc0c0Oc.UuUVuuUu;
      if (var1 != null && var1.isOpen()) {
         COcocc0c0Oc.UuUVuuUu(var1, "create");
      } else {
         vVnvuVVUunuv.UuUVuuUu("§c[Party] Сервер меток не подключён. Включи модуль Party.");
      }
   }

   @Compile
   private void uUnuvNvvNU(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cУкажи код группы: §f.party connect <код>");
      } else {
         String var2 = var1[1].trim().toUpperCase();
         if (!vVvUvVVuuNvV.matcher(var2).matches()) {
            vVnvuVVUunuv.UuUVuuUu("§cКод должен состоять из 16 символов A-Z/0-9.");
         } else {
            COcocc0c0Oc var3 = COcocc0c0Oc.UuUVuuUu;
            if (var3 != null && var3.isOpen()) {
               COcocc0c0Oc.UuUVuuUu(var3, "join", var2);
            } else {
               vVnvuVVUunuv.UuUVuuUu("§c[Party] Сервер меток не подключён. Включи модуль Party.");
            }
         }
      }
   }

   @Compile
   private void VVuuUN() {
      if (UuUVuuUu.isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("§eТы не в группе.");
      } else {
         COcocc0c0Oc var1 = COcocc0c0Oc.UuUVuuUu;
         if (var1 != null && var1.isOpen()) {
            COcocc0c0Oc.UuUVuuUu(var1, "leave");
         } else {
            vVnvuVVUunuv.UuUVuuUu("§c[Party] Сервер меток не подключён.");
         }
      }
   }

   @Compile
   private void vNUvnnVnUvu() {
      if (UuUVuuUu.isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("§eТы не в группе.");
      } else {
         COcocc0c0Oc var1 = COcocc0c0Oc.UuUVuuUu;
         if (var1 != null && var1.isOpen()) {
            VVuuUN = true;
            COcocc0c0Oc.UuUVuuUu(var1, "list");
         } else {
            vVnvuVVUunuv.UuUVuuUu("§c[Party] Сервер меток не подключён.");
         }
      }
   }

   @Compile
   private void vVvUvVVuuNvV(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cУкажи ник: §f.party kick <ник>");
      } else if (!uUnuvNvvNU) {
         vVnvuVVUunuv.UuUVuuUu("§cКикать может только создатель группы.");
      } else {
         COcocc0c0Oc var2 = COcocc0c0Oc.UuUVuuUu;
         if (var2 != null && var2.isOpen()) {
            String var3 = "kick";
            String var4 = var1[1];
            String[] var5 = new String[1];
            if (var4 != null) {
               var5[0] = var4;
            }

            COcocc0c0Oc.UuUVuuUu(var2, var3, var5);
         } else {
            vVnvuVVUunuv.UuUVuuUu("§c[Party] Сервер меток не подключён.");
         }
      }
   }

   private static void UuUVuuUu(JSONObject var0) {
      String var1 = var0.optString("op");
      switch (var1) {
         case "created":
            UuUVuuUu = var0.optString("code", "");
            C00OOC00oO = var0.optString("owner", uVUuuVnNVU());
            uUnuvNvvNU = true;
            nvUVNnuu();
            vVnvuVVUunuv.UuUVuuUu("§aГруппа создана. Код группы: §f" + UuUVuuUu);
            vVnvuVVUunuv.UuUVuuUu("§7Передай этот код друзьям: §f.party connect " + UuUVuuUu);
            break;
         case "joined":
            UuUVuuUu = var0.optString("code", "");
            C00OOC00oO = var0.optString("owner", "");
            uUnuvNvvNU = false;
            nvUVNnuu();
            COcocc0c0Oc.C00OOC00oO.clear();
            vVnvuVVUunuv.UuUVuuUu("§aТы в группе §f" + C00OOC00oO + "§a. Код: §f" + UuUVuuUu);
            break;
         case "left":
            UuUVuuUu = "";
            C00OOC00oO = "";
            uUnuvNvvNU = false;
            COcocc0c0Oc.uNNnnnuuuN();
            nvUVNnuu();
            COcocc0c0Oc.C00OOC00oO.clear();
            vVnvuVVUunuv.UuUVuuUu("§eТы вышел из группы.");
            break;
         case "party_closed":
            UuUVuuUu = "";
            C00OOC00oO = "";
            uUnuvNvvNU = false;
            COcocc0c0Oc.uNNnnnuuuN();
            nvUVNnuu();
            COcocc0c0Oc.C00OOC00oO.clear();
            vVnvuVVUunuv.UuUVuuUu("§cГруппа закрыта владельцем.");
            break;
         case "kicked":
            UuUVuuUu = "";
            C00OOC00oO = "";
            uUnuvNvvNU = false;
            COcocc0c0Oc.uNNnnnuuuN();
            nvUVNnuu();
            COcocc0c0Oc.C00OOC00oO.clear();
            vVnvuVVUunuv.UuUVuuUu("§cТы был исключён из группы.");
            break;
         case "party_state":
            C00OOC00oO = var0.optString("owner", "");
            uUnuvNvvNU = C00OOC00oO.equalsIgnoreCase(uVUuuVnNVU());
            if (VVuuUN) {
               VVuuUN = false;
               UuUVuuUu(var0.optJSONArray("members"));
            }
            break;
         case "error":
            if (VVuuUN) {
               VVuuUN = false;
            }

            vVnvuVVUunuv.UuUVuuUu("§c[Party] " + var0.optString("msg", "ошибка"));
      }
   }

   private static void UuUVuuUu(JSONArray var0) {
      if (var0 != null && var0.length() != 0) {
         vVnvuVVUunuv.UuUVuuUu("§fУчастники группы §8(" + var0.length() + "§8):");

         for (int var1 = 0; var1 < var0.length(); var1++) {
            String var2 = var0.getString(var1);
            String var3 = var2.equalsIgnoreCase(C00OOC00oO) ? " §a[глава]" : "";
            vVnvuVVUunuv.UuUVuuUu(" §7- §f" + var2 + var3);
         }
      } else {
         vVnvuVVUunuv.UuUVuuUu("§7В группе пока пусто.");
      }
   }

   private static String uVUuuVnNVU() {
      class_310 var0 = class_310.method_1551();
      return var0 != null && var0.method_1548() != null ? var0.method_1548().method_1676() : "";
   }

   public static String vVvUvVVuuNvV() {
      return UuUVuuUu;
   }

   public static List<String> uNNnnnuuuN() {
      return COcocc0c0Oc.nuUnNvnuUu();
   }

   @Compile
   private static void vuuuNvNuv() {
      if (nuUnNvnuUu.exists()) {
         try (FileReader var0 = new FileReader(nuUnNvnuUu)) {
            UuuNvUuUnu.NVnVnNnN var1 = (UuuNvUuUnu.NVnVnNnN)uNNnnnuuuN.fromJson(var0, UuuNvUuUnu.NVnVnNnN.class);
            if (var1 != null) {
               String var2 = var1.UuUVuuUu != null ? var1.UuUVuuUu : "";
               Field var3 = UuuNvUuUnu.class.getDeclaredField("UuUVuuUu");
               var3.setAccessible(true);
               var3.set(null, var2);
               String var4 = var1.C00OOC00oO != null ? var1.C00OOC00oO : "";
               Field var5 = UuuNvUuUnu.class.getDeclaredField("C00OOC00oO");
               var5.setAccessible(true);
               var5.set(null, var4);
               uUnuvNvvNU = var1.C00OOC00oO != null && var1.C00OOC00oO.equalsIgnoreCase(uVUuuVnNVU());
            }
         } catch (Exception var8) {
         }
      }
   }

   @Compile
   private static void nvUVNnuu() {
      try {
         if (!nuUnNvnuUu.getParentFile().exists()) {
            nuUnNvnuUu.getParentFile().mkdirs();
         }

         try (FileWriter var0 = new FileWriter(nuUnNvnuUu)) {
            UuuNvUuUnu.NVnVnNnN var1 = new UuuNvUuUnu.NVnVnNnN();
            var1.UuUVuuUu = UuUVuuUu;
            var1.C00OOC00oO = C00OOC00oO;
            uNNnnnuuuN.toJson(var1, var0);
         }
      } catch (Exception var5) {
      }
   }

   static {
      Loader.initialize();
      nuUnNvnuUu = new File(ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "party.cfg");
   }

   static class NVnVnNnN {
      String UuUVuuUu;
      String C00OOC00oO;
   }
}
