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
 *  minecraft.class03748
 *  minecraft.class07299
 *  minecraft.class08035
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00617;
import minecraft.class03748;
import minecraft.class07299;
import minecraft.class08035;

public final class class00586
extends Record {
    private final class00617 canSleep;
    private final class00617 canSetSpawn;
    private final boolean explodes;
    private final Optional<class00392> errorMessage;
    public static final class00586 N = new class00586(class00617.field_63707, class00617.field_63706, false, Optional.of(class00392.L((String)"block.minecraft.bed.no_sleep")));
    public static final class00586 y = new class00586(class00617.field_63708, class00617.field_63708, true, Optional.empty());
    public static final Codec<class00586> L = RecordCodecBuilder.create(instance -> instance.group((App)class00617.field_63709.fieldOf("can_sleep").forGetter(class00586::y), (App)class00617.field_63709.fieldOf("can_set_spawn").forGetter(class00586::L), (App)Codec.BOOL.optionalFieldOf("explodes", (Object)false).forGetter(class00586::u), (App)class03748.N.optionalFieldOf("error_message").forGetter(class00586::i)).apply(instance, class00586::new));

    public class00617 L() {
        return this.canSetSpawn;
    }

    public class00586(class00617 class006172, class00617 class006173, boolean bl, Optional<class00392> optional) {
        this.canSleep = class006172;
        this.canSetSpawn = class006173;
        this.explodes = bl;
        this.errorMessage = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00586.class, "canSleep;canSetSpawn;explodes;errorMessage", "canSleep", "canSetSpawn", "explodes", "errorMessage"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00586.class, "canSleep;canSetSpawn;explodes;errorMessage", "canSleep", "canSetSpawn", "explodes", "errorMessage"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00586.class, "canSleep;canSetSpawn;explodes;errorMessage", "canSleep", "canSetSpawn", "explodes", "errorMessage"}, this);
    }

    public Optional<class00392> i() {
        return this.errorMessage;
    }

    public boolean u() {
        return this.explodes;
    }

    public boolean y(class07299 class072992) {
        return this.canSetSpawn.N(class072992);
    }

    public class00617 y() {
        return this.canSleep;
    }

    public class08035 N() {
        return new class08035((class00392)this.errorMessage.orElse(null));
    }

    public boolean N(class07299 class072992) {
        return this.canSleep.N(class072992);
    }
}

