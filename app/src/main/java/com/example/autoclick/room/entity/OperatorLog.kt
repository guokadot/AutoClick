package com.example.autoclick.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_operator_log")
data class OperatorLog(
    val rawX: Int,
    val rawY: Int,
    val delayMs: Long = 200,
    val optType: Int =1,
    val toX: Int =0,
    val toY:Int =0,
    var isTemp: Int = -1,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)