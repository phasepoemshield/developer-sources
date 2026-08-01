package fat.releon.mixins.player.entity;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import l.Helper124;
import l.Helper160;
import l.Helper380;
import l.Helper403;
import l.Event23;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.ChunkDataS2CPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.UnloadChunkS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.chunk.WorldChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ClientPlayNetworkHandler.class})
public class ClientPlayNetworkHandlerMixin implements Helper160 {
   public ClientPlayNetworkHandlerMixin() {
   }

   @Inject(
      method = {"onChunkData"},
      at = {@At("RETURN")}
   )
   private void onChunkDataHook(ChunkDataS2CPacket var1, CallbackInfo var2) {
      this.scanChunk(mc.world.getChunk(var1.getChunkX(), var1.getChunkZ()), Helper403.LOAD);
   }

   @Inject(
      method = {"onUnloadChunk"},
      at = {@At("HEAD")}
   )
   private void onUnloadChunkHook(UnloadChunkS2CPacket var1, CallbackInfo var2) {
      this.scanChunk(mc.world.getChunk(var1.pos().x, var1.pos().z), Helper403.UNLOAD);
   }

   @Inject(
      method = {"sendChatMessage(Ljava/lang/String;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sendChatMessage(String var1, CallbackInfo var2) {
      Helper380 var3 = new Helper380(var1);
      Helper124.method1026(var3);
      if (var3.method581()) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"onGameMessage"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onGameMessage(GameMessageS2CPacket var1, CallbackInfo var2) {
      String var3 = var1.content().getString();
      Helper380 var4 = new Helper380(var3);
      Helper124.method1026(var4);
      if (var4.method581()) {
         var2.cancel();
      }
   }

   @Unique
   private void scanChunk(WorldChunk var1, Helper403 var2) {
      int var3 = var1.getPos().getStartX();
      int var4 = var1.getPos().getStartZ();
      ArrayList<java.util.concurrent.CompletableFuture<?>> var5 = new ArrayList<>();

      for (int var6 = 0; var6 <= var1.getHighestNonEmptySection(); var6++) {
         int var7 = var6;
         var5.add(CompletableFuture.runAsync(() -> {
            ChunkSection var5x = var1.getSection(var7);

            for (int var6x = 0; var6x < 16; var6x++) {
               int var7x = var7 + (var1.getBottomY() >> 4) << 4 | var6x;

               for (int var8 = 0; var8 < 16; var8++) {
                  for (int var9 = 0; var9 < 16; var9++) {
                     BlockState var10 = var2.equals(Helper403.LOAD) ? var5x.getBlockState(var8, var6x, var9) : Blocks.AIR.getDefaultState();
                     BlockPos var11 = new BlockPos(var3 | var8, var7x, var4 | var9);
                     Helper124.method1026(new Event23(var10, var11, var2));
                  }
               }
            }
         }));
      }

      CompletableFuture.allOf(var5.toArray(new CompletableFuture[0])).join();
   }
}
