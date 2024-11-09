package ru.otus.coroutines.first

import androidx.annotation.WorkerThread
import kotlin.random.Random

class BlockingRepository {

    @WorkerThread
    fun getHeavyData() {
        Thread.sleep(Random.nextInt(10) * 1000L)
    }
}