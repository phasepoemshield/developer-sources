/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00159
 *  minecraft.class00318
 *  minecraft.class00757
 *  minecraft.class00788
 *  minecraft.class00800
 *  minecraft.class00818
 *  minecraft.class00836
 *  minecraft.class00837
 *  minecraft.class00851
 *  minecraft.class00859
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01408
 *  minecraft.class01427
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02349
 *  minecraft.class02474
 *  minecraft.class02482
 *  minecraft.class02484
 *  minecraft.class02500
 *  minecraft.class02683
 *  minecraft.class03366
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class03798
 *  minecraft.class04111
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04546
 *  minecraft.class04593
 *  minecraft.class04711
 *  minecraft.class05033
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05338
 *  minecraft.class05440
 *  minecraft.class05441
 *  minecraft.class05457
 *  minecraft.class05501
 *  minecraft.class05543
 *  minecraft.class05568
 *  minecraft.class05946
 *  minecraft.class05952
 *  minecraft.class06142
 *  minecraft.class06345
 *  minecraft.class06378
 *  minecraft.class06526
 *  minecraft.class06551
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06761
 *  minecraft.class07007
 *  minecraft.class07196
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07297
 *  minecraft.class07310
 *  minecraft.class07314
 *  minecraft.class07491
 *  minecraft.class07621
 *  minecraft.class07657
 *  minecraft.class07728
 *  minecraft.class07795
 *  minecraft.class08054
 *  minecraft.class08059
 *  minecraft.class08092
 *  minecraft.class08137
 *  minecraft.class08614
 *  minecraft.class08828
 *  minecraft.class08967
 *  minecraft.class08981
 *  minecraft.class09004
 *  net.fabricmc.fabric.api.datagen.v1.loot.FabricBlockLootTableGenerator
 *  net.fabricmc.fabric.mixin.datagen.loot.BlockLootSubProviderAccessor
 */
package minecraft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import minecraft.class00159;
import minecraft.class00318;
import minecraft.class00757;
import minecraft.class00788;
import minecraft.class00800;
import minecraft.class00818;
import minecraft.class00836;
import minecraft.class00837;
import minecraft.class00851;
import minecraft.class00859;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01408;
import minecraft.class01427;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02013;
import minecraft.class02055;
import minecraft.class02349;
import minecraft.class02474;
import minecraft.class02482;
import minecraft.class02484;
import minecraft.class02500;
import minecraft.class02683;
import minecraft.class03366;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class03798;
import minecraft.class04111;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04546;
import minecraft.class04593;
import minecraft.class04711;
import minecraft.class05033;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05338;
import minecraft.class05440;
import minecraft.class05441;
import minecraft.class05457;
import minecraft.class05501;
import minecraft.class05543;
import minecraft.class05568;
import minecraft.class05946;
import minecraft.class05952;
import minecraft.class06142;
import minecraft.class06345;
import minecraft.class06378;
import minecraft.class06526;
import minecraft.class06551;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06761;
import minecraft.class07007;
import minecraft.class07196;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07297;
import minecraft.class07310;
import minecraft.class07314;
import minecraft.class07491;
import minecraft.class07621;
import minecraft.class07657;
import minecraft.class07728;
import minecraft.class07795;
import minecraft.class08054;
import minecraft.class08059;
import minecraft.class08092;
import minecraft.class08137;
import minecraft.class08614;
import minecraft.class08828;
import minecraft.class08967;
import minecraft.class08981;
import minecraft.class09004;
import net.fabricmc.fabric.api.datagen.v1.loot.FabricBlockLootTableGenerator;
import net.fabricmc.fabric.mixin.datagen.loot.BlockLootSubProviderAccessor;

public abstract class class02015
implements class02013,
FabricBlockLootTableGenerator,
BlockLootSubProviderAccessor {
    protected final class01929 field_51845;
    protected final Set<class06581> field_40608;
    protected final class03767 field_40609;
    public final Map<class05946<class05074>, class05062> field_40610;
    private static final float[] field_40611;
    protected static final float[] field_40605;

    protected class02015(Set<class06581> set, class03767 class037672, Map<class05946<class05074>, class05062> map, class01929 class019292) {
        this.field_40608 = set;
        this.field_40609 = class037672;
        this.field_40610 = map;
        this.field_51845 = class019292;
    }

    public class02015(Set<class06581> set, class03767 class037672, class01929 class019292) {
        this(set, class037672, new HashMap<class05946<class05074>, class05062>(), class019292);
    }

    static {
        field_40605 = new float[]{0.05f, 0.0625f, 0.083333336f, 0.1f};
        field_40611 = new float[]{0.02f, 0.022222223f, 0.025f, 0.033333335f, 0.1f};
    }

    public class05062 method_46016(class00891 class008912) {
        return class05074.y().N(class05441.N().N((class04111)class03798.N((class07310)class06570.wy)).y((class05952)class00851.N((class00891)class008912).N(class01408.N().N((class08092)class05568.x_, true))));
    }

    public <T extends Comparable<T> & class05033> class05062 method_45987(class00891 class008912, class08092<T> class080922, T t) {
        return class05074.y().N((class05457)this.method_45978((class07310)class008912, (class07297<T>)class05441.N().N((class06378)class04711.N((float)1.0f)).N(class03798.N((class07310)class008912).y((class05952)class00851.N((class00891)class008912).N(class01408.N().N(class080922, t))))));
    }

    public void method_46024(class00891 class008912) {
        this.method_46007(class008912, class008912);
    }

    public class05062 method_46012(class00891 class008912) {
        class01921 class019212 = this.field_51845.y(class04227.yR);
        return this.method_45989(class008912, (class04111)this.method_45977((class07310)class008912, (class08967)class03798.N((class07310)class06570.WY).N((class08137)class07621.N((class06378)class06345.N((float)4.0f, (float)5.0f))).N((class08137)class02349.y((class03556)class019212.y(class07314.l)))));
    }

    public class05062 method_45997(class00891 class008912, class06581 class065812) {
        return class05074.y().N((class05457)this.method_45977((class07310)class008912, (class08967)class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class065812).N((Iterable)class07728.L.N(), n -> class07621.N((class06378)class06142.N((int)3, (float)((float)(n + 1) / 15.0f))).y((class05952)class00851.N((class00891)class008912).N(class01408.N().N((class08092)class07728.L, n.intValue())))))));
    }

    public class05062 method_45995(class07310 class073102) {
        return class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).y(this.method_62727()).N((class04111)class03798.N((class07310)class073102)));
    }

    public <T extends class08967<T>> T method_45977(class07310 class073102, class08967<T> class089672) {
        if (!this.field_40608.contains(class073102.B())) {
            return (T)class089672.N((class08137)class08828.L());
        }
        return (T)class089672.N();
    }

    public class05062 method_66554(class00891 class008912) {
        if (class008912 instanceof class08614) {
            class08614 class086142 = (class08614)class008912;
            return class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)this.method_45977((class07310)class008912, class03798.N((class07310)class008912).N((Iterable)IntStream.rangeClosed(1, 4).boxed().toList(), n -> class07621.N((class06378)class04711.N((float)n.intValue())).y((class05952)class00851.N((class00891)class008912).N(class01408.N().N((class08092)class086142.u(), n.intValue())))))));
        }
        return class02015.method_45975();
    }

    public class05062 method_45976(class07310 class073102) {
        return class05074.y().N((class05457)this.method_45978(class073102, (class07297)class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class073102))));
    }

    public class05062 method_45989(class00891 class008912, class04111<?> class041112) {
        return class02015.method_45991(class008912, this.method_60390(), class041112);
    }

    public class05062 method_46018(class00891 class008912) {
        class01921 class019212 = this.field_51845.y(class04227.yR);
        return this.method_46008(class008912, ((class03366)this.method_45977((class07310)class00869.NA, (class08967)class03798.N((class07310)class06570.Tx).N((class08137)class07621.N((class06378)class06345.N((float)1.0f, (float)2.0f))))).y(class06526.N((class03556)class019212.y(class07314.l), (float[])field_40611)));
    }

    public class05062 method_45998(class00891 class008912, class07310 class073102) {
        return this.method_45989(class008912, (class04111)this.method_45977((class07310)class008912, (class08967)class03798.N((class07310)class073102).N((class08137)class07621.N((class06378)class06345.N((float)-6.0f, (float)2.0f))).N((class08137)class09004.N((class05338)class05338.y((int)0)))));
    }

    public class05062 method_46014(class00891 class008912) {
        return class05074.y().N(class05441.N().y(this.method_60390()).N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class008912).N((class08137)class02683.y((class07491)class06551.z).N(class02484.Nd)).N((class08137)class05501.N((class00891)class008912).N((class08092)class04593.L))));
    }

    public class05062 method_46000(class00891 class008912, class00891 class008913, float ... fArray) {
        class01921 class019212 = this.field_51845.y(class04227.yR);
        return this.method_45986(class008912, class008913, fArray).N(class05441.N().N((class06378)class04711.N((float)1.0f)).y(this.method_60393()).N(((class03366)this.method_45978((class07310)class008912, (class07297)class03798.N((class07310)class06570.sS))).y(class06526.N((class03556)class019212.y(class07314.l), (float[])new float[]{0.005f, 0.0055555557f, 0.00625f, 0.008333334f, 0.025f}))));
    }

    public class05062 method_46011(class00891 class008912) {
        class01921 class019212 = this.field_51845.y(class04227.yR);
        return this.method_45989(class008912, (class04111)this.method_45977((class07310)class008912, (class08967)class03798.N((class07310)class06570.TL).N((class08137)class07621.N((class06378)class06345.N((float)4.0f, (float)9.0f))).N((class08137)class02349.N((class03556)class019212.y(class07314.l)))));
    }

    public class05062 method_45986(class00891 class008912, class00891 class008913, float ... fArray) {
        class01921 class019212 = this.field_51845.y(class04227.yR);
        return this.method_46008(class008912, ((class03366)this.method_45978((class07310)class008912, (class07297)class03798.N((class07310)class008913))).y(class06526.N((class03556)class019212.y(class07314.l), (float[])fArray))).N(class05441.N().N((class06378)class04711.N((float)1.0f)).y(this.method_60393()).N(((class03366)this.method_45977((class07310)class008912, (class08967)class03798.N((class07310)class06570.Tx).N((class08137)class07621.N((class06378)class06345.N((float)1.0f, (float)2.0f))))).y(class06526.N((class03556)class019212.y(class07314.l), (float[])field_40611))));
    }

    public class05062 method_46013(class00891 class008912) {
        return class05074.y().N((class05457)this.method_45978((class07310)class008912, (class07297)class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class008912).N((class08137)class02683.y((class07491)class06551.z).N(class02484.B).N(class02484.U).N(class02484.v).N(class02484.Nv).N(class02484.m)))));
    }

    public void method_46025(class00891 class008912) {
        this.method_46006(class008912, (class07310)class008912);
    }

    public void method_46023(class00891 class008913) {
        this.method_45994(class008913, class008912 -> this.method_46009((class07310)((class00757)class008912).y()));
    }

    public class05062 method_46004(class00891 class008912) {
        return class05074.y().N((class05457)this.method_45978((class07310)class008912, (class07297)class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class008912).N((class08137)class02683.y((class07491)class06551.z).N(class02484.B).N(class02484.NG).N(class02484.Nw).N(class02484.Nk)))));
    }

    public void method_45994(class00891 class008912, Function<class00891, class05062> function) {
        this.method_45988(class008912, function.apply(class008912));
    }

    public void method_46006(class00891 class008912, class07310 class073102) {
        this.method_45988(class008912, this.method_45976(class073102));
    }

    public class05062 method_45982(class00891 class008912, class06581 class065812, class06581 class065813, class05952 class059522) {
        class01921 class019212 = this.field_51845.y(class04227.yR);
        return (class05062)this.method_45977((class07310)class008912, (class08967)class05074.y().N(class05441.N().N((class04111)((class03366)class03798.N((class07310)class065812).y(class059522)).N((class04111)class03798.N((class07310)class065813)))).N(class05441.N().y(class059522).N((class04111)class03798.N((class07310)class065813).N((class08137)class02349.N((class03556)class019212.y(class07314.l), (float)0.5714286f, (int)3)))));
    }

    public static class05062 method_46021(class00891 class008912) {
        return class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class008912)));
    }

    public abstract void method_10379();

    public static class05062 method_45975() {
        return class05074.y();
    }

    public class05062 method_46019(class00891 class008912) {
        return class05074.y().N(class05441.N().y(this.method_62727()).N((class04111)class03798.N((class07310)class008912).N((class08137)class07621.N((class06378)class04711.N((float)2.0f)))));
    }

    public class05062 method_46017(class00891 class008912) {
        class01921 class019212 = this.field_51845.y(class04227.yR);
        return this.method_46001(class008912, (class04111)this.method_45977((class07310)class008912, (class08967)((class03366)class03798.N((class07310)class06570.by).y(class07657.N((float)0.125f))).N((class08137)class02349.N((class03556)class019212.y(class07314.l), (int)2))));
    }

    public void method_45988(class00891 class008912, class05062 class050622) {
        this.field_40610.put((class05946<class05074>)((class05946)class008912.d().orElseThrow(() -> new IllegalStateException("Block " + String.valueOf(class008912) + " does not have loot table"))), class050622);
    }

    public void method_46007(class00891 class008912, class00891 class008913) {
        this.method_45988(class008912, this.method_46003((class07310)class008913));
    }

    public class05952 method_60391() {
        return this.method_60390().y();
    }

    public class05062 method_46005(class00891 class008912, class06581 class065812) {
        return class05074.y().N((class05457)this.method_45977((class07310)class008912, (class08967)class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class065812).N((class08137)class07621.N((class06378)class06142.N((int)3, (float)0.53333336f))))));
    }

    public class05952 method_62727() {
        return class07795.N((class00837)class00837.N().N((class02055)this.field_51845.y(class04227.F), new class07310[]{class06570.vr}));
    }

    public class05062 method_45990(class00891 class008912, class05952 class059522) {
        return class05074.y().N(class05441.N().N((class04111)this.method_45977((class07310)class008912, (class08967)((class03366)((class03366)class03798.N((class07310)class008912).y(class059522)).N((Object[])class07211.values(), class072112 -> class07621.N((class06378)class04711.N((float)1.0f), (boolean)true).y((class05952)class00851.N((class00891)class008912).N(class01408.N().N((class08092)class05543.y((class07211)class072112), true))))).N((class08137)class07621.N((class06378)class04711.N((float)-1.0f), (boolean)true)))));
    }

    public class05062 method_45985(class00891 class008912, class00891 class008913) {
        class01921 class019212 = this.field_51845.y(class04227.Z);
        class04546 class045462 = ((class03366)class03798.N((class07310)class008913).N((class08137)class07621.N((class06378)class04711.N((float)2.0f))).y(this.method_62727())).N(((class03366)this.method_45978((class07310)class008912, (class07297)class03798.N((class07310)class06570.by))).y(class07657.N((float)0.125f)));
        return class05074.y().N(class05441.N().N((class04111)class045462).y((class05952)class00851.N((class00891)class008912).N(class01408.N().N((class08092)class06761.y, (Comparable)class08059.field_12607))).y(class00859.N((class00818)class00818.N().N(class01427.N().N((class02055)class019212, new class00891[]{class008912}).N(class01408.N().N((class08092)class06761.y, (Comparable)class08059.field_12609))), (class07209)new class07209(0, 1, 0)))).N(class05441.N().N((class04111)class045462).y((class05952)class00851.N((class00891)class008912).N(class01408.N().N((class08092)class06761.y, (Comparable)class08059.field_12609))).y(class00859.N((class00818)class00818.N().N(class01427.N().N((class02055)class019212, new class00891[]{class008912}).N(class01408.N().N((class08092)class06761.y, (Comparable)class08059.field_12607))), (class07209)new class07209(0, -1, 0))));
    }

    public class05062 method_65053(class07310 class073102) {
        return class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).y(this.method_60392()).N((class04111)class03798.N((class07310)class073102)));
    }

    public class05062 method_45979(class07310 class073102, class06378 class063782) {
        return class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)this.method_45977(class073102, (class08967)class03798.N((class07310)class073102).N((class08137)class07621.N((class06378)class063782)))));
    }

    public void method_45999(class00891 class008912, class00891 class008913) {
        class01921 class019212 = this.field_51845.y(class04227.yR);
        class05062 class050622 = this.method_46008(class008912, class03798.N((class07310)class008912).y(class06526.N((class03556)class019212.y(class07314.l), (float[])new float[]{0.33f, 0.55f, 0.77f, 1.0f})));
        this.method_45988(class008912, class050622);
        this.method_45988(class008913, class050622);
    }

    public class05062 method_46008(class00891 class008912, class04111<?> class041112) {
        return class02015.method_45991(class008912, this.method_60392(), class041112);
    }

    public class05062 method_45981(class00891 class008912, class06581 class065812) {
        class01921 class019212 = this.field_51845.y(class04227.yR);
        return this.method_45989(class008912, (class04111)this.method_45977((class07310)class008912, (class08967)class03798.N((class07310)class065812).N((class08137)class02349.N((class03556)class019212.y(class07314.l)))));
    }

    public <T extends class07297<T>> T method_45978(class07310 class073102, class07297<T> class072972) {
        if (!this.field_40608.contains(class073102.B())) {
            return (T)class072972.y(class00788.L());
        }
        return (T)class072972.M();
    }

    public class05062 method_65261(class00891 class008912) {
        return class05074.y().N(class05441.N().N((class04111)this.method_45977((class07310)class008912, (class08967)((class03366)class03798.N((class07310)class008912).N((Object[])class07211.values(), class072112 -> class07621.N((class06378)class04711.N((float)1.0f), (boolean)true).y((class05952)class00851.N((class00891)class008912).N(class01408.N().N((class08092)class05543.y((class07211)class072112), true))))).N((class08137)class07621.N((class06378)class04711.N((float)-1.0f), (boolean)true)))));
    }

    public class05062 method_46010(class00891 class008912) {
        class01921 class019212 = this.field_51845.y(class04227.yR);
        return this.method_45989(class008912, (class04111)this.method_45977((class07310)class008912, (class08967)class03798.N((class07310)class06570.TB).N((class08137)class07621.N((class06378)class06345.N((float)2.0f, (float)5.0f))).N((class08137)class02349.N((class03556)class019212.y(class07314.l)))));
    }

    public class05062 method_46015(class00891 class008912) {
        return class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)((class03366)class03798.N((class07310)class008912).y(this.method_60390())).N((class08137)class02683.y((class07491)class06551.z).N(class02484.Nd)).N((class08137)class05501.N((class00891)class008912).N((class08092)class04593.L)).N((class04111)class03798.N((class07310)class008912))));
    }

    public class05062 method_46001(class00891 class008912, class04111<?> class041112) {
        return class02015.method_45991(class008912, this.method_62727(), class041112);
    }

    public class05062 method_45996(class00891 class008912) {
        return class05074.y().N((class05457)this.method_45978((class07310)class008912, (class07297)class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class008912).N((class08137)class02683.y((class07491)class06551.z).N(class02484.B)))));
    }

    public class05062 method_46020(class00891 class008912) {
        return class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)this.method_45977((class07310)class008912, class03798.N((class07310)class008912).N(List.of(Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4)), n -> class07621.N((class06378)class04711.N((float)n.intValue())).y((class05952)class00851.N((class00891)class008912).N(class01408.N().N((class08092)class05440.R, n.intValue())))))));
    }

    public static class05062 method_45991(class00891 class008912, class05952 class059522, class04111<?> class041112) {
        return class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)((class03366)class03798.N((class07310)class008912).y(class059522)).N(class041112)));
    }

    public class05062 method_46022(class00891 class008912) {
        return this.method_45987(class008912, (class08092)class07196.L, (Comparable<T> & class05033)class08059.field_12607);
    }

    public class05062 method_45980(class00891 class008912) {
        return class05074.y().N(class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)this.method_45977((class07310)class008912, (class08967)class03798.N((class07310)class008912).N((class08137)class07621.N((class06378)class04711.N((float)2.0f)).y((class05952)class00851.N((class00891)class008912).N(class01408.N().N((class08092)class07007.y, (Comparable)class08054.field_12682)))))));
    }

    public class05062 method_64930(class00891 class008912) {
        return class05074.y().N(class05441.N().N((class04111)this.method_45977((class07310)class008912, (class08967)class03798.N((class07310)class008912).y((class05952)class00851.N((class00891)class008912).N(class01408.N().N((class08092)class00318.y, true))))));
    }

    public final class05062 method_46009(class07310 class073102) {
        return class05074.y().N((class05457)this.method_45978((class07310)class00869.MJ, (class07297)class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class00869.MJ)))).N((class05457)this.method_45978(class073102, (class07297)class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class073102))));
    }

    public final class05952 method_60392() {
        return this.method_62727().y(this.method_60390());
    }

    public final class05952 method_60393() {
        return this.method_60392().y();
    }

    public class05062 method_45983(class00891 class008912, class07310 class073102) {
        return this.method_45989(class008912, (class04111)this.method_45978((class07310)class008912, (class07297)class03798.N((class07310)class073102)));
    }

    public class05952 method_60390() {
        return class07795.N((class00837)class00837.N().N(class00159.N().N(class02482.y, (class02500)class02474.N(List.of(new class00800((class03556)this.field_51845.y(class04227.yR).y(class07314.t), class00836.y((int)1))))).y()));
    }

    public class05062 method_45984(class00891 class008912, class07310 class073102, class06378 class063782) {
        return this.method_45989(class008912, (class04111)this.method_45977((class07310)class008912, (class08967)class03798.N((class07310)class073102).N((class08137)class07621.N((class06378)class063782))));
    }

    public class05062 method_74433(class00891 class008912) {
        return class05074.y().N((class05457)this.method_45978((class07310)class008912, (class07297)class05441.N().N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class008912).N((class08137)class02683.y((class07491)class06551.z).N(class02484.B)).N((class08137)class05501.N((class00891)class008912).N((class08092)class08981.L)))));
    }

    public final class05062 method_46003(class07310 class073102) {
        return class05074.y().N(class05441.N().y(this.method_60390()).N((class06378)class04711.N((float)1.0f)).N((class04111)class03798.N((class07310)class073102)));
    }

    public /* synthetic */ class01929 getRegistries() {
        return this.field_51845;
    }

    @Override
    public void method_10399(BiConsumer<class05946<class05074>, class05062> biConsumer) {
        this.method_10379();
        HashSet hashSet = new HashSet();
        for (class00891 class008912 : class04206.i) {
            if (!class008912.N(this.field_40609)) continue;
            class008912.d().ifPresent(class059462 -> {
                if (hashSet.add(class059462)) {
                    class05062 class050622 = this.field_40610.remove(class059462);
                    if (class050622 == null) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", class059462.N(), class04206.i.y((Object)class008912)));
                    }
                    biConsumer.accept((class05946<class05074>)class059462, class050622);
                }
            });
        }
        if (!this.field_40610.isEmpty()) {
            throw new IllegalStateException("Created block loot tables for non-blocks: " + String.valueOf(this.field_40610.keySet()));
        }
    }
}

