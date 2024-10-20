package com.task.forecastutilis

import java.text.SimpleDateFormat
import java.util.Locale
import java.util.Date

fun Long.toFormattedDate(pattern: String = "yyyy-MM-dd HH:mm"): String {
    val sdf = SimpleDateFormat(pattern, Locale.getDefault())
    return sdf.format(Date(this * 1000))
}

fun Double.toCelsius(): Double {
    return (this - 32) * 5 / 9
}
