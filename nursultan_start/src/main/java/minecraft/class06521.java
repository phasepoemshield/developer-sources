/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00265
 *  minecraft.class00305
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02754
 *  minecraft.class02950
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05838
 *  minecraft.class05946
 *  minecraft.class07299
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import minecraft.class00265;
import minecraft.class00305;
import minecraft.class01929;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02754;
import minecraft.class02950;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05838;
import minecraft.class05946;
import minecraft.class06514;
import minecraft.class06584;
import minecraft.class07299;

public interface class06521<T extends class02950> {
    public static final Codec<class06521<?>> R = class04206.j.T().dispatch(class06521::method_8119, class06514::N);
    public static final Codec<class05946<class06521<?>>> M = class05946.N((class05946)class04227.yV);
    public static final class02362<class04247, class06521<?>> B = class02389.N((class05946)class04227.Ns).y(class06521::method_8119, class06514::y);

    default public boolean L() {
        return true;
    }

    public class00305 i();

    public class05838<? extends class06521<T>> u();

    default public String y() {
        return "";
    }

    default public List<class00265> N() {
        return List.of();
    }

    public class06514<? extends class06521<T>> method_8119();

    public class02754 method_61671();

    default public boolean method_8118() {
        return false;
    }

    public boolean method_8115(T var1, class07299 var2);

    public class06584 method_8116(T var1, class01929 var2);
}

