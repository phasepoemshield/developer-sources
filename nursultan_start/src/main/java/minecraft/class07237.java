/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class02689
 *  minecraft.class03748
 *  minecraft.class07000
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class02689;
import minecraft.class03748;
import minecraft.class07000;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07269;
import minecraft.class07299;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07237
extends class00394 {
    private static final String N = "profile";
    private static final String y = "note_block_sound";
    private static final String L = "custom_name";
    private @Nullable class02689 u;
    private @Nullable class01894 i;
    private int R;
    private boolean M;
    private @Nullable class00392 B;

    public @Nullable class01894 L() {
        return this.i;
    }

    public class07237(class07209 class072092, class00500 class005002) {
        super(class00404.field_11913, class072092, class005002);
    }

    public class07269 i() {
        return class07269.N(this);
    }

    public void y(class08329 class083292) {
        super.y(class083292);
        class083292.L(N);
        class083292.L(y);
        class083292.L(L);
    }

    public class07001 N(class01929 class019292) {
        return this.u(class019292);
    }

    protected void N_9(class02666 class026662) {
        super.N_9(class026662);
        this.u = (class02689)class026662.method_58694(class02484.Nb);
        this.i = (class01894)class026662.method_58694(class02484.Nj);
        this.B = (class00392)class026662.method_58694(class02484.B);
    }

    protected void N(class02676 class026762) {
        super.N(class026762);
        class026762.N(class02484.Nb, (Object)this.u);
        class026762.N(class02484.Nj, (Object)this.i);
        class026762.N(class02484.B, (Object)this.B);
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.u = class082992.N(N, class02689.N).orElse(null);
        this.i = class082992.N(y, class01894.N).orElse(null);
        this.B = class07237.N_10((class08299)class082992, (String)L);
    }

    public float N(float f) {
        if (this.M) {
            return (float)this.R + f;
        }
        return this.R;
    }

    public @Nullable class02689 N() {
        return this.u;
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.y(N, class02689.N, (Object)this.u);
        class083292.y(y, class01894.N, (Object)this.i);
        class083292.y(L, class03748.N, (Object)this.B);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class07237 class072372) {
        if (class005002.y((class08092)class07000.N) && ((Boolean)class005002.L((class08092)class07000.N)).booleanValue()) {
            class072372.M = true;
            ++class072372.R;
        } else {
            class072372.M = false;
        }
    }
}

