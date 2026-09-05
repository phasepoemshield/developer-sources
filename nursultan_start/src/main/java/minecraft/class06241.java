/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02484
 *  minecraft.class02699
 *  minecraft.class02706
 *  minecraft.class05220
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00392;
import minecraft.class02484;
import minecraft.class02699;
import minecraft.class02706;
import minecraft.class05220;
import minecraft.class06202;
import minecraft.class06584;
import org.jspecify.annotations.Nullable;

public final class class06241
extends Record {
    private final List<class00392> pages;

    public class06241(List<class00392> list) {
        this.pages = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06241.class, "pages", "pages"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06241.class, "pages", "pages"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06241.class, "pages", "pages"}, this);
    }

    public List<class00392> y() {
        return this.pages;
    }

    public class00392 N(int n) {
        if (n >= 0 && n < this.N()) {
            return this.pages.get(n);
        }
        return class05220.N;
    }

    public int N() {
        return this.pages.size();
    }

    public static @Nullable class06241 N(class06584 class065842) {
        boolean bl = class06202.Nq().yi();
        class02706 class027062 = (class02706)class065842.method_58694(class02484.NL);
        if (class027062 != null) {
            return new class06241(class027062.N(bl));
        }
        class02699 class026992 = (class02699)class065842.method_58694(class02484.Ny);
        if (class026992 != null) {
            return new class06241(class026992.N(bl).map(class00392::y).toList());
        }
        return null;
    }
}

