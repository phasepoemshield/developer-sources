/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02071
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class03695
 *  minecraft.class04161
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05725
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02071;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class03695;
import minecraft.class04161;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05725;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;

public abstract class class04430
extends class05096 {
    private static final int y = 100;
    private final class00392 L;
    private final @Nullable class00392 u;
    private final class00392 i;
    protected @Nullable class05725 N;
    private @Nullable class04161 R;
    private final class02077 M;

    protected class04430(class00392 class003922, class00392 class003923, class00392 class003924) {
        this(class003922, class003923, null, class003924);
    }

    protected class04430(class00392 class003922, class00392 class003923, @Nullable class00392 class003924, class00392 class003925) {
        super(class003922);
        this.L = class003923;
        this.u = class003924;
        this.i = class003925;
        this.M = new class02077(0, 0, this.field_22789, this.field_22790);
    }

    protected abstract class03695 N();

    public void method_25426() {
        class01885 class018852 = (class01885)this.M.N((class02102)class01885.u().N(8));
        class018852.L().y();
        class018852.N((class02102)new class02071(this.method_25440(), this.field_22793));
        this.R = (class04161)class018852.N((class02102)new class04161(0, 0, this.field_22789 - 100, this.field_22790 - 100, this.L, this.field_22793), (T class020722) -> class020722.N(12));
        class01885 class018853 = (class01885)class018852.N((class02102)class01885.u().N(8));
        class018853.L().y();
        if (this.u != null) {
            this.N = (class05725)class018853.N((class02102)class05725.y((class00392)this.u, (class01590)this.field_22793).N());
        }
        class018853.N((class02102)this.N());
        this.M.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_48640() {
        if (this.R != null) {
            this.R.method_25358(this.field_22789 - 100);
            this.R.method_53533(this.field_22790 - 100);
            this.R.y();
        }
        this.M.N();
        class02077.N((class02102)this.M, (class03255)this.method_48202());
    }

    public class00392 method_25435() {
        return this.i;
    }
}

