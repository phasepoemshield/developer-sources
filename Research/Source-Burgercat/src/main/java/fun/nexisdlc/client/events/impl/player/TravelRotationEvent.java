package fun.nexisdlc.client.events.impl.player;

import fun.nexisdlc.client.events.api.Event;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import net.minecraft.entity.LivingEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class TravelRotationEvent extends Event {
    @Getter
    private static TravelRotationEvent lastRotationEvent;

    public float pitch;
    public float yaw;
    public final LivingEntity entity;
    public boolean modified = false;

    public TravelRotationEvent(LivingEntity entity, float pitch, float yaw) {
        this.entity = entity;
        this.pitch = pitch;
        this.yaw = yaw;

        lastRotationEvent = this;
    }
}
