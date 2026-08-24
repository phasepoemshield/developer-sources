package oxxxde;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.stream.ImageInputStream;

// $VF: Compiled from heavy
public class تق {
   public static طز decompileDeltas(ImageInputStream inputStream) throws IOException {
      List<BufferedImage> frames = new ArrayList<>();
      ذئ ir = new ذئ(new خض());
      ir.setInput(inputStream);

      for (int i = 0; i < ir.getNumImages(true); i++) {
         frames.add(ir.read(i));
      }

      return new طز(frames, ((ظغ)ir.getImageMetadata(0)).delayTime);
   }

   public static طز decompileFull(ImageInputStream inputStream) throws IOException {
      List<BufferedImage> copies = new ArrayList<>();
      طز deltaData = decompileDeltas(inputStream);
      List<BufferedImage> frames = deltaData.images;
      copies.add((BufferedImage)frames.removeFirst());

      for (BufferedImage frame : frames) {
         BufferedImage img = new BufferedImage(copies.getFirst().getWidth(), copies.getFirst().getHeight(), 1);
         Graphics g = img.getGraphics();
         g.drawImage(copies.getLast(), 0, 0, null);
         g.drawImage(frame, 0, 0, null);
         copies.add(img);
      }

      return new طز(copies, deltaData.updateDelay);
   }
}
