import kotlin.test.*

class ActualPlatformTest {
    @Test
    fun testPlatform() {
        assertEquals("platform-js", Platform().platform())
    }
}
