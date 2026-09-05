/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00201
 *  minecraft.class00392
 *  minecraft.class00753
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03748
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06993
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00201;
import minecraft.class00392;
import minecraft.class00753;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03748;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06993;
import minecraft.class08625;

public final class class08595
extends Record {
    private final Optional<class05946<class00201>> test;
    private final class00753 size;
    private final class06993 rotation;
    private final boolean ignoreEntities;
    private final class08625 status;
    private final Optional<class00392> errorMessage;
    public static final Codec<class08595> N = RecordCodecBuilder.create(instance -> instance.group((App)class05946.N((class05946)class04227.yt).optionalFieldOf("test").forGetter(class08595::N), (App)class00753.field_25123.fieldOf("size").forGetter(class08595::y), (App)class06993.field_39313.fieldOf("rotation").forGetter(class08595::L), (App)Codec.BOOL.fieldOf("ignore_entities").forGetter(class08595::u), (App)class08625.field_56017.fieldOf("status").forGetter(class08595::i), (App)class03748.N.optionalFieldOf("error_message").forGetter(class08595::R)).apply(instance, class08595::new));
    public static final class02362<class04247, class08595> y = class02362.N((class02362)class02389.N((class02362)class05946.y((class05946)class04227.yt)), class08595::N, (class02362)class00753.field_56131, class08595::y, (class02362)class06993.field_55987, class08595::L, (class02362)class02389.y, class08595::u, class08625.field_56018, class08595::i, (class02362)class02389.N((class02362)class03748.y), class08595::R, class08595::new);

    public class06993 L() {
        return this.rotation;
    }

    public class08595(Optional<class05946<class00201>> optional, class00753 class007532, class06993 class069932, boolean bl, class08625 class086252, Optional<class00392> optional2) {
        this.test = optional;
        this.size = class007532;
        this.rotation = class069932;
        this.ignoreEntities = bl;
        this.status = class086252;
        this.errorMessage = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08595.class, "test;size;rotation;ignoreEntities;status;errorMessage", "test", "size", "rotation", "ignoreEntities", "status", "errorMessage"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08595.class, "test;size;rotation;ignoreEntities;status;errorMessage", "test", "size", "rotation", "ignoreEntities", "status", "errorMessage"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08595.class, "test;size;rotation;ignoreEntities;status;errorMessage", "test", "size", "rotation", "ignoreEntities", "status", "errorMessage"}, this);
    }

    public class08625 i() {
        return this.status;
    }

    public boolean u() {
        return this.ignoreEntities;
    }

    public class00753 y() {
        return this.size;
    }

    public Optional<class05946<class00201>> N() {
        return this.test;
    }

    public class08595 N(class00392 class003922) {
        return new class08595(this.test, this.size, this.rotation, this.ignoreEntities, class08625.field_56016, Optional.of(class003922));
    }

    public class08595 N(class08625 class086252) {
        return new class08595(this.test, this.size, this.rotation, this.ignoreEntities, class086252, Optional.empty());
    }

    public class08595 N(class00753 class007532) {
        return new class08595(this.test, class007532, this.rotation, this.ignoreEntities, this.status, this.errorMessage);
    }

    public Optional<class00392> R() {
        return this.errorMessage;
    }
}

