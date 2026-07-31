package fun.nexisdlc.client.utils.client.other;

import fun.nexisdlc.client.utils.client.IMinecraft;
import net.minecraft.client.network.PlayerListEntry;

public class ClientUtility implements IMinecraft {

    public static String getFPS() {
        return String.valueOf(mc.getCurrentFps());
    }

    public static int getPing() {
        try {
            if (mc.player == null || mc.getNetworkHandler() == null) {
                return 0;
            }

            PlayerListEntry playerEntry = mc.getNetworkHandler()
                    .getPlayerListEntry(mc.player.getUuid());

            if (playerEntry != null) {
                return playerEntry.getLatency();
            }

            return 0;
        } catch (NullPointerException e) {
            return 0;
        }
    }
}
