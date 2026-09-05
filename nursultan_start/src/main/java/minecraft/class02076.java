/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class02036
 *  minecraft.class02039
 *  minecraft.class03529
 *  minecraft.class04147
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class02036;
import minecraft.class02039;
import minecraft.class02066;
import minecraft.class02082;
import minecraft.class03529;
import minecraft.class04147;
import minecraft.class05946;

public final class class02076<T>
extends Record {
    private final class05946<? extends class00751<T>> key;
    private final Lifecycle lifecycle;
    private final class02039<T> bootstrap;

    public class02039<T> L() {
        return this.bootstrap;
    }

    public class02076(class05946<? extends class00751<T>> class059462, Lifecycle lifecycle, class02039<T> class020392) {
        this.key = class059462;
        this.lifecycle = lifecycle;
        this.bootstrap = class020392;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02076.class, "key;lifecycle;bootstrap", "key", "lifecycle", "bootstrap"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02076.class, "key;lifecycle;bootstrap", "key", "lifecycle", "bootstrap"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02076.class, "key;lifecycle;bootstrap", "key", "lifecycle", "bootstrap"}, this);
    }

    public class02066<T> y(class02036 class020362) {
        HashMap hashMap = new HashMap();
        Iterator var3 = class020362.B().entrySet().iterator();
        while (var3.hasNext()) {
            Map.Entry entry = var3.next();
            class05946 var5 = (class05946)entry.getKey();
            if (!var5.L(this.key)) continue;
            class05946 var6 = var5;
            class02082 var7 = (class02082)((Object)entry.getValue());
            class03529 var8 = (class03529)class020362.R().N.remove(var5);
            hashMap.put(var6, new class04147(var7, Optional.ofNullable(var8)));
            var3.remove();
        }
        return new class02066(this.key, this.lifecycle, hashMap);
    }

    public Lifecycle y() {
        return this.lifecycle;
    }

    public class05946<? extends class00751<T>> N() {
        return this.key;
    }

    void N(class02036 class020362) {
        this.bootstrap.run(class020362.N());
    }
}

