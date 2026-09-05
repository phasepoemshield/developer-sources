/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class04243
 *  minecraft.class05149
 *  minecraft.class05270
 *  minecraft.class06459
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;
import minecraft.class04243;
import minecraft.class05149;
import minecraft.class05270;
import minecraft.class06459;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04903
extends class05149 {
    private static final Logger u = LogUtils.getLogger();
    private final ServerSocket i;
    private final String R;
    private final List<class06459> M = Lists.newArrayList();
    private final class04243 B;

    private class04903(class04243 class042432, ServerSocket serverSocket, String string) {
        super("RCON Listener");
        this.B = class042432;
        this.i = serverSocket;
        this.R = string;
    }

    public void run() {
        try {
            while (this.N) {
                try {
                    Socket socket = this.i.accept();
                    class06459 class064592 = new class06459(this.B, this.R, socket);
                    class064592.N();
                    this.M.add(class064592);
                    this.u();
                }
                catch (SocketTimeoutException socketTimeoutException) {
                    this.u();
                }
                catch (IOException iOException) {
                    if (!this.N) continue;
                    u.info("IO exception: ", (Throwable)iOException);
                }
            }
        }
        finally {
            this.N(this.i);
        }
    }

    private void u() {
        this.M.removeIf(class064592 -> !class064592.L());
    }

    public void y() {
        this.N = false;
        this.N(this.i);
        super.y();
        for (class06459 class064592 : this.M) {
            if (!class064592.L()) continue;
            class064592.y();
        }
        this.M.clear();
    }

    public static @Nullable class04903 N(class04243 class042432) {
        int n;
        class05270 class052702 = class042432.y();
        String string = class042432.L();
        if (string.isEmpty()) {
            string = "0.0.0.0";
        }
        if (0 >= (n = class052702.O) || 65535 < n) {
            u.warn("Invalid rcon port {} found in server.properties, rcon disabled!", (Object)n);
            return null;
        }
        String string2 = class052702.g;
        if (string2.isEmpty()) {
            u.warn("No rcon password set in server.properties, rcon disabled!");
            return null;
        }
        try {
            ServerSocket serverSocket = new ServerSocket(n, 0, InetAddress.getByName(string));
            serverSocket.setSoTimeout(500);
            class04903 class049032 = new class04903(class042432, serverSocket, string2);
            if (!class049032.N()) {
                return null;
            }
            u.info("RCON running on {}:{}", (Object)string, (Object)n);
            return class049032;
        }
        catch (IOException iOException) {
            u.warn("Unable to initialise RCON on {}:{}", new Object[]{string, n, iOException});
            return null;
        }
    }

    private void N(ServerSocket serverSocket) {
        u.debug("closeSocket: {}", (Object)serverSocket);
        try {
            serverSocket.close();
        }
        catch (IOException iOException) {
            u.warn("Failed to close socket", (Throwable)iOException);
        }
    }
}

