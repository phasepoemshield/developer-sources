/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01235
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03689
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04995
 *  minecraft.class05946
 *  minecraft.class06338
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class01235;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03689;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04995;
import minecraft.class05946;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08557;
import minecraft.class08565;

public final class class08576
extends Record {
    private final float blockDelaySeconds;
    private final float disableCooldownScale;
    private final List<class08565> damageReductions;
    private final class08557 itemDamage;
    private final Optional<class03530<class03689>> bypassedBy;
    private final Optional<class03556<class04891>> blockSound;
    private final Optional<class03556<class04891>> disableSound;
    public static final Codec<class08576> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.n.optionalFieldOf("block_delay_seconds", (Object)Float.valueOf(0.0f)).forGetter(class08576::y), (App)class06338.n.optionalFieldOf("disable_cooldown_scale", (Object)Float.valueOf(1.0f)).forGetter(class08576::L), (App)class08565.N.listOf().optionalFieldOf("damage_reductions", List.of(new class08565(90.0f, Optional.empty(), 0.0f, 1.0f))).forGetter(class08576::u), (App)class08557.N.optionalFieldOf("item_damage", (Object)class08557.L).forGetter(class08576::i), (App)class03530.y((class05946)class04227.yN).optionalFieldOf("bypassed_by").forGetter(class08576::R), (App)class04891.y.optionalFieldOf("block_sound").forGetter(class08576::M), (App)class04891.y.optionalFieldOf("disabled_sound").forGetter(class08576::B)).apply(instance, class08576::new));
    public static final class02362<class04247, class08576> y = class02362.N((class02362)class02389.E, class08576::y, (class02362)class02389.E, class08576::L, (class02362)class08565.y.N_33(class02389.N()), class08576::u, class08557.y, class08576::i, (class02362)class03530.L((class05946)class04227.yN).N_33(class02389::N), class08576::R, (class02362)class04891.u.N_33(class02389::N), class08576::M, (class02362)class04891.u.N_33(class02389::N), class08576::B, class08576::new);

    public float L() {
        return this.disableCooldownScale;
    }

    public Optional<class03556<class04891>> M() {
        return this.blockSound;
    }

    public class08576(float f, float f2, List<class08565> list, class08557 class085572, Optional<class03530<class03689>> optional, Optional<class03556<class04891>> optional2, Optional<class03556<class04891>> optional3) {
        this.blockDelaySeconds = f;
        this.disableCooldownScale = f2;
        this.damageReductions = list;
        this.itemDamage = class085572;
        this.bypassedBy = optional;
        this.blockSound = optional2;
        this.disableSound = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08576.class, "blockDelaySeconds;disableCooldownScale;damageReductions;itemDamage;bypassedBy;blockSound;disableSound", "blockDelaySeconds", "disableCooldownScale", "damageReductions", "itemDamage", "bypassedBy", "blockSound", "disableSound"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08576.class, "blockDelaySeconds;disableCooldownScale;damageReductions;itemDamage;bypassedBy;blockSound;disableSound", "blockDelaySeconds", "disableCooldownScale", "damageReductions", "itemDamage", "bypassedBy", "blockSound", "disableSound"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08576.class, "blockDelaySeconds;disableCooldownScale;damageReductions;itemDamage;bypassedBy;blockSound;disableSound", "blockDelaySeconds", "disableCooldownScale", "damageReductions", "itemDamage", "bypassedBy", "blockSound", "disableSound"}, this);
    }

    public Optional<class03556<class04891>> B() {
        return this.disableSound;
    }

    public class08557 i() {
        return this.itemDamage;
    }

    public List<class08565> u() {
        return this.damageReductions;
    }

    public float y() {
        return this.blockDelaySeconds;
    }

    public float N(class07072 class070722, float f, double d) {
        float f2 = 0.0f;
        for (class08565 class085652 : this.damageReductions) {
            f2 += class085652.N(class070722, f, d);
        }
        return class04995.N((float)f2, (float)0.0f, (float)f);
    }

    public int N() {
        return Math.round(this.blockDelaySeconds * 20.0f);
    }

    private int N(float f) {
        float f2 = f * this.disableCooldownScale;
        if (f2 > 0.0f) {
            return Math.round(f2 * 20.0f);
        }
        return 0;
    }

    public void N(class04782 class047822, class07438 class074382, float f, class06584 class065842) {
        int n = this.N(f);
        if (n > 0) {
            if (class074382 instanceof class08036) {
                ((class08036)class074382).method_7357().N(class065842, n);
            }
            class074382.method_6021();
            this.disableSound.ifPresent(class035562 -> class047822.method_60511(null, class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), class035562, class074382.method_5634(), 0.8f, 0.8f + class047822.field_9229.z() * 0.4f));
        }
    }

    public void N(class07299 class072992, class06584 class065842, class07438 class074382, class07050 class070502, float f) {
        int n;
        if (!(class074382 instanceof class08036)) {
            return;
        }
        class08036 class080362 = (class08036)class074382;
        if (!class072992.method_8608()) {
            class080362.method_7259(class01235.L.y((Object)class065842.B()));
        }
        if ((n = this.itemDamage.N(f)) > 0) {
            class065842.N(n, class074382, class070502.N());
        }
    }

    public void N(class04782 class047822, class07438 class074382) {
        this.blockSound.ifPresent(class035562 -> class047822.method_60511(null, class074382.method_23317(), class074382.method_23318(), class074382.method_23321(), class035562, class074382.method_5634(), 1.0f, 0.8f + class047822.field_9229.z() * 0.4f));
    }

    public Optional<class03530<class03689>> R() {
        return this.bypassedBy;
    }
}

