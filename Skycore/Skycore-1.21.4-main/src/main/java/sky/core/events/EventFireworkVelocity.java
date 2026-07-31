package sky.core.events;

import com.darkmagician6.eventapi.events.Event;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.minecraft.util.math.Vec3d;

@AllArgsConstructor
@Data
public class EventFireworkVelocity implements Event {
    private Vec3d velocity;
}
