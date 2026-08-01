package l;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.common.CommonPongC2SPacket;
import net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

public class NoClip extends Helper242 {
   private List<Packet<?>> packets = new CopyOnWriteArrayList<>();
   private Box box;
   private int tickCounter;

   public NoClip() {
      super("No Clip", Helper269.MOVEMENT);
   }

   private boolean method2317() {
      if (mc.player != null && mc.world != null) {
         Box var1 = mc.player.getBoundingBox();
         BlockPos var2 = new BlockPos((int)Math.floor(var1.minX), (int)Math.floor(var1.minY), (int)Math.floor(var1.minZ));
         BlockPos var3 = new BlockPos((int)Math.floor(var1.maxX), (int)Math.floor(var1.maxY), (int)Math.floor(var1.maxZ));

         for (int var4 = var2.getX(); var4 <= var3.getX(); var4++) {
            for (int var5 = var2.getY(); var5 <= var3.getY(); var5++) {
               for (int var6 = var2.getZ(); var6 <= var3.getZ(); var6++) {
                  BlockPos var7 = new BlockPos(var4, var5, var6);
                  BlockState var8 = mc.world.getBlockState(var7);
                  if (!var8.isAir()
                     && mc.world
                        .getBlockState(var7)
                        .getCollisionShape(mc.world, var7)
                        .getBoundingBoxes()
                        .stream()
                        .anyMatch(var2x -> var2x.intersects(var1.offset(-var7.getX(), -var7.getY(), -var7.getZ())))) {
                     return true;
                  }
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void method2318() {
      if (mc.player != null && mc.world != null && !this.state) {
         if (!this.packets.isEmpty()) {
            for (Packet var2 : new ArrayList<>(this.packets)) {
               mc.getNetworkHandler().sendPacket(var2);
            }

            this.packets.clear();
            this.box = mc.player.getBoundingBox();
         }
      }
   }

   @Helper104
   public void method2319(Event25 var1) {
      if (this.state) {
         BlockPos var2 = BlockPos.ofFloored(mc.player.getPos());
         if (!var1.method4139().equals(var2.down())) {
            var1.method4142(Blocks.AIR.getDefaultState());
         }
      }
   }

   private void method2320() {
      if (mc.player != null && this.state) {
         double var1 = 0.3;
         Vec3d var3 = mc.player.getVelocity();
         double var4 = Math.sqrt(var3.x * var3.x + var3.z * var3.z);
         if (var4 > 0.0) {
            double var6 = 0.6;
            double var8 = var6 * 0.3;
            double var10 = var8 / var4;
            mc.player.setVelocity(var3.x * var10, var3.y, var3.z * var10);
         }
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (this.state) {
         double var2 = mc.player.getX();
         double var4 = mc.player.getY();
         double var6 = mc.player.getZ();
         float var8 = mc.player.getYaw();
         float var9 = mc.player.getPitch();
         boolean var10 = mc.player.isOnGround();
         if (var1.method3896() == Helper385.SEND) {
            Packet var11 = var1.method3895();
            if (this.method2317() && !(var11 instanceof KeepAliveC2SPacket) && !(var11 instanceof CommonPongC2SPacket)) {
               this.packets.add(var11);
               var1.method582();
            }
         }

         if (var1.method3896() == Helper385.RECEIVE && var1.method3895() instanceof PlayerPositionLookS2CPacket) {
            this.method2318();
            Objects.requireNonNull(mc.getNetworkHandler()).sendPacket(new Full(var2 - 1000.0, var4, var6 - 1000.0, var8, var9, false, false));
            mc.getNetworkHandler().sendPacket(new Full(var2, var4, var6, var8, var9, mc.player.isOnGround(), false));
            mc.player
               .networkHandler
               .sendPacket(
                  new Full(mc.player.getX(), mc.player.getY(), mc.player.getZ(), mc.player.getYaw(), mc.player.getPitch(), mc.player.isOnGround(), false)
               );
         }
      }
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.method2318();
      this.box = null;
      this.tickCounter = 0;
   }

   public List<Packet<?>> getPackets() {
      return this.packets;
   }

   public Box getBox() {
      return this.box;
   }

   public int method2321() {
      return this.tickCounter;
   }
}
