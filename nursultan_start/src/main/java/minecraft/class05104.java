/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Locale;
import java.util.Optional;

public final class class05104
extends Enum<class05104> {
    public static final /* enum */ class05104 field_19586 = new class05104("pc.realms.minecraft.net", "java.frontendlegacy.realms.minecraft-services.net", "https");
    public static final /* enum */ class05104 field_19587 = new class05104("pc-stage.realms.minecraft.net", "java.frontendlegacy.stage-c2a40e62.realms.minecraft-services.net", "https");
    public static final /* enum */ class05104 field_19588 = new class05104("localhost:8080", "localhost:8080", "http");
    public final String field_19589;
    public final String field_57919;
    public final String field_19590;
    private static final /* synthetic */ class05104[] field_19591;

    private class05104(String string2, String string3, String string4) {
        this.field_19589 = string2;
        this.field_57919 = string3;
        this.field_19590 = string4;
    }

    public static class05104[] values() {
        return (class05104[])field_19591.clone();
    }

    public static class05104 valueOf(String string) {
        return Enum.valueOf(class05104.class, string);
    }

    private static /* synthetic */ class05104[] N() {
        return new class05104[]{field_19586, field_19587, field_19588};
    }

    public static Optional<class05104> N(String string) {
        return switch (string.toLowerCase(Locale.ROOT)) {
            case "production" -> Optional.of(field_19586);
            case "local" -> Optional.of(field_19588);
            case "stage", "staging" -> Optional.of(field_19587);
            default -> Optional.empty();
        };
    }

    static {
        field_19591 = class05104.N();
    }
}

