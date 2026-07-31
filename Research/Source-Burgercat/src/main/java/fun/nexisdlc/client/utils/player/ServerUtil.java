package fun.nexisdlc.client.utils.player;

import fun.nexisdlc.modules.impl.utils.ServerAssistant;
import lombok.Getter;

public final class ServerUtil {

    @Getter
    public static char anarchyType = '1';
    private ServerUtil() {
    }

    public static boolean isReallyWorld() {
        return ServerAssistant.server.is("ReallyWorld");
    }

    public static boolean isFunTime() {
        return ServerAssistant.server.is("FunTime");
    }

    public static boolean isHolyWorld() {
        return ServerAssistant.server.is("HolyWorld");
    }

    public static boolean isCopyTime() {
        return ServerAssistant.server.is("FunTime") || ServerAssistant.server.is("SpookyTime");
    }

    public static boolean isSpookyTime() {
        return ServerAssistant.server.is("SpookyTime");
    }

    public static String getServer() {
        return ServerAssistant.server.get();
    }

    public static int getAnarchy() {
        return 0;
    }
}
