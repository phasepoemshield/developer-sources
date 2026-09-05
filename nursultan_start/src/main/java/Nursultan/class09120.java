/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class class09120 {
    private static String[] L;
    public static Object N_0;

    private static void L() {
        N_0 = (byte)1;
    }

    private class09120() {
        throw new UnsupportedOperationException(L[1]);
    }

    static {
        class09120.y();
        class09120.L();
    }

    private static void y() {
        L = new String[2];
        class09120.L[0] = "Unable to write Microsoft account data.";
        class09120.L[1] = "This is a utility class and cannot be instantiated";
    }

    public static String N(byte[] byArray) {
        String string;
        if (byArray == null || byArray.length == 0) {
            return null;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
        try {
            dataInputStream.readByte();
            string = dataInputStream.readUTF();
        }
        catch (Throwable throwable) {
            try {
                try {
                    dataInputStream.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException iOException) {
                return null;
            }
        }
        dataInputStream.close();
        return string;
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static byte[] N(String string) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            byte[] byArray;
            try (DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);){
                dataOutputStream.writeByte(1);
                dataOutputStream.writeUTF(string);
                byArray = byteArrayOutputStream.toByteArray();
            }
            return byArray;
        }
        catch (IOException iOException) {
            throw new IllegalStateException(L[0], iOException);
        }
    }
}

