/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_437
 *  net.minecraft.class_490
 *  net.minecraft.class_636
 *  net.minecraft.class_746
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
import kotakbaz.rain.command.A;
import kotakbaz.rain.event.events.G;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.modules.player.D;
import kotakbaz.rain.module.modules.player.R;
import kotakbaz.rain.module.restrict.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_437;
import net.minecraft.class_490;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

/*
 * Renamed from kotakbaz.rain.module.modules.player.b
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010\u0003R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u0010\u001bR\u0016\u0010*\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b*\u0010\u0018R\u0016\u0010+\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010(\u00a8\u0006-"}, d2={"Lkotakbaz/rain/module/modules/player/ItemSwapModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/KeyEvent;", "event", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "", "inventorySlot", "toHandlerSlot", "(I)Ljava/lang/Integer;", "", "closeInventory", "resetPressed", "resetProgress", "(ZZ)V", "OFFHAND_SWAP_BUTTON", "I", "", "STEP_DELAY_MS", "J", "FIXED_INVENTORY_SLOT", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "swapKey", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "legacySlotSetting", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "getLegacySlotSetting$annotations", "Lkotakbaz/rain/module/modules/player/ItemSwapModule$State;", "state", "Lkotakbaz/rain/module/modules/player/ItemSwapModule$State;", "wasPressed", "Z", "nextActionAt", "targetHandlerSlot", "inventoryOpenedByModule", "State", "rain-visuals"})
public final class b_0
extends a_0 {
    @NotNull
    public static final b_0 INSTANCE;
    private static final int a = 40;
    private static final long A = 80L;
    private static final int b = 13;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.b_0 B;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 c;
    @NotNull
    private static R C;
    private static boolean d;
    private static long D;
    private static int e;
    private static boolean E;
    private static Object[] f;
    private static Object g;
    private static Object[] G;
    private static Object[] F;
    private static Object[] h;
    public static int[] H;

    private b_0() {
        int n = H[0];
        n ^= H[1];
        int n2 = H[3];
        n2 += H[4];
        int n3 = H[6];
        n3 += H[7];
        super((String)f[n -= H[2]], kotakbaz.rain.client.extensions.a_0.getPLAYER(), (String)f[n2 += H[5]] + (String)f[n3 += H[8]]);
    }

    private static /* synthetic */ void getLegacySlotSetting$annotations() {
    }

    @Override
    public void onEnable() {
        boolean bl = H[9];
        bl += H[10];
        boolean bl2 = H[12];
        bl2 += H[13];
        this.resetProgress(bl += H[11], bl2 ^= H[14]);
    }

    @Override
    public void onDisable() {
        boolean bl = H[15];
        bl ^= H[16];
        boolean bl2 = H[18];
        bl2 -= H[19];
        this.resetProgress(bl ^= H[17], bl2 += H[20]);
    }

    @Commando
    public final void onKey(@NotNull G g2) {
        long l = -2568615345307681058L;
        long l2 = -805589795845149382L;
        long l3 = 2501257829845472450L;
        long l4 = 1764485799263387392L;
        int n = H[21];
        n += H[22];
        Intrinsics.checkNotNullParameter(g2, (String)f[n -= H[23]]);
        Integer n2 = g2.get(kotakbaz.rain.event.events.G.a.getBUTTON());
        if (n2 == null) {
            return;
        }
        int n3 = H[24];
        n3 -= H[25];
        long l5 = l2;
        int n4 = H[27];
        n4 -= H[28];
        l2 = l5 ^ ((long)n2.intValue() << (n3 ^= H[26]) ^ l5) & -1L << (n4 += H[29]);
        boolean bl = H[30];
        bl += H[31];
        if (Intrinsics.areEqual(g2.get(kotakbaz.rain.event.events.G.a.getMOUSE()), bl += H[32])) {
            return;
        }
        boolean bl2 = H[33];
        bl2 ^= H[34];
        long l6 = l2;
        int n5 = H[36];
        n5 -= H[37];
        l2 = l6 ^ ((long)Intrinsics.areEqual(g2.get(kotakbaz.rain.event.events.G.a.getRELEASE()), bl2 += H[35]) ^ l6) & -1L >>> (n5 ^= H[38]);
        int n6 = H[39];
        n6 += H[40];
        if ((int)(l2 >>> (n6 -= H[41])) != ((Number)B.getValue()).intValue()) {
            return;
        }
        if ((int)l2 != 0) {
            int n7 = H[42];
            n7 += H[43];
            d = n7 -= H[44];
            return;
        }
        class_746 class_7462 = kotakbaz.rain.client.extensions.b_0.getMc().field_1724;
        if (class_7462 == null) {
            return;
        }
        class_746 class_7463 = class_7462;
        if (kotakbaz.rain.client.extensions.b_0.getMc().field_1687 == null || kotakbaz.rain.client.extensions.b_0.getMc().field_1761 == null) {
            return;
        }
        if (kotakbaz.rain.client.extensions.b_0.getMc().field_1755 != null || C != R.a || d) {
            return;
        }
        long l7 = l4;
        int n8 = H[45];
        n8 -= H[46];
        l4 = l7 ^ (0xD00000000L ^ l7) & -1L << (n8 -= H[47]);
        int n9 = H[48];
        n9 += H[49];
        Integer n10 = this.toHandlerSlot((int)(l4 >>> (n9 -= H[50])));
        if (n10 == null) {
            int n11 = H[51];
            n11 ^= H[52];
            int n12 = H[54];
            n12 ^= H[55];
            kotakbaz.rain.command.A.INSTANCE.sendClientMessage((String)f[n11 += H[53]] + (String)f[n12 -= H[56]]);
            return;
        }
        int n13 = H[57];
        n13 -= H[58];
        d = n13 -= H[59];
        e = n10;
        C = R.A;
        D = 0L;
        int n14 = H[60];
        n14 ^= H[61];
        if (class_7463.method_31548().method_5438((int)(l4 >>> (n14 ^= H[62]))).method_7960() && class_7463.method_6079().method_7960()) {
            int n15 = H[63];
            n15 += H[64];
            int n16 = H[66];
            n16 ^= H[67];
            kotakbaz.rain.command.A.INSTANCE.sendClientMessage((String)f[n15 ^= H[65]] + (String)f[n16 ^= H[68]]);
        }
    }

    @Commando
    public final void onUpdate(@NotNull kotakbaz.rain.event.events.D d2) {
        long l = 5830133837638876443L;
        int n = H[69];
        n ^= H[70];
        Intrinsics.checkNotNullParameter(d2, (String)f[n -= H[71]]);
        class_746 class_7462 = kotakbaz.rain.client.extensions.b_0.getMc().field_1724;
        if (class_7462 == null) {
            b_0 b_02 = this;
            long l2 = l;
            int n2 = H[72];
            n2 ^= H[73];
            l = l2 ^ (0L ^ l2) & -1L << (n2 ^= H[74]);
            boolean bl = H[75];
            bl ^= H[76];
            boolean bl2 = H[78];
            bl2 ^= H[79];
            b_02.resetProgress(bl += H[77], bl2 ^= H[80]);
            return;
        }
        class_746 class_7463 = class_7462;
        if (kotakbaz.rain.client.extensions.b_0.getMc().field_1687 == null || kotakbaz.rain.client.extensions.b_0.getMc().field_1761 == null) {
            boolean bl = H[81];
            bl ^= H[82];
            boolean bl3 = H[84];
            bl3 ^= H[85];
            this.resetProgress(bl += H[83], bl3 ^= H[86]);
            return;
        }
        if (C == R.a) {
            return;
        }
        long l3 = System.currentTimeMillis();
        if (l3 < D) {
            return;
        }
        switch (kotakbaz.rain.module.modules.player.D.a[C.ordinal()]) {
            case 1: {
                if (kotakbaz.rain.client.extensions.b_0.getMc().field_1755 == null) {
                    kotakbaz.rain.client.extensions.b_0.getMc().method_1507((class_437)new class_490((class_1657)class_7463));
                    int n3 = H[87];
                    n3 ^= H[88];
                    E = n3 += H[89];
                }
                D = l3 + 80L;
                C = R.b;
                break;
            }
            case 2: {
                if (!(kotakbaz.rain.client.extensions.b_0.getMc().field_1755 instanceof class_490) || e < 0) {
                    boolean bl = H[90];
                    bl += H[91];
                    boolean bl4 = H[93];
                    bl4 ^= H[94];
                    this.resetProgress(bl -= H[92], bl4 += H[95]);
                    return;
                }
                class_636 class_6362 = kotakbaz.rain.client.extensions.b_0.getMc().field_1761;
                if (class_6362 != null) {
                    int n4 = H[96];
                    n4 += H[97];
                    class_6362.method_2906(class_7463.field_7498.field_7763, e, n4 ^= H[98], class_1713.field_7791, (class_1657)class_7463);
                }
                D = l3 + 80L;
                C = R.B;
                break;
            }
            case 3: {
                boolean bl = H[99];
                bl -= H[100];
                boolean bl5 = H[102];
                bl5 += H[103];
                this.resetProgress(bl -= H[101], bl5 ^= H[104]);
                break;
            }
            case 4: {
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final Integer toHandlerSlot(int n) {
        Integer n2;
        int n3;
        long l = 1082374167457197993L;
        long l2 = 5255338914687034286L;
        long l3 = 8633731754803341087L;
        int n4 = H[105];
        n4 ^= H[106];
        long l4 = l3;
        int n5 = H[108];
        n5 += H[109];
        l3 = l4 ^ ((long)n << (n4 -= H[107]) ^ l4) & -1L << (n5 ^= H[110]);
        int n6 = H[111];
        n6 -= H[112];
        int n7 = H[114];
        n7 ^= H[115];
        if ((n6 ^= H[113]) <= (int)(l3 >>> (n7 ^= H[116]))) {
            int n8 = H[117];
            n8 += H[118];
            int n9 = H[120];
            n9 ^= H[121];
            if ((int)(l3 >>> (n8 -= H[119])) < (n9 += H[122])) {
                int n10 = H[123];
                n10 += H[124];
                n3 = n10 -= H[125];
            } else {
                int n11 = H[126];
                n11 -= H[127];
                n3 = n11 += H[128];
            }
        } else {
            int n12 = H[129];
            n12 -= H[130];
            n3 = n12 -= H[131];
        }
        if (n3 != 0) {
            int n13 = H[132];
            n13 -= H[133];
            n2 = (n13 ^= H[134]) + n;
        } else {
            int n14;
            int n15 = H[135];
            n15 ^= H[136];
            int n16 = H[138];
            n16 ^= H[139];
            if ((n15 -= H[137]) <= (int)(l3 >>> (n16 ^= H[140]))) {
                int n17 = H[141];
                n17 += H[142];
                int n18 = H[144];
                n18 -= H[145];
                if ((int)(l3 >>> (n17 -= H[143])) < (n18 += H[146])) {
                    int n19 = H[147];
                    n19 -= H[148];
                    n14 = n19 -= H[149];
                } else {
                    int n20 = H[150];
                    n20 -= H[151];
                    n14 = n20 += H[152];
                }
            } else {
                int n21 = H[153];
                n21 -= H[154];
                n14 = n21 -= H[155];
            }
            n2 = n14 != 0 ? Integer.valueOf(n) : null;
        }
        return n2;
    }

    private final void resetProgress(boolean bl, boolean bl2) {
        if (bl && E && kotakbaz.rain.client.extensions.b_0.getMc().field_1755 instanceof class_490) {
            kotakbaz.rain.client.extensions.b_0.getMc().method_1507(null);
        }
        C = R.a;
        D = 0L;
        int n = H[156];
        n ^= H[157];
        e = n ^= H[158];
        int n2 = H[159];
        n2 ^= H[160];
        E = n2 ^= H[161];
        if (bl2) {
            int n3 = H[162];
            n3 -= H[163];
            d = n3 -= H[164];
        }
    }

    private static final boolean legacySlotSetting$lambda$0() {
        boolean bl = H[165];
        return bl -= H[166];
    }

    static {
        b_0.b();
        long l = -1816788839098495264L;
        long l2 = -2084728325235445474L;
        long l3 = 5056563260355666537L;
        long l4 = -2662275508342710010L;
        long l5 = 4567157518641813832L;
        long l6 = 6058738721649893106L;
        long l7 = -1214281454839698698L;
        long l8 = 7077465176102924808L;
        long l9 = 8809448090233475037L;
        long l10 = 7288619254852590610L;
        long l11 = -96115264872687349L;
        long l12 = 6443267262179547726L;
        long l13 = -8841954545119260894L;
        long l14 = 6995214620374212481L;
        int n = H[167];
        n ^= H[168];
        f = new Object[n ^= H[169]];
        long l15 = l14;
        int n2 = H[170];
        n2 += H[171];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= H[172]);
        Object[] objectArray = new Object[H[173]];
        objectArray[b_0.H[174]] = F;
        objectArray[b_0.H[175]] = H[176];
        int n3 = H[177];
        Object object = b_0.A()[H[178]];
        if (object == null) {
            char[] cArray = "\u4a91\u49f8\u49f9\u4a8d\u4a46\u49fc\u4aa1\u4aa1\u4a46\u4a99\u4a4c\u4a35\u4a91\u49f3\u4a36\u4a30\u4a48\u4a2f\u4aa3\u4a3c\u4a99\u49f5\u4a35\u49f6\u49f7\u4a01\u4a27\u49f8\u4a41\u4aa2\u4a4c\u4a48\u4a25\u4a47\u4a98\u4a03\u4a2f\u4a98\u49f1\u4a28\u4a3b\u4a28\u4a46\u4a46\u4a93\u49f3\u4a4c\u4a34\u4a9b\u49f6\u49f5\u4a48\u49ed\u4a2e\u4a2e\u4a28\u4aa1\u4a8e\u4a93\u49ed\u4a28\u4aa1\u4a39\u4a02\u4a2e\u4a48\u4a93\u49f9\u4a8f\u4a1f\u4a30\u4a92\u49f6\u49ed\u4aa2\u4aa2\u4a02\u4a45\u4a91\u4a47\u4a37\u4a47\u4a38\u4a2f\u4aa2\u4a28\u4a46\u4a96\u4a2e\u4a30\u4a38\u4a4c\u4a35\u4a94\u49fc\u4a2f\u4a45\u4a60\u4a41\u4a37\u4a8e\u4a95\u4a97\u4a90\u4a9a\u4a96\u4a27\u4a98\u4a99\u49f8\u4a30\u4a96\u4a60\u4a38\u4a4c\u4a97\u4a30\u4a37\u4a98\u4a9a\u4a2d\u4a2f\u4aa2\u4a8f\u49f6\u4a60\u4a36\u49f2\u49ee\u4a8d\u49f7\u4a3f\u4a2e\u4a40\u4a8d\u4a48\u49f5\u4a39\u4a43\u49f2\u4a4c\u49fc\u49f8\u4a9b\u49f9\u4a25\u4a60\u4a4c\u49f1\u49f3\u4a2c\u4a36\u4a94\u4a3f\u4a2c\u4a60\u4a60\u49f6\u4a60\u4a45\u4a8e\u4aa1\u4a97\u4a28\u4a38\u4a46\u4a2f\u4a3f\u4a8d\u4a40\u4a42\u4aa2\u4a8d\u4a2e\u4a91\u4a41\u4a8d\u4a03\u4a48\u4a3f\u4a92\u4a95\u49f3\u49f2\u4a26\u4a47\u4a90\u4a9c\u4a95\u4a92\u4a02\u4a43\u4a3b\u49f7\u4aa2\u4a41\u4a25\u4a3c\u4a39\u4a39\u4a47\u49f6\u4a36\u4a60\u4a91\u4a9c\u4a2e\u4a47\u4a25\u4a39\u4a45\u4a93\u4a91\u4a3a\u4a3c\u4a9c\u4a2e\u4a26\u49f7\u4a39\u4a46\u4a91\u49f6\u4a34\u4a98\u49f2\u4a91\u4a36\u49f9\u4a99\u4a42\u4a99\u4a30\u4a26\u49f3\u4a48\u49f7\u4a8f\u49fc\u4a3c\u49ee\u4a35\u4a8d\u4a30\u4a94\u49ef\u4a9b\u49f9\u49f5\u4a3f\u4a39\u4a8d\u4a9b\u4a60\u49f8\u4a38\u4a95\u4a25\u4a91\u4a01\u4aa1\u4a02\u4a3c\u4a3f\u4a93\u4a2f\u4a41\u4a3b\u4a93\u4a40\u4a48\u4a8f\u4a99\u4a48\u4a41\u49f3\u4a40\u4a93\u4a8e\u4a41\u49f7\u4a45\u4a47\u4a9a\u4a9a\u4a90\u4a42\u4a3b\u4a39\u4a94\u49f8\u4a3b\u4a2f\u49f8\u49f8\u4a03\u4a02\u4aa1\u4a99\u4a27\u4a91\u49f5\u4a9a\u49f7\u4a98\u4a60\u4a90\u49f6\u4a25\u4a26\u4a45\u4a1f\u4a46\u49fc\u49f7\u4a39\u4a96\u4a60\u4a99\u4aa1\u4a8f\u4a3a\u4a41\u49f1\u4a46\u4a4c\u4a3b\u49f9\u49f1\u4a26\u4a9c\u4a3a\u4aa2\u49f9\u4a99\u4a25\u4a35\u4a92\u4a98\u49ee\u4a28\u4a35\u4a2b\u4a2b".toCharArray();
            for (int i2 = H[179]; i2 < H[180]; ++i2) {
                int n4 = cArray[i2];
                n4 += H[181];
                n4 += H[182];
                n4 ^= H[183];
                n4 ^= H[184];
                n4 ^= H[185];
                n4 ^= H[186];
                n4 -= H[187];
                n4 ^= H[188];
                n4 -= H[189];
                n4 += H[190];
                n4 -= H[191];
                n4 -= H[192];
                cArray[i2] = (char)(n4 += H[193]);
            }
            object = b_0.A()[b_0.H[194]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)b_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = H[195];
        n5 += H[196];
        l5 = l16 ^ (0x8E00000000L ^ l16) & -1L << (n5 ^= H[197]);
        long l17 = l12;
        int n6 = H[198];
        n6 += H[199];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= H[200]);
        while (true) {
            int n7 = H[201];
            n7 += H[202];
            if ((int)l12 >= (int)(l5 >>> (n7 += H[203]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = H[204];
            n9 += H[205];
            int n10 = H[207];
            n10 += H[208];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += H[206])) & -1L >>> (n10 ^= H[209]);
            long l19 = l8;
            int n11 = H[210];
            n11 += H[211];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= H[212]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = H[213];
            n13 -= H[214];
            int n14 = H[216];
            n14 += H[217];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= H[215])) & -1L >>> (n14 += H[218]);
            int n15 = H[219];
            n15 ^= H[220];
            long l21 = l9;
            int n16 = H[222];
            n16 -= H[223];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= H[221]) ^ l21) & -1L << (n16 ^= H[224]);
            int n17 = H[225];
            n17 += H[226];
            n17 -= H[227];
            int n18 = H[228];
            n18 ^= H[229];
            long l22 = l11;
            int n19 = H[231];
            n19 ^= H[232];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= H[230]))) ^ l22) & -1L >>> (n19 ^= H[233]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = H[234];
            n20 -= H[235];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= H[236]);
            while (true) {
                int n21 = H[237];
                n21 += H[238];
                if ((int)(l13 >>> (n21 += H[239])) >= (int)l11) break;
                int n22 = H[240];
                n22 += H[241];
                int n23 = H[243];
                n23 -= H[244];
                cArray2[(int)(l13 >>> (n22 ^= b_0.H[242]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= H[245]))];
                l13 += 0x100000000L;
            }
            int n24 = H[246];
            n24 -= H[247];
            int n25 = (int)(l14 >>> (n24 += H[248]));
            l14 += 0x100000000L;
            b_0.f[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = H[249];
            n26 ^= H[250];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= H[251]);
        }
        INSTANCE = new b_0();
        int n27 = H[252];
        n27 ^= H[253];
        int n28 = H[255];
        n28 -= H[256];
        B = INSTANCE.bind((String)f[n27 += H[254]], n28 -= H[257]);
        int n29 = H[258];
        n29 += H[259];
        c = INSTANCE.slider((String)f[n29 ^= H[260]], 14.0f, 1.0f, 36.0f, 1.0f).setVisible(b_0::legacySlotSetting$lambda$0);
        C = R.a;
        int n30 = H[261];
        n30 ^= H[262];
        e = n30 -= H[263];
        int n31 = H[264];
        n31 -= H[265];
        kotakbaz.rain.module.restrict.a.moduleOnFuntime$default(kotakbaz.rain.module.restrict.a.INSTANCE, INSTANCE, null, n31 += H[266], null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[H[267]];
        String string = (String)object[H[268]];
        object = object[H[269]];
        Object[] objectArray = G;
        if (G == null) {
            objectArray = G = new Object[H[270]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[H[271]];
                F = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[H[273] ^ H[274]];
                byArray[b_0.H[275] ^ b_0.H[276]] = H[277] ^ H[278];
                byArray[b_0.H[279] ^ b_0.H[280]] = H[281] ^ H[282];
                byArray[b_0.H[283] ^ b_0.H[284]] = H[285] ^ H[286];
                byArray[b_0.H[287] ^ b_0.H[288]] = H[289] ^ H[290];
                byArray[b_0.H[291] ^ b_0.H[292]] = H[293] ^ H[294];
                byArray[b_0.H[295] ^ b_0.H[296]] = H[297] ^ H[298];
                byArray[b_0.H[299] ^ b_0.H[300]] = H[301] ^ H[302];
                byArray[b_0.H[303] ^ b_0.H[304]] = H[305] ^ H[306];
                byArray[b_0.H[307] ^ b_0.H[308]] = H[309] ^ H[310];
                byArray[b_0.H[311] ^ b_0.H[312]] = H[313] ^ H[314];
                byArray[b_0.H[315] ^ b_0.H[316]] = H[317] ^ H[318];
                byArray[b_0.H[319] ^ b_0.H[320]] = H[321] ^ H[322];
                byArray[b_0.H[323] ^ b_0.H[324]] = H[325] ^ H[326];
                byArray[b_0.H[327] ^ b_0.H[328]] = H[329] ^ H[330];
                byArray[b_0.H[331] ^ b_0.H[332]] = H[333] ^ H[334];
                byArray[b_0.H[335] ^ b_0.H[336]] = H[337] ^ H[338];
                objectArray2[b_0.H[272]] = byArray;
            }
            byte[] byArray = (byte[])object3[H[339]];
            if (g == null) {
                byte[] byArray2 = new byte[H[340] ^ H[341]];
                byArray2[b_0.H[342] ^ b_0.H[343]] = H[344] ^ H[345];
                byArray2[b_0.H[346] ^ b_0.H[347]] = H[348] ^ H[349];
                byArray2[b_0.H[350] ^ b_0.H[351]] = H[352] ^ H[353];
                byArray2[b_0.H[354] ^ b_0.H[355]] = H[356] ^ H[357];
                byArray2[b_0.H[358] ^ b_0.H[359]] = H[360] ^ H[361];
                byArray2[b_0.H[362] ^ b_0.H[363]] = H[364] ^ H[365];
                byArray2[b_0.H[366] ^ b_0.H[367]] = H[368] ^ H[369];
                byArray2[b_0.H[370] ^ b_0.H[371]] = H[372] ^ H[373];
                byArray2[b_0.H[374] ^ b_0.H[375]] = H[376] ^ H[377];
                byArray2[b_0.H[378] ^ b_0.H[379]] = H[380] ^ H[381];
                byArray2[b_0.H[382] ^ b_0.H[383]] = H[384] ^ H[385];
                byArray2[b_0.H[386] ^ b_0.H[387]] = H[388] ^ H[389];
                byArray2[b_0.H[390] ^ b_0.H[391]] = H[392] ^ H[393];
                byArray2[b_0.H[394] ^ b_0.H[395]] = H[396] ^ H[397];
                byArray2[b_0.H[398] ^ b_0.H[399]] = 0xFFFF8037 ^ Short.MAX_VALUE;
                byArray2[0x94F2 ^ 0x94E1] = 0xFFFF6B35 ^ 0x94E1;
                byArray2[0xF127 ^ 0xF126] = 0xFFFF0EFD ^ 0xF126;
                byArray2[0x10DDB ^ 0x10DC1] = 0x10D83 ^ 0x10DC1;
                byArray2[0x749D ^ 0x749A] = 0x74ED ^ 0x749A;
                byArray2[0x7C54 ^ 0x7C4B] = 0xFFFF83C7 ^ 0x7C4B;
                byArray2[0x514D ^ 0x5159] = 0xFFFFAEE2 ^ 0x5159;
                byArray2[0xFFD ^ 0xFFE] = 0xFFFFF07B ^ 0xFFE;
                byArray2[0x29F0 ^ 0x29F4] = 0xFFFFD669 ^ 0x29F4;
                byArray2[0x1087A ^ 0x1086F] = 0xFFFEF7DF ^ 0x1086F;
                byArray2[0x1081A ^ 0x10802] = 0xFFFEF782 ^ 0x10802;
                byArray2[0x10BC1 ^ 0x10BDC] = 0x10BD1 ^ 0x10BDC;
                byArray2[0x453E ^ 0x4530] = 0xFFFFBAFC ^ 0x4530;
                byArray2[0x7E45 ^ 0x7E47] = 0x7E25 ^ 0x7E47;
                byArray2[0x5AF1 ^ 0x5AE6] = 0x5AE7 ^ 0x5AE6;
                byArray2[0x38D0 ^ 0x38D8] = 0xFFFFC773 ^ 0x38D8;
                byArray2[0xF94D ^ 0xF944] = 0xF913 ^ 0xF944;
                byArray2[0x258A ^ 0x258C] = 0xFFFFDA74 ^ 0x258C;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = b_0.A()[1];
                if (object4 == null) {
                    char[] cArray = "\uc9a7\uc999\uc9a0\uc99b\uc99d\uca09\uc9ac\uca3e\uca4b\uca3f\uc99f\uca42\uc9b6\uc9b8\uc9a8\uc99f\uc996\uca06".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 -= 18913;
                        n2 += 53347;
                        n2 -= 38947;
                        n2 -= 17795;
                        n2 -= 44117;
                        n2 ^= 0xED7;
                        n2 ^= 0x3E68;
                        n2 -= 33052;
                        n2 -= 59069;
                        n2 -= 33293;
                        n2 -= 46269;
                        cArray[i2] = (char)(n2 ^= 0x57BE);
                    }
                    object4 = b_0.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[11] = -3;
                byArray4[6] = 77;
                byArray4[3] = -126;
                byArray4[4] = 126;
                byArray4[2] = 106;
                byArray4[12] = 87;
                byArray4[1] = 127;
                byArray4[8] = 85;
                byArray4[0] = 82;
                byArray4[14] = -70;
                byArray4[13] = -58;
                byArray4[7] = 86;
                byArray4[5] = -51;
                byArray4[10] = -70;
                byArray4[15] = -24;
                byArray4[9] = 19;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 12, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = b_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u43d1\u43dd\u43e3".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 += 1040;
                        n3 += 32050;
                        n3 += 50677;
                        n3 += 25590;
                        n3 -= 27495;
                        n3 += 45256;
                        n3 += 62282;
                        n3 ^= 0xE15B;
                        n3 += 2348;
                        n3 -= 10892;
                        n3 += 3725;
                        cArray[i3] = (char)(n3 ^= 0xB45E);
                    }
                    object5 = b_0.A()[2] = new String(cArray);
                }
                g = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = b_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\ub95c\ub958\ub8ae\ub902\ub95e\ub953\ub95e\ub902\ub8a1\ub896\ub95e\ub8ae\ub908\ub8a1\ub8fc\ub8fd\ub8fd\ub8b4\ub8b7\ub94a".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 ^= 0x6A44;
                    n4 += 8709;
                    n4 += 13833;
                    n4 += 24201;
                    n4 += 19275;
                    n4 += 43023;
                    n4 ^= 0xD490;
                    n4 -= 9042;
                    n4 -= 13459;
                    n4 -= 17235;
                    n4 -= 27862;
                    n4 += 35864;
                    n4 ^= 0x3559;
                    n4 -= 34619;
                    cArray[i4] = (char)(n4 -= 37246);
                }
                object6 = b_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)g), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = h;
        if (h == null) {
            h = new Object[4];
            objectArray = h;
        }
        return objectArray;
    }

    public static void b() {
        H = new int[0x2D69 ^ 0x2CF9];
        b_0.H[0x25B5 ^ 0x259E] = 0xFFFFDA47 ^ 0x259E;
        b_0.H[0xF157 ^ 0xF1D3] = 0xFFFF0EA2 ^ 0xF1D3;
        b_0.H[0xC4E1 ^ 0xC47B] = 0xC40D ^ 0xC47B;
        b_0.H[0xCA73 ^ 0xCB35] = 0x4A17 ^ 0xCB35;
        b_0.H[0x8AB9 ^ 0x8A36] = 0x8A59 ^ 0x8A36;
        b_0.H[0x2C66 ^ 0x2C12] = 0x2C79 ^ 0x2C12;
        b_0.H[0x439C ^ 0x43D8] = 0xFFFFBC5D ^ 0x43D8;
        b_0.H[0x889B ^ 0x89CB] = 0x5ECC ^ 0x89CB;
        b_0.H[0x77E7 ^ 0x778D] = 0x77FE ^ 0x778D;
        b_0.H[0x2CFD ^ 0x2CF0] = 0x2CA4 ^ 0x2CF0;
        b_0.H[0xEE25 ^ 0xEF08] = 0xFFFF4242 ^ 0xEF08;
        b_0.H[0x62F9 ^ 0x6393] = 0xA296 ^ 0x6393;
        b_0.H[0x247 ^ 0x23F] = 0x27F ^ 0x23F;
        b_0.H[0xD92F ^ 0xD823] = 0xD821 ^ 0xD823;
        b_0.H[0x359 ^ 0x395] = 0x3CA ^ 0x395;
        b_0.H[0x2FB5 ^ 0x2EEB] = 0x5727 ^ 0x2EEB;
        b_0.H[0xC086 ^ 0xC036] = 0xC036 ^ 0xC036;
        b_0.H[0x7C82 ^ 0x7C0C] = 0xFFFF83B8 ^ 0x7C0C;
        b_0.H[0x2232 ^ 0x2201] = 0xFFFFDDD2 ^ 0x2201;
        b_0.H[0x96B2 ^ 0x9675] = 0xFFFF69B2 ^ 0x9675;
        b_0.H[0x2F1 ^ 0x3E7] = 0x60D4 ^ 0x3E7;
        b_0.H[0xDF8F ^ 0xDF24] = 0xDF30 ^ 0xDF24;
        b_0.H[0x6F03 ^ 0x6F29] = 0x6F30 ^ 0x6F29;
        b_0.H[0x88D3 ^ 0x88F0] = 0xFFFF7720 ^ 0x88F0;
        b_0.H[0x34FC ^ 0x3588] = 0xA347 ^ 0x3588;
        b_0.H[0xF3C6 ^ 0xF2F0] = 0xAC67 ^ 0xF2F0;
        b_0.H[0x516D ^ 0x5066] = 0x5067 ^ 0x5066;
        b_0.H[0xA46F ^ 0xA5E3] = 0x11A9 ^ 0xA5E3;
        b_0.H[0x106FB ^ 0x106C9] = 0x106F0 ^ 0x106C9;
        b_0.H[0xF6FC ^ 0xF66B] = 0xF619 ^ 0xF66B;
        b_0.H[0x100FC ^ 0x101D3] = 0x19D28 ^ 0x101D3;
        b_0.H[0xE908 ^ 0xE82F] = 0x1559 ^ 0xE82F;
        b_0.H[0xBE92 ^ 0xBECE] = 0xBEE8 ^ 0xBECE;
        b_0.H[0x103AA ^ 0x10362] = 0x1034C ^ 0x10362;
        b_0.H[0xA640 ^ 0xA703] = 0x2622 ^ 0xA703;
        b_0.H[0xCA22 ^ 0xCA0A] = 0xCA5E ^ 0xCA0A;
        b_0.H[0x9BF6 ^ 0x9A80] = 0xA8B ^ 0x9A80;
        b_0.H[0x7D11 ^ 0x7DFB] = 0x7DC1 ^ 0x7DFB;
        b_0.H[0x1077A ^ 0x10634] = 0x125A8 ^ 0x10634;
        b_0.H[0xD07B ^ 0xD001] = 0xD05B ^ 0xD001;
        b_0.H[0xC943 ^ 0xC952] = 0xFFFF36DA ^ 0xC952;
        b_0.H[0xAEBD ^ 0xAE54] = 0xFFFF51B5 ^ 0xAE54;
        b_0.H[0xA986 ^ 0xA8D1] = 0xA617 ^ 0xA8D1;
        b_0.H[0x54AE ^ 0x54B6] = 0x5486 ^ 0x54B6;
        b_0.H[0xBA9 ^ 0xBCC] = 0xBD2 ^ 0xBCC;
        b_0.H[0x10B86 ^ 0x10AC6] = 0x183DD ^ 0x10AC6;
        b_0.H[0xA5FB ^ 0xA4D3] = 0x59AC ^ 0xA4D3;
        b_0.H[0x9B9B ^ 0x9BC6] = 0x9BFF ^ 0x9BC6;
        b_0.H[0x10D37 ^ 0x10C4F] = 0xFFFE63E9 ^ 0x10C4F;
        b_0.H[0x16D8 ^ 0x160E] = 0xFFFFE9C5 ^ 0x160E;
        b_0.H[0xCF82 ^ 0xCF24] = 0xFFFF30FA ^ 0xCF24;
        b_0.H[0x81DE ^ 0x8186] = 0x81CF ^ 0x8186;
        b_0.H[0x733D ^ 0x739A] = 0xFFFF8C10 ^ 0x739A;
        b_0.H[0x105BA ^ 0x105BB] = 0x105E0 ^ 0x105BB;
        b_0.H[0x431E ^ 0x4307] = 0x4337 ^ 0x4307;
        b_0.H[0x4F2 ^ 0x422] = 0xFFFFFBDC ^ 0x422;
        b_0.H[0x3CA7 ^ 0x3C7B] = 0xFFFFC3B2 ^ 0x3C7B;
        b_0.H[0x740A ^ 0x7566] = 0xB47B ^ 0x7566;
        b_0.H[0xC72D ^ 0xC751] = 0xC760 ^ 0xC751;
        b_0.H[0x28E ^ 0x3BF] = 0x9F65 ^ 0x3BF;
        b_0.H[0x23F7 ^ 0x231F] = 0x2373 ^ 0x231F;
        b_0.H[0xAAD0 ^ 0xAB5A] = 0x1F5A ^ 0xAB5A;
        b_0.H[0x1EA6 ^ 0x1EAA] = 0xFFFFE1E5 ^ 0x1EAA;
        b_0.H[0xE278 ^ 0xE329] = 0xFFFFCBD1 ^ 0xE329;
        b_0.H[0x10DEE ^ 0x10C61] = 0x1739E ^ 0x10C61;
        b_0.H[0x90A9 ^ 0x90CF] = 0xFFFF6F6B ^ 0x90CF;
        b_0.H[0xA033 ^ 0xA0A2] = 0xA085 ^ 0xA0A2;
        b_0.H[0xC566 ^ 0xC556] = 0xC5D8 ^ 0xC556;
        b_0.H[0x1454 ^ 0x1424] = 0xFFFFEB89 ^ 0x1424;
        b_0.H[0xC05B ^ 0xC0E8] = 0xC0E8 ^ 0xC0E8;
        b_0.H[0x8E4F ^ 0x8E10] = 0x8E3C ^ 0x8E10;
        b_0.H[0xA4C4 ^ 0xA5B8] = 0xFFFFFEDA ^ 0xA5B8;
        b_0.H[0xD9E9 ^ 0xD9A6] = 0xFFFF264E ^ 0xD9A6;
        b_0.H[0x4DA8 ^ 0x4CB5] = 0xFFFF7A41 ^ 0x4CB5;
        b_0.H[0x7A3B ^ 0x7A69] = 0x7A09 ^ 0x7A69;
        b_0.H[0x572F ^ 0x5665] = 0xAD27 ^ 0x5665;
        b_0.H[0x6D9A ^ 0x6D36] = 0xFFFF92C4 ^ 0x6D36;
        b_0.H[0x4F73 ^ 0x4F01] = 0x4F70 ^ 0x4F01;
        b_0.H[0xB9FA ^ 0xB950] = 0xFFFF46EE ^ 0xB950;
        b_0.H[0x6D52 ^ 0x6D15] = 0xFFFF92A0 ^ 0x6D15;
        b_0.H[0x511B ^ 0x505E] = 0xD109 ^ 0x505E;
        b_0.H[0xDA81 ^ 0xDB0F] = 0xA4E9 ^ 0xDB0F;
        b_0.H[0x93F ^ 0x9BE] = 0x98B ^ 0x9BE;
        b_0.H[0x8075 ^ 0x807B] = 0xFFFF7FD9 ^ 0x807B;
        b_0.H[0xF317 ^ 0xF34E] = 0xF300 ^ 0xF34E;
        b_0.H[0x10240 ^ 0x10363] = 0x1CFA2 ^ 0x10363;
        b_0.H[0x1530 ^ 0x1404] = 0x4A93 ^ 0x1404;
        b_0.H[0x5B70 ^ 0x5B35] = 0xFFFFA4BB ^ 0x5B35;
        b_0.H[0xDAC9 ^ 0xDBE2] = 0x895D ^ 0xDBE2;
        b_0.H[0x5173 ^ 0x51D1] = 0xFFFFAEFB ^ 0x51D1;
        b_0.H[0xD96E ^ 0xD848] = 0x1487 ^ 0xD848;
        b_0.H[0x3316 ^ 0x322D] = 0x2454 ^ 0x322D;
        b_0.H[0xAD59 ^ 0xADE5] = 0xA851 ^ 0xADE5;
        b_0.H[0x7E5B ^ 0x7F62] = 0xFFFFBC8A ^ 0x7F62;
        b_0.H[0x6806 ^ 0x6915] = 0xA29 ^ 0x6915;
        b_0.H[0xD16A ^ 0xD119] = 0xD123 ^ 0xD119;
        b_0.H[0x84BC ^ 0x844F] = 0x844C ^ 0x844F;
        b_0.H[0x5A70 ^ 0x5ADE] = 0x5ADE ^ 0x5ADE;
        b_0.H[0xC4F5 ^ 0xC42C] = 0xC43B ^ 0xC42C;
        b_0.H[0xAE66 ^ 0xAE36] = 0xAE39 ^ 0xAE36;
        b_0.H[0x94AF ^ 0x94E2] = 0x9485 ^ 0x94E2;
        b_0.H[0x779E ^ 0x7753] = 0x7743 ^ 0x7753;
        b_0.H[0x611 ^ 0x616] = 0x612 ^ 0x616;
        b_0.H[0x78D7 ^ 0x79DA] = 0x79DA ^ 0x79DA;
        b_0.H[0x6F19 ^ 0x6F35] = 0xFFFF90C7 ^ 0x6F35;
        b_0.H[0x8B71 ^ 0x8BE9] = 0xFFFF745F ^ 0x8BE9;
        b_0.H[0xCF9C ^ 0xCF89] = 0xCF12 ^ 0xCF89;
        b_0.H[0xD47E ^ 0xD5FD] = 0x957D ^ 0xD5FD;
        b_0.H[0x1228 ^ 0x136F] = 0xE829 ^ 0x136F;
        b_0.H[0x37B3 ^ 0x3746] = 0x372F ^ 0x3746;
        b_0.H[0x17E8 ^ 0x178F] = 0x17F8 ^ 0x178F;
        b_0.H[0x7E00 ^ 0x7EBA] = 0xFE48 ^ 0x7EBA;
        b_0.H[0x2E01 ^ 0x2E34] = 0xFFFFD1E6 ^ 0x2E34;
        b_0.H[0x78C8 ^ 0x79EC] = 0xB523 ^ 0x79EC;
        b_0.H[0x18B5 ^ 0x193E] = 0xAD3B ^ 0x193E;
        b_0.H[0x12E5 ^ 0x1248] = 0x124B ^ 0x1248;
        b_0.H[0xC02C ^ 0xC11B] = 0xFD45 ^ 0xC11B;
        b_0.H[0xEE5D ^ 0xEE4D] = 0xEE19 ^ 0xEE4D;
        b_0.H[0x10E4A ^ 0x10EFC] = 0x11717 ^ 0x10EFC;
        b_0.H[0xD544 ^ 0xD439] = 0x70BB ^ 0xD439;
        b_0.H[0xA170 ^ 0xA026] = 0xAEEA ^ 0xA026;
        b_0.H[0x9218 ^ 0x92BD] = 0xFFFF6D63 ^ 0x92BD;
        b_0.H[0x5E98 ^ 0x5E01] = 0x5EDE ^ 0x5E01;
        b_0.H[0x8A80 ^ 0x8AD3] = 0xFFFF7515 ^ 0x8AD3;
        b_0.H[0x6AB6 ^ 0x6ACD] = 0xFFFF95BD ^ 0x6ACD;
        b_0.H[0xEDDE ^ 0xEC5F] = 0x866D ^ 0xEC5F;
        b_0.H[0xEE7C ^ 0xEEF6] = 0xEE82 ^ 0xEEF6;
        b_0.H[0x1B61 ^ 0x1B84] = 0x1BA5 ^ 0x1B84;
        b_0.H[0x6B9F ^ 0x6AC4] = 0x16BB1 ^ 0x6AC4;
        b_0.H[0x3EAF ^ 0x3E3F] = 0x3EBA ^ 0x3E3F;
        b_0.H[0x2C92 ^ 0x2DA1] = 0x733A ^ 0x2DA1;
        b_0.H[0xEF15 ^ 0xEF11] = 0xEF25 ^ 0xEF11;
        b_0.H[0xE60F ^ 0xE771] = 0x8D48 ^ 0xE771;
        b_0.H[0x55D8 ^ 0x54F1] = 0xA9A6 ^ 0x54F1;
        b_0.H[0x244C ^ 0x249E] = 0x24EB ^ 0x249E;
        b_0.H[0xBBA ^ 0xBEF] = 0xFFFFF461 ^ 0xBEF;
        b_0.H[0xF364 ^ 0xF30D] = 0xFFFF0CBE ^ 0xF30D;
        b_0.H[0x5FD5 ^ 0x5EE7] = 0xC214 ^ 0x5EE7;
        b_0.H[0xFC28 ^ 0xFDA0] = 0xFFFF0C35 ^ 0xFDA0;
        b_0.H[0xC606 ^ 0xC6CD] = 0xFFFF3941 ^ 0xC6CD;
        b_0.H[0xE0EF ^ 0xE03B] = 0xE00F ^ 0xE03B;
        b_0.H[0x3131 ^ 0x300C] = 0xFFFFD9A5 ^ 0x300C;
        b_0.H[0x468F ^ 0x4698] = 0x46D5 ^ 0x4698;
        b_0.H[0xE287 ^ 0xE24E] = 0xE2BB ^ 0xE24E;
        b_0.H[0xCD45 ^ 0xCC4B] = 0xCC4A ^ 0xCC4B;
        b_0.H[0x298D ^ 0x296C] = 0x2932 ^ 0x296C;
        b_0.H[0x98B6 ^ 0x9882] = 0xFFFF6767 ^ 0x9882;
        b_0.H[0xC7A7 ^ 0xC781] = 0xC7F4 ^ 0xC781;
        b_0.H[0x8B37 ^ 0x8A57] = 0xFFFF0C26 ^ 0x8A57;
        b_0.H[0xB5 ^ 0x1CA] = 0x6BF8 ^ 0x1CA;
        b_0.H[0x116A ^ 0x1123] = 0x1101 ^ 0x1123;
        b_0.H[0xC9D4 ^ 0xC969] = 0x183F ^ 0xC969;
        b_0.H[0x1A7D ^ 0x1B29] = 0x97E1 ^ 0x1B29;
        b_0.H[0x14A6 ^ 0x1405] = 0xFFFFEB9A ^ 0x1405;
        b_0.H[0x1307 ^ 0x1204] = 0xFFFFEDFD ^ 0x1204;
        b_0.H[0xEA60 ^ 0xEB02] = 0x6192 ^ 0xEB02;
        b_0.H[0x9569 ^ 0x95B7] = 0xFFFF6A5E ^ 0x95B7;
        b_0.H[0xB7D3 ^ 0xB6D1] = 0xB6FB ^ 0xB6D1;
        b_0.H[0x1086D ^ 0x108E6] = 0x1088E ^ 0x108E6;
        b_0.H[0xE605 ^ 0xE71C] = 0xFFFF2ADD ^ 0xE71C;
        b_0.H[0xA57A ^ 0xA442] = 0x9817 ^ 0xA442;
        b_0.H[0x414 ^ 0x487] = 0xFFFFFB7A ^ 0x487;
        b_0.H[0x4639 ^ 0x46D6] = 0x46BF ^ 0x46D6;
        b_0.H[0x1225 ^ 0x1323] = 0xFFFFEC8C ^ 0x1323;
        b_0.H[0x1948 ^ 0x18C8] = 0x72E6 ^ 0x18C8;
        b_0.H[0xA697 ^ 0xA7F2] = 0x2D6E ^ 0xA7F2;
        b_0.H[0x41A ^ 0x505] = 0xABBD ^ 0x505;
        b_0.H[0xB575 ^ 0xB593] = 0xFFFF4A41 ^ 0xB593;
        b_0.H[0x535B ^ 0x527E] = 0xFFFF6113 ^ 0x527E;
        b_0.H[0xCDDE ^ 0xCCC4] = 0xFE8F ^ 0xCCC4;
        b_0.H[0xC072 ^ 0xC120] = 0x1627 ^ 0xC120;
        b_0.H[0x4D2F ^ 0x4C1F] = 0xD0EC ^ 0x4C1F;
        b_0.H[0x2BA7 ^ 0x2BF0] = 0xFFFFD40A ^ 0x2BF0;
        b_0.H[0xE670 ^ 0xE61B] = 0xFFFF19BB ^ 0xE61B;
        b_0.H[0x2D05 ^ 0x2C4A] = 0xFB4C ^ 0x2C4A;
        b_0.H[0x68C2 ^ 0x687B] = 0xE5A9 ^ 0x687B;
        b_0.H[0xAB51 ^ 0xAB8B] = 0xFFFF544B ^ 0xAB8B;
        b_0.H[0x585E ^ 0x5915] = 0x7A84 ^ 0x5915;
        b_0.H[0x8BEE ^ 0x8AA7] = 0xFFFF8E49 ^ 0x8AA7;
        b_0.H[0xF303 ^ 0xF308] = 0xFFFF0CF9 ^ 0xF308;
        b_0.H[0xD8C8 ^ 0xD8F7] = 0xFFFF2767 ^ 0xD8F7;
        b_0.H[0x4B07 ^ 0x4BE7] = 0xFFFFB471 ^ 0x4BE7;
        b_0.H[0x1B9F ^ 0x1B13] = 0x1B2F ^ 0x1B13;
        b_0.H[0x7BA0 ^ 0x7B8E] = 0xFFFF8478 ^ 0x7B8E;
        b_0.H[0x70E3 ^ 0x70E6] = 0xFFFF8F11 ^ 0x70E6;
        b_0.H[0x6F0C ^ 0x6F92] = 0x6FCE ^ 0x6F92;
        b_0.H[0x507C ^ 0x5005] = 0xFFFFAFEA ^ 0x5005;
        b_0.H[0xE8B5 ^ 0xE8FB] = 0xFFFF171D ^ 0xE8FB;
        b_0.H[0x482C ^ 0x481B] = 0x4833 ^ 0x481B;
        b_0.H[0xF21E ^ 0xF2E1] = 0xFFFF0D05 ^ 0xF2E1;
        b_0.H[0x1C6E ^ 0x1D72] = 0xD466 ^ 0x1D72;
        b_0.H[0x3AB3 ^ 0x3A31] = 0x3A40 ^ 0x3A31;
        b_0.H[0xF120 ^ 0xF116] = 0xF15D ^ 0xF116;
        b_0.H[0x3CC4 ^ 0x3C56] = 0xFFFFC390 ^ 0x3C56;
        b_0.H[0x33DC ^ 0x331D] = 0x47C2 ^ 0x331D;
        b_0.H[0x167D ^ 0x16B8] = 0x168C ^ 0x16B8;
        b_0.H[0xF631 ^ 0xF6E6] = 0xF6BC ^ 0xF6E6;
        b_0.H[0x4973 ^ 0x4968] = 0xFFFFB68E ^ 0x4968;
        b_0.H[0xB122 ^ 0xB026] = 0xB00F ^ 0xB026;
        b_0.H[0x1C7D ^ 0x1C62] = 0x1C22 ^ 0x1C62;
        b_0.H[0x1EF6 ^ 0x1FD8] = 0x4D62 ^ 0x1FD8;
        b_0.H[0x1F3E ^ 0x1FDC] = 0xFFFFE010 ^ 0x1FDC;
        b_0.H[0x1080 ^ 0x104F] = 0xFFFFEFDD ^ 0x104F;
        b_0.H[0x3CCA ^ 0x3CC9] = 0xFFFFC31F ^ 0x3CC9;
        b_0.H[0xDDE0 ^ 0xDCAD] = 0xFF5C ^ 0xDCAD;
        b_0.H[0x7B1 ^ 0x7D5] = 0x7C1 ^ 0x7D5;
        b_0.H[0xE121 ^ 0xE04A] = 0x2153 ^ 0xE04A;
        b_0.H[0x6F37 ^ 0x6F74] = 0x6F40 ^ 0x6F74;
        b_0.H[0x9D0A ^ 0x9C2B] = 0x32DF ^ 0x9C2B;
        b_0.H[0x67E3 ^ 0x670E] = 0xFFFF9860 ^ 0x670E;
        b_0.H[0x8F8C ^ 0x8FD7] = 0xFFFF705B ^ 0x8FD7;
        b_0.H[0xA0AF ^ 0xA01A] = 0x7A72 ^ 0xA01A;
        b_0.H[0x2D38 ^ 0x2D57] = 0xFFFFD264 ^ 0x2D57;
        b_0.H[0xB4FA ^ 0xB45B] = 0xB41D ^ 0xB45B;
        b_0.H[0x16E2 ^ 0x16CB] = 0xFFFFE90D ^ 0x16CB;
        b_0.H[0xC066 ^ 0xC094] = 0xFFFF3F44 ^ 0xC094;
        b_0.H[0xC31F ^ 0xC257] = 0x3915 ^ 0xC257;
        b_0.H[0x17D2 ^ 0x1722] = 0xFFFFE8AF ^ 0x1722;
        b_0.H[0xB0CE ^ 0xB1D0] = 0x78C4 ^ 0xB1D0;
        b_0.H[0xD938 ^ 0xD8BE] = 0xD6B4 ^ 0xD8BE;
        b_0.H[0x2945 ^ 0x291B] = 0xFFFFD6F6 ^ 0x291B;
        b_0.H[0xE59D ^ 0xE597] = 0xE5DC ^ 0xE597;
        b_0.H[0x395A ^ 0x39CF] = 0xFFFFC648 ^ 0x39CF;
        b_0.H[0x94B3 ^ 0x953A] = 0x9B3F ^ 0x953A;
        b_0.H[0xFC3F ^ 0xFD60] = 0x84BC ^ 0xFD60;
        b_0.H[0x264 ^ 0x228] = 0xFFFFFDB1 ^ 0x228;
        b_0.H[0x55E7 ^ 0x5578] = 0x552A ^ 0x5578;
        b_0.H[0x7054 ^ 0x7121] = 0xE7AD ^ 0x7121;
        b_0.H[0x911C ^ 0x91F8] = 0xFFFF6E2B ^ 0x91F8;
        b_0.H[0x5AF0 ^ 0x5A58] = 0xFFFFA5E5 ^ 0x5A58;
        b_0.H[0x8163 ^ 0x811E] = 0xFFFF7EBE ^ 0x811E;
        b_0.H[0x10200 ^ 0x10358] = 0x10DA4 ^ 0x10358;
        b_0.H[0x4376 ^ 0x43E2] = 0x4397 ^ 0x43E2;
        b_0.H[0xAEF1 ^ 0xAE0D] = 0xAE64 ^ 0xAE0D;
        b_0.H[0x1429 ^ 0x153E] = 0x2775 ^ 0x153E;
        b_0.H[0x54CE ^ 0x5592] = 0x154FB ^ 0x5592;
        b_0.H[0x10065 ^ 0x100C1] = 0xFFFEFF4A ^ 0x100C1;
        b_0.H[0x84E2 ^ 0x85EB] = 0xFFFF7A37 ^ 0x85EB;
        b_0.H[0xDE57 ^ 0xDEF7] = 0xDEE3 ^ 0xDEF7;
        b_0.H[0x1751 ^ 0x167B] = 0xEB04 ^ 0x167B;
        b_0.H[0x497E ^ 0x4819] = 0xFB65 ^ 0x4819;
        b_0.H[0x1DB5 ^ 0x1DD7] = 0xFFFFE217 ^ 0x1DD7;
        b_0.H[0xC4DC ^ 0xC4E2] = 0xC4D5 ^ 0xC4E2;
        b_0.H[0x7CF3 ^ 0x7C93] = 0x7C86 ^ 0x7C93;
        b_0.H[0x6C39 ^ 0x6C8D] = 0x6DD5 ^ 0x6C8D;
        b_0.H[0x3682 ^ 0x37C3] = 0xFFFF4131 ^ 0x37C3;
        b_0.H[0x5F36 ^ 0x5F0B] = 0x5F1B ^ 0x5F0B;
        b_0.H[0x2EC1 ^ 0x2EDF] = 0x2EEB ^ 0x2EDF;
        b_0.H[0x38B ^ 0x2B5] = 0x14CB ^ 0x2B5;
        b_0.H[0x63D6 ^ 0x63EA] = 0x63ED ^ 0x63EA;
        b_0.H[0x4B92 ^ 0x4B5C] = 0xFFFFB4CE ^ 0x4B5C;
        b_0.H[0x8573 ^ 0x8402] = 0x92CE ^ 0x8402;
        b_0.H[0xA7E ^ 0xAF7] = 0xABA ^ 0xAF7;
        b_0.H[0xE8F8 ^ 0xE9BC] = 0x689E ^ 0xE9BC;
        b_0.H[0x81BE ^ 0x81B7] = 0xFFFF7E73 ^ 0x81B7;
        b_0.H[0xF2A6 ^ 0xF2BB] = 0xF2A6 ^ 0xF2BB;
        b_0.H[0x8235 ^ 0x8214] = 0x8222 ^ 0x8214;
        b_0.H[0xC8F2 ^ 0xC80A] = 0xFFFF37B3 ^ 0xC80A;
        b_0.H[0xDAAF ^ 0xDBED] = 0x52F6 ^ 0xDBED;
        b_0.H[0xB1A5 ^ 0xB158] = 0xB14A ^ 0xB158;
        b_0.H[0xB5CF ^ 0xB589] = 0xB5BC ^ 0xB589;
        b_0.H[0xAAB6 ^ 0xAA6D] = 0xFFFF55C8 ^ 0xAA6D;
        b_0.H[0x75EF ^ 0x752D] = 0x752D ^ 0x752D;
        b_0.H[0x10293 ^ 0x103F5] = 0x1B084 ^ 0x103F5;
        b_0.H[0xB540 ^ 0xB455] = 0xD76C ^ 0xB455;
        b_0.H[0xDEB ^ 0xC91] = 0xA80D ^ 0xC91;
        b_0.H[0xFF66 ^ 0xFF66] = 0xFF52 ^ 0xFF66;
        b_0.H[0xA809 ^ 0xA954] = 0x1A821 ^ 0xA954;
        b_0.H[0xC2F9 ^ 0xC265] = 0xFFFF3DF2 ^ 0xC265;
        b_0.H[0x104F7 ^ 0x1047F] = 0x10434 ^ 0x1047F;
        b_0.H[0xD6E3 ^ 0xD6F1] = 0xFFFF290D ^ 0xD6F1;
        b_0.H[0x8C7D ^ 0x8C08] = 0x8C0A ^ 0x8C08;
        b_0.H[0x3768 ^ 0x3717] = 0xFFFFC8F1 ^ 0x3717;
        b_0.H[0x43A0 ^ 0x4359] = 0x431F ^ 0x4359;
        b_0.H[0x65B ^ 0x60F] = 0x639 ^ 0x60F;
        b_0.H[0x10C21 ^ 0x10C4C] = 0x10C44 ^ 0x10C4C;
        b_0.H[0x9C0B ^ 0x9C90] = 0x9CF9 ^ 0x9C90;
        b_0.H[0x601B ^ 0x607A] = 0xFFFF9FA9 ^ 0x607A;
        b_0.H[0xA13F ^ 0xA18D] = 0xA18D ^ 0xA18D;
        b_0.H[0x51EE ^ 0x509E] = 0x466B ^ 0x509E;
        b_0.H[0x4241 ^ 0x4237] = 0x427C ^ 0x4237;
        b_0.H[0x10098 ^ 0x100D0] = 0x10097 ^ 0x100D0;
        b_0.H[0xFA16 ^ 0xFB92] = 0xBB30 ^ 0xFB92;
        b_0.H[0x987B ^ 0x9841] = 0x9857 ^ 0x9841;
        b_0.H[0x37DA ^ 0x3762] = 0xD40D ^ 0x3762;
        b_0.H[0xC0E9 ^ 0xC1F2] = 0x8EC ^ 0xC1F2;
        b_0.H[0x1F97 ^ 0x1F4A] = 0x1F06 ^ 0x1F4A;
        b_0.H[0xB99E ^ 0xB89E] = 0xFFFF4731 ^ 0xB89E;
        b_0.H[0xF391 ^ 0xF3FF] = 0xFFFF0C4E ^ 0xF3FF;
        b_0.H[0xFBDE ^ 0xFAA7] = 0x6AAC ^ 0xFAA7;
        b_0.H[0x81D6 ^ 0x81F3] = 0xFFFF7E69 ^ 0x81F3;
        b_0.H[0xF3EF ^ 0xF2C3] = 0xA079 ^ 0xF2C3;
        b_0.H[0xE8DB ^ 0xE9DE] = 0xE9CA ^ 0xE9DE;
        b_0.H[0x9B29 ^ 0x9A52] = 0x3ED0 ^ 0x9A52;
        b_0.H[0x7100 ^ 0x7072] = 0xE6EC ^ 0x7072;
        b_0.H[0xC40C ^ 0xC43D] = 0xFFFF3BF6 ^ 0xC43D;
        b_0.H[0x8868 ^ 0x889C] = 0xFFFF7726 ^ 0x889C;
        b_0.H[0x9C79 ^ 0x9C88] = 0x9CEB ^ 0x9C88;
        b_0.H[0xB541 ^ 0xB5BA] = 0xFFFF4A03 ^ 0xB5BA;
        b_0.H[0x35F ^ 0x22C] = 0x94A0 ^ 0x22C;
        b_0.H[0x3D37 ^ 0x3C7B] = 0x1FE7 ^ 0x3C7B;
        b_0.H[0xE64A ^ 0xE63B] = 0xFFFF19BD ^ 0xE63B;
        b_0.H[0x10F6C ^ 0x10E36] = 0xF52 ^ 0x10E36;
        b_0.H[0x103BB ^ 0x10304] = 0x1787F ^ 0x10304;
        b_0.H[0x6CD2 ^ 0x6DD5] = 0xFFFF9269 ^ 0x6DD5;
        b_0.H[0x5F6C ^ 0x5EEE] = 0x1E78 ^ 0x5EEE;
        b_0.H[0x2D26 ^ 0x2DC1] = 0xFFFFD26C ^ 0x2DC1;
        b_0.H[0x8914 ^ 0x8899] = 0x3C9C ^ 0x8899;
        b_0.H[0x102D6 ^ 0x102EF] = 0xFFFEFD57 ^ 0x102EF;
        b_0.H[0x193B ^ 0x1919] = 0x191E ^ 0x1919;
        b_0.H[0xFA3B ^ 0xFA85] = 0xDADD ^ 0xFA85;
        b_0.H[0x78F7 ^ 0x78E4] = 0x78C1 ^ 0x78E4;
        b_0.H[0x713 ^ 0x715] = 0xFFFFF8C8 ^ 0x715;
        b_0.H[0x2162 ^ 0x2133] = 0x2168 ^ 0x2133;
        b_0.H[0xE62D ^ 0xE6F5] = 0xE6BC ^ 0xE6F5;
        b_0.H[0x2E32 ^ 0x2E1D] = 0x2E43 ^ 0x2E1D;
        b_0.H[0xFF99 ^ 0xFF19] = 0xFF02 ^ 0xFF19;
        b_0.H[0xEEED ^ 0xEE8E] = 0xEEBD ^ 0xEE8E;
        b_0.H[0x8BFE ^ 0x8B09] = 0x8B4D ^ 0x8B09;
        b_0.H[0x5A49 ^ 0x5B5B] = 0xBFFF ^ 0x5B5B;
        b_0.H[0xB347 ^ 0xB3A4] = 0xB3BE ^ 0xB3A4;
        b_0.H[0x4A3D ^ 0x4B5E] = 0xC1C2 ^ 0x4B5E;
        b_0.H[0xED03 ^ 0xED19] = 0xED39 ^ 0xED19;
        b_0.H[0x809E ^ 0x81CD] = 0x81CD ^ 0x81CD;
        b_0.H[0x1063C ^ 0x10618] = 0xFFFEF9F7 ^ 0x10618;
        b_0.H[0xB6B6 ^ 0xB7BE] = 0xFFFF48C7 ^ 0xB7BE;
        b_0.H[0x957E ^ 0x941A] = 0xFFFFE10A ^ 0x941A;
        b_0.H[0xDDAF ^ 0xDD8F] = 0xFFFF2202 ^ 0xDD8F;
        b_0.H[0xBBD0 ^ 0xBA57] = 0xB452 ^ 0xBA57;
        b_0.H[0x1065F ^ 0x10657] = 0x10671 ^ 0x10657;
        b_0.H[0x4593 ^ 0x44FA] = 0xF786 ^ 0x44FA;
        b_0.H[0x2A52 ^ 0x2B6D] = 0xA270 ^ 0x2B6D;
        b_0.H[0x4672 ^ 0x467D] = 0xFFFFB9A0 ^ 0x467D;
        b_0.H[0x5676 ^ 0x5674] = 0x5618 ^ 0x5674;
        b_0.H[0x1641 ^ 0x16F0] = 0x16F2 ^ 0x16F0;
        b_0.H[0x5BD8 ^ 0x5B6F] = 0x7484 ^ 0x5B6F;
        b_0.H[0x2988 ^ 0x28DD] = 0xA435 ^ 0x28DD;
        b_0.H[0x567 ^ 0x526] = 0xFFFFFA80 ^ 0x526;
        b_0.H[0x1AB7 ^ 0x1AC0] = 0x1AED ^ 0x1AC0;
        b_0.H[0x5968 ^ 0x59EE] = 0xFFFFA608 ^ 0x59EE;
        b_0.H[0xC290 ^ 0xC2AB] = 0xFFFF3D0A ^ 0xC2AB;
        b_0.H[0xD0FF ^ 0xD1DF] = 0x7F65 ^ 0xD1DF;
        b_0.H[0x8CC5 ^ 0x8C14] = 0xFFFF73A4 ^ 0x8C14;
        b_0.H[0xA9 ^ 0x47] = 0xE ^ 0x47;
        b_0.H[0x6DFA ^ 0x6D2F] = 0x6D09 ^ 0x6D2F;
        b_0.H[0x79AE ^ 0x78BF] = 0x9C0B ^ 0x78BF;
        b_0.H[0x3724 ^ 0x3625] = 0xFFFFC9C6 ^ 0x3625;
        b_0.H[0x7EDA ^ 0x7FC2] = 0x4D89 ^ 0x7FC2;
        b_0.H[0x89C3 ^ 0x8981] = 0xFFFF7635 ^ 0x8981;
        b_0.H[0xB7B1 ^ 0xB75A] = 0xFFFF4881 ^ 0xB75A;
        b_0.H[0x38EC ^ 0x39D9] = 0xFFFF98C9 ^ 0x39D9;
        b_0.H[0x24E8 ^ 0x25CA] = 0x8B70 ^ 0x25CA;
        b_0.H[0x1C57 ^ 0x1CAD] = 0xFFFFE332 ^ 0x1CAD;
        b_0.H[0x3BC1 ^ 0x3B1E] = 0x3B2D ^ 0x3B1E;
        b_0.H[0xC4A7 ^ 0xC420] = 0xC43D ^ 0xC420;
        b_0.H[0x8F62 ^ 0x8F7E] = 0xFFFF709D ^ 0x8F7E;
        b_0.H[0x7421 ^ 0x74A2] = 0xFFFF8B66 ^ 0x74A2;
        b_0.H[0xF6C ^ 0xFD7] = 0x8F44 ^ 0xFD7;
        b_0.H[0x2686 ^ 0x27EE] = 0xFFFF6B41 ^ 0x27EE;
        b_0.H[0xC618 ^ 0xC777] = 0xD1BB ^ 0xC777;
        b_0.H[0x8830 ^ 0x88FA] = 0xFFFF7765 ^ 0x88FA;
        b_0.H[0x1A19 ^ 0x1AF5] = 0x1ACA ^ 0x1AF5;
        b_0.H[0xC614 ^ 0xC704] = 0xC704 ^ 0xC704;
        b_0.H[0x14F4 ^ 0x1430] = 0xFFFFEB8C ^ 0x1430;
        b_0.H[0xA9FE ^ 0xA968] = 0xA9D4 ^ 0xA968;
        b_0.H[0x86B3 ^ 0x86F3] = 0x86E5 ^ 0x86F3;
        b_0.H[0xFF34 ^ 0xFF22] = 0xFFFF0099 ^ 0xFF22;
        b_0.H[0x261 ^ 0x2A7] = 0x220 ^ 0x2A7;
        b_0.H[0x3D2 ^ 0x311] = 0x349 ^ 0x311;
        b_0.H[0xBEEB ^ 0xBE83] = 0xBE98 ^ 0xBE83;
        b_0.H[0x7E72 ^ 0x7E24] = 0xFFFF819D ^ 0x7E24;
        b_0.H[0xCCFB ^ 0xCC97] = 0xFFFF331E ^ 0xCC97;
        b_0.H[0x49D8 ^ 0x49FF] = 0xFFFFB66D ^ 0x49FF;
        b_0.H[0x7E16 ^ 0x7E3B] = 0x7E4F ^ 0x7E3B;
        b_0.H[0x2D21 ^ 0x2D8E] = 0x2D8F ^ 0x2D8E;
        b_0.H[0xA6FE ^ 0xA77B] = 0xE7FB ^ 0xA77B;
        b_0.H[0x64FE ^ 0x6480] = 0xFFFF9B4B ^ 0x6480;
        b_0.H[0xDBA7 ^ 0xDB59] = 0xFFFF24DE ^ 0xDB59;
        b_0.H[0x6EE0 ^ 0x6EAB] = 0x6EA8 ^ 0x6EAB;
        b_0.H[0x36F2 ^ 0x37E6] = 0x54D5 ^ 0x37E6;
        b_0.H[0x9954 ^ 0x9987] = 0xFFFF6658 ^ 0x9987;
        b_0.H[0xD71B ^ 0xD614] = 0xD615 ^ 0xD614;
        b_0.H[0xF953 ^ 0xF86F] = 0xEE11 ^ 0xF86F;
        b_0.H[0x6A39 ^ 0x6B4E] = 0xFB45 ^ 0x6B4E;
        b_0.H[0xCAA3 ^ 0xCA55] = 0xCAFE ^ 0xCA55;
        b_0.H[0x1085A ^ 0x108F3] = 0x108CF ^ 0x108F3;
        b_0.H[0x79FA ^ 0x7894] = 0x6E43 ^ 0x7894;
        b_0.H[0xCB4 ^ 0xC31] = 0xFFFFF39E ^ 0xC31;
        b_0.H[0x7AF2 ^ 0x7AA8] = 0x7A33 ^ 0x7AA8;
        b_0.H[0x57E ^ 0x546] = 0x519 ^ 0x546;
        b_0.H[0xB9F6 ^ 0xB97B] = 0xB9A0 ^ 0xB97B;
        b_0.H[0xEFCD ^ 0xEFD9] = 0xEFF3 ^ 0xEFD9;
        b_0.H[0xCBB9 ^ 0xCB79] = 0x865 ^ 0xCB79;
        b_0.H[0x8D1B ^ 0x8C7A] = 0xF5A6 ^ 0x8C7A;
        b_0.H[0xB90E ^ 0xB863] = 0x797A ^ 0xB863;
        b_0.H[0xC0F6 ^ 0xC1FC] = 0xC199 ^ 0xC1FC;
        b_0.H[0x8816 ^ 0x894F] = 0x8789 ^ 0x894F;
        b_0.H[0xD727 ^ 0xD61D] = 0xEA48 ^ 0xD61D;
        b_0.H[0xE9D9 ^ 0xE993] = 0xE9D6 ^ 0xE993;
        b_0.H[0xDE9A ^ 0xDE07] = 0xDE33 ^ 0xDE07;
    }
}

