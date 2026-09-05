/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01622
 *  minecraft.class01894
 */
package minecraft;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01622;
import minecraft.class01894;

public final class class01050
extends Enum<class01050>
implements class01089 {
    public static final /* enum */ class01050 field_25351 = new class01050();
    private static final /* synthetic */ class01050[] field_25352;

    private static /* synthetic */ class01050[] L() {
        return new class01050[]{field_25351};
    }

    @Override
    public Map<class01894, List<class01079>> L(String string, Predicate<class01894> predicate) {
        return Map.of();
    }

    static {
        field_25352 = class01050.L();
    }

    public static class01050[] values() {
        return (class01050[])field_25352.clone();
    }

    public static class01050 valueOf(String string) {
        return Enum.valueOf(class01050.class, string);
    }

    @Override
    public Stream<class01622> y() {
        return Stream.of(new class01622[0]);
    }

    @Override
    public Map<class01894, class01079> y(String string, Predicate<class01894> predicate) {
        return Map.of();
    }

    @Override
    public List<class01079> N(class01894 class018942) {
        return List.of();
    }

    @Override
    public Set<String> N() {
        return Set.of();
    }

    public Optional<class01079> method_14486(class01894 class018942) {
        return Optional.empty();
    }
}

