/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class08152;
import minecraft.class08159;
import minecraft.class08164;

public final class class08149
extends Record
implements class08164 {
    private final class08159 permission;
    public static final MapCodec<class08149> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class08159.y.fieldOf("permission").forGetter(class08149::y)).apply(instance, class08149::new));

    public class08149(class08159 class081592) {
        this.permission = class081592;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08149.class, "permission", "permission"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08149.class, "permission", "permission"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08149.class, "permission", "permission"}, this);
    }

    public class08159 y() {
        return this.permission;
    }

    @Override
    public boolean N(class08152 class081522) {
        return class081522.hasPermission(this.permission);
    }

    public MapCodec<class08149> N() {
        return y;
    }
}

