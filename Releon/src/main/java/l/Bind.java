package l;

import fat.releon.Releon;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.stream.Stream;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Bind extends Helper214 {
   private final Helper274 moduleProvider;
   private final Helper241 moduleRepository;

   public Bind(Releon var1) {
      super("bind");
      this.moduleRepository = var1.method17();
      this.moduleProvider = var1.method25();
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      String var3 = var2.method1690() ? var2.method1723().toLowerCase(Locale.US) : "list";
      switch (var3) {
         case "add":
            this.method2988(var2);
            break;
         case "remove":
            this.method2989(var2);
            break;
         case "list":
            this.method2990(var2, var1);
            break;
         case "clear":
            this.method2991(var2);
            break;
         case "set":
            this.method2987(var2);
            break;
         default:
            throw new Exception1("Unknown subcommand: " + var3 + " (use: add/remove/list/clear/set)");
      }
   }

   private void method2987(Helper219 var1) {
      var1.method1738(2);
      String var2 = var1.method1723().toLowerCase(Locale.US);
      if (var2.equals("clickgui")) {
         int var3 = var1.<Entry<String, Integer>, Helper266>method1733(Helper266.INSTANCE).getValue();
         Helper302.method2985(var3);
         this.method906(Formatting.GREEN + "ClickGUI key changed to: " + Formatting.RED + Helper209.method1791(var3).toLowerCase());
      } else {
         throw new Exception1("Unknown bind target: " + var2);
      }
   }

   private void method2988(Helper219 var1) {
      var1.method1738(2);
      String var2 = var1.method1723();
      int var3 = var1.<Entry<String, Integer>, Helper266>method1733(Helper266.INSTANCE).getValue();
      if ("clickgui".equalsIgnoreCase(var2)) {
         Helper302.method2985(var3);
         this.method906(Formatting.GREEN + "ClickGUI bind: " + Formatting.RED + Helper209.method1791(var3).toLowerCase());
      } else {
         Helper242 var4 = this.moduleProvider.method2751(var2);
         var4.setKey(var3);
         this.method906(
            Formatting.GREEN
               + "Module "
               + Formatting.RED
               + var2
               + Formatting.GREEN
               + " bound to "
               + Formatting.RED
               + Helper209.method1791(var3).toLowerCase()
         );
      }
   }

   private void method2989(Helper219 var1) {
      var1.method1739(1);
      String var2 = var1.method1723();
      if ("clickgui".equalsIgnoreCase(var2)) {
         Helper302.method2985(344);
         this.method906(Formatting.GREEN + "ClickGUI bind reset to: " + Formatting.RED + Helper209.method1791(344).toLowerCase());
      } else {
         Helper242 var3 = this.moduleProvider.method2751(var2);
         var3.setKey(-1);
         this.method906(Formatting.GREEN + "Bind removed for module " + Formatting.RED + var2 + Formatting.GREEN + "!");
      }
   }

   private void method2990(Helper219 var1, String var2) {
      var1.method1739(1);
      List<Helper242> var3 = this.moduleRepository.method2314().stream().filter(var0 -> var0.getKey() != -1).toList();
      Helper77.method806(var1, new Helper77<>(var3), () -> this.method906("Module binds:"), var0 -> {
         String var1x = var0.getName();
         String var2x = Helper209.method1791(var0.getKey()).toLowerCase();
         return Text.literal(Formatting.GRAY + "Name: " + Formatting.WHITE + var1x).append(Text.literal(Formatting.GRAY + " Key: " + Formatting.WHITE + var2x));
      }, Helper215.FORCE_COMMAND_PREFIX + var2);
   }

   private void method2991(Helper219 var1) {
      var1.method1739(1);
      this.moduleRepository.method2314().forEach(var0 -> var0.setKey(-1));
      this.method905("All module binds were cleared.", Formatting.GREEN);
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      if (var2.method1694()) {
         return new Helper120().method999().method994("add", "remove", "list", "clear", "set").method1000(var2.method1723()).method1003();
      } else {
         String var3 = var2.method1723();
         if (var3.equalsIgnoreCase("add")) {
            if (var2.method1693(1)) {
               return Stream.concat(var2.method1736(Helper267.INSTANCE), Stream.of("clickgui"));
            }

            if (var2.method1693(2)) {
               return var2.method1736(Helper266.INSTANCE);
            }
         } else if (var3.equalsIgnoreCase("set")) {
            if (var2.method1693(1)) {
               return Stream.of("clickgui").filter(var1x -> {
                  try {
                     return var1x.startsWith(var2.method1723().toLowerCase(Locale.US));
                  } catch (Helper106 var3x) {
                     throw new RuntimeException(var3x);
                  }
               });
            }

            if (var2.method1693(2)) {
               return var2.method1736(Helper266.INSTANCE);
            }
         }

         return Stream.empty();
      }
   }

   @Override
   public String method268() {
      return "Manage key binds for modules and ClickGUI";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "Bind manager for modules and ClickGUI",
         "",
         "Usage:",
         "> bind add <module> <key> - Bind module to key",
         "> bind add clickgui <key> - Bind ClickGUI open key",
         "> bind remove <module> - Remove module bind",
         "> bind remove clickgui - Reset ClickGUI key to right_shift",
         "> bind list - Show active binds",
         "> bind clear - Clear all module binds",
         "> bind set clickgui <key> - Set ClickGUI key"
      );
   }
}
