/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package kotakbaz.rain.client.render.main.vertex.element;

import kotakbaz.rain.client.render.main.vertex.element.A;
import lombok.Generated;

/*
 * Renamed from kotakbaz.rain.client.render.main.vertex.element.a
 */
public class a_0 {
    private final int a;
    private final int A;
    private final int b;
    private final A<?> B;
    public static int[] C;

    public a_0(int n, int n2, A<?> a2) {
        super();
        this.a = n;
        this.A = n2;
        this.b = this.A * a2.byteSize();
        this.B = a2;
    }

    public int mask() {
        int n = C[0];
        n += C[1];
        return (n -= C[2]) << this.a;
    }

    @Generated
    public int getId() {
        return this.a;
    }

    @Generated
    public int getCount() {
        return this.A;
    }

    @Generated
    public int getSize() {
        return this.b;
    }

    @Generated
    public A<?> getType() {
        return this.B;
    }

    static {
        a_0.a();
    }

    public static void a() {
        C = new int[0xF851 ^ 0xF852];
        a_0.C[0x69D3 ^ 0x69D3] = 0x69AB ^ 0x69D3;
        a_0.C[0x5B8A ^ 0x5B8B] = 0xFFFFA43E ^ 0x5B8B;
        a_0.C[0xC357 ^ 0xC355] = 0xC379 ^ 0xC355;
    }
}

