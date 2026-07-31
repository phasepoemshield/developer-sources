/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.command.Command;
import kotakbaz.rain.event.EventManager;
import kotakbaz.rain.event.events.ChatMessageEvent;
import kotakbaz.rain.event.events.TotemPopEvent;
import kotakbaz.rain.module.modules.player.FakePlayerModule;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ClientPlayNetworkHandler.class})
public class MixinClientPlayNetworkHandler {
    @Unique
    private static final ThreadLocal<Boolean> RAIN_SKIP_MESSAGE_REWRITE = ThreadLocal.withInitial(() -> false);
    @Unique
    private static final ThreadLocal<Boolean> RAIN_SKIP_COMMAND_REWRITE = ThreadLocal.withInitial(() -> false);

    @Inject(method={"method_45729"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSendChatMessage(String content, CallbackInfo ci) {
        if (RAIN_SKIP_MESSAGE_REWRITE.get().booleanValue()) {
            RAIN_SKIP_MESSAGE_REWRITE.set(false);
            Command.INSTANCE.createCommands(content, ci);
            return;
        }
        ChatMessageEvent event = new ChatMessageEvent(content, true);
        EventManager.INSTANCE.post(event);
        if (event.getCancel()) {
            ci.cancel();
            return;
        }
        String updatedMessage = event.getText();
        if (!content.equals(updatedMessage)) {
            ci.cancel();
            RAIN_SKIP_MESSAGE_REWRITE.set(true);
            ((ClientPlayNetworkHandler)this).sendChatMessage(updatedMessage);
            return;
        }
        Command.INSTANCE.createCommands(updatedMessage, ci);
    }

    @Inject(method={"method_45730"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$onSendChatCommand(String command, CallbackInfo ci) {
        if (RAIN_SKIP_COMMAND_REWRITE.get().booleanValue()) {
            RAIN_SKIP_COMMAND_REWRITE.set(false);
            return;
        }
        String content = "/" + command;
        ChatMessageEvent event = new ChatMessageEvent(content, true);
        EventManager.INSTANCE.post(event);
        if (event.getCancel()) {
            ci.cancel();
            return;
        }
        String updatedMessage = event.getText();
        if (content.equals(updatedMessage)) {
            return;
        }
        ci.cancel();
        ClientPlayNetworkHandler self = (ClientPlayNetworkHandler)this;
        if (updatedMessage.startsWith("/")) {
            RAIN_SKIP_COMMAND_REWRITE.set(true);
            self.sendChatCommand(updatedMessage.substring(1));
            return;
        }
        RAIN_SKIP_MESSAGE_REWRITE.set(true);
        self.sendChatMessage(updatedMessage);
    }

    @Inject(method={"method_11148"}, at={@At(value="TAIL")})
    private void rain$onEntityStatus(EntityStatusS2CPacket packet, CallbackInfo ci) {
        if (packet.getStatus() != 35) {
            return;
        }
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.world == null) {
            return;
        }
        Entity entity = packet.getEntity((World)client.world);
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity)entity;
            EventManager.INSTANCE.post(new TotemPopEvent(player));
        }
    }

    @Inject(method={"method_11124"}, at={@At(value="TAIL")})
    private void rain$onExplosion(ExplosionS2CPacket packet, CallbackInfo ci) {
        FakePlayerModule.INSTANCE.handleExplosion(packet);
    }
}

