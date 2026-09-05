/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07209
 *  minecraft.class07299
 */
package net.fabricmc.fabric.impl.transfer.fluid;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07209;
import minecraft.class07299;
import net.fabricmc.fabric.impl.transfer.DebugMessages;

final class CauldronStorage$WorldLocation
extends Record {
    final class07299 world;
    final class07209 pos;

    public class07209 pos() {
        return this.pos;
    }

    CauldronStorage$WorldLocation(class07299 class072992, class07209 class072092) {
        this.world = class072992;
        this.pos = class072092;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{CauldronStorage$WorldLocation.class, "world;pos", "world", "pos"}, this, object);
    }

    public String toString() {
        return DebugMessages.forGlobalPos(this.world, this.pos);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{CauldronStorage$WorldLocation.class, "world;pos", "world", "pos"}, this);
    }

    public class07299 world() {
        return this.world;
    }
}

