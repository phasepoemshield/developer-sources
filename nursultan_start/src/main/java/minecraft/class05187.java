/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03063
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05038
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03063;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05038;
import minecraft.class05283;

final class class05187
extends Record
implements class05283 {
    private final class04453 player;
    private final class03448 level;
    private final class03063 levelRenderer;
    private final long timeoutAfter;

    @Override
    public class05283 L() {
        return new class05038(this.player, this.level, this.levelRenderer, this.timeoutAfter);
    }

    class05187(class04453 class044532, class03448 class034482, class03063 class030632, long l) {
        this.player = class044532;
        this.level = class034482;
        this.levelRenderer = class030632;
        this.timeoutAfter = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05187.class, "player;level;levelRenderer;timeoutAfter", "player", "level", "levelRenderer", "timeoutAfter"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05187.class, "player;level;levelRenderer;timeoutAfter", "player", "level", "levelRenderer", "timeoutAfter"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05187.class, "player;level;levelRenderer;timeoutAfter", "player", "level", "levelRenderer", "timeoutAfter"}, this);
    }

    public class03063 i() {
        return this.levelRenderer;
    }

    public class03448 u() {
        return this.level;
    }

    public class04453 N() {
        return this.player;
    }

    public long R() {
        return this.timeoutAfter;
    }
}

