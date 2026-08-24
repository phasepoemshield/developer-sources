package kotakbaz.rain.client.waypoint

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import java.awt.Color
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Locale
import java.util.Map.Entry
import kotakbaz.rain.client.util.render.display.BlurredRectRenderer
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.module.modules.render.WayPointModule
import kotlin.enums.EnumEntries
import kotlin.math.MathKt
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.render.Camera
import net.minecraft.client.render.GameRenderer
import net.minecraft.entity.Entity
import net.minecraft.entity.attribute.EntityAttributes
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.MathHelper
import net.minecraft.util.math.RotationAxis
import net.minecraft.util.math.Vec3d
import org.joml.Quaternionf
import org.joml.Quaternionfc
import org.joml.Vector3f
import org.joml.Vector3fc
import org.joml.Vector4f
import oxxxde.بح
import oxxxde.تف
import oxxxde.جً
import oxxxde.حح
import oxxxde.ذر
import oxxxde.رَ
import oxxxde.شط
import oxxxde.ضك
import oxxxde.طث
import oxxxde.طغ
import oxxxde.ه

// $VF: Compiled from heavy
public object WayPointManager : ه {
   private final val bobXRotation: Quaternionf = Quaternionf()
   private final val projectionResult: Vector3f = Vector3f()
   private final val bobTranslation: Vector3f = Vector3f()
   public final val filePath: Path
   private const val BIND_KEY: String = "bind"
   private final var lastRenderPlayerAge: Int = Integer.MIN_VALUE
   private final var previousSpeed: Float
   private final val cameraRotation: Quaternionf = Quaternionf()
   private const val ROOT_KEY: String = "waypoints"
   @JvmStatic
   private WayPointManager.ScreenPoint projectedPoint = WayPointManager.ScreenPoint(0.0F, 0.0F, 3, null);
   private final var horizontalSpeed: Float
   private const val DEFAULT_QUICK_PREFIX: String = "Точка"
   private final val wayPointsByName: LinkedHashMap<String, تف> = LinkedHashMap()
   private final val sectionRound: Vector4f = Vector4f()
   private final val bobZRotation: Quaternionf = Quaternionf()
   private final var legacyBindKey: Int = -1
   private final val gson: Gson = GsonBuilder().setPrettyPrinting().create()
   private final var lastRenderPartialTicks: Float = java.lang.Float.NaN

   fun put(pos: java.lang.String, name: Boolean, event: BlockPos): WayPointManager.PutResult {
      val var10000: java.lang.String = this.sanitizeName(name)
      if (var10000 == null) {
         WayPointManager.PutResult.INVALID_NAME
      } else {
         val normalized: java.lang.String = this.normalize(var10000)
         val wayPoint: WayPointManager.WayPoint = WayPointManager.WayPoint(var10000, event, pos.getX(), pos.getY(), pos.getZ())
         val previous: WayPointManager.WayPoint = wayPointsByName.get(normalized)
         if (previous == wayPoint) {
            WayPointManager.PutResult.UNCHANGED
         } else {
            wayPointsByName.put(normalized, wayPoint)
            if (!this.save()) {
               if (previous == null) {
                  wayPointsByName.remove(normalized)
               } else {
                  wayPointsByName.put(normalized, previous)
               }

               WayPointManager.PutResult.SAVE_FAILED
            } else {
               if (previous == null) WayPointManager.PutResult.ADDED else WayPointManager.PutResult.REPLACED
            }
         }
      }
   }

   private fun loadWayPoints(array: JsonArray) {
      for (`element$iv` in array) {
         val element: JsonElement = `element$iv` as JsonElement
         val var11: WayPointManager.WayPoint
         if ((`element$iv` as JsonElement).isJsonPrimitive()) {
            val var10000: WayPointManager = INSTANCE
            val var10001: java.lang.String = element.getAsString()
            var11 = var10000.deserialize(var10001)
         } else if (element.isJsonObject()) {
            val var12: WayPointManager = INSTANCE
            val var13: JsonObject = element.getAsJsonObject()
            var11 = var12.deserialize(var13)
         } else {
            var11 = null
         }

         if (var11 != null) {
            wayPointsByName.putIfAbsent(INSTANCE.normalize(var11.name), var11)
         }
      }
   }

   private fun deserialize(json: JsonObject): تف? {
      val var10001: JsonElement = json.get("name")
      val var10000: java.lang.String = this.sanitizeName(if (var10001 != null) var10001.getAsString() else null)
      if (var10000 == null) {
         return null
      } else {
         val var7: JsonElement = json.get("event")
         val event: Boolean = var7 != null && var7.getAsBoolean()
         val var8: JsonElement = json.get("x")
         if (var8 != null) {
            val x: Int = var8.getAsInt()
            val var9: JsonElement = json.get("y")
            label38@
            if (var9 != null) {
               val y: Int = var9.getAsInt()
               val var10: JsonElement = json.get("z")
               return if (var10 != null) WayPointManager.WayPoint(var10000, event, x, y, var10.getAsInt()) else null
            } else {
               return null
            }
         } else {
            return null
         }
      }
   }

   fun add(event: java.lang.String, name: Boolean, pos: BlockPos): WayPointManager.AddResult {
      val var10000: java.lang.String = this.sanitizeName(name)
      if (var10000 == null) {
         WayPointManager.AddResult.INVALID_NAME
      } else {
         val normalized: java.lang.String = this.normalize(var10000)
         if (wayPointsByName.containsKey(normalized)) {
            WayPointManager.AddResult.ALREADY_EXISTS
         } else {
            wayPointsByName.put(normalized, WayPointManager.WayPoint(var10000, event, pos.getX(), pos.getY(), pos.getZ()))
            if (!this.save()) {
               wayPointsByName.remove(normalized)
               WayPointManager.AddResult.SAVE_FAILED
            } else {
               WayPointManager.AddResult.ADDED
            }
         }
      }
   }

   private fun formatDistance(distance: Double, wayPoint: تف): String {
      val displayValue: Int = MathKt.roundToInt((double)MathKt.roundToInt(distance * 10.0) / 10.0)
      if (wayPoint.cachedDistanceValue != displayValue) {
         wayPoint.cachedDistanceValue = displayValue
         wayPoint.cachedDistanceText = java.lang.String.valueOf(displayValue)
      }

      return wayPoint.cachedDistanceText
   }

   private fun deserialize(serialized: String): تف? {
      val parts: java.util.List = StringsKt.split$default(serialized, arrayOf(","), false, 0, 6, null)
      if (parts.size() != 5) {
         return null
      } else {
         val var9: java.lang.String = this.sanitizeName(parts.get(0) as java.lang.String)
         if (var9 == null) {
            return null
         } else {
            val event: Boolean = java.lang.Boolean.parseBoolean(parts.get(1) as java.lang.String)
            val var10: Int = StringsKt.toIntOrNull(parts.get(2) as java.lang.String)
            if (var10 != null) {
               val x: Int = var10
               val var11: Int = StringsKt.toIntOrNull(parts.get(3) as java.lang.String)
               label31@
               if (var11 != null) {
                  val y: Int = var11
                  val var12: Int = StringsKt.toIntOrNull(parts.get(4) as java.lang.String)
                  return if (var12 != null) WayPointManager.WayPoint(var9, event, x, y, var12) else null
               } else {
                  return null
               }
            } else {
               return null
            }
         }
      }
   }

   private fun iconFor(wayPoint: تف): String {
      return wayPoint.hudIcon
   }

   private fun centeredTopOffset(font: جً, size: Float, containerHeight: Float): Float {
      return (containerHeight - font.getHeight(size)) * 0.5F
   }

   public fun legacyBindKey(): Int {
      return legacyBindKey
   }

   private fun distanceTo(playerX: Double, playerY: Double, playerZ: Double, wayPoint: تف): Double {
      val dx: Double = playerX - wayPoint.x
      val dy: Double = playerY - wayPoint.y
      val dz: Double = playerZ - wayPoint.z
      return Math.sqrt(dx * dx + dy * dy + dz * dz)
   }

   public fun isValidName(name: String?): Boolean {
      return this.sanitizeName(name) != null
   }

   public fun rename(oldName: String?, newName: String?): شط {
      var var10000: java.lang.String = this.sanitizeName(oldName)
      if (var10000 == null) {
         return WayPointManager.RenameResult.INVALID_NAME
      } else {
         var10000 = this.sanitizeName(newName)
         if (var10000 == null) {
            return WayPointManager.RenameResult.INVALID_NAME
         } else {
            val oldNormalized: java.lang.String = this.normalize(var10000)
            val newNormalized: java.lang.String = this.normalize(var10000)
            val var33: WayPointManager.WayPoint = wayPointsByName.get(oldNormalized)
            if (var33 == null) {
               return WayPointManager.RenameResult.NOT_FOUND
            } else if (oldNormalized == newNormalized) {
               if (var33.name == var10000) {
                  return WayPointManager.RenameResult.UNCHANGED
               } else {
                  wayPointsByName.put(oldNormalized, WayPointManager.WayPoint.copy$default(var33, var10000, false, 0, 0, 0, 30, null))
                  if (!this.save()) {
                     wayPointsByName.put(oldNormalized, var33)
                     return WayPointManager.RenameResult.SAVE_FAILED
                  } else {
                     return WayPointManager.RenameResult.RENAMED
                  }
               }
            } else if (wayPointsByName.containsKey(newNormalized)) {
               return WayPointManager.RenameResult.ALREADY_EXISTS
            } else {
               val snapshot: LinkedHashMap = LinkedHashMap<>(wayPointsByName)
               val renamed: WayPointManager.WayPoint = WayPointManager.WayPoint.copy$default(var33, var10000, false, 0, 0, 0, 30, null)
               val var34: java.util.Set = snapshot.entrySet()
               val `$this$mapTo$iv$iv`: java.lang.Iterable = var34
               val `element$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var34, 10))

               for (key in `$this$mapTo$iv$iv`) {
                  val value: Entry = key as Entry
                  val keyx: java.lang.String = value.getKey() as java.lang.String
                  `element$iv`.add(if (keyx == oldNormalized) newNormalized to renamed else keyx to value.getValue() as WayPointManager.WayPoint)
               }

               val reorderedEntries: java.util.List = `element$iv` as java.util.List
               wayPointsByName.clear()

               for (var27 in reorderedEntries) {
                  wayPointsByName.put((var27 as Pair).component1() as java.lang.String, (var27 as Pair).component2() as WayPointManager.WayPoint)
               }

               if (!this.save()) {
                  wayPointsByName.clear()
                  wayPointsByName.putAll(snapshot)
                  return WayPointManager.RenameResult.SAVE_FAILED
               } else {
                  return WayPointManager.RenameResult.RENAMED
               }
            }
         }
      }
   }

   public fun remove(name: String?): حح {
      val var10000: java.lang.String = this.sanitizeName(name)
      if (var10000 == null) {
         return WayPointManager.RemoveResult.INVALID_NAME
      } else {
         val normalized: java.lang.String = this.normalize(var10000)
         val var5: WayPointManager.WayPoint = wayPointsByName.remove(normalized)
         if (var5 == null) {
            return WayPointManager.RemoveResult.NOT_FOUND
         } else if (!this.save()) {
            wayPointsByName.put(normalized, var5)
            return WayPointManager.RemoveResult.SAVE_FAILED
         } else {
            return WayPointManager.RemoveResult.REMOVED
         }
      }
   }

   public fun createQuickWaypoint(): تف? {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         return null
      } else {
         val name: java.lang.String = this.nextQuickWaypointName()
         val var10003: BlockPos = var10000.getBlockPos()
         return if (this.add(name, false, var10003) != WayPointManager.AddResult.ADDED) null else wayPointsByName.get(this.normalize(name))
      }
   }

   @JvmStatic
   fun {
      val var1: Path = Paths.get(System.getProperty("user.dir"), "Rain", "other", "way.json")
      filePath = var1
   }

   public fun renderHud(partialTicks: Float) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         val player: ClientPlayerEntity = var10000
         if (WayPointModule.INSTANCE.showWaypoints.getValue()) {
            if (!wayPointsByName.isEmpty()) {
               if (var10000.age != lastRenderPlayerAge || partialTicks != lastRenderPartialTicks) {
                  lastRenderPlayerAge = var10000.age
                  lastRenderPartialTicks = partialTicks
                  val var79: GameRenderer = ضك.getMc().gameRenderer
                  val camera: Camera = طث.getCamera(var79)
                  val var80: Quaternionf = RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getCameraYaw())
                  val var81: Quaternionf = RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch())
                  var80.mul(var81 as Quaternionfc, cameraRotation).conjugate()
                  val fov: Double = ضك.getMc().gameRenderer.getFov(camera, partialTicks, true)
                  val halfWidth: Float = ضك.getMc().getWindow().getScaledWidth() / 2.0F
                  val halfHeight: Float = ضك.getMc().getWindow().getScaledHeight() / 2.0F
                  val projectionTan: Double = Math.tan(Math.toRadians(fov / 2.0))
                  val height: Float = طغ.INSTANCE.scaled(24.0F)
                  val corner: Float = طغ.INSTANCE.scaled(6.0F)
                  val sectionCorner: Float = طغ.INSTANCE.scaled(5.5F)
                  val outerPaddingX: Float = طغ.INSTANCE.scaled(5.0F)
                  val iconGap: Float = طغ.INSTANCE.scaled(4.0F)
                  val sectionGap: Float = طغ.INSTANCE.scaled(4.5F)
                  val iconSize: Float = طغ.INSTANCE.scaled(10.0F)
                  val nameLayoutSize: Float = طغ.INSTANCE.scaled(8.4F)
                  val distanceValueLayoutSize: Float = طغ.INSTANCE.scaled(8.9F)
                  val distanceUnitLayoutSize: Float = طغ.INSTANCE.scaled(6.2F)
                  val nameSize: Float = طغ.INSTANCE.scaled(7.2F)
                  val distanceValueSize: Float = طغ.INSTANCE.scaled(7.5F)
                  val distanceUnitSize: Float = طغ.INSTANCE.scaled(5.4F)
                  val badgeGap: Float = طغ.INSTANCE.scaled(3.0F)
                  val badgeCorner: Float = طغ.INSTANCE.scaled(3.0F)
                  val badgeBorder: Float = طغ.INSTANCE.scaled(1.0F)
                  val badgeInnerGap: Float = طغ.INSTANCE.scaled(1.2F)
                  val distanceUnitText: java.lang.String = "m"
                  val distanceUnitLayoutWidth: Float = Font.getWidth$default(رَ.INSTANCE.GS_REGULAR, "m", distanceUnitLayoutSize, 0.0F, 4, null)
                  val distanceUnitWidth: Float = Font.getWidth$default(رَ.INSTANCE.GS_REGULAR, "m", distanceUnitSize, 0.0F, 4, null)
                  val badgeTextHeight: Float = Math.max(
                     رَ.INSTANCE.GS_MEDIUM.getHeight(distanceValueLayoutSize), رَ.INSTANCE.GS_REGULAR.getHeight(distanceUnitLayoutSize)
                  )
                  val dividerWidth: Float = طغ.INSTANCE.rowDividerWidth()
                  val dividerHeight: Float = height * 0.48F

                  for (var82 in wayPointsByName.values()) {
                     val wayPoint: WayPointManager.WayPoint = var82 as WayPointManager.WayPoint
                     val var83: WayPointManager.ScreenPoint = this.project(
                        camera, partialTicks, var82 as WayPointManager.WayPoint, projectionTan, halfWidth, halfHeight
                     )
                     if (var83 != null) {
                        val distance: Double = this.distanceTo(player.getX(), player.getY(), player.getZ(), wayPoint)
                        val alpha: Float = WayPointModule.INSTANCE.waypointAlphaByDistance(distance)
                        if (!(alpha <= 0.0F)) {
                           val icon: java.lang.String = this.iconFor(wayPoint)
                           val distanceValueText: java.lang.String = this.formatDistance(distance, wayPoint)
                           val iconWidth: Float = wayPoint.iconWidth(icon, iconSize)
                           val nameWidth: Float = wayPoint.nameWidth(nameLayoutSize)
                           val renderedNameWidth: Float = Font.getWidth$default(رَ.INSTANCE.GS_MEDIUM, wayPoint.name, nameSize, 0.0F, 4, null)
                           val distanceValueLayoutWidth: Float = wayPoint.distanceWidth(distanceValueText, distanceValueLayoutSize)
                           val distanceValueWidth: Float = wayPoint.distanceWidth(distanceValueText, distanceValueSize)
                           val badgeTextWidth: Float = distanceValueLayoutWidth + badgeInnerGap + distanceUnitLayoutWidth
                           val renderedBadgeTextWidth: Float = distanceValueWidth + badgeInnerGap + distanceUnitWidth
                           val badgeWidth: Float = badgeTextWidth + badgeGap * 2.0F
                           val badgeHeight: Float = badgeTextHeight + badgeGap * 2.0F
                           val sectionInset: Float = (height - (badgeTextHeight + badgeGap * 2.0F)) * 0.5F
                           val rightSectionWidth: Float = badgeWidth + (height - (badgeTextHeight + badgeGap * 2.0F)) * 0.5F * 2.0F
                           val width: Float = outerPaddingX
                              + iconWidth
                              + iconGap
                              + nameWidth
                              + sectionGap
                              + (badgeWidth + (height - (badgeTextHeight + badgeGap * 2.0F)) * 0.5F * 2.0F)
                              + outerPaddingX
                              val x: Float = var83.x
                              - (
                                    outerPaddingX
                                       + iconWidth
                                       + iconGap
                                       + nameWidth
                                       + sectionGap
                                       + (badgeWidth + (height - (badgeTextHeight + badgeGap * 2.0F)) * 0.5F * 2.0F)
                                       + outerPaddingX
                                 )
                                 * 0.5F
                                 val y: Float = var83.y - height * 0.5F
                           val panelColor: Color = this.withAlpha(طغ.INSTANCE.PANEL_COLOR, alpha)
                           val sectionColor: Color = this.withAlpha(طغ.INSTANCE.HEADER_COLOR, alpha)
                           val dividerColor: Color = بح.INSTANCE.setAlpha(طغ.INSTANCE.HEADER_COLOR, 0.1F * alpha)
                           val badgeColor: Color = بح.INSTANCE.setAlpha(طغ.INSTANCE.HEADER_COLOR, 0.2F * alpha)
                           val badgeBorderColor: Color = بح.INSTANCE.setAlpha(طغ.INSTANCE.HEADER_COLOR, 0.1F * alpha)
                           val iconColor: Color = this.withAlpha(طغ.INSTANCE.TITLE_COLOR, alpha)
                           val titleColor: Color = this.withAlpha(طغ.INSTANCE.TITLE_COLOR, alpha)
                           val valueColor: Color = this.withAlpha(طغ.INSTANCE.TITLE_COLOR, alpha)
                           val unitColor: Color = this.withAlpha(طغ.INSTANCE.VALUE_COLOR, alpha)
                           val sectionX: Float = x + width - rightSectionWidth
                           val leftSectionWidth: Float = x + width - rightSectionWidth - x
                           val badgeX: Float = x + width - rightSectionWidth + sectionInset
                           val badgeY: Float = y + (height - badgeHeight) * 0.5F
                           ذر.INSTANCE.BLURRED_RECT.priority(ClientRenderPipeline.HUD_RECT).draw(x, y, width, height, corner, panelColor, 0.9F)
                           val var84: BlurredRectRenderer = ذر.INSTANCE.BLURRED_RECT.priority(ClientRenderPipeline.HUD_RECT).color(sectionColor).mix(0.9F)
                           val var10001: Vector4f = sectionRound.set(sectionCorner, 0.0F, sectionCorner, 0.0F)
                           var84.round(var10001).draw(x, y, leftSectionWidth, height)
                           ذر.INSTANCE.BLURRED_RECT
                              .priority(ClientRenderPipeline.HUD_RECT)
                              .color(dividerColor)
                              .mix(0.9F)
                              .round(dividerWidth)
                              .draw(sectionX, y + (height - dividerHeight) * 0.5F, dividerWidth, dividerHeight)
                              ذر.INSTANCE.BLURRED_RECT
                              .priority(ClientRenderPipeline.HUD_RECT)
                              .drawWithBorder(badgeX, badgeY, badgeWidth, badgeHeight, badgeCorner, badgeColor, 0.9F, badgeBorder, badgeBorderColor)
                              val iconX: Float = x + outerPaddingX
                           val iconDrawX: Float = x
                              + outerPaddingX
                              + (iconWidth - Font.getWidth$default(رَ.INSTANCE.ICON, icon, iconSize, 0.0F, 4, null)) * 0.5F
                              val iconY: Float = y + this.centeredTopOffset(رَ.INSTANCE.ICON, iconSize, height)
                           val textX: Float = iconX + iconWidth + iconGap + (nameWidth - renderedNameWidth) * 0.5F
                           val nameY: Float = y + this.centeredTopOffset(رَ.INSTANCE.GS_MEDIUM, nameSize, height)
                           Font.drawText$default(
                              رَ.INSTANCE.ICON.priority(ClientRenderPipeline.HUD_SPECIAL),
                              icon,
                              iconDrawX,
                              iconY,
                              iconSize,
                              iconColor,
                              0.0F,
                              0.0F,
                              0.0F,
                              0,
                              0.0F,
                              992,
                              null
                           )
                           Font.drawText$default(
                              رَ.INSTANCE.GS_MEDIUM.priority(ClientRenderPipeline.HUD_TEXT),
                              wayPoint.name,
                              textX,
                              nameY,
                              nameSize,
                              titleColor,
                              0.0F,
                              0.0F,
                              0.0F,
                              0,
                              0.0F,
                              992,
                              null
                           )
                           val badgeTextX: Float = badgeX + (badgeWidth - renderedBadgeTextWidth) * 0.5F
                           val badgeValueY: Float = badgeY + this.centeredTopOffset(رَ.INSTANCE.GS_MEDIUM, distanceValueSize, badgeHeight)
                           val badgeUnitY: Float = badgeY + this.centeredTopOffset(رَ.INSTANCE.GS_REGULAR, distanceUnitSize, badgeHeight)
                           Font.drawText$default(
                              رَ.INSTANCE.GS_MEDIUM.priority(ClientRenderPipeline.HUD_TEXT),
                              distanceValueText,
                              badgeTextX,
                              badgeValueY,
                              distanceValueSize,
                              valueColor,
                              0.0F,
                              0.0F,
                              0.0F,
                              0,
                              0.0F,
                              992,
                              null
                           )
                           Font.drawText$default(
                              رَ.INSTANCE.GS_REGULAR.priority(ClientRenderPipeline.HUD_TEXT),
                              distanceUnitText,
                              badgeTextX + distanceValueWidth + badgeInnerGap,
                              badgeUnitY,
                              distanceUnitSize,
                              unitColor,
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
                  }
               }
            }
         }
      }
   }

   public override fun load() {
      this.ensureDirectory()
      wayPointsByName.clear()
      legacyBindKey = -1
      if (Files.exists(filePath)) {
         val var3: WayPointManager = this

         var `$this$load_u24lambda_u240`: Any
         try {
            `$this$load_u24lambda_u240` = var3
            `$this$load_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(JsonParser.parseString(Files.readString(filePath)))
         } catch (var8: java.lang.Throwable) {
            `$this$load_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var8))
         }

         var var10000: JsonElement = (if (isFailure) null else `$this$load_u24lambda_u240`) as JsonElement
         if (var10000 != null) {
            if (var10000.isJsonArray()) {
               val var10001: JsonArray = var10000.getAsJsonArray()
               this.loadWayPoints(var10001)
            } else if (var10000.isJsonObject()) {
               val json: JsonObject = var10000.getAsJsonObject()
               var10000 = json.get("bind")
               if (var10000 != null) {
                  var10000 = if (var10000.isJsonPrimitive()) var10000 else null
                  if (var10000 != null) {
                     legacyBindKey = var10000.getAsInt()
                  }
               }

               var var16: JsonArray = json.getAsJsonArray("waypoints")
               if (var16 == null) {
                  var16 = JsonArray()
               }

               this.loadWayPoints(var16)
            }
         }
      }
   }

   private fun nextQuickWaypointName(): String {
      var index: Int = wayPointsByName.size()

      while (true) {
         val candidate: java.lang.String = "Точка $index"
         if (!this.hasWaypoint("Точка $index")) {
            return candidate
         }

         index++
      }
   }

   private fun ensureDirectory() {
      Files.createDirectories(filePath.getParent())
   }

   public fun hasWaypoint(name: String?): Boolean {
      val var10000: java.lang.String = this.sanitizeName(name)
      return var10000 != null && wayPointsByName.containsKey(this.normalize(var10000))
   }

   private fun save(): Boolean {
      this.ensureDirectory()
      val root: JsonObject = JsonObject()
      val entries: JsonArray = JsonArray()

      for (`element$iv` in this.getWayPoints()) {
         entries.add(
            "${(`element$iv` as WayPointManager.WayPoint).name},${(`element$iv` as WayPointManager.WayPoint).event},${(`element$iv` as WayPointManager.WayPoint).x},${(`element$iv` as WayPointManager.WayPoint).y},${(`element$iv` as WayPointManager.WayPoint).z}"
         )
      }

      root.add("waypoints", entries)
      val var10: WayPointManager = this

      var var11: WayPointManager
      try {
         var11 = var10
         var11 = (WayPointManager)Result.constructor_impl/* $VF was: constructor-impl */(
            Files.writeString(filePath, gson.toJson(root), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE)
         )
      } catch (var9: java.lang.Throwable) {
         var11 = (WayPointManager)Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var9))
      }

      return isSuccess
   }

   public fun removeLastWaypoint(): تف? {
      val var10000: WayPointManager.WayPoint = CollectionsKt.lastOrNull(this.getWayPoints())
      if (var10000 == null) {
         return null
      } else {
         return if (this.remove(var10000.name) === WayPointManager.RemoveResult.REMOVED) var10000 else null
      }
   }

   private fun sanitizeName(name: String?): String? {
      if (name != null) {
         val var2: java.lang.String = StringsKt.trim(name).toString()
         if (var2 != null) {
            return if (var2.length() > 0 && !StringsKt.contains$default(var2, ',', false, 2, null)) var2 else null
         }
      }

      return null
   }

   fun calculateViewBobbing(partialTicks: PlayerEntity, player: Vector3f, result: Float) {
      previousSpeed = horizontalSpeed
      horizontalSpeed = (float)player.getAttributeValue(EntityAttributes.MOVEMENT_SPEED)
      val swing: Float = -(horizontalSpeed + (horizontalSpeed - previousSpeed) * partialTicks)
      val stride: Float = player.limbAnimator.getAmplitude(partialTicks)
      bobXRotation.setAngleAxis(
            (double)(Math.abs(MathHelper.cos((double)(swing * (float) Math.PI - 0.2F)) * stride) * 5.0F * (float) (Math.PI / 180.0)), 1.0, 0.0, 0.0
         )
         .conjugate()
         result.rotate(bobXRotation as Quaternionfc)
      bobZRotation.setAngleAxis((double)(MathHelper.sin((double)(swing * (float) Math.PI)) * stride * 3.0F * (float) (Math.PI / 180.0)), 0.0, 0.0, 1.0)
         .conjugate()
         result.rotate(bobZRotation as Quaternionfc)
      bobTranslation.set(
         MathHelper.sin((double)(swing * (float) Math.PI)) * stride * 0.5F, Math.abs(MathHelper.cos((double)(swing * (float) Math.PI)) * stride), 0.0F
      )
      result.add(bobTranslation as Vector3fc)
   }

   private fun withAlpha(color: Color, factor: Float): Color {
      return بح.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0F * factor)
   }

   private fun normalize(name: String): String {
      val var10000: Locale = Locale.ROOT
      val var3: java.lang.String = name.toLowerCase(var10000)
      return var3
   }

   public fun getWayPoints(): List<تف> {
      val var10000: java.util.Collection = wayPointsByName.values()
      return CollectionsKt.toList(var10000)
   }

   fun project(wayPoint: Camera, partialTicks: Float, halfWidth: WayPointManager.WayPoint, halfHeight: Double, projectionTan: Float, camera: Float): WayPointManager.ScreenPoint {
      val cameraPos: Vec3d = طث.getPos(camera)
      val result: Vector3f = projectionResult.set(
         (float)(cameraPos.x - (double)wayPoint.x), (float)(cameraPos.y - (double)wayPoint.y), (float)(cameraPos.z - (double)wayPoint.z)
      )
      result.rotate(cameraRotation as Quaternionfc)
      if (ضك.getMc().options.getBobView().getValue() as java.lang.Boolean && ضك.getMc().getCameraEntity() is PlayerEntity) {
         val var10001: Entity = ضك.getMc().getCameraEntity()
         val var13: PlayerEntity = var10001 as PlayerEntity
         this.calculateViewBobbing(var13, result, partialTicks)
      }

      if (result.z >= 0.0F) {
         null
      } else {
         val x: Float = -result.x * (float)(halfHeight / (result.z * projectionTan)) + halfWidth
         val y: Float = halfHeight - result.y * (float)(halfHeight / (result.z * projectionTan))
         if (!java.lang.Float.isNaN(x) && !java.lang.Float.isNaN(y) && !java.lang.Float.isInfinite(x) && !java.lang.Float.isInfinite(y)) {
            projectedPoint.x = x
            projectedPoint.y = y
            projectedPoint
         } else {
            null
         }
      }
   }

   // $VF: Compiled from heavy
   public enum class AddResult {
      INVALID_NAME,
      SAVE_FAILED,
      ALREADY_EXISTS,
      ADDED;

      @JvmStatic
      fun getEntries(): EnumEntries<WayPointManager.AddResult> {
         $ENTRIES
      }
   }

   // $VF: Compiled from heavy
   public enum class PutResult {
      UNCHANGED,
      ADDED,
      REPLACED,
      SAVE_FAILED,
      INVALID_NAME;

      @JvmStatic
      fun getEntries(): EnumEntries<WayPointManager.PutResult> {
         $ENTRIES
      }
   }

   // $VF: Compiled from heavy
   public enum class RemoveResult {
      REMOVED,
      NOT_FOUND,
      SAVE_FAILED,
      INVALID_NAME;

      @JvmStatic
      fun getEntries(): EnumEntries<WayPointManager.RemoveResult> {
         $ENTRIES
      }
   }

   // $VF: Compiled from heavy
   public enum class RenameResult {
      ALREADY_EXISTS,
      INVALID_NAME,
      NOT_FOUND,
      UNCHANGED,
      SAVE_FAILED,
      RENAMED;

      @JvmStatic
      fun getEntries(): EnumEntries<WayPointManager.RenameResult> {
         $ENTRIES
      }
   }

   // $VF: Compiled from heavy
   private class ScreenPoint(x: Float = 0.0F, y: Float = 0.0F) {
      public final var y: Float
      public final var x: Float

      fun ScreenPoint() {
         this(0.0F, 0.0F, 3, null)
      }

      init {
         super()
         this.x = x
         this.y = y
      }
   }

   // $VF: Compiled from heavy
   public data class WayPoint(name: String, event: Boolean, x: Int, y: Int, z: Int) {
      public final val hudIcon: String
      public final val event: Boolean
      public final val y: Int
      public final var cachedDistanceValue: Int
      public final val x: Int
      private final var cachedNameWidth: Float
      public final val z: Int
      private final var cachedIconSizeBits: Int
      private final var cachedDistanceTextForWidth: String?
      private final var cachedNameSizeBits: Int
      public final var cachedDistanceText: String
      private final var cachedIconWidth: Float
      private final var cachedDistanceWidth: Float
      private final var cachedDistanceSizeBits: Int
      public final val name: String

      public fun nameWidth(size: Float): Float {
         val sizeBits: Int = java.lang.Float.floatToRawIntBits(size)
         if (this.cachedNameSizeBits != sizeBits) {
            this.cachedNameSizeBits = sizeBits
            this.cachedNameWidth = Font.getWidth$default(رَ.INSTANCE.GS_MEDIUM, this.name, size, 0.0F, 4, null)
         }

         return this.cachedNameWidth
      }

      public operator fun component4(): Int {
         return this.y
      }

      public fun copy(name: String = ..., event: Boolean = ..., x: Int = ..., y: Int = ..., z: Int = ...): تف {
         return WayPointManager.WayPoint(name, event, x, y, z)
      }

      public operator fun component1(): String {
         return this.name
      }

      public fun iconWidth(icon: String, size: Float): Float {
         val sizeBits: Int = java.lang.Float.floatToRawIntBits(size)
         if (this.cachedIconSizeBits != sizeBits) {
            this.cachedIconSizeBits = sizeBits
            this.cachedIconWidth = Math.max(طغ.INSTANCE.scaled(10.0F), Font.getWidth$default(رَ.INSTANCE.ICON, icon, size, 0.0F, 4, null))
         }

         return this.cachedIconWidth
      }

      public override operator fun equals(other: Any?): Boolean {
         label46@
         if (this === other) {
            return true
         } else {
            return other is WayPointManager.WayPoint
               && this.name == (other as WayPointManager.WayPoint).name
               && this.event == (other as WayPointManager.WayPoint).event
               && this.x == (other as WayPointManager.WayPoint).x
               && this.y == (other as WayPointManager.WayPoint).y
               && this.z == (other as WayPointManager.WayPoint).z
            }
      }

      public override fun hashCode(): Int {
         return (((this.name.hashCode() * 31 + java.lang.Boolean.hashCode(this.event)) * 31 + Integer.hashCode(this.x)) * 31 + Integer.hashCode(this.y)) * 31
            + Integer.hashCode(this.z)
         }

      public fun distanceWidth(text: String, size: Float): Float {
         val sizeBits: Int = java.lang.Float.floatToRawIntBits(size)
         if (!(this.cachedDistanceTextForWidth == text) || this.cachedDistanceSizeBits != sizeBits) {
            this.cachedDistanceTextForWidth = text
            this.cachedDistanceSizeBits = sizeBits
            this.cachedDistanceWidth = Font.getWidth$default(رَ.INSTANCE.GS_MEDIUM, text, size, 0.0F, 4, null)
         }

         return this.cachedDistanceWidth
      }

      public operator fun component2(): Boolean {
         return this.event
      }

      public override fun toString(): String {
         return "WayPoint(name=${this.name}, event=${this.event}, x=${this.x}, y=${this.y}, z=${this.z})"
      }

      public operator fun component5(): Int {
         return this.z
      }

      init {
         this.name = name
         this.event = event
         this.x = x
         this.y = y
         this.z = z
         var var10001: java.lang.String
         if (!this.event) {
            var10001 = "I"
         } else {
            val var7: java.lang.String = this.name
            val var8: Locale = Locale.ROOT
            var10001 = var7.toLowerCase(var8)
            var10001 = if (StringsKt.contains$default(var10001, "meteor", false, 2, null))
               "W"
               else
               (
                  if (StringsKt.contains$default(var10001, "beacon", false, 2, null))
                     "R"
                     else
                     (
                        if (StringsKt.contains$default(var10001, "mystic", false, 2, null))
                           "Y"
                           else
                           (if (StringsKt.contains$default(var10001, "volcano", false, 2, null)) "T" else "v")
                     )
               )
            }

         this.hudIcon = var10001
         this.cachedDistanceValue = Integer.MIN_VALUE
         this.cachedDistanceText = ""
      }

      public operator fun component3(): Int {
         return this.x
      }
   }
}
