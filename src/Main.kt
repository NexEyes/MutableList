fun main() {
    val list = mutableListOf(
        "food",
        "chair",
        "clothes",
        "books"
    );
    list.add("drink")
    list[0] = "Burger"
    list.remove("chair")
    list.removeAt(3)

    println(list)
}
