/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class02489;
import minecraft.class02491;
import org.slf4j.Logger;

public class class02462
implements class02489 {
    private static final Logger u = LogUtils.getLogger();
    public static final class02462 y = new class02462();
    public static final MapCodec<class02462> L = MapCodec.unit(() -> y);

    private class02462() {
    }

    @Override
    public class02491 N() {
        return class02491.field_49859;
    }

    @Override
    public <T> List<T> N(List<T> list, List<T> list2, int n) {
        if (list.size() + list2.size() > n) {
            u.error("Contents overflow in section append");
            return list;
        }
        return Stream.concat(list.stream(), list2.stream()).toList();
    }
}

