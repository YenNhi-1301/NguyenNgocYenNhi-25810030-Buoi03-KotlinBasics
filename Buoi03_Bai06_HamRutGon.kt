// Nguyen Ngoc Yen Nhi - 25810030
fun binhPhuong(so: Int): Int {
    return so * so
}
fun binhPhuongRutGon(so: Int): Int = so * so

fun chuViHinhVuong(canh: Double): Double {
    return canh * 4
}
fun chuViHinhVuongRutGon(canh: Double): Double = canh * 4

fun laSoChan(so: Int): Boolean {
    return so % 2 == 0
}
fun laSoChanRutGon(so: Int): Boolean = so % 2 == 0

fun main() {
    val so = 5
    val canh = 4.0
    val soKiemTra = 8

    println("Bình phương của $so:")
    println("Cách đầy đủ: ${binhPhuong(so)}")
    println("Cách rút gọn: ${binhPhuongRutGon(so)}")

    println("----------------------")

    println("Chu vi hình vuông cạnh $canh:")
    println("Cách đầy đủ: ${chuViHinhVuong(canh)}")
    println("Cách rút gọn: ${chuViHinhVuongRutGon(canh)}")

    println("----------------------")

    println("Kiểm tra số $soKiemTra có phải số chẵn:")
    println("Cách đầy đủ: ${laSoChan(soKiemTra)}")
    println("Cách rút gọn: ${laSoChanRutGon(soKiemTra)}")
}