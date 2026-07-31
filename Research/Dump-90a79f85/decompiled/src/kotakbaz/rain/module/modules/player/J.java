/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1306
 *  net.minecraft.class_304
 *  net.minecraft.class_7172
 *  org.lwjgl.glfw.GLFW
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
import kotakbaz.rain.event.events.G;
import kotakbaz.rain.event.events.d_0;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.setting.settings.b_0;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1306;
import net.minecraft.class_304;
import net.minecraft.class_7172;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0003J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010\u00a2\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001e\u0010\u0003R\u0014\u0010\u001f\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u0010/\u00a8\u00061"}, d2={"Lkotakbaz/rain/module/modules/player/ChangeHandModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/KeyEvent;", "event", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "Lkotakbaz/rain/event/events/AttackEvent;", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "", "button", "", "isMouse", "isRelease", "handleKeyMode", "(IZZ)V", "handleAttackMode", "changeMainArm", "matchesAttackKey", "(IZ)Z", "toIncomingCode", "(IZ)I", "canProcessInput", "()Z", "shouldKeepLeftOffhandSlotInHud", "resetInputState", "INPUT_MOUSE_OFFSET", "I", "", "MODE_BY_KEY", "Ljava/lang/String;", "MODE_ON_ATTACK", "Lkotakbaz/rain/module/setting/ModeSetting;", "changeMode", "Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "changeHandKey", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "onlyOnHit", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "keyModePressed", "Z", "attackModePressed", "rain-visuals"})
public final class J
extends a_0 {
    @NotNull
    public static final J INSTANCE;
    private static final int a = 400;
    @NotNull
    private static final String A = "\u041f\u043e \u043a\u043d\u043e\u043f\u043a\u0435";
    @NotNull
    private static final String b = "\u041f\u0440\u0438 \u0443\u0434\u0430\u0440\u0435";
    @NotNull
    private static final kotakbaz.rain.module.setting.c B;
    @NotNull
    private static final b_0 c;
    @NotNull
    private static final c C;
    private static boolean d;
    private static boolean D;
    private static Object[] e;
    private static Object f;
    private static Object[] F;
    private static Object[] E;
    private static Object[] g;
    public static int[] G;

    private J() {
        int n = G[0];
        n += G[1];
        int n2 = G[3];
        n2 -= G[4];
        int n3 = G[6];
        n3 -= G[7];
        super((String)e[n -= G[2]], kotakbaz.rain.client.extensions.a_0.getPLAYER(), (String)e[n2 ^= G[5]] + (String)e[n3 += G[8]]);
    }

    @Override
    public void onEnable() {
        this.resetInputState();
    }

    @Override
    public void onDisable() {
        this.resetInputState();
    }

    @Commando
    public final void onKey(@NotNull G g2) {
        long l = 4716878243679728593L;
        long l2 = -4396706697376897841L;
        long l3 = 5373630797680083020L;
        long l4 = 1769337568213386852L;
        long l5 = -7334794456425531546L;
        int n = G[9];
        n += G[10];
        Intrinsics.checkNotNullParameter(g2, (String)e[n += G[11]]);
        Integer n2 = g2.get(kotakbaz.rain.event.events.G.a.getBUTTON());
        if (n2 == null) {
            return;
        }
        int n3 = G[12];
        n3 ^= G[13];
        long l6 = l4;
        int n4 = G[15];
        n4 ^= G[16];
        l4 = l6 ^ ((long)n2.intValue() << (n3 ^= G[14]) ^ l6) & -1L << (n4 += G[17]);
        boolean bl = G[18];
        bl -= G[19];
        long l7 = l4;
        int n5 = G[21];
        n5 ^= G[22];
        l4 = l7 ^ ((long)Intrinsics.areEqual(g2.get(kotakbaz.rain.event.events.G.a.getMOUSE()), bl ^= G[20]) ^ l7) & -1L >>> (n5 -= G[23]);
        boolean bl2 = G[24];
        bl2 -= G[25];
        bl2 ^= G[26];
        int n6 = G[27];
        n6 += G[28];
        long l8 = l5;
        int n7 = G[30];
        n7 += G[31];
        l5 = l8 ^ ((long)Intrinsics.areEqual(g2.get(kotakbaz.rain.event.events.G.a.getRELEASE()), bl2) << (n6 ^= G[29]) ^ l8) & -1L << (n7 -= G[32]);
        if (!this.canProcessInput()) {
            return;
        }
        String string = (String)B.getValue();
        int n8 = G[33];
        n8 += G[34];
        if (Intrinsics.areEqual(string, (String)e[n8 -= G[35]])) {
            int n9 = G[36];
            n9 ^= G[37];
            int n10 = G[39];
            n10 += G[40];
            this.handleKeyMode((int)(l4 >>> (n9 += G[38])), (boolean)l4, (boolean)(l5 >>> (n10 -= G[41])));
        } else {
            int n11 = G[42];
            n11 += G[43];
            if (Intrinsics.areEqual(string, (String)e[n11 -= G[44]]) && !((Boolean)C.getValue()).booleanValue()) {
                int n12 = G[45];
                n12 += G[46];
                int n13 = G[48];
                n13 -= G[49];
                this.handleAttackMode((int)(l4 >>> (n12 -= G[47])), (boolean)l4, (boolean)(l5 >>> (n13 -= G[50])));
            }
        }
    }

    @Commando
    public final void onAttack(@NotNull d_0 d_02) {
        int n = G[51];
        n -= G[52];
        Intrinsics.checkNotNullParameter(d_02, (String)e[n ^= G[53]]);
        int n2 = G[54];
        n2 += G[55];
        if (!Intrinsics.areEqual(B.getValue(), (String)e[n2 -= G[56]]) || !((Boolean)C.getValue()).booleanValue()) {
            return;
        }
        if (!this.canProcessInput()) {
            return;
        }
        this.changeMainArm();
    }

    private final void handleKeyMode(int n, boolean bl, boolean bl2) {
        block6: {
            block5: {
                long l = -4501620816285122539L;
                int n2 = G[57];
                n2 += G[58];
                long l2 = l;
                int n3 = G[60];
                n3 ^= G[61];
                l = l2 ^ ((long)this.toIncomingCode(n, bl) << (n2 ^= G[59]) ^ l2) & -1L << (n3 += G[62]);
                int n4 = G[63];
                n4 ^= G[64];
                if (((Number)c.getValue()).intValue() == (n4 -= G[65])) break block5;
                int n5 = G[66];
                n5 -= G[67];
                if ((int)(l >>> (n5 ^= G[68])) == ((Number)c.getValue()).intValue()) break block6;
            }
            return;
        }
        if (bl2) {
            int n6 = G[69];
            n6 -= G[70];
            d = n6 -= G[71];
            return;
        }
        if (d) {
            return;
        }
        int n7 = G[72];
        n7 ^= G[73];
        d = n7 ^= G[74];
        this.changeMainArm();
    }

    private final void handleAttackMode(int n, boolean bl, boolean bl2) {
        if (!this.matchesAttackKey(n, bl)) {
            return;
        }
        if (bl2) {
            int n2 = G[75];
            n2 -= G[76];
            D = n2 ^= G[77];
            return;
        }
        if (D) {
            return;
        }
        int n3 = G[78];
        n3 -= G[79];
        D = n3 -= G[80];
        this.changeMainArm();
    }

    private final void changeMainArm() {
        class_7172 class_71722 = kotakbaz.rain.client.extensions.b_0.getMc().field_1690.method_42552();
        class_1306 class_13062 = class_71722.method_41753() == class_1306.field_6183 ? class_1306.field_6182 : class_1306.field_6183;
        class_71722.method_41748((Object)class_13062);
        kotakbaz.rain.client.extensions.b_0.getMc().field_1690.method_1640();
    }

    private final boolean matchesAttackKey(int n, boolean bl) {
        class_304 class_3042 = kotakbaz.rain.client.extensions.b_0.getMc().field_1690.field_1886;
        return bl ? class_3042.method_1433(n) : class_3042.method_1417(n, GLFW.glfwGetKeyScancode((int)n));
    }

    private final int toIncomingCode(int n, boolean bl) {
        int n2;
        if (bl) {
            int n3 = G[81];
            n3 += G[82];
            n2 = n + (n3 ^= G[83]);
        } else {
            n2 = n;
        }
        return n2;
    }

    private final boolean canProcessInput() {
        int n;
        if (kotakbaz.rain.client.extensions.b_0.getMc().field_1724 != null && kotakbaz.rain.client.extensions.b_0.getMc().field_1687 != null && kotakbaz.rain.client.extensions.b_0.getMc().field_1755 == null) {
            int n2 = G[84];
            n2 += G[85];
            n = n2 ^= G[86];
        } else {
            int n3 = G[87];
            n3 += G[88];
            n = n3 += G[89];
        }
        return n != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean shouldKeepLeftOffhandSlotInHud() {
        int n;
        if (this.isEnabled()) {
            int n2 = G[90];
            n2 -= G[91];
            if (Intrinsics.areEqual(B.getValue(), (String)e[n2 += G[92]])) {
                int n3 = G[93];
                n3 -= G[94];
                n = n3 += G[95];
                return n != 0;
            }
        }
        int n4 = G[96];
        n4 -= G[97];
        n = n4 += G[98];
        return n != 0;
    }

    private final void resetInputState() {
        int n = G[99];
        n -= G[100];
        d = n ^= G[101];
        int n2 = G[102];
        n2 ^= G[103];
        D = n2 += G[104];
    }

    private static final boolean changeHandKey$lambda$0() {
        int n = G[105];
        n += G[106];
        return Intrinsics.areEqual(B.getValue(), (String)e[n += G[107]]);
    }

    private static final boolean onlyOnHit$lambda$0() {
        int n = G[108];
        n ^= G[109];
        return Intrinsics.areEqual(B.getValue(), (String)e[n -= G[110]]);
    }

    static {
        J.b();
        long l = 7325766140304381647L;
        long l2 = -9090857278061782886L;
        long l3 = 9060208118490931309L;
        long l4 = -7177375584838037453L;
        long l5 = 5263087172565574223L;
        long l6 = 6961015623115942838L;
        long l7 = -7377393933265253926L;
        long l8 = 6049712264896765163L;
        long l9 = -5993598414740261304L;
        long l10 = 5670549835283110935L;
        long l11 = 4897027961086344787L;
        long l12 = 6263362900593755862L;
        long l13 = 706884925212941612L;
        long l14 = 6026084339207100461L;
        int n = G[111];
        n ^= G[112];
        e = new Object[n -= G[113]];
        long l15 = l14;
        int n2 = G[114];
        n2 += G[115];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += G[116]);
        Object[] objectArray = new Object[G[117]];
        objectArray[J.G[118]] = E;
        objectArray[J.G[119]] = G[120];
        int n3 = G[121];
        Object object = J.A()[G[122]];
        if (object == null) {
            char[] cArray = "\u5a24\u5a1e\u5a6d\u5a02\u5a20\u5a66\u5a36\u5a26\u5a19\u5a2e\u5a6b\u5a0c\u5a6d\u5a66\u5a05\u5a38\u5a28\u5a04\u5a09\u5a06\u5a3b\u5a64\u5a2d\u5a24\u5a02\u5a61\u5a3d\u5a25\u5a3b\u5a2c\u5a05\u5a3f\u5a1a\u5a0a\u5a20\u5a37\u5a2d\u5a3a\u5a2d\u5a39\u5a67\u5a1e\u5a06\u5a1c\u5a09\u5a24\u5a29\u5a20\u5a1d\u5a69\u5a6b\u5a1d\u5a0f\u5a36\u5a6c\u5a03\u5a02\u5a2a\u5a26\u5a0b\u5a05\u5a65\u5a0b\u5a39\u5a3f\u5a24\u5a38\u5a39\u5a25\u5a65\u5a09\u5a00\u5a0e\u5a1a\u5a2f\u5a65\u5a3f\u5a3d\u5a0b\u5a2a\u5a3a\u5a1f\u5a2d\u5a2d\u5a0b\u5a0e\u5a01\u5a0c\u5a1f\u5a39\u5a65\u5a19\u5a2b\u5a1b\u5a2b\u5a3c\u5a01\u5a17\u5a2d\u5a64\u5a2f\u5a1d\u5a28\u5a0e\u5a61\u5a07\u5a61\u5a26\u5a17\u5a0b\u5a0c\u5a2a\u5a20\u5a66\u5a1e\u5a65\u5a2f\u5a06\u5a66\u5a24\u5a07\u5a0b\u5a21\u5a3b\u5a07\u5a69\u5a64\u5a1e\u5a38\u5a3d\u5a2e\u5a23\u5a0f\u5a1d\u5a05\u5a36\u5a65\u5a1a\u5a3c\u5a0e\u5a21\u5a26\u5a1a\u5a22\u5a3a\u5a17\u5a1d\u5a20\u5a66\u5a09\u5a3f\u5a61\u5a2f\u5a0f\u5a25\u5a64\u5a1d\u5a68\u5a2a\u5a3e\u5a21\u5a3e\u5a16\u5a65\u5a20\u5a17\u5a1b\u5a2c\u5a25\u5a08\u5a2d\u5a20\u5a3b\u5a1a\u5a28\u5a2c\u5a3e\u5a3f\u5a1f\u5a6c\u5a20\u5a6a\u5a0c\u5a1d\u5a0f\u5a65\u5a2f\u5a66\u5a20\u5a2b\u5a09\u5a69\u5a29\u5a6f\u5a17\u5a22\u5a28\u5a27\u5a04\u5a2e\u5a02\u5a66\u5a25\u5a0f\u5a61\u5a0f\u5a28\u5a23\u5a02\u5a17\u5a17\u5a27\u5a3b\u5a1a\u5a66\u5a04\u5a6f\u5a3d\u5a2e\u5a6a\u5a3d\u5a37\u5a6b\u5a6d\u5a61\u5a0e\u5a08\u5a04\u5a18\u5a1e\u5a21\u5a2b\u5a24\u5a0a\u5a6c\u5a1c\u5a6f\u5a0e\u5a29\u5a38\u5a38\u5a00\u5a36\u5a23\u5a26\u5a2d\u5a1f\u5a3d\u5a2f\u5a67\u5a04\u5a0b\u5a20\u5a05\u5a01\u5a08\u5a2d\u5a2e\u5a02\u5a64\u5a1c\u5a1a\u5a27\u5a0f\u5a29\u5a20\u5a6c\u5a3a\u5a2c\u5a03\u5a03\u5a28\u5a66\u5a69\u5a3c\u5a6c\u5a2a\u5a3d\u5a21\u5a1e\u5a6d\u5a26\u5a6d\u5a1e\u5a0c\u5a64\u5a1b\u5a08\u5a6d\u5a1e\u5a38\u5a20\u5a24\u5a1a\u5a07\u5a3a\u5a2b\u5a3d\u5a2e\u5a21\u5a26\u5a1a\u5a20\u5a17\u5a6a\u5a3a\u5a05\u5a02\u5a1b\u5a1a\u5a3d\u5a0d\u5a25\u5a3b\u5a20\u5a07\u5a20\u5a16\u5a1a\u5a6d\u5a08\u5a0b\u5a64\u5a26\u5a64\u5a1d\u5a22\u5a6c\u5a19\u5a27\u5a00\u5a20\u5a24\u5a1f\u5a0a\u5a6a\u5a29\u5a39\u5a2f\u5a61\u5a2f\u5a6d\u5a00\u5a0d\u5a0f\u5a18\u5a1e\u5a2b\u5a19\u5a65\u5a07\u5a00\u5a27\u5a17\u5a28\u5a18\u5a2a\u5a0c\u5a65\u5a1b\u5a08\u5a0d\u5a2a\u5a05\u5a18\u5a05\u5a64\u5a24\u5a1a\u5a22\u5a66\u5a04\u5a68\u5a39\u5a1f\u5a61\u5a1a\u5a2c\u5a36\u5a69\u5a26\u5a1b\u5a2e\u5a0f\u5a2b\u5a61\u5a3d\u5a05\u5a00\u5a08\u5a38\u5a6f\u5a65\u5a27\u5a05\u5a65\u5a64\u5a27\u5a28\u5a24\u5a1d\u5a6a\u5a1d\u5a6f\u5a23\u5a09\u5a23\u5a0d\u5a26\u5a01\u5a6f\u5a65\u5a1b\u5a66\u5a01\u5a38\u5a08\u5a1d\u5a2e\u5a6f\u5a0c\u5a21\u5a23\u5a0b\u5a26\u5a19\u5a01\u5a26\u5a18\u5a3b\u5a2a\u5a27\u5a20\u5a16\u5a00\u5a0f\u5a17\u5a18\u5a0a\u5a2a\u5a68\u5a39\u5a3b\u5a6d\u5a39\u5a20\u5a04\u5a1d".toCharArray();
            for (int i2 = G[123]; i2 < G[124]; ++i2) {
                int n4 = cArray[i2];
                n4 ^= G[125];
                n4 -= G[126];
                n4 += G[127];
                n4 -= G[128];
                n4 += G[129];
                n4 -= G[130];
                n4 -= G[131];
                n4 -= G[132];
                n4 -= G[133];
                cArray[i2] = (char)(n4 += G[134]);
            }
            object = J.A()[J.G[135]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)J.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = G[136];
        n5 ^= G[137];
        l5 = l16 ^ (0xBA00000000L ^ l16) & -1L << (n5 -= G[138]);
        long l17 = l12;
        int n6 = G[139];
        n6 += G[140];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= G[141]);
        while (true) {
            int n7 = G[142];
            n7 += G[143];
            if ((int)l12 >= (int)(l5 >>> (n7 += G[144]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = G[145];
            n9 -= G[146];
            int n10 = G[148];
            n10 -= G[149];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= G[147])) & -1L >>> (n10 ^= G[150]);
            long l19 = l8;
            int n11 = G[151];
            n11 -= G[152];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= G[153]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = G[154];
            n13 += G[155];
            int n14 = G[157];
            n14 -= G[158];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= G[156])) & -1L >>> (n14 ^= G[159]);
            int n15 = G[160];
            n15 += G[161];
            long l21 = l9;
            int n16 = G[163];
            n16 ^= G[164];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= G[162]) ^ l21) & -1L << (n16 ^= G[165]);
            int n17 = G[166];
            n17 += G[167];
            n17 ^= G[168];
            int n18 = G[169];
            n18 += G[170];
            long l22 = l11;
            int n19 = G[172];
            n19 ^= G[173];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= G[171]))) ^ l22) & -1L >>> (n19 -= G[174]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = G[175];
            n20 -= G[176];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += G[177]);
            while (true) {
                int n21 = G[178];
                n21 -= G[179];
                if ((int)(l13 >>> (n21 += G[180])) >= (int)l11) break;
                int n22 = G[181];
                n22 += G[182];
                int n23 = G[184];
                n23 += G[185];
                cArray2[(int)(l13 >>> (n22 ^= J.G[183]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += G[186]))];
                l13 += 0x100000000L;
            }
            int n24 = G[187];
            n24 ^= G[188];
            int n25 = (int)(l14 >>> (n24 += G[189]));
            l14 += 0x100000000L;
            J.e[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = G[190];
            n26 += G[191];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += G[192]);
        }
        INSTANCE = new J();
        int n27 = G[193];
        n27 -= G[194];
        n27 -= G[195];
        int n28 = G[196];
        n28 += G[197];
        String[] stringArray = new String[n28 ^= G[198]];
        int n29 = G[199];
        n29 += G[200];
        int n30 = G[202];
        n30 -= G[203];
        stringArray[n29 ^= J.G[201]] = (String)e[n30 -= G[204]];
        int n31 = G[205];
        n31 ^= G[206];
        int n32 = G[208];
        n32 += G[209];
        stringArray[n31 -= J.G[207]] = (String)e[n32 ^= G[210]];
        int n33 = G[211];
        n33 += G[212];
        int n34 = G[214];
        n34 -= G[215];
        B = a_0.mode$default(INSTANCE, (String)e[n27], CollectionsKt.listOf(stringArray), n33 -= G[213], n34 -= G[216], null);
        int n35 = G[217];
        n35 ^= G[218];
        int n36 = G[220];
        n36 -= G[221];
        c = INSTANCE.bind((String)e[n35 ^= G[219]], n36 += G[222]).setVisible(J::changeHandKey$lambda$0);
        int n37 = G[223];
        n37 -= G[224];
        boolean bl = G[226];
        bl -= G[227];
        C = INSTANCE.boolean((String)e[n37 += G[225]], bl -= G[228]).setVisible(J::onlyOnHit$lambda$0);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[G[229]];
        String string = (String)object[G[230]];
        object = object[G[231]];
        Object[] objectArray = F;
        if (F == null) {
            objectArray = F = new Object[G[232]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[G[233]];
                E = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[G[235] ^ G[236]];
                byArray[J.G[237] ^ J.G[238]] = G[239] ^ G[240];
                byArray[J.G[241] ^ J.G[242]] = G[243] ^ G[244];
                byArray[J.G[245] ^ J.G[246]] = G[247] ^ G[248];
                byArray[J.G[249] ^ J.G[250]] = G[251] ^ G[252];
                byArray[J.G[253] ^ J.G[254]] = G[255] ^ G[256];
                byArray[J.G[257] ^ J.G[258]] = G[259] ^ G[260];
                byArray[J.G[261] ^ J.G[262]] = G[263] ^ G[264];
                byArray[J.G[265] ^ J.G[266]] = G[267] ^ G[268];
                byArray[J.G[269] ^ J.G[270]] = G[271] ^ G[272];
                byArray[J.G[273] ^ J.G[274]] = G[275] ^ G[276];
                byArray[J.G[277] ^ J.G[278]] = G[279] ^ G[280];
                byArray[J.G[281] ^ J.G[282]] = G[283] ^ G[284];
                byArray[J.G[285] ^ J.G[286]] = G[287] ^ G[288];
                byArray[J.G[289] ^ J.G[290]] = G[291] ^ G[292];
                byArray[J.G[293] ^ J.G[294]] = G[295] ^ G[296];
                byArray[J.G[297] ^ J.G[298]] = G[299] ^ G[300];
                objectArray2[J.G[234]] = byArray;
            }
            byte[] byArray = (byte[])object3[G[301]];
            if (f == null) {
                byte[] byArray2 = new byte[G[302] ^ G[303]];
                byArray2[J.G[304] ^ J.G[305]] = G[306] ^ G[307];
                byArray2[J.G[308] ^ J.G[309]] = G[310] ^ G[311];
                byArray2[J.G[312] ^ J.G[313]] = G[314] ^ G[315];
                byArray2[J.G[316] ^ J.G[317]] = G[318] ^ G[319];
                byArray2[J.G[320] ^ J.G[321]] = G[322] ^ G[323];
                byArray2[J.G[324] ^ J.G[325]] = G[326] ^ G[327];
                byArray2[J.G[328] ^ J.G[329]] = G[330] ^ G[331];
                byArray2[J.G[332] ^ J.G[333]] = G[334] ^ G[335];
                byArray2[J.G[336] ^ J.G[337]] = G[338] ^ G[339];
                byArray2[J.G[340] ^ J.G[341]] = G[342] ^ G[343];
                byArray2[J.G[344] ^ J.G[345]] = G[346] ^ G[347];
                byArray2[J.G[348] ^ J.G[349]] = G[350] ^ G[351];
                byArray2[J.G[352] ^ J.G[353]] = G[354] ^ G[355];
                byArray2[J.G[356] ^ J.G[357]] = G[358] ^ G[359];
                byArray2[J.G[360] ^ J.G[361]] = G[362] ^ G[363];
                byArray2[J.G[364] ^ J.G[365]] = G[366] ^ G[367];
                byArray2[J.G[368] ^ J.G[369]] = G[370] ^ G[371];
                byArray2[J.G[372] ^ J.G[373]] = G[374] ^ G[375];
                byArray2[J.G[376] ^ J.G[377]] = G[378] ^ G[379];
                byArray2[J.G[380] ^ J.G[381]] = G[382] ^ G[383];
                byArray2[J.G[384] ^ J.G[385]] = G[386] ^ G[387];
                byArray2[J.G[388] ^ J.G[389]] = G[390] ^ G[391];
                byArray2[J.G[392] ^ J.G[393]] = G[394] ^ G[395];
                byArray2[J.G[396] ^ J.G[397]] = G[398] ^ G[399];
                byArray2[0x10497 ^ 0x10491] = 0xFFFEFB56 ^ 0x10491;
                byArray2[0x26E9 ^ 0x26E6] = 0xFFFFD912 ^ 0x26E6;
                byArray2[0xB623 ^ 0xB63E] = 0xFFFF499C ^ 0xB63E;
                byArray2[0x10C2F ^ 0x10C3B] = 0xFFFEF3DF ^ 0x10C3B;
                byArray2[0xACD5 ^ 0xACCC] = 0xACF5 ^ 0xACCC;
                byArray2[0xEA0F ^ 0xEA0F] = 0xEA4E ^ 0xEA0F;
                byArray2[0xB94B ^ 0xB94C] = 0xFFFF46EF ^ 0xB94C;
                byArray2[0xE43 ^ 0xE47] = 0xE61 ^ 0xE47;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = J.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u2887\u28fd\u28fa\u28e3\u28f9\u28cd\u37fe\u37dc\u2b33\u37af\u28cf\u37e8\u37c4\u37c2\u37d2\u28cf\u28e4\u28f4".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 ^= 0x9211;
                        n2 ^= 0x99D2;
                        n2 ^= 0x7053;
                        n2 += 13315;
                        n2 ^= 0x1324;
                        n2 -= 7748;
                        n2 += 34676;
                        n2 -= 25989;
                        n2 ^= 0x5266;
                        n2 -= 60764;
                        n2 ^= 0xADEC;
                        cArray[i2] = (char)(n2 -= 30095);
                    }
                    object4 = J.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[6] = 36;
                byArray4[4] = 84;
                byArray4[15] = 87;
                byArray4[1] = -67;
                byArray4[3] = 106;
                byArray4[11] = -11;
                byArray4[14] = 87;
                byArray4[8] = -34;
                byArray4[7] = 8;
                byArray4[5] = -117;
                byArray4[9] = -17;
                byArray4[10] = -95;
                byArray4[12] = -58;
                byArray4[13] = -9;
                byArray4[0] = 88;
                byArray4[2] = 3;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 20, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = J.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ued8a\ued86\ued98".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 += 27972;
                        n3 += 15460;
                        n3 -= 13670;
                        n3 -= 41798;
                        n3 ^= 0x4767;
                        n3 += 3112;
                        n3 ^= 0xEF28;
                        n3 -= 53995;
                        n3 -= 60722;
                        n3 += 9849;
                        n3 -= 38204;
                        n3 ^= 0xC65F;
                        cArray[i3] = (char)(n3 ^= 0x7C5F);
                    }
                    object5 = J.A()[2] = new String(cArray);
                }
                f = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = J.A()[3];
            if (object6 == null) {
                char[] cArray = "\u59dd\u5979\u5967\u57fb\u5977\u5976\u5977\u57fb\u580c\u59df\u5977\u5967\u5809\u580c\u59bd\u59d8\u59d8\u59c5\u59ba\u59d3".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 -= 12480;
                    n4 += 57826;
                    n4 -= 61444;
                    n4 ^= 0x24C7;
                    n4 += 20299;
                    n4 += 14221;
                    n4 += 18896;
                    n4 ^= 0xE7D4;
                    n4 += 45462;
                    n4 ^= 0x639B;
                    n4 += 23548;
                    n4 ^= 0x337C;
                    cArray[i4] = (char)(n4 += 39452);
                }
                object6 = J.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)f), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = g;
        if (g == null) {
            g = new Object[4];
            objectArray = g;
        }
        return objectArray;
    }

    public static void b() {
        G = new int[0x10D85 ^ 0x10C15];
        J.G[0x10357 ^ 0x103E9] = 0x10365 ^ 0x103E9;
        J.G[0xA435 ^ 0xA448] = 0xE219 ^ 0xA448;
        J.G[0x30E4 ^ 0x3028] = 0xFFFFCFBA ^ 0x3028;
        J.G[0xC14A ^ 0xC01D] = 0xC71D ^ 0xC01D;
        J.G[0x2577 ^ 0x259B] = 0x1217A ^ 0x259B;
        J.G[0x10202 ^ 0x102B0] = 0xFFFEFD43 ^ 0x102B0;
        J.G[0x958F ^ 0x95EE] = 0xFFFF6A50 ^ 0x95EE;
        J.G[0x760C ^ 0x76D0] = 0x769E ^ 0x76D0;
        J.G[0xE1AE ^ 0xE092] = 0x336E ^ 0xE092;
        J.G[0x52EE ^ 0x53C9] = 0x46A2 ^ 0x53C9;
        J.G[0x9645 ^ 0x96DC] = 0xFFFF6917 ^ 0x96DC;
        J.G[0xB735 ^ 0xB6B4] = 0x1BC83 ^ 0xB6B4;
        J.G[0x5C67 ^ 0x5CF9] = 0xFFFFA300 ^ 0x5CF9;
        J.G[0x573C ^ 0x5718] = 0xFFFFA8E4 ^ 0x5718;
        J.G[0x37EE ^ 0x3696] = 0xD156 ^ 0x3696;
        J.G[0xF374 ^ 0xF3BA] = 0xF3F9 ^ 0xF3BA;
        J.G[0x82E2 ^ 0x8254] = 0xFFFF7DA8 ^ 0x8254;
        J.G[0xC7E0 ^ 0xC7E6] = 0xFFFF380F ^ 0xC7E6;
        J.G[0x3A64 ^ 0x3BEF] = 0x901C ^ 0x3BEF;
        J.G[0xED9E ^ 0xECDC] = 0x6FB6 ^ 0xECDC;
        J.G[0x10AD4 ^ 0x10A43] = 0xFFFEF599 ^ 0x10A43;
        J.G[0xBDB1 ^ 0xBCA7] = 0xDE1F ^ 0xBCA7;
        J.G[0xC25E ^ 0xC307] = 0x57FB ^ 0xC307;
        J.G[0x3424 ^ 0x3558] = 0xD954 ^ 0x3558;
        J.G[0xB62D ^ 0xB643] = 0xFFFF4987 ^ 0xB643;
        J.G[0xB946 ^ 0xB9B4] = 0x4D64 ^ 0xB9B4;
        J.G[0x7F37 ^ 0x7E00] = 0xAD7F ^ 0x7E00;
        J.G[0x74C ^ 0x7A6] = 0x7A6 ^ 0x7A6;
        J.G[0x8BBD ^ 0x8AE7] = 0x1E18 ^ 0x8AE7;
        J.G[0x2F26 ^ 0x2F68] = 0x2F77 ^ 0x2F68;
        J.G[0x577F ^ 0x5668] = 0xFFFFCB10 ^ 0x5668;
        J.G[0xC0F7 ^ 0xC0A8] = 0xC0C7 ^ 0xC0A8;
        J.G[0x1C2 ^ 0x123] = 0x11C ^ 0x123;
        J.G[0x25AD ^ 0x259A] = 0xFFFFDA49 ^ 0x259A;
        J.G[0x9E82 ^ 0x9E0C] = 0x9E1B ^ 0x9E0C;
        J.G[0xCE46 ^ 0xCFC8] = 0xFFFF7A3F ^ 0xCFC8;
        J.G[0xB0C7 ^ 0xB0EE] = 0xFFFF4F09 ^ 0xB0EE;
        J.G[0xDFC5 ^ 0xDE81] = 0x6201 ^ 0xDE81;
        J.G[0x3572 ^ 0x3570] = 0x357F ^ 0x3570;
        J.G[0x6C37 ^ 0x6C9E] = 0xFFFF9346 ^ 0x6C9E;
        J.G[0x1B34 ^ 0x1B90] = 0xFFFFE42D ^ 0x1B90;
        J.G[0xE7DC ^ 0xE68E] = 0x341E ^ 0xE68E;
        J.G[0x926A ^ 0x9227] = 0x927B ^ 0x9227;
        J.G[0xCFC6 ^ 0xCEC3] = 0xE057 ^ 0xCEC3;
        J.G[0xF8FC ^ 0xF875] = 0xF826 ^ 0xF875;
        J.G[0xBC77 ^ 0xBD4A] = 0x6EAA ^ 0xBD4A;
        J.G[0x9951 ^ 0x9979] = 0xFFFF66C0 ^ 0x9979;
        J.G[0x6CE4 ^ 0x6CA6] = 0x6C1A ^ 0x6CA6;
        J.G[0x835C ^ 0x8336] = 0x8303 ^ 0x8336;
        J.G[0x3C5A ^ 0x3D65] = 0xEE85 ^ 0x3D65;
        J.G[0x4A53 ^ 0x4B53] = 0x94D1 ^ 0x4B53;
        J.G[0x962C ^ 0x97AF] = 0x19D98 ^ 0x97AF;
        J.G[0xC102 ^ 0xC12E] = 0xC172 ^ 0xC12E;
        J.G[0x1D76 ^ 0x1C2D] = 0x88D1 ^ 0x1C2D;
        J.G[0x3C09 ^ 0x3CDB] = 0x3CBE ^ 0x3CDB;
        J.G[0x1059E ^ 0x1055B] = 0xFFFEFAD0 ^ 0x1055B;
        J.G[0x18A4 ^ 0x192B] = 0x532E ^ 0x192B;
        J.G[0x7946 ^ 0x7807] = 0xFB16 ^ 0x7807;
        J.G[0x898A ^ 0x891A] = 0xFFFF76EB ^ 0x891A;
        J.G[0xD5D4 ^ 0xD45D] = 0x7FAE ^ 0xD45D;
        J.G[0x9D8C ^ 0x9CB9] = 0x4FC6 ^ 0x9CB9;
        J.G[0x5278 ^ 0x5358] = 0x54D9 ^ 0x5358;
        J.G[0x6A53 ^ 0x6B41] = 0xCE6F ^ 0x6B41;
        J.G[0xED5B ^ 0xEC62] = 0xB18C ^ 0xEC62;
        J.G[0xAF08 ^ 0xAF23] = 0xFFFF50CE ^ 0xAF23;
        J.G[0xE81E ^ 0xE907] = 0xA868 ^ 0xE907;
        J.G[0x9262 ^ 0x927E] = 0xFFFF6DA1 ^ 0x927E;
        J.G[0x6D7F ^ 0x6D06] = 0x6D04 ^ 0x6D06;
        J.G[0x3667 ^ 0x37E0] = 0xF22C ^ 0x37E0;
        J.G[0xCC03 ^ 0xCCB8] = 0xFFFF331F ^ 0xCCB8;
        J.G[0xCBD4 ^ 0xCADE] = 0x869F ^ 0xCADE;
        J.G[0x79AB ^ 0x78FA] = 0xAA40 ^ 0x78FA;
        J.G[0x36A5 ^ 0x3676] = 0x364F ^ 0x3676;
        J.G[0x50B5 ^ 0x501A] = 0xFFFFAFA5 ^ 0x501A;
        J.G[0xE8DD ^ 0xE955] = 0x42B8 ^ 0xE955;
        J.G[0x8041 ^ 0x80C7] = 0xD099 ^ 0x80C7;
        J.G[0x969A ^ 0x9650] = 0xFFFF69E0 ^ 0x9650;
        J.G[0x7314 ^ 0x731A] = 0x7321 ^ 0x731A;
        J.G[0x26B ^ 0x270] = 0x220 ^ 0x270;
        J.G[0xA74C ^ 0xA621] = 0xC267 ^ 0xA621;
        J.G[0x6FCC ^ 0x6FBF] = 0x6FAD ^ 0x6FBF;
        J.G[0xDDAD ^ 0xDD2A] = 0xDD2A ^ 0xDD2A;
        J.G[0xD6AF ^ 0xD65A] = 0xA555 ^ 0xD65A;
        J.G[0x2AFE ^ 0x2AF3] = 0x2A9B ^ 0x2AF3;
        J.G[0x1D5F ^ 0x1DA7] = 0x6EAD ^ 0x1DA7;
        J.G[0x8EAE ^ 0x8E46] = 0x8E47 ^ 0x8E46;
        J.G[0x56F3 ^ 0x57D1] = 0xBBC9 ^ 0x57D1;
        J.G[0x22A9 ^ 0x238F] = 0x36C5 ^ 0x238F;
        J.G[0xDE80 ^ 0xDFE5] = 0x1D93E ^ 0xDFE5;
        J.G[0x38BA ^ 0x38B1] = 0xFFFFC764 ^ 0x38B1;
        J.G[0x8A29 ^ 0x8AD3] = 0xAFEA ^ 0x8AD3;
        J.G[0x1038 ^ 0x1066] = 0xFFFFEFAD ^ 0x1066;
        J.G[0xD2F3 ^ 0xD225] = 0xD206 ^ 0xD225;
        J.G[0x8105 ^ 0x81E5] = 0xFFFF7E00 ^ 0x81E5;
        J.G[0x8D34 ^ 0x8D66] = 0x8D34 ^ 0x8D66;
        J.G[0x4775 ^ 0x47AD] = 0x47D4 ^ 0x47AD;
        J.G[0x37FE ^ 0x3710] = 0xF796 ^ 0x3710;
        J.G[0x1BC0 ^ 0x1B52] = 0x1B22 ^ 0x1B52;
        J.G[0xF9DE ^ 0xF8EF] = 0x9711 ^ 0xF8EF;
        J.G[0x6E28 ^ 0x6E19] = 0x6E34 ^ 0x6E19;
        J.G[0xB731 ^ 0xB790] = 0xB7F5 ^ 0xB790;
        J.G[0xE72F ^ 0xE67B] = 0xE161 ^ 0xE67B;
        J.G[0x6C33 ^ 0x6C4C] = 0x1B8D ^ 0x6C4C;
        J.G[0x9537 ^ 0x950D] = 0xFFFF6AE3 ^ 0x950D;
        J.G[0x2B48 ^ 0x2B6D] = 0x2B2C ^ 0x2B6D;
        J.G[0x55BC ^ 0x554B] = 0xFFFFD9A4 ^ 0x554B;
        J.G[0x7EB9 ^ 0x7FD0] = 0xA5FC ^ 0x7FD0;
        J.G[0x1759 ^ 0x163B] = 0xF4A3 ^ 0x163B;
        J.G[0x10C27 ^ 0x10CA7] = 0x11D36 ^ 0x10CA7;
        J.G[0x9E4A ^ 0x9E5D] = 0x9E34 ^ 0x9E5D;
        J.G[0x5A9A ^ 0x5A8E] = 0xFFFFA54F ^ 0x5A8E;
        J.G[0x2947 ^ 0x2831] = 0xFFFF2922 ^ 0x2831;
        J.G[0xF123 ^ 0xF047] = 0x1F683 ^ 0xF047;
        J.G[0xFE4C ^ 0xFF69] = 0xEA2A ^ 0xFF69;
        J.G[0x9806 ^ 0x98EF] = 0x98EE ^ 0x98EF;
        J.G[0xC9DB ^ 0xC8B7] = 0xACE7 ^ 0xC8B7;
        J.G[0x5750 ^ 0x5700] = 0xFFFFA8A6 ^ 0x5700;
        J.G[0x10932 ^ 0x10879] = 0x192C6 ^ 0x10879;
        J.G[0x4440 ^ 0x446E] = 0x446D ^ 0x446E;
        J.G[0x1B02 ^ 0x1A19] = 0x5B35 ^ 0x1A19;
        J.G[0xF085 ^ 0xF09F] = 0xFFFF0F7A ^ 0xF09F;
        J.G[0x93EB ^ 0x92C7] = 0x4316 ^ 0x92C7;
        J.G[0x13EB ^ 0x1330] = 0x135D ^ 0x1330;
        J.G[0xE12E ^ 0xE040] = 0x8464 ^ 0xE040;
        J.G[0x925F ^ 0x92B0] = 0xFFFFAD94 ^ 0x92B0;
        J.G[0x1C79 ^ 0x1C78] = 0x1C40 ^ 0x1C78;
        J.G[0x71FA ^ 0x7147] = 0x710A ^ 0x7147;
        J.G[0x236B ^ 0x2262] = 0x6E28 ^ 0x2262;
        J.G[0x2907 ^ 0x2961] = 0xFFFFD6B4 ^ 0x2961;
        J.G[0x95DC ^ 0x9540] = 0xFFFF6AA8 ^ 0x9540;
        J.G[0x4798 ^ 0x46DD] = 0xFA56 ^ 0x46DD;
        J.G[0x4CD0 ^ 0x4CAA] = 0x4CAA ^ 0x4CAA;
        J.G[0xF88C ^ 0xF84E] = 0xF82F ^ 0xF84E;
        J.G[0x59E4 ^ 0x58DE] = 0x552 ^ 0x58DE;
        J.G[0x2F2F ^ 0x2F9B] = 0xFFFFD041 ^ 0x2F9B;
        J.G[0x7639 ^ 0x765B] = 0xFFFF899C ^ 0x765B;
        J.G[0x2F7F ^ 0x2F01] = 0xAD00 ^ 0x2F01;
        J.G[0x1C05 ^ 0x1C59] = 0xFFFFE39D ^ 0x1C59;
        J.G[0x536D ^ 0x5365] = 0xFFFFACD5 ^ 0x5365;
        J.G[0xD1A5 ^ 0xD0F0] = 0xD7F0 ^ 0xD0F0;
        J.G[0x875A ^ 0x867E] = 0x6A66 ^ 0x867E;
        J.G[0x13AC ^ 0x13D8] = 0xFFFFEC6B ^ 0x13D8;
        J.G[0x29A2 ^ 0x288B] = 0xF954 ^ 0x288B;
        J.G[0x107D1 ^ 0x1065C] = 0x14C59 ^ 0x1065C;
        J.G[0xFEB8 ^ 0xFE43] = 0xDB6C ^ 0xFE43;
        J.G[0xF76 ^ 0xF48] = 0xF02 ^ 0xF48;
        J.G[0x1853 ^ 0x18EF] = 0x189B ^ 0x18EF;
        J.G[0xC2ED ^ 0xC27C] = 0xC245 ^ 0xC27C;
        J.G[0x55A1 ^ 0x55B1] = 0x55B9 ^ 0x55B1;
        J.G[0x746F ^ 0x7492] = 0xAB16 ^ 0x7492;
        J.G[0xC653 ^ 0xC77C] = 0x4E44 ^ 0xC77C;
        J.G[0x5195 ^ 0x50B8] = 0x50B8 ^ 0x50B8;
        J.G[0x177B ^ 0x1712] = 0xFFFFE8A2 ^ 0x1712;
        J.G[0x8483 ^ 0x84CC] = 0x84B4 ^ 0x84CC;
        J.G[0x9009 ^ 0x912A] = 0x7D5B ^ 0x912A;
        J.G[0x2EC2 ^ 0x2FDF] = 0x285E ^ 0x2FDF;
        J.G[0xDE81 ^ 0xDEB2] = 0xDE03 ^ 0xDEB2;
        J.G[0x6AAD ^ 0x6A74] = 0x6A40 ^ 0x6A74;
        J.G[0x2DE2 ^ 0x2DB1] = 0xFFFFD200 ^ 0x2DB1;
        J.G[0xE6D1 ^ 0xE686] = 0xFFFF1978 ^ 0xE686;
        J.G[0x63C6 ^ 0x62F6] = 0xD00 ^ 0x62F6;
        J.G[0x4A37 ^ 0x4AC9] = 0x954B ^ 0x4AC9;
        J.G[0x11E9 ^ 0x112E] = 0xFFFFEECC ^ 0x112E;
        J.G[0x106C8 ^ 0x10689] = 0x106C6 ^ 0x10689;
        J.G[0x5791 ^ 0x5724] = 0x5765 ^ 0x5724;
        J.G[0x85C0 ^ 0x8536] = 0xF63C ^ 0x8536;
        J.G[0x982A ^ 0x9924] = 0xAFA8 ^ 0x9924;
        J.G[0x4987 ^ 0x48A6] = 0xA4BC ^ 0x48A6;
        J.G[0xDEDE ^ 0xDEA9] = 0xDEA8 ^ 0xDEA9;
        J.G[0x6579 ^ 0x65B0] = 0x6597 ^ 0x65B0;
        J.G[0xBD6F ^ 0xBDA7] = 0xBDE2 ^ 0xBDA7;
        J.G[0x7E9A ^ 0x7FF2] = 0xA5D4 ^ 0x7FF2;
        J.G[0xAAE8 ^ 0xABBE] = 0xACF0 ^ 0xABBE;
        J.G[0x6194 ^ 0x61B9] = 0x613E ^ 0x61B9;
        J.G[0xA7A2 ^ 0xA6BC] = 0xA13D ^ 0xA6BC;
        J.G[0x4848 ^ 0x48F1] = 0x4882 ^ 0x48F1;
        J.G[0xB42E ^ 0xB555] = 0x5290 ^ 0xB555;
        J.G[0x7537 ^ 0x75AA] = 0x759A ^ 0x75AA;
        J.G[0x813C ^ 0x8105] = 0xFFFF7EEB ^ 0x8105;
        J.G[0xEC8B ^ 0xEC96] = 0xEC99 ^ 0xEC96;
        J.G[0x4E76 ^ 0x4F6A] = 0xE0D ^ 0x4F6A;
        J.G[0x18AC ^ 0x183A] = 0x1877 ^ 0x183A;
        J.G[0xFA89 ^ 0xFABC] = 0xFA85 ^ 0xFABC;
        J.G[0xF680 ^ 0xF6C5] = 0xF6F3 ^ 0xF6C5;
        J.G[0x6EAE ^ 0x6F24] = 0xFFFF3B3F ^ 0x6F24;
        J.G[0xD24E ^ 0xD269] = 0xD227 ^ 0xD269;
        J.G[0x252A ^ 0x2566] = 0xFFFFDAFB ^ 0x2566;
        J.G[0x56FB ^ 0x5618] = 0xFFFFA9B3 ^ 0x5618;
        J.G[0x6BF2 ^ 0x6B02] = 0xAB84 ^ 0x6B02;
        J.G[0xAC82 ^ 0xADC1] = 0x2ED0 ^ 0xADC1;
        J.G[0x75D1 ^ 0x7574] = 0xFFFF8AF0 ^ 0x7574;
        J.G[0x1E36 ^ 0x1ED2] = 0xFFFFE105 ^ 0x1ED2;
        J.G[0xFA6 ^ 0xFE0] = 0xFFFFF05F ^ 0xFE0;
        J.G[0x473E ^ 0x463A] = 0xC9A1 ^ 0x463A;
        J.G[0x9999 ^ 0x99F6] = 0x99DD ^ 0x99F6;
        J.G[0x3B00 ^ 0x3B8A] = 0x3BD3 ^ 0x3B8A;
        J.G[0x7C0C ^ 0x7D18] = 0xD836 ^ 0x7D18;
        J.G[0x7273 ^ 0x72C3] = 0xFFFF8D09 ^ 0x72C3;
        J.G[0x66B9 ^ 0x662A] = 0xFFFF99E2 ^ 0x662A;
        J.G[0x9108 ^ 0x91A4] = 0x91CB ^ 0x91A4;
        J.G[0xD972 ^ 0xD879] = 0x941F ^ 0xD879;
        J.G[0x9B94 ^ 0x9AD8] = 0x503D ^ 0x9AD8;
        J.G[0x77A7 ^ 0x77E7] = 0x77B7 ^ 0x77E7;
        J.G[0x474B ^ 0x47AD] = 0x47AF ^ 0x47AD;
        J.G[0xA843 ^ 0xA808] = 0xFFFF57F1 ^ 0xA808;
        J.G[0x2A57 ^ 0x2AD4] = 0xF5A0 ^ 0x2AD4;
        J.G[0xD048 ^ 0xD135] = 0x3D3B ^ 0xD135;
        J.G[0xBB6E ^ 0xBBC8] = 0xFFFF443E ^ 0xBBC8;
        J.G[0xE3A4 ^ 0xE2D4] = 0xE64D ^ 0xE2D4;
        J.G[0x77EC ^ 0x77A5] = 0xFFFF887A ^ 0x77A5;
        J.G[0x86AB ^ 0x8649] = 0xFFFF79CA ^ 0x8649;
        J.G[0x98D2 ^ 0x99B8] = 0x439A ^ 0x99B8;
        J.G[0x59E0 ^ 0x5860] = 0x15240 ^ 0x5860;
        J.G[0x3645 ^ 0x363D] = 0x363D ^ 0x363D;
        J.G[0xA3ED ^ 0xA269] = 0x67BE ^ 0xA269;
        J.G[0xCC0D ^ 0xCD66] = 0x174A ^ 0xCD66;
        J.G[0x7661 ^ 0x772C] = 0xBDC7 ^ 0x772C;
        J.G[0x1434 ^ 0x157D] = 0x8FC2 ^ 0x157D;
        J.G[0x495D ^ 0x49C6] = 0x49D5 ^ 0x49C6;
        J.G[0xE0F0 ^ 0xE03F] = 0xFFFF1F8A ^ 0xE03F;
        J.G[0x18BB ^ 0x19BD] = 0x372D ^ 0x19BD;
        J.G[0x2D9A ^ 0x2D9E] = 0xFFFFD243 ^ 0x2D9E;
        J.G[0xB450 ^ 0xB438] = 0xFFFF4BBC ^ 0xB438;
        J.G[0x3FA0 ^ 0x3EA3] = 0xB11C ^ 0x3EA3;
        J.G[0xE588 ^ 0xE539] = 0xE512 ^ 0xE539;
        J.G[0x1DED ^ 0x1D60] = 0x1D6B ^ 0x1D60;
        J.G[0x6DF3 ^ 0x6CBB] = 0xF614 ^ 0x6CBB;
        J.G[0x383D ^ 0x383A] = 0xFFFFC7A3 ^ 0x383A;
        J.G[0xB155 ^ 0xB150] = 0xFFFF4EF4 ^ 0xB150;
        J.G[0x6A4D ^ 0x6A75] = 0xFFFF9595 ^ 0x6A75;
        J.G[0x4B0B ^ 0x4BCB] = 0xFFFFB473 ^ 0x4BCB;
        J.G[0x70D8 ^ 0x71EB] = 0x1E15 ^ 0x71EB;
        J.G[0x9F81 ^ 0x9FD5] = 0x9F9C ^ 0x9FD5;
        J.G[0x7712 ^ 0x7786] = 0x7793 ^ 0x7786;
        J.G[0x7069 ^ 0x70E8] = 0xB269 ^ 0x70E8;
        J.G[0x10AF7 ^ 0x10BB9] = 0x1C114 ^ 0x10BB9;
        J.G[0x6A95 ^ 0x6AEE] = 0x6AEE ^ 0x6AEE;
        J.G[0x88C4 ^ 0x89DE] = 0xC8B9 ^ 0x89DE;
        J.G[0x749B ^ 0x744E] = 0x7407 ^ 0x744E;
        J.G[0xDCE ^ 0xD2B] = 0xD2A ^ 0xD2B;
        J.G[0x3FAA ^ 0x3F89] = 0xFFFFC029 ^ 0x3F89;
        J.G[0x572C ^ 0x566C] = 0xD57C ^ 0x566C;
        J.G[0x30AA ^ 0x3074] = 0xFFFFCFE1 ^ 0x3074;
        J.G[0xA63D ^ 0xA765] = 0x338B ^ 0xA765;
        J.G[0xB644 ^ 0xB6F7] = 0xFFFF495A ^ 0xB6F7;
        J.G[0xF2E6 ^ 0xF2EF] = 0xF272 ^ 0xF2EF;
        J.G[0xE609 ^ 0xE737] = 0x34FF ^ 0xE737;
        J.G[0xBCEC ^ 0xBCBA] = 0xFFFF4363 ^ 0xBCBA;
        J.G[0xDF2 ^ 0xCCA] = 0x5135 ^ 0xCCA;
        J.G[0x6410 ^ 0x6561] = 0x61EB ^ 0x6561;
        J.G[0x42BF ^ 0x4268] = 0xFFFFBDCE ^ 0x4268;
        J.G[0x65F5 ^ 0x64F2] = 0x4A40 ^ 0x64F2;
        J.G[0x449E ^ 0x4426] = 0xFFFFBB86 ^ 0x4426;
        J.G[0x88CC ^ 0x89B5] = 0x6E70 ^ 0x89B5;
        J.G[0x8E7A ^ 0x8E30] = 0x8E6C ^ 0x8E30;
        J.G[0x5575 ^ 0x5516] = 0xFFFFAAE6 ^ 0x5516;
        J.G[0x10C12 ^ 0x10D60] = 0xFFFEF67B ^ 0x10D60;
        J.G[0xB03B ^ 0xB019] = 0xFFFF4F88 ^ 0xB019;
        J.G[0x17CC ^ 0x16B9] = 0xE840 ^ 0x16B9;
        J.G[0xD272 ^ 0xD24D] = 0xD253 ^ 0xD24D;
        J.G[0x6313 ^ 0x63BE] = 0x638A ^ 0x63BE;
        J.G[0x7E00 ^ 0x7E20] = 0xFFFF81A7 ^ 0x7E20;
        J.G[0xE194 ^ 0xE1CE] = 0xE15F ^ 0xE1CE;
        J.G[0x53D2 ^ 0x532E] = 0x7617 ^ 0x532E;
        J.G[0xA834 ^ 0xA85F] = 0xA876 ^ 0xA85F;
        J.G[0x7487 ^ 0x74CF] = 0xFFFF8B4D ^ 0x74CF;
        J.G[0x5067 ^ 0x5002] = 0x5060 ^ 0x5002;
        J.G[0xE79A ^ 0xE73A] = 0xE719 ^ 0xE73A;
        J.G[0x51E6 ^ 0x50EA] = 0x1CAB ^ 0x50EA;
        J.G[0xA96A ^ 0xA99B] = 0x5D48 ^ 0xA99B;
        J.G[0xC22F ^ 0xC239] = 0xC261 ^ 0xC239;
        J.G[0x14A2 ^ 0x15ED] = 0xDF06 ^ 0x15ED;
        J.G[0xDF28 ^ 0xDE39] = 0x7B1D ^ 0xDE39;
        J.G[0x3FC7 ^ 0x3EC6] = 0xB15C ^ 0x3EC6;
        J.G[0xF110 ^ 0xF04C] = 0x1F737 ^ 0xF04C;
        J.G[0x9ADE ^ 0x9A9D] = 0x9AD9 ^ 0x9A9D;
        J.G[0xF449 ^ 0xF517] = 0x1F22E ^ 0xF517;
        J.G[0x6FE7 ^ 0x6F83] = 0xFFFF900D ^ 0x6F83;
        J.G[0x9A41 ^ 0x9B06] = 0x278D ^ 0x9B06;
        J.G[0x5640 ^ 0x566A] = 0x5618 ^ 0x566A;
        J.G[0xCCC2 ^ 0xCDBC] = 0xFFFFDE67 ^ 0xCDBC;
        J.G[0xCC20 ^ 0xCCD3] = 0x3837 ^ 0xCCD3;
        J.G[0xFB47 ^ 0xFA26] = 0x18E0 ^ 0xFA26;
        J.G[0xA9CE ^ 0xA9B2] = 0xA872 ^ 0xA9B2;
        J.G[0x8A64 ^ 0x8A68] = 0x8A1B ^ 0x8A68;
        J.G[0xEAEE ^ 0xEBC6] = 0xFE8C ^ 0xEBC6;
        J.G[0x862B ^ 0x8726] = 0xB1A7 ^ 0x8726;
        J.G[0xFD42 ^ 0xFDEC] = 0xFDD7 ^ 0xFDEC;
        J.G[0xD59B ^ 0xD576] = 0x15F7 ^ 0xD576;
        J.G[0x8287 ^ 0x828D] = 0xFFFF7D02 ^ 0x828D;
        J.G[0x2BA2 ^ 0x2ABA] = 0x4802 ^ 0x2ABA;
        J.G[0xE268 ^ 0xE2D2] = 0xE2DF ^ 0xE2D2;
        J.G[0x43CB ^ 0x439E] = 0xFFFFBC11 ^ 0x439E;
        J.G[0xEAB3 ^ 0xEA2C] = 0xEA3B ^ 0xEA2C;
        J.G[0x49DE ^ 0x49C6] = 0x49F8 ^ 0x49C6;
        J.G[0xB0C1 ^ 0xB076] = 0xB06B ^ 0xB076;
        J.G[0x8BF ^ 0x9AA] = 0x6B1D ^ 0x9AA;
        J.G[0x7FB3 ^ 0x7EBB] = 0x502B ^ 0x7EBB;
        J.G[0x9927 ^ 0x98A1] = 0xFFFFA297 ^ 0x98A1;
        J.G[0x6774 ^ 0x67F1] = 0x1D86 ^ 0x67F1;
        J.G[0x332D ^ 0x32A1] = 0x78BC ^ 0x32A1;
        J.G[0xB352 ^ 0xB3AD] = 0xFFFF93A8 ^ 0xB3AD;
        J.G[0x6831 ^ 0x6856] = 0xFFFF97FF ^ 0x6856;
        J.G[0xA43C ^ 0xA496] = 0xA4F7 ^ 0xA496;
        J.G[0xBD4B ^ 0xBDE9] = 0xBD81 ^ 0xBDE9;
        J.G[0x845 ^ 0x81E] = 0x856 ^ 0x81E;
        J.G[0x9710 ^ 0x9736] = 0x9755 ^ 0x9736;
        J.G[0x10E1A ^ 0x10EE3] = 0x12BD6 ^ 0x10EE3;
        J.G[0x4EF1 ^ 0x4ECA] = 0xFFFFB136 ^ 0x4ECA;
        J.G[0xA3A4 ^ 0xA390] = 0xA3E5 ^ 0xA390;
        J.G[0x5C80 ^ 0x5C92] = 0xFFFFA3EF ^ 0x5C92;
        J.G[0x8B10 ^ 0x8B09] = 0x8B53 ^ 0x8B09;
        J.G[0x8382 ^ 0x8391] = 0xFFFF7C2C ^ 0x8391;
        J.G[0xD036 ^ 0xD151] = 0x1D78A ^ 0xD151;
        J.G[0x18EE ^ 0x18FF] = 0x1885 ^ 0x18FF;
        J.G[0x31B9 ^ 0x3169] = 0x31B0 ^ 0x3169;
        J.G[0xB86C ^ 0xB8EE] = 0x6D4D ^ 0xB8EE;
        J.G[0x1B0 ^ 0x16A] = 0x138 ^ 0x16A;
        J.G[0x4C95 ^ 0x4C44] = 0xFFFFB3CE ^ 0x4C44;
        J.G[0x229C ^ 0x22AC] = 0x2293 ^ 0x22AC;
        J.G[0xA71E ^ 0xA796] = 0xA7BC ^ 0xA796;
        J.G[0x8527 ^ 0x8584] = 0x859D ^ 0x8584;
        J.G[0xC96E ^ 0xC8EC] = 0x1C2A8 ^ 0xC8EC;
        J.G[0x5DA8 ^ 0x5CB8] = 0x6A34 ^ 0x5CB8;
        J.G[0xDA68 ^ 0xDAE3] = 0xDA95 ^ 0xDAE3;
        J.G[0xC8BA ^ 0xC88C] = 0xC89A ^ 0xC88C;
        J.G[0x7304 ^ 0x722E] = 0xA3FF ^ 0x722E;
        J.G[0x2D06 ^ 0x2DD9] = 0xFFFFD271 ^ 0x2DD9;
        J.G[0xEA4E ^ 0xEA17] = 0xEA38 ^ 0xEA17;
        J.G[0x4DA4 ^ 0x4C21] = 0x89ED ^ 0x4C21;
        J.G[0x2C7A ^ 0x2C91] = 0x12860 ^ 0x2C91;
        J.G[0xDF08 ^ 0xDF27] = 0xDF4D ^ 0xDF27;
        J.G[0x9DEB ^ 0x9D1F] = 0x69CF ^ 0x9D1F;
        J.G[0x93FE ^ 0x939E] = 0xFFFF6C69 ^ 0x939E;
        J.G[0x4747 ^ 0x4645] = 0xC9DE ^ 0x4645;
        J.G[0x931C ^ 0x9232] = 0x1B2A ^ 0x9232;
        J.G[0x85B2 ^ 0x85C2] = 0xFFFF7A2D ^ 0x85C2;
        J.G[0xFD94 ^ 0xFCBF] = 0xFFFFD2F1 ^ 0xFCBF;
        J.G[0xF8F1 ^ 0xF9AC] = 0x1FEDB ^ 0xF9AC;
        J.G[0x9CFB ^ 0x9CA3] = 0xFFFF6370 ^ 0x9CA3;
        J.G[0xCA88 ^ 0xCBF2] = 0xFFFFD3C8 ^ 0xCBF2;
        J.G[0x109EC ^ 0x10953] = 0xFFFEF68F ^ 0x10953;
        J.G[0x3298 ^ 0x3233] = 0x322A ^ 0x3233;
        J.G[0xAB5D ^ 0xAA32] = 0xCE74 ^ 0xAA32;
        J.G[0x8E05 ^ 0x8F63] = 0x189B1 ^ 0x8F63;
        J.G[0xD1D3 ^ 0xD1F2] = 0xD1EC ^ 0xD1F2;
        J.G[0xC22C ^ 0xC2E1] = 0xFFFF3D14 ^ 0xC2E1;
        J.G[0x800F ^ 0x813D] = 0xFFFF116F ^ 0x813D;
        J.G[0x4AAB ^ 0x4A27] = 0xFFFFB592 ^ 0x4A27;
        J.G[0x20FA ^ 0x2075] = 0x206D ^ 0x2075;
        J.G[0x1D91 ^ 0x1D92] = 0xFFFFE219 ^ 0x1D92;
        J.G[0x6DD0 ^ 0x6DD0] = 0xFFFF920E ^ 0x6DD0;
        J.G[0x10320 ^ 0x1033F] = 0x10329 ^ 0x1033F;
        J.G[0x85EF ^ 0x84E0] = 0xB211 ^ 0x84E0;
        J.G[0xE5E0 ^ 0xE52B] = 0xE539 ^ 0xE52B;
        J.G[0x3CDF ^ 0x3CAE] = 0xFFFFC31A ^ 0x3CAE;
        J.G[0x9256 ^ 0x9309] = 0x1947E ^ 0x9309;
        J.G[0xA0E7 ^ 0xA04F] = 0xFFFF5FFF ^ 0xA04F;
        J.G[0xBB2F ^ 0xBA7C] = 0x68C6 ^ 0xBA7C;
        J.G[0x8A65 ^ 0x8AC2] = 0xFFFF7568 ^ 0x8AC2;
        J.G[0x4945 ^ 0x4981] = 0x4920 ^ 0x4981;
        J.G[0x42D ^ 0x55A] = 0xFBA3 ^ 0x55A;
        J.G[0x5245 ^ 0x52DF] = 0xFFFFAD09 ^ 0x52DF;
        J.G[0xCCB4 ^ 0xCC69] = 0xFFFF33F2 ^ 0xCC69;
        J.G[0xDD83 ^ 0xDCB7] = 0xFC5 ^ 0xDCB7;
        J.G[0x5149 ^ 0x51CD] = 0xB248 ^ 0x51CD;
        J.G[0xC2B3 ^ 0xC2C1] = 0xC29A ^ 0xC2C1;
        J.G[0xAB06 ^ 0xABC5] = 0xFFFF5427 ^ 0xABC5;
        J.G[0xC631 ^ 0xC65C] = 0xC60A ^ 0xC65C;
        J.G[0x10029 ^ 0x1014A] = 0x1E38C ^ 0x1014A;
        J.G[0xAC72 ^ 0xAD34] = 0x11C1 ^ 0xAD34;
        J.G[0xCD57 ^ 0xCDC2] = 0xFFFF326A ^ 0xCDC2;
        J.G[0xBDD8 ^ 0xBD1E] = 0xBD30 ^ 0xBD1E;
        J.G[0x5BD5 ^ 0x5BA3] = 0x5BA3 ^ 0x5BA3;
        J.G[0xAB8E ^ 0xABDF] = 0xFFFF5610 ^ 0xABDF;
        J.G[0xE279 ^ 0xE20C] = 0xE20F ^ 0xE20C;
        J.G[0xACB7 ^ 0xAC2F] = 0xFFFF53C0 ^ 0xAC2F;
        J.G[0x24B0 ^ 0x24ED] = 0xFFFFDBB0 ^ 0x24ED;
        J.G[0xBC20 ^ 0xBD3F] = 0xFFFF4570 ^ 0xBD3F;
        J.G[0x6171 ^ 0x617E] = 0xFFFF9ED0 ^ 0x617E;
        J.G[0x105E5 ^ 0x10502] = 0x10502 ^ 0x10502;
        J.G[0x609F ^ 0x60DB] = 0x6083 ^ 0x60DB;
        J.G[0x44A5 ^ 0x4497] = 0xFFFFBB65 ^ 0x4497;
        J.G[0x9146 ^ 0x9101] = 0x9176 ^ 0x9101;
        J.G[0x329 ^ 0x345] = 0xFFFFFCDB ^ 0x345;
        J.G[0x406E ^ 0x407B] = 0x40AA ^ 0x407B;
        J.G[0xF887 ^ 0xF9E7] = 0x1B34 ^ 0xF9E7;
        J.G[0xA4D7 ^ 0xA59D] = 0x3F52 ^ 0xA59D;
        J.G[0x51AB ^ 0x5196] = 0x51B0 ^ 0x5196;
        J.G[0x8F1B ^ 0x8E64] = 0x626A ^ 0x8E64;
        J.G[0x50F6 ^ 0x50CA] = 0xFFFFAF3A ^ 0x50CA;
        J.G[0xB41E ^ 0xB4DF] = 0xB494 ^ 0xB4DF;
        J.G[0x51DB ^ 0x50E0] = 0xD0E ^ 0x50E0;
        J.G[0x380F ^ 0x397B] = 0xC781 ^ 0x397B;
        J.G[0xCC0C ^ 0xCCD8] = 0xCCC8 ^ 0xCCD8;
        J.G[0x828D ^ 0x83DD] = 0x516E ^ 0x83DD;
        J.G[0xA2B4 ^ 0xA2AA] = 0xFFFF5D3B ^ 0xA2AA;
        J.G[0x727C ^ 0x734A] = 0xFFFF5F9B ^ 0x734A;
        J.G[0xDFFE ^ 0xDE8D] = 0xDA07 ^ 0xDE8D;
        J.G[0x12CD ^ 0x13DE] = 0xFFFF4926 ^ 0x13DE;
    }
}

