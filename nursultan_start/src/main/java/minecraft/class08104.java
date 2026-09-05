/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02008
 *  minecraft.class05913
 *  minecraft.class08388
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import minecraft.class02008;
import minecraft.class05913;
import minecraft.class08119;
import minecraft.class08388;

final class class08104
extends Record {
    final class08119 entry;
    final CompletableFuture<class02008> preparations;

    class08104(class08119 class081192, CompletableFuture<class02008> completableFuture) {
        this.entry = class081192;
        this.preparations = completableFuture;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08104.class, "entry;preparations", "entry", "preparations"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08104.class, "entry;preparations", "entry", "preparations"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08104.class, "entry;preparations", "entry", "preparations"}, this);
    }

    public CompletableFuture<class02008> y() {
        return this.preparations;
    }

    public class08119 N() {
        return this.entry;
    }

    public void N(Map<class05913, class08388> map) {
        class02008 class020082 = this.preparations.join();
        this.entry.N().N(class020082);
        class020082.i().forEach((class018942, class083882) -> map.put(new class05913(this.entry.y().N(), class018942), (class08388)class083882));
    }
}

