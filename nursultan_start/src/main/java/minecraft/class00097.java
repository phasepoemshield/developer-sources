/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09118
 *  com.mojang.serialization.MapCodec
 *  minecraft.class05096
 *  minecraft.class08781
 *  minecraft.class09001
 *  minecraft.class09007
 *  minecraft.class09024
 *  minecraft.class09031
 *  minecraft.class09037
 *  minecraft.class09040
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09118;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import minecraft.class00113;
import minecraft.class00118;
import minecraft.class00123;
import minecraft.class00134;
import minecraft.class00135;
import minecraft.class05096;
import minecraft.class08781;
import minecraft.class09001;
import minecraft.class09007;
import minecraft.class09024;
import minecraft.class09031;
import minecraft.class09037;
import minecraft.class09040;
import org.jspecify.annotations.Nullable;

public class class00097 {
    private static final Map<MapCodec<? extends class09037>, class09118<?>> N = new HashMap();

    private static <T extends class09037> void N(MapCodec<T> mapCodec, class09118<? super T> class091182) {
        N.put(mapCodec, class091182);
    }

    public static void N() {
        class00097.N(class09031.N, class00113::new);
        class00097.N(class09024.B, class00113::new);
        class00097.N(class09040.N, class00123::new);
        class00097.N(class09007.N, class00118::new);
        class00097.N(class09001.N, class00135::new);
    }

    public static <T extends class09037> @Nullable class00134<T> N(T t, @Nullable class05096 class050962, class08781 class087812) {
        class09118<?> var3 = N.get(t.N());
        if (var3 != null) {
            return var3.create(class050962, t, class087812);
        }
        return null;
    }
}

