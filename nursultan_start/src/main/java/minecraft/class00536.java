/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Arrays;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class00536 {
    public static final int N = 16;
    public static final int y = 128;
    public static final int L = 2048;
    private static final int i = 4;
    protected byte @Nullable [] u;
    private int R;

    public boolean L(int n) {
        return this.u == null && this.R == n;
    }

    public boolean L() {
        return this.u == null;
    }

    private static byte M(int n) {
        byte by = (byte)n;
        for (int i = 4; i < 8; i += 4) {
            by = (byte)(by | n << i);
        }
        return by;
    }

    public class00536() {
        this(0);
    }

    public class00536(int n) {
        this.R = n;
    }

    public class00536(byte[] byArray) {
        this.u = byArray;
        this.R = 0;
        if (byArray.length != 2048) {
            throw (IllegalArgumentException)class07536.y((Throwable)new IllegalArgumentException("DataLayer should be 2048 bytes not: " + byArray.length));
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4096; ++i) {
            stringBuilder.append(Integer.toHexString(this.u(i)));
            if ((i & 0xF) == 15) {
                stringBuilder.append("\n");
            }
            if ((i & 0xFF) != 255) continue;
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    private static int i(int n) {
        return n & 1;
    }

    public boolean u() {
        return this.u == null && this.R == 0;
    }

    private int u(int n) {
        if (this.u == null) {
            return this.R;
        }
        int n2 = class00536.R(n);
        int n3 = class00536.i(n);
        return this.u[n2] >> 4 * n3 & 0xF;
    }

    public String y(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 256; ++i) {
            stringBuilder.append(Integer.toHexString(this.u(i)));
            if ((i & 0xF) != 15) continue;
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public class00536 y() {
        if (this.u == null) {
            return new class00536(this.R);
        }
        return new class00536((byte[])this.u.clone());
    }

    private static int y(int n, int n2, int n3) {
        return n2 << 8 | n3 << 4 | n;
    }

    public int N(int n, int n2, int n3) {
        return this.u(class00536.y(n, n2, n3));
    }

    public void N(int n, int n2, int n3, int n4) {
        this.N(class00536.y(n, n2, n3), n4);
    }

    public void N(int n) {
        this.R = n;
        this.u = null;
    }

    public byte[] N() {
        if (this.u == null) {
            this.u = new byte[2048];
            if (this.R != 0) {
                Arrays.fill(this.u, class00536.M(this.R));
            }
        }
        return this.u;
    }

    private void N(int n, int n2) {
        byte[] byArray = this.N();
        int n3 = class00536.R(n);
        int n4 = class00536.i(n);
        int n5 = ~(15 << 4 * n4);
        int n6 = (n2 & 0xF) << 4 * n4;
        byArray[n3] = (byte)(byArray[n3] & n5 | n6);
    }

    private static int R(int n) {
        return n >> 1;
    }
}

