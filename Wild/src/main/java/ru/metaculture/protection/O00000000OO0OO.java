package ru.metaculture.protection;

import com.mojang.logging.LogUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Util;
import org.slf4j.Logger;

public final class O00000000OO0OO {
   private static final O00000000OO0OO O00000000 = new O00000000OO0OO();
   private static final long O000000000 = 2400000000L;
   private static final long O0000000000 = 250000000L;
   private static final long O00000000000 = 100000000L;
   private static final int O000000000000 = 65536;
   private static final Logger O0000000000000 = LogUtils.getLogger();
   private final O00000000OO O000000000000O = new O00000000OO();
   private final O00000000OOO0O O00000000000O = new O00000000OOO0O();
   private final O00000000O0OOO O00000000000O0 = new O00000000O0OOO();
   private final O00000000OOO00 O00000000000OO = new O00000000OOO00();
   private long O0000000000O;
   private long O0000000000O0;
   private long O0000000000O00;
   private long O0000000000O0O = -1L;
   private long O0000000000OO = -1L;
   private boolean O0000000000OO0;
   private boolean O0000000000OOO;
   private boolean O000000000O;
   private boolean O000000000O0;
   private boolean O000000000O00;
   private boolean O000000000O000;
   private long O000000000O00O;
   private int O000000000O0O;
   private int O000000000O0O0;
   private int O000000000O0OO;
   private String O000000000OO = "0x0000000000000000";
   private String O000000000OO0 = "none";
   private String O000000000OO00 = "none";
   private String O000000000OO0O = "GL clean";
   private String O000000000OOO = "Matrix finite";
   private String O000000000OOO0 = "ожидание";
   private String O000000000OOOO = "ожидание  none";
   private String O00000000O = "none";
   private String O00000000O0 = "none";
   private String O00000000O00 = "Ожидание";
   private String O00000000O000 = "Inject HEAD/TAIL";
   private String O00000000O0000 = "Local encrypted";
   private String O00000000O000O = "none";
   private String O00000000O00O = "none";
   private String O00000000O00O0 = "none";
   private String O00000000O00OO = "0";
   private String O00000000O0O = "latest.log";
   private String O00000000O0O0 = "latest.log";
   private final String[] O00000000O0O00 = new String[96];
   private final int[] O00000000O0O0O = new int[96];
   private String O00000000O0OO = "0";
   private String O00000000O0OO0 = "0";
   private int O00000000O0OOO;
   private int O00000000OO;
   private boolean O00000000OO0;

   private O00000000OO0OO() {
      this.O00000000000O.O00000000(this.O000000000000O);
      this.O000000000O0O();
   }

   public static O00000000OO0OO O00000000() {
      return O00000000;
   }

   public void O000000000() {
      if (this.O0000000000OO0) {
         this.O000000000(8193, 257);
      }

      this.O0000000000OO0 = true;
      this.O000000000(257);
   }

   public void O0000000000() {
      if (!this.O0000000000OO0) {
         this.O000000000(8193, 258);
      }

      this.O000000000(258);
      this.O0000000000OO0 = false;
      this.O000000000O000();
   }

   public void O00000000000() {
      this.O0000000000O++;
      if (this.O0000000000OOO) {
         this.O000000000(8193, 513);
      }

      this.O0000000000OOO = true;
      this.O000000000(513);
      boolean var1 = O00000000OO00.O00000000(this.O000000000000O);
      if (!var1) {
         this.O000000000(12289, 513);
      }
   }

   public void O000000000000() {
      if (!this.O0000000000OOO) {
         this.O000000000(8193, 514);
      }

      this.O000000000(514);
      this.O0000000000OOO = false;
      int var1 = ru.metaculture.protection.O00000000OO0.O00000000000();
      if (var1 != 0) {
         this.O0000000000(var1);
      }
   }

   public void O0000000000000() {
      if (this.O000000000O) {
         this.O000000000(8193, 769);
      }

      this.O000000000O = true;
      this.O000000000(769);
   }

   public void O000000000000O() {
      if (!this.O000000000O) {
         this.O000000000(8193, 770);
      }

      this.O000000000(770);
      this.O000000000O = false;
   }

   public void O00000000(int i, int j) {
      if (this.O000000000O0) {
         this.O000000000(8193, 1025);
      }

      this.O000000000O0 = true;
      this.O000000000(1025);
      this.O000000000000O.O00000000(i);
      this.O000000000000O.O00000000(j);
   }

   public void O00000000000O() {
      if (!this.O000000000O0) {
         this.O000000000(8193, 1026);
      }

      this.O000000000(1026);
      this.O000000000O0 = false;
   }

   public void O00000000000O0() {
      if (this.O000000000O00) {
         this.O000000000(8193, 1281);
      }

      this.O000000000O00 = true;
      this.O000000000(1281);
   }

   public void O00000000(int i, int j, int k) {
      this.O000000000(1282);
      this.O000000000O00 = false;
      int var4 = ru.metaculture.protection.O00000000OO0.O00000000();
      int var5 = ru.metaculture.protection.O00000000OO0.O000000000();
      int var6 = ru.metaculture.protection.O00000000OO0.O0000000000();
      if (i != var4 || j != var5 || k != var6) {
         this.O000000000(4098, var4 ^ var5 ^ var6);
      }
   }

   public void O00000000(O00000000OO00O o00000000OO00O) {
      if (o00000000OO00O != null) {
         this.O000000000000O.O00000000(o00000000OO00O.O00000000());
         o00000000OO00O.O00000000(this.O00000000000O);
      }
   }

   public void O00000000000OO() {
      long var1 = System.nanoTime();
      int var3 = (int)(this.O000000000000O.O00000000() ^ var1 >>> 13 ^ 20481L);
      this.O000000000OO0 = this.O00000000(var3);
      this.O000000000OO00 = O00000000OO0O.O00000000(20481);
      this.O000000000O000 = true;
      this.O000000000O0O = var3;
      this.O000000000O0O0 = 20481;
      this.O000000000O0OO = 0;
      this.O000000000O00O = var1;
      this.O000000000OOO0 = "ожидает";
      this.O00000000O00 = "Ручной слепок";
      this.O000000000OOOO = "pending  " + this.O000000000OO0;
      O0000000000000.info("[WildCore] tracker={} code={} snapshot=pending", this.O000000000OO0, this.O000000000OO00);
   }

   public void O0000000000O() {
      try {
         Path var1 = this.O00000000000OO.O00000000();
         Util.getOperatingSystem().open(var1.toFile());
      } catch (Throwable var2) {
         this.O000000000OOO0 = "папка недоступна";
         this.O00000000O00 = "Open folder failed";
         O0000000000000.warn("[WildCore] tracker={} code=OPEN_FOLDER_FAILED", this.O000000000OO0);
      }
   }

   public void O0000000000O0() {
      try {
         Path var1 = this.O000000000O00O();
         Files.createDirectories(var1);
         Util.getOperatingSystem().open(var1.toFile());
         this.O00000000O0O = "логи открыты";
      } catch (Throwable var2) {
         this.O00000000O0O = "ошибка открытия";
         O0000000000000.warn("[WildCore] tracker={} code=OPEN_LOGS_FAILED", this.O000000000OO0);
      }
   }

   public void O0000000000O00() {
      this.O00000000OO0 = true;
      this.O0000000000O00 = 0L;
      this.O0000000000OO0();
   }

   public void O0000000000O0O() {
      this.O00000000OO0 = !this.O00000000OO0;
      if (this.O00000000OO0) {
         this.O0000000000O00 = 0L;
         this.O0000000000OO0();
      }
   }

   public void O0000000000OO() {
      this.O00000000OO0 = false;
   }

   public void O0000000000OO0() {
      Path var1 = this.O000000000O00O().resolve("latest.log");
      this.O00000000O0O0 = "latest.log";
      this.O000000000O0O();
      if (!Files.exists(var1)) {
         this.O0000000000O0O = -1L;
         this.O0000000000OO = -1L;
         this.O00000000O0O = "latest.log not found";
         this.O0000000000("WARN latest.log not found", 2);
      } else {
         try (RandomAccessFile var2 = new RandomAccessFile(var1.toFile(), "r")) {
            long var3 = var2.length();
            this.O0000000000O0O = var3;
            this.O0000000000OO = Files.getLastModifiedTime(var1).toMillis();
            int var5 = (int)Math.min(65536L, var3);
            byte[] var6 = new byte[var5];
            var2.seek(Math.max(0L, var3 - var5));
            var2.readFully(var6);
            this.O00000000(new String(var6, StandardCharsets.UTF_8));
            this.O00000000O0O = "loaded " + this.O00000000OO;
         } catch (Throwable var9) {
            this.O00000000O0O = "read failed";
            this.O0000000000("ERROR " + var9.getClass().getSimpleName(), 3);
            O0000000000000.warn("[WildCore] tracker={} code=READ_LOG_FAILED", this.O000000000OO0);
         }
      }
   }

   public boolean O0000000000OOO() {
      return this.O00000000OO0;
   }

   public void O00000000(String string, Throwable throwable) {
      this.O00000000O0OOO++;
      this.O00000000O000O = O000000000(string, 96);
      this.O00000000O00O = throwable == null ? "unknown" : O000000000(throwable.getClass().getName(), 96);
      this.O00000000O00O0 = throwable == null ? "no throwable" : O000000000(throwable.getMessage(), 160);
      this.O00000000O00OO = Integer.toString(this.O00000000O0OOO);
      this.O00000000O0O = "shader exception";
      this.O0000000000(ShaderDiagnostics.O00000000(this.O00000000O000O, this.O00000000O0OOO), 3);
      int var3 = 0;
      Throwable var4 = throwable;
      if (throwable == null) {
         this.O0000000000("cause[0]=unknown", 3);
         this.O0000000000("message=no throwable", 3);
      }

      for (int var5 = 0; var4 != null && var5 < 3; var5++) {
         this.O0000000000(ShaderDiagnostics.O00000000(var5, var4), 3);
         this.O0000000000(ShaderDiagnostics.O00000000(var4), 3);
         String var6 = ShaderDiagnostics.O000000000(var4);
         if (!"none".equals(var6)) {
            this.O0000000000(var6, 4);
         }

         StackTraceElement[] var7 = var4.getStackTrace();

         for (int var8 = 0; var8 < var7.length && var3 < 14; var8++) {
            this.O0000000000(ShaderDiagnostics.O00000000(var7[var8]), 3);
            var3++;
         }

         var4 = var4.getCause();
      }

      this.O000000000(24577, this.O00000000O00O0.hashCode());
      O0000000000000.error(
         "[WildCore] tracker={} shaderStage={} exception={}", new Object[]{this.O000000000OO0, this.O00000000O000O, this.O00000000O00O, throwable}
      );
   }

   public void O00000000(String string, int i) {
      if (i != 0) {
         this.O000000000(4097, i);
         this.O000000000OO0O = ru.metaculture.protection.O00000000OO0.O00000000(i);
         this.O00000000O0O = "OpenGL error";
         this.O0000000000(ShaderDiagnostics.O000000000(string, i), 4);
         this.O0000000000(ShaderDiagnostics.O00000000(), 4);
      }
   }

   public void O000000000(String string, Throwable throwable) {
      this.O00000000(string, throwable);
      if (throwable instanceof Error var4) {
         throw var4;
      } else if (throwable instanceof RuntimeException var3) {
         throw var3;
      } else {
         throw new IllegalStateException("WildCore shader failure at " + this.O00000000O000O, throwable);
      }
   }

   public void O00000000(O00000000OOO o00000000OOO) {
      if (o00000000OOO != null) {
         o00000000OOO.O000000000 = this.O00000000000O0.O00000000() == 0 ? "Nominal" : "Anomaly";
         o00000000OOO.O0000000000 = this.O000000000OO;
         o00000000OOO.O00000000000 = this.O000000000OO0;
         o00000000OOO.O000000000000 = this.O000000000OO00;
         o00000000OOO.O0000000000000 = this.O000000000OO0O;
         o00000000OOO.O000000000000O = this.O000000000OOO;
         o00000000OOO.O00000000000O = this.O000000000OOO0;
         o00000000OOO.O00000000000O0 = this.O000000000OOOO;
         o00000000OOO.O00000000000OO = this.O00000000O;
         o00000000OOO.O0000000000O = this.O00000000O0;
         o00000000OOO.O0000000000O0 = this.O00000000O00;
         o00000000OOO.O0000000000O00 = this.O00000000O000;
         o00000000OOO.O0000000000O0O = this.O00000000O0000;
         o00000000OOO.O0000000000OO = this.O00000000O000O;
         o00000000OOO.O0000000000OO0 = this.O00000000O00O;
         o00000000OOO.O0000000000OOO = this.O00000000O00O0;
         o00000000OOO.O000000000O = this.O00000000O00OO;
         o00000000OOO.O000000000O0 = this.O00000000O0O;
         o00000000OOO.O000000000O00 = this.O00000000O0O0;
         o00000000OOO.O000000000O000 = this.O00000000O0OO;
         o00000000OOO.O000000000O00O = this.O00000000O0OO0;
         o00000000OOO.O000000000O0OO = this.O00000000000O0.O00000000();
         o00000000OOO.O000000000OO = this.O00000000000O0.O000000000();
         o00000000OOO.O000000000OO0 = this.O00000000OO;
         o00000000OOO.O000000000OOO = this.O00000000OO0;

         for (int var2 = 0; var2 < 96; var2++) {
            o00000000OOO.O000000000O0O[var2] = this.O00000000O0O00[var2];
            o00000000OOO.O000000000O0O0[var2] = this.O00000000O0O0O[var2];
         }

         o00000000OOO.O000000000OO00 = this.O0000000000O;
         o00000000OOO.O000000000OO0O = this.O000000000O000;
      }
   }

   long O000000000O() {
      return this.O000000000000O.O00000000();
   }

   long O000000000O0() {
      return this.O0000000000O;
   }

   int O000000000O00() {
      return this.O00000000000O0.O00000000();
   }

   void O00000000(DataOutputStream dataOutputStream) throws IOException {
      this.O00000000000O0.O00000000(dataOutputStream);
   }

   String O00000000(int i) {
      return "WS-" + O00000000000(i);
   }

   private void O000000000(int i) {
      this.O000000000000O.O00000000(i);
      this.O000000000000O.O000000000(this.O0000000000O);
   }

   private void O0000000000(int i) {
      this.O00000000("GameRenderer.tail", i);
   }

   private void O000000000(int i, int j) {
      long var3 = System.nanoTime();
      int var5 = (int)(this.O000000000000O.O00000000() ^ var3 >>> 11 ^ (long)i << 16 ^ j);
      this.O00000000000O0.O00000000(var3, var5, i, j, this.O000000000000O.O00000000());
      this.O000000000OO0 = this.O00000000(var5);
      this.O000000000OO00 = O00000000OO0O.O00000000(i);
      this.O00000000(var3, var5, i, j);
      O0000000000000.warn("[WildCore] tracker={} code={} snapshot=pending", this.O000000000OO0, this.O000000000OO00);
   }

   private void O00000000(long l, int i, int j, int k) {
      if (!this.O000000000O000) {
         this.O000000000O000 = true;
         this.O000000000O0O = i;
         this.O000000000O0O0 = j;
         this.O000000000O0OO = k;
         this.O000000000O00O = l + 2400000000L;
         this.O000000000OOO0 = "ожидает";
         this.O00000000O00 = "Ожидает запись";
      }
   }

   private void O000000000O000() {
      long var1 = System.nanoTime();
      if (var1 - this.O0000000000O0 >= 250000000L) {
         this.O0000000000O0 = var1;
         this.O000000000OO = "0x" + Long.toUnsignedString(this.O000000000000O.O00000000(), 16);
         this.O00000000O0OO = Integer.toString(this.O00000000000O0.O00000000());
         this.O00000000O0OO0 = Long.toString(this.O0000000000O);
         this.O00000000O00OO = Integer.toString(this.O00000000O0OOO);
         this.O000000000OOOO = this.O000000000OOO0 + "  " + this.O000000000OO0;
         this.O00000000O00 = this.O000000000O000 ? "Ожидает запись" : this.O000000000OOO0;
         if (this.O00000000000O0.O00000000() == 0) {
            this.O000000000OO0O = "GL clean";
            this.O000000000OOO = "Matrix finite";
         }
      }

      if (this.O00000000OO0 && var1 - this.O0000000000O00 >= 100000000L) {
         this.O0000000000O00 = var1;
         this.O000000000O0O0();
      }

      if (this.O000000000O000 && var1 >= this.O000000000O00O) {
         this.O000000000O000 = false;
         this.O000000000OOO0 = "запись";
         this.O00000000O00 = "Запись";

         try {
            Path var3 = this.O00000000000OO.O00000000(this, this.O000000000O0O, this.O000000000O0O0, this.O000000000O0OO);
            this.O00000000O = var3.toString();
            this.O00000000O0 = var3.getFileName().toString();
            this.O000000000OOO0 = "записан";
            this.O00000000O00 = "Записан";
         } catch (Throwable var9) {
            this.O000000000OOO0 = "ошибка";
            this.O00000000O00 = "Ошибка слепка";
            short var4 = 16385;
            int var5 = var9.getClass().getName().hashCode();
            long var6 = this.O000000000000O.O00000000();
            int var8 = (int)(var6 ^ var5 ^ var4);
            this.O00000000000O0.O00000000(System.nanoTime(), var8, var4, var5, var6);
            this.O000000000OO0 = this.O00000000(var8);
            this.O000000000OO00 = O00000000OO0O.O00000000(var4);
            O0000000000000.warn("[WildCore] tracker={} code={} snapshot=failed", this.O000000000OO0, this.O000000000OO00);
         }
      }
   }

   private static String O00000000000(int i) {
      String var1 = Integer.toUnsignedString(i, 16).toUpperCase(Locale.ROOT);
      return var1.length() >= 8 ? var1.substring(var1.length() - 8) : "00000000".substring(var1.length()) + var1;
   }

   private static String O000000000(String string, int i) {
      if (string != null && !string.isBlank()) {
         String var2 = string.replace('\n', ' ').replace('\r', ' ').trim();
         return var2.length() <= i ? var2 : var2.substring(0, Math.max(0, i - 3)) + "...";
      } else {
         return "none";
      }
   }

   private Path O000000000O00O() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      return (var1 == null ? Path.of(System.getProperty("user.dir", ".")) : var1.runDirectory.toPath()).resolve("logs");
   }

   private void O000000000O0O() {
      this.O00000000OO = 0;

      for (int var1 = 0; var1 < this.O00000000O0O00.length; var1++) {
         this.O00000000O0O00[var1] = "";
         this.O00000000O0O0O[var1] = 0;
      }
   }

   private void O000000000O0O0() {
      Path var1 = this.O000000000O00O().resolve("latest.log");

      try {
         if (!Files.exists(var1)) {
            if (this.O0000000000O0O != -1L || this.O00000000OO == 0) {
               this.O0000000000OO0();
            }

            return;
         }

         long var2 = Files.size(var1);
         long var4 = Files.getLastModifiedTime(var1).toMillis();
         if (var2 != this.O0000000000O0O || var4 != this.O0000000000OO) {
            this.O0000000000OO0();
         }
      } catch (Throwable var6) {
         this.O0000000000OO0();
      }
   }

   private void O00000000(String string) {
      if (string != null && !string.isEmpty()) {
         int var2 = 0;
         int var3 = string.length();

         for (int var4 = 0; var4 <= var3; var4++) {
            if (var4 == var3 || string.charAt(var4) == '\n') {
               int var5 = var4;
               if (var4 > var2 && string.charAt(var4 - 1) == '\r') {
                  var5 = var4 - 1;
               }

               if (var5 > var2) {
                  String var6 = O000000000(string.substring(var2, var5), 170);
                  this.O0000000000(var6, this.O000000000(var6));
               }

               var2 = var4 + 1;
            }
         }

         if (this.O00000000OO == 0) {
            this.O0000000000("INFO latest.log has no visible lines", 1);
         }
      } else {
         this.O0000000000("INFO latest.log is empty", 1);
      }
   }

   private void O0000000000(String string, int i) {
      if (this.O00000000OO < this.O00000000O0O00.length) {
         this.O00000000O0O00[this.O00000000OO] = string;
         this.O00000000O0O0O[this.O00000000OO] = i;
         this.O00000000OO++;
      } else {
         for (int var3 = 1; var3 < this.O00000000O0O00.length; var3++) {
            this.O00000000O0O00[var3 - 1] = this.O00000000O0O00[var3];
            this.O00000000O0O0O[var3 - 1] = this.O00000000O0O0O[var3];
         }

         int var4 = this.O00000000O0O00.length - 1;
         this.O00000000O0O00[var4] = string;
         this.O00000000O0O0O[var4] = i;
      }
   }

   private int O000000000(String string) {
      if (string == null) {
         return 0;
      } else if (this.O00000000(string, "ERROR") || this.O00000000(string, "Exception") || this.O00000000(string, "Crash")) {
         return 3;
      } else if (this.O00000000(string, "WARN")) {
         return 2;
      } else if (this.O00000000(string, "Shader") || this.O00000000(string, "GL_") || this.O00000000(string, "OpenGL")) {
         return 4;
      } else {
         return !this.O00000000(string, "DEBUG") && !this.O00000000(string, "TRACE") ? 1 : 0;
      }
   }

   private boolean O00000000(String string, String string2) {
      return string.indexOf(string2) >= 0;
   }
}
