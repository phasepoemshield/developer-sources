/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.Plot
 *  com.mojang.jtracy.TracyClient
 */
package minecraft;

import com.mojang.jtracy.Plot;
import com.mojang.jtracy.TracyClient;

final class class08693 {
    private final Plot N;
    private int y;

    class08693(String string) {
        this.N = TracyClient.createPlot((String)string);
        this.y = 0;
    }

    void y(int n) {
        this.N(this.y + n);
    }

    void N(int n) {
        this.y = n;
        this.N.setValue((double)n);
    }
}

