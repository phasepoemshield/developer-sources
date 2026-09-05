/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03291
 *  minecraft.class04748
 *  minecraft.class04758
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class07321
 *  minecraft.class07830
 */
package minecraft;

import java.util.Optional;
import minecraft.class03291;
import minecraft.class04378;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class07321;
import minecraft.class07830;

public abstract class class04347
extends class04748 {
    private final class04378 N;
    private final int y;
    private final int R;

    public class04347(class04378 class043782, int n, int n2, class04758 class047582) {
        super(class047582);
        this.N = class043782;
        this.y = n;
        this.R = n2;
    }

    private void N(class03291 class032912, class04764 class047642) {
        class07321 class073212 = class047642.B();
        class032912.N(this.N.construct(class047642.R(), class073212.i(), class073212.R()));
    }

    public Optional<class04780> N(class04764 class047642) {
        if (class04347.N((class04764)class047642, (int)this.y, (int)this.R) < class047642.y().R()) {
            return Optional.empty();
        }
        return class04347.N((class04764)class047642, (class07830)class07830.field_13194, class032912 -> this.N((class03291)class032912, class047642));
    }
}

