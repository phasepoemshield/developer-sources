/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09540
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00751
 *  minecraft.class02042
 *  minecraft.class02995
 *  minecraft.class03767
 *  minecraft.class05946
 */
package minecraft;

import Nursultan.class09540;
import com.mojang.serialization.Lifecycle;
import java.util.function.Predicate;
import minecraft.class00751;
import minecraft.class01905;
import minecraft.class02042;
import minecraft.class02995;
import minecraft.class03767;
import minecraft.class05946;

public interface class01921<T>
extends class01905<T>,
class02042<T> {
    public class05946<? extends class00751<? extends T>> i();

    default public class01921<T> N(Predicate<T> predicate) {
        return new class09540(this, predicate);
    }

    default public class01921<T> N(class03767 class037672) {
        if (class02995.Li.contains(this.i())) {
            return this.N((T object) -> ((class02995)object).N(class037672));
        }
        return this;
    }

    public Lifecycle R();
}

