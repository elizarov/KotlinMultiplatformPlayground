import kotlin.test.*

class CommonTest {
    @Test
    fun testCommon() {
        assertEquals("common", Common().common())
    }

    @Test
    fun testPlatform() {
        assertTrue(Common().platform().startsWith("platform-"))
    }
}