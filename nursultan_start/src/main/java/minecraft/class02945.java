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
 *  minecraft.class00836
 *  minecraft.class02465
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02648
 *  minecraft.class02706
 *  minecraft.class02826
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00836;
import minecraft.class02465;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02648;
import minecraft.class02706;
import minecraft.class02826;
import minecraft.class02920;

public final class class02945
extends Record
implements class02465<class02706> {
    private final Optional<class02648<class02826<class00392>, class02920>> pages;
    private final Optional<String> author;
    private final Optional<String> title;
    private final class00836 generation;
    private final Optional<Boolean> resolved;
    public static final Codec<class02945> N = RecordCodecBuilder.create(instance -> instance.group((App)class02648.N(class02920.N).optionalFieldOf("pages").forGetter(class02945::N), (App)Codec.STRING.optionalFieldOf("author").forGetter(class02945::L), (App)Codec.STRING.optionalFieldOf("title").forGetter(class02945::u), (App)class00836.u.optionalFieldOf("generation", (Object)class00836.L).forGetter(class02945::i), (App)Codec.BOOL.optionalFieldOf("resolved").forGetter(class02945::R)).apply(instance, class02945::new));

    public Optional<String> L() {
        return this.author;
    }

    public class02945(Optional<class02648<class02826<class00392>, class02920>> optional, Optional<String> optional2, Optional<String> optional3, class00836 class008362, Optional<Boolean> optional4) {
        this.pages = optional;
        this.author = optional2;
        this.title = optional3;
        this.generation = class008362;
        this.resolved = optional4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02945.class, "pages;author;title;generation;resolved", "pages", "author", "title", "generation", "resolved"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02945.class, "pages;author;title;generation;resolved", "pages", "author", "title", "generation", "resolved"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02945.class, "pages;author;title;generation;resolved", "pages", "author", "title", "generation", "resolved"}, this);
    }

    public class00836 i() {
        return this.generation;
    }

    public Optional<String> u() {
        return this.title;
    }

    public class02477<class02706> y() {
        return class02484.NL;
    }

    public boolean N(class02706 class027062) {
        if (this.author.isPresent() && !this.author.get().equals(class027062.i())) {
            return false;
        }
        if (this.title.isPresent() && !this.title.get().equals(class027062.u().N())) {
            return false;
        }
        if (!this.generation.u(class027062.R())) {
            return false;
        }
        if (this.resolved.isPresent() && this.resolved.get().booleanValue() != class027062.M()) {
            return false;
        }
        return !this.pages.isPresent() || this.pages.get().test((Iterable)class027062.N());
    }

    public Optional<class02648<class02826<class00392>, class02920>> N() {
        return this.pages;
    }

    public Optional<Boolean> R() {
        return this.resolved;
    }
}

