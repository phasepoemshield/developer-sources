/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class03458
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.UUID;
import minecraft.class01894;
import minecraft.class03458;

public final class class04254
extends Record {
    private final Map<class01894, byte[]> cookies;
    private final Map<UUID, class03458> seenPlayers;
    private final boolean seenInsecureChatWarning;

    public boolean L() {
        return this.seenInsecureChatWarning;
    }

    public class04254(Map<class01894, byte[]> map, Map<UUID, class03458> map2, boolean bl) {
        this.cookies = map;
        this.seenPlayers = map2;
        this.seenInsecureChatWarning = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04254.class, "cookies;seenPlayers;seenInsecureChatWarning", "cookies", "seenPlayers", "seenInsecureChatWarning"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04254.class, "cookies;seenPlayers;seenInsecureChatWarning", "cookies", "seenPlayers", "seenInsecureChatWarning"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04254.class, "cookies;seenPlayers;seenInsecureChatWarning", "cookies", "seenPlayers", "seenInsecureChatWarning"}, this);
    }

    public Map<UUID, class03458> y() {
        return this.seenPlayers;
    }

    public Map<class01894, byte[]> N() {
        return this.cookies;
    }
}

