package org.zenith.utility.render.display.base;

import org.zenith.core.ItemRegistry;
import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.event.EventRender2;
import org.zenith.module.Module;
import org.zenith.ZenithClient;

import org.zenith.module.Interface;

import org.zenith.util.ArgbColor;
import org.zenith.base.font.Font;
import org.zenith.utility.render.display.base.HudDrawContext;
import org.zenith.render.HudPreviewRenderQueue;
import org.zenith.module.Interface;
import org.zenith.util.Item;
import org.zenith.render.ShapeRenderer;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.HudPreviewItem;
import org.zenith.core.HudPreviewType;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;














import java.util.function.Function;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public final class HudQueuedContext extends HudDrawContext {
   public boolean replaying;
   public final MatrixStack replayMatrices = new MatrixStack();

   public HudQueuedContext(HudDrawContext var1) {
      super(var1, var1.getMouseX(), var1.getMouseY(), var1.getDelta());
   }

   public static HudQueuedContext of(HudDrawContext var0) {
      return var0 instanceof HudQueuedContext ? (HudQueuedContext)var0 : new HudQueuedContext(var0);
   }

   public HudPreviewItem queueCommand(HudPreviewType var1) {
      HudPreviewItem i11liiii1i11l11l11il = HudPreviewRenderQueue.on23(this);
      i11liiii1i11l11l11il.var13Var159 = var1;
      i11liiii1i11l11l11il.matrix4f11.set(this.getMatrices().peek().getPositionMatrix());
      return i11liiii1i11l11l11il;
   }

   public void replayCommand(HudPreviewItem var1) {
      MatrixStack matrixstack = this.matrices;
      boolean flag = this.replaying;
      MatrixStack matrixstack1 = this.replayMatrices;

      while (!matrixstack1.isEmpty()) {
         matrixstack1.pop();
      }

      matrixstack1.loadIdentity();
      matrixstack1.peek().getPositionMatrix().set(var1.matrix4f11);
      this.matrices = matrixstack1;
      this.replaying = true;

      try {
         this.dispatch(var1);
      } finally {
         this.replaying = flag;
         this.matrices = matrixstack;
      }
   }

   public void dispatch(HudPreviewItem var1) {
      switch (var1.var13Var159) {
         case val246:
            super.drawText(
               (Font)var1.object5,
               (String)var1.object6,
               var1.float226,
               var1.float227,
               (ArgbColor)var1.object7
            );
            break;
         case val247:
            super.drawText(
               (Font)var1.object5,
               (String)var1.object6,
               var1.float226,
               var1.float227,
               (ArgbColor)var1.object7,
               var1.boolean155,
               var1.float228,
               var1.float229,
               var1.float230
            );
            break;
         case val248:
            super.drawText(
               (Font)var1.object5,
               (String)var1.object6,
               var1.float226,
               var1.float227,
               var1.int350,
               var1.boolean155,
               var1.float228,
               var1.float229,
               var1.float230
            );
            break;
         case val249:
            super.drawText(
               (Font)var1.object5,
               (String)var1.object6,
               var1.float226,
               var1.float227,
               (GradientRadius)var1.object7
            );
            break;
         case val250:
            super.drawText(
               (Font)var1.object5, (Text)var1.object6, var1.float226, var1.float227, var1.int350
            );
            break;
         case val251:
            super.drawText((Font)var1.object5, (Text)var1.object6, var1.float226, var1.float227);
            break;
         case val252:
            super.drawTextWithShadow(
               (TextRenderer)var1.object5,
               (String)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352
            );
            break;
         case val253:
            super.drawText(
               (TextRenderer)var1.object5,
               (String)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352,
               var1.boolean155
            );
            break;
         case val254:
            super.drawTextWithShadow(
               (TextRenderer)var1.object5,
               (OrderedText)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352
            );
            break;
         case val255:
            super.drawText(
               (TextRenderer)var1.object5,
               (OrderedText)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352,
               var1.boolean155
            );
            break;
         case val256:
            super.drawTextWithShadow(
               (TextRenderer)var1.object5,
               (Text)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352
            );
            break;
         case val257:
            super.drawText(
               (TextRenderer)var1.object5,
               (Text)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352,
               var1.boolean155
            );
            break;
         case val258:
            super.drawWrappedText(
               (TextRenderer)var1.object5,
               (StringVisitable)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352,
               var1.int353,
               var1.boolean155
            );
            break;
         case val259:
            super.drawStackOverlay(
               (TextRenderer)var1.object5, (ItemStack)var1.object6, var1.int350, var1.int351
            );
            break;
         case val260:
            super.drawStackOverlay(
               (TextRenderer)var1.object5,
               (ItemStack)var1.object6,
               var1.int350,
               var1.int351,
               (String)var1.object7
            );
            break;
         case val261:
            super.drawSprite(
               (GuiSprite)var1.object5,
               var1.float226,
               var1.float227,
               var1.float228,
               var1.float229,
               (ArgbColor)var1.object6
            );
            break;
         case val262:
            super.drawRoundedRect(
               var1.float226,
               var1.float227,
               var1.float228,
               var1.float229,
               (CornerRadius)var1.object5,
               (GradientRadius)var1.object6
            );
            break;
         case val263:
            super.drawSquircle(
               var1.float226,
               var1.float227,
               var1.float228,
               var1.float229,
               var1.float230,
               (CornerRadius)var1.object5,
               (ArgbColor)var1.object6
            );
            break;
         case val264:
            super.drawRoundedBorder(
               var1.float226,
               var1.float227,
               var1.float228,
               var1.float229,
               var1.float230,
               (CornerRadius)var1.object5,
               (GradientRadius)var1.object6
            );
            break;
         case val265:
            super.drawRoundedBorder(
               var1.float226,
               var1.float227,
               var1.float228,
               var1.float229,
               var1.float230,
               (CornerRadius)var1.object5,
               (ArgbColor)var1.object6
            );
            break;
         case val266:
            super.drawTexture(
               (Identifier)var1.object5,
               var1.float226,
               var1.float227,
               var1.float228,
               var1.float229,
               (ArgbColor)var1.object6
            );
            break;
         case val267:
            super.drawArcBorder(
               var1.float226,
               var1.float227,
               var1.float228,
               var1.float229,
               var1.float230,
               var1.float231,
               var1.float232,
               (ArgbColor)var1.object5
            );
            break;
         case val268:
            super.drawRoundedTexture(
               (Identifier)var1.object5,
               var1.float226,
               var1.float227,
               var1.float228,
               var1.float229,
               (CornerRadius)var1.object6
            );
            break;
         case val269:
            super.drawRoundedTexture(
               (Identifier)var1.object5,
               var1.float226,
               var1.float227,
               var1.float228,
               var1.float229,
               (CornerRadius)var1.object6,
               (ArgbColor)var1.object7
            );
            break;
         case val270:
            super.drawPlayerHeadWithRoundedShader(
               (Identifier)var1.object5,
               var1.float226,
               var1.float227,
               var1.float228,
               (CornerRadius)var1.object6,
               (ArgbColor)var1.object7
            );
            break;
         case val271:
            super.draw();
            break;
         case val272:
            super.fillGradient(
               var1.int350, var1.int351, var1.int352, var1.int353, var1.int354, var1.int355
            );
            break;
         case val273:
            super.fillGradient(
               var1.int350,
               var1.int351,
               var1.int352,
               var1.int353,
               var1.int354,
               var1.int355,
               var1.int356
            );
            break;
         case val274:
            super.fillGradient(
               (RenderLayer)var1.object5,
               var1.int350,
               var1.int351,
               var1.int352,
               var1.int353,
               var1.int354,
               var1.int355,
               var1.int356
            );
            break;
         case val275:
            super.drawSpriteStretched(
               (Function<Identifier, RenderLayer>)var1.object5,
               (Sprite)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352,
               var1.int353
            );
            break;
         case val276:
            super.drawSpriteStretched(
               (Function<Identifier, RenderLayer>)var1.object5,
               (Sprite)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352,
               var1.int353,
               var1.int354
            );
            break;
         case val277:
            super.drawGuiTexture(
               (Function<Identifier, RenderLayer>)var1.object5,
               (Identifier)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352,
               var1.int353
            );
            break;
         case val278:
            super.drawGuiTexture(
               (Function<Identifier, RenderLayer>)var1.object5,
               (Identifier)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352,
               var1.int353,
               var1.int354
            );
            break;
         case val279:
            super.drawGuiTexture(
               (Function<Identifier, RenderLayer>)var1.object5,
               (Identifier)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352,
               var1.int353,
               var1.int354,
               var1.int355,
               var1.int356,
               var1.int357
            );
            break;
         case val280:
            super.drawTexture(
               (Function<Identifier, RenderLayer>)var1.object5,
               (Identifier)var1.object6,
               var1.int350,
               var1.int351,
               var1.float226,
               var1.float227,
               var1.int352,
               var1.int353,
               var1.int354,
               var1.int355
            );
            break;
         case val281:
            super.drawTexture(
               (Function<Identifier, RenderLayer>)var1.object5,
               (Identifier)var1.object6,
               var1.int350,
               var1.int351,
               var1.float226,
               var1.float227,
               var1.int352,
               var1.int353,
               var1.int354,
               var1.int355,
               var1.int356
            );
            break;
         case val282:
            super.drawTexture(
               (Function<Identifier, RenderLayer>)var1.object5,
               (Identifier)var1.object6,
               var1.int350,
               var1.int351,
               var1.float226,
               var1.float227,
               var1.int352,
               var1.int353,
               var1.int354,
               var1.int355,
               var1.int356,
               var1.int357
            );
            break;
         case val283:
            super.drawTexture(
               (Function<Identifier, RenderLayer>)var1.object5,
               (Identifier)var1.object6,
               var1.int350,
               var1.int351,
               var1.float226,
               var1.float227,
               var1.int352,
               var1.int353,
               var1.int354,
               var1.int355,
               var1.int356,
               var1.int357,
               var1.int358
            );
            break;
         case val284:
            super.drawItem((ItemStack)var1.object5, var1.int350, var1.int351);
            break;
         case val285:
            super.drawItemBar((ItemStack)var1.object5, var1.int350, var1.int351);
            break;
         case val286:
            super.drawCooldownProgress((ItemStack)var1.object5, var1.int350, var1.int351);
            break;
         case val287:
            super.drawItem((ItemStack)var1.object5, var1.int350, var1.int351, var1.int352);
            break;
         case val288:
            super.drawItem(
               (ItemStack)var1.object5,
               var1.int350,
               var1.int351,
               var1.int352,
               var1.int353
            );
            break;
         case val289:
            super.drawItemWithoutEntity((ItemStack)var1.object5, var1.int350, var1.int351);
            break;
         case val290:
            super.drawItemWithoutEntity(
               (ItemStack)var1.object5, var1.int350, var1.int351, var1.int352
            );
            break;
         case val291:
            super.drawItem(
               (LivingEntity)var1.object5,
               (ItemStack)var1.object6,
               var1.int350,
               var1.int351,
               var1.int352
            );
            break;
         case val244:
            super.enableScissor(var1.int350, var1.int351, var1.int352, var1.int353);
            break;
         case val245:
            super.disableScissor();
      }
   }

   @Override
   public void drawText(Font var1, String var2, float var3, float var4, ArgbColor var5) {
      if (this.replaying) {
         super.drawText(var1, var2, var3, var4, var5);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val246);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.object6 = var2;
         i11liiii1i11l11l11il.object7 = var5;
         i11liiii1i11l11l11il.float226 = var3;
         i11liiii1i11l11l11il.float227 = var4;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawText(Font var1, String var2, float var3, float var4, ArgbColor var5, boolean var6, float var7, float var8, float var9) {
      if (this.replaying) {
         super.drawText(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val247);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.object6 = var2;
         i11liiii1i11l11l11il.object7 = var5;
         i11liiii1i11l11l11il.float226 = var3;
         i11liiii1i11l11l11il.float227 = var4;
         i11liiii1i11l11l11il.boolean155 = var6;
         i11liiii1i11l11l11il.float228 = var7;
         i11liiii1i11l11l11il.float229 = var8;
         i11liiii1i11l11l11il.float230 = var9;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawText(Font var1, String var2, float var3, float var4, int var5, boolean var6, float var7, float var8, float var9) {
      if (this.replaying) {
         super.drawText(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val248);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.object6 = var2;
         i11liiii1i11l11l11il.float226 = var3;
         i11liiii1i11l11l11il.float227 = var4;
         i11liiii1i11l11l11il.int350 = var5;
         i11liiii1i11l11l11il.boolean155 = var6;
         i11liiii1i11l11l11il.float228 = var7;
         i11liiii1i11l11l11il.float229 = var8;
         i11liiii1i11l11l11il.float230 = var9;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawText(Font var1, String var2, float var3, float var4, GradientRadius var5) {
      if (this.replaying) {
         super.drawText(var1, var2, var3, var4, var5);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val249);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.object6 = var2;
         i11liiii1i11l11l11il.object7 = var5;
         i11liiii1i11l11l11il.float226 = var3;
         i11liiii1i11l11l11il.float227 = var4;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawText(Font var1, Text var2, float var3, float var4, int var5) {
      if (this.replaying) {
         super.drawText(var1, var2, var3, var4, var5);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val250);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.object6 = var2;
         i11liiii1i11l11l11il.float226 = var3;
         i11liiii1i11l11l11il.float227 = var4;
         i11liiii1i11l11l11il.int350 = var5;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawText(Font var1, Text var2, float var3, float var4) {
      if (this.replaying) {
         super.drawText(var1, var2, var3, var4);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val251);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.object6 = var2;
         i11liiii1i11l11l11il.float226 = var3;
         i11liiii1i11l11l11il.float227 = var4;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void enableScissor(int x1, int y1, int x2, int y2) {
      if (this.replaying) {
         super.enableScissor(x1, y1, x2, y2);
      } else {
         HudPreviewRenderQueue.on23(this, this.getMatrices().peek().getPositionMatrix(), x1, y1, x2, y2);
      }
   }

   @Override
   public void disableScissor() {
      if (this.replaying) {
         super.disableScissor();
      } else {
         HudPreviewRenderQueue.float267();
      }
   }

   @Override
   public void drawRoundedRect(float var1, float var2, float var3, float var4, CornerRadius var5, ArgbColor var6) {
      if (this.replaying) {
         super.drawRoundedRect(var1, var2, var3, var4, var5, var6);
      } else {
         HudPreviewRenderQueue.ItemRegistry(this.getMatrices().peek().getPositionMatrix(), var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void drawRoundedRect(float var1, float var2, float var3, float var4, CornerRadius var5, GradientRadius var6) {
      if (this.replaying) {
         super.drawRoundedRect(var1, var2, var3, var4, var5, var6);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val262);
         i11liiii1i11l11l11il.float226 = var1;
         i11liiii1i11l11l11il.float227 = var2;
         i11liiii1i11l11l11il.float228 = var3;
         i11liiii1i11l11l11il.float229 = var4;
         i11liiii1i11l11l11il.object5 = var5;
         i11liiii1i11l11l11il.object6 = var6;
         HudPreviewRenderQueue.on23(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawRect(float var1, float var2, float var3, float var4, ArgbColor var5) {
      if (this.replaying) {
         super.drawRect(var1, var2, var3, var4, var5);
      } else {
         HudPreviewRenderQueue.UiAnimation(this.getMatrices().peek().getPositionMatrix(), var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void drawSquircle(float var1, float var2, float var3, float var4, float var5, CornerRadius var6, ArgbColor var7) {
      if (this.replaying) {
         super.drawSquircle(var1, var2, var3, var4, var5, var6, var7);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val263);
         i11liiii1i11l11l11il.float226 = var1;
         i11liiii1i11l11l11il.float227 = var2;
         i11liiii1i11l11l11il.float228 = var3;
         i11liiii1i11l11l11il.float229 = var4;
         i11liiii1i11l11l11il.float230 = var5;
         i11liiii1i11l11l11il.object5 = var6;
         i11liiii1i11l11l11il.object6 = var7;
         HudPreviewRenderQueue.on23(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawSprite(GuiSprite var1, float var2, float var3, float var4, float var5, ArgbColor var6) {
      if (this.replaying) {
         super.drawSprite(var1, var2, var3, var4, var5, var6);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val261);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.object6 = var6;
         i11liiii1i11l11l11il.float226 = var2;
         i11liiii1i11l11l11il.float227 = var3;
         i11liiii1i11l11l11il.float228 = var4;
         i11liiii1i11l11l11il.float229 = var5;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawRoundedBorder(float var1, float var2, float var3, float var4, float var5, CornerRadius var6, GradientRadius var7) {
      if (this.replaying) {
         super.drawRoundedBorder(var1, var2, var3, var4, var5, var6, var7);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val264);
         i11liiii1i11l11l11il.float226 = var1;
         i11liiii1i11l11l11il.float227 = var2;
         i11liiii1i11l11l11il.float228 = var3;
         i11liiii1i11l11l11il.float229 = var4;
         i11liiii1i11l11l11il.float230 = var5;
         i11liiii1i11l11l11il.object5 = var6;
         i11liiii1i11l11l11il.object6 = var7;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawRoundedBorder(float var1, float var2, float var3, float var4, float var5, CornerRadius var6, ArgbColor var7) {
      if (this.replaying) {
         super.drawRoundedBorder(var1, var2, var3, var4, var5, var6, var7);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val265);
         i11liiii1i11l11l11il.float226 = var1;
         i11liiii1i11l11l11il.float227 = var2;
         i11liiii1i11l11l11il.float228 = var3;
         i11liiii1i11l11l11il.float229 = var4;
         i11liiii1i11l11l11il.float230 = var5;
         i11liiii1i11l11l11il.object5 = var6;
         i11liiii1i11l11l11il.object6 = var7;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawTexture(Identifier var1, float var2, float var3, float var4, float var5, ArgbColor var6) {
      if (this.replaying) {
         super.drawTexture(var1, var2, var3, var4, var5, var6);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val266);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.object6 = var6;
         i11liiii1i11l11l11il.float226 = var2;
         i11liiii1i11l11l11il.float227 = var3;
         i11liiii1i11l11l11il.float228 = var4;
         i11liiii1i11l11l11il.float229 = var5;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawBlurHud(float var1, float var2, float var3, float var4, float var5, CornerRadius var6, ArgbColor var7) {
      this.drawBlurHudBooleanCheck(
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         (Interface.interfaceField.string88() || Interface.interfaceField.float30())
            && ShapeRenderer.boolean184,
         Interface.interfaceField.string129()
      );
   }

   @Override
   public void drawBlurHudBooleanCheck(
      float var1, float var2, float var3, float var4, float var5, CornerRadius var6, ArgbColor var7, boolean var8, boolean var9
   ) {
      if (this.replaying) {
         super.drawBlurHudBooleanCheck(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      } else {
         HudPreviewRenderQueue.on23(this.getMatrices().peek().getPositionMatrix(), var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   @Override
   public void drawArcBorder(float var1, float var2, float var3, float var4, float var5, float var6, float var7, ArgbColor var8) {
      if (this.replaying) {
         super.drawArcBorder(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val267);
         i11liiii1i11l11l11il.float226 = var1;
         i11liiii1i11l11l11il.float227 = var2;
         i11liiii1i11l11l11il.float228 = var3;
         i11liiii1i11l11l11il.float229 = var4;
         i11liiii1i11l11l11il.float230 = var5;
         i11liiii1i11l11l11il.float231 = var6;
         i11liiii1i11l11l11il.float232 = var7;
         i11liiii1i11l11l11il.object5 = var8;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawRoundedTexture(Identifier var1, float var2, float var3, float var4, float var5, CornerRadius var6) {
      if (this.replaying) {
         super.drawRoundedTexture(var1, var2, var3, var4, var5, var6);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val268);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.object6 = var6;
         i11liiii1i11l11l11il.float226 = var2;
         i11liiii1i11l11l11il.float227 = var3;
         i11liiii1i11l11l11il.float228 = var4;
         i11liiii1i11l11l11il.float229 = var5;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawRoundedTexture(Identifier var1, float var2, float var3, float var4, float var5, CornerRadius var6, ArgbColor var7) {
      if (this.replaying) {
         super.drawRoundedTexture(var1, var2, var3, var4, var5, var6, var7);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val269);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.object6 = var6;
         i11liiii1i11l11l11il.object7 = var7;
         i11liiii1i11l11l11il.float226 = var2;
         i11liiii1i11l11l11il.float227 = var3;
         i11liiii1i11l11l11il.float228 = var4;
         i11liiii1i11l11l11il.float229 = var5;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawPlayerHeadWithRoundedShader(Identifier var1, float var2, float var3, float var4, CornerRadius var5, ArgbColor var6) {
      if (this.replaying) {
         super.drawPlayerHeadWithRoundedShader(var1, var2, var3, var4, var5, var6);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val270);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.object6 = var5;
         i11liiii1i11l11l11il.object7 = var6;
         i11liiii1i11l11l11il.float226 = var2;
         i11liiii1i11l11l11il.float227 = var3;
         i11liiii1i11l11l11il.float228 = var4;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawItem(ItemStack item, int x, int y) {
      if (this.replaying) {
         super.drawItem(item, x, y);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val284);
         i11liiii1i11l11l11il.object5 = item;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         HudPreviewRenderQueue.Easing(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawItemBar(ItemStack var1, int var2, int var3) {
      if (this.replaying) {
         super.drawItemBar(var1, var2, var3);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val285);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.int350 = var2;
         i11liiii1i11l11l11il.int351 = var3;
         HudPreviewRenderQueue.Easing(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawCooldownProgress(ItemStack var1, int var2, int var3) {
      if (this.replaying) {
         super.drawCooldownProgress(var1, var2, var3);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val286);
         i11liiii1i11l11l11il.object5 = var1;
         i11liiii1i11l11l11il.int350 = var2;
         i11liiii1i11l11l11il.int351 = var3;
         HudPreviewRenderQueue.Easing(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawItem(ItemStack stack, int x, int y, int seed) {
      if (this.replaying) {
         super.drawItem(stack, x, y, seed);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val287);
         i11liiii1i11l11l11il.object5 = stack;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = seed;
         HudPreviewRenderQueue.Easing(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawItem(ItemStack stack, int x, int y, int seed, int z) {
      if (this.replaying) {
         super.drawItem(stack, x, y, seed, z);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val288);
         i11liiii1i11l11l11il.object5 = stack;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = seed;
         i11liiii1i11l11l11il.int353 = z;
         HudPreviewRenderQueue.Easing(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawItemWithoutEntity(ItemStack stack, int x, int y) {
      if (this.replaying) {
         super.drawItemWithoutEntity(stack, x, y);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val289);
         i11liiii1i11l11l11il.object5 = stack;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         HudPreviewRenderQueue.Easing(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawItemWithoutEntity(ItemStack stack, int x, int y, int seed) {
      if (this.replaying) {
         super.drawItemWithoutEntity(stack, x, y, seed);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val290);
         i11liiii1i11l11l11il.object5 = stack;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = seed;
         HudPreviewRenderQueue.Easing(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawItem(LivingEntity entity, ItemStack stack, int x, int y, int seed) {
      if (this.replaying) {
         super.drawItem(entity, stack, x, y, seed);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val291);
         i11liiii1i11l11l11il.object5 = entity;
         i11liiii1i11l11l11il.object6 = stack;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = seed;
         HudPreviewRenderQueue.Easing(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawStackOverlay(TextRenderer textRenderer, ItemStack stack, int x, int y) {
      if (this.replaying) {
         super.drawStackOverlay(textRenderer, stack, x, y);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val259);
         i11liiii1i11l11l11il.object5 = textRenderer;
         i11liiii1i11l11l11il.object6 = stack;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawStackOverlay(TextRenderer textRenderer, ItemStack stack, int x, int y, String stackCountText) {
      if (this.replaying) {
         super.drawStackOverlay(textRenderer, stack, x, y, stackCountText);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val260);
         i11liiii1i11l11l11il.object5 = textRenderer;
         i11liiii1i11l11l11il.object6 = stack;
         i11liiii1i11l11l11il.object7 = stackCountText;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void draw() {
      if (this.replaying) {
         super.draw();
      } else {
         HudPreviewRenderQueue.UiAnimation(this.queueCommand(HudPreviewType.val271));
      }
   }

   @Override
   public void fill(int x1, int y1, int x2, int y2, int color) {
      if (this.replaying) {
         super.fill(x1, y1, x2, y2, color);
      } else {
         this.queueRect(x1, y1, x2, y2, color);
      }
   }

   @Override
   public void fill(int x1, int y1, int x2, int y2, int z, int color) {
      if (this.replaying) {
         super.fill(x1, y1, x2, y2, z, color);
      } else {
         this.queueRect(x1, y1, x2, y2, color);
      }
   }

   @Override
   public void fill(RenderLayer layer, int x1, int y1, int x2, int y2, int color) {
      if (this.replaying) {
         super.fill(layer, x1, y1, x2, y2, color);
      } else {
         this.queueRect(x1, y1, x2, y2, color);
      }
   }

   @Override
   public void fill(RenderLayer layer, int x1, int y1, int x2, int y2, int z, int color) {
      if (this.replaying) {
         super.fill(layer, x1, y1, x2, y2, z, color);
      } else {
         this.queueRect(x1, y1, x2, y2, color);
      }
   }

   public void queueRect(int var1, int var2, int var3, int var4, int var5) {
      int i = Math.min(var1, var3);
      int j = Math.min(var2, var4);
      int k = Math.max(var1, var3);
      int l = Math.max(var2, var4);
      HudPreviewRenderQueue.UiAnimation(
         this.getMatrices().peek().getPositionMatrix(), (float)i, (float)j, (float)(k - i), (float)(l - j), ArgbColor.EventRender2(var5)
      );
   }

   @Override
   public void fillGradient(int startX, int startY, int endX, int endY, int colorStart, int colorEnd) {
      if (this.replaying) {
         super.fillGradient(startX, startY, endX, endY, colorStart, colorEnd);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val272);
         i11liiii1i11l11l11il.int350 = startX;
         i11liiii1i11l11l11il.int351 = startY;
         i11liiii1i11l11l11il.int352 = endX;
         i11liiii1i11l11l11il.int353 = endY;
         i11liiii1i11l11l11il.int354 = colorStart;
         i11liiii1i11l11l11il.int355 = colorEnd;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void fillGradient(int startX, int startY, int endX, int endY, int z, int colorStart, int colorEnd) {
      if (this.replaying) {
         super.fillGradient(startX, startY, endX, endY, z, colorStart, colorEnd);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val273);
         i11liiii1i11l11l11il.int350 = startX;
         i11liiii1i11l11l11il.int351 = startY;
         i11liiii1i11l11l11il.int352 = endX;
         i11liiii1i11l11l11il.int353 = endY;
         i11liiii1i11l11l11il.int354 = z;
         i11liiii1i11l11l11il.int355 = colorStart;
         i11liiii1i11l11l11il.int356 = colorEnd;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void fillGradient(RenderLayer layer, int startX, int startY, int endX, int endY, int colorStart, int colorEnd, int z) {
      if (this.replaying) {
         super.fillGradient(layer, startX, startY, endX, endY, colorStart, colorEnd, z);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val274);
         i11liiii1i11l11l11il.object5 = layer;
         i11liiii1i11l11l11il.int350 = startX;
         i11liiii1i11l11l11il.int351 = startY;
         i11liiii1i11l11l11il.int352 = endX;
         i11liiii1i11l11l11il.int353 = endY;
         i11liiii1i11l11l11il.int354 = colorStart;
         i11liiii1i11l11l11il.int355 = colorEnd;
         i11liiii1i11l11l11il.int356 = z;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public int drawTextWithShadow(TextRenderer textRenderer, String text, int x, int y, int color) {
      if (this.replaying) {
         return super.drawTextWithShadow(textRenderer, text, x, y, color);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val252);
         i11liiii1i11l11l11il.object5 = textRenderer;
         i11liiii1i11l11l11il.object6 = text;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = color;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
         return text == null ? 0 : textRenderer.getWidth(text);
      }
   }

   @Override
   public int drawText(TextRenderer textRenderer, String text, int x, int y, int color, boolean shadow) {
      if (this.replaying) {
         return super.drawText(textRenderer, text, x, y, color, shadow);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val253);
         i11liiii1i11l11l11il.object5 = textRenderer;
         i11liiii1i11l11l11il.object6 = text;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = color;
         i11liiii1i11l11l11il.boolean155 = shadow;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
         return text == null ? 0 : textRenderer.getWidth(text);
      }
   }

   @Override
   public int drawTextWithShadow(TextRenderer textRenderer, OrderedText text, int x, int y, int color) {
      if (this.replaying) {
         return super.drawTextWithShadow(textRenderer, text, x, y, color);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val254);
         i11liiii1i11l11l11il.object5 = textRenderer;
         i11liiii1i11l11l11il.object6 = text;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = color;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
         return textRenderer.getWidth(text);
      }
   }

   @Override
   public int drawText(TextRenderer textRenderer, OrderedText text, int x, int y, int color, boolean shadow) {
      if (this.replaying) {
         return super.drawText(textRenderer, text, x, y, color, shadow);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val255);
         i11liiii1i11l11l11il.object5 = textRenderer;
         i11liiii1i11l11l11il.object6 = text;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = color;
         i11liiii1i11l11l11il.boolean155 = shadow;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
         return textRenderer.getWidth(text);
      }
   }

   @Override
   public int drawTextWithShadow(TextRenderer textRenderer, Text text, int x, int y, int color) {
      if (this.replaying) {
         return super.drawTextWithShadow(textRenderer, text, x, y, color);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val256);
         i11liiii1i11l11l11il.object5 = textRenderer;
         i11liiii1i11l11l11il.object6 = text;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = color;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
         return textRenderer.getWidth(text);
      }
   }

   @Override
   public int drawText(TextRenderer textRenderer, Text text, int x, int y, int color, boolean shadow) {
      if (this.replaying) {
         return super.drawText(textRenderer, text, x, y, color, shadow);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val257);
         i11liiii1i11l11l11il.object5 = textRenderer;
         i11liiii1i11l11l11il.object6 = text;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = color;
         i11liiii1i11l11l11il.boolean155 = shadow;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
         return textRenderer.getWidth(text);
      }
   }

   @Override
   public void drawWrappedText(TextRenderer textRenderer, StringVisitable text, int x, int y, int width, int color, boolean shadow) {
      if (this.replaying) {
         super.drawWrappedText(textRenderer, text, x, y, width, color, shadow);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val258);
         i11liiii1i11l11l11il.object5 = textRenderer;
         i11liiii1i11l11l11il.object6 = text;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = width;
         i11liiii1i11l11l11il.int353 = color;
         i11liiii1i11l11l11il.boolean155 = shadow;
         HudPreviewRenderQueue.ColorAnimator(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawSpriteStretched(Function<Identifier, RenderLayer> renderLayers, Sprite sprite, int x, int y, int width, int height) {
      if (this.replaying) {
         super.drawSpriteStretched(renderLayers, sprite, x, y, width, height);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val275);
         i11liiii1i11l11l11il.object5 = renderLayers;
         i11liiii1i11l11l11il.object6 = sprite;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = width;
         i11liiii1i11l11l11il.int353 = height;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawSpriteStretched(Function<Identifier, RenderLayer> renderLayers, Sprite sprite, int x, int y, int width, int height, int color) {
      if (this.replaying) {
         super.drawSpriteStretched(renderLayers, sprite, x, y, width, height, color);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val276);
         i11liiii1i11l11l11il.object5 = renderLayers;
         i11liiii1i11l11l11il.object6 = sprite;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = width;
         i11liiii1i11l11l11il.int353 = height;
         i11liiii1i11l11l11il.int354 = color;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawGuiTexture(Function<Identifier, RenderLayer> renderLayers, Identifier sprite, int x, int y, int width, int height) {
      if (this.replaying) {
         super.drawGuiTexture(renderLayers, sprite, x, y, width, height);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val277);
         i11liiii1i11l11l11il.object5 = renderLayers;
         i11liiii1i11l11l11il.object6 = sprite;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = width;
         i11liiii1i11l11l11il.int353 = height;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawGuiTexture(Function<Identifier, RenderLayer> renderLayers, Identifier sprite, int x, int y, int width, int height, int color) {
      if (this.replaying) {
         super.drawGuiTexture(renderLayers, sprite, x, y, width, height, color);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val278);
         i11liiii1i11l11l11il.object5 = renderLayers;
         i11liiii1i11l11l11il.object6 = sprite;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.int352 = width;
         i11liiii1i11l11l11il.int353 = height;
         i11liiii1i11l11l11il.int354 = color;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawGuiTexture(
      Function<Identifier, RenderLayer> renderLayers, Identifier sprite, int textureWidth, int textureHeight, int u, int v, int x, int y, int width, int height
   ) {
      if (this.replaying) {
         super.drawGuiTexture(renderLayers, sprite, textureWidth, textureHeight, u, v, x, y, width, height);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val279);
         i11liiii1i11l11l11il.object5 = renderLayers;
         i11liiii1i11l11l11il.object6 = sprite;
         i11liiii1i11l11l11il.int350 = textureWidth;
         i11liiii1i11l11l11il.int351 = textureHeight;
         i11liiii1i11l11l11il.int352 = u;
         i11liiii1i11l11l11il.int353 = v;
         i11liiii1i11l11l11il.int354 = x;
         i11liiii1i11l11l11il.int355 = y;
         i11liiii1i11l11l11il.int356 = width;
         i11liiii1i11l11l11il.int357 = height;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawTexture(
      Function<Identifier, RenderLayer> renderLayers,
      Identifier sprite,
      int x,
      int y,
      float u,
      float v,
      int width,
      int height,
      int textureWidth,
      int textureHeight,
      int color
   ) {
      if (this.replaying) {
         super.drawTexture(renderLayers, sprite, x, y, u, v, width, height, textureWidth, textureHeight, color);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val281);
         i11liiii1i11l11l11il.object5 = renderLayers;
         i11liiii1i11l11l11il.object6 = sprite;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.float226 = u;
         i11liiii1i11l11l11il.float227 = v;
         i11liiii1i11l11l11il.int352 = width;
         i11liiii1i11l11l11il.int353 = height;
         i11liiii1i11l11l11il.int354 = textureWidth;
         i11liiii1i11l11l11il.int355 = textureHeight;
         i11liiii1i11l11l11il.int356 = color;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawTexture(
      Function<Identifier, RenderLayer> renderLayers,
      Identifier sprite,
      int x,
      int y,
      float u,
      float v,
      int width,
      int height,
      int textureWidth,
      int textureHeight
   ) {
      if (this.replaying) {
         super.drawTexture(renderLayers, sprite, x, y, u, v, width, height, textureWidth, textureHeight);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val280);
         i11liiii1i11l11l11il.object5 = renderLayers;
         i11liiii1i11l11l11il.object6 = sprite;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.float226 = u;
         i11liiii1i11l11l11il.float227 = v;
         i11liiii1i11l11l11il.int352 = width;
         i11liiii1i11l11l11il.int353 = height;
         i11liiii1i11l11l11il.int354 = textureWidth;
         i11liiii1i11l11l11il.int355 = textureHeight;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawTexture(
      Function<Identifier, RenderLayer> renderLayers,
      Identifier sprite,
      int x,
      int y,
      float u,
      float v,
      int width,
      int height,
      int regionWith,
      int regionHeight,
      int textureWidth,
      int textureHeight
   ) {
      if (this.replaying) {
         super.drawTexture(renderLayers, sprite, x, y, u, v, width, height, regionWith, regionHeight, textureWidth, textureHeight);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val282);
         i11liiii1i11l11l11il.object5 = renderLayers;
         i11liiii1i11l11l11il.object6 = sprite;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.float226 = u;
         i11liiii1i11l11l11il.float227 = v;
         i11liiii1i11l11l11il.int352 = width;
         i11liiii1i11l11l11il.int353 = height;
         i11liiii1i11l11l11il.int354 = regionWith;
         i11liiii1i11l11l11il.int355 = regionHeight;
         i11liiii1i11l11l11il.int356 = textureWidth;
         i11liiii1i11l11l11il.int357 = textureHeight;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }

   @Override
   public void drawTexture(
      Function<Identifier, RenderLayer> renderLayers,
      Identifier sprite,
      int x,
      int y,
      float u,
      float v,
      int width,
      int height,
      int regionWidth,
      int regionHeight,
      int textureWidth,
      int textureHeight,
      int color
   ) {
      if (this.replaying) {
         super.drawTexture(renderLayers, sprite, x, y, u, v, width, height, regionWidth, regionHeight, textureWidth, textureHeight, color);
      } else {
         HudPreviewItem i11liiii1i11l11l11il = this.queueCommand(HudPreviewType.val283);
         i11liiii1i11l11l11il.object5 = renderLayers;
         i11liiii1i11l11l11il.object6 = sprite;
         i11liiii1i11l11l11il.int350 = x;
         i11liiii1i11l11l11il.int351 = y;
         i11liiii1i11l11l11il.float226 = u;
         i11liiii1i11l11l11il.float227 = v;
         i11liiii1i11l11l11il.int352 = width;
         i11liiii1i11l11l11il.int353 = height;
         i11liiii1i11l11l11il.int354 = regionWidth;
         i11liiii1i11l11l11il.int355 = regionHeight;
         i11liiii1i11l11l11il.int356 = textureWidth;
         i11liiii1i11l11l11il.int357 = textureHeight;
         i11liiii1i11l11l11il.int358 = color;
         HudPreviewRenderQueue.UiAnimation(i11liiii1i11l11l11il);
      }
   }
}
