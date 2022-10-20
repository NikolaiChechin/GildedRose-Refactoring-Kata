package com.gildedrose

import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GildedRoseTest {

    val expectedOutput = """
        OMGHAI!
        -------- day 0 --------
        name, sellIn, quality
        +5 Dexterity Vest, 10, 20
        Aged Brie, 2, 0
        Elixir of the Mongoose, 5, 7
        Sulfuras, Hand of Ragnaros, 0, 80
        Sulfuras, Hand of Ragnaros, -1, 80
        Backstage passes to a TAFKAL80ETC concert, 15, 20
        Backstage passes to a TAFKAL80ETC concert, 10, 49
        Backstage passes to a TAFKAL80ETC concert, 5, 49
        Conjured Mana Cake, 3, 6

        -------- day 1 --------
        name, sellIn, quality
        +5 Dexterity Vest, 9, 19
        Aged Brie, 1, 1
        Elixir of the Mongoose, 4, 6
        Sulfuras, Hand of Ragnaros, 0, 80
        Sulfuras, Hand of Ragnaros, -1, 80
        Backstage passes to a TAFKAL80ETC concert, 14, 21
        Backstage passes to a TAFKAL80ETC concert, 9, 50
        Backstage passes to a TAFKAL80ETC concert, 4, 50
        Conjured Mana Cake, 2, 5
    """.trimIndent()

    @Test
    fun `it works`() {
        val output = tapSystemOut {
            main(arrayOf())
        }
        assertEquals(expectedOutput, output.trim())
    }

}


