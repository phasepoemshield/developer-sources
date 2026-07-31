package sky.core.events;

import net.minecraft.client.util.math.MatrixStack;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.util.Arm;
import com.darkmagician6.eventapi.events.Event;
import com.darkmagician6.eventapi.events.callables.EventCancellable;

@Data
@AllArgsConstructor
public class EventViewModel extends EventCancellable implements Event {
    private MatrixStack matrixStack;
    private Arm Arm;
}
