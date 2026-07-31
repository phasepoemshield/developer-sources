package sky.core.events;

import net.minecraft.client.util.math.MatrixStack;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.util.Hand;
import com.darkmagician6.eventapi.events.Event;
import com.darkmagician6.eventapi.events.callables.EventCancellable;

@Data
@AllArgsConstructor
public class EventSwingAnimation extends EventCancellable implements Event {
    private AbstractClientPlayerEntity player;
    private float swingProgress;
    private Hand hand;
    private MatrixStack matrixStack;
}