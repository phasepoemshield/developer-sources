package org.wild.mixin;

import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_2561;
import net.minecraft.class_342;
import net.minecraft.class_4717;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.UNUuvUN;
import ru.metaculture.protection.uVuVNVuuN;

@Mixin({class_4717.class})
public abstract class ChatInputSuggestorMixin {
   @Shadow
   @Final
   class_342 field_21599;
   @Shadow
   private CompletableFuture<Suggestions> field_21611;

   @Shadow
   public abstract void method_23920(boolean var1);

   @Inject(
      method = {"refresh"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRefresh(CallbackInfo var1) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (!uVuVNVuuN.uVunuUNVVUUV) {
            String var2 = this.field_21599.method_1882();
            String var3 = NVnVnNnN.UuUVuuUu.VVnVNnunVvu();
            if (var2.startsWith(var3)) {
               int var4 = this.field_21599.method_1881();
               String var5 = var2.substring(0, var4);
               int var6 = var5.lastIndexOf(32) + 1;
               if (var6 < 0) {
                  var6 = 0;
               }

               SuggestionsBuilder var7 = new SuggestionsBuilder(var5, var6);
               String var8 = var5.substring(var3.length());
               String[] var9 = var8.split(" ", -1);
               String var10 = var9[0];
               if (var9.length <= 1) {
                  for (UNUuvUN var16 : NVnVnNnN.UuUVuuUu.UvUvUNuvNU().UuUVuuUu()) {
                     if (var16.UuUVuuUu().toLowerCase().startsWith(var10.toLowerCase())) {
                        var7.suggest(var3 + var16.UuUVuuUu(), class_2561.method_43470(var16.C00OOC00oO()));
                     }
                  }
               } else {
                  for (UNUuvUN var12 : NVnVnNnN.UuUVuuUu.UvUvUNuvNU().UuUVuuUu()) {
                     if (var12.UuUVuuUu().equalsIgnoreCase(var10)) {
                        for (String var14 : var12.UuUVuuUu(var9)) {
                           var7.suggest(var14);
                        }
                     }
                  }
               }

               this.field_21611 = var7.buildFuture();
               this.method_23920(false);
               var1.cancel();
            }
         }
      }
   }

   @Shadow
   public abstract void method_23933(boolean var1);

   @Inject(
      method = {"refresh"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$hideSuggestionsOnUnhook(CallbackInfo var1) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (uVuVNVuuN.uVunuUNVVUUV) {
            String var2 = this.field_21599.method_1882();
            String var3 = NVnVnNnN.UuUVuuUu.VVnVNnunVvu();
            if (var2 != null && (var2.startsWith(var3) || var2.startsWith("#"))) {
               this.method_23933(false);
               var1.cancel();
            }
         }
      }
   }
}
