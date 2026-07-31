package zenith.zov.utility.mixin.accessors;

import net.minecraft.item.ItemStack;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.VertexConsumerProvider.ControlsListWidget8;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({DrawContext.class})
public interface DrawContextAccessor {
   @Accessor("vertexConsumers")
   ControlsListWidget8 getVertexConsumers();

   @Invoker("drawItemBar")
   void callDrawItemBar(ItemStack ItemStack, int i, int j);

   @Invoker("drawCooldownProgress")
   void callDrawCooldownProgress(ItemStack ItemStack, int i, int j);
}
