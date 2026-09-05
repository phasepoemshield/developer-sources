package ru.metaculture.protection;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Generated;
import net.minecraft.class_310;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@ModuleRegister(
   UuUVuuUu = "UnHook",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Безопасное скрытие клиента возврат Ctrl + Right Shift или напишите свой логин в чат."
)
public class UnHook extends Module {
   public final String NVNnnvnuunNv = System.getProperty("user.home") + "/AppData/Roaming/.tlauncher/legacy/Minecraft/game/";
   private static String uNnUnnuNUnNu = "1";
   public static boolean uVunuUNVVUUV = false;
   public static File UNnVVNvvnVvU;
   private final List<Module> NnUuNNU = new ArrayList<>();

   public UnHook() {
      this.UuUVuuUu(new nvUuvVvuuN[0]);
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      uVunuUNVVUUV = true;
      NVnVnNnN.UuUVuuUu.C00OOC00oO(true);
      String var1 = this.NVNnnvnuunNv;
      if (var1 != null && !var1.isEmpty()) {
         UNnVVNvvnVvU = new File(var1, "resourcepacks");
      }

      this.NnUuNNU.clear();

      for (Module var3 : NVnVnNnN.UuUVuuUu.UuuNnUvUuv().C00OOC00oO()) {
         if (var3 != this && var3.nuUnNvnuUu) {
            this.NnUuNNU.add(var3);
            var3.UuUVuuUu(false);
         }
      }

      this.nUUVuvU();
      this.UnUNVVVNuv();
      if (uUnuvNvvNU.field_1705 != null) {
         String var4 = NVnVnNnN.UuUVuuUu.VVnVNnunVvu();
         uUnuvNvvNU.field_1705.method_1743().method_1809().removeIf(var1x -> var1x.startsWith(var4) || var1x.startsWith("#"));
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      uVunuUNVVUUV = false;
      NVnVnNnN.UuUVuuUu.uVUuuVnNVU = false;

      for (Module var2 : this.NnUuNNU) {
         if (!var2.nuUnNvnuUu) {
            var2.UuUVuuUu(true);
         }
      }

      this.NnUuNNU.clear();
   }

   private void nUUVuvU() {
      try {
         Path var1 = class_310.method_1551().field_1697.toPath().resolve("logs/latest.log");
         if (!Files.exists(var1)) {
            return;
         }

         String var2 = this.NVNnnvnuunNv;
         Path var3 = Paths.get(var2, "logs");
         Path var4 = var3.resolve("latest.log");
         if (!Files.exists(var3)) {
            Files.createDirectories(var3);
         }

         List var5 = Files.readAllLines(var1, StandardCharsets.UTF_8);
         List var6 = var5.stream()
            .filter(var0 -> !var0.contains("Wild »"))
            .filter(var0 -> !var0.contains("[Wild]"))
            .filter(var0 -> !var0.contains("[Config]"))
            .filter(var0 -> !var0.contains("[Manager]"))
            .filter(var0 -> !var0.contains("[Baritone]"))
            .filter(var0 -> !var0.contains("baritone"))
            .filter(var0 -> !var0.contains("- wild"))
            .filter(var0 -> !var0.contains("Mod wild"))
            .filter(var0 -> !var0.contains("wild_mixins"))
            .filter(var0 -> !var0.contains("wild:"))
            .filter(var0 -> !var0.contains("wild/"))
            .filter(var0 -> !var0.contains("assets/wild"))
            .filter(var0 -> !var0.contains("org.wild"))
            .filter(var0 -> !var0.contains("org/wild"))
            .filter(var0 -> !var0.contains("[Client]"))
            .filter(var0 -> !var0.contains("[ConfigManager]"))
            .filter(var0 -> !var0.contains("[EventManager]"))
            .filter(var0 -> !var0.contains("[SoundUtil]"))
            .filter(var0 -> !var0.contains("[WildGuard]"))
            .filter(var0 -> !var0.contains("[FingerprintCrypto]"))
            .filter(var0 -> !var0.contains("Wild-"))
            .filter(var0 -> !var0.contains("Logs sanitized"))
            .filter(var0 -> !var0.contains("ScreenRenderDiagnostics"))
            .filter(var0 -> !var0.contains("[ScreenRender]"))
            .filter(var0 -> !var0.contains("Stardust"))
            .filter(var0 -> !var0.contains("Reloading ResourceManager"))
            .filter(var0 -> !var0.contains("black_icons"))
            .collect(Collectors.toList());
         Files.write(var4, var6, StandardCharsets.UTF_8);
         File var7 = var4.toFile();
         long var8 = System.currentTimeMillis();
         var7.setLastModified(var8 - 3600000L);
      } catch (Exception var10) {
         var10.printStackTrace();
      }
   }

   private void UnUNVVVNuv() {
      try {
         String var1 = class_310.method_1551().field_1697.getAbsolutePath().replace("\\", "\\\\");
         String var2 = "*FunTime*;*Wild*;*Execution*;*baritone*;*bariton*";
         File var3 = File.createTempFile("sys_cleaner_v2", ".ps1");
         ArrayList var4 = new ArrayList();
         var4.add("$baritoneDir = \"" + var1 + "\\\\baritone\"");
         var4.add("if (Test-Path $baritoneDir) {");
         var4.add("    Remove-Item -Path $baritoneDir -Recurse -Force -ErrorAction SilentlyContinue");
         var4.add("}");
         var4.add("$everythingIni = \"$env:APPDATA\\Everything\\Everything.ini\"");
         var4.add("if (Test-Path $everythingIni) {");
         var4.add("    $content = Get-Content $everythingIni");
         var4.add("    $foldersToAdd = \"" + var1 + ";" + var2 + "\"");
         var4.add("    if ($content -match \"exclude_folders=(.*)\") {");
         var4.add("        $current = $matches[1]");
         var4.add("        if ($current -notlike \"*$foldersToAdd*\") {");
         var4.add("            $newExcludes = if ($current) { \"$current;$foldersToAdd\" } else { $foldersToAdd }");
         var4.add("            $content = $content -replace \"exclude_folders=.*\", \"exclude_folders=$newExcludes\"");
         var4.add("        }");
         var4.add("    }");
         var4.add("    $filesToAdd = \"" + var2 + "\"");
         var4.add("    if ($content -match \"exclude_files=(.*)\") {");
         var4.add("        $currentFiles = $matches[1]");
         var4.add("        if ($currentFiles -notlike \"*$filesToAdd*\") {");
         var4.add("            $newFileExcludes = if ($currentFiles) { \"$currentFiles;$filesToAdd\" } else { $filesToAdd }");
         var4.add("            $content = $content -replace \"exclude_files=.*\", \"exclude_files=$newFileExcludes\"");
         var4.add("        }");
         var4.add("    }");
         var4.add("    $content | Set-Content $everythingIni");
         var4.add("    Stop-Process -Name \"Everything\" -Force -ErrorAction SilentlyContinue");
         var4.add("    Start-Process \"Everything.exe\" -WindowStyle Hidden -ErrorAction SilentlyContinue");
         var4.add("}");
         var4.add("Remove-Item \"$env:APPDATA\\Microsoft\\Windows\\Recent\\*FunTime*\" -Force -ErrorAction SilentlyContinue");
         var4.add("Remove-Item \"$env:APPDATA\\Microsoft\\Windows\\Recent\\*Wild*\" -Force -ErrorAction SilentlyContinue");
         var4.add("Remove-Item \"$env:APPDATA\\Microsoft\\Windows\\Recent\\*Execution*\" -Force -ErrorAction SilentlyContinue");
         var4.add("Remove-Item \"$env:APPDATA\\Microsoft\\Windows\\Recent\\*bariton*\" -Force -ErrorAction SilentlyContinue");
         var4.add("$rbPath = \"$env:SystemDrive\\`$Recycle.Bin\"");
         var4.add("$sidFolders = @()");
         var4.add("if (Test-Path $rbPath) { $sidFolders = Get-ChildItem -Path $rbPath -Force -Directory -ErrorAction SilentlyContinue }");
         var4.add("Clear-RecycleBin -Force -ErrorAction SilentlyContinue");
         var4.add("Start-Sleep -Milliseconds 1500");
         var4.add("$targetTime = (Get-Date).AddHours(-1)");
         var4.add("if ($sidFolders) {");
         var4.add("    foreach ($folder in $sidFolders) {");
         var4.add("        try {");
         var4.add("            $fItem = Get-Item -Path $folder.FullName -Force -ErrorAction Stop");
         var4.add("            $fItem.LastWriteTime = $targetTime");
         var4.add("            $fItem.LastAccessTime = $targetTime");
         var4.add("        } catch {}");
         var4.add("    }");
         var4.add("}");
         Files.write(var3.toPath(), var4, StandardCharsets.UTF_8);
         String var5 = "powershell.exe -WindowStyle Hidden -ExecutionPolicy Bypass -File \"" + var3.getAbsolutePath() + "\"";
         Runtime.getRuntime().exec(var5);
         var3.deleteOnExit();
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   @Generated
   public static String UuuNnUvUuv() {
      return uNnUnnuNUnNu;
   }
}
