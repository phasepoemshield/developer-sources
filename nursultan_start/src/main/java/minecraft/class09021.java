/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class04995
 *  minecraft.class05033
 *  minecraft.class05075
 *  minecraft.class06069
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00392;
import minecraft.class04995;
import minecraft.class05033;
import minecraft.class05075;
import minecraft.class06069;
import org.jspecify.annotations.Nullable;

public final class class09021
extends Enum<class09021>
implements class05033 {
    public static final /* enum */ class09021 field_60797 = new class09021("DEFAULT", "options.music_frequency.default", 20);
    public static final /* enum */ class09021 field_60798 = new class09021("FREQUENT", "options.music_frequency.frequent", 10);
    public static final /* enum */ class09021 field_60799 = new class09021("CONSTANT", "options.music_frequency.constant", 0);
    public static final Codec<class09021> field_60800;
    private final String field_64471;
    private final int field_60803;
    private final class00392 field_64472;
    private static final /* synthetic */ class09021[] field_60805;

    private class09021(String string2, String string3, int n2) {
        this.field_64471 = string2;
        this.field_60803 = n2 * 1200;
        this.field_64472 = class00392.L((String)string3);
    }

    public static class09021[] values() {
        return (class09021[])field_60805.clone();
    }

    public static class09021 valueOf(String string) {
        return Enum.valueOf(class09021.class, string);
    }

    private static /* synthetic */ class09021[] y() {
        return new class09021[]{field_60797, field_60798, field_60799};
    }

    public class00392 N() {
        return this.field_64472;
    }

    int N(@Nullable class05075 class050752, class06069 class060692) {
        if (class050752 == null) {
            return this.field_60803;
        }
        if (this == field_60799) {
            return 100;
        }
        int n = Math.min(class050752.y(), this.field_60803);
        int n2 = Math.min(class050752.L(), this.field_60803);
        return class04995.N((class06069)class060692, (int)n, (int)n2);
    }

    public String method_15434() {
        return this.field_64471;
    }

    static {
        field_60805 = class09021.y();
        field_60800 = class05033.N(class09021::values);
    }
}

