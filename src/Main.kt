import java.util.*
//для 4 задания
fun factorial(n: Int): Int {
    return if (n == 0)
        1
    else
        n * factorial(n - 1)
}
// задание 5
fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}
//задание 7
fun fibonacci(x: Int) {
    var a = 0
    var b = 1
    var c = 0
    println("число фиббоначи $x:")
    while (c <= x) {
        print("$c ")
        a = b
        b = c
        c = a + b
    }
}
// задание 8
fun gcd(a: Int, b: Int): Int {
    var x1 = a
    var y = b
    while (y != 0) {
        val temp = y
        y = x1 % y
        x1 = temp
    }
    return x1
}
//20 задание
fun gd20(number20: Int): Boolean {
    if (number20 <= 1) {
        return false
    }
    for (i in 2 until number20) {
        if (number20 % i == 0) {
            return false
        }
    }
    return true
}
//24 задание
fun transpose(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val rows = matrix.size
    val cols = matrix[0].size
    val transposed = Array(cols) { Array(rows) { 0 } }
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            transposed[j][i] = matrix[i][j]
        }
    }
    return transposed
}
//11 задание
fun areAnagrams(str1: String, str2: String): Boolean {
    val cleanedStr1 = str1.replace(" ", "").toLowerCase()
    val cleanedStr2 = str2.replace(" ", "").toLowerCase()
    return cleanedStr1.toCharArray().sortedArray().contentEquals(cleanedStr2.toCharArray().sortedArray())
}
val scan =Scanner(System.`in`)
fun main(args: Array<String>) {
    print("Задание 1: \n")
    for(i in 0..10)
        print("$i, ")
    print("\n\nЗадание 2: \n")
    for(j in 0..20)
        if(j%2==0)
            print("$j, ")
    print("\n\nЗадание 3: \n")
    println("введите число: ")
    val a = scan.nextInt()
    for(o in 0..a)
        print("$o, ")
    print("\n\nЗадание 4: \n")
    println("введите число: ")
    val gd4 = scan.nextInt()
    val result = factorial(gd4)
    print("факториал числа $gd4 = $result")
    print("\n\nЗадание 5: \n")
    println("введите число: ")
    val gd5 = scan.nextInt()
    if (isPrime(gd5))
        println("$gd5 являяется простым числом")
    else
        println("$gd5 НЕ является простым числом")
    print("\n\nЗадание 6: \n")
    for(t1 in 1..10){
        println()
        for(t2 in 1..10){
            var t3 = t1*t2
            println("$t1 * $t2 = $t3")
        }
    }
    print("\n\nЗадание 7: \n")
    println("введите число: ")
    val x = scan.nextInt()
    fibonacci(x)
    print("\n\nЗадание 8: \n")
    println("Введите два числа:")
    val num1 = scan.nextInt()
    val num2 = scan.nextInt()
    val result1 = gcd(num1, num2)
    println("наибольший общий делитель чисел $num1 и $num2 равен $result1")
    print("\n\nЗадание 9: \n")
    println("введите строку:")
    val stroka = readLine()
    if (stroka != null) {
        val obratno = stroka.reversed()
        println("строка в обратном порядке: $obratno")
    } else {
        println("ошибка ввода")
    }
    print("\n\nЗадание 10: \n")
    println("Введите число:")
    var num10 = scan.nextInt()
    var res10 =1
    var res11 =0
    for(k in 2..num10){
        res11 = res10+k
    }
    print("сумма всех цифр числа $num10 = $res11")
    print("\n\nЗадание 11: \n")
    println("введите первую строку:")
    val string1 = readLine() ?: ""
    println("введите вторую строку:")
    val string2 = readLine() ?: ""
    if (areAnagrams(string1, string2)) {
        println("строки являются анаграммами.")
    } else {
        println("строки не являются анаграммами.")
    }
    print("\n\nЗадание 12: \n")
    print("введите число ОТ: ")
    var num11 = scan.nextInt()
    print("введите число ДО: ")
    var num112 = scan.nextInt()
    print("введите ШАГ: \n")
    var num113 = scan.nextInt()
    for(i in num11..num112 step num113 ){
        print("$i ")
    }
    print("\n\nЗадание 13: \n")
    for(e in 1..20){
        print("$e^2 = ")
        println(e*e)
    }
    print("\n\nЗадание 14: \n")
    for(vvv in 0..10 ) {
        val rnds = (0..100).random()
        print("$rnds ")
    }
    print("\n\nЗадание 15: \n")
    print("\n\nЗадание 16: \n")
    print("введите слово: ")
    val gdpo = readLine()
    if (gdpo != null) {
        val gdpop = gdpo.reversed()
        if (gdpo == gdpop) {
            print("это палиндром")
        }else
            print("это не палиндром")
    }
    print("\n\nЗадание 17: \n")
    print("введите слово: ")
    val gd17 = readLine()
    if (gd17 != null) {
        for(hhh in gd17){
            print(hhh)
            Thread.sleep(500L)
        }
    }
    print("\n\nЗадание 18: \n")
    println("введите высоту пирамиды: ")
    val gd18 = '#'
    var num18 = scan.nextInt()
    for(kkk in 1..num18){
        println()
        for(kkk2 in 1..kkk) {
            print(gd18)
        }
    }
    print("\n\nЗадание 19: \n")
    println("список номер 1: ")
    val array19 = IntArray(10) // создаем массив размером 10
    for (i in 0 until array19.size){
        array19[i]  = scan.nextInt()
    }
    println("отсортированный список: ")
    print(array19.sorted())
    print("\n\nЗадание 20: \n")
    print("введите число ОТ: ")
    var num191 = scan.nextInt()
    print("введите число ДО: ")
    var num192 = scan.nextInt()
    for(eee in num191..num192){
        if(gd20(eee)){
            print("$eee ")
        }
    }
    print("\n\nЗадание 21: \n")
    println("введите год: ")
    var num21 = scan.nextInt()
    print("введите месяц цифрой: ")
    var num212 = scan.nextInt()
    if (num21%4 == 0) {
        if (num212 == 2) {
            println("год высокосный. ")
            for(bbb in 1..29){
                print("$bbb ")
            }
        }
    }
    if(num21%4 !== 0)
        println("год НЕ высокосный")
    when (num212) {
        1 -> {
            for (i in 1..31)
                print("$i ")
        }
        3 -> {
            for(i in 1..31)
                print("$i ")
        }
        4 -> {
            for(i in 1..30  )
                print("$i ")
        }
        5 -> {
            for(i in 1..31)
                print("$i ")
        }
        6 -> {
            for(i in 1..30)
                print("$i ")
        }
        7 -> {
            for(i in 1..31)
                print("$i ")
        }
        8 -> {
            for(i in 1..31)
                print("$i ")
        }
        9 -> {
            for(i in 1..30)
                print("$i ")
        }
        10 -> {
            for(i in 1..31)
                print("$i ")
        }
        11 -> {
            for(i in 1..30)
                print("$i ")
        }
        12 -> {
            for(i in 1..31)
                print("$i ")
        }
    }
    print("\n\nЗадание 22: \n")
    println("угадайте число от 1 до 100: ")
    var num22 = scan.nextInt()
    val rnds22 = (0..100).random()
    if(num22 == rnds22)
        print("вы угадали!")
    else
        print("вы не угадали. было число $rnds22")
    print("\n\nЗадание 23: \n")
    while (true) {
        println("введите первую цифру (или 'стоп' для завершения):")
        val input1 = readLine()
        if (input1 == "стоп") break
        println("введите вторую цифру (или 'стоп' для завершения):")
        val input2 = readLine()
        if (input2 == "стоп") break
        val num231 = input1?.toDoubleOrNull()
        val num232 = input2?.toDoubleOrNull()
        if (num231 == null || num232 == null) {
            println("ошибка: введите корректные числовые значения.")
            continue
        }
        println("выберите операцию: 1 - сложение, 2 - умножение:")
        val operation = readLine()
        when (operation) {
            "1" -> {
                val result23 = num231 + num232
                println("результат сложения: $result23")
            }
            "2" -> {
                val result23 = num231 * num232
                println("результат умножения: $result23")
            }
            else -> {
                println("ошибка: выберите 1 для сложения или 2 для умножения.")
            }
        }
    }
    print("\n\nЗадание 24: \n")
    val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    val transposedMatrix = transpose(matrix)
    for (row in transposedMatrix) {
        println(row.joinToString(" "))
    }
    print("\n\nЗадание 25: \n")
    for(i in 1..10){
        print("i^3 = ")
        println((i*i)*i)
    }
    print("\n\nЗадание 26: \n")
    println("введите число N:")
    val n = readLine()?.toIntOrNull() ?: return println("некорректный ввод")
    var evenSum = 0
    var oddSum = 0
    for (i26 in 1..n) {
        if (i26 % 2 == 0) {
            evenSum += i26
        } else {
            oddSum += i26
        }
    }
    println("сумма четных чисел от 1 до $n: $evenSum")
    println("сумма нечетных чисел от 1 до $n: $oddSum")
    print("\n\nЗадание 27: \n")
    println("введите число N:")
    val n27 = readLine()?.toIntOrNull() ?: return
    for (i27 in 1..n27) {
        repeat(n27 - i27) { print(" ") }
        for (j27 in 1..i27) {
            print("$j27 ")
        }
        println()
    }
    print("\n\nЗадание 28: \n")
    println("введите количество чисел N:")
    val n28 = readLine()?.toIntOrNull() ?: return
    val numbers28 = mutableListOf<Int>()
    println("введите $n28 чисел:")
    for (i28 in 1..n) {
        val number28 = readLine()?.toIntOrNull()
    }
    numbers28.sort()
    println("числа в порядке возрастания:")
    for (number28 in numbers28) {
        print("$number28 ")
    }
    print("\n\nЗадание 29: \n")
    println("введите число N:")
    val n29 = readLine()?.toIntOrNull() ?: return
    var sum29 = 0.0
    for (i29 in 1..n) {
        sum29 += 1.0 / i29
    }
    println("сумма ряда 1 + 1/2 + 1/3 + ... + 1/$n29 равна: $sum29")
    print("\n\nЗадание 30: \n")
    println("Введите целое число:")
    val number30 = readLine()?.toIntOrNull() ?: return
    val binaryString30 = number30.toString(2)
    println("Двоичное представление числа $number30: $binaryString30")
}
