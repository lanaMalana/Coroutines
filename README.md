### Задание 1

Реализуйте функцию populateHeavyData в классе SomePresenter
1. Реализуйте получение данных из метода BlockingRepository#getHeavyData
2. Если BlockingRepository#getHeavyData не ответит в течение 5 секунд, необходимо заэмитить в LiveData/StateFlow объект Error
3. При успешном сценарии пробросьте в в LiveData/StateFlow объект Success

### Задание 2

Реализуйте функцию populateCats в классе CatsViewModel
1. Реализуйте 2 параллельных http запроса на ендпоинты https://api.thecatapi.com/v1/images/search и https://catfact.ninja/fact
2. Обработайте возможные исключения:
   * если выпал SocketTimeoutException - повторите запрос, количество попыток = 3,покажите Toast с текстом "Something went wrong"
   * если выпало другое исключение - покажите Toast с текстом "Something went wrong"
3. Успешный результат необходим прокинуь дальше через LiveData/StateFlow и отрендерить полученные данные
