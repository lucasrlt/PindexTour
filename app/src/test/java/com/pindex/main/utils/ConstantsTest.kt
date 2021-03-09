package com.pindex.main.utils
import android.widget.ImageView
import com.pindex.main.MainApplication
import com.pindex.main.auth.PindexFirebase
import com.pindex.main.di.ExperienceRepositoryDI
import com.pindex.main.models.BlocksWrapperCategoryEnum
import junit.framework.TestCase.assertNotNull
import org.junit.Test

class ConstantsTest {

    @Test
    fun constantsObjectExists() {
        assertNotNull(Constants)
        assertNotNull(Constants.BlockFragmentArguments)
        assertNotNull(Constants.BlocksTypes)

        assertNotNull(MainApplication());
        assertNotNull(ExperienceRepositoryDI());
    }

    @Test
    fun testMediaLoader() {
        assertNotNull(MediaLoader);
        assertNotNull(BlocksWrapperCategoryEnum.values());

    }

}