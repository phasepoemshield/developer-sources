package fun.nexisdlc.ui.hud.api;

import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.client.IMinecraft;

public interface HudElement extends IMinecraft {
    void render(EventRender.Screen.Hud event);
}