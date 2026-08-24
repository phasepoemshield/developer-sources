package oxxxde;

import org.joml.Vector2f;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class دط extends زح<Vector2f> {
   @Override
   public void upload() {
      GL20.glUniform2f(this.getLocation(), this.value.x, this.value.y);
   }

   public دط(String glProgram, int location, خر name) {
      super(name, location, glProgram);
   }
}
