/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00783
 *  minecraft.class01763
 *  minecraft.class02682
 *  minecraft.class04425
 *  minecraft.class04604
 *  minecraft.class04995
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07955
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00783;
import minecraft.class01763;
import minecraft.class02682;
import minecraft.class04425;
import minecraft.class04604;
import minecraft.class04995;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07955;
import org.jspecify.annotations.Nullable;

public class class07886
extends class07955 {
    private final boolean N;
    private float W;
    private float m;

    protected boolean L() {
        return true;
    }

    public class07886(boolean bl) {
        this.N = bl;
    }

    private boolean y(@Nullable class01763 class017632, class01763 class017633) {
        return this.N(class017632, class017633) && class017632.E == class04425.field_18;
    }

    public class01763 y() {
        if (!this.u.method_5799()) {
            return super.y();
        }
        return this.N(new class07209(class04995.N((double)this.u.method_5829().N), class04995.N((double)(this.u.method_5829().y + 0.5)), class04995.N((double)this.u.method_5829().L)));
    }

    public class04425 N(class02682 class026822, int n, int n2, int n3) {
        if (class026822.N(n, n2, n3) == class04425.field_18) {
            class07218 class072182 = new class07218();
            for (class07211 class072112 : class07211.values()) {
                class072182.N(n, n2, n3).N(class072112);
                if (class026822.N(class072182.method_10263(), class072182.method_10264(), class072182.method_10260()) != class04425.field_22) continue;
                return class04425.field_4;
            }
            return class04425.field_18;
        }
        return super.N(class026822, n, n2, n3);
    }

    public int N(class01763[] class01763Array, class01763 class017632) {
        int n = super.N(class01763Array, class017632);
        class04425 class044252 = this.N(class017632.N, class017632.y + 1, class017632.L);
        class04425 class044253 = this.N(class017632.N, class017632.y, class017632.L);
        int n2 = this.u.N(class044252) >= 0.0f && class044253 != class04425.field_21326 ? class04995.y((float)Math.max(1.0f, this.u.method_49476())) : 0;
        double d = this.L(new class07209(class017632.N, class017632.y, class017632.L));
        class01763 class017633 = this.N(class017632.N, class017632.y + 1, class017632.L, Math.max(0, n2 - 1), d, class07211.field_11036, class044253);
        class01763 class017634 = this.N(class017632.N, class017632.y - 1, class017632.L, n2, d, class07211.field_11033, class044253);
        if (this.y(class017633, class017632)) {
            class01763Array[n++] = class017633;
        }
        if (this.y(class017634, class017632) && class044253 != class04425.field_19) {
            class01763Array[n++] = class017634;
        }
        for (int i = 0; i < n; ++i) {
            class01763 class017635 = class01763Array[i];
            if (class017635.E != class04425.field_18 || !this.N || class017635.y >= this.u.method_73183().method_8615() - 10) continue;
            class017635.U += 1.0f;
        }
        return n;
    }

    public class04604 N(double d, double d2, double d3) {
        return this.y(d, d2 + 0.5, d3);
    }

    public void N() {
        this.u.N(class04425.field_12, this.W);
        this.u.N(class04425.field_4, this.m);
        super.N();
    }

    public void N(class00783 class007832, class07079 class070792) {
        super.N(class007832, class070792);
        class070792.N(class04425.field_18, 0.0f);
        this.W = class070792.N(class04425.field_12);
        class070792.N(class04425.field_12, 6.0f);
        this.m = class070792.N(class04425.field_4);
        class070792.N(class04425.field_4, 4.0f);
    }
}

