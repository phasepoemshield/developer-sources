/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01331
 *  minecraft.class03063
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05283
 *  minecraft.class05384
 *  minecraft.class07209
 *  minecraft.class07536
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01331;
import minecraft.class03063;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05283;
import minecraft.class05384;
import minecraft.class07209;
import minecraft.class07536;

final class class05038
extends Record
implements class05283 {
    private final class04453 player;
    private final class03448 level;
    private final class03063 levelRenderer;
    private final long timeoutAfter;

    private boolean M() {
        if (class07536.L() > this.timeoutAfter) {
            class05384.N.warn("Timed out while waiting for the client to load chunks, letting the player into the world anyway");
            return true;
        }
        class04453 class044532 = this.player;
        class07209 class072092 = this.N(class044532);
        if (this.level.method_31601(class072092.method_10264()) || this.player.method_7325() || !this.player.method_5805()) {
            return true;
        }
        return this.levelRenderer.N(class072092);
    }

    class05038(class04453 class044532, class03448 class034482, class03063 class030632, long l) {
        this.player = class044532;
        this.level = class034482;
        this.levelRenderer = class030632;
        this.timeoutAfter = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05038.class, "player;level;levelRenderer;timeoutAfter", "player", "level", "levelRenderer", "timeoutAfter"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05038.class, "player;level;levelRenderer;timeoutAfter", "player", "level", "levelRenderer", "timeoutAfter"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05038.class, "player;level;levelRenderer;timeoutAfter", "player", "level", "levelRenderer", "timeoutAfter"}, this);
    }

    public class03063 i() {
        return this.levelRenderer;
    }

    public class03448 u() {
        return this.level;
    }

    public class05283 y() {
        return this.M() ? new class01331(class07536.L()) : this;
    }

    private class07209 N(class04453 class044532) {
        return class07209.method_49637((double)class044532.method_23317(), (double)class044532.method_23320(), (double)class044532.method_23321());
    }

    public class04453 N() {
        return this.player;
    }

    public long R() {
        return this.timeoutAfter;
    }
}

