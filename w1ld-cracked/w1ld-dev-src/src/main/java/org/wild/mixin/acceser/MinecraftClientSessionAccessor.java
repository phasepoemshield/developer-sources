package org.wild.mixin.acceser;

import com.mojang.authlib.yggdrasil.ProfileResult;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_310;
import net.minecraft.class_320;
import net.minecraft.class_7853;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_310.class})
public interface MinecraftClientSessionAccessor {
   @Accessor("session")
   class_320 litka$getSession();

   @Mutable
   @Accessor("session")
   void litka$setSession(class_320 var1);

   @Accessor("profileKeys")
   class_7853 litka$getProfileKeys();

   @Mutable
   @Accessor("profileKeys")
   void litka$setProfileKeys(class_7853 var1);

   @Accessor("gameProfileFuture")
   CompletableFuture<ProfileResult> litka$getGameProfileFuture();

   @Mutable
   @Accessor("gameProfileFuture")
   void litka$setGameProfileFuture(CompletableFuture<ProfileResult> var1);
}
