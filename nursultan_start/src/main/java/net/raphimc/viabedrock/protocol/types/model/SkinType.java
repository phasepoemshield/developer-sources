/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.model.SkinData
 *  net.raphimc.viabedrock.protocol.model.SkinData$AnimationData
 *  net.raphimc.viabedrock.protocol.model.SkinData$PersonaPieceData
 *  net.raphimc.viabedrock.protocol.model.SkinData$PersonaPieceTintData
 */
package net.raphimc.viabedrock.protocol.types.model;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import net.raphimc.viabedrock.protocol.model.SkinData;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class SkinType
extends Type<SkinData> {
    public SkinType() {
        super(SkinData.class);
    }

    public void write(ByteBuf buffer, SkinData value) {
        BedrockTypes.STRING.write(buffer, (Object)value.skinId());
        BedrockTypes.STRING.write(buffer, (Object)value.playFabId());
        BedrockTypes.STRING.write(buffer, (Object)value.skinResourcePatch());
        BedrockTypes.IMAGE.write(buffer, (Object)value.skinData());
        buffer.writeIntLE(value.animations().size());
        for (SkinData.AnimationData animation : value.animations()) {
            BedrockTypes.IMAGE.write(buffer, (Object)animation.image());
            buffer.writeIntLE(animation.type());
            buffer.writeFloatLE(animation.frames());
            buffer.writeIntLE(animation.expression());
        }
        BedrockTypes.IMAGE.write(buffer, (Object)value.capeData());
        BedrockTypes.STRING.write(buffer, (Object)value.geometryData());
        BedrockTypes.STRING.write(buffer, (Object)value.geometryDataEngineVersion());
        BedrockTypes.STRING.write(buffer, (Object)value.animationData());
        BedrockTypes.STRING.write(buffer, (Object)value.capeId());
        BedrockTypes.STRING.write(buffer, (Object)value.fullSkinId());
        BedrockTypes.STRING.write(buffer, (Object)value.armSize());
        BedrockTypes.STRING.write(buffer, (Object)value.skinColor());
        buffer.writeIntLE(value.personaPieces().size());
        for (SkinData.PersonaPieceData piece : value.personaPieces()) {
            BedrockTypes.STRING.write(buffer, (Object)piece.id());
            BedrockTypes.STRING.write(buffer, (Object)piece.type());
            BedrockTypes.STRING.write(buffer, (Object)piece.packId());
            buffer.writeBoolean(piece.defaultPiece());
            BedrockTypes.STRING.write(buffer, (Object)piece.productId());
        }
        buffer.writeIntLE(value.tintColors().size());
        for (SkinData.PersonaPieceTintData tint : value.tintColors()) {
            BedrockTypes.STRING.write(buffer, (Object)tint.type());
            buffer.writeIntLE(tint.colors().size());
            for (String color : tint.colors()) {
                BedrockTypes.STRING.write(buffer, (Object)color);
            }
        }
        buffer.writeBoolean(value.premium());
        buffer.writeBoolean(value.persona());
        buffer.writeBoolean(value.capeOnClassic());
        buffer.writeBoolean(value.primaryUser());
        buffer.writeBoolean(value.overridingPlayerAppearance());
    }

    public SkinData read(ByteBuf buffer) {
        String skinId = (String)BedrockTypes.STRING.read(buffer);
        String playFabId = (String)BedrockTypes.STRING.read(buffer);
        String skinResourcePatch = (String)BedrockTypes.STRING.read(buffer);
        BufferedImage skinData = (BufferedImage)BedrockTypes.IMAGE.read(buffer);
        int animationCount = buffer.readIntLE();
        ArrayList<SkinData.AnimationData> animations = new ArrayList<SkinData.AnimationData>(animationCount);
        for (int i = 0; i < animationCount; ++i) {
            BufferedImage image = (BufferedImage)BedrockTypes.IMAGE.read(buffer);
            int type = buffer.readIntLE();
            float frames = buffer.readFloatLE();
            int expression = buffer.readIntLE();
            animations.add(new SkinData.AnimationData(image, type, frames, expression));
        }
        BufferedImage capeData = (BufferedImage)BedrockTypes.IMAGE.read(buffer);
        String geometryData = (String)BedrockTypes.STRING.read(buffer);
        String geometryDataEngineVersion = (String)BedrockTypes.STRING.read(buffer);
        String animationData = (String)BedrockTypes.STRING.read(buffer);
        String capeId = (String)BedrockTypes.STRING.read(buffer);
        String fullSkinId = (String)BedrockTypes.STRING.read(buffer);
        String armSize = (String)BedrockTypes.STRING.read(buffer);
        String skinColor = (String)BedrockTypes.STRING.read(buffer);
        int piecesLength = buffer.readIntLE();
        ArrayList<SkinData.PersonaPieceData> personaPieces = new ArrayList<SkinData.PersonaPieceData>(piecesLength);
        for (int i = 0; i < piecesLength; ++i) {
            String id = (String)BedrockTypes.STRING.read(buffer);
            String type = (String)BedrockTypes.STRING.read(buffer);
            String packId = (String)BedrockTypes.STRING.read(buffer);
            boolean defaultPiece = buffer.readBoolean();
            String productId = (String)BedrockTypes.STRING.read(buffer);
            personaPieces.add(new SkinData.PersonaPieceData(id, type, packId, defaultPiece, productId));
        }
        int tintsLength = buffer.readIntLE();
        ArrayList<SkinData.PersonaPieceTintData> tintColors = new ArrayList<SkinData.PersonaPieceTintData>(tintsLength);
        for (int i = 0; i < tintsLength; ++i) {
            String type = (String)BedrockTypes.STRING.read(buffer);
            ArrayList<String> colors = new ArrayList<String>();
            int colorsLength = buffer.readIntLE();
            for (int i2 = 0; i2 < colorsLength; ++i2) {
                colors.add((String)BedrockTypes.STRING.read(buffer));
            }
            tintColors.add(new SkinData.PersonaPieceTintData(type, colors));
        }
        boolean premium = buffer.readBoolean();
        boolean persona = buffer.readBoolean();
        boolean capeOnClassic = buffer.readBoolean();
        boolean primaryUser = buffer.readBoolean();
        boolean overridingPlayerAppearance = buffer.readBoolean();
        return new SkinData(skinId, playFabId, skinResourcePatch, skinData, animations, capeData, geometryData, geometryDataEngineVersion, animationData, premium, persona, capeOnClassic, primaryUser, capeId, fullSkinId, armSize, skinColor, personaPieces, tintColors, overridingPlayerAppearance);
    }
}

