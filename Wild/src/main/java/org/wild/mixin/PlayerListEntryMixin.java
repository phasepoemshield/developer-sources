package org.wild.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.client.util.SkinTextures.Model;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.Cape;
import ru.metaculture.protection.ProtectInfo;
import ru.metaculture.protection.WildClient;

@Mixin({PlayerListEntry.class})
public abstract class PlayerListEntryMixin {
   @Unique
   private Identifier customCape = null;
   @Unique
   private boolean capeLoaded = false;

   @Shadow
   public abstract GameProfile getProfile();

   @Inject(
      method = {"getSkinTextures"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wild$replaceSkinsAndCapes(CallbackInfoReturnable<SkinTextures> callbackInfoReturnable) {
      SkinTextures var2 = (SkinTextures)callbackInfoReturnable.getReturnValue();
      if (var2 != null) {
         boolean var3 = false;
         Identifier var4 = var2.texture();
         Identifier var5 = var2.capeTexture();
         Identifier var6 = var2.elytraTexture();
         Model var7 = var2.model();
         if (ProtectInfo.O0000000000O00()) {
            SkinTextures var8 = ProtectInfo.O0000000000OOO();
            var4 = var8.texture();
            var7 = var8.model();
            var3 = true;
         }

         if (!this.capeLoaded) {
            this.capeLoaded = true;
            GameProfile var10 = this.getProfile();
            Cape var9 = WildClient.O00000000.O000000000.O00000000(Cape.class);
            if (var9 != null && var9.O0000000000000) {
               Cape.O00000000(var10, identifier -> this.customCape = identifier);
            }
         }

         if (this.customCape != null) {
            var5 = this.customCape;
            var6 = this.customCape;
            var3 = true;
         }

         if (var3) {
            callbackInfoReturnable.setReturnValue(new SkinTextures(var4, var2.textureUrl(), var5, var6, var7, var2.secure()));
         }
      }
   }
}
