package ru.otus.coroutines.first

class SomePresenter {

    /**
     * 1. Реализуйте получение данных из метода BlockingRepository#getHeavyData
     * 2. Если BlockingRepository#getHeavyData не ответит в течение 5 секунд, необходимо
     * заэмитить в LiveData/StateFlow объект Error
     * 3. При успешном сценарии пробросьте в в LiveData/StateFlow объект Success
     */
    fun populateHeavyData() {}


    sealed interface Result
    data object Success : Result
    data class Error(val exception: Exception) : Result
}