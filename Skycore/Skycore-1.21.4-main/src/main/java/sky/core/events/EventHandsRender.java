package sky.core.events;

import com.darkmagician6.eventapi.events.Event;
import com.darkmagician6.eventapi.events.callables.EventCancellable;
import net.minecraft.client.util.math.MatrixStack;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.minecraft.client.render.Camera;
@Data
@AllArgsConstructor
public class EventHandsRender extends EventCancellable implements Event {
    private Camera Camera;
    private MatrixStack stack;
    private float part;

    public static class Pre extends EventHandsRender {

        public Pre(Camera Camera, MatrixStack stack, float part) {
            super(Camera, stack, part);
        }
    }
    public static class Post extends EventHandsRender {
        public Post(Camera Camera, MatrixStack stack, float part) {
            super(Camera, stack, part);
        }
    }
}
