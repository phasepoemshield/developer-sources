/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.BiFunction;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07536;
import minecraft.class07701;
import org.jspecify.annotations.Nullable;

public final class class07664
extends Enum<class07664> {
    public static final /* enum */ class07664 field_9853 = new class07664("feet", (class068892, class070492) -> class068892);
    public static final /* enum */ class07664 field_9851 = new class07664("eyes", (class068892, class070492) -> new class06889(class068892.M, class068892.B + (double)class070492.method_5751(), class068892.Z));
    static final Map<String, class07664> field_9852;
    private final String field_9849;
    private final BiFunction<class06889, class07049, class06889> field_9848;
    private static final /* synthetic */ class07664[] field_9850;

    private class07664(String string2, BiFunction<class06889, class07049, class06889> biFunction) {
        this.field_9849 = string2;
        this.field_9848 = biFunction;
    }

    public static class07664[] values() {
        return (class07664[])field_9850.clone();
    }

    public static class07664 valueOf(String string) {
        return Enum.valueOf(class07664.class, string);
    }

    public class06889 N(class07701 class077012) {
        class07049 class070492 = class077012.M();
        if (class070492 == null) {
            return class077012.i();
        }
        return this.field_9848.apply(class077012.i(), class070492);
    }

    private static /* synthetic */ class07664[] N() {
        return new class07664[]{field_9853, field_9851};
    }

    public class06889 N(class07049 class070492) {
        return this.field_9848.apply(class070492.method_73189(), class070492);
    }

    public static @Nullable class07664 N(String string) {
        return field_9852.get(string);
    }

    static {
        field_9850 = class07664.N();
        field_9852 = (Map)class07536.N((Object)Maps.newHashMap(), (T hashMap) -> {
            for (class07664 class076642 : class07664.values()) {
                hashMap.put(class076642.field_9849, class076642);
            }
        });
    }
}

