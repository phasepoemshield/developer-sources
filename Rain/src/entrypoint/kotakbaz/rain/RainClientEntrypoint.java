package kotakbaz.rain;

import net.fabricmc.api.ClientModInitializer;

/** Fabric entrypoint wrapper — Kotlin object Rain has a private ctor. */
public final class RainClientEntrypoint implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Rain.INSTANCE.onInitializeClient();
    }
}
