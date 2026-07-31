/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.vertex.element;

import kotakbaz.rain.client.render.main.vertex.element.a_0;
import lombok.Generated;

public class a {
    private final int a;
    private final int A;
    private final int b;
    private final a_0<?> B;
    public static int[] C;

    public a(int id, int count, a_0<?> type) {
        this.a = id;
        this.A = count;
        this.b = this.A * type.byteSize();
        this.B = type;
    }

    public int mask() {
        int n2 = C[0];
        n2 += C[1];
        return (n2 -= C[2]) << this.a;
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
    public a_0<?> getType() {
        return this.B;
    }

    static {
        kotakbaz.rain.client.render.main.vertex.element.a.a();
    }

    public static void a() {
        C = new int[0xF851 ^ 0xF852];
        kotakbaz.rain.client.render.main.vertex.element.a.C[0x69D3 ^ 0x69D3] = 0x69AB ^ 0x69D3;
        kotakbaz.rain.client.render.main.vertex.element.a.C[0x5B8A ^ 0x5B8B] = 0xFFFFA43E ^ 0x5B8B;
        kotakbaz.rain.client.render.main.vertex.element.a.C[0xC357 ^ 0xC355] = 0xC379 ^ 0xC355;
    }
}

