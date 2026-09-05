package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.lwjgl.glfw.GLFW;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class NUNnuuv extends UNUuvUN {
   private static final List<String> C00OOC00oO = List.of("add", "remove", "list", "run", "clear", "save", "load");
   private static final List<String> uUnuvNvvNU = List.of(
      "A",
      "B",
      "C",
      "D",
      "E",
      "F",
      "G",
      "H",
      "I",
      "J",
      "K",
      "L",
      "M",
      "N",
      "O",
      "P",
      "Q",
      "R",
      "S",
      "T",
      "U",
      "V",
      "W",
      "X",
      "Y",
      "Z",
      "0",
      "1",
      "2",
      "3",
      "4",
      "5",
      "6",
      "7",
      "8",
      "9",
      "F1",
      "F2",
      "F3",
      "F4",
      "F5",
      "F6",
      "F7",
      "F8",
      "F9",
      "F10",
      "F11",
      "F12",
      "SPACE",
      "ENTER",
      "TAB",
      "INSERT",
      "DELETE",
      "HOME",
      "END",
      "PAGEUP",
      "PAGEDOWN",
      "LEFT",
      "RIGHT",
      "UP",
      "DOWN",
      "LSHIFT",
      "RSHIFT",
      "LCONTROL",
      "RCONTROL",
      "LALT",
      "RALT",
      "MOUSE3",
      "MOUSE4",
      "MOUSE5"
   );
   private static final String vVvUvVVuuNvV = "\\|";
   private static final int uNNnnnuuuN = -100;
   private static final char nuUnNvnuUu = '�';
   private final Gson VVuuUN = new GsonBuilder().setPrettyPrinting().create();
   private final File vNUvnnVnUvu = new File(ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "macros.cfg");
   public static final List<NUNnuuv.NVnVnNnN> UuUVuuUu = new CopyOnWriteArrayList<>();

   public NUNnuuv() {
      super("macro", "Управление макросами", ".macro add <имя> <кнопка> <текст> | .macro list");
      this.UuUVuuUu(true);
   }

   @Override
   public List<String> UuUVuuUu(String[] var1) {
      if (var1.length == 2) {
         String var5 = var1[1].toLowerCase(Locale.ROOT);
         return C00OOC00oO.stream().filter(var1x -> var1x.startsWith(var5)).toList();
      } else if (var1.length == 3) {
         String var4 = var1[1].toLowerCase(Locale.ROOT);
         String var3 = var1[2].toLowerCase(Locale.ROOT);
         return !this.uUnuvNvvNU(var4) && !var4.equals("run") && !var4.equals("exec")
            ? List.of()
            : this.vNUvnnVnUvu().stream().filter(var1x -> var1x.toLowerCase(Locale.ROOT).startsWith(var3)).toList();
      } else if (var1.length == 4 && this.C00OOC00oO(var1[1].toLowerCase(Locale.ROOT))) {
         String var2 = var1[3].toLowerCase(Locale.ROOT);
         return uUnuvNvvNU.stream().filter(var1x -> var1x.toLowerCase(Locale.ROOT).startsWith(var2)).toList();
      } else {
         return List.of();
      }
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      if (var1.length == 0) {
         this.VVuuUN();
      } else {
         String var2 = var1[0].toLowerCase(Locale.ROOT);
         if (this.C00OOC00oO(var2)) {
            this.uUnuvNvvNU(var1);
         } else if (this.uUnuvNvvNU(var2)) {
            this.vVvUvVVuuNvV(var1);
         } else {
            switch (var2) {
               case "run":
               case "exec":
                  this.uNNnnnuuuN(var1);
                  break;
               case "list":
               case "ls":
                  this.vVvUvVVuuNvV();
                  break;
               case "clear":
                  this.uNNnnnuuuN();
                  break;
               case "save":
                  this.nuUnNvnuUu();
                  vVnvuVVUunuv.UuUVuuUu("§aСохранено макросов: §f" + UuUVuuUu.size());
                  break;
               case "load":
               case "reload":
                  this.UuUVuuUu(false);
                  break;
               case "help":
               case "?":
                  this.VVuuUN();
                  break;
               default:
                  vVnvuVVUunuv.UuUVuuUu("§cНеизвестная подкоманда: §f" + var1[0]);
                  this.VVuuUN();
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (var1.nuUnNvnuUu() == 1) {
         this.UuUVuuUu(var1.vVvUvVVuuNvV());
      }
   }

   @Compile
   private void UuUVuuUu(int var1) {
      if (!UuUVuuUu.isEmpty() && this.C00OOC00oO(var1)) {
         if (a_.field_1724 != null && a_.field_1724.field_3944 != null && a_.field_1755 == null) {
            for (NUNnuuv.NVnVnNnN var3 : UuUVuuUu) {
               if (var3 != null && var3.uUnuvNvvNU == var1) {
                  this.UuUVuuUu(var3);
               }
            }
         }
      }
   }

   @Compile
   private void UuUVuuUu(NUNnuuv.NVnVnNnN var1) {
      if (var1 != null && var1.C00OOC00oO != null) {
         if (a_.field_1724 != null && a_.field_1724.field_3944 != null) {
            if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.VVnVNnunVvu() != null) {
               for (String var5 : var1.C00OOC00oO.split("\\|")) {
                  String var6 = var5.trim();
                  if (!var6.isEmpty()) {
                     if (var6.startsWith("/")) {
                        String var7 = var6.substring(1).trim();
                        if (!var7.isEmpty()) {
                           a_.field_1724.field_3944.method_45730(var7);
                        }
                     } else if (var6.isEmpty() || !var6.startsWith(".")) {
                        a_.field_1724.field_3944.method_45729(var6);
                     } else if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.UvUvUNuvNU() != null) {
                        ru.metaculture.protection.NVnVnNnN.UuUVuuUu.UvUvUNuvNU().UuUVuuUu(var6);
                     }
                  }
               }
            }
         }
      }
   }

   @Compile
   private void uUnuvNvvNU(String[] var1) {
      if (var1.length < 4) {
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: §f.macro add <имя> <кнопка> <текст>");
         vVnvuVVUunuv.UuUVuuUu("§7Пример: §f.macro add spawn G /spawn");
      } else {
         String var2 = var1[1];
         Integer var3 = this.vVvUvVVuuNvV(var1[2]);
         byte var4;
         int var5;
         if (var3 != null) {
            var4 = 3;
            var5 = var1.length;
         } else {
            var3 = this.vVvUvVVuuNvV(var1[var1.length - 1]);
            if (var3 == null) {
               vVnvuVVUunuv.UuUVuuUu("§cНеизвестная кнопка: §f" + var1[2] + " §7(и §f" + var1[var1.length - 1] + "§7)");
               vVnvuVVUunuv.UuUVuuUu("§7Формат: §f.macro add <имя> <кнопка> <текст>");
               return;
            }

            var4 = 2;
            var5 = var1.length - 1;
         }

         String var6 = this.UuUVuuUu(var1, var4, var5);
         if (var6.isEmpty()) {
            vVnvuVVUunuv.UuUVuuUu("§cПустой текст макроса.");
         } else {
            NUNnuuv.NVnVnNnN var7 = this.UuUVuuUu(var2);
            boolean var8 = var7 != null;
            if (var8) {
               UuUVuuUu.remove(var7);
            }

            NUNnuuv.NVnVnNnN var9 = new NUNnuuv.NVnVnNnN(var2, var3, var6);
            UuUVuuUu.add(var9);
            this.nuUnNvnuUu();
            String var10 = VnVvnNNuVuUu.UuUVuuUu().UuUVuuUu(var3);
            if (var8) {
               vVnvuVVUunuv.UuUVuuUu("§eМакрос §f" + var2 + " §eперезаписан: §b" + var6 + " §8[§e" + var10 + "§8]");
            } else {
               vVnvuVVUunuv.UuUVuuUu("§aМакрос §f" + var2 + " §aна §e" + var10 + "§a: §b" + var6);
            }

            long var11 = 0L;

            for (NUNnuuv.NVnVnNnN var14 : UuUVuuUu) {
               if (var14.uUnuvNvvNU == var9.uUnuvNvvNU) {
                  var11++;
               }
            }

            if (var11 > 1L) {
               vVnvuVVUunuv.UuUVuuUu("§7На этой кнопке уже §f" + var11 + " §7макроса, сработают все.");
            }
         }
      }
   }

   @Compile
   private void vVvUvVVuuNvV(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: §f.macro remove <имя>");
      } else {
         NUNnuuv.NVnVnNnN var2 = this.UuUVuuUu(var1[1]);
         if (var2 == null) {
            vVnvuVVUunuv.UuUVuuUu("§cМакрос не найден: §f" + var1[1]);
         } else {
            UuUVuuUu.remove(var2);
            this.nuUnNvnuUu();
            vVnvuVVUunuv.UuUVuuUu("§aМакрос §f" + var2.UuUVuuUu + " §aудалён.");
         }
      }
   }

   @Compile
   private void uNNnnnuuuN(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: §f.macro run <имя>");
      } else {
         NUNnuuv.NVnVnNnN var2 = this.UuUVuuUu(var1[1]);
         if (var2 == null) {
            vVnvuVVUunuv.UuUVuuUu("§cМакрос не найден: §f" + var1[1]);
         } else if (a_.field_1724 != null && a_.field_1724.field_3944 != null) {
            this.UuUVuuUu(var2);
         } else {
            vVnvuVVUunuv.UuUVuuUu("§cНужно быть на сервере.");
         }
      }
   }

   @Compile
   private void vVvUvVVuuNvV() {
      if (UuUVuuUu.isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("§7Список макросов пуст. §f.macro add <имя> <кнопка> <текст>");
      } else {
         vVnvuVVUunuv.UuUVuuUu("§fМакросы (§7" + UuUVuuUu.size() + "§f):");

         for (NUNnuuv.NVnVnNnN var2 : UuUVuuUu) {
            String var3 = VnVvnNNuVuUu.UuUVuuUu().UuUVuuUu(var2.uUnuvNvvNU);
            vVnvuVVUunuv.UuUVuuUu("§7- §f" + var2.UuUVuuUu + " §8[§e" + var3 + "§8] §7» §b" + var2.C00OOC00oO);
         }
      }
   }

   @Compile
   private void uNNnnnuuuN() {
      int var1 = UuUVuuUu.size();
      UuUVuuUu.clear();
      this.nuUnNvnuUu();
      vVnvuVVUunuv.UuUVuuUu("§cУдалено макросов: §f" + var1);
   }

   @Compile
   public void UuUVuuUu(boolean var1) {
      if (!this.vNUvnnVnUvu.exists()) {
         if (!var1) {
            vVnvuVVUunuv.UuUVuuUu("§7Файл макросов не найден, список пуст.");
         }
      } else {
         try {
            List var2 = this.UuUVuuUu(StandardCharsets.UTF_8);
            if (var2 == null) {
               var2 = this.UuUVuuUu(Charset.defaultCharset());
            }

            if (var2 == null) {
               return;
            }

            ArrayList var3 = new ArrayList();

            for (NUNnuuv.NVnVnNnN var5 : var2) {
               if (var5 != null
                  && var5.UuUVuuUu != null
                  && !var5.UuUVuuUu.isBlank()
                  && var5.C00OOC00oO != null
                  && !var5.C00OOC00oO.isBlank()
                  && this.C00OOC00oO(var5.uUnuvNvvNU)) {
                  var3.add(var5);
               }
            }

            UuUVuuUu.clear();
            UuUVuuUu.addAll(var3);
            if (!var1) {
               vVnvuVVUunuv.UuUVuuUu("§aЗагружено макросов: §f" + UuUVuuUu.size());
            }
         } catch (Exception var6) {
            vVnvuVVUunuv.UuUVuuUu("§cНе удалось прочитать macros.cfg.");
         }
      }
   }

   @Compile
   private List<NUNnuuv.NVnVnNnN> UuUVuuUu(Charset var1) {
      byte[] var2 = Files.readAllBytes(this.vNUvnnVnUvu.toPath());
      String var3 = new String(var2, var1);
      if (StandardCharsets.UTF_8.equals(var1) && var3.indexOf(65533) >= 0) {
         return null;
      } else {
         Type var4 = (new TypeToken<List<NUNnuuv.NVnVnNnN>>() {}).getType();
         return (List<NUNnuuv.NVnVnNnN>)this.VVuuUN.fromJson(var3, var4);
      }
   }

   @Compile
   private void nuUnNvnuUu() {
      try {
         File var1 = this.vNUvnnVnUvu.getParentFile();
         if (var1 != null && !var1.exists()) {
            var1.mkdirs();
         }

         try (OutputStreamWriter var2 = new OutputStreamWriter(new FileOutputStream(this.vNUvnnVnUvu), StandardCharsets.UTF_8)) {
            this.VVuuUN.toJson(new ArrayList<>(UuUVuuUu), var2);
         }
      } catch (Exception var7) {
         vVnvuVVUunuv.UuUVuuUu("§cНе удалось сохранить макросы: §f" + var7.getMessage());
      }
   }

   private void VVuuUN() {
      vVnvuVVUunuv.UuUVuuUu("§f.macro add <имя> <кнопка> <текст> §7- создать или перезаписать");
      vVnvuVVUunuv.UuUVuuUu("§f.macro remove <имя> §7| §f.macro list §7| §f.macro run <имя> §7| §f.macro clear §7| §f.macro load");
      vVnvuVVUunuv.UuUVuuUu(
         "§7Текст с §f/ §7уходит командой на сервер, с §f"
            + (ru.metaculture.protection.NVnVnNnN.UuUVuuUu == null ? "." : ru.metaculture.protection.NVnVnNnN.UuUVuuUu.VVnVNnunVvu())
            + " §7- клиентской командой."
      );
      vVnvuVVUunuv.UuUVuuUu("§7Несколько действий: §f.macro add kit G /kit tools | /home base");
   }

   private NUNnuuv.NVnVnNnN UuUVuuUu(String var1) {
      if (var1 == null) {
         return null;
      } else {
         for (NUNnuuv.NVnVnNnN var3 : UuUVuuUu) {
            if (var3 != null && var3.UuUVuuUu != null && var3.UuUVuuUu.equalsIgnoreCase(var1)) {
               return var3;
            }
         }

         return null;
      }
   }

   private List<String> vNUvnnVnUvu() {
      return UuUVuuUu.stream().filter(var0 -> var0 != null && var0.UuUVuuUu != null).map(var0 -> var0.UuUVuuUu).toList();
   }

   private String UuUVuuUu(String[] var1, int var2, int var3) {
      StringBuilder var4 = new StringBuilder();

      for (int var5 = var2; var5 < var3; var5++) {
         if (var4.length() > 0) {
            var4.append(' ');
         }

         var4.append(var1[var5]);
      }

      return var4.toString().trim();
   }

   private boolean C00OOC00oO(String var1) {
      return var1.equals("add") || var1.equals("set") || var1.equals("create");
   }

   private boolean uUnuvNvvNU(String var1) {
      return var1.equals("remove") || var1.equals("del") || var1.equals("delete") || var1.equals("rem");
   }

   private boolean C00OOC00oO(int var1) {
      return var1 > 0 || var1 <= -100;
   }

   private Integer vVvUvVVuuNvV(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim().toUpperCase(Locale.ROOT).replace('-', '_').replace(' ', '_');
         if (var2.startsWith("GLFW_KEY_")) {
            var2 = var2.substring("GLFW_KEY_".length());
         } else if (var2.startsWith("KEY_")) {
            var2 = var2.substring("KEY_".length());
         }

         if (var2.equals("LMB") || var2.equals("MOUSELEFT") || var2.equals("MOUSE_LEFT")) {
            return -100;
         } else if (var2.equals("RMB") || var2.equals("MOUSERIGHT") || var2.equals("MOUSE_RIGHT")) {
            return -101;
         } else if (!var2.equals("MMB") && !var2.equals("MOUSEMIDDLE") && !var2.equals("MOUSE_MIDDLE")) {
            if (var2.matches("MOUSE_?\\d+")) {
               int var3 = Integer.parseInt(var2.replace("MOUSE", "").replace("_", ""));
               if (var3 >= 1 && var3 <= 16) {
                  return -100 - (var3 - 1);
               }
            }

            int var7 = UuNVnuUvunN.UuUVuuUu(var2.replace("_", ""));
            if (var7 != -1) {
               return var7;
            } else {
               var7 = UuNVnuUvunN.UuUVuuUu(var2);
               if (var7 != -1) {
                  return var7;
               } else {
                  try {
                     Field var4 = GLFW.class.getField("GLFW_KEY_" + var2);
                     int var5 = var4.getInt(null);
                     return var5 > 0 ? var5 : null;
                  } catch (ReflectiveOperationException var6) {
                     return null;
                  }
               }
            }
         } else {
            return -102;
         }
      } else {
         return null;
      }
   }

   static {
      Loader.initialize();
   }

   public static class NVnVnNnN {
      public String UuUVuuUu;
      public String C00OOC00oO;
      public int uUnuvNvvNU;

      public NVnVnNnN(String var1, int var2, String var3) {
         this.UuUVuuUu = var1;
         this.uUnuvNvvNU = var2;
         this.C00OOC00oO = var3;
      }
   }
}
