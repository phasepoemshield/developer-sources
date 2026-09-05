/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader
 *  com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader$Material
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.bytes.Byte2BooleanOpenHashMap
 *  it.unimi.dsi.fastutil.bytes.Byte2ByteMap$Entry
 *  it.unimi.dsi.fastutil.bytes.Byte2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00624
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class03530
 *  minecraft.class04651
 *  minecraft.class04653
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06889
 *  minecraft.class07027
 *  minecraft.class07036
 *  minecraft.class07131
 *  minecraft.class07132
 *  minecraft.class07133
 *  minecraft.class07196
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07529
 *  minecraft.class07734
 *  minecraft.class07746
 *  minecraft.class08071
 *  minecraft.class08092
 *  net.caffeinemc.mods.lithium.common.util.DirectionConstants
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Maps;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2ByteMap;
import it.unimi.dsi.fastutil.bytes.Byte2ByteOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.EnumMap;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00624;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class03530;
import minecraft.class04651;
import minecraft.class04653;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05817;
import minecraft.class05826;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06889;
import minecraft.class07027;
import minecraft.class07036;
import minecraft.class07131;
import minecraft.class07132;
import minecraft.class07133;
import minecraft.class07196;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07529;
import minecraft.class07734;
import minecraft.class07746;
import minecraft.class08071;
import minecraft.class08092;
import net.caffeinemc.mods.lithium.common.util.DirectionConstants;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class05787
extends class04651 {
    public static final class06667 N = class06665.E;
    public static final class08071 y = class06665.Np;
    private static final int i = 200;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<class05826>> R = ThreadLocal.withInitial(() -> {
        class05817 class058172 = new class05817(200);
        class058172.defaultReturnValue((byte)127);
        return class058172;
    });
    private final Map<class04688, class00494> M = Maps.newIdentityHashMap();

    protected abstract int L(class05487 var1);

    private boolean M(class04688 class046882) {
        return class046882.W() || class046882.N().N((class04651)this);
    }

    private boolean B(class04688 class046882) {
        return class046882.N().N((class04651)this) && class046882.u();
    }

    protected static int i(class04688 class046882) {
        if (class046882.u()) {
            return 0;
        }
        return 8 - Math.min(class046882.R(), 8) + ((Boolean)class046882.L((class08092)N) != false ? 8 : 0);
    }

    public abstract class04651 i();

    private static boolean u(class04688 class046882, class07290 class072902, class07209 class072092) {
        return class046882.N().N(class072902.method_8316(class072092.method_10084()).N());
    }

    public abstract class04651 u();

    public abstract int u(class04688 var1);

    protected abstract int y(class05487 var1);

    protected Map<class07211, class04688> y(class04782 class047822, class07209 class072092, class00500 class005002) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class047822, class072092, class005002, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (Map)callbackInfoReturnable.getReturnValue();
        }
        int n = 1000;
        EnumMap enumMap = Maps.newEnumMap(class07211.class);
        class04653 class046532 = null;
        for (class07211 class072112 : class07221.field_11062) {
            int n2;
            class04688 class046882;
            class04688 class046883;
            class00500 class005003;
            class07209 class072093;
            if (!this.N((class07290)class047822, class072092, class005002, class072112, class072093 = class072092.method_10093(class072112), class005003 = class047822.method_8320(class072093), class046883 = class005003.Y()) || !class05787.y((class07290)class047822, class072093, class005003, (class046882 = this.N(class047822, class072093, class005003)).N())) continue;
            if (class046532 == null) {
                class046532 = new class04653(this, (class07290)class047822, class072092);
            }
            if ((n2 = class046532.y(class072093) ? 0 : this.N((class05487)class047822, class072093, 1, class072112.b(), class005003, class046532)) < n) {
                enumMap.clear();
            }
            if (n2 > n) continue;
            if (class046883.N((class07290)class047822, class072093, class046882.N(), class072112)) {
                enumMap.put(class072112, class046882);
            }
            n = n2;
        }
        return enumMap;
    }

    public class00494 y(class04688 class046883, class07290 class072902, class07209 class072092) {
        if (class046883.R() == 9 && class05787.u(class046883, class072902, class072092)) {
            return class00389.y();
        }
        return this.M.computeIfAbsent(class046883, class046882 -> class00389.N((double)0.0, (double)0.0, (double)0.0, (double)1.0, (double)class046882.N(class072902, class072092), (double)1.0));
    }

    private static boolean y(class07290 class072902, class07209 class072092, class00500 class005002, class04651 class046512) {
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class07132) {
            return ((class07132)class008912).N(null, class072902, class072092, class005002, class046512);
        }
        return true;
    }

    public void y(class04782 class047822, class07209 class072092, class00500 class005002, class04688 class046882) {
        if (!class046882.u()) {
            class04688 class046883 = this.N(class047822, class072092, class047822.method_8320(class072092));
            int n = this.N((class07299)class047822, class072092, class046882, class046883);
            if (class046883.W()) {
                class046882 = class046883;
                class005002 = class00869.N.W();
                class047822.method_8652(class072092, class005002, 3);
            } else if (class046883 != class046882) {
                class046882 = class046883;
                class005002 = class046882.B();
                class047822.method_8652(class072092, class005002, 3);
                class047822.N(class072092, class046882.N(), n);
            }
        }
        this.N(class047822, class072092, class005002, class046882);
    }

    public float N(class04688 class046882) {
        return (float)class046882.R() / 9.0f;
    }

    private void N(class04782 class047822, class07209 class072092, class00500 class005002, class00500[] class00500Array, Map map) {
        class07209 class072093;
        class07211 class072112;
        int n;
        Byte2ByteOpenHashMap byte2ByteOpenHashMap = new Byte2ByteOpenHashMap();
        Byte2ByteOpenHashMap byte2ByteOpenHashMap2 = new Byte2ByteOpenHashMap();
        Byte2BooleanOpenHashMap byte2BooleanOpenHashMap = new Byte2BooleanOpenHashMap();
        byte by = 0;
        int n2 = this.y((class05487)class047822) + 1;
        for (n = 0; n < DirectionConstants.HORIZONTAL.length; ++n) {
            class04688 class046882;
            byte by2;
            class00500 class005003;
            class072112 = DirectionConstants.HORIZONTAL[n];
            class072093 = class072092.method_10093(class072112);
            if (!this.N((class07290)class047822, class072092, class005002, class072112, class072093, class005003 = this.N((class07299)class047822, class072093, class00500Array, by2 = class05787.N(class072092, class072093, n2)), class005003.Y()) || !class05787.y((class07290)class047822, class072093, class005003, (class046882 = this.N(class047822, class072093, class005003)).N())) continue;
            if (class005003.Y().N((class07290)class047822, class072093, class046882.N(), class072112)) {
                map.put(class072112, class046882);
            }
            if (!this.N((class07290)class047822, class046882.N(), class072092, class005002, class072112, class072093, class005003, class005003.Y())) continue;
            byte2ByteOpenHashMap.put(by2, (byte)(17 << n));
            if (!this.N((class05487)class047822, byte2BooleanOpenHashMap, by2, class072093, class005003)) continue;
            by = (byte)(by | (byte)(1 << n));
        }
        for (n = 0; n < this.y((class05487)class047822) && by == 0; ++n) {
            class072112 = this.u();
            ObjectIterator var13 = byte2ByteOpenHashMap.byte2ByteEntrySet().fastIterator();
            while (var13.hasNext()) {
                Byte2ByteMap.Entry entry = (Byte2ByteMap.Entry)var13.next();
                byte by3 = entry.getByteKey();
                byte by4 = entry.getByteValue();
                int n3 = 2 * n2 + 1;
                int n4 = by3 / n3;
                int n5 = by3 % n3;
                int n6 = n5 % 2;
                int n7 = (n4 * 2 + n5 + n6 - n2 * 2) / 2;
                int n8 = n7 - n5 + n2;
                class07209 class072094 = class072092.method_10069(n7, 0, n8);
                class00500 class005004 = class00500Array[by3];
                for (int i = 0; i < DirectionConstants.HORIZONTAL.length; ++i) {
                    byte by5;
                    class07209 class072095;
                    byte by6;
                    class07211 class072113 = DirectionConstants.HORIZONTAL[i];
                    byte by7 = DirectionConstants.HORIZONTAL_OPPOSITE_INDICES[i];
                    if ((by4 >> 4 & 1 << by7) != 0 || byte2ByteOpenHashMap.containsKey(by6 = class05787.N(class072092, class072095 = class072094.method_10093(class072113), n2))) continue;
                    byte by8 = by5 = byte2ByteOpenHashMap2.getOrDefault(by6, (byte)0);
                    by8 = (byte)(by8 | (byte)(16 << i));
                    if (((by8 = (byte)(by8 | (byte)(by4 & 0xF))) & 0xF) == (by5 & 0xF)) {
                        byte2ByteOpenHashMap2.put(by6, by8);
                        continue;
                    }
                    class00500 class005005 = this.N((class07299)class047822, class072095, class00500Array, by6);
                    if (!this.N((class07290)class047822, (class04651)class072112, class072094, class005004, class072113, class072095, class005005, class005005.Y())) continue;
                    byte2ByteOpenHashMap2.put(by6, by8);
                    if (!this.N((class05487)class047822, byte2BooleanOpenHashMap, by6, class072095, class005005)) continue;
                    by = (byte)(by | (byte)(by4 & 0xF));
                }
            }
            class072093 = byte2ByteOpenHashMap;
            byte2ByteOpenHashMap = byte2ByteOpenHashMap2;
            byte2ByteOpenHashMap2 = class072093;
            byte2ByteOpenHashMap2.clear();
        }
        if (by != 0) {
            this.N(by, map);
        }
    }

    private boolean N(class07299 class072992, class00500 class005002, class07209 class072092) {
        return class05787.N((class07290)class072992, class072092, class005002, this.i());
    }

    private void N(byte by, Map map) {
        for (int i = 0; i < DirectionConstants.HORIZONTAL.length; ++i) {
            if ((by & 1 << i) != 0) continue;
            map.remove(DirectionConstants.HORIZONTAL[i]);
        }
    }

    private class00500 N(class07299 class072992, class07209 class072092, class00500[] class00500Array, byte by) {
        int n = Byte.toUnsignedInt(by);
        class00500 class005002 = class00500Array[n];
        if (class005002 == null) {
            class00500Array[n] = class005002 = class072992.method_8320(class072092);
        }
        return class005002;
    }

    private boolean N(class05487 class054872, Byte2BooleanOpenHashMap byte2BooleanOpenHashMap, byte by, class07209 class072092, class00500 class005002) {
        if (byte2BooleanOpenHashMap.containsKey(by)) {
            return byte2BooleanOpenHashMap.get(by);
        }
        class07209 class072093 = class072092.method_10074();
        class00500 class005003 = class054872.method_8320(class072093);
        boolean bl = this.N((class07290)class054872, class072092, class005002, class072093, class005003);
        byte2BooleanOpenHashMap.put(by, bl);
        return bl;
    }

    private boolean N(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        class00891 class008912;
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_11_1)) {
            ViaFabricPlusMappingDataLoader.Material material = (ViaFabricPlusMappingDataLoader.Material)ViaFabricPlusMappingDataLoader.MATERIALS.get(ViaFabricPlusMappingDataLoader.getBlockMaterial((class00891)class005002.i()));
            return material.solid();
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2) && ((class008912 = class005002.i()) instanceof class07027 || class008912 instanceof class07131 || class008912 instanceof class00624 || class008912 == class00869.MO || class008912 == class00869.MZ || class008912 == class00869.ND || class008912 == class00869.io || class008912 == class00869.iT || class008912 == class00869.zN || class008912 instanceof class07734 || class008912 == class00869.yq || class008912 == class00869.yd || class008912 == class00869.yK || class008912 instanceof class07746)) {
            return false;
        }
        return class005002.L(class072902, class072092, class072112);
    }

    private static boolean N(class00500 class005002, class03530 class035302, LocalRef localRef) {
        return class05787.N(class005002, class035302, (class00891)localRef.get());
    }

    private static boolean N(class00500 class005002, class03530 class035302, class00891 class008912) {
        if (class035302 == class01210.NH) {
            return class008912 instanceof class07036;
        }
        return class005002.N(class035302);
    }

    private static int N(int n) {
        return (n + 1) * (2 * n + 1);
    }

    private static byte N(class07209 class072092, class07209 class072093, int n) {
        int n2 = class072093.method_10263() - class072092.method_10263();
        int n3 = class072093.method_10260() - class072092.method_10260();
        int n4 = (n2 + n3 + n) / 2;
        int n5 = n2 - n3 + n;
        int n6 = 2 * n + 1;
        return (byte)(n4 * n6 + n5);
    }

    public void N(class04782 class047822, class07209 class072092, class00500 class005002, CallbackInfoReturnable callbackInfoReturnable) {
        class04688 class046882;
        class04688 class046883;
        EnumMap enumMap = Maps.newEnumMap(class07211.class);
        int n = this.y((class05487)class047822) + 1;
        int n2 = class05787.N(n);
        if (n2 > 256) {
            return;
        }
        class00500[] class00500Array = new class00500[n2];
        class07211 class072112 = null;
        class07209 class072093 = null;
        class00500 class005003 = null;
        for (class07211 class072113 : DirectionConstants.HORIZONTAL) {
            class00500 class005004;
            class07209 class072094 = class072092.method_10093(class072113);
            byte by = class05787.N(class072092, class072094, n);
            class00500Array[by] = class005004 = class047822.method_8320(class072094);
            if (!this.N((class07299)class047822, class005004, class072094)) continue;
            if (class072112 == null) {
                class072112 = class072113;
                class072093 = class072094;
                class005003 = class005004;
                continue;
            }
            this.N(class047822, class072092, class005002, class00500Array, enumMap);
            callbackInfoReturnable.setReturnValue((Object)enumMap);
            return;
        }
        if (class072112 != null && this.N((class07290)class047822, class072092, class005002, class072112, class072093, class005003, class046883 = class005003.Y()) && class05787.y((class07290)class047822, class072093, class005003, (class046882 = this.N(class047822, class072093, class005003)).N()) && class046883.N((class07290)class047822, class072093, class046882.N(), class072112)) {
            enumMap.put(class072112, class046882);
        }
        callbackInfoReturnable.setReturnValue((Object)enumMap);
    }

    private boolean N(class07290 class072902, class04651 class046512, class07209 class072092, class00500 class005002, class07211 class072112, class07209 class072093, class00500 class005003, class04688 class046882) {
        return class05787.y(class072902, class072093, class005003, class046512) && this.N(class072902, class072092, class005002, class072112, class072093, class005003, class046882);
    }

    public boolean N(class07290 class072902, class07209 class072092, class00500 class005002, class07209 class072093, class00500 class005003) {
        return (class005003.Y().N().N((class04651)this) || class05787.N(class072902, class072093, class005003, this.u())) && class05787.N(class07211.field_11033, class072902, class072092, class005002, class072093, class005003);
    }

    private static boolean N(class07211 class072112, class07290 class072902, class07209 class072092, class00500 class005002, class07209 class072093, class00500 class005003) {
        int n;
        class05826 class058262;
        Object2ByteLinkedOpenHashMap<class05826> var8;
        if (class07529.Nj || class07529.Nl && class072093.method_10260() < 0) {
            return false;
        }
        class00494 class004942 = class005003.M(class072902, class072093);
        if (class004942 == class00389.y()) {
            return false;
        }
        class00494 class004943 = class005002.M(class072902, class072092);
        if (class004943 == class00389.y()) {
            return false;
        }
        if (class004943 == class00389.N() && class004942 == class00389.N()) {
            return true;
        }
        if (class005002.i().m() || class005003.i().m()) {
            Object var8_8 = null;
        } else {
            var8 = R.get();
        }
        if (var8 != null) {
            class058262 = new class05826(class005002, class005003, class072112);
            n = var8.getAndMoveToFirst((Object)class058262);
            if (n != 127) {
                return n != 0;
            }
        } else {
            class058262 = null;
        }
        int n2 = n = !class00389.y((class00494)class004943, (class00494)class004942, (class07211)class072112) ? 1 : 0;
        if (var8 != null) {
            if (var8.size() == 200) {
                var8.removeLastByte();
            }
            var8.putAndMoveToFirst((Object)class058262, (byte)(n != 0 ? 1 : 0));
        }
        return n != 0;
    }

    public class04688 N(int n, boolean bl) {
        return (class04688)((class04688)this.u().M().y((class08092)y, (Comparable)Integer.valueOf(n))).y((class08092)N, (Comparable)Boolean.valueOf(bl));
    }

    public class04688 N(boolean bl) {
        return (class04688)this.i().M().y((class08092)N, (Comparable)Boolean.valueOf(bl));
    }

    protected abstract boolean N(class04782 var1);

    protected void N(class07284 class072842, class07209 class072092, class00500 class005002, class07211 class072112, class04688 class046882) {
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class07132) {
            ((class07132)class008912).N(class072842, class072092, class005002, class046882);
        } else {
            if (!class005002.P()) {
                this.N(class072842, class072092, class005002);
            }
            class072842.method_8652(class072092, class046882.B(), 3);
        }
    }

    public class06889 N(class07290 class072902, class07209 class072092, class04688 class046882) {
        double d = 0.0;
        double d2 = 0.0;
        class07218 class072182 = new class07218();
        for (class07211 class072112 : class07221.field_11062) {
            class072182.N((class00753)class072092, class072112);
            class04688 class046883 = class072902.method_8316((class07209)class072182);
            if (!this.M(class046883)) continue;
            float f = class046883.i();
            float f2 = 0.0f;
            if (f == 0.0f) {
                class07209 class072093;
                class04688 class046884;
                if (!class072902.method_8320((class07209)class072182).M() && this.M(class046884 = class072902.method_8316(class072093 = class072182.method_10074())) && (f = class046884.i()) > 0.0f) {
                    f2 = class046882.i() - (f - 0.8888889f);
                }
            } else if (f > 0.0f) {
                f2 = class046882.i() - f;
            }
            if (f2 == 0.0f) continue;
            d += (double)((float)class072112.P() * f2);
            d2 += (double)((float)class072112.T() * f2);
        }
        class06889 class068892 = new class06889(d, 0.0, d2);
        if (((Boolean)class046882.L((class08092)N)).booleanValue()) {
            for (class04688 class046883 : class07221.field_11062) {
                class072182.N((class00753)class072092, (class07211)class046883);
                if (!this.N(class072902, (class07209)class072182, (class07211)class046883) && !this.N(class072902, class072182.method_10084(), (class07211)class046883)) continue;
                class068892 = class068892.u().y(0.0, -6.0, 0.0);
                break;
            }
        }
        return class068892.u();
    }

    protected boolean N(class07290 class072902, class07209 class072092, class07211 class072112) {
        class00500 class005002 = class072902.method_8320(class072092);
        if (class072902.method_8316(class072092).N().N((class04651)this)) {
            return false;
        }
        if (class072112 == class07211.field_11036) {
            return true;
        }
        if (class005002.i() instanceof class07133) {
            return false;
        }
        class07211 class072113 = class072112;
        class07209 class072093 = class072092;
        class07290 class072903 = class072902;
        class00500 class005003 = class005002;
        return this.N(class005003, class072903, class072093, class072113);
    }

    protected void N(class04782 class047822, class07209 class072092, class00500 class005002, class04688 class046882) {
        class04688 class046883;
        class04651 class046512;
        class04688 class046884;
        class00500 class005003;
        if (class046882.W()) {
            return;
        }
        class07209 class072093 = class072092.method_10074();
        if (this.N((class07290)class047822, class072092, class005002, class07211.field_11033, class072093, class005003 = class047822.method_8320(class072093), class046884 = class005003.Y()) && class046884.N((class07290)class047822, class072093, class046512 = (class046883 = this.N(class047822, class072093, class005003)).N(), class07211.field_11033) && class05787.y((class07290)class047822, class072093, class005003, class046512)) {
            this.N((class07284)class047822, class072093, class005003, class07211.field_11033, class046883);
            if (this.N((class05487)class047822, class072092) >= 3) {
                this.N(class047822, class072092, class046882, class005002);
            }
            return;
        }
        if (class046882.u() || !this.N((class07290)class047822, class072092, class005002, class072093, class005003)) {
            this.N(class047822, class072092, class046882, class005002);
        }
    }

    private void N(class04782 class047822, class07209 class072092, class04688 class046882, class00500 class005002) {
        int n = class046882.R() - this.L((class05487)class047822);
        if (((Boolean)class046882.L((class08092)N)).booleanValue()) {
            n = 7;
        }
        if (n <= 0) {
            return;
        }
        for (Map.Entry<class07211, class04688> entry : this.y(class047822, class072092, class005002).entrySet()) {
            class07211 class072112 = entry.getKey();
            class04688 class046883 = entry.getValue();
            class07209 class072093 = class072092.method_10093(class072112);
            this.N((class07284)class047822, class072093, class047822.method_8320(class072093), class072112, class046883);
        }
    }

    protected class04688 N(class04782 class047822, class07209 class072092, class00500 class005002) {
        class07218 class072182;
        class07218 class072183;
        class07211 class0721122;
        int n = 0;
        int n2 = 0;
        class07218 class072184 = new class07218();
        for (class07211 class0721122 : class07221.field_11062) {
            class072183 = class072184.N((class00753)class072092, class0721122);
            class00500 class005003 = class047822.method_8320((class07209)class072183);
            class04688 class046882 = class005003.Y();
            if (!class046882.N().N((class04651)this) || !class05787.N(class0721122, (class07290)class047822, class072092, class005002, (class07209)class072183, class005003)) continue;
            if (class046882.u()) {
                ++n2;
            }
            n = Math.max(n, class046882.R());
        }
        if (n2 >= 2 && this.N(class047822)) {
            class072182 = class047822.method_8320((class07209)class072184.N((class00753)class072092, class07211.field_11033));
            class0721122 = class072182.Y();
            if (class072182.B() || this.B((class04688)class0721122)) {
                return this.N(false);
            }
        }
        if (!(class072183 = (class0721122 = class047822.method_8320((class07209)(class072182 = class072184.N((class00753)class072092, class07211.field_11036)))).Y()).W() && class072183.N().N((class04651)this) && class05787.N(class07211.field_11036, (class07290)class047822, class072092, class005002, (class07209)class072182, (class00500)class0721122)) {
            return this.N(8, true);
        }
        int n3 = n - this.L((class05487)class047822);
        if (n3 <= 0) {
            return class04684.N.M();
        }
        return this.N(n3, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean N(class00500 class005002) {
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class07132) {
            return true;
        }
        if (class005002.M()) {
            return false;
        }
        if (class008912 instanceof class07196) return false;
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class008912);
        class008912 = (class00891)localRefImpl.dispose();
        if (class05787.N(class005002, class01210.NH, (LocalRef)localRefImpl)) return false;
        if (class005002.N(class00869.uW)) return false;
        if (class005002.N(class00869.it)) return false;
        if (class005002.N(class00869.PN)) return false;
        if (class005002.N(class00869.iq)) return false;
        if (class005002.N(class00869.MW)) return false;
        if (class005002.N(class00869.EY)) return false;
        if (class005002.N(class00869.EK)) return false;
        return true;
    }

    private static boolean N(class07290 class072902, class07209 class072092, class00500 class005002, class04651 class046512) {
        return class05787.N(class005002) && class05787.y(class072902, class072092, class005002, class046512);
    }

    protected void N(class00517<class04651, class04688> class005172) {
        class005172.N(new class08092[]{N});
    }

    protected int N(class07299 class072992, class07209 class072092, class04688 class046882, class04688 class046883) {
        return this.N((class05487)class072992);
    }

    public float N(class04688 class046882, class07290 class072902, class07209 class072092) {
        if (class05787.u(class046882, class072902, class072092)) {
            return 1.0f;
        }
        return class046882.i();
    }

    protected abstract void N(class07284 var1, class07209 var2, class00500 var3);

    protected int N(class05487 class054872, class07209 class072092, int n, class07211 class072112, class00500 class005002, class04653 class046532) {
        int n2 = 1000;
        for (class07211 class072113 : class07221.field_11062) {
            int n3;
            if (class072113 == class072112) continue;
            class07209 class072093 = class072092.method_10093(class072113);
            class00500 class005003 = class046532.N(class072093);
            class04688 class046882 = class005003.Y();
            if (!this.N((class07290)class054872, this.u(), class072092, class005002, class072113, class072093, class005003, class046882)) continue;
            if (class046532.y(class072093)) {
                return n;
            }
            if (n >= this.y(class054872) || (n3 = this.N(class054872, class072093, n + 1, class072113.b(), class005003, class046532)) >= n2) continue;
            n2 = n3;
        }
        return n2;
    }

    private boolean N(class07290 class072902, class07209 class072092, class00500 class005002, class07211 class072112, class07209 class072093, class00500 class005003, class04688 class046882) {
        return !this.B(class046882) && class05787.N(class005003) && class05787.N(class072112, class072902, class072092, class005002, class072093, class005003);
    }

    private int N(class05487 class054872, class07209 class072092) {
        int n = 0;
        for (class07211 class072112 : class07221.field_11062) {
            class07209 class072093 = class072092.method_10093(class072112);
            class04688 class046882 = class054872.method_8316(class072093);
            if (!this.B(class046882)) continue;
            ++n;
        }
        return n;
    }
}

