package org.zenith.init;

import org.zenith.ZenithClient;
import org.zenith.render.ShapeRenderer;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.ShaderWrapper;
import org.zenith.core.CosmeticCatalogBootstrap;














import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.client.MinecraftClient;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;

public class ZenithInitializer implements ClientModInitializer {
   public ZenithInitializer() {
   }

   @Override
   public void onInitializeClient() {
      ensureBaritoneSettingsExist();
      new ZenithClient();
      ZenithClient.on23().init();
      CosmeticCatalogBootstrap.ensure();
      ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new SimpleSynchronousResourceReloadListener() {
         public Identifier getFabricId() {
            return ZenithClient.on23("after_shader_load");
         }

         public void reload(ResourceManager var1) {
            ShaderWrapper.float245();
         }
      });
      ShapeRenderer.string30();
   }

   public static void ensureBaritoneSettingsExist() {
      try {
         Path path = MinecraftClient.getInstance().runDirectory.toPath().resolve("baritone").resolve("settings.txt");
         if (Files.notExists(path)) {
            Files.createDirectories(path.getParent());
            Files.createFile(path);
         }

         ensureSettingPresent(path);
      } catch (IOException ioexception) {
      }
   }

   public static void ensureSettingPresent(Path var0) throws IOException {
      var list = Files.readAllLines(var0);

      for (String s : list) {
         if (s.trim().equalsIgnoreCase("chunkCaching false")) {
            return;
         }
      }

      String s1 = list.isEmpty() ? "" : System.lineSeparator();
      Files.writeString(var0, s1 + "chunkCaching false", StandardOpenOption.APPEND);
   }
}
