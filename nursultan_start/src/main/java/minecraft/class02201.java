/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04522
 *  minecraft.class04530
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import minecraft.class04522;
import minecraft.class04530;
import org.jspecify.annotations.Nullable;

class class02201
extends class04530 {
    private final List<class04530> y;

    private static double L(List<class04530> list) {
        double d = 0.0;
        for (class04530 class045302 : list) {
            d += class045302.L().getAsDouble();
        }
        return d / (double)list.size();
    }

    class02201(String string, List<class04530> list) {
        super(string, list.get(0).i(), () -> class02201.L(list), () -> class02201.y(list), class02201.N(list));
        this.y = list;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || ((Object)((Object)this)).getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        class02201 class022012 = (class02201)((Object)object);
        return this.y.equals(class022012.y);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), this.y);
    }

    private static void y(List<class04530> list) {
        Iterator<class04530> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().N();
        }
    }

    private static class04522 N(List<class04530> list) {
        return d -> list.stream().anyMatch(class045302 -> {
            if (class045302.N != null) {
                return class045302.N.method_34792(d);
            }
            return false;
        });
    }
}

