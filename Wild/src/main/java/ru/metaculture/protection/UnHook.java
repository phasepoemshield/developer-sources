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
import net.minecraft.client.MinecraftClient;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "UnHook",
   O0000000000 = Category.Misc,
   O000000000 = "Безопасное скрытие клиента возврат Ctrl + Right Shift или напишите свой логин в чат."
)
public class UnHook extends Module {
   public final String O000000000O = System.getProperty("user.home") + "/AppData/Roaming/.tlauncher/legacy/Minecraft/game/";
   private static String O000000000O000 = "1";
   public static boolean O000000000O0 = false;
   public static File O000000000O00;
   private final List<Module> O000000000O00O = new ArrayList<>();

   public UnHook() {
      this.O00000000(new Setting[0]);
   }

   @Override
   public void O00000000() {
      super.O00000000();
      O000000000O0 = true;
      WildClient.O00000000.O000000000(true);
      String var1 = this.O000000000O;
      if (var1 != null && !var1.isEmpty()) {
         O000000000O00 = new File(var1, "resourcepacks");
      }

      this.O000000000O00O.clear();

      for (Module var3 : WildClient.O00000000.O00000000000OO().O000000000()) {
         if (var3 != this && var3.O0000000000000) {
            this.O000000000O00O.add(var3);
            var3.O00000000(false);
         }
      }

      this.O0000000000O00();
      this.O0000000000O0O();
      if (O0000000000.inGameHud != null) {
         String var4 = WildClient.O00000000.O000000000OO();
         O0000000000.inGameHud.getChatHud().getMessageHistory().removeIf(string2 -> string2.startsWith(var4) || string2.startsWith("#"));
      }
   }

   @Override
   public void O000000000() {
      super.O000000000();
      O000000000O0 = false;
      WildClient.O00000000.O00000000000O0 = false;

      for (Module var2 : this.O000000000O00O) {
         if (!var2.O0000000000000) {
            var2.O00000000(true);
         }
      }

      this.O000000000O00O.clear();
   }

   private void O0000000000O00() {
      try {
         Path var1 = MinecraftClient.getInstance().runDirectory.toPath().resolve("logs/latest.log");
         if (!Files.exists(var1)) {
            return;
         }

         String var2 = this.O000000000O;
         Path var3 = Paths.get(var2, "logs");
         Path var4 = var3.resolve("latest.log");
         if (!Files.exists(var3)) {
            Files.createDirectories(var3);
         }

         List var5 = Files.readAllLines(var1, StandardCharsets.UTF_8);
         List var6 = ((List<String>)var5).stream()
            .filter(string -> !string.contains("Wild »"))
            .filter(string -> !string.contains("[Wild]"))
            .filter(string -> !string.contains("[Config]"))
            .filter(string -> !string.contains("[Manager]"))
            .filter(string -> !string.contains("[Baritone]"))
            .filter(string -> !string.contains("baritone"))
            .filter(string -> !string.contains("- wild"))
            .filter(string -> !string.contains("Mod wild"))
            .filter(string -> !string.contains("wild_mixins"))
            .filter(string -> !string.contains("wild:"))
            .filter(string -> !string.contains("wild/"))
            .filter(string -> !string.contains("assets/wild"))
            .filter(string -> !string.contains("org.wild"))
            .filter(string -> !string.contains("org/wild"))
            .filter(string -> !string.contains("[Client]"))
            .filter(string -> !string.contains("[ConfigManager]"))
            .filter(string -> !string.contains("[EventManager]"))
            .filter(string -> !string.contains("[SoundUtil]"))
            .filter(string -> !string.contains("[WildGuard]"))
            .filter(string -> !string.contains("[FingerprintCrypto]"))
            .filter(string -> !string.contains("Wild-"))
            .filter(string -> !string.contains("Logs sanitized"))
            .filter(string -> !string.contains("ScreenRenderDiagnostics"))
            .filter(string -> !string.contains("[ScreenRender]"))
            .filter(string -> !string.contains("Stardust"))
            .filter(string -> !string.contains("Reloading ResourceManager"))
            .filter(string -> !string.contains("black_icons"))
            .collect(Collectors.toList());
         Files.write(var4, var6, StandardCharsets.UTF_8);
         File var7 = var4.toFile();
         long var8 = System.currentTimeMillis();
         var7.setLastModified(var8 - 3600000L);
      } catch (Exception var10) {
         var10.printStackTrace();
      }
   }

   private void O0000000000O0O() {
      try {
         String var1 = MinecraftClient.getInstance().runDirectory.getAbsolutePath().replace("\\", "\\\\");
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
   public static String O0000000000O0() {
      return O000000000O000;
   }
}
