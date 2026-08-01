package fun.nexisdlc.ui.hud;

import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.color.ColorUtils;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;

public class TestRenderHook {
    @EventHandler
    public static void onRenderGui(EventRender.Screen.Hud event) {
        var r = event.getRenderer();

        float width = 250;
        float height = 36;


        r.blur(10, 10, width, height, 10, 1);

        r.rect(10, 10, width, height, 10, ColorUtils.rgba(0,0,0,175));

        r.text(FontRegistry.SF_SEMIBOLD, 22, 35, 19, "Nexis v1.21.11", ClientColors.TEXT.getRGB());
    }
}
