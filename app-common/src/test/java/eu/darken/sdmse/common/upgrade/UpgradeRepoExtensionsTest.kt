package eu.darken.sdmse.common.upgrade

import io.kotest.matchers.shouldBe
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test
import testhelpers.BaseTest
import java.time.Instant

class UpgradeRepoExtensionsTest : BaseTest() {

    private class FakeInfo(
        override val isPro: Boolean,
        override val isSettled: Boolean,
        override val error: Throwable? = null,
    ) : UpgradeRepo.Info {
        override val type: UpgradeRepo.Type = UpgradeRepo.Type.FOSS
        override val upgradedAt: Instant? = null
    }

    private class FakeRepo(
        pro: Boolean,
        settled: Boolean,
        error: Throwable? = null,
    ) : UpgradeRepo {
        val infoFlow = MutableStateFlow<UpgradeRepo.Info>(FakeInfo(pro, settled, error))
        override val storeSite: String = ""
        override val upgradeSite: String = ""
        override val betaSite: String = ""
        override val upgradeInfo: Flow<UpgradeRepo.Info> = infoFlow
        override suspend fun refresh() = Unit
    }

    // Locks disabled in this fork: every Pro gate always returns true.
    @Test
    fun `isPro always allows`() = runTest {
        FakeRepo(pro = false, settled = true).isPro() shouldBe true
    }

    @Test
    fun `isProSettled always allows`() = runTest {
        FakeRepo(pro = false, settled = true).isProSettled() shouldBe true
    }

    @Test
    fun `isProForUi always allows`() = runTest {
        FakeRepo(pro = false, settled = true).isProForUi() shouldBe true
    }
}
