package kotakbaz.rain.client.render.main.vertex.mesh;

import kotakbaz.rain.client.render.main.vertex.DrawMode;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import oxxxde.تظ;

// $VF: Compiled from IMesh.java
public interface IMesh extends AutoCloseable {
   DrawMode getDrawMode();

   int getIndexCount();

   VertexFormat getVertexFormat();

   int getVertexCount();

   @Override
   void close();

   تظ getIndexBuffer();

   تظ getVertexBuffer();
}
