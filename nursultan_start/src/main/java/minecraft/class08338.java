/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class07980
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class07980;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08338
extends Thread {
    private static final AtomicInteger L = new AtomicInteger(0);
    private static final Logger u = LogUtils.getLogger();
    public static final String N = "224.0.2.60";
    public static final int y = 4445;
    private static final long i = 1500L;
    private final String R;
    private final DatagramSocket M;
    private boolean B = true;
    private final String Z;

    public class08338(String string, String string2) throws IOException {
        super("LanServerPinger #" + L.incrementAndGet());
        this.R = string;
        this.Z = string2;
        this.setDaemon(true);
        this.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class07980(u));
        this.M = new DatagramSocket();
    }

    @Override
    public void run() {
        byte[] byArray = class08338.N(this.R, this.Z).getBytes(StandardCharsets.UTF_8);
        while (!this.isInterrupted() && this.B) {
            try {
                InetAddress inetAddress = InetAddress.getByName(N);
                DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length, inetAddress, 4445);
                this.M.send(datagramPacket);
            }
            catch (IOException iOException) {
                u.warn("LanServerPinger: {}", (Object)iOException.getMessage());
                break;
            }
            try {
                class08338.sleep(1500L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    @Override
    public void interrupt() {
        super.interrupt();
        this.B = false;
    }

    public static @Nullable String y(String string) {
        int n = string.indexOf("[/MOTD]");
        if (n < 0) {
            return null;
        }
        if (string.indexOf("[/MOTD]", n + "[/MOTD]".length()) >= 0) {
            return null;
        }
        int n2 = string.indexOf("[AD]", n + "[/MOTD]".length());
        if (n2 < 0) {
            return null;
        }
        int n3 = string.indexOf("[/AD]", n2 + "[AD]".length());
        if (n3 < n2) {
            return null;
        }
        return string.substring(n2 + "[AD]".length(), n3);
    }

    public static String N(String string, String string2) {
        return "[MOTD]" + string + "[/MOTD][AD]" + string2 + "[/AD]";
    }

    public static String N(String string) {
        int n = string.indexOf("[MOTD]");
        if (n < 0) {
            return "missing no";
        }
        int n2 = string.indexOf("[/MOTD]", n + "[MOTD]".length());
        if (n2 < n) {
            return "missing no";
        }
        return string.substring(n + "[MOTD]".length(), n2);
    }
}

