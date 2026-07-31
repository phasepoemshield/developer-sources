package fun.nexisdlc.mixins.render;

import fun.nexisdlc.modules.impl.render.ItemReplacer;
import net.minecraft.client.item.ItemModelManager;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.item.ItemDisplayContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.HeldItemContext;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemModelManager.class)
public abstract class ItemReplacerItemModelManagerMixin {
    private static final ThreadLocal<HeldItemContext> NEXIS_HELD_ITEM_CONTEXT = new ThreadLocal<>();

    @Inject(
            method = "update(Lnet/minecraft/client/render/item/ItemRenderState;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/world/World;Lnet/minecraft/util/HeldItemContext;I)V",
            at = @At("HEAD")
    )
    private void nexis$captureHeldItemContext(ItemRenderState state, ItemStack stack, ItemDisplayContext displayContext,
                                              World world, HeldItemContext heldItemContext, int seed, CallbackInfo ci) {
        NEXIS_HELD_ITEM_CONTEXT.set(heldItemContext);
    }

    @ModifyVariable(
            method = "update(Lnet/minecraft/client/render/item/ItemRenderState;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/world/World;Lnet/minecraft/util/HeldItemContext;I)V",
            at = @At("HEAD"),
            argsOnly = true,
            ordinal = 0
    )
    private ItemStack nexis$replaceSwordModel(ItemStack stack) {
        HeldItemContext heldItemContext = NEXIS_HELD_ITEM_CONTEXT.get();
        return ItemReplacer.getRenderStack(stack, heldItemContext == null ? null : heldItemContext.getEntity());
    }

    @Inject(
            method = "update(Lnet/minecraft/client/render/item/ItemRenderState;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemDisplayContext;Lnet/minecraft/world/World;Lnet/minecraft/util/HeldItemContext;I)V",
            at = @At("RETURN")
    )
    private void nexis$clearHeldItemContext(ItemRenderState state, ItemStack stack, ItemDisplayContext displayContext,
                                            World world, HeldItemContext heldItemContext, int seed, CallbackInfo ci) {
        NEXIS_HELD_ITEM_CONTEXT.remove();
    }
}
