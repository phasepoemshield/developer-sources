/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 */
package kotakbaz.rain.client.waypoint;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotakbaz.rain.client.util.render.display.BlurredRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.modules.render.WayPointModule;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import oxxxde.\u0628\u062d;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0637\u063a;
import oxxxde.\u0647;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\f\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b#\u0010\"J\r\u0010%\u001a\u00020$\u00a2\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'\u00a2\u0006\u0004\b)\u0010*JA\u00103\u001a\u0004\u0018\u0001022\u0006\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020'H\u0002\u00a2\u0006\u0004\b3\u00104J'\u00109\u001a\u00020\u00042\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u0010(\u001a\u00020'H\u0002\u00a2\u0006\u0004\b9\u0010:J/\u0010>\u001a\u00020.2\u0006\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020.2\u0006\u0010-\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\n2\u0006\u0010@\u001a\u00020.2\u0006\u0010-\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\bC\u0010DJ'\u0010I\u001a\u00020'2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020'2\u0006\u0010H\u001a\u00020'H\u0002\u00a2\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\nH\u0002\u00a2\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u00042\u0006\u0010N\u001a\u00020MH\u0002\u00a2\u0006\u0004\bO\u0010PJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010Q\u001a\u00020\nH\u0002\u00a2\u0006\u0004\bR\u0010SJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010U\u001a\u00020TH\u0002\u00a2\u0006\u0004\bR\u0010VJ\u000f\u0010W\u001a\u00020\fH\u0002\u00a2\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bY\u0010\u0003J\u001b\u0010Z\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\\\u0010[J\u001f\u0010`\u001a\u00020]2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020'H\u0002\u00a2\u0006\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bd\u0010cR\u0014\u0010e\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\be\u0010cR\u001c\u0010h\u001a\n g*\u0004\u0018\u00010f0f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bh\u0010iR \u0010k\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070j8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bk\u0010lR\u0017\u0010n\u001a\u00020m8\u0006\u00a2\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b%\u0010rR\u0016\u0010s\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bs\u0010rR\u0016\u0010t\u001a\u00020'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010v\u001a\u00020'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bv\u0010uR\u0016\u0010w\u001a\u00020'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bw\u0010uR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b{\u0010zR\u0014\u0010|\u001a\u00020x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b|\u0010zR\u0014\u0010}\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b}\u0010~R\u0014\u0010\u007f\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u007f\u0010~R\u0017\u0010\u0080\u0001\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u00a8\u0006\u008b\u0001"}, d2={"Loxxxde/\u0630\u0629;", "Loxxxde/\u0647;", "<init>", "()V", "", "load", "", "Loxxxde/\u062a\u0641;", "getWayPoints", "()Ljava/util/List;", "", "name", "", "isValidName", "(Ljava/lang/String;)Z", "hasWaypoint", "event", "Lnet/minecraft/class_2338;", "pos", "Loxxxde/\u0635\u0642;", "add", "(Ljava/lang/String;ZLnet/minecraft/class_2338;)Lkotakbaz/rain/client/waypoint/WayPointManager$AddResult;", "Loxxxde/\u0627\u0648;", "put", "(Ljava/lang/String;ZLnet/minecraft/class_2338;)Lkotakbaz/rain/client/waypoint/WayPointManager$PutResult;", "Loxxxde/\u062d\u062d;", "remove", "(Ljava/lang/String;)Lkotakbaz/rain/client/waypoint/WayPointManager$RemoveResult;", "oldName", "newName", "Loxxxde/\u0634\u0637;", "rename", "(Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/client/waypoint/WayPointManager$RenameResult;", "createQuickWaypoint", "()Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;", "removeLastWaypoint", "", "legacyBindKey", "()I", "", "partialTicks", "renderHud", "(F)V", "Lnet/minecraft/class_4184;", "camera", "wayPoint", "", "projectionTan", "halfWidth", "halfHeight", "Loxxxde/\u0628\u0647;", "project", "(Lnet/minecraft/class_4184;FLkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;DFF)Lkotakbaz/rain/client/waypoint/WayPointManager$ScreenPoint;", "Lnet/minecraft/class_1657;", "player", "Lorg/joml/Vector3f;", "result", "calculateViewBobbing", "(Lnet/minecraft/class_1657;Lorg/joml/Vector3f;F)V", "playerX", "playerY", "playerZ", "distanceTo", "(DDDLkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;)D", "distance", "formatDistance", "(DLkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;)Ljava/lang/String;", "iconFor", "(Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;)Ljava/lang/String;", "Loxxxde/\u062c\u064b;", "font", "size", "containerHeight", "centeredTopOffset", "(Lkotakbaz/rain/client/util/render/font/Font;FF)F", "nextQuickWaypointName", "()Ljava/lang/String;", "Lcom/google/gson/JsonArray;", "array", "loadWayPoints", "(Lcom/google/gson/JsonArray;)V", "serialized", "deserialize", "(Ljava/lang/String;)Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;", "Lcom/google/gson/JsonObject;", "json", "(Lcom/google/gson/JsonObject;)Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;", "save", "()Z", "ensureDirectory", "sanitizeName", "(Ljava/lang/String;)Ljava/lang/String;", "normalize", "Ljava/awt/Color;", "color", "factor", "withAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "ROOT_KEY", "Ljava/lang/String;", "BIND_KEY", "DEFAULT_QUICK_PREFIX", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "Ljava/util/LinkedHashMap;", "wayPointsByName", "Ljava/util/LinkedHashMap;", "Ljava/nio/file/Path;", "filePath", "Ljava/nio/file/Path;", "getFilePath", "()Ljava/nio/file/Path;", "I", "lastRenderPlayerAge", "lastRenderPartialTicks", "F", "previousSpeed", "horizontalSpeed", "Lorg/joml/Quaternionf;", "cameraRotation", "Lorg/joml/Quaternionf;", "bobXRotation", "bobZRotation", "projectionResult", "Lorg/joml/Vector3f;", "bobTranslation", "projectedPoint", "Loxxxde/\u0628\u0647;", "Lorg/joml/Vector4f;", "sectionRound", "Lorg/joml/Vector4f;", "WayPoint", "AddResult", "PutResult", "RemoveResult", "RenameResult", "ScreenPoint", "rain-visuals"})
public final class WayPointManager
implements \u0647 {
    @NotNull
    private static final Quaternionf bobXRotation;
    @NotNull
    private static final Vector3f projectionResult;
    @NotNull
    private static final Vector3f bobTranslation;
    @NotNull
    private static final Path filePath;
    @NotNull
    private static final String BIND_KEY = "bind";
    private static int lastRenderPlayerAge;
    private static float previousSpeed;
    @NotNull
    private static final Quaternionf cameraRotation;
    @NotNull
    private static final String ROOT_KEY = "waypoints";
    @NotNull
    private static final ScreenPoint projectedPoint;
    private static float horizontalSpeed;
    @NotNull
    private static final String DEFAULT_QUICK_PREFIX = "\u0422\u043e\u0447\u043a\u0430";
    @NotNull
    private static final LinkedHashMap<String, WayPoint> wayPointsByName;
    @NotNull
    private static final Vector4f sectionRound;
    @NotNull
    public static final WayPointManager INSTANCE;
    @NotNull
    private static final Quaternionf bobZRotation;
    private static int legacyBindKey;
    private static final Gson gson;
    private static float lastRenderPartialTicks;

    @NotNull
    public final PutResult put(@NotNull String name, boolean event, @NotNull BlockPos pos) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pos, "pos");
        String string = this.sanitizeName(name);
        if (string == null) {
            return PutResult.INVALID_NAME;
        }
        String sanitized = string;
        String normalized = this.normalize(sanitized);
        WayPoint wayPoint = new WayPoint(sanitized, event, pos.getX(), pos.getY(), pos.getZ());
        WayPoint previous = wayPointsByName.get(normalized);
        if (Intrinsics.areEqual(previous, wayPoint)) {
            return PutResult.UNCHANGED;
        }
        ((Map)wayPointsByName).put(normalized, wayPoint);
        if (!this.save()) {
            if (previous == null) {
                wayPointsByName.remove(normalized);
            } else {
                ((Map)wayPointsByName).put(normalized, previous);
            }
            return PutResult.SAVE_FAILED;
        }
        return previous == null ? PutResult.ADDED : PutResult.REPLACED;
    }

    private final void loadWayPoints(JsonArray array) {
        Iterable $this$forEach$iv = array;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            WayPoint wayPoint;
            WayPoint wayPoint2;
            JsonElement element = (JsonElement)element$iv;
            boolean bl = false;
            if (element.isJsonPrimitive()) {
                String string = element.getAsString();
                Intrinsics.checkNotNullExpressionValue(string, "getAsString(...)");
                wayPoint2 = INSTANCE.deserialize(string);
            } else if (element.isJsonObject()) {
                JsonObject jsonObject = element.getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(jsonObject, "getAsJsonObject(...)");
                wayPoint2 = INSTANCE.deserialize(jsonObject);
            } else {
                wayPoint2 = null;
            }
            if ((wayPoint = wayPoint2) == null) continue;
            WayPoint wayPoint3 = wayPoint;
            boolean bl2 = false;
            wayPointsByName.putIfAbsent(INSTANCE.normalize(wayPoint3.getName()), wayPoint3);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final WayPoint deserialize(JsonObject json) {
        void var6_6;
        void var5_5;
        JsonElement jsonElement = json.get("name");
        String string = this.sanitizeName(jsonElement != null ? jsonElement.getAsString() : null);
        if (string == null) {
            return null;
        }
        String name = string;
        JsonElement jsonElement2 = json.get("event");
        boolean event = jsonElement2 != null ? jsonElement2.getAsBoolean() : false;
        JsonElement jsonElement3 = json.get("x");
        if (jsonElement3 == null) {
            return null;
        }
        int x = jsonElement3.getAsInt();
        JsonElement jsonElement4 = json.get("y");
        if (jsonElement4 == null) {
            return null;
        }
        int y = jsonElement4.getAsInt();
        JsonElement jsonElement5 = json.get("z");
        if (jsonElement5 == null) {
            return null;
        }
        int z = jsonElement5.getAsInt();
        return new WayPoint(name, event, x, (int)var5_5, (int)var6_6);
    }

    @NotNull
    public final AddResult add(@NotNull String name, boolean event, @NotNull BlockPos pos) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pos, "pos");
        String string = this.sanitizeName(name);
        if (string == null) {
            return AddResult.INVALID_NAME;
        }
        String sanitized = string;
        String normalized = this.normalize(sanitized);
        if (wayPointsByName.containsKey(normalized)) {
            return AddResult.ALREADY_EXISTS;
        }
        WayPoint wayPoint = new WayPoint(sanitized, event, pos.getX(), pos.getY(), pos.getZ());
        ((Map)wayPointsByName).put(normalized, wayPoint);
        if (!this.save()) {
            wayPointsByName.remove(normalized);
            return AddResult.SAVE_FAILED;
        }
        return AddResult.ADDED;
    }

    private final String formatDistance(double distance, WayPoint wayPoint) {
        double rounded = (double)MathKt.roundToInt(distance * 10.0) / 10.0;
        int displayValue = MathKt.roundToInt(rounded);
        if (wayPoint.getCachedDistanceValue() != displayValue) {
            wayPoint.setCachedDistanceValue(displayValue);
            wayPoint.setCachedDistanceText(String.valueOf(displayValue));
        }
        return wayPoint.getCachedDistanceText();
    }

    /*
     * WARNING - void declaration
     */
    private final WayPoint deserialize(String serialized) {
        void var6_6;
        void var5_5;
        void var4_4;
        String[] stringArray = new String[1];
        stringArray[0] = ",";
        List parts = StringsKt.split$default((CharSequence)serialized, stringArray, false, 0, 6, null);
        if (parts.size() != 5) {
            return null;
        }
        String string = this.sanitizeName((String)parts.get(0));
        if (string == null) {
            return null;
        }
        String name = string;
        boolean event = Boolean.parseBoolean((String)parts.get(1));
        Integer n = StringsKt.toIntOrNull((String)parts.get(2));
        if (n == null) {
            return null;
        }
        int x = n;
        Integer n2 = StringsKt.toIntOrNull((String)parts.get(3));
        if (n2 == null) {
            return null;
        }
        int y = n2;
        Integer n3 = StringsKt.toIntOrNull((String)parts.get(4));
        if (n3 == null) {
            return null;
        }
        int n4 = n3;
        return new WayPoint((String)stringArray, (boolean)var4_4, (int)var5_5, (int)var6_6, n4);
    }

    @NotNull
    public final Path getFilePath() {
        return filePath;
    }

    private WayPointManager() {
    }

    public static /* synthetic */ AddResult add$default(WayPointManager wayPointManager, String string, boolean bl, BlockPos blockPos, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return wayPointManager.add(string, bl, blockPos);
    }

    private final String iconFor(WayPoint wayPoint) {
        return wayPoint.getHudIcon();
    }

    private final float centeredTopOffset(Font font, float size, float containerHeight) {
        return (containerHeight - font.getHeight(size)) * 0.5f;
    }

    public final int legacyBindKey() {
        return legacyBindKey;
    }

    private final double distanceTo(double playerX, double playerY, double playerZ, WayPoint wayPoint) {
        double dx = playerX - (double)wayPoint.getX();
        double dy = playerY - (double)wayPoint.getY();
        double dz = playerZ - (double)wayPoint.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public final boolean isValidName(@Nullable String name) {
        return this.sanitizeName(name) != null;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final RenameResult rename(@Nullable String oldName, @Nullable String newName) {
        Map.Entry entry;
        void $this$mapTo$iv$iv;
        String string = this.sanitizeName(oldName);
        if (string == null) {
            return RenameResult.INVALID_NAME;
        }
        String sanitizedOldName = string;
        String string2 = this.sanitizeName(newName);
        if (string2 == null) {
            return RenameResult.INVALID_NAME;
        }
        String sanitizedNewName = string2;
        String oldNormalized = this.normalize(sanitizedOldName);
        String newNormalized = this.normalize(sanitizedNewName);
        WayPoint wayPoint = wayPointsByName.get(oldNormalized);
        if (wayPoint == null) {
            return RenameResult.NOT_FOUND;
        }
        WayPoint existing = wayPoint;
        if (Intrinsics.areEqual(oldNormalized, newNormalized)) {
            if (Intrinsics.areEqual(existing.getName(), sanitizedNewName)) {
                return RenameResult.UNCHANGED;
            }
            WayPoint updated = WayPoint.copy$default(existing, sanitizedNewName, false, 0, 0, 0, 30, null);
            ((Map)wayPointsByName).put(oldNormalized, updated);
            if (!this.save()) {
                ((Map)wayPointsByName).put(oldNormalized, existing);
                return RenameResult.SAVE_FAILED;
            }
            return RenameResult.RENAMED;
        }
        if (wayPointsByName.containsKey(newNormalized)) {
            return RenameResult.ALREADY_EXISTS;
        }
        LinkedHashMap snapshot = new LinkedHashMap(wayPointsByName);
        WayPoint renamed = WayPoint.copy$default(existing, sanitizedNewName, false, 0, 0, 0, 30, null);
        Set set = snapshot.entrySet();
        Intrinsics.checkNotNullExpressionValue(set, "<get-entries>(...)");
        Iterable $this$map$iv = set;
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            void var21_23;
            void var20_22;
            entry = (Map.Entry)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            Intrinsics.checkNotNull(entry);
            String key = (String)entry.getKey();
            WayPoint value = (WayPoint)entry.getValue();
            collection.add(Intrinsics.areEqual(key, oldNormalized) ? TuplesKt.to(newNormalized, renamed) : TuplesKt.to(var20_22, var21_23));
        }
        List reorderedEntries = (List)destination$iv$iv;
        wayPointsByName.clear();
        Iterable $this$forEach$iv = reorderedEntries;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var17_19;
            Pair pair = (Pair)element$iv;
            boolean bl = false;
            String key = (String)pair.component1();
            WayPoint value = (WayPoint)pair.component2();
            ((Map)wayPointsByName).put(var17_19, entry);
        }
        if (!this.save()) {
            void var8_9;
            wayPointsByName.clear();
            wayPointsByName.putAll((Map)var8_9);
            return RenameResult.SAVE_FAILED;
        }
        return RenameResult.RENAMED;
    }

    @NotNull
    public final RemoveResult remove(@Nullable String name) {
        String string = this.sanitizeName(name);
        if (string == null) {
            return RemoveResult.INVALID_NAME;
        }
        String sanitized = string;
        String normalized = this.normalize(sanitized);
        WayPoint wayPoint = (WayPoint)wayPointsByName.remove(normalized);
        if (wayPoint == null) {
            return RemoveResult.NOT_FOUND;
        }
        WayPoint removed = wayPoint;
        if (!this.save()) {
            ((Map)wayPointsByName).put(normalized, removed);
            return RemoveResult.SAVE_FAILED;
        }
        return RemoveResult.REMOVED;
    }

    @Nullable
    public final WayPoint createQuickWaypoint() {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return null;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        String name = this.nextQuickWaypointName();
        BlockPos blockPos = player.getBlockPos();
        Intrinsics.checkNotNullExpressionValue(blockPos, "blockPosition(...)");
        if (this.add(name, false, blockPos) != AddResult.ADDED) {
            return null;
        }
        return wayPointsByName.get(this.normalize(name));
    }

    static {
        INSTANCE = new WayPointManager();
        gson = new GsonBuilder().setPrettyPrinting().create();
        wayPointsByName = new LinkedHashMap();
        String[] stringArray = new String[3];
        stringArray[0] = "Rain";
        stringArray[1] = "other";
        stringArray[2] = "way.json";
        Path path = Paths.get(System.getProperty("user.dir"), stringArray);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        filePath = path;
        legacyBindKey = -1;
        lastRenderPlayerAge = Integer.MIN_VALUE;
        lastRenderPartialTicks = Float.NaN;
        cameraRotation = new Quaternionf();
        bobXRotation = new Quaternionf();
        bobZRotation = new Quaternionf();
        projectionResult = new Vector3f();
        bobTranslation = new Vector3f();
        projectedPoint = new ScreenPoint(0.0f, 0.0f, 3, null);
        sectionRound = new Vector4f();
    }

    public static /* synthetic */ PutResult put$default(WayPointManager wayPointManager, String string, boolean bl, BlockPos blockPos, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        return wayPointManager.put(string, bl, blockPos);
    }

    /*
     * WARNING - void declaration
     */
    public final void renderHud(float partialTicks) {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (!((Boolean)WayPointModule.INSTANCE.getShowWaypoints().getValue()).booleanValue()) {
            return;
        }
        if (wayPointsByName.isEmpty()) {
            return;
        }
        if (player.age == lastRenderPlayerAge) {
            boolean bl = partialTicks == lastRenderPartialTicks;
            if (bl) {
                return;
            }
        }
        lastRenderPlayerAge = player.age;
        lastRenderPartialTicks = partialTicks;
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Camera camera = \u0637\u062b.getCamera(gameRenderer);
        Quaternionf quaternionf = RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getCameraYaw());
        Intrinsics.checkNotNullExpressionValue(quaternionf, "rotationDegrees(...)");
        Quaternionf yawQuat = quaternionf;
        Quaternionf quaternionf2 = RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch());
        Intrinsics.checkNotNullExpressionValue(quaternionf2, "rotationDegrees(...)");
        Quaternionf pitchQuat = quaternionf2;
        yawQuat.mul((Quaternionfc)pitchQuat, cameraRotation).conjugate();
        double fov = \u0636\u0643.getMc().gameRenderer.getFov(camera, partialTicks, true);
        float halfWidth = (float)\u0636\u0643.getMc().getWindow().getScaledWidth() / 2.0f;
        float halfHeight = (float)\u0636\u0643.getMc().getWindow().getScaledHeight() / 2.0f;
        double projectionTan = Math.tan(Math.toRadians(fov / 2.0));
        float height = \u0637\u063a.INSTANCE.scaled(24.0f);
        float corner = \u0637\u063a.INSTANCE.scaled(6.0f);
        float sectionCorner = \u0637\u063a.INSTANCE.scaled(5.5f);
        float outerPaddingX = \u0637\u063a.INSTANCE.scaled(5.0f);
        float iconGap = \u0637\u063a.INSTANCE.scaled(4.0f);
        float sectionGap = \u0637\u063a.INSTANCE.scaled(4.5f);
        float iconSize = \u0637\u063a.INSTANCE.scaled(10.0f);
        float nameLayoutSize = \u0637\u063a.INSTANCE.scaled(8.4f);
        float distanceValueLayoutSize = \u0637\u063a.INSTANCE.scaled(8.9f);
        float distanceUnitLayoutSize = \u0637\u063a.INSTANCE.scaled(6.2f);
        float nameSize = \u0637\u063a.INSTANCE.scaled(7.2f);
        float distanceValueSize = \u0637\u063a.INSTANCE.scaled(7.5f);
        float distanceUnitSize = \u0637\u063a.INSTANCE.scaled(5.4f);
        float badgeGap = \u0637\u063a.INSTANCE.scaled(3.0f);
        float badgeCorner = \u0637\u063a.INSTANCE.scaled(3.0f);
        float badgeBorder = \u0637\u063a.INSTANCE.scaled(1.0f);
        float badgeInnerGap = \u0637\u063a.INSTANCE.scaled(1.2f);
        String distanceUnitText = "m";
        float distanceUnitLayoutWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_REGULAR(), distanceUnitText, distanceUnitLayoutSize, 0.0f, 4, null);
        float distanceUnitWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_REGULAR(), distanceUnitText, distanceUnitSize, 0.0f, 4, null);
        float badgeTextHeight = Math.max(\u0631\u064e.INSTANCE.getGS_MEDIUM().getHeight(distanceValueLayoutSize), \u0631\u064e.INSTANCE.getGS_REGULAR().getHeight(distanceUnitLayoutSize));
        float dividerWidth = \u0637\u063a.INSTANCE.rowDividerWidth();
        float dividerHeight = height * 0.48f;
        Iterator<WayPoint> iterator2 = wayPointsByName.values().iterator();
        while (iterator2.hasNext()) {
            void var65_62;
            void var24_22;
            void var78_75;
            void var28_26;
            void var47_44;
            void var76_73;
            void var29_27;
            ScreenPoint projected;
            WayPoint wayPoint;
            Intrinsics.checkNotNullExpressionValue(iterator2.next(), "next(...)");
            if (this.project(camera, partialTicks, wayPoint, projectionTan, halfWidth, halfHeight) == null) continue;
            double distance = this.distanceTo(player.getX(), player.getY(), player.getZ(), wayPoint);
            float alpha = WayPointModule.INSTANCE.waypointAlphaByDistance(distance);
            if (alpha <= 0.0f) continue;
            String icon = this.iconFor(wayPoint);
            String distanceValueText = this.formatDistance(distance, wayPoint);
            float iconWidth = wayPoint.iconWidth(icon, iconSize);
            float nameWidth = wayPoint.nameWidth(nameLayoutSize);
            float renderedNameWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), wayPoint.getName(), nameSize, 0.0f, 4, null);
            float distanceValueLayoutWidth = wayPoint.distanceWidth(distanceValueText, distanceValueLayoutSize);
            float distanceValueWidth = wayPoint.distanceWidth(distanceValueText, distanceValueSize);
            float badgeTextWidth = distanceValueLayoutWidth + badgeInnerGap + distanceUnitLayoutWidth;
            float renderedBadgeTextWidth = distanceValueWidth + badgeInnerGap + distanceUnitWidth;
            float badgeWidth = badgeTextWidth + badgeGap * 2.0f;
            float badgeHeight = badgeTextHeight + badgeGap * 2.0f;
            float sectionInset = (height - badgeHeight) * 0.5f;
            float rightSectionWidth = badgeWidth + sectionInset * 2.0f;
            float width = outerPaddingX + iconWidth + iconGap + nameWidth + sectionGap + rightSectionWidth + outerPaddingX;
            float x = projected.getX() - width * 0.5f;
            float y = projected.getY() - height * 0.5f;
            Color panelColor = this.withAlpha(\u0637\u063a.INSTANCE.getPANEL_COLOR(), alpha);
            Color sectionColor = this.withAlpha(\u0637\u063a.INSTANCE.getHEADER_COLOR(), alpha);
            Color dividerColor = \u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getHEADER_COLOR(), 0.1f * alpha);
            Color badgeColor = \u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getHEADER_COLOR(), 0.2f * alpha);
            Color badgeBorderColor = \u0628\u062d.INSTANCE.setAlpha(\u0637\u063a.INSTANCE.getHEADER_COLOR(), 0.1f * alpha);
            Color iconColor = this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), alpha);
            Color titleColor = this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), alpha);
            Color valueColor = this.withAlpha(\u0637\u063a.INSTANCE.getTITLE_COLOR(), alpha);
            Color unitColor = this.withAlpha(\u0637\u063a.INSTANCE.getVALUE_COLOR(), alpha);
            float sectionX = x + width - rightSectionWidth;
            float leftSectionWidth = sectionX - x;
            float badgeX = sectionX + sectionInset;
            float badgeY = y + (height - badgeHeight) * 0.5f;
            \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).draw(x, y, width, height, corner, panelColor, 0.9f);
            BlurredRectRenderer blurredRectRenderer = \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(sectionColor).mix(0.9f);
            Vector4f vector4f = sectionRound.set(sectionCorner, 0.0f, sectionCorner, 0.0f);
            Intrinsics.checkNotNullExpressionValue(vector4f, "set(...)");
            blurredRectRenderer.round(vector4f).draw(x, y, leftSectionWidth, height);
            \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(dividerColor).mix(0.9f).round(dividerWidth).draw(sectionX, y + (height - dividerHeight) * 0.5f, dividerWidth, dividerHeight);
            \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).drawWithBorder(badgeX, badgeY, badgeWidth, badgeHeight, badgeCorner, badgeColor, 0.9f, badgeBorder, badgeBorderColor);
            float iconX = x + outerPaddingX;
            float iconGlyphWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), icon, iconSize, 0.0f, 4, null);
            float iconDrawX = iconX + (iconWidth - iconGlyphWidth) * 0.5f;
            float iconY = y + this.centeredTopOffset(\u0631\u064e.INSTANCE.getICON(), iconSize, height);
            float textX = iconX + iconWidth + iconGap + (nameWidth - renderedNameWidth) * 0.5f;
            float nameY = y + this.centeredTopOffset(\u0631\u064e.INSTANCE.getGS_MEDIUM(), nameSize, height);
            Font.drawText$default(\u0631\u064e.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_SPECIAL), icon, iconDrawX, iconY, iconSize, iconColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
            Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), wayPoint.getName(), textX, nameY, nameSize, titleColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
            float badgeTextX = badgeX + (badgeWidth - renderedBadgeTextWidth) * 0.5f;
            float badgeValueY = badgeY + this.centeredTopOffset(\u0631\u064e.INSTANCE.getGS_MEDIUM(), distanceValueSize, badgeHeight);
            float badgeUnitY = badgeY + this.centeredTopOffset(\u0631\u064e.INSTANCE.getGS_REGULAR(), distanceUnitSize, badgeHeight);
            Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), distanceValueText, badgeTextX, badgeValueY, distanceValueSize, valueColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
            Font.drawText$default(\u0631\u064e.INSTANCE.getGS_REGULAR().priority(ClientRenderPipeline.HUD_TEXT), (String)var29_27, (float)(var76_73 + var47_44 + var28_26), (float)var78_75, (float)var24_22, (Color)var65_62, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void load() {
        Object object;
        this.ensureDirectory();
        wayPointsByName.clear();
        legacyBindKey = -1;
        if (!Files.exists(filePath, new LinkOption[0])) {
            return;
        }
        Object object2 = this;
        try {
            WayPointManager $this$load_u24lambda_u240 = object2;
            boolean bl = false;
            object = Result.constructor-impl(JsonParser.parseString(Files.readString(filePath)));
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        JsonElement jsonElement = (JsonElement)(Result.isFailure-impl(object2) ? null : object2);
        if (jsonElement == null) {
            return;
        }
        JsonElement root = jsonElement;
        if (root.isJsonArray()) {
            JsonArray jsonArray = root.getAsJsonArray();
            Intrinsics.checkNotNullExpressionValue(jsonArray, "getAsJsonArray(...)");
            this.loadWayPoints(jsonArray);
        } else if (root.isJsonObject()) {
            JsonArray jsonArray;
            JsonObject json = root.getAsJsonObject();
            JsonElement jsonElement2 = json.get(BIND_KEY);
            if (jsonElement2 != null) {
                JsonElement jsonElement3;
                JsonElement it = jsonElement3 = jsonElement2;
                boolean bl = false;
                JsonElement jsonElement4 = it.isJsonPrimitive() ? jsonElement3 : null;
                jsonElement2 = jsonElement4;
                if (jsonElement4 != null) {
                    void var6_8;
                    it = jsonElement2;
                    boolean bl2 = false;
                    legacyBindKey = var6_8.getAsInt();
                }
            }
            if ((jsonArray = json.getAsJsonArray(ROOT_KEY)) == null) {
                jsonArray = new JsonArray();
            }
            this.loadWayPoints(jsonArray);
        }
    }

    private final String nextQuickWaypointName() {
        int index = wayPointsByName.size();
        while (true) {
            String candidate = "\u0422\u043e\u0447\u043a\u0430 " + index;
            if (!this.hasWaypoint(candidate)) {
                return candidate;
            }
            ++index;
        }
    }

    private final void ensureDirectory() {
        Files.createDirectories(filePath.getParent(), new FileAttribute[0]);
    }

    public final boolean hasWaypoint(@Nullable String name) {
        String string = this.sanitizeName(name);
        if (string == null) {
            return false;
        }
        String sanitized = string;
        return wayPointsByName.containsKey(this.normalize(sanitized));
    }

    private final boolean save() {
        Object object;
        this.ensureDirectory();
        JsonObject root = new JsonObject();
        JsonArray entries = new JsonArray();
        Iterable $this$forEach$iv = this.getWayPoints();
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            WayPoint wayPoint = (WayPoint)element$iv;
            boolean bl = false;
            entries.add(wayPoint.getName() + "," + wayPoint.getEvent() + "," + wayPoint.getX() + "," + wayPoint.getY() + "," + wayPoint.getZ());
        }
        root.add(ROOT_KEY, entries);
        WayPointManager wayPointManager = this;
        try {
            WayPointManager $this$save_u24lambda_u241 = wayPointManager;
            boolean bl = false;
            OpenOption[] openOptionArray = new OpenOption[3];
            openOptionArray[0] = StandardOpenOption.CREATE;
            openOptionArray[1] = StandardOpenOption.TRUNCATE_EXISTING;
            openOptionArray[2] = StandardOpenOption.WRITE;
            object = Result.constructor-impl(Files.writeString(filePath, (CharSequence)gson.toJson(root), openOptionArray));
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        return Result.isSuccess-impl(object);
    }

    @Nullable
    public final WayPoint removeLastWaypoint() {
        WayPoint wayPoint = CollectionsKt.lastOrNull(this.getWayPoints());
        if (wayPoint == null) {
            return null;
        }
        WayPoint lastWaypoint = wayPoint;
        return this.remove(lastWaypoint.getName()) == RemoveResult.REMOVED ? lastWaypoint : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String sanitizeName(String name) {
        if (name == null) return null;
        String string = ((Object)StringsKt.trim((CharSequence)name)).toString();
        if (string == null) return null;
        String string2 = string;
        String it = string2;
        boolean bl = false;
        if (((CharSequence)it).length() <= 0) return null;
        boolean bl2 = true;
        if (!bl2) return null;
        if (StringsKt.contains$default((CharSequence)it, ',', false, 2, null)) return null;
        boolean bl3 = true;
        if (!bl3) return null;
        String string3 = string2;
        return string3;
    }

    private final void calculateViewBobbing(PlayerEntity player, Vector3f result, float partialTicks) {
        previousSpeed = horizontalSpeed;
        horizontalSpeed = (float)player.getAttributeValue(EntityAttributes.MOVEMENT_SPEED);
        float speedDelta = horizontalSpeed - previousSpeed;
        float swing = -(horizontalSpeed + speedDelta * partialTicks);
        float stride = player.limbAnimator.getAmplitude(partialTicks);
        float angleX = Math.abs(MathHelper.cos((double)(swing * (float)Math.PI - 0.2f)) * stride) * 5.0f;
        bobXRotation.setAngleAxis((double)(angleX *= (float)Math.PI / 180), 1.0, 0.0, 0.0).conjugate();
        result.rotate((Quaternionfc)bobXRotation);
        float angleZ = MathHelper.sin((double)(swing * (float)Math.PI)) * stride * 3.0f;
        bobZRotation.setAngleAxis((double)(angleZ *= (float)Math.PI / 180), 0.0, 0.0, 1.0).conjugate();
        result.rotate((Quaternionfc)bobZRotation);
        bobTranslation.set(MathHelper.sin((double)(swing * (float)Math.PI)) * stride * 0.5f, Math.abs(MathHelper.cos((double)(swing * (float)Math.PI)) * stride), 0.0f);
        result.add((Vector3fc)bobTranslation);
    }

    private final Color withAlpha(Color color, float factor) {
        return \u0628\u062d.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0f * factor);
    }

    private final String normalize(String name) {
        String string = name;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string2 = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        return string2;
    }

    @NotNull
    public final List<WayPoint> getWayPoints() {
        Collection<WayPoint> collection = wayPointsByName.values();
        Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
        return CollectionsKt.toList((Iterable)collection);
    }

    private final ScreenPoint project(Camera camera, float partialTicks, WayPoint wayPoint, double projectionTan, float halfWidth, float halfHeight) {
        float y;
        float x;
        block6: {
            block5: {
                Vec3d cameraPos = \u0637\u062b.getPos(camera);
                Vector3f result = projectionResult.set((float)(cameraPos.x - (double)wayPoint.getX()), (float)(cameraPos.y - (double)wayPoint.getY()), (float)(cameraPos.z - (double)wayPoint.getZ()));
                result.rotate((Quaternionfc)cameraRotation);
                if (((Boolean)\u0636\u0643.getMc().options.getBobView().getValue()).booleanValue() && \u0636\u0643.getMc().getCameraEntity() instanceof PlayerEntity) {
                    Entity entity = \u0636\u0643.getMc().getCameraEntity();
                    Intrinsics.checkNotNull(entity, "null cannot be cast to non-null type net.minecraft.world.entity.player.Player");
                    PlayerEntity playerEntity = (PlayerEntity)entity;
                    Intrinsics.checkNotNull(result);
                    this.calculateViewBobbing(playerEntity, result, partialTicks);
                }
                if (result.z >= 0.0f) {
                    return null;
                }
                float scale = (float)((double)halfHeight / ((double)result.z * projectionTan));
                x = -result.x * scale + halfWidth;
                y = halfHeight - result.y * scale;
                if (Float.isNaN(x) || Float.isNaN(y) || Float.isInfinite(x)) break block5;
                if (!Float.isInfinite(y)) break block6;
            }
            return null;
        }
        projectedPoint.setX(x);
        projectedPoint.setY(y);
        return projectedPoint;
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u001c\u0010\u001aJB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u00020\u0006H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\"\u0010\u001aJ\u0011\u0010#\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b#\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b+\u0010\u001aR\u0017\u0010,\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u0016R\"\u0010.\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u00101R\"\u00102\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b6\u0010(R\u0016\u00107\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u0010(R\u0016\u0010:\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b:\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b;\u0010$R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b<\u0010(R\u0016\u0010=\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b=\u00108\u00a8\u0006>"}, d2={"Loxxxde/\u062a\u0641;", "", "", "name", "", "event", "", "x", "y", "z", "<init>", "(Ljava/lang/String;ZIII)V", "icon", "", "size", "iconWidth", "(Ljava/lang/String;F)F", "nameWidth", "(F)F", "text", "distanceWidth", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()I", "component4", "component5", "copy", "(Ljava/lang/String;ZIII)Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getName", "Z", "getEvent", "I", "getX", "getY", "getZ", "hudIcon", "getHudIcon", "cachedDistanceValue", "getCachedDistanceValue", "setCachedDistanceValue", "(I)V", "cachedDistanceText", "getCachedDistanceText", "setCachedDistanceText", "(Ljava/lang/String;)V", "cachedIconSizeBits", "cachedIconWidth", "F", "cachedNameSizeBits", "cachedNameWidth", "cachedDistanceTextForWidth", "cachedDistanceSizeBits", "cachedDistanceWidth", "rain-visuals"})
    public static final class WayPoint {
        @NotNull
        private final String hudIcon;
        private final boolean event;
        private final int y;
        private int cachedDistanceValue;
        private final int x;
        private float cachedNameWidth;
        private final int z;
        private int cachedIconSizeBits;
        @Nullable
        private String cachedDistanceTextForWidth;
        private int cachedNameSizeBits;
        @NotNull
        private String cachedDistanceText;
        private float cachedIconWidth;
        private float cachedDistanceWidth;
        private int cachedDistanceSizeBits;
        @NotNull
        private final String name;

        public final float nameWidth(float size) {
            int sizeBits = Float.floatToRawIntBits(size);
            if (this.cachedNameSizeBits != sizeBits) {
                this.cachedNameSizeBits = sizeBits;
                this.cachedNameWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), this.name, size, 0.0f, 4, null);
            }
            return this.cachedNameWidth;
        }

        public final int getZ() {
            return this.z;
        }

        public final int getCachedDistanceValue() {
            return this.cachedDistanceValue;
        }

        @NotNull
        public final String getHudIcon() {
            return this.hudIcon;
        }

        public final int component4() {
            return this.y;
        }

        public final void setCachedDistanceValue(int n) {
            this.cachedDistanceValue = n;
        }

        @NotNull
        public final WayPoint copy(@NotNull String name, boolean event, int x, int y, int z) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new WayPoint(name, event, x, y, z);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        public final int getX() {
            return this.x;
        }

        public final float iconWidth(@NotNull String icon, float size) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            int sizeBits = Float.floatToRawIntBits(size);
            if (this.cachedIconSizeBits != sizeBits) {
                this.cachedIconSizeBits = sizeBits;
                this.cachedIconWidth = Math.max(\u0637\u063a.INSTANCE.scaled(10.0f), Font.getWidth$default(\u0631\u064e.INSTANCE.getICON(), icon, size, 0.0f, 4, null));
            }
            return this.cachedIconWidth;
        }

        public final boolean getEvent() {
            return this.event;
        }

        public static /* synthetic */ WayPoint copy$default(WayPoint wayPoint, String string, boolean bl, int n, int n2, int n3, int n4, Object object) {
            if ((n4 & 1) != 0) {
                string = wayPoint.name;
            }
            if ((n4 & 2) != 0) {
                bl = wayPoint.event;
            }
            if ((n4 & 4) != 0) {
                n = wayPoint.x;
            }
            if ((n4 & 8) != 0) {
                n2 = wayPoint.y;
            }
            if ((n4 & 0x10) != 0) {
                n3 = wayPoint.z;
            }
            return wayPoint.copy(string, bl, n, n2, n3);
        }

        public final void setCachedDistanceText(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "<set-?>");
            this.cachedDistanceText = string;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getCachedDistanceText() {
            return this.cachedDistanceText;
        }

        public final int getY() {
            return this.y;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WayPoint)) {
                return false;
            }
            WayPoint wayPoint = (WayPoint)other;
            if (!Intrinsics.areEqual(this.name, wayPoint.name)) {
                return false;
            }
            if (this.event != wayPoint.event) {
                return false;
            }
            if (this.x != wayPoint.x) {
                return false;
            }
            if (this.y != wayPoint.y) {
                return false;
            }
            if (this.z != wayPoint.z) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int result = this.name.hashCode();
            result = result * 31 + Boolean.hashCode(this.event);
            result = result * 31 + Integer.hashCode(this.x);
            result = result * 31 + Integer.hashCode(this.y);
            result = result * 31 + Integer.hashCode(this.z);
            return result;
        }

        public final float distanceWidth(@NotNull String text, float size) {
            block3: {
                int sizeBits;
                block2: {
                    Intrinsics.checkNotNullParameter(text, "text");
                    sizeBits = Float.floatToRawIntBits(size);
                    if (!Intrinsics.areEqual(this.cachedDistanceTextForWidth, text)) break block2;
                    if (this.cachedDistanceSizeBits == sizeBits) break block3;
                }
                this.cachedDistanceTextForWidth = text;
                this.cachedDistanceSizeBits = sizeBits;
                this.cachedDistanceWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), text, size, 0.0f, 4, null);
            }
            return this.cachedDistanceWidth;
        }

        public final boolean component2() {
            return this.event;
        }

        @NotNull
        public String toString() {
            return "WayPoint(name=" + this.name + ", event=" + this.event + ", x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
        }

        public final int component5() {
            return this.z;
        }

        public WayPoint(@NotNull String name, boolean event, int x, int y, int z) {
            String string;
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.event = event;
            this.x = x;
            this.y = y;
            this.z = z;
            if (!this.event) {
                string = "I";
            } else {
                String string2 = this.name;
                Locale locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
                String string3 = string2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(string3, "toLowerCase(...)");
                String normalizedName = string3;
                string = StringsKt.contains$default((CharSequence)normalizedName, "meteor", false, 2, null) ? "W" : (StringsKt.contains$default((CharSequence)normalizedName, "beacon", false, 2, null) ? "R" : (StringsKt.contains$default((CharSequence)normalizedName, "mystic", false, 2, null) ? "Y" : (StringsKt.contains$default((CharSequence)normalizedName, "volcano", false, 2, null) ? "T" : "v")));
            }
            this.hudIcon = string;
            this.cachedDistanceValue = Integer.MIN_VALUE;
            this.cachedDistanceText = "";
        }

        public final int component3() {
            return this.x;
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Loxxxde/\u062d\u062d;", "", "<init>", "(Ljava/lang/String;I)V", "REMOVED", "NOT_FOUND", "INVALID_NAME", "SAVE_FAILED", "rain-visuals"})
    public static final class RemoveResult
    extends Enum<RemoveResult> {
        public static final /* enum */ RemoveResult REMOVED = new RemoveResult();
        public static final /* enum */ RemoveResult NOT_FOUND = new RemoveResult();
        public static final /* enum */ RemoveResult SAVE_FAILED;
        public static final /* enum */ RemoveResult INVALID_NAME;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RemoveResult[] $VALUES;

        public static RemoveResult[] values() {
            return (RemoveResult[])$VALUES.clone();
        }

        static {
            INVALID_NAME = new RemoveResult();
            SAVE_FAILED = new RemoveResult();
            $VALUES = RemoveResult.$values();
            $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        }

        @NotNull
        public static EnumEntries<RemoveResult> getEntries() {
            return $ENTRIES;
        }

        private static final /* synthetic */ RemoveResult[] $values() {
            RemoveResult[] removeResultArray = new RemoveResult[4];
            removeResultArray[0] = REMOVED;
            removeResultArray[1] = NOT_FOUND;
            removeResultArray[2] = INVALID_NAME;
            removeResultArray[3] = SAVE_FAILED;
            return removeResultArray;
        }

        public static RemoveResult valueOf(String value) {
            return Enum.valueOf(RemoveResult.class, value);
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2={"Loxxxde/\u0627\u0648;", "", "<init>", "(Ljava/lang/String;I)V", "ADDED", "REPLACED", "UNCHANGED", "INVALID_NAME", "SAVE_FAILED", "rain-visuals"})
    public static final class PutResult
    extends Enum<PutResult> {
        public static final /* enum */ PutResult UNCHANGED;
        public static final /* enum */ PutResult ADDED;
        public static final /* enum */ PutResult REPLACED;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* enum */ PutResult SAVE_FAILED;
        private static final /* synthetic */ PutResult[] $VALUES;
        public static final /* enum */ PutResult INVALID_NAME;

        public static PutResult[] values() {
            return (PutResult[])$VALUES.clone();
        }

        public static PutResult valueOf(String value) {
            return Enum.valueOf(PutResult.class, value);
        }

        private static final /* synthetic */ PutResult[] $values() {
            PutResult[] putResultArray = new PutResult[5];
            putResultArray[0] = ADDED;
            putResultArray[1] = REPLACED;
            putResultArray[2] = UNCHANGED;
            putResultArray[3] = INVALID_NAME;
            putResultArray[4] = SAVE_FAILED;
            return putResultArray;
        }

        @NotNull
        public static EnumEntries<PutResult> getEntries() {
            return $ENTRIES;
        }

        static {
            ADDED = new PutResult();
            REPLACED = new PutResult();
            UNCHANGED = new PutResult();
            INVALID_NAME = new PutResult();
            SAVE_FAILED = new PutResult();
            $VALUES = PutResult.$values();
            $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b\u00a8\u0006\u000e"}, d2={"Loxxxde/\u0628\u0647;", "", "", "x", "y", "<init>", "(FF)V", "F", "getX", "()F", "setX", "(F)V", "getY", "setY", "rain-visuals"})
    private static final class ScreenPoint {
        private float y;
        private float x;

        public /* synthetic */ ScreenPoint(float f, float f2, int n, DefaultConstructorMarker defaultConstructorMarker) {
            if ((n & 1) != 0) {
                f = 0.0f;
            }
            if ((n & 2) != 0) {
                f2 = 0.0f;
            }
            this(f, f2);
        }

        public final void setX(float f) {
            this.x = f;
        }

        public ScreenPoint() {
            this(0.0f, 0.0f, 3, null);
        }

        public final void setY(float f) {
            this.y = f;
        }

        public final float getX() {
            return this.x;
        }

        public ScreenPoint(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public final float getY() {
            return this.y;
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Loxxxde/\u0635\u0642;", "", "<init>", "(Ljava/lang/String;I)V", "ADDED", "ALREADY_EXISTS", "INVALID_NAME", "SAVE_FAILED", "rain-visuals"})
    public static final class AddResult
    extends Enum<AddResult> {
        private static final /* synthetic */ AddResult[] $VALUES;
        public static final /* enum */ AddResult INVALID_NAME;
        public static final /* enum */ AddResult SAVE_FAILED;
        public static final /* enum */ AddResult ALREADY_EXISTS;
        public static final /* enum */ AddResult ADDED;
        private static final /* synthetic */ EnumEntries $ENTRIES;

        public static AddResult valueOf(String value) {
            return Enum.valueOf(AddResult.class, value);
        }

        private static final /* synthetic */ AddResult[] $values() {
            AddResult[] addResultArray = new AddResult[4];
            addResultArray[0] = ADDED;
            addResultArray[1] = ALREADY_EXISTS;
            addResultArray[2] = INVALID_NAME;
            addResultArray[3] = SAVE_FAILED;
            return addResultArray;
        }

        @NotNull
        public static EnumEntries<AddResult> getEntries() {
            return $ENTRIES;
        }

        static {
            ADDED = new AddResult();
            ALREADY_EXISTS = new AddResult();
            INVALID_NAME = new AddResult();
            SAVE_FAILED = new AddResult();
            $VALUES = AddResult.$values();
            $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        }

        public static AddResult[] values() {
            return (AddResult[])$VALUES.clone();
        }
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2={"Loxxxde/\u0634\u0637;", "", "<init>", "(Ljava/lang/String;I)V", "RENAMED", "UNCHANGED", "ALREADY_EXISTS", "NOT_FOUND", "INVALID_NAME", "SAVE_FAILED", "rain-visuals"})
    public static final class RenameResult
    extends Enum<RenameResult> {
        public static final /* enum */ RenameResult ALREADY_EXISTS;
        private static final /* synthetic */ RenameResult[] $VALUES;
        public static final /* enum */ RenameResult INVALID_NAME;
        public static final /* enum */ RenameResult NOT_FOUND;
        public static final /* enum */ RenameResult UNCHANGED;
        private static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* enum */ RenameResult SAVE_FAILED;
        public static final /* enum */ RenameResult RENAMED;

        private static final /* synthetic */ RenameResult[] $values() {
            RenameResult[] renameResultArray = new RenameResult[6];
            renameResultArray[0] = RENAMED;
            renameResultArray[1] = UNCHANGED;
            renameResultArray[2] = ALREADY_EXISTS;
            renameResultArray[3] = NOT_FOUND;
            renameResultArray[4] = INVALID_NAME;
            renameResultArray[5] = SAVE_FAILED;
            return renameResultArray;
        }

        static {
            RENAMED = new RenameResult();
            UNCHANGED = new RenameResult();
            ALREADY_EXISTS = new RenameResult();
            NOT_FOUND = new RenameResult();
            INVALID_NAME = new RenameResult();
            SAVE_FAILED = new RenameResult();
            $VALUES = RenameResult.$values();
            $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        }

        @NotNull
        public static EnumEntries<RenameResult> getEntries() {
            return $ENTRIES;
        }

        public static RenameResult[] values() {
            return (RenameResult[])$VALUES.clone();
        }

        public static RenameResult valueOf(String value) {
            return Enum.valueOf(RenameResult.class, value);
        }
    }
}

