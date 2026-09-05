/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02957
 *  minecraft.class02995
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class03794
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class07055
 *  minecraft.class07084
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02957;
import minecraft.class02995;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class03794;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class07055;
import minecraft.class07084;

public class class06525
implements class02995 {
    public static final Codec<class03556<class06525>> N = class04206.Z.b();
    public static final class02362<class04247, class03556<class06525>> y = class02389.y((class05946)class04227.NW);
    private final String L;
    private final List<class07055> u;
    private class03767 i = class03794.M;

    public boolean L() {
        Iterator<class07055> var1 = this.u.iterator();
        while (var1.hasNext()) {
            if (!((class07084)var1.next().L().N()).N()) continue;
            return true;
        }
        return false;
    }

    public class06525(String string, class07055 ... class07055Array) {
        this.L = string;
        this.u = List.of(class07055Array);
    }

    public String y() {
        return this.L;
    }

    public List<class07055> N() {
        return this.u;
    }

    public class06525 N(class02957 ... class02957Array) {
        this.i = class03794.i.N(class02957Array);
        return this;
    }

    public class03767 method_45322() {
        return this.i;
    }
}

