/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07074
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class03424;
import minecraft.class03438;
import minecraft.class07074;
import org.jspecify.annotations.Nullable;

class class03440 {
    private final class03424 L;
    private final List<String> u;
    @Nullable class03438 N;
    boolean y;

    class03440(class03424 class034242, List<String> list) {
        this.L = class034242;
        this.u = list;
    }

    public void N(class07074 class070742) {
        class070742.N("Reload reason", (Object)this.L.field_33705);
        class070742.N("Finished", (Object)(this.y ? "Yes" : "No"));
        class070742.N("Packs", () -> String.join((CharSequence)", ", this.u));
        if (this.N != null) {
            this.N.N(class070742);
        }
    }
}

