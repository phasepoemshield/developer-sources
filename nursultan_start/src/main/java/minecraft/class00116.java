/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class05096
 *  minecraft.class08734
 *  minecraft.class08770
 *  minecraft.class08781
 *  minecraft.class09019
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.stream.Stream;
import minecraft.class00134;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class05096;
import minecraft.class08734;
import minecraft.class08770;
import minecraft.class08781;
import minecraft.class09019;
import org.jspecify.annotations.Nullable;

public abstract class class00116<T extends class09019>
extends class00134<T> {
    public static final int N = 5;

    public class00116(@Nullable class05096 class050962, T t, class08781 class087812) {
        super(class050962, t, class087812);
    }

    @Override
    protected void N(class01885 class018852, class08770 class087702, T t, class08781 class087812) {
        super.N(class018852, class087702, t, class087812);
        List list = this.N(t, class087812).map(class087342 -> class087702.N(class087342).N()).toList();
        class018852.N(class00116.N(list, t.y()));
    }

    protected abstract Stream<class08734> N(T var1, class08781 var2);

    @Override
    protected void N(class03686 class036862, class08770 class087702, T t, class08781 class087812) {
        super.N(class036862, class087702, t, class087812);
        t.L().ifPresentOrElse(class087342 -> class036862.y((class02102)class087702.N(class087342).N()), () -> class036862.N(5));
    }
}

