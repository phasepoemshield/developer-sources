/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;

public final class class07415
extends Record {
    private final Optional<String> literal;
    private final Optional<String> translatable;
    private final Optional<List<String>> translatableParams;
    public static final Codec<class07415> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.optionalFieldOf("literal").forGetter(class07415::y), (App)Codec.STRING.optionalFieldOf("translatable").forGetter(class07415::L), (App)Codec.STRING.listOf().lenientOptionalFieldOf("translatableParams").forGetter(class07415::u)).apply(instance, class07415::new));

    public Optional<String> L() {
        return this.translatable;
    }

    public class07415(Optional<String> optional, Optional<String> optional2, Optional<List<String>> optional3) {
        this.literal = optional;
        this.translatable = optional2;
        this.translatableParams = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07415.class, "literal;translatable;translatableParams", "literal", "translatable", "translatableParams"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07415.class, "literal;translatable;translatableParams", "literal", "translatable", "translatableParams"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07415.class, "literal;translatable;translatableParams", "literal", "translatable", "translatableParams"}, this);
    }

    public Optional<List<String>> u() {
        return this.translatableParams;
    }

    public Optional<String> y() {
        return this.literal;
    }

    public Optional<class00392> N() {
        if (this.translatable.isPresent()) {
            String string = this.translatable.get();
            if (this.translatableParams.isPresent()) {
                List<String> var2 = this.translatableParams.get();
                return Optional.of(class00392.N((String)string, (Object[])var2.toArray()));
            }
            return Optional.of(class00392.L((String)string));
        }
        return this.literal.map(class00392::y);
    }
}

