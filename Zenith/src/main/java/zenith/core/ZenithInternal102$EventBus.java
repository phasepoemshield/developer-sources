package zenith;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import org.apache.commons.lang3.RandomStringUtils;
import org.lwjgl.BufferUtils;

public class ZenithInternal102$EventBus {
   public final ZenithInternal116 I11I1IlI;
   private int lII1ll1l1I1lIlll1 = 0;

   public ZenithInternal102$EventBus(BufferedImage bufferedimage) {
      this.I11I1IlI = new ZenithInternal116("shadow_" + RandomStringUtils.randomAlphanumeric(8));

      try {
         ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
         ImageIO.write(bufferedimage, "png", bytearrayoutputstream);
         byte[] abyte = bytearrayoutputstream.toByteArray();
         ByteBuffer bytebuffer = BufferUtils.createByteBuffer(abyte.length).put(abyte);
         bytebuffer.flip();
         NativeImageBackedTexture NativeImageBackedTexture = new NativeImageBackedTexture(NativeImage.read(bytebuffer));
         ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.getTextureManager().registerTexture(this.I11I1IlI.ll1llII11IIlIl1I1l1I1l1l(), NativeImageBackedTexture);
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   public void reset() {
      this.lII1ll1l1I1lIlll1 = 0;
   }

   public boolean lIII1llIlIl1ll11lIl1I1Ill1() {
      return ++this.lII1ll1l1I1lIlll1 > 300;
   }

   public void I1lIIl1I1l11l1IlIIII11lIlIll1() {
      ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II.getTextureManager().destroyTexture(this.I11I1IlI.ll1llII11IIlIl1I1l1I1l1l());
   }
}
