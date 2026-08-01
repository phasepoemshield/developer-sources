package fun.nexisdlc.ui.hud.cooldowns;

import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.ui.hud.CooldownsHud;

public class CooldownsHudTwo extends CooldownsHud {

    public CooldownsHudTwo(Dragging dragging) {
        super(dragging, false);
    }

    @Override
    public void render(EventRender.Screen.Hud event) {
        renderHud(event);
    }
}
