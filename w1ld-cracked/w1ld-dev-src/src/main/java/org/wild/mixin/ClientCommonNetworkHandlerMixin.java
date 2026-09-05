package org.wild.mixin;

import java.util.Locale;
import net.minecraft.class_2535;
import net.minecraft.class_2720;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_642;
import net.minecraft.class_8673;
import net.minecraft.class_8674;
import net.minecraft.class_9812;
import net.minecraft.class_642.class_643;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.nnVNNuuVUVn;
import ru.metaculture.protection.nvNVVNvnVunu;
import ru.metaculture.protection.nvnvNnuUVNV;
import ru.metaculture.protection.uvUVUnvuUvU;

@Mixin({class_8673.class})
public abstract class ClientCommonNetworkHandlerMixin {
   @Shadow
   protected class_642 field_45590;
   @Shadow
   protected class_310 field_45588;
   @Shadow
   protected class_2535 field_45589;

   @Inject(
      method = {"onDisconnected"},
      at = {@At("TAIL")}
   )
   private void onDisconnected(class_9812 var1, CallbackInfo var2) {
      nvnvNnuUVNV.UuUVuuUu(this.field_45590, var1);
   }

   @Inject(
      method = {"onDisconnected"},
      at = {@At("HEAD")}
   )
   private void wild$restoreHostBeforeDisconnect(class_9812 var1, CallbackInfo var2) {
      if (this instanceof class_634 var3) {
         nnVNNuuVUVn.C00OOC00oO(var3);
      } else if (this instanceof class_8674 && !(this instanceof uvUVUnvuUvU)) {
         nnVNNuuVUVn.nUUVuvU();
      }
   }

   @Inject(
      method = {"onResourcePackSend"},
      at = {@At("HEAD")}
   )
   private void wild$preferVanillaServerResourcePack(class_2720 var1, CallbackInfo var2) {
      if (var1 != null && this.field_45588 != null && this.wild$playerHelperWantsLoad()) {
         if ((this.wild$isFunTimeEndpoint(var1.comp_2159()) || this.wild$isFunTimeEndpoint(this.wild$currentServerAddress())) && this.field_45590 != null) {
            this.field_45590.method_2995(class_643.field_3768);
         }
      }
   }

   private boolean wild$playerHelperWantsLoad() {
      if (!NVnVnNnN.vNUvnnVnUvu()) {
         return false;
      } else {
         try {
            if (NVnVnNnN.unNNVVNnvvV() && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
               nvNVVNvnVunu var1 = (nvNVVNvnVunu)NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(nvNVVNvnVunu.class);
               return var1 != null && var1.NVNnnvnuunNv.C00OOC00oO("Load");
            } else {
               return false;
            }
         } catch (Throwable var2) {
            return false;
         }
      }
   }

   private String wild$currentServerAddress() {
      try {
         if (this.field_45590 != null && this.field_45590.field_3761 != null) {
            return this.field_45590.field_3761;
         } else {
            class_642 var1 = this.field_45588.method_1558();
            return var1 == null ? "" : var1.field_3761;
         }
      } catch (Throwable var2) {
         return "";
      }
   }

   private boolean wild$isFunTimeEndpoint(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = var1.toLowerCase(Locale.ROOT);
         return var2.contains("funtime") || var2.contains("fun-time") || var2.contains("ftmc");
      } else {
         return false;
      }
   }
}
