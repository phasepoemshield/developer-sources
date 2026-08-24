package kotakbaz.rain.client.render.main.vertex.format;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;
import kotakbaz.rain.client.render.main.vertex.element.VertexElement;
import lombok.Generated;
import oxxxde.دت;
import oxxxde.دن;
import oxxxde.طذ;

// $VF: Compiled from heavy
public class VertexFormat {
   private final int elementsMask;
   private final int[] elementOffsets;
   private final List<VertexElement> vertexElements;
   private final HashMap<String, VertexElement> vertexMap = new HashMap<>();
   private A vertexFormatBuffer;
   private final int vertexSize;
   private final HashMap<VertexElement, String> namesMap = new HashMap<>();

   @Generated
   public int getVertexSize() {
      return this.vertexSize;
   }

   public int getElementOffset(VertexElement vertexElement) {
      return this.elementOffsets[vertexElement.getId()];
   }

   public VertexElement getVertexElement(String name) {
      VertexElement vertexElement = this.vertexMap.get(name);
      if (vertexElement == null) {
         دن.printAndExit(new دت(name));
      }

      return vertexElement;
   }

   public Stream<VertexElement> getElementsFromMask(int mask) {
      return this.vertexElements.stream().filter(element -> element != null && (mask & element.mask()) != 0);
   }

   public static طذ builder() {
      return new طذ().element("Position", kotakbaz.rain.client.render.main.vertex.element.A.FLOAT, 3);
   }

   @Generated
   public int getElementsMask() {
      return this.elementsMask;
   }

   public VertexFormat(List<VertexElement> vertexElements, List<String> elementNames) {
      this.vertexFormatBuffer = null;
      this.vertexElements = vertexElements;
      this.elementOffsets = new int[this.vertexElements.size()];
      this.elementsMask = vertexElements.stream().mapToInt(VertexElement::mask).reduce(0, (a, b) -> a | b);
      int size = 0;
      int elementOffset = 0;

      for (int i = 0; i < vertexElements.size(); i++) {
         VertexElement vertexElement = vertexElements.get(i);
         size += vertexElement.getSize();
         if (i > 0) {
            this.elementOffsets[i] = elementOffset;
         } else {
            this.elementOffsets[i] = 0;
         }

         elementOffset += vertexElement.getSize();
         this.vertexMap.put(elementNames.get(i), vertexElement);
         this.namesMap.put(vertexElement, elementNames.get(i));
      }

      this.vertexSize = size;
   }

   @Generated
   public int[] getElementOffsets() {
      return this.elementOffsets;
   }

   public String getVertexElementName(VertexElement vertexElement) {
      return this.namesMap.get(vertexElement);
   }

   @Generated
   public List<VertexElement> getVertexElements() {
      return this.vertexElements;
   }

   public void setVertexFormatBuffer(A vertexFormatBuffer) {
      this.vertexFormatBuffer = vertexFormatBuffer;
   }

   public A getVertexFormatBuffer() {
      return this.vertexFormatBuffer;
   }
}
