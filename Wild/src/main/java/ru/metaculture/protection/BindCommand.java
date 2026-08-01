package ru.metaculture.protection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class BindCommand extends Command {
   private static final List<String> O00000000 = List.of("list", "clear", "del", "delete", "remove", "unbind");
   private static final List<String> O000000000 = List.of(
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

   public BindCommand() {
      super("bind", "Управление биндами модулей", ".bind <module> <key> | .bind list | .bind del <module> | .bind clear");
   }

   @Override
   public List<String> O00000000(String[] strings) {
      if (strings.length == 2) {
         String var4 = strings[1].toLowerCase(Locale.ROOT);
         LinkedHashSet var5 = new LinkedHashSet();
         O00000000.stream().filter(string2 -> string2.startsWith(var4)).forEach(var5::add);
         this.O0000000000000().stream().filter(string2 -> string2.toLowerCase(Locale.ROOT).startsWith(var4)).forEach(var5::add);
         return new ArrayList<>(var5);
      } else {
         if (strings.length == 3) {
            String var2 = strings[1].toLowerCase(Locale.ROOT);
            String var3 = strings[2].toLowerCase(Locale.ROOT);
            if (this.O00000000000(var2)) {
               return this.O0000000000000().stream().filter(string2 -> string2.toLowerCase(Locale.ROOT).startsWith(var3)).toList();
            }

            if (!O00000000.contains(var2)) {
               return O000000000.stream().filter(string2 -> string2.toLowerCase(Locale.ROOT).startsWith(var3)).toList();
            }
         }

         return List.of();
      }
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      if (strings.length == 0) {
         ChatUtil.O00000000("§cИспользование: §f" + this.O0000000000());
         return;
      }

      String var2 = strings[0].toLowerCase(Locale.ROOT);
      if (var2.equals("list")) {
         this.O00000000000();
      } else if (var2.equals("clear")) {
         this.O000000000000();
      } else if (this.O00000000000(var2)) {
         this.O00000000000(strings);
      } else {
         this.O0000000000(strings);
      }
   }

   @Compile
   private void O0000000000(String[] strings) {
      if (strings.length != 2) {
         ChatUtil.O00000000("§cИспользование: §f.bind <module> <key>");
         return;
      }

      Module var2 = this.O00000000(strings[0]);
      if (var2 == null) {
         this.O000000000(strings[0]);
         return;
      }

      Integer var3 = this.O0000000000(strings[1]);
      if (var3 == null) {
         ChatUtil.O00000000("§cНеизвестная клавиша: §f" + strings[1]);
         return;
      }

      var2.O000000000000 = var3;
      this.O000000000000O();
      ChatUtil.O00000000(
         var3 == -1
            ? "§aБинд снят с модуля §f" + var2.O00000000000
            : "§aМодуль §f" + var2.O00000000000 + " §aназначен на §f" + this.O00000000(var3)
      );
   }

   @Compile
   private void O00000000000(String[] strings) {
      if (strings.length != 2) {
         ChatUtil.O00000000("§cИспользование: §f.bind del <module>");
         return;
      }

      Module var2 = this.O00000000(strings[1]);
      if (var2 == null) {
         this.O000000000(strings[1]);
         return;
      }

      var2.O000000000000 = -1;
      this.O000000000000O();
      ChatUtil.O00000000("§aБинд снят с модуля §f" + var2.O00000000000);
   }

   @Compile
   private void O00000000000() {
      if (WildClient.O00000000 == null || WildClient.O00000000.O000000000 == null) {
         ChatUtil.O00000000("§7Список биндов пуст.");
         return;
      }

      List<Module> var1 = WildClient.O00000000.O000000000.O000000000().stream()
         .filter(module -> module.O000000000000 != -1)
         .sorted(java.util.Comparator.comparing(module -> module.O00000000000, String.CASE_INSENSITIVE_ORDER))
         .toList();
      if (var1.isEmpty()) {
         ChatUtil.O00000000("§7Список биндов пуст.");
         return;
      }

      ChatUtil.O00000000("§fБинды (§7" + var1.size() + "§f):");
      for (Module var3 : var1) {
         ChatUtil.O00000000("§f" + var3.O00000000000 + " §7— §f" + this.O00000000(var3.O000000000000));
      }
   }

   @Compile
   private void O000000000000() {
      if (WildClient.O00000000 == null || WildClient.O00000000.O000000000 == null) {
         return;
      }

      int var1 = 0;
      for (Module var3 : WildClient.O00000000.O000000000.O000000000()) {
         if (var3.O000000000000 != -1) {
            var3.O000000000000 = -1;
            var1++;
         }
      }
      this.O000000000000O();
      ChatUtil.O00000000("§aСнято биндов: §f" + var1);
   }

   private Module O00000000(String string) {
      String var2 = this.O000000000000(string);
      ArrayList var3 = new ArrayList();

      for (Module var5 : WildClient.O00000000.O000000000.O000000000()) {
         if (var2.equals(this.O000000000000(var5.O00000000000))
            || var2.equals(this.O000000000000(var5.O00000000000OO()))
            || var2.equals(this.O000000000000(var5.getClass().getSimpleName()))) {
            return var5;
         }

         if (this.O000000000000(var5.O00000000000).contains(var2)
            || this.O000000000000(var5.O00000000000OO()).contains(var2)
            || this.O000000000000(var5.getClass().getSimpleName()).contains(var2)) {
            var3.add(var5);
         }
      }

      return var3.size() == 1 ? (Module)var3.get(0) : null;
   }

   private void O000000000(String string) {
      List var2 = this.O0000000000000().stream().filter(string2 -> this.O000000000000(string2).contains(this.O000000000000(string))).limit(8L).toList();
      if (var2.isEmpty()) {
         ChatUtil.O00000000("§cМодуль не найден: §f" + string);
      } else {
         ChatUtil.O00000000("§cНеоднозначный модуль: §f" + string + " §7(" + String.join(", ", var2) + ")");
      }
   }

   private List<String> O0000000000000() {
      return WildClient.O00000000.O000000000 == null
         ? List.of()
         : WildClient.O00000000.O000000000.O000000000().stream().map(module -> module.O00000000000).sorted(String.CASE_INSENSITIVE_ORDER).toList();
   }

   private Integer O0000000000(String string) {
      String var2 = string.trim().toUpperCase(Locale.ROOT).replace("-", "_").replace(" ", "_");
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

         int var6 = O0000O000OO0O0.O00000000(var2.replace("_", ""));
         if (var6 != -1) {
            return var6;
         } else {
            var6 = O0000O000OO0O0.O00000000(var2);
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

   private String O00000000(int i) {
      return O000000O00000O.O00000000().O00000000(i);
   }

   private boolean O00000000000(String string) {
      return string.equals("del") || string.equals("delete") || string.equals("remove") || string.equals("unbind");
   }

   private String O000000000000(String string) {
      return string == null ? "" : string.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9а-яё]", "");
   }

   private void O000000000000O() {
      if (WildClient.O00000000.O0000000000O00 != null) {
         WildClient.O00000000.O0000000000O00.O0000000000();
      }
   }

   static {
      Loader.initialize();
   }
}
