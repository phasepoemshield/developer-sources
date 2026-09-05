/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  minecraft.class04243
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import minecraft.class04243;
import minecraft.class05149;
import minecraft.class05150;
import minecraft.class05164;
import minecraft.class05183;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05178
extends class05149 {
    private static final Logger u = LogUtils.getLogger();
    private static final String i = "SMP";
    private static final String R = "MINECRAFT";
    private static final long M = 30000L;
    private static final long B = 5000L;
    private long Z;
    private final int z;
    private final int U;
    private final int E;
    private final String W;
    private final String m;
    private DatagramSocket P;
    private final byte[] s = new byte[1460];
    private String T;
    private String b;
    private final Map<SocketAddress, class05150> j;
    private final class05164 v;
    private long n;
    private final class04243 t;

    private Boolean L(DatagramPacket datagramPacket) {
        SocketAddress socketAddress = datagramPacket.getSocketAddress();
        if (!this.j.containsKey(socketAddress)) {
            return false;
        }
        byte[] byArray = datagramPacket.getData();
        return this.j.get(socketAddress).N() == class05183.L(byArray, 7, datagramPacket.getLength());
    }

    private class05178(class04243 class042432, int n) {
        super("Query Listener");
        this.t = class042432;
        this.z = n;
        this.b = class042432.L();
        this.U = class042432.u();
        this.W = class042432.i();
        this.E = class042432.t();
        this.m = class042432.W();
        this.n = 0L;
        this.T = "0.0.0.0";
        if (this.b.isEmpty() || this.T.equals(this.b)) {
            this.b = "0.0.0.0";
            try {
                InetAddress inetAddress = InetAddress.getLocalHost();
                this.T = inetAddress.getHostAddress();
            }
            catch (UnknownHostException unknownHostException) {
                u.warn("Unable to determine local host IP, please set server-ip in server.properties", (Throwable)unknownHostException);
            }
        } else {
            this.T = this.b;
        }
        this.v = new class05164(1460);
        this.j = Maps.newHashMap();
    }

    @Override
    public void run() {
        u.info("Query running on {}:{}", (Object)this.b, (Object)this.z);
        this.Z = class07536.L();
        DatagramPacket datagramPacket = new DatagramPacket(this.s, this.s.length);
        try {
            while (this.N) {
                try {
                    this.P.receive(datagramPacket);
                    this.u();
                    this.N(datagramPacket);
                }
                catch (SocketTimeoutException socketTimeoutException) {
                    this.u();
                }
                catch (PortUnreachableException portUnreachableException) {
                }
                catch (IOException iOException) {
                    this.N(iOException);
                }
            }
        }
        finally {
            u.debug("closeSocket: {}:{}", (Object)this.b, (Object)this.z);
            this.P.close();
        }
    }

    private boolean i() {
        try {
            this.P = new DatagramSocket(this.z, InetAddress.getByName(this.b));
            this.P.setSoTimeout(500);
            return true;
        }
        catch (Exception exception) {
            u.warn("Unable to initialise query system on {}:{}", new Object[]{this.b, this.z, exception});
            return false;
        }
    }

    private void u() {
        if (!this.N) {
            return;
        }
        long l = class07536.L();
        if (l < this.Z + 30000L) {
            return;
        }
        this.Z = l;
        this.j.values().removeIf(class051502 -> class051502.N(l));
    }

    private void u(DatagramPacket datagramPacket) throws IOException {
        class05150 class051502 = new class05150(datagramPacket);
        this.j.put(datagramPacket.getSocketAddress(), class051502);
        this.N(class051502.y(), datagramPacket);
    }

    private byte[] y(DatagramPacket datagramPacket) throws IOException {
        String[] stringArray;
        long l = class07536.L();
        if (l < this.n + 5000L) {
            byte[] byArray = this.v.N();
            byte[] byArray2 = this.N(datagramPacket.getSocketAddress());
            byArray[1] = byArray2[0];
            byArray[2] = byArray2[1];
            byArray[3] = byArray2[2];
            byArray[4] = byArray2[3];
            return byArray;
        }
        this.n = l;
        this.v.y();
        this.v.N(0);
        this.v.N(this.N(datagramPacket.getSocketAddress()));
        this.v.N("splitnum");
        this.v.N(128);
        this.v.N(0);
        this.v.N("hostname");
        this.v.N(this.W);
        this.v.N("gametype");
        this.v.N(i);
        this.v.N("game_id");
        this.v.N(R);
        this.v.N("version");
        this.v.N(this.t.w());
        this.v.N("plugins");
        this.v.N(this.t.s());
        this.v.N("map");
        this.v.N(this.m);
        this.v.N("numplayers");
        this.v.N("" + this.t.Q());
        this.v.N("maxplayers");
        this.v.N("" + this.E);
        this.v.N("hostport");
        this.v.N("" + this.U);
        this.v.N("hostip");
        this.v.N(this.T);
        this.v.N(0);
        this.v.N(1);
        this.v.N("player_");
        this.v.N(0);
        for (String string : stringArray = this.t.z_()) {
            this.v.N(string);
        }
        this.v.N(0);
        return this.v.N();
    }

    private void N(Exception exception) {
        if (!this.N) {
            return;
        }
        u.warn("Unexpected exception", (Throwable)exception);
        if (!this.i()) {
            u.error("Failed to recover from exception, shutting down!");
            this.N = false;
        }
    }

    private boolean N(DatagramPacket datagramPacket) throws IOException {
        byte[] byArray = datagramPacket.getData();
        int n = datagramPacket.getLength();
        SocketAddress socketAddress = datagramPacket.getSocketAddress();
        u.debug("Packet len {} [{}]", (Object)n, (Object)socketAddress);
        if (3 > n || -2 != byArray[0] || -3 != byArray[1]) {
            u.debug("Invalid packet [{}]", (Object)socketAddress);
            return false;
        }
        u.debug("Packet '{}' [{}]", (Object)class05183.N(byArray[2]), (Object)socketAddress);
        switch (byArray[2]) {
            case 9: {
                this.u(datagramPacket);
                u.debug("Challenge [{}]", (Object)socketAddress);
                return true;
            }
            case 0: {
                if (!this.L(datagramPacket).booleanValue()) {
                    u.debug("Invalid challenge [{}]", (Object)socketAddress);
                    return false;
                }
                if (15 == n) {
                    this.N(this.y(datagramPacket), datagramPacket);
                    u.debug("Rules [{}]", (Object)socketAddress);
                    break;
                }
                class05164 class051642 = new class05164(1460);
                class051642.N(0);
                class051642.N(this.N(datagramPacket.getSocketAddress()));
                class051642.N(this.W);
                class051642.N(i);
                class051642.N(this.m);
                class051642.N(Integer.toString(this.t.Q()));
                class051642.N(Integer.toString(this.E));
                class051642.N((short)this.U);
                class051642.N(this.T);
                this.N(class051642.N(), datagramPacket);
                u.debug("Status [{}]", (Object)socketAddress);
            }
        }
        return true;
    }

    public static @Nullable class05178 N(class04243 class042432) {
        int n = class042432.y().Y;
        if (0 >= n || 65535 < n) {
            u.warn("Invalid query port {} found in server.properties (queries disabled)", (Object)n);
            return null;
        }
        class05178 class051782 = new class05178(class042432, n);
        if (!class051782.N()) {
            return null;
        }
        return class051782;
    }

    private void N(byte[] byArray, DatagramPacket datagramPacket) throws IOException {
        this.P.send(new DatagramPacket(byArray, byArray.length, datagramPacket.getSocketAddress()));
    }

    private byte[] N(SocketAddress socketAddress) {
        return this.j.get(socketAddress).L();
    }

    @Override
    public boolean N() {
        if (this.N) {
            return true;
        }
        if (!this.i()) {
            return false;
        }
        return super.N();
    }
}

