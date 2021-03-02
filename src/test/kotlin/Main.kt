import java.beans.Expression
import java.lang.Exception

fun main() {
    while (true) {
        val onePeople = "человеку"
        val morePeople = "людям"
        print("Введите количество лайков (end чтобы завершить программу):")
        var input = readLine()
        if (input == "end") break
        try {
            var likes: Int = input?.toInt() ?: 0
            if ((likes % 10 == 1) && likes != 11) {
                println("Вы понравились $likes $onePeople")
            } else {
                println("Вы понравились $likes $morePeople")
            }
        } catch (e: Exception) {
            println("Вы ввели не число, повторите действие.")
        }

    }
    print("Спасибо! Возвращайтесь к нам скорее")
}