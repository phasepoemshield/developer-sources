/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01224
 *  minecraft.class05474
 *  minecraft.class06386
 *  minecraft.class07321
 *  minecraft.class07836
 *  minecraft.class08088
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01224;
import minecraft.class05474;
import minecraft.class06386;
import minecraft.class07321;
import minecraft.class07836;
import minecraft.class08088;

public final class class03313<C extends class06386>
extends Record {
    private final C config;
    private final class08088 chunkGenerator;
    private final class01224 structureTemplateManager;
    private final class07321 chunkPos;
    private final class05474 heightAccessor;
    private final class07836 random;
    private final long seed;

    public class01224 L() {
        return this.structureTemplateManager;
    }

    public long M() {
        return this.seed;
    }

    public class03313(C c, class08088 class080882, class01224 class012242, class07321 class073212, class05474 class054742, class07836 class078362, long l) {
        this.config = c;
        this.chunkGenerator = class080882;
        this.structureTemplateManager = class012242;
        this.chunkPos = class073212;
        this.heightAccessor = class054742;
        this.random = class078362;
        this.seed = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03313.class, "config;chunkGenerator;structureTemplateManager;chunkPos;heightAccessor;random;seed", "config", "chunkGenerator", "structureTemplateManager", "chunkPos", "heightAccessor", "random", "seed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03313.class, "config;chunkGenerator;structureTemplateManager;chunkPos;heightAccessor;random;seed", "config", "chunkGenerator", "structureTemplateManager", "chunkPos", "heightAccessor", "random", "seed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03313.class, "config;chunkGenerator;structureTemplateManager;chunkPos;heightAccessor;random;seed", "config", "chunkGenerator", "structureTemplateManager", "chunkPos", "heightAccessor", "random", "seed"}, this);
    }

    public class05474 i() {
        return this.heightAccessor;
    }

    public class07321 u() {
        return this.chunkPos;
    }

    public class08088 y() {
        return this.chunkGenerator;
    }

    public C N() {
        return this.config;
    }

    public class07836 R() {
        return this.random;
    }
}

