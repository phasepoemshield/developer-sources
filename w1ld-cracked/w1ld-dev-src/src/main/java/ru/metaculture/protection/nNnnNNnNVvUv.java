package ru.metaculture.protection;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import net.minecraft.class_10182;
import net.minecraft.class_10185;
import net.minecraft.class_10265;
import net.minecraft.class_10266;
import net.minecraft.class_10268;
import net.minecraft.class_10269;
import net.minecraft.class_10614;
import net.minecraft.class_11407;
import net.minecraft.class_1267;
import net.minecraft.class_1277;
import net.minecraft.class_1496;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1724;
import net.minecraft.class_1728;
import net.minecraft.class_1799;
import net.minecraft.class_1934;
import net.minecraft.class_22;
import net.minecraft.class_243;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2600;
import net.minecraft.class_2617;
import net.minecraft.class_2620;
import net.minecraft.class_2622;
import net.minecraft.class_2623;
import net.minecraft.class_2629;
import net.minecraft.class_2637;
import net.minecraft.class_2645;
import net.minecraft.class_2648;
import net.minecraft.class_2649;
import net.minecraft.class_2651;
import net.minecraft.class_2653;
import net.minecraft.class_2656;
import net.minecraft.class_2664;
import net.minecraft.class_2666;
import net.minecraft.class_2668;
import net.minecraft.class_2672;
import net.minecraft.class_2673;
import net.minecraft.class_2675;
import net.minecraft.class_2678;
import net.minecraft.class_2683;
import net.minecraft.class_2692;
import net.minecraft.class_2693;
import net.minecraft.class_2695;
import net.minecraft.class_2696;
import net.minecraft.class_2707;
import net.minecraft.class_2708;
import net.minecraft.class_2720;
import net.minecraft.class_2724;
import net.minecraft.class_2734;
import net.minecraft.class_2735;
import net.minecraft.class_2748;
import net.minecraft.class_2749;
import net.minecraft.class_2759;
import net.minecraft.class_2765;
import net.minecraft.class_2767;
import net.minecraft.class_2770;
import net.minecraft.class_2775;
import net.minecraft.class_2793;
import net.minecraft.class_2799;
import net.minecraft.class_2815;
import net.minecraft.class_2818;
import net.minecraft.class_2856;
import net.minecraft.class_299;
import net.minecraft.class_310;
import net.minecraft.class_3469;
import net.minecraft.class_3532;
import net.minecraft.class_3895;
import net.minecraft.class_3943;
import net.minecraft.class_3944;
import net.minecraft.class_418;
import net.minecraft.class_4273;
import net.minecraft.class_434;
import net.minecraft.class_437;
import net.minecraft.class_5888;
import net.minecraft.class_5892;
import net.minecraft.class_5894;
import net.minecraft.class_5903;
import net.minecraft.class_5904;
import net.minecraft.class_5905;
import net.minecraft.class_634;
import net.minecraft.class_636;
import net.minecraft.class_6603;
import net.minecraft.class_6606;
import net.minecraft.class_7438;
import net.minecraft.class_7439;
import net.minecraft.class_744;
import net.minecraft.class_7617;
import net.minecraft.class_7827;
import net.minecraft.class_8212;
import net.minecraft.class_8588;
import net.minecraft.class_8589;
import net.minecraft.class_8591;
import net.minecraft.class_8675;
import net.minecraft.class_8710;
import net.minecraft.class_8913;
import net.minecraft.class_8914;
import net.minecraft.class_9053;
import net.minecraft.class_9151;
import net.minecraft.class_9157;
import net.minecraft.class_9178;
import net.minecraft.class_9209;
import net.minecraft.class_9812;
import net.minecraft.class_9834;
import net.minecraft.class_9835;
import net.minecraft.class_2668.class_5402;
import net.minecraft.class_2799.class_2800;
import net.minecraft.class_2828.class_2830;
import net.minecraft.class_2828.class_2831;
import net.minecraft.class_2856.class_2857;
import net.minecraft.class_638.class_5271;
import org.wild.mixin.acceser.ClientPlayNetworkHandlerAccessor;

public final class nNnnNNnNVvUv extends class_634 {
   private final vUNVNUnuv UuUVuuUu;
   private final class_310 C00OOC00oO;
   private volatile boolean uUnuvNvvNU;

   public nNnnNNnNVvUv(class_310 var1, class_2535 var2, class_8675 var3, vUNVNUnuv var4) {
      super(var1, var2, var3);
      this.C00OOC00oO = var1;
      this.UuUVuuUu = var4;
   }

   public vUNVNUnuv UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public void method_52787(class_2596<?> var1) {
      if (!this.uUnuvNvvNU) {
         super.method_52787(var1);
      }
   }

   public void method_11120(class_2678 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      if (!nnVNNuuVUVn.uNNnnnuuuN(this.UuUVuuUu)) {
         nnVNNuuVUVn.uUnuvNvvNU(this.UuUVuuUu);
      } else {
         ClientPlayNetworkHandlerAccessor var2 = (ClientPlayNetworkHandlerAccessor)this;
         class_8589 var3 = var1.comp_1727();
         class_5271 var4 = new class_5271(class_1267.field_5802, var1.comp_89(), var3.comp_1559());
         var2.wild$setWorldProperties(var4);
         var2.wild$setChunkLoadDistance(var1.comp_98());
         var2.wild$setSimulationDistance(var1.comp_169());
         VnUvNVNVNUUn var5 = new VnUvNVNVNUUn(
            this.UuUVuuUu,
            this,
            var4,
            var3.comp_1554(),
            var3.comp_1553(),
            var1.comp_98(),
            var1.comp_169(),
            var3.comp_1558(),
            var3.comp_1555(),
            var3.comp_2893()
         );
         var2.wild$setWorld(var5);
         class_3469 var6 = new class_3469();
         class_299 var7 = new class_299();
         VNNVunUvvnn var8 = new VNNVunUvvnn(this.UuUVuuUu, this.C00OOC00oO, var5, this, var6, var7);
         var8.method_5838(var1.comp_88());
         var8.method_33689();
         var8.method_7268(var1.comp_99());
         var8.method_22420(var1.comp_100());
         var8.method_43120(var3.comp_1560());
         var8.method_51850(var3.comp_1561());
         UuUVuuUu(var8);
         var5.method_53875(var8);
         class_636 var9 = new class_636(this.C00OOC00oO, this);
         var9.method_32790(var3.comp_1556(), var3.comp_1557());
         var9.method_2903(var8);
         this.UuUVuuUu.UuUVuuUu(var5);
         this.UuUVuuUu.UuUVuuUu(var8);
         this.UuUVuuUu.UuUVuuUu(var9);
         this.UuUVuuUu.UuUVuuUu(true);
         if (!nnVNNuuVUVn.C00OOC00oO(this.UuUVuuUu)) {
            nnVNNuuVUVn.uUnuvNvvNU(this.UuUVuuUu);
         } else {
            String var10 = "joined the game as " + this.method_2879().getName();
            nnVNNuuVUVn.UuUVuuUu(this.UuUVuuUu, nnVNNuuVUVn.nvnNNunvv.JOINED, var10);
            if (this.UuUVuuUu.nUUVuvU() || nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
               this.UuUVuuUu.uUnuvNvvNU(false);
               nnVNNuuVUVn.UuUVuuUu(this.UuUVuuUu);
            }

            OCO0OoO.UuUVuuUu(this.UuUVuuUu, "§a" + var10);
         }
      }
   }

   public void method_11157(class_2708 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      if (var2 != null && !var2.method_5765()) {
         class_10182 var3 = class_10182.method_63638(var2);
         Set var4 = var1.comp_3229();
         class_10182 var5 = class_10182.method_63639(var3, var1.comp_3228(), var4);
         class_10182 var6 = new class_10182(var2.method_61411(), class_243.field_1353, var2.field_5982, var2.field_6004);
         class_10182 var7 = class_10182.method_63639(var6, var1.comp_3228(), var4);
         var2.method_33574(var5.comp_3148());
         var2.method_18799(var5.comp_3149());
         var2.method_36456(var5.comp_3150());
         var2.method_36457(var5.comp_3151());
         var2.method_63615(var7.comp_3148(), var7.comp_3150(), var7.comp_3151());
         UuUVuuUu(var2);
         var2.C00OOC00oO();
      }

      this.field_45589.method_10743(new class_2793(var1.comp_3133()));
      if (var2 != null) {
         this.field_45589
            .method_10743(
               new class_2830(
                  var2.method_23317(), var2.method_23318(), var2.method_23321(), var2.method_36454(), var2.method_36455(), var2.method_24828(), var2.field_5976
               )
            );
      }
   }

   public void method_11122(class_2749 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      if (var2 != null) {
         var2.method_6033(var1.method_11833());
         var2.method_7344().method_7580(var1.method_11831());
         var2.method_7344().method_7581(var1.method_11834());
      }
   }

   public void method_11088(class_2683 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VnUvNVNVNUUn var2 = this.UuUVuuUu.VVuuUN();
      if (var2 != null) {
         class_9209 var3 = var1.comp_2270();
         class_22 var4 = var2.method_17891(var3);
         if (var4 == null) {
            var4 = class_22.method_32362(var1.comp_2271(), var1.comp_2272(), var2.method_27983());
            var2.method_47437(var3, var4);
         }

         var1.method_11642(var4);
         this.C00OOC00oO.method_61963().method_62622(var3, var4);
      }
   }

   public void method_11153(class_2649 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      if (var2 != null) {
         if (var1.comp_3837() == 0) {
            var2.field_7498.method_7610(var1.comp_3838(), var1.comp_3839(), var1.comp_3840());
         } else if (var1.comp_3837() == var2.field_7512.field_7763) {
            var2.field_7512.method_7610(var1.comp_3838(), var1.comp_3839(), var1.comp_3840());
         }
      }
   }

   public void method_11109(class_2653 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      if (var2 != null) {
         class_1799 var3 = var1.method_11449();
         int var4 = var1.method_11450();
         if (var1.method_11452() == 0) {
            var2.field_7498.method_7619(var4, var1.method_37439(), var3);
         } else if (var1.method_11452() == var2.field_7512.field_7763) {
            var2.field_7512.method_7619(var4, var1.method_37439(), var3);
         }
      }
   }

   public void method_11131(class_2651 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      if (var2 != null && var2.field_7512 != null && var2.field_7512.field_7763 == var1.method_11448()) {
         var2.field_7512.method_7606(var1.method_11445(), var1.method_11446());
      }
   }

   public void method_61187(class_9834 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      if (var2 != null && var2.field_7512 != null) {
         var2.field_7512.method_34254(var1.comp_2890());
      }
   }

   public void method_61188(class_9835 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      if (var2 != null) {
         var2.method_31548().method_5447(var1.comp_2891(), var1.comp_2892());
      }
   }

   public void method_11135(class_2735 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      if (var2 != null && class_1661.method_7380(var1.comp_3325())) {
         var2.method_31548().method_61496(var1.comp_3325());
      }
   }

   public void method_43596(class_7439 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_43596(var1);
      }
   }

   public void method_43595(class_7438 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_43595(var1);
      }
   }

   public void method_45724(class_7827 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_45724(var1);
      }
   }

   public void method_17587(class_3944 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_17587(var1);
      } else {
         VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
         if (var2 != null) {
            try {
               class_1703 var3 = var1.method_17593().method_17434(var1.method_17592(), var2.method_31548());
               if (var3 != null) {
                  var2.field_7512 = var3;
               } else {
                  this.field_45589.method_10743(new class_2815(var1.method_17592()));
               }
            } catch (Throwable var4) {
               this.field_45589.method_10743(new class_2815(var1.method_17592()));
               OCO0OoO.UuUVuuUu(this.UuUVuuUu, "§cheadless screen open failed: " + var4.getClass().getSimpleName());
            }
         }
      }
   }

   public void method_11128(class_2672 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VnUvNVNVNUUn var2 = this.UuUVuuUu.VVuuUN();
      if (var2 != null) {
         int var3 = var1.method_11523();
         int var4 = var1.method_11524();
         class_6603 var5 = var1.method_38598();
         var2.method_2935().method_16020(var3, var4, var5.method_38586(), var5.method_38594(), var5.method_38587(var3, var4));
         class_6606 var6 = var1.method_38599();
         ClientPlayNetworkHandlerAccessor var7 = (ClientPlayNetworkHandlerAccessor)this;
         var2.method_38536(() -> {
            var7.wild$readLightData(var3, var4, var6, false);
            if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
               class_2818 var6x = var2.method_2935().method_12126(var3, var4, false);
               if (var6x != null) {
                  var7.wild$scheduleRenderChunk(var6x, var3, var4);
                  this.C00OOC00oO.field_1769.method_65201(var6x.method_12004());
               }
            }
         });
      }
   }

   public void method_11100(class_2637 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VnUvNVNVNUUn var2 = this.UuUVuuUu.VVuuUN();
      if (var2 != null) {
         var1.method_30621((var1x, var2x) -> var2.method_41928(var1x, var2x, 19));
      }
   }

   public void method_11107(class_2666 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VnUvNVNVNUUn var2 = this.UuUVuuUu.VVuuUN();
      if (var2 != null) {
         var2.method_2935().method_2859(var1.comp_1726());
      }
   }

   public void method_64554(class_10265 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      if (var2 != null) {
         var2.method_36456(var1.comp_3230());
         var2.method_36457(var1.comp_3231());
         var2.method_63614();
         UuUVuuUu(var2);
         var2.C00OOC00oO();
         this.field_45589.method_10743(new class_2831(var2.method_36454(), var2.method_36455(), var2.method_24828(), var2.field_5976));
      }
   }

   public void method_11117(class_2724 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      VnUvNVNVNUUn var3 = this.UuUVuuUu.VVuuUN();
      class_636 var4 = this.UuUVuuUu.uVUuuVnNVU();
      if (var2 != null && var3 != null && var4 != null) {
         class_8589 var5 = var1.comp_1728();
         ClientPlayNetworkHandlerAccessor var6 = (ClientPlayNetworkHandlerAccessor)this;
         boolean var7 = !var3.method_27983().equals(var5.comp_1554());
         VnUvNVNVNUUn var8 = var3;
         if (var7) {
            class_5271 var9 = var3.method_28104();
            class_5271 var10 = new class_5271(var9.method_207(), var9.method_152(), var5.comp_1559());
            var8 = new VnUvNVNVNUUn(
               this.UuUVuuUu,
               this,
               var10,
               var5.comp_1554(),
               var5.comp_1553(),
               var6.wild$getChunkLoadDistance(),
               var6.wild$getSimulationDistance(),
               var5.comp_1558(),
               var5.comp_1555(),
               var5.comp_2893()
            );
            var8.UuUVuuUu(var3);
            var6.wild$setWorldProperties(var10);
            var6.wild$setWorld(var8);
         }

         boolean var12 = var1.method_48016((byte)2);
         VNNVunUvvnn var13 = new VNNVunUvvnn(
            this.UuUVuuUu,
            this.C00OOC00oO,
            var8,
            this,
            var2.method_3143(),
            var2.method_3130(),
            var12 ? var2.method_71091() : class_10185.field_54098,
            var12 && var2.method_5624()
         );
         var13.method_5838(var2.method_5628());
         if (var12) {
            List var11 = var2.method_5841().method_46357();
            if (var11 != null) {
               var13.method_5841().method_12779(var11);
            }

            var13.method_18799(var2.method_18798());
            var13.method_36456(var2.method_36454());
            var13.method_36457(var2.method_36455());
         } else {
            var13.method_33689();
            var13.method_36456(-180.0F);
         }

         if (var1.method_48016((byte)1)) {
            var13.method_6127().method_26846(var2.method_6127());
         } else {
            var13.method_6127().method_60614(var2.method_6127());
         }

         var13.method_7268(var2.method_7302());
         var13.method_22420(var2.method_22419());
         var13.method_43120(var5.comp_1560());
         var13.method_51850(var5.comp_1561());
         UuUVuuUu(var13);
         var8.method_53875(var13);
         var4.method_32790(var5.comp_1556(), var5.comp_1557());
         var4.method_2903(var13);
         var2.field_3913 = new class_744();
         this.UuUVuuUu.UuUVuuUu(var8);
         this.UuUVuuUu.UuUVuuUu(var13);
         this.UuUVuuUu.C00OOC00oO(false);
         if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
            nnVNNuuVUVn.UuUVuuUu(this.UuUVuuUu);
            class_437 var14 = this.C00OOC00oO.field_1755;
            if (var14 instanceof class_418 || var14 instanceof class_434) {
               this.C00OOC00oO.method_1507(null);
            }
         }
      } else {
         OCO0OoO.UuUVuuUu(this.UuUVuuUu, "§cignored respawn without a complete bot session");
      }
   }

   public void method_11085(class_2668 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11085(var1);
      } else {
         VnUvNVNVNUUn var2 = this.UuUVuuUu.VVuuUN();
         VNNVunUvvnn var3 = this.UuUVuuUu.vNUvnnVnUvu();
         class_5402 var4 = var1.method_11491();
         float var5 = var1.method_11492();
         if (var4 == class_2668.field_25648) {
            if (this.UuUVuuUu.uVUuuVnNVU() != null) {
               this.UuUVuuUu.uVUuuVnNVU().method_2907(class_1934.method_8384(class_3532.method_15375(var5 + 0.5F)));
            }
         } else if (var2 != null && var4 == class_2668.field_25646) {
            var2.method_28104().method_157(true);
            var2.method_8519(0.0F);
         } else if (var2 != null && var4 == class_2668.field_25647) {
            var2.method_28104().method_157(false);
            var2.method_8519(1.0F);
         } else if (var2 != null && var4 == class_2668.field_25652) {
            var2.method_8519(var5);
         } else if (var2 != null && var4 == class_2668.field_25653) {
            var2.method_8496(var5);
         } else if (var3 != null && var4 == class_2668.field_25656) {
            var3.method_22420(var5 == 0.0F);
         } else if (var3 != null && var4 == class_2668.field_46189) {
            var3.method_53848(var5 == 1.0F);
         }
      }
   }

   public void method_11154(class_2696 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      if (var2 != null) {
         var2.method_31549().field_7479 = var1.method_11698();
         var2.method_31549().field_7477 = var1.method_11696();
         var2.method_31549().field_7480 = var1.method_11695();
         var2.method_31549().field_7478 = var1.method_11699();
         var2.method_31549().method_7248(var1.method_11690());
         var2.method_31549().method_7250(var1.method_11691());
      }
   }

   public void method_11101(class_2748 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      if (var2 != null) {
         var2.method_3145(var1.method_11830(), var1.method_11827(), var1.method_11828());
      }
   }

   public void method_11102(class_2645 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11102(var1);
      } else {
         VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
         if (var2 != null) {
            var2.field_7512 = var2.field_7498;
         }
      }
   }

   public void method_11087(class_2656 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
      if (var2 != null) {
         if (var1.comp_2199() == 0) {
            var2.method_7357().method_7900(var1.comp_3082());
         } else {
            var2.method_7357().method_7906(var1.comp_3082(), var1.comp_2199());
         }
      }
   }

   public void method_11090(class_2695 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11090(var1);
      }
   }

   public void method_34075(class_5892 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      if (nnVNNuuVUVn.uNNnnnuuuN(this.UuUVuuUu)) {
         VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
         if (var2 != null && var2.method_5628() == var1.comp_2275()) {
            var2.method_6033(0.0F);
            if (!this.UuUVuuUu.nvUVNnuu()) {
               this.UuUVuuUu.C00OOC00oO(true);
               if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu && this.C00OOC00oO.field_1724 == var2 && var2.method_22419()) {
                  VnUvNVNVNUUn var3 = this.UuUVuuUu.VVuuUN();
                  boolean var4 = var3 != null && var3.method_28104().method_152();
                  this.C00OOC00oO.method_1507(new class_418(var1.comp_2276(), var4));
                  OCO0OoO.UuUVuuUu(this.UuUVuuUu, "died");
               } else {
                  this.field_45589.method_10743(new class_2799(class_2800.field_12774));
                  OCO0OoO.UuUVuuUu(this.UuUVuuUu, "respawning after death ...");
               }
            }
         }
      }
   }

   public void method_11124(class_2664 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11124(var1);
      } else {
         VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
         if (var2 != null) {
            var1.comp_2884().ifPresent(var2::method_45319);
         }
      }
   }

   public void method_11150(class_2775 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11150(var1);
      }
   }

   public void method_11092(class_2707 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11092(var1);
      }
   }

   public void method_11134(class_2692 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11134(var1);
      }
   }

   public void method_11111(class_2734 var1) {
   }

   public void method_11089(class_2648 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11089(var1);
      } else {
         VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
         VnUvNVNVNUUn var3 = this.UuUVuuUu.VVuuUN();
         if (var2 != null && var3 != null) {
            if (var3.method_8469(var1.method_11433()) instanceof class_1496 var5) {
               int var6 = var1.method_11434();
               class_1277 var7 = new class_1277(class_1496.method_60977(var6));
               var2.field_7512 = new class_1724(var1.method_11432(), var2.method_31548(), var7, var5, var6);
            }
         }
      }
   }

   public void method_17186(class_3895 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_17186(var1);
      }
   }

   public void method_11108(class_2693 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11108(var1);
      }
   }

   public void method_17586(class_3943 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_17586(var1);
      } else {
         VNNVunUvvnn var2 = this.UuUVuuUu.vNUvnnVnUvu();
         if (var2 != null && var2.field_7512.field_7763 == var1.method_17589() && var2.field_7512 instanceof class_1728 var3) {
            var3.method_17437(var1.method_17590());
            var3.method_19257(var1.method_19458());
            var3.method_19255(var1.method_19459());
            var3.method_19253(var1.method_19460());
            var3.method_20700(var1.method_20722());
         }
      }
   }

   public void method_11129(class_2617 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11129(var1);
      }
   }

   public void method_64555(class_10266 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_64555(var1);
      }
   }

   public void method_11115(class_10268 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11115(var1);
      }
   }

   public void method_64556(class_10269 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_64556(var1);
      }
   }

   public void method_11146(class_2767 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11146(var1);
      }
   }

   public void method_11125(class_2765 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11125(var1);
      }
   }

   public void method_11077(class_2675 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11077(var1);
      }
   }

   public void method_34083(class_5904 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_34083(var1);
      }
   }

   public void method_34071(class_5888 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_34071(var1);
      }
   }

   public void method_34084(class_5905 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_34084(var1);
      }
   }

   public void method_34082(class_5903 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_34082(var1);
      }
   }

   public void method_34076(class_5894 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_34076(var1);
      }
   }

   public void method_11078(class_2629 var1) {
   }

   public void method_44814(class_7617 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_44814(var1);
      }
   }

   public void method_11116(class_2620 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11116(var1);
      }
   }

   public void method_11094(class_2622 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11094(var1);
      }
   }

   public void method_11158(class_2623 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11158(var1);
      }
   }

   public void method_11098(class_2673 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11098(var1);
      }
   }

   public void method_49631(class_8212 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_49631(var1);
      }
   }

   public void method_20203(class_4273 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_20203(var1);
      }
   }

   public void method_11142(class_2759 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11142(var1);
      }
   }

   public void method_11082(class_2770 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_11082(var1);
      }
   }

   public void method_56607(class_9178 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_56607(var1);
      }
   }

   public void method_66579(class_10614 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_66579(var1);
      }
   }

   public void method_54807(class_8914 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_54807(var1);
      }
   }

   public void method_54806(class_8913 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_54806(var1);
      }
   }

   public void method_11152(class_8710 var1) {
   }

   public void method_71666(class_11407 var1) {
      if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu) {
         super.method_71666(var1);
      }
   }

   public void method_52798(class_8588 var1) {
      class_2600.method_11074(var1, this, this.C00OOC00oO);
      if (!nnVNNuuVUVn.uNNnnnuuuN(this.UuUVuuUu)) {
         nnVNNuuVUVn.uUnuvNvvNU(this.UuUVuuUu);
      } else {
         this.UuUVuuUu.uUnuvNvvNU(false);
         if (nnVNNuuVUVn.UuUVuuUu() == this.UuUVuuUu && this.UuUVuuUu.vNUvnnVnUvu() != null) {
            this.UuUVuuUu.vNUvnnVnUvu().field_3913 = new class_744();
         }

         this.uUnuvNvvNU = true;
         ClientPlayNetworkHandlerAccessor var2 = (ClientPlayNetworkHandlerAccessor)this;
         class_8675 var3 = new class_8675(
            this.method_2879(),
            this.field_45592,
            var2.wild$combinedDynamicRegistries(),
            var2.wild$enabledFeatures(),
            this.field_45591,
            this.field_45590,
            this.field_45593,
            this.field_48399,
            null,
            this.field_52154,
            this.method_72016()
         );
         this.UuUVuuUu.UuUVuuUu(false);
         this.UuUVuuUu.C00OOC00oO(false);
         nnVNNuuVUVn.UuUVuuUu(this.UuUVuuUu, nnVNNuuVUVn.nvnNNunvv.RECONFIGURING, "Reconfiguring (server switch) ...");
         this.field_45589.method_56330(class_9157.field_48699, new uvUVUnvuUvU(this.C00OOC00oO, this.field_45589, var3, this.UuUVuuUu));
         this.field_45589.method_10743(class_8591.field_48186);
         this.field_45589.method_56329(class_9157.field_48698);
         OCO0OoO.UuUVuuUu(this.UuUVuuUu, "reconfiguring (server switch) ...");
      }
   }

   public void method_52784(class_2720 var1) {
      UUID var2 = var1.comp_2158();
      this.field_45589.method_10743(new class_2856(var2, class_2857.field_13016));
      this.field_45589.method_10743(new class_2856(var2, class_2857.field_47704));
      this.field_45589.method_10743(new class_2856(var2, class_2857.field_13017));
      OCO0OoO.UuUVuuUu(this.UuUVuuUu, "resource pack auto-accepted (play)");
   }

   public void method_55512(class_9053 var1) {
   }

   public void method_56150(class_9151 var1) {
      this.field_45589.method_10747(class_2561.method_43471("disconnect.transfer"));
   }

   public void method_10839(class_9812 var1) {
      String var2 = "disconnected: " + var1.comp_2853().getString();
      nnVNNuuVUVn.C00OOC00oO(this.UuUVuuUu, var2);
      OCO0OoO.UuUVuuUu(this.UuUVuuUu, "§c" + var2);
      nnVNNuuVUVn.uUnuvNvvNU(this.UuUVuuUu);
   }

   private static void UuUVuuUu(VNNVunUvvnn var0) {
      float var1 = var0.method_36454();
      var0.method_5847(var1);
      var0.field_6259 = var1;
      var0.method_5636(var1);
      var0.field_6220 = var1;
   }

   public boolean method_48106() {
      return this.field_45589.method_10758();
   }
}
