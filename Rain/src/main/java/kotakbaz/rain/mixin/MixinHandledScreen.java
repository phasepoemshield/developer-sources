/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.player.ItemScrollerModule;
import kotakbaz.rain.module.modules.render.ItemHighliterModule;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider;
import net.minecraft.client.util.InputUtil;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={HandledScreen.class})
public abstract class MixinHandledScreen<T extends ScreenHandler>
extends Screen
implements ScreenHandlerProvider<T> {
    @Unique
    private long lastQuickMoveAt;

    protected MixinHandledScreen(Text title) {
        super(title);
    }

    @Shadow
    protected abstract boolean method_2387(Slot var1, double var2, double var4);

    @Shadow
    protected abstract void method_2383(Slot var1, int var2, int var3, SlotActionType var4);

    @Inject(method={"method_2385"}, at={@At(value="HEAD")})
    private void rain$renderItemHighliterBackground(DrawContext context, Slot slot, CallbackInfo ci) {
        ItemHighliterModule.INSTANCE.renderHighlight(context, slot.getStack(), slot.x, slot.y);
    }

    @Inject(method={"method_25394"}, at={@At(value="HEAD")})
    private void rain$handleItemScroller(DrawContext context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null || client.world == null) {
            return;
        }
        if (!ItemScrollerModule.INSTANCE.isEnabled()) {
            return;
        }
        if (!this.rain$isShiftDown(client) || !this.rain$isHoldingLeftMouse(client)) {
            return;
        }
        if (!this.rain$isDelayComplete()) {
            return;
        }
        for (Slot slot : client.player.currentScreenHandler.slots) {
            if (slot == null || !slot.isEnabled() || slot.getStack().isEmpty() || !this.method_2387(slot, mouseX, mouseY)) continue;
            this.method_2383(slot, slot.id, 0, SlotActionType.QUICK_MOVE);
            this.lastQuickMoveAt = System.currentTimeMillis();
            break;
        }
    }

    @Unique
    private boolean rain$isShiftDown(MinecraftClient client) {
        long handle = client.getWindow().getHandle();
        return InputUtil.isKeyPressed((long)handle, (int)340) || InputUtil.isKeyPressed((long)handle, (int)344);
    }

    @Unique
    private boolean rain$isHoldingLeftMouse(MinecraftClient client) {
        return GLFW.glfwGetMouseButton((long)client.getWindow().getHandle(), (int)0) == 1;
    }

    @Unique
    private boolean rain$isDelayComplete() {
        return System.currentTimeMillis() - this.lastQuickMoveAt >= ItemScrollerModule.INSTANCE.delayMs();
    }
}

