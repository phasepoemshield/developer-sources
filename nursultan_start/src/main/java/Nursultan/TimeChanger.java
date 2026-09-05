/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09349
 *  Nursultan.class11038
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 */
package Nursultan;

import Nursultan.class09349;
import Nursultan.class11038;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import java.util.function.Supplier;

@class11080(L="TimeChanger", y=class11072.VISUAL, N=class11106.WORLD)
public class TimeChanger
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;

    public TimeChanger() {
        this.s();
        this.L_0 = new class11038("select", this::m, false);
        this.L_1 = class11524.N((class11512)this, (String)"time", (class11535[])new class11038[]{new class11038("dawn", () -> 23100, false), new class11038("morning", () -> 100, false), new class11038("day", () -> 5000, true), new class11038("evening", () -> 12000, false), new class11038("sunset", () -> 12500, false), new class11038("night", () -> 17000, false), (class11038)this.L_0});
        this.L_2 = (class11504)class11524.N((class11512)this, (String)"select", (float)120.0f, (float)0.0f, (float)240.0f, (float)1.0f).N(class115362 -> {
            this.s();
            return ((class11038)this.L_0).U();
        });
    }

    private void s() {
    }

    private int m() {
        this.s();
        return ((Float)((class11504)this.L_2).i()).intValue() * 100;
    }

    @class11782
    public void N(class09349 class093492) {
        this.s();
        int n = (Integer)((Supplier)((class11038)((class11517)this.L_1).i()).N_0).get();
        if (n == -1) {
            return;
        }
        long l = class093492.N() - Math.floorMod(class093492.N(), 24000L);
        class093492.N(l + (long)n);
    }
}

