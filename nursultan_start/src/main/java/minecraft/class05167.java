/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10491
 *  Nursultan.class10493
 *  Nursultan.class10494
 *  Nursultan.class10495
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00753
 *  minecraft.class04878
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06433
 *  minecraft.class06442
 *  minecraft.class06443
 *  minecraft.class06476
 *  minecraft.class06480
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07321
 *  minecraft.class07536
 *  minecraft.class08088
 */
package minecraft;

import Nursultan.class10491;
import Nursultan.class10493;
import Nursultan.class10494;
import Nursultan.class10495;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00753;
import minecraft.class04878;
import minecraft.class05141;
import minecraft.class05146;
import minecraft.class05158;
import minecraft.class05163;
import minecraft.class05177;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06433;
import minecraft.class06442;
import minecraft.class06443;
import minecraft.class06476;
import minecraft.class06480;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07321;
import minecraft.class07536;
import minecraft.class08088;

public class class05167
extends class06476 {
    private static final int Q = 58;
    private static final int O = 22;
    private static final int g = 58;
    public static final int N = 29;
    private static final int I = 61;
    private class06433 J;
    private class06433 o;
    private final List<class06476> q = Lists.newArrayList();

    private void L(class05974 class059742, class06069 class060692, class05163 class051632) {
        if (this.N(class051632, 21, 21, 36, 36)) {
            this.N(class059742, class051632, 21, 0, 22, 36, 0, 36, y, y, false);
            this.N(class059742, class051632, 21, 1, 22, 36, 23, 36);
            for (int i = 0; i < 4; ++i) {
                this.N(class059742, class051632, 21 + i, 13 + i, 21 + i, 36 - i, 13 + i, 21 + i, L, L, false);
                this.N(class059742, class051632, 21 + i, 13 + i, 36 - i, 36 - i, 13 + i, 36 - i, L, L, false);
                this.N(class059742, class051632, 21 + i, 13 + i, 22 + i, 21 + i, 13 + i, 35 - i, L, L, false);
                this.N(class059742, class051632, 36 - i, 13 + i, 22 + i, 36 - i, 13 + i, 35 - i, L, L, false);
            }
            this.N(class059742, class051632, 25, 16, 25, 32, 16, 32, y, y, false);
            this.N(class059742, class051632, 25, 17, 25, 25, 19, 25, L, L, false);
            this.N(class059742, class051632, 32, 17, 25, 32, 19, 25, L, L, false);
            this.N(class059742, class051632, 25, 17, 32, 25, 19, 32, L, L, false);
            this.N(class059742, class051632, 32, 17, 32, 32, 19, 32, L, L, false);
            this.L(class059742, L, 26, 20, 26, class051632);
            this.L(class059742, L, 27, 21, 27, class051632);
            this.L(class059742, R, 27, 20, 27, class051632);
            this.L(class059742, L, 26, 20, 31, class051632);
            this.L(class059742, L, 27, 21, 30, class051632);
            this.L(class059742, R, 27, 20, 30, class051632);
            this.L(class059742, L, 31, 20, 31, class051632);
            this.L(class059742, L, 30, 21, 30, class051632);
            this.L(class059742, R, 30, 20, 30, class051632);
            this.L(class059742, L, 31, 20, 26, class051632);
            this.L(class059742, L, 30, 21, 27, class051632);
            this.L(class059742, R, 30, 20, 27, class051632);
            this.N(class059742, class051632, 28, 21, 27, 29, 21, 27, y, y, false);
            this.N(class059742, class051632, 27, 21, 28, 27, 21, 29, y, y, false);
            this.N(class059742, class051632, 28, 21, 30, 29, 21, 30, y, y, false);
            this.N(class059742, class051632, 30, 21, 28, 30, 21, 29, y, y, false);
        }
    }

    public class05167(class06069 class060692, int n, int n2, class07211 class072112) {
        super(class04878.H, class072112, 0, class05167.N((int)n, (int)39, (int)n2, (class07211)class072112, (int)58, (int)23, (int)58));
        Object object4;
        Object object22;
        Object object32;
        this.N(class072112);
        List<class06433> var5 = this.N(class060692);
        this.J.u = true;
        this.q.add((class06476)new class06480(class072112, this.J));
        this.q.add(new class05158(class072112, this.o));
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new class10495());
        arrayList.add(new class10494());
        arrayList.add(new class05177());
        arrayList.add(new class10491());
        arrayList.add(new class10493());
        arrayList.add(new class05141());
        arrayList.add(new class05146());
        block0: for (Object object32 : var5) {
            if (object32.u || object32.y()) continue;
            for (Object object22 : arrayList) {
                if (!object22.N((class06433)object32)) continue;
                this.q.add(object22.N(class072112, (class06433)object32, class060692));
                continue block0;
            }
        }
        class07218 class072182 = this.L(9, 0, 22);
        for (Object object4 : this.q) {
            object4.L().N((class00753)class072182);
        }
        object32 = class05163.N((class00753)this.L(1, 1, 1), (class00753)this.L(23, 8, 21));
        object4 = class05163.N((class00753)this.L(34, 1, 1), (class00753)this.L(56, 8, 21));
        object22 = class05163.N((class00753)this.L(22, 13, 22), (class00753)this.L(35, 17, 35));
        int n3 = class060692.M();
        this.q.add((class06476)new class06443(class072112, (class05163)object32, n3++));
        this.q.add((class06476)new class06443(class072112, (class05163)object4, n3++));
        this.q.add((class06476)new class06442(class072112, (class05163)object22));
    }

    public class05167(class07001 class070012) {
        super(class04878.H, class070012);
    }

    private void i(class05974 class059742, class06069 class060692, class05163 class051632) {
        int n;
        if (this.N(class051632, 7, 21, 13, 50)) {
            this.N(class059742, class051632, 7, 0, 21, 13, 0, 50, y, y, false);
            this.N(class059742, class051632, 7, 1, 21, 13, 10, 50);
            this.N(class059742, class051632, 11, 8, 21, 13, 8, 53, y, y, false);
            for (n = 0; n < 4; ++n) {
                this.N(class059742, class051632, n + 7, n + 5, 21, n + 7, n + 5, 54, L, L, false);
            }
            for (n = 21; n <= 45; n += 3) {
                this.L(class059742, i, 12, 9, n, class051632);
            }
        }
        if (this.N(class051632, 44, 21, 50, 54)) {
            this.N(class059742, class051632, 44, 0, 21, 50, 0, 50, y, y, false);
            this.N(class059742, class051632, 44, 1, 21, 50, 10, 50);
            this.N(class059742, class051632, 44, 8, 21, 46, 8, 53, y, y, false);
            for (n = 0; n < 4; ++n) {
                this.N(class059742, class051632, 50 - n, n + 5, 21, 50 - n, n + 5, 54, L, L, false);
            }
            for (n = 21; n <= 45; n += 3) {
                this.L(class059742, i, 45, 9, n, class051632);
            }
        }
        if (this.N(class051632, 8, 44, 49, 54)) {
            this.N(class059742, class051632, 14, 0, 44, 43, 0, 50, y, y, false);
            this.N(class059742, class051632, 14, 1, 44, 43, 10, 50);
            for (n = 12; n <= 45; n += 3) {
                this.L(class059742, i, n, 9, 45, class051632);
                this.L(class059742, i, n, 9, 52, class051632);
                if (n != 12 && n != 18 && n != 24 && n != 33 && n != 39 && n != 45) continue;
                this.L(class059742, i, n, 9, 47, class051632);
                this.L(class059742, i, n, 9, 50, class051632);
                this.L(class059742, i, n, 10, 45, class051632);
                this.L(class059742, i, n, 10, 46, class051632);
                this.L(class059742, i, n, 10, 51, class051632);
                this.L(class059742, i, n, 10, 52, class051632);
                this.L(class059742, i, n, 11, 47, class051632);
                this.L(class059742, i, n, 11, 50, class051632);
                this.L(class059742, i, n, 12, 48, class051632);
                this.L(class059742, i, n, 12, 49, class051632);
            }
            for (n = 0; n < 3; ++n) {
                this.N(class059742, class051632, 8 + n, 5 + n, 54, 49 - n, 5 + n, 54, y, y, false);
            }
            this.N(class059742, class051632, 11, 8, 54, 46, 8, 54, L, L, false);
            this.N(class059742, class051632, 14, 8, 44, 43, 8, 53, y, y, false);
        }
    }

    private void u(class05974 class059742, class06069 class060692, class05163 class051632) {
        int n;
        if (this.N(class051632, 0, 21, 6, 58)) {
            this.N(class059742, class051632, 0, 0, 21, 6, 0, 57, y, y, false);
            this.N(class059742, class051632, 0, 1, 21, 6, 7, 57);
            this.N(class059742, class051632, 4, 4, 21, 6, 4, 53, y, y, false);
            for (n = 0; n < 4; ++n) {
                this.N(class059742, class051632, n, n + 1, 21, n, n + 1, 57 - n, L, L, false);
            }
            for (n = 23; n < 53; n += 3) {
                this.L(class059742, i, 5, 5, n, class051632);
            }
            this.L(class059742, i, 5, 5, 52, class051632);
            for (n = 0; n < 4; ++n) {
                this.N(class059742, class051632, n, n + 1, 21, n, n + 1, 57 - n, L, L, false);
            }
            this.N(class059742, class051632, 4, 1, 52, 6, 3, 52, y, y, false);
            this.N(class059742, class051632, 5, 1, 51, 5, 3, 53, y, y, false);
        }
        if (this.N(class051632, 51, 21, 58, 58)) {
            this.N(class059742, class051632, 51, 0, 21, 57, 0, 57, y, y, false);
            this.N(class059742, class051632, 51, 1, 21, 57, 7, 57);
            this.N(class059742, class051632, 51, 4, 21, 53, 4, 53, y, y, false);
            for (n = 0; n < 4; ++n) {
                this.N(class059742, class051632, 57 - n, n + 1, 21, 57 - n, n + 1, 57 - n, L, L, false);
            }
            for (n = 23; n < 53; n += 3) {
                this.L(class059742, i, 52, 5, n, class051632);
            }
            this.L(class059742, i, 52, 5, 52, class051632);
            this.N(class059742, class051632, 51, 1, 52, 53, 3, 52, y, y, false);
            this.N(class059742, class051632, 52, 1, 51, 52, 3, 53, y, y, false);
        }
        if (this.N(class051632, 0, 51, 57, 57)) {
            this.N(class059742, class051632, 7, 0, 51, 50, 0, 57, y, y, false);
            this.N(class059742, class051632, 7, 1, 51, 50, 10, 57);
            for (n = 0; n < 4; ++n) {
                this.N(class059742, class051632, n + 1, n + 1, 57 - n, 56 - n, n + 1, 57 - n, L, L, false);
            }
        }
    }

    private void y(class05974 class059742, class06069 class060692, class05163 class051632) {
        if (this.N(class051632, 15, 20, 42, 21)) {
            int n;
            this.N(class059742, class051632, 15, 0, 21, 42, 0, 21, y, y, false);
            this.N(class059742, class051632, 26, 1, 21, 31, 3, 21);
            this.N(class059742, class051632, 21, 12, 21, 36, 12, 21, y, y, false);
            this.N(class059742, class051632, 17, 11, 21, 40, 11, 21, y, y, false);
            this.N(class059742, class051632, 16, 10, 21, 41, 10, 21, y, y, false);
            this.N(class059742, class051632, 15, 7, 21, 42, 9, 21, y, y, false);
            this.N(class059742, class051632, 16, 6, 21, 41, 6, 21, y, y, false);
            this.N(class059742, class051632, 17, 5, 21, 40, 5, 21, y, y, false);
            this.N(class059742, class051632, 21, 4, 21, 36, 4, 21, y, y, false);
            this.N(class059742, class051632, 22, 3, 21, 26, 3, 21, y, y, false);
            this.N(class059742, class051632, 31, 3, 21, 35, 3, 21, y, y, false);
            this.N(class059742, class051632, 23, 2, 21, 25, 2, 21, y, y, false);
            this.N(class059742, class051632, 32, 2, 21, 34, 2, 21, y, y, false);
            this.N(class059742, class051632, 28, 4, 20, 29, 4, 21, L, L, false);
            this.L(class059742, L, 27, 3, 21, class051632);
            this.L(class059742, L, 30, 3, 21, class051632);
            this.L(class059742, L, 26, 2, 21, class051632);
            this.L(class059742, L, 31, 2, 21, class051632);
            this.L(class059742, L, 25, 1, 21, class051632);
            this.L(class059742, L, 32, 1, 21, class051632);
            for (n = 0; n < 7; ++n) {
                this.L(class059742, u, 28 - n, 6 + n, 21, class051632);
                this.L(class059742, u, 29 + n, 6 + n, 21, class051632);
            }
            for (n = 0; n < 4; ++n) {
                this.L(class059742, u, 28 - n, 9 + n, 21, class051632);
                this.L(class059742, u, 29 + n, 9 + n, 21, class051632);
            }
            this.L(class059742, u, 28, 12, 21, class051632);
            this.L(class059742, u, 29, 12, 21, class051632);
            for (n = 0; n < 3; ++n) {
                this.L(class059742, u, 22 - n * 2, 8, 21, class051632);
                this.L(class059742, u, 22 - n * 2, 9, 21, class051632);
                this.L(class059742, u, 35 + n * 2, 8, 21, class051632);
                this.L(class059742, u, 35 + n * 2, 9, 21, class051632);
            }
            this.N(class059742, class051632, 15, 13, 21, 42, 15, 21);
            this.N(class059742, class051632, 15, 1, 21, 15, 6, 21);
            this.N(class059742, class051632, 16, 1, 21, 16, 5, 21);
            this.N(class059742, class051632, 17, 1, 21, 20, 4, 21);
            this.N(class059742, class051632, 21, 1, 21, 21, 3, 21);
            this.N(class059742, class051632, 22, 1, 21, 22, 2, 21);
            this.N(class059742, class051632, 23, 1, 21, 24, 1, 21);
            this.N(class059742, class051632, 42, 1, 21, 42, 6, 21);
            this.N(class059742, class051632, 41, 1, 21, 41, 5, 21);
            this.N(class059742, class051632, 37, 1, 21, 40, 4, 21);
            this.N(class059742, class051632, 36, 1, 21, 36, 3, 21);
            this.N(class059742, class051632, 33, 1, 21, 34, 1, 21);
            this.N(class059742, class051632, 35, 1, 21, 35, 2, 21);
        }
    }

    private List<class06433> N(class06069 class060692) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        class06433[] class06433Array = new class06433[75];
        for (n7 = 0; n7 < 5; ++n7) {
            for (n6 = 0; n6 < 4; ++n6) {
                n5 = 0;
                n4 = class05167.y((int)n7, (int)0, (int)n6);
                class06433Array[n4] = new class06433(n4);
            }
        }
        for (n7 = 0; n7 < 5; ++n7) {
            for (n6 = 0; n6 < 4; ++n6) {
                n5 = 1;
                n4 = class05167.y((int)n7, (int)1, (int)n6);
                class06433Array[n4] = new class06433(n4);
            }
        }
        for (n7 = 1; n7 < 4; ++n7) {
            for (n6 = 0; n6 < 2; ++n6) {
                n5 = 2;
                n4 = class05167.y((int)n7, (int)2, (int)n6);
                class06433Array[n4] = new class06433(n4);
            }
        }
        this.J = class06433Array[b];
        for (n7 = 0; n7 < 5; ++n7) {
            for (n6 = 0; n6 < 5; ++n6) {
                for (n5 = 0; n5 < 3; ++n5) {
                    n4 = class05167.y((int)n7, (int)n5, (int)n6);
                    if (class06433Array[n4] == null) continue;
                    for (class07211 class072112 : class07211.values()) {
                        int n8;
                        n3 = n7 + class072112.P();
                        n2 = n5 + class072112.s();
                        n = n6 + class072112.T();
                        if (n3 < 0 || n3 >= 5 || n < 0 || n >= 5 || n2 < 0 || n2 >= 3 || class06433Array[n8 = class05167.y((int)n3, (int)n2, (int)n)] == null) continue;
                        if (n == n6) {
                            class06433Array[n4].N(class072112, class06433Array[n8]);
                            continue;
                        }
                        class06433Array[n4].N(class072112.b(), class06433Array[n8]);
                    }
                }
            }
        }
        class06433 class064332 = new class06433(1003);
        class06433 class064333 = new class06433(1001);
        class06433 class064334 = new class06433(1002);
        class06433Array[j].N(class07211.field_11036, class064332);
        class06433Array[v].N(class07211.field_11035, class064333);
        class06433Array[class05167.n].N(class07211.field_11035, class064334);
        class064332.u = true;
        class064333.u = true;
        class064334.u = true;
        this.J.i = true;
        this.o = class06433Array[class05167.y((int)class060692.y(4), (int)0, (int)2)];
        this.o.u = true;
        this.o.y[class07211.field_11034.L()].u = true;
        this.o.y[class07211.field_11043.L()].u = true;
        this.o.y[class07211.field_11034.L()].y[class07211.field_11043.L()].u = true;
        this.o.y[class07211.field_11036.L()].u = true;
        this.o.y[class07211.field_11034.L()].y[class07211.field_11036.L()].u = true;
        this.o.y[class07211.field_11043.L()].y[class07211.field_11036.L()].u = true;
        this.o.y[class07211.field_11034.L()].y[class07211.field_11043.L()].y[class07211.field_11036.L()].u = true;
        ObjectArrayList objectArrayList = new ObjectArrayList();
        for (class07211 class072112 : class06433Array) {
            if (class072112 == null) continue;
            class072112.N();
            objectArrayList.add((Object)class072112);
        }
        class064332.N();
        class07536.L((List)objectArrayList, (class06069)class060692);
        int n9 = 1;
        for (class06433 class064335 : objectArrayList) {
            int n10 = 0;
            for (n3 = 0; n10 < 2 && n3 < 5; ++n3) {
                n2 = class060692.y(6);
                if (!class064335.L[n2]) continue;
                n = class07211.N((int)n2).b().L();
                class064335.L[n2] = false;
                class064335.y[n2].L[n] = false;
                if (class064335.N(n9++) && class064335.y[n2].N(n9++)) {
                    ++n10;
                    continue;
                }
                class064335.L[n2] = true;
                class064335.y[n2].L[n] = true;
            }
        }
        objectArrayList.add((Object)class064332);
        objectArrayList.add((Object)class064333);
        objectArrayList.add((Object)class064334);
        return objectArrayList;
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        int n;
        int n2 = Math.max(class059742.method_8615(), 64) - this.k.Z();
        this.N(class059742, class051632, 0, 0, 0, 58, n2, 58);
        this.N(false, 0, class059742, class060692, class051632);
        this.N(true, 33, class059742, class060692, class051632);
        this.N(class059742, class060692, class051632);
        this.y(class059742, class060692, class051632);
        this.L(class059742, class060692, class051632);
        this.u(class059742, class060692, class051632);
        this.i(class059742, class060692, class051632);
        this.R(class059742, class060692, class051632);
        for (n = 0; n < 7; ++n) {
            int n3 = 0;
            while (n3 < 7) {
                if (n3 == 0 && n == 3) {
                    n3 = 6;
                }
                int n4 = n * 9;
                int n5 = n3 * 9;
                for (int i = 0; i < 4; ++i) {
                    for (int j = 0; j < 4; ++j) {
                        this.L(class059742, L, n4 + i, 0, n5 + j, class051632);
                        this.N(class059742, L, n4 + i, -1, n5 + j, class051632);
                    }
                }
                if (n == 0 || n == 6) {
                    ++n3;
                    continue;
                }
                n3 += 6;
            }
        }
        for (n = 0; n < 5; ++n) {
            this.N(class059742, class051632, -1 - n, 0 + n * 2, -1 - n, -1 - n, 23, 58 + n);
            this.N(class059742, class051632, 58 + n, 0 + n * 2, -1 - n, 58 + n, 23, 58 + n);
            this.N(class059742, class051632, 0 - n, 0 + n * 2, -1 - n, 57 + n, 23, -1 - n);
            this.N(class059742, class051632, 0 - n, 0 + n * 2, 58 + n, 57 + n, 23, 58 + n);
        }
        for (class06476 class064762 : this.q) {
            if (!class064762.L().N(class051632)) continue;
            class064762.N(class059742, class053242, class080882, class060692, class051632, class073212, class072092);
        }
    }

    private void N(boolean bl, int n, class05974 class059742, class06069 class060692, class05163 class051632) {
        int n2 = 24;
        if (this.N(class051632, n, 0, n + 23, 20)) {
            int n3;
            int n4;
            this.N(class059742, class051632, n + 0, 0, 0, n + 24, 0, 20, y, y, false);
            this.N(class059742, class051632, n + 0, 1, 0, n + 24, 10, 20);
            for (n4 = 0; n4 < 4; ++n4) {
                this.N(class059742, class051632, n + n4, n4 + 1, n4, n + n4, n4 + 1, 20, L, L, false);
                this.N(class059742, class051632, n + n4 + 7, n4 + 5, n4 + 7, n + n4 + 7, n4 + 5, 20, L, L, false);
                this.N(class059742, class051632, n + 17 - n4, n4 + 5, n4 + 7, n + 17 - n4, n4 + 5, 20, L, L, false);
                this.N(class059742, class051632, n + 24 - n4, n4 + 1, n4, n + 24 - n4, n4 + 1, 20, L, L, false);
                this.N(class059742, class051632, n + n4 + 1, n4 + 1, n4, n + 23 - n4, n4 + 1, n4, L, L, false);
                this.N(class059742, class051632, n + n4 + 8, n4 + 5, n4 + 7, n + 16 - n4, n4 + 5, n4 + 7, L, L, false);
            }
            this.N(class059742, class051632, n + 4, 4, 4, n + 6, 4, 20, y, y, false);
            this.N(class059742, class051632, n + 7, 4, 4, n + 17, 4, 6, y, y, false);
            this.N(class059742, class051632, n + 18, 4, 4, n + 20, 4, 20, y, y, false);
            this.N(class059742, class051632, n + 11, 8, 11, n + 13, 8, 20, y, y, false);
            this.L(class059742, i, n + 12, 9, 12, class051632);
            this.L(class059742, i, n + 12, 9, 15, class051632);
            this.L(class059742, i, n + 12, 9, 18, class051632);
            n4 = n + (bl ? 19 : 5);
            int n5 = n + (bl ? 5 : 19);
            for (n3 = 20; n3 >= 5; n3 -= 3) {
                this.L(class059742, i, n4, 5, n3, class051632);
            }
            for (n3 = 19; n3 >= 7; n3 -= 3) {
                this.L(class059742, i, n5, 5, n3, class051632);
            }
            for (n3 = 0; n3 < 4; ++n3) {
                int n6 = bl ? n + 24 - (17 - n3 * 3) : n + 17 - n3 * 3;
                this.L(class059742, i, n6, 5, 5, class051632);
            }
            this.L(class059742, i, n5, 5, 5, class051632);
            this.N(class059742, class051632, n + 11, 1, 12, n + 13, 7, 12, y, y, false);
            this.N(class059742, class051632, n + 12, 1, 11, n + 12, 7, 13, y, y, false);
        }
    }

    private void N(class05974 class059742, class06069 class060692, class05163 class051632) {
        if (this.N(class051632, 22, 5, 35, 17)) {
            this.N(class059742, class051632, 25, 0, 0, 32, 8, 20);
            for (int i = 0; i < 4; ++i) {
                this.N(class059742, class051632, 24, 2, 5 + i * 4, 24, 4, 5 + i * 4, L, L, false);
                this.N(class059742, class051632, 22, 4, 5 + i * 4, 23, 4, 5 + i * 4, L, L, false);
                this.L(class059742, L, 25, 5, 5 + i * 4, class051632);
                this.L(class059742, L, 26, 6, 5 + i * 4, class051632);
                this.L(class059742, R, 26, 5, 5 + i * 4, class051632);
                this.N(class059742, class051632, 33, 2, 5 + i * 4, 33, 4, 5 + i * 4, L, L, false);
                this.N(class059742, class051632, 34, 4, 5 + i * 4, 35, 4, 5 + i * 4, L, L, false);
                this.L(class059742, L, 32, 5, 5 + i * 4, class051632);
                this.L(class059742, L, 31, 6, 5 + i * 4, class051632);
                this.L(class059742, R, 31, 5, 5 + i * 4, class051632);
                this.N(class059742, class051632, 27, 6, 5 + i * 4, 30, 6, 5 + i * 4, y, y, false);
            }
        }
    }

    private void R(class05974 class059742, class06069 class060692, class05163 class051632) {
        int n;
        if (this.N(class051632, 14, 21, 20, 43)) {
            this.N(class059742, class051632, 14, 0, 21, 20, 0, 43, y, y, false);
            this.N(class059742, class051632, 14, 1, 22, 20, 14, 43);
            this.N(class059742, class051632, 18, 12, 22, 20, 12, 39, y, y, false);
            this.N(class059742, class051632, 18, 12, 21, 20, 12, 21, L, L, false);
            for (n = 0; n < 4; ++n) {
                this.N(class059742, class051632, n + 14, n + 9, 21, n + 14, n + 9, 43 - n, L, L, false);
            }
            for (n = 23; n <= 39; n += 3) {
                this.L(class059742, i, 19, 13, n, class051632);
            }
        }
        if (this.N(class051632, 37, 21, 43, 43)) {
            this.N(class059742, class051632, 37, 0, 21, 43, 0, 43, y, y, false);
            this.N(class059742, class051632, 37, 1, 22, 43, 14, 43);
            this.N(class059742, class051632, 37, 12, 22, 39, 12, 39, y, y, false);
            this.N(class059742, class051632, 37, 12, 21, 39, 12, 21, L, L, false);
            for (n = 0; n < 4; ++n) {
                this.N(class059742, class051632, 43 - n, n + 9, 21, 43 - n, n + 9, 43 - n, L, L, false);
            }
            for (n = 23; n <= 39; n += 3) {
                this.L(class059742, i, 38, 13, n, class051632);
            }
        }
        if (this.N(class051632, 15, 37, 42, 43)) {
            this.N(class059742, class051632, 21, 0, 37, 36, 0, 43, y, y, false);
            this.N(class059742, class051632, 21, 1, 37, 36, 14, 43);
            this.N(class059742, class051632, 21, 12, 37, 36, 12, 39, y, y, false);
            for (n = 0; n < 4; ++n) {
                this.N(class059742, class051632, 15 + n, n + 9, 43 - n, 42 - n, n + 9, 43 - n, L, L, false);
            }
            for (n = 21; n <= 36; n += 3) {
                this.L(class059742, i, n, 13, 38, class051632);
            }
        }
    }
}

