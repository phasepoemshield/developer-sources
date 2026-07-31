package fun.nexisdlc.client.utils.globals;

public record GlobalsInventoryItem(
        int slot,
        String itemId,
        float cooldownSeconds
) {
    public GlobalsInventoryItem {
        itemId = itemId == null ? "" : itemId;
        cooldownSeconds = Math.max(0f, cooldownSeconds);
    }
}
