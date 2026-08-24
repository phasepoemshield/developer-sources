package oxxxde;

import kotakbaz.rain.client.render.main.program.GlProgram;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class ذء extends زح<Float> {
   private boolean hasPrimitiveValue;
   private float primitiveValue;

   public void set(Float value) {
      this.primitiveValue = value;
      this.hasPrimitiveValue = true;
      this.program.addUpdatedUniform(this);
   }

   public void set(float value) {
      this.primitiveValue = value;
      this.hasPrimitiveValue = true;
      this.program.addUpdatedUniform(this);
   }

   public ذء(String name, int glProgram, GlProgram location) {
      super(name, location, glProgram);
   }

   @Override
   public void upload() {
      GL20.glUniform1f(this.getLocation(), this.hasPrimitiveValue ? this.primitiveValue : this.value);
   }
}
