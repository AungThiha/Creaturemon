package com.raywenderlich.android.creaturemon.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.raywenderlich.android.creaturemon.model.Creature
import com.raywenderlich.android.creaturemon.model.CreatureRepository
import com.raywenderlich.android.creaturemon.model.room.RoomRepository

class AllCreaturesViewModel(
    private val creatureRepository: CreatureRepository = RoomRepository()
) : ViewModel() {

  private val allCreaturesLiveData = creatureRepository.getAllCreatures()

  fun getAllCreaturesLiveData(): LiveData<List<Creature>> = allCreaturesLiveData

  fun clearAllCreatures() = creatureRepository.clearAllCreatures()

}