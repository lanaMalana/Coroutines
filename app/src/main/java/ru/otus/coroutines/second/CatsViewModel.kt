package ru.otus.coroutines.second

import androidx.lifecycle.ViewModel

class CatsViewModel : ViewModel() {


    /**
     * Реализуйте функцию populateCats следующим образом:
     * 1. Реализуйте 2 параллельных http запроса на ендпоинты https://api.thecatapi.com/v1/images/search и https://catfact.ninja/fact
     * 2. Обработайте возможные исключения:
     *    а) если выпал SocketTimeoutException - повторите запрос, количество попыток = 3,покажите Toast с текстом "Something went wrong"
     *    b) если выпало другое исключение - покажите Toast с текстом "Something went wrong"
     * 3. Успешный результат необходим прокинуь дальше через LiveData/StateFlow и отрендерить полученные данные
     */
    fun populateCats(){}
}