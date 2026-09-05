package ru.metaculture.protection;

import java.util.ArrayDeque;
import java.util.Queue;
import net.minecraft.class_1268;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2815;
import net.minecraft.class_6880;
import net.minecraft.class_9334;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoPotion",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Автоматически кидает под вас взрывные зелья"
)
public class AutoPotion extends Module {
   public static AutoPotion NVNnnvnuunNv;
   public static boolean uVunuUNVVUUV = false;
   public final VUVnvvnNN UNnVVNvvnVvU = new VUVnvvnNN(
      "Что бафать: ", new vvNnnUNnVvn("Сила", false), new vvNnnUNnVvn("Скорость", false), new vvNnnUNnVvn("Огнестойкость", false)
   );
   public final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Кидать смотря вниз", false);
   private final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Только в PVP", false);
   private final Queue<Integer> nNvNUVU = new ArrayDeque<>();
   private int UnUNuUU = -1;
   private boolean uUVuVvuNUvnu = false;
   private int UvUvUNuvNU = 0;

   public AutoPotion() {
      NVNnnvnuunNv = this;
      this.UuUVuuUu(new nvUuvVvuuN[]{this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         if (this.nNvNUVU.isEmpty()) {
            if (uVunuUNVVUUV) {
               this.UnUNVVVNuv();
            }

            if (this.UvUvUNuvNU > 0) {
               this.UvUvUNuvNU--;
            } else if (!this.NnUuNNU.uUnuvNvvNU() || this.nUUVuvU()) {
               if (!this.uNnUnnuNUnNu.uUnuvNvvNU() || !(uUnuvNvvNU.field_1724.method_36455() < 80.0F)) {
                  this.UuuNnUvUuv();
               }
            }
         } else {
            if (!uVunuUNVVUUV) {
               uVunuUNVVUUV = true;
               if (!this.uNnUnnuNUnNu.uUnuvNvvNU()) {
                  NNvvnnunn.uUnuvNvvNU = uUnuvNvvNU.field_1724.method_36454();
                  NNvvnnunn.vVvUvVVuuNvV = uUnuvNvvNU.field_1724.method_36455();
                  NNvvnnunn.UuUVuuUu = true;
               }

               if (this.UnUNuUU == -1) {
                  this.UnUNuUU = uUnuvNvvNU.field_1724.method_31548().method_67532();
               }
            }

            uUnuvNvvNU.field_1690.field_1867.method_23481(false);
            uUnuvNvvNU.field_1724.method_5728(false);
            if (!this.uNnUnnuNUnNu.uUnuvNvvNU()) {
               uUnuvNvvNU.field_1724.method_36457(90.0F);
            }

            int var2 = this.nNvNUVU.poll();
            if (var2 < 9) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(var2);
               ((ClientPlayerInteractionManagerAccessor)uUnuvNvvNU.field_1761).invokeSyncSelectedSlot();
            } else {
               this.uUVuVvuNUvnu = true;
               uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var2, this.UnUNuUU, class_1713.field_7791, uUnuvNvvNU.field_1724);
            }

            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            if (var2 < 9) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(this.UnUNuUU);
               ((ClientPlayerInteractionManagerAccessor)uUnuvNvvNU.field_1761).invokeSyncSelectedSlot();
            } else {
               uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var2, this.UnUNuUU, class_1713.field_7791, uUnuvNvvNU.field_1724);
            }

            if (this.nNvNUVU.isEmpty()) {
               if (this.uUVuVvuNUvnu) {
                  uUnuvNvvNU.field_1724.field_3944.method_52787(new class_2815(uUnuvNvvNU.field_1724.field_7498.field_7763));
                  this.uUVuVvuNUvnu = false;
               }

               this.UvUvUNuvNU = 1;
               this.UnUNVVVNuv();
            }
         }
      }
   }

   private void UuuNnUvUuv() {
      boolean var1 = this.UNnVVNvvnVvU.C00OOC00oO("Сила") && !uUnuvNvvNU.field_1724.method_6059(class_1294.field_5910);
      boolean var2 = this.UNnVVNvvnVvU.C00OOC00oO("Скорость") && !uUnuvNvvNU.field_1724.method_6059(class_1294.field_5904);
      boolean var3 = this.UNnVVNvvnVvU.C00OOC00oO("Огнестойкость") && !uUnuvNvvNU.field_1724.method_6059(class_1294.field_5918);
      if (var1 || var2 || var3) {
         for (int var4 = 0; var4 < 36; var4++) {
            class_1799 var5 = uUnuvNvvNU.field_1724.method_31548().method_5438(var4);
            if (!var5.method_7960() && var5.method_7909() == class_1802.field_8436) {
               class_1844 var6 = (class_1844)var5.method_58694(class_9334.field_49651);
               if (var6 != null) {
                  for (class_1293 var8 : var6.method_57397()) {
                     class_6880 var9 = var8.method_5579();
                     if (var1 && var9.equals(class_1294.field_5910)) {
                        this.nNvNUVU.add(var4);
                        var1 = false;
                        break;
                     }

                     if (var2 && var9.equals(class_1294.field_5904)) {
                        this.nNvNUVU.add(var4);
                        var2 = false;
                        break;
                     }

                     if (var3 && var9.equals(class_1294.field_5918)) {
                        this.nNvNUVU.add(var4);
                        var3 = false;
                        break;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean nUUVuvU() {
      for (class_1657 var2 : uUnuvNvvNU.field_1687.method_18456()) {
         if (var2 != uUnuvNvvNU.field_1724 && uUnuvNvvNU.field_1724.method_5858(var2) <= 225.0) {
            return true;
         }
      }

      return false;
   }

   private void UnUNVVVNuv() {
      uVunuUNVVUUV = false;
      this.UnUNuUU = -1;
      if (!this.uNnUnnuNUnNu.uUnuvNvvNU()) {
         if (uUnuvNvvNU.field_1724 != null) {
            uUnuvNvvNU.field_1724.method_36456(NNvvnnunn.uUnuvNvvNU);
            uUnuvNvvNU.field_1724.method_36457(NNvvnnunn.vVvUvVVuuNvV);
         }

         NNvvnnunn.UuUVuuUu = false;
      }
   }

   @Override
   public void C00OOC00oO() {
      this.nNvNUVU.clear();
      this.UnUNVVVNuv();
      super.C00OOC00oO();
   }
}
