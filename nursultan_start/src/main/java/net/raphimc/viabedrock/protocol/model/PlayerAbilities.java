/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AbilitiesIndex
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SerializedAbilitiesData_SerializedAbilitiesLayer
 *  net.raphimc.viabedrock.protocol.model.PlayerAbilities$1
 *  net.raphimc.viabedrock.protocol.model.PlayerAbilities$AbilitiesLayer
 */
package net.raphimc.viabedrock.protocol.model;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AbilitiesIndex;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SerializedAbilitiesData_SerializedAbilitiesLayer;
import net.raphimc.viabedrock.protocol.model.PlayerAbilities;

public record PlayerAbilities(long entityUniqueId, byte playerPermission, byte commandPermission, Map<SerializedAbilitiesData_SerializedAbilitiesLayer, AbilitiesLayer> abilityLayers) {
    public PlayerAbilities(long entityUniqueId, byte playerPermission, byte commandPermission) {
        this(entityUniqueId, playerPermission, commandPermission, new EnumMap<SerializedAbilitiesData_SerializedAbilitiesLayer, AbilitiesLayer>(SerializedAbilitiesData_SerializedAbilitiesLayer.class));
        EnumSet<AbilitiesIndex> abilitiesSet = EnumSet.allOf(AbilitiesIndex.class);
        abilitiesSet.remove(AbilitiesIndex.Invalid);
        this.abilityLayers.put(SerializedAbilitiesData_SerializedAbilitiesLayer.Base, new AbilitiesLayer(abilitiesSet, EnumSet.of(AbilitiesIndex.Build, new AbilitiesIndex[]{AbilitiesIndex.Mine, AbilitiesIndex.DoorsAndSwitches, AbilitiesIndex.OpenContainers, AbilitiesIndex.AttackPlayers, AbilitiesIndex.AttackMobs}), 0.1f, 0.05f, 1.0f));
    }

    public float getFloatValue(AbilitiesIndex ability) {
        for (SerializedAbilitiesData_SerializedAbilitiesLayer layer : SerializedAbilitiesData_SerializedAbilitiesLayer.values()) {
            AbilitiesLayer abilitiesLayer = this.abilityLayers.get(layer);
            if (abilitiesLayer == null || !abilitiesLayer.abilitiesSet().contains(ability)) continue;
            return switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$AbilitiesIndex[ability.ordinal()]) {
                case 1 -> abilitiesLayer.walkSpeed();
                case 2 -> abilitiesLayer.flySpeed();
                case 3 -> abilitiesLayer.verticalFlySpeed();
                default -> throw new IllegalArgumentException("Ability " + String.valueOf(ability) + " is not a float value");
            };
        }
        return 0.0f;
    }

    public boolean getBooleanValue(AbilitiesIndex ability) {
        for (SerializedAbilitiesData_SerializedAbilitiesLayer layer : SerializedAbilitiesData_SerializedAbilitiesLayer.values()) {
            AbilitiesLayer abilitiesLayer = this.abilityLayers.get(layer);
            if (abilitiesLayer == null || !abilitiesLayer.abilitiesSet().contains(ability)) continue;
            return abilitiesLayer.abilityValues().contains(ability);
        }
        return false;
    }

    public AbilitiesLayer getOrCreateCacheLayer() {
        return this.abilityLayers.computeIfAbsent(SerializedAbilitiesData_SerializedAbilitiesLayer.CustomCache, layer -> new AbilitiesLayer(EnumSet.noneOf(AbilitiesIndex.class), EnumSet.noneOf(AbilitiesIndex.class), 0.0f, 0.0f, 0.0f));
    }
}

