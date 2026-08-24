package oxxxde

import java.awt.Color
import java.util.Locale
import kotakbaz.rain.client.util.other.CustomScreen
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.ui.api.PipelinedRender
import kotakbaz.rain.ui.inventory.InventoryCard
import kotakbaz.rain.ui.inventory.InventorySnapshot
import kotakbaz.rain.ui.inventory.SearchLayout
import kotakbaz.rain.ui.inventory.UiRect
import kotlin.jvm.internal.Ref
import kotlin.math.MathKt
import net.minecraft.client.gui.DrawContext
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.registry.DynamicRegistryManager
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import org.lwjgl.glfw.GLFW

// $VF: Compiled from heavy
public object شج : CustomScreen, PipelinedRender {
   private final var closing: Boolean
   private final var searchText: String = ""
   private final var listScroll: Float
   private final var searchFocused: Boolean

   private final val selectedCardName: String?
      private final get() {
         return تؤ.INSTANCE.selectedName
      }


   private fun renderCardDelete(bounds: ظآ, reveal: Float, hover: Float) {
      if (!(reveal <= 0.001F)) {
         Font.drawText$default(
            رَ.INSTANCE.ICON.priority(this.iconsPipeline()),
            "i",
            bounds.x + (bounds.width - Font.getWidth$default(رَ.INSTANCE.ICON, "i", 6.2F, 0.0F, 4, null)) * 0.5F,
            bounds.y + (bounds.height - رَ.INSTANCE.ICON.getHeight(6.2F)) * 0.5F - 0.2F,
            6.2F,
            بح.INSTANCE.interpolateColor(ثْ.INSTANCE.icon(0.42F * reveal), ثْ.INSTANCE.title(0.82F * reveal), hover),
            0.0F,
            0.0F,
            0.0F,
            0,
            0.0F,
            992,
            null
         )
      }
   }

   private fun renderTopInfo(panelX: Float, panelY: Float) {
      val infoX: Float = panelX + 197.09999F
      val infoY: Float = panelY + 12.0F
      ذر.INSTANCE.BASIC_RECT
         .priority(this.rectPipeline())
         .round(4.0F)
         .color(ثْ.INSTANCE.surface(0.01F))
         .border(1.0F, ثْ.INSTANCE.surface(0.06F))
         .draw(infoX, panelY + 12.0F, 228.90001F, 27.0F)
         val iconX: Float = infoX + 7.5F
      val iconY: Float = infoY + (27.0F - 9.45F) * 0.5F
      val textX: Float = iconX + Font.getWidth$default(رَ.INSTANCE.ICON, "N", 9.45F, 0.0F, 4, null) + 5.0F
      val textY: Float = infoY + (27.0F - 8.0F) * 0.46F
      val sectionRight: Float = infoX + 228.90001F - 7.5F
      Font.drawText$default(
         رَ.INSTANCE.ICON.priority(this.iconsPipeline()), "N", iconX, iconY, 9.45F, ثْ.INSTANCE.icon(0.86F), 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null
      )
      Font.drawText$default(
         رَ.INSTANCE.GS_MEDIUM.priority(this.textPipeline()), "InvManager", textX, textY, 8.0F, ثْ.INSTANCE.title(0.86F), 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null
      )
      Font.drawText$default(
         رَ.INSTANCE.GS_MEDIUM.priority(this.textPipeline()).resetFade(),
         "Менеджер инвентарей",
         sectionRight - Font.getWidth$default(رَ.INSTANCE.GS_MEDIUM, "Менеджер инвентарей", 8.0F, 0.0F, 4, null),
         textY,
         8.0F,
         ثْ.INSTANCE.value(0.4F),
         0.0F,
         0.0F,
         0.0F,
         0,
         0.0F,
         992,
         null
      )
   }

   public override fun onMouseScroll(mouseX: Int, mouseY: Int, vertical: Float) {
      super.onMouseScroll(mouseX, mouseY, vertical)
      if (!closing && !this.savedCards.isEmpty()) {
         if (صي.cardListBounds((float)ضك.getMc().getWindow().getScaledWidth() * 0.5F - 219.0F, (float)ضك.getMc().getWindow().getScaledHeight() * 0.5F - 117.0F)
            .contains((float)mouseX, (float)mouseY)) {
            listScroll = RangesKt.coerceIn(listScroll - vertical * 38.0F, 0.0F, صي.maxListScroll(this.savedCards.size()))
         }
      }
   }

   public override fun render(mouseX: Int, mouseY: Int, partialTicks: Float) {
      val x: Float = ضك.getMc().getWindow().getScaledWidth() * 0.5F - 219.0F
      val y: Float = ضك.getMc().getWindow().getScaledHeight() * 0.5F - 117.0F
      ذر.INSTANCE.BLURRED_RECT
         .priority(this.rectPipeline())
         .round(9.36F)
         .color(ثْ.panel$default(ثْ.INSTANCE, 0.0F, 1, null))
         .mix(0.95F)
         .draw(x, y, 438.0F, 234.0F)
         ذر.INSTANCE.BLURRED_RECT
         .priority(this.rectPipeline())
         .round(9.36F)
         .color(ثْ.surface$default(ثْ.INSTANCE, 0.0F, 1, null))
         .mix(0.95F)
         .draw(x + 12.0F, y + 12.0F, 173.09999F, 210.0F)
         this.renderTopInfo(x, y)
      this.renderViewLabel(x, y)
      this.renderViewPreview(x, y)
      this.renderEmptyState(x, y)
      this.renderSearch(x, y)
      this.renderSavedCards(x, y, mouseX, mouseY)
      this.renderPanelBorder(x, y)
   }

   private fun renderViewSlot(x: Float, y: Float) {
      ذر.INSTANCE.BLURRED_RECT.priority(this.rectPipeline()).color(ثْ.INSTANCE.value(0.45F)).round(1.0F).mix(0.95F).draw(x, y, 22.0F, 22.0F)
   }

   private final val savedCards: MutableList<ثغ>
      private final get() {
         return تؤ.INSTANCE.cards
      }


   private fun appendSearchText(value: String) {
      if (value.length() != 0 && searchText.length() < 20) {
         searchText = StringsKt.take("${searchText}$value", 20)
      }
   }

   public override fun onKeyPress(mouseX: Int, mouseY: Int, button: Int) {
      super.onKeyPress(mouseX, mouseY, button)
      if (!closing && searchFocused) {
         when (button) {
            32 -> {
               this.appendSearchText(" ")
               return
            }
            257, 335 -> {
               this.addCardFromInput()
               return
            }
            259 -> {
               if (searchText.length() > 0) {
                  searchText = StringsKt.dropLast(searchText, 1)
               }

               return
            }
            261 -> {
               searchText = ""
               return
            }
            else -> {
               val var10000: java.lang.String = GLFW.glfwGetKeyName(button, 0)
               if (var10000 != null) {
                  if (var10000.length() == 1) {
                     val var10001: java.lang.String
                     if (this.isShiftDown()) {
                        var10001 = var10000.toUpperCase(Locale.ROOT)
                     } else {
                        var10001 = var10000.toLowerCase(Locale.ROOT)
                     }

                     this.appendSearchText(var10001)
                  }
               }
            }
         }
      }
   }

   public override fun onMouseClick(mouseX: Int, mouseY: Int, button: Int) {
      super.onMouseClick(mouseX, mouseY, button)
      if (!closing && button == 0) {
         val panelX: Float = ضك.getMc().getWindow().getScaledWidth() * 0.5F - 219.0F
         val panelY: Float = ضك.getMc().getWindow().getScaledHeight() * 0.5F - 117.0F
         val layout: SearchLayout = صي.searchLayout(panelX, panelY)
         val pointX: Float = mouseX
         val pointY: Float = mouseY
         if (layout.isInsideAction(pointX, (float)mouseY)) {
            searchFocused = true
            this.addCardFromInput()
         } else if (this.handleCardActionClick(panelX, panelY, pointX, pointY)) {
            searchFocused = false
         } else {
            searchFocused = layout.isInsideSearch(pointX, pointY)
         }
      }
   }

   private fun captureInventory(): ّ? {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      return if (var10000 == null) null else InventorySnapshot.Companion.capture(var10000 as PlayerEntity)
   }

   public override fun textPipeline(): صؤ {
      return ClientRenderPipeline.GUI_TEXT
   }

   private fun renderPanelBorder(panelX: Float, panelY: Float) {
      ذر.INSTANCE.BASIC_RECT
         .priority(this.rectPipeline())
         .round(9.36F)
         .color(ثْ.INSTANCE.panel(0.0F))
         .border(1.0F, ثْ.INSTANCE.title(0.08F))
         .draw(panelX, panelY, 438.0F, 234.0F)
      }

   @JvmStatic
   fun `renderSavedInventoryItems$renderStack`(
      `$graphics`: DrawContext,
      `$mouseY`: Int,
      stack: Int,
      hoveredStack: Ref.ObjectRef<ItemStack>,
      slotY: Ref.BooleanRef,
      renderedAny: ItemStack,
      `$mouseX`: Float,
      slotX: Float
   ) {
      if (!stack.isEmpty()) {
         val itemX: Int = MathKt.roundToInt(slotX + 3.0F)
         val itemY: Int = MathKt.roundToInt(slotY + 3.0F)
         `$graphics`.drawItem(stack, itemX, itemY)
         if (stack.getCount() != 1) {
            val countText: java.lang.String = java.lang.String.valueOf(stack.getCount())
            `$graphics`.drawText(ضك.getMc().textRenderer, countText, itemX + 17 - ضك.getMc().textRenderer.getWidth(countText), itemY + 9, -1, true)
         }

         if (slotX <= `$mouseX` && `$mouseX` <= slotX + 22.0F && slotY <= `$mouseY` && `$mouseY` <= slotY + 22.0F) {
            hoveredStack.element = (T)stack
         }

         renderedAny.element = true
      }
   }

   fun renderSavedInventoryItems(mouseX: DrawContext, mouseY: Int, graphics: Int): Boolean {
      val var10000: java.lang.String = this.selectedCardName
      if (var10000 == null) {
         false
      } else {
         val selectedName: java.lang.String = var10000
         val labelY: java.util.Iterator = this.savedCards.iterator()

         while (true) {
            if (labelY.hasNext()) {
               val previewY: Any = labelY.next()
               if (!((previewY as InventoryCard).name == selectedName)) {
                  continue
               }

               var51 = previewY
               break
            }

            var51 = null
            break
         }

         val var52: InventoryCard = var51 as InventoryCard
         if (var51 as InventoryCard != null) {
            val var53: InventorySnapshot = var52.snapshot
            if (var53 != null) {
               val panelX: Float = ضك.getMc().getWindow().getScaledWidth() * 0.5F - 219.0F
               val var25: Float = ضك.getMc().getWindow().getScaledHeight() * 0.5F - 117.0F
               val var26: Float = panelX + 197.09999F
               val var28: Float = var25 + 12.0F + 27.0F + 16.0F + 8.0F + 8.0F
               val var29: Float = 25.0F
               val var30: Float = var28 + 22.0F + 8.0F
               val hotbarY: Float = var28 + 22.0F + 8.0F + 2 * 25.0F + 22.0F + 8.0F
               val renderedAny: Ref.BooleanRef = Ref.BooleanRef()
               val hoveredStack: Ref.ObjectRef = Ref.ObjectRef()
               var `$this$forEachIndexed$iv`: java.lang.Iterable = var53.armor
               var stack: Int = 0

               for (`item$iv` in `$this$forEachIndexed$iv`) {
                  val var21: Int = stack++
                  if (var21 < 0) {
                     CollectionsKt.throwIndexOverflow()
                  }

                  renderSavedInventoryItems$renderStack(
                     graphics, mouseX, mouseY, hoveredStack, renderedAny, `item$iv` as ItemStack, var26 + (float)var21 * var29, var28
                  )
               }

               renderSavedInventoryItems$renderStack(graphics, mouseX, mouseY, hoveredStack, renderedAny, var53.getOffhand(), var26 + (float)8 * var29, var28)
               `$this$forEachIndexed$iv` = var53.inventory
               stack = 0

               for (var41 in `$this$forEachIndexed$iv`) {
                  val var43: Int = stack++
                  if (var43 < 0) {
                     CollectionsKt.throwIndexOverflow()
                  }

                  renderSavedInventoryItems$renderStack(
                     graphics,
                     mouseX,
                     mouseY,
                     hoveredStack,
                     renderedAny,
                     var41 as ItemStack,
                     var26 + (float)(var43 % 9) * var29,
                     var30 + (float)(var43 / 9) * var29
                  )
               }

               `$this$forEachIndexed$iv` = var53.hotbar
               stack = 0

               for (var42 in `$this$forEachIndexed$iv`) {
                  val var44: Int = stack++
                  if (var44 < 0) {
                     CollectionsKt.throwIndexOverflow()
                  }

                  renderSavedInventoryItems$renderStack(
                     graphics, mouseX, mouseY, hoveredStack, renderedAny, var42 as ItemStack, var26 + (float)var44 * var29, hotbarY
                  )
               }

               val var57: ItemStack = hoveredStack.element as ItemStack
               if (hoveredStack.element as ItemStack != null) {
                  graphics.drawItemTooltip(ضك.getMc().textRenderer, var57, mouseX, mouseY)
                  graphics.drawDeferredElements()
               }

               renderedAny.element
            }
         }

         false
      }
   }

   private fun addCardFromInput() {
      val name: java.lang.String = StringsKt.trim(searchText).toString()
      if (name.length() != 0) {
         val var10000: InventorySnapshot = this.captureInventory()
         if (var10000 != null) {
            val var4: ClientWorld = ضك.getMc().world
            if (var4 != null) {
               val var5: DynamicRegistryManager = var4.getRegistryManager()
               if (var5 != null) {
                  if (!تؤ.INSTANCE.add(name, var10000, var5 as WrapperLookup)) {
                     return
                  }

                  searchText = ""
                  listScroll = صي.maxListScroll(this.savedCards.size())
                  return
               }
            }
         }
      }
   }

   public override fun shouldRemove(): Boolean {
      return closing
   }

   private fun reloadSavedCards() {
      val var10000: ClientWorld = ضك.getMc().world
      if (var10000 != null) {
         val var2: DynamicRegistryManager = var10000.getRegistryManager()
         if (var2 != null) {
            تؤ.INSTANCE.reload(var2 as WrapperLookup)
            return
         }
      }
   }

   private fun renderSavedCards(panelX: Float, panelY: Float, mouseX: Int, mouseY: Int) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.vineflower.kotlin.expr.KFunctionExprent.toJava(KFunctionExprent.java:196)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial oxxxde/شج.getSavedCards ()Ljava/util/List;
      // 004: invokeinterface java/util/List.isEmpty ()Z 1
      // 009: ifeq 00d
      // 00c: return
      // 00d: fload 1
      // 00e: fload 2
      // 00f: invokestatic oxxxde/صي.cardListBounds (FF)Lkotakbaz/rain/ui/inventory/UiRect;
      // 012: astore 5
      // 014: getstatic oxxxde/شج.listScroll F
      // 017: fconst_0
      // 018: nop
      // 019: aload 0
      // 01a: invokespecial oxxxde/شج.getSavedCards ()Ljava/util/List;
      // 01d: invokeinterface java/util/List.size ()I 1
      // 022: invokestatic oxxxde/صي.maxListScroll (I)F
      // 025: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 028: putstatic oxxxde/شج.listScroll F
      // 02b: getstatic oxxxde/جِ.INSTANCE Loxxxde/جِ;
      // 02e: aload 5
      // 030: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getX ()F
      // 033: aload 5
      // 035: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getY ()F
      // 038: aload 5
      // 03a: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getWidth ()F
      // 03d: aload 5
      // 03f: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getHeight ()F
      // 042: invokevirtual oxxxde/جِ.start (FFFF)V
      // 045: aload 0
      // 046: invokespecial oxxxde/شج.getSavedCards ()Ljava/util/List;
      // 049: checkcast java/lang/Iterable
      // 04c: astore 6
      // 04e: bipush 0
      // 04f: nop
      // 050: istore 7
      // 052: bipush 0
      // 053: nop
      // 054: istore 8
      // 056: aload 6
      // 058: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 05d: astore 9
      // 05f: aload 9
      // 061: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 066: ifeq 2ef
      // 069: aload 9
      // 06b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 070: astore 10
      // 072: iload 8
      // 074: iinc 8 1
      // 077: istore 11
      // 079: iload 11
      // 07b: ifge 081
      // 07e: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
      // 081: iload 11
      // 083: aload 10
      // 085: checkcast kotakbaz/rain/ui/inventory/InventoryCard
      // 088: astore 12
      // 08a: istore 13
      // 08c: bipush 0
      // 08d: nop
      // 08e: istore 14
      // 090: aload 5
      // 092: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getY ()F
      // 095: iload 13
      // 097: i2f
      // 098: ldc_w 38.0
      // 09b: fmul
      // 09c: fadd
      // 09d: getstatic oxxxde/شج.listScroll F
      // 0a0: fsub
      // 0a1: fstore 15
      // 0a3: fload 15
      // 0a5: ldc_w 33.0
      // 0a8: fadd
      // 0a9: aload 5
      // 0ab: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getY ()F
      // 0ae: fcmpg
      // 0af: iflt 2eb
      // 0b2: fload 15
      // 0b4: aload 5
      // 0b6: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getY ()F
      // 0b9: aload 5
      // 0bb: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getHeight ()F
      // 0be: fadd
      // 0bf: fcmpl
      // 0c0: ifle 0c6
      // 0c3: goto 2eb
      // 0c6: getstatic oxxxde/شج.INSTANCE Loxxxde/شج;
      // 0c9: invokespecial oxxxde/شج.getSelectedCardName ()Ljava/lang/String;
      // 0cc: aload 12
      // 0ce: invokevirtual kotakbaz/rain/ui/inventory/InventoryCard.getName ()Ljava/lang/String;
      // 0d1: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0d4: istore 16
      // 0d6: aload 12
      // 0d8: invokevirtual kotakbaz/rain/ui/inventory/InventoryCard.getSelectionAnimation ()Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 0db: iload 16
      // 0dd: ifeq 0e5
      // 0e0: fconst_1
      // 0e1: nop
      // 0e2: goto 0e7
      // 0e5: fconst_0
      // 0e6: nop
      // 0e7: ldc_w 220.0
      // 0ea: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 0ed: astore 17
      // 0ef: new oxxxde/ضظ
      // 0f2: dup
      // 0f3: aload 17
      // 0f5: invokespecial oxxxde/ضظ.<init> (Loxxxde/بف;)V
      // 0f8: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 0fb: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 0fe: fconst_0
      // 0ff: nop
      // 100: fconst_1
      // 101: nop
      // 102: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 105: fstore 18
      // 107: aload 5
      // 109: iload 3
      // 10a: nop
      // 10b: i2f
      // 10c: iload 4
      // 10e: i2f
      // 10f: invokevirtual kotakbaz/rain/ui/inventory/UiRect.contains (FF)Z
      // 112: ifeq 13c
      // 115: new kotakbaz/rain/ui/inventory/UiRect
      // 118: dup
      // 119: aload 5
      // 11b: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getX ()F
      // 11e: fload 15
      // 120: aload 5
      // 122: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getWidth ()F
      // 125: ldc_w 33.0
      // 128: invokespecial kotakbaz/rain/ui/inventory/UiRect.<init> (FFFF)V
      // 12b: iload 3
      // 12c: nop
      // 12d: i2f
      // 12e: iload 4
      // 130: i2f
      // 131: invokevirtual kotakbaz/rain/ui/inventory/UiRect.contains (FF)Z
      // 134: ifeq 13c
      // 137: bipush 1
      // 138: nop
      // 139: goto 13e
      // 13c: bipush 0
      // 13d: nop
      // 13e: istore 17
      // 140: aload 5
      // 142: fload 15
      // 144: invokestatic oxxxde/صي.cardDeleteBounds (Lkotakbaz/rain/ui/inventory/UiRect;F)Lkotakbaz/rain/ui/inventory/UiRect;
      // 147: astore 19
      // 149: iload 17
      // 14b: ifeq 161
      // 14e: aload 19
      // 150: iload 3
      // 151: nop
      // 152: i2f
      // 153: iload 4
      // 155: i2f
      // 156: invokevirtual kotakbaz/rain/ui/inventory/UiRect.contains (FF)Z
      // 159: ifeq 161
      // 15c: bipush 1
      // 15d: nop
      // 15e: goto 163
      // 161: bipush 0
      // 162: nop
      // 163: istore 20
      // 165: aload 12
      // 167: invokevirtual kotakbaz/rain/ui/inventory/InventoryCard.getDeleteRevealAnimation ()Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 16a: iload 17
      // 16c: ifeq 174
      // 16f: fconst_1
      // 170: nop
      // 171: goto 176
      // 174: fconst_0
      // 175: nop
      // 176: ldc_w 180.0
      // 179: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 17c: astore 21
      // 17e: new oxxxde/سْ
      // 181: dup
      // 182: aload 21
      // 184: invokespecial oxxxde/سْ.<init> (Loxxxde/بف;)V
      // 187: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 18a: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 18d: fconst_0
      // 18e: nop
      // 18f: fconst_1
      // 190: nop
      // 191: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 194: fstore 22
      // 196: aload 12
      // 198: invokevirtual kotakbaz/rain/ui/inventory/InventoryCard.getDeleteHoverAnimation ()Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 19b: iload 20
      // 19d: ifeq 1a5
      // 1a0: fconst_1
      // 1a1: nop
      // 1a2: goto 1a7
      // 1a5: fconst_0
      // 1a6: nop
      // 1a7: ldc_w 180.0
      // 1aa: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 1ad: astore 23
      // 1af: new oxxxde/ضْ
      // 1b2: dup
      // 1b3: aload 23
      // 1b5: invokespecial oxxxde/ضْ.<init> (Loxxxde/بف;)V
      // 1b8: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 1bb: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 1be: fconst_0
      // 1bf: nop
      // 1c0: fconst_1
      // 1c1: nop
      // 1c2: invokestatic kotlin/ranges/RangesKt.coerceIn (FFF)F
      // 1c5: fstore 21
      // 1c7: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1ca: ldc_w 0.05
      // 1cd: ldc_w 0.09
      // 1d0: fload 18
      // 1d2: fmul
      // 1d3: fadd
      // 1d4: invokevirtual oxxxde/ثْ.surface (F)Ljava/awt/Color;
      // 1d7: astore 23
      // 1d9: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 1dc: ldc_w 0.08
      // 1df: ldc_w 0.12
      // 1e2: fload 18
      // 1e4: fmul
      // 1e5: fadd
      // 1e6: invokevirtual oxxxde/ثْ.title (F)Ljava/awt/Color;
      // 1e9: astore 24
      // 1eb: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 1ee: invokevirtual oxxxde/ذر.getBLURRED_RECT ()Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1f1: getstatic oxxxde/شج.INSTANCE Loxxxde/شج;
      // 1f4: invokevirtual oxxxde/شج.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 1f7: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1fa: aload 23
      // 1fc: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 1ff: ldc 4.0
      // 201: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 204: ldc_w 0.95
      // 207: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.mix (F)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 20a: fconst_1
      // 20b: nop
      // 20c: aload 24
      // 20e: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.border (FLjava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BlurredRectRenderer;
      // 211: aload 5
      // 213: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getX ()F
      // 216: fload 15
      // 218: aload 5
      // 21a: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getWidth ()F
      // 21d: ldc_w 33.0
      // 220: invokevirtual kotakbaz/rain/client/util/render/display/BlurredRectRenderer.draw (FFFF)V
      // 223: ldc_w 8.0
      // 226: fstore 25
      // 228: fload 15
      // 22a: ldc_w 33.0
      // 22d: fload 25
      // 22f: fsub
      // 230: ldc 0.5
      // 232: fmul
      // 233: fadd
      // 234: fconst_1
      // 235: nop
      // 236: fsub
      // 237: fstore 26
      // 239: getstatic oxxxde/رَ.INSTANCE Loxxxde/رَ;
      // 23c: invokevirtual oxxxde/رَ.getGS_MEDIUM ()Lkotakbaz/rain/client/util/render/font/Font;
      // 23f: getstatic oxxxde/شج.INSTANCE Loxxxde/شج;
      // 242: invokevirtual oxxxde/شج.textPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 245: invokevirtual kotakbaz/rain/client/util/render/font/Font.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/font/Font;
      // 248: aload 12
      // 24a: invokevirtual kotakbaz/rain/ui/inventory/InventoryCard.getName ()Ljava/lang/String;
      // 24d: aload 5
      // 24f: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getX ()F
      // 252: ldc_w 7.5
      // 255: fadd
      // 256: fload 26
      // 258: fload 25
      // 25a: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 25d: fconst_0
      // 25e: nop
      // 25f: bipush 1
      // 260: nop
      // 261: aconst_null
      // 262: nop
      // 263: invokestatic oxxxde/ثْ.title$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 266: fconst_0
      // 267: nop
      // 268: fconst_0
      // 269: nop
      // 26a: fconst_0
      // 26b: nop
      // 26c: bipush 0
      // 26d: nop
      // 26e: fconst_0
      // 26f: nop
      // 270: sipush 992
      // 273: aconst_null
      // 274: nop
      // 275: invokestatic kotakbaz/rain/client/util/render/font/Font.drawText$default (Lkotakbaz/rain/client/util/render/font/Font;Ljava/lang/String;FFFLjava/awt/Color;FFFIFILjava/lang/Object;)V
      // 278: getstatic oxxxde/بح.INSTANCE Loxxxde/بح;
      // 27b: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 27e: fconst_0
      // 27f: nop
      // 280: bipush 1
      // 281: nop
      // 282: aconst_null
      // 283: nop
      // 284: invokestatic oxxxde/ثْ.value$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 287: getstatic oxxxde/ثْ.INSTANCE Loxxxde/ثْ;
      // 28a: fconst_0
      // 28b: nop
      // 28c: bipush 1
      // 28d: nop
      // 28e: aconst_null
      // 28f: nop
      // 290: invokestatic oxxxde/ثْ.title$default (Loxxxde/ثْ;FILjava/lang/Object;)Ljava/awt/Color;
      // 293: fload 18
      // 295: invokevirtual oxxxde/بح.interpolateColor (Ljava/awt/Color;Ljava/awt/Color;F)Ljava/awt/Color;
      // 298: astore 27
      // 29a: getstatic oxxxde/ذر.INSTANCE Loxxxde/ذر;
      // 29d: invokevirtual oxxxde/ذر.getBASIC_RECT ()Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 2a0: getstatic oxxxde/شج.INSTANCE Loxxxde/شج;
      // 2a3: invokevirtual oxxxde/شج.rectPipeline ()Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;
      // 2a6: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.priority (Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 2a9: aload 27
      // 2ab: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.color (Ljava/awt/Color;)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 2ae: ldc_w 0.3
      // 2b1: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.round (F)Lkotakbaz/rain/client/util/render/display/BasicRectRenderer;
      // 2b4: aload 5
      // 2b6: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getX ()F
      // 2b9: aload 5
      // 2bb: invokevirtual kotakbaz/rain/ui/inventory/UiRect.getWidth ()F
      // 2be: fadd
      // 2bf: ldc_w 7.5
      // 2c2: fsub
      // 2c3: fload 15
      // 2c5: ldc_w 5.0
      // 2c8: fadd
      // 2c9: ldc_w 2.5
      // 2cc: ldc_w 2.5
      // 2cf: invokevirtual kotakbaz/rain/client/util/render/display/BasicRectRenderer.draw (FFFF)V
      // 2d2: getstatic oxxxde/شج.INSTANCE Loxxxde/شج;
      // 2d5: fload 15
      // 2d7: aload 5
      // 2d9: fload 18
      // 2db: invokespecial oxxxde/شج.renderCardAction (FLkotakbaz/rain/ui/inventory/UiRect;F)V
      // 2de: getstatic oxxxde/شج.INSTANCE Loxxxde/شج;
      // 2e1: aload 19
      // 2e3: fload 22
      // 2e5: fload 21
      // 2e7: invokespecial oxxxde/شج.renderCardDelete (Lkotakbaz/rain/ui/inventory/UiRect;FF)V
      // 2ea: nop
      // 2eb: nop
      // 2ec: goto 05f
      // 2ef: nop
      // 2f0: getstatic oxxxde/جِ.INSTANCE Loxxxde/جِ;
      // 2f3: invokevirtual oxxxde/جِ.end ()V
      // 2f6: return
   }

   private fun isShiftDown(): Boolean {
      val window: Long = ضك.getMc().getWindow().getHandle()
      return GLFW.glfwGetKey(window, 340) == 1 || GLFW.glfwGetKey(window, 344) == 1
   }

   private fun renderSearch(panelX: Float, panelY: Float) {
      val layout: SearchLayout = صي.searchLayout(panelX, panelY)
      ذر.INSTANCE.BASIC_RECT
         .priority(this.rectPipeline())
         .round(4.0F)
         .color(ثْ.INSTANCE.surface(0.01F))
         .border(1.0F, ثْ.INSTANCE.surface(0.07F))
         .draw(layout.searchX, layout.y, layout.searchWidth, 27.0F)
         val textX: Float = layout.searchX + 6.5F
      val textY: Float = layout.y + (27.0F - 8.0F) * 0.46F
      val textColor: java.lang.CharSequence = searchText
      val displayedText: java.lang.String = (if (StringsKt.isBlank(searchText)) (if (searchFocused) " " else "Введите название..") else textColor) as java.lang.String
      Font.drawText$default(
         رَ.INSTANCE.GS_MEDIUM.priority(this.textPipeline()),
         displayedText,
         textX,
         textY,
         8.0F,
         if (StringsKt.isBlank(searchText)) ثْ.INSTANCE.value(0.45F) else ثْ.INSTANCE.title(0.76F),
         0.0F,
         0.0F,
         0.0F,
         0,
         0.0F,
         992,
         null
      )
      Font.drawText$default(
         رَ.INSTANCE.ICON.priority(this.iconsPipeline()),
         "g",
         layout.searchX + layout.searchWidth - 13.5F,
         textY + 1.0F,
         8.0F,
         ثْ.INSTANCE.icon(0.45F),
         0.0F,
         0.0F,
         0.0F,
         0,
         0.0F,
         992,
         null
      )
      if (searchFocused && System.currentTimeMillis() / 450L % 2L == 0L) {
         Font.drawText$default(
            رَ.INSTANCE.GS_MEDIUM.priority(this.textPipeline()),
            "|",
            RangesKt.coerceAtMost(
               textX + Font.getWidth$default(رَ.INSTANCE.GS_MEDIUM, searchText, 8.0F, 0.0F, 4, null) + 1.0F, layout.searchX + layout.searchWidth - 20.0F
            ),
            textY,
            8.0F,
            ثْ.INSTANCE.title(0.86F),
            0.0F,
            0.0F,
            0.0F,
            0,
            0.0F,
            992,
            null
         )
      }

      ذر.INSTANCE.BASIC_RECT
         .priority(this.rectPipeline())
         .round(4.0F)
         .color(ثْ.INSTANCE.surface(0.01F))
         .border(1.0F, ثْ.INSTANCE.surface(0.07F))
         .draw(layout.actionX, layout.y, 27.0F, 27.0F)
         Font.drawCenteredText$default(
         رَ.INSTANCE.GS_MEDIUM.priority(this.textPipeline()),
         "+",
         layout.actionX + 13.5F + -0.7F,
         layout.y + (27.0F - 12.15F) * 0.5F - 2.1F,
         12.15F,
         ثْ.INSTANCE.title(0.8F),
         0.0F,
         32,
         null
      )
   }

   private fun renderViewPreview(panelX: Float, panelY: Float) {
      if (this.selectedCardName != null) {
         val previewX: Float = panelX + 197.09999F
         val previewY: Float = panelY + 12.0F + 27.0F + 16.0F + 8.0F + 8.0F
         val slotStep: Float = 25.0F
         val inventoryStartY: Byte = 4

         repeat(inventoryStartY) { hotbarY ->
            INSTANCE.renderViewSlot(previewX + (float)hotbarY * slotStep, previewY)
         }

         this.renderViewSlot(previewX + (float)8 * slotStep, previewY)
         val var17: Float = previewY + 22.0F + 8.0F
         val var18: Byte = 3

         repeat(var18) { var20 ->
            val var12: Float = var17 + var20 * slotStep
            val var13: Byte = 9

            repeat(var13) { var14 ->
               INSTANCE.renderViewSlot(previewX + (float)var14 * slotStep, var12)
            }
         }

         val var19: Float = var17 + 2 * slotStep + 22.0F + 8.0F
         val var21: Byte = 9

         repeat(var21) { var23 ->
            INSTANCE.renderViewSlot(previewX + (float)var23 * slotStep, var19)
         }
      }
   }

   public fun clearLoadedSelection() {
      تؤ.INSTANCE.clearSelection()
   }

   public override fun iconsPipeline(): صؤ {
      return ClientRenderPipeline.GUI_SPECIAL
   }

   public override fun close() {
      closing = true
      searchFocused = false
   }

   public override fun init() {
      closing = false
      searchText = ""
      searchFocused = false
      this.reloadSavedCards()
      listScroll = RangesKt.coerceIn(listScroll, 0.0F, صي.maxListScroll(this.savedCards.size()))
   }

   private fun renderEmptyState(panelX: Float, panelY: Float) {
      if (this.selectedCardName == null) {
         Font.drawCenteredText$default(
            رَ.INSTANCE.GS_MEDIUM.priority(this.textPipeline()),
            "Здесь пока что пусто >_<",
            panelX + 197.09999F + 228.90001F * 0.5F,
            panelY + 12.0F + 27.0F + 8.0F + (175.0F - 11.0F) * 0.46F,
            11.0F,
            ثْ.INSTANCE.value(0.5F),
            0.0F,
            32,
            null
         )
      }
   }

   private fun renderViewLabel(panelX: Float, panelY: Float) {
      val var10000: java.lang.String = this.selectedCardName
      if (var10000 != null) {
         val labelX: Float = panelX + 197.09999F
         val labelY: Float = panelY + 12.0F + 27.0F + 16.0F
         val labelFont: Font = رَ.INSTANCE.GS_MEDIUM.priority(this.textPipeline())
         Font.drawText$default(labelFont, "Просмотр:", labelX, labelY, 8.0F, ثْ.title$default(ثْ.INSTANCE, 0.0F, 1, null), 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null)
         Font.drawText$default(
            labelFont,
            var10000,
            labelX + Font.getWidth$default(labelFont, "Просмотр:", 8.0F, 0.0F, 4, null) + 4.0F,
            labelY,
            8.0F,
            ثْ.INSTANCE.value(0.75F),
            0.0F,
            0.0F,
            0.0F,
            0,
            0.0F,
            992,
            null
         )
      }
   }

   private fun renderCardAction(cardY: Float, listBounds: ظآ, selection: Float) {
      val actionBounds: UiRect = صي.cardActionBounds(listBounds, cardY)
      ذر.INSTANCE.BLURRED_RECT
         .priority(this.rectPipeline())
         .color(بح.INSTANCE.interpolateColor(ثْ.INSTANCE.surface(0.04F), Color(125, 28, 38, 220), selection))
         .round(3.0F)
         .mix(0.95F)
         .border(1.0F, بح.INSTANCE.interpolateColor(ثْ.INSTANCE.title(0.08F), Color(180, 48, 58, 235), selection))
         .draw(actionBounds.x, actionBounds.y, actionBounds.width, actionBounds.height)
         val textY: Float = actionBounds.y + (actionBounds.height - 6.2F) * 0.46F - 0.3F
      val textX: Float = actionBounds.x + actionBounds.width * 0.5F
      if (selection < 0.999F) {
         Font.drawCenteredText$default(
            رَ.INSTANCE.GS_MEDIUM.priority(this.textPipeline()),
            "Загрузить",
            textX,
            textY,
            6.2F,
            بح.INSTANCE.setAlpha(ثْ.title$default(ثْ.INSTANCE, 0.0F, 1, null), 0.78F * (1.0F - selection)),
            0.0F,
            32,
            null
         )
      }

      if (selection > 0.001F) {
         val var10000: Font = رَ.INSTANCE.GS_MEDIUM.priority(this.textPipeline())
         val var10005: بح = بح.INSTANCE
         val var10006: Color = Color.WHITE
         Font.drawCenteredText$default(var10000, "Выгрузить", textX, textY, 6.2F, var10005.setAlpha(var10006, selection), 0.0F, 32, null)
      }
   }

   private fun handleCardActionClick(panelX: Float, panelY: Float, mouseX: Float, mouseY: Float): Boolean {
      val listBounds: UiRect = صي.cardListBounds(panelX, panelY)
      if (!listBounds.contains(mouseX, mouseY)) {
         return false
      } else {
         var index: Int = 0

         for (var7 in this.savedCards.size()..index) {
            val card: InventoryCard = this.savedCards.get(index)
            val cardY: Float = listBounds.y + index * 38.0F - listScroll
            if (!(cardY + 33.0F < listBounds.y) && !(cardY > listBounds.y + listBounds.height)) {
               if (صي.cardDeleteBounds(listBounds, cardY).contains(mouseX, mouseY)) {
                  if (!تؤ.INSTANCE.delete(index)) {
                     return true
                  }

                  listScroll = RangesKt.coerceIn(listScroll, 0.0F, صي.maxListScroll(this.savedCards.size()))
                  return true
               }

               if (صي.cardActionBounds(listBounds, cardY).contains(mouseX, mouseY)) {
                  تؤ.INSTANCE.toggle(card)
                  return true
               }
            }
         }

         return false
      }
   }

   public override fun rectPipeline(): صؤ {
      return ClientRenderPipeline.GUI_RECT
   }
}
