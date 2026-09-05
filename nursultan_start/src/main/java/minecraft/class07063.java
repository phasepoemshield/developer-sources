/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00737
 *  minecraft.class03556
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05018
 *  minecraft.class06889
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class00737;
import minecraft.class03556;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public final class class07063 {
    public static boolean L(class07438 class074382) {
        return class074382.method_6059(class07047.W) || class074382.method_6059(class07047.Q) || class074382.method_6059(class07047.c);
    }

    public static boolean u(class07438 class074382) {
        return !class074382.method_6059(class07047.c) || class074382.method_6059(class07047.W) || class074382.method_6059(class07047.Q);
    }

    public static int y(class07438 class074382) {
        int n = 0;
        int n2 = 0;
        if (class074382.method_6059(class07047.L)) {
            n = class074382.method_6112(class07047.L).i();
        }
        if (class074382.method_6059(class07047.Q)) {
            n2 = class074382.method_6112(class07047.Q).i();
        }
        return Math.max(n, n2);
    }

    public static List<class04770> N(class04782 class047822, @Nullable class07049 class070492, class06889 class068892, double d, class07055 class070552, int n) {
        class03556<class07084> var7 = class070552.L();
        List var8 = class047822.method_18766(class047702 -> !(!class047702.field_13974.u() || class070492 != null && class070492.method_5722((class07049)class047702) || !class068892.N((class00737)class047702.method_73189(), d) || class047702.method_6059(var7) && class047702.method_6112(var7).i() >= class070552.i() && !class047702.method_6112(var7).N(n - 1)));
        var8.forEach(class047702 -> class047702.method_37222(new class07055(class070552), class070492));
        return var8;
    }

    public static boolean N(class07438 class074382) {
        return class074382.method_6059(class07047.L) || class074382.method_6059(class07047.Q);
    }

    public static class00392 N(class07055 class070552, float f, float f2) {
        if (class070552.y()) {
            return class00392.L((String)"effect.duration.infinite");
        }
        return class00392.y((String)class05018.N((int)class04995.y((float)((float)class070552.u() * f)), (float)f2));
    }
}

