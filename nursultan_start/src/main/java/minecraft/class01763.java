/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class04425
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00667;
import minecraft.class04425;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class01763 {
    public final int N;
    public final int y;
    public final int L;
    private final int W;
    public int u = -1;
    public float i;
    public float R;
    public float M;
    public @Nullable class01763 B;
    public boolean Z;
    public float z;
    public float U;
    public class04425 E = class04425.field_22;

    public float L(class01763 class017632) {
        float f = class017632.N - this.N;
        float f2 = class017632.y - this.y;
        float f3 = class017632.L - this.L;
        return f * f + f2 * f2 + f3 * f3;
    }

    public static class01763 L(class00667 class006672) {
        class01763 class017632 = new class01763(class006672.readInt(), class006672.readInt(), class006672.readInt());
        class01763.N(class006672, class017632);
        return class017632;
    }

    public float L(class07209 class072092) {
        float f = Math.abs(class072092.method_10263() - this.N);
        float f2 = Math.abs(class072092.method_10264() - this.y);
        float f3 = Math.abs(class072092.method_10260() - this.L);
        return f + f2 + f3;
    }

    public class01763(int n, int n2, int n3) {
        this.N = n;
        this.y = n2;
        this.L = n3;
        this.W = class01763.y(n, n2, n3);
    }

    public boolean equals(Object object) {
        if (object instanceof class01763) {
            class01763 class017632 = (class01763)object;
            return this.W == class017632.W && this.N == class017632.N && this.y == class017632.y && this.L == class017632.L;
        }
        return false;
    }

    public String toString() {
        return "Node{x=" + this.N + ", y=" + this.y + ", z=" + this.L + "}";
    }

    public int hashCode() {
        return this.W;
    }

    public class06889 i() {
        return new class06889((double)this.N, (double)this.y, (double)this.L);
    }

    public class07209 u() {
        return new class07209(this.N, this.y, this.L);
    }

    public float u(class01763 class017632) {
        float f = Math.abs(class017632.N - this.N);
        float f2 = Math.abs(class017632.y - this.y);
        float f3 = Math.abs(class017632.L - this.L);
        return f + f2 + f3;
    }

    public void y(class00667 class006672) {
        class006672.writeInt(this.N);
        class006672.writeInt(this.y);
        class006672.writeInt(this.L);
        class006672.writeFloat(this.z);
        class006672.writeFloat(this.U);
        class006672.writeBoolean(this.Z);
        class006672.N((Enum)this.E);
        class006672.writeFloat(this.M);
    }

    public float y(class01763 class017632) {
        float f = class017632.N - this.N;
        float f2 = class017632.L - this.L;
        return class04995.N((float)(f * f + f2 * f2));
    }

    public static int y(int n, int n2, int n3) {
        return n2 & 0xFF | (n & Short.MAX_VALUE) << 8 | (n3 & Short.MAX_VALUE) << 24 | (n < 0 ? Integer.MIN_VALUE : 0) | (n3 < 0 ? 32768 : 0);
    }

    public float y(class07209 class072092) {
        float f = class072092.method_10263() - this.N;
        float f2 = class072092.method_10264() - this.y;
        float f3 = class072092.method_10260() - this.L;
        return f * f + f2 * f2 + f3 * f3;
    }

    public class01763 N(int n, int n2, int n3) {
        class01763 class017632 = new class01763(n, n2, n3);
        class017632.u = this.u;
        class017632.i = this.i;
        class017632.R = this.R;
        class017632.M = this.M;
        class017632.B = this.B;
        class017632.Z = this.Z;
        class017632.z = this.z;
        class017632.U = this.U;
        class017632.E = this.E;
        return class017632;
    }

    public float N(class07209 class072092) {
        float f = class072092.method_10263() - this.N;
        float f2 = class072092.method_10264() - this.y;
        float f3 = class072092.method_10260() - this.L;
        return class04995.N((float)(f * f + f2 * f2 + f3 * f3));
    }

    protected static void N(class00667 class006672, class01763 class017632) {
        class017632.z = class006672.readFloat();
        class017632.U = class006672.readFloat();
        class017632.Z = class006672.readBoolean();
        class017632.E = (class04425)class006672.y(class04425.class);
        class017632.M = class006672.readFloat();
    }

    public float N(class01763 class017632) {
        float f = class017632.N - this.N;
        float f2 = class017632.y - this.y;
        float f3 = class017632.L - this.L;
        return class04995.N((float)(f * f + f2 * f2 + f3 * f3));
    }

    public boolean R() {
        return this.u >= 0;
    }
}

