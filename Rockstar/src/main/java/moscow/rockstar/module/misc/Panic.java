package moscow.rockstar.module.misc;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import moscow.rockstar.Rockstar;
import moscow.rockstar.mixin.minecraft.client.IMinecraftClient;
import moscow.rockstar.module.Module;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.util.game.LegacyLauncherPaths;
import moscow.rockstar.util.game.TitleBarHelper;
import net.fabricmc.loader.impl.FabricLoaderImpl;
import net.fabricmc.loader.impl.ModContainerImpl;
import net.minecraft.client.util.Icons;

@ModuleInfo(name = "Panic", category = ModuleCategory.OTHER, desc = "Экстренное отключение всех модулей и очистка следов")
public class Panic extends BaseModule {
   @Override
   public void onEnable() {
      TitleBarHelper.setLightTitleBar();
      Rockstar.getInstance().setPanic(true);
      Rockstar.getInstance().getFileManager().saveClientFiles();

      for (Module module : Rockstar.getInstance().getModuleManager().getModules()) {
         module.setKey(-1);
         module.disable();
      }

      try {
         mc.getWindow().setIcon(mc.getDefaultResourcePack(), Icons.RELEASE);
      } catch (Exception ignored) {
      }

      ModContainerImpl rockstarMod = this.getRockstarMod();
      if (rockstarMod != null) {
         for (Path path : rockstarMod.getOrigin().getPaths()) {
            path.toFile().delete();
         }
         FabricLoaderImpl.INSTANCE.getModsInternal().remove(rockstarMod);
      }

      this.redirectToLegacyLauncher();
      super.onEnable();
   }

   private void redirectToLegacyLauncher() {
      Optional<Path> optional = LegacyLauncherPaths.findGameDirectory();
      if (optional.isEmpty()) {
         Rockstar.LOGGER.warn("Legacy Launcher game directory was not found; Minecraft directory was not changed for Panic");
         return;
      }

      Path path = optional.get().toAbsolutePath().normalize();
      try {
         Files.createDirectories(path.resolve("resourcepacks"));
         IMinecraftClient client = (IMinecraftClient) (Object) mc;
         client.setRunDirectory(path.toFile());
         Rockstar.LOGGER.info("Panic changed Minecraft directory to Legacy Launcher path: {}", path);
      } catch (Exception exception) {
         Rockstar.LOGGER.warn("Failed to change Minecraft directory for Panic: {}", path, exception);
      }
   }

   private ModContainerImpl getRockstarMod() {
      return FabricLoaderImpl.INSTANCE
         .getAllMods()
         .stream()
         .filter(modContainer -> modContainer.getMetadata().getId().equals(Rockstar.MOD_ID))
         .map(m -> (ModContainerImpl) m)
         .findFirst()
         .orElse(null);
   }
}
