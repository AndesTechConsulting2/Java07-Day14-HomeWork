# Java07-Day14-HomeWork
Домашняя работа на выходные

Использовать TestNG, maven, IntelliJIdea IDE, jdk8.

1. создать новый maven проект. Убрать завичимость JUnit,  добавить зависимость TestNG.

2. Добавить в проект конфиг. файл testng.xml

3. Отредактировать pom.xml для использования testng.xml и параметров запуска (например,чтобы работала команда: mvn test -Dmy.suite=testng5.xml)

4. Создать сьют SiteTest, и в нём тест
SiteLoginTest.

5. В одном или нескольких тестовых классах создать тестовые кэйсы, перечисленные ниже, с сохранением порядка вызова: 

loginTest

profileTest

pageTestCase01
pageTestCase02
pageTestCase03

logoffTest
   
6. Тесты pageTestCase01, pageTestCase02, pageTestCase03 находятся в группе pageTests

7. Тесты  profileTest, pageTestCase0*, logoffTest
   должны быть зависимы от теста loginTest. Т.е., например, при фэйле теста loginTest, ниже перечисленные тесты должны быть пропущены.

8. Тесты в группе pageTests, должны выполнятся параллельно.


9. При выполнении любого тестового метода выводить в консоль его имя и имя теста.

10. В каждом тесте разместить простой метод Assert.assertTrue

11. Запустить тесты на выполнение. Проверить результаты, в зависимости от успешности теста loginTest.

12. Запустить тесты из командной строки, используя maven.

13. Проанализировать xml и html отчёты.

 
   
   

