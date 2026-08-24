package oxxxde

import java.awt.Color
import java.net.URI
import java.util.ArrayList
import java.util.Locale
import net.minecraft.client.gui.screen.ChatScreen
import net.minecraft.client.sound.PositionedSoundInstance
import net.minecraft.client.sound.SoundInstance
import net.minecraft.sound.SoundEvents
import net.minecraft.text.MutableText
import net.minecraft.text.Style
import net.minecraft.text.Text
import net.minecraft.text.TextColor
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object سِ : دِ("Notify", ظن.getHUD(), "Отображение уведомлений клиента") {
   private final val enabledColor: Color = Color(85, 255, 85)
   private const val ENTER_DURATION_MS: Long = 360L
   private const val TIME_ICON: String = "S"
   private const val VISIBLE_DURATION_MS: Long = 2000L
   private const val EXIT_DURATION_MS: Long = 260L
   private const val REMOTE_NOTIFICATION_PREFIX: String = "RemoteNotification:"
   private const val REMOTE_ACTION_VISIBLE_DURATION_MS: Long = 10000L
   private final var defaultPositionResolved: Boolean
   private final val notifications: MutableList<ظض> = ArrayList() as java.util.List
   private const val REMOTE_VISIBLE_DURATION_MS: Long = 6000L
   private const val MAX_REMOTE_NOTIFICATIONS: Int = 5
   private const val STACK_MOVE_DURATION_MS: Long = 260L
   private final val draggable: ظذ = سِ.INSTANCE.draggable(سِ.INSTANCE.getName(), 0.0F, 0.0F).lockHorizontalCenter()
   private final val remoteNotifications: MutableList<رن> = ArrayList() as java.util.List
   private const val PREVIEW_TEXT: String = "Пример уведомления"
   private final var previewAnimation: ري = ري(0.0F)
   private const val CONTENT_ANIMATION_MS: Long = 220L
   private final val disabledColor: Color = Color(255, 85, 85)
   private final val dividerColor: Color = Color(255, 255, 255, 100)

   private fun animationProgress(notification: ظض, now: Long): Float {
      val enterElapsed: Long = now - notification.shownAt
      return if (enterElapsed < 0L)
         0.0F
         else
         (
            if (enterElapsed < 360L)
               بف.INSTANCE.standard((float)enterElapsed / 360.0F)
               else
               (
                  if (now < notification.hideAt)
                     1.0F
                     else
                     (if (now < notification.hideAt + 260L) 1.0F - بف.INSTANCE.standardAccelerate((float)(now - notification.hideAt) / 260.0F) else 0.0F)
               )
         )
      }

   private fun compactText(value: String, maximumLength: Int): String {
      val normalized: java.lang.String = StringsKt.trim(Regex("\\s+").replace(value, " ")).toString()
      return if (normalized.length() <= maximumLength)
         normalized
         else
         "${StringsKt.trimEnd(StringsKt.take(normalized, RangesKt.coerceAtLeast(maximumLength + -1, 1))).toString()}…"
      }

   private fun remoteLevelColor(level: String): Color {
      val var10000: java.lang.String = level.toLowerCase(Locale.ROOT)
      when (var10000.hashCode()) {
         -1867169789 -> {
            if (var10000.equals("success")) {
               return Color(85, 255, 125)
            }
         }
         96784904 -> {
            if (var10000.equals("error")) {
               return Color(255, 90, 90)
            }
         }
         1124446108 -> {
            if (var10000.equals("warning")) {
               return Color(255, 190, 70)
            }
         }
         else -> {}
      }

      return Color(100, 180, 255)
   }

   private fun drawMessageSegments(notification: رن, segments: List<طإ>, x: Float, y: Float, size: Float, visibility: Float) {
      var segmentX: Float = 0.0F
      segmentX = x

      for (`element$iv` in segments) {
         val segment: طإ = `element$iv` as طإ
         var var10000: Color
         if ((`element$iv` as طإ).isAction) {
            var10000 = INSTANCE.remoteActionColor(notification.actionHovered)
         } else {
            var10000 = segment.color
            if (var10000 == null) {
               var10000 = طغ.INSTANCE.TITLE_COLOR
            }
         }

         رَ.INSTANCE.getGS_MEDIUM().priority(صؤ.HUD_TEXT).size(size).color(INSTANCE.withAlpha(var10000, visibility)).drawText(segment.text, segmentX, y)
         segmentX += جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), segment.text, size, 0.0F, 4, null)
      }
   }

   private fun renderNotification(notification: ظض, progress: Float, y: Float): Float {
      val var10000: Float
      if (notification is رخ) {
         var10000 = this.renderModuleStateNotification(notification as رخ, progress, y)
      } else {
         if (notification !is رن) {
            throw NoWhenBranchMatchedException()
         }

         var10000 = renderMessageNotification$default(this, notification as رن, progress, y, 0.0F, 8, null)
      }

      return var10000
   }

   public override fun onDisable() {
      notifications.clear()
      previewAnimation = ري(0.0F)
      draggable.width = 0.0F
      draggable.height = 0.0F
   }

   private fun sendChatFallback(segments: List<طإ>) {
      var var10000: MutableText = Text.empty()
      val message: MutableText = var10000

      for (`element$iv` in segments) {
         val segment: طإ = `element$iv` as طإ
         var10000 = Text.literal((`element$iv` as طإ).text)
         val var13: Color = segment.color
         if (var13 != null) {
            var10000.setStyle(Style.EMPTY.withColor(TextColor.fromRgb(var13.getRGB() and 16777215)))
         }

         message.append(var10000 as Text)
      }

      دإ.INSTANCE.sendClientMessage(message as Text)
   }

   public fun showMessage(module: دِ, icon: String, segments: List<طإ>) {
      if (!segments.isEmpty()) {
         val now: java.lang.Iterable = segments
         var var10000: Boolean
         if (segments is java.util.Collection && (segments as java.util.Collection).isEmpty()) {
            var10000 = true
         } else {
            run label92@{
               for (`$this$firstOrNull$iv` in now) {
                  if ((`$this$firstOrNull$iv` as طإ).text.length() != 0) {
                     var10000 = false
                     return@label92
                  }
               }

               var10000 = true
            }
         }

         if (!var10000) {
            if (!this.isEnabled()) {
               this.sendChatFallback(segments)
               return
            }

            val var14: Long = System.currentTimeMillis()
            val var20: java.lang.Iterable = CollectionsKt.asReversedMutable(notifications)
            val `element$iv`: java.util.Collection = ArrayList()

            for (`element$iv$iv` in var20) {
               if (`element$iv$iv` is رن) {
                  `element$iv`.add(`element$iv$iv`)
               }
            }

            val var21: java.util.Iterator = (`element$iv` as java.util.List).iterator()

            while (true) {
               if (!var21.hasNext()) {
                  var25 = null
                  break
               }

               val var22: Any = var21.next()
               if ((var22 as رن).moduleName == module.name && var14 < (var22 as رن).getHideAt() + 260L) {
                  var25 = var22
                  break
               }
            }

            val var15: رن = var25 as رن
            if (var25 as رن != null) {
               if (!(var15.segments == segments)) {
                  var15.previousSegments = var15.segments
                  var15.segments = CollectionsKt.toList(segments)
                  var15.textTransitionStartedAt = var14
               }

               this.refreshNotification(var15, var14)
               return
            }

            notifications.add(
               رن(module.name, icon, CollectionsKt.toList(segments), CollectionsKt.toList(segments), var14, var14 + 360L + 2000L, 0L, null, null, 448, null)
            )
            return
         }
      }
   }

   public fun showMessage(module: دِ, text: String) {
      this.showMessage(module, module.getCategory().icon, CollectionsKt.listOf(طإ(text, null, false, 6, null)))
   }

   private fun resolveDefaultPosition() {
      if (!defaultPositionResolved) {
         if (!draggable.hasStoredPosition) {
            draggable.snapTo(0.0F, (float)ضك.getMc().getWindow().getScaledHeight() / 2.0F + طغ.INSTANCE.scaled(20.0F))
         }

         defaultPositionResolved = true
      }
   }

   private fun renderOverlay(showPreview: Boolean) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:736)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial oxxxde/سِ.resolveDefaultPosition ()V
      // 004: getstatic oxxxde/سِ.previewAnimation Loxxxde/ري;
      // 007: iload 1
      // 008: ifeq 01c
      // 00b: invokestatic oxxxde/ضك.getMc ()Lnet/minecraft/client/MinecraftClient;
      // 00e: getfield net/minecraft/client/MinecraftClient.currentScreen Lnet/minecraft/client/gui/screen/Screen;
      // 011: instanceof net/minecraft/client/gui/screen/ChatScreen
      // 014: ifeq 01c
      // 017: fconst_1
      // 018: nop
      // 019: goto 01e
      // 01c: fconst_0
      // 01d: nop
      // 01e: ldc_w 80.0
      // 021: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 024: astore 3
      // 025: new oxxxde/جس
      // 028: dup
      // 029: aload 3
      // 02a: nop
      // 02b: invokespecial oxxxde/جس.<init> (Loxxxde/بف;)V
      // 02e: checkcast oxxxde/شل
      // 031: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 034: fstore 2
      // 035: iload 1
      // 036: ifeq 04d
      // 039: fload 2
      // 03a: ldc_w 0.01
      // 03d: fcmpl
      // 03e: ifle 04d
      // 041: aload 0
      // 042: getstatic oxxxde/سِ.draggable Loxxxde/ظذ;
      // 045: invokevirtual oxxxde/ظذ.getY ()F
      // 048: fload 2
      // 049: invokespecial oxxxde/سِ.renderPreview (FF)V
      // 04c: return
      // 04d: invokestatic java/lang/System.currentTimeMillis ()J
      // 050: lstore 3
      // 051: getstatic oxxxde/سِ.notifications Ljava/util/List;
      // 054: lload 3
      // 055: invokedynamic invoke (J)Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, oxxxde/سِ.renderOverlay$lambda$0 (JLoxxxde/ظض;)Z, (Loxxxde/ظض;)Ljava/lang/Boolean; ]
      // 05a: invokestatic kotlin/collections/CollectionsKt.removeAll (Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z
      // 05d: pop
      // 05e: getstatic oxxxde/سِ.notifications Ljava/util/List;
      // 061: invokeinterface java/util/List.isEmpty ()Z 1
      // 066: ifeq 07a
      // 069: getstatic oxxxde/سِ.draggable Loxxxde/ظذ;
      // 06c: fconst_0
      // 06d: nop
      // 06e: invokevirtual oxxxde/ظذ.setWidth (F)V
      // 071: getstatic oxxxde/سِ.draggable Loxxxde/ظذ;
      // 074: fconst_0
      // 075: nop
      // 076: invokevirtual oxxxde/ظذ.setHeight (F)V
      // 079: return
      // 07a: aload 0
      // 07b: invokespecial oxxxde/سِ.notificationHeight ()F
      // 07e: fstore 5
      // 080: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 083: ldc_w 4.0
      // 086: invokevirtual oxxxde/طغ.scaled (F)F
      // 089: fstore 6
      // 08b: getstatic oxxxde/طغ.INSTANCE Loxxxde/طغ;
      // 08e: ldc_w 15.0
      // 091: invokevirtual oxxxde/طغ.scaled (F)F
      // 094: fstore 7
      // 096: fconst_0
      // 097: nop
      // 098: fstore 8
      // 09a: getstatic oxxxde/سِ.notifications Ljava/util/List;
      // 09d: checkcast java/lang/Iterable
      // 0a0: astore 9
      // 0a2: bipush 0
      // 0a3: nop
      // 0a4: istore 10
      // 0a6: bipush 0
      // 0a7: nop
      // 0a8: istore 11
      // 0aa: aload 9
      // 0ac: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0b1: astore 12
      // 0b3: aload 12
      // 0b5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ba: ifeq 132
      // 0bd: aload 12
      // 0bf: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0c4: astore 13
      // 0c6: iload 11
      // 0c8: iinc 11 1
      // 0cb: istore 14
      // 0cd: iload 14
      // 0cf: ifge 0d5
      // 0d2: invokestatic kotlin/collections/CollectionsKt.throwIndexOverflow ()V
      // 0d5: iload 14
      // 0d7: aload 13
      // 0d9: checkcast oxxxde/ظض
      // 0dc: astore 15
      // 0de: istore 16
      // 0e0: bipush 0
      // 0e1: nop
      // 0e2: istore 17
      // 0e4: getstatic oxxxde/سِ.INSTANCE Loxxxde/سِ;
      // 0e7: aload 15
      // 0e9: lload 3
      // 0ea: invokespecial oxxxde/سِ.animationProgress (Loxxxde/ظض;J)F
      // 0ed: fstore 18
      // 0ef: iload 16
      // 0f1: i2f
      // 0f2: fload 5
      // 0f4: fload 6
      // 0f6: fadd
      // 0f7: fmul
      // 0f8: fstore 19
      // 0fa: getstatic oxxxde/سِ.INSTANCE Loxxxde/سِ;
      // 0fd: aload 15
      // 0ff: fload 19
      // 101: invokespecial oxxxde/سِ.animatedStackOffset (Loxxxde/ظض;F)F
      // 104: fstore 20
      // 106: getstatic oxxxde/سِ.draggable Loxxxde/ظذ;
      // 109: invokevirtual oxxxde/ظذ.getY ()F
      // 10c: fload 20
      // 10e: fadd
      // 10f: fload 7
      // 111: fconst_1
      // 112: nop
      // 113: fload 18
      // 115: fsub
      // 116: fmul
      // 117: fadd
      // 118: fstore 21
      // 11a: fload 8
      // 11c: getstatic oxxxde/سِ.INSTANCE Loxxxde/سِ;
      // 11f: aload 15
      // 121: fload 18
      // 123: fload 21
      // 125: invokespecial oxxxde/سِ.renderNotification (Loxxxde/ظض;FF)F
      // 128: invokestatic java/lang/Math.max (FF)F
      // 12b: fstore 8
      // 12d: nop
      // 12e: nop
      // 12f: goto 0b3
      // 132: nop
      // 133: getstatic oxxxde/سِ.draggable Loxxxde/ظذ;
      // 136: fload 8
      // 138: invokevirtual oxxxde/ظذ.setWidth (F)V
      // 13b: getstatic oxxxde/سِ.draggable Loxxxde/ظذ;
      // 13e: getstatic oxxxde/سِ.notifications Ljava/util/List;
      // 141: invokeinterface java/util/List.size ()I 1
      // 146: i2f
      // 147: fload 5
      // 149: fmul
      // 14a: getstatic oxxxde/سِ.notifications Ljava/util/List;
      // 14d: invokeinterface java/util/List.size ()I 1
      // 152: bipush 1
      // 153: nop
      // 154: isub
      // 155: i2f
      // 156: fload 6
      // 158: fmul
      // 159: fadd
      // 15a: invokevirtual oxxxde/ظذ.setHeight (F)V
      // 15d: return
   }

   private fun validatedRemoteAction(label: String?, url: String?): Pair<String, String>? {
      if (label != null) {
         val uri: java.lang.String = Regex("\\s+").replace(label, " ")
         if (uri != null) {
            val var11: java.lang.String = StringsKt.trim(uri).toString()
            if (var11 != null) {
               val var12: java.lang.String = if (var11.length() > 0 && var11.length() <= 32) var11 else null
               if (var12 != null) {
                  val var10000: URI = this.validatedRemoteUri(url)
                  if (var10000 == null) {
                     return null
                  }

                  return var12 to var10000.toASCIIString()
               }
            }
         }
      }

      return null
   }

   private fun withAlpha(color: Color, factor: Float): Color {
      return بح.INSTANCE.multiplyAlpha(color, RangesKt.coerceIn(factor, 0.0F, 1.0F))
   }

   @Commando
   public fun onOverlayRender(event: ثآ) {
      this.renderOverlay(true)
   }

   private fun animatedStackOffset(notification: ظض, target: Float): Float {
      if (!notification.stackOffsetInitialized) {
         notification.getStackOffsetAnimation().snap((double)target)
         notification.stackOffsetInitialized = true
      } else if (Math.abs(notification.getStackOffsetAnimation().toValue - (double)target) > 0.01) {
         notification.getStackOffsetAnimation().update()
         notification.getStackOffsetAnimation().run((double)target, 260L, رض.SINE_OUT)
      }

      notification.getStackOffsetAnimation().update()
      return notification.getStackOffsetAnimation().get()
   }

   private fun statusText(state: Boolean): String {
      return if (state) "включена" else "отключена"
   }

   public fun onRemoteNotificationClick(mouseX: Int, mouseY: Int, button: Int): Boolean {
      if (button == 0 && ضك.getMc().currentScreen is ChatScreen) {
         val now: Long = System.currentTimeMillis()
         val var10: java.util.Iterator = CollectionsKt.asReversedMutable(remoteNotifications).iterator()

         var var10000: Any
         while (true) {
            if (!var10.hasNext()) {
               var10000 = null
               break
            }

            val `element$iv`: Any = var10.next()
            if (now < (`element$iv` as رن).getHideAt()
               && (`element$iv` as رن).actionUrl != null
               && (`element$iv` as رن).actionWidth > 0.0F
               && mouseX >= (`element$iv` as رن).actionX
               && mouseX <= (`element$iv` as رن).actionX + (`element$iv` as رن).actionWidth
               && mouseY >= (`element$iv` as رن).actionY
               && mouseY <= (`element$iv` as رن).actionY + (`element$iv` as رن).actionHeight) {
               var10000 = (رن)`element$iv`
               break
            }
         }

         var10000 = var10000
         if (var10000 == null) {
            return false
         } else {
            val var15: URI = this.validatedRemoteUri(var10000.actionUrl)
            if (var15 == null) {
               return false
            } else {
               ضك.getMc()
                  .execute(
                     { 
                        // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
                        // java.lang.NullPointerException: Cannot invoke "java.util.List.stream()" because the return value of "org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getExprents()" is null
                        //   at org.vineflower.kotlin.expr.KNewExprent.lambda$toJava$0(KNewExprent.java:128)
                        //   at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:273)
                        //   at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1708)
                        //   at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
                        //   at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
                        //   at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:575)
                        //   at java.base/java.util.stream.AbstractPipeline.evaluateToArrayNode(AbstractPipeline.java:260)
                        //   at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:616)
                        //   at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:622)
                        //   at java.base/java.util.stream.ReferencePipeline.toList(ReferencePipeline.java:627)
                        //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:131)
                        //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
                        //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
                        //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
                     }
                  )
                  return true
            }
         }
      } else {
         return false
      }
   }

   private fun updateRemoteActionState(notification: رن, textX: Float, textY: Float, textSize: Float, visibility: Float) {
      val label: java.lang.String = notification.actionLabel
      if (label != null && notification.actionUrl != null) {
         val actionWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), label, textSize, 0.0F, 4, null)
         notification.actionX = textX + this.messageWidth(notification.segments, textSize) - actionWidth
         notification.actionY = textY
         notification.actionWidth = actionWidth
         notification.actionHeight = رَ.INSTANCE.getGS_MEDIUM().getMetrics().lineHeight * textSize
         val now: Long = System.currentTimeMillis()
         val mouseX: Float = (float)(ضك.getMc().mouse.getX() / ضك.getMc().getWindow().getScaleFactor())
         val mouseY: Float = (float)(ضك.getMc().mouse.getY() / ضك.getMc().getWindow().getScaleFactor())
         notification.actionHovered = ضك.getMc().currentScreen is ChatScreen
            && visibility > 0.4F
            && now < notification.getHideAt()
            && mouseX >= notification.actionX
            && mouseX <= notification.actionX + notification.actionWidth
            && mouseY >= notification.actionY
            && mouseY <= notification.actionY + notification.actionHeight
            if (notification.actionHovered) {
            notification.setHideAt(Math.max(notification.getHideAt(), now + 500L))
         }
      } else {
         notification.clearActionBounds()
      }
   }

   private fun renderPreview(y: Float, visibility: Float) {
      val textSize: Float = طغ.INSTANCE.scaled(7.5F)
      val iconSize: Float = طغ.INSTANCE.scaled(7.0F)
      val height: Float = طغ.INSTANCE.headerTextSize() + طغ.INSTANCE.margin() * 2.2F
      val horizontalPadding: Float = طغ.INSTANCE.scaled(8.0F)
      val dividerGap: Float = طغ.INSTANCE.scaled(5.0F)
      val dividerWidth: Float = طغ.INSTANCE.scaled(1.2F)
      val iconWidth: Float = جً.getWidth$default(رَ.INSTANCE.getICON(), "S", iconSize, 0.0F, 4, null)
      val width: Float = horizontalPadding * 2.0F
         + iconWidth
         + dividerGap * 2.0F
         + dividerWidth
         + جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), "Пример уведомления", textSize, 0.0F, 4, null)
         val x: Float = (ضك.getMc().getWindow().getScaledWidth() - width) / 2.0F
      ذر.INSTANCE
         .getBLURRED_RECT()
         .priority(صؤ.HUD_RECT)
         .color(this.withAlpha(طغ.INSTANCE.PANEL_COLOR, visibility))
         .mix(0.9F)
         .round(طغ.INSTANCE.scaled(6.0F))
         .draw(x, y, width, height)
         رَ.INSTANCE
         .getICON()
         .priority(صؤ.HUD_TEXT)
         .size(iconSize)
         .color(this.withAlpha(طغ.INSTANCE.TITLE_COLOR, visibility))
         .drawText("S", x + horizontalPadding, y + (height - رَ.INSTANCE.getICON().getMetrics().lineHeight * iconSize) / 2.0F)
         val dividerX: Float = x + horizontalPadding + iconWidth + dividerGap
      ذر.INSTANCE
         .getBLURRED_RECT()
         .priority(صؤ.HUD_RECT)
         .color(this.withAlpha(dividerColor, visibility))
         .mix(0.9F)
         .round(0.0F)
         .draw(x + horizontalPadding + iconWidth + dividerGap, y + (height - height / 3.5F) / 2.0F, dividerWidth, height / 3.5F)
         رَ.INSTANCE
         .getGS_MEDIUM()
         .priority(صؤ.HUD_TEXT)
         .size(textSize)
         .color(this.withAlpha(طغ.INSTANCE.TITLE_COLOR, visibility))
         .drawText(
            "Пример уведомления", dividerX + dividerWidth + dividerGap, y + (height - رَ.INSTANCE.getGS_MEDIUM().getMetrics().lineHeight * textSize) / 2.0F
         )
         draggable.width = width
      draggable.height = height
   }

   private fun stateColor(state: Boolean, alpha: Float): Color {
      return بح.INSTANCE.multiplyAlpha(if (state) enabledColor else disabledColor, RangesKt.coerceIn(alpha, 0.0F, 1.0F))
   }

   private fun renderMessageNotification(notification: رن, progress: Float, y: Float, centerX: Float = (float)ضك.getMc().getWindow().getScaledWidth() / 2.0F): Float {
      val textSize: Float = طغ.INSTANCE.scaled(7.5F)
      val iconSize: Float = طغ.INSTANCE.scaled(7.0F)
      val height: Float = this.notificationHeight()
      val horizontalPadding: Float = طغ.INSTANCE.scaled(8.0F)
      val dividerGap: Float = طغ.INSTANCE.scaled(5.0F)
      val dividerWidth: Float = طغ.INSTANCE.scaled(1.2F)
      val iconWidth: Float = جً.getWidth$default(رَ.INSTANCE.getICON(), notification.icon, iconSize, 0.0F, 4, null)
      val width: Float = this.animatedWidth(
         notification, horizontalPadding * 2.0F + iconWidth + dividerGap * 2.0F + dividerWidth + this.messageWidth(notification.segments, textSize)
      )
      val x: Float = centerX - width / 2.0F
      ذر.INSTANCE
         .getBLURRED_RECT()
         .priority(صؤ.HUD_RECT)
         .color(this.withAlpha(طغ.INSTANCE.PANEL_COLOR, progress))
         .mix(0.9F)
         .round(طغ.INSTANCE.scaled(6.0F))
         .draw(centerX - width / 2.0F, y, width, height)
         رَ.INSTANCE
         .getICON()
         .priority(صؤ.HUD_TEXT)
         .size(iconSize)
         .color(this.withAlpha(طغ.INSTANCE.TITLE_COLOR, progress))
         .drawText(notification.icon, x + horizontalPadding, y + (height - رَ.INSTANCE.getICON().getMetrics().lineHeight * iconSize) / 2.0F)
         val dividerX: Float = x + horizontalPadding + iconWidth + dividerGap
      ذر.INSTANCE
         .getBLURRED_RECT()
         .priority(صؤ.HUD_RECT)
         .color(this.withAlpha(dividerColor, progress))
         .mix(0.9F)
         .round(0.0F)
         .draw(x + horizontalPadding + iconWidth + dividerGap, y + (height - height / 3.5F) / 2.0F, dividerWidth, height / 3.5F)
         val textX: Float = dividerX + dividerWidth + dividerGap
      val textY: Float = y + (height - رَ.INSTANCE.getGS_MEDIUM().getMetrics().lineHeight * textSize) / 2.0F
      this.updateRemoteActionState(notification, textX, textY, textSize, progress)
      this.drawMessageText(notification, textX, textY, textSize, progress)
      return width
   }

   public fun renderRemoteNotifications(event: ثآ) {
      val now: Long = System.currentTimeMillis()
      CollectionsKt.removeAll(remoteNotifications, { it: رن ->
         `$now` >= it.getHideAt() + 260L
      })
      if (!remoteNotifications.isEmpty()) {
         val height: Float = this.notificationHeight()
         val gap: Float = طغ.INSTANCE.scaled(4.0F)
         val travel: Float = طغ.INSTANCE.scaled(14.0F)
         val watermarkBounds: ط = تأ.INSTANCE.currentBounds()
         val mediaBounds: ذْ = بط.INSTANCE.attachedBounds()
         var var10000: Float
         if (mediaBounds != null) {
            var10000 = mediaBounds.centerX
         } else {
            val `$this$forEachIndexed$iv`: java.lang.Float = watermarkBounds.centerX
            val `$i$f$forEachIndexed`: Float = `$this$forEachIndexed$iv`.floatValue()
            val var33: java.lang.Float = if (تأ.INSTANCE.isEnabled()) `$this$forEachIndexed$iv` else null
            var10000 = var33 ?: ضك.getMc().getWindow().getScaledWidth() / 2.0F
         }

         val centerX: Float = var10000
         if (mediaBounds != null) {
            var10000 = mediaBounds.y + mediaBounds.height
         } else {
            val var27: java.lang.Float = watermarkBounds.y + watermarkBounds.height
            val var30: Float = var27.floatValue()
            val var35: java.lang.Float = if (تأ.INSTANCE.isEnabled()) var27 else null
            var10000 = var35 ?: 0.0F
         }

         val baseY: Float = var10000 + طغ.INSTANCE.scaled(5.0F)
         val var25: java.lang.Iterable = remoteNotifications
         var var31: Int = 0

         for (`item$iv` in var25) {
            val var17: Int = var31++
            if (var17 < 0) {
               CollectionsKt.throwIndexOverflow()
            }

            val progress: Float = INSTANCE.animationProgress(`item$iv` as رن, now)
            INSTANCE.renderMessageNotification(
               `item$iv` as رن,
               progress,
               baseY + INSTANCE.animatedStackOffset(`item$iv` as رن, (float)var17 * (height + gap)) - travel * (1.0F - progress),
               centerX
            )
         }
      }
   }

   private fun messageTransitionProgress(notification: رن): Float {
      if (notification.textTransitionStartedAt == 0L) {
         return 1.0F
      } else {
         val linear: Float = RangesKt.coerceIn((float)(System.currentTimeMillis() - notification.textTransitionStartedAt) / 220.0F, 0.0F, 1.0F)
         if (linear >= 1.0F) {
            notification.textTransitionStartedAt = 0L
            notification.previousSegments = notification.segments
            return 1.0F
         } else {
            return بف.INSTANCE.standard(linear)
         }
      }
   }

   private fun notificationHeight(): Float {
      return طغ.INSTANCE.headerTextSize() + طغ.INSTANCE.margin() * 2.2F
   }

   private fun refreshNotification(notification: ظض, now: Long) {
      if (now >= notification.hideAt) {
         notification.shownAt = now - 360L
      }

      notification.hideAt = Math.max(now + 2000L, notification.shownAt + 360L + 2000L)
   }

   private fun remoteActionColor(hovered: Boolean): Color {
      return if (hovered) Color(150, 215, 255) else Color(100, 180, 255)
   }

   private fun drawStatus(notification: رخ, x: Float, y: Float, size: Float, visibility: Float) {
      val transition: Float = this.statusTransitionProgress(notification)
      val shift: Float = طغ.INSTANCE.scaled(2.0F)
      if (transition < 0.999F) {
         رَ.INSTANCE
            .getGS_MEDIUM()
            .priority(صؤ.HUD_TEXT)
            .size(size)
            .color(this.stateColor(notification.previousEnabled, visibility * (1.0F - transition)))
            .drawText(this.statusText(notification.previousEnabled), x, y - shift * transition)
         }

      رَ.INSTANCE
         .getGS_MEDIUM()
         .priority(صؤ.HUD_TEXT)
         .size(size)
         .color(this.stateColor(notification.enabled, visibility * transition))
         .drawText(this.statusText(notification.enabled), x, y + shift * (1.0F - transition))
      }

   private fun animatedWidth(notification: ظض, target: Float): Float {
      if (!notification.widthInitialized) {
         notification.getWidthAnimation().snap((double)target)
         notification.widthInitialized = true
      } else if (Math.abs(notification.getWidthAnimation().toValue - (double)target) > 0.01) {
         notification.getWidthAnimation().update()
         notification.getWidthAnimation().run((double)target, 220L, رض.SINE_OUT)
      }

      notification.getWidthAnimation().update()
      return RangesKt.coerceAtLeast(notification.getWidthAnimation().get(), طغ.INSTANCE.scaled(1.0F))
   }

   private fun renderModuleStateNotification(notification: رخ, progress: Float, y: Float): Float {
      val textSize: Float = طغ.INSTANCE.scaled(7.5F)
      val height: Float = this.notificationHeight()
      val horizontalPadding: Float = طغ.INSTANCE.scaled(8.0F)
      val dividerGap: Float = طغ.INSTANCE.scaled(5.0F)
      val dividerWidth: Float = طغ.INSTANCE.scaled(1.2F)
      val toggleWidth: Float = height * 0.38F * 1.7F
      val toggleContainerHeight: Float = height * 0.38F / 0.55F
      val prefix: java.lang.String = "Функция ${notification.moduleName} "
      val status: java.lang.String = this.statusText(notification.enabled)
      val prefixWidth: Float = جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), prefix, textSize, 0.0F, 4, null)
      val width: Float = this.animatedWidth(
         notification,
         horizontalPadding * 2.0F
            + toggleWidth
            + dividerGap * 2.0F
            + dividerWidth
            + prefixWidth
            + جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), status, textSize, 0.0F, 4, null)
      )
      val x: Float = (ضك.getMc().getWindow().getScaledWidth() - width) / 2.0F
      val corner: Float = طغ.INSTANCE.scaled(6.0F)
      val textColor: Color = this.withAlpha(طغ.INSTANCE.TITLE_COLOR, progress)
      ذر.INSTANCE
         .getBLURRED_RECT()
         .priority(صؤ.HUD_RECT)
         .color(this.withAlpha(طغ.INSTANCE.PANEL_COLOR, progress))
         .mix(0.9F)
         .round(corner)
         .draw(x, y, width, height)
         notification.getToggleAnimation().update()
      سأ.INSTANCE
         .render(
            x + horizontalPadding,
            y + (height - toggleContainerHeight) / 2.0F,
            toggleWidth,
            toggleContainerHeight,
            0.0F,
            RangesKt.coerceIn(notification.getToggleAnimation().get(), 0.0F, 1.0F),
            progress,
            1.0F,
            صؤ.HUD_RECT
         )
         val dividerX: Float = x + horizontalPadding + toggleWidth + dividerGap
      ذر.INSTANCE
         .getBLURRED_RECT()
         .priority(صؤ.HUD_RECT)
         .color(this.withAlpha(dividerColor, progress))
         .mix(0.9F)
         .round(0.0F)
         .draw(x + horizontalPadding + toggleWidth + dividerGap, y + (height - height / 3.5F) / 2.0F, dividerWidth, height / 3.5F)
         val textY: Float = y + (height - رَ.INSTANCE.getGS_MEDIUM().getMetrics().lineHeight * textSize) / 2.0F
      val textX: Float = dividerX + dividerWidth + dividerGap
      رَ.INSTANCE.getGS_MEDIUM().priority(صؤ.HUD_TEXT).size(textSize).color(textColor).drawText(prefix, dividerX + dividerWidth + dividerGap, textY)
      this.drawStatus(notification, textX + prefixWidth, textY, textSize, progress)
      return width
   }

   private fun statusTransitionProgress(notification: رخ): Float {
      if (notification.statusTransitionStartedAt == 0L) {
         return 1.0F
      } else {
         val linear: Float = RangesKt.coerceIn((float)(System.currentTimeMillis() - notification.statusTransitionStartedAt) / 220.0F, 0.0F, 1.0F)
         if (linear >= 1.0F) {
            notification.statusTransitionStartedAt = 0L
            notification.previousEnabled = notification.enabled
            return 1.0F
         } else {
            return بف.INSTANCE.standard(linear)
         }
      }
   }

   private fun drawMessageText(notification: رن, x: Float, y: Float, size: Float, visibility: Float) {
      val transition: Float = this.messageTransitionProgress(notification)
      val shift: Float = طغ.INSTANCE.scaled(2.0F)
      if (transition < 0.999F) {
         this.drawMessageSegments(notification, notification.previousSegments, x, y - shift * transition, size, visibility * (1.0F - transition))
      }

      this.drawMessageSegments(notification, notification.segments, x, y + shift * (1.0F - transition), size, visibility * transition)
   }

   private fun validatedRemoteUri(url: String?): URI? {
      if (url != null && url.length() <= 2048) {
         val var2: سِ = this

         var `$this$validatedRemoteUri_u24lambda_u240`: Any
         try {
            `$this$validatedRemoteUri_u24lambda_u240` = var2
            val var5: URI = URI.create(url)
            if (!StringsKt.equals(var5.getScheme(), "https", true)) {
               throw IllegalArgumentException("Failed requirement.".toString())
            }

            val var9: java.lang.CharSequence = var5.getHost()
            if (var9 == null || StringsKt.isBlank(var9)) {
               throw IllegalArgumentException("Failed requirement.".toString())
            }

            if (var5.getUserInfo() != null) {
               throw IllegalArgumentException("Failed requirement.".toString())
            }

            `$this$validatedRemoteUri_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(var5)
         } catch (var10: java.lang.Throwable) {
            `$this$validatedRemoteUri_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var10))
         }

         return (if (isFailure) null else `$this$validatedRemoteUri_u24lambda_u240`) as URI
      } else {
         return null
      }
   }

   private fun messageWidth(segments: List<طإ>, size: Float): Float {
      val var3: java.lang.Iterable = segments
      var var4: Double = 0.0

      for (var7 in var3) {
         var4 += جً.getWidth$default(رَ.INSTANCE.getGS_MEDIUM(), (var7 as طإ).text, size, 0.0F, 4, null)
      }

      return (float)var4
   }

   public fun showModuleState(module: دِ, state: Boolean) {
      if (this.isEnabled()) {
         val now: Long = System.currentTimeMillis()
         val `$this$showModuleState_u24lambda_u241`: java.lang.Iterable = CollectionsKt.asReversedMutable(notifications)
         val var9: java.util.Collection = ArrayList()

         for (`element$iv$iv` in `$this$showModuleState_u24lambda_u241`) {
            if (`element$iv$iv` is رخ) {
               var9.add(`element$iv$iv`)
            }
         }

         val var17: java.util.Iterator = (var9 as java.util.List).iterator()

         var var10000: Any
         while (true) {
            if (!var17.hasNext()) {
               var10000 = null
               break
            }

            val var19: Any = var17.next()
            if ((var19 as رخ).moduleName == module.name && now < (var19 as رخ).getHideAt() + 260L) {
               var10000 = var19
               break
            }
         }

         val existing: رخ = var10000 as رخ
         if (var10000 as رخ != null) {
            existing.getToggleAnimation().update()
            existing.previousEnabled = existing.enabled
            existing.enabled = state
            existing.statusTransitionStartedAt = now
            this.refreshNotification(existing, now)
            existing.getToggleAnimation().run(if (state) 1.0 else 0.0, 220L, رض.SINE_OUT)
         } else {
            val var16: سط = سط()
            var16.snap(if (state) 0.0 else 1.0)
            var16.run(if (state) 1.0 else 0.0, 220L, رض.SINE_OUT)
            notifications.add(رخ(module.name, state, now, now + 360L + 2000L, var16, state, 0L, 64, null))
         }
      }
   }

   public fun showRemoteNotification(id: Long, title: String, message: String, level: String, actionLabel: String? = null, actionUrl: String? = null) {
      var normalizedTitle: java.lang.String
      var action: Pair
      var var18: Int
      run label67@{
         normalizedTitle = this.compactText(title, 28)
         action = this.validatedRemoteAction(actionLabel, actionUrl)
         if (action != null) {
            val var10000: java.lang.String = action.first as java.lang.String
            if (var10000 != null) {
               var18 = var10000.length() + 3
               return@label67
            }
         }

         var18 = 0
      }

      val normalizedMessage: java.lang.String = this.compactText(message, RangesKt.coerceAtLeast(96 - normalizedTitle.length() - var18, 32))
      if (normalizedTitle.length() != 0 && normalizedMessage.length() != 0) {
         val now: java.util.List = CollectionsKt.createListBuilder()
         now.add(طإ(normalizedTitle, INSTANCE.remoteLevelColor(level), false, 4, null))
         now.add(طإ(": ", null, false, 6, null))
         now.add(طإ(normalizedMessage, null, false, 6, null))
         if (action != null) {
            now.add(طإ(" · ", null, false, 6, null))
            now.add(طإ(action.first as java.lang.String, null, true, 2, null))
         }

         val segments: java.util.List = CollectionsKt.build(now)
         ضك.getMc().getSoundManager().play(PositionedSoundInstance.ui(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F) as SoundInstance)
         val var17: Long = System.currentTimeMillis()
         CollectionsKt.removeAll(remoteNotifications, { it: رن ->
            `$now` >= it.getHideAt() + 260L
         })

         while (remoteNotifications.size() >= 5) {
            remoteNotifications.removeFirst()
         }

         remoteNotifications.add(
            رن(
               "RemoteNotification:$id",
               "S",
               segments,
               segments,
               var17,
               var17 + 360L + (if (action == null) 6000L else 10000L),
               0L,
               if (action != null) action.first as java.lang.String else null,
               if (action != null) action.second as java.lang.String else null,
               64,
               null
            )
         )
      }
   }
}
