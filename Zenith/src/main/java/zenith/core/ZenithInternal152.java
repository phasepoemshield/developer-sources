package zenith;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.util.TriState;
import net.minecraft.client.render.RenderLayer.LootContextAware88;
import net.minecraft.client.render.VertexFormat.LootPool96;
import net.minecraft.client.render.RenderPhase.LootContextAware83;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class ZenithInternal152 {
   private static final Map<Identifier, RenderLayer> l11l111ll1IIIIl11Ill111IlI = new HashMap<>();

   public static RenderLayer EventBus(Identifier Identifier) {
      return l11l111ll1IIIIl11Ill111IlI.computeIfAbsent(
         Identifier,
         Identifier -> RenderLayer.of(
               "bbmodel",
               net.minecraft.client.render.VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL,
               LootPool96.TRIANGLES,
               1536,
               true,
               true,
               LootContextAware88.builder()
                  .program(RenderPhase.ENTITY_TRANSLUCENT_PROGRAM)
                  .texture(new LootContextAware83(Identifierx, TriState.FALSE, false))
                  .transparency(RenderPhase.TRANSLUCENT_TRANSPARENCY)
                  .cull(RenderPhase.DISABLE_CULLING)
                  .lightmap(RenderPhase.ENABLE_LIGHTMAP)
                  .overlay(RenderPhase.ENABLE_OVERLAY_COLOR)
                  .build(true)
            )
      );
   }

   public static void StringHolder_8(
      booleanHolder$Helper i1lii1l11iiili$ii1il11l111ii11iil, MatrixStack MatrixStack, VertexConsumer VertexConsumer, int i, int j
   ) {
      StringHolder_8(i1lii1l11iiili$ii1il11l111ii11iil, MatrixStack, VertexConsumer, i, j, -1);
   }

   public static void StringHolder_8(
      booleanHolder$Helper i1lii1l11iiili$ii1il11l111ii11iil, MatrixStack MatrixStack, VertexConsumer VertexConsumer, int i, int j, int k
   ) {
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      Matrix3f matrix3f = MatrixStack.peek().getNormalMatrix();
      if (k >= 0) {
         StringHolder_8(i1lii1l11iiili$ii1il11l111ii11iil, k, matrix4f, matrix3f, VertexConsumer, i, j);
      } else {
         for (int l : i1lii1l11iiili$ii1il11l111ii11iil.l1Il1I1II1IllIl1lIll1111l1lll()) {
            StringHolder_8(i1lii1l11iiili$ii1il11l111ii11iil, l, matrix4f, matrix3f, VertexConsumer, i, j);
         }
      }
   }

   private static void StringHolder_8(
      booleanHolder$Helper i1lii1l11iiili$ii1il11l111ii11iil, int i, Matrix4f matrix4f, Matrix3f matrix3f, VertexConsumer VertexConsumer, int j, int k
   ) {
      float[] afloat = i1lii1l11iiili$ii1il11l111ii11iil.EventImpl_2(i);
      int l = i1lii1l11iiili$ii1il11l111ii11iil.EventImpl_17(i);
      Vector3f vector3f = new Vector3f();

      for (int i1 = 0; i1 < l; i1++) {
         int j1 = i1 * 24;
         StringHolder_8(VertexConsumer, matrix4f, matrix3f, afloat, j1, j, k, vector3f);
         StringHolder_8(VertexConsumer, matrix4f, matrix3f, afloat, j1 + 8, j, k, vector3f);
         StringHolder_8(VertexConsumer, matrix4f, matrix3f, afloat, j1 + 16, j, k, vector3f);
      }
   }

   private static void StringHolder_8(VertexConsumer VertexConsumer, Matrix4f matrix4f, Matrix3f matrix3f, float[] afloat, int i, int j, int k, Vector3f vector3f) {
      vector3f.set(afloat[i + 5], afloat[i + 6], afloat[i + 7]);
      matrix3f.transform(vector3f);
      VertexConsumer.vertex(matrix4f, afloat[i], afloat[i + 1], afloat[i + 2])
         .color(255, 255, 255, 255)
         .texture(afloat[i + 3], afloat[i + 4])
         .overlay(k)
         .light(j)
         .normal(vector3f.x, vector3f.y, vector3f.z);
   }

   private ZenithInternal152() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
