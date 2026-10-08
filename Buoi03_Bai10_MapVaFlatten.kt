// Nguyen Ngoc Yen Nhi - 25810030
fun main() {
    val danhSachSo = listOf(1, 2, 3, 4, 5)

    val ketQuaMap = danhSachSo.map {
        it * 2
    }

    println("Kết quả sau khi dùng map:")
    println(ketQuaMap)

    val danhSachLongNhau = listOf(
        listOf(1, 2, 3),
        listOf(4, 5),
        listOf(6, 7, 8)
    )

    val ketQuaFlatten = danhSachLongNhau.flatten()

    println()
    println("Danh sách ban đầu:")
    println(danhSachLongNhau)

    println("Kết quả sau khi dùng flatten:")
    println(ketQuaFlatten)
}