package com.example.training

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.example.training.ui.theme.TrainingTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            TrainingTheme {
                TipTimeLayout()
            }
        }

        composeTestRule.onNodeWithText("Montante de dinheiro")
            .performTextInput("10")
        composeTestRule.onNodeWithText("Porcentagem de gorjeta").performTextInput("20")
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        composeTestRule.onNodeWithText("Valor da gorjeta: $expectedTip").assertExists(
            "Nenhum nó com este texto foi encontrado."
        )
    }
}