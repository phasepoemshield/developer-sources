/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04736
 *  minecraft.class04969
 *  minecraft.class05097
 *  minecraft.class05111
 *  minecraft.class05434
 */
package minecraft;

import minecraft.class04736;
import minecraft.class04969;
import minecraft.class05097;
import minecraft.class05111;
import minecraft.class05434;

class class04697
extends Thread {
    final /* synthetic */ class04736 N;

    class04697(class04736 class047362, String string) {
        this.N = class047362;
        super(string);
    }

    @Override
    public void run() {
        class05111 class051112 = class05111.N();
        try {
            class05434 class054342 = class051112.N(1, 10, class04969.field_19437);
            class05434 class054343 = class051112.N(1, 10, class04969.field_19439);
            class05434 class054344 = class051112.N(1, 10, class04969.field_19440);
            class05434 class054345 = class051112.N(1, 10, class04969.field_19441);
            class04736.N((class04736)this.N).execute(() -> {
                this.N.L = class054342;
                this.N.u = class054343;
                this.N.i = class054344;
                this.N.R = class054345;
            });
        }
        catch (class05097 class050972) {
            class04736.N.error("Couldn't fetch templates in reset world", (Throwable)class050972);
        }
    }
}

