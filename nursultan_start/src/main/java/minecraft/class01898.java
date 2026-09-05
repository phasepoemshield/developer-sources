/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01603
 *  minecraft.class01623
 *  minecraft.class02796
 *  minecraft.class03545
 *  minecraft.class03554
 *  minecraft.class03776
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01603;
import minecraft.class01623;
import minecraft.class02796;
import minecraft.class03545;
import minecraft.class03554;
import minecraft.class03776;

public final class class01898
extends Record {
    private final class01623 packRepository;
    private final class03776 initialDataConfig;
    private final boolean safeMode;
    private final boolean initMode;

    public class03776 L() {
        return this.initialDataConfig;
    }

    public class01898(class01623 class016232, class03776 class037762, boolean bl, boolean bl2) {
        this.packRepository = class016232;
        this.initialDataConfig = class037762;
        this.safeMode = bl;
        this.initMode = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01898.class, "packRepository;initialDataConfig;safeMode;initMode", "packRepository", "initialDataConfig", "safeMode", "initMode"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01898.class, "packRepository;initialDataConfig;safeMode;initMode", "packRepository", "initialDataConfig", "safeMode", "initMode"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01898.class, "packRepository;initialDataConfig;safeMode;initMode", "packRepository", "initialDataConfig", "safeMode", "initMode"}, this);
    }

    public boolean i() {
        return this.initMode;
    }

    public boolean u() {
        return this.safeMode;
    }

    public class01623 y() {
        return this.packRepository;
    }

    public Pair<class03776, class03554> N() {
        class03776 class037762 = class02796.N((class01623)this.packRepository, (class03776)this.initialDataConfig, (boolean)this.initMode, (boolean)this.safeMode);
        List var2 = this.packRepository.B();
        class03545 class035452 = new class03545(class01603.field_14190, var2);
        return Pair.of((Object)class037762, (Object)class035452);
    }
}

