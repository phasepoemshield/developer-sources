package fun.wonderful.api.events.implement;

import fun.wonderful.api.events.Event;
import lombok.Generated;
import net.minecraft.network.packet.Packet;

public class EventPacket
extends Event {
    private Packet<?> packet;
    private final Type type;

    @Generated
    public EventPacket(Packet<?> packet, Type type) {
        this.packet = packet;
        this.type = type;
    }

    @Generated
    public Packet<?> getPacket() {
        return this.packet;
    }

    @Generated
    public Type getType() {
        return this.type;
    }

    @Generated
    public void setPacket(Packet<?> packet) {
        this.packet = packet;
    }

    public static enum Type {
        SEND,
        RECEIVE;

    }
}