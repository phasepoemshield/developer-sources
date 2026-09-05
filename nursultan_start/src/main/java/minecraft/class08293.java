/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07980
 *  minecraft.class08309
 *  minecraft.class08311
 */
package minecraft;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import minecraft.class07980;
import minecraft.class08309;
import minecraft.class08311;

public class class08293
extends Thread {
    private final class08311 N;
    private final InetAddress y;
    private final MulticastSocket L;

    public class08293(class08311 class083112) throws IOException {
        super("LanServerDetector #" + class08309.N.incrementAndGet());
        this.N = class083112;
        this.setDaemon(true);
        this.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class07980(class08309.y));
        this.L = new MulticastSocket(4445);
        this.y = InetAddress.getByName("224.0.2.60");
        this.L.setSoTimeout(5000);
        this.L.joinGroup(this.y);
    }

    @Override
    public void run() {
        byte[] byArray = new byte[1024];
        while (!this.isInterrupted()) {
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            try {
                this.L.receive(datagramPacket);
            }
            catch (SocketTimeoutException socketTimeoutException) {
                continue;
            }
            catch (IOException iOException) {
                class08309.y.error("Couldn't ping server", (Throwable)iOException);
                break;
            }
            String string = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength(), StandardCharsets.UTF_8);
            class08309.y.debug("{}: {}", (Object)datagramPacket.getAddress(), (Object)string);
            this.N.N(string, datagramPacket.getAddress());
        }
        try {
            this.L.leaveGroup(this.y);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.L.close();
    }
}

