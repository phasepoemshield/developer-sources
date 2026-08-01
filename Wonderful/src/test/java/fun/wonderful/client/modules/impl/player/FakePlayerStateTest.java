package fun.wonderful.client.modules.impl.player;

public final class FakePlayerStateTest {
    public static void main(String[] args) {
        FakePlayerState.DamageResult totemResult = FakePlayerState.applyDamage(4.0f, 8.0f, true, false);
        assertEquals(1.0f, totemResult.health(), "Тотем должен оставлять фейка в живых с одним здоровьем");
        assertTrue(totemResult.poppedTotem(), "Тотем должен сработать при смертельном уроне");
        assertFalse(totemResult.dead(), "Фейк с тотемом не должен умирать");

        FakePlayerState.DamageResult invulnerableResult = FakePlayerState.applyDamage(20.0f, 100.0f, false, true);
        assertEquals(20.0f, invulnerableResult.health(), "Неуязвимый фейк не должен получать урон");
        assertFalse(invulnerableResult.dead(), "Неуязвимый фейк не должен умирать");

        FakePlayerState.DamageResult deathResult = FakePlayerState.applyDamage(4.0f, 8.0f, false, false);
        assertTrue(deathResult.dead(), "Фейк без тотема должен умирать от смертельного урона");
    }

    private static void assertEquals(float expected, float actual, String message) {
        if (Float.compare(expected, actual) != 0) {
            throw new AssertionError(message + ": ожидалось " + expected + ", получено " + actual);
        }
    }

    private static void assertTrue(boolean value, String message) {
        if (!value) {
            throw new AssertionError(message);
        }
    }

    private static void assertFalse(boolean value, String message) {
        assertTrue(!value, message);
    }
}
