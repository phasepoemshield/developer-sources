/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class07475
 *  minecraft.class07960
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class06584;
import minecraft.class07475;
import minecraft.class07617;
import minecraft.class07960;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

class class07615
extends class07960 {
    private @Nullable class08036 u;
    private final class07617 i;

    protected boolean M() {
        if (this.u != null && this.u.equals((Object)this.L)) {
            return false;
        }
        return super.M();
    }

    public class07615(class07617 class076172, double d, Predicate<class06584> predicate, boolean bl) {
        super((class07475)class076172, d, predicate, bl);
        this.i = class076172;
    }

    public void i() {
        super.i();
        if (this.u == null && this.N.method_59922().y(this.N(600)) == 0) {
            this.u = this.L;
        } else if (this.N.method_59922().y(this.N(500)) == 0) {
            this.u = null;
        }
    }

    public boolean N() {
        return super.N() && !this.i.NQ();
    }
}

