/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class06521
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class08012
 *  minecraft.class08022
 *  minecraft.class08034
 *  minecraft.class08044
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class02754;
import minecraft.class03556;
import minecraft.class06521;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class08012;
import minecraft.class08022;
import minecraft.class08034;
import minecraft.class08044;
import org.jspecify.annotations.Nullable;

public class class02741 {
    private final class08034<class03556<class06581>> N = new class08034();

    public int y(class06521<?> class065212, @Nullable class08012<class03556<class06581>> class080122) {
        return this.y(class065212, Integer.MAX_VALUE, class080122);
    }

    public int y(class06521<?> class065212, int n, @Nullable class08012<class03556<class06581>> class080122) {
        return this.N.y(class065212.method_61671().y(), n, class080122);
    }

    public void y(class06584 class065842) {
        this.N(class065842, class065842.U());
    }

    public boolean N(List<? extends class08022<class03556<class06581>>> list, @Nullable class08012<class03556<class06581>> class080122) {
        return this.N(list, 1, class080122);
    }

    private boolean N(List<? extends class08022<class03556<class06581>>> list, int n, @Nullable class08012<class03556<class06581>> class080122) {
        return this.N.N(list, n, class080122);
    }

    public void N() {
        this.N.N();
    }

    public void N(class06584 class065842) {
        if (class08044.i((class06584)class065842)) {
            this.y(class065842);
        }
    }

    public void N(class06584 class065842, int n) {
        if (!class065842.R()) {
            int n2 = Math.min(n, class065842.c());
            this.N.u((Object)class065842.Z(), n2);
        }
    }

    public boolean N(class06521<?> class065212, @Nullable class08012<class03556<class06581>> class080122) {
        return this.N(class065212, 1, class080122);
    }

    public boolean N(class06521<?> class065212, int n, @Nullable class08012<class03556<class06581>> class080122) {
        class02754 class027542 = class065212.method_61671();
        if (class027542.L()) {
            return false;
        }
        return this.N(class027542.y(), n, class080122);
    }
}

