/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class05862
 *  minecraft.class05941
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06889
 *  minecraft.class07003
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class08057
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Iterables;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class05862;
import minecraft.class05941;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06889;
import minecraft.class07003;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08057;
import org.jspecify.annotations.Nullable;

public interface class07322
extends class07290 {
    default public boolean L(@Nullable class07049 class070492, class00734 class007342) {
        if (class070492 != null) {
            class00494 class004942 = this.i(class070492, class007342);
            return class004942 == null || !class00389.L((class00494)class004942, (class00494)class00389.N((class00734)class007342), (class07003)class07003.Z);
        }
        return true;
    }

    default public Optional<class06889> method_33594(@Nullable class07049 class070492, class00494 class004943, class06889 class068892, double d, double d2, double d3) {
        if (class004943.method_1110()) {
            return Optional.empty();
        }
        class00734 class007343 = class004943.method_1107().L(d, d2, d3);
        class00494 class004944 = StreamSupport.stream(this.method_20812(class070492, class007343).spliterator(), false).filter(class004942 -> this.method_8621() == null || this.method_8621().N(class004942.method_1107())).flatMap(class004942 -> class004942.method_1090().stream()).map(class007342 -> class007342.L(d / 2.0, d2 / 2.0, d3 / 2.0)).map(class00389::N).reduce(class00389.N(), class00389::N);
        return class00389.N((class00494)class004943, (class00494)class004944, (class07003)class07003.i).method_33661(class068892);
    }

    default public boolean method_8587(@Nullable class07049 class070492, class00734 class007342) {
        return this.N(class070492, class007342, false);
    }

    default public Optional<class07209> method_51718(class07049 class070492, class00734 class007342) {
        class07209 class072092 = null;
        double d = Double.MAX_VALUE;
        class05941 class059412 = new class05941(this, class070492, class007342, false, (class072182, class004942) -> class072182);
        while (class059412.hasNext()) {
            class07209 class072093 = (class07209)class059412.next();
            double d2 = class072093.method_19770((class00737)class070492.method_73189());
            if (!(d2 < d) && (d2 != d || class072092 != null && class072092.compareTo((class00753)class072093) >= 0)) continue;
            class072092 = class072093.method_10062();
            d = d2;
        }
        return Optional.ofNullable(class072092);
    }

    public List<class00494> method_20743(@Nullable class07049 var1, class00734 var2);

    default public Iterable<class00494> method_20812(@Nullable class07049 class070492, class00734 class007342) {
        return this.N(class070492 == null ? class06092.N() : class06092.N((class07049)class070492), class007342);
    }

    public class08057 method_8621();

    private @Nullable class00494 i(class07049 class070492, class00734 class007342) {
        class08057 class080572 = this.method_8621();
        return class080572.N(class070492, class007342) ? class080572.N() : null;
    }

    default public Iterable<class00494> u(@Nullable class07049 class070492, class00734 class007342) {
        return this.N(class070492 == null ? class06092.y() : class06092.N((class07049)class070492, (boolean)true), class007342);
    }

    default public boolean y(class00734 class007342) {
        return this.method_8587(null, class007342);
    }

    default public class06183 y(class05862 class058622) {
        class06183 class061832 = this.N(class058622);
        class08057 class080572 = this.method_8621();
        if (class080572.N(class058622.y()) && !class080572.N(class061832.y())) {
            class06889 class068892 = class061832.y().u(class058622.y());
            class07211 class072112 = class07211.N((double)class068892.M, (double)class068892.B, (double)class068892.Z);
            class06889 class068893 = class080572.L(class061832.y());
            return new class06183(class068893, class072112, class07209.method_49638((class00737)class068893), false, true);
        }
        return class061832;
    }

    default public boolean y(@Nullable class07049 class070492, class00734 class007342, boolean bl) {
        Iterator<class00494> var5 = (bl ? this.u(class070492, class007342) : this.method_20812(class070492, class007342)).iterator();
        while (var5.hasNext()) {
            if (var5.next().method_1110()) continue;
            return false;
        }
        return true;
    }

    default public boolean y(@Nullable class07049 class070492, class00734 class007342) {
        return this.method_20743(class070492, class007342).isEmpty();
    }

    default public Iterable<class00494> N(@Nullable class07049 class070492, class00734 class007342, class06889 class068892) {
        List<class00494> var4 = this.method_20743(class070492, class007342);
        Iterable var5 = this.N(class06092.N((class07049)class070492, (double)class068892.B), class007342);
        return var4.isEmpty() ? var5 : Iterables.concat(var4, var5);
    }

    private Iterable<class00494> N(class06092 class060922, class00734 class007342) {
        return () -> new class05941(this, class060922, class007342, false, (class072182, class004942) -> class004942);
    }

    default public boolean N(class07049 class070492) {
        return this.method_8587(class070492, class070492.method_5829());
    }

    default public boolean N(@Nullable class07049 class070492, class00734 class007342, boolean bl) {
        return this.y(class070492, class007342, bl) && this.y(class070492, class007342) && this.L(class070492, class007342);
    }

    default public boolean a_(@Nullable class07049 class070492, class00734 class007342) {
        return this.y(class070492, class007342, false);
    }

    public @Nullable class07290 method_22338(int var1, int var2);

    default public boolean method_8628(class00500 class005002, class07209 class072092, class06092 class060922) {
        class00494 class004942 = class005002.y((class07290)this, class072092, class060922);
        return class004942.method_1110() || this.method_8611(null, class004942.method_66507((class00753)class072092));
    }

    default public boolean method_8606(class07049 class070492) {
        return this.method_8611(class070492, class00389.N((class00734)class070492.method_5829()));
    }

    default public Iterable<class00494> method_8600(@Nullable class07049 class070492, class00734 class007342) {
        List<class00494> var3 = this.method_20743(class070492, class007342);
        Iterable var4 = this.method_20812(class070492, class007342);
        return var3.isEmpty() ? var4 : Iterables.concat(var3, var4);
    }

    default public boolean method_8611(@Nullable class07049 class070492, class00494 class004942) {
        return true;
    }

    default public boolean method_39454(@Nullable class07049 class070492, class00734 class007342) {
        class05941 class059412 = new class05941(this, class070492, class007342, true, (class072182, class004942) -> class004942);
        while (class059412.hasNext()) {
            if (((class00494)class059412.next()).method_1110()) continue;
            return true;
        }
        return false;
    }
}

