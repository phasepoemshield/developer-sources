package oxxxde;

import org.joml.Vector3f;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class اغ extends زح<Vector3f> {
   public اغ(String name, int location, خر glProgram) {
      super(name, location, glProgram);
   }

   @Override
   public void upload() {
      GL20.glUniform3f(this.getLocation(), this.value.x, this.value.y, this.value.z);
   }
}
