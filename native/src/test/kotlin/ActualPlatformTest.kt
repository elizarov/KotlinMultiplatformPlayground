import kotlin.test.*

class ActualPlatformTest {
    @Test
    fun testPlatform() {
        assertEquals("platform-native", Platform().platform())
    }
}
