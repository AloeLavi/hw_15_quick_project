# Проект по автоматизации тестирования веб-приложения МойСклад

## :page_with_curl:	Содержание

## :rocket: Технологии и инструменты

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/idea.png">
<img width="6%" title="Java" src="images/logo/java.png">
<img width="6%" title="Selenide" src="images/logo/selenide.png">
<img width="6%" title="Allure Report" src="images/logo/allure.png">
<img width="6%" title="Gradle" src="images/logo/gradle.png">
<img width="6%" title="JUnit5" src="images/logo/junit5.png">
<img width="6%" title="GitHub" src="images/logo/github.png">
<img width="6%" title="Jenkins" src="images/logo/jenkins.png">
<img width="6%" title="Telegram" src="images/logo/telegram.png">
</p>

## 	Запуск тестов из терминала

### Локальный запуск тестов

```
gradle clean test
```

### Удаленный запуск тестов
```
clean
test
-Dbrowser=${browser}
-DbrowserVersion=${browserVersion}
-DbrowserSize=${browserSize}
-Dremote=${remoteUrl}
```

### Параметры сборки

>
> <code>browser</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>browserVersion</code> – версия браузера, в которой будут выполняться тесты (_по умолчанию - <code>100</code>_).
>
> <code>browserSize</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1440x1080</code>_).
> 
>> <code>remoteUrl</code> – адрес удаленного сервера, на котором будут запускаться тесты.


## Allure отчет

### Главная страница Allure-отчета

### Страница отдельного теста

## Уведомления в Telegram с использованием бота

<p align="center">
<img title="Telegram Notifications" src="images/pictures/telegram.png">
</p>

## Пример видео выполнения теста в Selenoid
