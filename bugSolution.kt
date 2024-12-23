fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        if (element % 2 == 0) {
            iterator.remove()
        }
    }
    println(list)
}