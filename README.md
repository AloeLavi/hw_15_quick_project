# Проект по автоматизации тестирования веб-приложения МойСклад

## :page_with_curl:	Содержание

- [Технологии и инструменты](#rocket-технологии-и-инструменты)
- [Реализованные проверки]
- [Сборка в Jenkins]
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Allure отчет](#-allure-отчет)
- [Отчет в Telegram](#-уведомления-в-telegram-с-использованием-бота)
- [Видеопримеры прохождения тестов](#-уведомления-в-telegram-с-использованием-бота)

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

## 	:computer: Запуск тестов из терминала

### :house_with_garden:	Локальный запуск тестов

```
gradle clean test
```

### :earth_asia: Удаленный запуск тестов
```
clean
test
-Dbrowser=${browser}
-DbrowserVersion=${browserVersion}
-DbrowserSize=${browserSize}
-Dremote=${remoteUrl}
```

### :clipboard:	Параметры сборки

>
> <code>browser</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>browserVersion</code> – версия браузера, в которой будут выполняться тесты (_по умолчанию - <code>100</code>_).
>
> <code>browserSize</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1440x1080</code>_).
> 
> <code>remoteUrl</code> – адрес удаленного сервера, на котором будут запускаться тесты.


## <img src="images/logo/allure.png" width="25" height="25"  alt="Allure"/></a> Allure отчет

### Главная страница Allure-отчета
<p align="center">
<img title="allure_main" src="images/pictures/allure_main.png">
</p>

### Страница отдельного теста

<p align="center">
<img title="allure_test" src="images/pictures/allure test.png">
</p>

## <img src="images/logo/telegram.png" width="25" height="25"  alt="Telegram"/></a> Уведомления в Telegram с использованием бота

<p align="center">
<img title="Telegram Notifications" src="images/pictures/telegram.png">
</p>

## :clapper: Пример видео выполнения теста в Selenoid

> К каждому тесту в отчете прилагается видео. Пример такого видео:
<p align="center">
  <img title="Selenoid Video" src="images/video/test.gif">
</p>