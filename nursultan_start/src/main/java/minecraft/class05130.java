/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class05699
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05112;
import minecraft.class05699;

class class05130
extends class05699<class05130> {
    private static final class00392 y = class00392.L((String)"mco.backup.entry.templateName");
    private static final class00392 L = class00392.L((String)"mco.backup.entry.gameDifficulty");
    private static final class00392 u = class00392.L((String)"mco.backup.entry.name");
    private static final class00392 i = class00392.L((String)"mco.backup.entry.gameServerVersion");
    private static final class00392 R = class00392.L((String)"mco.backup.entry.uploaded");
    private static final class00392 M = class00392.L((String)"mco.backup.entry.enabledPack");
    private static final class00392 B = class00392.L((String)"mco.backup.entry.description");
    private static final class00392 Z = class00392.L((String)"mco.backup.entry.gameMode");
    private static final class00392 z = class00392.L((String)"mco.backup.entry.seed");
    private static final class00392 U = class00392.L((String)"mco.backup.entry.worldType");
    private static final class00392 E = class00392.L((String)"mco.backup.entry.undefined");
    private final String W;
    private final String m;
    private final class00392 P;
    private final class00392 s;
    final /* synthetic */ class05112 N;

    public class05130(class05112 class051122, String string, String string2) {
        this.N = class051122;
        this.W = string;
        this.m = string2;
        this.P = this.N(string);
        this.s = class051122.N(string, string2);
    }

    private class00392 N(String string) {
        return switch (string) {
            case "template_name" -> y;
            case "game_difficulty" -> L;
            case "name" -> u;
            case "game_server_version" -> i;
            case "uploaded" -> R;
            case "enabled_packs" -> M;
            case "description" -> B;
            case "game_mode" -> Z;
            case "seed" -> z;
            case "world_type" -> U;
            default -> E;
        };
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class010542.y(class05112.N(this.N), this.P, this.method_73380(), this.method_73382(), -6250336);
        class010542.y(class05112.y(this.N), this.s, this.method_73380(), this.method_73382() + 12, -1);
    }

    public class00392 method_37006() {
        return class00392.N((String)"narrator.select", (Object[])new Object[]{this.W + " " + this.m});
    }
}

