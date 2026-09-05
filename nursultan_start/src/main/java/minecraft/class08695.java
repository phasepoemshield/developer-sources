/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.logging.LogListeners
 *  org.slf4j.event.Level
 */
package minecraft;

import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogListeners;
import org.slf4j.event.Level;

public class class08695 {
    private static boolean N;

    private static int N(Level level) {
        return switch (level) {
            default -> 0xFFFFFF;
            case Level.DEBUG -> 0xAAAAAA;
            case Level.WARN -> 0xFFFFAA;
            case Level.ERROR -> 0xFFAAAA;
        };
    }

    public static void N() {
        if (N) {
            return;
        }
        TracyClient.load();
        if (!TracyClient.isAvailable()) {
            return;
        }
        LogListeners.addListener((String)"Tracy", (string, level) -> TracyClient.message((String)string, (int)class08695.N(level)));
        N = true;
    }
}

