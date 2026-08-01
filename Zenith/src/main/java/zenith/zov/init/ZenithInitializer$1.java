package zenith.zov.init;

import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.util.Identifier;
import net.minecraft.resource.ResourceManager;
import zenith.ListHolder;
import zenith.ZenithClient;

class ZenithInitializer$1 implements SimpleSynchronousResourceReloadListener {
   ZenithInitializer$1(ZenithInitializer zenithinitializer) {
   }

   public Identifier getFabricId() {
      return ZenithClient.StringHolder_10("after_shader_load");
   }

   public void reload(ResourceManager ResourceManager) {
      ListHolder.llIl11llllIllIIll1lll1I1l();
   }
}
