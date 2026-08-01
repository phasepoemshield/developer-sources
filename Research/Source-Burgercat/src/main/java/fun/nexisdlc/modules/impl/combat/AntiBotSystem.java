package fun.nexisdlc.modules.impl.combat;

import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public final class AntiBotSystem {
    private static final Set<UUID> BOTS = ConcurrentHashMap.newKeySet();

    private AntiBotSystem() {
    }

    public static void scanWorld(ClientWorld world) {
        if (world == null) {
            BOTS.clear();
            return;
        }

        for (PlayerEntity player : world.getPlayers()) {
            mark(player);
        }
    }

    public static boolean mark(PlayerEntity player) {
        if (player == null) {
            return false;
        }

        if (isOldNexisBot(player)) {
            BOTS.add(player.getUuid());
            return true;
        }

        return BOTS.contains(player.getUuid());
    }

    public static boolean isBot(PlayerEntity player) {
        return player != null && BOTS.contains(player.getUuid());
    }

    private static boolean isOldNexisBot(PlayerEntity player) {
        UUID offlineUuid = UUID.nameUUIDFromBytes(("OfflinePlayer:" + player.getName().getString())
                .getBytes(StandardCharsets.UTF_8));

        return !player.getUuid().equals(offlineUuid)
                && player instanceof OtherClientPlayerEntity
                && !player.getName().getString().contains("-");
    }
}
