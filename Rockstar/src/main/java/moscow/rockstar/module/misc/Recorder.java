package moscow.rockstar.module.misc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.game.AttackEvent;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.systems.event.impl.render.HudRenderEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;

@ModuleInfo(name = "Recorder", category = ModuleCategory.OTHER, desc = "Запись игрового процесса")
public class Recorder extends BaseModule {
   private final List<HashMap<String, Object>> samples = new ArrayList<>();
   private Entity lastTarget;
   private final EventListener<AttackEvent> onAttack = event -> {
      if (mc.player == null || event.getEntity() == null) {
         return;
      }

      this.lastTarget = event.getEntity();
      HashMap<String, Object> row = new HashMap<>();
      row.put("yaw_delta", this.getYawDelta(mc.player, event.getEntity()));
      row.put("pitch_delta", this.getPitchDelta(mc.player, event.getEntity()));
      this.samples.add(row);
   };
   private final EventListener<HudRenderEvent> onHud = event -> {
      if (mc.player != null) {
         event.getContext().drawText(mc.textRenderer, "Recorder: " + this.samples.size(), 4, 40, 0xFFFFFF, true);
      }
   };
   private final EventListener<ClientPlayerTickEvent> onTick = event -> {};

   @Override
   public void onDisable() {
      Path path = MinecraftClient.getInstance().runDirectory.toPath().resolve("Rockstar").resolve("kill_aura_dataset.json");
      try {
         Files.createDirectories(path.getParent());
         try (FileWriter writer = new FileWriter(path.toFile(), true)) {
            Gson gson = new GsonBuilder().create();
            writer.write(gson.toJson(this.samples));
            writer.write("\n");
         }
      } catch (IOException exception) {
         exception.printStackTrace();
      }
   }

   private float wrapDegrees(float angle) {
      angle %= 360.0F;
      if (angle > 180.0F) {
         angle -= 360.0F;
      }

      if (angle < -180.0F) {
         angle += 360.0F;
      }

      return angle;
   }

   private float getYawDelta(ClientPlayerEntity player, Entity entity) {
      double dx = entity.getX() - player.getX();
      double dz = entity.getZ() - player.getZ();
      float yaw = (float)(Math.toDegrees(Math.atan2(dz, dx)) - 90.0);
      return this.wrapDegrees(yaw - player.getYaw());
   }

   private float getPitchDelta(ClientPlayerEntity player, Entity entity) {
      double dx = entity.getX() - player.getX();
      double dz = entity.getZ() - player.getZ();
      double dy = entity.getEyeY() - player.getEyeY();
      double distance = Math.sqrt(dx * dx + dz * dz);
      float pitch = (float)(-Math.toDegrees(Math.atan2(dy, distance)));
      return this.wrapDegrees(pitch - player.getPitch());
   }
}
