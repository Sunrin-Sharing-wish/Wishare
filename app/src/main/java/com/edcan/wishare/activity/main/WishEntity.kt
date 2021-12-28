package com.edcan.wishare.activity.main

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WishEntity (
    @PrimaryKey var id : Int,
    var wish: String)