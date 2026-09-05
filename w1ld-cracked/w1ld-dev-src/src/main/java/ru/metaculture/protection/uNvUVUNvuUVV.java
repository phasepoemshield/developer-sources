package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_2558.class_10610;
import net.minecraft.class_2568.class_10613;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class uNvUVUNvuUVV extends UNUuvUN {
   private static final Gson UuUVuuUu = new GsonBuilder().setPrettyPrinting().create();
   private static final File C00OOC00oO = new File(ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "friend.cfg");
   private static final Map<String, uNvUVUNvuUVV.NVnVnNnN> uUnuvNvvNU = new HashMap<>();
   private static final SimpleDateFormat vVvUvVVuuNvV = new SimpleDateFormat("dd.MM.yyyy HH:mm");

   public uNvUVUNvuUVV() {
      super("friend", "Управление друзьями", ".friend <add/remove/list/clear> <name>");
      this.UuUVuuUu("add", () -> a_.method_1562().method_2880().stream().map(var0 -> var0.method_2966().getName()).toList());
      this.UuUVuuUu("remove", () -> new ArrayList<>(uUnuvNvvNU.keySet()));
      this.UuUVuuUu("list", List::of);
      this.UuUVuuUu("clear", List::of);
      this.VVuuUN();
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length == 0) {
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + this.uUnuvNvvNU());
      } else {
         String var2 = var1[0].toLowerCase();
         switch (var2) {
            case "add":
               this.uUnuvNvvNU(var1);
               break;
            case "remove":
               this.vVvUvVVuuNvV(var1);
               break;
            case "list":
               this.nuUnNvnuUu();
               break;
            case "clear":
               this.uNNnnnuuuN();
               break;
            default:
               vVnvuVVUunuv.UuUVuuUu("§cНеизвестная подкоманда.");
         }
      }
   }

   @Compile
   private void uUnuvNvvNU(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cУкажите ник игрока.");
      } else {
         C00OOC00oO(var1[1]);
      }
   }

   @Compile
   private void vVvUvVVuuNvV(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cУкажите ник игрока.");
      } else {
         String var2 = var1[1].toLowerCase();
         uNvUVUNvuUVV.NVnVnNnN var3 = uUnuvNvvNU.remove(var2);
         if (var3 == null) {
            vVnvuVVUunuv.UuUVuuUu("§eИгрок не найден в списке друзей.");
         } else {
            this.vNUvnnVnUvu();
            vnnunVnunuN.UuUVuuUu("friendremove", 100.0F, false);
            vVnvuVVUunuv.UuUVuuUu("§cУдалён из друзей: §f" + var2);
         }
      }
   }

   @Compile
   private void uNNnnnuuuN() {
      uUnuvNvvNU.clear();
      this.vNUvnnVnUvu();
      vVnvuVVUunuv.UuUVuuUu("§cСписок друзей очищен.");
   }

   @Compile
   private void nuUnNvnuUu() {
      if (uUnuvNvvNU.isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("§7Список друзей пуст.");
      } else {
         String var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.VVnVNnunVvu();
         vVnvuVVUunuv.UuUVuuUu("§fТвои друзья (§7" + uUnuvNvvNU.size() + "§f):");
         uUnuvNvvNU.values()
            .stream()
            .sorted(Comparator.comparing(var0 -> var0.C00OOC00oO))
            .forEach(
               var1x -> {
                  class_5250 var2 = class_2561.method_43470(" §7- §f" + var1x.UuUVuuUu + " §8[добавлен: " + vVvUvVVuuNvV.format(var1x.C00OOC00oO) + "] ");
                  class_5250 var3 = class_2561.method_43470("§c[Удалить]")
                     .method_27694(
                        var2x -> var2x.method_10958(new class_10610(var1 + "friend remove " + var1x.UuUVuuUu))
                           .method_10949(new class_10613(class_2561.method_43470("§cНажмите, чтобы удалить друга")))
                     );
                  a_.field_1724.method_7353(var2.method_10852(var3), false);
               }
            );
      }
   }

   public static boolean UuUVuuUu(String var0) {
      return var0 == null ? false : uUnuvNvvNU.containsKey(var0.toLowerCase());
   }

   public static List<String> vVvUvVVuuNvV() {
      return uUnuvNvvNU.values().stream().map(var0 -> var0.UuUVuuUu).toList();
   }

   public static void C00OOC00oO(String var0) {
      String var1 = var0.toLowerCase();
      class_310 var2 = class_310.method_1551();
      if (var2.method_1548() != null && var0.equalsIgnoreCase(var2.method_1548().method_1676())) {
         vVnvuVVUunuv.UuUVuuUu("§cНельзя добавить самого себя.");
      } else {
         if (uUnuvNvvNU.containsKey(var1)) {
            uUnuvNvvNU.remove(var1);
            uVUuuVnNVU();
            vnnunVnunuN.UuUVuuUu("friendremove", 100.0F, false);
            vVnvuVVUunuv.UuUVuuUu("§cУдалён из друзей: §f" + var0);
         } else {
            uNvUVUNvuUVV.NVnVnNnN var3 = new uNvUVUNvuUVV.NVnVnNnN(var0, new Date());
            uUnuvNvvNU.put(var1, var3);
            uVUuuVnNVU();
            vnnunVnunuN.UuUVuuUu("friendadd", 100.0F, false);
            vVnvuVVUunuv.UuUVuuUu("§aДобавлен в друзья: §f" + var0 + " §7(" + vVvUvVVuuNvV.format(var3.C00OOC00oO) + ")");
         }
      }
   }

   @Compile
   private void VVuuUN() {
      if (C00OOC00oO.exists()) {
         try (FileReader var1 = new FileReader(C00OOC00oO)) {
            Type var2 = (new TypeToken<Map<String, uNvUVUNvuUVV.NVnVnNnN>>() {}).getType();
            Map var3 = (Map)UuUVuuUu.fromJson(var1, var2);
            uUnuvNvvNU.clear();
            if (var3 != null) {
               uUnuvNvvNU.putAll(var3);
            }
         } catch (IOException var6) {
         }
      }
   }

   @Compile
   private void vNUvnnVnUvu() {
      uVUuuVnNVU();
   }

   @Compile
   private static void uVUuuVnNVU() {
      try {
         if (!C00OOC00oO.getParentFile().exists()) {
            C00OOC00oO.getParentFile().mkdirs();
         }

         try (FileWriter var0 = new FileWriter(C00OOC00oO)) {
            UuUVuuUu.toJson(uUnuvNvvNU, var0);
         }
      } catch (IOException var5) {
      }
   }

   static {
      Loader.initialize();
   }

   static class NVnVnNnN {
      String UuUVuuUu;
      Date C00OOC00oO;

      NVnVnNnN(String var1, Date var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }
   }
}
