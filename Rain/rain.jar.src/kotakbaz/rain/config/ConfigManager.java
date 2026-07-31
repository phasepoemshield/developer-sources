/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.mojang.authlib.GameProfile;
import java.awt.Color;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
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
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.ClickGuiSettings;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.config.A;
import kotakbaz.rain.config.B;
import kotakbaz.rain.config.C;
import kotakbaz.rain.config.ConfigInfo;
import kotakbaz.rain.config.c_0;
import kotakbaz.rain.config.d;
import kotakbaz.rain.guard.a_0;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.ModuleManager;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotakbaz.rain.module.setting.settings.TextSetting;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\b\b\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001b\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\b%\u0010&J!\u0010)\u001a\u00020$2\u0010\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0\u0004H\u0002\u00a2\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u00020,2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030'H\u0002\u00a2\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020$H\u0002\u00a2\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u00102\u001a\u00020$H\u0002\u00a2\u0006\u0004\b3\u00104J)\u00105\u001a\u00020\u00102\u0010\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0\u00042\u0006\u00102\u001a\u00020$H\u0002\u00a2\u0006\u0004\b5\u00106J#\u00108\u001a\u00020\u00102\n\u0010+\u001a\u0006\u0012\u0002\b\u00030'2\u0006\u00107\u001a\u00020,H\u0002\u00a2\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\b<\u0010;J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020,0\u00042\u0006\u0010/\u001a\u00020$H\u0002\u00a2\u0006\u0004\b=\u0010>J'\u0010A\u001a\u0004\u0018\u00010$2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020,0\u00042\u0006\u0010@\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bC\u0010DJ!\u0010E\u001a\u0004\u0018\u00010,2\u0006\u00102\u001a\u00020$2\u0006\u0010@\u001a\u00020\rH\u0002\u00a2\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\bG\u0010\u0003J\u000f\u0010H\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\bH\u0010\u0003J\u0017\u0010J\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002\u00a2\u0006\u0004\bL\u0010\u0007J\u000f\u0010M\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\bM\u0010\u0003J\u0017\u0010O\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\bO\u0010\u0017J\u000f\u0010P\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\bP\u0010\u0003J\u0011\u0010Q\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\bQ\u0010\fJ\u000f\u0010R\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\bR\u0010\fJ\u000f\u0010S\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\bS\u0010\u0003J\u000f\u0010T\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\bT\u0010\u0003R\u0014\u0010U\u001a\u00020\u00058\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bW\u0010VR\u0014\u0010X\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bX\u0010VR\u0014\u0010Y\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bY\u0010VR\u0014\u0010Z\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bZ\u0010VR\u0014\u0010[\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b[\u0010VR\u0014\u0010\\\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\\\u0010VR\u0014\u0010]\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b]\u0010VR\u0014\u0010^\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b^\u0010VR\u0014\u0010_\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b_\u0010VR\u0014\u0010`\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b`\u0010VR\u0014\u0010a\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\ba\u0010VR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bc\u0010dR\u001c\u0010g\u001a\n f*\u0004\u0018\u00010e0e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bi\u0010jR\u0017\u0010k\u001a\u00020\u001e8\u0006\u00a2\u0006\f\n\u0004\bk\u0010j\u001a\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bn\u0010jR\u0018\u0010o\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bo\u0010VR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bp\u0010qR\u001c\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\br\u0010qR\u0016\u0010s\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bu\u0010v\u00a8\u0006w"}, d2={"Lkotakbaz/rain/config/ConfigManager;", "", "<init>", "()V", "", "", "getConfigNames", "()Ljava/util/List;", "getVisibleConfigNames", "Lkotakbaz/rain/config/ConfigInfo;", "getVisibleConfigs", "getSelectedVisibleConfigName", "()Ljava/lang/String;", "", "getStateVersion", "()I", "", "refreshVisibleConfigsNow", "name", "setSelectedConfigName", "(Ljava/lang/String;)V", "", "save", "(Ljava/lang/String;)Z", "load", "remove", "isValidName", "isManualConfigName", "getAuthor", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/nio/file/Path;", "file", "readAuthor", "(Ljava/nio/file/Path;)Ljava/lang/String;", "Lkotakbaz/rain/module/Module;", "module", "Lcom/google/gson/JsonObject;", "serializeModule", "(Lkotakbaz/rain/module/Module;)Lcom/google/gson/JsonObject;", "Lkotakbaz/rain/module/setting/Setting;", "settings", "serializeSettings", "(Ljava/util/List;)Lcom/google/gson/JsonObject;", "setting", "Lcom/google/gson/JsonElement;", "serializeSettingValue", "(Lkotakbaz/rain/module/setting/Setting;)Lcom/google/gson/JsonElement;", "content", "deserializeClickGuiSettings", "(Lcom/google/gson/JsonObject;)V", "json", "deserializeModule", "(Lkotakbaz/rain/module/Module;Lcom/google/gson/JsonObject;)V", "deserializeSettings", "(Ljava/util/List;Lcom/google/gson/JsonObject;)V", "element", "applySettingValue", "(Lkotakbaz/rain/module/setting/Setting;Lcom/google/gson/JsonElement;)V", "moduleConfigKey", "(Lkotakbaz/rain/module/Module;)Ljava/lang/String;", "legacyRuntimeModuleConfigKey", "legacyModuleEntries", "(Lcom/google/gson/JsonObject;)Ljava/util/List;", "entries", "index", "legacyModuleJson", "(Ljava/util/List;I)Lcom/google/gson/JsonObject;", "settingConfigKey", "(I)Ljava/lang/String;", "legacySettingElement", "(Lcom/google/gson/JsonObject;I)Lcom/google/gson/JsonElement;", "ensureConfigDirectory", "ensureVisibleConfigsCache", "force", "rebuildVisibleConfigs", "(Z)V", "loadVisibleConfigs", "markVisibleConfigsDirty", "fileName", "isInternalConfigFile", "persistSelectedConfigName", "readSelectedConfigName", "currentAuthor", "restoreMisplacedInternalFiles", "migrateLegacyConfigs", "AUTO_LOAD_CONFIG", "Ljava/lang/String;", "DRAGS_FILE_NAME", "WAYPOINT_FILE_NAME", "SELECTED_CONFIG_FILE_NAME", "AUTHOR_KEY", "FIXED_AUTHOR_KEY", "LEGACY_AUTHOR_KEY", "CONTENT_KEY", "CLICK_GUI_SETTINGS_KEY", "LEGACY_CLICK_GUI_MODULE_KEY", "LEGACY_CLICK_GUI_MODULE_NAME", "UNKNOWN_AUTHOR", "Lkotlin/text/Regex;", "manualConfigNameRegex", "Lkotlin/text/Regex;", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "legacyConfigPath", "Ljava/nio/file/Path;", "configPath", "getConfigPath", "()Ljava/nio/file/Path;", "selectedConfigPath", "selectedConfigName", "visibleConfigsCache", "Ljava/util/List;", "visibleConfigNamesCache", "visibleConfigsDirty", "Z", "stateVersion", "I", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigManager.kt\nkotakbaz/rain/config/ConfigManager\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,489:1\n614#2:490\n614#2:514\n2792#3,3:491\n1915#3,2:495\n1924#3,3:497\n1924#3,3:502\n1924#3,3:505\n296#3,2:508\n1586#3:510\n1661#3,3:511\n1#4:494\n1874#5,2:500\n*S KotlinDebug\n*F\n+ 1 ConfigManager.kt\nkotakbaz/rain/config/ConfigManager\n*L\n70#1:490\n385#1:514\n92#1:491,3\n127#1:495,2\n165#1:497,3\n245#1:502,3\n287#1:505,3\n309#1:508,2\n372#1:510\n372#1:511,3\n198#1:500,2\n*E\n"})
public final class ConfigManager {
    @NotNull
    public static final ConfigManager INSTANCE;
    @NotNull
    public static final String a = "AutoLoad";
    @NotNull
    private static final String A = "drags.json";
    @NotNull
    private static final String b = "way.json";
    @NotNull
    private static final String B = "selected_config.txt";
    @NotNull
    private static final String c = "\u0410\u0432\u0442\u043e\u0440";
    @NotNull
    private static final String C = "\u0410\u0432\u0442\u043e\u0440";
    @NotNull
    private static final String d = "Author";
    @NotNull
    private static final String D = "Content";
    @NotNull
    private static final String e = "ClickGuiSettings";
    @NotNull
    private static final String E = "ClickGuiModule";
    @NotNull
    private static final String f = "ClickGui";
    @NotNull
    private static final String F = "Unknown";
    @NotNull
    private static final Regex g;
    private static final Gson G;
    @NotNull
    private static final Path h;
    @NotNull
    private static final Path H;
    @NotNull
    private static final Path i;
    @Nullable
    private static String I;
    @NotNull
    private static List<ConfigInfo> j;
    @NotNull
    private static List<String> J;
    private static boolean k;
    private static int K;
    private static Object[] l;
    private static Object m;
    private static Object[] M;
    private static Object[] L;
    private static Object[] n;
    public static int[] N;

    private ConfigManager() {
    }

    @NotNull
    public final Path getConfigPath() {
        return H;
    }

    @NotNull
    public final List<String> getConfigNames() {
        long l2 = -3930081973679178269L;
        this.ensureConfigDirectory();
        File[] fileArray = H.toFile().listFiles(ConfigManager::getConfigNames$lambda$0);
        if (fileArray == null) {
            return CollectionsKt.emptyList();
        }
        File[] fileArray2 = fileArray;
        Sequence<String> sequence = SequencesKt.map(SequencesKt.filterNot(SequencesKt.map(ArraysKt.asSequence(fileArray2), kotakbaz.rain.config.C.INSTANCE), new d(this)), ConfigManager::getConfigNames$lambda$1);
        long l3 = l2;
        int n2 = N[0];
        n2 += N[1];
        l2 = l3 ^ (0L ^ l3) & -1L << (n2 ^= N[2]);
        return SequencesKt.toList(SequencesKt.sortedWith(sequence, new B()));
    }

    @NotNull
    public final List<String> getVisibleConfigNames() {
        this.ensureVisibleConfigsCache();
        return J;
    }

    @NotNull
    public final List<ConfigInfo> getVisibleConfigs() {
        this.ensureVisibleConfigsCache();
        return j;
    }

    @Nullable
    public final String getSelectedVisibleConfigName() {
        int n2;
        String string;
        block9: {
            long l2;
            block11: {
                block10: {
                    l2 = -5586897482808607599L;
                    this.ensureVisibleConfigsCache();
                    String string2 = I;
                    if (string2 == null) {
                        return null;
                    }
                    string = string2;
                    if (!this.isValidName(string)) break block10;
                    int n3 = N[3];
                    n3 -= N[4];
                    boolean bl = N[6];
                    bl ^= N[7];
                    if (!StringsKt.equals(string, (String)l[n3 += N[5]], bl -= N[8])) break block11;
                }
                this.setSelectedConfigName(null);
                return null;
            }
            Iterable iterable = J;
            long l3 = l2;
            int n4 = N[9];
            n4 -= N[10];
            l2 = l3 ^ (0L ^ l3) & -1L << (n4 -= N[11]);
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                int n5 = N[12];
                n5 -= N[13];
                n2 = n5 += N[14];
            } else {
                for (Object t2 : iterable) {
                    String string3 = (String)t2;
                    long l4 = l2;
                    int n6 = N[15];
                    n6 += N[16];
                    l2 = l4 ^ (0L ^ l4) & -1L >>> (n6 -= N[17]);
                    boolean bl = N[18];
                    bl ^= N[19];
                    if (!StringsKt.equals(string3, string, bl ^= N[20])) continue;
                    int n7 = N[21];
                    n7 -= N[22];
                    n2 = n7 -= N[23];
                    break block9;
                }
                int n8 = N[24];
                n8 -= N[25];
                n2 = n8 -= N[26];
            }
        }
        if (n2 != 0) {
            this.setSelectedConfigName(null);
            return null;
        }
        return string;
    }

    public final int getStateVersion() {
        return K;
    }

    public final void refreshVisibleConfigsNow() {
        boolean bl = N[27];
        bl += N[28];
        this.rebuildVisibleConfigs(bl -= N[29]);
    }

    /*
     * Unable to fully structure code
     */
    public final void setSelectedConfigName(@Nullable String name) {
        var9_2 = 2695559036251737652L;
        var11_3 = -1304226506287854402L;
        var13_4 = 4984286751548526279L;
        if (name == null) ** GOTO lbl-1000
        var3_5 = StringsKt.trim((CharSequence)name).toString();
        if (var3_5 == null) ** GOTO lbl-1000
        var6_7 = var5_6 = var3_5;
        v0 = var9_2;
        var16_8 = ConfigManager.N[30];
        var16_8 += ConfigManager.N[31];
        var9_2 = v0 ^ (0L ^ v0) & -1L << (var16_8 += ConfigManager.N[32]);
        if (((CharSequence)var6_7).length() > 0) {
            var18_9 = ConfigManager.N[33];
            var18_9 += ConfigManager.N[34];
            v1 = var18_9 ^= ConfigManager.N[35];
        } else {
            var20_10 = ConfigManager.N[36];
            var20_10 -= ConfigManager.N[37];
            v1 = var20_10 += ConfigManager.N[38];
        }
        v2 = var4_11 = v1 != 0 ? var5_6 : null;
        if (var4_11 == null) ** GOTO lbl-1000
        var7_12 = var6_7 = var4_11;
        v3 = var11_3;
        var22_13 = ConfigManager.N[39];
        var22_13 += ConfigManager.N[40];
        var11_3 = v3 ^ (0L ^ v3) & -1L << (var22_13 -= ConfigManager.N[41]);
        v4 = var5_6 = this.isValidName(var7_12) != false ? var6_7 : null;
        if (var5_6 != null) {
            var7_12 = var6_7 = var5_6;
            v5 = var11_3;
            var24_14 = ConfigManager.N[42];
            var24_14 -= ConfigManager.N[43];
            var11_3 = v5 ^ (0L ^ v5) & -1L << (var24_14 -= ConfigManager.N[44]);
            var26_15 = ConfigManager.N[45];
            var26_15 ^= ConfigManager.N[46];
            var28_16 = ConfigManager.N[48];
            var28_16 ^= ConfigManager.N[49];
            if (!StringsKt.equals(var7_12, (String)ConfigManager.l[var26_15 += ConfigManager.N[47]], var28_16 += ConfigManager.N[50])) {
                var30_17 = ConfigManager.N[51];
                var30_17 += ConfigManager.N[52];
                v6 = var30_17 += ConfigManager.N[53];
            } else {
                var32_18 = ConfigManager.N[54];
                var32_18 -= ConfigManager.N[55];
                v6 = var32_18 += ConfigManager.N[56];
            }
            v7 = v6 != 0 ? var6_7 : null;
        } else lbl-1000:
        // 4 sources

        {
            v7 = var2_19 = null;
        }
        if (Intrinsics.areEqual(ConfigManager.I, var2_19)) {
            return;
        }
        ConfigManager.I = var2_19;
        this.persistSelectedConfigName();
        var34_20 = ConfigManager.N[57];
        var34_20 += ConfigManager.N[58];
        v8 = var13_4;
        var36_21 = ConfigManager.N[60];
        var36_21 += ConfigManager.N[61];
        var13_4 = v8 ^ ((long)ConfigManager.K << (var34_20 ^= ConfigManager.N[59]) ^ v8) & -1L << (var36_21 ^= ConfigManager.N[62]);
        var38_22 = ConfigManager.N[63];
        var38_22 += ConfigManager.N[64];
        var40_23 = ConfigManager.N[66];
        var40_23 ^= ConfigManager.N[67];
        ConfigManager.K = (int)(var13_4 >>> (var38_22 += ConfigManager.N[65])) + (var40_23 -= ConfigManager.N[68]);
    }

    public final boolean save(@NotNull String name) {
        Object object;
        Object object2;
        long l2 = -1588542412884069304L;
        long l3 = 2879740650419454829L;
        long l4 = 652485056096808966L;
        long l5 = -8057389661096345769L;
        long l6 = -7647524943426010273L;
        int n2 = N[69];
        n2 += N[70];
        Intrinsics.checkNotNullParameter(name, (String)l[n2 ^= N[71]]);
        if (!this.isValidName(name)) {
            boolean bl = N[72];
            bl -= N[73];
            return bl += N[74];
        }
        this.ensureConfigDirectory();
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        Object object3 = ModuleManager.INSTANCE.getModules();
        long l7 = l6;
        int n3 = N[75];
        n3 += N[76];
        l6 = l7 ^ (0L ^ l7) & -1L >>> (n3 += N[77]);
        Iterator iterator2 = object3.iterator();
        while (iterator2.hasNext()) {
            object2 = iterator2.next();
            Module module = (Module)object2;
            long l8 = l4;
            int n4 = N[78];
            n4 ^= N[79];
            l4 = l8 ^ (0L ^ l8) & -1L >>> (n4 -= N[80]);
            jsonObject2.add(INSTANCE.moduleConfigKey(module), INSTANCE.serializeModule(module));
        }
        int n5 = N[81];
        n5 ^= N[82];
        int n6 = N[84];
        n6 += N[85];
        jsonObject2.add((String)l[n5 ^= N[83]] + (String)l[n6 ^= N[86]], this.serializeSettings(ClickGuiSettings.INSTANCE.getSettings()));
        int n7 = N[87];
        n7 ^= N[88];
        jsonObject.addProperty((String)l[n7 -= N[89]], this.currentAuthor());
        int n8 = N[90];
        n8 += N[91];
        jsonObject.add((String)l[n8 ^= N[92]], jsonObject2);
        object3 = this;
        try {
            object = (ConfigManager)object3;
            long l9 = l5;
            int n9 = N[93];
            n9 -= N[94];
            l5 = l9 ^ (0L ^ l9) & -1L << (n9 -= N[95]);
            String string = name;
            int n10 = N[96];
            n10 ^= N[97];
            n10 -= N[98];
            int n11 = N[99];
            n11 ^= N[100];
            object2 = new OpenOption[n11 ^= N[101]];
            int n12 = N[102];
            n12 += N[103];
            object2[n12 ^= ConfigManager.N[104]] = StandardOpenOption.CREATE;
            int n13 = N[105];
            n13 -= N[106];
            object2[n13 ^= ConfigManager.N[107]] = StandardOpenOption.TRUNCATE_EXISTING;
            int n14 = N[108];
            n14 += N[109];
            object2[n14 ^= ConfigManager.N[110]] = StandardOpenOption.WRITE;
            object = Result.cfr_renamed_1(Files.writeString(H.resolve(string + (String)l[n10]), (CharSequence)G.toJson(jsonObject), object2));
        }
        catch (Throwable throwable) {
            object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
        int n15 = N[111];
        n15 -= N[112];
        long l10 = l6;
        int n16 = N[114];
        n16 += N[115];
        l6 = l10 ^ ((long)Result.cfr_renamed_4(object) << (n15 ^= N[113]) ^ l10) & -1L << (n16 ^= N[116]);
        int n17 = N[117];
        n17 += N[118];
        long l11 = l6;
        int n18 = N[120];
        n18 -= N[121];
        l6 = l11 ^ ((long)((int)(l6 >>> (n17 ^= N[119]))) ^ l11) & -1L >>> (n18 += N[122]);
        long l12 = l5;
        int n19 = N[123];
        n19 -= N[124];
        l5 = l12 ^ (0L ^ l12) & -1L << (n19 ^= N[125]);
        if ((int)l6 != 0) {
            INSTANCE.markVisibleConfigsDirty();
        }
        int n20 = N[126];
        n20 += N[127];
        return (int)(l6 >>> (n20 += N[128])) != 0;
    }

    public final boolean load(@NotNull String name) {
        Object object;
        long l2 = -7591461204641958967L;
        long l3 = -926143629869283295L;
        long l4 = -22300373787625971L;
        long l5 = -579172235528427631L;
        long l6 = 2270111758377332905L;
        long l7 = 2131531247181025474L;
        long l8 = -2878106894867483693L;
        int n2 = N[129];
        n2 -= N[130];
        Intrinsics.checkNotNullParameter(name, (String)l[n2 ^= N[131]]);
        if (!this.isValidName(name)) {
            boolean bl = N[132];
            bl ^= N[133];
            return bl ^= N[134];
        }
        String string = name;
        int n3 = N[135];
        n3 ^= N[136];
        Path path = H.resolve(string + (String)l[n3 += N[137]]);
        int n4 = N[138];
        n4 += N[139];
        if (!Files.exists(path, new LinkOption[n4 -= N[140]])) {
            boolean bl = N[141];
            bl += N[142];
            return bl -= N[143];
        }
        Object object2 = this;
        try {
            int n5;
            object = object2;
            long l9 = l5;
            int n6 = N[144];
            n6 -= N[145];
            l5 = l9 ^ (0L ^ l9) & -1L << (n6 += N[146]);
            JsonObject jsonObject = G.fromJson(Files.readString(path), JsonObject.class);
            if (jsonObject == null) {
                boolean bl = N[147];
                bl ^= N[148];
                return bl -= N[149];
            }
            JsonObject jsonObject2 = jsonObject;
            int n7 = N[150];
            n7 -= N[151];
            JsonObject jsonObject3 = jsonObject2.getAsJsonObject((String)l[n7 -= N[152]]);
            if (jsonObject3 == null) {
                boolean bl = N[153];
                bl ^= N[154];
                return bl -= N[155];
            }
            JsonObject jsonObject4 = jsonObject3;
            super.deserializeClickGuiSettings(jsonObject4);
            List<JsonElement> list = super.legacyModuleEntries(jsonObject4);
            if (list.size() == ModuleManager.INSTANCE.getModules().size()) {
                int n8 = N[156];
                n8 ^= N[157];
                n5 = n8 -= N[158];
            } else {
                int n9 = N[159];
                n9 -= N[160];
                n5 = n9 -= N[161];
            }
            long l10 = l5;
            int n10 = N[162];
            n10 ^= N[163];
            l5 = l10 ^ ((long)n5 ^ l10) & -1L >>> (n10 ^= N[164]);
            Iterable iterable = ModuleManager.INSTANCE.getModules();
            long l11 = l6;
            int n11 = N[165];
            n11 -= N[166];
            l6 = l11 ^ (0L ^ l11) & -1L << (n11 -= N[167]);
            long l12 = l7;
            int n12 = N[168];
            n12 -= N[169];
            l7 = l12 ^ (0L ^ l12) & -1L << (n12 += N[170]);
            for (Object t2 : iterable) {
                int n13 = N[171];
                n13 -= N[172];
                int n14 = (int)(l7 >>> (n13 += N[173]));
                l7 += 0x100000000L;
                int n15 = N[174];
                n15 -= N[175];
                long l13 = l8;
                int n16 = N[177];
                n16 ^= N[178];
                l8 = l13 ^ ((long)n14 << (n15 += N[176]) ^ l13) & -1L << (n16 -= N[179]);
                int n17 = N[180];
                n17 += N[181];
                if ((int)(l8 >>> (n17 -= N[182])) < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int n18 = N[183];
                n18 += N[184];
                Module module = (Module)t2;
                long l14 = l3;
                int n19 = N[186];
                n19 += N[187];
                long l15 = l3 = l14 ^ ((long)((int)(l8 >>> (n18 ^= N[185]))) ^ l14) & -1L >>> (n19 += N[188]);
                int n20 = N[189];
                n20 ^= N[190];
                l3 = l15 ^ (0L ^ l15) & -1L << (n20 ^= N[191]);
                JsonObject jsonObject5 = jsonObject4.getAsJsonObject(super.moduleConfigKey(module));
                if (jsonObject5 == null && (jsonObject5 = jsonObject4.getAsJsonObject(super.legacyRuntimeModuleConfigKey(module))) == null && (jsonObject5 = jsonObject4.getAsJsonObject(module.getName())) == null) {
                    JsonObject jsonObject6;
                    JsonObject jsonObject7 = jsonObject6 = super.legacyModuleJson(list, (int)l3);
                    long l16 = l4;
                    int n21 = N[192];
                    n21 -= N[193];
                    l4 = l16 ^ (0L ^ l16) & -1L << (n21 += N[194]);
                    jsonObject5 = (int)l5 != 0 ? jsonObject6 : null;
                    if (jsonObject5 == null) continue;
                }
                JsonObject jsonObject8 = jsonObject5;
                super.deserializeModule(module, jsonObject8);
            }
            int n22 = N[195];
            n22 ^= N[196];
            boolean bl = N[198];
            bl += N[199];
            if (!StringsKt.equals(name, (String)l[n22 ^= N[197]], bl -= N[200])) {
                ((ConfigManager)object).setSelectedConfigName(name);
            }
            boolean bl2 = N[201];
            bl2 += N[202];
            object = Result.cfr_renamed_1(bl2 -= N[203]);
        }
        catch (Throwable throwable) {
            object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
        object2 = object;
        boolean bl = N[204];
        bl ^= N[205];
        object = bl ^= N[206];
        return (Boolean)(Result.cfr_renamed_3(object2) ? object : object2);
    }

    public final boolean remove(@NotNull String name) {
        Object object;
        long l2 = 4264233322512957482L;
        long l3 = -7523193080007878363L;
        long l4 = 7800737438211026033L;
        int n2 = N[207];
        n2 ^= N[208];
        Intrinsics.checkNotNullParameter(name, (String)l[n2 ^= N[209]]);
        if (!this.isValidName(name)) {
            boolean bl = N[210];
            bl -= N[211];
            return bl += N[212];
        }
        Object object2 = this;
        try {
            object = object2;
            long l5 = l3;
            int n3 = N[213];
            n3 += N[214];
            l3 = l5 ^ (0L ^ l5) & -1L << (n3 -= N[215]);
            String string = name;
            int n4 = N[216];
            n4 ^= N[217];
            object = Result.cfr_renamed_1(Files.deleteIfExists(H.resolve(string + (String)l[n4 -= N[218]])));
        }
        catch (Throwable throwable) {
            object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
        object2 = object;
        boolean bl = N[219];
        bl -= N[220];
        object = bl ^= N[221];
        object2 = Result.cfr_renamed_3(object2) ? object : object2;
        int n5 = N[222];
        n5 ^= N[223];
        long l6 = l4;
        int n6 = N[225];
        n6 ^= N[226];
        l4 = l6 ^ ((long)((Boolean)object2).booleanValue() << (n5 -= N[224]) ^ l6) & -1L << (n6 -= N[227]);
        long l7 = l3;
        int n7 = N[228];
        n7 -= N[229];
        l3 = l7 ^ (0L ^ l7) & -1L << (n7 ^= N[230]);
        int n8 = N[231];
        n8 -= N[232];
        if ((int)(l4 >>> (n8 -= N[233])) != 0) {
            INSTANCE.markVisibleConfigsDirty();
        }
        int n9 = N[234];
        n9 -= N[235];
        if ((int)(l4 >>> (n9 += N[236])) != 0) {
            boolean bl2 = N[237];
            bl2 ^= N[238];
            if (StringsKt.equals(I, name, bl2 -= N[239])) {
                INSTANCE.setSelectedConfigName(null);
            }
        }
        return (Boolean)object2;
    }

    public final boolean isValidName(@NotNull String name) {
        int n2;
        block7: {
            long l2;
            long l3;
            long l4;
            long l5;
            block9: {
                block8: {
                    long l6 = -5203384256342626676L;
                    l5 = -2367279278045582196L;
                    l4 = 3690941770930855046L;
                    l3 = 4873192536458259210L;
                    l2 = 2100355135903710092L;
                    int n3 = N[240];
                    n3 ^= N[241];
                    Intrinsics.checkNotNullParameter(name, (String)l[n3 += N[242]]);
                    if (StringsKt.isBlank(name)) {
                        boolean bl = N[243];
                        bl -= N[244];
                        return bl ^= N[245];
                    }
                    int n4 = N[246];
                    n4 += N[247];
                    if (Intrinsics.areEqual(name, (String)l[n4 -= N[248]])) break block8;
                    int n5 = N[249];
                    n5 ^= N[250];
                    if (!Intrinsics.areEqual(name, (String)l[n5 ^= N[251]])) break block9;
                }
                boolean bl = N[252];
                bl += N[253];
                return bl -= N[254];
            }
            CharSequence charSequence = name;
            long l7 = l5;
            int n6 = N[255];
            n6 -= N[256];
            l5 = l7 ^ (0L ^ l7) & -1L << (n6 += N[257]);
            long l8 = l4;
            int n7 = N[258];
            n7 -= N[259];
            l4 = l8 ^ (0L ^ l8) & -1L << (n7 ^= N[260]);
            while (true) {
                int n8 = N[261];
                n8 += N[262];
                if ((int)(l4 >>> (n8 -= N[263])) >= charSequence.length()) break;
                int n9 = N[264];
                n9 ^= N[265];
                n9 ^= N[266];
                int n10 = N[267];
                n10 ^= N[268];
                long l9 = l3;
                int n11 = N[270];
                n11 -= N[271];
                l3 = l9 ^ ((long)charSequence.charAt((int)(l4 >>> n9)) << (n10 ^= N[269]) ^ l9) & -1L << (n11 += N[272]);
                int n12 = N[273];
                n12 += N[274];
                n12 -= N[275];
                int n13 = N[276];
                n13 ^= N[277];
                long l10 = l2;
                int n14 = N[279];
                n14 ^= N[280];
                long l11 = l2 = l10 ^ ((long)((int)(l3 >>> n12)) << (n13 += N[278]) ^ l10) & -1L << (n14 -= N[281]);
                int n15 = N[282];
                n15 -= N[283];
                l2 = l11 ^ (0L ^ l11) & -1L >>> (n15 ^= N[284]);
                int n16 = N[285];
                n16 ^= N[286];
                n16 -= N[287];
                int n17 = N[288];
                n17 += N[289];
                n17 += N[290];
                boolean bl = N[291];
                bl += N[292];
                int n18 = N[294];
                n18 -= N[295];
                if (StringsKt.contains$default((CharSequence)((String)l[n16]), (char)(l2 >>> n17), bl -= N[293], n18 += N[296], null)) {
                    int n19 = N[297];
                    n19 ^= N[298];
                    n2 = n19 += N[299];
                    break block7;
                }
                l4 += 0x100000000L;
            }
            int n20 = N[300];
            n20 ^= N[301];
            n2 = n20 ^= N[302];
        }
        return n2 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean isManualConfigName(@NotNull String name) {
        int n2;
        int n3 = N[303];
        n3 += N[304];
        Intrinsics.checkNotNullParameter(name, (String)l[n3 ^= N[305]]);
        if (this.isValidName(name) && g.matches(name)) {
            int n4 = N[306];
            n4 -= N[307];
            boolean bl = N[309];
            bl -= N[310];
            if (!StringsKt.equals(name, (String)l[n4 ^= N[308]], bl += N[311])) {
                int n5 = N[312];
                n5 += N[313];
                n2 = n5 += N[314];
                return n2 != 0;
            }
        }
        int n6 = N[315];
        n6 += N[316];
        n2 = n6 += N[317];
        return n2 != 0;
    }

    @NotNull
    public final String getAuthor(@NotNull String name) {
        int n2 = N[318];
        n2 ^= N[319];
        Intrinsics.checkNotNullParameter(name, (String)l[n2 -= N[320]]);
        if (!this.isValidName(name)) {
            int n3 = N[321];
            n3 -= N[322];
            return (String)l[n3 ^= N[323]];
        }
        String string = name;
        int n4 = N[324];
        n4 ^= N[325];
        Path path = H.resolve(string + (String)l[n4 ^= N[326]]);
        int n5 = N[327];
        n5 ^= N[328];
        if (!Files.exists(path, new LinkOption[n5 -= N[329]])) {
            int n6 = N[330];
            n6 ^= N[331];
            return (String)l[n6 -= N[332]];
        }
        Intrinsics.checkNotNull(path);
        return this.readAuthor(path);
    }

    /*
     * Unable to fully structure code
     */
    private final String readAuthor(Path file) {
        var18_2 = 7261810300719151790L;
        var20_3 = 7412013089427606732L;
        var22_4 = -4119538226882289603L;
        var24_5 = 5952946609267722778L;
        var2_6 = this;
        try {
            block15: {
                block14: {
                    var3_7 = var2_6;
                    v0 = var18_2;
                    var27_8 = ConfigManager.N[333];
                    var27_8 += ConfigManager.N[334];
                    var18_2 = v0 ^ (0L ^ v0) & -1L << (var27_8 ^= ConfigManager.N[335]);
                    v1 = ConfigManager.G.fromJson(Files.readString(file), JsonObject.class);
                    if (v1 == null) {
                        var29_9 = ConfigManager.N[336];
                        var29_9 -= ConfigManager.N[337];
                        return (String)ConfigManager.l[var29_9 ^= ConfigManager.N[338]];
                    }
                    var5_10 = v1;
                    var31_11 = ConfigManager.N[339];
                    var31_11 += ConfigManager.N[340];
                    var6_12 = var5_10.get((String)ConfigManager.l[var31_11 ^= ConfigManager.N[341]]);
                    if (var6_12 == null) break block14;
                    var8_14 = var7_13 = var6_12;
                    v2 = var18_2;
                    var33_15 = ConfigManager.N[342];
                    var33_15 += ConfigManager.N[343];
                    var18_2 = v2 ^ (0L ^ v2) & -1L >>> (var33_15 ^= ConfigManager.N[344]);
                    v3 = var10_16 = var8_14.isJsonPrimitive() != false ? var7_13 : null;
                    if (var10_16 == null || (var7_13 = var10_16.getAsString()) == null) break block14;
                    var11_18 = var9_17 = var7_13;
                    v4 = var20_3;
                    var35_19 = ConfigManager.N[345];
                    var35_19 ^= ConfigManager.N[346];
                    var20_3 = v4 ^ (0L ^ v4) & -1L << (var35_19 ^= ConfigManager.N[347]);
                    if (!StringsKt.isBlank((CharSequence)var11_18)) {
                        var37_20 = ConfigManager.N[348];
                        var37_20 ^= ConfigManager.N[349];
                        v5 = var37_20 += ConfigManager.N[350];
                    } else {
                        var39_21 = ConfigManager.N[351];
                        var39_21 ^= ConfigManager.N[352];
                        v5 = var39_21 += ConfigManager.N[353];
                    }
                    v6 = var8_14 = v5 != 0 ? var9_17 : null;
                    if (var8_14 == null) break block14;
                    v7 = var8_14;
                    break block15;
                }
                var41_22 = ConfigManager.N[354];
                var41_22 ^= ConfigManager.N[355];
                var11_18 = var5_10.get((String)ConfigManager.l[var41_22 ^= ConfigManager.N[356]]);
                if (var11_18 == null) ** GOTO lbl-1000
                var14_24 = var13_23 = var11_18;
                v8 = var20_3;
                var43_25 = ConfigManager.N[357];
                var43_25 -= ConfigManager.N[358];
                var20_3 = v8 ^ (0L ^ v8) & -1L >>> (var43_25 += ConfigManager.N[359]);
                v9 = var12_26 = var14_24.isJsonPrimitive() != false ? var13_23 : null;
                if (var12_26 != null && (var13_23 = var12_26.getAsString()) != null) {
                    var15_27 = var14_24 = var13_23;
                    v10 = var22_4;
                    var45_28 = ConfigManager.N[360];
                    var45_28 += ConfigManager.N[361];
                    var22_4 = v10 ^ (0L ^ v10) & -1L << (var45_28 ^= ConfigManager.N[362]);
                    if (!StringsKt.isBlank((CharSequence)var15_27)) {
                        var47_29 = ConfigManager.N[363];
                        var47_29 += ConfigManager.N[364];
                        v11 = var47_29 -= ConfigManager.N[365];
                    } else {
                        var49_30 = ConfigManager.N[366];
                        var49_30 ^= ConfigManager.N[367];
                        v11 = var49_30 -= ConfigManager.N[368];
                    }
                    v12 = v11 != 0 ? var14_24 : null;
                } else lbl-1000:
                // 2 sources

                {
                    v12 = v7 = null;
                }
                if (v12 != null) break block15;
                var51_31 = ConfigManager.N[369];
                var51_31 += ConfigManager.N[370];
                var12_26 = var5_10.get((String)ConfigManager.l[var51_31 += ConfigManager.N[371]]);
                if (var12_26 == null) ** GOTO lbl-1000
                var15_27 = var14_24 = var12_26;
                v13 = var22_4;
                var53_32 = ConfigManager.N[372];
                var53_32 += ConfigManager.N[373];
                var22_4 = v13 ^ (0L ^ v13) & -1L << (var53_32 ^= ConfigManager.N[374]);
                v14 = var13_23 = var15_27.isJsonPrimitive() != false ? var14_24 : null;
                if (var13_23 != null && (var14_24 = var13_23.getAsString()) != null) {
                    var16_33 = var15_27 = var14_24;
                    v15 = var24_5;
                    var55_34 = ConfigManager.N[375];
                    var55_34 ^= ConfigManager.N[376];
                    var24_5 = v15 ^ (0L ^ v15) & -1L << (var55_34 -= ConfigManager.N[377]);
                    if (!StringsKt.isBlank((CharSequence)var16_33)) {
                        var57_35 = ConfigManager.N[378];
                        var57_35 += ConfigManager.N[379];
                        v16 = var57_35 -= ConfigManager.N[380];
                    } else {
                        var59_36 = ConfigManager.N[381];
                        var59_36 += ConfigManager.N[382];
                        v16 = var59_36 -= ConfigManager.N[383];
                    }
                    v17 = v16 != 0 ? var15_27 : null;
                } else lbl-1000:
                // 2 sources

                {
                    v17 = v7 = null;
                }
                if (v17 == null) {
                    var61_37 = ConfigManager.N[384];
                    var61_37 += ConfigManager.N[385];
                    v7 = (String)ConfigManager.l[var61_37 ^= ConfigManager.N[386]];
                }
            }
            var3_7 = Result.cfr_renamed_1(v7);
        }
        catch (Throwable var4_38) {
            var3_7 = Result.cfr_renamed_1(ResultKt.createFailure(var4_38));
        }
        var2_6 = var3_7;
        var63_39 = ConfigManager.N[387];
        var63_39 += ConfigManager.N[388];
        var3_7 = (String)ConfigManager.l[var63_39 += ConfigManager.N[389]];
        return (String)(Result.cfr_renamed_3(var2_6) != false ? var3_7 : var2_6);
    }

    private final JsonObject serializeModule(Module module) {
        JsonObject jsonObject = new JsonObject();
        int n2 = N[390];
        n2 ^= N[391];
        jsonObject.addProperty((String)l[n2 -= N[392]], module.isPreferredEnabled());
        int n3 = N[393];
        n3 ^= N[394];
        jsonObject.addProperty((String)l[n3 += N[395]], module.getKey());
        int n4 = N[396];
        n4 -= N[397];
        jsonObject.add((String)l[n4 ^= N[398]], this.serializeSettings(module.getSettings()));
        return jsonObject;
    }

    private final JsonObject serializeSettings(List<? extends kotakbaz.rain.module.setting.B<?>> settings) {
        long l2 = 8102729047177635223L;
        long l3 = 1017035669891105064L;
        long l4 = 35847068261976588L;
        long l5 = -6730843516448117259L;
        long l6 = -1977084042956790808L;
        JsonObject jsonObject = new JsonObject();
        Iterable iterable = settings;
        long l7 = l5;
        int n2 = N[399];
        n2 ^= 0x6B;
        l5 = l7 ^ (0L ^ l7) & -1L << (n2 += 30);
        long l8 = l6;
        int n3 = 103;
        n3 += 25;
        l6 = l8 ^ (0L ^ l8) & -1L << (n3 += -96);
        for (Object t2 : iterable) {
            int n4 = 2;
            n4 += 96;
            int n5 = (int)(l6 >>> (n4 -= 66));
            l6 += 0x100000000L;
            int n6 = -2;
            n6 -= 56;
            long l9 = l3;
            int n7 = 13;
            n7 += -74;
            l3 = l9 ^ ((long)n5 << (n6 -= -90) ^ l9) & -1L << (n7 ^= 0xFFFFFFE3);
            int n8 = -16;
            n8 += 20;
            if ((int)(l3 >>> (n8 += 28)) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int n9 = -66;
            n9 += 5;
            Setting setting = (Setting)t2;
            long l10 = l4;
            int n10 = 0;
            n10 += 108;
            long l11 = l4 = l10 ^ ((long)((int)(l3 >>> (n9 -= -93))) ^ l10) & -1L >>> (n10 -= 76);
            int n11 = 239;
            n11 -= 81;
            l4 = l11 ^ (0L ^ l11) & -1L << (n11 -= 126);
            jsonObject.add(INSTANCE.settingConfigKey((int)l4), INSTANCE.serializeSettingValue(setting));
        }
        return jsonObject;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private final JsonElement serializeSettingValue(Setting setting) {
        JsonElement jsonElement;
        Setting setting2 = setting;
        if (setting2 instanceof BooleanSetting) {
            jsonElement = new JsonPrimitive((Boolean)((BooleanSetting)setting).getValue());
        } else if (setting2 instanceof SliderSetting) {
            jsonElement = new JsonPrimitive((Number)((SliderSetting)setting).getValue());
        } else if (setting2 instanceof ModeSetting) {
            jsonElement = new JsonPrimitive(((ModeSetting)setting).getSelectedIndex());
        } else if (setting2 instanceof TextSetting) {
            jsonElement = new JsonPrimitive((String)((TextSetting)setting).getValue());
        } else if (setting2 instanceof BindSetting) {
            jsonElement = new JsonPrimitive((Number)((BindSetting)setting).getValue());
        } else if (setting2 instanceof ColorSetting) {
            jsonElement = new JsonPrimitive(((Color)((ColorSetting)setting).getValue()).getRGB());
        } else {
            JsonElement jsonElement2 = G.toJsonTree(setting.getValue());
            jsonElement = jsonElement2;
            int n2 = -65;
            Intrinsics.checkNotNullExpressionValue(jsonElement2, (String)l[n2 ^= 0xFFFFFFBB]);
        }
        return jsonElement;
    }

    private final void deserializeClickGuiSettings(JsonObject content) {
        int n2 = 80;
        n2 ^= 0xFFFFFF8F;
        int n3 = 13;
        n3 ^= 0x70;
        JsonObject jsonObject = content.getAsJsonObject((String)l[n2 -= -93] + (String)l[n3 -= 83]);
        if (jsonObject == null) {
            JsonObject jsonObject2;
            int n4 = 2;
            n4 += -113;
            JsonObject jsonObject3 = content.getAsJsonObject((String)l[n4 ^= 0xFFFFFFB3]);
            if (jsonObject3 != null) {
                int n5 = 76;
                n5 += -8;
                jsonObject2 = jsonObject3.getAsJsonObject((String)l[n5 -= 12]);
            } else {
                jsonObject2 = jsonObject = null;
            }
            if (jsonObject2 == null) {
                JsonObject jsonObject4;
                int n6 = -46;
                n6 -= 71;
                JsonObject jsonObject5 = content.getAsJsonObject((String)l[n6 ^= 0xFFFFFFB1]);
                if (jsonObject5 != null) {
                    int n7 = 56;
                    n7 ^= 0xFFFFFFFF;
                    jsonObject4 = jsonObject5.getAsJsonObject((String)l[n7 ^= 0xFFFFFFE2]);
                } else {
                    jsonObject4 = jsonObject = null;
                }
                if (jsonObject4 == null) {
                    return;
                }
            }
        }
        JsonObject jsonObject6 = jsonObject;
        this.deserializeSettings(ClickGuiSettings.INSTANCE.getSettings(), jsonObject6);
    }

    private final void deserializeModule(Module module, JsonObject json) {
        block4: {
            JsonElement jsonElement;
            JsonElement jsonElement2;
            long l2 = 1026020942803830915L;
            long l3 = -6687905404997335217L;
            long l4 = -8134994430644241972L;
            int n2 = 85;
            n2 -= 87;
            JsonElement jsonElement3 = json.get((String)l[n2 -= -73]);
            if (jsonElement3 != null) {
                jsonElement = jsonElement2 = jsonElement3;
                long l5 = l4;
                int n3 = 130;
                n3 -= 22;
                l4 = l5 ^ (0L ^ l5) & -1L << (n3 -= 76);
                jsonElement3 = jsonElement.isJsonPrimitive() ? jsonElement2 : null;
                if (jsonElement3 != null) {
                    jsonElement = jsonElement3;
                    long l6 = l4;
                    int n4 = 93;
                    n4 -= 103;
                    l4 = l6 ^ (0L ^ l6) & -1L << (n4 += 42);
                    module.setKey(jsonElement.getAsInt());
                }
            }
            int n5 = 34;
            n5 ^= 0xFFFFFFD2;
            JsonObject jsonObject = json.getAsJsonObject((String)l[n5 += 78]);
            if (jsonObject != null) {
                jsonElement2 = jsonObject;
                long l7 = l3;
                int n6 = -34;
                n6 ^= 0x15;
                l3 = l7 ^ (0L ^ l7) & -1L << (n6 += 85);
                INSTANCE.deserializeSettings(module.getSettings(), (JsonObject)jsonElement2);
            }
            int n7 = -91;
            n7 += 72;
            JsonElement jsonElement4 = json.get((String)l[n7 -= -58]);
            if (jsonElement4 == null) break block4;
            jsonElement = jsonElement2 = jsonElement4;
            long l8 = l4;
            int n8 = -57;
            n8 ^= 0xFFFFFFFE;
            l4 = l8 ^ (0L ^ l8) & -1L << (n8 ^= 0x19);
            jsonElement4 = jsonElement.isJsonPrimitive() ? jsonElement2 : null;
            if (jsonElement4 != null) {
                jsonElement = jsonElement4;
                long l9 = l4;
                int n9 = 92;
                n9 ^= 0xFFFFFF99;
                l4 = l9 ^ (0L ^ l9) & -1L << (n9 ^= 0xFFFFFFE5);
                module.setEnabled(jsonElement.getAsBoolean());
            }
        }
    }

    private final void deserializeSettings(List<? extends kotakbaz.rain.module.setting.B<?>> settings, JsonObject json) {
        int n2;
        long l2 = 5582833131377935952L;
        long l3 = 728519012971637750L;
        long l4 = 612293998515084851L;
        long l5 = -1268101635574765115L;
        long l6 = 6200711574332188181L;
        long l7 = -1899046068045905584L;
        long l8 = 1751149823173956279L;
        if (json.size() == settings.size()) {
            int n3 = -24;
            n3 -= 55;
            n2 = n3 ^= 0xFFFFFFB0;
        } else {
            int n4 = 56;
            n4 -= -1;
            n2 = n4 ^= 0x39;
        }
        long l9 = l8;
        int n5 = -122;
        n5 ^= 0x54;
        l8 = l9 ^ ((long)n2 ^ l9) & -1L >>> (n5 -= -78);
        Iterable iterable = settings;
        long l10 = l2;
        int n6 = 17;
        ++n6;
        l2 = l10 ^ (0L ^ l10) & -1L >>> (n6 -= -14);
        long l11 = l4;
        int n7 = 110;
        n7 ^= 0x76;
        l4 = l11 ^ (0L ^ l11) & -1L << (n7 -= -8);
        for (Object t2 : iterable) {
            int n8 = -57;
            n8 ^= 0xFFFFFFA9;
            int n9 = (int)(l4 >>> (n8 ^= 0x4E));
            l4 += 0x100000000L;
            int n10 = 113;
            n10 ^= 0x6C;
            long l12 = l5;
            int n11 = 10;
            n11 ^= 0x25;
            l5 = l12 ^ ((long)n9 << (n10 ^= 0x3D) ^ l12) & -1L << (n11 += -15);
            int n12 = 238;
            n12 += -116;
            if ((int)(l5 >>> (n12 -= 90)) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int n13 = -81;
            n13 += -17;
            n13 ^= 0xFFFFFFBE;
            Setting setting = (Setting)t2;
            int n14 = 231;
            n14 -= 91;
            long l13 = l7;
            int n15 = 96;
            n15 += 51;
            l7 = l13 ^ ((long)((int)(l5 >>> n13)) << (n14 += -108) ^ l13) & -1L << (n15 -= 115);
            long l14 = l6;
            int n16 = -126;
            n16 ^= 0x46;
            l6 = l14 ^ (0L ^ l14) & -1L >>> (n16 -= -92);
            int n17 = 2;
            n17 -= -37;
            JsonElement jsonElement = json.get(INSTANCE.settingConfigKey((int)(l7 >>> (n17 += -7))));
            if (jsonElement == null && (jsonElement = json.get(setting.getName())) == null) {
                JsonElement jsonElement2;
                int n18 = 85;
                n18 -= -38;
                JsonElement jsonElement3 = jsonElement2 = INSTANCE.legacySettingElement(json, (int)(l7 >>> (n18 += -91)));
                long l15 = l8;
                int n19 = 124;
                n19 += -34;
                l8 = l15 ^ (0L ^ l15) & -1L << (n19 += -58);
                jsonElement = (int)l8 != 0 ? jsonElement2 : null;
                if (jsonElement == null) continue;
            }
            JsonElement jsonElement4 = jsonElement;
            INSTANCE.applySettingValue(setting, jsonElement4);
        }
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private final void applySettingValue(Setting setting, JsonElement element) {
        long l2 = 4155251153130790391L;
        if (!element.isJsonPrimitive()) {
            return;
        }
        Setting setting2 = setting;
        if (setting2 instanceof BooleanSetting) {
            ((BooleanSetting)setting).set(element.getAsBoolean());
        } else if (setting2 instanceof SliderSetting) {
            ((SliderSetting)setting).setClamped(element.getAsFloat());
        } else if (setting2 instanceof ModeSetting) {
            Object v2;
            block15: {
                JsonPrimitive jsonPrimitive = element.getAsJsonPrimitive();
                if (jsonPrimitive.isNumber()) {
                    ((ModeSetting)setting).setIndex(jsonPrimitive.getAsInt());
                    return;
                }
                Iterable iterable = ((ModeSetting)setting).getModes();
                long l3 = l2;
                int n2 = 192;
                n2 += -115;
                l2 = l3 ^ (0L ^ l3) & -1L << (n2 ^= 0x6D);
                for (Object t2 : iterable) {
                    String string = (String)t2;
                    long l4 = l2;
                    int n3 = 62;
                    n3 += -113;
                    l2 = l4 ^ (0L ^ l4) & -1L >>> (n3 ^= 0xFFFFFFED);
                    boolean bl = 75 != 0;
                    bl ^= 0xFFFFFF9F;
                    if (!StringsKt.equals(string, element.getAsString(), bl += 45)) continue;
                    v2 = t2;
                    break block15;
                }
                v2 = null;
            }
            String string = v2;
            if (string == null) {
                return;
            }
            String string2 = string;
            ((ModeSetting)setting).setMode(string2);
        } else if (setting2 instanceof TextSetting) {
            TextSetting textSetting = (TextSetting)setting;
            String string = element.getAsString();
            int n4 = -161;
            n4 += 122;
            int n5 = -186;
            n5 -= -81;
            Intrinsics.checkNotNullExpressionValue(string, (String)l[n4 -= -61] + (String)l[n5 -= -124]);
            textSetting.setText(string);
        } else if (setting2 instanceof BindSetting) {
            ((BindSetting)setting).setKey(element.getAsInt());
        } else if (setting2 instanceof ColorSetting) {
            int n2 = 45;
            n2 = n2 ^ 0x70;
            boolean bl2 = n2 + -92;
            ((ColorSetting)setting).setColor(new Color(element.getAsInt(), bl2));
        }
    }

    private final String moduleConfigKey(Module module) {
        return module.getName();
    }

    private final String legacyRuntimeModuleConfigKey(Module module) {
        String string;
        int n2;
        String string2;
        long l2 = -2137461284994292846L;
        String string3 = string2 = module.getClass().getSimpleName();
        long l3 = l2;
        int n3 = -20;
        n3 -= 72;
        l2 = l3 ^ (0L ^ l3) & -1L << (n3 ^= 0xFFFFFF84);
        if (!StringsKt.isBlank(string3)) {
            int n4 = -111;
            n4 ^= 0x57;
            n2 = n4 -= -59;
        } else {
            int n5 = 133;
            n5 -= 103;
            n2 = n5 ^= 0x1E;
        }
        if ((string = n2 != 0 ? string2 : null) == null) {
            string = module.getName();
        }
        return string;
    }

    private final List<JsonElement> legacyModuleEntries(JsonObject content) {
        Set<Map.Entry<String, JsonElement>> set = content.entrySet();
        int n2 = -22;
        n2 += 67;
        Intrinsics.checkNotNullExpressionValue(set, (String)l[n2 += 21]);
        return SequencesKt.toList(SequencesKt.filter(SequencesKt.map(SequencesKt.filterNot(SequencesKt.filterNot(SequencesKt.filterNot(CollectionsKt.asSequence((Iterable)set), ConfigManager::legacyModuleEntries$lambda$0), ConfigManager::legacyModuleEntries$lambda$1), ConfigManager::legacyModuleEntries$lambda$2), ConfigManager::legacyModuleEntries$lambda$3), c_0.INSTANCE));
    }

    private final JsonObject legacyModuleJson(List<? extends JsonElement> entries, int index) {
        JsonElement jsonElement = CollectionsKt.getOrNull(entries, index);
        return jsonElement != null ? jsonElement.getAsJsonObject() : null;
    }

    private final String settingConfigKey(int index) {
        long l2 = -4104609987475993196L;
        int n2 = 26;
        n2 ^= 0xFFFFFFBE;
        long l3 = l2;
        int n3 = 118;
        n3 ^= 0x22;
        l2 = l3 ^ ((long)index << (n2 ^= 0xFFFFFF84) ^ l3) & -1L << (n3 -= 52);
        int n4 = 103;
        n4 ^= 0x22;
        int n5 = 81;
        n5 += -1;
        return (String)l[n4 ^= 0x7E] + (int)(l2 >>> (n5 += -48));
    }

    private final JsonElement legacySettingElement(JsonObject json, int index) {
        Set<Map.Entry<String, JsonElement>> set = json.entrySet();
        int n2 = -10;
        n2 ^= 3;
        Intrinsics.checkNotNullExpressionValue(set, (String)l[n2 += 63]);
        Map.Entry entry = (Map.Entry)CollectionsKt.elementAtOrNull((Iterable)set, index);
        return entry != null ? (JsonElement)entry.getValue() : null;
    }

    private final void ensureConfigDirectory() {
        int n2 = -123;
        n2 ^= 0xFFFFFFD8;
        Files.createDirectories(H, new FileAttribute[n2 += -93]);
    }

    private final void ensureVisibleConfigsCache() {
        int n2 = -91;
        n2 = n2 ^ 0xFFFFFFDC;
        boolean bl2 = n2 + -121;
        this.rebuildVisibleConfigs(bl2);
    }

    private final void rebuildVisibleConfigs(boolean force) {
        long l2 = -3768073250572858067L;
        long l3 = 1101300441504474351L;
        long l4 = -2583145713787341645L;
        if (!force && !k) {
            return;
        }
        List<ConfigInfo> list = this.loadVisibleConfigs();
        int n2 = -92;
        n2 -= 17;
        k = n2 += 109;
        if (Intrinsics.areEqual(list, j)) {
            return;
        }
        j = list;
        Iterable iterable = list;
        long l5 = l3;
        int n3 = 53;
        n3 += 33;
        l3 = l5 ^ (0L ^ l5) & -1L << (n3 += -54);
        Iterable iterable2 = iterable;
        int n4 = 65;
        n4 += -17;
        Collection collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, n4 += -38));
        long l6 = l3;
        int n5 = -19;
        n5 -= 33;
        l3 = l6 ^ (0L ^ l6) & -1L >>> (n5 += 84);
        for (Object t2 : iterable2) {
            ConfigInfo configInfo = (ConfigInfo)t2;
            Collection collection2 = collection;
            long l7 = l4;
            int n6 = 11;
            n6 -= 113;
            l4 = l7 ^ (0L ^ l7) & -1L << (n6 ^= 0xFFFFFFBA);
            collection2.add(configInfo.getName());
        }
        J = (List)collection;
        long l8 = l4;
        int n7 = 20;
        n7 -= -18;
        l4 = l8 ^ ((long)K ^ l8) & -1L >>> (n7 -= 6);
        int n8 = -45;
        n8 -= -119;
        K = (int)l4 + (n8 ^= 0x4B);
    }

    private final List<ConfigInfo> loadVisibleConfigs() {
        long l2 = -262556764679555209L;
        this.ensureConfigDirectory();
        File[] fileArray = H.toFile().listFiles(ConfigManager::loadVisibleConfigs$lambda$0);
        if (fileArray == null) {
            return CollectionsKt.emptyList();
        }
        File[] fileArray2 = fileArray;
        Sequence<Pair> sequence = SequencesKt.filterNot(SequencesKt.map(SequencesKt.filterNot(ArraysKt.asSequence(fileArray2), ConfigManager::loadVisibleConfigs$lambda$1), ConfigManager::loadVisibleConfigs$lambda$2), ConfigManager::loadVisibleConfigs$lambda$3);
        long l3 = l2;
        int n2 = 123;
        n2 ^= 0xFFFFFF99;
        l2 = l3 ^ (0L ^ l3) & -1L << (n2 += 62);
        return SequencesKt.toList(SequencesKt.map(SequencesKt.sortedWith(sequence, new A()), ConfigManager::loadVisibleConfigs$lambda$5));
    }

    private final void markVisibleConfigsDirty() {
        long l2 = 1270355096636969151L;
        int n2 = 155;
        n2 += -92;
        k = n2 -= 62;
        int n3 = -104;
        n3 ^= 0x20;
        long l3 = l2;
        int n4 = 86;
        n4 += -33;
        l2 = l3 ^ ((long)K << (n3 ^= 0xFFFFFF98) ^ l3) & -1L << (n4 += -21);
        int n5 = -54;
        n5 += 101;
        int n6 = -61;
        n6 -= -13;
        K = (int)(l2 >>> (n5 ^= 0xF)) + (n6 ^= 0xFFFFFFD1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean isInternalConfigFile(String fileName) {
        int n2;
        int n3 = 264;
        n3 -= 124;
        int n6 = -145;
        n6 = n6 + 114;
        n6 = n6 ^ 0xFFFFFFE0;
        if (!StringsKt.equals(fileName, (String)l[n3 += -63], n6 != 0)) {
            int n7 = -86;
            n7 -= 16;
            int n10 = -11;
            n10 = n10 - -119;
            n10 = n10 ^ 0x6D;
            if (!StringsKt.equals(fileName, (String)l[n7 ^= 0xFFFFFF94], n10 != 0)) {
                int n11 = 144;
                n11 -= 54;
                n2 = n11 -= 90;
                return n2 != 0;
            }
        }
        int n12 = -120;
        n12 ^= 0x44;
        n2 = n12 += 53;
        return n2 != 0;
    }

    private final void persistSelectedConfigName() {
        long l2 = -1847234598178089425L;
        ConfigManager configManager = this;
        try {
            Comparable comparable;
            Object object = configManager;
            long l3 = l2;
            int n2 = 82;
            n2 += -22;
            l2 = l3 ^ (0L ^ l3) & -1L << (n2 += -28);
            int n3 = 18;
            n3 -= -12;
            Files.createDirectories(i.getParent(), new FileAttribute[n3 -= 30]);
            String string = I;
            if (string == null) {
                comparable = Boolean.valueOf(Files.deleteIfExists(i));
            } else {
                int n4 = 180;
                n4 -= 66;
                OpenOption[] openOptionArray = new OpenOption[n4 += -111];
                int n5 = 34;
                n5 ^= 0xFFFFFFDB;
                openOptionArray[n5 ^= 0xFFFFFFF9] = StandardOpenOption.CREATE;
                int n6 = -79;
                n6 += 110;
                openOptionArray[n6 -= 30] = StandardOpenOption.TRUNCATE_EXISTING;
                int n7 = -8;
                n7 ^= 0x5B;
                openOptionArray[n7 ^= 0xFFFFFFA1] = StandardOpenOption.WRITE;
                comparable = Files.writeString(i, (CharSequence)string, openOptionArray);
            }
            object = Result.cfr_renamed_1(comparable);
        }
        catch (Throwable throwable) {
            Object object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final String readSelectedConfigName() {
        var9_1 = -5507479069997251718L;
        var11_2 = -6027794047577159194L;
        var14_3 = 90;
        var14_3 ^= -34;
        if (!Files.exists(ConfigManager.i, new LinkOption[var14_3 -= -124])) {
            return null;
        }
        var1_4 = this;
        try {
            var2_5 = var1_4;
            v0 = var9_1;
            var16_6 = 36;
            var16_6 -= -24;
            var9_1 = v0 ^ (0L ^ v0) & -1L << (var16_6 ^= 28);
            v1 = Files.readString(ConfigManager.i);
            var18_7 = -41;
            var18_7 ^= 35;
            Intrinsics.checkNotNullExpressionValue(v1, (String)ConfigManager.l[var18_7 -= -86]);
            var5_9 = var4_8 = StringsKt.trim((CharSequence)v1).toString();
            v2 = var9_1;
            var20_10 = 237;
            var20_10 += -86;
            var9_1 = v2 ^ (0L ^ v2) & -1L >>> (var20_10 += -119);
            if (((CharSequence)var5_9).length() > 0) {
                var22_11 = 29;
                var22_11 += -85;
                v3 = var22_11 -= -57;
            } else {
                var24_12 = 21;
                var24_12 -= 18;
                v3 = var24_12 -= 3;
            }
            v4 = var7_13 = v3 != 0 ? var4_8 : null;
            if (var7_13 == null) ** GOTO lbl-1000
            var6_14 = var5_9 = var7_13;
            v5 = var11_2;
            var26_15 = -39;
            var26_15 ^= -27;
            var11_2 = v5 ^ (0L ^ v5) & -1L << (var26_15 += -28);
            v6 = var4_8 = var2_5.isValidName(var6_14) != false ? var5_9 : null;
            if (var4_8 != null) {
                var6_14 = var5_9 = var4_8;
                v7 = var11_2;
                var28_16 = 75;
                var28_16 ^= -113;
                var11_2 = v7 ^ (0L ^ v7) & -1L << (var28_16 -= -92);
                var30_17 = 24;
                var30_17 -= -49;
                var32_18 = 104 != 0;
                var32_18 -= 113;
                if (!StringsKt.equals(var6_14, (String)ConfigManager.l[var30_17 ^= 88], var32_18 += 10)) {
                    var34_19 = 113;
                    var34_19 ^= -21;
                    v8 = var34_19 += 103;
                } else {
                    var36_20 = 39;
                    var36_20 -= 51;
                    v8 = var36_20 += 12;
                }
                v9 = v8 != 0 ? var5_9 : null;
            } else lbl-1000:
            // 2 sources

            {
                v9 = null;
            }
            var2_5 = Result.cfr_renamed_1(v9);
        }
        catch (Throwable var3_21) {
            var2_5 = Result.cfr_renamed_1(ResultKt.createFailure(var3_21));
        }
        var1_4 = var2_5;
        return (String)(Result.cfr_renamed_3(var1_4) != false ? null : var1_4);
    }

    private final String currentAuthor() {
        String string;
        int n2;
        String string2;
        long l2 = -784032276103888408L;
        String string3 = string2 = a_0.username();
        long l3 = l2;
        int n3 = 62;
        n3 -= 69;
        l2 = l3 ^ (0L ^ l3) & -1L << (n3 ^= 0xFFFFFFD9);
        if (!StringsKt.isBlank(string3)) {
            int n4 = -2;
            n4 -= 33;
            n2 = n4 ^= 0xFFFFFFDC;
        } else {
            int n5 = 26;
            n5 -= 57;
            n2 = n5 ^= 0xFFFFFFE1;
        }
        if ((string = n2 != 0 ? string2 : null) == null) {
            String string4;
            String string5;
            GameProfile gameProfile;
            string3 = kotakbaz.rain.client.extensions.b.getMc().player;
            if (string3 != null && (gameProfile = string3.getGameProfile()) != null && (string5 = gameProfile.getName()) != null) {
                int n6;
                String string6;
                String string7 = string6 = string5;
                long l4 = l2;
                int n7 = 91;
                n7 ^= 0xFFFFFFBC;
                l2 = l4 ^ (0L ^ l4) & -1L >>> (n7 -= -57);
                if (!StringsKt.isBlank(string7)) {
                    int n8 = -69;
                    n8 -= 50;
                    n6 = n8 += 120;
                } else {
                    int n9 = 62;
                    n9 -= 78;
                    n6 = n9 ^= 0xFFFFFFF0;
                }
                string4 = n6 != 0 ? string6 : null;
            } else {
                string4 = string = null;
            }
            if (string4 == null) {
                String string8 = kotakbaz.rain.client.extensions.b.getMc().getSession().getUsername();
                string = string8;
                int n10 = -19;
                n10 ^= 0xFFFFFF8F;
                int n11 = 83;
                n11 += -29;
                Intrinsics.checkNotNullExpressionValue(string8, (String)l[n10 -= 86] + (String)l[n11 ^= 0x7D]);
            }
        }
        return string;
    }

    private final void restoreMisplacedInternalFiles() {
        block8: {
            Object object;
            Path path;
            Path path2;
            long l2;
            long l3;
            block7: {
                block6: {
                    l3 = 3851736905791372459L;
                    l2 = 1408627349217614974L;
                    int n2 = -129;
                    n2 += 18;
                    path2 = H.resolve((String)l[n2 ^= 0xFFFFFF88]);
                    int n3 = 84;
                    n3 ^= 0xFFFFFFD6;
                    path = h.resolve((String)l[n3 ^= 0xFFFFFF84]);
                    int n4 = -26;
                    n4 -= -83;
                    if (!Files.exists(path2, new LinkOption[n4 ^= 0x39])) break block6;
                    int n5 = 47;
                    n5 ^= 0xFFFFFFD9;
                    if (!Files.exists(path, new LinkOption[n5 ^= 0xFFFFFFF6])) break block7;
                }
                return;
            }
            Object object2 = this;
            try {
                object = object2;
                long l4 = l3;
                int n6 = -72;
                n6 ^= 0xFFFFFF8F;
                l3 = l4 ^ (0L ^ l4) & -1L << (n6 -= 23);
                int n7 = 5;
                n7 ^= 3;
                Files.createDirectories(path.getParent(), new FileAttribute[n7 += -6]);
                int n8 = -76;
                n8 += 98;
                object = Result.cfr_renamed_1(Files.move(path2, path, new CopyOption[n8 += -22]));
            }
            catch (Throwable throwable) {
                object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
            }
            object2 = object;
            Throwable throwable = Result.cfr_renamed_2(object2);
            if (throwable == null) break block8;
            Object object3 = object = throwable;
            long l5 = l3;
            int n9 = 229;
            n9 -= 87;
            l3 = l5 ^ (0L ^ l5) & -1L >>> (n9 -= 110);
            ConfigManager configManager = INSTANCE;
            try {
                Object object4 = configManager;
                long l6 = l2;
                int n10 = 29;
                n10 ^= 0x67;
                l2 = l6 ^ (0L ^ l6) & -1L << (n10 ^= 0x5A);
                int n11 = 94;
                n11 += -107;
                object4 = Result.cfr_renamed_1(Files.copy(path2, path, new CopyOption[n11 += 13]));
            }
            catch (Throwable throwable2) {
                Object object5 = Result.cfr_renamed_1(ResultKt.createFailure(throwable2));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void migrateLegacyConfigs() {
        long l2;
        block11: {
            block10: {
                l2 = -9116321243260795266L;
                if (Intrinsics.areEqual(h, H)) break block10;
                int n2 = 80;
                n2 ^= 0xFFFFFF94;
                if (Files.isDirectory(h, new LinkOption[n2 ^= 0xFFFFFFC4])) break block11;
            }
            return;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        AutoCloseable autoCloseable = Files.list(h);
        Throwable throwable = null;
        try {
            Object object = (Stream)autoCloseable;
            long l3 = l2;
            int n3 = 46;
            n3 += -78;
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 -= -64);
            object.filter(arg_0 -> ConfigManager.migrateLegacyConfigs$lambda$0$1(ConfigManager::migrateLegacyConfigs$lambda$0$0, arg_0)).forEach(arg_0 -> ConfigManager.migrateLegacyConfigs$lambda$0$3(arg_0 -> ConfigManager.migrateLegacyConfigs$lambda$0$2(booleanRef, arg_0), arg_0));
            object = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
        if (booleanRef.element) {
            this.markVisibleConfigsDirty();
        }
    }

    private static final boolean getConfigNames$lambda$0(File file, String string) {
        Intrinsics.checkNotNull(string);
        int n2 = 109;
        n2 ^= 0x75;
        n2 -= 23;
        int n3 = 29;
        n3 = n3 ^ 0xFFFFFFF9;
        boolean bl2 = n3 + 28;
        int n4 = 7;
        n4 += -2;
        return StringsKt.endsWith$default(string, (String)l[n2], bl2, n4 += -3, null);
    }

    private static final String getConfigNames$lambda$1(String it) {
        Intrinsics.checkNotNull(it);
        int n2 = 99;
        n2 -= 66;
        return StringsKt.removeSuffix(it, (CharSequence)((String)l[n2 -= -16]));
    }

    private static final boolean legacyModuleEntries$lambda$0(Map.Entry entry) {
        Intrinsics.checkNotNull(entry);
        String string = (String)entry.getKey();
        int n2 = 32;
        n2 -= -18;
        int n3 = 36;
        n3 ^= 0x50;
        return Intrinsics.areEqual(string, (String)l[n2 -= 39] + (String)l[n3 -= 38]);
    }

    private static final boolean legacyModuleEntries$lambda$1(Map.Entry entry) {
        Intrinsics.checkNotNull(entry);
        String string = (String)entry.getKey();
        int n2 = -103;
        n2 += 84;
        return Intrinsics.areEqual(string, (String)l[n2 += 88]);
    }

    private static final boolean legacyModuleEntries$lambda$2(Map.Entry entry) {
        Intrinsics.checkNotNull(entry);
        String string = (String)entry.getKey();
        int n2 = -24;
        n2 ^= 0xFFFFFFCA;
        return Intrinsics.areEqual(string, (String)l[n2 ^= 0x66]);
    }

    private static final JsonElement legacyModuleEntries$lambda$3(Map.Entry it) {
        return (JsonElement)it.getValue();
    }

    private static final boolean loadVisibleConfigs$lambda$0(File file, String string) {
        Intrinsics.checkNotNull(string);
        int n2 = 204;
        n2 += -119;
        n2 ^= 0x78;
        int n3 = -38;
        n3 = n3 ^ 0xFFFFFFDE;
        boolean bl2 = n3 ^ 4;
        int n4 = -234;
        n4 += 125;
        return StringsKt.endsWith$default(string, (String)l[n2], bl2, n4 += 111, null);
    }

    private static final boolean loadVisibleConfigs$lambda$1(File it) {
        String string = it.getName();
        int n2 = 185;
        n2 += -36;
        Intrinsics.checkNotNullExpressionValue(string, (String)l[n2 += -92]);
        return INSTANCE.isInternalConfigFile(string);
    }

    private static final Pair loadVisibleConfigs$lambda$2(File file) {
        String string = file.getName();
        int n2 = -45;
        n2 -= 3;
        Intrinsics.checkNotNullExpressionValue(string, (String)l[n2 ^= 0xFFFFFFD7]);
        int n3 = 122;
        n3 -= -3;
        return TuplesKt.to(StringsKt.removeSuffix(string, (CharSequence)((String)l[n3 -= 71])), file.toPath());
    }

    private static final boolean loadVisibleConfigs$lambda$3(Pair pair) {
        int n2 = -65;
        n2 -= -49;
        Intrinsics.checkNotNullParameter(pair, (String)l[n2 -= -45]);
        String string = (String)pair.component1();
        int n3 = 113;
        n3 += -36;
        int n4 = 138;
        n4 = n4 + -43;
        boolean bl2 = n4 ^ 0x5E;
        return StringsKt.equals(string, (String)l[n3 -= 45], bl2);
    }

    private static final ConfigInfo loadVisibleConfigs$lambda$5(Pair pair) {
        int n2 = 13;
        n2 += -74;
        Intrinsics.checkNotNullParameter(pair, (String)l[n2 -= -109]);
        String string = (String)pair.component1();
        Path path = (Path)pair.component2();
        Intrinsics.checkNotNull(path);
        return new ConfigInfo(string, INSTANCE.readAuthor(path));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static final boolean migrateLegacyConfigs$lambda$0$0(Path path) {
        int n2;
        int n3 = 144;
        n3 -= 38;
        if (Files.isRegularFile(path, new LinkOption[n3 ^= 0x6A])) {
            int n4 = -196;
            n4 -= -120;
            n4 -= -123;
            int n6 = -134;
            n6 = n6 + 72;
            boolean bl = n6 ^ 0xFFFFFFC2;
            int n7 = 113;
            n7 += -126;
            if (StringsKt.endsWith$default(((Object)path.getFileName()).toString(), (String)l[n4], bl, n7 += 15, null)) {
                int n8 = -8;
                n8 -= 18;
                n2 = n8 += 27;
                return n2 != 0;
            }
        }
        int n9 = 19;
        n9 ^= 0xFFFFFFB7;
        n2 = n9 += 92;
        return n2 != 0;
    }

    private static final boolean migrateLegacyConfigs$lambda$0$1(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    private static final Unit migrateLegacyConfigs$lambda$0$2(Ref.BooleanRef $migrated, Path legacyFile) {
        block6: {
            Object object;
            long l2 = 563264788390886647L;
            long l3 = -2692268867365252790L;
            String string = ((Object)legacyFile.getFileName()).toString();
            if (INSTANCE.isInternalConfigFile(string)) {
                return Unit.INSTANCE;
            }
            Path path = H.resolve(string);
            int n2 = 74;
            n2 += -60;
            if (Files.exists(path, new LinkOption[n2 -= 14])) {
                return Unit.INSTANCE;
            }
            Object object2 = INSTANCE;
            try {
                object = object2;
                long l4 = l2;
                int n3 = 123;
                n3 -= 49;
                l2 = l4 ^ (0L ^ l4) & -1L << (n3 ^= 0x6A);
                int n4 = -178;
                n4 -= -82;
                Files.move(legacyFile, path, new CopyOption[n4 -= -96]);
                int n5 = 36;
                n5 ^= 0xFFFFFFAE;
                $migrated.element = n5 += 119;
                object = Result.cfr_renamed_1(Unit.INSTANCE);
            }
            catch (Throwable throwable) {
                object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
            }
            object2 = object;
            Throwable throwable = Result.cfr_renamed_2(object2);
            if (throwable == null) break block6;
            Object object3 = object = throwable;
            long l5 = l2;
            int n6 = -53;
            n6 -= -71;
            l2 = l5 ^ (0L ^ l5) & -1L >>> (n6 -= -14);
            ConfigManager configManager = INSTANCE;
            try {
                Object object4 = configManager;
                long l6 = l3;
                int n7 = -107;
                n7 ^= 0xFFFFFF9C;
                l3 = l6 ^ (0L ^ l6) & -1L << (n7 ^= 0x29);
                int n8 = -13;
                n8 += 51;
                Files.copy(legacyFile, path, new CopyOption[n8 += -38]);
                int n9 = 4;
                n9 -= -122;
                $migrated.element = n9 -= 125;
                object4 = Result.cfr_renamed_1(Unit.INSTANCE);
            }
            catch (Throwable throwable2) {
                Object object5 = Result.cfr_renamed_1(ResultKt.createFailure(throwable2));
            }
        }
        return Unit.INSTANCE;
    }

    private static final void migrateLegacyConfigs$lambda$0$3(Function1 $tmp0, Object p0) {
        $tmp0.invoke(p0);
    }

    public static final /* synthetic */ boolean access$isInternalConfigFile(ConfigManager $this, String fileName) {
        return $this.isInternalConfigFile(fileName);
    }

    static {
        ConfigManager.b();
        long l2 = 5854648607047773543L;
        long l3 = -8170277801046079470L;
        long l4 = 4407910532993727632L;
        long l5 = 7456790672821945707L;
        long l6 = -6142681748087876749L;
        long l7 = -8881843121633970902L;
        long l8 = -7687802138895495126L;
        long l9 = 1118029193467682141L;
        long l10 = -9206980515251619340L;
        long l11 = -1023826790307511682L;
        long l12 = 3507650753239392913L;
        long l13 = 6640808598145620709L;
        long l14 = 5820640710159550672L;
        long l15 = -6309759893121088130L;
        int n2 = 119;
        n2 ^= 9;
        l = new Object[n2 += -44];
        long l16 = l15;
        int n3 = 179;
        n3 -= 85;
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += -62);
        Object[] objectArray = new Object[3];
        objectArray[0] = L;
        objectArray[1] = 0;
        Object object = ConfigManager.A()[0];
        if (object == null) {
            char[] cArray = "\ufafe\ufafd\ufb00\uef62\ufb17\uef73\ufed9\uef70\ufb28\uef68\ufb04\ufb0e\ufb23\ufb29\uef6e\ufed8\ufb02\ufed3\ufb15\ufafb\ufb00\ufb2f\ufadd\ufed2\uef66\ufb24\ufed3\ufed9\ufb2c\ufafe\ufb05\ufb17\uf014\ufb08\uef70\ufb29\uef6e\ufb08\ufb35\ufb00\ufb11\uf019\ufb04\uf014\ufea7\ufb10\ufb0e\ufb26\ufb2e\ufafd\ufb2e\ufed9\uef66\ufb0e\ufb10\uef3a\uef78\ufe9f\ufb15\ufed2\uf019\ufafb\ufb2e\uef62\ufb03\ufb11\ufb29\ufb23\uef3d\ufb35\ufb04\ufed9\ufb04\ufb09\ufadd\uef65\uef66\uef3a\ufb28\ufea7\ufada\uef72\uef62\uf019\ufea7\ufb2c\ufb25\uef68\uf014\ufada\uef72\uef6e\ufafa\uef3d\ufe9f\uef3a\ufb0c\ufb11\ufb26\ufaff\ufe9f\ufade\uef66\ufb04\ufb0f\ufb03\ufb29\ufafa\ufb11\ufb28\ufb08\ufb0c\ufb37\ufb35\ufb0f\ufb26\ufb31\ufadd\ufaff\ufb10\ufafe\ufadd\ufea7\uef3d\ufb22\ufb04\ufb15\ufed8\ufb15\ufade\ufb35\uf019\ufb0e\ufed4\uef78\ufed8\ufb0c\uef62\ufb0f\uef70\ufb06\ufb30\uf019\ufb02\ufb17\ufafb\uef65\uf019\ufed2\ufafb\uef63\uef78\ufed8\uef65\ufb2e\ufb0c\ufafd\ufb37\ufaff\ufb17\ufb24\ufb09\ufafb\ufb29\ufed4\ufb02\ufb2f\uef72\ufaff\ufb28\ufafe\ufada\ufed4\uf019\ufb37\ufb34\uef3d\ufafa\uef68\ufb00\ufb03\ufae0\uef78\uef78\ufb29\uef68\ufb23\uf014\ufaff\uef3d\ufadd\uef47\ufe9f\ufb11\ufb2e\ufb31\ufafd\uef72\ufadd\ufafa\ufb28\uef3a\ufb09\ufb04\ufed3\ufb37\ufadd\ufe9f\ufea7\ufed3\ufb39\uef72\ufb03\ufae0\ufb22\ufea7\ufb23\ufed4\ufb24\uef3a\ufb31\ufb22\ufb10\ufed4\ufada\ufed4\ufb2c\ufe9f\uef78\ufb08\ufb06\uef73\uef63\ufb11\uef47\ufb06\uef65\ufb2e\ufea7\ufafb\ufe9f\ufb10\ufb28\uef63\ufb17\ufb2f\ufb2e\ufed9\uef62\ufed4\ufb25\ufed8\ufb29\ufb31\uf014\ufb0f\ufb28\ufb2c\ufb08\ufb29\ufadd\ufed9\ufb06\uef72\ufb24\uf014\ufed3\ufb03\ufed4\ufaff\uef73\ufed2\ufb0e\ufb31\ufb35\uef62\ufea7\ufb35\ufb2e\ufafd\ufb0f\ufafd\ufb05\uef3d\ufed2\ufea7\ufadb\ufb26\ufadd\ufb28\ufed4\ufb0c\ufafd\ufada\ufae0\ufb05\uef66\ufb2c\uef3d\ufade\uef65\ufed8\ufb08\ufed2\ufb0e\ufea7\uef62\ufb10\uef3d\ufb10\ufed3\ufed8\ufed3\ufb2c\ufb30\ufade\ufb00\ufb22\ufea7\uef3a\uef72\uf014\uef77\ufb05\ufb30\ufb02\uef77\ufafd\ufb05\ufb11\ufed4\ufb29\ufb34\ufada\ufb04\uef3d\ufb22\ufb02\ufadb\uef47\ufed9\ufada\uef63\ufb02\ufb08\uef6e\ufb22\ufb00\ufb2f\ufb24\uf014\ufb29\ufb00\uef73\ufb25\ufe9f\ufb03\ufb02\ufb25\uef77\ufe9f\ufb06\uf019\ufb24\uef77\uef3d\ufb2c\ufed9\uef73\ufada\ufada\ufb34\ufed9\uef47\uef68\ufb11\ufb03\ufb00\ufafd\ufb39\uef62\uef47\ufb2c\ufb2f\ufb31\ufb04\ufaff\uef3a\ufb23\ufb00\uef70\uef77\ufb05\ufade\ufe9f\ufb09\ufb06\ufafe\uef3a\uef65\ufb23\ufb35\ufb06\ufb24\ufed4\uef63\ufb05\ufb17\ufafa\uef65\ufb26\ufb2c\ufb26\uef65\uef68\ufb37\ufae0\ufb11\ufafb\ufb11\ufadd\ufb0e\ufafb\ufb05\uef68\ufb02\uef68\ufb29\ufb23\ufae0\ufb31\ufae0\ufb2f\ufb09\ufed9\ufb26\ufb2f\ufb0e\ufb2c\ufb08\ufb11\ufb2c\ufafd\ufade\ufadb\ufe9f\ufb0c\ufafd\ufafa\ufadd\ufb2f\ufb00\ufb28\uef66\ufb09\ufb00\ufadd\uf019\ufb10\ufafd\ufb17\ufadd\ufafd\ufadb\ufafa\ufb28\ufb2f\ufb2f\uef6e\ufb37\ufb0e\ufb2e\uef3d\ufade\ufb29\ufb2e\ufb04\ufb04\uef73\ufaff\ufb0c\ufed9\ufed4\ufb0c\uef62\uef62\ufb39\ufb04\ufed8\ufae0\ufae0\ufb31\ufb00\ufb09\ufade\ufb28\ufaff\uef3a\uef3d\ufb2c\ufb30\ufea7\ufb0c\uef3d\ufb25\ufb22\ufada\ufadb\uef65\ufed8\uef62\ufb26\ufb00\ufb00\ufb28\ufb35\ufed8\ufb35\ufea7\ufed9\ufb17\uf019\ufafe\ufb25\uef62\ufb09\uef3a\ufb2c\uef63\ufafa\uef62\ufaff\ufb09\ufb0e\ufed9\ufed2\ufae0\ufafd\ufb09\uf014\ufade\ufed3\ufb2e\ufb35\ufb06\ufb06\ufb35\ufae0\ufb34\ufb06\ufb00\uef66\uef66\uef6e\ufb28\ufadb\ufb34\ufb09\ufb09\ufb23\ufb11\ufb0f\ufed9\uef66\ufe9f\ufed9\ufafd\ufb2e\uef78\ufed8\uef63\ufb05\ufed2\ufb05\ufb10\ufb28\ufaff\ufb39\ufb22\uef63\ufed8\ufb15\ufb08\uef62\ufb17\ufb24\uef77\ufb28\ufea7\ufb00\uef3d\ufae0\uf019\uef68\ufb05\uef63\ufaff\ufaff\uef78\uef62\uef65\ufb10\ufb05\uef78\uef72\ufb17\ufe9f\ufb23\ufb2e\ufb37\ufb23\ufb35\uef72\ufb23\ufb35\ufadd\ufb17\ufb04\ufb11\ufadb\uef63\ufb31\ufb17\ufb0f\ufb2e\ufb35\ufb0e\ufed9\ufb17\ufb26\uef47\ufafd\ufe9f\ufb03\ufb05\ufafd\uef65\ufada\ufed8\ufed8\ufb37\uef65\uef72\ufb30\ufaff\uef3a\ufb24\ufafb\ufb06\uef6e\uef3d\ufaff\ufb17\ufb23\ufb26\ufb11\uf014\uef47\uef78\uef78\ufb09\ufada\uef62\ufb03\uef3a\ufafa\ufb05\uef47\ufb0f\uef3d\ufb08\uef6e\ufafa\ufb08\ufb39\ufb29\ufb2e\ufb34\uef65\ufb04\ufb2f\ufb0f\ufb02\ufb30\ufb0f\ufe9f\ufafd\ufed9\ufb2f\uef68\uef3d\ufb00\uef62\ufb03\ufafb\ufed4\uef3d\ufb0c\uef77\ufafb\ufb2e\ufade\ufb24\ufb06\ufea7\ufb11\ufb17\ufb39\ufea7\uef3d\ufb00\ufaff\ufb24\uf019\uef65\uef47\ufb29\ufed2\ufb0f\ufed3\ufb25\ufed3\ufb11\uef65\ufb29\ufafe\ufafb\ufb2e\uef72\ufafa\ufb24\uf014\ufed8\ufb34\ufafe\ufed4\uef3d\ufb28\ufb05\ufb31\ufaff\uef68\ufb37\ufadb\ufb23\uef3a\ufb29\ufe9f\ufb0c\ufe9f\ufb0f\uef70\uef6e\ufb05\ufb37\ufb0c\ufb10\ufb39\ufb24\ufed4\uef3a\ufae0\ufb11\uef66\ufb25\uef62\ufadd\ufb22\ufb26\uef63\ufade\ufafd\uef65\ufafd\ufea7\ufb11\uef47\ufb35\ufb31\uef47\ufed3\ufafb\ufe9f\ufb00\ufade\ufb02\ufb00\ufed2\uef3a\uef63\ufb30\uef62\ufade\ufafb\ufb10\ufae0\ufadb\uef73\ufb08\ufadd\ufed4\ufb0e\ufafe\ufaff\uef70\uef68\uef65\ufed3\uef72\ufed3\ufb34\ufade\ufb34\ufb37\uef68\uf019\ufb24\ufb22\ufb23\ufb2c\ufadd\ufb34\uef78\ufadb\uef6e\ufed8\ufada\uef6e\ufb31\ufb10\ufb04\uef63\ufed9\ufed9\ufafd\uef66\ufadb\uef72\ufb26\ufb05\ufb15\uef63\uef65\uef62\ufb25\uef3a\ufb04\ufed9\uef6e\ufafb\ufb06\ufadb\ufb25\ufb0e\ufb23\ufafe\uef73\ufb31\ufb00\ufed4\ufb02\uef66\uef66\uf014\ufb11\ufb23\uef66\ufb23\ufb05\uef6e\ufb03\ufb0c\ufed4\ufed2\ufada\ufed3\ufb04\ufb03\ufb02\ufadd\uef72\ufafb\ufb2c\ufade\ufb30\ufed4\uef6e\uef63\ufb10\uef3d\ufafd\ufb35\ufb37\ufb2e\uf019\uef72\uef72\ufb17\uef66\ufb24\ufb09\ufafa\uef68\uef70\ufb17\ufb09\ufb31\uef68\ufed9\ufb05\uef73\ufea7\ufb28\ufafb\ufb26\ufb26\uef3d\ufafd\ufb28\ufb0e\ufb11\ufed4\uef62\uef3d\ufb02\uef66\uef78\ufade\ufed4\ufb04\uef68\ufea7\ufed3\ufb28\uef65\uef78\uef66\ufb23\ufb2c\ufade\uef3d\ufb25\ufb10\ufea7\ufed2\ufb26\ufb11\ufb06\ufadd\ufb29\uef63\ufb23\ufaff\uef73\ufb35\ufb03\uef62\ufb0e\uef6e\ufb15\uef73\ufea7\ufe9f\ufed4\uef65\ufb35\uef6e\ufb08\ufb02\ufb10\uef78\ufb04\uef70\uef3d\ufade\ufb28\ufb30\ufed2\ufb08\ufb2f\ufb2e\ufafd\ufada\ufed2\ufb23\uef3d\ufea7\ufb0e\ufb25\ufb03\ufed8\ufb0f\ufb2f\ufb2e\ufb11\ufb2e\ufb08\ufb25\ufadb\uef65\ufb0f\ufb0f\uef77\ufb11\ufb39\ufaff\ufed2\ufb09\uef70\ufe9f\ufb37\ufb2c\ufade\ufed3\uef73\ufb30\ufadd\uef68\ufafa\ufe9f\ufae0\uef3a\uef73\ufb04\ufb2c\ufed2\ufadd\uef6e\uef77\ufed9\uef63\ufb04\ufb09\ufb09\ufb25\ufb03\ufafe\ufae0\ufada\ufb2f\uef78\ufed4\ufb11\ufafb\uf014\ufae0\ufb29\ufea7\uef62\ufb0f\ufb05\ufb2c\ufae0\uef62\ufe9f\ufb30\ufb39\ufe9f\ufb06\uef47\ufed3\ufb00\ufaff\ufb31\ufb28\ufb37\ufb06\ufed2\ufb04\ufb04\ufb37\ufb09\ufed8\uef77\ufadd\uef3d\ufed8\ufb15\ufb29\ufb39\ufb0c\ufb09\uef73\ufb0c\ufadb\ufb0e\ufafd\ufb39".toCharArray();
            for (int i2 = 0; i2 < 1088; ++i2) {
                int n4 = cArray[i2];
                n4 -= 24769;
                n4 += 16194;
                n4 += 30981;
                n4 ^= 0xD5E5;
                n4 += 64583;
                n4 ^= 0x598D;
                n4 += 10927;
                n4 ^= 0xC60F;
                n4 ^= 0xACB4;
                n4 -= 29717;
                n4 -= 5814;
                n4 ^= 0x9E5B;
                n4 += 28091;
                cArray[i2] = (char)(n4 ^= 0xEBDD);
            }
            object = ConfigManager.A()[0] = new String(cArray);
        }
        objectArray[2] = (String)object;
        char[] cArray = ((String)ConfigManager.a(objectArray)).toCharArray();
        long l17 = l6;
        int n5 = 150;
        n5 -= -7;
        l6 = l17 ^ (0x30700000000L ^ l17) & -1L << (n5 += -125);
        long l18 = l13;
        int n6 = -83;
        n6 -= -114;
        l13 = l18 ^ (0L ^ l18) & -1L >>> ++n6;
        while (true) {
            int n7 = -26;
            n7 += 64;
            if ((int)l13 >= (int)(l6 >>> (n7 -= 6))) break;
            int n8 = (int)l13;
            long l19 = l13;
            int n9 = -67;
            n9 -= 55;
            int n10 = 172;
            n10 += -38;
            l13 = l19 ^ (l19 ^ l19 + (long)(n9 += 123)) & -1L >>> (n10 += -102);
            long l20 = l9;
            int n11 = 62;
            n11 ^= 0x27;
            l9 = l20 ^ ((long)cArray[n8] ^ l20) & -1L >>> (n11 += 7);
            int n12 = (int)l13;
            long l21 = l13;
            int n13 = -8;
            n13 += 116;
            int n14 = -41;
            n14 += 119;
            l13 = l21 ^ (l21 ^ l21 + (long)(n13 += -107)) & -1L >>> (n14 ^= 0x6E);
            int n15 = 131;
            n15 -= 81;
            long l22 = l10;
            int n16 = 1;
            n16 += 44;
            l10 = l22 ^ ((long)cArray[n12] << (n15 += -18) ^ l22) & -1L << (n16 -= 13);
            int n17 = 99;
            n17 ^= 0xFFFFFFE3;
            n17 ^= 0xFFFFFF90;
            int n18 = -18;
            n18 -= -4;
            long l23 = l12;
            int n19 = 208;
            n19 += -84;
            l12 = l23 ^ ((long)((int)l9 << n17 | (int)(l10 >>> (n18 ^= 0xFFFFFFD2))) ^ l23) & -1L >>> (n19 += -92);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n20 = 158;
            n20 += -86;
            l14 = l24 ^ (0L ^ l24) & -1L << (n20 -= 40);
            while (true) {
                int n21 = 57;
                n21 -= 34;
                if ((int)(l14 >>> (n21 -= -9)) >= (int)l12) break;
                int n22 = -106;
                n22 ^= 0x30;
                int n23 = 118;
                n23 -= 70;
                cArray2[(int)(l14 >>> (n22 -= -122))] = cArray[(int)l13 + (int)(l14 >>> (n23 += -16))];
                l14 += 0x100000000L;
            }
            int n24 = 209;
            n24 -= 82;
            int n25 = (int)(l15 >>> (n24 ^= 0x5F));
            l15 += 0x100000000L;
            ConfigManager.l[n25] = new String(cArray2);
            long l25 = l13;
            int n26 = -140;
            n26 -= -117;
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n26 += 55);
        }
        INSTANCE = new ConfigManager();
        int n27 = 69;
        n27 ^= 0x53;
        g = new Regex((String)l[n27 ^= 0x3D]);
        G = new GsonBuilder().setPrettyPrinting().create();
        int n28 = 107;
        n28 ^= 0xFFFFFF9B;
        n28 += 25;
        int n29 = 34;
        n29 -= 17;
        String[] stringArray = new String[n29 -= 15];
        int n30 = 0;
        n30 ^= 0xFFFFFFF8;
        int n31 = -97;
        n31 ^= 0xFFFFFFAB;
        stringArray[n30 += 8] = (String)l[n31 -= -9];
        int n32 = -252;
        n32 += 124;
        int n33 = -45;
        n33 -= 55;
        stringArray[n32 ^= 0xFFFFFF81] = (String)l[n33 += 120];
        Path path = Paths.get(System.getProperty((String)l[n28]), stringArray);
        int n34 = -71;
        n34 -= -20;
        Intrinsics.checkNotNullExpressionValue(path, (String)l[n34 -= -101]);
        h = path;
        int n35 = -39;
        n35 += -39;
        n35 ^= 0xFFFFFFF4;
        int n36 = -35;
        n36 ^= 0x24;
        stringArray = new String[n36 ^= 0xFFFFFFFB];
        int n37 = 7;
        n37 -= -102;
        int n38 = -179;
        n38 -= -61;
        stringArray[n37 ^= 0x6D] = (String)l[n38 ^= 0xFFFFFFA2];
        int n39 = 104;
        n39 += -58;
        int n40 = -120;
        n40 ^= 0xFFFFFFDE;
        stringArray[n39 += -45] = (String)l[n40 += -10];
        Path path2 = Paths.get(System.getProperty((String)l[n35]), stringArray);
        int n41 = -44;
        n41 -= -58;
        Intrinsics.checkNotNullExpressionValue(path2, (String)l[n41 ^= 0x4F]);
        H = path2;
        int n42 = 22;
        n42 -= -99;
        int n43 = -49;
        n43 -= 53;
        Path path3 = h.resolve((String)l[n42 += -70] + (String)l[n43 ^= 0xFFFFFFD3]);
        int n44 = 195;
        n44 -= 120;
        Intrinsics.checkNotNullExpressionValue(path3, (String)l[n44 ^= 0x5E]);
        i = path3;
        j = CollectionsKt.emptyList();
        J = CollectionsKt.emptyList();
        int n45 = -113;
        n45 ^= 0x52;
        k = n45 += 36;
        INSTANCE.ensureConfigDirectory();
        INSTANCE.restoreMisplacedInternalFiles();
        INSTANCE.migrateLegacyConfigs();
        I = INSTANCE.readSelectedConfigName();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = M;
        if (M == null) {
            objectArray = M = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                L = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0xD1AB ^ 0xD1BB];
                byArray[0xBF9A ^ 0xBF9D] = 0xBFEA ^ 0xBF9D;
                byArray[0xADA5 ^ 0xADAA] = 0xFFFF523C ^ 0xADAA;
                byArray[0xA537 ^ 0xA53B] = 0xA54E ^ 0xA53B;
                byArray[0x9541 ^ 0x954B] = 0xFFFF6AD0 ^ 0x954B;
                byArray[0xBFAA ^ 0xBFA7] = 0xFFFF400B ^ 0xBFA7;
                byArray[0xE161 ^ 0xE163] = 0xE125 ^ 0xE163;
                byArray[0x3B6D ^ 0x3B63] = 0xFFFFC4BC ^ 0x3B63;
                byArray[0x80CD ^ 0x80CE] = 0xFFFF7F31 ^ 0x80CE;
                byArray[0xBA7A ^ 0xBA72] = 0xFFFF45EE ^ 0xBA72;
                byArray[0xFDC2 ^ 0xFDC4] = 0xFDB2 ^ 0xFDC4;
                byArray[0x946E ^ 0x946E] = 0x9425 ^ 0x946E;
                byArray[0x1F7E ^ 0x1F7F] = 0x1F2E ^ 0x1F7F;
                byArray[0x905A ^ 0x9053] = 0xFFFF6FD9 ^ 0x9053;
                byArray[0x5B33 ^ 0x5B37] = 0x5B1B ^ 0x5B37;
                byArray[0x886C ^ 0x8869] = 0x880B ^ 0x8869;
                byArray[0x3D11 ^ 0x3D1A] = 0x3D7B ^ 0x3D1A;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (m == null) {
                byte[] byArray2 = new byte[0x4EB0 ^ 0x4E90];
                byArray2[0x758F ^ 0x7585] = 0x75B8 ^ 0x7585;
                byArray2[0xA353 ^ 0xA349] = 0xA31C ^ 0xA349;
                byArray2[0x3EC3 ^ 0x3EC6] = 0x3E89 ^ 0x3EC6;
                byArray2[0x2758 ^ 0x275B] = 0xFFFFD8F8 ^ 0x275B;
                byArray2[0xB8E2 ^ 0xB8FD] = 0xFFFF477C ^ 0xB8FD;
                byArray2[0x48C9 ^ 0x48D1] = 0xFFFFB700 ^ 0x48D1;
                byArray2[0xCD7C ^ 0xCD7A] = 0xCD07 ^ 0xCD7A;
                byArray2[0x8BA5 ^ 0x8BB4] = 0x8BEC ^ 0x8BB4;
                byArray2[0x663B ^ 0x6625] = 0x663E ^ 0x6625;
                byArray2[0x10595 ^ 0x1059E] = 0xFFFEFA42 ^ 0x1059E;
                byArray2[0x109E2 ^ 0x109EC] = 0x109BD ^ 0x109EC;
                byArray2[0xDFE4 ^ 0xDFF4] = 0xFFFF207F ^ 0xDFF4;
                byArray2[0xE231 ^ 0xE227] = 0xFFFF1DEC ^ 0xE227;
                byArray2[0x36A8 ^ 0x36A7] = 0x36BB ^ 0x36A7;
                byArray2[0x7E18 ^ 0x7E0D] = 0xFFFF8186 ^ 0x7E0D;
                byArray2[0x88E8 ^ 0x88F5] = 0xFFFF7753 ^ 0x88F5;
                byArray2[0x2F42 ^ 0x2F5B] = 0x2F38 ^ 0x2F5B;
                byArray2[0x845B ^ 0x8459] = 0x8471 ^ 0x8459;
                byArray2[0x21BB ^ 0x21A8] = 0x21A5 ^ 0x21A8;
                byArray2[0x8E8B ^ 0x8E83] = 0xFFFF714A ^ 0x8E83;
                byArray2[0x3D6E ^ 0x3D67] = 0x3D11 ^ 0x3D67;
                byArray2[0x35C ^ 0x347] = 0xFFFFFCE2 ^ 0x347;
                byArray2[0xE371 ^ 0xE376] = 0xE314 ^ 0xE376;
                byArray2[0xD66A ^ 0xD678] = 0xD65F ^ 0xD678;
                byArray2[0x5798 ^ 0x578C] = 0xFFFFA82E ^ 0x578C;
                byArray2[0x3AC ^ 0x3A1] = 0x3AC ^ 0x3A1;
                byArray2[0x69EC ^ 0x69FB] = 0xFFFF9634 ^ 0x69FB;
                byArray2[0x36B0 ^ 0x36AC] = 0x36CE ^ 0x36AC;
                byArray2[0xF727 ^ 0xF72B] = 0xFFFF08B2 ^ 0xF72B;
                byArray2[0xE2CB ^ 0xE2CB] = 0xE2C3 ^ 0xE2CB;
                byArray2[0x175D ^ 0x1759] = 0xFFFFE8E4 ^ 0x1759;
                byArray2[0x7CF2 ^ 0x7CF3] = 0xFFFF830B ^ 0x7CF3;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = ConfigManager.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u3022\u3018\u3009\u302e\u3034\u2fa8\u301d\u2feb\u2ffe\u2fea\u300a\u2fe7\u3013\u3011\u3021\u300a\u3033\u2fc3".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 += 61314;
                        n3 -= 25938;
                        n3 += 2611;
                        n3 -= 47284;
                        n3 += 19445;
                        n3 ^= 0x53F6;
                        n3 ^= 0xB019;
                        n3 += 6121;
                        n3 ^= 0xE0C;
                        n3 += 21564;
                        n3 -= 28749;
                        cArray[i2] = (char)(n3 ^= 0xA65D);
                    }
                    object4 = ConfigManager.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[3] = 36;
                byArray4[8] = 79;
                byArray4[4] = 11;
                byArray4[10] = 92;
                byArray4[2] = -42;
                byArray4[15] = 14;
                byArray4[12] = -75;
                byArray4[13] = 36;
                byArray4[1] = 32;
                byArray4[6] = 118;
                byArray4[9] = -10;
                byArray4[5] = 75;
                byArray4[0] = 59;
                byArray4[14] = -76;
                byArray4[11] = 107;
                byArray4[7] = 2;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 25, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ConfigManager.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u8abd\u8ac1\u8acf".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 46160;
                        n4 -= 16178;
                        n4 -= 46770;
                        n4 += 51939;
                        n4 += 56838;
                        n4 += 47751;
                        n4 -= 24363;
                        n4 += 19195;
                        n4 -= 47500;
                        cArray[i3] = (char)(n4 -= 30204);
                    }
                    object5 = ConfigManager.A()[2] = new String(cArray);
                }
                m = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ConfigManager.A()[3];
            if (object6 == null) {
                char[] cArray = "\uac28\uac2c\uac36\uac12\uac26\uac29\uac26\uac12\uac3b\uac2e\uac26\uac36\uac5c\uac3b\ub7c8\ub7cf\ub7cf\ub7d0\ub7d5\ub7ca".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x7941;
                    n5 += 54215;
                    n5 -= 31591;
                    n5 -= 36041;
                    n5 += 17357;
                    n5 += 24367;
                    n5 -= 46224;
                    n5 ^= 0x3854;
                    n5 ^= 0xFB35;
                    n5 -= 14392;
                    n5 -= 15641;
                    n5 -= 38681;
                    n5 ^= 0x307D;
                    cArray[i4] = (char)(n5 ^= 0xF9F);
                }
                object6 = ConfigManager.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)m), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = n;
        if (n == null) {
            n = new Object[4];
            objectArray = n;
        }
        return objectArray;
    }

    public static void b() {
        N = new int[0x751B ^ 0x748B];
        ConfigManager.N[0xF4A6 ^ 0xF410] = 0xF477 ^ 0xF410;
        ConfigManager.N[0xCD2D ^ 0xCD46] = 0xCD45 ^ 0xCD46;
        ConfigManager.N[0x2F30 ^ 0x2F73] = 0x2F46 ^ 0x2F73;
        ConfigManager.N[0x79CC ^ 0x791F] = 0x795D ^ 0x791F;
        ConfigManager.N[0xBB05 ^ 0xBA20] = 0xFFFF45C0 ^ 0xBA20;
        ConfigManager.N[0x1018 ^ 0x105D] = 0xFFFFEFD2 ^ 0x105D;
        ConfigManager.N[0xC83D ^ 0xC8A0] = 0xFFFF377F ^ 0xC8A0;
        ConfigManager.N[0x7D64 ^ 0x7C7B] = 0x7C38 ^ 0x7C7B;
        ConfigManager.N[0xF08F ^ 0xF081] = 0xFFFF0F0B ^ 0xF081;
        ConfigManager.N[0x4ECB ^ 0x4ECE] = 0xFFFFB11D ^ 0x4ECE;
        ConfigManager.N[0xCDA4 ^ 0xCCD5] = 0xFFFF3323 ^ 0xCCD5;
        ConfigManager.N[0xF2C2 ^ 0xF2F0] = 0xFFFF0D17 ^ 0xF2F0;
        ConfigManager.N[0x9BB3 ^ 0x9BDB] = 0x9B90 ^ 0x9BDB;
        ConfigManager.N[0x73AD ^ 0x73FC] = 0x73C6 ^ 0x73FC;
        ConfigManager.N[0xED0A ^ 0xEDF2] = 0xFFFF1262 ^ 0xEDF2;
        ConfigManager.N[0xE2EB ^ 0xE383] = 0xFFFF1C47 ^ 0xE383;
        ConfigManager.N[0xF211 ^ 0xF336] = 0xF304 ^ 0xF336;
        ConfigManager.N[0xF5DC ^ 0xF563] = 0xF53C ^ 0xF563;
        ConfigManager.N[0xFD4B ^ 0xFC66] = 0xFC3E ^ 0xFC66;
        ConfigManager.N[0x113A ^ 0x1008] = 0x10A9 ^ 0x1008;
        ConfigManager.N[0x497A ^ 0x4879] = 0xFFFFB7A7 ^ 0x4879;
        ConfigManager.N[0xA54D ^ 0xA51B] = 0xA57F ^ 0xA51B;
        ConfigManager.N[0x4E9 ^ 0x5B4] = 0x58D ^ 0x5B4;
        ConfigManager.N[0xBA6D ^ 0xBA5A] = 0xFFFF45DC ^ 0xBA5A;
        ConfigManager.N[0xBD30 ^ 0xBD2B] = 0xFFFF423D ^ 0xBD2B;
        ConfigManager.N[0x3B85 ^ 0x3BE4] = 0x3BC7 ^ 0x3BE4;
        ConfigManager.N[0x6794 ^ 0x669B] = 0x66EA ^ 0x669B;
        ConfigManager.N[0x9763 ^ 0x97B7] = 0x97AC ^ 0x97B7;
        ConfigManager.N[0xA427 ^ 0xA4EF] = 0xFFFF5B4D ^ 0xA4EF;
        ConfigManager.N[0xE491 ^ 0xE5CE] = 0xFFFF1A1D ^ 0xE5CE;
        ConfigManager.N[0x6E77 ^ 0x6F76] = 0x6F29 ^ 0x6F76;
        ConfigManager.N[0xFA77 ^ 0xFB1D] = 0xFB26 ^ 0xFB1D;
        ConfigManager.N[0x26D5 ^ 0x27D2] = 0x278D ^ 0x27D2;
        ConfigManager.N[0x3A20 ^ 0x3B0C] = 0x3B1A ^ 0x3B0C;
        ConfigManager.N[0x4D21 ^ 0x4C1C] = 0x4C03 ^ 0x4C1C;
        ConfigManager.N[0xFE54 ^ 0xFEB7] = 0xFE81 ^ 0xFEB7;
        ConfigManager.N[0x8345 ^ 0x82CE] = 0xFFFF7D1A ^ 0x82CE;
        ConfigManager.N[0x3E35 ^ 0x3F1B] = 0x3F54 ^ 0x3F1B;
        ConfigManager.N[0x4759 ^ 0x47CA] = 0xFFFFB843 ^ 0x47CA;
        ConfigManager.N[0xBBD0 ^ 0xBB4F] = 0xFFFF44FA ^ 0xBB4F;
        ConfigManager.N[0x5804 ^ 0x5960] = 0x597D ^ 0x5960;
        ConfigManager.N[0xAB9E ^ 0xAB36] = 0xFFFF54C4 ^ 0xAB36;
        ConfigManager.N[0xE190 ^ 0xE0FB] = 0xE0F6 ^ 0xE0FB;
        ConfigManager.N[0x1C68 ^ 0x1D42] = 0x1D12 ^ 0x1D42;
        ConfigManager.N[0xEE1B ^ 0xEE4F] = 0xEE2C ^ 0xEE4F;
        ConfigManager.N[0xDAB0 ^ 0xDBF5] = 0xFFFF240C ^ 0xDBF5;
        ConfigManager.N[0x5179 ^ 0x51B7] = 0xFFFFAE44 ^ 0x51B7;
        ConfigManager.N[0xE383 ^ 0xE296] = 0xFFFF1D03 ^ 0xE296;
        ConfigManager.N[0xE9B ^ 0xFF9] = 0xFFFFF067 ^ 0xFF9;
        ConfigManager.N[0x1312 ^ 0x1331] = 0x130E ^ 0x1331;
        ConfigManager.N[0x25E8 ^ 0x25F9] = 0xFFFFDA7B ^ 0x25F9;
        ConfigManager.N[0x89A5 ^ 0x88C6] = 0xFFFF775D ^ 0x88C6;
        ConfigManager.N[0x10197 ^ 0x1019D] = 0x101AD ^ 0x1019D;
        ConfigManager.N[0xB2EF ^ 0xB233] = 0xFFFF4D9E ^ 0xB233;
        ConfigManager.N[0x7FE1 ^ 0x7FA9] = 0xFFFF8020 ^ 0x7FA9;
        ConfigManager.N[0x289E ^ 0x28B7] = 0x288F ^ 0x28B7;
        ConfigManager.N[0x5992 ^ 0x58DE] = 0x58D4 ^ 0x58DE;
        ConfigManager.N[0x10D9F ^ 0x10DE0] = 0xFFFEF238 ^ 0x10DE0;
        ConfigManager.N[0xF2F ^ 0xE3E] = 0xE9D ^ 0xE3E;
        ConfigManager.N[0x104D8 ^ 0x104B4] = 0xFFFEFB34 ^ 0x104B4;
        ConfigManager.N[0xF592 ^ 0xF48C] = 0xFFFF0B61 ^ 0xF48C;
        ConfigManager.N[0x31F6 ^ 0x30A5] = 0x306A ^ 0x30A5;
        ConfigManager.N[0x103F8 ^ 0x103AB] = 0xFFFEFC49 ^ 0x103AB;
        ConfigManager.N[0x8E02 ^ 0x8ECB] = 0x8EF9 ^ 0x8ECB;
        ConfigManager.N[0xA09C ^ 0xA05C] = 0xA04D ^ 0xA05C;
        ConfigManager.N[0x912C ^ 0x9057] = 0x9049 ^ 0x9057;
        ConfigManager.N[0x10D87 ^ 0x10D11] = 0xFFFEF2EE ^ 0x10D11;
        ConfigManager.N[0x3067 ^ 0x30BE] = 0x30A6 ^ 0x30BE;
        ConfigManager.N[0xB658 ^ 0xB764] = 0xFFFF48AC ^ 0xB764;
        ConfigManager.N[0x5206 ^ 0x52CB] = 0x52C8 ^ 0x52CB;
        ConfigManager.N[0x7932 ^ 0x790B] = 0xFFFF8697 ^ 0x790B;
        ConfigManager.N[0x3981 ^ 0x39EB] = 0xFFFFC614 ^ 0x39EB;
        ConfigManager.N[0x8D07 ^ 0x8C39] = 0xFFFF73A9 ^ 0x8C39;
        ConfigManager.N[0x8A9A ^ 0x8AB2] = 0x8AEA ^ 0x8AB2;
        ConfigManager.N[0xA0A9 ^ 0xA129] = 0xA125 ^ 0xA129;
        ConfigManager.N[0x7A25 ^ 0x7A56] = 0xFFFF85B1 ^ 0x7A56;
        ConfigManager.N[0x4FA3 ^ 0x4E9B] = 0x4E9B ^ 0x4E9B;
        ConfigManager.N[0xEE93 ^ 0xEEA0] = 0xFFFF114A ^ 0xEEA0;
        ConfigManager.N[0xA362 ^ 0xA22F] = 0xFFFF5D8C ^ 0xA22F;
        ConfigManager.N[0x765A ^ 0x7666] = 0xFFFF891A ^ 0x7666;
        ConfigManager.N[0x2215 ^ 0x22C5] = 0xFFFFDD2B ^ 0x22C5;
        ConfigManager.N[0xAAA5 ^ 0xAAE1] = 0xFFFF5555 ^ 0xAAE1;
        ConfigManager.N[0x25D1 ^ 0x250E] = 0x253E ^ 0x250E;
        ConfigManager.N[0xAED ^ 0xBB7] = 0xBCB ^ 0xBB7;
        ConfigManager.N[0xC622 ^ 0xC63F] = 0xFFFF39B8 ^ 0xC63F;
        ConfigManager.N[0x640F ^ 0x655A] = 0x6529 ^ 0x655A;
        ConfigManager.N[0x367E ^ 0x3676] = 0x3649 ^ 0x3676;
        ConfigManager.N[0x701E ^ 0x70A4] = 0x70BA ^ 0x70A4;
        ConfigManager.N[0x51FF ^ 0x511B] = 0xFFFFAEF7 ^ 0x511B;
        ConfigManager.N[0xA394 ^ 0xA292] = 0xFFFF5D49 ^ 0xA292;
        ConfigManager.N[0x7448 ^ 0x74ED] = 0x74A4 ^ 0x74ED;
        ConfigManager.N[0xEF0C ^ 0xEF89] = 0xEF98 ^ 0xEF89;
        ConfigManager.N[0xEFDF ^ 0xEE59] = 0xEE17 ^ 0xEE59;
        ConfigManager.N[0xB955 ^ 0xB958] = 0xB94C ^ 0xB958;
        ConfigManager.N[0x95CC ^ 0x948D] = 0x9436 ^ 0x948D;
        ConfigManager.N[0xCF66 ^ 0xCFAC] = 0xCFA6 ^ 0xCFAC;
        ConfigManager.N[0xCE01 ^ 0xCEC0] = 0xFFFF3147 ^ 0xCEC0;
        ConfigManager.N[0xBA16 ^ 0xBA84] = 0xFFFF4543 ^ 0xBA84;
        ConfigManager.N[0x12CF ^ 0x12E2] = 0x128F ^ 0x12E2;
        ConfigManager.N[0xF153 ^ 0xF195] = 0xF190 ^ 0xF195;
        ConfigManager.N[0xCCF4 ^ 0xCC38] = 0xFFFF33C8 ^ 0xCC38;
        ConfigManager.N[0x12CD ^ 0x1382] = 0x13AE ^ 0x1382;
        ConfigManager.N[0xD576 ^ 0xD41F] = 0xD448 ^ 0xD41F;
        ConfigManager.N[0x1ACD ^ 0x1BA1] = 0xFFFFE47D ^ 0x1BA1;
        ConfigManager.N[0x4214 ^ 0x4340] = 0xFFFFBCCE ^ 0x4340;
        ConfigManager.N[0xDFFB ^ 0xDF1D] = 0xFFFF20B5 ^ 0xDF1D;
        ConfigManager.N[0x4C13 ^ 0x4CC6] = 0xFFFFB34A ^ 0x4CC6;
        ConfigManager.N[0xAA74 ^ 0xAA4B] = 0xFFFF55CD ^ 0xAA4B;
        ConfigManager.N[0x320F ^ 0x32BE] = 0x32B1 ^ 0x32BE;
        ConfigManager.N[0xC242 ^ 0xC294] = 0xC2F5 ^ 0xC294;
        ConfigManager.N[0x3A01 ^ 0x3A8C] = 0xFFFFC544 ^ 0x3A8C;
        ConfigManager.N[0xDB65 ^ 0xDBBB] = 0xDB09 ^ 0xDBBB;
        ConfigManager.N[0x3D30 ^ 0x3C61] = 0x3C05 ^ 0x3C61;
        ConfigManager.N[0x46 ^ 0x13B] = 0x184 ^ 0x13B;
        ConfigManager.N[0x6FC9 ^ 0x6EB7] = 0xFFFF913E ^ 0x6EB7;
        ConfigManager.N[0x207E ^ 0x20DF] = 0xFFFFDF66 ^ 0x20DF;
        ConfigManager.N[0xACF3 ^ 0xAC9A] = 0xAC9B ^ 0xAC9A;
        ConfigManager.N[0x262D ^ 0x26EE] = 0x26CD ^ 0x26EE;
        ConfigManager.N[0x10163 ^ 0x10184] = 0x101D4 ^ 0x10184;
        ConfigManager.N[0x10553 ^ 0x10506] = 0xFFFEFADB ^ 0x10506;
        ConfigManager.N[0x1E0A ^ 0x1F5D] = 0xFFFFE0A2 ^ 0x1F5D;
        ConfigManager.N[0xBC9A ^ 0xBDD3] = 0xFFFF425E ^ 0xBDD3;
        ConfigManager.N[0x3404 ^ 0x3420] = 0xFFFFCB84 ^ 0x3420;
        ConfigManager.N[0x10A14 ^ 0x10A54] = 0x10A0F ^ 0x10A54;
        ConfigManager.N[0xCE1F ^ 0xCE84] = 0xCE9B ^ 0xCE84;
        ConfigManager.N[0xA160 ^ 0xA193] = 0xA10F ^ 0xA193;
        ConfigManager.N[0x6977 ^ 0x6827] = 0x68FA ^ 0x6827;
        ConfigManager.N[0x9B5 ^ 0x907] = 0x964 ^ 0x907;
        ConfigManager.N[0x1996 ^ 0x19F3] = 0xFFFFE661 ^ 0x19F3;
        ConfigManager.N[0x1E5E ^ 0x1EF9] = 0x1E85 ^ 0x1EF9;
        ConfigManager.N[0xE156 ^ 0xE167] = 0xE17F ^ 0xE167;
        ConfigManager.N[0x6150 ^ 0x6126] = 0x6146 ^ 0x6126;
        ConfigManager.N[0x10D34 ^ 0x10C0E] = 0x10C7A ^ 0x10C0E;
        ConfigManager.N[0x9CF ^ 0x939] = 0xFFFFF6AE ^ 0x939;
        ConfigManager.N[0xEC75 ^ 0xEC55] = 0xFFFF13FD ^ 0xEC55;
        ConfigManager.N[0x5574 ^ 0x550E] = 0x5503 ^ 0x550E;
        ConfigManager.N[0x77 ^ 0x49] = 0xFFFFFFDC ^ 0x49;
        ConfigManager.N[0x8659 ^ 0x86B0] = 0x869B ^ 0x86B0;
        ConfigManager.N[0x30D5 ^ 0x3060] = 0xFFFFCFDB ^ 0x3060;
        ConfigManager.N[0x9181 ^ 0x90CF] = 0x90A6 ^ 0x90CF;
        ConfigManager.N[0x13F9 ^ 0x12D8] = 0x12DE ^ 0x12D8;
        ConfigManager.N[0x8374 ^ 0x8377] = 0x8334 ^ 0x8377;
        ConfigManager.N[0x865E ^ 0x8731] = 0xFFFF78F3 ^ 0x8731;
        ConfigManager.N[0x55A3 ^ 0x5581] = 0xFFFFAA6C ^ 0x5581;
        ConfigManager.N[0xFFBB ^ 0xFEC3] = 0xFFFF0118 ^ 0xFEC3;
        ConfigManager.N[0x28A ^ 0x3B3] = 0xFFFFFC3E ^ 0x3B3;
        ConfigManager.N[0x5F6E ^ 0x5FE9] = 0x5F93 ^ 0x5FE9;
        ConfigManager.N[0xA676 ^ 0xA6FD] = 0xA6FD ^ 0xA6FD;
        ConfigManager.N[0x86B1 ^ 0x873F] = 0xFFFF788B ^ 0x873F;
        ConfigManager.N[0x91D8 ^ 0x9081] = 0x90E0 ^ 0x9081;
        ConfigManager.N[0x10DC7 ^ 0x10DD2] = 0x10D8D ^ 0x10DD2;
        ConfigManager.N[0xCA76 ^ 0xCB35] = 0xCB5E ^ 0xCB35;
        ConfigManager.N[0xDCD7 ^ 0xDC69] = 0xFFFF23E3 ^ 0xDC69;
        ConfigManager.N[0xF554 ^ 0xF56E] = 0xFFFF0A82 ^ 0xF56E;
        ConfigManager.N[0x348F ^ 0x35FA] = 0xFFFFCA68 ^ 0x35FA;
        ConfigManager.N[0x961A ^ 0x967D] = 0xFFFF6991 ^ 0x967D;
        ConfigManager.N[0x7B41 ^ 0x7A44] = 0x7AE0 ^ 0x7A44;
        ConfigManager.N[0x6D8B ^ 0x6D04] = 0xFFFF92CE ^ 0x6D04;
        ConfigManager.N[0x2EC2 ^ 0x2ECD] = 0xFFFFD124 ^ 0x2ECD;
        ConfigManager.N[0x8325 ^ 0x8203] = 0x8277 ^ 0x8203;
        ConfigManager.N[0x1720 ^ 0x163D] = 0xFFFFE9B1 ^ 0x163D;
        ConfigManager.N[0xDF1C ^ 0xDE9E] = 0xDE81 ^ 0xDE9E;
        ConfigManager.N[0xB3DA ^ 0xB29A] = 0xFFFF4D12 ^ 0xB29A;
        ConfigManager.N[0x6C4B ^ 0x6DC6] = 0x6DC6 ^ 0x6DC6;
        ConfigManager.N[0xDBE2 ^ 0xDAEF] = 0xDAF8 ^ 0xDAEF;
        ConfigManager.N[0xE2A5 ^ 0xE2D5] = 0xE2FB ^ 0xE2D5;
        ConfigManager.N[0x95A7 ^ 0x952D] = 0x9543 ^ 0x952D;
        ConfigManager.N[0xC27F ^ 0xC28B] = 0xC2CB ^ 0xC28B;
        ConfigManager.N[0x1099 ^ 0x108B] = 0xFFFFEF65 ^ 0x108B;
        ConfigManager.N[0x42A7 ^ 0x4292] = 0x4288 ^ 0x4292;
        ConfigManager.N[0x917D ^ 0x91D7] = 0xFFFF6E15 ^ 0x91D7;
        ConfigManager.N[0xE490 ^ 0xE499] = 0xE43B ^ 0xE499;
        ConfigManager.N[0xA9AE ^ 0xA8DA] = 0xA851 ^ 0xA8DA;
        ConfigManager.N[0xCF12 ^ 0xCE18] = 0xCE10 ^ 0xCE18;
        ConfigManager.N[0xD0FF ^ 0xD18F] = 0xFFFF2E6E ^ 0xD18F;
        ConfigManager.N[0x6DF9 ^ 0x6DC4] = 0x6DFD ^ 0x6DC4;
        ConfigManager.N[0x7CE0 ^ 0x7DB8] = 0x7DF0 ^ 0x7DB8;
        ConfigManager.N[0xD5A3 ^ 0xD5FB] = 0xD5FA ^ 0xD5FB;
        ConfigManager.N[0x10C0B ^ 0x10C56] = 0x10C10 ^ 0x10C56;
        ConfigManager.N[0xD83 ^ 0xCE6] = 0xC7A ^ 0xCE6;
        ConfigManager.N[0x880C ^ 0x893A] = 0xFFFF76BC ^ 0x893A;
        ConfigManager.N[0xF29E ^ 0xF29A] = 0xF29C ^ 0xF29A;
        ConfigManager.N[0xCDC9 ^ 0xCC95] = 0xFFFF336B ^ 0xCC95;
        ConfigManager.N[0xFC19 ^ 0xFD91] = 0xFFFF0232 ^ 0xFD91;
        ConfigManager.N[0x86EC ^ 0x86D4] = 0xFFFF7925 ^ 0x86D4;
        ConfigManager.N[0x196E ^ 0x1859] = 0x1827 ^ 0x1859;
        ConfigManager.N[0x16D ^ 0xA] = 0xFFFFFFBB ^ 0xA;
        ConfigManager.N[0xCDDC ^ 0xCDB2] = 0xFFFF3204 ^ 0xCDB2;
        ConfigManager.N[0x27D0 ^ 0x273D] = 0xFFFFD890 ^ 0x273D;
        ConfigManager.N[0x626F ^ 0x63E5] = 0xFFFF9C53 ^ 0x63E5;
        ConfigManager.N[0xE1D1 ^ 0xE0FE] = 0xFFFF1F3A ^ 0xE0FE;
        ConfigManager.N[0x701A ^ 0x705D] = 0xFFFF8FEF ^ 0x705D;
        ConfigManager.N[0xD5B5 ^ 0xD540] = 0xD51C ^ 0xD540;
        ConfigManager.N[0x2ED2 ^ 0x2FED] = 0x2FDF ^ 0x2FED;
        ConfigManager.N[0x2479 ^ 0x255A] = 0x257B ^ 0x255A;
        ConfigManager.N[0x9D5A ^ 0x9CD9] = 0xFFFF637A ^ 0x9CD9;
        ConfigManager.N[0xE778 ^ 0xE7B7] = 0xE7ED ^ 0xE7B7;
        ConfigManager.N[0xFE5 ^ 0xF34] = 0xFFFFF083 ^ 0xF34;
        ConfigManager.N[0x7057 ^ 0x70A6] = 0x7086 ^ 0x70A6;
        ConfigManager.N[0x2ACA ^ 0x2A5A] = 0x2AD0 ^ 0x2A5A;
        ConfigManager.N[0x399E ^ 0x38ED] = 0x38F8 ^ 0x38ED;
        ConfigManager.N[0x5AEE ^ 0x5A8E] = 0x5AA1 ^ 0x5A8E;
        ConfigManager.N[0xC354 ^ 0xC27D] = 0xFFFF3DE7 ^ 0xC27D;
        ConfigManager.N[0x467F ^ 0x46F9] = 0xFFFFB92D ^ 0x46F9;
        ConfigManager.N[0x6F53 ^ 0x6ED2] = 0xFFFF912E ^ 0x6ED2;
        ConfigManager.N[0xC84 ^ 0xCFC] = 0xCA4 ^ 0xCFC;
        ConfigManager.N[0x83F4 ^ 0x8370] = 0xFFFF7CB5 ^ 0x8370;
        ConfigManager.N[0xBB45 ^ 0xBB17] = 0xFFFF44E3 ^ 0xBB17;
        ConfigManager.N[0xCFA5 ^ 0xCEB6] = 0xCEAD ^ 0xCEB6;
        ConfigManager.N[0xBFA9 ^ 0xBEF2] = 0xBECF ^ 0xBEF2;
        ConfigManager.N[0x7C06 ^ 0x7CEE] = 0x7CEB ^ 0x7CEE;
        ConfigManager.N[0x923A ^ 0x935C] = 0x9371 ^ 0x935C;
        ConfigManager.N[0x42E1 ^ 0x422A] = 0x4211 ^ 0x422A;
        ConfigManager.N[0xEDC2 ^ 0xECDE] = 0xECE1 ^ 0xECDE;
        ConfigManager.N[0x6C84 ^ 0x6CAE] = 0x6CA4 ^ 0x6CAE;
        ConfigManager.N[0xF80B ^ 0xF8A4] = 0xFFFF075A ^ 0xF8A4;
        ConfigManager.N[0x7FF7 ^ 0x7FF5] = 0xFFFF8072 ^ 0x7FF5;
        ConfigManager.N[0xAD78 ^ 0xAC2E] = 0xAC47 ^ 0xAC2E;
        ConfigManager.N[0x3BA3 ^ 0x3B14] = 0xFFFFC4E7 ^ 0x3B14;
        ConfigManager.N[0x80AD ^ 0x80CB] = 0x8094 ^ 0x80CB;
        ConfigManager.N[0x9C74 ^ 0x9D4F] = 0x9D56 ^ 0x9D4F;
        ConfigManager.N[0xE5E0 ^ 0xE583] = 0xFFFF1A20 ^ 0xE583;
        ConfigManager.N[0xBE3B ^ 0xBE83] = 0xFFFF413E ^ 0xBE83;
        ConfigManager.N[0x3DB4 ^ 0x3D6F] = 0xFFFFC2E7 ^ 0x3D6F;
        ConfigManager.N[0x394C ^ 0x394A] = 0xFFFFC6F9 ^ 0x394A;
        ConfigManager.N[0xE362 ^ 0xE32B] = 0xFFFF1CCC ^ 0xE32B;
        ConfigManager.N[0x6C27 ^ 0x6D3D] = 0x6D06 ^ 0x6D3D;
        ConfigManager.N[0x7AD8 ^ 0x7B9F] = 0xFFFF8403 ^ 0x7B9F;
        ConfigManager.N[0x7E69 ^ 0x7E77] = 0x7ECA ^ 0x7E77;
        ConfigManager.N[0x3E7 ^ 0x31A] = 0xFFFFFC85 ^ 0x31A;
        ConfigManager.N[0xAC02 ^ 0xAC2E] = 0xFFFF53CC ^ 0xAC2E;
        ConfigManager.N[0x4873 ^ 0x482F] = 0x4842 ^ 0x482F;
        ConfigManager.N[0xB9D5 ^ 0xB9FB] = 0xFFFF4662 ^ 0xB9FB;
        ConfigManager.N[0x975A ^ 0x9761] = 0xFFFF68C9 ^ 0x9761;
        ConfigManager.N[0x5CFC ^ 0x5C24] = 0xFFFFA3FB ^ 0x5C24;
        ConfigManager.N[0xAF7 ^ 0xBBC] = 0xFFFFF446 ^ 0xBBC;
        ConfigManager.N[0x8AE6 ^ 0x8B90] = 0x8BAD ^ 0x8B90;
        ConfigManager.N[0xEE8C ^ 0xEE3F] = 0xEE73 ^ 0xEE3F;
        ConfigManager.N[0xBE0E ^ 0xBE6A] = 0xBE58 ^ 0xBE6A;
        ConfigManager.N[0x2A0B ^ 0x2AE5] = 0xFFFFD55A ^ 0x2AE5;
        ConfigManager.N[0x1245 ^ 0x13C9] = 0xFFFFEC6F ^ 0x13C9;
        ConfigManager.N[0x1678 ^ 0x163E] = 0x163C ^ 0x163E;
        ConfigManager.N[0x628E ^ 0x622E] = 0xFFFF9DD2 ^ 0x622E;
        ConfigManager.N[0x6586 ^ 0x648D] = 0x64BC ^ 0x648D;
        ConfigManager.N[0x5738 ^ 0x5666] = 0x565C ^ 0x5666;
        ConfigManager.N[0xE20C ^ 0xE207] = 0xE255 ^ 0xE207;
        ConfigManager.N[0xBF00 ^ 0xBF5B] = 0xFFFF40E7 ^ 0xBF5B;
        ConfigManager.N[0x188B ^ 0x1829] = 0xFFFFE7CC ^ 0x1829;
        ConfigManager.N[0x104DE ^ 0x104CD] = 0xFFFEFB57 ^ 0x104CD;
        ConfigManager.N[0x5D3B ^ 0x5D95] = 0xFFFFA26C ^ 0x5D95;
        ConfigManager.N[0x4681 ^ 0x46AE] = 0x46F3 ^ 0x46AE;
        ConfigManager.N[0x104D7 ^ 0x10437] = 0x10455 ^ 0x10437;
        ConfigManager.N[0x68B6 ^ 0x68D4] = 0xFFFF973F ^ 0x68D4;
        ConfigManager.N[0x3CE8 ^ 0x3D97] = 0x3DDF ^ 0x3D97;
        ConfigManager.N[0x5404 ^ 0x54E8] = 0x54E6 ^ 0x54E8;
        ConfigManager.N[0x659C ^ 0x65D1] = 0xFFFF9A52 ^ 0x65D1;
        ConfigManager.N[0x23C4 ^ 0x23B8] = 0x239B ^ 0x23B8;
        ConfigManager.N[0x4DDC ^ 0x4CAB] = 0x4CC2 ^ 0x4CAB;
        ConfigManager.N[0xC513 ^ 0xC56A] = 0xC52F ^ 0xC56A;
        ConfigManager.N[0x4550 ^ 0x4418] = 0x4409 ^ 0x4418;
        ConfigManager.N[0x10CE ^ 0x11E5] = 0x11D3 ^ 0x11E5;
        ConfigManager.N[0xD4F2 ^ 0xD4E8] = 0xFFFF2B1A ^ 0xD4E8;
        ConfigManager.N[0x312D ^ 0x31FF] = 0x31D8 ^ 0x31FF;
        ConfigManager.N[0xC1AF ^ 0xC0BD] = 0xFFFF3F25 ^ 0xC0BD;
        ConfigManager.N[0x2C72 ^ 0x2C89] = 0xFFFFD379 ^ 0x2C89;
        ConfigManager.N[0xBE0E ^ 0xBECB] = 0xFFFF4120 ^ 0xBECB;
        ConfigManager.N[0x871 ^ 0x8F0] = 0xFFFFF73A ^ 0x8F0;
        ConfigManager.N[0xCA0C ^ 0xCAEE] = 0xFFFF3542 ^ 0xCAEE;
        ConfigManager.N[0xCEAA ^ 0xCE23] = 0xCE4A ^ 0xCE23;
        ConfigManager.N[0x66A9 ^ 0x672C] = 0x6771 ^ 0x672C;
        ConfigManager.N[0x2F64 ^ 0x2F16] = 0x2F4E ^ 0x2F16;
        ConfigManager.N[0xCE35 ^ 0xCEF1] = 0xFFFF313C ^ 0xCEF1;
        ConfigManager.N[0x6D8A ^ 0x6CF8] = 0x6CCC ^ 0x6CF8;
        ConfigManager.N[0x10ABE ^ 0x10AE9] = 0xFFFEF575 ^ 0x10AE9;
        ConfigManager.N[0xB889 ^ 0xB9F3] = 0xFFFF4640 ^ 0xB9F3;
        ConfigManager.N[0x3480 ^ 0x3434] = 0x34F8 ^ 0x3434;
        ConfigManager.N[0xDB7B ^ 0xDA3F] = 0xFFFF25F0 ^ 0xDA3F;
        ConfigManager.N[0x10820 ^ 0x108CB] = 0xFFFEF735 ^ 0x108CB;
        ConfigManager.N[0x96B2 ^ 0x964C] = 0xFFFF6984 ^ 0x964C;
        ConfigManager.N[0xD1EE ^ 0xD111] = 0xFFFF2E59 ^ 0xD111;
        ConfigManager.N[0x587E ^ 0x580A] = 0x5815 ^ 0x580A;
        ConfigManager.N[0x1513 ^ 0x1473] = 0xFFFFEBEC ^ 0x1473;
        ConfigManager.N[0x8E47 ^ 0x8EE1] = 0xFFFF714C ^ 0x8EE1;
        ConfigManager.N[0x97CF ^ 0x9773] = 0x971B ^ 0x9773;
        ConfigManager.N[0xB6F0 ^ 0xB6B2] = 0xFFFF4932 ^ 0xB6B2;
        ConfigManager.N[0x299A ^ 0x29EF] = 0xFFFFD6D4 ^ 0x29EF;
        ConfigManager.N[0x213F ^ 0x212F] = 0xFFFFDE96 ^ 0x212F;
        ConfigManager.N[0x44B0 ^ 0x440B] = 0xFFFFBB91 ^ 0x440B;
        ConfigManager.N[0x7498 ^ 0x758E] = 0x7592 ^ 0x758E;
        ConfigManager.N[0x3372 ^ 0x3220] = 0x3246 ^ 0x3220;
        ConfigManager.N[0xF877 ^ 0xF90E] = 0xFFFF069C ^ 0xF90E;
        ConfigManager.N[0x1C5C ^ 0x1D48] = 0xFFFFE2D9 ^ 0x1D48;
        ConfigManager.N[0x195A ^ 0x19D4] = 0x19D6 ^ 0x19D4;
        ConfigManager.N[0x6C08 ^ 0x6C1C] = 0x6C69 ^ 0x6C1C;
        ConfigManager.N[0x9FD5 ^ 0x9F68] = 0xFFFF609D ^ 0x9F68;
        ConfigManager.N[0xDA11 ^ 0xDA3A] = 0xDA32 ^ 0xDA3A;
        ConfigManager.N[0xE429 ^ 0xE4B3] = 0xFFFF1B12 ^ 0xE4B3;
        ConfigManager.N[0x3E4E ^ 0x3ECE] = 0xFFFFC12E ^ 0x3ECE;
        ConfigManager.N[0x5ADE ^ 0x5AC6] = 0x5AE5 ^ 0x5AC6;
        ConfigManager.N[0x3664 ^ 0x36E7] = 0x368C ^ 0x36E7;
        ConfigManager.N[0xECA5 ^ 0xEC40] = 0xEC24 ^ 0xEC40;
        ConfigManager.N[0x5F79 ^ 0x5F27] = 0x5F24 ^ 0x5F27;
        ConfigManager.N[0x5B2E ^ 0x5B87] = 0xFFFFA413 ^ 0x5B87;
        ConfigManager.N[0x3B6 ^ 0x334] = 0xFFFFFC93 ^ 0x334;
        ConfigManager.N[0xB208 ^ 0xB242] = 0xB21C ^ 0xB242;
        ConfigManager.N[0xC7F ^ 0xC20] = 0xC03 ^ 0xC20;
        ConfigManager.N[0x1FAF ^ 0x1FC0] = 0x1FDE ^ 0x1FC0;
        ConfigManager.N[0xD56B ^ 0xD53B] = 0xFFFF2A8A ^ 0xD53B;
        ConfigManager.N[0x80B3 ^ 0x80FC] = 0x80D2 ^ 0x80FC;
        ConfigManager.N[0xA69E ^ 0xA699] = 0xFFFF596A ^ 0xA699;
        ConfigManager.N[0x8CB ^ 0x852] = 0xFFFFF7EC ^ 0x852;
        ConfigManager.N[0xD12C ^ 0xD1B9] = 0xD1AE ^ 0xD1B9;
        ConfigManager.N[0xEE63 ^ 0xEE9F] = 0xEEB6 ^ 0xEE9F;
        ConfigManager.N[0x999F ^ 0x98BF] = 0xFFFF6763 ^ 0x98BF;
        ConfigManager.N[0x1AA7 ^ 0x1AA6] = 0xFFFFE52B ^ 0x1AA6;
        ConfigManager.N[0x7D08 ^ 0x7C8C] = 0x7C8C ^ 0x7C8C;
        ConfigManager.N[0x6F45 ^ 0x6F34] = 0xFFFF90E4 ^ 0x6F34;
        ConfigManager.N[0xA082 ^ 0xA1A6] = 0xFFFF5E19 ^ 0xA1A6;
        ConfigManager.N[0x77CE ^ 0x76FE] = 0x76BC ^ 0x76FE;
        ConfigManager.N[0x1AA ^ 0x122] = 0xFFFFFE8F ^ 0x122;
        ConfigManager.N[0x604A ^ 0x60D2] = 0x60E7 ^ 0x60D2;
        ConfigManager.N[0x28B8 ^ 0x29A0] = 0xFFFFD60E ^ 0x29A0;
        ConfigManager.N[0x15ED ^ 0x14DE] = 0x148B ^ 0x14DE;
        ConfigManager.N[0xBD42 ^ 0xBDB5] = 0xBDFC ^ 0xBDB5;
        ConfigManager.N[0x8A52 ^ 0x8AF1] = 0xFFFF756B ^ 0x8AF1;
        ConfigManager.N[0x2C45 ^ 0x2DCA] = 0x2DA3 ^ 0x2DCA;
        ConfigManager.N[0xC9F ^ 0xC33] = 0xC49 ^ 0xC33;
        ConfigManager.N[0x5B0E ^ 0x5A87] = 0xFFFFA55E ^ 0x5A87;
        ConfigManager.N[0x22F9 ^ 0x223B] = 0xFFFFDDAD ^ 0x223B;
        ConfigManager.N[0x191D ^ 0x1938] = 0x1928 ^ 0x1938;
        ConfigManager.N[0x105F1 ^ 0x105AB] = 0x105CD ^ 0x105AB;
        ConfigManager.N[0x9942 ^ 0x994E] = 0x99C5 ^ 0x994E;
        ConfigManager.N[0x9FFF ^ 0x9F22] = 0xFFFF60F9 ^ 0x9F22;
        ConfigManager.N[0x2B47 ^ 0x2BCB] = 0x2BA5 ^ 0x2BCB;
        ConfigManager.N[0x8142 ^ 0x804E] = 0x8048 ^ 0x804E;
        ConfigManager.N[0x1601 ^ 0x16B1] = 0x1694 ^ 0x16B1;
        ConfigManager.N[0x8F87 ^ 0x8EE9] = 0x8ECA ^ 0x8EE9;
        ConfigManager.N[0x2A85 ^ 0x2A9A] = 0xFFFFD521 ^ 0x2A9A;
        ConfigManager.N[0xBBE ^ 0xB51] = 0xB40 ^ 0xB51;
        ConfigManager.N[0x1B18 ^ 0x1A18] = 0xFFFFE59F ^ 0x1A18;
        ConfigManager.N[0xA809 ^ 0xA98E] = 0xFFFF5609 ^ 0xA98E;
        ConfigManager.N[0x5252 ^ 0x520B] = 0xFFFFAD9E ^ 0x520B;
        ConfigManager.N[0x8043 ^ 0x8153] = 0x814A ^ 0x8153;
        ConfigManager.N[0x7543 ^ 0x75D2] = 0x75E3 ^ 0x75D2;
        ConfigManager.N[0x1E2B ^ 0x1F32] = 0x1F1C ^ 0x1F32;
        ConfigManager.N[0x28F0 ^ 0x288B] = 0xFFFFD738 ^ 0x288B;
        ConfigManager.N[0xF046 ^ 0xF0B6] = 0xF097 ^ 0xF0B6;
        ConfigManager.N[0xC16C ^ 0xC14B] = 0xC14B ^ 0xC14B;
        ConfigManager.N[0x8835 ^ 0x8958] = 0xFFFF76B0 ^ 0x8958;
        ConfigManager.N[0xD090 ^ 0xD0A4] = 0xFFFF2F59 ^ 0xD0A4;
        ConfigManager.N[0x9A9E ^ 0x9A82] = 0x9AF0 ^ 0x9A82;
        ConfigManager.N[0xCF70 ^ 0xCF82] = 0xCF99 ^ 0xCF82;
        ConfigManager.N[0x24AE ^ 0x2488] = 0x24E4 ^ 0x2488;
        ConfigManager.N[0x9E1C ^ 0x9E2C] = 0x9E2E ^ 0x9E2C;
        ConfigManager.N[0x9EC3 ^ 0x9EBE] = 0xFFFF610E ^ 0x9EBE;
        ConfigManager.N[0x1EBE ^ 0x1EF2] = 0xFFFFE15D ^ 0x1EF2;
        ConfigManager.N[0x808 ^ 0x8AC] = 0x8F3 ^ 0x8AC;
        ConfigManager.N[0xC5A2 ^ 0xC493] = 0xC48E ^ 0xC493;
        ConfigManager.N[0x7B2E ^ 0x7A26] = 0x7A4B ^ 0x7A26;
        ConfigManager.N[0x3811 ^ 0x38F0] = 0xFFFFC70A ^ 0x38F0;
        ConfigManager.N[0x516F ^ 0x5066] = 0x5023 ^ 0x5066;
        ConfigManager.N[0x6032 ^ 0x614E] = 0xFFFF9E9E ^ 0x614E;
        ConfigManager.N[0x63E0 ^ 0x637C] = 0x6350 ^ 0x637C;
        ConfigManager.N[0x533B ^ 0x532D] = 0x531B ^ 0x532D;
        ConfigManager.N[0xEF09 ^ 0xEFDE] = 0xFFFF1013 ^ 0xEFDE;
        ConfigManager.N[0xED1A ^ 0xEDA3] = 0xFFFF1233 ^ 0xEDA3;
        ConfigManager.N[0xC597 ^ 0xC4B5] = 0xC48B ^ 0xC4B5;
        ConfigManager.N[0xACF2 ^ 0xAC28] = 0xFFFF53ED ^ 0xAC28;
        ConfigManager.N[0x3931 ^ 0x39CB] = 0x39B1 ^ 0x39CB;
        ConfigManager.N[0xB80E ^ 0xB82F] = 0xB87E ^ 0xB82F;
        ConfigManager.N[0x6CF ^ 0x6B1] = 0x6D9 ^ 0x6B1;
        ConfigManager.N[0x5B8D ^ 0x5AB8] = 0xFFFFA5B1 ^ 0x5AB8;
        ConfigManager.N[0xCBA1 ^ 0xCB36] = 0xFFFF348B ^ 0xCB36;
        ConfigManager.N[0x7DB ^ 0x745] = 0xFFFFF8B7 ^ 0x745;
        ConfigManager.N[0x304C ^ 0x3164] = 0xFFFFCEA4 ^ 0x3164;
        ConfigManager.N[0xF4D6 ^ 0xF594] = 0xF5C3 ^ 0xF594;
        ConfigManager.N[0xF40 ^ 0xFED] = 0xF80 ^ 0xFED;
        ConfigManager.N[0xFFF8 ^ 0xFEFA] = 0xFEA2 ^ 0xFEFA;
        ConfigManager.N[0x8755 ^ 0x87AC] = 0xFFFF782C ^ 0x87AC;
        ConfigManager.N[0x719E ^ 0x7085] = 0x7099 ^ 0x7085;
        ConfigManager.N[0x10D0 ^ 0x10C9] = 0x10F9 ^ 0x10C9;
        ConfigManager.N[0x68F1 ^ 0x69FF] = 0x6987 ^ 0x69FF;
        ConfigManager.N[0xC94F ^ 0xC805] = 0xFFFF37BE ^ 0xC805;
        ConfigManager.N[0x5270 ^ 0x523E] = 0xFFFFADC1 ^ 0x523E;
        ConfigManager.N[0x43F ^ 0x47E] = 0x441 ^ 0x47E;
        ConfigManager.N[0x21B4 ^ 0x20F2] = 0x20ED ^ 0x20F2;
        ConfigManager.N[0x3E21 ^ 0x3F40] = 0xFFFFC0F4 ^ 0x3F40;
        ConfigManager.N[0xB32 ^ 0xBA6] = 0xFFFFF438 ^ 0xBA6;
        ConfigManager.N[0xACE4 ^ 0xACD2] = 0xFFFF5347 ^ 0xACD2;
        ConfigManager.N[0xFD74 ^ 0xFD9E] = 0xFD8E ^ 0xFD9E;
        ConfigManager.N[0xF5FF ^ 0xF538] = 0xFFFF0AA6 ^ 0xF538;
        ConfigManager.N[0xB7A7 ^ 0xB7EC] = 0xB702 ^ 0xB7EC;
        ConfigManager.N[0x35F3 ^ 0x35F3] = 0x35E9 ^ 0x35F3;
        ConfigManager.N[0x10872 ^ 0x10976] = 0x1092C ^ 0x10976;
        ConfigManager.N[0x7100 ^ 0x71AB] = 0x7186 ^ 0x71AB;
        ConfigManager.N[0x4D85 ^ 0x4C92] = 0xFFFFB372 ^ 0x4C92;
        ConfigManager.N[0xC07E ^ 0xC009] = 0xFFFF3FB2 ^ 0xC009;
        ConfigManager.N[0x688C ^ 0x689B] = 0x68B2 ^ 0x689B;
        ConfigManager.N[0x4F21 ^ 0x4F4C] = 0x4F78 ^ 0x4F4C;
        ConfigManager.N[0x93C9 ^ 0x92FD] = 0x9284 ^ 0x92FD;
    }
}

