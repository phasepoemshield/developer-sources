/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02060
 *  minecraft.class02071
 *  minecraft.class02077
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class03597
 *  minecraft.class04230
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06197
 *  minecraft.class06541
 *  minecraft.class07536
 */
package minecraft;

import java.net.URI;
import minecraft.class00392;
import minecraft.class02060;
import minecraft.class02071;
import minecraft.class02077;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class03597;
import minecraft.class04230;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06197;
import minecraft.class06541;
import minecraft.class07536;

public class class01864
extends class05096 {
    private static final class00392 N = class00392.L((String)"symlink_warning.title.world").N(class06541.field_1067);
    private static final class00392 y = class00392.N((String)"symlink_warning.message.world", (Object[])new Object[]{class00392.N((URI)class03597.s)});
    private static final class00392 L = class00392.L((String)"symlink_warning.title.pack").N(class06541.field_1067);
    private static final class00392 u = class00392.N((String)"symlink_warning.message.pack", (Object[])new Object[]{class00392.N((URI)class03597.s)});
    private final class00392 i;
    private final URI R;
    private final Runnable M;
    private final class02060 B = new class02060().y(10);

    public class01864(class00392 class003922, class00392 class003923, URI uRI, Runnable runnable) {
        super(class003922);
        this.i = class003923;
        this.R = uRI;
        this.M = runnable;
    }

    public static class05096 y(Runnable runnable) {
        return new class01864(L, u, class03597.s, runnable);
    }

    public static class05096 N(Runnable runnable) {
        return new class01864(N, y, class03597.s, runnable);
    }

    public void method_25426() {
        super.method_25426();
        this.B.L().y();
        class02080 class020802 = this.B.u(1);
        class020802.N((class02102)new class02071(this.field_22785, this.field_22793));
        class020802.N((class02102)new class04230(this.i, this.field_22793).N(this.field_22789 - 50).N(true));
        int n = 120;
        class02060 class020602 = new class02060().N(5);
        class02080 class020803 = class020602.u(3);
        class020803.N((class02102)class05362.method_46430((class00392)class05220.m, class053622 -> class07536.m().N(this.R)).y(120, 20).N());
        class020803.N((class02102)class05362.method_46430((class00392)class05220.s, class053622 -> ((class06197)this.field_22787.L_3).N(this.R.toString())).y(120, 20).N());
        class020803.N((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).y(120, 20).N());
        class020802.N((class02102)class020602);
        this.method_48640();
        this.B.method_48206(arg_0 -> ((class01864)this).method_37063(arg_0));
    }

    public void method_48640() {
        this.B.N();
        class02077.N((class02102)this.B, (class03255)this.method_48202());
    }

    public void method_25419() {
        this.M.run();
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{super.method_25435(), this.i});
    }
}

