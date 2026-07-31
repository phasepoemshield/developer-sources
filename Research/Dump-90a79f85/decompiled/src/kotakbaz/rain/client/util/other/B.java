/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.other;

import kotakbaz.rain.client.util.animations.A;
import kotakbaz.rain.client.util.animations.b;
import kotakbaz.rain.client.util.other.C;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\b\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0005R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010\u00a8\u0006\u001f"}, d2={"Lkotakbaz/rain/client/util/other/ScrollUtil;", "", "", "speed", "<init>", "(F)V", "delta", "", "scroll", "value", "setMax", "(F)Lkotakbaz/rain/client/util/other/ScrollUtil;", "setValue", "setTargetValue", "update", "()V", "()F", "max", "contentHeight", "viewHeight", "clamp", "(FF)V", "F", "getSpeed", "setSpeed", "targetValue", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "animation", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "getOffset", "offset", "rain-visuals"})
public final class B {
    private float a;
    private float A;
    private float b;
    private float B;
    @NotNull
    private final b c;
    public static int[] d;

    public B(float f2) {
        super();
        this.a = f2;
        int n = d[0];
        n -= d[1];
        this.c = new b(0.0f, n += d[2], null);
    }

    public /* synthetic */ B(float f2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        int n2 = d[3];
        n2 += d[4];
        if ((n & (n2 -= d[5])) != 0) {
            f2 = 8.0f;
        }
        this(f2);
    }

    public final float getSpeed() {
        return this.a;
    }

    public final void setSpeed(float f2) {
        this.a = f2;
    }

    public final float getOffset() {
        return this.B;
    }

    public final void scroll(float f2) {
        this.b += f2 * this.a;
    }

    @NotNull
    public final B setMax(float f2) {
        this.A = RangesKt.coerceAtLeast(f2, 0.0f);
        return this;
    }

    @NotNull
    public final B setValue(float f2) {
        this.B = f2;
        return this;
    }

    @NotNull
    public final B setTargetValue(float f2) {
        this.b = f2;
        return this;
    }

    public final void update() {
        this.b = RangesKt.coerceIn(this.b, -this.A, 0.0f);
        float f2 = this.b - this.B;
        this.B = this.c.animate(this.b, 80.0f, new C(kotakbaz.rain.client.util.animations.A.INSTANCE));
        if (Math.abs(f2) < 0.1f) {
            this.B = this.b;
        }
    }

    public final float value() {
        return -this.B;
    }

    public final float max() {
        return this.A;
    }

    public final void clamp(float f2, float f3) {
        this.setMax(RangesKt.coerceAtLeast(f2 - f3, 0.0f));
        this.update();
        if (this.A <= 0.0f) {
            this.b = 0.0f;
            this.B = 0.0f;
            int n = d[6];
            n += d[7];
            kotakbaz.rain.client.util.animations.b.animate$default(this.c, 0.0f, 0.0f, null, n -= d[8], null);
            return;
        }
    }

    public B() {
        int n = d[9];
        n ^= d[10];
        this(0.0f, n ^= d[11], null);
    }

    static {
        kotakbaz.rain.client.util.other.B.a();
    }

    public static void a() {
        d = new int[0xC7B9 ^ 0xC7B5];
        kotakbaz.rain.client.util.other.B.d[0xE356 ^ 0xE35F] = 0xE326 ^ 0xE35F;
        kotakbaz.rain.client.util.other.B.d[0xF967 ^ 0xF962] = 0xFFFF06E7 ^ 0xF962;
        kotakbaz.rain.client.util.other.B.d[0xFC47 ^ 0xFC41] = 0xFFFF03A7 ^ 0xFC41;
        kotakbaz.rain.client.util.other.B.d[0x417C ^ 0x4176] = 0xFFFFBEFB ^ 0x4176;
        kotakbaz.rain.client.util.other.B.d[0x8E52 ^ 0x8E51] = 0xFFFF71D7 ^ 0x8E51;
        kotakbaz.rain.client.util.other.B.d[0x9F7B ^ 0x9F7A] = 0x9F5B ^ 0x9F7A;
        kotakbaz.rain.client.util.other.B.d[0x83F8 ^ 0x83FA] = 0x83D3 ^ 0x83FA;
        kotakbaz.rain.client.util.other.B.d[0x2F8 ^ 0x2FF] = 0x2D7 ^ 0x2FF;
        kotakbaz.rain.client.util.other.B.d[0xF38E ^ 0xF385] = 0xFFFF0C70 ^ 0xF385;
        kotakbaz.rain.client.util.other.B.d[0x5D63 ^ 0x5D63] = 0xFFFFA29A ^ 0x5D63;
        kotakbaz.rain.client.util.other.B.d[0xF782 ^ 0xF786] = 0xF786 ^ 0xF786;
        kotakbaz.rain.client.util.other.B.d[0x3006 ^ 0x300E] = 0x3004 ^ 0x300E;
    }
}

