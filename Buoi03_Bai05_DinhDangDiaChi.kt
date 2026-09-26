// Nguyen Ngoc Yen Nhi - 25810030
fun dinhDangDiaChi(
    tenNguoiNhan: String,
    soNhaDuong: String,
    phuong: String = "Phường chưa xác định",
    quan: String = "Quận chưa xác định",
    thanhPho: String = "TP. Hồ Chí Minh",
    ghiChu: String = "Không có"
) {
    println("Tên người nhận: $tenNguoiNhan")
    println("Địa chỉ: $soNhaDuong")
    println("Phường: $phuong")
    println("Quận: $quan")
    println("Thành phố: $thanhPho")
    println("Ghi chú: $ghiChu")
}

fun main() {
    dinhDangDiaChi(
        tenNguoiNhan = "Nguyễn Ngọc Yến Nhi",
        soNhaDuong = "40 Đường 147",
        phuong = "Phường Phước Long",
        quan = "Quận 9",
        thanhPho = "TP. Hồ Chí Minh",
        ghiChu = "Giao giờ hành chính"
    )
}