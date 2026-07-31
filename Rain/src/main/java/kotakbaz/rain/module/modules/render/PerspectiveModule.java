/*
 * Decompiled with CFR 0.152.
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
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.event.events.KeyEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.Perspective;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\"\u0010\u0010R\u0014\u0010$\u001a\u00020#8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u0010/R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0012\u0010'R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010'\u00a8\u00061"}, d2={"Lkotakbaz/rain/module/modules/render/PerspectiveModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lkotakbaz/rain/event/events/KeyEvent;", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "", "isPerspectiveActive", "()Z", "", "cameraPitch", "()F", "cameraYaw", "", "mouseXDelta", "mouseYDelta", "rotateCamera", "(DD)V", "pitch", "yaw", "captureCamera", "(FF)V", "forceFirstPerson", "disablePerspective", "(Z)V", "resetState", "isBindPressedNow", "", "INPUT_MOUSE_OFFSET", "I", "MAX_CAMERA_PITCH", "F", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "perspectiveKey", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "holdMode", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "perspectiveActive", "Z", "held", "rain-visuals"})
public final class PerspectiveModule
extends Module {
    @NotNull
    public static final PerspectiveModule INSTANCE;
    private static final int a = 400;
    private static final float A = 90.0f;
    @NotNull
    private static final BindSetting b;
    @NotNull
    private static final BooleanSetting B;
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

    private PerspectiveModule() {
        int n2 = G[0];
        n2 -= G[1];
        int n3 = G[3];
        n3 -= G[4];
        int n4 = G[6];
        n4 += G[7];
        super((String)e[n2 += G[2]], a_0.getRENDER(), (String)e[n3 -= G[5]] + (String)e[n4 += G[8]]);
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
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        long l2 = 7749117206856805779L;
        int n2 = G[12];
        n2 -= G[13];
        Intrinsics.checkNotNullParameter(event, (String)e[n2 ^= G[14]]);
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            PerspectiveModule perspectiveModule = this;
            long l3 = l2;
            int n3 = G[15];
            n3 += G[16];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 -= G[17]);
            boolean bl = G[18];
            bl += G[19];
            perspectiveModule.disablePerspective(bl -= G[20]);
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (((Boolean)B.getValue()).booleanValue() && (c = this.isBindPressedNow()) && !C) {
            int n4 = G[21];
            n4 += G[22];
            C = n4 ^= G[23];
            this.captureCamera(clientPlayerEntity2.getPitch(), clientPlayerEntity2.getYaw());
            kotakbaz.rain.client.extensions.b.getMc().options.setPerspective(Perspective.THIRD_PERSON_BACK);
        }
        if (!c && C) {
            int n5 = G[24];
            n5 ^= G[25];
            C = n5 ^= G[26];
            kotakbaz.rain.client.extensions.b.getMc().options.setPerspective(Perspective.FIRST_PERSON);
        }
        if (c && kotakbaz.rain.client.extensions.b.getMc().options.getPerspective() != Perspective.THIRD_PERSON_BACK) {
            int n6 = G[27];
            n6 -= G[28];
            c = n6 ^= G[29];
        }
    }

    @Commando
    public final void onKey(@NotNull KeyEvent event) {
        int n2;
        int n3;
        long l2 = 294517248123973240L;
        long l3 = -7699944280425424718L;
        long l4 = -6300550167398086308L;
        long l5 = -6759235193687036691L;
        long l6 = 3473306009627106951L;
        int n4 = G[30];
        n4 -= G[31];
        Intrinsics.checkNotNullParameter(event, (String)e[n4 += G[32]]);
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (kotakbaz.rain.client.extensions.b.getMc().world == null || ((Boolean)B.getValue()).booleanValue()) {
            return;
        }
        Integer n5 = event.get(KeyEvent.a.getBUTTON());
        if (n5 == null) {
            return;
        }
        int n6 = G[33];
        n6 -= G[34];
        long l7 = l5;
        int n7 = G[36];
        n7 += G[37];
        l5 = l7 ^ ((long)n5.intValue() << (n6 ^= G[35]) ^ l7) & -1L << (n7 ^= G[38]);
        boolean bl = G[39];
        bl -= G[40];
        bl ^= G[41];
        int n8 = G[42];
        n8 -= G[43];
        long l8 = l4;
        int n9 = G[45];
        n9 += G[46];
        l4 = l8 ^ ((long)Intrinsics.areEqual(event.get(KeyEvent.a.getMOUSE()), bl) << (n8 -= G[44]) ^ l8) & -1L << (n9 ^= G[47]);
        boolean bl2 = G[48];
        bl2 -= G[49];
        bl2 ^= G[50];
        int n10 = G[51];
        n10 += G[52];
        long l9 = l3;
        int n11 = G[54];
        n11 += G[55];
        l3 = l9 ^ ((long)Intrinsics.areEqual(event.get(KeyEvent.a.getRELEASE()), bl2) << (n10 += G[53]) ^ l9) & -1L << (n11 -= G[56]);
        int n12 = G[57];
        n12 -= G[58];
        if ((int)(l3 >>> (n12 += G[59])) != 0) {
            return;
        }
        int n13 = G[60];
        n13 ^= G[61];
        if ((int)(l4 >>> (n13 ^= G[62])) != 0) {
            int n14 = G[63];
            n14 ^= G[64];
            int n15 = G[66];
            n15 ^= G[67];
            n3 = (int)(l5 >>> (n14 -= G[65])) + (n15 -= G[68]);
        } else {
            int n16 = G[69];
            n16 += G[70];
            n3 = (int)(l5 >>> (n16 ^= G[71]));
        }
        int n17 = G[72];
        n17 ^= G[73];
        long l10 = l6;
        int n18 = G[75];
        n18 -= G[76];
        l6 = l10 ^ ((long)n3 << (n17 -= G[74]) ^ l10) & -1L << (n18 -= G[77]);
        int n19 = G[78];
        n19 ^= G[79];
        if ((int)(l6 >>> (n19 += G[80])) != ((Number)b.getValue()).intValue()) {
            return;
        }
        if (!c) {
            int n20 = G[81];
            n20 ^= G[82];
            n2 = n20 += G[83];
        } else {
            int n21 = G[84];
            n21 -= G[85];
            n2 = n21 += G[86];
        }
        c = n2;
        this.captureCamera(clientPlayerEntity2.getPitch(), clientPlayerEntity2.getYaw());
        kotakbaz.rain.client.extensions.b.getMc().options.setPerspective(c ? Perspective.THIRD_PERSON_BACK : Perspective.FIRST_PERSON);
    }

    public final boolean isPerspectiveActive() {
        int n2;
        if (this.isEnabled() && c && kotakbaz.rain.client.extensions.b.getMc().player != null) {
            int n3 = G[87];
            n3 -= G[88];
            n2 = n3 += G[89];
        } else {
            int n4 = G[90];
            n4 += G[91];
            n2 = n4 += G[92];
        }
        return n2 != 0;
    }

    public final float cameraPitch() {
        return d;
    }

    public final float cameraYaw() {
        return D;
    }

    public final void rotateCamera(double mouseXDelta, double mouseYDelta) {
        if (!this.isPerspectiveActive()) {
            return;
        }
        D += (float)(mouseXDelta / Double.longBitsToDouble(0xB573D0126FB16E7EL ^ 0xF553D0126FB16E7EL));
        d += (float)(mouseYDelta / Double.longBitsToDouble(0x24D9FE445093C45FL ^ 0x64F9FE445093C45FL));
        d = RangesKt.coerceIn(d, -90.0f, 90.0f);
    }

    private final void captureCamera(float pitch, float yaw) {
        d = pitch;
        D = yaw;
    }

    private final void disablePerspective(boolean forceFirstPerson) {
        if (!c && !C) {
            return;
        }
        int n2 = G[93];
        n2 += G[94];
        c = n2 += G[95];
        int n3 = G[96];
        n3 += G[97];
        C = n3 += G[98];
        if (forceFirstPerson) {
            kotakbaz.rain.client.extensions.b.getMc().options.setPerspective(Perspective.FIRST_PERSON);
        }
    }

    private final void resetState() {
        int n2 = G[99];
        n2 ^= G[100];
        c = n2 += G[101];
        int n3 = G[102];
        n3 ^= G[103];
        C = n3 += G[104];
        d = 0.0f;
        D = 0.0f;
    }

    private final boolean isBindPressedNow() {
        boolean bl;
        long l2;
        long l3;
        block8: {
            boolean bl2;
            long l4;
            block10: {
                block9: {
                    long l5 = -7362972738081460992L;
                    long l6 = 1710843937332481991L;
                    long l7 = 6498950959899146448L;
                    l4 = 2757701130839303718L;
                    l3 = 701231956058369248L;
                    int n2 = G[105];
                    n2 ^= G[106];
                    long l8 = l3;
                    int n3 = G[108];
                    n3 ^= G[109];
                    l3 = l8 ^ ((long)((Number)b.getValue()).intValue() << (n2 -= G[107]) ^ l8) & -1L << (n3 += G[110]);
                    int n4 = G[111];
                    n4 += G[112];
                    if ((int)(l3 >>> (n4 += G[113])) <= 0) {
                        boolean bl3 = G[114];
                        bl3 ^= G[115];
                        return bl3 -= G[116];
                    }
                    l2 = kotakbaz.rain.client.extensions.b.getMc().getWindow().getHandle();
                    int n5 = G[117];
                    n5 += G[118];
                    int n6 = G[120];
                    n6 += G[121];
                    if ((int)(l3 >>> (n5 ^= G[119])) < (n6 ^= G[122])) break block8;
                    int n7 = G[123];
                    n7 += G[124];
                    n7 ^= G[125];
                    int n8 = G[126];
                    n8 ^= G[127];
                    n8 += G[128];
                    int n9 = G[129];
                    n9 -= G[130];
                    long l9 = l4;
                    int n10 = G[132];
                    n10 += G[133];
                    l4 = l9 ^ ((long)((int)(l3 >>> n7) - n8) << (n9 -= G[131]) ^ l9) & -1L << (n10 += G[134]);
                    int n11 = G[135];
                    n11 ^= G[136];
                    if ((int)(l4 >>> (n11 += G[137])) < 0) break block9;
                    int n12 = G[138];
                    n12 += G[139];
                    int n13 = G[141];
                    n13 += G[142];
                    if ((int)(l4 >>> (n12 -= G[140])) <= (n13 ^= G[143])) break block10;
                }
                boolean bl4 = G[144];
                bl4 += G[145];
                return bl4 -= G[146];
            }
            int n14 = G[147];
            n14 -= G[148];
            int n15 = G[150];
            n15 += G[151];
            if (GLFW.glfwGetMouseButton((long)l2, (int)((int)(l4 >>> (n14 -= G[149])))) == (n15 += G[152])) {
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
        int n16 = G[159];
        n16 += G[160];
        int n17 = G[162];
        n17 += G[163];
        if (GLFW.glfwGetKey((long)l2, (int)((int)(l3 >>> (n16 ^= G[161])))) == (n17 ^= G[164])) {
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
        PerspectiveModule.b();
        long l2 = 585691409567809664L;
        long l3 = -6232936120094472951L;
        long l4 = 3445539657007273813L;
        long l5 = 3026224779740722794L;
        long l6 = -7653486640672642592L;
        long l7 = 2212817496186795164L;
        long l8 = 4601273391110121576L;
        long l9 = 8345192777496008234L;
        long l10 = -4306214453659570219L;
        long l11 = -3137887557989692352L;
        long l12 = 1518171789908896389L;
        long l13 = 8886092467843228065L;
        long l14 = 9081778804961520224L;
        long l15 = 3679377521598608606L;
        int n2 = G[171];
        n2 += G[172];
        e = new Object[n2 += G[173]];
        long l16 = l15;
        int n3 = G[174];
        n3 ^= G[175];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += G[176]);
        Object[] objectArray = new Object[G[177]];
        objectArray[PerspectiveModule.G[178]] = E;
        objectArray[PerspectiveModule.G[179]] = G[180];
        int n4 = G[181];
        Object object = PerspectiveModule.A()[G[182]];
        if (object == null) {
            char[] cArray = "\u7a1b\u7a4a\u79eb\u7a1c\u7a54\u7a26\u7a0f\u79ee\u7a18\u79ea\u7a41\u7a3b\u79ee\u7a4f\u7a4c\u7a19\u7a0b\u79ee\u7a23\u7a50\u7a3f\u7a12\u7a19\u7a03\u7a4c\u7a0b\u7a4d\u7a10\u79ef\u7a26\u7a0b\u7a18\u7a10\u7a03\u7a1f\u7a4e\u7a0b\u7a1c\u7a20\u7a25\u79ec\u7a19\u7a41\u7a1e\u79f6\u79ef\u7a65\u7a14\u7a51\u7a10\u79f2\u7a54\u79f9\u7a56\u7a05\u79f0\u7a11\u79ef\u7a15\u7a4b\u7a50\u7a13\u7a1f\u7a0b\u7a0c\u7a4c\u79eb\u7a46\u7a0f\u7a56\u7a46\u7a15\u7a4b\u7a0e\u7a65\u79f1\u7a0a\u7a4b\u7a65\u7a20\u7a0d\u7a65\u7a1c\u79f8\u7a0f\u79ec\u7a3a\u7a0a\u7a18\u79ec\u7a0c\u7a1c\u7a15\u7a4e\u7a46\u79ef\u7a14\u79ef\u79ef\u7a1a\u7a23\u7a3e\u7a0e\u7a20\u7a10\u7a25\u7a21\u7a4a\u7a0a\u7a12\u7a17\u7a1e\u7a25\u79eb\u7a41\u7a41\u7a1b\u79f5\u79f0\u7a1f\u79ee\u7a3e\u79f8\u7a4d\u7a3e\u7a56\u79f7\u7a14\u7a25\u79ec\u79ee\u79f2\u79f9\u7a50\u79ef\u79f3\u7a4b\u7a14\u79ec\u7a1b\u7a3f\u7a20\u7a4e\u7a56\u7a3c\u7a3e\u7a4a\u7a3e\u7a50\u7a3e\u79f0\u7a17\u7a3e\u7a0c\u7a23\u7a4d\u7a58\u7a3f\u7a25\u7a3e\u79eb\u7a4e\u79ee\u7a40\u79f4\u7a58\u7a13\u79ea\u7a3e\u7a46\u7a46\u7a41\u79f9\u79f6\u7a0a\u79ee\u7a0d\u7a0f\u7a14\u7a0a\u7a23\u7a15\u7a17\u7a4b\u7a20\u7a1a\u7a58\u7a58\u7a0a\u7a21\u79f0\u7a3e\u79f8\u7a21\u79ec\u7a0e\u7a3c\u7a1f\u7a26\u7a4a\u7a0f\u7a0f\u79f9\u7a17\u79f0\u7a1c\u7a15\u7a4e\u7a18\u79f2\u79ed\u79ed\u7a20\u7a4b\u7a1e\u7a1e\u7a4f\u79ee\u7a0e\u79ef\u79eb\u79eb\u7a3b\u7a0e\u7a23\u79f6\u7a14\u7a19\u7a4b\u7a05\u7a58\u79f1\u7a18\u79f5\u7a26\u7a62".toCharArray();
            for (int i2 = G[183]; i2 < G[184]; ++i2) {
                int n5 = cArray[i2];
                n5 += G[185];
                n5 -= G[186];
                n5 += G[187];
                n5 += G[188];
                n5 ^= G[189];
                n5 ^= G[190];
                n5 -= G[191];
                n5 -= G[192];
                n5 -= G[193];
                n5 -= G[194];
                n5 ^= G[195];
                n5 += G[196];
                n5 -= G[197];
                n5 += G[198];
                n5 += G[199];
                cArray[i2] = (char)(n5 ^= G[200]);
            }
            object = PerspectiveModule.A()[PerspectiveModule.G[201]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)PerspectiveModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = G[202];
        n6 += G[203];
        l6 = l17 ^ (0x5F00000000L ^ l17) & -1L << (n6 -= G[204]);
        long l18 = l13;
        int n7 = G[205];
        n7 += G[206];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= G[207]);
        while (true) {
            int n8 = G[208];
            n8 += G[209];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= G[210]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = G[211];
            n10 ^= G[212];
            int n11 = G[214];
            n11 -= G[215];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= G[213])) & -1L >>> (n11 += G[216]);
            long l20 = l9;
            int n12 = G[217];
            n12 -= G[218];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= G[219]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = G[220];
            n14 += G[221];
            int n15 = G[223];
            n15 += G[224];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= G[222])) & -1L >>> (n15 -= G[225]);
            int n16 = G[226];
            n16 ^= G[227];
            long l22 = l10;
            int n17 = G[229];
            n17 ^= G[230];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= G[228]) ^ l22) & -1L << (n17 -= G[231]);
            int n18 = G[232];
            n18 ^= G[233];
            n18 -= G[234];
            int n19 = G[235];
            n19 += G[236];
            long l23 = l12;
            int n20 = G[238];
            n20 += G[239];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= G[237]))) ^ l23) & -1L >>> (n20 -= G[240]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = G[241];
            n21 ^= G[242];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= G[243]);
            while (true) {
                int n22 = G[244];
                n22 ^= G[245];
                if ((int)(l14 >>> (n22 ^= G[246])) >= (int)l12) break;
                int n23 = G[247];
                n23 ^= G[248];
                int n24 = G[250];
                n24 -= G[251];
                cArray2[(int)(l14 >>> (n23 -= PerspectiveModule.G[249]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= G[252]))];
                l14 += 0x100000000L;
            }
            int n25 = G[253];
            n25 ^= G[254];
            int n26 = (int)(l15 >>> (n25 -= G[255]));
            l15 += 0x100000000L;
            PerspectiveModule.e[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = G[256];
            n27 -= G[257];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += G[258]);
        }
        INSTANCE = new PerspectiveModule();
        int n28 = G[259];
        n28 += G[260];
        int n29 = G[262];
        n29 += G[263];
        b = INSTANCE.bind((String)e[n28 ^= G[261]], n29 -= G[264]);
        int n30 = G[265];
        n30 += G[266];
        int n31 = G[268];
        n31 -= G[269];
        boolean bl = G[271];
        bl += G[272];
        B = INSTANCE.cfr_renamed_0((String)e[n30 ^= G[267]] + (String)e[n31 ^= G[270]], bl -= G[273]);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[G[274]];
        String string = (String)object[G[275]];
        object = object[G[276]];
        Object[] objectArray = F;
        if (F == null) {
            objectArray = F = new Object[G[277]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[G[278]];
                E = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[G[280] ^ G[281]];
                byArray[PerspectiveModule.G[282] ^ PerspectiveModule.G[283]] = G[284] ^ G[285];
                byArray[PerspectiveModule.G[286] ^ PerspectiveModule.G[287]] = G[288] ^ G[289];
                byArray[PerspectiveModule.G[290] ^ PerspectiveModule.G[291]] = G[292] ^ G[293];
                byArray[PerspectiveModule.G[294] ^ PerspectiveModule.G[295]] = G[296] ^ G[297];
                byArray[PerspectiveModule.G[298] ^ PerspectiveModule.G[299]] = G[300] ^ G[301];
                byArray[PerspectiveModule.G[302] ^ PerspectiveModule.G[303]] = G[304] ^ G[305];
                byArray[PerspectiveModule.G[306] ^ PerspectiveModule.G[307]] = G[308] ^ G[309];
                byArray[PerspectiveModule.G[310] ^ PerspectiveModule.G[311]] = G[312] ^ G[313];
                byArray[PerspectiveModule.G[314] ^ PerspectiveModule.G[315]] = G[316] ^ G[317];
                byArray[PerspectiveModule.G[318] ^ PerspectiveModule.G[319]] = G[320] ^ G[321];
                byArray[PerspectiveModule.G[322] ^ PerspectiveModule.G[323]] = G[324] ^ G[325];
                byArray[PerspectiveModule.G[326] ^ PerspectiveModule.G[327]] = G[328] ^ G[329];
                byArray[PerspectiveModule.G[330] ^ PerspectiveModule.G[331]] = G[332] ^ G[333];
                byArray[PerspectiveModule.G[334] ^ PerspectiveModule.G[335]] = G[336] ^ G[337];
                byArray[PerspectiveModule.G[338] ^ PerspectiveModule.G[339]] = G[340] ^ G[341];
                byArray[PerspectiveModule.G[342] ^ PerspectiveModule.G[343]] = G[344] ^ G[345];
                objectArray2[PerspectiveModule.G[279]] = byArray;
            }
            byte[] byArray = (byte[])object3[G[346]];
            if (f == null) {
                byte[] byArray2 = new byte[G[347] ^ G[348]];
                byArray2[PerspectiveModule.G[349] ^ PerspectiveModule.G[350]] = G[351] ^ G[352];
                byArray2[PerspectiveModule.G[353] ^ PerspectiveModule.G[354]] = G[355] ^ G[356];
                byArray2[PerspectiveModule.G[357] ^ PerspectiveModule.G[358]] = G[359] ^ G[360];
                byArray2[PerspectiveModule.G[361] ^ PerspectiveModule.G[362]] = G[363] ^ G[364];
                byArray2[PerspectiveModule.G[365] ^ PerspectiveModule.G[366]] = G[367] ^ G[368];
                byArray2[PerspectiveModule.G[369] ^ PerspectiveModule.G[370]] = G[371] ^ G[372];
                byArray2[PerspectiveModule.G[373] ^ PerspectiveModule.G[374]] = G[375] ^ G[376];
                byArray2[PerspectiveModule.G[377] ^ PerspectiveModule.G[378]] = G[379] ^ G[380];
                byArray2[PerspectiveModule.G[381] ^ PerspectiveModule.G[382]] = G[383] ^ G[384];
                byArray2[PerspectiveModule.G[385] ^ PerspectiveModule.G[386]] = G[387] ^ G[388];
                byArray2[PerspectiveModule.G[389] ^ PerspectiveModule.G[390]] = G[391] ^ G[392];
                byArray2[PerspectiveModule.G[393] ^ PerspectiveModule.G[394]] = G[395] ^ G[396];
                byArray2[PerspectiveModule.G[397] ^ PerspectiveModule.G[398]] = G[399] ^ 0xDA04;
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
                Object object4 = PerspectiveModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u4e6d\u4e63\u4e68\u4e59\u4e5f\u4e53\u4e6c\u4e6a\u4e09\u4e65\u4e45\u4e06\u4e02\u4e00\u4e70\u4e45\u4e62\u4e52".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0xC202;
                        n3 += 31043;
                        n3 ^= 0x51C4;
                        n3 += 20165;
                        n3 -= 39207;
                        n3 += 13994;
                        n3 ^= 0x918B;
                        n3 -= 32749;
                        n3 -= 14063;
                        n3 ^= 0x8170;
                        n3 -= 9168;
                        n3 += 40626;
                        n3 -= 60025;
                        n3 += 48921;
                        cArray[i2] = (char)(n3 ^= 0xEAFB);
                    }
                    object4 = PerspectiveModule.A()[1] = new String(cArray);
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
                Object object5 = PerspectiveModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u46f7\u963b\u968d".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 30672;
                        n4 += 26832;
                        n4 += 41185;
                        n4 ^= 0x4956;
                        n4 ^= 0x6E08;
                        n4 += 45096;
                        n4 -= 51563;
                        n4 += 60843;
                        n4 -= 17355;
                        n4 ^= 0xE7DC;
                        n4 -= 23580;
                        cArray[i3] = (char)(n4 += 58462);
                    }
                    object5 = PerspectiveModule.A()[2] = new String(cArray);
                }
                f = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = PerspectiveModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\uc3b8\uc3bc\ud36a\uc3a6\uc3ba\uc3b9\uc3ba\uc3a6\uc347\uc342\uc3ba\ud36a\uc34c\uc347\ud358\ud35b\ud35b\ud360\ud365\ud35e".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 43730;
                    n5 += 54005;
                    n5 -= 53767;
                    n5 ^= 0xADB8;
                    n5 += 42328;
                    n5 ^= 0x7E8;
                    n5 -= 23480;
                    n5 -= 50392;
                    n5 += 7964;
                    n5 -= 2830;
                    n5 -= 53966;
                    cArray[i4] = (char)(n5 -= 36959);
                }
                object6 = PerspectiveModule.A()[3] = new String(cArray);
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
        PerspectiveModule.G[0x643B ^ 0x64DF] = 0xFFFF9B34 ^ 0x64DF;
        PerspectiveModule.G[0x2A5E ^ 0x2A94] = 0x2A01 ^ 0x2A94;
        PerspectiveModule.G[0x3A30 ^ 0x3BB3] = 0x7F7 ^ 0x3BB3;
        PerspectiveModule.G[0x9AED ^ 0x9A26] = 0xFFFF659F ^ 0x9A26;
        PerspectiveModule.G[0x7673 ^ 0x7646] = 0x760C ^ 0x7646;
        PerspectiveModule.G[0x4ECD ^ 0x4EB7] = 0x4E90 ^ 0x4EB7;
        PerspectiveModule.G[0x8E18 ^ 0x8F6D] = 0x96CD ^ 0x8F6D;
        PerspectiveModule.G[0x9FD3 ^ 0x9E88] = 0x58AE ^ 0x9E88;
        PerspectiveModule.G[0xECAC ^ 0xEC03] = 0xEC11 ^ 0xEC03;
        PerspectiveModule.G[0xADCA ^ 0xACF2] = 0x1AB38 ^ 0xACF2;
        PerspectiveModule.G[0x56C ^ 0x552] = 0xFFFFFAF3 ^ 0x552;
        PerspectiveModule.G[0x4E66 ^ 0x4E49] = 0x4E71 ^ 0x4E49;
        PerspectiveModule.G[0xA931 ^ 0xA83F] = 0xFFFF57FD ^ 0xA83F;
        PerspectiveModule.G[0x303E ^ 0x3073] = 0xFFFFCF81 ^ 0x3073;
        PerspectiveModule.G[0xB25D ^ 0xB2CD] = 0xFFFF4D33 ^ 0xB2CD;
        PerspectiveModule.G[0x3332 ^ 0x33D7] = 0x33EB ^ 0x33D7;
        PerspectiveModule.G[0xF7ED ^ 0xF6EB] = 0xF63B ^ 0xF6EB;
        PerspectiveModule.G[0xEE55 ^ 0xEEA6] = 0xFFFF1117 ^ 0xEEA6;
        PerspectiveModule.G[0xB4EE ^ 0xB4D6] = 0xB4BE ^ 0xB4D6;
        PerspectiveModule.G[0xDAB9 ^ 0xDB3E] = 0x42D5 ^ 0xDB3E;
        PerspectiveModule.G[0x10700 ^ 0x107B3] = 0x107B2 ^ 0x107B3;
        PerspectiveModule.G[0x5767 ^ 0x57C0] = 0x57E6 ^ 0x57C0;
        PerspectiveModule.G[0x681B ^ 0x68F0] = 0xFFFF9779 ^ 0x68F0;
        PerspectiveModule.G[0xF52C ^ 0xF5B7] = 0xF58E ^ 0xF5B7;
        PerspectiveModule.G[0xF328 ^ 0xF30E] = 0xF375 ^ 0xF30E;
        PerspectiveModule.G[0xC58B ^ 0xC518] = 0xC511 ^ 0xC518;
        PerspectiveModule.G[0x2F51 ^ 0x2FA6] = 0xFFFFD03C ^ 0x2FA6;
        PerspectiveModule.G[0x5DA7 ^ 0x5C8B] = 0xFA85 ^ 0x5C8B;
        PerspectiveModule.G[0xCAB2 ^ 0xCBB9] = 0xCBA1 ^ 0xCBB9;
        PerspectiveModule.G[0x7F32 ^ 0x7F17] = 0x7F57 ^ 0x7F17;
        PerspectiveModule.G[0x341 ^ 0x325] = 0xFFFFFCAD ^ 0x325;
        PerspectiveModule.G[0xDF6A ^ 0xDE30] = 0xDE30 ^ 0xDE30;
        PerspectiveModule.G[0x238C ^ 0x22F8] = 0x71BF ^ 0x22F8;
        PerspectiveModule.G[0xF378 ^ 0xF3EF] = 0xFFFF0C35 ^ 0xF3EF;
        PerspectiveModule.G[0x83DA ^ 0x8343] = 0x8366 ^ 0x8343;
        PerspectiveModule.G[0x8602 ^ 0x8649] = 0x8631 ^ 0x8649;
        PerspectiveModule.G[0x198E ^ 0x194A] = 0x553C ^ 0x194A;
        PerspectiveModule.G[0x9311 ^ 0x9257] = 0x2BB2 ^ 0x9257;
        PerspectiveModule.G[0xA538 ^ 0xA596] = 0xA5F0 ^ 0xA596;
        PerspectiveModule.G[0x9DFD ^ 0x9D8A] = 0xFFFF6240 ^ 0x9D8A;
        PerspectiveModule.G[0xB7CA ^ 0xB7AD] = 0xFFFF4837 ^ 0xB7AD;
        PerspectiveModule.G[0x302D ^ 0x3064] = 0x3053 ^ 0x3064;
        PerspectiveModule.G[0x3659 ^ 0x3717] = 0xEA6F ^ 0x3717;
        PerspectiveModule.G[0xA799 ^ 0xA745] = 0xA76A ^ 0xA745;
        PerspectiveModule.G[0x872B ^ 0x8664] = 0x5B1B ^ 0x8664;
        PerspectiveModule.G[0x73CA ^ 0x73AA] = 0x73B2 ^ 0x73AA;
        PerspectiveModule.G[0x2A44 ^ 0x2A94] = 0x2A9C ^ 0x2A94;
        PerspectiveModule.G[0xFF7 ^ 0xE93] = 0x2D81 ^ 0xE93;
        PerspectiveModule.G[0x2506 ^ 0x2457] = 0xF928 ^ 0x2457;
        PerspectiveModule.G[0xC531 ^ 0xC423] = 0xC422 ^ 0xC423;
        PerspectiveModule.G[0xB0AE ^ 0xB1B3] = 0x95E7 ^ 0xB1B3;
        PerspectiveModule.G[0x1577 ^ 0x15FE] = 0xFFFFEA1B ^ 0x15FE;
        PerspectiveModule.G[0x293C ^ 0x287C] = 0xFFFF23AB ^ 0x287C;
        PerspectiveModule.G[0xAD95 ^ 0xACB7] = 0x2538 ^ 0xACB7;
        PerspectiveModule.G[0x47EC ^ 0x4690] = 0x7495 ^ 0x4690;
        PerspectiveModule.G[0x374D ^ 0x371A] = 0xFFFFC830 ^ 0x371A;
        PerspectiveModule.G[0x387A ^ 0x381C] = 0x3840 ^ 0x381C;
        PerspectiveModule.G[0x7A7A ^ 0x7A4C] = 0x7A0B ^ 0x7A4C;
        PerspectiveModule.G[0x9469 ^ 0x940C] = 0x9440 ^ 0x940C;
        PerspectiveModule.G[0x500F ^ 0x5049] = 0xFFFFAF84 ^ 0x5049;
        PerspectiveModule.G[0x369A ^ 0x365F] = 0x2DA9 ^ 0x365F;
        PerspectiveModule.G[0x3810 ^ 0x3897] = 0x38E4 ^ 0x3897;
        PerspectiveModule.G[0x98A9 ^ 0x9826] = 0xFFFF6788 ^ 0x9826;
        PerspectiveModule.G[0x5C89 ^ 0x5DCB] = 0xC811 ^ 0x5DCB;
        PerspectiveModule.G[0x44D3 ^ 0x44DD] = 0x44F1 ^ 0x44DD;
        PerspectiveModule.G[0x9A56 ^ 0x9A89] = 0x9AFD ^ 0x9A89;
        PerspectiveModule.G[0xCEA1 ^ 0xCE11] = 0xFFFF31BD ^ 0xCE11;
        PerspectiveModule.G[0x6E36 ^ 0x6ED9] = 0x6E9A ^ 0x6ED9;
        PerspectiveModule.G[0xC2DD ^ 0xC2FD] = 0xFFFF3D4E ^ 0xC2FD;
        PerspectiveModule.G[0x6299 ^ 0x62D6] = 0x62B6 ^ 0x62D6;
        PerspectiveModule.G[0xC0E2 ^ 0xC02A] = 0x1D74 ^ 0xC02A;
        PerspectiveModule.G[0xBF65 ^ 0xBE1F] = 0x8C1A ^ 0xBE1F;
        PerspectiveModule.G[0x2E08 ^ 0x2E04] = 0x2E36 ^ 0x2E04;
        PerspectiveModule.G[0xD706 ^ 0xD630] = 0x1D191 ^ 0xD630;
        PerspectiveModule.G[0xFCE4 ^ 0xFCC8] = 0xFCD7 ^ 0xFCC8;
        PerspectiveModule.G[0xBB2 ^ 0xB0A] = 0xBE6 ^ 0xB0A;
        PerspectiveModule.G[0x102EE ^ 0x1027B] = 0xFFFEFDAE ^ 0x1027B;
        PerspectiveModule.G[0x616C ^ 0x61C8] = 0xFFFF9E7E ^ 0x61C8;
        PerspectiveModule.G[0x276E ^ 0x27AF] = 0x15FE ^ 0x27AF;
        PerspectiveModule.G[0x8908 ^ 0x8960] = 0x895A ^ 0x8960;
        PerspectiveModule.G[0x278F ^ 0x27A8] = 0xFFFFD81E ^ 0x27A8;
        PerspectiveModule.G[0xD233 ^ 0xD31E] = 0x750E ^ 0xD31E;
        PerspectiveModule.G[0x5245 ^ 0x53C5] = 0xF2E4 ^ 0x53C5;
        PerspectiveModule.G[0x288 ^ 0x3BF] = 0x10411 ^ 0x3BF;
        PerspectiveModule.G[0x30CC ^ 0x30ED] = 0xFFFFCF89 ^ 0x30ED;
        PerspectiveModule.G[0xFAC3 ^ 0xFB4C] = 0xFFFFDEE8 ^ 0xFB4C;
        PerspectiveModule.G[0x87C3 ^ 0x86C0] = 0x8652 ^ 0x86C0;
        PerspectiveModule.G[0xB9FC ^ 0xB8E8] = 0xB8E8 ^ 0xB8E8;
        PerspectiveModule.G[0x8B48 ^ 0x8B7A] = 0x8B4D ^ 0x8B7A;
        PerspectiveModule.G[0x10002 ^ 0x1003B] = 0xFFFEFFF6 ^ 0x1003B;
        PerspectiveModule.G[0xEA0 ^ 0xEF2] = 0xFFFFF12D ^ 0xEF2;
        PerspectiveModule.G[0x4980 ^ 0x489F] = 0x1176 ^ 0x489F;
        PerspectiveModule.G[0x2660 ^ 0x264A] = 0x2636 ^ 0x264A;
        PerspectiveModule.G[0xE91C ^ 0xE9FE] = 0xE994 ^ 0xE9FE;
        PerspectiveModule.G[0x77E7 ^ 0x76A6] = 0x82CD ^ 0x76A6;
        PerspectiveModule.G[0xF734 ^ 0xF788] = 0x7A65 ^ 0xF788;
        PerspectiveModule.G[0x8A6E ^ 0x8AC5] = 0xFFFF750F ^ 0x8AC5;
        PerspectiveModule.G[0x8EC5 ^ 0x8E07] = 0xF095 ^ 0x8E07;
        PerspectiveModule.G[0xBF90 ^ 0xBF47] = 0xFFFF4083 ^ 0xBF47;
        PerspectiveModule.G[0x1F01 ^ 0x1FD2] = 0x1FA1 ^ 0x1FD2;
        PerspectiveModule.G[0x208F ^ 0x205D] = 0x2023 ^ 0x205D;
        PerspectiveModule.G[0x1D ^ 0x144] = 0xBE3D ^ 0x144;
        PerspectiveModule.G[0xB5A7 ^ 0xB4AB] = 0xFFFF4B0C ^ 0xB4AB;
        PerspectiveModule.G[0x5877 ^ 0x59FB] = 0x5883 ^ 0x59FB;
        PerspectiveModule.G[0xDA52 ^ 0xDA2A] = 0xDBAF ^ 0xDA2A;
        PerspectiveModule.G[0x36FA ^ 0x37E4] = 0x6E0E ^ 0x37E4;
        PerspectiveModule.G[0xF8BB ^ 0xF9C8] = 0xFFFF555F ^ 0xF9C8;
        PerspectiveModule.G[0x5D12 ^ 0x5C37] = 0xD5B9 ^ 0x5C37;
        PerspectiveModule.G[0x100DB ^ 0x1003B] = 0xFFFEFFF2 ^ 0x1003B;
        PerspectiveModule.G[0x4A00 ^ 0x4A0B] = 0xFFFFB5FE ^ 0x4A0B;
        PerspectiveModule.G[0x99DE ^ 0x98EE] = 0x79AB ^ 0x98EE;
        PerspectiveModule.G[0xED1E ^ 0xEC11] = 0xEC39 ^ 0xEC11;
        PerspectiveModule.G[0xD10D ^ 0xD01B] = 0xD01A ^ 0xD01B;
        PerspectiveModule.G[0xB345 ^ 0xB256] = 0xB254 ^ 0xB256;
        PerspectiveModule.G[0x624E ^ 0x6221] = 0xFFFF9D82 ^ 0x6221;
        PerspectiveModule.G[0x1BC8 ^ 0x1B76] = 0xBB78 ^ 0x1B76;
        PerspectiveModule.G[0x6665 ^ 0x6779] = 0x436E ^ 0x6779;
        PerspectiveModule.G[0x3177 ^ 0x3167] = 0xFFFFCE90 ^ 0x3167;
        PerspectiveModule.G[0xABD7 ^ 0xAB88] = 0xFFFF545D ^ 0xAB88;
        PerspectiveModule.G[0xBCF5 ^ 0xBD98] = 0x44C4 ^ 0xBD98;
        PerspectiveModule.G[0x61B6 ^ 0x61AB] = 0xFFFF9E23 ^ 0x61AB;
        PerspectiveModule.G[0x317A ^ 0x3190] = 0x3187 ^ 0x3190;
        PerspectiveModule.G[0x7AC1 ^ 0x7A68] = 0xFFFF85DA ^ 0x7A68;
        PerspectiveModule.G[0x4DB ^ 0x4A8] = 0x4DA ^ 0x4A8;
        PerspectiveModule.G[0xF587 ^ 0xF4B3] = 0x93FA ^ 0xF4B3;
        PerspectiveModule.G[0xF282 ^ 0xF2D1] = 0xF2BC ^ 0xF2D1;
        PerspectiveModule.G[0x101AE ^ 0x101D2] = 0xFFFEFE1B ^ 0x101D2;
        PerspectiveModule.G[0x8B78 ^ 0x8BD2] = 0x8BFD ^ 0x8BD2;
        PerspectiveModule.G[0x1122 ^ 0x11A1] = 0xFFFFEE56 ^ 0x11A1;
        PerspectiveModule.G[0x2E42 ^ 0x2F2B] = 0x1EC1 ^ 0x2F2B;
        PerspectiveModule.G[0xC9C5 ^ 0xC847] = 0xF448 ^ 0xC847;
        PerspectiveModule.G[0xE99B ^ 0xE880] = 0xCCD4 ^ 0xE880;
        PerspectiveModule.G[0x1B2A ^ 0x1B97] = 0x7979 ^ 0x1B97;
        PerspectiveModule.G[0xD5CD ^ 0xD4B5] = 0xCD18 ^ 0xD4B5;
        PerspectiveModule.G[0xCC13 ^ 0xCC22] = 0xFFFF33CC ^ 0xCC22;
        PerspectiveModule.G[0x64C0 ^ 0x6593] = 0xC62A ^ 0x6593;
        PerspectiveModule.G[0xCD16 ^ 0xCDB6] = 0xCDDE ^ 0xCDB6;
        PerspectiveModule.G[0x9646 ^ 0x9720] = 0xB6FB ^ 0x9720;
        PerspectiveModule.G[0x1651 ^ 0x1678] = 0xFFFFE9C0 ^ 0x1678;
        PerspectiveModule.G[0x8D4B ^ 0x8DF4] = 0x437B ^ 0x8DF4;
        PerspectiveModule.G[0x102B4 ^ 0x10222] = 0x102A5 ^ 0x10222;
        PerspectiveModule.G[0x101C1 ^ 0x100A1] = 0x1869E ^ 0x100A1;
        PerspectiveModule.G[0xE76E ^ 0xE64A] = 0x6F98 ^ 0xE64A;
        PerspectiveModule.G[0x3ABD ^ 0x3B84] = 0x13C2A ^ 0x3B84;
        PerspectiveModule.G[0xD2F ^ 0xC05] = 0xAA1F ^ 0xC05;
        PerspectiveModule.G[0x7404 ^ 0x7556] = 0xD6EB ^ 0x7556;
        PerspectiveModule.G[0x8F70 ^ 0x8FF6] = 0x8F9A ^ 0x8FF6;
        PerspectiveModule.G[0x1D72 ^ 0x1DEC] = 0x1DFA ^ 0x1DEC;
        PerspectiveModule.G[0x617 ^ 0x618] = 0xFFFFF9E7 ^ 0x618;
        PerspectiveModule.G[0x6EB7 ^ 0x6EC1] = 0x6EE1 ^ 0x6EC1;
        PerspectiveModule.G[0x28B1 ^ 0x28A7] = 0xFFFFD72D ^ 0x28A7;
        PerspectiveModule.G[0x3AE4 ^ 0x3A90] = 0xFFFFC547 ^ 0x3A90;
        PerspectiveModule.G[0xC8F0 ^ 0xC83E] = 0xC84E ^ 0xC83E;
        PerspectiveModule.G[0x2983 ^ 0x29F1] = 0xFFFFD654 ^ 0x29F1;
        PerspectiveModule.G[0x1EE5 ^ 0x1FB2] = 0xA0CB ^ 0x1FB2;
        PerspectiveModule.G[0x3620 ^ 0x3735] = 0x3734 ^ 0x3735;
        PerspectiveModule.G[0xD79A ^ 0xD6B4] = 0x379C ^ 0xD6B4;
        PerspectiveModule.G[0x8D5E ^ 0x8C3F] = 0xAF24 ^ 0x8C3F;
        PerspectiveModule.G[0xBC28 ^ 0xBD6C] = 0x2886 ^ 0xBD6C;
        PerspectiveModule.G[0x33BC ^ 0x328F] = 0x55EA ^ 0x328F;
        PerspectiveModule.G[0x1071E ^ 0x10648] = 0x1B939 ^ 0x10648;
        PerspectiveModule.G[0xC90F ^ 0xC943] = 0xC925 ^ 0xC943;
        PerspectiveModule.G[0xA4CC ^ 0xA4C1] = 0xA4C5 ^ 0xA4C1;
        PerspectiveModule.G[0x1BB1 ^ 0x1B56] = 0x1B5C ^ 0x1B56;
        PerspectiveModule.G[0x9C6B ^ 0x9DE5] = 0x47E1 ^ 0x9DE5;
        PerspectiveModule.G[0x1870 ^ 0x1953] = 0x90DD ^ 0x1953;
        PerspectiveModule.G[0x1EF7 ^ 0x1EA3] = 0x1EF7 ^ 0x1EA3;
        PerspectiveModule.G[0x3964 ^ 0x39D6] = 0x39D6 ^ 0x39D6;
        PerspectiveModule.G[0x611B ^ 0x61A0] = 0xCA0B ^ 0x61A0;
        PerspectiveModule.G[0x1032C ^ 0x10396] = 0x1D811 ^ 0x10396;
        PerspectiveModule.G[0x2EAD ^ 0x2F9F] = 0x48F4 ^ 0x2F9F;
        PerspectiveModule.G[0xE448 ^ 0xE4E0] = 0xE49D ^ 0xE4E0;
        PerspectiveModule.G[0xA2B6 ^ 0xA2A2] = 0xA2EC ^ 0xA2A2;
        PerspectiveModule.G[0xD0C1 ^ 0xD055] = 0xD041 ^ 0xD055;
        PerspectiveModule.G[0x7972 ^ 0x79FA] = 0x79B2 ^ 0x79FA;
        PerspectiveModule.G[0x99BB ^ 0x99B2] = 0x99EA ^ 0x99B2;
        PerspectiveModule.G[0x10EDF ^ 0x10E6A] = 0x10E68 ^ 0x10E6A;
        PerspectiveModule.G[0x4B8F ^ 0x4B67] = 0x4B64 ^ 0x4B67;
        PerspectiveModule.G[0x596 ^ 0x4DA] = 0x5BD3 ^ 0x4DA;
        PerspectiveModule.G[0x8DA5 ^ 0x8CA5] = 0x8CD4 ^ 0x8CA5;
        PerspectiveModule.G[0xDB71 ^ 0xDB3B] = 0xFFFF24B9 ^ 0xDB3B;
        PerspectiveModule.G[0x6AA ^ 0x783] = 0xCD44 ^ 0x783;
        PerspectiveModule.G[0xA9BF ^ 0xA8C1] = 0x9E0 ^ 0xA8C1;
        PerspectiveModule.G[0x41CA ^ 0x41B4] = 0xFFFFBF86 ^ 0x41B4;
        PerspectiveModule.G[0xE0F2 ^ 0xE17F] = 0x3B77 ^ 0xE17F;
        PerspectiveModule.G[0x8894 ^ 0x889E] = 0xFFFF7702 ^ 0x889E;
        PerspectiveModule.G[0x5A66 ^ 0x5AEA] = 0x5AFF ^ 0x5AEA;
        PerspectiveModule.G[0xD457 ^ 0xD45F] = 0xD441 ^ 0xD45F;
        PerspectiveModule.G[0xD565 ^ 0xD5A6] = 0x8552 ^ 0xD5A6;
        PerspectiveModule.G[0xD355 ^ 0xD3D1] = 0xFFFF2C1E ^ 0xD3D1;
        PerspectiveModule.G[0x372B ^ 0x3714] = 0xFFFFC8AC ^ 0x3714;
        PerspectiveModule.G[0x7F36 ^ 0x7F01] = 0x7F40 ^ 0x7F01;
        PerspectiveModule.G[0xD266 ^ 0xD33E] = 0xFFFF9380 ^ 0xD33E;
        PerspectiveModule.G[0xFCD2 ^ 0xFC0C] = 0xFC22 ^ 0xFC0C;
        PerspectiveModule.G[0xD429 ^ 0xD428] = 0xD429 ^ 0xD428;
        PerspectiveModule.G[0x10637 ^ 0x10754] = 0x12428 ^ 0x10754;
        PerspectiveModule.G[0x5039 ^ 0x50A1] = 0xFFFFAF01 ^ 0x50A1;
        PerspectiveModule.G[0x4C72 ^ 0x4D49] = 0x1151 ^ 0x4D49;
        PerspectiveModule.G[0x2800 ^ 0x28E3] = 0x2882 ^ 0x28E3;
        PerspectiveModule.G[0x5B8A ^ 0x5B26] = 0x5B52 ^ 0x5B26;
        PerspectiveModule.G[0x1E01 ^ 0x1F7E] = 0xFFFF41F3 ^ 0x1F7E;
        PerspectiveModule.G[0xE574 ^ 0xE599] = 0xFFFF1A40 ^ 0xE599;
        PerspectiveModule.G[0xC9A ^ 0xCCB] = 0xC80 ^ 0xCCB;
        PerspectiveModule.G[0xB3BF ^ 0xB351] = 0xB30B ^ 0xB351;
        PerspectiveModule.G[0xB739 ^ 0xB79C] = 0xB79E ^ 0xB79C;
        PerspectiveModule.G[0xC5D3 ^ 0xC4CA] = 0x4799 ^ 0xC4CA;
        PerspectiveModule.G[0xAF84 ^ 0xAF05] = 0xFFFF50E3 ^ 0xAF05;
        PerspectiveModule.G[0xF917 ^ 0xF89E] = 0xF9FB ^ 0xF89E;
        PerspectiveModule.G[0x3B8E ^ 0x3AE4] = 0xB1A ^ 0x3AE4;
        PerspectiveModule.G[0x1A75 ^ 0x1AF7] = 0xFFFFE538 ^ 0x1AF7;
        PerspectiveModule.G[0x2DBF ^ 0x2DFC] = 0x2D89 ^ 0x2DFC;
        PerspectiveModule.G[0x5C7F ^ 0x5D09] = 0x44A4 ^ 0x5D09;
        PerspectiveModule.G[0xE7D1 ^ 0xE6E0] = 0x7C1 ^ 0xE6E0;
        PerspectiveModule.G[0xF3BB ^ 0xF2FE] = 0x6726 ^ 0xF2FE;
        PerspectiveModule.G[0x293B ^ 0x284C] = 0xFFFFCE6E ^ 0x284C;
        PerspectiveModule.G[0x8DFE ^ 0x8DCA] = 0x8DA3 ^ 0x8DCA;
        PerspectiveModule.G[0x2967 ^ 0x286D] = 0x2849 ^ 0x286D;
        PerspectiveModule.G[0x954C ^ 0x9407] = 0xCB56 ^ 0x9407;
        PerspectiveModule.G[0x6680 ^ 0x67D5] = 0xC46C ^ 0x67D5;
        PerspectiveModule.G[0xA2F9 ^ 0xA3EE] = 0xA3EE ^ 0xA3EE;
        PerspectiveModule.G[0x712B ^ 0x718D] = 0x71A8 ^ 0x718D;
        PerspectiveModule.G[0xDBE7 ^ 0xDB6D] = 0xDB05 ^ 0xDB6D;
        PerspectiveModule.G[0xA256 ^ 0xA32D] = 0xFFFF6EB4 ^ 0xA32D;
        PerspectiveModule.G[0xAD78 ^ 0xAC45] = 0xF05D ^ 0xAC45;
        PerspectiveModule.G[0x107FB ^ 0x107DF] = 0x107C4 ^ 0x107DF;
        PerspectiveModule.G[0xFC3B ^ 0xFD71] = 0xA22B ^ 0xFD71;
        PerspectiveModule.G[0x76B1 ^ 0x76E1] = 0x7688 ^ 0x76E1;
        PerspectiveModule.G[0xA2C1 ^ 0xA219] = 0xFFFF5DEA ^ 0xA219;
        PerspectiveModule.G[0xEEDB ^ 0xEEF3] = 0xFFFF110E ^ 0xEEF3;
        PerspectiveModule.G[0xCDC8 ^ 0xCC8F] = 0x756F ^ 0xCC8F;
        PerspectiveModule.G[0x6A6D ^ 0x6B14] = 0x5916 ^ 0x6B14;
        PerspectiveModule.G[0x862C ^ 0x86A7] = 0xFFFF796A ^ 0x86A7;
        PerspectiveModule.G[0xD1EA ^ 0xD0CC] = 0x1A0B ^ 0xD0CC;
        PerspectiveModule.G[0xCF56 ^ 0xCF23] = 0xFFFF30E9 ^ 0xCF23;
        PerspectiveModule.G[0x43B7 ^ 0x43A5] = 0x4364 ^ 0x43A5;
        PerspectiveModule.G[0x15F8 ^ 0x1531] = 0x1531 ^ 0x1531;
        PerspectiveModule.G[0xF978 ^ 0xF909] = 0xF962 ^ 0xF909;
        PerspectiveModule.G[0xB88 ^ 0xB78] = 0xB05 ^ 0xB78;
        PerspectiveModule.G[0x9E42 ^ 0x9F1C] = 0x1923 ^ 0x9F1C;
        PerspectiveModule.G[0x18FC ^ 0x18FC] = 0x189A ^ 0x18FC;
        PerspectiveModule.G[0x4D2B ^ 0x4D08] = 0xFFFFB2BD ^ 0x4D08;
        PerspectiveModule.G[0x628 ^ 0x6DD] = 0x6BF ^ 0x6DD;
        PerspectiveModule.G[0x342A ^ 0x34B7] = 0xFFFFCB38 ^ 0x34B7;
        PerspectiveModule.G[0xDCBB ^ 0xDD9C] = 0x175B ^ 0xDD9C;
        PerspectiveModule.G[0x9354 ^ 0x9310] = 0xFFFF6C86 ^ 0x9310;
        PerspectiveModule.G[0xA8D4 ^ 0xA8F9] = 0xFFFF573C ^ 0xA8F9;
        PerspectiveModule.G[0xBC56 ^ 0xBDDE] = 0x247F ^ 0xBDDE;
        PerspectiveModule.G[0x107AA ^ 0x10771] = 0xFFFEF883 ^ 0x10771;
        PerspectiveModule.G[0x5118 ^ 0x5196] = 0x51C6 ^ 0x5196;
        PerspectiveModule.G[0x6D43 ^ 0x6D3A] = 0x6D08 ^ 0x6D3A;
        PerspectiveModule.G[0x8E20 ^ 0x8F01] = 0xD6E8 ^ 0x8F01;
        PerspectiveModule.G[0x784E ^ 0x789F] = 0x78C9 ^ 0x789F;
        PerspectiveModule.G[0x53D8 ^ 0x5344] = 0x5321 ^ 0x5344;
        PerspectiveModule.G[0x2FC ^ 0x3FB] = 0xFFFFFC01 ^ 0x3FB;
        PerspectiveModule.G[0xFCC4 ^ 0xFCD5] = 0xFFFF0303 ^ 0xFCD5;
        PerspectiveModule.G[0xA408 ^ 0xA463] = 0xFFFF5B89 ^ 0xA463;
        PerspectiveModule.G[0x14B1 ^ 0x1477] = 0xCBCC ^ 0x1477;
        PerspectiveModule.G[0x2BF5 ^ 0x2B94] = 0x2B86 ^ 0x2B94;
        PerspectiveModule.G[0x777 ^ 0x7AD] = 0xFFFFF877 ^ 0x7AD;
        PerspectiveModule.G[0x4D0A ^ 0x4DC5] = 0xFFFFB258 ^ 0x4DC5;
        PerspectiveModule.G[0x81CF ^ 0x81D5] = 0xFFFF7E42 ^ 0x81D5;
        PerspectiveModule.G[0xE2AC ^ 0xE2B2] = 0xE22A ^ 0xE2B2;
        PerspectiveModule.G[0x4FD8 ^ 0x4FE5] = 0xFFFFB036 ^ 0x4FE5;
        PerspectiveModule.G[0x1BA1 ^ 0x1BB6] = 0xFFFFE470 ^ 0x1BB6;
        PerspectiveModule.G[0xDB2A ^ 0xDB6F] = 0xDB04 ^ 0xDB6F;
        PerspectiveModule.G[0xB7A9 ^ 0xB795] = 0xB7C7 ^ 0xB795;
        PerspectiveModule.G[0x3897 ^ 0x39F2] = 0x1830 ^ 0x39F2;
        PerspectiveModule.G[0x1014B ^ 0x101FA] = 0x101F9 ^ 0x101FA;
        PerspectiveModule.G[0x1091E ^ 0x10831] = 0x1E910 ^ 0x10831;
        PerspectiveModule.G[0x29F5 ^ 0x290C] = 0xFFFFD6FE ^ 0x290C;
        PerspectiveModule.G[0xCA54 ^ 0xCA16] = 0xCB45 ^ 0xCA16;
        PerspectiveModule.G[0x9781 ^ 0x9713] = 0x973D ^ 0x9713;
        PerspectiveModule.G[0x7830 ^ 0x789D] = 0xFFFF8757 ^ 0x789D;
        PerspectiveModule.G[0x5CAC ^ 0x5C56] = 0x5C5F ^ 0x5C56;
        PerspectiveModule.G[0x8C37 ^ 0x8C55] = 0xFFFF7383 ^ 0x8C55;
        PerspectiveModule.G[0x109EA ^ 0x10882] = 0x12959 ^ 0x10882;
        PerspectiveModule.G[0x173D ^ 0x179C] = 0xFFFFE82C ^ 0x179C;
        PerspectiveModule.G[0x4258 ^ 0x4294] = 0x42BA ^ 0x4294;
        PerspectiveModule.G[0xDAAC ^ 0xDA53] = 0xDA76 ^ 0xDA53;
        PerspectiveModule.G[0x6892 ^ 0x699B] = 0xFFFF9663 ^ 0x699B;
        PerspectiveModule.G[0xAFB2 ^ 0xAFDF] = 0xFFFF503A ^ 0xAFDF;
        PerspectiveModule.G[0xE87D ^ 0xE8BA] = 0xA6A6 ^ 0xE8BA;
        PerspectiveModule.G[0xF3F9 ^ 0xF2F8] = 0xFFFF0D00 ^ 0xF2F8;
        PerspectiveModule.G[0xDAD6 ^ 0xDB86] = 0xFFFFF948 ^ 0xDB86;
        PerspectiveModule.G[0xDB50 ^ 0xDA37] = 0xFFFF0407 ^ 0xDA37;
        PerspectiveModule.G[0x6B84 ^ 0x6ABA] = 0x9ED7 ^ 0x6ABA;
        PerspectiveModule.G[0xB834 ^ 0xB968] = 0x7F6E ^ 0xB968;
        PerspectiveModule.G[0xF4D0 ^ 0xF441] = 0xF471 ^ 0xF441;
        PerspectiveModule.G[0x5ACE ^ 0x5BB3] = 0xFA84 ^ 0x5BB3;
        PerspectiveModule.G[0x33BE ^ 0x33B8] = 0xFFFFCC79 ^ 0x33B8;
        PerspectiveModule.G[0x10543 ^ 0x1041C] = 0xFFFE7DD7 ^ 0x1041C;
        PerspectiveModule.G[0xD16B ^ 0xD054] = 0x243F ^ 0xD054;
        PerspectiveModule.G[0xA074 ^ 0xA1F2] = 0x3853 ^ 0xA1F2;
        PerspectiveModule.G[0xEE4D ^ 0xEE4A] = 0xEE6C ^ 0xEE4A;
        PerspectiveModule.G[0xDA2A ^ 0xDA7F] = 0xDA3A ^ 0xDA7F;
        PerspectiveModule.G[0xA7D5 ^ 0xA76C] = 0xF1CB ^ 0xA76C;
        PerspectiveModule.G[0xBD86 ^ 0xBD24] = 0xFFFF42E9 ^ 0xBD24;
        PerspectiveModule.G[0xE39E ^ 0xE36C] = 0xE306 ^ 0xE36C;
        PerspectiveModule.G[0x7D3F ^ 0x7DBF] = 0x7DB3 ^ 0x7DBF;
        PerspectiveModule.G[0x71D3 ^ 0x7165] = 0x7165 ^ 0x7165;
        PerspectiveModule.G[0x1FD ^ 0x180] = 0x1EE ^ 0x180;
        PerspectiveModule.G[0x2FA ^ 0x2D4] = 0x287 ^ 0x2D4;
        PerspectiveModule.G[0x2F25 ^ 0x2FC9] = 0x2FB9 ^ 0x2FC9;
        PerspectiveModule.G[0x1D8C ^ 0x1CB0] = 0x40D9 ^ 0x1CB0;
        PerspectiveModule.G[0xE501 ^ 0xE410] = 0xFFFF1BF0 ^ 0xE410;
        PerspectiveModule.G[0x498E ^ 0x48C3] = 0x1792 ^ 0x48C3;
        PerspectiveModule.G[0x96D0 ^ 0x9631] = 0x962C ^ 0x9631;
        PerspectiveModule.G[0x2C7 ^ 0x29A] = 0xFFFFFD4C ^ 0x29A;
        PerspectiveModule.G[0x5DC7 ^ 0x5DDC] = 0xFFFFA2FB ^ 0x5DDC;
        PerspectiveModule.G[0x8690 ^ 0x8650] = 0xB8C0 ^ 0x8650;
        PerspectiveModule.G[0x4455 ^ 0x4501] = 0xFFFF1928 ^ 0x4501;
        PerspectiveModule.G[0x1584 ^ 0x15DD] = 0x1580 ^ 0x15DD;
        PerspectiveModule.G[0xB6D5 ^ 0xB7BA] = 0xFFFFB15E ^ 0xB7BA;
        PerspectiveModule.G[0x88F4 ^ 0x8805] = 0xFFFF77FE ^ 0x8805;
        PerspectiveModule.G[0x26DB ^ 0x2695] = 0xFFFFD942 ^ 0x2695;
        PerspectiveModule.G[0x6675 ^ 0x662B] = 0x667E ^ 0x662B;
        PerspectiveModule.G[0x9EC7 ^ 0x9FA5] = 0xBCB7 ^ 0x9FA5;
        PerspectiveModule.G[0x7D15 ^ 0x7DEB] = 0xFFFF8200 ^ 0x7DEB;
        PerspectiveModule.G[0xC6A5 ^ 0xC6BD] = 0xC6F6 ^ 0xC6BD;
        PerspectiveModule.G[0xB4D3 ^ 0xB4BF] = 0xFFFF4B26 ^ 0xB4BF;
        PerspectiveModule.G[0x6E8D ^ 0x6FC4] = 0xD624 ^ 0x6FC4;
        PerspectiveModule.G[0xCA9 ^ 0xC5F] = 0xFFFFF3EC ^ 0xC5F;
        PerspectiveModule.G[0x8294 ^ 0x83E6] = 0xD0A1 ^ 0x83E6;
        PerspectiveModule.G[0xA515 ^ 0xA54F] = 0xFFFF5A11 ^ 0xA54F;
        PerspectiveModule.G[0x140B ^ 0x1468] = 0x1454 ^ 0x1468;
        PerspectiveModule.G[0xCCA8 ^ 0xCDB2] = 0xE9EA ^ 0xCDB2;
        PerspectiveModule.G[0x8CF9 ^ 0x8C4D] = 0x8C4D ^ 0x8C4D;
        PerspectiveModule.G[0x57C7 ^ 0x579B] = 0x57E0 ^ 0x579B;
        PerspectiveModule.G[0x98AC ^ 0x99C0] = 0xA83E ^ 0x99C0;
        PerspectiveModule.G[0x10315 ^ 0x10310] = 0x10323 ^ 0x10310;
        PerspectiveModule.G[0x8503 ^ 0x85FF] = 0xFFFF7A78 ^ 0x85FF;
        PerspectiveModule.G[0xBB50 ^ 0xBA3B] = 0xFFFF7463 ^ 0xBA3B;
        PerspectiveModule.G[0x802A ^ 0x80DE] = 0xFFFF7F2F ^ 0x80DE;
        PerspectiveModule.G[0xE0B1 ^ 0xE03C] = 0xFFFF1F65 ^ 0xE03C;
        PerspectiveModule.G[0x42A6 ^ 0x4295] = 0xFFFFBDF8 ^ 0x4295;
        PerspectiveModule.G[0x103E ^ 0x1079] = 0x1061 ^ 0x1079;
        PerspectiveModule.G[0xD7AD ^ 0xD7E5] = 0xFFFF2870 ^ 0xD7E5;
        PerspectiveModule.G[0xB8D4 ^ 0xB84E] = 0xB85D ^ 0xB84E;
        PerspectiveModule.G[0x5779 ^ 0x567B] = 0xFFFFA9DC ^ 0x567B;
        PerspectiveModule.G[0xED97 ^ 0xED5A] = 0xFFFF1217 ^ 0xED5A;
        PerspectiveModule.G[0xC4B5 ^ 0xC534] = 0xF92A ^ 0xC534;
        PerspectiveModule.G[0xE480 ^ 0xE504] = 0xD90B ^ 0xE504;
        PerspectiveModule.G[0x472 ^ 0x48F] = 0xFFFFFB21 ^ 0x48F;
        PerspectiveModule.G[0x10BCD ^ 0x10B18] = 0xFFFEF4E9 ^ 0x10B18;
        PerspectiveModule.G[0xC938 ^ 0xC9EE] = 0xFFFF361F ^ 0xC9EE;
        PerspectiveModule.G[0x10CCB ^ 0x10C4E] = 0xFFFEF3AB ^ 0x10C4E;
        PerspectiveModule.G[0xC070 ^ 0xC101] = 0x925E ^ 0xC101;
        PerspectiveModule.G[0x7173 ^ 0x7076] = 0x7058 ^ 0x7076;
        PerspectiveModule.G[0xCA16 ^ 0xCA4E] = 0xFFFF35C8 ^ 0xCA4E;
        PerspectiveModule.G[0x5759 ^ 0x57EE] = 0x57EE ^ 0x57EE;
        PerspectiveModule.G[0xCEFB ^ 0xCFFF] = 0xFFFF3062 ^ 0xCFFF;
        PerspectiveModule.G[0x75BE ^ 0x74AE] = 0xFFFF8B16 ^ 0x74AE;
        PerspectiveModule.G[0xB98 ^ 0xBC3] = 0xBE4 ^ 0xBC3;
        PerspectiveModule.G[0xCBB ^ 0xC81] = 0xFFFFF34B ^ 0xC81;
        PerspectiveModule.G[0x10B0 ^ 0x1048] = 0xFFFFEFC0 ^ 0x1048;
        PerspectiveModule.G[0xD81B ^ 0xD99E] = 0x4028 ^ 0xD99E;
        PerspectiveModule.G[0xF340 ^ 0xF399] = 0xFFFF0C35 ^ 0xF399;
        PerspectiveModule.G[0x5D ^ 0x76] = 0x4B ^ 0x76;
        PerspectiveModule.G[0x4550 ^ 0x44DB] = 0xFFFFBA4D ^ 0x44DB;
        PerspectiveModule.G[0xE6EC ^ 0xE605] = 0xE621 ^ 0xE605;
        PerspectiveModule.G[0xAF33 ^ 0xAF2C] = 0xAF67 ^ 0xAF2C;
        PerspectiveModule.G[0x75F1 ^ 0x74DA] = 0xD2CA ^ 0x74DA;
        PerspectiveModule.G[0x8AC2 ^ 0x8AAB] = 0x8A95 ^ 0x8AAB;
        PerspectiveModule.G[0xD92E ^ 0xD96E] = 0xFFFF26FB ^ 0xD96E;
        PerspectiveModule.G[0xCF2F ^ 0xCF14] = 0xCF09 ^ 0xCF14;
        PerspectiveModule.G[0x8ADC ^ 0x8BAC] = 0x72F0 ^ 0x8BAC;
        PerspectiveModule.G[0x18E2 ^ 0x18C0] = 0xFFFFE70F ^ 0x18C0;
        PerspectiveModule.G[0x9085 ^ 0x9090] = 0x90AD ^ 0x9090;
        PerspectiveModule.G[0xD0E0 ^ 0xD09F] = 0xFFFF2F29 ^ 0xD09F;
        PerspectiveModule.G[0x10059 ^ 0x100FA] = 0xFFFEFF10 ^ 0x100FA;
        PerspectiveModule.G[0x6666 ^ 0x6662] = 0xFFFF99FC ^ 0x6662;
        PerspectiveModule.G[0xBED0 ^ 0xBF93] = 0x2A4B ^ 0xBF93;
        PerspectiveModule.G[0x95FF ^ 0x94F7] = 0xFFFF6B52 ^ 0x94F7;
        PerspectiveModule.G[0xC2CD ^ 0xC2CE] = 0xFFFF3D16 ^ 0xC2CE;
        PerspectiveModule.G[0xB95 ^ 0xB0A] = 0xFFFFF422 ^ 0xB0A;
        PerspectiveModule.G[0x31FC ^ 0x30A1] = 0xB685 ^ 0x30A1;
        PerspectiveModule.G[0xEC95 ^ 0xEC48] = 0xEC48 ^ 0xEC48;
        PerspectiveModule.G[0x2A18 ^ 0x2A72] = 0x2A46 ^ 0x2A72;
        PerspectiveModule.G[0xDFE4 ^ 0xDEDE] = 0x82CB ^ 0xDEDE;
        PerspectiveModule.G[0xD281 ^ 0xD2F1] = 0xD2E3 ^ 0xD2F1;
        PerspectiveModule.G[0x1878 ^ 0x194D] = 0x7E28 ^ 0x194D;
        PerspectiveModule.G[0xDF04 ^ 0xDF6A] = 0xFFFF20CE ^ 0xDF6A;
        PerspectiveModule.G[0xD691 ^ 0xD7FF] = 0x2EA3 ^ 0xD7FF;
        PerspectiveModule.G[0x30B3 ^ 0x3139] = 0x3041 ^ 0x3139;
        PerspectiveModule.G[0x938D ^ 0x938F] = 0xFFFF6C2E ^ 0x938F;
        PerspectiveModule.G[0x817F ^ 0x8067] = 0x324 ^ 0x8067;
        PerspectiveModule.G[0x105AE ^ 0x105F8] = 0xFFFEFA09 ^ 0x105F8;
        PerspectiveModule.G[0xA865 ^ 0xA879] = 0xFFFF57E6 ^ 0xA879;
        PerspectiveModule.G[0x10C47 ^ 0x10C3C] = 0x10CB9 ^ 0x10C3C;
        PerspectiveModule.G[0x6CDE ^ 0x6DD3] = 0xFFFF9235 ^ 0x6DD3;
        PerspectiveModule.G[0xF764 ^ 0xF77D] = 0xFFFF08A1 ^ 0xF77D;
        PerspectiveModule.G[0xB357 ^ 0xB27F] = 0x78AF ^ 0xB27F;
        PerspectiveModule.G[0x1D33 ^ 0x1C7B] = 0xFFFF5A38 ^ 0x1C7B;
        PerspectiveModule.G[0xE915 ^ 0xE925] = 0xE901 ^ 0xE925;
        PerspectiveModule.G[0x86FB ^ 0x862F] = 0xFFFF79AC ^ 0x862F;
        PerspectiveModule.G[0x816F ^ 0x804F] = 0xD9E7 ^ 0x804F;
        PerspectiveModule.G[0x7C74 ^ 0x7C67] = 0xFFFF83E9 ^ 0x7C67;
        PerspectiveModule.G[0x101F2 ^ 0x10109] = 0x1016B ^ 0x10109;
        PerspectiveModule.G[0xEDA3 ^ 0xED45] = 0xED53 ^ 0xED45;
        PerspectiveModule.G[0x591D ^ 0x595C] = 0x5951 ^ 0x595C;
    }
}

