package oxxxde;

import java.util.ArrayList;
import java.util.List;
import kotakbaz.rain.client.render.main.vertex.element.A;
import kotakbaz.rain.client.render.main.vertex.element.VertexElement;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;

// $VF: Compiled from heavy
public final class طذ {
   private final List<String> elementNames;
   private final List<VertexElement> vertexElements = new ArrayList<>();

   public طذ element(String name, A<?> count, int type) {
      int id = this.vertexElements.size();
      this.elementNames.add(name);
      this.vertexElements.add(new VertexElement(id, count, type));
      return this;
   }

   public VertexFormat build() {
      return new VertexFormat(this.vertexElements, this.elementNames);
   }

   public طذ() {
      this.elementNames = new ArrayList<>();
   }
}
