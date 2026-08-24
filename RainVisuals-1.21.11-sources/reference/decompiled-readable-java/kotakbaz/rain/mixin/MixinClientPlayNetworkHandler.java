/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket
 *  net.minecraft.network.packet.s2c.play.ExplosionS2CPacket
 *  net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket
 *  net.minecraft.world.World
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.event.events.ChatMessageEvent;
import kotakbaz.rain.event.events.TotemPopEvent;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.ItemPickupAnimationS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0627\u0625;
import oxxxde.\u062e\u0650;
import oxxxde.\u062f\u0625;
import oxxxde.\u0631\u0638;
import oxxxde.\u0634\u0621;
import oxxxde.\u0635\u0635;
import oxxxde.\u0638\u0638;

@Mixin(value={ClientPlayNetworkHandler.class})
public class MixinClientPlayNetworkHandler {
    @Unique
    private static final ThreadLocal<Boolean> RAIN_SKIP_COMMAND_REWRITE;
    @Unique
    private static final ThreadLocal<Boolean> RAIN_SKIP_MESSAGE_REWRITE;

    @Inject(method={"method_11124"}, at={@At(value="TAIL")})
    private void rain$onExplosion(ExplosionS2CPacket packet, CallbackInfo ci) {
        \u0627\u0625.INSTANCE.handleExplosion(packet);
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
            \u0631\u0638.INSTANCE.post(new TotemPopEvent(player));
        }
    }

    @Inject(method={"method_45730"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$onSendChatCommand(String command, CallbackInfo ci) {
        if (RAIN_SKIP_COMMAND_REWRITE.get().booleanValue()) {
            RAIN_SKIP_COMMAND_REWRITE.set(false);
            return;
        }
        String content = "/" + command;
        ChatMessageEvent event = new ChatMessageEvent(content, true);
        \u0631\u0638.INSTANCE.post(event);
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

    @Inject(method={"method_11157"}, at={@At(value="HEAD")})
    private void rain$unloadInventoryOnTeleport(PlayerPositionLookS2CPacket packet, CallbackInfo ci) {
        if (!MinecraftClient.getInstance().isOnThread()) {
            return;
        }
        \u0635\u0635.INSTANCE.closeCustomScreenImmediately();
        \u0638\u0638.INSTANCE.unload();
    }

    private static /* synthetic */ void lambda$onSendChatMessage$2(ClientPlayNetworkHandler self, String translatedMessage) {
        if (MinecraftClient.getInstance().getNetworkHandler() != self) {
            return;
        }
        RAIN_SKIP_MESSAGE_REWRITE.set(true);
        self.sendChatMessage(translatedMessage);
    }

    @Inject(method={"method_11150"}, at={@At(value="HEAD")})
    private void rain$logPickedUpItem(ItemPickupAnimationS2CPacket packet, CallbackInfo ci) {
        \u062e\u0650.INSTANCE.handlePickup(packet);
    }

    @Inject(method={"method_45729"}, at={@At(value="HEAD")}, cancellable=true)
    private void onSendChatMessage(String content, CallbackInfo ci) {
        ClientPlayNetworkHandler self;
        if (RAIN_SKIP_MESSAGE_REWRITE.get().booleanValue()) {
            RAIN_SKIP_MESSAGE_REWRITE.set(false);
            \u062f\u0625.INSTANCE.createCommands(content, ci);
            return;
        }
        ChatMessageEvent event = new ChatMessageEvent(content, true);
        \u0631\u0638.INSTANCE.post(event);
        if (event.getCancel()) {
            ci.cancel();
            return;
        }
        String updatedMessage = event.getText();
        if (\u0634\u0621.INSTANCE.interceptOutgoingMessage(updatedMessage, arg_0 -> MixinClientPlayNetworkHandler.lambda$onSendChatMessage$2(self = (ClientPlayNetworkHandler)this, arg_0))) {
            ci.cancel();
            return;
        }
        if (!content.equals(updatedMessage)) {
            ci.cancel();
            RAIN_SKIP_MESSAGE_REWRITE.set(true);
            self.sendChatMessage(updatedMessage);
            return;
        }
        \u062f\u0625.INSTANCE.createCommands(updatedMessage, ci);
    }

    static {
        RAIN_SKIP_MESSAGE_REWRITE = ThreadLocal.withInitial(() -> false);
        RAIN_SKIP_COMMAND_REWRITE = ThreadLocal.withInitial(() -> false);
    }

    @Inject(method={"method_11117"}, at={@At(value="HEAD")})
    private void rain$unloadInventoryOnWorldChange(PlayerRespawnS2CPacket packet, CallbackInfo ci) {
        if (!MinecraftClient.getInstance().isOnThread()) {
            return;
        }
        \u0635\u0635.INSTANCE.closeCustomScreenImmediately();
        \u0638\u0638.INSTANCE.unload();
    }
}

