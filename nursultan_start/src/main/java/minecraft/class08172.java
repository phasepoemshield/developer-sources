/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01952
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04891
 *  minecraft.class05298
 *  minecraft.class05849
 *  minecraft.class06145
 *  minecraft.class06543
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08038
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import minecraft.class01952;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04891;
import minecraft.class05298;
import minecraft.class05849;
import minecraft.class06145;
import minecraft.class06543;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08038;

public final class class08172
extends Record {
    private final boolean dealsKnockback;
    private final boolean dismounts;
    private final Optional<class03556<class04891>> sound;
    private final Optional<class03556<class04891>> hitSound;
    public static final Codec<class08172> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("deals_knockback", (Object)true).forGetter(class08172::N), (App)Codec.BOOL.optionalFieldOf("dismounts", (Object)false).forGetter(class08172::y), (App)class04891.y.optionalFieldOf("sound").forGetter(class08172::L), (App)class04891.y.optionalFieldOf("hit_sound").forGetter(class08172::u)).apply(instance, class08172::new));
    public static final class02362<class04247, class08172> y = class02362.N((class02362)class02389.y, class08172::N, (class02362)class02389.y, class08172::y, (class02362)class04891.u.N_33(class02389::N), class08172::L, (class02362)class04891.u.N_33(class02389::N), class08172::u, class08172::new);

    public Optional<class03556<class04891>> L() {
        return this.sound;
    }

    public class08172(boolean bl, boolean bl2, Optional<class03556<class04891>> optional, Optional<class03556<class04891>> optional2) {
        this.dealsKnockback = bl;
        this.dismounts = bl2;
        this.sound = optional;
        this.hitSound = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08172.class, "dealsKnockback;dismounts;sound;hitSound", "dealsKnockback", "dismounts", "sound", "hitSound"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08172.class, "dealsKnockback;dismounts;sound;hitSound", "dealsKnockback", "dismounts", "sound", "hitSound"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08172.class, "dealsKnockback;dismounts;sound;hitSound", "dealsKnockback", "dismounts", "sound", "hitSound"}, this);
    }

    public Optional<class03556<class04891>> u() {
        return this.hitSound;
    }

    public boolean y() {
        return this.dismounts;
    }

    public void y(class07049 class070492) {
        this.hitSound.ifPresent(class035562 -> class070492.method_73183().method_60511(null, class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), class035562, class070492.method_5634(), 1.0f, 1.0f));
    }

    public void N(class07438 class074382, class07085 class070852) {
        float f = (float)class074382.method_45325(class05298.u);
        class06543 class065432 = class074382.method_76693();
        boolean bl = false;
        for (class06145 class061452 : (Collection)class08038.N((class07049)class074382, (class06543)class065432, class070492 -> class08172.N((class07049)class074382, class070492), (class05849)class05849.field_17558).map(class061832 -> List.of(), collection -> collection)) {
            bl |= class074382.method_75123(class070852, class061452.L(), f, true, this.dealsKnockback, this.dismounts);
        }
        class074382.method_75124();
        class074382.method_75125();
        if (bl) {
            this.y((class07049)class074382);
        }
        this.N((class07049)class074382);
        class074382.method_23667(class07050.field_5808, false);
    }

    public static boolean N(class07049 class070492, class07049 class070493) {
        if (class070493.method_5655() || !class070493.method_5805()) {
            return false;
        }
        if (class070493 instanceof class01952) {
            return true;
        }
        if (!class070493.method_49108()) {
            return false;
        }
        if (class070493 instanceof class08036) {
            class08036 class080362 = (class08036)class070493;
            if (class070492 instanceof class08036 && !((class08036)class070492).method_7256(class080362)) {
                return false;
            }
        }
        return !class070492.method_5794(class070493);
    }

    public void N(class07049 class070492) {
        this.sound.ifPresent(class035562 -> class070492.method_73183().method_60511(class070492, class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), class035562, class070492.method_5634(), 1.0f, 1.0f));
    }

    public boolean N() {
        return this.dealsKnockback;
    }
}

