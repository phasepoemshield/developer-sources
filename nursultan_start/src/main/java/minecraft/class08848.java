/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00471
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class07304
 *  minecraft.class08122
 */
package minecraft;

import java.util.Optional;
import minecraft.class00471;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class07304;
import minecraft.class08122;
import minecraft.class08853;

public class class08848
extends class00471<class08848> {
    private Optional<class03543<class07304>> N = Optional.empty();
    private boolean y = true;

    public class08848 u() {
        this.y = false;
        return this;
    }

    public class08122 y() {
        return new class08853(this.R(), this.N, this.y);
    }

    public class08848 N(class03543<class07304> class035432) {
        this.N = Optional.of(class035432);
        return this;
    }

    public class08848 N(class03556<class07304> class035562) {
        this.N = Optional.of(class03543.N((class03556[])new class03556[]{class035562}));
        return this;
    }

    protected class08848 L() {
        return this;
    }
}

