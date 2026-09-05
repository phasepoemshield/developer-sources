/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06069
 */
package minecraft;

import java.net.DatagramPacket;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Locale;
import minecraft.class06069;

class class05150 {
    private final long N = new Date().getTime();
    private final int y;
    private final byte[] L;
    private final byte[] u;
    private final String i;

    public byte[] L() {
        return this.L;
    }

    public class05150(DatagramPacket datagramPacket) {
        byte[] byArray = datagramPacket.getData();
        this.L = new byte[4];
        this.L[0] = byArray[3];
        this.L[1] = byArray[4];
        this.L[2] = byArray[5];
        this.L[3] = byArray[6];
        this.i = new String(this.L, StandardCharsets.UTF_8);
        this.y = class06069.u().y(0x1000000);
        this.u = String.format(Locale.ROOT, "\t%s%d\u0000", this.i, this.y).getBytes(StandardCharsets.UTF_8);
    }

    public String u() {
        return this.i;
    }

    public byte[] y() {
        return this.u;
    }

    public Boolean N(long l) {
        return this.N < l;
    }

    public int N() {
        return this.y;
    }
}

