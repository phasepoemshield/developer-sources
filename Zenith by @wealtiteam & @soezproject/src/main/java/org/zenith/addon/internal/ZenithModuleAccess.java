package org.zenith.addon.internal;

import org.zenith.addon.api.frontend.ModuleAccess;
import org.zenith.addon.api.frontend.SettingAccess;
import org.zenith.addon.api.Settings;
import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.core.BotFeatureRegistry;














import java.util.List;
import java.util.Objects;

final class ZenithModuleAccess implements ModuleAccess {
   public final Module module;

   ZenithModuleAccess(Module var1) {
      this.module = Objects.requireNonNull(var1, "module");
   }

   @Override
   public String id() {
      return this.module.getId();
   }

   @Override
   public String addonId() {
      if (this.module instanceof AddonBackedModule addonbackedmodule) {
         return addonbackedmodule.getAddonId();
      } else {
         int i = this.module.getId().indexOf(58);
         return i > 0 ? this.module.getId().substring(0, i) : "zenith";
      }
   }

   @Override
   public String name() {
      return this.module.getName();
   }

   @Override
   public String description() {
      return this.module.getDescription();
   }

   @Override
   public String category() {
      return this.module.getCategory().name();
   }

   @Override
   public boolean enabled() {
      return this.module.isEnabled();
   }

   @Override
   public void enabled(boolean var1) {
      this.module.setToggled(var1);
   }

   @Override
   public int keyCode() {
      return this.module.getKeyCode();
   }

   @Override
   public void keyCode(int var1) {
      this.module.setKeyCode(var1);
   }

   @Override
   public List<? extends SettingAccess> settings() {
      return this.module.getSettings().stream().map(var1 -> new ZenithSettingAccess(this.module, var1)).toList();
   }
}
