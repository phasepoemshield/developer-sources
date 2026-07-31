package sky.core.events;

import com.darkmagician6.eventapi.events.Event;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.minecraft.util.math.Vec3d;

@Data
@AllArgsConstructor
public class EventOnMovePost implements Event {
    private float speed;
    private Vec3d movementInput;
}
