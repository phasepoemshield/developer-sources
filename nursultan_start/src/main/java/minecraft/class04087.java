/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01210
 *  minecraft.class01763
 *  minecraft.class02682
 *  minecraft.class04425
 *  minecraft.class04995
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07886
 */
package minecraft;

import minecraft.class01210;
import minecraft.class01763;
import minecraft.class02682;
import minecraft.class04425;
import minecraft.class04995;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07886;

class class04087
extends class07886 {
    private final class07218 N = new class07218();

    public class04087(boolean bl) {
        super(bl);
    }

    public class01763 y() {
        if (!this.u.method_5799()) {
            return super.y();
        }
        return this.N(new class07209(class04995.N((double)this.u.method_5829().N), class04995.N((double)this.u.method_5829().y), class04995.N((double)this.u.method_5829().L)));
    }

    public class04425 N(class02682 class026822, int n, int n2, int n3) {
        this.N.N(n, n2 - 1, n3);
        if (class026822.N((class07209)this.N).N(class01210.LM)) {
            return class04425.field_7;
        }
        return super.N(class026822, n, n2, n3);
    }
}

