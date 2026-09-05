/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.blending;

import java.util.Optional;

public enum AlphaTestFunction {
    NEVER(512, null),
    LESS(513, "<"),
    EQUAL(514, "=="),
    LEQUAL(515, "<="),
    GREATER(516, ">"),
    NOTEQUAL(517, "!="),
    GEQUAL(518, ">="),
    ALWAYS(519, null);

    private final int glId;
    private final String expression;

    public static Optional<AlphaTestFunction> fromString(String string) {
        if ("GL_ALWAYS".equals(string)) {
            return Optional.of(ALWAYS);
        }
        try {
            return Optional.of(AlphaTestFunction.valueOf(string));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return Optional.empty();
        }
    }

    private AlphaTestFunction(int n2, String string2) {
        this.glId = n2;
        this.expression = string2;
    }

    public String getExpression() {
        return this.expression;
    }

    public int getGlId() {
        return this.glId;
    }

    public static Optional<AlphaTestFunction> fromGlId(int n) {
        return switch (n) {
            case 512 -> Optional.of(NEVER);
            case 513 -> Optional.of(LESS);
            case 514 -> Optional.of(EQUAL);
            case 515 -> Optional.of(LEQUAL);
            case 516 -> Optional.of(GREATER);
            case 517 -> Optional.of(NOTEQUAL);
            case 518 -> Optional.of(GEQUAL);
            case 519 -> Optional.of(ALWAYS);
            default -> Optional.empty();
        };
    }
}

