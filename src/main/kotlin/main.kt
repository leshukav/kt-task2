import kotlin.math.abs

fun main() {
// Задача №1 - Денежные переводы
    val amount = 25_000
    val result = if ((amount * 0.75 / 100) < 35) 35 else (amount * 0.75 / 100)
    println("Комиссия за перевод =  $result ")
    println()

// Задача №2 - "Люди/Человеки"
    val likes = 124
    var like = abs(likes) % 100
    if (like >= 11 && like <= 19) {
        println("Вас лайкнили  $likes человек")
    } else {
        like = like % 10
        if (like == 1) {
            println("Вас лайкнил  $likes человек")
        } else if (like > 1 && like < 5) {
            println("Вас лайкнили  $likes человека")
        } else {
            println("Вас лайкнили  $likes человек")
        }
    }
    println()

// Задача №3 - "Меломан"
    val summa = 23500.00
    var discount: Double
    var finalDiscount: Double
    if (summa < 1000) {
        finalDiscount = summa - (summa * 1 / 100)
        println(
            """  Сумма покупки  $summa рублей
                 Сумма для постоянных клиентов 1% скидки  $finalDiscount рублей         
        """.trimIndent()
        )
    }
    if (summa > 1000 && summa < 10_000) {
        discount = summa - 100
        finalDiscount = discount - (discount * 1 / 100)
        println(
            """Сумма покупки  $summa  рублей
           | Сумма со скидкой  $discount рублей
           | Сумма для постоянных клиентов 1% скидки  $finalDiscount рублей
       """.trimMargin()
        )
    }

    if (summa > 10_000) {
        discount = summa - (summa * 5 / 100)
        finalDiscount = discount - (discount * 1 / 100)
        println(
            """Сумма покупки  $summa  рублей
           | Сумма после применения 5% скидки  $discount рублей
           | Сумма для постоянных клиентов 1% скидки  $finalDiscount рублей
       """.trimMargin()
        )
    }
}