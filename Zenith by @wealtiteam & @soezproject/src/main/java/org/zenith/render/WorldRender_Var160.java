package org.zenith.render;

import java.util.List;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;

public record WorldRender_Var160(VoxelShape voxelShape, List<Box> list37) {

   public VoxelShape var14345() {
      return this.voxelShape;
   }

   public List<Box> string18() {
      return this.list37;
   }
}
