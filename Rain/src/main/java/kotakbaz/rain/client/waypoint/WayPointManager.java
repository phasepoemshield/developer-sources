/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.waypoint;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.interfaces.ILoadable;
import kotakbaz.rain.client.util.color.ColorUtil;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.client.waypoint.A;
import kotakbaz.rain.client.waypoint.B;
import kotakbaz.rain.client.waypoint.C;
import kotakbaz.rain.client.waypoint.a;
import kotakbaz.rain.client.waypoint.a_0;
import kotakbaz.rain.client.waypoint.b;
import kotakbaz.rain.client.waypoint.b_0;
import kotakbaz.rain.client.waypoint.d;
import kotakbaz.rain.module.modules.hud.container.HudStyle;
import kotakbaz.rain.module.modules.render.WayPointModule;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00c8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0006z{|}~\u007fB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b#\u0010\"J\r\u0010%\u001a\u00020$\u00a2\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'\u00a2\u0006\u0004\b)\u0010*J\u001d\u0010.\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+\u00a2\u0006\u0004\b.\u0010/J)\u00104\u001a\u0004\u0018\u0001032\u0006\u00101\u001a\u0002002\u0006\u0010(\u001a\u00020'2\u0006\u00102\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b4\u00105J'\u0010:\u001a\u00020\u00042\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010(\u001a\u00020'H\u0002\u00a2\u0006\u0004\b:\u0010;J/\u0010@\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010?\u001a\u00020<2\u0006\u00102\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020<H\u0002\u00a2\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\n2\u0006\u00102\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\bE\u0010FJ'\u0010K\u001a\u00020'2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020'2\u0006\u0010J\u001a\u00020'H\u0002\u00a2\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\nH\u0002\u00a2\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00042\u0006\u0010P\u001a\u00020OH\u0002\u00a2\u0006\u0004\bQ\u0010RJ\u0019\u0010T\u001a\u0004\u0018\u00010\u00072\u0006\u0010S\u001a\u00020\nH\u0002\u00a2\u0006\u0004\bT\u0010UJ\u0019\u0010T\u001a\u0004\u0018\u00010\u00072\u0006\u0010W\u001a\u00020VH\u0002\u00a2\u0006\u0004\bT\u0010XJ\u000f\u0010Y\u001a\u00020\fH\u0002\u00a2\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b[\u0010\u0003J\u001b\u0010\\\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b^\u0010]J\u001f\u0010b\u001a\u00020_2\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020'H\u0002\u00a2\u0006\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bf\u0010eR\u0014\u0010g\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bg\u0010eR\u001c\u0010j\u001a\n i*\u0004\u0018\u00010h0h8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bj\u0010kR \u0010m\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070l8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bm\u0010nR\u0017\u0010p\u001a\u00020o8\u0006\u00a2\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b%\u0010tR\u0016\u0010u\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bu\u0010tR\u0016\u0010v\u001a\u00020'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bx\u0010wR\u0016\u0010y\u001a\u00020'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\by\u0010w\u00a8\u0006\u0080\u0001"}, d2={"Lkotakbaz/rain/client/waypoint/WayPointManager;", "Lkotakbaz/rain/client/interfaces/ILoadable;", "<init>", "()V", "", "load", "", "Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;", "getWayPoints", "()Ljava/util/List;", "", "name", "", "isValidName", "(Ljava/lang/String;)Z", "hasWaypoint", "event", "Lnet/minecraft/class_2338;", "pos", "Lkotakbaz/rain/client/waypoint/WayPointManager$AddResult;", "add", "(Ljava/lang/String;ZLnet/minecraft/class_2338;)Lkotakbaz/rain/client/waypoint/WayPointManager$AddResult;", "Lkotakbaz/rain/client/waypoint/WayPointManager$PutResult;", "put", "(Ljava/lang/String;ZLnet/minecraft/class_2338;)Lkotakbaz/rain/client/waypoint/WayPointManager$PutResult;", "Lkotakbaz/rain/client/waypoint/WayPointManager$RemoveResult;", "remove", "(Ljava/lang/String;)Lkotakbaz/rain/client/waypoint/WayPointManager$RemoveResult;", "oldName", "newName", "Lkotakbaz/rain/client/waypoint/WayPointManager$RenameResult;", "rename", "(Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/client/waypoint/WayPointManager$RenameResult;", "createQuickWaypoint", "()Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;", "removeLastWaypoint", "", "legacyBindKey", "()I", "", "partialTicks", "renderHud", "(F)V", "Lorg/joml/Matrix4f;", "positionMatrix", "projectionMatrix", "captureProjectionMatrices", "(Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V", "Lnet/minecraft/class_4184;", "camera", "wayPoint", "Lkotakbaz/rain/client/waypoint/WayPointManager$ScreenPoint;", "project", "(Lnet/minecraft/class_4184;FLkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;)Lkotakbaz/rain/client/waypoint/WayPointManager$ScreenPoint;", "Lnet/minecraft/class_1657;", "player", "Lorg/joml/Vector3f;", "result", "calculateViewBobbing", "(Lnet/minecraft/class_1657;Lorg/joml/Vector3f;F)V", "", "playerX", "playerY", "playerZ", "distanceTo", "(DDDLkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;)D", "distance", "formatDistance", "(D)Ljava/lang/String;", "iconFor", "(Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;)Ljava/lang/String;", "Lkotakbaz/rain/client/util/render/font/Font;", "font", "size", "containerHeight", "centeredTopOffset", "(Lkotakbaz/rain/client/util/render/font/Font;FF)F", "nextQuickWaypointName", "()Ljava/lang/String;", "Lcom/google/gson/JsonArray;", "array", "loadWayPoints", "(Lcom/google/gson/JsonArray;)V", "serialized", "deserialize", "(Ljava/lang/String;)Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;", "Lcom/google/gson/JsonObject;", "json", "(Lcom/google/gson/JsonObject;)Lkotakbaz/rain/client/waypoint/WayPointManager$WayPoint;", "save", "()Z", "ensureDirectory", "sanitizeName", "(Ljava/lang/String;)Ljava/lang/String;", "normalize", "Ljava/awt/Color;", "color", "factor", "withAlpha", "(Ljava/awt/Color;F)Ljava/awt/Color;", "ROOT_KEY", "Ljava/lang/String;", "BIND_KEY", "DEFAULT_QUICK_PREFIX", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "Ljava/util/LinkedHashMap;", "wayPointsByName", "Ljava/util/LinkedHashMap;", "Ljava/nio/file/Path;", "filePath", "Ljava/nio/file/Path;", "getFilePath", "()Ljava/nio/file/Path;", "I", "lastRenderPlayerAge", "lastRenderPartialTicks", "F", "previousSpeed", "horizontalSpeed", "WayPoint", "AddResult", "PutResult", "RemoveResult", "RenameResult", "ScreenPoint", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nWayPointManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WayPointManager.kt\nkotakbaz/rain/client/waypoint/WayPointManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,556:1\n1#2:557\n1586#3:558\n1661#3,3:559\n1915#3,2:562\n1915#3,2:564\n1915#3,2:566\n1915#3,2:568\n*S KotlinDebug\n*F\n+ 1 WayPointManager.kt\nkotakbaz/rain/client/waypoint/WayPointManager\n*L\n172#1:558\n172#1:559,3\n181#1:562,2\n219#1:564,2\n439#1:566,2\n477#1:568,2\n*E\n"})
public final class WayPointManager
implements ILoadable {
    @NotNull
    public static final WayPointManager INSTANCE;
    @NotNull
    private static final String a = "waypoints";
    @NotNull
    private static final String A = "bind";
    @NotNull
    private static final String b = "\u0422\u043e\u0447\u043a\u0430";
    private static final Gson B;
    @NotNull
    private static final LinkedHashMap<String, d> c;
    @NotNull
    private static final Path C;
    private static int d;
    private static int D;
    private static float e;
    private static float E;
    private static float f;
    private static Object[] F;
    private static Object G;
    private static Object[] h;
    private static Object[] g;
    private static Object[] H;
    public static int[] i;

    private WayPointManager() {
    }

    @NotNull
    public final Path getFilePath() {
        return C;
    }

    @Override
    public void load() {
        Object object;
        long l2 = -7961577751218807859L;
        long l3 = -8062041997353641363L;
        this.ensureDirectory();
        c.clear();
        int n2 = i[0];
        n2 += i[1];
        d = n2 -= i[2];
        int n3 = i[3];
        n3 ^= i[4];
        if (!Files.exists(C, new LinkOption[n3 += i[5]])) {
            return;
        }
        Object object2 = this;
        try {
            object = object2;
            long l4 = l2;
            int n4 = i[6];
            n4 ^= i[7];
            l2 = l4 ^ (0L ^ l4) & -1L << (n4 ^= i[8]);
            object = Result.cfr_renamed_1(JsonParser.parseString(Files.readString(C)));
        }
        catch (Throwable throwable) {
            object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
        object2 = object;
        JsonElement jsonElement = (JsonElement)(Result.cfr_renamed_3(object2) ? null : object2);
        if (jsonElement == null) {
            return;
        }
        JsonElement jsonElement2 = jsonElement;
        if (jsonElement2.isJsonArray()) {
            JsonArray jsonArray = jsonElement2.getAsJsonArray();
            int n5 = i[9];
            n5 -= i[10];
            int n6 = i[12];
            n6 ^= i[13];
            Intrinsics.checkNotNullExpressionValue(jsonArray, (String)F[n5 ^= i[11]] + (String)F[n6 ^= i[14]]);
            this.loadWayPoints(jsonArray);
        } else if (jsonElement2.isJsonObject()) {
            JsonObject jsonObject = jsonElement2.getAsJsonObject();
            int n7 = i[15];
            n7 ^= i[16];
            JsonElement jsonElement3 = jsonObject.get((String)F[n7 ^= i[17]]);
            if (jsonElement3 != null) {
                JsonElement jsonElement4;
                JsonElement jsonElement5 = jsonElement4 = jsonElement3;
                long l5 = l3;
                int n8 = i[18];
                n8 ^= i[19];
                l3 = l5 ^ (0L ^ l5) & -1L << (n8 ^= i[20]);
                jsonElement3 = jsonElement5.isJsonPrimitive() ? jsonElement4 : null;
                if (jsonElement3 != null) {
                    jsonElement5 = jsonElement3;
                    long l6 = l3;
                    int n9 = i[21];
                    n9 -= i[22];
                    l3 = l6 ^ (0L ^ l6) & -1L << (n9 ^= i[23]);
                    d = jsonElement5.getAsInt();
                }
            }
            int n10 = i[24];
            n10 += i[25];
            JsonArray jsonArray = jsonObject.getAsJsonArray((String)F[n10 -= i[26]]);
            if (jsonArray == null) {
                jsonArray = new JsonArray();
            }
            this.loadWayPoints(jsonArray);
        }
    }

    @NotNull
    public final List<d> getWayPoints() {
        Collection<d> collection = c.values();
        int n2 = i[27];
        n2 -= i[28];
        int n3 = i[30];
        n3 ^= i[31];
        Intrinsics.checkNotNullExpressionValue(collection, (String)F[n2 ^= i[29]] + (String)F[n3 -= i[32]]);
        return CollectionsKt.toList((Iterable)collection);
    }

    public final boolean isValidName(@Nullable String name) {
        boolean bl;
        if (this.sanitizeName(name) != null) {
            boolean bl2 = i[33];
            bl2 += i[34];
            bl = bl2 -= i[35];
        } else {
            boolean bl3 = i[36];
            bl3 ^= i[37];
            bl = bl3 += i[38];
        }
        return bl;
    }

    public final boolean hasWaypoint(@Nullable String name) {
        String string = this.sanitizeName(name);
        if (string == null) {
            boolean bl = i[39];
            bl ^= i[40];
            return bl ^= i[41];
        }
        String string2 = string;
        return c.containsKey(this.normalize(string2));
    }

    @NotNull
    public final a_0 add(@NotNull String name, boolean event, @NotNull BlockPos pos) {
        int n2 = i[42];
        n2 ^= i[43];
        Intrinsics.checkNotNullParameter(name, (String)F[n2 ^= i[44]]);
        int n3 = i[45];
        n3 ^= i[46];
        Intrinsics.checkNotNullParameter(pos, (String)F[n3 ^= i[47]]);
        String string = this.sanitizeName(name);
        if (string == null) {
            return kotakbaz.rain.client.waypoint.A.b;
        }
        String string2 = string;
        String string3 = this.normalize(string2);
        if (c.containsKey(string3)) {
            return kotakbaz.rain.client.waypoint.A.A;
        }
        d d2 = new d(string2, event, pos.getX(), pos.getY(), pos.getZ());
        ((Map)c).put(string3, d2);
        if (!this.save()) {
            c.remove(string3);
            return kotakbaz.rain.client.waypoint.A.B;
        }
        return kotakbaz.rain.client.waypoint.A.a;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ a_0 add$default(WayPointManager wayPointManager, String string, boolean bl, BlockPos blockPos, int n2, Object object) {
        void var3_4;
        int n3;
        void var4_5;
        int n4 = i[48];
        n4 ^= i[49];
        if ((var4_5 & (n4 ^= i[50])) != 0) {
            int n5 = i[51];
            n5 += i[52];
            n3 = n5 -= i[53];
        }
        return wayPointManager.add(string, n3 != 0, (BlockPos)var3_4);
    }

    @NotNull
    public final b put(@NotNull String name, boolean event, @NotNull BlockPos pos) {
        int n2 = i[54];
        n2 ^= i[55];
        Intrinsics.checkNotNullParameter(name, (String)F[n2 += i[56]]);
        int n3 = i[57];
        n3 ^= i[58];
        Intrinsics.checkNotNullParameter(pos, (String)F[n3 += i[59]]);
        String string = this.sanitizeName(name);
        if (string == null) {
            return kotakbaz.rain.client.waypoint.b.B;
        }
        String string2 = string;
        String string3 = this.normalize(string2);
        d d2 = new d(string2, event, pos.getX(), pos.getY(), pos.getZ());
        d d3 = c.get(string3);
        if (Intrinsics.areEqual(d3, d2)) {
            return kotakbaz.rain.client.waypoint.b.b;
        }
        ((Map)c).put(string3, d2);
        if (!this.save()) {
            if (d3 == null) {
                c.remove(string3);
            } else {
                ((Map)c).put(string3, d3);
            }
            return kotakbaz.rain.client.waypoint.b.c;
        }
        return d3 == null ? kotakbaz.rain.client.waypoint.b.a : kotakbaz.rain.client.waypoint.b.A;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ b put$default(WayPointManager wayPointManager, String string, boolean bl, BlockPos blockPos, int n2, Object object) {
        void var3_4;
        int n3;
        void var4_5;
        int n4 = i[60];
        n4 += i[61];
        if ((var4_5 & (n4 -= i[62])) != 0) {
            int n5 = i[63];
            n5 += i[64];
            n3 = n5 -= i[65];
        }
        return wayPointManager.put(string, n3 != 0, (BlockPos)var3_4);
    }

    @NotNull
    public final a remove(@Nullable String name) {
        String string = this.sanitizeName(name);
        if (string == null) {
            return kotakbaz.rain.client.waypoint.a.b;
        }
        String string2 = string;
        String string3 = this.normalize(string2);
        d d2 = (d)c.remove(string3);
        if (d2 == null) {
            return kotakbaz.rain.client.waypoint.a.A;
        }
        d d3 = d2;
        if (!this.save()) {
            ((Map)c).put(string3, d3);
            return kotakbaz.rain.client.waypoint.a.B;
        }
        return kotakbaz.rain.client.waypoint.a.a;
    }

    @NotNull
    public final C rename(@Nullable String oldName, @Nullable String newName) {
        Object object;
        Object object2;
        long l2 = -2617523694970201006L;
        long l3 = -6791112971894101473L;
        long l4 = -6894019954166374826L;
        String string = this.sanitizeName(oldName);
        if (string == null) {
            return kotakbaz.rain.client.waypoint.C.c;
        }
        String string2 = string;
        String string3 = this.sanitizeName(newName);
        if (string3 == null) {
            return kotakbaz.rain.client.waypoint.C.c;
        }
        String string4 = string3;
        String string5 = this.normalize(string2);
        String string6 = this.normalize(string4);
        d d2 = c.get(string5);
        if (d2 == null) {
            return kotakbaz.rain.client.waypoint.C.B;
        }
        d d3 = d2;
        if (Intrinsics.areEqual(string5, string6)) {
            if (Intrinsics.areEqual(d3.getName(), string4)) {
                return kotakbaz.rain.client.waypoint.C.A;
            }
            boolean bl = i[66];
            bl += i[67];
            bl -= i[68];
            int n2 = i[69];
            n2 += i[70];
            n2 ^= i[71];
            int n3 = i[72];
            n3 += i[73];
            int n4 = i[75];
            n4 += i[76];
            int n5 = i[78];
            n5 ^= i[79];
            d d4 = kotakbaz.rain.client.waypoint.d.copy$default(d3, string4, bl, n2, n3 += i[74], n4 += i[77], n5 -= i[80], null);
            ((Map)c).put(string5, d4);
            if (!this.save()) {
                ((Map)c).put(string5, d3);
                return kotakbaz.rain.client.waypoint.C.C;
            }
            return kotakbaz.rain.client.waypoint.C.a;
        }
        if (c.containsKey(string6)) {
            return kotakbaz.rain.client.waypoint.C.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        boolean bl = i[81];
        bl ^= i[82];
        bl ^= i[83];
        int n6 = i[84];
        n6 += i[85];
        n6 += i[86];
        int n7 = i[87];
        n7 += i[88];
        int n8 = i[90];
        n8 ^= i[91];
        int n9 = i[93];
        n9 -= i[94];
        d d5 = kotakbaz.rain.client.waypoint.d.copy$default(d3, string4, bl, n6, n7 ^= i[89], n8 += i[92], n9 ^= i[95], null);
        Set set = linkedHashMap.entrySet();
        int n10 = i[96];
        n10 -= i[97];
        int n11 = i[99];
        n11 ^= i[100];
        Intrinsics.checkNotNullExpressionValue(set, (String)F[n10 += i[98]] + (String)F[n11 -= i[101]]);
        Iterable iterable = set;
        long l5 = l3;
        int n12 = i[102];
        n12 -= i[103];
        l3 = l5 ^ (0L ^ l5) & -1L >>> (n12 -= i[104]);
        Iterable iterable2 = iterable;
        int n13 = i[105];
        n13 -= i[106];
        Collection collection3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, n13 ^= i[107]));
        long l6 = l2;
        int n14 = i[108];
        n14 -= i[109];
        l2 = l6 ^ (0L ^ l6) & -1L >>> (n14 += i[110]);
        Iterator iterator2 = iterable2.iterator();
        while (iterator2.hasNext()) {
            object2 = iterator2.next();
            object = (Map.Entry)object2;
            Collection collection2 = collection3;
            long l7 = l3;
            int n15 = i[111];
            n15 -= i[112];
            l3 = l7 ^ (0L ^ l7) & -1L << (n15 -= i[113]);
            Intrinsics.checkNotNull(object);
            String string7 = (String)object.getKey();
            d d6 = (d)object.getValue();
            collection2.add(Intrinsics.areEqual(string7, string5) ? TuplesKt.to(string6, d5) : TuplesKt.to(string7, d6));
        }
        List list = (List)collection3;
        c.clear();
        iterable = list;
        long l8 = l3;
        int n16 = i[114];
        n16 ^= i[115];
        l3 = l8 ^ (0L ^ l8) & -1L >>> (n16 += i[116]);
        for (Collection collection3 : iterable) {
            Pair pair = (Pair)((Object)collection3);
            long l9 = l4;
            int n17 = i[117];
            n17 -= i[118];
            l4 = l9 ^ (0L ^ l9) & -1L << (n17 += i[119]);
            object2 = (String)pair.component1();
            object = (d)pair.component2();
            ((Map)c).put(object2, object);
        }
        if (!this.save()) {
            c.clear();
            c.putAll(linkedHashMap);
            return kotakbaz.rain.client.waypoint.C.C;
        }
        return kotakbaz.rain.client.waypoint.C.a;
    }

    @Nullable
    public final d createQuickWaypoint() {
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return null;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        String string = this.nextQuickWaypointName();
        boolean bl = i[120];
        bl += i[121];
        bl ^= i[122];
        BlockPos blockPos = clientPlayerEntity2.getBlockPos();
        int n2 = i[123];
        n2 += i[124];
        int n3 = i[126];
        n3 -= i[127];
        Intrinsics.checkNotNullExpressionValue(blockPos, (String)F[n2 += i[125]] + (String)F[n3 ^= i[128]]);
        if (this.add(string, bl, blockPos) != kotakbaz.rain.client.waypoint.A.a) {
            return null;
        }
        return c.get(this.normalize(string));
    }

    @Nullable
    public final d removeLastWaypoint() {
        d d2 = CollectionsKt.lastOrNull(this.getWayPoints());
        if (d2 == null) {
            return null;
        }
        d d3 = d2;
        return this.remove(d3.getName()) == kotakbaz.rain.client.waypoint.a.a ? d3 : null;
    }

    public final int legacyBindKey() {
        return d;
    }

    public final void renderHud(float partialTicks) {
        long l2 = -6922948118849958445L;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (!((Boolean)WayPointModule.INSTANCE.getShowWaypoints().getValue()).booleanValue()) {
            return;
        }
        if (c.isEmpty()) {
            return;
        }
        if (clientPlayerEntity2.age == D) {
            int n2;
            if (partialTicks == e) {
                int n3 = i[129];
                n3 ^= i[130];
                n2 = n3 ^= i[131];
            } else {
                int n4 = i[132];
                n4 ^= i[133];
                n2 = n4 -= i[134];
            }
            if (n2 != 0) {
                return;
            }
        }
        D = clientPlayerEntity2.age;
        e = partialTicks;
        Camera camera = kotakbaz.rain.client.extensions.b.getMc().gameRenderer.getCamera();
        Iterable iterable = this.getWayPoints();
        long l3 = l2;
        int n5 = i[135];
        n5 += i[136];
        l2 = l3 ^ (0L ^ l3) & -1L << (n5 -= i[137]);
        for (Object t2 : iterable) {
            b_0 b_02;
            double d2;
            float f2;
            d d3 = (d)t2;
            long l4 = l2;
            int n6 = i[138];
            n6 -= i[139];
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n6 += i[140]);
            Intrinsics.checkNotNull(camera);
            if (INSTANCE.project(camera, partialTicks, d3) == null || (f2 = WayPointModule.INSTANCE.waypointAlphaByDistance(d2 = INSTANCE.distanceTo(clientPlayerEntity2.getX(), clientPlayerEntity2.getY(), clientPlayerEntity2.getZ(), d3))) <= 0.0f) continue;
            String string = INSTANCE.iconFor(d3);
            String string2 = INSTANCE.formatDistance(d2);
            int n7 = i[141];
            n7 -= i[142];
            String string3 = (String)F[n7 -= i[143]];
            float f3 = HudStyle.INSTANCE.scaled(24.0f);
            float f4 = HudStyle.INSTANCE.scaled(6.0f);
            float f5 = HudStyle.INSTANCE.scaled(5.5f);
            float f6 = HudStyle.INSTANCE.scaled(5.0f);
            float f7 = HudStyle.INSTANCE.scaled(4.0f);
            float f8 = HudStyle.INSTANCE.scaled(4.5f);
            float f9 = HudStyle.INSTANCE.scaled(10.0f);
            float f10 = HudStyle.INSTANCE.scaled(8.4f);
            float f11 = HudStyle.INSTANCE.scaled(8.9f);
            float f12 = HudStyle.INSTANCE.scaled(6.2f);
            float f13 = HudStyle.INSTANCE.scaled(3.0f);
            float f14 = HudStyle.INSTANCE.scaled(3.0f);
            float f15 = HudStyle.INSTANCE.scaled(1.0f);
            float f16 = HudStyle.INSTANCE.scaled(1.2f);
            int n8 = i[144];
            n8 += i[145];
            float f17 = Math.max(HudStyle.INSTANCE.scaled(10.0f), kotakbaz.rain.client.util.render.font.E.getWidth$default(Font.INSTANCE.getICON(), string, f9, 0.0f, n8 ^= i[146], null));
            int n9 = i[147];
            n9 += i[148];
            float f18 = kotakbaz.rain.client.util.render.font.E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), d3.getName(), f10, 0.0f, n9 ^= i[149], null);
            int n10 = i[150];
            n10 -= i[151];
            float f19 = kotakbaz.rain.client.util.render.font.E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), string2, f11, 0.0f, n10 -= i[152], null);
            int n11 = i[153];
            n11 ^= i[154];
            float f20 = kotakbaz.rain.client.util.render.font.E.getWidth$default(Font.INSTANCE.getGS_REGULAR(), string3, f12, 0.0f, n11 += i[155], null);
            float f21 = f19 + f16 + f20;
            float f22 = Math.max(Font.INSTANCE.getGS_MEDIUM().getHeight(f11), Font.INSTANCE.getGS_REGULAR().getHeight(f12));
            float f23 = f21 + f13 * 2.0f;
            float f24 = f22 + f13 * 2.0f;
            float f25 = (f3 - f24) * 0.5f;
            float f26 = f23 + f25 * 2.0f;
            float f27 = f6 + f17 + f7 + f18 + f8 + f26 + f6;
            float f28 = b_02.getX() - f27 * 0.5f;
            float f29 = b_02.getY() - f3 * 0.5f;
            Color color = INSTANCE.withAlpha(HudStyle.INSTANCE.getPANEL_COLOR(), f2);
            Color color2 = INSTANCE.withAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), f2);
            Color color3 = ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), 0.1f * f2);
            Color color4 = ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), 0.2f * f2);
            Color color5 = ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getHEADER_COLOR(), 0.1f * f2);
            Color color6 = INSTANCE.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f2);
            Color color7 = INSTANCE.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f2);
            Color color8 = INSTANCE.withAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), f2);
            Color color9 = INSTANCE.withAlpha(HudStyle.INSTANCE.getVALUE_COLOR(), f2);
            float f30 = f28 + f27 - f26;
            float f31 = f30 - f28;
            float f32 = f30 + f25;
            float f33 = f29 + (f3 - f24) * 0.5f;
            RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).draw(f28, f29, f27, f3, f4, color, 0.9f);
            RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(color2).mix(0.9f).round(new Vector4f(f5, 0.0f, f5, 0.0f)).draw(f28, f29, f31, f3);
            float f34 = HudStyle.INSTANCE.rowDividerWidth();
            float f35 = f3 * 0.48f;
            RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(color3).mix(0.9f).round(f34).draw(f30, f29 + (f3 - f35) * 0.5f, f34, f35);
            RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).drawWithBorder(f32, f33, f23, f24, f14, color4, 0.9f, f15, color5);
            float f36 = f28 + f6;
            float f37 = f29 + INSTANCE.centeredTopOffset(Font.INSTANCE.getICON(), f9, f3);
            float f38 = f36 + f17 + f7;
            float f39 = f29 + INSTANCE.centeredTopOffset(Font.INSTANCE.getGS_MEDIUM(), f10, f3) - HudStyle.INSTANCE.scaled(0.7f);
            int n12 = i[156];
            n12 -= i[157];
            int n13 = i[159];
            n13 ^= i[160];
            kotakbaz.rain.client.util.render.font.E.drawText$default(Font.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_SPECIAL), string, f36, f37, f9, color6, 0.0f, 0.0f, 0.0f, n12 += i[158], 0.0f, n13 += i[161], null);
            int n14 = i[162];
            n14 ^= i[163];
            int n15 = i[165];
            n15 -= i[166];
            kotakbaz.rain.client.util.render.font.E.drawText$default(Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), d3.getName(), f38, f39, f10, color7, 0.0f, 0.0f, 0.0f, n14 ^= i[164], 0.0f, n15 -= i[167], null);
            float f40 = f32 + (f23 - f21) * 0.5f;
            float f41 = f33 + INSTANCE.centeredTopOffset(Font.INSTANCE.getGS_MEDIUM(), f11, f24) - HudStyle.INSTANCE.scaled(0.25f);
            float f42 = f33 + INSTANCE.centeredTopOffset(Font.INSTANCE.getGS_REGULAR(), f12, f24) + HudStyle.INSTANCE.scaled(0.8f);
            int n16 = i[168];
            n16 += i[169];
            int n17 = i[171];
            n17 ^= i[172];
            kotakbaz.rain.client.util.render.font.E.drawText$default(Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), string2, f40, f41, f11, color8, 0.0f, 0.0f, 0.0f, n16 += i[170], 0.0f, n17 -= i[173], null);
            int n18 = i[174];
            n18 += i[175];
            int n19 = i[177];
            n19 += i[178];
            kotakbaz.rain.client.util.render.font.E.drawText$default(Font.INSTANCE.getGS_REGULAR().priority(ClientRenderPipeline.HUD_TEXT), string3, f40 + f19 + f16, f42, f12, color9, 0.0f, 0.0f, 0.0f, n18 -= i[176], 0.0f, n19 -= i[179], null);
        }
    }

    public final void captureProjectionMatrices(@NotNull Matrix4f positionMatrix, @NotNull Matrix4f projectionMatrix) {
        int n2 = i[180];
        n2 ^= i[181];
        Intrinsics.checkNotNullParameter(positionMatrix, (String)F[n2 -= i[182]]);
        int n3 = i[183];
        n3 -= i[184];
        int n4 = i[186];
        n4 -= i[187];
        Intrinsics.checkNotNullParameter(projectionMatrix, (String)F[n3 += i[185]] + (String)F[n4 ^= i[188]]);
    }

    private final b_0 project(Camera camera, float partialTicks, d wayPoint) {
        Vec3d vec3d = camera.getPos();
        Quaternionf quaternionf = RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw());
        Quaternionf quaternionf2 = RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch());
        Quaternionf quaternionf3 = quaternionf.mul((Quaternionfc)quaternionf2, new Quaternionf()).conjugate(new Quaternionf());
        Vector3f vector3f = new Vector3f((float)(vec3d.x - (double)wayPoint.getX()), (float)(vec3d.y - (double)wayPoint.getY()), (float)(vec3d.z - (double)wayPoint.getZ()));
        vector3f.rotate((Quaternionfc)quaternionf3);
        if (((Boolean)kotakbaz.rain.client.extensions.b.getMc().options.getBobView().getValue()).booleanValue() && kotakbaz.rain.client.extensions.b.getMc().cameraEntity instanceof PlayerEntity) {
            Entity entity = kotakbaz.rain.client.extensions.b.getMc().cameraEntity;
            int n2 = i[189];
            n2 -= i[190];
            int n3 = i[192];
            n3 ^= i[193];
            Intrinsics.checkNotNull(entity, (String)F[n2 -= i[191]] + (String)F[n3 -= i[194]]);
            this.calculateViewBobbing((PlayerEntity)entity, vector3f, partialTicks);
        }
        if (vector3f.z >= 0.0f) {
            return null;
        }
        boolean bl = i[195];
        bl ^= i[196];
        double d2 = kotakbaz.rain.client.extensions.b.getMc().gameRenderer.getFov(camera, partialTicks, bl ^= i[197]);
        float f2 = (float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledWidth() / 2.0f;
        float f3 = (float)kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledHeight() / 2.0f;
        float f4 = (float)((double)f3 / ((double)vector3f.z * Math.tan(Math.toRadians(d2 / Double.longBitsToDouble(0x82D47D1C121C1EB7L ^ 0xC2D47D1C121C1EB7L)))));
        float f5 = -vector3f.x * f4 + f2;
        float f6 = f3 - vector3f.y * f4;
        if (Float.isNaN(f5) || Float.isNaN(f6) || Float.isInfinite(f5) || Float.isInfinite(f6)) {
            return null;
        }
        return new B(f5, f6);
    }

    private final void calculateViewBobbing(PlayerEntity player, Vector3f result, float partialTicks) {
        E = f;
        f = (float)player.getAttributeValue(EntityAttributes.MOVEMENT_SPEED);
        float f2 = f - E;
        float f3 = -(f + f2 * partialTicks);
        float f4 = player.strideDistance;
        float f5 = Math.abs(MathHelper.cos((float)(f3 * (float)Math.PI - 0.2f)) * f4) * 5.0f;
        Quaternionf quaternionf = new Quaternionf().setAngleAxis((double)(f5 *= (float)Math.PI / 180), 1.0, 0.0, 0.0).conjugate();
        result.rotate((Quaternionfc)quaternionf);
        float f6 = MathHelper.sin((float)(f3 * (float)Math.PI)) * f4 * 3.0f;
        Quaternionf quaternionf2 = new Quaternionf().setAngleAxis((double)(f6 *= (float)Math.PI / 180), 0.0, 0.0, 1.0).conjugate();
        result.rotate((Quaternionfc)quaternionf2);
        Vector3f vector3f = new Vector3f(MathHelper.sin((float)(f3 * (float)Math.PI)) * f4 * 0.5f, Math.abs(MathHelper.cos((float)(f3 * (float)Math.PI)) * f4), 0.0f);
        result.add((Vector3fc)vector3f);
    }

    private final double distanceTo(double playerX, double playerY, double playerZ, d wayPoint) {
        double d2 = playerX - (double)wayPoint.getX();
        double d3 = playerY - (double)wayPoint.getY();
        double d4 = playerZ - (double)wayPoint.getZ();
        return Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
    }

    private final String formatDistance(double distance) {
        double d2 = (double)MathKt.roundToInt(distance * Double.longBitsToDouble(0x15A31BCAC41C68D9L ^ 0x55871BCAC41C68D9L)) / Double.longBitsToDouble(0x4686A9A173B9F17L ^ 0x444C6A9A173B9F17L);
        return String.valueOf(MathKt.roundToInt(d2));
    }

    private final String iconFor(d wayPoint) {
        String string;
        if (!wayPoint.getEvent()) {
            int n2 = i[198];
            n2 ^= i[199];
            return (String)F[n2 += i[200]];
        }
        String string2 = wayPoint.getName();
        Locale locale = Locale.ROOT;
        int n3 = i[201];
        n3 += i[202];
        Intrinsics.checkNotNullExpressionValue(locale, (String)F[n3 ^= i[203]]);
        String string3 = string2.toLowerCase(locale);
        int n4 = i[204];
        n4 -= i[205];
        int n5 = i[207];
        n5 -= i[208];
        Intrinsics.checkNotNullExpressionValue(string3, (String)F[n4 ^= i[206]] + (String)F[n5 ^= i[209]]);
        String string4 = string3;
        int n6 = i[210];
        n6 += i[211];
        n6 += i[212];
        boolean bl = i[213];
        bl += i[214];
        int n7 = i[216];
        n7 += i[217];
        if (StringsKt.contains$default((CharSequence)string4, (String)F[n6], bl ^= i[215], n7 ^= i[218], null)) {
            int n8 = i[219];
            n8 += i[220];
            string = (String)F[n8 ^= i[221]];
        } else {
            int n9 = i[222];
            n9 += i[223];
            n9 ^= i[224];
            boolean bl2 = i[225];
            bl2 += i[226];
            int n10 = i[228];
            n10 -= i[229];
            if (StringsKt.contains$default((CharSequence)string4, (String)F[n9], bl2 += i[227], n10 -= i[230], null)) {
                int n11 = i[231];
                n11 -= i[232];
                string = (String)F[n11 -= i[233]];
            } else {
                int n12 = i[234];
                n12 += i[235];
                n12 += i[236];
                boolean bl3 = i[237];
                bl3 ^= i[238];
                int n13 = i[240];
                n13 -= i[241];
                if (StringsKt.contains$default((CharSequence)string4, (String)F[n12], bl3 += i[239], n13 += i[242], null)) {
                    int n14 = i[243];
                    n14 += i[244];
                    string = (String)F[n14 -= i[245]];
                } else {
                    int n15 = i[246];
                    n15 ^= i[247];
                    n15 ^= i[248];
                    boolean bl4 = i[249];
                    bl4 -= i[250];
                    int n16 = i[252];
                    n16 += i[253];
                    if (StringsKt.contains$default((CharSequence)string4, (String)F[n15], bl4 ^= i[251], n16 += i[254], null)) {
                        int n17 = i[255];
                        n17 ^= i[256];
                        string = (String)F[n17 ^= i[257]];
                    } else {
                        int n18 = i[258];
                        n18 ^= i[259];
                        string = (String)F[n18 += i[260]];
                    }
                }
            }
        }
        return string;
    }

    private final float centeredTopOffset(E font, float size, float containerHeight) {
        return (containerHeight - font.getHeight(size)) * 0.5f;
    }

    private final String nextQuickWaypointName() {
        long l2 = 2494816569891478325L;
        long l3 = -6265877998917610453L;
        long l4 = 3207777954743755516L;
        int n2 = i[261];
        n2 ^= i[262];
        long l5 = l4;
        int n3 = i[264];
        n3 -= i[265];
        l4 = l5 ^ ((long)c.size() << (n2 ^= i[263]) ^ l5) & -1L << (n3 -= i[266]);
        while (true) {
            int n4 = i[267];
            n4 ^= i[268];
            n4 += i[269];
            int n5 = i[270];
            n5 -= i[271];
            long l6 = l3;
            int n6 = i[273];
            n6 ^= i[274];
            l3 = l6 ^ ((long)((int)(l4 >>> n4)) << (n5 ^= i[272]) ^ l6) & -1L << (n6 ^= i[275]);
            int n7 = i[276];
            n7 -= i[277];
            int n8 = i[279];
            n8 ^= i[280];
            String string = (String)F[n7 ^= i[278]] + (int)(l3 >>> (n8 += i[281]));
            if (!this.hasWaypoint(string)) {
                return string;
            }
            l4 += 0x100000000L;
        }
    }

    private final void loadWayPoints(JsonArray array) {
        long l2 = -7537801302167528501L;
        long l3 = 4816666529906805855L;
        Iterable iterable = array;
        long l4 = l2;
        int n2 = i[282];
        n2 ^= i[283];
        l2 = l4 ^ (0L ^ l4) & -1L << (n2 ^= i[284]);
        for (Object t2 : iterable) {
            d d2;
            d d3;
            JsonElement jsonElement = (JsonElement)t2;
            long l5 = l2;
            int n3 = i[285];
            n3 += i[286];
            l2 = l5 ^ (0L ^ l5) & -1L >>> (n3 += i[287]);
            if (jsonElement.isJsonPrimitive()) {
                String string = jsonElement.getAsString();
                int n4 = i[288];
                n4 -= i[289];
                int n5 = i[291];
                n5 -= i[292];
                Intrinsics.checkNotNullExpressionValue(string, (String)F[n4 += i[290]] + (String)F[n5 ^= i[293]]);
                d3 = INSTANCE.deserialize(string);
            } else if (jsonElement.isJsonObject()) {
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                int n6 = i[294];
                n6 ^= i[295];
                int n7 = i[297];
                n7 += i[298];
                Intrinsics.checkNotNullExpressionValue(jsonObject, (String)F[n6 += i[296]] + (String)F[n7 += i[299]]);
                d3 = INSTANCE.deserialize(jsonObject);
            } else {
                d3 = null;
            }
            if ((d2 = d3) == null) continue;
            d d4 = d2;
            long l6 = l3;
            int n8 = i[300];
            n8 += i[301];
            l3 = l6 ^ (0L ^ l6) & -1L << (n8 ^= i[302]);
            c.putIfAbsent(INSTANCE.normalize(d4.getName()), d4);
        }
    }

    private final d deserialize(String serialized) {
        long l2 = -4515536896905509258L;
        long l3 = 821698132340502512L;
        long l4 = 5035391259755006296L;
        long l5 = -7829033999444237682L;
        int n2 = i[303];
        n2 += i[304];
        Object object = new String[n2 ^= i[305]];
        int n3 = i[306];
        n3 ^= i[307];
        int n4 = i[309];
        n4 ^= i[310];
        object[n3 += WayPointManager.i[308]] = (String)F[n4 ^= i[311]];
        boolean bl = i[312];
        bl -= i[313];
        int n5 = i[315];
        n5 ^= i[316];
        int n6 = i[318];
        n6 += i[319];
        List list = StringsKt.split$default((CharSequence)serialized, object, bl ^= i[314], n5 += i[317], n6 -= i[320], null);
        int n7 = i[321];
        n7 -= i[322];
        if (list.size() != (n7 -= i[323])) {
            return null;
        }
        int n8 = i[324];
        n8 -= i[325];
        String string = this.sanitizeName((String)list.get(n8 ^= i[326]));
        if (string == null) {
            return null;
        }
        object = string;
        int n9 = i[327];
        n9 ^= i[328];
        n9 += i[329];
        int n10 = i[330];
        n10 -= i[331];
        long l6 = l4;
        int n11 = i[333];
        n11 -= i[334];
        l4 = l6 ^ ((long)Boolean.parseBoolean((String)list.get(n9)) << (n10 ^= i[332]) ^ l6) & -1L << (n11 -= i[335]);
        int n12 = i[336];
        n12 ^= i[337];
        Integer n13 = StringsKt.toIntOrNull((String)list.get(n12 += i[338]));
        if (n13 == null) {
            return null;
        }
        long l7 = l4;
        int n14 = i[339];
        n14 ^= i[340];
        l4 = l7 ^ ((long)n13.intValue() ^ l7) & -1L >>> (n14 -= i[341]);
        int n15 = i[342];
        n15 += i[343];
        Integer n16 = StringsKt.toIntOrNull((String)list.get(n15 ^= i[344]));
        if (n16 == null) {
            return null;
        }
        int n17 = i[345];
        n17 ^= i[346];
        long l8 = l5;
        int n18 = i[348];
        n18 ^= i[349];
        l5 = l8 ^ ((long)n16.intValue() << (n17 -= i[347]) ^ l8) & -1L << (n18 ^= i[350]);
        int n19 = i[351];
        n19 ^= i[352];
        Integer n20 = StringsKt.toIntOrNull((String)list.get(n19 -= i[353]));
        if (n20 == null) {
            return null;
        }
        long l9 = l5;
        int n21 = i[354];
        n21 ^= i[355];
        l5 = l9 ^ ((long)n20.intValue() ^ l9) & -1L >>> (n21 += i[356]);
        int n22 = i[357];
        n22 -= i[358];
        int n23 = i[360];
        n23 += i[361];
        return new d((String)object, (boolean)(l4 >>> (n22 -= i[359])), (int)l4, (int)(l5 >>> (n23 += i[362])), (int)l5);
    }

    private final d deserialize(JsonObject json) {
        int n2;
        long l2 = 2392135626151784096L;
        long l3 = 8081254737910539035L;
        long l4 = 8750575862609648722L;
        long l5 = -1190942476499570831L;
        int n3 = i[363];
        n3 -= i[364];
        JsonElement jsonElement = json.get((String)F[n3 += i[365]]);
        String string = this.sanitizeName(jsonElement != null ? jsonElement.getAsString() : null);
        if (string == null) {
            return null;
        }
        String string2 = string;
        int n4 = i[366];
        n4 -= i[367];
        JsonElement jsonElement2 = json.get((String)F[n4 -= i[368]]);
        if (jsonElement2 != null) {
            n2 = jsonElement2.getAsBoolean();
        } else {
            int n5 = i[369];
            n5 ^= i[370];
            n2 = n5 -= i[371];
        }
        int n6 = i[372];
        n6 += i[373];
        long l6 = l4;
        int n7 = i[375];
        n7 ^= i[376];
        l4 = l6 ^ ((long)n2 << (n6 ^= i[374]) ^ l6) & -1L << (n7 += i[377]);
        int n8 = i[378];
        n8 ^= i[379];
        JsonElement jsonElement3 = json.get((String)F[n8 -= i[380]]);
        if (jsonElement3 == null) {
            return null;
        }
        long l7 = l4;
        int n9 = i[381];
        n9 += i[382];
        l4 = l7 ^ ((long)jsonElement3.getAsInt() ^ l7) & -1L >>> (n9 += i[383]);
        int n10 = i[384];
        n10 -= i[385];
        JsonElement jsonElement4 = json.get((String)F[n10 -= i[386]]);
        if (jsonElement4 == null) {
            return null;
        }
        int n11 = i[387];
        n11 -= i[388];
        long l8 = l5;
        int n12 = i[390];
        n12 ^= i[391];
        l5 = l8 ^ ((long)jsonElement4.getAsInt() << (n11 -= i[389]) ^ l8) & -1L << (n12 ^= i[392]);
        int n13 = i[393];
        n13 ^= i[394];
        JsonElement jsonElement5 = json.get((String)F[n13 -= i[395]]);
        if (jsonElement5 == null) {
            return null;
        }
        long l9 = l5;
        int n14 = i[396];
        n14 ^= i[397];
        l5 = l9 ^ ((long)jsonElement5.getAsInt() ^ l9) & -1L >>> (n14 ^= i[398]);
        int n15 = i[399];
        n15 ^= 0xFFFFFFC8;
        int n16 = -124;
        n16 ^= 0x30;
        return new d(string2, (boolean)(l4 >>> (n15 ^= 0x7A)), (int)l4, (int)(l5 >>> (n16 -= -108)), (int)l5);
    }

    private final boolean save() {
        Object object;
        Object object2;
        long l2 = 3090326738605716570L;
        long l3 = -3232759626515925867L;
        long l4 = 5565005325317022179L;
        long l5 = 5882969091340914221L;
        long l6 = 6408684734737033193L;
        long l7 = 3048832634056001839L;
        this.ensureDirectory();
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        Object object3 = this.getWayPoints();
        long l8 = l7;
        int n2 = -64;
        n2 ^= 0x73;
        l7 = l8 ^ (0L ^ l8) & -1L << (n2 ^= 0xFFFFFF93);
        Iterator iterator2 = object3.iterator();
        while (iterator2.hasNext()) {
            object2 = iterator2.next();
            d d2 = (d)object2;
            long l9 = l7;
            int n3 = -147;
            n3 ^= 0xFFFFFFEF;
            l7 = l9 ^ (0L ^ l9) & -1L >>> (n3 += -98);
            long l10 = l5;
            int n4 = -64;
            n4 += 18;
            l5 = l10 ^ ((long)d2.getZ() ^ l10) & -1L >>> (n4 += 78);
            int n5 = -146;
            n5 -= -67;
            long l11 = l5;
            int n6 = 78;
            n6 ^= 0x5A;
            l5 = l11 ^ ((long)d2.getY() << (n5 -= -111) ^ l11) & -1L << (n6 += 12);
            long l12 = l4;
            int n7 = -23;
            n7 += 71;
            l4 = l12 ^ ((long)d2.getX() ^ l12) & -1L >>> (n7 += -16);
            int n8 = -21;
            n8 ^= 0xFFFFFFE4;
            long l13 = l4;
            int n9 = 70;
            n9 -= -85;
            l4 = l13 ^ ((long)d2.getEvent() << (n8 ^= 0x2F) ^ l13) & -1L << (n9 -= 123);
            String string = d2.getName();
            int n10 = -69;
            n10 ^= 0xFFFFFFAE;
            n10 += 8;
            int n11 = -99;
            n11 ^= 0x6D;
            n11 -= -48;
            int n12 = -40;
            n12 -= -40;
            n12 += 56;
            int n13 = 66;
            n13 += 8;
            int n14 = 99;
            n14 ^= 0x18;
            int n15 = 24;
            n15 ^= 5;
            jsonArray.add(string + (String)F[n10] + (boolean)(l4 >>> n11) + (String)F[n12] + (int)l4 + (String)F[n13 -= 74] + (int)(l5 >>> (n14 += -91)) + (String)F[n15 += 9] + (int)l5);
        }
        int n16 = 1;
        n16 += 35;
        jsonObject.add((String)F[n16 ^= 0x16], jsonArray);
        object3 = this;
        try {
            object = (WayPointManager)object3;
            long l14 = l6;
            int n17 = -36;
            n17 += -72;
            l6 = l14 ^ (0L ^ l14) & -1L << (n17 ^= 0xFFFFFFB4);
            int n18 = -188;
            n18 += 67;
            object2 = new OpenOption[n18 += 124];
            int n19 = 22;
            n19 += 18;
            object2[n19 ^= 0x28] = StandardOpenOption.CREATE;
            int n20 = 172;
            n20 += -93;
            object2[n20 += -78] = StandardOpenOption.TRUNCATE_EXISTING;
            int n21 = 21;
            n21 ^= 0xFFFFFFED;
            object2[n21 -= -10] = StandardOpenOption.WRITE;
            object = Result.cfr_renamed_1(Files.writeString(C, (CharSequence)B.toJson(jsonObject), object2));
        }
        catch (Throwable throwable) {
            object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
        return Result.cfr_renamed_4(object);
    }

    private final void ensureDirectory() {
        int n2 = -191;
        n2 += 101;
        Files.createDirectories(C.getParent(), new FileAttribute[n2 += 90]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final String sanitizeName(String name) {
        block5: {
            block4: {
                var6_2 = 9047127843252995340L;
                if (name == null) break block4;
                var2_3 = StringsKt.trim((CharSequence)name).toString();
                if (var2_3 == null) break block4;
                var4_5 = var3_4 = var2_3;
                v0 = var6_2;
                var9_6 = 86;
                var9_6 -= -23;
                var6_2 = v0 ^ (0L ^ v0) & -1L << (var9_6 += -77);
                if (((CharSequence)var4_5).length() > 0) {
                    var11_7 = 12;
                    var11_7 -= 85;
                    v1 = var11_7 ^= -74;
                } else {
                    var13_8 = 39;
                    var13_8 ^= -107;
                    v1 = var13_8 -= -78;
                }
                if (v1 == 0) ** GOTO lbl-1000
                var15_9 = '\u00d9';
                var15_9 += -82;
                var17_10 = 160 != 0;
                var17_10 += -99;
                var19_11 = -64;
                var19_11 ^= 102;
                if (!StringsKt.contains$default((CharSequence)var4_5, var15_9 -= 91, var17_10 ^= 61, var19_11 -= -92, null)) {
                    var21_12 = 47;
                    var21_12 -= 100;
                    v2 = var21_12 += 54;
                } else lbl-1000:
                // 2 sources

                {
                    var23_13 = -99;
                    var23_13 += -28;
                    v2 = var23_13 ^= -127;
                }
                v3 = v2 != 0 ? var3_4 : null;
                break block5;
            }
            v3 = null;
        }
        return v3;
    }

    private final String normalize(String name) {
        String string = name;
        Locale locale = Locale.ROOT;
        int n2 = 202;
        n2 -= 99;
        Intrinsics.checkNotNullExpressionValue(locale, (String)F[n2 -= 87]);
        String string2 = string.toLowerCase(locale);
        int n3 = 29;
        n3 += -102;
        int n4 = -117;
        n4 += 113;
        Intrinsics.checkNotNullExpressionValue(string2, (String)F[n3 ^= 0xFFFFFF82] + (String)F[n4 ^= 0xFFFFFFE9]);
        return string2;
    }

    private final Color withAlpha(Color color, float factor) {
        return ColorUtil.INSTANCE.setAlpha(color, (float)color.getAlpha() / 255.0f * factor);
    }

    static {
        WayPointManager.b();
        long l2 = -5060103227167203877L;
        long l3 = 5073154302578229415L;
        long l4 = -3397946210754325270L;
        long l5 = -6549571763394628319L;
        long l6 = 1204472764050770951L;
        long l7 = 1043360527133453186L;
        long l8 = 3794035915151248766L;
        long l9 = 6438386493037714505L;
        long l10 = -5302555501870043341L;
        long l11 = 3857263874026596732L;
        long l12 = -2261249586131047212L;
        long l13 = 3901187263599191551L;
        long l14 = -5993612589259787950L;
        long l15 = -3762943937911275991L;
        int n2 = -27;
        n2 += 99;
        F = new Object[n2 -= 15];
        long l16 = l15;
        int n3 = -13;
        n3 -= 80;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += 125);
        Object[] objectArray = new Object[3];
        objectArray[0] = g;
        objectArray[1] = 0;
        Object object = WayPointManager.A()[0];
        if (object == null) {
            char[] cArray = "\uac6a\uac59\uac40\uac5c\uacb9\uac71\uac68\uac54\uac61\uac77\uac6c\uacbe\uac51\uacb6\uac71\uacb5\uacb5\uac7c\uac5b\uacba\uac79\uac57\uac63\uac43\uac7f\uac4a\uac5e\uacb4\uac61\uac79\uac5f\uac71\uac4a\uac4a\uac5c\uac51\uac7b\uacbb\uacbb\uac76\uac41\uac65\uac63\uac42\uac4f\uac67\uaca5\uac40\uacb4\uacb8\uac6d\uacb6\uac67\uac68\uac58\uac79\uac5a\uac51\uac7c\uac7b\uaca2\uacb9\uacb9\uac55\uacb9\uac74\uac6d\uac46\uac5b\uac6a\uac6a\uac55\uac5c\uac5b\uac4d\uac6d\uac66\uac4c\uac6d\uac74\uac45\uac61\uac61\uac6f\uaca2\uac41\uacbe\uac6f\uac57\uacb8\uac64\uac79\uacbf\uac65\uac4a\uac7b\uac61\uac6a\uac79\uac41\uacb5\uac62\uac64\uacbe\uac67\uac5b\uac51\uac58\uac79\uac56\uac79\uac45\uac79\uac48\uac61\uac68\uaca2\uac4c\uac59\uac7b\uac4f\uacb8\uac51\uac44\uac71\uac7e\uac4a\uac78\uac4a\uac43\uac78\uac67\uac6b\uac76\uac55\uac6d\uac42\uac41\uac4f\uac59\uac4d\uaca5\uac55\uac42\uac60\uac58\uac77\uac62\uac7f\uac4a\uac67\uac78\uac58\uacba\uaca2\uac5e\uacbf\uac74\uac63\uac5a\uac76\uac47\uac77\uac44\uac4c\uac5f\uacb9\uac78\uac4d\uac59\uacb4\uac55\uaca2\uac54\uaca2\uac4d\uac77\uac47\uac63\uac47\uac67\uacbb\uac44\uac45\uac6a\uac7b\uacb1\uac4b\uac5e\uacba\uac57\uacba\uac43\uacb4\uac59\uac78\uac4a\uac7f\uacb8\uac79\uac43\uac4d\uac4b\uacb4\uaca2\uacbe\uacba\uac7a\uac6d\uac5c\uac56\uac7a\uacb4\uac78\uacb8\uac63\uac48\uac51\uac5b\uac74\uac65\uac43\uac65\uac45\uac44\uac7a\uac54\uac45\uac6b\uac62\uac4f\uac6a\uac65\uac6a\uacb5\uac5b\uac4a\uac42\uac71\uacbb\uac61\uacb8\uac59\uac5b\uac61\uac68\uac5b\uacb1\uac4f\uac5e\uac7a\uac40\uac58\uac56\uaca5\uac45\uac57\uacbb\uac7a\uac65\uac6c\uac71\uac44\uacbc\uac65\uac5f\uac62\uac5a\uac58\uac44\uac44\uac4c\uac79\uac5c\uac47\uac4a\uacb5\uacba\uac6d\uac63\uac5c\uac7b\uac78\uac63\uac46\uac55\uacb9\uac56\uac65\uac64\uac45\uaca5\uac64\uac47\uac6c\uac54\uac48\uac71\uac59\uac79\uac71\uacbc\uac7b\uac44\uac47\uac78\uacb9\uac57\uacbc\uac63\uac66\uac64\uacba\uac78\uac60\uac5b\uacb5\uac54\uac7b\uacbe\uac41\uacbe\uac43\uac59\uac44\uac41\uac57\uac4b\uac62\uac67\uac64\uac6d\uac46\uac4b\uac46\uac58\uac54\uac46\uac55\uac68\uac6f\uac79\uacbf\uac6c\uac6a\uacb1\uac4f\uac5c\uacb4\uac4f\uacb5\uac5e\uac43\uacb9\uac56\uac71\uac4f\uac55\uac41\uac54\uac43\uac56\uac62\uac7a\uac79\uac5a\uac59\uac42\uac5a\uac47\uac4a\uaca2\uacbb\uac62\uac45\uac7f\uac5f\uac67\uac76\uac7e\uac4a\uac59\uac4b\uac41\uac43\uac63\uac6b\uac76\uacbb\uac5b\uac6b\uac54\uac7f\uac67\uac78\uacb6\uac45\uac5f\uac67\uac59\uacb5\uac6b\uacb5\uac6a\uac48\uac67\uac5b\uacbc\uac43\uac7b\uac4f\uac77\uacb1\uaca2\uac67\uac7a\uacba\uac61\uacbc\uac5f\uac77\uac63\uac6a\uac43\uac5c\uac40\uac57\uaca5\uacb9\uac43\uac61\uacb8\uac51\uac5b\uac6a\uac66\uac58\uacba\uac4f\uac54\uac41\uac65\uac60\uac76\uac6d\uac64\uac5c\uac48\uacb4\uaca5\uac67\uac78\uac7b\uac71\uac42\uac54\uac5c\uac54\uac62\uac4f\uac42\uac66\uac4f\uacbe\uacba\uac5c\uac5e\uac64\uac48\uacb4\uac6f\uac67\uac74\uac5a\uacbe\uac77\uac51\uac51\uac71\uac5e\uac64\uac42\uac4d\uac56\uac4a\uac45\uac5f\uaca5\uac74\uacbf\uaca5\uac4c\uac48\uac45\uac55\uac66\uac4d\uac61\uac77\uac4d\uac79\uac48\uacb8\uaca2\uacb4\uacb8\uac7b\uac79\uac7e\uacb1\uac45\uac6f\uacb6\uacb5\uac48\uacb8\uac40\uac63\uacb9\uac59\uac6c\uac79\uaca5\uac6a\uac74\uac4b\uac77\uac6b\uac41\uac5a\uac51\uac4a\uac46\uac42\uac5e\uacb4\uac61\uacb6\uacb1\uacb8\uac78\uaca5\uac65\uacb6\uacb5\uacb1\uac4c\uac68\uac76\uac54\uac63\uac5e\uac58\uac4c\uac57\uac59\uac60\uac4b\uac6a\uac51\uac60\uac77\uacb6\uac54\uac4a\uac68\uac64\uac6c\uac5c\uac7b\uaca2\uacb4\uac60\uac60\uac6a\uac68\uac68\uac71\uacb5\uac71\uac54\uac5e\uac62\uac4a\uac60\uac4b\uac6f\uaca5\uacb9\uac54\uac46\uac4a\uac42\uac7a\uac79\uaca2\uac6a\uac74\uac58\uacb6\uacbc\uacbf\uac71\uac77\uac7e\uac62\uac6d\uac78\uac6f\uac79\uac6f\uacb1\uac6b\uac48\uac6d\uacb1\uac7a\uac4b\uac54\uac48\uacbf\uac4b\uac5e\uac61\uac60\uacba\uac4f\uac4c\uac79\uac42\uacbe\uacbf\uaca2\uacbe\uacb1\uac5e\uac6d\uacbc\uac48\uac74\uac76\uac44\uac6f\uac46\uac7c\uac68\uac60\uac71\uacb5\uac46\uac42\uac6c\uac78\uacbc\uac7a\uac76\uac41\uac79\uacbf\uac4c\uac6b\uac7c\uac5f\uac65\uaca2\uac4d\uac56\uac44\uac7f\uac59\uac71\uac6d\uac4d\uacba\uac64\uacb4\uac41\uac7c\uac5f\uac55\uac67\uac5b\uac71\uac48\uac51\uacbf\uac7f\uac7b\uac61\uac6a\uac4c\uac5f\uac5f\uac5e\uacb4\uac78\uac6c\uac6b\uac78\uac74\uac5b\uac58\uac42\uac55\uac59\uac6a\uacb5\uac67\uac65\uac5e\uacb6\uac5c\uac56\uac60\uaca5\uac7a\uac6c\uac55\uaca2\uac74\uac4d\uac58\uac66\uacba\uac57\uac66\uacb0\uacb0".toCharArray();
            for (int i2 = 0; i2 < 728; ++i2) {
                int n4 = cArray[i2];
                n4 ^= 0x4500;
                n4 ^= 0x1611;
                n4 ^= 0x79C3;
                n4 ^= 0x4CD3;
                n4 ^= 0xDC34;
                n4 += 26183;
                n4 += 53688;
                n4 ^= 0x28FA;
                n4 += 10651;
                n4 -= 17406;
                n4 -= 31343;
                cArray[i2] = (char)(n4 -= 53615);
            }
            object = WayPointManager.A()[0] = new String(cArray);
        }
        objectArray[2] = (String)object;
        char[] cArray = ((String)WayPointManager.a(objectArray)).toCharArray();
        long l17 = l6;
        int n5 = -109;
        n5 ^= 0xFFFFFFF9;
        l6 = l17 ^ (0x1E800000000L ^ l17) & -1L << (n5 -= 74);
        long l18 = l13;
        int n6 = 110;
        n6 -= 84;
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n6 += 6);
        while (true) {
            int n7 = 82;
            n7 += -1;
            if ((int)l13 >= (int)(l6 >>> (n7 ^= 0x71))) break;
            int n8 = (int)l13;
            long l19 = l13;
            int n9 = -126;
            n9 += 34;
            int n10 = 48;
            n10 ^= 0x41;
            l13 = l19 ^ (l19 ^ l19 + (long)(n9 += 93)) & -1L >>> (n10 -= 81);
            long l20 = l9;
            int n11 = -62;
            n11 -= -63;
            l9 = l20 ^ ((long)cArray[n8] ^ l20) & -1L >>> (n11 += 31);
            int n12 = (int)l13;
            long l21 = l13;
            int n13 = -116;
            n13 ^= 0x15;
            int n14 = -39;
            n14 ^= 0xFFFFFF8C;
            l13 = l21 ^ (l21 ^ l21 + (long)(n13 += 104)) & -1L >>> (n14 -= 53);
            int n15 = 160;
            n15 += -20;
            long l22 = l10;
            int n16 = 189;
            n16 += -114;
            l10 = l22 ^ ((long)cArray[n12] << (n15 -= 108) ^ l22) & -1L << (n16 ^= 0x6B);
            int n17 = -73;
            n17 += 81;
            n17 ^= 0x18;
            int n18 = 8;
            n18 += 21;
            long l23 = l12;
            int n19 = -4;
            n19 -= -49;
            l12 = l23 ^ ((long)((int)l9 << n17 | (int)(l10 >>> (n18 ^= 0x3D))) ^ l23) & -1L >>> (n19 -= 13);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n20 = 74;
            n20 += 32;
            l14 = l24 ^ (0L ^ l24) & -1L << (n20 -= 74);
            while (true) {
                int n21 = 76;
                n21 -= 97;
                if ((int)(l14 >>> (n21 += 53)) >= (int)l12) break;
                int n22 = -49;
                n22 ^= 0x3A;
                int n23 = 8;
                n23 += -21;
                cArray2[(int)(l14 >>> (n22 -= -43))] = cArray[(int)l13 + (int)(l14 >>> (n23 -= -45))];
                l14 += 0x100000000L;
            }
            int n24 = 157;
            n24 -= 109;
            int n25 = (int)(l15 >>> (n24 += -16));
            l15 += 0x100000000L;
            WayPointManager.F[n25] = new String(cArray2);
            long l25 = l13;
            int n26 = -32;
            n26 -= -68;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n26 += -4);
        }
        INSTANCE = new WayPointManager();
        B = new GsonBuilder().setPrettyPrinting().create();
        c = new LinkedHashMap();
        int n27 = -99;
        n27 ^= 0xFFFFFFAB;
        n27 += -7;
        int n28 = -74;
        n28 += 37;
        String[] stringArray = new String[n28 ^= 0xFFFFFFD8];
        int n29 = -55;
        n29 ^= 0xFFFFFFD5;
        int n30 = -123;
        n30 ^= 0xFFFFFF94;
        stringArray[n29 += -28] = (String)F[n30 -= -32];
        int n31 = 36;
        n31 ^= 0x69;
        int n32 = -27;
        n32 -= 65;
        stringArray[n31 -= 76] = (String)F[n32 ^= 0xFFFFFF93];
        int n33 = 119;
        n33 ^= 0x16;
        int n34 = -46;
        n34 -= 6;
        stringArray[n33 += -95] = (String)F[n34 += 60];
        Path path = Paths.get(System.getProperty((String)F[n27]), stringArray);
        int n35 = 44;
        n35 -= -20;
        Intrinsics.checkNotNullExpressionValue(path, (String)F[n35 ^= 0x68]);
        C = path;
        int n36 = 205;
        n36 -= 117;
        d = n36 += -89;
        int n37 = -2147483638;
        n37 ^= 0xFFFFFFBB;
        D = n37 ^= 0xFFFFFFB1;
        e = Float.NaN;
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = h;
        if (h == null) {
            objectArray = h = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                g = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x39B ^ 0x38B];
                byArray[0xBC7E ^ 0xBC71] = 0xFFFF43E6 ^ 0xBC71;
                byArray[0x5BCF ^ 0x5BCC] = 0xFFFFA46B ^ 0x5BCC;
                byArray[0x62A7 ^ 0x62AE] = 0x62EA ^ 0x62AE;
                byArray[0xEB4 ^ 0xEB2] = 0xEB0 ^ 0xEB2;
                byArray[0xA1D3 ^ 0xA1D7] = 0xA1D5 ^ 0xA1D7;
                byArray[0x598D ^ 0x5983] = 0x59C8 ^ 0x5983;
                byArray[0x3BF5 ^ 0x3BF8] = 0xFFFFC417 ^ 0x3BF8;
                byArray[0xCF76 ^ 0xCF7D] = 0xCF5B ^ 0xCF7D;
                byArray[0xABF4 ^ 0xABF3] = 0xFFFF5436 ^ 0xABF3;
                byArray[0xA2CC ^ 0xA2C4] = 0xA2D3 ^ 0xA2C4;
                byArray[0xF221 ^ 0xF221] = 0xF245 ^ 0xF221;
                byArray[0x429B ^ 0x4297] = 0x42D2 ^ 0x4297;
                byArray[0xD3A9 ^ 0xD3AB] = 0xD384 ^ 0xD3AB;
                byArray[0x6029 ^ 0x602C] = 0xFFFF9FA3 ^ 0x602C;
                byArray[0x2D47 ^ 0x2D46] = 0x2D5A ^ 0x2D46;
                byArray[0x9FC3 ^ 0x9FC9] = 0x9FCB ^ 0x9FC9;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (G == null) {
                byte[] byArray2 = new byte[0x6BC4 ^ 0x6BE4];
                byArray2[0x29F8 ^ 0x29FD] = 0x2993 ^ 0x29FD;
                byArray2[0xEB4F ^ 0xEB45] = 0xEB58 ^ 0xEB45;
                byArray2[0x10B8B ^ 0x10B82] = 0x10BE5 ^ 0x10B82;
                byArray2[0x170C ^ 0x1718] = 0x177B ^ 0x1718;
                byArray2[0xBF36 ^ 0xBF2B] = 0xBF76 ^ 0xBF2B;
                byArray2[0xEF99 ^ 0xEF88] = 0xFFFF105C ^ 0xEF88;
                byArray2[0xD510 ^ 0xD50A] = 0xD518 ^ 0xD50A;
                byArray2[0x9D4B ^ 0x9D52] = 0xFFFF6298 ^ 0x9D52;
                byArray2[0xCB44 ^ 0xCB52] = 0xCB54 ^ 0xCB52;
                byArray2[0x89C6 ^ 0x89C2] = 0x89D2 ^ 0x89C2;
                byArray2[0x864 ^ 0x87C] = 0xFFFFF799 ^ 0x87C;
                byArray2[0x12F6 ^ 0x12EA] = 0xFFFFED2A ^ 0x12EA;
                byArray2[0x2EFD ^ 0x2EFF] = 0x2EFA ^ 0x2EFF;
                byArray2[0x92DD ^ 0x92DC] = 0xFFFF6D28 ^ 0x92DC;
                byArray2[0x74B5 ^ 0x74B9] = 0x7489 ^ 0x74B9;
                byArray2[0x814 ^ 0x80B] = 0xFFFFF78F ^ 0x80B;
                byArray2[0xD6A8 ^ 0xD6BA] = 0xFFFF2917 ^ 0xD6BA;
                byArray2[0xC78A ^ 0xC791] = 0xFFFF3802 ^ 0xC791;
                byArray2[0x8DDA ^ 0x8DC4] = 0xFFFF727E ^ 0x8DC4;
                byArray2[0x4A58 ^ 0x4A53] = 0x4A67 ^ 0x4A53;
                byArray2[0xA8D6 ^ 0xA8C6] = 0xA8EB ^ 0xA8C6;
                byArray2[0x5F77 ^ 0x5F79] = 0xFFFFA0A8 ^ 0x5F79;
                byArray2[0x59F ^ 0x599] = 0xFFFFFA6A ^ 0x599;
                byArray2[0x1993 ^ 0x1993] = 0x1998 ^ 0x1993;
                byArray2[0x8456 ^ 0x845E] = 0xFFFF7BC3 ^ 0x845E;
                byArray2[0x63 ^ 0x6E] = 0x75 ^ 0x6E;
                byArray2[0xC4B ^ 0xC48] = 0xFFFFF38C ^ 0xC48;
                byArray2[0x3897 ^ 0x3890] = 0x38BD ^ 0x3890;
                byArray2[0xFB1C ^ 0xFB0F] = 0xFB57 ^ 0xFB0F;
                byArray2[0x5ACE ^ 0x5ADB] = 0x5AEE ^ 0x5ADB;
                byArray2[0xDC46 ^ 0xDC49] = 0xFFFF238E ^ 0xDC49;
                byArray2[0x6F14 ^ 0x6F03] = 0x6F6D ^ 0x6F03;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = WayPointManager.A()[1];
                if (object4 == null) {
                    char[] cArray = "\ua25d\ua06f\ua0ce\ua0d9\ua06b\ua1bf\ua242\ua2b4\ua2a9\ua2b5\ua255\ua240\ua24c\ua246\ua256\ua255\ua06c\ua1fc".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0x5B20;
                        n3 -= 12800;
                        n3 += 34978;
                        n3 ^= 0xFCE3;
                        n3 -= 51651;
                        n3 ^= 0xA844;
                        n3 ^= 0xA8C7;
                        n3 ^= 0x5FC8;
                        n3 -= 31880;
                        n3 -= 32051;
                        n3 ^= 0xFBB6;
                        n3 ^= 0xC977;
                        n3 += 41690;
                        n3 += 12316;
                        cArray[i2] = (char)(n3 ^= 0xC33C);
                    }
                    object4 = WayPointManager.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[2] = 10;
                byArray4[11] = -33;
                byArray4[8] = 36;
                byArray4[6] = -16;
                byArray4[14] = -24;
                byArray4[4] = -33;
                byArray4[0] = -88;
                byArray4[15] = 108;
                byArray4[3] = 80;
                byArray4[5] = -72;
                byArray4[10] = 18;
                byArray4[7] = 14;
                byArray4[12] = 58;
                byArray4[9] = -10;
                byArray4[13] = -20;
                byArray4[1] = 96;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 17, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = WayPointManager.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u9370\u93b4\u9366".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 53570;
                        n4 ^= 0xC293;
                        n4 += 62483;
                        n4 ^= 0x3BE5;
                        n4 ^= 0xE326;
                        n4 -= 26054;
                        n4 ^= 0x2197;
                        n4 ^= 0xBFFA;
                        n4 -= 44298;
                        n4 += 64268;
                        n4 += 19181;
                        cArray[i3] = (char)(n4 ^= 0xF14E);
                    }
                    object5 = WayPointManager.A()[2] = new String(cArray);
                }
                G = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = WayPointManager.A()[3];
            if (object6 == null) {
                char[] cArray = "\u04ab\u0477\u043d\u04e1\u046d\u04ac\u046d\u04e1\u043a\u0475\u046d\u043d\u04e7\u043a\u040b\u03d6\u03d6\u03d3\u0420\u03d9".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 578;
                    n5 += 32580;
                    n5 ^= 0xA025;
                    n5 -= 17260;
                    n5 ^= 0xAF8F;
                    n5 ^= 0xD8D1;
                    n5 -= 59442;
                    n5 += 36119;
                    n5 -= 58362;
                    n5 ^= 0xDA1C;
                    n5 ^= 0x6C7C;
                    n5 += 29309;
                    cArray[i4] = (char)(n5 ^= 0x52BF);
                }
                object6 = WayPointManager.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)G), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = H;
        if (H == null) {
            H = new Object[4];
            objectArray = H;
        }
        return objectArray;
    }

    public static void b() {
        i = new int[0x960C ^ 0x979C];
        WayPointManager.i[0x6FF4 ^ 0x6F20] = 0x6F57 ^ 0x6F20;
        WayPointManager.i[0x10EA1 ^ 0x10E18] = 0xFFFEF1F2 ^ 0x10E18;
        WayPointManager.i[0x37DE ^ 0x378E] = 0xFFFFC87E ^ 0x378E;
        WayPointManager.i[0x8678 ^ 0x8685] = 0x86FC ^ 0x8685;
        WayPointManager.i[0x8A40 ^ 0x8A8D] = 0x8AAF ^ 0x8A8D;
        WayPointManager.i[0xF690 ^ 0xF622] = 0xF60B ^ 0xF622;
        WayPointManager.i[0x10ACF ^ 0x10A5F] = 0x10A07 ^ 0x10A5F;
        WayPointManager.i[0x10D93 ^ 0x10DA0] = 0x10DC9 ^ 0x10DA0;
        WayPointManager.i[0x67F9 ^ 0x66AF] = 0xFFFF99DB ^ 0x66AF;
        WayPointManager.i[0xA7CA ^ 0xA683] = 0xA6EE ^ 0xA683;
        WayPointManager.i[0x76FC ^ 0x76EF] = 0x76EF ^ 0x76EF;
        WayPointManager.i[0xF9D0 ^ 0xF9A4] = 0xFFFF0643 ^ 0xF9A4;
        WayPointManager.i[0x4D54 ^ 0x4DB8] = 0x4DA9 ^ 0x4DB8;
        WayPointManager.i[0x36FD ^ 0x37F4] = 0xFFFFC818 ^ 0x37F4;
        WayPointManager.i[0x121F ^ 0x129C] = 0xFFFFED0D ^ 0x129C;
        WayPointManager.i[0xC338 ^ 0xC20D] = 0xFFFF3DEF ^ 0xC20D;
        WayPointManager.i[0x9E21 ^ 0x9E47] = 0x9E9B ^ 0x9E47;
        WayPointManager.i[0x9471 ^ 0x9546] = 0xFFFF6A86 ^ 0x9546;
        WayPointManager.i[0xC70B ^ 0xC685] = 0xC6A1 ^ 0xC685;
        WayPointManager.i[0x1035 ^ 0x1140] = 0xFFFFEE82 ^ 0x1140;
        WayPointManager.i[0x8979 ^ 0x8942] = 0x8908 ^ 0x8942;
        WayPointManager.i[0x6020 ^ 0x601D] = 0x6078 ^ 0x601D;
        WayPointManager.i[0x7B07 ^ 0x7B75] = 0x7B19 ^ 0x7B75;
        WayPointManager.i[0x8E8D ^ 0x8EA8] = 0xFFFF7112 ^ 0x8EA8;
        WayPointManager.i[0x1E0D ^ 0x1E99] = 0x1EFF ^ 0x1E99;
        WayPointManager.i[0x416 ^ 0x481] = 0xFFFFFB17 ^ 0x481;
        WayPointManager.i[0x6A6E ^ 0x6A35] = 0xFFFF95F9 ^ 0x6A35;
        WayPointManager.i[0x421B ^ 0x42AE] = 0xFFFFBD20 ^ 0x42AE;
        WayPointManager.i[0xBBB1 ^ 0xBAEF] = 0xFFFF4547 ^ 0xBAEF;
        WayPointManager.i[0xC8FA ^ 0xC8AE] = 0xC8A8 ^ 0xC8AE;
        WayPointManager.i[0xDE8E ^ 0xDE0E] = 0xFFFF21BA ^ 0xDE0E;
        WayPointManager.i[0x9871 ^ 0x9851] = 0x980C ^ 0x9851;
        WayPointManager.i[0x291A ^ 0x284D] = 0x287C ^ 0x284D;
        WayPointManager.i[0x791 ^ 0x6A5] = 0x6CB ^ 0x6A5;
        WayPointManager.i[0xB2FB ^ 0xB2F0] = 0xB2ED ^ 0xB2F0;
        WayPointManager.i[0xD83A ^ 0xD87F] = 0xFFFF2756 ^ 0xD87F;
        WayPointManager.i[0x53BF ^ 0x5292] = 0xFFFFAD4C ^ 0x5292;
        WayPointManager.i[0xB93C ^ 0xB903] = 0xFFFF469B ^ 0xB903;
        WayPointManager.i[0x4FAD ^ 0x4FD2] = 0x4FC8 ^ 0x4FD2;
        WayPointManager.i[0xFC1B ^ 0xFD49] = 0xFFFF02B9 ^ 0xFD49;
        WayPointManager.i[0x462C ^ 0x4671] = 0x465A ^ 0x4671;
        WayPointManager.i[0x7A04 ^ 0x7A43] = 0xFFFF85E0 ^ 0x7A43;
        WayPointManager.i[0x62E ^ 0x74B] = 0x7DB ^ 0x74B;
        WayPointManager.i[0x4DF4 ^ 0x4D13] = 0x4DB3 ^ 0x4D13;
        WayPointManager.i[0x366D ^ 0x36FC] = 0xFFFFC964 ^ 0x36FC;
        WayPointManager.i[0xC848 ^ 0xC8B3] = 0xC88F ^ 0xC8B3;
        WayPointManager.i[0x6F2E ^ 0x6E2B] = 0x6E7F ^ 0x6E2B;
        WayPointManager.i[0x11EE ^ 0x10ED] = 0xFFFFEF31 ^ 0x10ED;
        WayPointManager.i[0xA82B ^ 0xA8D3] = 0xFFFF5707 ^ 0xA8D3;
        WayPointManager.i[0x2115 ^ 0x219A] = 0xFFFFDE7C ^ 0x219A;
        WayPointManager.i[0x7275 ^ 0x7371] = 0x731B ^ 0x7371;
        WayPointManager.i[0xFB3A ^ 0xFBAF] = 0xFB81 ^ 0xFBAF;
        WayPointManager.i[0x4C6A ^ 0x4D51] = 0x4D22 ^ 0x4D51;
        WayPointManager.i[0xC61E ^ 0xC6A6] = 0xC6D7 ^ 0xC6A6;
        WayPointManager.i[0x78D6 ^ 0x7991] = 0xFFFF8662 ^ 0x7991;
        WayPointManager.i[0x3EF9 ^ 0x3ED0] = 0xFFFFC134 ^ 0x3ED0;
        WayPointManager.i[0x2354 ^ 0x234E] = 0xFFFFDCD4 ^ 0x234E;
        WayPointManager.i[0x6C64 ^ 0x6C32] = 0xFFFF9388 ^ 0x6C32;
        WayPointManager.i[0xA671 ^ 0xA6F9] = 0xA6EB ^ 0xA6F9;
        WayPointManager.i[0x4A23 ^ 0x4B35] = 0xFFFFB485 ^ 0x4B35;
        WayPointManager.i[0xE6B7 ^ 0xE791] = 0xFFFF1868 ^ 0xE791;
        WayPointManager.i[0x864E ^ 0x86CC] = 0xFFFF7954 ^ 0x86CC;
        WayPointManager.i[0x1C55 ^ 0x1C87] = 0xFFFFE313 ^ 0x1C87;
        WayPointManager.i[0x10C43 ^ 0x10C72] = 0x10C50 ^ 0x10C72;
        WayPointManager.i[0x10321 ^ 0x10229] = 0x10228 ^ 0x10229;
        WayPointManager.i[0xD60 ^ 0xDB3] = 0xD93 ^ 0xDB3;
        WayPointManager.i[0x5F8C ^ 0x5EC7] = 0xFFFFA17F ^ 0x5EC7;
        WayPointManager.i[0x2375 ^ 0x236A] = 0xFFFFDC9E ^ 0x236A;
        WayPointManager.i[0xFD6 ^ 0xF58] = 0xFFFFF0B1 ^ 0xF58;
        WayPointManager.i[0xB4FE ^ 0xB5F4] = 0xFFFF4A01 ^ 0xB5F4;
        WayPointManager.i[0x630E ^ 0x6288] = 0xFFFF9D63 ^ 0x6288;
        WayPointManager.i[0x3B1 ^ 0x343] = 0x37D ^ 0x343;
        WayPointManager.i[0x1ED2 ^ 0x1FCC] = 0xFFFFE053 ^ 0x1FCC;
        WayPointManager.i[0x103DC ^ 0x10258] = 0x1020C ^ 0x10258;
        WayPointManager.i[0x3924 ^ 0x3806] = 0x381F ^ 0x3806;
        WayPointManager.i[0xD9A3 ^ 0xD9A9] = 0xFFFF266D ^ 0xD9A9;
        WayPointManager.i[0x9904 ^ 0x997E] = 0x9944 ^ 0x997E;
        WayPointManager.i[0x26F8 ^ 0x266B] = 0xFFFFD9AF ^ 0x266B;
        WayPointManager.i[0x81B9 ^ 0x8098] = 0x80AE ^ 0x8098;
        WayPointManager.i[0x6D9D ^ 0x6D7D] = 0x6D57 ^ 0x6D7D;
        WayPointManager.i[0x103CA ^ 0x103AD] = 0x103D0 ^ 0x103AD;
        WayPointManager.i[0xD1E4 ^ 0xD0DA] = 0xFFFF2FA5 ^ 0xD0DA;
        WayPointManager.i[0xDA1E ^ 0xDB6E] = 0xFFFF2483 ^ 0xDB6E;
        WayPointManager.i[0xEEF0 ^ 0xEFCA] = 0xFFFF1079 ^ 0xEFCA;
        WayPointManager.i[0xE914 ^ 0xE814] = 0xFFFF17AD ^ 0xE814;
        WayPointManager.i[0x3DC9 ^ 0x3DDE] = 0x3DE1 ^ 0x3DDE;
        WayPointManager.i[0x10DC7 ^ 0x10CDF] = 0xFFFEF333 ^ 0x10CDF;
        WayPointManager.i[0xA4C1 ^ 0xA494] = 0xA4D4 ^ 0xA494;
        WayPointManager.i[0xA0E6 ^ 0xA078] = 0xA014 ^ 0xA078;
        WayPointManager.i[0x1005E ^ 0x1003C] = 0x10050 ^ 0x1003C;
        WayPointManager.i[0x953B ^ 0x9529] = 0x952B ^ 0x9529;
        WayPointManager.i[0x658 ^ 0x69D] = 0x6A9 ^ 0x69D;
        WayPointManager.i[0x88B3 ^ 0x8843] = 0x8866 ^ 0x8843;
        WayPointManager.i[0x6DF6 ^ 0x6DBC] = 0xFFFF927C ^ 0x6DBC;
        WayPointManager.i[0xC81D ^ 0xC88B] = 0xC89E ^ 0xC88B;
        WayPointManager.i[0x31E4 ^ 0x30E3] = 0x30C6 ^ 0x30E3;
        WayPointManager.i[0xFEB1 ^ 0xFEDD] = 0xFFFF0134 ^ 0xFEDD;
        WayPointManager.i[0x1D58 ^ 0x1D1C] = 0xFFFFE2B9 ^ 0x1D1C;
        WayPointManager.i[0x4A43 ^ 0x4AC4] = 0xFFFFB57D ^ 0x4AC4;
        WayPointManager.i[0x708F ^ 0x71E4] = 0x71D0 ^ 0x71E4;
        WayPointManager.i[0x10AD0 ^ 0x10A56] = 0xFFFEF583 ^ 0x10A56;
        WayPointManager.i[0x54C1 ^ 0x5487] = 0x54FD ^ 0x5487;
        WayPointManager.i[0xC4E3 ^ 0xC432] = 0xC47B ^ 0xC432;
        WayPointManager.i[0xC633 ^ 0xC767] = 0xFFFF38CF ^ 0xC767;
        WayPointManager.i[0x9FAA ^ 0x9F1B] = 0x9C90 ^ 0x9F1B;
        WayPointManager.i[0x878D ^ 0x87FC] = 0xFFFF7870 ^ 0x87FC;
        WayPointManager.i[0xE971 ^ 0xE9D0] = 0xFFFF1679 ^ 0xE9D0;
        WayPointManager.i[0x2D27 ^ 0x2C7E] = 0xFFFFD395 ^ 0x2C7E;
        WayPointManager.i[0x32C5 ^ 0x32E2] = 0xFFFFCD56 ^ 0x32E2;
        WayPointManager.i[0x3A23 ^ 0x3A2D] = 0xFFFFC5E8 ^ 0x3A2D;
        WayPointManager.i[0x23E2 ^ 0x229C] = 0xFFFFDD37 ^ 0x229C;
        WayPointManager.i[0xD39C ^ 0xD286] = 0xD2C8 ^ 0xD286;
        WayPointManager.i[0x965B ^ 0x96BA] = 0x969C ^ 0x96BA;
        WayPointManager.i[0x1F1A ^ 0x1E55] = 0xFFFFE1B8 ^ 0x1E55;
        WayPointManager.i[0x7F72 ^ 0x7E41] = 0x7E1A ^ 0x7E41;
        WayPointManager.i[0xE9C1 ^ 0xE998] = 0xFFFF165A ^ 0xE998;
        WayPointManager.i[0x12C1 ^ 0x1382] = 0xFFFFEC37 ^ 0x1382;
        WayPointManager.i[0xC30C ^ 0xC321] = 0xFFFF3CBD ^ 0xC321;
        WayPointManager.i[0x642 ^ 0x695] = 0xFFFFF928 ^ 0x695;
        WayPointManager.i[0xB8AE ^ 0xB993] = 0xB9FB ^ 0xB993;
        WayPointManager.i[0x109E4 ^ 0x1088E] = 0x108E5 ^ 0x1088E;
        WayPointManager.i[0x65F ^ 0x728] = 0x756 ^ 0x728;
        WayPointManager.i[0x5353 ^ 0x522B] = 0x524D ^ 0x522B;
        WayPointManager.i[0xED36 ^ 0xEC19] = 0xEC3F ^ 0xEC19;
        WayPointManager.i[0xE058 ^ 0xE0AB] = 0xE0BE ^ 0xE0AB;
        WayPointManager.i[0x50DC ^ 0x5037] = 0x5076 ^ 0x5037;
        WayPointManager.i[0xE5B5 ^ 0xE591] = 0xE5D0 ^ 0xE591;
        WayPointManager.i[0x10DEF ^ 0x10DC5] = 0x10DAB ^ 0x10DC5;
        WayPointManager.i[0x311C ^ 0x31D6] = 0xFFFFCE59 ^ 0x31D6;
        WayPointManager.i[0x6595 ^ 0x641C] = 0x6421 ^ 0x641C;
        WayPointManager.i[0xF7A7 ^ 0xF6A8] = 0xF680 ^ 0xF6A8;
        WayPointManager.i[0x783E ^ 0x7972] = 0x7968 ^ 0x7972;
        WayPointManager.i[0x90E1 ^ 0x90AE] = 0xFFFF6F39 ^ 0x90AE;
        WayPointManager.i[0xD4A8 ^ 0xD5CB] = 0xFFFF2A71 ^ 0xD5CB;
        WayPointManager.i[0x83FE ^ 0x829C] = 0xFFFF7D6D ^ 0x829C;
        WayPointManager.i[0xCC8C ^ 0xCCE3] = 0xFFFF334E ^ 0xCCE3;
        WayPointManager.i[0xDECC ^ 0xDED8] = 0xDEFA ^ 0xDED8;
        WayPointManager.i[0x8714 ^ 0x869F] = 0x8690 ^ 0x869F;
        WayPointManager.i[0x56FA ^ 0x563E] = 0x565E ^ 0x563E;
        WayPointManager.i[0x1088F ^ 0x108B5] = 0x108C2 ^ 0x108B5;
        WayPointManager.i[0x5D9F ^ 0x5DB9] = 0x5DBC ^ 0x5DB9;
        WayPointManager.i[0xF0E1 ^ 0xF02D] = 0xF03D ^ 0xF02D;
        WayPointManager.i[0xAE25 ^ 0xAEC8] = 0xFFFF513D ^ 0xAEC8;
        WayPointManager.i[0x687E ^ 0x68EC] = 0xFFFF9718 ^ 0x68EC;
        WayPointManager.i[0x45CF ^ 0x44F6] = 0xFFFFBB1C ^ 0x44F6;
        WayPointManager.i[0x833A ^ 0x8319] = 0x830F ^ 0x8319;
        WayPointManager.i[0x3683 ^ 0x36E9] = 0xFFFFC936 ^ 0x36E9;
        WayPointManager.i[0xE6F0 ^ 0xE7F6] = 0xE7A7 ^ 0xE7F6;
        WayPointManager.i[0x8DE2 ^ 0x8D41] = 0xFFFF72FF ^ 0x8D41;
        WayPointManager.i[0x2C91 ^ 0x2C50] = 0xFFFFD3FF ^ 0x2C50;
        WayPointManager.i[0xD9 ^ 0xAF] = 0xEF ^ 0xAF;
        WayPointManager.i[0x3155 ^ 0x3024] = 0xFFFFCFC5 ^ 0x3024;
        WayPointManager.i[0x6226 ^ 0x62FE] = 0x62D0 ^ 0x62FE;
        WayPointManager.i[0x6818 ^ 0x6907] = 0xFFFF96B9 ^ 0x6907;
        WayPointManager.i[0x6C6C ^ 0x6C82] = 0xFFFF935A ^ 0x6C82;
        WayPointManager.i[0x1732 ^ 0x17A9] = 0xFFFFE818 ^ 0x17A9;
        WayPointManager.i[0x9DFC ^ 0x9DBD] = 0xFFFF6217 ^ 0x9DBD;
        WayPointManager.i[0xD3B4 ^ 0xD351] = 0xFFFF2CE8 ^ 0xD351;
        WayPointManager.i[0x32DF ^ 0x3200] = 0x3206 ^ 0x3200;
        WayPointManager.i[0x9BB0 ^ 0x9BEF] = 0xFFFF641F ^ 0x9BEF;
        WayPointManager.i[0x10937 ^ 0x1084E] = 0x10846 ^ 0x1084E;
        WayPointManager.i[0x8AE5 ^ 0x8ACB] = 0x8A9E ^ 0x8ACB;
        WayPointManager.i[0x1A43 ^ 0x1B1F] = 0x1B5D ^ 0x1B1F;
        WayPointManager.i[0xE81A ^ 0xE8CA] = 0xFFFF1736 ^ 0xE8CA;
        WayPointManager.i[0xE64E ^ 0xE6E1] = 0xE690 ^ 0xE6E1;
        WayPointManager.i[0x2419 ^ 0x243B] = 0xFFFFDBE1 ^ 0x243B;
        WayPointManager.i[0xBAF3 ^ 0xBA72] = 0xBA7A ^ 0xBA72;
        WayPointManager.i[0x10CDD ^ 0x10DD1] = 0xFFFEF20F ^ 0x10DD1;
        WayPointManager.i[0x8357 ^ 0x8267] = 0x8236 ^ 0x8267;
        WayPointManager.i[0xE00D ^ 0xE04F] = 0xFFFF1FA8 ^ 0xE04F;
        WayPointManager.i[0x109B4 ^ 0x1098D] = 0xFFFEF638 ^ 0x1098D;
        WayPointManager.i[0x5764 ^ 0x57C1] = 0x547C ^ 0x57C1;
        WayPointManager.i[0x458A ^ 0x452C] = 0x452A ^ 0x452C;
        WayPointManager.i[0x3F5E ^ 0x3FDB] = 0xFFFFC045 ^ 0x3FDB;
        WayPointManager.i[0x1933 ^ 0x1931] = 0x197E ^ 0x1931;
        WayPointManager.i[0x875C ^ 0x8614] = 0x8673 ^ 0x8614;
        WayPointManager.i[0x399 ^ 0x3A7] = 0xFFFFFC03 ^ 0x3A7;
        WayPointManager.i[0x5B5E ^ 0x5A0E] = 0xFFFFA580 ^ 0x5A0E;
        WayPointManager.i[0xD571 ^ 0xD580] = 0xD5E1 ^ 0xD580;
        WayPointManager.i[0x94ED ^ 0x9438] = 0xFFFF6B95 ^ 0x9438;
        WayPointManager.i[0xE9E6 ^ 0xE951] = 0xE9C5 ^ 0xE951;
        WayPointManager.i[0xAF2B ^ 0xAE69] = 0xAE49 ^ 0xAE69;
        WayPointManager.i[0xA9AA ^ 0xA8B9] = 0xFFFF576C ^ 0xA8B9;
        WayPointManager.i[0x827D ^ 0x820A] = 0x8209 ^ 0x820A;
        WayPointManager.i[0xA3F3 ^ 0xA3F3] = 0xA340 ^ 0xA3F3;
        WayPointManager.i[0x14F2 ^ 0x14BB] = 0x14A7 ^ 0x14BB;
        WayPointManager.i[0x470F ^ 0x4650] = 0x4671 ^ 0x4650;
        WayPointManager.i[0xD9F3 ^ 0xD8DB] = 0xFFFF277A ^ 0xD8DB;
        WayPointManager.i[0xDCE6 ^ 0xDD90] = 0xDDAE ^ 0xDD90;
        WayPointManager.i[0xF308 ^ 0xF213] = 0xF271 ^ 0xF213;
        WayPointManager.i[0xBF6 ^ 0xA8C] = 0xFFFFF54A ^ 0xA8C;
        WayPointManager.i[0xE1E7 ^ 0xE1FB] = 0xFFFF1E71 ^ 0xE1FB;
        WayPointManager.i[0x3B82 ^ 0x3B36] = 0xFFFFC4FE ^ 0x3B36;
        WayPointManager.i[0x9910 ^ 0x986B] = 0xFFFF67A5 ^ 0x986B;
        WayPointManager.i[0x6545 ^ 0x642C] = 0xFFFF9BA5 ^ 0x642C;
        WayPointManager.i[0x152 ^ 0x1EE] = 0x1F2 ^ 0x1EE;
        WayPointManager.i[0x68A ^ 0x6F2] = 0xFFFFF92A ^ 0x6F2;
        WayPointManager.i[0xEF4D ^ 0xEFE7] = 0xEFDF ^ 0xEFE7;
        WayPointManager.i[0x50F5 ^ 0x5037] = 0x5051 ^ 0x5037;
        WayPointManager.i[0xA522 ^ 0xA5C6] = 0xFFFF5A6D ^ 0xA5C6;
        WayPointManager.i[0xF56A ^ 0xF47E] = 0xF463 ^ 0xF47E;
        WayPointManager.i[0x5249 ^ 0x5355] = 0x5359 ^ 0x5355;
        WayPointManager.i[0xBE5D ^ 0xBE8B] = 0xBE9B ^ 0xBE8B;
        WayPointManager.i[0x6D5 ^ 0x7C5] = 0xFFFFF833 ^ 0x7C5;
        WayPointManager.i[0xDDD6 ^ 0xDDAF] = 0xDDCD ^ 0xDDAF;
        WayPointManager.i[0x12AB ^ 0x1241] = 0xFFFFEDFC ^ 0x1241;
        WayPointManager.i[0x5B11 ^ 0x5A44] = 0x5A6E ^ 0x5A44;
        WayPointManager.i[0x8817 ^ 0x886A] = 0x8843 ^ 0x886A;
        WayPointManager.i[0x694A ^ 0x6984] = 0xFFFF964E ^ 0x6984;
        WayPointManager.i[0x85D ^ 0x89B] = 0x881 ^ 0x89B;
        WayPointManager.i[0xC15A ^ 0xC195] = 0xC1EC ^ 0xC195;
        WayPointManager.i[0x1041C ^ 0x1051D] = 0xFFFEFA85 ^ 0x1051D;
        WayPointManager.i[0x421E ^ 0x4253] = 0x420E ^ 0x4253;
        WayPointManager.i[0x661C ^ 0x6712] = 0xFFFF98EC ^ 0x6712;
        WayPointManager.i[0xB781 ^ 0xB77D] = 0xFFFF4895 ^ 0xB77D;
        WayPointManager.i[0x5BFC ^ 0x5BA2] = 0x5B9F ^ 0x5BA2;
        WayPointManager.i[0xDB1 ^ 0xCDE] = 0xFFFFF351 ^ 0xCDE;
        WayPointManager.i[0x12C1 ^ 0x134E] = 0xFFFFECDC ^ 0x134E;
        WayPointManager.i[0x32C6 ^ 0x3262] = 0x325C ^ 0x3262;
        WayPointManager.i[0x3DC6 ^ 0x3CCD] = 0xFFFFC33C ^ 0x3CCD;
        WayPointManager.i[0x76FF ^ 0x765D] = 0xFFFF89DD ^ 0x765D;
        WayPointManager.i[0xAAF5 ^ 0xAA8E] = 0xFFFF5546 ^ 0xAA8E;
        WayPointManager.i[0xA2A7 ^ 0xA20B] = 0xA279 ^ 0xA20B;
        WayPointManager.i[0x5A20 ^ 0x5B61] = 0xFFFFA4BB ^ 0x5B61;
        WayPointManager.i[0x814 ^ 0x8D4] = 0xFFFFF7FE ^ 0x8D4;
        WayPointManager.i[0xB0C ^ 0xA6D] = 0xFFFFF5AC ^ 0xA6D;
        WayPointManager.i[0x51ED ^ 0x51A1] = 0xFFFFAE07 ^ 0x51A1;
        WayPointManager.i[0x72E3 ^ 0x7384] = 0x73EA ^ 0x7384;
        WayPointManager.i[0x709A ^ 0x71E6] = 0xFFFF8E3A ^ 0x71E6;
        WayPointManager.i[0xD524 ^ 0xD45B] = 0xFFFF2B9C ^ 0xD45B;
        WayPointManager.i[0xFB3A ^ 0xFB6D] = 0xFFFF0489 ^ 0xFB6D;
        WayPointManager.i[0x10A08 ^ 0x10AA8] = 0x10A98 ^ 0x10AA8;
        WayPointManager.i[0xE36B ^ 0xE216] = 0xE2B8 ^ 0xE216;
        WayPointManager.i[0xAC2B ^ 0xADA3] = 0xAD94 ^ 0xADA3;
        WayPointManager.i[0xD377 ^ 0xD31C] = 0xD319 ^ 0xD31C;
        WayPointManager.i[0xBF64 ^ 0xBF72] = 0xBF29 ^ 0xBF72;
        WayPointManager.i[0xFF32 ^ 0xFF2C] = 0xFFFF00BB ^ 0xFF2C;
        WayPointManager.i[0x1D40 ^ 0x1D4F] = 0x1D1F ^ 0x1D4F;
        WayPointManager.i[0x560C ^ 0x577F] = 0x5715 ^ 0x577F;
        WayPointManager.i[0x10A19 ^ 0x10AD1] = 0xFFFEF530 ^ 0x10AD1;
        WayPointManager.i[0xA21D ^ 0xA27C] = 0xFFFF5DC7 ^ 0xA27C;
        WayPointManager.i[0x9974 ^ 0x98F3] = 0xFFFF670F ^ 0x98F3;
        WayPointManager.i[0xB637 ^ 0xB772] = 0xB723 ^ 0xB772;
        WayPointManager.i[0x283B ^ 0x2855] = 0x281B ^ 0x2855;
        WayPointManager.i[0x7C39 ^ 0x7C34] = 0xFFFF83EB ^ 0x7C34;
        WayPointManager.i[0x5494 ^ 0x551E] = 0x5530 ^ 0x551E;
        WayPointManager.i[0xA65F ^ 0xA6E2] = 0xFFFF5925 ^ 0xA6E2;
        WayPointManager.i[0x4EB3 ^ 0x4FFE] = 0xFFFFB015 ^ 0x4FFE;
        WayPointManager.i[0x3D0A ^ 0x3C50] = 0xFFFFC3D5 ^ 0x3C50;
        WayPointManager.i[0x5613 ^ 0x56BE] = 0x56DD ^ 0x56BE;
        WayPointManager.i[0x47D1 ^ 0x47B5] = 0x47F2 ^ 0x47B5;
        WayPointManager.i[0x2939 ^ 0x2813] = 0x2821 ^ 0x2813;
        WayPointManager.i[0x44DF ^ 0x4456] = 0xFFFFBBFD ^ 0x4456;
        WayPointManager.i[0x10DAC ^ 0x10DEC] = 0x10DFE ^ 0x10DEC;
        WayPointManager.i[0xFA83 ^ 0xFA1F] = 0xFFFF054D ^ 0xFA1F;
        WayPointManager.i[0x1F40 ^ 0x1F87] = 0x1FB9 ^ 0x1F87;
        WayPointManager.i[0xC129 ^ 0xC078] = 0xFFFF3FE4 ^ 0xC078;
        WayPointManager.i[0x4C64 ^ 0x4D58] = 0xFFFFB2B3 ^ 0x4D58;
        WayPointManager.i[0x28D4 ^ 0x29C3] = 0x2984 ^ 0x29C3;
        WayPointManager.i[0xF989 ^ 0xF952] = 0xF96D ^ 0xF952;
        WayPointManager.i[0x845D ^ 0x8476] = 0xFFFF7B9B ^ 0x8476;
        WayPointManager.i[0x54AD ^ 0x55F0] = 0xFFFFAA3A ^ 0x55F0;
        WayPointManager.i[0x1515 ^ 0x155D] = 0x1579 ^ 0x155D;
        WayPointManager.i[0xC0EE ^ 0xC062] = 0xC01C ^ 0xC062;
        WayPointManager.i[0x1C33 ^ 0x1D5B] = 0x1D77 ^ 0x1D5B;
        WayPointManager.i[0xF5B0 ^ 0xF59C] = 0xFFFF0A16 ^ 0xF59C;
        WayPointManager.i[0xCECA ^ 0xCF92] = 0xFFFF3034 ^ 0xCF92;
        WayPointManager.i[0x61B2 ^ 0x6179] = 0xFFFF9E8B ^ 0x6179;
        WayPointManager.i[0x2B3F ^ 0x2B4F] = 0x2B4E ^ 0x2B4F;
        WayPointManager.i[0x962E ^ 0x97AF] = 0x97E7 ^ 0x97AF;
        WayPointManager.i[0x4613 ^ 0x4666] = 0x463B ^ 0x4666;
        WayPointManager.i[0xC726 ^ 0xC7FC] = 0xC7CB ^ 0xC7FC;
        WayPointManager.i[0x2EA7 ^ 0x2E11] = 0x2E3B ^ 0x2E11;
        WayPointManager.i[0xD657 ^ 0xD742] = 0xD731 ^ 0xD742;
        WayPointManager.i[0x948 ^ 0x94D] = 0xFFFFF69D ^ 0x94D;
        WayPointManager.i[0x2D2B ^ 0x2C08] = 0xFFFFD3EF ^ 0x2C08;
        WayPointManager.i[0x27D8 ^ 0x27DB] = 0xFFFFD833 ^ 0x27DB;
        WayPointManager.i[0x109C1 ^ 0x108E4] = 0xFFFEF775 ^ 0x108E4;
        WayPointManager.i[0xFEEA ^ 0xFE87] = 0xFE90 ^ 0xFE87;
        WayPointManager.i[0x59B0 ^ 0x59D8] = 0x59E7 ^ 0x59D8;
        WayPointManager.i[0x8CCB ^ 0x8DB9] = 0xFFFF7232 ^ 0x8DB9;
        WayPointManager.i[0x7446 ^ 0x75C5] = 0x75EC ^ 0x75C5;
        WayPointManager.i[0xF2E8 ^ 0xF2C9] = 0xF2F4 ^ 0xF2C9;
        WayPointManager.i[0x7259 ^ 0x7203] = 0x7253 ^ 0x7203;
        WayPointManager.i[0x3D0D ^ 0x3D09] = 0xFFFFC2D1 ^ 0x3D09;
        WayPointManager.i[0xB443 ^ 0xB4C7] = 0xB48C ^ 0xB4C7;
        WayPointManager.i[0x9130 ^ 0x9173] = 0xFFFF6ECD ^ 0x9173;
        WayPointManager.i[0xEF56 ^ 0xEF63] = 0xEF64 ^ 0xEF63;
        WayPointManager.i[0x5AE8 ^ 0x5A8B] = 0xFFFFA513 ^ 0x5A8B;
        WayPointManager.i[0x21B1 ^ 0x210A] = 0xFFFFDEBC ^ 0x210A;
        WayPointManager.i[0x1371 ^ 0x1247] = 0x1245 ^ 0x1247;
        WayPointManager.i[0x5440 ^ 0x54E7] = 0xFFFFAB30 ^ 0x54E7;
        WayPointManager.i[0xFE69 ^ 0xFE61] = 0xFFFF01D3 ^ 0xFE61;
        WayPointManager.i[0xBF3A ^ 0xBE5E] = 0xFFFF418B ^ 0xBE5E;
        WayPointManager.i[0x5D86 ^ 0x5CCC] = 0xFFFFA33E ^ 0x5CCC;
        WayPointManager.i[0x7519 ^ 0x75E3] = 0x7596 ^ 0x75E3;
        WayPointManager.i[0x7E0E ^ 0x7F48] = 0xFFFF80B3 ^ 0x7F48;
        WayPointManager.i[0x9A6C ^ 0x9B4C] = 0x9B62 ^ 0x9B4C;
        WayPointManager.i[0x569C ^ 0x569B] = 0xFFFFA96C ^ 0x569B;
        WayPointManager.i[0xDE19 ^ 0xDE04] = 0xFFFF21F5 ^ 0xDE04;
        WayPointManager.i[0xE1F5 ^ 0xE1BB] = 0xFFFF1E22 ^ 0xE1BB;
        WayPointManager.i[0xC5CB ^ 0xC571] = 0xFFFF3ACF ^ 0xC571;
        WayPointManager.i[0x2EC5 ^ 0x2E6D] = 0x2E51 ^ 0x2E6D;
        WayPointManager.i[0x38F6 ^ 0x3885] = 0x38D0 ^ 0x3885;
        WayPointManager.i[0xD23B ^ 0xD31F] = 0xD333 ^ 0xD31F;
        WayPointManager.i[0x4F16 ^ 0x4FFE] = 0x4FF3 ^ 0x4FFE;
        WayPointManager.i[0x1375 ^ 0x13C5] = 0xFFFFEC4B ^ 0x13C5;
        WayPointManager.i[0xFF5A ^ 0xFED8] = 0xFEB0 ^ 0xFED8;
        WayPointManager.i[0x9FEE ^ 0x9FEF] = 0xFFFF6074 ^ 0x9FEF;
        WayPointManager.i[0xC019 ^ 0xC114] = 0xFFFF3EE5 ^ 0xC114;
        WayPointManager.i[0x4FEC ^ 0x4F74] = 0x4F0F ^ 0x4F74;
        WayPointManager.i[0xA04E ^ 0xA0B7] = 0xA006 ^ 0xA0B7;
        WayPointManager.i[0x20F0 ^ 0x2059] = 0xFFFFDFD5 ^ 0x2059;
        WayPointManager.i[0xF744 ^ 0xF79A] = 0xF7B1 ^ 0xF79A;
        WayPointManager.i[0x8D89 ^ 0x8DF5] = 0x8DC4 ^ 0x8DF5;
        WayPointManager.i[0xFE02 ^ 0xFF4C] = 0xFFFF0092 ^ 0xFF4C;
        WayPointManager.i[0x10B5E ^ 0x10A33] = 0x10A17 ^ 0x10A33;
        WayPointManager.i[0x10A3F ^ 0x10AFC] = 0x10AA9 ^ 0x10AFC;
        WayPointManager.i[0x3FAA ^ 0x3ECA] = 0xFFFFC12E ^ 0x3ECA;
        WayPointManager.i[0xAEBD ^ 0xAFAC] = 0xFFFF5051 ^ 0xAFAC;
        WayPointManager.i[0x8CB1 ^ 0x8C2B] = 0x8C19 ^ 0x8C2B;
        WayPointManager.i[0x15E3 ^ 0x155C] = 0xFFFFEAC9 ^ 0x155C;
        WayPointManager.i[0x58D6 ^ 0x59FA] = 0x59B7 ^ 0x59FA;
        WayPointManager.i[0xDC13 ^ 0xDC0B] = 0xFFFF2361 ^ 0xDC0B;
        WayPointManager.i[0xB50D ^ 0xB45E] = 0xFFFF4BBC ^ 0xB45E;
        WayPointManager.i[0x5E89 ^ 0x5E7F] = 0x5E13 ^ 0x5E7F;
        WayPointManager.i[0xEDB1 ^ 0xED1A] = 0xE92B ^ 0xED1A;
        WayPointManager.i[0x103EC ^ 0x103BF] = 0xFFFEFC5C ^ 0x103BF;
        WayPointManager.i[0xDDD9 ^ 0xDD92] = 0xFFFF226F ^ 0xDD92;
        WayPointManager.i[0x5F49 ^ 0x5E4B] = 0x5E0A ^ 0x5E4B;
        WayPointManager.i[0xE6B5 ^ 0xE638] = 0xFFFF19C5 ^ 0xE638;
        WayPointManager.i[0x8042 ^ 0x80DD] = 0x84DA ^ 0x80DD;
        WayPointManager.i[0x52F7 ^ 0x52CB] = 0xFFFFAD8A ^ 0x52CB;
        WayPointManager.i[0xD25A ^ 0xD23A] = 0xFFFF2D68 ^ 0xD23A;
        WayPointManager.i[0xEF4B ^ 0xEF5E] = 0xEF24 ^ 0xEF5E;
        WayPointManager.i[0x1202 ^ 0x12DF] = 0x12F0 ^ 0x12DF;
        WayPointManager.i[0xB9B4 ^ 0xB8D8] = 0xB898 ^ 0xB8D8;
        WayPointManager.i[0xD8A1 ^ 0xD993] = 0xFFFF265A ^ 0xD993;
        WayPointManager.i[0x1724 ^ 0x1714] = 0x175A ^ 0x1714;
        WayPointManager.i[0x7F46 ^ 0x7E7E] = 0xFFFF81E3 ^ 0x7E7E;
        WayPointManager.i[0xD578 ^ 0xD4FD] = 0xFFFF2B48 ^ 0xD4FD;
        WayPointManager.i[0xD27 ^ 0xC49] = 0xFFFFF3E6 ^ 0xC49;
        WayPointManager.i[0x9C80 ^ 0x9CB7] = 0xFFFF633C ^ 0x9CB7;
        WayPointManager.i[0x1083A ^ 0x108B0] = 0xFFFEF75A ^ 0x108B0;
        WayPointManager.i[0xCF3B ^ 0xCF20] = 0xFFFF307C ^ 0xCF20;
        WayPointManager.i[0xD975 ^ 0xD9CB] = 0xD9FA ^ 0xD9CB;
        WayPointManager.i[0xB254 ^ 0xB37F] = 0xFFFF4C93 ^ 0xB37F;
        WayPointManager.i[0xCF4A ^ 0xCE0E] = 0xCE42 ^ 0xCE0E;
        WayPointManager.i[0xFB74 ^ 0xFBBD] = 0xFBEB ^ 0xFBBD;
        WayPointManager.i[0xB7EB ^ 0xB7FB] = 0xB78A ^ 0xB7FB;
        WayPointManager.i[0x71DF ^ 0x70EE] = 0x7098 ^ 0x70EE;
        WayPointManager.i[0x8CDC ^ 0x8C35] = 0x8C48 ^ 0x8C35;
        WayPointManager.i[0x7D06 ^ 0x7C14] = 0x7C1C ^ 0x7C14;
        WayPointManager.i[0x808B ^ 0x80DA] = 0xFFFF7F1D ^ 0x80DA;
        WayPointManager.i[0x413 ^ 0x44B] = 0xFFFFFB95 ^ 0x44B;
        WayPointManager.i[0x1075C ^ 0x10764] = 0x10750 ^ 0x10764;
        WayPointManager.i[0x3B2A ^ 0x3A71] = 0x3A3F ^ 0x3A71;
        WayPointManager.i[0xC35E ^ 0xC279] = 0xFFFF3DF1 ^ 0xC279;
        WayPointManager.i[0xBCD3 ^ 0xBC58] = 0xBC10 ^ 0xBC58;
        WayPointManager.i[0x6925 ^ 0x6996] = 0xFFFF9642 ^ 0x6996;
        WayPointManager.i[0x8DF9 ^ 0x8CD0] = 0x8CD7 ^ 0x8CD0;
        WayPointManager.i[0xD247 ^ 0xD26F] = 0xD23F ^ 0xD26F;
        WayPointManager.i[0x8C19 ^ 0x8C84] = 0xFFFF733A ^ 0x8C84;
        WayPointManager.i[0x491A ^ 0x49EF] = 0xFFFFB65C ^ 0x49EF;
        WayPointManager.i[0xBA04 ^ 0xBA02] = 0xBA67 ^ 0xBA02;
        WayPointManager.i[0x6194 ^ 0x619D] = 0xFFFF9E63 ^ 0x619D;
        WayPointManager.i[0xAE9F ^ 0xAFDF] = 0xFFFF5046 ^ 0xAFDF;
        WayPointManager.i[0xB6E4 ^ 0xB6D2] = 0xB6B3 ^ 0xB6D2;
        WayPointManager.i[0x4F95 ^ 0x4F76] = 0xFFFFB0B3 ^ 0x4F76;
        WayPointManager.i[0x4187 ^ 0x4129] = 0xFFFFBE34 ^ 0x4129;
        WayPointManager.i[0xF471 ^ 0xF45E] = 0xFFFF0B8E ^ 0xF45E;
        WayPointManager.i[0x92E1 ^ 0x9238] = 0x923F ^ 0x9238;
        WayPointManager.i[0x7B1D ^ 0x7A00] = 0x7AC3 ^ 0x7A00;
        WayPointManager.i[0xB907 ^ 0xB9F0] = 0xFFFF4665 ^ 0xB9F0;
        WayPointManager.i[0x473C ^ 0x4725] = 0x4774 ^ 0x4725;
        WayPointManager.i[0xD7EB ^ 0xD782] = 0xFFFF286C ^ 0xD782;
        WayPointManager.i[0xB5D8 ^ 0xB454] = 0xFFFF4BCE ^ 0xB454;
        WayPointManager.i[0x26D5 ^ 0x26D9] = 0x26F5 ^ 0x26D9;
        WayPointManager.i[0x44F7 ^ 0x44E6] = 0x44CC ^ 0x44E6;
        WayPointManager.i[0x8AB8 ^ 0x8AE4] = 0x8A80 ^ 0x8AE4;
        WayPointManager.i[0xFA9A ^ 0xFA46] = 0xFFFF05A8 ^ 0xFA46;
        WayPointManager.i[0xC72C ^ 0xC6A1] = 0xFFFF393F ^ 0xC6A1;
        WayPointManager.i[0xBF7C ^ 0xBEFC] = 0xBE46 ^ 0xBEFC;
        WayPointManager.i[0x6241 ^ 0x636F] = 0x6364 ^ 0x636F;
        WayPointManager.i[0x3D1B ^ 0x3DFD] = 0xFFFFC20D ^ 0x3DFD;
        WayPointManager.i[0xE59 ^ 0xE27] = 0xFFFFF1E6 ^ 0xE27;
        WayPointManager.i[0x105A ^ 0x1068] = 0x1006 ^ 0x1068;
        WayPointManager.i[0xEC8F ^ 0xEDB0] = 0xED90 ^ 0xEDB0;
        WayPointManager.i[0xA0AF ^ 0xA1C9] = 0xA1CB ^ 0xA1C9;
        WayPointManager.i[0xBE7E ^ 0xBE1B] = 0xFFFF41CA ^ 0xBE1B;
        WayPointManager.i[0xD765 ^ 0xD751] = 0xFFFF28CF ^ 0xD751;
        WayPointManager.i[0x74B0 ^ 0x7452] = 0x7447 ^ 0x7452;
        WayPointManager.i[0xA026 ^ 0xA0BF] = 0xA0DE ^ 0xA0BF;
        WayPointManager.i[0xA66D ^ 0xA63F] = 0xA61B ^ 0xA63F;
        WayPointManager.i[0xAA50 ^ 0xAB24] = 0xAB78 ^ 0xAB24;
        WayPointManager.i[0x8EC9 ^ 0x8E37] = 0xFFFF7196 ^ 0x8E37;
        WayPointManager.i[0x365E ^ 0x36B1] = 0xFFFFC962 ^ 0x36B1;
        WayPointManager.i[0x5043 ^ 0x515A] = 0x512F ^ 0x515A;
        WayPointManager.i[0x9E58 ^ 0x9EA7] = 0x9EB6 ^ 0x9EA7;
        WayPointManager.i[0x9F1D ^ 0x9FE9] = 0xFFFF602E ^ 0x9FE9;
    }
}

