/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00966
 *  minecraft.class00974
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class02566
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class06889
 *  minecraft.class06890
 *  minecraft.class06959
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class08141
 *  minecraft.class08592
 *  minecraft.class08597
 *  minecraft.class08623
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00966;
import minecraft.class00974;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class02566;
import minecraft.class03358;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class06889;
import minecraft.class06890;
import minecraft.class06959;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class08141;
import minecraft.class08592;
import minecraft.class08597;
import minecraft.class08623;
import org.jspecify.annotations.Nullable;

public class class03356<T extends class00394>
implements class03358<T, class00974> {
    public static final int N = class02566.N((float)0.2f, (float)0.75f, (float)0.75f, (float)1.0f);

    private void y(class00974 class009742, class07209 class072092, class00753 class007532) {
        if (class009742.i == null) {
            return;
        }
        class06890 class068902 = new class06890(class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
        for (int i = 0; i < class007532.method_10263(); ++i) {
            for (int j = 0; j < class007532.method_10264(); ++j) {
                for (int k = 0; k < class007532.method_10260(); ++k) {
                    int n4 = k * class007532.method_10263() * class007532.method_10264() + j * class007532.method_10263() + i;
                    if (!class009742.i[n4]) continue;
                    class068902.method_1049(i, j, k);
                }
            }
        }
        class068902.method_1046((class072112, n, n2, n3) -> {
            float f = 0.48f;
            float f2 = (float)(n + class072092.method_10263()) + 0.5f - 0.48f;
            float f3 = (float)(n2 + class072092.method_10264()) + 0.5f - 0.48f;
            float f4 = (float)(n3 + class072092.method_10260()) + 0.5f - 0.48f;
            float f5 = (float)(n + class072092.method_10263()) + 0.5f + 0.48f;
            float f6 = (float)(n2 + class072092.method_10264()) + 0.5f + 0.48f;
            float f7 = (float)(n3 + class072092.method_10260()) + 0.5f + 0.48f;
            class06724.N((class06889)new class06889((double)f2, (double)f3, (double)f4), (class06889)new class06889((double)f5, (double)f6, (double)f7), (class07211)class072112, (class06747)class06747.y((int)N));
        });
    }

    @Override
    public void N(T t, class00974 class009742, float f, class06889 class068892, @Nullable class08141 class081412) {
        class03358.super.N(t, class009742, f, class068892, class081412);
        class03356.N(t, class009742);
    }

    public static <T extends class00394> void N(T t, class00974 class009742) {
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        class009742.N = class044532.method_7338() || class044532.method_7325();
        class009742.L = ((class08597)t).L();
        class009742.y = ((class08597)t).y();
        class07209 class072092 = class009742.L.N();
        class00753 class007532 = class009742.L.y();
        class07209 class072093 = class009742.R.method_10081((class00753)class072092);
        if (class009742.N && t.G() != null && class009742.y == class08592.field_55996) {
            class009742.u = new class00966[class007532.method_10263() * class007532.method_10264() * class007532.method_10260()];
            for (int i = 0; i < class007532.method_10263(); ++i) {
                for (int j = 0; j < class007532.method_10264(); ++j) {
                    for (int k = 0; k < class007532.method_10260(); ++k) {
                        int n = k * class007532.method_10263() * class007532.method_10264() + j * class007532.method_10263() + i;
                        class00500 class005002 = t.G().method_8320(class072093.method_10069(i, j, k));
                        if (class005002.P()) {
                            class009742.u[n] = class00966.field_62683;
                            continue;
                        }
                        if (class005002.N(class00869.EK)) {
                            class009742.u[n] = class00966.field_62686;
                            continue;
                        }
                        if (class005002.N(class00869.ZX)) {
                            class009742.u[n] = class00966.field_62684;
                            continue;
                        }
                        if (!class005002.N(class00869.Za)) continue;
                        class009742.u[n] = class00966.field_62685;
                    }
                }
            }
        } else {
            class009742.u = null;
        }
        if (class009742.N) {
            // empty if block
        }
        class009742.i = null;
    }

    @Override
    public void N(class00974 class009742, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (!class009742.N) {
            return;
        }
        if (class009742.y == class08592.field_55994) {
            return;
        }
        class08623 class086232 = class009742.L;
        class07209 class072092 = class086232.N();
        class00753 class007532 = class086232.y();
        if (class007532.method_10263() < 1 || class007532.method_10264() < 1 || class007532.method_10260() < 1) {
            return;
        }
        float f = 1.0f;
        float f2 = 0.9f;
        class07209 class072093 = class072092.method_10081(class007532);
        class06724.N((class00734)new class00734((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), (double)class072093.method_10263(), (double)class072093.method_10264(), (double)class072093.method_10260()).N(class009742.R), (class06747)class06747.N((int)class02566.N((float)1.0f, (float)0.9f, (float)0.9f, (float)0.9f)), (boolean)true);
        this.N(class009742, class072092, class007532);
    }

    private void N(class00974 class009742, class07209 class072092, class00753 class007532) {
        if (class009742.u == null) {
            return;
        }
        class07209 class072093 = class009742.R.method_10081((class00753)class072092);
        for (int i = 0; i < class007532.method_10263(); ++i) {
            for (int j = 0; j < class007532.method_10264(); ++j) {
                for (int k = 0; k < class007532.method_10260(); ++k) {
                    int n = k * class007532.method_10263() * class007532.method_10264() + j * class007532.method_10263() + i;
                    class00966 class009662 = class009742.u[n];
                    if (class009662 == null) continue;
                    float f = class009662 == class00966.field_62683 ? 0.05f : 0.0f;
                    double d = (float)(class072093.method_10263() + i) + 0.45f - f;
                    double d2 = (float)(class072093.method_10264() + j) + 0.45f - f;
                    double d3 = (float)(class072093.method_10260() + k) + 0.45f - f;
                    double d4 = (float)(class072093.method_10263() + i) + 0.55f + f;
                    double d5 = (float)(class072093.method_10264() + j) + 0.55f + f;
                    double d6 = (float)(class072093.method_10260() + k) + 0.55f + f;
                    class00734 class007342 = new class00734(d, d2, d3, d4, d5, d6);
                    if (class009662 == class00966.field_62683) {
                        class06724.N((class00734)class007342, (class06747)class06747.N((int)class02566.N((float)1.0f, (float)0.5f, (float)0.5f, (float)1.0f)));
                        continue;
                    }
                    if (class009662 == class00966.field_62686) {
                        class06724.N((class00734)class007342, (class06747)class06747.N((int)class02566.N((float)1.0f, (float)1.0f, (float)0.75f, (float)0.75f)));
                        continue;
                    }
                    if (class009662 == class00966.field_62684) {
                        class06724.N((class00734)class007342, (class06747)class06747.N((int)-65536));
                        continue;
                    }
                    if (class009662 != class00966.field_62685) continue;
                    class06724.N((class00734)class007342, (class06747)class06747.N((int)-256));
                }
            }
        }
    }

    @Override
    public class00974 i() {
        return new class00974();
    }

    @Override
    public int u_() {
        return 96;
    }

    @Override
    public boolean t_() {
        return true;
    }
}

