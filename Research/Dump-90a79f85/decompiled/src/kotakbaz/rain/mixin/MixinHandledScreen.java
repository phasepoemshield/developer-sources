/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1703
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_3675
 *  net.minecraft.class_3936
 *  net.minecraft.class_437
 *  net.minecraft.class_465
 *  org.lwjgl.glfw.GLFW
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.player.q_0;
import kotakbaz.rain.module.modules.render.x_0;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3675;
import net.minecraft.class_3936;
import net.minecraft.class_437;
import net.minecraft.class_465;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_465.class})
public abstract class MixinHandledScreen<T extends class_1703>
extends class_437
implements class_3936<T> {
    @Unique
    private long lastQuickMoveAt;

    protected MixinHandledScreen(class_2561 title) {
        super(title);
    }

    @Shadow
    protected abstract boolean method_2387(class_1735 var1, double var2, double var4);

    @Shadow
    protected abstract void method_2383(class_1735 var1, int var2, int var3, class_1713 var4);

    @Inject(method={"method_2385"}, at={@At(value="HEAD")})
    private void rain$renderItemHighliterBackground(class_332 context, class_1735 slot, CallbackInfo ci) {
        x_0.INSTANCE.renderHighlight(context, slot.method_7677(), slot.field_7873, slot.field_7872);
    }

    @Inject(method={"method_25394"}, at={@At(value="HEAD")})
    private void rain$handleItemScroller(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        class_310 client = class_310.method_1551();
        if (client.field_1724 == null || client.field_1687 == null) {
            return;
        }
        if (!q_0.INSTANCE.isEnabled()) {
            return;
        }
        if (!this.rain$isShiftDown(client) || !this.rain$isHoldingLeftMouse(client)) {
            return;
        }
        if (!this.rain$isDelayComplete()) {
            return;
        }
        for (class_1735 slot : client.field_1724.field_7512.field_7761) {
            if (slot == null || !slot.method_7682() || slot.method_7677().method_7960() || !this.method_2387(slot, mouseX, mouseY)) continue;
            this.method_2383(slot, slot.field_7874, 0, class_1713.field_7794);
            this.lastQuickMoveAt = System.currentTimeMillis();
            break;
        }
    }

    @Unique
    private boolean rain$isShiftDown(class_310 client) {
        long handle = client.method_22683().method_4490();
        return class_3675.method_15987((long)handle, (int)340) || class_3675.method_15987((long)handle, (int)344);
    }

    @Unique
    private boolean rain$isHoldingLeftMouse(class_310 client) {
        return GLFW.glfwGetMouseButton((long)client.method_22683().method_4490(), (int)0) == 1;
    }

    @Unique
    private boolean rain$isDelayComplete() {
        return System.currentTimeMillis() - this.lastQuickMoveAt >= q_0.INSTANCE.delayMs();
    }
}

