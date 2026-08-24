package moscow.rockstar.module.misc;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.game.WorldChangeEvent;
import moscow.rockstar.systems.event.impl.window.KeyPressEvent;
import moscow.rockstar.systems.event.impl.window.MouseEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BindSetting;
import moscow.rockstar.config.settings.ModeSetting;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(name = "KT Leave", category = ModuleCategory.OTHER, desc = "Автоматический выход с сервера при смерти")
public class KTLeaveModule extends BaseModule {
   private final ModeSetting mode = new ModeSetting(this, "Режим");
   private final ModeSetting.Value hwClassic = new ModeSetting.Value(this.mode, "HW Classik");
   private final ModeSetting.Value basic = new ModeSetting.Value(this.mode, "Основной").select();
   private final ModeSetting.Value additional = new ModeSetting.Value(this.mode, "Дополнительный");
   private final BindSetting leaveKey = new BindSetting(this, "Кнопка лива");
   private ServerSocket serverSocket;
   private final ExecutorService executorService = Executors.newSingleThreadExecutor(r -> {
      Thread t = new Thread(r);
      t.setDaemon(true);
      return t;
   });
   private final Thread shutdownHook = new Thread(this::closeServer);

   public KTLeaveModule() {
      Runtime.getRuntime().addShutdownHook(this.shutdownHook);
   }
   private boolean useQueued;
   private final EventListener<WorldChangeEvent> onWorldChange = event -> this.closeServer();
   private final EventListener<KeyPressEvent> onKey = event -> this.handleInput(event.getKey(), event.getAction());
   private final EventListener<MouseEvent> onMouse = event -> this.handleInput(event.getButton(), event.getAction());
   private final EventListener<moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent> onTick = event -> {
      if (this.hwClassic.isSelected()) {
         if (mc.player == null || mc.world == null || mc.player.networkHandler == null) {
            return;
         }

         for (int i = 0; i < 41; i++) {
            mc.player.setSneaking(true);
            Vec3d pos = mc.player.getPos().add(i, 0.0, i);
            mc.player.networkHandler.sendPacket(
               new PlayerMoveC2SPacket.PositionAndOnGround(pos.x, pos.y, pos.z, Math.random() > 0.5, mc.player.horizontalCollision)
            );
            mc.player.networkHandler.sendPacket(new KeepAliveC2SPacket((long)((int)(Math.random() * 8.0))));
         }
      }

      if (!this.additional.isSelected()) {
         return;
      }

      if (this.useQueued) {
         mc.options.useKey.setPressed(true);
         this.useQueued = false;
      }
   };

   @Override
   public void onEnable() {
      if (this.additional.isSelected()) {
         try {
            this.serverSocket = new ServerSocket(1524);
         } catch (IOException exception) {
            exception.printStackTrace();
         }
      }
   }

   @Override
   public void onDisable() {
      this.closeServer();
   }

   private void handleInput(int key, int action) {
      if (mc.currentScreen == null && action == 1 && this.basic.isSelected() && this.leaveKey.isKey(key)) {
         try (Socket socket = new Socket("localhost", 1524); PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
            writer.println("SIGNAL");
         } catch (IOException exception) {
            exception.printStackTrace();
         }
      }
   }

   private void closeServer() {
      if (this.serverSocket != null) {
         try {
            this.serverSocket.close();
         } catch (IOException exception) {
            exception.printStackTrace();
         }
      }
   }
}
