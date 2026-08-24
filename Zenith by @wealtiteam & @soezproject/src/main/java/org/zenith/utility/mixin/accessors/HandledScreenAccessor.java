package org.zenith.utility.mixin.accessors;

import org.zenith.module.Module;

import org.zenith.module.Interface;

import org.zenith.module.Interface;














import net.minecraft.client.gui.screen.ingame.HandledScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({HandledScreen.class})
public interface HandledScreenAccessor {
   @Accessor("x")
   int getX();

   @Accessor("y")
   int getY();
}
