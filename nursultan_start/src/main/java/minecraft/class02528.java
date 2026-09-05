/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00891
 *  minecraft.class00931
 *  minecraft.class01284
 *  minecraft.class02247
 *  minecraft.class02546
 *  minecraft.class02560
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class03689
 *  minecraft.class04227
 *  minecraft.class04540
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class05946
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07328
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00891;
import minecraft.class00931;
import minecraft.class01284;
import minecraft.class02247;
import minecraft.class02525;
import minecraft.class02546;
import minecraft.class02560;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class03689;
import minecraft.class04227;
import minecraft.class04540;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class05946;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07328;
import org.jspecify.annotations.Nullable;

public final class class02528
extends Record
implements class02560 {
    private final boolean attributeToUser;
    private final Optional<class03556<class03689>> damageType;
    private final Optional<class02546> knockbackMultiplier;
    private final Optional<class03543<class00891>> immuneBlocks;
    private final class06889 offset;
    private final class02546 radius;
    private final boolean createFire;
    private final class07328 blockInteraction;
    private final class07126 smallParticle;
    private final class07126 largeParticle;
    private final class04540<class00931> blockParticles;
    private final class03556<class04891> sound;
    public static final MapCodec<class02528> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("attribute_to_user", (Object)false).forGetter(class02528::y), (App)class03689.y.optionalFieldOf("damage_type").forGetter(class02528::L), (App)class02546.y.optionalFieldOf("knockback_multiplier").forGetter(class02528::u), (App)class03541.N((class05946)class04227.Z).optionalFieldOf("immune_blocks").forGetter(class02528::i), (App)class06889.N.optionalFieldOf("offset", (Object)class06889.L).forGetter(class02528::R), (App)class02546.y.fieldOf("radius").forGetter(class02528::M), (App)Codec.BOOL.optionalFieldOf("create_fire", (Object)false).forGetter(class02528::B), (App)class07328.field_51780.fieldOf("block_interaction").forGetter(class02528::Z), (App)class07107.yE.fieldOf("small_particle").forGetter(class02528::z), (App)class07107.yE.fieldOf("large_particle").forGetter(class02528::U), (App)class04540.N((MapCodec)class00931.N).optionalFieldOf("block_particles", (Object)class04540.N()).forGetter(class02528::E), (App)class04891.y.fieldOf("sound").forGetter(class02528::W)).apply(instance, class02528::new));

    public Optional<class03556<class03689>> L() {
        return this.damageType;
    }

    public class02546 M() {
        return this.radius;
    }

    public class02528(boolean bl, Optional<class03556<class03689>> optional, Optional<class02546> optional2, Optional<class03543<class00891>> optional3, class06889 class068892, class02546 class025462, boolean bl2, class07328 class073282, class07126 class071262, class07126 class071263, class04540<class00931> class045402, class03556<class04891> class035562) {
        this.attributeToUser = bl;
        this.damageType = optional;
        this.knockbackMultiplier = optional2;
        this.immuneBlocks = optional3;
        this.offset = class068892;
        this.radius = class025462;
        this.createFire = bl2;
        this.blockInteraction = class073282;
        this.smallParticle = class071262;
        this.largeParticle = class071263;
        this.blockParticles = class045402;
        this.sound = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02528.class, "attributeToUser;damageType;knockbackMultiplier;immuneBlocks;offset;radius;createFire;blockInteraction;smallParticle;largeParticle;blockParticles;sound", "attributeToUser", "damageType", "knockbackMultiplier", "immuneBlocks", "offset", "radius", "createFire", "blockInteraction", "smallParticle", "largeParticle", "blockParticles", "sound"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02528.class, "attributeToUser;damageType;knockbackMultiplier;immuneBlocks;offset;radius;createFire;blockInteraction;smallParticle;largeParticle;blockParticles;sound", "attributeToUser", "damageType", "knockbackMultiplier", "immuneBlocks", "offset", "radius", "createFire", "blockInteraction", "smallParticle", "largeParticle", "blockParticles", "sound"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02528.class, "attributeToUser;damageType;knockbackMultiplier;immuneBlocks;offset;radius;createFire;blockInteraction;smallParticle;largeParticle;blockParticles;sound", "attributeToUser", "damageType", "knockbackMultiplier", "immuneBlocks", "offset", "radius", "createFire", "blockInteraction", "smallParticle", "largeParticle", "blockParticles", "sound"}, this);
    }

    public boolean B() {
        return this.createFire;
    }

    public class07328 Z() {
        return this.blockInteraction;
    }

    public Optional<class03543<class00891>> i() {
        return this.immuneBlocks;
    }

    public class07126 U() {
        return this.largeParticle;
    }

    public class07126 z() {
        return this.smallParticle;
    }

    public Optional<class02546> u() {
        return this.knockbackMultiplier;
    }

    public boolean y() {
        return this.attributeToUser;
    }

    public class04540<class00931> E() {
        return this.blockParticles;
    }

    private @Nullable class07072 N(class07049 class070492, class06889 class068892) {
        if (this.damageType.isEmpty()) {
            return null;
        }
        if (this.attributeToUser) {
            return new class07072(this.damageType.get(), class070492);
        }
        return new class07072(this.damageType.get(), class068892);
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892) {
        class06889 class068893 = class068892.i(this.offset);
        class047822.method_8454((class07049)(this.attributeToUser ? class070492 : null), this.N(class070492, class068893), (class01284)new class02247(this.blockInteraction != class07328.field_40888, this.damageType.isPresent(), this.knockbackMultiplier.map(class025462 -> Float.valueOf(class025462.N(n))), this.immuneBlocks), class068893.N(), class068893.y(), class068893.L(), Math.max(this.radius.N(n), 0.0f), this.createFire, this.blockInteraction, this.smallParticle, this.largeParticle, this.blockParticles, this.sound);
    }

    public MapCodec<class02528> N() {
        return N;
    }

    public class03556<class04891> W() {
        return this.sound;
    }

    public class06889 R() {
        return this.offset;
    }
}

