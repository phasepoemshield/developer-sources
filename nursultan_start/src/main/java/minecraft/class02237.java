/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00549
 *  minecraft.class00574
 *  minecraft.class01834
 *  minecraft.class02688
 *  minecraft.class03299
 *  minecraft.class07361
 *  minecraft.class08050
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.CompletableFuture;
import minecraft.class00549;
import minecraft.class00574;
import minecraft.class01834;
import minecraft.class02209;
import minecraft.class02236;
import minecraft.class02248;
import minecraft.class02688;
import minecraft.class03299;
import minecraft.class07361;
import minecraft.class08050;
import org.jspecify.annotations.Nullable;

public final class class02237
extends Record {
    final class00549 targetStatus;
    private final class02209 directDependencies;
    final class02209 accumulatedDependencies;
    private final int blockStateWriteRadius;
    private final class00574 task;

    public class02209 L() {
        return this.accumulatedDependencies;
    }

    public class02237(class00549 class005492, class02209 class022092, class02209 class022093, int n, class00574 class005742) {
        this.targetStatus = class005492;
        this.directDependencies = class022092;
        this.accumulatedDependencies = class022093;
        this.blockStateWriteRadius = n;
        this.task = class005742;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02237.class, "targetStatus;directDependencies;accumulatedDependencies;blockStateWriteRadius;task", "targetStatus", "directDependencies", "accumulatedDependencies", "blockStateWriteRadius", "task"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02237.class, "targetStatus;directDependencies;accumulatedDependencies;blockStateWriteRadius;task", "targetStatus", "directDependencies", "accumulatedDependencies", "blockStateWriteRadius", "task"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02237.class, "targetStatus;directDependencies;accumulatedDependencies;blockStateWriteRadius;task", "targetStatus", "directDependencies", "accumulatedDependencies", "blockStateWriteRadius", "task"}, this);
    }

    public class00574 i() {
        return this.task;
    }

    public int u() {
        return this.blockStateWriteRadius;
    }

    public class02209 y() {
        return this.directDependencies;
    }

    public int N(class00549 class005492) {
        if (class005492 == this.targetStatus) {
            return 0;
        }
        return this.accumulatedDependencies.N(class005492);
    }

    private class08050 N(class08050 class080502, @Nullable class03299 class032992) {
        class07361 class073612;
        if (class080502 instanceof class07361 && (class073612 = (class07361)class080502).E().u(this.targetStatus)) {
            class073612.N(this.targetStatus);
        }
        if (class032992 != null) {
            class032992.finish(true);
        }
        return class080502;
    }

    public class00549 N() {
        return this.targetStatus;
    }

    public CompletableFuture<class08050> N(class02688 class026882, class02248<class02236> class022482, class08050 class080503) {
        if (class080503.E().u(this.targetStatus)) {
            class03299 class032992 = class01834.M.N(class080503.R(), class026882.N().method_27983(), this.targetStatus.R());
            return this.task.doWork(class026882, this, class022482, class080503).thenApply(class080502 -> this.N((class08050)class080502, class032992));
        }
        return this.task.doWork(class026882, this, class022482, class080503);
    }
}

