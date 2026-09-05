package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_268;
import net.minecraft.class_269;
import net.minecraft.class_310;
import net.minecraft.class_345;
import net.minecraft.class_8646;
import net.minecraft.class_9011;
import org.wild.mixin.acceser.BossBarHudAccessor;

public class vnvuUUVun {
   public static final vnvuUUVun UuUVuuUu = new vnvuUUVun();
   private static final Pattern uUnuvNvvNU = Pattern.compile("(?iu)(?:анарх(?:ия|ии)?|anarchy|an)\\s*[-:#№]?\\s*(\\d{1,5})");
   private static final Pattern vVvUvVVuuNvV = Pattern.compile("([a-zA-Z0-9_]{3,16})");
   private static final Pattern uNNnnnuuuN = Pattern.compile("Монет:\\s*(.+)");
   private static final Pattern nuUnNvnuUu = Pattern.compile("Токенов:\\s*(\\d+)");
   private static final Pattern VVuuUN = Pattern.compile("Ранг:\\s*(.+)");
   private static final Pattern vNUvnnVnUvu = Pattern.compile("Убийств:\\s*(\\d+)");
   private static final Pattern uVUuuVnNVU = Pattern.compile("Смертей:\\s*(\\d+)");
   private static final Pattern vuuuNvNuv = Pattern.compile("Наиграно:\\s*(.+)");
   public static String C00OOC00oO = "N/A";
   private String nvUVNnuu = "N/A";
   private String UuuNnUvUuv = "N/A";
   private String nUUVuvU = "N/A";
   private String UnUNVVVNuv = "0";
   private String vNVuvnUUnuUn = "0";
   private String UvnvNVnnnnNU = "0";
   private String uVUVnuvnuVuv = "0";
   private String NVNnnvnuunNv = "0";
   private long uVunuUNVVUUV;

   public void UuUVuuUu(long var1) {
      long var3 = System.currentTimeMillis();
      if (var3 - this.uVunuUNVVUUV >= var1) {
         this.uVunuUNVVUUV = var3;
         this.UuUVuuUu();
      }
   }

   public void UuUVuuUu() {
      class_310 var1 = class_310.method_1551();
      this.nvUVNnuu = "N/A";
      this.UnUNVVVNuv = "0";
      this.vNVuvnUUnuUn = "0";
      this.UvnvNVnnnnNU = "0";
      this.uVUVnuvnuVuv = "0";
      this.NVNnnvnuunNv = "0";
      if (var1.field_1687 != null && var1.field_1724 != null) {
         class_269 var2 = var1.field_1687.method_8428();
         class_266 var3 = var2.method_1189(class_8646.field_45157);
         if (var3 != null) {
            String var4 = var3.method_1114().getString();
            Matcher var5 = uUnuvNvvNU.matcher(this.UuUVuuUu(var4));
            if (var5.find()) {
               this.nvUVNnuu = var5.group(1);
            }

            List var6 = this.UuUVuuUu(var2, var3);

            for (int var7 = 0; var7 < var6.size(); var7++) {
               String var8 = (String)var6.get(var7);
               String var9 = this.UuUVuuUu(var8);
               if ("N/A".equals(this.nvUVNnuu)) {
                  Matcher var10 = uUnuvNvvNU.matcher(var9);
                  if (var10.find()) {
                     this.nvUVNnuu = var10.group(1);
                  }
               }

               if (var7 < 5 && !var9.contains(":") && !var9.contains("=") && !var9.trim().isEmpty()) {
                  Matcher var16 = vVvUvVVuuNvV.matcher(var9);
                  if (var16.find()) {
                     this.UuuNnUvUuv = var16.group(1);
                     C00OOC00oO = this.UuuNnUvUuv;
                  }
               }

               Matcher var17 = VVuuUN.matcher(var9);
               if (var17.find()) {
                  this.nUUVuvU = var17.group(1).trim();
               }

               Matcher var11 = uNNnnnuuuN.matcher(var9);
               if (var11.find()) {
                  String var12 = var11.group(1);
                  this.UnUNVVVNuv = var12.replaceAll("[^0-9]", "");
               }

               Matcher var18 = nuUnNvnuUu.matcher(var9);
               if (var18.find()) {
                  this.vNVuvnUUnuUn = var18.group(1);
               }

               Matcher var13 = vNUvnnVnUvu.matcher(var9);
               if (var13.find()) {
                  this.UvnvNVnnnnNU = var13.group(1);
               }

               Matcher var14 = uVUuuVnNVU.matcher(var9);
               if (var14.find()) {
                  this.uVUVnuvnuVuv = var14.group(1);
               }

               Matcher var15 = vuuuNvNuv.matcher(var9);
               if (var15.find()) {
                  this.NVNnnvnuunNv = var15.group(1);
               }
            }
         }
      }
   }

   private List<String> UuUVuuUu(class_269 var1, class_266 var2) {
      ArrayList var3 = new ArrayList();
      Collection var4 = var1.method_1184(var2);
      ArrayList var5 = new ArrayList(var4);
      var5.sort(Comparator.comparingInt(class_9011::comp_2128).reversed());
      int var6 = Math.min(var5.size(), 15);

      for (int var7 = 0; var7 < var6; var7++) {
         class_9011 var8 = (class_9011)var5.get(var7);
         class_268 var9 = var1.method_1164(var8.comp_2127());
         var3.add(class_268.method_1142(var9, class_2561.method_43470(var8.comp_2127())).getString());
      }

      return var3;
   }

   private String UuUVuuUu(String var1) {
      return var1 == null ? "" : var1.replaceAll("(?i)§[0-9a-fk-or]", "").trim();
   }

   public static boolean C00OOC00oO() {
      if (O000c0oocoo.a_.field_1705 != null && O000c0oocoo.a_.field_1705.method_1740() != null) {
         Map var0 = ((BossBarHudAccessor)O000c0oocoo.a_.field_1705.method_1740()).getBossBars();

         for (class_345 var2 : var0.values()) {
            String var3 = var2.method_5414().getString().toLowerCase();
            if (var3.contains("pvp-режим") || var3.contains("пвп")) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Generated
   public String uUnuvNvvNU() {
      return this.nvUVNnuu;
   }

   @Generated
   public String vVvUvVVuuNvV() {
      return this.UuuNnUvUuv;
   }

   @Generated
   public String uNNnnnuuuN() {
      return this.nUUVuvU;
   }

   @Generated
   public String nuUnNvnuUu() {
      return this.UnUNVVVNuv;
   }

   @Generated
   public String VVuuUN() {
      return this.vNVuvnUUnuUn;
   }

   @Generated
   public String vNUvnnVnUvu() {
      return this.UvnvNVnnnnNU;
   }

   @Generated
   public String uVUuuVnNVU() {
      return this.uVUVnuvnuVuv;
   }

   @Generated
   public String vuuuNvNuv() {
      return this.NVNnnvnuunNv;
   }

   @Generated
   public long nvUVNnuu() {
      return this.uVunuUNVVUUV;
   }
}
