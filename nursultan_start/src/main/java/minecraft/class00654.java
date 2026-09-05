/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00623
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import minecraft.class00623;
import minecraft.class00625;
import minecraft.class00626;
import minecraft.class00627;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class00652;
import minecraft.class00661;
import minecraft.class00669;
import minecraft.class05033;

public final class class00654
extends Enum<class00654>
implements class05033 {
    public static final /* enum */ class00654 field_11749 = new class00654("open_url", true, class00652.y);
    public static final /* enum */ class00654 field_11746 = new class00654("open_file", false, (MapCodec<? extends class00647>)class00623.y);
    public static final /* enum */ class00654 field_11750 = new class00654("run_command", true, class00625.y);
    public static final /* enum */ class00654 field_11745 = new class00654("suggest_command", true, class00640.y);
    public static final /* enum */ class00654 field_60821 = new class00654("show_dialog", true, class00626.y);
    public static final /* enum */ class00654 field_11748 = new class00654("change_page", true, class00661.y);
    public static final /* enum */ class00654 field_21462 = new class00654("copy_to_clipboard", true, class00627.y);
    public static final /* enum */ class00654 field_60822 = new class00654("custom", true, class00669.y);
    public static final Codec<class00654> field_46595;
    public static final Codec<class00654> field_46596;
    private final boolean field_11744;
    private final String field_11742;
    final MapCodec<? extends class00647> field_55902;
    private static final /* synthetic */ class00654[] field_11747;

    private static /* synthetic */ class00654[] L() {
        return new class00654[]{field_11749, field_11746, field_11750, field_11745, field_60821, field_11748, field_21462, field_60822};
    }

    private class00654(String string2, boolean bl, MapCodec<? extends class00647> mapCodec) {
        this.field_11742 = string2;
        this.field_11744 = bl;
        this.field_55902 = mapCodec;
    }

    public static class00654[] values() {
        return (class00654[])field_11747.clone();
    }

    public static class00654 valueOf(String string) {
        return Enum.valueOf(class00654.class, string);
    }

    public MapCodec<? extends class00647> y() {
        return this.field_55902;
    }

    public static DataResult<class00654> N(class00654 class006542) {
        if (!class006542.N()) {
            return DataResult.error(() -> "Click event type not allowed: " + String.valueOf((Object)class006542));
        }
        return DataResult.success((Object)((Object)class006542), (Lifecycle)Lifecycle.stable());
    }

    public boolean N() {
        return this.field_11744;
    }

    public String method_15434() {
        return this.field_11742;
    }

    static {
        field_11747 = class00654.L();
        field_46595 = class05033.N(class00654::values);
        field_46596 = field_46595.validate(class00654::N);
    }
}

