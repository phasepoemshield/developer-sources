/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 *  jerozgen.languagereload.LanguageReload
 *  minecraft.class00265
 *  minecraft.class00282
 *  minecraft.class00296
 *  minecraft.class00311
 *  minecraft.class00329
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01015
 *  minecraft.class01023
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class01590
 *  minecraft.class01683
 *  minecraft.class01756
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class02422
 *  minecraft.class02429
 *  minecraft.class02741
 *  minecraft.class03255
 *  minecraft.class03287
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03434
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04141
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05117
 *  minecraft.class05220
 *  minecraft.class05287
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06343
 *  minecraft.class06366
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06626
 *  minecraft.class06923
 *  minecraft.class06937
 *  minecraft.class07299
 *  minecraft.class07476
 *  minecraft.class07482
 *  minecraft.class08394
 *  minecraft.class08396
 *  minecraft.class09033
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import jerozgen.languagereload.LanguageReload;
import minecraft.class00265;
import minecraft.class00282;
import minecraft.class00296;
import minecraft.class00311;
import minecraft.class00329;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01015;
import minecraft.class01023;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class01590;
import minecraft.class01683;
import minecraft.class01756;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class02422;
import minecraft.class02429;
import minecraft.class02741;
import minecraft.class03255;
import minecraft.class03287;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03434;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04141;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05117;
import minecraft.class05220;
import minecraft.class05287;
import minecraft.class05313;
import minecraft.class05322;
import minecraft.class05330;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06343;
import minecraft.class06366;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06626;
import minecraft.class06923;
import minecraft.class06937;
import minecraft.class07299;
import minecraft.class07476;
import minecraft.class07482;
import minecraft.class08394;
import minecraft.class08396;
import minecraft.class09033;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class05306<T extends class06923>
implements class01294,
class03434,
class04654 {
    public static final class01883 N = new class01883(class01894.y((String)"recipe_book/button"), class01894.y((String)"recipe_book/button_highlighted"));
    protected static final class01894 y = class01894.y((String)"textures/gui/recipe_book.png");
    private static final int B = 256;
    private static final int Z = 256;
    private static final class00392 z = class00392.L((String)"gui.recipebook.search_hint").L(class04927.field_62466);
    public static final int L = 147;
    public static final int u = 166;
    private static final int U = 86;
    private static final int E = 8;
    private static final class00392 W = class00392.L((String)"gui.recipebook.toggleRecipes.all");
    private static final int m = 30;
    private int P;
    private int s;
    private int T;
    private float b;
    private @Nullable class00329 j;
    private final class02429 v;
    private final List<class05330> n = Lists.newArrayList();
    private @Nullable class05330 t;
    protected class06366<Boolean> i;
    protected final T R;
    protected class06202 M;
    private @Nullable class04927 G;
    private String l = "";
    private final List<class05322> d;
    private class01756 w;
    private final class05313 k;
    private @Nullable class00329 Y;
    private @Nullable class05287 Q;
    private final class02741 O = new class02741();
    private int g;
    private boolean I;
    private boolean J;
    private boolean o;
    private @Nullable class03255 q;

    public void L() {
        this.N(!this.u());
    }

    private void P() {
        for (class05322 class053222 : this.d) {
            for (class05287 class052872 : this.w.N(class053222.L())) {
                this.N(class052872, this.O);
            }
        }
    }

    private boolean T() {
        return this.w.y(this.R.P());
    }

    public class05306(T t, List<class05322> list) {
        this.R = t;
        this.d = list;
        class02422 class024222 = () -> class04995.y((float)(this.b / 30.0f));
        this.v = new class02429(class024222);
        this.k = new class05313(this, class024222, t instanceof class07476);
    }

    public void Z() {
        this.P();
        this.y(this.T());
        if (this.u()) {
            this.N(false, this.T());
        }
    }

    public void i() {
        boolean bl = this.m();
        if (this.u() != bl) {
            this.N(bl);
        }
        if (!this.u()) {
            return;
        }
        if (this.g != ((class04453)this.M.T_4).method_31548().z()) {
            this.s();
            this.g = ((class04453)this.M.T_4).method_31548().z();
        }
    }

    private void b() {
        class01015 class010152 = this.R.P();
        boolean bl = !this.w.y(class010152);
        this.w.y(class010152, bl);
    }

    private void s() {
        this.O.N();
        ((class04453)this.M.T_4).method_31548().N(this.O);
        this.R.N(this.O);
        this.P();
        this.N(false, this.T());
    }

    private boolean m() {
        return this.w.N(this.R.P());
    }

    private boolean v() {
        return this.P == 86;
    }

    private void j() {
        String string = this.G.method_1882().toLowerCase(Locale.ROOT);
        this.N(string);
        if (!string.equals(this.l)) {
            this.N(false, this.T());
            this.l = string;
        }
    }

    private void U() {
        boolean bl2 = this.T();
        this.P = this.o ? 0 : 86;
        int n = this.W();
        int n2 = this.E();
        this.O.N();
        ((class04453)this.M.T_4).method_31548().N(this.O);
        this.R.N(this.O);
        String string = this.G != null ? this.G.method_1882() : "";
        class01590 class015902 = (class01590)this.M.i_3;
        Objects.requireNonNull((class01590)this.M.i_3);
        this.G = new class04927(class015902, n + 25, n2 + 13, 81, 14, (class00392)class00392.L((String)"itemGroup.search"));
        this.G.method_1880(50);
        this.G.method_1862(true);
        this.G.method_1868(-1);
        this.G.method_1852(string);
        this.G.method_47404(z);
        this.q = class03255.N((class03287)class03287.field_41822, (int)(n + 8), (int)this.G.method_46427(), (int)(this.G.method_46426() - this.W()), (int)this.G.method_25364());
        this.k.N(this.M, n, n2);
        this.i = class06366.N((class00392)this.R(), (class00392)W, (boolean)bl2).N(bl -> bl != false ? class04141.N((class00392)this.R()) : class04141.N((class00392)W)).N((class063662, bl) -> this.y().N(bl.booleanValue(), class063662.method_25367())).N(class06343.field_64541).N(n + 110, n2 + 12, 26, 16, class05220.N, (class063662, bl) -> {
            this.b();
            this.z();
            this.N(false, (boolean)bl);
        });
        this.n.clear();
        for (class05322 class053222 : this.d) {
            this.n.add(new class05330(0, 0, class053222, this::N));
        }
        if (this.t != null) {
            this.t = this.n.stream().filter(class053302 -> class053302.y().equals((Object)this.t.y())).findFirst().orElse(null);
        }
        if (this.t == null) {
            this.t = this.n.get(0);
        }
        this.t.L();
        this.P();
        this.y(bl2);
        this.N(false, bl2);
    }

    protected void z() {
        if (this.M.NE() != null) {
            class01015 class010152 = this.R.P();
            boolean bl = this.w.u().y(class010152);
            boolean bl2 = this.w.u().L(class010152);
            this.M.NE().N((class00381)new class01023(class010152, bl, bl2));
        }
    }

    public boolean u() {
        return this.J;
    }

    public void y(@Nullable class06937 class069372) {
        if (class069372 != null && this.N(class069372)) {
            this.j = null;
            this.v.N();
            if (this.u()) {
                this.s();
            }
        }
    }

    private void y(boolean bl) {
        int n = (this.s - 147) / 2 - this.P - 30;
        int n2 = (this.T - 166) / 2 + 3;
        int n3 = 27;
        int n4 = 0;
        for (class05330 class053302 : this.n) {
            if (class053302.y() instanceof class00296) {
                class053302.field_22764 = true;
                class053302.y(n, n2 + 27 * n4++);
                continue;
            }
            if (!class053302.N(this.w)) continue;
            class053302.y(n, n2 + 27 * n4++);
            class053302.N(this.w, bl);
        }
    }

    protected abstract class01883 y();

    private int E() {
        return (this.T - 166) / 2;
    }

    public void N(class00265 class002652) {
        this.v.N();
        class00311 class003112 = class00282.N((class07299)((class07299)Objects.requireNonNull((class03448)this.M.T_3)));
        this.N(this.v, class002652, class003112);
    }

    public void N(class00329 class003292) {
        ((class04453)this.M.T_4).N(class003292);
    }

    void N(String string, CallbackInfo callbackInfo) {
        LanguageReload.setLanguage((String)"en_pt");
        callbackInfo.cancel();
    }

    private void N(String string) {
        if ("excitedze".equals(string)) {
            class08396 class083962 = this.M.X();
            String string2 = "en_pt";
            if (class083962.y("en_pt") == null || class083962.N().equals("en_pt")) {
                return;
            }
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.N(string, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            class083962.N("en_pt");
            ((class05630)this.M.i_7).Nk = "en_pt";
            this.M.yy();
            ((class05630)this.M.i_7).Np();
        }
    }

    private static /* synthetic */ boolean N(ObjectSet objectSet, class05287 class052872) {
        return !objectSet.contains((Object)class052872);
    }

    public void N(int n, int n2, class06202 class062022, boolean bl) {
        this.M = class062022;
        this.s = n;
        this.T = n2;
        this.o = bl;
        this.w = ((class04453)class062022.T_4).q();
        this.g = ((class04453)class062022.T_4).method_31548().z();
        this.J = this.m();
        if (this.J) {
            this.U();
        }
    }

    protected abstract void N(class02429 var1, class00265 var2, class00311 var3);

    private void N(class05330 class053302) {
        if (this.t != null) {
            this.t.u();
        }
        class053302.L();
        this.t = class053302;
    }

    public void N(class01054 class010542, int n, int n2, @Nullable class06937 class069372) {
        if (!this.u()) {
            return;
        }
        this.k.N(class010542, n, n2);
        this.v.N(class010542, this.M, n, n2, class069372);
    }

    private boolean N(class05287 class052872, class00329 class003292, boolean bl) {
        if (!class052872.N(class003292) && class003292.equals((Object)this.j)) {
            return false;
        }
        this.j = class003292;
        this.v.N();
        ((class03443)this.M.T_2).N(((class07482)((class04453)this.M.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, class003292, bl);
        return true;
    }

    protected abstract void N(class05287 var1, class02741 var2);

    private void N(boolean bl, boolean bl2) {
        class01683 class016832;
        ArrayList arrayList = Lists.newArrayList((Iterable)this.w.N(this.t.y()));
        arrayList.removeIf(class052872 -> !class052872.y());
        String string = this.G.method_1882();
        if (!string.isEmpty() && (class016832 = this.M.NE()) != null) {
            ObjectLinkedOpenHashSet objectLinkedOpenHashSet = new ObjectLinkedOpenHashSet((Collection)class016832.Y().y().method_4810(string.toLowerCase(Locale.ROOT)));
            arrayList.removeIf(arg_0 -> class05306.N((ObjectSet)objectLinkedOpenHashSet, arg_0));
        }
        if (bl2) {
            arrayList.removeIf(class052872 -> !class052872.N());
        }
        this.k.N(arrayList, bl, bl2);
    }

    public void N(class01054 class010542, boolean bl) {
        this.v.N(class010542, this.M, bl);
    }

    private void N(class05362 class053622) {
        if (this.t != class053622 && class053622 instanceof class05330) {
            class05330 class053302 = (class05330)((Object)class053622);
            this.N(class053302);
            this.N(true, this.T());
        }
    }

    protected void N(boolean bl) {
        if (bl) {
            this.U();
        }
        this.J = bl;
        this.w.N(this.R.P(), bl);
        if (!bl) {
            this.k.L();
        }
        this.z();
    }

    protected abstract boolean N(class06937 var1);

    public boolean N(double d, double d2, int n, int n2, int n3, int n4) {
        if (!this.u()) {
            return true;
        }
        boolean bl = d < (double)n || d2 < (double)n2 || d >= (double)(n + n3) || d2 >= (double)(n2 + n4);
        boolean bl2 = (double)(n - 147) < d && d < (double)n && (double)n2 < d2 && d2 < (double)(n2 + n4);
        return bl && !bl2 && !this.t.method_25367();
    }

    public int N(int n, int n2) {
        int n3 = this.u() && !this.o ? 177 + (n - n2 - 200) / 2 : (n - n2) / 2;
        return n3;
    }

    public boolean method_25404(class06601 class066012) {
        this.I = false;
        if (!this.u() || ((class04453)this.M.T_4).method_7325()) {
            return false;
        }
        if (class066012.i() && !this.v()) {
            this.N(false);
            return true;
        }
        if (this.G.method_25404(class066012)) {
            this.j();
            return true;
        }
        if (this.G.method_25370() && this.G.method_1885() && !class066012.i()) {
            return true;
        }
        if (((class05630)this.M.i_7).o.N(class066012) && !this.G.method_25370()) {
            this.I = true;
            this.G.method_25365(true);
            return true;
        }
        if (class066012.L() && this.Q != null && this.Y != null) {
            class06478.method_62888((class09033)class06202.Nq().Nr());
            return this.N(this.Q, this.Y, class066012.W());
        }
        return false;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (!this.u()) {
            return;
        }
        if (!this.M.s()) {
            this.b += f;
        }
        int n3 = this.W();
        int n4 = this.E();
        class010542.N(class08394.Na, y, n3, n4, 1.0f, 1.0f, 147, 166, 256, 256);
        this.G.method_25394(class010542, n, n2, f);
        Iterator<class05330> var7 = this.n.iterator();
        while (var7.hasNext()) {
            var7.next().method_25394(class010542, n, n2, f);
        }
        this.i.method_25394(class010542, n, n2, f);
        this.k.N(class010542, n3, n4, n, n2, f);
    }

    public void method_37020(class03428 class034282) {
        ArrayList arrayList = Lists.newArrayList();
        this.k.N((class06478 class064782) -> {
            if (class064782.method_37303()) {
                arrayList.add(class064782);
            }
        });
        arrayList.add(this.G);
        arrayList.add(this.i);
        arrayList.addAll(this.n);
        class05117 class051172 = class05096.method_37061((List)arrayList, null);
        if (class051172 != null) {
            class051172.N().method_37020(class034282.N());
        }
    }

    public class03432 method_37018() {
        return this.J ? class03432.field_33785 : class03432.field_33784;
    }

    public boolean method_25405(double d, double d2) {
        return false;
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (this.G != null && this.G.method_25370()) {
            return this.G.method_25403(class066132, d, d2);
        }
        return false;
    }

    public boolean method_25400(class06626 class066262) {
        if (this.I) {
            return false;
        }
        if (!this.u() || ((class04453)this.M.T_4).method_7325()) {
            return false;
        }
        if (this.G.method_25400(class066262)) {
            this.j();
            return true;
        }
        return super.method_25400(class066262);
    }

    public void method_25365(boolean bl) {
    }

    public boolean method_25370() {
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (!this.u() || ((class04453)this.M.T_4).method_7325()) {
            return false;
        }
        if (this.k.N(class066132, this.W(), this.E(), 147, 166, bl)) {
            class00329 class003292 = this.k.N();
            class05287 class052872 = this.k.y();
            if (class003292 != null && class052872 != null) {
                if (!this.N(class052872, class003292, class066132.W())) {
                    return false;
                }
                this.Q = class052872;
                this.Y = class003292;
                if (!this.v()) {
                    this.N(false);
                }
            }
            return true;
        }
        if (this.G != null) {
            boolean bl2;
            boolean bl3 = bl2 = this.q != null && this.q.N(class04995.N((double)class066132.n()), class04995.N((double)class066132.t()));
            if (bl2 || this.G.method_25402(class066132, bl)) {
                this.G.method_25365(true);
                return true;
            }
            this.G.method_25365(false);
        }
        if (this.i.method_25402(class066132, bl)) {
            return true;
        }
        for (class05330 class053302 : this.n) {
            if (!class053302.method_25402(class066132, bl)) continue;
            return true;
        }
        return false;
    }

    public boolean method_16803(class06601 class066012) {
        this.I = false;
        return super.method_16803(class066012);
    }

    private int W() {
        return (this.s - 147) / 2 - this.P;
    }

    protected abstract class00392 R();
}

