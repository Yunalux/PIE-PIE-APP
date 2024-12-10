package com.example.tictactoeonline

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object GameData {

    private var GameModel: MutableLiveData<GameModel> = MutableLiveData()
    var gameModel: LiveData<GameModel> = GameModel


    fun savGameModel(model: GameModel) {
        GameModel.postValue(model)
    }
}