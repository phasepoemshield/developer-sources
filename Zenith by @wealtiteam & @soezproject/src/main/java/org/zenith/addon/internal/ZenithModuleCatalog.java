package org.zenith.addon.internal;

import org.zenith.core.ColorAnimator;
import org.zenith.core.PacketDispatcher;

import org.zenith.addon.api.frontend.ModuleAccess;
import org.zenith.addon.api.frontend.ModuleCatalog;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;















import java.util.Collections;
import java.util.List;
import java.util.Optional;

final class ZenithModuleCatalog implements ModuleCatalog {
   ZenithModuleCatalog() {
   }

   @Override
   public List<? extends ModuleAccess> modules() {
      return ZenithClient.on23().ColorAnimator() == null
         ? Collections.emptyList()
         : ZenithClient.on23().ColorAnimator().PacketDispatcher().stream().map(ZenithModuleAccess::new).toList();
   }

   @Override
   public Optional<? extends ModuleAccess> find(String var1) {
      return var1 != null && ZenithClient.on23().ColorAnimator() != null
         ? ZenithClient.on23()
            .ColorAnimator()
            .PacketDispatcher()
            .stream()
            .filter(var1x -> var1x.getId().equals(var1))
            .findFirst()
            .map(ZenithModuleAccess::new)
         : Optional.empty();
   }
}
