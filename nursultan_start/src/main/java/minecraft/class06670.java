/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00891
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00891;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class06670
implements Predicate<class00500> {
    public static final Predicate<class00500> N = class005002 -> true;
    private final class00507<class00891, class00500> y;
    private final Map<class08092<?>, Predicate<Object>> L = Maps.newHashMap();

    private class06670(class00507<class00891, class00500> class005072) {
        this.y = class005072;
    }

    public <V extends Comparable<V>> class06670 N(class08092<V> class080922, Predicate<Object> predicate) {
        if (!this.y.u().contains(class080922)) {
            throw new IllegalArgumentException(String.valueOf(this.y) + " cannot support property " + String.valueOf(class080922));
        }
        this.L.put(class080922, predicate);
        return this;
    }

    @Override
    public boolean test(@Nullable class00500 class005002) {
        if (class005002 == null || !class005002.i().equals(this.y.L())) {
            return false;
        }
        if (this.L.isEmpty()) {
            return true;
        }
        for (Map.Entry<class08092<?>, Predicate<Object>> entry : this.L.entrySet()) {
            if (this.N(class005002, entry.getKey(), entry.getValue())) continue;
            return false;
        }
        return true;
    }

    public static class06670 N(class00891 class008912) {
        return new class06670((class00507<class00891, class00500>)class008912.E());
    }

    protected <T extends Comparable<T>> boolean N(class00500 class005002, class08092<T> class080922, Predicate<Object> predicate) {
        Comparable comparable = class005002.L(class080922);
        return predicate.test(comparable);
    }
}

