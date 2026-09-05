/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11885
 *  org.lwjgl.BufferUtils
 */
package Nursultan;

import Nursultan.class11463;
import Nursultan.class11885;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import org.lwjgl.BufferUtils;

public class class11485
implements class11463 {
    @Override
    public class11885 N(InputStream inputStream) throws Exception {
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream);){
            class11885 class118852;
            block12: {
                AudioFormat audioFormat = audioInputStream.getFormat();
                AudioFormat audioFormat2 = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, audioFormat.getSampleRate(), 16, audioFormat.getChannels(), audioFormat.getChannels() * 2, audioFormat.getSampleRate(), false);
                AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(audioFormat2, audioInputStream);
                try {
                    byte[] byArray = audioInputStream2.readAllBytes();
                    ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)byArray.length);
                    byteBuffer.put(byArray).flip();
                    class118852 = new class11885(byteBuffer, audioFormat2.getChannels(), 16, (int)audioFormat2.getSampleRate());
                    if (audioInputStream2 == null) break block12;
                }
                catch (Throwable throwable) {
                    if (audioInputStream2 != null) {
                        try {
                            audioInputStream2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                audioInputStream2.close();
            }
            return class118852;
        }
    }
}

