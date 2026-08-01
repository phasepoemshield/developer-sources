package sky.core.events;

import com.darkmagician6.eventapi.events.Event;
import com.darkmagician6.eventapi.events.callables.EventCancellable;
import net.minecraft.client.util.math.MatrixStack;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.minecraft.screen.ScreenHandler;

@Data
@AllArgsConstructor
public class EventContainerRender extends EventCancellable implements Event {
    private MatrixStack stack;
    private int guiLeft;
    private int guiTop;
    private ScreenHandler container;

    public static class Pre extends EventContainerRender {
        public Pre(MatrixStack stack, int guiLeft, int guiTop, ScreenHandler container) {
            super(stack, guiLeft, guiTop, container);
        }
    }

    public static class Post extends EventContainerRender {
        public Post(MatrixStack stack, int guiLeft, int guiTop, ScreenHandler container) {
            super(stack, guiLeft, guiTop, container);
        }
    }
}


