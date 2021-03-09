package com.pindex.main.utils
import junit.framework.TestCase.assertNotNull
import org.junit.Test

class ConstantsTest {

    @Test
    fun constantsObjectExists() {
        assertNotNull(Constants)
        assertNotNull(Constants.BlockFragmentArguments)
        assertNotNull(Constants.BlocksTypes)
    }

}