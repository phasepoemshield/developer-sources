package moscow.rockstar.module.combat;

import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.network.SendPacketEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.SliderSetting;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;

@ModuleInfo(name = "Super Bow", category = ModuleCategory.COMBAT, desc = "Улучшенная стрельба из лука с автоматическим прицеливанием")
public class SuperBow extends BaseModule {
   private final SliderSetting power = new SliderSetting(this, "Сила выстрела")
      .max(100.0F)
      .min(10.0F)
      .step(1.0F)
      .currentValue(10.0F);
   private final EventListener<SendPacketEvent> onSendPacket = event -> {
      if (mc.player == null) {
         return;
      }

      Packet<?> packet = event.getPacket();
      if (!(packet instanceof PlayerActionC2SPacket actionPacket) || actionPacket.getAction() != PlayerActionC2SPacket.Action.RELEASE_USE_ITEM) {
         return;
      }

      if (!mc.player.getMainHandStack().isOf(Items.BOW) && !mc.player.getOffHandStack().isOf(Items.BOW)) {
         return;
      }

      int packets = Math.max(1, (int)this.power.getCurrentValue());
      double y = mc.player.getY();
      for (int i = 0; i < packets; i++) {
         mc.player.networkHandler.sendPacket(
            new PlayerMoveC2SPacket.Full(
               mc.player.getX(),
               y + i * 1.0E-7,
               mc.player.getZ(),
               mc.player.getYaw(),
               mc.player.getPitch(),
               i % 2 == 0,
               mc.player.horizontalCollision
            )
         );
      }
   };
}
