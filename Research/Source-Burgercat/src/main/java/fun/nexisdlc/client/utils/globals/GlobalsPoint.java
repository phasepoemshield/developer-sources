package fun.nexisdlc.client.utils.globals;

public record GlobalsPoint(
        int userId,
        String username,
        String worldKey,
        String serverAddress,
        double x,
        double y,
        double z,
        long createdAtMs
) {
}
