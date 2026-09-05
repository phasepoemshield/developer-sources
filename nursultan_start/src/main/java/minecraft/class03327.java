/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 *  minecraft.class07282
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import minecraft.class03342;
import minecraft.class06338;
import minecraft.class07282;

final class class03327
extends Record {
    private final class03342 quickPlayWorld;
    private final Instant lastPlayedTime;
    private final class07282 gamemode;
    public static final Codec<class03327> N = RecordCodecBuilder.create(instance -> instance.group((App)class03342.N.forGetter(class03327::N), (App)class06338.l.fieldOf("lastPlayedTime").forGetter(class03327::y), (App)class07282.field_41676.fieldOf("gamemode").forGetter(class03327::L)).apply(instance, class03327::new));

    public class07282 L() {
        return this.gamemode;
    }

    class03327(class03342 class033422, Instant instant, class07282 class072822) {
        this.quickPlayWorld = class033422;
        this.lastPlayedTime = instant;
        this.gamemode = class072822;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03327.class, "quickPlayWorld;lastPlayedTime;gamemode", "quickPlayWorld", "lastPlayedTime", "gamemode"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03327.class, "quickPlayWorld;lastPlayedTime;gamemode", "quickPlayWorld", "lastPlayedTime", "gamemode"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03327.class, "quickPlayWorld;lastPlayedTime;gamemode", "quickPlayWorld", "lastPlayedTime", "gamemode"}, this);
    }

    public Instant y() {
        return this.lastPlayedTime;
    }

    public class03342 N() {
        return this.quickPlayWorld;
    }
}

