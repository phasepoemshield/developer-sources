package moscow.rockstar.module.player;

import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.network.ReceivePacketEvent;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.systems.localization.Localizator;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.util.game.TextUtility;
import moscow.rockstar.util.game.server.ServerUtility;
import moscow.rockstar.util.time.Timer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.text.Text;
@ModuleInfo(name = "Auto Leave", category = ModuleCategory.PLAYER, desc = "Автоматический выход с сервера при определенных условиях")
public class AutoLeave extends BaseModule {
   private final ModeSetting leave = new ModeSetting(this, "Условие выхода");
   private final ModeSetting.Value distLeave = new ModeSetting.Value(this.leave, "Дистанция");
   private final ModeSetting.Value healthLeave = new ModeSetting.Value(this.leave, "Здоровье");
   private final ModeSetting.Value banLeave = new ModeSetting.Value(this.leave, "Бан");
   private final SliderSetting dist = new SliderSetting(
         this, "Дистанция до игрока", () -> this.healthLeave.isSelected() || this.banLeave.isSelected()
      )
      .suffix(number -> " %s".formatted(Localizator.translate("block")) + TextUtility.makeCountTranslated(number))
      .step(1.0F)
      .min(1.0F)
      .max(150.0F)
      .currentValue(30.0F);
   private final SliderSetting health = new SliderSetting(
         this, "Здоровье для выхода", () -> this.distLeave.isSelected() || this.banLeave.isSelected()
      )
      .step(1.0F)
      .min(1.0F)
      .max(20.0F)
      .currentValue(10.0F);
   private final SliderSetting delay = new SliderSetting(
         this, "Задержка", () -> !this.banLeave.isSelected() || this.distLeave.isSelected() || this.healthLeave.isSelected()
      )
      .suffix(Localizator.translate("сек") + ".")
      .step(1.0F)
      .min(1.0F)
      .max(60.0F)
      .currentValue(40.0F);
   private final Timer timer = new Timer();
   private boolean waiting;
   private final ModeSetting mode = new ModeSetting(this, "Режим выхода");
   private final ModeSetting.Value hub = new ModeSetting.Value(this.mode, "Хаб");
   private final ModeSetting.Value serverLeave = new ModeSetting.Value(this.mode, "Выход с сервера");
   private final ModeSetting.Value spawn = new ModeSetting.Value(this.mode, "Спавн");
   private final EventListener<ClientPlayerTickEvent> onClientPlayerTickEvent = event -> {
      if (this.distLeave.isSelected()) {
         for (PlayerEntity e : mc.world.getPlayers()) {
            if (e != null
               && e != mc.player
               && !(e.distanceTo(e) > this.dist.getCurrentValue())
               && mc.player != null
               && !ServerUtility.hasCT
               && !Rockstar.getInstance().getFriendManager().isFriend(e.getName().getString())) {
               if (this.hub.isSelected()) {
                  mc.player.networkHandler.sendChatCommand("hub");
               } else if (this.serverLeave.isSelected()) {
                  mc.player.networkHandler.getConnection().disconnect(Text.of(Localizator.translate("Рядом игрок")));
               } else if (this.spawn.isSelected()) {
                  mc.player.networkHandler.sendChatCommand("spawn");
               }

               this.toggle();
               break;
            }
         }
      }

      if (this.healthLeave.isSelected() && mc.player != null && mc.player.getHealth() + mc.player.getAbsorptionAmount() <= this.health.getCurrentValue()) {
         if (this.hub.isSelected()) {
            mc.player.networkHandler.sendChatCommand("hub");
         } else if (this.serverLeave.isSelected()) {
            mc.player.networkHandler.getConnection().disconnect(Text.of(Localizator.translate("Низкое здоровье")));
         } else if (this.spawn.isSelected()) {
            mc.player.networkHandler.sendChatCommand("spawn");
         }

         this.toggle();
      }

      if (this.waiting) {
         if (this.timer.finished((long)this.delay.getCurrentValue() * 1000L)) {
            mc.player.networkHandler.sendChatCommand("an" + ServerUtility.ftAn);
            this.waiting = false;
         }
      }
   };
   private final EventListener<ReceivePacketEvent> onReceivePacketEvent = event -> {
      if (event.getPacket() instanceof GameMessageS2CPacket packet
         && packet.content().getString().contains(Localizator.translate("Бан"))
         && this.banLeave.isSelected()) {
         mc.player.networkHandler.sendChatCommand("hub");
         this.timer.reset();
         this.waiting = true;
      }
   };
}
