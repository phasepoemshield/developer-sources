/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class07310
 */
package minecraft;

import java.util.Collection;
import minecraft.class06584;
import minecraft.class06908;
import minecraft.class07310;

public interface class06934 {
    default public void N(Collection<class06584> collection) {
        this.N(collection, class06908.field_40191);
    }

    default public void N(Collection<class06584> collection, class06908 class069082) {
        collection.forEach(class065842 -> this.method_45417((class06584)class065842, class069082));
    }

    default public void N(class07310 class073102) {
        this.method_45417(new class06584(class073102), class06908.field_40191);
    }

    default public void N(class06584 class065842) {
        this.method_45417(class065842, class06908.field_40191);
    }

    default public void N(class07310 class073102, class06908 class069082) {
        this.method_45417(new class06584(class073102), class069082);
    }

    public void method_45417(class06584 var1, class06908 var2);
}

