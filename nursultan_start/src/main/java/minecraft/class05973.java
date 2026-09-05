/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Lists
 *  minecraft.class00392
 *  minecraft.class01239
 *  minecraft.class01262
 *  minecraft.class01271
 *  minecraft.class01894
 */
package minecraft;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00392;
import minecraft.class01239;
import minecraft.class01262;
import minecraft.class01271;
import minecraft.class01894;
import minecraft.class05937;
import minecraft.class05938;
import minecraft.class05958;
import minecraft.class05965;
import minecraft.class05971;

public class class05973 {
    static final class01894 N = class01894.y((String)"spectator/close");
    static final class01894 y = class01894.y((String)"spectator/scroll_left");
    static final class01894 L = class01894.y((String)"spectator/scroll_right");
    private static final class01262 Z = new class05965();
    private static final class01262 z = new class05958(-1, true);
    private static final class01262 U = new class05958(1, true);
    private static final class01262 E = new class05958(1, false);
    private static final int W = 8;
    static final class00392 u = class00392.L((String)"spectatorMenu.close");
    static final class00392 i = class00392.L((String)"spectatorMenu.previous_page");
    static final class00392 R = class00392.L((String)"spectatorMenu.next_page");
    public static final class01262 M = new class05937();
    private final class01239 m;
    private class05971 P = new class05938();
    private int s = -1;
    int B;

    public class05971 L() {
        return this.P;
    }

    public class05973(class01239 class012392) {
        this.m = class012392;
    }

    public int i() {
        return this.s;
    }

    public void u() {
        this.m.N(this);
    }

    public void y(int n) {
        class01262 class012622 = this.N(n);
        if (class012622 != M) {
            if (this.s == n && class012622.ax_()) {
                class012622.N(this);
            } else {
                this.s = n;
            }
        }
    }

    public class01262 y() {
        return this.N(this.s);
    }

    public List<class01262> N() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i <= 8; ++i) {
            arrayList.add(this.N(i));
        }
        return arrayList;
    }

    public void N(class05971 class059712) {
        this.P = class059712;
        this.s = -1;
        this.B = 0;
    }

    public class01262 N(int n) {
        int n2 = n + this.B * 6;
        if (this.B > 0 && n == 0) {
            return z;
        }
        if (n == 7) {
            if (n2 < this.P.N().size()) {
                return U;
            }
            return E;
        }
        if (n == 8) {
            return Z;
        }
        if (n2 < 0 || n2 >= this.P.N().size()) {
            return M;
        }
        return (class01262)MoreObjects.firstNonNull((Object)this.P.N().get(n2), (Object)M);
    }

    public class01271 R() {
        return new class01271(this.N(), this.s);
    }
}

