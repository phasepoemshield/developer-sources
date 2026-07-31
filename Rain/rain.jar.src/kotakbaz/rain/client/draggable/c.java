/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.draggable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.draggable.D;
import kotakbaz.rain.client.draggable.Draggable;
import kotakbaz.rain.client.draggable.animation.AnimationUtil;
import kotakbaz.rain.client.draggable.animation.Easing;
import kotakbaz.rain.client.draggable.d_0;
import kotakbaz.rain.client.listener.listeners.InputListener;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003B)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b\u0002\u0010\u000bJ\r\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u0003J\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012\u00a2\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0012\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012\u00a2\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0002\u00a2\u0006\u0004\b \u0010\u0003J?\u0010#\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b#\u0010$R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068\u0006@BX\u0087.\u00a2\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b/\u0010%R\u0016\u00100\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u0010%R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b1\u0010%R\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b2\u0010%R$\u00103\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u0010\u0019R\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b!\u0010%\u001a\u0004\b5\u0010'\"\u0004\b6\u0010)R\"\u0010\"\u001a\u00020\b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\"\u0010%\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048\u0006@BX\u0086.\u00a2\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b?\u0010>\u00a8\u0006@"}, d2={"Lkotakbaz/rain/client/draggable/Draggable;", "", "<init>", "()V", "Lkotakbaz/rain/module/Module;", "module", "", "name", "", "initialXVal", "initialYVal", "(Lkotakbaz/rain/module/Module;Ljava/lang/String;FF)V", "", "onDraw", "x", "y", "snapTo", "(FF)V", "", "button", "action", "onClick", "(II)V", "", "isHovering", "()Z", "mouseX", "()I", "mouseY", "value", "roundToHalf", "(F)F", "clampTarget", "width", "height", "hovered", "(FFFFFF)Z", "F", "getX", "()F", "setX", "(F)V", "getY", "setY", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "targetX", "targetY", "offsetX", "offsetY", "isDragging", "Z", "getWidth", "setWidth", "getHeight", "setHeight", "Lkotakbaz/rain/module/Module;", "getModule", "()Lkotakbaz/rain/module/Module;", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "xAnimation", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "yAnimation", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nkotakbaz/rain/client/draggable/Draggable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,126:1\n1807#2,3:127\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nkotakbaz/rain/client/draggable/Draggable\n*L\n82#1:127,3\n*E\n"})
public final class c {
    @Expose
    @SerializedName(value="x")
    private float x;
    @Expose
    @SerializedName(value="y")
    private float y;
    @Expose
    @SerializedName(value="name")
    private String name;
    private float a;
    private float A;
    private float b;
    private float B;
    private boolean c;
    private float C;
    private float d;
    private Module D;
    @NotNull
    private final AnimationUtil e;
    @NotNull
    private final AnimationUtil E;
    private static Object[] f;
    private static Object g;
    private static Object[] G;
    private static Object[] F;
    private static Object[] h;
    public static int[] H;

    private c() {
        this.e = new AnimationUtil();
        this.E = new AnimationUtil();
    }

    public final float getX() {
        return this.x;
    }

    public final void setX(float f2) {
        this.x = f2;
    }

    public final float getY() {
        return this.y;
    }

    public final void setY(float f2) {
        this.y = f2;
    }

    @NotNull
    public final String getName() {
        String string = this.name;
        if (string != null) {
            return string;
        }
        int n2 = H[0];
        n2 -= H[1];
        Intrinsics.throwUninitializedPropertyAccessException((String)f[n2 += H[2]]);
        return null;
    }

    public final boolean isDragging() {
        return this.c;
    }

    public final float getWidth() {
        return this.C;
    }

    public final void setWidth(float f2) {
        this.C = f2;
    }

    public final float getHeight() {
        return this.d;
    }

    public final void setHeight(float f2) {
        this.d = f2;
    }

    @NotNull
    public final Module getModule() {
        Module module = this.D;
        if (module != null) {
            return module;
        }
        int n2 = H[3];
        n2 -= H[4];
        Intrinsics.throwUninitializedPropertyAccessException((String)f[n2 -= H[5]]);
        return null;
    }

    public c(@NotNull Module module, @NotNull String name, float initialXVal, float initialYVal) {
        int n2 = H[6];
        n2 ^= H[7];
        Intrinsics.checkNotNullParameter(module, (String)f[n2 ^= H[8]]);
        int n3 = H[9];
        n3 += H[10];
        Intrinsics.checkNotNullParameter(name, (String)f[n3 -= H[11]]);
        this();
        this.D = module;
        this.name = name;
        this.snapTo(initialXVal, initialYVal);
    }

    public final void onDraw() {
        if (this.c) {
            d_0 d_02 = Draggable.INSTANCE.snap(this, (float)this.mouseX() - this.b, (float)this.mouseY() - this.B);
            this.a = d_02.getX();
            this.A = d_02.getY();
            this.clampTarget();
        }
        this.e.update();
        this.E.update();
        this.e.run(this.a, 70L, Easing.b);
        this.E.run(this.A, 70L, Easing.b);
        this.x = this.roundToHalf(this.e.get());
        this.y = this.roundToHalf(this.E.get());
    }

    public final void snapTo(float x2, float y) {
        float f2 = this.roundToHalf(x2);
        float f3 = this.roundToHalf(y);
        this.x = f2;
        this.y = f3;
        this.a = f2;
        this.A = f3;
        this.e.snap(f2);
        this.E.snap(f3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onClick(int button, int action) {
        long l2 = 6345872769145381474L;
        long l3 = 6020396903375677086L;
        if (button == 0 && this.isHovering()) {
            int n2 = H[12];
            n2 -= H[13];
            if (action == (n2 += H[14])) {
                int n3;
                block5: {
                    Collection<c> collection = kotakbaz.rain.client.draggable.D.INSTANCE.getDraggables().values();
                    int n4 = H[15];
                    n4 -= H[16];
                    int n5 = H[18];
                    n5 -= H[19];
                    Intrinsics.checkNotNullExpressionValue(collection, (String)f[n4 -= H[17]] + (String)f[n5 ^= H[20]]);
                    Iterable iterable = collection;
                    long l4 = l2;
                    int n6 = H[21];
                    n6 -= H[22];
                    l2 = l4 ^ (0L ^ l4) & -1L << (n6 -= H[23]);
                    if (((Collection)iterable).isEmpty()) {
                        int n7 = H[24];
                        n7 -= H[25];
                        n3 = n7 += H[26];
                    } else {
                        for (Object t2 : iterable) {
                            c c2 = (c)t2;
                            long l5 = l2;
                            int n8 = H[27];
                            n8 += H[28];
                            l2 = l5 ^ (0L ^ l5) & -1L >>> (n8 -= H[29]);
                            if (!c2.c) continue;
                            int n9 = H[30];
                            n9 ^= H[31];
                            n3 = n9 += H[32];
                            break block5;
                        }
                        int n10 = H[33];
                        n10 += H[34];
                        n3 = n10 ^= H[35];
                    }
                }
                int n11 = H[36];
                n11 += H[37];
                long l6 = l3;
                int n12 = H[39];
                n12 += H[40];
                l3 = l6 ^ ((long)n3 << (n11 -= H[38]) ^ l6) & -1L << (n12 -= H[41]);
                int n13 = H[42];
                n13 -= H[43];
                if ((int)(l3 >>> (n13 ^= H[44])) != 0) return;
                int n14 = H[45];
                n14 -= H[46];
                this.c = n14 += H[47];
                this.b = (float)this.mouseX() - this.x;
                this.B = (float)this.mouseY() - this.y;
                return;
            }
        }
        if (button != 0 || action != 0) return;
        int n15 = H[48];
        n15 -= H[49];
        this.c = n15 ^= H[50];
    }

    public final boolean isHovering() {
        return this.hovered(this.mouseX(), this.mouseY(), this.x, this.y, this.C, this.d);
    }

    public final int mouseX() {
        return InputListener.INSTANCE.mouseX();
    }

    public final int mouseY() {
        return InputListener.INSTANCE.mouseY();
    }

    private final float roundToHalf(float value2) {
        return (float)Math.rint(value2 * 2.0f) / 2.0f;
    }

    private final void clampTarget() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) {
            return;
        }
        MinecraftClient minecraftClient2 = minecraftClient;
        Window window = minecraftClient2.getWindow();
        if (window == null) {
            return;
        }
        Window window2 = window;
        float f2 = 3.0f;
        float f3 = window2.getScaledWidth();
        float f4 = window2.getScaledHeight();
        if (this.a < f2) {
            this.a = f2;
        }
        if (this.A < f2) {
            this.A = f2;
        }
        if (this.a + this.C > f3 - f2) {
            this.a = f3 - this.C - f2;
        }
        if (this.A + this.d > f4 - f2) {
            this.A = f4 - this.d - f2;
        }
    }

    private final boolean hovered(float mouseX, float mouseY, float x2, float y, float width2, float height) {
        int n2;
        if (mouseX >= x2 && mouseY >= y && mouseX <= x2 + width2 && mouseY <= y + height) {
            int n3 = H[51];
            n3 -= H[52];
            n2 = n3 ^= H[53];
        } else {
            int n4 = H[54];
            n4 -= H[55];
            n2 = n4 += H[56];
        }
        return n2 != 0;
    }

    static {
        kotakbaz.rain.client.draggable.c.b();
        long l2 = 5966513807042622160L;
        long l3 = 2780237508703355007L;
        long l4 = -7846337310399914480L;
        long l5 = -6690565596003890007L;
        long l6 = 8250653977260029549L;
        long l7 = 5338590375366898067L;
        long l8 = -6528645133699290079L;
        long l9 = -943808872323746475L;
        long l10 = 4203820537850393863L;
        long l11 = -7563219167324090754L;
        long l12 = -1232386582239626348L;
        long l13 = -2122725418662777308L;
        long l14 = -8124619160534513400L;
        long l15 = 257092391378065211L;
        int n2 = H[57];
        n2 += H[58];
        f = new Object[n2 -= H[59]];
        long l16 = l15;
        int n3 = H[60];
        n3 += H[61];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += H[62]);
        Object[] objectArray = new Object[H[63]];
        objectArray[kotakbaz.rain.client.draggable.c.H[64]] = F;
        objectArray[kotakbaz.rain.client.draggable.c.H[65]] = H[66];
        int n4 = H[67];
        Object object = kotakbaz.rain.client.draggable.c.A()[H[68]];
        if (object == null) {
            char[] cArray = "\u19b4\ue64f\ue658\ue7c3\ue650\ue6ac\ue7c4\u1918\ue649\ue7f0\ue6a8\ue64a\ue7f2\ue65d\ue65a\ue657\ue652\ue79e\ue652\ue7e5\u191b\ue64b\ue7f3\u1821\u433d\ue656\u191a\ue7c4\ue7c4\ue64e\ue64a\ue648\u4331\u19b6\ue64e\u191c\ue7e3\ue7f0\ue65b\ue6aa\ue645\u19be\u19b4\ue656\ue649\ue7f0\ue7f2\u19b7\u191c\u1821\ue7fe\u19b7\u4296\ue7f8\ue64e\ue7c4\ue7e5\u1983\ue648\ue6a4\ue652\ue6a8\u1918\ue6aa\ue7c3\u4296\ue64b\ue653\ue79f\ue658\ue7e3\u191c\ue656\u19bf\u4289\u19be\ue6ab\ue64c\ue657\ue650\ue651\u191b\ue650\u19be\u1918\ue656\u19b4\ue7ff\u4331\ue7f8\u19b7\u4331\ue6a4\ue6aa\ue7fe\ue656\ue657\ue64e\ue7c3\u4289\ue79f\u191a\ue79e\ue64a\ue654\ue7f0\u1905\ue7e7".toCharArray();
            for (int i2 = H[69]; i2 < H[70]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= H[71];
                n5 -= H[72];
                n5 -= H[73];
                n5 ^= H[74];
                n5 -= H[75];
                n5 ^= H[76];
                n5 -= H[77];
                n5 ^= H[78];
                n5 += H[79];
                n5 ^= H[80];
                n5 ^= H[81];
                n5 -= H[82];
                n5 -= H[83];
                n5 += H[84];
                cArray[i2] = (char)(n5 ^= H[85]);
            }
            object = kotakbaz.rain.client.draggable.c.A()[kotakbaz.rain.client.draggable.c.H[86]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.draggable.c.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = H[87];
        n6 -= H[88];
        l6 = l17 ^ (0x3100000000L ^ l17) & -1L << (n6 += H[89]);
        long l18 = l13;
        int n7 = H[90];
        n7 += H[91];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= H[92]);
        while (true) {
            int n8 = H[93];
            n8 -= H[94];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= H[95]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = H[96];
            n10 -= H[97];
            int n11 = H[99];
            n11 ^= H[100];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= H[98])) & -1L >>> (n11 += H[101]);
            long l20 = l9;
            int n12 = H[102];
            n12 ^= H[103];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= H[104]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = H[105];
            n14 += H[106];
            int n15 = H[108];
            n15 -= H[109];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= H[107])) & -1L >>> (n15 -= H[110]);
            int n16 = H[111];
            n16 -= H[112];
            long l22 = l10;
            int n17 = H[114];
            n17 ^= H[115];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= H[113]) ^ l22) & -1L << (n17 += H[116]);
            int n18 = H[117];
            n18 += H[118];
            n18 -= H[119];
            int n19 = H[120];
            n19 -= H[121];
            long l23 = l12;
            int n20 = H[123];
            n20 ^= H[124];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= H[122]))) ^ l23) & -1L >>> (n20 ^= H[125]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = H[126];
            n21 ^= H[127];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= H[128]);
            while (true) {
                int n22 = H[129];
                n22 -= H[130];
                if ((int)(l14 >>> (n22 -= H[131])) >= (int)l12) break;
                int n23 = H[132];
                n23 ^= H[133];
                int n24 = H[135];
                n24 ^= H[136];
                cArray2[(int)(l14 >>> (n23 += kotakbaz.rain.client.draggable.c.H[134]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += H[137]))];
                l14 += 0x100000000L;
            }
            int n25 = H[138];
            n25 += H[139];
            int n26 = (int)(l15 >>> (n25 ^= H[140]));
            l15 += 0x100000000L;
            kotakbaz.rain.client.draggable.c.f[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = H[141];
            n27 += H[142];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= H[143]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[H[144]];
        String string = (String)object[H[145]];
        object = object[H[146]];
        Object[] objectArray = G;
        if (G == null) {
            objectArray = G = new Object[H[147]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[H[148]];
                F = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[H[150] ^ H[151]];
                byArray[kotakbaz.rain.client.draggable.c.H[152] ^ kotakbaz.rain.client.draggable.c.H[153]] = H[154] ^ H[155];
                byArray[kotakbaz.rain.client.draggable.c.H[156] ^ kotakbaz.rain.client.draggable.c.H[157]] = H[158] ^ H[159];
                byArray[kotakbaz.rain.client.draggable.c.H[160] ^ kotakbaz.rain.client.draggable.c.H[161]] = H[162] ^ H[163];
                byArray[kotakbaz.rain.client.draggable.c.H[164] ^ kotakbaz.rain.client.draggable.c.H[165]] = H[166] ^ H[167];
                byArray[kotakbaz.rain.client.draggable.c.H[168] ^ kotakbaz.rain.client.draggable.c.H[169]] = H[170] ^ H[171];
                byArray[kotakbaz.rain.client.draggable.c.H[172] ^ kotakbaz.rain.client.draggable.c.H[173]] = H[174] ^ H[175];
                byArray[kotakbaz.rain.client.draggable.c.H[176] ^ kotakbaz.rain.client.draggable.c.H[177]] = H[178] ^ H[179];
                byArray[kotakbaz.rain.client.draggable.c.H[180] ^ kotakbaz.rain.client.draggable.c.H[181]] = H[182] ^ H[183];
                byArray[kotakbaz.rain.client.draggable.c.H[184] ^ kotakbaz.rain.client.draggable.c.H[185]] = H[186] ^ H[187];
                byArray[kotakbaz.rain.client.draggable.c.H[188] ^ kotakbaz.rain.client.draggable.c.H[189]] = H[190] ^ H[191];
                byArray[kotakbaz.rain.client.draggable.c.H[192] ^ kotakbaz.rain.client.draggable.c.H[193]] = H[194] ^ H[195];
                byArray[kotakbaz.rain.client.draggable.c.H[196] ^ kotakbaz.rain.client.draggable.c.H[197]] = H[198] ^ H[199];
                byArray[kotakbaz.rain.client.draggable.c.H[200] ^ kotakbaz.rain.client.draggable.c.H[201]] = H[202] ^ H[203];
                byArray[kotakbaz.rain.client.draggable.c.H[204] ^ kotakbaz.rain.client.draggable.c.H[205]] = H[206] ^ H[207];
                byArray[kotakbaz.rain.client.draggable.c.H[208] ^ kotakbaz.rain.client.draggable.c.H[209]] = H[210] ^ H[211];
                byArray[kotakbaz.rain.client.draggable.c.H[212] ^ kotakbaz.rain.client.draggable.c.H[213]] = H[214] ^ H[215];
                objectArray2[kotakbaz.rain.client.draggable.c.H[149]] = byArray;
            }
            byte[] byArray = (byte[])object3[H[216]];
            if (g == null) {
                byte[] byArray2 = new byte[H[217] ^ H[218]];
                byArray2[kotakbaz.rain.client.draggable.c.H[219] ^ kotakbaz.rain.client.draggable.c.H[220]] = H[221] ^ H[222];
                byArray2[kotakbaz.rain.client.draggable.c.H[223] ^ kotakbaz.rain.client.draggable.c.H[224]] = H[225] ^ H[226];
                byArray2[kotakbaz.rain.client.draggable.c.H[227] ^ kotakbaz.rain.client.draggable.c.H[228]] = H[229] ^ H[230];
                byArray2[kotakbaz.rain.client.draggable.c.H[231] ^ kotakbaz.rain.client.draggable.c.H[232]] = H[233] ^ H[234];
                byArray2[kotakbaz.rain.client.draggable.c.H[235] ^ kotakbaz.rain.client.draggable.c.H[236]] = H[237] ^ H[238];
                byArray2[kotakbaz.rain.client.draggable.c.H[239] ^ kotakbaz.rain.client.draggable.c.H[240]] = H[241] ^ H[242];
                byArray2[kotakbaz.rain.client.draggable.c.H[243] ^ kotakbaz.rain.client.draggable.c.H[244]] = H[245] ^ H[246];
                byArray2[kotakbaz.rain.client.draggable.c.H[247] ^ kotakbaz.rain.client.draggable.c.H[248]] = H[249] ^ H[250];
                byArray2[kotakbaz.rain.client.draggable.c.H[251] ^ kotakbaz.rain.client.draggable.c.H[252]] = H[253] ^ H[254];
                byArray2[kotakbaz.rain.client.draggable.c.H[255] ^ kotakbaz.rain.client.draggable.c.H[256]] = H[257] ^ H[258];
                byArray2[kotakbaz.rain.client.draggable.c.H[259] ^ kotakbaz.rain.client.draggable.c.H[260]] = H[261] ^ H[262];
                byArray2[kotakbaz.rain.client.draggable.c.H[263] ^ kotakbaz.rain.client.draggable.c.H[264]] = H[265] ^ H[266];
                byArray2[kotakbaz.rain.client.draggable.c.H[267] ^ kotakbaz.rain.client.draggable.c.H[268]] = H[269] ^ H[270];
                byArray2[kotakbaz.rain.client.draggable.c.H[271] ^ kotakbaz.rain.client.draggable.c.H[272]] = H[273] ^ H[274];
                byArray2[kotakbaz.rain.client.draggable.c.H[275] ^ kotakbaz.rain.client.draggable.c.H[276]] = H[277] ^ H[278];
                byArray2[kotakbaz.rain.client.draggable.c.H[279] ^ kotakbaz.rain.client.draggable.c.H[280]] = H[281] ^ H[282];
                byArray2[kotakbaz.rain.client.draggable.c.H[283] ^ kotakbaz.rain.client.draggable.c.H[284]] = H[285] ^ H[286];
                byArray2[kotakbaz.rain.client.draggable.c.H[287] ^ kotakbaz.rain.client.draggable.c.H[288]] = H[289] ^ H[290];
                byArray2[kotakbaz.rain.client.draggable.c.H[291] ^ kotakbaz.rain.client.draggable.c.H[292]] = H[293] ^ H[294];
                byArray2[kotakbaz.rain.client.draggable.c.H[295] ^ kotakbaz.rain.client.draggable.c.H[296]] = H[297] ^ H[298];
                byArray2[kotakbaz.rain.client.draggable.c.H[299] ^ kotakbaz.rain.client.draggable.c.H[300]] = H[301] ^ H[302];
                byArray2[kotakbaz.rain.client.draggable.c.H[303] ^ kotakbaz.rain.client.draggable.c.H[304]] = H[305] ^ H[306];
                byArray2[kotakbaz.rain.client.draggable.c.H[307] ^ kotakbaz.rain.client.draggable.c.H[308]] = H[309] ^ H[310];
                byArray2[kotakbaz.rain.client.draggable.c.H[311] ^ kotakbaz.rain.client.draggable.c.H[312]] = H[313] ^ H[314];
                byArray2[kotakbaz.rain.client.draggable.c.H[315] ^ kotakbaz.rain.client.draggable.c.H[316]] = H[317] ^ H[318];
                byArray2[kotakbaz.rain.client.draggable.c.H[319] ^ kotakbaz.rain.client.draggable.c.H[320]] = H[321] ^ H[322];
                byArray2[kotakbaz.rain.client.draggable.c.H[323] ^ kotakbaz.rain.client.draggable.c.H[324]] = H[325] ^ H[326];
                byArray2[kotakbaz.rain.client.draggable.c.H[327] ^ kotakbaz.rain.client.draggable.c.H[328]] = H[329] ^ H[330];
                byArray2[kotakbaz.rain.client.draggable.c.H[331] ^ kotakbaz.rain.client.draggable.c.H[332]] = H[333] ^ H[334];
                byArray2[kotakbaz.rain.client.draggable.c.H[335] ^ kotakbaz.rain.client.draggable.c.H[336]] = H[337] ^ H[338];
                byArray2[kotakbaz.rain.client.draggable.c.H[339] ^ kotakbaz.rain.client.draggable.c.H[340]] = H[341] ^ H[342];
                byArray2[kotakbaz.rain.client.draggable.c.H[343] ^ kotakbaz.rain.client.draggable.c.H[344]] = H[345] ^ H[346];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, H[347], byArray3, H[348], byArray.length);
                System.arraycopy(byArray2, H[349], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.draggable.c.A()[H[350]];
                if (object4 == null) {
                    char[] cArray = "\u5c61\u5d53\u5c7e\u5c25\u5c27\u5d43\u5c7a\u5c44\u5e95\u5c49\u5c29\u5e98\u5c4c\u5c46\u5c76\u5c29\u5d2c\u5d5c".toCharArray();
                    for (int i2 = H[351]; i2 < H[352]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= H[353];
                        n3 -= H[354];
                        n3 ^= H[355];
                        n3 += H[356];
                        n3 ^= H[357];
                        n3 ^= H[358];
                        n3 ^= H[359];
                        n3 -= H[360];
                        n3 -= H[361];
                        n3 ^= H[362];
                        cArray[i2] = (char)(n3 ^= H[363]);
                    }
                    object4 = kotakbaz.rain.client.draggable.c.A()[kotakbaz.rain.client.draggable.c.H[364]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[H[365]];
                byArray4[kotakbaz.rain.client.draggable.c.H[366]] = H[367];
                byArray4[kotakbaz.rain.client.draggable.c.H[368]] = H[369];
                byArray4[kotakbaz.rain.client.draggable.c.H[370]] = H[371];
                byArray4[kotakbaz.rain.client.draggable.c.H[372]] = H[373];
                byArray4[kotakbaz.rain.client.draggable.c.H[374]] = H[375];
                byArray4[kotakbaz.rain.client.draggable.c.H[376]] = H[377];
                byArray4[kotakbaz.rain.client.draggable.c.H[378]] = H[379];
                byArray4[kotakbaz.rain.client.draggable.c.H[380]] = H[381];
                byArray4[kotakbaz.rain.client.draggable.c.H[382]] = H[383];
                byArray4[kotakbaz.rain.client.draggable.c.H[384]] = H[385];
                byArray4[kotakbaz.rain.client.draggable.c.H[386]] = H[387];
                byArray4[kotakbaz.rain.client.draggable.c.H[388]] = H[389];
                byArray4[kotakbaz.rain.client.draggable.c.H[390]] = H[391];
                byArray4[kotakbaz.rain.client.draggable.c.H[392]] = H[393];
                byArray4[kotakbaz.rain.client.draggable.c.H[394]] = H[395];
                byArray4[kotakbaz.rain.client.draggable.c.H[396]] = H[397];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, H[398], H[399]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.draggable.c.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u92db\u92d7\u92a9".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 26212;
                        n4 ^= 0x7347;
                        n4 ^= 0x4EB;
                        n4 -= 33740;
                        n4 ^= 0xED2E;
                        n4 -= 2191;
                        n4 -= 27759;
                        n4 -= 48371;
                        n4 -= 44436;
                        n4 ^= 0xAEB4;
                        n4 -= 55736;
                        n4 ^= 0x5B39;
                        n4 ^= 0xEBC;
                        cArray[i3] = (char)(n4 ^= 0x98DC);
                    }
                    object5 = kotakbaz.rain.client.draggable.c.A()[2] = new String(cArray);
                }
                g = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.draggable.c.A()[3];
            if (object6 == null) {
                char[] cArray = "\u9bce\u9c3a\u9c40\u9be4\u9bd0\u9bcf\u9bd0\u9be4\u9c3d\u9c38\u9bd0\u9c40\u9bca\u9c3d\u9bae\u9b99\u9b99\u9b96\u9ba3\u9b9c".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 23745;
                    n5 ^= 0x5FC3;
                    n5 -= 10868;
                    n5 += 45924;
                    n5 += 55110;
                    n5 += 42774;
                    n5 ^= 0x2337;
                    n5 -= 38439;
                    n5 -= 27223;
                    n5 += 51180;
                    n5 -= 32780;
                    cArray[i4] = (char)(n5 -= 37454);
                }
                object6 = kotakbaz.rain.client.draggable.c.A()[3] = new String(cArray);
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
        H = new int[0xB62E ^ 0xB7BE];
        kotakbaz.rain.client.draggable.c.H[0x87AB ^ 0x87C9] = 0xFFFF7860 ^ 0x87C9;
        kotakbaz.rain.client.draggable.c.H[0xAD6 ^ 0xB97] = 0xFFFF686F ^ 0xB97;
        kotakbaz.rain.client.draggable.c.H[0x8F28 ^ 0x8F45] = 0x8F20 ^ 0x8F45;
        kotakbaz.rain.client.draggable.c.H[0xC4F3 ^ 0xC461] = 0xC461 ^ 0xC461;
        kotakbaz.rain.client.draggable.c.H[0x10967 ^ 0x1094E] = 0xFFFEF6BF ^ 0x1094E;
        kotakbaz.rain.client.draggable.c.H[0xA542 ^ 0xA593] = 0x82E0 ^ 0xA593;
        kotakbaz.rain.client.draggable.c.H[0xAAF8 ^ 0xABE7] = 0xB164 ^ 0xABE7;
        kotakbaz.rain.client.draggable.c.H[0xEB08 ^ 0xEB76] = 0xEB4B ^ 0xEB76;
        kotakbaz.rain.client.draggable.c.H[0x6A21 ^ 0x6BA2] = 0x6BFA ^ 0x6BA2;
        kotakbaz.rain.client.draggable.c.H[0x54EE ^ 0x54CD] = 0x54CD ^ 0x54CD;
        kotakbaz.rain.client.draggable.c.H[0xD371 ^ 0xD34B] = 0xFFFF2CB3 ^ 0xD34B;
        kotakbaz.rain.client.draggable.c.H[0xD7F7 ^ 0xD678] = 0xD778 ^ 0xD678;
        kotakbaz.rain.client.draggable.c.H[0x89A6 ^ 0x8975] = 0xAE06 ^ 0x8975;
        kotakbaz.rain.client.draggable.c.H[0x3C40 ^ 0x3CFE] = 0xFFFF737D ^ 0x3CFE;
        kotakbaz.rain.client.draggable.c.H[0x4EE7 ^ 0x4E04] = 0x9FB8 ^ 0x4E04;
        kotakbaz.rain.client.draggable.c.H[0xB1DB ^ 0xB15A] = 0xB150 ^ 0xB15A;
        kotakbaz.rain.client.draggable.c.H[0x10B55 ^ 0x10ADD] = 0x10AD0 ^ 0x10ADD;
        kotakbaz.rain.client.draggable.c.H[0x5DFE ^ 0x5DD9] = 0xFFFFA227 ^ 0x5DD9;
        kotakbaz.rain.client.draggable.c.H[0x10B16 ^ 0x10A1F] = 0xFFFE6D50 ^ 0x10A1F;
        kotakbaz.rain.client.draggable.c.H[0x5569 ^ 0x544B] = 0x4ED7 ^ 0x544B;
        kotakbaz.rain.client.draggable.c.H[0x94A6 ^ 0x9436] = 0x9437 ^ 0x9436;
        kotakbaz.rain.client.draggable.c.H[0xE10F ^ 0xE067] = 0xD389 ^ 0xE067;
        kotakbaz.rain.client.draggable.c.H[0xA14A ^ 0xA020] = 0xB24F ^ 0xA020;
        kotakbaz.rain.client.draggable.c.H[0x8196 ^ 0x80E3] = 0xFFFF7F5D ^ 0x80E3;
        kotakbaz.rain.client.draggable.c.H[0x869D ^ 0x8691] = 0x86B4 ^ 0x8691;
        kotakbaz.rain.client.draggable.c.H[0x7E04 ^ 0x7E43] = 0xE663 ^ 0x7E43;
        kotakbaz.rain.client.draggable.c.H[0x742 ^ 0x7F7] = 0xB8BA ^ 0x7F7;
        kotakbaz.rain.client.draggable.c.H[0x83ED ^ 0x83C8] = 0xFFFF7C71 ^ 0x83C8;
        kotakbaz.rain.client.draggable.c.H[0x7EDF ^ 0x7F95] = 0x785A ^ 0x7F95;
        kotakbaz.rain.client.draggable.c.H[0x9420 ^ 0x946E] = 0x8AC2 ^ 0x946E;
        kotakbaz.rain.client.draggable.c.H[0x6190 ^ 0x608D] = 0xF140 ^ 0x608D;
        kotakbaz.rain.client.draggable.c.H[0xF8CA ^ 0xF833] = 0x8C36 ^ 0xF833;
        kotakbaz.rain.client.draggable.c.H[0x7FC2 ^ 0x7F37] = 0xFFFF52D1 ^ 0x7F37;
        kotakbaz.rain.client.draggable.c.H[0x10DD9 ^ 0x10C85] = 0x10C85 ^ 0x10C85;
        kotakbaz.rain.client.draggable.c.H[0xDC47 ^ 0xDD26] = 0x59B5 ^ 0xDD26;
        kotakbaz.rain.client.draggable.c.H[0x47FD ^ 0x478F] = 0x47CA ^ 0x478F;
        kotakbaz.rain.client.draggable.c.H[0xD5F5 ^ 0xD4DD] = 0xA79B ^ 0xD4DD;
        kotakbaz.rain.client.draggable.c.H[0xA869 ^ 0xA972] = 0x38DB ^ 0xA972;
        kotakbaz.rain.client.draggable.c.H[0xD74E ^ 0xD7F4] = 0xFFFF1610 ^ 0xD7F4;
        kotakbaz.rain.client.draggable.c.H[0xAF1 ^ 0xAD3] = 0xAF3 ^ 0xAD3;
        kotakbaz.rain.client.draggable.c.H[0x7287 ^ 0x73AC] = 0xD600 ^ 0x73AC;
        kotakbaz.rain.client.draggable.c.H[0xDB70 ^ 0xDB35] = 0xDB35 ^ 0xDB35;
        kotakbaz.rain.client.draggable.c.H[0x18DF ^ 0x1849] = 0x1433 ^ 0x1849;
        kotakbaz.rain.client.draggable.c.H[0x10597 ^ 0x10585] = 0xFFFEFA15 ^ 0x10585;
        kotakbaz.rain.client.draggable.c.H[0xA924 ^ 0xA840] = 0x7E98 ^ 0xA840;
        kotakbaz.rain.client.draggable.c.H[0x27BD ^ 0x2772] = 0xF4B3 ^ 0x2772;
        kotakbaz.rain.client.draggable.c.H[0x72C0 ^ 0x7346] = 0x7342 ^ 0x7346;
        kotakbaz.rain.client.draggable.c.H[0x35CD ^ 0x357D] = 0x1B00 ^ 0x357D;
        kotakbaz.rain.client.draggable.c.H[0x43F ^ 0x4C1] = 0x34C8 ^ 0x4C1;
        kotakbaz.rain.client.draggable.c.H[0x3AB9 ^ 0x3A06] = 0x8A0B ^ 0x3A06;
        kotakbaz.rain.client.draggable.c.H[0xC00A ^ 0xC007] = 0xFFFF3FAF ^ 0xC007;
        kotakbaz.rain.client.draggable.c.H[0x27C5 ^ 0x27AE] = 0x2782 ^ 0x27AE;
        kotakbaz.rain.client.draggable.c.H[0x115D ^ 0x113B] = 0xFFFFEEA4 ^ 0x113B;
        kotakbaz.rain.client.draggable.c.H[0x9BCD ^ 0x9AB6] = 0x9AE0 ^ 0x9AB6;
        kotakbaz.rain.client.draggable.c.H[0xCA13 ^ 0xCAF4] = 0x56BC ^ 0xCAF4;
        kotakbaz.rain.client.draggable.c.H[0xDA46 ^ 0xDA53] = 0xFFFF25BC ^ 0xDA53;
        kotakbaz.rain.client.draggable.c.H[0xA0BF ^ 0xA077] = 0xA7B ^ 0xA077;
        kotakbaz.rain.client.draggable.c.H[0xF1C7 ^ 0xF14E] = 0xFFFF0EAA ^ 0xF14E;
        kotakbaz.rain.client.draggable.c.H[0xF034 ^ 0xF00C] = 0xFFFF0FB9 ^ 0xF00C;
        kotakbaz.rain.client.draggable.c.H[0x38C1 ^ 0x3803] = 0xFFFFBB73 ^ 0x3803;
        kotakbaz.rain.client.draggable.c.H[0xF009 ^ 0xF01E] = 0xFFFF0FEB ^ 0xF01E;
        kotakbaz.rain.client.draggable.c.H[0x5CC9 ^ 0x5DC2] = 0x12E1 ^ 0x5DC2;
        kotakbaz.rain.client.draggable.c.H[0x18DA ^ 0x19B3] = 0x287C ^ 0x19B3;
        kotakbaz.rain.client.draggable.c.H[0x4049 ^ 0x4177] = 0xA16E ^ 0x4177;
        kotakbaz.rain.client.draggable.c.H[0x506C ^ 0x5151] = 0xFFFF4E9C ^ 0x5151;
        kotakbaz.rain.client.draggable.c.H[0x47DE ^ 0x4795] = 0x2B32 ^ 0x4795;
        kotakbaz.rain.client.draggable.c.H[0x738E ^ 0x7378] = 0xA135 ^ 0x7378;
        kotakbaz.rain.client.draggable.c.H[0x844E ^ 0x847F] = 0x840D ^ 0x847F;
        kotakbaz.rain.client.draggable.c.H[0x7101 ^ 0x7182] = 0xFFFF8E60 ^ 0x7182;
        kotakbaz.rain.client.draggable.c.H[0x667 ^ 0x609] = 0x65F ^ 0x609;
        kotakbaz.rain.client.draggable.c.H[0xFE7A ^ 0xFEA0] = 0x8E77 ^ 0xFEA0;
        kotakbaz.rain.client.draggable.c.H[0x1493 ^ 0x14BB] = 0x14A8 ^ 0x14BB;
        kotakbaz.rain.client.draggable.c.H[0xA8CA ^ 0xA8BF] = 0xA805 ^ 0xA8BF;
        kotakbaz.rain.client.draggable.c.H[0x1073A ^ 0x10775] = 0x1D378 ^ 0x10775;
        kotakbaz.rain.client.draggable.c.H[0x4926 ^ 0x4824] = 0xF3B7 ^ 0x4824;
        kotakbaz.rain.client.draggable.c.H[0xA2EF ^ 0xA26B] = 0xA215 ^ 0xA26B;
        kotakbaz.rain.client.draggable.c.H[0x886A ^ 0x88B6] = 0xAEF6 ^ 0x88B6;
        kotakbaz.rain.client.draggable.c.H[0x6C67 ^ 0x6C3B] = 0x6C02 ^ 0x6C3B;
        kotakbaz.rain.client.draggable.c.H[0x36C9 ^ 0x3661] = 0x30D8 ^ 0x3661;
        kotakbaz.rain.client.draggable.c.H[0x9FF1 ^ 0x9F71] = 0x9F2F ^ 0x9F71;
        kotakbaz.rain.client.draggable.c.H[0xA4F6 ^ 0xA5C6] = 0x169D ^ 0xA5C6;
        kotakbaz.rain.client.draggable.c.H[0x95BC ^ 0x9559] = 0x44C2 ^ 0x9559;
        kotakbaz.rain.client.draggable.c.H[0xF5D7 ^ 0xF543] = 0xF542 ^ 0xF543;
        kotakbaz.rain.client.draggable.c.H[0x9337 ^ 0x922E] = 0xFFFF3E89 ^ 0x922E;
        kotakbaz.rain.client.draggable.c.H[0xFB3E ^ 0xFA18] = 0xBDDD ^ 0xFA18;
        kotakbaz.rain.client.draggable.c.H[0x5DC3 ^ 0x5D07] = 0x6B23 ^ 0x5D07;
        kotakbaz.rain.client.draggable.c.H[0xC08 ^ 0xD27] = 0xBE60 ^ 0xD27;
        kotakbaz.rain.client.draggable.c.H[0x75A3 ^ 0x74B1] = 0x527B ^ 0x74B1;
        kotakbaz.rain.client.draggable.c.H[0xC6AD ^ 0xC7B9] = 0x337B ^ 0xC7B9;
        kotakbaz.rain.client.draggable.c.H[0xEE7B ^ 0xEF26] = 0xEF26 ^ 0xEF26;
        kotakbaz.rain.client.draggable.c.H[0x944D ^ 0x952A] = 0xD696 ^ 0x952A;
        kotakbaz.rain.client.draggable.c.H[0xDD1C ^ 0xDD37] = 0xDD35 ^ 0xDD37;
        kotakbaz.rain.client.draggable.c.H[0x10B6 ^ 0x10CB] = 0xFFFFEF69 ^ 0x10CB;
        kotakbaz.rain.client.draggable.c.H[0x2374 ^ 0x23C3] = 0x9C8E ^ 0x23C3;
        kotakbaz.rain.client.draggable.c.H[0x1D9C ^ 0x1DA8] = 0xFFFFE24E ^ 0x1DA8;
        kotakbaz.rain.client.draggable.c.H[0xF56C ^ 0xF44B] = 0x871B ^ 0xF44B;
        kotakbaz.rain.client.draggable.c.H[0x858A ^ 0x85A5] = 0xFFFF7A7C ^ 0x85A5;
        kotakbaz.rain.client.draggable.c.H[0x1C53 ^ 0x1C75] = 0x1C4B ^ 0x1C75;
        kotakbaz.rain.client.draggable.c.H[0x1812 ^ 0x185E] = 0x9ED7 ^ 0x185E;
        kotakbaz.rain.client.draggable.c.H[0x108AD ^ 0x108A4] = 0xFFFEF761 ^ 0x108A4;
        kotakbaz.rain.client.draggable.c.H[0x2F1A ^ 0x2F5B] = 0x2F5A ^ 0x2F5B;
        kotakbaz.rain.client.draggable.c.H[0x1846 ^ 0x1814] = 0x5E67 ^ 0x1814;
        kotakbaz.rain.client.draggable.c.H[0x3071 ^ 0x30FD] = 0xFFFFCF48 ^ 0x30FD;
        kotakbaz.rain.client.draggable.c.H[0x4398 ^ 0x42B8] = 0x5824 ^ 0x42B8;
        kotakbaz.rain.client.draggable.c.H[0xA32F ^ 0xA259] = 0xA25C ^ 0xA259;
        kotakbaz.rain.client.draggable.c.H[0x4A27 ^ 0x4AFE] = 0x3A09 ^ 0x4AFE;
        kotakbaz.rain.client.draggable.c.H[0x1781 ^ 0x16B8] = 0xEE51 ^ 0x16B8;
        kotakbaz.rain.client.draggable.c.H[0x990 ^ 0x9C8] = 0x99C ^ 0x9C8;
        kotakbaz.rain.client.draggable.c.H[0xB6 ^ 0x13A] = 0x139 ^ 0x13A;
        kotakbaz.rain.client.draggable.c.H[0x577C ^ 0x5736] = 0x3871 ^ 0x5736;
        kotakbaz.rain.client.draggable.c.H[0xC760 ^ 0xC60D] = 0xC61D ^ 0xC60D;
        kotakbaz.rain.client.draggable.c.H[0x10A79 ^ 0x10A05] = 0x10A3E ^ 0x10A05;
        kotakbaz.rain.client.draggable.c.H[0x80AA ^ 0x80F9] = 0x78AF ^ 0x80F9;
        kotakbaz.rain.client.draggable.c.H[0xE193 ^ 0xE14B] = 0xE14B ^ 0xE14B;
        kotakbaz.rain.client.draggable.c.H[0xA0DB ^ 0xA039] = 0x37B4 ^ 0xA039;
        kotakbaz.rain.client.draggable.c.H[0x2A4C ^ 0x2A9E] = 0xFFFFF248 ^ 0x2A9E;
        kotakbaz.rain.client.draggable.c.H[0xCFD1 ^ 0xCFE6] = 0xFFFF3010 ^ 0xCFE6;
        kotakbaz.rain.client.draggable.c.H[0xA5A8 ^ 0xA5B0] = 0xFFFF5A75 ^ 0xA5B0;
        kotakbaz.rain.client.draggable.c.H[0x4500 ^ 0x446F] = 0x4435 ^ 0x446F;
        kotakbaz.rain.client.draggable.c.H[0x2000 ^ 0x201E] = 0xFFFFDFA4 ^ 0x201E;
        kotakbaz.rain.client.draggable.c.H[0x1071 ^ 0x1149] = 0xE9F9 ^ 0x1149;
        kotakbaz.rain.client.draggable.c.H[0x8E0E ^ 0x8F70] = 0x8F76 ^ 0x8F70;
        kotakbaz.rain.client.draggable.c.H[0xA2FA ^ 0xA249] = 0x8C35 ^ 0xA249;
        kotakbaz.rain.client.draggable.c.H[0x5526 ^ 0x5466] = 0xC87D ^ 0x5466;
        kotakbaz.rain.client.draggable.c.H[0x73C2 ^ 0x732F] = 0xFFFF0728 ^ 0x732F;
        kotakbaz.rain.client.draggable.c.H[0xDD2 ^ 0xDA2] = 0xFFFFF21A ^ 0xDA2;
        kotakbaz.rain.client.draggable.c.H[0x4CEA ^ 0x4C15] = 0xF79B ^ 0x4C15;
        kotakbaz.rain.client.draggable.c.H[0x4C8B ^ 0x4D0A] = 0x4D08 ^ 0x4D0A;
        kotakbaz.rain.client.draggable.c.H[0xD9B9 ^ 0xD901] = 0xE74E ^ 0xD901;
        kotakbaz.rain.client.draggable.c.H[0xBA90 ^ 0xBBE3] = 0xFFFF4460 ^ 0xBBE3;
        kotakbaz.rain.client.draggable.c.H[0x8965 ^ 0x8985] = 0x1E08 ^ 0x8985;
        kotakbaz.rain.client.draggable.c.H[0x5AF8 ^ 0x5BAD] = 0x80A4 ^ 0x5BAD;
        kotakbaz.rain.client.draggable.c.H[0x1073B ^ 0x1075F] = 0xFFFEF8D6 ^ 0x1075F;
        kotakbaz.rain.client.draggable.c.H[0x511E ^ 0x511A] = 0xFFFFAEC5 ^ 0x511A;
        kotakbaz.rain.client.draggable.c.H[0x6645 ^ 0x665C] = 0xFFFF99A8 ^ 0x665C;
        kotakbaz.rain.client.draggable.c.H[0x1069A ^ 0x107D6] = 0x156A0 ^ 0x107D6;
        kotakbaz.rain.client.draggable.c.H[0x2271 ^ 0x2242] = 0x2277 ^ 0x2242;
        kotakbaz.rain.client.draggable.c.H[0x240A ^ 0x24AB] = 0xC63F ^ 0x24AB;
        kotakbaz.rain.client.draggable.c.H[0xF892 ^ 0xF9EF] = 0xFFFF0636 ^ 0xF9EF;
        kotakbaz.rain.client.draggable.c.H[0xE81C ^ 0xE96B] = 0xE959 ^ 0xE96B;
        kotakbaz.rain.client.draggable.c.H[0x771C ^ 0x77C7] = 0x5189 ^ 0x77C7;
        kotakbaz.rain.client.draggable.c.H[0x473A ^ 0x4752] = 0xFFFFB894 ^ 0x4752;
        kotakbaz.rain.client.draggable.c.H[0xFD5C ^ 0xFD57] = 0xFFFF0291 ^ 0xFD57;
        kotakbaz.rain.client.draggable.c.H[0x49FC ^ 0x495E] = 0xFFFF5470 ^ 0x495E;
        kotakbaz.rain.client.draggable.c.H[0x59AB ^ 0x59FB] = 0xBED4 ^ 0x59FB;
        kotakbaz.rain.client.draggable.c.H[0xA1C5 ^ 0xA19C] = 0xFFFF5E4C ^ 0xA19C;
        kotakbaz.rain.client.draggable.c.H[0x3C97 ^ 0x3C8C] = 0x3CC4 ^ 0x3C8C;
        kotakbaz.rain.client.draggable.c.H[0x82DD ^ 0x83AD] = 0x83A7 ^ 0x83AD;
        kotakbaz.rain.client.draggable.c.H[0xA0A5 ^ 0xA12B] = 0xA132 ^ 0xA12B;
        kotakbaz.rain.client.draggable.c.H[0x11CF ^ 0x1192] = 0xFFFFEE1C ^ 0x1192;
        kotakbaz.rain.client.draggable.c.H[0x3F6 ^ 0x2E0] = 0xF622 ^ 0x2E0;
        kotakbaz.rain.client.draggable.c.H[0x8838 ^ 0x885D] = 0xFFFF77AF ^ 0x885D;
        kotakbaz.rain.client.draggable.c.H[0x9069 ^ 0x9005] = 0x90DE ^ 0x9005;
        kotakbaz.rain.client.draggable.c.H[0x458E ^ 0x45DF] = 0xC82D ^ 0x45DF;
        kotakbaz.rain.client.draggable.c.H[0x7054 ^ 0x711A] = 0x206C ^ 0x711A;
        kotakbaz.rain.client.draggable.c.H[0x276 ^ 0x228] = 0xFFFFFDD1 ^ 0x228;
        kotakbaz.rain.client.draggable.c.H[0xA479 ^ 0xA469] = 0xFFFF5BC2 ^ 0xA469;
        kotakbaz.rain.client.draggable.c.H[0x5436 ^ 0x5404] = 0x5412 ^ 0x5404;
        kotakbaz.rain.client.draggable.c.H[0x6141 ^ 0x618C] = 0xB24D ^ 0x618C;
        kotakbaz.rain.client.draggable.c.H[0xFC4C ^ 0xFC80] = 0x2F41 ^ 0xFC80;
        kotakbaz.rain.client.draggable.c.H[0x9F58 ^ 0x9E22] = 0x9E29 ^ 0x9E22;
        kotakbaz.rain.client.draggable.c.H[0x10DBD ^ 0x10CC4] = 0xFFFEF304 ^ 0x10CC4;
        kotakbaz.rain.client.draggable.c.H[0xB7C8 ^ 0xB680] = 0xB14F ^ 0xB680;
        kotakbaz.rain.client.draggable.c.H[0xADD7 ^ 0xAC53] = 0xAC5A ^ 0xAC53;
        kotakbaz.rain.client.draggable.c.H[0x8ABA ^ 0x8A07] = 0x3A0A ^ 0x8A07;
        kotakbaz.rain.client.draggable.c.H[0x6074 ^ 0x6087] = 0xB2D0 ^ 0x6087;
        kotakbaz.rain.client.draggable.c.H[0xF3F6 ^ 0xF2BD] = 0xA3D3 ^ 0xF2BD;
        kotakbaz.rain.client.draggable.c.H[0x5C2E ^ 0x5CF9] = 0x563B ^ 0x5CF9;
        kotakbaz.rain.client.draggable.c.H[0x6A12 ^ 0x6AB4] = 0xD2CB ^ 0x6AB4;
        kotakbaz.rain.client.draggable.c.H[0x3A7C ^ 0x3A6F] = 0xFFFFC5E1 ^ 0x3A6F;
        kotakbaz.rain.client.draggable.c.H[0x7930 ^ 0x783F] = 0x5EF4 ^ 0x783F;
        kotakbaz.rain.client.draggable.c.H[0x5F9C ^ 0x5EC5] = 0xB833 ^ 0x5EC5;
        kotakbaz.rain.client.draggable.c.H[0xA7A2 ^ 0xA6FC] = 0xA6FD ^ 0xA6FC;
        kotakbaz.rain.client.draggable.c.H[0x1221 ^ 0x130C] = 0xFFFF496F ^ 0x130C;
        kotakbaz.rain.client.draggable.c.H[0x7082 ^ 0x7043] = 0xCC4 ^ 0x7043;
        kotakbaz.rain.client.draggable.c.H[0x50E9 ^ 0x5063] = 0xFFFFAF47 ^ 0x5063;
        kotakbaz.rain.client.draggable.c.H[0xFDDA ^ 0xFC8A] = 0x4BFF ^ 0xFC8A;
        kotakbaz.rain.client.draggable.c.H[0xF005 ^ 0xF072] = 0xF014 ^ 0xF072;
        kotakbaz.rain.client.draggable.c.H[0x9141 ^ 0x901A] = 0x901A ^ 0x901A;
        kotakbaz.rain.client.draggable.c.H[0x8829 ^ 0x88B7] = 0xF96C ^ 0x88B7;
        kotakbaz.rain.client.draggable.c.H[0x2B15 ^ 0x2BB8] = 0x4580 ^ 0x2BB8;
        kotakbaz.rain.client.draggable.c.H[0x138D ^ 0x1291] = 0x833A ^ 0x1291;
        kotakbaz.rain.client.draggable.c.H[0xC607 ^ 0xC775] = 0xC775 ^ 0xC775;
        kotakbaz.rain.client.draggable.c.H[0xC23E ^ 0xC29B] = 0x7AAC ^ 0xC29B;
        kotakbaz.rain.client.draggable.c.H[0xF2C9 ^ 0xF3EC] = 0xFFFF4BDD ^ 0xF3EC;
        kotakbaz.rain.client.draggable.c.H[0xDD59 ^ 0xDC66] = 0x407B ^ 0xDC66;
        kotakbaz.rain.client.draggable.c.H[0xB3DD ^ 0xB3CB] = 0xFFFF4C11 ^ 0xB3CB;
        kotakbaz.rain.client.draggable.c.H[0xB7EB ^ 0xB6AE] = 0xFFFF2C7E ^ 0xB6AE;
        kotakbaz.rain.client.draggable.c.H[0x1F29 ^ 0x1F51] = 0x1F56 ^ 0x1F51;
        kotakbaz.rain.client.draggable.c.H[0x206 ^ 0x337] = 0xB001 ^ 0x337;
        kotakbaz.rain.client.draggable.c.H[0xD90F ^ 0xD802] = 0x9753 ^ 0xD802;
        kotakbaz.rain.client.draggable.c.H[0xC49 ^ 0xCD6] = 0x7D20 ^ 0xCD6;
        kotakbaz.rain.client.draggable.c.H[0x3954 ^ 0x3948] = 0x391E ^ 0x3948;
        kotakbaz.rain.client.draggable.c.H[0x2882 ^ 0x2841] = 0x54C6 ^ 0x2841;
        kotakbaz.rain.client.draggable.c.H[0x5647 ^ 0x5714] = 0x8C04 ^ 0x5714;
        kotakbaz.rain.client.draggable.c.H[0x300 ^ 0x393] = 0x392 ^ 0x393;
        kotakbaz.rain.client.draggable.c.H[0x108A4 ^ 0x1089A] = 0x108D6 ^ 0x1089A;
        kotakbaz.rain.client.draggable.c.H[0xD6FE ^ 0xD7C9] = 0x2F6C ^ 0xD7C9;
        kotakbaz.rain.client.draggable.c.H[0x5D6F ^ 0x5D3B] = 0x1E8D ^ 0x5D3B;
        kotakbaz.rain.client.draggable.c.H[0xAB05 ^ 0xAA7D] = 0xAA73 ^ 0xAA7D;
        kotakbaz.rain.client.draggable.c.H[0x94B9 ^ 0x958F] = 0x5D2D ^ 0x958F;
        kotakbaz.rain.client.draggable.c.H[0x178C ^ 0x16B6] = 0xEE06 ^ 0x16B6;
        kotakbaz.rain.client.draggable.c.H[0xE8DC ^ 0xE988] = 0x3289 ^ 0xE988;
        kotakbaz.rain.client.draggable.c.H[0xE284 ^ 0xE287] = 0xFFFF1D3A ^ 0xE287;
        kotakbaz.rain.client.draggable.c.H[0x42BC ^ 0x4269] = 0x48AB ^ 0x4269;
        kotakbaz.rain.client.draggable.c.H[0xB8BA ^ 0xB8EF] = 0x1C32 ^ 0xB8EF;
        kotakbaz.rain.client.draggable.c.H[0x280B ^ 0x292F] = 0x6EEA ^ 0x292F;
        kotakbaz.rain.client.draggable.c.H[0xB152 ^ 0xB003] = 0xFFFFF8C2 ^ 0xB003;
        kotakbaz.rain.client.draggable.c.H[0xB920 ^ 0xB9C6] = 0x6875 ^ 0xB9C6;
        kotakbaz.rain.client.draggable.c.H[0x1049D ^ 0x10588] = 0x1F113 ^ 0x10588;
        kotakbaz.rain.client.draggable.c.H[0xD49B ^ 0xD451] = 0xFFFF81AB ^ 0xD451;
        kotakbaz.rain.client.draggable.c.H[0x92CD ^ 0x9266] = 0x94D4 ^ 0x9266;
        kotakbaz.rain.client.draggable.c.H[0x6969 ^ 0x6944] = 0x6965 ^ 0x6944;
        kotakbaz.rain.client.draggable.c.H[0xEA1C ^ 0xEB04] = 0xB828 ^ 0xEB04;
        kotakbaz.rain.client.draggable.c.H[0xD825 ^ 0xD82A] = 0xFFFF2749 ^ 0xD82A;
        kotakbaz.rain.client.draggable.c.H[0x921A ^ 0x92E1] = 0xA2EC ^ 0x92E1;
        kotakbaz.rain.client.draggable.c.H[0x4863 ^ 0x497D] = 0xD8D6 ^ 0x497D;
        kotakbaz.rain.client.draggable.c.H[0x8CED ^ 0x8C2A] = 0xBA06 ^ 0x8C2A;
        kotakbaz.rain.client.draggable.c.H[0xAAF ^ 0xA7F] = 0x2D0A ^ 0xA7F;
        kotakbaz.rain.client.draggable.c.H[0x2594 ^ 0x250D] = 0xBF50 ^ 0x250D;
        kotakbaz.rain.client.draggable.c.H[0x85EE ^ 0x84D2] = 0x64CB ^ 0x84D2;
        kotakbaz.rain.client.draggable.c.H[0x1CDD ^ 0x1C2A] = 0x685B ^ 0x1C2A;
        kotakbaz.rain.client.draggable.c.H[0xF22D ^ 0xF30C] = 0xFFFF1610 ^ 0xF30C;
        kotakbaz.rain.client.draggable.c.H[0x70E7 ^ 0x700D] = 0xEC46 ^ 0x700D;
        kotakbaz.rain.client.draggable.c.H[0x6907 ^ 0x6907] = 0x6967 ^ 0x6907;
        kotakbaz.rain.client.draggable.c.H[0xB2B1 ^ 0xB2B7] = 0xB29C ^ 0xB2B7;
        kotakbaz.rain.client.draggable.c.H[0x604 ^ 0x6F5] = 0xFFFFADAD ^ 0x6F5;
        kotakbaz.rain.client.draggable.c.H[0x7A4 ^ 0x7A3] = 0x787 ^ 0x7A3;
        kotakbaz.rain.client.draggable.c.H[0x92A6 ^ 0x9231] = 0x9E5B ^ 0x9231;
        kotakbaz.rain.client.draggable.c.H[0xE2B1 ^ 0xE3EE] = 0xE3EE ^ 0xE3EE;
        kotakbaz.rain.client.draggable.c.H[0x1127 ^ 0x114E] = 0x11EE ^ 0x114E;
        kotakbaz.rain.client.draggable.c.H[0x1C63 ^ 0x1C4D] = 0xFFFFE3B4 ^ 0x1C4D;
        kotakbaz.rain.client.draggable.c.H[0xF6A5 ^ 0xF6C5] = 0xFFFF0908 ^ 0xF6C5;
        kotakbaz.rain.client.draggable.c.H[0xB6E3 ^ 0xB7E0] = 0xCBBD ^ 0xB7E0;
        kotakbaz.rain.client.draggable.c.H[0x10AA3 ^ 0x10ACC] = 0xFFFEF539 ^ 0x10ACC;
        kotakbaz.rain.client.draggable.c.H[0x887C ^ 0x8894] = 0x14DF ^ 0x8894;
        kotakbaz.rain.client.draggable.c.H[0x2E3E ^ 0x2E4F] = 0x2E52 ^ 0x2E4F;
        kotakbaz.rain.client.draggable.c.H[0xBDC2 ^ 0xBCD3] = 0x9A0B ^ 0xBCD3;
        kotakbaz.rain.client.draggable.c.H[0x10392 ^ 0x10295] = 0x19A2F ^ 0x10295;
        kotakbaz.rain.client.draggable.c.H[0x2381 ^ 0x23F7] = 0xFFFFDC4B ^ 0x23F7;
        kotakbaz.rain.client.draggable.c.H[0x2E1A ^ 0x2E21] = 0x2E5B ^ 0x2E21;
        kotakbaz.rain.client.draggable.c.H[0x34C0 ^ 0x34F5] = 0x34BB ^ 0x34F5;
        kotakbaz.rain.client.draggable.c.H[0xD077 ^ 0xD05B] = 0xD06D ^ 0xD05B;
        kotakbaz.rain.client.draggable.c.H[0xB4BC ^ 0xB5B4] = 0x2D15 ^ 0xB5B4;
        kotakbaz.rain.client.draggable.c.H[0xFDB2 ^ 0xFD0B] = 0xC341 ^ 0xFD0B;
        kotakbaz.rain.client.draggable.c.H[0x5BD9 ^ 0x5B8F] = 0x5B8F ^ 0x5B8F;
        kotakbaz.rain.client.draggable.c.H[0xD1C2 ^ 0xD1C3] = 0xD1F1 ^ 0xD1C3;
        kotakbaz.rain.client.draggable.c.H[0x6AA4 ^ 0x6AA6] = 0xFFFF9572 ^ 0x6AA6;
        kotakbaz.rain.client.draggable.c.H[0x10402 ^ 0x10504] = 0x1794A ^ 0x10504;
        kotakbaz.rain.client.draggable.c.H[0xFE7E ^ 0xFF57] = 0x8C70 ^ 0xFF57;
        kotakbaz.rain.client.draggable.c.H[0xD5FD ^ 0xD5B9] = 0xD5B9 ^ 0xD5B9;
        kotakbaz.rain.client.draggable.c.H[0x3629 ^ 0x3712] = 0xD703 ^ 0x3712;
        kotakbaz.rain.client.draggable.c.H[0x9938 ^ 0x99F1] = 0x33FA ^ 0x99F1;
        kotakbaz.rain.client.draggable.c.H[0x792B ^ 0x79A6] = 0x799B ^ 0x79A6;
        kotakbaz.rain.client.draggable.c.H[0x97F8 ^ 0x9770] = 0x9767 ^ 0x9770;
        kotakbaz.rain.client.draggable.c.H[0x9FC6 ^ 0x9EC2] = 0xE28C ^ 0x9EC2;
        kotakbaz.rain.client.draggable.c.H[0x285D ^ 0x28A1] = 0x18A8 ^ 0x28A1;
        kotakbaz.rain.client.draggable.c.H[0xCF20 ^ 0xCF5F] = 0xCF1C ^ 0xCF5F;
        kotakbaz.rain.client.draggable.c.H[0x487C ^ 0x4872] = 0xFFFFB7F6 ^ 0x4872;
        kotakbaz.rain.client.draggable.c.H[0x2197 ^ 0x21FD] = 0xFFFFDE70 ^ 0x21FD;
        kotakbaz.rain.client.draggable.c.H[0x4471 ^ 0x44C7] = 0xFFFF0433 ^ 0x44C7;
        kotakbaz.rain.client.draggable.c.H[0xB91D ^ 0xB84B] = 0x634A ^ 0xB84B;
        kotakbaz.rain.client.draggable.c.H[0x6A3B ^ 0x6BBC] = 0xFFFF9473 ^ 0x6BBC;
        kotakbaz.rain.client.draggable.c.H[0x1B35 ^ 0x1BC1] = 0xC98C ^ 0x1BC1;
        kotakbaz.rain.client.draggable.c.H[0x7742 ^ 0x7719] = 0x773F ^ 0x7719;
        kotakbaz.rain.client.draggable.c.H[0x5237 ^ 0x52F1] = 0x64FB ^ 0x52F1;
        kotakbaz.rain.client.draggable.c.H[0x79D8 ^ 0x79D0] = 0x79DE ^ 0x79D0;
        kotakbaz.rain.client.draggable.c.H[0x10DD6 ^ 0x10D09] = 0x19A8E ^ 0x10D09;
        kotakbaz.rain.client.draggable.c.H[0xAE8E ^ 0xAECD] = 0xAECF ^ 0xAECD;
        kotakbaz.rain.client.draggable.c.H[0xAED2 ^ 0xAFF8] = 0xDCBE ^ 0xAFF8;
        kotakbaz.rain.client.draggable.c.H[0x10AFE ^ 0x10B8F] = 0x10BA3 ^ 0x10B8F;
        kotakbaz.rain.client.draggable.c.H[0x3EB4 ^ 0x3FF7] = 0x5AD0 ^ 0x3FF7;
        kotakbaz.rain.client.draggable.c.H[0x1024A ^ 0x10324] = 0x10328 ^ 0x10324;
        kotakbaz.rain.client.draggable.c.H[0x71AF ^ 0x717B] = 0x7BBA ^ 0x717B;
        kotakbaz.rain.client.draggable.c.H[0xC32D ^ 0xC36F] = 0xC36F ^ 0xC36F;
        kotakbaz.rain.client.draggable.c.H[0x86C1 ^ 0x86E1] = 0x86D8 ^ 0x86E1;
        kotakbaz.rain.client.draggable.c.H[0x4E15 ^ 0x4F20] = 0xFFFF7872 ^ 0x4F20;
        kotakbaz.rain.client.draggable.c.H[0x897D ^ 0x88F7] = 0x88F8 ^ 0x88F7;
        kotakbaz.rain.client.draggable.c.H[0x5B70 ^ 0x5BE5] = 0x5BE5 ^ 0x5BE5;
        kotakbaz.rain.client.draggable.c.H[0x436C ^ 0x43F1] = 0x3207 ^ 0x43F1;
        kotakbaz.rain.client.draggable.c.H[0xF1E1 ^ 0xF0EF] = 0xBFC1 ^ 0xF0EF;
        kotakbaz.rain.client.draggable.c.H[0x36EE ^ 0x376C] = 0x376B ^ 0x376C;
        kotakbaz.rain.client.draggable.c.H[0x23FA ^ 0x2374] = 0x2355 ^ 0x2374;
        kotakbaz.rain.client.draggable.c.H[0xA90F ^ 0xA9BD] = 0x8781 ^ 0xA9BD;
        kotakbaz.rain.client.draggable.c.H[0xE559 ^ 0xE599] = 0x991A ^ 0xE599;
        kotakbaz.rain.client.draggable.c.H[0xA211 ^ 0xA323] = 0x1078 ^ 0xA323;
        kotakbaz.rain.client.draggable.c.H[0x9EFF ^ 0x9E0D] = 0xCAC0 ^ 0x9E0D;
        kotakbaz.rain.client.draggable.c.H[0xD8A6 ^ 0xD89A] = 0xFFFF27E7 ^ 0xD89A;
        kotakbaz.rain.client.draggable.c.H[0xD365 ^ 0xD31C] = 0xD32E ^ 0xD31C;
        kotakbaz.rain.client.draggable.c.H[0x92F6 ^ 0x93B1] = 0x946A ^ 0x93B1;
        kotakbaz.rain.client.draggable.c.H[0x54F9 ^ 0x5424] = 0xFFFF8DDC ^ 0x5424;
        kotakbaz.rain.client.draggable.c.H[0x545D ^ 0x5458] = 0xFFFFAB83 ^ 0x5458;
        kotakbaz.rain.client.draggable.c.H[0x57D6 ^ 0x56D6] = 0xED45 ^ 0x56D6;
        kotakbaz.rain.client.draggable.c.H[0x2CBE ^ 0x2DE4] = 0xCB36 ^ 0x2DE4;
        kotakbaz.rain.client.draggable.c.H[0x42C5 ^ 0x4240] = 0xFFFFBDCB ^ 0x4240;
        kotakbaz.rain.client.draggable.c.H[0xDE0E ^ 0xDF56] = 0x3984 ^ 0xDF56;
        kotakbaz.rain.client.draggable.c.H[0x347A ^ 0x34CE] = 0x8B8D ^ 0x34CE;
        kotakbaz.rain.client.draggable.c.H[0x67C9 ^ 0x6725] = 0xEC88 ^ 0x6725;
        kotakbaz.rain.client.draggable.c.H[0xB4D0 ^ 0xB559] = 0xFFFF4A8B ^ 0xB559;
        kotakbaz.rain.client.draggable.c.H[0x10BE3 ^ 0x10B0C] = 0x15FD3 ^ 0x10B0C;
        kotakbaz.rain.client.draggable.c.H[0xB5BE ^ 0xB4A9] = 0xE795 ^ 0xB4A9;
        kotakbaz.rain.client.draggable.c.H[0x4AB8 ^ 0x4A29] = 0x4A2B ^ 0x4A29;
        kotakbaz.rain.client.draggable.c.H[0x2A8B ^ 0x2BF7] = 0x2BF6 ^ 0x2BF7;
        kotakbaz.rain.client.draggable.c.H[0x8F88 ^ 0x8EC1] = 0xFFFF76CA ^ 0x8EC1;
        kotakbaz.rain.client.draggable.c.H[0x10837 ^ 0x10936] = 0xFFFE4D2C ^ 0x10936;
        kotakbaz.rain.client.draggable.c.H[0x16D3 ^ 0x175E] = 0xFFFFE8C0 ^ 0x175E;
        kotakbaz.rain.client.draggable.c.H[0x8795 ^ 0x8774] = 0x10B0 ^ 0x8774;
        kotakbaz.rain.client.draggable.c.H[0x731B ^ 0x7228] = 0xBA83 ^ 0x7228;
        kotakbaz.rain.client.draggable.c.H[0x9859 ^ 0x982A] = 0xFFFF678C ^ 0x982A;
        kotakbaz.rain.client.draggable.c.H[0xA3D7 ^ 0xA2C7] = 0x840D ^ 0xA2C7;
        kotakbaz.rain.client.draggable.c.H[0x10514 ^ 0x1050E] = 0x10521 ^ 0x1050E;
        kotakbaz.rain.client.draggable.c.H[0x5374 ^ 0x53D7] = 0xB143 ^ 0x53D7;
        kotakbaz.rain.client.draggable.c.H[0xB8EE ^ 0xB8E4] = 0xB8E2 ^ 0xB8E4;
        kotakbaz.rain.client.draggable.c.H[0xD720 ^ 0xD78C] = 0xB9BB ^ 0xD78C;
        kotakbaz.rain.client.draggable.c.H[0xDA00 ^ 0xDA4D] = 0x5667 ^ 0xDA4D;
        kotakbaz.rain.client.draggable.c.H[0xB8FE ^ 0xB803] = 0xFFFF779D ^ 0xB803;
        kotakbaz.rain.client.draggable.c.H[0x36C0 ^ 0x3646] = 0x366D ^ 0x3646;
        kotakbaz.rain.client.draggable.c.H[0xC442 ^ 0xC4DA] = 0x5E85 ^ 0xC4DA;
        kotakbaz.rain.client.draggable.c.H[0x9995 ^ 0x99AC] = 0x9924 ^ 0x99AC;
        kotakbaz.rain.client.draggable.c.H[0xEA33 ^ 0xEB64] = 0xDB1 ^ 0xEB64;
        kotakbaz.rain.client.draggable.c.H[0x14E7 ^ 0x15ED] = 0x8D4C ^ 0x15ED;
        kotakbaz.rain.client.draggable.c.H[0x3804 ^ 0x3853] = 0x38F7 ^ 0x3853;
        kotakbaz.rain.client.draggable.c.H[0x1017A ^ 0x10180] = 0x175F4 ^ 0x10180;
        kotakbaz.rain.client.draggable.c.H[0x6995 ^ 0x68B6] = 0x2F7F ^ 0x68B6;
        kotakbaz.rain.client.draggable.c.H[0xBDB8 ^ 0xBD09] = 0x9375 ^ 0xBD09;
        kotakbaz.rain.client.draggable.c.H[0xCD84 ^ 0xCD38] = 0x7D39 ^ 0xCD38;
        kotakbaz.rain.client.draggable.c.H[0x343D ^ 0x3531] = 0x7A1F ^ 0x3531;
        kotakbaz.rain.client.draggable.c.H[0x1D36 ^ 0x1D29] = 0x1D5B ^ 0x1D29;
        kotakbaz.rain.client.draggable.c.H[0x513E ^ 0x5161] = 0xFFFFAED4 ^ 0x5161;
        kotakbaz.rain.client.draggable.c.H[0x149B ^ 0x1400] = 0x8E5D ^ 0x1400;
        kotakbaz.rain.client.draggable.c.H[0x213F ^ 0x215E] = 0x217B ^ 0x215E;
        kotakbaz.rain.client.draggable.c.H[0x2C63 ^ 0x2C19] = 0xFFFFD3EC ^ 0x2C19;
        kotakbaz.rain.client.draggable.c.H[0x10CAC ^ 0x10DE3] = 0x1BA96 ^ 0x10DE3;
        kotakbaz.rain.client.draggable.c.H[0x68F4 ^ 0x69E7] = 0x9D3B ^ 0x69E7;
        kotakbaz.rain.client.draggable.c.H[0x27F3 ^ 0x2717] = 0xF6A4 ^ 0x2717;
        kotakbaz.rain.client.draggable.c.H[0xDB2F ^ 0xDA49] = 0xE312 ^ 0xDA49;
        kotakbaz.rain.client.draggable.c.H[0x5BC9 ^ 0x5B07] = 0xFFFF771A ^ 0x5B07;
        kotakbaz.rain.client.draggable.c.H[0x1B5D ^ 0x1A58] = 0xFFFF998A ^ 0x1A58;
        kotakbaz.rain.client.draggable.c.H[0xCB0D ^ 0xCBA9] = 0x7393 ^ 0xCBA9;
        kotakbaz.rain.client.draggable.c.H[0x383 ^ 0x2FC] = 0x2FB ^ 0x2FC;
        kotakbaz.rain.client.draggable.c.H[0x6E43 ^ 0x6EBB] = 0x1ACF ^ 0x6EBB;
        kotakbaz.rain.client.draggable.c.H[0x4E18 ^ 0x4F73] = 0x1B9C ^ 0x4F73;
        kotakbaz.rain.client.draggable.c.H[0x6418 ^ 0x659D] = 0xFFFF9A7A ^ 0x659D;
        kotakbaz.rain.client.draggable.c.H[0x108C6 ^ 0x1082D] = 0x18399 ^ 0x1082D;
        kotakbaz.rain.client.draggable.c.H[0x243B ^ 0x2521] = 0x760D ^ 0x2521;
        kotakbaz.rain.client.draggable.c.H[0xB791 ^ 0xB778] = 0x2B24 ^ 0xB778;
        kotakbaz.rain.client.draggable.c.H[0xC9DB ^ 0xC9E4] = 0xC9E7 ^ 0xC9E4;
        kotakbaz.rain.client.draggable.c.H[0xDF8 ^ 0xCD6] = 0xA96D ^ 0xCD6;
        kotakbaz.rain.client.draggable.c.H[0x75DE ^ 0x7508] = 0x7FF7 ^ 0x7508;
        kotakbaz.rain.client.draggable.c.H[0x21B3 ^ 0x2185] = 0x21C4 ^ 0x2185;
        kotakbaz.rain.client.draggable.c.H[0x70 ^ 0x5A] = 0x42 ^ 0x5A;
        kotakbaz.rain.client.draggable.c.H[0x735E ^ 0x72DE] = 0x72D6 ^ 0x72DE;
        kotakbaz.rain.client.draggable.c.H[0x7D7A ^ 0x7DBF] = 0x4B93 ^ 0x7DBF;
        kotakbaz.rain.client.draggable.c.H[0x8074 ^ 0x80F3] = 0x80D8 ^ 0x80F3;
        kotakbaz.rain.client.draggable.c.H[0x25FE ^ 0x249D] = 0xC3FA ^ 0x249D;
        kotakbaz.rain.client.draggable.c.H[3 ^ 0x33] = 0xBB ^ 0x33;
        kotakbaz.rain.client.draggable.c.H[0x84E ^ 0x8E4] = 0xE27 ^ 0x8E4;
        kotakbaz.rain.client.draggable.c.H[0xFFC7 ^ 0xFFE3] = 0xFF46 ^ 0xFFE3;
        kotakbaz.rain.client.draggable.c.H[0x6D5D ^ 0x6DB3] = 0xE61E ^ 0x6DB3;
        kotakbaz.rain.client.draggable.c.H[0xDD0A ^ 0xDC4E] = 0xB962 ^ 0xDC4E;
        kotakbaz.rain.client.draggable.c.H[0x752A ^ 0x75A5] = 0x75DB ^ 0x75A5;
        kotakbaz.rain.client.draggable.c.H[0x9E5 ^ 0x8A8] = 0xFFFFA65E ^ 0x8A8;
        kotakbaz.rain.client.draggable.c.H[0xD9F ^ 0xD30] = 0x6308 ^ 0xD30;
        kotakbaz.rain.client.draggable.c.H[0x10D66 ^ 0x10D12] = 0x10D2F ^ 0x10D12;
        kotakbaz.rain.client.draggable.c.H[0xFD9 ^ 0xF45] = 0x7EBA ^ 0xF45;
        kotakbaz.rain.client.draggable.c.H[0xE8AB ^ 0xE9C7] = 0xE9C6 ^ 0xE9C7;
        kotakbaz.rain.client.draggable.c.H[0x10788 ^ 0x10712] = 0xFFFE62B6 ^ 0x10712;
        kotakbaz.rain.client.draggable.c.H[0x13C4 ^ 0x130F] = 0xB904 ^ 0x130F;
        kotakbaz.rain.client.draggable.c.H[0x582 ^ 0x5D8] = 0x5EB ^ 0x5D8;
        kotakbaz.rain.client.draggable.c.H[0x4F8 ^ 0x59A] = 0x22E9 ^ 0x59A;
        kotakbaz.rain.client.draggable.c.H[0x6461 ^ 0x6440] = 0xFFFF9BA0 ^ 0x6440;
        kotakbaz.rain.client.draggable.c.H[0x73BC ^ 0x73FA] = 0x7396 ^ 0x73FA;
        kotakbaz.rain.client.draggable.c.H[0xA3AB ^ 0xA305] = 0xFFFF3284 ^ 0xA305;
        kotakbaz.rain.client.draggable.c.H[0x7CA7 ^ 0x7CEE] = 0xD5AD ^ 0x7CEE;
        kotakbaz.rain.client.draggable.c.H[0x6083 ^ 0x61C1] = 0xFDDA ^ 0x61C1;
        kotakbaz.rain.client.draggable.c.H[0xCE80 ^ 0xCEBD] = 0xCEEA ^ 0xCEBD;
        kotakbaz.rain.client.draggable.c.H[0x6B56 ^ 0x6ADD] = 0x6AF2 ^ 0x6ADD;
        kotakbaz.rain.client.draggable.c.H[0x8142 ^ 0x81F9] = 0xBFB3 ^ 0x81F9;
        kotakbaz.rain.client.draggable.c.H[0x10103 ^ 0x1002F] = 0x1A594 ^ 0x1002F;
        kotakbaz.rain.client.draggable.c.H[0x3BD3 ^ 0x3BC7] = 0x3BC5 ^ 0x3BC7;
        kotakbaz.rain.client.draggable.c.H[0x851C ^ 0x845A] = 0xE176 ^ 0x845A;
        kotakbaz.rain.client.draggable.c.H[0x83D4 ^ 0x82B4] = 0x82A6 ^ 0x82B4;
        kotakbaz.rain.client.draggable.c.H[0xD827 ^ 0xD840] = 0xD839 ^ 0xD840;
        kotakbaz.rain.client.draggable.c.H[0xF8F0 ^ 0xF9C4] = 0x3166 ^ 0xF9C4;
        kotakbaz.rain.client.draggable.c.H[0xECE2 ^ 0xEDB0] = 0x5AC5 ^ 0xEDB0;
        kotakbaz.rain.client.draggable.c.H[0x2E63 ^ 0x2EE1] = 0x2EE9 ^ 0x2EE1;
        kotakbaz.rain.client.draggable.c.H[0xBB8D ^ 0xBB7D] = 0xEFB0 ^ 0xBB7D;
        kotakbaz.rain.client.draggable.c.H[0xD784 ^ 0xD795] = 0xFFFF2821 ^ 0xD795;
        kotakbaz.rain.client.draggable.c.H[0x2756 ^ 0x27F6] = 0xC568 ^ 0x27F6;
        kotakbaz.rain.client.draggable.c.H[0x2DCA ^ 0x2D6D] = 0x955A ^ 0x2D6D;
        kotakbaz.rain.client.draggable.c.H[0xE973 ^ 0xE933] = 0xE933 ^ 0xE933;
        kotakbaz.rain.client.draggable.c.H[0x6567 ^ 0x657A] = 0x6504 ^ 0x657A;
        kotakbaz.rain.client.draggable.c.H[0x10123 ^ 0x10140] = 0xFFFEFEE7 ^ 0x10140;
        kotakbaz.rain.client.draggable.c.H[0xBB12 ^ 0xBA66] = 0xBA64 ^ 0xBA66;
        kotakbaz.rain.client.draggable.c.H[0x8B68 ^ 0x8BC1] = 0x8D73 ^ 0x8BC1;
        kotakbaz.rain.client.draggable.c.H[0xD129 ^ 0xD152] = 0xFFFF2EEB ^ 0xD152;
        kotakbaz.rain.client.draggable.c.H[0xB47 ^ 0xA22] = 0xF0B8 ^ 0xA22;
        kotakbaz.rain.client.draggable.c.H[0xC320 ^ 0xC368] = 0x3C8A ^ 0xC368;
        kotakbaz.rain.client.draggable.c.H[0x4722 ^ 0x47A9] = 0x47D8 ^ 0x47A9;
        kotakbaz.rain.client.draggable.c.H[0x35BC ^ 0x3562] = 0x1322 ^ 0x3562;
    }
}

