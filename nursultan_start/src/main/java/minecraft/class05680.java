/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04702
 *  minecraft.class04981
 *  minecraft.class05096
 *  minecraft.class05097
 *  minecraft.class05111
 */
package minecraft;

import minecraft.class04702;
import minecraft.class04981;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05111;
import minecraft.class05685;

class class05680
extends Thread {
    final /* synthetic */ class04981 N;
    final /* synthetic */ class05685 y;

    class05680(class05685 class056852, String string, class04981 class049812) {
        this.y = class056852;
        this.N = class049812;
        super(string);
    }

    @Override
    public void run() {
        try {
            class05111 class051112 = class05111.N();
            class051112.L(this.N.y);
            class05685.N(this.y).execute(class05685::u);
        }
        catch (class05097 class050972) {
            class05685.B.error("Couldn't configure world", (Throwable)class050972);
            class05685.y(this.y).execute(() -> class05685.L(this.y).N((class05096)new class04702(class050972, (class05096)this.y)));
        }
    }
}

