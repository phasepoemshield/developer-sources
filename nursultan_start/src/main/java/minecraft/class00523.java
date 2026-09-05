/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class04348
 *  minecraft.class06763
 *  minecraft.class06799
 *  minecraft.class07263
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00508;
import minecraft.class00667;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class04348;
import minecraft.class06763;
import minecraft.class06799;
import minecraft.class07263;
import org.jspecify.annotations.Nullable;

final class class00523
extends Record
implements class00508 {
    private final String id;
    private final class06763<?> argumentType;
    private final @Nullable class01894 suggestionId;

    public @Nullable class01894 L() {
        return this.suggestionId;
    }

    class00523(String string, class06763<?> class067632, @Nullable class01894 class018942) {
        this.id = string;
        this.argumentType = class067632;
        this.suggestionId = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00523.class, "id;argumentType;suggestionId", "id", "argumentType", "suggestionId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00523.class, "id;argumentType;suggestionId", "id", "argumentType", "suggestionId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00523.class, "id;argumentType;suggestionId", "id", "argumentType", "suggestionId"}, this);
    }

    public class06763<?> y() {
        return this.argumentType;
    }

    @Override
    public void N(class00667 class006672) {
        class006672.N(this.id);
        class00523.N(class006672, this.argumentType);
        if (this.suggestionId != null) {
            class006672.N(this.suggestionId);
        }
    }

    public String N() {
        return this.id;
    }

    private static <A extends ArgumentType<?>> void N(class00667 class006672, class06763<A> class067632) {
        class00523.N(class006672, class067632.N(), class067632);
    }

    private static <A extends ArgumentType<?>, T extends class06763<A>> void N(class00667 class006672, class06799<A, T> class067992, class06763<A> class067632) {
        class006672.L(class04206.t.N(class067992));
        class067992.N(class067632, class006672);
    }

    @Override
    public <S> ArgumentBuilder<S, ?> N(class04348 class043482, class07263<S> class072632) {
        ArgumentType argumentType = this.argumentType.y(class043482);
        return class072632.N(this.id, argumentType, this.suggestionId);
    }
}

