package com.example.github.ui.favorite

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.github.data.local.FavoriteUser
import com.example.github.data.local.FavoriteUserDao
import com.example.github.data.local.UserDatabase

class FavoriteViewModel(application: Application): AndroidViewModel(application) {

    private var userDao: FavoriteUserDao?
    private var userDb: UserDatabase?

    init {
        userDb = UserDatabase.getDatabase(application)
        userDao = userDb?.favoriteUserDao()
    }

    fun getFavoriteUser(): LiveData<List<FavoriteUser>>? {
        return userDao?.getFavoriteUser()
    }
}