package sky.core.events;

import com.darkmagician6.eventapi.events.Event;
import com.darkmagician6.eventapi.events.callables.EventCancellable;
import net.minecraft.client.util.math.MatrixStack;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventHotbarRender extends EventCancellable implements Event {
    private MatrixStack stack;
    private float partialTicks;
}



