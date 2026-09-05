/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07209
 *  minecraft.class07284
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class08960;
import minecraft.class08972;
import minecraft.class08976;

public final class class08953
extends Record
implements class08976 {
    private final class07284 level;
    private final class08960 block;
    private final class07209 pos;
    private final class08972 part;

    @Override
    public class07209 L() {
        return this.pos;
    }

    @Override
    public void M() {
        this.block.N(this.level, this.pos, this.part.R());
    }

    public class08953(class07284 class072842, class08960 class089602, class07209 class072092, class08972 class089722) {
        this.level = class072842;
        this.block = class089602;
        this.pos = class072092;
        this.part = class089722;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08953.class, "level;block;pos;part", "level", "block", "pos", "part"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08953.class, "level;block;pos;part", "level", "block", "pos", "part"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08953.class, "level;block;pos;part", "level", "block", "pos", "part"}, this);
    }

    public class07284 B() {
        return this.level;
    }

    public class08960 Z() {
        return this.block;
    }

    @Override
    public void i() {
        this.block.N(this.level, this.pos, this.part.u());
    }

    public class08972 z() {
        return this.part;
    }

    @Override
    public void u() {
        this.block.N(this.level, this.pos, this.part.L());
    }

    @Override
    public boolean y() {
        return this.part.y();
    }

    @Override
    public boolean N() {
        return true;
    }

    @Override
    public boolean N(class08972 class089722) {
        return this.part.N(class089722);
    }

    @Override
    public void R() {
        this.block.N(this.level, this.pos, this.part.i());
    }
}

