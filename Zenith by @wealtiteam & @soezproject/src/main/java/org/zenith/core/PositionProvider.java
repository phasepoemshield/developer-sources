package org.zenith.core;

import org.zenith.module.Module;

import org.zenith.util.ArgbColor;

import org.zenith.module.Interface;
import org.zenith.module.WallBypass;

import org.zenith.event.EventPushOutOfBlocks;


import net.minecraft.util.math.Vec3d;

public interface PositionProvider {
   Vec3d WallBypass();

   Vec3d getModeSetting3();

   float getSize();

   float var11927();

   default float EventPushOutOfBlocks(float var1) {
      return this.var11927();
   }

   ArgbColor getColor();

   String var111();

   float getRotation();

   boolean float304();
}
