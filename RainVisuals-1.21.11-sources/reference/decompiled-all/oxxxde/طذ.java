package oxxxde;

import java.util.ArrayList;
import java.util.List;

// $VF: Compiled from heavy
public final class طذ {
   private final List<String> elementNames;
   private final List<سئ> vertexElements = new ArrayList<>();

   public طذ element(String name, حا<?> count, int type) {
      int id = this.vertexElements.size();
      this.elementNames.add(name);
      this.vertexElements.add(new سئ(id, count, type));
      return this;
   }

   public سا build() {
      return new سا(this.vertexElements, this.elementNames);
   }

   public طذ() {
      this.elementNames = new ArrayList<>();
   }
}
