/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import java.util.Iterator;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class07209;

public interface class01108<T extends Enum<T>> {
    public static final int m_ = 4;

    default public Optional<class00500> L(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class07209 class072093;
        int n = ((Enum)this.i()).ordinal();
        int n2 = 0;
        int n3 = 0;
        Iterator var8 = class07209.method_25996((class07209)class072092, (int)4, (int)4, (int)4).iterator();
        while (var8.hasNext() && (class072093 = (class07209)var8.next()).method_19455((class00753)class072092) <= 4) {
            Object object;
            if (class072093.equals((Object)class072092) || !((object = class047822.method_8320(class072093).i()) instanceof class01108)) continue;
            object = ((class01108)object).i();
            if (this.i().getClass() != object.getClass()) continue;
            int n4 = ((Enum)object).ordinal();
            if (n4 < n) {
                return Optional.empty();
            }
            if (n4 > n) {
                ++n3;
                continue;
            }
            ++n2;
        }
        float f = (float)(n3 + 1) / (float)(n3 + n2 + 1);
        float f2 = f * f * this.J_();
        if (class060692.z() < f2) {
            return this.h_(class005002);
        }
        return Optional.empty();
    }

    public T i();

    default public void a_(class00500 class005003, class04782 class047822, class07209 class072092, class06069 class060692) {
        float f = 0.05688889f;
        if (class060692.z() < 0.05688889f) {
            this.L(class005003, class047822, class072092, class060692).ifPresent(class005002 -> class047822.method_8501(class072092, class005002));
        }
    }

    public float J_();

    public Optional<class00500> h_(class00500 var1);
}

