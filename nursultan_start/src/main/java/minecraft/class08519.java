/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03539
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04891
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03539;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04891;
import minecraft.class05946;

public final class class08519
extends Record {
    private final class03556<class04891> ambientSound;
    private final class03556<class04891> deathSound;
    private final class03556<class04891> growlSound;
    private final class03556<class04891> hurtSound;
    private final class03556<class04891> pantSound;
    private final class03556<class04891> whineSound;
    public static final Codec<class08519> N = class08519.M();
    public static final Codec<class08519> y = class08519.M();
    public static final Codec<class03556<class08519>> L = class03539.N((class05946)class04227.yQ);
    public static final class02362<class04247, class03556<class08519>> u = class02389.y((class05946)class04227.yQ);

    public class03556<class04891> L() {
        return this.growlSound;
    }

    private static Codec<class08519> M() {
        return RecordCodecBuilder.create(instance -> instance.group((App)class04891.y.fieldOf("ambient_sound").forGetter(class08519::N), (App)class04891.y.fieldOf("death_sound").forGetter(class08519::y), (App)class04891.y.fieldOf("growl_sound").forGetter(class08519::L), (App)class04891.y.fieldOf("hurt_sound").forGetter(class08519::u), (App)class04891.y.fieldOf("pant_sound").forGetter(class08519::i), (App)class04891.y.fieldOf("whine_sound").forGetter(class08519::R)).apply(instance, class08519::new));
    }

    public class08519(class03556<class04891> class035562, class03556<class04891> class035563, class03556<class04891> class035564, class03556<class04891> class035565, class03556<class04891> class035566, class03556<class04891> class035567) {
        this.ambientSound = class035562;
        this.deathSound = class035563;
        this.growlSound = class035564;
        this.hurtSound = class035565;
        this.pantSound = class035566;
        this.whineSound = class035567;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08519.class, "ambientSound;deathSound;growlSound;hurtSound;pantSound;whineSound", "ambientSound", "deathSound", "growlSound", "hurtSound", "pantSound", "whineSound"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08519.class, "ambientSound;deathSound;growlSound;hurtSound;pantSound;whineSound", "ambientSound", "deathSound", "growlSound", "hurtSound", "pantSound", "whineSound"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08519.class, "ambientSound;deathSound;growlSound;hurtSound;pantSound;whineSound", "ambientSound", "deathSound", "growlSound", "hurtSound", "pantSound", "whineSound"}, this);
    }

    public class03556<class04891> i() {
        return this.pantSound;
    }

    public class03556<class04891> u() {
        return this.hurtSound;
    }

    public class03556<class04891> y() {
        return this.deathSound;
    }

    public class03556<class04891> N() {
        return this.ambientSound;
    }

    public class03556<class04891> R() {
        return this.whineSound;
    }
}

