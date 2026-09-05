/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class03711
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05936
 *  minecraft.class06086
 *  minecraft.class06513
 *  minecraft.class07296
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class03711;
import minecraft.class04650;
import minecraft.class04680;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05936;
import minecraft.class06086;
import minecraft.class06513;
import minecraft.class07296;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class04683
implements class04680 {
    private static final class01894 i = class01894.y((String)"toast/advancement");
    public static final int N = 5000;
    private final class03711 R;
    private class04650 M = class04650.field_2209;

    public class04683(class03711 class037112) {
        this.R = class037112;
    }

    private boolean B() {
        Optional var1 = this.R.y().L();
        return var1.isPresent() && ((class06513)var1.get()).i().equals((Object)class07296.field_1250);
    }

    @Override
    public class04650 i() {
        return this.M;
    }

    @Override
    public void N(class01054 class010542, class01590 class015902, long l) {
        int n;
        class06513 class065132 = this.R.y().L().orElse(null);
        class010542.N(class08394.Na, i, 0, 0, this.L(), this.u());
        if (class065132 == null) {
            return;
        }
        List var6 = class015902.L((class05936)class065132.N(), 125);
        int n2 = n = class065132.i() == class07296.field_1250 ? -30465 : -256;
        if (var6.size() == 1) {
            class010542.N(class015902, class065132.i().y(), 30, 7, n, false);
            class010542.N(class015902, (class01028)var6.get(0), 30, 18, -1, false);
        } else {
            int n3 = 1500;
            float f = 300.0f;
            if (l < 1500L) {
                int n4 = class04995.y((float)(class04995.N((float)((float)(1500L - l) / 300.0f), (float)0.0f, (float)1.0f) * 255.0f));
                class010542.N(class015902, class065132.i().y(), 30, 11, class02566.R((int)n4, (int)n), false);
            } else {
                int n5 = class04995.y((float)(class04995.N((float)((float)(l - 1500L) / 300.0f), (float)0.0f, (float)1.0f) * 252.0f));
                int n6 = this.u() / 2;
                int n7 = var6.size();
                Objects.requireNonNull(class015902);
                int n8 = n6 - n7 * 9 / 2;
                for (class01028 class010282 : var6) {
                    class010542.N(class015902, class010282, 30, n8, class02566.Z((int)n5), false);
                    Objects.requireNonNull(class015902);
                    n8 += 9;
                }
            }
        }
        class010542.y(class065132.L(), 8, 8);
    }

    @Override
    public void N(class06086 class060862, long l) {
        if ((class06513)this.R.y().L().orElse(null) == null) {
            this.M = class04650.field_2209;
            return;
        }
        this.M = (double)l >= 5000.0 * class060862.R() ? class04650.field_2209 : class04650.field_2210;
    }

    @Override
    public @Nullable class04891 I_() {
        return this.B() ? class04909.Oa : null;
    }
}

