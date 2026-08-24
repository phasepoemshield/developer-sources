package oxxxde;

import org.joml.Vector3i;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class صٍ extends زح<Vector3i> {
   public صٍ(String name, int glProgram, خر location) {
      super(name, location, glProgram);
   }

   @Override
   public void upload() {
      GL20.glUniform3i(this.getLocation(), this.value.x, this.value.y, this.value.z);
   }
}
