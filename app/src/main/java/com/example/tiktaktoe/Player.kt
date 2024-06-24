package com.example.tiktaktoe

sealed class Player(val symbol: Char) {
    data object X : Player('X')
    data object O : Player('O')

    operator fun not():Player{
        return if (this is X) O else X
    }
}