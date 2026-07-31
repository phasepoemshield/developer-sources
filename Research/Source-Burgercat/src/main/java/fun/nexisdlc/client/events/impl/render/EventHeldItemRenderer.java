package fun.nexisdlc.client.events.impl.render;

import fun.nexisdlc.client.events.api.Event;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

@EqualsAndHashCode(callSuper = true)
@Data
public class EventHeldItemRenderer extends Event {
    private final Hand hand;
    private ItemStack item;
    private float ep;
    private final MatrixStack stack;

    public EventHeldItemRenderer(Hand hand, ItemStack item, float equipProgress, MatrixStack stack) {
        this.hand = hand;
        this.item = item;
        this.ep = equipProgress;
        this.stack = stack;
    }
}
