/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class01062
 *  minecraft.class04770
 *  minecraft.class07536
 *  org.apache.commons.io.IOUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ClosedByInterruptException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import minecraft.class01062;
import minecraft.class03295;
import minecraft.class03305;
import minecraft.class04770;
import minecraft.class07536;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03309 {
    private static final Logger N = LogUtils.getLogger();
    private final String y;
    private final int L;
    private final class01062 u;
    private final int i;
    private volatile boolean R;
    private @Nullable ServerSocket M;
    private final CopyOnWriteArrayList<Socket> B = new CopyOnWriteArrayList();

    private void L() {
        class03295 class032952 = null;
        while (this.R) {
            if (!this.B.isEmpty()) {
                Object object;
                class03295 class032953 = this.i();
                if (class032953 != null && !class032953.equals((Object)class032952)) {
                    class032952 = class032953;
                    object = class032953.N().getBytes(StandardCharsets.US_ASCII);
                    for (Socket socket : this.B) {
                        if (socket.isClosed()) continue;
                        class07536.Z().execute(() -> class03309.N(socket, (byte[])object));
                    }
                }
                object = this.B.stream().filter(Socket::isClosed).collect(Collectors.toList());
                this.B.removeAll((Collection<?>)object);
            }
            if (!this.R) continue;
            try {
                Thread.sleep(this.i);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    public class03309(String string, int n, class01062 class010622, int n2) {
        this.y = string;
        this.L = n;
        this.u = class010622;
        this.i = n2;
    }

    private @Nullable class03295 i() {
        List var1 = this.u.v();
        if (var1.isEmpty()) {
            return null;
        }
        class04770 class047702 = (class04770)var1.get(0);
        String string = (String)class03305.N.inverse().get((Object)class047702.method_51469().method_27983());
        if (string == null) {
            return null;
        }
        return new class03295(string, class047702.method_23317(), class047702.method_23318(), class047702.method_23321(), class047702.method_36454(), class047702.method_36455());
    }

    private void u() {
        try {
            while (this.R) {
                if (this.M == null) continue;
                N.info("Remote control server is listening for connections on port {}", (Object)this.L);
                Socket socket = this.M.accept();
                N.info("Remote control server received client connection on port {}", (Object)socket.getPort());
                this.B.add(socket);
            }
        }
        catch (ClosedByInterruptException closedByInterruptException) {
            if (this.R) {
                N.info("Remote control server closed by interrupt");
            }
        }
        catch (IOException iOException) {
            if (this.R) {
                N.error("Remote control server closed because of an IO exception", (Throwable)iOException);
            }
        }
        finally {
            IOUtils.closeQuietly((ServerSocket)this.M);
        }
        N.info("Remote control server is now stopped");
        this.R = false;
    }

    public void y() {
        this.R = false;
        IOUtils.closeQuietly((ServerSocket)this.M);
        this.M = null;
    }

    private static /* synthetic */ void N(Socket socket, byte[] byArray) {
        try {
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(byArray);
            outputStream.flush();
        }
        catch (IOException iOException) {
            N.info("Remote control client socket got an IO exception and will be closed", (Throwable)iOException);
            IOUtils.closeQuietly((Socket)socket);
        }
    }

    public void N() throws IOException {
        if (this.M != null && !this.M.isClosed()) {
            N.warn("Remote control server was asked to start, but it is already running. Will ignore.");
            return;
        }
        this.R = true;
        this.M = new ServerSocket(this.L, 50, InetAddress.getByName(this.y));
        Thread thread = new Thread(this::u, "chase-server-acceptor");
        thread.setDaemon(true);
        thread.start();
        Thread thread2 = new Thread(this::L, "chase-server-sender");
        thread2.setDaemon(true);
        thread2.start();
    }
}

