/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class06584
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class06584;
import minecraft.class07280;

public final class class00524
extends Record
implements class00381<class07280> {
    private final int containerId;
    private final int stateId;
    private final List<class06584> items;
    private final class06584 carriedItem;
    public static final class02362<class04247, class00524> N = class02362.N((class02362)class02389.l, class00524::N, (class02362)class02389.B, class00524::y, (class02362)class06584.U, class00524::L, (class02362)class06584.B, class00524::u, class00524::new);

    public List<class06584> L() {
        return this.items;
    }

    public class00524(int n, int n2, List<class06584> list, class06584 class065842) {
        this.containerId = n;
        this.stateId = n2;
        this.items = list;
        this.carriedItem = class065842;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00524.class, "containerId;stateId;items;carriedItem", "containerId", "stateId", "items", "carriedItem"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00524.class, "containerId;stateId;items;carriedItem", "containerId", "stateId", "items", "carriedItem"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00524.class, "containerId;stateId;items;carriedItem", "containerId", "stateId", "items", "carriedItem"}, this);
    }

    public class06584 u() {
        return this.carriedItem;
    }

    public int y() {
        return this.stateId;
    }

    public int N() {
        return this.containerId;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class00524> method_65080() {
        return class04248.v;
    }
}

