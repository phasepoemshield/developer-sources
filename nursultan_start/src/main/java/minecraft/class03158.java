/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00765
 *  minecraft.class00780
 *  minecraft.class01042
 *  minecraft.class01146
 *  minecraft.class01224
 *  minecraft.class03556
 *  minecraft.class04084
 *  minecraft.class05474
 *  minecraft.class06386
 *  minecraft.class07321
 *  minecraft.class07830
 *  minecraft.class08088
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class01042;
import minecraft.class01146;
import minecraft.class01224;
import minecraft.class03556;
import minecraft.class04084;
import minecraft.class05474;
import minecraft.class06386;
import minecraft.class07321;
import minecraft.class07830;
import minecraft.class08088;

public final class class03158<C extends class06386>
extends Record {
    private final class08088 chunkGenerator;
    private final class00765 biomeSource;
    private final class04084 randomState;
    private final long seed;
    private final class07321 chunkPos;
    private final C config;
    private final class05474 heightAccessor;
    private final Predicate<class03556<class00780>> validBiome;
    private final class01224 structureTemplateManager;
    private final class01042 registryAccess;

    public class04084 L() {
        return this.randomState;
    }

    public class05474 M() {
        return this.heightAccessor;
    }

    public class03158(class08088 class080882, class00765 class007652, class04084 class040842, long l, class07321 class073212, C c, class05474 class054742, Predicate<class03556<class00780>> predicate, class01224 class012242, class01042 class010422) {
        this.chunkGenerator = class080882;
        this.biomeSource = class007652;
        this.randomState = class040842;
        this.seed = l;
        this.chunkPos = class073212;
        this.config = c;
        this.heightAccessor = class054742;
        this.validBiome = predicate;
        this.structureTemplateManager = class012242;
        this.registryAccess = class010422;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03158.class, "chunkGenerator;biomeSource;randomState;seed;chunkPos;config;heightAccessor;validBiome;structureTemplateManager;registryAccess", "chunkGenerator", "biomeSource", "randomState", "seed", "chunkPos", "config", "heightAccessor", "validBiome", "structureTemplateManager", "registryAccess"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03158.class, "chunkGenerator;biomeSource;randomState;seed;chunkPos;config;heightAccessor;validBiome;structureTemplateManager;registryAccess", "chunkGenerator", "biomeSource", "randomState", "seed", "chunkPos", "config", "heightAccessor", "validBiome", "structureTemplateManager", "registryAccess"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03158.class, "chunkGenerator;biomeSource;randomState;seed;chunkPos;config;heightAccessor;validBiome;structureTemplateManager;registryAccess", "chunkGenerator", "biomeSource", "randomState", "seed", "chunkPos", "config", "heightAccessor", "validBiome", "structureTemplateManager", "registryAccess"}, this);
    }

    public Predicate<class03556<class00780>> B() {
        return this.validBiome;
    }

    public class01224 Z() {
        return this.structureTemplateManager;
    }

    public class07321 i() {
        return this.chunkPos;
    }

    public class01042 z() {
        return this.registryAccess;
    }

    public long u() {
        return this.seed;
    }

    public class00765 y() {
        return this.biomeSource;
    }

    public boolean N(class07830 class078302) {
        int n = this.chunkPos.L();
        int n2 = this.chunkPos.u();
        int n3 = this.chunkGenerator.L(n, n2, class078302, this.heightAccessor, this.randomState);
        class03556 var5 = this.chunkGenerator.u().method_38109(class01146.N((int)n), class01146.N((int)n3), class01146.N((int)n2), this.randomState.y());
        return this.validBiome.test((class03556<class00780>)var5);
    }

    public class08088 N() {
        return this.chunkGenerator;
    }

    public C R() {
        return this.config;
    }
}

