/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.viabedrock.protocol.model.SkinData$AnimationData
 *  net.raphimc.viabedrock.protocol.model.SkinData$PersonaPieceData
 *  net.raphimc.viabedrock.protocol.model.SkinData$PersonaPieceTintData
 */
package net.raphimc.viabedrock.protocol.model;

import java.awt.image.BufferedImage;
import java.util.List;
import net.raphimc.viabedrock.protocol.model.SkinData;

public record SkinData(String skinId, String playFabId, String skinResourcePatch, BufferedImage skinData, List<AnimationData> animations, BufferedImage capeData, String geometryData, String geometryDataEngineVersion, String animationData, boolean premium, boolean persona, boolean capeOnClassic, boolean primaryUser, String capeId, String fullSkinId, String armSize, String skinColor, List<PersonaPieceData> personaPieces, List<PersonaPieceTintData> tintColors, boolean overridingPlayerAppearance) {
}

