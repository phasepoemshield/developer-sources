package org.wild.mixin.acceser;

import net.minecraft.class_2818;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_6606;
import net.minecraft.class_7699;
import net.minecraft.class_5455.class_6890;
import net.minecraft.class_638.class_5271;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_634.class})
public interface ClientPlayNetworkHandlerAccessor {
   @Invoker("readLightData")
   void wild$readLightData(int var1, int var2, class_6606 var3, boolean var4);

   @Invoker("scheduleRenderChunk")
   void wild$scheduleRenderChunk(class_2818 var1, int var2, int var3);

   @Accessor("combinedDynamicRegistries")
   class_6890 wild$combinedDynamicRegistries();

   @Accessor("enabledFeatures")
   class_7699 wild$enabledFeatures();

   @Mutable
   @Accessor("world")
   void wild$setWorld(class_638 var1);

   @Accessor("world")
   class_638 wild$getWorld();

   @Mutable
   @Accessor("worldProperties")
   void wild$setWorldProperties(class_5271 var1);

   @Mutable
   @Accessor("chunkLoadDistance")
   void wild$setChunkLoadDistance(int var1);

   @Accessor("chunkLoadDistance")
   int wild$getChunkLoadDistance();

   @Mutable
   @Accessor("simulationDistance")
   void wild$setSimulationDistance(int var1);

   @Accessor("simulationDistance")
   int wild$getSimulationDistance();
}
