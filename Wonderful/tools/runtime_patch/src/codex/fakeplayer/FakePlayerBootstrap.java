package codex.fakeplayer;

import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.client.modules.Module;
import net.fabricmc.api.ClientModInitializer;

public final class FakePlayerBootstrap implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("[FakePlayer] Bootstrap started");
        for (Module module : ModuleClass.INSTANCE.getObject()) {
            if (module.getName().equals("FakePlayer")) {
                System.out.println("[FakePlayer] Already registered");
                return;
            }
        }
        ModuleClass.INSTANCE.getObject().add(FakePlayerModule.INSTANCE);
        System.out.println("[FakePlayer] Registered in module storage");
    }
}
