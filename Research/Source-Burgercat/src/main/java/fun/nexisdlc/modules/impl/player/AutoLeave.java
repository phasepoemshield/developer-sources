package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.TickEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.time.StopWatch;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

@FunctionAdd(
    name = "AutoLeave",
    alias = "Auto Leave",
    category = Category.Player,
    description = "Автоматически покидает сервер при обнаружении игроков"
)
public class AutoLeave extends Function {

    private final BooleanSetting ignoreFriends = new BooleanSetting("Не ливать от друзей", true);

    private final SliderSetting checkDistance = new SliderSetting("Дальность проверки", 30.0f, 15.0f, 100.0f, 1.0f);

    private final SliderSetting checkFrequency = new SliderSetting("Частота проверки (сек)", 1.0f, 0.5f, 10.0f, 0.1f);

    private final ModeSetting leaveMode = new ModeSetting("Куда ливать", "/spawn", "/spawn", "/hub", "Выход с сервера");

    private final StopWatch checkTimer = new StopWatch();

    public AutoLeave() {
        addSettings(ignoreFriends, checkDistance, checkFrequency, leaveMode);
    }

    @EventHandler
    public void onTick(TickEvent event) {
        if (mc.player == null || mc.world == null) {
            return;
        }

        long checkIntervalMs = (long) (checkFrequency.get() * 1000);
        if (!checkTimer.isReached(checkIntervalMs)) {
            return;
        }

        checkTimer.reset();

        boolean ignoreFriendsEnabled = ignoreFriends.get();
        float distance = checkDistance.get();

        for (PlayerEntity player : mc.world.getPlayers()) {
            if (player == mc.player) {
                continue;
            }

            if (player.isSpectator() || player.getUuid() == null) {
                continue;
            }

            if (mc.getNetworkHandler() != null && mc.getNetworkHandler().getPlayerListEntry(player.getUuid()) == null) {
                continue;
            }

            float distanceToPlayer = mc.player.distanceTo(player);

            if (distanceToPlayer > distance) {
                continue;
            }

            String playerName = player.getName().getString();

            if (ignoreFriendsEnabled && Nexis.getInstance().getFriendStorage().isFriend(playerName)) {
                continue;
            }

            performLeave(player, distanceToPlayer);
            return;
        }
    }

    private void performLeave(PlayerEntity detectedPlayer, float distance) {
        if (mc.player == null) {
            return;
        }

        Text playerDisplayName = detectedPlayer.getDisplayName();
        String distanceFormatted = String.format("%.1f", distance);
        
        Text message = Text.literal("§c[AutoLeave] §fОбнаружен игрок ")
            .append(playerDisplayName)
            .append(Text.literal(" §fв §e" + distanceFormatted + " §fблоках!"));
        
        mc.player.sendMessage(message, false);

        String mode = leaveMode.get();

        switch (mode) {
            case "/spawn":
                mc.player.networkHandler.sendChatCommand("spawn");
                break;

            case "/hub":
                mc.player.networkHandler.sendChatCommand("hub");
                break;

            case "Выход с сервера":
                if (mc.player.networkHandler != null && mc.player.networkHandler.getConnection() != null) {
                    mc.player.networkHandler.getConnection().disconnect(Text.literal("AutoLeave"));
                }
                break;
        }

        setState(false);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        checkTimer.reset();
    }
}
