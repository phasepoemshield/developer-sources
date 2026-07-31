/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1661
 *  net.minecraft.class_1792
 *  net.minecraft.class_1796
 *  net.minecraft.class_1799
 *  net.minecraft.class_1935
 *  net.minecraft.class_2960
 *  net.minecraft.class_746
 *  net.minecraft.class_7923
 */
package kotakbaz.rain.module.modules.hud;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.mixin.ItemCooldownEntryAccessor;
import kotakbaz.rain.mixin.ItemCooldownManagerAccessor;
import kotakbaz.rain.module.modules.hud.B;
import kotakbaz.rain.module.modules.hud.container.C;
import kotakbaz.rain.module.modules.hud.container.HudModule;
import kotakbaz.rain.module.modules.hud.container.b;
import kotakbaz.rain.module.modules.hud.container.b_0;
import kotakbaz.rain.module.modules.hud.container.d;
import kotakbaz.rain.module.modules.hud.container.d_0;
import kotakbaz.rain.module.modules.hud.container.e;
import kotakbaz.rain.module.modules.hud.h_0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1796;
import net.minecraft.class_1799;
import net.minecraft.class_1935;
import net.minecraft.class_2960;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0014\u00a2\u0006\u0004\b\f\u0010\rJ)\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u00a8\u0006 "}, d2={"Lkotakbaz/rain/module/modules/hud/CooldownsHudModule;", "Lkotakbaz/rain/module/modules/hud/container/HudModule;", "<init>", "()V", "Lkotakbaz/rain/event/events/OverlayRenderEvent;", "event", "", "onOverlayRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "", "Lkotakbaz/rain/module/modules/hud/container/Data$First;", "Lkotakbaz/rain/module/modules/hud/container/Data$Second;", "getCurrentData", "()Ljava/util/Map;", "Lnet/minecraft/class_746;", "player", "Lnet/minecraft/class_1796;", "cooldownManager", "Lnet/minecraft/class_2960;", "groupId", "Lnet/minecraft/class_1799;", "resolveCooldownStack", "(Lnet/minecraft/class_746;Lnet/minecraft/class_1796;Lnet/minecraft/class_2960;)Lnet/minecraft/class_1799;", "", "remainingTicks", "", "formatDuration", "(I)Ljava/lang/String;", "Ljava/util/LinkedHashMap;", "map", "Ljava/util/LinkedHashMap;", "CooldownEntry", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nCooldownsHudModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CooldownsHudModule.kt\nkotakbaz/rain/module/modules/hud/CooldownsHudModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1642#2,10:114\n1915#2:124\n1916#2:126\n1652#2:127\n1080#2:128\n1#3:125\n*S KotlinDebug\n*F\n+ 1 CooldownsHudModule.kt\nkotakbaz/rain/module/modules/hud/CooldownsHudModule\n*L\n42#1:114,10\n42#1:124\n42#1:126\n42#1:127\n50#1:128\n42#1:125\n*E\n"})
public final class A
extends HudModule {
    @NotNull
    public static final A INSTANCE;
    @NotNull
    private static final LinkedHashMap<b_0, d_0> map;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    private A() {
        int n = C[0];
        n -= C[1];
        n -= C[2];
        int n2 = C[3];
        n2 ^= C[4];
        int n3 = C[6];
        n3 ^= C[7];
        int n4 = C[9];
        n4 -= C[10];
        super((String)a[n], (String)a[n2 -= C[5]] + (String)a[n3 += C[8]], 200.0f, 200.0f, (String)a[n4 ^= C[11]]);
    }

    @Commando
    public final void onOverlayRender(@NotNull kotakbaz.rain.event.events.C c2) {
        int n = C[12];
        n -= C[13];
        Intrinsics.checkNotNullParameter(c2, (String)a[n += C[14]]);
        this.renderContainer(c2);
    }

    @Override
    @NotNull
    protected Map<b_0, d_0> getCurrentData() {
        long l = -2285139333150529286L;
        long l2 = 4981732591121973480L;
        long l3 = 5516555168313210671L;
        long l4 = 4937680586702289057L;
        long l5 = 1751600689145612491L;
        long l6 = 980476332884102665L;
        map.clear();
        class_746 class_7462 = kotakbaz.rain.client.extensions.b_0.getMc().field_1724;
        if (class_7462 == null) {
            return map;
        }
        class_746 class_7463 = class_7462;
        class_1796 class_17962 = class_7463.method_7357();
        int n = C[15];
        n -= C[16];
        int n2 = C[18];
        n2 += C[19];
        Intrinsics.checkNotNull(class_17962, (String)a[n += C[17]] + (String)a[n2 ^= C[20]]);
        ItemCooldownManagerAccessor itemCooldownManagerAccessor = (ItemCooldownManagerAccessor)class_17962;
        int n3 = C[21];
        n3 -= C[22];
        long l7 = l4;
        int n4 = C[24];
        n4 ^= C[25];
        l4 = l7 ^ ((long)itemCooldownManagerAccessor.rain$getTick() << (n3 -= C[23]) ^ l7) & -1L << (n4 += C[26]);
        Object object = itemCooldownManagerAccessor.rain$getEntries().entrySet();
        long l8 = l4;
        int n5 = C[27];
        n5 ^= C[28];
        l4 = l8 ^ (0L ^ l8) & -1L >>> (n5 ^= C[29]);
        Object object2 = object;
        Object object3 = new ArrayList();
        long l9 = l5;
        int n6 = C[30];
        n6 -= C[31];
        l5 = l9 ^ (0L ^ l9) & -1L << (n6 ^= C[32]);
        Iterable iterable = object2;
        long l10 = l5;
        int n7 = C[33];
        n7 ^= C[34];
        l5 = l10 ^ (0L ^ l10) & -1L >>> (n7 += C[35]);
        Iterator iterator2 = iterable.iterator();
        while (iterator2.hasNext()) {
            B b2;
            Object t2;
            Object t3 = t2 = iterator2.next();
            long l11 = l6;
            int n8 = C[36];
            n8 += C[37];
            l6 = l11 ^ (0L ^ l11) & -1L << (n8 += C[38]);
            Map.Entry entry = (Map.Entry)t3;
            long l12 = l6;
            int n9 = C[39];
            n9 += C[40];
            l6 = l12 ^ (0L ^ l12) & -1L >>> (n9 -= C[41]);
            class_2960 class_29602 = (class_2960)entry.getKey();
            Object v2 = entry.getValue();
            if ((v2 instanceof ItemCooldownEntryAccessor ? (ItemCooldownEntryAccessor)v2 : null) == null) {
                b2 = null;
            } else {
                ItemCooldownEntryAccessor itemCooldownEntryAccessor;
                itemCooldownEntryAccessor = itemCooldownEntryAccessor;
                int n10 = C[42];
                n10 += C[43];
                n10 -= C[44];
                int n11 = C[45];
                n11 ^= C[46];
                long l13 = l2;
                int n12 = C[48];
                n12 += C[49];
                l2 = l13 ^ ((long)(itemCooldownEntryAccessor.rain$getEndTick() - (int)(l4 >>> n10)) << (n11 ^= C[47]) ^ l13) & -1L << (n12 += C[50]);
                int n13 = C[51];
                n13 += C[52];
                if ((int)(l2 >>> (n13 ^= C[53])) <= 0) {
                    b2 = null;
                } else {
                    Intrinsics.checkNotNull(class_29602);
                    if (INSTANCE.resolveCooldownStack(class_7463, class_17962, class_29602) == null) {
                        b2 = null;
                    } else {
                        class_1799 class_17992;
                        class_1799 class_17993 = class_17992.method_7972();
                        int n14 = C[54];
                        n14 -= C[55];
                        Intrinsics.checkNotNullExpressionValue(class_17993, (String)a[n14 -= C[56]]);
                        int n15 = C[57];
                        n15 ^= C[58];
                        b2 = new B(class_17993, (int)(l2 >>> (n15 ^= C[59])));
                    }
                }
            }
            if (b2 == null) continue;
            B b3 = b2;
            long l14 = l3;
            int n16 = C[60];
            n16 ^= C[61];
            l3 = l14 ^ (0L ^ l14) & -1L << (n16 ^= C[62]);
            object3.add(b3);
        }
        object = (List)object3;
        long l15 = l4;
        int n17 = C[63];
        n17 -= C[64];
        l4 = l15 ^ (0L ^ l15) & -1L >>> (n17 -= C[65]);
        List<B> list = CollectionsKt.sortedWith(object, new h_0());
        for (B b4 : list) {
            object2 = map;
            String string = b4.getStack().method_7964().getString();
            int n18 = C[66];
            n18 += C[67];
            Intrinsics.checkNotNullExpressionValue(string, (String)a[n18 += C[68]]);
            object3 = new b(string, new C(b4.getStack()));
            d d2 = new d(this.formatDuration(b4.getRemainingTicks()), e.INSTANCE.getVALUE_COLOR());
            object2.put(object3, d2);
        }
        return map;
    }

    private final class_1799 resolveCooldownStack(class_746 class_7462, class_1796 class_17962, class_2960 class_29602) {
        class_1799 class_17992;
        long l = 7050284763102173557L;
        long l2 = -4090975087716054234L;
        long l3 = -7614150223294891355L;
        class_1661 class_16612 = class_7462.method_31548();
        long l4 = l3;
        int n = C[69];
        n ^= C[70];
        l3 = l4 ^ (0L ^ l4) & -1L << (n -= C[71]);
        long l5 = l2;
        int n2 = C[72];
        n2 += C[73];
        l2 = l5 ^ ((long)class_16612.method_5439() ^ l5) & -1L >>> (n2 -= C[74]);
        while (true) {
            int n3 = C[75];
            n3 -= C[76];
            if ((int)(l3 >>> (n3 -= C[77])) >= (int)l2) break;
            int n4 = C[78];
            n4 ^= C[79];
            class_17992 = class_16612.method_5438((int)(l3 >>> (n4 += C[80])));
            if (!class_17992.method_7960() && Intrinsics.areEqual(class_17962.method_62836(class_17992), class_29602)) {
                return class_17992;
            }
            l3 += 0x100000000L;
        }
        class_1799 class_17993 = class_7462.method_6047();
        if (!class_17993.method_7960() && Intrinsics.areEqual(class_17962.method_62836(class_17993), class_29602)) {
            return class_17993;
        }
        class_1799 class_17994 = class_7462.method_6079();
        if (!class_17994.method_7960() && Intrinsics.areEqual(class_17962.method_62836(class_17994), class_29602)) {
            return class_17994;
        }
        Object object = class_7923.field_41178.method_63535(class_29602);
        int n5 = C[81];
        n5 += C[82];
        Intrinsics.checkNotNullExpressionValue(object, (String)a[n5 ^= C[83]]);
        class_17992 = (class_1792)object;
        return Intrinsics.areEqual(class_7923.field_41178.method_10221((Object)class_17992), class_29602) ? new class_1799((class_1935)class_17992) : null;
    }

    private final String formatDuration(int n) {
        String string;
        long l = 6019656638922359934L;
        long l2 = -6328076395138786986L;
        long l3 = -8950349609589295122L;
        long l4 = 7958796999738206969L;
        long l5 = 9030019031170598073L;
        long l6 = -220485003855645267L;
        float f2 = (float)n / 20.0f;
        if (f2 < 10.0f) {
            int n2 = C[84];
            n2 ^= C[85];
            String string2 = (String)a[n2 ^= C[86]];
            int n3 = C[87];
            n3 ^= C[88];
            Object[] objectArray = new Object[n3 -= C[89]];
            int n4 = C[90];
            n4 ^= C[91];
            objectArray[n4 += kotakbaz.rain.module.modules.hud.A.C[92]] = Float.valueOf(f2);
            String string3 = String.format(string2, Arrays.copyOf(objectArray, objectArray.length));
            int n5 = C[93];
            n5 += C[94];
            Intrinsics.checkNotNullExpressionValue(string3, (String)a[n5 ^= C[95]]);
            return string3;
        }
        long l7 = l4;
        int n6 = C[96];
        n6 += C[97];
        l4 = l7 ^ ((long)((int)Math.ceil(f2)) ^ l7) & -1L >>> (n6 ^= C[98]);
        int n7 = C[99];
        n7 ^= C[100];
        n7 -= C[101];
        int n8 = C[102];
        n8 += C[103];
        long l8 = l6;
        int n9 = C[105];
        n9 -= C[106];
        l6 = l8 ^ ((long)((int)l4 / n7) << (n8 ^= C[104]) ^ l8) & -1L << (n9 ^= C[107]);
        int n10 = C[108];
        n10 ^= C[109];
        long l9 = l6;
        int n11 = C[111];
        n11 += C[112];
        l6 = l9 ^ ((long)((int)l4 % (n10 += C[110])) ^ l9) & -1L >>> (n11 -= C[113]);
        int n12 = C[114];
        n12 -= C[115];
        if ((int)(l6 >>> (n12 -= C[116])) > 0) {
            int n13 = C[117];
            n13 += C[118];
            String string4 = (String)a[n13 += C[119]];
            int n14 = C[120];
            n14 += C[121];
            Object[] objectArray = new Object[n14 += C[122]];
            int n15 = C[123];
            n15 += C[124];
            int n16 = C[126];
            n16 ^= C[127];
            objectArray[n15 += kotakbaz.rain.module.modules.hud.A.C[125]] = (int)(l6 >>> (n16 += C[128]));
            int n17 = C[129];
            n17 -= C[130];
            objectArray[n17 ^= kotakbaz.rain.module.modules.hud.A.C[131]] = (int)l6;
            String string5 = String.format(string4, Arrays.copyOf(objectArray, objectArray.length));
            string = string5;
            int n18 = C[132];
            n18 -= C[133];
            Intrinsics.checkNotNullExpressionValue(string5, (String)a[n18 += C[134]]);
        } else {
            int n19 = C[135];
            n19 -= C[136];
            long l10 = l2;
            int n20 = C[138];
            n20 ^= C[139];
            l2 = l10 ^ ((long)((int)l4) << (n19 ^= C[137]) ^ l10) & -1L << (n20 += C[140]);
            int n21 = C[141];
            n21 ^= C[142];
            int n22 = C[144];
            n22 -= C[145];
            string = (int)(l2 >>> (n21 ^= C[143])) + (String)a[n22 ^= C[146]];
        }
        return string;
    }

    static {
        kotakbaz.rain.module.modules.hud.A.b();
        long l = -8298037321617207069L;
        long l2 = -5807904555986622547L;
        long l3 = -8236157854122364992L;
        long l4 = -2278095941738925559L;
        long l5 = 2887659504471858631L;
        long l6 = -9117222236968854887L;
        long l7 = -6814028029167213141L;
        long l8 = 3984148521723443502L;
        long l9 = 1715243706960429740L;
        long l10 = 3197033599900947465L;
        long l11 = 8151688458521777193L;
        long l12 = 8813545804397580176L;
        long l13 = 6811597029843678842L;
        long l14 = 983327630554981694L;
        int n = C[147];
        n -= C[148];
        a = new Object[n -= C[149]];
        long l15 = l14;
        int n2 = C[150];
        n2 += C[151];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= C[152]);
        Object[] objectArray = new Object[C[153]];
        objectArray[kotakbaz.rain.module.modules.hud.A.C[154]] = A;
        objectArray[kotakbaz.rain.module.modules.hud.A.C[155]] = C[156];
        int n3 = C[157];
        Object object = kotakbaz.rain.module.modules.hud.A.A()[C[158]];
        if (object == null) {
            char[] cArray = "\u559c\u559b\u5597\u583b\u5843\u5859\u582d\u559c\u559c\u5859\u583d\u5820\u558d\u5858\u56ac\u5844\u5841\u5583\u581f\u5843\u5597\u5841\u5592\u5823\u5859\u585a\u5844\u582d\u5597\u5849\u5820\u5831\u5592\u583f\u584c\u5590\u584d\u5583\u581f\u5599\u582f\u5834\u5583\u5851\u5858\u5844\u5836\u581e\u5836\u584f\u585c\u5841\u558e\u585c\u5854\u585b\u56ac\u5597\u5591\u582b\u581f\u5830\u5838\u559b\u5831\u5591\u583d\u5855\u5822\u585a\u5837\u5850\u5838\u582b\u5583\u585a\u584b\u5843\u5838\u583a\u585c\u581d\u584f\u5858\u5834\u558d\u5850\u5824\u5822\u5835\u5841\u582f\u5836\u559b\u5599\u559b\u5597\u584e\u5840\u582d\u584f\u584f\u583e\u585b\u5591\u5820\u5850\u56ac\u5599\u5834\u5821\u5856\u5840\u5842\u558f\u584f\u5842\u5823\u5844\u5821\u56a9\u56ac\u584f\u585c\u5822\u5844\u5592\u5583\u583d\u581d\u5834\u583b\u583e\u5838\u5832\u5843\u5852\u581d\u585c\u583f\u5857\u582e\u5821\u583f\u5859\u581f\u5823\u5821\u5599\u5854\u5856\u5820\u584b\u5822\u558d\u581f\u584f\u583d\u5850\u5844\u5858\u583b\u582d\u582f\u5859\u584d\u5858\u5841\u5840\u5851\u581d\u583e\u582f\u5835\u5592\u558e\u584d\u5830\u5590\u5834\u5832\u56ac\u5840\u5854\u5855\u5840\u583b\u5851\u5821\u585c\u5822\u56ac\u585c\u5854\u582b\u5597\u581e\u5851\u5855\u5843\u5840\u5855\u5820\u5851\u558d\u5823\u5854\u5838\u5820\u581d\u5850\u5857\u5841\u5834\u558d\u5857\u5824\u581f\u584d\u5831\u559a\u583d\u5850\u558f\u5855\u5832\u582f\u5854\u558f\u559b\u581e\u56a9\u585c\u5849\u585c\u559c\u583e\u5856\u584d\u5851\u5597\u5599\u5858\u5821\u583e\u584b\u5590\u581d\u583e\u5583\u559c\u5850\u5592\u584f\u5591\u584b\u5856\u5831\u5824\u583d\u5831\u581e\u5851\u5842\u5831\u585b\u584c\u5849\u5851\u5839\u5835\u5835\u5824\u5592\u583f\u5841\u5835\u5832\u5597\u5824\u584c\u5840\u585c\u5597\u559c\u582e\u585c\u558e\u559b\u583c\u5842\u5835\u582f\u582d\u5855\u5841\u581e\u5850\u5823\u583e\u582e\u5857\u5590\u5821\u559a\u5839\u5591\u5857\u583a\u5583\u5849\u5850\u5831\u583b\u584b\u5852\u5839\u5831\u559a\u5841\u581f\u581f\u5832\u5858\u559b\u5597\u5851\u584b\u585a\u583f\u585b\u5822\u5583\u582d\u5834\u584f\u5844\u5831\u559c\u5831\u585b\u558e\u559a\u584c\u584e\u56ac\u5852\u5856\u5843\u581d\u5835\u584b\u5583\u582f\u583f\u5842\u558e\u5843\u5599\u5599\u5824\u5851\u583d\u585c\u581d\u5857\u5592\u585b\u5850\u585b\u5859\u5820\u558d\u584f\u5852\u5857\u5839\u583f\u582d\u558e\u583e\u5859\u5841\u5823".toCharArray();
            for (int i2 = C[159]; i2 < C[160]; ++i2) {
                int n4 = cArray[i2];
                n4 += C[161];
                n4 -= C[162];
                n4 -= C[163];
                n4 += C[164];
                n4 ^= C[165];
                n4 += C[166];
                n4 += C[167];
                n4 -= C[168];
                n4 ^= C[169];
                n4 ^= C[170];
                n4 += C[171];
                cArray[i2] = (char)(n4 ^= C[172]);
            }
            object = kotakbaz.rain.module.modules.hud.A.A()[kotakbaz.rain.module.modules.hud.A.C[173]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.module.modules.hud.A.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = C[174];
        n5 ^= C[175];
        l5 = l16 ^ (0xE400000000L ^ l16) & -1L << (n5 ^= C[176]);
        long l17 = l12;
        int n6 = C[177];
        n6 ^= C[178];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += C[179]);
        while (true) {
            int n7 = C[180];
            n7 -= C[181];
            if ((int)l12 >= (int)(l5 >>> (n7 += C[182]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = C[183];
            n9 ^= C[184];
            int n10 = C[186];
            n10 ^= C[187];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= C[185])) & -1L >>> (n10 += C[188]);
            long l19 = l8;
            int n11 = C[189];
            n11 += C[190];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= C[191]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = C[192];
            n13 += C[193];
            int n14 = C[195];
            n14 -= C[196];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= C[194])) & -1L >>> (n14 -= C[197]);
            int n15 = C[198];
            n15 += C[199];
            long l21 = l9;
            int n16 = C[201];
            n16 -= C[202];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= C[200]) ^ l21) & -1L << (n16 += C[203]);
            int n17 = C[204];
            n17 += C[205];
            n17 ^= C[206];
            int n18 = C[207];
            n18 += C[208];
            long l22 = l11;
            int n19 = C[210];
            n19 -= C[211];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += C[209]))) ^ l22) & -1L >>> (n19 -= C[212]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = C[213];
            n20 ^= C[214];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += C[215]);
            while (true) {
                int n21 = C[216];
                n21 -= C[217];
                if ((int)(l13 >>> (n21 ^= C[218])) >= (int)l11) break;
                int n22 = C[219];
                n22 += C[220];
                int n23 = C[222];
                n23 += C[223];
                cArray2[(int)(l13 >>> (n22 ^= kotakbaz.rain.module.modules.hud.A.C[221]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= C[224]))];
                l13 += 0x100000000L;
            }
            int n24 = C[225];
            n24 ^= C[226];
            int n25 = (int)(l14 >>> (n24 += C[227]));
            l14 += 0x100000000L;
            kotakbaz.rain.module.modules.hud.A.a[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = C[228];
            n26 ^= C[229];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= C[230]);
        }
        INSTANCE = new A();
        map = new LinkedHashMap();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[C[231]];
        String string = (String)object[C[232]];
        object = object[C[233]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[234]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[235]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[237] ^ C[238]];
                byArray[kotakbaz.rain.module.modules.hud.A.C[239] ^ kotakbaz.rain.module.modules.hud.A.C[240]] = C[241] ^ C[242];
                byArray[kotakbaz.rain.module.modules.hud.A.C[243] ^ kotakbaz.rain.module.modules.hud.A.C[244]] = C[245] ^ C[246];
                byArray[kotakbaz.rain.module.modules.hud.A.C[247] ^ kotakbaz.rain.module.modules.hud.A.C[248]] = C[249] ^ C[250];
                byArray[kotakbaz.rain.module.modules.hud.A.C[251] ^ kotakbaz.rain.module.modules.hud.A.C[252]] = C[253] ^ C[254];
                byArray[kotakbaz.rain.module.modules.hud.A.C[255] ^ kotakbaz.rain.module.modules.hud.A.C[256]] = C[257] ^ C[258];
                byArray[kotakbaz.rain.module.modules.hud.A.C[259] ^ kotakbaz.rain.module.modules.hud.A.C[260]] = C[261] ^ C[262];
                byArray[kotakbaz.rain.module.modules.hud.A.C[263] ^ kotakbaz.rain.module.modules.hud.A.C[264]] = C[265] ^ C[266];
                byArray[kotakbaz.rain.module.modules.hud.A.C[267] ^ kotakbaz.rain.module.modules.hud.A.C[268]] = C[269] ^ C[270];
                byArray[kotakbaz.rain.module.modules.hud.A.C[271] ^ kotakbaz.rain.module.modules.hud.A.C[272]] = C[273] ^ C[274];
                byArray[kotakbaz.rain.module.modules.hud.A.C[275] ^ kotakbaz.rain.module.modules.hud.A.C[276]] = C[277] ^ C[278];
                byArray[kotakbaz.rain.module.modules.hud.A.C[279] ^ kotakbaz.rain.module.modules.hud.A.C[280]] = C[281] ^ C[282];
                byArray[kotakbaz.rain.module.modules.hud.A.C[283] ^ kotakbaz.rain.module.modules.hud.A.C[284]] = C[285] ^ C[286];
                byArray[kotakbaz.rain.module.modules.hud.A.C[287] ^ kotakbaz.rain.module.modules.hud.A.C[288]] = C[289] ^ C[290];
                byArray[kotakbaz.rain.module.modules.hud.A.C[291] ^ kotakbaz.rain.module.modules.hud.A.C[292]] = C[293] ^ C[294];
                byArray[kotakbaz.rain.module.modules.hud.A.C[295] ^ kotakbaz.rain.module.modules.hud.A.C[296]] = C[297] ^ C[298];
                byArray[kotakbaz.rain.module.modules.hud.A.C[299] ^ kotakbaz.rain.module.modules.hud.A.C[300]] = C[301] ^ C[302];
                objectArray2[kotakbaz.rain.module.modules.hud.A.C[236]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[303]];
            if (b == null) {
                byte[] byArray2 = new byte[C[304] ^ C[305]];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[306] ^ kotakbaz.rain.module.modules.hud.A.C[307]] = C[308] ^ C[309];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[310] ^ kotakbaz.rain.module.modules.hud.A.C[311]] = C[312] ^ C[313];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[314] ^ kotakbaz.rain.module.modules.hud.A.C[315]] = C[316] ^ C[317];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[318] ^ kotakbaz.rain.module.modules.hud.A.C[319]] = C[320] ^ C[321];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[322] ^ kotakbaz.rain.module.modules.hud.A.C[323]] = C[324] ^ C[325];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[326] ^ kotakbaz.rain.module.modules.hud.A.C[327]] = C[328] ^ C[329];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[330] ^ kotakbaz.rain.module.modules.hud.A.C[331]] = C[332] ^ C[333];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[334] ^ kotakbaz.rain.module.modules.hud.A.C[335]] = C[336] ^ C[337];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[338] ^ kotakbaz.rain.module.modules.hud.A.C[339]] = C[340] ^ C[341];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[342] ^ kotakbaz.rain.module.modules.hud.A.C[343]] = C[344] ^ C[345];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[346] ^ kotakbaz.rain.module.modules.hud.A.C[347]] = C[348] ^ C[349];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[350] ^ kotakbaz.rain.module.modules.hud.A.C[351]] = C[352] ^ C[353];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[354] ^ kotakbaz.rain.module.modules.hud.A.C[355]] = C[356] ^ C[357];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[358] ^ kotakbaz.rain.module.modules.hud.A.C[359]] = C[360] ^ C[361];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[362] ^ kotakbaz.rain.module.modules.hud.A.C[363]] = C[364] ^ C[365];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[366] ^ kotakbaz.rain.module.modules.hud.A.C[367]] = C[368] ^ C[369];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[370] ^ kotakbaz.rain.module.modules.hud.A.C[371]] = C[372] ^ C[373];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[374] ^ kotakbaz.rain.module.modules.hud.A.C[375]] = C[376] ^ C[377];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[378] ^ kotakbaz.rain.module.modules.hud.A.C[379]] = C[380] ^ C[381];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[382] ^ kotakbaz.rain.module.modules.hud.A.C[383]] = C[384] ^ C[385];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[386] ^ kotakbaz.rain.module.modules.hud.A.C[387]] = C[388] ^ C[389];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[390] ^ kotakbaz.rain.module.modules.hud.A.C[391]] = C[392] ^ C[393];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[394] ^ kotakbaz.rain.module.modules.hud.A.C[395]] = C[396] ^ C[397];
                byArray2[kotakbaz.rain.module.modules.hud.A.C[398] ^ kotakbaz.rain.module.modules.hud.A.C[399]] = 0xD7BE ^ 0xD789;
                byArray2[0x38FB ^ 0x38EE] = 0x38F5 ^ 0x38EE;
                byArray2[0xC7DC ^ 0xC7D3] = 0xFFFF3801 ^ 0xC7D3;
                byArray2[0x3F9 ^ 0x3EB] = 0xFFFFFC6E ^ 0x3EB;
                byArray2[0x4A65 ^ 0x4A6F] = 0x4A08 ^ 0x4A6F;
                byArray2[0xC08B ^ 0xC093] = 0xC0CF ^ 0xC093;
                byArray2[0x3A18 ^ 0x3A05] = 0xFFFFC5AF ^ 0x3A05;
                byArray2[0xCE54 ^ 0xCE43] = 0xFFFF31ED ^ 0xCE43;
                byArray2[0x8711 ^ 0x8715] = 0xFFFF7891 ^ 0x8715;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.module.modules.hud.A.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u56ac\u56a6\u56d7\u56e0\u56da\u5d16\u56a3\u5cf5\u56d0\u5cf4\u56d4\u5cf9\u5cfd\u5cff\u56af\u56d4\u56dd\u5d0d".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 += 1424;
                        n2 += 20353;
                        n2 -= 37313;
                        n2 -= 59698;
                        n2 ^= 0x64E4;
                        n2 += 60149;
                        n2 -= 23590;
                        n2 ^= 0xB9;
                        n2 ^= 0x3C19;
                        n2 ^= 0xA68C;
                        cArray[i2] = (char)(n2 += 34687);
                    }
                    object4 = kotakbaz.rain.module.modules.hud.A.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[4] = -3;
                byArray4[14] = 102;
                byArray4[7] = 3;
                byArray4[8] = 92;
                byArray4[15] = -82;
                byArray4[2] = 88;
                byArray4[9] = -1;
                byArray4[12] = 42;
                byArray4[5] = -29;
                byArray4[0] = 22;
                byArray4[1] = -7;
                byArray4[13] = 119;
                byArray4[3] = 65;
                byArray4[6] = -37;
                byArray4[11] = 113;
                byArray4[10] = 41;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 14, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.module.modules.hud.A.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ua100\ua11c\ua11a".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 += 2817;
                        n3 ^= 0xE6A2;
                        n3 -= 49956;
                        n3 += 31430;
                        n3 += 29321;
                        n3 -= 63117;
                        n3 ^= 0xC2CD;
                        n3 ^= 0x4D11;
                        n3 -= 24018;
                        n3 += 30547;
                        n3 ^= 0xD2B3;
                        n3 += 60697;
                        cArray[i3] = (char)(n3 += 14715);
                    }
                    object5 = kotakbaz.rain.module.modules.hud.A.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.module.modules.hud.A.A()[3];
            if (object6 == null) {
                char[] cArray = "\ua8cb\ua87f\ua87d\ua889\ua8cd\ua8ce\ua8cd\ua889\ua8dc\ua875\ua8cd\ua87d\ua88f\ua8dc\ua86b\ua870\ua870\ua913\ua8ca\ua921".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 -= 28579;
                    n4 ^= 0xC028;
                    n4 -= 48108;
                    n4 += 5260;
                    n4 ^= 0xEA4E;
                    n4 += 16625;
                    n4 ^= 0x391;
                    n4 -= 43732;
                    n4 -= 50392;
                    n4 ^= 0x9479;
                    n4 += 442;
                    n4 += 12314;
                    n4 -= 36570;
                    n4 -= 59547;
                    n4 -= 7132;
                    cArray[i4] = (char)(n4 ^= 0xBA1F);
                }
                object6 = kotakbaz.rain.module.modules.hud.A.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)b), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = c;
        if (c == null) {
            c = new Object[4];
            objectArray = c;
        }
        return objectArray;
    }

    public static void b() {
        C = new int[0x1A4E ^ 0x1BDE];
        kotakbaz.rain.module.modules.hud.A.C[0xB86D ^ 0xB88B] = 0xFFFF470A ^ 0xB88B;
        kotakbaz.rain.module.modules.hud.A.C[0x1EB4 ^ 0x1FFA] = 0x8990 ^ 0x1FFA;
        kotakbaz.rain.module.modules.hud.A.C[0x6D9 ^ 0x61C] = 0x605 ^ 0x61C;
        kotakbaz.rain.module.modules.hud.A.C[0xB237 ^ 0xB36D] = 0x8D2B ^ 0xB36D;
        kotakbaz.rain.module.modules.hud.A.C[0xDB84 ^ 0xDBED] = 0xDBA3 ^ 0xDBED;
        kotakbaz.rain.module.modules.hud.A.C[0x3FD8 ^ 0x3F69] = 0xFFFFC078 ^ 0x3F69;
        kotakbaz.rain.module.modules.hud.A.C[0xC078 ^ 0xC0A2] = 0xFFFF3F40 ^ 0xC0A2;
        kotakbaz.rain.module.modules.hud.A.C[0x10D98 ^ 0x10D00] = 0xFFFEF2A8 ^ 0x10D00;
        kotakbaz.rain.module.modules.hud.A.C[0x79CA ^ 0x790B] = 0xFFFF86E2 ^ 0x790B;
        kotakbaz.rain.module.modules.hud.A.C[0xDBDB ^ 0xDBB3] = 0xDB99 ^ 0xDBB3;
        kotakbaz.rain.module.modules.hud.A.C[0xF6EA ^ 0xF649] = 0x5CDB ^ 0xF649;
        kotakbaz.rain.module.modules.hud.A.C[0xB899 ^ 0xB9F1] = 0xB900 ^ 0xB9F1;
        kotakbaz.rain.module.modules.hud.A.C[0x109D4 ^ 0x108DC] = 0x1DC1B ^ 0x108DC;
        kotakbaz.rain.module.modules.hud.A.C[0x54A2 ^ 0x54C6] = 0x54CA ^ 0x54C6;
        kotakbaz.rain.module.modules.hud.A.C[0x1BDD ^ 0x1A92] = 0x8CE9 ^ 0x1A92;
        kotakbaz.rain.module.modules.hud.A.C[0x106CC ^ 0x106D5] = 0xFFFEF956 ^ 0x106D5;
        kotakbaz.rain.module.modules.hud.A.C[0x647 ^ 0x741] = 0xAC2A ^ 0x741;
        kotakbaz.rain.module.modules.hud.A.C[0xEDFB ^ 0xED26] = 0xED45 ^ 0xED26;
        kotakbaz.rain.module.modules.hud.A.C[0x3FCB ^ 0x3EF3] = 0x13FBC ^ 0x3EF3;
        kotakbaz.rain.module.modules.hud.A.C[0x8E23 ^ 0x8FA4] = 0xE6D7 ^ 0x8FA4;
        kotakbaz.rain.module.modules.hud.A.C[0x10B13 ^ 0x10A28] = 0x1106D ^ 0x10A28;
        kotakbaz.rain.module.modules.hud.A.C[0xA6B ^ 0xA01] = 0xA23 ^ 0xA01;
        kotakbaz.rain.module.modules.hud.A.C[0xA1BB ^ 0xA1CA] = 0xA1C6 ^ 0xA1CA;
        kotakbaz.rain.module.modules.hud.A.C[0x94FA ^ 0x95D3] = 0xFFFFC99E ^ 0x95D3;
        kotakbaz.rain.module.modules.hud.A.C[0x7D6C ^ 0x7D0A] = 0xFFFF8290 ^ 0x7D0A;
        kotakbaz.rain.module.modules.hud.A.C[0x2E7D ^ 0x2EE4] = 0x2EE7 ^ 0x2EE4;
        kotakbaz.rain.module.modules.hud.A.C[0xA129 ^ 0xA1C5] = 0xA1C5 ^ 0xA1C5;
        kotakbaz.rain.module.modules.hud.A.C[0x2EEC ^ 0x2FE9] = 0x8499 ^ 0x2FE9;
        kotakbaz.rain.module.modules.hud.A.C[0x4A17 ^ 0x4A32] = 0x4A20 ^ 0x4A32;
        kotakbaz.rain.module.modules.hud.A.C[0x160F ^ 0x1628] = 0x1604 ^ 0x1628;
        kotakbaz.rain.module.modules.hud.A.C[0xDF69 ^ 0xDE7C] = 0x78CB ^ 0xDE7C;
        kotakbaz.rain.module.modules.hud.A.C[0x49C5 ^ 0x498D] = 0x49EA ^ 0x498D;
        kotakbaz.rain.module.modules.hud.A.C[0x25F2 ^ 0x25DB] = 0xFFFFDA2E ^ 0x25DB;
        kotakbaz.rain.module.modules.hud.A.C[0x7999 ^ 0x7892] = 0x9A1D ^ 0x7892;
        kotakbaz.rain.module.modules.hud.A.C[0x85B6 ^ 0x84FD] = 0xC91A ^ 0x84FD;
        kotakbaz.rain.module.modules.hud.A.C[0x1061B ^ 0x10630] = 0xFFFEF99A ^ 0x10630;
        kotakbaz.rain.module.modules.hud.A.C[0xB743 ^ 0xB7AB] = 0xB7A9 ^ 0xB7AB;
        kotakbaz.rain.module.modules.hud.A.C[0x212B ^ 0x2044] = 0x9D11 ^ 0x2044;
        kotakbaz.rain.module.modules.hud.A.C[0x29F9 ^ 0x2902] = 0x5A40 ^ 0x2902;
        kotakbaz.rain.module.modules.hud.A.C[0x1FF0 ^ 0x1F92] = 0xFFFFE043 ^ 0x1F92;
        kotakbaz.rain.module.modules.hud.A.C[0x5DCA ^ 0x5D21] = 0x5D20 ^ 0x5D21;
        kotakbaz.rain.module.modules.hud.A.C[0x8D9B ^ 0x8DF7] = 0xFFFF723F ^ 0x8DF7;
        kotakbaz.rain.module.modules.hud.A.C[0x1B78 ^ 0x1B3D] = 0x1B67 ^ 0x1B3D;
        kotakbaz.rain.module.modules.hud.A.C[0xB2B7 ^ 0xB3F3] = 0xFFFF5A8D ^ 0xB3F3;
        kotakbaz.rain.module.modules.hud.A.C[0x7EB9 ^ 0x7EFF] = 0xFFFF8150 ^ 0x7EFF;
        kotakbaz.rain.module.modules.hud.A.C[0x6469 ^ 0x64CE] = 0xCF15 ^ 0x64CE;
        kotakbaz.rain.module.modules.hud.A.C[0x5787 ^ 0x570D] = 0x5746 ^ 0x570D;
        kotakbaz.rain.module.modules.hud.A.C[0x4152 ^ 0x4119] = 0x4147 ^ 0x4119;
        kotakbaz.rain.module.modules.hud.A.C[0x652B ^ 0x64AF] = 0xED42 ^ 0x64AF;
        kotakbaz.rain.module.modules.hud.A.C[0xB01E ^ 0xB02D] = 0xFFFF4FB8 ^ 0xB02D;
        kotakbaz.rain.module.modules.hud.A.C[0xE2C0 ^ 0xE2B6] = 0xE2BA ^ 0xE2B6;
        kotakbaz.rain.module.modules.hud.A.C[0xFC6C ^ 0xFD2E] = 0xEBAA ^ 0xFD2E;
        kotakbaz.rain.module.modules.hud.A.C[0xC792 ^ 0xC78D] = 0xC7DD ^ 0xC78D;
        kotakbaz.rain.module.modules.hud.A.C[0x1BC5 ^ 0x1B9D] = 0xFFFFE43B ^ 0x1B9D;
        kotakbaz.rain.module.modules.hud.A.C[0x4A03 ^ 0x4B14] = 0x146BE ^ 0x4B14;
        kotakbaz.rain.module.modules.hud.A.C[0xC5FB ^ 0xC54B] = 0xC570 ^ 0xC54B;
        kotakbaz.rain.module.modules.hud.A.C[0xDD ^ 0xEA] = 0xFFFFFF16 ^ 0xEA;
        kotakbaz.rain.module.modules.hud.A.C[0xF358 ^ 0xF30F] = 0xF33A ^ 0xF30F;
        kotakbaz.rain.module.modules.hud.A.C[0x804E ^ 0x80C6] = 0x80A7 ^ 0x80C6;
        kotakbaz.rain.module.modules.hud.A.C[0xE636 ^ 0xE749] = 0x1EFBE ^ 0xE749;
        kotakbaz.rain.module.modules.hud.A.C[0x4A5A ^ 0x4BD5] = 0x9C5C ^ 0x4BD5;
        kotakbaz.rain.module.modules.hud.A.C[0x1033C ^ 0x1024C] = 0xFFFE40F5 ^ 0x1024C;
        kotakbaz.rain.module.modules.hud.A.C[0x9599 ^ 0x948D] = 0x3202 ^ 0x948D;
        kotakbaz.rain.module.modules.hud.A.C[0xCEB1 ^ 0xCE0F] = 0xCE5D ^ 0xCE0F;
        kotakbaz.rain.module.modules.hud.A.C[0x64BF ^ 0x643D] = 0xFFFF9BEF ^ 0x643D;
        kotakbaz.rain.module.modules.hud.A.C[0x4110 ^ 0x4199] = 0xFFFFBE5A ^ 0x4199;
        kotakbaz.rain.module.modules.hud.A.C[0x2A0F ^ 0x2B4A] = 0x3DD1 ^ 0x2B4A;
        kotakbaz.rain.module.modules.hud.A.C[0xC7BA ^ 0xC639] = 0x4F85 ^ 0xC639;
        kotakbaz.rain.module.modules.hud.A.C[0x5F11 ^ 0x5F31] = 0x5F13 ^ 0x5F31;
        kotakbaz.rain.module.modules.hud.A.C[0xD33F ^ 0xD321] = 0xD373 ^ 0xD321;
        kotakbaz.rain.module.modules.hud.A.C[0x9F14 ^ 0x9F58] = 0x9F00 ^ 0x9F58;
        kotakbaz.rain.module.modules.hud.A.C[0x9686 ^ 0x9653] = 0x96C1 ^ 0x9653;
        kotakbaz.rain.module.modules.hud.A.C[0x8D42 ^ 0x8C0B] = 0x9794 ^ 0x8C0B;
        kotakbaz.rain.module.modules.hud.A.C[0x8F27 ^ 0x8E43] = 0xCABD ^ 0x8E43;
        kotakbaz.rain.module.modules.hud.A.C[0x7A42 ^ 0x7AD8] = 0x7AD8 ^ 0x7AD8;
        kotakbaz.rain.module.modules.hud.A.C[0x914F ^ 0x9064] = 0xDFA6 ^ 0x9064;
        kotakbaz.rain.module.modules.hud.A.C[0x6E0B ^ 0x6EDD] = 0x6ED5 ^ 0x6EDD;
        kotakbaz.rain.module.modules.hud.A.C[0xB4C9 ^ 0xB428] = 0xB41E ^ 0xB428;
        kotakbaz.rain.module.modules.hud.A.C[0x2600 ^ 0x2760] = 0xFFFF9403 ^ 0x2760;
        kotakbaz.rain.module.modules.hud.A.C[0x29CD ^ 0x295B] = 0xFFFFD6B5 ^ 0x295B;
        kotakbaz.rain.module.modules.hud.A.C[0x7ECB ^ 0x7E3D] = 0x17930 ^ 0x7E3D;
        kotakbaz.rain.module.modules.hud.A.C[0x1CDB ^ 0x1CED] = 0x1CE1 ^ 0x1CED;
        kotakbaz.rain.module.modules.hud.A.C[0x27FD ^ 0x26A2] = 0x6A5E ^ 0x26A2;
        kotakbaz.rain.module.modules.hud.A.C[0x93E0 ^ 0x9322] = 0xFFFF6CC2 ^ 0x9322;
        kotakbaz.rain.module.modules.hud.A.C[0x109E3 ^ 0x108B2] = 0x19EC9 ^ 0x108B2;
        kotakbaz.rain.module.modules.hud.A.C[0xDE99 ^ 0xDE77] = 0x806D ^ 0xDE77;
        kotakbaz.rain.module.modules.hud.A.C[0x1084A ^ 0x10914] = 0x145F1 ^ 0x10914;
        kotakbaz.rain.module.modules.hud.A.C[0x1317 ^ 0x1236] = 0x16AE ^ 0x1236;
        kotakbaz.rain.module.modules.hud.A.C[0x106 ^ 0x137] = 0x14D ^ 0x137;
        kotakbaz.rain.module.modules.hud.A.C[0xDE34 ^ 0xDF78] = 0x92B2 ^ 0xDF78;
        kotakbaz.rain.module.modules.hud.A.C[0x416 ^ 0x4AE] = 0xFFFFFB69 ^ 0x4AE;
        kotakbaz.rain.module.modules.hud.A.C[0xAC85 ^ 0xAC7D] = 0x4550 ^ 0xAC7D;
        kotakbaz.rain.module.modules.hud.A.C[0x47DD ^ 0x4750] = 0xFFFFB8DF ^ 0x4750;
        kotakbaz.rain.module.modules.hud.A.C[0xF309 ^ 0xF3A9] = 0xF229 ^ 0xF3A9;
        kotakbaz.rain.module.modules.hud.A.C[0xD45E ^ 0xD48D] = 0xFFFF2B20 ^ 0xD48D;
        kotakbaz.rain.module.modules.hud.A.C[0xA74D ^ 0xA6C0] = 0xF1CD ^ 0xA6C0;
        kotakbaz.rain.module.modules.hud.A.C[0xB73A ^ 0xB761] = 0xB700 ^ 0xB761;
        kotakbaz.rain.module.modules.hud.A.C[0x1071C ^ 0x10690] = 0x151F9 ^ 0x10690;
        kotakbaz.rain.module.modules.hud.A.C[0x6077 ^ 0x615F] = 0xC280 ^ 0x615F;
        kotakbaz.rain.module.modules.hud.A.C[0x7F5C ^ 0x7F59] = 0xFFFF8088 ^ 0x7F59;
        kotakbaz.rain.module.modules.hud.A.C[0x10700 ^ 0x1068E] = 0x1D119 ^ 0x1068E;
        kotakbaz.rain.module.modules.hud.A.C[0xCC58 ^ 0xCD03] = 0xF351 ^ 0xCD03;
        kotakbaz.rain.module.modules.hud.A.C[0x2D ^ 0x158] = 0xC13F ^ 0x158;
        kotakbaz.rain.module.modules.hud.A.C[0x333E ^ 0x338C] = 0xFFFFCC17 ^ 0x338C;
        kotakbaz.rain.module.modules.hud.A.C[0x5653 ^ 0x5688] = 0x56CC ^ 0x5688;
        kotakbaz.rain.module.modules.hud.A.C[0x42F9 ^ 0x42A9] = 0xFFFFBD21 ^ 0x42A9;
        kotakbaz.rain.module.modules.hud.A.C[0x516D ^ 0x5075] = 0x15DDE ^ 0x5075;
        kotakbaz.rain.module.modules.hud.A.C[0x3417 ^ 0x349C] = 0x3489 ^ 0x349C;
        kotakbaz.rain.module.modules.hud.A.C[0x1BF0 ^ 0x1B73] = 0x1B1D ^ 0x1B73;
        kotakbaz.rain.module.modules.hud.A.C[0x426D ^ 0x42AA] = 0x429B ^ 0x42AA;
        kotakbaz.rain.module.modules.hud.A.C[0x39CB ^ 0x38BC] = 0x139DE ^ 0x38BC;
        kotakbaz.rain.module.modules.hud.A.C[0x5B0B ^ 0x5BEF] = 0x5BB1 ^ 0x5BEF;
        kotakbaz.rain.module.modules.hud.A.C[0x68DB ^ 0x68CC] = 0x689F ^ 0x68CC;
        kotakbaz.rain.module.modules.hud.A.C[0x33CA ^ 0x33F2] = 0x33F5 ^ 0x33F2;
        kotakbaz.rain.module.modules.hud.A.C[0x6D3B ^ 0x6D16] = 0x6D71 ^ 0x6D16;
        kotakbaz.rain.module.modules.hud.A.C[0xE355 ^ 0xE3FE] = 0xD243 ^ 0xE3FE;
        kotakbaz.rain.module.modules.hud.A.C[0x39EA ^ 0x3995] = 0x39D4 ^ 0x3995;
        kotakbaz.rain.module.modules.hud.A.C[0x998B ^ 0x99AD] = 0xFFFF663D ^ 0x99AD;
        kotakbaz.rain.module.modules.hud.A.C[0x69DC ^ 0x69D7] = 0x69E2 ^ 0x69D7;
        kotakbaz.rain.module.modules.hud.A.C[0x97D ^ 0x9E0] = 0x9E2 ^ 0x9E0;
        kotakbaz.rain.module.modules.hud.A.C[0xEE0D ^ 0xEEC0] = 0xEED8 ^ 0xEEC0;
        kotakbaz.rain.module.modules.hud.A.C[0xF8E0 ^ 0xF807] = 0xF806 ^ 0xF807;
        kotakbaz.rain.module.modules.hud.A.C[0x19E2 ^ 0x1894] = 0x119EC ^ 0x1894;
        kotakbaz.rain.module.modules.hud.A.C[0x2B14 ^ 0x2B26] = 0x2B3D ^ 0x2B26;
        kotakbaz.rain.module.modules.hud.A.C[0x9E0D ^ 0x9EF1] = 0xEDB0 ^ 0x9EF1;
        kotakbaz.rain.module.modules.hud.A.C[0x10815 ^ 0x108D3] = 0xFFFEF721 ^ 0x108D3;
        kotakbaz.rain.module.modules.hud.A.C[0x33A7 ^ 0x32A5] = 0x89EB ^ 0x32A5;
        kotakbaz.rain.module.modules.hud.A.C[0x41CD ^ 0x411A] = 0xFFFFBE9C ^ 0x411A;
        kotakbaz.rain.module.modules.hud.A.C[0xEAE4 ^ 0xEBDA] = 0x149A ^ 0xEBDA;
        kotakbaz.rain.module.modules.hud.A.C[0xDB8D ^ 0xDA8C] = 0xFFFF9E66 ^ 0xDA8C;
        kotakbaz.rain.module.modules.hud.A.C[0xA918 ^ 0xA90D] = 0xA90D ^ 0xA90D;
        kotakbaz.rain.module.modules.hud.A.C[0x86B7 ^ 0x861D] = 0xB971 ^ 0x861D;
        kotakbaz.rain.module.modules.hud.A.C[0xC2F ^ 0xC6C] = 0xC2F ^ 0xC6C;
        kotakbaz.rain.module.modules.hud.A.C[0xA206 ^ 0xA247] = 0xA269 ^ 0xA247;
        kotakbaz.rain.module.modules.hud.A.C[0x3178 ^ 0x3054] = 0x7F9E ^ 0x3054;
        kotakbaz.rain.module.modules.hud.A.C[0x6246 ^ 0x6240] = 0xFFFF9DBB ^ 0x6240;
        kotakbaz.rain.module.modules.hud.A.C[0xD598 ^ 0xD4BB] = 0x69E2 ^ 0xD4BB;
        kotakbaz.rain.module.modules.hud.A.C[0x8EA1 ^ 0x8ECC] = 0x8ECA ^ 0x8ECC;
        kotakbaz.rain.module.modules.hud.A.C[0x364C ^ 0x3686] = 0x36F1 ^ 0x3686;
        kotakbaz.rain.module.modules.hud.A.C[0x8C2A ^ 0x8D7F] = 0xBBD7 ^ 0x8D7F;
        kotakbaz.rain.module.modules.hud.A.C[0x25DE ^ 0x24E7] = 0x125D8 ^ 0x24E7;
        kotakbaz.rain.module.modules.hud.A.C[0x93E0 ^ 0x935D] = 0x936C ^ 0x935D;
        kotakbaz.rain.module.modules.hud.A.C[0x6987 ^ 0x68B0] = 0x1698F ^ 0x68B0;
        kotakbaz.rain.module.modules.hud.A.C[0x27A0 ^ 0x275A] = 0xCE77 ^ 0x275A;
        kotakbaz.rain.module.modules.hud.A.C[0x28B9 ^ 0x29CD] = 0xFFFF1660 ^ 0x29CD;
        kotakbaz.rain.module.modules.hud.A.C[0xCB03 ^ 0xCB5F] = 0xCB04 ^ 0xCB5F;
        kotakbaz.rain.module.modules.hud.A.C[0xFAB2 ^ 0xFABA] = 0xFAD4 ^ 0xFABA;
        kotakbaz.rain.module.modules.hud.A.C[0xE637 ^ 0xE60B] = 0xE608 ^ 0xE60B;
        kotakbaz.rain.module.modules.hud.A.C[0xCBA7 ^ 0xCBD5] = 0xCBC9 ^ 0xCBD5;
        kotakbaz.rain.module.modules.hud.A.C[0xA7D6 ^ 0xA7AD] = 0xA727 ^ 0xA7AD;
        kotakbaz.rain.module.modules.hud.A.C[0x54FB ^ 0x55C6] = 0x4F83 ^ 0x55C6;
        kotakbaz.rain.module.modules.hud.A.C[0x6A12 ^ 0x6B40] = 0x5DEA ^ 0x6B40;
        kotakbaz.rain.module.modules.hud.A.C[0x3E0D ^ 0x3EC6] = 0x3ECF ^ 0x3EC6;
        kotakbaz.rain.module.modules.hud.A.C[0x79CE ^ 0x79EF] = 0x79E2 ^ 0x79EF;
        kotakbaz.rain.module.modules.hud.A.C[0xFAC6 ^ 0xFA84] = 0xFA82 ^ 0xFA84;
        kotakbaz.rain.module.modules.hud.A.C[0xE372 ^ 0xE3D7] = 0xCD61 ^ 0xE3D7;
        kotakbaz.rain.module.modules.hud.A.C[0x666 ^ 0x693] = 0xFFFEFE5B ^ 0x693;
        kotakbaz.rain.module.modules.hud.A.C[0xAB98 ^ 0xAA8E] = 0xC01 ^ 0xAA8E;
        kotakbaz.rain.module.modules.hud.A.C[0xD484 ^ 0xD59B] = 0xD145 ^ 0xD59B;
        kotakbaz.rain.module.modules.hud.A.C[0x9A36 ^ 0x9A42] = 0xFFFF65DA ^ 0x9A42;
        kotakbaz.rain.module.modules.hud.A.C[0x988C ^ 0x99E1] = 0x91A5 ^ 0x99E1;
        kotakbaz.rain.module.modules.hud.A.C[0x5D9B ^ 0x5DCA] = 0xFFFFA25F ^ 0x5DCA;
        kotakbaz.rain.module.modules.hud.A.C[0x2BD2 ^ 0x2AB4] = 0x2A18 ^ 0x2AB4;
        kotakbaz.rain.module.modules.hud.A.C[0x71C2 ^ 0x71F7] = 0xFFFF8E31 ^ 0x71F7;
        kotakbaz.rain.module.modules.hud.A.C[0x47FE ^ 0x47C4] = 0xFFFFB848 ^ 0x47C4;
        kotakbaz.rain.module.modules.hud.A.C[0x5CE8 ^ 0x5CAC] = 0xFFFFA36D ^ 0x5CAC;
        kotakbaz.rain.module.modules.hud.A.C[0x7971 ^ 0x792E] = 0xFFFF8688 ^ 0x792E;
        kotakbaz.rain.module.modules.hud.A.C[0x2714 ^ 0x2609] = 0xFFFFF717 ^ 0x2609;
        kotakbaz.rain.module.modules.hud.A.C[0x5A1D ^ 0x5A76] = 0x5A7A ^ 0x5A76;
        kotakbaz.rain.module.modules.hud.A.C[0x6F7E ^ 0x6FA0] = 0x6FCB ^ 0x6FA0;
        kotakbaz.rain.module.modules.hud.A.C[0x5130 ^ 0x5122] = 0xFFFFAED2 ^ 0x5122;
        kotakbaz.rain.module.modules.hud.A.C[0x4FC ^ 0x4B6] = 0x4A9 ^ 0x4B6;
        kotakbaz.rain.module.modules.hud.A.C[0xB549 ^ 0xB46F] = 0x938 ^ 0xB46F;
        kotakbaz.rain.module.modules.hud.A.C[0x40CA ^ 0x41AB] = 0xD57 ^ 0x41AB;
        kotakbaz.rain.module.modules.hud.A.C[0xE4F7 ^ 0xE44C] = 0xE40E ^ 0xE44C;
        kotakbaz.rain.module.modules.hud.A.C[0xCB66 ^ 0xCA7C] = 0x1C7D7 ^ 0xCA7C;
        kotakbaz.rain.module.modules.hud.A.C[0xE3B0 ^ 0xE2B0] = 0x59FE ^ 0xE2B0;
        kotakbaz.rain.module.modules.hud.A.C[0x7590 ^ 0x7558] = 0x755B ^ 0x7558;
        kotakbaz.rain.module.modules.hud.A.C[0x84DE ^ 0x8440] = 0x8440 ^ 0x8440;
        kotakbaz.rain.module.modules.hud.A.C[0x3710 ^ 0x37A7] = 0xFFFFC80A ^ 0x37A7;
        kotakbaz.rain.module.modules.hud.A.C[0x4C1F ^ 0x4D5C] = 0x5BC7 ^ 0x4D5C;
        kotakbaz.rain.module.modules.hud.A.C[0xA070 ^ 0xA05A] = 0xA043 ^ 0xA05A;
        kotakbaz.rain.module.modules.hud.A.C[0x395B ^ 0x3943] = 0x3933 ^ 0x3943;
        kotakbaz.rain.module.modules.hud.A.C[0x7290 ^ 0x7223] = 0xFFFF8DB5 ^ 0x7223;
        kotakbaz.rain.module.modules.hud.A.C[0x9ECB ^ 0x9FD0] = 0xB148 ^ 0x9FD0;
        kotakbaz.rain.module.modules.hud.A.C[0x6519 ^ 0x658C] = 0x6583 ^ 0x658C;
        kotakbaz.rain.module.modules.hud.A.C[0xD82B ^ 0xD8FF] = 0xD8D8 ^ 0xD8FF;
        kotakbaz.rain.module.modules.hud.A.C[0x167C ^ 0x171E] = 0x539E ^ 0x171E;
        kotakbaz.rain.module.modules.hud.A.C[0xD7A ^ 0xC14] = 0xB151 ^ 0xC14;
        kotakbaz.rain.module.modules.hud.A.C[0xD0D7 ^ 0xD0D8] = 0xFFFF2F52 ^ 0xD0D8;
        kotakbaz.rain.module.modules.hud.A.C[0x85EE ^ 0x8484] = 0x8CCB ^ 0x8484;
        kotakbaz.rain.module.modules.hud.A.C[0xC7B8 ^ 0xC7AE] = 0xFFFF3823 ^ 0xC7AE;
        kotakbaz.rain.module.modules.hud.A.C[0xC2C1 ^ 0xC3CE] = 0xCDE8 ^ 0xC3CE;
        kotakbaz.rain.module.modules.hud.A.C[0x6EE7 ^ 0x6E62] = 0x6E22 ^ 0x6E62;
        kotakbaz.rain.module.modules.hud.A.C[0xAAF0 ^ 0xAAE3] = 0xFFFF552A ^ 0xAAE3;
        kotakbaz.rain.module.modules.hud.A.C[0x53F2 ^ 0x5320] = 0xFFFFACD4 ^ 0x5320;
        kotakbaz.rain.module.modules.hud.A.C[0xBC94 ^ 0xBD9E] = 0x6959 ^ 0xBD9E;
        kotakbaz.rain.module.modules.hud.A.C[0x237 ^ 0x270] = 0xFFFFFDA5 ^ 0x270;
        kotakbaz.rain.module.modules.hud.A.C[0x23DE ^ 0x2293] = 0x6F74 ^ 0x2293;
        kotakbaz.rain.module.modules.hud.A.C[0xD740 ^ 0xD7E4] = 0x8A02 ^ 0xD7E4;
        kotakbaz.rain.module.modules.hud.A.C[0x5120 ^ 0x5023] = 0xFB4C ^ 0x5023;
        kotakbaz.rain.module.modules.hud.A.C[0x92B2 ^ 0x93A1] = 0x3521 ^ 0x93A1;
        kotakbaz.rain.module.modules.hud.A.C[0x4F46 ^ 0x4FDD] = 0x4FDC ^ 0x4FDD;
        kotakbaz.rain.module.modules.hud.A.C[0x1083 ^ 0x11DB] = 0xB1F6 ^ 0x11DB;
        kotakbaz.rain.module.modules.hud.A.C[0x5B6D ^ 0x5A17] = 0x47F6 ^ 0x5A17;
        kotakbaz.rain.module.modules.hud.A.C[0x7D0 ^ 0x75E] = 0xFFFFF8B2 ^ 0x75E;
        kotakbaz.rain.module.modules.hud.A.C[0x1DC4 ^ 0x1D9E] = 0xFFFFE25A ^ 0x1D9E;
        kotakbaz.rain.module.modules.hud.A.C[0xE188 ^ 0xE0BB] = 0x1EA10 ^ 0xE0BB;
        kotakbaz.rain.module.modules.hud.A.C[0x49CA ^ 0x4920] = 0x4921 ^ 0x4920;
        kotakbaz.rain.module.modules.hud.A.C[0xDC9B ^ 0xDC57] = 0xFFFF232C ^ 0xDC57;
        kotakbaz.rain.module.modules.hud.A.C[0x3A4E ^ 0x3A62] = 0xFFFFC5C1 ^ 0x3A62;
        kotakbaz.rain.module.modules.hud.A.C[0xDFB6 ^ 0xDEF0] = 0xC56A ^ 0xDEF0;
        kotakbaz.rain.module.modules.hud.A.C[0xB43C ^ 0xB4AB] = 0xFFFF4B71 ^ 0xB4AB;
        kotakbaz.rain.module.modules.hud.A.C[0x22EF ^ 0x2259] = 0x2250 ^ 0x2259;
        kotakbaz.rain.module.modules.hud.A.C[0xDA01 ^ 0xDAC1] = 0xFFFF2539 ^ 0xDAC1;
        kotakbaz.rain.module.modules.hud.A.C[0x962F ^ 0x9700] = 0x9700 ^ 0x9700;
        kotakbaz.rain.module.modules.hud.A.C[0xEDE4 ^ 0xECD4] = 0x99E3 ^ 0xECD4;
        kotakbaz.rain.module.modules.hud.A.C[0x5B32 ^ 0x5A6E] = 0x647B ^ 0x5A6E;
        kotakbaz.rain.module.modules.hud.A.C[0x8270 ^ 0x82BE] = 0xFFFF7D3D ^ 0x82BE;
        kotakbaz.rain.module.modules.hud.A.C[0x917D ^ 0x9001] = 0xFFFF7265 ^ 0x9001;
        kotakbaz.rain.module.modules.hud.A.C[0x7B8B ^ 0x7BD2] = 0xFFFF8440 ^ 0x7BD2;
        kotakbaz.rain.module.modules.hud.A.C[0x61DE ^ 0x6173] = 0x6173 ^ 0x6173;
        kotakbaz.rain.module.modules.hud.A.C[0x8344 ^ 0x8334] = 0xFFFF7CC2 ^ 0x8334;
        kotakbaz.rain.module.modules.hud.A.C[0x2EAF ^ 0x2E2F] = 0x2E45 ^ 0x2E2F;
        kotakbaz.rain.module.modules.hud.A.C[0x8E7F ^ 0x8FFA] = 0x646 ^ 0x8FFA;
        kotakbaz.rain.module.modules.hud.A.C[0x10873 ^ 0x108BC] = 0x10803 ^ 0x108BC;
        kotakbaz.rain.module.modules.hud.A.C[0x65B0 ^ 0x64E4] = 0x5273 ^ 0x64E4;
        kotakbaz.rain.module.modules.hud.A.C[0xBC3A ^ 0xBCD7] = 0xE2DD ^ 0xBCD7;
        kotakbaz.rain.module.modules.hud.A.C[0xEC95 ^ 0xEDFE] = 0xE5BA ^ 0xEDFE;
        kotakbaz.rain.module.modules.hud.A.C[0x107F5 ^ 0x1070B] = 0x1744A ^ 0x1070B;
        kotakbaz.rain.module.modules.hud.A.C[0x10E50 ^ 0x10E4C] = 0x10E2C ^ 0x10E4C;
        kotakbaz.rain.module.modules.hud.A.C[0x315F ^ 0x31BF] = 0x31B5 ^ 0x31BF;
        kotakbaz.rain.module.modules.hud.A.C[0xBAE3 ^ 0xBA64] = 0xBA20 ^ 0xBA64;
        kotakbaz.rain.module.modules.hud.A.C[0x1220 ^ 0x12D2] = 0x54D ^ 0x12D2;
        kotakbaz.rain.module.modules.hud.A.C[0xBBF5 ^ 0xBB57] = 0x52C6 ^ 0xBB57;
        kotakbaz.rain.module.modules.hud.A.C[0xDC03 ^ 0xDD29] = 0x7EF6 ^ 0xDD29;
        kotakbaz.rain.module.modules.hud.A.C[0xDDCE ^ 0xDC45] = 0x8B48 ^ 0xDC45;
        kotakbaz.rain.module.modules.hud.A.C[0x9A76 ^ 0x9A6D] = 0xFFFF65D8 ^ 0x9A6D;
        kotakbaz.rain.module.modules.hud.A.C[0xE597 ^ 0xE53F] = 0x5473 ^ 0xE53F;
        kotakbaz.rain.module.modules.hud.A.C[0x7516 ^ 0x749F] = 0x1DEC ^ 0x749F;
        kotakbaz.rain.module.modules.hud.A.C[0x289 ^ 0x3F4] = 0x1E16 ^ 0x3F4;
        kotakbaz.rain.module.modules.hud.A.C[0x6F7F ^ 0x6FD3] = 0x6D6C ^ 0x6FD3;
        kotakbaz.rain.module.modules.hud.A.C[0xC3D8 ^ 0xC33B] = 0xC313 ^ 0xC33B;
        kotakbaz.rain.module.modules.hud.A.C[0xC2AD ^ 0xC39C] = 0xB68B ^ 0xC39C;
        kotakbaz.rain.module.modules.hud.A.C[0xEA0C ^ 0xEAAD] = 0xD10D ^ 0xEAAD;
        kotakbaz.rain.module.modules.hud.A.C[0x925E ^ 0x9316] = 0x88C9 ^ 0x9316;
        kotakbaz.rain.module.modules.hud.A.C[0xA622 ^ 0xA7A8] = 0xF0AD ^ 0xA7A8;
        kotakbaz.rain.module.modules.hud.A.C[0x4343 ^ 0x43BE] = 0x30B0 ^ 0x43BE;
        kotakbaz.rain.module.modules.hud.A.C[0x101E6 ^ 0x101FB] = 0xFFFEFE0E ^ 0x101FB;
        kotakbaz.rain.module.modules.hud.A.C[0x7BEA ^ 0x7B94] = 0xFFFF8463 ^ 0x7B94;
        kotakbaz.rain.module.modules.hud.A.C[0xC009 ^ 0xC00B] = 0xC03C ^ 0xC00B;
        kotakbaz.rain.module.modules.hud.A.C[0x5CF9 ^ 0x5C96] = 0x5CA0 ^ 0x5C96;
        kotakbaz.rain.module.modules.hud.A.C[0xDC00 ^ 0xDC5E] = 0xFFFF23B5 ^ 0xDC5E;
        kotakbaz.rain.module.modules.hud.A.C[0x4EFD ^ 0x4FB7] = 0x25E ^ 0x4FB7;
        kotakbaz.rain.module.modules.hud.A.C[0xB35C ^ 0xB37E] = 0xB349 ^ 0xB37E;
        kotakbaz.rain.module.modules.hud.A.C[0x3ED4 ^ 0x3E17] = 0x3E7C ^ 0x3E17;
        kotakbaz.rain.module.modules.hud.A.C[0x1404 ^ 0x1490] = 0x148B ^ 0x1490;
        kotakbaz.rain.module.modules.hud.A.C[0x7CB4 ^ 0x7DBD] = 0xFFFF56F1 ^ 0x7DBD;
        kotakbaz.rain.module.modules.hud.A.C[0x3C26 ^ 0x3D1C] = 0x275F ^ 0x3D1C;
        kotakbaz.rain.module.modules.hud.A.C[0xD16 ^ 0xDF9] = 0x1A66 ^ 0xDF9;
        kotakbaz.rain.module.modules.hud.A.C[0xD0D5 ^ 0xD0E5] = 0xFFFF2F6E ^ 0xD0E5;
        kotakbaz.rain.module.modules.hud.A.C[0x29A3 ^ 0x299D] = 0xFFFFD611 ^ 0x299D;
        kotakbaz.rain.module.modules.hud.A.C[0x48A ^ 0x50A] = 0xFFFEF24F ^ 0x50A;
        kotakbaz.rain.module.modules.hud.A.C[0x1EA8 ^ 0x1EDD] = 0x1EF9 ^ 0x1EDD;
        kotakbaz.rain.module.modules.hud.A.C[0x1071E ^ 0x107ED] = 0xE5 ^ 0x107ED;
        kotakbaz.rain.module.modules.hud.A.C[0x4DE9 ^ 0x4DBA] = 0xFFFFB27C ^ 0x4DBA;
        kotakbaz.rain.module.modules.hud.A.C[0xA610 ^ 0xA71E] = 0x459C ^ 0xA71E;
        kotakbaz.rain.module.modules.hud.A.C[0x3517 ^ 0x3409] = 0x1A9D ^ 0x3409;
        kotakbaz.rain.module.modules.hud.A.C[0x4D00 ^ 0x4DB5] = 0x4D82 ^ 0x4DB5;
        kotakbaz.rain.module.modules.hud.A.C[0xDA4B ^ 0xDAF1] = 0xFFFF2565 ^ 0xDAF1;
        kotakbaz.rain.module.modules.hud.A.C[0x1173 ^ 0x110E] = 0xFFFFEE99 ^ 0x110E;
        kotakbaz.rain.module.modules.hud.A.C[0xA0AF ^ 0xA0D3] = 0xFFFF5F0C ^ 0xA0D3;
        kotakbaz.rain.module.modules.hud.A.C[0x82E2 ^ 0x8232] = 0xFFFF7DFF ^ 0x8232;
        kotakbaz.rain.module.modules.hud.A.C[0x87FF ^ 0x8723] = 0xFFFF78DC ^ 0x8723;
        kotakbaz.rain.module.modules.hud.A.C[0x4ECC ^ 0x4EC0] = 0xFFFFB120 ^ 0x4EC0;
        kotakbaz.rain.module.modules.hud.A.C[0x538E ^ 0x53F7] = 0xFFFFAC0A ^ 0x53F7;
        kotakbaz.rain.module.modules.hud.A.C[0x9023 ^ 0x911F] = 0xFFFF74F7 ^ 0x911F;
        kotakbaz.rain.module.modules.hud.A.C[0xEDC7 ^ 0xED30] = 0x416 ^ 0xED30;
        kotakbaz.rain.module.modules.hud.A.C[0x2461 ^ 0x247B] = 0x2456 ^ 0x247B;
        kotakbaz.rain.module.modules.hud.A.C[0xBDB8 ^ 0xBCF8] = 0x43A9 ^ 0xBCF8;
        kotakbaz.rain.module.modules.hud.A.C[0x90C0 ^ 0x91B9] = 0x190DB ^ 0x91B9;
        kotakbaz.rain.module.modules.hud.A.C[0x3387 ^ 0x3303] = 0x3317 ^ 0x3303;
        kotakbaz.rain.module.modules.hud.A.C[0xD6AF ^ 0xD68B] = 0xD6F5 ^ 0xD68B;
        kotakbaz.rain.module.modules.hud.A.C[0xDD4D ^ 0xDC1E] = 0xEAB6 ^ 0xDC1E;
        kotakbaz.rain.module.modules.hud.A.C[0xF885 ^ 0xF9A0] = 0x44A6 ^ 0xF9A0;
        kotakbaz.rain.module.modules.hud.A.C[0x10568 ^ 0x1050D] = 0x10570 ^ 0x1050D;
        kotakbaz.rain.module.modules.hud.A.C[0x2C81 ^ 0x2DE8] = 0x2D5F ^ 0x2DE8;
        kotakbaz.rain.module.modules.hud.A.C[0x7D56 ^ 0x7C46] = 0x7267 ^ 0x7C46;
        kotakbaz.rain.module.modules.hud.A.C[0xFAE8 ^ 0xFA74] = 0xFA74 ^ 0xFA74;
        kotakbaz.rain.module.modules.hud.A.C[0xFB1F ^ 0xFA38] = 0x59E1 ^ 0xFA38;
        kotakbaz.rain.module.modules.hud.A.C[0x8EBD ^ 0x8FCF] = 0x4FB4 ^ 0x8FCF;
        kotakbaz.rain.module.modules.hud.A.C[0x8712 ^ 0x87EB] = 0xFFFF9103 ^ 0x87EB;
        kotakbaz.rain.module.modules.hud.A.C[0x428B ^ 0x430A] = 0x14BFD ^ 0x430A;
        kotakbaz.rain.module.modules.hud.A.C[0x98FC ^ 0x9855] = 0x1A79 ^ 0x9855;
        kotakbaz.rain.module.modules.hud.A.C[0x77F2 ^ 0x76D6] = 0xCB81 ^ 0x76D6;
        kotakbaz.rain.module.modules.hud.A.C[0x4902 ^ 0x4993] = 0x49E6 ^ 0x4993;
        kotakbaz.rain.module.modules.hud.A.C[0xA830 ^ 0xA93C] = 0x4BBE ^ 0xA93C;
        kotakbaz.rain.module.modules.hud.A.C[0x1A71 ^ 0x1A25] = 0xFFFFE5F0 ^ 0x1A25;
        kotakbaz.rain.module.modules.hud.A.C[0x4200 ^ 0x4293] = 0x42AA ^ 0x4293;
        kotakbaz.rain.module.modules.hud.A.C[0x8729 ^ 0x8701] = 0xFFFF78E8 ^ 0x8701;
        kotakbaz.rain.module.modules.hud.A.C[0xAF4D ^ 0xAF59] = 0xFFFF50E8 ^ 0xAF59;
        kotakbaz.rain.module.modules.hud.A.C[0x1717 ^ 0x161A] = 0xF4AD ^ 0x161A;
        kotakbaz.rain.module.modules.hud.A.C[0x8718 ^ 0x87B7] = 0x87F6 ^ 0x87B7;
        kotakbaz.rain.module.modules.hud.A.C[0x4586 ^ 0x45D3] = 0x45B2 ^ 0x45D3;
        kotakbaz.rain.module.modules.hud.A.C[0xDDF2 ^ 0xDD95] = 0xDDE5 ^ 0xDD95;
        kotakbaz.rain.module.modules.hud.A.C[0x14AE ^ 0x1476] = 0x1465 ^ 0x1476;
        kotakbaz.rain.module.modules.hud.A.C[0x109FE ^ 0x1097F] = 0x1093E ^ 0x1097F;
        kotakbaz.rain.module.modules.hud.A.C[0x84A4 ^ 0x84E9] = 0xFFFF7B0F ^ 0x84E9;
        kotakbaz.rain.module.modules.hud.A.C[0x43D1 ^ 0x432E] = 0xF862 ^ 0x432E;
        kotakbaz.rain.module.modules.hud.A.C[0x15CF ^ 0x14DE] = 0xFFFFE550 ^ 0x14DE;
        kotakbaz.rain.module.modules.hud.A.C[0x6C61 ^ 0x6D55] = 0xFFFE9816 ^ 0x6D55;
        kotakbaz.rain.module.modules.hud.A.C[0xFF25 ^ 0xFF18] = 0xFFFF00B7 ^ 0xFF18;
        kotakbaz.rain.module.modules.hud.A.C[0x1604 ^ 0x1607] = 0x165D ^ 0x1607;
        kotakbaz.rain.module.modules.hud.A.C[0xA6E1 ^ 0xA6E8] = 0xA6DB ^ 0xA6E8;
        kotakbaz.rain.module.modules.hud.A.C[0x9808 ^ 0x9827] = 0xFFFF6795 ^ 0x9827;
        kotakbaz.rain.module.modules.hud.A.C[0x6851 ^ 0x68DD] = 0xFFFF971F ^ 0x68DD;
        kotakbaz.rain.module.modules.hud.A.C[0x1458 ^ 0x146C] = 0x143D ^ 0x146C;
        kotakbaz.rain.module.modules.hud.A.C[0x1ED4 ^ 0x1EB5] = 0xFFFFE136 ^ 0x1EB5;
        kotakbaz.rain.module.modules.hud.A.C[0xC245 ^ 0xC2CA] = 0xC289 ^ 0xC2CA;
        kotakbaz.rain.module.modules.hud.A.C[0xB8F5 ^ 0xB865] = 0xB83F ^ 0xB865;
        kotakbaz.rain.module.modules.hud.A.C[0x9DB6 ^ 0x9DA7] = 0x9D92 ^ 0x9DA7;
        kotakbaz.rain.module.modules.hud.A.C[0xD099 ^ 0xD1EA] = 0x118D ^ 0xD1EA;
        kotakbaz.rain.module.modules.hud.A.C[0x10803 ^ 0x1092E] = 0xFFFEB93D ^ 0x1092E;
        kotakbaz.rain.module.modules.hud.A.C[0x21C4 ^ 0x2121] = 0xFFFFDEDE ^ 0x2121;
        kotakbaz.rain.module.modules.hud.A.C[0xD64C ^ 0xD64B] = 0xD626 ^ 0xD64B;
        kotakbaz.rain.module.modules.hud.A.C[0xB23 ^ 0xA1C] = 0xF54A ^ 0xA1C;
        kotakbaz.rain.module.modules.hud.A.C[0x589C ^ 0x59F0] = 0x51AD ^ 0x59F0;
        kotakbaz.rain.module.modules.hud.A.C[0x10240 ^ 0x10244] = 0xFFFEFDC2 ^ 0x10244;
        kotakbaz.rain.module.modules.hud.A.C[0x4620 ^ 0x477D] = 0x792F ^ 0x477D;
        kotakbaz.rain.module.modules.hud.A.C[0xE011 ^ 0xE0E1] = 0xF77E ^ 0xE0E1;
        kotakbaz.rain.module.modules.hud.A.C[0xC182 ^ 0xC00A] = 0xA927 ^ 0xC00A;
        kotakbaz.rain.module.modules.hud.A.C[0x40B4 ^ 0x40B9] = 0x409A ^ 0x40B9;
        kotakbaz.rain.module.modules.hud.A.C[0x8319 ^ 0x83A6] = 0x83C5 ^ 0x83A6;
        kotakbaz.rain.module.modules.hud.A.C[0x48A5 ^ 0x4823] = 0x4811 ^ 0x4823;
        kotakbaz.rain.module.modules.hud.A.C[0xAF2D ^ 0xAFC4] = 0xAFC4 ^ 0xAFC4;
        kotakbaz.rain.module.modules.hud.A.C[0x7E77 ^ 0x7E17] = 0x7E79 ^ 0x7E17;
        kotakbaz.rain.module.modules.hud.A.C[0xA53B ^ 0xA46C] = 0x459 ^ 0xA46C;
        kotakbaz.rain.module.modules.hud.A.C[0x811 ^ 0x8D5] = 0x8E7 ^ 0x8D5;
        kotakbaz.rain.module.modules.hud.A.C[0x34F8 ^ 0x357E] = 0x5C00 ^ 0x357E;
        kotakbaz.rain.module.modules.hud.A.C[0x3EC9 ^ 0x3EC8] = 0xFFFFC115 ^ 0x3EC8;
        kotakbaz.rain.module.modules.hud.A.C[0x6F2D ^ 0x6F8B] = 0x9133 ^ 0x6F8B;
        kotakbaz.rain.module.modules.hud.A.C[0x8AB8 ^ 0x8AEA] = 0x8AD9 ^ 0x8AEA;
        kotakbaz.rain.module.modules.hud.A.C[0x1BAD ^ 0x1AD6] = 0x734 ^ 0x1AD6;
        kotakbaz.rain.module.modules.hud.A.C[0x797D ^ 0x7848] = 0x172E3 ^ 0x7848;
        kotakbaz.rain.module.modules.hud.A.C[0x100B3 ^ 0x100D0] = 0x10065 ^ 0x100D0;
        kotakbaz.rain.module.modules.hud.A.C[0x9072 ^ 0x91F0] = 0x1840 ^ 0x91F0;
        kotakbaz.rain.module.modules.hud.A.C[0x7D7B ^ 0x7D2D] = 0xFFFF829A ^ 0x7D2D;
        kotakbaz.rain.module.modules.hud.A.C[0x8FD6 ^ 0x8F07] = 0xFFFF7093 ^ 0x8F07;
        kotakbaz.rain.module.modules.hud.A.C[0xE6FB ^ 0xE6C2] = 0xE6D8 ^ 0xE6C2;
        kotakbaz.rain.module.modules.hud.A.C[0x37A9 ^ 0x36CC] = 0x725F ^ 0x36CC;
        kotakbaz.rain.module.modules.hud.A.C[0x618A ^ 0x60A8] = 0x647C ^ 0x60A8;
        kotakbaz.rain.module.modules.hud.A.C[0x64AF ^ 0x65BD] = 0x6B9C ^ 0x65BD;
        kotakbaz.rain.module.modules.hud.A.C[0xF7C3 ^ 0xF70A] = 0xF784 ^ 0xF70A;
        kotakbaz.rain.module.modules.hud.A.C[0x4EDF ^ 0x4E2E] = 0x59A3 ^ 0x4E2E;
        kotakbaz.rain.module.modules.hud.A.C[0x9E87 ^ 0x9FF9] = 0x1970F ^ 0x9FF9;
        kotakbaz.rain.module.modules.hud.A.C[0x2B24 ^ 0x2A74] = 0xFFFF43C5 ^ 0x2A74;
        kotakbaz.rain.module.modules.hud.A.C[0x3A31 ^ 0x3A9F] = 0x3AC5 ^ 0x3A9F;
        kotakbaz.rain.module.modules.hud.A.C[0x70ED ^ 0x71B4] = 0xD181 ^ 0x71B4;
        kotakbaz.rain.module.modules.hud.A.C[0x8C38 ^ 0x8C84] = 0x8CCE ^ 0x8C84;
        kotakbaz.rain.module.modules.hud.A.C[0x65C0 ^ 0x64A3] = 0x2030 ^ 0x64A3;
        kotakbaz.rain.module.modules.hud.A.C[0xADA6 ^ 0xAC94] = 0x1A63F ^ 0xAC94;
        kotakbaz.rain.module.modules.hud.A.C[0x10F4A ^ 0x10F24] = 0x10F4A ^ 0x10F24;
        kotakbaz.rain.module.modules.hud.A.C[0x10D18 ^ 0x10DC1] = 0x10D90 ^ 0x10DC1;
        kotakbaz.rain.module.modules.hud.A.C[0x1AD4 ^ 0x1A20] = 0x11D2D ^ 0x1A20;
        kotakbaz.rain.module.modules.hud.A.C[0x981D ^ 0x9813] = 0x9859 ^ 0x9813;
        kotakbaz.rain.module.modules.hud.A.C[0x8930 ^ 0x894A] = 0xFFFF769A ^ 0x894A;
        kotakbaz.rain.module.modules.hud.A.C[0xAF10 ^ 0xAFA4] = 0xAFEA ^ 0xAFA4;
        kotakbaz.rain.module.modules.hud.A.C[0x9E9B ^ 0x9FDA] = 0x608C ^ 0x9FDA;
        kotakbaz.rain.module.modules.hud.A.C[0xBE69 ^ 0xBE34] = 0xFFFF41F4 ^ 0xBE34;
        kotakbaz.rain.module.modules.hud.A.C[0xED75 ^ 0xEC04] = 0x5151 ^ 0xEC04;
        kotakbaz.rain.module.modules.hud.A.C[0x5523 ^ 0x5518] = 0xFFFFAAAE ^ 0x5518;
        kotakbaz.rain.module.modules.hud.A.C[0xE225 ^ 0xE26A] = 0xE228 ^ 0xE26A;
        kotakbaz.rain.module.modules.hud.A.C[0x251F ^ 0x2406] = 0xFFFED67C ^ 0x2406;
        kotakbaz.rain.module.modules.hud.A.C[0xFE72 ^ 0xFF76] = 0x541D ^ 0xFF76;
        kotakbaz.rain.module.modules.hud.A.C[0xFE48 ^ 0xFF30] = 0x1FE3F ^ 0xFF30;
        kotakbaz.rain.module.modules.hud.A.C[0x5175 ^ 0x505B] = 0x1F91 ^ 0x505B;
        kotakbaz.rain.module.modules.hud.A.C[0x76D5 ^ 0x7637] = 0xFFFF89F9 ^ 0x7637;
        kotakbaz.rain.module.modules.hud.A.C[0x8EDB ^ 0x8FC7] = 0xA153 ^ 0x8FC7;
        kotakbaz.rain.module.modules.hud.A.C[0xA65C ^ 0xA624] = 0xA611 ^ 0xA624;
        kotakbaz.rain.module.modules.hud.A.C[0x8D29 ^ 0x8D69] = 0xFFFF72B3 ^ 0x8D69;
        kotakbaz.rain.module.modules.hud.A.C[0xFEFE ^ 0xFEB0] = 0xFE6A ^ 0xFEB0;
        kotakbaz.rain.module.modules.hud.A.C[0x7476 ^ 0x7401] = 0xFFFF8BD1 ^ 0x7401;
        kotakbaz.rain.module.modules.hud.A.C[0xF89D ^ 0xF842] = 0xFFFF07FD ^ 0xF842;
        kotakbaz.rain.module.modules.hud.A.C[0x331A ^ 0x325D] = 0x29C2 ^ 0x325D;
        kotakbaz.rain.module.modules.hud.A.C[0x9CB3 ^ 0x9CFA] = 0xFFFF6322 ^ 0x9CFA;
        kotakbaz.rain.module.modules.hud.A.C[0x4FE8 ^ 0x4F9B] = 0x4FFF ^ 0x4F9B;
        kotakbaz.rain.module.modules.hud.A.C[0xCD8A ^ 0xCCAA] = 0xC87E ^ 0xCCAA;
        kotakbaz.rain.module.modules.hud.A.C[0x603F ^ 0x60A0] = 0x60A0 ^ 0x60A0;
        kotakbaz.rain.module.modules.hud.A.C[0xF114 ^ 0xF022] = 0x1F11A ^ 0xF022;
        kotakbaz.rain.module.modules.hud.A.C[0x7708 ^ 0x760F] = 0xA2C1 ^ 0x760F;
        kotakbaz.rain.module.modules.hud.A.C[0xFB47 ^ 0xFA20] = 0xFA97 ^ 0xFA20;
        kotakbaz.rain.module.modules.hud.A.C[0x562F ^ 0x5610] = 0x5638 ^ 0x5610;
        kotakbaz.rain.module.modules.hud.A.C[0x6914 ^ 0x6937] = 0xFFFF96D1 ^ 0x6937;
        kotakbaz.rain.module.modules.hud.A.C[0x2F73 ^ 0x2F63] = 0xFFFFD0DD ^ 0x2F63;
        kotakbaz.rain.module.modules.hud.A.C[0x216A ^ 0x21D3] = 0x21BA ^ 0x21D3;
        kotakbaz.rain.module.modules.hud.A.C[0x8BE9 ^ 0x8BE9] = 0x8BF0 ^ 0x8BE9;
        kotakbaz.rain.module.modules.hud.A.C[0x8F5 ^ 0x867] = 0xFFFFF780 ^ 0x867;
        kotakbaz.rain.module.modules.hud.A.C[0x283B ^ 0x2831] = 0xFFFFD7CB ^ 0x2831;
        kotakbaz.rain.module.modules.hud.A.C[0xA25B ^ 0xA275] = 0xFFFF5D80 ^ 0xA275;
        kotakbaz.rain.module.modules.hud.A.C[0xCD39 ^ 0xCC6F] = 0x6C53 ^ 0xCC6F;
    }
}

