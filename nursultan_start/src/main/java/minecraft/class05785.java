/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00536
 *  minecraft.class00538
 *  minecraft.class00869
 *  minecraft.class01296
 *  minecraft.class03480
 *  minecraft.class03482
 *  minecraft.class04991
 *  minecraft.class05015
 *  minecraft.class05027
 *  minecraft.class05474
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class00500;
import minecraft.class00536;
import minecraft.class00538;
import minecraft.class00869;
import minecraft.class01296;
import minecraft.class03480;
import minecraft.class03482;
import minecraft.class04991;
import minecraft.class05015;
import minecraft.class05027;
import minecraft.class05474;
import minecraft.class05818;
import minecraft.class05828;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

public final class class05785
extends class05015<class05818, class05828> {
    private static final long M = class05027.N((int)15);
    private static final long B = class05027.N((int)15, (class07211)class07211.field_11036);
    private static final long Z = class05027.N((int)15, (boolean)false, (class07211)class07211.field_11036);
    private final class07218 z = new class07218();
    private final class03480 U;

    public class05785(class00538 class005382) {
        this(class005382, new class05828(class005382));
    }

    protected class05785(class00538 class005382, class05828 class058282) {
        super(class005382, (class04991)class058282);
        this.U = new class03480((class05474)class005382.i());
    }

    private int u(long l) {
        int n = class07209.method_10071((long)l);
        if (class01296.y((int)n) != 0) {
            return 0;
        }
        int n2 = class07209.method_10061((long)l);
        int n3 = class07209.method_10083((long)l);
        int n4 = class01296.y((int)n2);
        int n5 = class01296.y((int)n3);
        if (n4 == 0 || n4 == 15 || n5 == 0 || n5 == 15) {
            int n6 = class01296.N((int)n2);
            int n7 = class01296.N((int)n);
            int n8 = class01296.N((int)n3);
            int n9 = 0;
            while (!((class05828)this.R).y(class01296.y((int)n6, (int)(n7 - n9 - 1), (int)n8)) && ((class05828)this.R).N(n7 - n9 - 1)) {
                ++n9;
            }
            return n9;
        }
        return 0;
    }

    private void y(int n, int n2, int n3) {
        int n4 = class01296.L((int)((class05828)this.R).L());
        this.N(n, n2, n3, n4);
        this.y(n, n2, n3, n4);
    }

    public void y(class07321 class073212) {
        long l = class01296.y((int)class073212.B, (int)class073212.Z);
        ((class05828)this.R).y(l, true);
        class03480 class034802 = Objects.requireNonNullElse(this.y(class073212.B, class073212.Z), this.U);
        class03480 class034803 = Objects.requireNonNullElse(this.y(class073212.B, class073212.Z - 1), this.U);
        class03480 class034804 = Objects.requireNonNullElse(this.y(class073212.B, class073212.Z + 1), this.U);
        class03480 class034805 = Objects.requireNonNullElse(this.y(class073212.B - 1, class073212.Z), this.U);
        class03480 class034806 = Objects.requireNonNullElse(this.y(class073212.B + 1, class073212.Z), this.U);
        int n = ((class05828)this.R).m(l);
        int n2 = ((class05828)this.R).L();
        int n3 = class01296.L((int)class073212.B);
        int n4 = class01296.L((int)class073212.Z);
        for (int i = n - 1; i >= n2; --i) {
            long l2 = class01296.y((int)class073212.B, (int)i, (int)class073212.Z);
            class00536 class005362 = ((class05828)this.R).L(l2);
            if (class005362 == null) continue;
            int n5 = class01296.L((int)i);
            int n6 = n5 + 15;
            boolean bl = false;
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    int n7 = class034802.N(k, j);
                    if (n7 > n6) continue;
                    int n8 = j == 0 ? class034803.N(k, 15) : class034802.N(k, j - 1);
                    int n9 = j == 15 ? class034804.N(k, 0) : class034802.N(k, j + 1);
                    int n10 = k == 0 ? class034805.N(15, j) : class034802.N(k - 1, j);
                    int n11 = k == 15 ? class034806.N(0, j) : class034802.N(k + 1, j);
                    int n12 = Math.max(Math.max(n8, n9), Math.max(n10, n11));
                    for (int i2 = n6; i2 >= Math.max(n5, n7); --i2) {
                        class005362.N(k, class01296.y((int)i2), j, 15);
                        if (i2 != n7 && i2 >= n12) continue;
                        long l3 = class07209.method_10064((int)(n3 + k), (int)i2, (int)(n4 + j));
                        this.L(l3, class05027.N((i2 == n7 ? 1 : 0) != 0, (i2 < n8 ? 1 : 0) != 0, (i2 < n9 ? 1 : 0) != 0, (i2 < n10 ? 1 : 0) != 0, (i2 < n11 ? 1 : 0) != 0));
                    }
                    if (n7 >= n5) continue;
                    bl = true;
                }
            }
            if (!bl) break;
        }
    }

    private void y(int n, int n2, int n3, int n4) {
        int n5 = class01296.N((int)n);
        int n6 = class01296.N((int)n2);
        int n7 = Math.max(Math.max(this.N(n - 1, n2, Integer.MIN_VALUE), this.N(n + 1, n2, Integer.MIN_VALUE)), Math.max(this.N(n, n2 - 1, Integer.MIN_VALUE), this.N(n, n2 + 1, Integer.MIN_VALUE)));
        int n8 = Math.max(n3, n4);
        long l = class01296.y((int)n5, (int)class01296.N((int)n8), (int)n6);
        while (!((class05828)this.R).W(l)) {
            if (((class05828)this.R).y(l)) {
                int n9 = class01296.L((int)class01296.L((long)l));
                int n10 = n9 + 15;
                for (int i = Math.max(n9, n8); i <= n10; ++i) {
                    long l2 = class07209.method_10064((int)n, (int)i, (int)n2);
                    if (class05785.N(((class05828)this.R).i(l2))) {
                        return;
                    }
                    ((class05828)this.R).N(l2, 15);
                    if (i >= n7 && i != n3) continue;
                    this.L(l2, Z);
                }
            }
            l = class01296.N((long)l, (class07211)class07211.field_11036);
        }
    }

    private @Nullable class03480 y(int n, int n2) {
        class03482 class034822 = this.i.y(n, n2);
        return class034822 != null ? class034822.Y() : null;
    }

    private int N(int n, int n2, int n3) {
        class03480 class034802 = this.y(class01296.N((int)n), class01296.N((int)n2));
        if (class034802 == null) {
            return n3;
        }
        return class034802.N(class01296.y((int)n), class01296.y((int)n2));
    }

    private void N(long l, class07211 class072112, int n, boolean bl, int n2) {
        if (n2 == 0) {
            return;
        }
        int n3 = class07209.method_10061((long)l);
        int n4 = class07209.method_10083((long)l);
        if (!class05785.N(class072112, class01296.y((int)n3), class01296.y((int)n4))) {
            return;
        }
        int n5 = class07209.method_10071((long)l);
        int n6 = class01296.N((int)n3);
        int n7 = class01296.N((int)n4);
        int n8 = class01296.N((int)n5) - 1;
        int n9 = n8 - n2 + 1;
        while (n8 >= n9) {
            if (!((class05828)this.R).y(class01296.y((int)n6, (int)n8, (int)n7))) {
                --n8;
                continue;
            }
            int n10 = class01296.L((int)n8);
            for (int i = 15; i >= 0; --i) {
                long l2 = class07209.method_10064((int)n3, (int)(n10 + i), (int)n4);
                if (bl) {
                    ((class05828)this.R).N(l2, n);
                    if (n <= 1) continue;
                    this.L(l2, class05027.N((int)n, (boolean)true, (class07211)class072112.b()));
                    continue;
                }
                ((class05828)this.R).N(l2, 0);
                this.y(l2, class05027.N((int)n, (class07211)class072112.b()));
            }
            --n8;
        }
    }

    private static boolean N(class07211 class072112, int n, int n2) {
        return switch (class072112) {
            case class07211.field_11043 -> {
                if (n2 == 15) {
                    yield true;
                }
                yield false;
            }
            case class07211.field_11035 -> {
                if (n2 == 0) {
                    yield true;
                }
                yield false;
            }
            case class07211.field_11039 -> {
                if (n == 15) {
                    yield true;
                }
                yield false;
            }
            case class07211.field_11034 -> {
                if (n == 0) {
                    yield true;
                }
                yield false;
            }
            default -> false;
        };
    }

    public void N(class07321 class073212, boolean bl) {
        super.N(class073212, bl);
        if (bl) {
            int n = class01296.N((int)(Objects.requireNonNullElse(this.y(class073212.B, class073212.Z), this.U).N() - 1)) + 1;
            long l = class01296.y((int)class073212.B, (int)class073212.Z);
            int n2 = ((class05828)this.R).m(l);
            int n3 = Math.max(((class05828)this.R).L(), n);
            for (int i = n2 - 1; i >= n3; --i) {
                class00536 class005362 = ((class05828)this.R).L(class01296.y((int)class073212.B, (int)i, (int)class073212.Z));
                if (class005362 == null || !class005362.u()) continue;
                class005362.N(15);
            }
        }
    }

    protected void N(long l) {
        int n;
        int n2 = class07209.method_10061((long)l);
        int n3 = class07209.method_10071((long)l);
        int n4 = class07209.method_10083((long)l);
        long l2 = class01296.i((long)l);
        int n5 = n = ((class05828)this.R).z(l2) ? this.N(n2, n4, Integer.MAX_VALUE) : Integer.MAX_VALUE;
        if (n != Integer.MAX_VALUE) {
            this.y(n2, n4, n);
        }
        if (!((class05828)this.R).y(l2)) {
            return;
        }
        if (n3 >= n) {
            this.y(l, B);
            this.L(l, Z);
        } else {
            int n6 = ((class05828)this.R).i(l);
            if (n6 > 0) {
                ((class05828)this.R).N(l, 0);
                this.y(l, class05027.N((int)n6));
            } else {
                this.y(l, L);
            }
        }
    }

    private void N(int n, int n2, int n3, int n4) {
        if (n3 <= n4) {
            return;
        }
        int n5 = class01296.N((int)n);
        int n6 = class01296.N((int)n2);
        int n7 = n3 - 1;
        int n8 = class01296.N((int)n7);
        while (((class05828)this.R).N(n8)) {
            if (((class05828)this.R).y(class01296.y((int)n5, (int)n8, (int)n6))) {
                int n9 = class01296.L((int)n8);
                for (int i = Math.min(n9 + 15, n7); i >= n9; --i) {
                    long l = class07209.method_10064((int)n, (int)i, (int)n2);
                    if (!class05785.N(((class05828)this.R).i(l))) {
                        return;
                    }
                    ((class05828)this.R).N(l, 0);
                    this.y(l, i == n3 - 1 ? M : B);
                }
            }
            --n8;
        }
    }

    private static boolean N(int n) {
        return n == 15;
    }

    protected void N(long l, long l2, int n) {
        class00500 class005002 = null;
        int n2 = this.u(l);
        for (class07211 class072112 : u) {
            int n3;
            long l3;
            if (!class05027.N((long)l2, (class07211)class072112) || !((class05828)this.R).y(class01296.i((long)(l3 = class07209.method_10060((long)l, (class07211)class072112)))) || n - 1 <= (n3 = ((class05828)this.R).i(l3))) continue;
            this.z.N(l3);
            class00500 class005003 = this.y((class07209)this.z);
            int n4 = n - this.y(class005003);
            if (n4 <= n3) continue;
            if (class005002 == null) {
                class00500 class005004 = class005002 = class05027.y((long)l2) ? class00869.N.W() : this.y((class07209)this.z.N(l));
            }
            if (this.N(class005002, class005003, class072112)) continue;
            ((class05828)this.R).N(l3, n4);
            if (n4 > 1) {
                this.L(l3, class05027.N((int)n4, (boolean)class05785.N((class00500)class005003), (class07211)class072112.b()));
            }
            this.N(l3, class072112, n4, true, n2);
        }
    }

    protected void N(long l, long l2) {
        int n = this.u(l);
        int n2 = class05027.N((long)l2);
        for (class07211 class072112 : u) {
            int n3;
            long l3;
            if (!class05027.N((long)l2, (class07211)class072112) || !((class05828)this.R).y(class01296.i((long)(l3 = class07209.method_10060((long)l, (class07211)class072112)))) || (n3 = ((class05828)this.R).i(l3)) == 0) continue;
            if (n3 <= n2 - 1) {
                ((class05828)this.R).N(l3, 0);
                this.y(l3, class05027.N((int)n3, (class07211)class072112.b()));
                this.N(l3, class072112, n3, false, n);
                continue;
            }
            this.L(l3, class05027.y((int)n3, (boolean)false, (class07211)class072112.b()));
        }
    }
}

