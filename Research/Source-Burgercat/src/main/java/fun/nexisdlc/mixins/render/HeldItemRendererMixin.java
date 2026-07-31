package fun.nexisdlc.mixins.render;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.render.EventHeldItemRenderer;
import fun.nexisdlc.client.utils.player.SwingUtils;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemDisplayContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

@Mixin(HeldItemRenderer.class)
public abstract class HeldItemRendererMixin {

    @Shadow
    public abstract void renderItem(LivingEntity entity, ItemStack item, ItemDisplayContext renderMode,
                                    MatrixStack matrices, OrderedRenderCommandQueue vertexConsumers, int light);

    /**
     * Полностью заменяем ванильный renderFirstPersonItem для обычных ударов (не use actions).
     * Для специальных случаев (луки, арбалеты, еда, щит, карты, riptide) — пусть работает ванилла.
     */
    @ModifyVariable(method = "renderFirstPersonItem", at = @At("HEAD"), argsOnly = true)
    private ItemStack nexis$modifyAutoToolStack(ItemStack stack, AbstractClientPlayerEntity player, float tickDelta, float pitch, Hand hand,
                                                 float swingProgress, ItemStack original, float equipProgress, MatrixStack matrices,
                                                 OrderedRenderCommandQueue vertexConsumers, int light) {
        if (hand == Hand.MAIN_HAND) {
            var autoTool = NexisClient.getFunctionManager().getAutoTool();
            if (autoTool != null && autoTool.isState() && autoTool.invisible.get()) {
                ItemStack visual = autoTool.getVisualStack();
                if (!visual.isEmpty()) {
                    return visual;
                }
            }
        }
        return stack;
    }

    /**
     * Полностью заменяем ванильный renderFirstPersonItem для обычных ударов (не use actions).
     * Для специальных случаев (луки, арбалеты, еда, щит, карты, riptide) — пусть работает ванилла.
     */
    @Inject(method = "renderFirstPersonItem", at = @At("HEAD"), cancellable = true)
    private void nexis$onRenderFirstPersonItem(AbstractClientPlayerEntity player, float tickDelta, float pitch, Hand hand,
                                                float swingProgress, ItemStack stack, float equipProgress, MatrixStack matrices,
                                                OrderedRenderCommandQueue vertexConsumers, int light, CallbackInfo ci) {
        boolean swingEnabled = SwingUtils.isSwingAnimEnabled();
        boolean viewModelEnabled = NexisClient.getFunctionManager().getViewModel().isState();

        // Если SwingAnimations выключен — пусть работает ванилла, ViewModel применится перед ванильным swing
        if (!swingEnabled) return;

        // "Только с аурой": если нет цели — ванилла, но ViewModel всё равно работает
        if (NexisClient.getFunctionManager().getSwingAnimations().onlyAura.get()
                && !SwingUtils.hasCombatTargetForSwing()) return;

        // Специальные случаи — их обрабатывает ванилла
        if (player.isUsingSpyglass()) return;
        if (stack.isEmpty()) return;
        if (stack.contains(DataComponentTypes.MAP_ID)) return;
        if (stack.isOf(Items.CROSSBOW)) return;
        if (player.isUsingItem() && player.getItemUseTimeLeft() > 0 && player.getActiveHand() == hand) return;
        if (player.isUsingRiptide()) return;

        ci.cancel();

        boolean isMainHand = hand == Hand.MAIN_HAND;
        Arm arm = isMainHand ? player.getMainArm() : player.getMainArm().getOpposite();

        matrices.push();
        try {
            EventHeldItemRenderer event = new EventHeldItemRenderer(hand, stack, equipProgress, matrices);
            Runnable viewModelTransform = () -> {
                if (viewModelEnabled) {
                    NexisClient.getEventBus().post(event);
                }
            };

            if (swingEnabled) {
                NexisClient.getFunctionManager().getSwingAnimations()
                        .renderSwordAnimation(matrices, 0, swingProgress, equipProgress, arm, isMainHand, viewModelTransform);
            }

            boolean isRightArm = arm == Arm.RIGHT;
            ItemDisplayContext displayContext = isRightArm
                    ? ItemDisplayContext.FIRST_PERSON_RIGHT_HAND
                    : ItemDisplayContext.FIRST_PERSON_LEFT_HAND;

            renderItem(player, event.getItem(), displayContext, matrices, vertexConsumers, light);
        } finally {
            matrices.pop();
        }
    }

    @Inject(method = "swingArm", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/item/HeldItemRenderer;applySwingOffset(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/util/Arm;F)V"))
    private void nexis$onVanillaSwing(float swingProgress, MatrixStack matrices, int side, Arm arm, CallbackInfo ci) {
        if (mc.player == null || !NexisClient.getFunctionManager().getViewModel().isState()) return;

        Hand hand = arm == mc.player.getMainArm() ? Hand.MAIN_HAND : Hand.OFF_HAND;
        EventHeldItemRenderer event = new EventHeldItemRenderer(hand, ItemStack.EMPTY, 0, matrices);
        NexisClient.getEventBus().post(event);
    }

    @Inject(method = "renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/command/OrderedRenderCommandQueue;Lnet/minecraft/client/network/ClientPlayerEntity;I)V", at = @At("HEAD"))
    private void syncHandRotation(float tickDelta, MatrixStack matrices, OrderedRenderCommandQueue vertexConsumers, ClientPlayerEntity player, int light, CallbackInfo ci) {
        if (mc.player != null &&
                NexisClient.getFunctionManager().getTweaks().isState() &&
                NexisClient.getFunctionManager().getTweaks().freezeHands.get()) {
            mc.player.renderYaw = mc.player.getYaw();
            mc.player.lastRenderYaw = mc.player.getYaw();
            mc.player.renderPitch = mc.player.getPitch();
            mc.player.lastRenderPitch = mc.player.getPitch();
        }
    }
}
