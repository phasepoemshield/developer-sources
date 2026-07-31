package fun.wonderful.client.modules.impl.player;

final class FakePlayerState {
    private FakePlayerState() {
    }

    static DamageResult applyDamage(float health, float damage, boolean hasTotem, boolean invulnerable) {
        if (invulnerable) {
            return new DamageResult(health, false, false);
        }
        float remainingHealth = Math.max(0.0f, health - Math.max(0.0f, damage));
        if (remainingHealth > 0.0f) {
            return new DamageResult(remainingHealth, false, false);
        }
        if (hasTotem) {
            return new DamageResult(1.0f, true, false);
        }
        return new DamageResult(0.0f, false, true);
    }

    record DamageResult(float health, boolean poppedTotem, boolean dead) {
    }
}
