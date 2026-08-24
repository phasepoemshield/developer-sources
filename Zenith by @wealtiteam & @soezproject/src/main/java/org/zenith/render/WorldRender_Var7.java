package org.zenith.render;

import java.util.List;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;

public record WorldRender_Var7(VoxelShape voxelShape2, List<WorldRender_Var159> list38, List<Box> list39) {

   public VoxelShape var14345() {
      return this.voxelShape2;
   }

   public List<WorldRender_Var159> lines() {
      return this.list38;
   }

   public List<Box> string18() {
      return this.list39;
   }
}
