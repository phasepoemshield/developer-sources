/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  minecraft.class00010
 *  minecraft.class00019
 *  minecraft.class00021
 *  minecraft.class00667
 *  org.apache.commons.lang3.function.TriFunction
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.UUID;
import minecraft.class00010;
import minecraft.class00019;
import minecraft.class00021;
import minecraft.class00027;
import minecraft.class00028;
import minecraft.class00037;
import minecraft.class00667;
import org.apache.commons.lang3.function.TriFunction;

final class class00025
extends Enum<class00025> {
    public static final /* enum */ class00025 field_59778 = new class00025((TriFunction<Either<UUID, String>, class00028, class00667, class00037>)((TriFunction)class00027::new));
    public static final /* enum */ class00025 field_59779 = new class00025((TriFunction<Either<UUID, String>, class00028, class00667, class00037>)((TriFunction)class00021::new));
    public static final /* enum */ class00025 field_59780 = new class00025((TriFunction<Either<UUID, String>, class00028, class00667, class00037>)((TriFunction)class00019::new));
    public static final /* enum */ class00025 field_59781 = new class00025((TriFunction<Either<UUID, String>, class00028, class00667, class00037>)((TriFunction)class00010::new));
    final TriFunction<Either<UUID, String>, class00028, class00667, class00037> field_59782;
    private static final /* synthetic */ class00025[] field_59783;

    private class00025(TriFunction<Either<UUID, String>, class00028, class00667, class00037> triFunction) {
        this.field_59782 = triFunction;
    }

    static {
        field_59783 = class00025.N();
    }

    public static class00025[] values() {
        return (class00025[])field_59783.clone();
    }

    public static class00025 valueOf(String string) {
        return Enum.valueOf(class00025.class, string);
    }

    private static /* synthetic */ class00025[] N() {
        return new class00025[]{field_59778, field_59779, field_59780, field_59781};
    }
}

