/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class08043
extends Record {
    final boolean invulnerable;
    final boolean flying;
    final boolean mayFly;
    final boolean instabuild;
    final boolean mayBuild;
    final float flyingSpeed;
    final float walkingSpeed;
    public static final Codec<class08043> B = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.fieldOf("invulnerable").orElse((Object)false).forGetter(class08043::N), (App)Codec.BOOL.fieldOf("flying").orElse((Object)false).forGetter(class08043::y), (App)Codec.BOOL.fieldOf("mayfly").orElse((Object)false).forGetter(class08043::L), (App)Codec.BOOL.fieldOf("instabuild").orElse((Object)false).forGetter(class08043::u), (App)Codec.BOOL.fieldOf("mayBuild").orElse((Object)true).forGetter(class08043::i), (App)Codec.FLOAT.fieldOf("flySpeed").orElse((Object)Float.valueOf(0.05f)).forGetter(class08043::R), (App)Codec.FLOAT.fieldOf("walkSpeed").orElse((Object)Float.valueOf(0.1f)).forGetter(class08043::M)).apply(instance, class08043::new));

    public boolean L() {
        return this.mayFly;
    }

    public float M() {
        return this.walkingSpeed;
    }

    public class08043(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, float f, float f2) {
        this.invulnerable = bl;
        this.flying = bl2;
        this.mayFly = bl3;
        this.instabuild = bl4;
        this.mayBuild = bl5;
        this.flyingSpeed = f;
        this.walkingSpeed = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08043.class, "invulnerable;flying;mayFly;instabuild;mayBuild;flyingSpeed;walkingSpeed", "invulnerable", "flying", "mayFly", "instabuild", "mayBuild", "flyingSpeed", "walkingSpeed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08043.class, "invulnerable;flying;mayFly;instabuild;mayBuild;flyingSpeed;walkingSpeed", "invulnerable", "flying", "mayFly", "instabuild", "mayBuild", "flyingSpeed", "walkingSpeed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08043.class, "invulnerable;flying;mayFly;instabuild;mayBuild;flyingSpeed;walkingSpeed", "invulnerable", "flying", "mayFly", "instabuild", "mayBuild", "flyingSpeed", "walkingSpeed"}, this);
    }

    public boolean i() {
        return this.mayBuild;
    }

    public boolean u() {
        return this.instabuild;
    }

    public boolean y() {
        return this.flying;
    }

    public boolean N() {
        return this.invulnerable;
    }

    public float R() {
        return this.flyingSpeed;
    }
}

