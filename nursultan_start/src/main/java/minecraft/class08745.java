/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class01860
 *  minecraft.class01885
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03241
 *  minecraft.class03255
 *  minecraft.class06478
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class01860;
import minecraft.class01885;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03241;
import minecraft.class03255;
import minecraft.class06478;

public class class08745
implements class03241 {
    private final class00392 y;
    private final class00392 L;
    protected final class01885 N = class01885.u();

    public class00392 method_48610() {
        return this.y;
    }

    public class00392 method_71245() {
        return this.L;
    }

    public void method_48612(Consumer<class06478> consumer) {
        this.N.method_48206(consumer);
    }

    public void method_48611(class03255 class032552) {
        this.N.N();
        class02077.N((class02102)this.N, (class03255)class032552, (float)0.5f, (float)0.5f);
    }

    public class08745(class01590 class015902, class00392 class003922, class00392 class003923) {
        this.y = class003922;
        this.L = class003923;
        class01860 class018602 = new class01860(class015902, class003923);
        this.N.L().i().y();
        this.N.N((class02102)class018602, class020722 -> class020722.i(30));
    }
}

