package Nursultan;

import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat.Encoding;
import org.lwjgl.BufferUtils;

public class class11485 implements class11463 {
   @Override
   public class11885 N(InputStream var1) throws Exception {
      class11885 var8;
      try (AudioInputStream var2 = AudioSystem.getAudioInputStream(var1)) {
         AudioFormat var3 = var2.getFormat();
         AudioFormat var4 = new AudioFormat(
            Encoding.PCM_SIGNED, var3.getSampleRate(), 16, var3.getChannels(), var3.getChannels() * 2, var3.getSampleRate(), false
         );

         try (AudioInputStream var5 = AudioSystem.getAudioInputStream(var4, var2)) {
            byte[] var6 = var5.readAllBytes();
            ByteBuffer var7 = BufferUtils.createByteBuffer(var6.length);
            var7.put(var6).flip();
            var8 = new class11885(var7, var4.getChannels(), 16, (int)var4.getSampleRate());
         }
      }

      return var8;
   }
}
