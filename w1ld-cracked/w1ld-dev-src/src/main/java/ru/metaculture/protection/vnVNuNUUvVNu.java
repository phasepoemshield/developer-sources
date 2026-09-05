package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1792;
import net.minecraft.class_1796;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2656;
import net.minecraft.class_2724;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_7923;
import org.wild.mixin.acceser.ItemCooldownManagerAccessor;
import org.wild.mixin.acceser.ItemCooldownManagerEntryAccessor;

@vuUuvvvNnVV(
   UuUVuuUu = "CoolDownsHUD",
   C00OOC00oO = "i"
)
public final class vnVNuNUUvVNu extends nnvNuuNvvuu {
   private static final vnVNuNUUvVNu UuUVuuUu = new vnVNuNUUvVNu();
   private static final Map<class_1792, vnVNuNUUvVNu.NVnVnNnN> c0oOOCcCoC0 = new ConcurrentHashMap<>();
   private static final List<vnVNuNUUvVNu.NVnVnNnN> VVnVNnunVvu = new ArrayList<>(16);
   private static final List<vnVNuNUUvVNu.nvnNNunvv> unNNVVNnvvV = new ArrayList<>(16);
   private static final VVnnnnN NuunnvnN = new VVnnnnN();
   private static final VVnnnnN NVUunUNUN = new VVnnnnN();
   private static final VVnnnnN UUVNuUNUvUnV = new VVnnnnN();
   private final vvNnnUNnVvn vuvnUnVnUNnV = new vvNnnUNnVvn("Показывать верхушку", true);
   private final vvNnnUNnVvn nnuUVNUuvvVU = new vvNnnUNnVvn("Показывать иконки", true);

   private vnVNuNUUvVNu() {
      this.UuUVuuUu(this.vuvnUnVnUNnV);
      this.UuUVuuUu(this.nnuUVNUuvvVU);
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static vnVNuNUUvVNu C00OOC00oO() {
      return UuUVuuUu;
   }

   public static long UuUVuuUu(class_1792 var0) {
      return var0 == null ? 0L : UuUVuuUu(new class_1799(var0));
   }

   public static void UuUVuuUu(uvUUuvnunU var0) {
      if (var0 != null && !var0.uUnuvNvvNU() && O000c0oocoo.a_.field_1724 != null) {
         if (var0.vVvUvVVuuNvV() instanceof class_2656 var1) {
            class_1792 var5 = (class_1792)class_7923.field_41178.method_63535(var1.comp_3082());
            if (var5 == null || var5 == class_1802.field_8162) {
               return;
            }

            int var3 = var1.comp_2199();
            if (var3 <= 0) {
               c0oOOCcCoC0.remove(var5);
            } else {
               vnVNuNUUvVNu.NVnVnNnN var4 = c0oOOCcCoC0.computeIfAbsent(var5, vnVNuNUUvVNu.NVnVnNnN::new);
               var4.UuUVuuUu(C00OOC00oO(var5));
            }
         } else if (var0.vVvUvVVuuNvV() instanceof class_2724) {
            uVUVnuvnuVuv();
         }
      }
   }

   public static void UuUVuuUu(UnVNvNnU var0, class_332 var1) {
      UuUVuuUu.C00OOC00oO(var0, var1);
   }

   private void C00OOC00oO(UnVNvNnU var1, class_332 var2) {
      if (O000c0oocoo.a_.field_1724 != null && O000c0oocoo.a_.field_1687 != null) {
         UvnvNVnnnnNU();
         VVnVNnunVvu.clear();
         unNNVVNnvvV.clear();
         Iterator var3 = c0oOOCcCoC0.entrySet().iterator();

         while (var3.hasNext()) {
            vnVNuNUUvVNu.NVnVnNnN var4 = (vnVNuNUUvVNu.NVnVnNnN)((Entry)var3.next()).getValue();
            boolean var5 = var4.nuUnNvnuUu > 0L;
            var4.vVvUvVVuuNvV.UuUVuuUu();
            var4.vVvUvVVuuNvV.UuUVuuUu(var5 ? 1.0 : 0.0, 0.15F, VvVUUNUu.UnUNVVVNuv, false);
            if (!var5 && !(var4.vVvUvVVuuNvV.uNNnnnuuuN() > 0.01F)) {
               var3.remove();
            } else {
               VVnVNnunVvu.add(var4);
            }
         }

         VVnVNnunVvu.sort(Comparator.<vnVNuNUUvVNu.NVnVnNnN>comparingLong(var0 -> -var0.nuUnNvnuUu).thenComparing(var0 -> var0.uUnuvNvvNU));
         boolean var83 = !VVnVNnunVvu.isEmpty() || O000c0oocoo.a_.field_1755 instanceof class_408;
         NuunnvnN.UuUVuuUu();
         NuunnvnN.UuUVuuUu(var83 ? 1.0 : 0.0, 0.22F, VvVUUNUu.UnUNVVVNuv, false);
         float var84 = NuunnvnN.uNNnnnuuuN();
         if (!(var84 <= 0.01F)) {
            boolean var85 = this.vuvnUnVnUNnV.uUnuvNvvNU();
            boolean var6 = this.nnuUVNUuvvVU.uUnuvNvvNU();
            boolean var7 = Hud.nUUVuvU();
            unUuuVVuNnNN.NVnVnNnN var8 = var7 ? unUuuVVuNnNN.UuUVuuUu("HUD_CoolDowns") : null;
            float var9 = 24.0F;
            float var10 = var7 ? var8.vNUvnnVnUvu : 7.0F;
            float var11 = var85 ? (var7 ? var8.vuuuNvNuv : 32.0F) : 0.0F;
            float var12 = var7 ? var8.nvUVNnuu : 22.0F;
            float var13 = var7 ? var8.uVUuuVnNVU : 5.0F;
            float var14 = var7 ? var8.UuuNnUvUuv : 28.0F;
            String var15 = "Cooldowns";
            float var16 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var15, var14);
            float var17 = var85 ? var16 + 46.0F : 0.0F;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = 0.0F;

            for (vnVNuNUUvVNu.NVnVnNnN var22 : VVnVNnunVvu) {
               float var23 = var22.vVvUvVVuuNvV.uNNnnnuuuN();
               if (!(var23 <= 0.01F)) {
                  String var24 = UuuNnUvUuv((float)var22.nuUnNvnuUu / 1000.0F);
                  var18 = Math.max(var18, vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var22.uUnuvNvvNU, var9));
                  var19 = Math.max(var19, vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var24, var9));
                  var20 += var12 * var23;
               }
            }

            float var86 = var6 ? 22.0F : 0.0F;
            float var87 = var18 + var86 + 24.0F;
            float var88 = var19 + 20.0F + (var7 ? var8.UnUNVVVNuv : 0.0F);
            float var89 = VVnVNnunVvu.isEmpty() ? 0.0F : var87 + var13 + var88;
            float var25 = Math.max(var17, var89) + var10 * 2.0F;
            var25 = Math.max(var25, var85 ? 104.0F : 74.0F);
            if (var89 > 0.0F) {
               float var26 = var25 - var10 * 2.0F;
               var87 = Math.max(40.0F, var26 - var13 - var88);
            }

            float var91 = var10 + var11 + (var85 && var20 > 0.01F ? var13 : 0.0F) + var20 + var10;
            NVUunUNUN.UuUVuuUu();
            UUVNuUNUvUnV.UuUVuuUu();
            NVUunUNUN.UuUVuuUu(var25, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            UUVNuUNUvUnV.UuUVuuUu(var91, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
            float var27 = NVUunUNUN.uNNnnnuuuN();
            float var28 = UUVNuUNUvUnV.uNNnnnuuuN();
            float var29 = O000c0oocoo.a_.method_22683().method_4489();
            nNuUNVu.nvnNNunvv var30 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_CoolDowns", Math.max(10.0F, var29 - var27 - 10.0F), 140.0F, var27, var28);
            float var31 = var30.C00OOC00oO;
            float var32 = var30.uUnuvNvvNU;
            float var33 = var30.vVvUvVVuuNvV;
            float var34 = var30.uNNnnnuuuN;
            this.UuUVuuUu(var31, var32, var33, var34);
            float var35 = var33 / Math.max(1.0F, var27);
            float var36 = var34 / Math.max(1.0F, var28);
            float var37 = Math.min(var35, var36);
            float var38 = var10 * var35;
            float var39 = var10 * var36;
            float var40 = var11 * var36;
            float var41 = var12 * var36;
            float var42 = var13 * var35;
            float var43 = var13 * var36;
            float var44 = var9 * var37;
            float var45 = var87 * var35;
            float var46 = var88 * var35;
            float var47 = var33 - var38 * 2.0F;
            float var48 = var84 * this.uVunuUNVVUUV.uUnuvNvvNU();
            int var49 = this.UuUVuuUu(var48);
            int var50 = this.C00OOC00oO(var48);
            int var51 = this.uUnuvNvvNU(var48);
            int var52 = this.vVvUvVVuuNvV(var48);
            int var53 = this.uNNnnnuuuN(var48);
            int var54 = this.vNUvnnVnUvu(var48);
            float var55 = var7 ? var8.UuUVuuUu : 14.0F;
            float var56 = var7 ? var8.C00OOC00oO : 11.0F;
            float var57 = var7 ? var8.vVvUvVVuuNvV : 7.0F;
            float var58 = var7 ? var8.uNNnnnuuuN : 7.0F;
            float var59 = var7 ? var8.vNVuvnUUnuUn : 1.9F;
            this.UuUVuuUu(var1, var31, var32, var33, var34, var55, var48);
            if (var85) {
               if (this.nvUVNnuu()) {
                  this.UuUVuuUu(var1, var31 + var38, var32 + var39, var47, var40, var56, var48);
               } else if (var7) {
                  var1.UuUVuuUu(var31 + var38, var32 + var39, var47, var40, var56, var50);
               } else {
                  var1.UuUVuuUu(var31 + var38, var32 + var39, var47, var40, 11.0F, 11.0F, 4.0F, 4.0F, var50);
               }

               float var60 = var7 ? var31 + var8.UvnvNVnnnnNU.UuUVuuUu * var35 : var31 + var38 + 10.0F * var35;
               float var61 = var7 ? var32 + var8.UvnvNVnnnnNU.C00OOC00oO * var36 : var32 + var39 + var40 * 0.5F + 6.0F * var36;
               var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var60, var61, var14 * var37, var15, var53);
               float var62 = 22.0F * var36;
               float var63 = var31 + var38 + var47 - 10.0F * var35 - var62;
               float var64 = var32 + var39 + (var40 - var62) * 0.5F;
               float var65 = (var7 ? var8.nUUVuvU : var9) * var37;
               float var66 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.uNNnnnuuuN, "g", var65);
               float var67 = var7
                  ? (var8.uVUVnuvnuVuv.uUnuvNvvNU ? var31 + var33 : var31) + var8.uVUVnuvnuVuv.UuUVuuUu * var35
                  : var63 + (var62 - var66) * 0.8F;
               float var68 = var7 ? var32 + var8.uVUVnuvnuVuv.C00OOC00oO * var36 : var64 + var62 * 0.55F + 5.5F * var36;
               var1.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, var67, var68, var65, "g", var54);
            }

            float var92 = var32 + var39 + var40 + (var85 && var20 > 0.01F ? var43 : 0.0F);
            float var93 = var31 + var38 + (var7 ? var8.NVNnnvnuunNv.UuUVuuUu * var35 : 0.0F);
            float var94 = var92 + (var7 ? var8.NVNnnvnuunNv.C00OOC00oO * var36 : 0.0F);
            float var95 = var31 + var38 + var45 + var42 + (var7 ? var8.uVunuUNVVUUV.UuUVuuUu * var35 : 0.0F);
            float var96 = var92 + (var7 ? var8.uVunuUNVVUUV.C00OOC00oO * var36 : 0.0F);
            float var97 = var20 * var36;
            if (var97 > 0.01F && this.vNUvnnVnUvu()) {
               if (this.nvUVNnuu()) {
                  this.C00OOC00oO(var1, var93, var94, var45, var97, var57, var48);
                  this.C00OOC00oO(var1, var95, var96, var46, var97, var58, var48);
               } else if (var7) {
                  var1.UuUVuuUu(var93, var94, var45, var97, var57, var51);
                  var1.UuUVuuUu(var95, var96, var46, var97, var58, var51);
               } else {
                  var1.UuUVuuUu(var93, var94, var45, var97, var85 ? 4.0F : 11.0F, var85 ? 4.0F : 11.0F, 4.0F, 11.0F, var51);
                  var1.UuUVuuUu(var95, var96, var46, var97, 4.0F, var85 ? 4.0F : 11.0F, 11.0F, 4.0F, var51);
               }
            }

            var1.uUnuvNvvNU();
            var1.UuUVuuUu(var31, var32, var33, var34, var55, var55, var55, var55);

            try {
               float var98 = var94;
               float var99 = var96;

               for (int var100 = 0; var100 < VVnVNnunVvu.size(); var100++) {
                  vnVNuNUUvVNu.NVnVnNnN var69 = VVnVNnunVvu.get(var100);
                  float var70 = var69.vVvUvVVuuNvV.uNNnnnuuuN();
                  if (!(var70 <= 0.01F)) {
                     String var71 = UuuNnUvUuv((float)var69.nuUnNvnuUu / 1000.0F);
                     int var72 = (int)(255.0F * var48 * var70);
                     int var73 = VnVnuUn.UuUVuuUu(this.uNNnnnuuuN(1.0F), var72);
                     int var74 = VnVnuUn.UuUVuuUu(this.vNUvnnVnUvu(1.0F), var72);
                     float var75 = (1.0F - var70) * 8.0F * var35;
                     float var76 = var93 + 10.0F * var35 - var75;
                     if (var59 > 0.05F) {
                        var1.UuUVuuUu(var76, var98 + (var41 - 8.0F * var36) * 0.5F, var59 * var35, 8.0F * var36, Math.max(0.7F, var59 * 0.5F) * var35, var74);
                     }

                     var76 += 8.0F * var35;
                     if (var6) {
                        float var77 = 0.9F * var37;
                        float var78 = 16.0F * var77;
                        float var79 = var98 + (var41 - var78) * 0.5F;
                        unNNVVNnvvV.add(new vnVNuNUUvVNu.nvnNNunvv(var69.C00OOC00oO, var76, var79, var77, var100));
                        var76 += 20.0F * var35;
                     }

                     var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var76, var98 + var41 * 0.5F + 4.0F * var36, var44, var69.uUnuvNvvNU, var73);
                     var69.uNNnnnuuuN.UuUVuuUu(var71, var69.nuUnNvnuUu);
                     float var104 = var95 + var46 * 0.5F + var75;
                     float var105 = var99 + var41 * 0.5F + 4.0F * var36;
                     var69.uNNnnnuuuN
                        .UuUVuuUu(var1, vNvnnVvvVUu.UuUVuuUu, var95, var99, var46, var41, Math.min(var58, var41 * 0.5F), var104, var105, var44, var74);
                     var98 += var41 * var70;
                     var99 += var41 * var70;
                  }
               }

               if (!unNNVVNnvvV.isEmpty()) {
                  var1.uUnuvNvvNU();

                  for (vnVNuNUUvVNu.nvnNNunvv var102 : unNNVVNnvvV) {
                     NuNvVUuUUnun.UuUVuuUu(
                        var1,
                        var102.stack,
                        NuNvVUuUUnun.UuUVuuUu(var102.x),
                        NuNvVUuUUnun.UuUVuuUu(var102.y),
                        NuNvVUuUUnun.uUnuvNvvNU(var102.scale),
                        var102.seed,
                        false,
                        var102.seed
                     );
                  }
               }
            } finally {
               var1.uUnuvNvvNU();
               var1.nuUnNvnuUu();
            }

            nNuUNVu.UuUVuuUu().UuUVuuUu(var30);
            UuUuVnVvnvn.UuUVuuUu(
               var1, this, var30, nNuUNVu.UuUVuuUu(), O000c0oocoo.a_.method_22683().method_4486(), O000c0oocoo.a_.method_22683().method_4502()
            );
         }
      } else {
         uVUVnuvnuVuv();
         NuunnvnN.nuUnNvnuUu(0.0);
         VVnVNnunVvu.clear();
         unNNVVNnvvV.clear();
      }
   }

   private static String UuuNnUvUuv(float var0) {
      int var1 = Math.max(0, Math.round(var0 * 10.0F));
      return var1 / 10 + "." + var1 % 10 + "s";
   }

   private static void UvnvNVnnnnNU() {
      if (O000c0oocoo.a_.field_1724 == null) {
         uVUVnuvnuVuv();
      } else {
         for (vnVNuNUUvVNu.NVnVnNnN var1 : c0oOOCcCoC0.values()) {
            var1.nuUnNvnuUu = 0L;
         }

         class_1796 var9 = O000c0oocoo.a_.field_1724.method_7357();
         ItemCooldownManagerAccessor var10 = (ItemCooldownManagerAccessor)var9;
         int var2 = var10.wild$getTick();

         for (Entry var4 : var10.wild$getEntries().entrySet()) {
            long var5 = UuUVuuUu(var4.getValue(), var2);
            if (var5 > 0L) {
               class_1792 var7 = (class_1792)class_7923.field_41178.method_63535((class_2960)var4.getKey());
               if (var7 != null && var7 != class_1802.field_8162) {
                  vnVNuNUUvVNu.NVnVnNnN var8 = c0oOOCcCoC0.computeIfAbsent(var7, vnVNuNUUvVNu.NVnVnNnN::new);
                  var8.UuUVuuUu(C00OOC00oO(var7));
                  var8.nuUnNvnuUu = Math.max(var8.nuUnNvnuUu, var5);
               }
            }
         }
      }
   }

   private static long UuUVuuUu(class_1799 var0) {
      if (O000c0oocoo.a_.field_1724 != null && var0 != null && !var0.method_7960()) {
         class_1796 var1 = O000c0oocoo.a_.field_1724.method_7357();
         ItemCooldownManagerAccessor var2 = (ItemCooldownManagerAccessor)var1;
         Object var3 = var2.wild$getEntries().get(var1.method_62836(var0));
         return var3 == null ? 0L : UuUVuuUu(var3, var2.wild$getTick());
      } else {
         return 0L;
      }
   }

   private static long UuUVuuUu(Object var0, int var1) {
      int var2 = ((ItemCooldownManagerEntryAccessor)var0).wild$getEndTick() - var1;
      return var2 > 0 ? var2 * 50L : 0L;
   }

   private static void uVUVnuvnuVuv() {
      if (!c0oOOCcCoC0.isEmpty()) {
         c0oOOCcCoC0.clear();
      }
   }

   static class_1799 C00OOC00oO(class_1792 var0) {
      if (O000c0oocoo.a_.field_1724 != null) {
         for (int var1 = 0; var1 < 36; var1++) {
            class_1799 var2 = O000c0oocoo.a_.field_1724.method_31548().method_5438(var1);
            if (!var2.method_7960() && var2.method_31574(var0)) {
               return var2.method_7972();
            }
         }

         class_1799 var3 = O000c0oocoo.a_.field_1724.method_6079();
         if (!var3.method_7960() && var3.method_31574(var0)) {
            return var3.method_7972();
         }
      }

      if (var0 == class_1802.field_8634) {
         class_1799 var4 = ClickPearl.UuuNnUvUuv();
         if (!var4.method_7960()) {
            return var4;
         }
      }

      return new class_1799(var0);
   }

   static String UuUVuuUu(class_1799 var0, class_1792 var1) {
      String var2 = var0.method_7964().getString();
      if (var2 != null && !var2.isBlank()) {
         return var2;
      } else {
         class_2960 var3 = class_7923.field_41178.method_10221(var1);
         String var4 = var3.method_12832().replace('_', ' ');
         StringBuilder var5 = new StringBuilder();

         for (String var9 : var4.split(" ")) {
            if (!var9.isEmpty()) {
               var5.append(Character.toUpperCase(var9.charAt(0))).append(var9.substring(1)).append(" ");
            }
         }

         return var5.toString().trim();
      }
   }

   static class NVnVnNnN {
      final class_1792 UuUVuuUu;
      class_1799 C00OOC00oO;
      String uUnuvNvvNU;
      final VVnnnnN vVvUvVVuuNvV = new VVnnnnN();
      final VnuuvvUv uNNnnnuuuN = new VnuuvvUv();
      long nuUnNvnuUu;

      NVnVnNnN(class_1792 var1) {
         this.UuUVuuUu = var1;
         this.UuUVuuUu(vnVNuNUUvVNu.C00OOC00oO(var1));
         this.vVvUvVVuuNvV.nuUnNvnuUu(0.0);
      }

      void UuUVuuUu(class_1799 var1) {
         this.C00OOC00oO = var1;
         this.uUnuvNvvNU = vnVNuNUUvVNu.UuUVuuUu(var1, this.UuUVuuUu);
      }
   }

   record nvnNNunvv(class_1799 stack, float x, float y, float scale, int seed) {
   }
}
