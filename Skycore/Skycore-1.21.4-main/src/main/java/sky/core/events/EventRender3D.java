package sky.core.events;

import com.darkmagician6.eventapi.events.callables.EventCancellable;
import net.minecraft.client.util.math.MatrixStack;
import lombok.AllArgsConstructor;
import lombok.Data;
import com.darkmagician6.eventapi.events.Event;
import org.joml.Matrix4f;

@Data
@AllArgsConstructor
public class EventRender3D extends EventCancellable implements Event {
    float partialTicks;
    public MatrixStack matrixStack;
}
