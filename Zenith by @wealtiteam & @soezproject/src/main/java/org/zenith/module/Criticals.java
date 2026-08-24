package org.zenith.module;

import org.zenith.core.SimpleItemBuilder;
import org.zenith.core.CloudRouter;
import org.zenith.core.LineShader;
import org.zenith.rotation.Rotation;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.util.MathUtils;
import org.zenith.module.Module;
import org.zenith.core.ItemRegistry;
import org.zenith.ZenithClient;
import org.zenith.rotation.RotationDelta;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EffectEngine;

import org.zenith.event.PacketEvent;




import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;

@ModuleInfo(
   name = "Criticals",
   category = Category.COMBAT,
   description = ""
)
public final class Criticals extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final Criticals criticals = new Criticals();

   public Criticals() {
   }

   @EventTarget
   public void ItemRegistry(PacketEvent var1) {
      if (minecraftClient3.player != null
         && !minecraftClient3.player.isOnGround()
         && minecraftClient3.player.fallDistance == 0.0F
         && var1.ItemScroller() instanceof PlayerInteractEntityC2SPacket playerinteractentityc2spacket
         && playerinteractentityc2spacket.isPlayerSneaking()) {
         EffectEngine.on23(
            (double)(-(minecraftClient3.player.fallDistance = (float)MathUtils.SimpleItemBuilder(1.0E-5F, 1.0E-4F))),
            ZenithClient.on23()
               .CloudRouter()
               .LineShader()
               .on23(
                  new RotationDelta(
                     (float)MathUtils.SimpleItemBuilder(-0.001F, 0.001F), (float)MathUtils.SimpleItemBuilder(-0.001F, 0.001F)
                  )
               )
         );
      }
   }

   public boolean call125() {
      return !minecraftClient3.player.isOnGround();
   }
}
