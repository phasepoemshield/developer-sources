package ru.metaculture.protection;

import com.mojang.logging.LogUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import net.minecraft.class_156;
import net.minecraft.class_310;
import org.slf4j.Logger;

public final class vVnvuVuVvnun {
   private static final vVnvuVuVvnun UuUVuuUu = new vVnvuVuVvnun();
   private static final long C00OOC00oO = 2400000000L;
   private static final long uUnuvNvvNU = 250000000L;
   private static final long vVvUvVVuuNvV = 100000000L;
   private static final int uNNnnnuuuN = 65536;
   private static final Logger nuUnNvnuUu = LogUtils.getLogger();
   private final unVnUnVv VVuuUN = new unVnUnVv();
   private final VNuNvVUNn vNUvnnVnUvu = new VNuNvVUNn();
   private final UNUNvUUUu uVUuuVnNVU = new UNUNvUUUu();
   private final nVuNvVnnVUNn vuuuNvNuv = new nVuNvVnnVUNn();
   private long nvUVNnuu;
   private long UuuNnUvUuv;
   private long nUUVuvU;
   private long UnUNVVVNuv = -1L;
   private long vNVuvnUUnuUn = -1L;
   private boolean UvnvNVnnnnNU;
   private boolean uVUVnuvnuVuv;
   private boolean NVNnnvnuunNv;
   private boolean uVunuUNVVUUV;
   private boolean UNnVVNvvnVvU;
   private boolean uNnUnnuNUnNu;
   private long NnUuNNU;
   private int nNvNUVU;
   private int UnUNuUU;
   private int uUVuVvuNUvnu;
   private String UvUvUNuvNU = "0x0000000000000000";
   private String c0oOOCcCoC0 = "none";
   private String VVnVNnunVvu = "none";
   private String unNNVVNnvvV = "GL clean";
   private String NuunnvnN = "Matrix finite";
   private String NVUunUNUN = "ожидание";
   private String UUVNuUNUvUnV = "ожидание  none";
   private String vuvnUnVnUNnV = "none";
   private String nnuUVNUuvvVU = "none";
   private String nVVUuvuNnUN = "Ожидание";
   private String nNnVnUNVV = "Inject HEAD/TAIL";
   private String nuunNvv = "Local encrypted";
   private String uUVVvVVNvvn = "none";
   private String vvUVNVvvNUv = "none";
   private String UuNnnVnuNNV = "none";
   private String uUVvnUuNvvN = "0";
   private String UUuUnNVNuuv = "latest.log";
   private String NVuNUuVnVUN = "latest.log";
   private final String[] NVuunNnvvvVu = new String[96];
   private final int[] vNnNuuvVn = new int[96];
   private String VUuuVUnun = "0";
   private String vVVuuVVv = "0";
   private int VuunNUUUvu;
   private int NNUUNUuVNNVn;
   private boolean VvVvnNUnvuvV;

   private vVnvuVuVvnun() {
      this.vNUvnnVnUvu.UuUVuuUu(this.VVuuUN);
      this.nNvNUVU();
   }

   public static vVnvuVuVvnun UuUVuuUu() {
      return UuUVuuUu;
   }

   public void C00OOC00oO() {
      if (this.UvnvNVnnnnNU) {
         this.C00OOC00oO(8193, 257);
      }

      this.UvnvNVnnnnNU = true;
      this.C00OOC00oO(257);
   }

   public void uUnuvNvvNU() {
      if (!this.UvnvNVnnnnNU) {
         this.C00OOC00oO(8193, 258);
      }

      this.C00OOC00oO(258);
      this.UvnvNVnnnnNU = false;
      this.uNnUnnuNUnNu();
   }

   public void vVvUvVVuuNvV() {
      this.nvUVNnuu++;
      if (this.uVUVnuvnuVuv) {
         this.C00OOC00oO(8193, 513);
      }

      this.uVUVnuvnuVuv = true;
      this.C00OOC00oO(513);
      boolean var1 = VNNUUvuV.UuUVuuUu(this.VVuuUN);
      if (!var1) {
         this.C00OOC00oO(12289, 513);
      }
   }

   public void uNNnnnuuuN() {
      if (!this.uVUVnuvnuVuv) {
         this.C00OOC00oO(8193, 514);
      }

      this.C00OOC00oO(514);
      this.uVUVnuvnuVuv = false;
      int var1 = UVUuvNVUuVvN.vVvUvVVuuNvV();
      if (var1 != 0) {
         this.uUnuvNvvNU(var1);
      }
   }

   public void nuUnNvnuUu() {
      if (this.NVNnnvnuunNv) {
         this.C00OOC00oO(8193, 769);
      }

      this.NVNnnvnuunNv = true;
      this.C00OOC00oO(769);
   }

   public void VVuuUN() {
      if (!this.NVNnnvnuunNv) {
         this.C00OOC00oO(8193, 770);
      }

      this.C00OOC00oO(770);
      this.NVNnnvnuunNv = false;
   }

   public void UuUVuuUu(int var1, int var2) {
      if (this.uVunuUNVVUUV) {
         this.C00OOC00oO(8193, 1025);
      }

      this.uVunuUNVVUUV = true;
      this.C00OOC00oO(1025);
      this.VVuuUN.UuUVuuUu(var1);
      this.VVuuUN.UuUVuuUu(var2);
   }

   public void vNUvnnVnUvu() {
      if (!this.uVunuUNVVUUV) {
         this.C00OOC00oO(8193, 1026);
      }

      this.C00OOC00oO(1026);
      this.uVunuUNVVUUV = false;
   }

   public void uVUuuVnNVU() {
      if (this.UNnVVNvvnVvU) {
         this.C00OOC00oO(8193, 1281);
      }

      this.UNnVVNvvnVvU = true;
      this.C00OOC00oO(1281);
   }

   public void UuUVuuUu(int var1, int var2, int var3) {
      this.C00OOC00oO(1282);
      this.UNnVVNvvnVvU = false;
      int var4 = UVUuvNVUuVvN.UuUVuuUu();
      int var5 = UVUuvNVUuVvN.C00OOC00oO();
      int var6 = UVUuvNVUuVvN.uUnuvNvvNU();
      if (var1 != var4 || var2 != var5 || var3 != var6) {
         this.C00OOC00oO(4098, var4 ^ var5 ^ var6);
      }
   }

   public void UuUVuuUu(UNvUVNVnU var1) {
      if (var1 != null) {
         this.VVuuUN.UuUVuuUu(var1.UuUVuuUu());
         var1.UuUVuuUu(this.vNUvnnVnUvu);
      }
   }

   public void vuuuNvNuv() {
      long var1 = System.nanoTime();
      int var3 = (int)(this.VVuuUN.UuUVuuUu() ^ var1 >>> 13 ^ 20481L);
      this.c0oOOCcCoC0 = this.UuUVuuUu(var3);
      this.VVnVNnunVvu = UNUUvUNu.UuUVuuUu(20481);
      this.uNnUnnuNUnNu = true;
      this.nNvNUVU = var3;
      this.UnUNuUU = 20481;
      this.uUVuVvuNUvnu = 0;
      this.NnUuNNU = var1;
      this.NVUunUNUN = "ожидает";
      this.nVVUuvuNnUN = "Ручной слепок";
      this.UUVNuUNUvUnV = "pending  " + this.c0oOOCcCoC0;
      nuUnNvnuUu.info("[WildCore] tracker={} code={} snapshot=pending", this.c0oOOCcCoC0, this.VVnVNnunVvu);
   }

   public void nvUVNnuu() {
      try {
         Path var1 = this.vuuuNvNuv.UuUVuuUu();
         class_156.method_668().method_672(var1.toFile());
      } catch (Throwable var2) {
         this.NVUunUNUN = "папка недоступна";
         this.nVVUuvuNnUN = "Open folder failed";
         nuUnNvnuUu.warn("[WildCore] tracker={} code=OPEN_FOLDER_FAILED", this.c0oOOCcCoC0);
      }
   }

   public void UuuNnUvUuv() {
      try {
         Path var1 = this.NnUuNNU();
         Files.createDirectories(var1);
         class_156.method_668().method_672(var1.toFile());
         this.UUuUnNVNuuv = "логи открыты";
      } catch (Throwable var2) {
         this.UUuUnNVNuuv = "ошибка открытия";
         nuUnNvnuUu.warn("[WildCore] tracker={} code=OPEN_LOGS_FAILED", this.c0oOOCcCoC0);
      }
   }

   public void nUUVuvU() {
      this.VvVvnNUnvuvV = true;
      this.nUUVuvU = 0L;
      this.UvnvNVnnnnNU();
   }

   public void UnUNVVVNuv() {
      this.VvVvnNUnvuvV = !this.VvVvnNUnvuvV;
      if (this.VvVvnNUnvuvV) {
         this.nUUVuvU = 0L;
         this.UvnvNVnnnnNU();
      }
   }

   public void vNVuvnUUnuUn() {
      this.VvVvnNUnvuvV = false;
   }

   public void UvnvNVnnnnNU() {
      Path var1 = this.NnUuNNU().resolve("latest.log");
      this.NVuNUuVnVUN = "latest.log";
      this.nNvNUVU();
      if (!Files.exists(var1)) {
         this.UnUNVVVNuv = -1L;
         this.vNVuvnUUnuUn = -1L;
         this.UUuUnNVNuuv = "latest.log not found";
         this.uUnuvNvvNU("WARN latest.log not found", 2);
      } else {
         try (RandomAccessFile var2 = new RandomAccessFile(var1.toFile(), "r")) {
            long var3 = var2.length();
            this.UnUNVVVNuv = var3;
            this.vNVuvnUUnuUn = Files.getLastModifiedTime(var1).toMillis();
            int var5 = (int)Math.min(65536L, var3);
            byte[] var6 = new byte[var5];
            var2.seek(Math.max(0L, var3 - var5));
            var2.readFully(var6);
            this.UuUVuuUu(new String(var6, StandardCharsets.UTF_8));
            this.UUuUnNVNuuv = "loaded " + this.NNUUNUuVNNVn;
         } catch (Throwable var9) {
            this.UUuUnNVNuuv = "read failed";
            this.uUnuvNvvNU("ERROR " + var9.getClass().getSimpleName(), 3);
            nuUnNvnuUu.warn("[WildCore] tracker={} code=READ_LOG_FAILED", this.c0oOOCcCoC0);
         }
      }
   }

   public boolean uVUVnuvnuVuv() {
      return this.VvVvnNUnvuvV;
   }

   public void UuUVuuUu(String var1, Throwable var2) {
      this.VuunNUUUvu++;
      this.uUVVvVVNvvn = C00OOC00oO(var1, 96);
      this.vvUVNVvvNUv = var2 == null ? "unknown" : C00OOC00oO(var2.getClass().getName(), 96);
      this.UuNnnVnuNNV = var2 == null ? "no throwable" : C00OOC00oO(var2.getMessage(), 160);
      this.uUVvnUuNvvN = Integer.toString(this.VuunNUUUvu);
      this.UUuUnNVNuuv = "shader exception";
      this.uUnuvNvvNU(nUNNVUVUNunv.UuUVuuUu(this.uUVVvVVNvvn, this.VuunNUUUvu), 3);
      int var3 = 0;
      Throwable var4 = var2;
      if (var2 == null) {
         this.uUnuvNvvNU("cause[0]=unknown", 3);
         this.uUnuvNvvNU("message=no throwable", 3);
      }

      for (int var5 = 0; var4 != null && var5 < 3; var5++) {
         this.uUnuvNvvNU(nUNNVUVUNunv.UuUVuuUu(var5, var4), 3);
         this.uUnuvNvvNU(nUNNVUVUNunv.UuUVuuUu(var4), 3);
         String var6 = nUNNVUVUNunv.C00OOC00oO(var4);
         if (!"none".equals(var6)) {
            this.uUnuvNvvNU(var6, 4);
         }

         StackTraceElement[] var7 = var4.getStackTrace();

         for (int var8 = 0; var8 < var7.length && var3 < 14; var8++) {
            this.uUnuvNvvNU(nUNNVUVUNunv.UuUVuuUu(var7[var8]), 3);
            var3++;
         }

         var4 = var4.getCause();
      }

      this.C00OOC00oO(24577, this.UuNnnVnuNNV.hashCode());
      nuUnNvnuUu.error("[WildCore] tracker={} shaderStage={} exception={}", new Object[]{this.c0oOOCcCoC0, this.uUVVvVVNvvn, this.vvUVNVvvNUv, var2});
   }

   public void UuUVuuUu(String var1, int var2) {
      if (var2 != 0) {
         this.C00OOC00oO(4097, var2);
         this.unNNVVNnvvV = UVUuvNVUuVvN.UuUVuuUu(var2);
         this.UUuUnNVNuuv = "OpenGL error";
         this.uUnuvNvvNU(nUNNVUVUNunv.C00OOC00oO(var1, var2), 4);
         this.uUnuvNvvNU(nUNNVUVUNunv.UuUVuuUu(), 4);
      }
   }

   public void C00OOC00oO(String var1, Throwable var2) {
      this.UuUVuuUu(var1, var2);
      if (var2 instanceof Error var4) {
         throw var4;
      } else if (var2 instanceof RuntimeException var3) {
         throw var3;
      } else {
         throw new IllegalStateException("WildCore shader failure at " + this.uUVVvVVNvvn, var2);
      }
   }

   public void UuUVuuUu(UnUnVNnvnV var1) {
      if (var1 != null) {
         var1.C00OOC00oO = this.uVUuuVnNVU.UuUVuuUu() == 0 ? "Nominal" : "Anomaly";
         var1.uUnuvNvvNU = this.UvUvUNuvNU;
         var1.vVvUvVVuuNvV = this.c0oOOCcCoC0;
         var1.uNNnnnuuuN = this.VVnVNnunVvu;
         var1.nuUnNvnuUu = this.unNNVVNnvvV;
         var1.VVuuUN = this.NuunnvnN;
         var1.vNUvnnVnUvu = this.NVUunUNUN;
         var1.uVUuuVnNVU = this.UUVNuUNUvUnV;
         var1.vuuuNvNuv = this.vuvnUnVnUNnV;
         var1.nvUVNnuu = this.nnuUVNUuvvVU;
         var1.UuuNnUvUuv = this.nVVUuvuNnUN;
         var1.nUUVuvU = this.nNnVnUNVV;
         var1.UnUNVVVNuv = this.nuunNvv;
         var1.vNVuvnUUnuUn = this.uUVVvVVNvvn;
         var1.UvnvNVnnnnNU = this.vvUVNVvvNUv;
         var1.uVUVnuvnuVuv = this.UuNnnVnuNNV;
         var1.NVNnnvnuunNv = this.uUVvnUuNvvN;
         var1.uVunuUNVVUUV = this.UUuUnNVNuuv;
         var1.UNnVVNvvnVvU = this.NVuNUuVnVUN;
         var1.uNnUnnuNUnNu = this.VUuuVUnun;
         var1.NnUuNNU = this.vVVuuVVv;
         var1.uUVuVvuNUvnu = this.uVUuuVnNVU.UuUVuuUu();
         var1.UvUvUNuvNU = this.uVUuuVnNVU.C00OOC00oO();
         var1.c0oOOCcCoC0 = this.NNUUNUuVNNVn;
         var1.NuunnvnN = this.VvVvnNUnvuvV;

         for (int var2 = 0; var2 < 96; var2++) {
            var1.nNvNUVU[var2] = this.NVuunNnvvvVu[var2];
            var1.UnUNuUU[var2] = this.vNnNuuvVn[var2];
         }

         var1.VVnVNnunVvu = this.nvUVNnuu;
         var1.unNNVVNnvvV = this.uNnUnnuNUnNu;
      }
   }

   long NVNnnvnuunNv() {
      return this.VVuuUN.UuUVuuUu();
   }

   long uVunuUNVVUUV() {
      return this.nvUVNnuu;
   }

   int UNnVVNvvnVvU() {
      return this.uVUuuVnNVU.UuUVuuUu();
   }

   void UuUVuuUu(DataOutputStream var1) throws IOException {
      this.uVUuuVnNVU.UuUVuuUu(var1);
   }

   String UuUVuuUu(int var1) {
      return "WS-" + vVvUvVVuuNvV(var1);
   }

   private void C00OOC00oO(int var1) {
      this.VVuuUN.UuUVuuUu(var1);
      this.VVuuUN.C00OOC00oO(this.nvUVNnuu);
   }

   private void uUnuvNvvNU(int var1) {
      this.UuUVuuUu("GameRenderer.tail", var1);
   }

   private void C00OOC00oO(int var1, int var2) {
      long var3 = System.nanoTime();
      int var5 = (int)(this.VVuuUN.UuUVuuUu() ^ var3 >>> 11 ^ (long)var1 << 16 ^ var2);
      this.uVUuuVnNVU.UuUVuuUu(var3, var5, var1, var2, this.VVuuUN.UuUVuuUu());
      this.c0oOOCcCoC0 = this.UuUVuuUu(var5);
      this.VVnVNnunVvu = UNUUvUNu.UuUVuuUu(var1);
      this.UuUVuuUu(var3, var5, var1, var2);
      nuUnNvnuUu.warn("[WildCore] tracker={} code={} snapshot=pending", this.c0oOOCcCoC0, this.VVnVNnunVvu);
   }

   private void UuUVuuUu(long var1, int var3, int var4, int var5) {
      if (!this.uNnUnnuNUnNu) {
         this.uNnUnnuNUnNu = true;
         this.nNvNUVU = var3;
         this.UnUNuUU = var4;
         this.uUVuVvuNUvnu = var5;
         this.NnUuNNU = var1 + 2400000000L;
         this.NVUunUNUN = "ожидает";
         this.nVVUuvuNnUN = "Ожидает запись";
      }
   }

   private void uNnUnnuNUnNu() {
      long var1 = System.nanoTime();
      if (var1 - this.UuuNnUvUuv >= 250000000L) {
         this.UuuNnUvUuv = var1;
         this.UvUvUNuvNU = "0x" + Long.toUnsignedString(this.VVuuUN.UuUVuuUu(), 16);
         this.VUuuVUnun = Integer.toString(this.uVUuuVnNVU.UuUVuuUu());
         this.vVVuuVVv = Long.toString(this.nvUVNnuu);
         this.uUVvnUuNvvN = Integer.toString(this.VuunNUUUvu);
         this.UUVNuUNUvUnV = this.NVUunUNUN + "  " + this.c0oOOCcCoC0;
         this.nVVUuvuNnUN = this.uNnUnnuNUnNu ? "Ожидает запись" : this.NVUunUNUN;
         if (this.uVUuuVnNVU.UuUVuuUu() == 0) {
            this.unNNVVNnvvV = "GL clean";
            this.NuunnvnN = "Matrix finite";
         }
      }

      if (this.VvVvnNUnvuvV && var1 - this.nUUVuvU >= 100000000L) {
         this.nUUVuvU = var1;
         this.UnUNuUU();
      }

      if (this.uNnUnnuNUnNu && var1 >= this.NnUuNNU) {
         this.uNnUnnuNUnNu = false;
         this.NVUunUNUN = "запись";
         this.nVVUuvuNnUN = "Запись";

         try {
            Path var3 = this.vuuuNvNuv.UuUVuuUu(this, this.nNvNUVU, this.UnUNuUU, this.uUVuVvuNUvnu);
            this.vuvnUnVnUNnV = var3.toString();
            this.nnuUVNUuvvVU = var3.getFileName().toString();
            this.NVUunUNUN = "записан";
            this.nVVUuvuNnUN = "Записан";
         } catch (Throwable var9) {
            this.NVUunUNUN = "ошибка";
            this.nVVUuvuNnUN = "Ошибка слепка";
            short var4 = 16385;
            int var5 = var9.getClass().getName().hashCode();
            long var6 = this.VVuuUN.UuUVuuUu();
            int var8 = (int)(var6 ^ var5 ^ var4);
            this.uVUuuVnNVU.UuUVuuUu(System.nanoTime(), var8, var4, var5, var6);
            this.c0oOOCcCoC0 = this.UuUVuuUu(var8);
            this.VVnVNnunVvu = UNUUvUNu.UuUVuuUu(var4);
            nuUnNvnuUu.warn("[WildCore] tracker={} code={} snapshot=failed", this.c0oOOCcCoC0, this.VVnVNnunVvu);
         }
      }
   }

   private static String vVvUvVVuuNvV(int var0) {
      String var1 = Integer.toUnsignedString(var0, 16).toUpperCase(Locale.ROOT);
      return var1.length() >= 8 ? var1.substring(var1.length() - 8) : "00000000".substring(var1.length()) + var1;
   }

   private static String C00OOC00oO(String var0, int var1) {
      if (var0 != null && !var0.isBlank()) {
         String var2 = var0.replace('\n', ' ').replace('\r', ' ').trim();
         return var2.length() <= var1 ? var2 : var2.substring(0, Math.max(0, var1 - 3)) + "...";
      } else {
         return "none";
      }
   }

   private Path NnUuNNU() {
      class_310 var1 = class_310.method_1551();
      return (var1 == null ? Path.of(System.getProperty("user.dir", ".")) : var1.field_1697.toPath()).resolve("logs");
   }

   private void nNvNUVU() {
      this.NNUUNUuVNNVn = 0;

      for (int var1 = 0; var1 < this.NVuunNnvvvVu.length; var1++) {
         this.NVuunNnvvvVu[var1] = "";
         this.vNnNuuvVn[var1] = 0;
      }
   }

   private void UnUNuUU() {
      Path var1 = this.NnUuNNU().resolve("latest.log");

      try {
         if (!Files.exists(var1)) {
            if (this.UnUNVVVNuv != -1L || this.NNUUNUuVNNVn == 0) {
               this.UvnvNVnnnnNU();
            }

            return;
         }

         long var2 = Files.size(var1);
         long var4 = Files.getLastModifiedTime(var1).toMillis();
         if (var2 != this.UnUNVVVNuv || var4 != this.vNVuvnUUnuUn) {
            this.UvnvNVnnnnNU();
         }
      } catch (Throwable var6) {
         this.UvnvNVnnnnNU();
      }
   }

   private void UuUVuuUu(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         int var2 = 0;
         int var3 = var1.length();

         for (int var4 = 0; var4 <= var3; var4++) {
            if (var4 == var3 || var1.charAt(var4) == '\n') {
               int var5 = var4;
               if (var4 > var2 && var1.charAt(var4 - 1) == '\r') {
                  var5 = var4 - 1;
               }

               if (var5 > var2) {
                  String var6 = C00OOC00oO(var1.substring(var2, var5), 170);
                  this.uUnuvNvvNU(var6, this.C00OOC00oO(var6));
               }

               var2 = var4 + 1;
            }
         }

         if (this.NNUUNUuVNNVn == 0) {
            this.uUnuvNvvNU("INFO latest.log has no visible lines", 1);
         }
      } else {
         this.uUnuvNvvNU("INFO latest.log is empty", 1);
      }
   }

   private void uUnuvNvvNU(String var1, int var2) {
      if (this.NNUUNUuVNNVn < this.NVuunNnvvvVu.length) {
         this.NVuunNnvvvVu[this.NNUUNUuVNNVn] = var1;
         this.vNnNuuvVn[this.NNUUNUuVNNVn] = var2;
         this.NNUUNUuVNNVn++;
      } else {
         for (int var3 = 1; var3 < this.NVuunNnvvvVu.length; var3++) {
            this.NVuunNnvvvVu[var3 - 1] = this.NVuunNnvvvVu[var3];
            this.vNnNuuvVn[var3 - 1] = this.vNnNuuvVn[var3];
         }

         int var4 = this.NVuunNnvvvVu.length - 1;
         this.NVuunNnvvvVu[var4] = var1;
         this.vNnNuuvVn[var4] = var2;
      }
   }

   private int C00OOC00oO(String var1) {
      if (var1 == null) {
         return 0;
      } else if (this.UuUVuuUu(var1, "ERROR") || this.UuUVuuUu(var1, "Exception") || this.UuUVuuUu(var1, "Crash")) {
         return 3;
      } else if (this.UuUVuuUu(var1, "WARN")) {
         return 2;
      } else if (this.UuUVuuUu(var1, "Shader") || this.UuUVuuUu(var1, "GL_") || this.UuUVuuUu(var1, "OpenGL")) {
         return 4;
      } else {
         return !this.UuUVuuUu(var1, "DEBUG") && !this.UuUVuuUu(var1, "TRACE") ? 1 : 0;
      }
   }

   private boolean UuUVuuUu(String var1, String var2) {
      return var1.indexOf(var2) >= 0;
   }
}
