package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.mixins.accessors.LEntityAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeListSetting;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;

import java.util.concurrent.ThreadLocalRandom;

@FunctionAdd(name = "PlayerUtils", alias = "Player Utils", category = Category.Player, description = "Ускорение прыжков, отключение отталкивания и блок серверных ротаций")
public class PlayerUtilsFunction extends Function {
    public static final String NOPUSH_ENTITIES = "Сущностей";
    public static final String NOPUSH_BLOCKS = "Блоков";
    public static final String NOPUSH_FISHING_ROD = "Удочек";

    public static BooleanSetting NoJumpDelay = new BooleanSetting("No Jump Delay", true);
    BooleanSetting jumpRandomization = new BooleanSetting("Рандомизация прыжков", false).setVisible(() -> NoJumpDelay.get());
    public static BooleanSetting NoPush = new BooleanSetting("No Push", true);
    public static ModeListSetting noPushModes = new ModeListSetting("Не отталкиваться от",
            new BooleanSetting(NOPUSH_ENTITIES, true),
            new BooleanSetting(NOPUSH_BLOCKS, true),
            new BooleanSetting(NOPUSH_FISHING_ROD, true)
    ).setVisible(() -> NoPush.get());
    public static BooleanSetting NoServerRotation = new BooleanSetting("No Server Rotation", false);

    public PlayerUtilsFunction() {
        addSettings(NoJumpDelay, jumpRandomization, NoPush, noPushModes, NoServerRotation);
    }

    @EventHandler
    public void onUpdate(UpdateEvent e) {
        if (mc.player == null) return;
        if (NoJumpDelay.get()) {
            int delay = jumpRandomization.get()
                    ? ThreadLocalRandom.current().nextInt(2, 6)
                    : ThreadLocalRandom.current().nextInt(1, 3);
            if (((LEntityAccessor) mc.player).getLastJumpCooldown() > delay) {
                ((LEntityAccessor) mc.player).setLastJumpCooldown(delay - 1);
            }
        }
    }

    @EventHandler
    public void onPacket(EventPacket event) {
        if (!event.isReceive() || !PlayerUtils.isNoPushEnabled() || !PlayerUtils.noPushModeEnabled(NOPUSH_FISHING_ROD)) {
            return;
        }
        if (!(event.getPacket() instanceof EntityVelocityUpdateS2CPacket velocityPacket)) {
            return;
        }
        if (PlayerUtils.shouldCancelFishingRodPull(velocityPacket)) {
            event.cancel();
        }
    }
}
