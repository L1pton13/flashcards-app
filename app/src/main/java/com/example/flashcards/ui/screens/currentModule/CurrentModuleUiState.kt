package com.example.flashcards.ui.screens.currentModule

import com.example.flashcards.data.model.FlashCard
import com.example.flashcards.data.model.Module

data class CurrentModuleUiState(
    val module: Module? = null,
    val cards: List<FlashCard> = emptyList(),
    val moduleName: String = "",
    val totalCardsCount: Int = 0,
    val isTermFirst: Boolean = true,
    val highlightedCardIndex: Int = -1,
    val isSearchActive: Boolean = false,

    )