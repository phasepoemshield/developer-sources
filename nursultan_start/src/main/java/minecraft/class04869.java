/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00753
 *  minecraft.class01203
 *  minecraft.class01224
 *  minecraft.class02610
 *  minecraft.class05163
 *  minecraft.class05246
 *  minecraft.class05248
 *  minecraft.class05267
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import minecraft.class00753;
import minecraft.class01203;
import minecraft.class01224;
import minecraft.class02610;
import minecraft.class05163;
import minecraft.class05246;
import minecraft.class05248;
import minecraft.class05267;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;
import minecraft.class08088;

public class class04869
extends class05248 {
    public static final MapCodec<class04869> N = MapCodec.unit(() -> y);
    public static final class04869 y = new class04869();

    private class04869() {
        super(class05246.field_16686);
    }

    public String toString() {
        return "Empty";
    }

    public class05267<?> N() {
        return class05267.u;
    }

    public boolean N(class01224 class012242, class05974 class059742, class05324 class053242, class08088 class080882, class07209 class072092, class07209 class072093, class06993 class069932, class05163 class051632, class06069 class060692, class02610 class026102, boolean bl) {
        return true;
    }

    public class00753 N(class01224 class012242, class06993 class069932) {
        return class00753.field_11176;
    }

    public class05163 N(class01224 class012242, class07209 class072092, class06993 class069932) {
        throw new IllegalStateException("Invalid call to EmptyPoolElement.getBoundingBox, filter me!");
    }

    public List<class01203> N(class01224 class012242, class07209 class072092, class06993 class069932, class06069 class060692) {
        return Collections.emptyList();
    }
}

