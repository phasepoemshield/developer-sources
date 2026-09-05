/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class04376
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07299
 */
package Nursultan;

import Nursultan.class10340;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import minecraft.class00500;
import minecraft.class04376;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07299;

public final class class10345
extends Record
implements class10340 {
    private final class07211 direction;
    private final class00500 neighborState;
    private final class07209 pos;
    private final class07209 neighborPos;
    private final int updateFlags;
    private final int updateLimit;

    public class07209 L() {
        return this.pos;
    }

    public class10345(class07211 class072112, class00500 class005002, class07209 class072092, class07209 class072093, int n, int n2) {
        this.direction = class072112;
        this.neighborState = class005002;
        this.pos = class072092;
        this.neighborPos = class072093;
        this.updateFlags = n;
        this.updateLimit = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10345.class, "direction;neighborState;pos;neighborPos;updateFlags;updateLimit", "direction", "neighborState", "pos", "neighborPos", "updateFlags", "updateLimit"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10345.class, "direction;neighborState;pos;neighborPos;updateFlags;updateLimit", "direction", "neighborState", "pos", "neighborPos", "updateFlags", "updateLimit"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10345.class, "direction;neighborState;pos;neighborPos;updateFlags;updateLimit", "direction", "neighborState", "pos", "neighborPos", "updateFlags", "updateLimit"}, this);
    }

    public int i() {
        return this.updateFlags;
    }

    public class07209 u() {
        return this.neighborPos;
    }

    public class00500 y() {
        return this.neighborState;
    }

    @Override
    public boolean N(class07299 class072992) {
        class04376.N((class07284)class072992, (class07211)this.direction, (class07209)this.pos, (class07209)this.neighborPos, (class00500)this.neighborState, (int)this.updateFlags, (int)this.updateLimit);
        return false;
    }

    @Override
    public void N(Consumer<class07209> consumer) {
        consumer.accept(this.pos);
    }

    public class07211 N() {
        return this.direction;
    }

    public int R() {
        return this.updateLimit;
    }
}

