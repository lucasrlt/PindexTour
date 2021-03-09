package com.pindex.main.utils
import android.widget.ImageView
import com.pindex.main.MainApplication
import com.pindex.main.di.ExperienceRepositoryDI
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

    }

}