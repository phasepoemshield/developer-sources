/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class04439
 *  minecraft.class05936
 *  minecraft.class06541
 *  minecraft.class07018
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.UnaryOperator;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class04439;
import minecraft.class05936;
import minecraft.class06541;
import minecraft.class07018;
import org.jspecify.annotations.Nullable;

public final class class05216
implements class00392 {
    private final class04439 N;
    private final List<class00392> y;
    private class00405 i;
    private class01028 R = class01028.N;
    private @Nullable class07018 M;

    public class05216 L(class00405 class004052) {
        this.y(class004052.N(this.method_10866()));
        return this;
    }

    public class00405 method_10866() {
        return this.i;
    }

    public List<class00392> method_10855() {
        return this.y;
    }

    class05216(class04439 class044392, List<class00392> list, class00405 class004052) {
        this.N = class044392;
        this.y = list;
        this.i = class004052;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class05216)) return false;
        class05216 class052162 = (class05216)object;
        if (!this.N.equals((Object)class052162.N)) return false;
        if (!this.i.equals((Object)class052162.i)) return false;
        if (!this.y.equals(class052162.y)) return false;
        return true;
    }

    public String toString() {
        boolean bl;
        StringBuilder stringBuilder = new StringBuilder(this.N.toString());
        boolean bl2 = !this.i.B();
        boolean bl3 = bl = !this.y.isEmpty();
        if (bl2 || bl) {
            stringBuilder.append('[');
            if (bl2) {
                stringBuilder.append("style=");
                stringBuilder.append(this.i);
            }
            if (bl2 && bl) {
                stringBuilder.append(", ");
            }
            if (bl) {
                stringBuilder.append("siblings=");
                stringBuilder.append(this.y);
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + this.N.hashCode();
        n = 31 * n + this.i.hashCode();
        n = 31 * n + this.y.hashCode();
        return n;
    }

    public class05216 i(String string) {
        if (string.isEmpty()) {
            return this;
        }
        return this.y(class00392.y((String)string));
    }

    public class05216 y(class00405 class004052) {
        this.i = class004052;
        return this;
    }

    public class05216 y(int n) {
        this.y(this.method_10866().N(n));
        return this;
    }

    public class05216 y(class00392 class003922) {
        this.y.add(class003922);
        return this;
    }

    public class05216 N(class06541 class065412) {
        this.y(this.method_10866().y(class065412));
        return this;
    }

    public class05216 N(UnaryOperator<class00405> unaryOperator) {
        this.y((class00405)unaryOperator.apply(this.method_10866()));
        return this;
    }

    public class05216 N(class06541 ... class06541Array) {
        this.y(this.method_10866().N(class06541Array));
        return this;
    }

    public static class05216 N(class04439 class044392) {
        return new class05216(class044392, Lists.newArrayList(), class00405.N);
    }

    public class05216 R() {
        this.y(this.method_10866().W());
        return this;
    }

    public class01028 method_30937() {
        class07018 class070182 = class07018.y();
        if (this.M != class070182) {
            this.R = class070182.N((class05936)this);
            this.M = class070182;
        }
        return this.R;
    }

    public class04439 method_10851() {
        return this.N;
    }
}

