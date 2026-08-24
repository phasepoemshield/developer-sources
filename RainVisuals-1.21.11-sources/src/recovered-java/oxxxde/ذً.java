/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.util.math.MathHelper
 *  org.joml.Vector4f
 */
package oxxxde;

import java.awt.Color;
import kotakbaz.rain.client.draggable.Draggable;
import kotakbaz.rain.client.util.render.display.BlurredRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector4f;
import oxxxde.\u0628\u062d;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u064e;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u063a;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\u0003J'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0003Jo\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J7\u0010$\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\b$\u0010%J'\u0010*\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b.\u0010-R\u0014\u0010/\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b/\u0010-R\u0014\u00100\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b0\u0010-R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010<\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010=\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b=\u0010-R\u0016\u0010>\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b>\u0010-R\u0016\u0010?\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b?\u0010-\u00a8\u0006@"}, d2={"Loxxxde/\u0630\u064b;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u062b\u0622;", "event", "", "onOverlayRender", "(Lkotakbaz/rain/event/events/OverlayRenderEvent;)V", "onDisable", "", "x", "y", "z", "updateCoordinateText", "(III)V", "renderHud", "", "label", "value", "", "labelY", "valueY", "labelSize", "valueSize", "labelWidth", "valueWidth", "labelValueGap", "Ljava/awt/Color;", "labelColor", "valueColor", "drawCoordinatePart", "(Ljava/lang/String;Ljava/lang/String;FFFFFFFFLjava/awt/Color;Ljava/awt/Color;)F", "height", "width", "color", "drawDivider", "(FFFFLjava/awt/Color;)V", "Loxxxde/\u062c\u064b;", "font", "size", "containerHeight", "centeredTopOffset", "(Lkotakbaz/rain/client/util/render/font/Font;FF)F", "HUD_ICON", "Ljava/lang/String;", "X_LABEL", "Y_LABEL", "Z_LABEL", "Loxxxde/\u0638\u0630;", "draggable", "Loxxxde/\u0638\u0630;", "Lorg/joml/Vector4f;", "iconPanelRound", "Lorg/joml/Vector4f;", "dividerColor", "Ljava/awt/Color;", "cachedX", "I", "cachedY", "cachedZ", "xText", "yText", "zText", "rain-visuals"})
public final class \u0630\u064b
extends Module {
    @NotNull
    private static final String Y_LABEL = "Y";
    @NotNull
    private static final String X_LABEL = "X";
    @NotNull
    private static final Color dividerColor;
    private static int cachedX;
    @NotNull
    private static final String Z_LABEL = "Z";
    @NotNull
    private static String xText;
    @NotNull
    private static final String HUD_ICON = "s";
    @NotNull
    private static String yText;
    @NotNull
    private static final Vector4f iconPanelRound;
    @NotNull
    private static String zText;
    private static int cachedZ;
    @NotNull
    public static final \u0630\u064b INSTANCE;
    private static int cachedY;
    @NotNull
    private static final Draggable draggable;

    private final void drawDivider(float x, float y, float height, float width, Color color) {
        float dividerHeight = height / 2.5f;
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(color).mix(0.9f).round(0.0f).draw(x, y + height / 2.0f - dividerHeight / 2.0f, width, dividerHeight);
    }

    static {
        INSTANCE = new \u0630\u064b();
        draggable = INSTANCE.draggable(INSTANCE.getName(), 200.0f, 260.0f);
        iconPanelRound = new Vector4f();
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        dividerColor = \u0628\u062d.INSTANCE.setAlpha(color, 0.39f);
        cachedX = Integer.MIN_VALUE;
        cachedY = Integer.MIN_VALUE;
        cachedZ = Integer.MIN_VALUE;
        xText = "0";
        yText = "0";
        zText = "0";
    }

    private \u0630\u064b() {
        super("CoordinatesHUD", \u0638\u0646.getHUD(), "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0432\u0430\u0448\u0438 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b");
    }

    @Commando
    public final void onOverlayRender(@NotNull OverlayRenderEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ClientPlayerEntity player = \u0636\u0643.getMc().player;
        boolean preview = \u0636\u0643.getMc().currentScreen instanceof ChatScreen;
        if (player == null) {
            if (!preview) {
                draggable.setWidth(0.0f);
                draggable.setHeight(0.0f);
                return;
            }
        }
        ClientPlayerEntity clientPlayerEntity = player;
        ClientPlayerEntity clientPlayerEntity2 = player;
        ClientPlayerEntity clientPlayerEntity3 = player;
        this.updateCoordinateText(MathHelper.floor((double)(clientPlayerEntity != null ? clientPlayerEntity.getX() : 0.0)), MathHelper.floor((double)(clientPlayerEntity2 != null ? clientPlayerEntity2.getY() : 0.0)), MathHelper.floor((double)(clientPlayerEntity3 != null ? clientPlayerEntity3.getZ() : 0.0)));
        this.renderHud();
    }

    /*
     * WARNING - void declaration
     */
    private final float drawCoordinatePart(String label, String value, float x, float labelY, float valueY, float labelSize, float valueSize, float labelWidth, float valueWidth, float labelValueGap, Color labelColor, Color valueColor) {
        void var9_9;
        void var13_13;
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_REGULAR().priority(ClientRenderPipeline.HUD_TEXT), label, x, labelY, labelSize, labelColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        float valueX = x + labelWidth + labelValueGap;
        Font.drawText$default(\u0631\u064e.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT), value, valueX, valueY, valueSize, valueColor, 0.0f, 0.0f, 0.0f, 0, 0.0f, 992, null);
        return (float)(var13_13 + var9_9);
    }

    /*
     * WARNING - void declaration
     */
    private final void renderHud() {
        void var4_4;
        void var23_23;
        void var26_26;
        void var25_25;
        float x = draggable.getX();
        float y = draggable.getY();
        float margin = \u0637\u063a.INSTANCE.margin();
        float height = \u0637\u063a.INSTANCE.headerTextSize() + margin * 2.2f;
        float iconPanelWidth = height + \u0637\u063a.INSTANCE.scaled(2.5f);
        float contentPadding = margin * 1.15f;
        float labelSize = \u0637\u063a.INSTANCE.scaled(5.3f);
        float valueSize = \u0637\u063a.INSTANCE.scaled(7.2f);
        float iconSize = \u0637\u063a.INSTANCE.scaled(10.0f);
        float labelValueGap = \u0637\u063a.INSTANCE.scaled(2.2f);
        float sectionGap = \u0637\u063a.INSTANCE.scaled(5.5f);
        float dividerWidth = \u0637\u063a.INSTANCE.rowDividerWidth();
        float corner = \u0637\u063a.INSTANCE.scaled(6.0f);
        float xLabelWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_REGULAR(), X_LABEL, labelSize, 0.0f, 4, null);
        float yLabelWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_REGULAR(), Y_LABEL, labelSize, 0.0f, 4, null);
        float zLabelWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_REGULAR(), Z_LABEL, labelSize, 0.0f, 4, null);
        float xValueWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), xText, valueSize, 0.0f, 4, null);
        float yValueWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), yText, valueSize, 0.0f, 4, null);
        float zValueWidth = Font.getWidth$default(\u0631\u064e.INSTANCE.getGS_MEDIUM(), zText, valueSize, 0.0f, 4, null);
        float separatorWidth = sectionGap * 2.0f + dividerWidth;
        float contentWidth = xLabelWidth + yLabelWidth + zLabelWidth + xValueWidth + yValueWidth + zValueWidth + labelValueGap * 3.0f + separatorWidth * 2.0f;
        float rightWidth = contentPadding * 2.0f + contentWidth;
        float width = iconPanelWidth + rightWidth;
        Color iconColor = \u0637\u063a.INSTANCE.getTITLE_COLOR();
        Color labelColor = \u0637\u063a.INSTANCE.getVALUE_COLOR();
        Color valueColor = \u0637\u063a.INSTANCE.getTITLE_COLOR();
        Color basePanelColor = \u0637\u063a.INSTANCE.getPANEL_COLOR();
        Color iconPanelColor = \u0637\u063a.INSTANCE.getHEADER_COLOR();
        \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(basePanelColor).mix(0.9f).round(corner).draw(x, y, width, height);
        BlurredRectRenderer blurredRectRenderer = \u0630\u0631.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(iconPanelColor).mix(0.9f);
        Vector4f vector4f = iconPanelRound.set(corner, 0.0f, corner, 0.0f);
        Intrinsics.checkNotNullExpressionValue(vector4f, "set(...)");
        blurredRectRenderer.round(vector4f).draw(x, y, iconPanelWidth - \u0637\u063a.INSTANCE.scaled(2.5f), height);
        Font.drawCenteredText$default(\u0631\u064e.INSTANCE.getICON().priority(ClientRenderPipeline.HUD_TEXT), HUD_ICON, x + iconPanelWidth / 2.0f, y + this.centeredTopOffset(\u0631\u064e.INSTANCE.getICON(), iconSize, height), iconSize, iconColor, 0.0f, 32, null);
        float labelY = y + this.centeredTopOffset(\u0631\u064e.INSTANCE.getGS_REGULAR(), labelSize, height);
        float valueY = y + this.centeredTopOffset(\u0631\u064e.INSTANCE.getGS_MEDIUM(), valueSize, height);
        float cursor = x + iconPanelWidth + contentPadding - \u0637\u063a.INSTANCE.scaled(2.5f);
        cursor = this.drawCoordinatePart(X_LABEL, xText, cursor, labelY, valueY, labelSize, valueSize, xLabelWidth, xValueWidth, labelValueGap, labelColor, valueColor);
        this.drawDivider(cursor + sectionGap, y, height, dividerWidth, dividerColor);
        cursor += separatorWidth;
        cursor = this.drawCoordinatePart(Y_LABEL, yText, cursor, labelY, valueY, labelSize, valueSize, yLabelWidth, yValueWidth, labelValueGap, labelColor, valueColor);
        this.drawDivider(cursor + sectionGap, y, height, dividerWidth, dividerColor);
        this.drawCoordinatePart(Z_LABEL, zText, cursor += separatorWidth, labelY, valueY, labelSize, valueSize, zLabelWidth, zValueWidth, labelValueGap, (Color)var25_25, (Color)var26_26);
        draggable.setWidth((float)var23_23);
        draggable.setHeight((float)var4_4);
    }

    private final float centeredTopOffset(Font font, float size, float containerHeight) {
        return (containerHeight - font.getMetrics().getLineHeight() * size) * 0.5f;
    }

    @Override
    public void onDisable() {
        draggable.setWidth(0.0f);
        draggable.setHeight(0.0f);
    }

    private final void updateCoordinateText(int x, int y, int z) {
        if (cachedX != x) {
            cachedX = x;
            xText = String.valueOf(x);
        }
        if (cachedY != y) {
            cachedY = y;
            yText = String.valueOf(y);
        }
        if (cachedZ != z) {
            cachedZ = z;
            zText = String.valueOf(z);
        }
    }
}

