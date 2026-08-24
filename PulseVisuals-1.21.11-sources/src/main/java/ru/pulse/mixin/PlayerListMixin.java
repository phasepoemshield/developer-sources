package ru.pulse.mixin;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.Action;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.Entry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulse.events.EventBusService;
import pulse.events.PlayerJoinEvent;
import pulse.events.PlayerLeaveEvent;

@Mixin(ClientPlayNetworkHandler.class)
public class PlayerListMixin {
    @Unique
    private static final ConcurrentHashMap<UUID, String> uuidToNameCache = new ConcurrentHashMap<>();

    @Inject(require = 0, method = "onPlayerList", at = @At("HEAD"))
    private void onPlayerListUpdate(PlayerListS2CPacket PlayerListS2CPacketVar, CallbackInfo callbackInfo) {
        for (Entry entry : PlayerListS2CPacketVar.getEntries()) {
            UUID uuidProfileId = entry.profileId();
            if (PlayerListS2CPacketVar.getActions().contains(Action.ADD_PLAYER)
                && entry.profile() != null
                && entry.profile().name() != null) {
                String name = entry.profile().name();
                if (!uuidToNameCache.containsKey(uuidProfileId)) {
                    uuidToNameCache.put(uuidProfileId, name);
                    EventBusService.EVENT_BUS.post(new PlayerJoinEvent(name, uuidProfileId));
                }
            }

            if (PlayerListS2CPacketVar.getActions().contains(Action.UPDATE_LISTED) && !entry.listed()) {
                String str = uuidToNameCache.get(uuidProfileId);
                if (str != null) {
                    EventBusService.EVENT_BUS.post(new PlayerLeaveEvent(str, uuidProfileId));
                    uuidToNameCache.remove(uuidProfileId);
                } else {
                    EventBusService.EVENT_BUS.post(new PlayerLeaveEvent("", uuidProfileId));
                }
            }
        }
    }

    @Inject(require = 0, method = "onGameJoin", at = @At("HEAD"))
    private void onGameJoin(GameJoinS2CPacket GameJoinS2CPacketVar, CallbackInfo callbackInfo) {
    }
}
