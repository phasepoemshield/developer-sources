package oxxxde;

import org.joml.Vector4i;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class طَ extends زح<Vector4i> {
   public طَ(String glProgram, int location, خر name) {
      super(name, location, glProgram);
   }

   @Override
   public void upload() {
      GL20.glUniform4i(this.getLocation(), this.value.x, this.value.y, this.value.z, this.value.w);
   }
}
