/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  minecraft.class00392
 *  minecraft.class01022
 *  minecraft.class01042
 *  minecraft.class01054
 *  minecraft.class01093
 *  minecraft.class01623
 *  minecraft.class01910
 *  minecraft.class03531
 *  minecraft.class04654
 *  minecraft.class04785
 *  minecraft.class04995
 *  minecraft.class05081
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class05946
 *  minecraft.class06202
 *  minecraft.class06711
 *  minecraft.class07299
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.Objects;
import java.util.function.ToIntFunction;
import minecraft.class00392;
import minecraft.class01022;
import minecraft.class01042;
import minecraft.class01054;
import minecraft.class01093;
import minecraft.class01623;
import minecraft.class01910;
import minecraft.class03531;
import minecraft.class04654;
import minecraft.class04785;
import minecraft.class04995;
import minecraft.class05081;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05946;
import minecraft.class06202;
import minecraft.class06711;
import minecraft.class07299;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05210
extends class05096 {
    private static final Logger N = LogUtils.getLogger();
    private static final ToIntFunction<class05946<class07299>> y = (ToIntFunction)class07536.N((Object)new Reference2IntOpenHashMap(), reference2IntOpenHashMap -> {
        reference2IntOpenHashMap.put((Object)class07299.field_25179, -13408734);
        reference2IntOpenHashMap.put((Object)class07299.field_25180, -10075085);
        reference2IntOpenHashMap.put((Object)class07299.field_25181, -8943531);
        reference2IntOpenHashMap.defaultReturnValue(-2236963);
    });
    private final BooleanConsumer L;
    private final class06711 u;

    private class05210(BooleanConsumer booleanConsumer, DataFixer dataFixer, class04785 class047852, class05081 class050812, boolean bl, class01042 class010422) {
        super((class00392)class00392.N((String)"optimizeWorld.title", (Object[])new Object[]{class050812.q().N()}));
        this.L = booleanConsumer;
        this.u = new class06711(class047852, dataFixer, class050812, class010422, bl, false);
    }

    public static @Nullable class05210 N(class06202 class062022, BooleanConsumer booleanConsumer, DataFixer dataFixer, class04785 class047852, boolean bl) {
        class05210 class052102;
        block8: {
            class01910 class019102 = class062022.S();
            class01623 class016232 = class01093.N((class04785)class047852);
            class03531 class035312 = class019102.N(class047852.B(), false, class016232);
            try {
                class05081 class050812 = class035312.u();
                class01022 class010222 = class035312.L().N();
                class047852.N((class01042)class010222, class050812);
                class052102 = new class05210(booleanConsumer, dataFixer, class047852, class050812, bl, (class01042)class010222);
                if (class035312 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (class035312 != null) {
                        try {
                            class035312.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    N.warn("Failed to load datapacks, can't optimize world", (Throwable)exception);
                    return null;
                }
            }
            class035312.close();
        }
        return class052102;
    }

    public void method_25426() {
        super.method_25426();
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> {
            this.u.N();
            this.L.accept(false);
        }).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 150, 200, 20).N());
    }

    public void method_25393() {
        if (this.u.y()) {
            this.L.accept(true);
        }
    }

    public void method_25432() {
        this.u.N();
        this.u.close();
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 20, -1);
        int n3 = this.field_22789 / 2 - 150;
        int n4 = this.field_22789 / 2 + 150;
        int n5 = this.field_22790 / 4 + 100;
        int n6 = n5 + 10;
        class00392 class003922 = this.u.B();
        int n7 = this.field_22789 / 2;
        Objects.requireNonNull(this.field_22793);
        class010542.N(this.field_22793, class003922, n7, n5 - 9 - 2, -6250336);
        if (this.u.i() > 0) {
            class010542.N(n3 - 1, n5 - 1, n4 + 1, n6 + 1, -16777216);
            class010542.y(this.field_22793, (class00392)class00392.N((String)"optimizeWorld.info.converted", (Object[])new Object[]{this.u.R()}), n3, 40, -6250336);
            class05216 class052162 = class00392.N((String)"optimizeWorld.info.skipped", (Object[])new Object[]{this.u.M()});
            Objects.requireNonNull(this.field_22793);
            class010542.y(this.field_22793, (class00392)class052162, n3, 40 + 9 + 3, -6250336);
            class05216 class052163 = class00392.N((String)"optimizeWorld.info.total", (Object[])new Object[]{this.u.i()});
            Objects.requireNonNull(this.field_22793);
            class010542.y(this.field_22793, (class00392)class052163, n3, 40 + 24, -6250336);
            int n8 = 0;
            for (class05946 var11 : this.u.L()) {
                int n9 = class04995.y((float)(this.u.N(var11) * (float)(n4 - n3)));
                class010542.N(n3 + n8, n5, n3 + n8 + n9, n6, y.applyAsInt((class05946<class07299>)var11));
                n8 += n9;
            }
            int n10 = this.u.R() + this.u.M();
            class05216 class052164 = class00392.N((String)"optimizeWorld.progress.counter", (Object[])new Object[]{n10, this.u.i()});
            class05216 class052165 = class00392.N((String)"optimizeWorld.progress.percentage", (Object[])new Object[]{class04995.y((float)(this.u.u() * 100.0f))});
            int n11 = this.field_22789 / 2;
            Objects.requireNonNull(this.field_22793);
            class010542.N(this.field_22793, (class00392)class052164, n11, n5 + 2 * 9 + 2, -6250336);
            int n12 = this.field_22789 / 2;
            int n13 = n5 + (n6 - n5) / 2;
            Objects.requireNonNull(this.field_22793);
            class010542.N(this.field_22793, (class00392)class052165, n12, n13 - 4, -6250336);
        }
    }

    public void method_25419() {
        this.L.accept(false);
    }
}

