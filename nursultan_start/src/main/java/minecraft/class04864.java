/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.viaversion.viafabricplus.features.font.BuiltinEmptyGlyph1_12_2
 *  com.viaversion.viafabricplus.features.font.RenderableGlyphDiff
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntCollection
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  minecraft.class00912
 *  minecraft.class00947
 *  minecraft.class01894
 *  minecraft.class01923
 *  minecraft.class02306
 *  minecraft.class03475
 *  minecraft.class04690
 *  minecraft.class04995
 *  minecraft.class05247
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class06251
 *  minecraft.class06262
 *  minecraft.class07913
 *  minecraft.class07948
 *  minecraft.class08985
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Sets;
import com.viaversion.viafabricplus.features.font.BuiltinEmptyGlyph1_12_2;
import com.viaversion.viafabricplus.features.font.RenderableGlyphDiff;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import minecraft.class00912;
import minecraft.class00947;
import minecraft.class01894;
import minecraft.class01923;
import minecraft.class02306;
import minecraft.class03475;
import minecraft.class04690;
import minecraft.class04849;
import minecraft.class04850;
import minecraft.class04855;
import minecraft.class04857;
import minecraft.class04871;
import minecraft.class04995;
import minecraft.class05247;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class06251;
import minecraft.class06262;
import minecraft.class07913;
import minecraft.class07948;
import minecraft.class08985;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04864
implements AutoCloseable {
    private static final float i = 32.0f;
    private static final class07948 R = new class04857();
    final class04690 N;
    final class00912 y = new class04855(this);
    private List<class06251> M = List.of();
    private List<class06262> B = List.of();
    private final Int2ObjectMap<IntList> Z = new Int2ObjectOpenHashMap();
    public final class03475<class04871> L = new class03475(class04871[]::new, n -> new class04871[n][]);
    private final IntFunction<class04871> z = this::y;
    class07948 u = R;
    private final Supplier<class07948> U = () -> this.u;
    private final class04871 E = new class04871(this.U, this.U);
    private @Nullable class07913 W;
    private final class08985 m = new class04849(this, false);
    private final class08985 P = new class04849(this, true);
    private class07948 s;
    private class04871 T;
    private boolean b;

    private void L(int n, CallbackInfoReturnable callbackInfoReturnable) {
        this.b = false;
    }

    public class04864(class04690 class046902) {
        this.N = class046902;
    }

    @Override
    public void close() {
        this.N.close();
    }

    private void y(int n, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            class04871 class048712 = (class04871)((Object)callbackInfoReturnable.getReturnValue());
            callbackInfoReturnable.setReturnValue((Object)(class048712 == this.E ? this.T : class048712));
        }
    }

    private void y() {
        this.N.N();
        this.L.N();
        this.Z.clear();
        this.N((CallbackInfo)null);
        this.u = (class07948)Objects.requireNonNull(class01923.field_37899.N(this.N));
        this.W = class01923.field_37898.N(this.N);
    }

    private class04871 y(int n) {
        class04850 class048502 = null;
        Iterator<class06262> iterator = this.B.iterator();
        while (iterator.hasNext()) {
            class00947 class009472 = iterator.next().N(n);
            if (class009472 == null) continue;
            if (class048502 == null) {
                class048502 = new class04850(this, class009472);
            }
            if (class04864.N(class009472.N())) continue;
            if (class048502.N == class009472) {
                class04871 class048712 = new class04871(class048502, class048502);
                class04871 class048713 = class048712;
                class048713 = new CallbackInfoReturnable("", true, (Object)class048713);
                this.y(n, (CallbackInfoReturnable)class048713);
                if (class048713.isCancelled()) {
                    return (class04871)((Object)class048713.getReturnValue());
                }
                return class048712;
            }
            class04871 class048714 = new class04871(class048502, new class04850(this, class009472));
            class04871 class048715 = class048714;
            class048715 = new CallbackInfoReturnable("", true, (Object)class048715);
            this.y(n, (CallbackInfoReturnable)class048715);
            if (class048715.isCancelled()) {
                return (class04871)((Object)class048715.getReturnValue());
            }
            return class048714;
        }
        if (class048502 != null) {
            class04871 class048716 = new class04871(class048502, this.U);
            class04871 class048717 = class048716;
            class048717 = new CallbackInfoReturnable("", true, (Object)class048717);
            this.y(n, (CallbackInfoReturnable)class048717);
            if (class048717.isCancelled()) {
                return (class04871)((Object)class048717.getReturnValue());
            }
            return class048716;
        }
        class04871 class048718 = this.E;
        class04871 class048719 = class048718;
        class048719 = new CallbackInfoReturnable("", true, (Object)class048719);
        this.y(n, (CallbackInfoReturnable)class048719);
        if (class048719.isCancelled()) {
            return (class04871)((Object)class048719.getReturnValue());
        }
        return class048718;
    }

    private List<class06262> y(List<class06251> list, Set<class02306> set) {
        IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
        ArrayList<class06262> arrayList = new ArrayList<class06262>();
        for (class06251 class062512 : list) {
            if (!class062512.y().N(set)) continue;
            arrayList.add(class062512.N());
            intOpenHashSet.addAll((IntCollection)class062512.N().N());
        }
        HashSet hashSet = Sets.newHashSet();
        intOpenHashSet.forEach(n2 -> {
            for (class06262 class062622 : arrayList) {
                class00947 class009472 = class062622.N(n2);
                if (class009472 == null) continue;
                hashSet.add(class062622);
                if (class009472.N() == class01923.field_37899) break;
                ((IntList)this.Z.computeIfAbsent(class04995.u((float)class009472.N().N(false)), n -> new IntArrayList())).add(n2);
                break;
            }
        });
        return arrayList.stream().filter(hashSet::contains).toList();
    }

    private void N(int n, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.R(n)) {
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
                callbackInfoReturnable.setReturnValue((Object)this.T);
            } else {
                callbackInfoReturnable.setReturnValue((Object)this.E);
            }
        }
    }

    private void N(class06069 class060692, int n, CallbackInfoReturnable callbackInfoReturnable) {
        this.b = true;
    }

    public void N(List<class06251> list, Set<class02306> set) {
        this.M = list;
        this.N(set);
    }

    private static boolean N(class05247 class052472) {
        float f = class052472.N(false);
        if (f < 0.0f || f > 32.0f) {
            return true;
        }
        float f2 = class052472.N(true);
        return f2 < 0.0f || f2 > 32.0f;
    }

    public class07913 N() {
        return Objects.requireNonNull(this.W);
    }

    public class08985 N(boolean bl) {
        return bl ? this.P : this.m;
    }

    public void N(Set<class02306> set) {
        this.B = List.of();
        this.y();
        this.B = this.y(this.M, set);
    }

    private void N(CallbackInfo callbackInfo) {
        this.s = BuiltinEmptyGlyph1_12_2.INSTANCE.bake(this.N);
        this.T = new class04871(() -> this.s, () -> this.s);
    }

    class04871 N(int n) {
        class04871 class048712 = (class04871)((Object)this.L.N(n, this.z));
        class04871 class048713 = class048712;
        class048713 = new CallbackInfoReturnable("", true, (Object)class048713);
        this.N(n, (CallbackInfoReturnable)class048713);
        if (class048713.isCancelled()) {
            return (class04871)((Object)class048713.getReturnValue());
        }
        this.L(n, null);
        return class048712;
    }

    public class07948 N(class06069 class060692, int n) {
        this.N(class060692, n, null);
        IntList intList = (IntList)this.Z.get(n);
        if (intList != null && !intList.isEmpty()) {
            return this.N(intList.getInt(class060692.y(intList.size()))).y().get();
        }
        return this.u;
    }

    private boolean R(int n) {
        if (!this.b && ((Boolean)DebugSettings.INSTANCE.filterNonExistingGlyphs.getValue()).booleanValue()) {
            return (this.N.N.equals((Object)((class01894)class06202.j_3)) || this.N.N.equals((Object)((class01894)class06202.j_4))) && !RenderableGlyphDiff.isGlyphRenderable((int)n);
        }
        return false;
    }
}

