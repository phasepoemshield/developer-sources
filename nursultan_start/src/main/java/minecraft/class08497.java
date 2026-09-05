/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01471
 *  minecraft.class01474
 *  minecraft.class02142
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class01471;
import minecraft.class01474;
import minecraft.class02142;
import minecraft.class08531;

public class class08497 {
    private final class01471 N;
    private final class02142 y;
    private List<class01474> L = new ArrayList<class01474>();
    private List<class01474> u = new ArrayList<class01474>();

    public class08497(class01471 class014712, class02142 class021422) {
        this.N = class014712;
        this.y = class021422;
    }

    public class08497 y(List<class01474> list) {
        this.u = list;
        return this;
    }

    public class08497 N(List<class01474> list) {
        this.L = list;
        return this;
    }

    public class08531 N() {
        return new class08531(this.N, this.y, this.L, this.u);
    }
}

