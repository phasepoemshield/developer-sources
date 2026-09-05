/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.Optional;

public class class09079
extends Enum<class09079> {
    public Float fields_0317b48171f8c3affbbd04c18f174f04f_0;
    public boolean fields_0317b48171f8c3affbbd04c18f174f04f_init;
    public static final /* enum */ class09079 BLACK;
    public static class09079[] staticFields_1317b48171f8c3affbbd04c18f174f04f_1;
    private static final /* synthetic */ class09079[] $VALUES;
    public static final /* enum */ class09079 THIN;
    public static final /* enum */ class09079 EXTRA_LIGHT;
    public static final /* enum */ class09079 LIGHT;
    public static final /* enum */ class09079 REGULAR;
    public static final /* enum */ class09079 MEDIUM;
    public static final /* enum */ class09079 SEMI_BOLD;
    public static final /* enum */ class09079 BOLD;
    public static final /* enum */ class09079 EXTRA_BOLD;

    private static /* synthetic */ class09079[] L() {
        return new class09079[]{THIN, EXTRA_LIGHT, LIGHT, REGULAR, MEDIUM, SEMI_BOLD, BOLD, EXTRA_BOLD, BLACK};
    }

    private class09079(float f) {
        this.R();
        this.fields_0317b48171f8c3affbbd04c18f174f04f_0 = Float.valueOf(f);
    }

    static {
        THIN = new class09079(100.0f);
        EXTRA_LIGHT = new class09079(200.0f);
        LIGHT = new class09079(300.0f);
        REGULAR = new class09079(400.0f);
        MEDIUM = new class09079(500.0f);
        SEMI_BOLD = new class09079(600.0f);
        BOLD = new class09079(700.0f);
        EXTRA_BOLD = new class09079(800.0f);
        BLACK = new class09079(900.0f);
        $VALUES = class09079.L();
        staticFields_1317b48171f8c3affbbd04c18f174f04f_1 = class09079.values();
    }

    public static class09079[] values() {
        return (class09079[])$VALUES.clone();
    }

    public static class09079 valueOf(String string) {
        return Enum.valueOf(class09079.class, string);
    }

    private static void y() {
        THIN = null;
        EXTRA_LIGHT = null;
        LIGHT = null;
        REGULAR = null;
        MEDIUM = null;
        SEMI_BOLD = null;
        BOLD = null;
        EXTRA_BOLD = null;
        BLACK = null;
        staticFields_1317b48171f8c3affbbd04c18f174f04f_1 = null;
        $VALUES = null;
    }

    public static Optional<class09079> N(float f) {
        for (class09079 class090792 : staticFields_1317b48171f8c3affbbd04c18f174f04f_1) {
            if (class090792.fields_0317b48171f8c3affbbd04c18f174f04f_0.floatValue() != f) continue;
            return Optional.of(class090792);
        }
        return Optional.empty();
    }

    public float N() {
        return this.fields_0317b48171f8c3affbbd04c18f174f04f_0.floatValue();
    }

    private void R() {
        if (!this.fields_0317b48171f8c3affbbd04c18f174f04f_init) {
            this.fields_0317b48171f8c3affbbd04c18f174f04f_init = true;
            this.fields_0317b48171f8c3affbbd04c18f174f04f_0 = Float.valueOf(0.0f);
        }
    }
}

