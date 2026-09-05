/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 *  minecraft.class09037
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00647;
import minecraft.class00654;
import minecraft.class03556;
import minecraft.class09037;

public final class class00626
extends Record
implements class00647 {
    private final class03556<class09037> dialog;
    public static final MapCodec<class00626> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class09037.u.fieldOf("dialog").forGetter(class00626::y)).apply(instance, class00626::new));

    public class00626(class03556<class09037> class035562) {
        this.dialog = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00626.class, "dialog", "dialog"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00626.class, "dialog", "dialog"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00626.class, "dialog", "dialog"}, this);
    }

    public class03556<class09037> y() {
        return this.dialog;
    }

    @Override
    public class00654 N() {
        return class00654.field_60821;
    }
}

