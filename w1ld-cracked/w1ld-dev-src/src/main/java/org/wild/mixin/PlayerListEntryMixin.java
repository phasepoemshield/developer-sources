package org.wild.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.class_2960;
import net.minecraft.class_640;
import net.minecraft.class_8685;
import net.minecraft.class_8685.class_7920;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.UnVVnUuvNvu;
import ru.metaculture.protection.uUvNnuVUNv;

@Mixin({class_640.class})
public abstract class PlayerListEntryMixin {
   @Unique
   private class_2960 customCape = null;
   @Unique
   private boolean capeLoaded = false;

   @Shadow
   public abstract GameProfile method_2966();

   @Inject(
      method = {"getSkinTextures"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wild$replaceSkinsAndCapes(CallbackInfoReturnable<class_8685> var1) {
      class_8685 var2 = (class_8685)var1.getReturnValue();
      if (var2 != null && NVnVnNnN.vNUvnnVnUvu()) {
         boolean var3 = false;
         class_2960 var4 = var2.comp_1626();
         class_2960 var5 = var2.comp_1627();
         class_2960 var6 = var2.comp_1628();
         class_7920 var7 = var2.comp_1629();
         if (UnVVnUuvNvu.nUUVuvU()) {
            class_8685 var8 = UnVVnUuvNvu.uVUVnuvnuVuv();
            if (var8 != null) {
               var4 = var8.comp_1626();
               var7 = var8.comp_1629();
               var3 = true;
            }
         }

         if (!this.capeLoaded) {
            this.capeLoaded = true;
            GameProfile var10 = this.method_2966();
            if (var10 != null) {
               uUvNnuVUNv var9 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(uUvNnuVUNv.class);
               if (var9 != null && var9.nuUnNvnuUu) {
                  uUvNnuVUNv.UuUVuuUu(var10, var1x -> this.customCape = var1x);
               }
            }
         }

         if (this.customCape != null) {
            var5 = this.customCape;
            var6 = this.customCape;
            var3 = true;
         }

         if (var3) {
            var1.setReturnValue(new class_8685(var4, var2.comp_1911(), var5, var6, var7, var2.comp_1630()));
         }
      }
   }
}
