/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10192
 *  Nursultan.class10194
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class03054
 *  minecraft.class03249
 *  minecraft.class03384
 *  minecraft.class03385
 *  minecraft.class03389
 *  minecraft.class03404
 *  minecraft.class03412
 *  minecraft.class03413
 *  minecraft.class03417
 *  minecraft.class04995
 *  minecraft.class05724
 *  minecraft.class06202
 *  minecraft.class06601
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10192;
import Nursultan.class10194;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class03054;
import minecraft.class03249;
import minecraft.class03384;
import minecraft.class03385;
import minecraft.class03389;
import minecraft.class03404;
import minecraft.class03412;
import minecraft.class03413;
import minecraft.class03417;
import minecraft.class04995;
import minecraft.class05724;
import minecraft.class06202;
import minecraft.class06601;
import org.jspecify.annotations.Nullable;

public class class03383
extends class05724<class03404>
implements class03385 {
    public static final int N = 16;
    private @Nullable class03389 L;
    public final /* synthetic */ class03417 y;

    public int L() {
        int n = this.method_55443();
        Objects.requireNonNull(class03417.N((class03417)this.y));
        return n + 9;
    }

    public class03383(class03417 class034172, class06202 class062022, int n) {
        this.y = class034172;
        super(class062022, class034172.field_22789, class034172.field_22790 - n - 80, 40, 16);
    }

    private boolean y(class03404 class034042) {
        if (class034042.y()) {
            boolean bl = this.method_25334() == class034042;
            boolean bl2 = this.method_25334() == null;
            boolean bl3 = this.method_37019() == class034042;
            return bl || bl2 && bl3 && class034042.L();
        }
        return false;
    }

    public int y() {
        return class04995.R((int)this.field_22759, (int)16);
    }

    protected @Nullable class03404 method_48197(class03249 class032492) {
        return (class03404)this.method_48198(class032492, class03404::y);
    }

    public void method_25313(@Nullable class03404 class034042) {
        super.method_25313((class01202)class034042);
        if (this.method_48197(class03249.field_41826) == null) {
            this.y.N();
        }
    }

    public void N(int n, class03412 class034122) {
        boolean bl = class034122.N(this.y.y.R());
        class03054 class030542 = class034122.B().N(class034122.M());
        class03384 class033842 = new class03384(this, n, class034122.N(), class034122.y(), class030542, bl, true);
        this.method_44399((class01202)class033842);
        this.N(class034122, bl);
    }

    private void N(class03412 class034122, boolean bl) {
        class10192 class101922 = new class10192(this, class034122.R(), class034122.L(), bl);
        this.method_44399((class01202)class101922);
        class03389 class033892 = new class03389(class034122.u(), (class03404)class101922);
        if (this.L != null && this.L.N(class033892)) {
            this.method_44650((class01202)this.L.y());
        }
        this.L = class033892;
    }

    public static /* synthetic */ class06202 N(class03383 class033832) {
        return class033832.field_22740;
    }

    public void N(class00392 class003922) {
        this.method_44399((class01202)new class10194());
        this.method_44399((class01202)new class03413(this, class003922));
        this.method_44399((class01202)new class10194());
        this.L = null;
    }

    protected void method_44397(class01054 class010542, int n, int n2, float f, class03404 class034042) {
        if (this.y(class034042)) {
            boolean bl = this.method_25334() == class034042;
            int n3 = this.method_25370() && bl ? -1 : -8355712;
            this.method_44398(class010542, (class01202)class034042, n3);
        }
        class034042.method_25343(class010542, n, n2, this.method_37019() == class034042, f);
    }

    public boolean method_25404(class06601 class066012) {
        class03404 class034042 = (class03404)this.method_25334();
        if (class034042 != null && class034042.method_25404(class066012)) {
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_44382(double d) {
        double d2 = this.method_44387();
        super.method_44382(d);
        if ((float)this.method_44390() > 1.0E-5f && d <= (double)1.0E-5f && !class04995.y((double)d, (double)d2)) {
            this.y.N();
        }
    }

    public int method_25322() {
        return Math.min(350, this.field_22758 - 50);
    }
}

