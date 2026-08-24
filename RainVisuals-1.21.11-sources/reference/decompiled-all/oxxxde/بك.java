package oxxxde;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.lwjgl.opengl.GL30;

// $VF: Compiled from heavy
public class بك extends ك {
   private void setupBuffer(سا vbaIsNew, boolean format) {
      int i = format.getVertexSize();
      List<سئ> list = format.getVertexElements();

      for (int j = 0; j < list.size(); j++) {
         سئ vertexElement = list.get(j);
         if (vbaIsNew) {
            GL30.glEnableVertexAttribArray(j);
         }

         if (vertexElement.getType().glId() == 5126) {
            GL30.glVertexAttribPointer(j, vertexElement.getCount(), vertexElement.getType().glId(), false, i, format.getElementOffset(vertexElement));
         } else {
            GL30.glVertexAttribIPointer(j, vertexElement.getCount(), vertexElement.getType().glId(), i, format.getElementOffset(vertexElement));
         }
      }
   }

   @Override
   public طؤ createVertexFormatBuffer(سا vertexFormat) {
      int i = GL30.glGenVertexArrays();
      GL30.glBindVertexArray(i);
      return new طؤ(i, vertexFormat, new AtomicReference<>());
   }

   @Override
   public void applyFormatToBuffer(تظ vertexBuffer, سا vertexFormat) {
      طؤ vertexFormatBuffer = vertexFormat.getVertexFormatBuffer();
      if (vertexFormatBuffer == null) {
         vertexFormatBuffer = this.createVertexFormatBuffer(vertexFormat);
         vertexFormat.setVertexFormatBuffer(vertexFormatBuffer);
      }

      GL30.glBindVertexArray(vertexFormatBuffer.glId());
      تظ previousBuffer = vertexFormatBuffer.buffer().get();
      if (previousBuffer != vertexBuffer) {
         vertexBuffer.bind();
         this.setupBuffer(vertexFormat, previousBuffer == null);
         vertexFormatBuffer.buffer().set(vertexBuffer);
      }
   }
}
