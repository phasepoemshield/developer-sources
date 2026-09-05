/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02060
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03241
 *  minecraft.class03255
 *  minecraft.class06478
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02060;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03241;
import minecraft.class03255;
import minecraft.class06478;

public class class03286
implements class03241 {
    private final class00392 N;
    protected final class02060 Z = new class02060();

    public class00392 method_48610() {
        return this.N;
    }

    public class00392 method_71245() {
        return class00392.i();
    }

    public void method_48612(Consumer<class06478> consumer) {
        this.Z.method_48206(consumer);
    }

    public void method_48611(class03255 class032552) {
        this.Z.N();
        class02077.N((class02102)this.Z, (class03255)class032552, (float)0.5f, (float)0.16666667f);
    }

    public class03286(class00392 class003922) {
        this.N = class003922;
    }
}

