/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00395
 *  minecraft.class00425
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00395;
import minecraft.class00425;
import minecraft.class06584;

public final class class00380
extends Record
implements class00395 {
    private final class06584 item;
    public static final MapCodec<class00380> y = class06584.N.xmap(class00380::new, class00380::y);

    public class00380(class06584 class065842) {
        this.item = class065842 = class065842.t();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof class00380)) return false;
        class00380 class003802 = (class00380)((Object)object);
        if (!class06584.N((class06584)this.item, (class06584)class003802.item)) return false;
        return true;
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00380.class, "item", "item"}, this);
    }

    public int hashCode() {
        return class06584.y((class06584)this.item);
    }

    public class06584 y() {
        return this.item;
    }

    public class00425 N() {
        return class00425.field_24343;
    }
}

