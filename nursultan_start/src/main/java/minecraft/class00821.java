/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00142
 *  minecraft.class02219
 *  minecraft.class02506
 *  minecraft.class02666
 *  minecraft.class03622
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05196
 *  minecraft.class05908
 *  minecraft.class05919
 *  minecraft.class05927
 *  minecraft.class05957
 *  minecraft.class06110
 *  minecraft.class06338
 *  minecraft.class06551
 *  minecraft.class06843
 *  minecraft.class06889
 *  minecraft.class06925
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07700
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00142;
import minecraft.class00753;
import minecraft.class00761;
import minecraft.class00809;
import minecraft.class00810;
import minecraft.class00820;
import minecraft.class00829;
import minecraft.class00833;
import minecraft.class00834;
import minecraft.class02219;
import minecraft.class02506;
import minecraft.class02666;
import minecraft.class03622;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05196;
import minecraft.class05908;
import minecraft.class05919;
import minecraft.class05927;
import minecraft.class05957;
import minecraft.class06110;
import minecraft.class06338;
import minecraft.class06551;
import minecraft.class06843;
import minecraft.class06889;
import minecraft.class06925;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07700;
import org.jspecify.annotations.Nullable;

public final class class00821
extends Record {
    private final Optional<class00829> entityType;
    private final Optional<class00761> distanceToPlayer;
    private final Optional<class02219> movement;
    private final class00833 location;
    private final Optional<class00834> effects;
    private final Optional<class00809> nbt;
    private final Optional<class00820> flags;
    private final Optional<class06110> equipment;
    private final Optional<class03622> subPredicate;
    private final Optional<Integer> periodicTick;
    private final Optional<class00821> vehicle;
    private final Optional<class00821> passenger;
    private final Optional<class00821> targetedEntity;
    private final Optional<String> team;
    private final Optional<class02506> slots;
    private final class00142 components;
    public static final Codec<class00821> N = Codec.recursive((String)"EntityPredicate", codec -> RecordCodecBuilder.create(instance -> instance.group((App)class00829.N.optionalFieldOf("type").forGetter(class00821::N), (App)class00761.N.optionalFieldOf("distance").forGetter(class00821::y), (App)class02219.N.optionalFieldOf("movement").forGetter(class00821::L), (App)class00833.u.forGetter(class00821::u), (App)class00834.N.optionalFieldOf("effects").forGetter(class00821::i), (App)class00809.N.optionalFieldOf("nbt").forGetter(class00821::R), (App)class00820.N.optionalFieldOf("flags").forGetter(class00821::M), (App)class06110.N.optionalFieldOf("equipment").forGetter(class00821::B), (App)class03622.L.optionalFieldOf("type_specific").forGetter(class00821::Z), (App)class06338.b.optionalFieldOf("periodic_tick").forGetter(class00821::z), (App)codec.optionalFieldOf("vehicle").forGetter(class00821::U), (App)codec.optionalFieldOf("passenger").forGetter(class00821::E), (App)codec.optionalFieldOf("targeted_entity").forGetter(class00821::W), (App)Codec.STRING.optionalFieldOf("team").forGetter(class00821::m), (App)class02506.N.optionalFieldOf("slots").forGetter(class00821::P), (App)class00142.y.forGetter(class00821::s)).apply((Applicative)instance, class00821::new)));
    public static final Codec<class05196> y = Codec.withAlternative((Codec)class05196.N, N, class00821::N);

    public Optional<class02219> L() {
        return this.movement;
    }

    public Optional<class00820> M() {
        return this.flags;
    }

    public Optional<class02506> P() {
        return this.slots;
    }

    public class00821(Optional<class00829> optional, Optional<class00761> optional2, Optional<class02219> optional3, class00833 class008332, Optional<class00834> optional4, Optional<class00809> optional5, Optional<class00820> optional6, Optional<class06110> optional7, Optional<class03622> optional8, Optional<Integer> optional9, Optional<class00821> optional10, Optional<class00821> optional11, Optional<class00821> optional12, Optional<String> optional13, Optional<class02506> optional14, class00142 class001422) {
        this.entityType = optional;
        this.distanceToPlayer = optional2;
        this.movement = optional3;
        this.location = class008332;
        this.effects = optional4;
        this.nbt = optional5;
        this.flags = optional6;
        this.equipment = optional7;
        this.subPredicate = optional8;
        this.periodicTick = optional9;
        this.vehicle = optional10;
        this.passenger = optional11;
        this.targetedEntity = optional12;
        this.team = optional13;
        this.slots = optional14;
        this.components = class001422;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00821.class, "entityType;distanceToPlayer;movement;location;effects;nbt;flags;equipment;subPredicate;periodicTick;vehicle;passenger;targetedEntity;team;slots;components", "entityType", "distanceToPlayer", "movement", "location", "effects", "nbt", "flags", "equipment", "subPredicate", "periodicTick", "vehicle", "passenger", "targetedEntity", "team", "slots", "components"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00821.class, "entityType;distanceToPlayer;movement;location;effects;nbt;flags;equipment;subPredicate;periodicTick;vehicle;passenger;targetedEntity;team;slots;components", "entityType", "distanceToPlayer", "movement", "location", "effects", "nbt", "flags", "equipment", "subPredicate", "periodicTick", "vehicle", "passenger", "targetedEntity", "team", "slots", "components"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00821.class, "entityType;distanceToPlayer;movement;location;effects;nbt;flags;equipment;subPredicate;periodicTick;vehicle;passenger;targetedEntity;team;slots;components", "entityType", "distanceToPlayer", "movement", "location", "effects", "nbt", "flags", "equipment", "subPredicate", "periodicTick", "vehicle", "passenger", "targetedEntity", "team", "slots", "components"}, this);
    }

    public Optional<class06110> B() {
        return this.equipment;
    }

    public Optional<class03622> Z() {
        return this.subPredicate;
    }

    public Optional<class00834> i() {
        return this.effects;
    }

    public class00142 s() {
        return this.components;
    }

    public Optional<String> m() {
        return this.team;
    }

    public Optional<class00821> U() {
        return this.vehicle;
    }

    public Optional<Integer> z() {
        return this.periodicTick;
    }

    public class00833 u() {
        return this.location;
    }

    public Optional<class00761> y() {
        return this.distanceToPlayer;
    }

    public static class05908 y(class04770 class047702, class07049 class070492) {
        class04162 class041622 = new class04160(class047702.method_51469()).N(class06551.N, (Object)class070492).N(class06551.B, (Object)class047702.method_73189()).N(class06925.P);
        return new class05927(class041622).N(Optional.empty());
    }

    public Optional<class00821> E() {
        return this.passenger;
    }

    public static class05196 N(class00810 class008102) {
        return class00821.N(class008102.y());
    }

    public boolean N(class04770 class047702, @Nullable class07049 class070492) {
        return this.N(class047702.method_51469(), class047702.method_73189(), class070492);
    }

    public static List<class05196> N(class00810 ... class00810Array) {
        return Stream.of(class00810Array).map(class00821::N).toList();
    }

    public static class05196 N(class00821 class008212) {
        class05957 class059572 = class07700.N((class05919)class05919.field_935, (class00821)class008212).build();
        return new class05196(List.of(class059572));
    }

    public boolean N(class04782 class047822, @Nullable class06889 class068892, @Nullable class07049 class070493) {
        class06889 class068893;
        if (class070493 == null) {
            return false;
        }
        if (this.entityType.isPresent() && !this.entityType.get().N(class070493.method_5864())) {
            return false;
        }
        if (class068892 == null ? this.distanceToPlayer.isPresent() : this.distanceToPlayer.isPresent() && !this.distanceToPlayer.get().N(class068892.M, class068892.B, class068892.Z, class070493.method_23317(), class070493.method_23318(), class070493.method_23321())) {
            return false;
        }
        if (this.movement.isPresent()) {
            class068893 = class070493.method_60478();
            class06889 class068894 = class068893.L(20.0);
            if (!this.movement.get().N(class068894.M, class068894.B, class068894.Z, class070493.field_6017)) {
                return false;
            }
        }
        if (this.location.N().isPresent() && !this.location.N().get().N(class047822, class070493.method_23317(), class070493.method_23318(), class070493.method_23321())) {
            return false;
        }
        if (this.location.y().isPresent()) {
            class068893 = class06889.y((class00753)class070493.method_23312());
            if (!class070493.method_24828() || !this.location.y().get().N(class047822, class068893.N(), class068893.y(), class068893.L())) {
                return false;
            }
        }
        if (this.location.L().isPresent()) {
            class068893 = class06889.y((class00753)class070493.method_23314());
            if (!this.location.L().get().N(class047822, class068893.N(), class068893.y(), class068893.L())) {
                return false;
            }
        }
        if (this.effects.isPresent() && !this.effects.get().N(class070493)) {
            return false;
        }
        if (this.flags.isPresent() && !this.flags.get().N(class070493)) {
            return false;
        }
        if (this.equipment.isPresent() && !this.equipment.get().N(class070493)) {
            return false;
        }
        if (this.subPredicate.isPresent() && !this.subPredicate.get().N(class070493, class047822, class068892)) {
            return false;
        }
        if (this.vehicle.isPresent() && !this.vehicle.get().N(class047822, class068892, class070493.method_5854())) {
            return false;
        }
        if (this.passenger.isPresent() && class070493.method_5685().stream().noneMatch(class070492 -> this.passenger.get().N(class047822, class068892, (class07049)class070492))) {
            return false;
        }
        if (this.targetedEntity.isPresent() && !this.targetedEntity.get().N(class047822, class068892, (class07049)(class070493 instanceof class07079 ? ((class07079)class070493).T() : null))) {
            return false;
        }
        if (this.periodicTick.isPresent() && class070493.field_6012 % this.periodicTick.get() != 0) {
            return false;
        }
        if (this.team.isPresent() && ((class068893 = class070493.method_5781()) == null || !this.team.get().equals(class068893.L()))) {
            return false;
        }
        if (this.slots.isPresent() && !this.slots.get().N((class06843)class070493)) {
            return false;
        }
        if (!this.components.test((class02666)class070493)) {
            return false;
        }
        return this.nbt.isEmpty() || this.nbt.get().N(class070493);
    }

    public static Optional<class05196> N(Optional<class00821> optional) {
        return optional.map(class00821::N);
    }

    public Optional<class00829> N() {
        return this.entityType;
    }

    public Optional<class00821> W() {
        return this.targetedEntity;
    }

    public Optional<class00809> R() {
        return this.nbt;
    }
}

