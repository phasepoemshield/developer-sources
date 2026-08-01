package sky.core.events;

import com.darkmagician6.eventapi.events.Event;
import net.minecraft.client.util.math.MatrixStack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minecraft.client.render.Camera;

@Getter
@AllArgsConstructor
public class EventTest implements Event {

    private final MatrixStack matrixStack;

    private final float partialTicks;

    private final Camera renderInfo;

}