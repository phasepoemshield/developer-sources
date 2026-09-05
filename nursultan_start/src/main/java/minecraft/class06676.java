/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05715
 *  minecraft.class06555
 *  minecraft.class08413
 */
package minecraft;

import minecraft.class05715;
import minecraft.class06555;
import minecraft.class06645;
import minecraft.class08413;

public class class06676
extends class06555 {
    public static final class08413<class06676> N = new class08413("scoreboard", class06676::new, class06645.y.xmap(class06676::new, class06676::N), class05715.field_45083);
    private class06645 y;

    private class06676() {
        this(class06645.N);
    }

    public class06676(class06645 class066452) {
        this.y = class066452;
    }

    public void N(class06645 class066452) {
        if (!class066452.equals((Object)this.y)) {
            this.y = class066452;
            this.method_80();
        }
    }

    public class06645 N() {
        return this.y;
    }
}

