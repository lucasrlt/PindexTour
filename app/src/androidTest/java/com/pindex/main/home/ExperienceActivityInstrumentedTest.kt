package com.pindex.main.home

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.pindex.main.R
import com.pindex.main.models.BlockDto
import com.pindex.main.models.BlocksWrapperDto
import com.pindex.main.models.ContentDto
import com.pindex.main.models.ExperienceDto
import com.pindex.main.models.blocks.AudioBlockDto
import com.pindex.main.models.blocks.ImageBlockDto
import com.pindex.main.models.blocks.TextBlockDto
import com.pindex.main.utils.Constants
import io.github.serpro69.kfaker.Faker
import org.junit.After
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExperienceActivityInstrumentedTest {

    /**
     * Test Experience Activity
     */
    private lateinit var activityScenario: ActivityScenario<ExperienceActivity>

    /**
     * Experience Pindex blocks (for a single test at once)
     */
    private var blocksList: ArrayList<BlockDto> = ArrayList()

    /**
     * Data Faker
     */
    private val faker = Faker()

    @After
    fun tearDown() {
        activityScenario.close()

        // Empty the blocks list for the next test
        blocksList = ArrayList()
    }

    /**
     * Assert that the Experience activity is displayed.
     */
    private fun assertActivityIsDisplayed() {
        Espresso.onView(ViewMatchers.withId(R.id.experience_root_layout))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    /**
     * Add the given [block] to the blocks list.
     */
    private fun addBlock(block: BlockDto) {
        blocksList.add(block)
    }

    /**
     * Start the Experience Activity with the current blocks list.
     */
    private fun startActivityWithBlocksList() {
        // Recreate the Firestore Experience structure
        val blocksWrapper = BlocksWrapperDto(blocksList)
        val content = ContentDto(blocksWrapper = blocksWrapper)
        val experience = ExperienceDto(content = arrayListOf(content))

        // Create the activity intent
        val intent = Intent(ApplicationProvider.getApplicationContext(), ExperienceActivity::class.java)
        intent.putExtra(Constants.ACTIVITY_EXPERIENCE_EXTRA_NAME, experience)

        // Starts the activity
        activityScenario = ActivityScenario.launch(intent)
    }

    /**
     * Create and add an Audio block with the given [name] to the blocks list.
     * By passing a [sectionTitle] argument, it will also create a Section Title block.
     */
    private fun addAudioBlock(name: String, sectionTitle: String = "") {
        val audioBlock = AudioBlockDto(name = name)
        val block = BlockDto(audio = audioBlock, sectionTitle = sectionTitle, type = Constants.BlocksTypes.AUDIO)

        addBlock(block)
    }

    /**
     * Create and add a Big Header block with the given [title] to the blocks list.
     */
    private fun addBigHeaderBlock(title: String) {
        val textBlock = TextBlockDto(text = title)
        val block = BlockDto(text = textBlock, type = Constants.BlocksTypes.BIG_HEADER)

        addBlock(block)
    }

    /**
     * Create and add a Borderless Image block to the blocks list.
     * By passing a [sectionTitle] argument, it will also create a Section Title block.
     */
    private fun addBorderlessImageBlock(sectionTitle: String = "") {
        val imageBlock = ImageBlockDto()
        val block = BlockDto(image = imageBlock, sectionTitle = sectionTitle, type = Constants.BlocksTypes.BORDERLESS_IMAGE)

        addBlock(block)
    }

    /**
     * Create and add a Text block with the given [text] to the blocks list.
     * By passing a [sectionTitle] argument, it will also create a Section Title block.
     */
    private fun addTextBlock(text: String, sectionTitle: String = "") {
        val textBlock = TextBlockDto(text = text)
        val block = BlockDto(text = textBlock, sectionTitle = sectionTitle, type = Constants.BlocksTypes.TEXT)

        addBlock(block)
    }

    /**
     * Test that the Experience Activity given an Audio block displays this block.
     */
    @Test
    fun launchingExperienceActivityWithAudioBlockDisplaysIt() {
        val name = faker.name.name()
        addAudioBlock(name = name)

        startActivityWithBlocksList()

        assertActivityIsDisplayed()

        // Assert that the audio name is displayed
        Espresso.onView(ViewMatchers.withId(R.id.pindex_block_audio_button))
                .check(ViewAssertions.matches(ViewMatchers.withText(name)))
    }

    /**
     * Test that the Experience Activity given a Text block and a Section Title displays them.
     */
    @Test
    fun launchingExperienceActivityWithAudioBlockAndSectionTitleDisplaysThem() {
        val sectionTitle = faker.name.name()
        val name = faker.name.name()
        addAudioBlock(name = name, sectionTitle = sectionTitle)

        startActivityWithBlocksList()

        assertActivityIsDisplayed()

        // Assert that the Section Title block text is displayed
        Espresso.onView(ViewMatchers.withId(R.id.pindex_block_section_title))
                .check(ViewAssertions.matches(ViewMatchers.withText(sectionTitle)))

        // Assert that the audio name is displayed
        Espresso.onView(ViewMatchers.withId(R.id.pindex_block_audio_button))
                .check(ViewAssertions.matches(ViewMatchers.withText(name)))
    }

    /**
     * Test that the Experience Activity given a Big Header block displays this block.
     */
    @Test
    fun launchingExperienceActivityWithBigHeaderBlockDisplaysIt() {
        val title = faker.name.name()
        addBigHeaderBlock(title)

        startActivityWithBlocksList()

        assertActivityIsDisplayed()

        // Assert that the Big Header block title is displayed
        Espresso.onView(ViewMatchers.withId(R.id.pindex_block_big_header))
                .check(ViewAssertions.matches(ViewMatchers.withText(title)))
    }

    /**
     * Test that the Experience Activity given a Borderless Image block displays this block.
     */
    @Test
    fun launchingExperienceActivityWithBorderlessImageBlockDisplaysIt() {
        addBorderlessImageBlock()

        startActivityWithBlocksList()

        assertActivityIsDisplayed()
    }

    /**
     * Test that the Experience Activity given a Borderless Image block and a Section Title displays them.
     */
    @Test
    fun launchingExperienceActivityWithBorderlessImageBlockAndSectionTitleDisplaysThem() {
        val sectionTitle = faker.name.name()
        addBorderlessImageBlock(sectionTitle)

        startActivityWithBlocksList()

        assertActivityIsDisplayed()

        // Assert that the Section Title block text is displayed
        Espresso.onView(ViewMatchers.withId(R.id.pindex_block_section_title))
                .check(ViewAssertions.matches(ViewMatchers.withText(sectionTitle)))
    }

    /**
     * Test that the Experience Activity given a Text block displays this block.
     */
    @Test
    fun launchingExperienceActivityWithTextBlockDisplaysIt() {
        val text = faker.name.name()
        addTextBlock(text)

        startActivityWithBlocksList()

        assertActivityIsDisplayed()

        // Assert that the Text block text is displayed
        Espresso.onView(ViewMatchers.withId(R.id.pindex_block_text))
                .check(ViewAssertions.matches(ViewMatchers.withText(text)))
    }

    /**
    * Test that the Experience Activity given a Text block and a Section Title displays them.
    */
    @Test
    fun launchingExperienceActivityWithTextBlockAndSectionTitleDisplaysThem() {
        val sectionTitle = faker.name.name()
        val text = faker.name.name()
        addTextBlock(text, sectionTitle)

        startActivityWithBlocksList()

        assertActivityIsDisplayed()

        // Assert that the Section Title block text is displayed
        Espresso.onView(ViewMatchers.withId(R.id.pindex_block_section_title))
                .check(ViewAssertions.matches(ViewMatchers.withText(sectionTitle)))

        // Assert that the Text block text is displayed
        Espresso.onView(ViewMatchers.withId(R.id.pindex_block_text))
                .check(ViewAssertions.matches(ViewMatchers.withText(text)))
    }

    /**
     * Test that the Experience Activity given multiple blocks displays them.
     */
    @Test
    fun launchingExperienceActivityWithMultipleBlocksDisplaysThem() {
        val audioName = faker.name.name()
        val bigHeaderTitle = faker.name.name()
        val text = faker.name.name()

        addAudioBlock(audioName)
        addBigHeaderBlock(bigHeaderTitle)
        addTextBlock(text)

        startActivityWithBlocksList()

        assertActivityIsDisplayed()

        // Assert that the Audio block name is displayed
        Espresso.onView(ViewMatchers.withId(R.id.pindex_block_audio_button))
                .check(ViewAssertions.matches(ViewMatchers.withText(audioName)))

        // Assert that the Big Header block title is displayed
        Espresso.onView(ViewMatchers.withId(R.id.pindex_block_big_header))
                .check(ViewAssertions.matches(ViewMatchers.withText(bigHeaderTitle)))

        // Assert that the Text block text is displayed
        Espresso.onView(ViewMatchers.withId(R.id.pindex_block_text))
                .check(ViewAssertions.matches(ViewMatchers.withText(text)))
    }

}