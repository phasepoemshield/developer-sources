/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class05034
 *  minecraft.class06069
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01227;
import minecraft.class05034;
import minecraft.class06069;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class01236 {
    private static final int R = 11;
    private static final int M = 0;
    private static final int B = 1;
    private static final int Z = 2;
    private static final int z = 3;
    private static final int U = 4;
    private static final int E = 5;
    private static final int W = 65536;
    private static final int m = 131072;
    private static final int P = 262144;
    private static final int s = 0x100000;
    private static final int T = 0x200000;
    private static final int b = 0x400000;
    private static final int j = 0x800000;
    private static final int v = 983040;
    private static final int n = 65535;
    private final class06069 t;
    final class01227 N;
    final class01227 y;
    final class01227[] L;
    final int u;
    final int i;

    public class01236(class06069 class060692) {
        this.t = class060692;
        int n = 11;
        this.u = 7;
        this.i = 4;
        this.N = new class01227(11, 11, 5);
        this.N.N(this.u, this.i, this.u + 1, this.i + 1, 3);
        this.N.N(this.u - 1, this.i, this.u - 1, this.i + 1, 2);
        this.N.N(this.u + 2, this.i - 2, this.u + 3, this.i + 3, 5);
        this.N.N(this.u + 1, this.i - 2, this.u + 1, this.i - 1, 1);
        this.N.N(this.u + 1, this.i + 2, this.u + 1, this.i + 3, 1);
        this.N.N(this.u - 1, this.i - 1, 1);
        this.N.N(this.u - 1, this.i + 2, 1);
        this.N.N(0, 0, 11, 1, 5);
        this.N.N(0, 9, 11, 11, 5);
        this.N(this.N, this.u, this.i - 2, class07211.field_11039, 6);
        this.N(this.N, this.u, this.i + 3, class07211.field_11039, 6);
        this.N(this.N, this.u - 2, this.i - 1, class07211.field_11039, 3);
        this.N(this.N, this.u - 2, this.i + 2, class07211.field_11039, 3);
        while (this.N(this.N)) {
        }
        this.L = new class01227[3];
        this.L[0] = new class01227(11, 11, 5);
        this.L[1] = new class01227(11, 11, 5);
        this.L[2] = new class01227(11, 11, 5);
        this.N(this.N, this.L[0]);
        this.N(this.N, this.L[1]);
        this.L[0].N(this.u + 1, this.i, this.u + 1, this.i + 1, 0x800000);
        this.L[1].N(this.u + 1, this.i, this.u + 1, this.i + 1, 0x800000);
        this.y = new class01227(this.N.N, this.N.y, 5);
        this.N();
        this.N(this.y, this.L[2]);
    }

    public @Nullable class07211 y(class01227 class012272, int n, int n2, int n3, int n4) {
        for (class07211 class072112 : class07221.field_11062) {
            if (!this.N(class012272, n + class072112.P(), n2 + class072112.T(), n3, n4)) continue;
            return class072112;
        }
        return null;
    }

    private boolean N(class01227 class012272) {
        boolean bl = false;
        for (int i = 0; i < class012272.y; ++i) {
            for (int j = 0; j < class012272.N; ++j) {
                if (class012272.N(j, i) != 0) continue;
                int n = 0;
                n += class01236.N(class012272, j + 1, i) ? 1 : 0;
                n += class01236.N(class012272, j - 1, i) ? 1 : 0;
                n += class01236.N(class012272, j, i + 1) ? 1 : 0;
                if ((n += class01236.N(class012272, j, i - 1) ? 1 : 0) >= 3) {
                    class012272.N(j, i, 2);
                    bl = true;
                    continue;
                }
                if (n != 2) continue;
                int n2 = 0;
                n2 += class01236.N(class012272, j + 1, i + 1) ? 1 : 0;
                n2 += class01236.N(class012272, j - 1, i + 1) ? 1 : 0;
                n2 += class01236.N(class012272, j + 1, i - 1) ? 1 : 0;
                if ((n2 += class01236.N(class012272, j - 1, i - 1) ? 1 : 0) > 1) continue;
                class012272.N(j, i, 2);
                bl = true;
            }
        }
        return bl;
    }

    private void N() {
        int n;
        int n2;
        ArrayList arrayList = Lists.newArrayList();
        class01227 class012272 = this.L[1];
        for (int i = 0; i < this.y.y; ++i) {
            for (n2 = 0; n2 < this.y.N; ++n2) {
                int n3 = class012272.N(n2, i);
                n = n3 & 0xF0000;
                if (n != 131072 || (n3 & 0x200000) != 0x200000) continue;
                arrayList.add(new class05034((Object)n2, (Object)i));
            }
        }
        if (arrayList.isEmpty()) {
            this.y.N(0, 0, this.y.N, this.y.y, 5);
            return;
        }
        class05034 class050342 = (class05034)arrayList.get(this.t.y(arrayList.size()));
        n2 = class012272.N((Integer)class050342.N(), (Integer)class050342.y());
        class012272.N((Integer)class050342.N(), (Integer)class050342.y(), n2 | 0x400000);
        class07211 class072112 = this.y(this.N, (Integer)class050342.N(), (Integer)class050342.y(), 1, n2 & 0xFFFF);
        n = (Integer)class050342.N() + class072112.P();
        int n4 = (Integer)class050342.y() + class072112.T();
        for (int i = 0; i < this.y.y; ++i) {
            for (int j = 0; j < this.y.N; ++j) {
                if (!class01236.N(this.N, j, i)) {
                    this.y.N(j, i, 5);
                    continue;
                }
                if (j == (Integer)class050342.N() && i == (Integer)class050342.y()) {
                    this.y.N(j, i, 3);
                    continue;
                }
                if (j != n || i != n4) continue;
                this.y.N(j, i, 3);
                this.L[2].N(j, i, 0x800000);
            }
        }
        ArrayList arrayList2 = Lists.newArrayList();
        for (class07211 class072113 : class07221.field_11062) {
            if (this.y.N(n + class072113.P(), n4 + class072113.T()) != 0) continue;
            arrayList2.add(class072113);
        }
        if (arrayList2.isEmpty()) {
            this.y.N(0, 0, this.y.N, this.y.y, 5);
            class012272.N((Integer)class050342.N(), (Integer)class050342.y(), n2);
            return;
        }
        class07211 class072114 = (class07211)arrayList2.get(this.t.y(arrayList2.size()));
        this.N(this.y, n + class072114.P(), n4 + class072114.T(), class072114, 4);
        while (this.N(this.y)) {
        }
    }

    private void N(class01227 class012272, class01227 class012273) {
        int n;
        ObjectArrayList objectArrayList = new ObjectArrayList();
        for (n = 0; n < class012272.y; ++n) {
            for (int i = 0; i < class012272.N; ++i) {
                if (class012272.N(i, n) != 2) continue;
                objectArrayList.add((Object)new class05034((Object)i, (Object)n));
            }
        }
        class07536.L((List)objectArrayList, (class06069)this.t);
        n = 10;
        for (class05034 class050342 : objectArrayList) {
            int n2;
            int n3 = (Integer)class050342.N();
            if (class012273.N(n3, n2 = ((Integer)class050342.y()).intValue()) != 0) continue;
            int n4 = n3;
            int n5 = n3;
            int n6 = n2;
            int n7 = n2;
            int n8 = 65536;
            if (class012273.N(n3 + 1, n2) == 0 && class012273.N(n3, n2 + 1) == 0 && class012273.N(n3 + 1, n2 + 1) == 0 && class012272.N(n3 + 1, n2) == 2 && class012272.N(n3, n2 + 1) == 2 && class012272.N(n3 + 1, n2 + 1) == 2) {
                ++n5;
                ++n7;
                n8 = 262144;
            } else if (class012273.N(n3 - 1, n2) == 0 && class012273.N(n3, n2 + 1) == 0 && class012273.N(n3 - 1, n2 + 1) == 0 && class012272.N(n3 - 1, n2) == 2 && class012272.N(n3, n2 + 1) == 2 && class012272.N(n3 - 1, n2 + 1) == 2) {
                --n4;
                ++n7;
                n8 = 262144;
            } else if (class012273.N(n3 - 1, n2) == 0 && class012273.N(n3, n2 - 1) == 0 && class012273.N(n3 - 1, n2 - 1) == 0 && class012272.N(n3 - 1, n2) == 2 && class012272.N(n3, n2 - 1) == 2 && class012272.N(n3 - 1, n2 - 1) == 2) {
                --n4;
                --n6;
                n8 = 262144;
            } else if (class012273.N(n3 + 1, n2) == 0 && class012272.N(n3 + 1, n2) == 2) {
                ++n5;
                n8 = 131072;
            } else if (class012273.N(n3, n2 + 1) == 0 && class012272.N(n3, n2 + 1) == 2) {
                ++n7;
                n8 = 131072;
            } else if (class012273.N(n3 - 1, n2) == 0 && class012272.N(n3 - 1, n2) == 2) {
                --n4;
                n8 = 131072;
            } else if (class012273.N(n3, n2 - 1) == 0 && class012272.N(n3, n2 - 1) == 2) {
                --n6;
                n8 = 131072;
            }
            int n9 = this.t.Z() ? n4 : n5;
            int n10 = this.t.Z() ? n6 : n7;
            int n11 = 0x200000;
            if (!class012272.y(n9, n10, 1)) {
                n9 = n9 == n4 ? n5 : n4;
                int n12 = n10 = n10 == n6 ? n7 : n6;
                if (!class012272.y(n9, n10, 1)) {
                    int n13 = n10 = n10 == n6 ? n7 : n6;
                    if (!class012272.y(n9, n10, 1)) {
                        n9 = n9 == n4 ? n5 : n4;
                        int n14 = n10 = n10 == n6 ? n7 : n6;
                        if (!class012272.y(n9, n10, 1)) {
                            n11 = 0;
                            n9 = n4;
                            n10 = n6;
                        }
                    }
                }
            }
            for (int i = n6; i <= n7; ++i) {
                for (int j = n4; j <= n5; ++j) {
                    if (j == n9 && i == n10) {
                        class012273.N(j, i, 0x100000 | n11 | n8 | n);
                        continue;
                    }
                    class012273.N(j, i, n8 | n);
                }
            }
            ++n;
        }
    }

    private void N(class01227 class012272, int n, int n2, class07211 class072112, int n3) {
        class07211 class072113;
        if (n3 <= 0) {
            return;
        }
        class012272.N(n, n2, 1);
        class012272.N(n + class072112.P(), n2 + class072112.T(), 0, 1);
        for (int i = 0; i < 8; ++i) {
            class072113 = class07211.y((int)this.t.y(4));
            if (class072113 == class072112.b() || class072113 == class07211.field_11034 && this.t.Z()) continue;
            int n4 = n + class072112.P();
            int n5 = n2 + class072112.T();
            if (class012272.N(n4 + class072113.P(), n5 + class072113.T()) != 0 || class012272.N(n4 + class072113.P() * 2, n5 + class072113.T() * 2) != 0) continue;
            this.N(class012272, n + class072112.P() + class072113.P(), n2 + class072112.T() + class072113.T(), class072113, n3 - 1);
            break;
        }
        class07211 class072114 = class072112.R();
        class072113 = class072112.M();
        class012272.N(n + class072114.P(), n2 + class072114.T(), 0, 2);
        class012272.N(n + class072113.P(), n2 + class072113.T(), 0, 2);
        class012272.N(n + class072112.P() + class072114.P(), n2 + class072112.T() + class072114.T(), 0, 2);
        class012272.N(n + class072112.P() + class072113.P(), n2 + class072112.T() + class072113.T(), 0, 2);
        class012272.N(n + class072112.P() * 2, n2 + class072112.T() * 2, 0, 2);
        class012272.N(n + class072114.P() * 2, n2 + class072114.T() * 2, 0, 2);
        class012272.N(n + class072113.P() * 2, n2 + class072113.T() * 2, 0, 2);
    }

    public boolean N(class01227 class012272, int n, int n2, int n3, int n4) {
        return (this.L[n3].N(n, n2) & 0xFFFF) == n4;
    }

    public static boolean N(class01227 class012272, int n, int n2) {
        int n3 = class012272.N(n, n2);
        return n3 == 1 || n3 == 2 || n3 == 3 || n3 == 4;
    }
}

