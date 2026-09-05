/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00695
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class04770
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05849
 *  minecraft.class06145
 *  minecraft.class06338
 *  minecraft.class06543
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class07049
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
import minecraft.class00695;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class04770;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05849;
import minecraft.class06145;
import minecraft.class06338;
import minecraft.class06543;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08038;
import minecraft.class08169;
import minecraft.class08172;

public final class class08174
extends Record {
    private final int contactCooldownTicks;
    private final int delayTicks;
    private final Optional<class08169> dismountConditions;
    private final Optional<class08169> knockbackConditions;
    private final Optional<class08169> damageConditions;
    private final float forwardMovement;
    private final float damageMultiplier;
    private final Optional<class03556<class04891>> sound;
    private final Optional<class03556<class04891>> hitSound;
    public static final int N = 10;
    public static final Codec<class08174> y = RecordCodecBuilder.create(instance -> instance.group((App)class06338.T.optionalFieldOf("contact_cooldown_ticks", (Object)10).forGetter(class08174::y), (App)class06338.T.optionalFieldOf("delay_ticks", (Object)0).forGetter(class08174::L), (App)class08169.N.optionalFieldOf("dismount_conditions").forGetter(class08174::u), (App)class08169.N.optionalFieldOf("knockback_conditions").forGetter(class08174::i), (App)class08169.N.optionalFieldOf("damage_conditions").forGetter(class08174::R), (App)Codec.FLOAT.optionalFieldOf("forward_movement", (Object)Float.valueOf(0.0f)).forGetter(class08174::M), (App)Codec.FLOAT.optionalFieldOf("damage_multiplier", (Object)Float.valueOf(1.0f)).forGetter(class08174::B), (App)class04891.y.optionalFieldOf("sound").forGetter(class08174::Z), (App)class04891.y.optionalFieldOf("hit_sound").forGetter(class08174::z)).apply(instance, class08174::new));
    public static final class02362<class04247, class08174> L = class02362.N((class02362)class02389.B, class08174::y, (class02362)class02389.B, class08174::L, (class02362)class08169.y.N_33(class02389::N), class08174::u, (class02362)class08169.y.N_33(class02389::N), class08174::i, (class02362)class08169.y.N_33(class02389::N), class08174::R, (class02362)class02389.E, class08174::M, (class02362)class02389.E, class08174::B, (class02362)class04891.u.N_33(class02389::N), class08174::Z, (class02362)class04891.u.N_33(class02389::N), class08174::z, class08174::new);

    public int L() {
        return this.delayTicks;
    }

    public void L(class07049 class070492) {
        this.hitSound.ifPresent(class035562 -> class070492.method_73183().method_55116(class070492, (class04891)class035562.N(), class070492.method_5634(), 1.0f, 1.0f));
    }

    public float M() {
        return this.forwardMovement;
    }

    public class08174(int n, int n2, Optional<class08169> optional, Optional<class08169> optional2, Optional<class08169> optional3, float f, float f2, Optional<class03556<class04891>> optional4, Optional<class03556<class04891>> optional5) {
        this.contactCooldownTicks = n;
        this.delayTicks = n2;
        this.dismountConditions = optional;
        this.knockbackConditions = optional2;
        this.damageConditions = optional3;
        this.forwardMovement = f;
        this.damageMultiplier = f2;
        this.sound = optional4;
        this.hitSound = optional5;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08174.class, "contactCooldownTicks;delayTicks;dismountConditions;knockbackConditions;damageConditions;forwardMovement;damageMultiplier;sound;hitSound", "contactCooldownTicks", "delayTicks", "dismountConditions", "knockbackConditions", "damageConditions", "forwardMovement", "damageMultiplier", "sound", "hitSound"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08174.class, "contactCooldownTicks;delayTicks;dismountConditions;knockbackConditions;damageConditions;forwardMovement;damageMultiplier;sound;hitSound", "contactCooldownTicks", "delayTicks", "dismountConditions", "knockbackConditions", "damageConditions", "forwardMovement", "damageMultiplier", "sound", "hitSound"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08174.class, "contactCooldownTicks;delayTicks;dismountConditions;knockbackConditions;damageConditions;forwardMovement;damageMultiplier;sound;hitSound", "contactCooldownTicks", "delayTicks", "dismountConditions", "knockbackConditions", "damageConditions", "forwardMovement", "damageMultiplier", "sound", "hitSound"}, this);
    }

    public float B() {
        return this.damageMultiplier;
    }

    public Optional<class03556<class04891>> Z() {
        return this.sound;
    }

    public Optional<class08169> i() {
        return this.knockbackConditions;
    }

    public Optional<class03556<class04891>> z() {
        return this.hitSound;
    }

    public Optional<class08169> u() {
        return this.dismountConditions;
    }

    public int y() {
        return this.contactCooldownTicks;
    }

    public void y(class07049 class070492) {
        this.sound.ifPresent(class035562 -> class070492.method_73183().method_60511(class070492, class070492.method_23317(), class070492.method_23318(), class070492.method_23321(), class035562, class070492.method_5634(), 1.0f, 1.0f));
    }

    public int N() {
        return this.delayTicks + this.damageConditions.map(class08169::N).orElse(0);
    }

    public static class06889 N(class07049 class070492) {
        if (!(class070492 instanceof class08036) && class070492.method_5765()) {
            class070492 = class070492.method_5668();
        }
        return class070492.method_76333().L(20.0);
    }

    public void N(class06584 class065842, int n, class07438 class074382, class07085 class070852) {
        int n2 = class065842.N(class074382) - n;
        if (n2 < this.delayTicks) {
            return;
        }
        n2 -= this.delayTicks;
        class06889 class068892 = class074382.method_5720();
        double d = class068892.y(class08174.N((class07049)class074382));
        float f = class074382 instanceof class08036 ? 1.0f : 0.2f;
        class06543 class065432 = class074382.method_76693();
        double d2 = class074382.method_45326(class05298.u);
        boolean bl = false;
        class04770 class047702 = ((Collection)class08038.N((class07049)class074382, (class06543)class065432, class070492 -> class08172.N((class07049)class074382, class070492), (class05849)class05849.field_17558).map(class061832 -> List.of(), collection -> collection)).iterator();
        while (class047702.hasNext()) {
            boolean bl2;
            boolean bl3;
            class07049 class070493 = ((class06145)class047702.next()).L();
            if (class070493 instanceof class00695) {
                class00695 class006952 = (class00695)class070493;
                class070493 = class006952.N;
            }
            if (bl3 = class074382.method_75118(class070493, this.contactCooldownTicks)) continue;
            class074382.method_75119(class070493);
            double d3 = class068892.y(class08174.N(class070493));
            double d4 = Math.max(0.0, d - d3);
            boolean bl4 = this.dismountConditions.isPresent() && this.dismountConditions.get().N(n2, d, d4, f);
            boolean bl5 = this.knockbackConditions.isPresent() && this.knockbackConditions.get().N(n2, d, d4, f);
            boolean bl6 = bl2 = this.damageConditions.isPresent() && this.damageConditions.get().N(n2, d, d4, f);
            if (!bl4 && !bl5 && !bl2) continue;
            float f2 = (float)d2 + (float)class04995.N((double)(d4 * (double)this.damageMultiplier));
            bl |= class074382.method_75123(class070852, class070493, f2, bl2, bl5, bl4);
        }
        if (bl) {
            class074382.method_73183().method_8421((class07049)class074382, (byte)2);
            if (class074382 instanceof class04770) {
                class047702 = (class04770)class074382;
                class06912.o.N(class047702, class074382.method_76444(class070492 -> class070492 instanceof class07438));
            }
        }
    }

    public Optional<class08169> R() {
        return this.damageConditions;
    }
}

