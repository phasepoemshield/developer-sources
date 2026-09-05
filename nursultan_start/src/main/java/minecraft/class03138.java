/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.io.DataOutput;
import java.io.IOException;

public class class03138
implements DataOutput {
    private final DataOutput N;

    public class03138(DataOutput dataOutput) {
        this.N = dataOutput;
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        this.N.write(byArray, n, n2);
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        this.N.write(byArray);
    }

    @Override
    public void write(int n) throws IOException {
        this.N.write(n);
    }

    @Override
    public void writeInt(int n) throws IOException {
        this.N.writeInt(n);
    }

    @Override
    public void writeUTF(String string) throws IOException {
        this.N.writeUTF(string);
    }

    @Override
    public void writeBytes(String string) throws IOException {
        this.N.writeBytes(string);
    }

    @Override
    public void writeChar(int n) throws IOException {
        this.N.writeChar(n);
    }

    @Override
    public void writeFloat(float f) throws IOException {
        this.N.writeFloat(f);
    }

    @Override
    public void writeShort(int n) throws IOException {
        this.N.writeShort(n);
    }

    @Override
    public void writeBoolean(boolean bl) throws IOException {
        this.N.writeBoolean(bl);
    }

    @Override
    public void writeByte(int n) throws IOException {
        this.N.writeByte(n);
    }

    @Override
    public void writeLong(long l) throws IOException {
        this.N.writeLong(l);
    }

    @Override
    public void writeDouble(double d) throws IOException {
        this.N.writeDouble(d);
    }

    @Override
    public void writeChars(String string) throws IOException {
        this.N.writeChars(string);
    }
}

