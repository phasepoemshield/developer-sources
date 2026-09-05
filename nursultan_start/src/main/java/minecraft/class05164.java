/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class class05164 {
    private final ByteArrayOutputStream N;
    private final DataOutputStream y;

    public class05164(int n) {
        this.N = new ByteArrayOutputStream(n);
        this.y = new DataOutputStream(this.N);
    }

    public void y(int n) throws IOException {
        this.y.writeInt(Integer.reverseBytes(n));
    }

    public void y() {
        this.N.reset();
    }

    public void N(short s) throws IOException {
        this.y.writeShort(Short.reverseBytes(s));
    }

    public byte[] N() {
        return this.N.toByteArray();
    }

    public void N(float f) throws IOException {
        this.y.writeInt(Integer.reverseBytes(Float.floatToIntBits(f)));
    }

    public void N(byte[] byArray) throws IOException {
        this.y.write(byArray, 0, byArray.length);
    }

    public void N(String string) throws IOException {
        this.y.write(string.getBytes(StandardCharsets.UTF_8));
        this.y.write(0);
    }

    public void N(int n) throws IOException {
        this.y.write(n);
    }
}

