package oxxxde;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotakbaz.rain.client.render.main.vertex.element.VertexElement;
import kotakbaz.rain.client.render.main.vertex.format.A;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import org.lwjgl.opengl.GL30;

// $VF: Compiled from heavy
public class بك extends ك {
   private void setupBuffer(VertexFormat vbaIsNew, boolean format) {
      int i = format.getVertexSize();
      List<VertexElement> list = format.getVertexElements();

      for (int j = 0; j < list.size(); j++) {
         VertexElement vertexElement = list.get(j);
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
   public A createVertexFormatBuffer(VertexFormat vertexFormat) {
      int i = GL30.glGenVertexArrays();
      GL30.glBindVertexArray(i);
      return new A(i, vertexFormat, new AtomicReference<>());
   }

   @Override
   public void applyFormatToBuffer(تظ vertexBuffer, VertexFormat vertexFormat) {
      A vertexFormatBuffer = vertexFormat.getVertexFormatBuffer();
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
