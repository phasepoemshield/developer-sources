/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class11175;
import Nursultan.class11181;
import Nursultan.class11183;
import Nursultan.class11191;
import Nursultan.class11199;

public class class11203 {
    private class11203() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static int N(class11175 class111752) {
        return switch (((int[])class11191.N_2)[class111752.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> 33071;
            case 2 -> 33069;
            case 3 -> 10497;
            case 4 -> 33648;
        };
    }

    public static int N(class11199 class111992) {
        return switch (((int[])class11191.N_1)[class111992.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> 9728;
            case 2 -> 9729;
            case 3 -> 9984;
            case 4 -> 9985;
            case 5 -> 9986;
            case 6 -> 9987;
        };
    }

    public static class11183 N(class11181 class111812) {
        return switch (((int[])class11191.N_0)[class111812.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> new class11183(32856, 6408, 5121);
            case 2 -> new class11183(32849, 6407, 5121);
            case 3 -> new class11183(34843, 6407, 5131);
            case 4 -> new class11183(33327, 33319, 5131);
            case 5 -> new class11183(33191, 6402, 5126);
        };
    }
}

