/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1937
 *  net.minecraft.class_2663
 *  net.minecraft.class_2664
 *  net.minecraft.class_310
 *  net.minecraft.class_634
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.a;
import kotakbaz.rain.event.events.A;
import kotakbaz.rain.event.events.b_0;
import kotakbaz.rain.module.modules.player.e_0;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_2663;
import net.minecraft.class_2664;
import net.minecraft.class_310;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_634.class})
public class MixinClientPlayNetworkHandler {
    @Unique
    private static final ThreadLocal<Boolean> RAIN_SKIP_MESSAGE_REWRITE = ThreadLocal.withInitial(() -> false);
    @Unique
    private static final ThreadLocal<Boolean> RAIN_SKIP_COMMAND_REWRITE = ThreadLocal.withInitial(() -> false);

    public MixinClientPlayNetworkHandler() {
        super();
    }

    @Inject(method={"method_45729"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSendChatMessage(String content, CallbackInfo ci) {
        if (RAIN_SKIP_MESSAGE_REWRITE.get().booleanValue()) {
            RAIN_SKIP_MESSAGE_REWRITE.set(false);
            kotakbaz.rain.command.A.INSTANCE.createCommands(content, ci);
            return;
        }
        A event = new A(content, true);
        a.INSTANCE.post(event);
        if (event.getCancel()) {
            ci.cancel();
            return;
        }
        String updatedMessage = event.getText();
        if (!content.equals(updatedMessage)) {
            ci.cancel();
            RAIN_SKIP_MESSAGE_REWRITE.set(true);
            ((class_634)this).method_45729(updatedMessage);
            return;
        }
        kotakbaz.rain.command.A.INSTANCE.createCommands(updatedMessage, ci);
    }

    @Inject(method={"method_45730"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$onSendChatCommand(String command, CallbackInfo ci) {
        if (RAIN_SKIP_COMMAND_REWRITE.get().booleanValue()) {
            RAIN_SKIP_COMMAND_REWRITE.set(false);
            return;
        }
        String content = "/" + command;
        A event = new A(content, true);
        a.INSTANCE.post(event);
        if (event.getCancel()) {
            ci.cancel();
            return;
        }
        String updatedMessage = event.getText();
        if (content.equals(updatedMessage)) {
            return;
        }
        ci.cancel();
        class_634 self = (class_634)this;
        if (updatedMessage.startsWith("/")) {
            RAIN_SKIP_COMMAND_REWRITE.set(true);
            self.method_45730(updatedMessage.substring(1));
            return;
        }
        RAIN_SKIP_MESSAGE_REWRITE.set(true);
        self.method_45729(updatedMessage);
    }

    @Inject(method={"method_11148"}, at={@At(value="TAIL")})
    private void rain$onEntityStatus(class_2663 packet, CallbackInfo ci) {
        if (packet.method_11470() != 35) {
            return;
        }
        class_310 client = class_310.method_1551();
        if (client.field_1687 == null) {
            return;
        }
        class_1297 entity = packet.method_11469((class_1937)client.field_1687);
        if (entity instanceof class_1657) {
            class_1657 player = (class_1657)entity;
            a.INSTANCE.post(new b_0(player));
        }
    }

    @Inject(method={"method_11124"}, at={@At(value="TAIL")})
    private void rain$onExplosion(class_2664 packet, CallbackInfo ci) {
        e_0.INSTANCE.handleExplosion(packet);
    }
}

