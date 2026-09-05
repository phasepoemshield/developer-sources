/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_11908
 *  net.minecraft.class_11909
 *  net.minecraft.class_2558
 *  net.minecraft.class_2558$class_10609
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_332
 *  net.minecraft.class_408
 *  net.minecraft.class_437
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_332;
import net.minecraft.class_408;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.as;
import ruhack.phobia.av;
import ruhack.phobia.d;
import ruhack.phobia.g;
import ruhack.phobia.jr;
import ruhack.phobia.ki;
import ruhack.phobia.mf;
import ruhack.phobia.oq;

@Mixin(value={class_408.class})
public abstract class i
extends class_437 {
    protected i(class_2561 title) {
        super(title);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Inject(method={"method_25394"}, at={@At(value="TAIL")})
    private void onRender(class_332 context, int mouseX, int mouseY, float deltaTicks, CallbackInfo ci2) {
        try {
            as.onDraw(context, mouseX, mouseY, deltaTicks, true);
            mf.render(context, mouseX, mouseY);
            ki.renderOverrides(context);
        }
        finally {
            ki.endBlurFrameForced();
            oq.reset();
        }
    }

    @Inject(method={"method_75825"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$handleClientCommandClick(class_2583 style, boolean insert, CallbackInfoReturnable<Boolean> cir) {
        class_2558 class_25582;
        if (style == null || !((class_25582 = style.method_10970()) instanceof class_2558.class_10609)) {
            return;
        }
        class_2558.class_10609 runCommand = (class_2558.class_10609)class_25582;
        g manager = g.getInstance();
        if (manager == null) {
            return;
        }
        String command = runCommand.comp_3506();
        String prefix = manager.getPrefix();
        if (command == null || prefix == null || prefix.isEmpty() || !command.startsWith(prefix)) {
            return;
        }
        String clientCommand = command.substring(prefix.length()).trim();
        if (clientCommand.isEmpty()) {
            return;
        }
        String commandName = clientCommand.split("\\s+", 2)[0];
        if (manager.getCommand(commandName) == null) {
            return;
        }
        manager.execute(clientCommand);
        cir.setReturnValue((Object)true);
    }

    @Inject(method={"method_25402"}, at={@At(value="HEAD")}, cancellable=true)
    private void onMouseClicked(class_11909 click, boolean doubled, CallbackInfoReturnable<Boolean> cir) {
        int button;
        int mouseY;
        int mouseX = (int)click.comp_4798();
        if (mf.mouseClicked(mouseX, mouseY = (int)click.comp_4799(), button = click.method_74245())) {
            cir.setReturnValue((Object)true);
            return;
        }
        av hudManager = this.hudManager();
        if (hudManager != null && hudManager.mouseClicked(mouseX, mouseY, button)) {
            cir.setReturnValue((Object)true);
            return;
        }
        if (button == 1 && !mf.isOpen() && this.isEmptyChatSpace(hudManager, mouseX, mouseY)) {
            mf.open(mouseX, mouseY);
            cir.setReturnValue((Object)true);
            return;
        }
        as.onMouseClick(click);
        if (as.isDragging()) {
            cir.setReturnValue((Object)true);
        }
    }

    @Inject(method={"method_25404"}, at={@At(value="HEAD")}, cancellable=true)
    private void onKeyPressed(class_11908 input, CallbackInfoReturnable<Boolean> cir) {
        if (mf.keyPressed(input.comp_4795())) {
            cir.setReturnValue((Object)true);
        }
    }

    private boolean isEmptyChatSpace(av hudManager, int mouseX, int mouseY) {
        jr tags = jr.getInstance();
        if (tags != null && tags.hasPendingMenu()) {
            return false;
        }
        return hudManager == null || hudManager.getElementAt(mouseX, mouseY) == null;
    }

    private av hudManager() {
        if (d.getInstance() == null || d.getInstance().getManager() == null) {
            return null;
        }
        return d.getInstance().getManager().getHudManager();
    }

    @Inject(method={"method_25401"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$hudEditorScroll(double mouseX, double mouseY, double horizontalAmount, double verticalAmount, CallbackInfoReturnable<Boolean> cir) {
        if (mf.mouseScrolled(mouseX, mouseY, verticalAmount)) {
            cir.setReturnValue((Object)true);
        }
    }

    public boolean method_25406(class_11909 click) {
        mf.mouseReleased(click.method_74245());
        as.onMouseRelease(click);
        return super.method_25406(click);
    }

    public boolean method_25403(class_11909 click, double deltaX, double deltaY) {
        if (mf.mouseDragged(click.comp_4798(), click.comp_4799(), click.method_74245())) {
            return true;
        }
        return super.method_25403(click, deltaX, deltaY);
    }

    @Inject(method={"method_25432"}, at={@At(value="HEAD")})
    private void onRemoved(CallbackInfo ci2) {
        as.resetDragging();
        mf.hide();
    }

    @Inject(method={"method_25419"}, at={@At(value="HEAD")})
    private void onClose(CallbackInfo ci2) {
        as.resetDragging();
        mf.hide();
    }
}

