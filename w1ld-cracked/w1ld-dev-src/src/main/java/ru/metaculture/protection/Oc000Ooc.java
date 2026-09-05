package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderPass;
import java.util.Objects;
import java.util.function.Consumer;
import net.minecraft.class_1921.class_4687;

public interface Oc000Ooc {
   class_4687 withRenderPassSetup(Consumer<RenderPass> var1);

   static Oc000Ooc UuUVuuUu(class_4687 var0) {
      Objects.requireNonNull(var0, "multiPhase");
      return (Oc000Ooc)var0;
   }
}
