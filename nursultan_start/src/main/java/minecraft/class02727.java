/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05615
 *  minecraft.class06202
 *  minecraft.class07080
 */
package minecraft;

import java.io.File;
import java.time.Duration;
import minecraft.class05615;
import minecraft.class06202;
import minecraft.class07080;

public class class02727 {
    private static final Duration N = Duration.ofSeconds(15L);

    public static void N(File file, long l) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep((Duration)N);
            }
            catch (InterruptedException interruptedException) {
                return;
            }
            class07080 class070802 = class05615.N((String)"Client shutdown", (long)l);
            class06202.N((File)file, (class07080)class070802);
        });
        thread.setDaemon(true);
        thread.setName("Client shutdown watchdog");
        thread.start();
    }
}

