/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09473
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.viaversion.viafabricplus.visuals.features.classic.creative_menu.GridItemSelectionScreen
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  minecraft.class00077
 *  minecraft.class00392
 *  minecraft.class01042
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01463
 *  minecraft.class01683
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02484
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class03530
 *  minecraft.class03552
 *  minecraft.class03767
 *  minecraft.class03771
 *  minecraft.class03916
 *  minecraft.class04206
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class04655
 *  minecraft.class04927
 *  minecraft.class04973
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05410
 *  minecraft.class05630
 *  minecraft.class06006
 *  minecraft.class06202
 *  minecraft.class06244
 *  minecraft.class06418
 *  minecraft.class06497
 *  minecraft.class06524
 *  minecraft.class06541
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class06601
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class06626
 *  minecraft.class06695
 *  minecraft.class06909
 *  minecraft.class06911
 *  minecraft.class06936
 *  minecraft.class06937
 *  minecraft.class07075
 *  minecraft.class07299
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07482
 *  minecraft.class07508
 *  minecraft.class07510
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08394
 *  minecraft.class08666
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.itemgroup.v1.FabricCreativeInventoryScreen
 *  net.fabricmc.fabric.impl.client.itemgroup.FabricCreativeGuiComponents
 *  net.fabricmc.fabric.impl.client.itemgroup.FabricCreativeGuiComponents$ItemGroupButtonWidget
 *  net.fabricmc.fabric.impl.client.itemgroup.FabricCreativeGuiComponents$Type
 *  net.fabricmc.fabric.impl.itemgroup.FabricItemGroupImpl
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09473;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.viaversion.viafabricplus.visuals.features.classic.creative_menu.GridItemSelectionScreen;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00077;
import minecraft.class00392;
import minecraft.class01042;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01463;
import minecraft.class01499;
import minecraft.class01521;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02484;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class03530;
import minecraft.class03552;
import minecraft.class03767;
import minecraft.class03771;
import minecraft.class03916;
import minecraft.class04206;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class04655;
import minecraft.class04927;
import minecraft.class04973;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05410;
import minecraft.class05630;
import minecraft.class06006;
import minecraft.class06202;
import minecraft.class06244;
import minecraft.class06418;
import minecraft.class06497;
import minecraft.class06524;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class06601;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class06626;
import minecraft.class06695;
import minecraft.class06909;
import minecraft.class06911;
import minecraft.class06936;
import minecraft.class06937;
import minecraft.class07075;
import minecraft.class07299;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07482;
import minecraft.class07508;
import minecraft.class07510;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08394;
import minecraft.class08666;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.itemgroup.v1.FabricCreativeInventoryScreen;
import net.fabricmc.fabric.impl.client.itemgroup.FabricCreativeGuiComponents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupImpl;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class01488
extends class01463<class01521>
implements FabricCreativeInventoryScreen {
    private static final class01894 y = class01894.y((String)"container/creative_inventory/scroller");
    private static final class01894 L = class01894.y((String)"container/creative_inventory/scroller_disabled");
    private static final class01894[] u = new class01894[]{class01894.y((String)"container/creative_inventory/tab_top_unselected_1"), class01894.y((String)"container/creative_inventory/tab_top_unselected_2"), class01894.y((String)"container/creative_inventory/tab_top_unselected_3"), class01894.y((String)"container/creative_inventory/tab_top_unselected_4"), class01894.y((String)"container/creative_inventory/tab_top_unselected_5"), class01894.y((String)"container/creative_inventory/tab_top_unselected_6"), class01894.y((String)"container/creative_inventory/tab_top_unselected_7")};
    private static final class01894[] n = new class01894[]{class01894.y((String)"container/creative_inventory/tab_top_selected_1"), class01894.y((String)"container/creative_inventory/tab_top_selected_2"), class01894.y((String)"container/creative_inventory/tab_top_selected_3"), class01894.y((String)"container/creative_inventory/tab_top_selected_4"), class01894.y((String)"container/creative_inventory/tab_top_selected_5"), class01894.y((String)"container/creative_inventory/tab_top_selected_6"), class01894.y((String)"container/creative_inventory/tab_top_selected_7")};
    private static final class01894[] t = new class01894[]{class01894.y((String)"container/creative_inventory/tab_bottom_unselected_1"), class01894.y((String)"container/creative_inventory/tab_bottom_unselected_2"), class01894.y((String)"container/creative_inventory/tab_bottom_unselected_3"), class01894.y((String)"container/creative_inventory/tab_bottom_unselected_4"), class01894.y((String)"container/creative_inventory/tab_bottom_unselected_5"), class01894.y((String)"container/creative_inventory/tab_bottom_unselected_6"), class01894.y((String)"container/creative_inventory/tab_bottom_unselected_7")};
    private static final class01894[] G = new class01894[]{class01894.y((String)"container/creative_inventory/tab_bottom_selected_1"), class01894.y((String)"container/creative_inventory/tab_bottom_selected_2"), class01894.y((String)"container/creative_inventory/tab_bottom_selected_3"), class01894.y((String)"container/creative_inventory/tab_bottom_selected_4"), class01894.y((String)"container/creative_inventory/tab_bottom_selected_5"), class01894.y((String)"container/creative_inventory/tab_bottom_selected_6"), class01894.y((String)"container/creative_inventory/tab_bottom_selected_7")};
    private static final int l = 5;
    private static final int d = 9;
    private static final int w = 26;
    private static final int k = 32;
    private static final int Y = 12;
    private static final int Q = 15;
    static final class07075 N = new class07075(45);
    private static final class00392 O = class00392.L((String)"inventory.binSlot");
    private static class06911 g = class03771.y();
    private float I;
    private boolean J;
    private class04927 o;
    private @Nullable List<class06937> q;
    private @Nullable class06937 K;
    private class06006 V;
    private boolean e;
    private boolean H;
    private final Set<class03530<class06581>> c = new HashSet<class03530<class06581>>();
    private final boolean X;
    private final class04973 a;
    private static int p = 0;

    private boolean L() {
        return g.i() && ((class01521)this.m).W();
    }

    private int L(class06911 class069112) {
        int n = 0;
        n = class069112.M() == class06909.field_41049 ? (n -= 32) : (n += this.Z);
        return n;
    }

    public class01488(class04453 class044532, class03767 class037672, boolean bl) {
        super((class07482)new class01521((class08036)class044532), class044532.method_31548(), class05220.N);
        class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = this.m;
        this.Z = 136;
        this.B = 195;
        this.X = bl;
        this.N(((class01683)class044532.y_0).Y(), class037672, this.N((class08036)class044532), (class01929)class044532.method_73183().method_30349());
        this.a = new class04973((class01463)this);
    }

    private void i() {
        if (!this.u(g)) {
            class03771.u().stream().filter(this::u).min((class069112, class069113) -> Boolean.compare(class069112.z(), class069113.z())).ifPresent(this::N);
        }
    }

    public void u() {
        super.u();
        class04453 class044532 = (class04453)this.field_22787.T_4;
        if (class044532 != null) {
            this.N(((class01683)class044532.y_0).G(), this.N((class08036)class044532), (class01929)class044532.method_73183().method_30349());
            if (!class044532.method_56992()) {
                this.field_22787.N((class05096)new class05410((class08036)class044532));
            }
        }
    }

    private boolean u(class06911 class069112) {
        return class069112.Z() && p == this.getPage(class069112);
    }

    protected void u(class01054 class010542, int n, int n2) {
        if (g.u()) {
            class010542.N(this.field_22793, g.N(), 8, 6, -12566464, false);
        }
    }

    protected boolean y(double d, double d2) {
        int n = this.T;
        int n2 = this.b;
        int n3 = n + 175;
        int n4 = n2 + 18;
        int n5 = n3 + 14;
        int n6 = n4 + 112;
        return d >= (double)n3 && d2 >= (double)n4 && d < (double)n5 && d2 < (double)n6;
    }

    private void y() {
        ((class01521)this.m).N.clear();
        this.c.clear();
        String string = this.o.method_1882();
        if (string.isEmpty()) {
            ((class01521)this.m).N.addAll(g.E());
        } else {
            class01683 class016832 = this.field_22787.NE();
            if (class016832 != null) {
                class00077 var3;
                class08666 class086662 = class016832.Y();
                if (string.startsWith("#")) {
                    string = string.substring(1);
                    var3 = class086662.L();
                    this.N(string);
                } else {
                    var3 = class086662.u();
                }
                ((class01521)this.m).N.addAll((Collection)var3.method_4810(string.toLowerCase(Locale.ROOT)));
            }
        }
        this.I = 0.0f;
        ((class01521)this.m).y(0.0f);
    }

    private void y(CallbackInfo callbackInfo) {
        if (VisualSettings.INSTANCE.replaceCreativeInventory.isEnabled()) {
            class06202.Nq().N((class05096)GridItemSelectionScreen.INSTANCE);
        }
    }

    private int y(class06911 class069112) {
        int n = class069112.R();
        int n2 = 27;
        int n3 = 27 * n;
        if (class069112.z()) {
            n3 = this.B - 27 * (7 - n) + 1;
        }
        return n3;
    }

    protected void N(@Nullable class06937 class069372, int n, int n2, class07510 class075102) {
        if (this.N(class069372)) {
            this.o.method_1872(false);
            this.o.method_1884(0);
        }
        boolean bl = class075102 == class07510.field_7794;
        class07510 class075103 = class075102 = n == -999 && class075102 == class07510.field_7790 ? class07510.field_7795 : class075102;
        if (class075102 == class07510.field_7795 && !((class04453)this.field_22787.T_4).method_64271()) {
            return;
        }
        this.N(class069372, class075102);
        if (class069372 != null || g.U() == class06936.field_41053 || class075102 == class07510.field_7789) {
            if (class069372 != null && !class069372.N((class08036)((class04453)this.field_22787.T_4))) {
                return;
            }
            if (class069372 == this.K && bl) {
                for (int i = 0; i < ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.L().size(); ++i) {
                    ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.L(i).i(class06584.E);
                    ((class03443)this.field_22787.T_2).N(class06584.E, i);
                }
            } else if (g.U() == class06936.field_41053) {
                if (class069372 == this.K) {
                    ((class01521)this.m).N(class06584.E);
                } else if (class075102 == class07510.field_7795 && class069372 != null && class069372.R()) {
                    class06584 class065842 = class069372.N(n2 == 0 ? 1 : class069372.i().U());
                    class06584 class065843 = class069372.i();
                    ((class04453)this.field_22787.T_4).method_7328(class065842, true);
                    ((class03443)this.field_22787.T_2).N(class065842);
                    ((class03443)this.field_22787.T_2).N(class065843, ((class01499)class069372).N.u);
                } else if (class075102 == class07510.field_7795 && n == -999 && !((class01521)this.m).M().R()) {
                    ((class04453)this.field_22787.T_4).method_7328(((class01521)this.m).M(), true);
                    ((class03443)this.field_22787.T_2).N(((class01521)this.m).M());
                    ((class01521)this.m).N(class06584.E);
                } else {
                    ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.N(class069372 == null ? n : ((class01499)class069372).N.u, n2, class075102, (class08036)((class04453)this.field_22787.T_4));
                    ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
                }
            } else if (class075102 != class07510.field_7789 && class069372.L == N) {
                class06584 class065844 = ((class01521)this.m).M();
                class06584 class065845 = class069372.i();
                if (class075102 == class07510.field_7791) {
                    if (!class065845.R()) {
                        ((class04453)this.field_22787.T_4).method_31548().method_5447(n2, class065845.L(class065845.U()));
                        ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
                    }
                    return;
                }
                if (class075102 == class07510.field_7796) {
                    if (((class01521)this.m).M().R() && class069372.R()) {
                        class06584 class065846 = class069372.i();
                        ((class01521)this.m).N(class065846.L(class065846.U()));
                    }
                    return;
                }
                if (class075102 == class07510.field_7795) {
                    if (!class065845.R()) {
                        class06584 class065847 = class065845.L(n2 == 0 ? 1 : class065845.U());
                        ((class04453)this.field_22787.T_4).method_7328(class065847, true);
                        ((class03443)this.field_22787.T_2).N(class065847);
                    }
                    return;
                }
                if (!class065844.R() && !class065845.R() && class06584.L((class06584)class065844, (class06584)class065845)) {
                    if (n2 == 0) {
                        if (bl) {
                            class065844.i(class065844.U());
                        } else if (class065844.c() < class065844.U()) {
                            class065844.M(1);
                        }
                    } else {
                        class065844.B(1);
                    }
                } else if (class065845.R() || !class065844.R()) {
                    if (n2 == 0) {
                        ((class01521)this.m).N(class06584.E);
                    } else if (!((class01521)this.m).M().R()) {
                        ((class01521)this.m).M().B(1);
                    }
                } else {
                    int n3 = bl ? class065845.U() : class065845.c();
                    ((class01521)this.m).N(class065845.L(n3));
                }
            } else if (this.m != null) {
                class06584 class065848 = class069372 == null ? class06584.E : ((class01521)this.m).L(class069372.u).i();
                ((class01521)this.m).N(class069372 == null ? n : class069372.u, n2, class075102, (class08036)((class04453)this.field_22787.T_4));
                if (class07482.i((int)n2) == 2) {
                    for (int i = 0; i < 9; ++i) {
                        ((class03443)this.field_22787.T_2).N(((class01521)this.m).L(45 + i).i(), 36 + i);
                    }
                } else if (class069372 != null && class08044.L((int)class069372.B()) && g.U() != class06936.field_41053) {
                    if (class075102 == class07510.field_7795 && !class065848.R() && !((class01521)this.m).M().R()) {
                        int n4 = n2 == 0 ? 1 : class065848.c();
                        class06584 class065849 = class065848.L(n4);
                        class065848.B(n4);
                        ((class04453)this.field_22787.T_4).method_7328(class065849, true);
                        ((class03443)this.field_22787.T_2).N(class065849);
                    }
                    ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
                }
            }
        } else if (!((class01521)this.m).M().R() && this.H) {
            if (!((class04453)this.field_22787.T_4).method_64271()) {
                return;
            }
            if (n2 == 0) {
                ((class04453)this.field_22787.T_4).method_7328(((class01521)this.m).M(), true);
                ((class03443)this.field_22787.T_2).N(((class01521)this.m).M());
                ((class01521)this.m).N(class06584.E);
            }
            if (n2 == 1) {
                class06584 class0658410 = ((class01521)this.m).M().N(1);
                ((class04453)this.field_22787.T_4).method_7328(class0658410, true);
                ((class03443)this.field_22787.T_2).N(class0658410);
            }
        }
    }

    private void N(Collection<class06584> collection) {
        int n = ((class01521)this.m).N(this.I);
        ((class01521)this.m).N.clear();
        if (g.U() == class06936.field_41055) {
            this.y();
        } else {
            ((class01521)this.m).N.addAll(collection);
        }
        this.I = ((class01521)this.m).N(n);
        ((class01521)this.m).y(this.I);
    }

    private void N(CallbackInfo callbackInfo) {
        p = this.getPage(g);
        int n = this.T + 171;
        int n2 = this.b + 4;
        class01488 class014882 = this;
        this.method_37063((class04654)new FabricCreativeGuiComponents.ItemGroupButtonWidget(n + 10, n2, FabricCreativeGuiComponents.Type.NEXT, class014882));
        this.method_37063((class04654)new FabricCreativeGuiComponents.ItemGroupButtonWidget(n, n2, FabricCreativeGuiComponents.Type.PREVIOUS, class014882));
    }

    private void N(class06911 class069112, CallbackInfo callbackInfo) {
        if (!this.u(class069112)) {
            callbackInfo.cancel();
        }
    }

    public boolean N() {
        return g.U() == class06936.field_41053;
    }

    public static void N(class06202 class062022, int n, boolean bl, boolean bl2) {
        class04453 class044532 = (class04453)class062022.T_4;
        class01042 class010422 = class044532.method_73183().method_30349();
        class06418 class064182 = class062022.yB();
        class03916 class039162 = class064182.N(n);
        if (bl) {
            List var8 = class039162.N((class01929)class010422);
            for (int i = 0; i < class08044.L(); ++i) {
                class06584 class065842 = (class06584)var8.get(i);
                class044532.method_31548().method_5447(i, class065842);
                ((class03443)class062022.T_2).N(class065842, 36 + i);
            }
            class044532.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
        } else if (bl2) {
            class039162.N(class044532.method_31548(), class010422);
            class00392 class003922 = ((class05630)class062022.i_7).f[n].m();
            class00392 class003923 = ((class05630)class062022.i_7).S.m();
            class05216 class052162 = class00392.N((String)"inventory.hotbarSaved", (Object[])new Object[]{class003923, class003922});
            ((class01056)class062022.i_6).N((class00392)class052162, false);
            class062022.NT().u((class00392)class052162);
            class064182.N();
        }
    }

    protected boolean N(class06911 class069112, double d, double d2) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class069112, d, d2, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        int n = this.y(class069112);
        int n2 = this.L(class069112);
        return d >= (double)n && d <= (double)(n + 26) && d2 >= (double)n2 && d2 <= (double)(n2 + 32);
    }

    private boolean N(int n) {
        return class03771.L().stream().anyMatch(class069112 -> this.getPage((class06911)class069112) == n);
    }

    private void N(class03767 class037672, boolean bl, class01929 class019292) {
        class01683 class016832 = this.field_22787.NE();
        if (this.N(class016832 != null ? class016832.Y() : null, class037672, bl, class019292)) {
            for (class06911 class069112 : class03771.u()) {
                Collection var7 = class069112.E();
                if (class069112 != g) continue;
                if (class069112.U() == class06936.field_41052 && var7.isEmpty()) {
                    this.N(class03771.y());
                    continue;
                }
                this.N(var7);
            }
        }
    }

    private boolean N(class08036 class080362) {
        return class080362.method_7338() && this.X;
    }

    private void N(class01054 class010542, class06911 class069112, int n, int n2, CallbackInfoReturnable callbackInfoReturnable) {
        if (!this.u(class069112)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private void N(class06911 class069112, double d, double d2, CallbackInfoReturnable callbackInfoReturnable) {
        if (!this.u(class069112)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    private void N(class01054 class010542, int n, int n2, class06911 class069112, CallbackInfo callbackInfo) {
        if (!this.u(class069112)) {
            callbackInfo.cancel();
        }
    }

    private void N(class06601 class066012, CallbackInfoReturnable callbackInfoReturnable) {
        if (class066012.v() == 266) {
            if (this.switchToPreviousPage()) {
                callbackInfoReturnable.setReturnValue((Object)true);
            }
        } else if (class066012.v() == 267 && this.switchToNextPage()) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    private boolean N(@Nullable class08666 class086662, class03767 class037672, boolean bl, class01929 class019292) {
        if (!class03771.N((class03767)class037672, (boolean)bl, (class01929)class019292)) {
            return false;
        }
        if (class086662 != null) {
            List list = List.copyOf(class03771.i().E());
            class086662.N(class019292, list);
            class086662.N(list);
        }
        return true;
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        for (class06911 class069112 : class03771.L()) {
            if (class069112 == g) continue;
            this.N(class010542, n, n2, class069112);
        }
        class010542.N(class08394.Na, g.L(), this.T, this.b, 0.0f, 0.0f, this.B, this.Z, 256, 256);
        if (this.y((double)n, n2) && this.L()) {
            class010542.N(this.J ? class06608.i : class06608.u);
        }
        this.o.method_25394(class010542, n, n2, f);
        int n3 = this.T + 175;
        int n4 = this.b + 18;
        int n5 = n4 + 112;
        if (g.i()) {
            class01894 class018942 = this.L() ? y : L;
            class010542.N(class08394.Na, class018942, n3, n4 + (int)((float)(n5 - n4 - 17) * this.I), 12, 15);
        }
        this.N(class010542, n, n2, g);
        if (g.U() == class06936.field_41053) {
            class05410.N((class01054)class010542, (int)(this.T + 73), (int)(this.b + 6), (int)(this.T + 105), (int)(this.b + 49), (int)20, (float)0.0625f, (float)n, (float)n2, (class07438)((class04453)this.field_22787.T_4));
        }
    }

    public List<class00392> N(class06584 class065842) {
        boolean bl = this.s != null && this.s instanceof class09473;
        boolean bl2 = g.U() == class06936.field_41052;
        boolean bl3 = g.U() == class06936.field_41055;
        class06524 class065242 = ((class05630)this.field_22787.i_7).W ? class06524.y : class06524.N;
        class06524 class065243 = bl ? class065242.L() : class065242;
        List var7 = class065842.N(class06591.N((class07299)((class03448)this.field_22787.T_3)), (class08036)((class04453)this.field_22787.T_4), (class06497)class065243);
        if (var7.isEmpty()) {
            return var7;
        }
        if (!bl2 || !bl) {
            ArrayList arrayList = Lists.newArrayList((Iterable)var7);
            if (bl3 && bl) {
                this.c.forEach(class035302 -> {
                    if (class065842.N(class035302)) {
                        arrayList.add(1, class00392.y((String)("#" + String.valueOf(class035302.y()))).N(class06541.field_1064));
                    }
                });
            }
            int n = 1;
            for (class06911 class069112 : class03771.L()) {
                if (class069112.U() == class06936.field_41055 || !class069112.N(class065842)) continue;
                arrayList.add(n++, class069112.N().L().N(class06541.field_1078));
            }
            return arrayList;
        }
        return var7;
    }

    private void N(class06911 class069112) {
        Object object;
        int n;
        int n2;
        class06418 class064182;
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class069112, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class06911 class069113 = g;
        g = class069112;
        this.j.clear();
        ((class01521)this.m).N.clear();
        this.Z();
        if (g.U() == class06936.field_41054) {
            class064182 = this.field_22787.yB();
            for (n2 = 0; n2 < 9; ++n2) {
                class03916 class039162 = class064182.N(n2);
                if (class039162.N()) {
                    for (n = 0; n < 9; ++n) {
                        if (n == n2) {
                            object = new class06584((class07310)class06570.jk);
                            object.N(class02484.t, (Object)class06244.field_17274);
                            class00392 class003922 = ((class05630)this.field_22787.i_7).f[n2].m();
                            class00392 class003923 = ((class05630)this.field_22787.i_7).C.m();
                            object.N(class02484.U, (Object)class00392.N((String)"inventory.hotbarInfo", (Object[])new Object[]{class003923, class003922}));
                            ((class01521)this.m).N.add(object);
                            continue;
                        }
                        ((class01521)this.m).N.add((Object)class06584.E);
                    }
                    continue;
                }
                ((class01521)this.m).N.addAll((Collection)class039162.N((class01929)((class03448)this.field_22787.T_3).method_30349()));
            }
        } else if (g.U() == class06936.field_41052) {
            ((class01521)this.m).N.addAll(g.E());
        }
        if (g.U() == class06936.field_41053) {
            class064182 = ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
            if (this.q == null) {
                this.q = ImmutableList.copyOf((Collection)((class01521)this.m).T);
            }
            ((class01521)this.m).T.clear();
            for (n2 = 0; n2 < class064182.T.size(); ++n2) {
                int n3;
                if (n2 >= 5 && n2 < 9) {
                    int n4 = n2 - 5;
                    var8_13 = n4 / 2;
                    var9_15 = n4 % 2;
                    n3 = 54 + var8_13 * 54;
                    n = 6 + var9_15 * 27;
                } else if (n2 >= 0 && n2 < 5) {
                    n3 = -2000;
                    n = -2000;
                } else if (n2 == 45) {
                    n3 = 35;
                    n = 20;
                } else {
                    int n5 = n2 - 9;
                    var8_13 = n5 % 9;
                    var9_15 = n5 / 9;
                    n3 = 9 + var8_13 * 18;
                    n = n2 >= 36 ? 112 : 54 + var9_15 * 18;
                }
                object = new class01499((class06937)class064182.T.get(n2), n2, n3, n);
                ((class01521)this.m).T.add(object);
            }
            this.K = new class06937((class06695)N, 0, 173, 112);
            ((class01521)this.m).T.add((Object)this.K);
        } else if (class069113.U() == class06936.field_41053) {
            ((class01521)this.m).T.clear();
            ((class01521)this.m).T.addAll(this.q);
            this.q = null;
        }
        if (g.U() == class06936.field_41055) {
            this.o.method_1862(true);
            this.o.method_1856(false);
            this.o.method_25365(true);
            if (class069113 != class069112) {
                this.o.method_1852("");
            }
            this.y();
        } else {
            this.o.method_1862(false);
            this.o.method_1856(true);
            this.o.method_25365(false);
            this.o.method_1852("");
        }
        this.I = 0.0f;
        ((class01521)this.m).y(0.0f);
    }

    protected boolean N(double d, double d2, int n, int n2) {
        boolean bl = d < (double)n || d2 < (double)n2 || d >= (double)(n + this.B) || d2 >= (double)(n2 + this.Z);
        this.H = bl && !this.N(g, d, d2);
        return this.H;
    }

    protected void N(class01054 class010542, int n, int n2, class06911 class069112) {
        class01894[] class01894Array;
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class010542, n, n2, class069112, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        boolean bl = class069112 == g;
        boolean bl2 = class069112.M() == class06909.field_41049;
        int n3 = class069112.R();
        int n4 = this.T + this.y(class069112);
        int n5 = this.b - (bl2 ? 28 : -(this.Z - 4));
        if (bl2) {
            class01894Array = bl ? class01488.n : u;
        } else {
            class01894[] class01894Array2 = class01894Array = bl ? G : t;
        }
        if (!bl && n > n4 && n2 > n5 && n < n4 + 26 && n2 < n5 + 32) {
            class010542.N(class06608.u);
        }
        class010542.N(class08394.Na, class01894Array[class04995.N((int)n3, (int)0, (int)class01894Array.length)], n4, n5, 26, 32);
        int n6 = n4 + 13 - 8;
        int n7 = n5 + 16 - 8 + (bl2 ? 1 : -1);
        class010542.N(class069112.y(), n6, n7);
    }

    protected boolean N(class01054 class010542, class06911 class069112, int n, int n2) {
        int n3;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class010542, class069112, n, n2, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        int n4 = this.y(class069112);
        if (this.N(n4 + 3, (n3 = this.L(class069112)) + 3, 21, 27, n, n2)) {
            class010542.N(this.field_22793, class069112.N(), n, n2);
            return true;
        }
        return false;
    }

    private boolean N(@Nullable class06937 class069372) {
        return class069372 != null && class069372.L == N;
    }

    private void N(String string) {
        Predicate<class01894> predicate;
        int n = string.indexOf(58);
        if (n == -1) {
            predicate = class018942 -> class018942.N().contains(string);
        } else {
            String string2 = string.substring(0, n).trim();
            String string3 = string.substring(n + 1).trim();
            predicate = class018942 -> class018942.y().contains(string2) && class018942.N().contains(string3);
        }
        class04206.B.U().map(class03552::B).filter(class035302 -> predicate.test(class035302.y())).forEach(this.c::add);
    }

    public void method_25426() {
        if (((class04453)this.field_22787.T_4).method_56992()) {
            super.method_25426();
            Objects.requireNonNull(this.field_22793);
            this.o = new class04927(this.field_22793, this.T + 82, this.b + 6, 80, 9, (class00392)class00392.L((String)"itemGroup.search"));
            this.o.method_1880(50);
            this.o.method_1858(false);
            this.o.method_1862(false);
            this.o.method_1868(-1);
            this.N((CallbackInfo)null);
            this.o.method_75351(false);
            this.method_25429((class04654)this.o);
            class06911 class069112 = g;
            g = class03771.y();
            this.N(class069112);
            ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y((class07508)this.V);
            this.V = new class06006(this.field_22787);
            ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.N((class07508)this.V);
            if (!g.Z()) {
                this.N(class03771.y());
            }
        } else {
            this.field_22787.N((class05096)new class05410((class08036)((class04453)this.field_22787.T_4)));
        }
        this.y((CallbackInfo)null);
    }

    public boolean method_25404(class06601 class066012) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class066012, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        this.e = false;
        if (g.U() != class06936.field_41055) {
            if (((class05630)this.field_22787.i_7).o.N(class066012)) {
                this.e = true;
                this.N(class03771.i());
                return true;
            }
            return super.method_25404(class066012);
        }
        boolean bl = !this.N(this.s) || this.s.R();
        boolean bl2 = class04655.N((class06601)class066012).i().isPresent();
        if (bl && bl2 && this.N(class066012)) {
            this.e = true;
            return true;
        }
        String string = this.o.method_1882();
        if (this.o.method_25404(class066012)) {
            if (!Objects.equals(string, this.o.method_1882())) {
                this.y();
            }
            return true;
        }
        if (this.o.method_25370() && this.o.method_1885() && !class066012.i()) {
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25432() {
        super.method_25432();
        if ((class04453)this.field_22787.T_4 != null && ((class04453)this.field_22787.T_4).method_31548() != null) {
            ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y((class07508)this.V);
        }
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        class06911 class069112;
        this.a.N(class010542, n, n2);
        super.method_25394(class010542, n, n2, f);
        Iterator var5 = class03771.L().iterator();
        while (var5.hasNext() && !this.N(class010542, class069112 = (class06911)var5.next(), n, n2)) {
        }
        if (this.K != null && g.U() == class06936.field_41053 && this.N(this.K.i, this.K.R, 16, 16, n, n2)) {
            class010542.N(this.field_22793, O, n, n2);
        }
        this.a_(class010542, n, n2);
    }

    public void method_25410(int n, int n2) {
        int n3 = ((class01521)this.m).N(this.I);
        String string = this.o.method_1882();
        this.method_25423(n, n2);
        this.o.method_1852(string);
        if (!this.o.method_1882().isEmpty()) {
            this.y();
        }
        this.I = ((class01521)this.m).N(n3);
        ((class01521)this.m).y(this.I);
    }

    public boolean method_64507() {
        return this.a.N();
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (this.J) {
            int n = this.b + 18;
            int n2 = n + 112;
            this.I = ((float)class066132.t() - (float)n - 7.5f) / ((float)(n2 - n) - 15.0f);
            this.I = class04995.N((float)this.I, (float)0.0f, (float)1.0f);
            ((class01521)this.m).y(this.I);
            return true;
        }
        return super.method_25403(class066132, d, d2);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (super.method_25401(d, d2, d3, d4)) {
            return true;
        }
        if (!this.L()) {
            return false;
        }
        this.I = ((class01521)this.m).N(this.I, d4);
        ((class01521)this.m).y(this.I);
        return true;
    }

    public boolean method_25400(class06626 class066262) {
        if (this.e) {
            return false;
        }
        if (g.U() != class06936.field_41055) {
            return false;
        }
        String string = this.o.method_1882();
        if (this.o.method_25400(class066262)) {
            if (!Objects.equals(string, this.o.method_1882())) {
                this.y();
            }
            return true;
        }
        return false;
    }

    public boolean method_25406(class06613 class066132) {
        if (class066132.v() == 0) {
            double d = class066132.n() - (double)this.T;
            double d2 = class066132.t() - (double)this.b;
            this.J = false;
            for (class06911 class069112 : class03771.L()) {
                if (!this.N(class069112, d, d2)) continue;
                this.N(class069112);
                return true;
            }
        }
        return super.method_25406(class066132);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (class066132.v() == 0) {
            double d = class066132.n() - (double)this.T;
            double d2 = class066132.t() - (double)this.b;
            for (class06911 class069112 : class03771.L()) {
                if (!this.N(class069112, d, d2)) continue;
                return true;
            }
            if (g.U() != class06936.field_41053 && this.y(class066132.n(), class066132.t())) {
                this.J = this.L();
                return true;
            }
        }
        return super.method_25402(class066132, bl);
    }

    public boolean method_16803(class06601 class066012) {
        this.e = false;
        return super.method_16803(class066012);
    }

    public int getPageCount() {
        return FabricCreativeGuiComponents.getPageCount();
    }

    public boolean hasAdditionalPages() {
        return class03771.L().size() > (Objects.requireNonNull(class03771.P).y() ? 14 : 13);
    }

    public boolean switchToPage(int n) {
        if (!this.N(n)) {
            return false;
        }
        if (p == n) {
            return false;
        }
        p = n;
        this.i();
        return true;
    }

    public int getCurrentPage() {
        return p;
    }

    public class06911 getSelectedItemGroup() {
        return g;
    }

    public List getItemGroupsOnPage(int n) {
        return class03771.L().stream().filter(class069112 -> this.getPage((class06911)class069112) == n).sorted(Comparator.comparing(class06911::M).thenComparingInt(class06911::R)).sorted((class069112, class069113) -> Boolean.compare(class069112.z(), class069113.z())).toList();
    }

    public boolean setSelectedItemGroup(class06911 class069112) {
        Objects.requireNonNull(class069112, "itemGroup");
        if (g == class069112) {
            return false;
        }
        if (p != this.getPage(class069112) && !this.switchToPage(this.getPage(class069112))) {
            return false;
        }
        this.N(class069112);
        return true;
    }

    public int getPage(class06911 class069112) {
        if (FabricCreativeGuiComponents.COMMON_GROUPS.contains(class069112)) {
            return p;
        }
        return ((FabricItemGroupImpl)class069112).fabric_getPage();
    }
}

