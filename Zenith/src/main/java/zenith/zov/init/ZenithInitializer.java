package zenith.zov.init;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.resource.ResourceType;
import zenith.ZenithClient;
import zenith.floatHolder_8;

public class ZenithInitializer implements ClientModInitializer {
   public void onInitializeClient() {
      new ZenithClient();
      ZenithClient.getInstance().init();
      ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new ZenithInitializer$1(this));
      floatHolder_8.ll1IlIl1IIIIl11l();
   }
}
