/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03434
 *  minecraft.class04907
 *  minecraft.class05936
 *  minecraft.class06581
 *  minecraft.class06918
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03434;
import minecraft.class04610;
import minecraft.class04611;
import minecraft.class04614;
import minecraft.class04618;
import minecraft.class04654;
import minecraft.class04907;
import minecraft.class05936;
import minecraft.class06581;
import minecraft.class06918;
import org.jspecify.annotations.Nullable;

class class04590
extends class04614 {
    private final class06581 y;
    private final class04618 L;
    final /* synthetic */ class04611 N;

    class04590(class04611 class046112, class06581 class065812) {
        this.N = class046112;
        this.y = class065812;
        this.L = new class04618(this, class065812.E());
    }

    protected void N(class01054 class010542, @Nullable class04907<?> class049072, int n, int n2, boolean bl) {
        class00392 class003922 = class049072 == null ? class04610.i : class00392.y((String)class049072.N(this.N.R.B.N(class049072)));
        class010542.y(class04610.M(this.N.R), class003922, n - class04610.B(this.N.R).N((class05936)class003922), n2, bl ? -1 : -4539718);
    }

    protected class06581 N() {
        return this.y;
    }

    public List<? extends class04654> method_25396() {
        return List.of(this.L);
    }

    public List<? extends class03434> method_37025() {
        return List.of(this.L);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3;
        this.L.y(this.method_73380(), this.method_73382());
        this.L.method_25394(class010542, n, n2, f);
        class04611 class046112 = this.N;
        int n4 = class046112.method_25396().indexOf((Object)this);
        for (n3 = 0; n3 < class046112.N.size(); ++n3) {
            class04907<?> class049072;
            class06581 class065812 = this.y;
            if (class065812 instanceof class06918) {
                class06918 class069182 = (class06918)class065812;
                class04907 var9 = class046112.N.get(n3).y((Object)class069182.L());
            } else {
                class049072 = null;
            }
            int n5 = this.method_73380() + this.N.N(n3);
            int n6 = this.method_73385();
            Objects.requireNonNull(class04610.i(this.N.R));
            this.N(class010542, class049072, n5, n6 - 4, n4 % 2 == 0);
        }
        for (n3 = 0; n3 < class046112.y.size(); ++n3) {
            class04907 class049073 = class046112.y.get(n3).y((Object)this.y);
            int n7 = this.method_73380() + this.N.N(n3 + class046112.N.size());
            int n8 = this.method_73385();
            Objects.requireNonNull(class04610.R(this.N.R));
            this.N(class010542, class049073, n7, n8 - 4, n4 % 2 == 0);
        }
    }
}

