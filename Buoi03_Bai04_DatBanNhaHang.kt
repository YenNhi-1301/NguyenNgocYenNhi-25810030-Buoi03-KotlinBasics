// Nguyen Ngoc Yen Nhi - 25810030
fun datBan(
    tenKhach: String,
    soLuongKhach: Int,
    loaiBan: String = "Bàn thường"
) {
    println("Khách hàng: $tenKhach")
    println("Số lượng khách: $soLuongKhach")
    println("Loại bàn: $loaiBan")
    println("----------------------")
}

fun main() {

    datBan("Nguyễn Ngọc Yến Nhi", 4)

    datBan("Nguyễn Văn An", 2, "Bàn VIP")

    datBan(
        tenKhach = "Trần Minh Anh",
        soLuongKhach = 6,
        loaiBan = "Bàn ngoài trời"
    )
}