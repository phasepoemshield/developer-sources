/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01471
 *  minecraft.class01474
 *  minecraft.class01476
 *  minecraft.class01479
 *  minecraft.class03647
 *  minecraft.class05054
 *  minecraft.class05291
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01471;
import minecraft.class01474;
import minecraft.class01476;
import minecraft.class01479;
import minecraft.class03647;
import minecraft.class05054;
import minecraft.class05291;

public class class01439 {
    public final class01471 N;
    private final class05291 L;
    public final class01471 y;
    private final class01479 u;
    private final Optional<class03647> i;
    private class01471 R;
    private final class05054 M;
    private List<class01474> B = ImmutableList.of();
    private boolean Z;
    private boolean z;

    public class01476 L() {
        return new class01476(this.N, this.L, this.y, this.u, this.i, this.R, this.M, this.B, this.Z, this.z);
    }

    public class01439(class01471 class014712, class05291 class052912, class01471 class014713, class01479 class014792, Optional<class03647> optional, class05054 class050542) {
        this.N = class014712;
        this.L = class052912;
        this.y = class014713;
        this.R = class01471.N((class00891)class00869.z);
        this.u = class014792;
        this.i = optional;
        this.M = class050542;
    }

    public class01439(class01471 class014712, class05291 class052912, class01471 class014713, class01479 class014792, class05054 class050542) {
        this(class014712, class052912, class014713, class014792, Optional.empty(), class050542);
    }

    public class01439 y() {
        this.z = true;
        return this;
    }

    public class01439 N(List<class01474> list) {
        this.B = list;
        return this;
    }

    public class01439 N() {
        this.Z = true;
        return this;
    }

    public class01439 N(class01471 class014712) {
        this.R = class014712;
        return this;
    }
}

