/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class07001
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import minecraft.class00500;
import minecraft.class07001;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public final class class01228
extends Record {
    final class07209 pos;
    public final class00500 state;
    final @Nullable class07001 nbt;

    public @Nullable class07001 L() {
        return this.nbt;
    }

    public class01228(class07209 class072092, class00500 class005002, @Nullable class07001 class070012) {
        this.pos = class072092;
        this.state = class005002;
        this.nbt = class070012;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01228.class, "pos;state;nbt", "pos", "state", "nbt"}, this, object);
    }

    public String toString() {
        return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.pos, this.state, this.nbt);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01228.class, "pos;state;nbt", "pos", "state", "nbt"}, this);
    }

    public class00500 y() {
        return this.state;
    }

    public class07209 N() {
        return this.pos;
    }
}

