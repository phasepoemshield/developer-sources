package org.wild.mixin;

import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_476;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.uVuVNVuuN;
import ru.metaculture.protection.uuVUVN;

@Mixin({class_465.class})
public abstract class ChestScreenMixin extends class_437 {
   @Shadow
   protected int field_2776;
   @Shadow
   protected int field_2800;
   @Shadow
   protected int field_2792;
   @Unique
   private class_4185 autoBuyButton;

   protected ChestScreenMixin(class_2561 var1) {
      super(var1);
   }

   @Inject(
      method = {"init"},
      at = {@At("TAIL")}
   )
   private void initAutoBuyButtons(CallbackInfo var1) {
      if (!uVuVNVuuN.uVunuUNVVUUV) {
         if (this instanceof class_476) {
            String var2 = this.method_25440().getString();
            if (var2 != null && (var2.contains("Аукцион") || var2.contains("Auction") || var2.contains("Поиск: "))) {
               uuVUVN var3 = this.getAutoBuyModule();
               if (var3 != null) {
                  byte var4 = 5;
                  byte var5 = 100;
                  byte var6 = 20;
                  int var7 = this.field_2776 + this.field_2792 / 2 - var5 / 2;
                  int var8 = this.field_2800 - var6 - var4;
                  this.autoBuyButton = class_4185.method_46430(this.getButtonText(var3), var2x -> {
                     var3.a_();
                     var2x.method_25355(this.getButtonText(var3));
                  }).method_46434(var7, var8, var5, var6).method_46431();
                  this.method_37063(this.autoBuyButton);
               }
            }
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void updateButtonStates(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this instanceof class_476) {
         if (this.autoBuyButton != null) {
            this.autoBuyButton.field_22764 = !uVuVNVuuN.uVunuUNVVUUV;
            this.autoBuyButton.field_22763 = !uVuVNVuuN.uVunuUNVVUUV;
         }

         if (!uVuVNVuuN.uVunuUNVVUUV) {
            uuVUVN var6 = this.getAutoBuyModule();
            if (var6 != null && this.autoBuyButton != null) {
               this.autoBuyButton.method_25355(this.getButtonText(var6));
            }
         }
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void onTick(CallbackInfo var1) {
      if (!uVuVNVuuN.uVunuUNVVUUV) {
         if (this instanceof class_476) {
            String var2 = this.method_25440().getString();
            if (var2 != null && (var2.contains("Аукцион") || var2.contains("Auction") || var2.contains("Поиск: "))) {
               uuVUVN var3 = this.getAutoBuyModule();
               if (var3 != null && var3.nuUnNvnuUu && var3.nNvNUVU.uUnuvNvvNU()) {
                  var3.nNvNUVU();
               }
            }
         }
      }
   }

   @Unique
   private class_2561 getButtonText(uuVUVN var1) {
      String var2 = var1.nuUnNvnuUu ? "§aON" : "§cOFF";
      return class_2561.method_30163("AutoBuy: " + var2);
   }

   @Unique
   private uuVUVN getAutoBuyModule() {
      return !NVnVnNnN.vNUvnnVnUvu() ? null : NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(uuVUVN.class);
   }
}
