package zenith;

import java.util.Objects;
import java.util.function.Function;
import net.minecraft.client.texture.Sprite;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.OrderedText;
import org.joml.Matrix4f;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.MsdfRenderer;
import zenith.zov.utility.mixin.accessors.DrawContextAccessor;

public class DrawContextImpl extends net.minecraft.client.gui.DrawContext implements ZenithInternal076 {
   private final BufferBuilderHolder_2 lIIll1IIl1IIII1111l11Illl1l1ll = new BufferBuilderHolder_2();
   private final BufferBuilderHolder I1111Il11l111lIIlII1lI1 = new BufferBuilderHolder();

   public DrawContextImpl(net.minecraft.client.gui.DrawContext DrawContext) {
      super(l11I1I1ll1Illll1I1l1111l1II, ((DrawContextAccessor)DrawContext).getVertexConsumers());
      this.matrices = DrawContext.matrices;
      this.scissorStack = DrawContext.scissorStack;
      this.vertexConsumers = DrawContext.vertexConsumers;
      this.guiAtlasManager = DrawContext.guiAtlasManager;
   }

   public static DrawContextImpl EventTarget(net.minecraft.client.gui.DrawContext DrawContext) {
      return new DrawContextImpl(DrawContext);
   }

   private boolean Event(Runnable runnable) {
      Matrix4f matrix4f = new Matrix4f(this.getMatrices().peek().getPositionMatrix());
      return ListHolder_4.EventImpl_21(() -> this.StringHolder_8(matrix4f, runnable));
   }

   private boolean EventImpl_24(Runnable runnable) {
      Matrix4f matrix4f = new Matrix4f(this.getMatrices().peek().getPositionMatrix());
      return ListHolder_4.EventImpl_13(() -> this.StringHolder_8(matrix4f, runnable));
   }

   private boolean ZenithInternal028(Runnable runnable) {
      if (!ListHolder_4.III1lI11Ill111lIl1l1IIlI()) {
         return false;
      } else {
         this.EventImpl_24(runnable);
         this.Event(runnable);
         return true;
      }
   }

   private void StringHolder_8(Matrix4f matrix4f, Runnable runnable) {
      MatrixStack MatrixStackx = this.matrices;
      MatrixStack MatrixStackx = new MatrixStack();
      MatrixStackx.peek().getPositionMatrix().set(matrix4f);
      this.matrices = MatrixStackx;

      try {
         runnable.run();
      } finally {
         this.matrices = MatrixStackx;
      }
   }

   private boolean StringHolder_8(int i, int j, int k, int l, int i1) {
      int j1 = Math.min(i, k);
      int k1 = Math.min(j, l);
      int l1 = Math.max(i, k);
      int i2 = Math.max(j, l);
      return ListHolder_4.StringHolder_8(
         this.getMatrices().peek().getPositionMatrix(), (float)j1, (float)k1, (float)(l1 - j1), (float)(i2 - k1), ByteBufferHolder.ZenithInternal090(i1)
      );
   }

   public void StringHolder_8(Font font, String s, float f, float f1, ByteBufferHolder il1iliilli1l1iill) {
      MsdfRenderer.renderText(
         font.getFont(), s, font.getSize(), il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII(), this.getMatrices().peek().getPositionMatrix(), f, f1, 0.0F
      );
   }

   public void ListHolder_6(float f, float f1, float f2, float f3) {
      this.StringHolder_8((int)Math.floor((double)f), (int)Math.floor((double)f1), (int)Math.ceil((double)f2), (int)Math.ceil((double)f3));
   }

   public void StringHolder_8(int i, int j, int k, int l) {
      if (!this.ZenithInternal028(() -> super.enableScissor(i, j, k, l))) {
         super.enableScissor(i, j, k, l);
      }
   }

   public void llIIll1II1l1IIll() {
      if (!this.ZenithInternal028(() -> super.disableScissor())) {
         super.disableScissor();
      }
   }

   public void StringHolder_8(Font font, String s, float f, float f1, ZenithInternal027 i1li1li11i11l1111) {
      MsdfRenderer.renderText(font.getFont(), s, font.getSize(), i1li1li11i11l1111, this.getMatrices().peek().getPositionMatrix(), f, f1, 0.0F);
   }

   public void StringHolder_8(Font font, Text Text, float f, float f1, int i) {
      MsdfRenderer.renderText(
         font.getFont(), Text, font.getSize(), this.getMatrices().peek().getPositionMatrix(), f, f1, 0.0F, false, 0.0F, 1.0F, 0.0F, i
      );
   }

   public void StringHolder_8(Font font, Text Text, float f, float f1) {
      MsdfRenderer.renderText(font.getFont(), Text, font.getSize(), this.getMatrices().peek().getPositionMatrix(), f, f1, 0.0F);
   }

   public void StringHolder_8(
      float f, float f1, float f2, float f3, float f4, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder il1iliilli1l1iill
   ) {
      floatHolder_8.EventBus(this.getMatrices(), this.vertexConsumers, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
   }

   public void StringHolder_8(
      float f, float f1, float f2, float f3, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder il1iliilli1l1iill
   ) {
      if (!ListHolder_4.EventTarget(
         this.getMatrices().peek().getPositionMatrix(), f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill
      )) {
         floatHolder_8.StringHolder_8(this.getMatrices(), this.vertexConsumers, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
      }
   }

   public void StringHolder_8(
      float f, float f1, float f2, float f3, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, ZenithInternal027 i1li1li11i11l1111
   ) {
      floatHolder_8.StringHolder_8(this.getMatrices(), this.vertexConsumers, f, f1, f2, f3, iil11iill1il1l1llilll1l1i1i1, i1li1li11i11l1111);
   }

   public void StringHolder_8(float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill) {
      floatHolder_8.StringHolder_8(this.getMatrices(), this.vertexConsumers, f, f1, f2, f3, il1iliilli1l1iill);
   }

   public void l1I1lI1111I1Il() {
      this.I1111Il11l111lIIlII1lI1.lIl1IlI111();
   }

   public void EventBus(float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill) {
      this.I1111Il11l111lIIlII1lI1.EventBus(this.getMatrices().peek().getPositionMatrix(), f, f1, f2, f3, il1iliilli1l1iill);
   }

   public void lIlI11IlI1I1I11II111() {
      this.I1111Il11l111lIIlII1lI1.flush();
   }

   public void StringHolder_8(floatHolder_5 iil11iill1il1l1llilll1l1i1i1) {
      this.lIIll1IIl1IIII1111l11Illl1l1ll.EventBus(iil11iill1il1l1llilll1l1i1i1);
   }

   public void EventBus(
      float f, float f1, float f2, float f3, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder il1iliilli1l1iill
   ) {
      this.lIIll1IIl1IIII1111l11Illl1l1ll.EventBus(iil11iill1il1l1llilll1l1i1i1);
      this.lIIll1IIl1IIII1111l11Illl1l1ll.EventBus(this.getMatrices().peek().getPositionMatrix(), f, f1, f2, f3, il1iliilli1l1iill);
   }

   public void I1lllI1IlllIl11Ill1lIl1() {
      this.lIIll1IIl1IIII1111l11Illl1l1ll.flush();
   }

   public boolean llIl1111llIl1llIIIIIll() {
      return this.lIIll1IIl1IIII1111l11Illl1l1ll.lIl1I1I111llll11();
   }

   public int StringHolder_8(
      net.minecraft.client.font.TextRenderer TextRenderer,
      Text Text,
      int i,
      int j,
      int k,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1
   ) {
      int l = i - 3;
      int i1 = j - 2;
      int j1 = k + 6;
      Objects.requireNonNull(TextRenderer);
      this.StringHolder_8((float)l, (float)i1, (float)j1, 13.0F, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill1);
      return this.StringHolder_8(TextRenderer, Text, i, j, il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII(), true);
   }

   public void StringHolder_8(
      IdentifierHolder_2 ll1111lliii1iiilll111ii1i11, float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill
   ) {
      floatHolder_8.StringHolder_8(this.getMatrices(), this.vertexConsumers, ll1111lliii1iiilll111ii1i11, f, f1, f2, f3, il1iliilli1l1iill);
   }

   public void StringHolder_8(
      float f, float f1, float f2, float f3, float f4, float f5, ByteBufferHolder il1iliilli1l1iill, floatHolder_5 iil11iill1il1l1llilll1l1i1i1
   ) {
      f2 = (float)Math.round(f2);
      f3 = (float)Math.round(f3);
      this.StringHolder_8((int)Math.ceil((double)(f - 10.0F)), (int)(f1 - 10.0F), (int)(f + f5), (int)(f1 + f5));
      this.EventBus(f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
      this.llIIll1II1l1IIll();
      this.StringHolder_8((int)(f + f2 - f5), (int)(f1 - 10.0F), (int)(f + f2 + 10.0F), (int)(f1 + f5));
      this.EventBus(f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
      this.llIIll1II1l1IIll();
      this.StringHolder_8((int)(f - 10.0F), (int)(f1 + f3 - f5), (int)(f + f5), (int)(f1 + f3 + 10.0F));
      this.EventBus(f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
      this.llIIll1II1l1IIll();
      this.StringHolder_8((int)(f + f2 - f5), (int)(f1 + f3 - f5), (int)(f + f2 + 10.0F), (int)(f1 + f3 + 10.0F));
      this.EventBus(f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
      this.llIIll1II1l1IIll();
   }

   public void StringHolder_8(
      float f, float f1, float f2, float f3, float f4, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, ZenithInternal027 i1li1li11i11l1111
   ) {
      floatHolder_8.StringHolder_8(this.getMatrices(), this.vertexConsumers, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, i1li1li11i11l1111);
   }

   public void EventBus(
      float f, float f1, float f2, float f3, float f4, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder il1iliilli1l1iill
   ) {
      floatHolder_8.StringHolder_8(this.getMatrices(), this.vertexConsumers, f, f1, f2, f3, f4, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
   }

   public void StringHolder_8(Identifier Identifier, float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill) {
      floatHolder_8.StringHolder_8(this.getMatrices(), this.vertexConsumers, Identifier, f, f1, f2, f3, il1iliilli1l1iill);
   }

   public void StringHolder_8(Function<Identifier, RenderLayer> function, Sprite Sprite, int i, int j, int k, int l) {
      if (!this.Event(() -> super.drawSpriteStretched(function, Sprite, i, j, k, l))) {
         super.drawSpriteStretched(function, Sprite, i, j, k, l);
      }
   }

   public void StringHolder_8(Function<Identifier, RenderLayer> function, Sprite Sprite, int i, int j, int k, int l, int i1) {
      if (!this.Event(() -> super.drawSpriteStretched(function, Sprite, i, j, k, l, i1))) {
         super.drawSpriteStretched(function, Sprite, i, j, k, l, i1);
      }
   }

   public void StringHolder_8(ItemStack ItemStack, int i, int j) {
      if (!this.Event(() -> super.drawItem(ItemStack, i, j))) {
         super.drawItem(ItemStack, i, j);
      }
   }

   public void StringHolder_8(ItemStack ItemStack, int i, int j, int k) {
      if (!this.Event(() -> super.drawItem(ItemStack, i, j, k))) {
         super.drawItem(ItemStack, i, j, k);
      }
   }

   public void StringHolder_8(ItemStack ItemStack, int i, int j, int k, int l) {
      if (!this.Event(() -> super.drawItem(ItemStack, i, j, k, l))) {
         super.drawItem(ItemStack, i, j, k, l);
      }
   }

   public void EventBus(ItemStack ItemStack, int i, int j) {
      if (!this.Event(() -> super.drawItemWithoutEntity(ItemStack, i, j))) {
         super.drawItemWithoutEntity(ItemStack, i, j);
      }
   }

   public void EventBus(ItemStack ItemStack, int i, int j, int k) {
      if (!this.Event(() -> super.drawItemWithoutEntity(ItemStack, i, j, k))) {
         super.drawItemWithoutEntity(ItemStack, i, j, k);
      }
   }

   public void StringHolder_8(LivingEntity LivingEntity, ItemStack ItemStack, int i, int j, int k) {
      if (!this.Event(() -> super.drawItem(LivingEntity, ItemStack, i, j, k))) {
         super.drawItem(LivingEntity, ItemStack, i, j, k);
      }
   }

   public void StringHolder_8(net.minecraft.client.font.TextRenderer TextRenderer, ItemStack ItemStack, int i, int j) {
      if (!this.Event(() -> super.drawStackOverlay(TextRenderer, ItemStack, i, j))) {
         super.drawStackOverlay(TextRenderer, ItemStack, i, j);
      }
   }

   public void StringHolder_8(net.minecraft.client.font.TextRenderer TextRenderer, ItemStack ItemStack, int i, int j, String s) {
      if (!this.Event(() -> super.drawStackOverlay(TextRenderer, ItemStack, i, j, s))) {
         super.drawStackOverlay(TextRenderer, ItemStack, i, j, s);
      }
   }

   public void l11l11II11I() {
      if (!this.Event(() -> super.draw())) {
         super.draw();
      }
   }

   public void EventBus(int i, int j, int k, int l, int i1) {
      if (!this.StringHolder_8(i, j, k, l, i1)) {
         super.fill(i, j, k, l, i1);
      }
   }

   public void StringHolder_8(int i, int j, int k, int l, int i1, int j1) {
      if (!this.StringHolder_8(i, j, k, l, j1)) {
         super.fill(i, j, k, l, i1, j1);
      }
   }

   public void StringHolder_8(RenderLayer RenderLayer, int i, int j, int k, int l, int i1) {
      if (!this.StringHolder_8(i, j, k, l, i1)) {
         super.fill(RenderLayer, i, j, k, l, i1);
      }
   }

   public void StringHolder_8(RenderLayer RenderLayer, int i, int j, int k, int l, int i1, int j1) {
      if (!this.StringHolder_8(i, j, k, l, j1)) {
         super.fill(RenderLayer, i, j, k, l, i1, j1);
      }
   }

   public void EventBus(int i, int j, int k, int l, int i1, int j1) {
      if (!this.Event(() -> super.fillGradient(i, j, k, l, i1, j1))) {
         super.fillGradient(i, j, k, l, i1, j1);
      }
   }

   public void StringHolder_8(int i, int j, int k, int l, int i1, int j1, int k1) {
      if (!this.Event(() -> super.fillGradient(i, j, k, l, i1, j1, k1))) {
         super.fillGradient(i, j, k, l, i1, j1, k1);
      }
   }

   public void StringHolder_8(RenderLayer RenderLayer, int i, int j, int k, int l, int i1, int j1, int k1) {
      if (!this.Event(() -> super.fillGradient(RenderLayer, i, j, k, l, i1, j1, k1))) {
         super.fillGradient(RenderLayer, i, j, k, l, i1, j1, k1);
      }
   }

   public int StringHolder_8(net.minecraft.client.font.TextRenderer TextRenderer, String s, int i, int j, int k) {
      if (this.Event(() -> super.drawTextWithShadow(TextRenderer, s, i, j, k))) {
         return s == null ? 0 : TextRenderer.getWidth(s);
      } else {
         return super.drawTextWithShadow(TextRenderer, s, i, j, k);
      }
   }

   public int StringHolder_8(net.minecraft.client.font.TextRenderer TextRenderer, String s, int i, int j, int k, boolean flag) {
      if (this.Event(() -> super.drawText(TextRenderer, s, i, j, k, flag))) {
         return s == null ? 0 : TextRenderer.getWidth(s);
      } else {
         return super.drawText(TextRenderer, s, i, j, k, flag);
      }
   }

   public int StringHolder_8(net.minecraft.client.font.TextRenderer TextRenderer, OrderedText OrderedText, int i, int j, int k) {
      return this.Event(() -> super.drawTextWithShadow(TextRenderer, OrderedText, i, j, k))
         ? TextRenderer.getWidth(OrderedText)
         : super.drawTextWithShadow(TextRenderer, OrderedText, i, j, k);
   }

   public int StringHolder_8(net.minecraft.client.font.TextRenderer TextRenderer, OrderedText OrderedText, int i, int j, int k, boolean flag) {
      return this.Event(() -> super.drawText(TextRenderer, OrderedText, i, j, k, flag))
         ? TextRenderer.getWidth(OrderedText)
         : super.drawText(TextRenderer, OrderedText, i, j, k, flag);
   }

   public int StringHolder_8(net.minecraft.client.font.TextRenderer TextRenderer, Text Text, int i, int j, int k) {
      return this.Event(() -> super.drawTextWithShadow(TextRenderer, Text, i, j, k))
         ? TextRenderer.getWidth(Text)
         : super.drawTextWithShadow(TextRenderer, Text, i, j, k);
   }

   public int StringHolder_8(net.minecraft.client.font.TextRenderer TextRenderer, Text Text, int i, int j, int k, boolean flag) {
      return this.Event(() -> super.drawText(TextRenderer, Text, i, j, k, flag))
         ? TextRenderer.getWidth(Text)
         : super.drawText(TextRenderer, Text, i, j, k, flag);
   }

   public void StringHolder_8(net.minecraft.client.font.TextRenderer TextRenderer, StringVisitable StringVisitable, int i, int j, int k, int l, boolean flag) {
      if (!this.Event(() -> super.drawWrappedText(TextRenderer, StringVisitable, i, j, k, l, flag))) {
         super.drawWrappedText(TextRenderer, StringVisitable, i, j, k, l, flag);
      }
   }

   public void StringHolder_8(Function<Identifier, RenderLayer> function, Identifier Identifier, int i, int j, int k, int l) {
      if (!this.Event(() -> super.drawGuiTexture(function, Identifier, i, j, k, l))) {
         super.drawGuiTexture(function, Identifier, i, j, k, l);
      }
   }

   public void StringHolder_8(Function<Identifier, RenderLayer> function, Identifier Identifier, int i, int j, int k, int l, int i1) {
      if (!this.Event(() -> super.drawGuiTexture(function, Identifier, i, j, k, l, i1))) {
         super.drawGuiTexture(function, Identifier, i, j, k, l, i1);
      }
   }

   public void StringHolder_8(Function<Identifier, RenderLayer> function, Identifier Identifier, int i, int j, int k, int l, int i1, int j1, int k1, int l1) {
      if (!this.Event(() -> super.drawGuiTexture(function, Identifier, i, j, k, l, i1, j1, k1, l1))) {
         super.drawGuiTexture(function, Identifier, i, j, k, l, i1, j1, k1, l1);
      }
   }

   public void StringHolder_8(
      Function<Identifier, RenderLayer> function, Identifier Identifier, int i, int j, float f, float f1, int k, int l, int i1, int j1, int k1
   ) {
      if (!this.Event(() -> super.drawTexture(function, Identifier, i, j, f, f1, k, l, i1, j1, k1))) {
         super.drawTexture(function, Identifier, i, j, f, f1, k, l, i1, j1, k1);
      }
   }

   public void StringHolder_8(
      Function<Identifier, RenderLayer> function, Identifier Identifier, int i, int j, float f, float f1, int k, int l, int i1, int j1
   ) {
      if (!this.Event(() -> super.drawTexture(function, Identifier, i, j, f, f1, k, l, i1, j1))) {
         super.drawTexture(function, Identifier, i, j, f, f1, k, l, i1, j1);
      }
   }

   public void StringHolder_8(
      Function<Identifier, RenderLayer> function, Identifier Identifier, int i, int j, float f, float f1, int k, int l, int i1, int j1, int k1, int l1
   ) {
      if (!this.Event(() -> super.drawTexture(function, Identifier, i, j, f, f1, k, l, i1, j1, k1, l1))) {
         super.drawTexture(function, Identifier, i, j, f, f1, k, l, i1, j1, k1, l1);
      }
   }

   public void StringHolder_8(
      Function<Identifier, RenderLayer> function, Identifier Identifier, int i, int j, float f, float f1, int k, int l, int i1, int j1, int k1, int l1, int i2
   ) {
      if (!this.Event(() -> super.drawTexture(function, Identifier, i, j, f, f1, k, l, i1, j1, k1, l1, i2))) {
         super.drawTexture(function, Identifier, i, j, f, f1, k, l, i1, j1, k1, l1, i2);
      }
   }

   public void lII1I1l1I11111l1llI1() {
      this.getMatrices().push();
   }

   public void IIlII1lII1() {
      this.getMatrices().pop();
   }
}
