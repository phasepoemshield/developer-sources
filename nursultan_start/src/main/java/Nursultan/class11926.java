/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11463
 *  Nursultan.class11885
 *  minecraft.class06322
 */
package Nursultan;

import Nursultan.class11463;
import Nursultan.class11885;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import minecraft.class06322;

public class class11926
implements class11463 {
    public class11885 N(InputStream inputStream) throws Exception {
        try (class06322 class063222 = new class06322(inputStream);){
            ByteBuffer byteBuffer = class063222.y();
            AudioFormat audioFormat = class063222.N();
            class11885 class118852 = new class11885(byteBuffer, audioFormat.getChannels(), audioFormat.getSampleSizeInBits(), (int)audioFormat.getSampleRate());
            return class118852;
        }
    }
}

