package sky.core.events;

import net.minecraft.client.util.math.MatrixStack;
import lombok.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.LivingEntity;
import com.darkmagician6.eventapi.events.Event;
import com.darkmagician6.eventapi.events.callables.EventCancellable;


@Data
@AllArgsConstructor
public class EventLayerHead extends EventCancellable implements Event {
    private LivingEntity entity;
    private MatrixStack matrix;
    private EntityModel<?> model;
}
