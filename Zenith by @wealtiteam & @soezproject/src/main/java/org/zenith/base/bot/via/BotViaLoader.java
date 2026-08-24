package org.zenith.base.bot.via;

import org.zenith.module.Bot;





import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.platform.ViaPlatformLoader;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;

final class BotViaLoader implements ViaPlatformLoader {
   BotViaLoader() {
   }

   public void load() {
      Via.getManager().getProviders().use(VersionProvider.class, new BotViaVersionProvider(null));
   }

   public void unload() {
   }
}
