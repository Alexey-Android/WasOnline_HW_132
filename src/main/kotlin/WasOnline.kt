package ru.netology

fun main() {

    agoToText(259199)

    /*  var secondsAgo = 1
      while (secondsAgo < 3601) {
          agoToText(secondsAgo)
          secondsAgo = secondsAgo + 1
      }*/
}

fun agoToText(secondsAgo: Int) {
    when (secondsAgo) {
        in 0 until 60 -> println("Был(а) в сети только что")
        in 60 until 60 * 60 -> calcMinute(secondsAgo)
        in 60 * 60 until 24 * 60 * 60 -> calcHour(secondsAgo)
        in 24 * 60 * 60 until 2 * 24 * 60 * 60 -> println("Был(а) в сети сегодня")
        in 2 * 24 * 60 * 60 until 3 * 24 * 60 * 60 -> println("Был(а) в сети вчера")
        else -> println("Был(а) в сети давно")
    }
}

fun calcMinute(secondsAgo: Int) {
    when (val minutesAgo = secondsAgo / 60) {
        1, 21, 31, 41, 51 -> println("Был(а) в сети $minutesAgo минуту назад")
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> println("Был(а) в сети $minutesAgo минуты назад")
        else -> println("Был(а) в сети $minutesAgo минут назад")
    }
}

fun calcHour(secondsAgo: Int) {
    when (val hoursAgo = secondsAgo / (60 * 60)) {
        1, 21 -> println("Был(а) в сети $hoursAgo час назад")
        2, 3, 4, 22, 23 -> println("Был(а) в сети $hoursAgo часа назад")
        else -> println("Был(а) в сети $hoursAgo часов назад")
    }
}