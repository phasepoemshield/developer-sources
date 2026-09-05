package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.class_10017;
import net.minecraft.class_10042;
import net.minecraft.class_1044;
import net.minecraft.class_10868;
import net.minecraft.class_124;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_266;
import net.minecraft.class_269;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_490;
import net.minecraft.class_5250;
import net.minecraft.class_640;
import net.minecraft.class_8646;
import net.minecraft.class_897;
import net.minecraft.class_9013;
import net.minecraft.class_9025;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Quaternionf;
import org.joml.Vector3f;

@vuUuvvvNnVV(
   UuUVuuUu = "TargetHUD",
   C00OOC00oO = "w"
)
public final class O0oo00cC00o extends nnvNuuNvvuu {
   private static final O0oo00cC00o UuUVuuUu = new O0oo00cC00o();
   private static final Logger c0oOOCcCoC0 = LogManager.getLogger("TargetHUD");
   private static final VVnnnnN VVnVNnunVvu = new VVnnnnN();
   private static final VVnnnnN unNNVVNnvvV = new VVnnnnN();
   private static final UUNnvUVnnnnN NuunnvnN = new UUNnvUVnnnnN(0.0F);
   private static final UUNnvUVnnnnN NVUunUNUN = new UUNnvUVnnnnN(0.0F);
   private static final UUNnvUVnnnnN UUVNuUNUvUnV = new UUNnvUVnnnnN(0.0F);
   private static final List<O0oo00cC00o.nvnNNunvv> vuvnUnVnUNnV = new ArrayList<>();
   private static final class_1799[] nnuUVNUuvvVU = new class_1799[4];
   private static final Pattern nVVUuvuNnUN = Pattern.compile("(?i)(?:\\u00A7|\\u0412\\u00A7).");
   private static final Pattern nNnVnUNVV = Pattern.compile("\\d+(?:[\\.,]\\d+)?");
   private static final Pattern nuunNvv = Pattern.compile("[^A-Za-z\\u0410-\\u042F\\u0430-\\u044F\\u0401\\u04510-9\\s\\[\\]()_\\-.,!<>:|]");
   private final vvNnnUNnVvn uUVVvVVNvvn = new vvNnnUNnVvn("При наводке", false);
   private final vvNnnUNnVvn vvUVNVvvNUv = new vvNnnUNnVvn("Анимировать при ударе", true);
   private final vvNnnUNnVvn UuNnnVnuNNV = new vvNnnUNnVvn("Золотые сердца", true);
   private final UvNnUnuNUUU uUVvnUuNvvN = new UvNnUnuNUUU("Вид отображения", "Голова", "Голова", "От 3-лица");
   private final UvNnUnuNUUU UUuUnNVNuuv = new UvNnUnuNUUU("Позиция", "На экране", "На экране", "На цели");
   private final nNUuNvVn NVuNUuVnVUN = new nNUuNvVn("Смещение X", 0.0F, -0.25F, 0.25F, 0.01F, false).UuUVuuUu(() -> !this.UUuUnNVNuuv.C00OOC00oO("На цели"));
   private static float NVuunNnvvvVu;
   private static float vNnNuuvVn;
   private static final float VUuuVUnun = 0.58F;
   private static final float vVVuuVVv = 130.0F;
   private static float VuunNUUUvu;
   private static float NNUUNUuVNNVn;
   private static float VvVvnNUnvuvV;
   private static class_1309 ccOO0COcoco0;
   private static int NUVvUUVuVNVv = Integer.MIN_VALUE;
   private static int nNuVunNUVu = Integer.MIN_VALUE;
   private static int UNvvunVVn = Integer.MIN_VALUE;
   private static int UnvuVuVnNuvu;
   private static float UvNNVUVNVuvV = Float.NaN;
   private static int NnunUUnU = 1;
   private static final long nvuVvuNnNUnv = 1000L;
   private static final Map<String, Long> NnVnNVN = new HashMap<>();
   private static final Map<String, Long> vnvvNvUnVv = new HashMap<>();

   private O0oo00cC00o() {
      this.UuUVuuUu(this.uUVVvVVNvvn);
      this.UuUVuuUu(this.vvUVNVvvNUv);
      this.UuUVuuUu(this.UuNnnVnuNNV);
      this.UuUVuuUu(this.uUVvnUuNvvN);
      this.UuUVuuUu(this.UUuUnNVNuuv);
      this.UuUVuuUu(this.NVuNUuVnVUN);
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static O0oo00cC00o C00OOC00oO() {
      return UuUVuuUu;
   }

   public static float UuUVuuUu(class_1309 var0) {
      if (var0 instanceof class_1657 var1) {
         Float var2 = C00OOC00oO(var1);
         if (var2 != null) {
            return Math.max(0.0F, var2);
         }
      }

      float var3 = var0.method_6032() + uUnuvNvvNU(var0);
      return Math.max(0.0F, var3);
   }

   private static float C00OOC00oO(class_1309 var0) {
      if (var0 instanceof class_1657 var1) {
         Float var2 = C00OOC00oO(var1);
         if (var2 != null) {
            return Math.max(0.0F, var2);
         }
      }

      return UuvVnuU.vuuuNvNuv(var0.method_6032(), 0.0F, var0.method_6063());
   }

   private static Float C00OOC00oO(class_1657 var0) {
      if (O000c0oocoo.a_.field_1687 != null) {
         Float var1 = UuUVuuUu(var0, O000c0oocoo.a_.field_1687.method_8428());
         if (var1 != null) {
            return var1;
         }
      }

      return UuUVuuUu(var0, var0.method_7327());
   }

   private static Float UuUVuuUu(class_1657 var0, class_269 var1) {
      if (var1 == null) {
         return null;
      } else {
         class_266 var2 = var1.method_1189(class_8646.field_45158);
         if (var2 == null) {
            return null;
         } else {
            class_9013 var3 = var1.method_55430(var0, var2);
            if (var3 == null) {
               return null;
            } else {
               class_5250 var4 = class_9013.method_55398(var3, var2.method_55380(class_9025.field_47566));
               Float var5 = vVvUvVVuuNvV(var4.getString());
               return var5 != null ? var5 : (float)var3.method_55397();
            }
         }
      }
   }

   private static Float vVvUvVVuuNvV(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String var1 = nVVUuvuNnUN.matcher(var0).replaceAll("").replace(',', '.');
         Matcher var2 = nNnVnUNVV.matcher(var1);
         if (!var2.find()) {
            return null;
         } else {
            try {
               return Float.parseFloat(var2.group());
            } catch (NumberFormatException var4) {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static float uUnuvNvvNU(class_1309 var0) {
      try {
         return Math.max(0.0F, var0.method_6067());
      } catch (Throwable var2) {
         return 0.0F;
      }
   }

   public static void UuUVuuUu(UnVNvNnU var0, class_332 var1) {
      UuUVuuUu.C00OOC00oO(var0, var1);
   }

   public void C00OOC00oO(UnVNvNnU var1, class_332 var2) {
      if (!(O000c0oocoo.a_.field_1755 instanceof class_490)) {
         Object var3 = null;
         class_1309 var5 = AttackAura.ccOO0COcoco0;
         if (var5 instanceof class_1309) {
            var3 = var5;
         }

         if (var3 == null) {
            class_1309 var4 = TriggerBot.UuuNnUvUuv();
            if (var4 != null) {
               var3 = var4;
            }
         }

         if (var3 == null && this.uUVVvVVNvvn.uUnuvNvvNU() && O000c0oocoo.a_.field_1692 instanceof class_1309 var97 && var97.method_5805()) {
            var3 = var97;
         }

         if (var3 == null && O000c0oocoo.a_.field_1755 instanceof class_408 && O000c0oocoo.a_.field_1724 != null) {
            var3 = O000c0oocoo.a_.field_1724;
         }

         boolean var96 = var3 != null;
         if (var96) {
            ccOO0COcoco0 = (class_1309)var3;
         }

         VVnVNnunVvu.UuUVuuUu();
         VVnVNnunVvu.UuUVuuUu(var96 ? 1.0 : 0.0, 0.22F, VvVUUNUu.UnUNVVVNuv, true);
         float var98 = VVnVNnunVvu.uNNnnnuuuN();
         Object var6 = var96 ? var3 : ccOO0COcoco0;
         if (!(var98 <= 0.01F) && var6 != null) {
            boolean var7 = this.UuNnnVnuNNV.uUnuvNvvNU();
            Float var8 = var6 instanceof class_1657 var9 ? C00OOC00oO(var9) : null;
            float var99 = var8 != null ? Math.max(0.0F, var8) : (var7 ? C00OOC00oO((class_1309)var6) : UuUVuuUu((class_1309)var6));
            float var10 = var7 && var8 == null ? uUnuvNvvNU((class_1309)var6) : 0.0F;
            float var11 = var7 ? var99 + var10 : var99;
            float var12 = Math.max(1.0F, Math.max(var6.method_6063(), var99));
            float var13 = Math.min(1.0F, var99 / var12);
            float var14 = Math.min(1.0F, var10 / var12);
            float var15 = vNUvnnVnUvu((class_1309)var6);
            if (var8 != null) {
               UUVNuUNUvUnV.UuUVuuUu(0.0F);
            }

            if (NUVvUUVuVNVv != var6.method_5628()) {
               NUVvUUVuVNVv = var6.method_5628();
               NuunnvnN.UuUVuuUu(var13);
               NVUunUNUN.UuUVuuUu(var15);
               UUVNuUNUvUnV.UuUVuuUu(var14);
            }

            VuunNUUUvu = UuvVnuU.vuuuNvNuv(NuunnvnN.UuUVuuUu(var13, Cc0cOoOcC0o.uVUuuVnNVU()), 0.0F, 1.0F);
            NNUUNUuVNNVn = UuvVnuU.vuuuNvNuv(NVUunUNUN.UuUVuuUu(var15, Cc0cOoOcC0o.uVUuuVnNVU()), 0.0F, 1.0F);
            VvVvnNUnvuvV = UuvVnuU.vuuuNvNuv(UUVNuUNUvUnV.UuUVuuUu(var14, Cc0cOoOcC0o.uVUuuVnNVU()), 0.0F, 1.0F);
            boolean var16 = UuUVuuUu((class_1309)var6, var11);
            unNNVVNnvvV.UuUVuuUu();
            if (var16 && this.vvUVNVvvNUv.uUnuvNvvNU()) {
               NnunUUnU = (System.nanoTime() & 1L) == 0L ? 1 : -1;
               unNNVVNnvvV.nuUnNvnuUu(1.0);
            }

            unNNVVNnvvV.UuUVuuUu(0.0, 0.34F, VvVUUNUu.UnUNVVVNuv, false);
            float var17 = this.vvUVNVvvNUv.uUnuvNvvNU() ? UuvVnuU.vuuuNvNuv(unNNVVNnvvV.uNNnnnuuuN(), 0.0F, 1.0F) : 0.0F;
            String var18 = "";
            float var19 = var98 * this.uVunuUNVVUUV.uUnuvNvvNU();
            boolean var20 = this.nvUVNnuu();
            String var21 = var6.method_5477().getString();
            if (var6 instanceof class_1657 var22) {
               var18 = UuUVuuUu(var22);
            }

            var21 = ProtectInfo.uUnuvNvvNU(var21);
            if (!var18.isEmpty()) {
               var18 = var18 + " ";
            }

            var21 = uNNnnnuuuN(var21);
            String var102 = UuuNnUvUuv(var11);
            String var23 = " hp";
            float var24 = 252.204F;
            float var25 = 85.472F;
            float var26 = O000c0oocoo.a_.method_22683().method_4506();
            float var27 = O000c0oocoo.a_.method_22683().method_4489();
            boolean var28 = this.UUuUnNVNuuv.C00OOC00oO("На цели");
            nNuUNVu.nvnNNunvv var34 = null;
            O0oo00cC00o.NVnVnNnN var35 = null;
            float var29;
            float var30;
            float var31;
            float var32;
            float var33;
            if (var28) {
               float var36 = O000c0oocoo.a_.method_61966().method_60637(true);
               var35 = this.UuUVuuUu((class_1309)var6, var36, (int)var27, (int)var26);
               if (var35 == null) {
                  return;
               }

               float var37 = this.UvnvNVnnnnNU();
               var33 = var37;
               var31 = var24 * var37;
               var32 = var25 * var37;
               var29 = var35.x - var31 * 0.5F;
               var30 = var35.y - var32 * 0.5F;
               if (O000c0oocoo.a_.field_1755 instanceof class_408) {
                  var34 = nNuUNVu.UuUVuuUu().C00OOC00oO("HUD_TargetHUD", var29, var30, var24, var25);
                  var33 = Math.min(var34.vVvUvVVuuNvV / var24, var34.uNNnnnuuuN / var25);
                  var31 = var24 * var33;
                  var32 = var25 * var33;
                  var29 = var35.x - var31 * 0.5F;
                  var30 = var35.y - var32 * 0.5F;
               }
            } else {
               var34 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_TargetHUD", 10.0F, Math.max(10.0F, var26 - var25 - 10.0F), var24, var25);
               float var103 = var34.C00OOC00oO;
               float var105 = var34.uUnuvNvvNU;
               float var38 = var34.vVvUvVVuuNvV;
               float var39 = var34.uNNnnnuuuN;
               var33 = Math.min(var38 / var24, var39 / var25);
               var31 = var24 * var33;
               var32 = var25 * var33;
               var29 = var103 + (var38 - var31) / 2.0F;
               var30 = var105 + (var39 - var32) / 2.0F;
            }

            this.UuUVuuUu(var29, var30, var31, var32);
            int var104 = (int)(255.0F * var19);
            int var106 = this.uNNnnnuuuN(var19);
            int var107 = var106;
            if (var6 instanceof class_1657 var108) {
               var107 = UuUVuuUu(var108, var106, var104);
            }

            float var109 = 14.0F * var33;
            int var40 = this.vVvUvVVuuNvV(var19);
            int var41 = this.C00OOC00oO(var19);
            float var43 = UuvVnuU.vuuuNvNuv((VuunNUUUvu - 0.16F) / 0.84F, 0.0F, 1.0F);
            int var44 = UuUVuuUu(VnVnuUn.uUnuvNvvNU(255, 84, 96, var104), VnVnuUn.uUnuvNvvNU(128, 255, 171, var104), var43);
            int var45 = UuUVuuUu(VnVnuUn.uUnuvNvvNU(210, 35, 52, var104), VnVnuUn.uUnuvNvvNU(34, 213, 122, var104), var43);
            int var46 = VnVnuUn.uUnuvNvvNU(192, 220, 255, var104);
            int var47 = VnVnuUn.uUnuvNvvNU(86, 132, 202, var104);
            int var48 = this.nuUnNvnuUu(var19);
            float var49 = var29 + 7.0F * var33;
            float var50 = var30 + 6.834F * var33;
            float var51 = 71.799F * var33;
            float var52 = 71.803F * var33;
            float var53 = 54.367F * var33;
            float var54 = var29 + 15.716F * var33;
            float var55 = var30 + 15.552F * var33;
            float var56 = var28 ? var19 : var19 * UuvVnuU.vuuuNvNuv((var98 - 0.42F) / 0.58F, 0.0F, 1.0F);
            boolean var57 = this.uUVvnUuNvvN.vVvUvVVuuNvV.size() > 1 && this.uUVvnUuNvvN.uUnuvNvvNU().equalsIgnoreCase(this.uUVvnUuNvvN.vVvUvVVuuNvV.get(1));
            float var58 = var29 + 84.185F * var33;
            float var59 = 161.02F * var33;
            float var60 = var30 + 6.834F * var33;
            float var61 = 31.592F * var33;
            if (var20) {
               VVNunVNVuuu.UuUVuuUu();
            }

            try {
               this.UuUVuuUu(var1, var29, var30, var31, var32, var109, var19);
               this.C00OOC00oO(var1, var49, var50, var51, var52, 10.0F * var33, var19);
               this.C00OOC00oO(var1, var58, var60, var59, var61, 9.0F * var33, var19);
               if (var20) {
                  VVNunVNVuuu.C00OOC00oO();
               }

               float var62 = 30.0F * var33;
               float var63 = 20.0F * var33;
               float var64 = var29 + 94.33F * var33;
               float var65 = var60 + var61 / 2.0F + 6.6F * var33;
               float var66 = var58 + var59 - 10.0F * var33;
               if (!var18.isEmpty()) {
                  int var67 = var107 == var106 ? VnVnuUn.uUnuvNvvNU(255, 50, 50, var104) : var107;
                  String var68 = var18.trim().toUpperCase(Locale.ROOT);
                  float var69 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var68, var63).UuUVuuUu;
                  String var70 = UuUVuuUu(var1, var21, var62, Math.max(20.0F * var33, var66 - var64 - var69 - 5.0F * var33));
                  var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var64, var65, var62, var70, var106);
                  var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var66 - var69, var65 - 0.5F * var33, var63, var68, var67);
               } else {
                  String var115 = UuUVuuUu(var1, var21, var62, Math.max(20.0F * var33, var66 - var64));
                  var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var64, var65, var62, var115, var106);
               }
            } finally {
               if (var20) {
                  VVNunVNVuuu.uUnuvNvvNU();
               }
            }

            float var110 = var30 + 43.426F * var33;
            float var111 = 35.211F * var33;
            this.C00OOC00oO(var1, var58, var110, var59, var111, 9.0F * var33, var19);
            float var112 = 16.01F * var33;
            float var113 = var28 ? var19 : var19 * UuvVnuU.vuuuNvNuv((var98 - 0.42F) / 0.58F, 0.0F, 1.0F);
            UuUVuuUu(var1, var2, this, var29 + 90.04F * var33, var30 + 48.53F * var33, (class_1309)var6, var19, var113, var33, var41, var40, var112, var20);
            float var114 = 24.0F * var33;
            float var116 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var102, var114).UuUVuuUu;
            float var117 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var23, var114).UuUVuuUu;
            float var118 = var58 + var59 - var116 - var117 - 9.2F * var33;
            float var119 = var110 + 19.1F * var33;
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var118, var119, var114, var102, var106);
            var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var118 + var116, var119, var114, var23, var48);
            float var71 = var29 + 90.339F * var33;
            float var72 = var29 + 90.339F * var33;
            float var73 = var30 + 65.28F * var33;
            float var74 = 76.0F * var33;
            float var75 = 3.72F * var33;
            float var76 = var75 * 0.5F;
            this.C00OOC00oO(var1, var72, var73, var74, var75, var76, var19);
            float var77 = Math.min(var75 * 0.32F, Math.max(0.72F * var33, 0.45F));
            float var78 = Math.max(0.0F, (var74 - var77 * 2.0F) * NNUUNUuVNNVn);
            if (var78 > 0.35F) {
               float var79 = Math.max(1.0F, var75 - var77 * 2.0F);
               var1.UuUVuuUu(var72 + var77, var73 + var77, Math.max(1.0F, var74 - var77 * 2.0F), var79, var79 * 0.5F, var79 * 0.5F, var79 * 0.5F, var79 * 0.5F);
               var1.UuUVuuUu(var72 + var77, var73 + var77, var78, var79, var79 * 0.5F, var47, var46);
               var1.nuUnNvnuUu();
            }

            float var120 = var30 + 70.12F * var33;
            float var80 = 146.92F * var33;
            float var81 = 6.72F * var33;
            float var82 = var81 * 0.5F;
            this.C00OOC00oO(var1, var71, var120, var80, var81, var82, var19);
            float var83 = Math.max(1.15F * var33, 0.85F);
            float var84 = var71 + var83;
            float var85 = var120 + var83;
            float var86 = Math.max(1.0F, var81 - var83 * 2.0F);
            float var87 = Math.max(0.0F, (var80 - var83 * 2.0F) * VuunNUUUvu);
            float var88 = var86 * 0.5F;
            if (var87 > 0.5F) {
               float var89 = UuvVnuU.vuuuNvNuv(Math.abs(NuunnvnN.uUnuvNvvNU()) * 0.018F, 0.0F, 0.075F);
               float var90 = Math.min(var80 - var83 * 2.0F, var87 + (var80 - var83 * 2.0F) * var89);
               var1.UuUVuuUu(var84, var85, Math.max(1.0F, var80 - var83 * 2.0F), var86, var88, var88, var88, var88);
               var1.C00OOC00oO(var84, var85, var90, var86, var88, var44, var45);
               var1.UuUVuuUu(
                  var84 + var88 * 0.5F,
                  var85 + var86 * 0.18F,
                  Math.max(0.0F, var90 - var88),
                  Math.max(1.0F, var86 * 0.22F),
                  var86 * 0.11F,
                  VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)(58.0F * var19))
               );
               var1.nuUnNvnuUu();
            }

            if (var7 && VvVvnNUnvuvV > 0.001F) {
               int var121 = VnVnuUn.uUnuvNvvNU(255, 224, 92, (int)(245.0F * var19));
               int var123 = VnVnuUn.uUnuvNvvNU(232, 154, 35, (int)(245.0F * var19));
               float var91 = Math.max(1.0F, var80 - var83 * 2.0F);
               float var92 = var91 * UuvVnuU.vuuuNvNuv(VvVvnNUnvuvV, 0.0F, 1.0F);
               if (var92 > 0.5F) {
                  var1.UuUVuuUu(var84, var85, var91, var86, var88, var88, var88, var88);
                  var1.C00OOC00oO(var84, var85, var92, var86, var88, var121, var123);
                  var1.nuUnNvnuUu();
               }
            }

            if (var56 > 0.01F) {
               UuUVuuUu(var1, var2, (class_1309)var6, var54, var55, var53, var56, var17, var57);
               uUnuvNvvNU(var1, var29, var30, var33, var56);
            }

            if (var34 != null) {
               Hud.UuUVuuUu("HUD_TargetHUD", var29, var30, var31, var32);
               nNuUNVu var122 = nNuUNVu.UuUVuuUu();
               var122.C00OOC00oO(var34, var29, var30, var31, var32);
               if (var28) {
                  UuUuVnVvnvn.UuUVuuUu(
                     var1,
                     this,
                     var29,
                     var30,
                     var31,
                     var32,
                     O000c0oocoo.a_.method_22683().method_4486(),
                     O000c0oocoo.a_.method_22683().method_4502(),
                     var34.VVuuUN,
                     var122.VVuuUN(),
                     var122.vNUvnnVnUvu(),
                     var122.vuuuNvNuv(),
                     var122.uVUuuVnNVU()
                  );
               } else {
                  UuUuVnVvnvn.UuUVuuUu(var1, this, var34, var122, O000c0oocoo.a_.method_22683().method_4486(), O000c0oocoo.a_.method_22683().method_4502());
               }
            } else if (var35 != null) {
               Hud.UuUVuuUu("HUD_TargetHUD", var29, var30, var31, var32);
            }
         } else {
            VuunNUUUvu = 0.0F;
            NNUUNUuVNNVn = 0.0F;
            VvVvnNUnvuvV = 0.0F;
            NuunnvnN.UuUVuuUu(0.0F);
            NVUunUNUN.UuUVuuUu(0.0F);
            UUVNuUNUvUnV.UuUVuuUu(0.0F);
            NUVvUUVuVNVv = Integer.MIN_VALUE;
            nNuVunNUVu = Integer.MIN_VALUE;
            if (!var96) {
               ccOO0COcoco0 = null;
            }
         }
      }
   }

   private float UvnvNVnnnnNU() {
      nNuUNVu.VUnuUnnuNvVu var1 = nNuUNVu.UuUVuuUu().uNNnnnuuuN().get("HUD_TargetHUD");
      return var1 == null ? 1.0F : UuvVnuU.vuuuNvNuv(Math.min(var1.scaleX(), var1.scaleY()), 0.72F, 1.48F);
   }

   private O0oo00cC00o.NVnVnNnN UuUVuuUu(class_1309 var1, float var2, int var3, int var4) {
      if (var1 != null && !var1.method_31481() && var3 > 1 && var4 > 1 && O000c0oocoo.a_.field_1773 != null && O000c0oocoo.a_.field_1773.method_19418() != null
         )
       {
         class_243 var5 = var1.method_30950(var2);
         double var6 = Math.max(0.65, (double)var1.method_17682());
         class_243 var8 = new class_243(var5.field_1352, var5.field_1351 + var6 * 0.5, var5.field_1350);
         class_243 var9 = VnNnNnvuvn.UuUVuuUu(var8);
         if (var9 != null && !(var9.field_1350 <= 0.001) && !(var9.field_1350 > 1.0)) {
            float var10 = (float)var9.field_1352 + 130.0F * this.NVuNUuVnVUN.uUnuvNvvNU();
            float var11 = (float)var9.field_1351;
            if (var1.method_5628() != nNuVunNUVu) {
               nNuVunNUVu = var1.method_5628();
               NVuunNnvvvVu = var10;
               vNnNuuvVn = var11;
            } else {
               NVuunNnvvvVu = NVuunNnvvvVu + (var10 - NVuunNnvvvVu) * 0.58F;
               vNnNuuvVn = vNnNuuvVn + (var11 - vNnNuuvVn) * 0.58F;
            }

            return new O0oo00cC00o.NVnVnNnN(NVuunNnvvvVu, vNnNuuvVn);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void UuUVuuUu(UnVNvNnU var0, class_332 var1, class_1309 var2, float var3, float var4, float var5, float var6, float var7, boolean var8) {
      float var9 = NuNvVUuUUnun.UuUVuuUu(var3);
      float var10 = NuNvVUuUUnun.UuUVuuUu(var4);
      float var11 = NuNvVUuUUnun.C00OOC00oO(var5);
      float var12 = Math.max(2.0F, (float)Math.round(var11 * 0.11F));
      if (!var8 || !UuUVuuUu(var0, var1, var2, var9, var10, var11, var12, var6, var7, true)) {
         if (var2 instanceof class_1657 var13 && O000c0oocoo.a_.method_1562() != null) {
            class_640 var14 = O000c0oocoo.a_.method_1562().method_2871(var13.method_5667());
            if (var14 != null) {
               try {
                  class_2960 var15 = var14.method_52810().comp_1626();
                  class_1044 var16 = O000c0oocoo.a_.method_1531().method_4619(var15);
                  if (var16 != null && var16.method_68004() instanceof class_10868 var17 && var17.method_68427() > 0) {
                     NuNvVUuUUnun.UuUVuuUu(var15);
                     int var37 = var17.method_68427();
                     GlStateManager._bindTexture(var37);
                     UuUVuuUu(var0, var9, var10, var11, var7);
                     boolean var24 = false /* VF: Semaphore variable */;

                     try {
                        var24 = true;
                        var0.uNNnnnuuuN(var6);
                        boolean var28 = false /* VF: Semaphore variable */;

                        try {
                           var28 = true;
                           var0.UuUVuuUu(var37, -var11 * 0.5F, -var11 * 0.5F, var11, var11, 0.125F, 0.125F, 0.25F, 0.25F, var12);
                           var0.UuUVuuUu(var37, -var11 * 0.5F, -var11 * 0.5F, var11, var11, 0.625F, 0.125F, 0.75F, 0.25F, var12);
                           var28 = false;
                        } finally {
                           if (var28) {
                              var0.vuuuNvNuv();
                           }
                        }

                        var0.vuuuNvNuv();
                        C00OOC00oO(var0, var11, var12, var6, var7);
                        var24 = false;
                     } finally {
                        if (var24) {
                           UuUVuuUu(var0);
                        }
                     }

                     UuUVuuUu(var0);
                     return;
                  }
               } catch (Throwable var31) {
               }
            }
         }

         int var32 = VnVnuUn.uUnuvNvvNU(30, 30, 30, (int)(120.0F * var6));
         var0.UuUVuuUu(var9, var10, var11, var11, var12, var32);
         int var33 = VnVnuUn.uUnuvNvvNU(200, 200, 200, (int)(200.0F * var6));
         float var34 = var11 * 1.3F;
         String var35 = "a";
         float var36 = vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.uUnuvNvvNU, var35, var34).UuUVuuUu;
         var0.UuUVuuUu(vNvnnVvvVUu.uUnuvNvvNU, var9 + (var11 - var36) / 2.0F, var10 + var11 / 2.0F + var34 * 0.25F, var34, var35, var33);
      }
   }

   private static boolean UuUVuuUu(
      UnVNvNnU var0, class_332 var1, class_1309 var2, float var3, float var4, float var5, float var6, float var7, float var8, boolean var9
   ) {
      if (var2 != null && O000c0oocoo.a_ != null && var1 != null && !(O000c0oocoo.a_.field_1755 instanceof class_490)) {
         float var10 = O000c0oocoo.a_.method_22683().method_4495();
         if (var10 <= 0.0F) {
            return false;
         } else {
            float var11 = UuvVnuU.vuuuNvNuv(var8, 0.0F, 1.0F);
            float var12 = 1.0F - var11 * 0.085F;
            float var13 = var5 * var12;
            float var14 = var3 + (var5 - var13) * 0.5F;
            float var15 = var4 + (var5 - var13) * 0.5F;
            int var16 = Math.round(var14 / var10);
            int var17 = Math.round(var15 / var10);
            int var18 = Math.max(1, Math.round(var13 / var10));
            float var19 = Math.max(0.65F, var2.method_17682());
            float var20 = UuvVnuU.vuuuNvNuv(1.8F / var19, 0.72F, 1.65F);
            int var21 = Math.max(8, Math.round(var18 * (var9 ? 1.02F : 1.15F) * var20));
            int var22 = Math.max(var18 + 1, Math.round(var18 * (var9 ? 2.24F : 2.05F)));
            int var23 = var17 - Math.round(var18 * (var9 ? 0.12F : 0.0F));
            int var24 = var23 + var22;
            float var25 = var16 + var18 * 0.5F;
            float var26 = (var23 + var24) * 0.5F;
            float var27 = (var9 ? 24.0F : 8.0F) + NnunUUnU * var11 * 50.0F;
            float var28 = var9 ? -7.0F : -4.0F;
            float var29 = var25 - (float)Math.tan(var27 / 20.0F) * 5.0F;
            float var30 = var26 - (float)Math.tan(-var28 / 20.0F);
            var0.uUnuvNvvNU();

            label111: {
               boolean var32;
               try {
                  var1.method_44379(var16, var17, var16 + var18, var17 + var18);
                  UuUVuuUu(var1, var16, var23, var16 + var18, var24, var21, 0.0625F, var29, var30, var2);
                  break label111;
               } catch (Throwable var42) {
                  var32 = false;
               } finally {
                  try {
                     var1.method_44380();
                  } catch (Throwable var41) {
                  }
               }

               return var32;
            }

            if (var11 > 0.001F) {
               var0.UuUVuuUu(var14, var15, var13, var13, var6, VnVnuUn.uUnuvNvvNU(255, 55, 55, (int)(58.0F * var7 * var11)));
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private static void UuUVuuUu(class_332 var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, class_1309 var9) {
      float var10 = (var1 + var3) * 0.5F;
      float var11 = (var2 + var4) * 0.5F;
      float var12 = (float)Math.atan((var10 - var7) / 40.0F);
      float var13 = (float)Math.atan((var11 - var8) / 40.0F);
      Quaternionf var14 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf var15 = new Quaternionf().rotateX(var13 * 20.0F * (float) (Math.PI / 180.0));
      var14.mul(var15);
      class_897 var16 = O000c0oocoo.a_.method_1561().method_3953(var9);
      class_10017 var17 = var16.method_62425(var9, 1.0F);
      var17.field_58169 = null;
      if (var17 instanceof class_10042 var18) {
         float var19 = 180.0F + var12 * 20.0F;
         var18.field_53446 = var19;
         var18.field_53447 = 180.0F + var12 * 40.0F - var19;
         var18.field_53448 = -var13 * 20.0F;
      }

      float var20 = Math.max(0.001F, var9.method_55693());
      Vector3f var21 = new Vector3f(0.0F, var9.method_17682() / 2.0F + var6 * var20, 0.0F);
      var0.method_70856(var17, var5 / var20, var21, var14, var15, var1, var2, var3, var4);
   }

   private static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4) {
      float var5 = UuvVnuU.vuuuNvNuv(var4, 0.0F, 1.0F);
      float var6 = var1 + var3 * 0.5F;
      float var7 = var2 + var3 * 0.5F;
      float var8 = 1.0F - var5 * 0.085F;
      float var9 = NnunUUnU * var5 * 8.5F;
      var0.UuUVuuUu(var6, var7);
      var0.C00OOC00oO(var9);
      var0.C00OOC00oO(var8, var8);
   }

   private static void UuUVuuUu(UnVNvNnU var0) {
      var0.uVUuuVnNVU();
      var0.VVuuUN();
      var0.vNUvnnVnUvu();
   }

   private static void C00OOC00oO(UnVNvNnU var0, float var1, float var2, float var3, float var4) {
      float var5 = UuvVnuU.vuuuNvNuv(var4, 0.0F, 1.0F);
      if (!(var5 <= 0.001F)) {
         var0.UuUVuuUu(-var1 * 0.5F, -var1 * 0.5F, var1, var1, var2, VnVnuUn.uUnuvNvvNU(255, 55, 55, (int)(58.0F * var3 * var5)));
      }
   }

   private static void UuUVuuUu(class_1309 var0, boolean var1, String var2, String var3) {
      long var4 = System.currentTimeMillis();
      String var6 = var2 + "|" + vVvUvVVuuNvV(var0) + "|" + var1;
      Long var7 = NnVnNVN.get(var6);
      if (var7 == null || var4 - var7 >= 1000L) {
         NnVnNVN.put(var6, var4);
      }
   }

   private static void UuUVuuUu(class_1309 var0, boolean var1, String var2, String var3, Throwable var4) {
      long var5 = System.currentTimeMillis();
      String var7 = var4 == null ? "none" : var4.getClass().getName();
      String var8 = var2 + "|" + vVvUvVVuuNvV(var0) + "|" + var1 + "|" + var7;
      Long var9 = vnvvNvUnVv.get(var8);
      if (var9 == null || var5 - var9 >= 1000L) {
         vnvvNvUnVv.put(var8, var5);
         c0oOOCcCoC0.warn(
            "[portrait] stage={} target={} id={} type={} class={} thirdPerson={} {}",
            var2,
            uNNnnnuuuN(var0),
            vVvUvVVuuNvV(var0),
            nuUnNvnuUu(var0),
            VVuuUN(var0),
            var1,
            var3,
            var4
         );
      }
   }

   private static int vVvUvVVuuNvV(class_1309 var0) {
      return var0 == null ? Integer.MIN_VALUE : var0.method_5628();
   }

   private static String uNNnnnuuuN(class_1309 var0) {
      if (var0 == null) {
         return "null";
      } else {
         try {
            return var0.method_5477().getString();
         } catch (Throwable var2) {
            return "name-error";
         }
      }
   }

   private static String nuUnNvnuUu(class_1309 var0) {
      if (var0 == null) {
         return "null";
      } else {
         try {
            return String.valueOf(var0.method_5864());
         } catch (Throwable var2) {
            return "type-error";
         }
      }
   }

   private static String VVuuUN(class_1309 var0) {
      return var0 == null ? "null" : var0.getClass().getName();
   }

   private static boolean UuUVuuUu(class_1309 var0, float var1) {
      int var2 = var0.method_5628();
      if (var2 != UNvvunVVn) {
         UNvvunVVn = var2;
         UnvuVuVnNuvu = 0;
         UvNNVUVNVuvV = var1;
         vuvnUnVnUNnV.clear();
         unNNVVNnvvV.nuUnNvnuUu(0.0);
         return false;
      } else {
         boolean var3 = var0.field_6235 > 0 && (UnvuVuVnNuvu == 0 || var0.field_6235 > UnvuVuVnNuvu);
         boolean var4 = !Float.isNaN(UvNNVUVNVuvV) && var1 < UvNNVUVNVuvV - 0.05F;
         if (var3 || var4) {
            uVUVnuvnuVuv();
         }

         UnvuVuVnNuvu = var0.field_6235;
         UvNNVUVNVuvV = var1;
         return var3 || var4;
      }
   }

   private static void uVUVnuvnuVuv() {
      byte var0 = 24;
      float var1 = (float)(System.nanoTime() & 7L) * 0.06F;

      for (int var2 = 0; var2 < var0; var2++) {
         float var3 = (float)((Math.PI * 2) * var2 / var0) + var1;
         float var4 = 1.35F + var2 % 5 * 0.15F;
         float var5 = 43.0F + (var2 % 3 - 1) * 3.1F;
         float var6 = 42.8F + (var2 % 2 == 0 ? -2.8F : 2.8F);
         float var7 = (float)Math.cos(var3) * var4;
         float var8 = (float)Math.sin(var3) * var4 - 0.08F;
         float var9 = 1.32F + var2 % 3 * 0.32F;
         int var10 = 56 + var2 % 10;
         vuvnUnVnUNnV.add(new O0oo00cC00o.nvnNNunvv(var5, var6, var7, var8, var9, var10));
      }
   }

   private static void uUnuvNvvNU(UnVNvNnU var0, float var1, float var2, float var3, float var4) {
      for (int var5 = vuvnUnVnUNnV.size() - 1; var5 >= 0; var5--) {
         O0oo00cC00o.nvnNNunvv var6 = vuvnUnVnUNnV.get(var5);
         var6.VVuuUN++;
         if (var6.VVuuUN >= var6.nuUnNvnuUu) {
            vuvnUnVnUNnV.remove(var5);
         } else {
            var6.UuUVuuUu = var6.UuUVuuUu + var6.uUnuvNvvNU;
            var6.C00OOC00oO = var6.C00OOC00oO + var6.vVvUvVVuuNvV;
            var6.uUnuvNvvNU *= 0.988F;
            var6.vVvUvVVuuNvV = var6.vVvUvVVuuNvV * 0.988F + 0.012F;
            float var7 = (float)var6.VVuuUN / var6.nuUnNvnuUu;
            float var8 = 1.0F - (1.0F - var7) * (1.0F - var7);
            float var9 = Math.max(0.0F, 1.0F - var7) * var4;
            float var10 = var1 + var6.UuUVuuUu * var3;
            float var11 = var2 + var6.C00OOC00oO * var3;
            float var12 = var6.uNNnnnuuuN * var3 * (1.0F + var8 * 0.28F);
            var0.C00OOC00oO(var10, var11, var12 * 4.2F, 0.0F, 1.0F, VnVnuUn.uUnuvNvvNU(146, 170, 255, (int)(32.0F * var9)));
            var0.C00OOC00oO(var10, var11, var12, 0.0F, 1.0F, VnVnuUn.uUnuvNvvNU(146, 170, 255, (int)(235.0F * var9)));
         }
      }
   }

   private static String UuuNnUvUuv(float var0) {
      int var1 = Math.max(0, Math.round(var0 * 10.0F));
      return var1 / 10 + "." + var1 % 10;
   }

   private static float vNUvnnVnUvu(class_1309 var0) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var1 = 0.0F;
         class_1304[] var2 = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};

         for (class_1304 var6 : var2) {
            class_1799 var7 = var0.method_6118(var6);
            if (var7 != null && !var7.method_7960()) {
               if (var7.method_7963() && var7.method_7936() > 0) {
                  var1 += UuvVnuU.vuuuNvNuv(1.0F - (float)var7.method_7919() / var7.method_7936(), 0.0F, 1.0F);
               } else {
                  var1++;
               }
            }
         }

         return UuvVnuU.vuuuNvNuv(var1 / var2.length, 0.0F, 1.0F);
      }
   }

   private static int UuUVuuUu(int var0, int var1, float var2) {
      float var3 = UuvVnuU.vuuuNvNuv(var2, 0.0F, 1.0F);
      int var4 = var0 >>> 24 & 0xFF;
      int var5 = var0 >>> 16 & 0xFF;
      int var6 = var0 >>> 8 & 0xFF;
      int var7 = var0 & 0xFF;
      int var8 = var1 >>> 24 & 0xFF;
      int var9 = var1 >>> 16 & 0xFF;
      int var10 = var1 >>> 8 & 0xFF;
      int var11 = var1 & 0xFF;
      int var12 = Math.round(var4 + (var8 - var4) * var3);
      int var13 = Math.round(var5 + (var9 - var5) * var3);
      int var14 = Math.round(var6 + (var10 - var6) * var3);
      int var15 = Math.round(var7 + (var11 - var7) * var3);
      return (var12 & 0xFF) << 24 | (var13 & 0xFF) << 16 | (var14 & 0xFF) << 8 | var15 & 0xFF;
   }

   private static String uNNnnnuuuN(String var0) {
      return var0 != null && !var0.isEmpty() ? nuunNvv.matcher(nVVUuvuNnUN.matcher(var0).replaceAll("")).replaceAll("").trim() : "";
   }

   public static String UuUVuuUu(class_1657 var0) {
      return var0 != null && var0.method_5781() != null ? uNNnnnuuuN(ProtectInfo.uUnuvNvvNU(var0.method_5781().method_1144().getString())) : "";
   }

   public static int UuUVuuUu(class_1657 var0, int var1, int var2) {
      if (var0 != null && var0.method_5781() != null) {
         class_124 var3 = var0.method_5781().method_1202();
         return var3 != null && var3.method_532() != null ? VnVnuUn.uNNnnnuuuN(var3.method_532(), var2) : var1;
      } else {
         return var1;
      }
   }

   private static String UuUVuuUu(UnVNvNnU var0, String var1, float var2, float var3) {
      if (var1 != null && !var1.isEmpty() && !(vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var1, var2).UuUVuuUu <= var3)) {
         String var4 = "...";

         for (int var5 = var1.length(); var5 > 0; var5--) {
            String var6 = var1.substring(0, var5).trim() + var4;
            if (vVVUUuunVVV.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var6, var2).UuUVuuUu <= var3) {
               return var6;
            }
         }

         return var4;
      } else {
         return var1 == null ? "" : var1;
      }
   }

   private static void UuUVuuUu(
      UnVNvNnU var0,
      class_332 var1,
      nnvNuuNvvuu var2,
      float var3,
      float var4,
      class_1309 var5,
      float var6,
      float var7,
      float var8,
      int var9,
      int var10,
      float var11,
      boolean var12
   ) {
      if (var5 != null) {
         nnuUVNUuvvVU[0] = var5.method_6118(class_1304.field_6169);
         nnuUVNUuvvVU[1] = var5.method_6118(class_1304.field_6174);
         nnuUVNUuvvVU[2] = var5.method_6118(class_1304.field_6172);
         nnuUVNUuvvVU[3] = var5.method_6118(class_1304.field_6166);
      } else {
         nnuUVNUuvvVU[0] = null;
         nnuUVNUuvvVU[1] = null;
         nnuUVNUuvvVU[2] = null;
         nnuUVNUuvvVU[3] = null;
      }

      float var13 = 3.99F * var8;

      for (int var14 = 0; var14 < 4; var14++) {
         float var15 = var3 + var14 * (var11 + var13);
         if (var2 == null || !var2.UuuNnUvUuv() && !var2.nUUVuvU()) {
            if (!var12
               || !VVNunVNVuuu.UuUVuuUu(
                  null, var15, var4, var11, var11, 4.0F * var8, Math.max(1.6F, 2.8F * var8), Math.max(3.0F, 5.5F * var8), 0.82F, 2, true, var6
               )) {
               var0.UuUVuuUu(var15, var4, var11, var11, 4.0F * var8, var9);
               var0.UuUVuuUu(var15, var4, var11, var11, 4.0F * var8, var10, 1.0F * var8);
            }
         } else {
            var2.C00OOC00oO(var0, var15, var4, var11, var11, 4.0F * var8, var6);
         }
      }

      VVNunVNVuuu.C00OOC00oO();
      var0.uUnuvNvvNU();
      if (!(var7 <= 0.01F)) {
         var0.uNNnnnuuuN(var7);

         for (int var21 = 0; var21 < 4; var21++) {
            float var22 = var3 + var21 * (var11 + var13);
            class_1799 var16 = nnuUVNUuvvVU[var21];
            if (var16 != null && !var16.method_7960()) {
               float var17 = var11 / 16.0F * 0.72F;
               float var18 = 16.0F * var17;
               float var19 = var22 + (var11 - var18) / 2.0F;
               float var20 = var4 + (var11 - var18) / 2.0F;
               NuNvVUuUUnun.UuUVuuUu(var0, var16, var19, var20, var17, var21, false, 0);
            }
         }

         var0.vuuuNvNuv();
      }
   }

   record NVnVnNnN(float x, float y) {
   }

   static final class nvnNNunvv {
      float UuUVuuUu;
      float C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      final float uNNnnnuuuN;
      final int nuUnNvnuUu;
      int VVuuUN;

      nvnNNunvv(float var1, float var2, float var3, float var4, float var5, int var6) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
      }
   }
}
