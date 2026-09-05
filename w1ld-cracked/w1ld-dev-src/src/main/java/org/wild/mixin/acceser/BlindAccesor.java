package org.wild.mixin.acceser;

import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_746.class})
public interface BlindAccesor {
   @Invoker("isBlind")
   boolean invokeIsBlind();
}
