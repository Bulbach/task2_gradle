# Задание.

1. Проект должен быть совместим с java 17.
2. Создать файл.jar, например, «utils-1.3.5.jar».
3. Манифест файл должен содержать имя и версию вашего .jar файла.  
4. В вашем .jar файле должен быть class StringUtils с методом boolean isPositiveNumber(String str).
5. Написать один unit test для проверки этого метода (использовать JUnit 5).

# Дополнительно.
1. Создать мульти-модульный проект с двумя модулями: core, api.
2. В модуле core должен быть class Utils с методом boolean isAllPositiveNumbers(String… str).
3. Использовать utils-1.3.5.jar сделанный на предыдущих этапах, для возможности переиспользовать 
   метод boolean isPositiveNumber(String str) в модуле core. 
4. В модуле api должен быть class App с методом main. .
5. Из модуля api в методе main вызвать Utils.isAllPositiveNumbers("12", "79").
6. Написать один unit test для проверки этого метода boolean isAllPositiveNumbers(String… str)(использовать JUnit 5).