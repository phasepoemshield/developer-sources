/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 */
package kotakbaz.rain.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from kotakbaz.rain.module.modules.player.i
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0010J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010$\u00a8\u0006'"}, d2={"Lkotakbaz/rain/module/modules/player/SoundsControllerModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lnet/minecraft/class_2960;", "soundEventId", "soundResourceId", "", "getVolumeMultiplier", "(Lnet/minecraft/class_2960;Lnet/minecraft/class_2960;)Ljava/lang/Float;", "", "shouldMutePlayback", "(Lnet/minecraft/class_2960;Lnet/minecraft/class_2960;)Z", "", "normalized", "isExpBottleSound", "(Ljava/lang/String;)Z", "isTridentReturnSound", "isFireworkSound", "", "normalizedKeys", "(Lnet/minecraft/class_2960;Lnet/minecraft/class_2960;)Ljava/util/Set;", "value", "normalize", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "expBottle", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "expBottleVolume", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "tridentReturn", "tridentReturnVolume", "firework", "fireworkVolume", "expBottleMarkers", "Ljava/util/Set;", "tridentReturnMarkers", "fireworkMarkers", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nSoundsControllerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoundsControllerModule.kt\nkotakbaz/rain/module/modules/player/SoundsControllerModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1807#2,3:87\n1807#2,3:90\n1807#2,3:93\n1807#2,3:97\n1807#2,3:100\n1807#2,3:103\n1#3:96\n*S KotlinDebug\n*F\n+ 1 SoundsControllerModule.kt\nkotakbaz/rain/module/modules/player/SoundsControllerModule\n*L\n46#1:87,3\n47#1:90,3\n48#1:93,3\n58#1:97,3\n62#1:100,3\n66#1:103,3\n*E\n"})
public final class i_0
extends a_0 {
    @NotNull
    public static final i_0 INSTANCE;
    @NotNull
    private static final c a;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 A;
    @NotNull
    private static final c b;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 B;
    @NotNull
    private static final c c;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 C;
    @NotNull
    private static final Set<String> d;
    @NotNull
    private static final Set<String> D;
    @NotNull
    private static final Set<String> e;
    private static Object[] E;
    private static Object F;
    private static Object[] g;
    private static Object[] f;
    private static Object[] G;
    public static int[] h;

    private i_0() {
        int n = h[0];
        n ^= h[1];
        n ^= h[2];
        int n2 = h[3];
        n2 ^= h[4];
        int n3 = h[6];
        n3 += h[7];
        int n4 = h[9];
        n4 += h[10];
        super((String)E[n] + (String)E[n2 -= h[5]], kotakbaz.rain.client.extensions.a_0.getPLAYER(), (String)E[n3 -= h[8]] + (String)E[n4 -= h[11]]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final Float getVolumeMultiplier(@Nullable class_2960 class_29602, @Nullable class_2960 class_29603) {
        int n;
        Float f2;
        block17: {
            String string;
            Iterable iterable;
            long l = -531083476382917173L;
            long l2 = 7708811432540594966L;
            long l3 = 2770570396765156843L;
            if (!this.isEnabled()) {
                return null;
            }
            Set<String> set = this.normalizedKeys(class_29602, class_29603);
            if (set.isEmpty()) {
                return null;
            }
            if (((Boolean)a.getValue()).booleanValue()) {
                int n2;
                block15: {
                    iterable = set;
                    long l4 = l3;
                    int n3 = h[12];
                    n3 ^= h[13];
                    l3 = l4 ^ (0L ^ l4) & -1L << (n3 -= h[14]);
                    if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                        int n4 = h[15];
                        n4 += h[16];
                        n2 = n4 += h[17];
                    } else {
                        for (Object t2 : iterable) {
                            string = (String)t2;
                            long l5 = l3;
                            int n5 = h[18];
                            n5 += h[19];
                            l3 = l5 ^ (0L ^ l5) & -1L >>> (n5 -= h[20]);
                            if (!this.isExpBottleSound(string)) continue;
                            int n6 = h[21];
                            n6 ^= h[22];
                            n2 = n6 += h[23];
                            break block15;
                        }
                        int n7 = h[24];
                        n7 ^= h[25];
                        n2 = n7 += h[26];
                    }
                }
                if (n2 != 0) {
                    f2 = Float.valueOf(((Number)A.getValue()).floatValue() / 10.0f);
                    return f2;
                }
            }
            if (((Boolean)b.getValue()).booleanValue()) {
                int n8;
                block16: {
                    iterable = set;
                    long l6 = l3;
                    int n9 = h[27];
                    n9 ^= h[28];
                    l3 = l6 ^ (0L ^ l6) & -1L << (n9 -= h[29]);
                    if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                        int n10 = h[30];
                        n8 = n10 ^= h[31];
                    } else {
                        for (Object t2 : iterable) {
                            string = (String)t2;
                            long l7 = l3;
                            int n11 = h[32];
                            n11 ^= h[33];
                            l3 = l7 ^ (0L ^ l7) & -1L >>> (n11 += h[34]);
                            if (!this.isTridentReturnSound(string)) continue;
                            int n12 = h[35];
                            n12 -= h[36];
                            n8 = n12 += h[37];
                            break block16;
                        }
                        int n13 = h[38];
                        n13 ^= h[39];
                        n8 = n13 -= h[40];
                    }
                }
                if (n8 != 0) {
                    f2 = Float.valueOf(((Number)B.getValue()).floatValue() / 10.0f);
                    return f2;
                }
            }
            if ((Boolean)c.getValue() == false) return null;
            iterable = set;
            long l8 = l3;
            int n14 = h[41];
            n14 += h[42];
            l3 = l8 ^ (0L ^ l8) & -1L << (n14 += h[43]);
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                int n15 = h[44];
                n15 ^= h[45];
                n = n15 += h[46];
            } else {
                for (Object t2 : iterable) {
                    string = (String)t2;
                    long l9 = l3;
                    int n16 = h[47];
                    n16 += h[48];
                    l3 = l9 ^ (0L ^ l9) & -1L >>> (n16 ^= h[49]);
                    if (!this.isFireworkSound(string)) continue;
                    int n17 = h[50];
                    n17 ^= h[51];
                    n = n17 ^= h[52];
                    break block17;
                }
                int n18 = h[53];
                n18 -= h[54];
                n = n18 += h[55];
            }
        }
        if (n == 0) return null;
        f2 = Float.valueOf(((Number)C.getValue()).floatValue() / 10.0f);
        return f2;
    }

    public final boolean shouldMutePlayback(@Nullable class_2960 class_29602, @Nullable class_2960 class_29603) {
        int n;
        long l = -3152122791794568136L;
        Float f2 = this.getVolumeMultiplier(class_29602, class_29603);
        if (f2 != null) {
            int n2;
            float f3 = ((Number)f2).floatValue();
            long l2 = l;
            int n3 = h[56];
            n3 += h[57];
            l = l2 ^ (0L ^ l2) & -1L << (n3 ^= h[58]);
            if (f3 <= 0.0f) {
                int n4 = h[59];
                n4 ^= h[60];
                n2 = n4 += h[61];
            } else {
                int n5 = h[62];
                n5 -= h[63];
                n2 = n5 ^= h[64];
            }
            int n6 = h[65];
            n6 += h[66];
            if (n2 == (n6 += h[67])) {
                int n7 = h[68];
                n7 ^= h[69];
                n = n7 ^= h[70];
            } else {
                int n8 = h[71];
                n8 ^= h[72];
                n = n8 += h[73];
            }
        } else {
            int n9 = h[74];
            n9 ^= h[75];
            n = n9 -= h[76];
        }
        return n != 0;
    }

    private final boolean isExpBottleSound(String string) {
        int n;
        block3: {
            long l = -1667657318104572244L;
            Iterable iterable = d;
            long l2 = l;
            int n2 = h[77];
            n2 += h[78];
            l = l2 ^ (0L ^ l2) & -1L << (n2 -= h[79]);
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                int n3 = h[80];
                n3 ^= h[81];
                n = n3 += h[82];
            } else {
                for (Object t2 : iterable) {
                    CharSequence charSequence = (CharSequence)t2;
                    long l3 = l;
                    int n4 = h[83];
                    n4 -= h[84];
                    l = l3 ^ (0L ^ l3) & -1L >>> (n4 ^= h[85]);
                    boolean bl = h[86];
                    bl ^= h[87];
                    int n5 = h[89];
                    n5 -= h[90];
                    if (!StringsKt.contains$default((CharSequence)string, charSequence, bl += h[88], n5 += h[91], null)) continue;
                    int n6 = h[92];
                    n6 += h[93];
                    n = n6 += h[94];
                    break block3;
                }
                int n7 = h[95];
                n7 -= h[96];
                n = n7 -= h[97];
            }
        }
        return n != 0;
    }

    private final boolean isTridentReturnSound(String string) {
        int n;
        block3: {
            long l = -4791564667128428432L;
            Iterable iterable = D;
            long l2 = l;
            int n2 = h[98];
            n2 ^= h[99];
            l = l2 ^ (0L ^ l2) & -1L << (n2 ^= h[100]);
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                int n3 = h[101];
                n3 -= h[102];
                n = n3 += h[103];
            } else {
                for (Object t2 : iterable) {
                    CharSequence charSequence = (CharSequence)t2;
                    long l3 = l;
                    int n4 = h[104];
                    n4 += h[105];
                    l = l3 ^ (0L ^ l3) & -1L >>> (n4 -= h[106]);
                    boolean bl = h[107];
                    bl -= h[108];
                    int n5 = h[110];
                    n5 += h[111];
                    if (!StringsKt.contains$default((CharSequence)string, charSequence, bl ^= h[109], n5 -= h[112], null)) continue;
                    int n6 = h[113];
                    n6 += h[114];
                    n = n6 += h[115];
                    break block3;
                }
                int n7 = h[116];
                n7 -= h[117];
                n = n7 ^= h[118];
            }
        }
        return n != 0;
    }

    private final boolean isFireworkSound(String string) {
        int n;
        block3: {
            long l = 7883841434828236122L;
            Iterable iterable = e;
            long l2 = l;
            int n2 = h[119];
            n2 += h[120];
            l = l2 ^ (0L ^ l2) & -1L << (n2 += h[121]);
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                int n3 = h[122];
                n3 ^= h[123];
                n = n3 += h[124];
            } else {
                for (Object t2 : iterable) {
                    CharSequence charSequence = (CharSequence)t2;
                    long l3 = l;
                    int n4 = h[125];
                    n4 -= h[126];
                    l = l3 ^ (0L ^ l3) & -1L >>> (n4 ^= h[127]);
                    boolean bl = h[128];
                    bl ^= h[129];
                    int n5 = h[131];
                    n5 -= h[132];
                    if (!StringsKt.contains$default((CharSequence)string, charSequence, bl -= h[130], n5 -= h[133], null)) continue;
                    int n6 = h[134];
                    n6 += h[135];
                    n = n6 ^= h[136];
                    break block3;
                }
                int n7 = h[137];
                n7 -= h[138];
                n = n7 += h[139];
            }
        }
        return n != 0;
    }

    private final Set<String> normalizedKeys(class_2960 class_29602, class_2960 class_29603) {
        Set<String> set;
        block1: {
            class_2960 class_29604;
            long l = 818630700283086863L;
            long l2 = -6505108711351889668L;
            Set<String> set2 = set = SetsKt.createSetBuilder();
            long l3 = l;
            int n = h[140];
            n ^= h[141];
            l = l3 ^ (0L ^ l3) & -1L << (n -= h[142]);
            class_2960 class_29605 = class_29602;
            if (class_29605 != null) {
                class_29604 = class_29605;
                long l4 = l2;
                int n2 = h[143];
                n2 -= h[144];
                l2 = l4 ^ (0L ^ l4) & -1L << (n2 -= h[145]);
                String string = class_29604.toString();
                int n3 = h[146];
                n3 ^= h[147];
                Intrinsics.checkNotNullExpressionValue(string, (String)E[n3 ^= h[148]]);
                set2.add(INSTANCE.normalize(string));
                String string2 = class_29604.method_12832();
                int n4 = h[149];
                n4 ^= h[150];
                Intrinsics.checkNotNullExpressionValue(string2, (String)E[n4 -= h[151]]);
                set2.add(INSTANCE.normalize(string2));
            }
            class_2960 class_29606 = class_29603;
            if (class_29606 == null) break block1;
            class_29604 = class_29606;
            long l5 = l2;
            int n5 = h[152];
            n5 -= h[153];
            l2 = l5 ^ (0L ^ l5) & -1L << (n5 -= h[154]);
            String string = class_29604.toString();
            int n6 = h[155];
            n6 ^= h[156];
            Intrinsics.checkNotNullExpressionValue(string, (String)E[n6 ^= h[157]]);
            set2.add(INSTANCE.normalize(string));
            String string3 = class_29604.method_12832();
            int n7 = h[158];
            n7 += h[159];
            Intrinsics.checkNotNullExpressionValue(string3, (String)E[n7 += h[160]]);
            set2.add(INSTANCE.normalize(string3));
        }
        return SetsKt.build(set);
    }

    private final String normalize(String string) {
        String string2 = string;
        Locale locale = Locale.ROOT;
        int n = h[161];
        n ^= h[162];
        Intrinsics.checkNotNullExpressionValue(locale, (String)E[n ^= h[163]]);
        String string3 = string2.toLowerCase(locale);
        int n2 = h[164];
        n2 += h[165];
        int n3 = h[167];
        n3 ^= h[168];
        Intrinsics.checkNotNullExpressionValue(string3, (String)E[n2 -= h[166]] + (String)E[n3 -= h[169]]);
        return string3;
    }

    private static final boolean expBottleVolume$lambda$0() {
        return (Boolean)a.getValue();
    }

    private static final boolean tridentReturnVolume$lambda$0() {
        return (Boolean)b.getValue();
    }

    private static final boolean fireworkVolume$lambda$0() {
        return (Boolean)c.getValue();
    }

    static {
        i_0.b();
        long l = -2849317681778200562L;
        long l2 = 8499738086889717380L;
        long l3 = -456510764674921630L;
        long l4 = 9087622325312293953L;
        long l5 = -7495014080520917613L;
        long l6 = -6718378237325686632L;
        long l7 = -6492721269710626161L;
        long l8 = -3078254588768462862L;
        long l9 = 6223062798393165755L;
        long l10 = -3836127567562062344L;
        long l11 = 390321797773648458L;
        long l12 = -8686592072833403395L;
        long l13 = 2529489054812096210L;
        long l14 = 1969366826776372924L;
        int n = h[170];
        n -= h[171];
        E = new Object[n += h[172]];
        long l15 = l14;
        int n2 = h[173];
        n2 -= h[174];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= h[175]);
        Object[] objectArray = new Object[h[176]];
        objectArray[i_0.h[177]] = f;
        objectArray[i_0.h[178]] = h[179];
        int n3 = h[180];
        Object object = i_0.A()[h[181]];
        if (object == null) {
            char[] cArray = "\ue356\ue35a\ue380\ue368\ue37c\ue369\ue35b\ue35b\ue374\ue349\ue36a\ue343\ue343\ue348\ue369\ue388\ue367\ue365\ue349\ue34a\ue379\ue343\ue353\ue382\ue36c\ue368\ue379\ue383\ue366\ue343\ue364\ue367\ue35c\ue34b\ue342\ue37a\ue37b\ue388\ue354\ue354\ue341\ue364\ue365\ue37c\ue380\ue366\ue385\ue376\ue383\ue354\ue367\ue379\ue377\ue37b\ue378\ue385\ue35b\ue365\ue355\ue35a\ue356\ue365\ue349\ue374\ue378\ue37c\ue379\ue346\ue341\ue37b\ue36b\ue375\ue349\ue366\ue361\ue369\ue347\ue362\ue374\ue37c\ue361\ue35c\ue383\ue361\ue346\ue377\ue37a\ue368\ue364\ue388\ue36c\ue37b\ue365\ue354\ue358\ue387\ue344\ue367\ue38c\ue354\ue384\ue36c\ue355\ue388\ue38b\ue35d\ue389\ue386\ue38a\ue346\ue345\ue365\ue347\ue359\ue379\ue35c\ue375\ue35c\ue375\ue355\ue382\ue37f\ue344\ue34a\ue36c\ue357\ue386\ue363\ue33d\ue360\ue342\ue377\ue345\ue388\ue353\ue347\ue35c\ue375\ue388\ue35f\ue347\ue345\ue384\ue35b\ue356\ue366\ue379\ue360\ue361\ue374\ue35c\ue366\ue388\ue369\ue35d\ue37d\ue389\ue389\ue33d\ue341\ue348\ue384\ue389\ue37d\ue360\ue344\ue35a\ue341\ue37d\ue341\ue35d\ue357\ue362\ue361\ue369\ue35d\ue379\ue34b\ue382\ue35a\ue354\ue37b\ue366\ue376\ue382\ue365\ue35f\ue378\ue378\ue36a\ue35e\ue375\ue37e\ue356\ue385\ue35b\ue380\ue375\ue365\ue37d\ue367\ue384\ue363\ue36a\ue378\ue347\ue35a\ue37f\ue37f\ue355\ue37a\ue346\ue359\ue364\ue374\ue35c\ue376\ue389\ue358\ue38c\ue369\ue357\ue362\ue341\ue344\ue384\ue384\ue378\ue37e\ue376\ue383\ue33d\ue356\ue375\ue35b\ue356\ue35c\ue387\ue36a\ue38c\ue379\ue35f\ue36b\ue386\ue342\ue373\ue344\ue37a\ue34b\ue37b\ue35a\ue359\ue37a\ue382\ue36b\ue356\ue373\ue343\ue37b\ue345\ue36c\ue377\ue343\ue367\ue381\ue353\ue383\ue383\ue34a\ue363\ue364\ue384\ue389\ue384\ue361\ue360\ue389\ue366\ue38b\ue349\ue369\ue385\ue35f\ue385\ue368\ue360\ue353\ue387\ue35c\ue35a\ue349\ue361\ue349\ue385\ue36b\ue38a\ue381\ue35a\ue35c\ue37e\ue38a\ue379\ue380\ue380\ue344\ue355\ue374\ue36b\ue36a\ue374\ue342\ue37f\ue37c\ue381\ue361\ue37c\ue376\ue388\ue342\ue389\ue379\ue369\ue376\ue35d\ue36c\ue343\ue346\ue38a\ue37d\ue360\ue357\ue357\ue374\ue366\ue345\ue359\ue386\ue359\ue35a\ue34a\ue34b\ue363\ue354\ue38a\ue374\ue35d\ue360\ue362\ue368\ue35b\ue361\ue389\ue353\ue388\ue34b\ue37d\ue36b\ue36c\ue37a\ue33d\ue387\ue356\ue349\ue359\ue346\ue35f\ue345\ue37c\ue373\ue34b\ue386\ue358\ue362\ue385\ue380\ue354\ue366\ue367\ue377\ue33d\ue374\ue368\ue37b\ue389\ue35b\ue357\ue35e\ue360\ue374\ue34b\ue359\ue356\ue389\ue389\ue346\ue37f\ue365\ue38c\ue344\ue381\ue34a\ue378\ue37f\ue388\ue365\ue37d\ue383\ue37e\ue355\ue36b\ue35f\ue368\ue36c\ue36c\ue344\ue37a\ue346\ue384\ue37b\ue376\ue368\ue355\ue34a\ue376\ue38a\ue37b\ue37e\ue343\ue364\ue344\ue355\ue344\ue386\ue384\ue354\ue37b\ue38a\ue346\ue360\ue36c\ue363\ue34a\ue344\ue36c\ue36c\ue365\ue358\ue376\ue35e\ue35b\ue389\ue35b\ue34b\ue37b\ue358\ue355\ue353\ue37d\ue348\ue37c\ue35a\ue348\ue367\ue348\ue377\ue353\ue388\ue354\ue367\ue33d\ue376\ue36c\ue369\ue373\ue386\ue362\ue367\ue364\ue355\ue343\ue37e\ue37c\ue37b\ue379\ue345\ue384\ue368\ue374\ue38c\ue342\ue356\ue37a\ue379\ue353\ue35d\ue355\ue381\ue376\ue359\ue342\ue378\ue378\ue341\ue359\ue348\ue357\ue389\ue35f\ue38c\ue380\ue365\ue356\ue357\ue37d\ue37a\ue36b\ue388\ue382\ue35a\ue382\ue35b\ue37e\ue369\ue348\ue342\ue366\ue358\ue358\ue37e\ue382\ue383\ue375\ue348\ue387\ue341\ue347\ue358\ue359\ue341\ue382\ue38c\ue382\ue361\ue346\ue357\ue383\ue378\ue376\ue357\ue389\ue388\ue36c\ue388\ue37c\ue362\ue357\ue376\ue36c\ue36b\ue346\ue345\ue359\ue37d\ue341\ue343\ue357\ue36c\ue35f\ue368\ue367\ue349\ue375\ue378\ue388\ue355\ue362\ue374\ue37d\ue373\ue345\ue35e\ue386\ue385\ue358\ue35a\ue353\ue387\ue364\ue373\ue37b\ue364\ue37d\ue37f\ue38b\ue346\ue34a\ue376\ue341\ue389\ue37b\ue38b\ue35a\ue381\ue356\ue38a\ue369\ue38a\ue387\ue367\ue347\ue368\ue37f\ue367\ue384\ue341\ue362\ue37e\ue37d\ue349\ue37d\ue363\ue383\ue366\ue377\ue368\ue38a\ue33d\ue373\ue363\ue37d\ue365\ue375\ue347\ue35f\ue37e\ue388\ue35f\ue33d\ue341\ue359\ue359\ue353\ue37f\ue33d\ue37c\ue36b\ue345\ue349\ue35a\ue343\ue376\ue37b\ue367\ue356\ue386\ue38a\ue377\ue375\ue387\ue33d\ue369\ue38b\ue387\ue346\ue349\ue35b\ue367\ue364\ue388\ue357\ue355\ue35e\ue377\ue368\ue343\ue36c\ue349\ue345\ue35b\ue344\ue377\ue385\ue373\ue35a\ue382\ue35b\ue375\ue36a\ue35c\ue367\ue349\ue344\ue343\ue36a\ue34b\ue35e\ue36c\ue343\ue356\ue38a\ue369\ue385\ue33d\ue376\ue363\ue38b\ue360\ue378\ue35d\ue37f\ue355\ue369\ue361\ue358\ue382\ue385\ue358\ue341\ue388\ue361\ue353\ue361\ue361\ue362\ue373\ue386\ue381\ue361\ue35b\ue381\ue361\ue35a\ue376\ue361\ue387\ue388\ue35d\ue382\ue387\ue356\ue38a\ue380\ue382\ue359\ue389\ue381\ue36c\ue38b\ue386\ue360\ue366\ue37d\ue348\ue367\ue37d\ue386\ue383\ue365\ue36a\ue363\ue385\ue377\ue373\ue37c\ue38a\ue349\ue356\ue363\ue38b\ue35e\ue382\ue34b\ue355\ue373\ue38a\ue33d\ue35e\ue35e\ue35e\ue375\ue359\ue386\ue364\ue35e\ue365\ue35d\ue388\ue384\ue387\ue387\ue37b\ue37e\ue373\ue383\ue38a\ue37d\ue38a\ue35d\ue367\ue360\ue34b\ue357\ue376\ue368\ue361\ue342\ue389\ue346\ue367\ue34a\ue387\ue35f\ue379\ue383\ue380\ue37e\ue373\ue355\ue342\ue383\ue357\ue378\ue37f\ue381\ue368\ue38b\ue359\ue358\ue34b\ue360\ue360\ue35e".toCharArray();
            for (int i2 = h[182]; i2 < h[183]; ++i2) {
                int n4 = cArray[i2];
                n4 += h[184];
                n4 += h[185];
                n4 -= h[186];
                n4 += h[187];
                n4 -= h[188];
                n4 -= h[189];
                n4 -= h[190];
                n4 += h[191];
                n4 -= h[192];
                n4 += h[193];
                n4 += h[194];
                n4 += h[195];
                cArray[i2] = (char)(n4 -= h[196]);
            }
            object = i_0.A()[i_0.h[197]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)i_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = h[198];
        n5 ^= h[199];
        l5 = l16 ^ (0x1D100000000L ^ l16) & -1L << (n5 += h[200]);
        long l17 = l12;
        int n6 = h[201];
        n6 -= h[202];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= h[203]);
        while (true) {
            int n7 = h[204];
            n7 += h[205];
            if ((int)l12 >= (int)(l5 >>> (n7 -= h[206]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = h[207];
            n9 ^= h[208];
            int n10 = h[210];
            n10 ^= h[211];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= h[209])) & -1L >>> (n10 += h[212]);
            long l19 = l8;
            int n11 = h[213];
            n11 -= h[214];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += h[215]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = h[216];
            n13 -= h[217];
            int n14 = h[219];
            n14 -= h[220];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += h[218])) & -1L >>> (n14 -= h[221]);
            int n15 = h[222];
            n15 ^= h[223];
            long l21 = l9;
            int n16 = h[225];
            n16 -= h[226];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= h[224]) ^ l21) & -1L << (n16 ^= h[227]);
            int n17 = h[228];
            n17 += h[229];
            n17 ^= h[230];
            int n18 = h[231];
            n18 -= h[232];
            long l22 = l11;
            int n19 = h[234];
            n19 ^= h[235];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += h[233]))) ^ l22) & -1L >>> (n19 -= h[236]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = h[237];
            n20 ^= h[238];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= h[239]);
            while (true) {
                int n21 = h[240];
                n21 -= h[241];
                if ((int)(l13 >>> (n21 += h[242])) >= (int)l11) break;
                int n22 = h[243];
                n22 -= h[244];
                int n23 = h[246];
                n23 += h[247];
                cArray2[(int)(l13 >>> (n22 += i_0.h[245]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= h[248]))];
                l13 += 0x100000000L;
            }
            int n24 = h[249];
            n24 += h[250];
            int n25 = (int)(l14 >>> (n24 -= h[251]));
            l14 += 0x100000000L;
            i_0.E[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = h[252];
            n26 ^= h[253];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= h[254]);
        }
        INSTANCE = new i_0();
        int n27 = h[255];
        n27 -= h[256];
        boolean bl = h[258];
        bl += h[259];
        a = INSTANCE.boolean((String)E[n27 -= h[257]], bl ^= h[260]);
        int n28 = h[261];
        n28 += h[262];
        int n29 = h[264];
        n29 += h[265];
        A = INSTANCE.slider((String)E[n28 += h[263]] + (String)E[n29 ^= h[266]], 10.0f, 0.0f, 10.0f, 1.0f).setVisible(i_0::expBottleVolume$lambda$0);
        int n30 = h[267];
        n30 += h[268];
        int n31 = h[270];
        n31 += h[271];
        boolean bl2 = h[273];
        bl2 -= h[274];
        b = INSTANCE.boolean((String)E[n30 ^= h[269]] + (String)E[n31 += h[272]], bl2 ^= h[275]);
        int n32 = h[276];
        n32 += h[277];
        int n33 = h[279];
        n33 ^= h[280];
        B = INSTANCE.slider((String)E[n32 ^= h[278]] + (String)E[n33 ^= h[281]], 10.0f, 0.0f, 10.0f, 1.0f).setVisible(i_0::tridentReturnVolume$lambda$0);
        int n34 = h[282];
        n34 ^= h[283];
        boolean bl3 = h[285];
        bl3 -= h[286];
        c = INSTANCE.boolean((String)E[n34 += h[284]], bl3 ^= h[287]);
        int n35 = h[288];
        n35 -= h[289];
        int n36 = h[291];
        n36 -= h[292];
        C = INSTANCE.slider((String)E[n35 += h[290]] + (String)E[n36 += h[293]], 10.0f, 0.0f, 10.0f, 1.0f).setVisible(i_0::fireworkVolume$lambda$0);
        int n37 = h[294];
        n37 ^= h[295];
        String[] stringArray = new String[n37 ^= h[296]];
        int n38 = h[297];
        n38 ^= h[298];
        int n39 = h[300];
        n39 += h[301];
        int n40 = h[303];
        n40 ^= h[304];
        stringArray[n38 += i_0.h[299]] = (String)E[n39 -= h[302]] + (String)E[n40 ^= h[305]];
        int n41 = h[306];
        n41 ^= h[307];
        int n42 = h[309];
        n42 ^= h[310];
        stringArray[n41 += i_0.h[308]] = (String)E[n42 ^= h[311]];
        int n43 = h[312];
        n43 ^= h[313];
        int n44 = h[315];
        n44 += h[316];
        stringArray[n43 -= i_0.h[314]] = (String)E[n44 -= h[317]];
        d = SetsKt.setOf(stringArray);
        int n45 = h[318];
        n45 ^= h[319];
        stringArray = new String[n45 += h[320]];
        int n46 = h[321];
        n46 -= h[322];
        int n47 = h[324];
        n47 -= h[325];
        int n48 = h[327];
        n48 -= h[328];
        stringArray[n46 ^= i_0.h[323]] = (String)E[n47 += h[326]] + (String)E[n48 ^= h[329]];
        int n49 = h[330];
        n49 ^= h[331];
        int n50 = h[333];
        n50 += h[334];
        int n51 = h[336];
        n51 += h[337];
        stringArray[n49 += i_0.h[332]] = (String)E[n50 += h[335]] + (String)E[n51 -= h[338]];
        int n52 = h[339];
        n52 += h[340];
        int n53 = h[342];
        n53 -= h[343];
        stringArray[n52 ^= i_0.h[341]] = (String)E[n53 -= h[344]];
        int n54 = h[345];
        n54 ^= h[346];
        int n55 = h[348];
        n55 ^= h[349];
        stringArray[n54 ^= i_0.h[347]] = (String)E[n55 ^= h[350]];
        D = SetsKt.setOf(stringArray);
        int n56 = h[351];
        n56 += h[352];
        stringArray = new String[n56 -= h[353]];
        int n57 = h[354];
        n57 += h[355];
        int n58 = h[357];
        n58 -= h[358];
        stringArray[n57 += i_0.h[356]] = (String)E[n58 += h[359]];
        int n59 = h[360];
        n59 += h[361];
        int n60 = h[363];
        n60 -= h[364];
        stringArray[n59 ^= i_0.h[362]] = (String)E[n60 += h[365]];
        int n61 = h[366];
        n61 ^= h[367];
        int n62 = h[369];
        n62 -= h[370];
        stringArray[n61 -= i_0.h[368]] = (String)E[n62 += h[371]];
        int n63 = h[372];
        n63 -= h[373];
        int n64 = h[375];
        n64 ^= h[376];
        stringArray[n63 -= i_0.h[374]] = (String)E[n64 ^= h[377]];
        e = SetsKt.setOf(stringArray);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[h[378]];
        String string = (String)object[h[379]];
        object = object[h[380]];
        Object[] objectArray = g;
        if (g == null) {
            objectArray = g = new Object[h[381]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[h[382]];
                f = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[h[384] ^ h[385]];
                byArray[i_0.h[386] ^ i_0.h[387]] = h[388] ^ h[389];
                byArray[i_0.h[390] ^ i_0.h[391]] = h[392] ^ h[393];
                byArray[i_0.h[394] ^ i_0.h[395]] = h[396] ^ h[397];
                byArray[i_0.h[398] ^ i_0.h[399]] = 0x5019 ^ 0x5068;
                byArray[0xEC92 ^ 0xEC91] = 0xEC90 ^ 0xEC91;
                byArray[0xE060 ^ 0xE061] = 0xFFFF1FE6 ^ 0xE061;
                byArray[0x1A0A ^ 0x1A04] = 0x1A1E ^ 0x1A04;
                byArray[0xE95 ^ 0xE98] = 0xFFFFF128 ^ 0xE98;
                byArray[0x92F3 ^ 0x92F8] = 0xFFFF6D7D ^ 0x92F8;
                byArray[0xFEE7 ^ 0xFEEE] = 0xFFFF0163 ^ 0xFEEE;
                byArray[0x3A8E ^ 0x3A8E] = 0x3A9B ^ 0x3A8E;
                byArray[0x6820 ^ 0x6825] = 0x686A ^ 0x6825;
                byArray[0xED18 ^ 0xED1F] = 0xED2C ^ 0xED1F;
                byArray[0xD7F ^ 0xD79] = 0xD64 ^ 0xD79;
                byArray[0x9B11 ^ 0x9B1D] = 0x9B0E ^ 0x9B1D;
                byArray[0xE7F8 ^ 0xE7F2] = 0xFFFF187B ^ 0xE7F2;
                objectArray2[i_0.h[383]] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (F == null) {
                byte[] byArray2 = new byte[0xF0CD ^ 0xF0ED];
                byArray2[0x35E7 ^ 0x35E0] = 0xFFFFCA0B ^ 0x35E0;
                byArray2[0xB465 ^ 0xB479] = 0xB407 ^ 0xB479;
                byArray2[0xB1B3 ^ 0xB1A4] = 0xFFFF4E37 ^ 0xB1A4;
                byArray2[0x6C2D ^ 0x6C22] = 0xFFFF93F0 ^ 0x6C22;
                byArray2[0xD78D ^ 0xD78E] = 0xD7EB ^ 0xD78E;
                byArray2[0xE5CF ^ 0xE5D2] = 0xE5EE ^ 0xE5D2;
                byArray2[0x28D5 ^ 0x28C5] = 0x28BD ^ 0x28C5;
                byArray2[0x52FA ^ 0x52E2] = 0x52A3 ^ 0x52E2;
                byArray2[0xBEE0 ^ 0xBEF3] = 0xBEB1 ^ 0xBEF3;
                byArray2[0x855D ^ 0x8549] = 0x8553 ^ 0x8549;
                byArray2[0x89AA ^ 0x89B1] = 0xFFFF7621 ^ 0x89B1;
                byArray2[0xBAE4 ^ 0xBAEC] = 0xBAAB ^ 0xBAEC;
                byArray2[0x22DE ^ 0x22D0] = 0xFFFFDD34 ^ 0x22D0;
                byArray2[0xCDEB ^ 0xCDF4] = 0xCDC7 ^ 0xCDF4;
                byArray2[0x9307 ^ 0x9302] = 0x9379 ^ 0x9302;
                byArray2[0x93B4 ^ 0x93A2] = 0xFFFF6C1D ^ 0x93A2;
                byArray2[0x9B5A ^ 0x9B56] = 0xFFFF64CB ^ 0x9B56;
                byArray2[0x2005 ^ 0x201F] = 0xFFFFDFDC ^ 0x201F;
                byArray2[0x151E ^ 0x150B] = 0xFFFFEADE ^ 0x150B;
                byArray2[0xE586 ^ 0xE584] = 0xE5C8 ^ 0xE584;
                byArray2[0xFA6B ^ 0xFA66] = 0xFA15 ^ 0xFA66;
                byArray2[0xE393 ^ 0xE392] = 0xFFFF1C2D ^ 0xE392;
                byArray2[0x3753 ^ 0x3757] = 0x3748 ^ 0x3757;
                byArray2[0xD267 ^ 0xD261] = 0xFFFF2DAE ^ 0xD261;
                byArray2[0xC68D ^ 0xC69F] = 0xC6D8 ^ 0xC69F;
                byArray2[0xC836 ^ 0xC82F] = 0xFFFF37E1 ^ 0xC82F;
                byArray2[0x396 ^ 0x39C] = 0xFFFFFC09 ^ 0x39C;
                byArray2[0x181B ^ 0x181B] = 0xFFFFE79B ^ 0x181B;
                byArray2[0xA629 ^ 0xA638] = 0xA60F ^ 0xA638;
                byArray2[0xC076 ^ 0xC068] = 0xC06E ^ 0xC068;
                byArray2[0xC220 ^ 0xC22B] = 0xFFFF3DC6 ^ 0xC22B;
                byArray2[0xFA9D ^ 0xFA94] = 0xFA87 ^ 0xFA94;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = i_0.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u3330\u32fa\u3335\u32f4\u332e\u29ea\u3331\u337b\u3324\u3388\u3328\u330f\u3353\u338d\u333d\u3328\u32f3\u29e3".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 += 64401;
                        n2 ^= 0x9C2;
                        n2 += 37506;
                        n2 ^= 0xE713;
                        n2 ^= 0x95C4;
                        n2 -= 11797;
                        n2 += 1849;
                        n2 ^= 0x952A;
                        n2 -= 3403;
                        n2 ^= 0xA79E;
                        cArray[i2] = (char)(n2 -= 33599);
                    }
                    object4 = i_0.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[12] = 102;
                byArray4[10] = 121;
                byArray4[2] = 49;
                byArray4[14] = 104;
                byArray4[13] = -51;
                byArray4[5] = -103;
                byArray4[6] = 28;
                byArray4[3] = -72;
                byArray4[15] = 87;
                byArray4[4] = 30;
                byArray4[8] = 66;
                byArray4[0] = 66;
                byArray4[9] = -30;
                byArray4[1] = -35;
                byArray4[7] = 121;
                byArray4[11] = -104;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 6, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = i_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ub434\ub438\ub426".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 += 35200;
                        n3 += 7953;
                        n3 += 30612;
                        n3 ^= 0x3F94;
                        n3 ^= 0xEFE5;
                        n3 += 329;
                        n3 += 33098;
                        n3 -= 15533;
                        n3 -= 30030;
                        n3 -= 34478;
                        cArray[i3] = (char)(n3 += 45615);
                    }
                    object5 = i_0.A()[2] = new String(cArray);
                }
                F = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = i_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\u2c76\u2c62\u2c68\u2c0c\u2c78\u2c7f\u2c78\u2c0c\u2c6d\u2c60\u2c78\u2c68\u8232\u2c6d\u8356\u8349\u8349\u83fe\u8353\u8344".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 ^= 0xBD20;
                    n4 += 38880;
                    n4 ^= 0x56C1;
                    n4 += 1185;
                    n4 ^= 0x8C03;
                    n4 += 23844;
                    n4 -= 43909;
                    n4 ^= 0xA26E;
                    n4 ^= 0x18D0;
                    n4 += 17841;
                    n4 ^= 0x1C74;
                    n4 -= 38231;
                    n4 += 35992;
                    n4 += 29659;
                    cArray[i4] = (char)(n4 ^= 0xC51C);
                }
                object6 = i_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)F), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = G;
        if (G == null) {
            G = new Object[4];
            objectArray = G;
        }
        return objectArray;
    }

    public static void b() {
        h = new int[0x7D58 ^ 0x7CC8];
        i_0.h[0x1166 ^ 0x1052] = 0x1056 ^ 0x1052;
        i_0.h[0x1E5F ^ 0x1E70] = 0xFFFFE1C4 ^ 0x1E70;
        i_0.h[0x21A7 ^ 0x2196] = 0xFFFFDE70 ^ 0x2196;
        i_0.h[0x2BDF ^ 0x2BBF] = 0xFFFFD401 ^ 0x2BBF;
        i_0.h[0x9A95 ^ 0x9A86] = 0xFFFF6525 ^ 0x9A86;
        i_0.h[0xD7B2 ^ 0xD7F8] = 0xFFFF2834 ^ 0xD7F8;
        i_0.h[0x3F6C ^ 0x3FD0] = 0xF0F4 ^ 0x3FD0;
        i_0.h[0x87F2 ^ 0x86E5] = 0x86C9 ^ 0x86E5;
        i_0.h[0xE22C ^ 0xE218] = 0xE254 ^ 0xE218;
        i_0.h[0x6D89 ^ 0x6DE4] = 0x6DE1 ^ 0x6DE4;
        i_0.h[0xF281 ^ 0xF3BF] = 0xFFFF0C60 ^ 0xF3BF;
        i_0.h[0x62F7 ^ 0x639B] = 0x63FC ^ 0x639B;
        i_0.h[0x8F46 ^ 0x8E4F] = 0x8E3E ^ 0x8E4F;
        i_0.h[0x8F66 ^ 0x8F8F] = 0x8FA0 ^ 0x8F8F;
        i_0.h[0xAC4B ^ 0xAD56] = 0xAD19 ^ 0xAD56;
        i_0.h[0x7E33 ^ 0x7E2F] = 0xFFFF81B0 ^ 0x7E2F;
        i_0.h[0xF24D ^ 0xF2C0] = 0xFFFF0D13 ^ 0xF2C0;
        i_0.h[0xB10F ^ 0xB16C] = 0xFFFF4EE7 ^ 0xB16C;
        i_0.h[0xFEBD ^ 0xFF84] = 0xFF94 ^ 0xFF84;
        i_0.h[0xB059 ^ 0xB091] = 0xFFFF4F49 ^ 0xB091;
        i_0.h[0xF18D ^ 0xF150] = 0xFFFF0EE2 ^ 0xF150;
        i_0.h[0x3400 ^ 0x3537] = 0x356D ^ 0x3537;
        i_0.h[0xAE30 ^ 0xAE9D] = 0xAEAE ^ 0xAE9D;
        i_0.h[0xDB9A ^ 0xDB85] = 0xDBA7 ^ 0xDB85;
        i_0.h[0x51C4 ^ 0x51C1] = 0xFFFFAE52 ^ 0x51C1;
        i_0.h[0x7FE9 ^ 0x7E84] = 0xFFFF811C ^ 0x7E84;
        i_0.h[0x7C65 ^ 0x7CA3] = 0x7CD8 ^ 0x7CA3;
        i_0.h[0xF16D ^ 0xF1DC] = 0xF1DC ^ 0xF1DC;
        i_0.h[0xF39C ^ 0xF391] = 0xFFFF0C1A ^ 0xF391;
        i_0.h[0xF78B ^ 0xF740] = 0xF77D ^ 0xF740;
        i_0.h[0xD221 ^ 0xD216] = 0xD27E ^ 0xD216;
        i_0.h[0xAA67 ^ 0xAA22] = 0xFFFF55A4 ^ 0xAA22;
        i_0.h[0x4C9F ^ 0x4DDB] = 0xFFFFB246 ^ 0x4DDB;
        i_0.h[0xF016 ^ 0xF028] = 0xFFFF0FE3 ^ 0xF028;
        i_0.h[0x7AA7 ^ 0x7B27] = 0x178FE ^ 0x7B27;
        i_0.h[0x9EDE ^ 0x9EF0] = 0x9EAC ^ 0x9EF0;
        i_0.h[0x47B5 ^ 0x4737] = 0x472B ^ 0x4737;
        i_0.h[0x1176 ^ 0x1119] = 0x1118 ^ 0x1119;
        i_0.h[0x1081B ^ 0x10914] = 0xFFFEF6DB ^ 0x10914;
        i_0.h[0x9169 ^ 0x9019] = 0x9040 ^ 0x9019;
        i_0.h[0xEAF ^ 0xE4B] = 0xE5D ^ 0xE4B;
        i_0.h[0x1027D ^ 0x1029F] = 0x102D9 ^ 0x1029F;
        i_0.h[0x9BBE ^ 0x9AF1] = 0x9ABA ^ 0x9AF1;
        i_0.h[0x1470 ^ 0x14C4] = 0x14C6 ^ 0x14C4;
        i_0.h[0xDD39 ^ 0xDC05] = 0xDC05 ^ 0xDC05;
        i_0.h[0xABA6 ^ 0xABB2] = 0xABCE ^ 0xABB2;
        i_0.h[0x751B ^ 0x744A] = 0x7437 ^ 0x744A;
        i_0.h[0x25E8 ^ 0x254D] = 0x252C ^ 0x254D;
        i_0.h[0x68A9 ^ 0x69BC] = 0x69ED ^ 0x69BC;
        i_0.h[0x8BF9 ^ 0x8BAA] = 0x8B0D ^ 0x8BAA;
        i_0.h[0x1958 ^ 0x19F4] = 0x199B ^ 0x19F4;
        i_0.h[0xA561 ^ 0xA47F] = 0xA41C ^ 0xA47F;
        i_0.h[0x9EBC ^ 0x9E4A] = 0x9E21 ^ 0x9E4A;
        i_0.h[0x796D ^ 0x7860] = 0x7863 ^ 0x7860;
        i_0.h[0x4274 ^ 0x4254] = 0xFFFFBD86 ^ 0x4254;
        i_0.h[0x88BF ^ 0x8936] = 0x305B ^ 0x8936;
        i_0.h[0x48AE ^ 0x48AA] = 0x4892 ^ 0x48AA;
        i_0.h[0xAD1C ^ 0xAC2A] = 0xAC68 ^ 0xAC2A;
        i_0.h[0x5D3F ^ 0x5D84] = 0x3666 ^ 0x5D84;
        i_0.h[0xB702 ^ 0xB727] = 0xB74C ^ 0xB727;
        i_0.h[0x107BD ^ 0x106C7] = 0x106C6 ^ 0x106C7;
        i_0.h[0x829D ^ 0x8253] = 0x827C ^ 0x8253;
        i_0.h[0x9E93 ^ 0x9FDD] = 0x9F8F ^ 0x9FDD;
        i_0.h[0x9190 ^ 0x9102] = 0x9163 ^ 0x9102;
        i_0.h[0xE7F2 ^ 0xE7C1] = 0xFFFF1824 ^ 0xE7C1;
        i_0.h[0x4CF2 ^ 0x4CFC] = 0xFFFFB305 ^ 0x4CFC;
        i_0.h[0x9311 ^ 0x93D8] = 0xFFFF6C39 ^ 0x93D8;
        i_0.h[0x6FC0 ^ 0x6FE1] = 0xFFFF9019 ^ 0x6FE1;
        i_0.h[0xE8A8 ^ 0xE9AE] = 0xE9C9 ^ 0xE9AE;
        i_0.h[0x76BD ^ 0x7666] = 0xFFFF89AC ^ 0x7666;
        i_0.h[0x230C ^ 0x237C] = 0xFFFFDCA1 ^ 0x237C;
        i_0.h[0x6C26 ^ 0x6D04] = 0xFFFF92A7 ^ 0x6D04;
        i_0.h[0xE7D2 ^ 0xE754] = 0xFFFF183E ^ 0xE754;
        i_0.h[0xB093 ^ 0xB0CB] = 0xFFFF4F29 ^ 0xB0CB;
        i_0.h[0x9BBE ^ 0x9AA4] = 0xFFFF6579 ^ 0x9AA4;
        i_0.h[0x9C6D ^ 0x9CA0] = 0x9C83 ^ 0x9CA0;
        i_0.h[0x97EA ^ 0x97E2] = 0xFFFF6817 ^ 0x97E2;
        i_0.h[0xE89F ^ 0xE991] = 0xE9F5 ^ 0xE991;
        i_0.h[0xCFB4 ^ 0xCF66] = 0xCF14 ^ 0xCF66;
        i_0.h[0x1019D ^ 0x1016C] = 0x10127 ^ 0x1016C;
        i_0.h[0xB40C ^ 0xB572] = 0xB573 ^ 0xB572;
        i_0.h[0x265A ^ 0x273E] = 0x2722 ^ 0x273E;
        i_0.h[0x8BE5 ^ 0x8ACB] = 0xFFFF7571 ^ 0x8ACB;
        i_0.h[0x5817 ^ 0x5863] = 0x58CB ^ 0x5863;
        i_0.h[0xB8D5 ^ 0xB9FD] = 0xB99B ^ 0xB9FD;
        i_0.h[0x9FA3 ^ 0x9FF8] = 0x9FA4 ^ 0x9FF8;
        i_0.h[0x6644 ^ 0x663F] = 0xFFFF99F1 ^ 0x663F;
        i_0.h[0xE1D9 ^ 0xE1E3] = 0xE197 ^ 0xE1E3;
        i_0.h[0xA691 ^ 0xA6C0] = 0xA6B0 ^ 0xA6C0;
        i_0.h[0x7A05 ^ 0x7A53] = 0xFFFF858B ^ 0x7A53;
        i_0.h[0xA771 ^ 0xA709] = 0xA76E ^ 0xA709;
        i_0.h[0x65C ^ 0x724] = 0x717 ^ 0x724;
        i_0.h[0xC799 ^ 0xC6E0] = 0xC6F9 ^ 0xC6E0;
        i_0.h[0x9CEF ^ 0x9C77] = 0xFFFF63FB ^ 0x9C77;
        i_0.h[0xDC7D ^ 0xDCD2] = 0xDCCA ^ 0xDCD2;
        i_0.h[0x3C4C ^ 0x3D17] = 0x3D70 ^ 0x3D17;
        i_0.h[0x1C1 ^ 0x1DF] = 0x1FD ^ 0x1DF;
        i_0.h[0x98EA ^ 0x998D] = 0x99E5 ^ 0x998D;
        i_0.h[0x334D ^ 0x3232] = 0x3232 ^ 0x3232;
        i_0.h[0xBC26 ^ 0xBCAD] = 0xBCA1 ^ 0xBCAD;
        i_0.h[0xA03C ^ 0xA175] = 0xA12F ^ 0xA175;
        i_0.h[0xC0EF ^ 0xC047] = 0xC027 ^ 0xC047;
        i_0.h[0xEAE5 ^ 0xEA75] = 0xFFFF15CF ^ 0xEA75;
        i_0.h[0x657 ^ 0x689] = 0x6F9 ^ 0x689;
        i_0.h[0x3238 ^ 0x3223] = 0xFFFFCDD5 ^ 0x3223;
        i_0.h[0xA9CD ^ 0xA97F] = 0xA97E ^ 0xA97F;
        i_0.h[0x36E8 ^ 0x3794] = 0x3794 ^ 0x3794;
        i_0.h[0xE64A ^ 0xE710] = 0xFFFF188C ^ 0xE710;
        i_0.h[0x82AC ^ 0x839D] = 0x8391 ^ 0x839D;
        i_0.h[0xE2FA ^ 0xE276] = 0xFFFF1DA5 ^ 0xE276;
        i_0.h[0xB353 ^ 0xB232] = 0xB24B ^ 0xB232;
        i_0.h[0x916F ^ 0x9004] = 0x90E5 ^ 0x9004;
        i_0.h[0xD845 ^ 0xD977] = 0xD917 ^ 0xD977;
        i_0.h[0x3D85 ^ 0x3CAA] = 0xFFFFC315 ^ 0x3CAA;
        i_0.h[0x109C0 ^ 0x108C3] = 0x108D5 ^ 0x108C3;
        i_0.h[0x18BB ^ 0x19CC] = 0x19C6 ^ 0x19CC;
        i_0.h[0x544C ^ 0x5400] = 0x542A ^ 0x5400;
        i_0.h[0x14F8 ^ 0x1441] = 0x7020 ^ 0x1441;
        i_0.h[0x69A0 ^ 0x6957] = 0x6957 ^ 0x6957;
        i_0.h[0xB43B ^ 0xB53A] = 0xB532 ^ 0xB53A;
        i_0.h[0x809D ^ 0x8196] = 0x81CF ^ 0x8196;
        i_0.h[0x864B ^ 0x8670] = 0xFFFF79E4 ^ 0x8670;
        i_0.h[0x7B24 ^ 0x7A4B] = 0xFFFF85B3 ^ 0x7A4B;
        i_0.h[0x18B6 ^ 0x1986] = 0xFFFFE639 ^ 0x1986;
        i_0.h[0x1033C ^ 0x10361] = 0xFFFEFCCA ^ 0x10361;
        i_0.h[0x8106 ^ 0x8019] = 0xFFFF7FF5 ^ 0x8019;
        i_0.h[0x11D7 ^ 0x112A] = 0x112A ^ 0x112A;
        i_0.h[0x6B98 ^ 0x6B5F] = 0x6B6C ^ 0x6B5F;
        i_0.h[0xFA9 ^ 0xF16] = 0x5A7D ^ 0xF16;
        i_0.h[0x109B1 ^ 0x1092D] = 0x1095A ^ 0x1092D;
        i_0.h[0xA195 ^ 0xA1DB] = 0xFFFF5E56 ^ 0xA1DB;
        i_0.h[0xFB94 ^ 0xFB7B] = 0xFB31 ^ 0xFB7B;
        i_0.h[0x10C8D ^ 0x10CC0] = 0x10CA9 ^ 0x10CC0;
        i_0.h[0x81AE ^ 0x808A] = 0x80BF ^ 0x808A;
        i_0.h[0x48BF ^ 0x4868] = 0x486E ^ 0x4868;
        i_0.h[0x87E7 ^ 0x87E1] = 0x87DF ^ 0x87E1;
        i_0.h[0xFD13 ^ 0xFC55] = 0xFC3C ^ 0xFC55;
        i_0.h[0x32F8 ^ 0x33A6] = 0xFFFFCC4A ^ 0x33A6;
        i_0.h[0xE1CB ^ 0xE18A] = 0xE14F ^ 0xE18A;
        i_0.h[0x4B52 ^ 0x4B6B] = 0x4B3B ^ 0x4B6B;
        i_0.h[0x7055 ^ 0x70FB] = 0xFFFF8F00 ^ 0x70FB;
        i_0.h[0xAC7C ^ 0xAC96] = 0xACAC ^ 0xAC96;
        i_0.h[0xD1A ^ 0xD5C] = 0xD56 ^ 0xD5C;
        i_0.h[0xECED ^ 0xED99] = 0xED85 ^ 0xED99;
        i_0.h[0x8C95 ^ 0x8C25] = 0x8C26 ^ 0x8C25;
        i_0.h[0xC931 ^ 0xC921] = 0xC936 ^ 0xC921;
        i_0.h[0x7E5F ^ 0x7E50] = 0xFFFF81EA ^ 0x7E50;
        i_0.h[0xCC25 ^ 0xCD43] = 0xFFFF32B9 ^ 0xCD43;
        i_0.h[0x996C ^ 0x9909] = 0x9979 ^ 0x9909;
        i_0.h[0xD5A ^ 0xD78] = 0xFFFFF28E ^ 0xD78;
        i_0.h[0x361A ^ 0x36D6] = 0x36FA ^ 0x36D6;
        i_0.h[0xF753 ^ 0xF62E] = 0xF62F ^ 0xF62E;
        i_0.h[0x10ADD ^ 0x10A79] = 0xFFFEF507 ^ 0x10A79;
        i_0.h[0x7921 ^ 0x7965] = 0xFFFF86E8 ^ 0x7965;
        i_0.h[0x68DB ^ 0x68C1] = 0x6897 ^ 0x68C1;
        i_0.h[0x2F17 ^ 0x2E4E] = 0xFFFFD1B6 ^ 0x2E4E;
        i_0.h[0x9BA9 ^ 0x9AFF] = 0x9AA7 ^ 0x9AFF;
        i_0.h[0x2D1C ^ 0x2C08] = 0xFFFFD367 ^ 0x2C08;
        i_0.h[0xDDB4 ^ 0xDDB5] = 0xFFFF220A ^ 0xDDB5;
        i_0.h[0xDBF5 ^ 0xDAF9] = 0xFFFF2557 ^ 0xDAF9;
        i_0.h[0x10A57 ^ 0x10B77] = 0x10B0A ^ 0x10B77;
        i_0.h[0x1014A ^ 0x100CC] = 0x1B9A5 ^ 0x100CC;
        i_0.h[0x10B41 ^ 0x10BA6] = 0x10BAA ^ 0x10BA6;
        i_0.h[0x58D9 ^ 0x58AB] = 0xFFFFA745 ^ 0x58AB;
        i_0.h[0xED7B ^ 0xED9E] = 0xEDBB ^ 0xED9E;
        i_0.h[0x279D ^ 0x2707] = 0xFFFFD8A4 ^ 0x2707;
        i_0.h[0x7EF7 ^ 0x7F94] = 0x7F8D ^ 0x7F94;
        i_0.h[0xE9F1 ^ 0xE90E] = 0xE98D ^ 0xE90E;
        i_0.h[0xEAD3 ^ 0xEA17] = 0xD808 ^ 0xEA17;
        i_0.h[0x319E ^ 0x3170] = 0xFFFFCEB9 ^ 0x3170;
        i_0.h[0xCE23 ^ 0xCE56] = 0xCE34 ^ 0xCE56;
        i_0.h[0x6EF2 ^ 0x6FF5] = 0x6FFA ^ 0x6FF5;
        i_0.h[0x2EB1 ^ 0x2FE6] = 0xFFFFD000 ^ 0x2FE6;
        i_0.h[0xD0AF ^ 0xD084] = 0xD0BE ^ 0xD084;
        i_0.h[0x9FF3 ^ 0x9F2A] = 0xFFFF6095 ^ 0x9F2A;
        i_0.h[0x6783 ^ 0x668B] = 0xFFFF99F8 ^ 0x668B;
        i_0.h[0x34D1 ^ 0x3488] = 0xFFFFCB01 ^ 0x3488;
        i_0.h[0xB0A4 ^ 0xB185] = 0xB18E ^ 0xB185;
        i_0.h[0xE5F6 ^ 0xE51E] = 0xE505 ^ 0xE51E;
        i_0.h[0x106BA ^ 0x107AC] = 0xFFFEF862 ^ 0x107AC;
        i_0.h[0xD212 ^ 0xD350] = 0xFFFF2C8D ^ 0xD350;
        i_0.h[0x9F68 ^ 0x9F17] = 0x9F02 ^ 0x9F17;
        i_0.h[0x4A40 ^ 0x4AF6] = 0x4AF6 ^ 0x4AF6;
        i_0.h[0x34A0 ^ 0x3441] = 0x3469 ^ 0x3441;
        i_0.h[0x635D ^ 0x63EE] = 0x63EE ^ 0x63EE;
        i_0.h[0xFF72 ^ 0xFE01] = 0xFE3F ^ 0xFE01;
        i_0.h[0xB156 ^ 0xB033] = 0xFFFF4F9B ^ 0xB033;
        i_0.h[0x3EBA ^ 0x3E2B] = 0x3E32 ^ 0x3E2B;
        i_0.h[0x7361 ^ 0x73B1] = 0xFFFF8C74 ^ 0x73B1;
        i_0.h[0x83C8 ^ 0x824A] = 0xC4FE ^ 0x824A;
        i_0.h[0xAED3 ^ 0xAF93] = 0xFFFF5022 ^ 0xAF93;
        i_0.h[0x4ACB ^ 0x4BCE] = 0xFFFFB469 ^ 0x4BCE;
        i_0.h[0x9AB4 ^ 0x9AEB] = 0x9AC9 ^ 0x9AEB;
        i_0.h[0xCECE ^ 0xCF4B] = 0x89F7 ^ 0xCF4B;
        i_0.h[0xB995 ^ 0xB9B1] = 0xFFFF464C ^ 0xB9B1;
        i_0.h[0x890A ^ 0x8901] = 0x892D ^ 0x8901;
        i_0.h[0x46DE ^ 0x47BC] = 0xFFFFB877 ^ 0x47BC;
        i_0.h[0x108F5 ^ 0x10855] = 0xFFFEF7A4 ^ 0x10855;
        i_0.h[0xF468 ^ 0xF506] = 0xFFFF0AA5 ^ 0xF506;
        i_0.h[0xA808 ^ 0xA85D] = 0xA802 ^ 0xA85D;
        i_0.h[0xDA29 ^ 0xDAAD] = 0xFFFF2528 ^ 0xDAAD;
        i_0.h[0xFD77 ^ 0xFD50] = 0xFD62 ^ 0xFD50;
        i_0.h[0x6B6D ^ 0x6B01] = 0xFFFF94ED ^ 0x6B01;
        i_0.h[0xBCB1 ^ 0xBC16] = 0xFFFF43C3 ^ 0xBC16;
        i_0.h[0x387A ^ 0x3957] = 0xFFFFC6AC ^ 0x3957;
        i_0.h[0x1967 ^ 0x18E9] = 0x488E ^ 0x18E9;
        i_0.h[0x2CF2 ^ 0x2C50] = 0xFFFFD3BD ^ 0x2C50;
        i_0.h[0xDE31 ^ 0xDECB] = 0xDEC8 ^ 0xDECB;
        i_0.h[0x2709 ^ 0x2742] = 0xFFFFD8A4 ^ 0x2742;
        i_0.h[0xBB71 ^ 0xBA32] = 0xFFFF45DF ^ 0xBA32;
        i_0.h[0xF2B2 ^ 0xF3D2] = 0xFFFF0C28 ^ 0xF3D2;
        i_0.h[0x8E02 ^ 0x8E7C] = 0x8E0F ^ 0x8E7C;
        i_0.h[0x88D7 ^ 0x8985] = 0xFFFF7645 ^ 0x8985;
        i_0.h[0xB23B ^ 0xB207] = 0xB214 ^ 0xB207;
        i_0.h[0x8F57 ^ 0x8FC9] = 0x8F55 ^ 0x8FC9;
        i_0.h[0x3E61 ^ 0x3FED] = 0xFFFF01F0 ^ 0x3FED;
        i_0.h[0x6550 ^ 0x6448] = 0xFFFF9BCF ^ 0x6448;
        i_0.h[0xD6CB ^ 0xD633] = 0xD678 ^ 0xD633;
        i_0.h[0x2287 ^ 0x2387] = 0x23E6 ^ 0x2387;
        i_0.h[0x4ECA ^ 0x4FF0] = 0x4F9A ^ 0x4FF0;
        i_0.h[0x2EB9 ^ 0x2EB0] = 0x2ECC ^ 0x2EB0;
        i_0.h[0x10015 ^ 0x1000C] = 0xFFFEFF85 ^ 0x1000C;
        i_0.h[0xC4C1 ^ 0xC5F9] = 0xC585 ^ 0xC5F9;
        i_0.h[0x9D69 ^ 0x9D1E] = 0xFFFF62ED ^ 0x9D1E;
        i_0.h[0xBC44 ^ 0xBD0C] = 0xFFFF4299 ^ 0xBD0C;
        i_0.h[0xAAAF ^ 0xAA2E] = 0xAA7E ^ 0xAA2E;
        i_0.h[0x7D17 ^ 0x7C05] = 0xFFFF8390 ^ 0x7C05;
        i_0.h[0xD47E ^ 0xD431] = 0xFFFF2BE7 ^ 0xD431;
        i_0.h[0xFDE5 ^ 0xFD9C] = 0xFFFF025A ^ 0xFD9C;
        i_0.h[0xFF82 ^ 0xFF37] = 0xFF37 ^ 0xFF37;
        i_0.h[0x8015 ^ 0x8017] = 0xFFFF7F9A ^ 0x8017;
        i_0.h[0x9913 ^ 0x9954] = 0x9973 ^ 0x9954;
        i_0.h[0x10B92 ^ 0x10BF0] = 0x10BF1 ^ 0x10BF0;
        i_0.h[0x78D8 ^ 0x7862] = 0x1180 ^ 0x7862;
        i_0.h[0x2138 ^ 0x20B0] = 0xFFFF6617 ^ 0x20B0;
        i_0.h[0x22D1 ^ 0x22BF] = 0xFFFFDD61 ^ 0x22BF;
        i_0.h[0xC52 ^ 0xD13] = 0xFFFFF2D9 ^ 0xD13;
        i_0.h[0xAD11 ^ 0xAD6D] = 0xAD4B ^ 0xAD6D;
        i_0.h[0xAA7D ^ 0xABFC] = 0x1A835 ^ 0xABFC;
        i_0.h[0x6178 ^ 0x61DE] = 0xFFFF9E08 ^ 0x61DE;
        i_0.h[0x59D ^ 0x51E] = 0xFFFFFACB ^ 0x51E;
        i_0.h[0x47DF ^ 0x468F] = 0xFFFFB9C2 ^ 0x468F;
        i_0.h[0xCBD7 ^ 0xCB9F] = 0xCBB6 ^ 0xCB9F;
        i_0.h[0xF9A1 ^ 0xF882] = 0xFFFF0754 ^ 0xF882;
        i_0.h[0x7850 ^ 0x7893] = 0x588D ^ 0x7893;
        i_0.h[0xDF70 ^ 0xDF5C] = 0xFFFF20DD ^ 0xDF5C;
        i_0.h[0x41C6 ^ 0x41CA] = 0xFFFFBE58 ^ 0x41CA;
        i_0.h[0xBA5 ^ 0xAD7] = 0xACB ^ 0xAD7;
        i_0.h[0x9AF8 ^ 0x9A70] = 0xFFFF65E3 ^ 0x9A70;
        i_0.h[0x4C7D ^ 0x4C34] = 0xFFFFB3C6 ^ 0x4C34;
        i_0.h[0x7E6C ^ 0x7E59] = 0xFFFF81B0 ^ 0x7E59;
        i_0.h[0x1053 ^ 0x10A0] = 0xFFFFEF31 ^ 0x10A0;
        i_0.h[0x4008 ^ 0x400F] = 0xFFFFBFB8 ^ 0x400F;
        i_0.h[0xFD18 ^ 0xFDD8] = 0x4BD7 ^ 0xFDD8;
        i_0.h[0xBE62 ^ 0xBE5A] = 0xBE5E ^ 0xBE5A;
        i_0.h[0xFB5C ^ 0xFB5C] = 0xFB77 ^ 0xFB5C;
        i_0.h[0x3B31 ^ 0x3B59] = 0x3B5C ^ 0x3B59;
        i_0.h[0x2522 ^ 0x25E7] = 0x25E7 ^ 0x25E7;
        i_0.h[0xDE6F ^ 0xDF74] = 0xDF76 ^ 0xDF74;
        i_0.h[0xA0C9 ^ 0xA195] = 0xA1F7 ^ 0xA195;
        i_0.h[0x74A1 ^ 0x7594] = 0x7598 ^ 0x7594;
        i_0.h[0x977A ^ 0x9724] = 0x973E ^ 0x9724;
        i_0.h[0xE41E ^ 0xE475] = 0xFFFF1B84 ^ 0xE475;
        i_0.h[0x533A ^ 0x539B] = 0xFFFFAC3D ^ 0x539B;
        i_0.h[0x433A ^ 0x42B7] = 0x832C ^ 0x42B7;
        i_0.h[0x5D38 ^ 0x5D45] = 0x5DED ^ 0x5D45;
        i_0.h[0xE1DC ^ 0xE1F5] = 0xFFFF1E14 ^ 0xE1F5;
        i_0.h[0x10C7D ^ 0x10CBF] = 0x11C29 ^ 0x10CBF;
        i_0.h[0x31C9 ^ 0x3193] = 0xFFFFCE70 ^ 0x3193;
        i_0.h[0xF35F ^ 0xF235] = 0xFFFF0DF5 ^ 0xF235;
        i_0.h[0x27C4 ^ 0x2743] = 0x276B ^ 0x2743;
        i_0.h[0x10E6A ^ 0x10ED2] = 0x15B53 ^ 0x10ED2;
        i_0.h[0x43CE ^ 0x42E5] = 0xFFFFBD7D ^ 0x42E5;
        i_0.h[0x9F3A ^ 0x9E3E] = 0x9E74 ^ 0x9E3E;
        i_0.h[0xE114 ^ 0xE029] = 0xE015 ^ 0xE029;
        i_0.h[0x26DD ^ 0x2631] = 0xFFFFD984 ^ 0x2631;
        i_0.h[0xB371 ^ 0xB218] = 0xFFFF4DAE ^ 0xB218;
        i_0.h[0xEB6A ^ 0xEB7B] = 0xEB54 ^ 0xEB7B;
        i_0.h[0xF15E ^ 0xF1CB] = 0xFFFF0E3D ^ 0xF1CB;
        i_0.h[0xAC24 ^ 0xACBF] = 0xACD4 ^ 0xACBF;
        i_0.h[0xD6B7 ^ 0xD7F0] = 0xFFFF2826 ^ 0xD7F0;
        i_0.h[0x468 ^ 0x409] = 0x46D ^ 0x409;
        i_0.h[0x156F ^ 0x1437] = 0x145B ^ 0x1437;
        i_0.h[0x34D8 ^ 0x3402] = 0xFFFFCBDE ^ 0x3402;
        i_0.h[0xA785 ^ 0xA7A3] = 0xFFFF583A ^ 0xA7A3;
        i_0.h[0x62E0 ^ 0x629A] = 0x628E ^ 0x629A;
        i_0.h[0xA07E ^ 0xA0D4] = 0xFFFF5F31 ^ 0xA0D4;
        i_0.h[0x5ACA ^ 0x5A38] = 0xFFFFA5D8 ^ 0x5A38;
        i_0.h[0x51FF ^ 0x51C0] = 0x5183 ^ 0x51C0;
        i_0.h[0x6DA7 ^ 0x6D97] = 0x6D85 ^ 0x6D97;
        i_0.h[0x3329 ^ 0x3235] = 0x3208 ^ 0x3235;
        i_0.h[0xBEF5 ^ 0xBFD9] = 0xFFFF4015 ^ 0xBFD9;
        i_0.h[0xAADE ^ 0xAAFD] = 0xFFFF556E ^ 0xAAFD;
        i_0.h[0xE826 ^ 0xE898] = 0x5B12 ^ 0xE898;
        i_0.h[0xC8E1 ^ 0xC861] = 0xC82D ^ 0xC861;
        i_0.h[0x7AFA ^ 0x7AE7] = 0x7AAE ^ 0x7AE7;
        i_0.h[0x39C6 ^ 0x39FB] = 0x3981 ^ 0x39FB;
        i_0.h[0x10A8B ^ 0x10BC1] = 0xFFFEF406 ^ 0x10BC1;
        i_0.h[0xA112 ^ 0xA18D] = 0xFFFF5E0B ^ 0xA18D;
        i_0.h[0x8920 ^ 0x8807] = 0x8877 ^ 0x8807;
        i_0.h[0xB744 ^ 0xB7D9] = 0xB7D2 ^ 0xB7D9;
        i_0.h[0x1F62 ^ 0x1E60] = 0x1E54 ^ 0x1E60;
        i_0.h[0xCD98 ^ 0xCDB0] = 0xFFFF321B ^ 0xCDB0;
        i_0.h[0x22B6 ^ 0x22C7] = 0x22AA ^ 0x22C7;
        i_0.h[0xEC46 ^ 0xECCF] = 0xECF8 ^ 0xECCF;
        i_0.h[0x8843 ^ 0x88C9] = 0x888A ^ 0x88C9;
        i_0.h[0x5390 ^ 0x53E3] = 0xFFFFAC45 ^ 0x53E3;
        i_0.h[0x770F ^ 0x7705] = 0xFFFF88BD ^ 0x7705;
        i_0.h[0x1CDC ^ 0x1C4F] = 0xFFFFE3A2 ^ 0x1C4F;
        i_0.h[0x7D8 ^ 0x7CE] = 0x7D0 ^ 0x7CE;
        i_0.h[0x59B8 ^ 0x59D1] = 0x5991 ^ 0x59D1;
        i_0.h[0xB9E5 ^ 0xB97C] = 0xFFFF46B5 ^ 0xB97C;
        i_0.h[0x2EF2 ^ 0x2E77] = 0x2E39 ^ 0x2E77;
        i_0.h[0x84D5 ^ 0x85C5] = 0xFFFF7A29 ^ 0x85C5;
        i_0.h[0x2A10 ^ 0x2A87] = 0x2ACA ^ 0x2A87;
        i_0.h[0xF462 ^ 0xF475] = 0xF43A ^ 0xF475;
        i_0.h[0x4C64 ^ 0x4DEE] = 0x8C77 ^ 0x4DEE;
        i_0.h[0x71D0 ^ 0x711F] = 0x713E ^ 0x711F;
        i_0.h[0x461E ^ 0x4738] = 0x472D ^ 0x4738;
        i_0.h[0x5612 ^ 0x5796] = 0x110A ^ 0x5796;
        i_0.h[0x2C0E ^ 0x2CDF] = 0xFFFFD33C ^ 0x2CDF;
        i_0.h[0x305F ^ 0x3035] = 0x3010 ^ 0x3035;
        i_0.h[0x7862 ^ 0x7968] = 0xFFFF8692 ^ 0x7968;
        i_0.h[0x6023 ^ 0x6009] = 0x600C ^ 0x6009;
        i_0.h[0x6D27 ^ 0x6DDC] = 0x6D8F ^ 0x6DDC;
        i_0.h[0x54AF ^ 0x5477] = 0xFFFFAB93 ^ 0x5477;
        i_0.h[0xC863 ^ 0xC89A] = 0xC8EA ^ 0xC89A;
        i_0.h[0x264C ^ 0x273A] = 0xFFFFD8DD ^ 0x273A;
        i_0.h[0x8CE0 ^ 0x8DDB] = 0x8D97 ^ 0x8DDB;
        i_0.h[0xA935 ^ 0xA903] = 0xA952 ^ 0xA903;
        i_0.h[0x178E ^ 0x1744] = 0xFFFFE880 ^ 0x1744;
        i_0.h[0xE6D9 ^ 0xE656] = 0xFFFF19A5 ^ 0xE656;
        i_0.h[0xA872 ^ 0xA804] = 0xA842 ^ 0xA804;
        i_0.h[0xB6F9 ^ 0xB6BA] = 0xFFFF491E ^ 0xB6BA;
        i_0.h[0xD756 ^ 0xD743] = 0xFFFF28EF ^ 0xD743;
        i_0.h[0xE101 ^ 0xE044] = 0xE041 ^ 0xE044;
        i_0.h[0x2FAC ^ 0x2FFB] = 0xFFFFD03D ^ 0x2FFB;
        i_0.h[0x2479 ^ 0x255C] = 0x253A ^ 0x255C;
        i_0.h[0xAD89 ^ 0xAC0E] = 0x1563 ^ 0xAC0E;
        i_0.h[0x37A9 ^ 0x3742] = 0xFFFFC8AD ^ 0x3742;
        i_0.h[0x4444 ^ 0x44ED] = 0xFFFFBB5E ^ 0x44ED;
        i_0.h[0x8137 ^ 0x81B9] = 0xFFFF7E59 ^ 0x81B9;
        i_0.h[0x6D85 ^ 0x6DD1] = 0x6DF9 ^ 0x6DD1;
        i_0.h[0xCCD3 ^ 0xCDC2] = 0xFFFF32E7 ^ 0xCDC2;
        i_0.h[0x101C5 ^ 0x10098] = 0xFFFEFF07 ^ 0x10098;
        i_0.h[0x896C ^ 0x8839] = 0xFFFF77F4 ^ 0x8839;
        i_0.h[0x7297 ^ 0x724B] = 0xFFFF8DB3 ^ 0x724B;
        i_0.h[0xD959 ^ 0xD905] = 0xD939 ^ 0xD905;
        i_0.h[0x10B4C ^ 0x10A18] = 0xFFFEF5B7 ^ 0x10A18;
        i_0.h[0x4536 ^ 0x4574] = 0xFFFFBAEC ^ 0x4574;
        i_0.h[0x699D ^ 0x6963] = 0x6949 ^ 0x6963;
        i_0.h[0x90C3 ^ 0x9057] = 0xFFFF6FC3 ^ 0x9057;
        i_0.h[0xD536 ^ 0xD47A] = 0xD400 ^ 0xD47A;
        i_0.h[0x3F14 ^ 0x3E27] = 0xFFFFC1BA ^ 0x3E27;
        i_0.h[0xC197 ^ 0xC0A8] = 0xFFFF3F24 ^ 0xC0A8;
        i_0.h[0x79E9 ^ 0x789C] = 0x78AE ^ 0x789C;
        i_0.h[0x74DF ^ 0x740C] = 0x7405 ^ 0x740C;
        i_0.h[0x2274 ^ 0x230F] = 0x230D ^ 0x230F;
        i_0.h[0x69B4 ^ 0x6959] = 0xFFFF96FA ^ 0x6959;
        i_0.h[0xDF54 ^ 0xDFFF] = 0xDFCE ^ 0xDFFF;
        i_0.h[0xEC9E ^ 0xEDB4] = 0xEDF6 ^ 0xEDB4;
        i_0.h[0x2ABA ^ 0x2A07] = 0x1EF ^ 0x2A07;
        i_0.h[0xE2D2 ^ 0xE244] = 0xFFFF1DE2 ^ 0xE244;
        i_0.h[0x6AF6 ^ 0x6ADB] = 0x6AFE ^ 0x6ADB;
        i_0.h[0x1334 ^ 0x13C0] = 0xFFFFEC2A ^ 0x13C0;
        i_0.h[0xDCCC ^ 0xDCD4] = 0xDCF7 ^ 0xDCD4;
        i_0.h[0xACA ^ 0xAAC] = 0xA9F ^ 0xAAC;
        i_0.h[0x2CF2 ^ 0x2DAD] = 0x2D2E ^ 0x2DAD;
        i_0.h[0x5116 ^ 0x5067] = 0xFFFFAF8A ^ 0x5067;
        i_0.h[0x78EA ^ 0x781A] = 0x7891 ^ 0x781A;
        i_0.h[0xEA4 ^ 0xEC3] = 0xFFFFF100 ^ 0xEC3;
        i_0.h[0xC3ED ^ 0xC30E] = 0xFFFF3CCC ^ 0xC30E;
        i_0.h[0xA288 ^ 0xA2C8] = 0xFFFF5D40 ^ 0xA2C8;
        i_0.h[0x4CDD ^ 0x4C28] = 0x4C51 ^ 0x4C28;
        i_0.h[0x9EE0 ^ 0x9E06] = 0x9E2D ^ 0x9E06;
        i_0.h[0xF200 ^ 0xF2C1] = 0x8370 ^ 0xF2C1;
        i_0.h[0x9F6E ^ 0x9E23] = 0xFFFF61A7 ^ 0x9E23;
        i_0.h[0x38D7 ^ 0x3885] = 0x38B5 ^ 0x3885;
        i_0.h[0xA5D8 ^ 0xA5BC] = 0xFFFF5A16 ^ 0xA5BC;
        i_0.h[0x68A2 ^ 0x69E9] = 0x69A9 ^ 0x69E9;
        i_0.h[0x6D75 ^ 0x6D25] = 0xFFFF9285 ^ 0x6D25;
        i_0.h[0x106FF ^ 0x107E6] = 0xFFFEF846 ^ 0x107E6;
        i_0.h[0x825F ^ 0x834C] = 0xFFFF7CDC ^ 0x834C;
        i_0.h[0x1E31 ^ 0x1EE4] = 0x1E89 ^ 0x1EE4;
        i_0.h[0x9108 ^ 0x913A] = 0xFFFF6E92 ^ 0x913A;
        i_0.h[0x7BFA ^ 0x7B4D] = 0x780D ^ 0x7B4D;
        i_0.h[0xB249 ^ 0xB3CA] = 0xF576 ^ 0xB3CA;
        i_0.h[0x812B ^ 0x81D7] = 0x819D ^ 0x81D7;
        i_0.h[0xDCC5 ^ 0xDD4E] = 0x1CD5 ^ 0xDD4E;
        i_0.h[0x10E75 ^ 0x10ED6] = 0x10E98 ^ 0x10ED6;
        i_0.h[0xF337 ^ 0xF21E] = 0xF234 ^ 0xF21E;
        i_0.h[0xE589 ^ 0xE406] = 0xB46E ^ 0xE406;
        i_0.h[0x3258 ^ 0x330B] = 0x332B ^ 0x330B;
        i_0.h[0x5471 ^ 0x54A5] = 0xFFFFAB00 ^ 0x54A5;
        i_0.h[0x5723 ^ 0x57C3] = 0x57C6 ^ 0x57C3;
        i_0.h[0xFA89 ^ 0xFA56] = 0xFA03 ^ 0xFA56;
        i_0.h[0xD9D9 ^ 0xD9DA] = 0xFFFF2657 ^ 0xD9DA;
        i_0.h[0xE6DB ^ 0xE6C9] = 0xE630 ^ 0xE6C9;
        i_0.h[0x6A5 ^ 0x7CD] = 0x7C6 ^ 0x7CD;
        i_0.h[0x5AF4 ^ 0x5A22] = 0x5A71 ^ 0x5A22;
    }
}

