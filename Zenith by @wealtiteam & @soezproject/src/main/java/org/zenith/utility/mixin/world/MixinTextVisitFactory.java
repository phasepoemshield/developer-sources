package org.zenith.utility.mixin.world;

import org.zenith.core.ItemStackStore;
import org.zenith.module.Module;

import org.zenith.module.NameProtect;

import org.zenith.module.NameProtect;
import org.zenith.core.NpcCloneManager;














import net.minecraft.text.TextVisitFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({TextVisitFactory.class})
public class MixinTextVisitFactory {
   public MixinTextVisitFactory() {
   }

   @ModifyArg(
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/text/TextVisitFactory;visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z",
         ordinal = 0
      ),
      method = {"visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z"},
      index = 0
   )
   private static String adjustText(String var0) {
      return protect(var0);
   }

   @Unique
   private static String protect(String var0) {
      return NameProtect.ItemStackStore(var0);
   }
}
