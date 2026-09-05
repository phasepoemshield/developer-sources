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
 *  minecraft.class02142
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02142;

public final class class07370
extends Record {
    private final class02142 monsterSpawnLightTest;
    private final int monsterSpawnBlockLightLimit;
    public static final MapCodec<class07370> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02142.N((int)0, (int)15).fieldOf("monster_spawn_light_level").forGetter(class07370::N), (App)Codec.intRange((int)0, (int)15).fieldOf("monster_spawn_block_light_limit").forGetter(class07370::y)).apply(instance, class07370::new));

    public class07370(class02142 class021422, int n) {
        this.monsterSpawnLightTest = class021422;
        this.monsterSpawnBlockLightLimit = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07370.class, "monsterSpawnLightTest;monsterSpawnBlockLightLimit", "monsterSpawnLightTest", "monsterSpawnBlockLightLimit"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07370.class, "monsterSpawnLightTest;monsterSpawnBlockLightLimit", "monsterSpawnLightTest", "monsterSpawnBlockLightLimit"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07370.class, "monsterSpawnLightTest;monsterSpawnBlockLightLimit", "monsterSpawnLightTest", "monsterSpawnBlockLightLimit"}, this);
    }

    public int y() {
        return this.monsterSpawnBlockLightLimit;
    }

    public class02142 N() {
        return this.monsterSpawnLightTest;
    }
}

