/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  minecraft.class00104
 *  minecraft.class00392
 *  minecraft.class01055
 *  minecraft.class01283
 *  minecraft.class01623
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class03658
 *  minecraft.class03668
 *  minecraft.class03686
 *  minecraft.class03695
 *  minecraft.class04230
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06478
 *  minecraft.class06541
 *  minecraft.class08392
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import minecraft.class00104;
import minecraft.class00392;
import minecraft.class01055;
import minecraft.class01283;
import minecraft.class01623;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03658;
import minecraft.class03668;
import minecraft.class03686;
import minecraft.class03695;
import minecraft.class04230;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06478;
import minecraft.class06541;
import minecraft.class08392;
import org.jspecify.annotations.Nullable;

public class class01950
extends class05096 {
    private static final class00392 N = class00392.L((String)"selectWorld.experiments");
    private static final class00392 y = class00392.L((String)"selectWorld.experiments.info").N(class06541.field_1061);
    private static final int L = 310;
    private static final int u = 130;
    private final class03686 i = new class03686((class05096)this);
    private final class05096 R;
    private final class01623 M;
    private final Consumer<class01623> B;
    private final Object2BooleanMap<class01055> Z = new Object2BooleanLinkedOpenHashMap();
    private @Nullable class00104 z;

    public class01950(class05096 class050962, class01623 class016232, Consumer<class01623> consumer) {
        super(N);
        this.R = class050962;
        this.M = class016232;
        this.B = consumer;
        for (class01055 class010552 : class016232.u()) {
            if (class010552.E() != class01283.u) continue;
            this.Z.put((Object)class010552, class016232.M().contains(class010552));
        }
    }

    private void N() {
        ArrayList arrayList = new ArrayList(this.M.M());
        ArrayList arrayList2 = new ArrayList();
        this.Z.forEach((class010552, bl) -> {
            arrayList.remove(class010552);
            if (bl) {
                arrayList2.add(class010552);
            }
        });
        arrayList.addAll(Lists.reverse(arrayList2));
        this.M.y((Collection)arrayList.stream().map(class01055::M).toList());
        this.B.accept(this.M);
    }

    private static class00392 N(class01055 class010552) {
        String string = "dataPack." + class010552.M() + ".name";
        return class08392.N((String)string) ? class00392.L((String)string) : class010552.y();
    }

    public void method_25426() {
        this.i.N(N, this.field_22793);
        class01885 class018852 = (class01885)this.i.L((class02102)class01885.u());
        class018852.N((class02102)new class04230(y, this.field_22793).N(310), (T class020722) -> class020722.i(15));
        class03658 class036582 = class03668.N((int)299).N(2, true).y(4);
        this.Z.forEach((class010552, bl2) -> class036582.N(class01950.N(class010552), () -> this.Z.getBoolean(class010552), bl -> this.Z.put(class010552, bl.booleanValue())).N(class010552.L()));
        class03695 class036952 = class036582.y().N();
        this.z = new class00104(this.field_22787, class036952, 130);
        this.z.N(310);
        class018852.N((class02102)this.z);
        class01885 class018853 = (class01885)this.i.y((class02102)class01885.i().N(8));
        class018853.N((class02102)class05362.method_46430((class00392)class05220.u, class053622 -> this.N()).N());
        class018853.N((class02102)class05362.method_46430((class00392)class05220.i, class053622 -> this.method_25419()).N());
        this.i.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_48640() {
        this.z.y(130);
        this.i.N();
        int n = this.field_22790 - this.i.y() - this.z.method_48202().L();
        this.z.y(this.z.method_25364() + n);
    }

    public void method_25419() {
        this.field_22787.N(this.R);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{super.method_25435(), y});
    }
}

