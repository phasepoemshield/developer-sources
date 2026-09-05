/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00429
 *  minecraft.class00457
 *  minecraft.class00465
 *  minecraft.class00753
 *  minecraft.class01383
 *  minecraft.class01445
 *  minecraft.class01857
 *  minecraft.class02566
 *  minecraft.class05375
 *  minecraft.class06724
 *  minecraft.class06747
 *  minecraft.class07209
 *  minecraft.class07529
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import minecraft.class00429;
import minecraft.class00457;
import minecraft.class00465;
import minecraft.class00753;
import minecraft.class01383;
import minecraft.class01445;
import minecraft.class01857;
import minecraft.class02566;
import minecraft.class05375;
import minecraft.class06724;
import minecraft.class06747;
import minecraft.class07209;
import minecraft.class07529;

public class class06972
implements class01857 {
    private static final int N = 30;
    private static final float y = 0.32f;
    private static final int L = -23296;
    private final class05375 u;

    public class06972(class05375 class053752) {
        this.u = class053752;
    }

    private List<String> N(class00465 class004652, boolean bl, class00457 class004572) {
        ArrayList<String> arrayList = new ArrayList<String>();
        class004572.L(class00429.L, (class070492, class004342) -> {
            if (bl ? class004342.y(class004652.N()) : class004342.N(class004652.N())) {
                arrayList.add(class01445.N((UUID)class070492.method_5667()));
            }
        });
        return arrayList;
    }

    private static void N(String string, class00465 class004652, int n, int n2) {
        class06724.N((String)string, (class07209)class004652.N(), (int)n, (int)n2, (float)0.32f);
    }

    public void N(double d, double d2, double d3, class00457 class004572, class01383 class013832, float f) {
        class07209 class072092 = class07209.method_49637((double)d, (double)d2, (double)d3);
        class004572.y(class00429.Z, (class072093, class004652) -> {
            if (class072092.method_19771((class00753)class072093, 30.0)) {
                class06972.N(class072093);
                this.N((class00465)class004652, class004572);
            }
        });
        this.u.N(class004572).forEach((class072093, list) -> {
            if (class004572.N(class00429.Z, class072093) != null) {
                return;
            }
            if (class072092.method_19771((class00753)class072093, 30.0)) {
                this.N((class07209)class072093, (List<String>)list);
            }
        });
    }

    private static void N(class07209 class072092) {
        float f = 0.05f;
        class06724.N((class07209)class072092, (float)0.05f, (class06747)class06747.y((int)class02566.N((float)0.3f, (float)0.2f, (float)0.2f, (float)1.0f)));
    }

    private void N(class07209 class072092, List<String> list) {
        float f = 0.05f;
        class06724.N((class07209)class072092, (float)0.05f, (class06747)class06747.y((int)class02566.N((float)0.3f, (float)0.2f, (float)0.2f, (float)1.0f)));
        class06724.N((String)list.toString(), (class07209)class072092, (int)0, (int)-256, (float)0.32f);
        class06724.N((String)"Ghost POI", (class07209)class072092, (int)1, (int)-65536, (float)0.32f);
    }

    private void N(class00465 class004652, class00457 class004572) {
        int n = 0;
        if (class07529.p) {
            List<String> var4 = this.N(class004652, false, class004572);
            if (var4.size() < 4) {
                class06972.N("Owners: " + String.valueOf(var4), class004652, n, -256);
            } else {
                class06972.N(var4.size() + " ticket holders", class004652, n, -256);
            }
            ++n;
            List<String> var5 = this.N(class004652, true, class004572);
            if (var5.size() < 4) {
                class06972.N("Candidates: " + String.valueOf(var5), class004652, n, -23296);
            } else {
                class06972.N(var5.size() + " potential owners", class004652, n, -23296);
            }
            ++n;
        }
        class06972.N("Free tickets: " + class004652.L(), class004652, n, -256);
        class06972.N(class004652.y().M(), class004652, ++n, -1);
    }
}

