package fun.nexisdlc.client.events.impl.render;

import fun.nexisdlc.client.events.api.Event;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.screen.slot.Slot;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HandledScreenEvent extends Event {
    DrawContext drawContext;
    Renderer2D renderer;
    Slot slotHover;
    int backgroundWidth, backgroundHeight;
}
