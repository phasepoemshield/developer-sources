package org.zenith.module;

import org.zenith.core.CloudRouter;
import org.zenith.core.LineShader;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.NbtItemSpec;
import org.zenith.util.RaycastUtils;
import org.zenith.rotation.Rotation;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventGetBasicProjectionMatrixHook2;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.block.BlockState;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;

@ModuleInfo(
   name = "OpenWals",
   category = Category.MISC,
   description = ""
)
public final class OpenWals extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final OpenWals openWals = new OpenWals();

   public OpenWals() {
   }

   @EventTarget
   public void on23(EventGetBasicProjectionMatrixHook2 var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         Rotation ililiiili1ll1li11 = ZenithClient.on23().CloudRouter().LineShader();
         BlockHitResult blockhitresult = RaycastUtils.on23(
            minecraftClient3.player.getCameraPosVec(1.0F),
            ililiiili1ll1li11,
            minecraftClient3.player.getBlockInteractionRange(),
            this::NbtItemSpec
         );
         if (blockhitresult != null && blockhitresult.getType() == Type.BLOCK) {
            minecraftClient3.crosshairTarget = blockhitresult;
         }
      }
   }

   public boolean NbtItemSpec(BlockHitResult var1) {
      if (var1 != null && var1.getType() == Type.BLOCK) {
         BlockState blockstate = minecraftClient3.world.getBlockState(var1.getBlockPos());
         if (blockstate.getBlock() instanceof EnderChestBlock) {
            return true;
         } else {
            BlockEntity blockentity = minecraftClient3.world.getBlockEntity(var1.getBlockPos());
            return blockentity instanceof Inventory && blockstate.createScreenHandlerFactory(minecraftClient3.world, var1.getBlockPos()) != null;
         }
      } else {
         return false;
      }
   }
}
