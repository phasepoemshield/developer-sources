/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00765
 *  minecraft.class00780
 *  minecraft.class01042
 *  minecraft.class01224
 *  minecraft.class03556
 *  minecraft.class04084
 *  minecraft.class05474
 *  minecraft.class06069
 *  minecraft.class06075
 *  minecraft.class07321
 *  minecraft.class07836
 *  minecraft.class08088
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class01042;
import minecraft.class01224;
import minecraft.class03556;
import minecraft.class04084;
import minecraft.class05474;
import minecraft.class06069;
import minecraft.class06075;
import minecraft.class07321;
import minecraft.class07836;
import minecraft.class08088;

public final class class04764
extends Record {
    private final class01042 registryAccess;
    final class08088 chunkGenerator;
    private final class00765 biomeSource;
    final class04084 randomState;
    private final class01224 structureTemplateManager;
    private final class07836 random;
    private final long seed;
    private final class07321 chunkPos;
    private final class05474 heightAccessor;
    final Predicate<class03556<class00780>> validBiome;

    public class00765 L() {
        return this.biomeSource;
    }

    public long M() {
        return this.seed;
    }

    public class04764(class01042 class010422, class08088 class080882, class00765 class007652, class04084 class040842, class01224 class012242, long l, class07321 class073212, class05474 class054742, Predicate<class03556<class00780>> predicate) {
        this(class010422, class080882, class007652, class040842, class012242, class04764.N(l, class073212), l, class073212, class054742, predicate);
    }

    public class04764(class01042 class010422, class08088 class080882, class00765 class007652, class04084 class040842, class01224 class012242, class07836 class078362, long l, class07321 class073212, class05474 class054742, Predicate<class03556<class00780>> predicate) {
        this.registryAccess = class010422;
        this.chunkGenerator = class080882;
        this.biomeSource = class007652;
        this.randomState = class040842;
        this.structureTemplateManager = class012242;
        this.random = class078362;
        this.seed = l;
        this.chunkPos = class073212;
        this.heightAccessor = class054742;
        this.validBiome = predicate;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04764.class, "registryAccess;chunkGenerator;biomeSource;randomState;structureTemplateManager;random;seed;chunkPos;heightAccessor;validBiome", "registryAccess", "chunkGenerator", "biomeSource", "randomState", "structureTemplateManager", "random", "seed", "chunkPos", "heightAccessor", "validBiome"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04764.class, "registryAccess;chunkGenerator;biomeSource;randomState;structureTemplateManager;random;seed;chunkPos;heightAccessor;validBiome", "registryAccess", "chunkGenerator", "biomeSource", "randomState", "structureTemplateManager", "random", "seed", "chunkPos", "heightAccessor", "validBiome"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04764.class, "registryAccess;chunkGenerator;biomeSource;randomState;structureTemplateManager;random;seed;chunkPos;heightAccessor;validBiome", "registryAccess", "chunkGenerator", "biomeSource", "randomState", "structureTemplateManager", "random", "seed", "chunkPos", "heightAccessor", "validBiome"}, this);
    }

    public class07321 B() {
        return this.chunkPos;
    }

    public class05474 Z() {
        return this.heightAccessor;
    }

    public class01224 i() {
        return this.structureTemplateManager;
    }

    public Predicate<class03556<class00780>> z() {
        return this.validBiome;
    }

    public class04084 u() {
        return this.randomState;
    }

    public class08088 y() {
        return this.chunkGenerator;
    }

    private static class07836 N(long l, class07321 class073212) {
        class07836 class078362 = new class07836((class06069)new class06075(0L));
        class078362.L(l, class073212.B, class073212.Z);
        return class078362;
    }

    public class01042 N() {
        return this.registryAccess;
    }

    public class07836 R() {
        return this.random;
    }
}

