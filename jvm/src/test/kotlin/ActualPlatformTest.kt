import kotlin.test.*

class ActualPlatformTest {
    @Test
    fun testPlatform() {
        assertEquals("platform-jvm", Platform().platform())
    }
}
