package org.wild.mixin.acceser;

import com.mojang.authlib.GameProfile;
import net.minecraft.class_7699;
import net.minecraft.class_8674;
import net.minecraft.class_9173;
import net.minecraft.class_9247;
import net.minecraft.class_338.class_9477;
import net.minecraft.class_5455.class_6890;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_8674.class})
public interface ClientConfigurationNetworkHandlerAccessor {
   @Accessor("profile")
   GameProfile wild$profile();

   @Accessor("enabledFeatures")
   class_7699 wild$enabledFeatures();

   @Accessor("registryManager")
   class_6890 wild$registryManager();

   @Accessor("clientRegistries")
   class_9173 wild$clientRegistries();

   @Accessor("dataPackManager")
   class_9247 wild$dataPackManager();

   @Accessor("chatState")
   class_9477 wild$chatState();
}
