package fun.wonderful.api.events.implement;

import fun.wonderful.api.events.Event;
import lombok.Generated;
import net.minecraft.entity.player.PlayerEntity;

public class EventPopTotem
extends Event {
    private final PlayerEntity player;

    @Generated
    public EventPopTotem(PlayerEntity player) {
        this.player = player;
    }

    @Generated
    public PlayerEntity getPlayer() {
        return this.player;
    }
}