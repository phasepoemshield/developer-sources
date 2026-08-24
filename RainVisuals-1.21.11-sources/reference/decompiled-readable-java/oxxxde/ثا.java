/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.state.SkyRenderState
 */
package oxxxde;

import java.util.Map;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ModeSetting;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.render.state.SkyRenderState;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0628\u0624;
import oxxxde.\u0638\u0646;
import oxxxde.\u0638\u0651;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2={"Loxxxde/\u062b\u0627;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Lnet/minecraft/class_12076;", "state", "", "renderSky", "(Lnet/minecraft/class_12076;)Z", "", "onDisable", "", "SHADER_SKY", "Ljava/lang/String;", "SHADER_CINEMATIC", "SHADER_NIGHTFALL", "SHADER_THEMED", "", "shaderNames", "Ljava/util/Map;", "Loxxxde/\u0638\u064a;", "shader", "Loxxxde/\u0638\u064a;", "rain-visuals"})
public final class \u062b\u0627
extends Module {
    @NotNull
    private static final String SHADER_THEMED = "themed";
    @NotNull
    private static final String SHADER_NIGHTFALL = "nightfall";
    @NotNull
    private static final ModeSetting shader;
    @NotNull
    private static final String SHADER_CINEMATIC = "cinematic";
    @NotNull
    private static final String SHADER_SKY = "sky";
    @NotNull
    public static final \u062b\u0627 INSTANCE;
    @NotNull
    private static final Map<String, String> shaderNames;

    private \u062b\u0627() {
        super("CustomSky", \u0638\u0646.getRENDER(), "\u041a\u0430\u0441\u0442\u043e\u043c\u043d\u044b\u0435 \u0448\u0435\u0439\u0434\u0435\u0440\u044b \u043d\u0430 \u043d\u0435\u0431\u043e");
    }

    public final boolean renderSky(@NotNull SkyRenderState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!this.isEnabled()) {
            return false;
        }
        boolean customFog = \u0628\u0624.INSTANCE.isEnabled();
        int fogColor = customFog ? \u0628\u0624.INSTANCE.resolvedFogColor().getRGB() : state.skyColor;
        float fogStrength = customFog ? ((Number)\u0628\u0624.INSTANCE.getFogDensity().getValue()).floatValue() / 100.0f : 0.0f;
        return \u0638\u0651.render((String)shader.getValue(), state, fogColor, fogStrength);
    }

    @Override
    public void onDisable() {
        \u0638\u0651.release();
    }

    private static final String _init_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String string = shaderNames.get(it);
        if (string == null) {
            string = it;
        }
        return string;
    }

    static {
        INSTANCE = new \u062b\u0627();
        Object[] objectArray = new Pair[4];
        objectArray[0] = TuplesKt.to(SHADER_SKY, "\u041d\u0435\u0431\u0435\u0441\u043d\u044b\u0439");
        objectArray[1] = TuplesKt.to(SHADER_CINEMATIC, "\u041a\u0438\u043d\u0435\u043c\u0430\u0442\u043e\u0433\u0440\u0430\u0444\u0438\u0447\u043d\u044b\u0439");
        objectArray[2] = TuplesKt.to(SHADER_NIGHTFALL, "\u0421\u0443\u043c\u0435\u0440\u0435\u0447\u043d\u044b\u0439");
        objectArray[3] = TuplesKt.to(SHADER_THEMED, "\u0422\u0435\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439");
        shaderNames = MapsKt.mapOf(objectArray);
        objectArray = new String[4];
        objectArray[0] = SHADER_SKY;
        objectArray[1] = SHADER_CINEMATIC;
        objectArray[2] = SHADER_NIGHTFALL;
        objectArray[3] = SHADER_THEMED;
        shader = Module.mode$default(INSTANCE, "\u0428\u0435\u0439\u0434\u0435\u0440", CollectionsKt.listOf(objectArray), 0, null, 12, null);
        shader.withDisplayNameProvider(\u062b\u0627::_init_$lambda$0);
    }
}

