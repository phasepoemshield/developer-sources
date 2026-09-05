/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03748
 *  minecraft.class04439
 *  minecraft.class05216
 *  minecraft.class05935
 *  minecraft.class05977
 *  minecraft.class07049
 *  minecraft.class07701
 *  minecraft.class08262
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class03748;
import minecraft.class04439;
import minecraft.class05216;
import minecraft.class05935;
import minecraft.class05977;
import minecraft.class07049;
import minecraft.class07701;
import minecraft.class08262;
import org.jspecify.annotations.Nullable;

public final class class00414
extends Record
implements class04439 {
    private final class08262 selector;
    private final Optional<class00392> separator;
    public static final MapCodec<class00414> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class08262.N.fieldOf("selector").forGetter(class00414::y), (App)class03748.N.optionalFieldOf("separator").forGetter(class00414::L)).apply(instance, class00414::new));

    public Optional<class00392> L() {
        return this.separator;
    }

    public class00414(class08262 class082622, Optional<class00392> optional) {
        this.selector = class082622;
        this.separator = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00414.class, "selector;separator", "selector", "separator"}, this, object);
    }

    public String toString() {
        return "pattern{" + String.valueOf(this.selector) + "}";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00414.class, "selector;separator", "selector", "separator"}, this);
    }

    public class08262 y() {
        return this.selector;
    }

    public MapCodec<class00414> N() {
        return N;
    }

    public class05216 N(@Nullable class07701 class077012, @Nullable class07049 class070492, int n) throws CommandSyntaxException {
        if (class077012 == null) {
            return class00392.i();
        }
        Optional<class05216> optional = class00390.N(class077012, this.separator, class070492, n);
        return class00390.N(this.selector.y().y(class077012), optional, class07049::method_5476);
    }

    public <T> Optional<T> method_27660(class05935<T> class059352, class00405 class004052) {
        return class059352.accept(class004052, this.selector.N());
    }

    public <T> Optional<T> method_27659(class05977<T> class059772) {
        return class059772.accept(this.selector.N());
    }
}

