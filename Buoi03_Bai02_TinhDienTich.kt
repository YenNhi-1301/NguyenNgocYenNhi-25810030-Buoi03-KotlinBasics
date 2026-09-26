// Nguyen Ngoc Yen Nhi - 25810030
fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

val dienTich1: Double = tinhDienTich(5.0, 3.0)
val dienTich2: Double = tinhDienTich(8.0, 4.0)

fun main() {
    println("Diện tích hình chữ nhật 1: $dienTich1")
    println("Diện tích hình chữ nhật 2: $dienTich2")
}