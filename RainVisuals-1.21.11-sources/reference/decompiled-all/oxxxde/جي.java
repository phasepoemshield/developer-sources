package oxxxde;

import org.joml.Matrix4f;

// $VF: Compiled from IMeshBuilder.java
public interface جي<T, G extends طأ> {
   T vertex(Matrix4f var1, float var2, float var3, float var4);

   G buildNullable();

   T vertex(float var1, float var2, float var3);

   G buildOrThrow();

   <S> T element(String var1, حا<S> var2, S... var3);
}
