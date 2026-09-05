/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01194
 *  minecraft.class01487
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class08005
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;
import minecraft.class01194;
import minecraft.class01487;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08005;
import org.jspecify.annotations.Nullable;

public final class class03978
extends Record {
    private final class03556<class01194> gameEvent;
    private final float distance;
    private final class06889 pos;
    private final @Nullable UUID uuid;
    private final @Nullable UUID projectileOwnerUuid;
    private final @Nullable class07049 entity;
    public static final Codec<class03978> N = RecordCodecBuilder.create(instance -> instance.group((App)class01194.Nz.fieldOf("game_event").forGetter(class03978::N), (App)Codec.floatRange((float)0.0f, (float)Float.MAX_VALUE).fieldOf("distance").forGetter(class03978::y), (App)class06889.N.fieldOf("pos").forGetter(class03978::L), (App)class01487.N.lenientOptionalFieldOf("source").forGetter(class039782 -> Optional.ofNullable(class039782.u())), (App)class01487.N.lenientOptionalFieldOf("projectile_owner").forGetter(class039782 -> Optional.ofNullable(class039782.i()))).apply(instance, (class035562, f, class068892, optional, optional2) -> new class03978((class03556<class01194>)class035562, f.floatValue(), (class06889)class068892, optional.orElse(null), optional2.orElse(null))));

    public class06889 L() {
        return this.pos;
    }

    public class03978(class03556<class01194> class035562, float f, class06889 class068892, @Nullable UUID uUID, @Nullable UUID uUID2) {
        this(class035562, f, class068892, uUID, uUID2, null);
    }

    public class03978(class03556<class01194> class035562, float f, class06889 class068892, @Nullable UUID uUID, @Nullable UUID uUID2, @Nullable class07049 class070492) {
        this.gameEvent = class035562;
        this.distance = f;
        this.pos = class068892;
        this.uuid = uUID;
        this.projectileOwnerUuid = uUID2;
        this.entity = class070492;
    }

    public class03978(class03556<class01194> class035562, float f, class06889 class068892, @Nullable class07049 class070492) {
        this(class035562, f, class068892, class070492 == null ? null : class070492.method_5667(), class03978.N(class070492), class070492);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03978.class, "gameEvent;distance;pos;uuid;projectileOwnerUuid;entity", "gameEvent", "distance", "pos", "uuid", "projectileOwnerUuid", "entity"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03978.class, "gameEvent;distance;pos;uuid;projectileOwnerUuid;entity", "gameEvent", "distance", "pos", "uuid", "projectileOwnerUuid", "entity"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03978.class, "gameEvent;distance;pos;uuid;projectileOwnerUuid;entity", "gameEvent", "distance", "pos", "uuid", "projectileOwnerUuid", "entity"}, this);
    }

    public @Nullable UUID i() {
        return this.projectileOwnerUuid;
    }

    public @Nullable UUID u() {
        return this.uuid;
    }

    public float y() {
        return this.distance;
    }

    public Optional<class07049> y(class04782 class047822) {
        return this.N(class047822).filter(class070492 -> class070492 instanceof class08005).map(class070492 -> (class08005)class070492).map(class08005::z).or(() -> Optional.ofNullable(this.projectileOwnerUuid).map(arg_0 -> ((class04782)class047822).method_66347(arg_0)));
    }

    public Optional<class07049> N(class04782 class047822) {
        return Optional.ofNullable(this.entity).or(() -> Optional.ofNullable(this.uuid).map(arg_0 -> ((class04782)class047822).method_66347(arg_0)));
    }

    private static @Nullable UUID N(@Nullable class07049 class070492) {
        class08005 class080052;
        if (class070492 instanceof class08005 && (class080052 = (class08005)class070492).z() != null) {
            return class080052.z().method_5667();
        }
        return null;
    }

    public class03556<class01194> N() {
        return this.gameEvent;
    }

    public @Nullable class07049 R() {
        return this.entity;
    }
}

