/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01704
 *  minecraft.class01894
 *  minecraft.class07703
 *  org.apache.commons.io.IOUtils
 */
package minecraft;

import java.io.PrintWriter;
import java.io.Writer;
import minecraft.class00392;
import minecraft.class01704;
import minecraft.class01894;
import minecraft.class07703;
import org.apache.commons.io.IOUtils;

class class06410
implements class01704,
class07703 {
    public static final int N = 1;
    private final PrintWriter L;
    private int u;
    private boolean i;

    private void L() {
        if (this.i) {
            this.L.println();
            this.i = false;
        }
    }

    class06410(PrintWriter printWriter) {
        this.L = printWriter;
    }

    public boolean B() {
        return false;
    }

    public void close() {
        IOUtils.closeQuietly((Writer)this.L);
    }

    private void y(int n) {
        for (int i = 0; i < n + 1; ++i) {
            this.L.write("    ");
        }
    }

    private void N(int n) {
        this.y(n);
        this.u = n;
    }

    public void N(class00392 class003922) {
        this.L();
        this.y(this.u + 1);
        this.L.print("[M] ");
        this.L.println(class003922.getString());
    }

    public void N(String string) {
        this.L();
        this.N(this.u + 1);
        this.L.print("[E] ");
        this.L.print(string);
    }

    public void N(int n, String string) {
        this.L();
        this.N(n);
        this.L.print("[C] ");
        this.L.print(string);
        this.i = true;
    }

    public void N(int n, String string, int n2) {
        if (this.i) {
            this.L.print(" -> ");
            this.L.println(n2);
            this.i = false;
        } else {
            this.N(n);
            this.L.print("[R = ");
            this.L.print(n2);
            this.L.print("] ");
            this.L.println(string);
        }
    }

    public void N(int n, class01894 class018942, int n2) {
        this.L();
        this.N(n);
        this.L.print("[F] ");
        this.L.print(class018942);
        this.L.print(" size=");
        this.L.println(n2);
    }

    public boolean A_() {
        return true;
    }

    public boolean B_() {
        return true;
    }

    public boolean G_() {
        return true;
    }
}

