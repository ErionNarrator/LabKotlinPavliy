//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    //11.62. Известно число жителей, проживающих в каждом доме улицы. Нумерация
    //домов проведена подряд. Дома с нечетными номерами расположены на од-
    //ной стороне улицы, с четными — на другой. На какой стороне улицы проживает больше жителей?

   val size = 10
    val residents = IntArray(size) { Random.nextInt(1, 10) }
    var oddSum = 0
    var evenSum = 0
    for (i in residents.indices)
    {     if (i % 2 == 0) {
        oddSum += residents[i]     }
    else {
        evenSum += residents[i]     }
    }
    when {     
        oddSum > evenSum -> println("На нечетной стороне больше жителей.")
        evenSum > oddSum -> println("На четной стороне больше жителей.")    
        else -> println("На обеих сторонах одинаковое количество жителей.")
    }
    //12.59. В зрительном зале 23 ряда, в каждом из которых 40 мест (кресел). Информа-
    //ция о проданных билетах хранится в двумерном массиве, номера строк кото-
    //рого соответствуют номерам рядов, а номера столбцов — номерам мест. Ес-
    //ли билет на то или иное место продан, то соответствующий элемент массива
    //имеет значение 1, в противном случае — 0. Определить общее число свобод-
    //ных мест в зрительном зале.

    val rows = 23
    val clos = 40

    val  arr = Array(rows) { IntArray(clos) {(0..1).random()} }
    for (row in arr) {
        println(row.contentToString())}

    var zerpCount = 0
    for (row in arr) {
        for (element in row) {
            if (element == 0) {
                zerpCount++
            }
        }
    }
    println("Сводобных мест: $zerpCount")

}
