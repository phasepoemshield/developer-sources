package oxxxde;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;
import lombok.Generated;

// $VF: Compiled from heavy
public class سا {
   private final int elementsMask;
   private final int[] elementOffsets;
   private final List<سئ> vertexElements;
   private final HashMap<String, سئ> vertexMap = new HashMap<>();
   private طؤ vertexFormatBuffer;
   private final int vertexSize;
   private final HashMap<سئ, String> namesMap = new HashMap<>();

   @Generated
   public int getVertexSize() {
      return this.vertexSize;
   }

   public int getElementOffset(سئ vertexElement) {
      return this.elementOffsets[vertexElement.getId()];
   }

   public سئ getVertexElement(String name) {
      سئ vertexElement = this.vertexMap.get(name);
      if (vertexElement == null) {
         دن.printAndExit(new دت(name));
      }

      return vertexElement;
   }

   public Stream<سئ> getElementsFromMask(int mask) {
      return this.vertexElements.stream().filter(element -> element != null && (mask & element.mask()) != 0);
   }

   public static طذ builder() {
      return new طذ().element("Position", حا.FLOAT, 3);
   }

   @Generated
   public int getElementsMask() {
      return this.elementsMask;
   }

   public سا(List<سئ> vertexElements, List<String> elementNames) {
      this.vertexFormatBuffer = null;
      this.vertexElements = vertexElements;
      this.elementOffsets = new int[this.vertexElements.size()];
      this.elementsMask = vertexElements.stream().mapToInt(سئ::mask).reduce(0, (a, b) -> a | b);
      int size = 0;
      int elementOffset = 0;

      for (int i = 0; i < vertexElements.size(); i++) {
         سئ vertexElement = vertexElements.get(i);
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

   public String getVertexElementName(سئ vertexElement) {
      return this.namesMap.get(vertexElement);
   }

   @Generated
   public List<سئ> getVertexElements() {
      return this.vertexElements;
   }

   public void setVertexFormatBuffer(طؤ vertexFormatBuffer) {
      this.vertexFormatBuffer = vertexFormatBuffer;
   }

   public طؤ getVertexFormatBuffer() {
      return this.vertexFormatBuffer;
   }
}
