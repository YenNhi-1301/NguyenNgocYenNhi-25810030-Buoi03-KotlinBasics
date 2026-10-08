// Nguyen Ngoc Yen Nhi - 25810030
fun main() {
    val danhSachNhacCu = listOf(
        "Piano",
        "Guitar",
        "Violin",
        "Piano điện",
        "Trống",
        "Panh Flute"
    )

    val ketQuaEager = danhSachNhacCu.filter {
        it.startsWith("P")
    }

    println("Kết quả lọc thông thường:")
    println(ketQuaEager)

    val ketQuaLazy = danhSachNhacCu
        .asSequence()
        .filter {
            it.startsWith("P")
        }
        .toList()

    println()
    println("Kết quả lọc qua Sequence:")
    println(ketQuaLazy)

    // Sequence phù hợp khi xử lý danh sách lớn hoặc có nhiều bước xử lý liên tiếp.
}