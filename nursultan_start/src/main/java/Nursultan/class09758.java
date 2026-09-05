/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09726;
import Nursultan.class09734;
import Nursultan.class09746;
import Nursultan.class09752;
import Nursultan.class09761;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

final class class09758 {
    private static final int N = 1095123249;
    private static final int y = 2;

    private class09758() {
    }

    static void N(Path path, long l, class09734 class097342, class09752 class097522, class09726 class097262) throws IOException {
        int n = class097342.y().N();
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path, new OpenOption[0])));){
            dataOutputStream.writeInt(1095123249);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeLong(l);
            dataOutputStream.writeInt(class097342.y().ordinal());
            dataOutputStream.writeDouble(class097342.L());
            dataOutputStream.writeDouble(class097342.u());
            dataOutputStream.writeDouble(class097342.M());
            dataOutputStream.writeInt(n);
            int n2 = class097522.N();
            dataOutputStream.writeInt(n2);
            byte[] byArray = null;
            for (int i = 0; i < n2; ++i) {
                dataOutputStream.writeInt(class097522.u(i));
                dataOutputStream.writeFloat(class097522.i(i));
                dataOutputStream.writeFloat(class097522.R(i));
                dataOutputStream.writeFloat(class097522.M(i));
                dataOutputStream.writeFloat(class097522.B(i));
                dataOutputStream.writeFloat(class097522.Z(i));
                int n3 = class097522.E(i);
                int n4 = class097522.W(i);
                dataOutputStream.writeInt(n3);
                dataOutputStream.writeInt(n4);
                if (n3 <= 0 || n4 <= 0) continue;
                int n5 = n3 * n4 * n;
                if (byArray == null || byArray.length < n5) {
                    byArray = new byte[n5];
                }
                class097262.N(class097522.z(i), class097522.U(i), n3, n4, byArray);
                dataOutputStream.write(byArray, 0, n5);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static class09746 N(Path path) {
        if (path == null) return null;
        if (!Files.isReadable(path)) {
            return null;
        }
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(Files.newInputStream(path, new OpenOption[0])));){
            if (dataInputStream.readInt() != 1095123249 || dataInputStream.readInt() != 2) {
                class09746 class097462 = null;
                return class097462;
            }
            long l = dataInputStream.readLong();
            int n = dataInputStream.readInt();
            double d = dataInputStream.readDouble();
            double d2 = dataInputStream.readDouble();
            double d3 = dataInputStream.readDouble();
            int n2 = dataInputStream.readInt();
            int n3 = dataInputStream.readInt();
            if (n3 < 0) {
                class09746 class097463 = null;
                return class097463;
            }
            int[] nArray = new int[n3];
            class09761[] class09761Array = new class09761[n3];
            for (int i = 0; i < n3; ++i) {
                byte[] byArray;
                nArray[i] = dataInputStream.readInt();
                float f = dataInputStream.readFloat();
                float f2 = dataInputStream.readFloat();
                float f3 = dataInputStream.readFloat();
                float f4 = dataInputStream.readFloat();
                float f5 = dataInputStream.readFloat();
                int n4 = dataInputStream.readInt();
                int n5 = dataInputStream.readInt();
                if (n4 > 0 && n5 > 0) {
                    byArray = new byte[n4 * n5 * n2];
                    dataInputStream.readFully(byArray);
                } else {
                    byArray = new byte[]{};
                }
                class09761Array[i] = new class09761(byArray, n4, n5, n2, f, f2, f3, f4, f5);
            }
            class09746 class097464 = new class09746(l, n, d, d2, d3, n2, nArray, class09761Array);
            return class097464;
        }
        catch (IOException iOException) {
            System.err.println("[FontAtlas] ignoring unreadable atlas cache " + String.valueOf(path) + ": " + String.valueOf(iOException));
            return null;
        }
    }
}

