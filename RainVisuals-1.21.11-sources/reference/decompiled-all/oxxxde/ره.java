package oxxxde;

import org.joml.Vector4f;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class ره extends زح<Vector4f> {
   @Override
   public void upload() {
      GL20.glUniform4f(this.getLocation(), this.value.x, this.value.y, this.value.z, this.value.w);
   }

   public ره(String location, int glProgram, خر name) {
      super(name, location, glProgram);
   }
}
