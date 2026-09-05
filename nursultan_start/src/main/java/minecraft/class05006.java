/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11300
 *  Nursultan.class11938
 *  com.mojang.authlib.GameProfile
 *  com.viaversion.viafabricplus.visuals.injection.access.r1_7_tab_list_tyle.IPlayerInfo
 *  com.viaversion.viafabricplus.visuals.injection.access.r1_7_tab_list_tyle.IPlayerTabOverlay
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00502
 *  minecraft.class00518
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01590
 *  minecraft.class01683
 *  minecraft.class01759
 *  minecraft.class01762
 *  minecraft.class01766
 *  minecraft.class01788
 *  minecraft.class01894
 *  minecraft.class01962
 *  minecraft.class02566
 *  minecraft.class03448
 *  minecraft.class03458
 *  minecraft.class03933
 *  minecraft.class04453
 *  minecraft.class05216
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06639
 *  minecraft.class06640
 *  minecraft.class06683
 *  minecraft.class07282
 *  minecraft.class08036
 *  minecraft.class08287
 *  minecraft.class08394
 *  org.joml.Matrix3x2fStack
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class11300;
import Nursultan.class11938;
import com.mojang.authlib.GameProfile;
import com.viaversion.viafabricplus.visuals.injection.access.r1_7_tab_list_tyle.IPlayerInfo;
import com.viaversion.viafabricplus.visuals.injection.access.r1_7_tab_list_tyle.IPlayerTabOverlay;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00502;
import minecraft.class00518;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01590;
import minecraft.class01683;
import minecraft.class01759;
import minecraft.class01762;
import minecraft.class01766;
import minecraft.class01788;
import minecraft.class01894;
import minecraft.class01962;
import minecraft.class02566;
import minecraft.class03448;
import minecraft.class03458;
import minecraft.class03933;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05004;
import minecraft.class05019;
import minecraft.class05216;
import minecraft.class05630;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06639;
import minecraft.class06640;
import minecraft.class06683;
import minecraft.class07282;
import minecraft.class08036;
import minecraft.class08287;
import minecraft.class08394;
import org.joml.Matrix3x2fStack;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05006
implements IPlayerTabOverlay {
    private static final class01894 L = class01894.y((String)"icon/ping_unknown");
    private static final class01894 u = class01894.y((String)"icon/ping_1");
    private static final class01894 i = class01894.y((String)"icon/ping_2");
    private static final class01894 R = class01894.y((String)"icon/ping_3");
    private static final class01894 M = class01894.y((String)"icon/ping_4");
    private static final class01894 B = class01894.y((String)"icon/ping_5");
    private static final class01894 Z = class01894.y((String)"hud/heart/container_blinking");
    private static final class01894 z = class01894.y((String)"hud/heart/container");
    private static final class01894 U = class01894.y((String)"hud/heart/full_blinking");
    private static final class01894 E = class01894.y((String)"hud/heart/half_blinking");
    private static final class01894 W = class01894.y((String)"hud/heart/absorbing_full_blinking");
    private static final class01894 m = class01894.y((String)"hud/heart/full");
    private static final class01894 P = class01894.y((String)"hud/heart/absorbing_half_blinking");
    private static final class01894 s = class01894.y((String)"hud/heart/half");
    private static final Comparator<class03458> T = Comparator.comparingInt(class034582 -> -class034582.U()).thenComparingInt(class034582 -> class034582.i() == class07282.field_9219 ? 1 : 0).thenComparing(class034582 -> (String)class01962.N((Object)class034582.B(), class00502::L, (Object)"")).thenComparing(class034582 -> class034582.N().name(), String::compareToIgnoreCase);
    public static final int N = 20;
    private final class06202 b;
    private final class01056 j;
    public @Nullable class00392 y;
    private @Nullable class00392 v;
    private boolean n;
    private final Map<UUID, class05004> t = new Object2ObjectOpenHashMap();
    private int G;
    private static final Comparator l;
    private int d;
    private boolean w = true;

    private boolean M(class03458 class034582) {
        class07282 class072822 = class034582.i();
        return class072822 == class07282.field_9220 || class072822 == class07282.field_9219;
    }

    public class05006(class06202 class062022, class01056 class010562) {
        this.b = class062022;
        this.j = class010562;
    }

    private static /* synthetic */ int z(class03458 class034582) {
        return ((IPlayerInfo)class034582).viaFabricPlusVisuals$getIndex();
    }

    private boolean y(boolean bl) {
        return bl && !this.w;
    }

    private void y(CallbackInfoReturnable callbackInfoReturnable) {
        if (VisualSettings.INSTANCE.enableLegacyTablist.isEnabled()) {
            callbackInfoReturnable.setReturnValue((Object)((class01683)((class04453)this.b.T_4).y_0).B().stream().sorted(l).limit(this.d).collect(Collectors.collectingAndThen(Collectors.toList(), this::N)));
        } else {
            this.w = false;
        }
    }

    private List<class03458> y() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.y(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (List)callbackInfoReturnable.getReturnValue();
        }
        List var1 = ((class01683)((class04453)this.b.T_4).y_0).B().stream().sorted(T).limit(80L).toList();
        CallbackInfoReturnable callbackInfoReturnable2 = new CallbackInfoReturnable("", true, (Object)var1);
        this.N(callbackInfoReturnable2);
        if (callbackInfoReturnable2.isCancelled()) {
            return (List)callbackInfoReturnable2.getReturnValue();
        }
        return var1;
    }

    public void y(@Nullable class00392 class003922) {
        this.v = class003922;
    }

    public void N(boolean bl) {
        if (this.n != bl) {
            this.t.clear();
            this.n = bl;
            if (bl) {
                class05216 class052162 = class00390.N(this.y(), (class00392)class00392.y((String)", "), this::N);
                this.b.NT().u((class00392)class00392.N((String)"multiplayer.player.list.narration", (Object[])new Object[]{class052162}));
            }
        }
    }

    private void N(int n, int n2, int n3, UUID uUID2, class01054 class010542, int n4) {
        int n5;
        class05004 class050042 = this.t.computeIfAbsent(uUID2, uUID -> new class05004(n4));
        class050042.N(n4, this.j.R());
        int n6 = class04995.R(Math.max(n4, class050042.N()), 2);
        int n7 = Math.max(n4, Math.max(class050042.N(), 20)) / 2;
        boolean bl = class050042.N(this.j.R());
        if (n6 <= 0) {
            return;
        }
        int n8 = class04995.y(Math.min((float)(n3 - n2 - 4) / (float)n7, 9.0f));
        if (n8 <= 3) {
            float f = class04995.N((float)n4 / 20.0f, 0.0f, 1.0f);
            int n9 = (int)((1.0f - f) * 255.0f) << 16 | (int)(f * 255.0f) << 8;
            float f2 = (float)n4 / 2.0f;
            class05216 class052162 = class00392.N((String)"multiplayer.player.list.hp", (Object[])new Object[]{Float.valueOf(f2)});
            class05216 class052163 = n3 - ((class01590)this.b.i_3).N((class05936)class052162) >= n2 ? class052162 : class00392.y((String)Float.toString(f2));
            class010542.y((class01590)this.b.i_3, (class00392)class052163, (n3 + n2 - ((class01590)this.b.i_3).N((class05936)class052163)) / 2, n, class02566.M((int)n9));
            return;
        }
        class01894 class018942 = bl ? Z : z;
        for (n5 = n6; n5 < n7; ++n5) {
            class010542.N(class08394.Na, class018942, n2 + n5 * n8, n, 9, 9);
        }
        for (n5 = 0; n5 < n6; ++n5) {
            class010542.N(class08394.Na, class018942, n2 + n5 * n8, n, 9, 9);
            if (bl) {
                if (n5 * 2 + 1 < class050042.N()) {
                    class010542.N(class08394.Na, U, n2 + n5 * n8, n, 9, 9);
                }
                if (n5 * 2 + 1 == class050042.N()) {
                    class010542.N(class08394.Na, E, n2 + n5 * n8, n, 9, 9);
                }
            }
            if (n5 * 2 + 1 < n4) {
                class010542.N(class08394.Na, n5 >= 10 ? W : m, n2 + n5 * n8, n, 9, 9);
            }
            if (n5 * 2 + 1 != n4) continue;
            class010542.N(class08394.Na, n5 >= 10 ? P : s, n2 + n5 * n8, n, 9, 9);
        }
    }

    private void N(class01054 class010542, int n, class06683 class066832, class00518 class005182, CallbackInfo callbackInfo) {
        this.G = 0;
    }

    private int N(int n, List list) {
        int n2;
        if ((n2 = this.G++) < 0 || n2 >= list.size()) {
            return n;
        }
        class03458 class034582 = (class03458)list.get(n2);
        class04453 class044532 = (class04453)class06202.Nq().T_4;
        if (class044532 != null && class034582.N().id().equals(class044532.method_7334().id())) {
            return class11300.N((int)2725887, (int)130);
        }
        String string = class034582.N().name();
        if (class11938.t().L(string) || class11938.N().N(string)) {
            return class11300.N((int)0x40FF40, (int)130);
        }
        if (this.M(class034582)) {
            return class11300.N((int)0xFF4040, (int)130);
        }
        return n;
    }

    private List N(List list) {
        if (list.size() != this.d) {
            this.w = list.stream().noneMatch(class034582 -> class034582.N().properties().containsKey((Object)"textures"));
            return list;
        }
        ArrayList<class03458> arrayList = new ArrayList<class03458>(list.size());
        int n = this.d / 20;
        boolean bl = false;
        for (int i = 0; i < this.d; ++i) {
            int n2 = i % 20;
            int n3 = i / 20;
            class03458 class034583 = (class03458)list.get(n2 * n + n3);
            arrayList.add(class034583);
            bl = bl || class034583.N().properties().containsKey((Object)"textures");
        }
        this.w = !bl;
        return arrayList;
    }

    public class00392 N(class03458 class034582) {
        if (class034582.Z() != null) {
            return this.N(class034582, class034582.Z().L());
        }
        return this.N(class034582, class00502.N((class06639)class034582.B(), (class00392)class00392.y((String)class034582.N().name())));
    }

    private class00392 N(class03458 class034582, class05216 class052162) {
        return class034582.i() == class07282.field_9219 ? class052162.N(class06541.field_1056) : class052162;
    }

    private void N(class01054 class010542, int n, int n2, int n3, class03458 class034582, CallbackInfo callbackInfo) {
        int n4 = class034582.R();
        Object object = n4 <= 0 ? "?" : n4 + "ms";
        float f = (1.0f - Math.min(1.0f, (float)Math.max(0, n4) / 200.0f)) * 0.33333334f;
        int n5 = 0xFF000000 | class04995.M(f, 1.0f, 1.0f);
        float f2 = 0.5f;
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        int n6 = Math.round(((float)(n2 + n - 1) - (float)class015902.y((String)object) * f2) / f2);
        float f3 = n3;
        Objects.requireNonNull(class015902);
        int n7 = Math.round((f3 + (8.0f - 9.0f * f2) / 2.0f) / f2);
        Matrix3x2fStack matrix3x2fStack = class010542.i();
        matrix3x2fStack.pushMatrix();
        matrix3x2fStack.scale(f2, f2);
        class010542.y(class015902, (String)object, n6, n7, n5);
        matrix3x2fStack.popMatrix();
        callbackInfo.cancel();
    }

    private void N(class00518 class005182, int n, class05019 class050192, int n2, int n3, UUID uUID, class01054 class010542) {
        if (class005182.Z() == class06640.field_1471) {
            this.N(n, n2, n3, uUID, class010542, class050192.y());
        } else if (class050192.L() != null) {
            class010542.y((class01590)this.b.i_3, class050192.L(), n3 - class050192.u(), n, -1);
        }
    }

    public void N() {
        this.v = null;
        this.y = null;
    }

    public void N(@Nullable class00392 class003922) {
        this.y = class003922;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        List list = (List)callbackInfoReturnable.getReturnValue();
        if (list.size() < 2) {
            return;
        }
        ArrayList<class03458> arrayList = new ArrayList<class03458>(list);
        arrayList.sort(Comparator.comparingInt(class034582 -> this.M((class03458)class034582) ? 0 : 1));
        callbackInfoReturnable.setReturnValue(arrayList);
    }

    public void N(class01054 class010542, int n, class06683 class066832, @Nullable class00518 class005182) {
        int n2;
        int n3;
        List var20;
        List var19;
        int n4;
        int n5;
        int n6;
        this.N(class010542, n, class066832, class005182, null);
        List<class03458> var5 = this.y();
        ArrayList<class05019> arrayList = new ArrayList<class05019>(var5.size());
        int n7 = ((class01590)this.b.i_3).y(" ");
        int n8 = 0;
        int n9 = 0;
        for (class03458 class034583 : var5) {
            class00392 class003922 = this.N(class034583);
            n8 = Math.max(n8, ((class01590)this.b.i_3).N((class05936)class003922));
            n6 = 0;
            class05216 class052162 = null;
            n5 = 0;
            if (class005182 != null) {
                class01766 class017662 = class01766.N((GameProfile)class034583.N());
                class01788 class017882 = class066832.y(class017662, class005182);
                if (class017882 != null) {
                    n6 = class017882.y();
                }
                if (class005182.Z() != class06640.field_1471) {
                    class01762 class017622 = class005182.N((class01762)class01759.u);
                    class052162 = class01788.N((class01788)class017882, (class01762)class017622);
                    n5 = ((class01590)this.b.i_3).N((class05936)class052162);
                    n9 = Math.max(n9, n5 > 0 ? n7 + n5 : 0);
                }
            }
            arrayList.add(new class05019(class003922, n6, (class00392)class052162, n5));
        }
        if (!this.t.isEmpty()) {
            Set set = var5.stream().map(class034582 -> class034582.N().id()).collect(Collectors.toSet());
            this.t.keySet().removeIf(uUID -> !set.contains(uUID));
        }
        int n10 = n4 = var5.size();
        int n11 = 1;
        while (n10 > 20) {
            n10 = (n4 + ++n11 - 1) / n11;
        }
        int n12 = n6 = this.b.q() || this.y(this.b.NE().M().method_10771()) ? 1 : 0;
        int n13 = class005182 != null ? (class005182.Z() == class06640.field_1471 ? 90 : n9) : 0;
        n5 = Math.min(n11 * ((n6 != 0 ? 9 : 0) + n8 + n13 + 13), n - 50) / n11;
        int n14 = n / 2 - (n5 * n11 + (n11 - 1) * 5) / 2;
        int n15 = 10;
        int n16 = n5 * n11 + (n11 - 1) * 5;
        Object var19_26 = null;
        if (this.v != null) {
            var19 = ((class01590)this.b.i_3).L((class05936)this.v, n - 50);
            for (Object object : var19) {
                n16 = Math.max(n16, ((class01590)this.b.i_3).N((class01028)object));
            }
        }
        Iterator iterator = null;
        if (this.y != null) {
            var20 = ((class01590)this.b.i_3).L((class05936)this.y, n - 50);
            for (class01028 class010282 : var20) {
                n16 = Math.max(n16, ((class01590)this.b.i_3).N(class010282));
            }
        }
        if (var19 != null) {
            int n17 = n / 2 - n16 / 2 - 1;
            int n18 = n / 2 + n16 / 2 + 1;
            int n19 = var19.size();
            Objects.requireNonNull((class01590)this.b.i_3);
            class010542.N(n17, n15 - 1, n18, n15 + n19 * 9, Integer.MIN_VALUE);
            for (class01028 class010282 : var19) {
                n3 = ((class01590)this.b.i_3).N(class010282);
                class010542.y((class01590)this.b.i_3, class010282, n / 2 - n3 / 2, n15, -1);
                Objects.requireNonNull((class01590)this.b.i_3);
                n15 += 9;
            }
            ++n15;
        }
        class010542.N(n / 2 - n16 / 2 - 1, n15 - 1, n / 2 + n16 / 2 + 1, n15 + n10 * 9, Integer.MIN_VALUE);
        int n20 = ((class05630)this.b.i_7).N(0x20FFFFFF);
        for (int i = 0; i < n4; ++i) {
            int n21;
            int n22;
            n3 = i / n10;
            n2 = i % n10;
            int n23 = n14 + n3 * n5 + n3 * 5;
            int n24 = n15 + n2 * 9;
            int n25 = n20;
            class010542.N(n23, n24, n23 + n5, n24 + 8, this.N(n25, var5));
            if (i >= var5.size()) continue;
            class03458 class034584 = var5.get(i);
            class05019 class050192 = (class05019)((Object)arrayList.get(i));
            GameProfile gameProfile = class034584.N();
            if (n6 != 0) {
                class08036 class080362 = ((class03448)this.b.T_3).N(gameProfile.id());
                n22 = class080362 != null && class08287.N((class08036)class080362) ? 1 : 0;
                class03933.N((class01054)class010542, (class01894)class034584.M().N().y(), (int)n23, (int)n24, (int)8, (boolean)class034584.z(), n22 != 0, (int)-1);
                n23 += 9;
            }
            class010542.y((class01590)this.b.i_3, class050192.N(), n23, n24, class034584.i() == class07282.field_9219 ? -1862270977 : -1);
            if (class005182 != null && class034584.i() != class07282.field_9219 && (n22 = (n21 = n23 + n8 + 1) + n13) - n21 > 5) {
                this.N(class005182, n24, class050192, n21, n22, gameProfile.id(), class010542);
            }
            this.N(class010542, n5, n23 - (n6 != 0 ? 9 : 0), n24, class034584);
        }
        if (var20 != null) {
            n15 += n10 * 9 + 1;
            int n26 = n / 2 - n16 / 2 - 1;
            int n27 = n / 2 + n16 / 2 + 1;
            int n28 = var20.size();
            Objects.requireNonNull((class01590)this.b.i_3);
            class010542.N(n26, n15 - 1, n27, n15 + n28 * 9, Integer.MIN_VALUE);
            for (class01028 class010283 : var20) {
                n2 = ((class01590)this.b.i_3).N(class010283);
                class010542.y((class01590)this.b.i_3, class010283, n / 2 - n2 / 2, n15, -1);
                Objects.requireNonNull((class01590)this.b.i_3);
                n15 += 9;
            }
        }
    }

    protected void N(class01054 class010542, int n, int n2, int n3, class03458 class034582) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class010542, n, n2, n3, class034582, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class01894 class018942 = class034582.R() < 0 ? L : (class034582.R() < 150 ? B : (class034582.R() < 300 ? M : (class034582.R() < 600 ? R : (class034582.R() < 1000 ? i : u))));
        class010542.N(class08394.Na, class018942, n2 + n - 11, n3, 10, 8);
    }

    public void viaFabricPlusVisuals$setMaxPlayers(int n) {
        this.d = Math.min(200, Math.max(20, (n + 20 - 1) / 20 * 20));
    }
}

