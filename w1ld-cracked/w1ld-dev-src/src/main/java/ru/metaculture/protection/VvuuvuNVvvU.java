package ru.metaculture.protection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class VvuuvuNVvvU extends UNUuvUN {
   private static final List<String> UuUVuuUu = List.of("list", "clear", "del", "delete", "remove", "unbind");
   private static final List<String> C00OOC00oO = List.of(
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
      "ESCAPE",
      "BACKSPACE",
      "DELETE",
      "INSERT",
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
      "MOUSE1",
      "MOUSE2",
      "MOUSE3",
      "MOUSE4",
      "MOUSE5",
      "WHEEL_UP",
      "WHEEL_DOWN",
      "NONE"
   );

   public VvuuvuNVvvU() {
      super("bind", "Управление биндами модулей", ".bind <module> <key> | .bind list | .bind del <module> | .bind clear");
   }

   @Override
   public List<String> UuUVuuUu(String[] var1) {
      if (var1.length == 2) {
         String var4 = var1[1].toLowerCase(Locale.ROOT);
         LinkedHashSet var5 = new LinkedHashSet();
         UuUVuuUu.stream().filter(var1x -> var1x.startsWith(var4)).forEach(var5::add);
         this.nuUnNvnuUu().stream().filter(var1x -> var1x.toLowerCase(Locale.ROOT).startsWith(var4)).forEach(var5::add);
         return new ArrayList<>(var5);
      } else {
         if (var1.length == 3) {
            String var2 = var1[1].toLowerCase(Locale.ROOT);
            String var3 = var1[2].toLowerCase(Locale.ROOT);
            if (this.vVvUvVVuuNvV(var2)) {
               return this.nuUnNvnuUu().stream().filter(var1x -> var1x.toLowerCase(Locale.ROOT).startsWith(var3)).toList();
            }

            if (!UuUVuuUu.contains(var2)) {
               return C00OOC00oO.stream().filter(var1x -> var1x.toLowerCase(Locale.ROOT).startsWith(var3)).toList();
            }
         }

         return List.of();
      }
   }

   @Compile
   @Override
   public void C00OOC00oO(String[] var1) {
      uVvnVvvUVUv var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO;
      if (var2 == null) {
         vVnvuVVUunuv.UuUVuuUu("§cМенеджер модулей не инициализирован.");
      } else if (var1.length == 0) {
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: " + this.UuUVuuUu());
      } else {
         String var3 = var1[0].toLowerCase(Locale.ROOT);
         switch (var3) {
            case "list":
               this.uNNnnnuuuN();
               break;
            case "clear":
               this.vVvUvVVuuNvV();
               break;
            case "del":
            case "delete":
            case "remove":
            case "unbind":
               this.vVvUvVVuuNvV(var1);
               break;
            default:
               this.uUnuvNvvNU(var1);
         }
      }
   }

   @Compile
   private void uUnuvNvvNU(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: .bind <module> <key>");
      } else {
         Module var2 = this.UuUVuuUu(var1[0]);
         if (var2 == null) {
            this.C00OOC00oO(var1[0]);
         } else {
            Integer var3 = this.uUnuvNvvNU(var1[1]);
            if (var3 == null) {
               vVnvuVVUunuv.UuUVuuUu("§cНеизвестная клавиша: §f" + var1[1]);
            } else {
               VnVvnNNuVuUu var4 = VnVvnNNuVuUu.UuUVuuUu();
               int var5 = var3;
               vvVUVuVvnnVN var6 = vvVUVuVvnnVN.TOGGLE;
               if (var4 != null) {
                  var4.UuUVuuUu(var2, var5, var6);
               }

               this.VVuuUN();
               vVnvuVVUunuv.UuUVuuUu("§aБинд установлен: §f" + var2.vVvUvVVuuNvV + " §7-> §f" + this.UuUVuuUu(var3));
            }
         }
      }
   }

   @Compile
   private void vVvUvVVuuNvV(String[] var1) {
      if (var1.length < 2) {
         vVnvuVVUunuv.UuUVuuUu("§cИспользование: .bind del <module>");
      } else {
         Module var2 = this.UuUVuuUu(var1[1]);
         if (var2 == null) {
            this.C00OOC00oO(var1[1]);
         } else {
            VnVvnNNuVuUu var3 = VnVvnNNuVuUu.UuUVuuUu();
            vvVUVuVvnnVN var4 = vvVUVuVvnnVN.TOGGLE;
            var3.UuUVuuUu(var2, -1, var4);
            this.VVuuUN();
            vVnvuVVUunuv.UuUVuuUu("§aБинд удален: §f" + var2.vVvUvVVuuNvV);
         }
      }
   }

   @Compile
   private void vVvUvVVuuNvV() {
      int var1 = 0;
      uVvnVvvUVUv var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO;
      if (var2 != null) {
         ArrayList var3 = var2.C00OOC00oO();
         if (var3 != null) {
            Iterator var4 = var3.iterator();
            if (var4 != null) {
               while (var4.hasNext()) {
                  Module var5 = (Module)var4.next();
                  if (var5.uNNnnnuuuN != -1) {
                     var5.uNNnnnuuuN = -1;
                     var1++;
                  }
               }
            }
         }
      }

      this.VVuuUN();
      vVnvuVVUunuv.UuUVuuUu("§aОчищено биндов модулей: §f" + var1);
   }

   @Compile
   private void uNNnnnuuuN() {
      uVvnVvvUVUv var1 = NVnVnNnN.UuUVuuUu.C00OOC00oO;
      ArrayList var2 = var1 == null ? null : var1.C00OOC00oO();
      Stream var3 = var2 == null ? null : var2.stream();
      Predicate var4 = var0 -> var0.uNNnnnuuuN != -1;
      Stream var5 = var3 == null ? null : var3.filter(var4);
      Function var6 = var0 -> var0.vVvUvVVuuNvV.toLowerCase(Locale.ROOT);
      Comparator var7 = Comparator.comparing(var6);
      Stream var8 = var5 == null ? null : var5.sorted(var7);
      List var9 = var8 == null ? null : var8.toList();
      if (var9 != null && var9.isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("§7Биндов модулей нет.");
      } else {
         int var10 = var9 == null ? 0 : var9.size();
         vVnvuVVUunuv.UuUVuuUu("§fБинды модулей (§7" + var10 + "§f):");
         if (var9 != null) {
            for (Module var12 : var9) {
               String var13 = var12.vVvUvVVuuNvV;
               int var14 = var12.uNNnnnuuuN;
               String var15 = this.UuUVuuUu(var14);
               vVnvuVVUunuv.UuUVuuUu("§7- §f" + var13 + " §8[§e" + var15 + "§8]");
            }
         }
      }
   }

   private Module UuUVuuUu(String var1) {
      String var2 = this.uNNnnnuuuN(var1);
      ArrayList var3 = new ArrayList();

      for (Module var5 : NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO()) {
         if (var2.equals(this.uNNnnnuuuN(var5.vVvUvVVuuNvV))
            || var2.equals(this.uNNnnnuuuN(var5.vuuuNvNuv()))
            || var2.equals(this.uNNnnnuuuN(var5.getClass().getSimpleName()))) {
            return var5;
         }

         if (this.uNNnnnuuuN(var5.vVvUvVVuuNvV).contains(var2)
            || this.uNNnnnuuuN(var5.vuuuNvNuv()).contains(var2)
            || this.uNNnnnuuuN(var5.getClass().getSimpleName()).contains(var2)) {
            var3.add(var5);
         }
      }

      return var3.size() == 1 ? (Module)var3.get(0) : null;
   }

   private void C00OOC00oO(String var1) {
      List var2 = this.nuUnNvnuUu().stream().filter(var2x -> this.uNNnnnuuuN(var2x).contains(this.uNNnnnuuuN(var1))).limit(8L).toList();
      if (var2.isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("§cМодуль не найден: §f" + var1);
      } else {
         vVnvuVVUunuv.UuUVuuUu("§cНеоднозначный модуль: §f" + var1 + " §7(" + String.join(", ", var2) + ")");
      }
   }

   private List<String> nuUnNvnuUu() {
      return NVnVnNnN.UuUVuuUu.C00OOC00oO == null
         ? List.of()
         : NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO().stream().map(var0 -> var0.vVvUvVVuuNvV).sorted(String.CASE_INSENSITIVE_ORDER).toList();
   }

   private Integer uUnuvNvvNU(String var1) {
      String var2 = var1.trim().toUpperCase(Locale.ROOT).replace("-", "_").replace(" ", "_");
      if (var2.equals("NONE") || var2.equals("NULL") || var2.equals("UNBOUND") || var2.equals("CLEAR")) {
         return -1;
      } else if (var2.equals("WHEELUP") || var2.equals("WHEEL_UP") || var2.equals("MWHEELUP")) {
         return -200;
      } else if (var2.equals("WHEELDOWN") || var2.equals("WHEEL_DOWN") || var2.equals("MWHEELDOWN")) {
         return -201;
      } else if (var2.equals("LMB") || var2.equals("MOUSELEFT") || var2.equals("MOUSE_LEFT")) {
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

         int var6 = UuNVnuUvunN.UuUVuuUu(var2.replace("_", ""));
         if (var6 != -1) {
            return var6;
         } else {
            var6 = UuNVnuUvunN.UuUVuuUu(var2);
            if (var6 != -1) {
               return var6;
            } else {
               try {
                  Field var4 = GLFW.class.getField("GLFW_KEY_" + var2);
                  return var4.getInt(null);
               } catch (ReflectiveOperationException var5) {
                  return null;
               }
            }
         }
      } else {
         return -102;
      }
   }

   private String UuUVuuUu(int var1) {
      return VnVvnNNuVuUu.UuUVuuUu().UuUVuuUu(var1);
   }

   private boolean vVvUvVVuuNvV(String var1) {
      return var1.equals("del") || var1.equals("delete") || var1.equals("remove") || var1.equals("unbind");
   }

   private String uNNnnnuuuN(String var1) {
      return var1 == null ? "" : var1.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9а-яё]", "");
   }

   private void VVuuUN() {
      if (NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
         NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
      }
   }

   static {
      Loader.initialize();
   }
}
