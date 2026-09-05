/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public class class05071 {
    public static final class05071 N = new class05071("advancements");
    public static final class05071 y = new class05071("stats");
    public static final class05071 L = new class05071("playerdata");
    public static final class05071 u = new class05071("players");
    public static final class05071 i = new class05071("level.dat");
    public static final class05071 R = new class05071("level.dat_old");
    public static final class05071 M = new class05071("icon.png");
    public static final class05071 B = new class05071("session.lock");
    public static final class05071 Z = new class05071("generated");
    public static final class05071 z = new class05071("datapacks");
    public static final class05071 U = new class05071("resources.zip");
    public static final class05071 E = new class05071(".");
    private final String W;

    private class05071(String string) {
        this.W = string;
    }

    public String toString() {
        return "/" + this.W;
    }

    public String N() {
        return this.W;
    }
}

