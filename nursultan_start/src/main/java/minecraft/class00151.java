/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  it.unimi.dsi.fastutil.bytes.ByteArrayList
 *  minecraft.class02325
 *  minecraft.class08886
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import java.nio.ByteBuffer;
import java.util.List;
import minecraft.class00157;
import minecraft.class00170;
import minecraft.class02325;
import minecraft.class08886;
import org.jspecify.annotations.Nullable;

final class class00151
extends class08886 {
    private static final ByteBuffer field_58008 = ByteBuffer.wrap(new byte[0]);

    class00151(String string, int n, class00157 class001572, class00157 ... class00157Array) {
        super(string, n, class001572, class00157Array);
    }

    public <T> T N(DynamicOps<T> dynamicOps) {
        return (T)dynamicOps.createByteList(field_58008);
    }

    public <T> @Nullable T N(DynamicOps<T> dynamicOps, List<class00170> list, class02325<?> class023252) {
        ByteArrayList byteArrayList = new ByteArrayList();
        for (class00170 class001702 : list) {
            Number number = this.N(class001702, class023252);
            if (number == null) {
                return null;
            }
            byteArrayList.add(number.byteValue());
        }
        return (T)dynamicOps.createByteList(ByteBuffer.wrap(byteArrayList.toByteArray()));
    }
}

