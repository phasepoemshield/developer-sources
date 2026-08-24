package org.zenith.managers;

import org.zenith.event.EventInteractBlock;

import org.zenith.config.ProtocolMessage;
import org.zenith.core.MotionSampleStore;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.CloudRouter;
import org.zenith.core.ImageEncoder;

import org.zenith.event.EventInjectHandleInputEvents;
import org.zenith.event.EventTriggerKeyEvent;

import java.util.List;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public final class Pathfinder_Var7 {
   public final List<BlockPos> list54;
   public int int177;

   public Pathfinder_Var7(List<BlockPos> var1) {
      this.list54 = List.copyOf(var1);
      this.int177 = Math.min(1, var1.size());
   }

   public List<BlockPos> var04() {
      return this.list54;
   }

   public BlockPos random11() {
      return this.list54.getLast();
   }

   public boolean ImageEncoder() {
      return this.int177 >= this.list54.size();
   }

   public BlockPos EventTriggerKeyEvent(BlockPos var1) {
      for (int i = this.int177; i < this.list54.size(); i++) {
         if (this.list54.get(i).equals(var1)) {
            this.int177 = i + 1;
            break;
         }
      }

      return this.ImageEncoder() ? null : this.list54.get(this.int177);
   }

   public BlockPos CloudRouter(Vec3d var1) {
      while (!this.ImageEncoder()) {
         BlockPos blockpos = this.list54.get(this.int177);
         double d0 = var1.x - ((double)blockpos.getX() + 0.5);
         double d1 = var1.z - ((double)blockpos.getZ() + 0.5);
         if (!(d0 * d0 + d1 * d1 > 0.2025) && !(Math.abs(var1.y - (double)blockpos.getY()) > 0.75)) {
            this.int177++;
            continue;
         }
         break;
      }

      return this.ImageEncoder() ? null : this.list54.get(this.int177);
   }

   public Vec3d EventInjectHandleInputEvents(BlockPos var1) {
      BlockPos blockpos = this.EventTriggerKeyEvent(var1);
      return blockpos == null ? null : Pathfinder.EventInteractBlock(blockpos);
   }

   public Vec3d ProtocolMessage(Vec3d var1) {
      BlockPos blockpos = this.CloudRouter(var1);
      return blockpos == null ? null : Pathfinder.EventInteractBlock(blockpos);
   }

   public void reset() {
      this.int177 = Math.min(1, this.list54.size());
   }
}
