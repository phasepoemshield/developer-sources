/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06289
 *  minecraft.class07282
 *  minecraft.class07299
 *  minecraft.class07376
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00667;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06289;
import minecraft.class07282;
import minecraft.class07299;
import minecraft.class07376;
import org.jspecify.annotations.Nullable;

public final class class04167
extends Record {
    private final class03556<class07376> dimensionType;
    private final class05946<class07299> dimension;
    private final long seed;
    private final class07282 gameType;
    private final @Nullable class07282 previousGameType;
    private final boolean isDebug;
    private final boolean isFlat;
    private final Optional<class06289> lastDeathLocation;
    private final int portalCooldown;
    private final int seaLevel;

    public long L() {
        return this.seed;
    }

    public boolean M() {
        return this.isFlat;
    }

    public class04167(class04247 class042472) {
        this((class03556<class07376>)((class03556)class07376.z.decode((Object)class042472)), (class05946<class07299>)class042472.N(class04227.yg), class042472.readLong(), class07282.N((int)class042472.readByte()), class07282.y((int)class042472.readByte()), class042472.readBoolean(), class042472.readBoolean(), class042472.y(class00667::M), class042472.E(), class042472.E());
    }

    public class04167(class03556<class07376> class035562, class05946<class07299> class059462, long l, class07282 class072822, @Nullable class07282 class072823, boolean bl, boolean bl2, Optional<class06289> optional, int n, int n2) {
        this.dimensionType = class035562;
        this.dimension = class059462;
        this.seed = l;
        this.gameType = class072822;
        this.previousGameType = class072823;
        this.isDebug = bl;
        this.isFlat = bl2;
        this.lastDeathLocation = optional;
        this.portalCooldown = n;
        this.seaLevel = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04167.class, "dimensionType;dimension;seed;gameType;previousGameType;isDebug;isFlat;lastDeathLocation;portalCooldown;seaLevel", "dimensionType", "dimension", "seed", "gameType", "previousGameType", "isDebug", "isFlat", "lastDeathLocation", "portalCooldown", "seaLevel"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04167.class, "dimensionType;dimension;seed;gameType;previousGameType;isDebug;isFlat;lastDeathLocation;portalCooldown;seaLevel", "dimensionType", "dimension", "seed", "gameType", "previousGameType", "isDebug", "isFlat", "lastDeathLocation", "portalCooldown", "seaLevel"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04167.class, "dimensionType;dimension;seed;gameType;previousGameType;isDebug;isFlat;lastDeathLocation;portalCooldown;seaLevel", "dimensionType", "dimension", "seed", "gameType", "previousGameType", "isDebug", "isFlat", "lastDeathLocation", "portalCooldown", "seaLevel"}, this);
    }

    public Optional<class06289> B() {
        return this.lastDeathLocation;
    }

    public int Z() {
        return this.portalCooldown;
    }

    public @Nullable class07282 i() {
        return this.previousGameType;
    }

    public int z() {
        return this.seaLevel;
    }

    public class07282 u() {
        return this.gameType;
    }

    public class05946<class07299> y() {
        return this.dimension;
    }

    public void N(class04247 class042472) {
        class07376.z.encode((Object)class042472, this.dimensionType);
        class042472.y(this.dimension);
        class042472.writeLong(this.seed);
        class042472.writeByte(this.gameType.N());
        class042472.writeByte(class07282.N((class07282)this.previousGameType));
        class042472.writeBoolean(this.isDebug);
        class042472.writeBoolean(this.isFlat);
        class042472.N_13(this.lastDeathLocation, class00667::N);
        class042472.L(this.portalCooldown);
        class042472.L(this.seaLevel);
    }

    public class03556<class07376> N() {
        return this.dimensionType;
    }

    public boolean R() {
        return this.isDebug;
    }
}

