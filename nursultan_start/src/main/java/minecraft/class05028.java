/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00538
 *  minecraft.class00869
 *  minecraft.class01296
 *  minecraft.class03482
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07321
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00538;
import minecraft.class00869;
import minecraft.class01296;
import minecraft.class03482;
import minecraft.class05013;
import minecraft.class05015;
import minecraft.class05023;
import minecraft.class05027;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07321;

public final class class05028
extends class05015<class05013, class05023> {
    private final class07218 M = new class07218();

    public class05028(class00538 class005382) {
        this(class005382, new class05023(class005382));
    }

    public class05028(class00538 class005382, class05023 class050232) {
        super(class005382, class050232);
    }

    @Override
    public void y(class07321 class073212) {
        this.N(class073212, true);
        class03482 class034822 = this.i.y(class073212.B, class073212.Z);
        if (class034822 != null) {
            class034822.N((T class072092, U class005002) -> {
                int n = class005002.m();
                this.L(class072092.method_10063(), class05027.N(n, class05028.N(class005002)));
            });
        }
    }

    private int N(long l, class00500 class005002) {
        int n = class005002.m();
        if (n > 0 && ((class05023)this.R).z(class01296.i((long)l))) {
            return n;
        }
        return 0;
    }

    @Override
    protected void N(long l, long l2) {
        int n = class05027.N(l2);
        for (class07211 class072112 : u) {
            int n2;
            long l3;
            if (!class05027.N(l2, class072112) || !((class05023)this.R).y(class01296.i((long)(l3 = class07209.method_10060((long)l, (class07211)class072112)))) || (n2 = ((class05023)this.R).i(l3)) == 0) continue;
            if (n2 <= n - 1) {
                class00500 class005002 = this.y((class07209)this.M.N(l3));
                int n3 = this.N(l3, class005002);
                ((class05023)this.R).N(l3, 0);
                if (n3 < n2) {
                    this.y(l3, class05027.N(n2, class072112.b()));
                }
                if (n3 <= 0) continue;
                this.L(l3, class05027.N(n3, class05028.N(class005002)));
                continue;
            }
            this.L(l3, class05027.y(n2, false, class072112.b()));
        }
    }

    @Override
    protected void N(long l, long l2, int n) {
        class00500 class005002 = null;
        for (class07211 class072112 : u) {
            int n2;
            long l3;
            if (!class05027.N(l2, class072112) || !((class05023)this.R).y(class01296.i((long)(l3 = class07209.method_10060((long)l, (class07211)class072112)))) || n - 1 <= (n2 = ((class05023)this.R).i(l3))) continue;
            this.M.N(l3);
            class00500 class005003 = this.y((class07209)this.M);
            int n3 = n - this.y(class005003);
            if (n3 <= n2) continue;
            if (class005002 == null) {
                class00500 class005004 = class005002 = class05027.y(l2) ? class00869.N.W() : this.y((class07209)this.M.N(l));
            }
            if (this.N(class005002, class005003, class072112)) continue;
            ((class05023)this.R).N(l3, n3);
            if (n3 <= 1) continue;
            this.L(l3, class05027.N(n3, class05028.N(class005003), class072112.b()));
        }
    }

    @Override
    protected void N(long l) {
        int n;
        long l2 = class01296.i((long)l);
        if (!((class05023)this.R).y(l2)) {
            return;
        }
        class00500 class005002 = this.y((class07209)this.M.N(l));
        int n2 = this.N(l, class005002);
        if (n2 < (n = ((class05023)this.R).i(l))) {
            ((class05023)this.R).N(l, 0);
            this.y(l, class05027.N(n));
        } else {
            this.y(l, L);
        }
        if (n2 > 0) {
            this.L(l, class05027.N(n2, class05028.N(class005002)));
        }
    }
}

