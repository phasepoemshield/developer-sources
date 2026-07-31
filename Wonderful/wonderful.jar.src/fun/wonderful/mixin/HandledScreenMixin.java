package fun.wonderful.mixin;

import fun.wonderful.client.modules.impl.combat.AutoSwap;
import fun.wonderful.client.modules.impl.player.CatchItems;
import fun.wonderful.client.modules.impl.player.ItemScroller;
import java.util.List;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={HandledScreen.class})
public abstract class HandledScreenMixin {
    @Shadow
    @Final
    protected ScreenHandler handler;
    @Shadow
    protected int x;
    @Shadow
    protected int y;
    @Shadow
    protected int backgroundWidth;

    @Shadow
    @Nullable
    protected abstract Slot getSlotAt(double var1, double var3);

    @Shadow
    protected abstract void onMouseClick(@Nullable Slot var1, int var2, int var3, SlotActionType var4);

    @Inject(method={"onMouseClick"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$onMouseClick(@Nullable Slot slot, int slotId, int button, SlotActionType actionType, CallbackInfo ci) {
        if (CatchItems.INSTANCE.handleInventoryThrow(slot, actionType)) {
            ci.cancel();
        }
    }

    @Inject(method={"mouseClicked"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$mouseClicked(double mouseX, double mouseY, int button, CallbackInfoReturnable<Boolean> cir) {
        if (button == 0 && AutoSwap.INSTANCE.handleWheelInventoryPick(this.getSlotAt(mouseX, mouseY), SlotActionType.PICKUP)) {
            cir.setReturnValue((Object)true);
        }
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void onRender(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        boolean shiftPressed;
        MinecraftClient mc = MinecraftClient.getInstance();
        ItemScroller itemScroller = ItemScroller.INSTANCE;
        if (!itemScroller.isEnable() || mc.player == null || mc.interactionManager == null) {
            return;
        }
        long window = mc.getWindow().getHandle();
        boolean leftMousePressed = GLFW.glfwGetMouseButton((long)window, (int)0) == 1;
        boolean bl = shiftPressed = GLFW.glfwGetKey((long)window, (int)340) == 1 || GLFW.glfwGetKey((long)window, (int)344) == 1;
        if (!leftMousePressed || !shiftPressed) {
            itemScroller.resetTimer();
            return;
        }
        Slot slot = this.getSlotAt(mouseX, mouseY);
        if (slot == null || !slot.hasStack()) {
            return;
        }
        if (!itemScroller.canQuickMove()) {
            return;
        }
        this.onMouseClick(slot, slot.id, 0, SlotActionType.QUICK_MOVE);
    }

    @Inject(method={"render"}, at={@At(value="TAIL")})
    private void wonderful$renderCatchItemsLock(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        CatchItems.INSTANCE.renderInventoryLocks(context, this.x, this.y, this.backgroundWidth, (List<Slot>)this.handler.slots);
    }
}