package zenith;

import zenith.hud.*;

import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType4;
import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType5;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.VertexFormat.LootPool96;
import org.joml.Matrix4f;

@ModuleInfo(
   name = "Arrows",
   description = "Arrows",
   category = Category.RENDER
)
public final class Arrows extends Module {
   private final Identifier l1IIlllI1lllI = ZenithClient.StringHolder_10("textures/arrows.png");
   private final GetStartTimeHandler IIl1IllI1I1Il1 = new GetStartTimeHandler(150L, 12.0F, IReturn.ListHolder_8);
   private final NumberSetting l11Illl1II = new NumberSetting(
      "module.arrows.radiusSetting", 50.0F, 30.0F, 100.0F, 10.0F, "module.arrows.radiusSetting.desc", "b"
   );
   private final NumberSetting IlIIl1llI1ll = new NumberSetting(
      "module.arrows.sizeSetting", 16.0F, 8.0F, 20.0F, 1.0F, "module.arrows.sizeSetting.desc", "px"
   );
   public static final Arrows lIlll11IlII11II = new Arrows();
   private final BooleanSetting Ill1ll1l11l111 = new BooleanSetting("module.arrows.ignoreGol", "module.arrows.ignoreGol.desc", true);

   private Arrows() {
   }

   @EventTarget
   public void EventBus(EventImpl_22 l11llilil1) {
   }

   @EventTarget
   public void onDraw(EventImpl_5 i1iilll1lili11lll11l11li1l) {
      MatrixStack MatrixStack = i1iilll1lili11lll11l11li1l.HitParticles().getMatrices();
      List list = Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.world)
         .getPlayers()
         .stream()
         .filter(
            AbstractClientPlayerEntity -> AbstractClientPlayerEntity != l11I1I1ll1Illll1I1l1111l1II.player
                  && !floatHolder_3.SecureRandomHolder_2(AbstractClientPlayerEntity.getId())
                  && (!this.Ill1ll1l11l111.Spider() || ZenithInternal066.byteHolder(AbstractClientPlayerEntity) != 0.0F)
         )
         .toList();
      float f = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() / 2.0F;
      float f1 = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight() / 2.0F;
      float f2 = f1
         - this.l11Illl1II.lll1lI1llll1IIllIIIII1lll()
         - this.IIl1IllI1I1Il1
            .StringHolder_8(
               l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof InventoryScreen
                  ? 80.0F
                  : (
                     l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof GenericContainerScreen
                        ? 100.0F
                        : (Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player).isSprinting() ? 12.0F : 0.0F)
                  )
            );
      float f3 = this.IlIIl1llI1ll.lll1lI1llll1IIllIIIII1lll();
      if (!l11I1I1ll1Illll1I1l1111l1II.options.hudHidden
         && l11I1I1ll1Illll1I1l1111l1II.options.getPerspective().equals(Perspective.FIRST_PERSON)
         && !list.isEmpty()) {
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.disableDepthTest();
         RenderSystem.blendFunc(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShaderTexture(0, this.l1IIlllI1lllI);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
         list.forEach(
            AbstractClientPlayerEntity -> {
               int i = II1l111II1Il11II111llllIl1.StringHolder_26().EventBus(AbstractClientPlayerEntity)
                  ? II1l111II1Il11II111llllIl1.floatHolder_3()
                     .getCurrentStyle()
                     .getFriendColor()
                     .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                     .lllIlll1Ill111l111Il11II11lII()
                  : ZenithClient.getInstance()
                     .floatHolder_3()
                     .getClientColor(90)
                     .lllIlll1Ill111l111Il11II11lII();
               float f8 = EventImpl_21((Entity)AbstractClientPlayerEntity) - Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player).getYaw();
               MatrixStack.push();
               MatrixStack.translate(f, f1, 0.0F);
               MatrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(f8));
               MatrixStack.translate(-f, -f1, 0.0F);
               Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
               if (II1l111II1Il11II111llllIl1.StringHolder_26().EventBus(AbstractClientPlayerEntity)) {
                  BufferBuilder.vertex(matrix4f, f - f3 / 2.0F, f2 + f3, 0.0F).texture(0.0F, 1.0F).color(i);
                  BufferBuilder.vertex(matrix4f, f + f3 / 2.0F, f2 + f3, 0.0F).texture(1.0F, 1.0F).color(i);
                  BufferBuilder.vertex(matrix4f, f + f3 / 2.0F, f2, 0.0F).texture(1.0F, 0.0F).color(i);
                  BufferBuilder.vertex(matrix4f, f - f3 / 2.0F, f2, 0.0F).texture(0.0F, 0.0F).color(i);
               } else {
                  ZenithInternal027 i1li1li11i11l1111 = II1l111II1Il11II111llllIl1.floatHolder_3().getClientColor();
                  BufferBuilder.vertex(matrix4f, f - f3 / 2.0F, f2 + f3, 0.0F)
                     .texture(0.0F, 1.0F)
                     .color(i1li1li11i11l1111.l1l11lIIIllIll1().lllIlll1Ill111l111Il11II11lII());
                  BufferBuilder.vertex(matrix4f, f + f3 / 2.0F, f2 + f3, 0.0F)
                     .texture(1.0F, 1.0F)
                     .color(i1li1li11i11l1111.ll1IIIIIIl11l().lllIlll1Ill111l111Il11II11lII());
                  BufferBuilder.vertex(matrix4f, f + f3 / 2.0F, f2, 0.0F)
                     .texture(1.0F, 0.0F)
                     .color(i1li1li11i11l1111.IIIlIllI1l1Il111IIII().lllIlll1Ill111l111Il11II11lII());
                  BufferBuilder.vertex(matrix4f, f - f3 / 2.0F, f2, 0.0F)
                     .texture(0.0F, 0.0F)
                     .color(i1li1li11i11l1111.IlIIII1l1IIIll11IIllI11ll().lllIlll1Ill111l111Il11II11lII());
               }

               MatrixStack.translate(f, f1, 0.0F);
               MatrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(-f8));
               MatrixStack.translate(-f, -f1, 0.0F);
               MatrixStack.pop();
            }
         );
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         RenderSystem.enableDepthTest();
         RenderSystem.enableCull();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableBlend();
      }
   }

   public static float EventImpl_21(Entity Entity) {
      double d0 = doubleHolder_3.byteHolder_2(Entity.prevX, Entity.getX())
         - doubleHolder_3.byteHolder_2(l11I1I1ll1Illll1I1l1111l1II.player.prevX, l11I1I1ll1Illll1I1l1111l1II.player.getX());
      double d1 = doubleHolder_3.byteHolder_2(Entity.prevZ, Entity.getZ())
         - doubleHolder_3.byteHolder_2(l11I1I1ll1Illll1I1l1111l1II.player.prevZ, l11I1I1ll1Illll1I1l1111l1II.player.getZ());
      return (float)(-(Math.atan2(d0, d1) * (180.0 / Math.PI)));
   }
}
