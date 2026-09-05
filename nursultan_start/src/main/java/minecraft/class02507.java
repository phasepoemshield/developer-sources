/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class02489;
import minecraft.class02491;

public class class02507
implements class02489 {
    public static final class02507 y = new class02507();
    public static final MapCodec<class02507> L = MapCodec.unit(() -> y);

    private class02507() {
    }

    @Override
    public class02491 N() {
        return class02491.field_49856;
    }

    @Override
    public <T> List<T> N(List<T> list, List<T> list2, int n) {
        return list2;
    }
}

