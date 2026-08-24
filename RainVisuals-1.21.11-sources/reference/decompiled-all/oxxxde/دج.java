package oxxxde;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.lwjgl.opengl.ARBVertexAttribBinding;
import org.lwjgl.opengl.GL30;

// $VF: Compiled from heavy
public class دج extends ك {
   private final boolean applyMesaWorkaround;

   @Override
   public void applyFormatToBuffer(تظ vertexFormat, سا vertexBuffer) {
      طؤ vertexFormatBuffer = vertexFormat.getVertexFormatBuffer();
      if (vertexFormatBuffer == null) {
         vertexFormatBuffer = this.createVertexFormatBuffer(vertexFormat);
         vertexFormat.setVertexFormatBuffer(vertexFormatBuffer);
      }

      GL30.glBindVertexArray(vertexFormatBuffer.glId());
      if (vertexFormatBuffer.buffer().get() != vertexBuffer) {
         if (this.applyMesaWorkaround && vertexFormatBuffer.buffer().get() != null && vertexFormatBuffer.buffer().get().getId() == vertexBuffer.getId()) {
            ARBVertexAttribBinding.glBindVertexBuffer(0, 0, 0L, 0);
         }

         ARBVertexAttribBinding.glBindVertexBuffer(0, vertexBuffer.getId(), 0L, vertexFormat.getVertexSize());
         vertexFormatBuffer.buffer().set(vertexBuffer);
      }
   }

   protected دج() {
      if ("Mesa".equals(GL30.glGetString(7936))) {
         String string = GL30.glGetString(7938);
         this.applyMesaWorkaround = string.contains("25.0.0") || string.contains("25.0.1") || string.contains("25.0.2");
      } else {
         this.applyMesaWorkaround = false;
      }
   }

   @Override
   public طؤ createVertexFormatBuffer(سا vertexFormat) {
      int vertBuffId = GL30.glGenVertexArrays();
      GL30.glBindVertexArray(vertBuffId);
      List<سئ> vertexElements = vertexFormat.getVertexElements();

      for (int i = 0; i < vertexElements.size(); i++) {
         سئ vertexElement = (سئ)vertexElements.get(i);
         GL30.glEnableVertexAttribArray(i);
         if (vertexElement.getType().glId() == 5126) {
            ARBVertexAttribBinding.glVertexAttribFormat(
               i, vertexElement.getCount(), vertexElement.getType().glId(), false, vertexFormat.getElementOffset(vertexElement)
            );
         } else {
            ARBVertexAttribBinding.glVertexAttribIFormat(
               i, vertexElement.getCount(), vertexElement.getType().glId(), vertexFormat.getElementOffset(vertexElement)
            );
         }

         ARBVertexAttribBinding.glVertexAttribBinding(i, 0);
      }

      return new طؤ(vertBuffId, vertexFormat, new AtomicReference<>());
   }
}
