package fun.nexisdlc.client.utils.globals;

import java.util.List;

public record GlobalsMember(
        int userId,
        String username,
        String minecraftName,
        String worldKey,
        String serverAddress,
        boolean online,
        float health,
        double x,
        double y,
        double z,
        String customTexture,
        List<GlobalsInventoryItem> inventory
) {
    public GlobalsMember {
        inventory = List.copyOf(inventory == null ? List.of() : inventory);
    }
}
