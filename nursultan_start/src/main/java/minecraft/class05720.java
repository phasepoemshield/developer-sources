/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class00891
 *  minecraft.class01022
 *  minecraft.class01042
 *  minecraft.class01054
 *  minecraft.class01584
 *  minecraft.class01627
 *  minecraft.class01894
 *  minecraft.class01896
 *  minecraft.class01921
 *  minecraft.class02055
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class04227
 *  minecraft.class04336
 *  minecraft.class04412
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05946
 *  minecraft.class07376
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class00891;
import minecraft.class01022;
import minecraft.class01042;
import minecraft.class01054;
import minecraft.class01584;
import minecraft.class01627;
import minecraft.class01894;
import minecraft.class01896;
import minecraft.class01921;
import minecraft.class02055;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class04227;
import minecraft.class04336;
import minecraft.class04412;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05722;
import minecraft.class05737;
import minecraft.class05946;
import minecraft.class07376;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05720
extends class05096 {
    static final class01894 N = class01894.y((String)"container/slot");
    static final Logger y = LogUtils.getLogger();
    private static final int R = 18;
    private static final int M = 20;
    private static final int B = 1;
    private static final int Z = 1;
    private static final int z = 2;
    private static final int U = 2;
    private static final class05946<class00780> E = class00795.y;
    public static final class00392 L = class00392.L((String)"flat_world_preset.unknown");
    private final class05737 W;
    private class00392 m;
    private class00392 P;
    private class05722 s;
    private class05362 T;
    class04927 u;
    class01584 i;

    public class05720(class05737 class057372) {
        super((class00392)class00392.L((String)"createWorld.customize.presets.title"));
        this.W = class057372;
    }

    private static @Nullable class01627 N(class02055<class00891> class020552, String string, int n) {
        Optional optional;
        int n2;
        String string2;
        List var3 = Splitter.on((char)'*').limit(2).splitToList((CharSequence)string);
        if (var3.size() == 2) {
            string2 = (String)var3.get(1);
            try {
                n2 = Math.max(Integer.parseInt((String)var3.get(0)), 0);
            }
            catch (NumberFormatException numberFormatException) {
                y.error("Error while parsing flat world string", (Throwable)numberFormatException);
                return null;
            }
        } else {
            string2 = (String)var3.get(0);
            n2 = 1;
        }
        int n3 = Math.min(n + n2, class07376.L);
        int n4 = n3 - n;
        try {
            optional = class020552.N(class05946.N((class05946)class04227.Z, (class01894)class01894.N((String)string2)));
        }
        catch (Exception exception) {
            y.error("Error while parsing flat world string", (Throwable)exception);
            return null;
        }
        if (optional.isEmpty()) {
            y.error("Error while parsing flat world string => Unknown block, {}", (Object)string2);
            return null;
        }
        return new class01627(n4, (class00891)((class03529)optional.get()).N());
    }

    public void N(boolean bl) {
        this.T.field_22763 = bl || this.u.method_1882().length() > 1;
    }

    private /* synthetic */ void N(class02055 class020552, class02055 class020553, class02055 class020554, class02055 class020555, class05362 class053622) {
        class01584 class015842 = class05720.N((class02055<class00891>)class020552, (class02055<class00780>)class020553, (class02055<class04412>)class020554, (class02055<class04336>)class020555, this.u.method_1882(), this.i);
        this.W.N(class015842);
        this.field_22787.N((class05096)this.W);
    }

    private static List<class01627> N(class02055<class00891> class020552, String string) {
        ArrayList arrayList = Lists.newArrayList();
        String[] stringArray = string.split(",");
        int n = 0;
        for (String string2 : stringArray) {
            class01627 class016272 = class05720.N(class020552, string2, n);
            if (class016272 == null) {
                return Collections.emptyList();
            }
            int n2 = class07376.L - n;
            if (n2 <= 0) continue;
            arrayList.add(class016272.N(n2));
            n += class016272.N();
        }
        return arrayList;
    }

    public static class01584 N(class02055<class00891> class020552, class02055<class00780> class020553, class02055<class04412> class020554, class02055<class04336> class020555, String string, class01584 class015842) {
        class03529 class035292;
        Iterator var6 = Splitter.on((char)';').split((CharSequence)string).iterator();
        if (!var6.hasNext()) {
            return class01584.N(class020553, class020554, class020555);
        }
        List<class01627> var7 = class05720.N(class020552, (String)var6.next());
        if (var7.isEmpty()) {
            return class01584.N(class020553, class020554, class020555);
        }
        class03529 class035293 = class035292 = class020553.y(E);
        if (var6.hasNext()) {
            String string2 = (String)var6.next();
            class035293 = (class03556)Optional.ofNullable(class01894.L((String)string2)).map(class018942 -> class05946.N((class05946)class04227.NA, (class01894)class018942)).flatMap(arg_0 -> class020553.N(arg_0)).orElseGet(() -> {
                y.warn("Invalid biome: {}", (Object)string2);
                return class035292;
            });
        }
        return class015842.N(var7, class015842.L(), (class03556)class035293);
    }

    static String N(class01584 class015842) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < class015842.i().size(); ++i) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(class015842.i().get(i));
        }
        stringBuilder.append(";");
        stringBuilder.append(class015842.u().i().map(class05946::N).orElseThrow(() -> new IllegalStateException("Biome not registered")));
        return stringBuilder.toString();
    }

    public void method_25426() {
        this.m = class00392.L((String)"createWorld.customize.presets.share");
        this.P = class00392.L((String)"createWorld.customize.presets.list");
        this.u = new class04927(this.field_22793, 50, 40, this.field_22789 - 100, 20, this.m);
        this.u.method_1880(1230);
        class01896 class018962 = this.W.y.N().U();
        class01022 class010222 = class018962.N();
        class03767 class037672 = class018962.B().y();
        class00751 class007512 = class010222.L(class04227.NA);
        class00751 class007513 = class010222.L(class04227.yb);
        class00751 class007514 = class010222.L(class04227.ys);
        class01921 class019212 = class010222.L(class04227.Z).N(class037672);
        this.u.method_1852(class05720.N(this.W.N()));
        this.i = this.W.N();
        this.method_25429((class04654)this.u);
        this.s = (class05722)this.method_37063((class04654)new class05722(this, (class01042)class010222, class037672));
        this.T = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"createWorld.customize.presets.select"), arg_0 -> this.N((class02055)class019212, (class02055)class007512, (class02055)class007513, (class02055)class007514, arg_0)).N(this.field_22789 / 2 - 155, this.field_22790 - 28, 150, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> this.field_22787.N((class05096)this.W)).N(this.field_22789 / 2 + 5, this.field_22790 - 28, 150, 20).N());
        this.N(this.s.method_25334() != null);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 8, -1);
        class010542.y(this.field_22793, this.m, 51, 30, -6250336);
        class010542.y(this.field_22793, this.P, 51, 68, -6250336);
        this.u.method_25394(class010542, n, n2, f);
    }

    public void method_25419() {
        this.field_22787.N((class05096)this.W);
    }

    public void method_25410(int n, int n2) {
        String string = this.u.method_1882();
        this.method_25423(n, n2);
        this.u.method_1852(string);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        return this.s.method_25401(d, d2, d3, d4);
    }
}

