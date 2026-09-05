/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class02708
 *  minecraft.class03748
 *  minecraft.class06563
 *  minecraft.class06584
 *  minecraft.class07001
 *  minecraft.class07061
 *  minecraft.class07209
 *  minecraft.class07269
 *  minecraft.class07310
 *  minecraft.class07685
 *  minecraft.class07800
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class02708;
import minecraft.class03748;
import minecraft.class06563;
import minecraft.class06584;
import minecraft.class07001;
import minecraft.class07061;
import minecraft.class07209;
import minecraft.class07269;
import minecraft.class07310;
import minecraft.class07685;
import minecraft.class07800;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class00393
extends class00394
implements class07061 {
    public static final int N = 6;
    private static final String y = "patterns";
    private static final class00392 L = class00392.L("block.minecraft.banner");
    private @Nullable class00392 u;
    private final class06563 i;
    private class02708 R = class02708.L;

    public class06584 L() {
        class06584 class065842 = new class06584((class07310)class07800.N((class06563)this.i));
        class065842.y(this.g());
        return class065842;
    }

    public @Nullable class00392 method_5797() {
        return this.u;
    }

    public class00392 method_5477() {
        if (this.u != null) {
            return this.u;
        }
        return L;
    }

    public class00393(class07209 class072092, class00500 class005002) {
        this(class072092, class005002, ((class07685)class005002.i()).y());
    }

    public class00393(class07209 class072092, class00500 class005002, class06563 class065632) {
        super(class00404.field_11905, class072092, class005002);
        this.i = class065632;
    }

    public class06563 u() {
        return this.i;
    }

    @Override
    public void y(class08329 class083292) {
        class083292.L(y);
        class083292.L("CustomName");
    }

    public class02708 y() {
        return this.R;
    }

    public class07269 i() {
        return class07269.N((class00394)this);
    }

    @Override
    protected void N(class08299 class082992) {
        super.N(class082992);
        this.u = class00393.N_10(class082992, "CustomName");
        this.R = class082992.N(y, class02708.u).orElse(class02708.L);
    }

    @Override
    protected void N(class08329 class083292) {
        super.N(class083292);
        if (!this.R.equals((Object)class02708.L)) {
            class083292.N(y, class02708.u, (Object)this.R);
        }
        class083292.y("CustomName", class03748.N, (Object)this.u);
    }

    private class07001 N(class07001 class070012) {
        class070012.b("fabric:attachments");
        return class070012;
    }

    @Override
    protected void N(class02676 class026762) {
        super.N(class026762);
        class026762.N(class02484.Nv, (Object)this.R);
        class026762.N(class02484.B, (Object)this.u);
    }

    @Override
    protected void N_9(class02666 class026662) {
        super.N_9(class026662);
        this.R = (class02708)class026662.a_(class02484.Nv, (Object)class02708.L);
        this.u = (class00392)class026662.method_58694(class02484.B);
    }

    @Override
    public class07001 N(class01929 class019292) {
        return this.N(this.L(class019292));
    }
}

