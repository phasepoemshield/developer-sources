package oxxxde;

import kotakbaz.rain.client.render.main.vertex.element.A;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;

// $VF: Compiled from heavy
public final class شو {
   public static final VertexFormat POSITION = VertexFormat.builder().build();
   public static final VertexFormat POSITION_TEXTURE = VertexFormat.builder().element("Texture", A.FLOAT, 2).build();
   public static final VertexFormat POSITION_COLOR_TEXTURE = VertexFormat.builder().element("Color", A.FLOAT, 4).element("Texture", A.FLOAT, 2).build();
   public static final VertexFormat POSITION_COLOR = VertexFormat.builder().element("Color", A.FLOAT, 4).build();
   public static final VertexFormat POSITION_TEXTURE_COLOR = VertexFormat.builder().element("Texture", A.FLOAT, 2).element("Color", A.FLOAT, 4).build();
}
