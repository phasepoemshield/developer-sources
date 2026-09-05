/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09174
 *  Nursultan.class10759
 *  com.google.common.base.Supplier
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.injection.access.interaction.container_clicking.IAbstractContainerMenu
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class00161
 *  minecraft.class00176
 *  minecraft.class00394
 *  minecraft.class00743
 *  minecraft.class00891
 *  minecraft.class02723
 *  minecraft.class03767
 *  minecraft.class04206
 *  minecraft.class04770
 *  minecraft.class04803
 *  minecraft.class04995
 *  minecraft.class05442
 *  minecraft.class05462
 *  minecraft.class05845
 *  minecraft.class05851
 *  minecraft.class05865
 *  minecraft.class05880
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07062
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07878
 *  minecraft.class08036
 *  minecraft.class08044
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 *  net.caffeinemc.mods.lithium.common.hopper.InventoryHelper
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09174;
import Nursultan.class10759;
import com.google.common.base.Suppliers;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.interaction.container_clicking.IAbstractContainerMenu;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Supplier;
import minecraft.class00161;
import minecraft.class00176;
import minecraft.class00394;
import minecraft.class00743;
import minecraft.class00891;
import minecraft.class02723;
import minecraft.class03767;
import minecraft.class04206;
import minecraft.class04770;
import minecraft.class04803;
import minecraft.class04995;
import minecraft.class05442;
import minecraft.class05462;
import minecraft.class05845;
import minecraft.class05851;
import minecraft.class05865;
import minecraft.class05880;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07062;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07508;
import minecraft.class07510;
import minecraft.class07878;
import minecraft.class08036;
import minecraft.class08044;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.hopper.InventoryHelper;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07482
implements IAbstractContainerMenu {
    private static final Logger N = LogUtils.getLogger();
    public static final int M = -999;
    public static final int B = 0;
    public static final int Z = 1;
    public static final int z = 2;
    public static final int U = 0;
    public static final int E = 1;
    public static final int W = 2;
    public static final int m = Integer.MAX_VALUE;
    public static final int P = 9;
    public static final int s = 18;
    private final class00743<class06584> y = class00743.method_10211();
    public final class00743<class06937> T = class00743.method_10211();
    private final List<class05865> L = Lists.newArrayList();
    private class06584 u = class06584.E;
    private final class00743<class00161> i = class00743.method_10211();
    private final IntList R = new IntArrayList();
    private class00161 j = class00161.N;
    private int v;
    private final @Nullable class05851<?> n;
    public final int b;
    private int t = -1;
    private int G;
    private final Set<class06937> l = Sets.newHashSet();
    private final List<class07508> d = Lists.newArrayList();
    private @Nullable class02723 w;
    private boolean k;
    private short Y = 0;

    public class06937 L(int n) {
        return (class06937)this.T.get(n);
    }

    public static int L(@Nullable class06695 class066952) {
        if (class066952 == null) {
            return 0;
        }
        float f = 0.0f;
        int n = 0;
        while (true) {
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
            class07482.N(class066952, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return callbackInfoReturnable.getReturnValueI();
            }
            if (n >= class066952.method_5439()) break;
            class06584 class065842 = class066952.method_5438(n);
            if (!class065842.R()) {
                f += (float)class065842.c() / (float)class066952.a_(class065842);
            }
            ++n;
        }
        return class04995.y((float)(f /= (float)class066952.method_5439()), (int)0, (int)15);
    }

    protected void L(class06695 class066952, int n, int n2) {
        this.y(class066952, n, n2);
        int n3 = 4;
        int n4 = 58;
        this.N(class066952, n, n2 + 58);
    }

    public class00743<class06584> L() {
        class00743 class007432 = class00743.method_10211();
        for (class06937 class069372 : this.T) {
            class007432.add((Object)class069372.i());
        }
        return class007432;
    }

    public static int L(int n, int n2) {
        return n & 3 | (n2 & 3) << 2;
    }

    public class06584 M() {
        return this.u;
    }

    protected class07482(@Nullable class05851<?> class058512, int n) {
        this.n = class058512;
        this.b = n;
    }

    public void B() {
        this.k = true;
    }

    public void Z() {
        this.k = false;
    }

    private void i(int n, int n2) {
        if (this.k) {
            return;
        }
        if (this.R.getInt(n) != n2) {
            this.R.set(n, n2);
            if (this.w != null) {
                this.w.N(this, n, n2);
            }
        }
    }

    public void i() {
        class06584 class065842;
        int n;
        for (n = 0; n < this.T.size(); ++n) {
            class065842 = ((class06937)this.T.get(n)).i();
            this.N(n, class065842, () -> ((class06584)class065842).t());
        }
        for (n = 0; n < this.L.size(); ++n) {
            class065842 = this.L.get(n);
            if (!class065842.L()) continue;
            this.u(n, class065842.y());
        }
        this.y();
    }

    public static int i(int n) {
        return n & 3;
    }

    public int U() {
        this.v = this.v + 1 & Short.MAX_VALUE;
        return this.v;
    }

    public int z() {
        return this.v;
    }

    private void u(int n, int n2) {
        Iterator<class07508> var3 = this.d.iterator();
        while (var3.hasNext()) {
            var3.next().N(this, n, n2);
        }
    }

    public static int u(int n) {
        return n >> 2 & 3;
    }

    public void u() {
        class06584 class065842;
        int n;
        for (n = 0; n < this.T.size(); ++n) {
            class065842 = ((class06937)this.T.get(n)).i();
            com.google.common.base.Supplier supplier = Suppliers.memoize(() -> ((class06584)class065842).t());
            this.N(n, class065842, (Supplier<class06584>)supplier);
            this.y(n, class065842, (Supplier<class06584>)supplier);
        }
        this.E();
        for (n = 0; n < this.L.size(); ++n) {
            class065842 = this.L.get(n);
            int n2 = class065842.y();
            if (class065842.L()) {
                this.u(n, n2);
            }
            this.i(n, n2);
        }
    }

    public boolean y(class06937 class069372) {
        return true;
    }

    private void y(int n, int n2, class07510 class075102, class08036 class080362) {
        block40: {
            block52: {
                int n3;
                block51: {
                    block47: {
                        class06584 class065844;
                        class06937 class069372;
                        class06584 class065845;
                        class08044 class080442;
                        block50: {
                            block49: {
                                block48: {
                                    block45: {
                                        class05442 class054422;
                                        block46: {
                                            block44: {
                                                block38: {
                                                    block43: {
                                                        class06584 class065846;
                                                        block42: {
                                                            block41: {
                                                                block39: {
                                                                    class080442 = class080362.method_31548();
                                                                    if (class075102 != class07510.field_7789) break block38;
                                                                    int n4 = this.G;
                                                                    this.G = class07482.i(n2);
                                                                    if (n4 == 1 && this.G == 2 || n4 == this.G) break block39;
                                                                    this.R();
                                                                    break block40;
                                                                }
                                                                if (!this.M().R()) break block41;
                                                                this.R();
                                                                break block40;
                                                            }
                                                            if (this.G != 0) break block42;
                                                            this.t = class07482.u(n2);
                                                            if (class07482.N(this.t, class080362)) {
                                                                this.G = 1;
                                                                this.l.clear();
                                                            } else {
                                                                this.R();
                                                            }
                                                            break block40;
                                                        }
                                                        if (this.G != 1) break block43;
                                                        class06937 class069373 = (class06937)this.T.get(n);
                                                        if (!class07482.N(class069373, class065846 = this.M(), true) || !class069373.N(class065846) || this.t != 2 && class065846.c() <= this.l.size() || !this.y(class069373)) break block40;
                                                        this.l.add(class069373);
                                                        break block40;
                                                    }
                                                    if (this.G == 2) {
                                                        if (!this.l.isEmpty()) {
                                                            if (this.l.size() == 1) {
                                                                int n5 = this.l.iterator().next().u;
                                                                this.R();
                                                                this.y(n5, this.t, class07510.field_7790, class080362);
                                                                return;
                                                            }
                                                            class06584 class065847 = this.M().t();
                                                            if (class065847.R()) {
                                                                this.R();
                                                                return;
                                                            }
                                                            int n6 = this.M().c();
                                                            for (class06937 class069374 : this.l) {
                                                                class06584 class065848 = this.M();
                                                                if (class069374 == null || !class07482.N(class069374, class065848, true) || !class069374.N(class065848) || this.t != 2 && class065848.c() < this.l.size() || !this.y(class069374)) continue;
                                                                int n7 = class069374.R() ? class069374.i().c() : 0;
                                                                int n8 = Math.min(class065847.U(), class069374.b_(class065847));
                                                                int n9 = Math.min(class07482.N(this.l, this.t, class065847) + n7, n8);
                                                                n6 -= n9 - n7;
                                                                class069374.u(class065847.L(n9));
                                                            }
                                                            class065847.i(n6);
                                                            this.N(class065847);
                                                        }
                                                        this.R();
                                                    } else {
                                                        this.R();
                                                    }
                                                    break block40;
                                                }
                                                if (this.G == 0) break block44;
                                                this.R();
                                                break block40;
                                            }
                                            if (class075102 != class07510.field_7790 && class075102 != class07510.field_7794 || n2 != 0 && n2 != 1) break block45;
                                            class05442 class054423 = class054422 = n2 == 0 ? class05442.field_27013 : class05442.field_27014;
                                            if (n != -999) break block46;
                                            if (this.M().R()) break block40;
                                            if (class054422 == class05442.field_27013) {
                                                class080362.method_7328(this.M(), true);
                                                this.N(class06584.E);
                                            } else {
                                                class080362.method_7328(this.M().N(1), true);
                                            }
                                            break block40;
                                        }
                                        if (class075102 == class07510.field_7794) {
                                            if (n < 0) {
                                                return;
                                            }
                                            class06937 class069375 = (class06937)this.T.get(n);
                                            if (!class069375.N(class080362)) {
                                                return;
                                            }
                                            class06584 class065849 = this.N(class080362, n);
                                            while (!class065849.R() && class06584.y((class06584)class069375.i(), (class06584)class065849)) {
                                                class065849 = this.N(class080362, n);
                                            }
                                        } else {
                                            if (n < 0) {
                                                return;
                                            }
                                            class06937 class069376 = (class06937)this.T.get(n);
                                            class06584 class0658410 = class069376.i();
                                            class06584 class0658411 = this.M();
                                            class080362.method_33592(class0658411, class069376.i(), class054422);
                                            if (!this.N(class080362, class054422, class069376, class0658410, class0658411)) {
                                                if (class0658410.R()) {
                                                    if (!class0658411.R()) {
                                                        int n10 = class054422 == class05442.field_27013 ? class0658411.c() : 1;
                                                        this.N(class069376.y(class0658411, n10));
                                                    }
                                                } else if (class069376.N(class080362)) {
                                                    if (class0658411.R()) {
                                                        int n11 = class054422 == class05442.field_27013 ? class0658410.c() : (class0658410.c() + 1) / 2;
                                                        Optional var11 = class069376.N(n11, Integer.MAX_VALUE, class080362);
                                                        var11.ifPresent(class065842 -> {
                                                            this.N((class06584)class065842);
                                                            class069376.N(class080362, class065842);
                                                        });
                                                    } else if (class069376.N(class0658411)) {
                                                        if (class06584.L((class06584)class0658410, (class06584)class0658411)) {
                                                            int n12 = class054422 == class05442.field_27013 ? class0658411.c() : 1;
                                                            this.N(class069376.y(class0658411, n12));
                                                        } else if (class0658411.c() <= class069376.b_(class0658411)) {
                                                            this.N(class0658410);
                                                            class069376.u(class0658411);
                                                        }
                                                    } else if (class06584.L((class06584)class0658410, (class06584)class0658411)) {
                                                        Optional var10 = class069376.N(class0658410.c(), class0658411.U() - class0658411.c(), class080362);
                                                        var10.ifPresent(class065843 -> {
                                                            class0658411.M(class065843.c());
                                                            class069376.N(class080362, class065843);
                                                        });
                                                    }
                                                }
                                            }
                                            class069376.M();
                                        }
                                        break block40;
                                    }
                                    if (class075102 != class07510.field_7791 || (n2 < 0 || n2 >= 9) && n2 != 40) break block47;
                                    class065845 = class080442.method_5438(n2);
                                    class069372 = (class06937)this.T.get(n);
                                    class065844 = class069372.i();
                                    if (class065845.R() && class065844.R()) break block40;
                                    if (!class065845.R()) break block48;
                                    if (!class069372.N(class080362)) break block40;
                                    class080442.method_5447(n2, class065844);
                                    class069372.y(class065844.c());
                                    class069372.u(class06584.E);
                                    class069372.N(class080362, class065844);
                                    break block40;
                                }
                                if (!class065844.R()) break block49;
                                if (!class069372.N(class065845)) break block40;
                                int n13 = class069372.b_(class065845);
                                if (class065845.c() > n13) {
                                    class069372.u(class065845.N(n13));
                                } else {
                                    class080442.method_5447(n2, class06584.E);
                                    class069372.u(class065845);
                                }
                                break block40;
                            }
                            if (!class069372.N(class080362) || !class069372.N(class065845)) break block40;
                            int n14 = class069372.b_(class065845);
                            if (class065845.c() <= n14) break block50;
                            class069372.u(class065845.N(n14));
                            class069372.N(class080362, class065844);
                            if (class080442.M(class065844)) break block40;
                            class080362.method_7328(class065844, true);
                            break block40;
                        }
                        class080442.method_5447(n2, class065844);
                        class069372.u(class065845);
                        class069372.N(class080362, class065844);
                        break block40;
                    }
                    if (class075102 != class07510.field_7796 || !class080362.method_56992() || !this.M().R() || n < 0) break block51;
                    class06937 class069377 = (class06937)this.T.get(n);
                    if (!class069377.R()) break block40;
                    class06584 class0658412 = class069377.i();
                    this.N(class0658412.L(class0658412.U()));
                    break block40;
                }
                if (class075102 != class07510.field_7795 || !this.M().R() || n < 0) break block52;
                class06937 class069378 = (class06937)this.T.get(n);
                int n15 = n3 = n2 == 0 ? 1 : class069378.i().c();
                if (!class080362.method_64271()) {
                    return;
                }
                class06584 class0658413 = class069378.y(n3, Integer.MAX_VALUE, class080362);
                class080362.method_7328(class0658413, true);
                class080362.method_61499(class0658413);
                if (n2 != 1) break block40;
                while (!class0658413.R() && class06584.y((class06584)class069378.i(), (class06584)class0658413)) {
                    if (!class080362.method_64271()) {
                        return;
                    }
                    class0658413 = class069378.y(n3, Integer.MAX_VALUE, class080362);
                    class080362.method_7328(class0658413, true);
                    class080362.method_61499(class0658413);
                }
                break block40;
            }
            if (class075102 == class07510.field_7793 && n >= 0) {
                class06937 class069379 = (class06937)this.T.get(n);
                class06584 class0658414 = this.M();
                if (!(class0658414.R() || class069379.R() && class069379.N(class080362))) {
                    int n16 = n2 == 0 ? 0 : this.T.size() - 1;
                    int n17 = n2 == 0 ? 1 : -1;
                    for (int i = 0; i < 2; ++i) {
                        for (int j = n16; j >= 0 && j < this.T.size() && class0658414.c() < class0658414.U(); j += n17) {
                            class06937 class0693710 = (class06937)this.T.get(j);
                            if (!class0693710.R() || !class07482.N(class0693710, class0658414, true) || !class0693710.N(class080362) || !this.N(class0658414, class0693710)) continue;
                            class06584 class0658415 = class0693710.i();
                            if (i == 0 && class0658415.c() == class0658415.U()) continue;
                            class06584 class0658416 = class0693710.y(class0658415.c(), class0658414.U() - class0658414.c(), class080362);
                            class0658414.M(class0658416.c());
                        }
                    }
                }
            }
        }
    }

    public void y() {
        ArrayList<class06584> arrayList = new ArrayList<class06584>(this.T.size());
        int n = this.T.size();
        for (int i = 0; i < n; ++i) {
            class06584 class065842 = ((class06937)this.T.get(i)).i();
            arrayList.add(class065842.t());
            ((class00161)this.i.get(i)).N(class065842);
        }
        class06584 class065843 = this.M();
        this.j.N(class065843);
        int n2 = this.L.size();
        for (n = 0; n < n2; ++n) {
            this.R.set(n, this.L.get(n).y());
        }
        if (this.w != null) {
            this.w.N(this, arrayList, class065843.t(), this.R.toIntArray());
        }
    }

    public boolean y(int n) {
        return n == -1 || n == -999 || n < this.T.size();
    }

    public void y(int n, int n2) {
        this.L.get(n).N(n2);
    }

    protected void y(class06695 class066952, int n, int n2) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.N(new class06937(class066952, j + (i + 1) * 9, n + j * 18, n2 + i * 18));
            }
        }
    }

    public void y(class06695 class066952) {
        this.u();
    }

    public void y(class08036 class080362) {
        if (!(class080362 instanceof class04770)) {
            return;
        }
        class06584 class065842 = this.M();
        if (!class065842.R()) {
            class07482.N(class080362, class065842);
            this.N(class06584.E);
        }
    }

    public OptionalInt y(class06695 class066952, int n) {
        for (int i = 0; i < this.T.size(); ++i) {
            class06937 class069372 = (class06937)this.T.get(i);
            if (class069372.L != class066952 || n != class069372.B()) continue;
            return OptionalInt.of(i);
        }
        return OptionalInt.empty();
    }

    public void y(class07508 class075082) {
        this.d.remove(class075082);
    }

    private void y(int n, class06584 class065842, Supplier<class06584> supplier) {
        if (this.k) {
            return;
        }
        class00161 class001612 = (class00161)this.i.get(n);
        if (!class001612.y(class065842)) {
            class001612.N(class065842);
            if (this.w != null) {
                this.w.N(this, n, supplier.get());
            }
        }
    }

    public boolean y(class08036 class080362, int n) {
        return false;
    }

    private void E() {
        if (this.k) {
            return;
        }
        class06584 class065842 = this.M();
        if (!this.j.y(class065842)) {
            this.j.N(class065842);
            if (this.w != null) {
                this.w.N(this, class065842.t());
            }
        }
    }

    public static boolean N(int n, class08036 class080362) {
        if (n == 0) {
            return true;
        }
        if (n == 1) {
            return true;
        }
        return n == 2 && class080362.method_56992();
    }

    public static boolean N(@Nullable class06937 class069372, class06584 class065842, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = class069372 == null || !class069372.R();
        if (!bl2 && class06584.L((class06584)class065842, (class06584)class069372.i())) {
            return class069372.i().c() + (bl ? 0 : class065842.c()) <= class065842.U();
        }
        return bl2;
    }

    private void N(class07482 class074822, class06584 class065842) {
        if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17_1)) {
            this.u = class065842;
        }
    }

    private static void N(class06695 class066952, CallbackInfoReturnable callbackInfoReturnable) {
        if (class066952 instanceof LithiumInventory) {
            LithiumInventory lithiumInventory = (LithiumInventory)class066952;
            callbackInfoReturnable.setReturnValue((Object)InventoryHelper.getLithiumStackList((LithiumInventory)lithiumInventory).getSignalStrength(class066952));
        }
    }

    public void N(class06584 class065842) {
        this.u = class065842;
    }

    public void N_72(class07482 class074822) {
        class06937 class069372;
        int n;
        HashBasedTable hashBasedTable = HashBasedTable.create();
        for (n = 0; n < class074822.T.size(); ++n) {
            class069372 = (class06937)class074822.T.get(n);
            hashBasedTable.put((Object)class069372.L, (Object)class069372.B(), (Object)n);
        }
        for (n = 0; n < this.T.size(); ++n) {
            class069372 = (class06937)this.T.get(n);
            Integer n2 = (Integer)hashBasedTable.get((Object)class069372.L, (Object)class069372.B());
            if (n2 == null) continue;
            this.y.set(n, (Object)((class06584)class074822.y.get(n2.intValue())));
            class00161 class001612 = (class00161)class074822.i.get(n2.intValue());
            class00161 class001613 = (class00161)this.i.get(n);
            if (!(class001612 instanceof class09174)) continue;
            class09174 class091742 = (class09174)class001612;
            if (!(class001613 instanceof class09174)) continue;
            ((class09174)class001613).N(class091742);
        }
    }

    public static int N(@Nullable class00394 class003942) {
        if (class003942 instanceof class06695) {
            return class07482.L((class06695)class003942);
        }
        return 0;
    }

    public static int N(Set<class06937> set, int n, class06584 class065842) {
        return switch (n) {
            case 0 -> class04995.y((float)((float)class065842.c() / (float)set.size()));
            case 1 -> 1;
            case 2 -> class065842.U();
            default -> class065842.c();
        };
    }

    private void N(int n, class06584 class065842, Supplier<class06584> supplier) {
        if (!class06584.N((class06584)((class06584)this.y.get(n)), (class06584)class065842)) {
            class06584 class065843 = supplier.get();
            this.y.set(n, (Object)class065843);
            Iterator<class07508> var6 = this.d.iterator();
            while (var6.hasNext()) {
                var6.next().N(this, n, class065843);
            }
        }
    }

    public void N(class02723 class027232) {
        this.w = class027232;
        this.j = class027232.N();
        this.i.replaceAll(class001612 -> class027232.N());
        this.y();
    }

    public void N(class07508 class075082) {
        if (this.d.contains(class075082)) {
            return;
        }
        this.d.add(class075082);
        this.u();
    }

    protected void N(class05845 class058452) {
        for (int i = 0; i < class058452.N(); ++i) {
            this.N(class05865.N((class05845)class058452, (int)i));
        }
    }

    public void N(int n, class06584 class065842) {
        ((class00161)this.i.get(n)).N(class065842);
    }

    public void N(int n, class00176 class001762) {
        if (n < 0 || n >= this.i.size()) {
            N.debug("Incorrect slot index: {} available slots: {}", (Object)n, (Object)this.i.size());
            return;
        }
        ((class00161)this.i.get(n)).N(class001762);
    }

    public void N(class00176 class001762) {
        this.j.N(class001762);
    }

    protected static void N(class06695 class066952, int n) {
        int n2 = class066952.method_5439();
        if (n2 < n) {
            throw new IllegalArgumentException("Container size " + n2 + " is smaller than expected " + n);
        }
    }

    public class05851<?> N() {
        if (this.n == null) {
            throw new UnsupportedOperationException("Unable to construct this menu by type");
        }
        return this.n;
    }

    protected static boolean N(class05880 class058802, class08036 class080362, class00891 class008912) {
        return (Boolean)class058802.N((T class072992, U class072092) -> {
            if (!class072992.method_8320(class072092).N(class008912)) {
                return false;
            }
            return class080362.method_56093(class072092, 4.0);
        }, (Object)true);
    }

    protected void N(class06695 class066952, int n, int n2) {
        for (int i = 0; i < 9; ++i) {
            this.N(new class06937(class066952, i, n + i * 18, n2));
        }
    }

    protected static void N(class05845 class058452, int n) {
        int n2 = class058452.N();
        if (n2 < n) {
            throw new IllegalArgumentException("Container data count " + n2 + " is smaller than expected " + n);
        }
    }

    protected class06937 N(class06937 class069372) {
        class069372.u = this.T.size();
        this.T.add((Object)class069372);
        this.y.add((Object)class06584.E);
        this.i.add((Object)(this.w != null ? this.w.N() : class00161.N));
        return class069372;
    }

    protected class05865 N(class05865 class058652) {
        this.L.add(class058652);
        this.R.add(0);
        return class058652;
    }

    private static void N(class08036 class080362, class06584 class065842) {
        boolean bl;
        boolean bl2 = class080362.method_31481() && class080362.method_35049() != class07062.field_27002;
        boolean bl3 = bl = class080362 instanceof class04770 && ((class04770)class080362).method_14239();
        if (bl2 || bl) {
            class080362.method_7328(class065842, false);
        } else if (class080362 instanceof class04770) {
            class080362.method_31548().B(class065842);
        }
    }

    protected void N(class08036 class080362, class06695 class066952) {
        for (int i = 0; i < class066952.method_5439(); ++i) {
            class07482.N(class080362, class066952.method_5441(i));
        }
    }

    public void N(int n, int n2, class06584 class065842) {
        this.L(n).i(class065842);
        this.v = n2;
    }

    public void N(int n, List<class06584> list, class06584 class065842) {
        for (int i = 0; i < list.size(); ++i) {
            this.L(i).i(list.get(i));
        }
        class06584 class065843 = class065842;
        this.N(this, class065843);
        this.v = n;
    }

    public abstract boolean N(class08036 var1);

    protected boolean N(class06584 class065842, int n, int n2, boolean bl) {
        int n3;
        class06584 class065843;
        class06937 class069372;
        boolean bl2 = false;
        int n4 = n;
        if (bl) {
            n4 = n2 - 1;
        }
        if (class065842.E()) {
            while (!class065842.R() && (bl ? n4 >= n : n4 < n2)) {
                class069372 = (class06937)this.T.get(n4);
                class065843 = class069372.i();
                if (!class065843.R() && class06584.L((class06584)class065842, (class06584)class065843)) {
                    int n5;
                    n3 = class065843.c() + class065842.c();
                    if (n3 <= (n5 = class069372.b_(class065843))) {
                        class065842.i(0);
                        class065843.i(n3);
                        class069372.M();
                        bl2 = true;
                    } else if (class065843.c() < n5) {
                        class065842.B(n5 - class065843.c());
                        class065843.i(n5);
                        class069372.M();
                        bl2 = true;
                    }
                }
                if (bl) {
                    --n4;
                    continue;
                }
                ++n4;
            }
        }
        if (!class065842.R()) {
            n4 = bl ? n2 - 1 : n;
            while (bl ? n4 >= n : n4 < n2) {
                class069372 = (class06937)this.T.get(n4);
                class065843 = class069372.i();
                if (class065843.R() && class069372.N(class065842)) {
                    n3 = class069372.b_(class065842);
                    class069372.u(class065842.N(Math.min(class065842.c(), n3)));
                    class069372.M();
                    bl2 = true;
                    break;
                }
                if (bl) {
                    --n4;
                    continue;
                }
                ++n4;
            }
        }
        return bl2;
    }

    private boolean N(class08036 class080362, class05442 class054422, class06937 class069372, class06584 class065842, class06584 class065843) {
        class03767 class037672 = class080362.method_73183().method_45162();
        if (class065843.N(class037672) && class065843.N(class069372, class054422, class080362)) {
            return true;
        }
        return class065842.N(class037672) && class065842.N(class065843, class069372, class054422, class080362, this.W());
    }

    public void N(int n, int n2, class07510 class075102, class08036 class080362) {
        try {
            this.y(n, n2, class075102, class080362);
        }
        catch (Exception exception) {
            class07080 class070802 = class07080.N((Throwable)exception, (String)"Container click");
            class07074 class070742 = class070802.N("Click info");
            class070742.N("Menu Type", () -> this.n != null ? class04206.T.y(this.n).toString() : "<no type>");
            class070742.N("Menu Class", () -> this.getClass().getCanonicalName());
            class070742.N("Slot Count", (Object)this.T.size());
            class070742.N("Slot", (Object)n);
            class070742.N("Button", (Object)n2);
            class070742.N("Type", (Object)class075102);
            throw new class07878(class070802);
        }
    }

    public void N(int n, int n2) {
        if (n >= 0 && n < this.T.size()) {
            class05462.N((class06584)((class06937)this.T.get(n)).i(), (int)n2);
        }
    }

    public abstract class06584 N(class08036 var1, int var2);

    public boolean N(class06584 class065842, class06937 class069372) {
        return true;
    }

    public short viaFabricPlus$getActionId() {
        return this.Y;
    }

    private class04803 W() {
        return new class10759(this);
    }

    protected void R() {
        this.G = 0;
        this.l.clear();
    }

    public short viaFabricPlus$incrementAndGetActionId() {
        this.Y = (short)(this.Y + 1);
        return this.Y;
    }
}

