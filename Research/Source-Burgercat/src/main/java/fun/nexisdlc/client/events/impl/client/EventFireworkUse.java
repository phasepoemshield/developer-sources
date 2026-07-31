package fun.nexisdlc.client.events.impl.client;

import fun.nexisdlc.client.events.api.Event;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.minecraft.util.math.Vec3d;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class EventFireworkUse extends Event {
    public Vec3d vector;
    public Vec3d velocity;
}
