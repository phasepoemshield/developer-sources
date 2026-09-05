package org.wild.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import net.minecraft.class_3928;
import net.minecraft.class_412;
import net.minecraft.class_434;
import net.minecraft.class_435;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_500;
import net.minecraft.class_638;
import net.minecraft.class_434.class_9678;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.CocoCOCco0C;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.NnVNuVNVuU;
import ru.metaculture.protection.NuvVVvUU;
import ru.metaculture.protection.UvuuunvnNNUU;
import ru.metaculture.protection.VNNUVUuN;
import ru.metaculture.protection.VNUNnUVUvUuu;
import ru.metaculture.protection.VUUnVnVNNU;
import ru.metaculture.protection.VVnVVnvnNuUn;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.VvUNVunnuu;
import ru.metaculture.protection.VvVVnnNNNuV;
import ru.metaculture.protection.coOCCcooOcOO;
import ru.metaculture.protection.nVUVuNnVvU;
import ru.metaculture.protection.nnVNNuuVUVn;
import ru.metaculture.protection.nuuvUNvn;
import ru.metaculture.protection.nvVuNVunNnu;
import ru.metaculture.protection.nvnvNnuUVNV;
import ru.metaculture.protection.oocOO0CCC0O;
import ru.metaculture.protection.uNVUuVuNNUvn;
import ru.metaculture.protection.uNuVuVnNnu;
import ru.metaculture.protection.uVuVNVuuN;
import ru.metaculture.protection.vVnvuVuVvnun;

@Environment(EnvType.CLIENT)
@Mixin({class_310.class})
public abstract class MinecraftClientMixin {
   @Shadow
   private int field_1752;
   @Shadow
   private int field_1771;
   @Unique
   private boolean wild$hideOpenedScreen;
   @Unique
   private class_437 wild$diagPreviousScreen;

   @Inject(
      method = {"stop"},
      at = {@At("HEAD")}
   )
   private void wild$onStop(CallbackInfo var1) {
      if (NVnVnNnN.unNNVVNnvvV()) {
         VVnVVnvnNuUn.UuUVuuUu().uUnuvNvvNU();
         NVnVnNnN.uNNnnnuuuN();
      }
   }

   @Inject(
      method = {"stop"},
      at = {@At("RETURN")}
   )
   private void wild$onStopReturned(CallbackInfo var1) {
      NVnVnNnN.nuUnNvnuUu();
   }

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void wild$coreTickHead(CallbackInfo var1) {
      vVnvuVuVvnun.UuUVuuUu().C00OOC00oO();
      VUUnVnVNNU.UuUVuuUu();
      class_310 var2 = (class_310)this;
      if (NVnVnNnN.unNNVVNnvvV()) {
         nvnvNnuUVNV.C00OOC00oO(var2);
         nvnvNnuUVNV.UuUVuuUu(var2);
         NuvVVvUU.UuUVuuUu(var2);
      }
   }

   @Inject(
      method = {"tick"},
      at = {@At("TAIL")}
   )
   private void wild$coreTickTail(CallbackInfo var1) {
      if (NVnVnNnN.unNNVVNnvvV()) {
         nnVNNuuVUVn.nuUnNvnuUu();
      }

      vVnvuVuVvnun.UuUVuuUu().uUnuvNvvNU();
      class_310 var2 = (class_310)this;
      if (NVnVnNnN.unNNVVNnvvV() && !var2.method_1493() && var2.field_1724 != null && var2.field_1687 != null) {
         try {
            NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)(new nVUVuNnVvU(var2)));
         } catch (Throwable var4) {
         }
      }
   }

   @Inject(
      method = {"joinWorld(Lnet/minecraft/client/world/ClientWorld;Lnet/minecraft/client/gui/screen/DownloadingTerrainScreen$WorldEntryReason;)V"},
      at = {@At("TAIL")}
   )
   private void wild$loadWorld(class_638 var1, class_9678 var2, CallbackInfo var3) {
      nvnvNnuUVNV.UuUVuuUu();
      if (var1 != null) {
         try {
            NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)(new coOCCcooOcOO()));
            NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)(new NnVNuVNVuU()));
         } catch (Throwable var5) {
         }
      }
   }

   @Inject(
      method = {"onResolutionChanged"},
      at = {@At("TAIL")}
   )
   private void wild$onResolutionChanged(CallbackInfo var1) {
      class_310 var2 = (class_310)this;
      if (var2.method_22683() != null) {
         NVnVnNnN.UuUVuuUu(var2.method_22683().method_4489(), var2.method_22683().method_4506());
      } else {
         NVnVnNnN.UuUVuuUu(0, 0);
      }
   }

   @Inject(
      method = {"onWindowFocusChanged"},
      at = {@At("HEAD")}
   )
   private void wild$onWindowFocusChanged(boolean var1, CallbackInfo var2) {
      class_310 var3 = (class_310)this;
      if (!var1 && var3.field_1729 != null) {
         var3.field_1729.method_1610();
      }

      NVnVnNnN.UuUVuuUu(var1);
   }

   @Inject(
      method = {"setScreen"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$handleScreenSet(class_437 var1, CallbackInfo var2) {
      class_310 var3 = (class_310)this;
      this.wild$diagPreviousScreen = var3.field_1755;
      if (NVnVnNnN.unNNVVNnvvV() && !uVuVNVuuN.uVunuUNVVUUV) {
         if (var1 instanceof class_442 && !(var1 instanceof VvVVnnNNNuV)) {
            try {
               var3.method_1507(new VvVVnnNNNuV());
            } catch (Throwable var5) {
            }

            var2.cancel();
         } else if (var1 instanceof class_500 && !(var1 instanceof uNuVuVnNnu)) {
            try {
               Object var8 = var3.field_1755 instanceof VvVVnnNNNuV ? var3.field_1755 : new VvVVnnNNNuV();
               var3.method_1507(new uNuVuVnNnu((class_437)var8));
            } catch (Throwable var6) {
            }

            var2.cancel();
         } else {
            if (var1 != null) {
               CocoCOCco0C var4 = new CocoCOCco0C(var1);
               NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var4);
               if (var4.UuUVuuUu()) {
                  var2.cancel();
                  return;
               }

               if (var4.uNNnnnuuuN()) {
                  this.wild$hideOpenedScreen = true;
               }
            }

            oocOO0CCC0O.UuUVuuUu().uNNnnnuuuN();
            if (!this.wild$isLoadingScreen(var1)
               && var3.field_1687 == null
               && !this.wild$isLoadingScreen(var3.field_1755)
               && !(var3.field_1755 instanceof uNVUuVuNNUvn)
               && !(var1 instanceof uNVUuVuNNUvn)) {
               try {
                  VVnVVnvnNuUn.UuUVuuUu().UuUVuuUu(var3.field_1755, var1);
               } catch (Throwable var7) {
                  VVnVVnvnNuUn.UuUVuuUu().uUnuvNvvNU();
               }
            } else {
               VVnVVnvnNuUn.UuUVuuUu().uUnuvNvvNU();
            }
         }
      }
   }

   @Inject(
      method = {"setScreen"},
      at = {@At("TAIL")}
   )
   private void wild$postScreenSet(class_437 var1, CallbackInfo var2) {
      class_310 var3 = (class_310)this;
      if (NVnVnNnN.unNNVVNnvvV()) {
         VNNUVUuN.UuUVuuUu(this.wild$diagPreviousScreen, var1);
      }

      if (this.wild$hideOpenedScreen) {
         this.wild$hideOpenedScreen = false;
         if (var1 != null && var3.field_1755 == var1) {
            var3.field_1755 = null;
            if (var3.field_1729 != null) {
               var3.field_1729.method_1612();
            }
         }
      }

      if (NVnVnNnN.unNNVVNnvvV() && !uVuVNVuuN.uVunuUNVVUUV && var1 != null && !(var1 instanceof uNVUuVuNNUvn)) {
         nuuvUNvn.UuUVuuUu(var3);
      }
   }

   @Unique
   private boolean wild$isLoadingScreen(class_437 var1) {
      return var1 instanceof class_3928 || var1 instanceof class_434 || var1 instanceof class_412 || var1 instanceof class_435;
   }

   @Inject(
      method = {"disconnect(Lnet/minecraft/client/gui/screen/Screen;Z)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$blockPvpSafeDisconnect(class_437 var1, boolean var2, CallbackInfo var3) {
      if (UvuuunvnNNUU.uUnuvNvvNU(var2)) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"doAttack"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$onDoAttackHitbox(CallbackInfoReturnable<Boolean> var1) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         class_310 var2 = (class_310)this;
         if (var2.field_1724 != null && var2.field_1687 != null && var2.field_1761 != null && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null
            )
          {
            VNUNnUVUvUuu var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(VNUNnUVUvUuu.class);
            if (var3 != null && var3.nuUnNvnuUu && VNUNnUVUvUuu.NVNnnvnuunNv.C00OOC00oO("Легит")) {
               class_1309 var4 = var3.UuuNnUvUuv();
               if (var4 != null) {
                  VNUNnUVUvUuu.UuUVuuUu(var4);
                  VvUNVunnuu.UuUVuuUu(var4, true, VNUNnUVUvUuu.uNnUnnuNUnNu.uUnuvNvvNU());
                  var1.setReturnValue(true);
               }
            }
         }
      }
   }

   @Inject(
      method = {"doAttack"},
      at = {@At("RETURN")}
   )
   private void wild$onDoAttackNoDelay(CallbackInfoReturnable<Boolean> var1) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            nvVuNVunNnu var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nvVuNVunNnu.class);
            if (var2 != null && var2.nuUnNvnuUu && nvVuNVunNnu.uNnUnnuNUnNu.uUnuvNvvNU()) {
               this.field_1771 = (int)nvVuNVunNnu.UvUvUNuvNU.uUnuvNvvNU();
            }
         }
      }
   }

   @Inject(
      method = {"doItemUse"},
      at = {@At("RETURN")}
   )
   private void wild$onDoItemUseNoDelay(CallbackInfo var1) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            nvVuNVunNnu var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nvVuNVunNnu.class);
            if (var2 != null && var2.nuUnNvnuUu && nvVuNVunNnu.NnUuNNU.uUnuvNvvNU()) {
               this.field_1752 = (int)nvVuNVunNnu.c0oOOCcCoC0.uUnuvNvvNU();
            }
         }
      }
   }
}
