package l;

import fat.releon.Releon;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Config extends Helper214 {
   private static final String EXT = ".rlndlc";
   private final Helper91 fileController;
   private final Helper390 clientInfoProvider;

   protected Config(Releon var1) {
      super("config", "cfg");
      this.fileController = var1.method29();
      this.clientInfoProvider = var1.method31();
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      String var3 = var2.method1690() ? var2.method1723().toLowerCase(Locale.US) : "list";
      switch (var3) {
         case "load":
            var2.method1739(1);
            if (!var2.method1690()) {
               throw new Exception1("Usage: config load <name>");
            }

            this.method2968(var2.method1723());
            return;
         case "save":
            var2.method1739(1);
            if (!var2.method1690()) {
               throw new Exception1("Usage: config save <name>");
            }

            this.method2969(var2.method1723());
            return;
         case "list":
            var2.method1739(0);
            Helper77.method806(var2, new Helper77<>(this.method2971()), () -> this.method906("Configs:"), var0 -> {
               MutableText var1x = Text.literal(var0);
               var1x.setStyle(var1x.getStyle().withColor(Formatting.WHITE));
               return var1x;
            }, Helper215.FORCE_COMMAND_PREFIX + var1);
            return;
         case "dir":
            var2.method1739(0);
            this.method2970();
            return;
         default:
            throw new Exception1("Unknown subcommand: " + var3 + " (use: load/save/list/dir)");
      }
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      if (!var2.method1690()) {
         return new Helper120().method999().method994("load", "save", "list", "dir").method1003();
      } else {
         String var3 = var2.method1723();
         if (var2.method1694()) {
            return new Helper120().method999().method994("load", "save", "list", "dir").method1000(var3).method1003();
         } else if (!"load".equalsIgnoreCase(var3) && !"save".equalsIgnoreCase(var3)) {
            return Stream.empty();
         } else {
            String var4 = var2.method1723();
            return this.method2971().stream().filter(var1x -> var1x.toLowerCase(Locale.US).startsWith(var4.toLowerCase(Locale.US)));
         }
      }
   }

   @Override
   public String method268() {
      return "Manage config presets";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "Load/save/list config presets stored in Custom/.",
         "",
         "Usage:",
         "> config load <name> - Loads preset from Custom/<name>.rlndlc",
         "> config save <name> - Saves preset to Custom/<name>.rlndlc",
         "> config list - Lists presets in Custom/",
         "> config dir - Opens Custom/ folder"
      );
   }

   private File method2965() {
      File var1 = new File(this.clientInfoProvider.method3925(), "Custom");
      var1.mkdirs();
      return var1;
   }

   private Path method2966(String var1) {
      return new File(this.method2965(), var1 + ".rlndlc").toPath();
   }

   private Path method2967(String var1) {
      File var2 = this.clientInfoProvider.method3926();
      var2.mkdirs();
      return new File(var2, var1 + ".rlndlc").toPath();
   }

   private void method2968(String var1) {
      Path var2 = this.method2966(var1);
      if (!Files.exists(var2)) {
         throw new Exception1("Config not found: " + var1);
      } else {
         try {
            Files.copy(var2, this.method2967(var1), StandardCopyOption.REPLACE_EXISTING);
            this.fileController.method899(var1 + ".rlndlc");
            this.method906(String.format("Config %s loaded.", var1));
         } catch (Exception3 var5) {
            String var4 = var5.getCause() != null && var5.getCause().getMessage() != null ? var5.getCause().getMessage() : var5.getMessage();
            this.method905("Load failed: " + var4, Formatting.RED);
         } catch (Exception var6) {
            this.method905("Load failed: " + var6.getMessage(), Formatting.RED);
         }
      }
   }

   private void method2969(String var1) {
      try {
         this.fileController.method898(var1 + ".rlndlc");
         Files.copy(this.method2967(var1), this.method2966(var1), StandardCopyOption.REPLACE_EXISTING);
         this.method906(String.format("Config %s saved.", var1));
      } catch (Exception3 var4) {
         String var3 = var4.getCause() != null && var4.getCause().getMessage() != null ? var4.getCause().getMessage() : var4.getMessage();
         this.method905("Save failed: " + var3, Formatting.RED);
      } catch (Exception var5) {
         this.method905("Save failed: " + var5.getMessage(), Formatting.RED);
      }
   }

   private void method2970() {
      try {
         File var1 = this.method2965();
         Runtime.getRuntime().exec("explorer " + var1.getAbsolutePath());
      } catch (IOException var2) {
         this.method905("Can't open config dir: " + var2.getMessage(), Formatting.RED);
      }
   }

   public List<String> method2971() {
      ArrayList var1 = new ArrayList();
      File[] var2 = this.method2965().listFiles();
      if (var2 != null) {
         for (File var6 : var2) {
            if (var6.isFile() && var6.getName().endsWith(".rlndlc")) {
               String var7 = var6.getName().substring(0, var6.getName().length() - ".rlndlc".length());
               var1.add(var7);
            }
         }
      }

      return var1;
   }
}
