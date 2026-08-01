package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderPass;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.client.render.RenderLayer.MultiPhase;

public interface O0000O0O00OOO0 {
   MultiPhase withRenderPassSetup(Consumer<RenderPass> consumer);

   static O0000O0O00OOO0 O00000000(MultiPhase multiPhase) {
      Objects.requireNonNull(multiPhase, "multiPhase");
      return (O0000O0O00OOO0)(Object)multiPhase;
   }
}
