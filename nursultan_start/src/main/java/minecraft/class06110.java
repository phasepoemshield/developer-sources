/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00159
 *  minecraft.class00412
 *  minecraft.class00837
 *  minecraft.class00845
 *  minecraft.class02055
 *  minecraft.class02471
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02695
 *  minecraft.class04877
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07310
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00159;
import minecraft.class00412;
import minecraft.class00837;
import minecraft.class00845;
import minecraft.class02055;
import minecraft.class02471;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02695;
import minecraft.class04877;
import minecraft.class06124;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07310;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public final class class06110
extends Record {
    private final Optional<class00845> head;
    private final Optional<class00845> chest;
    private final Optional<class00845> legs;
    private final Optional<class00845> feet;
    private final Optional<class00845> body;
    private final Optional<class00845> mainhand;
    private final Optional<class00845> offhand;
    public static final Codec<class06110> N = RecordCodecBuilder.create(instance -> instance.group((App)class00845.N.optionalFieldOf("head").forGetter(class06110::N), (App)class00845.N.optionalFieldOf("chest").forGetter(class06110::y), (App)class00845.N.optionalFieldOf("legs").forGetter(class06110::L), (App)class00845.N.optionalFieldOf("feet").forGetter(class06110::u), (App)class00845.N.optionalFieldOf("body").forGetter(class06110::i), (App)class00845.N.optionalFieldOf("mainhand").forGetter(class06110::R), (App)class00845.N.optionalFieldOf("offhand").forGetter(class06110::M)).apply(instance, class06110::new));

    public Optional<class00845> L() {
        return this.legs;
    }

    public Optional<class00845> M() {
        return this.offhand;
    }

    public class06110(Optional<class00845> optional, Optional<class00845> optional2, Optional<class00845> optional3, Optional<class00845> optional4, Optional<class00845> optional5, Optional<class00845> optional6, Optional<class00845> optional7) {
        this.head = optional;
        this.chest = optional2;
        this.legs = optional3;
        this.feet = optional4;
        this.body = optional5;
        this.mainhand = optional6;
        this.offhand = optional7;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06110.class, "head;chest;legs;feet;body;mainhand;offhand", "head", "chest", "legs", "feet", "body", "mainhand", "offhand"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06110.class, "head;chest;legs;feet;body;mainhand;offhand", "head", "chest", "legs", "feet", "body", "mainhand", "offhand"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06110.class, "head;chest;legs;feet;body;mainhand;offhand", "head", "chest", "legs", "feet", "body", "mainhand", "offhand"}, this);
    }

    public Optional<class00845> i() {
        return this.body;
    }

    public Optional<class00845> u() {
        return this.feet;
    }

    public Optional<class00845> y() {
        return this.chest;
    }

    public static class06110 N(class02055<class06581> class020552, class02055<class00412> class020553) {
        return class06124.N().N(class00837.N().N(class020552, new class07310[]{class06570.li}).N(class00159.N().N(class02471.N((class02695)class04877.N(class020553).y(), (class02477[])new class02477[]{class02484.Nv, class02484.U})).y())).y();
    }

    public boolean N(@Nullable class07049 class070492) {
        if (!(class070492 instanceof class07438)) {
            return false;
        }
        class07438 class074382 = (class07438)class070492;
        if (this.head.isPresent() && !this.head.get().test(class074382.method_6118(class07085.field_6169))) {
            return false;
        }
        if (this.chest.isPresent() && !this.chest.get().test(class074382.method_6118(class07085.field_6174))) {
            return false;
        }
        if (this.legs.isPresent() && !this.legs.get().test(class074382.method_6118(class07085.field_6172))) {
            return false;
        }
        if (this.feet.isPresent() && !this.feet.get().test(class074382.method_6118(class07085.field_6166))) {
            return false;
        }
        if (this.body.isPresent() && !this.body.get().test(class074382.method_6118(class07085.field_48824))) {
            return false;
        }
        if (this.mainhand.isPresent() && !this.mainhand.get().test(class074382.method_6118(class07085.field_6173))) {
            return false;
        }
        return !this.offhand.isPresent() || this.offhand.get().test(class074382.method_6118(class07085.field_6171));
    }

    public Optional<class00845> N() {
        return this.head;
    }

    public Optional<class00845> R() {
        return this.mainhand;
    }
}

