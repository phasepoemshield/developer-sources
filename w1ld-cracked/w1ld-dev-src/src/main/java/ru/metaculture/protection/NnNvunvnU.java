package ru.metaculture.protection;

import java.awt.Color;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import net.minecraft.class_1044;
import net.minecraft.class_1060;
import net.minecraft.class_10868;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2663;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import org.json.JSONObject;
import org.wild.module.api.Module;

public class NnNvunvnU extends Module {
   private static final class_2960 unNNVVNnvvV = class_2960.method_60655("wild", "textures/png/skull_state_0.png");
   private static final class_2960 NuunnvnN = class_2960.method_60655("wild", "textures/png/skull_state_1.png");
   private static final class_2960 NVUunUNUN = class_2960.method_60655("wild", "textures/png/skull_state_2.png");
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Отображать: ", "Только у друзей", "Всех", "Только у друзей");
   public final VUVnvvnNN uVunuUNVVUUV = new VUVnvvnNN(
      "Информация", new vvNnnUNnVvn("Показ в табе", true), new vvNnnUNnVvn("Показ в нейм тегах", false), new vvNnnUNnVvn("Показ лого", false)
   );
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Установка меток", true);
   public final uVNuNUVvn uNnUnnuNUnNu = new uVNuNUVvn("Кнопка установки", -1).UuUVuuUu(this.UNnVVNvvnVvU::uUnuvNvvNU);
   public final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Фокус цели", true);
   public final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Счетчик попнутых тотемов врага", true);
   public static String UnUNuUU = "";
   private String UUVNuUNUvUnV = "";
   private long vuvnUnVnUNnV = 0L;
   public static double uUVuVvuNUvnu;
   public static double UvUvUNuvNU;
   public static double c0oOOCcCoC0;
   private long nnuUVNUuvvVU = 0L;

   public NnNvunvnU() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU, this.nNvNUVU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (!NUvunNNvN.UuUVuuUu()) {
         if (var1.vVvUvVVuuNvV() == this.uNnUnnuNUnNu.uUnuvNvvNU()) {
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (!NUvunNNvN.UuUVuuUu()) {
         if (vUUvvNUVNvNU.UuUVuuUu != null) {
            vUUvvNUVNvNU.UuUVuuUu.uUnuvNvvNU();
         }

         if (System.currentTimeMillis() - this.vuvnUnVnUNnV > 200L) {
            this.vuvnUnVnUNnV = System.currentTimeMillis();
            if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
               vnvuUUVun.UuUVuuUu.UuUVuuUu();
               String var2 = uUnuvNvvNU.field_1687.method_27983().method_29177().method_12832();
               float var3 = uUnuvNvvNU.field_1724.method_6032() + uUnuvNvvNU.field_1724.method_6067();
               boolean var4 = vnvuUUVun.C00OOC00oO();
               vUUvvNUVNvNU var5 = vUUvvNUVNvNU.UuUVuuUu;
               if (var5 != null) {
                  var5.UuUVuuUu(
                     uUnuvNvvNU.field_1724.method_23317(),
                     uUnuvNvvNU.field_1724.method_23318(),
                     uUnuvNvvNU.field_1724.method_23321(),
                     var2,
                     var3,
                     vnvuUUVun.UuUVuuUu.uUnuvNvvNU(),
                     var4
                  );
               }
            }
         }

         if (AttackAura.ccOO0COcoco0 instanceof class_1657 var6) {
            UnUNuUU = var6.method_5805() && var6.method_6032() > 0.0F ? var6.method_5477().getString() : "";
         }

         if (!UnUNuUU.isEmpty() && uNvUVUNvuUVV.UuUVuuUu(UnUNuUU)) {
            UnUNuUU = "";
         }

         if (uUnuvNvvNU.field_1687 != null) {
            class_1657 var7 = null;

            for (class_1657 var11 : uUnuvNvvNU.field_1687.method_18456()) {
               if (!var11.method_5805() || var11.method_6032() <= 0.0F) {
                  vUUvvNUVNvNU.uNNnnnuuuN.remove(var11.method_5477().getString());
                  if (var11.method_5477().getString().equalsIgnoreCase(UnUNuUU)) {
                     UnUNuUU = "";
                  }
               } else if (var11.method_5477().getString().equalsIgnoreCase(UnUNuUU)) {
                  var7 = var11;
               }
            }

            if (this.NnUuNNU.uUnuvNvvNU() && vUUvvNUVNvNU.UuUVuuUu != null && vUUvvNUVNvNU.UuUVuuUu.isOpen()) {
               long var10 = System.currentTimeMillis();
               if (var7 != null) {
                  uUVuVvuNUvnu = var7.method_23317();
                  UvUvUNuvNU = var7.method_23318();
                  c0oOOCcCoC0 = var7.method_23321();
                  if (var10 - this.nnuUVNUuvvVU > 200L) {
                     this.nnuUVNUuvvVU = var10;
                     this.UuUVuuUu(UnUNuUU, uUVuVvuNUvnu, UvUvUNuvNU, c0oOOCcCoC0);
                  }
               } else if (UnUNuUU.isEmpty() && !this.UUVNuUNUvUnV.isEmpty()) {
                  this.nnuUVNUuvvVU = var10;
                  this.UuUVuuUu("", 0.0, 0.0, 0.0);
               }
            }
         }
      }
   }

   private void UuUVuuUu(String var1, double var2, double var4, double var6) {
      try {
         JSONObject var8 = new JSONObject();
         var8.put("type", "target_sync");
         var8.put("user", uUnuvNvvNU.method_1548().method_1676());
         var8.put("target", var1);
         var8.put("server", vUUvvNUVNvNU.UuUVuuUu());
         if (!var1.isEmpty()) {
            var8.put("x", var2);
            var8.put("y", var4);
            var8.put("z", var6);
         }

         vUUvvNUVNvNU.UuUVuuUu.send(var8.toString());
         this.UUVNuUNUvUnV = var1;
      } catch (Exception var9) {
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (!NUvunNNvN.UuUVuuUu() && this.nNvNUVU.uUnuvNvvNU()) {
         if (var1.vVvUvVVuuNvV() instanceof class_2663 var2 && var2.method_11470() == 35) {
            class_1297 var9 = var2.method_11469(uUnuvNvvNU.field_1687);
            if (var9 instanceof class_1657 var4) {
               String var5 = var4.method_5477().getString();
               int var6 = vUUvvNUVNvNU.uNNnnnuuuN.getOrDefault(var5, 0) + 1;
               vUUvvNUVNvNU.uNNnnnuuuN.put(var5, var6);
               vUUvvNUVNvNU.nuUnNvnuUu.put(var5, System.currentTimeMillis());
               if (AttackAura.ccOO0COcoco0 != null
                  && AttackAura.ccOO0COcoco0.method_5628() == var9.method_5628()
                  && vUUvvNUVNvNU.UuUVuuUu != null
                  && vUUvvNUVNvNU.UuUVuuUu.isOpen()) {
                  try {
                     JSONObject var7 = new JSONObject();
                     var7.put("type", "totem_pop");
                     var7.put("attacker", uUnuvNvvNU.method_1548().method_1676());
                     var7.put("victim", var5);
                     var7.put("count", var6);
                     var7.put("server", vUUvvNUVNvNU.UuUVuuUu());
                     vUUvvNUVNvNU.UuUVuuUu.send(var7.toString());
                  } catch (Exception var8) {
                  }
               }
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (!NUvunNNvN.UuUVuuUu() && this.NnUuNNU.uUnuvNvvNU()) {
         HashSet var2 = new HashSet();
         if (!UnUNuUU.isEmpty()) {
            var2.add(UnUNuUU);
         }

         String var3 = vUUvvNUVNvNU.UuUVuuUu();
         if (vUUvvNUVNvNU.UuUVuuUu != null && vUUvvNUVNvNU.UuUVuuUu.isOpen()) {
            boolean var4 = "Только у друзей".equals(this.NVNnnvnuunNv.uUnuvNvvNU());
            String var5 = uUnuvNvvNU.method_1548() != null ? uUnuvNvvNU.method_1548().method_1676() : "";

            for (Entry var7 : vUUvvNUVNvNU.vVvUvVVuuNvV.entrySet()) {
               String var8 = (String)var7.getKey();
               vUUvvNUVNvNU.nvnNNunvv var9 = (vUUvvNUVNvNU.nvnNNunvv)var7.getValue();
               if ((!var4 || var8.equals(var5) || uNvUVUNvuUVV.UuUVuuUu(var8)) && var9.C00OOC00oO.equals(var3)) {
                  var2.add(var9.UuUVuuUu);
               }
            }
         }

         if (!var2.isEmpty()) {
            float var23 = uUnuvNvvNU.method_61966().method_60637(true);
            long var24 = System.currentTimeMillis();

            assert uUnuvNvvNU.field_1687 != null;

            for (String var26 : var2) {
               class_1657 var27 = null;

               for (class_1657 var11 : uUnuvNvvNU.field_1687.method_18456()) {
                  if (var11.method_5477().getString().equalsIgnoreCase(var26) && var11 != uUnuvNvvNU.field_1724) {
                     var27 = var11;
                     break;
                  }
               }

               if (var27 != null) {
                  this.UuUVuuUu(var1.vVvUvVVuuNvV(), var27, var23);
               } else {
                  double var28 = 0.0;
                  double var12 = 0.0;
                  double var14 = 0.0;
                  boolean var16 = false;
                  long var17 = 0L;
                  Iterator var19 = vUUvvNUVNvNU.vVvUvVVuuNvV.values().iterator();

                  while (true) {
                     if (var19.hasNext()) {
                        vUUvvNUVNvNU.nvnNNunvv var20 = (vUUvvNUVNvNU.nvnNNunvv)var19.next();
                        if (!var20.UuUVuuUu.equalsIgnoreCase(var26) || !var20.C00OOC00oO.equals(var3)) {
                           continue;
                        }

                        var17 = var24 - var20.uVUuuVnNVU;
                        if (var17 >= 4000L) {
                           continue;
                        }

                        double var21 = class_3532.method_15350(var17 / 200.0, 0.0, 1.0);
                        var28 = class_3532.method_16436(var21, var20.nuUnNvnuUu, var20.uUnuvNvvNU);
                        var12 = class_3532.method_16436(var21, var20.VVuuUN, var20.vVvUvVVuuNvV);
                        var14 = class_3532.method_16436(var21, var20.vNUvnnVnUvu, var20.uNNnnnuuuN);
                        var16 = true;
                     }

                     if (!var16 && var26.equalsIgnoreCase(UnUNuUU)) {
                        var28 = uUVuVvuNUvnu;
                        var12 = UvUvUNuvNU;
                        var14 = c0oOOCcCoC0;
                        var16 = true;
                     }

                     if (var16) {
                        float var29 = 1.0F;
                        if (var17 > 3000L) {
                           float var30 = 1.0F - (float)(var17 - 3000L) / 1000.0F;
                           var29 = class_3532.method_15363(var30, 0.0F, 1.0F);
                        }

                        float var31 = 20.0F;
                        this.UuUVuuUu(var1.vVvUvVVuuNvV(), var26, var28, var12 + 2.0, var14, var31, 20.0F, var29);
                     }
                     break;
                  }
               }
            }
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, class_1657 var2, float var3) {
      double var4 = class_3532.method_16436(var3, var2.field_6014, var2.method_23317());
      double var6 = class_3532.method_16436(var3, var2.field_6036, var2.method_23318());
      double var8 = class_3532.method_16436(var3, var2.field_5969, var2.method_23321());
      float var10 = var2.method_6032() + var2.method_6067();
      float var11 = var2.method_6063();
      this.UuUVuuUu(var1, var2.method_5477().getString(), var4, var6 + var2.method_17682(), var8, var10, var11, 1.0F);
   }

   private void UuUVuuUu(UnVNvNnU var1, String var2, double var3, double var5, double var7, float var9, float var10, float var11) {
      class_4184 var12 = uUnuvNvvNU.field_1773.method_19418();
      class_243 var13 = var12.method_19326();
      class_243 var14 = new class_243(var3, var5, var7);
      if (!(var14.method_1025(var13) < 1.0E-6)) {
         class_243 var15 = VnNnNnvuvn.UuUVuuUu(var14);
         if (var15 != null && !(var15.field_1350 <= 0.001F) && !(var15.field_1350 > 1.0)) {
            float var16 = (float)var15.field_1352;
            float var17 = (float)var15.field_1351;
            long var18 = vUUvvNUVNvNU.nuUnNvnuUu.getOrDefault(var2, 0L);
            boolean var20 = System.currentTimeMillis() - var18 < 2500L;
            class_2960 var21;
            if (var20) {
               var21 = NVUunUNUN;
            } else if (var9 <= var10 / 2.0F) {
               var21 = NuunnvnN;
            } else {
               var21 = unNNVVNnvvV;
            }

            int var22 = this.UuUVuuUu(var21);
            if (var22 > 0 && var11 > 0.05F) {
               float var23 = 28.0F;
               float var24 = 15.0F;
               float var25 = var16 - var23 / 2.0F;
               float var26 = var17 - var23 - var24;
               var1.UuUVuuUu(var25, var26);
               var1.UuUVuuUu(var23 / 2.0F, var23 / 2.0F);
               var1.C00OOC00oO(1.0F, -1.0F);
               var1.UuUVuuUu(-var23 / 2.0F, -var23 / 2.0F);
               var1.UuUVuuUu(var22, 0.0F, 0.0F, var23, var23);
               var1.vNUvnnVnUvu();
               var1.uVUuuVnNVU();
               var1.vNUvnnVnUvu();
               var1.vNUvnnVnUvu();
            }

            if (this.nNvNUVU.uUnuvNvvNU()) {
               int var27 = vUUvvNUVNvNU.uNNnnnuuuN.getOrDefault(var2, 0);
               if (var27 > 0) {
                  String var28 = var27 + " тотемов";
                  float var29 = 22.0F;
                  float var30 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var28, var29).UuUVuuUu;
                  var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var16 - var30 / 2.0F, var17 - 5.0F, var29, var28, this.UuUVuuUu(Color.WHITE.getRGB(), var11));
               }
            }
         }
      }
   }

   private int UuUVuuUu(int var1, float var2) {
      int var3 = var1 >> 24 & 0xFF;
      int var4 = var1 >> 16 & 0xFF;
      int var5 = var1 >> 8 & 0xFF;
      int var6 = var1 & 0xFF;
      var3 = (int)(var3 * var2);
      return UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(var4, var5, var6, var3);
   }

   private int UuUVuuUu(class_2960 var1) {
      class_1060 var2 = uUnuvNvvNU.method_1531();
      if (var2 == null) {
         return -1;
      } else {
         class_1044 var3 = var2.method_4619(var1);
         if (var3 == null) {
            return -1;
         } else if (var3.method_68004() instanceof class_10868 var5) {
            int var6 = var5.method_68427();
            return var6 > 0 ? var6 : -1;
         } else {
            return -1;
         }
      }
   }
}
