package com.example.tmdb.ui.views.saved

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tmdb.domain.interactors.SavedMediaInteractor
import com.example.tmdb.ui.models.UIMedia
import com.example.tmdb.ui.utils.LiveDataStatus
import com.example.tmdb.ui.utils.MutableLiveDataStatus
import kotlinx.coroutines.launch

class SavedViewModel @ViewModelInject constructor(private val savedMediaInteractor: SavedMediaInteractor) : ViewModel() {

    private var _savedMedia = MutableLiveDataStatus<List<UIMedia>>()
    val savedMedia: LiveDataStatus<List<UIMedia>> = _savedMedia

    init {
        _savedMedia.postLoading()
        viewModelScope.launch {
            try {
                val uiSavedMedia = savedMediaInteractor()
                if (uiSavedMedia.isNotEmpty()) {
                    _savedMedia.postSuccess(uiSavedMedia)
                } else {
                    _savedMedia.postEmpty()
                }
            } catch (e: Exception) {
                _savedMedia.postError(e)
            }
        }
    }
}