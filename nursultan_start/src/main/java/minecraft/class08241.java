/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class06509
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class03556;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class06509;
import minecraft.class08200;
import minecraft.class08209;
import minecraft.class08229;

public class class08241 {
    private float N = 1.6f;
    private class06509 y = class06509.field_8950;
    private class03556<class04891> L = class04909.EF;
    private boolean u = true;
    private final List<class08200> i = new ArrayList<class08200>();

    class08241() {
    }

    public class08241 y(class03556<class04891> class035562) {
        return this.N(new class08229(class035562));
    }

    public class08209 N() {
        return new class08209(this.N, this.y, this.L, this.u, this.i);
    }

    public class08241 N(class08200 class082002) {
        this.i.add(class082002);
        return this;
    }

    public class08241 N(boolean bl) {
        this.u = bl;
        return this;
    }

    public class08241 N(float f) {
        this.N = f;
        return this;
    }

    public class08241 N(class03556<class04891> class035562) {
        this.L = class035562;
        return this;
    }

    public class08241 N(class06509 class065092) {
        this.y = class065092;
        return this;
    }
}

