package oxxxde;

import org.joml.Vector2i;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class صإ extends زح<Vector2i> {
   public صإ(String glProgram, int location, خر name) {
      super(name, location, glProgram);
   }

   @Override
   public void upload() {
      GL20.glUniform2i(this.getLocation(), this.value.x, this.value.y);
   }
}
