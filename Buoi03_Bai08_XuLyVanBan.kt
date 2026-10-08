// Nguyen Ngoc Yen Nhi - 25810030
fun vietHoa(text: String): String {
    return text.uppercase()
}

fun xuLyVanBan(
    text: String,
    xuLy: (String) -> String
): String {
    return xuLy(text)
}

fun main() {
    val ketQua1 = xuLyVanBan("xin chao kotlin") {
        it.uppercase()
    }

    val ketQua2 = xuLyVanBan("hello world", ::vietHoa)

    val ketQua3 = xuLyVanBan("hoc lap trinh") {
        it.reversed()
    }

    println("Cách 1: $ketQua1")
    println("Cách 2: $ketQua2")
    println("Cách 3: $ketQua3")
}