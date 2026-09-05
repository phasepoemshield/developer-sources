/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00471
 *  minecraft.class00845
 *  minecraft.class08122
 */
package minecraft;

import java.util.Optional;
import minecraft.class00471;
import minecraft.class00845;
import minecraft.class02907;
import minecraft.class08122;

public class class02938
extends class00471<class02938> {
    private final class00845 N;
    private Optional<class08122> y = Optional.empty();
    private Optional<class08122> L = Optional.empty();

    class02938(class00845 class008452) {
        this.N = class008452;
    }

    public class02938 y(Optional<class08122> optional) {
        this.L = optional;
        return this;
    }

    public class08122 y() {
        return new class02907(this.R(), this.N, this.y, this.L);
    }

    protected class02938 L() {
        return this;
    }

    public class02938 N(Optional<class08122> optional) {
        this.y = optional;
        return this;
    }
}

