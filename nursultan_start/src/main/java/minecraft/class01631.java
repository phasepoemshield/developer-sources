/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04208
 *  minecraft.class06955
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.DataFixUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01653;
import minecraft.class04208;
import minecraft.class06955;
import org.jspecify.annotations.Nullable;

public final class class01631
extends Record {
    private final class06955 body;
    private final @Nullable class06955 cape;
    private final @Nullable class06955 elytra;
    private final class04208 model;
    private final boolean secure;

    public @Nullable class06955 L() {
        return this.elytra;
    }

    public class01631(class06955 class069552, @Nullable class06955 class069553, @Nullable class06955 class069554, class04208 class042082, boolean bl) {
        this.body = class069552;
        this.cape = class069553;
        this.elytra = class069554;
        this.model = class042082;
        this.secure = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01631.class, "body;cape;elytra;model;secure", "body", "cape", "elytra", "model", "secure"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01631.class, "body;cape;elytra;model;secure", "body", "cape", "elytra", "model", "secure"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01631.class, "body;cape;elytra;model;secure", "body", "cape", "elytra", "model", "secure"}, this);
    }

    public boolean i() {
        return this.secure;
    }

    public class04208 u() {
        return this.model;
    }

    public @Nullable class06955 y() {
        return this.cape;
    }

    public class06955 N() {
        return this.body;
    }

    public static class01631 N(class06955 class069552, @Nullable class06955 class069553, @Nullable class06955 class069554, class04208 class042082) {
        return new class01631(class069552, class069553, class069554, class042082, false);
    }

    public class01631 N(class01653 class016532) {
        if (class016532.equals((Object)class01653.i)) {
            return this;
        }
        return class01631.N((class06955)DataFixUtils.orElse(class016532.N(), (Object)this.body), (class06955)DataFixUtils.orElse(class016532.y(), (Object)this.cape), (class06955)DataFixUtils.orElse(class016532.L(), (Object)this.elytra), class016532.u().orElse(this.model));
    }
}

