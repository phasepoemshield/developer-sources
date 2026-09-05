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
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class06338
 *  minecraft.class06993
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import minecraft.class00225;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class06338;
import minecraft.class06993;

public final class class00195<EnvironmentType>
extends Record {
    private final EnvironmentType environment;
    private final class01894 structure;
    private final int maxTicks;
    private final int setupTicks;
    private final boolean required;
    private final class06993 rotation;
    private final boolean manualOnly;
    private final int maxAttempts;
    private final int requiredSuccesses;
    private final boolean skyAccess;
    public static final MapCodec<class00195<class03556<class00225>>> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00225.y.fieldOf("environment").forGetter(class00195::N), (App)class01894.N.fieldOf("structure").forGetter(class00195::y), (App)class06338.b.fieldOf("max_ticks").forGetter(class00195::L), (App)class06338.T.optionalFieldOf("setup_ticks", (Object)0).forGetter(class00195::u), (App)Codec.BOOL.optionalFieldOf("required", (Object)true).forGetter(class00195::i), (App)class06993.field_39313.optionalFieldOf("rotation", (Object)class06993.field_11467).forGetter(class00195::R), (App)Codec.BOOL.optionalFieldOf("manual_only", (Object)false).forGetter(class00195::M), (App)class06338.b.optionalFieldOf("max_attempts", (Object)1).forGetter(class00195::B), (App)class06338.b.optionalFieldOf("required_successes", (Object)1).forGetter(class00195::Z), (App)Codec.BOOL.optionalFieldOf("sky_access", (Object)false).forGetter(class00195::z)).apply(instance, class00195::new));

    public int L() {
        return this.maxTicks;
    }

    public boolean M() {
        return this.manualOnly;
    }

    public class00195(EnvironmentType EnvironmentType, class01894 class018942, int n, int n2, boolean bl, class06993 class069932) {
        this(EnvironmentType, class018942, n, n2, bl, class069932, false, 1, 1, false);
    }

    public class00195(EnvironmentType EnvironmentType, class01894 class018942, int n, int n2, boolean bl, class06993 class069932, boolean bl2, int n3, int n4, boolean bl3) {
        this.environment = EnvironmentType;
        this.structure = class018942;
        this.maxTicks = n;
        this.setupTicks = n2;
        this.required = bl;
        this.rotation = class069932;
        this.manualOnly = bl2;
        this.maxAttempts = n3;
        this.requiredSuccesses = n4;
        this.skyAccess = bl3;
    }

    public class00195(EnvironmentType EnvironmentType, class01894 class018942, int n, int n2, boolean bl) {
        this(EnvironmentType, class018942, n, n2, bl, class06993.field_11467);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00195.class, "environment;structure;maxTicks;setupTicks;required;rotation;manualOnly;maxAttempts;requiredSuccesses;skyAccess", "environment", "structure", "maxTicks", "setupTicks", "required", "rotation", "manualOnly", "maxAttempts", "requiredSuccesses", "skyAccess"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00195.class, "environment;structure;maxTicks;setupTicks;required;rotation;manualOnly;maxAttempts;requiredSuccesses;skyAccess", "environment", "structure", "maxTicks", "setupTicks", "required", "rotation", "manualOnly", "maxAttempts", "requiredSuccesses", "skyAccess"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00195.class, "environment;structure;maxTicks;setupTicks;required;rotation;manualOnly;maxAttempts;requiredSuccesses;skyAccess", "environment", "structure", "maxTicks", "setupTicks", "required", "rotation", "manualOnly", "maxAttempts", "requiredSuccesses", "skyAccess"}, this);
    }

    public int B() {
        return this.maxAttempts;
    }

    public int Z() {
        return this.requiredSuccesses;
    }

    public boolean i() {
        return this.required;
    }

    public boolean z() {
        return this.skyAccess;
    }

    public int u() {
        return this.setupTicks;
    }

    public class01894 y() {
        return this.structure;
    }

    public <T> class00195<T> N(Function<EnvironmentType, T> function) {
        return new class00195<T>(function.apply(this.environment), this.structure, this.maxTicks, this.setupTicks, this.required, this.rotation, this.manualOnly, this.maxAttempts, this.requiredSuccesses, this.skyAccess);
    }

    public EnvironmentType N() {
        return this.environment;
    }

    public class06993 R() {
        return this.rotation;
    }
}

