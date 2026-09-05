/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class01315
 *  minecraft.class03448
 *  minecraft.class04531
 *  minecraft.class04540
 *  minecraft.class05630
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07209
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00737;
import minecraft.class00916;
import minecraft.class00931;
import minecraft.class01315;
import minecraft.class03448;
import minecraft.class04531;
import minecraft.class04540;
import minecraft.class05630;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07209;

public class class00933 {
    private static final int N = 512;
    private final List<class00916> y = new ArrayList<class00916>();

    public void N(class06889 class068892, float f, int n, class04540<class00931> class045402) {
        if (!class045402.L()) {
            this.y.add(new class00916(class068892, f, n, class045402));
        }
    }

    private void N(class03448 class034482, class00916 class009162) {
        float f;
        class06889 class068892;
        class06889 class068893;
        class06069 class060692 = class034482.method_8409();
        class06889 class068894 = class009162.N();
        class06889 class068895 = class068894.i(class068893 = (class068892 = new class06889((double)(class060692.z() * 2.0f - 1.0f), (double)(class060692.z() * 2.0f - 1.0f), (double)(class060692.z() * 2.0f - 1.0f)).u()).L((double)(f = (float)Math.cbrt(class060692.z()) * class009162.y())));
        if (!class034482.method_8320(class07209.method_49638((class00737)class068895)).P()) {
            return;
        }
        float f2 = 0.5f / (f / class009162.y() + 0.1f) * class060692.z() * class060692.z() + 0.3f;
        class00931 class009312 = (class00931)((Object)class009162.u().y(class060692));
        class06889 class068896 = class068894.i(class068893.L((double)class009312.y()));
        class06889 class068897 = class068892.L((double)(f2 * class009312.L()));
        class034482.method_8406(class009312.N(), class068896.N(), class068896.y(), class068896.L(), class068897.N(), class068897.y(), class068897.L());
    }

    public void N(class03448 class034482) {
        if (((class05630)class06202.Nq().i_7).NK().method_41753() != class01315.field_18197) {
            this.y.clear();
            return;
        }
        int n = class04531.N(this.y, class00916::L);
        int n2 = Math.min(n, 512);
        for (int i = 0; i < n2; ++i) {
            class04531.N((class06069)class034482.method_8409(), this.y, (int)n, class00916::L).ifPresent(class009162 -> this.N(class034482, (class00916)((Object)class009162)));
        }
        this.y.clear();
    }
}

