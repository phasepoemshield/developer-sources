/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11463
 *  Nursultan.class11485
 *  Nursultan.class11885
 */
package Nursultan;

import Nursultan.class11463;
import Nursultan.class11485;
import Nursultan.class11885;
import Nursultan.class11926;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class class11932 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;

    private void L() {
    }

    public class11932() {
        this.L();
        this.y_0 = new class11926();
        this.y_1 = new class11485();
    }

    static {
        class11932.i();
        byte[] byArray = new byte[]{79, 103, 103, 83};
        N_0 = byArray;
    }

    private static void i() {
    }

    public class11885 N(InputStream inputStream) throws Exception {
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream)inputStream : new BufferedInputStream(inputStream);
        return (this.N(bufferedInputStream) ? (class11463)this.y_0 : (class11463)this.y_1).N((InputStream)bufferedInputStream);
    }

    private boolean N(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(((byte[])N_0).length);
        byte[] byArray = new byte[((byte[])N_0).length];
        int n = bufferedInputStream.readNBytes(byArray, 0, byArray.length);
        bufferedInputStream.reset();
        return n == ((byte[])N_0).length && Arrays.equals(byArray, (byte[])N_0);
    }
}

