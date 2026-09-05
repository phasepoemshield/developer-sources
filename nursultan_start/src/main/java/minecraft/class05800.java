/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00737
 *  minecraft.class06889
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import minecraft.class00392;
import minecraft.class00737;
import minecraft.class05798;
import minecraft.class06889;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

class class05800 {
    private final class00392 N;
    private final float y;
    private final List<class05798> L = new ArrayList<class05798>();

    public boolean L(class06889 class068892) {
        if (Float.isInfinite(this.y)) {
            return true;
        }
        if (this.L.isEmpty()) {
            return false;
        }
        class05798 class057982 = this.N(class068892);
        if (class057982 == null) {
            return false;
        }
        return class068892.N((class00737)class057982.N(), (double)this.y);
    }

    public class05800(class00392 class003922, float f, class06889 class068892) {
        this.N = class003922;
        this.y = f;
        this.L.add(new class05798(class068892, class07536.L()));
    }

    public boolean y() {
        return !this.L.isEmpty();
    }

    public void y(class06889 class068892) {
        this.L.removeIf(class057982 -> class068892.equals((Object)class057982.N()));
        this.L.add(new class05798(class068892, class07536.L()));
    }

    public void N(double d) {
        long l = class07536.L();
        this.L.removeIf(class057982 -> (double)(l - class057982.y()) > d);
    }

    public class00392 N() {
        return this.N;
    }

    public @Nullable class05798 N(class06889 class068892) {
        if (this.L.isEmpty()) {
            return null;
        }
        if (this.L.size() == 1) {
            return (class05798)((Object)this.L.getFirst());
        }
        return this.L.stream().min(Comparator.comparingDouble(class057982 -> class057982.N().R(class068892))).orElse(null);
    }
}

