package com.sparro.loginapplication.model.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sparro.loginapplication.model.UserDto

@Database(entities = arrayOf(UserDto::class), version = 1)
abstract class ApplicationDatabase : RoomDatabase() {

}