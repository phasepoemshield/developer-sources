package oxxxde;

import java.io.IOException;
import java.util.Locale;
import javax.imageio.ImageReader;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;

// $VF: Compiled from heavy
public class خض extends ImageReaderSpi {
   private static final String[] names = new String[]{"gif", "GIF"};
   private static final String[] suffixes = new String[]{"gif"};
   private static final String version = "1.0";
   private static final String vendorName = "Oracle Corporation";
   private static final String[] writerSpiNames = new String[]{"com.sun.imageio.plugins.gif.GIFImageWriterSpi"};
   private static final String[] MIMETypes = new String[]{"image/gif"};
   private static final String readerClassName = "com.sun.imageio.plugins.gif.GIFImageReader";

   @Override
   public String getDescription(Locale locale) {
      return "Standard GIF image reader";
   }

   public خض() {
      super(
         "Oracle Corporation",
         "1.0",
         names,
         suffixes,
         MIMETypes,
         "com.sun.imageio.plugins.gif.GIFImageReader",
         new Class[]{ImageInputStream.class},
         writerSpiNames,
         true,
         "javax_imageio_gif_stream_1.0",
         "com.sun.imageio.plugins.gif.GIFStreamMetadataFormat",
         null,
         null,
         true,
         "javax_imageio_gif_image_1.0",
         "com.sun.imageio.plugins.gif.GIFImageMetadataFormat",
         null,
         null
      );
   }

   @Override
   public ImageReader createReaderInstance(Object extension) {
      return new ذئ(this);
   }

   @Override
   public boolean canDecodeInput(Object input) throws IOException {
      if (!(input instanceof ImageInputStream stream)) {
         return false;
      } else {
         byte[] b = new byte[6];
         stream.mark();
         boolean full = زف.tryReadFully(stream, b);
         stream.reset();
         return full && b[0] == 71 && b[1] == 73 && b[2] == 70 && b[3] == 56 && (b[4] == 55 || b[4] == 57) && b[5] == 97;
      }
   }
}
