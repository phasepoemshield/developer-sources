/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00508
 *  minecraft.class00667
 *  minecraft.class04348
 *  minecraft.class07263
 */
package minecraft;

import com.mojang.brigadier.builder.ArgumentBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00508;
import minecraft.class00667;
import minecraft.class04348;
import minecraft.class07263;

final class class00485
extends Record
implements class00508 {
    private final String id;

    class00485(String string) {
        this.id = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00485.class, "id", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00485.class, "id", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00485.class, "id", "id"}, this);
    }

    public String N() {
        return this.id;
    }

    public <S> ArgumentBuilder<S, ?> N(class04348 class043482, class07263<S> class072632) {
        return class072632.N(this.id);
    }

    public void N(class00667 class006672) {
        class006672.N(this.id);
    }
}

