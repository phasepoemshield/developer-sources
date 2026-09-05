/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00392
 *  minecraft.class01711
 *  minecraft.class01716
 *  minecraft.class01728
 *  minecraft.class01747
 *  minecraft.class07001
 *  minecraft.class07009
 *  minecraft.class07019
 *  minecraft.class07037
 *  minecraft.class07536
 *  minecraft.class07684
 *  minecraft.class07707
 *  minecraft.class07709
 *  minecraft.class07729
 *  minecraft.class07730
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.lang.runtime.SwitchBootstraps;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01711;
import minecraft.class01716;
import minecraft.class01728;
import minecraft.class01747;
import minecraft.class01878;
import minecraft.class01887;
import minecraft.class01894;
import minecraft.class07001;
import minecraft.class07009;
import minecraft.class07019;
import minecraft.class07037;
import minecraft.class07536;
import minecraft.class07684;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07729;
import minecraft.class07730;
import org.jspecify.annotations.Nullable;

public class class01859<T extends class01711<T>>
implements class07684<T> {
    private static final DecimalFormat N = (DecimalFormat)class07536.N((Object)new DecimalFormat("#", DecimalFormatSymbols.getInstance(Locale.ROOT)), (T decimalFormat) -> decimalFormat.setMaximumFractionDigits(15));
    private static final int y = 8;
    private final List<String> L;
    private final Object2ObjectLinkedOpenHashMap<List<String>, class01747<T>> u = new Object2ObjectLinkedOpenHashMap(8, 0.25f);
    private final class01894 i;
    private final List<class01887<T>> R;

    public class01859(class01894 class018942, List<class01887<T>> list, List<String> list2) {
        this.i = class018942;
        this.R = list;
        this.L = list2;
    }

    private class01747<T> N(List<String> list, List<String> list2, CommandDispatcher<T> commandDispatcher) throws class01878 {
        ArrayList<class01716<T>> arrayList = new ArrayList<class01716<T>>(this.R.size());
        ArrayList<String> arrayList2 = new ArrayList<String>(list2.size());
        for (class01887<T> class018872 : this.R) {
            class01859.N(list2, class018872.N(), arrayList2);
            arrayList.add(class018872.N(arrayList2, commandDispatcher, this.i));
        }
        return new class01728(this.N().N(string -> string + "/" + list.hashCode()), arrayList);
    }

    public class01747<T> N(@Nullable class07001 class070012, CommandDispatcher<T> commandDispatcher) throws class01878 {
        if (class070012 == null) {
            throw new class01878((class00392)class00392.N((String)"commands.function.error.missing_arguments", (Object[])new Object[]{class00392.N((class01894)this.N())}));
        }
        ArrayList<String> arrayList = new ArrayList<String>(this.L.size());
        for (String class0174722 : this.L) {
            class07709 class077092 = class070012.N(class0174722);
            if (class077092 == null) {
                throw new class01878((class00392)class00392.N((String)"commands.function.error.missing_argument", (Object[])new Object[]{class00392.N((class01894)this.N()), class0174722}));
            }
            arrayList.add(class01859.N(class077092));
        }
        class01747 class017473 = (class01747)this.u.getAndMoveToLast(arrayList);
        if (class017473 != null) {
            return class017473;
        }
        if (this.u.size() >= 8) {
            this.u.removeFirst();
        }
        class01747<T> class017472 = this.N(this.L, arrayList, commandDispatcher);
        this.u.put(arrayList, class017472);
        return class017472;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String N(class07709 class077092) {
        String string;
        class07709 class077093 = class077092;
        Objects.requireNonNull(class077093);
        class07709 class077094 = class077093;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class07009.class, class07019.class, class07037.class, class07730.class, class07729.class, class07707.class}, (Object)class077094, (int)n)) {
            case 0: {
                float f2;
                try {
                    float f;
                    f2 = f = ((class07009)class077094).m();
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                string = N.format(f2);
                return string;
            }
            case 1: {
                double d2;
                class07019 class070192 = (class07019)class077094;
                {
                    double d;
                    d2 = d = class070192.m();
                }
                string = N.format(d2);
                return string;
            }
            case 2: {
                byte by;
                class07037 class070372 = (class07037)class077094;
                {
                    by = class070372.m();
                }
                string = String.valueOf(by);
                return string;
            }
            case 3: {
                short s;
                class07730 class077302 = (class07730)class077094;
                {
                    s = class077302.m();
                }
                string = String.valueOf(s);
                return string;
            }
            case 4: {
                long l;
                class07729 class077292 = (class07729)class077094;
                {
                    l = class077292.m();
                }
                string = String.valueOf(l);
                return string;
            }
            case 5: {
                class07707 class077072 = (class07707)class077094;
                {
                    string = class077072.U();
                    return string;
                }
            }
        }
        string = class077092.toString();
        return string;
    }

    private static void N(List<String> list, IntList intList, List<String> list2) {
        list2.clear();
        intList.forEach(n -> list2.add((String)list.get(n)));
    }

    public class01894 N() {
        return this.i;
    }
}

