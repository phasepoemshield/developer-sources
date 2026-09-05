/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10791
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.LinkedHashMultiset
 *  com.google.common.collect.Multiset
 *  com.google.common.collect.Multisets
 *  minecraft.class00500
 *  minecraft.class00570
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class01296
 *  minecraft.class02265
 *  minecraft.class02484
 *  minecraft.class02705
 *  minecraft.class03556
 *  minecraft.class03557
 *  minecraft.class04659
 *  minecraft.class04688
 *  minecraft.class04689
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class06501
 *  minecraft.class07043
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07769
 *  minecraft.class07830
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10791;
import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import minecraft.class00500;
import minecraft.class00570;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class01296;
import minecraft.class02265;
import minecraft.class02484;
import minecraft.class02705;
import minecraft.class03556;
import minecraft.class03557;
import minecraft.class04659;
import minecraft.class04688;
import minecraft.class04689;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class06501;
import minecraft.class06570;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07043;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07769;
import minecraft.class07830;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class06548
extends class06581 {
    public static final int N = 128;
    public static final int y = 128;

    public class06548(class06573 class065732) {
        super(class065732);
    }

    public static @Nullable class07769 y(class06584 class065842, class07299 class072992) {
        return class06548.N((class02265)class065842.method_58694(class02484.f), class072992);
    }

    private static void y(class06584 class065842, class04782 class047822) {
        class07769 class077692 = class06548.y(class065842, (class07299)class047822);
        if (class077692 != null) {
            class02265 class022652 = class047822.method_17889();
            class07769 class077693 = class077692.N();
            class047822.method_17890(class022652, class077693);
            class065842.N(class02484.f, class022652);
        }
    }

    public static void N(class04782 class047822, class06584 class065842) {
        int n;
        int n2;
        class07769 class077692 = class06548.y(class065842, (class07299)class047822);
        if (class077692 == null) {
            return;
        }
        if (class047822.method_27983() != class077692.R) {
            return;
        }
        int n3 = 1 << class077692.M;
        int n4 = class077692.u;
        int n5 = class077692.i;
        boolean[] blArray = new boolean[16384];
        int n6 = n4 / n3 - 64;
        int n7 = n5 / n3 - 64;
        class07218 class072182 = new class07218();
        for (n2 = 0; n2 < 128; ++n2) {
            for (n = 0; n < 128; ++n) {
                class03556 var12 = class047822.i((class07209)class072182.N((n6 + n) * n3, 0, (n7 + n2) * n3));
                blArray[n2 * 128 + n] = var12.N(class03557.r);
            }
        }
        for (n2 = 1; n2 < 127; ++n2) {
            for (n = 1; n < 127; ++n) {
                int n8 = 0;
                for (int i = -1; i < 2; ++i) {
                    for (int j = -1; j < 2; ++j) {
                        if (i == 0 && j == 0 || !class06548.N(blArray, n2 + i, n + j)) continue;
                        ++n8;
                    }
                }
                class04659 class046592 = class04659.field_34762;
                class04689 class046892 = class04689.N;
                if (class06548.N(blArray, n2, n)) {
                    class046892 = class04689.s;
                    if (n8 > 7 && n % 2 == 0) {
                        switch ((n2 + (int)(class04995.m((double)((float)n + 0.0f)) * 7.0f)) / 8 % 5) {
                            case 0: 
                            case 4: {
                                class046592 = class04659.field_34759;
                                break;
                            }
                            case 1: 
                            case 3: {
                                class046592 = class04659.field_34760;
                                break;
                            }
                            case 2: {
                                class046592 = class04659.field_34761;
                            }
                        }
                    } else if (n8 > 7) {
                        class046892 = class04689.N;
                    } else if (n8 > 5) {
                        class046592 = class04659.field_34760;
                    } else if (n8 > 3) {
                        class046592 = class04659.field_34759;
                    } else if (n8 > 1) {
                        class046592 = class04659.field_34759;
                    }
                } else if (n8 > 0) {
                    class046892 = class04689.k;
                    class046592 = n8 > 3 ? class04659.field_34760 : class04659.field_34762;
                }
                if (class046892 == class04689.N) continue;
                class077692.y(n2, n, class046892.y(class046592));
            }
        }
    }

    @Override
    public void N(class06584 class065842, class04782 class047822, class07049 class070492, @Nullable class07085 class070852) {
        class07769 class077692 = class06548.y(class065842, (class07299)class047822);
        if (class077692 == null) {
            return;
        }
        if (class070492 instanceof class08036) {
            class08036 class080362 = (class08036)class070492;
            class077692.N(class080362, class065842);
        }
        if (!class077692.Z && class070852 != null && class070852.N() == class07043.field_6177) {
            this.N((class07299)class047822, class070492, class077692);
        }
    }

    @Override
    public void N(class06584 class065842, class07299 class072992) {
        class02705 class027052 = (class02705)class065842.y(class02484.S);
        if (class027052 == null) {
            return;
        }
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            switch (class027052) {
                case field_49353: {
                    class06548.y(class065842, class047822);
                    break;
                }
                case field_49354: {
                    class06548.N(class065842, class047822);
                }
            }
        }
    }

    private static void N(class06584 class065842, class04782 class047822) {
        class07769 class077692 = class06548.y(class065842, (class07299)class047822);
        if (class077692 != null) {
            class02265 class022652 = class047822.method_17889();
            class047822.method_17890(class022652, class077692.y());
            class065842.N(class02484.f, class022652);
        }
    }

    @Override
    public class07082 N(class06501 class065012) {
        if (class065012.method_8045().method_8320(class065012.method_8037()).N(class01210.NG)) {
            class07769 class077692;
            if (!class065012.method_8045().method_8608() && (class077692 = class06548.y(class065012.method_8041(), class065012.method_8045())) != null && !class077692.N((class07284)class065012.method_8045(), class065012.method_8037())) {
                return class07082.u;
            }
            return class07082.N;
        }
        return super.N(class065012);
    }

    public static class06584 N(class04782 class047822, int n, int n2, byte by, boolean bl, boolean bl2) {
        class06584 class065842 = new class06584(class06570.vh);
        class02265 class022652 = class06548.N(class047822, n, n2, by, bl, bl2, (class05946<class07299>)class047822.method_27983());
        class065842.N(class02484.f, class022652);
        return class065842;
    }

    public static @Nullable class07769 N(@Nullable class02265 class022652, class07299 class072992) {
        return class022652 == null ? null : class072992.method_17891(class022652);
    }

    private static class02265 N(class04782 class047822, int n, int n2, int n3, boolean bl, boolean bl2, class05946<class07299> class059462) {
        class07769 class077692 = class07769.N((double)n, (double)n2, (byte)((byte)n3), (boolean)bl, (boolean)bl2, class059462);
        class02265 class022652 = class047822.method_17889();
        class047822.method_17890(class022652, class077692);
        return class022652;
    }

    public void N(class07299 class072992, class07049 class070492, class07769 class077692) {
        if (class072992.method_27983() != class077692.R || !(class070492 instanceof class08036)) {
            return;
        }
        int n = 1 << class077692.M;
        int n2 = class077692.u;
        int n3 = class077692.i;
        int n4 = class04995.N((double)(class070492.method_23317() - (double)n2)) / n + 64;
        int n5 = class04995.N((double)(class070492.method_23321() - (double)n3)) / n + 64;
        int n6 = 128 / n;
        if (class072992.method_8597().R()) {
            n6 /= 2;
        }
        class10791 class107912 = class077692.N((class08036)class070492);
        ++class107912.y;
        class07218 class072182 = new class07218();
        class07218 class072183 = new class07218();
        boolean bl = false;
        for (int i = n4 - n6 + 1; i < n4 + n6; ++i) {
            if ((i & 0xF) != (class107912.y & 0xF) && !bl) continue;
            bl = false;
            double d = 0.0;
            for (int j = n5 - n6 - 1; j < n5 + n6; ++j) {
                double d2;
                if (i < 0 || j < -1 || i >= 128 || j >= 128) continue;
                int n7 = class04995.Z((int)(i - n4)) + class04995.Z((int)(j - n5));
                boolean bl2 = n7 > (n6 - 2) * (n6 - 2);
                int n8 = (n2 / n + i - 64) * n;
                int n9 = (n3 / n + j - 64) * n;
                LinkedHashMultiset linkedHashMultiset = LinkedHashMultiset.create();
                class00570 class005702 = class072992.method_8497(class01296.N((int)n8), class01296.N((int)n9));
                if (class005702.O()) continue;
                int n10 = 0;
                double d3 = 0.0;
                if (class072992.method_8597().R()) {
                    var27_26 = n8 + n9 * 231871;
                    if (((var27_26 = var27_26 * var27_26 * 31287121 + var27_26 * 11) >> 20 & 1) == 0) {
                        linkedHashMultiset.add((Object)class00869.z.W().N((class07290)class072992, class07209.field_10980), 10);
                    } else {
                        linkedHashMultiset.add((Object)class00869.y.W().N((class07290)class072992, class07209.field_10980), 100);
                    }
                    d3 = 100.0;
                } else {
                    for (var27_26 = 0; var27_26 < n; ++var27_26) {
                        for (int k = 0; k < n; ++k) {
                            class00500 class005002;
                            class072182.N(n8 + var27_26, 0, n9 + k);
                            int n11 = class005702.N(class07830.field_13202, class072182.method_10263(), class072182.method_10260()) + 1;
                            if (n11 > class072992.method_31607()) {
                                do {
                                    class072182.method_10099(--n11);
                                } while ((class005002 = class005702.method_8320((class07209)class072182)).N((class07290)class072992, (class07209)class072182) == class04689.N && n11 > class072992.method_31607());
                                if (n11 > class072992.method_31607() && !class005002.Y().W()) {
                                    class00500 class005003;
                                    int n12 = n11 - 1;
                                    class072183.N((class00753)class072182);
                                    do {
                                        class072183.method_10099(n12--);
                                        class005003 = class005702.method_8320((class07209)class072183);
                                        ++n10;
                                    } while (n12 > class072992.method_31607() && !class005003.Y().W());
                                    class005002 = this.N(class072992, class005002, (class07209)class072182);
                                }
                            } else {
                                class005002 = class00869.q.W();
                            }
                            class077692.N((class07290)class072992, class072182.method_10263(), class072182.method_10260());
                            d3 += (double)n11 / (double)(n * n);
                            linkedHashMultiset.add((Object)class005002.N((class07290)class072992, (class07209)class072182));
                        }
                    }
                }
                class04689 class046892 = (class04689)Iterables.getFirst((Iterable)Multisets.copyHighestCountFirst((Multiset)linkedHashMultiset), (Object)class04689.N);
                class04659 class046592 = class046892 == class04689.W ? ((d2 = (double)(n10 /= n * n) * 0.1 + (double)(i + j & 1) * 0.2) < 0.5 ? class04659.field_34761 : (d2 > 0.9 ? class04659.field_34759 : class04659.field_34760)) : ((d2 = (d3 - d) * 4.0 / (double)(n + 4) + ((double)(i + j & 1) - 0.5) * 0.4) > 0.6 ? class04659.field_34761 : (d2 < -0.6 ? class04659.field_34759 : class04659.field_34760));
                d = d3;
                if (j < 0 || n7 >= n6 * n6 || bl2 && (i + j & 1) == 0) continue;
                bl |= class077692.N(i, j, class046892.y(class046592));
            }
        }
    }

    private class00500 N(class07299 class072992, class00500 class005002, class07209 class072092) {
        class04688 class046882 = class005002.Y();
        if (!class046882.W() && !class005002.L((class07290)class072992, class072092, class07211.field_11036)) {
            return class046882.B();
        }
        return class005002;
    }

    private static boolean N(boolean[] blArray, int n, int n2) {
        return blArray[n2 * 128 + n];
    }
}

