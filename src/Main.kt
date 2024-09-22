//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    //11.62. Известно число жителей, проживающих в каждом доме улицы. Нумерация
    //домов проведена подряд. Дома с нечетными номерами расположены на од-
    //ной стороне улицы, с четными — на другой. На какой стороне улицы проживает больше жителей?

//    val home = arrayOf(1, 2, 3, 4, 5, 6, 7)
//    val oddHome = mutableListOf<Int>() // Для изменения списка
//    val evenHome = mutableListOf<Int>() // Для изменения списка
//    for (even in home) {
//        if (even % 2 == 0) {
//            evenHome.add(even)
//        }
//    }
//    for  (odd in home) {
//        if (odd %2 !=0){
//            oddHome.add(odd)
//        }
//    }
//
//    val odd1 = oddHome.size
//    val even1 = evenHome.size
//    when {odd1 > even1 ->
//    println("Нечетных больше")
//    odd1 < even1 ->
//    println("Четных больше")}
//    println("$oddHome не четные, $evenHome четные")
    //12.59. В зрительном зале 23 ряда, в каждом из которых 40 мест (кресел). Информа-
    //ция о проданных билетах хранится в двумерном массиве, номера строк кото-
    //рого соответствуют номерам рядов, а номера столбцов — номерам мест. Ес-
    //ли билет на то или иное место продан, то соответствующий элемент массива
    //имеет значение 1, в противном случае — 0. Определить общее число свобод-
    //ных мест в зрительном зале.

    val rows = 24
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
