/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.core.MessagePack
 *  org.msgpack.core.MessageUnpacker
 */
package Nursultan;

import Nursultan.class11488;
import Nursultan.class11509;
import java.io.IOException;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;

public class class11529 {
    private class11529() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static void N(class11488 class114882, byte[] byArray) throws IOException {
        try (MessageUnpacker messageUnpacker = MessagePack.newDefaultUnpacker((byte[])class11509.N(byArray));){
            class114882.N(messageUnpacker);
        }
    }

    public static byte[] N(class11488 class114882) throws IOException {
        try (MessageBufferPacker messageBufferPacker = MessagePack.newDefaultBufferPacker();){
            class114882.y(messageBufferPacker);
            byte[] byArray = class11509.y(messageBufferPacker.toByteArray());
            return byArray;
        }
    }
}

