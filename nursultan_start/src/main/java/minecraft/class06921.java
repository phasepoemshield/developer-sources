/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class06584
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class06584;
import minecraft.class06909;
import minecraft.class06911;
import minecraft.class06936;
import minecraft.class06950;

public class class06921 {
    private static final class06950 field_41038 = (class069452, class069342) -> {};
    private final class06909 field_41039;
    private final int field_41040;
    private class00392 field_41041 = class00392.i();
    private Supplier<class06584> field_41042 = () -> class06584.E;
    private class06950 field_41043 = field_41038;
    private boolean field_41044 = true;
    private boolean field_41045 = true;
    private boolean field_41046 = false;
    private class06936 field_41047 = class06936.field_41052;
    private class01894 field_41048 = class06911.N;

    public class06921(class06909 class069092, int n) {
        this.field_41039 = class069092;
        this.field_41040 = n;
    }

    public class06921 method_47319(class01894 class018942) {
        this.field_41048 = class018942;
        return this;
    }

    public class06921 method_47318(class06936 class069362) {
        this.field_41047 = class069362;
        return this;
    }

    public class06921 method_47320(Supplier<class06584> supplier) {
        this.field_41042 = supplier;
        return this;
    }

    public class06921 method_47315() {
        this.field_41046 = true;
        return this;
    }

    public class06911 method_47324() {
        if ((this.field_41047 == class06936.field_41054 || this.field_41047 == class06936.field_41053) && this.field_41043 != field_41038) {
            throw new IllegalStateException("Special tabs can't have display items");
        }
        class06911 class069112 = new class06911(this.field_41039, this.field_41040, this.field_41047, this.field_41041, this.field_41042, this.field_41043);
        class069112.i = this.field_41046;
        class069112.u = this.field_41045;
        class069112.L = this.field_41044;
        class069112.y = this.field_41048;
        return class069112;
    }

    public class06921 method_47317(class06950 class069502) {
        this.field_41043 = class069502;
        return this;
    }

    public class06921 method_47321(class00392 class003922) {
        this.field_41041 = class003922;
        return this;
    }

    public class06921 method_47323() {
        this.field_41044 = false;
        return this;
    }

    public class06921 method_47322() {
        this.field_41045 = false;
        return this;
    }
}

