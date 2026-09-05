/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08092
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import minecraft.class08092;

public final class class06667
extends class08092<Boolean> {
    private static final List<Boolean> N = List.of(Boolean.valueOf(true), Boolean.valueOf(false));
    private static final int y = 0;
    private static final int L = 1;

    private class06667(String string) {
        super(string, Boolean.class);
    }

    public Optional<Boolean> y(String string) {
        return switch (string) {
            case "true" -> Optional.of(true);
            case "false" -> Optional.of(false);
            default -> Optional.empty();
        };
    }

    public int y(Boolean bl) {
        return bl != false ? 0 : 1;
    }

    public String N(Boolean bl) {
        return bl.toString();
    }

    public static class06667 N(String string) {
        return new class06667(string);
    }

    public List<Boolean> N() {
        return N;
    }
}

