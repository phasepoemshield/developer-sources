/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_5498
 *  net.minecraft.class_746
 *  org.lwjgl.glfw.GLFW
 */
package kotakbaz.rain.module.modules.render;

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
import kotakbaz.rain.event.events.D;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.setting.settings.b_0;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_5498;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\"\u0010\u0010R\u0014\u0010$\u001a\u00020#8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u0010/R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010'R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010'\u00a8\u00061"}, d2={"Lkotakbaz/rain/module/modules/render/PerspectiveModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lkotakbaz/rain/event/events/KeyEvent;", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "", "isPerspectiveActive", "()Z", "", "cameraPitch", "()F", "cameraYaw", "", "mouseXDelta", "mouseYDelta", "rotateCamera", "(DD)V", "pitch", "yaw", "captureCamera", "(FF)V", "forceFirstPerson", "disablePerspective", "(Z)V", "resetState", "isBindPressedNow", "", "INPUT_MOUSE_OFFSET", "I", "MAX_CAMERA_PITCH", "F", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "perspectiveKey", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "holdMode", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "perspectiveActive", "Z", "held", "rain-visuals"})
public final class G
extends a_0 {
    @NotNull
    public static final G INSTANCE;
    private static final int a = 400;
    private static final float A = 90.0f;
    @NotNull
    private static final b_0 b;
    @NotNull
    private static final c B;
    private static boolean c;
    private static boolean C;
    private static float d;
    private static float D;
    private static Object[] e;
    private static Object f;
    private static Object[] F;
    private static Object[] E;
    private static Object[] g;
    public static int[] G;

    private G() {
        int n = G[0];
        n -= G[1];
        int n2 = G[3];
        n2 -= G[4];
        int n3 = G[6];
        n3 += G[7];
        super((String)e[n += G[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)e[n2 -= G[5]] + (String)e[n3 += G[8]]);
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.resetState();
    }

    @Override
    public void onDisable() {
        boolean bl = G[9];
        bl += G[10];
        this.disablePerspective(bl ^= G[11]);
        this.resetState();
        super.onDisable();
    }

    @Commando
    public final void onUpdate(@NotNull D d2) {
        long l = 7749117206856805779L;
        int n = G[12];
        n -= G[13];
        Intrinsics.checkNotNullParameter(d2, (String)e[n ^= G[14]]);
        class_746 class_7462 = kotakbaz.rain.client.extensions.b_0.getMc().field_1724;
        if (class_7462 == null) {
            G g2 = this;
            long l2 = l;
            int n2 = G[15];
            n2 += G[16];
            l = l2 ^ (0L ^ l2) & -1L << (n2 -= G[17]);
            boolean bl = G[18];
            bl += G[19];
            g2.disablePerspective(bl -= G[20]);
            return;
        }
        class_746 class_7463 = class_7462;
        if (((Boolean)B.getValue()).booleanValue() && (c = this.isBindPressedNow()) && !C) {
            int n3 = G[21];
            n3 += G[22];
            C = n3 ^= G[23];
            this.captureCamera(class_7463.method_36455(), class_7463.method_36454());
            kotakbaz.rain.client.extensions.b_0.getMc().field_1690.method_31043(class_5498.field_26665);
        }
        if (!c && C) {
            int n4 = G[24];
            n4 ^= G[25];
            C = n4 ^= G[26];
            kotakbaz.rain.client.extensions.b_0.getMc().field_1690.method_31043(class_5498.field_26664);
        }
        if (c && kotakbaz.rain.client.extensions.b_0.getMc().field_1690.method_31044() != class_5498.field_26665) {
            int n5 = G[27];
            n5 -= G[28];
            c = n5 ^= G[29];
        }
    }

    @Commando
    public final void onKey(@NotNull kotakbaz.rain.event.events.G g2) {
        int n;
        int n2;
        long l = 294517248123973240L;
        long l2 = -7699944280425424718L;
        long l3 = -6300550167398086308L;
        long l4 = -6759235193687036691L;
        long l5 = 3473306009627106951L;
        int n3 = G[30];
        n3 -= G[31];
        Intrinsics.checkNotNullParameter(g2, (String)e[n3 += G[32]]);
        class_746 class_7462 = kotakbaz.rain.client.extensions.b_0.getMc().field_1724;
        if (class_7462 == null) {
            return;
        }
        class_746 class_7463 = class_7462;
        if (kotakbaz.rain.client.extensions.b_0.getMc().field_1687 == null || ((Boolean)B.getValue()).booleanValue()) {
            return;
        }
        Integer n4 = g2.get(kotakbaz.rain.event.events.G.a.getBUTTON());
        if (n4 == null) {
            return;
        }
        int n5 = G[33];
        n5 -= G[34];
        long l6 = l4;
        int n6 = G[36];
        n6 += G[37];
        l4 = l6 ^ ((long)n4.intValue() << (n5 ^= G[35]) ^ l6) & -1L << (n6 ^= G[38]);
        boolean bl = G[39];
        bl -= G[40];
        bl ^= G[41];
        int n7 = G[42];
        n7 -= G[43];
        long l7 = l3;
        int n8 = G[45];
        n8 += G[46];
        l3 = l7 ^ ((long)Intrinsics.areEqual(g2.get(kotakbaz.rain.event.events.G.a.getMOUSE()), bl) << (n7 -= G[44]) ^ l7) & -1L << (n8 ^= G[47]);
        boolean bl2 = G[48];
        bl2 -= G[49];
        bl2 ^= G[50];
        int n9 = G[51];
        n9 += G[52];
        long l8 = l2;
        int n10 = G[54];
        n10 += G[55];
        l2 = l8 ^ ((long)Intrinsics.areEqual(g2.get(kotakbaz.rain.event.events.G.a.getRELEASE()), bl2) << (n9 += G[53]) ^ l8) & -1L << (n10 -= G[56]);
        int n11 = G[57];
        n11 -= G[58];
        if ((int)(l2 >>> (n11 += G[59])) != 0) {
            return;
        }
        int n12 = G[60];
        n12 ^= G[61];
        if ((int)(l3 >>> (n12 ^= G[62])) != 0) {
            int n13 = G[63];
            n13 ^= G[64];
            int n14 = G[66];
            n14 ^= G[67];
            n2 = (int)(l4 >>> (n13 -= G[65])) + (n14 -= G[68]);
        } else {
            int n15 = G[69];
            n15 += G[70];
            n2 = (int)(l4 >>> (n15 ^= G[71]));
        }
        int n16 = G[72];
        n16 ^= G[73];
        long l9 = l5;
        int n17 = G[75];
        n17 -= G[76];
        l5 = l9 ^ ((long)n2 << (n16 -= G[74]) ^ l9) & -1L << (n17 -= G[77]);
        int n18 = G[78];
        n18 ^= G[79];
        if ((int)(l5 >>> (n18 += G[80])) != ((Number)b.getValue()).intValue()) {
            return;
        }
        if (!c) {
            int n19 = G[81];
            n19 ^= G[82];
            n = n19 += G[83];
        } else {
            int n20 = G[84];
            n20 -= G[85];
            n = n20 += G[86];
        }
        c = n;
        this.captureCamera(class_7463.method_36455(), class_7463.method_36454());
        kotakbaz.rain.client.extensions.b_0.getMc().field_1690.method_31043(c ? class_5498.field_26665 : class_5498.field_26664);
    }

    public final boolean isPerspectiveActive() {
        int n;
        if (this.isEnabled() && c && kotakbaz.rain.client.extensions.b_0.getMc().field_1724 != null) {
            int n2 = G[87];
            n2 -= G[88];
            n = n2 += G[89];
        } else {
            int n3 = G[90];
            n3 += G[91];
            n = n3 += G[92];
        }
        return n != 0;
    }

    public final float cameraPitch() {
        return d;
    }

    public final float cameraYaw() {
        return D;
    }

    public final void rotateCamera(double d2, double d3) {
        if (!this.isPerspectiveActive()) {
            return;
        }
        D += (float)(d2 / Double.longBitsToDouble(0xB573D0126FB16E7EL ^ 0xF553D0126FB16E7EL));
        d += (float)(d3 / Double.longBitsToDouble(0x24D9FE445093C45FL ^ 0x64F9FE445093C45FL));
        d = RangesKt.coerceIn(d, -90.0f, 90.0f);
    }

    private final void captureCamera(float f2, float f3) {
        d = f2;
        D = f3;
    }

    private final void disablePerspective(boolean bl) {
        if (!c && !C) {
            return;
        }
        int n = G[93];
        n += G[94];
        c = n += G[95];
        int n2 = G[96];
        n2 += G[97];
        C = n2 += G[98];
        if (bl) {
            kotakbaz.rain.client.extensions.b_0.getMc().field_1690.method_31043(class_5498.field_26664);
        }
    }

    private final void resetState() {
        int n = G[99];
        n ^= G[100];
        c = n += G[101];
        int n2 = G[102];
        n2 ^= G[103];
        C = n2 += G[104];
        d = 0.0f;
        D = 0.0f;
    }

    private final boolean isBindPressedNow() {
        boolean bl;
        long l;
        long l2;
        block8: {
            boolean bl2;
            long l3;
            block10: {
                block9: {
                    long l4 = -7362972738081460992L;
                    long l5 = 1710843937332481991L;
                    long l6 = 6498950959899146448L;
                    l3 = 2757701130839303718L;
                    l2 = 701231956058369248L;
                    int n = G[105];
                    n ^= G[106];
                    long l7 = l2;
                    int n2 = G[108];
                    n2 ^= G[109];
                    l2 = l7 ^ ((long)((Number)b.getValue()).intValue() << (n -= G[107]) ^ l7) & -1L << (n2 += G[110]);
                    int n3 = G[111];
                    n3 += G[112];
                    if ((int)(l2 >>> (n3 += G[113])) <= 0) {
                        boolean bl3 = G[114];
                        bl3 ^= G[115];
                        return bl3 -= G[116];
                    }
                    l = kotakbaz.rain.client.extensions.b_0.getMc().method_22683().method_4490();
                    int n4 = G[117];
                    n4 += G[118];
                    int n5 = G[120];
                    n5 += G[121];
                    if ((int)(l2 >>> (n4 ^= G[119])) < (n5 ^= G[122])) break block8;
                    int n6 = G[123];
                    n6 += G[124];
                    n6 ^= G[125];
                    int n7 = G[126];
                    n7 ^= G[127];
                    n7 += G[128];
                    int n8 = G[129];
                    n8 -= G[130];
                    long l8 = l3;
                    int n9 = G[132];
                    n9 += G[133];
                    l3 = l8 ^ ((long)((int)(l2 >>> n6) - n7) << (n8 -= G[131]) ^ l8) & -1L << (n9 += G[134]);
                    int n10 = G[135];
                    n10 ^= G[136];
                    if ((int)(l3 >>> (n10 += G[137])) < 0) break block9;
                    int n11 = G[138];
                    n11 += G[139];
                    int n12 = G[141];
                    n12 += G[142];
                    if ((int)(l3 >>> (n11 -= G[140])) <= (n12 ^= G[143])) break block10;
                }
                boolean bl4 = G[144];
                bl4 += G[145];
                return bl4 -= G[146];
            }
            int n = G[147];
            n -= G[148];
            int n13 = G[150];
            n13 += G[151];
            if (GLFW.glfwGetMouseButton((long)l, (int)((int)(l3 >>> (n -= G[149])))) == (n13 += G[152])) {
                boolean bl5 = G[153];
                bl5 += G[154];
                bl2 = bl5 ^= G[155];
            } else {
                boolean bl6 = G[156];
                bl6 ^= G[157];
                bl2 = bl6 += G[158];
            }
            return bl2;
        }
        int n = G[159];
        n += G[160];
        int n14 = G[162];
        n14 += G[163];
        if (GLFW.glfwGetKey((long)l, (int)((int)(l2 >>> (n ^= G[161])))) == (n14 ^= G[164])) {
            boolean bl7 = G[165];
            bl7 ^= G[166];
            bl = bl7 ^= G[167];
        } else {
            boolean bl8 = G[168];
            bl8 += G[169];
            bl = bl8 ^= G[170];
        }
        return bl;
    }

    static {
        kotakbaz.rain.module.modules.render.G.b();
        long l = 585691409567809664L;
        long l2 = -6232936120094472951L;
        long l3 = 3445539657007273813L;
        long l4 = 3026224779740722794L;
        long l5 = -7653486640672642592L;
        long l6 = 2212817496186795164L;
        long l7 = 4601273391110121576L;
        long l8 = 8345192777496008234L;
        long l9 = -4306214453659570219L;
        long l10 = -3137887557989692352L;
        long l11 = 1518171789908896389L;
        long l12 = 8886092467843228065L;
        long l13 = 9081778804961520224L;
        long l14 = 3679377521598608606L;
        int n = G[171];
        n += G[172];
        e = new Object[n += G[173]];
        long l15 = l14;
        int n2 = G[174];
        n2 ^= G[175];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += G[176]);
        Object[] objectArray = new Object[G[177]];
        objectArray[kotakbaz.rain.module.modules.render.G.G[178]] = E;
        objectArray[kotakbaz.rain.module.modules.render.G.G[179]] = G[180];
        int n3 = G[181];
        Object object = kotakbaz.rain.module.modules.render.G.A()[G[182]];
        if (object == null) {
            char[] cArray = "\u7a1b\u7a4a\u79eb\u7a1c\u7a54\u7a26\u7a0f\u79ee\u7a18\u79ea\u7a41\u7a3b\u79ee\u7a4f\u7a4c\u7a19\u7a0b\u79ee\u7a23\u7a50\u7a3f\u7a12\u7a19\u7a03\u7a4c\u7a0b\u7a4d\u7a10\u79ef\u7a26\u7a0b\u7a18\u7a10\u7a03\u7a1f\u7a4e\u7a0b\u7a1c\u7a20\u7a25\u79ec\u7a19\u7a41\u7a1e\u79f6\u79ef\u7a65\u7a14\u7a51\u7a10\u79f2\u7a54\u79f9\u7a56\u7a05\u79f0\u7a11\u79ef\u7a15\u7a4b\u7a50\u7a13\u7a1f\u7a0b\u7a0c\u7a4c\u79eb\u7a46\u7a0f\u7a56\u7a46\u7a15\u7a4b\u7a0e\u7a65\u79f1\u7a0a\u7a4b\u7a65\u7a20\u7a0d\u7a65\u7a1c\u79f8\u7a0f\u79ec\u7a3a\u7a0a\u7a18\u79ec\u7a0c\u7a1c\u7a15\u7a4e\u7a46\u79ef\u7a14\u79ef\u79ef\u7a1a\u7a23\u7a3e\u7a0e\u7a20\u7a10\u7a25\u7a21\u7a4a\u7a0a\u7a12\u7a17\u7a1e\u7a25\u79eb\u7a41\u7a41\u7a1b\u79f5\u79f0\u7a1f\u79ee\u7a3e\u79f8\u7a4d\u7a3e\u7a56\u79f7\u7a14\u7a25\u79ec\u79ee\u79f2\u79f9\u7a50\u79ef\u79f3\u7a4b\u7a14\u79ec\u7a1b\u7a3f\u7a20\u7a4e\u7a56\u7a3c\u7a3e\u7a4a\u7a3e\u7a50\u7a3e\u79f0\u7a17\u7a3e\u7a0c\u7a23\u7a4d\u7a58\u7a3f\u7a25\u7a3e\u79eb\u7a4e\u79ee\u7a40\u79f4\u7a58\u7a13\u79ea\u7a3e\u7a46\u7a46\u7a41\u79f9\u79f6\u7a0a\u79ee\u7a0d\u7a0f\u7a14\u7a0a\u7a23\u7a15\u7a17\u7a4b\u7a20\u7a1a\u7a58\u7a58\u7a0a\u7a21\u79f0\u7a3e\u79f8\u7a21\u79ec\u7a0e\u7a3c\u7a1f\u7a26\u7a4a\u7a0f\u7a0f\u79f9\u7a17\u79f0\u7a1c\u7a15\u7a4e\u7a18\u79f2\u79ed\u79ed\u7a20\u7a4b\u7a1e\u7a1e\u7a4f\u79ee\u7a0e\u79ef\u79eb\u79eb\u7a3b\u7a0e\u7a23\u79f6\u7a14\u7a19\u7a4b\u7a05\u7a58\u79f1\u7a18\u79f5\u7a26\u7a62".toCharArray();
            for (int i2 = G[183]; i2 < G[184]; ++i2) {
                int n4 = cArray[i2];
                n4 += G[185];
                n4 -= G[186];
                n4 += G[187];
                n4 += G[188];
                n4 ^= G[189];
                n4 ^= G[190];
                n4 -= G[191];
                n4 -= G[192];
                n4 -= G[193];
                n4 -= G[194];
                n4 ^= G[195];
                n4 += G[196];
                n4 -= G[197];
                n4 += G[198];
                n4 += G[199];
                cArray[i2] = (char)(n4 ^= G[200]);
            }
            object = kotakbaz.rain.module.modules.render.G.A()[kotakbaz.rain.module.modules.render.G.G[201]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.module.modules.render.G.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = G[202];
        n5 += G[203];
        l5 = l16 ^ (0x5F00000000L ^ l16) & -1L << (n5 -= G[204]);
        long l17 = l12;
        int n6 = G[205];
        n6 += G[206];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= G[207]);
        while (true) {
            int n7 = G[208];
            n7 += G[209];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= G[210]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = G[211];
            n9 ^= G[212];
            int n10 = G[214];
            n10 -= G[215];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= G[213])) & -1L >>> (n10 += G[216]);
            long l19 = l8;
            int n11 = G[217];
            n11 -= G[218];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= G[219]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = G[220];
            n13 += G[221];
            int n14 = G[223];
            n14 += G[224];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= G[222])) & -1L >>> (n14 -= G[225]);
            int n15 = G[226];
            n15 ^= G[227];
            long l21 = l9;
            int n16 = G[229];
            n16 ^= G[230];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= G[228]) ^ l21) & -1L << (n16 -= G[231]);
            int n17 = G[232];
            n17 ^= G[233];
            n17 -= G[234];
            int n18 = G[235];
            n18 += G[236];
            long l22 = l11;
            int n19 = G[238];
            n19 += G[239];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= G[237]))) ^ l22) & -1L >>> (n19 -= G[240]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = G[241];
            n20 ^= G[242];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= G[243]);
            while (true) {
                int n21 = G[244];
                n21 ^= G[245];
                if ((int)(l13 >>> (n21 ^= G[246])) >= (int)l11) break;
                int n22 = G[247];
                n22 ^= G[248];
                int n23 = G[250];
                n23 -= G[251];
                cArray2[(int)(l13 >>> (n22 -= kotakbaz.rain.module.modules.render.G.G[249]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= G[252]))];
                l13 += 0x100000000L;
            }
            int n24 = G[253];
            n24 ^= G[254];
            int n25 = (int)(l14 >>> (n24 -= G[255]));
            l14 += 0x100000000L;
            kotakbaz.rain.module.modules.render.G.e[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = G[256];
            n26 -= G[257];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += G[258]);
        }
        INSTANCE = new G();
        int n27 = G[259];
        n27 += G[260];
        int n28 = G[262];
        n28 += G[263];
        b = INSTANCE.bind((String)e[n27 ^= G[261]], n28 -= G[264]);
        int n29 = G[265];
        n29 += G[266];
        int n30 = G[268];
        n30 -= G[269];
        boolean bl = G[271];
        bl += G[272];
        B = INSTANCE.boolean((String)e[n29 ^= G[267]] + (String)e[n30 ^= G[270]], bl -= G[273]);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[G[274]];
        String string = (String)object[G[275]];
        object = object[G[276]];
        Object[] objectArray = F;
        if (F == null) {
            objectArray = F = new Object[G[277]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[G[278]];
                E = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[G[280] ^ G[281]];
                byArray[kotakbaz.rain.module.modules.render.G.G[282] ^ kotakbaz.rain.module.modules.render.G.G[283]] = G[284] ^ G[285];
                byArray[kotakbaz.rain.module.modules.render.G.G[286] ^ kotakbaz.rain.module.modules.render.G.G[287]] = G[288] ^ G[289];
                byArray[kotakbaz.rain.module.modules.render.G.G[290] ^ kotakbaz.rain.module.modules.render.G.G[291]] = G[292] ^ G[293];
                byArray[kotakbaz.rain.module.modules.render.G.G[294] ^ kotakbaz.rain.module.modules.render.G.G[295]] = G[296] ^ G[297];
                byArray[kotakbaz.rain.module.modules.render.G.G[298] ^ kotakbaz.rain.module.modules.render.G.G[299]] = G[300] ^ G[301];
                byArray[kotakbaz.rain.module.modules.render.G.G[302] ^ kotakbaz.rain.module.modules.render.G.G[303]] = G[304] ^ G[305];
                byArray[kotakbaz.rain.module.modules.render.G.G[306] ^ kotakbaz.rain.module.modules.render.G.G[307]] = G[308] ^ G[309];
                byArray[kotakbaz.rain.module.modules.render.G.G[310] ^ kotakbaz.rain.module.modules.render.G.G[311]] = G[312] ^ G[313];
                byArray[kotakbaz.rain.module.modules.render.G.G[314] ^ kotakbaz.rain.module.modules.render.G.G[315]] = G[316] ^ G[317];
                byArray[kotakbaz.rain.module.modules.render.G.G[318] ^ kotakbaz.rain.module.modules.render.G.G[319]] = G[320] ^ G[321];
                byArray[kotakbaz.rain.module.modules.render.G.G[322] ^ kotakbaz.rain.module.modules.render.G.G[323]] = G[324] ^ G[325];
                byArray[kotakbaz.rain.module.modules.render.G.G[326] ^ kotakbaz.rain.module.modules.render.G.G[327]] = G[328] ^ G[329];
                byArray[kotakbaz.rain.module.modules.render.G.G[330] ^ kotakbaz.rain.module.modules.render.G.G[331]] = G[332] ^ G[333];
                byArray[kotakbaz.rain.module.modules.render.G.G[334] ^ kotakbaz.rain.module.modules.render.G.G[335]] = G[336] ^ G[337];
                byArray[kotakbaz.rain.module.modules.render.G.G[338] ^ kotakbaz.rain.module.modules.render.G.G[339]] = G[340] ^ G[341];
                byArray[kotakbaz.rain.module.modules.render.G.G[342] ^ kotakbaz.rain.module.modules.render.G.G[343]] = G[344] ^ G[345];
                objectArray2[kotakbaz.rain.module.modules.render.G.G[279]] = byArray;
            }
            byte[] byArray = (byte[])object3[G[346]];
            if (f == null) {
                byte[] byArray2 = new byte[G[347] ^ G[348]];
                byArray2[kotakbaz.rain.module.modules.render.G.G[349] ^ kotakbaz.rain.module.modules.render.G.G[350]] = G[351] ^ G[352];
                byArray2[kotakbaz.rain.module.modules.render.G.G[353] ^ kotakbaz.rain.module.modules.render.G.G[354]] = G[355] ^ G[356];
                byArray2[kotakbaz.rain.module.modules.render.G.G[357] ^ kotakbaz.rain.module.modules.render.G.G[358]] = G[359] ^ G[360];
                byArray2[kotakbaz.rain.module.modules.render.G.G[361] ^ kotakbaz.rain.module.modules.render.G.G[362]] = G[363] ^ G[364];
                byArray2[kotakbaz.rain.module.modules.render.G.G[365] ^ kotakbaz.rain.module.modules.render.G.G[366]] = G[367] ^ G[368];
                byArray2[kotakbaz.rain.module.modules.render.G.G[369] ^ kotakbaz.rain.module.modules.render.G.G[370]] = G[371] ^ G[372];
                byArray2[kotakbaz.rain.module.modules.render.G.G[373] ^ kotakbaz.rain.module.modules.render.G.G[374]] = G[375] ^ G[376];
                byArray2[kotakbaz.rain.module.modules.render.G.G[377] ^ kotakbaz.rain.module.modules.render.G.G[378]] = G[379] ^ G[380];
                byArray2[kotakbaz.rain.module.modules.render.G.G[381] ^ kotakbaz.rain.module.modules.render.G.G[382]] = G[383] ^ G[384];
                byArray2[kotakbaz.rain.module.modules.render.G.G[385] ^ kotakbaz.rain.module.modules.render.G.G[386]] = G[387] ^ G[388];
                byArray2[kotakbaz.rain.module.modules.render.G.G[389] ^ kotakbaz.rain.module.modules.render.G.G[390]] = G[391] ^ G[392];
                byArray2[kotakbaz.rain.module.modules.render.G.G[393] ^ kotakbaz.rain.module.modules.render.G.G[394]] = G[395] ^ G[396];
                byArray2[kotakbaz.rain.module.modules.render.G.G[397] ^ kotakbaz.rain.module.modules.render.G.G[398]] = G[399] ^ 0xDA04;
                byArray2[0x7BC3 ^ 0x7BC8] = 0xFFFF8401 ^ 0x7BC8;
                byArray2[0x78C0 ^ 0x78C1] = 0xFFFF8761 ^ 0x78C1;
                byArray2[0x11F4 ^ 0x11FC] = 0xFFFFEE5B ^ 0x11FC;
                byArray2[0xE4A8 ^ 0xE4AC] = 0xE4D4 ^ 0xE4AC;
                byArray2[0xF5D2 ^ 0xF5CE] = 0xF5F1 ^ 0xF5CE;
                byArray2[0x10984 ^ 0x1099A] = 0xFFFEF672 ^ 0x1099A;
                byArray2[0x7BFB ^ 0x7BE4] = 0x7B9C ^ 0x7BE4;
                byArray2[0xF44C ^ 0xF44A] = 0xFFFF0BDA ^ 0xF44A;
                byArray2[0xB48 ^ 0xB4D] = 0xFFFFF48F ^ 0xB4D;
                byArray2[0xC04A ^ 0xC059] = 0xC01F ^ 0xC059;
                byArray2[0x75EF ^ 0x75E0] = 0xFFFF8A0A ^ 0x75E0;
                byArray2[0x70AD ^ 0x70A3] = 0x70B9 ^ 0x70A3;
                byArray2[0x493C ^ 0x4929] = 0xFFFFB680 ^ 0x4929;
                byArray2[0xC17E ^ 0xC174] = 0xFFFF3E81 ^ 0xC174;
                byArray2[0x9155 ^ 0x9145] = 0xFFFF6E86 ^ 0x9145;
                byArray2[0x302D ^ 0x302E] = 0x3041 ^ 0x302E;
                byArray2[0x407 ^ 0x41D] = 0xFFFFFBD5 ^ 0x41D;
                byArray2[0x3815 ^ 0x3807] = 0xFFFFC79D ^ 0x3807;
                byArray2[0xC3D9 ^ 0xC3DB] = 0xC384 ^ 0xC3DB;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.module.modules.render.G.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u4e6d\u4e63\u4e68\u4e59\u4e5f\u4e53\u4e6c\u4e6a\u4e09\u4e65\u4e45\u4e06\u4e02\u4e00\u4e70\u4e45\u4e62\u4e52".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 ^= 0xC202;
                        n2 += 31043;
                        n2 ^= 0x51C4;
                        n2 += 20165;
                        n2 -= 39207;
                        n2 += 13994;
                        n2 ^= 0x918B;
                        n2 -= 32749;
                        n2 -= 14063;
                        n2 ^= 0x8170;
                        n2 -= 9168;
                        n2 += 40626;
                        n2 -= 60025;
                        n2 += 48921;
                        cArray[i2] = (char)(n2 ^= 0xEAFB);
                    }
                    object4 = kotakbaz.rain.module.modules.render.G.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[10] = -5;
                byArray4[9] = -52;
                byArray4[2] = -111;
                byArray4[0] = 110;
                byArray4[8] = 96;
                byArray4[14] = -68;
                byArray4[4] = -70;
                byArray4[11] = -53;
                byArray4[12] = -126;
                byArray4[6] = -21;
                byArray4[5] = -118;
                byArray4[3] = -16;
                byArray4[1] = 93;
                byArray4[15] = 36;
                byArray4[7] = -34;
                byArray4[13] = 123;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 2, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.module.modules.render.G.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u46f7\u963b\u968d".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 -= 30672;
                        n3 += 26832;
                        n3 += 41185;
                        n3 ^= 0x4956;
                        n3 ^= 0x6E08;
                        n3 += 45096;
                        n3 -= 51563;
                        n3 += 60843;
                        n3 -= 17355;
                        n3 ^= 0xE7DC;
                        n3 -= 23580;
                        cArray[i3] = (char)(n3 += 58462);
                    }
                    object5 = kotakbaz.rain.module.modules.render.G.A()[2] = new String(cArray);
                }
                f = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.module.modules.render.G.A()[3];
            if (object6 == null) {
                char[] cArray = "\uc3b8\uc3bc\ud36a\uc3a6\uc3ba\uc3b9\uc3ba\uc3a6\uc347\uc342\uc3ba\ud36a\uc34c\uc347\ud358\ud35b\ud35b\ud360\ud365\ud35e".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 += 43730;
                    n4 += 54005;
                    n4 -= 53767;
                    n4 ^= 0xADB8;
                    n4 += 42328;
                    n4 ^= 0x7E8;
                    n4 -= 23480;
                    n4 -= 50392;
                    n4 += 7964;
                    n4 -= 2830;
                    n4 -= 53966;
                    cArray[i4] = (char)(n4 -= 36959);
                }
                object6 = kotakbaz.rain.module.modules.render.G.A()[3] = new String(cArray);
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
        G = new int[0x684B ^ 0x69DB];
        kotakbaz.rain.module.modules.render.G.G[0x643B ^ 0x64DF] = 0xFFFF9B34 ^ 0x64DF;
        kotakbaz.rain.module.modules.render.G.G[0x2A5E ^ 0x2A94] = 0x2A01 ^ 0x2A94;
        kotakbaz.rain.module.modules.render.G.G[0x3A30 ^ 0x3BB3] = 0x7F7 ^ 0x3BB3;
        kotakbaz.rain.module.modules.render.G.G[0x9AED ^ 0x9A26] = 0xFFFF659F ^ 0x9A26;
        kotakbaz.rain.module.modules.render.G.G[0x7673 ^ 0x7646] = 0x760C ^ 0x7646;
        kotakbaz.rain.module.modules.render.G.G[0x4ECD ^ 0x4EB7] = 0x4E90 ^ 0x4EB7;
        kotakbaz.rain.module.modules.render.G.G[0x8E18 ^ 0x8F6D] = 0x96CD ^ 0x8F6D;
        kotakbaz.rain.module.modules.render.G.G[0x9FD3 ^ 0x9E88] = 0x58AE ^ 0x9E88;
        kotakbaz.rain.module.modules.render.G.G[0xECAC ^ 0xEC03] = 0xEC11 ^ 0xEC03;
        kotakbaz.rain.module.modules.render.G.G[0xADCA ^ 0xACF2] = 0x1AB38 ^ 0xACF2;
        kotakbaz.rain.module.modules.render.G.G[0x56C ^ 0x552] = 0xFFFFFAF3 ^ 0x552;
        kotakbaz.rain.module.modules.render.G.G[0x4E66 ^ 0x4E49] = 0x4E71 ^ 0x4E49;
        kotakbaz.rain.module.modules.render.G.G[0xA931 ^ 0xA83F] = 0xFFFF57FD ^ 0xA83F;
        kotakbaz.rain.module.modules.render.G.G[0x303E ^ 0x3073] = 0xFFFFCF81 ^ 0x3073;
        kotakbaz.rain.module.modules.render.G.G[0xB25D ^ 0xB2CD] = 0xFFFF4D33 ^ 0xB2CD;
        kotakbaz.rain.module.modules.render.G.G[0x3332 ^ 0x33D7] = 0x33EB ^ 0x33D7;
        kotakbaz.rain.module.modules.render.G.G[0xF7ED ^ 0xF6EB] = 0xF63B ^ 0xF6EB;
        kotakbaz.rain.module.modules.render.G.G[0xEE55 ^ 0xEEA6] = 0xFFFF1117 ^ 0xEEA6;
        kotakbaz.rain.module.modules.render.G.G[0xB4EE ^ 0xB4D6] = 0xB4BE ^ 0xB4D6;
        kotakbaz.rain.module.modules.render.G.G[0xDAB9 ^ 0xDB3E] = 0x42D5 ^ 0xDB3E;
        kotakbaz.rain.module.modules.render.G.G[0x10700 ^ 0x107B3] = 0x107B2 ^ 0x107B3;
        kotakbaz.rain.module.modules.render.G.G[0x5767 ^ 0x57C0] = 0x57E6 ^ 0x57C0;
        kotakbaz.rain.module.modules.render.G.G[0x681B ^ 0x68F0] = 0xFFFF9779 ^ 0x68F0;
        kotakbaz.rain.module.modules.render.G.G[0xF52C ^ 0xF5B7] = 0xF58E ^ 0xF5B7;
        kotakbaz.rain.module.modules.render.G.G[0xF328 ^ 0xF30E] = 0xF375 ^ 0xF30E;
        kotakbaz.rain.module.modules.render.G.G[0xC58B ^ 0xC518] = 0xC511 ^ 0xC518;
        kotakbaz.rain.module.modules.render.G.G[0x2F51 ^ 0x2FA6] = 0xFFFFD03C ^ 0x2FA6;
        kotakbaz.rain.module.modules.render.G.G[0x5DA7 ^ 0x5C8B] = 0xFA85 ^ 0x5C8B;
        kotakbaz.rain.module.modules.render.G.G[0xCAB2 ^ 0xCBB9] = 0xCBA1 ^ 0xCBB9;
        kotakbaz.rain.module.modules.render.G.G[0x7F32 ^ 0x7F17] = 0x7F57 ^ 0x7F17;
        kotakbaz.rain.module.modules.render.G.G[0x341 ^ 0x325] = 0xFFFFFCAD ^ 0x325;
        kotakbaz.rain.module.modules.render.G.G[0xDF6A ^ 0xDE30] = 0xDE30 ^ 0xDE30;
        kotakbaz.rain.module.modules.render.G.G[0x238C ^ 0x22F8] = 0x71BF ^ 0x22F8;
        kotakbaz.rain.module.modules.render.G.G[0xF378 ^ 0xF3EF] = 0xFFFF0C35 ^ 0xF3EF;
        kotakbaz.rain.module.modules.render.G.G[0x83DA ^ 0x8343] = 0x8366 ^ 0x8343;
        kotakbaz.rain.module.modules.render.G.G[0x8602 ^ 0x8649] = 0x8631 ^ 0x8649;
        kotakbaz.rain.module.modules.render.G.G[0x198E ^ 0x194A] = 0x553C ^ 0x194A;
        kotakbaz.rain.module.modules.render.G.G[0x9311 ^ 0x9257] = 0x2BB2 ^ 0x9257;
        kotakbaz.rain.module.modules.render.G.G[0xA538 ^ 0xA596] = 0xA5F0 ^ 0xA596;
        kotakbaz.rain.module.modules.render.G.G[0x9DFD ^ 0x9D8A] = 0xFFFF6240 ^ 0x9D8A;
        kotakbaz.rain.module.modules.render.G.G[0xB7CA ^ 0xB7AD] = 0xFFFF4837 ^ 0xB7AD;
        kotakbaz.rain.module.modules.render.G.G[0x302D ^ 0x3064] = 0x3053 ^ 0x3064;
        kotakbaz.rain.module.modules.render.G.G[0x3659 ^ 0x3717] = 0xEA6F ^ 0x3717;
        kotakbaz.rain.module.modules.render.G.G[0xA799 ^ 0xA745] = 0xA76A ^ 0xA745;
        kotakbaz.rain.module.modules.render.G.G[0x872B ^ 0x8664] = 0x5B1B ^ 0x8664;
        kotakbaz.rain.module.modules.render.G.G[0x73CA ^ 0x73AA] = 0x73B2 ^ 0x73AA;
        kotakbaz.rain.module.modules.render.G.G[0x2A44 ^ 0x2A94] = 0x2A9C ^ 0x2A94;
        kotakbaz.rain.module.modules.render.G.G[0xFF7 ^ 0xE93] = 0x2D81 ^ 0xE93;
        kotakbaz.rain.module.modules.render.G.G[0x2506 ^ 0x2457] = 0xF928 ^ 0x2457;
        kotakbaz.rain.module.modules.render.G.G[0xC531 ^ 0xC423] = 0xC422 ^ 0xC423;
        kotakbaz.rain.module.modules.render.G.G[0xB0AE ^ 0xB1B3] = 0x95E7 ^ 0xB1B3;
        kotakbaz.rain.module.modules.render.G.G[0x1577 ^ 0x15FE] = 0xFFFFEA1B ^ 0x15FE;
        kotakbaz.rain.module.modules.render.G.G[0x293C ^ 0x287C] = 0xFFFF23AB ^ 0x287C;
        kotakbaz.rain.module.modules.render.G.G[0xAD95 ^ 0xACB7] = 0x2538 ^ 0xACB7;
        kotakbaz.rain.module.modules.render.G.G[0x47EC ^ 0x4690] = 0x7495 ^ 0x4690;
        kotakbaz.rain.module.modules.render.G.G[0x374D ^ 0x371A] = 0xFFFFC830 ^ 0x371A;
        kotakbaz.rain.module.modules.render.G.G[0x387A ^ 0x381C] = 0x3840 ^ 0x381C;
        kotakbaz.rain.module.modules.render.G.G[0x7A7A ^ 0x7A4C] = 0x7A0B ^ 0x7A4C;
        kotakbaz.rain.module.modules.render.G.G[0x9469 ^ 0x940C] = 0x9440 ^ 0x940C;
        kotakbaz.rain.module.modules.render.G.G[0x500F ^ 0x5049] = 0xFFFFAF84 ^ 0x5049;
        kotakbaz.rain.module.modules.render.G.G[0x369A ^ 0x365F] = 0x2DA9 ^ 0x365F;
        kotakbaz.rain.module.modules.render.G.G[0x3810 ^ 0x3897] = 0x38E4 ^ 0x3897;
        kotakbaz.rain.module.modules.render.G.G[0x98A9 ^ 0x9826] = 0xFFFF6788 ^ 0x9826;
        kotakbaz.rain.module.modules.render.G.G[0x5C89 ^ 0x5DCB] = 0xC811 ^ 0x5DCB;
        kotakbaz.rain.module.modules.render.G.G[0x44D3 ^ 0x44DD] = 0x44F1 ^ 0x44DD;
        kotakbaz.rain.module.modules.render.G.G[0x9A56 ^ 0x9A89] = 0x9AFD ^ 0x9A89;
        kotakbaz.rain.module.modules.render.G.G[0xCEA1 ^ 0xCE11] = 0xFFFF31BD ^ 0xCE11;
        kotakbaz.rain.module.modules.render.G.G[0x6E36 ^ 0x6ED9] = 0x6E9A ^ 0x6ED9;
        kotakbaz.rain.module.modules.render.G.G[0xC2DD ^ 0xC2FD] = 0xFFFF3D4E ^ 0xC2FD;
        kotakbaz.rain.module.modules.render.G.G[0x6299 ^ 0x62D6] = 0x62B6 ^ 0x62D6;
        kotakbaz.rain.module.modules.render.G.G[0xC0E2 ^ 0xC02A] = 0x1D74 ^ 0xC02A;
        kotakbaz.rain.module.modules.render.G.G[0xBF65 ^ 0xBE1F] = 0x8C1A ^ 0xBE1F;
        kotakbaz.rain.module.modules.render.G.G[0x2E08 ^ 0x2E04] = 0x2E36 ^ 0x2E04;
        kotakbaz.rain.module.modules.render.G.G[0xD706 ^ 0xD630] = 0x1D191 ^ 0xD630;
        kotakbaz.rain.module.modules.render.G.G[0xFCE4 ^ 0xFCC8] = 0xFCD7 ^ 0xFCC8;
        kotakbaz.rain.module.modules.render.G.G[0xBB2 ^ 0xB0A] = 0xBE6 ^ 0xB0A;
        kotakbaz.rain.module.modules.render.G.G[0x102EE ^ 0x1027B] = 0xFFFEFDAE ^ 0x1027B;
        kotakbaz.rain.module.modules.render.G.G[0x616C ^ 0x61C8] = 0xFFFF9E7E ^ 0x61C8;
        kotakbaz.rain.module.modules.render.G.G[0x276E ^ 0x27AF] = 0x15FE ^ 0x27AF;
        kotakbaz.rain.module.modules.render.G.G[0x8908 ^ 0x8960] = 0x895A ^ 0x8960;
        kotakbaz.rain.module.modules.render.G.G[0x278F ^ 0x27A8] = 0xFFFFD81E ^ 0x27A8;
        kotakbaz.rain.module.modules.render.G.G[0xD233 ^ 0xD31E] = 0x750E ^ 0xD31E;
        kotakbaz.rain.module.modules.render.G.G[0x5245 ^ 0x53C5] = 0xF2E4 ^ 0x53C5;
        kotakbaz.rain.module.modules.render.G.G[0x288 ^ 0x3BF] = 0x10411 ^ 0x3BF;
        kotakbaz.rain.module.modules.render.G.G[0x30CC ^ 0x30ED] = 0xFFFFCF89 ^ 0x30ED;
        kotakbaz.rain.module.modules.render.G.G[0xFAC3 ^ 0xFB4C] = 0xFFFFDEE8 ^ 0xFB4C;
        kotakbaz.rain.module.modules.render.G.G[0x87C3 ^ 0x86C0] = 0x8652 ^ 0x86C0;
        kotakbaz.rain.module.modules.render.G.G[0xB9FC ^ 0xB8E8] = 0xB8E8 ^ 0xB8E8;
        kotakbaz.rain.module.modules.render.G.G[0x8B48 ^ 0x8B7A] = 0x8B4D ^ 0x8B7A;
        kotakbaz.rain.module.modules.render.G.G[0x10002 ^ 0x1003B] = 0xFFFEFFF6 ^ 0x1003B;
        kotakbaz.rain.module.modules.render.G.G[0xEA0 ^ 0xEF2] = 0xFFFFF12D ^ 0xEF2;
        kotakbaz.rain.module.modules.render.G.G[0x4980 ^ 0x489F] = 0x1176 ^ 0x489F;
        kotakbaz.rain.module.modules.render.G.G[0x2660 ^ 0x264A] = 0x2636 ^ 0x264A;
        kotakbaz.rain.module.modules.render.G.G[0xE91C ^ 0xE9FE] = 0xE994 ^ 0xE9FE;
        kotakbaz.rain.module.modules.render.G.G[0x77E7 ^ 0x76A6] = 0x82CD ^ 0x76A6;
        kotakbaz.rain.module.modules.render.G.G[0xF734 ^ 0xF788] = 0x7A65 ^ 0xF788;
        kotakbaz.rain.module.modules.render.G.G[0x8A6E ^ 0x8AC5] = 0xFFFF750F ^ 0x8AC5;
        kotakbaz.rain.module.modules.render.G.G[0x8EC5 ^ 0x8E07] = 0xF095 ^ 0x8E07;
        kotakbaz.rain.module.modules.render.G.G[0xBF90 ^ 0xBF47] = 0xFFFF4083 ^ 0xBF47;
        kotakbaz.rain.module.modules.render.G.G[0x1F01 ^ 0x1FD2] = 0x1FA1 ^ 0x1FD2;
        kotakbaz.rain.module.modules.render.G.G[0x208F ^ 0x205D] = 0x2023 ^ 0x205D;
        kotakbaz.rain.module.modules.render.G.G[0x1D ^ 0x144] = 0xBE3D ^ 0x144;
        kotakbaz.rain.module.modules.render.G.G[0xB5A7 ^ 0xB4AB] = 0xFFFF4B0C ^ 0xB4AB;
        kotakbaz.rain.module.modules.render.G.G[0x5877 ^ 0x59FB] = 0x5883 ^ 0x59FB;
        kotakbaz.rain.module.modules.render.G.G[0xDA52 ^ 0xDA2A] = 0xDBAF ^ 0xDA2A;
        kotakbaz.rain.module.modules.render.G.G[0x36FA ^ 0x37E4] = 0x6E0E ^ 0x37E4;
        kotakbaz.rain.module.modules.render.G.G[0xF8BB ^ 0xF9C8] = 0xFFFF555F ^ 0xF9C8;
        kotakbaz.rain.module.modules.render.G.G[0x5D12 ^ 0x5C37] = 0xD5B9 ^ 0x5C37;
        kotakbaz.rain.module.modules.render.G.G[0x100DB ^ 0x1003B] = 0xFFFEFFF2 ^ 0x1003B;
        kotakbaz.rain.module.modules.render.G.G[0x4A00 ^ 0x4A0B] = 0xFFFFB5FE ^ 0x4A0B;
        kotakbaz.rain.module.modules.render.G.G[0x99DE ^ 0x98EE] = 0x79AB ^ 0x98EE;
        kotakbaz.rain.module.modules.render.G.G[0xED1E ^ 0xEC11] = 0xEC39 ^ 0xEC11;
        kotakbaz.rain.module.modules.render.G.G[0xD10D ^ 0xD01B] = 0xD01A ^ 0xD01B;
        kotakbaz.rain.module.modules.render.G.G[0xB345 ^ 0xB256] = 0xB254 ^ 0xB256;
        kotakbaz.rain.module.modules.render.G.G[0x624E ^ 0x6221] = 0xFFFF9D82 ^ 0x6221;
        kotakbaz.rain.module.modules.render.G.G[0x1BC8 ^ 0x1B76] = 0xBB78 ^ 0x1B76;
        kotakbaz.rain.module.modules.render.G.G[0x6665 ^ 0x6779] = 0x436E ^ 0x6779;
        kotakbaz.rain.module.modules.render.G.G[0x3177 ^ 0x3167] = 0xFFFFCE90 ^ 0x3167;
        kotakbaz.rain.module.modules.render.G.G[0xABD7 ^ 0xAB88] = 0xFFFF545D ^ 0xAB88;
        kotakbaz.rain.module.modules.render.G.G[0xBCF5 ^ 0xBD98] = 0x44C4 ^ 0xBD98;
        kotakbaz.rain.module.modules.render.G.G[0x61B6 ^ 0x61AB] = 0xFFFF9E23 ^ 0x61AB;
        kotakbaz.rain.module.modules.render.G.G[0x317A ^ 0x3190] = 0x3187 ^ 0x3190;
        kotakbaz.rain.module.modules.render.G.G[0x7AC1 ^ 0x7A68] = 0xFFFF85DA ^ 0x7A68;
        kotakbaz.rain.module.modules.render.G.G[0x4DB ^ 0x4A8] = 0x4DA ^ 0x4A8;
        kotakbaz.rain.module.modules.render.G.G[0xF587 ^ 0xF4B3] = 0x93FA ^ 0xF4B3;
        kotakbaz.rain.module.modules.render.G.G[0xF282 ^ 0xF2D1] = 0xF2BC ^ 0xF2D1;
        kotakbaz.rain.module.modules.render.G.G[0x101AE ^ 0x101D2] = 0xFFFEFE1B ^ 0x101D2;
        kotakbaz.rain.module.modules.render.G.G[0x8B78 ^ 0x8BD2] = 0x8BFD ^ 0x8BD2;
        kotakbaz.rain.module.modules.render.G.G[0x1122 ^ 0x11A1] = 0xFFFFEE56 ^ 0x11A1;
        kotakbaz.rain.module.modules.render.G.G[0x2E42 ^ 0x2F2B] = 0x1EC1 ^ 0x2F2B;
        kotakbaz.rain.module.modules.render.G.G[0xC9C5 ^ 0xC847] = 0xF448 ^ 0xC847;
        kotakbaz.rain.module.modules.render.G.G[0xE99B ^ 0xE880] = 0xCCD4 ^ 0xE880;
        kotakbaz.rain.module.modules.render.G.G[0x1B2A ^ 0x1B97] = 0x7979 ^ 0x1B97;
        kotakbaz.rain.module.modules.render.G.G[0xD5CD ^ 0xD4B5] = 0xCD18 ^ 0xD4B5;
        kotakbaz.rain.module.modules.render.G.G[0xCC13 ^ 0xCC22] = 0xFFFF33CC ^ 0xCC22;
        kotakbaz.rain.module.modules.render.G.G[0x64C0 ^ 0x6593] = 0xC62A ^ 0x6593;
        kotakbaz.rain.module.modules.render.G.G[0xCD16 ^ 0xCDB6] = 0xCDDE ^ 0xCDB6;
        kotakbaz.rain.module.modules.render.G.G[0x9646 ^ 0x9720] = 0xB6FB ^ 0x9720;
        kotakbaz.rain.module.modules.render.G.G[0x1651 ^ 0x1678] = 0xFFFFE9C0 ^ 0x1678;
        kotakbaz.rain.module.modules.render.G.G[0x8D4B ^ 0x8DF4] = 0x437B ^ 0x8DF4;
        kotakbaz.rain.module.modules.render.G.G[0x102B4 ^ 0x10222] = 0x102A5 ^ 0x10222;
        kotakbaz.rain.module.modules.render.G.G[0x101C1 ^ 0x100A1] = 0x1869E ^ 0x100A1;
        kotakbaz.rain.module.modules.render.G.G[0xE76E ^ 0xE64A] = 0x6F98 ^ 0xE64A;
        kotakbaz.rain.module.modules.render.G.G[0x3ABD ^ 0x3B84] = 0x13C2A ^ 0x3B84;
        kotakbaz.rain.module.modules.render.G.G[0xD2F ^ 0xC05] = 0xAA1F ^ 0xC05;
        kotakbaz.rain.module.modules.render.G.G[0x7404 ^ 0x7556] = 0xD6EB ^ 0x7556;
        kotakbaz.rain.module.modules.render.G.G[0x8F70 ^ 0x8FF6] = 0x8F9A ^ 0x8FF6;
        kotakbaz.rain.module.modules.render.G.G[0x1D72 ^ 0x1DEC] = 0x1DFA ^ 0x1DEC;
        kotakbaz.rain.module.modules.render.G.G[0x617 ^ 0x618] = 0xFFFFF9E7 ^ 0x618;
        kotakbaz.rain.module.modules.render.G.G[0x6EB7 ^ 0x6EC1] = 0x6EE1 ^ 0x6EC1;
        kotakbaz.rain.module.modules.render.G.G[0x28B1 ^ 0x28A7] = 0xFFFFD72D ^ 0x28A7;
        kotakbaz.rain.module.modules.render.G.G[0x3AE4 ^ 0x3A90] = 0xFFFFC547 ^ 0x3A90;
        kotakbaz.rain.module.modules.render.G.G[0xC8F0 ^ 0xC83E] = 0xC84E ^ 0xC83E;
        kotakbaz.rain.module.modules.render.G.G[0x2983 ^ 0x29F1] = 0xFFFFD654 ^ 0x29F1;
        kotakbaz.rain.module.modules.render.G.G[0x1EE5 ^ 0x1FB2] = 0xA0CB ^ 0x1FB2;
        kotakbaz.rain.module.modules.render.G.G[0x3620 ^ 0x3735] = 0x3734 ^ 0x3735;
        kotakbaz.rain.module.modules.render.G.G[0xD79A ^ 0xD6B4] = 0x379C ^ 0xD6B4;
        kotakbaz.rain.module.modules.render.G.G[0x8D5E ^ 0x8C3F] = 0xAF24 ^ 0x8C3F;
        kotakbaz.rain.module.modules.render.G.G[0xBC28 ^ 0xBD6C] = 0x2886 ^ 0xBD6C;
        kotakbaz.rain.module.modules.render.G.G[0x33BC ^ 0x328F] = 0x55EA ^ 0x328F;
        kotakbaz.rain.module.modules.render.G.G[0x1071E ^ 0x10648] = 0x1B939 ^ 0x10648;
        kotakbaz.rain.module.modules.render.G.G[0xC90F ^ 0xC943] = 0xC925 ^ 0xC943;
        kotakbaz.rain.module.modules.render.G.G[0xA4CC ^ 0xA4C1] = 0xA4C5 ^ 0xA4C1;
        kotakbaz.rain.module.modules.render.G.G[0x1BB1 ^ 0x1B56] = 0x1B5C ^ 0x1B56;
        kotakbaz.rain.module.modules.render.G.G[0x9C6B ^ 0x9DE5] = 0x47E1 ^ 0x9DE5;
        kotakbaz.rain.module.modules.render.G.G[0x1870 ^ 0x1953] = 0x90DD ^ 0x1953;
        kotakbaz.rain.module.modules.render.G.G[0x1EF7 ^ 0x1EA3] = 0x1EF7 ^ 0x1EA3;
        kotakbaz.rain.module.modules.render.G.G[0x3964 ^ 0x39D6] = 0x39D6 ^ 0x39D6;
        kotakbaz.rain.module.modules.render.G.G[0x611B ^ 0x61A0] = 0xCA0B ^ 0x61A0;
        kotakbaz.rain.module.modules.render.G.G[0x1032C ^ 0x10396] = 0x1D811 ^ 0x10396;
        kotakbaz.rain.module.modules.render.G.G[0x2EAD ^ 0x2F9F] = 0x48F4 ^ 0x2F9F;
        kotakbaz.rain.module.modules.render.G.G[0xE448 ^ 0xE4E0] = 0xE49D ^ 0xE4E0;
        kotakbaz.rain.module.modules.render.G.G[0xA2B6 ^ 0xA2A2] = 0xA2EC ^ 0xA2A2;
        kotakbaz.rain.module.modules.render.G.G[0xD0C1 ^ 0xD055] = 0xD041 ^ 0xD055;
        kotakbaz.rain.module.modules.render.G.G[0x7972 ^ 0x79FA] = 0x79B2 ^ 0x79FA;
        kotakbaz.rain.module.modules.render.G.G[0x99BB ^ 0x99B2] = 0x99EA ^ 0x99B2;
        kotakbaz.rain.module.modules.render.G.G[0x10EDF ^ 0x10E6A] = 0x10E68 ^ 0x10E6A;
        kotakbaz.rain.module.modules.render.G.G[0x4B8F ^ 0x4B67] = 0x4B64 ^ 0x4B67;
        kotakbaz.rain.module.modules.render.G.G[0x596 ^ 0x4DA] = 0x5BD3 ^ 0x4DA;
        kotakbaz.rain.module.modules.render.G.G[0x8DA5 ^ 0x8CA5] = 0x8CD4 ^ 0x8CA5;
        kotakbaz.rain.module.modules.render.G.G[0xDB71 ^ 0xDB3B] = 0xFFFF24B9 ^ 0xDB3B;
        kotakbaz.rain.module.modules.render.G.G[0x6AA ^ 0x783] = 0xCD44 ^ 0x783;
        kotakbaz.rain.module.modules.render.G.G[0xA9BF ^ 0xA8C1] = 0x9E0 ^ 0xA8C1;
        kotakbaz.rain.module.modules.render.G.G[0x41CA ^ 0x41B4] = 0xFFFFBF86 ^ 0x41B4;
        kotakbaz.rain.module.modules.render.G.G[0xE0F2 ^ 0xE17F] = 0x3B77 ^ 0xE17F;
        kotakbaz.rain.module.modules.render.G.G[0x8894 ^ 0x889E] = 0xFFFF7702 ^ 0x889E;
        kotakbaz.rain.module.modules.render.G.G[0x5A66 ^ 0x5AEA] = 0x5AFF ^ 0x5AEA;
        kotakbaz.rain.module.modules.render.G.G[0xD457 ^ 0xD45F] = 0xD441 ^ 0xD45F;
        kotakbaz.rain.module.modules.render.G.G[0xD565 ^ 0xD5A6] = 0x8552 ^ 0xD5A6;
        kotakbaz.rain.module.modules.render.G.G[0xD355 ^ 0xD3D1] = 0xFFFF2C1E ^ 0xD3D1;
        kotakbaz.rain.module.modules.render.G.G[0x372B ^ 0x3714] = 0xFFFFC8AC ^ 0x3714;
        kotakbaz.rain.module.modules.render.G.G[0x7F36 ^ 0x7F01] = 0x7F40 ^ 0x7F01;
        kotakbaz.rain.module.modules.render.G.G[0xD266 ^ 0xD33E] = 0xFFFF9380 ^ 0xD33E;
        kotakbaz.rain.module.modules.render.G.G[0xFCD2 ^ 0xFC0C] = 0xFC22 ^ 0xFC0C;
        kotakbaz.rain.module.modules.render.G.G[0xD429 ^ 0xD428] = 0xD429 ^ 0xD428;
        kotakbaz.rain.module.modules.render.G.G[0x10637 ^ 0x10754] = 0x12428 ^ 0x10754;
        kotakbaz.rain.module.modules.render.G.G[0x5039 ^ 0x50A1] = 0xFFFFAF01 ^ 0x50A1;
        kotakbaz.rain.module.modules.render.G.G[0x4C72 ^ 0x4D49] = 0x1151 ^ 0x4D49;
        kotakbaz.rain.module.modules.render.G.G[0x2800 ^ 0x28E3] = 0x2882 ^ 0x28E3;
        kotakbaz.rain.module.modules.render.G.G[0x5B8A ^ 0x5B26] = 0x5B52 ^ 0x5B26;
        kotakbaz.rain.module.modules.render.G.G[0x1E01 ^ 0x1F7E] = 0xFFFF41F3 ^ 0x1F7E;
        kotakbaz.rain.module.modules.render.G.G[0xE574 ^ 0xE599] = 0xFFFF1A40 ^ 0xE599;
        kotakbaz.rain.module.modules.render.G.G[0xC9A ^ 0xCCB] = 0xC80 ^ 0xCCB;
        kotakbaz.rain.module.modules.render.G.G[0xB3BF ^ 0xB351] = 0xB30B ^ 0xB351;
        kotakbaz.rain.module.modules.render.G.G[0xB739 ^ 0xB79C] = 0xB79E ^ 0xB79C;
        kotakbaz.rain.module.modules.render.G.G[0xC5D3 ^ 0xC4CA] = 0x4799 ^ 0xC4CA;
        kotakbaz.rain.module.modules.render.G.G[0xAF84 ^ 0xAF05] = 0xFFFF50E3 ^ 0xAF05;
        kotakbaz.rain.module.modules.render.G.G[0xF917 ^ 0xF89E] = 0xF9FB ^ 0xF89E;
        kotakbaz.rain.module.modules.render.G.G[0x3B8E ^ 0x3AE4] = 0xB1A ^ 0x3AE4;
        kotakbaz.rain.module.modules.render.G.G[0x1A75 ^ 0x1AF7] = 0xFFFFE538 ^ 0x1AF7;
        kotakbaz.rain.module.modules.render.G.G[0x2DBF ^ 0x2DFC] = 0x2D89 ^ 0x2DFC;
        kotakbaz.rain.module.modules.render.G.G[0x5C7F ^ 0x5D09] = 0x44A4 ^ 0x5D09;
        kotakbaz.rain.module.modules.render.G.G[0xE7D1 ^ 0xE6E0] = 0x7C1 ^ 0xE6E0;
        kotakbaz.rain.module.modules.render.G.G[0xF3BB ^ 0xF2FE] = 0x6726 ^ 0xF2FE;
        kotakbaz.rain.module.modules.render.G.G[0x293B ^ 0x284C] = 0xFFFFCE6E ^ 0x284C;
        kotakbaz.rain.module.modules.render.G.G[0x8DFE ^ 0x8DCA] = 0x8DA3 ^ 0x8DCA;
        kotakbaz.rain.module.modules.render.G.G[0x2967 ^ 0x286D] = 0x2849 ^ 0x286D;
        kotakbaz.rain.module.modules.render.G.G[0x954C ^ 0x9407] = 0xCB56 ^ 0x9407;
        kotakbaz.rain.module.modules.render.G.G[0x6680 ^ 0x67D5] = 0xC46C ^ 0x67D5;
        kotakbaz.rain.module.modules.render.G.G[0xA2F9 ^ 0xA3EE] = 0xA3EE ^ 0xA3EE;
        kotakbaz.rain.module.modules.render.G.G[0x712B ^ 0x718D] = 0x71A8 ^ 0x718D;
        kotakbaz.rain.module.modules.render.G.G[0xDBE7 ^ 0xDB6D] = 0xDB05 ^ 0xDB6D;
        kotakbaz.rain.module.modules.render.G.G[0xA256 ^ 0xA32D] = 0xFFFF6EB4 ^ 0xA32D;
        kotakbaz.rain.module.modules.render.G.G[0xAD78 ^ 0xAC45] = 0xF05D ^ 0xAC45;
        kotakbaz.rain.module.modules.render.G.G[0x107FB ^ 0x107DF] = 0x107C4 ^ 0x107DF;
        kotakbaz.rain.module.modules.render.G.G[0xFC3B ^ 0xFD71] = 0xA22B ^ 0xFD71;
        kotakbaz.rain.module.modules.render.G.G[0x76B1 ^ 0x76E1] = 0x7688 ^ 0x76E1;
        kotakbaz.rain.module.modules.render.G.G[0xA2C1 ^ 0xA219] = 0xFFFF5DEA ^ 0xA219;
        kotakbaz.rain.module.modules.render.G.G[0xEEDB ^ 0xEEF3] = 0xFFFF110E ^ 0xEEF3;
        kotakbaz.rain.module.modules.render.G.G[0xCDC8 ^ 0xCC8F] = 0x756F ^ 0xCC8F;
        kotakbaz.rain.module.modules.render.G.G[0x6A6D ^ 0x6B14] = 0x5916 ^ 0x6B14;
        kotakbaz.rain.module.modules.render.G.G[0x862C ^ 0x86A7] = 0xFFFF796A ^ 0x86A7;
        kotakbaz.rain.module.modules.render.G.G[0xD1EA ^ 0xD0CC] = 0x1A0B ^ 0xD0CC;
        kotakbaz.rain.module.modules.render.G.G[0xCF56 ^ 0xCF23] = 0xFFFF30E9 ^ 0xCF23;
        kotakbaz.rain.module.modules.render.G.G[0x43B7 ^ 0x43A5] = 0x4364 ^ 0x43A5;
        kotakbaz.rain.module.modules.render.G.G[0x15F8 ^ 0x1531] = 0x1531 ^ 0x1531;
        kotakbaz.rain.module.modules.render.G.G[0xF978 ^ 0xF909] = 0xF962 ^ 0xF909;
        kotakbaz.rain.module.modules.render.G.G[0xB88 ^ 0xB78] = 0xB05 ^ 0xB78;
        kotakbaz.rain.module.modules.render.G.G[0x9E42 ^ 0x9F1C] = 0x1923 ^ 0x9F1C;
        kotakbaz.rain.module.modules.render.G.G[0x18FC ^ 0x18FC] = 0x189A ^ 0x18FC;
        kotakbaz.rain.module.modules.render.G.G[0x4D2B ^ 0x4D08] = 0xFFFFB2BD ^ 0x4D08;
        kotakbaz.rain.module.modules.render.G.G[0x628 ^ 0x6DD] = 0x6BF ^ 0x6DD;
        kotakbaz.rain.module.modules.render.G.G[0x342A ^ 0x34B7] = 0xFFFFCB38 ^ 0x34B7;
        kotakbaz.rain.module.modules.render.G.G[0xDCBB ^ 0xDD9C] = 0x175B ^ 0xDD9C;
        kotakbaz.rain.module.modules.render.G.G[0x9354 ^ 0x9310] = 0xFFFF6C86 ^ 0x9310;
        kotakbaz.rain.module.modules.render.G.G[0xA8D4 ^ 0xA8F9] = 0xFFFF573C ^ 0xA8F9;
        kotakbaz.rain.module.modules.render.G.G[0xBC56 ^ 0xBDDE] = 0x247F ^ 0xBDDE;
        kotakbaz.rain.module.modules.render.G.G[0x107AA ^ 0x10771] = 0xFFFEF883 ^ 0x10771;
        kotakbaz.rain.module.modules.render.G.G[0x5118 ^ 0x5196] = 0x51C6 ^ 0x5196;
        kotakbaz.rain.module.modules.render.G.G[0x6D43 ^ 0x6D3A] = 0x6D08 ^ 0x6D3A;
        kotakbaz.rain.module.modules.render.G.G[0x8E20 ^ 0x8F01] = 0xD6E8 ^ 0x8F01;
        kotakbaz.rain.module.modules.render.G.G[0x784E ^ 0x789F] = 0x78C9 ^ 0x789F;
        kotakbaz.rain.module.modules.render.G.G[0x53D8 ^ 0x5344] = 0x5321 ^ 0x5344;
        kotakbaz.rain.module.modules.render.G.G[0x2FC ^ 0x3FB] = 0xFFFFFC01 ^ 0x3FB;
        kotakbaz.rain.module.modules.render.G.G[0xFCC4 ^ 0xFCD5] = 0xFFFF0303 ^ 0xFCD5;
        kotakbaz.rain.module.modules.render.G.G[0xA408 ^ 0xA463] = 0xFFFF5B89 ^ 0xA463;
        kotakbaz.rain.module.modules.render.G.G[0x14B1 ^ 0x1477] = 0xCBCC ^ 0x1477;
        kotakbaz.rain.module.modules.render.G.G[0x2BF5 ^ 0x2B94] = 0x2B86 ^ 0x2B94;
        kotakbaz.rain.module.modules.render.G.G[0x777 ^ 0x7AD] = 0xFFFFF877 ^ 0x7AD;
        kotakbaz.rain.module.modules.render.G.G[0x4D0A ^ 0x4DC5] = 0xFFFFB258 ^ 0x4DC5;
        kotakbaz.rain.module.modules.render.G.G[0x81CF ^ 0x81D5] = 0xFFFF7E42 ^ 0x81D5;
        kotakbaz.rain.module.modules.render.G.G[0xE2AC ^ 0xE2B2] = 0xE22A ^ 0xE2B2;
        kotakbaz.rain.module.modules.render.G.G[0x4FD8 ^ 0x4FE5] = 0xFFFFB036 ^ 0x4FE5;
        kotakbaz.rain.module.modules.render.G.G[0x1BA1 ^ 0x1BB6] = 0xFFFFE470 ^ 0x1BB6;
        kotakbaz.rain.module.modules.render.G.G[0xDB2A ^ 0xDB6F] = 0xDB04 ^ 0xDB6F;
        kotakbaz.rain.module.modules.render.G.G[0xB7A9 ^ 0xB795] = 0xB7C7 ^ 0xB795;
        kotakbaz.rain.module.modules.render.G.G[0x3897 ^ 0x39F2] = 0x1830 ^ 0x39F2;
        kotakbaz.rain.module.modules.render.G.G[0x1014B ^ 0x101FA] = 0x101F9 ^ 0x101FA;
        kotakbaz.rain.module.modules.render.G.G[0x1091E ^ 0x10831] = 0x1E910 ^ 0x10831;
        kotakbaz.rain.module.modules.render.G.G[0x29F5 ^ 0x290C] = 0xFFFFD6FE ^ 0x290C;
        kotakbaz.rain.module.modules.render.G.G[0xCA54 ^ 0xCA16] = 0xCB45 ^ 0xCA16;
        kotakbaz.rain.module.modules.render.G.G[0x9781 ^ 0x9713] = 0x973D ^ 0x9713;
        kotakbaz.rain.module.modules.render.G.G[0x7830 ^ 0x789D] = 0xFFFF8757 ^ 0x789D;
        kotakbaz.rain.module.modules.render.G.G[0x5CAC ^ 0x5C56] = 0x5C5F ^ 0x5C56;
        kotakbaz.rain.module.modules.render.G.G[0x8C37 ^ 0x8C55] = 0xFFFF7383 ^ 0x8C55;
        kotakbaz.rain.module.modules.render.G.G[0x109EA ^ 0x10882] = 0x12959 ^ 0x10882;
        kotakbaz.rain.module.modules.render.G.G[0x173D ^ 0x179C] = 0xFFFFE82C ^ 0x179C;
        kotakbaz.rain.module.modules.render.G.G[0x4258 ^ 0x4294] = 0x42BA ^ 0x4294;
        kotakbaz.rain.module.modules.render.G.G[0xDAAC ^ 0xDA53] = 0xDA76 ^ 0xDA53;
        kotakbaz.rain.module.modules.render.G.G[0x6892 ^ 0x699B] = 0xFFFF9663 ^ 0x699B;
        kotakbaz.rain.module.modules.render.G.G[0xAFB2 ^ 0xAFDF] = 0xFFFF503A ^ 0xAFDF;
        kotakbaz.rain.module.modules.render.G.G[0xE87D ^ 0xE8BA] = 0xA6A6 ^ 0xE8BA;
        kotakbaz.rain.module.modules.render.G.G[0xF3F9 ^ 0xF2F8] = 0xFFFF0D00 ^ 0xF2F8;
        kotakbaz.rain.module.modules.render.G.G[0xDAD6 ^ 0xDB86] = 0xFFFFF948 ^ 0xDB86;
        kotakbaz.rain.module.modules.render.G.G[0xDB50 ^ 0xDA37] = 0xFFFF0407 ^ 0xDA37;
        kotakbaz.rain.module.modules.render.G.G[0x6B84 ^ 0x6ABA] = 0x9ED7 ^ 0x6ABA;
        kotakbaz.rain.module.modules.render.G.G[0xB834 ^ 0xB968] = 0x7F6E ^ 0xB968;
        kotakbaz.rain.module.modules.render.G.G[0xF4D0 ^ 0xF441] = 0xF471 ^ 0xF441;
        kotakbaz.rain.module.modules.render.G.G[0x5ACE ^ 0x5BB3] = 0xFA84 ^ 0x5BB3;
        kotakbaz.rain.module.modules.render.G.G[0x33BE ^ 0x33B8] = 0xFFFFCC79 ^ 0x33B8;
        kotakbaz.rain.module.modules.render.G.G[0x10543 ^ 0x1041C] = 0xFFFE7DD7 ^ 0x1041C;
        kotakbaz.rain.module.modules.render.G.G[0xD16B ^ 0xD054] = 0x243F ^ 0xD054;
        kotakbaz.rain.module.modules.render.G.G[0xA074 ^ 0xA1F2] = 0x3853 ^ 0xA1F2;
        kotakbaz.rain.module.modules.render.G.G[0xEE4D ^ 0xEE4A] = 0xEE6C ^ 0xEE4A;
        kotakbaz.rain.module.modules.render.G.G[0xDA2A ^ 0xDA7F] = 0xDA3A ^ 0xDA7F;
        kotakbaz.rain.module.modules.render.G.G[0xA7D5 ^ 0xA76C] = 0xF1CB ^ 0xA76C;
        kotakbaz.rain.module.modules.render.G.G[0xBD86 ^ 0xBD24] = 0xFFFF42E9 ^ 0xBD24;
        kotakbaz.rain.module.modules.render.G.G[0xE39E ^ 0xE36C] = 0xE306 ^ 0xE36C;
        kotakbaz.rain.module.modules.render.G.G[0x7D3F ^ 0x7DBF] = 0x7DB3 ^ 0x7DBF;
        kotakbaz.rain.module.modules.render.G.G[0x71D3 ^ 0x7165] = 0x7165 ^ 0x7165;
        kotakbaz.rain.module.modules.render.G.G[0x1FD ^ 0x180] = 0x1EE ^ 0x180;
        kotakbaz.rain.module.modules.render.G.G[0x2FA ^ 0x2D4] = 0x287 ^ 0x2D4;
        kotakbaz.rain.module.modules.render.G.G[0x2F25 ^ 0x2FC9] = 0x2FB9 ^ 0x2FC9;
        kotakbaz.rain.module.modules.render.G.G[0x1D8C ^ 0x1CB0] = 0x40D9 ^ 0x1CB0;
        kotakbaz.rain.module.modules.render.G.G[0xE501 ^ 0xE410] = 0xFFFF1BF0 ^ 0xE410;
        kotakbaz.rain.module.modules.render.G.G[0x498E ^ 0x48C3] = 0x1792 ^ 0x48C3;
        kotakbaz.rain.module.modules.render.G.G[0x96D0 ^ 0x9631] = 0x962C ^ 0x9631;
        kotakbaz.rain.module.modules.render.G.G[0x2C7 ^ 0x29A] = 0xFFFFFD4C ^ 0x29A;
        kotakbaz.rain.module.modules.render.G.G[0x5DC7 ^ 0x5DDC] = 0xFFFFA2FB ^ 0x5DDC;
        kotakbaz.rain.module.modules.render.G.G[0x8690 ^ 0x8650] = 0xB8C0 ^ 0x8650;
        kotakbaz.rain.module.modules.render.G.G[0x4455 ^ 0x4501] = 0xFFFF1928 ^ 0x4501;
        kotakbaz.rain.module.modules.render.G.G[0x1584 ^ 0x15DD] = 0x1580 ^ 0x15DD;
        kotakbaz.rain.module.modules.render.G.G[0xB6D5 ^ 0xB7BA] = 0xFFFFB15E ^ 0xB7BA;
        kotakbaz.rain.module.modules.render.G.G[0x88F4 ^ 0x8805] = 0xFFFF77FE ^ 0x8805;
        kotakbaz.rain.module.modules.render.G.G[0x26DB ^ 0x2695] = 0xFFFFD942 ^ 0x2695;
        kotakbaz.rain.module.modules.render.G.G[0x6675 ^ 0x662B] = 0x667E ^ 0x662B;
        kotakbaz.rain.module.modules.render.G.G[0x9EC7 ^ 0x9FA5] = 0xBCB7 ^ 0x9FA5;
        kotakbaz.rain.module.modules.render.G.G[0x7D15 ^ 0x7DEB] = 0xFFFF8200 ^ 0x7DEB;
        kotakbaz.rain.module.modules.render.G.G[0xC6A5 ^ 0xC6BD] = 0xC6F6 ^ 0xC6BD;
        kotakbaz.rain.module.modules.render.G.G[0xB4D3 ^ 0xB4BF] = 0xFFFF4B26 ^ 0xB4BF;
        kotakbaz.rain.module.modules.render.G.G[0x6E8D ^ 0x6FC4] = 0xD624 ^ 0x6FC4;
        kotakbaz.rain.module.modules.render.G.G[0xCA9 ^ 0xC5F] = 0xFFFFF3EC ^ 0xC5F;
        kotakbaz.rain.module.modules.render.G.G[0x8294 ^ 0x83E6] = 0xD0A1 ^ 0x83E6;
        kotakbaz.rain.module.modules.render.G.G[0xA515 ^ 0xA54F] = 0xFFFF5A11 ^ 0xA54F;
        kotakbaz.rain.module.modules.render.G.G[0x140B ^ 0x1468] = 0x1454 ^ 0x1468;
        kotakbaz.rain.module.modules.render.G.G[0xCCA8 ^ 0xCDB2] = 0xE9EA ^ 0xCDB2;
        kotakbaz.rain.module.modules.render.G.G[0x8CF9 ^ 0x8C4D] = 0x8C4D ^ 0x8C4D;
        kotakbaz.rain.module.modules.render.G.G[0x57C7 ^ 0x579B] = 0x57E0 ^ 0x579B;
        kotakbaz.rain.module.modules.render.G.G[0x98AC ^ 0x99C0] = 0xA83E ^ 0x99C0;
        kotakbaz.rain.module.modules.render.G.G[0x10315 ^ 0x10310] = 0x10323 ^ 0x10310;
        kotakbaz.rain.module.modules.render.G.G[0x8503 ^ 0x85FF] = 0xFFFF7A78 ^ 0x85FF;
        kotakbaz.rain.module.modules.render.G.G[0xBB50 ^ 0xBA3B] = 0xFFFF7463 ^ 0xBA3B;
        kotakbaz.rain.module.modules.render.G.G[0x802A ^ 0x80DE] = 0xFFFF7F2F ^ 0x80DE;
        kotakbaz.rain.module.modules.render.G.G[0xE0B1 ^ 0xE03C] = 0xFFFF1F65 ^ 0xE03C;
        kotakbaz.rain.module.modules.render.G.G[0x42A6 ^ 0x4295] = 0xFFFFBDF8 ^ 0x4295;
        kotakbaz.rain.module.modules.render.G.G[0x103E ^ 0x1079] = 0x1061 ^ 0x1079;
        kotakbaz.rain.module.modules.render.G.G[0xD7AD ^ 0xD7E5] = 0xFFFF2870 ^ 0xD7E5;
        kotakbaz.rain.module.modules.render.G.G[0xB8D4 ^ 0xB84E] = 0xB85D ^ 0xB84E;
        kotakbaz.rain.module.modules.render.G.G[0x5779 ^ 0x567B] = 0xFFFFA9DC ^ 0x567B;
        kotakbaz.rain.module.modules.render.G.G[0xED97 ^ 0xED5A] = 0xFFFF1217 ^ 0xED5A;
        kotakbaz.rain.module.modules.render.G.G[0xC4B5 ^ 0xC534] = 0xF92A ^ 0xC534;
        kotakbaz.rain.module.modules.render.G.G[0xE480 ^ 0xE504] = 0xD90B ^ 0xE504;
        kotakbaz.rain.module.modules.render.G.G[0x472 ^ 0x48F] = 0xFFFFFB21 ^ 0x48F;
        kotakbaz.rain.module.modules.render.G.G[0x10BCD ^ 0x10B18] = 0xFFFEF4E9 ^ 0x10B18;
        kotakbaz.rain.module.modules.render.G.G[0xC938 ^ 0xC9EE] = 0xFFFF361F ^ 0xC9EE;
        kotakbaz.rain.module.modules.render.G.G[0x10CCB ^ 0x10C4E] = 0xFFFEF3AB ^ 0x10C4E;
        kotakbaz.rain.module.modules.render.G.G[0xC070 ^ 0xC101] = 0x925E ^ 0xC101;
        kotakbaz.rain.module.modules.render.G.G[0x7173 ^ 0x7076] = 0x7058 ^ 0x7076;
        kotakbaz.rain.module.modules.render.G.G[0xCA16 ^ 0xCA4E] = 0xFFFF35C8 ^ 0xCA4E;
        kotakbaz.rain.module.modules.render.G.G[0x5759 ^ 0x57EE] = 0x57EE ^ 0x57EE;
        kotakbaz.rain.module.modules.render.G.G[0xCEFB ^ 0xCFFF] = 0xFFFF3062 ^ 0xCFFF;
        kotakbaz.rain.module.modules.render.G.G[0x75BE ^ 0x74AE] = 0xFFFF8B16 ^ 0x74AE;
        kotakbaz.rain.module.modules.render.G.G[0xB98 ^ 0xBC3] = 0xBE4 ^ 0xBC3;
        kotakbaz.rain.module.modules.render.G.G[0xCBB ^ 0xC81] = 0xFFFFF34B ^ 0xC81;
        kotakbaz.rain.module.modules.render.G.G[0x10B0 ^ 0x1048] = 0xFFFFEFC0 ^ 0x1048;
        kotakbaz.rain.module.modules.render.G.G[0xD81B ^ 0xD99E] = 0x4028 ^ 0xD99E;
        kotakbaz.rain.module.modules.render.G.G[0xF340 ^ 0xF399] = 0xFFFF0C35 ^ 0xF399;
        kotakbaz.rain.module.modules.render.G.G[0x5D ^ 0x76] = 0x4B ^ 0x76;
        kotakbaz.rain.module.modules.render.G.G[0x4550 ^ 0x44DB] = 0xFFFFBA4D ^ 0x44DB;
        kotakbaz.rain.module.modules.render.G.G[0xE6EC ^ 0xE605] = 0xE621 ^ 0xE605;
        kotakbaz.rain.module.modules.render.G.G[0xAF33 ^ 0xAF2C] = 0xAF67 ^ 0xAF2C;
        kotakbaz.rain.module.modules.render.G.G[0x75F1 ^ 0x74DA] = 0xD2CA ^ 0x74DA;
        kotakbaz.rain.module.modules.render.G.G[0x8AC2 ^ 0x8AAB] = 0x8A95 ^ 0x8AAB;
        kotakbaz.rain.module.modules.render.G.G[0xD92E ^ 0xD96E] = 0xFFFF26FB ^ 0xD96E;
        kotakbaz.rain.module.modules.render.G.G[0xCF2F ^ 0xCF14] = 0xCF09 ^ 0xCF14;
        kotakbaz.rain.module.modules.render.G.G[0x8ADC ^ 0x8BAC] = 0x72F0 ^ 0x8BAC;
        kotakbaz.rain.module.modules.render.G.G[0x18E2 ^ 0x18C0] = 0xFFFFE70F ^ 0x18C0;
        kotakbaz.rain.module.modules.render.G.G[0x9085 ^ 0x9090] = 0x90AD ^ 0x9090;
        kotakbaz.rain.module.modules.render.G.G[0xD0E0 ^ 0xD09F] = 0xFFFF2F29 ^ 0xD09F;
        kotakbaz.rain.module.modules.render.G.G[0x10059 ^ 0x100FA] = 0xFFFEFF10 ^ 0x100FA;
        kotakbaz.rain.module.modules.render.G.G[0x6666 ^ 0x6662] = 0xFFFF99FC ^ 0x6662;
        kotakbaz.rain.module.modules.render.G.G[0xBED0 ^ 0xBF93] = 0x2A4B ^ 0xBF93;
        kotakbaz.rain.module.modules.render.G.G[0x95FF ^ 0x94F7] = 0xFFFF6B52 ^ 0x94F7;
        kotakbaz.rain.module.modules.render.G.G[0xC2CD ^ 0xC2CE] = 0xFFFF3D16 ^ 0xC2CE;
        kotakbaz.rain.module.modules.render.G.G[0xB95 ^ 0xB0A] = 0xFFFFF422 ^ 0xB0A;
        kotakbaz.rain.module.modules.render.G.G[0x31FC ^ 0x30A1] = 0xB685 ^ 0x30A1;
        kotakbaz.rain.module.modules.render.G.G[0xEC95 ^ 0xEC48] = 0xEC48 ^ 0xEC48;
        kotakbaz.rain.module.modules.render.G.G[0x2A18 ^ 0x2A72] = 0x2A46 ^ 0x2A72;
        kotakbaz.rain.module.modules.render.G.G[0xDFE4 ^ 0xDEDE] = 0x82CB ^ 0xDEDE;
        kotakbaz.rain.module.modules.render.G.G[0xD281 ^ 0xD2F1] = 0xD2E3 ^ 0xD2F1;
        kotakbaz.rain.module.modules.render.G.G[0x1878 ^ 0x194D] = 0x7E28 ^ 0x194D;
        kotakbaz.rain.module.modules.render.G.G[0xDF04 ^ 0xDF6A] = 0xFFFF20CE ^ 0xDF6A;
        kotakbaz.rain.module.modules.render.G.G[0xD691 ^ 0xD7FF] = 0x2EA3 ^ 0xD7FF;
        kotakbaz.rain.module.modules.render.G.G[0x30B3 ^ 0x3139] = 0x3041 ^ 0x3139;
        kotakbaz.rain.module.modules.render.G.G[0x938D ^ 0x938F] = 0xFFFF6C2E ^ 0x938F;
        kotakbaz.rain.module.modules.render.G.G[0x817F ^ 0x8067] = 0x324 ^ 0x8067;
        kotakbaz.rain.module.modules.render.G.G[0x105AE ^ 0x105F8] = 0xFFFEFA09 ^ 0x105F8;
        kotakbaz.rain.module.modules.render.G.G[0xA865 ^ 0xA879] = 0xFFFF57E6 ^ 0xA879;
        kotakbaz.rain.module.modules.render.G.G[0x10C47 ^ 0x10C3C] = 0x10CB9 ^ 0x10C3C;
        kotakbaz.rain.module.modules.render.G.G[0x6CDE ^ 0x6DD3] = 0xFFFF9235 ^ 0x6DD3;
        kotakbaz.rain.module.modules.render.G.G[0xF764 ^ 0xF77D] = 0xFFFF08A1 ^ 0xF77D;
        kotakbaz.rain.module.modules.render.G.G[0xB357 ^ 0xB27F] = 0x78AF ^ 0xB27F;
        kotakbaz.rain.module.modules.render.G.G[0x1D33 ^ 0x1C7B] = 0xFFFF5A38 ^ 0x1C7B;
        kotakbaz.rain.module.modules.render.G.G[0xE915 ^ 0xE925] = 0xE901 ^ 0xE925;
        kotakbaz.rain.module.modules.render.G.G[0x86FB ^ 0x862F] = 0xFFFF79AC ^ 0x862F;
        kotakbaz.rain.module.modules.render.G.G[0x816F ^ 0x804F] = 0xD9E7 ^ 0x804F;
        kotakbaz.rain.module.modules.render.G.G[0x7C74 ^ 0x7C67] = 0xFFFF83E9 ^ 0x7C67;
        kotakbaz.rain.module.modules.render.G.G[0x101F2 ^ 0x10109] = 0x1016B ^ 0x10109;
        kotakbaz.rain.module.modules.render.G.G[0xEDA3 ^ 0xED45] = 0xED53 ^ 0xED45;
        kotakbaz.rain.module.modules.render.G.G[0x591D ^ 0x595C] = 0x5951 ^ 0x595C;
    }
}

