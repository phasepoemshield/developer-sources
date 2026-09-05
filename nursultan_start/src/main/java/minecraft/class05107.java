/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class00072
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02252
 *  minecraft.class02566
 *  minecraft.class04601
 *  minecraft.class04602
 *  minecraft.class04654
 *  minecraft.class04691
 *  minecraft.class04702
 *  minecraft.class04704
 *  minecraft.class04708
 *  minecraft.class04724
 *  minecraft.class04945
 *  minecraft.class04961
 *  minecraft.class04981
 *  minecraft.class04995
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class05685
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00072;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02252;
import minecraft.class02566;
import minecraft.class04601;
import minecraft.class04602;
import minecraft.class04654;
import minecraft.class04691;
import minecraft.class04702;
import minecraft.class04704;
import minecraft.class04708;
import minecraft.class04724;
import minecraft.class04945;
import minecraft.class04961;
import minecraft.class04981;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05099;
import minecraft.class05111;
import minecraft.class05129;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class05685;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05107
extends class05407 {
    private static final class01894 N = class01894.y((String)"widget/slot_frame");
    private static final Logger y = LogUtils.getLogger();
    private static final int L = 80;
    private final class05096 u;
    private @Nullable class04981 i;
    private final long R;
    private final class00392[] M = new class00392[]{class00392.L((String)"mco.brokenworld.message.line1"), class00392.L((String)"mco.brokenworld.message.line2")};
    private int B;
    private final List<Integer> Z = Lists.newArrayList();
    private int z;

    private void L(int n) {
        class05111 class051112 = class05111.N();
        try {
            class04945 class049452 = class051112.y(this.i.y, n);
            class04704 class047042 = new class04704((class05096)((Object)this), class049452, this.i.N(n), bl -> {
                if (bl) {
                    this.Z.add(n);
                    this.method_37067();
                    this.y();
                } else {
                    this.field_22787.N((class05096)((Object)((Object)((Object)this))));
                }
            });
            this.field_22787.N((class05096)class047042);
        }
        catch (class05097 class050972) {
            y.error("Couldn't download world data", (Throwable)class050972);
            this.field_22787.N((class05096)new class04702(class050972, (class05096)((Object)this)));
        }
    }

    private boolean L() {
        return this.i != null && this.i.z();
    }

    public class05107(class05096 class050962, long l, boolean bl) {
        super((class00392)(bl ? class00392.L((String)"mco.brokenworld.minigame.title") : class00392.L((String)"mco.brokenworld.title")));
        this.u = class050962;
        this.R = l;
    }

    private void y() {
        Iterator var1 = this.i.z.entrySet().iterator();
        while (var1.hasNext()) {
            class05362 class053623;
            int n = (Integer)var1.next().getKey();
            if (n != this.i.T || this.i.z()) {
                class053623 = class05362.method_46430((class00392)class00392.L((String)"mco.brokenworld.play"), class053622 -> this.field_22787.N((class05096)new class04708(this.u, new class05129[]{new class04724(this.i.y, n, this::N)}))).N(this.y(n), class05107.N((int)8), 80, 20).N();
                class053623.field_22763 = !((class00072)this.i.z.get((Object)Integer.valueOf((int)n))).y.Z;
            } else {
                class053623 = class05362.method_46430((class00392)class00392.L((String)"mco.brokenworld.download"), class053622 -> this.field_22787.N((class05096)class02252.N((class05096)((Object)((Object)((Object)this))), (class00392)class00392.L((String)"mco.configure.world.restore.download.question.line1"), class037232 -> this.L(n)))).N(this.y(n), class05107.N((int)8), 80, 20).N();
            }
            if (this.Z.contains(n)) {
                class053623.field_22763 = false;
                class053623.method_25355((class00392)class00392.L((String)"mco.brokenworld.downloaded"));
            }
            this.method_37063((class04654)class053623);
        }
    }

    private int y(int n) {
        return this.B + (n - 1) * 110;
    }

    public class05096 N(class05097 class050972) {
        return new class04702(class050972, this.u);
    }

    private void N(long l) {
        class04601.N(class051112 -> class051112.N(l), (Consumer)class04601.N(this::N, (String)"Couldn't get own world")).thenAcceptAsync(class049812 -> {
            this.i = class049812;
            this.y();
        }, (Executor)this.field_22787);
    }

    public void N() {
        new Thread(() -> {
            class05111 class051112 = class05111.N();
            if (this.i.R == class04961.field_19433) {
                this.field_22787.execute(() -> this.field_22787.N((class05096)new class04708((class05096)((Object)((Object)((Object)((Object)this)))), new class05129[]{new class04691(this.i, (class05096)((Object)((Object)((Object)((Object)this)))), true, this.field_22787)})));
            } else {
                try {
                    class04981 class049812 = class051112.N(this.R);
                    this.field_22787.execute(() -> class05685.N((class04981)class049812, (class05096)((Object)((Object)((Object)((Object)this))))));
                }
                catch (class05097 class050972) {
                    y.error("Couldn't get own world", (Throwable)class050972);
                    this.field_22787.execute(() -> this.field_22787.N(this.N(class050972)));
                }
            }
        }).start();
    }

    private void N(class01054 class010542, int n, int n2, int n3, int n4, boolean bl, String string, int n5, long l, @Nullable String string2, boolean bl2) {
        class01894 class018942 = bl2 ? class05099.N : (string2 != null && l != -1L ? class04602.N((String)String.valueOf(l), (String)string2) : (n5 == 1 ? class05099.y : (n5 == 2 ? class05099.L : (n5 == 3 ? class05099.u : class04602.N((String)String.valueOf(this.i.j), (String)this.i.v)))));
        if (bl) {
            float f = 0.9f + 0.1f * class04995.P((double)((float)this.z * 0.2f));
            class010542.N(class08394.Na, class018942, n + 3, n2 + 3, 0.0f, 0.0f, 74, 74, 74, 74, 74, 74, class02566.N((float)1.0f, (float)f, (float)f, (float)f));
            class010542.N(class08394.Na, N, n, n2, 80, 80);
        } else {
            int n6 = class02566.N((float)1.0f, (float)0.56f, (float)0.56f, (float)0.56f);
            class010542.N(class08394.Na, class018942, n + 3, n2 + 3, 0.0f, 0.0f, 74, 74, 74, 74, 74, 74, n6);
            class010542.N(class08394.Na, N, n, n2, 80, 80, n6);
        }
        class010542.N(this.field_22793, string, n + 40, n2 + 66, -1);
    }

    public void method_25426() {
        this.B = this.field_22789 / 2 - 150;
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N((this.field_22789 - 150) / 2, class05107.N((int)13) - 5, 150, 20).N());
        if (this.i == null) {
            this.N(this.R);
        } else {
            this.y();
        }
    }

    public void method_25393() {
        ++this.z;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 17, -1);
        for (int i = 0; i < this.M.length; ++i) {
            class010542.N(this.field_22793, this.M[i], this.field_22789 / 2, class05107.N((int)-1) + 3 + i * 12, -6250336);
        }
        if (this.i == null) {
            return;
        }
        for (Map.Entry entry : this.i.z.entrySet()) {
            if (((class00072)entry.getValue()).y.B != null && ((class00072)entry.getValue()).y.M != -1L) {
                this.N(class010542, this.y((Integer)entry.getKey()), class05107.N((int)1) + 5, n, n2, this.i.T == (Integer)entry.getKey() && !this.L(), ((class00072)entry.getValue()).y.N(((Integer)entry.getKey()).intValue()), (Integer)entry.getKey(), ((class00072)entry.getValue()).y.M, ((class00072)entry.getValue()).y.B, ((class00072)entry.getValue()).y.Z);
                continue;
            }
            this.N(class010542, this.y((Integer)entry.getKey()), class05107.N((int)1) + 5, n, n2, this.i.T == (Integer)entry.getKey() && !this.L(), ((class00072)entry.getValue()).y.N(((Integer)entry.getKey()).intValue()), (Integer)entry.getKey(), -1L, null, ((class00072)entry.getValue()).y.Z);
        }
    }

    public void method_25419() {
        this.field_22787.N(this.u);
    }

    public class00392 method_25435() {
        return class00390.N((Collection)Stream.concat(Stream.of(this.field_22785), Stream.of(this.M)).collect(Collectors.toList()), (class00392)class05220.l);
    }
}

