/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.serialization.Codec
 *  minecraft.class01825
 *  minecraft.class04370
 *  minecraft.class05033
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05914
 *  minecraft.class06202
 *  minecraft.class06532
 *  minecraft.class07533
 *  minecraft.class07536
 *  minecraft.class08741
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.serialization.Codec;
import minecraft.class01301;
import minecraft.class01315;
import minecraft.class01825;
import minecraft.class04370;
import minecraft.class05033;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05914;
import minecraft.class06202;
import minecraft.class06532;
import minecraft.class07533;
import minecraft.class07536;
import minecraft.class08741;
import org.jspecify.annotations.Nullable;

public final class class01241
extends Enum<class01241>
implements class05033 {
    public static final /* enum */ class01241 field_25427 = new class01241("fast", "options.graphics.fast");
    public static final /* enum */ class01241 field_25428 = new class01241("fancy", "options.graphics.fancy");
    public static final /* enum */ class01241 field_25429 = new class01241("fabulous", "options.graphics.fabulous");
    public static final /* enum */ class01241 field_63461 = new class01241("custom", "options.graphics.custom");
    private final String field_63463;
    private final String field_25432;
    public static final Codec<class01241> field_63462;
    private static final /* synthetic */ class01241[] field_25433;

    private class01241(String string2, String string3) {
        this.field_63463 = string2;
        this.field_25432 = string3;
    }

    public static class01241[] values() {
        return (class01241[])field_25433.clone();
    }

    public static class01241 valueOf(String string) {
        return Enum.valueOf(class01241.class, string);
    }

    private static /* synthetic */ class01241[] y() {
        return new class01241[]{field_25427, field_25428, field_25429, field_63461};
    }

    public String N() {
        return this.field_25432;
    }

    public void N(class06202 class062022) {
        class05914 class059142 = (class05096)class062022.v_3 instanceof class05914 ? (class05914)((class05096)class062022.v_3) : null;
        GpuDevice gpuDevice = RenderSystem.getDevice();
        switch (this.ordinal()) {
            case 0: {
                int n = 8;
                this.N(class059142, ((class05630)class062022.i_7).a(), 1);
                this.N(class059142, ((class05630)class062022.i_7).i(), 8);
                this.N(class059142, ((class05630)class062022.i_7).j(), class01825.field_34788);
                this.N(class059142, ((class05630)class062022.i_7).R(), 6);
                this.N(class059142, ((class05630)class062022.i_7).T(), false);
                this.N(class059142, ((class05630)class062022.i_7).U(), class01301.field_18163);
                this.N(class059142, ((class05630)class062022.i_7).NK(), class01315.field_18198);
                this.N(class059142, ((class05630)class062022.i_7).V(), 2);
                this.N(class059142, ((class05630)class062022.i_7).Ny(), false);
                this.N(class059142, ((class05630)class062022.i_7).M(), 0.75);
                this.N(class059142, ((class05630)class062022.i_7).G(), 2);
                this.N(class059142, ((class05630)class062022.i_7).E(), 32);
                this.N(class059142, ((class05630)class062022.i_7).m(), false);
                this.N(class059142, ((class05630)class062022.i_7).s(), false);
                this.N(class059142, ((class05630)class062022.i_7).W(), 5);
                this.N(class059142, ((class05630)class062022.i_7).e(), 1);
                this.N(class059142, ((class05630)class062022.i_7).c(), class06532.field_64663);
                break;
            }
            case 1: {
                int n = 16;
                this.N(class059142, ((class05630)class062022.i_7).a(), 2);
                this.N(class059142, ((class05630)class062022.i_7).i(), 16);
                this.N(class059142, ((class05630)class062022.i_7).j(), class01825.field_34789);
                this.N(class059142, ((class05630)class062022.i_7).R(), 12);
                this.N(class059142, ((class05630)class062022.i_7).T(), true);
                this.N(class059142, ((class05630)class062022.i_7).U(), class01301.field_18164);
                this.N(class059142, ((class05630)class062022.i_7).NK(), class01315.field_18197);
                this.N(class059142, ((class05630)class062022.i_7).V(), 4);
                this.N(class059142, ((class05630)class062022.i_7).Ny(), true);
                this.N(class059142, ((class05630)class062022.i_7).M(), 1.0);
                this.N(class059142, ((class05630)class062022.i_7).G(), 5);
                this.N(class059142, ((class05630)class062022.i_7).E(), 64);
                this.N(class059142, ((class05630)class062022.i_7).m(), true);
                this.N(class059142, ((class05630)class062022.i_7).s(), false);
                this.N(class059142, ((class05630)class062022.i_7).W(), 10);
                this.N(class059142, ((class05630)class062022.i_7).e(), 1);
                this.N(class059142, ((class05630)class062022.i_7).c(), class06532.field_64664);
                break;
            }
            case 2: {
                int n = 32;
                this.N(class059142, ((class05630)class062022.i_7).a(), 2);
                this.N(class059142, ((class05630)class062022.i_7).i(), 32);
                this.N(class059142, ((class05630)class062022.i_7).j(), class01825.field_34789);
                this.N(class059142, ((class05630)class062022.i_7).R(), 12);
                this.N(class059142, ((class05630)class062022.i_7).T(), true);
                this.N(class059142, ((class05630)class062022.i_7).U(), class01301.field_18164);
                this.N(class059142, ((class05630)class062022.i_7).NK(), class01315.field_18197);
                this.N(class059142, ((class05630)class062022.i_7).V(), 4);
                this.N(class059142, ((class05630)class062022.i_7).Ny(), true);
                this.N(class059142, ((class05630)class062022.i_7).M(), 1.25);
                this.N(class059142, ((class05630)class062022.i_7).G(), 5);
                this.N(class059142, ((class05630)class062022.i_7).E(), 128);
                this.N(class059142, ((class05630)class062022.i_7).m(), true);
                this.N(class059142, ((class05630)class062022.i_7).s(), class07536.m() != class07533.field_1137);
                this.N(class059142, ((class05630)class062022.i_7).W(), 10);
                this.N(class059142, ((class05630)class062022.i_7).e(), 2);
                if (class08741.N((GpuDevice)gpuDevice).L()) {
                    this.N(class059142, ((class05630)class062022.i_7).c(), class06532.field_64664);
                    break;
                }
                this.N(class059142, ((class05630)class062022.i_7).c(), class06532.field_64665);
            }
        }
    }

    <T> void N(@Nullable class05914 class059142, class04370<T> class043702, T t) {
        if (class043702.method_41753() != t) {
            class043702.method_41748(t);
            if (class059142 != null) {
                class059142.method_75370(class043702);
            }
        }
    }

    public String method_15434() {
        return this.field_63463;
    }

    static {
        field_25433 = class01241.y();
        field_63462 = class05033.N(class01241::values);
    }
}

