package oxxxde;

import kotakbaz.rain.client.render.main.vertex.element.A;
import kotakbaz.rain.client.render.main.vertex.mesh.IMesh;
import org.joml.Matrix4f;

// $VF: Compiled from IMeshBuilder.java
public interface جي<T, G extends IMesh> {
   T vertex(Matrix4f var1, float var2, float var3, float var4);

   G buildNullable();

   T vertex(float var1, float var2, float var3);

   G buildOrThrow();

   <S> T element(String var1, A<S> var2, S... var3);
}
