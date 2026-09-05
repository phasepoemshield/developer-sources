package ru.metaculture.protection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Party",
   C00OOC00oO = "Метки пати в мире: бинд ставит метку, видна сокланам через сервер VDS",
   uUnuvNvvNU = oOOOo0.Misc
)
public class Party extends Module {
   private static final String UNnVVNvvnVvU = "ws://49.12.210.82:8080/ws";
   private static final long uNnUnnuNUnNu = 600000L;
   private static final long NnUuNNU = 420000L;
   private static final long nNvNUVU = 180000L;
   private static final long UnUNuUU = 250L;
   private static final double uUVuVvuNUvnu = 300.0;
   private static final double UvUvUNuvNU = 3.0;
   private static final float c0oOOCcCoC0 = 6.0F;
   private static final double VVnVNnunVvu = 1.35;
   private static final double unNNVVNnvvV = 0.45;
   private static final double NuunnvnN = 8.0;
   private static final char NVUunUNUN = '\u0001';
   public final uVNuNUVvn NVNnnvnuunNv = new uVNuNUVvn("Кнопка метки", -1);
   public final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Показ меток", true);
   private final UvVNVuNUVvuv UUVNuUNUvUnV = new UvVNVuNUVvuv();
   private final VNVNvuUn vuvnUnVnUNnV = new VNVNvuUn();
   private final Map<String, class_1297> nnuUVNUuvvVU = new HashMap<>();
   private final Set<String> nVVUuvuNnUN = new HashSet<>();
   private final Map<String, Party.NVnVnNnN> nNnVnUNVV = new HashMap<>();
   private final Map<String, Party.nvnNNunvv> nuunNvv = new HashMap<>();
   private final Party.NVnVnNnN uUVVvVVNvvn = new Party.NVnVnNnN();
   private final StringBuilder vvUVNVvvNUv = new StringBuilder(32);
   private long UuNnnVnuNNV;
   private long uUVvnUuNvvN;

   public Party() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV});
   }

   public String UuuNnUvUuv() {
      String var1 = UuuNvUuUnu.vVvUvVVuuNvV();
      return var1 != null ? var1 : "";
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      if (this.nuUnNvnuUu) {
         this.UnUNVVVNuv();
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      COcocc0c0Oc.UuUVuuUu();
      this.nnuUVNUuvvVU.clear();
      this.nNnVnUNVV.clear();
   }

   private void UnUNVVVNuv() {
      String var1 = uUnuvNvvNU.method_1548() != null ? uUnuvNvvNU.method_1548().method_1676() : "Unknown";

      try {
         COcocc0c0Oc var2 = new COcocc0c0Oc("ws://49.12.210.82:8080/ws", var1);
         var2.connect();
      } catch (Exception var3) {
         vVnvuVVUunuv.UuUVuuUu("§c[Party] Ошибка подключения: §f" + var3.getMessage());
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (!NUvunNNvN.UuUVuuUu() && this.NVNnnvnuunNv.uUnuvNvvNU() > -1) {
         if (var1.vVvUvVVuuNvV() == this.NVNnnvnuunNv.uUnuvNvvNU()) {
            if (var1.nuUnNvnuUu() == 1) {
               if (uUnuvNvvNU.field_1755 == null) {
                  this.vNVuvnUUnuUn();
               }
            }
         }
      }
   }

   private void vNVuvnUUnuUn() {
      long var1 = System.currentTimeMillis();
      if (var1 - this.uUVvnUuNvvN >= 250L) {
         COcocc0c0Oc var3 = COcocc0c0Oc.UuUVuuUu;
         if (var3 == null || !var3.isOpen()) {
            vVnvuVVUunuv.UuUVuuUu("§c[Party] Нет соединения с сервером меток.");
         } else if (!nUUVuvU()) {
            vVnvuVVUunuv.UuUVuuUu("§c[Party] Ты не в группе. Создай: §f.party create");
         } else if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
            this.uUVvnUuNvvN = var1;
            float var4 = uUnuvNvvNU.method_61966().method_60637(true);
            class_243 var5 = uUnuvNvvNU.field_1724.method_5836(var4);
            class_243 var6 = VuUVUvnU.UuUVuuUu(uUnuvNvvNU.field_1724.method_36455(), uUnuvNvvNU.field_1724.method_36454());
            class_243 var7 = var5.method_1019(var6.method_1021(300.0));
            class_3959 var8 = new class_3959(var5, var7, class_3960.field_17558, class_242.field_1348, uUnuvNvvNU.field_1724);
            class_3965 var9 = uUnuvNvvNU.field_1687.method_17742(var8);
            boolean var10 = var9 != null && var9.method_17783() == class_240.field_1332;
            double var11 = var10 ? var5.method_1025(var9.method_17784()) : Double.MAX_VALUE;
            class_238 var13 = uUnuvNvvNU.field_1724.method_5829().method_18804(var6.method_1021(300.0)).method_1014(1.0);
            class_3966 var14 = VuUVUvnU.UuUVuuUu(
               uUnuvNvvNU.field_1724, var5, var7, var13, var0 -> !var0.method_7325() && var0.method_5805() && var0 != uUnuvNvvNU.field_1724, 300.0
            );
            boolean var16 = false;
            String var17 = "";
            class_243 var15;
            if (var14 == null || var14.method_17782() == null || var10 && (var14.method_17784() == null || !(var14.method_17784().method_1025(var5) < var11))) {
               if (var10) {
                  var15 = var9.method_17784();
               } else {
                  var15 = var7;
               }
            } else {
               class_1297 var18 = var14.method_17782();
               var17 = var18.method_5845() + UuUVuuUu(var18);
               var16 = true;
               var15 = var18.method_19538().method_1031(0.0, var18.method_17682(), 0.0);
            }

            if (this.UuUVuuUu(var15, var16, var17)) {
               var3.C00OOC00oO();
               COcocc0c0Oc.C00OOC00oO.remove(this.UvnvNVnnnnNU().toLowerCase(Locale.ROOT));
               vVnvuVVUunuv.UuUVuuUu("§e[Party] Метка снята.");
            } else {
               var3.UuUVuuUu(var15.field_1352, var15.field_1351, var15.field_1350, var16, var17);
               vVnvuVVUunuv.UuUVuuUu(
                  "§a[Party] Метка установлена в §f"
                     + class_3532.method_15357(var15.field_1352)
                     + "§7/§f"
                     + class_3532.method_15357(var15.field_1351)
                     + "§7/§f"
                     + class_3532.method_15357(var15.field_1350)
               );
            }
         }
      }
   }

   private boolean UuUVuuUu(class_243 var1, boolean var2, String var3) {
      COcocc0c0Oc.NVnVnNnN var4 = COcocc0c0Oc.C00OOC00oO.get(this.UvnvNVnnnnNU().toLowerCase(Locale.ROOT));
      if (var4 == null) {
         return false;
      } else if (var2 && var4.VVuuUN) {
         return C00OOC00oO(var3).equals(C00OOC00oO(var4.C00OOC00oO == null ? "" : var4.C00OOC00oO));
      } else if (var2 != var4.VVuuUN) {
         return false;
      } else {
         double var5 = var1.field_1352 - var4.uUnuvNvvNU;
         double var7 = var1.field_1351 - var4.vVvUvVVuuNvV;
         double var9 = var1.field_1350 - var4.uNNnnnuuuN;
         return var5 * var5 + var7 * var7 + var9 * var9 <= 9.0;
      }
   }

   private String UvnvNVnnnnNU() {
      return uUnuvNvvNU.method_1548() != null ? uUnuvNvvNU.method_1548().method_1676() : "";
   }

   private static String UuUVuuUu(class_1297 var0) {
      try {
         String var1 = var0.method_5477().getString();
         return var1 == null ? "" : var1;
      } catch (Exception var2) {
         return "";
      }
   }

   public static boolean nUUVuvU() {
      String var0 = UuuNvUuUnu.vVvUvVVuuNvV();
      return var0 != null && !var0.isBlank();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      COcocc0c0Oc var2 = COcocc0c0Oc.UuUVuuUu;
      if (var2 != null && var2.isOpen()) {
         var2.UuUVuuUu(this.UuuNnUvUuv());
         if (System.currentTimeMillis() - this.UuNnnVnuNNV > 25000L) {
            this.UuNnnVnuNNV = System.currentTimeMillis();
            var2.uUnuvNvvNU();
         }
      }
   }

   @vuVvUNNvVNV(
      UuUVuuUu = 3
   )
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (this.uVunuUNVVUUV.uUnuvNvvNU()) {
         if (!NUvunNNvN.UuUVuuUu()) {
            if (COcocc0c0Oc.UuUVuuUu != null && !COcocc0c0Oc.C00OOC00oO.isEmpty()) {
               UnVNvNnU var2 = var1.vVvUvVVuuNvV();
               long var3 = System.currentTimeMillis();
               boolean var5 = false;
               this.uVUVnuvnuVuv();

               for (COcocc0c0Oc.NVnVnNnN var7 : COcocc0c0Oc.C00OOC00oO.values()) {
                  long var8 = var3 - var7.nuUnNvnuUu;
                  if (var8 <= 600000L) {
                     float var10 = var8 > 420000L ? 1.0F - (float)(var8 - 420000L) / 180000.0F : 1.0F;
                     var10 = class_3532.method_15363(var10, 0.0F, 1.0F);
                     if (!(var10 <= 0.004F)) {
                        Party.nvnNNunvv var11 = this.UuUVuuUu(var7);
                        float var12 = var11.UuUVuuUu() * var10;
                        if (!(var12 <= 0.004F)) {
                           class_1297 var13 = this.C00OOC00oO(var7);
                           class_243 var14 = this.UuUVuuUu(var7, var13);
                           if (!this.vuvnUnVnUNnV.UuUVuuUu(var14, var13 == null)) {
                              VNVNvuUn.UuUVuuUu(
                                 var2, var14, var7.UuUVuuUu, this.UuUVuuUu(this.vuvnUnVnUNnV.uUnuvNvvNU), var12, var1.nuUnNvnuUu(), var1.VVuuUN()
                              );
                           } else if (!(this.vuvnUnVnUNnV.uUnuvNvvNU <= 1.5)) {
                              if (!var5) {
                                 UvVNVuNUVvuv.UuUVuuUu(var2);
                                 var5 = true;
                              }

                              String var15 = this.UuUVuuUu(var7.UuUVuuUu, var14);
                              String var16 = this.UuUVuuUu(this.vuvnUnVnUNnV.uUnuvNvvNU);
                              float var17 = var13 == null ? this.vuvnUnVnUNnV.C00OOC00oO : this.UuUVuuUu(var7.UuUVuuUu, var15, var16);
                              this.UUVNuUNUvUnV
                                 .UuUVuuUu(var2, this.vuvnUnVnUNnV.UuUVuuUu, var17, var7.UuUVuuUu, var15, var16, var7.UuUVuuUu, var12, var11.C00OOC00oO());
                           }
                        }
                     }
                  }
               }

               this.nuunNvv.keySet().retainAll(COcocc0c0Oc.C00OOC00oO.keySet());
            }
         }
      }
   }

   private Party.nvnNNunvv UuUVuuUu(COcocc0c0Oc.NVnVnNnN var1) {
      Party.nvnNNunvv var2 = this.nuunNvv.get(var1.UuUVuuUu.toLowerCase(Locale.ROOT));
      if (var2 == null || var2.UuUVuuUu != var1.nuUnNvnuUu) {
         var2 = new Party.nvnNNunvv(var1.nuUnNvnuUu);
         this.nuunNvv.put(var1.UuUVuuUu.toLowerCase(Locale.ROOT), var2);
      }

      return var2;
   }

   private float UuUVuuUu(String var1, String var2, String var3) {
      return this.vuvnUnVnUNnV.C00OOC00oO - this.UUVNuUNUvUnV.UuUVuuUu(var1, var2, var3) * 0.5F - 6.0F * this.NVNnnvnuunNv();
   }

   private void uVUVnuvnuVuv() {
      this.nnuUVNUuvvVU.clear();
      this.nVVUuvuNnUN.clear();
      if (uUnuvNvvNU.field_1687 != null) {
         for (COcocc0c0Oc.NVnVnNnN var2 : COcocc0c0Oc.C00OOC00oO.values()) {
            if (var2.VVuuUN && var2.C00OOC00oO != null && !var2.C00OOC00oO.isEmpty()) {
               this.nVVUuvuNnUN.add(C00OOC00oO(var2.C00OOC00oO));
            }
         }

         if (!this.nVVUuvuNnUN.isEmpty()) {
            for (class_1297 var6 : uUnuvNvvNU.field_1687.method_18112()) {
               if (var6.method_5805()) {
                  String var3 = var6.method_5845().toLowerCase(Locale.ROOT);
                  if (this.nVVUuvuNnUN.contains(var3)) {
                     this.nnuUVNUuvvVU.putIfAbsent(var3, var6);
                  }

                  String var4 = UuUVuuUu(var6).toLowerCase(Locale.ROOT);
                  if (!var4.isEmpty() && this.nVVUuvuNnUN.contains(var4)) {
                     this.nnuUVNUuvvVU.putIfAbsent(var4, var6);
                  }
               }
            }
         }
      }
   }

   private static String C00OOC00oO(String var0) {
      int var1 = var0.indexOf(1);
      String var2 = var1 >= 0 ? var0.substring(0, var1) : var0;
      return var2.toLowerCase(Locale.ROOT);
   }

   static String UuUVuuUu(String var0) {
      if (var0 == null) {
         return "";
      } else {
         int var1 = var0.indexOf(1);
         return var1 >= 0 ? var0.substring(var1 + 1) : var0;
      }
   }

   private class_1297 C00OOC00oO(COcocc0c0Oc.NVnVnNnN var1) {
      return var1.VVuuUN && var1.C00OOC00oO != null && !var1.C00OOC00oO.isEmpty() ? this.nnuUVNUuvvVU.get(C00OOC00oO(var1.C00OOC00oO)) : null;
   }

   private class_243 UuUVuuUu(COcocc0c0Oc.NVnVnNnN var1, class_1297 var2) {
      if (var2 == null) {
         return new class_243(var1.uUnuvNvvNU, var1.vVvUvVVuuNvV, var1.uNNnnnuuuN);
      } else {
         float var3 = uUnuvNvvNU.method_61966().method_60637(true);
         class_243 var4 = var2.method_30950(var3);
         return new class_243(var4.field_1352, var4.field_1351 + var2.method_17682() + this.UuUVuuUu(var4), var4.field_1350);
      }
   }

   private double UuUVuuUu(class_243 var1) {
      if (uUnuvNvvNU.field_1773 != null && uUnuvNvvNU.field_1773.method_19418() != null) {
         double var2 = uUnuvNvvNU.field_1773.method_19418().method_19326().method_1022(var1);
         double var4 = class_3532.method_15350(var2 / 8.0, 0.0, 1.0);
         return 0.45 + 0.9000000000000001 * var4;
      } else {
         return 1.35;
      }
   }

   private String UuUVuuUu(String var1, class_243 var2) {
      int var3 = class_3532.method_15357(var2.field_1352);
      int var4 = class_3532.method_15357(var2.field_1351);
      int var5 = class_3532.method_15357(var2.field_1350);
      Party.NVnVnNnN var6 = this.nNnVnUNVV.computeIfAbsent(var1, var0 -> new Party.NVnVnNnN());
      if (var6.UuUVuuUu == null || var6.C00OOC00oO != var3 || var6.uUnuvNvvNU != var4 || var6.vVvUvVVuuNvV != var5) {
         var6.C00OOC00oO = var3;
         var6.uUnuvNvvNU = var4;
         var6.vVvUvVVuuNvV = var5;
         this.vvUVNVvvNUv.setLength(0);
         this.vvUVNVvvNUv.append(var3).append(", ").append(var4).append(", ").append(var5);
         var6.UuUVuuUu = this.vvUVNVvvNUv.toString();
      }

      return var6.UuUVuuUu;
   }

   private String UuUVuuUu(double var1) {
      int var3 = (int)Math.round(var1);
      if (this.uUVVvVVNvvn.UuUVuuUu == null || this.uUVVvVVNvvn.C00OOC00oO != var3) {
         this.uUVVvVVNvvn.C00OOC00oO = var3;
         this.vvUVNVvvNUv.setLength(0);
         this.vvUVNVvvNUv.append(var3).append(" м");
         this.uUVVvVVNvvn.UuUVuuUu = this.vvUVNVvvNUv.toString();
      }

      return this.uUVVvVVNvvn.UuUVuuUu;
   }

   private float NVNnnvnuunNv() {
      if (uUnuvNvvNU.method_22683() == null) {
         return 2.0F;
      } else {
         float var1 = uUnuvNvvNU.method_22683().method_4495();
         return var1 <= 0.0F ? 2.0F : var1;
      }
   }

   static final class NVnVnNnN {
      String UuUVuuUu;
      int C00OOC00oO = Integer.MIN_VALUE;
      int uUnuvNvvNU = Integer.MIN_VALUE;
      int vVvUvVVuuNvV = Integer.MIN_VALUE;
   }

   static final class nvnNNunvv {
      final long UuUVuuUu;
      private final uVVuNvUUV C00OOC00oO = new uVVuNvUUV();
      private final uVVuNvUUV uUnuvNvvNU = new uVVuNvUUV();

      nvnNNunvv(long var1) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO.UuUVuuUu(1.0, 0.42, VnuVvnV.UUVNuUNUvUnV);
         this.uUnuvNvvNU.UuUVuuUu(1.0, 0.7, VnuVvnV.nvUVNnuu);
      }

      float UuUVuuUu() {
         this.uUnuvNvvNU.UuUVuuUu();
         this.C00OOC00oO.UuUVuuUu();
         return class_3532.method_15363(this.C00OOC00oO.uNNnnnuuuN(), 0.0F, 1.0F);
      }

      float C00OOC00oO() {
         return class_3532.method_15363(this.uUnuvNvvNU.uNNnnnuuuN(), 0.0F, 1.0F);
      }
   }
}
