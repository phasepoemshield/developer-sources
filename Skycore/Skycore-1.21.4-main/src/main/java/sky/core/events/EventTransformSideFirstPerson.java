package sky.core.events;

import com.darkmagician6.eventapi.events.Event;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.minecraft.util.Arm;

@Data
@AllArgsConstructor
public class EventTransformSideFirstPerson implements Event {
    private Arm Arm;
    private float equippedProg;
}