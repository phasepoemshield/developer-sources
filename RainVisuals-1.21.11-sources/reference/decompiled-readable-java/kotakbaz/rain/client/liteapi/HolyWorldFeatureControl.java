/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking$Context
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.network.RegistryByteBuf
 *  net.minecraft.network.codec.PacketCodec
 *  net.minecraft.network.packet.CustomPayload
 *  net.minecraft.network.packet.CustomPayload$Id
 *  net.minecraft.util.Identifier
 */
package kotakbaz.rain.client.liteapi;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062e\u064b;
import oxxxde.\u0641;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001CB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u0003J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\b\u000f\u0010\tJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0003J\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\u0006\u0010\u001e\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u0011*\u00020\u0011H\u0002\u00a2\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0002\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b&\u0010\u0016R\u0014\u0010'\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020)8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00100\u001a\u00020\f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107R$\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u001108j\b\u0012\u0004\u0012\u00020\u0011`98\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u0010;R<\u0010>\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00180<j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0018`=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b@\u0010.R\u0016\u0010A\u001a\u00020)8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bA\u0010+R\u0016\u0010B\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bB\u00101\u00a8\u0006D"}, d2={"Loxxxde/\u062d\u0652;", "", "<init>", "()V", "", "Loxxxde/\u062f\u0650;", "modules", "", "load", "(Ljava/util/List;)V", "tick", "module", "", "isBlocked", "(Lkotakbaz/rain/module/Module;)Z", "bind", "request", "", "requestJson", "()Ljava/lang/String;", "json", "receive", "(Ljava/lang/String;)V", "reset", "", "features", "updateBlocklist", "(Ljava/util/Set;)V", "blockedModules", "(Ljava/util/Set;)Ljava/util/List;", "name", "featureAliases", "(Ljava/lang/String;)Ljava/util/Set;", "normalizeFeature", "(Ljava/lang/String;)Ljava/lang/String;", "toDebugList", "(Ljava/util/Set;)Ljava/lang/String;", "message", "debug", "CLIENT_ID", "Ljava/lang/String;", "", "MAX_JSON_LENGTH", "I", "", "REQUEST_DELAY_MS", "J", "MAX_REQUEST_ATTEMPTS", "DEBUG", "Z", "Lnet/minecraft/class_2960;", "channel", "Lnet/minecraft/class_2960;", "Lkotlin/text/Regex;", "camelSplitRegex", "Lkotlin/text/Regex;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "blockedFeatures", "Ljava/util/HashSet;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "moduleFeatures", "Ljava/util/LinkedHashMap;", "lastRequestAt", "requestAttempts", "waitingForResponse", "LiteApiPayload", "rain-visuals"})
public final class HolyWorldFeatureControl {
    @NotNull
    private static final HashSet<String> blockedFeatures;
    @NotNull
    private static final Identifier channel;
    private static int requestAttempts;
    @NotNull
    public static final HolyWorldFeatureControl INSTANCE;
    @NotNull
    private static final Regex camelSplitRegex;
    @NotNull
    private static final LinkedHashMap<Module, Set<String>> moduleFeatures;
    private static long lastRequestAt;
    private static final boolean DEBUG = false;
    private static final int MAX_REQUEST_ATTEMPTS = 3;
    private static final int MAX_JSON_LENGTH = Short.MAX_VALUE;
    @NotNull
    private static final String CLIENT_ID = "rain-visuals";
    private static final long REQUEST_DELAY_MS = 10000L;
    private static boolean waitingForResponse;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void receive(String json) {
        var2_2 = this;
        try {
            $this$receive_u24lambda_u240 = var2_2;
            $i$a$-runCatching-HolyWorldFeatureControl$receive$1 = false;
            root = JsonParser.parseString(json).getAsJsonObject();
            v0 = root.get("ok");
            if (!(v0 != null ? v0.getAsBoolean() : false)) {
                return;
            }
            var6_8 = root.getAsJsonObject("payload");
            if (var6_8 == null || (var7_9 = var6_8.getAsJsonArray("blocklist")) == null) ** GOTO lbl-1000
            $this$mapNotNull$iv = var7_9;
            $i$f$mapNotNull = false;
            var10_13 = $this$mapNotNull$iv;
            destination$iv$iv = new ArrayList<E>();
            $i$f$mapNotNullTo = false;
            $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
            $i$f$forEach = false;
            var15_18 = $this$forEach$iv$iv$iv.iterator();
            while (var15_18.hasNext()) {
                element$iv$iv = element$iv$iv$iv = var15_18.next();
                $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = false;
                it = (JsonElement)element$iv$iv;
                $i$a$-mapNotNull-HolyWorldFeatureControl$receive$1$blocklist$1 = false;
                var22_25 = var21_24 = it;
                var23_26 = false;
                v1 = var22_25.isJsonPrimitive() ? var21_24 : null;
                v2 = v1;
                if ((v1 != null && (v2 = v2.getAsString()) != null ? $this$receive_u24lambda_u240.normalizeFeature((String)v2) : null) == null) continue;
                var24_27 = var24_27;
                var25_28 = false;
                destination$iv$iv.add(var24_27);
            }
            var8_11 = CollectionsKt.toSet((List)var11_14);
            if (var8_11 != null) {
                v3 /* !! */  = var8_11;
            } else lbl-1000:
            // 2 sources

            {
                v3 /* !! */  = SetsKt.emptySet();
            }
            blocklist = v3 /* !! */ ;
            $this$receive_u24lambda_u240.updateBlocklist(blocklist);
            $this$receive_u24lambda_u240.debug("LiteAPI blocklist: " + $this$receive_u24lambda_u240.toDebugList(blocklist));
            v4 = $this$receive_u24lambda_u240;
            var6_8 = CollectionsKt.joinToString$default($this$receive_u24lambda_u240.blockedModules(blocklist), ", ", null, null, 0, null, null, 62, null);
            if (StringsKt.isBlank((CharSequence)var6_8)) {
                var27_30 = v4;
                var7_10 = false;
                v5 = "none";
                v4 = var27_30;
            } else {
                v5 = var6_8;
            }
            v4.debug("LiteAPI hidden modules: " + v5);
            HolyWorldFeatureControl.waitingForResponse = false;
            var3_3 = Result.constructor-impl(Unit.INSTANCE);
        }
        catch (Throwable var4_6) {
            var3_4 = Result.constructor-impl(ResultKt.createFailure(var4_6));
        }
    }

    public final void load(@NotNull List<? extends Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        this.bind(modules);
        PayloadTypeRegistry.playC2S().register(LiteApiPayload.Companion.getID(), LiteApiPayload.Companion.getCODEC());
        PayloadTypeRegistry.playS2C().register(LiteApiPayload.Companion.getID(), LiteApiPayload.Companion.getCODEC());
        ClientPlayNetworking.registerGlobalReceiver(LiteApiPayload.Companion.getID(), HolyWorldFeatureControl::load$lambda$0);
        ClientPlayConnectionEvents.JOIN.register(HolyWorldFeatureControl::load$lambda$1);
        ClientPlayConnectionEvents.DISCONNECT.register(HolyWorldFeatureControl::load$lambda$2);
    }

    private final void updateBlocklist(Set<String> features) {
        if (Intrinsics.areEqual(blockedFeatures, features)) {
            return;
        }
        blockedFeatures.clear();
        blockedFeatures.addAll((Collection<String>)features);
        \u062e\u064b.INSTANCE.syncAvailabilityStates();
    }

    private final void bind(List<? extends Module> modules) {
        Iterable $this$forEach$iv = modules;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Module module = (Module)element$iv;
            boolean bl = false;
            ((Map)moduleFeatures).put(module, INSTANCE.featureAliases(module.getName()));
            module.addVisibleInGuiCondition(() -> HolyWorldFeatureControl.bind$lambda$0$0(module));
            module.addAvailabilityCondition(() -> HolyWorldFeatureControl.bind$lambda$0$1(module));
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isBlocked(@NotNull Module module) {
        void var7_7;
        void $this$any$iv;
        Intrinsics.checkNotNullParameter(module, "module");
        Set<String> set = moduleFeatures.get(module);
        if (set == null) return false;
        Iterable iterable = set;
        HashSet<String> hashSet = blockedFeatures;
        boolean $i$f$any = false;
        if ($this$any$iv instanceof Collection) {
            if (((Collection)$this$any$iv).isEmpty()) {
                return false;
            }
        }
        Iterator iterator2 = $this$any$iv.iterator();
        do {
            if (!iterator2.hasNext()) return false;
            Object element$iv = iterator2.next();
            String p0 = (String)element$iv;
            boolean bl = false;
        } while (!hashSet.contains(var7_7));
        return true;
    }

    private static final boolean bind$lambda$0$0(Module $module) {
        return !INSTANCE.isBlocked($module);
    }

    private final String toDebugList(Set<String> $this$toDebugList) {
        CharSequence charSequence;
        CharSequence charSequence2 = CollectionsKt.joinToString$default(CollectionsKt.sorted((Iterable)$this$toDebugList), ", ", null, null, 0, null, null, 62, null);
        if (StringsKt.isBlank(charSequence2)) {
            boolean bl = false;
            charSequence = "empty";
        } else {
            charSequence = charSequence2;
        }
        return (String)charSequence;
    }

    static {
        INSTANCE = new HolyWorldFeatureControl();
        Identifier identifier = Identifier.of((String)"liteapi", (String)"feature-control");
        Intrinsics.checkNotNullExpressionValue(identifier, "fromNamespaceAndPath(...)");
        channel = identifier;
        camelSplitRegex = new Regex("(?<=[a-z0-9])([A-Z])");
        blockedFeatures = new HashSet();
        moduleFeatures = new LinkedHashMap();
    }

    private final Set<String> featureAliases(String name) {
        String compact = this.normalizeFeature(name);
        String[] stringArray = (String[])name;
        Regex regex = camelSplitRegex;
        String string = "-$1";
        String dashed = this.normalizeFeature(regex.replace((CharSequence)stringArray, string));
        stringArray = new String[2];
        stringArray[0] = compact;
        stringArray[1] = dashed;
        return SetsKt.setOf(stringArray);
    }

    private static final void load$lambda$0(LiteApiPayload payload, ClientPlayNetworking.Context context) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(context, "<unused var>");
        INSTANCE.receive(payload.getJson());
    }

    public final void tick() {
        if (waitingForResponse) {
            this.request();
        }
    }

    private static final void load$lambda$1(ClientPlayNetworkHandler clientPlayNetworkHandler, PacketSender packetSender, MinecraftClient minecraftClient) {
        Intrinsics.checkNotNullParameter(clientPlayNetworkHandler, "<unused var>");
        Intrinsics.checkNotNullParameter(packetSender, "<unused var>");
        Intrinsics.checkNotNullParameter(minecraftClient, "<unused var>");
        INSTANCE.request();
    }

    private HolyWorldFeatureControl() {
    }

    /*
     * WARNING - void declaration
     */
    private final String requestJson() {
        JsonObject payload = new JsonObject();
        payload.addProperty("client", CLIENT_ID);
        JsonArray jsonArray = new JsonArray();
        JsonElement jsonElement = jsonArray;
        String string = "features";
        JsonObject jsonObject = payload;
        boolean bl = false;
        Collection<Set<String>> collection = moduleFeatures.values();
        Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
        Iterable $this$forEach$iv = CollectionsKt.distinct(CollectionsKt.flatten((Iterable)collection));
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var9_13;
            void $this$requestJson_u24lambda_u240;
            String p0 = (String)element$iv;
            boolean bl2 = false;
            $this$requestJson_u24lambda_u240.add((String)var9_13);
        }
        Unit unit = Unit.INSTANCE;
        jsonObject.add(string, jsonArray);
        jsonElement = new JsonObject();
        JsonElement $this$requestJson_u24lambda_u241 = jsonElement;
        boolean bl3 = false;
        ((JsonObject)$this$requestJson_u24lambda_u241).addProperty("id", UUID.randomUUID().toString());
        ((JsonObject)$this$requestJson_u24lambda_u241).addProperty("method", "checkFeatures");
        ((JsonObject)$this$requestJson_u24lambda_u241).add("payload", payload);
        String string2 = jsonElement.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    private final void reset() {
        waitingForResponse = false;
        lastRequestAt = 0L;
        requestAttempts = 0;
        this.updateBlocklist(SetsKt.emptySet());
    }

    private final void debug(String message) {
    }

    private static final boolean bind$lambda$0$1(Module $module) {
        return !INSTANCE.isBlocked($module);
    }

    /*
     * WARNING - void declaration
     */
    private final List<String> blockedModules(Set<String> features) {
        void $this$mapTo$iv$iv;
        Map $this$filterValues$iv = moduleFeatures;
        boolean $i$f$filterValues = false;
        Object result$iv = new LinkedHashMap();
        Iterator iterator2 = $this$filterValues$iv.entrySet().iterator();
        while (iterator2.hasNext()) {
            boolean bl;
            Map.Entry entry$iv;
            block5: {
                entry$iv = iterator2.next();
                Set aliases = (Set)entry$iv.getValue();
                boolean bl2 = false;
                Iterable $this$any$iv = aliases;
                boolean $i$f$any = false;
                if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                    bl = false;
                } else {
                    for (Object element$iv : $this$any$iv) {
                        String p0 = (String)element$iv;
                        boolean bl3 = false;
                        if (!features.contains(p0)) continue;
                        bl = true;
                        break block5;
                    }
                    bl = false;
                }
            }
            if (!bl) continue;
            ((HashMap)result$iv).put(entry$iv.getKey(), entry$iv.getValue());
        }
        Iterable $this$map$iv = ((Map)result$iv).keySet();
        boolean $i$f$map = false;
        result$iv = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            Module module = (Module)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            collection.add(module.getName());
        }
        return (List)((Object)iterator2);
    }

    public static final /* synthetic */ Identifier access$getChannel$p() {
        return channel;
    }

    /*
     * WARNING - void declaration
     */
    private final String normalizeFeature(String $this$normalizeFeature) {
        void var5_5;
        void $this$filterTo$iv$iv;
        String string = $this$normalizeFeature;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String string2 = string.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
        String $this$filter$iv = string2;
        boolean $i$f$filter = false;
        CharSequence charSequence = $this$filter$iv;
        Appendable destination$iv$iv = new StringBuilder();
        boolean $i$f$filterTo = false;
        int index$iv$iv = 0;
        int n = $this$filterTo$iv$iv.length();
        while (index$iv$iv < n) {
            void var7_7;
            char element$iv$iv;
            char it = element$iv$iv = $this$filterTo$iv$iv.charAt(index$iv$iv);
            boolean bl = false;
            boolean bl2 = Character.isLetterOrDigit(it) || it == '-' || it == '_';
            if (bl2) {
                void var9_9;
                destination$iv$iv.append((char)var9_9);
            }
            ++var7_7;
        }
        return ((StringBuilder)var5_5).toString();
    }

    private final void request() {
        block5: {
            Object object;
            long now = System.currentTimeMillis();
            if (requestAttempts >= 3 || now - lastRequestAt < 10000L) {
                return;
            }
            if (!ClientPlayNetworking.canSend(LiteApiPayload.Companion.getID())) {
                waitingForResponse = false;
                this.debug("LiteAPI channel unavailable");
                return;
            }
            lastRequestAt = now;
            int n = requestAttempts;
            requestAttempts = n + 1;
            waitingForResponse = true;
            this.debug("LiteAPI request #" + requestAttempts + ": " + moduleFeatures.size() + " modules");
            Object object2 = this;
            try {
                HolyWorldFeatureControl $this$request_u24lambda_u240 = object2;
                boolean bl = false;
                ClientPlayNetworking.send((CustomPayload)new LiteApiPayload($this$request_u24lambda_u240.requestJson()));
                object = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable bl) {
                object = Result.constructor-impl(ResultKt.createFailure(bl));
            }
            object2 = object;
            Throwable throwable = Result.exceptionOrNull-impl(object2);
            if (throwable == null) break block5;
            Object it = object = throwable;
            boolean bl = false;
            waitingForResponse = false;
            String string = ((Throwable)it).getMessage();
            if (string == null) {
                string = it.getClass().getSimpleName();
            }
            INSTANCE.debug("LiteAPI request failed: " + string);
        }
    }

    private static final void load$lambda$2(ClientPlayNetworkHandler clientPlayNetworkHandler, MinecraftClient minecraftClient) {
        Intrinsics.checkNotNullParameter(clientPlayNetworkHandler, "<unused var>");
        Intrinsics.checkNotNullParameter(minecraftClient, "<unused var>");
        INSTANCE.reset();
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u0012H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0015\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\n\u00a8\u0006\u0019"}, d2={"Loxxxde/\u0627\u0634;", "Lnet/minecraft/class_8710;", "", "json", "<init>", "(Ljava/lang/String;)V", "Lnet/minecraft/class_8710$class_9154;", "type", "()Lnet/minecraft/class_8710$class_9154;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lkotakbaz/rain/client/liteapi/HolyWorldFeatureControl$LiteApiPayload;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getJson", "Companion", "rain-visuals"})
    private static final class LiteApiPayload
    implements CustomPayload {
        @NotNull
        public static final \u0641 Companion = new \u0641(null);
        @NotNull
        private static final CustomPayload.Id<LiteApiPayload> ID = new CustomPayload.Id(HolyWorldFeatureControl.access$getChannel$p());
        @NotNull
        private final String json;
        @NotNull
        private static final PacketCodec<RegistryByteBuf, LiteApiPayload> CODEC;

        public static final /* synthetic */ CustomPayload.Id access$getID$cp() {
            return ID;
        }

        public static final /* synthetic */ PacketCodec access$getCODEC$cp() {
            return CODEC;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LiteApiPayload)) {
                return false;
            }
            LiteApiPayload liteApiPayload = (LiteApiPayload)other;
            if (!Intrinsics.areEqual(this.json, liteApiPayload.json)) {
                return false;
            }
            return true;
        }

        private static final LiteApiPayload CODEC$lambda$1(RegistryByteBuf buffer) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            int readable = buffer.readableBytes();
            byte[] bytes = new byte[RangesKt.coerceAtMost(readable, Short.MAX_VALUE)];
            buffer.readBytes(bytes);
            if (readable > Short.MAX_VALUE) {
                buffer.skipBytes(readable - Short.MAX_VALUE);
            }
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "UTF_8");
            Charset charset2 = charset;
            return new LiteApiPayload(new String(bytes, charset2));
        }

        public static /* synthetic */ LiteApiPayload copy$default(LiteApiPayload liteApiPayload, String string, int n, Object object) {
            if ((n & 1) != 0) {
                string = liteApiPayload.json;
            }
            return liteApiPayload.copy(string);
        }

        @NotNull
        public CustomPayload.Id<? extends CustomPayload> getId() {
            return ID;
        }

        static {
            PacketCodec packetCodec = CustomPayload.codecOf(LiteApiPayload::CODEC$lambda$0, LiteApiPayload::CODEC$lambda$1);
            Intrinsics.checkNotNullExpressionValue(packetCodec, "codec(...)");
            CODEC = packetCodec;
        }

        @NotNull
        public final String component1() {
            return this.json;
        }

        public int hashCode() {
            return this.json.hashCode();
        }

        @NotNull
        public final LiteApiPayload copy(@NotNull String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new LiteApiPayload(json);
        }

        private static final void CODEC$lambda$0(LiteApiPayload payload, RegistryByteBuf buffer) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            String string = payload.json;
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "UTF_8");
            byte[] byArray = string.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
            buffer.writeBytes(byArray);
        }

        public LiteApiPayload(@NotNull String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            this.json = json;
        }

        @NotNull
        public String toString() {
            return "LiteApiPayload(json=" + this.json + ")";
        }

        @NotNull
        public final String getJson() {
            return this.json;
        }
    }
}

