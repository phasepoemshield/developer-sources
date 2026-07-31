/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_4174
 *  net.minecraft.class_636
 *  net.minecraft.class_746
 *  net.minecraft.class_9334
 */
package kotakbaz.rain.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.event.events.D;
import kotakbaz.rain.mixin.ClientPlayerInteractionManagerInvoker;
import kotakbaz.rain.module.restrict.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_4174;
import net.minecraft.class_636;
import net.minecraft.class_746;
import net.minecraft.class_9334;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

/*
 * Renamed from kotakbaz.rain.module.modules.player.a
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0003J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001f\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b \u0010\u0012J\u000f\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b!\u0010\u0003R\u0016\u0010\"\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010#\u00a8\u0006("}, d2={"Lkotakbaz/rain/module/modules/player/AutoEatModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_746;", "player", "maintainEating", "(Lnet/minecraft/class_746;)V", "", "slot", "startEating", "(Lnet/minecraft/class_746;I)V", "stopEating", "findFoodSlot", "(Lnet/minecraft/class_746;)Ljava/lang/Integer;", "Lnet/minecraft/class_1799;", "stack", "", "canEat", "(Lnet/minecraft/class_746;Lnet/minecraft/class_1799;)Z", "shouldEat", "(Lnet/minecraft/class_746;)Z", "isActiveEating", "()Z", "shouldAbort", "selectSlot", "resetState", "isEating", "Z", "previousSlot", "I", "eatingSlot", "previousUsePressed", "rain-visuals"})
public final class a_0
extends kotakbaz.rain.module.a_0 {
    @NotNull
    public static final a_0 INSTANCE;
    private static boolean a;
    private static int A;
    private static int b;
    private static boolean B;
    private static Object[] c;
    private static Object d;
    private static Object[] D;
    private static Object[] C;
    private static Object[] e;
    public static int[] E;

    private a_0() {
        int n = E[0];
        n -= E[1];
        int n2 = E[3];
        n2 += E[4];
        int n3 = E[6];
        n3 += E[7];
        super((String)c[n += E[2]], kotakbaz.rain.client.extensions.a_0.getPLAYER(), (String)c[n2 ^= E[5]] + (String)c[n3 += E[8]]);
    }

    @Override
    public void onEnable() {
        this.resetState();
    }

    @Override
    public void onDisable() {
        this.stopEating();
    }

    @Commando
    public final void onUpdate(@NotNull D d2) {
        long l = 144766728314892645L;
        long l2 = -6715819760048718120L;
        int n = E[9];
        n -= E[10];
        Intrinsics.checkNotNullParameter(d2, (String)c[n -= E[11]]);
        class_746 class_7462 = b_0.getMc().field_1724;
        if (class_7462 == null) {
            a_0 a_02 = this;
            long l3 = l;
            int n2 = E[12];
            n2 -= E[13];
            l = l3 ^ (0L ^ l3) & -1L << (n2 ^= E[14]);
            a_02.resetState();
            return;
        }
        class_746 class_7463 = class_7462;
        if (b_0.getMc().field_1687 == null || b_0.getMc().field_1761 == null) {
            this.stopEating();
            return;
        }
        if (this.shouldAbort(class_7463)) {
            this.stopEating();
            return;
        }
        if (a) {
            this.maintainEating(class_7463);
            return;
        }
        if (!this.shouldEat(class_7463)) {
            return;
        }
        if (class_7463.method_6115()) {
            return;
        }
        Integer n3 = this.findFoodSlot(class_7463);
        if (n3 == null) {
            return;
        }
        int n4 = E[15];
        n4 -= E[16];
        long l4 = l2;
        int n5 = E[18];
        n5 ^= E[19];
        l2 = l4 ^ ((long)n3.intValue() << (n4 -= E[17]) ^ l4) & -1L << (n5 ^= E[20]);
        int n6 = E[21];
        n6 -= E[22];
        this.startEating(class_7463, (int)(l2 >>> (n6 ^= E[23])));
    }

    /*
     * Unable to fully structure code
     */
    private final void maintainEating(class_746 var1_1) {
        block10: {
            var4_2 = 4074743699404631861L;
            var6_3 = -112328148297044764L;
            if (!this.shouldEat(var1_1) && !var1_1.method_6115()) {
                this.stopEating();
                return;
            }
            var9_4 = a_0.E[24];
            var9_4 -= a_0.E[25];
            v0 = var6_3;
            var11_5 = a_0.E[27];
            var11_5 += a_0.E[28];
            var6_3 = v0 ^ ((long)a_0.b << (var9_4 -= a_0.E[26]) ^ v0) & -1L << (var11_5 -= a_0.E[29]);
            var13_6 = a_0.E[30];
            var13_6 -= a_0.E[31];
            var15_7 = a_0.E[33];
            var15_7 -= a_0.E[34];
            if ((var13_6 ^= a_0.E[32]) <= (int)(var6_3 >>> (var15_7 += a_0.E[35]))) {
                var17_8 = a_0.E[36];
                var17_8 ^= a_0.E[37];
                var19_9 = a_0.E[39];
                var19_9 ^= a_0.E[40];
                if ((int)(var6_3 >>> (var17_8 ^= a_0.E[38])) < (var19_9 += a_0.E[41])) {
                    var21_10 = a_0.E[42];
                    var21_10 -= a_0.E[43];
                    v1 = var21_10 -= a_0.E[44];
                } else {
                    var23_11 = a_0.E[45];
                    var23_11 ^= a_0.E[46];
                    v1 = var23_11 ^= a_0.E[47];
                }
            } else {
                var25_12 = a_0.E[48];
                var25_12 ^= a_0.E[49];
                v1 = var25_12 -= a_0.E[50];
            }
            if (v1 == 0) ** GOTO lbl-1000
            v2 = var1_1.method_31548().method_5438(a_0.b);
            var27_13 = a_0.E[51];
            var27_13 ^= a_0.E[52];
            Intrinsics.checkNotNullExpressionValue(v2, (String)a_0.c[var27_13 ^= a_0.E[53]]);
            if (this.canEat(var1_1, v2)) {
                v3 = a_0.b;
            } else lbl-1000:
            // 2 sources

            {
                v3 = var2_14 = this.findFoodSlot(var1_1);
            }
            if (var2_14 == null) {
                if (!var1_1.method_6115()) {
                    this.stopEating();
                }
                return;
            }
            a_0.b = var2_14;
            this.selectSlot(var1_1, var2_14);
            var29_15 = a_0.E[54];
            var29_15 += a_0.E[55];
            b_0.getMc().field_1690.field_1904.method_23481(var29_15 += a_0.E[56]);
            if (var1_1.method_6115()) break block10;
            v4 = b_0.getMc().field_1761;
            if (v4 != null) {
                v4.method_2919((class_1657)var1_1, class_1268.field_5808);
            }
        }
    }

    private final void startEating(class_746 class_7462, int n) {
        block0: {
            A = class_7462.method_31548().method_67532();
            B = b_0.getMc().field_1690.field_1904.method_1434();
            b = n;
            int n2 = E[57];
            n2 ^= E[58];
            a = n2 -= E[59];
            this.selectSlot(class_7462, n);
            boolean bl = E[60];
            bl += E[61];
            b_0.getMc().field_1690.field_1904.method_23481(bl ^= E[62]);
            class_636 class_6362 = b_0.getMc().field_1761;
            if (class_6362 == null) break block0;
            class_6362.method_2919((class_1657)class_7462, class_1268.field_5808);
        }
    }

    private final void stopEating() {
        long l = -442132012817521901L;
        long l2 = -2364344653460861882L;
        class_746 class_7462 = b_0.getMc().field_1724;
        if (a) {
            b_0.getMc().field_1690.field_1904.method_23481(B);
            if (class_7462 != null) {
                int n;
                int n2 = E[63];
                n2 += E[64];
                long l3 = l2;
                int n3 = E[66];
                n3 ^= E[67];
                l2 = l3 ^ ((long)A << (n2 += E[65]) ^ l3) & -1L << (n3 ^= E[68]);
                int n4 = E[69];
                n4 ^= E[70];
                int n5 = E[72];
                n5 += E[73];
                if ((n4 -= E[71]) <= (int)(l2 >>> (n5 ^= E[74]))) {
                    int n6 = E[75];
                    n6 += E[76];
                    int n7 = E[78];
                    n7 += E[79];
                    if ((int)(l2 >>> (n6 -= E[77])) < (n7 += E[80])) {
                        int n8 = E[81];
                        n8 -= E[82];
                        n = n8 += E[83];
                    } else {
                        int n9 = E[84];
                        n9 ^= E[85];
                        n = n9 -= E[86];
                    }
                } else {
                    int n10 = E[87];
                    n10 += E[88];
                    n = n10 += E[89];
                }
                if (n != 0) {
                    this.selectSlot(class_7462, A);
                }
            }
        }
        this.resetState();
    }

    private final Integer findFoodSlot(class_746 class_7462) {
        long l = -983922923725951629L;
        long l2 = -6601274241407308730L;
        long l3 = -9121734096982006202L;
        long l4 = -4612009775669504032L;
        int n = E[90];
        n += E[91];
        long l5 = l2;
        int n2 = E[93];
        n2 ^= E[94];
        l2 = l5 ^ ((long)class_7462.method_31548().method_67532() << (n += E[92]) ^ l5) & -1L << (n2 -= E[95]);
        int n3 = E[96];
        n3 ^= E[97];
        class_1799 class_17992 = class_7462.method_31548().method_5438((int)(l2 >>> (n3 -= E[98])));
        int n4 = E[99];
        n4 += E[100];
        Intrinsics.checkNotNullExpressionValue(class_17992, (String)c[n4 += E[101]]);
        if (this.canEat(class_7462, class_17992)) {
            int n5 = E[102];
            n5 -= E[103];
            return (int)(l2 >>> (n5 ^= E[104]));
        }
        long l6 = l4;
        int n6 = E[105];
        l4 = l6 ^ (0L ^ l6) & -1L << (n6 ^= E[106]);
        while (true) {
            int n7 = E[107];
            n7 += E[108];
            int n8 = E[110];
            n8 += E[111];
            if ((int)(l4 >>> (n7 += E[109])) >= (n8 -= E[112])) break;
            int n9 = E[113];
            n9 += E[114];
            class_1799 class_17993 = class_7462.method_31548().method_5438((int)(l4 >>> (n9 ^= E[115])));
            int n10 = E[116];
            n10 -= E[117];
            Intrinsics.checkNotNullExpressionValue(class_17993, (String)c[n10 ^= E[118]]);
            if (this.canEat(class_7462, class_17993)) {
                int n11 = E[119];
                n11 -= E[120];
                return (int)(l4 >>> (n11 ^= E[121]));
            }
            l4 += 0x100000000L;
        }
        return null;
    }

    private final boolean canEat(class_746 class_7462, class_1799 class_17992) {
        if (class_17992.method_7960()) {
            boolean bl = E[122];
            bl ^= E[123];
            return bl -= E[124];
        }
        class_4174 class_41742 = (class_4174)class_17992.method_58694(class_9334.field_50075);
        if (class_41742 == null) {
            boolean bl = E[125];
            bl -= E[126];
            return bl ^= E[127];
        }
        class_4174 class_41743 = class_41742;
        return class_7462.method_7332(class_41743.comp_2493());
    }

    private final boolean shouldEat(class_746 class_7462) {
        boolean bl;
        int n = E[128];
        n ^= E[129];
        if (class_7462.method_7344().method_7586() < (n ^= E[130])) {
            boolean bl2 = E[131];
            bl2 ^= E[132];
            bl = bl2 ^= E[133];
        } else {
            boolean bl3 = E[134];
            bl3 -= E[135];
            bl = bl3 -= E[136];
        }
        return bl;
    }

    public final boolean isActiveEating() {
        int n;
        if (this.isEnabled() && a) {
            int n2 = E[137];
            n2 ^= E[138];
            n = n2 += E[139];
        } else {
            int n3 = E[140];
            n3 -= E[141];
            n = n3 -= E[142];
        }
        return n != 0;
    }

    private final boolean shouldAbort(class_746 class_7462) {
        if (b_0.getMc().field_1755 != null) {
            boolean bl = E[143];
            bl -= E[144];
            return bl ^= E[145];
        }
        if (!class_7462.method_5805()) {
            boolean bl = E[146];
            bl += E[147];
            return bl += E[148];
        }
        return class_7462.method_7325();
    }

    private final void selectSlot(class_746 class_7462, int n) {
        block6: {
            int n2;
            int n3 = E[149];
            n3 -= E[150];
            if ((n3 += E[151]) <= n) {
                int n4 = E[152];
                n4 += E[153];
                if (n < (n4 += E[154])) {
                    int n5 = E[155];
                    n5 ^= E[156];
                    n2 = n5 -= E[157];
                } else {
                    int n6 = E[158];
                    n6 ^= E[159];
                    n2 = n6 -= E[160];
                }
            } else {
                int n7 = E[161];
                n7 += E[162];
                n2 = n7 += E[163];
            }
            if (n2 == 0) {
                return;
            }
            if (class_7462.method_31548().method_67532() == n) {
                return;
            }
            class_7462.method_31548().method_61496(n);
            class_636 class_6362 = b_0.getMc().field_1761;
            ClientPlayerInteractionManagerInvoker clientPlayerInteractionManagerInvoker = class_6362 instanceof ClientPlayerInteractionManagerInvoker ? (ClientPlayerInteractionManagerInvoker)class_6362 : null;
            if (clientPlayerInteractionManagerInvoker == null) break block6;
            clientPlayerInteractionManagerInvoker.rain$syncSelectedSlot();
        }
    }

    private final void resetState() {
        int n = E[164];
        n += E[165];
        a = n += E[166];
        int n2 = E[167];
        n2 -= E[168];
        A = n2 -= E[169];
        int n3 = E[170];
        n3 += E[171];
        b = n3 ^= E[172];
        int n4 = E[173];
        n4 ^= E[174];
        B = n4 ^= E[175];
    }

    static {
        a_0.b();
        long l = -667902648206242381L;
        long l2 = -56535434619512943L;
        long l3 = -1025755815118826490L;
        long l4 = -7308753558961685391L;
        long l5 = -828482331801146136L;
        long l6 = 9012051412953794694L;
        long l7 = -8955538285814128176L;
        long l8 = 3948566533382015062L;
        long l9 = 4785751687229396921L;
        long l10 = 1697203747737301437L;
        long l11 = 8060983791192701973L;
        long l12 = 1166379718787374081L;
        long l13 = -5781051267368071935L;
        long l14 = 8050860063628682531L;
        int n = E[176];
        n ^= E[177];
        c = new Object[n += E[178]];
        long l15 = l14;
        int n2 = E[179];
        n2 ^= E[180];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= E[181]);
        Object[] objectArray = new Object[E[182]];
        objectArray[a_0.E[183]] = C;
        objectArray[a_0.E[184]] = E[185];
        int n3 = E[186];
        Object object = a_0.A()[E[187]];
        if (object == null) {
            char[] cArray = "\u5c52\u5c71\u5c41\u5c39\u5c42\u5c23\u5c58\u5c23\u5c56\u5c2f\u5c40\u5c59\u5c2d\u5c31\u5c54\u5c31\u5c58\u5c50\u5c43\u5c6c\u5c6c\u5c38\u5c6c\u5c2e\u5c71\u5c55\u5c4b\u5c2b\u5c45\u5c09\u5c21\u5c6b\u5c30\u5c2b\u5c58\u5c2d\u5c39\u5c50\u5c30\u5c2a\u5c2d\u5c5a\u5c4e\u5c71\u5fdf\u5c44\u5c6f\u5c6f\u5c44\u5c54\u5c4e\u5c03\u5c42\u5c46\u5c32\u5c4e\u5c71\u5c3a\u5c0a\u5c7f\u5c72\u5c45\u5c35\u5c25\u5c6b\u5c59\u5c7f\u5c33\u5c4f\u5c4b\u5c57\u5c33\u5c30\u5c4b\u5c40\u5c06\u5c03\u5c53\u5c05\u5c03\u5c4b\u5c05\u5c72\u5c2f\u5c33\u5c53\u5c06\u5c3a\u5c40\u5c2e\u5c6b\u5c78\u5c06\u5c03\u5c4e\u5c31\u5c57\u5c2e\u5c21\u5c4e\u5c2b\u5c35\u5c20\u5c33\u5c4b\u5c42\u5c6c\u5c53\u5c31\u5c36\u5c2c\u5c50\u5c4a\u5c2d\u5c39\u5c56\u5c43\u5c7f\u5c41\u5c44\u5c44\u5c37\u5c04\u5c5a\u5c71\u5c40\u5c26\u5c71\u5c30\u5c70\u5c71\u5c55\u5c22\u5c0a\u5c70\u5c32\u5c4f\u5c51\u5c2f\u5c6c\u5c38\u5c04\u5c21\u5c26\u5c4f\u5c09\u5c2a\u5c44\u5c57\u5c0a\u5c37\u5c3a\u5c4c\u5fdf\u5c58\u5c50\u5c72\u5c24\u5c24\u5c37\u5c44\u5c51\u5c2c\u5c4e\u5c45\u5c2b\u5c35\u5c46\u5c29\u5c70\u5c2b\u5c23\u5c7f\u5c06\u5c29\u5c32\u5c4e\u5c2a\u5c4c\u5c2e\u5c25\u5c03\u5c32\u5c2e\u5c03\u5c4f\u5c2e\u5c39\u5c55\u5c6f\u5c4d\u5c21".toCharArray();
            for (int i2 = E[188]; i2 < E[189]; ++i2) {
                int n4 = cArray[i2];
                n4 ^= E[190];
                n4 -= E[191];
                n4 -= E[192];
                n4 -= E[193];
                n4 -= E[194];
                n4 += E[195];
                n4 -= E[196];
                n4 += E[197];
                n4 ^= E[198];
                cArray[i2] = (char)(n4 -= E[199]);
            }
            object = a_0.A()[a_0.E[200]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)a_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = E[201];
        n5 -= E[202];
        l5 = l16 ^ (0x6100000000L ^ l16) & -1L << (n5 ^= E[203]);
        long l17 = l12;
        int n6 = E[204];
        n6 ^= E[205];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= E[206]);
        while (true) {
            int n7 = E[207];
            n7 ^= E[208];
            if ((int)l12 >= (int)(l5 >>> (n7 += E[209]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = E[210];
            n9 ^= E[211];
            int n10 = E[213];
            n10 += E[214];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= E[212])) & -1L >>> (n10 ^= E[215]);
            long l19 = l8;
            int n11 = E[216];
            n11 += E[217];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= E[218]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = E[219];
            n13 += E[220];
            int n14 = E[222];
            n14 ^= E[223];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += E[221])) & -1L >>> (n14 ^= E[224]);
            int n15 = E[225];
            n15 ^= E[226];
            long l21 = l9;
            int n16 = E[228];
            n16 += E[229];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= E[227]) ^ l21) & -1L << (n16 ^= E[230]);
            int n17 = E[231];
            n17 += E[232];
            n17 ^= E[233];
            int n18 = E[234];
            n18 += E[235];
            long l22 = l11;
            int n19 = E[237];
            n19 ^= E[238];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= E[236]))) ^ l22) & -1L >>> (n19 -= E[239]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = E[240];
            n20 ^= E[241];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= E[242]);
            while (true) {
                int n21 = E[243];
                n21 -= E[244];
                if ((int)(l13 >>> (n21 += E[245])) >= (int)l11) break;
                int n22 = E[246];
                n22 -= E[247];
                int n23 = E[249];
                n23 -= E[250];
                cArray2[(int)(l13 >>> (n22 += a_0.E[248]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= E[251]))];
                l13 += 0x100000000L;
            }
            int n24 = E[252];
            n24 ^= E[253];
            int n25 = (int)(l14 >>> (n24 ^= E[254]));
            l14 += 0x100000000L;
            a_0.c[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = E[255];
            n26 += E[256];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= E[257]);
        }
        INSTANCE = new a_0();
        int n27 = E[258];
        n27 += E[259];
        A = n27 -= E[260];
        int n28 = E[261];
        n28 += E[262];
        b = n28 += E[263];
        int n29 = E[264];
        kotakbaz.rain.module.restrict.a.moduleOnFuntime$default(kotakbaz.rain.module.restrict.a.INSTANCE, INSTANCE, null, n29 += E[265], null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[E[266]];
        String string = (String)object[E[267]];
        object = object[E[268]];
        Object[] objectArray = D;
        if (D == null) {
            objectArray = D = new Object[E[269]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[E[270]];
                C = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[E[272] ^ E[273]];
                byArray[a_0.E[274] ^ a_0.E[275]] = E[276] ^ E[277];
                byArray[a_0.E[278] ^ a_0.E[279]] = E[280] ^ E[281];
                byArray[a_0.E[282] ^ a_0.E[283]] = E[284] ^ E[285];
                byArray[a_0.E[286] ^ a_0.E[287]] = E[288] ^ E[289];
                byArray[a_0.E[290] ^ a_0.E[291]] = E[292] ^ E[293];
                byArray[a_0.E[294] ^ a_0.E[295]] = E[296] ^ E[297];
                byArray[a_0.E[298] ^ a_0.E[299]] = E[300] ^ E[301];
                byArray[a_0.E[302] ^ a_0.E[303]] = E[304] ^ E[305];
                byArray[a_0.E[306] ^ a_0.E[307]] = E[308] ^ E[309];
                byArray[a_0.E[310] ^ a_0.E[311]] = E[312] ^ E[313];
                byArray[a_0.E[314] ^ a_0.E[315]] = E[316] ^ E[317];
                byArray[a_0.E[318] ^ a_0.E[319]] = E[320] ^ E[321];
                byArray[a_0.E[322] ^ a_0.E[323]] = E[324] ^ E[325];
                byArray[a_0.E[326] ^ a_0.E[327]] = E[328] ^ E[329];
                byArray[a_0.E[330] ^ a_0.E[331]] = E[332] ^ E[333];
                byArray[a_0.E[334] ^ a_0.E[335]] = E[336] ^ E[337];
                objectArray2[a_0.E[271]] = byArray;
            }
            byte[] byArray = (byte[])object3[E[338]];
            if (d == null) {
                byte[] byArray2 = new byte[E[339] ^ E[340]];
                byArray2[a_0.E[341] ^ a_0.E[342]] = E[343] ^ E[344];
                byArray2[a_0.E[345] ^ a_0.E[346]] = E[347] ^ E[348];
                byArray2[a_0.E[349] ^ a_0.E[350]] = E[351] ^ E[352];
                byArray2[a_0.E[353] ^ a_0.E[354]] = E[355] ^ E[356];
                byArray2[a_0.E[357] ^ a_0.E[358]] = E[359] ^ E[360];
                byArray2[a_0.E[361] ^ a_0.E[362]] = E[363] ^ E[364];
                byArray2[a_0.E[365] ^ a_0.E[366]] = E[367] ^ E[368];
                byArray2[a_0.E[369] ^ a_0.E[370]] = E[371] ^ E[372];
                byArray2[a_0.E[373] ^ a_0.E[374]] = E[375] ^ E[376];
                byArray2[a_0.E[377] ^ a_0.E[378]] = E[379] ^ E[380];
                byArray2[a_0.E[381] ^ a_0.E[382]] = E[383] ^ E[384];
                byArray2[a_0.E[385] ^ a_0.E[386]] = E[387] ^ E[388];
                byArray2[a_0.E[389] ^ a_0.E[390]] = E[391] ^ E[392];
                byArray2[a_0.E[393] ^ a_0.E[394]] = E[395] ^ E[396];
                byArray2[a_0.E[397] ^ a_0.E[398]] = E[399] ^ 0x66CF;
                byArray2[0xF7C2 ^ 0xF7C0] = 0xF7BB ^ 0xF7C0;
                byArray2[0x8C54 ^ 0x8C59] = 0xFFFF73FA ^ 0x8C59;
                byArray2[0xB55E ^ 0xB559] = 0xB522 ^ 0xB559;
                byArray2[0x9D8C ^ 0x9D86] = 0x9D94 ^ 0x9D86;
                byArray2[0x20A4 ^ 0x20BE] = 0x20EE ^ 0x20BE;
                byArray2[0x7813 ^ 0x7812] = 0x785D ^ 0x7812;
                byArray2[0x69D2 ^ 0x69DB] = 0xFFFF965F ^ 0x69DB;
                byArray2[0xC3F8 ^ 0xC3EA] = 0xC381 ^ 0xC3EA;
                byArray2[0xED68 ^ 0xED7B] = 0xFFFF12A2 ^ 0xED7B;
                byArray2[0x17F0 ^ 0x17F0] = 0x1784 ^ 0x17F0;
                byArray2[0x806E ^ 0x8061] = 0x8076 ^ 0x8061;
                byArray2[0x15F1 ^ 0x15E4] = 0x159B ^ 0x15E4;
                byArray2[0x4767 ^ 0x4770] = 0x471B ^ 0x4770;
                byArray2[0x4678 ^ 0x4666] = 0x4609 ^ 0x4666;
                byArray2[0x293F ^ 0x2927] = 0xFFFFD6B2 ^ 0x2927;
                byArray2[0x348B ^ 0x3490] = 0xFFFFCB57 ^ 0x3490;
                byArray2[0xFDDC ^ 0xFDD4] = 0xFFFF0215 ^ 0xFDD4;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = a_0.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u7fc0\u7f66\u7fbb\u7f64\u7f6a\u7f56\u7fb7\u7f9d\u7f94\u7fc8\u7f68\u7fa1\u7fc5\u7fc3\u7fb3\u7f68\u7f65\u7f55".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 -= 9826;
                        n2 -= 29605;
                        n2 += 40456;
                        n2 += 17864;
                        n2 -= 16076;
                        n2 += 7150;
                        n2 -= 20817;
                        n2 += 8851;
                        n2 ^= 0x6855;
                        n2 -= 57494;
                        n2 -= 19160;
                        n2 += 27484;
                        n2 -= 63740;
                        n2 -= 17789;
                        n2 -= 7550;
                        cArray[i2] = (char)(n2 ^= 0x3FF);
                    }
                    object4 = a_0.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[0] = -116;
                byArray4[12] = -88;
                byArray4[3] = -17;
                byArray4[4] = -125;
                byArray4[9] = -97;
                byArray4[15] = 59;
                byArray4[5] = 64;
                byArray4[7] = 90;
                byArray4[1] = 6;
                byArray4[14] = 36;
                byArray4[13] = 116;
                byArray4[2] = 58;
                byArray4[8] = 73;
                byArray4[6] = 110;
                byArray4[11] = -9;
                byArray4[10] = -107;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 19, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = a_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u170c\u16f0\u16fe".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 -= 53952;
                        n3 ^= 0xABF1;
                        n3 += 28785;
                        n3 += 45188;
                        n3 += 41253;
                        n3 -= 15095;
                        n3 -= 29912;
                        n3 += 12569;
                        n3 -= 24107;
                        n3 += 57244;
                        cArray[i3] = (char)(n3 += 19375);
                    }
                    object5 = a_0.A()[2] = new String(cArray);
                }
                d = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = a_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\uabab\uac87\uac49\uac5d\uac79\uac7a\uac79\uac5d\uac7c\uac51\uac79\uac49\uabb7\uac7c\uac4b\uac28\uac28\uac23\uac1e\uac25".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 -= 57108;
                    n4 += 49797;
                    n4 -= 31733;
                    n4 -= 48389;
                    n4 ^= 0x8D56;
                    n4 -= 58711;
                    n4 += 61129;
                    n4 ^= 0x6819;
                    n4 -= 36569;
                    n4 += 33370;
                    cArray[i4] = (char)(n4 -= 32831);
                }
                object6 = a_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)d), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = e;
        if (e == null) {
            e = new Object[4];
            objectArray = e;
        }
        return objectArray;
    }

    public static void b() {
        E = new int[0x80DF ^ 0x814F];
        a_0.E[0x4438 ^ 0x4463] = 0xFFFFBBDF ^ 0x4463;
        a_0.E[0xD238 ^ 0xD30C] = 0xFFFFA438 ^ 0xD30C;
        a_0.E[0xA9DE ^ 0xA984] = 0xA95D ^ 0xA984;
        a_0.E[0x620 ^ 0x677] = 0xFFFFF9FE ^ 0x677;
        a_0.E[0x7B3E ^ 0x7BA8] = 0xFFFF8422 ^ 0x7BA8;
        a_0.E[0x8FCA ^ 0x8FA3] = 0xFFFF7046 ^ 0x8FA3;
        a_0.E[0xDCF1 ^ 0xDC65] = 0xFFFF23D7 ^ 0xDC65;
        a_0.E[0xB549 ^ 0xB541] = 0xFFFF4AC0 ^ 0xB541;
        a_0.E[0x102AD ^ 0x1021C] = 0x1026C ^ 0x1021C;
        a_0.E[0xE96F ^ 0xE913] = 0xE94E ^ 0xE913;
        a_0.E[0x1118 ^ 0x118B] = 0xFFFFEE7E ^ 0x118B;
        a_0.E[0x930B ^ 0x924E] = 0x7710 ^ 0x924E;
        a_0.E[0x1747 ^ 0x175E] = 0x177F ^ 0x175E;
        a_0.E[0xE5FB ^ 0xE498] = 0x355C ^ 0xE498;
        a_0.E[0x3333 ^ 0x3215] = 0x3F17 ^ 0x3215;
        a_0.E[0xA0E9 ^ 0xA0E7] = 0xA0AC ^ 0xA0E7;
        a_0.E[0x5E9F ^ 0x5E5C] = 0x74B ^ 0x5E5C;
        a_0.E[0x1006D ^ 0x10168] = 0xFFFEFE87 ^ 0x10168;
        a_0.E[0x5BED ^ 0x5B4E] = 0x5B57 ^ 0x5B4E;
        a_0.E[0x7051 ^ 0x7067] = 0x706E ^ 0x7067;
        a_0.E[0xE210 ^ 0xE271] = 0xFFFF1DBC ^ 0xE271;
        a_0.E[0xB04B ^ 0xB085] = 0xFFFF4F61 ^ 0xB085;
        a_0.E[0xE5DB ^ 0xE5E7] = 0xFFFF1A23 ^ 0xE5E7;
        a_0.E[0xD61E ^ 0xD641] = 0xFFFF299B ^ 0xD641;
        a_0.E[0x5754 ^ 0x5609] = 0xA174 ^ 0x5609;
        a_0.E[0x86E8 ^ 0x8623] = 0x866C ^ 0x8623;
        a_0.E[0x4A1F ^ 0x4B74] = 0xFFFF8A2C ^ 0x4B74;
        a_0.E[0xA49E ^ 0xA4C7] = 0xA4A8 ^ 0xA4C7;
        a_0.E[0x833D ^ 0x8245] = 0x285F ^ 0x8245;
        a_0.E[0x10853 ^ 0x10855] = 0x1088C ^ 0x10855;
        a_0.E[0x1052 ^ 0x112E] = 0x2710 ^ 0x112E;
        a_0.E[0x876 ^ 0x966] = 0x108EE ^ 0x966;
        a_0.E[0xEA4B ^ 0xEB0D] = 0x1E26A ^ 0xEB0D;
        a_0.E[0x39C0 ^ 0x3888] = 0x131EF ^ 0x3888;
        a_0.E[0x4759 ^ 0x467A] = 0xA24A ^ 0x467A;
        a_0.E[0xD1A0 ^ 0xD0FA] = 0xF60D ^ 0xD0FA;
        a_0.E[0x6845 ^ 0x6936] = 0xFFFF6F14 ^ 0x6936;
        a_0.E[0xFC3E ^ 0xFD33] = 0xFD32 ^ 0xFD33;
        a_0.E[0x13A4 ^ 0x12B7] = 0xCBAC ^ 0x12B7;
        a_0.E[0x6D20 ^ 0x6D3B] = 0xFFFF92E7 ^ 0x6D3B;
        a_0.E[0x814B ^ 0x8040] = 0x8042 ^ 0x8040;
        a_0.E[0x4ACF ^ 0x4A3E] = 0x4A7F ^ 0x4A3E;
        a_0.E[0xFBD1 ^ 0xFA86] = 0xD827 ^ 0xFA86;
        a_0.E[0xDE42 ^ 0xDF0F] = 0x51F6 ^ 0xDF0F;
        a_0.E[0x2D10 ^ 0x2C10] = 0x2C57 ^ 0x2C10;
        a_0.E[0x72D7 ^ 0x72F7] = 0x72BF ^ 0x72F7;
        a_0.E[0xFA16 ^ 0xFAFE] = 0xFFFF0503 ^ 0xFAFE;
        a_0.E[0x4C65 ^ 0x4CE8] = 0xFFFFB347 ^ 0x4CE8;
        a_0.E[0xDFC3 ^ 0xDE4F] = 0xDA17 ^ 0xDE4F;
        a_0.E[0x590B ^ 0x59D3] = 0x59DE ^ 0x59D3;
        a_0.E[0x1975 ^ 0x18F4] = 0x8A55 ^ 0x18F4;
        a_0.E[0x8B82 ^ 0x8BB3] = 0xFFFF743C ^ 0x8BB3;
        a_0.E[0xB931 ^ 0xB83D] = 0xB83D ^ 0xB83D;
        a_0.E[0x7431 ^ 0x75B8] = 0x71F6 ^ 0x75B8;
        a_0.E[0x1D1C ^ 0x1C69] = 0xB675 ^ 0x1C69;
        a_0.E[0xFAC5 ^ 0xFAF0] = 0xFFFF0504 ^ 0xFAF0;
        a_0.E[0xFE49 ^ 0xFF3B] = 0x6C1 ^ 0xFF3B;
        a_0.E[0x81DE ^ 0x8120] = 0xFFFF7E92 ^ 0x8120;
        a_0.E[0x6116 ^ 0x6057] = 0x61ED ^ 0x6057;
        a_0.E[0x42 ^ 0x15F] = 0xE388 ^ 0x15F;
        a_0.E[0xB2F1 ^ 0xB2B1] = 0xB2C9 ^ 0xB2B1;
        a_0.E[0x1071 ^ 0x111D] = 0x2FAD ^ 0x111D;
        a_0.E[0x36DC ^ 0x3756] = 0x330E ^ 0x3756;
        a_0.E[0x4454 ^ 0x4419] = 0xFFFFBBA9 ^ 0x4419;
        a_0.E[0xAE00 ^ 0xAEF7] = 0xFFFF5151 ^ 0xAEF7;
        a_0.E[0x3798 ^ 0x36F2] = 0x842 ^ 0x36F2;
        a_0.E[0x2F94 ^ 0x2F97] = 0x2FB8 ^ 0x2F97;
        a_0.E[0xCF88 ^ 0xCEB4] = 0xFFFF2A6C ^ 0xCEB4;
        a_0.E[0x661 ^ 0x6A7] = 0x196C ^ 0x6A7;
        a_0.E[0x2357 ^ 0x23F0] = 0x23E3 ^ 0x23F0;
        a_0.E[0x5990 ^ 0x59EF] = 0xFFFFA618 ^ 0x59EF;
        a_0.E[0x2C86 ^ 0x2C84] = 0x2CCA ^ 0x2C84;
        a_0.E[0xE9AD ^ 0xE91D] = 0xFFFF16F9 ^ 0xE91D;
        a_0.E[0x4B40 ^ 0x4A15] = 0x6897 ^ 0x4A15;
        a_0.E[0x9B26 ^ 0x9B03] = 0xFFFF649E ^ 0x9B03;
        a_0.E[0x7FE4 ^ 0x7F8B] = 0xFFFF8014 ^ 0x7F8B;
        a_0.E[0x10EBB ^ 0x10E58] = 0xFFFEF1A0 ^ 0x10E58;
        a_0.E[0x5108 ^ 0x51E1] = 0xFFFFAE63 ^ 0x51E1;
        a_0.E[0x7C09 ^ 0x7D5D] = 0x572E ^ 0x7D5D;
        a_0.E[0x136B ^ 0x123D] = 0x30A0 ^ 0x123D;
        a_0.E[0x1333 ^ 0x13EA] = 0xFFFFEC53 ^ 0x13EA;
        a_0.E[0xB3FF ^ 0xB398] = 0xB3FB ^ 0xB398;
        a_0.E[0xDC91 ^ 0xDCE9] = 0xDCAC ^ 0xDCE9;
        a_0.E[0x3562 ^ 0x354C] = 0xFFFFCAE3 ^ 0x354C;
        a_0.E[0xD437 ^ 0xD414] = 0xD435 ^ 0xD414;
        a_0.E[0x7815 ^ 0x78C5] = 0x78B4 ^ 0x78C5;
        a_0.E[0x53DD ^ 0x52DF] = 0xFFFFAD2B ^ 0x52DF;
        a_0.E[0x2C38 ^ 0x2CCA] = 0x2CB0 ^ 0x2CCA;
        a_0.E[0xCAAB ^ 0xCBB4] = 0xBAF5 ^ 0xCBB4;
        a_0.E[0xA6C3 ^ 0xA7AA] = 0x990A ^ 0xA7AA;
        a_0.E[0xE84B ^ 0xE8E0] = 0xE8EA ^ 0xE8E0;
        a_0.E[0x397A ^ 0x3868] = 0xE175 ^ 0x3868;
        a_0.E[0xEB4 ^ 0xE79] = 0xFFFFF1F2 ^ 0xE79;
        a_0.E[0xB726 ^ 0xB63A] = 0x54C4 ^ 0xB63A;
        a_0.E[0x4C03 ^ 0x4CE8] = 0xFFFFB327 ^ 0x4CE8;
        a_0.E[0x228B ^ 0x23D8] = 0x98B ^ 0x23D8;
        a_0.E[0x2DA5 ^ 0x2D8E] = 0xFFFFD205 ^ 0x2D8E;
        a_0.E[0x88CF ^ 0x8940] = 0xFFFF101D ^ 0x8940;
        a_0.E[0xFF27 ^ 0xFE2D] = 0xFE2C ^ 0xFE2D;
        a_0.E[0x1C10 ^ 0x1C6B] = 0xFFFFE3EC ^ 0x1C6B;
        a_0.E[0xF727 ^ 0xF7A2] = 0xF789 ^ 0xF7A2;
        a_0.E[0x8097 ^ 0x80AA] = 0x809B ^ 0x80AA;
        a_0.E[0xA43C ^ 0xA5B8] = 0x370D ^ 0xA5B8;
        a_0.E[0x3F70 ^ 0x3F86] = 0x3FB0 ^ 0x3F86;
        a_0.E[0x97E6 ^ 0x96F3] = 0x4FE8 ^ 0x96F3;
        a_0.E[0x8F8B ^ 0x8ECB] = 0xFFFF70F8 ^ 0x8ECB;
        a_0.E[0x9ECE ^ 0x9F8C] = 0x7AD1 ^ 0x9F8C;
        a_0.E[0xC1C3 ^ 0xC1CA] = 0xFFFF3E3D ^ 0xC1CA;
        a_0.E[0xE26D ^ 0xE200] = 0xE24C ^ 0xE200;
        a_0.E[0x1DEA ^ 0x1D80] = 0xFFFFE245 ^ 0x1D80;
        a_0.E[0x202D ^ 0x2129] = 0x2123 ^ 0x2129;
        a_0.E[0x10BFC ^ 0x10B58] = 0x10B6F ^ 0x10B58;
        a_0.E[0xAB8 ^ 0xBA1] = 0x74DC ^ 0xBA1;
        a_0.E[0x3160 ^ 0x31E9] = 0xFFFFCE66 ^ 0x31E9;
        a_0.E[0x327B ^ 0x32B2] = 0x32DA ^ 0x32B2;
        a_0.E[0xF8C ^ 0xFF1] = 0xF9B ^ 0xFF1;
        a_0.E[0xD951 ^ 0xD9BE] = 0xFFFF2666 ^ 0xD9BE;
        a_0.E[0xE936 ^ 0xE970] = 0xE953 ^ 0xE970;
        a_0.E[0x84DD ^ 0x85CA] = 0xFAB7 ^ 0x85CA;
        a_0.E[0x4277 ^ 0x42DB] = 0x42F0 ^ 0x42DB;
        a_0.E[0x58DF ^ 0x59ED] = 0xD147 ^ 0x59ED;
        a_0.E[0x4387 ^ 0x431D] = 0x4374 ^ 0x431D;
        a_0.E[0x8B80 ^ 0x8B08] = 0xFFFF74B0 ^ 0x8B08;
        a_0.E[0x5E83 ^ 0x5E6D] = 0x5E5C ^ 0x5E6D;
        a_0.E[0xC5AF ^ 0xC4D1] = 0x3805 ^ 0xC4D1;
        a_0.E[0xB22B ^ 0xB2F9] = 0xFFFF4D51 ^ 0xB2F9;
        a_0.E[0x4A53 ^ 0x4A67] = 0x4A30 ^ 0x4A67;
        a_0.E[0x54D7 ^ 0x546D] = 0x546F ^ 0x546D;
        a_0.E[0x26FB ^ 0x26F0] = 0x26F8 ^ 0x26F0;
        a_0.E[0xD61B ^ 0xD79D] = 0x1D2E7 ^ 0xD79D;
        a_0.E[0xFEC ^ 0xE8B] = 0xFFFF1F2F ^ 0xE8B;
        a_0.E[0x1855 ^ 0x18E7] = 0x1894 ^ 0x18E7;
        a_0.E[0xCB4 ^ 0xC56] = 0xFFFFF3FC ^ 0xC56;
        a_0.E[0xBF97 ^ 0xBEEA] = 0x423A ^ 0xBEEA;
        a_0.E[0x52D9 ^ 0x53C7] = 0x228F ^ 0x53C7;
        a_0.E[0xCE33 ^ 0xCE1F] = 0xCE19 ^ 0xCE1F;
        a_0.E[0x1003B ^ 0x1003A] = 0x10026 ^ 0x1003A;
        a_0.E[0xBC5D ^ 0xBD26] = 0x8B47 ^ 0xBD26;
        a_0.E[0x4594 ^ 0x453A] = 0xFFFFBAD5 ^ 0x453A;
        a_0.E[0x558A ^ 0x556E] = 0xFFFFAA13 ^ 0x556E;
        a_0.E[0x10BA6 ^ 0x10B10] = 0x10B13 ^ 0x10B10;
        a_0.E[0x4EC8 ^ 0x4EB1] = 0x4EA6 ^ 0x4EB1;
        a_0.E[0x47C0 ^ 0x46ED] = 0xA73C ^ 0x46ED;
        a_0.E[0x2C50 ^ 0x2C5C] = 0x2C30 ^ 0x2C5C;
        a_0.E[0x380B ^ 0x3985] = 0x5F4A ^ 0x3985;
        a_0.E[0x1639 ^ 0x168C] = 0x1680 ^ 0x168C;
        a_0.E[0x3F2C ^ 0x3F4F] = 0xFFFFC0E6 ^ 0x3F4F;
        a_0.E[0x9FCE ^ 0x9EBF] = 0x674E ^ 0x9EBF;
        a_0.E[0x1FA3 ^ 0x1FE2] = 0xFFFFE030 ^ 0x1FE2;
        a_0.E[0xDD2A ^ 0xDD14] = 0xFFFF22E0 ^ 0xDD14;
        a_0.E[0x138F ^ 0x12DD] = 0x12DD ^ 0x12DD;
        a_0.E[0x513F ^ 0x5187] = 0x5186 ^ 0x5187;
        a_0.E[0xF369 ^ 0xF3C9] = 0xF3BE ^ 0xF3C9;
        a_0.E[0xF087 ^ 0xF097] = 0xFFFF0F52 ^ 0xF097;
        a_0.E[0xA328 ^ 0xA389] = 0xA3A1 ^ 0xA389;
        a_0.E[0x474B ^ 0x462B] = 0xB153 ^ 0x462B;
        a_0.E[0x4CAE ^ 0x4DD4] = 0x7BEA ^ 0x4DD4;
        a_0.E[0xD76D ^ 0xD792] = 0xFFFF28CF ^ 0xD792;
        a_0.E[0x3639 ^ 0x3716] = 0x8254 ^ 0x3716;
        a_0.E[0x7A77 ^ 0x7AEB] = 0xFFFF8520 ^ 0x7AEB;
        a_0.E[0x3396 ^ 0x33EC] = 0xFFFFCC36 ^ 0x33EC;
        a_0.E[0xAF4 ^ 0xBF5] = 0xFFFFF471 ^ 0xBF5;
        a_0.E[0x77EB ^ 0x76B2] = 0x5054 ^ 0x76B2;
        a_0.E[0x44F5 ^ 0x4426] = 0x447C ^ 0x4426;
        a_0.E[0x31E7 ^ 0x31AC] = 0x31B9 ^ 0x31AC;
        a_0.E[0x2D4 ^ 0x3E5] = 0xB6A7 ^ 0x3E5;
        a_0.E[0x71F2 ^ 0x7187] = 0xFFFF8E6B ^ 0x7187;
        a_0.E[0x23E3 ^ 0x22C3] = 0xFFFFAC43 ^ 0x22C3;
        a_0.E[0x6AA4 ^ 0x6AE8] = 0xFFFF9553 ^ 0x6AE8;
        a_0.E[0x2AE5 ^ 0x2AAB] = 0x2A30 ^ 0x2AAB;
        a_0.E[0x26AC ^ 0x278D] = 0x56CC ^ 0x278D;
        a_0.E[0xA653 ^ 0xA661] = 0xFFFF599F ^ 0xA661;
        a_0.E[0xAFB0 ^ 0xAEBF] = 0xAEBF ^ 0xAEBF;
        a_0.E[0xCC03 ^ 0xCD15] = 0xB26D ^ 0xCD15;
        a_0.E[0xFCE5 ^ 0xFC64] = 0xFFFF03DB ^ 0xFC64;
        a_0.E[0x86A ^ 0x8B7] = 0xFFFFF764 ^ 0x8B7;
        a_0.E[0x101CE ^ 0x100DF] = 0x147 ^ 0x100DF;
        a_0.E[0x229D ^ 0x220C] = 0x2223 ^ 0x220C;
        a_0.E[0xC343 ^ 0xC20C] = 0xBE77 ^ 0xC20C;
        a_0.E[0xB99F ^ 0xB981] = 0xB90F ^ 0xB981;
        a_0.E[0x98F9 ^ 0x9850] = 0x9835 ^ 0x9850;
        a_0.E[0x6537 ^ 0x6537] = 0xFFFF9AE5 ^ 0x6537;
        a_0.E[0x4DC2 ^ 0x4DED] = 0xFFFFB251 ^ 0x4DED;
        a_0.E[0x2C4F ^ 0x2D6D] = 0xC957 ^ 0x2D6D;
        a_0.E[0x8A37 ^ 0x8B51] = 0x6543 ^ 0x8B51;
        a_0.E[0xF586 ^ 0xF5E2] = 0xF584 ^ 0xF5E2;
        a_0.E[0x36D5 ^ 0x36BB] = 0x36DA ^ 0x36BB;
        a_0.E[0x4596 ^ 0x44AF] = 0xFA04 ^ 0x44AF;
        a_0.E[0xE9DE ^ 0xE886] = 0xCA1B ^ 0xE886;
        a_0.E[0x45DF ^ 0x4510] = 0x4515 ^ 0x4510;
        a_0.E[0xBAF ^ 0xA92] = 0x11C7 ^ 0xA92;
        a_0.E[0x8C98 ^ 0x8CFD] = 0xFFFF730B ^ 0x8CFD;
        a_0.E[0xDE55 ^ 0xDEDF] = 0xDEE6 ^ 0xDEDF;
        a_0.E[0x3F9E ^ 0x3FF2] = 0x3FE3 ^ 0x3FF2;
        a_0.E[0x676F ^ 0x674E] = 0xFFFF98C0 ^ 0x674E;
        a_0.E[0x786F ^ 0x7947] = 0xFFFF8BE6 ^ 0x7947;
        a_0.E[0x6B7E ^ 0x6BC9] = 0x6BC9 ^ 0x6BC9;
        a_0.E[0xB3A9 ^ 0xB299] = 0xFFFFF86E ^ 0xB299;
        a_0.E[0xF2B3 ^ 0xF2EB] = 0xF2E3 ^ 0xF2EB;
        a_0.E[0x6126 ^ 0x61A1] = 0x6197 ^ 0x61A1;
        a_0.E[0xE1F5 ^ 0xE1E7] = 0xFFFF1E24 ^ 0xE1E7;
        a_0.E[0xCE6F ^ 0xCE31] = 0xFFFF31EA ^ 0xCE31;
        a_0.E[0x60B9 ^ 0x6016] = 0xFFFF9FD6 ^ 0x6016;
        a_0.E[0x2710 ^ 0x279E] = 0xFFFFD836 ^ 0x279E;
        a_0.E[0xC920 ^ 0xC9BF] = 0xFFFF3611 ^ 0xC9BF;
        a_0.E[0xD2AB ^ 0xD2A4] = 0xFFFF2D5B ^ 0xD2A4;
        a_0.E[0x45A5 ^ 0x45A8] = 0x45A9 ^ 0x45A8;
        a_0.E[0x58AF ^ 0x5897] = 0x58AB ^ 0x5897;
        a_0.E[0x8C1 ^ 0x8B7] = 0xFFFFF726 ^ 0x8B7;
        a_0.E[0x1004B ^ 0x100DB] = 0xFFFEFF16 ^ 0x100DB;
        a_0.E[0x2075 ^ 0x201D] = 0x2035 ^ 0x201D;
        a_0.E[0x86D6 ^ 0x865A] = 0xFFFF790D ^ 0x865A;
        a_0.E[0xE837 ^ 0xE830] = 0xFFFF1799 ^ 0xE830;
        a_0.E[0x8465 ^ 0x84F2] = 0xFFFF7B0A ^ 0x84F2;
        a_0.E[0xF694 ^ 0xF660] = 0xFFFF09CB ^ 0xF660;
        a_0.E[0x7F3A ^ 0x7E02] = 0xC0AD ^ 0x7E02;
        a_0.E[0x5DB3 ^ 0x5D53] = 0x5D2D ^ 0x5D53;
        a_0.E[0x105AE ^ 0x1053B] = 0xFFFEFAA9 ^ 0x1053B;
        a_0.E[0xA462 ^ 0xA42D] = 0xFFFF5BE7 ^ 0xA42D;
        a_0.E[0xDD10 ^ 0xDC78] = 0x326A ^ 0xDC78;
        a_0.E[0xABF1 ^ 0xABA1] = 0xFFFF5405 ^ 0xABA1;
        a_0.E[0xD8E6 ^ 0xD9AD] = 0x5754 ^ 0xD9AD;
        a_0.E[0x349C ^ 0x3447] = 0x3428 ^ 0x3447;
        a_0.E[0xAFB9 ^ 0xAED4] = 0xE158 ^ 0xAED4;
        a_0.E[0xB4AF ^ 0xB490] = 0xFFFF4B46 ^ 0xB490;
        a_0.E[0x74EC ^ 0x75DA] = 0xCB71 ^ 0x75DA;
        a_0.E[0x5E3 ^ 0x5CA] = 0x590 ^ 0x5CA;
        a_0.E[0xE90A ^ 0xE91E] = 0xFFFF168E ^ 0xE91E;
        a_0.E[0x2192 ^ 0x212D] = 0xDB5C ^ 0x212D;
        a_0.E[0x3946 ^ 0x39AB] = 0xFFFFC662 ^ 0x39AB;
        a_0.E[0xD303 ^ 0xD34A] = 0xD352 ^ 0xD34A;
        a_0.E[0x57E3 ^ 0x57FF] = 0xFFFFA818 ^ 0x57FF;
        a_0.E[0x891D ^ 0x89B7] = 0xFFFF767D ^ 0x89B7;
        a_0.E[0x783 ^ 0x6B6] = 0x8E14 ^ 0x6B6;
        a_0.E[0x18EE ^ 0x19DD] = 0x917F ^ 0x19DD;
        a_0.E[0x10A1F ^ 0x10AA4] = 0x10AA4 ^ 0x10AA4;
        a_0.E[0x4358 ^ 0x42DA] = 0xD06F ^ 0x42DA;
        a_0.E[0xB8C7 ^ 0xB859] = 0xFFFF4780 ^ 0xB859;
        a_0.E[0x1A2B ^ 0x1A55] = 0x1A26 ^ 0x1A55;
        a_0.E[0x788D ^ 0x7908] = 0x17C6E ^ 0x7908;
        a_0.E[0xF47B ^ 0xF4FD] = 0xFFFF0B13 ^ 0xF4FD;
        a_0.E[0x57D4 ^ 0x571C] = 0x571C ^ 0x571C;
        a_0.E[0x89E6 ^ 0x8890] = 0x228A ^ 0x8890;
        a_0.E[0x2C0C ^ 0x2CD9] = 0xFFFFD3AD ^ 0x2CD9;
        a_0.E[0x73AF ^ 0x732C] = 0x733E ^ 0x732C;
        a_0.E[0xB936 ^ 0xB9AB] = 0xFFFF4632 ^ 0xB9AB;
        a_0.E[0x31AF ^ 0x318B] = 0x3185 ^ 0x318B;
        a_0.E[0xA857 ^ 0xA8D5] = 0xFFFF577C ^ 0xA8D5;
        a_0.E[0x8EC1 ^ 0x8ED2] = 0x8EA1 ^ 0x8ED2;
        a_0.E[0x58E4 ^ 0x598A] = 0x1605 ^ 0x598A;
        a_0.E[0xBDE8 ^ 0xBCAB] = 0x59F5 ^ 0xBCAB;
        a_0.E[0x8CDE ^ 0x8D5D] = 0xFFFFE01F ^ 0x8D5D;
        a_0.E[0x721E ^ 0x7393] = 0x1552 ^ 0x7393;
        a_0.E[0xCEBF ^ 0xCE8C] = 0xFFFF312F ^ 0xCE8C;
        a_0.E[0x3CF0 ^ 0x3D94] = 0xEC42 ^ 0x3D94;
        a_0.E[0xD255 ^ 0xD216] = 0xFFFF2DA8 ^ 0xD216;
        a_0.E[0xA23 ^ 0xB19] = 0x1040 ^ 0xB19;
        a_0.E[0xF755 ^ 0xF64E] = 0x1499 ^ 0xF64E;
        a_0.E[0xA529 ^ 0xA5EB] = 0xDA8C ^ 0xA5EB;
        a_0.E[0xE9FF ^ 0xE878] = 0x1ED79 ^ 0xE878;
        a_0.E[0x10AD1 ^ 0x10AA0] = 0xFFFEF539 ^ 0x10AA0;
        a_0.E[0x7175 ^ 0x7017] = 0xA1C1 ^ 0x7017;
        a_0.E[0x9FBA ^ 0x9FA0] = 0xFFFF6047 ^ 0x9FA0;
        a_0.E[0x57A5 ^ 0x56E1] = 0xB381 ^ 0x56E1;
        a_0.E[0xB73A ^ 0xB722] = 0xB70A ^ 0xB722;
        a_0.E[0x698B ^ 0x6893] = 0xFFFFE825 ^ 0x6893;
        a_0.E[0xCC63 ^ 0xCC2B] = 0xFFFF33A7 ^ 0xCC2B;
        a_0.E[0x1147 ^ 0x117E] = 0x115F ^ 0x117E;
        a_0.E[0x7056 ^ 0x70EF] = 0x70EF ^ 0x70EF;
        a_0.E[0x6FBA ^ 0x6F56] = 0xFFFF90EA ^ 0x6F56;
        a_0.E[0x19F9 ^ 0x18FA] = 0x18EF ^ 0x18FA;
        a_0.E[0xF785 ^ 0xF7C2] = 0xF7A8 ^ 0xF7C2;
        a_0.E[0xD20 ^ 0xC07] = 0x10A ^ 0xC07;
        a_0.E[0x384A ^ 0x386C] = 0xFFFFC7DF ^ 0x386C;
        a_0.E[0x8D3F ^ 0x8DA6] = 0x8DA3 ^ 0x8DA6;
        a_0.E[0x2ABF ^ 0x2BEF] = 0x57C8 ^ 0x2BEF;
        a_0.E[0x1023F ^ 0x10376] = 0xA10 ^ 0x10376;
        a_0.E[0x85C8 ^ 0x8530] = 0xFFFF7AA0 ^ 0x8530;
        a_0.E[0xD469 ^ 0xD459] = 0xD428 ^ 0xD459;
        a_0.E[0xF321 ^ 0xF31B] = 0xFFFF0C8C ^ 0xF31B;
        a_0.E[0xD1A9 ^ 0xD08D] = 0x34B6 ^ 0xD08D;
        a_0.E[0x54A3 ^ 0x559C] = 0x5426 ^ 0x559C;
        a_0.E[0x7085 ^ 0x71DA] = 0x8684 ^ 0x71DA;
        a_0.E[0xEA32 ^ 0xEB75] = 0x1E213 ^ 0xEB75;
        a_0.E[0x1664 ^ 0x1753] = 0xA9F8 ^ 0x1753;
        a_0.E[0x6C9D ^ 0x6C4B] = 0x6C79 ^ 0x6C4B;
        a_0.E[0x106C5 ^ 0x10619] = 0xFFFEF9A6 ^ 0x10619;
        a_0.E[0x7DF3 ^ 0x7D27] = 0xFFFF82D6 ^ 0x7D27;
        a_0.E[0x7E20 ^ 0x7F59] = 0x497E ^ 0x7F59;
        a_0.E[0xCDBF ^ 0xCD27] = 0xFFFF32BC ^ 0xCD27;
        a_0.E[0x636C ^ 0x62E7] = 0xFFFF9964 ^ 0x62E7;
        a_0.E[0x77A3 ^ 0x77B2] = 0x77A8 ^ 0x77B2;
        a_0.E[0x62E6 ^ 0x63E8] = 0x63E9 ^ 0x63E8;
        a_0.E[0xA14E ^ 0xA12E] = 0xA109 ^ 0xA12E;
        a_0.E[0x77CC ^ 0x7731] = 0x776B ^ 0x7731;
        a_0.E[0x1092A ^ 0x10866] = 0x186F6 ^ 0x10866;
        a_0.E[0xCBA ^ 0xC9D] = 0xFFFFF316 ^ 0xC9D;
        a_0.E[0x3A7C ^ 0x3A0F] = 0xFFFFC586 ^ 0x3A0F;
        a_0.E[0x923 ^ 0x9A7] = 0x99F ^ 0x9A7;
        a_0.E[0x1C82 ^ 0x1CF2] = 0xFFFFE305 ^ 0x1CF2;
        a_0.E[0x327D ^ 0x3337] = 0xBDC3 ^ 0x3337;
        a_0.E[0x893 ^ 0x82E] = 0x8EE ^ 0x82E;
        a_0.E[0xF45A ^ 0xF480] = 0xFFFF0B26 ^ 0xF480;
        a_0.E[0xA564 ^ 0xA561] = 0xA57D ^ 0xA561;
        a_0.E[0x974B ^ 0x964C] = 0x9654 ^ 0x964C;
        a_0.E[0xE272 ^ 0xE2F9] = 0xE2B2 ^ 0xE2F9;
        a_0.E[0x10029 ^ 0x10120] = 0xFFFEFEA8 ^ 0x10120;
        a_0.E[0x10DF0 ^ 0x10CDB] = 0x1ED0A ^ 0x10CDB;
        a_0.E[0x40E7 ^ 0x401B] = 0xFFFFBFD3 ^ 0x401B;
        a_0.E[0x846A ^ 0x8408] = 0xFFFF7BC2 ^ 0x8408;
        a_0.E[0x4399 ^ 0x43C5] = 0xFFFFBC4E ^ 0x43C5;
        a_0.E[0xEF08 ^ 0xEFF2] = 0xEFB7 ^ 0xEFF2;
        a_0.E[0xCF9E ^ 0xCFCC] = 0xCFA0 ^ 0xCFCC;
        a_0.E[0x5303 ^ 0x53E2] = 0x5390 ^ 0x53E2;
        a_0.E[0xB3EE ^ 0xB343] = 0xB36C ^ 0xB343;
        a_0.E[0xD34B ^ 0xD369] = 0xFFFF2CE6 ^ 0xD369;
        a_0.E[0x4EDB ^ 0x4E0A] = 0xFFFFB1A6 ^ 0x4E0A;
        a_0.E[0xF931 ^ 0xF9DB] = 0xF9D6 ^ 0xF9DB;
        a_0.E[0x4F39 ^ 0x4F6A] = 0x4F57 ^ 0x4F6A;
        a_0.E[0x9307 ^ 0x9201] = 0xFFFF6DF9 ^ 0x9201;
        a_0.E[0x4A26 ^ 0x4A40] = 0x4A2B ^ 0x4A40;
        a_0.E[0xCEF ^ 0xDFB] = 0xD4B7 ^ 0xDFB;
        a_0.E[0xB738 ^ 0xB7F8] = 0x94D ^ 0xB7F8;
        a_0.E[0xD2F6 ^ 0xD37E] = 0x1D604 ^ 0xD37E;
        a_0.E[0xAC3F ^ 0xACF8] = 0x1F53 ^ 0xACF8;
        a_0.E[0xC9C0 ^ 0xC97E] = 0x775E ^ 0xC97E;
        a_0.E[0xDF58 ^ 0xDF2A] = 0xDF3A ^ 0xDF2A;
        a_0.E[0x673C ^ 0x6619] = 0x8229 ^ 0x6619;
        a_0.E[0x1079A ^ 0x107DE] = 0xFFFEF823 ^ 0x107DE;
        a_0.E[0x8A59 ^ 0x8A1C] = 0x8A55 ^ 0x8A1C;
        a_0.E[0xD4A ^ 0xD5F] = 0xFFFFF260 ^ 0xD5F;
        a_0.E[0xC6D9 ^ 0xC69B] = 0xC6F8 ^ 0xC69B;
        a_0.E[0xDBC6 ^ 0xDB63] = 0xDB7B ^ 0xDB63;
        a_0.E[0x625A ^ 0x6261] = 0xFFFF9DD4 ^ 0x6261;
        a_0.E[0xB2EE ^ 0xB2EA] = 0xFFFF4D04 ^ 0xB2EA;
        a_0.E[0x3D5 ^ 0x2FF] = 0xE32C ^ 0x2FF;
        a_0.E[0xA2CA ^ 0xA20E] = 0xB925 ^ 0xA20E;
        a_0.E[0x9197 ^ 0x90E7] = 0xDF68 ^ 0x90E7;
        a_0.E[0x573E ^ 0x565B] = 0xB845 ^ 0x565B;
        a_0.E[0x145 ^ 0x1A0] = 0x195 ^ 0x1A0;
        a_0.E[0x101DC ^ 0x1012F] = 0xFFFEFE61 ^ 0x1012F;
        a_0.E[0x1200 ^ 0x1277] = 0x120B ^ 0x1277;
        a_0.E[0x2EE9 ^ 0x2E9D] = 0xFFFFD1E2 ^ 0x2E9D;
        a_0.E[0xF015 ^ 0xF048] = 0xF069 ^ 0xF048;
        a_0.E[0x5555 ^ 0x542A] = 0xFFFF5755 ^ 0x542A;
        a_0.E[0x339B ^ 0x3328] = 0x3361 ^ 0x3328;
        a_0.E[0x5079 ^ 0x5116] = 0xFFFFE11D ^ 0x5116;
        a_0.E[0x9D1E ^ 0x9DF9] = 0xFFFF626C ^ 0x9DF9;
        a_0.E[0x267C ^ 0x2755] = 0x2A58 ^ 0x2755;
        a_0.E[0x20AA ^ 0x2066] = 0xFFFFDFE9 ^ 0x2066;
        a_0.E[0xB1E1 ^ 0xB0BA] = 0xFFFF69B4 ^ 0xB0BA;
        a_0.E[0xCD51 ^ 0xCC1F] = 0xB06A ^ 0xCC1F;
        a_0.E[0x13BE ^ 0x12C9] = 0xFFFF4712 ^ 0x12C9;
        a_0.E[0x48EC ^ 0x4832] = 0x484C ^ 0x4832;
        a_0.E[0x5980 ^ 0x590F] = 0xFFFFA6F4 ^ 0x590F;
        a_0.E[0x9E1F ^ 0x9E84] = 0x9ED5 ^ 0x9E84;
        a_0.E[0x6C2C ^ 0x6CD9] = 0x6CA4 ^ 0x6CD9;
        a_0.E[0x559E ^ 0x5567] = 0xFFFFAA91 ^ 0x5567;
        a_0.E[0x82EC ^ 0x827E] = 0x8224 ^ 0x827E;
        a_0.E[0x7916 ^ 0x7838] = 0xCD71 ^ 0x7838;
        a_0.E[0x90B8 ^ 0x9079] = 0x727C ^ 0x9079;
        a_0.E[0x10D66 ^ 0x10DB1] = 0xFFFEF237 ^ 0x10DB1;
        a_0.E[0x5236 ^ 0x5262] = 0xFFFFAD9F ^ 0x5262;
        a_0.E[0x5EAA ^ 0x5E51] = 0xFFFFA1C0 ^ 0x5E51;
        a_0.E[0xC253 ^ 0xC327] = 0x3ADD ^ 0xC327;
        a_0.E[0x1DFB ^ 0x1DB1] = 0xFFFFE235 ^ 0x1DB1;
        a_0.E[0xBB05 ^ 0xBBE3] = 0xFFFF4471 ^ 0xBBE3;
        a_0.E[0xBD87 ^ 0xBCB9] = 0xBD04 ^ 0xBCB9;
        a_0.E[0xC943 ^ 0xC96E] = 0xC97D ^ 0xC96E;
        a_0.E[0x100C2 ^ 0x10060] = 0xFFFEFFDF ^ 0x10060;
        a_0.E[0x1013B ^ 0x10150] = 0xFFFEFE93 ^ 0x10150;
        a_0.E[0x59F1 ^ 0x59E6] = 0xFFFFA642 ^ 0x59E6;
        a_0.E[0x8BB1 ^ 0x8B7B] = 0xFFFF7482 ^ 0x8B7B;
        a_0.E[0xB215 ^ 0xB20A] = 0xB24C ^ 0xB20A;
        a_0.E[0x917B ^ 0x9025] = 0x675D ^ 0x9025;
        a_0.E[0x9FFD ^ 0x9FAC] = 0x9F9C ^ 0x9FAC;
        a_0.E[0xA118 ^ 0xA130] = 0xA114 ^ 0xA130;
        a_0.E[0x660A ^ 0x66CF] = 0xC0A4 ^ 0x66CF;
        a_0.E[0x3071 ^ 0x30D7] = 0xFFFFCF66 ^ 0x30D7;
        a_0.E[0xFDA3 ^ 0xFDBE] = 0xFFFF021D ^ 0xFDBE;
        a_0.E[0x3F43 ^ 0x3F9C] = 0x3FBC ^ 0x3F9C;
        a_0.E[0xF34D ^ 0xF261] = 0xFFFFEC38 ^ 0xF261;
        a_0.E[0xC3A2 ^ 0xC30A] = 0xFFFF3CA5 ^ 0xC30A;
        a_0.E[0x74C8 ^ 0x75A9] = 0xA462 ^ 0x75A9;
        a_0.E[0x8C2C ^ 0x8D70] = 0xAB87 ^ 0x8D70;
        a_0.E[0x36D7 ^ 0x3757] = 0xCB83 ^ 0x3757;
        a_0.E[0x956 ^ 0x9A6] = 0x97D ^ 0x9A6;
        a_0.E[0xCAFB ^ 0xCACC] = 0xFFFF3570 ^ 0xCACC;
        a_0.E[0xDEA6 ^ 0xDE26] = 0xDE24 ^ 0xDE26;
        a_0.E[0x530B ^ 0x5230] = 0x4965 ^ 0x5230;
        a_0.E[0xD48 ^ 0xD1E] = 0xFFFFF2BB ^ 0xD1E;
        a_0.E[0x332 ^ 0x338] = 0xFFFFFCD1 ^ 0x338;
        a_0.E[0x64C0 ^ 0x64EA] = 0xFFFF9B78 ^ 0x64EA;
        a_0.E[0xAB2D ^ 0xAA7C] = 0xD607 ^ 0xAA7C;
        a_0.E[0x53C4 ^ 0x5378] = 0x5378 ^ 0x5378;
        a_0.E[0x616E ^ 0x613B] = 0x6163 ^ 0x613B;
        a_0.E[0x9527 ^ 0x9531] = 0xFFFF6A8A ^ 0x9531;
        a_0.E[0x10468 ^ 0x104DC] = 0x104B9 ^ 0x104DC;
        a_0.E[0xF7C4 ^ 0xF6DE] = 0x140D ^ 0xF6DE;
        a_0.E[0xE8DD ^ 0xE9D5] = 0xE9AF ^ 0xE9D5;
    }
}

