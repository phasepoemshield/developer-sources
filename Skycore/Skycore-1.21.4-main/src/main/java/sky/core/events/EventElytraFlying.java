package sky.core.events;

import com.darkmagician6.eventapi.events.Event;
import com.darkmagician6.eventapi.events.callables.EventCancellable;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.minecraft.util.math.Vec3d;

@Data
@AllArgsConstructor
public class EventElytraFlying extends EventCancellable implements Event {
    private Vec3d Vec3d;
    private float f;
}
