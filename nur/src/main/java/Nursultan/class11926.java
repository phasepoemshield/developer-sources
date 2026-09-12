package Nursultan;

import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import minecraft.class06322;

public class class11926 implements class11463 {
   @Override
   public class11885 N(InputStream var1) throws Exception {
      class06322 var2 = new class06322(var1);

      class11885 var5;
      try {
         ByteBuffer var3 = var2.y();
         AudioFormat var4 = var2.N();
         var5 = new class11885(var3, var4.getChannels(), var4.getSampleSizeInBits(), (int)var4.getSampleRate());
      } catch (Throwable var7) {
         try {
            var2.close();
         } catch (Throwable var6) {
            var7.addSuppressed(var6);
         }

         throw var7;
      }

      var2.close();
      return var5;
   }
}
