/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  jerozgen.languagereload.mixin.KeyBindingAccessor
 *  minecraft.class00392
 *  minecraft.class04648
 *  minecraft.class04655
 *  minecraft.class04671
 *  minecraft.class05926
 *  minecraft.class06202
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class08392
 *  minecraft.class08844
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.mixin.client.keybinding.KeyMappingAccessor
 *  net.fabricmc.fabric.mixin.event.interaction.client.KeyMappingAccessor
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import jerozgen.languagereload.mixin.KeyBindingAccessor;
import minecraft.class00392;
import minecraft.class04648;
import minecraft.class04655;
import minecraft.class04671;
import minecraft.class05926;
import minecraft.class06202;
import minecraft.class06384;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class08392;
import minecraft.class08844;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.event.interaction.client.KeyMappingAccessor;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class06428
implements Comparable<class06428>,
KeyBindingAccessor,
net.fabricmc.fabric.mixin.client.keybinding.KeyMappingAccessor,
KeyMappingAccessor {
    private static final Map<String, class06428> y = Maps.newHashMap();
    private static final Map<class04671, List<class06428>> L = Maps.newHashMap();
    private final String u;
    private final class04671 i;
    private final class06384 R;
    public class04671 N;
    private boolean M;
    private int B;
    private final int Z;

    private void L(class04671 class046713) {
        ((List)L.computeIfAbsent(class046713, class046712 -> new ArrayList())).add(this);
    }

    public static void L() {
        for (class06428 class064282 : y.values()) {
            class05926 class059262;
            if (!(class064282 instanceof class05926) || !(class059262 = (class05926)class064282).T()) continue;
            class059262.N(true);
        }
    }

    public class06384 M() {
        return this.R;
    }

    public boolean P() {
        return this.N.equals((Object)this.i);
    }

    public class06428(String string, class04648 class046482, int n, class06384 class063842) {
        this(string, class046482, n, class063842, 0);
    }

    public class06428(String string, class04648 class046482, int n, class06384 class063842, int n2) {
        this.u = string;
        this.i = this.N = class046482.N(n);
        this.R = class063842;
        this.Z = n2;
        y.put(string, this);
        this.L(this.N);
    }

    public class06428(String string, int n, class06384 class063842) {
        this(string, class04648.field_1668, n, class063842);
    }

    public boolean B() {
        if (this.B == 0) {
            return false;
        }
        --this.B;
        return true;
    }

    protected void Z() {
        this.B = 0;
        this.N(false);
    }

    public static void i() {
        L.clear();
        for (class06428 class064282 : y.values()) {
            class064282.L(class064282.N);
        }
    }

    public String s() {
        return this.N.L();
    }

    public class00392 m() {
        return this.N.u();
    }

    public String U() {
        return this.u;
    }

    protected boolean z() {
        return this.N.N() == class04648.field_1668 && this.N.y() != class04655.yI.y();
    }

    public static void u() {
        for (class06428 class064282 : y.values()) {
            if (!(class064282 instanceof class05926)) continue;
            ((class05926)class064282).b();
        }
    }

    public boolean y(class06428 class064282) {
        return this.N.equals((Object)class064282.N);
    }

    public void y(class04671 class046712) {
        this.N = class046712;
    }

    public static void y() {
        Iterator<class06428> var0 = y.values().iterator();
        while (var0.hasNext()) {
            var0.next().Z();
        }
    }

    public static @Nullable class06428 y(String string) {
        return y.get(string);
    }

    public class04671 E() {
        return this.i;
    }

    public void N(boolean bl) {
        this.M = bl;
    }

    @Override
    public int compareTo(class06428 class064282) {
        if (this.R == class064282.R) {
            if (this.Z == class064282.Z) {
                return class08392.N((String)this.u, (Object[])new Object[0]).compareTo(class08392.N((String)class064282.u, (Object[])new Object[0]));
            }
            return Integer.compare(this.Z, class064282.Z);
        }
        return Integer.compare(class06384.N.indexOf((Object)this.R), class06384.N.indexOf((Object)class064282.R));
    }

    public static void N() {
        class08844 class088442 = class06202.Nq().Nt();
        for (class06428 class064282 : y.values()) {
            if (!class064282.z()) continue;
            class064282.N(class04655.N((class08844)class088442, (int)class064282.N.y()));
        }
    }

    private static void N(class04671 class046712, Consumer<class06428> consumer) {
        List<class06428> var2 = L.get(class046712);
        if (var2 != null && !var2.isEmpty()) {
            for (class06428 class064282 : var2) {
                consumer.accept(class064282);
            }
        }
    }

    public static void N(class04671 class046712, boolean bl) {
        class06428.N(class046712, (class06428 class064282) -> class064282.N(bl));
    }

    public static void N(class04671 class046712) {
        class06428.N(class046712, (class06428 class064282) -> ++class064282.B);
    }

    public boolean N(class06613 class066132) {
        return this.N.N() == class04648.field_1672 && this.N.y() == class066132.v();
    }

    public static Supplier<class00392> N(String string) {
        class06428 class064282 = y.get(string);
        if (class064282 == null) {
            return () -> class00392.L((String)string);
        }
        return class064282::m;
    }

    public boolean N(class06601 class066012) {
        if (class066012.v() == class04655.yI.y()) {
            return this.N.N() == class04648.field_1671 && this.N.y() == class066012.n();
        }
        return this.N.N() == class04648.field_1668 && this.N.y() == class066012.v();
    }

    public /* synthetic */ class04671 fabric_getBoundKey() {
        return this.N;
    }

    public boolean W() {
        return this.N.equals((Object)class04655.yI);
    }

    public boolean R() {
        return this.M;
    }

    public /* synthetic */ int fabric_getTimesPressed() {
        return this.B;
    }

    public /* synthetic */ class04671 languagereload_getBoundKey() {
        return this.N;
    }
}

