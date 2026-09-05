/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07243
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07243;

public final class class07210
extends Record {
    private final class04782 level;
    private final class07209 pos;
    private final class00500 state;
    private final class07243 blockEntity;

    public class07209 L() {
        return this.pos;
    }

    public class07210(class04782 class047822, class07209 class072092, class00500 class005002, class07243 class072432) {
        this.level = class047822;
        this.pos = class072092;
        this.state = class005002;
        this.blockEntity = class072432;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07210.class, "level;pos;state;blockEntity", "level", "pos", "state", "blockEntity"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07210.class, "level;pos;state;blockEntity", "level", "pos", "state", "blockEntity"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07210.class, "level;pos;state;blockEntity", "level", "pos", "state", "blockEntity"}, this);
    }

    public class07243 i() {
        return this.blockEntity;
    }

    public class00500 u() {
        return this.state;
    }

    public class04782 y() {
        return this.level;
    }

    public class06889 N() {
        return this.pos.method_46558();
    }
}

