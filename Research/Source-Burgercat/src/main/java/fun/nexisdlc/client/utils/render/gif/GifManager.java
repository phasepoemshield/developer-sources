package fun.nexisdlc.client.utils.render.gif;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;

import java.util.ArrayList;
import java.util.List;

public final class GifManager {
    private static final GifManager INSTANCE = new GifManager();

    private final List<GifTexture> gifs = new ArrayList<>();

    private GifManager() {
    }

    public static GifManager getInstance() {
        return INSTANCE;
    }

    public void register(GifTexture gif) {
        if (gif == null || gifs.contains(gif)) {
            return;
        }
        gifs.add(gif);
    }

    public void unregister(GifTexture gif) {
        gifs.remove(gif);
    }

    @EventHandler
    public void onTick(UpdateEvent event) {
        GifTexture.preloadQueued();
        for (int i = 0; i < gifs.size(); i++) {
            gifs.get(i).tick();
        }
    }
}
